# Section1


## 뷰의 기본 개념
### 뷰의 중요 속성
View: 안드로이드에서 눈에 보이는 모든 요소. 위젯과 레이아웃으로 나뉜다.<br>
Layout: 화면을 구성할 때 뷰가 배치되는 모양<br>
id: xml이나 코드에서 뷰를 지칭하기 위해 사용하는 속성<br>
layout_width: 뷰의 가로 길이<br>
layout_height: 뷰의 세로 길이<br>
mrgin: 뷰의 외부 여백<br>
padding: 뷰의 내부 여백<br>
layout_gravity: 뷰의 위치 정렬<br>
gravity: 뷰 내부의 정렬<br>
background: 뷰의 배경 지정<br>

## LinearLayout
: 좌에서 우, 위에서 아래 방향으로 뷰를 배치하는 레이아웃

orientation: 뷰가 배치될 방향<br>
weight: Linear Layout에 배치된 뷰의 속성. 배치후 남은 공간을 할당 받을 비율을 설정<br>

## RelativeLayout
: 안에 들어있는 뷰들 간의 관계를 설정하여 배치하는 레이아웃
배치된 뷰들에게 속성이 추가된다.<br>

### 부모와의 관계
alignParentTop: 뷰의 상단을 부모의 상단에 맞춘다.<br>
alignParentBottom: 뷰의 하단을 부모의 하단에 맞춘다.<br>
alignParentLeft: 뷰의 좌측을 부모의 좌측에 맞춘다.<br>
alignParentRight: 뷰의 우측을 부모의 우측에 맞춘다.<br>

centerHorizontal: 뷰의 가로 중앙을 부모의 가로 중앙에 맞춘다.<br>
centerVertical: 뷰의 세로 중앙을 부모의 세로 중앙에 맞춘다.<br>
centerInParent: 뷰의 중앙을 부모의 중앙에 맞춘다.<br>

### 다른 뷰와의 관계
below: 지정된 뷰 하단에 위치<br>
above: 지정된 뷰 상단에 위치<br>
toRightOf: 지정된 뷰 우측에 위치<br>
toLeftOf: 지정된 뷰 좌측에 위치<br>
baseline: 지정된 뷰의 베이스라인에 맞춤<br>

## TextView
## Button
## Check box
## Radio Button
## Progress Bar
## SeekBar
## EditText
## imageView
