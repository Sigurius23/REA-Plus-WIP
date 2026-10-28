package com.whoop.data.repositories;

import bc3.C2996c2;
import bh3.InterfaceC3259f;
import java.util.concurrent.CancellationException;
import od1.C27862y;

/* JADX INFO: renamed from: com.whoop.data.repositories.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6657d implements InterfaceC3259f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2996c2 f25448b;

    public /* synthetic */ C6657d(C2996c2 c2996c2, int i13) {
        this.f25447a = i13;
        this.f25448b = c2996c2;
    }

    @Override // bh3.InterfaceC3259f
    public final void cancel() {
        switch (this.f25447a) {
            case 0:
                this.f25448b.cancel((CancellationException) null);
                break;
            default:
                C27862y.m84100f(this.f25448b);
                break;
        }
    }
}
