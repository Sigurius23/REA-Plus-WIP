package q32;

import e31.C12611c;
import java.util.List;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: q32.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0014\u0017B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, m65681d2 = {"Lq32/d;", "Lm91/u;", "Lq32/d$a;", "miniArchModal", "Lq32/d$b;", "screenContent", "", "analyticsActionFromApi", "<init>", "(Lq32/d$a;Lq32/d$b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq32/d$a;", "()Lq32/d$a;", "b", "Lq32/d$b;", "()Lq32/d$b;", "c", "Ljava/lang/String;", "getAnalyticsActionFromApi", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29952d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final a miniArchModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b screenContent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String analyticsActionFromApi;

    /* JADX INFO: renamed from: q32.d$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b \u0010\u0010R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006#"}, m65681d2 = {"Lq32/d$b;", "", "", "Lm91/u;", "items", "", "showMore", "", "nextExerciseOffset", "", "nextEndDate", "nextStartDate", "isLoadingMore", "<init>", "(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "e", "()Z", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "Ljava/lang/String;", "f", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean showMore;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer nextExerciseOffset;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String nextEndDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String nextStartDate;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isLoadingMore;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends InterfaceC25312u> items, boolean z4, Integer num, String str, String str2, boolean z13) {
            AbstractC22676k.m65750j(items, "items");
            this.items = items;
            this.showMore = z4;
            this.nextExerciseOffset = num;
            this.nextEndDate = str;
            this.nextStartDate = str2;
            this.isLoadingMore = z13;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m91634a() {
            return this.items;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNextEndDate() {
            return this.nextEndDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getNextExerciseOffset() {
            return this.nextExerciseOffset;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getNextStartDate() {
            return this.nextStartDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getShowMore() {
            return this.showMore;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.items, bVar.items) && this.showMore == bVar.showMore && AbstractC22676k.m65745e(this.nextExerciseOffset, bVar.nextExerciseOffset) && AbstractC22676k.m65745e(this.nextEndDate, bVar.nextEndDate) && AbstractC22676k.m65745e(this.nextStartDate, bVar.nextStartDate) && this.isLoadingMore == bVar.isLoadingMore;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsLoadingMore() {
            return this.isLoadingMore;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.items.hashCode() * 31, 31, this.showMore);
            Integer num = this.nextExerciseOffset;
            int iHashCode = (iM8289b + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.nextEndDate;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.nextStartDate;
            return Boolean.hashCode(this.isLoadingMore) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            List<InterfaceC25312u> list = this.items;
            boolean z4 = this.showMore;
            Integer num = this.nextExerciseOffset;
            String str = this.nextEndDate;
            String str2 = this.nextStartDate;
            boolean z13 = this.isLoadingMore;
            StringBuilder sb4 = new StringBuilder("ScreenContent(items=");
            sb4.append(list);
            sb4.append(", showMore=");
            sb4.append(z4);
            sb4.append(", nextExerciseOffset=");
            AbstractC13673n.m38577x(num, ", nextEndDate=", str, ", nextStartDate=", sb4);
            return AbstractC21702c.m61137h(sb4, str2, ", isLoadingMore=", z13, ")");
        }
    }

    public C29952d(a aVar, b bVar, String str) {
        this.miniArchModal = aVar;
        this.screenContent = bVar;
        this.analyticsActionFromApi = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getMiniArchModal() {
        return this.miniArchModal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29952d)) {
            return false;
        }
        C29952d c29952d = (C29952d) other;
        return AbstractC22676k.m65745e(this.miniArchModal, c29952d.miniArchModal) && AbstractC22676k.m65745e(this.screenContent, c29952d.screenContent) && AbstractC22676k.m65745e(this.analyticsActionFromApi, c29952d.analyticsActionFromApi);
    }

    public int hashCode() {
        a aVar = this.miniArchModal;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        b bVar = this.screenContent;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.analyticsActionFromApi;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        a aVar = this.miniArchModal;
        b bVar = this.screenContent;
        String str = this.analyticsActionFromApi;
        StringBuilder sb4 = new StringBuilder("PersonalRecordsViewState(miniArchModal=");
        sb4.append(aVar);
        sb4.append(", screenContent=");
        sb4.append(bVar);
        sb4.append(", analyticsActionFromApi=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    /* JADX INFO: renamed from: q32.d$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lq32/d$a;", "", "Le31/c;", "state", "Lq32/a;", "primaryClickEvent", "secondaryClickEvent", "<init>", "(Le31/c;Lq32/a;Lq32/a;)V", "a", "(Le31/c;Lq32/a;Lq32/a;)Lq32/d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Le31/c;", "e", "()Le31/c;", "b", "Lq32/a;", "c", "()Lq32/a;", "d", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: d */
        public static final int f122341d = C12611c.f43049g;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C12611c state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC29949a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC29949a secondaryClickEvent;

        public a(C12611c state, InterfaceC29949a interfaceC29949a, InterfaceC29949a interfaceC29949a2) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC29949a;
            this.secondaryClickEvent = interfaceC29949a2;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m91629b(a aVar, C12611c c12611c, InterfaceC29949a interfaceC29949a, InterfaceC29949a interfaceC29949a2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c12611c = aVar.state;
            }
            if ((i13 & 2) != 0) {
                interfaceC29949a = aVar.primaryClickEvent;
            }
            if ((i13 & 4) != 0) {
                interfaceC29949a2 = aVar.secondaryClickEvent;
            }
            return aVar.m91630a(c12611c, interfaceC29949a, interfaceC29949a2);
        }

        /* JADX INFO: renamed from: a */
        public final a m91630a(C12611c state, InterfaceC29949a primaryClickEvent, InterfaceC29949a secondaryClickEvent) {
            AbstractC22676k.m65750j(state, "state");
            return new a(state, primaryClickEvent, secondaryClickEvent);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC29949a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC29949a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C12611c getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.state, aVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, aVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, aVar.secondaryClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC29949a interfaceC29949a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC29949a == null ? 0 : interfaceC29949a.hashCode())) * 31;
            InterfaceC29949a interfaceC29949a2 = this.secondaryClickEvent;
            return iHashCode2 + (interfaceC29949a2 != null ? interfaceC29949a2.hashCode() : 0);
        }

        public String toString() {
            return "MiniArchModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ")";
        }

        public /* synthetic */ a(C12611c c12611c, InterfaceC29949a interfaceC29949a, InterfaceC29949a interfaceC29949a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c12611c, (i13 & 2) != 0 ? null : interfaceC29949a, (i13 & 4) != 0 ? null : interfaceC29949a2);
        }
    }

    public /* synthetic */ C29952d(a aVar, b bVar, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : bVar, (i13 & 4) != 0 ? null : str);
    }
}
