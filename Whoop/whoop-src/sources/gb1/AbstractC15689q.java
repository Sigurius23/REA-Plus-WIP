package gb1;

import a11.C0132j;
import am2.C1020h;
import am2.C1022i;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p132f0.C13821r1;
import p329n0.C26061n;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39147y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: gb1.q */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0011\u001a\u00020\u0004*\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Ln0/u;", "listState", "Lkotlin/Function0;", "Ll83/a0;", "onBottomReached", "m", "(Landroidx/compose/ui/Modifier;Ln0/u;Lc93/a;)Landroidx/compose/ui/Modifier;", "i", "(Ln0/u;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "buffer", "", "nextToken", "Lkotlin/Function1;", "", "onLoading", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ln0/u;ILjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lf0/r1;", "scrollState", "f", "(Lf0/r1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15689q {

    /* JADX INFO: renamed from: gb1.q$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.modifier.LazyListModifiersKt$DetectBottomScroll$1$1", m100430f = "LazyListModifiers.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f58891w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13821r1 f58892x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f58893y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C13821r1 c13821r1, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f58892x = c13821r1;
            this.f58893y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f58892x, this.f58893y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f58891w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f58892x.f49318a.m87024x() == this.f58892x.f49321d.m87024x()) {
                this.f58893y.invoke();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gb1.q$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.design.modifier.LazyListModifiersKt$OnBottomReached$1$1", m100430f = "LazyListModifiers.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f58894w;

        /* JADX INFO: renamed from: x */
        int f58895x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26068u f58896y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f58897z;

        /* JADX INFO: renamed from: gb1.q$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC4339a f58898w;

            public a(InterfaceC4339a interfaceC4339a) {
                this.f58898w = interfaceC4339a;
            }

            /* JADX INFO: renamed from: b */
            public final Object m44149b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f58898w.invoke();
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m44149b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: gb1.q$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41631b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f58899w;

            /* JADX INFO: renamed from: gb1.q$b$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f58900w;

                /* JADX INFO: renamed from: gb1.q$b$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.design.modifier.LazyListModifiersKt$OnBottomReached$1$1$invokeSuspend$$inlined$filter$1$2", m100430f = "LazyListModifiers.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41632a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f58902F;

                    /* JADX INFO: renamed from: G */
                    Object f58903G;

                    /* JADX INFO: renamed from: H */
                    int f58904H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f58905w;

                    /* JADX INFO: renamed from: x */
                    int f58906x;

                    /* JADX INFO: renamed from: y */
                    Object f58907y;

                    /* JADX INFO: renamed from: z */
                    Object f58908z;

                    public C41632a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f58905w = obj;
                        this.f58906x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f58900w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41632a c41632a;
                    if (interfaceC30057d instanceof C41632a) {
                        c41632a = (C41632a) interfaceC30057d;
                        int i13 = c41632a.f58906x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41632a.f58906x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41632a = new C41632a(interfaceC30057d);
                        }
                    } else {
                        c41632a = new C41632a(interfaceC30057d);
                    }
                    Object obj2 = c41632a.f58905w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41632a.f58906x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f58900w;
                        if (((Boolean) obj).booleanValue()) {
                            c41632a.f58907y = null;
                            c41632a.f58908z = null;
                            c41632a.f58902F = null;
                            c41632a.f58903G = null;
                            c41632a.f58904H = 0;
                            c41632a.f58906x = 1;
                            if (interfaceC13062m.emit(obj, c41632a) == enumC31071a) {
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

            public C41631b(InterfaceC13058l interfaceC13058l) {
                this.f58899w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f58899w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C26068u c26068u, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f58896y = c26068u;
            this.f58897z = interfaceC4339a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
        /* JADX INFO: renamed from: h */
        public static final boolean m44148h(C26068u c26068u, C22659b0 c22659b0) {
            if (((C28621h1) c26068u.f103222e.f91959c).m87024x() > 0 || ((C28621h1) c26068u.f103222e.f91958b).m87024x() > 0) {
                c22659b0.f89329w = true;
            }
            C26061n c26061nM77565h = c26068u.m77565h();
            InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(c26061nM77565h.f103177k);
            int i13 = c26061nM77565h.f103180n;
            if (interfaceC26054g != null && i13 > 0) {
                C26062o c26062o = (C26062o) interfaceC26054g;
                boolean z4 = c26062o.f103184a == i13 - 1;
                int i14 = c26062o.f103198o + c26062o.f103199p;
                int i15 = c26061nM77565h.f103179m;
                if (z4 && i14 <= i15 && c22659b0.f89329w) {
                    return true;
                }
            }
            return false;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f58896y, this.f58897z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f58895x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                final C22659b0 c22659b0 = new C22659b0();
                final C26068u c26068u = this.f58896y;
                C41631b c41631b = new C41631b(AbstractC13091v.m36610t(AbstractC28683x.m87240H(new InterfaceC4339a() { // from class: gb1.r
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return Boolean.valueOf(AbstractC15689q.b.m44148h(c26068u, c22659b0));
                    }
                })));
                a aVar = new a(this.f58897z);
                this.f58894w = null;
                this.f58895x = 1;
                if (c41631b.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gb1.q$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.design.modifier.LazyListModifiersKt$OnBottomReached$3$1", m100430f = "LazyListModifiers.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f58909w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f58910x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f58911y;

        /* JADX INFO: renamed from: gb1.q$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f58912w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28670t2 f58913x;

            public a(Function1 function1, InterfaceC28670t2 interfaceC28670t2) {
                this.f58912w = function1;
                this.f58913x = interfaceC28670t2;
            }

            /* JADX INFO: renamed from: b */
            public final Object m44152b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f58912w.invoke(this.f58913x.getValue());
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m44152b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC28670t2 interfaceC28670t2, Function1 function1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f58910x = interfaceC28670t2;
            this.f58911y = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final boolean m44151h(InterfaceC28670t2 interfaceC28670t2) {
            return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f58910x, this.f58911y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f58909w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(AbstractC28683x.m87240H(new C15691s(this.f58910x, 0)));
                a aVar = new a(this.f58911y, this.f58910x);
                this.f58909w = 1;
                if (interfaceC13058lM36610t.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m44138f(C13821r1 scrollState, InterfaceC4339a onBottomReached, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(scrollState, "scrollState");
        AbstractC22676k.m65750j(onBottomReached, "onBottomReached");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(637152902);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(scrollState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onBottomReached) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Integer numValueOf = Integer.valueOf(scrollState.f49318a.m87024x());
            boolean z4 = ((i14 & 14) == 4) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new a(scrollState, onBottomReached, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, numValueOf);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(scrollState, onBottomReached, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m44139g(C13821r1 c13821r1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m44138f(c13821r1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m44140h(C26068u c26068u, int i13, String str, Function1 onLoading, Composer composer, int i14, int i15) {
        int i16;
        AbstractC22676k.m65750j(c26068u, "<this>");
        AbstractC22676k.m65750j(onLoading, "onLoading");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1346499265);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(c26068u) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87157i(onLoading) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 1171) != 1170)) {
            if (i17 != 0) {
                i13 = 0;
            }
            boolean z4 = (i16 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new C1020h(c26068u, str, i13, 3));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
            boolean zM87153g = c28655q.m87153g(interfaceC28670t2) | ((i16 & 7168) == 2048);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new c(interfaceC28670t2, onLoading, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC28670t2);
        } else {
            c28655q.m87138X();
        }
        int i18 = i13;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1022i(c26068u, i18, str, onLoading, i14, i15, 2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m44141i(C26068u listState, InterfaceC4339a onBottomReached, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(listState, "listState");
        AbstractC22676k.m65750j(onBottomReached, "onBottomReached");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(476001530);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(listState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onBottomReached) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = ((i14 & 14) == 4) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new b(listState, onBottomReached, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, listState);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15687o(listState, onBottomReached, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m44142j(C26068u c26068u, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m44141i(c26068u, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: k */
    public static final boolean m44143k(C26068u c26068u, String str, int i13) {
        InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(c26068u.m77565h().f103177k);
        return (interfaceC26054g == null || str == null || ((C26062o) interfaceC26054g).getIndex() < (c26068u.m77565h().f103180n - i13) - 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m44144l(C26068u c26068u, int i13, String str, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m44140h(c26068u, i13, str, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final Modifier m44145m(Modifier modifier, final C26068u listState, final InterfaceC4339a onBottomReached) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(listState, "listState");
        AbstractC22676k.m65750j(onBottomReached, "onBottomReached");
        return modifier.mo3471e(AbstractC1131a.m3500d(modifier, new Function1() { // from class: gb1.p
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC15689q.m44146n(listState, onBottomReached, (InterfaceC39147y) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m44146n(C26068u c26068u, InterfaceC4339a interfaceC4339a, InterfaceC39147y coordinates) {
        InterfaceC26054g interfaceC26054g;
        AbstractC22676k.m65750j(coordinates, "coordinates");
        InterfaceC39147y interfaceC39147yMo3527c = coordinates.mo3527c();
        if (interfaceC39147yMo3527c != null) {
            int iMo3541n = (int) (interfaceC39147yMo3527c.mo3541n() & 4294967295L);
            InterfaceC39147y interfaceC39147yMo3517V = coordinates.mo3517V();
            if (Float.intBitsToFloat((int) ((interfaceC39147yMo3517V != null ? interfaceC39147yMo3517V.mo3537k(coordinates, 0L) : 0L) & 4294967295L)) + ((int) (4294967295L & coordinates.mo3541n())) <= iMo3541n && (interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(c26068u.m77565h().f103177k)) != null && ((C26062o) interfaceC26054g).getIndex() == c26068u.m77565h().f103180n - 1) {
                interfaceC4339a.invoke();
            }
        }
        return C23454a0.f92919a;
    }
}
