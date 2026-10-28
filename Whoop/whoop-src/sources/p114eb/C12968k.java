package p114eb;

import ad3.C0783z;
import android.net.Network;
import android.os.Parcelable;
import androidx.room.C1849z1;
import bc3.AbstractC3006f0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import l83.C23470p;
import p173gj.C15903d;
import p174gk.C15922a;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34831o;
import ud3.C34837r;
import ud3.EnumC34805c1;

/* JADX INFO: renamed from: eb.k */
/* JADX INFO: loaded from: classes.dex */
public final class C12968k {

    /* JADX INFO: renamed from: a */
    public boolean f44789a;

    /* JADX INFO: renamed from: b */
    public boolean f44790b;

    /* JADX INFO: renamed from: c */
    public Object f44791c;

    /* JADX INFO: renamed from: d */
    public Object f44792d;

    public C12968k() {
        this.f44789a = true;
    }

    /* JADX INFO: renamed from: h */
    public static void m36451h(C12968k c12968k, Network network, boolean z4, boolean z13, int i13) {
        if ((i13 & 2) != 0) {
            z4 = c12968k.f44789a;
        }
        if ((i13 & 4) != 0) {
            z13 = c12968k.f44790b;
        }
        c12968k.getClass();
        if (((Network) c12968k.f44791c).equals(network)) {
            boolean z14 = (c12968k.f44789a == z4 && c12968k.f44790b == z13) ? false : true;
            c12968k.f44789a = z4;
            c12968k.f44790b = z13;
            if (z14) {
                C0783z c0783z = (C0783z) c12968k.f44792d;
                if (!z4 || z13) {
                    c0783z.m1872q();
                    return;
                }
                C15903d c15903d = (C15903d) c0783z.f2818x;
                c15903d.f60138k.debug("AndroidNetworkListener, onNetworkAvailable.");
                c15903d.f60128a.f60167p = Boolean.FALSE;
                AbstractC3006f0.m8732z(c15903d.f60130c, c15903d.f60131d, null, new C1849z1(c15903d, null, 6), 2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x00eb, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public C12971l m36452a() {
        AbstractC12958g1 c12955f1;
        Class<?> componentType;
        AbstractC12958g1 abstractC12958g1 = (AbstractC12958g1) this.f44791c;
        if (abstractC12958g1 == null) {
            Object obj = this.f44792d;
            if (obj instanceof Integer) {
                abstractC12958g1 = AbstractC12958g1.f44757b;
            } else if (obj instanceof int[]) {
                abstractC12958g1 = AbstractC12958g1.f44759d;
            } else if (obj instanceof Long) {
                abstractC12958g1 = AbstractC12958g1.f44761f;
            } else if (obj instanceof long[]) {
                abstractC12958g1 = AbstractC12958g1.f44762g;
            } else if (obj instanceof Float) {
                abstractC12958g1 = AbstractC12958g1.f44764i;
            } else if (obj instanceof float[]) {
                abstractC12958g1 = AbstractC12958g1.f44765j;
            } else if (obj instanceof Boolean) {
                abstractC12958g1 = AbstractC12958g1.f44767l;
            } else if (obj instanceof boolean[]) {
                abstractC12958g1 = AbstractC12958g1.f44768m;
            } else if ((obj instanceof String) || obj == null) {
                abstractC12958g1 = AbstractC12958g1.f44770o;
            } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                abstractC12958g1 = AbstractC12958g1.f44771p;
            } else {
                if (obj.getClass().isArray()) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    AbstractC22676k.m65747g(componentType2);
                    if (Parcelable.class.isAssignableFrom(componentType2)) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        AbstractC22676k.m65748h(componentType3, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        c12955f1 = new C12946c1(componentType3);
                    } else if (obj.getClass().isArray()) {
                        componentType = obj.getClass().getComponentType();
                        AbstractC22676k.m65747g(componentType);
                        if (Serializable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            AbstractC22676k.m65748h(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            c12955f1 = new C12952e1(componentType4);
                        } else if (obj instanceof Parcelable) {
                            c12955f1 = new C12949d1(obj.getClass());
                        } else if (obj instanceof Enum) {
                            c12955f1 = new C12943b1(obj.getClass());
                        } else {
                            if (obj instanceof Serializable) {
                                throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                            }
                            c12955f1 = new C12955f1(obj.getClass());
                        }
                    } else if (obj instanceof Parcelable) {
                        c12955f1 = new C12949d1(obj.getClass());
                    } else if (obj instanceof Enum) {
                        c12955f1 = new C12943b1(obj.getClass());
                    } else {
                        if (obj instanceof Serializable) {
                            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        c12955f1 = new C12955f1(obj.getClass());
                    }
                } else if (obj.getClass().isArray()) {
                    componentType = obj.getClass().getComponentType();
                    AbstractC22676k.m65747g(componentType);
                    if (Serializable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType5 = obj.getClass().getComponentType();
                        AbstractC22676k.m65748h(componentType5, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        c12955f1 = new C12952e1(componentType5);
                    } else if (obj instanceof Parcelable) {
                        c12955f1 = new C12949d1(obj.getClass());
                    } else if (obj instanceof Enum) {
                        c12955f1 = new C12943b1(obj.getClass());
                    } else {
                        if (obj instanceof Serializable) {
                            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        c12955f1 = new C12955f1(obj.getClass());
                    }
                } else if (obj instanceof Parcelable) {
                    c12955f1 = new C12949d1(obj.getClass());
                } else if (obj instanceof Enum) {
                    c12955f1 = new C12943b1(obj.getClass());
                } else {
                    if (obj instanceof Serializable) {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    c12955f1 = new C12955f1(obj.getClass());
                }
                abstractC12958g1 = c12955f1;
            }
        }
        return new C12971l(abstractC12958g1, this.f44789a, this.f44792d, this.f44790b);
    }

    /* JADX INFO: renamed from: b */
    public C34837r m36453b() {
        return new C34837r(this.f44789a, this.f44790b, (String[]) this.f44791c, (String[]) this.f44792d);
    }

    /* JADX INFO: renamed from: c */
    public void m36454c(String... cipherSuites) {
        AbstractC22676k.m65750j(cipherSuites, "cipherSuites");
        if (!this.f44789a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        this.f44791c = (String[]) objArrCopyOf;
    }

    /* JADX INFO: renamed from: d */
    public void m36455d(C34831o... cipherSuites) {
        AbstractC22676k.m65750j(cipherSuites, "cipherSuites");
        if (!this.f44789a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (C34831o c34831o : cipherSuites) {
            arrayList.add(c34831o.f146711a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m36454c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: e */
    public C15922a m36456e() {
        return (C15922a) ((C23470p) this.f44792d).getValue();
    }

    /* JADX INFO: renamed from: f */
    public void m36457f(String... tlsVersions) {
        AbstractC22676k.m65750j(tlsVersions, "tlsVersions");
        if (!this.f44789a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        this.f44792d = (String[]) objArrCopyOf;
    }

    /* JADX INFO: renamed from: g */
    public void m36458g(EnumC34805c1... tlsVersions) {
        AbstractC22676k.m65750j(tlsVersions, "tlsVersions");
        if (!this.f44789a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(tlsVersions.length);
        for (EnumC34805c1 enumC34805c1 : tlsVersions) {
            arrayList.add(enumC34805c1.f146542w);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m36457f((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public C12968k(C34837r connectionSpec) {
        AbstractC22676k.m65750j(connectionSpec, "connectionSpec");
        this.f44789a = connectionSpec.f146726a;
        this.f44791c = connectionSpec.f146728c;
        this.f44792d = connectionSpec.f146729d;
        this.f44790b = connectionSpec.f146727b;
    }
}
