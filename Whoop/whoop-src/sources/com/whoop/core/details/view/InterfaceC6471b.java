package com.whoop.core.details.view;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import dw0.EnumC12409h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import mc1.EnumC25417b;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: com.whoop.core.details.view.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u000f\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/core/details/view/b;", "", "i", "r", "o", "k", "j", "e", "l", "a", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "m", "q", "d", "n", "f", "b", "c", "p", "Lcom/whoop/core/details/view/b$a;", "Lcom/whoop/core/details/view/b$d;", "Lcom/whoop/core/details/view/b$e;", "Lcom/whoop/core/details/view/b$f;", "Lcom/whoop/core/details/view/b$g;", "Lcom/whoop/core/details/view/b$h;", "Lcom/whoop/core/details/view/b$i;", "Lcom/whoop/core/details/view/b$j;", "Lcom/whoop/core/details/view/b$k;", "Lcom/whoop/core/details/view/b$l;", "Lcom/whoop/core/details/view/b$m;", "Lcom/whoop/core/details/view/b$n;", "Lcom/whoop/core/details/view/b$o;", "Lcom/whoop/core/details/view/b$q;", "Lcom/whoop/core/details/view/b$r;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC6471b {

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/core/details/view/b$a;", "Lcom/whoop/core/details/view/b;", "", "isDropDownSelected", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC6471b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isDropDownSelected;

        public a(boolean z4) {
            this.isDropDownSelected = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsDropDownSelected() {
            return this.isDropDownSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.isDropDownSelected == ((a) other).isDropDownSelected;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isDropDownSelected);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ActivityMoreSelected(isDropDownSelected=", ")", this.isDropDownSelected);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$b */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/core/details/view/b$b;", "", "", "forceShowCardioDetails", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC6471b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean forceShowCardioDetails;

        public b(boolean z4) {
            this.forceShowCardioDetails = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getForceShowCardioDetails() {
            return this.forceShowCardioDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.forceShowCardioDetails == ((b) other).forceShowCardioDetails;
        }

        public int hashCode() {
            return Boolean.hashCode(this.forceShowCardioDetails);
        }

        public String toString() {
            return AbstractC3855a.m11827k("BackClicked(forceShowCardioDetails=", ")", this.forceShowCardioDetails);
        }

        public /* synthetic */ b(boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/core/details/view/b$c;", "", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC6471b {

        /* JADX INFO: renamed from: a */
        public static final c f25354a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/core/details/view/b$d;", "Lcom/whoop/core/details/view/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC6471b {

        /* JADX INFO: renamed from: a */
        public static final d f25355a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/core/details/view/b$e;", "Lcom/whoop/core/details/view/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC6471b {

        /* JADX INFO: renamed from: a */
        public static final e f25356a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/core/details/view/b$f;", "Lcom/whoop/core/details/view/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC6471b {

        /* JADX INFO: renamed from: a */
        public static final f f25357a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/core/details/view/b$g;", "Lcom/whoop/core/details/view/b;", "", "index", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC6471b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int index;

        public g(int i13) {
            this.index = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && this.index == ((g) other).index;
        }

        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.index, "ExerciseCardSwiped(index=", ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$h */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/core/details/view/b$h;", "Lcom/whoop/core/details/view/b;", "", "show", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC6471b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean show;

        public h(boolean z4) {
            this.show = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getShow() {
            return this.show;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && this.show == ((h) other).show;
        }

        public int hashCode() {
            return Boolean.hashCode(this.show);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ExerciseSummary(show=", ")", this.show);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$i */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/core/details/view/b$i;", "Lcom/whoop/core/details/view/b;", "", "activityId", "entryPoint", "activityType", "", "newHome", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements InterfaceC6471b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String activityType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean newHome;

        public i(String activityId, String entryPoint, String activityType, boolean z4) {
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            AbstractC22676k.m65750j(activityType, "activityType");
            this.activityId = activityId;
            this.entryPoint = entryPoint;
            this.activityType = activityType;
            this.newHome = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getNewHome() {
            return this.newHome;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.activityId, iVar.activityId) && AbstractC22676k.m65745e(this.entryPoint, iVar.entryPoint) && AbstractC22676k.m65745e(this.activityType, iVar.activityType) && this.newHome == iVar.newHome;
        }

        public int hashCode() {
            return Boolean.hashCode(this.newHome) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.activityId.hashCode() * 31, 31, this.entryPoint), 31, this.activityType);
        }

        public String toString() {
            String str = this.activityId;
            String str2 = this.entryPoint;
            return AbstractC21702c.m61137h(AbstractC11895b.m32001t("FetchActivityDetails(activityId=", str, ", entryPoint=", str2, ", activityType="), this.activityType, ", newHome=", this.newHome, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/core/details/view/b$j;", "Lcom/whoop/core/details/view/b;", "Lmc1/b;", "barType", "<init>", "(Lmc1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmc1/b;", "()Lmc1/b;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements InterfaceC6471b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC25417b barType;

        public j(EnumC25417b barType) {
            AbstractC22676k.m65750j(barType, "barType");
            this.barType = barType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC25417b getBarType() {
            return this.barType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && this.barType == ((j) other).barType;
        }

        public int hashCode() {
            return this.barType.hashCode();
        }

        public String toString() {
            return "HeartRateBarClicked(barType=" + this.barType + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/core/details/view/b$k;", "Lcom/whoop/core/details/view/b;", "Lcom/whoop/design/util/TextResource;", "valueDisplay", "unitDisplay", "timeDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements InterfaceC6471b {

        /* JADX INFO: renamed from: d */
        public static final int f25365d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource valueDisplay;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource unitDisplay;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource timeDisplay;

        public k(TextResource textResource, TextResource textResource2, TextResource textResource3) {
            this.valueDisplay = textResource;
            this.unitDisplay = textResource2;
            this.timeDisplay = textResource3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getTimeDisplay() {
            return this.timeDisplay;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getUnitDisplay() {
            return this.unitDisplay;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getValueDisplay() {
            return this.valueDisplay;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.valueDisplay, kVar.valueDisplay) && AbstractC22676k.m65745e(this.unitDisplay, kVar.unitDisplay) && AbstractC22676k.m65745e(this.timeDisplay, kVar.timeDisplay);
        }

        public int hashCode() {
            TextResource textResource = this.valueDisplay;
            int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
            TextResource textResource2 = this.unitDisplay;
            int iHashCode2 = (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
            TextResource textResource3 = this.timeDisplay;
            return iHashCode2 + (textResource3 != null ? textResource3.hashCode() : 0);
        }

        public String toString() {
            TextResource textResource = this.valueDisplay;
            TextResource textResource2 = this.unitDisplay;
            return AbstractC30007c.m91841k(AbstractC33745d.m106658q("HeartRateGraphClicked(valueDisplay=", textResource, ", unitDisplay=", textResource2, ", timeDisplay="), this.timeDisplay, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/core/details/view/b$l;", "Lcom/whoop/core/details/view/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC6471b {

        /* JADX INFO: renamed from: a */
        public static final l f25369a = new l();

        private l() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$m */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/core/details/view/b$m;", "Lcom/whoop/core/details/view/b;", "Ldw0/h;", "errorCloseEvent", "<init>", "(Ldw0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldw0/h;", "()Ldw0/h;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m implements InterfaceC6471b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC12409h errorCloseEvent;

        public m(EnumC12409h errorCloseEvent) {
            AbstractC22676k.m65750j(errorCloseEvent, "errorCloseEvent");
            this.errorCloseEvent = errorCloseEvent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC12409h getErrorCloseEvent() {
            return this.errorCloseEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && this.errorCloseEvent == ((m) other).errorCloseEvent;
        }

        public int hashCode() {
            return this.errorCloseEvent.hashCode();
        }

        public String toString() {
            return "HideFullScreenModal(errorCloseEvent=" + this.errorCloseEvent + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$n */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/core/details/view/b$n;", "Lcom/whoop/core/details/view/b;", "", "exerciseId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n implements InterfaceC6471b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String exerciseId;

        public n(String exerciseId) {
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            this.exerciseId = exerciseId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getExerciseId() {
            return this.exerciseId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && AbstractC22676k.m65745e(this.exerciseId, ((n) other).exerciseId);
        }

        public int hashCode() {
            return this.exerciseId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("NavigateToExerciseDetails(exerciseId=", this.exerciseId, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$o */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/core/details/view/b$o;", "Lcom/whoop/core/details/view/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements InterfaceC6471b {

        /* JADX INFO: renamed from: a */
        public static final o f25372a = new o();

        private o() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$p */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/core/details/view/b$p;", "", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements InterfaceC6471b {

        /* JADX INFO: renamed from: a */
        public static final p f25373a = new p();

        private p() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$q */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/core/details/view/b$q;", "Lcom/whoop/core/details/view/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements InterfaceC6471b {

        /* JADX INFO: renamed from: a */
        public static final q f25374a = new q();

        private q() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.b$r */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/core/details/view/b$r;", "Lcom/whoop/core/details/view/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements InterfaceC6471b {

        /* JADX INFO: renamed from: a */
        public static final r f25375a = new r();

        private r() {
        }
    }
}
