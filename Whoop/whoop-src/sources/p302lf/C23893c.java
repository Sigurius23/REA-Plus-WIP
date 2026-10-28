package p302lf;

import java.security.MessageDigest;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lf.c */
/* JADX INFO: loaded from: classes.dex */
public final class C23893c implements InterfaceC23891a {

    /* JADX INFO: renamed from: a */
    public final MessageDigest f94501a = MessageDigest.getInstance("SHA-256");

    @Override // p302lf.InterfaceC23891a
    /* JADX INFO: renamed from: a */
    public final byte[] mo70173a() {
        byte[] bArrDigest = this.f94501a.digest();
        AbstractC22676k.m65749i(bArrDigest, "digest(...)");
        return bArrDigest;
    }

    @Override // p302lf.InterfaceC23891a
    /* JADX INFO: renamed from: b */
    public final int mo70174b() {
        return 64;
    }

    @Override // p302lf.InterfaceC23891a
    public final void update(byte[] input, int i13, int i14) {
        AbstractC22676k.m65750j(input, "input");
        this.f94501a.update(input, i13, i14);
    }
}
