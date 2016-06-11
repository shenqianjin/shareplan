package attackforce.shareplan.dao;

import java.util.List;

import attackforce.shareplan.domain.Person;
import attackforce.shareplan.domain.vo.PersonVO;

public interface PersonDao {

	public  List<Person> selectAllPerson();

	public PersonVO selectPerson(PersonVO personVo);

	public int insertPerson(PersonVO personVo);

	public int updaqtePerson(PersonVO personVo);

	public int deletePersonById(int id);
}
