package p734sl0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.bot.models.feedback.AiMessageFeedback;

/* JADX INFO: renamed from: sl0.c0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32590c0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135044w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f135045x;

    public /* synthetic */ C32590c0(int i13, InterfaceC4351m interfaceC4351m) {
        this.f135044w = i13;
        this.f135045x = interfaceC4351m;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135044w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC32600e0.m101727j(this.f135045x, (Composer) obj, iIntValue);
            default:
                return AbstractC32679u0.m102330B0(this.f135045x, (String) obj, (AiMessageFeedback) obj2);
        }
    }
}
