package o31;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.Action;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import java.io.IOException;
import l83.C23454a0;
import nx1.C27225g;
import p127ev.AbstractC13673n;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: o31.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lo31/e;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onEvent", "d", "(Landroidx/compose/ui/Modifier;Lo31/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "searchQuery", "", "hasReportedFocus", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27513d {

    /* JADX INFO: renamed from: o31.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.searchbar.SearchBarKt$SearchBar$1$1", m100430f = "SearchBar.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f110786w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27514e f110787x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f110788y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f110789z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C27514e c27514e, InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f110787x = c27514e;
            this.f110788y = interfaceC28601c1;
            this.f110789z = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f110787x, this.f110788y, this.f110789z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f110786w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f110786w = 1;
                if (AbstractC3034m0.m8782b(300L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Action actionM82922a = C27510a.f110781a.m82922a(AbstractC27513d.m82930e(this.f110788y), this.f110787x.getStateUpdateSearchKey());
            if (actionM82922a != null) {
                this.f110789z.invoke(actionM82922a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m82929d(Modifier modifier, C27514e state, Function1 onEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1332309056);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            String strM82930e = m82930e(interfaceC28601c1);
            int i15 = i14 & 896;
            boolean zM87157i = c28655q2.m87157i(state) | (i15 == 256);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new a(state, interfaceC28601c1, onEvent, null);
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, strM82930e);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(m82930e(interfaceC28601c1));
            TextResource placeholderText = state.getPlaceholderText();
            Integer icon = state.getIcon();
            int keyboardType = state.getKeyboardType();
            boolean zM87157i2 = c28655q2.m87157i(state) | (i15 == 256);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                objM87133R4 = new C27512c(state, interfaceC28601c2, onEvent);
                c28655q2.m87172p0(objM87133R4);
            }
            Function1 function1 = (Function1) objM87133R4;
            boolean zM87157i3 = c28655q2.m87157i(state) | (i15 == 256);
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87157i3 || objM87133R5 == c28676v0) {
                objM87133R5 = new C27512c(onEvent, interfaceC28601c1, state);
                c28655q2.m87172p0(objM87133R5);
            }
            c28655q = c28655q2;
            AbstractC17795v0.m51127j(modifierM3409f, textResourceM21278l, placeholderText, icon, 0L, keyboardType, false, null, 0L, false, null, false, true, function1, (Function1) objM87133R5, c28655q, 0, 384, 4048);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g(modifier, state, onEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final String m82930e(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: f */
    private static final void m82931f(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: g */
    private static final boolean m82932g(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    private static final void m82933h(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m82934i(C27514e c27514e, InterfaceC28601c1 interfaceC28601c1, Function1 function1, boolean z4) {
        AnalyticEventModel onTapAnalyticEvent;
        if (!z4) {
            m82933h(interfaceC28601c1, false);
        } else if (!m82932g(interfaceC28601c1) && (onTapAnalyticEvent = c27514e.getOnTapAnalyticEvent()) != null) {
            m82933h(interfaceC28601c1, true);
            AbstractC13673n.m38578y(null, onTapAnalyticEvent, function1);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m82935j(Function1 function1, InterfaceC28601c1 interfaceC28601c1, C27514e c27514e, Object event) throws IOException {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17801x0.a) {
            m82931f(interfaceC28601c1, "");
        } else if (event instanceof AbstractC17801x0.c) {
            String strM51152a = ((AbstractC17801x0.c) event).getNewText();
            if (c27514e.getKeyboardType() == 3) {
                StringBuilder sb4 = new StringBuilder();
                int length = strM51152a.length();
                for (int i13 = 0; i13 < length; i13++) {
                    char cCharAt = strM51152a.charAt(i13);
                    if (Character.isDigit(cCharAt)) {
                        sb4.append(cCharAt);
                    }
                }
                strM51152a = sb4.toString();
            }
            Integer maxLength = c27514e.getMaxLength();
            if (maxLength != null) {
                strM51152a = AbstractC39414r.m125866L0(maxLength.intValue(), strM51152a);
            }
            m82931f(interfaceC28601c1, strM51152a);
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m82936k(Modifier modifier, C27514e c27514e, Function1 function1, int i13, Composer composer, int i14) {
        m82929d(modifier, c27514e, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
