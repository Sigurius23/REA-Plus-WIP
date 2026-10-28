package a41;

import a11.C0130h;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.service.network.model.UserSessionDto;
import dp0.C12253i;
import ec3.AbstractC13091v;
import ec3.C13043h0;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import fy1.C14873i;
import gy0.AbstractC16272a;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import java.util.ArrayList;
import java.util.Iterator;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C28503p;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p095dp.AbstractC12240d;
import p208i2.AbstractC17918w0;
import p238j0.InterfaceC21083i;
import p245j8.AbstractC21412c;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p409q0.AbstractC29677c0;
import p409q0.AbstractC29701y;
import p409q0.C29674b;
import p409q0.InterfaceC29694r;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: a41.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001f\u0010\u001e¨\u0006 "}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "La41/m;", "viewState", "Landroidx/lifecycle/g0;", "lifecycleOwner", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "s", "(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "autoscroll", "", "pageCount", "Lq0/y;", "pagerState", "z", "(ZILq0/y;Landroidx/lifecycle/g0;Landroidx/compose/runtime/Composer;I)V", "La41/a;", "testimonial", "q", "(La41/a;Landroidx/compose/runtime/Composer;I)V", "isSelected", "Lkotlin/Function0;", "onClick", "n", "(ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "C", "(Landroidx/compose/runtime/Composer;I)V", "E", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0376l {

    /* JADX INFO: renamed from: a41.l$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.testimonials.TestimonialsKt$Testimonials$3$1", m100430f = "Testimonials.kt", m100431l = {101}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f1281w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC29701y f1282x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C0377m f1283y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f1284z;

        /* JADX INFO: renamed from: a41.l$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41260a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C0377m f1285w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function1 f1286x;

            public C41260a(C0377m c0377m, Function1 function1) {
                this.f1285w = c0377m;
                this.f1286x = function1;
            }

            /* JADX INFO: renamed from: b */
            public final Object m1036b(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C0365a c0365a = (C0365a) AbstractC25265s.m74102I0(i13, this.f1285w.m1045c());
                String id4 = c0365a != null ? c0365a.getId() : null;
                if (id4 != null) {
                    this.f1286x.invoke(new C0366b(id4));
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m1036b(((Number) obj).intValue(), interfaceC30057d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC29701y abstractC29701y, C0377m c0377m, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f1282x = abstractC29701y;
            this.f1283y = c0377m;
            this.f1284z = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final int m1035h(AbstractC29701y abstractC29701y) {
            return abstractC29701y.m91166p();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f1282x, this.f1283y, this.f1284z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f1281w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13043h0 c13043h0M36612v = AbstractC13091v.m36612v(AbstractC28683x.m87240H(new C0375k(this.f1282x, 0)), 1);
                C41260a c41260a = new C41260a(this.f1283y, this.f1284z);
                this.f1281w = 1;
                if (c13043h0M36612v.collect(c41260a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: a41.l$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.testimonials.TestimonialsKt$Testimonials$4$3$1$1$1$1", m100430f = "Testimonials.kt", m100431l = {144}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f1287w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC29701y f1288x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f1289y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC29701y abstractC29701y, int i13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f1288x = abstractC29701y;
            this.f1289y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f1288x, this.f1289y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f1287w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC29701y abstractC29701y = this.f1288x;
                int i14 = this.f1289y;
                this.f1287w = 1;
                if (AbstractC29701y.m91155g(abstractC29701y, i14, null, this, 6) == enumC31071a) {
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

    /* JADX INFO: renamed from: a41.l$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.testimonials.TestimonialsKt$TestimonialsAutoscrollEffect$2$1", m100430f = "Testimonials.kt", m100431l = {164}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f1290w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC1585g0 f1291x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC29701y f1292y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f1293z;

        /* JADX INFO: renamed from: a41.l$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.testimonials.TestimonialsKt$TestimonialsAutoscrollEffect$2$1$1", m100430f = "Testimonials.kt", m100431l = {165}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f1294w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f1295x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC29701y f1296y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ int f1297z;

            /* JADX INFO: renamed from: a41.l$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.testimonials.TestimonialsKt$TestimonialsAutoscrollEffect$2$1$1$2", m100430f = "Testimonials.kt", m100431l = {166}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(I)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41261a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f1298w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ AbstractC29701y f1299x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ int f1300y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ InterfaceC2994c0 f1301z;

                /* JADX INFO: renamed from: a41.l$c$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.testimonials.TestimonialsKt$TestimonialsAutoscrollEffect$2$1$1$2$1", m100430f = "Testimonials.kt", m100431l = {169}, m100432m = "invokeSuspend", m100433v = 2)
                @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
                public static final class C41262a extends AbstractC32275i implements InterfaceC4351m {

                    /* JADX INFO: renamed from: w */
                    int f1302w;

                    /* JADX INFO: renamed from: x */
                    final /* synthetic */ AbstractC29701y f1303x;

                    /* JADX INFO: renamed from: y */
                    final /* synthetic */ int f1304y;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C41262a(AbstractC29701y abstractC29701y, int i13, InterfaceC30057d<? super C41262a> interfaceC30057d) {
                        super(2, interfaceC30057d);
                        this.f1303x = abstractC29701y;
                        this.f1304y = i13;
                    }

                    @Override // s83.AbstractC32267a
                    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                        return new C41262a(this.f1303x, this.f1304y, interfaceC30057d);
                    }

                    @Override // c93.InterfaceC4351m
                    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        return ((C41262a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        EnumC31071a enumC31071a = EnumC31071a.f128113w;
                        int i13 = this.f1302w;
                        if (i13 == 0) {
                            AbstractC34132o.m107864I(obj);
                            AbstractC29701y abstractC29701y = this.f1303x;
                            int i14 = this.f1304y;
                            C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 0, null, 6);
                            this.f1302w = 1;
                            if (AbstractC29701y.m91155g(abstractC29701y, i14, c11347e2M30574v, this, 2) == enumC31071a) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41261a(AbstractC29701y abstractC29701y, int i13, InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C41261a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f1299x = abstractC29701y;
                    this.f1300y = i13;
                    this.f1301z = interfaceC2994c0;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C41261a(this.f1299x, this.f1300y, this.f1301z, interfaceC30057d);
                }

                public final Object invoke(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C41261a) create(Integer.valueOf(i13), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f1298w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        this.f1298w = 1;
                        if (AbstractC3034m0.m8782b(5000L, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    AbstractC3006f0.m8732z(this.f1301z, null, null, new C41262a(this.f1299x, (this.f1299x.m91166p() + 1) % this.f1300y, null), 3);
                    return C23454a0.f92919a;
                }

                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).intValue(), (InterfaceC30057d<? super C23454a0>) obj2);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC29701y abstractC29701y, int i13, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f1296y = abstractC29701y;
                this.f1297z = i13;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: h */
            public static final int m1038h(AbstractC29701y abstractC29701y) {
                return abstractC29701y.m91166p();
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f1296y, this.f1297z, interfaceC30057d);
                aVar.f1295x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f1295x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f1294w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C0375k(this.f1296y, 1));
                    C41261a c41261a = new C41261a(this.f1296y, this.f1297z, interfaceC2994c0, null);
                    this.f1295x = null;
                    this.f1294w = 1;
                    if (AbstractC13091v.m36604n(c13084s1M87240H, c41261a, this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC1585g0 interfaceC1585g0, AbstractC29701y abstractC29701y, int i13, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f1291x = interfaceC1585g0;
            this.f1292y = abstractC29701y;
            this.f1293z = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f1291x, this.f1292y, this.f1293z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f1290w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC1638x lifecycle = this.f1291x.getLifecycle();
                EnumC1635w enumC1635w = EnumC1635w.f6323E;
                a aVar = new a(this.f1292y, this.f1293z, null);
                this.f1290w = 1;
                if (AbstractC1613o1.m5022l(lifecycle, enumC1635w, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: a41.l$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m1039a(Composer composer, int i13) throws Throwable {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(1639947655);
            C0377m c0377m = new C0377m(AbstractC37056f.m118959K(new C0365a(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, "\"**Advanced Labs helped me finally understand myself at a deeper level.** It changed how I train, how I rest, and how I show up every day.\"", "Katherine Johnson, 28", "Member since 2017", new AbstractC22403o.a(AbstractC16272a.f62056c)), new C0365a("2", "WHOOP has transformed how I approach my training and recovery. The insights are invaluable.", "John Smith, 35", "Member since 2019", new AbstractC22403o.a(AbstractC16272a.f62050b)), new C0365a("3", "The sleep tracking features helped me optimize my rest and improve my performance dramatically.", "Sarah Williams, 42", "Member since 2018", new AbstractC22403o.a(AbstractC16272a.f62056c))), UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, false, 4, null);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = e.f1305w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC0376l.m1026s(C2314t.f9131w, c0377m, null, (Function1) objM87133R, c28655q, 3078, 4);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            m1039a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a41.l$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f1305w = new e();

        /* JADX INFO: renamed from: a */
        public final void m1040a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1040a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a41.l$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m1041a(Composer composer, int i13) throws Throwable {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-813990369);
            C0377m c0377m = new C0377m(AbstractC37056f.m118958J(new C0365a(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, "My Advanced Labs test helped me find out I was pre-diabetic. Without Advanced Labs, it would have totally flown under the radar.", "Katherine Johnson, 28", "Member since 2017", new AbstractC22403o.a(AbstractC16272a.f62056c))), null, false, 4, null);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = g.f1306w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC0376l.m1026s(C2314t.f9131w, c0377m, null, (Function1) objM87133R, c28655q, 3078, 4);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            m1041a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a41.l$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f1306w = new g();

        /* JADX INFO: renamed from: a */
        public final void m1042a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1042a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m1002A(boolean z4, int i13, AbstractC29701y abstractC29701y, InterfaceC1585g0 interfaceC1585g0, int i14, Composer composer, int i15) {
        m1033z(z4, i13, abstractC29701y, interfaceC1585g0, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m1003B(boolean z4, int i13, AbstractC29701y abstractC29701y, InterfaceC1585g0 interfaceC1585g0, int i14, Composer composer, int i15) {
        m1033z(z4, i13, abstractC29701y, interfaceC1585g0, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    public static final void m1004C(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1718560889);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new d()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m1005D(int i13, Composer composer, int i14) {
        m1004C(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    public static final void m1006E(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-993868959);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new f()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m1007F(int i13, Composer composer, int i14) {
        m1006E(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m1021n(boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        long jM53358D;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1897896868);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(2 * 4, C2314t.f9131w), AbstractC33253j.f138651a);
            if (z4) {
                c28655q.m87150e0(1296335354);
                jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(1296408669);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
            }
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, jM53358D, AbstractC17918w0.f69621a);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            boolean z13 = (i14 & 112) == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C0370f(interfaceC4339a, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierM3358c, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0374j(z4, interfaceC4339a, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m1022o(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m1023p(boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m1021n(z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m1024q(C0365a c0365a, Composer composer, int i13) {
        int i14;
        boolean z4;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        boolean z13;
        C38072d c38072d;
        boolean z14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2031139337);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(c0365a) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            boolean z15 = (c0365a.getProfileImage() == null && c0365a.getTitle() == null && c0365a.getSubtitle() == null) ? false : true;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, c2314t), f13, f13);
            C38072d c38072d2 = C38072d.f163053a;
            float f14 = 8;
            float f15 = 2 * f14;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f15, AbstractC1092a.m3358c(modifierM53364e, c38072d2.m121949b(c28655q, 6).getWhite5(), AbstractC17918w0.f69621a));
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            AbstractC21048g.m58807M(c0365a.getTestimonial(), null, true, C21053l.f79834a.m58880a(C23285v0.m67364b(AbstractC33745d.m106661t(c38072d2, c28655q, 6), 0L, 0L, null, null, 0L, 5, 0L, null, null, 16744447), c38072d2.m121949b(c28655q, 6).getWhite70(), c38072d2.m121949b(c28655q, 6).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760), null, 0, 0, 0, false, c28655q, 384, 498);
            c28655q = c28655q;
            if (z15) {
                c28655q.m87150e0(-1792297560);
                float f16 = 1;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f16 * f14, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 1.5d, f14, C2299e.f9108K, c28655q, 54);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c0213j = c0213j2;
                    c28655q.m87163l(c0213j);
                } else {
                    c0213j = c0213j2;
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M53376q);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i = c0209i6;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    c0209i = c0209i6;
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N2);
                AbstractC22403o abstractC22403oM994a = c0365a.getProfileImage();
                if (abstractC22403oM994a == null) {
                    c28655q.m87150e0(-1098738780);
                    c28655q.m87173q(false);
                    c0209i2 = c0209i5;
                    c0209i3 = c0209i7;
                    z13 = false;
                } else {
                    c28655q.m87150e0(-1098738779);
                    c0209i2 = c0209i5;
                    c0209i3 = c0209i7;
                    z13 = false;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM994a, null, null, c28655q, 0, 3), null, AbstractC1136a.m3599a(AbstractC37056f.m118994r(AbstractC1102d.m3419p(f14 * f13, c2314t), AbstractC33253j.f138651a), "ProfileImage_" + c0365a.getId()), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                if (c0365a.getTitle() == null && c0365a.getSubtitle() == null) {
                    c28655q.m87150e0(-1097101948);
                    c28655q.m87173q(z13);
                    z14 = z13;
                    z4 = true;
                } else {
                    c28655q.m87150e0(-1098134062);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16 * f13), c2305k, c28655q, 6);
                    int iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N3);
                    String strM997e = c0365a.getTitle();
                    if (strM997e == null) {
                        c28655q.m87150e0(-1697079198);
                        c28655q.m87173q(z13);
                        z14 = z13;
                        c38072d = c38072d2;
                    } else {
                        c28655q.m87150e0(-1697079197);
                        c38072d = c38072d2;
                        C28655q c28655q2 = c28655q;
                        z14 = z13;
                        AbstractC30795n.m94707h(strM997e, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB4(), null, c28655q2, 0, 0, 196090);
                        c28655q = c28655q2;
                        c28655q.m87173q(z14);
                    }
                    String strM995b = c0365a.getSubtitle();
                    if (strM995b == null) {
                        c28655q.m87150e0(-1696634503);
                        c28655q.m87173q(z14);
                    } else {
                        c28655q.m87150e0(-1696634502);
                        C28655q c28655q3 = c28655q;
                        AbstractC30795n.m94707h(strM995b, null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB4(), null, c28655q3, 0, 0, 196090);
                        c28655q = c28655q3;
                        c28655q.m87173q(z14);
                    }
                    z4 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(z4);
                c28655q.m87173q(z14);
            } else {
                z4 = true;
                c28655q.m87150e0(-1790416573);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(c0365a, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m1025r(C0365a c0365a, int i13, Composer composer, int i14) {
        m1024q(c0365a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0155  */
    /* JADX WARN: Code duplicated, block: B:103:0x018a  */
    /* JADX WARN: Code duplicated, block: B:104:0x018c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0194 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0196  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01db  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:122:0x0214  */
    /* JADX WARN: Code duplicated, block: B:123:0x0273  */
    /* JADX WARN: Code duplicated, block: B:125:0x029f  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:132:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:134:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:137:0x030a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0318  */
    /* JADX WARN: Code duplicated, block: B:145:0x033c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0344  */
    /* JADX WARN: Code duplicated, block: B:149:0x034c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0350  */
    /* JADX WARN: Code duplicated, block: B:154:0x0366  */
    /* JADX WARN: Code duplicated, block: B:157:0x036b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0389  */
    /* JADX WARN: Code duplicated, block: B:165:0x039c  */
    /* JADX WARN: Code duplicated, block: B:168:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:169:0x03b5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:170:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0124 A[EDGE_INSN: B:171:0x0124->B:87:0x0124 BREAK  A[LOOP:0: B:80:0x0109->B:85:0x0120], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0376 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:79:0x0100  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0120 A[LOOP:0: B:80:0x0109->B:85:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x012b  */
    /* JADX WARN: Code duplicated, block: B:92:0x012e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0133  */
    /* JADX WARN: Code duplicated, block: B:96:0x013e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r14v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX INFO: renamed from: s */
    public static final void m1026s(Modifier modifier, final C0377m viewState, InterfaceC1585g0 interfaceC1585g0, Function1 function1, Composer composer, final int i13, final int i14) throws Throwable {
        final Modifier modifier2;
        int i15;
        InterfaceC1585g0 interfaceC1585g1;
        Function1 function2;
        boolean z4;
        final InterfaceC1585g0 interfaceC1585g2;
        final Function1 function3;
        ?? r14;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        int i16;
        C2314t c2314t;
        Object obj;
        InterfaceC1585g0 interfaceC1585g3;
        final InterfaceC1585g0 interfaceC1585g4;
        int i17;
        Object objM87133R;
        final Function1 function4;
        String strM1044b;
        int iIntValue;
        boolean zM87157i;
        Object objM87133R2;
        Object objM87133R3;
        InterfaceC2994c0 interfaceC2994c0;
        Function1 function5;
        C29674b c29674b;
        boolean z13;
        boolean z14;
        Object objM87133R4;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C0209i c0209i5;
        C0209i c0209i6;
        Object obj2;
        C0213j c0213j2;
        C2314t c2314t2;
        InterfaceC2994c0 interfaceC2994c1;
        C0209i c0209i7;
        ?? r10;
        Throwable th3;
        C28655q c28655q;
        C0365a c0365a;
        ?? r15;
        int iHashCode2;
        ?? r16;
        int i18;
        ?? r17;
        boolean zM87157i2;
        Object objM87133R5;
        Object obj3;
        Iterator<C0365a> it;
        int i19;
        Integer numValueOf;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1632456149);
        int i24 = i14 & 1;
        if (i24 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                interfaceC1585g1 = interfaceC1585g0;
                int i25 = c28655q2.m87157i(interfaceC1585g1) ? 256 : 128;
                i15 |= i25;
            } else {
                interfaceC1585g1 = interfaceC1585g0;
            }
            i15 |= i25;
        } else {
            interfaceC1585g1 = interfaceC1585g0;
        }
        int i26 = i14 & 8;
        if (i26 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                i16 = i13 & 1;
                c2314t = C2314t.f9131w;
                obj = C28635l.f115821a;
                if (i16 != 0 || c28655q2.m87118C()) {
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 4) != 0) {
                        interfaceC1585g3 = (InterfaceC1585g0) c28655q2.m87161k(AbstractC21412c.f82093a);
                        i15 &= -897;
                    } else {
                        interfaceC1585g3 = interfaceC1585g1;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == obj) {
                            objM87133R = new C28503p(6);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                        int i27 = i15;
                        interfaceC1585g4 = interfaceC1585g3;
                        i17 = i27;
                    } else {
                        int i28 = i15;
                        interfaceC1585g4 = interfaceC1585g3;
                        i17 = i28;
                    }
                    c28655q2.m87175r();
                    if (viewState.m1045c().isEmpty()) {
                        c28677v1M87180u = c28655q2.m87180u();
                        if (c28677v1M87180u == null) {
                            return;
                        }
                        final int i29 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: a41.e
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj4, Object obj5) {
                                switch (i29) {
                                    case 0:
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        return AbstractC0376l.m1028u(modifier2, viewState, interfaceC1585g4, function4, i13, i14, (Composer) obj4, iIntValue2);
                                    default:
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        return AbstractC0376l.m1032y(modifier2, viewState, interfaceC1585g4, function4, i13, i14, (Composer) obj4, iIntValue3);
                                }
                            }
                        };
                    } else {
                        Modifier modifier3 = modifier2;
                        strM1044b = viewState.getSelectedTestimonialId();
                        if (strM1044b != null) {
                            it = viewState.m1045c().iterator();
                            i19 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i19 = -1;
                                    break;
                                } else if (AbstractC22676k.m65745e(it.next().getId(), strM1044b)) {
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                            numValueOf = Integer.valueOf(i19);
                            if (i19 < 0) {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                iIntValue = 0;
                            }
                        } else {
                            iIntValue = 0;
                        }
                        zM87157i = c28655q2.m87157i(viewState);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87157i || objM87133R2 == obj) {
                            objM87133R2 = new C0370f(viewState, 0);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        C29674b c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R2, iIntValue, 0, c28655q2, 2);
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == obj) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
                        function5 = function4;
                        InterfaceC1585g0 interfaceC1585g5 = interfaceC1585g4;
                        c29674b = c29674bM91150b;
                        m1033z(viewState.getAutoscroll(), viewState.m1045c().size(), c29674b, interfaceC1585g5, c28655q2, (i17 << 3) & 7168);
                        boolean zM87153g = c28655q2.m87153g(c29674b) | c28655q2.m87157i(viewState);
                        if ((i17 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = z13 | zM87153g;
                        objM87133R4 = c28655q2.m87133R();
                        if (z14 || objM87133R4 == obj) {
                            objM87133R4 = new a(c29674b, viewState, function5, null);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, c29674b);
                        Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, modifier3), "Testimonials");
                        f13 = 2;
                        C23010x c23010xM73381n = AbstractC25012a.m73381n(f13, 8, C2299e.f9111N, c28655q2, 54);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3599a);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM73381n);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            c0209i4 = c0209i2;
                        } else {
                            c0209i4 = c0209i2;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            c0209i5 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                            if (viewState.m1045c().size() > 1) {
                                c28655q2.m87150e0(806954002);
                                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                                C37816b c37816bM121344e = AbstractC37817c.m121344e(-1627517351, c28655q2, new InterfaceC4352n() { // from class: a41.g
                                    @Override // c93.InterfaceC4352n
                                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                        int iIntValue2 = ((Integer) obj7).intValue();
                                        return AbstractC0376l.m1030w(viewState, (InterfaceC29694r) obj4, ((Integer) obj5).intValue(), (Composer) obj6, iIntValue2);
                                    }
                                });
                                C28655q c28655q3 = c28655q2;
                                interfaceC2994c1 = interfaceC2994c0;
                                r10 = 0;
                                c0209i6 = c0209i3;
                                obj2 = obj;
                                c0213j2 = c0213j;
                                c2314t2 = c2314t;
                                c0209i7 = c0209i;
                                th3 = null;
                                AbstractC12240d.m34066d(c29674b, modifierM3409f, null, null, 0, 0.0f, null, null, false, null, null, null, c37816bM121344e, c28655q3, 48, 24576, 16380);
                                c29674b = c29674b;
                                c28655q3.m87173q(false);
                                r15 = c28655q3;
                            } else {
                                c0209i6 = c0209i3;
                                obj2 = obj;
                                c0213j2 = c0213j;
                                c2314t2 = c2314t;
                                interfaceC2994c1 = interfaceC2994c0;
                                c0209i7 = c0209i;
                                r10 = 0;
                                th3 = null;
                                c28655q.m87150e0(807399565);
                                c0365a = (C0365a) AbstractC25265s.m74100H0(viewState.m1045c());
                                if (c0365a == null) {
                                    c28655q = c28655q2;
                                    c28655q.m87150e0(807399564);
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q = c28655q2;
                                    c28655q.m87150e0(807399565);
                                    m1024q(c0365a, c28655q, 0);
                                    c28655q.m87173q(false);
                                }
                                c28655q.m87173q(false);
                                r15 = c28655q;
                            }
                            if (viewState.m1045c().size() > 1) {
                                r15.m87150e0(807594989);
                                Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t2, "PaginationDots");
                                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(4 * f13), C2299e.f9107J, r15, 6);
                                iHashCode2 = Long.hashCode(r15.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = r15.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r15, modifierM3599a2);
                                r15.m87158i0();
                                if (r15.f115903S) {
                                    r15.m87163l(c0213j2);
                                } else {
                                    r15.m87178s0();
                                }
                                AbstractC28683x.m87239G(r15, c0209i7, c22994r1M66759a);
                                AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m2);
                                if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode2))) {
                                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                                }
                                AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N2);
                                r15.m87150e0(205457890);
                                r16 = r10;
                                for (Object obj4 : viewState.m1045c()) {
                                    i18 = r16 + 1;
                                    if (r16 >= 0) {
                                        AbstractC37056f.m118977d0();
                                        throw th3;
                                    }
                                    if (r16 == c29674b.m91162k()) {
                                        r17 = 1;
                                    } else {
                                        r17 = r10;
                                    }
                                    InterfaceC2994c0 interfaceC2994c2 = interfaceC2994c1;
                                    zM87157i2 = r15.m87157i(interfaceC2994c2) | r15.m87153g(c29674b) | r15.m87149e(r16);
                                    objM87133R5 = r15.m87133R();
                                    if (zM87157i2) {
                                        obj3 = obj2;
                                    } else {
                                        obj3 = obj2;
                                        if (objM87133R5 == obj3) {
                                        }
                                        m1021n(r17, (InterfaceC4339a) objM87133R5, r15, r10);
                                        r16 = i18;
                                        interfaceC2994c1 = interfaceC2994c2;
                                        obj2 = obj3;
                                    }
                                    objM87133R5 = new C0372h(interfaceC2994c2, c29674b, (int) r16, 0);
                                    r15.m87172p0(objM87133R5);
                                    m1021n(r17, (InterfaceC4339a) objM87133R5, r15, r10);
                                    r16 = i18;
                                    interfaceC2994c1 = interfaceC2994c2;
                                    obj2 = obj3;
                                }
                                AbstractC25012a.m73392y(r15, r10, true, r10);
                            } else {
                                r15.m87150e0(808210029);
                                r15.m87173q(r10);
                            }
                            r15.m87173q(true);
                            interfaceC1585g2 = interfaceC1585g5;
                            function3 = function5;
                            modifier2 = modifier3;
                            r14 = r15;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                        if (viewState.m1045c().size() > 1) {
                            c28655q2.m87150e0(806954002);
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                            C37816b c37816bM121344e2 = AbstractC37817c.m121344e(-1627517351, c28655q2, new InterfaceC4352n() { // from class: a41.g
                                @Override // c93.InterfaceC4352n
                                public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                    int iIntValue2 = ((Integer) obj8).intValue();
                                    return AbstractC0376l.m1030w(viewState, (InterfaceC29694r) obj5, ((Integer) obj6).intValue(), (Composer) obj7, iIntValue2);
                                }
                            });
                            C28655q c28655q4 = c28655q2;
                            interfaceC2994c1 = interfaceC2994c0;
                            r10 = 0;
                            c0209i6 = c0209i3;
                            obj2 = obj;
                            c0213j2 = c0213j;
                            c2314t2 = c2314t;
                            c0209i7 = c0209i;
                            th3 = null;
                            AbstractC12240d.m34066d(c29674b, modifierM3409f2, null, null, 0, 0.0f, null, null, false, null, null, null, c37816bM121344e2, c28655q4, 48, 24576, 16380);
                            c29674b = c29674b;
                            c28655q4.m87173q(false);
                            r15 = c28655q4;
                        } else {
                            c0209i6 = c0209i3;
                            obj2 = obj;
                            c0213j2 = c0213j;
                            c2314t2 = c2314t;
                            interfaceC2994c1 = interfaceC2994c0;
                            c0209i7 = c0209i;
                            r10 = 0;
                            th3 = null;
                            c28655q.m87150e0(807399565);
                            c0365a = (C0365a) AbstractC25265s.m74100H0(viewState.m1045c());
                            if (c0365a == null) {
                                c28655q = c28655q2;
                                c28655q.m87150e0(807399564);
                                c28655q.m87173q(false);
                            } else {
                                c28655q = c28655q2;
                                c28655q.m87150e0(807399565);
                                m1024q(c0365a, c28655q, 0);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                            r15 = c28655q;
                        }
                        if (viewState.m1045c().size() > 1) {
                            r15.m87150e0(807594989);
                            Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t2, "PaginationDots");
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(4 * f13), C2299e.f9107J, r15, 6);
                            iHashCode2 = Long.hashCode(r15.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = r15.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(r15, modifierM3599a3);
                            r15.m87158i0();
                            if (r15.f115903S) {
                                r15.m87163l(c0213j2);
                            } else {
                                r15.m87178s0();
                            }
                            AbstractC28683x.m87239G(r15, c0209i7, c22994r1M66759a2);
                            AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m3);
                            if (r15.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                            }
                            AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N3);
                            r15.m87150e0(205457890);
                            r16 = r10;
                            while (r1.hasNext()) {
                                i18 = r16 + 1;
                                if (r16 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw th3;
                                }
                                if (r16 == c29674b.m91162k()) {
                                    r17 = 1;
                                } else {
                                    r17 = r10;
                                }
                                InterfaceC2994c0 interfaceC2994c3 = interfaceC2994c1;
                                zM87157i2 = r15.m87157i(interfaceC2994c3) | r15.m87153g(c29674b) | r15.m87149e(r16);
                                objM87133R5 = r15.m87133R();
                                if (zM87157i2) {
                                    obj3 = obj2;
                                    if (objM87133R5 == obj3) {
                                    }
                                    m1021n(r17, (InterfaceC4339a) objM87133R5, r15, r10);
                                    r16 = i18;
                                    interfaceC2994c1 = interfaceC2994c3;
                                    obj2 = obj3;
                                } else {
                                    obj3 = obj2;
                                }
                                objM87133R5 = new C0372h(interfaceC2994c3, c29674b, (int) r16, 0);
                                r15.m87172p0(objM87133R5);
                                m1021n(r17, (InterfaceC4339a) objM87133R5, r15, r10);
                                r16 = i18;
                                interfaceC2994c1 = interfaceC2994c3;
                                obj2 = obj3;
                            }
                            AbstractC25012a.m73392y(r15, r10, true, r10);
                        } else {
                            r15.m87150e0(808210029);
                            r15.m87173q(r10);
                        }
                        r15.m87173q(true);
                        interfaceC1585g2 = interfaceC1585g5;
                        function3 = function5;
                        modifier2 = modifier3;
                        r14 = r15;
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                c28655q2.m87138X();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                i17 = i15;
                interfaceC1585g4 = interfaceC1585g1;
                function4 = function2;
                c28655q2.m87175r();
                if (viewState.m1045c().isEmpty()) {
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u == null) {
                        return;
                    }
                    final int i210 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: a41.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj5, Object obj6) {
                            switch (i210) {
                                case 0:
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    return AbstractC0376l.m1028u(modifier2, viewState, interfaceC1585g4, function4, i13, i14, (Composer) obj5, iIntValue2);
                                default:
                                    int iIntValue3 = ((Integer) obj6).intValue();
                                    return AbstractC0376l.m1032y(modifier2, viewState, interfaceC1585g4, function4, i13, i14, (Composer) obj5, iIntValue3);
                            }
                        }
                    };
                } else {
                    Modifier modifier4 = modifier2;
                    strM1044b = viewState.getSelectedTestimonialId();
                    if (strM1044b != null) {
                        it = viewState.m1045c().iterator();
                        i19 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i19 = -1;
                                break;
                            } else {
                                if (AbstractC22676k.m65745e(it.next().getId(), strM1044b)) {
                                    break;
                                    break;
                                }
                                i19++;
                            }
                        }
                        numValueOf = Integer.valueOf(i19);
                        if (i19 < 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = 0;
                        }
                    } else {
                        iIntValue = 0;
                    }
                    zM87157i = c28655q2.m87157i(viewState);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C0370f(viewState, 0);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C0370f(viewState, 0);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    C29674b c29674bM91150b2 = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R2, iIntValue, 0, c28655q2, 2);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == obj) {
                        objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
                    function5 = function4;
                    InterfaceC1585g0 interfaceC1585g6 = interfaceC1585g4;
                    c29674b = c29674bM91150b2;
                    m1033z(viewState.getAutoscroll(), viewState.m1045c().size(), c29674b, interfaceC1585g6, c28655q2, (i17 << 3) & 7168);
                    boolean zM87153g2 = c28655q2.m87153g(c29674b) | c28655q2.m87157i(viewState);
                    if ((i17 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | zM87153g2;
                    objM87133R4 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R4 = new a(c29674b, viewState, function5, null);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(c29674b, viewState, function5, null);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, c29674b);
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, modifier4), "Testimonials");
                    f13 = 2;
                    C23010x c23010xM73381n2 = AbstractC25012a.m73381n(f13, 8, C2299e.f9111N, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3599a4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM73381n2);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        c0209i4 = c0209i2;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
                        if (viewState.m1045c().size() > 1) {
                            c28655q2.m87150e0(806954002);
                            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                            C37816b c37816bM121344e3 = AbstractC37817c.m121344e(-1627517351, c28655q2, new InterfaceC4352n() { // from class: a41.g
                                @Override // c93.InterfaceC4352n
                                public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                    int iIntValue2 = ((Integer) obj8).intValue();
                                    return AbstractC0376l.m1030w(viewState, (InterfaceC29694r) obj5, ((Integer) obj6).intValue(), (Composer) obj7, iIntValue2);
                                }
                            });
                            C28655q c28655q5 = c28655q2;
                            interfaceC2994c1 = interfaceC2994c0;
                            r10 = 0;
                            c0209i6 = c0209i3;
                            obj2 = obj;
                            c0213j2 = c0213j;
                            c2314t2 = c2314t;
                            c0209i7 = c0209i;
                            th3 = null;
                            AbstractC12240d.m34066d(c29674b, modifierM3409f3, null, null, 0, 0.0f, null, null, false, null, null, null, c37816bM121344e3, c28655q5, 48, 24576, 16380);
                            c29674b = c29674b;
                            c28655q5.m87173q(false);
                            r15 = c28655q5;
                        } else {
                            c0209i6 = c0209i3;
                            obj2 = obj;
                            c0213j2 = c0213j;
                            c2314t2 = c2314t;
                            interfaceC2994c1 = interfaceC2994c0;
                            c0209i7 = c0209i;
                            r10 = 0;
                            th3 = null;
                            c28655q.m87150e0(807399565);
                            c0365a = (C0365a) AbstractC25265s.m74100H0(viewState.m1045c());
                            if (c0365a == null) {
                                c28655q = c28655q2;
                                c28655q.m87150e0(807399564);
                                c28655q.m87173q(false);
                            } else {
                                c28655q = c28655q2;
                                c28655q.m87150e0(807399565);
                                m1024q(c0365a, c28655q, 0);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                            r15 = c28655q;
                        }
                        if (viewState.m1045c().size() > 1) {
                            r15.m87150e0(807594989);
                            Modifier modifierM3599a5 = AbstractC1136a.m3599a(c2314t2, "PaginationDots");
                            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(4 * f13), C2299e.f9107J, r15, 6);
                            iHashCode2 = Long.hashCode(r15.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = r15.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(r15, modifierM3599a5);
                            r15.m87158i0();
                            if (r15.f115903S) {
                                r15.m87163l(c0213j2);
                            } else {
                                r15.m87178s0();
                            }
                            AbstractC28683x.m87239G(r15, c0209i7, c22994r1M66759a3);
                            AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m5);
                            if (r15.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                            }
                            AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N5);
                            r15.m87150e0(205457890);
                            r16 = r10;
                            while (r1.hasNext()) {
                                i18 = r16 + 1;
                                if (r16 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw th3;
                                }
                                if (r16 == c29674b.m91162k()) {
                                    r17 = 1;
                                } else {
                                    r17 = r10;
                                }
                                InterfaceC2994c0 interfaceC2994c4 = interfaceC2994c1;
                                zM87157i2 = r15.m87157i(interfaceC2994c4) | r15.m87153g(c29674b) | r15.m87149e(r16);
                                objM87133R5 = r15.m87133R();
                                if (zM87157i2) {
                                    obj3 = obj2;
                                    if (objM87133R5 == obj3) {
                                    }
                                    m1021n(r17, (InterfaceC4339a) objM87133R5, r15, r10);
                                    r16 = i18;
                                    interfaceC2994c1 = interfaceC2994c4;
                                    obj2 = obj3;
                                } else {
                                    obj3 = obj2;
                                }
                                objM87133R5 = new C0372h(interfaceC2994c4, c29674b, (int) r16, 0);
                                r15.m87172p0(objM87133R5);
                                m1021n(r17, (InterfaceC4339a) objM87133R5, r15, r10);
                                r16 = i18;
                                interfaceC2994c1 = interfaceC2994c4;
                                obj2 = obj3;
                            }
                            AbstractC25012a.m73392y(r15, r10, true, r10);
                        } else {
                            r15.m87150e0(808210029);
                            r15.m87173q(r10);
                        }
                        r15.m87173q(true);
                        interfaceC1585g2 = interfaceC1585g6;
                        function3 = function5;
                        modifier2 = modifier4;
                        r14 = r15;
                    } else {
                        c0209i4 = c0209i2;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
                    if (viewState.m1045c().size() > 1) {
                        c28655q2.m87150e0(806954002);
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C37816b c37816bM121344e4 = AbstractC37817c.m121344e(-1627517351, c28655q2, new InterfaceC4352n() { // from class: a41.g
                            @Override // c93.InterfaceC4352n
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                int iIntValue2 = ((Integer) obj8).intValue();
                                return AbstractC0376l.m1030w(viewState, (InterfaceC29694r) obj5, ((Integer) obj6).intValue(), (Composer) obj7, iIntValue2);
                            }
                        });
                        C28655q c28655q6 = c28655q2;
                        interfaceC2994c1 = interfaceC2994c0;
                        r10 = 0;
                        c0209i6 = c0209i3;
                        obj2 = obj;
                        c0213j2 = c0213j;
                        c2314t2 = c2314t;
                        c0209i7 = c0209i;
                        th3 = null;
                        AbstractC12240d.m34066d(c29674b, modifierM3409f4, null, null, 0, 0.0f, null, null, false, null, null, null, c37816bM121344e4, c28655q6, 48, 24576, 16380);
                        c29674b = c29674b;
                        c28655q6.m87173q(false);
                        r15 = c28655q6;
                    } else {
                        c0209i6 = c0209i3;
                        obj2 = obj;
                        c0213j2 = c0213j;
                        c2314t2 = c2314t;
                        interfaceC2994c1 = interfaceC2994c0;
                        c0209i7 = c0209i;
                        r10 = 0;
                        th3 = null;
                        c28655q.m87150e0(807399565);
                        c0365a = (C0365a) AbstractC25265s.m74100H0(viewState.m1045c());
                        if (c0365a == null) {
                            c28655q = c28655q2;
                            c28655q.m87150e0(807399564);
                            c28655q.m87173q(false);
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87150e0(807399565);
                            m1024q(c0365a, c28655q, 0);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        r15 = c28655q;
                    }
                    if (viewState.m1045c().size() > 1) {
                        r15.m87150e0(807594989);
                        Modifier modifierM3599a6 = AbstractC1136a.m3599a(c2314t2, "PaginationDots");
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(4 * f13), C2299e.f9107J, r15, 6);
                        iHashCode2 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = r15.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(r15, modifierM3599a6);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j2);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i7, c22994r1M66759a4);
                        AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m6);
                        if (r15.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N6);
                        r15.m87150e0(205457890);
                        r16 = r10;
                        while (r1.hasNext()) {
                            i18 = r16 + 1;
                            if (r16 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw th3;
                            }
                            if (r16 == c29674b.m91162k()) {
                                r17 = 1;
                            } else {
                                r17 = r10;
                            }
                            InterfaceC2994c0 interfaceC2994c5 = interfaceC2994c1;
                            zM87157i2 = r15.m87157i(interfaceC2994c5) | r15.m87153g(c29674b) | r15.m87149e(r16);
                            objM87133R5 = r15.m87133R();
                            if (zM87157i2) {
                                obj3 = obj2;
                                if (objM87133R5 == obj3) {
                                }
                                m1021n(r17, (InterfaceC4339a) objM87133R5, r15, r10);
                                r16 = i18;
                                interfaceC2994c1 = interfaceC2994c5;
                                obj2 = obj3;
                            } else {
                                obj3 = obj2;
                            }
                            objM87133R5 = new C0372h(interfaceC2994c5, c29674b, (int) r16, 0);
                            r15.m87172p0(objM87133R5);
                            m1021n(r17, (InterfaceC4339a) objM87133R5, r15, r10);
                            r16 = i18;
                            interfaceC2994c1 = interfaceC2994c5;
                            obj2 = obj3;
                        }
                        AbstractC25012a.m73392y(r15, r10, true, r10);
                    } else {
                        r15.m87150e0(808210029);
                        r15.m87173q(r10);
                    }
                    r15.m87173q(true);
                    interfaceC1585g2 = interfaceC1585g6;
                    function3 = function5;
                    modifier2 = modifier4;
                    r14 = r15;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q2.m87138X();
            interfaceC1585g2 = interfaceC1585g1;
            function3 = function2;
            r14 = c28655q2;
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                final int i34 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: a41.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj5, Object obj6) {
                        switch (i34) {
                            case 0:
                                int iIntValue2 = ((Integer) obj6).intValue();
                                return AbstractC0376l.m1028u(modifier2, viewState, interfaceC1585g2, function3, i13, i14, (Composer) obj5, iIntValue2);
                            default:
                                int iIntValue3 = ((Integer) obj6).intValue();
                                return AbstractC0376l.m1032y(modifier2, viewState, interfaceC1585g2, function3, i13, i14, (Composer) obj5, iIntValue3);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            i16 = i13 & 1;
            c2314t = C2314t.f9131w;
            obj = C28635l.f115821a;
            if (i16 != 0) {
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    interfaceC1585g3 = (InterfaceC1585g0) c28655q2.m87161k(AbstractC21412c.f82093a);
                    i15 &= -897;
                } else {
                    interfaceC1585g3 = interfaceC1585g1;
                }
                if (i26 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == obj) {
                        objM87133R = new C28503p(6);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                    int i211 = i15;
                    interfaceC1585g4 = interfaceC1585g3;
                    i17 = i211;
                } else {
                    int i212 = i15;
                    interfaceC1585g4 = interfaceC1585g3;
                    i17 = i212;
                    function4 = function2;
                }
            } else {
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    interfaceC1585g3 = (InterfaceC1585g0) c28655q2.m87161k(AbstractC21412c.f82093a);
                    i15 &= -897;
                } else {
                    interfaceC1585g3 = interfaceC1585g1;
                }
                if (i26 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == obj) {
                        objM87133R = new C28503p(6);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                    int i213 = i15;
                    interfaceC1585g4 = interfaceC1585g3;
                    i17 = i213;
                } else {
                    int i214 = i15;
                    interfaceC1585g4 = interfaceC1585g3;
                    i17 = i214;
                    function4 = function2;
                }
            }
            c28655q2.m87175r();
            if (viewState.m1045c().isEmpty()) {
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i215 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: a41.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj5, Object obj6) {
                        switch (i215) {
                            case 0:
                                int iIntValue2 = ((Integer) obj6).intValue();
                                return AbstractC0376l.m1028u(modifier2, viewState, interfaceC1585g4, function4, i13, i14, (Composer) obj5, iIntValue2);
                            default:
                                int iIntValue3 = ((Integer) obj6).intValue();
                                return AbstractC0376l.m1032y(modifier2, viewState, interfaceC1585g4, function4, i13, i14, (Composer) obj5, iIntValue3);
                        }
                    }
                };
            } else {
                Modifier modifier5 = modifier2;
                strM1044b = viewState.getSelectedTestimonialId();
                if (strM1044b != null) {
                    it = viewState.m1045c().iterator();
                    i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i19 = -1;
                            break;
                        } else {
                            if (AbstractC22676k.m65745e(it.next().getId(), strM1044b)) {
                                break;
                                break;
                            }
                            i19++;
                        }
                    }
                    numValueOf = Integer.valueOf(i19);
                    if (i19 < 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = 0;
                }
                zM87157i = c28655q2.m87157i(viewState);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C0370f(viewState, 0);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C0370f(viewState, 0);
                    c28655q2.m87172p0(objM87133R2);
                }
                C29674b c29674bM91150b3 = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R2, iIntValue, 0, c28655q2, 2);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == obj) {
                    objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
                function5 = function4;
                InterfaceC1585g0 interfaceC1585g7 = interfaceC1585g4;
                c29674b = c29674bM91150b3;
                m1033z(viewState.getAutoscroll(), viewState.m1045c().size(), c29674b, interfaceC1585g7, c28655q2, (i17 << 3) & 7168);
                boolean zM87153g3 = c28655q2.m87153g(c29674b) | c28655q2.m87157i(viewState);
                if ((i17 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87153g3;
                objM87133R4 = c28655q2.m87133R();
                if (z14) {
                    objM87133R4 = new a(c29674b, viewState, function5, null);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(c29674b, viewState, function5, null);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, c29674b);
                Modifier modifierM3599a7 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, modifier5), "Testimonials");
                f13 = 2;
                C23010x c23010xM73381n3 = AbstractC25012a.m73381n(f13, 8, C2299e.f9111N, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3599a7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM73381n3);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m7);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c0209i4 = c0209i2;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N7);
                    if (viewState.m1045c().size() > 1) {
                        c28655q2.m87150e0(806954002);
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C37816b c37816bM121344e5 = AbstractC37817c.m121344e(-1627517351, c28655q2, new InterfaceC4352n() { // from class: a41.g
                            @Override // c93.InterfaceC4352n
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                int iIntValue2 = ((Integer) obj8).intValue();
                                return AbstractC0376l.m1030w(viewState, (InterfaceC29694r) obj5, ((Integer) obj6).intValue(), (Composer) obj7, iIntValue2);
                            }
                        });
                        C28655q c28655q7 = c28655q2;
                        interfaceC2994c1 = interfaceC2994c0;
                        r10 = 0;
                        c0209i6 = c0209i3;
                        obj2 = obj;
                        c0213j2 = c0213j;
                        c2314t2 = c2314t;
                        c0209i7 = c0209i;
                        th3 = null;
                        AbstractC12240d.m34066d(c29674b, modifierM3409f5, null, null, 0, 0.0f, null, null, false, null, null, null, c37816bM121344e5, c28655q7, 48, 24576, 16380);
                        c29674b = c29674b;
                        c28655q7.m87173q(false);
                        r15 = c28655q7;
                    } else {
                        c0209i6 = c0209i3;
                        obj2 = obj;
                        c0213j2 = c0213j;
                        c2314t2 = c2314t;
                        interfaceC2994c1 = interfaceC2994c0;
                        c0209i7 = c0209i;
                        r10 = 0;
                        th3 = null;
                        c28655q.m87150e0(807399565);
                        c0365a = (C0365a) AbstractC25265s.m74100H0(viewState.m1045c());
                        if (c0365a == null) {
                            c28655q = c28655q2;
                            c28655q.m87150e0(807399564);
                            c28655q.m87173q(false);
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87150e0(807399565);
                            m1024q(c0365a, c28655q, 0);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        r15 = c28655q;
                    }
                    if (viewState.m1045c().size() > 1) {
                        r15.m87150e0(807594989);
                        Modifier modifierM3599a8 = AbstractC1136a.m3599a(c2314t2, "PaginationDots");
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(4 * f13), C2299e.f9107J, r15, 6);
                        iHashCode2 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = r15.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(r15, modifierM3599a8);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j2);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i7, c22994r1M66759a5);
                        AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m8);
                        if (r15.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N8);
                        r15.m87150e0(205457890);
                        r16 = r10;
                        while (r1.hasNext()) {
                            i18 = r16 + 1;
                            if (r16 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw th3;
                            }
                            if (r16 == c29674b.m91162k()) {
                                r17 = 1;
                            } else {
                                r17 = r10;
                            }
                            InterfaceC2994c0 interfaceC2994c6 = interfaceC2994c1;
                            zM87157i2 = r15.m87157i(interfaceC2994c6) | r15.m87153g(c29674b) | r15.m87149e(r16);
                            objM87133R5 = r15.m87133R();
                            if (zM87157i2) {
                                obj3 = obj2;
                                if (objM87133R5 == obj3) {
                                }
                                m1021n(r17, (InterfaceC4339a) objM87133R5, r15, r10);
                                r16 = i18;
                                interfaceC2994c1 = interfaceC2994c6;
                                obj2 = obj3;
                            } else {
                                obj3 = obj2;
                            }
                            objM87133R5 = new C0372h(interfaceC2994c6, c29674b, (int) r16, 0);
                            r15.m87172p0(objM87133R5);
                            m1021n(r17, (InterfaceC4339a) objM87133R5, r15, r10);
                            r16 = i18;
                            interfaceC2994c1 = interfaceC2994c6;
                            obj2 = obj3;
                        }
                        AbstractC25012a.m73392y(r15, r10, true, r10);
                    } else {
                        r15.m87150e0(808210029);
                        r15.m87173q(r10);
                    }
                    r15.m87173q(true);
                    interfaceC1585g2 = interfaceC1585g7;
                    function3 = function5;
                    modifier2 = modifier5;
                    r14 = r15;
                } else {
                    c0209i4 = c0209i2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N7);
                if (viewState.m1045c().size() > 1) {
                    c28655q2.m87150e0(806954002);
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C37816b c37816bM121344e6 = AbstractC37817c.m121344e(-1627517351, c28655q2, new InterfaceC4352n() { // from class: a41.g
                        @Override // c93.InterfaceC4352n
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int iIntValue2 = ((Integer) obj8).intValue();
                            return AbstractC0376l.m1030w(viewState, (InterfaceC29694r) obj5, ((Integer) obj6).intValue(), (Composer) obj7, iIntValue2);
                        }
                    });
                    C28655q c28655q8 = c28655q2;
                    interfaceC2994c1 = interfaceC2994c0;
                    r10 = 0;
                    c0209i6 = c0209i3;
                    obj2 = obj;
                    c0213j2 = c0213j;
                    c2314t2 = c2314t;
                    c0209i7 = c0209i;
                    th3 = null;
                    AbstractC12240d.m34066d(c29674b, modifierM3409f6, null, null, 0, 0.0f, null, null, false, null, null, null, c37816bM121344e6, c28655q8, 48, 24576, 16380);
                    c29674b = c29674b;
                    c28655q8.m87173q(false);
                    r15 = c28655q8;
                } else {
                    c0209i6 = c0209i3;
                    obj2 = obj;
                    c0213j2 = c0213j;
                    c2314t2 = c2314t;
                    interfaceC2994c1 = interfaceC2994c0;
                    c0209i7 = c0209i;
                    r10 = 0;
                    th3 = null;
                    c28655q.m87150e0(807399565);
                    c0365a = (C0365a) AbstractC25265s.m74100H0(viewState.m1045c());
                    if (c0365a == null) {
                        c28655q = c28655q2;
                        c28655q.m87150e0(807399564);
                        c28655q.m87173q(false);
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87150e0(807399565);
                        m1024q(c0365a, c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    r15 = c28655q;
                }
                if (viewState.m1045c().size() > 1) {
                    r15.m87150e0(807594989);
                    Modifier modifierM3599a9 = AbstractC1136a.m3599a(c2314t2, "PaginationDots");
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(4 * f13), C2299e.f9107J, r15, 6);
                    iHashCode2 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = r15.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(r15, modifierM3599a9);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j2);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i7, c22994r1M66759a6);
                    AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m9);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N9);
                    r15.m87150e0(205457890);
                    r16 = r10;
                    while (r1.hasNext()) {
                        i18 = r16 + 1;
                        if (r16 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw th3;
                        }
                        if (r16 == c29674b.m91162k()) {
                            r17 = 1;
                        } else {
                            r17 = r10;
                        }
                        InterfaceC2994c0 interfaceC2994c7 = interfaceC2994c1;
                        zM87157i2 = r15.m87157i(interfaceC2994c7) | r15.m87153g(c29674b) | r15.m87149e(r16);
                        objM87133R5 = r15.m87133R();
                        if (zM87157i2) {
                            obj3 = obj2;
                            if (objM87133R5 == obj3) {
                            }
                            m1021n(r17, (InterfaceC4339a) objM87133R5, r15, r10);
                            r16 = i18;
                            interfaceC2994c1 = interfaceC2994c7;
                            obj2 = obj3;
                        } else {
                            obj3 = obj2;
                        }
                        objM87133R5 = new C0372h(interfaceC2994c7, c29674b, (int) r16, 0);
                        r15.m87172p0(objM87133R5);
                        m1021n(r17, (InterfaceC4339a) objM87133R5, r15, r10);
                        r16 = i18;
                        interfaceC2994c1 = interfaceC2994c7;
                        obj2 = obj3;
                    }
                    AbstractC25012a.m73392y(r15, r10, true, r10);
                } else {
                    r15.m87150e0(808210029);
                    r15.m87173q(r10);
                }
                r15.m87173q(true);
                interfaceC1585g2 = interfaceC1585g7;
                function3 = function5;
                modifier2 = modifier5;
                r14 = r15;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q2.m87138X();
        interfaceC1585g2 = interfaceC1585g1;
        function3 = function2;
        r14 = c28655q2;
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            final int i35 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: a41.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj5, Object obj6) {
                    switch (i35) {
                        case 0:
                            int iIntValue2 = ((Integer) obj6).intValue();
                            return AbstractC0376l.m1028u(modifier2, viewState, interfaceC1585g2, function3, i13, i14, (Composer) obj5, iIntValue2);
                        default:
                            int iIntValue3 = ((Integer) obj6).intValue();
                            return AbstractC0376l.m1032y(modifier2, viewState, interfaceC1585g2, function3, i13, i14, (Composer) obj5, iIntValue3);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m1027t(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m1028u(Modifier modifier, C0377m c0377m, InterfaceC1585g0 interfaceC1585g0, Function1 function1, int i13, int i14, Composer composer, int i15) throws Throwable {
        m1026s(modifier, c0377m, interfaceC1585g0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final int m1029v(C0377m c0377m) {
        return c0377m.m1045c().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m1030w(C0377m c0377m, InterfaceC29694r HorizontalPager, int i13, Composer composer, int i14) {
        AbstractC22676k.m65750j(HorizontalPager, "$this$HorizontalPager");
        m1024q(c0377m.m1045c().get(i13), composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m1031x(InterfaceC2994c0 interfaceC2994c0, AbstractC29701y abstractC29701y, int i13) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(abstractC29701y, i13, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m1032y(Modifier modifier, C0377m c0377m, InterfaceC1585g0 interfaceC1585g0, Function1 function1, int i13, int i14, Composer composer, int i15) throws Throwable {
        m1026s(modifier, c0377m, interfaceC1585g0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m1033z(final boolean z4, final int i13, final AbstractC29701y abstractC29701y, final InterfaceC1585g0 interfaceC1585g0, Composer composer, final int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(355962404);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(abstractC29701y) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87157i(interfaceC1585g0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (!c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            c28655q.m87138X();
        } else {
            if (!z4 || i13 <= 1) {
                C28677v1 c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i16 = 1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a41.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i16) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC0376l.m1003B(z4, i13, abstractC29701y, interfaceC1585g0, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC0376l.m1002A(z4, i13, abstractC29701y, interfaceC1585g0, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    return;
                }
                return;
            }
            Integer numValueOf = Integer.valueOf(i13);
            boolean zM87157i = ((i15 & 896) == 256) | c28655q.m87157i(interfaceC1585g0) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new c(interfaceC1585g0, abstractC29701y, i13, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87254h(numValueOf, interfaceC1585g0, (InterfaceC4351m) objM87133R, c28655q);
        }
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            final int i17 = 0;
            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a41.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i17) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC0376l.m1003B(z4, i13, abstractC29701y, interfaceC1585g0, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC0376l.m1002A(z4, i13, abstractC29701y, interfaceC1585g0, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
        }
    }
}
