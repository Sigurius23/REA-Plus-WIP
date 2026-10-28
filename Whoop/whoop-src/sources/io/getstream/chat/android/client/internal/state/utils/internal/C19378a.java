package io.getstream.chat.android.client.internal.state.utils.internal;

import c93.InterfaceC4339a;
import ec3.InterfaceC13037f2;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.utils.internal.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19378a implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC13037f2 f73916E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73917w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function3 f73918x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC13037f2 f73919y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC13037f2 f73920z;

    public /* synthetic */ C19378a(Function3 function3, InterfaceC13037f2 interfaceC13037f2, InterfaceC13037f2 interfaceC13037f3, InterfaceC13037f2 interfaceC13037f4, int i13) {
        this.f73917w = i13;
        this.f73918x = function3;
        this.f73919y = interfaceC13037f2;
        this.f73920z = interfaceC13037f3;
        this.f73916E = interfaceC13037f4;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73917w) {
            case 0:
                InterfaceC13037f2 interfaceC13037f2 = this.f73920z;
                InterfaceC13037f2 interfaceC13037f3 = this.f73916E;
                return DerivedStateFlowKt.combineStates$lambda$3(this.f73918x, this.f73919y, interfaceC13037f2, interfaceC13037f3);
            default:
                return this.f73918x.invoke(this.f73919y.getValue(), this.f73920z.getValue(), this.f73916E.getValue());
        }
    }
}
