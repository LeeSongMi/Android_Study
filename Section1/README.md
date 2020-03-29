# Section1


## 뷰의 기본 개념
### 뷰의 중요 속성
View: 안드로이드에서 눈에 보이는 모든 요소. 위젯과 레이아웃으로 나뉜다.
Layout: 화면을 구성할 때 뷰가 배치되는 모양
id: xml이나 코드에서 뷰를 지칭하기 위해 사용하는 속성
layout_width: 뷰의 가로 길이
layout_height: 뷰의 세로 길이
mrgin: 뷰의 외부 여백
padding: 뷰의 내부 여백
layout_gravity: 뷰의 위치 정렬
gravity: 뷰 내부의 정렬
background: 뷰의 배경 지정

## LinearLayout
: 좌에서 우, 위에서 아래 방향으로 뷰를 배치하는 레이아웃

orientation: 뷰가 배치될 방향
weight: Linear Layout에 배치된 뷰의 속성. 배치후 남은 공간을 할당 받을 비율을 설정

## RelativeLayout
: 안에 들어있는 뷰들 간의 관계를 설정하여 배치하는 레이아웃
배치된 뷰들에게 속성이 추가된다.

### 부모와의 관계
alignParentTop: 뷰의 상단을 부모의 상단에 맞춘다.
alignParentBottom: 뷰의 하단을 부모의 하단에 맞춘다.
alignParentLeft: 뷰의 좌측을 부모의 좌측에 맞춘다.
alignParentRight: 뷰의 우측을 부모의 우측에 맞춘다.

centerHorizontal: 뷰의 가로 중앙을 부모의 가로 중앙에 맞춘다
centerVertical: 뷰의 세로 중앙을 부모의 세로 중앙에 맞춘다
centerInParent: 뷰의 중앙을 부모의 중앙에 맞춘다

### 다른 뷰와의 관계
below: 지정된 뷰 하단에 위치
above: 지정된 뷰 상단에 위치
toRightOf: 지정된 뷰 우측에 위치
toLeftOf: 지정된 뷰 좌측에 위치
baseline: 지정된 뷰의 베이스라인에 맞춤

## TextView
## Button
## Check box
## Radio Button
## Progress Bar
## SeekBar
## EditText
## imageView
