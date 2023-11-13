
# 배달 어플 만들기

## API
### 회원
Lv1
* 로그인 : /api/auth/{member-id}
* 회원가입 : /api/members/sign-up
* 회원수정 : /api/members/{member-id}
* 회원정보조회 : /api/members/{member-id}/profile

Lv2
* 마이페이지에서 내가 찜한 음식 조회 : /api/members/{member-id}/bookmark
* 마이페이지에서 주문 내역 조회 : /api/members/{member-id}/orders

### 음식
* 음식 생성 : /api/foods/food
* 모든 음식 조회 : /api/foods
* 단일 음식 조회 : /api/foods/{food-id}
* 특정 음식 삭제 : /api/foods/{food-id}
* 특정 음식 수정 : /api/foods/{food-id}

### 주문
* 주문 생성 : /api/orders
* 주문 삭제 : /api/orders/{order-id}

## 음식 DB Table
| 컬럼 내용 | 컬럼             | 데이터 타입       | 널 허용 | PK  | FK        | Unique | 
|-------|----------------|--------------|------|-----|-----------|--------|
| 음식 번호 | food_id        | integer      | No   | Yes |           | Yes    |
| 음식 이름 | food_name      | varchar(100) | No   |     |           | Yes    |
| 음식 종류 | food_type      | varchar(100) | No   |     |           | No     |
| 음식 설명 | description    | text         | Yes  |     |           | No     |
| 판매 가게 | store_id       | integer      | No   |     | store_id  | No     |
| 음식 사진 | main_image_url | varchar(255) | No   |     |           | No     |
| 생성 날짜 | created_at     | timestamp    | No   |     |           | No     |
| 수정 날짜 | updated_at     | timestamp    | No   |     |           | No     |
| 회원 번호 | member_id      | integer      | No   |     | member_id | No     |

