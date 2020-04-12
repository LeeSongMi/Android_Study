# Section3
## 안드로이드 메뉴
### Option Menu
: 화면당 하나씩 가질 수 있는 메뉴, 현재 액티비티의 메인 메뉴가 된다.

- onCreateOptionsMenu: 액티비티의 객체가 만들어 질 때 자동으로 호출되는 메서드, 여기에서 메뉴를 생성
-- 메서드가 true를 반환하면 메뉴가 나타난다.
- OnOptionsItemSelected: 사용자가 메뉴를 선택했을 때 호출되는 메서드

### Context Menu
: 화면에 배치된 뷰에 설정할 수 있는 메뉴
- 메뉴가 설정된 뷰를 길게 누르면 메뉴가 나타난다.

- registerForContext: 컨텍스트 메뉴를 등록하는 메서드
-- 메서드의 매개 변수로 넣어준 뷰 객체에 메뉴가 설정
- onCreateContextMenu: 뷰를 길게 누르면 호출되는 메서드
-- 여기에서 메뉴를 구성한다.
- onContextItemSelected: 사용자가 메뉴를 선택했을 때 호출되는 메서드

### PopupMenu
: 개발자가 원할 때 원하는 곳에 메뉴를 띄울 수 있다

- Menu: Popup Menu의 메뉴를 관리하는 객체
- OnMenuItemClickListener: 메뉴의 항목을 눌렀을 때 반응하는 리스너

### ActionMenu
: 화면 상단에 배치된 바 부분을 의미, OptionMenu 항목의 일부를 배치 가능

- OptionMenu를 사용하는 방법과 동일하면 ActionBar를 위한 속성을 설정
- Icon: ActionBar에 표시되는 아이콘 설정
- showAsAction: ActionBar 배치 여부를 결정
- actionViewClass: 접었다 폈다 할 때 나타날 뷰를 설정


#### ShowAsAction
- Never(기본): 메뉴를 ActionBar에 절대 표시하지 않는다
- Always: 항상 ActionBar에 표시
- ifRoom: 공간이 허락된다면 표시
- withText: title속성의 문자열과 함께 표시
- collapseActionView: 접었다 펼쳤다 하면서 뷰를 표시 가능
