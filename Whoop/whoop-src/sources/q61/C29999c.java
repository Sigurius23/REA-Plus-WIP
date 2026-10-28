package q61;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: q61.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001a\u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001c\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019¨\u0006\""}, m65681d2 = {"Lq61/c;", "", "", "x", "y", "", "icon", "Ly81/e;", "iconColor", "style", "width", "<init>", "(FFLjava/lang/Integer;Ly81/e;Ly81/e;F)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "e", "()F", "b", "f", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "Ly81/e;", "()Ly81/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29999c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float x;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float y;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC39332e iconColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e style;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: q61.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f122498w = new a();

        /* JADX INFO: renamed from: a */
        public final long m91791a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m91791a((C39336i) obj));
        }
    }

    public C29999c(float f13, float f14, Integer num, InterfaceC39332e iconColor, InterfaceC39332e style, float f15) {
        AbstractC22676k.m65750j(iconColor, "iconColor");
        AbstractC22676k.m65750j(style, "style");
        this.x = f13;
        this.y = f14;
        this.icon = num;
        this.iconColor = iconColor;
        this.style = style;
        this.width = f15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getX() {
        return this.x;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29999c)) {
            return false;
        }
        C29999c c29999c = (C29999c) other;
        return Float.compare(this.x, c29999c.x) == 0 && Float.compare(this.y, c29999c.y) == 0 && AbstractC22676k.m65745e(this.icon, c29999c.icon) && AbstractC22676k.m65745e(this.iconColor, c29999c.iconColor) && AbstractC22676k.m65745e(this.style, c29999c.style) && Float.compare(this.width, c29999c.width) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.y, Float.hashCode(this.x) * 31, 31);
        Integer num = this.icon;
        return Float.hashCode(this.width) + AbstractC33745d.m106648g(this.style, AbstractC33745d.m106648g(this.iconColor, (iM30447a + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
    }

    public String toString() {
        float f13 = this.x;
        float f14 = this.y;
        Integer num = this.icon;
        InterfaceC39332e interfaceC39332e = this.iconColor;
        InterfaceC39332e interfaceC39332e2 = this.style;
        float f15 = this.width;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("IconGroupState(x=", f13, ", y=", f14, ", icon=");
        sbM8307t.append(num);
        sbM8307t.append(", iconColor=");
        sbM8307t.append(interfaceC39332e);
        sbM8307t.append(", style=");
        sbM8307t.append(interfaceC39332e2);
        sbM8307t.append(", width=");
        sbM8307t.append(f15);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }

    public /* synthetic */ C29999c(float f13, float f14, Integer num, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, float f15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, num, (i13 & 8) != 0 ? p745y81.Function1.m125323a(a.f122498w) : interfaceC39332e, interfaceC39332e2, f15);
    }
}
