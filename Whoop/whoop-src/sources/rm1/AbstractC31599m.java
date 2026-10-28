package rm1;

import al.AbstractC0954a;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c51.C4224b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import gy0.AbstractC16277f;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import jp1.C21859k;
import kotlin.C2000e1;
import kotlin.C2026r;
import l83.C23454a0;
import l83.C23465k;
import mm1.AbstractC25696j;
import mm1.C25697k;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import oq1.C28119c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11343d2;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.C11351f2;
import p077d0.C11409v1;
import p077d0.C11421z1;
import p077d0.InterfaceC11337c0;
import p077d0.InterfaceC11403t1;
import p098dt.AbstractC12350b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qb0.C30179a;
import qn0.C30515j;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tl1.C33919c;
import wb3.AbstractC37056f;
import wy0.AbstractC37692c;
import x81.C38072d;
import z51.AbstractC40097h;
import z51.C40090a;
import z51.C40101l;
import z51.EnumC40100k;
import z51.EnumC40105p;

/* JADX INFO: renamed from: rm1.m */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\r\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0018\u001a\u00020\u00172\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aU\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00172\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001aE\u0010#\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00152\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b#\u0010$\"\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006,²\u0006\u000e\u0010*\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lrm1/k;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "E", "(Landroidx/compose/ui/Modifier;Lrm1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lz51/l;", "itemState", "Ld0/z1;", "Lrm1/c;", "transition", "", "durationMillis", "delayMillis", "s", "(Landroidx/compose/ui/Modifier;Lz51/l;Ld0/z1;IILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "", "initialLabel", "Lrm1/a;", "N", "(Ld0/z1;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lrm1/a;", "Lmm1/k;", "welcomeCardState", "animation", "x", "(Landroidx/compose/ui/Modifier;Lmm1/k;Lrm1/a;Ld0/z1;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "fillPercentage", "gaugeDisplay", "onClick", "o", "(Landroidx/compose/ui/Modifier;Lrm1/a;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "a", "Lrm1/k;", "getPreviewInitialDayOneWelcomeOverviewGaugeItemState", "()Lrm1/k;", "previewInitialDayOneWelcomeOverviewGaugeItemState", "useInitialState", "welcomeAnimate", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31599m {

    /* JADX INFO: renamed from: a */
    private static final C31597k f130589a;

    /* JADX INFO: renamed from: rm1.m$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f130590w = new a();

        /* JADX INFO: renamed from: a */
        public final long m97530a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m97530a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: rm1.m$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayonetransition.DayOneWelcomeOverviewGaugeKt$DayOneWelcomeOverviewGauge$1$1", m100430f = "DayOneWelcomeOverviewGauge.kt", m100431l = {119}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f130591w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31597k f130592x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f130593y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f130594z;

        /* JADX INFO: renamed from: rm1.m$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C31597k f130595w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28601c1 f130596x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f130597y;

            /* JADX INFO: renamed from: rm1.m$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.view.dayonetransition.DayOneWelcomeOverviewGaugeKt$DayOneWelcomeOverviewGauge$1$1$1", m100430f = "DayOneWelcomeOverviewGauge.kt", m100431l = {121, 123, 125}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42284a extends AbstractC32269c {

                /* JADX INFO: renamed from: w */
                Object f130598w;

                /* JADX INFO: renamed from: x */
                /* synthetic */ Object f130599x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ a<T> f130600y;

                /* JADX INFO: renamed from: z */
                int f130601z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C42284a(a<? super T> aVar, InterfaceC30057d<? super C42284a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f130600y = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f130599x = obj;
                    this.f130601z |= Integer.MIN_VALUE;
                    return this.f130600y.emit(null, this);
                }
            }

            public a(C31597k c31597k, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
                this.f130595w = c31597k;
                this.f130596x = interfaceC28601c1;
                this.f130597y = interfaceC28601c2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
            
                if (bc3.AbstractC3034m0.m8782b(r10, r0) == r1) goto L30;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(tl1.AbstractC33918b r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof rm1.AbstractC31599m.b.a.C42284a
                    if (r0 == 0) goto L13
                    r0 = r11
                    rm1.m$b$a$a r0 = (rm1.AbstractC31599m.b.a.C42284a) r0
                    int r1 = r0.f130601z
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f130601z = r1
                    goto L18
                L13:
                    rm1.m$b$a$a r0 = new rm1.m$b$a$a
                    r0.<init>(r9, r11)
                L18:
                    java.lang.Object r11 = r0.f130599x
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f130601z
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    r6 = 3
                    if (r2 == 0) goto L4a
                    if (r2 == r4) goto L42
                    if (r2 == r3) goto L3a
                    if (r2 != r6) goto L32
                    java.lang.Object r10 = r0.f130598w
                    tl1.b r10 = (tl1.AbstractC33918b) r10
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto L9a
                L32:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L3a:
                    java.lang.Object r10 = r0.f130598w
                    tl1.b r10 = (tl1.AbstractC33918b) r10
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto L80
                L42:
                    java.lang.Object r10 = r0.f130598w
                    tl1.b r10 = (tl1.AbstractC33918b) r10
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto L66
                L4a:
                    p505ts.AbstractC34132o.m107864I(r11)
                    boolean r10 = r10 instanceof tl1.AbstractC33918b.c
                    if (r10 == 0) goto Lae
                    p1.c1 r10 = r9.f130596x
                    boolean r10 = rm1.AbstractC31599m.m97497K(r10)
                    if (r10 == 0) goto Lae
                    r0.f130598w = r5
                    r0.f130601z = r4
                    r10 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r10 = bc3.AbstractC3034m0.m8782b(r10, r0)
                    if (r10 != r1) goto L66
                    goto L99
                L66:
                    p1.c1 r10 = r9.f130597y
                    rm1.c r11 = rm1.EnumC31589c.WELCOMECOLLAPSE
                    rm1.AbstractC31599m.m97499M(r10, r11)
                    rm1.k r10 = r9.f130595w
                    long r10 = r10.getDelayMillis()
                    long r7 = (long) r6
                    long r10 = r10 / r7
                    r0.f130598w = r5
                    r0.f130601z = r3
                    java.lang.Object r10 = bc3.AbstractC3034m0.m8782b(r10, r0)
                    if (r10 != r1) goto L80
                    goto L99
                L80:
                    p1.c1 r10 = r9.f130597y
                    rm1.c r11 = rm1.EnumC31589c.FULLGAUGE
                    rm1.AbstractC31599m.m97499M(r10, r11)
                    rm1.k r10 = r9.f130595w
                    long r10 = r10.getDelayMillis()
                    long r2 = (long) r6
                    long r10 = r10 / r2
                    r0.f130598w = r5
                    r0.f130601z = r6
                    java.lang.Object r10 = bc3.AbstractC3034m0.m8782b(r10, r0)
                    if (r10 != r1) goto L9a
                L99:
                    return r1
                L9a:
                    p1.c1 r10 = r9.f130597y
                    rm1.c r11 = rm1.EnumC31589c.COMPLETE
                    rm1.AbstractC31599m.m97499M(r10, r11)
                    p1.c1 r10 = r9.f130596x
                    r11 = 0
                    rm1.AbstractC31599m.m97498L(r10, r11)
                    tl1.c$a r10 = tl1.C33919c.INSTANCE
                    tl1.b$d r11 = tl1.AbstractC33918b.d.f142105a
                    r10.m107297b(r11)
                Lae:
                    l83.a0 r10 = l83.C23454a0.f92919a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: rm1.AbstractC31599m.b.a.emit(tl1.b, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C31597k c31597k, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130592x = c31597k;
            this.f130593y = interfaceC28601c1;
            this.f130594z = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f130592x, this.f130593y, this.f130594z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130591w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 interfaceC13037f2M107296a = C33919c.INSTANCE.m107296a();
                a aVar = new a(this.f130592x, this.f130593y, this.f130594z);
                this.f130591w = 1;
                if (interfaceC13037f2M107296a.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: rm1.m$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f130602a;

        static {
            int[] iArr = new int[EnumC31589c.values().length];
            try {
                iArr[EnumC31589c.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31589c.WELCOMECOLLAPSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC31589c.FULLGAUGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC31589c.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f130602a = iArr;
        }
    }

    /* JADX INFO: renamed from: rm1.m$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C11421z1 f130603w;

        public d(C11421z1 c11421z1) {
            this.f130603w = c11421z1;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final Boolean invoke() {
            return this.f130603w.f36633d.getValue();
        }
    }

    /* JADX INFO: renamed from: rm1.m$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C11421z1 f130604w;

        public e(C11421z1 c11421z1) {
            this.f130604w = c11421z1;
        }

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC11403t1 invoke() {
            return this.f130604w.m30664f();
        }
    }

    /* JADX INFO: renamed from: rm1.m$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C11421z1 f130605w;

        public f(C11421z1 c11421z1) {
            this.f130605w = c11421z1;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final Boolean invoke() {
            return this.f130605w.f36633d.getValue();
        }
    }

    /* JADX INFO: renamed from: rm1.m$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C11421z1 f130606w;

        public g(C11421z1 c11421z1) {
            this.f130606w = c11421z1;
        }

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC11403t1 invoke() {
            return this.f130606w.m30664f();
        }
    }

    /* JADX INFO: renamed from: rm1.m$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C11421z1 f130607w;

        public h(C11421z1 c11421z1) {
            this.f130607w = c11421z1;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final Boolean invoke() {
            return this.f130607w.f36633d.getValue();
        }
    }

    /* JADX INFO: renamed from: rm1.m$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C11421z1 f130608w;

        public i(C11421z1 c11421z1) {
            this.f130608w = c11421z1;
        }

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC11403t1 invoke() {
            return this.f130608w.m30664f();
        }
    }

    static {
        EnumC40100k enumC40100k = EnumC40100k.HIGH;
        boolean z4 = false;
        boolean z13 = true;
        boolean z14 = false;
        float f13 = 0.7f;
        float f14 = 0.87f;
        float f15 = 0.60952383f;
        f130589a = new C31597k(new C40101l(z4, z13, z14, f13, new C23465k(Float.valueOf(0.55f), Float.valueOf(0.85f)), f14, AbstractC8693b.m21278l("87"), enumC40100k, AbstractC8693b.m21278l("89"), f15, AbstractC8693b.m21278l("12.8"), null, 0.85f, AbstractC8693b.m21278l("weekly goal"), false, null, null, new C40090a(AbstractC8693b.m21278l("HRV"), AbstractC8693b.m21278l("154")), new C40090a(AbstractC8693b.m21278l("SLEEP"), AbstractC8693b.m21278l("89%")), 116740, null), AbstractC25696j.m75691a(), 800, 200L, true, EnumC31589c.INITIAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m97487A(Modifier modifier, C25697k c25697k, C31587a c31587a, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        float f13 = 4;
        AbstractC12889b.m36263b(AbstractC1099a.m3398t(AbstractC1102d.m3412i(AbstractC1102d.m3409f(1.0f, modifier), 30 * f13, 55 * f13), 0.0f, 0.0f, 0.0f, ((float) 0.5d) * 8, 7), null, C38072d.f163053a.m121949b(composer, C38072d.f163054b).getTransparent(), null, 0 * f13, AbstractC37817c.m121344e(793245012, composer, new C21859k(c25697k, c31587a, function1, 19)), composer, 1769472, 26);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m97488B(C25697k c25697k, C31587a c31587a, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21275i = AbstractC8693b.m21275i(c25697k.getTitle(), c28655q, 0);
            C23000t1 c23000t1 = C23000t1.f90727a;
            Modifier modifierM107879c = AbstractC34132o.m107879c(c31587a.m97371a(), AbstractC12350b.m34565N(c31587a.m97372b(), c23000t1.mo66772c(c2314t, true, 0.65f)));
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21275i, modifierM107879c, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 5, 2, null, c38072d.m121952e(c28655q, i14).getT1(), null, c28655q, 0, (C2886a.f11498d << 18) | 27648, 172024);
            float f13 = 4;
            m97518o(AbstractC1099a.m3391m(AbstractC1102d.m3411h(35 * f13, c23000t1.mo66772c(c2314t, true, 0.45f)), c31587a.m97373c(), 0 * f13), c31587a, (float) c25697k.getDayStrainGaugeFillPercentage(), c25697k.getDayStrainDisplay(), function1, c28655q, 0, 0);
            AbstractC27274q.g gVar = AbstractC27274q.g.f109144f;
            int whoopIcon = c25697k.getStrainHelpIcon().toWhoopIcon();
            EnumC39333f enumC39333f = EnumC39333f.GREY_L1;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = a.f130590w;
                c28655q.m87172p0(objM87133R);
            }
            C27270o c27270o = new C27270o(gVar, whoopIcon, enumC39333f, p745y81.Function1.m125323a((Function1) objM87133R), null, false, false, false, 0.0f, false, MessageListItemViewType.GIPHY, null);
            Modifier modifierM107879c2 = AbstractC34132o.m107879c(c31587a.m97371a(), AbstractC1102d.m3419p(6 * f13, c23000t1.mo66771a(c2314t, C2299e.f9107J)));
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62239G1);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C30515j(function1, 8);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27242b1.m82092d(c27270o, strM92103Y, modifierM107879c2, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 8);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m97489C(Function1 function1) {
        function1.invoke(EnumC40105p.HELP);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m97490D(Modifier modifier, C25697k c25697k, C31587a c31587a, C11421z1 c11421z1, int i13, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m97527x(modifier, c25697k, c31587a, c11421z1, i13, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    public static final void m97491E(Modifier modifier, C31597k viewState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-689804491);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getInitialize()));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(m97492F(interfaceC28601c1) ? EnumC31589c.INITIAL : viewState.getAnimationState());
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            C11421z1 c11421z1M30544f = AbstractC11343d2.m30544f(m97494H(interfaceC28601c2), "WelcomeCard to OverviewGauge", c28655q, 48, 0);
            C28633k1 c28633k1 = c11421z1M30544f.f36633d;
            AbstractC0954a abstractC0954a = c11421z1M30544f.f36630a;
            boolean z4 = (i15 & 112) == 32 || ((i15 & 64) != 0 && c28655q.m87157i(viewState));
            Object objM87133R3 = c28655q.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                objM87133R3 = new b(viewState, interfaceC28601c1, interfaceC28601c2, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
            boolean zM87153g = c28655q.m87153g(c11421z1M30544f);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g || objM87133R4 == c28676v0) {
                objM87133R4 = abstractC0954a.mo2428y0();
                c28655q.m87172p0(objM87133R4);
            }
            if (c11421z1M30544f.m30665g()) {
                objM87133R4 = abstractC0954a.mo2428y0();
            }
            c28655q.m87150e0(-1391478927);
            int[] iArr = c.f130602a;
            boolean z13 = iArr[((EnumC31589c) objM87133R4).ordinal()] != 1;
            c28655q.m87173q(false);
            Boolean boolValueOf = Boolean.valueOf(z13);
            EnumC31589c enumC31589c = (EnumC31589c) c28633k1.getValue();
            c28655q.m87150e0(-1391478927);
            boolean z14 = iArr[enumC31589c.ordinal()] != 1;
            c28655q.m87173q(false);
            C31587a c31587aM97500N = m97500N(AbstractC11343d2.m30540b(c11421z1M30544f, boolValueOf, Boolean.valueOf(z14), "ChildTransition", c28655q, 0), "welcomeCard", viewState.getDurationMillis() / 2, c28655q, 48);
            int i17 = i15 & 14;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
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
            C25697k c25697kM97486g = viewState.getWelcomeCardItemState();
            boolean zM87153g2 = c28655q.m87153g(c11421z1M30544f);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87153g2 || objM87133R5 == c28676v0) {
                objM87133R5 = abstractC0954a.mo2428y0();
                c28655q.m87172p0(objM87133R5);
            }
            if (c11421z1M30544f.m30665g()) {
                objM87133R5 = abstractC0954a.mo2428y0();
            }
            c28655q.m87150e0(1688606154);
            int i18 = iArr[((EnumC31589c) objM87133R5).ordinal()];
            boolean z15 = i18 == 1 || i18 == 2;
            c28655q.m87173q(false);
            Boolean boolValueOf2 = Boolean.valueOf(z15);
            EnumC31589c enumC31589c2 = (EnumC31589c) c28633k1.getValue();
            c28655q.m87150e0(1688606154);
            int i19 = iArr[enumC31589c2.ordinal()];
            boolean z16 = i19 == 1 || i19 == 2;
            c28655q.m87173q(false);
            C11421z1 c11421z1M30540b = AbstractC11343d2.m30540b(c11421z1M30544f, boolValueOf2, Boolean.valueOf(z16), "ChildTransition", c28655q, 0);
            c28655q = c28655q;
            int i24 = (i15 << 9) & 458752;
            m97527x(modifier4, c25697kM97486g, c31587aM97500N, c11421z1M30540b, viewState.getDurationMillis() / 2, onViewEvent, c28655q, i17 | i24, 0);
            Modifier modifier5 = modifier4;
            C40101l c40101lM97485f = viewState.getOverviewGaugeState();
            boolean zM87153g3 = c28655q.m87153g(c11421z1M30544f);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87153g3 || objM87133R6 == c28676v0) {
                objM87133R6 = abstractC0954a.mo2428y0();
                c28655q.m87172p0(objM87133R6);
            }
            if (c11421z1M30544f.m30665g()) {
                objM87133R6 = abstractC0954a.mo2428y0();
            }
            c28655q.m87150e0(-310319590);
            c28655q.m87173q(false);
            EnumC31589c enumC31589c3 = (EnumC31589c) c28633k1.getValue();
            c28655q.m87150e0(-310319590);
            c28655q.m87173q(false);
            m97522s(null, c40101lM97485f, AbstractC11343d2.m30540b(c11421z1M30544f, (EnumC31589c) objM87133R6, enumC31589c3, "ChildTransition", c28655q, 0), viewState.getDurationMillis() / 2, viewState.getDurationMillis() / 2, onViewEvent, c28655q, (C40101l.f173095t << 3) | i24, 1);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(i13, i14, 21, modifier3, viewState, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final boolean m97492F(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m97493G(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: H */
    private static final EnumC31589c m97494H(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC31589c) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m97495I(InterfaceC28601c1 interfaceC28601c1, EnumC31589c enumC31589c) {
        interfaceC28601c1.setValue(enumC31589c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m97496J(Modifier modifier, C31597k c31597k, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m97491E(modifier, c31597k, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    public static final C31587a m97500N(C11421z1 transition, String initialLabel, int i13, Composer composer, int i14) {
        Object objMo2428y0;
        Object objMo2428y1;
        Object objMo2428y2;
        AbstractC22676k.m65750j(transition, "transition");
        AbstractC0954a abstractC0954a = transition.f36630a;
        AbstractC22676k.m65750j(initialLabel, "initialLabel");
        initialLabel.concat("alpha");
        int i15 = i14 & 14;
        C11351f2 c11351f2 = AbstractC11348f.f36367i;
        boolean zM30665g = transition.m30665g();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM30665g) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1666853325);
            c28655q.m87173q(false);
            objMo2428y0 = abstractC0954a.mo2428y0();
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1666599280);
            boolean z4 = ((i15 ^ 6) > 4 && c28655q2.m87153g(transition)) || (i14 & 6) == 4;
            objMo2428y0 = c28655q2.m87133R();
            if (z4 || objMo2428y0 == c28676v0) {
                AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
                Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
                AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
                try {
                    Object objMo2428y3 = abstractC0954a.mo2428y0();
                    C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                    c28655q2.m87172p0(objMo2428y3);
                    objMo2428y0 = objMo2428y3;
                } catch (Throwable th3) {
                    C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                    throw th3;
                }
            }
            c28655q2.m87173q(false);
        }
        boolean zBooleanValue = ((Boolean) objMo2428y0).booleanValue();
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87150e0(-1386258777);
        float f13 = zBooleanValue ? 0.0f : 1.0f;
        c28655q3.m87173q(false);
        Float fValueOf = Float.valueOf(f13);
        int i16 = i15 ^ 6;
        boolean z13 = (i16 > 4 && c28655q3.m87153g(transition)) || (i14 & 6) == 4;
        Object objM87133R = c28655q3.m87133R();
        if (z13 || objM87133R == c28676v0) {
            objM87133R = AbstractC28683x.m87264r(new f(transition));
            c28655q3.m87172p0(objM87133R);
        }
        boolean zBooleanValue2 = ((Boolean) ((InterfaceC28670t2) objM87133R).getValue()).booleanValue();
        c28655q3.m87150e0(-1386258777);
        float f14 = zBooleanValue2 ? 0.0f : 1.0f;
        c28655q3.m87173q(false);
        Float fValueOf2 = Float.valueOf(f14);
        boolean z14 = (i16 > 4 && c28655q3.m87153g(transition)) || (i14 & 6) == 4;
        Object objM87133R2 = c28655q3.m87133R();
        if (z14 || objM87133R2 == c28676v0) {
            objM87133R2 = AbstractC28683x.m87264r(new g(transition));
            c28655q3.m87172p0(objM87133R2);
        }
        C11409v1 c11409v1M30542d = AbstractC11343d2.m30542d(transition, fValueOf, fValueOf2, m97501O(i13, (InterfaceC11403t1) ((InterfaceC28670t2) objM87133R2).getValue(), c28655q3, 0), c11351f2, c28655q3, i15);
        initialLabel.concat("scale");
        if (transition.m30665g()) {
            c28655q3.m87150e0(1666853325);
            c28655q3.m87173q(false);
            objMo2428y1 = abstractC0954a.mo2428y0();
        } else {
            c28655q3.m87150e0(1666599280);
            boolean z15 = (i16 > 4 && c28655q3.m87153g(transition)) || (i14 & 6) == 4;
            objMo2428y1 = c28655q3.m87133R();
            if (z15 || objMo2428y1 == c28676v0) {
                AbstractC39957f abstractC39957fM126587c2 = C39615a.m126587c();
                Function1 function1Mo128133e2 = abstractC39957fM126587c2 != null ? abstractC39957fM126587c2.mo128133e() : null;
                AbstractC39957f abstractC39957fM126589e2 = C39615a.m126589e(abstractC39957fM126587c2);
                try {
                    Object objMo2428y4 = abstractC0954a.mo2428y0();
                    C39615a.m126591g(abstractC39957fM126587c2, abstractC39957fM126589e2, function1Mo128133e2);
                    c28655q3.m87172p0(objMo2428y4);
                    objMo2428y1 = objMo2428y4;
                } catch (Throwable th4) {
                    C39615a.m126591g(abstractC39957fM126587c2, abstractC39957fM126589e2, function1Mo128133e2);
                    throw th4;
                }
            }
            c28655q3.m87173q(false);
        }
        boolean zBooleanValue3 = ((Boolean) objMo2428y1).booleanValue();
        c28655q3.m87150e0(-559118042);
        float f15 = zBooleanValue3 ? 0.0f : 1.0f;
        c28655q3.m87173q(false);
        Float fValueOf3 = Float.valueOf(f15);
        boolean z16 = (i16 > 4 && c28655q3.m87153g(transition)) || (i14 & 6) == 4;
        Object objM87133R3 = c28655q3.m87133R();
        if (z16 || objM87133R3 == c28676v0) {
            objM87133R3 = AbstractC28683x.m87264r(new h(transition));
            c28655q3.m87172p0(objM87133R3);
        }
        boolean zBooleanValue4 = ((Boolean) ((InterfaceC28670t2) objM87133R3).getValue()).booleanValue();
        c28655q3.m87150e0(-559118042);
        float f16 = zBooleanValue4 ? 0.0f : 1.0f;
        c28655q3.m87173q(false);
        Float fValueOf4 = Float.valueOf(f16);
        boolean z17 = (i16 > 4 && c28655q3.m87153g(transition)) || (i14 & 6) == 4;
        Object objM87133R4 = c28655q3.m87133R();
        if (z17 || objM87133R4 == c28676v0) {
            objM87133R4 = AbstractC28683x.m87264r(new i(transition));
            c28655q3.m87172p0(objM87133R4);
        }
        C11409v1 c11409v1M30542d2 = AbstractC11343d2.m30542d(transition, fValueOf3, fValueOf4, m97502P(i13, (InterfaceC11403t1) ((InterfaceC28670t2) objM87133R4).getValue(), c28655q3, 0), c11351f2, c28655q3, i15);
        initialLabel.concat(MapboxMap.QFE_OFFSET);
        C11351f2 c11351f3 = AbstractC11348f.f36369k;
        if (transition.m30665g()) {
            c28655q3.m87150e0(1666853325);
            c28655q3.m87173q(false);
            objMo2428y2 = abstractC0954a.mo2428y0();
        } else {
            c28655q3.m87150e0(1666599280);
            boolean z18 = (i16 > 4 && c28655q3.m87153g(transition)) || (i14 & 6) == 4;
            objMo2428y2 = c28655q3.m87133R();
            if (z18 || objMo2428y2 == c28676v0) {
                AbstractC39957f abstractC39957fM126587c3 = C39615a.m126587c();
                Function1 function1Mo128133e3 = abstractC39957fM126587c3 != null ? abstractC39957fM126587c3.mo128133e() : null;
                AbstractC39957f abstractC39957fM126589e3 = C39615a.m126589e(abstractC39957fM126587c3);
                try {
                    Object objMo2428y5 = abstractC0954a.mo2428y0();
                    C39615a.m126591g(abstractC39957fM126587c3, abstractC39957fM126589e3, function1Mo128133e3);
                    c28655q3.m87172p0(objMo2428y5);
                    objMo2428y2 = objMo2428y5;
                } catch (Throwable th5) {
                    C39615a.m126591g(abstractC39957fM126587c3, abstractC39957fM126589e3, function1Mo128133e3);
                    throw th5;
                }
            }
            c28655q3.m87173q(false);
        }
        boolean zBooleanValue5 = ((Boolean) objMo2428y2).booleanValue();
        c28655q3.m87150e0(-1315476007);
        float f17 = (zBooleanValue5 ? -25 : 0) * 4;
        c28655q3.m87173q(false);
        C39174f c39174f = new C39174f(f17);
        boolean z19 = (i16 > 4 && c28655q3.m87153g(transition)) || (i14 & 6) == 4;
        Object objM87133R5 = c28655q3.m87133R();
        if (z19 || objM87133R5 == c28676v0) {
            objM87133R5 = AbstractC28683x.m87264r(new d(transition));
            c28655q3.m87172p0(objM87133R5);
        }
        boolean zBooleanValue6 = ((Boolean) ((InterfaceC28670t2) objM87133R5).getValue()).booleanValue();
        c28655q3.m87150e0(-1315476007);
        float f18 = (zBooleanValue6 ? -25 : 0) * 4;
        c28655q3.m87173q(false);
        C39174f c39174f2 = new C39174f(f18);
        boolean z24 = (i16 > 4 && c28655q3.m87153g(transition)) || (i14 & 6) == 4;
        Object objM87133R6 = c28655q3.m87133R();
        if (z24 || objM87133R6 == c28676v0) {
            objM87133R6 = AbstractC28683x.m87264r(new e(transition));
            c28655q3.m87172p0(objM87133R6);
        }
        C11409v1 c11409v1M30542d3 = AbstractC11343d2.m30542d(transition, c39174f, c39174f2, m97503Q(i13, (InterfaceC11403t1) ((InterfaceC28670t2) objM87133R6).getValue(), c28655q3, 0), c11351f3, c28655q3, i15);
        boolean z25 = (i16 > 4 && c28655q3.m87153g(transition)) || (i14 & 6) == 4;
        Object objM87133R7 = c28655q3.m87133R();
        if (z25 || objM87133R7 == c28676v0) {
            objM87133R7 = new C31587a(c11409v1M30542d, c11409v1M30542d2, c11409v1M30542d3);
            c28655q3.m87172p0(objM87133R7);
        }
        return (C31587a) objM87133R7;
    }

    /* JADX INFO: renamed from: O */
    private static final InterfaceC11337c0 m97501O(int i13, InterfaceC11403t1 animateFloat, Composer composer, int i14) {
        AbstractC22676k.m65750j(animateFloat, "$this$animateFloat");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(455163522);
        C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(i13, 0, null, 6);
        c28655q.m87173q(false);
        return c11347e2M30574v;
    }

    /* JADX INFO: renamed from: P */
    private static final InterfaceC11337c0 m97502P(int i13, InterfaceC11403t1 animateFloat, Composer composer, int i14) {
        AbstractC22676k.m65750j(animateFloat, "$this$animateFloat");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(193635265);
        C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(i13, 0, null, 6);
        c28655q.m87173q(false);
        return c11347e2M30574v;
    }

    /* JADX INFO: renamed from: Q */
    private static final InterfaceC11337c0 m97503Q(int i13, InterfaceC11403t1 animateDp, Composer composer, int i14) {
        AbstractC22676k.m65750j(animateDp, "$this$animateDp");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-281377722);
        C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(i13, 0, null, 6);
        c28655q.m87173q(false);
        return c11347e2M30574v;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x012f  */
    /* JADX WARN: Code duplicated, block: B:73:0x024f  */
    /* JADX WARN: Code duplicated, block: B:76:0x025a  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    private static final void m97518o(Modifier modifier, C31587a c31587a, float f13, String str, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1342607925);
        if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(c31587a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87147d(f13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(str) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14 & 16;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C31593g(3);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                float f14 = 4;
                float f15 = 11 * f14;
                float f16 = 2 * f14;
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                long jM125430y = c38072d.m121949b(c28655q2, i17).getBrandWhite();
                if ((57344 & i15) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C30515j(function4, 9);
                    c28655q2.m87172p0(objM87133R);
                }
                Function1 function5 = function4;
                Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, AbstractC1092a.m3362g(modifier2, false, null, null, (InterfaceC4339a) objM87133R, 15));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3406c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                AbstractC18247a abstractC18247aM52577o = AbstractC18249c.m52577o(c38072d.m121949b(c28655q2, i17).getWhite10());
                int i18 = AbstractC18247a.f71043a << 9;
                AbstractC37692c.m121117c(null, f15, 1.0f, abstractC18247aM52577o, f16, false, 0.0f, 0, null, c28655q2, i18 | 25008, 481);
                AbstractC37692c.m121117c(null, f15, f13, AbstractC18249c.m52570h(C17909s.m51492j(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(AbstractC17918w0.m51517e(4279446623L))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51517e(4284931583L)))})), f16, false, 0.0f, 0, null, c28655q2, (i15 & 896) | 24624 | i18, 481);
                String strM21275i = AbstractC8693b.m21275i(str, c28655q2, (i15 >> 9) & 14);
                float fM97372b = c31587a.m97372b();
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM107879c = AbstractC34132o.m107879c(c31587a.m97371a(), AbstractC12350b.m34565N(fM97372b, c2314t));
                C2886a c2886aM8403A = c38072d.m121952e(c28655q2, i17).getN5();
                int i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21275i, modifierM107879c, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8403A, null, c28655q2, 0, i19, 196600);
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62231E1), AbstractC34132o.m107879c(c31587a.m97371a(), AbstractC12350b.m34565N(c31587a.m97372b(), C1100b.f4583a.mo3400a(AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 1.5d) * 8, 0.0f, 0.0f, 13), C2299e.f9105H))), jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getH6(), null, c28655q2, 0, i19, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                function3 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4224b(modifier, c31587a, f13, str, function3, i13, i14);
            }
        }
        i15 |= 24576;
        function2 = function1;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C31593g(3);
                    c28655q2.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            float f17 = 4;
            float f18 = 11 * f17;
            float f19 = 2 * f17;
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            long jM125430y2 = c38072d2.m121949b(c28655q2, i110).getBrandWhite();
            if ((57344 & i15) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C30515j(function4, 9);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C30515j(function4, 9);
                c28655q2.m87172p0(objM87133R);
            }
            Function1 function6 = function4;
            Modifier modifierM3406c2 = AbstractC1102d.m3406c(1.0f, AbstractC1092a.m3362g(modifier2, false, null, null, (InterfaceC4339a) objM87133R, 15));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3406c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            AbstractC18247a abstractC18247aM52577o2 = AbstractC18249c.m52577o(c38072d2.m121949b(c28655q2, i110).getWhite10());
            int i111 = AbstractC18247a.f71043a << 9;
            AbstractC37692c.m121117c(null, f18, 1.0f, abstractC18247aM52577o2, f19, false, 0.0f, 0, null, c28655q2, i111 | 25008, 481);
            AbstractC37692c.m121117c(null, f18, f13, AbstractC18249c.m52570h(C17909s.m51492j(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(AbstractC17918w0.m51517e(4279446623L))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51517e(4284931583L)))})), f19, false, 0.0f, 0, null, c28655q2, (i15 & 896) | 24624 | i111, 481);
            String strM21275i2 = AbstractC8693b.m21275i(str, c28655q2, (i15 >> 9) & 14);
            float fM97372b2 = c31587a.m97372b();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM107879c2 = AbstractC34132o.m107879c(c31587a.m97371a(), AbstractC12350b.m34565N(fM97372b2, c2314t2));
            C2886a c2886aM8403A2 = c38072d2.m121952e(c28655q2, i110).getN5();
            int i112 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21275i2, modifierM107879c2, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8403A2, null, c28655q2, 0, i112, 196600);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62231E1), AbstractC34132o.m107879c(c31587a.m97371a(), AbstractC12350b.m34565N(c31587a.m97372b(), C1100b.f4583a.mo3400a(AbstractC1099a.m3398t(c2314t2, 0.0f, ((float) 1.5d) * 8, 0.0f, 0.0f, 13), C2299e.f9105H))), jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i110).getH6(), null, c28655q2, 0, i112, 196600);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            function3 = function6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4224b(modifier, c31587a, f13, str, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m97519p(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m97520q(Function1 function1) {
        function1.invoke(EnumC40105p.HELP);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m97521r(Modifier modifier, C31587a c31587a, float f13, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m97518o(modifier, c31587a, f13, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m97522s(Modifier modifier, C40101l itemState, C11421z1 transition, int i13, int i14, Function1 onViewEvent, Composer composer, int i15, int i16) {
        Modifier modifier2;
        int i17;
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(transition, "transition");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2085485815);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            modifier2 = modifier;
        } else if ((i15 & 6) == 0) {
            modifier2 = modifier;
            i17 = (c28655q.m87153g(modifier2) ? 4 : 2) | i15;
        } else {
            modifier2 = modifier;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q.m87153g(transition) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            i17 |= c28655q.m87149e(i14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i15) == 0) {
            i17 |= c28655q.m87157i(onViewEvent) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i17 & 1, (74899 & i17) != 74898)) {
            Modifier modifier3 = i18 != 0 ? C2314t.f9131w : modifier2;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
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
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C31593g(6);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC1090b.m3348c(transition, (Function1) objM87133R, null, AbstractC3788w0.m11577e(AbstractC11348f.m30574v(i13, i14, null, 4), 2).m11562a(AbstractC3788w0.m11575c(AbstractC11348f.m30574v(i13, 0, null, 6), 12)), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(0, 0, null, 7), 2), AbstractC37817c.m121344e(-586523892, c28655q, new C28119c(11, itemState, onViewEvent)), c28655q, 221232 | ((i17 >> 6) & 14));
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31598l(modifier2, itemState, transition, i13, i14, onViewEvent, i15, i16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final boolean m97523t(EnumC31589c state) {
        AbstractC22676k.m65750j(state, "state");
        int i13 = c.f130602a[state.ordinal()];
        return i13 == 3 || i13 == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m97524u(C40101l c40101l, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        boolean zM128624k = c40101l.getShowOptimalStrain();
        boolean zM128625l = c40101l.getShowStrainWeeklyPlanGoal();
        boolean zM128617c = c40101l.getHasSleepPerformance();
        float fM128618e = c40101l.getOptimalStrainPercent();
        C23465k c23465kM128619f = c40101l.getOptimalStrainRange();
        float fM128620g = c40101l.getRecoveryPercent();
        TextResource textResourceM128621h = c40101l.getRecoveryPercentText();
        EnumC40100k enumC40100kM128622i = c40101l.getRecoveryType();
        TextResource textResourceM128626m = c40101l.getSleepPercentText();
        float fM128627n = c40101l.getStrainScorePercent();
        TextResource textResourceM128628o = c40101l.getStrainScoreText();
        TextResource textResourceM128615a = c40101l.getBonusTrendText();
        float fM128629p = c40101l.getStrainWeeklyPlanGoalPercent();
        C40090a c40090aM128616b = c40101l.getFirstCustomGaugeEntryViewState();
        C40090a c40090aM128623j = c40101l.getSecondCustomGaugeEntryViewState();
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C30515j(function1, 10);
            c28655q.m87172p0(objM87133R);
        }
        int i14 = TextResource.$stable;
        int i15 = i14 << 18;
        int i16 = i15 | (i14 << 24);
        int i17 = i14 | i15;
        int i18 = C40090a.f173008c;
        AbstractC40097h.m128556F(zM128624k, zM128625l, zM128617c, fM128618e, c23465kM128619f, fM128620g, textResourceM128621h, enumC40100kM128622i, textResourceM128626m, fM128627n, textResourceM128628o, fM128629p, null, false, (InterfaceC4339a) objM87133R, function1, textResourceM128615a, c40090aM128616b, c40090aM128623j, c28655q, i16, i17 | (i18 << 21) | (i18 << 24), 12288);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m97525v(Function1 function1) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m97526w(Modifier modifier, C40101l c40101l, C11421z1 c11421z1, int i13, int i14, Function1 function1, int i15, int i16, Composer composer, int i17) {
        m97522s(modifier, c40101l, c11421z1, i13, i14, function1, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: x */
    public static final void m97527x(Modifier modifier, C25697k welcomeCardState, C31587a animation, C11421z1 transition, int i13, Function1 function1, Composer composer, int i14, int i15) {
        Modifier modifier2;
        int i16;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(welcomeCardState, "welcomeCardState");
        AbstractC22676k.m65750j(animation, "animation");
        AbstractC22676k.m65750j(transition, "transition");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1189227534);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87153g(welcomeCardState) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87153g(animation) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q2.m87153g(transition) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= c28655q2.m87149e(i13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i18 = i15 & 32;
        if (i18 == 0) {
            if ((196608 & i14) == 0) {
                function2 = function1;
                i16 |= c28655q2.m87157i(function2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i16) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                if (i17 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C31593g(4);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C31593g(5);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifier5 = modifier4;
                Function1 function5 = function4;
                AbstractC1090b.m3348c(transition, (Function1) objM87133R, null, AbstractC3788w0.m11577e(AbstractC11348f.m30574v(i13, 0, null, 6), 2), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(i13, 0, null, 6), 2).m11563a(AbstractC3788w0.m11583k(AbstractC11348f.m30574v(i13, i13, null, 4), 12)), AbstractC37817c.m121344e(525946327, c28655q2, new C2026r((Object) modifier5, (Object) welcomeCardState, (Object) animation, function5, 20)), c28655q2, ((i16 >> 9) & 14) | 196656);
                c28655q = c28655q2;
                modifier3 = modifier5;
                function3 = function5;
            } else {
                c28655q2.m87138X();
                modifier3 = modifier2;
                c28655q = c28655q2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2000e1(modifier3, welcomeCardState, animation, transition, i13, function3, i14, i15);
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function2 = function1;
        if ((74899 & i16) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            if (i17 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C31593g(4);
                    c28655q2.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C31593g(5);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifier6 = modifier4;
            Function1 function6 = function4;
            AbstractC1090b.m3348c(transition, (Function1) objM87133R, null, AbstractC3788w0.m11577e(AbstractC11348f.m30574v(i13, 0, null, 6), 2), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(i13, 0, null, 6), 2).m11563a(AbstractC3788w0.m11583k(AbstractC11348f.m30574v(i13, i13, null, 4), 12)), AbstractC37817c.m121344e(525946327, c28655q2, new C2026r((Object) modifier6, (Object) welcomeCardState, (Object) animation, function6, 20)), c28655q2, ((i16 >> 9) & 14) | 196656);
            c28655q = c28655q2;
            modifier3 = modifier6;
            function3 = function6;
        } else {
            c28655q2.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2000e1(modifier3, welcomeCardState, animation, transition, i13, function3, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m97528y(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final boolean m97529z(boolean z4) {
        return z4;
    }
}
