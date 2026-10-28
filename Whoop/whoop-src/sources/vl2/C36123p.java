package vl2;

import ec3.C13060l1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: vl2.p */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lvl2/p;", "", "<init>", "()V", "Lvl2/n;", "Lvl2/b0;", "b", "(Lvl2/n;)Lvl2/b0;", "Lec3/l;", "Lvl2/o;", "upstream", "c", "(Lec3/l;)Lec3/l;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36123p {

    /* JADX INFO: renamed from: vl2.p$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendMenuSheetStateInteractor$interact$1", m100430f = "TrendMenuSheetInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lvl2/n;", "state", "Lvl2/o;", "action", "<anonymous>", "(Lvl2/n;Lvl2/o;)Lvl2/n;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f154406w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f154407x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f154408y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C36121n c36121n, AbstractC36122o abstractC36122o, InterfaceC30057d<? super C36121n> interfaceC30057d) {
            a aVar = C36123p.this.new a(interfaceC30057d);
            aVar.f154407x = c36121n;
            aVar.f154408y = abstractC36122o;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C36121n c36121n = (C36121n) this.f154407x;
            AbstractC36122o abstractC36122o = (AbstractC36122o) this.f154408y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f154406w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C36109b0 c36109b0M114797b = C36123p.this.m114797b(c36121n);
            if (AbstractC22676k.m65745e(abstractC36122o, AbstractC36122o.a.f154402a)) {
                return c36121n.m114791a(null);
            }
            if (abstractC36122o instanceof AbstractC36122o.b) {
                return c36121n.m114791a(new InterfaceC36115h.a(C36109b0.m114756b(c36109b0M114797b, null, null, ((AbstractC36122o.b) abstractC36122o).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), 3, null)));
            }
            if (abstractC36122o instanceof AbstractC36122o.c) {
                return c36121n.m114791a(new InterfaceC36115h.a(C36109b0.m114756b(c36109b0M114797b, null, ((AbstractC36122o.c) abstractC36122o).getSource(), null, 5, null)));
            }
            if (abstractC36122o instanceof AbstractC36122o.d) {
                return c36121n.m114791a(new InterfaceC36115h.a(C36109b0.m114756b(c36109b0M114797b, new Integer(((AbstractC36122o.d) abstractC36122o).getVo2Max()), null, null, 6, null)));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final C36109b0 m114797b(C36121n c36121n) {
        C36109b0 updatedFormData;
        InterfaceC36115h menuSheetUserState = c36121n.getMenuSheetUserState();
        InterfaceC36115h.a aVar = menuSheetUserState instanceof InterfaceC36115h.a ? (InterfaceC36115h.a) menuSheetUserState : null;
        return (aVar == null || (updatedFormData = aVar.getUpdatedFormData()) == null) ? new C36109b0(null, null, null, 7, null) : updatedFormData;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13058l m114798c(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C36121n(null), upstream, new a(null));
    }
}
