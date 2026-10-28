package p390p1;

/* JADX INFO: renamed from: p1.b1 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC28597b1 extends InterfaceC28601c1, InterfaceC28670t2 {
    @Override // p390p1.InterfaceC28670t2
    default Object getValue() {
        return Long.valueOf(((C28625i1) this).m87032x());
    }

    @Override // p390p1.InterfaceC28601c1
    default void setValue(Object obj) {
        ((C28625i1) this).m87033y(((Number) obj).longValue());
    }
}
