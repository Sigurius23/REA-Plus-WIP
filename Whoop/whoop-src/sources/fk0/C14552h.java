package fk0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import ot0.C28323a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ws0.AbstractC37606b;
import ws0.C37605a;

/* JADX INFO: renamed from: fk0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lfk0/h;", "Lot0/a;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "e", "I", "revisionLength", "f", "revisionOffset", "g", "stateOfChargeOffset", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getRevision", "()I", "revision", "Lws0/a;", "i", "Lws0/a;", "T", "()Lws0/a;", "batteryLevel", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14552h extends C28323a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int revisionLength;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int revisionOffset;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int stateOfChargeOffset;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int revision;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C37605a batteryLevel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14552h(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
        this.revisionLength = 1;
        int i13 = this.revisionOffset + 1;
        this.stateOfChargeOffset = i13;
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        this.revision = byteBufferM85784Q.get(this.revisionOffset);
        ByteBuffer byteBufferM85784Q2 = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q2);
        this.batteryLevel = new C37605a(AbstractC37606b.m120660a(byteBufferM85784Q2.getShort(i13)));
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final C37605a getBatteryLevel() {
        return this.batteryLevel;
    }
}
