package zj0;

import com.mapbox.maps.MapboxMap;
import e93.AbstractC12889b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wj0.AbstractC37317a;

/* JADX INFO: renamed from: zj0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\tR\u001a\u0010\u0011\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u0011\u0010 \u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b¨\u0006!"}, m65681d2 = {"Lzj0/c;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "payload", "", MapboxMap.QFE_OFFSET, "<init>", "(Ljava/nio/ByteBuffer;I)V", "f", "I", "Y", "()I", "REVISION_LENGTH", "g", "EPOCHSECONDS_LENGTH", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "REVISION_OFFSET", "i", "EPOCHSECONDS_OFFSET", "j", "SUBSECONDS_OFFSET", "k", "a0", "revision", "", "X", "()J", "epochSeconds", "b0", "subseconds", "c0", "timeStampMillis", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40712c extends C40727h {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int REVISION_LENGTH;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int EPOCHSECONDS_LENGTH;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int REVISION_OFFSET;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int EPOCHSECONDS_OFFSET;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int SUBSECONDS_OFFSET;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int revision;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC40712c(ByteBuffer payload, int i13) {
        super(payload, null, 2, 0 == true ? 1 : 0);
        AbstractC22676k.m65750j(payload, "payload");
        this.REVISION_LENGTH = 1;
        this.EPOCHSECONDS_LENGTH = 4;
        int i14 = this.REVISION_OFFSET + 1 + i13;
        this.EPOCHSECONDS_OFFSET = i14;
        this.SUBSECONDS_OFFSET = i14 + 4 + i13;
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        this.revision = AbstractC37317a.m119536a(byteBufferM132194S.get(this.REVISION_OFFSET));
    }

    /* JADX INFO: renamed from: X */
    private final long m132181X() {
        int i13 = this.revision;
        if (i13 != 1 && i13 != 4) {
            return 0L;
        }
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return AbstractC37317a.m119538c(byteBufferM132194S.getInt(this.EPOCHSECONDS_OFFSET));
    }

    /* JADX INFO: renamed from: b0 */
    private final int m132182b0() {
        int i13 = this.revision;
        if (i13 != 1 && i13 != 4) {
            return 0;
        }
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return AbstractC37317a.m119537b(byteBufferM132194S.getShort(this.SUBSECONDS_OFFSET));
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final int getREVISION_LENGTH() {
        return this.REVISION_LENGTH;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final int getREVISION_OFFSET() {
        return this.REVISION_OFFSET;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final int getRevision() {
        return this.revision;
    }

    /* JADX INFO: renamed from: c0 */
    public final long m132186c0() {
        int i13 = this.revision;
        if (i13 != 1 && i13 != 4) {
            return 0L;
        }
        return AbstractC12889b.m36259Y(((((double) m132182b0()) * 1000.0d) / 32768.0d) + (m132181X() * 1000.0d));
    }

    public /* synthetic */ AbstractC40712c(ByteBuffer byteBuffer, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, (i14 & 2) != 0 ? 0 : i13);
    }
}
