package oa3;

import hb3.InterfaceC17127p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import ka3.C22316h;
import lb3.AbstractC23763c0;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import nb3.C26555l;
import nb3.EnumC26554k;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30171w0;
import ta3.AbstractC33686l;

/* JADX INFO: renamed from: oa3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C27764g implements InterfaceC17127p {

    /* JADX INFO: renamed from: b */
    public static final C27764g f111954b = new C27764g();

    /* JADX INFO: renamed from: c */
    public static final C27764g f111955c = new C27764g();

    /* JADX INFO: renamed from: a */
    public static String[] m83867a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: b */
    public static LinkedHashSet m83868b(String internalName, String... signatures) {
        AbstractC22676k.m65750j(internalName, "internalName");
        AbstractC22676k.m65750j(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: d */
    public static LinkedHashSet m83869d(String str, String... signatures) {
        AbstractC22676k.m65750j(signatures, "signatures");
        return m83868b("java/lang/".concat(str), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    /* JADX INFO: renamed from: e */
    public static LinkedHashSet m83870e(String str, String... strArr) {
        return m83868b("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // hb3.InterfaceC17127p
    /* JADX INFO: renamed from: c */
    public AbstractC23811y mo48369c(C30171w0 proto, String flexibleId, AbstractC23763c0 lowerBound, AbstractC23763c0 upperBound) {
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(flexibleId, "flexibleId");
        AbstractC22676k.m65750j(lowerBound, "lowerBound");
        AbstractC22676k.m65750j(upperBound, "upperBound");
        if (flexibleId.equals("kotlin.jvm.PlatformType")) {
            return proto.m118821l(AbstractC33686l.f140740f) ? new C22316h(lowerBound, upperBound) : AbstractC23791o.m69883b(lowerBound, upperBound);
        }
        return C26555l.m78682c(EnumC26554k.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString());
    }
}
