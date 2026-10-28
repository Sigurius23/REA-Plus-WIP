package ti0;

import ep0.C13404j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p291l0.InterfaceC22973k1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ri0.C31442a;
import ri0.C31446e;
import ri0.C31447f;

/* JADX INFO: renamed from: ti0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b+\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b'\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b#\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010\u001aR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b%\u0010>\u001a\u0004\b1\u0010?¨\u0006@"}, m65681d2 = {"Lti0/e;", "Lti0/m;", "Lep0/j;", "screenContextMetadata", "Lri0/f;", "navigationBarState", "", "Lri0/e$a;", "items", "Lri0/a;", "footerState", "Lti0/l;", "backgroundTheme", "Lkd1/o;", "backgroundImage", "Lti0/g;", "paginationControlViewState", "Lti0/h;", "pullToRefreshState", "", "refreshScope", "Ll0/k1;", "listPadding", "<init>", "(Lep0/j;Lri0/f;Ljava/util/List;Lri0/a;Lti0/l;Lkd1/o;Lti0/g;Lti0/h;Ljava/lang/String;Ll0/k1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lep0/j;", "j", "()Lep0/j;", "b", "Lri0/f;", "f", "()Lri0/f;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lri0/a;", "()Lri0/a;", "e", "Lti0/l;", "()Lti0/l;", "Lkd1/o;", "()Lkd1/o;", "g", "Lti0/g;", "()Lti0/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lti0/h;", "()Lti0/h;", "i", "Ljava/lang/String;", "Ll0/k1;", "()Ll0/k1;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33840e implements InterfaceC33848m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13404j screenContextMetadata;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C31447f navigationBarState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C31446e.a> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C31442a footerState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC33847l backgroundTheme;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C33842g paginationControlViewState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC33843h pullToRefreshState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String refreshScope;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC22973k1 listPadding;

    public C33840e(C13404j c13404j, C31447f c31447f, List<C31446e.a> items, C31442a c31442a, EnumC33847l backgroundTheme, AbstractC22403o abstractC22403o, C33842g c33842g, InterfaceC33843h pullToRefreshState, String str, InterfaceC22973k1 interfaceC22973k1) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(backgroundTheme, "backgroundTheme");
        AbstractC22676k.m65750j(pullToRefreshState, "pullToRefreshState");
        this.screenContextMetadata = c13404j;
        this.navigationBarState = c31447f;
        this.items = items;
        this.footerState = c31442a;
        this.backgroundTheme = backgroundTheme;
        this.backgroundImage = abstractC22403o;
        this.paginationControlViewState = c33842g;
        this.pullToRefreshState = pullToRefreshState;
        this.refreshScope = str;
        this.listPadding = interfaceC22973k1;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC33847l getBackgroundTheme() {
        return this.backgroundTheme;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C31442a getFooterState() {
        return this.footerState;
    }

    /* JADX INFO: renamed from: d */
    public final List<C31446e.a> m107022d() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC22973k1 getListPadding() {
        return this.listPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33840e)) {
            return false;
        }
        C33840e c33840e = (C33840e) other;
        return AbstractC22676k.m65745e(this.screenContextMetadata, c33840e.screenContextMetadata) && AbstractC22676k.m65745e(this.navigationBarState, c33840e.navigationBarState) && AbstractC22676k.m65745e(this.items, c33840e.items) && AbstractC22676k.m65745e(this.footerState, c33840e.footerState) && this.backgroundTheme == c33840e.backgroundTheme && AbstractC22676k.m65745e(this.backgroundImage, c33840e.backgroundImage) && AbstractC22676k.m65745e(this.paginationControlViewState, c33840e.paginationControlViewState) && AbstractC22676k.m65745e(this.pullToRefreshState, c33840e.pullToRefreshState) && AbstractC22676k.m65745e(this.refreshScope, c33840e.refreshScope) && AbstractC22676k.m65745e(this.listPadding, c33840e.listPadding);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C31447f getNavigationBarState() {
        return this.navigationBarState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C33842g getPaginationControlViewState() {
        return this.paginationControlViewState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC33843h getPullToRefreshState() {
        return this.pullToRefreshState;
    }

    public int hashCode() {
        C13404j c13404j = this.screenContextMetadata;
        int iHashCode = (c13404j == null ? 0 : c13404j.hashCode()) * 31;
        C31447f c31447f = this.navigationBarState;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (c31447f == null ? 0 : c31447f.hashCode())) * 31, 31, this.items);
        C31442a c31442a = this.footerState;
        int iHashCode2 = (this.backgroundTheme.hashCode() + ((iM31983b + (c31442a == null ? 0 : c31442a.hashCode())) * 31)) * 31;
        AbstractC22403o abstractC22403o = this.backgroundImage;
        int iHashCode3 = (iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        C33842g c33842g = this.paginationControlViewState;
        int iHashCode4 = (this.pullToRefreshState.hashCode() + ((iHashCode3 + (c33842g == null ? 0 : c33842g.hashCode())) * 31)) * 31;
        String str = this.refreshScope;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC22973k1 interfaceC22973k1 = this.listPadding;
        return iHashCode5 + (interfaceC22973k1 != null ? interfaceC22973k1.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRefreshScope() {
        return this.refreshScope;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C13404j getScreenContextMetadata() {
        return this.screenContextMetadata;
    }

    public String toString() {
        return "ListContentState(screenContextMetadata=" + this.screenContextMetadata + ", navigationBarState=" + this.navigationBarState + ", items=" + this.items + ", footerState=" + this.footerState + ", backgroundTheme=" + this.backgroundTheme + ", backgroundImage=" + this.backgroundImage + ", paginationControlViewState=" + this.paginationControlViewState + ", pullToRefreshState=" + this.pullToRefreshState + ", refreshScope=" + this.refreshScope + ", listPadding=" + this.listPadding + ")";
    }
}
