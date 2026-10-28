package l72;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l72.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, m65681d2 = {"Ll72/a;", "", "", "systolic", "diastolic", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;)Ll72/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "setSystolic", "(Ljava/lang/Integer;)V", "b", "c", "setDiastolic", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23394a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Integer systolic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Integer diastolic;

    public C23394a(Integer num, Integer num2) {
        this.systolic = num;
        this.diastolic = num2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C23394a m67704b(C23394a c23394a, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = c23394a.systolic;
        }
        if ((i13 & 2) != 0) {
            num2 = c23394a.diastolic;
        }
        return c23394a.m67705a(num, num2);
    }

    /* JADX INFO: renamed from: a */
    public final C23394a m67705a(Integer systolic, Integer diastolic) {
        return new C23394a(systolic, diastolic);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getDiastolic() {
        return this.diastolic;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getSystolic() {
        return this.systolic;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23394a)) {
            return false;
        }
        C23394a c23394a = (C23394a) other;
        return AbstractC22676k.m65745e(this.systolic, c23394a.systolic) && AbstractC22676k.m65745e(this.diastolic, c23394a.diastolic);
    }

    public int hashCode() {
        Integer num = this.systolic;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.diastolic;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "ReadingState(systolic=" + this.systolic + ", diastolic=" + this.diastolic + ")";
    }
}
