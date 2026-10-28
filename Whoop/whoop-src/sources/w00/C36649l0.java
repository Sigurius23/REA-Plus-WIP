package w00;

import java.util.Set;
import m83.C25235a0;
import v00.C35459c0;
import v00.InterfaceC35457b0;
import v00.InterfaceC35487q0;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: w00.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36649l0 implements InterfaceC35457b0 {

    /* JADX INFO: renamed from: a */
    public static final C36649l0 f157017a = new C36649l0();

    /* JADX INFO: renamed from: b */
    public static final EnumC38828f4 f157018b = EnumC38828f4.f167103V;

    @Override // v00.InterfaceC35457b0
    /* JADX INFO: renamed from: a */
    public final Set mo112526a(boolean z4) {
        return C25235a0.f99113w;
    }

    @Override // v00.InterfaceC35457b0
    /* JADX INFO: renamed from: b */
    public final InterfaceC35487q0 mo112527b() {
        return C36628b.f156963r;
    }

    @Override // v00.InterfaceC35457b0
    /* JADX INFO: renamed from: c */
    public final boolean mo112528c(C35459c0 c35459c0) {
        EnumC38828f4 enumC38828f4 = f157018b;
        return c35459c0.m112543x(enumC38828f4.f167132w) && c35459c0.m112531H(enumC38828f4);
    }

    @Override // v00.InterfaceC35457b0
    /* JADX INFO: renamed from: d */
    public final boolean mo112529d() {
        return false;
    }

    @Override // v00.InterfaceC35457b0
    public final EnumC38828f4 getType() {
        return f157018b;
    }
}
