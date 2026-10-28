package as1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.journal.view.fragment.JournalSurveyAnswerFragment;
import ds1.AbstractC12331a;

/* JADX INFO: renamed from: as1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C1942c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7728w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ JournalSurveyAnswerFragment f7729x;

    public /* synthetic */ C1942c(JournalSurveyAnswerFragment journalSurveyAnswerFragment, int i13) {
        this.f7728w = i13;
        this.f7729x = journalSurveyAnswerFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7728w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return JournalSurveyAnswerFragment.m22366r0(this.f7729x, (Composer) obj, iIntValue);
            case 1:
                return JournalSurveyAnswerFragment.m22374y0(this.f7729x, ((Long) obj).longValue(), (String) obj2);
            case 2:
                return JournalSurveyAnswerFragment.m22289E0(this.f7729x, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            case 3:
                return JournalSurveyAnswerFragment.m22301K0(this.f7729x, ((Boolean) obj).booleanValue(), (AbstractC12331a) obj2);
            default:
                return JournalSurveyAnswerFragment.m22283B0(this.f7729x, (String) obj, (String) obj2);
        }
    }
}
