package gk0;

import java.nio.ByteBuffer;
import lt0.AbstractC24726c;
import lt0.AbstractC24727d;
import lt0.InterfaceC24724a;
import p132f0.C13818q1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tt0.AbstractC34159d;
import xj0.InterfaceC38331a;

/* JADX INFO: renamed from: gk0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B'\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lgk0/a;", "Lxj0/a;", "Llt0/c$a;", "packetType", "Lkotlin/Function1;", "", "Llt0/a;", "commandNumberLookup", "<init>", "(Llt0/c$a;Lkotlin/jvm/functions/Function1;)V", "command", "Ljava/nio/ByteBuffer;", "commandPayload", "b", "(Llt0/a;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "payload", "a", "(Ljava/nio/ByteBuffer;)Llt0/a;", "d", "(Ljava/nio/ByteBuffer;)B", "value", "Ll83/a0;", "c", "(Ljava/nio/ByteBuffer;B)V", "Llt0/c$a;", "Lkotlin/jvm/functions/Function1;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15924a implements InterfaceC38331a {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    private static final C15924a f60235e = new C15924a(AbstractC24726c.a.COMMAND, new C13818q1(10));

    /* JADX INFO: renamed from: f */
    private static final C15924a f60236f = new C15924a(AbstractC24726c.a.PUFFIN_COMMAND, new C13818q1(11));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC24726c.a packetType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1 commandNumberLookup;

    /* JADX INFO: renamed from: gk0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lgk0/a$a;", "", "<init>", "()V", "Lgk0/a;", "Strap", "Lgk0/a;", "b", "()Lgk0/a;", "Puffin", "a", "", "OFFSET_COMMAND", "I", "OFFSET_DATA", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C15924a m44942a() {
            return C15924a.f60236f;
        }

        /* JADX INFO: renamed from: b */
        public final C15924a m44943b() {
            return C15924a.f60235e;
        }

        private Companion() {
        }
    }

    private C15924a(AbstractC24726c.a aVar, Function1 function1) {
        this.packetType = aVar;
        this.commandNumberLookup = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC24724a m44934g(byte b) {
        return InterfaceC24724a.INSTANCE.m72385a(b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC24724a m44935h(byte b) {
        return InterfaceC24724a.INSTANCE.m72386b(b);
    }

    @Override // xj0.InterfaceC38331a
    /* JADX INFO: renamed from: a */
    public InterfaceC24724a mo44938a(ByteBuffer payload) {
        AbstractC22676k.m65750j(payload, "payload");
        return (InterfaceC24724a) this.commandNumberLookup.invoke(Byte.valueOf(payload.get(2)));
    }

    @Override // xj0.InterfaceC38331a
    /* JADX INFO: renamed from: b */
    public ByteBuffer mo44939b(InterfaceC24724a command, ByteBuffer commandPayload) {
        AbstractC22676k.m65750j(command, "command");
        AbstractC22676k.m65750j(commandPayload, "commandPayload");
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(AbstractC34159d.m107942a(commandPayload.limit() + 3)).order(AbstractC24727d.m72403a());
        byteBufferOrder.put(0, this.packetType.getByteValue());
        byteBufferOrder.put(2, command.getByteValue());
        ByteBuffer byteBufferDuplicate = commandPayload.duplicate();
        byteBufferDuplicate.position(0);
        AbstractC34159d.m107945d(byteBufferOrder, 3, byteBufferDuplicate);
        return byteBufferOrder;
    }

    @Override // xj0.InterfaceC38331a
    /* JADX INFO: renamed from: c */
    public void mo44940c(ByteBuffer payload, byte value) {
        AbstractC22676k.m65750j(payload, "payload");
        payload.put(1, value);
    }

    @Override // xj0.InterfaceC38331a
    /* JADX INFO: renamed from: d */
    public byte mo44941d(ByteBuffer payload) {
        AbstractC22676k.m65750j(payload, "payload");
        return payload.get(1);
    }
}
