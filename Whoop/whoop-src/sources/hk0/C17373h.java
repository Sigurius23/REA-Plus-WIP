package hk0;

import com.mapbox.maps.MapboxMap;
import dk0.InterfaceC12103c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;

/* JADX INFO: renamed from: hk0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0016\u0010&\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0016\u0010(\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!¨\u0006+"}, m65681d2 = {"Lhk0/h;", "Lhk0/m;", "Ldk0/c;", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "", MapboxMap.QFE_OFFSET, "length", "", "e0", "(II)[B", "", "d0", "()Z", "Lhk0/n;", "g", "Lhk0/n;", "b0", "()Lhk0/n;", "subtype", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/String;", "K", "()Ljava/lang/String;", "packetName", "", "J", "()Ljava/lang/Long;", "numPackets", "e", "()[B", "trimPage", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "wrapCount", "n", "trimPageLittleEndian", "z", "wrapCountLittleEndian", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17373h extends AbstractC17378m implements InterfaceC12103c {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC17379n subtype;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String packetName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17373h(ByteBuffer buffer) {
        super(buffer);
        AbstractC22676k.m65750j(buffer, "buffer");
        this.subtype = EnumC17379n.HISTORY_END;
        this.packetName = "Rev2HistoryEndMetadataPacket";
    }

    /* JADX INFO: renamed from: e0 */
    private final byte[] m49187e0(int offset, int length) {
        if (!mo49188d0()) {
            return null;
        }
        byte[] bArr = new byte[length];
        for (int i13 = 0; i13 < length; i13++) {
            bArr[i13] = m49207a0().get(offset + i13);
        }
        return bArr;
    }

    @Override // dk0.InterfaceC12103c
    /* JADX INFO: renamed from: J */
    public Long mo33433J() {
        if (mo49188d0()) {
            return Long.valueOf(C35048b.m110783d(m49207a0().getInt(0)));
        }
        return null;
    }

    @Override // lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }

    @Override // hk0.AbstractC17378m
    /* JADX INFO: renamed from: b0, reason: from getter */
    public EnumC17379n getSubtype() {
        return this.subtype;
    }

    @Override // hk0.AbstractC17378m
    /* JADX INFO: renamed from: d0 */
    public boolean mo49188d0() {
        return getPayload().limit() >= 33;
    }

    @Override // dk0.InterfaceC12103c
    /* JADX INFO: renamed from: e */
    public byte[] mo33434e() {
        return m49187e0(4, 4);
    }

    @Override // dk0.InterfaceC12103c
    /* JADX INFO: renamed from: n */
    public byte[] mo33435n() {
        byte[] bArrMo33434e = mo33434e();
        if (bArrMo33434e != null) {
            return AbstractC25260n.m74035K0(bArrMo33434e);
        }
        return null;
    }

    @Override // dk0.InterfaceC12103c
    /* JADX INFO: renamed from: w */
    public byte[] mo33436w() {
        return m49187e0(8, 4);
    }

    @Override // dk0.InterfaceC12103c
    /* JADX INFO: renamed from: z */
    public byte[] mo33437z() {
        byte[] bArrMo33436w = mo33436w();
        if (bArrMo33436w != null) {
            return AbstractC25260n.m74035K0(bArrMo33436w);
        }
        return null;
    }
}
