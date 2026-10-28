package tp1;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: tp1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\n\u0010 ¨\u0006!"}, m65681d2 = {"Ltp1/b;", "", "Lgz0/m0;", "icon", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "descriptionDisplay", "", "value", "", "isSelected", "<init>", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "b", "()Lgz0/m0;", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "d", "Ljava/lang/String;", "e", "Z", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34062b {

    /* JADX INFO: renamed from: f */
    public static final int f142747f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource descriptionDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isSelected;

    public C34062b(EnumC16313m0 enumC16313m0, TextResource titleDisplay, TextResource textResource, String value, boolean z4) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(value, "value");
        this.icon = enumC16313m0;
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = textResource;
        this.value = value;
        this.isSelected = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34062b)) {
            return false;
        }
        C34062b c34062b = (C34062b) other;
        return this.icon == c34062b.icon && AbstractC22676k.m65745e(this.titleDisplay, c34062b.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, c34062b.descriptionDisplay) && AbstractC22676k.m65745e(this.value, c34062b.value) && this.isSelected == c34062b.isSelected;
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.icon;
        int iM95625a = AbstractC31061c.m95625a((enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31, this.titleDisplay, 31);
        TextResource textResource = this.descriptionDisplay;
        return Boolean.hashCode(this.isSelected) + AbstractC11266d.m30450d((iM95625a + (textResource != null ? textResource.hashCode() : 0)) * 31, 31, this.value);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.descriptionDisplay;
        String str = this.value;
        boolean z4 = this.isSelected;
        StringBuilder sb4 = new StringBuilder("HormonalInsightsBottomSheetOptionState(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", titleDisplay=");
        sb4.append(textResource);
        sb4.append(", descriptionDisplay=");
        AbstractC30007c.m91856z(sb4, textResource2, ", value=", str, ", isSelected=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
