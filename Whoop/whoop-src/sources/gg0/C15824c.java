package gg0;

import c13.AbstractC3855a;
import com.whoop.advancedlabsjoin.feature.updatetests.domain.models.UpdateTestsSectionSpacingType;
import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: gg0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0015\"\u0017\u001b#B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m65681d2 = {"Lgg0/c;", "Lfy1/k;", "Lgg0/c$e;", "popUpDialog", "Lgg0/c$b;", "fullScreenModal", "Lgg0/c$c;", "screenContent", "<init>", "(Lgg0/c$e;Lgg0/c$b;Lgg0/c$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lgg0/c$e;", "c", "()Lgg0/c$e;", "Lgg0/c$b;", "()Lgg0/c$b;", "d", "Lgg0/c$c;", "()Lgg0/c$c;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "e", "a", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15824c implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final e popUpDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final b fullScreenModal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final c screenContent;

    /* JADX INFO: renamed from: gg0.c$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lgg0/c$a;", "", "", "Lm91/u;", "itemViewState", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsSectionSpacingType;", "sectionType", "<init>", "(Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsSectionSpacingType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsSectionSpacingType;", "()Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsSectionSpacingType;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemViewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final UpdateTestsSectionSpacingType sectionType;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends InterfaceC25312u> itemViewState, UpdateTestsSectionSpacingType sectionType) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            AbstractC22676k.m65750j(sectionType, "sectionType");
            this.itemViewState = itemViewState;
            this.sectionType = sectionType;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m44644a() {
            return this.itemViewState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final UpdateTestsSectionSpacingType getSectionType() {
            return this.sectionType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.itemViewState, aVar.itemViewState) && this.sectionType == aVar.sectionType;
        }

        public int hashCode() {
            return this.sectionType.hashCode() + (this.itemViewState.hashCode() * 31);
        }

        public String toString() {
            return "ComponentItem(itemViewState=" + this.itemViewState + ", sectionType=" + this.sectionType + ")";
        }
    }

    /* JADX INFO: renamed from: gg0.c$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u0019\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010\u0012R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b'\u0010\u0012R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b\u001d\u0010\u0012¨\u0006)"}, m65681d2 = {"Lgg0/c$c;", "", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "", "Lgg0/c$a;", "items", "", "displayRefreshingAnimation", "Lgg0/c$d;", "sticky", "", "selectedSegmentId", "source", "initialSelectedSegmentId", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLgg0/c$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Z", "()Z", "d", "Lgg0/c$d;", "f", "()Lgg0/c$d;", "e", "Ljava/lang/String;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<a> items;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean displayRefreshingAnimation;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final d sticky;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String selectedSegmentId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String initialSelectedSegmentId;

        public c(TextResource toolbarTitle, List<a> items, boolean z4, d dVar, String selectedSegmentId, String source, String initialSelectedSegmentId) {
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(initialSelectedSegmentId, "initialSelectedSegmentId");
            this.toolbarTitle = toolbarTitle;
            this.items = items;
            this.displayRefreshingAnimation = z4;
            this.sticky = dVar;
            this.selectedSegmentId = selectedSegmentId;
            this.source = source;
            this.initialSelectedSegmentId = initialSelectedSegmentId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDisplayRefreshingAnimation() {
            return this.displayRefreshingAnimation;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInitialSelectedSegmentId() {
            return this.initialSelectedSegmentId;
        }

        /* JADX INFO: renamed from: c */
        public final List<a> m44652c() {
            return this.items;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSelectedSegmentId() {
            return this.selectedSegmentId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.toolbarTitle, cVar.toolbarTitle) && AbstractC22676k.m65745e(this.items, cVar.items) && this.displayRefreshingAnimation == cVar.displayRefreshingAnimation && AbstractC22676k.m65745e(this.sticky, cVar.sticky) && AbstractC22676k.m65745e(this.selectedSegmentId, cVar.selectedSegmentId) && AbstractC22676k.m65745e(this.source, cVar.source) && AbstractC22676k.m65745e(this.initialSelectedSegmentId, cVar.initialSelectedSegmentId);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final d getSticky() {
            return this.sticky;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.toolbarTitle.hashCode() * 31, 31, this.items), 31, this.displayRefreshingAnimation);
            d dVar = this.sticky;
            return this.initialSelectedSegmentId.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM8289b + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.selectedSegmentId), 31, this.source);
        }

        public String toString() {
            TextResource textResource = this.toolbarTitle;
            List<a> list = this.items;
            boolean z4 = this.displayRefreshingAnimation;
            d dVar = this.sticky;
            String str = this.selectedSegmentId;
            String str2 = this.source;
            String str3 = this.initialSelectedSegmentId;
            StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "ScreenContent(toolbarTitle=", ", items=", ", displayRefreshingAnimation=", list);
            sbM106657p.append(z4);
            sbM106657p.append(", sticky=");
            sbM106657p.append(dVar);
            sbM106657p.append(", selectedSegmentId=");
            AbstractC11266d.m30444B(sbM106657p, str, ", source=", str2, ", initialSelectedSegmentId=");
            return AbstractC25012a.m73376i(str3, ")", sbM106657p);
        }
    }

    /* JADX INFO: renamed from: gg0.c$d */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lgg0/c$d;", "", "", "text", "", "Lm91/u;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String text;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, List<? extends InterfaceC25312u> items) {
            AbstractC22676k.m65750j(items, "items");
            this.text = str;
            this.items = items;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m44657a() {
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
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.text, dVar.text) && AbstractC22676k.m65745e(this.items, dVar.items);
        }

        public int hashCode() {
            String str = this.text;
            return this.items.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return AbstractC36095b.m114679g("StickyArea(text=", this.text, ", items=", ")", this.items);
        }
    }

    /* JADX INFO: renamed from: gg0.c$e */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lgg0/c$e;", "", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "", "Lgg0/c$a;", "sections", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "Ljava/util/List;", "()Ljava/util/List;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<a> sections;

        public e(String id4, TextResource title, List<a> sections) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(sections, "sections");
            this.id = id4;
            this.title = title;
            this.sections = sections;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b */
        public final List<a> m44660b() {
            return this.sections;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.id, eVar.id) && AbstractC22676k.m65745e(this.title, eVar.title) && AbstractC22676k.m65745e(this.sections, eVar.sections);
        }

        public int hashCode() {
            return this.sections.hashCode() + AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31);
        }

        public String toString() {
            String str = this.id;
            TextResource textResource = this.title;
            return AbstractC3855a.m11829m(AbstractC30007c.m91847q("UpdateTestsDialogState(id=", str, ", title=", textResource, ", sections="), this.sections, ")");
        }
    }

    public C15824c(e eVar, b bVar, c cVar) {
        this.popUpDialog = eVar;
        this.fullScreenModal = bVar;
        this.screenContent = cVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getPopUpDialog() {
        return this.popUpDialog;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15824c)) {
            return false;
        }
        C15824c c15824c = (C15824c) other;
        return AbstractC22676k.m65745e(this.popUpDialog, c15824c.popUpDialog) && AbstractC22676k.m65745e(this.fullScreenModal, c15824c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c15824c.screenContent);
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        b bVar = this.fullScreenModal;
        if (bVar == null) {
            return this.screenContent != null ? ScreenState.SUCCESS : ScreenState.UNKNOWN;
        }
        AbstractC33208p0 type = bVar.getState().getType();
        if (type instanceof AbstractC33208p0.c) {
            return ScreenState.LOADING;
        }
        return type instanceof AbstractC33208p0.b ? ScreenState.ERROR : ScreenState.OTHER;
    }

    public int hashCode() {
        e eVar = this.popUpDialog;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        b bVar = this.fullScreenModal;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.screenContent;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "UpdateTestsViewState(popUpDialog=" + this.popUpDialog + ", fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ")";
    }

    /* JADX INFO: renamed from: gg0.c$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lgg0/c$b;", "", "Lsz0/q0;", "state", "Lgg0/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Lgg0/a;Lgg0/a;Lgg0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Lgg0/a;", "()Lgg0/a;", "c", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: e */
        public static final int f59785e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC15822a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC15822a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC15822a backClickEvent;

        public b(C33211q0 state, InterfaceC15822a interfaceC15822a, InterfaceC15822a interfaceC15822a2, InterfaceC15822a interfaceC15822a3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC15822a;
            this.secondaryClickEvent = interfaceC15822a2;
            this.backClickEvent = interfaceC15822a3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC15822a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC15822a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC15822a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.state, bVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, bVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, bVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, bVar.backClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC15822a interfaceC15822a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC15822a == null ? 0 : interfaceC15822a.hashCode())) * 31;
            InterfaceC15822a interfaceC15822a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC15822a2 == null ? 0 : interfaceC15822a2.hashCode())) * 31;
            InterfaceC15822a interfaceC15822a3 = this.backClickEvent;
            return iHashCode3 + (interfaceC15822a3 != null ? interfaceC15822a3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ b(C33211q0 c33211q0, InterfaceC15822a interfaceC15822a, InterfaceC15822a interfaceC15822a2, InterfaceC15822a interfaceC15822a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC15822a, (i13 & 4) != 0 ? null : interfaceC15822a2, (i13 & 8) != 0 ? null : interfaceC15822a3);
        }
    }

    public /* synthetic */ C15824c(e eVar, b bVar, c cVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : eVar, (i13 & 2) != 0 ? null : bVar, (i13 & 4) != 0 ? null : cVar);
    }
}
