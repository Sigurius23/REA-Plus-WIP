package p088dc;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p002a0.C0022g;

/* JADX INFO: renamed from: dc.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11896c {

    /* JADX INFO: renamed from: a */
    public final C0022g f38884a;

    /* JADX INFO: renamed from: b */
    public final C0022g f38885b;

    /* JADX INFO: renamed from: c */
    public final C0022g f38886c;

    public AbstractC11896c(C0022g c0022g, C0022g c0022g2, C0022g c0022g3) {
        this.f38884a = c0022g;
        this.f38885b = c0022g2;
        this.f38886c = c0022g3;
    }

    /* JADX INFO: renamed from: a */
    public abstract C11897d mo32008a();

    /* JADX INFO: renamed from: b */
    public final Class m32009b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0022g c0022g = this.f38886c;
        Class cls2 = (Class) c0022g.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(AbstractC11895b.m31997p(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        c0022g.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m32010c(String str) throws NoSuchMethodException {
        C0022g c0022g = this.f38884a;
        Method method = (Method) c0022g.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC11896c.class.getClassLoader()).getDeclaredMethod("read", AbstractC11896c.class);
        c0022g.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: d */
    public final Method m32011d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0022g c0022g = this.f38885b;
        Method method = (Method) c0022g.get(name);
        if (method != null) {
            return method;
        }
        Class clsM32009b = m32009b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM32009b.getDeclaredMethod("write", cls, AbstractC11896c.class);
        c0022g.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo32012e(int i13);

    /* JADX INFO: renamed from: f */
    public final int m32013f(int i13, int i14) {
        return !mo32012e(i14) ? i13 : ((C11897d) this).f38888e.readInt();
    }

    /* JADX INFO: renamed from: g */
    public final Parcelable m32014g(Parcelable parcelable, int i13) {
        if (!mo32012e(i13)) {
            return parcelable;
        }
        return ((C11897d) this).f38888e.readParcelable(C11897d.class.getClassLoader());
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC11898e m32015h() {
        String string = ((C11897d) this).f38888e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC11898e) m32010c(string).invoke(null, mo32008a());
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e13);
        } catch (NoSuchMethodException e14) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e14);
        } catch (InvocationTargetException e15) {
            if (e15.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e15.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e15);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo32016i(int i13);

    /* JADX INFO: renamed from: j */
    public final void m32017j(int i13, int i14) {
        mo32016i(i14);
        ((C11897d) this).f38888e.writeInt(i13);
    }

    /* JADX INFO: renamed from: k */
    public final void m32018k(Parcelable parcelable, int i13) {
        mo32016i(i13);
        ((C11897d) this).f38888e.writeParcelable(parcelable, 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m32019l(InterfaceC11898e interfaceC11898e) {
        if (interfaceC11898e == null) {
            ((C11897d) this).f38888e.writeString(null);
            return;
        }
        try {
            ((C11897d) this).f38888e.writeString(m32009b(interfaceC11898e.getClass()).getName());
            C11897d c11897dMo32008a = mo32008a();
            try {
                m32011d(interfaceC11898e.getClass()).invoke(null, interfaceC11898e, c11897dMo32008a);
                Parcel parcel = c11897dMo32008a.f38888e;
                int i13 = c11897dMo32008a.f38892i;
                if (i13 >= 0) {
                    int i14 = c11897dMo32008a.f38887d.get(i13);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i14);
                    parcel.writeInt(iDataPosition - i14);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
            } catch (IllegalAccessException e13) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e13);
            } catch (NoSuchMethodException e14) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e14);
            } catch (InvocationTargetException e15) {
                if (!(e15.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e15);
                }
                throw ((RuntimeException) e15.getCause());
            }
        } catch (ClassNotFoundException e16) {
            throw new RuntimeException(interfaceC11898e.getClass().getSimpleName().concat(" does not have a Parcelizer"), e16);
        }
    }
}
