package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.crypto.tink.internal.C5099k0;

/* JADX INFO: renamed from: com.google.android.gms.common.api.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4970a {
    /* JADX INFO: renamed from: a */
    public InterfaceC4973d mo15595a(Context context, Looper looper, C5099k0 c5099k0, Object obj, InterfaceC4978i interfaceC4978i, InterfaceC4979j interfaceC4979j) {
        return mo15596b(context, looper, c5099k0, obj, interfaceC4978i, interfaceC4979j);
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC4973d mo15596b(Context context, Looper looper, C5099k0 c5099k0, Object obj, InterfaceC4978i interfaceC4978i, InterfaceC4979j interfaceC4979j) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
