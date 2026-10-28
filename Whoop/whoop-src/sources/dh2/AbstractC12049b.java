package dh2;

import c13.AbstractC3855a;
import eh2.EnumC13196a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dh2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Ldh2/b;", "", "<init>", "()V", "a", "d", "b", "c", "e", "Ldh2/b$a;", "Ldh2/b$b;", "Ldh2/b$c;", "Ldh2/b$d;", "Ldh2/b$e;", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12049b {

    /* JADX INFO: renamed from: dh2.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldh2/b$a;", "Ldh2/b;", "<init>", "()V", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC12049b {

        /* JADX INFO: renamed from: a */
        public static final a f39890a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dh2.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldh2/b$b;", "Ldh2/b;", "<init>", "()V", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC12049b {

        /* JADX INFO: renamed from: a */
        public static final b f39891a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dh2.b$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ldh2/b$c;", "Ldh2/b;", "", "isStealthModeEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC12049b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isStealthModeEnabled;

        public c(boolean z4) {
            super(null);
            this.isStealthModeEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsStealthModeEnabled() {
            return this.isStealthModeEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.isStealthModeEnabled == ((c) other).isStealthModeEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isStealthModeEnabled);
        }

        public String toString() {
            return AbstractC3855a.m11827k("Success(isStealthModeEnabled=", ")", this.isStealthModeEnabled);
        }
    }

    /* JADX INFO: renamed from: dh2.b$d */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ldh2/b$d;", "Ldh2/b;", "", "isStealthModeEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC12049b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isStealthModeEnabled;

        public d(boolean z4) {
            super(null);
            this.isStealthModeEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsStealthModeEnabled() {
            return this.isStealthModeEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.isStealthModeEnabled == ((d) other).isStealthModeEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isStealthModeEnabled);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ToggleStealthMode(isStealthModeEnabled=", ")", this.isStealthModeEnabled);
        }
    }

    /* JADX INFO: renamed from: dh2.b$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ldh2/b$e;", "Ldh2/b;", "Leh2/a;", "metricType", "", "isHiddenMetricEnabled", "<init>", "(Leh2/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Leh2/a;", "()Leh2/a;", "b", "Z", "()Z", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC12049b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC13196a metricType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isHiddenMetricEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EnumC13196a metricType, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(metricType, "metricType");
            this.metricType = metricType;
            this.isHiddenMetricEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC13196a getMetricType() {
            return this.metricType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsHiddenMetricEnabled() {
            return this.isHiddenMetricEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.metricType == eVar.metricType && this.isHiddenMetricEnabled == eVar.isHiddenMetricEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isHiddenMetricEnabled) + (this.metricType.hashCode() * 31);
        }

        public String toString() {
            return "UpdateHiddenMetric(metricType=" + this.metricType + ", isHiddenMetricEnabled=" + this.isHiddenMetricEnabled + ")";
        }
    }

    public /* synthetic */ AbstractC12049b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12049b() {
    }
}
