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
	        implementation 'com.github.shakbari435:ExpandableCardView:1.1'
		}
}
```

# XML Sample

```xml

    <android.support.v7.widget.LinearLayoutCompat
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#FAFAFA"
        android:clipChildren="false"
        android:orientation="vertical">

        <com.phoenixdevs.ir.ExpandableCardView
            android:id="@+id/ecv2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginBottom="10dp"
            android:layout_marginLeft="5dp"
            android:layout_marginRight="5dp"
            android:layout_marginTop="10dp"
            app:expandOnClick="true"
	    app:title="Profile"
            app:icon="@drawable/ic_contact"
            app:inner_view="@layout/item_profile" />

    </android.support.v7.widget.LinearLayoutCompat>
```

# Java Code Sample

```java
       final ExpandableCardView expandableCardView=findViewById(R.id.ecv2);
        expandableCardView.setInnerView(R.layout.item_profile2);

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
