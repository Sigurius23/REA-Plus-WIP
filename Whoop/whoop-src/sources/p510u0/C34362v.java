package p510u0;

import l83.C23454a0;
import p294l3.C23254g;
import p294l3.C23283u0;
import p390p1.C28633k1;
import p390p1.C28677v1;
import p390p1.C28679w;
import p412q3.C29877k;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u0.v */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C34362v implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144371w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34354s0 f144372x;

    public /* synthetic */ C34362v(C34354s0 c34354s0, int i13) {
        this.f144371w = i13;
        this.f144372x = c34354s0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f144371w) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f144372x.f144323q.setValue(bool);
                return C23454a0.f92919a;
            case 1:
                C34354s0 c34354s0 = this.f144372x;
                C28633k1 c28633k1 = c34354s0.f144326t;
                C29891y c29891y = (C29891y) obj;
                String str = c29891y.f122125a.f92135x;
                C23254g c23254g = c34354s0.f144316j;
                if (!AbstractC22676k.m65745e(str, c23254g != null ? c23254g.f92135x : null)) {
                    c34354s0.f144317k.setValue(EnumC34318g0.f144086w);
                    if (((Boolean) c28633k1.getValue()).booleanValue()) {
                        c28633k1.setValue(Boolean.FALSE);
                    } else {
                        c34354s0.f144325s.setValue(Boolean.FALSE);
                    }
                }
                long j7 = C23283u0.f92251b;
                c34354s0.m108664f(j7);
                c34354s0.m108663e(j7);
                c34354s0.f144327u.invoke(c29891y);
                C28677v1 c28677v1 = c34354s0.f144308b;
                C28679w c28679w = c28677v1.f115979a;
                if (c28679w != null) {
                    c28679w.m87224r(c28677v1, null);
                }
                return C23454a0.f92919a;
            case 2:
                this.f144372x.f144324r.m108647c(((C29877k) obj).f122097a);
                return C23454a0.f92919a;
            default:
                return Boolean.valueOf(this.f144372x.f144324r.m108647c(((C29877k) obj).f122097a));
        }
    }
}
