package cj1;

import c93.InterfaceC4352n;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ri1.C31459h;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sl1.AbstractC32703b;
import yg2.AbstractC39529d;

/* JADX INFO: renamed from: cj1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcj1/f;", "", "<init>", "()V", "Lec3/l;", "Lsl1/b;", "connectivityTileDomainFlow", "Lri1/h;", "healthTabContentDomainFlow", "Lyg2/d;", "liveHrStateFlow", "a", "(Lec3/l;Lec3/l;Lec3/l;)Lec3/l;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4750f {

    /* JADX INFO: renamed from: cj1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.presentation.HealthTabCombiner$combineFlows$1", m100430f = "HealthTabCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"Lsl1/b;", "connectivityTileDomainResult", "Lri1/h;", "healthTabContentDomainResult", "Lyg2/d;", "liveHrMonitorStatus", "<anonymous>", "(Lsl1/b;Lri1/h;Lyg2/d;)Lri1/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        int f19477w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f19478x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f19479y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f19480z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(4, interfaceC30057d);
        }

        @Override // c93.InterfaceC4352n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC32703b abstractC32703b, C31459h c31459h, AbstractC39529d abstractC39529d, InterfaceC30057d<? super C31459h> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f19478x = abstractC32703b;
            aVar.f19479y = c31459h;
            aVar.f19480z = abstractC39529d;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC32703b abstractC32703b = (AbstractC32703b) this.f19478x;
            C31459h c31459h = (C31459h) this.f19479y;
            AbstractC39529d abstractC39529d = (AbstractC39529d) this.f19480z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f19477w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC4768x.m15030a().contains(abstractC32703b) && ((abstractC32703b instanceof AbstractC32703b.f) || !c31459h.getManualRefresh())) {
                abstractC32703b = AbstractC32703b.f.f135864o;
            }
            return C31459h.m96861b(c31459h, null, null, false, false, abstractC39529d, abstractC32703b, 15, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m14941a(InterfaceC13058l connectivityTileDomainFlow, InterfaceC13058l healthTabContentDomainFlow, InterfaceC13058l liveHrStateFlow) {
        AbstractC22676k.m65750j(connectivityTileDomainFlow, "connectivityTileDomainFlow");
        AbstractC22676k.m65750j(healthTabContentDomainFlow, "healthTabContentDomainFlow");
        AbstractC22676k.m65750j(liveHrStateFlow, "liveHrStateFlow");
        return AbstractC13091v.m36606p(connectivityTileDomainFlow, healthTabContentDomainFlow, liveHrStateFlow, new a(null));
    }
}
