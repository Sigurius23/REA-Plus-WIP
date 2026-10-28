package r63;

import ge3.AbstractC15751g;
import io.ktor.utils.p228io.AbstractC20031x;
import java.util.List;
import l83.C23467m;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: r63.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C30999k extends AbstractC30993e {

    /* JADX INFO: renamed from: E */
    public final InterfaceC30057d[] f127975E;

    /* JADX INFO: renamed from: F */
    public int f127976F;

    /* JADX INFO: renamed from: G */
    public int f127977G;

    /* JADX INFO: renamed from: x */
    public final List f127978x;

    /* JADX INFO: renamed from: y */
    public final C30998j f127979y;

    /* JADX INFO: renamed from: z */
    public Object f127980z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30999k(Object initial, Object context, List blocks) {
        super(context);
        AbstractC22676k.m65750j(initial, "initial");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(blocks, "blocks");
        this.f127978x = blocks;
        this.f127979y = new C30998j(this);
        this.f127980z = initial;
        this.f127975E = new InterfaceC30057d[blocks.size()];
        this.f127976F = -1;
    }

    @Override // r63.AbstractC30993e
    /* JADX INFO: renamed from: a */
    public final Object mo95523a(Object obj, AbstractC32269c abstractC32269c) {
        this.f127977G = 0;
        if (this.f127978x.size() == 0) {
            return obj;
        }
        AbstractC22676k.m65750j(obj, "<set-?>");
        this.f127980z = obj;
        if (this.f127976F < 0) {
            return mo95525c(abstractC32269c);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // r63.AbstractC30993e
    /* JADX INFO: renamed from: b */
    public final Object mo95524b() {
        return this.f127980z;
    }

    @Override // r63.AbstractC30993e
    /* JADX INFO: renamed from: c */
    public final Object mo95525c(InterfaceC30057d frame) {
        Object obj;
        if (this.f127977G == this.f127978x.size()) {
            obj = this.f127980z;
        } else {
            InterfaceC30057d interfaceC30057dM44424D = AbstractC15751g.m44424D(frame);
            int i13 = this.f127976F + 1;
            this.f127976F = i13;
            InterfaceC30057d[] interfaceC30057dArr = this.f127975E;
            interfaceC30057dArr[i13] = interfaceC30057dM44424D;
            if (m95534e(true)) {
                int i14 = this.f127976F;
                if (i14 < 0) {
                    throw new IllegalStateException("No more continuations to resume");
                }
                this.f127976F = i14 - 1;
                interfaceC30057dArr[i14] = null;
                obj = this.f127980z;
            } else {
                obj = EnumC31071a.f128113w;
            }
        }
        if (obj == EnumC31071a.f128113w) {
            AbstractC22676k.m65750j(frame, "frame");
        }
        return obj;
    }

    @Override // r63.AbstractC30993e
    /* JADX INFO: renamed from: d */
    public final Object mo95526d(Object obj, InterfaceC30057d interfaceC30057d) {
        AbstractC22676k.m65750j(obj, "<set-?>");
        this.f127980z = obj;
        return mo95525c(interfaceC30057d);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m95534e(boolean z4) {
        int i13;
        List list;
        do {
            i13 = this.f127977G;
            list = this.f127978x;
            if (i13 == list.size()) {
                if (z4) {
                    return true;
                }
                m95535f(this.f127980z);
                return false;
            }
            this.f127977G = i13 + 1;
            try {
            } catch (Throwable th3) {
                m95535f(AbstractC34132o.m107888l(th3));
                return false;
            }
        } while (((Function3) list.get(i13)).invoke(this, this.f127980z, this.f127979y) != EnumC31071a.f128113w);
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m95535f(Object obj) {
        Throwable thM55864b;
        int i13 = this.f127976F;
        if (i13 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        InterfaceC30057d[] interfaceC30057dArr = this.f127975E;
        InterfaceC30057d interfaceC30057d = interfaceC30057dArr[i13];
        AbstractC22676k.m65747g(interfaceC30057d);
        int i14 = this.f127976F;
        this.f127976F = i14 - 1;
        interfaceC30057dArr[i14] = null;
        if (!(obj instanceof C23467m)) {
            interfaceC30057d.resumeWith(obj);
            return;
        }
        Throwable thM68037a = C23468n.m68037a(obj);
        AbstractC22676k.m65747g(thM68037a);
        try {
            Throwable cause = thM68037a.getCause();
            if (cause != null && !AbstractC22676k.m65745e(thM68037a.getCause(), cause) && (thM55864b = AbstractC20031x.m55864b(thM68037a, cause)) != null) {
                thM55864b.setStackTrace(thM68037a.getStackTrace());
                thM68037a = thM55864b;
            }
        } catch (Throwable unused) {
        }
        interfaceC30057d.resumeWith(AbstractC34132o.m107888l(thM68037a));
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f127979y.getContext();
    }
}
