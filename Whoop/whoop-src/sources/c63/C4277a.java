package c63;

import f63.AbstractC14155c;
import i63.C18182u;
import i63.C18183v;
import i63.InterfaceC18174m;
import io.ktor.utils.p228io.InterfaceC20024q;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.C30006b;
import q83.InterfaceC30063j;
import w53.C36845b;

/* JADX INFO: renamed from: c63.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4277a extends AbstractC14155c {

    /* JADX INFO: renamed from: w */
    public final C36845b f17362w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC20024q f17363x;

    /* JADX INFO: renamed from: y */
    public final AbstractC14155c f17364y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC30063j f17365z;

    public C4277a(C36845b call, InterfaceC20024q content, AbstractC14155c origin) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(origin, "origin");
        this.f17362w = call;
        this.f17363x = content;
        this.f17364y = origin;
        this.f17365z = origin.getCoroutineContext();
    }

    @Override // f63.AbstractC14155c
    /* JADX INFO: renamed from: a */
    public final C36845b mo13321a() {
        return this.f17362w;
    }

    @Override // f63.AbstractC14155c
    /* JADX INFO: renamed from: b */
    public final InterfaceC20024q mo13322b() {
        return this.f17363x;
    }

    @Override // f63.AbstractC14155c
    /* JADX INFO: renamed from: c */
    public final C30006b mo13323c() {
        return this.f17364y.mo13323c();
    }

    @Override // f63.AbstractC14155c
    /* JADX INFO: renamed from: d */
    public final C30006b mo13324d() {
        return this.f17364y.mo13324d();
    }

    @Override // f63.AbstractC14155c
    /* JADX INFO: renamed from: e */
    public final C18183v mo13325e() {
        return this.f17364y.mo13325e();
    }

    @Override // f63.AbstractC14155c
    /* JADX INFO: renamed from: f */
    public final C18182u mo13326f() {
        return this.f17364y.mo13326f();
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f17365z;
    }

    @Override // i63.InterfaceC18180s
    public final InterfaceC18174m getHeaders() {
        return this.f17364y.getHeaders();
    }
}
