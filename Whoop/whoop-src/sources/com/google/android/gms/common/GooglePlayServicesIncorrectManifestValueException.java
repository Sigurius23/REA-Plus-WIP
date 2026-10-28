package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes6.dex */
@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i13) {
        int i14 = C4987d.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        StringBuilder sb4 = new StringBuilder(String.valueOf(i14).length() + 104 + String.valueOf(i13).length() + 194);
        sb4.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
        sb4.append(i14);
        sb4.append(" but found ");
        sb4.append(i13);
        sb4.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(sb4.toString());
    }
}
