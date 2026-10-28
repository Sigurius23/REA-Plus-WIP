package io.getstream.chat.android.client.internal.state.utils.internal;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.InterfaceC13037f2;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.utils.internal.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19380c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73924w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f73925x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC13037f2 f73926y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC13037f2 f73927z;

    public /* synthetic */ C19380c(InterfaceC4351m interfaceC4351m, InterfaceC13037f2 interfaceC13037f2, InterfaceC13037f2 interfaceC13037f3, int i13) {
        this.f73924w = i13;
        this.f73925x = interfaceC4351m;
        this.f73926y = interfaceC13037f2;
        this.f73927z = interfaceC13037f3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73924w) {
            case 0:
                return this.f73925x.invoke(this.f73926y.getValue(), this.f73927z.getValue());
            default:
                return this.f73925x.invoke(this.f73926y.getValue(), this.f73927z.getValue());
        }
    }
}
