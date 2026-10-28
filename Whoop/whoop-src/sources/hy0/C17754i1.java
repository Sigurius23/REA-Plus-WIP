package hy0;

import ad3.AbstractC0770m;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.StateClearAction;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import h02.C16574h;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25297f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: hy0.i1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lhy0/i1;", "Lm91/f;", "Lhy0/n1;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lhy0/n1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17754i1 implements InterfaceC25297f<C17772n1> {

    /* JADX INFO: renamed from: hy0.i1$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.atom.TextAreaItem$Compose$1$1", m100430f = "TextArea.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f69045w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17772n1 f69046x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f69047y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C17772n1 c17772n1, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f69046x = c17772n1;
            this.f69047y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f69046x, this.f69047y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f69045w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String text = this.f69046x.getText();
            if (AbstractC39414r.m125890i0(text)) {
                text = null;
            }
            if (text != null) {
                C17772n1 c17772n1 = this.f69046x;
                Function1 function1 = this.f69047y;
                String stateUpdateTextKey = c17772n1.getStateUpdateTextKey();
                if (stateUpdateTextKey != null) {
                    function1.invoke(new DesignItemInteraction(new StateUpdateAction(AbstractC25247g0.m73989X(new C23465k(stateUpdateTextKey, AbstractC0770m.m1841c(text))), false, 2, (DefaultConstructorMarker) null), null));
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m50926d(C17772n1 c17772n1, Function1 function1, String updatedValue) {
        AbstractC22676k.m65750j(updatedValue, "updatedValue");
        String stateUpdateTextKey = c17772n1.getStateUpdateTextKey();
        if (stateUpdateTextKey != null) {
            function1.invoke(new DesignItemInteraction(AbstractC39414r.m125890i0(updatedValue) ? new StateClearAction(AbstractC37056f.m118958J(stateUpdateTextKey), false, 2, (DefaultConstructorMarker) null) : new StateUpdateAction(AbstractC25247g0.m73989X(new C23465k(stateUpdateTextKey, AbstractC0770m.m1841c(updatedValue))), false, 2, (DefaultConstructorMarker) null), null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m50927e(C17754i1 c17754i1, Modifier modifier, C17772n1 c17772n1, Function1 function1, int i13, Composer composer, int i14) {
        c17754i1.Compose(modifier, c17772n1, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C17772n1 itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1385600387);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int i15 = i14 & 112;
            int i16 = i14 & 896;
            boolean z4 = (i15 == 32 || ((i14 & 64) != 0 && c28655q.m87157i(itemState))) | (i16 == 256);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new a(itemState, onViewEvent, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(itemState.getLabel());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(itemState.getText());
            TextResource hintText = itemState.getHintText();
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(itemState.getErrorMessage());
            int maxCharacterCount = itemState.getMaxCharacterCount();
            int maxLines = itemState.getMaxLines();
            boolean isError = itemState.getIsError();
            boolean isEnabled = itemState.getIsEnabled();
            boolean z13 = false;
            boolean readOnly = itemState.getReadOnly();
            C2886a errorTextStyle = itemState.getErrorTextStyle();
            boolean refreshText = itemState.getRefreshText();
            boolean z14 = i15 == 32 || ((i14 & 64) != 0 && c28655q.m87157i(itemState));
            if (i16 == 256) {
                z13 = true;
            }
            boolean z15 = z14 | z13;
            Object objM87133R2 = c28655q.m87133R();
            if (z15 || objM87133R2 == c28676v0) {
                objM87133R2 = new C16574h(11, itemState, onViewEvent);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC17766l1.m50964e(modifier, textResourceM21278l, textResourceM21278l2, hintText, textResourceM21278l3, maxCharacterCount, maxLines, isError, isEnabled, readOnly, errorTextStyle, refreshText, (Function1) objM87133R2, c28655q, i14 & 14, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17734d1(this, modifier, itemState, onViewEvent, i13, 1);
        }
    }
}
