package re1;

import c93.InterfaceC4339a;
import com.whoop.education.view.EducationFragment;

/* JADX INFO: renamed from: re1.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C31316c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128887w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EducationFragment f128888x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f128889y;

    public /* synthetic */ C31316c(EducationFragment educationFragment, String str, int i13) {
        this.f128887w = i13;
        this.f128888x = educationFragment;
        this.f128889y = str;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f128887w) {
            case 0:
                return EducationFragment.m21375U(this.f128888x, this.f128889y);
            case 1:
                return EducationFragment.m21369O(this.f128888x, this.f128889y);
            default:
                return EducationFragment.m21372R(this.f128888x, this.f128889y);
        }
    }
}
