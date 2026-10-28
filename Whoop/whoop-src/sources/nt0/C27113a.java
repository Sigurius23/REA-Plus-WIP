package nt0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import lt0.C24725b;
import lt0.C24736m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: renamed from: nt0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 %2\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, m65681d2 = {"Lnt0/a;", "Lnt0/h;", "Lst0/v;", "strapGen", "Llt0/m;", "receivedPacket", "Llt0/b;", "dataPacket", "<init>", "(Lst0/v;Llt0/m;Llt0/b;)V", "Ll83/r;", "n0", "(Llt0/b;)B", "", "firstByteOffset", "numSamples", "Ljava/nio/ByteBuffer;", "payload", "", "g0", "(IILjava/nio/ByteBuffer;)[S", "o0", "h0", "(Llt0/b;)[S", "i0", "j0", "k0", "l0", "m0", "Lnt0/i;", "p0", "(Llt0/b;)Lnt0/i;", "v", "I", "c0", "()I", "expectedPacketLength", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "a", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27113a extends AbstractC27120h {

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int expectedPacketLength;

    /* JADX INFO: renamed from: nt0.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f108369a;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC32978v.MONUMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC32978v.SYMPHONY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f108369a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27113a(EnumC32978v strapGen, C24736m receivedPacket, C24725b dataPacket) {
        int i13;
        super(receivedPacket, dataPacket, null);
        AbstractC22676k.m65750j(strapGen, "strapGen");
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(dataPacket, "dataPacket");
        switch (b.f108369a[strapGen.ordinal()]) {
            case 1:
                i13 = 1928;
                break;
            case 2:
            case 3:
                i13 = 1932;
                break;
            case 4:
                i13 = 0;
                break;
            case 5:
            case 6:
                throw new IllegalStateException("R10 is not a Castle packet type; Castle uses Rev2PacketType. Check dispatch site.");
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.expectedPacketLength = i13;
    }

    /* JADX INFO: renamed from: g0 */
    private final short[] m81485g0(int firstByteOffset, int numSamples, ByteBuffer payload) {
        short[] sArr = new short[numSamples];
        payload.position(firstByteOffset);
        payload.asShortBuffer().get(sArr);
        payload.position(0);
        return sArr;
    }

    /* JADX INFO: renamed from: h0 */
    private final short[] m81486h0(C24725b dataPacket) {
        return dataPacket.m72398a0() ? m81485g0(85, 100, dataPacket.getPayload()) : new short[0];
    }

    /* JADX INFO: renamed from: i0 */
    private final short[] m81487i0(C24725b dataPacket) {
        return dataPacket.m72398a0() ? m81485g0(285, 100, dataPacket.getPayload()) : new short[0];
    }

    /* JADX INFO: renamed from: j0 */
    private final short[] m81488j0(C24725b dataPacket) {
        return dataPacket.m72398a0() ? m81485g0(485, 100, dataPacket.getPayload()) : new short[0];
    }

    /* JADX INFO: renamed from: k0 */
    private final short[] m81489k0(C24725b dataPacket) {
        return dataPacket.m72398a0() ? m81493o0(688, 100, dataPacket.getPayload()) : new short[0];
    }

    /* JADX INFO: renamed from: l0 */
    private final short[] m81490l0(C24725b dataPacket) {
        return dataPacket.m72398a0() ? m81493o0(888, 100, dataPacket.getPayload()) : new short[0];
    }

    /* JADX INFO: renamed from: m0 */
    private final short[] m81491m0(C24725b dataPacket) {
        return dataPacket.m72398a0() ? m81493o0(1088, 100, dataPacket.getPayload()) : new short[0];
    }

    /* JADX INFO: renamed from: n0 */
    private final byte m81492n0(C24725b dataPacket) {
        if (dataPacket.m72398a0()) {
            return dataPacket.getPayload().get(17);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: o0 */
    private final short[] m81493o0(int firstByteOffset, int numSamples, ByteBuffer payload) {
        short[] sArr = new short[numSamples];
        payload.position(firstByteOffset);
        payload.asShortBuffer().get(sArr);
        payload.position(0);
        return sArr;
    }

    @Override // nt0.AbstractC27120h
    /* JADX INFO: renamed from: c0, reason: from getter */
    public int getExpectedPacketLength() {
        return this.expectedPacketLength;
    }

    /* JADX INFO: renamed from: p0 */
    public final C27121i m81495p0(C24725b dataPacket) {
        AbstractC22676k.m65750j(dataPacket, "dataPacket");
        return new C27121i(dataPacket.m72399L(), dataPacket.m72393V(), dataPacket.m72394W(), m81492n0(dataPacket), m81486h0(dataPacket), m81487i0(dataPacket), m81488j0(dataPacket), m81489k0(dataPacket), m81490l0(dataPacket), m81491m0(dataPacket), null);
    }
}
