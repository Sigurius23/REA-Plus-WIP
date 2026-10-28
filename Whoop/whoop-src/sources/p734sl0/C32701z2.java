package p734sl0;

import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sl0.z2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, m65681d2 = {"Lsl0/z2;", "", "", "suggestionText", "", "isSelected", "isAnimating", "isClickable", "<init>", "(Ljava/lang/String;ZZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "d", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32701z2 {

    /* JADX INFO: renamed from: e */
    public static final int f135825e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String suggestionText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isAnimating;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isClickable;

    public C32701z2(String suggestionText, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(suggestionText, "suggestionText");
        this.suggestionText = suggestionText;
        this.isSelected = z4;
        this.isAnimating = z13;
        this.isClickable = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSuggestionText() {
        return this.suggestionText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsAnimating() {
        return this.isAnimating;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsClickable() {
        return this.isClickable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32701z2)) {
            return false;
        }
        C32701z2 c32701z2 = (C32701z2) other;
        return AbstractC22676k.m65745e(this.suggestionText, c32701z2.suggestionText) && this.isSelected == c32701z2.isSelected && this.isAnimating == c32701z2.isAnimating && this.isClickable == c32701z2.isClickable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isClickable) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.suggestionText.hashCode() * 31, 31, this.isSelected), 31, this.isAnimating);
    }

    public String toString() {
        String str = this.suggestionText;
        boolean z4 = this.isSelected;
        return AbstractC36095b.m114682j(AbstractC25012a.m73379l("SuggestionBubbleViewState(suggestionText=", str, ", isSelected=", ", isAnimating=", z4), this.isAnimating, ", isClickable=", this.isClickable, ")");
    }

    public /* synthetic */ C32701z2(String str, boolean z4, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? true : z14);
    }
}
