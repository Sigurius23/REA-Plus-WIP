package lm1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: lm1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b\u001b\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b\u001f\u0010-¨\u0006."}, m65681d2 = {"Llm1/d;", "Lm91/u;", "Lkd1/o;", "pillIcon", "", "pillTitle", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lgz0/m0;", "secondaryIcon", "Llm1/a;", "commitmentLevel", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(Lkd1/o;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lgz0/m0;Llm1/a;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "c", "()Lkd1/o;", "b", "Ljava/lang/String;", "e", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "d", "g", "Lgz0/m0;", "f", "()Lgz0/m0;", "Llm1/a;", "()Llm1/a;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24514d implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f95660h = (C9598e.f28134d | TextResource.$stable) | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o pillIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String pillTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 secondaryIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC24511a commitmentLevel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C9598e navigationAction;

    public C24514d(AbstractC22403o abstractC22403o, String str, TextResource title, String str2, EnumC16313m0 enumC16313m0, EnumC24511a enumC24511a, C9598e navigationAction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(navigationAction, "navigationAction");
        this.pillIcon = abstractC22403o;
        this.pillTitle = str;
        this.title = title;
        this.subtitle = str2;
        this.secondaryIcon = enumC16313m0;
        this.commitmentLevel = enumC24511a;
        this.navigationAction = navigationAction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC24511a getCommitmentLevel() {
        return this.commitmentLevel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getNavigationAction() {
        return this.navigationAction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getPillIcon() {
        return this.pillIcon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPillTitle() {
        return this.pillTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24514d)) {
            return false;
        }
        C24514d c24514d = (C24514d) other;
        return AbstractC22676k.m65745e(this.pillIcon, c24514d.pillIcon) && AbstractC22676k.m65745e(this.pillTitle, c24514d.pillTitle) && AbstractC22676k.m65745e(this.title, c24514d.title) && AbstractC22676k.m65745e(this.subtitle, c24514d.subtitle) && this.secondaryIcon == c24514d.secondaryIcon && this.commitmentLevel == c24514d.commitmentLevel && AbstractC22676k.m65745e(this.navigationAction, c24514d.navigationAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC16313m0 getSecondaryIcon() {
        return this.secondaryIcon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        AbstractC22403o abstractC22403o = this.pillIcon;
        int iHashCode = (abstractC22403o == null ? 0 : abstractC22403o.hashCode()) * 31;
        String str = this.pillTitle;
        int iM95625a = AbstractC31061c.m95625a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.title, 31);
        String str2 = this.subtitle;
        int iHashCode2 = (iM95625a + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.secondaryIcon;
        int iHashCode3 = (iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        EnumC24511a enumC24511a = this.commitmentLevel;
        return this.navigationAction.hashCode() + ((iHashCode3 + (enumC24511a != null ? enumC24511a.hashCode() : 0)) * 31);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.pillIcon;
        String str = this.pillTitle;
        TextResource textResource = this.title;
        String str2 = this.subtitle;
        EnumC16313m0 enumC16313m0 = this.secondaryIcon;
        EnumC24511a enumC24511a = this.commitmentLevel;
        C9598e c9598e = this.navigationAction;
        StringBuilder sb4 = new StringBuilder("CoachActivityTileViewState(pillIcon=");
        sb4.append(abstractC22403o);
        sb4.append(", pillTitle=");
        sb4.append(str);
        sb4.append(", title=");
        AbstractC30007c.m91856z(sb4, textResource, ", subtitle=", str2, ", secondaryIcon=");
        sb4.append(enumC16313m0);
        sb4.append(", commitmentLevel=");
        sb4.append(enumC24511a);
        sb4.append(", navigationAction=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }
}
