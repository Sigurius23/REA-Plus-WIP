package p451r6;

import androidx.glance.appwidget.protobuf.AbstractC1368a0;
import androidx.glance.appwidget.protobuf.AbstractC1370b;
import androidx.glance.appwidget.protobuf.AbstractC1383f0;
import androidx.glance.appwidget.protobuf.AbstractC1400l;
import androidx.glance.appwidget.protobuf.C1369a1;
import androidx.glance.appwidget.protobuf.C1394j;
import androidx.glance.appwidget.protobuf.C1397k;
import androidx.glance.appwidget.protobuf.C1403m;
import androidx.glance.appwidget.protobuf.C1417s;
import androidx.glance.appwidget.protobuf.C1430y0;
import androidx.glance.appwidget.protobuf.C1431z;
import androidx.glance.appwidget.protobuf.C1432z0;
import androidx.glance.appwidget.protobuf.InterfaceC1372b1;
import androidx.glance.appwidget.protobuf.InterfaceC1380e0;
import androidx.glance.appwidget.protobuf.InterfaceC1426w0;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: r6.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C30965s extends AbstractC1368a0 {
    private static final C30965s DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile InterfaceC1426w0 PARSER;
    private InterfaceC1380e0 layout_ = C1432z0.f5996z;
    private int nextIndex_;

    static {
        C30965s c30965s = new C30965s();
        DEFAULT_INSTANCE = c30965s;
        AbstractC1368a0.m4273k(C30965s.class, c30965s);
    }

    /* JADX INFO: renamed from: n */
    public static void m95247n(C30965s c30965s, C30967u c30967u) {
        c30965s.getClass();
        InterfaceC1380e0 interfaceC1380e0 = c30965s.layout_;
        if (!((AbstractC1370b) interfaceC1380e0).f5867w) {
            int size = interfaceC1380e0.size();
            c30965s.layout_ = interfaceC1380e0.mo4286i(size == 0 ? 10 : size * 2);
        }
        c30965s.layout_.add(c30967u);
    }

    /* JADX INFO: renamed from: o */
    public static void m95248o(C30965s c30965s) {
        c30965s.getClass();
        c30965s.layout_ = C1432z0.f5996z;
    }

    /* JADX INFO: renamed from: p */
    public static void m95249p(C30965s c30965s, int i13) {
        c30965s.nextIndex_ = i13;
    }

    /* JADX INFO: renamed from: q */
    public static C30965s m95250q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static C30965s m95251t(InputStream inputStream) throws InvalidProtocolBufferException {
        AbstractC1400l c1397k;
        C30965s c30965s = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = AbstractC1383f0.f5888b;
            int length = bArr.length;
            c1397k = new C1394j(bArr, 0, length, false);
            try {
                c1397k.mo4376q(length);
            } catch (InvalidProtocolBufferException e5) {
                throw new IllegalArgumentException(e5);
            }
        } else {
            c1397k = new C1397k(inputStream);
        }
        C1417s c1417sM4512a = C1417s.m4512a();
        AbstractC1368a0 abstractC1368a0M4278j = c30965s.m4278j();
        try {
            C1430y0 c1430y0 = C1430y0.f5993c;
            c1430y0.getClass();
            InterfaceC1372b1 interfaceC1372b1M4555a = c1430y0.m4555a(abstractC1368a0M4278j.getClass());
            C1403m c1403m = (C1403m) c1397k.f5934b;
            if (c1403m == null) {
                c1403m = new C1403m(c1397k);
            }
            interfaceC1372b1M4555a.mo4291e(abstractC1368a0M4278j, c1403m, c1417sM4512a);
            interfaceC1372b1M4555a.mo4288b(abstractC1368a0M4278j);
            if (AbstractC1368a0.m4272g(abstractC1368a0M4278j, true)) {
                return (C30965s) abstractC1368a0M4278j;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e13) {
            if (e13.f5862w) {
                throw new InvalidProtocolBufferException(e13.getMessage(), e13);
            }
            throw e13;
        } catch (UninitializedMessageException e14) {
            throw new InvalidProtocolBufferException(e14.getMessage());
        } catch (IOException e15) {
            if (e15.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e15.getCause());
            }
            throw new InvalidProtocolBufferException(e15.getMessage(), e15);
        } catch (RuntimeException e16) {
            if (e16.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e16.getCause());
            }
            throw e16;
        }
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
                return new C1369a1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", C30967u.class, "nextIndex_"});
            case 3:
                return new C30965s();
            case 4:
                return new C30964r(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1426w0 interfaceC1426w0 = PARSER;
                if (interfaceC1426w0 != null) {
                    return interfaceC1426w0;
                }
                synchronized (C30965s.class) {
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

    /* JADX INFO: renamed from: r */
    public final InterfaceC1380e0 m95252r() {
        return this.layout_;
    }

    /* JADX INFO: renamed from: s */
    public final int m95253s() {
        return this.nextIndex_;
    }
}
