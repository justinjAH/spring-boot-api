package controllerpackagetest;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import controllerpackage.ControllerClass;
import repositrypackage.Repositry;

@RunWith(SpringJUnit4ClassRunner.class)
public class ControllerClassTest {
	@InjectMocks
	ControllerClass ControllerClassTest;
	@Mock
	Repositry RepositryTest;
	@Test
	public void findAllCompanyTest1() {
		ControllerClassTest.getAll();
		verify(RepositryTest).findAll();
	}
}
