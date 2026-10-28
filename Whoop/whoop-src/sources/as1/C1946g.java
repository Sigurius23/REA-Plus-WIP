package as1;

import com.whoop.journal.view.fragment.JournalSurveyAnswerFragment;
import l83.C23454a0;
import p133f1.AbstractC13967p0;
import p133f1.C13964o0;
import p133f1.EnumC13961n0;
import p133f1.InterfaceC13957m;
import p209i3.AbstractC18041w;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p294l3.C23254g;
import p510u0.EnumC34315f0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: as1.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C1946g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7737w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f7738x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f7739y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f7740z;

    public /* synthetic */ C1946g(String str, boolean z4, boolean z13) {
        this.f7737w = 1;
        this.f7738x = z4;
        this.f7740z = str;
        this.f7739y = z13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7737w) {
            case 0:
                return JournalSurveyAnswerFragment.m22352k0((JournalSurveyAnswerFragment) this.f7740z, this.f7738x, this.f7739y, ((Boolean) obj).booleanValue());
            case 1:
                String str = (String) this.f7740z;
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                AbstractC18041w.m51812k("PaymentSheetSavedPaymentOption", semantics);
                AbstractC18041w.m51811j(this.f7738x, semantics);
                AbstractC18041w.m51813l(semantics, new C23254g(6, str, null));
                if (!this.f7739y) {
                    AbstractC18041w.m51802a(semantics);
                }
                return C23454a0.f92919a;
            default:
                InterfaceC18044z interfaceC18044z = (InterfaceC18044z) obj;
                long jMo39711a = ((InterfaceC13957m) this.f7740z).mo39711a();
                ((C18030l) interfaceC18044z).m51772e(AbstractC13967p0.f49805c, new C13964o0(this.f7738x ? EnumC34315f0.f144081x : EnumC34315f0.f144082y, jMo39711a, this.f7739y ? EnumC13961n0.f49767w : EnumC13961n0.f49769y, (9223372034707292159L & jMo39711a) != 9205357640488583168L));
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C1946g(boolean z4, boolean z13, int i13, Object obj) {
        this.f7737w = i13;
        this.f7740z = obj;
        this.f7738x = z4;
        this.f7739y = z13;
    }
}
