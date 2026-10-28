package kotlinx.serialization.internal;

import c93.InterfaceC4339a;
import j93.InterfaceC21456a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23468n;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JE\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR4\u0010\u0011\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, m65681d2 = {"Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "T", "", "<init>", "()V", "", "Lj93/a0;", "types", "Lkotlin/Function0;", "Lwc3/c;", "producer", "Ll83/n;", "computeIfAbsent-gIAlu-s", "(Ljava/util/List;Lc93/a;)Ljava/lang/Object;", "computeIfAbsent", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/serialization/internal/KTypeWrapper;", "serializers", "Ljava/util/concurrent/ConcurrentHashMap;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class ParametrizedCacheEntry<T> {
    private final ConcurrentHashMap<List<KTypeWrapper>, C23468n> serializers = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: computeIfAbsent-gIAlu-s, reason: not valid java name */
    public final Object m134412computeIfAbsentgIAlus(List<? extends InterfaceC21456a0> types, InterfaceC4339a producer) {
        Object objM107888l;
        AbstractC22676k.m65750j(types, "types");
        AbstractC22676k.m65750j(producer, "producer");
        List<? extends InterfaceC21456a0> list = types;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeWrapper((InterfaceC21456a0) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = this.serializers;
        Object c23468n = concurrentHashMap.get(arrayList);
        if (c23468n == null) {
            try {
                objM107888l = (InterfaceC37138c) producer.invoke();
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            c23468n = new C23468n(objM107888l);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, c23468n);
            if (objPutIfAbsent != null) {
                c23468n = objPutIfAbsent;
            }
        }
        return ((C23468n) c23468n).f92940w;
    }
}
