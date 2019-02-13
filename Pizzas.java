class Pizzas {
	public static void main(String args[]) {
	 int box[][] = {
		{2, 2},
		{5, 4},
		{10, 8},
		{12, 10},
		{15, 12}
		};

	int a, b, c, d, e, f, g, h, i, j;
	double k, l, m, n, o;
	double total;
	double average;

	a = box[0][0];
	b = box[1][0];
	c = box[2][0];
	d = box[3][0];
	e = box[4][0];
	f = box[0][1];
	g = box[1][1];
	h = box[2][1];
	i = box[3][1];
	j = box[4][1];

	k = a / b;
	l = c / d;
	m = e / f;
	n = g / h;
	o = i / j;

	total = k + l + m + n + o;
	average = total / 5;

	System.out.println("The average discount per pizza is $" + average);
 }
}