package kj2;

import com.whoop.design.models.calendar.CalendarDateModel;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import h91.C17027b;
import l83.C23454a0;
import nj2.AbstractC26765l;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: kj2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t0\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lkj2/h;", "", "<init>", "()V", "Lec3/l;", "Lnj2/l;", "stressMonitorDomainState", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "stressCalendarDomainState", "Lkj2/g;", "a", "(Lec3/l;Lec3/l;)Lec3/l;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22524h {

    /* JADX INFO: renamed from: kj2.h$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressDomainCombiner$combineState$1", m100430f = "StressDomainCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Lnj2/l;", "domainState", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "Lkj2/g;", "<anonymous>", "(Lnj2/l;Lh91/b;)Lkj2/g;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88354w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f88355x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88356y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC26765l abstractC26765l, C17027b<CalendarDateModel> c17027b, InterfaceC30057d<? super C22523g> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f88355x = abstractC26765l;
            aVar.f88356y = c17027b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC26765l abstractC26765l = (AbstractC26765l) this.f88355x;
            C17027b c17027b = (C17027b) this.f88356y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88354w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C22523g(abstractC26765l, c17027b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m65056a(InterfaceC13058l stressMonitorDomainState, InterfaceC13058l stressCalendarDomainState) {
        AbstractC22676k.m65750j(stressMonitorDomainState, "stressMonitorDomainState");
        AbstractC22676k.m65750j(stressCalendarDomainState, "stressCalendarDomainState");
        return new C13060l1(stressMonitorDomainState, stressCalendarDomainState, new a(null), 1);
    }
}
