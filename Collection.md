# 컬렉션, Collection

- (향상된) 배열 
- 기존의 순수 배열의 성능 향상(입출력), 사용법을 개량 > 클래스
- 내부의 순수 배열을 가지고 있다. > public 메소드들을 통해서 성능 or 사용법 개량
- 컬렉션은 모두 길이 가변 > 방의 개수를 마음대로 늘리고 줄이는게 가능


<컬렉션 종류>
1. List 계열
        - ArrayList
        - LinkedList
        - Queue
        - Stack
        - Vector(legacy)

2. Set 계열
        - HashSet
        - TreeSet

3. Map 계열
        - HashMap
        - TreeMap
        - Properties(legacy)
        - HashTable(legacy)
        
        
## ArrayList 클래스

* ArrayList<Integer> list = new ArrayList<Integer>(10); //10칸으로 배열 생성

ArrayList는 처음에 배열길이 4가 만들어졌다가 꽉 차서 그 다음 길이 8이 생성된 후 방 대 방(깊은 복사)로 길이 8로 복사가 된다. 그리고 8이 꽉차면 16길이에 또 이 방법을 반복한다.(현재 길이의 2배의 길이인 배열이 생성되는 것) 이 때 배열 4와 배열 8은 버려진다(쓰레기 값이 된다) > 비용이 많이 든다. 
        
-> 위의 문제점 해결 방법
         - ArrayList의 초기 길이를 지정할 수 있다. > ArrayList<Integer> list = new ArrayList<Integer>(10);
                - 미리 예측해서 초기 크기 잡아놓자!!
                - 10칸으로 초기 크기를 만들어도 이 크기보다 더 많은 데이터가 들어오는 순간 10칸의 2배인 20칸으로 또 배열이 늘어나서 생성되고 복사가 됨
        
-> trimToSize를 사용하면, 남는 배열의 방이 없도록 현재 배열의 길이를 데이터가 들어가 있는 길이만큼 줄인다. 그렇지만, 확신이 들때만 가끔 호출하도록 하자! 줄여서 만든 배열을 복사를 함으로써 원래의 길이가 큰 배열이 또 쓰레기값이 되므로 더 이상 데이터가 들어올 일이 없다고 생각될 때만 사용하기.
        
## ArrayList 사용법
        
ArrayList<String> list = new ArrayList<String>(); // 문자열 배열        
        
* 1. 요소 추가하기
        - void add(T value)
        배열의 맨 마지막에 추가하기 > Append Mode
        
        list.add("바나나");
        list.add("딸기");
        list.add("포도");
        list.add("귤");
        list.add("사과");
        
* 2. 요소의 개수
        - int size() > 배열의 길이가 아니라 요소가 들어가 있는 개수를 센 것이다.
        
* 3. 요소의 접근
        - T get(int index)
        
        System.out.println(list.get(0));
		System.out.println(list.get(4));
        
* 4. 요소의 수정
        - void set(int index, T newValue) 
        
        String temp = list.set(2, "파인애플"); //수정하기 전 요소의 값을 반환한다.
        
* 5. 요소의 삭제
        - 순수 배열은 요소 삭제 불가능하지만 컬렉션은 요소 삭제가 가능핟. 
        - T remove(int index) > 방번호를 찾아서 삭제
        - boolean remove(T value) > 값을 찾아서 삭제 > 중복 값이 있다면 처음 만나는 요소만 삭제
        - **** 시프트가 발생한다!!! > 삭제된 방 이후의 모든 요소는 모두 방번호 -1 감소

        list.remove(2);
        list.remove("파인애플");
        
* 6. 탐색
        - 루프
        
        for (int i = 0; i < list.size(); i++) {
			System.out.printf("list[%d] = %s\n", i, list.get(i));
		}
                                        
        for (String item : list) {
			System.out.println(item);
		}
        
* 7. 요소의 추가
        - 배열의 원하는 위치에 요소를 추가
        - void add(int index, T value)
        - ****** 시프트가 발생한다!!!! > 삽입된 방 이후의 모든 요소가 방번호 + 1
        
        list.add(2, "망고");
        
* 8. 요소의 검색
        - int indexOf(T value)
        - boolean contains(T value)
        
        System.out.println(list.indexOf("사과")); 
        System.out.println(list.contains("사과")); 
                      
        
* 9. 초기화
        - 모든 요소 삭제 > 모든방.remove()
        - void clear()
        
        list.clear();
        
* 10. 빈배열 확인
        - boolean isEmpty()
        
        System.out.println(list.size() == 0);
        System.out.println(list.isEmpty());
        
