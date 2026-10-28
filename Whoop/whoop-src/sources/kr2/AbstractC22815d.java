package kr2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p717lq2.C24684p;
import p717lq2.EnumC24674f;
import p717lq2.InterfaceC24673e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: kr2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001: \f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0007\u001f !\"#$%&'()*B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0001 +,-./0123456789:;<=>?@ABCDEFGHIJ¨\u0006K"}, m65681d2 = {"Lkr2/d;", "Llq2/e;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a;", "a", "()Llq2/p$a;", "Llq2/f;", "getGradientOption", "()Llq2/f;", "s", "r", "t", "a0", "p", "q", "o", "i", "j", "l", "k", "n", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "c", "b", "f", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "v", "y", "z", "u", "x", "b0", "f0", "d0", "e0", "c0", "m", "Lkr2/d$a;", "Lkr2/d$b;", "Lkr2/d$c;", "Lkr2/d$d;", "Lkr2/d$e;", "Lkr2/d$f;", "Lkr2/d$g;", "Lkr2/d$h;", "Lkr2/d$i;", "Lkr2/d$j;", "Lkr2/d$k;", "Lkr2/d$l;", "Lkr2/d$m;", "Lkr2/d$n;", "Lkr2/d$o;", "Lkr2/d$p;", "Lkr2/d$q;", "Lkr2/d$r;", "Lkr2/d$s;", "Lkr2/d$t;", "Lkr2/d$a0;", "Lkr2/d$w;", "Lkr2/d$u;", "Lkr2/d$v;", "Lkr2/d$x;", "Lkr2/d$y;", "Lkr2/d$z;", "Lkr2/d$b0;", "Lkr2/d$c0;", "Lkr2/d$d0;", "Lkr2/d$e0;", "Lkr2/d$f0;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22815d implements InterfaceC24673e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC24674f gradientOption;

    /* JADX INFO: renamed from: kr2.d$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$a;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final a f89836b = new a();

        private a() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66157a(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$a0 */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkr2/d$a0;", "Lkr2/d;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a0 extends AbstractC22815d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(EnumC24674f gradientOption) {
            super(gradientOption, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66143K(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a0) && this.gradientOption == ((a0) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("StreakStats(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: kr2.d$b */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$b;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final b f89838b = new b();

        private b() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66160d(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$b0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$b0;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final b0 f89839b = new b0();

        private b0() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66150R(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$c */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$c;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final c f89840b = new c();

        private c() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66163g(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$c0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$c0;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final c0 f89841b = new c0();

        private c0() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66151S(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$d */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$d;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final d f89842b = new d();

        private d() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66166j(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$d0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$d0;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final d0 f89843b = new d0();

        private d0() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66152T(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$e */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$e;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final e f89844b = new e();

        private e() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66169m(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$e0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$e0;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final e0 f89845b = new e0();

        private e0() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66153U(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$f */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$f;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final f f89846b = new f();

        private f() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66172p(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$f0 */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$f0;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final f0 f89847b = new f0();

        private f0() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66154V(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$g */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$g;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final g f89848b = new g();

        private g() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66175s(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$h */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$h;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final h f89849b = new h();

        private h() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66178v(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$i */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkr2/d$i;", "Lkr2/d;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a$c;", "b", "()Llq2/p$a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC22815d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(EnumC24674f gradientOption) {
            super(gradientOption, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.c mo66100a() {
            return new C24684p.a.c(AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66181y()), new C17919x(AbstractC22816e.m66137E())), 0.0f, null, 0.0f, 14, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && this.gradientOption == ((i) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("Chronological99PercentClub(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: kr2.d$j */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkr2/d$j;", "Lkr2/d;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a$c;", "b", "()Llq2/p$a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC22815d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(EnumC24674f gradientOption) {
            super(gradientOption, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.c mo66100a() {
            return new C24684p.a.c(AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66134B()), new C17919x(AbstractC22816e.m66133A())), 0.0f, null, 0.0f, 14, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && this.gradientOption == ((j) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("ChronologicalHealthspanOlder(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: kr2.d$k */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkr2/d$k;", "Lkr2/d;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a$c;", "b", "()Llq2/p$a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC22815d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(EnumC24674f gradientOption) {
            super(gradientOption, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.c mo66100a() {
            return new C24684p.a.c(AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66156X()), new C17919x(AbstractC22816e.m66155W())), 0.0f, null, 0.0f, 14, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && this.gradientOption == ((k) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("ChronologicalHealthspanYounger(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: kr2.d$l */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkr2/d$l;", "Lkr2/d;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a$c;", "b", "()Llq2/p$a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC22815d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(EnumC24674f gradientOption) {
            super(gradientOption, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.c mo66100a() {
            return new C24684p.a.c(AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66140H()), new C17919x(AbstractC22816e.m66139G()), new C17919x(AbstractC22816e.m66138F())), 0.0f, null, 0.0f, 14, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l) && this.gradientOption == ((l) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("ChronologicalOnePercentClub(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: kr2.d$m */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkr2/d$m;", "Lkr2/d;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a$c;", "b", "()Llq2/p$a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC22815d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(EnumC24674f gradientOption) {
            super(gradientOption, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.c mo66100a() {
            return new C24684p.a.c(AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66135C()), new C17919x(AbstractC22816e.m66136D())), 0.0f, null, 0.0f, 14, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && this.gradientOption == ((m) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("Default(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: kr2.d$n */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkr2/d$n;", "Lkr2/d;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a$c;", "b", "()Llq2/p$a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC22815d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(EnumC24674f gradientOption) {
            super(gradientOption, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.c mo66100a() {
            return new C24684p.a.c(AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66182z()), new C17919x(AbstractC22816e.m66136D())), 0.0f, null, 0.0f, 14, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && this.gradientOption == ((n) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("HealthspanContributors(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: kr2.d$o */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkr2/d$o;", "Lkr2/d;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a$c;", "b", "()Llq2/p$a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC22815d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(EnumC24674f gradientOption) {
            super(gradientOption, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.c mo66100a() {
            return new C24684p.a.c(AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66135C()), new C17919x(AbstractC22816e.m66136D())), 0.0f, null, 0.0f, 14, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && this.gradientOption == ((o) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("LandingScreenBottom(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: kr2.d$p */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkr2/d$p;", "Lkr2/d;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a$a;", "b", "()Llq2/p$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC22815d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(EnumC24674f gradientOption) {
            super(gradientOption, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.C41970a mo66100a() {
            return new C24684p.a.C41970a(AbstractC22816e.m66135C(), AbstractC22816e.m66136D(), 0.0f, 0.0f, 0L, 0.0f, 60, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof p) && this.gradientOption == ((p) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("LandingScreenFull(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: kr2.d$q */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkr2/d$q;", "Lkr2/d;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a$b;", "b", "()Llq2/p$a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q extends AbstractC22815d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(EnumC24674f gradientOption) {
            super(gradientOption, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.b mo66100a() {
            return new C24684p.a.b(AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66135C()), new C17919x(AbstractC22816e.m66136D())), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 254, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof q) && this.gradientOption == ((q) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("LandingScreenTop(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: kr2.d$r */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkr2/d$r;", "Lkr2/d;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r extends AbstractC22815d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(EnumC24674f gradientOption) {
            super(gradientOption, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66137E(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof r) && this.gradientOption == ((r) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("Recovery(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: kr2.d$s */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkr2/d$s;", "Lkr2/d;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s extends AbstractC22815d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(EnumC24674f gradientOption) {
            super(gradientOption, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66141I(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s) && this.gradientOption == ((s) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("Sleep(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: kr2.d$t */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkr2/d$t;", "Lkr2/d;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t extends AbstractC22815d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(EnumC24674f gradientOption) {
            super(gradientOption, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66142J(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof t) && this.gradientOption == ((t) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("Strain(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: kr2.d$u */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$u;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final u f89862b = new u();

        private u() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66145M(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$v */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$v;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final v f89863b = new v();

        private v() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66146N(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$w */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$w;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final w f89864b = new w();

        private w() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66144L(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$x */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$x;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final x f89865b = new x();

        private x() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66147O(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$y */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$y;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final y f89866b = new y();

        private y() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66148P(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    /* JADX INFO: renamed from: kr2.d$z */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkr2/d$z;", "Lkr2/d;", "<init>", "()V", "Llq2/p$a$d;", "b", "()Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z extends AbstractC22815d {

        /* JADX INFO: renamed from: b */
        public static final z f89867b = new z();

        private z() {
            super(EnumC24674f.SECONDARY, null);
        }

        @Override // kr2.AbstractC22815d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24684p.a.d mo66100a() {
            return new C24684p.a.d(AbstractC22816e.m66149Q(), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        }
    }

    public /* synthetic */ AbstractC22815d(EnumC24674f enumC24674f, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC24674f);
    }

    /* JADX INFO: renamed from: a */
    public abstract C24684p.a mo66100a();

    private AbstractC22815d(EnumC24674f enumC24674f) {
        this.gradientOption = enumC24674f;
    }
}
