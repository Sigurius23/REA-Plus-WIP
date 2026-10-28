package dk0;

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

/* JADX INFO: renamed from: dk0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Ldk0/g;", "Ldk0/i;", "Ldk0/e;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "Loh2/c;", "e", "Ll83/h;", "a", "()Loh2/c;", "hardwareVersion", "Loh2/b;", "f", "d", "()Loh2/b;", "firmwareVersion", "Loh2/e;", "g", "()Loh2/e;", "sigProcVersion", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12107g extends AbstractC12109i implements InterfaceC12105e {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC23462h hardwareVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC23462h firmwareVersion;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC23462h sigProcVersion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12107g(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
        final int i13 = 0;
        this.hardwareVersion = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: dk0.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C12107g f40296x;

            {
                this.f40296x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return C12107g.m33446X(this.f40296x);
                    case 1:
                        return C12107g.m33445W(this.f40296x);
                    default:
                        return C12107g.m33447Y(this.f40296x);
                }
            }
        });
        final int i14 = 1;
        this.firmwareVersion = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: dk0.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C12107g f40296x;

            {
                this.f40296x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return C12107g.m33446X(this.f40296x);
                    case 1:
                        return C12107g.m33445W(this.f40296x);
                    default:
                        return C12107g.m33447Y(this.f40296x);
                }
            }
        });
        final int i15 = 2;
        this.sigProcVersion = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: dk0.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C12107g f40296x;

            {
                this.f40296x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return C12107g.m33446X(this.f40296x);
                    case 1:
                        return C12107g.m33445W(this.f40296x);
                    default:
                        return C12107g.m33447Y(this.f40296x);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final InterfaceC27939b.b m33445W(C12107g c12107g) {
        c12107g.m33453R().position(12);
        InterfaceC27939b.b bVarM84323a = InterfaceC27939b.INSTANCE.m84323a(c12107g.m33453R());
        c12107g.m33453R().rewind();
        return bVarM84323a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C27940c m33446X(C12107g c12107g) {
        c12107g.m33453R().position(0);
        C27940c c27940cM84338b = C27940c.INSTANCE.m84338b(c12107g.m33453R());
        c12107g.m33453R().rewind();
        return c27940cM84338b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C27942e m33447Y(C12107g c12107g) {
        c12107g.m33453R().position(28);
        C27942e c27942eM84356b = C27942e.m84356b(c12107g.m33453R());
        c12107g.m33453R().rewind();
        return c27942eM84356b;
    }

    @Override // dk0.InterfaceC12105e
    /* JADX INFO: renamed from: a */
    public C27940c mo33439a() {
        return (C27940c) this.hardwareVersion.getValue();
    }

    @Override // dk0.InterfaceC12105e
    /* JADX INFO: renamed from: d */
    public InterfaceC27939b mo33440d() {
        return (InterfaceC27939b) this.firmwareVersion.getValue();
    }

    @Override // dk0.InterfaceC12105e
    /* JADX INFO: renamed from: f */
    public C27942e mo33441f() {
        Object value = this.sigProcVersion.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (C27942e) value;
    }
}
