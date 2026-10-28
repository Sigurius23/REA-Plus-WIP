package ot2;

import ep0.C13404j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import jt2.C21939a;
import jt2.C21940b;
import jt2.C21956r;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ot2.m */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m65681d2 = {"Lot2/m;", "", "<init>", "()V", "i", "e", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "f", "b", "c", "a", "Lot2/m$a;", "Lot2/m$b;", "Lot2/m$c;", "Lot2/m$d;", "Lot2/m$e;", "Lot2/m$f;", "Lot2/m$g;", "Lot2/m$h;", "Lot2/m$i;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28344m {

    /* JADX INFO: renamed from: ot2.m$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lot2/m$a;", "Lot2/m;", "", "planId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC28344m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String planId) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            this.planId = planId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.planId, ((a) other).planId);
        }

        public int hashCode() {
            return this.planId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("CancelCurrentPlanError(planId=", this.planId, ")");
        }
    }

    /* JADX INFO: renamed from: ot2.m$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lot2/m$b;", "Lot2/m;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC28344m {

        /* JADX INFO: renamed from: a */
        public static final b f114320a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ot2.m$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lot2/m$c;", "Lot2/m;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC28344m {

        /* JADX INFO: renamed from: a */
        public static final c f114321a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ot2.m$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lot2/m$d;", "Lot2/m;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC28344m {

        /* JADX INFO: renamed from: a */
        public static final d f114322a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ot2.m$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lot2/m$e;", "Lot2/m;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC28344m {

        /* JADX INFO: renamed from: a */
        public static final e f114323a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ot2.m$f */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b\u001f\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b\u001c\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b(\u0010\u0014R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b'\u0010\u0014R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b)\u0010\u0014¨\u0006*"}, m65681d2 = {"Lot2/m$f;", "Lot2/m;", "", "planId", "", "isCustomized", "migrateSmartAlarm", "", "Ljt2/r;", "sliderValues", "Ljt2/b;", "behaviorItems", "Ljt2/a;", "activityItems", "source", "presetPlanCategory", "templateId", "<init>", "(Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Z", "i", "()Z", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC28344m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isCustomized;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean migrateSmartAlarm;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C21956r> sliderValues;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<C21940b> behaviorItems;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<C21939a> activityItems;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String presetPlanCategory;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String templateId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String planId, boolean z4, boolean z13, List<C21956r> sliderValues, List<C21940b> behaviorItems, List<C21939a> activityItems, String str, String str2, String str3) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            AbstractC22676k.m65750j(sliderValues, "sliderValues");
            AbstractC22676k.m65750j(behaviorItems, "behaviorItems");
            AbstractC22676k.m65750j(activityItems, "activityItems");
            this.planId = planId;
            this.isCustomized = z4;
            this.migrateSmartAlarm = z13;
            this.sliderValues = sliderValues;
            this.behaviorItems = behaviorItems;
            this.activityItems = activityItems;
            this.source = str;
            this.presetPlanCategory = str2;
            this.templateId = str3;
        }

        /* JADX INFO: renamed from: a */
        public final List<C21939a> m85958a() {
            return this.activityItems;
        }

        /* JADX INFO: renamed from: b */
        public final List<C21940b> m85959b() {
            return this.behaviorItems;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getMigrateSmartAlarm() {
            return this.migrateSmartAlarm;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPresetPlanCategory() {
            return this.presetPlanCategory;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.planId, fVar.planId) && this.isCustomized == fVar.isCustomized && this.migrateSmartAlarm == fVar.migrateSmartAlarm && AbstractC22676k.m65745e(this.sliderValues, fVar.sliderValues) && AbstractC22676k.m65745e(this.behaviorItems, fVar.behaviorItems) && AbstractC22676k.m65745e(this.activityItems, fVar.activityItems) && AbstractC22676k.m65745e(this.source, fVar.source) && AbstractC22676k.m65745e(this.presetPlanCategory, fVar.presetPlanCategory) && AbstractC22676k.m65745e(this.templateId, fVar.templateId);
        }

        /* JADX INFO: renamed from: f */
        public final List<C21956r> m85963f() {
            return this.sliderValues;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.planId.hashCode() * 31, 31, this.isCustomized), 31, this.migrateSmartAlarm), 31, this.sliderValues), 31, this.behaviorItems), 31, this.activityItems);
            String str = this.source;
            int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.presetPlanCategory;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.templateId;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsCustomized() {
            return this.isCustomized;
        }

        public String toString() {
            String str = this.planId;
            boolean z4 = this.isCustomized;
            boolean z13 = this.migrateSmartAlarm;
            List<C21956r> list = this.sliderValues;
            List<C21940b> list2 = this.behaviorItems;
            List<C21939a> list3 = this.activityItems;
            String str2 = this.source;
            String str3 = this.presetPlanCategory;
            String str4 = this.templateId;
            StringBuilder sbM73379l = AbstractC25012a.m73379l("SaveError(planId=", str, ", isCustomized=", ", migrateSmartAlarm=", z4);
            AbstractC25012a.m73391x(", sliderValues=", ", behaviorItems=", sbM73379l, list, z13);
            AbstractC21702c.m61148s(sbM73379l, list2, ", activityItems=", list3, ", source=");
            AbstractC11266d.m30444B(sbM73379l, str2, ", presetPlanCategory=", str3, ", templateId=");
            return AbstractC25012a.m73376i(str4, ")", sbM73379l);
        }
    }

    /* JADX INFO: renamed from: ot2.m$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lot2/m$g;", "Lot2/m;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC28344m {

        /* JADX INFO: renamed from: a */
        public static final g f114333a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ot2.m$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lot2/m$h;", "Lot2/m;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC28344m {

        /* JADX INFO: renamed from: a */
        public static final h f114334a = new h();

        private h() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ot2.m$i */
    @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b\u001b\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001f\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010+\u001a\u0004\b(\u0010,¨\u0006-"}, m65681d2 = {"Lot2/m$i;", "Lot2/m;", "Lot2/p;", "initialScreen", "Lot2/r;", "metricSelectionScreen", "Lot2/t;", "sliderScreen", "Lot2/a;", "activitiesScreen", "Lot2/c;", "behaviorsScreen", "Lep0/j;", "screenContextMetadata", "<init>", "(Lot2/p;Lot2/r;Lot2/t;Lot2/a;Lot2/c;Lep0/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lot2/p;", "c", "()Lot2/p;", "b", "Lot2/r;", "d", "()Lot2/r;", "Lot2/t;", "f", "()Lot2/t;", "Lot2/a;", "()Lot2/a;", "e", "Lot2/c;", "()Lot2/c;", "Lep0/j;", "()Lep0/j;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC28344m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28347p initialScreen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C28349r metricSelectionScreen;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C28351t sliderScreen;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C28332a activitiesScreen;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C28334c behaviorsScreen;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C28347p initialScreen, C28349r metricSelectionScreen, C28351t c28351t, C28332a c28332a, C28334c c28334c, C13404j c13404j) {
            super(null);
            AbstractC22676k.m65750j(initialScreen, "initialScreen");
            AbstractC22676k.m65750j(metricSelectionScreen, "metricSelectionScreen");
            this.initialScreen = initialScreen;
            this.metricSelectionScreen = metricSelectionScreen;
            this.sliderScreen = c28351t;
            this.activitiesScreen = c28332a;
            this.behaviorsScreen = c28334c;
            this.screenContextMetadata = c13404j;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C28332a getActivitiesScreen() {
            return this.activitiesScreen;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C28334c getBehaviorsScreen() {
            return this.behaviorsScreen;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C28347p getInitialScreen() {
            return this.initialScreen;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C28349r getMetricSelectionScreen() {
            return this.metricSelectionScreen;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.initialScreen, iVar.initialScreen) && AbstractC22676k.m65745e(this.metricSelectionScreen, iVar.metricSelectionScreen) && AbstractC22676k.m65745e(this.sliderScreen, iVar.sliderScreen) && AbstractC22676k.m65745e(this.activitiesScreen, iVar.activitiesScreen) && AbstractC22676k.m65745e(this.behaviorsScreen, iVar.behaviorsScreen) && AbstractC22676k.m65745e(this.screenContextMetadata, iVar.screenContextMetadata);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C28351t getSliderScreen() {
            return this.sliderScreen;
        }

        public int hashCode() {
            int iHashCode = (this.metricSelectionScreen.hashCode() + (this.initialScreen.hashCode() * 31)) * 31;
            C28351t c28351t = this.sliderScreen;
            int iHashCode2 = (iHashCode + (c28351t == null ? 0 : c28351t.hashCode())) * 31;
            C28332a c28332a = this.activitiesScreen;
            int iHashCode3 = (iHashCode2 + (c28332a == null ? 0 : c28332a.hashCode())) * 31;
            C28334c c28334c = this.behaviorsScreen;
            int iHashCode4 = (iHashCode3 + (c28334c == null ? 0 : c28334c.hashCode())) * 31;
            C13404j c13404j = this.screenContextMetadata;
            return iHashCode4 + (c13404j != null ? c13404j.hashCode() : 0);
        }

        public String toString() {
            return "Success(initialScreen=" + this.initialScreen + ", metricSelectionScreen=" + this.metricSelectionScreen + ", sliderScreen=" + this.sliderScreen + ", activitiesScreen=" + this.activitiesScreen + ", behaviorsScreen=" + this.behaviorsScreen + ", screenContextMetadata=" + this.screenContextMetadata + ")";
        }
    }

    public /* synthetic */ AbstractC28344m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC28344m() {
    }
}
