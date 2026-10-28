package v93;

import n83.C26463f;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.AbstractC31140l1;
import r93.AbstractC31143m1;
import r93.C31125g1;
import r93.C31128h1;
import r93.C31131i1;

/* JADX INFO: renamed from: v93.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C35835a extends AbstractC31143m1 {

    /* JADX INFO: renamed from: c */
    public static final C35835a f152568c = new C35835a("package", false);

    @Override // r93.AbstractC31143m1
    /* JADX INFO: renamed from: a */
    public final Integer mo95871a(AbstractC31143m1 visibility) {
        AbstractC22676k.m65750j(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        C26463f c26463f = AbstractC31140l1.f128344a;
        return (visibility == C31125g1.f128336c || visibility == C31128h1.f128339c) ? 1 : -1;
    }

    @Override // r93.AbstractC31143m1
    /* JADX INFO: renamed from: b */
    public final String mo95868b() {
        return "public/*package*/";
    }

    @Override // r93.AbstractC31143m1
    /* JADX INFO: renamed from: c */
    public final AbstractC31143m1 mo95872c() {
        return C31131i1.f128341c;
    }
}
