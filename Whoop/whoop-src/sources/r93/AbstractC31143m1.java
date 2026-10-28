package r93;

import n83.C26463f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r93.m1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31143m1 {

    /* JADX INFO: renamed from: a */
    public final String f128345a;

    /* JADX INFO: renamed from: b */
    public final boolean f128346b;

    public AbstractC31143m1(String str, boolean z4) {
        this.f128345a = str;
        this.f128346b = z4;
    }

    /* JADX INFO: renamed from: a */
    public Integer mo95871a(AbstractC31143m1 visibility) {
        AbstractC22676k.m65750j(visibility, "visibility");
        C26463f c26463f = AbstractC31140l1.f128344a;
        if (this == visibility) {
            return 0;
        }
        C26463f c26463f2 = AbstractC31140l1.f128344a;
        Integer num = (Integer) c26463f2.get(this);
        Integer num2 = (Integer) c26463f2.get(visibility);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* JADX INFO: renamed from: b */
    public String mo95868b() {
        return this.f128345a;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC31143m1 mo95872c() {
        return this;
    }

    public final String toString() {
        return mo95868b();
    }
}
