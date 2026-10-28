package x30;

import l40.C23328a;
import l83.C23465k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: x30.m1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C37909m1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162304w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37912n1 f162305x;

    public /* synthetic */ C37909m1(C37912n1 c37912n1, int i13) {
        this.f162304w = i13;
        this.f162305x = c37912n1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f162304w) {
            case 0:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && !this.f162305x.f162313c);
            default:
                C23328a it = (C23328a) obj;
                AbstractC22676k.m65750j(it, "it");
                return AbstractC37056f.m118958J(new C23465k(this.f162305x.f162315e, it));
        }
    }
}
