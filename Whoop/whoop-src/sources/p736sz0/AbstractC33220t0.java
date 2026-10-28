package p736sz0;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: sz0.t0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "Lkotlin/Function1;", "", "Ll83/a0;", "onEvent", "c", "(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33220t0 {

    /* JADX INFO: renamed from: sz0.t0$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.SectionViewAnalyticEffectKt$SectionViewAnalyticEffect$2$1", m100430f = "SectionViewAnalyticEffect.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f138535w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f138536x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AnalyticEventModel f138537y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, AnalyticEventModel analyticEventModel, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f138536x = function1;
            this.f138537y = analyticEventModel;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f138536x, this.f138537y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f138535w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f138536x.invoke(new DesignItemInteraction(null, this.f138537y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m105391c(final AnalyticEventModel analyticEventModel, final Function1 onEvent, Composer composer, final int i13) {
        int i14;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(646985408);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(analyticEventModel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            if (analyticEventModel == null) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i15 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: sz0.s0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int i16 = i15;
                        Composer composer2 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i16) {
                            case 0:
                                return AbstractC33220t0.m105392d(analyticEventModel, onEvent, i13, composer2, iIntValue);
                            default:
                                return AbstractC33220t0.m105393e(analyticEventModel, onEvent, i13, composer2, iIntValue);
                        }
                    }
                };
            } else {
                Object[] objArr = {analyticEventModel.getName(), analyticEventModel.getCategory(), analyticEventModel.getAction(), analyticEventModel.getValue(), analyticEventModel.getSource()};
                boolean zM87157i = c28655q.m87157i(analyticEventModel) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new a(onEvent, analyticEventModel, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87256j(objArr, (InterfaceC4351m) objM87133R, c28655q);
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i16 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: sz0.s0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = i16;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i17) {
                        case 0:
                            return AbstractC33220t0.m105392d(analyticEventModel, onEvent, i13, composer2, iIntValue);
                        default:
                            return AbstractC33220t0.m105393e(analyticEventModel, onEvent, i13, composer2, iIntValue);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m105392d(AnalyticEventModel analyticEventModel, Function1 function1, int i13, Composer composer, int i14) {
        m105391c(analyticEventModel, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m105393e(AnalyticEventModel analyticEventModel, Function1 function1, int i13, Composer composer, int i14) {
        m105391c(analyticEventModel, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
