package rt0;

import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: rt0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrt0/b;", "T", "Lec3/l;", "Lrt0/a;", "", "a", "(Lec3/l;Lq83/d;)Ljava/lang/Object;", "connectivity-core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31802d {

    /* JADX INFO: renamed from: rt0.d$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f131707w;

        /* JADX INFO: renamed from: rt0.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42290a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f131708w;

            /* JADX INFO: renamed from: rt0.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.connectivityCore.sdk.RealTimeStreamSdkKt$isSuccess$$inlined$map$1$2", m100430f = "RealTimeStreamSdk.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42291a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f131709E;

                /* JADX INFO: renamed from: F */
                Object f131710F;

                /* JADX INFO: renamed from: G */
                Object f131711G;

                /* JADX INFO: renamed from: H */
                int f131712H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f131713w;

                /* JADX INFO: renamed from: x */
                int f131714x;

                /* JADX INFO: renamed from: y */
                Object f131715y;

                public C42291a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f131713w = obj;
                    this.f131714x |= Integer.MIN_VALUE;
                    return C42290a.this.emit(null, this);
                }
            }

            public C42290a(InterfaceC13062m interfaceC13062m) {
                this.f131708w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42291a c42291a;
                if (interfaceC30057d instanceof C42291a) {
                    c42291a = (C42291a) interfaceC30057d;
                    int i13 = c42291a.f131714x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42291a.f131714x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42291a = new C42291a(interfaceC30057d);
                    }
                } else {
                    c42291a = new C42291a(interfaceC30057d);
                }
                Object obj2 = c42291a.f131713w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42291a.f131714x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f131708w;
                    Boolean boolValueOf = Boolean.valueOf(((InterfaceC31799a) obj) instanceof InterfaceC31799a.a);
                    c42291a.f131715y = null;
                    c42291a.f131709E = null;
                    c42291a.f131710F = null;
                    c42291a.f131711G = null;
                    c42291a.f131712H = 0;
                    c42291a.f131714x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c42291a) == enumC31071a) {
                        return enumC31071a;
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f131707w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f131707w.collect(new C42290a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T extends InterfaceC31800b> Object m98793a(InterfaceC13058l interfaceC13058l, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC13091v.m36575A(new a(interfaceC13058l), interfaceC30057d);
    }
}
