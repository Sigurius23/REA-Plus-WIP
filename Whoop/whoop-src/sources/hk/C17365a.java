package hk;

import fk.InterfaceC14544a;
import p108e4.AbstractC12682p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hk.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C17365a implements InterfaceC14544a {

    /* JADX INFO: renamed from: a */
    public static final C17365a f67285a = new C17365a();

    /* JADX INFO: renamed from: a */
    public static void m49172a(int i13, String str) {
        if (AbstractC12682p.m35482b(2, i13) <= 0) {
            System.out.println((Object) str);
        }
    }

    @Override // fk.InterfaceC14544a
    public final void debug(String message) {
        AbstractC22676k.m65750j(message, "message");
        m49172a(1, message);
    }

    @Override // fk.InterfaceC14544a
    public final void error(String message) {
        AbstractC22676k.m65750j(message, "message");
        m49172a(4, message);
    }

    @Override // fk.InterfaceC14544a
    public final void info(String str) {
        m49172a(2, str);
    }

    @Override // fk.InterfaceC14544a
    public final void warn(String message) {
        AbstractC22676k.m65750j(message, "message");
        m49172a(3, message);
    }
}
