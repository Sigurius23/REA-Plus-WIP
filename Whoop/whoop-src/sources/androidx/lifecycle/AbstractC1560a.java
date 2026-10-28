package androidx.lifecycle;

import android.os.Bundle;
import p298l8.AbstractC23420c;
import p399pb.C29047d;
import p399pb.InterfaceC29049f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1560a extends AbstractC1571c2 implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: a */
    public final C29047d f6182a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1638x f6183b;

    /* JADX INFO: renamed from: c */
    public final Bundle f6184c;

    public AbstractC1560a(InterfaceC29049f owner, Bundle bundle) {
        AbstractC22676k.m65750j(owner, "owner");
        this.f6182a = owner.getSavedStateRegistry();
        this.f6183b = owner.getLifecycle();
        this.f6184c = bundle;
    }

    @Override // androidx.lifecycle.AbstractC1571c2
    /* JADX INFO: renamed from: a */
    public final void mo4969a(AbstractC1637w1 abstractC1637w1) {
        C29047d c29047d = this.f6182a;
        if (c29047d != null) {
            AbstractC1638x abstractC1638x = this.f6183b;
            AbstractC22676k.m65747g(abstractC1638x);
            AbstractC1613o1.m5013c(abstractC1637w1, c29047d, abstractC1638x);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC1637w1 mo4970b(String str, Class cls, C1601k1 c1601k1);

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class cls, AbstractC23420c extras) {
        AbstractC22676k.m65750j(extras, "extras");
        String str = (String) extras.mo67910a(C1575d2.f6204b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        C29047d c29047d = this.f6182a;
        if (c29047d == null) {
            return mo4970b(str, cls, AbstractC1613o1.m5015e(extras));
        }
        AbstractC22676k.m65747g(c29047d);
        AbstractC1638x abstractC1638x = this.f6183b;
        AbstractC22676k.m65747g(abstractC1638x);
        C1607m1 c1607m1M5014d = AbstractC1613o1.m5014d(c29047d, abstractC1638x, str, this.f6184c);
        AbstractC1637w1 abstractC1637w1Mo4970b = mo4970b(str, cls, c1607m1M5014d.f6279x);
        abstractC1637w1Mo4970b.addCloseable("androidx.lifecycle.savedstate.vm.tag", c1607m1M5014d);
        return abstractC1637w1Mo4970b;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class modelClass) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            AbstractC1638x abstractC1638x = this.f6183b;
            if (abstractC1638x != null) {
                C29047d c29047d = this.f6182a;
                AbstractC22676k.m65747g(c29047d);
                AbstractC22676k.m65747g(abstractC1638x);
                C1607m1 c1607m1M5014d = AbstractC1613o1.m5014d(c29047d, abstractC1638x, canonicalName, this.f6184c);
                AbstractC1637w1 abstractC1637w1Mo4970b = mo4970b(canonicalName, modelClass, c1607m1M5014d.f6279x);
                abstractC1637w1Mo4970b.addCloseable("androidx.lifecycle.savedstate.vm.tag", c1607m1M5014d);
                return abstractC1637w1Mo4970b;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
