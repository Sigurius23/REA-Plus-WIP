package p734sl0;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.bot.models.feedback.FeedbackReason;
import java.util.List;
import p209i3.InterfaceC18044z;
import p390p1.C28624i0;
import p390p1.InterfaceC28670t2;
import p412q3.C29891y;
import p510u0.InterfaceC34345p0;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import ql0.InterfaceC30468c;

/* JADX INFO: renamed from: sl0.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32604f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135129w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f135130x;

    public /* synthetic */ C32604f(Object obj, int i13) {
        this.f135129w = i13;
        this.f135130x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135129w) {
            case 0:
                return AbstractC32619i.m101816H((InterfaceC4339a) this.f135130x, (InterfaceC34345p0) obj);
            case 1:
                return Function2.m102169i((InterfaceC4351m) this.f135130x, (List) obj);
            case 2:
                return AbstractC32681u2.m102459L((C39967p) this.f135130x, (FeedbackReason) obj);
            case 3:
                return Boolean.valueOf(AbstractC32681u2.m102460M((FeedbackReason) this.f135130x, (FeedbackReason) obj));
            case 4:
                return AbstractC32613g3.m101803x((String) this.f135130x, (InterfaceC18044z) obj);
            case 5:
                return AbstractC32658p3.m102179D((InterfaceC30468c) this.f135130x, (C28624i0) obj);
            default:
                return AbstractC32658p3.m102194S((InterfaceC28670t2) this.f135130x, (C29891y) obj);
        }
    }
}
