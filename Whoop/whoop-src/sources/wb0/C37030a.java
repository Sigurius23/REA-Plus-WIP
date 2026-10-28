package wb0;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: wb0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0015\u0010!R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006#"}, m65681d2 = {"Lwb0/a;", "", "", "inputValue", "", "numericValue", "", "isValid", "Lcom/whoop/design/util/TextResource;", "errorMessage", "hasValueChanged", "<init>", "(Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/design/util/TextResource;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getInputValue", "b", "Ljava/lang/Double;", "getNumericValue", "()Ljava/lang/Double;", "c", "Z", "()Z", "d", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "e", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37030a {

    /* JADX INFO: renamed from: f */
    public static final int f158418f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String inputValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Double numericValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isValid;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource errorMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean hasValueChanged;

    public C37030a(String inputValue, Double d3, boolean z4, TextResource errorMessage, boolean z13) {
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        this.inputValue = inputValue;
        this.numericValue = d3;
        this.isValid = z4;
        this.errorMessage = errorMessage;
        this.hasValueChanged = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasValueChanged() {
        return this.hasValueChanged;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37030a)) {
            return false;
        }
        C37030a c37030a = (C37030a) other;
        return AbstractC22676k.m65745e(this.inputValue, c37030a.inputValue) && AbstractC22676k.m65745e(this.numericValue, c37030a.numericValue) && this.isValid == c37030a.isValid && AbstractC22676k.m65745e(this.errorMessage, c37030a.errorMessage) && this.hasValueChanged == c37030a.hasValueChanged;
    }

    public int hashCode() {
        int iHashCode = this.inputValue.hashCode() * 31;
        Double d3 = this.numericValue;
        return Boolean.hashCode(this.hasValueChanged) + AbstractC31061c.m95625a(AbstractC2875y.m8289b((iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31, 31, this.isValid), this.errorMessage, 31);
    }

    public String toString() {
        String str = this.inputValue;
        Double d3 = this.numericValue;
        boolean z4 = this.isValid;
        TextResource textResource = this.errorMessage;
        boolean z13 = this.hasValueChanged;
        StringBuilder sb4 = new StringBuilder("BiomarkerValidationState(inputValue=");
        sb4.append(str);
        sb4.append(", numericValue=");
        sb4.append(d3);
        sb4.append(", isValid=");
        AbstractC21702c.m61144o(textResource, ", errorMessage=", ", hasValueChanged=", sb4, z4);
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }
}
