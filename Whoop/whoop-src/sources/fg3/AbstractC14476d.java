package fg3;

import gg3.C15831d;
import hg3.AbstractC17264d;
import hg3.AbstractC17269i;
import hg3.C17263c;
import hg3.C17265e;
import hg3.C17266f;
import hg3.C17267g;
import hg3.C17268h;
import ig3.InterfaceC18476b;
import ig3.InterfaceC18478d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;
import live.hms.video.factories.MediaConstraintsFactory;
import live.hms.video.utils.HMSConstantsKt;
import p108e4.AbstractC12682p;
import p530up.AbstractC35148d;

/* JADX INFO: renamed from: fg3.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14476d {

    /* JADX INFO: renamed from: a */
    public static volatile int f52825a;

    /* JADX INFO: renamed from: b */
    public static final C17267g f52826b = new C17267g();

    /* JADX INFO: renamed from: c */
    public static final C17263c f52827c = new C17263c();

    /* JADX INFO: renamed from: d */
    public static final boolean f52828d;

    /* JADX INFO: renamed from: e */
    public static volatile InterfaceC18478d f52829e;

    /* JADX INFO: renamed from: f */
    public static final String[] f52830f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f52828d = property == null ? false : property.equalsIgnoreCase(MediaConstraintsFactory.kValueTrue);
        f52830f = new String[]{HMSConstantsKt.cJsonRpcVersion};
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m41337a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC14476d.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        InterfaceC18478d interfaceC18478d = null;
        if (property != null && !property.isEmpty()) {
            try {
                AbstractC17264d.m48848d("Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property");
                interfaceC18478d = (InterfaceC18478d) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e5) {
                AbstractC17264d.m48846b("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e5);
            } catch (ClassNotFoundException e13) {
                e = e13;
                AbstractC17264d.m48846b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e14) {
                e = e14;
                AbstractC17264d.m48846b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e15) {
                e = e15;
                AbstractC17264d.m48846b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e16) {
                e = e16;
                AbstractC17264d.m48846b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e17) {
                e = e17;
                AbstractC17264d.m48846b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (interfaceC18478d != null) {
            arrayList.add(interfaceC18478d);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(InterfaceC18478d.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: fg3.c
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(InterfaceC18478d.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((InterfaceC18478d) it.next());
            } catch (ServiceConfigurationError e18) {
                AbstractC17264d.m48845a("A service provider failed to instantiate:\n" + e18.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC14474b m41338b(Class cls) {
        int i13;
        InterfaceC14474b interfaceC14474bM41339c = m41339c(cls.getName());
        if (f52828d) {
            C17268h c17268h = AbstractC17269i.f66366a;
            Class cls2 = null;
            if (c17268h == null) {
                if (AbstractC17269i.f66367b) {
                    c17268h = null;
                } else {
                    try {
                        c17268h = new C17268h();
                    } catch (SecurityException unused) {
                        c17268h = null;
                    }
                    AbstractC17269i.f66366a = c17268h;
                    AbstractC17269i.f66367b = true;
                }
            }
            if (c17268h != null) {
                Class[] classContext = c17268h.getClassContext();
                String name = AbstractC17269i.class.getName();
                int i14 = 0;
                while (i14 < classContext.length && !name.equals(classContext[i14].getName())) {
                    i14++;
                }
                if (i14 >= classContext.length || (i13 = i14 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i13];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                AbstractC17264d.m48849e("Detected logger name mismatch. Given name: \"" + interfaceC14474bM41339c.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                AbstractC17264d.m48849e("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return interfaceC14474bM41339c;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC14474b m41339c(String str) {
        return m41340d().mo48842a().mo41314b(str);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC18478d m41340d() {
        if (f52825a == 0) {
            synchronized (AbstractC14476d.class) {
                try {
                    if (f52825a == 0) {
                        f52825a = 1;
                        m41341e();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        int i13 = f52825a;
        if (i13 == 1) {
            return f52826b;
        }
        if (i13 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i13 == 3) {
            return f52829e;
        }
        if (i13 == 4) {
            return f52827c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* JADX INFO: renamed from: e */
    public static final void m41341e() {
        try {
            ArrayList arrayListM41337a = m41337a();
            m41345i(arrayListM41337a);
            if (arrayListM41337a.isEmpty()) {
                f52825a = 4;
                AbstractC17264d.m48849e("No SLF4J providers were found.");
                AbstractC17264d.m48849e("Defaulting to no-operation (NOP) logger implementation");
                AbstractC17264d.m48849e("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC14476d.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e5) {
                    AbstractC17264d.m48846b("Error getting resources from path", e5);
                }
                m41344h(linkedHashSet);
            } else {
                f52829e = (InterfaceC18478d) arrayListM41337a.get(0);
                InterfaceC18476b interfaceC18476bMo48844c = f52829e.mo48844c();
                if (interfaceC18476bMo48844c != null) {
                    AbstractC35148d.m111163N(interfaceC18476bMo48844c);
                }
                f52829e.getClass();
                f52825a = 3;
                m41343g(arrayListM41337a);
            }
            m41342f();
            if (f52825a == 3) {
                try {
                    String strMo48843b = f52829e.mo48843b();
                    boolean z4 = false;
                    for (String str : f52830f) {
                        if (strMo48843b.startsWith(str)) {
                            z4 = true;
                        }
                    }
                    if (z4) {
                        return;
                    }
                    AbstractC17264d.m48849e("The requested version " + strMo48843b + " by your slf4j provider is not compatible with " + Arrays.asList(f52830f).toString());
                    AbstractC17264d.m48849e("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                } catch (Throwable th3) {
                    AbstractC17264d.m48846b("Unexpected problem occurred during version sanity check", th3);
                }
            }
        } catch (Exception e13) {
            f52825a = 2;
            AbstractC17264d.m48846b("Failed to instantiate SLF4J LoggerFactory", e13);
            throw new IllegalStateException("Unexpected initialization failure", e13);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m41342f() {
        C17267g c17267g = f52826b;
        synchronized (c17267g) {
            try {
                c17267g.f66364a.f66361w = true;
                C17266f c17266f = c17267g.f66364a;
                c17266f.getClass();
                for (C17265e c17265e : new ArrayList(c17266f.f66362x.values())) {
                    c17265e.m48851B(m41339c(c17265e.getName()));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = f52826b.f66364a.f66363y;
        int size = linkedBlockingQueue.size();
        ArrayList<C15831d> arrayList = new ArrayList(128);
        int i13 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C15831d c15831d : arrayList) {
                if (c15831d != null) {
                    C17265e c17265eM44668b = c15831d.m44668b();
                    String name = c17265eM44668b.getName();
                    if (c17265eM44668b.m48855z()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!c17265eM44668b.m48854y()) {
                        if (!c17265eM44668b.m48853x()) {
                            AbstractC17264d.m48849e(name);
                        } else if (c17265eM44668b.mo41334t(c15831d.m44667a())) {
                            c17265eM44668b.m48850A(c15831d);
                        }
                    }
                }
                int i14 = i13 + 1;
                if (i13 == 0) {
                    if (c15831d.m44668b().m48853x()) {
                        AbstractC17264d.m48849e("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC17264d.m48849e("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC17264d.m48849e("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!c15831d.m44668b().m48854y()) {
                        AbstractC17264d.m48849e("The following set of substitute loggers may have been accessed");
                        AbstractC17264d.m48849e("during the initialization phase. Logging calls during this");
                        AbstractC17264d.m48849e("phase were not honored. However, subsequent logging calls to these");
                        AbstractC17264d.m48849e("loggers will work as normally expected.");
                        AbstractC17264d.m48849e("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i13 = i14;
            }
            arrayList.clear();
        }
        C17266f c17266f2 = f52826b.f66364a;
        c17266f2.f66362x.clear();
        c17266f2.f66363y.clear();
    }

    /* JADX INFO: renamed from: g */
    public static void m41343g(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            AbstractC17264d.m48848d("Actual provider is of type [" + arrayList.get(0) + "]");
            return;
        }
        String str = "Connected with provider of type [" + ((InterfaceC18478d) arrayList.get(0)).getClass().getName() + "]";
        int i13 = AbstractC17264d.f66352a;
        if (AbstractC12682p.m35485e(1) >= AbstractC12682p.m35485e(AbstractC17264d.f66353b)) {
            AbstractC17264d.m48847c().println("SLF4J(D): " + str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m41344h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC17264d.m48849e("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC17264d.m48849e("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC17264d.m48849e("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* JADX INFO: renamed from: i */
    public static void m41345i(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC17264d.m48849e("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC17264d.m48849e("Found provider [" + ((InterfaceC18478d) it.next()) + "]");
            }
            AbstractC17264d.m48849e("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
