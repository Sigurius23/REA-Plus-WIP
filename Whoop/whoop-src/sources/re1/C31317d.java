package re1;

import com.whoop.education.view.EducationFragment;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: re1.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C31317d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128890w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EducationFragment f128891x;

    public /* synthetic */ C31317d(EducationFragment educationFragment, int i13) {
        this.f128890w = i13;
        this.f128891x = educationFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f128890w) {
            case 0:
                return EducationFragment.m21378X(this.f128891x, (String) obj);
            default:
                return EducationFragment.m21371Q(this.f128891x, (String) obj);
        }
    }
}
