package y31;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y31.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b\u001d\u00100¨\u00061"}, m65681d2 = {"Ly31/e;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "titleIcon", "subtitle", "", "Ly31/a;", "smallButtons", "largeButtons", "", "imageUrl", "", "isCenterAligned", "bottomNavText", "Lcom/whoop/navigation/e;", "bottomNavDestination", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lgz0/m0;", "c", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Ljava/lang/String;", "Z", "i", "()Z", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39196e implements InterfaceC25312u {

    /* JADX INFO: renamed from: j */
    public static final int f168454j = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 titleIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C39192a> smallButtons;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C39192a> largeButtons;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String imageUrl;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isCenterAligned;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource bottomNavText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C9598e bottomNavDestination;

    public C39196e(TextResource title, EnumC16313m0 enumC16313m0, TextResource subtitle, List<C39192a> smallButtons, List<C39192a> largeButtons, String str, boolean z4, TextResource textResource, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(smallButtons, "smallButtons");
        AbstractC22676k.m65750j(largeButtons, "largeButtons");
        this.title = title;
        this.titleIcon = enumC16313m0;
        this.subtitle = subtitle;
        this.smallButtons = smallButtons;
        this.largeButtons = largeButtons;
        this.imageUrl = str;
        this.isCenterAligned = z4;
        this.bottomNavText = textResource;
        this.bottomNavDestination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getBottomNavDestination() {
        return this.bottomNavDestination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getBottomNavText() {
        return this.bottomNavText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e */
    public final List<C39192a> m124876e() {
        return this.largeButtons;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39196e)) {
            return false;
        }
        C39196e c39196e = (C39196e) other;
        return AbstractC22676k.m65745e(this.title, c39196e.title) && this.titleIcon == c39196e.titleIcon && AbstractC22676k.m65745e(this.subtitle, c39196e.subtitle) && AbstractC22676k.m65745e(this.smallButtons, c39196e.smallButtons) && AbstractC22676k.m65745e(this.largeButtons, c39196e.largeButtons) && AbstractC22676k.m65745e(this.imageUrl, c39196e.imageUrl) && this.isCenterAligned == c39196e.isCenterAligned && AbstractC22676k.m65745e(this.bottomNavText, c39196e.bottomNavText) && AbstractC22676k.m65745e(this.bottomNavDestination, c39196e.bottomNavDestination);
    }

    /* JADX INFO: renamed from: f */
    public final List<C39192a> m124877f() {
        return this.smallButtons;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC16313m0 getTitleIcon() {
        return this.titleIcon;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.titleIcon;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC31061c.m95625a((iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, this.subtitle, 31), 31, this.smallButtons), 31, this.largeButtons);
        String str = this.imageUrl;
        int iM8289b = AbstractC2875y.m8289b((iM31983b + (str == null ? 0 : str.hashCode())) * 31, 31, this.isCenterAligned);
        TextResource textResource = this.bottomNavText;
        int iHashCode2 = (iM8289b + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C9598e c9598e = this.bottomNavDestination;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsCenterAligned() {
        return this.isCenterAligned;
    }

    public String toString() {
        TextResource textResource = this.title;
        EnumC16313m0 enumC16313m0 = this.titleIcon;
        TextResource textResource2 = this.subtitle;
        List<C39192a> list = this.smallButtons;
        List<C39192a> list2 = this.largeButtons;
        String str = this.imageUrl;
        boolean z4 = this.isCenterAligned;
        TextResource textResource3 = this.bottomNavText;
        C9598e c9598e = this.bottomNavDestination;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("AiChatTalkTextCardViewState(title=", textResource, ", titleIcon=", enumC16313m0, ", subtitle=");
        AbstractC21702c.m61143n(textResource2, ", smallButtons=", ", largeButtons=", sbM61140k, list);
        AbstractC17176i.m48511m(", imageUrl=", str, ", isCenterAligned=", sbM61140k, list2);
        AbstractC21702c.m61144o(textResource3, ", bottomNavText=", ", bottomNavDestination=", sbM61140k, z4);
        return AbstractC33745d.m106656o(sbM61140k, c9598e, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C39196e(TextResource textResource, EnumC16313m0 enumC16313m0, TextResource textResource2, List list, List list2, String str, boolean z4, TextResource textResource3, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        enumC16313m0 = (i13 & 2) != 0 ? null : enumC16313m0;
        textResource2 = (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2;
        int i14 = i13 & 8;
        C25271y c25271y = C25271y.f99162w;
        this(textResource, enumC16313m0, textResource2, i14 != 0 ? c25271y : list, (i13 & 16) != 0 ? c25271y : list2, (i13 & 32) != 0 ? null : str, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? null : textResource3, (i13 & 256) != 0 ? null : c9598e);
    }
}
