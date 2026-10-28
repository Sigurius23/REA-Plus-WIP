package oh2;

import c93.InterfaceC4339a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import nh2.InterfaceC26724a;
import of3.InterfaceC27903a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import uk0.AbstractC35049c;
import vf3.InterfaceC35951a;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: oh2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00032\u00020\u0001:\u0005\u0007\b\t\n\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004\u0082\u0001\u0003\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Loh2/b;", "", "", "a", "()Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "raw", "b", "d", "e", "c", "Loh2/b$b;", "Loh2/b$d;", "Loh2/b$e;", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC27939b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f112673w;

    /* JADX INFO: renamed from: oh2.b$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Loh2/b$a;", "Lof3/a;", "<init>", "()V", "Ljava/nio/ByteBuffer;", "", "d", "(Ljava/nio/ByteBuffer;)J", "", "raw", "Loh2/b;", "b", "(Ljava/lang/String;)Loh2/b;", "buffer", "Loh2/b$b;", "a", "(Ljava/nio/ByteBuffer;)Loh2/b$b;", "Lnh2/a;", "x", "Ll83/h;", "c", "()Lnh2/a;", "firmwareVersionAnalytics", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion implements InterfaceC27903a {

        /* JADX INFO: renamed from: w */
        static final /* synthetic */ Companion f112673w;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final InterfaceC23462h firmwareVersionAnalytics;

        /* JADX INFO: renamed from: oh2.b$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42123a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC27903a f112675w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC35951a f112676x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC4339a f112677y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42123a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
                super(0);
                this.f112675w = interfaceC27903a;
                this.f112676x = interfaceC35951a;
                this.f112677y = interfaceC4339a;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nh2.a] */
            @Override // c93.InterfaceC4339a
            public final InterfaceC26724a invoke() {
                InterfaceC27903a interfaceC27903a = this.f112675w;
                InterfaceC35951a interfaceC35951a = this.f112676x;
                return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f112677y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26724a.class), interfaceC35951a);
            }
        }

        static {
            Companion companion = new Companion();
            f112673w = companion;
            firmwareVersionAnalytics = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C42123a(companion, null, null));
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: c */
        private final InterfaceC26724a m84321c() {
            return (InterfaceC26724a) firmwareVersionAnalytics.getValue();
        }

        /* JADX INFO: renamed from: d */
        private final long m84322d(ByteBuffer byteBuffer) {
            return ((long) byteBuffer.getInt()) & 4294967295L;
        }

        /* JADX INFO: renamed from: a */
        public final b m84323a(ByteBuffer buffer) {
            AbstractC22676k.m65750j(buffer, "buffer");
            try {
                ByteBuffer byteBufferOrder = buffer.duplicate().order(buffer.order());
                AbstractC22676k.m65747g(byteBufferOrder);
                return new b(m84322d(byteBufferOrder), m84322d(byteBufferOrder), m84322d(byteBufferOrder), m84322d(byteBufferOrder));
            } catch (BufferUnderflowException unused) {
                m84321c().mo71182a(c.PARSING_ERROR);
                return new b(0L, 0L, 0L, 0L);
            }
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC27939b m84324b(String raw) {
            AbstractC22676k.m65750j(raw, "raw");
            if (raw.length() != 0) {
                return new d(raw);
            }
            InterfaceC26724a interfaceC26724aM84321c = m84321c();
            c cVar = c.EMPTY;
            interfaceC26724aM84321c.mo71182a(cVar);
            return new e("0.0.0.0", cVar);
        }

        @Override // of3.InterfaceC27903a
        public /* bridge */ C26669a getKoin() {
            return AbstractC34132o.m107856A(this);
        }
    }

    /* JADX INFO: renamed from: oh2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Loh2/b$b;", "Loh2/b;", "", "major", "minor", "build", "unreleased", "<init>", "(JJJJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "c", "()J", "d", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "raw", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC27939b {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long major;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long minor;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final long build;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final long unreleased;

        public b(long j7, long j13, long j14, long j15) {
            this.major = j7;
            this.minor = j13;
            this.build = j14;
            this.unreleased = j15;
        }

        @Override // oh2.InterfaceC27939b
        /* JADX INFO: renamed from: a */
        public /* bridge */ String mo84319a() {
            return super.mo84319a();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getBuild() {
            return this.build;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getMajor() {
            return this.major;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getMinor() {
            return this.minor;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getUnreleased() {
            return this.unreleased;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.major == bVar.major && this.minor == bVar.minor && this.build == bVar.build && this.unreleased == bVar.unreleased;
        }

        @Override // oh2.InterfaceC27939b
        /* JADX INFO: renamed from: h */
        public String getRaw() {
            return AbstractC35049c.m110788b(this.major, this.minor, this.build, this.unreleased);
        }

        public int hashCode() {
            return Long.hashCode(this.unreleased) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.major) * 31, this.minor, 31), this.build, 31);
        }

        public String toString() {
            long j7 = this.major;
            long j13 = this.minor;
            long j14 = this.build;
            long j15 = this.unreleased;
            StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "FirmwareVersion(major=", ", minor=");
            sbM125596b.append(j13);
            AbstractC2875y.m8285A(sbM125596b, ", build=", j14, ", unreleased=");
            return AbstractC11266d.m30457k(j15, ")", sbM125596b);
        }
    }

    /* JADX INFO: renamed from: oh2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Loh2/b$c;", "", "", "tag", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "EMPTY", "PARSING_ERROR", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum c {
        EMPTY("empty"),
        PARSING_ERROR("parsing_error");

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        private final String tag;

        c(String str) {
            this.tag = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getTag() {
            return this.tag;
        }
    }

    /* JADX INFO: renamed from: oh2.b$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Loh2/b$d;", "Loh2/b;", "", "raw", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC27939b {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String raw;

        public d(String raw) {
            AbstractC22676k.m65750j(raw, "raw");
            this.raw = raw;
        }

        @Override // oh2.InterfaceC27939b
        /* JADX INFO: renamed from: a */
        public /* bridge */ String mo84319a() {
            return super.mo84319a();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.raw, ((d) other).raw);
        }

        @Override // oh2.InterfaceC27939b
        /* JADX INFO: renamed from: h, reason: from getter */
        public String getRaw() {
            return this.raw;
        }

        public int hashCode() {
            return this.raw.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Semver(raw=", this.raw, ")");
        }
    }

    /* JADX INFO: renamed from: oh2.b$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Loh2/b$e;", "Loh2/b;", "", "raw", "Loh2/b$c;", "reason", "<init>", "(Ljava/lang/String;Loh2/b$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Loh2/b$c;", "getReason", "()Loh2/b$c;", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC27939b {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String raw;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final c reason;

        public e(String raw, c reason) {
            AbstractC22676k.m65750j(raw, "raw");
            AbstractC22676k.m65750j(reason, "reason");
            this.raw = raw;
            this.reason = reason;
        }

        @Override // oh2.InterfaceC27939b
        /* JADX INFO: renamed from: a */
        public /* bridge */ String mo84319a() {
            return super.mo84319a();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.raw, eVar.raw) && this.reason == eVar.reason;
        }

        @Override // oh2.InterfaceC27939b
        /* JADX INFO: renamed from: h, reason: from getter */
        public String getRaw() {
            return this.raw;
        }

        public int hashCode() {
            return this.reason.hashCode() + (this.raw.hashCode() * 31);
        }

        public String toString() {
            return "Unparsed(raw=" + this.raw + ", reason=" + this.reason + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    default String mo84319a() {
        return getRaw();
    }

    /* JADX INFO: renamed from: h */
    String getRaw();
}
