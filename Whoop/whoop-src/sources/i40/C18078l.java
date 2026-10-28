package i40;

import androidx.compose.runtime.Composer;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.InterfaceC11403t1;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i40.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C18078l implements Function3 {

    /* JADX INFO: renamed from: w */
    public static final C18078l f70283w = new C18078l();

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object c11347e2;
        InterfaceC11403t1 animateFloat = (InterfaceC11403t1) obj;
        ((Number) obj3).intValue();
        AbstractC22676k.m65750j(animateFloat, "$this$animateFloat");
        C28655q c28655q = (C28655q) ((Composer) obj2);
        c28655q.m87150e0(831788644);
        EnumC18075i enumC18075i = EnumC18075i.f70275w;
        EnumC18075i enumC18075i2 = EnumC18075i.f70276x;
        if (animateFloat.m30637d(enumC18075i, enumC18075i2)) {
            c11347e2 = AbstractC11348f.m30574v(67, 0, AbstractC11333b0.f36312c, 2);
        } else {
            c11347e2 = (animateFloat.m30637d(enumC18075i2, enumC18075i) || animateFloat.m30637d(EnumC18075i.f70277y, enumC18075i2)) ? new C11347e2(83, 67, AbstractC11333b0.f36312c) : AbstractC11348f.m30573u(0.0f, 0.0f, 7, null);
        }
        c28655q.m87173q(false);
        return c11347e2;
    }
}
