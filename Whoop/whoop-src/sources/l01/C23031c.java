package l01;

import b91.EnumC2888c;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: l01.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001b\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b\u001e\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b%\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\"\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b)\u0010-¨\u0006."}, m65681d2 = {"Ll01/c;", "", "", "title", "Ly81/f;", "textColor", "Lgz0/m0;", "icon", "iconBackgroundColor", "iconTintColor", "Ll01/a;", "shape", "Ly3/f;", "iconSize", "Lb91/c;", "textStyle", "<init>", "(Ljava/lang/String;Ly81/f;Lgz0/m0;Ly81/f;Ly81/f;Ll01/a;FLb91/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "Ly81/f;", "f", "()Ly81/f;", "c", "Lgz0/m0;", "()Lgz0/m0;", "d", "e", "Ll01/a;", "()Ll01/a;", "g", "F", "()F", "Lb91/c;", "()Lb91/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23031c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f textColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f iconBackgroundColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC39333f iconTintColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC23029a shape;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float iconSize;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC2888c textStyle;

    public /* synthetic */ C23031c(String str, EnumC39333f enumC39333f, EnumC16313m0 enumC16313m0, EnumC39333f enumC39333f2, EnumC39333f enumC39333f3, EnumC23029a enumC23029a, float f13, EnumC2888c enumC2888c, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, enumC39333f, enumC16313m0, enumC39333f2, enumC39333f3, enumC23029a, f13, enumC2888c);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC39333f getIconTintColor() {
        return this.iconTintColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC23029a getShape() {
        return this.shape;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23031c)) {
            return false;
        }
        C23031c c23031c = (C23031c) other;
        return AbstractC22676k.m65745e(this.title, c23031c.title) && this.textColor == c23031c.textColor && this.icon == c23031c.icon && this.iconBackgroundColor == c23031c.iconBackgroundColor && this.iconTintColor == c23031c.iconTintColor && this.shape == c23031c.shape && C39174f.m124782b(this.iconSize, c23031c.iconSize) && this.textStyle == c23031c.textStyle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC39333f getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC2888c getTextStyle() {
        return this.textStyle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM61132c = AbstractC21702c.m61132c(this.textColor, this.title.hashCode() * 31, 31);
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode = (iM61132c + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        EnumC39333f enumC39333f = this.iconBackgroundColor;
        int iHashCode2 = (iHashCode + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        EnumC39333f enumC39333f2 = this.iconTintColor;
        int iHashCode3 = (iHashCode2 + (enumC39333f2 == null ? 0 : enumC39333f2.hashCode())) * 31;
        EnumC23029a enumC23029a = this.shape;
        return this.textStyle.hashCode() + AbstractC11266d.m30447a(this.iconSize, (iHashCode3 + (enumC23029a != null ? enumC23029a.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        return "FeatureItemState(title=" + this.title + ", textColor=" + this.textColor + ", icon=" + this.icon + ", iconBackgroundColor=" + this.iconBackgroundColor + ", iconTintColor=" + this.iconTintColor + ", shape=" + this.shape + ", iconSize=" + C39174f.m124783c(this.iconSize) + ", textStyle=" + this.textStyle + ")";
    }

    private C23031c(String title, EnumC39333f textColor, EnumC16313m0 enumC16313m0, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC23029a enumC23029a, float f13, EnumC2888c textStyle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(textColor, "textColor");
        AbstractC22676k.m65750j(textStyle, "textStyle");
        this.title = title;
        this.textColor = textColor;
        this.icon = enumC16313m0;
        this.iconBackgroundColor = enumC39333f;
        this.iconTintColor = enumC39333f2;
        this.shape = enumC23029a;
        this.iconSize = f13;
        this.textStyle = textStyle;
    }

    public C23031c(String str, EnumC39333f enumC39333f, EnumC16313m0 enumC16313m0, EnumC39333f enumC39333f2, EnumC39333f enumC39333f3, EnumC23029a enumC23029a, float f13, EnumC2888c enumC2888c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, enumC16313m0, enumC39333f2, enumC39333f3, (i13 & 32) != 0 ? EnumC23029a.ROUNDED_SQUARE : enumC23029a, (i13 & 64) != 0 ? ((float) 2.5d) * 4 : f13, (i13 & 128) != 0 ? EnumC2888c.B2 : enumC2888c, null);
    }
}
