package as1;

import com.whoop.journal.view.fragment.C8998c;
import com.whoop.journal.view.fragment.JournalSurveyAnswerFragment;
import com.whoop.navigation.C9598e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: as1.i */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C1948i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7745w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ JournalSurveyAnswerFragment f7746x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C8998c f7747y;

    public /* synthetic */ C1948i(JournalSurveyAnswerFragment journalSurveyAnswerFragment, C8998c c8998c, int i13) {
        this.f7745w = i13;
        this.f7746x = journalSurveyAnswerFragment;
        this.f7747y = c8998c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7745w) {
            case 0:
                return JournalSurveyAnswerFragment.m22362p0(this.f7746x, this.f7747y, obj);
            default:
                return JournalSurveyAnswerFragment.m22295H0(this.f7746x, this.f7747y, (C9598e) obj);
        }
    }
}
