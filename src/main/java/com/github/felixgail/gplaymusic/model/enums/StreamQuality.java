package com.github.felixgail.gplaymusic.model.enums;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public enum StreamQuality implements Serializable {
  @SerializedName("lo")
  LOW("lo"),
  @SerializedName("med")
  MEDIUM("med"),
  @SerializedName("hi")
  HIGH("hi");

  private String str;

  StreamQuality(String str) {
    this.str = str;
  }

  @Override
  public String toString() {
    return this.str;
  }
}
