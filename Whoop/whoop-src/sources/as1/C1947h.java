package as1;

import c93.InterfaceC4339a;
import com.whoop.journal.view.fragment.JournalSurveyAnswerFragment;
import cp0.AbstractC11009x0;
import java.util.List;
import o42.AbstractC27531k;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: as1.h */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C1947h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7741w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f7742x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f7743y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f7744z;

    public /* synthetic */ C1947h(boolean z4, boolean z13, int i13, Object obj) {
        this.f7741w = i13;
        this.f7744z = obj;
        this.f7742x = z4;
        this.f7743y = z13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f7741w) {
            case 0:
                return JournalSurveyAnswerFragment.m22356m0((JournalSurveyAnswerFragment) this.f7744z, this.f7742x, this.f7743y);
            case 1:
                return Boolean.valueOf(AbstractC11009x0.m29458V0(this.f7742x, this.f7743y, (List) this.f7744z));
            default:
                return AbstractC27531k.m82975I((Function1) this.f7744z, this.f7742x, this.f7743y);
        }
    }

    public /* synthetic */ C1947h(boolean z4, boolean z13, List list) {
        this.f7741w = 1;
        this.f7742x = z4;
        this.f7743y = z13;
        this.f7744z = list;
    }
}
