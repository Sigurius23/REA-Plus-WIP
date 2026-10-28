package e63;

import i63.C18166e0;
import i63.C18176o;
import i63.C18181t;
import i63.InterfaceC18174m;
import o63.C27615f;
import q83.InterfaceC30063j;
import w53.C36845b;

/* JADX INFO: renamed from: e63.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C12772a implements InterfaceC12773b {

    /* JADX INFO: renamed from: E */
    public final C27615f f43703E;

    /* JADX INFO: renamed from: w */
    public final C36845b f43704w;

    /* JADX INFO: renamed from: x */
    public final C18181t f43705x;

    /* JADX INFO: renamed from: y */
    public final C18166e0 f43706y;

    /* JADX INFO: renamed from: z */
    public final C18176o f43707z;

    public C12772a(C36845b c36845b, C12776e c12776e) {
        this.f43704w = c36845b;
        this.f43705x = c12776e.f43716b;
        this.f43706y = c12776e.f43715a;
        this.f43707z = c12776e.f43717c;
        this.f43703E = c12776e.f43720f;
    }

    @Override // e63.InterfaceC12773b
    public final C27615f getAttributes() {
        return this.f43703E;
    }

    @Override // e63.InterfaceC12773b, bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f43704w.getCoroutineContext();
    }

    @Override // i63.InterfaceC18180s
    public final InterfaceC18174m getHeaders() {
        return this.f43707z;
    }

    @Override // e63.InterfaceC12773b
    public final C18181t getMethod() {
        return this.f43705x;
    }

    @Override // e63.InterfaceC12773b
    public final C18166e0 getUrl() {
        return this.f43706y;
    }
}
