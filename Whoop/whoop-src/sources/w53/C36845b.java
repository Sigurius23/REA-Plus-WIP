package w53;

import bc3.InterfaceC2994c0;
import e63.InterfaceC12773b;
import f63.AbstractC14155c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o63.C27610a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import v53.C35709c;

/* JADX INFO: renamed from: w53.b */
/* JADX INFO: loaded from: classes5.dex */
public class C36845b implements InterfaceC2994c0 {

    /* JADX INFO: renamed from: E */
    public static final C27610a f157613E = new C27610a("CustomResponse");

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f157614z = AtomicIntegerFieldUpdater.newUpdater(C36845b.class, "received");
    private volatile /* synthetic */ int received = 0;

    /* JADX INFO: renamed from: w */
    public final C35709c f157615w;

    /* JADX INFO: renamed from: x */
    public InterfaceC12773b f157616x;

    /* JADX INFO: renamed from: y */
    public AbstractC14155c f157617y;

    public C36845b(C35709c c35709c) {
        this.f157615w = c35709c;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:49:0x00b9, B:54:0x00c9, B:57:0x00d9, B:58:0x00ee), top: B:66:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:49:0x00b9, B:54:0x00c9, B:57:0x00d9, B:58:0x00ee), top: B:66:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        if (r8 == r1) goto L47;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m118137a(s63.C32236a r7, q83.InterfaceC30057d r8) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w53.C36845b.m118137a(s63.a, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public boolean mo118138b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC12773b m118139c() {
        InterfaceC12773b interfaceC12773b = this.f157616x;
        if (interfaceC12773b != null) {
            return interfaceC12773b;
        }
        AbstractC22676k.m65757q("request");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC14155c m118140d() {
        AbstractC14155c abstractC14155c = this.f157617y;
        if (abstractC14155c != null) {
            return abstractC14155c;
        }
        AbstractC22676k.m65757q("response");
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public Object mo118141e() {
        return m118140d().mo13322b();
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return m118140d().getCoroutineContext();
    }

    public final String toString() {
        return "HttpClientCall[" + m118139c().getUrl() + ", " + m118140d().mo13325e() + ']';
    }
}
