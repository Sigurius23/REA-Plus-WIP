package hk0;

import c93.InterfaceC4339a;
import dk0.InterfaceC12105e;
import hb1.C17089l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import oh2.C27940c;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: hk0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, m65681d2 = {"Lhk0/j;", "Lhk0/m;", "Ldk0/e;", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "d0", "()Z", "Lhk0/n;", "g", "Lhk0/n;", "b0", "()Lhk0/n;", "subtype", "Loh2/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ll83/h;", "a", "()Loh2/c;", "hardwareVersion", "Loh2/b;", "i", "d", "()Loh2/b;", "firmwareVersion", "Loh2/e;", "j", "f", "()Loh2/e;", "sigProcVersion", "", "k", "Ljava/lang/String;", "K", "()Ljava/lang/String;", "packetName", "l", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final class C17375j extends AbstractC17378m implements InterfaceC12105e {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC17379n subtype;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC23462h hardwareVersion;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC23462h firmwareVersion;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC23462h sigProcVersion;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String packetName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17375j(ByteBuffer buffer) {
        super(buffer);
        AbstractC22676k.m65750j(buffer, "buffer");
        this.subtype = EnumC17379n.HISTORY_START;
        final int i13 = 0;
        this.hardwareVersion = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: hk0.i

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C17375j f67300x;

            {
                this.f67300x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return C17375j.m49193i0(this.f67300x);
                    default:
                        return C17375j.m49194j0(this.f67300x);
                }
            }
        });
        this.firmwareVersion = AbstractC30060g.m92088H(new C17089l(11));
        final int i14 = 1;
        this.sigProcVersion = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: hk0.i

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C17375j f67300x;

            {
                this.f67300x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return C17375j.m49193i0(this.f67300x);
                    default:
                        return C17375j.m49194j0(this.f67300x);
                }
            }
        });
        this.packetName = "Rev2HistoryStartMetadataPacket";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final InterfaceC27939b.b m49192h0() {
        return new InterfaceC27939b.b(0L, 0L, 0L, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C27940c m49193i0(C17375j c17375j) {
        return C27940c.INSTANCE.m84338b(c17375j.m49206Z(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C27942e m49194j0(C17375j c17375j) {
        return C27942e.m84356b(c17375j.m49206Z(28));
    }

    @Override // lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }

    @Override // dk0.InterfaceC12105e
    /* JADX INFO: renamed from: a */
    public C27940c mo33439a() {
        return (C27940c) this.hardwareVersion.getValue();
    }

    @Override // hk0.AbstractC17378m
    /* JADX INFO: renamed from: b0, reason: from getter */
    public EnumC17379n getSubtype() {
        return this.subtype;
    }

    @Override // dk0.InterfaceC12105e
    /* JADX INFO: renamed from: d */
    public InterfaceC27939b mo33440d() {
        return (InterfaceC27939b) this.firmwareVersion.getValue();
    }

    @Override // hk0.AbstractC17378m
    /* JADX INFO: renamed from: d0 */
    public boolean mo49188d0() {
        return getPayload().limit() >= 52;
    }

    @Override // dk0.InterfaceC12105e
    /* JADX INFO: renamed from: f */
    public C27942e mo33441f() {
        Object value = this.sigProcVersion.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (C27942e) value;
    }
}
