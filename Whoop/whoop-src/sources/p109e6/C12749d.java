package p109e6;

import androidx.datastore.preferences.protobuf.AbstractC1204c0;
import androidx.datastore.preferences.protobuf.AbstractC1230l;
import androidx.datastore.preferences.protobuf.AbstractC1265x;
import androidx.datastore.preferences.protobuf.AbstractC1269z;
import androidx.datastore.preferences.protobuf.C1224j;
import androidx.datastore.preferences.protobuf.C1227k;
import androidx.datastore.preferences.protobuf.C1231l0;
import androidx.datastore.preferences.protobuf.C1233m;
import androidx.datastore.preferences.protobuf.C1245q;
import androidx.datastore.preferences.protobuf.C1264w0;
import androidx.datastore.preferences.protobuf.C1267y;
import androidx.datastore.preferences.protobuf.C1268y0;
import androidx.datastore.preferences.protobuf.InterfaceC1258u0;
import androidx.datastore.preferences.protobuf.InterfaceC1270z0;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: e6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C12749d extends AbstractC1269z {
    private static final C12749d DEFAULT_INSTANCE;
    private static volatile InterfaceC1258u0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C1231l0 preferences_ = C1231l0.f5424x;

    static {
        C12749d c12749d = new C12749d();
        DEFAULT_INSTANCE = c12749d;
        AbstractC1269z.m4023j(C12749d.class, c12749d);
    }

    /* JADX INFO: renamed from: l */
    public static C1231l0 m35671l(C12749d c12749d) {
        C1231l0 c1231l0 = c12749d.preferences_;
        if (!c1231l0.f5425w) {
            c12749d.preferences_ = c1231l0.m3878b();
        }
        return c12749d.preferences_;
    }

    /* JADX INFO: renamed from: n */
    public static C12747b m35672n() {
        return (C12747b) ((AbstractC1265x) DEFAULT_INSTANCE.mo4024c(5));
    }

    /* JADX INFO: renamed from: o */
    public static C12749d m35673o(InputStream inputStream) throws InvalidProtocolBufferException {
        AbstractC1230l c1227k;
        C12749d c12749d = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = AbstractC1204c0.f5363b;
            int length = bArr.length;
            c1227k = new C1224j(bArr, 0, length, false);
            try {
                c1227k.mo3838l(length);
            } catch (InvalidProtocolBufferException e5) {
                throw new IllegalArgumentException(e5);
            }
        } else {
            c1227k = new C1227k(inputStream);
        }
        C1245q c1245qM3969a = C1245q.m3969a();
        AbstractC1269z abstractC1269zM4027i = c12749d.m4027i();
        try {
            C1264w0 c1264w0 = C1264w0.f5502c;
            c1264w0.getClass();
            InterfaceC1270z0 interfaceC1270z0M4012a = c1264w0.m4012a(abstractC1269zM4027i.getClass());
            C1233m c1233m = (C1233m) c1227k.f5423y;
            if (c1233m == null) {
                c1233m = new C1233m(c1227k);
            }
            interfaceC1270z0M4012a.mo3993f(abstractC1269zM4027i, c1233m, c1245qM3969a);
            interfaceC1270z0M4012a.mo3989b(abstractC1269zM4027i);
            if (AbstractC1269z.m4022f(abstractC1269zM4027i, true)) {
                return (C12749d) abstractC1269zM4027i;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e13) {
            if (e13.f5349w) {
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC1269z
    /* JADX INFO: renamed from: c */
    public final Object mo4024c(int i13) {
        InterfaceC1258u0 c1267y;
        switch (AbstractC12682p.m35485e(i13)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1268y0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC12748c.f43632a});
            case 3:
                return new C12749d();
            case 4:
                return new C12747b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1258u0 interfaceC1258u0 = PARSER;
                if (interfaceC1258u0 != null) {
                    return interfaceC1258u0;
                }
                synchronized (C12749d.class) {
                    try {
                        c1267y = PARSER;
                        if (c1267y == null) {
                            c1267y = new C1267y();
                            PARSER = c1267y;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return c1267y;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: m */
    public final Map m35674m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
