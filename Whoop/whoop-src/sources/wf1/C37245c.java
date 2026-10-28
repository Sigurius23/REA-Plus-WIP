package wf1;

import com.whoop.design.util.TextResource;
import com.whoop.feedbacksurvey.domain.models.FeedbackSurveySectionSpacingType;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33211q0;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: wf1.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u001a\u0016\u001d\u001e\u0014B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001f"}, m65681d2 = {"Lwf1/c;", "", "Lwf1/c$b;", "popUpDialog", "Lwf1/c$c;", "fullScreenModal", "Lwf1/c$d;", "screenContent", "<init>", "(Lwf1/c$b;Lwf1/c$c;Lwf1/c$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwf1/c$b;", "b", "()Lwf1/c$b;", "Lwf1/c$c;", "()Lwf1/c$c;", "c", "Lwf1/c$d;", "()Lwf1/c$d;", "d", "e", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37245c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final b popUpDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final c fullScreenModal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final d screenContent;

    /* JADX INFO: renamed from: wf1.c$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lwf1/c$a;", "", "", "Lm91/u;", "itemViewState", "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;", "insetBottom", "<init>", "(Ljava/util/List;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;", "()Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemViewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final FeedbackSurveySectionSpacingType insetBottom;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends InterfaceC25312u> itemViewState, FeedbackSurveySectionSpacingType insetBottom) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            AbstractC22676k.m65750j(insetBottom, "insetBottom");
            this.itemViewState = itemViewState;
            this.insetBottom = insetBottom;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FeedbackSurveySectionSpacingType getInsetBottom() {
            return this.insetBottom;
        }

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC25312u> m119372b() {
            return this.itemViewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.itemViewState, aVar.itemViewState) && this.insetBottom == aVar.insetBottom;
        }

        public int hashCode() {
            return this.insetBottom.hashCode() + (this.itemViewState.hashCode() * 31);
        }

        public String toString() {
            return "ComponentItem(itemViewState=" + this.itemViewState + ", insetBottom=" + this.insetBottom + ")";
        }
    }

    /* JADX INFO: renamed from: wf1.c$b */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lwf1/c$b;", "", "", "hashCode", "()I", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {
        public abstract int hashCode();
    }

    /* JADX INFO: renamed from: wf1.c$d */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, m65681d2 = {"Lwf1/c$d;", "", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "", "Lwf1/c$a;", "items", "", "displayRefreshingAnimation", "Lwf1/c$e;", "stickyArea", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLwf1/c$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Z", "()Z", "Lwf1/c$e;", "()Lwf1/c$e;", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<a> items;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean displayRefreshingAnimation;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final e stickyArea;

        public d(TextResource toolbarTitle, List<a> items, boolean z4, e eVar) {
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(items, "items");
            this.toolbarTitle = toolbarTitle;
            this.items = items;
            this.displayRefreshingAnimation = z4;
            this.stickyArea = eVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDisplayRefreshingAnimation() {
            return this.displayRefreshingAnimation;
        }

        /* JADX INFO: renamed from: b */
        public final List<a> m119379b() {
            return this.items;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final e getStickyArea() {
            return this.stickyArea;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.toolbarTitle, dVar.toolbarTitle) && AbstractC22676k.m65745e(this.items, dVar.items) && this.displayRefreshingAnimation == dVar.displayRefreshingAnimation && AbstractC22676k.m65745e(this.stickyArea, dVar.stickyArea);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.toolbarTitle.hashCode() * 31, 31, this.items), 31, this.displayRefreshingAnimation);
            e eVar = this.stickyArea;
            return iM8289b + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            TextResource textResource = this.toolbarTitle;
            List<a> list = this.items;
            boolean z4 = this.displayRefreshingAnimation;
            e eVar = this.stickyArea;
            StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "ScreenContent(toolbarTitle=", ", items=", ", displayRefreshingAnimation=", list);
            sbM106657p.append(z4);
            sbM106657p.append(", stickyArea=");
            sbM106657p.append(eVar);
            sbM106657p.append(")");
            return sbM106657p.toString();
        }
    }

    /* JADX INFO: renamed from: wf1.c$e */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lwf1/c$e;", "", "", "text", "", "Lm91/u;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String text;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, List<? extends InterfaceC25312u> items) {
            AbstractC22676k.m65750j(items, "items");
            this.text = str;
            this.items = items;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m119382a() {
            return this.items;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.text, eVar.text) && AbstractC22676k.m65745e(this.items, eVar.items);
        }

        public int hashCode() {
            String str = this.text;
            return this.items.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return AbstractC36095b.m114679g("StickyArea(text=", this.text, ", items=", ")", this.items);
        }
    }

    public C37245c(b bVar, c cVar, d dVar) {
        this.popUpDialog = bVar;
        this.fullScreenModal = cVar;
        this.screenContent = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getPopUpDialog() {
        return this.popUpDialog;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37245c)) {
            return false;
        }
        C37245c c37245c = (C37245c) other;
        return AbstractC22676k.m65745e(this.popUpDialog, c37245c.popUpDialog) && AbstractC22676k.m65745e(this.fullScreenModal, c37245c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c37245c.screenContent);
    }

    public int hashCode() {
        int i13 = 0 * 31;
        c cVar = this.fullScreenModal;
        int iHashCode = (i13 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.screenContent;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return "FeedbackSurveyViewState(popUpDialog=" + this.popUpDialog + ", fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ")";
    }

    public /* synthetic */ C37245c(b bVar, c cVar, d dVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bVar, (i13 & 2) != 0 ? null : cVar, (i13 & 4) != 0 ? null : dVar);
    }

    /* JADX INFO: renamed from: wf1.c$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0015\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lwf1/c$c;", "", "Lsz0/q0;", "state", "Lwf1/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "followUpEvent", "<init>", "(Lsz0/q0;Lwf1/a;Lwf1/a;Lwf1/a;Lwf1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "e", "()Lsz0/q0;", "b", "Lwf1/a;", "c", "()Lwf1/a;", "d", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: f */
        public static final int f159347f = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC37243a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC37243a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC37243a backClickEvent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC37243a followUpEvent;

        public c(C33211q0 state, InterfaceC37243a interfaceC37243a, InterfaceC37243a interfaceC37243a2, InterfaceC37243a interfaceC37243a3, InterfaceC37243a interfaceC37243a4) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC37243a;
            this.secondaryClickEvent = interfaceC37243a2;
            this.backClickEvent = interfaceC37243a3;
            this.followUpEvent = interfaceC37243a4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC37243a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC37243a getFollowUpEvent() {
            return this.followUpEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC37243a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC37243a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.state, cVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, cVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, cVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, cVar.backClickEvent) && AbstractC22676k.m65745e(this.followUpEvent, cVar.followUpEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC37243a interfaceC37243a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC37243a == null ? 0 : interfaceC37243a.hashCode())) * 31;
            InterfaceC37243a interfaceC37243a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC37243a2 == null ? 0 : interfaceC37243a2.hashCode())) * 31;
            InterfaceC37243a interfaceC37243a3 = this.backClickEvent;
            int iHashCode4 = (iHashCode3 + (interfaceC37243a3 == null ? 0 : interfaceC37243a3.hashCode())) * 31;
            InterfaceC37243a interfaceC37243a4 = this.followUpEvent;
            return iHashCode4 + (interfaceC37243a4 != null ? interfaceC37243a4.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ", followUpEvent=" + this.followUpEvent + ")";
        }

        public /* synthetic */ c(C33211q0 c33211q0, InterfaceC37243a interfaceC37243a, InterfaceC37243a interfaceC37243a2, InterfaceC37243a interfaceC37243a3, InterfaceC37243a interfaceC37243a4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC37243a, (i13 & 4) != 0 ? null : interfaceC37243a2, (i13 & 8) != 0 ? null : interfaceC37243a3, (i13 & 16) != 0 ? null : interfaceC37243a4);
        }
    }
}
