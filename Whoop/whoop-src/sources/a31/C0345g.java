package a31;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: a31.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0014\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"La31/g;", "", "", "number", "Lcom/whoop/design/util/TextResource;", "numberTextResource", "", "isSet", "atMax", "atMin", "<init>", "(Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;ZZZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "Z", "e", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0345g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer number;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource numberTextResource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSet;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean atMax;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean atMin;

    public C0345g(Integer num, TextResource numberTextResource, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(numberTextResource, "numberTextResource");
        this.number = num;
        this.numberTextResource = numberTextResource;
        this.isSet = z4;
        this.atMax = z13;
        this.atMin = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAtMax() {
        return this.atMax;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAtMin() {
        return this.atMin;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getNumberTextResource() {
        return this.numberTextResource;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSet() {
        return this.isSet;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0345g)) {
            return false;
        }
        C0345g c0345g = (C0345g) other;
        return AbstractC22676k.m65745e(this.number, c0345g.number) && AbstractC22676k.m65745e(this.numberTextResource, c0345g.numberTextResource) && this.isSet == c0345g.isSet && this.atMax == c0345g.atMax && this.atMin == c0345g.atMin;
    }

    public int hashCode() {
        Integer num = this.number;
        return Boolean.hashCode(this.atMin) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a((num == null ? 0 : num.hashCode()) * 31, this.numberTextResource, 31), 31, this.isSet), 31, this.atMax);
    }

    public String toString() {
        Integer num = this.number;
        TextResource textResource = this.numberTextResource;
        boolean z4 = this.isSet;
        boolean z13 = this.atMax;
        boolean z14 = this.atMin;
        StringBuilder sb4 = new StringBuilder("NumericStepperState(number=");
        sb4.append(num);
        sb4.append(", numberTextResource=");
        sb4.append(textResource);
        sb4.append(", isSet=");
        AbstractC38963t7.m124392v(sb4, z4, ", atMax=", z13, ", atMin=");
        return AbstractC18489d0.m53372m(sb4, z14, ")");
    }
}
