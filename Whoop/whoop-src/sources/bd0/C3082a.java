package bd0;

import ad0.AbstractC0749c;
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
import yc0.AbstractC39429b;

/* JADX INFO: renamed from: bd0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lbd0/a;", "", "<init>", "()V", "Lec3/l;", "Lyc0/b;", "domainResults", "Lad0/c;", "a", "(Lec3/l;)Lec3/l;", "domainResult", "currentViewState", "b", "(Lyc0/b;Lad0/c;)Lad0/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3082a {

    /* JADX INFO: renamed from: bd0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.mobilescheduling.presentation.reducers.MobileSchedulingFormViewStateReducer$reduce$1", m100430f = "MobileSchedulingFormViewStateReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lad0/c;", "currentViewState", "Lyc0/b;", "domainResult", "<anonymous>", "(Lad0/c;Lyc0/b;)Lad0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f12120w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f12121x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f12122y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC0749c abstractC0749c, AbstractC39429b abstractC39429b, InterfaceC30057d<? super AbstractC0749c> interfaceC30057d) {
            a aVar = C3082a.this.new a(interfaceC30057d);
            aVar.f12121x = abstractC0749c;
            aVar.f12122y = abstractC39429b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC0749c abstractC0749c = (AbstractC0749c) this.f12121x;
            AbstractC39429b abstractC39429b = (AbstractC39429b) this.f12122y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12120w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C3082a.this.m8836b(abstractC39429b, abstractC0749c);
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m8835a(InterfaceC13058l domainResults) {
        AbstractC22676k.m65750j(domainResults, "domainResults");
        AbstractC0749c.b bVar = AbstractC0749c.b.f2735b;
        AbstractC22676k.m65748h(bVar, "null cannot be cast to non-null type com.whoop.advancedlabs.mobilescheduling.presentation.MobileSchedulingFormViewState");
        return new C13060l1(bVar, domainResults, new a(null));
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0749c m8836b(AbstractC39429b domainResult, AbstractC0749c currentViewState) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        AbstractC22676k.m65750j(currentViewState, "currentViewState");
        if (domainResult instanceof AbstractC39429b.b) {
            return AbstractC0749c.b.f2735b;
        }
        if (domainResult instanceof AbstractC39429b.a) {
            return AbstractC0749c.a.f2734b;
        }
        if (domainResult instanceof AbstractC39429b.c) {
            return AbstractC0749c.c.f2736b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
