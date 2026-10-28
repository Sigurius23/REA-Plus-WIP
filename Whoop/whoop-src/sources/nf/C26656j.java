package nf;

import md0.C25447b;
import p333n4.C26250f;
import p581we.C37199o;
import p581we.EnumC37179c;
import p581we.EnumC37181d;
import p581we.EnumC37183e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nf.j */
/* JADX INFO: loaded from: classes.dex */
public final class C26656j implements InterfaceC26651e {

    /* JADX INFO: renamed from: a */
    public final String f105947a;

    /* JADX INFO: renamed from: b */
    public final C26653g f105948b;

    public C26656j(String str, C37199o awsSigner) {
        AbstractC22676k.m65750j(awsSigner, "awsSigner");
        C26250f c26250f = new C26250f();
        c26250f.f104376f = EnumC37179c.f158974w;
        c26250f.f104377g = EnumC37183e.SIGV4;
        c26250f.f104372b = true;
        c26250f.f104373c = true;
        c26250f.f104378h = EnumC37181d.f158979w;
        c26250f.f104379i = new C25447b(28);
        c26250f.f104374d = awsSigner;
        c26250f.f104375e = str;
        this.f105947a = "aws.auth#sigv4";
        this.f105948b = new C26653g(c26250f);
    }

    @Override // nf.InterfaceC26651e
    /* JADX INFO: renamed from: b */
    public final InterfaceC26655i mo79291b() {
        return this.f105948b;
    }

    @Override // nf.InterfaceC26651e
    /* JADX INFO: renamed from: c */
    public final String mo79292c() {
        return this.f105947a;
    }
}
