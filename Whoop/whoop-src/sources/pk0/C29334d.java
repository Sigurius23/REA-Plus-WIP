package pk0;

import ck0.C4777a;
import hk0.AbstractC17378m;
import hk0.C17367b;
import hk0.C17368c;
import hk0.C17370e;
import hk0.C17371f;
import hk0.C17372g;
import hk0.C17373h;
import hk0.C17375j;
import hk0.C17377l;
import hk0.C17382q;
import hk0.C17383r;
import hk0.C17385t;
import hk0.C17386u;
import hk0.EnumC17379n;
import hk0.EnumC17380o;
import hk0.EnumC17381p;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import lt0.AbstractC24726c;
import lt0.EnumC24728e;
import mt0.C25932b;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import uk0.C35048b;
import zj0.C40728h0;
import zj0.C40731i0;
import zj0.C40737k0;
import zj0.C40740l0;
import zj0.C40743m0;
import zj0.C40745n0;
import zj0.C40747o0;

/* JADX INFO: renamed from: pk0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lpk0/d;", "", "<init>", "()V", "Lhk0/b;", "header", "Ljava/nio/ByteBuffer;", "payload", "Lck0/a;", "b", "(Lhk0/b;Ljava/nio/ByteBuffer;)Lck0/a;", "a", "(Ljava/nio/ByteBuffer;)Lck0/a;", "Lhk0/m;", "d", "(Lhk0/b;Ljava/nio/ByteBuffer;)Lhk0/m;", "f", "(Ljava/nio/ByteBuffer;)Lhk0/m;", "c", "(Lhk0/b;Ljava/nio/ByteBuffer;)Lhk0/b;", "g", "e", "Lmt0/b;", "framedPacket", "Llt0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lmt0/b;)Llt0/c;", "Ltr2/n;", "Ltr2/n;", "logger", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29334d {

    /* JADX INFO: renamed from: a */
    public static final C29334d f118823a = new C29334d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("Rev2PacketFactory");

    /* JADX INFO: renamed from: pk0.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f118825a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f118826b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f118827c;

        static {
            int[] iArr = new int[EnumC17380o.values().length];
            try {
                iArr[EnumC17380o.BLE_COMMAND_FRAMEWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17380o.HISTORICAL_METADATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17380o.HISTORICAL_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC17380o.REALTIME_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC17380o.INFORMATIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC17380o.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f118825a = iArr;
            int[] iArr2 = new int[EnumC17381p.values().length];
            try {
                iArr2[EnumC17381p.BLE_COMMAND_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC17381p.METADATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC17381p.PROCESSED_RESULTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC17381p.CONSOLE_LOG.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC17381p.EVENTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC17381p.DATA_SETTINGS.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EnumC17381p.RAW_DATA_STREAM.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            f118826b = iArr2;
            int[] iArr3 = new int[EnumC17379n.values().length];
            try {
                iArr3[EnumC17379n.HISTORY_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[EnumC17379n.HISTORY_START_V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[EnumC17379n.HISTORY_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[EnumC17379n.HISTORY_COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[EnumC17379n.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            f118827c = iArr3;
        }
    }

    private C29334d() {
    }

    /* JADX INFO: renamed from: a */
    private final C4777a m89282a(ByteBuffer payload) {
        int iM110786e = C35048b.f148538a.m110786e(payload.getShort(20));
        if (iM110786e == EnumC24728e.GET_HELLO.getValue()) {
            return new C40737k0(payload);
        }
        if (iM110786e == EnumC24728e.GET_CLOCK.getValue()) {
            return new C40728h0(payload);
        }
        if (iM110786e == EnumC24728e.SET_CLOCK.getValue()) {
            return new C40747o0(payload);
        }
        if (iM110786e == EnumC24728e.SEND_HISTORICAL_DATA.getValue()) {
            return new C40745n0(payload);
        }
        if (iM110786e == EnumC24728e.HISTORICAL_DATA_RESULT.getValue()) {
            return new C40740l0(payload);
        }
        if (iM110786e == EnumC24728e.ABORT_HISTORICAL_TRANSMITS.getValue()) {
            return new C40743m0(payload);
        }
        return iM110786e == EnumC24728e.GET_DATA_RANGE.getValue() ? new C40731i0(payload) : new C4777a(payload);
    }

    /* JADX INFO: renamed from: b */
    private final C4777a m89283b(C17367b header, ByteBuffer payload) {
        if (payload.limit() >= 32) {
            return a.f118826b[header.m49178V().ordinal()] == 1 ? m89282a(payload) : new C4777a(payload);
        }
        logger.mo85222m(AbstractC2875y.m8296i(payload.limit(), "Rev 2 command response truncated: ", " bytes, need 32"), new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final C17367b m89284c(C17367b header, ByteBuffer payload) {
        int i13 = a.f118826b[header.m49178V().ordinal()];
        if (i13 == 3) {
            return new C17382q(payload);
        }
        if (i13 == 4) {
            return new C17368c(payload);
        }
        if (i13 == 5) {
            return new C17371f(payload);
        }
        if (i13 != 6) {
            return i13 != 7 ? header : new C17383r(payload);
        }
        return new C17370e(payload);
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC17378m m89285d(C17367b header, ByteBuffer payload) {
        return a.f118826b[header.m49178V().ordinal()] == 2 ? m89287f(payload) : new C17385t(payload);
    }

    /* JADX INFO: renamed from: e */
    private final C17367b m89286e(C17367b header, ByteBuffer payload) {
        header.m49178V();
        return header;
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC17378m m89287f(ByteBuffer payload) {
        AbstractC17378m c17375j;
        if (payload.limit() <= 20) {
            logger.mo85222m(AbstractC2875y.m8296i(payload.limit(), "Rev 2 metadata packet has no subtype byte: ", " bytes"), new AbstractC30556a.a[0]);
            return new C17385t(payload);
        }
        int i13 = payload.get(20) & 255;
        int i14 = a.f118827c[EnumC17379n.INSTANCE.m49208a(i13).ordinal()];
        if (i14 == 1) {
            c17375j = new C17375j(payload);
        } else if (i14 == 2) {
            c17375j = new C17377l(payload);
        } else if (i14 == 3) {
            c17375j = new C17373h(payload);
        } else {
            if (i14 != 4) {
                if (i14 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                logger.mo85222m(AbstractC2875y.m8295h(i13, "Unrecognized Rev 2 metadata subtype: "), new AbstractC30556a.a[0]);
                return new C17385t(payload);
            }
            c17375j = new C17372g(payload);
        }
        if (c17375j.mo49188d0()) {
            return c17375j;
        }
        logger.mo85222m("Rev 2 " + c17375j.getSubtype() + " metadata truncated: " + payload.limit() + " bytes", new AbstractC30556a.a[0]);
        return new C17385t(payload);
    }

    /* JADX INFO: renamed from: g */
    private final C17367b m89288g(C17367b header, ByteBuffer payload) {
        header.m49178V();
        return header;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC24726c m89289h(C25932b framedPacket) {
        AbstractC22676k.m65750j(framedPacket, "framedPacket");
        ByteBuffer byteBufferM76709c = framedPacket.m76709c();
        if (byteBufferM76709c == null) {
            return null;
        }
        C17386u c17386u = new C17386u(byteBufferM76709c);
        switch (a.f118825a[c17386u.m49175S().ordinal()]) {
            case 1:
                return m89283b(c17386u, byteBufferM76709c);
            case 2:
                return m89285d(c17386u, byteBufferM76709c);
            case 3:
                return m89284c(c17386u, byteBufferM76709c);
            case 4:
                return m89288g(c17386u, byteBufferM76709c);
            case 5:
                return m89286e(c17386u, byteBufferM76709c);
            case 6:
                return c17386u;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
