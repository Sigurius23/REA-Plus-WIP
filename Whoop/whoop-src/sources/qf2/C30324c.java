package qf2;

import hj0.AbstractC17355n;
import in2.InterfaceC18732d;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p007a6.C0428i;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: qf2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJT\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2<\u0010\u0012\u001a8\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000bH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R.\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, m65681d2 = {"Lqf2/c;", "Lhj0/n;", "Lrr2/c;", "crashReporter", "Lin2/d;", "dispatcherFactory", "Ltr2/n;", "logger", "<init>", "(Lrr2/c;Lin2/d;Ltr2/n;)V", "T", "Lkotlin/Function3;", "Lqf2/d;", "Lkotlin/Function1;", "Ll83/a0;", "Lcom/whoop/smart/alarm/data/repository/SetLwtTo;", "Lq83/d;", "", "block", "g", "(Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;", "a", "Lkotlin/jvm/functions/Function1;", "mutator", "value", "b", "Lqf2/d;", "getLwtState", "()Lqf2/d;", "getLwtState$annotations", "()V", "lwtState", "c", "smart-alarm_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30324c extends AbstractC17355n {

    /* JADX INFO: renamed from: d */
    public static final int f124403d = 8;

    /* JADX INFO: renamed from: e */
    private static final InterfaceC25435a f124404e = AbstractC25438d.m74669a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 mutator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private AbstractC30325d lwtState;

    /* JADX INFO: renamed from: qf2.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.smart.alarm.data.repository.LatestWakeTimeResetRepository", m100430f = "LatestWakeTimeResetRepository.kt", m100431l = {74, 47}, m100432m = "obtainLwtState", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b<T> extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f124407E;

        /* JADX INFO: renamed from: G */
        int f124409G;

        /* JADX INFO: renamed from: w */
        Object f124410w;

        /* JADX INFO: renamed from: x */
        Object f124411x;

        /* JADX INFO: renamed from: y */
        int f124412y;

        /* JADX INFO: renamed from: z */
        int f124413z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f124407E = obj;
            this.f124409G |= Integer.MIN_VALUE;
            return C30324c.this.m92669g(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30324c(InterfaceC31766c crashReporter, InterfaceC18732d dispatcherFactory, InterfaceC34116n logger) {
        super(logger, crashReporter, dispatcherFactory);
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(logger, "logger");
        this.mutator = new C0428i(this, 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m92668f(C30324c c30324c, AbstractC30325d abstractC30325d) {
        c30324c.lwtState = abstractC30325d;
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final <T> Object m92669g(Function3 function3, InterfaceC30057d<? super T> interfaceC30057d) {
        b bVar;
        InterfaceC25435a interfaceC25435a;
        int i13;
        Throwable th3;
        InterfaceC25435a interfaceC25435a2;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i14 = bVar.f124409G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f124409G = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f124407E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = bVar.f124409G;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = f124404e;
                bVar.f124410w = function3;
                bVar.f124411x = interfaceC25435a;
                bVar.f124412y = 0;
                bVar.f124409G = 1;
                if (interfaceC25435a.mo68211b(bVar) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) bVar.f124411x;
                try {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a2.mo68214i(null);
                    return obj;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            int i16 = bVar.f124412y;
            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) bVar.f124411x;
            Function3 function4 = (Function3) bVar.f124410w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            i13 = i16;
            function3 = function4;
            AbstractC30325d abstractC30325d = this.lwtState;
            Function1 function1 = this.mutator;
            bVar.f124410w = null;
            bVar.f124411x = interfaceC25435a;
            bVar.f124412y = i13;
            bVar.f124413z = 0;
            bVar.f124409G = 2;
            Object objInvoke = function3.invoke(abstractC30325d, function1, bVar);
            if (objInvoke != enumC31071a) {
                InterfaceC25435a interfaceC25435a4 = interfaceC25435a;
                obj = objInvoke;
                interfaceC25435a2 = interfaceC25435a4;
                interfaceC25435a2.mo68214i(null);
                return obj;
            }
            return enumC31071a;
        } catch (Throwable th5) {
            InterfaceC25435a interfaceC25435a5 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2 = interfaceC25435a5;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }
}
