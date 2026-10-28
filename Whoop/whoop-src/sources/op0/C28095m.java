package op0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1717o2;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import gf2.C15809r;
import l83.C23454a0;
import p180h0.C16416l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qe2.AbstractC30312e;

/* JADX INFO: renamed from: op0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J_\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lop0/m;", "Landroidx/recyclerview/widget/o2;", "Lgf2/r;", "binding", "<init>", "(Lgf2/r;)V", "Lop0/c;", "sleepCoachOnBoardingItem", "", "position", "Lkotlin/Function2;", "Ll83/a0;", "onNextClick", "onBackClick", "Lkotlin/Function0;", "closeIconClick", "d", "(Lop0/c;ILc93/m;Lc93/m;Lc93/a;)V", "a", "Lgf2/r;", "getBinding", "()Lgf2/r;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28095m extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C15809r binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28095m(C15809r binding) {
        super(binding.getRoot());
        AbstractC22676k.m65750j(binding, "binding");
        this.binding = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m84878e(InterfaceC4351m interfaceC4351m, EnumC28085c enumC28085c, int i13, View it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4351m.invoke(enumC28085c, Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m84879f(InterfaceC4351m interfaceC4351m, EnumC28085c enumC28085c, int i13, View it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4351m.invoke(enumC28085c, Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m84880g(InterfaceC4339a interfaceC4339a, View it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public final void m84881d(final EnumC28085c sleepCoachOnBoardingItem, final int position, final InterfaceC4351m onNextClick, final InterfaceC4351m onBackClick, InterfaceC4339a closeIconClick) {
        AbstractC22676k.m65750j(sleepCoachOnBoardingItem, "sleepCoachOnBoardingItem");
        AbstractC22676k.m65750j(onNextClick, "onNextClick");
        AbstractC22676k.m65750j(onBackClick, "onBackClick");
        AbstractC22676k.m65750j(closeIconClick, "closeIconClick");
        C15809r c15809r = this.binding;
        ImageView imageView = (ImageView) c15809r.getRoot().findViewById(AbstractC30312e.f124193t0);
        if (imageView != null) {
            imageView.setImageResource(sleepCoachOnBoardingItem.getBackgroundImage());
        }
        TextView textView = (TextView) c15809r.getRoot().findViewById(AbstractC30312e.f124202w0);
        if (textView != null) {
            textView.setText(sleepCoachOnBoardingItem.getTitle());
        }
        TextView textView2 = (TextView) c15809r.getRoot().findViewById(AbstractC30312e.f124196u0);
        if (textView2 != null) {
            textView2.setText(sleepCoachOnBoardingItem.getDescriptionOne());
        }
        TextView textView3 = (TextView) c15809r.getRoot().findViewById(AbstractC30312e.f124199v0);
        if (textView3 != null) {
            textView3.setText(sleepCoachOnBoardingItem.getDescriptionTwo());
        }
        TextView textView4 = (TextView) c15809r.getRoot().findViewById(AbstractC30312e.f124181p0);
        if (textView4 != null) {
            textView4.setText(sleepCoachOnBoardingItem.getNextButtonText());
            textView4.setVisibility(sleepCoachOnBoardingItem.getNextButtonVisibility() ? 0 : 8);
        }
        TextView textView5 = (TextView) c15809r.getRoot().findViewById(AbstractC30312e.f124180p);
        if (textView5 != null) {
            textView5.setVisibility(sleepCoachOnBoardingItem.getBackButtonVisibility() ? 0 : 8);
        }
        ImageView imageView2 = (ImageView) c15809r.getRoot().findViewById(AbstractC30312e.f124201w);
        if (imageView2 != null) {
            imageView2.setVisibility(sleepCoachOnBoardingItem.getIsCloseIconVisible() ? 0 : 8);
        }
        TextView nextScreen = c15809r.f59673g;
        AbstractC22676k.m65749i(nextScreen, "nextScreen");
        final int i13 = 0;
        AbstractC1953c.m5963a(nextScreen, new Function1() { // from class: op0.l
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C28095m.m84878e(onNextClick, sleepCoachOnBoardingItem, position, (View) obj);
                    default:
                        return C28095m.m84879f(onNextClick, sleepCoachOnBoardingItem, position, (View) obj);
                }
            }
        });
        TextView backScreen = c15809r.f59668b;
        AbstractC22676k.m65749i(backScreen, "backScreen");
        final int i14 = 1;
        AbstractC1953c.m5963a(backScreen, new Function1() { // from class: op0.l
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C28095m.m84878e(onBackClick, sleepCoachOnBoardingItem, position, (View) obj);
                    default:
                        return C28095m.m84879f(onBackClick, sleepCoachOnBoardingItem, position, (View) obj);
                }
            }
        });
        ImageView closeOnboarding = c15809r.f59669c;
        AbstractC22676k.m65749i(closeOnboarding, "closeOnboarding");
        AbstractC1953c.m5963a(closeOnboarding, new C16416l0(closeIconClick, 20));
    }
}
