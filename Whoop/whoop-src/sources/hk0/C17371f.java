package hk0;

import fk2.C14554a;
import java.nio.ByteBuffer;
import ot0.InterfaceC28324b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import uk0.C35048b;

/* JADX INFO: renamed from: hk0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m65681d2 = {"Lhk0/f;", "Lhk0/b;", "Lot0/b;", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "e", "Ljava/lang/String;", "getPacketName", "()Ljava/lang/String;", "packetName", "Lfk2/a;", "getTimestamp", "()Lfk2/a;", "timestamp", "", "Y", "()Ljava/lang/Integer;", "firmwareEventType", "f", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17371f extends C17367b implements InterfaceC28324b {

    /* JADX INFO: renamed from: f */
    private static final a f67292f = new a(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String packetName;

    /* JADX INFO: renamed from: hk0.f$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lhk0/f$a;", "", "<init>", "()V", "", "EVENT_ID_SIZE_BYTES", "I", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17371f(ByteBuffer buffer) {
        super(buffer);
        AbstractC22676k.m65750j(buffer, "buffer");
        this.packetName = "Rev2EventPacket";
    }

    /* JADX INFO: renamed from: Y */
    public final Integer m49185Y() {
        if (getBuffer().limit() >= 22) {
            return Integer.valueOf(C35048b.f148538a.m110786e(getBuffer().getShort(20)));
        }
        return null;
    }

    @Override // ot0.InterfaceC28324b
    public C14554a getTimestamp() {
        return m49180X();
    }
}
