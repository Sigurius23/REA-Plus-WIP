package p390p1;

/* JADX INFO: renamed from: p1.a1 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC28593a1 extends InterfaceC28601c1, InterfaceC28670t2 {
    @Override // p390p1.InterfaceC28670t2
    default Object getValue() {
        return Integer.valueOf(((C28621h1) this).m87024x());
    }

    @Override // p390p1.InterfaceC28601c1
    default void setValue(Object obj) {
        ((C28621h1) this).m87025y(((Number) obj).intValue());
    }
}
