package androidx.databinding;

/* JADX INFO: renamed from: androidx.databinding.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C1185o extends AbstractC1169b {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.AbstractC1169b
    /* JADX INFO: renamed from: a */
    public final void mo3719a(Object obj, AbstractC1167a abstractC1167a, int i13) {
        C1174d0 c1174d0 = ((C1196z) ((AbstractC1179i) obj)).f5347w;
        AbstractC1168a0 abstractC1168a0 = (AbstractC1168a0) c1174d0.get();
        if (abstractC1168a0 == null) {
            c1174d0.m3729a();
        }
        if (abstractC1168a0 != null && ((InterfaceC1180j) c1174d0.f5332c) == abstractC1167a) {
            abstractC1168a0.handleFieldChange(c1174d0.f5331b, abstractC1167a, i13);
        }
    }
}
