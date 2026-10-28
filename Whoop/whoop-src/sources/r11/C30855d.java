package r11;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23465k;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import z51.EnumC40100k;

/* JADX INFO: renamed from: r11.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b-\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b\u001c\u0010/R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b \u0010/R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u00060"}, m65681d2 = {"Lr11/d;", "Lm91/u;", "", "showOptimalStrain", "", "optimalStrainPercentage", "Ll83/k;", "optimalStrainRange", "recoveryPercentage", "Lz51/k;", "recoveryType", "strainScorePercentage", "Lcom/whoop/design/util/TextResource;", "descriptionSubText", "descriptionText", "hasDivider", "<init>", "(ZFLl83/k;FLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "i", "()Z", "b", "F", "e", "()F", "c", "Ll83/k;", "f", "()Ll83/k;", "d", "g", "Lz51/k;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lz51/k;", "j", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30855d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean showOptimalStrain;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float optimalStrainPercentage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C23465k optimalStrainRange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float recoveryPercentage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC40100k recoveryType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float strainScorePercentage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource descriptionSubText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource descriptionText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean hasDivider;

    public C30855d(boolean z4, float f13, C23465k optimalStrainRange, float f14, EnumC40100k recoveryType, float f15, TextResource descriptionSubText, TextResource descriptionText, boolean z13) {
        AbstractC22676k.m65750j(optimalStrainRange, "optimalStrainRange");
        AbstractC22676k.m65750j(recoveryType, "recoveryType");
        AbstractC22676k.m65750j(descriptionSubText, "descriptionSubText");
        AbstractC22676k.m65750j(descriptionText, "descriptionText");
        this.showOptimalStrain = z4;
        this.optimalStrainPercentage = f13;
        this.optimalStrainRange = optimalStrainRange;
        this.recoveryPercentage = f14;
        this.recoveryType = recoveryType;
        this.strainScorePercentage = f15;
        this.descriptionSubText = descriptionSubText;
        this.descriptionText = descriptionText;
        this.hasDivider = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDescriptionSubText() {
        return this.descriptionSubText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescriptionText() {
        return this.descriptionText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasDivider() {
        return this.hasDivider;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getOptimalStrainPercentage() {
        return this.optimalStrainPercentage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30855d)) {
            return false;
        }
        C30855d c30855d = (C30855d) other;
        return this.showOptimalStrain == c30855d.showOptimalStrain && Float.compare(this.optimalStrainPercentage, c30855d.optimalStrainPercentage) == 0 && AbstractC22676k.m65745e(this.optimalStrainRange, c30855d.optimalStrainRange) && Float.compare(this.recoveryPercentage, c30855d.recoveryPercentage) == 0 && this.recoveryType == c30855d.recoveryType && Float.compare(this.strainScorePercentage, c30855d.strainScorePercentage) == 0 && AbstractC22676k.m65745e(this.descriptionSubText, c30855d.descriptionSubText) && AbstractC22676k.m65745e(this.descriptionText, c30855d.descriptionText) && this.hasDivider == c30855d.hasDivider;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C23465k getOptimalStrainRange() {
        return this.optimalStrainRange;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getRecoveryPercentage() {
        return this.recoveryPercentage;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC40100k getRecoveryType() {
        return this.recoveryType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasDivider) + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30447a(this.strainScorePercentage, (this.recoveryType.hashCode() + AbstractC11266d.m30447a(this.recoveryPercentage, (this.optimalStrainRange.hashCode() + AbstractC11266d.m30447a(this.optimalStrainPercentage, Boolean.hashCode(this.showOptimalStrain) * 31, 31)) * 31, 31)) * 31, 31), this.descriptionSubText, 31), this.descriptionText, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getShowOptimalStrain() {
        return this.showOptimalStrain;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getStrainScorePercentage() {
        return this.strainScorePercentage;
    }

    public String toString() {
        boolean z4 = this.showOptimalStrain;
        float f13 = this.optimalStrainPercentage;
        C23465k c23465k = this.optimalStrainRange;
        float f14 = this.recoveryPercentage;
        EnumC40100k enumC40100k = this.recoveryType;
        float f15 = this.strainScorePercentage;
        TextResource textResource = this.descriptionSubText;
        TextResource textResource2 = this.descriptionText;
        boolean z13 = this.hasDivider;
        StringBuilder sb4 = new StringBuilder("ExplainerGaugeViewState(showOptimalStrain=");
        sb4.append(z4);
        sb4.append(", optimalStrainPercentage=");
        sb4.append(f13);
        sb4.append(", optimalStrainRange=");
        sb4.append(c23465k);
        sb4.append(", recoveryPercentage=");
        sb4.append(f14);
        sb4.append(", recoveryType=");
        sb4.append(enumC40100k);
        sb4.append(", strainScorePercentage=");
        sb4.append(f15);
        sb4.append(", descriptionSubText=");
        AbstractC30007c.m91855y(sb4, textResource, ", descriptionText=", textResource2, ", hasDivider=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }
}
