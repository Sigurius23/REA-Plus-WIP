package hu1;

import kv2.AbstractC22846b;
import mh.C25540h;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: hu1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C17649f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68425w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f68426x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f68427y;

    public /* synthetic */ C17649f(int i13, int i14, int i15) {
        this.f68425w = i15;
        this.f68426x = i13;
        this.f68427y = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f68425w) {
            case 0:
                return C17651h.m50286i(this.f68426x, this.f68427y, (InterfaceC33687a) obj);
            default:
                return AbstractC22846b.m66275z(this.f68426x, this.f68427y, (C25540h) obj);
        }
    }
}
