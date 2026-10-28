package j51;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.EnumC2888c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io2.C20769k0;
import j93.AbstractC21478l0;
import kd1.AbstractC22404p;
import l83.C23454a0;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11347e2;
import p163g1.AbstractC15005f3;
import p181h2.C16620e;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17891j;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: j51.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006&²\u0006\u000e\u0010\u001f\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u00178\n@\nX\u008a\u008e\u0002²\u0006\f\u0010!\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u00020#8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lj51/g;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "d", "(Lj51/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lj51/b;", "footer", "o", "(Lj51/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lgz0/m0;", "icon", "Ly81/f;", "t", "(Lgz0/m0;)Ly81/f;", "Li2/x;", "s", "(Lgz0/m0;Landroidx/compose/runtime/Composer;I)J", "", "segmentIndex", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lj51/g;I)J", "", "v", "(Lj51/g;F)J", "start", "end", "fraction", "u", "(JJF)J", "highlightPosition", "animatedTarget", "animatedPercent", "fadeAlpha", "Ly3/f;", "slideUpOffset", "slideDownOffset", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21338f {

    /* JADX INFO: renamed from: j51.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.challengeprogressgauge.ChallengeProgressGaugeKt$ChallengeProgressGauge$1$1", m100430f = "ChallengeProgressGauge.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28690z0 f81573E;

        /* JADX INFO: renamed from: w */
        int f81574w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f81575x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21339g f81576y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28690z0 f81577z;

        /* JADX INFO: renamed from: j51.f$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.challengeprogressgauge.ChallengeProgressGaugeKt$ChallengeProgressGauge$1$1$1", m100430f = "ChallengeProgressGauge.kt", m100431l = {85}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41829a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f81578w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21339g f81579x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28690z0 f81580y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41829a(C21339g c21339g, InterfaceC28690z0 interfaceC28690z0, InterfaceC30057d<? super C41829a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f81579x = c21339g;
                this.f81580y = interfaceC28690z0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: h */
            public static final C23454a0 m59915h(InterfaceC28690z0 interfaceC28690z0, float f13, float f14) {
                AbstractC21338f.m59902l(interfaceC28690z0, f13);
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41829a(this.f81579x, this.f81580y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41829a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f81578w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    float fM59926j = (this.f81579x.getHighlightTailLengthPercent() * 3.0f) + 100.0f;
                    C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(this.f81579x.getHighlightDuration(), 0, null, 6);
                    C21337e c21337e = new C21337e(this.f81580y, 0);
                    this.f81578w = 1;
                    if (AbstractC11348f.m30557e(0.0f, fM59926j, c11347e2M30574v, c21337e, this, 4) == enumC31071a) {
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

        /* JADX INFO: renamed from: j51.f$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.challengeprogressgauge.ChallengeProgressGaugeKt$ChallengeProgressGauge$1$1$2", m100430f = "ChallengeProgressGauge.kt", m100431l = {93, 94}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f81581w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21339g f81582x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28690z0 f81583y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C21339g c21339g, InterfaceC28690z0 interfaceC28690z0, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f81582x = c21339g;
                this.f81583y = interfaceC28690z0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: h */
            public static final C23454a0 m59917h(InterfaceC28690z0 interfaceC28690z0, float f13, float f14) {
                AbstractC21338f.m59904n(interfaceC28690z0, f13);
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f81582x, this.f81583y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
            
                if (p077d0.AbstractC11348f.m30557e(0.0f, r5, r6, r7, r10, 4) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r10.f81581w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto L5c
                L10:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L18:
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto L2e
                L1c:
                    p505ts.AbstractC34132o.m107864I(r11)
                    j51.g r11 = r10.f81582x
                    long r4 = r11.getHighlightPauseMillis()
                    r10.f81581w = r3
                    java.lang.Object r11 = bc3.AbstractC3034m0.m8782b(r4, r10)
                    if (r11 != r0) goto L2e
                    goto L5b
                L2e:
                    j51.g r11 = r10.f81582x
                    float r11 = r11.getPercentValue()
                    r1 = 0
                    r3 = 1120403456(0x42c80000, float:100.0)
                    float r5 = e93.AbstractC12889b.m36283m(r11, r1, r3)
                    j51.g r11 = r10.f81582x
                    int r11 = r11.getAnimationDuration()
                    r1 = 0
                    r3 = 6
                    r4 = 0
                    d0.e2 r6 = p077d0.AbstractC11348f.m30574v(r11, r1, r4, r3)
                    p1.z0 r11 = r10.f81583y
                    j51.e r7 = new j51.e
                    r1 = 1
                    r7.<init>(r11, r1)
                    r10.f81581w = r2
                    r4 = 0
                    r9 = 4
                    r8 = r10
                    java.lang.Object r11 = p077d0.AbstractC11348f.m30557e(r4, r5, r6, r7, r8, r9)
                    if (r11 != r0) goto L5c
                L5b:
                    return r0
                L5c:
                    l83.a0 r11 = l83.C23454a0.f92919a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: j51.AbstractC21338f.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21339g c21339g, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81576y = c21339g;
            this.f81577z = interfaceC28690z0;
            this.f81573E = interfaceC28690z1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f81576y, this.f81577z, this.f81573E, interfaceC30057d);
            aVar.f81575x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f81575x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f81574w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f81576y.getIsPreview()) {
                AbstractC21338f.m59902l(this.f81577z, (this.f81576y.getHighlightTailLengthPercent() * 3.0f) + 100.0f);
                AbstractC21338f.m59904n(this.f81573E, AbstractC12889b.m36283m(this.f81576y.getPercentValue(), 0.0f, 100.0f));
            } else {
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C41829a(this.f81576y, this.f81577z, null), 3);
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(this.f81576y, this.f81573E, null), 3);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: j51.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f81584a;

        static {
            int[] iArr = new int[EnumC16313m0.values().length];
            try {
                iArr[EnumC16313m0.TINY_CHECKMARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f81584a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0276  */
    /* JADX WARN: Code duplicated, block: B:104:0x029c  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:110:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:114:0x0308  */
    /* JADX WARN: Code duplicated, block: B:116:0x0310  */
    /* JADX WARN: Code duplicated, block: B:118:0x0333  */
    /* JADX WARN: Code duplicated, block: B:119:0x0337  */
    /* JADX WARN: Code duplicated, block: B:124:0x0352  */
    /* JADX WARN: Code duplicated, block: B:127:0x0389  */
    /* JADX WARN: Code duplicated, block: B:128:0x038d  */
    /* JADX WARN: Code duplicated, block: B:133:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:136:0x0426  */
    /* JADX WARN: Code duplicated, block: B:137:0x0489  */
    /* JADX WARN: Code duplicated, block: B:140:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x050d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0521  */
    /* JADX WARN: Code duplicated, block: B:147:0x0539  */
    /* JADX WARN: Code duplicated, block: B:149:0x0544  */
    /* JADX WARN: Code duplicated, block: B:151:0x0564  */
    /* JADX WARN: Code duplicated, block: B:154:0x056d  */
    /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    /* JADX WARN: Code duplicated, block: B:71:0x018e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0192  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0248  */
    /* JADX WARN: Code duplicated, block: B:92:0x024c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0267  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static final void m59894d(final C21339g state, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        Object objM87133R;
        Object obj;
        final InterfaceC28690z0 interfaceC28690z0;
        Object objM87133R2;
        InterfaceC28690z0 interfaceC28690z1;
        final float fMo743q0;
        final float fMo743q1;
        final float fMo743q2;
        int i16;
        boolean z13;
        Object objM87133R3;
        float fM59903m;
        final InterfaceC28670t2 interfaceC28670t2M30588b;
        boolean z14;
        float f13;
        InterfaceC28670t2 interfaceC28670t2M30588b2;
        float f14;
        InterfaceC28670t2 interfaceC28670t2M30587a;
        float f15;
        InterfaceC28670t2 interfaceC28670t2M30587a2;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean z15;
        boolean zM87153g;
        Object obj2;
        float f16;
        float f17;
        float f18;
        C2305k c2305k;
        int iHashCode2;
        int iHashCode3;
        C28655q c28655q2;
        ?? r10;
        C2314t c2314t2;
        boolean z16;
        int iHashCode4;
        int iHashCode5;
        C38072d c38072d;
        C28655q c28655q3;
        boolean z17;
        C28655q c28655q4;
        C28655q c28655q5;
        boolean z18;
        C28655q c28655q6;
        C21334b c21334bM59923g;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q7 = (C28655q) composer;
        c28655q7.m87154g0(1852404234);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q7.m87153g(state) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q7.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q7.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                objM87133R = c28655q7.m87133R();
                obj = C28635l.f115821a;
                if (objM87133R == obj) {
                    objM87133R = AbstractC11266d.m30468v(0.0f, c28655q7);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                objM87133R2 = c28655q7.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = AbstractC11266d.m30468v(0.0f, c28655q7);
                }
                interfaceC28690z1 = (InterfaceC28690z0) objM87133R2;
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q7.m87161k(AbstractC2453v1.f9569h);
                fMo743q0 = interfaceC39171c.mo743q0(state.getSegmentWidth());
                fMo743q1 = interfaceC39171c.mo743q0(state.getSegmentHeight());
                fMo743q2 = interfaceC39171c.mo743q0(state.getShadowHeight());
                Float fValueOf = Float.valueOf(state.getPercentValue());
                Boolean boolValueOf = Boolean.valueOf(state.getIsPreview());
                i16 = i15 & 14;
                if (i16 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = c28655q7.m87133R();
                if (z13 || objM87133R3 == obj) {
                    objM87133R3 = new a(state, interfaceC28690z0, interfaceC28690z1, null);
                    c28655q7.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87254h(fValueOf, boolValueOf, (InterfaceC4351m) objM87133R3, c28655q7);
                if (state.getIsPreview()) {
                    fM59903m = AbstractC12889b.m36283m(state.getPercentValue(), 0.0f, 100.0f);
                } else {
                    fM59903m = m59903m(interfaceC28690z1);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(fM59903m, AbstractC11348f.m30574v(0, 0, null, 6), "ChallengeGaugeAnimation", null, c28655q7, 3120, 20);
                if (m59895e(interfaceC28690z0) < 85.0f || state.getIsPreview()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(600, 0, null, 6), "ChallengeGaugeFadeAlpha", null, c28655q7, 3120, 20);
                if (z14) {
                    f14 = 0;
                } else {
                    f14 = 10;
                }
                interfaceC28670t2M30587a = AbstractC11352g.m30587a(f14, AbstractC11348f.m30574v(600, 0, null, 6), "ChallengeGaugeSlideUpOffset", c28655q7, 432, 8);
                if (z14) {
                    f15 = 0;
                } else {
                    f15 = -10;
                }
                interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(f15, AbstractC11348f.m30574v(600, 0, null, 6), "ChallengeGaugeSlideDownOffset", c28655q7, 432, 8);
                Modifier modifierM3415l = AbstractC1102d.m3415l(state.getSize(), modifier3);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q7.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q7, modifierM3415l);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a);
                } else {
                    c28655q7.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                if (i16 == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87153g = z15 | c28655q7.m87153g(interfaceC28670t2M30588b) | c28655q7.m87147d(fMo743q0) | c28655q7.m87147d(fMo743q2) | c28655q7.m87147d(fMo743q1);
                Object objM87133R4 = c28655q7.m87133R();
                if (!zM87153g || objM87133R4 == obj) {
                    f16 = 1.0f;
                    obj2 = new Function1() { // from class: j51.d
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return AbstractC21338f.m59900j(state, interfaceC28670t2M30588b, interfaceC28690z0, fMo743q0, fMo743q2, fMo743q1, (InterfaceC22131e) obj3);
                        }
                    };
                    c28655q7.m87172p0(obj2);
                } else {
                    obj2 = objM87133R4;
                    f16 = 1.0f;
                }
                AbstractC21478l0.m60421a(modifierM3407d, (Function1) obj2, c28655q7, 6);
                f17 = 4;
                f18 = 8;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3407d(f16, c2314t), f17 * f18, 5 * f18);
                c2305k = C2299e.f9111N;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90656g, c2305k, c28655q7, 54);
                iHashCode2 = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q7.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q7, modifierM3395q);
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q7, r6, interfaceC28653p1M87165m2);
                if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N2);
                if (f16 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM124374d = AbstractC38963t7.m124374d(f16, f16, true);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode3 = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q7.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q7, modifierM124374d);
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q7, r6, interfaceC28653p1M87165m3);
                if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q7, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N3);
                if (state.getCenterImage() != null) {
                    c28655q7.m87150e0(-1793103265);
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(state.getCenterImage(), null, null, c28655q7, 0, 3), null, AbstractC34132o.m107879c(m59897g(interfaceC28670t2M30588b2), AbstractC1102d.m3419p(45 * f17, c2314t)), null, C39102j.f168200b, 0.0f, null, c28655q7, 24624, 104);
                    C28655q c28655q8 = c28655q7;
                    c28655q8.m87173q(false);
                    r10 = 0;
                    c2314t2 = c2314t;
                    z16 = true;
                    c28655q6 = c28655q8;
                } else if (state.getCenter() != null) {
                    c28655q2.m87150e0(-1792591331);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q2, 54);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2 = c28655q7;
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2 = c28655q7;
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, r6, interfaceC28653p1M87165m4);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                    C2306l c2306l = C2299e.f9109L;
                    Modifier modifierM107879c = AbstractC34132o.m107879c(m59897g(interfaceC28670t2M30588b2), AbstractC1099a.m3392n(c2314t, 0.0f, m59898h(interfaceC28670t2M30587a), 1));
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q2, 48);
                    iHashCode5 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM107879c);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
                    String strM59883a = state.getCenter().getPrimaryText();
                    c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM59883a, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN2(), null, c28655q2, 0, 0, 196602);
                    c28655q3 = c28655q2;
                    if (state.getCenter().getSecondaryText().length() > 0) {
                        c28655q3.m87150e0(111534222);
                        AbstractC30795n.m94707h(state.getCenter().getSecondaryText(), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f18, 7), c38072d.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getN5(), null, c28655q3, 48, 0, 196600);
                        C28655q c28655q9 = c28655q3;
                        z17 = false;
                        c28655q9.m87173q(false);
                        c28655q4 = c28655q9;
                    } else {
                        z17 = false;
                        c28655q3.m87150e0(111918715);
                        c28655q3.m87173q(false);
                        c28655q4 = c28655q3;
                    }
                    c28655q4.m87173q(true);
                    if (state.getCenterSubtitle().length() > 0) {
                        c28655q4.m87150e0(-502259378);
                        C28655q c28655q10 = c28655q4;
                        boolean z19 = z17;
                        c2314t2 = c2314t;
                        AbstractC30795n.m94707h(state.getCenterSubtitle(), AbstractC34132o.m107879c(m59897g(interfaceC28670t2M30588b2), AbstractC1099a.m3392n(c2314t, 0.0f, m59899i(interfaceC28670t2M30587a2), 1)), c38072d.m121949b(c28655q4, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getH4(), null, c28655q10, 0, 0, 196600);
                        C28655q c28655q11 = c28655q10;
                        c28655q11.m87173q(z19);
                        z18 = z19;
                        c28655q5 = c28655q11;
                    } else {
                        boolean z24 = z17;
                        c2314t2 = r32;
                        c28655q4.m87150e0(-501813505);
                        c28655q4.m87173q(z24);
                        z18 = z24;
                        c28655q5 = c28655q4;
                    }
                    z16 = true;
                    c28655q5.m87173q(true);
                    c28655q5.m87173q(z18);
                    r10 = z18;
                    c28655q6 = c28655q5;
                } else {
                    c28655q2 = c28655q7;
                    r10 = 0;
                    c2314t2 = c2314t;
                    z16 = true;
                    c28655q2.m87150e0(-1790713258);
                    c28655q2.m87173q(false);
                    c28655q6 = c28655q2;
                }
                c28655q6.m87173q(z16);
                c21334bM59923g = state.getFooter();
                if (c21334bM59923g == null) {
                    c28655q6.m87150e0(993619392);
                    c28655q6.m87173q(r10);
                } else {
                    c28655q6.m87150e0(993619393);
                    m59905o(c21334bM59923g, AbstractC34132o.m107879c(m59897g(interfaceC28670t2M30588b2), c2314t2), c28655q6, r10, r10);
                    c28655q6.m87173q(r10);
                }
                c28655q6.m87173q(true);
                c28655q6.m87173q(true);
                modifier2 = modifier3;
                c28655q = c28655q6;
            } else {
                c28655q7.m87138X();
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20769k0(state, i13, modifier2, i14, 1);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q7.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            objM87133R = c28655q7.m87133R();
            obj = C28635l.f115821a;
            if (objM87133R == obj) {
                objM87133R = AbstractC11266d.m30468v(0.0f, c28655q7);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
            objM87133R2 = c28655q7.m87133R();
            if (objM87133R2 == obj) {
                objM87133R2 = AbstractC11266d.m30468v(0.0f, c28655q7);
            }
            interfaceC28690z1 = (InterfaceC28690z0) objM87133R2;
            InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q7.m87161k(AbstractC2453v1.f9569h);
            fMo743q0 = interfaceC39171c2.mo743q0(state.getSegmentWidth());
            fMo743q1 = interfaceC39171c2.mo743q0(state.getSegmentHeight());
            fMo743q2 = interfaceC39171c2.mo743q0(state.getShadowHeight());
            Float fValueOf2 = Float.valueOf(state.getPercentValue());
            Boolean boolValueOf2 = Boolean.valueOf(state.getIsPreview());
            i16 = i15 & 14;
            if (i16 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R3 = c28655q7.m87133R();
            if (z13) {
                objM87133R3 = new a(state, interfaceC28690z0, interfaceC28690z1, null);
                c28655q7.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new a(state, interfaceC28690z0, interfaceC28690z1, null);
                c28655q7.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87254h(fValueOf2, boolValueOf2, (InterfaceC4351m) objM87133R3, c28655q7);
            if (state.getIsPreview()) {
                fM59903m = AbstractC12889b.m36283m(state.getPercentValue(), 0.0f, 100.0f);
            } else {
                fM59903m = m59903m(interfaceC28690z1);
            }
            interfaceC28670t2M30588b = AbstractC11352g.m30588b(fM59903m, AbstractC11348f.m30574v(0, 0, null, 6), "ChallengeGaugeAnimation", null, c28655q7, 3120, 20);
            if (m59895e(interfaceC28690z0) < 85.0f) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (z14) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(600, 0, null, 6), "ChallengeGaugeFadeAlpha", null, c28655q7, 3120, 20);
            if (z14) {
                f14 = 0;
            } else {
                f14 = 10;
            }
            interfaceC28670t2M30587a = AbstractC11352g.m30587a(f14, AbstractC11348f.m30574v(600, 0, null, 6), "ChallengeGaugeSlideUpOffset", c28655q7, 432, 8);
            if (z14) {
                f15 = 0;
            } else {
                f15 = -10;
            }
            interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(f15, AbstractC11348f.m30574v(600, 0, null, 6), "ChallengeGaugeSlideDownOffset", c28655q7, 432, 8);
            Modifier modifierM3415l2 = AbstractC1102d.m3415l(state.getSize(), modifier3);
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q7.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q7, modifierM3415l2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(interfaceC4339a);
            } else {
                c28655q7.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC39127r0M66763d3);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m6);
            c0209i3 = C0217k.f732j;
            if (c28655q7.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N6);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            if (i16 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87153g = z15 | c28655q7.m87153g(interfaceC28670t2M30588b) | c28655q7.m87147d(fMo743q0) | c28655q7.m87147d(fMo743q2) | c28655q7.m87147d(fMo743q1);
            Object objM87133R5 = c28655q7.m87133R();
            if (zM87153g) {
                f16 = 1.0f;
                obj2 = new Function1() { // from class: j51.d
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return AbstractC21338f.m59900j(state, interfaceC28670t2M30588b, interfaceC28690z0, fMo743q0, fMo743q2, fMo743q1, (InterfaceC22131e) obj3);
                    }
                };
                c28655q7.m87172p0(obj2);
            } else {
                f16 = 1.0f;
                obj2 = new Function1() { // from class: j51.d
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return AbstractC21338f.m59900j(state, interfaceC28670t2M30588b, interfaceC28690z0, fMo743q0, fMo743q2, fMo743q1, (InterfaceC22131e) obj3);
                    }
                };
                c28655q7.m87172p0(obj2);
            }
            AbstractC21478l0.m60421a(modifierM3407d2, (Function1) obj2, c28655q7, 6);
            f17 = 4;
            f18 = 8;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(f16, c2314t), f17 * f18, 5 * f18);
            c2305k = C2299e.f9111N;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90656g, c2305k, c28655q7, 54);
            iHashCode2 = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q7.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q7, modifierM3395q2);
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(interfaceC4339a);
            } else {
                c28655q7.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q7, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q7, r6, interfaceC28653p1M87165m7);
            if (c28655q7.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N7);
            if (f16 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM124374d2 = AbstractC38963t7.m124374d(f16, f16, true);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode3 = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q7.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q7, modifierM124374d2);
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(interfaceC4339a);
            } else {
                c28655q7.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q7, r6, interfaceC28653p1M87165m8);
            if (c28655q7.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q7, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q7, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N8);
            if (state.getCenterImage() != null) {
                c28655q7.m87150e0(-1793103265);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(state.getCenterImage(), null, null, c28655q7, 0, 3), null, AbstractC34132o.m107879c(m59897g(interfaceC28670t2M30588b2), AbstractC1102d.m3419p(45 * f17, c2314t)), null, C39102j.f168200b, 0.0f, null, c28655q7, 24624, 104);
                C28655q c28655q12 = c28655q7;
                c28655q12.m87173q(false);
                r10 = 0;
                c2314t2 = c2314t;
                z16 = true;
                c28655q6 = c28655q12;
            } else if (state.getCenter() != null) {
                c28655q2.m87150e0(-1792591331);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q2, 54);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2 = c28655q7;
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2 = c28655q7;
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q2, r6, interfaceC28653p1M87165m9);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N9);
                C2306l c2306l2 = C2299e.f9109L;
                Modifier modifierM107879c2 = AbstractC34132o.m107879c(m59897g(interfaceC28670t2M30588b2), AbstractC1099a.m3392n(c2314t, 0.0f, m59898h(interfaceC28670t2M30587a), 1));
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q2, 48);
                iHashCode5 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM107879c2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m10);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N10);
                String strM59883a2 = state.getCenter().getPrimaryText();
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM59883a2, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN2(), null, c28655q2, 0, 0, 196602);
                c28655q3 = c28655q2;
                if (state.getCenter().getSecondaryText().length() > 0) {
                    c28655q3.m87150e0(111534222);
                    AbstractC30795n.m94707h(state.getCenter().getSecondaryText(), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f18, 7), c38072d.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getN5(), null, c28655q3, 48, 0, 196600);
                    C28655q c28655q13 = c28655q3;
                    z17 = false;
                    c28655q13.m87173q(false);
                    c28655q4 = c28655q13;
                } else {
                    z17 = false;
                    c28655q3.m87150e0(111918715);
                    c28655q3.m87173q(false);
                    c28655q4 = c28655q3;
                }
                c28655q4.m87173q(true);
                if (state.getCenterSubtitle().length() > 0) {
                    c28655q4.m87150e0(-502259378);
                    C28655q c28655q14 = c28655q4;
                    boolean z110 = z17;
                    c2314t2 = c2314t;
                    AbstractC30795n.m94707h(state.getCenterSubtitle(), AbstractC34132o.m107879c(m59897g(interfaceC28670t2M30588b2), AbstractC1099a.m3392n(c2314t, 0.0f, m59899i(interfaceC28670t2M30587a2), 1)), c38072d.m121949b(c28655q4, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getH4(), null, c28655q14, 0, 0, 196600);
                    C28655q c28655q15 = c28655q14;
                    c28655q15.m87173q(z110);
                    z18 = z110;
                    c28655q5 = c28655q15;
                } else {
                    boolean z25 = z17;
                    c2314t2 = r32;
                    c28655q4.m87150e0(-501813505);
                    c28655q4.m87173q(z25);
                    z18 = z25;
                    c28655q5 = c28655q4;
                }
                z16 = true;
                c28655q5.m87173q(true);
                c28655q5.m87173q(z18);
                r10 = z18;
                c28655q6 = c28655q5;
            } else {
                c28655q2 = c28655q7;
                r10 = 0;
                c2314t2 = c2314t;
                z16 = true;
                c28655q2.m87150e0(-1790713258);
                c28655q2.m87173q(false);
                c28655q6 = c28655q2;
            }
            c28655q6.m87173q(z16);
            c21334bM59923g = state.getFooter();
            if (c21334bM59923g == null) {
                c28655q6.m87150e0(993619392);
                c28655q6.m87173q(r10);
            } else {
                c28655q6.m87150e0(993619393);
                m59905o(c21334bM59923g, AbstractC34132o.m107879c(m59897g(interfaceC28670t2M30588b2), c2314t2), c28655q6, r10, r10);
                c28655q6.m87173q(r10);
            }
            c28655q6.m87173q(true);
            c28655q6.m87173q(true);
            modifier2 = modifier3;
            c28655q = c28655q6;
        } else {
            c28655q7.m87138X();
            c28655q = c28655q7;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(state, i13, modifier2, i14, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final float m59895e(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: renamed from: f */
    private static final float m59896f(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: g */
    private static final float m59897g(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: h */
    private static final float m59898h(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: i */
    private static final float m59899i(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m59900j(C21339g c21339g, InterfaceC28670t2 interfaceC28670t2, InterfaceC28690z0 interfaceC28690z0, float f13, float f14, float f15, InterfaceC22131e Canvas) throws Throwable {
        float f16;
        long j7;
        long j13;
        long j14;
        int i13;
        int i14;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        char c3 = ' ';
        float f17 = 2.0f;
        long j15 = 4294967295L;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) / 2.0f)) << 32);
        float fM47212d = C16620e.m47212d(Canvas.mo731d()) / 2.2f;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))) << 32) | (((long) Float.floatToRawIntBits((((float) ((((double) 1) - Math.sin(Math.toRadians(((double) c21339g.getArcSweepAngle()) / 2.0d))) * ((double) fM47212d))) / 2.0f) + Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))) & 4294967295L);
        float fM59919b = c21339g.getArcSweepAngle() / c21339g.getTotalSegments();
        float fM59938v = c21339g.getStartAngle();
        float fM59926j = ((c21339g.getHighlightTailLengthPercent() * 3.0f) / 100.0f) * c21339g.getTotalSegments();
        int iM59896f = (int) ((m59896f(interfaceC28670t2) / 100.0f) * c21339g.getTotalSegments());
        int iM59895e = (int) m59895e(interfaceC28690z0);
        int iM59940x = c21339g.getTotalSegments() - 1;
        if (iM59940x < 0) {
            iM59940x = 0;
        }
        int iM36284n = AbstractC12889b.m36284n(iM59895e, 0, iM59940x);
        int iM59940x2 = c21339g.getTotalSegments();
        int i15 = 0;
        while (i15 < iM59940x2) {
            float f18 = i15;
            float fM59895e = m59895e(interfaceC28690z0);
            float f19 = fM59895e - fM59926j;
            long jM59913w = m59913w(c21339g, i15);
            char c7 = c3;
            float f24 = f17;
            if (f19 > f18 || f18 > fM59895e) {
                f16 = 1.0f;
                j7 = j15;
                if (f18 > m59895e(interfaceC28690z0)) {
                    jM59913w = C17919x.f69636m;
                } else if (i15 >= iM59896f) {
                    jM59913w = c21339g.getInactiveColor();
                }
            } else {
                f16 = 1.0f;
                j7 = j15;
                jM59913w = m59911u(c21339g.getInactiveColor(), m59913w(c21339g, iM36284n), AbstractC12889b.m36283m((f18 - f19) / fM59926j, 0.0f, 1.0f));
            }
            long j16 = jM59913w;
            C0237p c0237pMo744t0 = Canvas.mo744t0();
            long jM670A = c0237pMo744t0.m670A();
            c0237pMo744t0.m716w().mo51426q();
            try {
                ((C0929d) c0237pMo744t0.f812x).m2358v(fM59938v, jFloatToRawIntBits2);
                float fM59939w = (f16 - c21339g.getTaperFactor()) * f13;
                float f25 = fM59938v;
                C17891j c17891jM51478a = AbstractC17897m.m51478a();
                int i16 = iM59940x2;
                int i17 = i15;
                int i18 = (int) (jFloatToRawIntBits2 >> c7);
                float f26 = f13 / f24;
                int i19 = (int) (jFloatToRawIntBits2 & j7);
                try {
                    c17891jM51478a.m51462i(Float.intBitsToFloat(i18) - f26, Float.intBitsToFloat(i19) - fM47212d);
                    c17891jM51478a.m51461h(Float.intBitsToFloat(i18) + f26, Float.intBitsToFloat(i19) - fM47212d);
                    float f27 = fM59939w / f24;
                    c17891jM51478a.m51461h(Float.intBitsToFloat(i18) + f27, (Float.intBitsToFloat(i19) - fM47212d) + f14);
                    c17891jM51478a.m51461h(Float.intBitsToFloat(i18) - f27, (Float.intBitsToFloat(i19) - fM47212d) + f14);
                    c17891jM51478a.m51459f();
                    long j17 = C17919x.f69636m;
                    if (C17919x.m51542d(j16, j17)) {
                        j14 = jM670A;
                        i14 = i18;
                        i13 = i19;
                    } else {
                        try {
                            j14 = jM670A;
                            i13 = i19;
                            i14 = i18;
                            try {
                                InterfaceC22131e.m63378L(Canvas, c17891jM51478a, C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.4f, j16)), new C17919x(j17)), (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i18))) << c7) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i19) - fM47212d)) & j7), (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i18))) << c7) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i19) - fM47212d) + f14)) & j7), 8), 0.0f, null, 60);
                            } catch (Throwable th3) {
                                th = th3;
                                j13 = j14;
                                AbstractC11266d.m30472z(c0237pMo744t0, j13);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            j14 = jM670A;
                        }
                    }
                    int i24 = iM59896f;
                    int i25 = iM36284n;
                    long j18 = jFloatToRawIntBits2;
                    float f28 = fM47212d;
                    InterfaceC22131e.m63383i0(Canvas, j16, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) - f26)) << c7) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i13) - fM47212d) - f15)) & j7), (((long) Float.floatToRawIntBits(f13)) << c7) | (((long) Float.floatToRawIntBits(f15)) & j7), 0.0f, null, 0, 120);
                    c0237pMo744t0.m716w().mo51417g();
                    c0237pMo744t0.m690U(j14);
                    i15 = i17 + 1;
                    fM59938v = fM59919b + (i15 % c21339g.getLargeGapEvery() == 0 ? c21339g.getLargeGapExtraDeg() : 0.0f) + f25;
                    fM47212d = f28;
                    iM59896f = i24;
                    iM59940x2 = i16;
                    iM36284n = i25;
                    c3 = c7;
                    f17 = f24;
                    j15 = j7;
                    jFloatToRawIntBits2 = j18;
                } catch (Throwable th5) {
                    th = th5;
                    j13 = jM670A;
                }
            } catch (Throwable th6) {
                th = th6;
                j13 = jM670A;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m59901k(C21339g c21339g, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m59894d(c21339g, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m59902l(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: renamed from: m */
    private static final float m59903m(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m59904n(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x0151  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    private static final void m59905o(C21334b c21334b, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        EnumC16313m0 enumC16313m0M59885a;
        EnumC2888c.Companion aVar;
        Float fValueOf = Float.valueOf(1.0f);
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(483641770);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(c21334b) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                enumC16313m0M59885a = c21334b.getIcon();
                if (enumC16313m0M59885a == null) {
                    c28655q.m87150e0(1959653782);
                    c28655q.m87173q(false);
                } else {
                    C27430e c27430eM53378s = AbstractC18489d0.m53378s(c28655q, 1959653783, enumC16313m0M59885a, c28655q, 6);
                    long jM59909s = m59909s(enumC16313m0M59885a, c28655q, 0);
                    float f13 = 4;
                    AbstractC15005f3.m43108b(c27430eM53378s, null, AbstractC1102d.m3419p(f13 * f13, c2314t), jM59909s, c28655q, 432, 0);
                    AbstractC31061c.m95650z((float) 1.5d, 8, c2314t, c28655q, false);
                }
                String strM105081m = c21334b.getPrimaryText().getText();
                aVar = EnumC2888c.INSTANCE;
                Modifier modifier5 = modifier4;
                AbstractC30795n.m94707h(strM105081m, null, c21334b.getPrimaryText().getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.m8402a(c21334b.getPrimaryText().getStyle()), fValueOf, c28655q, 0, 12582912, 65530);
                c28655q = c28655q;
                if (c21334b.getSecondaryText().getText().length() > 0) {
                    c28655q.m87150e0(1960302613);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * 8, c2314t));
                    AbstractC30795n.m94707h(c21334b.getSecondaryText().getText(), null, c21334b.getSecondaryText().getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.m8402a(c21334b.getSecondaryText().getStyle()), fValueOf, c28655q, 0, 12582912, 65530);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1960639924);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20769k0(c21334b, i13, modifier3, i14, 2);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            enumC16313m0M59885a = c21334b.getIcon();
            if (enumC16313m0M59885a == null) {
                c28655q.m87150e0(1959653782);
                c28655q.m87173q(false);
            } else {
                C27430e c27430eM53378s2 = AbstractC18489d0.m53378s(c28655q, 1959653783, enumC16313m0M59885a, c28655q, 6);
                long jM59909s2 = m59909s(enumC16313m0M59885a, c28655q, 0);
                float f14 = 4;
                AbstractC15005f3.m43108b(c27430eM53378s2, null, AbstractC1102d.m3419p(f14 * f14, c2314t), jM59909s2, c28655q, 432, 0);
                AbstractC31061c.m95650z((float) 1.5d, 8, c2314t, c28655q, false);
            }
            String strM105081m2 = c21334b.getPrimaryText().getText();
            aVar = EnumC2888c.INSTANCE;
            Modifier modifier6 = modifier4;
            AbstractC30795n.m94707h(strM105081m2, null, c21334b.getPrimaryText().getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.m8402a(c21334b.getPrimaryText().getStyle()), fValueOf, c28655q, 0, 12582912, 65530);
            c28655q = c28655q;
            if (c21334b.getSecondaryText().getText().length() > 0) {
                c28655q.m87150e0(1960302613);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * 8, c2314t));
                AbstractC30795n.m94707h(c21334b.getSecondaryText().getText(), null, c21334b.getSecondaryText().getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.m8402a(c21334b.getSecondaryText().getStyle()), fValueOf, c28655q, 0, 12582912, 65530);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1960639924);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(c21334b, i13, modifier3, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m59906p(C21334b c21334b, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m59905o(c21334b, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final long m59909s(EnumC16313m0 enumC16313m0, Composer composer, int i13) {
        return m59910t(enumC16313m0).mo134584toComposableColorWaAFU9c(composer, 0);
    }

    /* JADX INFO: renamed from: t */
    public static final EnumC39333f m59910t(EnumC16313m0 icon) {
        AbstractC22676k.m65750j(icon, "icon");
        return b.f81584a[icon.ordinal()] == 1 ? EnumC39333f.ACCENT_POSITIVE_TREND : EnumC39333f.WHITE_70;
    }

    /* JADX INFO: renamed from: u */
    private static final long m59911u(long j7, long j13, float f13) {
        return AbstractC17918w0.m51518f(C27648a.m83569T(C17919x.m51547i(j7), C17919x.m51547i(j13), f13), C27648a.m83569T(C17919x.m51546h(j7), C17919x.m51546h(j13), f13), C27648a.m83569T(C17919x.m51544f(j7), C17919x.m51544f(j13), f13), C27648a.m83569T(C17919x.m51543e(j7), C17919x.m51543e(j13), f13), 16);
    }

    /* JADX INFO: renamed from: v */
    public static final long m59912v(C21339g c21339g, float f13) {
        AbstractC22676k.m65750j(c21339g, "<this>");
        float fM36283m = AbstractC12889b.m36283m(f13, 0.0f, 1.0f);
        return fM36283m <= 0.5f ? m59911u(c21339g.getProgressGradientStart(), c21339g.getProgressGradientMid(), fM36283m * 2.0f) : m59911u(c21339g.getProgressGradientMid(), c21339g.getProgressGradientEnd(), (fM36283m - 0.5f) * 2.0f);
    }

    /* JADX INFO: renamed from: w */
    public static final long m59913w(C21339g c21339g, int i13) {
        AbstractC22676k.m65750j(c21339g, "<this>");
        float f13 = i13;
        int iM59940x = c21339g.getTotalSegments() - 1;
        return m59912v(c21339g, f13 / (iM59940x >= 1 ? iM59940x : 1));
    }
}
