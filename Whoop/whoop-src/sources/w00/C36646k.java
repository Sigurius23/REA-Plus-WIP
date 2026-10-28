package w00;

import java.util.Set;
import m83.C25235a0;
import p098dt.AbstractC12350b;
import v00.C35459c0;
import v00.C35460d;
import v00.EnumC35470i;
import v00.InterfaceC35457b0;
import v00.InterfaceC35487q0;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: w00.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C36646k implements InterfaceC35457b0 {

    /* JADX INFO: renamed from: a */
    public static final C36646k f157011a = new C36646k();

    /* JADX INFO: renamed from: b */
    public static final EnumC38828f4 f157012b = EnumC38828f4.f167098Q;

    @Override // v00.InterfaceC35457b0
    /* JADX INFO: renamed from: a */
    public final Set mo112526a(boolean z4) {
        C35460d c35460d = EnumC35470i.f151010x;
        if (!z4) {
            c35460d = null;
        }
        return c35460d != null ? AbstractC12350b.m34570S(c35460d) : C25235a0.f99113w;
    }

    @Override // v00.InterfaceC35457b0
    /* JADX INFO: renamed from: b */
    public final InterfaceC35487q0 mo112527b() {
        return C36628b.f156951f;
    }

    @Override // v00.InterfaceC35457b0
    /* JADX INFO: renamed from: c */
    public final boolean mo112528c(C35459c0 c35459c0) {
        EnumC38828f4 enumC38828f4 = f157012b;
        return c35459c0.m112543x(enumC38828f4.f167132w) && c35459c0.m112531H(enumC38828f4);
    }

    @Override // v00.InterfaceC35457b0
    /* JADX INFO: renamed from: d */
    public final boolean mo112529d() {
        return false;
    }

    @Override // v00.InterfaceC35457b0
    public final EnumC38828f4 getType() {
        return f157012b;
    }
}
