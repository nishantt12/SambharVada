Sambhar Vada
============


```java
        Init edit1 = new Init(R.id.editTitle, true, "ReviewTitle", SambarVada.EDIT_TEXT);
        Init edit2 = new Init(R.id.editComments, true, "ReviewComments", SambarVada.EDIT_TEXT);
        Init edit3 = new Init(R.id.editFullName, true, "FullName", SambarVada.EDIT_TEXT);
        Init edit4 = new Init(R.id.editEmail, true, "Email", SambarVada.EDIT_TEXT);
        Init check1 = new Init(R.id.recommend, true, "IsRecomend", SambarVada.CHECK_BOX);

        Init rating1 = new Init(R.id.overAllRating, true, "TotalScore", SambarVada.RATING_BAR);
        Init rating2 = new Init(R.id.foodRating, true, "FoodScore", SambarVada.RATING_BAR);
        Init rating3 = new Init(R.id.serviceRating, true, "ServiceScore", SambarVada.RATING_BAR);
        Init rating4 = new Init(R.id.ambienceRating, true, "AmbienceScore", SambarVada.RATING_BAR);
        Init rating5 = new Init(R.id.valueRating, true, "ValueScore", SambarVada.RATING_BAR);
        
        sambarVada.setUp(new Init[]{
                          edit1, edit2, edit3, edit4, check1, rating1, rating2, rating3, rating4, rating5
                    }
              );
                
         SambarVada sambarVada = new SambarVada(this, new SambarVada.Callback() {
                    @Override
                    public void onReceive(Init[] initEditTexts, boolean isOk) {
     
     
                    }
                });
        
```

Download

--------
```xml
<dependency>
  <groupId>com.nishant.sambharvada</groupId>
  <artifactId>sambharvada</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```
or Gradle:
```groovy

repositories {
    maven {
        url 'https://dl.bintray.com/nishantt12/SambharVada/'
    }
}

dependencies {
    compile 'com.nishant.sambharvada:sambharvada:1.0.2'
}

```

