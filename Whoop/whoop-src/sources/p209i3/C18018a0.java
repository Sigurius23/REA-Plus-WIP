package p209i3;

import c93.InterfaceC4351m;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: i3.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18018a0 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C18018a0 f69930w = new C18018a0(2);

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C18034p c18034p = (C18034p) obj2;
        Object objValueOf = Float.valueOf(0.0f);
        C18030l c18030l = ((C18034p) obj).f69989d;
        C18043y c18043y = AbstractC18039u.f70052s;
        Object objM129g = c18030l.f69980w.m129g(c18043y);
        if (objM129g == null) {
            objM129g = objValueOf;
        }
        float fFloatValue = ((Number) objM129g).floatValue();
        Object objM129g2 = c18034p.f69989d.f69980w.m129g(c18043y);
        if (objM129g2 != null) {
            objValueOf = objM129g2;
        }
        return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
    }
}
