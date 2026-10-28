package dk0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import lt0.AbstractC24726c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;

/* JADX INFO: renamed from: dk0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001e"}, m65681d2 = {"Ldk0/h;", "Llt0/c;", "Ljava/nio/ByteBuffer;", "rawData", "payload", "<init>", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V", "c", "Ljava/nio/ByteBuffer;", "", "d", "I", "offsetAccelY", "e", "offsetAccelZ", "f", "offsetGyroX", "g", "offsetGyroY", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "offsetGyroZ", "i", "offsetCrc", "S", "()I", "payloadSize", "Q", "numberOfAccelReadings", "R", "numberOfGyroReadings", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12108h extends AbstractC24726c {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ByteBuffer rawData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int offsetAccelY;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int offsetAccelZ;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int offsetGyroX;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int offsetGyroY;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int offsetGyroZ;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int offsetCrc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12108h(ByteBuffer rawData, ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(rawData, "rawData");
        AbstractC22676k.m65750j(payload, "payload");
        this.rawData = rawData;
        int iM33448Q = (m33448Q() * 2) + 28;
        this.offsetAccelY = iM33448Q;
        int iM33448Q2 = (m33448Q() * 2) + iM33448Q;
        this.offsetAccelZ = iM33448Q2;
        int iM33448Q3 = (m33448Q() * 2) + iM33448Q2;
        this.offsetGyroX = iM33448Q3;
        int iM33449R = (m33449R() * 2) + iM33448Q3;
        this.offsetGyroY = iM33449R;
        this.offsetGyroZ = (m33449R() * 2) + iM33449R;
        this.offsetCrc = m33450S() - 4;
    }

    /* JADX INFO: renamed from: Q */
    public final int m33448Q() {
        return C35048b.f148538a.m110786e(this.rawData.getShort(24));
    }

    /* JADX INFO: renamed from: R */
    public final int m33449R() {
        return C35048b.f148538a.m110786e(this.rawData.getShort(26));
    }

    /* JADX INFO: renamed from: S */
    public final int m33450S() {
        return C35048b.f148538a.m110786e(this.rawData.getShort(1));
    }
}
