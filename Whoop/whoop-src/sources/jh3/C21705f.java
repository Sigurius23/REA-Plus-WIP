package jh3;

import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: jh3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C21705f {

    /* JADX INFO: renamed from: f */
    public static final C21705f f83334f = new C21705f();

    /* JADX INFO: renamed from: g */
    public static final C21703d f83335g = new C21703d();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f83336a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final AtomicReference f83337b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final AtomicReference f83338c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f83339d = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final AtomicReference f83340e = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public static Object m61156d(Class cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            try {
                for (Map.Entry entry : properties2.entrySet()) {
                    String string = entry.getKey().toString();
                    if (string.startsWith("rxjava.plugin.") && string.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                        String str = "rxjava.plugin." + string.substring(0, string.length() - 6).substring(14) + ".impl";
                        property = properties2.getProperty(str);
                        if (property != null) {
                            break;
                        }
                        throw new IllegalStateException("Implementing class declaration for " + simpleName + " missing: " + str);
                    }
                }
            } catch (SecurityException e5) {
                e5.printStackTrace();
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (ClassCastException e13) {
            throw new IllegalStateException(simpleName + " implementation is not an instance of " + simpleName + ": " + property, e13);
        } catch (ClassNotFoundException e14) {
            throw new IllegalStateException(AbstractC18489d0.m53370k(simpleName, " implementation class not found: ", property), e14);
        } catch (IllegalAccessException e15) {
            throw new IllegalStateException(AbstractC18489d0.m53370k(simpleName, " implementation not able to be accessed: ", property), e15);
        } catch (InstantiationException e16) {
            throw new IllegalStateException(AbstractC18489d0.m53370k(simpleName, " implementation not able to be instantiated: ", property), e16);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C21704e m61157a() {
        Properties properties;
        AtomicReference atomicReference = this.f83339d;
        if (atomicReference.get() == null) {
            try {
                properties = System.getProperties();
            } catch (SecurityException unused) {
                properties = new Properties();
            }
            Object objM61156d = m61156d(C21704e.class, properties);
            if (objM61156d == null) {
                AbstractC21702c.m61151v(atomicReference, new C21704e());
            } else {
                AbstractC21702c.m61151v(atomicReference, (C21704e) objM61156d);
            }
        }
        return (C21704e) atomicReference.get();
    }

    /* JADX INFO: renamed from: b */
    public final C21703d m61158b() {
        Properties properties;
        AtomicReference atomicReference = this.f83336a;
        if (atomicReference.get() == null) {
            try {
                properties = System.getProperties();
            } catch (SecurityException unused) {
                properties = new Properties();
            }
            Object objM61156d = m61156d(C21703d.class, properties);
            if (objM61156d == null) {
                AbstractC17176i.m48513o(atomicReference, f83335g);
            } else {
                AbstractC21702c.m61150u(atomicReference, (C21703d) objM61156d);
            }
        }
        return (C21703d) atomicReference.get();
    }

    /* JADX INFO: renamed from: c */
    public final C21701b m61159c() {
        Properties properties;
        AtomicReference atomicReference = this.f83337b;
        if (atomicReference.get() == null) {
            try {
                properties = System.getProperties();
            } catch (SecurityException unused) {
                properties = new Properties();
            }
            Object objM61156d = m61156d(C21701b.class, properties);
            if (objM61156d == null) {
                while (!atomicReference.compareAndSet(null, C21701b.f83333a) && atomicReference.get() == null) {
                }
            } else {
                C21701b c21701b = (C21701b) objM61156d;
                while (!atomicReference.compareAndSet(null, c21701b) && atomicReference.get() == null) {
                }
            }
        }
        return (C21701b) atomicReference.get();
    }

    /* JADX INFO: renamed from: e */
    public final C21706g m61160e() {
        Properties properties;
        AtomicReference atomicReference = this.f83340e;
        if (atomicReference.get() == null) {
            try {
                properties = System.getProperties();
            } catch (SecurityException unused) {
                properties = new Properties();
            }
            Object objM61156d = m61156d(C21706g.class, properties);
            if (objM61156d == null) {
                while (!atomicReference.compareAndSet(null, C21706g.f83341a) && atomicReference.get() == null) {
                }
            } else {
                C21706g c21706g = (C21706g) objM61156d;
                while (!atomicReference.compareAndSet(null, c21706g) && atomicReference.get() == null) {
                }
            }
        }
        return (C21706g) atomicReference.get();
    }

    /* JADX INFO: renamed from: f */
    public final C21707h m61161f() {
        Properties properties;
        AtomicReference atomicReference = this.f83338c;
        if (atomicReference.get() == null) {
            try {
                properties = System.getProperties();
            } catch (SecurityException unused) {
                properties = new Properties();
            }
            Object objM61156d = m61156d(C21707h.class, properties);
            if (objM61156d == null) {
                while (!atomicReference.compareAndSet(null, C21707h.f83342a) && atomicReference.get() == null) {
                }
            } else {
                C21707h c21707h = (C21707h) objM61156d;
                while (!atomicReference.compareAndSet(null, c21707h) && atomicReference.get() == null) {
                }
            }
        }
        return (C21707h) atomicReference.get();
    }
}
