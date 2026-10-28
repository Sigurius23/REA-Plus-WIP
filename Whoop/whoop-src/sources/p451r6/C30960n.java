package p451r6;

import androidx.glance.appwidget.protobuf.AbstractC1368a0;
import androidx.glance.appwidget.protobuf.C1369a1;
import androidx.glance.appwidget.protobuf.C1376d;
import androidx.glance.appwidget.protobuf.C1417s;
import androidx.glance.appwidget.protobuf.C1430y0;
import androidx.glance.appwidget.protobuf.C1431z;
import androidx.glance.appwidget.protobuf.InterfaceC1372b1;
import androidx.glance.appwidget.protobuf.InterfaceC1426w0;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import java.io.IOException;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: r6.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C30960n extends AbstractC1368a0 {
    private static final C30960n DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 3;
    public static final int LAMBDA_FIELD_NUMBER = 4;
    public static final int MY_PACKAGE_REPLACED_FIELD_NUMBER = 6;
    public static final int OPTIONS_CHANGED_FIELD_NUMBER = 2;
    private static volatile InterfaceC1426w0 PARSER = null;
    public static final int RUN_CALLBACK_FIELD_NUMBER = 5;
    public static final int UPDATE_FIELD_NUMBER = 1;
    private int requestCase_ = 0;
    private Object request_;

    static {
        C30960n c30960n = new C30960n();
        DEFAULT_INSTANCE = c30960n;
        AbstractC1368a0.m4273k(C30960n.class, c30960n);
    }

    /* JADX INFO: renamed from: E */
    public static C30947a m95227E() {
        return (C30947a) DEFAULT_INSTANCE.m4274c();
    }

    /* JADX INFO: renamed from: F */
    public static C30960n m95228F(byte[] bArr) throws InvalidProtocolBufferException {
        AbstractC1368a0 abstractC1368a0 = DEFAULT_INSTANCE;
        int length = bArr.length;
        C1417s c1417sM4512a = C1417s.m4512a();
        if (length != 0) {
            AbstractC1368a0 abstractC1368a0M4278j = abstractC1368a0.m4278j();
            try {
                C1430y0 c1430y0 = C1430y0.f5993c;
                c1430y0.getClass();
                InterfaceC1372b1 interfaceC1372b1M4555a = c1430y0.m4555a(abstractC1368a0M4278j.getClass());
                C1376d c1376d = new C1376d();
                c1417sM4512a.getClass();
                interfaceC1372b1M4555a.mo4293g(abstractC1368a0M4278j, bArr, 0, length, c1376d);
                interfaceC1372b1M4555a.mo4288b(abstractC1368a0M4278j);
                abstractC1368a0 = abstractC1368a0M4278j;
            } catch (InvalidProtocolBufferException e5) {
                if (e5.f5862w) {
                    throw new InvalidProtocolBufferException(e5.getMessage(), e5);
                }
                throw e5;
            } catch (UninitializedMessageException e13) {
                throw new InvalidProtocolBufferException(e13.getMessage());
            } catch (IOException e14) {
                if (e14.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e14.getCause());
                }
                throw new InvalidProtocolBufferException(e14.getMessage(), e14);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.m4267g();
            }
        }
        if (abstractC1368a0 == null || AbstractC1368a0.m4272g(abstractC1368a0, true)) {
            return (C30960n) abstractC1368a0;
        }
        throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
    }

    /* JADX INFO: renamed from: n */
    public static void m95229n(C30960n c30960n, C30959m c30959m) {
        c30960n.getClass();
        c30960n.request_ = c30959m;
        c30960n.requestCase_ = 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m95230o(C30960n c30960n, C30955i c30955i) {
        c30960n.getClass();
        c30960n.request_ = c30955i;
        c30960n.requestCase_ = 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m95231p(C30960n c30960n, C30949c c30949c) {
        c30960n.getClass();
        c30960n.request_ = c30949c;
        c30960n.requestCase_ = 3;
    }

    /* JADX INFO: renamed from: q */
    public static void m95232q(C30960n c30960n, C30951e c30951e) {
        c30960n.getClass();
        c30960n.request_ = c30951e;
        c30960n.requestCase_ = 4;
    }

    /* JADX INFO: renamed from: r */
    public static void m95233r(C30960n c30960n, C30957k c30957k) {
        c30960n.getClass();
        c30960n.request_ = c30957k;
        c30960n.requestCase_ = 5;
    }

    /* JADX INFO: renamed from: s */
    public static void m95234s(C30960n c30960n, C30953g c30953g) {
        c30960n.getClass();
        c30960n.request_ = c30953g;
        c30960n.requestCase_ = 6;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m95235A() {
        return this.requestCase_ == 6;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m95236B() {
        return this.requestCase_ == 2;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m95237C() {
        return this.requestCase_ == 5;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m95238D() {
        return this.requestCase_ == 1;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1368a0
    /* JADX INFO: renamed from: d */
    public final Object mo4275d(int i13) {
        InterfaceC1426w0 c1431z;
        switch (AbstractC12682p.m35485e(i13)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1369a1(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"request_", "requestCase_", C30959m.class, C30955i.class, C30949c.class, C30951e.class, C30957k.class, C30953g.class});
            case 3:
                return new C30960n();
            case 4:
                return new C30947a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1426w0 interfaceC1426w0 = PARSER;
                if (interfaceC1426w0 != null) {
                    return interfaceC1426w0;
                }
                synchronized (C30960n.class) {
                    try {
                        c1431z = PARSER;
                        if (c1431z == null) {
                            c1431z = new C1431z();
                            PARSER = c1431z;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return c1431z;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: t */
    public final C30949c m95239t() {
        return this.requestCase_ == 3 ? (C30949c) this.request_ : C30949c.m95193q();
    }

    /* JADX INFO: renamed from: u */
    public final C30951e m95240u() {
        return this.requestCase_ == 4 ? (C30951e) this.request_ : C30951e.m95200s();
    }

    /* JADX INFO: renamed from: v */
    public final C30955i m95241v() {
        return this.requestCase_ == 2 ? (C30955i) this.request_ : C30955i.m95209s();
    }

    /* JADX INFO: renamed from: w */
    public final C30957k m95242w() {
        return this.requestCase_ == 5 ? (C30957k) this.request_ : C30957k.m95217s();
    }

    /* JADX INFO: renamed from: x */
    public final C30959m m95243x() {
        return this.requestCase_ == 1 ? (C30959m) this.request_ : C30959m.m95223q();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m95244y() {
        return this.requestCase_ == 3;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m95245z() {
        return this.requestCase_ == 4;
    }
}
