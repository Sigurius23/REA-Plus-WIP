package fk0;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import l83.InterfaceC23462h;
import oh2.C27940c;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: fk0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001b\u0010\u000b\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Lfk0/f;", "Lfk0/g;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "Loh2/c;", "e", "Ll83/h;", "a", "()Loh2/c;", "hardwareVersion", "Loh2/b$b;", "f", "V", "()Loh2/b$b;", "firmwareVersion", "Loh2/e;", "g", "getSigProcVersion", "()Loh2/e;", "sigProcVersion", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14550f extends AbstractC14551g {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC23462h hardwareVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC23462h firmwareVersion;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC23462h sigProcVersion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14550f(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
        final int i13 = 0;
        this.hardwareVersion = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: fk0.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C14550f f53176x;

            {
                this.f53176x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return C14550f.m41565W(this.f53176x);
                    case 1:
                        return C14550f.m41564U(this.f53176x);
                    default:
                        return C14550f.m41566X(this.f53176x);
                }
            }
        });
        final int i14 = 1;
        this.firmwareVersion = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: fk0.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C14550f f53176x;

            {
                this.f53176x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return C14550f.m41565W(this.f53176x);
                    case 1:
                        return C14550f.m41564U(this.f53176x);
                    default:
                        return C14550f.m41566X(this.f53176x);
                }
            }
        });
        final int i15 = 2;
        this.sigProcVersion = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: fk0.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C14550f f53176x;

            {
                this.f53176x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return C14550f.m41565W(this.f53176x);
                    case 1:
                        return C14550f.m41564U(this.f53176x);
                    default:
                        return C14550f.m41566X(this.f53176x);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final InterfaceC27939b.b m41564U(C14550f c14550f) {
        ByteBuffer byteBufferM41569Q = c14550f.m41569Q();
        AbstractC22676k.m65747g(byteBufferM41569Q);
        byteBufferM41569Q.position(12);
        InterfaceC27939b.Companion companion = InterfaceC27939b.INSTANCE;
        ByteBuffer byteBufferM41569Q2 = c14550f.m41569Q();
        AbstractC22676k.m65747g(byteBufferM41569Q2);
        InterfaceC27939b.b bVarM84323a = companion.m84323a(byteBufferM41569Q2);
        ByteBuffer byteBufferM41569Q3 = c14550f.m41569Q();
        AbstractC22676k.m65747g(byteBufferM41569Q3);
        byteBufferM41569Q3.rewind();
        return bVarM84323a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C27940c m41565W(C14550f c14550f) {
        ByteBuffer byteBufferM41569Q = c14550f.m41569Q();
        AbstractC22676k.m65747g(byteBufferM41569Q);
        byteBufferM41569Q.position(0);
        C27940c.Companion companion = C27940c.INSTANCE;
        ByteBuffer byteBufferM41569Q2 = c14550f.m41569Q();
        AbstractC22676k.m65747g(byteBufferM41569Q2);
        C27940c c27940cM84338b = companion.m84338b(byteBufferM41569Q2);
        ByteBuffer byteBufferM41569Q3 = c14550f.m41569Q();
        AbstractC22676k.m65747g(byteBufferM41569Q3);
        byteBufferM41569Q3.rewind();
        return c27940cM84338b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C27942e m41566X(C14550f c14550f) {
        ByteBuffer byteBufferM41569Q = c14550f.m41569Q();
        AbstractC22676k.m65747g(byteBufferM41569Q);
        byteBufferM41569Q.position(28);
        ByteBuffer byteBufferM41569Q2 = c14550f.m41569Q();
        AbstractC22676k.m65747g(byteBufferM41569Q2);
        C27942e c27942eM84356b = C27942e.m84356b(byteBufferM41569Q2);
        ByteBuffer byteBufferM41569Q3 = c14550f.m41569Q();
        AbstractC22676k.m65747g(byteBufferM41569Q3);
        byteBufferM41569Q3.rewind();
        return c27942eM84356b;
    }

    /* JADX INFO: renamed from: V */
    public final InterfaceC27939b.b m41567V() {
        return (InterfaceC27939b.b) this.firmwareVersion.getValue();
    }

    /* JADX INFO: renamed from: a */
    public final C27940c m41568a() {
        return (C27940c) this.hardwareVersion.getValue();
    }
}
