package ii2;

import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gi2.AbstractC15898d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ii2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lii2/c;", "", "<init>", "()V", "Lec3/l;", "Lgi2/d;", "upstream", "Lii2/b;", "a", "(Lec3/l;)Lec3/l;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18574c {

    /* JADX INFO: renamed from: ii2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f72563w;

        /* JADX INFO: renamed from: ii2.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41745a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f72564w;

            /* JADX INFO: renamed from: ii2.c$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.strava.navigation.StravaNavigationReducer$navigate$$inlined$map$1$2", m100430f = "StravaNavigationReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41746a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f72565E;

                /* JADX INFO: renamed from: F */
                Object f72566F;

                /* JADX INFO: renamed from: G */
                Object f72567G;

                /* JADX INFO: renamed from: H */
                int f72568H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f72569w;

                /* JADX INFO: renamed from: x */
                int f72570x;

                /* JADX INFO: renamed from: y */
                Object f72571y;

                public C41746a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f72569w = obj;
                    this.f72570x |= Integer.MIN_VALUE;
                    return C41745a.this.emit(null, this);
                }
            }

            public C41745a(InterfaceC13062m interfaceC13062m) {
                this.f72564w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41746a c41746a;
                Object obj2;
                if (interfaceC30057d instanceof C41746a) {
                    c41746a = (C41746a) interfaceC30057d;
                    int i13 = c41746a.f72570x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41746a.f72570x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41746a = new C41746a(interfaceC30057d);
                    }
                } else {
                    c41746a = new C41746a(interfaceC30057d);
                }
                Object obj3 = c41746a.f72569w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41746a.f72570x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj3);
                    InterfaceC13062m interfaceC13062m = this.f72564w;
                    AbstractC15898d abstractC15898d = (AbstractC15898d) obj;
                    if (abstractC15898d instanceof AbstractC15898d.h) {
                        obj2 = AbstractC18573b.d.f72562a;
                    } else if (abstractC15898d instanceof AbstractC15898d.g) {
                        obj2 = AbstractC18573b.c.f72561a;
                    } else if (abstractC15898d instanceof AbstractC15898d.f) {
                        obj2 = AbstractC18573b.b.f72560a;
                    } else {
                        if (!(abstractC15898d instanceof AbstractC15898d.d)) {
                            if (!(abstractC15898d instanceof AbstractC15898d.a) && !(abstractC15898d instanceof AbstractC15898d.c) && !(abstractC15898d instanceof AbstractC15898d.e) && !(abstractC15898d instanceof AbstractC15898d.j) && !(abstractC15898d instanceof AbstractC15898d.i) && !(abstractC15898d instanceof AbstractC15898d.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalStateException("Cannot navigate from domain result " + abstractC15898d);
                        }
                        obj2 = AbstractC18573b.a.f72559a;
                    }
                    c41746a.f72571y = null;
                    c41746a.f72565E = null;
                    c41746a.f72566F = null;
                    c41746a.f72567G = null;
                    c41746a.f72568H = 0;
                    c41746a.f72570x = 1;
                    if (interfaceC13062m.emit(obj2, c41746a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj3);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l) {
            this.f72563w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f72563w.collect(new C41745a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m53796a(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream);
    }
}
