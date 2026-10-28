package io.getstream.chat.android.client.internal.state.utils.internal;

import c93.InterfaceC4339a;
import ec3.InterfaceC13037f2;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.utils.internal.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19379b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73921w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f73922x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC13037f2 f73923y;

    public /* synthetic */ C19379b(int i13, InterfaceC13037f2 interfaceC13037f2, Function1 function1) {
        this.f73921w = i13;
        this.f73922x = function1;
        this.f73923y = interfaceC13037f2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73921w) {
            case 0:
                return this.f73922x.invoke(this.f73923y.getValue());
            case 1:
                return ((InterfaceC13037f2) this.f73922x.invoke(this.f73923y.getValue())).getValue();
            default:
                return this.f73922x.invoke(this.f73923y.getValue());
        }
    }
}
