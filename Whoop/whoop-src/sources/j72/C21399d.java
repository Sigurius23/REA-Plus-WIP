package j72;

import com.whoop.sage.onboarding.domain.models.SageInputRange;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j72.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\u001e\u0010\u0012R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b%\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b!\u0010(¨\u0006)"}, m65681d2 = {"Lj72/d;", "", "Lj72/g;", "screenId", "", "titleDisplay", "descriptionDisplay", "", "Lj72/f;", "inputSections", "nextButtonText", "buttonNextId", "Lcom/whoop/sage/onboarding/domain/models/SageInputRange;", "systolicRange", "diastolicRange", "<init>", "(Lj72/g;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lj72/g;Lcom/whoop/sage/onboarding/domain/models/SageInputRange;Lcom/whoop/sage/onboarding/domain/models/SageInputRange;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj72/g;", "f", "()Lj72/g;", "b", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "g", "Lcom/whoop/sage/onboarding/domain/models/SageInputRange;", "()Lcom/whoop/sage/onboarding/domain/models/SageInputRange;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21399d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC21402g screenId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String titleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String descriptionDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C21401f> inputSections;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String nextButtonText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC21402g buttonNextId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final SageInputRange systolicRange;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final SageInputRange diastolicRange;

    public C21399d(EnumC21402g screenId, String titleDisplay, String descriptionDisplay, List<C21401f> inputSections, String nextButtonText, EnumC21402g enumC21402g, SageInputRange systolicRange, SageInputRange diastolicRange) {
        AbstractC22676k.m65750j(screenId, "screenId");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(inputSections, "inputSections");
        AbstractC22676k.m65750j(nextButtonText, "nextButtonText");
        AbstractC22676k.m65750j(systolicRange, "systolicRange");
        AbstractC22676k.m65750j(diastolicRange, "diastolicRange");
        this.screenId = screenId;
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.inputSections = inputSections;
        this.nextButtonText = nextButtonText;
        this.buttonNextId = enumC21402g;
        this.systolicRange = systolicRange;
        this.diastolicRange = diastolicRange;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC21402g getButtonNextId() {
        return this.buttonNextId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SageInputRange getDiastolicRange() {
        return this.diastolicRange;
    }

    /* JADX INFO: renamed from: d */
    public final List<C21401f> m60126d() {
        return this.inputSections;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNextButtonText() {
        return this.nextButtonText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21399d)) {
            return false;
        }
        C21399d c21399d = (C21399d) other;
        return this.screenId == c21399d.screenId && AbstractC22676k.m65745e(this.titleDisplay, c21399d.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, c21399d.descriptionDisplay) && AbstractC22676k.m65745e(this.inputSections, c21399d.inputSections) && AbstractC22676k.m65745e(this.nextButtonText, c21399d.nextButtonText) && this.buttonNextId == c21399d.buttonNextId && AbstractC22676k.m65745e(this.systolicRange, c21399d.systolicRange) && AbstractC22676k.m65745e(this.diastolicRange, c21399d.diastolicRange);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC21402g getScreenId() {
        return this.screenId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final SageInputRange getSystolicRange() {
        return this.systolicRange;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.screenId.hashCode() * 31, 31, this.titleDisplay), 31, this.descriptionDisplay), 31, this.inputSections), 31, this.nextButtonText);
        EnumC21402g enumC21402g = this.buttonNextId;
        return this.diastolicRange.hashCode() + ((this.systolicRange.hashCode() + ((iM30450d + (enumC21402g == null ? 0 : enumC21402g.hashCode())) * 31)) * 31);
    }

    public String toString() {
        EnumC21402g enumC21402g = this.screenId;
        String str = this.titleDisplay;
        String str2 = this.descriptionDisplay;
        List<C21401f> list = this.inputSections;
        String str3 = this.nextButtonText;
        EnumC21402g enumC21402g2 = this.buttonNextId;
        SageInputRange sageInputRange = this.systolicRange;
        SageInputRange sageInputRange2 = this.diastolicRange;
        StringBuilder sb4 = new StringBuilder("ManualEntryState(screenId=");
        sb4.append(enumC21402g);
        sb4.append(", titleDisplay=");
        sb4.append(str);
        sb4.append(", descriptionDisplay=");
        AbstractC36095b.m114694v(str2, ", inputSections=", ", nextButtonText=", sb4, list);
        sb4.append(str3);
        sb4.append(", buttonNextId=");
        sb4.append(enumC21402g2);
        sb4.append(", systolicRange=");
        sb4.append(sageInputRange);
        sb4.append(", diastolicRange=");
        sb4.append(sageInputRange2);
        sb4.append(")");
        return sb4.toString();
    }
}
