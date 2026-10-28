package jy2;

import ec3.C13060l1;
import ec3.InterfaceC13058l;
import iy2.AbstractC21035b;
import ky2.InterfaceC22898g;
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

/* JADX INFO: renamed from: jy2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Ljy2/a;", "", "<init>", "()V", "Lec3/l;", "Liy2/b;", "domainStateFlow", "Lky2/g;", "a", "(Lec3/l;)Lec3/l;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22051a {

    /* JADX INFO: renamed from: jy2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignscreening.reducer.CampaignScreeningViewStateReducer$reduce$1", m100430f = "CampaignScreeningViewStateReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lky2/g;", "previousViewState", "Liy2/b;", "currentDomainState", "<anonymous>", "(Lky2/g;Liy2/b;)Lky2/g;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f85540w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f85541x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f85542y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC22898g interfaceC22898g, AbstractC21035b abstractC21035b, InterfaceC30057d<? super InterfaceC22898g> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f85541x = interfaceC22898g;
            aVar.f85542y = abstractC21035b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC22898g interfaceC22898g = (InterfaceC22898g) this.f85541x;
            AbstractC21035b abstractC21035b = (AbstractC21035b) this.f85542y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f85540w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(abstractC21035b, AbstractC21035b.d.f79674a)) {
                return InterfaceC22898g.d.f90429a;
            }
            if (abstractC21035b instanceof AbstractC21035b.b) {
                AbstractC21035b.b bVar = (AbstractC21035b.b) abstractC21035b;
                return new InterfaceC22898g.b(bVar.getCampaignId(), bVar.getSessionId());
            }
            if (abstractC21035b instanceof AbstractC21035b.f) {
                AbstractC21035b.f fVar = (AbstractC21035b.f) abstractC21035b;
                return new InterfaceC22898g.e(fVar.getCampaignId(), fVar.getSessionId());
            }
            if (abstractC21035b instanceof AbstractC21035b.e) {
                return AbstractC22052b.m63131f((AbstractC21035b.e) abstractC21035b);
            }
            if (abstractC21035b instanceof AbstractC21035b.a) {
                return AbstractC22052b.m63130e((AbstractC21035b.a) abstractC21035b);
            }
            if (abstractC21035b instanceof AbstractC21035b.c) {
                return AbstractC22052b.m63132g((AbstractC21035b.c) abstractC21035b);
            }
            if (abstractC21035b instanceof AbstractC21035b.g) {
                return AbstractC22052b.m63133h((AbstractC21035b.g) abstractC21035b);
            }
            if (abstractC21035b instanceof AbstractC21035b.i) {
                return AbstractC22052b.m63129d(interfaceC22898g, ((AbstractC21035b.i) abstractC21035b).getScreeningConfig());
            }
            if (!(abstractC21035b instanceof AbstractC21035b.h)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC21035b.h hVar = (AbstractC21035b.h) abstractC21035b;
            return AbstractC22052b.m63128c(interfaceC22898g, hVar.getScreeningConfig(), hVar.getScreeningSubmissionResponse());
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m63124a(InterfaceC13058l domainStateFlow) {
        AbstractC22676k.m65750j(domainStateFlow, "domainStateFlow");
        return new C13060l1(InterfaceC22898g.d.f90429a, domainStateFlow, new a(null));
    }
}
