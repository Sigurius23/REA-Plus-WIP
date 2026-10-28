package dk0;

import java.nio.ByteBuffer;
import lt0.C24725b;
import or2.AbstractC28174k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;

/* JADX INFO: renamed from: dk0.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u000f\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u001e\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010 \u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\"\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\u0011R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010,\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b+\u0010)¨\u0006-"}, m65681d2 = {"Ldk0/j;", "Llt0/b;", "Ljava/nio/ByteBuffer;", "rawData", "payload", "<init>", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V", "", "shortValue", "position", "b0", "(II)I", "", "Q", "()J", "dataSequenceNumber", "m0", "()I", "statusFlags", "", "d0", "()S", "heartKeyArrhythmiaCheckResult", "e0", "heartKeyArrhythmiaCheckStatus", "h0", "heartKeyProgressPercentage", "i0", "heartKeyUnreadableReason", "f0", "heartKeyAverageHr", "g0", "heartKeyHeartRate", "l0", "numOfEcgSamples", "", "c0", "()[S", "filteredEcgData", "", "j0", "()Z", "hkRunning", "k0", "leadsOn", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12110j extends C24725b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12110j(ByteBuffer rawData, ByteBuffer payload) {
        super(payload, rawData);
        AbstractC22676k.m65750j(rawData, "rawData");
        AbstractC22676k.m65750j(payload, "payload");
    }

    /* JADX INFO: renamed from: b0 */
    private final int m33456b0(int shortValue, int position) {
        return (shortValue & (1 << position)) != 0 ? 1 : 0;
    }

    @Override // lt0.C24725b
    /* JADX INFO: renamed from: Q */
    public long mo33457Q() {
        return C35048b.m110783d(getPayload().getInt(3));
    }

    /* JADX INFO: renamed from: c0 */
    public final short[] m33458c0() {
        return AbstractC28174k.m85287b(26, m33467l0(), getPayload(), null, 8, null);
    }

    /* JADX INFO: renamed from: d0 */
    public final short m33459d0() {
        return C35048b.m110782b(getPayload().get(15));
    }

    /* JADX INFO: renamed from: e0 */
    public final short m33460e0() {
        return C35048b.m110782b(getPayload().get(16));
    }

    /* JADX INFO: renamed from: f0 */
    public final short m33461f0() {
        return C35048b.m110782b(getPayload().get(19));
    }

    /* JADX INFO: renamed from: g0 */
    public final short m33462g0() {
        return C35048b.m110782b(getPayload().get(20));
    }

    /* JADX INFO: renamed from: h0 */
    public final short m33463h0() {
        return C35048b.m110782b(getPayload().get(17));
    }

    /* JADX INFO: renamed from: i0 */
    public final short m33464i0() {
        return C35048b.m110782b(getPayload().get(18));
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m33465j0() {
        return m33456b0(m33468m0(), 9) == 1;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m33466k0() {
        return m33456b0(m33468m0(), 11) == 1;
    }

    /* JADX INFO: renamed from: l0 */
    public final int m33467l0() {
        return C35048b.f148538a.m110786e(getPayload().getShort(24));
    }

    /* JADX INFO: renamed from: m0 */
    public final int m33468m0() {
        return C35048b.f148538a.m110786e(getPayload().getShort(13));
    }
}
