package io.ktor.utils.p228io.internal;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: io.ktor.utils.io.internal.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C20001k extends AbstractC20003m {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f75060c;

    /* JADX INFO: renamed from: d */
    public final C20000j f75061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20001k(C20000j c20000j, int i13) {
        super(c20000j.f75063a, c20000j.f75064b);
        this.f75060c = i13;
        switch (i13) {
            case 1:
                super(c20000j.f75063a, c20000j.f75064b);
                this.f75061d = c20000j;
                break;
            case 2:
                super(c20000j.f75063a, c20000j.f75064b);
                this.f75061d = c20000j;
                break;
            default:
                this.f75061d = c20000j;
                break;
        }
    }

    @Override // io.ktor.utils.p228io.internal.AbstractC20003m
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo55801a() {
        switch (this.f75060c) {
            case 0:
                return this.f75061d.f75055d;
            case 1:
                return this.f75061d.f75055d;
            default:
                return super.mo55801a();
        }
    }

    @Override // io.ktor.utils.p228io.internal.AbstractC20003m
    /* JADX INFO: renamed from: b */
    public ByteBuffer mo55802b() {
        switch (this.f75060c) {
            case 1:
                return this.f75061d.f75054c;
            case 2:
                return this.f75061d.f75054c;
            default:
                return super.mo55802b();
        }
    }

    @Override // io.ktor.utils.p228io.internal.AbstractC20003m
    /* JADX INFO: renamed from: c */
    public AbstractC20003m mo55799c() {
        switch (this.f75060c) {
            case 2:
                return this.f75061d.f75059h;
            default:
                return super.mo55799c();
        }
    }

    @Override // io.ktor.utils.p228io.internal.AbstractC20003m
    /* JADX INFO: renamed from: d */
    public AbstractC20003m mo55800d() {
        switch (this.f75060c) {
            case 0:
                return this.f75061d.f75059h;
            default:
                return super.mo55800d();
        }
    }

    @Override // io.ktor.utils.p228io.internal.AbstractC20003m
    /* JADX INFO: renamed from: e */
    public AbstractC20003m mo55803e() {
        switch (this.f75060c) {
            case 0:
                return this.f75061d.f75056e;
            case 1:
                return this.f75061d.f75058g;
            default:
                return super.mo55803e();
        }
    }

    @Override // io.ktor.utils.p228io.internal.AbstractC20003m
    /* JADX INFO: renamed from: f */
    public AbstractC20003m mo55804f() {
        switch (this.f75060c) {
            case 1:
                return this.f75061d.f75057f;
            case 2:
                return this.f75061d.f75056e;
            default:
                return super.mo55804f();
        }
    }

    public final String toString() {
        switch (this.f75060c) {
            case 0:
                return "Reading";
            case 1:
                return "Reading+Writing";
            default:
                return "Writing";
        }
    }
}
