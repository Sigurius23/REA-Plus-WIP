package com.mapbox.common.movement;

import com.nimbusds.jose.shaded.gson.JsonIOException;
import p073cq.InterfaceC11036e;
import p440qw.InterfaceC30680o;

/* JADX INFO: renamed from: com.mapbox.common.movement.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5454a implements InterfaceC11036e, InterfaceC30680o {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21941w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f21942x;

    public /* synthetic */ C5454a(String str, int i13) {
        this.f21941w = i13;
        this.f21942x = str;
    }

    @Override // p440qw.InterfaceC30680o
    public Object construct() {
        switch (this.f21941w) {
            case 1:
                throw new JsonIOException(this.f21942x);
            case 2:
                throw new JsonIOException(this.f21942x);
            case 3:
                throw new JsonIOException(this.f21942x);
            default:
                throw new JsonIOException(this.f21942x);
        }
    }

    @Override // p073cq.InterfaceC11036e
    /* JADX INFO: renamed from: n */
    public void mo1681n(Exception exc) {
        GoogleActivityRecognition.Companion.withLogs$lambda$7(this.f21942x, exc);
    }
}
