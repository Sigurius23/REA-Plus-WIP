package ja3;

import java.util.Collection;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31117e;
import ub3.InterfaceC34747a;
import xb3.AbstractC38176k;
import xb3.C38177l;

/* JADX INFO: renamed from: ja3.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21502b0 implements InterfaceC34747a {

    /* JADX INFO: renamed from: w */
    public static final C21502b0 f82477w = new C21502b0();

    @Override // ub3.InterfaceC34747a
    /* JADX INFO: renamed from: r */
    public final Iterable mo13799r(Object obj) {
        int i13 = C21506d0.f82486p;
        Collection supertypes = ((InterfaceC31117e) obj).mo60496e().getSupertypes();
        AbstractC22676k.m65749i(supertypes, "getSupertypes(...)");
        return new C38177l(AbstractC38176k.m122273B(AbstractC25265s.m74145r0(supertypes), C21517m.f82531F));
    }
}
