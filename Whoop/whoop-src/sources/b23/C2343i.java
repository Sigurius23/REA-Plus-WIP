package b23;

/* JADX INFO: renamed from: b23.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C2343i {

    /* JADX INFO: renamed from: b */
    public static boolean f9270b;

    /* JADX INFO: renamed from: a */
    public static final C2343i f9269a = new C2343i();

    /* JADX INFO: renamed from: c */
    public static volatile InterfaceC2344j f9271c = C2338d.f9260a;

    /* JADX INFO: renamed from: d */
    public static volatile InterfaceC2339e f9272d = new C2342h(0);

    /* JADX INFO: renamed from: a */
    public static InterfaceC2344j m7227a() {
        return f9271c;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC2339e m7228b() {
        return f9272d;
    }

    /* JADX INFO: renamed from: c */
    public static final void m7229c(InterfaceC2344j interfaceC2344j) {
        if (f9270b) {
            InterfaceC2339e interfaceC2339e = f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "StreamLog")) {
                f9271c.log(enumC2341g, "StreamLog", "The logger " + f9271c + " is already installed but you've tried to install a new logger: " + interfaceC2344j, null);
            }
        }
        f9270b = true;
        f9271c = interfaceC2344j;
    }
}
