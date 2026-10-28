package wc3;

import j93.InterfaceC21461d;
import java.util.ArrayList;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.SerializerCache;
import p545v6.C35728q;
import p715kotlin.jvm.internal.AbstractC22676k;
import w01.C36680e;

/* JADX INFO: renamed from: wc3.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC37146k {

    /* JADX INFO: renamed from: a */
    public static final SerializerCache f158891a = CachingKt.createCache(new C36680e(27));

    /* JADX INFO: renamed from: b */
    public static final SerializerCache f158892b = CachingKt.createCache(new C36680e(28));

    /* JADX INFO: renamed from: c */
    public static final ParametrizedSerializerCache f158893c;

    /* JADX INFO: renamed from: d */
    public static final ParametrizedSerializerCache f158894d;

    static {
        byte b = 0;
        f158893c = CachingKt.createParametrizedCache(new C35728q(14, b));
        f158894d = CachingKt.createParametrizedCache(new C35728q(15, b));
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC37138c m119062a(InterfaceC21461d clazz, boolean z4) {
        AbstractC22676k.m65750j(clazz, "clazz");
        if (z4) {
            return f158892b.get(clazz);
        }
        InterfaceC37138c interfaceC37138c = f158891a.get(clazz);
        if (interfaceC37138c != null) {
            return interfaceC37138c;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m119063b(InterfaceC21461d clazz, ArrayList arrayList, boolean z4) {
        AbstractC22676k.m65750j(clazz, "clazz");
        return !z4 ? f158893c.mo134409getgIAlus(clazz, arrayList) : f158894d.mo134409getgIAlus(clazz, arrayList);
    }
}
