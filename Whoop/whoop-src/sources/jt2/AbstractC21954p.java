package jt2;

import c13.AbstractC3855a;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponse;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jt2.p */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0019\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0019\u001d\u001e\u001f !\"#$%&'()*+,-./012345¨\u00066"}, m65681d2 = {"Ljt2/p;", "", "<init>", "()V", "s", "f", "g", "q", "p", "m", "c", "d", "b", "a", "r", "i", "n", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "y", "o", "u", "v", "j", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "l", "t", "x", "Ljt2/p$a;", "Ljt2/p$b;", "Ljt2/p$c;", "Ljt2/p$d;", "Ljt2/p$e;", "Ljt2/p$f;", "Ljt2/p$g;", "Ljt2/p$h;", "Ljt2/p$i;", "Ljt2/p$j;", "Ljt2/p$k;", "Ljt2/p$l;", "Ljt2/p$m;", "Ljt2/p$n;", "Ljt2/p$o;", "Ljt2/p$p;", "Ljt2/p$q;", "Ljt2/p$r;", "Ljt2/p$s;", "Ljt2/p$t;", "Ljt2/p$u;", "Ljt2/p$v;", "Ljt2/p$w;", "Ljt2/p$x;", "Ljt2/p$y;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21954p {

    /* JADX INFO: renamed from: jt2.p$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Ljt2/p$a;", "Ljt2/p;", "", "id", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21954p {

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

    /* JADX INFO: renamed from: jt2.p$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ljt2/p$b;", "Ljt2/p;", "", "planId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC21954p {

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
            return AbstractC11895b.m31996o("CancelCurrentPlanError(planId=", this.planId, ")");
        }
    }

    /* JADX INFO: renamed from: jt2.p$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/p$c;", "Ljt2/p;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC21954p {

        /* JADX INFO: renamed from: a */
        public static final c f84870a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.p$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/p$d;", "Ljt2/p;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC21954p {

        /* JADX INFO: renamed from: a */
        public static final d f84871a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.p$e */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, m65681d2 = {"Ljt2/p$e;", "Ljt2/p;", "Ljt2/c;", "bottomSheetType", "", "categoryIndex", "<init>", "(Ljt2/c;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljt2/c;", "()Ljt2/c;", "b", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC21954p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC21941c bottomSheetType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int categoryIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EnumC21941c bottomSheetType, int i13) {
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
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.bottomSheetType == eVar.bottomSheetType && this.categoryIndex == eVar.categoryIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.categoryIndex) + (this.bottomSheetType.hashCode() * 31);
        }

        public String toString() {
            return "ChangeCategory(bottomSheetType=" + this.bottomSheetType + ", categoryIndex=" + this.categoryIndex + ")";
        }
    }

    /* JADX INFO: renamed from: jt2.p$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/p$f;", "Ljt2/p;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC21954p {

        /* JADX INFO: renamed from: a */
        public static final f f84874a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.p$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/p$g;", "Ljt2/p;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC21954p {

        /* JADX INFO: renamed from: a */
        public static final g f84875a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.p$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ljt2/p$h;", "Ljt2/p;", "Ljt2/c;", "bottomSheetType", "<init>", "(Ljt2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljt2/c;", "()Ljt2/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC21954p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC21941c bottomSheetType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(EnumC21941c bottomSheetType) {
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
            return (other instanceof h) && this.bottomSheetType == ((h) other).bottomSheetType;
        }

        public int hashCode() {
            return this.bottomSheetType.hashCode();
        }

        public String toString() {
            return "RefreshBottomSheet(bottomSheetType=" + this.bottomSheetType + ")";
        }
    }

    /* JADX INFO: renamed from: jt2.p$i */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ljt2/p$i;", "Ljt2/p;", "", "sliderScreen", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC21954p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean sliderScreen;

        public i(boolean z4) {
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
            return (other instanceof i) && this.sliderScreen == ((i) other).sliderScreen;
        }

        public int hashCode() {
            return Boolean.hashCode(this.sliderScreen);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ResetAccumulation(sliderScreen=", ")", this.sliderScreen);
        }
    }

    /* JADX INFO: renamed from: jt2.p$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/p$j;", "Ljt2/p;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC21954p {

        /* JADX INFO: renamed from: a */
        public static final j f84878a = new j();

        private j() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.p$k */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/p$k;", "Ljt2/p;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC21954p {

        /* JADX INFO: renamed from: a */
        public static final k f84879a = new k();

        private k() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.p$l */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ljt2/p$l;", "Ljt2/p;", "Ljt2/c;", "bottomSheetType", "<init>", "(Ljt2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljt2/c;", "()Ljt2/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC21954p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC21941c bottomSheetType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(EnumC21941c bottomSheetType) {
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
            return (other instanceof l) && this.bottomSheetType == ((l) other).bottomSheetType;
        }

        public int hashCode() {
            return this.bottomSheetType.hashCode();
        }

        public String toString() {
            return "SaveBottomSheet(bottomSheetType=" + this.bottomSheetType + ")";
        }
    }

    /* JADX INFO: renamed from: jt2.p$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/p$m;", "Ljt2/p;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC21954p {

        /* JADX INFO: renamed from: a */
        public static final m f84881a = new m();

        private m() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.p$n */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/p$n;", "Ljt2/p;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC21954p {

        /* JADX INFO: renamed from: a */
        public static final n f84882a = new n();

        private n() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.p$o */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ljt2/p$o;", "Ljt2/p;", "", "savedValue", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "targetGoalType", "<init>", "(DLcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC21954p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final double savedValue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TargetGoalType targetGoalType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(double d3, TargetGoalType targetGoalType) {
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
            if (!(other instanceof o)) {
                return false;
            }
            o oVar = (o) other;
            return Double.compare(this.savedValue, oVar.savedValue) == 0 && this.targetGoalType == oVar.targetGoalType;
        }

        public int hashCode() {
            return this.targetGoalType.hashCode() + (Double.hashCode(this.savedValue) * 31);
        }

        public String toString() {
            return "SaveSliderSelection(savedValue=" + this.savedValue + ", targetGoalType=" + this.targetGoalType + ")";
        }
    }

    /* JADX INFO: renamed from: jt2.p$p */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/p$p;", "Ljt2/p;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC21954p {

        /* JADX INFO: renamed from: a */
        public static final p f84885a = new p();

        private p() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.p$q */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/p$q;", "Ljt2/p;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC21954p {

        /* JADX INFO: renamed from: a */
        public static final q f84886a = new q();

        private q() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.p$r */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Ljt2/p$r;", "Ljt2/p;", "", "id", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r extends AbstractC21954p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int id;

        public r(int i13) {
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
            return (other instanceof r) && this.id == ((r) other).id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.id, "SubtractMetric(id=", ")");
        }
    }

    /* JADX INFO: renamed from: jt2.p$s */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ljt2/p$s;", "Ljt2/p;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;", "result", "<init>", "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s extends AbstractC21954p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HubAndSpokeResponse result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(HubAndSpokeResponse result) {
            super(null);
            AbstractC22676k.m65750j(result, "result");
            this.result = result;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final HubAndSpokeResponse getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s) && AbstractC22676k.m65745e(this.result, ((s) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Success(result=" + this.result + ")";
        }
    }

    /* JADX INFO: renamed from: jt2.p$t */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Ljt2/p$t;", "Ljt2/p;", "Ljt2/c;", "bottomSheetType", "", "id", "<init>", "(Ljt2/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljt2/c;", "()Ljt2/c;", "b", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t extends AbstractC21954p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC21941c bottomSheetType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(EnumC21941c bottomSheetType, String id4) {
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
            if (!(other instanceof t)) {
                return false;
            }
            t tVar = (t) other;
            return this.bottomSheetType == tVar.bottomSheetType && AbstractC22676k.m65745e(this.id, tVar.id);
        }

        public int hashCode() {
            return this.id.hashCode() + (this.bottomSheetType.hashCode() * 31);
        }

        public String toString() {
            return "ToggleItem(bottomSheetType=" + this.bottomSheetType + ", id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: jt2.p$u */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\r¨\u0006\u0019"}, m65681d2 = {"Ljt2/p$u;", "Ljt2/p;", "", "id", "", "isToggled", "", "selectedDay", "<init>", "(Ljava/lang/String;ZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u extends AbstractC21954p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isToggled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int selectedDay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String id4, boolean z4, int i13) {
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
            if (!(other instanceof u)) {
                return false;
            }
            u uVar = (u) other;
            return AbstractC22676k.m65745e(this.id, uVar.id) && this.isToggled == uVar.isToggled && this.selectedDay == uVar.selectedDay;
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

    /* JADX INFO: renamed from: jt2.p$v */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u001b"}, m65681d2 = {"Ljt2/p$v;", "Ljt2/p;", "", "id", "", "isToggled", "isAvoid", "", "selectedDay", "<init>", "(Ljava/lang/String;ZZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "d", "()Z", "c", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class v extends AbstractC21954p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isToggled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isAvoid;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int selectedDay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String id4, boolean z4, boolean z13, int i13) {
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
            if (!(other instanceof v)) {
                return false;
            }
            v vVar = (v) other;
            return AbstractC22676k.m65745e(this.id, vVar.id) && this.isToggled == vVar.isToggled && this.isAvoid == vVar.isAvoid && this.selectedDay == vVar.selectedDay;
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

    /* JADX INFO: renamed from: jt2.p$w */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ljt2/p$w;", "Ljt2/p;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "goalType", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class w extends AbstractC21954p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TargetGoalType goalType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(TargetGoalType goalType) {
            super(null);
            AbstractC22676k.m65750j(goalType, "goalType");
            this.goalType = goalType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TargetGoalType getGoalType() {
            return this.goalType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof w) && this.goalType == ((w) other).goalType;
        }

        public int hashCode() {
            return this.goalType.hashCode();
        }

        public String toString() {
            return "UpdateCurrentSliderView(goalType=" + this.goalType + ")";
        }
    }

    /* JADX INFO: renamed from: jt2.p$x */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Ljt2/p$x;", "Ljt2/p;", "Ljt2/c;", "bottomSheetType", "", "query", "<init>", "(Ljt2/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljt2/c;", "()Ljt2/c;", "b", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x extends AbstractC21954p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC21941c bottomSheetType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(EnumC21941c bottomSheetType, String query) {
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
            if (!(other instanceof x)) {
                return false;
            }
            x xVar = (x) other;
            return this.bottomSheetType == xVar.bottomSheetType && AbstractC22676k.m65745e(this.query, xVar.query);
        }

        public int hashCode() {
            return this.query.hashCode() + (this.bottomSheetType.hashCode() * 31);
        }

        public String toString() {
            return "UpdateSearchQuery(bottomSheetType=" + this.bottomSheetType + ", query=" + this.query + ")";
        }
    }

    /* JADX INFO: renamed from: jt2.p$y */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ljt2/p$y;", "Ljt2/p;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "targetGoalType", "", "value", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "b", "D", "()D", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class y extends AbstractC21954p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TargetGoalType targetGoalType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final double value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(TargetGoalType targetGoalType, double d3) {
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
            if (!(other instanceof y)) {
                return false;
            }
            y yVar = (y) other;
            return this.targetGoalType == yVar.targetGoalType && Double.compare(this.value, yVar.value) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.value) + (this.targetGoalType.hashCode() * 31);
        }

        public String toString() {
            return "UpdateSliderValue(targetGoalType=" + this.targetGoalType + ", value=" + this.value + ")";
        }
    }

    public /* synthetic */ AbstractC21954p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC21954p() {
    }
}
