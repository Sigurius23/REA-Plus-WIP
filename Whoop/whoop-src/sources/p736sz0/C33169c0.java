package p736sz0;

import b91.EnumC2888c;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p208i2.AbstractC17911t;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: sz0.c0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J|\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b'\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b0\u00107R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b4\u0010:R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b2\u0010;\u001a\u0004\b8\u0010<¨\u0006="}, m65681d2 = {"Lsz0/c0;", "Lm91/u;", "", "text", "Lb91/c;", "style", "Ly81/f;", "color", "Lw3/k;", "alignment", "Lgz0/m0;", "icon", "", "maxLines", "minLines", "Li2/t;", "colorBrush", "", "fillWidth", "Lsz0/y;", "iconPosition", "<init>", "(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;)Lsz0/c0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "m", "b", "Lb91/c;", "l", "()Lb91/c;", "c", "Ly81/f;", "e", "()Ly81/f;", "d", "I", "Lgz0/m0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lgz0/m0;", "f", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "g", "k", "Li2/t;", "()Li2/t;", "i", "Z", "()Z", "Lsz0/y;", "()Lsz0/y;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33169c0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: k */
    public static final int f138321k = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC2888c style;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f color;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int alignment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Integer maxLines;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Integer minLines;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AbstractC17911t colorBrush;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean fillWidth;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC33232y iconPosition;

    public /* synthetic */ C33169c0(String str, EnumC2888c enumC2888c, EnumC39333f enumC39333f, int i13, EnumC16313m0 enumC16313m0, Integer num, Integer num2, AbstractC17911t abstractC17911t, boolean z4, EnumC33232y enumC33232y, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, enumC2888c, enumC39333f, i13, enumC16313m0, num, num2, abstractC17911t, z4, enumC33232y);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33169c0 m105070b(C33169c0 c33169c0, String str, EnumC2888c enumC2888c, EnumC39333f enumC39333f, int i13, EnumC16313m0 enumC16313m0, Integer num, Integer num2, AbstractC17911t abstractC17911t, boolean z4, EnumC33232y enumC33232y, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = c33169c0.text;
        }
        if ((i14 & 2) != 0) {
            enumC2888c = c33169c0.style;
        }
        if ((i14 & 4) != 0) {
            enumC39333f = c33169c0.color;
        }
        if ((i14 & 8) != 0) {
            i13 = c33169c0.alignment;
        }
        if ((i14 & 16) != 0) {
            enumC16313m0 = c33169c0.icon;
        }
        if ((i14 & 32) != 0) {
            num = c33169c0.maxLines;
        }
        if ((i14 & 64) != 0) {
            num2 = c33169c0.minLines;
        }
        if ((i14 & 128) != 0) {
            abstractC17911t = c33169c0.colorBrush;
        }
        if ((i14 & 256) != 0) {
            z4 = c33169c0.fillWidth;
        }
        if ((i14 & 512) != 0) {
            enumC33232y = c33169c0.iconPosition;
        }
        boolean z13 = z4;
        EnumC33232y enumC33232y2 = enumC33232y;
        Integer num3 = num2;
        AbstractC17911t abstractC17911t2 = abstractC17911t;
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        Integer num4 = num;
        return c33169c0.m105071a(str, enumC2888c, enumC39333f, i13, enumC16313m1, num4, num3, abstractC17911t2, z13, enumC33232y2);
    }

    /* JADX INFO: renamed from: a */
    public final C33169c0 m105071a(String text, EnumC2888c style, EnumC39333f color, int alignment, EnumC16313m0 icon, Integer maxLines, Integer minLines, AbstractC17911t colorBrush, boolean fillWidth, EnumC33232y iconPosition) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(iconPosition, "iconPosition");
        return new C33169c0(text, style, color, alignment, icon, maxLines, minLines, colorBrush, fillWidth, iconPosition, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33169c0)) {
            return false;
        }
        C33169c0 c33169c0 = (C33169c0) other;
        return AbstractC22676k.m65745e(this.text, c33169c0.text) && this.style == c33169c0.style && this.color == c33169c0.color && this.alignment == c33169c0.alignment && this.icon == c33169c0.icon && AbstractC22676k.m65745e(this.maxLines, c33169c0.maxLines) && AbstractC22676k.m65745e(this.minLines, c33169c0.minLines) && AbstractC22676k.m65745e(this.colorBrush, c33169c0.colorBrush) && this.fillWidth == c33169c0.fillWidth && this.iconPosition == c33169c0.iconPosition;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC17911t getColorBrush() {
        return this.colorBrush;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getFillWidth() {
        return this.fillWidth;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.alignment, AbstractC21702c.m61132c(this.color, (this.style.hashCode() + (this.text.hashCode() * 31)) * 31, 31), 31);
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode = (iM30448b + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        Integer num = this.maxLines;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minLines;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        AbstractC17911t abstractC17911t = this.colorBrush;
        return this.iconPosition.hashCode() + AbstractC2875y.m8289b((iHashCode3 + (abstractC17911t != null ? abstractC17911t.hashCode() : 0)) * 31, 31, this.fillWidth);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC33232y getIconPosition() {
        return this.iconPosition;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getMinLines() {
        return this.minLines;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC2888c getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public String toString() {
        return "MarkdownTextState(text=" + this.text + ", style=" + this.style + ", color=" + this.color + ", alignment=" + C36775k.m117881a(this.alignment) + ", icon=" + this.icon + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", colorBrush=" + this.colorBrush + ", fillWidth=" + this.fillWidth + ", iconPosition=" + this.iconPosition + ")";
    }

    private C33169c0(String text, EnumC2888c style, EnumC39333f color, int i13, EnumC16313m0 enumC16313m0, Integer num, Integer num2, AbstractC17911t abstractC17911t, boolean z4, EnumC33232y iconPosition) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(iconPosition, "iconPosition");
        this.text = text;
        this.style = style;
        this.color = color;
        this.alignment = i13;
        this.icon = enumC16313m0;
        this.maxLines = num;
        this.minLines = num2;
        this.colorBrush = abstractC17911t;
        this.fillWidth = z4;
        this.iconPosition = iconPosition;
    }

    public /* synthetic */ C33169c0(String str, EnumC2888c enumC2888c, EnumC39333f enumC39333f, int i13, EnumC16313m0 enumC16313m0, Integer num, Integer num2, AbstractC17911t abstractC17911t, boolean z4, EnumC33232y enumC33232y, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, enumC2888c, enumC39333f, i13, (i14 & 16) != 0 ? null : enumC16313m0, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? null : num2, (i14 & 128) != 0 ? null : abstractC17911t, (i14 & 256) != 0 ? true : z4, (i14 & 512) != 0 ? EnumC33232y.TRAILING : enumC33232y, null);
    }
}
