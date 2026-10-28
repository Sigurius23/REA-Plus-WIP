package ib3;

import com.google.crypto.tink.internal.C5101l0;
import g40.C15352f4;
import hb3.C17119i;
import j93.AbstractC21478l0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kb3.C22342k;
import o93.AbstractC27742n;
import o93.InterfaceC27731c;
import p014aj.C0928c;
import p437qt.C30582e;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.C31130i0;
import r93.InterfaceC31109b0;
import t93.InterfaceC33666b;
import t93.InterfaceC33668d;
import va3.C35847e;

/* JADX INFO: renamed from: ib3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18343b implements InterfaceC27731c {

    /* JADX INFO: renamed from: b */
    public final C18345d f71437b = new C18345d();

    /* JADX INFO: renamed from: a */
    public final C31130i0 m52850a(C22342k c22342k, InterfaceC31109b0 builtInsModule, Iterable classDescriptorFactories, InterfaceC33668d platformDependentDeclarationFilter, InterfaceC33666b additionalClassPartsProvider, boolean z4) {
        AbstractC22676k.m65750j(builtInsModule, "builtInsModule");
        AbstractC22676k.m65750j(classDescriptorFactories, "classDescriptorFactories");
        AbstractC22676k.m65750j(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC22676k.m65750j(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set<C35847e> packageFqNames = AbstractC27742n.f111892q;
        C15352f4 c15352f4 = new C15352f4(1, this.f71437b, C18345d.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0, 12);
        AbstractC22676k.m65750j(packageFqNames, "packageFqNames");
        ArrayList arrayList = new ArrayList();
        for (C35847e c35847e : packageFqNames) {
            C18342a.f71436m.getClass();
            InputStream inputStream = (InputStream) c15352f4.invoke(C18342a.m52849a(c35847e));
            C18344c c18344cM60449t = inputStream != null ? AbstractC21478l0.m60449t(c35847e, c22342k, builtInsModule, inputStream) : null;
            if (c18344cM60449t != null) {
                arrayList.add(c18344cM60449t);
            }
        }
        C31130i0 c31130i0 = new C31130i0(arrayList);
        C41113q c41113q = new C41113q(c22342k, builtInsModule);
        C0928c c0928c = new C0928c(c31130i0, 12);
        C18342a c18342a = C18342a.f71436m;
        C17119i c17119i = new C17119i(c22342k, builtInsModule, c0928c, new C5101l0(builtInsModule, c41113q, c18342a), c31130i0, classDescriptorFactories, c41113q, additionalClassPartsProvider, platformDependentDeclarationFilter, c18342a.f59017a, null, new C30582e(c22342k), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C18344c) it.next()).m52851K0(c17119i);
        }
        return c31130i0;
    }
}
