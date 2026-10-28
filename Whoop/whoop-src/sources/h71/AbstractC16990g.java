package h71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b61.AbstractC2756k;
import b61.C2757l;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import cz0.AbstractC11245f;
import cz0.InterfaceC11257r;
import d61.InterfaceC11732a;
import e93.AbstractC12889b;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import ep1.C13412g;
import f61.C14147i;
import g61.C15529b;
import h00.C16513l0;
import h02.C16574h;
import h61.C16980a;
import i71.AbstractC18199c;
import i71.C18198b;
import i71.C18204h;
import i71.InterfaceC18203g;
import j71.AbstractC21394b;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p026b2.InterfaceC2302h;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p132f0.C13821r1;
import p181h2.C16618c;
import p181h2.C16620e;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v63.AbstractC35744b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h71.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u008d\u0001\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a}\u0010)\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020'H\u0003¢\u0006\u0004\b)\u0010*\u001a\u0014\u0010+\u001a\u00020\f*\u00020\u000eH\u0082@¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010/\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020'H\u0002¢\u0006\u0004\b/\u00100\u001a\u001f\u00104\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105¨\u0006:²\u0006\f\u00106\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u00107\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00108\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00109\u001a\u00020#8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lh71/j;", "state", "Lh71/i;", "graphPlotFactory", "Li71/b;", "dataScrollerFactory", "Lh2/e;", "initialGraphSize", "Lkotlin/Function1;", "Lh71/l;", "Ll83/a0;", "onDataScrubEvent", "Lf0/r1;", "scrollState", "Ll0/k1;", "scrollableGraphPadding", "Ld61/a;", "initialDataScrubState", "", "onViewEvent", "l", "(Landroidx/compose/ui/Modifier;Lh71/j;Lh71/i;Li71/b;JLkotlin/jvm/functions/Function1;Lf0/r1;Ll0/k1;Ld61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "width", "Lb2/h;", "alignment", "", "Lj71/b;", "plots", "Li71/g;", "dataScroller", "Li71/h;", "scrollPosition", "", "clip", "Lh2/c;", "customRect", "", "parentWidth", "j", "(FLb2/h;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Li71/g;Lh71/i;Li71/h;ZLh2/c;FLandroidx/compose/runtime/Composer;III)V", "E", "(Lf0/r1;Lq83/d;)Ljava/lang/Object;", "containerSize", "scrollMultiple", "G", "(JF)J", "parentSize", "Lh61/a;", "geometry", "F", "(JLh61/a;)J", "viewState", "graphSize", "shouldRunEndScroll", "isInitialComposition", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16990g {

    /* JADX INFO: renamed from: h71.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.graph.scrollable.ScrollableGraphKt$ScrollableGraph$3$1", m100430f = "ScrollableGraph.kt", m100431l = {103}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65264w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f65265x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f65266y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C13821r1 f65267z;

        /* JADX INFO: renamed from: h71.g$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41683a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC2994c0 f65268w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13821r1 f65269x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f65270y;

            /* JADX INFO: renamed from: h71.g$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.graph.scrollable.ScrollableGraphKt$ScrollableGraph$3$1$2$1", m100430f = "ScrollableGraph.kt", m100431l = {107}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41684a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f65271w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C13821r1 f65272x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ InterfaceC28601c1 f65273y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41684a(C13821r1 c13821r1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super C41684a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f65272x = c13821r1;
                    this.f65273y = interfaceC28601c1;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C41684a(this.f65272x, this.f65273y, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C41684a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f65271w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        if (this.f65272x.f49321d.m87024x() > 0) {
                            C13821r1 c13821r1 = this.f65272x;
                            this.f65271w = 1;
                            if (AbstractC16990g.m47819E(c13821r1, this) == enumC31071a) {
                                return enumC31071a;
                            }
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    AbstractC16990g.m47836o(this.f65273y, false);
                    return C23454a0.f92919a;
                }
            }

            public C41683a(InterfaceC2994c0 interfaceC2994c0, C13821r1 c13821r1, InterfaceC28601c1 interfaceC28601c1) {
                this.f65268w = interfaceC2994c0;
                this.f65269x = c13821r1;
                this.f65270y = interfaceC28601c1;
            }

            /* JADX INFO: renamed from: b */
            public final Object m47850b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (z4) {
                    AbstractC3006f0.m8732z(this.f65268w, null, null, new C41684a(this.f65269x, this.f65270y, null), 3);
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m47850b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28601c1 interfaceC28601c1, C13821r1 c13821r1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f65266y = interfaceC28601c1;
            this.f65267z = c13821r1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final boolean m47849h(InterfaceC28601c1 interfaceC28601c1) {
            return AbstractC16990g.m47815A(interfaceC28601c1);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f65266y, this.f65267z, interfaceC30057d);
            aVar.f65265x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f65265x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f65264w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                final InterfaceC28601c1 interfaceC28601c1 = this.f65266y;
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new InterfaceC4339a() { // from class: h71.f
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return Boolean.valueOf(AbstractC16990g.a.m47849h(interfaceC28601c1));
                    }
                });
                C41683a c41683a = new C41683a(interfaceC2994c0, this.f65267z, this.f65266y);
                this.f65265x = null;
                this.f65264w = 1;
                if (c13084s1M87240H.collect(c41683a, this) == enumC31071a) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final boolean m47815A(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final Object m47819E(C13821r1 c13821r1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM39184f = c13821r1.m39184f(c13821r1.f49321d.m87024x(), AbstractC11348f.m30574v(AbstractC12889b.m36258X(500.0f), 0, null, 6), interfaceC30057d);
        return objM39184f == EnumC31071a.f128113w ? objM39184f : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final long m47820F(long j7, C16980a c16980a) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat((int) (C16620e.m47215g(Float.intBitsToFloat((int) (c16980a.m47802e().m47199e() >> 32)), j7) >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: G */
    private static final long m47821G(long j7, float f13) {
        return C16620e.m47209a(Float.intBitsToFloat((int) (j7 >> 32)) * f13, 0.0f, j7, 2);
    }

    /* JADX INFO: renamed from: j */
    private static final void m47831j(final float f13, final InterfaceC2302h interfaceC2302h, final List<? extends AbstractC21394b> list, final Modifier modifier, final Function1 function1, final InterfaceC18203g interfaceC18203g, final C16992i c16992i, final C18204h c18204h, final boolean z4, C16618c c16618c, final float f14, Composer composer, final int i13, final int i14, final int i15) {
        Modifier modifier2;
        Function1 function2;
        C16992i c16992i2;
        C16618c c16618c2;
        final C16618c c16618c3;
        InterfaceC18203g interfaceC18203g2 = interfaceC18203g;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-752135752);
        int i16 = (i13 & 6) == 0 ? (c28655q.m87147d(f13) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i16 |= c28655q.m87153g(interfaceC2302h) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q.m87157i(list) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            modifier2 = modifier;
            i16 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            modifier2 = modifier;
        }
        if ((i13 & 24576) == 0) {
            function2 = function1;
            i16 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            function2 = function1;
        }
        if ((196608 & i13) == 0) {
            i16 |= (262144 & i13) == 0 ? c28655q.m87153g(interfaceC18203g2) : c28655q.m87157i(interfaceC18203g2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            c16992i2 = c16992i;
            i16 |= c28655q.m87153g(c16992i2) ? 1048576 : 524288;
        } else {
            c16992i2 = c16992i;
        }
        if ((12582912 & i13) == 0) {
            i16 |= c28655q.m87153g(c18204h) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i16 |= c28655q.m87155h(z4) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i17 = i15 & 512;
        if (i17 != 0) {
            i16 |= 805306368;
            c16618c2 = c16618c;
        } else {
            c16618c2 = c16618c;
            if ((i13 & 805306368) == 0) {
                i16 |= c28655q.m87153g(c16618c2) ? 536870912 : 268435456;
            }
        }
        int i18 = i16;
        int i19 = (i14 & 6) == 0 ? i14 | (c28655q.m87147d(f14) ? 4 : 2) : i14;
        if (c28655q.m87135U(i18 & 1, ((i18 & 306783379) == 306783378 && (i19 & 3) == 2) ? false : true)) {
            C16618c c16618c4 = i17 != 0 ? null : c16618c2;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3424u = AbstractC1102d.m3424u(f13, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(interfaceC2302h, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3424u);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-1901845948);
            for (AbstractC21394b abstractC21394b : list) {
                int i24 = i18 >> 6;
                int i25 = i18 >> 3;
                c16992i2.m47853b(abstractC21394b, modifier2, AbstractC1102d.m3407d(1.0f, c2314t).mo3471e(z4 ? AbstractC37056f.m118995s(c2314t) : c2314t), function2, interfaceC18203g2, c18204h, c16618c4, f14, c28655q, (i25 & 7168) | (i24 & 112) | (57344 & i25) | (i24 & 458752) | ((i18 >> 9) & 3670016) | ((i19 << 21) & 29360128) | (234881024 & (i18 << 6)));
                modifier2 = modifier;
                function2 = function1;
                interfaceC18203g2 = interfaceC18203g;
                c16992i2 = c16992i;
                c2314t = c2314t;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            c16618c3 = c16618c4;
        } else {
            c28655q.m87138X();
            c16618c3 = c16618c2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h71.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC16990g.m47832k(f13, interfaceC2302h, list, modifier, function1, interfaceC18203g, c16992i, c18204h, z4, c16618c3, f14, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m47832k(float f13, InterfaceC2302h interfaceC2302h, List list, Modifier modifier, Function1 function1, InterfaceC18203g interfaceC18203g, C16992i c16992i, C18204h c18204h, boolean z4, C16618c c16618c, float f14, int i13, int i14, int i15, Composer composer, int i16) {
        m47831j(f13, interfaceC2302h, list, modifier, function1, interfaceC18203g, c16992i, c18204h, z4, c16618c, f14, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0131  */
    /* JADX WARN: Code duplicated, block: B:105:0x013b  */
    /* JADX WARN: Code duplicated, block: B:106:0x013e  */
    /* JADX WARN: Code duplicated, block: B:110:0x014e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0150  */
    /* JADX WARN: Code duplicated, block: B:114:0x0159  */
    /* JADX WARN: Code duplicated, block: B:116:0x0167  */
    /* JADX WARN: Code duplicated, block: B:126:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0190  */
    /* JADX WARN: Code duplicated, block: B:130:0x0195  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:152:0x01de  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:161:0x020a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0251  */
    /* JADX WARN: Code duplicated, block: B:165:0x0265  */
    /* JADX WARN: Code duplicated, block: B:168:0x0279  */
    /* JADX WARN: Code duplicated, block: B:171:0x030b  */
    /* JADX WARN: Code duplicated, block: B:174:0x031c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0335 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x033c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0352 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0354  */
    /* JADX WARN: Code duplicated, block: B:185:0x0357  */
    /* JADX WARN: Code duplicated, block: B:190:0x037b  */
    /* JADX WARN: Code duplicated, block: B:197:0x0390  */
    /* JADX WARN: Code duplicated, block: B:198:0x0393  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:204:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:207:0x03ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:211:0x0406  */
    /* JADX WARN: Code duplicated, block: B:212:0x040a  */
    /* JADX WARN: Code duplicated, block: B:215:0x041f  */
    /* JADX WARN: Code duplicated, block: B:218:0x0430  */
    /* JADX WARN: Code duplicated, block: B:222:0x0448  */
    /* JADX WARN: Code duplicated, block: B:224:0x0454  */
    /* JADX WARN: Code duplicated, block: B:227:0x0480 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x0482  */
    /* JADX WARN: Code duplicated, block: B:231:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:232:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:235:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:237:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:240:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:242:0x0530  */
    /* JADX WARN: Code duplicated, block: B:243:0x0532  */
    /* JADX WARN: Code duplicated, block: B:246:0x053a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:249:0x0544  */
    /* JADX WARN: Code duplicated, block: B:252:0x0597  */
    /* JADX WARN: Code duplicated, block: B:254:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:257:0x0616  */
    /* JADX WARN: Code duplicated, block: B:259:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:94:0x0119  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0126  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m47833l(Modifier modifier, C16993j state, C16992i c16992i, C18198b c18198b, long j7, Function1 function1, C13821r1 c13821r1, InterfaceC22973k1 interfaceC22973k1, InterfaceC11732a interfaceC11732a, Function1 function2, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C16992i c16992i2;
        C18198b c18198b2;
        long j13;
        int i16;
        Function1 function3;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        boolean zM87157i;
        int i27;
        int i28;
        int i29;
        boolean z4;
        C28655q c28655q;
        Function1 function4;
        Modifier modifier3;
        C16992i c16992i3;
        Function1 function5;
        C18198b c18198b3;
        long j14;
        C13821r1 c13821r2;
        InterfaceC22973k1 interfaceC22973k2;
        InterfaceC11732a interfaceC11732a2;
        C28677v1 c28677v1M87180u;
        int i34;
        C2314t c2314t;
        C28676v0 c28676v0;
        C2757l c2757l;
        C18198b c18198b4;
        long j15;
        C13821r1 c13821r3;
        InterfaceC22973k1 interfaceC22973k1M3379a;
        InterfaceC11732a interfaceC11732a3;
        InterfaceC11732a interfaceC11732a4;
        Function1 function6;
        C16992i c16992i4;
        C13821r1 c13821r4;
        int i35;
        long j16;
        InterfaceC22973k1 interfaceC22973k3;
        Object objM87133R;
        Object objM87133R2;
        final InterfaceC28601c1 interfaceC28601c1M87238F;
        C13821r1 c13821r5;
        final Function1 function7;
        final String strM21274h;
        final float fMo743q0;
        C13821r1 c13821r6;
        Object objM87133R3;
        final InterfaceC28601c1 interfaceC28601c1;
        final long jM47821G;
        int i36;
        final float fMo734f0;
        final C18204h c18204h;
        final InterfaceC18203g interfaceC18203gM52259a;
        final C16980a c16980a;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c3;
        boolean zM87153g;
        Object objM87133R6;
        Object objM87133R7;
        final InterfaceC28601c1 interfaceC28601c4;
        C14147i c14147i;
        Iterator<T> it;
        Object next;
        final C2307m c2307m;
        boolean zM87157i2;
        Object objM87133R8;
        boolean zM87153g2;
        Object objM87133R9;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C15529b startVerticalAxis;
        boolean z13;
        boolean zM87157i3;
        Object objM87133R10;
        int iHashCode2;
        final Modifier modifier5;
        final Function1 function8;
        final C16992i c16992i5;
        boolean z14;
        boolean z15;
        Object objM87133R11;
        final C16980a c16980a2;
        final InterfaceC28601c1 interfaceC28601c5;
        InterfaceC11732a interfaceC11732a5;
        int i37;
        Object[] objArr;
        C2307m c2307m2 = C2299e.f9114w;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1086501834);
        int i38 = i14 & 1;
        if (i38 != 0) {
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
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                c16992i2 = c16992i;
                int i39 = c28655q2.m87153g(c16992i2) ? 256 : 128;
                i15 |= i39;
            } else {
                c16992i2 = c16992i;
            }
            i15 |= i39;
        } else {
            c16992i2 = c16992i;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c18198b2 = c18198b;
                if (c28655q2.m87153g(c18198b2)) {
                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i37;
            } else {
                c18198b2 = c18198b;
            }
            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i37;
        } else {
            c18198b2 = c18198b;
        }
        int i44 = i14 & 16;
        if (i44 == 0) {
            if ((i13 & 24576) == 0) {
                j13 = j7;
                i15 |= c28655q2.m87151f(j13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function3 = function1;
            } else {
                function3 = function1;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(function3)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87153g(c13821r1)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
            i24 = i14 & 128;
            if (i24 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87153g(interfaceC22973k1)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 256;
                if (i26 != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if ((i13 & 134217728) == 0) {
                        zM87157i = c28655q2.m87153g(interfaceC11732a);
                    } else {
                        zM87157i = c28655q2.m87157i(interfaceC11732a);
                    }
                    if (zM87157i) {
                        i27 = 67108864;
                    } else {
                        i27 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 512;
                if (i28 != 0) {
                    if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87157i(function2)) {
                            i29 = 536870912;
                        } else {
                            i29 = 268435456;
                        }
                        i15 |= i29;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c28655q2.m87140Z();
                        i34 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        c28676v0 = C28635l.f115821a;
                        c2757l = null;
                        objArr = 0;
                        if (i34 != 0 || c28655q2.m87118C()) {
                            if (i38 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i14 & 4) != 0) {
                                c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                                i15 &= -897;
                            }
                            if ((i14 & 8) != 0) {
                                c18198b4 = new C18198b();
                                i15 &= -7169;
                            } else {
                                c18198b4 = c18198b2;
                            }
                            if (i44 != 0) {
                                j15 = 0;
                            } else {
                                j15 = j13;
                            }
                            if (i16 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C16513l0(24);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                function3 = (Function1) objM87133R2;
                            }
                            if (i18 != 0) {
                                c13821r3 = null;
                            } else {
                                c13821r3 = c13821r1;
                            }
                            if (i24 != 0) {
                                interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                            } else {
                                interfaceC22973k1M3379a = interfaceC22973k1;
                            }
                            if (i26 != 0) {
                                interfaceC11732a3 = null;
                            } else {
                                interfaceC11732a3 = interfaceC11732a;
                            }
                            interfaceC11732a4 = interfaceC11732a3;
                            if (i28 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C16513l0(25);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                function6 = (Function1) objM87133R;
                            } else {
                                c18198b4 = c18198b4;
                                function6 = function2;
                            }
                            c16992i4 = c16992i2;
                            c13821r4 = c13821r3;
                            i35 = i15;
                            j16 = j15;
                            interfaceC22973k3 = interfaceC22973k1M3379a;
                            c18198b2 = c18198b4;
                        } else {
                            c28655q2.m87138X();
                            if ((i14 & 4) != 0) {
                                i15 &= -897;
                            }
                            if ((i14 & 8) != 0) {
                                i15 &= -7169;
                            }
                            c13821r4 = c13821r1;
                            interfaceC22973k3 = interfaceC22973k1;
                            interfaceC11732a4 = interfaceC11732a;
                            function6 = function2;
                            c16992i4 = c16992i2;
                            long j17 = j13;
                            i35 = i15;
                            j16 = j17;
                        }
                        c28655q2.m87175r();
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(state, c28655q2);
                        c13821r5 = c13821r4;
                        function7 = function3;
                        strM21274h = AbstractC8693b.m21274h(m47841t(interfaceC28601c1M87238F).getAccessibilityLabel(), c28655q2, 0);
                        EnumC39181m enumC39181m = (EnumC39181m) c28655q2.m87161k(AbstractC2453v1.f9575n);
                        float fM3386h = AbstractC1099a.m3386h(interfaceC22973k3, enumC39181m) + AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m);
                        C28674u2 c28674u2 = AbstractC2453v1.f9569h;
                        fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u2)).mo743q0(AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m));
                        if (c13821r5 == null) {
                            c28655q2.m87150e0(-451175829);
                            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                            c28655q2.m87173q(false);
                            c13821r6 = c13821r1M92099U;
                        } else {
                            c28655q2.m87150e0(-451176294);
                            c28655q2.m87173q(false);
                            c13821r6 = c13821r5;
                        }
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(new C16620e(j16));
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                        long j18 = j16;
                        jM47821G = m47821G(m47846y(interfaceC28601c1), m47841t(interfaceC28601c1M87238F).getScrollSize());
                        i36 = (int) (jM47821G >> 32);
                        fMo734f0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u2)).mo734f0(Float.intBitsToFloat(i36)) - fM3386h;
                        float f13 = fMo734f0 + fM3386h;
                        c18204h = new C18204h((((long) Float.floatToRawIntBits(c13821r6.f49318a.m87024x())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jM47821G, m47846y(interfaceC28601c1), 0.0f, 8, null);
                        interfaceC18203gM52259a = AbstractC18199c.m52259a(c18198b2, m47841t(interfaceC28601c1M87238F), c28655q2, (i35 >> 9) & 14);
                        C18198b c18198b5 = c18198b2;
                        c16980a = new C16980a(m47841t(interfaceC28601c1M87238F).getPlaneState(), 0.0f, 2, null);
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(Boolean.TRUE);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        Boolean bool = Boolean.TRUE;
                        zM87153g = c28655q2.m87153g(c13821r6);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87153g || objM87133R6 == c28676v0) {
                            objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, bool);
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            if (interfaceC11732a4 == null) {
                                interfaceC11732a5 = InterfaceC11732a.b.f37977a;
                            } else {
                                interfaceC11732a5 = interfaceC11732a4;
                            }
                            objM87133R7 = AbstractC28683x.m87272z(interfaceC11732a5);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R7;
                        c14147i = new C14147i();
                        it = m47841t(interfaceC28601c1M87238F).m47857e().iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!(((AbstractC21394b) next) instanceof AbstractC21394b.d));
                        if (((AbstractC21394b) next) != null) {
                            c2307m = c2307m2;
                        } else {
                            c2307m = C2299e.f9104G;
                        }
                        zM87157i2 = c28655q2.m87157i(c16980a);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87157i2 || objM87133R8 == c28676v0) {
                            objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1131a.m3500d(modifier2, (Function1) objM87133R8));
                        zM87153g2 = c28655q2.m87153g(strM21274h);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2 || objM87133R9 == c28676v0) {
                            objM87133R9 = new Function1() { // from class: h71.a
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                                }
                            };
                            c28655q2.m87172p0(objM87133R9);
                        }
                        Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3407d, false, (Function1) objM87133R9);
                        modifier4 = modifier2;
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        InterfaceC22973k1 interfaceC22973k4 = interfaceC22973k3;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM51775c);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i4 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, c22994r1M66759a);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m);
                        c0209i2 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            c0209i3 = c0209i;
                        } else {
                            c0209i3 = c0209i;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i5 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                            startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                            if (startVerticalAxis == null) {
                                c28655q2.m87150e0(-407325064);
                                z13 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z13 = false;
                                c28655q2.m87150e0(-407325063);
                                c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                                c28655q2.m87173q(false);
                            }
                            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k4, AbstractC1102d.m3424u(f13, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                            zM87157i3 = c28655q2.m87157i(state);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i3 || objM87133R10 == c28676v0) {
                                objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3406c, (Function1) objM87133R10);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3500d);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
                            if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                                c28655q2.m87150e0(754505911);
                                C16618c c16618cM47799b = c16980a.m47799b();
                                C16618c c16618cM47801d = c16980a.m47801d();
                                List<InterfaceC11257r> listM7782O = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                                boolean dimContentOnScrub = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                                InterfaceC11732a interfaceC11732a6 = (InterfaceC11732a) interfaceC28601c4.getValue();
                                boolean zM87153g3 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                                if ((i35 & 458752) == 131072) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = zM87153g3 | z14;
                                objM87133R11 = c28655q2.m87133R();
                                if (!z15 || objM87133R11 == c28676v0) {
                                    final C13821r1 c13821r7 = c13821r6;
                                    objM87133R11 = new Function1() { // from class: h71.b
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AbstractC16990g.m47843v(c13821r7, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                        }
                                    };
                                    c16980a2 = c16980a;
                                    interfaceC28601c5 = interfaceC28601c1M87238F;
                                    c28655q2.m87172p0(objM87133R11);
                                } else {
                                    c16980a2 = c16980a;
                                    interfaceC28601c5 = interfaceC28601c1M87238F;
                                }
                                c16992i5 = c16992i4;
                                modifier5 = modifier4;
                                function8 = function6;
                                AbstractC11245f.m30353d(c16618cM47799b, c16618cM47801d, interfaceC11732a6, listM7782O, (Function1) objM87133R11, 400L, dimContentOnScrub, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                                    }
                                }), c28655q2, 12779520, 0);
                                c28655q = c28655q2;
                                c28655q.m87173q(false);
                            } else {
                                function7 = function7;
                                c28655q = c28655q2;
                                modifier5 = modifier4;
                                function8 = function6;
                                c16992i5 = c16992i4;
                                c28655q.m87150e0(756326696);
                                m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            c13821r2 = c13821r5;
                            function5 = function7;
                            modifier3 = modifier5;
                            function4 = function8;
                            c16992i3 = c16992i5;
                            interfaceC11732a2 = interfaceC11732a4;
                            j14 = j18;
                            interfaceC22973k2 = interfaceC22973k4;
                            c18198b3 = c18198b5;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                        C0209i c0209i6 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N);
                        startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                        if (startVerticalAxis == null) {
                            c28655q2.m87150e0(-407325064);
                            z13 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z13 = false;
                            c28655q2.m87150e0(-407325063);
                            c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3406c2 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k4, AbstractC1102d.m3424u(f13, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                        zM87157i3 = c28655q2.m87157i(state);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i3) {
                            objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Modifier modifierM3500d2 = AbstractC1131a.m3500d(modifierM3406c2, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3500d2);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N3);
                        if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                            c28655q2.m87150e0(754505911);
                            C16618c c16618cM47799b2 = c16980a.m47799b();
                            C16618c c16618cM47801d2 = c16980a.m47801d();
                            List<InterfaceC11257r> listM7782O2 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                            boolean dimContentOnScrub2 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                            InterfaceC11732a interfaceC11732a7 = (InterfaceC11732a) interfaceC28601c4.getValue();
                            boolean zM87153g4 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                            if ((i35 & 458752) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = zM87153g4 | z14;
                            objM87133R11 = c28655q2.m87133R();
                            if (z15) {
                                final C13821r1 c13821r8 = c13821r6;
                                objM87133R11 = new Function1() { // from class: h71.b
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AbstractC16990g.m47843v(c13821r8, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                    }
                                };
                                c16980a2 = c16980a;
                                interfaceC28601c5 = interfaceC28601c1M87238F;
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                final C13821r1 c13821r9 = c13821r6;
                                objM87133R11 = new Function1() { // from class: h71.b
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AbstractC16990g.m47843v(c13821r9, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                    }
                                };
                                c16980a2 = c16980a;
                                interfaceC28601c5 = interfaceC28601c1M87238F;
                                c28655q2.m87172p0(objM87133R11);
                            }
                            c16992i5 = c16992i4;
                            modifier5 = modifier4;
                            function8 = function6;
                            AbstractC11245f.m30353d(c16618cM47799b2, c16618cM47801d2, interfaceC11732a7, listM7782O2, (Function1) objM87133R11, 400L, dimContentOnScrub2, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                                }
                            }), c28655q2, 12779520, 0);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                        } else {
                            function7 = function7;
                            c28655q = c28655q2;
                            modifier5 = modifier4;
                            function8 = function6;
                            c16992i5 = c16992i4;
                            c28655q.m87150e0(756326696);
                            m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        c13821r2 = c13821r5;
                        function5 = function7;
                        modifier3 = modifier5;
                        function4 = function8;
                        c16992i3 = c16992i5;
                        interfaceC11732a2 = interfaceC11732a4;
                        j14 = j18;
                        interfaceC22973k2 = interfaceC22973k4;
                        c18198b3 = c18198b5;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        function4 = function2;
                        modifier3 = modifier2;
                        c16992i3 = c16992i2;
                        function5 = function3;
                        c18198b3 = c18198b2;
                        j14 = j13;
                        c13821r2 = c13821r1;
                        interfaceC22973k2 = interfaceC22973k1;
                        interfaceC11732a2 = interfaceC11732a;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C16987d(modifier3, state, c16992i3, c18198b3, j14, function5, c13821r2, interfaceC22973k2, interfaceC11732a2, function4, i13, i14);
                    }
                }
                i15 |= 805306368;
                if ((i15 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28655q2.m87140Z();
                    i34 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    c28676v0 = C28635l.f115821a;
                    c2757l = null;
                    objArr = 0;
                    if (i34 != 0) {
                        if (i38 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 4) != 0) {
                            c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            c18198b4 = new C18198b();
                            i15 &= -7169;
                        } else {
                            c18198b4 = c18198b2;
                        }
                        if (i44 != 0) {
                            j15 = 0;
                        } else {
                            j15 = j13;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C16513l0(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            c13821r3 = null;
                        } else {
                            c13821r3 = c13821r1;
                        }
                        if (i24 != 0) {
                            interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                        } else {
                            interfaceC22973k1M3379a = interfaceC22973k1;
                        }
                        if (i26 != 0) {
                            interfaceC11732a3 = null;
                        } else {
                            interfaceC11732a3 = interfaceC11732a;
                        }
                        interfaceC11732a4 = interfaceC11732a3;
                        if (i28 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C16513l0(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function6 = (Function1) objM87133R;
                        } else {
                            c18198b4 = c18198b4;
                            function6 = function2;
                        }
                        c16992i4 = c16992i2;
                        c13821r4 = c13821r3;
                        i35 = i15;
                        j16 = j15;
                        interfaceC22973k3 = interfaceC22973k1M3379a;
                        c18198b2 = c18198b4;
                    } else {
                        if (i38 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 4) != 0) {
                            c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            c18198b4 = new C18198b();
                            i15 &= -7169;
                        } else {
                            c18198b4 = c18198b2;
                        }
                        if (i44 != 0) {
                            j15 = 0;
                        } else {
                            j15 = j13;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C16513l0(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            c13821r3 = null;
                        } else {
                            c13821r3 = c13821r1;
                        }
                        if (i24 != 0) {
                            interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                        } else {
                            interfaceC22973k1M3379a = interfaceC22973k1;
                        }
                        if (i26 != 0) {
                            interfaceC11732a3 = null;
                        } else {
                            interfaceC11732a3 = interfaceC11732a;
                        }
                        interfaceC11732a4 = interfaceC11732a3;
                        if (i28 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C16513l0(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function6 = (Function1) objM87133R;
                        } else {
                            c18198b4 = c18198b4;
                            function6 = function2;
                        }
                        c16992i4 = c16992i2;
                        c13821r4 = c13821r3;
                        i35 = i15;
                        j16 = j15;
                        interfaceC22973k3 = interfaceC22973k1M3379a;
                        c18198b2 = c18198b4;
                    }
                    c28655q2.m87175r();
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(state, c28655q2);
                    c13821r5 = c13821r4;
                    function7 = function3;
                    strM21274h = AbstractC8693b.m21274h(m47841t(interfaceC28601c1M87238F).getAccessibilityLabel(), c28655q2, 0);
                    EnumC39181m enumC39181m2 = (EnumC39181m) c28655q2.m87161k(AbstractC2453v1.f9575n);
                    float fM3386h2 = AbstractC1099a.m3386h(interfaceC22973k3, enumC39181m2) + AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m2);
                    C28674u2 c28674u3 = AbstractC2453v1.f9569h;
                    fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u3)).mo743q0(AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m2));
                    if (c13821r5 == null) {
                        c28655q2.m87150e0(-451175829);
                        C13821r1 c13821r1M92099U2 = AbstractC30060g.m92099U(0, c28655q2, 1);
                        c28655q2.m87173q(false);
                        c13821r6 = c13821r1M92099U2;
                    } else {
                        c28655q2.m87150e0(-451176294);
                        c28655q2.m87173q(false);
                        c13821r6 = c13821r5;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C16620e(j16));
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    long j19 = j16;
                    jM47821G = m47821G(m47846y(interfaceC28601c1), m47841t(interfaceC28601c1M87238F).getScrollSize());
                    i36 = (int) (jM47821G >> 32);
                    fMo734f0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u3)).mo734f0(Float.intBitsToFloat(i36)) - fM3386h2;
                    float f14 = fMo734f0 + fM3386h2;
                    c18204h = new C18204h((((long) Float.floatToRawIntBits(c13821r6.f49318a.m87024x())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jM47821G, m47846y(interfaceC28601c1), 0.0f, 8, null);
                    interfaceC18203gM52259a = AbstractC18199c.m52259a(c18198b2, m47841t(interfaceC28601c1M87238F), c28655q2, (i35 >> 9) & 14);
                    C18198b c18198b6 = c18198b2;
                    c16980a = new C16980a(m47841t(interfaceC28601c1M87238F).getPlaneState(), 0.0f, 2, null);
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    Boolean bool2 = Boolean.TRUE;
                    zM87153g = c28655q2.m87153g(c13821r6);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, bool2);
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        if (interfaceC11732a4 == null) {
                            interfaceC11732a5 = InterfaceC11732a.b.f37977a;
                        } else {
                            interfaceC11732a5 = interfaceC11732a4;
                        }
                        objM87133R7 = AbstractC28683x.m87272z(interfaceC11732a5);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R7;
                    c14147i = new C14147i();
                    it = m47841t(interfaceC28601c1M87238F).m47857e().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((AbstractC21394b) next) instanceof AbstractC21394b.d));
                    if (((AbstractC21394b) next) != null) {
                        c2307m = c2307m2;
                    } else {
                        c2307m = C2299e.f9104G;
                    }
                    zM87157i2 = c28655q2.m87157i(c16980a);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, AbstractC1131a.m3500d(modifier2, (Function1) objM87133R8));
                    zM87153g2 = c28655q2.m87153g(strM21274h);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new Function1() { // from class: h71.a
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                            }
                        };
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new Function1() { // from class: h71.a
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                            }
                        };
                        c28655q2.m87172p0(objM87133R9);
                    }
                    Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierM3407d2, false, (Function1) objM87133R9);
                    modifier4 = modifier2;
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    InterfaceC22973k1 interfaceC22973k5 = interfaceC22973k3;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM51775c2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i7 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i7, c22994r1M66759a2);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m4);
                    c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i8 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N4);
                        startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                        if (startVerticalAxis == null) {
                            c28655q2.m87150e0(-407325064);
                            z13 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z13 = false;
                            c28655q2.m87150e0(-407325063);
                            c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3406c3 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k5, AbstractC1102d.m3424u(f14, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                        zM87157i3 = c28655q2.m87157i(state);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i3) {
                            objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Modifier modifierM3500d3 = AbstractC1131a.m3500d(modifierM3406c3, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3500d3);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m5);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N5);
                        if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                            c28655q2.m87150e0(754505911);
                            C16618c c16618cM47799b3 = c16980a.m47799b();
                            C16618c c16618cM47801d3 = c16980a.m47801d();
                            List<InterfaceC11257r> listM7782O3 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                            boolean dimContentOnScrub3 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                            InterfaceC11732a interfaceC11732a8 = (InterfaceC11732a) interfaceC28601c4.getValue();
                            boolean zM87153g5 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                            if ((i35 & 458752) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = zM87153g5 | z14;
                            objM87133R11 = c28655q2.m87133R();
                            if (z15) {
                                final C13821r1 c13821r10 = c13821r6;
                                objM87133R11 = new Function1() { // from class: h71.b
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AbstractC16990g.m47843v(c13821r10, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                    }
                                };
                                c16980a2 = c16980a;
                                interfaceC28601c5 = interfaceC28601c1M87238F;
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                final C13821r1 c13821r11 = c13821r6;
                                objM87133R11 = new Function1() { // from class: h71.b
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AbstractC16990g.m47843v(c13821r11, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                    }
                                };
                                c16980a2 = c16980a;
                                interfaceC28601c5 = interfaceC28601c1M87238F;
                                c28655q2.m87172p0(objM87133R11);
                            }
                            c16992i5 = c16992i4;
                            modifier5 = modifier4;
                            function8 = function6;
                            AbstractC11245f.m30353d(c16618cM47799b3, c16618cM47801d3, interfaceC11732a8, listM7782O3, (Function1) objM87133R11, 400L, dimContentOnScrub3, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                                }
                            }), c28655q2, 12779520, 0);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                        } else {
                            function7 = function7;
                            c28655q = c28655q2;
                            modifier5 = modifier4;
                            function8 = function6;
                            c16992i5 = c16992i4;
                            c28655q.m87150e0(756326696);
                            m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        c13821r2 = c13821r5;
                        function5 = function7;
                        modifier3 = modifier5;
                        function4 = function8;
                        c16992i3 = c16992i5;
                        interfaceC11732a2 = interfaceC11732a4;
                        j14 = j19;
                        interfaceC22973k2 = interfaceC22973k5;
                        c18198b3 = c18198b6;
                    } else {
                        c0209i3 = c0209i;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                    C0209i c0209i9 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N4);
                    startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                    if (startVerticalAxis == null) {
                        c28655q2.m87150e0(-407325064);
                        z13 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z13 = false;
                        c28655q2.m87150e0(-407325063);
                        c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3406c4 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k5, AbstractC1102d.m3424u(f14, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                    zM87157i3 = c28655q2.m87157i(state);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    Modifier modifierM3500d4 = AbstractC1131a.m3500d(modifierM3406c4, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3500d4);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m6);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
                    if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                        c28655q2.m87150e0(754505911);
                        C16618c c16618cM47799b4 = c16980a.m47799b();
                        C16618c c16618cM47801d4 = c16980a.m47801d();
                        List<InterfaceC11257r> listM7782O4 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                        boolean dimContentOnScrub4 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                        InterfaceC11732a interfaceC11732a9 = (InterfaceC11732a) interfaceC28601c4.getValue();
                        boolean zM87153g6 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                        if ((i35 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87153g6 | z14;
                        objM87133R11 = c28655q2.m87133R();
                        if (z15) {
                            final C13821r1 c13821r12 = c13821r6;
                            objM87133R11 = new Function1() { // from class: h71.b
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC16990g.m47843v(c13821r12, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                }
                            };
                            c16980a2 = c16980a;
                            interfaceC28601c5 = interfaceC28601c1M87238F;
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            final C13821r1 c13821r13 = c13821r6;
                            objM87133R11 = new Function1() { // from class: h71.b
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC16990g.m47843v(c13821r13, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                }
                            };
                            c16980a2 = c16980a;
                            interfaceC28601c5 = interfaceC28601c1M87238F;
                            c28655q2.m87172p0(objM87133R11);
                        }
                        c16992i5 = c16992i4;
                        modifier5 = modifier4;
                        function8 = function6;
                        AbstractC11245f.m30353d(c16618cM47799b4, c16618cM47801d4, interfaceC11732a9, listM7782O4, (Function1) objM87133R11, 400L, dimContentOnScrub4, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                            }
                        }), c28655q2, 12779520, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    } else {
                        function7 = function7;
                        c28655q = c28655q2;
                        modifier5 = modifier4;
                        function8 = function6;
                        c16992i5 = c16992i4;
                        c28655q.m87150e0(756326696);
                        m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    c13821r2 = c13821r5;
                    function5 = function7;
                    modifier3 = modifier5;
                    function4 = function8;
                    c16992i3 = c16992i5;
                    interfaceC11732a2 = interfaceC11732a4;
                    j14 = j19;
                    interfaceC22973k2 = interfaceC22973k5;
                    c18198b3 = c18198b6;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function4 = function2;
                    modifier3 = modifier2;
                    c16992i3 = c16992i2;
                    function5 = function3;
                    c18198b3 = c18198b2;
                    j14 = j13;
                    c13821r2 = c13821r1;
                    interfaceC22973k2 = interfaceC22973k1;
                    interfaceC11732a2 = interfaceC11732a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C16987d(modifier3, state, c16992i3, c18198b3, j14, function5, c13821r2, interfaceC22973k2, interfaceC11732a2, function4, i13, i14);
                }
            }
            i15 |= 12582912;
            i26 = i14 & 256;
            if (i26 != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if ((i13 & 134217728) == 0) {
                    zM87157i = c28655q2.m87153g(interfaceC11732a);
                } else {
                    zM87157i = c28655q2.m87157i(interfaceC11732a);
                }
                if (zM87157i) {
                    i27 = 67108864;
                } else {
                    i27 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i27;
            }
            i28 = i14 & 512;
            if (i28 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i15 |= i29;
                }
                if ((i15 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28655q2.m87140Z();
                    i34 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    c28676v0 = C28635l.f115821a;
                    c2757l = null;
                    objArr = 0;
                    if (i34 != 0) {
                        if (i38 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 4) != 0) {
                            c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            c18198b4 = new C18198b();
                            i15 &= -7169;
                        } else {
                            c18198b4 = c18198b2;
                        }
                        if (i44 != 0) {
                            j15 = 0;
                        } else {
                            j15 = j13;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C16513l0(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            c13821r3 = null;
                        } else {
                            c13821r3 = c13821r1;
                        }
                        if (i24 != 0) {
                            interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                        } else {
                            interfaceC22973k1M3379a = interfaceC22973k1;
                        }
                        if (i26 != 0) {
                            interfaceC11732a3 = null;
                        } else {
                            interfaceC11732a3 = interfaceC11732a;
                        }
                        interfaceC11732a4 = interfaceC11732a3;
                        if (i28 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C16513l0(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function6 = (Function1) objM87133R;
                        } else {
                            c18198b4 = c18198b4;
                            function6 = function2;
                        }
                        c16992i4 = c16992i2;
                        c13821r4 = c13821r3;
                        i35 = i15;
                        j16 = j15;
                        interfaceC22973k3 = interfaceC22973k1M3379a;
                        c18198b2 = c18198b4;
                    } else {
                        if (i38 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 4) != 0) {
                            c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            c18198b4 = new C18198b();
                            i15 &= -7169;
                        } else {
                            c18198b4 = c18198b2;
                        }
                        if (i44 != 0) {
                            j15 = 0;
                        } else {
                            j15 = j13;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C16513l0(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            c13821r3 = null;
                        } else {
                            c13821r3 = c13821r1;
                        }
                        if (i24 != 0) {
                            interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                        } else {
                            interfaceC22973k1M3379a = interfaceC22973k1;
                        }
                        if (i26 != 0) {
                            interfaceC11732a3 = null;
                        } else {
                            interfaceC11732a3 = interfaceC11732a;
                        }
                        interfaceC11732a4 = interfaceC11732a3;
                        if (i28 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C16513l0(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function6 = (Function1) objM87133R;
                        } else {
                            c18198b4 = c18198b4;
                            function6 = function2;
                        }
                        c16992i4 = c16992i2;
                        c13821r4 = c13821r3;
                        i35 = i15;
                        j16 = j15;
                        interfaceC22973k3 = interfaceC22973k1M3379a;
                        c18198b2 = c18198b4;
                    }
                    c28655q2.m87175r();
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(state, c28655q2);
                    c13821r5 = c13821r4;
                    function7 = function3;
                    strM21274h = AbstractC8693b.m21274h(m47841t(interfaceC28601c1M87238F).getAccessibilityLabel(), c28655q2, 0);
                    EnumC39181m enumC39181m3 = (EnumC39181m) c28655q2.m87161k(AbstractC2453v1.f9575n);
                    float fM3386h3 = AbstractC1099a.m3386h(interfaceC22973k3, enumC39181m3) + AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m3);
                    C28674u2 c28674u4 = AbstractC2453v1.f9569h;
                    fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u4)).mo743q0(AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m3));
                    if (c13821r5 == null) {
                        c28655q2.m87150e0(-451175829);
                        C13821r1 c13821r1M92099U3 = AbstractC30060g.m92099U(0, c28655q2, 1);
                        c28655q2.m87173q(false);
                        c13821r6 = c13821r1M92099U3;
                    } else {
                        c28655q2.m87150e0(-451176294);
                        c28655q2.m87173q(false);
                        c13821r6 = c13821r5;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C16620e(j16));
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    long j110 = j16;
                    jM47821G = m47821G(m47846y(interfaceC28601c1), m47841t(interfaceC28601c1M87238F).getScrollSize());
                    i36 = (int) (jM47821G >> 32);
                    fMo734f0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u4)).mo734f0(Float.intBitsToFloat(i36)) - fM3386h3;
                    float f15 = fMo734f0 + fM3386h3;
                    c18204h = new C18204h((((long) Float.floatToRawIntBits(c13821r6.f49318a.m87024x())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jM47821G, m47846y(interfaceC28601c1), 0.0f, 8, null);
                    interfaceC18203gM52259a = AbstractC18199c.m52259a(c18198b2, m47841t(interfaceC28601c1M87238F), c28655q2, (i35 >> 9) & 14);
                    C18198b c18198b7 = c18198b2;
                    c16980a = new C16980a(m47841t(interfaceC28601c1M87238F).getPlaneState(), 0.0f, 2, null);
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    Boolean bool3 = Boolean.TRUE;
                    zM87153g = c28655q2.m87153g(c13821r6);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, bool3);
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        if (interfaceC11732a4 == null) {
                            interfaceC11732a5 = InterfaceC11732a.b.f37977a;
                        } else {
                            interfaceC11732a5 = interfaceC11732a4;
                        }
                        objM87133R7 = AbstractC28683x.m87272z(interfaceC11732a5);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R7;
                    c14147i = new C14147i();
                    it = m47841t(interfaceC28601c1M87238F).m47857e().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((AbstractC21394b) next) instanceof AbstractC21394b.d));
                    if (((AbstractC21394b) next) != null) {
                        c2307m = c2307m2;
                    } else {
                        c2307m = C2299e.f9104G;
                    }
                    zM87157i2 = c28655q2.m87157i(c16980a);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, AbstractC1131a.m3500d(modifier2, (Function1) objM87133R8));
                    zM87153g2 = c28655q2.m87153g(strM21274h);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new Function1() { // from class: h71.a
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                            }
                        };
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new Function1() { // from class: h71.a
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                            }
                        };
                        c28655q2.m87172p0(objM87133R9);
                    }
                    Modifier modifierM51775c3 = AbstractC18032n.m51775c(modifierM3407d3, false, (Function1) objM87133R9);
                    modifier4 = modifier2;
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    InterfaceC22973k1 interfaceC22973k6 = interfaceC22973k3;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM51775c3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i10 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i10, c22994r1M66759a3);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m7);
                    c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i11 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i11, modifierM118962N7);
                        startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                        if (startVerticalAxis == null) {
                            c28655q2.m87150e0(-407325064);
                            z13 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z13 = false;
                            c28655q2.m87150e0(-407325063);
                            c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3406c5 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k6, AbstractC1102d.m3424u(f15, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                        zM87157i3 = c28655q2.m87157i(state);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i3) {
                            objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Modifier modifierM3500d5 = AbstractC1131a.m3500d(modifierM3406c5, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3500d5);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m8);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i11, modifierM118962N8);
                        if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                            c28655q2.m87150e0(754505911);
                            C16618c c16618cM47799b5 = c16980a.m47799b();
                            C16618c c16618cM47801d5 = c16980a.m47801d();
                            List<InterfaceC11257r> listM7782O5 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                            boolean dimContentOnScrub5 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                            InterfaceC11732a interfaceC11732a10 = (InterfaceC11732a) interfaceC28601c4.getValue();
                            boolean zM87153g7 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                            if ((i35 & 458752) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = zM87153g7 | z14;
                            objM87133R11 = c28655q2.m87133R();
                            if (z15) {
                                final C13821r1 c13821r14 = c13821r6;
                                objM87133R11 = new Function1() { // from class: h71.b
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AbstractC16990g.m47843v(c13821r14, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                    }
                                };
                                c16980a2 = c16980a;
                                interfaceC28601c5 = interfaceC28601c1M87238F;
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                final C13821r1 c13821r15 = c13821r6;
                                objM87133R11 = new Function1() { // from class: h71.b
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AbstractC16990g.m47843v(c13821r15, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                    }
                                };
                                c16980a2 = c16980a;
                                interfaceC28601c5 = interfaceC28601c1M87238F;
                                c28655q2.m87172p0(objM87133R11);
                            }
                            c16992i5 = c16992i4;
                            modifier5 = modifier4;
                            function8 = function6;
                            AbstractC11245f.m30353d(c16618cM47799b5, c16618cM47801d5, interfaceC11732a10, listM7782O5, (Function1) objM87133R11, 400L, dimContentOnScrub5, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                                }
                            }), c28655q2, 12779520, 0);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                        } else {
                            function7 = function7;
                            c28655q = c28655q2;
                            modifier5 = modifier4;
                            function8 = function6;
                            c16992i5 = c16992i4;
                            c28655q.m87150e0(756326696);
                            m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        c13821r2 = c13821r5;
                        function5 = function7;
                        modifier3 = modifier5;
                        function4 = function8;
                        c16992i3 = c16992i5;
                        interfaceC11732a2 = interfaceC11732a4;
                        j14 = j110;
                        interfaceC22973k2 = interfaceC22973k6;
                        c18198b3 = c18198b7;
                    } else {
                        c0209i3 = c0209i;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N7);
                    startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                    if (startVerticalAxis == null) {
                        c28655q2.m87150e0(-407325064);
                        z13 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z13 = false;
                        c28655q2.m87150e0(-407325063);
                        c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3406c6 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k6, AbstractC1102d.m3424u(f15, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                    zM87157i3 = c28655q2.m87157i(state);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    Modifier modifierM3500d6 = AbstractC1131a.m3500d(modifierM3406c6, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3500d6);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m9);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N9);
                    if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                        c28655q2.m87150e0(754505911);
                        C16618c c16618cM47799b6 = c16980a.m47799b();
                        C16618c c16618cM47801d6 = c16980a.m47801d();
                        List<InterfaceC11257r> listM7782O6 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                        boolean dimContentOnScrub6 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                        InterfaceC11732a interfaceC11732a11 = (InterfaceC11732a) interfaceC28601c4.getValue();
                        boolean zM87153g8 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                        if ((i35 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87153g8 | z14;
                        objM87133R11 = c28655q2.m87133R();
                        if (z15) {
                            final C13821r1 c13821r16 = c13821r6;
                            objM87133R11 = new Function1() { // from class: h71.b
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC16990g.m47843v(c13821r16, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                }
                            };
                            c16980a2 = c16980a;
                            interfaceC28601c5 = interfaceC28601c1M87238F;
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            final C13821r1 c13821r17 = c13821r6;
                            objM87133R11 = new Function1() { // from class: h71.b
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC16990g.m47843v(c13821r17, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                }
                            };
                            c16980a2 = c16980a;
                            interfaceC28601c5 = interfaceC28601c1M87238F;
                            c28655q2.m87172p0(objM87133R11);
                        }
                        c16992i5 = c16992i4;
                        modifier5 = modifier4;
                        function8 = function6;
                        AbstractC11245f.m30353d(c16618cM47799b6, c16618cM47801d6, interfaceC11732a11, listM7782O6, (Function1) objM87133R11, 400L, dimContentOnScrub6, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                            }
                        }), c28655q2, 12779520, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    } else {
                        function7 = function7;
                        c28655q = c28655q2;
                        modifier5 = modifier4;
                        function8 = function6;
                        c16992i5 = c16992i4;
                        c28655q.m87150e0(756326696);
                        m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    c13821r2 = c13821r5;
                    function5 = function7;
                    modifier3 = modifier5;
                    function4 = function8;
                    c16992i3 = c16992i5;
                    interfaceC11732a2 = interfaceC11732a4;
                    j14 = j110;
                    interfaceC22973k2 = interfaceC22973k6;
                    c18198b3 = c18198b7;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function4 = function2;
                    modifier3 = modifier2;
                    c16992i3 = c16992i2;
                    function5 = function3;
                    c18198b3 = c18198b2;
                    j14 = j13;
                    c13821r2 = c13821r1;
                    interfaceC22973k2 = interfaceC22973k1;
                    interfaceC11732a2 = interfaceC11732a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C16987d(modifier3, state, c16992i3, c18198b3, j14, function5, c13821r2, interfaceC22973k2, interfaceC11732a2, function4, i13, i14);
                }
            }
            i15 |= 805306368;
            if ((i15 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                i34 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                c2757l = null;
                objArr = 0;
                if (i34 != 0) {
                    if (i38 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 4) != 0) {
                        c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        c18198b4 = new C18198b();
                        i15 &= -7169;
                    } else {
                        c18198b4 = c18198b2;
                    }
                    if (i44 != 0) {
                        j15 = 0;
                    } else {
                        j15 = j13;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16513l0(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        c13821r3 = null;
                    } else {
                        c13821r3 = c13821r1;
                    }
                    if (i24 != 0) {
                        interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                    } else {
                        interfaceC22973k1M3379a = interfaceC22973k1;
                    }
                    if (i26 != 0) {
                        interfaceC11732a3 = null;
                    } else {
                        interfaceC11732a3 = interfaceC11732a;
                    }
                    interfaceC11732a4 = interfaceC11732a3;
                    if (i28 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C16513l0(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function6 = (Function1) objM87133R;
                    } else {
                        c18198b4 = c18198b4;
                        function6 = function2;
                    }
                    c16992i4 = c16992i2;
                    c13821r4 = c13821r3;
                    i35 = i15;
                    j16 = j15;
                    interfaceC22973k3 = interfaceC22973k1M3379a;
                    c18198b2 = c18198b4;
                } else {
                    if (i38 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 4) != 0) {
                        c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        c18198b4 = new C18198b();
                        i15 &= -7169;
                    } else {
                        c18198b4 = c18198b2;
                    }
                    if (i44 != 0) {
                        j15 = 0;
                    } else {
                        j15 = j13;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16513l0(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        c13821r3 = null;
                    } else {
                        c13821r3 = c13821r1;
                    }
                    if (i24 != 0) {
                        interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                    } else {
                        interfaceC22973k1M3379a = interfaceC22973k1;
                    }
                    if (i26 != 0) {
                        interfaceC11732a3 = null;
                    } else {
                        interfaceC11732a3 = interfaceC11732a;
                    }
                    interfaceC11732a4 = interfaceC11732a3;
                    if (i28 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C16513l0(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function6 = (Function1) objM87133R;
                    } else {
                        c18198b4 = c18198b4;
                        function6 = function2;
                    }
                    c16992i4 = c16992i2;
                    c13821r4 = c13821r3;
                    i35 = i15;
                    j16 = j15;
                    interfaceC22973k3 = interfaceC22973k1M3379a;
                    c18198b2 = c18198b4;
                }
                c28655q2.m87175r();
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(state, c28655q2);
                c13821r5 = c13821r4;
                function7 = function3;
                strM21274h = AbstractC8693b.m21274h(m47841t(interfaceC28601c1M87238F).getAccessibilityLabel(), c28655q2, 0);
                EnumC39181m enumC39181m4 = (EnumC39181m) c28655q2.m87161k(AbstractC2453v1.f9575n);
                float fM3386h4 = AbstractC1099a.m3386h(interfaceC22973k3, enumC39181m4) + AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m4);
                C28674u2 c28674u5 = AbstractC2453v1.f9569h;
                fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u5)).mo743q0(AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m4));
                if (c13821r5 == null) {
                    c28655q2.m87150e0(-451175829);
                    C13821r1 c13821r1M92099U4 = AbstractC30060g.m92099U(0, c28655q2, 1);
                    c28655q2.m87173q(false);
                    c13821r6 = c13821r1M92099U4;
                } else {
                    c28655q2.m87150e0(-451176294);
                    c28655q2.m87173q(false);
                    c13821r6 = c13821r5;
                }
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C16620e(j16));
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                long j111 = j16;
                jM47821G = m47821G(m47846y(interfaceC28601c1), m47841t(interfaceC28601c1M87238F).getScrollSize());
                i36 = (int) (jM47821G >> 32);
                fMo734f0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u5)).mo734f0(Float.intBitsToFloat(i36)) - fM3386h4;
                float f16 = fMo734f0 + fM3386h4;
                c18204h = new C18204h((((long) Float.floatToRawIntBits(c13821r6.f49318a.m87024x())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jM47821G, m47846y(interfaceC28601c1), 0.0f, 8, null);
                interfaceC18203gM52259a = AbstractC18199c.m52259a(c18198b2, m47841t(interfaceC28601c1M87238F), c28655q2, (i35 >> 9) & 14);
                C18198b c18198b8 = c18198b2;
                c16980a = new C16980a(m47841t(interfaceC28601c1M87238F).getPlaneState(), 0.0f, 2, null);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                Boolean bool4 = Boolean.TRUE;
                zM87153g = c28655q2.m87153g(c13821r6);
                objM87133R6 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, bool4);
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    if (interfaceC11732a4 == null) {
                        interfaceC11732a5 = InterfaceC11732a.b.f37977a;
                    } else {
                        interfaceC11732a5 = interfaceC11732a4;
                    }
                    objM87133R7 = AbstractC28683x.m87272z(interfaceC11732a5);
                    c28655q2.m87172p0(objM87133R7);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R7;
                c14147i = new C14147i();
                it = m47841t(interfaceC28601c1M87238F).m47857e().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((AbstractC21394b) next) instanceof AbstractC21394b.d));
                if (((AbstractC21394b) next) != null) {
                    c2307m = c2307m2;
                } else {
                    c2307m = C2299e.f9104G;
                }
                zM87157i2 = c28655q2.m87157i(c16980a);
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                }
                Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, AbstractC1131a.m3500d(modifier2, (Function1) objM87133R8));
                zM87153g2 = c28655q2.m87153g(strM21274h);
                objM87133R9 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R9 = new Function1() { // from class: h71.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                        }
                    };
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new Function1() { // from class: h71.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                        }
                    };
                    c28655q2.m87172p0(objM87133R9);
                }
                Modifier modifierM51775c4 = AbstractC18032n.m51775c(modifierM3407d4, false, (Function1) objM87133R9);
                modifier4 = modifier2;
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                InterfaceC22973k1 interfaceC22973k7 = interfaceC22973k3;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM51775c4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i13 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i13, c22994r1M66759a4);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m10);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i14 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N10);
                    startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                    if (startVerticalAxis == null) {
                        c28655q2.m87150e0(-407325064);
                        z13 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z13 = false;
                        c28655q2.m87150e0(-407325063);
                        c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3406c7 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k7, AbstractC1102d.m3424u(f16, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                    zM87157i3 = c28655q2.m87157i(state);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    Modifier modifierM3500d7 = AbstractC1131a.m3500d(modifierM3406c7, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3500d7);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i13, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m11);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N11);
                    if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                        c28655q2.m87150e0(754505911);
                        C16618c c16618cM47799b7 = c16980a.m47799b();
                        C16618c c16618cM47801d7 = c16980a.m47801d();
                        List<InterfaceC11257r> listM7782O7 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                        boolean dimContentOnScrub7 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                        InterfaceC11732a interfaceC11732a12 = (InterfaceC11732a) interfaceC28601c4.getValue();
                        boolean zM87153g9 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                        if ((i35 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87153g9 | z14;
                        objM87133R11 = c28655q2.m87133R();
                        if (z15) {
                            final C13821r1 c13821r18 = c13821r6;
                            objM87133R11 = new Function1() { // from class: h71.b
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC16990g.m47843v(c13821r18, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                }
                            };
                            c16980a2 = c16980a;
                            interfaceC28601c5 = interfaceC28601c1M87238F;
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            final C13821r1 c13821r19 = c13821r6;
                            objM87133R11 = new Function1() { // from class: h71.b
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC16990g.m47843v(c13821r19, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                }
                            };
                            c16980a2 = c16980a;
                            interfaceC28601c5 = interfaceC28601c1M87238F;
                            c28655q2.m87172p0(objM87133R11);
                        }
                        c16992i5 = c16992i4;
                        modifier5 = modifier4;
                        function8 = function6;
                        AbstractC11245f.m30353d(c16618cM47799b7, c16618cM47801d7, interfaceC11732a12, listM7782O7, (Function1) objM87133R11, 400L, dimContentOnScrub7, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                            }
                        }), c28655q2, 12779520, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    } else {
                        function7 = function7;
                        c28655q = c28655q2;
                        modifier5 = modifier4;
                        function8 = function6;
                        c16992i5 = c16992i4;
                        c28655q.m87150e0(756326696);
                        m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    c13821r2 = c13821r5;
                    function5 = function7;
                    modifier3 = modifier5;
                    function4 = function8;
                    c16992i3 = c16992i5;
                    interfaceC11732a2 = interfaceC11732a4;
                    j14 = j111;
                    interfaceC22973k2 = interfaceC22973k7;
                    c18198b3 = c18198b8;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                C0209i c0209i15 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i15, modifierM118962N10);
                startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                if (startVerticalAxis == null) {
                    c28655q2.m87150e0(-407325064);
                    z13 = false;
                    c28655q2.m87173q(false);
                } else {
                    z13 = false;
                    c28655q2.m87150e0(-407325063);
                    c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3406c8 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k7, AbstractC1102d.m3424u(f16, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                zM87157i3 = c28655q2.m87157i(state);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i3) {
                    objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                    c28655q2.m87172p0(objM87133R10);
                }
                Modifier modifierM3500d8 = AbstractC1131a.m3500d(modifierM3406c8, (Function1) objM87133R10);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3500d8);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i13, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m12);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i15, modifierM118962N12);
                if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                    c28655q2.m87150e0(754505911);
                    C16618c c16618cM47799b8 = c16980a.m47799b();
                    C16618c c16618cM47801d8 = c16980a.m47801d();
                    List<InterfaceC11257r> listM7782O8 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                    boolean dimContentOnScrub8 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                    InterfaceC11732a interfaceC11732a13 = (InterfaceC11732a) interfaceC28601c4.getValue();
                    boolean zM87153g10 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                    if ((i35 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87153g10 | z14;
                    objM87133R11 = c28655q2.m87133R();
                    if (z15) {
                        final C13821r1 c13821r110 = c13821r6;
                        objM87133R11 = new Function1() { // from class: h71.b
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47843v(c13821r110, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                            }
                        };
                        c16980a2 = c16980a;
                        interfaceC28601c5 = interfaceC28601c1M87238F;
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        final C13821r1 c13821r111 = c13821r6;
                        objM87133R11 = new Function1() { // from class: h71.b
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47843v(c13821r111, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                            }
                        };
                        c16980a2 = c16980a;
                        interfaceC28601c5 = interfaceC28601c1M87238F;
                        c28655q2.m87172p0(objM87133R11);
                    }
                    c16992i5 = c16992i4;
                    modifier5 = modifier4;
                    function8 = function6;
                    AbstractC11245f.m30353d(c16618cM47799b8, c16618cM47801d8, interfaceC11732a13, listM7782O8, (Function1) objM87133R11, 400L, dimContentOnScrub8, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, 12779520, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    function7 = function7;
                    c28655q = c28655q2;
                    modifier5 = modifier4;
                    function8 = function6;
                    c16992i5 = c16992i4;
                    c28655q.m87150e0(756326696);
                    m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                c13821r2 = c13821r5;
                function5 = function7;
                modifier3 = modifier5;
                function4 = function8;
                c16992i3 = c16992i5;
                interfaceC11732a2 = interfaceC11732a4;
                j14 = j111;
                interfaceC22973k2 = interfaceC22973k7;
                c18198b3 = c18198b8;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function4 = function2;
                modifier3 = modifier2;
                c16992i3 = c16992i2;
                function5 = function3;
                c18198b3 = c18198b2;
                j14 = j13;
                c13821r2 = c13821r1;
                interfaceC22973k2 = interfaceC22973k1;
                interfaceC11732a2 = interfaceC11732a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16987d(modifier3, state, c16992i3, c18198b3, j14, function5, c13821r2, interfaceC22973k2, interfaceC11732a2, function4, i13, i14);
            }
        }
        i15 |= 24576;
        j13 = j7;
        i16 = i14 & 32;
        if (i16 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function3 = function1;
        } else {
            function3 = function1;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(function3)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
        }
        i18 = i14 & 64;
        if (i18 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q2.m87153g(c13821r1)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i15 |= i19;
        }
        i24 = i14 & 128;
        if (i24 != 0) {
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87153g(interfaceC22973k1)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i15 |= i25;
            }
            i26 = i14 & 256;
            if (i26 != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if ((i13 & 134217728) == 0) {
                    zM87157i = c28655q2.m87153g(interfaceC11732a);
                } else {
                    zM87157i = c28655q2.m87157i(interfaceC11732a);
                }
                if (zM87157i) {
                    i27 = 67108864;
                } else {
                    i27 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i27;
            }
            i28 = i14 & 512;
            if (i28 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i15 |= i29;
                }
                if ((i15 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28655q2.m87140Z();
                    i34 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    c28676v0 = C28635l.f115821a;
                    c2757l = null;
                    objArr = 0;
                    if (i34 != 0) {
                        if (i38 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 4) != 0) {
                            c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            c18198b4 = new C18198b();
                            i15 &= -7169;
                        } else {
                            c18198b4 = c18198b2;
                        }
                        if (i44 != 0) {
                            j15 = 0;
                        } else {
                            j15 = j13;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C16513l0(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            c13821r3 = null;
                        } else {
                            c13821r3 = c13821r1;
                        }
                        if (i24 != 0) {
                            interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                        } else {
                            interfaceC22973k1M3379a = interfaceC22973k1;
                        }
                        if (i26 != 0) {
                            interfaceC11732a3 = null;
                        } else {
                            interfaceC11732a3 = interfaceC11732a;
                        }
                        interfaceC11732a4 = interfaceC11732a3;
                        if (i28 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C16513l0(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function6 = (Function1) objM87133R;
                        } else {
                            c18198b4 = c18198b4;
                            function6 = function2;
                        }
                        c16992i4 = c16992i2;
                        c13821r4 = c13821r3;
                        i35 = i15;
                        j16 = j15;
                        interfaceC22973k3 = interfaceC22973k1M3379a;
                        c18198b2 = c18198b4;
                    } else {
                        if (i38 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 4) != 0) {
                            c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            c18198b4 = new C18198b();
                            i15 &= -7169;
                        } else {
                            c18198b4 = c18198b2;
                        }
                        if (i44 != 0) {
                            j15 = 0;
                        } else {
                            j15 = j13;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C16513l0(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            c13821r3 = null;
                        } else {
                            c13821r3 = c13821r1;
                        }
                        if (i24 != 0) {
                            interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                        } else {
                            interfaceC22973k1M3379a = interfaceC22973k1;
                        }
                        if (i26 != 0) {
                            interfaceC11732a3 = null;
                        } else {
                            interfaceC11732a3 = interfaceC11732a;
                        }
                        interfaceC11732a4 = interfaceC11732a3;
                        if (i28 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C16513l0(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function6 = (Function1) objM87133R;
                        } else {
                            c18198b4 = c18198b4;
                            function6 = function2;
                        }
                        c16992i4 = c16992i2;
                        c13821r4 = c13821r3;
                        i35 = i15;
                        j16 = j15;
                        interfaceC22973k3 = interfaceC22973k1M3379a;
                        c18198b2 = c18198b4;
                    }
                    c28655q2.m87175r();
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(state, c28655q2);
                    c13821r5 = c13821r4;
                    function7 = function3;
                    strM21274h = AbstractC8693b.m21274h(m47841t(interfaceC28601c1M87238F).getAccessibilityLabel(), c28655q2, 0);
                    EnumC39181m enumC39181m5 = (EnumC39181m) c28655q2.m87161k(AbstractC2453v1.f9575n);
                    float fM3386h5 = AbstractC1099a.m3386h(interfaceC22973k3, enumC39181m5) + AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m5);
                    C28674u2 c28674u6 = AbstractC2453v1.f9569h;
                    fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u6)).mo743q0(AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m5));
                    if (c13821r5 == null) {
                        c28655q2.m87150e0(-451175829);
                        C13821r1 c13821r1M92099U5 = AbstractC30060g.m92099U(0, c28655q2, 1);
                        c28655q2.m87173q(false);
                        c13821r6 = c13821r1M92099U5;
                    } else {
                        c28655q2.m87150e0(-451176294);
                        c28655q2.m87173q(false);
                        c13821r6 = c13821r5;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C16620e(j16));
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    long j112 = j16;
                    jM47821G = m47821G(m47846y(interfaceC28601c1), m47841t(interfaceC28601c1M87238F).getScrollSize());
                    i36 = (int) (jM47821G >> 32);
                    fMo734f0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u6)).mo734f0(Float.intBitsToFloat(i36)) - fM3386h5;
                    float f17 = fMo734f0 + fM3386h5;
                    c18204h = new C18204h((((long) Float.floatToRawIntBits(c13821r6.f49318a.m87024x())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jM47821G, m47846y(interfaceC28601c1), 0.0f, 8, null);
                    interfaceC18203gM52259a = AbstractC18199c.m52259a(c18198b2, m47841t(interfaceC28601c1M87238F), c28655q2, (i35 >> 9) & 14);
                    C18198b c18198b9 = c18198b2;
                    c16980a = new C16980a(m47841t(interfaceC28601c1M87238F).getPlaneState(), 0.0f, 2, null);
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    Boolean bool5 = Boolean.TRUE;
                    zM87153g = c28655q2.m87153g(c13821r6);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, bool5);
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        if (interfaceC11732a4 == null) {
                            interfaceC11732a5 = InterfaceC11732a.b.f37977a;
                        } else {
                            interfaceC11732a5 = interfaceC11732a4;
                        }
                        objM87133R7 = AbstractC28683x.m87272z(interfaceC11732a5);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R7;
                    c14147i = new C14147i();
                    it = m47841t(interfaceC28601c1M87238F).m47857e().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((AbstractC21394b) next) instanceof AbstractC21394b.d));
                    if (((AbstractC21394b) next) != null) {
                        c2307m = c2307m2;
                    } else {
                        c2307m = C2299e.f9104G;
                    }
                    zM87157i2 = c28655q2.m87157i(c16980a);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, AbstractC1131a.m3500d(modifier2, (Function1) objM87133R8));
                    zM87153g2 = c28655q2.m87153g(strM21274h);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new Function1() { // from class: h71.a
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                            }
                        };
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new Function1() { // from class: h71.a
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                            }
                        };
                        c28655q2.m87172p0(objM87133R9);
                    }
                    Modifier modifierM51775c5 = AbstractC18032n.m51775c(modifierM3407d5, false, (Function1) objM87133R9);
                    modifier4 = modifier2;
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    InterfaceC22973k1 interfaceC22973k8 = interfaceC22973k3;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM51775c5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i16 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i16, c22994r1M66759a5);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m13);
                    c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i17 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N13);
                        startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                        if (startVerticalAxis == null) {
                            c28655q2.m87150e0(-407325064);
                            z13 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z13 = false;
                            c28655q2.m87150e0(-407325063);
                            c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3406c9 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k8, AbstractC1102d.m3424u(f17, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                        zM87157i3 = c28655q2.m87157i(state);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i3) {
                            objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Modifier modifierM3500d9 = AbstractC1131a.m3500d(modifierM3406c9, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3500d9);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m14);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N14);
                        if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                            c28655q2.m87150e0(754505911);
                            C16618c c16618cM47799b9 = c16980a.m47799b();
                            C16618c c16618cM47801d9 = c16980a.m47801d();
                            List<InterfaceC11257r> listM7782O9 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                            boolean dimContentOnScrub9 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                            InterfaceC11732a interfaceC11732a14 = (InterfaceC11732a) interfaceC28601c4.getValue();
                            boolean zM87153g11 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                            if ((i35 & 458752) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = zM87153g11 | z14;
                            objM87133R11 = c28655q2.m87133R();
                            if (z15) {
                                final C13821r1 c13821r112 = c13821r6;
                                objM87133R11 = new Function1() { // from class: h71.b
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AbstractC16990g.m47843v(c13821r112, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                    }
                                };
                                c16980a2 = c16980a;
                                interfaceC28601c5 = interfaceC28601c1M87238F;
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                final C13821r1 c13821r113 = c13821r6;
                                objM87133R11 = new Function1() { // from class: h71.b
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AbstractC16990g.m47843v(c13821r113, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                    }
                                };
                                c16980a2 = c16980a;
                                interfaceC28601c5 = interfaceC28601c1M87238F;
                                c28655q2.m87172p0(objM87133R11);
                            }
                            c16992i5 = c16992i4;
                            modifier5 = modifier4;
                            function8 = function6;
                            AbstractC11245f.m30353d(c16618cM47799b9, c16618cM47801d9, interfaceC11732a14, listM7782O9, (Function1) objM87133R11, 400L, dimContentOnScrub9, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                                }
                            }), c28655q2, 12779520, 0);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                        } else {
                            function7 = function7;
                            c28655q = c28655q2;
                            modifier5 = modifier4;
                            function8 = function6;
                            c16992i5 = c16992i4;
                            c28655q.m87150e0(756326696);
                            m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        c13821r2 = c13821r5;
                        function5 = function7;
                        modifier3 = modifier5;
                        function4 = function8;
                        c16992i3 = c16992i5;
                        interfaceC11732a2 = interfaceC11732a4;
                        j14 = j112;
                        interfaceC22973k2 = interfaceC22973k8;
                        c18198b3 = c18198b9;
                    } else {
                        c0209i3 = c0209i;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                    C0209i c0209i18 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i18, modifierM118962N13);
                    startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                    if (startVerticalAxis == null) {
                        c28655q2.m87150e0(-407325064);
                        z13 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z13 = false;
                        c28655q2.m87150e0(-407325063);
                        c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3406c10 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k8, AbstractC1102d.m3424u(f17, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                    zM87157i3 = c28655q2.m87157i(state);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    Modifier modifierM3500d10 = AbstractC1131a.m3500d(modifierM3406c10, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3500d10);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m15);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i18, modifierM118962N15);
                    if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                        c28655q2.m87150e0(754505911);
                        C16618c c16618cM47799b10 = c16980a.m47799b();
                        C16618c c16618cM47801d10 = c16980a.m47801d();
                        List<InterfaceC11257r> listM7782O10 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                        boolean dimContentOnScrub10 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                        InterfaceC11732a interfaceC11732a15 = (InterfaceC11732a) interfaceC28601c4.getValue();
                        boolean zM87153g12 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                        if ((i35 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87153g12 | z14;
                        objM87133R11 = c28655q2.m87133R();
                        if (z15) {
                            final C13821r1 c13821r114 = c13821r6;
                            objM87133R11 = new Function1() { // from class: h71.b
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC16990g.m47843v(c13821r114, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                }
                            };
                            c16980a2 = c16980a;
                            interfaceC28601c5 = interfaceC28601c1M87238F;
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            final C13821r1 c13821r115 = c13821r6;
                            objM87133R11 = new Function1() { // from class: h71.b
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC16990g.m47843v(c13821r115, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                }
                            };
                            c16980a2 = c16980a;
                            interfaceC28601c5 = interfaceC28601c1M87238F;
                            c28655q2.m87172p0(objM87133R11);
                        }
                        c16992i5 = c16992i4;
                        modifier5 = modifier4;
                        function8 = function6;
                        AbstractC11245f.m30353d(c16618cM47799b10, c16618cM47801d10, interfaceC11732a15, listM7782O10, (Function1) objM87133R11, 400L, dimContentOnScrub10, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                            }
                        }), c28655q2, 12779520, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    } else {
                        function7 = function7;
                        c28655q = c28655q2;
                        modifier5 = modifier4;
                        function8 = function6;
                        c16992i5 = c16992i4;
                        c28655q.m87150e0(756326696);
                        m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    c13821r2 = c13821r5;
                    function5 = function7;
                    modifier3 = modifier5;
                    function4 = function8;
                    c16992i3 = c16992i5;
                    interfaceC11732a2 = interfaceC11732a4;
                    j14 = j112;
                    interfaceC22973k2 = interfaceC22973k8;
                    c18198b3 = c18198b9;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function4 = function2;
                    modifier3 = modifier2;
                    c16992i3 = c16992i2;
                    function5 = function3;
                    c18198b3 = c18198b2;
                    j14 = j13;
                    c13821r2 = c13821r1;
                    interfaceC22973k2 = interfaceC22973k1;
                    interfaceC11732a2 = interfaceC11732a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C16987d(modifier3, state, c16992i3, c18198b3, j14, function5, c13821r2, interfaceC22973k2, interfaceC11732a2, function4, i13, i14);
                }
            }
            i15 |= 805306368;
            if ((i15 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                i34 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                c2757l = null;
                objArr = 0;
                if (i34 != 0) {
                    if (i38 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 4) != 0) {
                        c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        c18198b4 = new C18198b();
                        i15 &= -7169;
                    } else {
                        c18198b4 = c18198b2;
                    }
                    if (i44 != 0) {
                        j15 = 0;
                    } else {
                        j15 = j13;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16513l0(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        c13821r3 = null;
                    } else {
                        c13821r3 = c13821r1;
                    }
                    if (i24 != 0) {
                        interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                    } else {
                        interfaceC22973k1M3379a = interfaceC22973k1;
                    }
                    if (i26 != 0) {
                        interfaceC11732a3 = null;
                    } else {
                        interfaceC11732a3 = interfaceC11732a;
                    }
                    interfaceC11732a4 = interfaceC11732a3;
                    if (i28 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C16513l0(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function6 = (Function1) objM87133R;
                    } else {
                        c18198b4 = c18198b4;
                        function6 = function2;
                    }
                    c16992i4 = c16992i2;
                    c13821r4 = c13821r3;
                    i35 = i15;
                    j16 = j15;
                    interfaceC22973k3 = interfaceC22973k1M3379a;
                    c18198b2 = c18198b4;
                } else {
                    if (i38 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 4) != 0) {
                        c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        c18198b4 = new C18198b();
                        i15 &= -7169;
                    } else {
                        c18198b4 = c18198b2;
                    }
                    if (i44 != 0) {
                        j15 = 0;
                    } else {
                        j15 = j13;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16513l0(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        c13821r3 = null;
                    } else {
                        c13821r3 = c13821r1;
                    }
                    if (i24 != 0) {
                        interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                    } else {
                        interfaceC22973k1M3379a = interfaceC22973k1;
                    }
                    if (i26 != 0) {
                        interfaceC11732a3 = null;
                    } else {
                        interfaceC11732a3 = interfaceC11732a;
                    }
                    interfaceC11732a4 = interfaceC11732a3;
                    if (i28 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C16513l0(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function6 = (Function1) objM87133R;
                    } else {
                        c18198b4 = c18198b4;
                        function6 = function2;
                    }
                    c16992i4 = c16992i2;
                    c13821r4 = c13821r3;
                    i35 = i15;
                    j16 = j15;
                    interfaceC22973k3 = interfaceC22973k1M3379a;
                    c18198b2 = c18198b4;
                }
                c28655q2.m87175r();
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(state, c28655q2);
                c13821r5 = c13821r4;
                function7 = function3;
                strM21274h = AbstractC8693b.m21274h(m47841t(interfaceC28601c1M87238F).getAccessibilityLabel(), c28655q2, 0);
                EnumC39181m enumC39181m6 = (EnumC39181m) c28655q2.m87161k(AbstractC2453v1.f9575n);
                float fM3386h6 = AbstractC1099a.m3386h(interfaceC22973k3, enumC39181m6) + AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m6);
                C28674u2 c28674u7 = AbstractC2453v1.f9569h;
                fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u7)).mo743q0(AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m6));
                if (c13821r5 == null) {
                    c28655q2.m87150e0(-451175829);
                    C13821r1 c13821r1M92099U6 = AbstractC30060g.m92099U(0, c28655q2, 1);
                    c28655q2.m87173q(false);
                    c13821r6 = c13821r1M92099U6;
                } else {
                    c28655q2.m87150e0(-451176294);
                    c28655q2.m87173q(false);
                    c13821r6 = c13821r5;
                }
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C16620e(j16));
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                long j113 = j16;
                jM47821G = m47821G(m47846y(interfaceC28601c1), m47841t(interfaceC28601c1M87238F).getScrollSize());
                i36 = (int) (jM47821G >> 32);
                fMo734f0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u7)).mo734f0(Float.intBitsToFloat(i36)) - fM3386h6;
                float f18 = fMo734f0 + fM3386h6;
                c18204h = new C18204h((((long) Float.floatToRawIntBits(c13821r6.f49318a.m87024x())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jM47821G, m47846y(interfaceC28601c1), 0.0f, 8, null);
                interfaceC18203gM52259a = AbstractC18199c.m52259a(c18198b2, m47841t(interfaceC28601c1M87238F), c28655q2, (i35 >> 9) & 14);
                C18198b c18198b10 = c18198b2;
                c16980a = new C16980a(m47841t(interfaceC28601c1M87238F).getPlaneState(), 0.0f, 2, null);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                Boolean bool6 = Boolean.TRUE;
                zM87153g = c28655q2.m87153g(c13821r6);
                objM87133R6 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, bool6);
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    if (interfaceC11732a4 == null) {
                        interfaceC11732a5 = InterfaceC11732a.b.f37977a;
                    } else {
                        interfaceC11732a5 = interfaceC11732a4;
                    }
                    objM87133R7 = AbstractC28683x.m87272z(interfaceC11732a5);
                    c28655q2.m87172p0(objM87133R7);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R7;
                c14147i = new C14147i();
                it = m47841t(interfaceC28601c1M87238F).m47857e().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((AbstractC21394b) next) instanceof AbstractC21394b.d));
                if (((AbstractC21394b) next) != null) {
                    c2307m = c2307m2;
                } else {
                    c2307m = C2299e.f9104G;
                }
                zM87157i2 = c28655q2.m87157i(c16980a);
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                }
                Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, AbstractC1131a.m3500d(modifier2, (Function1) objM87133R8));
                zM87153g2 = c28655q2.m87153g(strM21274h);
                objM87133R9 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R9 = new Function1() { // from class: h71.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                        }
                    };
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new Function1() { // from class: h71.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                        }
                    };
                    c28655q2.m87172p0(objM87133R9);
                }
                Modifier modifierM51775c6 = AbstractC18032n.m51775c(modifierM3407d6, false, (Function1) objM87133R9);
                modifier4 = modifier2;
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                InterfaceC22973k1 interfaceC22973k9 = interfaceC22973k3;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM51775c6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i19 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i19, c22994r1M66759a6);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m16);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N16);
                    startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                    if (startVerticalAxis == null) {
                        c28655q2.m87150e0(-407325064);
                        z13 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z13 = false;
                        c28655q2.m87150e0(-407325063);
                        c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3406c11 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k9, AbstractC1102d.m3424u(f18, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                    zM87157i3 = c28655q2.m87157i(state);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    Modifier modifierM3500d11 = AbstractC1131a.m3500d(modifierM3406c11, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM3500d11);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC39127r0M66763d11);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m17);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N17);
                    if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                        c28655q2.m87150e0(754505911);
                        C16618c c16618cM47799b11 = c16980a.m47799b();
                        C16618c c16618cM47801d11 = c16980a.m47801d();
                        List<InterfaceC11257r> listM7782O11 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                        boolean dimContentOnScrub11 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                        InterfaceC11732a interfaceC11732a16 = (InterfaceC11732a) interfaceC28601c4.getValue();
                        boolean zM87153g13 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                        if ((i35 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87153g13 | z14;
                        objM87133R11 = c28655q2.m87133R();
                        if (z15) {
                            final C13821r1 c13821r116 = c13821r6;
                            objM87133R11 = new Function1() { // from class: h71.b
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC16990g.m47843v(c13821r116, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                }
                            };
                            c16980a2 = c16980a;
                            interfaceC28601c5 = interfaceC28601c1M87238F;
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            final C13821r1 c13821r117 = c13821r6;
                            objM87133R11 = new Function1() { // from class: h71.b
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC16990g.m47843v(c13821r117, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                }
                            };
                            c16980a2 = c16980a;
                            interfaceC28601c5 = interfaceC28601c1M87238F;
                            c28655q2.m87172p0(objM87133R11);
                        }
                        c16992i5 = c16992i4;
                        modifier5 = modifier4;
                        function8 = function6;
                        AbstractC11245f.m30353d(c16618cM47799b11, c16618cM47801d11, interfaceC11732a16, listM7782O11, (Function1) objM87133R11, 400L, dimContentOnScrub11, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                            }
                        }), c28655q2, 12779520, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    } else {
                        function7 = function7;
                        c28655q = c28655q2;
                        modifier5 = modifier4;
                        function8 = function6;
                        c16992i5 = c16992i4;
                        c28655q.m87150e0(756326696);
                        m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    c13821r2 = c13821r5;
                    function5 = function7;
                    modifier3 = modifier5;
                    function4 = function8;
                    c16992i3 = c16992i5;
                    interfaceC11732a2 = interfaceC11732a4;
                    j14 = j113;
                    interfaceC22973k2 = interfaceC22973k9;
                    c18198b3 = c18198b10;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                C0209i c0209i111 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N16);
                startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                if (startVerticalAxis == null) {
                    c28655q2.m87150e0(-407325064);
                    z13 = false;
                    c28655q2.m87173q(false);
                } else {
                    z13 = false;
                    c28655q2.m87150e0(-407325063);
                    c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3406c12 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k9, AbstractC1102d.m3424u(f18, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                zM87157i3 = c28655q2.m87157i(state);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i3) {
                    objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                    c28655q2.m87172p0(objM87133R10);
                }
                Modifier modifierM3500d12 = AbstractC1131a.m3500d(modifierM3406c12, (Function1) objM87133R10);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM3500d12);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m18);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N18);
                if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                    c28655q2.m87150e0(754505911);
                    C16618c c16618cM47799b12 = c16980a.m47799b();
                    C16618c c16618cM47801d12 = c16980a.m47801d();
                    List<InterfaceC11257r> listM7782O12 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                    boolean dimContentOnScrub12 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                    InterfaceC11732a interfaceC11732a17 = (InterfaceC11732a) interfaceC28601c4.getValue();
                    boolean zM87153g14 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                    if ((i35 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87153g14 | z14;
                    objM87133R11 = c28655q2.m87133R();
                    if (z15) {
                        final C13821r1 c13821r118 = c13821r6;
                        objM87133R11 = new Function1() { // from class: h71.b
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47843v(c13821r118, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                            }
                        };
                        c16980a2 = c16980a;
                        interfaceC28601c5 = interfaceC28601c1M87238F;
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        final C13821r1 c13821r119 = c13821r6;
                        objM87133R11 = new Function1() { // from class: h71.b
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47843v(c13821r119, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                            }
                        };
                        c16980a2 = c16980a;
                        interfaceC28601c5 = interfaceC28601c1M87238F;
                        c28655q2.m87172p0(objM87133R11);
                    }
                    c16992i5 = c16992i4;
                    modifier5 = modifier4;
                    function8 = function6;
                    AbstractC11245f.m30353d(c16618cM47799b12, c16618cM47801d12, interfaceC11732a17, listM7782O12, (Function1) objM87133R11, 400L, dimContentOnScrub12, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, 12779520, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    function7 = function7;
                    c28655q = c28655q2;
                    modifier5 = modifier4;
                    function8 = function6;
                    c16992i5 = c16992i4;
                    c28655q.m87150e0(756326696);
                    m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                c13821r2 = c13821r5;
                function5 = function7;
                modifier3 = modifier5;
                function4 = function8;
                c16992i3 = c16992i5;
                interfaceC11732a2 = interfaceC11732a4;
                j14 = j113;
                interfaceC22973k2 = interfaceC22973k9;
                c18198b3 = c18198b10;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function4 = function2;
                modifier3 = modifier2;
                c16992i3 = c16992i2;
                function5 = function3;
                c18198b3 = c18198b2;
                j14 = j13;
                c13821r2 = c13821r1;
                interfaceC22973k2 = interfaceC22973k1;
                interfaceC11732a2 = interfaceC11732a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16987d(modifier3, state, c16992i3, c18198b3, j14, function5, c13821r2, interfaceC22973k2, interfaceC11732a2, function4, i13, i14);
            }
        }
        i15 |= 12582912;
        i26 = i14 & 256;
        if (i26 != 0) {
            i15 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if ((i13 & 134217728) == 0) {
                zM87157i = c28655q2.m87153g(interfaceC11732a);
            } else {
                zM87157i = c28655q2.m87157i(interfaceC11732a);
            }
            if (zM87157i) {
                i27 = 67108864;
            } else {
                i27 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 |= i27;
        }
        i28 = i14 & 512;
        if (i28 != 0) {
            if ((i13 & 805306368) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i15 |= i29;
            }
            if ((i15 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                i34 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                c2757l = null;
                objArr = 0;
                if (i34 != 0) {
                    if (i38 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 4) != 0) {
                        c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        c18198b4 = new C18198b();
                        i15 &= -7169;
                    } else {
                        c18198b4 = c18198b2;
                    }
                    if (i44 != 0) {
                        j15 = 0;
                    } else {
                        j15 = j13;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16513l0(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        c13821r3 = null;
                    } else {
                        c13821r3 = c13821r1;
                    }
                    if (i24 != 0) {
                        interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                    } else {
                        interfaceC22973k1M3379a = interfaceC22973k1;
                    }
                    if (i26 != 0) {
                        interfaceC11732a3 = null;
                    } else {
                        interfaceC11732a3 = interfaceC11732a;
                    }
                    interfaceC11732a4 = interfaceC11732a3;
                    if (i28 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C16513l0(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function6 = (Function1) objM87133R;
                    } else {
                        c18198b4 = c18198b4;
                        function6 = function2;
                    }
                    c16992i4 = c16992i2;
                    c13821r4 = c13821r3;
                    i35 = i15;
                    j16 = j15;
                    interfaceC22973k3 = interfaceC22973k1M3379a;
                    c18198b2 = c18198b4;
                } else {
                    if (i38 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 4) != 0) {
                        c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        c18198b4 = new C18198b();
                        i15 &= -7169;
                    } else {
                        c18198b4 = c18198b2;
                    }
                    if (i44 != 0) {
                        j15 = 0;
                    } else {
                        j15 = j13;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16513l0(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        c13821r3 = null;
                    } else {
                        c13821r3 = c13821r1;
                    }
                    if (i24 != 0) {
                        interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                    } else {
                        interfaceC22973k1M3379a = interfaceC22973k1;
                    }
                    if (i26 != 0) {
                        interfaceC11732a3 = null;
                    } else {
                        interfaceC11732a3 = interfaceC11732a;
                    }
                    interfaceC11732a4 = interfaceC11732a3;
                    if (i28 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C16513l0(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function6 = (Function1) objM87133R;
                    } else {
                        c18198b4 = c18198b4;
                        function6 = function2;
                    }
                    c16992i4 = c16992i2;
                    c13821r4 = c13821r3;
                    i35 = i15;
                    j16 = j15;
                    interfaceC22973k3 = interfaceC22973k1M3379a;
                    c18198b2 = c18198b4;
                }
                c28655q2.m87175r();
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(state, c28655q2);
                c13821r5 = c13821r4;
                function7 = function3;
                strM21274h = AbstractC8693b.m21274h(m47841t(interfaceC28601c1M87238F).getAccessibilityLabel(), c28655q2, 0);
                EnumC39181m enumC39181m7 = (EnumC39181m) c28655q2.m87161k(AbstractC2453v1.f9575n);
                float fM3386h7 = AbstractC1099a.m3386h(interfaceC22973k3, enumC39181m7) + AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m7);
                C28674u2 c28674u8 = AbstractC2453v1.f9569h;
                fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u8)).mo743q0(AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m7));
                if (c13821r5 == null) {
                    c28655q2.m87150e0(-451175829);
                    C13821r1 c13821r1M92099U7 = AbstractC30060g.m92099U(0, c28655q2, 1);
                    c28655q2.m87173q(false);
                    c13821r6 = c13821r1M92099U7;
                } else {
                    c28655q2.m87150e0(-451176294);
                    c28655q2.m87173q(false);
                    c13821r6 = c13821r5;
                }
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C16620e(j16));
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                long j114 = j16;
                jM47821G = m47821G(m47846y(interfaceC28601c1), m47841t(interfaceC28601c1M87238F).getScrollSize());
                i36 = (int) (jM47821G >> 32);
                fMo734f0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u8)).mo734f0(Float.intBitsToFloat(i36)) - fM3386h7;
                float f19 = fMo734f0 + fM3386h7;
                c18204h = new C18204h((((long) Float.floatToRawIntBits(c13821r6.f49318a.m87024x())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jM47821G, m47846y(interfaceC28601c1), 0.0f, 8, null);
                interfaceC18203gM52259a = AbstractC18199c.m52259a(c18198b2, m47841t(interfaceC28601c1M87238F), c28655q2, (i35 >> 9) & 14);
                C18198b c18198b11 = c18198b2;
                c16980a = new C16980a(m47841t(interfaceC28601c1M87238F).getPlaneState(), 0.0f, 2, null);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                Boolean bool7 = Boolean.TRUE;
                zM87153g = c28655q2.m87153g(c13821r6);
                objM87133R6 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, bool7);
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    if (interfaceC11732a4 == null) {
                        interfaceC11732a5 = InterfaceC11732a.b.f37977a;
                    } else {
                        interfaceC11732a5 = interfaceC11732a4;
                    }
                    objM87133R7 = AbstractC28683x.m87272z(interfaceC11732a5);
                    c28655q2.m87172p0(objM87133R7);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R7;
                c14147i = new C14147i();
                it = m47841t(interfaceC28601c1M87238F).m47857e().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((AbstractC21394b) next) instanceof AbstractC21394b.d));
                if (((AbstractC21394b) next) != null) {
                    c2307m = c2307m2;
                } else {
                    c2307m = C2299e.f9104G;
                }
                zM87157i2 = c28655q2.m87157i(c16980a);
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                }
                Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, AbstractC1131a.m3500d(modifier2, (Function1) objM87133R8));
                zM87153g2 = c28655q2.m87153g(strM21274h);
                objM87133R9 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R9 = new Function1() { // from class: h71.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                        }
                    };
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new Function1() { // from class: h71.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                        }
                    };
                    c28655q2.m87172p0(objM87133R9);
                }
                Modifier modifierM51775c7 = AbstractC18032n.m51775c(modifierM3407d7, false, (Function1) objM87133R9);
                modifier4 = modifier2;
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                InterfaceC22973k1 interfaceC22973k10 = interfaceC22973k3;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM51775c7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i112 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i112, c22994r1M66759a7);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m19);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i113 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i113, modifierM118962N19);
                    startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                    if (startVerticalAxis == null) {
                        c28655q2.m87150e0(-407325064);
                        z13 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z13 = false;
                        c28655q2.m87150e0(-407325063);
                        c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3406c13 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k10, AbstractC1102d.m3424u(f19, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                    zM87157i3 = c28655q2.m87157i(state);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    Modifier modifierM3500d13 = AbstractC1131a.m3500d(modifierM3406c13, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifierM3500d13);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i112, interfaceC39127r0M66763d13);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i113, modifierM118962N110);
                    if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                        c28655q2.m87150e0(754505911);
                        C16618c c16618cM47799b13 = c16980a.m47799b();
                        C16618c c16618cM47801d13 = c16980a.m47801d();
                        List<InterfaceC11257r> listM7782O13 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                        boolean dimContentOnScrub13 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                        InterfaceC11732a interfaceC11732a18 = (InterfaceC11732a) interfaceC28601c4.getValue();
                        boolean zM87153g15 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                        if ((i35 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87153g15 | z14;
                        objM87133R11 = c28655q2.m87133R();
                        if (z15) {
                            final C13821r1 c13821r1110 = c13821r6;
                            objM87133R11 = new Function1() { // from class: h71.b
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC16990g.m47843v(c13821r1110, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                }
                            };
                            c16980a2 = c16980a;
                            interfaceC28601c5 = interfaceC28601c1M87238F;
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            final C13821r1 c13821r1111 = c13821r6;
                            objM87133R11 = new Function1() { // from class: h71.b
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC16990g.m47843v(c13821r1111, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                                }
                            };
                            c16980a2 = c16980a;
                            interfaceC28601c5 = interfaceC28601c1M87238F;
                            c28655q2.m87172p0(objM87133R11);
                        }
                        c16992i5 = c16992i4;
                        modifier5 = modifier4;
                        function8 = function6;
                        AbstractC11245f.m30353d(c16618cM47799b13, c16618cM47801d13, interfaceC11732a18, listM7782O13, (Function1) objM87133R11, 400L, dimContentOnScrub13, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                            }
                        }), c28655q2, 12779520, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    } else {
                        function7 = function7;
                        c28655q = c28655q2;
                        modifier5 = modifier4;
                        function8 = function6;
                        c16992i5 = c16992i4;
                        c28655q.m87150e0(756326696);
                        m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    c13821r2 = c13821r5;
                    function5 = function7;
                    modifier3 = modifier5;
                    function4 = function8;
                    c16992i3 = c16992i5;
                    interfaceC11732a2 = interfaceC11732a4;
                    j14 = j114;
                    interfaceC22973k2 = interfaceC22973k10;
                    c18198b3 = c18198b11;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                C0209i c0209i114 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i114, modifierM118962N19);
                startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                if (startVerticalAxis == null) {
                    c28655q2.m87150e0(-407325064);
                    z13 = false;
                    c28655q2.m87173q(false);
                } else {
                    z13 = false;
                    c28655q2.m87150e0(-407325063);
                    c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3406c14 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k10, AbstractC1102d.m3424u(f19, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                zM87157i3 = c28655q2.m87157i(state);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i3) {
                    objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                    c28655q2.m87172p0(objM87133R10);
                }
                Modifier modifierM3500d14 = AbstractC1131a.m3500d(modifierM3406c14, (Function1) objM87133R10);
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifierM3500d14);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i112, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m111);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i114, modifierM118962N111);
                if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                    c28655q2.m87150e0(754505911);
                    C16618c c16618cM47799b14 = c16980a.m47799b();
                    C16618c c16618cM47801d14 = c16980a.m47801d();
                    List<InterfaceC11257r> listM7782O14 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                    boolean dimContentOnScrub14 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                    InterfaceC11732a interfaceC11732a19 = (InterfaceC11732a) interfaceC28601c4.getValue();
                    boolean zM87153g16 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                    if ((i35 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87153g16 | z14;
                    objM87133R11 = c28655q2.m87133R();
                    if (z15) {
                        final C13821r1 c13821r1112 = c13821r6;
                        objM87133R11 = new Function1() { // from class: h71.b
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47843v(c13821r1112, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                            }
                        };
                        c16980a2 = c16980a;
                        interfaceC28601c5 = interfaceC28601c1M87238F;
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        final C13821r1 c13821r1113 = c13821r6;
                        objM87133R11 = new Function1() { // from class: h71.b
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47843v(c13821r1113, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                            }
                        };
                        c16980a2 = c16980a;
                        interfaceC28601c5 = interfaceC28601c1M87238F;
                        c28655q2.m87172p0(objM87133R11);
                    }
                    c16992i5 = c16992i4;
                    modifier5 = modifier4;
                    function8 = function6;
                    AbstractC11245f.m30353d(c16618cM47799b14, c16618cM47801d14, interfaceC11732a19, listM7782O14, (Function1) objM87133R11, 400L, dimContentOnScrub14, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, 12779520, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    function7 = function7;
                    c28655q = c28655q2;
                    modifier5 = modifier4;
                    function8 = function6;
                    c16992i5 = c16992i4;
                    c28655q.m87150e0(756326696);
                    m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                c13821r2 = c13821r5;
                function5 = function7;
                modifier3 = modifier5;
                function4 = function8;
                c16992i3 = c16992i5;
                interfaceC11732a2 = interfaceC11732a4;
                j14 = j114;
                interfaceC22973k2 = interfaceC22973k10;
                c18198b3 = c18198b11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function4 = function2;
                modifier3 = modifier2;
                c16992i3 = c16992i2;
                function5 = function3;
                c18198b3 = c18198b2;
                j14 = j13;
                c13821r2 = c13821r1;
                interfaceC22973k2 = interfaceC22973k1;
                interfaceC11732a2 = interfaceC11732a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16987d(modifier3, state, c16992i3, c18198b3, j14, function5, c13821r2, interfaceC22973k2, interfaceC11732a2, function4, i13, i14);
            }
        }
        i15 |= 805306368;
        if ((i15 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            i34 = i13 & 1;
            c2314t = C2314t.f9131w;
            c28676v0 = C28635l.f115821a;
            c2757l = null;
            objArr = 0;
            if (i34 != 0) {
                if (i38 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    c18198b4 = new C18198b();
                    i15 &= -7169;
                } else {
                    c18198b4 = c18198b2;
                }
                if (i44 != 0) {
                    j15 = 0;
                } else {
                    j15 = j13;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16513l0(24);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                }
                if (i18 != 0) {
                    c13821r3 = null;
                } else {
                    c13821r3 = c13821r1;
                }
                if (i24 != 0) {
                    interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                } else {
                    interfaceC22973k1M3379a = interfaceC22973k1;
                }
                if (i26 != 0) {
                    interfaceC11732a3 = null;
                } else {
                    interfaceC11732a3 = interfaceC11732a;
                }
                interfaceC11732a4 = interfaceC11732a3;
                if (i28 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C16513l0(25);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function6 = (Function1) objM87133R;
                } else {
                    c18198b4 = c18198b4;
                    function6 = function2;
                }
                c16992i4 = c16992i2;
                c13821r4 = c13821r3;
                i35 = i15;
                j16 = j15;
                interfaceC22973k3 = interfaceC22973k1M3379a;
                c18198b2 = c18198b4;
            } else {
                if (i38 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    c16992i2 = new C16992i(c2757l, 1, objArr == true ? 1 : 0);
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    c18198b4 = new C18198b();
                    i15 &= -7169;
                } else {
                    c18198b4 = c18198b2;
                }
                if (i44 != 0) {
                    j15 = 0;
                } else {
                    j15 = j13;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16513l0(24);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                }
                if (i18 != 0) {
                    c13821r3 = null;
                } else {
                    c13821r3 = c13821r1;
                }
                if (i24 != 0) {
                    interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                } else {
                    interfaceC22973k1M3379a = interfaceC22973k1;
                }
                if (i26 != 0) {
                    interfaceC11732a3 = null;
                } else {
                    interfaceC11732a3 = interfaceC11732a;
                }
                interfaceC11732a4 = interfaceC11732a3;
                if (i28 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C16513l0(25);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function6 = (Function1) objM87133R;
                } else {
                    c18198b4 = c18198b4;
                    function6 = function2;
                }
                c16992i4 = c16992i2;
                c13821r4 = c13821r3;
                i35 = i15;
                j16 = j15;
                interfaceC22973k3 = interfaceC22973k1M3379a;
                c18198b2 = c18198b4;
            }
            c28655q2.m87175r();
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(state, c28655q2);
            c13821r5 = c13821r4;
            function7 = function3;
            strM21274h = AbstractC8693b.m21274h(m47841t(interfaceC28601c1M87238F).getAccessibilityLabel(), c28655q2, 0);
            EnumC39181m enumC39181m8 = (EnumC39181m) c28655q2.m87161k(AbstractC2453v1.f9575n);
            float fM3386h8 = AbstractC1099a.m3386h(interfaceC22973k3, enumC39181m8) + AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m8);
            C28674u2 c28674u9 = AbstractC2453v1.f9569h;
            fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u9)).mo743q0(AbstractC1099a.m3387i(interfaceC22973k3, enumC39181m8));
            if (c13821r5 == null) {
                c28655q2.m87150e0(-451175829);
                C13821r1 c13821r1M92099U8 = AbstractC30060g.m92099U(0, c28655q2, 1);
                c28655q2.m87173q(false);
                c13821r6 = c13821r1M92099U8;
            } else {
                c28655q2.m87150e0(-451176294);
                c28655q2.m87173q(false);
                c13821r6 = c13821r5;
            }
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(new C16620e(j16));
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
            long j115 = j16;
            jM47821G = m47821G(m47846y(interfaceC28601c1), m47841t(interfaceC28601c1M87238F).getScrollSize());
            i36 = (int) (jM47821G >> 32);
            fMo734f0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u9)).mo734f0(Float.intBitsToFloat(i36)) - fM3386h8;
            float f110 = fMo734f0 + fM3386h8;
            c18204h = new C18204h((((long) Float.floatToRawIntBits(c13821r6.f49318a.m87024x())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jM47821G, m47846y(interfaceC28601c1), 0.0f, 8, null);
            interfaceC18203gM52259a = AbstractC18199c.m52259a(c18198b2, m47841t(interfaceC28601c1M87238F), c28655q2, (i35 >> 9) & 14);
            C18198b c18198b12 = c18198b2;
            c16980a = new C16980a(m47841t(interfaceC28601c1M87238F).getPlaneState(), 0.0f, 2, null);
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R4);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q2.m87172p0(objM87133R5);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
            Boolean bool8 = Boolean.TRUE;
            zM87153g = c28655q2.m87153g(c13821r6);
            objM87133R6 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                c28655q2.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new a(interfaceC28601c2, c13821r6, null);
                c28655q2.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, bool8);
            objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                if (interfaceC11732a4 == null) {
                    interfaceC11732a5 = InterfaceC11732a.b.f37977a;
                } else {
                    interfaceC11732a5 = interfaceC11732a4;
                }
                objM87133R7 = AbstractC28683x.m87272z(interfaceC11732a5);
                c28655q2.m87172p0(objM87133R7);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R7;
            c14147i = new C14147i();
            it = m47841t(interfaceC28601c1M87238F).m47857e().iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((AbstractC21394b) next) instanceof AbstractC21394b.d));
            if (((AbstractC21394b) next) != null) {
                c2307m = c2307m2;
            } else {
                c2307m = C2299e.f9104G;
            }
            zM87157i2 = c28655q2.m87157i(c16980a);
            objM87133R8 = c28655q2.m87133R();
            if (zM87157i2) {
                objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new C16574h(3, c16980a, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R8);
            }
            Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, AbstractC1131a.m3500d(modifier2, (Function1) objM87133R8));
            zM87153g2 = c28655q2.m87153g(strM21274h);
            objM87133R9 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R9 = new Function1() { // from class: h71.a
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                    }
                };
                c28655q2.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new Function1() { // from class: h71.a
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC16990g.m47840s(strM21274h, (InterfaceC18044z) obj);
                    }
                };
                c28655q2.m87172p0(objM87133R9);
            }
            Modifier modifierM51775c8 = AbstractC18032n.m51775c(modifierM3407d8, false, (Function1) objM87133R9);
            modifier4 = modifier2;
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            InterfaceC22973k1 interfaceC22973k11 = interfaceC22973k3;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM51775c8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i115 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i115, c22994r1M66759a8);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m112);
            c0209i2 = C0217k.f732j;
            if (c28655q2.f115903S) {
                c0209i3 = c0209i;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i116 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i116, modifierM118962N112);
                startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
                if (startVerticalAxis == null) {
                    c28655q2.m87150e0(-407325064);
                    z13 = false;
                    c28655q2.m87173q(false);
                } else {
                    z13 = false;
                    c28655q2.m87150e0(-407325063);
                    c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3406c15 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k11, AbstractC1102d.m3424u(f110, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
                zM87157i3 = c28655q2.m87157i(state);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i3) {
                    objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                    c28655q2.m87172p0(objM87133R10);
                }
                Modifier modifierM3500d15 = AbstractC1131a.m3500d(modifierM3406c15, (Function1) objM87133R10);
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, modifierM3500d15);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i115, interfaceC39127r0M66763d15);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m113);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i116, modifierM118962N113);
                if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                    c28655q2.m87150e0(754505911);
                    C16618c c16618cM47799b15 = c16980a.m47799b();
                    C16618c c16618cM47801d15 = c16980a.m47801d();
                    List<InterfaceC11257r> listM7782O15 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                    boolean dimContentOnScrub15 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                    InterfaceC11732a interfaceC11732a110 = (InterfaceC11732a) interfaceC28601c4.getValue();
                    boolean zM87153g17 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                    if ((i35 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87153g17 | z14;
                    objM87133R11 = c28655q2.m87133R();
                    if (z15) {
                        final C13821r1 c13821r1114 = c13821r6;
                        objM87133R11 = new Function1() { // from class: h71.b
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47843v(c13821r1114, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                            }
                        };
                        c16980a2 = c16980a;
                        interfaceC28601c5 = interfaceC28601c1M87238F;
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        final C13821r1 c13821r1115 = c13821r6;
                        objM87133R11 = new Function1() { // from class: h71.b
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC16990g.m47843v(c13821r1115, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                            }
                        };
                        c16980a2 = c16980a;
                        interfaceC28601c5 = interfaceC28601c1M87238F;
                        c28655q2.m87172p0(objM87133R11);
                    }
                    c16992i5 = c16992i4;
                    modifier5 = modifier4;
                    function8 = function6;
                    AbstractC11245f.m30353d(c16618cM47799b15, c16618cM47801d15, interfaceC11732a110, listM7782O15, (Function1) objM87133R11, 400L, dimContentOnScrub15, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, 12779520, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    function7 = function7;
                    c28655q = c28655q2;
                    modifier5 = modifier4;
                    function8 = function6;
                    c16992i5 = c16992i4;
                    c28655q.m87150e0(756326696);
                    m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                c13821r2 = c13821r5;
                function5 = function7;
                modifier3 = modifier5;
                function4 = function8;
                c16992i3 = c16992i5;
                interfaceC11732a2 = interfaceC11732a4;
                j14 = j115;
                interfaceC22973k2 = interfaceC22973k11;
                c18198b3 = c18198b12;
            } else {
                c0209i3 = c0209i;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
            C0209i c0209i117 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i117, modifierM118962N112);
            startVerticalAxis = m47841t(interfaceC28601c1M87238F).getPlaneState().getStartVerticalAxis();
            if (startVerticalAxis == null) {
                c28655q2.m87150e0(-407325064);
                z13 = false;
                c28655q2.m87173q(false);
            } else {
                z13 = false;
                c28655q2.m87150e0(-407325063);
                c14147i.m40313R(startVerticalAxis, c16980a, c28655q2, 0);
                c28655q2.m87173q(false);
            }
            Modifier modifierM3406c16 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3393o(interfaceC22973k11, AbstractC1102d.m3424u(f110, AbstractC30060g.m92100V(c2314t, c13821r6, true, z13))));
            zM87157i3 = c28655q2.m87157i(state);
            objM87133R10 = c28655q2.m87133R();
            if (zM87157i3) {
                objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                c28655q2.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new C13412g(state, interfaceC28601c3, interfaceC28601c2, 23);
                c28655q2.m87172p0(objM87133R10);
            }
            Modifier modifierM3500d16 = AbstractC1131a.m3500d(modifierM3406c16, (Function1) objM87133R10);
            InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
            Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifierM3500d16);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i115, interfaceC39127r0M66763d16);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m114);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i117, modifierM118962N114);
            if (m47841t(interfaceC28601c1M87238F).getPlaneState().getScrubberEnabled()) {
                c28655q2.m87150e0(754505911);
                C16618c c16618cM47799b16 = c16980a.m47799b();
                C16618c c16618cM47801d16 = c16980a.m47801d();
                List<InterfaceC11257r> listM7782O16 = AbstractC2756k.m7782O(m47841t(interfaceC28601c1M87238F).m47857e());
                boolean dimContentOnScrub16 = m47841t(interfaceC28601c1M87238F).getPlaneState().getDimContentOnScrub();
                InterfaceC11732a interfaceC11732a111 = (InterfaceC11732a) interfaceC28601c4.getValue();
                boolean zM87153g18 = c28655q2.m87153g(c13821r6) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c16980a) | c28655q2.m87147d(fMo743q0);
                if ((i35 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87153g18 | z14;
                objM87133R11 = c28655q2.m87133R();
                if (z15) {
                    final C13821r1 c13821r1116 = c13821r6;
                    objM87133R11 = new Function1() { // from class: h71.b
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC16990g.m47843v(c13821r1116, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                        }
                    };
                    c16980a2 = c16980a;
                    interfaceC28601c5 = interfaceC28601c1M87238F;
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    final C13821r1 c13821r1117 = c13821r6;
                    objM87133R11 = new Function1() { // from class: h71.b
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC16990g.m47843v(c13821r1117, c16980a, fMo743q0, interfaceC28601c4, function7, interfaceC28601c1, interfaceC28601c1M87238F, (InterfaceC11732a) obj);
                        }
                    };
                    c16980a2 = c16980a;
                    interfaceC28601c5 = interfaceC28601c1M87238F;
                    c28655q2.m87172p0(objM87133R11);
                }
                c16992i5 = c16992i4;
                modifier5 = modifier4;
                function8 = function6;
                AbstractC11245f.m30353d(c16618cM47799b16, c16618cM47801d16, interfaceC11732a111, listM7782O16, (Function1) objM87133R11, 400L, dimContentOnScrub16, AbstractC37817c.m121344e(253736946, c28655q2, new InterfaceC4351m() { // from class: h71.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC16990g.m47844w(fMo734f0, c2307m, modifier5, function8, interfaceC18203gM52259a, c16992i5, c18204h, c16980a2, jM47821G, interfaceC28601c5, (Composer) obj, iIntValue);
                    }
                }), c28655q2, 12779520, 0);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                function7 = function7;
                c28655q = c28655q2;
                modifier5 = modifier4;
                function8 = function6;
                c16992i5 = c16992i4;
                c28655q.m87150e0(756326696);
                m47831j(fMo734f0, c2307m, m47841t(interfaceC28601c1M87238F).m47857e(), modifier5, function6, interfaceC18203gM52259a, c16992i4, c18204h, true, c16980a.m47798a(), Float.intBitsToFloat(i36), c28655q, ((i35 << 9) & 7168) | 100663296 | ((i35 >> 15) & 57344) | ((i35 << 12) & 3670016), 0, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            c13821r2 = c13821r5;
            function5 = function7;
            modifier3 = modifier5;
            function4 = function8;
            c16992i3 = c16992i5;
            interfaceC11732a2 = interfaceC11732a4;
            j14 = j115;
            interfaceC22973k2 = interfaceC22973k11;
            c18198b3 = c18198b12;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function4 = function2;
            modifier3 = modifier2;
            c16992i3 = c16992i2;
            function5 = function3;
            c18198b3 = c18198b2;
            j14 = j13;
            c13821r2 = c13821r1;
            interfaceC22973k2 = interfaceC22973k1;
            interfaceC11732a2 = interfaceC11732a;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16987d(modifier3, state, c16992i3, c18198b3, j14, function5, c13821r2, interfaceC22973k2, interfaceC11732a2, function4, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m47834m(C16995l it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m47835n(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m47836o(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: p */
    private static final boolean m47837p(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    private static final void m47838q(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m47839r(C16980a c16980a, InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        m47847z(interfaceC28601c1, m47820F(AbstractC35744b.m113239l(it.mo3541n()), c16980a));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m47840s(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final C16993j m47841t(InterfaceC28670t2 interfaceC28670t2) {
        return (C16993j) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m47842u(C16993j c16993j, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        if (((int) (it.mo3541n() >> 32)) > 0 && c16993j.getPlaneState().getInitiallyScrolledToEnd() && m47837p(interfaceC28601c1)) {
            m47836o(interfaceC28601c2, true);
            m47838q(interfaceC28601c1, false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m47843v(C13821r1 c13821r1, C16980a c16980a, float f13, InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28670t2 interfaceC28670t2, InterfaceC11732a event) {
        AbstractC22676k.m65750j(event, "event");
        C16995l c16995l = new C16995l(event, new C18204h((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(c13821r1.f49318a.m87024x()) << 32), m47821G(m47846y(interfaceC28601c2), m47841t(interfaceC28670t2).getScrollSize()), m47846y(interfaceC28601c2), 0.0f, 8, null), c16980a.m47801d(), c16980a.getStartVerticalAxisSize(), f13);
        interfaceC28601c1.setValue(c16995l.getDataScrubEvent());
        function1.invoke(c16995l);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m47844w(float f13, InterfaceC2302h interfaceC2302h, Modifier modifier, Function1 function1, InterfaceC18203g interfaceC18203g, C16992i c16992i, C18204h c18204h, C16980a c16980a, long j7, InterfaceC28670t2 interfaceC28670t2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m47831j(f13, interfaceC2302h, m47841t(interfaceC28670t2).m47857e(), modifier, function1, interfaceC18203g, c16992i, c18204h, false, c16980a.m47798a(), Float.intBitsToFloat((int) (j7 >> 32)), c28655q, 100663296, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m47845x(Modifier modifier, C16993j c16993j, C16992i c16992i, C18198b c18198b, long j7, Function1 function1, C13821r1 c13821r1, InterfaceC22973k1 interfaceC22973k1, InterfaceC11732a interfaceC11732a, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m47833l(modifier, c16993j, c16992i, c18198b, j7, function1, c13821r1, interfaceC22973k1, interfaceC11732a, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final long m47846y(InterfaceC28601c1 interfaceC28601c1) {
        return ((C16620e) interfaceC28601c1.getValue()).f63951a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m47847z(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(new C16620e(j7));
    }
}
