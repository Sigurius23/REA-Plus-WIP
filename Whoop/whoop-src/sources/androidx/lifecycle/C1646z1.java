package androidx.lifecycle;

import android.app.Application;
import bi.AbstractC3269g;
import io.sentry.hints.C20363j;
import java.lang.reflect.InvocationTargetException;
import p000.AbstractC11266d;
import p298l8.AbstractC23420c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1646z1 extends C1567b2 {

    /* JADX INFO: renamed from: c */
    public static C1646z1 f6352c;

    /* JADX INFO: renamed from: d */
    public static final C20363j f6353d = new C20363j(8);

    /* JADX INFO: renamed from: b */
    public final Application f6354b;

    public C1646z1(Application application) {
        this.f6354b = application;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1637w1 m5048a(Class cls, Application application) {
        if (!AbstractC1564b.class.isAssignableFrom(cls)) {
            return super.create(cls);
        }
        try {
            AbstractC1637w1 abstractC1637w1 = (AbstractC1637w1) cls.getConstructor(Application.class).newInstance(application);
            AbstractC22676k.m65747g(abstractC1637w1);
            return abstractC1637w1;
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(AbstractC11266d.m30459m(cls, "Cannot create an instance of "), e5);
        } catch (InstantiationException e13) {
            throw new RuntimeException(AbstractC11266d.m30459m(cls, "Cannot create an instance of "), e13);
        } catch (NoSuchMethodException e14) {
            throw new RuntimeException(AbstractC11266d.m30459m(cls, "Cannot create an instance of "), e14);
        } catch (InvocationTargetException e15) {
            throw new RuntimeException(AbstractC11266d.m30459m(cls, "Cannot create an instance of "), e15);
        }
    }

    @Override // androidx.lifecycle.C1567b2, androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class cls, AbstractC23420c extras) {
        AbstractC22676k.m65750j(extras, "extras");
        if (this.f6354b != null) {
            return create(cls);
        }
        Application application = (Application) extras.mo67910a(f6353d);
        if (application != null) {
            return m5048a(cls, application);
        }
        if (AbstractC1564b.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return AbstractC3269g.m9516w(cls);
    }

    @Override // androidx.lifecycle.C1567b2, androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class modelClass) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        Application application = this.f6354b;
        if (application != null) {
            return m5048a(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
