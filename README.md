# ExpandableCardView


I built a small library that will greatly help you in designing the material. Then download foolishly

## Demo
<img src="http://phoenixdevs.ir/github/expandcardview.gif" height="600" width="350">

# Usage




### Step 1 
- Add it in your root build.gradle at the end of repositories:
```java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
}
```



### Step 2 
- Add the dependency
```java
  	dependencies {
		    implementation 'com.github.shakbari435:ExpandableCardView:1.0'
	}
}
```

# Java Code Simple

```java
       final ExpandableCardView expandableCardView=findViewById(R.id.ecv2);

        expandableCardView.setRtlDirection();
        expandableCardView.setTitle("Profile");
        expandableCardView.setIcon(R.drawable.ic_user);

        expandableCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expandableCardView.isExpanded()){
                    expandableCardView.collapse();
                    Toast.makeText(MainActivity.this, "Close", Toast.LENGTH_SHORT).show();

                }
                else{
                    expandableCardView.expand();
                    Toast.makeText(MainActivity.this, "Open", Toast.LENGTH_SHORT).show();
                }
            }
        });
}
```
