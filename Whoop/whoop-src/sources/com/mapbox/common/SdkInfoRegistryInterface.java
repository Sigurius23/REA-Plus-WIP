package com.mapbox.common;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface SdkInfoRegistryInterface {
    List<SdkInformation> getSdkInformation();

    void registerSdkInformation(SdkInformation sdkInformation);
}
