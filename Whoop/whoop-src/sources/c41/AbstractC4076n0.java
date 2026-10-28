package c41;

import gy0.AbstractC16272a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: c41.n0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\t\u0010\u000f\u000b\u0011B%\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u000e\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m65681d2 = {"Lc41/n0;", "", "", "icon", "Ly81/f;", "color", "titleTint", "<init>", "(ILy81/f;Ly81/f;)V", "a", "I", "b", "()I", "Ly81/f;", "()Ly81/f;", "c", "e", "d", "Lc41/n0$a;", "Lc41/n0$b;", "Lc41/n0$c;", "Lc41/n0$d;", "Lc41/n0$e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4076n0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f color;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f titleTint;

    /* JADX INFO: renamed from: c41.n0$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lc41/n0$a;", "Lc41/n0;", "Ly81/f;", "titleTintOverride", "<init>", "(Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ly81/f;", "getTitleTintOverride", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC4076n0 {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC39333f titleTintOverride;

        public /* synthetic */ a(EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : enumC39333f);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.titleTintOverride == ((a) other).titleTintOverride;
        }

        public int hashCode() {
            EnumC39333f enumC39333f = this.titleTintOverride;
            if (enumC39333f == null) {
                return 0;
            }
            return enumC39333f.hashCode();
        }

        public String toString() {
            return "Error(titleTintOverride=" + this.titleTintOverride + ")";
        }

        public a(EnumC39333f enumC39333f) {
            super(AbstractC16272a.f62158t, EnumC39333f.ACCENT_ALERT, enumC39333f, null);
            this.titleTintOverride = enumC39333f;
        }
    }

    /* JADX INFO: renamed from: c41.n0$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lc41/n0$b;", "Lc41/n0;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC4076n0 {

        /* JADX INFO: renamed from: d */
        public static final b f16557d = new b();

        private b() {
            super(AbstractC16272a.f61932H2, EnumC39333f.WHITE_30, EnumC39333f.BRAND_WHITE, null);
        }
    }

    /* JADX INFO: renamed from: c41.n0$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lc41/n0$c;", "Lc41/n0;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC4076n0 {

        /* JADX INFO: renamed from: d */
        public static final c f16558d = new c();

        /* JADX INFO: renamed from: e */
        public static final int f16559e = 0;

        private c() {
            super(AbstractC16272a.f62012U4, EnumC39333f.ACCENT_NEGATIVE_TREND, EnumC39333f.BRAND_WHITE, null);
        }
    }

    /* JADX INFO: renamed from: c41.n0$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lc41/n0$d;", "Lc41/n0;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC4076n0 {

        /* JADX INFO: renamed from: d */
        public static final d f16560d = new d();

        /* JADX WARN: Illegal instructions before constructor call */
        private d() {
            int i13 = AbstractC16272a.f61959M;
            EnumC39333f enumC39333f = EnumC39333f.ACCENT_ACTION;
            super(i13, enumC39333f, enumC39333f, null);
        }
    }

    /* JADX INFO: renamed from: c41.n0$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lc41/n0$e;", "Lc41/n0;", "Ly81/f;", "titleTintOverride", "<init>", "(Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ly81/f;", "getTitleTintOverride", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC4076n0 {

        /* JADX INFO: renamed from: e */
        public static final int f16561e = 0;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC39333f titleTintOverride;

        public /* synthetic */ e(EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : enumC39333f);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && this.titleTintOverride == ((e) other).titleTintOverride;
        }

        public int hashCode() {
            EnumC39333f enumC39333f = this.titleTintOverride;
            if (enumC39333f == null) {
                return 0;
            }
            return enumC39333f.hashCode();
        }

        public String toString() {
            return "Warning(titleTintOverride=" + this.titleTintOverride + ")";
        }

        public e(EnumC39333f enumC39333f) {
            super(AbstractC16272a.f62158t, EnumC39333f.ACCENT_NEGATIVE_TREND, enumC39333f, null);
            this.titleTintOverride = enumC39333f;
        }
    }

    public /* synthetic */ AbstractC4076n0(int i13, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, enumC39333f, enumC39333f2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getTitleTint() {
        return this.titleTint;
    }

    private AbstractC4076n0(int i13, EnumC39333f enumC39333f, EnumC39333f enumC39333f2) {
        this.icon = i13;
        this.color = enumC39333f;
        this.titleTint = enumC39333f2;
    }
}
