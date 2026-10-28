package ht2;

import c93.InterfaceC4339a;
import fm1.C14605i;
import jk2.AbstractC21768i;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ht2.c */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17631c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68378w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f68379x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f68380y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f68381z;

    public /* synthetic */ C17631c(boolean z4, Function1 function1, Object obj, int i13) {
        this.f68378w = i13;
        this.f68379x = z4;
        this.f68380y = function1;
        this.f68381z = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f68378w) {
            case 0:
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f68381z;
                return AbstractC17633e.m50208P(this.f68379x, this.f68380y, interfaceC28601c1);
            default:
                return AbstractC21768i.m61526s(this.f68379x, this.f68380y, (C14605i) this.f68381z);
        }
    }
}
