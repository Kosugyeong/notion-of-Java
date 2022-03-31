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
