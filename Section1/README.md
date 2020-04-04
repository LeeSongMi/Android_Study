# Section1


## 뷰의 기본 개념
### 뷰의 중요 속성
- View: 안드로이드에서 눈에 보이는 모든 요소. 위젯과 레이아웃으로 나뉜다.
- Layout: 화면을 구성할 때 뷰가 배치되는 모양
- id: xml이나 코드에서 뷰를 지칭하기 위해 사용하는 속성
- layout_width: 뷰의 가로 길이
- layout_height: 뷰의 세로 길이
- mrgin: 뷰의 외부 여백
- padding: 뷰의 내부 여백
- layout_gravity: 뷰의 위치 정렬
- gravity: 뷰 내부의 정렬
- background: 뷰의 배경 지정

## LinearLayout
: 좌에서 우, 위에서 아래 방향으로 뷰를 배치하는 레이아웃

- orientation: 뷰가 배치될 방향
- weight: Linear Layout에 배치된 뷰의 속성. 배치후 남은 공간을 할당 받을 비율을 설정

## RelativeLayout
: 안에 들어있는 뷰들 간의 관계를 설정하여 배치하는 레이아웃

- 배치된 뷰들에게 속성이 추가된다.

### 부모와의 관계
- alignParentTop: 뷰의 상단을 부모의 상단에 맞춘다.
- alignParentBottom: 뷰의 하단을 부모의 하단에 맞춘다.
- alignParentLeft: 뷰의 좌측을 부모의 좌측에 맞춘다.
- alignParentRight: 뷰의 우측을 부모의 우측에 맞춘다.

- centerHorizontal: 뷰의 가로 중앙을 부모의 가로 중앙에 맞춘다.
- centerVertical: 뷰의 세로 중앙을 부모의 세로 중앙에 맞춘다.
- centerInParent: 뷰의 중앙을 부모의 중앙에 맞춘다.

### 다른 뷰와의 관계
- below: 지정된 뷰 하단에 위치
- above: 지정된 뷰 상단에 위치
- toRightOf: 지정된 뷰 우측에 위치
- toLeftOf: 지정된 뷰 좌측에 위치
- baseline: 지정된 뷰의 베이스라인에 맞춤

## TextView
- text: TextView를 통해 보여줄 문자열을 설정한다. 
- textAppearance: 미리 제공되는 테마를 설정한다. 

## Button
: 사용자가 누르면 개발자가 작성한 코드가 동작하는 뷰

- OnClickListener: 사용자가 버튼을 눌렀을 때 반응하는 리스너

## Check box
: 항목을 제공하고 체크를 통해 선택할 수 있도록 하는 뷰

- toggle: 현재 체크 상태를 변경한다.

## Radio Button
: 하나의 그룹 안에서 하나만 선택할 수 있도록 하는 뷰

- OnCheckedChangeListener: 체크 상태가 변경되었을 때 반응하는 리스너

## Progress Bar
: 오래 걸리는 작업이 있을 경우 작업 중임을 표시하는 뷰이다.

- incrementProgressBy: 지정된 값 만큼 증가 혹은 감소시킨다

## SeekBar
: ProgressBar와 매우 유사하지만 사용자가 값을 직접 설정할 수 있는 기능을 갖추고 있다.

- style: SeekBar의 모양을 설정한다.
- max: 최대 값 
- progress: 현재 값

## EditText
: 사용자에게 문자열을 입력 받는 용도로 사용하는 뷰


- inputType: 입력받을 데이터의 형태를 설정 
- hint: 안내 문구를 설정 
- text: 처음 보여질 때 나타날 문자열을 설정 
- imeOptions: 키보드 엔터키의 형태를 설정 

- setText: EditText에 문자열을 설정

- OnEditorActionListener: 엔터 키를 누르면 반응하는 리스너
- TextWatcher: 입력을 할 때마다 반응하는 리스너

## imageView
: 이미지를 사용자에게 보여주고자 하는 목적으로 제공되는 뷰

- src: 보여줄 이미지를 지정하는 속성
- srcCompat: 안드로이드 5.0 이후에 추가된 속성. 벡터방식의 이미지를 처리할 수 있는 기능이 추가됨 

- Drawable:안드로이드에서 이미지를 넣는 폴더 
- MipMap: 백터방식으로 이미지를 그리는 안드로이드에서 제공된 폴더 

- setImageResource: res폴더에 있는 이미지를 설정 
- setImageBitmaap: Bitmap 객체로 만들어진 이미지를 설정 
- setImageDrawable: Drawable 객체로 만들어진 이미지를 설정 
