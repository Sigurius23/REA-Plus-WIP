package co1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: co1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lco1/a;", "", "", "ovulationIcon", "Lco1/b;", "outline", "<init>", "(Ljava/lang/Integer;Lco1/b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getOvulationIcon", "()Ljava/lang/Integer;", "b", "Lco1/b;", "getOutline", "()Lco1/b;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4859a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer ovulationIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C4860b outline;

    public C4859a(Integer num, C4860b c4860b) {
        this.ovulationIcon = num;
        this.outline = c4860b;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4859a)) {
            return false;
        }
        C4859a c4859a = (C4859a) other;
        return AbstractC22676k.m65745e(this.ovulationIcon, c4859a.ovulationIcon) && AbstractC22676k.m65745e(this.outline, c4859a.outline);
    }

    public int hashCode() {
        Integer num = this.ovulationIcon;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C4860b c4860b = this.outline;
        return iHashCode + (c4860b != null ? c4860b.hashCode() : 0);
    }

    public String toString() {
        return "FertilityCalendarDateState(ovulationIcon=" + this.ovulationIcon + ", outline=" + this.outline + ")";
    }
}
