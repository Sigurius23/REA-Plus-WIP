package yj2;

import com.whoop.design.models.calendar.CalendarDateModel;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import h91.C17027b;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wj2.AbstractC37321b;

/* JADX INFO: renamed from: yj2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t0\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lyj2/b;", "", "<init>", "()V", "Lec3/l;", "Lwj2/b;", "tiltGraphDomainResult", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "tiltGraphCalendarDomainState", "Lyj2/a;", "a", "(Lec3/l;Lec3/l;)Lec3/l;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39594b {

    /* JADX INFO: renamed from: yj2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.combiner.TiltGraphDomainCombiner$combineState$1", m100430f = "TiltGraphDomainCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Lwj2/b;", "domainState", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarState", "Lyj2/a;", "<anonymous>", "(Lwj2/b;Lh91/b;)Lyj2/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f170334w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f170335x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f170336y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC37321b abstractC37321b, C17027b<CalendarDateModel> c17027b, InterfaceC30057d<? super C39593a> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f170335x = abstractC37321b;
            aVar.f170336y = c17027b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC37321b abstractC37321b = (AbstractC37321b) this.f170335x;
            C17027b c17027b = (C17027b) this.f170336y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f170334w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C39593a(abstractC37321b, c17027b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m126476a(InterfaceC13058l tiltGraphDomainResult, InterfaceC13058l tiltGraphCalendarDomainState) {
        AbstractC22676k.m65750j(tiltGraphDomainResult, "tiltGraphDomainResult");
        AbstractC22676k.m65750j(tiltGraphCalendarDomainState, "tiltGraphCalendarDomainState");
        return new C13060l1(tiltGraphDomainResult, tiltGraphCalendarDomainState, new a(null), 1);
    }
}
