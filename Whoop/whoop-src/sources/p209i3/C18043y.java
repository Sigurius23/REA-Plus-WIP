package p209i3;

import c93.InterfaceC4351m;

/* JADX INFO: renamed from: i3.y */
/* JADX INFO: loaded from: classes.dex */
public final class C18043y {

    /* JADX INFO: renamed from: a */
    public final String f70064a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4351m f70065b;

    /* JADX INFO: renamed from: c */
    public final boolean f70066c;

    public C18043y(String str, InterfaceC4351m interfaceC4351m) {
        this.f70064a = str;
        this.f70065b = interfaceC4351m;
    }

    /* JADX INFO: renamed from: a */
    public final void m51817a(InterfaceC18044z interfaceC18044z, Object obj) {
        ((C18030l) interfaceC18044z).m51772e(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f70064a;
    }

    public /* synthetic */ C18043y(String str) {
        this(str, C18038t.f70014S);
    }

    public C18043y(String str, int i13) {
        this(str);
        this.f70066c = true;
    }

    public C18043y(InterfaceC4351m interfaceC4351m, String str, boolean z4) {
        this(str, interfaceC4351m);
        this.f70066c = z4;
    }
}
