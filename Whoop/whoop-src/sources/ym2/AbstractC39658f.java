package ym2;

import c93.InterfaceC4339a;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ym2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lec3/l;", "", "Lkotlin/Function0;", "", "flagEnabled", "isOnMfaSetup", "a", "(Lec3/l;Lc93/a;Lc93/a;)Lec3/l;", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39658f {

    /* JADX INFO: renamed from: ym2.f$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f170610w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f170611x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f170612y;

        /* JADX INFO: renamed from: ym2.f$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42704a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f170613w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC4339a f170614x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC4339a f170615y;

            /* JADX INFO: renamed from: ym2.f$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes10.dex */
            @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivityKt$withMfaEnforcementDedup$$inlined$filter$1$2", m100430f = "MainActivity.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42705a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f170617F;

                /* JADX INFO: renamed from: G */
                Object f170618G;

                /* JADX INFO: renamed from: H */
                int f170619H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f170620w;

                /* JADX INFO: renamed from: x */
                int f170621x;

                /* JADX INFO: renamed from: y */
                Object f170622y;

                /* JADX INFO: renamed from: z */
                Object f170623z;

                public C42705a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f170620w = obj;
                    this.f170621x |= Integer.MIN_VALUE;
                    return C42704a.this.emit(null, this);
                }
            }

            public C42704a(InterfaceC13062m interfaceC13062m, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
                this.f170613w = interfaceC13062m;
                this.f170614x = interfaceC4339a;
                this.f170615y = interfaceC4339a2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42705a c42705a;
                if (interfaceC30057d instanceof C42705a) {
                    c42705a = (C42705a) interfaceC30057d;
                    int i13 = c42705a.f170621x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42705a.f170621x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42705a = new C42705a(interfaceC30057d);
                    }
                } else {
                    c42705a = new C42705a(interfaceC30057d);
                }
                Object obj2 = c42705a.f170620w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42705a.f170621x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f170613w;
                    if (!((Boolean) this.f170614x.invoke()).booleanValue() || !((Boolean) this.f170615y.invoke()).booleanValue()) {
                        c42705a.f170622y = null;
                        c42705a.f170623z = null;
                        c42705a.f170617F = null;
                        c42705a.f170618G = null;
                        c42705a.f170619H = 0;
                        c42705a.f170621x = 1;
                        if (interfaceC13062m.emit(obj, c42705a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            this.f170610w = interfaceC13058l;
            this.f170611x = interfaceC4339a;
            this.f170612y = interfaceC4339a2;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f170610w.collect(new C42704a(interfaceC13062m, this.f170611x, this.f170612y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC13058l m126788a(InterfaceC13058l interfaceC13058l, InterfaceC4339a flagEnabled, InterfaceC4339a isOnMfaSetup) {
        AbstractC22676k.m65750j(interfaceC13058l, "<this>");
        AbstractC22676k.m65750j(flagEnabled, "flagEnabled");
        AbstractC22676k.m65750j(isOnMfaSetup, "isOnMfaSetup");
        return new a(interfaceC13058l, flagEnabled, isOnMfaSetup);
    }
}
