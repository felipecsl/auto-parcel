package model2;

import android.os.Parcelable;

import auto.parcel.AutoParcel;

@AutoParcel
public abstract class Address implements Parcelable {
  public abstract double[] coordinates();

  public abstract String cityName();

  @AutoParcel.Builder interface Builder {
    Builder coordinates(double[] c);

    Builder cityName(String c);

    Address build();
  }

  static Builder builder() {
    return new AutoParcel_Address.Builder();
  }

  public static Address create(double[] coordinates, String cityName) {
    return builder().coordinates(coordinates).cityName(cityName).build();
  }
}
