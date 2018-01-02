package net.escomic.sample.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import net.escomic.support.recyclerview.RecyclerViewItemClickListener;
import net.escomic.support.recyclerview.RecyclerViewItemLongClickListener;

public class MainActivity extends AppCompatActivity implements RecyclerViewItemClickListener, RecyclerViewItemLongClickListener{

    private SampleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new SampleAdapter(this);
        SampleData data;
        for (String d : DATA) {
            data = new SampleData();
            data.title = d;
            adapter.add(data);
        }

        adapter.setOnItemClickListener(this);
        adapter.setOnItemLongClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position, View view) {
        SampleData item = adapter.getItem(position);
        int viewId = view.getId();
        if (viewId == R.id.btn_share) {
            Toast.makeText(this, "click share button : " + item.title, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "click : " + item.title, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onItemLongClick(int position, View view) {
        SampleData item = adapter.getItem(position);
        Toast.makeText(this, "long click : " + item.title, Toast.LENGTH_SHORT).show();
    }

    private static final String[] DATA = {
            "이상해씨",
            "이상해풀",
            "이상해꽃",
            "파이리",
            "리자드",
            "리자몽",
            "꼬부기",
            "어니부기",
            "거북왕",
            "캐터피",
            "단데기",
            "버터플",
            "뿔충이",
            "딱충이",
            "독침붕",
            "구구",
            "피죤",
            "피죤투",
            "꼬렛",
            "레트라",
            "깨비참",
            "깨비드릴조",
            "아보",
            "아보크",
            "피카츄",
            "라이츄",
            "모래두지",
            "고지",
            "니드런♀",
            "니드리나",
            "니드퀸",
            "니드런♂",
            "니드리노",
            "니드킹",
            "삐삐",
            "픽시",
            "식스테일",
            "나인테일",
            "푸린",
            "푸크린",
            "주뱃",
            "골뱃",
            "뚜벅쵸",
            "냄새꼬",
            "라플레시아",
            "파라스",
            "파라섹트",
            "콘팡",
            "도나리",
            "디그다",
            "닥트리오",
            "나옹",
            "페르시온",
            "고라파덕",
            "골덕",
            "망키",
            "성원숭",
            "가디",
            "윈디",
            "발챙이",
            "슈륙챙이",
            "강챙이",
            "캐이시",
            "윤겔라",
            "후딘",
            "알통몬",
            "근육몬",
            "괴력몬",
            "모다피",
            "우츠동",
            "우츠보트",
            "왕눈해",
            "독파리",
            "꼬마돌",
            "데구리",
            "딱구리",
            "포니타",
            "날쌩마",
            "야돈",
            "야도란",
            "코일",
            "레어코일",
            "파오리",
            "두두",
            "두트리오",
            "쥬쥬",
            "쥬레곤",
            "질퍽이",
            "질뻐기",
            "셀러",
            "파르셀",
            "고오스",
            "고우스트",
            "팬텀",
            "롱스톤",
            "슬리프",
            "슬리퍼",
            "크랩",
            "킹크랩",
            "찌리리공",
            "붐볼",
            "아라리",
            "나시",
            "탕구리",
            "텅구리",
            "시라소몬",
            "홍수몬",
            "내루미",
            "또가스",
            "또도가스",
            "뿔카노",
            "코뿌리",
            "럭키",
            "덩쿠리",
            "캥카",
            "쏘드라",
            "시드라",
            "콘치",
            "왕콘치",
            "별가사리",
            "아쿠스타",
            "마임맨",
            "스라크",
            "루주라",
            "에레브",
            "마그마",
            "쁘사이저",
            "켄타로스",
            "잉어킹",
            "갸라도스",
            "라프라스",
            "메타몽",
            "이브이",
            "샤미드",
            "쥬피썬더",
            "부스터",
            "폴리곤",
            "암나이트",
            "암스타",
            "투구",
            "투구푸스",
            "프테라",
            "잠만보",
            "프리져",
            "썬더",
            "파이어",
            "미뇽",
            "신뇽",
            "망나뇽",
            "뮤츠",
            "뮤"
    };


}
