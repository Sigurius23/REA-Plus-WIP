package vd1;

import ek0.AbstractC13296u;
import ot0.C28323a;
import p715kotlin.jvm.functions.Function1;
import td1.EnumC33707e;

/* JADX INFO: renamed from: vd1.b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C35908b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f152878w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35910d f152879x;

    public /* synthetic */ C35908b(C35910d c35910d, int i13) {
        this.f152878w = i13;
        this.f152879x = c35910d;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f152878w) {
            case 0:
                return C35910d.m114051I(this.f152879x, (EnumC33707e) obj);
            case 1:
                return C35910d.m114046D(this.f152879x, (AbstractC13296u) obj);
            case 2:
                return C35910d.m114071y(this.f152879x, (C28323a) obj);
            default:
                return C35910d.m114043A(this.f152879x, (C28323a) obj);
        }
    }
}
