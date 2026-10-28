package p736sz0;

import b91.EnumC2888c;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27273p0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: sz0.k1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0082\u0001\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b,\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b%\u00103\u001a\u0004\b4\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b*\u00103\u001a\u0004\b1\u0010\u001bR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, m65681d2 = {"Lsz0/k1;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subTitle", "Ly81/f;", "titleColor", "subtitleColor", "Lb91/c;", "titleStyle", "subTitleStyle", "Lw3/k;", "textAlign", "", "titleMaxLines", "subtitleMaxLines", "Lny0/p0;", "trailingIcon", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;)Lsz0/k1;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Ly81/f;", "j", "()Ly81/f;", "e", "f", "Lb91/c;", "l", "()Lb91/c;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "k", "Lny0/p0;", "m", "()Lny0/p0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33194k1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: l */
    public static final int f138384l = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f titleColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC39333f subtitleColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC2888c titleStyle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC2888c subTitleStyle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int textAlign;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int titleMaxLines;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int subtitleMaxLines;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C27273p0 trailingIcon;

    public /* synthetic */ C33194k1(String str, TextResource textResource, TextResource textResource2, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC2888c enumC2888c, EnumC2888c enumC2888c2, int i13, int i14, int i15, C27273p0 c27273p0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, textResource2, enumC39333f, enumC39333f2, enumC2888c, enumC2888c2, i13, i14, i15, c27273p0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33194k1 m105178b(C33194k1 c33194k1, String str, TextResource textResource, TextResource textResource2, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC2888c enumC2888c, EnumC2888c enumC2888c2, int i13, int i14, int i15, C27273p0 c27273p0, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = c33194k1.id;
        }
        if ((i16 & 2) != 0) {
            textResource = c33194k1.title;
        }
        if ((i16 & 4) != 0) {
            textResource2 = c33194k1.subTitle;
        }
        if ((i16 & 8) != 0) {
            enumC39333f = c33194k1.titleColor;
        }
        if ((i16 & 16) != 0) {
            enumC39333f2 = c33194k1.subtitleColor;
        }
        if ((i16 & 32) != 0) {
            enumC2888c = c33194k1.titleStyle;
        }
        if ((i16 & 64) != 0) {
            enumC2888c2 = c33194k1.subTitleStyle;
        }
        if ((i16 & 128) != 0) {
            i13 = c33194k1.textAlign;
        }
        if ((i16 & 256) != 0) {
            i14 = c33194k1.titleMaxLines;
        }
        if ((i16 & 512) != 0) {
            i15 = c33194k1.subtitleMaxLines;
        }
        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c27273p0 = c33194k1.trailingIcon;
        }
        int i17 = i15;
        C27273p0 c27273p1 = c27273p0;
        int i18 = i13;
        int i19 = i14;
        EnumC2888c enumC2888c3 = enumC2888c;
        EnumC2888c enumC2888c4 = enumC2888c2;
        EnumC39333f enumC39333f3 = enumC39333f2;
        TextResource textResource3 = textResource2;
        return c33194k1.m105179a(str, textResource, textResource3, enumC39333f, enumC39333f3, enumC2888c3, enumC2888c4, i18, i19, i17, c27273p1);
    }

    /* JADX INFO: renamed from: a */
    public final C33194k1 m105179a(String id4, TextResource title, TextResource subTitle, EnumC39333f titleColor, EnumC39333f subtitleColor, EnumC2888c titleStyle, EnumC2888c subTitleStyle, int textAlign, int titleMaxLines, int subtitleMaxLines, C27273p0 trailingIcon) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        AbstractC22676k.m65750j(subtitleColor, "subtitleColor");
        AbstractC22676k.m65750j(titleStyle, "titleStyle");
        AbstractC22676k.m65750j(subTitleStyle, "subTitleStyle");
        return new C33194k1(id4, title, subTitle, titleColor, subtitleColor, titleStyle, subTitleStyle, textAlign, titleMaxLines, subtitleMaxLines, trailingIcon, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC2888c getSubTitleStyle() {
        return this.subTitleStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33194k1)) {
            return false;
        }
        C33194k1 c33194k1 = (C33194k1) other;
        return AbstractC22676k.m65745e(this.id, c33194k1.id) && AbstractC22676k.m65745e(this.title, c33194k1.title) && AbstractC22676k.m65745e(this.subTitle, c33194k1.subTitle) && this.titleColor == c33194k1.titleColor && this.subtitleColor == c33194k1.subtitleColor && this.titleStyle == c33194k1.titleStyle && this.subTitleStyle == c33194k1.subTitleStyle && this.textAlign == c33194k1.textAlign && this.titleMaxLines == c33194k1.titleMaxLines && this.subtitleMaxLines == c33194k1.subtitleMaxLines && AbstractC22676k.m65745e(this.trailingIcon, c33194k1.trailingIcon);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC39333f getSubtitleColor() {
        return this.subtitleColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSubtitleMaxLines() {
        return this.subtitleMaxLines;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    public int hashCode() {
        String str = this.id;
        int iM30448b = AbstractC11266d.m30448b(this.subtitleMaxLines, AbstractC11266d.m30448b(this.titleMaxLines, AbstractC11266d.m30448b(this.textAlign, (this.subTitleStyle.hashCode() + ((this.titleStyle.hashCode() + AbstractC21702c.m61132c(this.subtitleColor, AbstractC21702c.m61132c(this.titleColor, AbstractC31061c.m95625a(AbstractC31061c.m95625a((str == null ? 0 : str.hashCode()) * 31, this.title, 31), this.subTitle, 31), 31), 31)) * 31)) * 31, 31), 31), 31);
        C27273p0 c27273p0 = this.trailingIcon;
        return iM30448b + (c27273p0 != null ? c27273p0.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC39333f getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getTitleMaxLines() {
        return this.titleMaxLines;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC2888c getTitleStyle() {
        return this.titleStyle;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C27273p0 getTrailingIcon() {
        return this.trailingIcon;
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subTitle;
        EnumC39333f enumC39333f = this.titleColor;
        EnumC39333f enumC39333f2 = this.subtitleColor;
        EnumC2888c enumC2888c = this.titleStyle;
        EnumC2888c enumC2888c2 = this.subTitleStyle;
        String strM117881a = C36775k.m117881a(this.textAlign);
        int i13 = this.titleMaxLines;
        int i14 = this.subtitleMaxLines;
        C27273p0 c27273p0 = this.trailingIcon;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("TitleSubtitleState(id=", str, ", title=", textResource, ", subTitle=");
        sbM91847q.append(textResource2);
        sbM91847q.append(", titleColor=");
        sbM91847q.append(enumC39333f);
        sbM91847q.append(", subtitleColor=");
        sbM91847q.append(enumC39333f2);
        sbM91847q.append(", titleStyle=");
        sbM91847q.append(enumC2888c);
        sbM91847q.append(", subTitleStyle=");
        sbM91847q.append(enumC2888c2);
        sbM91847q.append(", textAlign=");
        sbM91847q.append(strM117881a);
        sbM91847q.append(", titleMaxLines=");
        AbstractC30802r.m94773v(sbM91847q, i13, ", subtitleMaxLines=", i14, ", trailingIcon=");
        sbM91847q.append(c27273p0);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    private C33194k1(String str, TextResource title, TextResource subTitle, EnumC39333f titleColor, EnumC39333f subtitleColor, EnumC2888c titleStyle, EnumC2888c subTitleStyle, int i13, int i14, int i15, C27273p0 c27273p0) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        AbstractC22676k.m65750j(subtitleColor, "subtitleColor");
        AbstractC22676k.m65750j(titleStyle, "titleStyle");
        AbstractC22676k.m65750j(subTitleStyle, "subTitleStyle");
        this.id = str;
        this.title = title;
        this.subTitle = subTitle;
        this.titleColor = titleColor;
        this.subtitleColor = subtitleColor;
        this.titleStyle = titleStyle;
        this.subTitleStyle = subTitleStyle;
        this.textAlign = i13;
        this.titleMaxLines = i14;
        this.subtitleMaxLines = i15;
        this.trailingIcon = c27273p0;
    }

    public /* synthetic */ C33194k1(String str, TextResource textResource, TextResource textResource2, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC2888c enumC2888c, EnumC2888c enumC2888c2, int i13, int i14, int i15, C27273p0 c27273p0, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, textResource2, (i16 & 8) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, (i16 & 16) != 0 ? EnumC39333f.WHITE_70 : enumC39333f2, enumC2888c, enumC2888c2, (i16 & 128) != 0 ? 5 : i13, (i16 & 256) != 0 ? Integer.MAX_VALUE : i14, (i16 & 512) != 0 ? Integer.MAX_VALUE : i15, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c27273p0, null);
    }
}
