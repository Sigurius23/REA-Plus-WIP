package com.whoop.strapMetadata.util;

import androidx.annotation.Keep;
import ge3.AbstractC15751g;
import p138f6.C14132d;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;", "", "<init>", "()V", "Lf6/d;", "", "PREF_AUXILIARY_DEVICE_ID", "Lf6/d;", "getPREF_AUXILIARY_DEVICE_ID", "()Lf6/d;", "strap-metadata_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DataStorePreferenceKeys {
    public static final DataStorePreferenceKeys INSTANCE = new DataStorePreferenceKeys();
    private static final C14132d PREF_AUXILIARY_DEVICE_ID = AbstractC15751g.m44441U("auxiliary_serial_id");

    private DataStorePreferenceKeys() {
    }

    public final C14132d getPREF_AUXILIARY_DEVICE_ID() {
        return PREF_AUXILIARY_DEVICE_ID;
    }
}
