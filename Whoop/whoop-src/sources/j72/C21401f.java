package j72;

import com.whoop.sage.onboarding.domain.models.SageManualReadingInputSectionText;
import d13.AbstractC11478a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j72.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lj72/f;", "", "Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputSectionText;", "text", "", "systolicInput", "diastolicInput", "<init>", "(Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputSectionText;Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputSectionText;", "c", "()Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputSectionText;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21401f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SageManualReadingInputSectionText text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer systolicInput;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer diastolicInput;

    public C21401f(SageManualReadingInputSectionText text, Integer num, Integer num2) {
        AbstractC22676k.m65750j(text, "text");
        this.text = text;
        this.systolicInput = num;
        this.diastolicInput = num2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getDiastolicInput() {
        return this.diastolicInput;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getSystolicInput() {
        return this.systolicInput;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SageManualReadingInputSectionText getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21401f)) {
            return false;
        }
        C21401f c21401f = (C21401f) other;
        return AbstractC22676k.m65745e(this.text, c21401f.text) && AbstractC22676k.m65745e(this.systolicInput, c21401f.systolicInput) && AbstractC22676k.m65745e(this.diastolicInput, c21401f.diastolicInput);
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Integer num = this.systolicInput;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.diastolicInput;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        SageManualReadingInputSectionText sageManualReadingInputSectionText = this.text;
        Integer num = this.systolicInput;
        Integer num2 = this.diastolicInput;
        StringBuilder sb4 = new StringBuilder("SageManualReadingInputSection(text=");
        sb4.append(sageManualReadingInputSectionText);
        sb4.append(", systolicInput=");
        sb4.append(num);
        sb4.append(", diastolicInput=");
        return AbstractC11478a.m30859k(sb4, num2, ")");
    }
}
