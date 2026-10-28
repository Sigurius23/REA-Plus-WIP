package nt2;

import c13.AbstractC3855a;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import jt2.C21939a;
import jt2.C21940b;
import jt2.C21956r;
import jt2.EnumC21941c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: nt2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0013\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, m65681d2 = {"Lnt2/a;", "", "<init>", "()V", "d", "g", "f", "a", "m", "k", "q", "s", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "l", "e", "n", "j", "c", "r", "o", "p", "b", "Lnt2/a$a;", "Lnt2/a$b;", "Lnt2/a$c;", "Lnt2/a$d;", "Lnt2/a$e;", "Lnt2/a$f;", "Lnt2/a$g;", "Lnt2/a$h;", "Lnt2/a$i;", "Lnt2/a$j;", "Lnt2/a$k;", "Lnt2/a$l;", "Lnt2/a$m;", "Lnt2/a$n;", "Lnt2/a$o;", "Lnt2/a$p;", "Lnt2/a$q;", "Lnt2/a$r;", "Lnt2/a$s;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27131a {

    /* JADX INFO: renamed from: nt2.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lnt2/a$a;", "Lnt2/a;", "", "id", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int id;

        public a(int i13) {
            super(null);
            this.id = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.id == ((a) other).id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.id, "AddMetric(id=", ")");
        }
    }

    /* JADX INFO: renamed from: nt2.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lnt2/a$b;", "Lnt2/a;", "", "planId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String planId) {
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
            return (other instanceof b) && AbstractC22676k.m65745e(this.planId, ((b) other).planId);
        }

        public int hashCode() {
            return this.planId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("CancelCurrentPlan(planId=", this.planId, ")");
        }
    }

    /* JADX INFO: renamed from: nt2.a$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lnt2/a$c;", "Lnt2/a;", "Ljt2/c;", "bottomSheetType", "", "categoryIndex", "<init>", "(Ljt2/c;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljt2/c;", "()Ljt2/c;", "b", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC21941c bottomSheetType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int categoryIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC21941c bottomSheetType, int i13) {
            super(null);
            AbstractC22676k.m65750j(bottomSheetType, "bottomSheetType");
            this.bottomSheetType = bottomSheetType;
            this.categoryIndex = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC21941c getBottomSheetType() {
            return this.bottomSheetType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCategoryIndex() {
            return this.categoryIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.bottomSheetType == cVar.bottomSheetType && this.categoryIndex == cVar.categoryIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.categoryIndex) + (this.bottomSheetType.hashCode() * 31);
        }

        public String toString() {
            return "ChangeCategory(bottomSheetType=" + this.bottomSheetType + ", categoryIndex=" + this.categoryIndex + ")";
        }
    }

    /* JADX INFO: renamed from: nt2.a$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnt2/a$d;", "Lnt2/a;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC27131a {

        /* JADX INFO: renamed from: a */
        public static final d f108483a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: nt2.a$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lnt2/a$e;", "Lnt2/a;", "Ljt2/c;", "bottomSheetType", "<init>", "(Ljt2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljt2/c;", "()Ljt2/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC21941c bottomSheetType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EnumC21941c bottomSheetType) {
            super(null);
            AbstractC22676k.m65750j(bottomSheetType, "bottomSheetType");
            this.bottomSheetType = bottomSheetType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC21941c getBottomSheetType() {
            return this.bottomSheetType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && this.bottomSheetType == ((e) other).bottomSheetType;
        }

        public int hashCode() {
            return this.bottomSheetType.hashCode();
        }

        public String toString() {
            return "RefreshBottomSheet(bottomSheetType=" + this.bottomSheetType + ")";
        }
    }

    /* JADX INFO: renamed from: nt2.a$f */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lnt2/a$f;", "Lnt2/a;", "", "sliderScreen", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean sliderScreen;

        public f(boolean z4) {
            super(null);
            this.sliderScreen = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSliderScreen() {
            return this.sliderScreen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.sliderScreen == ((f) other).sliderScreen;
        }

        public int hashCode() {
            return Boolean.hashCode(this.sliderScreen);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ResetAccumulation(sliderScreen=", ")", this.sliderScreen);
        }

        public /* synthetic */ f(boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: nt2.a$g */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b\u001f\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b\u001c\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b(\u0010\u0014R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b'\u0010\u0014R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b)\u0010\u0014¨\u0006*"}, m65681d2 = {"Lnt2/a$g;", "Lnt2/a;", "", "planId", "", "isCustomized", "migrateSmartAlarm", "", "Ljt2/r;", "sliderValues", "Ljt2/b;", "behaviorItems", "Ljt2/a;", "activityItems", "source", "presetPlanCategory", "templateId", "<init>", "(Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Z", "i", "()Z", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC27131a {

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
        public g(String planId, boolean z4, boolean z13, List<C21956r> sliderValues, List<C21940b> behaviorItems, List<C21939a> activityItems, String str, String str2, String str3) {
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
        public final List<C21939a> m81564a() {
            return this.activityItems;
        }

        /* JADX INFO: renamed from: b */
        public final List<C21940b> m81565b() {
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
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.planId, gVar.planId) && this.isCustomized == gVar.isCustomized && this.migrateSmartAlarm == gVar.migrateSmartAlarm && AbstractC22676k.m65745e(this.sliderValues, gVar.sliderValues) && AbstractC22676k.m65745e(this.behaviorItems, gVar.behaviorItems) && AbstractC22676k.m65745e(this.activityItems, gVar.activityItems) && AbstractC22676k.m65745e(this.source, gVar.source) && AbstractC22676k.m65745e(this.presetPlanCategory, gVar.presetPlanCategory) && AbstractC22676k.m65745e(this.templateId, gVar.templateId);
        }

        /* JADX INFO: renamed from: f */
        public final List<C21956r> m81569f() {
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
            StringBuilder sbM73379l = AbstractC25012a.m73379l("Save(planId=", str, ", isCustomized=", ", migrateSmartAlarm=", z4);
            AbstractC25012a.m73391x(", sliderValues=", ", behaviorItems=", sbM73379l, list, z13);
            AbstractC21702c.m61148s(sbM73379l, list2, ", activityItems=", list3, ", source=");
            AbstractC11266d.m30444B(sbM73379l, str2, ", presetPlanCategory=", str3, ", templateId=");
            return AbstractC25012a.m73376i(str4, ")", sbM73379l);
        }
    }

    /* JADX INFO: renamed from: nt2.a$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnt2/a$h;", "Lnt2/a;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC27131a {

        /* JADX INFO: renamed from: a */
        public static final h f108495a = new h();

        private h() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: nt2.a$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnt2/a$i;", "Lnt2/a;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC27131a {

        /* JADX INFO: renamed from: a */
        public static final i f108496a = new i();

        private i() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: nt2.a$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lnt2/a$j;", "Lnt2/a;", "Ljt2/c;", "bottomSheetType", "<init>", "(Ljt2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljt2/c;", "()Ljt2/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC21941c bottomSheetType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(EnumC21941c bottomSheetType) {
            super(null);
            AbstractC22676k.m65750j(bottomSheetType, "bottomSheetType");
            this.bottomSheetType = bottomSheetType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC21941c getBottomSheetType() {
            return this.bottomSheetType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && this.bottomSheetType == ((j) other).bottomSheetType;
        }

        public int hashCode() {
            return this.bottomSheetType.hashCode();
        }

        public String toString() {
            return "SaveBottomSheet(bottomSheetType=" + this.bottomSheetType + ")";
        }
    }

    /* JADX INFO: renamed from: nt2.a$k */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnt2/a$k;", "Lnt2/a;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC27131a {

        /* JADX INFO: renamed from: a */
        public static final k f108498a = new k();

        private k() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: nt2.a$l */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lnt2/a$l;", "Lnt2/a;", "", "savedValue", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "targetGoalType", "<init>", "(DLcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final double savedValue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType targetGoalType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(double d3, TargetGoalType targetGoalType) {
            super(null);
            AbstractC22676k.m65750j(targetGoalType, "targetGoalType");
            this.savedValue = d3;
            this.targetGoalType = targetGoalType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getSavedValue() {
            return this.savedValue;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TargetGoalType getTargetGoalType() {
            return this.targetGoalType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return Double.compare(this.savedValue, lVar.savedValue) == 0 && this.targetGoalType == lVar.targetGoalType;
        }

        public int hashCode() {
            return this.targetGoalType.hashCode() + (Double.hashCode(this.savedValue) * 31);
        }

        public String toString() {
            return "SaveSliderSelection(savedValue=" + this.savedValue + ", targetGoalType=" + this.targetGoalType + ")";
        }
    }

    /* JADX INFO: renamed from: nt2.a$m */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lnt2/a$m;", "Lnt2/a;", "", "id", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int id;

        public m(int i13) {
            super(null);
            this.id = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && this.id == ((m) other).id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.id, "SubtractMetric(id=", ")");
        }
    }

    /* JADX INFO: renamed from: nt2.a$n */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lnt2/a$n;", "Lnt2/a;", "Ljt2/c;", "bottomSheetType", "", "id", "<init>", "(Ljt2/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljt2/c;", "()Ljt2/c;", "b", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC21941c bottomSheetType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(EnumC21941c bottomSheetType, String id4) {
            super(null);
            AbstractC22676k.m65750j(bottomSheetType, "bottomSheetType");
            AbstractC22676k.m65750j(id4, "id");
            this.bottomSheetType = bottomSheetType;
            this.id = id4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC21941c getBottomSheetType() {
            return this.bottomSheetType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n)) {
                return false;
            }
            n nVar = (n) other;
            return this.bottomSheetType == nVar.bottomSheetType && AbstractC22676k.m65745e(this.id, nVar.id);
        }

        public int hashCode() {
            return this.id.hashCode() + (this.bottomSheetType.hashCode() * 31);
        }

        public String toString() {
            return "ToggleItem(bottomSheetType=" + this.bottomSheetType + ", id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: nt2.a$o */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lnt2/a$o;", "Lnt2/a;", "", "id", "", "isToggled", "", "selectedDay", "<init>", "(Ljava/lang/String;ZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isToggled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int selectedDay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String id4, boolean z4, int i13) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            this.isToggled = z4;
            this.selectedDay = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSelectedDay() {
            return this.selectedDay;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsToggled() {
            return this.isToggled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof o)) {
                return false;
            }
            o oVar = (o) other;
            return AbstractC22676k.m65745e(this.id, oVar.id) && this.isToggled == oVar.isToggled && this.selectedDay == oVar.selectedDay;
        }

        public int hashCode() {
            return Integer.hashCode(this.selectedDay) + AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.isToggled);
        }

        public String toString() {
            String str = this.id;
            boolean z4 = this.isToggled;
            return AbstractC18489d0.m53371l(AbstractC25012a.m73379l("UpdateActivityToggle(id=", str, ", isToggled=", ", selectedDay=", z4), this.selectedDay, ")");
        }
    }

    /* JADX INFO: renamed from: nt2.a$p */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u001b"}, m65681d2 = {"Lnt2/a$p;", "Lnt2/a;", "", "id", "", "isToggled", "isAvoid", "", "selectedDay", "<init>", "(Ljava/lang/String;ZZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "d", "()Z", "c", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isToggled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isAvoid;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int selectedDay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String id4, boolean z4, boolean z13, int i13) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            this.isToggled = z4;
            this.isAvoid = z13;
            this.selectedDay = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSelectedDay() {
            return this.selectedDay;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsAvoid() {
            return this.isAvoid;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsToggled() {
            return this.isToggled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return AbstractC22676k.m65745e(this.id, pVar.id) && this.isToggled == pVar.isToggled && this.isAvoid == pVar.isAvoid && this.selectedDay == pVar.selectedDay;
        }

        public int hashCode() {
            return Integer.hashCode(this.selectedDay) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.isToggled), 31, this.isAvoid);
        }

        public String toString() {
            String str = this.id;
            boolean z4 = this.isToggled;
            boolean z13 = this.isAvoid;
            int i13 = this.selectedDay;
            StringBuilder sbM73379l = AbstractC25012a.m73379l("UpdateBehaviorToggle(id=", str, ", isToggled=", ", isAvoid=", z4);
            sbM73379l.append(z13);
            sbM73379l.append(", selectedDay=");
            sbM73379l.append(i13);
            sbM73379l.append(")");
            return sbM73379l.toString();
        }
    }

    /* JADX INFO: renamed from: nt2.a$q */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lnt2/a$q;", "Lnt2/a;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "targetGoalType", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TargetGoalType targetGoalType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(TargetGoalType targetGoalType) {
            super(null);
            AbstractC22676k.m65750j(targetGoalType, "targetGoalType");
            this.targetGoalType = targetGoalType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TargetGoalType getTargetGoalType() {
            return this.targetGoalType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof q) && this.targetGoalType == ((q) other).targetGoalType;
        }

        public int hashCode() {
            return this.targetGoalType.hashCode();
        }

        public String toString() {
            return "UpdateCurrentSliderView(targetGoalType=" + this.targetGoalType + ")";
        }
    }

    /* JADX INFO: renamed from: nt2.a$r */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lnt2/a$r;", "Lnt2/a;", "Ljt2/c;", "bottomSheetType", "", "query", "<init>", "(Ljt2/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljt2/c;", "()Ljt2/c;", "b", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC21941c bottomSheetType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(EnumC21941c bottomSheetType, String query) {
            super(null);
            AbstractC22676k.m65750j(bottomSheetType, "bottomSheetType");
            AbstractC22676k.m65750j(query, "query");
            this.bottomSheetType = bottomSheetType;
            this.query = query;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC21941c getBottomSheetType() {
            return this.bottomSheetType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof r)) {
                return false;
            }
            r rVar = (r) other;
            return this.bottomSheetType == rVar.bottomSheetType && AbstractC22676k.m65745e(this.query, rVar.query);
        }

        public int hashCode() {
            return this.query.hashCode() + (this.bottomSheetType.hashCode() * 31);
        }

        public String toString() {
            return "UpdateSearchQuery(bottomSheetType=" + this.bottomSheetType + ", query=" + this.query + ")";
        }
    }

    /* JADX INFO: renamed from: nt2.a$s */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lnt2/a$s;", "Lnt2/a;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "targetGoalType", "", "value", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "b", "D", "()D", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s extends AbstractC27131a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TargetGoalType targetGoalType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final double value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(TargetGoalType targetGoalType, double d3) {
            super(null);
            AbstractC22676k.m65750j(targetGoalType, "targetGoalType");
            this.targetGoalType = targetGoalType;
            this.value = d3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TargetGoalType getTargetGoalType() {
            return this.targetGoalType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof s)) {
                return false;
            }
            s sVar = (s) other;
            return this.targetGoalType == sVar.targetGoalType && Double.compare(this.value, sVar.value) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.value) + (this.targetGoalType.hashCode() * 31);
        }

        public String toString() {
            return "UpdateSliderValue(targetGoalType=" + this.targetGoalType + ", value=" + this.value + ")";
        }
    }

    public /* synthetic */ AbstractC27131a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC27131a() {
    }
}
