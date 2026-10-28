package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import bi.AbstractC3269g;
import j93.InterfaceC21461d;
import java.lang.reflect.Constructor;
import p249jc.AbstractC21598x;
import p298l8.AbstractC23420c;
import p399pb.C29047d;
import p399pb.InterfaceC29049f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1625s1 extends AbstractC1571c2 implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: a */
    public final Application f6308a;

    /* JADX INFO: renamed from: b */
    public final C1646z1 f6309b;

    /* JADX INFO: renamed from: c */
    public final Bundle f6310c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1638x f6311d;

    /* JADX INFO: renamed from: e */
    public final C29047d f6312e;

    public C1625s1(Application application, InterfaceC29049f interfaceC29049f, Bundle bundle) {
        C1646z1 c1646z1;
        this.f6312e = interfaceC29049f.getSavedStateRegistry();
        this.f6311d = interfaceC29049f.getLifecycle();
        this.f6310c = bundle;
        this.f6308a = application;
        if (application != null) {
            if (C1646z1.f6352c == null) {
                C1646z1.f6352c = new C1646z1(application);
            }
            c1646z1 = C1646z1.f6352c;
            AbstractC22676k.m65747g(c1646z1);
        } else {
            c1646z1 = new C1646z1(null);
        }
        this.f6309b = c1646z1;
    }

    @Override // androidx.lifecycle.AbstractC1571c2
    /* JADX INFO: renamed from: a */
    public final void mo4969a(AbstractC1637w1 abstractC1637w1) {
        AbstractC1638x abstractC1638x = this.f6311d;
        if (abstractC1638x != null) {
            C29047d c29047d = this.f6312e;
            AbstractC22676k.m65747g(c29047d);
            AbstractC1613o1.m5013c(abstractC1637w1, c29047d, abstractC1638x);
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1637w1 m5032b(Class modelClass, String str) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        AbstractC1638x abstractC1638x = this.f6311d;
        if (abstractC1638x == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC1564b.class.isAssignableFrom(modelClass);
        Application application = this.f6308a;
        Constructor constructorM5037a = (!zIsAssignableFrom || application == null) ? AbstractC1628t1.m5037a(modelClass, AbstractC1628t1.f6315b) : AbstractC1628t1.m5037a(modelClass, AbstractC1628t1.f6314a);
        if (constructorM5037a == null) {
            if (application != null) {
                return this.f6309b.create(modelClass);
            }
            if (C1567b2.f6192a == null) {
                C1567b2.f6192a = new C1567b2();
            }
            AbstractC22676k.m65747g(C1567b2.f6192a);
            return AbstractC3269g.m9516w(modelClass);
        }
        C29047d c29047d = this.f6312e;
        AbstractC22676k.m65747g(c29047d);
        C1607m1 c1607m1M5014d = AbstractC1613o1.m5014d(c29047d, abstractC1638x, str, this.f6310c);
        C1601k1 c1601k1 = c1607m1M5014d.f6279x;
        AbstractC1637w1 abstractC1637w1M5038b = (!zIsAssignableFrom || application == null) ? AbstractC1628t1.m5038b(modelClass, constructorM5037a, c1601k1) : AbstractC1628t1.m5038b(modelClass, constructorM5037a, application, c1601k1);
        abstractC1637w1M5038b.addCloseable("androidx.lifecycle.savedstate.vm.tag", c1607m1M5014d);
        return abstractC1637w1M5038b;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(InterfaceC21461d modelClass, AbstractC23420c abstractC23420c) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        return create(AbstractC21598x.m60663S(modelClass), abstractC23420c);
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class cls, AbstractC23420c extras) {
        AbstractC22676k.m65750j(extras, "extras");
        String str = (String) extras.mo67910a(C1575d2.f6204b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.mo67910a(AbstractC1613o1.f6291a) == null || extras.mo67910a(AbstractC1613o1.f6292b) == null) {
            if (this.f6311d != null) {
                return m5032b(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.mo67910a(C1646z1.f6353d);
        boolean zIsAssignableFrom = AbstractC1564b.class.isAssignableFrom(cls);
        Constructor constructorM5037a = (!zIsAssignableFrom || application == null) ? AbstractC1628t1.m5037a(cls, AbstractC1628t1.f6315b) : AbstractC1628t1.m5037a(cls, AbstractC1628t1.f6314a);
        if (constructorM5037a == null) {
            return this.f6309b.create(cls, extras);
        }
        return (!zIsAssignableFrom || application == null) ? AbstractC1628t1.m5038b(cls, constructorM5037a, AbstractC1613o1.m5015e(extras)) : AbstractC1628t1.m5038b(cls, constructorM5037a, application, AbstractC1613o1.m5015e(extras));
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class modelClass) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return m5032b(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
