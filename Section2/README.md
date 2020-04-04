# Section2
## AdapterView
: 뷰를 구성하기 위해 개발자가 코드를 통해 결정해줘야하는 항목이 있는 뷰

### List View
: 여러 항목들을 제공하고 위 아래로 스크롤하여 항목을 보여주는 뷰이다

- adapter: 리스트뷰를 구성하기 위한 어뎁터 객체를 설정

- OnItemClickListener: 리스트 뷰의 항목을 터치하면 반응하는 리스너


### CustomListView
: 리스트뷰를 구성할 때 항목 하나의 모양을 개발자가 직접 만들어 사용할 수 있다.

- 항목 하나에 배치된 뷰 중 값을 설정할 뷰가 텍스트뷰 하나일 경우 ArrayAdapter를 사용한다.
- 항목 하나에 배치된 뷰 중 2개 이상의 뷰에 데이터를 셋팅할 경우 SimpleAdapter를 사용한다.

### Two LineListView
: 리스트뷰의 항목 하나에 두 가지 문자열을 보여줄 때 사용한다.

### Custom Adapter
: 리스트뷰를 사용할 때 특별한 기능을 추가해서 만들고 싶다면 Adapter 클래스를 직접 만들어 사용한다.

- Adapter 클래스를 만들 때는 BaseAdapter 클래스를 상속받아 작성한다.

- getCount: 리스트뷰 내의 전체 항목의 개수를 반환한다.
- getView: 리스트 뷰 항목  하나를 구성하여 반환한다.

### Spinner
: 사용자에게 항목을 주고 선택하게 할 수 있는 AdapterView

- OnItemSelectedListener: 스피너에서 항목을 선택했을 때 반응하는 리스너
- selectedItemPosition: 현재 선택되어 있는 항목의 인덱스 번호

### ViewPager
: 좌우로 스와이프 하며 View를 전환하는 AdapterView
- 화면이 바뀌는 것이 아닌 화면만한 뷰들이 전환되는 개념

- PagerAdapter를 구현하여 사용
- getCount: Viewpager로 보여줄 뷰의 전체 개수
- isViewFromObject: instantiateItem에서 만든 객체를 사용할 것인지의 여부 결정
- instantiateItem: ViewPager로 보여줄 뷰 객체를 반환
- destroyItem: ViewPager에서 뷰가 사라질 때 제거하는 작업
- OnPageChangeListener: View가 전환될 때 반응하는 리스너


#### AppCompat과 support
:하위 버전에서도 동작한다는 의미
