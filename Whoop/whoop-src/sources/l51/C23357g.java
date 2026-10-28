package l51;

import b91.EnumC2888c;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import kd1.AbstractC22403o;
import m83.C25272z;
import p031b9.AbstractC2875y;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: l51.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001\u001fBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jr\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, m65681d2 = {"Ll51/g;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Ll51/h;", "startButton", "endButton", "Lkd1/o;", "backgroundImage", "Lb91/c;", "subtitleStyle", "", "subtitleStickOnScroll", "collapsed", "", "collapseProgress", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll51/h;Ll51/h;Lkd1/o;Lb91/c;ZZLjava/lang/Float;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll51/h;Ll51/h;Lkd1/o;Lb91/c;ZZLjava/lang/Float;)Ll51/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "q", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ll51/h;", "n", "()Ll51/h;", "m", "e", "Lkd1/o;", "j", "()Lkd1/o;", "f", "Lb91/c;", "p", "()Lb91/c;", "g", "Z", "o", "()Z", "l", "i", "Ljava/lang/Float;", "k", "()Ljava/lang/Float;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23357g implements InterfaceC25312u {

    /* JADX INFO: renamed from: n */
    private static final float f92583n;

    /* JADX INFO: renamed from: p */
    private static final float f92585p;

    /* JADX INFO: renamed from: q */
    private static final float f92586q;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C23358h startButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C23358h endButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC2888c subtitleStyle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean subtitleStickOnScroll;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean collapsed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Float collapseProgress;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k */
    public static final int f92580k = GenericInteraction.$stable;

    /* JADX INFO: renamed from: l */
    private static final float f92581l = 262;

    /* JADX INFO: renamed from: m */
    private static final float f92582m = 56;

    /* JADX INFO: renamed from: o */
    private static final Map<EnumC2888c, C39174f> f92584o = C25272z.f99163w;

    /* JADX INFO: renamed from: l51.g$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Ll51/g$a;", "", "<init>", "()V", "Lcom/whoop/design/util/TextResource;", "subtitle", "Lb91/c;", "subtitleStyle", "", "stickOnScroll", "Ly3/f;", "e", "(Lcom/whoop/design/util/TextResource;Lb91/c;Z)F", "EXPANDED_HEIGHT_DP", "F", "b", "()F", "COLLAPSED_TOOLBAR_HEIGHT_DP", "a", "SUBTITLE_BOTTOM_INSET_DP", "c", "SUBTITLE_TOP_INSET_COLLAPSED_DP", "d", "STICKY_SUBTITLE_LINE_APPROX_DP", "", "STICKY_SUBTITLE_LINE_APPROX_BY_STYLE", "Ljava/util/Map;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final float m67643a() {
            return C23357g.f92582m;
        }

        /* JADX INFO: renamed from: b */
        public final float m67644b() {
            return C23357g.f92581l;
        }

        /* JADX INFO: renamed from: c */
        public final float m67645c() {
            return C23357g.f92585p;
        }

        /* JADX INFO: renamed from: d */
        public final float m67646d() {
            return C23357g.f92586q;
        }

        /* JADX INFO: renamed from: e */
        public final float m67647e(TextResource subtitle, EnumC2888c subtitleStyle, boolean stickOnScroll) {
            C39174f c39174f;
            AbstractC22676k.m65750j(subtitle, "subtitle");
            if (stickOnScroll && AbstractC8693b.m21270d(subtitle)) {
                return m67645c() + m67646d() + ((subtitleStyle == null || (c39174f = (C39174f) C23357g.f92584o.get(subtitleStyle)) == null) ? C23357g.f92583n : c39174f.f168413w);
            }
            return 0;
        }

        private Companion() {
        }
    }

    static {
        float f13 = 8;
        f92583n = 3 * f13;
        f92585p = 2 * f13;
        f92586q = 1 * f13;
    }

    public C23357g(TextResource title, TextResource subtitle, C23358h startButton, C23358h c23358h, AbstractC22403o abstractC22403o, EnumC2888c enumC2888c, boolean z4, boolean z13, Float f13) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(startButton, "startButton");
        this.title = title;
        this.subtitle = subtitle;
        this.startButton = startButton;
        this.endButton = c23358h;
        this.backgroundImage = abstractC22403o;
        this.subtitleStyle = enumC2888c;
        this.subtitleStickOnScroll = z4;
        this.collapsed = z13;
        this.collapseProgress = f13;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C23357g m67632i(C23357g c23357g, TextResource textResource, TextResource textResource2, C23358h c23358h, C23358h c23358h2, AbstractC22403o abstractC22403o, EnumC2888c enumC2888c, boolean z4, boolean z13, Float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c23357g.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = c23357g.subtitle;
        }
        if ((i13 & 4) != 0) {
            c23358h = c23357g.startButton;
        }
        if ((i13 & 8) != 0) {
            c23358h2 = c23357g.endButton;
        }
        if ((i13 & 16) != 0) {
            abstractC22403o = c23357g.backgroundImage;
        }
        if ((i13 & 32) != 0) {
            enumC2888c = c23357g.subtitleStyle;
        }
        if ((i13 & 64) != 0) {
            z4 = c23357g.subtitleStickOnScroll;
        }
        if ((i13 & 128) != 0) {
            z13 = c23357g.collapsed;
        }
        if ((i13 & 256) != 0) {
            f13 = c23357g.collapseProgress;
        }
        boolean z14 = z13;
        Float f14 = f13;
        EnumC2888c enumC2888c2 = enumC2888c;
        boolean z15 = z4;
        AbstractC22403o abstractC22403o2 = abstractC22403o;
        C23358h c23358h3 = c23358h;
        return c23357g.m67634h(textResource, textResource2, c23358h3, c23358h2, abstractC22403o2, enumC2888c2, z15, z14, f14);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23357g)) {
            return false;
        }
        C23357g c23357g = (C23357g) other;
        return AbstractC22676k.m65745e(this.title, c23357g.title) && AbstractC22676k.m65745e(this.subtitle, c23357g.subtitle) && AbstractC22676k.m65745e(this.startButton, c23357g.startButton) && AbstractC22676k.m65745e(this.endButton, c23357g.endButton) && AbstractC22676k.m65745e(this.backgroundImage, c23357g.backgroundImage) && this.subtitleStyle == c23357g.subtitleStyle && this.subtitleStickOnScroll == c23357g.subtitleStickOnScroll && this.collapsed == c23357g.collapsed && AbstractC22676k.m65745e(this.collapseProgress, c23357g.collapseProgress);
    }

    /* JADX INFO: renamed from: h */
    public final C23357g m67634h(TextResource title, TextResource subtitle, C23358h startButton, C23358h endButton, AbstractC22403o backgroundImage, EnumC2888c subtitleStyle, boolean subtitleStickOnScroll, boolean collapsed, Float collapseProgress) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(startButton, "startButton");
        return new C23357g(title, subtitle, startButton, endButton, backgroundImage, subtitleStyle, subtitleStickOnScroll, collapsed, collapseProgress);
    }

    public int hashCode() {
        int iHashCode = (this.startButton.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31)) * 31;
        C23358h c23358h = this.endButton;
        int iHashCode2 = (iHashCode + (c23358h == null ? 0 : c23358h.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.backgroundImage;
        int iHashCode3 = (iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        EnumC2888c enumC2888c = this.subtitleStyle;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode3 + (enumC2888c == null ? 0 : enumC2888c.hashCode())) * 31, 31, this.subtitleStickOnScroll), 31, this.collapsed);
        Float f13 = this.collapseProgress;
        return iM8289b + (f13 != null ? f13.hashCode() : 0);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final AbstractC22403o getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Float getCollapseProgress() {
        return this.collapseProgress;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getCollapsed() {
        return this.collapsed;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C23358h getEndButton() {
        return this.endButton;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C23358h getStartButton() {
        return this.startButton;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getSubtitleStickOnScroll() {
        return this.subtitleStickOnScroll;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final EnumC2888c getSubtitleStyle() {
        return this.subtitleStyle;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        C23358h c23358h = this.startButton;
        C23358h c23358h2 = this.endButton;
        AbstractC22403o abstractC22403o = this.backgroundImage;
        EnumC2888c enumC2888c = this.subtitleStyle;
        boolean z4 = this.subtitleStickOnScroll;
        boolean z13 = this.collapsed;
        Float f13 = this.collapseProgress;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("CollapsableHeaderViewState(title=", textResource, ", subtitle=", textResource2, ", startButton=");
        sbM106658q.append(c23358h);
        sbM106658q.append(", endButton=");
        sbM106658q.append(c23358h2);
        sbM106658q.append(", backgroundImage=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(", subtitleStyle=");
        sbM106658q.append(enumC2888c);
        sbM106658q.append(", subtitleStickOnScroll=");
        AbstractC38963t7.m124392v(sbM106658q, z4, ", collapsed=", z13, ", collapseProgress=");
        sbM106658q.append(f13);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C23357g(TextResource textResource, TextResource textResource2, C23358h c23358h, C23358h c23358h2, AbstractC22403o abstractC22403o, EnumC2888c enumC2888c, boolean z4, boolean z13, Float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, c23358h, (i13 & 8) != 0 ? null : c23358h2, (i13 & 16) != 0 ? null : abstractC22403o, (i13 & 32) != 0 ? null : enumC2888c, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? false : z13, (i13 & 256) != 0 ? null : f13);
    }
}
