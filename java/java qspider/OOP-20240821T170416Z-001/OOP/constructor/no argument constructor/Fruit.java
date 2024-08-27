class Fruit
{
	static int object_count=0;
	Fruit(){
		object_count++;
		System.out.println("Fruit Object "+object_count+" is created");
	}
}



