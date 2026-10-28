package w12;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.onboardingpersonalization.dayzero.header.models.ConversationProgressBarModel;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25312u;
import w01.C36680e;

/* JADX INFO: renamed from: w12.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lm91/p;", "a", "Lm91/p;", "j", "()Lm91/p;", "dayZeroHeaderItemViewFactory", "Ljb1/a;", "b", "Ljb1/a;", "i", "()Ljb1/a;", "dayZeroHeaderDesignItemReducer", "onboarding-personalization_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36701d {

    /* JADX INFO: renamed from: a */
    private static final C25307p f157162a = Function1.m74306g(new C36680e(3));

    /* JADX INFO: renamed from: b */
    private static final C21535a f157163b = AbstractC21537c.m60554d(new C36680e(4));

    /* JADX INFO: renamed from: w12.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f157164w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f157164w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f157164w.invoke((ConversationProgressBarModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m117821e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C36680e(5));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m117822f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ConversationProgressBarModel.class), new a(new C36680e(6)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C36700c m117823g(ConversationProgressBarModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C36700c(model.getCurrentStep(), model.getTotalSteps());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m117824h(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36700c.class), new C36698a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final C21535a m117825i() {
        return f157163b;
    }

    /* JADX INFO: renamed from: j */
    public static final C25307p m117826j() {
        return f157162a;
    }
}
