package p720m91;

import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import java.util.Iterator;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;

/* JADX INFO: renamed from: m91.p */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\t*\u00020\b*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\t*\u00020\b2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lm91/p;", "", "", "Lj93/d;", "Lm91/f;", "map", "<init>", "(Ljava/util/Map;)V", "Lm91/u;", "T", "a", "(Lj93/d;)Lm91/f;", "state", "c", "(Lm91/u;)Lm91/f;", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25307p {

    /* JADX INFO: renamed from: b */
    public static final int f99300b = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<InterfaceC21461d, InterfaceC25297f<?>> map;

    /* JADX WARN: Multi-variable type inference failed */
    public C25307p(Map<InterfaceC21461d, ? extends InterfaceC25297f<?>> map) {
        AbstractC22676k.m65750j(map, "map");
        this.map = map;
    }

    /* JADX INFO: renamed from: a */
    private final <T extends InterfaceC25312u> InterfaceC25297f<T> m74319a(InterfaceC21461d interfaceC21461d) {
        Object obj = this.map.get(interfaceC21461d);
        InterfaceC25297f<T> interfaceC25297f = obj instanceof InterfaceC25297f ? (InterfaceC25297f) obj : null;
        if (interfaceC25297f != null) {
            return interfaceC25297f;
        }
        Iterator it = interfaceC21461d.getSupertypes().iterator();
        while (it.hasNext()) {
            InterfaceC21463e classifier = ((InterfaceC21456a0) it.next()).getClassifier();
            InterfaceC21461d interfaceC21461d2 = classifier instanceof InterfaceC21461d ? (InterfaceC21461d) classifier : null;
            InterfaceC25297f<T> interfaceC25297fM74319a = interfaceC21461d2 != null ? m74319a(interfaceC21461d2) : null;
            if (interfaceC25297fM74319a != null) {
                return interfaceC25297fM74319a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Map<InterfaceC21461d, InterfaceC25297f<?>> m74320b() {
        return this.map;
    }

    /* JADX INFO: renamed from: c */
    public final <T extends InterfaceC25312u> InterfaceC25297f<T> m74321c(T state) {
        AbstractC22676k.m65750j(state, "state");
        Class<?> cls = state.getClass();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC25297f<T> interfaceC25297fM74319a = m74319a(c22673i0.getOrCreateKotlinClass(cls));
        if (interfaceC25297fM74319a != null) {
            return interfaceC25297fM74319a;
        }
        throw new IllegalStateException(("No composer for item state type: " + c22673i0.getOrCreateKotlinClass(state.getClass()).getSimpleName()).toString());
    }

    public boolean equals(Object other) {
        return other instanceof C25307p;
    }
}
