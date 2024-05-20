package classDemo;

public interface CallBack {
	int num=10;
	void showCall();

}

interface Call extends CallBack
{
 void showCall2();
}