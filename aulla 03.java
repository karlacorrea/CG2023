





// Boucing Ball


void setup () {
	size(800, 600);
}

void draw () {
	ellipse(400, 300, 50 ,50);
}


// X, Y Width

float x = 400;
float y = 300;

void setup () {
	size(800, 600);

void draw () {

	ellipse(X, Y, 50, 50);
}




// X, Y Width

float x = 400;
float y = 300;

void setup () {
	size(800, 600);

void draw () {

	ellipse(X, Y, 50, 50);
}

// X, Y Width

float x = 600;
float y = 300;

void setup () {
	size(800, 600);

void draw () {
	x = x + 10;
	ellipse(X, Y, 50, 50);
}


// X, Y Width

float x = 600;
float y = 300;

float xSpeed = 5;

void setup () {
	size(800, 600);

void draw () {
	x = x + 10;
	ellipse(X, Y, 50, 50);
}



// X, Y Width

float x = 600;
float y = 300;

float xSpeed = 5;

void setup () {
	size(800, 600);

void draw () {
	x = x + xSpeed;
	if (x > width) {
		xSpeed = xSpeed * -1;
	}
	
	ellipse(X, Y, 50, 50);
}

// X, Y Width

float x = 600;
float y = 300;

float xSpeed = 5;

void setup () {
	size(800, 600);

void draw () {
	x = x + xSpeed;
	if (x > width) {
		xSpeed = xSpeed * -1;
	}
	
	ellipse(X, Y, 50, 50);
}


// X, Y Width Come Back

float x = 600;
float y = 300;

float xSpeed = 5;

void setup () {
	size(800, 600);

void draw () {
	x = x + xSpeed;
	
	if (x > width || x < 0) {
		xSpeed = xSpeed * -1;
	}
	
	ellipse(X, Y, 50, 50);
}


// X, Y Width Come Back

float x = 600;
float y = 300;

float xSpeed = 5;

void setup () {
	size(800, 600);

void draw () {
	background(0);
	x = x + xSpeed;
	
	if (x > width || x < 0) {
		xSpeed = xSpeed * -1;
	}
	
	ellipse(X, Y, 50, 50);
}


// X, Y Width Come Back

float x = 600;
float y = 300;

float xSpeed = 5;
float ySpeed = 5;

void setup () {
	size(800, 600);

void draw () {
	background(0);
	
	x + = xSpeed;
	
	if (x > width || x < 0) {
		xSpeed *= -1;
	}
	
	y + = ySpeed;
	
	if (y > width || y < 0) {
		ySpeed *= -1;
	}
	
	ellipse(X, Y, 50, 50);
}


// X, Y Width Come Back

float x = 600;
float y = 300;

float xSpeed = 5;
float ySpeed = 5;

void setup () {
	size(800, 600);

void draw () {
	background(0);
	
	x + = xSpeed;
	
	if (x > width || x < 0) {
		xSpeed *= -1;
	}
	
	y + = ySpeed;
	
	if (y > height || y < 0) {
		ySpeed *= -1;
	}
	
	ellipse(X, Y, 50, 50);
}


// X, Y Width Come Back

float x = 600;
float y = 300;

float xSpeed = 35;
float ySpeed = 35;

void setup () {
	size(800, 600);

void draw () {
	//background(0);
	fill(random(255), random(255), random(255));
	x + = xSpeed;
	
	if (x > width || x < 0) {
		xSpeed *= -1;
	}
	
	y + = ySpeed;
	
	if (y > height || y < 0) {
		ySpeed *= -1;
	}
	
	ellipse(X, Y, 50, 50);
}
