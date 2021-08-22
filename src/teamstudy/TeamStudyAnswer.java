package teamstudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TeamStudyAnswer {

	public static void main(String[] args) {

		// 배열 생성
		List teamName = new ArrayList();

		// 배열에 조원들 이름 추가
		teamName.add("권순표");
		teamName.add("양윤제");
		teamName.add("김주환");
		teamName.add("임예람");
		teamName.add("김준희");
		teamName.add("이승우");

		// 가나다 순 정렬
		Collections.sort(teamName);
		System.out.println(teamName);

		// ArrayList에 없는 역순 정렬 기능을 사용하기 위해 
		// ArrayList를 LinkedList 타입으로 형변환
		teamName = new LinkedList<>(teamName);

		// 반복자(Iterator)를 사용한 역순 정렬
		Iterator<String> titer = ((LinkedList<String>) teamName).descendingIterator();

		// 역순 결과를 담을 새로운 배열 생성
		List<String> descTeamName = new ArrayList<>();

		// 새로운 배열의 인덱스에 역순 정렬된 값 추가
		while(titer.hasNext()) {
			descTeamName.add(titer.next());
		}

		// 역순 정렬된 값 출력
		System.out.println(descTeamName);
	}
}
