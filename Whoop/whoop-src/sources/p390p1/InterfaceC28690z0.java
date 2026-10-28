package p390p1;

/* JADX INFO: renamed from: p1.z0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC28690z0 extends InterfaceC28601c1, InterfaceC28670t2 {
    @Override // p390p1.InterfaceC28670t2
    default Object getValue() {
        return Float.valueOf(((C28617g1) this).m87022x());
    }

    @Override // p390p1.InterfaceC28601c1
    default void setValue(Object obj) {
        ((C28617g1) this).m87023y(((Number) obj).floatValue());
    }
}
