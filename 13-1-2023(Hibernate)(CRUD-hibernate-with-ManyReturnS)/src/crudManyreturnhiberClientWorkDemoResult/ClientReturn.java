package crudManyreturnhiberClientWorkDemoResult;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({

	@NamedQuery(name="getClient",query="from ClientReturn"),
	@NamedQuery(name="getsingleClient",query="from ClientReturn where id=:i"),
	@NamedQuery(name="updateClient",query="update ClientReturn set name=:nm,addr=:ad where id=:i"),
	@NamedQuery(name="deleteClient",query="delete from ClientReturn where id=:i")
})
@Entity
public class ClientReturn {

@Id
int id;
String name;
double salary;
long mobno;
String addr;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public long getMobno() {
	return mobno;
}
public void setMobno(long mobno) {
	this.mobno = mobno;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
@Override
public String toString() {
	return "ClientReturn [id=" + id + ", name=" + name + ", salary=" + salary + ", mobno=" + mobno + ", addr=" + addr
			+ "]";
}

}
