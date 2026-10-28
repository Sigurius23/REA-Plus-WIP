package ch2;

import c13.AbstractC3855a;
import eh2.EnumC13196a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ch2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lch2/a;", "", "<init>", "()V", "a", "d", "c", "b", "Lch2/a$a;", "Lch2/a$b;", "Lch2/a$c;", "Lch2/a$d;", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4668a {

    /* JADX INFO: renamed from: ch2.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lch2/a$a;", "Lch2/a;", "<init>", "()V", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC4668a {

        /* JADX INFO: renamed from: a */
        public static final a f19112a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ch2.a$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lch2/a$b;", "Lch2/a;", "", "isStealthModeOn", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC4668a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isStealthModeOn;

        public b(boolean z4) {
            super(null);
            this.isStealthModeOn = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsStealthModeOn() {
            return this.isStealthModeOn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.isStealthModeOn == ((b) other).isStealthModeOn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isStealthModeOn);
        }

        public String toString() {
            return AbstractC3855a.m11827k("Success(isStealthModeOn=", ")", this.isStealthModeOn);
        }
    }

    /* JADX INFO: renamed from: ch2.a$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lch2/a$c;", "Lch2/a;", "Leh2/a;", "metricType", "", "isMetricHidden", "<init>", "(Leh2/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Leh2/a;", "()Leh2/a;", "b", "Z", "()Z", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC4668a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC13196a metricType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isMetricHidden;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC13196a metricType, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(metricType, "metricType");
            this.metricType = metricType;
            this.isMetricHidden = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC13196a getMetricType() {
            return this.metricType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsMetricHidden() {
            return this.isMetricHidden;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.metricType == cVar.metricType && this.isMetricHidden == cVar.isMetricHidden;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMetricHidden) + (this.metricType.hashCode() * 31);
        }

        public String toString() {
            return "ToggleHiddenMetric(metricType=" + this.metricType + ", isMetricHidden=" + this.isMetricHidden + ")";
        }
    }

    /* JADX INFO: renamed from: ch2.a$d */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lch2/a$d;", "Lch2/a;", "", "isStealthModeOn", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC4668a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isStealthModeOn;

        public d(boolean z4) {
            super(null);
            this.isStealthModeOn = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsStealthModeOn() {
            return this.isStealthModeOn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.isStealthModeOn == ((d) other).isStealthModeOn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isStealthModeOn);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ToggleStealthMode(isStealthModeOn=", ")", this.isStealthModeOn);
        }
    }

    public /* synthetic */ AbstractC4668a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4668a() {
    }
}
