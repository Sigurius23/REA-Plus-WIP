package as1;

import com.whoop.journal.view.fragment.JournalSurveyAnswerFragment;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: as1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C1943d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7730w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ JournalSurveyAnswerFragment f7731x;

    public /* synthetic */ C1943d(JournalSurveyAnswerFragment journalSurveyAnswerFragment, int i13) {
        this.f7730w = i13;
        this.f7731x = journalSurveyAnswerFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7730w) {
            case 0:
                return JournalSurveyAnswerFragment.m22371w0(this.f7731x, ((Integer) obj).intValue());
            case 1:
                return JournalSurveyAnswerFragment.m22348i0(this.f7731x, ((Boolean) obj).booleanValue());
            case 2:
                return JournalSurveyAnswerFragment.m22358n0(this.f7731x, ((Boolean) obj).booleanValue());
            case 3:
                return JournalSurveyAnswerFragment.m22291F0(this.f7731x, ((Boolean) obj).booleanValue());
            case 4:
                return JournalSurveyAnswerFragment.m22305M0(this.f7731x, ((Boolean) obj).booleanValue());
            default:
                return JournalSurveyAnswerFragment.m22285C0(this.f7731x, ((Integer) obj).intValue());
        }
    }
}
