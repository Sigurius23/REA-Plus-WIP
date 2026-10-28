package p005a3;

import p031b9.AbstractC2875y;
import p164g2.InterfaceC15241m;

/* JADX INFO: renamed from: a3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C0205h implements InterfaceC15241m {

    /* JADX INFO: renamed from: a */
    public static final C0205h f687a = new C0205h();

    /* JADX INFO: renamed from: b */
    public static Boolean f688b;

    /* JADX INFO: renamed from: e */
    public static boolean m532e() {
        return f688b != null;
    }

    /* JADX INFO: renamed from: f */
    public static void m533f() {
        f688b = null;
    }

    @Override // p164g2.InterfaceC15241m
    /* JADX INFO: renamed from: b */
    public final void mo534b(boolean z4) {
        f688b = Boolean.valueOf(z4);
    }

    @Override // p164g2.InterfaceC15241m
    /* JADX INFO: renamed from: c */
    public final boolean mo535c() {
        Boolean bool = f688b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AbstractC2875y.m8310w("canFocus is read before it is written");
    }
}
