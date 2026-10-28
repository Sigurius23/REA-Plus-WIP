package c41;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: c41.s4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0017\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u001c\u0010#¨\u0006$"}, m65681d2 = {"Lc41/s4;", "Lm91/u;", "", "filledCount", "totalCount", "fillIcon", "Ly81/f;", "iconColor", "backgroundColor", "", "showCount", "fillMaxWidth", "<init>", "(IIILy81/f;Ly81/f;ZZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "d", "Ly81/f;", "f", "()Ly81/f;", "Z", "g", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4115s4 implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f16704h = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int filledCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int totalCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int fillIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f iconColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean showCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean fillMaxWidth;

    public C4115s4(int i13, int i14, int i15, EnumC39333f iconColor, EnumC39333f backgroundColor, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(iconColor, "iconColor");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        this.filledCount = i13;
        this.totalCount = i14;
        this.fillIcon = i15;
        this.iconColor = iconColor;
        this.backgroundColor = backgroundColor;
        this.showCount = z4;
        this.fillMaxWidth = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFillIcon() {
        return this.fillIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getFillMaxWidth() {
        return this.fillMaxWidth;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getFilledCount() {
        return this.filledCount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4115s4)) {
            return false;
        }
        C4115s4 c4115s4 = (C4115s4) other;
        return this.filledCount == c4115s4.filledCount && this.totalCount == c4115s4.totalCount && this.fillIcon == c4115s4.fillIcon && this.iconColor == c4115s4.iconColor && this.backgroundColor == c4115s4.backgroundColor && this.showCount == c4115s4.showCount && this.fillMaxWidth == c4115s4.fillMaxWidth;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC39333f getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShowCount() {
        return this.showCount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return Boolean.hashCode(this.fillMaxWidth) + AbstractC2875y.m8289b(AbstractC21702c.m61132c(this.backgroundColor, AbstractC21702c.m61132c(this.iconColor, AbstractC11266d.m30448b(this.fillIcon, AbstractC11266d.m30448b(this.totalCount, Integer.hashCode(this.filledCount) * 31, 31), 31), 31), 31), 31, this.showCount);
    }

    public String toString() {
        int i13 = this.filledCount;
        int i14 = this.totalCount;
        int i15 = this.fillIcon;
        EnumC39333f enumC39333f = this.iconColor;
        EnumC39333f enumC39333f2 = this.backgroundColor;
        boolean z4 = this.showCount;
        boolean z13 = this.fillMaxWidth;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "RecoveryImpactEmptyState(filledCount=", ", totalCount=", ", fillIcon=");
        sbM30465s.append(i15);
        sbM30465s.append(", iconColor=");
        sbM30465s.append(enumC39333f);
        sbM30465s.append(", backgroundColor=");
        sbM30465s.append(enumC39333f2);
        sbM30465s.append(", showCount=");
        sbM30465s.append(z4);
        sbM30465s.append(", fillMaxWidth=");
        return AbstractC18489d0.m53372m(sbM30465s, z13, ")");
    }

    public /* synthetic */ C4115s4(int i13, int i14, int i15, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, boolean z4, boolean z13, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, i15, enumC39333f, enumC39333f2, z4, (i16 & 64) != 0 ? true : z13);
    }
}
