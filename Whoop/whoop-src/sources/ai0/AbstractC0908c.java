package ai0;

import c51.C4242s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ai0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lai0/c;", "", "<init>", "()V", "b", "a", "c", "Lai0/c$a;", "Lai0/c$b;", "Lai0/c$c;", "amoeba_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0908c {

    /* JADX INFO: renamed from: ai0.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lai0/c$a;", "Lai0/c;", "<init>", "()V", "amoeba_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC0908c {

        /* JADX INFO: renamed from: a */
        public static final a f3325a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ai0.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lai0/c$b;", "Lai0/c;", "<init>", "()V", "amoeba_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC0908c {

        /* JADX INFO: renamed from: a */
        public static final b f3326a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ai0.c$c */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lai0/c$c;", "Lai0/c;", "Lc51/s;", "amoeba", "", "paceOfAgingSliderProgress", "yearsDifferenceSliderProgress", "<init>", "(Lc51/s;FF)V", "a", "Lc51/s;", "()Lc51/s;", "b", "F", "()F", "c", "amoeba_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC0908c {

        /* JADX INFO: renamed from: d */
        public static final int f3327d = C4242s.f17232p;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C4242s amoeba;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float paceOfAgingSliderProgress;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final float yearsDifferenceSliderProgress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4242s amoeba, float f13, float f14) {
            super(null);
            AbstractC22676k.m65750j(amoeba, "amoeba");
            this.amoeba = amoeba;
            this.paceOfAgingSliderProgress = f13;
            this.yearsDifferenceSliderProgress = f14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C4242s getAmoeba() {
            return this.amoeba;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getPaceOfAgingSliderProgress() {
            return this.paceOfAgingSliderProgress;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getYearsDifferenceSliderProgress() {
            return this.yearsDifferenceSliderProgress;
        }
    }

    public /* synthetic */ AbstractC0908c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC0908c() {
    }
}
