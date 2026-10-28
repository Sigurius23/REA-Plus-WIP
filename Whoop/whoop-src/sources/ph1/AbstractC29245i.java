package ph1;

import a80.C0545i;
import a80.C0546j;
import a80.C0547k;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import aw0.C2108h;
import b30.C2549j2;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bg0.C3226h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import gb1.AbstractC15674c;
import gy0.AbstractC16277f;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.C19072b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import j93.InterfaceC21461d;
import java.util.Map;
import java.util.WeakHashMap;
import l83.C23454a0;
import l83.InterfaceC23459e;
import nh1.C26722c;
import nh1.C26723d;
import nh1.InterfaceC26720a;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26949h;
import no0.C26954j0;
import nx1.C27225g;
import ny0.AbstractC27249e;
import ny0.C27256h;
import o71.C27632b;
import ox0.C28448b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p127ev.AbstractC13673n;
import p132f0.C13821r1;
import p163g1.AbstractC15005f3;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p291l0.InterfaceC23013y;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p395p6.C28884h1;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import pc3.C29096r;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qh1.C30366a;
import qz0.AbstractC30795n;
import r51.AbstractC30937e;
import r51.C30933a;
import r51.C30934b;
import r51.C30935c;
import r51.C30938f;
import r51.C30939g;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ph1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aA\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aI\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b \u0010!\u001a9\u0010#\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00112\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0003¢\u0006\u0004\b#\u0010$¨\u0006*²\u0006\u000e\u0010%\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010&\u001a\u0004\u0018\u00010\u00118\nX\u008a\u0084\u0002²\u0006\u000e\u0010'\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010)\u001a\u00020(8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lnh1/c$d;", "viewState", "Lkotlin/Function1;", "Lnh1/a;", "Ll83/a0;", "onEvent", "Lf0/r1;", "scrollState", "", "initiallyShowCountrySelectorSheet", "I", "(Lnh1/c$d;Lkotlin/jvm/functions/Function1;Lf0/r1;ZLandroidx/compose/runtime/Composer;II)V", "isCountrySelectorExpanded", "Lkotlin/Function0;", "onCountrySelectorClick", "W", "(Lnh1/c$d;Lkotlin/jvm/functions/Function1;Lf0/r1;ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "Lr51/f;", "selector", "isExpanded", "onClick", "F", "(Lr51/f;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "Lnh1/c$e;", "sticky", "", "selectedQuantity", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lnh1/c$e;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lm91/u;", "item", "", "a0", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onCloseBottomSheet", "B", "(Lr51/f;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "hasViewEventSent", "currentCountrySelector", "shouldShowCountrySelectorBottomSheet", "", "rotationAngle", "gifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29245i {

    /* JADX INFO: renamed from: ph1.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.view.GiftingScreenContentKt$GiftingScreenContent$2$1", m100430f = "GiftingScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f118337w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f118338x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26722c.d f118339y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f118340z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C26722c.d dVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f118338x = function1;
            this.f118339y = dVar;
            this.f118340z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f118338x, this.f118339y, this.f118340z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f118337w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC29245i.m88789Q(this.f118340z)) {
                AbstractC29245i.m88790R(this.f118340z, true);
                this.f118338x.invoke(new InterfaceC26720a.i(this.f118339y.getSelectedSegmentId(), this.f118339y.m79480a()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ph1.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.view.GiftingScreenContentKt$GiftingScreenContent$3$1", m100430f = "GiftingScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f118341E;

        /* JADX INFO: renamed from: w */
        int f118342w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC2994c0 f118343x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26722c.d f118344y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C15199y3 f118345z;

        /* JADX INFO: renamed from: ph1.i$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.view.GiftingScreenContentKt$GiftingScreenContent$3$1$1", m100430f = "GiftingScreenContent.kt", m100431l = {119, 122}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f118346w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26722c.d f118347x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C15199y3 f118348y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f118349z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C26722c.d dVar, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f118347x = dVar;
                this.f118348y = c15199y3;
                this.f118349z = interfaceC28601c1;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f118347x, this.f118348y, this.f118349z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
            
                if (r5.m43225f(r4) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            
                if (r5.m43223d(r4) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
            
                return r0;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r4.f118346w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L19
                    if (r1 == r3) goto L15
                    if (r1 != r2) goto Ld
                    goto L15
                Ld:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L15:
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L48
                L19:
                    p505ts.AbstractC34132o.m107864I(r5)
                    nh1.c$d r5 = r4.f118347x
                    r51.f r5 = r5.getCountrySelector()
                    if (r5 == 0) goto L37
                    p1.c1 r5 = r4.f118349z
                    boolean r5 = ph1.AbstractC29245i.m88814h0(r5)
                    if (r5 == 0) goto L37
                    g1.y3 r5 = r4.f118348y
                    r4.f118346w = r3
                    java.lang.Object r5 = r5.m43225f(r4)
                    if (r5 != r0) goto L48
                    goto L47
                L37:
                    p1.c1 r5 = r4.f118349z
                    r1 = 0
                    ph1.AbstractC29245i.m88816i0(r5, r1)
                    g1.y3 r5 = r4.f118348y
                    r4.f118346w = r2
                    java.lang.Object r5 = r5.m43223d(r4)
                    if (r5 != r0) goto L48
                L47:
                    return r0
                L48:
                    l83.a0 r5 = l83.C23454a0.f92919a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ph1.AbstractC29245i.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2994c0 interfaceC2994c0, C26722c.d dVar, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f118343x = interfaceC2994c0;
            this.f118344y = dVar;
            this.f118345z = c15199y3;
            this.f118341E = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f118343x, this.f118344y, this.f118345z, this.f118341E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f118342w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3006f0.m8732z(this.f118343x, null, null, new a(this.f118344y, this.f118345z, this.f118341E, null), 3);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ph1.i$c */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.view.GiftingScreenContentKt$GiftingScreenContent$4$1", m100430f = "GiftingScreenContent.kt", m100431l = {129}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f118350E;

        /* JADX INFO: renamed from: w */
        int f118351w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f118352x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f118353y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f118354z;

        /* JADX INFO: renamed from: ph1.i$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f118355w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28670t2 f118356x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f118357y;

            public a(Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1) {
                this.f118355w = function1;
                this.f118356x = interfaceC28670t2;
                this.f118357y = interfaceC28601c1;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (enumC15209z3 == EnumC15209z3.f57106w && AbstractC29245i.m88791S(this.f118356x) != null && AbstractC29245i.m88793U(this.f118357y)) {
                    AbstractC29245i.m88794V(this.f118357y, false);
                    this.f118355w.invoke(InterfaceC26720a.d.f106229a);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15199y3 c15199y3, Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f118352x = c15199y3;
            this.f118353y = function1;
            this.f118354z = interfaceC28670t2;
            this.f118350E = interfaceC28601c1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m88835h(C15199y3 c15199y3) {
            return c15199y3.m43221b();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f118352x, this.f118353y, this.f118354z, this.f118350E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f118351w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C29246j(this.f118352x, 0));
                a aVar = new a(this.f118353y, this.f118354z, this.f118350E);
                this.f118351w = 1;
                if (c13084s1M87240H.collect(aVar, this) == enumC31071a) {
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
    public static final C23454a0 m88773A(C26722c.e eVar, int i13, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m88830w(eVar, i13, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final void m88774B(C30938f c30938f, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1420578086);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c30938f) : c28655q.m87157i(c30938f) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, false, AbstractC37817c.m121344e(707590576, c28655q, new C26949h(c30938f, interfaceC4339a, function1, 8)), c28655q, 3078, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) c30938f, function1, (InterfaceC23459e) interfaceC4339a, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m88775C(C30938f c30938f, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            boolean zM87153g = c28655q.m87153g(interfaceC4339a) | c28655q.m87153g(function1) | c28655q.m87157i(c30938f);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C26954j0(interfaceC4339a, (InterfaceC23459e) function1, (Object) c30938f, 10);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC30937e.m95155i(modifierM3409f, c30938f, null, null, 0.0f, (Function1) objM87133R, c28655q, (C30938f.f127649h << 3) | 6, 28);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m88776D(InterfaceC4339a interfaceC4339a, Function1 function1, C30938f c30938f, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if ((it instanceof C30934b) || (it instanceof C30935c)) {
            interfaceC4339a.invoke();
        }
        function1.invoke(new InterfaceC26720a.l(it, c30938f));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m88777E(C30938f c30938f, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m88774B(c30938f, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x019c  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01db  */
    /* JADX WARN: Code duplicated, block: B:76:0x025b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0265  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    private static final void m88778F(C30938f c30938f, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource title;
        int iHashCode2;
        C30939g selectedCountry;
        String str;
        String strM95186c;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-188322599);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c30938f) : c28655q.m87157i(c30938f) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i15 |= i16;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i17 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (z16) {
                    f13 = -180.0f;
                } else {
                    f13 = 0.0f;
                }
                InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3362g = AbstractC1092a.m3362g(AbstractC1102d.m3409f(1.0f, c2314t), false, null, null, interfaceC4339a, 15);
                C22961h c22961h = AbstractC22977m.f90656g;
                C2306l c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                title = c30938f.getTitle();
                if (title == null) {
                    title = AbstractC8693b.m21278l("");
                }
                String strM21274h = AbstractC8693b.m21274h(title, c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C2886a c2886aM8420a = c38072d.m121952e(c28655q, i18).getB1();
                long jM125388d1 = c38072d.m121949b(c28655q, i18).getWhite90();
                int i19 = C2886a.f11498d << 18;
                boolean z17 = z16;
                AbstractC30795n.m94707h(strM21274h, null, jM125388d1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i19, 196602);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                selectedCountry = c30938f.getSelectedCountry();
                if (selectedCountry != null || (strM95186c = selectedCountry.getCountryFlag()) == null) {
                    str = "";
                } else {
                    str = strM95186c;
                }
                AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getH1(), null, c28655q, 0, i19, 196602);
                c28655q = c28655q;
                float f14 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(1 * f14, c2314t));
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), AbstractC1772c1.m5375L(m88779G(interfaceC28670t2M30588b), AbstractC1102d.m3419p(f14 * f14, c2314t)), c38072d.m121949b(c28655q, i18).getBrandWhite(), c28655q, 0, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z15 = z17;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(c30938f, z15, interfaceC4339a, i13, i14, 25);
            }
        }
        i15 |= 48;
        z13 = z4;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(interfaceC4339a)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        }
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i17 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (z16) {
                f13 = -180.0f;
            } else {
                f13 = 0.0f;
            }
            InterfaceC28670t2 interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(AbstractC1102d.m3409f(1.0f, c2314t2), false, null, null, interfaceC4339a, 15);
            C22961h c22961h2 = AbstractC22977m.f90656g;
            C2306l c2306l2 = C2299e.f9108K;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22961h2, c2306l2, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            title = c30938f.getTitle();
            if (title == null) {
                title = AbstractC8693b.m21278l("");
            }
            String strM21274h2 = AbstractC8693b.m21274h(title, c28655q, TextResource.$stable);
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            C2886a c2886aM8420a2 = c38072d2.m121952e(c28655q, i110).getB1();
            long jM125388d2 = c38072d2.m121949b(c28655q, i110).getWhite90();
            int i111 = C2886a.f11498d << 18;
            boolean z18 = z16;
            AbstractC30795n.m94707h(strM21274h2, null, jM125388d2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q, 0, i111, 196602);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            selectedCountry = c30938f.getSelectedCountry();
            if (selectedCountry != null) {
                str = "";
            } else {
                str = "";
            }
            AbstractC30795n.m94707h(str, null, c38072d2.m121949b(c28655q, i110).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getH1(), null, c28655q, 0, i111, 196602);
            c28655q = c28655q;
            float f15 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(1 * f15, c2314t2));
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), AbstractC1772c1.m5375L(m88779G(interfaceC28670t2M30588b2), AbstractC1102d.m3419p(f15 * f15, c2314t2)), c38072d2.m121949b(c28655q, i110).getBrandWhite(), c28655q, 0, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            z15 = z18;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(c30938f, z15, interfaceC4339a, i13, i14, 25);
        }
    }

    /* JADX INFO: renamed from: G */
    private static final float m88779G(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m88780H(C30938f c30938f, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m88778F(c30938f, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:111:0x0259  */
    /* JADX WARN: Code duplicated, block: B:114:0x0265  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4 A[PHI: r0 r3 r4
      0x00a4: PHI (r0v28 kotlin.jvm.functions.Function1) = (r0v12 kotlin.jvm.functions.Function1), (r0v30 kotlin.jvm.functions.Function1) binds: [B:70:0x00ca, B:57:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r3v15 f0.r1) = (r3v7 f0.r1), (r3v16 f0.r1) binds: [B:70:0x00ca, B:57:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r4v24 int) = (r4v9 int), (r4v25 int) binds: [B:70:0x00ca, B:57:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x0110  */
    /* JADX WARN: Code duplicated, block: B:80:0x0121  */
    /* JADX WARN: Code duplicated, block: B:81:0x0124  */
    /* JADX WARN: Code duplicated, block: B:84:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0132  */
    /* JADX WARN: Code duplicated, block: B:88:0x014d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0150  */
    /* JADX WARN: Code duplicated, block: B:92:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x015f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0197  */
    /* JADX INFO: renamed from: I */
    public static final void m88781I(C26722c.d dVar, Function1 function1, C13821r1 c13821r1, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        C13821r1 c13821r2;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        Function1 function3;
        C13821r1 c13821r3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        int i18;
        C28676v0 c28676v0;
        Function1 function4;
        C13821r1 c13821r1M92099U;
        int i19;
        Function1 function5;
        boolean z16;
        Object objM87133R;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        C15199y3 c15199y3M3460c;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        Object objM87133R3;
        InterfaceC2994c0 interfaceC2994c0;
        boolean z17;
        boolean zM87157i;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c2;
        int i24;
        boolean z18;
        boolean zM87157i2;
        Object objM87133R5;
        boolean zM87157i3;
        Object bVar;
        Function1 function6;
        C15199y3 c15199y3;
        InterfaceC28601c1 interfaceC28601c3;
        boolean z19;
        boolean z24;
        Object objM87133R6;
        Function1 function7;
        C26722c.d viewState = dVar;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(365180535);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i14 & 4) == 0) {
                    c13821r2 = c13821r1;
                    int i26 = c28655q.m87153g(c13821r2) ? 256 : 128;
                    i15 |= i26;
                } else {
                    c13821r2 = c13821r1;
                }
                i15 |= i26;
            } else {
                c13821r2 = c13821r1;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28655q.m87140Z();
                    i18 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0 || c28655q.m87118C()) {
                        if (i25 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C28884h1(18);
                                c28655q.m87172p0(objM87133R);
                            }
                            function4 = (Function1) objM87133R;
                        } else {
                            function4 = function2;
                        }
                        if ((i14 & 4) != 0) {
                            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                            i15 &= -897;
                        } else {
                            c13821r1M92099U = c13821r2;
                        }
                        i19 = i15;
                        function5 = function4;
                        if (i16 != 0) {
                            z16 = false;
                        }
                        c28655q.m87175r();
                        Object[] objArr = new Object[0];
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C29096r(4);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R2, c28655q, 48);
                        c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(viewState.getCountrySelector(), c28655q);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
                        Object[] objArr2 = new Object[0];
                        if ((i19 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i = z17 | c28655q.m87157i(viewState);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i || objM87133R4 == c28676v0) {
                            objM87133R4 = new C19072b(z16, viewState, 4);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R4, c28655q, 0);
                        boolean zM87153g = c28655q.m87153g(interfaceC28601c1);
                        i24 = i19 & 112;
                        if (i24 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i2 = z18 | zM87153g | c28655q.m87157i(viewState);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R5 == c28676v0) {
                            objM87133R5 = new a(function5, viewState, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, viewState);
                        Boolean boolValueOf = Boolean.valueOf(m88793U(interfaceC28601c2));
                        C30938f c30938fM79481b = viewState.getCountrySelector();
                        zM87157i3 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87157i(c15199y3M3460c);
                        Object objM87133R7 = c28655q.m87133R();
                        if (!zM87157i3 || objM87133R7 == c28676v0) {
                            function6 = function5;
                            c15199y3 = c15199y3M3460c;
                            interfaceC28601c3 = interfaceC28601c2;
                            bVar = new b(interfaceC2994c0, viewState, c15199y3, interfaceC28601c3, null);
                            viewState = viewState;
                            c28655q.m87172p0(bVar);
                        } else {
                            function6 = function5;
                            bVar = objM87133R7;
                            c15199y3 = c15199y3M3460c;
                            interfaceC28601c3 = interfaceC28601c2;
                        }
                        AbstractC28683x.m87254h(boolValueOf, c30938fM79481b, (InterfaceC4351m) bVar, c28655q);
                        boolean zM87157i4 = c28655q.m87157i(c15199y3) | c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC28601c3);
                        if (i24 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = zM87157i4 | z19;
                        objM87133R6 = c28655q.m87133R();
                        if (!z24 || objM87133R6 == c28676v0) {
                            Function1 function8 = function6;
                            objM87133R6 = new c(c15199y3, function8, interfaceC28601c1M87238F, interfaceC28601c3, null);
                            function7 = function8;
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            function7 = function6;
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, c15199y3);
                        c13821r3 = c13821r1M92099U;
                        AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(c15199y3), EnumC39333f.BLACK_50, null, null, null, AbstractC37817c.m121344e(-755623927, c28655q, new C26949h((Object) viewState, function7, (Object) interfaceC28601c3, 7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-2138251067, c28655q, new C27632b(viewState, function7, c13821r1M92099U, interfaceC28601c3)), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
                        c28655q = c28655q;
                        function3 = function7;
                        z15 = z16;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 4) != 0) {
                            i15 &= -897;
                        }
                        C13821r1 c13821r4 = c13821r2;
                        i19 = i15;
                        function5 = function2;
                        c13821r1M92099U = c13821r4;
                    }
                    z16 = z13;
                    c28655q.m87175r();
                    Object[] objArr3 = new Object[0];
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C29096r(4);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr3, (InterfaceC4339a) objM87133R2, c28655q, 48);
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(viewState.getCountrySelector(), c28655q);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
                    Object[] objArr4 = new Object[0];
                    if ((i19 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i = z17 | c28655q.m87157i(viewState);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C19072b(z16, viewState, 4);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C19072b(z16, viewState, 4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr4, (InterfaceC4339a) objM87133R4, c28655q, 0);
                    boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1);
                    i24 = i19 & 112;
                    if (i24 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87157i2 = z18 | zM87153g2 | c28655q.m87157i(viewState);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new a(function5, viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(function5, viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, viewState);
                    Boolean boolValueOf2 = Boolean.valueOf(m88793U(interfaceC28601c2));
                    C30938f c30938fM79481b2 = viewState.getCountrySelector();
                    zM87157i3 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87157i(c15199y3M3460c);
                    Object objM87133R8 = c28655q.m87133R();
                    if (zM87157i3) {
                        function6 = function5;
                        c15199y3 = c15199y3M3460c;
                        interfaceC28601c3 = interfaceC28601c2;
                        bVar = new b(interfaceC2994c0, viewState, c15199y3, interfaceC28601c3, null);
                        viewState = viewState;
                        c28655q.m87172p0(bVar);
                    } else {
                        function6 = function5;
                        c15199y3 = c15199y3M3460c;
                        interfaceC28601c3 = interfaceC28601c2;
                        bVar = new b(interfaceC2994c0, viewState, c15199y3, interfaceC28601c3, null);
                        viewState = viewState;
                        c28655q.m87172p0(bVar);
                    }
                    AbstractC28683x.m87254h(boolValueOf2, c30938fM79481b2, (InterfaceC4351m) bVar, c28655q);
                    boolean zM87157i5 = c28655q.m87157i(c15199y3) | c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC28601c3);
                    if (i24 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = zM87157i5 | z19;
                    objM87133R6 = c28655q.m87133R();
                    if (z24) {
                        Function1 function9 = function6;
                        objM87133R6 = new c(c15199y3, function9, interfaceC28601c1M87238F, interfaceC28601c3, null);
                        function7 = function9;
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        Function1 function10 = function6;
                        objM87133R6 = new c(c15199y3, function10, interfaceC28601c1M87238F, interfaceC28601c3, null);
                        function7 = function10;
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, c15199y3);
                    c13821r3 = c13821r1M92099U;
                    AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(c15199y3), EnumC39333f.BLACK_50, null, null, null, AbstractC37817c.m121344e(-755623927, c28655q, new C26949h((Object) viewState, function7, (Object) interfaceC28601c3, 7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-2138251067, c28655q, new C27632b(viewState, function7, c13821r1M92099U, interfaceC28601c3)), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
                    c28655q = c28655q;
                    function3 = function7;
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    c13821r3 = c13821r2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2108h(viewState, function3, c13821r3, z15, i13, i14, 25);
                }
            }
            i15 |= 3072;
            z13 = z4;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i25 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28884h1(18);
                            c28655q.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    if ((i14 & 4) != 0) {
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                        i15 &= -897;
                    } else {
                        c13821r1M92099U = c13821r2;
                    }
                    i19 = i15;
                    function5 = function4;
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                } else {
                    if (i25 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28884h1(18);
                            c28655q.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    if ((i14 & 4) != 0) {
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                        i15 &= -897;
                    } else {
                        c13821r1M92099U = c13821r2;
                    }
                    i19 = i15;
                    function5 = function4;
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                }
                c28655q.m87175r();
                Object[] objArr5 = new Object[0];
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C29096r(4);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr5, (InterfaceC4339a) objM87133R2, c28655q, 48);
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(viewState.getCountrySelector(), c28655q);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
                Object[] objArr6 = new Object[0];
                if ((i19 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i = z17 | c28655q.m87157i(viewState);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C19072b(z16, viewState, 4);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C19072b(z16, viewState, 4);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr6, (InterfaceC4339a) objM87133R4, c28655q, 0);
                boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                i24 = i19 & 112;
                if (i24 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87157i2 = z18 | zM87153g3 | c28655q.m87157i(viewState);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R5 = new a(function5, viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new a(function5, viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, viewState);
                Boolean boolValueOf3 = Boolean.valueOf(m88793U(interfaceC28601c2));
                C30938f c30938fM79481b3 = viewState.getCountrySelector();
                zM87157i3 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87157i(c15199y3M3460c);
                Object objM87133R9 = c28655q.m87133R();
                if (zM87157i3) {
                    function6 = function5;
                    c15199y3 = c15199y3M3460c;
                    interfaceC28601c3 = interfaceC28601c2;
                    bVar = new b(interfaceC2994c0, viewState, c15199y3, interfaceC28601c3, null);
                    viewState = viewState;
                    c28655q.m87172p0(bVar);
                } else {
                    function6 = function5;
                    c15199y3 = c15199y3M3460c;
                    interfaceC28601c3 = interfaceC28601c2;
                    bVar = new b(interfaceC2994c0, viewState, c15199y3, interfaceC28601c3, null);
                    viewState = viewState;
                    c28655q.m87172p0(bVar);
                }
                AbstractC28683x.m87254h(boolValueOf3, c30938fM79481b3, (InterfaceC4351m) bVar, c28655q);
                boolean zM87157i6 = c28655q.m87157i(c15199y3) | c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC28601c3);
                if (i24 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zM87157i6 | z19;
                objM87133R6 = c28655q.m87133R();
                if (z24) {
                    Function1 function11 = function6;
                    objM87133R6 = new c(c15199y3, function11, interfaceC28601c1M87238F, interfaceC28601c3, null);
                    function7 = function11;
                    c28655q.m87172p0(objM87133R6);
                } else {
                    Function1 function12 = function6;
                    objM87133R6 = new c(c15199y3, function12, interfaceC28601c1M87238F, interfaceC28601c3, null);
                    function7 = function12;
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, c15199y3);
                c13821r3 = c13821r1M92099U;
                AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(c15199y3), EnumC39333f.BLACK_50, null, null, null, AbstractC37817c.m121344e(-755623927, c28655q, new C26949h((Object) viewState, function7, (Object) interfaceC28601c3, 7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-2138251067, c28655q, new C27632b(viewState, function7, c13821r1M92099U, interfaceC28601c3)), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
                c28655q = c28655q;
                function3 = function7;
                z15 = z16;
            } else {
                c28655q.m87138X();
                function3 = function2;
                c13821r3 = c13821r2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(viewState, function3, c13821r3, z15, i13, i14, 25);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                c13821r2 = c13821r1;
                if (c28655q.m87153g(c13821r2)) {
                }
                i15 |= i26;
            } else {
                c13821r2 = c13821r1;
            }
            i15 |= i26;
        } else {
            c13821r2 = c13821r1;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i25 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28884h1(18);
                            c28655q.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    if ((i14 & 4) != 0) {
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                        i15 &= -897;
                    } else {
                        c13821r1M92099U = c13821r2;
                    }
                    i19 = i15;
                    function5 = function4;
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                } else {
                    if (i25 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28884h1(18);
                            c28655q.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    if ((i14 & 4) != 0) {
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                        i15 &= -897;
                    } else {
                        c13821r1M92099U = c13821r2;
                    }
                    i19 = i15;
                    function5 = function4;
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                }
                c28655q.m87175r();
                Object[] objArr7 = new Object[0];
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C29096r(4);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr7, (InterfaceC4339a) objM87133R2, c28655q, 48);
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(viewState.getCountrySelector(), c28655q);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
                Object[] objArr8 = new Object[0];
                if ((i19 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i = z17 | c28655q.m87157i(viewState);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C19072b(z16, viewState, 4);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C19072b(z16, viewState, 4);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr8, (InterfaceC4339a) objM87133R4, c28655q, 0);
                boolean zM87153g4 = c28655q.m87153g(interfaceC28601c1);
                i24 = i19 & 112;
                if (i24 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87157i2 = z18 | zM87153g4 | c28655q.m87157i(viewState);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R5 = new a(function5, viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new a(function5, viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, viewState);
                Boolean boolValueOf4 = Boolean.valueOf(m88793U(interfaceC28601c2));
                C30938f c30938fM79481b4 = viewState.getCountrySelector();
                zM87157i3 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87157i(c15199y3M3460c);
                Object objM87133R10 = c28655q.m87133R();
                if (zM87157i3) {
                    function6 = function5;
                    c15199y3 = c15199y3M3460c;
                    interfaceC28601c3 = interfaceC28601c2;
                    bVar = new b(interfaceC2994c0, viewState, c15199y3, interfaceC28601c3, null);
                    viewState = viewState;
                    c28655q.m87172p0(bVar);
                } else {
                    function6 = function5;
                    c15199y3 = c15199y3M3460c;
                    interfaceC28601c3 = interfaceC28601c2;
                    bVar = new b(interfaceC2994c0, viewState, c15199y3, interfaceC28601c3, null);
                    viewState = viewState;
                    c28655q.m87172p0(bVar);
                }
                AbstractC28683x.m87254h(boolValueOf4, c30938fM79481b4, (InterfaceC4351m) bVar, c28655q);
                boolean zM87157i7 = c28655q.m87157i(c15199y3) | c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC28601c3);
                if (i24 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zM87157i7 | z19;
                objM87133R6 = c28655q.m87133R();
                if (z24) {
                    Function1 function13 = function6;
                    objM87133R6 = new c(c15199y3, function13, interfaceC28601c1M87238F, interfaceC28601c3, null);
                    function7 = function13;
                    c28655q.m87172p0(objM87133R6);
                } else {
                    Function1 function14 = function6;
                    objM87133R6 = new c(c15199y3, function14, interfaceC28601c1M87238F, interfaceC28601c3, null);
                    function7 = function14;
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, c15199y3);
                c13821r3 = c13821r1M92099U;
                AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(c15199y3), EnumC39333f.BLACK_50, null, null, null, AbstractC37817c.m121344e(-755623927, c28655q, new C26949h((Object) viewState, function7, (Object) interfaceC28601c3, 7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-2138251067, c28655q, new C27632b(viewState, function7, c13821r1M92099U, interfaceC28601c3)), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
                c28655q = c28655q;
                function3 = function7;
                z15 = z16;
            } else {
                c28655q.m87138X();
                function3 = function2;
                c13821r3 = c13821r2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(viewState, function3, c13821r3, z15, i13, i14, 25);
            }
        }
        i15 |= 3072;
        z13 = z4;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28655q.m87140Z();
            i18 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                if (i25 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C28884h1(18);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if ((i14 & 4) != 0) {
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    i15 &= -897;
                } else {
                    c13821r1M92099U = c13821r2;
                }
                i19 = i15;
                function5 = function4;
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
            } else {
                if (i25 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C28884h1(18);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if ((i14 & 4) != 0) {
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    i15 &= -897;
                } else {
                    c13821r1M92099U = c13821r2;
                }
                i19 = i15;
                function5 = function4;
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
            }
            c28655q.m87175r();
            Object[] objArr9 = new Object[0];
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C29096r(4);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr9, (InterfaceC4339a) objM87133R2, c28655q, 48);
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(viewState.getCountrySelector(), c28655q);
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
            Object[] objArr10 = new Object[0];
            if ((i19 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87157i = z17 | c28655q.m87157i(viewState);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R4 = new C19072b(z16, viewState, 4);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C19072b(z16, viewState, 4);
                c28655q.m87172p0(objM87133R4);
            }
            interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr10, (InterfaceC4339a) objM87133R4, c28655q, 0);
            boolean zM87153g5 = c28655q.m87153g(interfaceC28601c1);
            i24 = i19 & 112;
            if (i24 == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            zM87157i2 = z18 | zM87153g5 | c28655q.m87157i(viewState);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R5 = new a(function5, viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new a(function5, viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, viewState);
            Boolean boolValueOf5 = Boolean.valueOf(m88793U(interfaceC28601c2));
            C30938f c30938fM79481b5 = viewState.getCountrySelector();
            zM87157i3 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87157i(c15199y3M3460c);
            Object objM87133R11 = c28655q.m87133R();
            if (zM87157i3) {
                function6 = function5;
                c15199y3 = c15199y3M3460c;
                interfaceC28601c3 = interfaceC28601c2;
                bVar = new b(interfaceC2994c0, viewState, c15199y3, interfaceC28601c3, null);
                viewState = viewState;
                c28655q.m87172p0(bVar);
            } else {
                function6 = function5;
                c15199y3 = c15199y3M3460c;
                interfaceC28601c3 = interfaceC28601c2;
                bVar = new b(interfaceC2994c0, viewState, c15199y3, interfaceC28601c3, null);
                viewState = viewState;
                c28655q.m87172p0(bVar);
            }
            AbstractC28683x.m87254h(boolValueOf5, c30938fM79481b5, (InterfaceC4351m) bVar, c28655q);
            boolean zM87157i8 = c28655q.m87157i(c15199y3) | c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC28601c3);
            if (i24 == 32) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = zM87157i8 | z19;
            objM87133R6 = c28655q.m87133R();
            if (z24) {
                Function1 function15 = function6;
                objM87133R6 = new c(c15199y3, function15, interfaceC28601c1M87238F, interfaceC28601c3, null);
                function7 = function15;
                c28655q.m87172p0(objM87133R6);
            } else {
                Function1 function16 = function6;
                objM87133R6 = new c(c15199y3, function16, interfaceC28601c1M87238F, interfaceC28601c3, null);
                function7 = function16;
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, c15199y3);
            c13821r3 = c13821r1M92099U;
            AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(c15199y3), EnumC39333f.BLACK_50, null, null, null, AbstractC37817c.m121344e(-755623927, c28655q, new C26949h((Object) viewState, function7, (Object) interfaceC28601c3, 7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-2138251067, c28655q, new C27632b(viewState, function7, c13821r1M92099U, interfaceC28601c3)), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
            c28655q = c28655q;
            function3 = function7;
            z15 = z16;
        } else {
            c28655q.m87138X();
            function3 = function2;
            c13821r3 = c13821r2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(viewState, function3, c13821r3, z15, i13, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m88782J(InterfaceC26720a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final InterfaceC28601c1 m88783K() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m88784L(C26722c.d dVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C30938f c30938fM79481b = dVar.getCountrySelector();
            if (c30938fM79481b == null) {
                c28655q.m87150e0(-868760483);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-868760482);
                boolean zM87153g = c28655q.m87153g(interfaceC28601c1);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C29246j(interfaceC28601c1, 3);
                    c28655q.m87172p0(objM87133R);
                }
                m88774B(c30938fM79481b, function1, (InterfaceC4339a) objM87133R, c28655q, C30938f.f127649h);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m88785M(InterfaceC28601c1 interfaceC28601c1) {
        m88794V(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m88786N(C26722c.d dVar, Function1 function1, C13821r1 c13821r1, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM88793U = m88793U(interfaceC28601c1);
            boolean zM87157i = c28655q.m87157i(dVar) | c28655q.m87153g(interfaceC28601c1);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C28448b(18, dVar, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            m88795W(dVar, function1, c13821r1, zM88793U, (InterfaceC4339a) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m88787O(C26722c.d dVar, InterfaceC28601c1 interfaceC28601c1) {
        if (dVar.getCountrySelector() != null) {
            m88794V(interfaceC28601c1, true);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m88788P(C26722c.d dVar, Function1 function1, C13821r1 c13821r1, boolean z4, int i13, int i14, Composer composer, int i15) {
        m88781I(dVar, function1, c13821r1, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final boolean m88789Q(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m88790R(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C30938f m88791S(InterfaceC28670t2 interfaceC28670t2) {
        return (C30938f) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final InterfaceC28601c1 m88792T(boolean z4, C26722c.d dVar) {
        return AbstractC28683x.m87272z(Boolean.valueOf(z4 && dVar.getCountrySelector() != null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final boolean m88793U(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m88794V(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: W */
    private static final void m88795W(C26722c.d dVar, Function1 function1, C13821r1 c13821r1, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C0209i c0209i;
        float f13;
        C23454a0 c23454a0;
        C28676v0 c28676v0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2047656023);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(dVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(c13821r1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM114675c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            int i15 = i14;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            AbstractC6721d.a aVar = new AbstractC6721d.a(dVar.getDisplayRefreshingAnimation() ? AbstractC8693b.m21278l("") : dVar.getToolbarTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            float f14 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * f14, c2314t);
            int i16 = i15 & 112;
            boolean z13 = i16 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v1) {
                objM87133R = new C29246j(function1, 2);
                c28655q.m87172p0(objM87133R);
            }
            C0209i c0209i6 = c0209i;
            int i17 = i16;
            C28676v0 c28676v2 = c28676v1;
            AbstractC6719b.m20143d(modifierM3394p, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            AbstractC1090b.m3351f(dVar.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", C29238b.f118320a.m88749c(), c28655q, 224640, 2);
            c28655q.m87173q(true);
            float f15 = 2 * f14;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC15674c.m44089m(c2314t, 0.0f, 1, null), f15, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(modifierM3396r.mo3471e(new LayoutWeightElement(1.0f, true)), c13821r1, 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
            c28655q.m87150e0(1557553695);
            for (C26722c.a aVar2 : dVar.m79483d()) {
                c28655q.m87150e0(1557555432);
                for (InterfaceC25312u interfaceC25312u : aVar2.m79474a()) {
                    int i18 = i17;
                    boolean zM87157i = (i18 == 32) | c28655q.m87157i(interfaceC25312u);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        c28676v0 = c28676v2;
                    } else {
                        c28676v0 = c28676v2;
                        if (objM87133R2 == c28676v0) {
                        }
                        m88800a0(interfaceC25312u, (Function1) objM87133R2, c28655q, 0, 0);
                        float f16 = 4;
                        AbstractC11266d.m30469w(f16, f16, c2314t, c28655q);
                        i17 = i18;
                        c28676v2 = c28676v0;
                    }
                    objM87133R2 = new C0546j(function1, interfaceC25312u, 18);
                    c28655q.m87172p0(objM87133R2);
                    m88800a0(interfaceC25312u, (Function1) objM87133R2, c28655q, 0, 0);
                    float f17 = 4;
                    AbstractC11266d.m30469w(f17, f17, c2314t, c28655q);
                    i17 = i18;
                    c28676v2 = c28676v0;
                }
                c28655q.m87173q(false);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(aVar2.getSectionType().getSpacing(), c2314t));
            }
            c28655q.m87173q(false);
            C30938f c30938fM79481b = dVar.getCountrySelector();
            if (c30938fM79481b == null) {
                c28655q.m87150e0(1040015423);
                c28655q.m87173q(false);
                f13 = f15;
                c23454a0 = null;
            } else {
                c28655q.m87150e0(1040015424);
                float f18 = 4;
                AbstractC11266d.m30469w(f18, f18, c2314t, c28655q);
                int i19 = i15 >> 6;
                f13 = f15;
                m88778F(c30938fM79481b, z4, interfaceC4339a, c28655q, C30938f.f127649h | (i19 & 112) | (i19 & 896), 0);
                AbstractC30007c.m91851u(c2314t, f13, c28655q, false);
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                AbstractC33745d.m106667z(c28655q, 1557581028, c2314t, f13, c28655q);
            } else {
                c28655q.m87150e0(1557568752);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            C26722c.e eVarM79486g = dVar.getSticky();
            if (eVarM79486g == null) {
                c28655q.m87150e0(-1352873770);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1352873769);
                m88830w(eVarM79486g, dVar.getSelectedQuantity(), function1, c28655q, (i15 << 3) & 896, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(dVar, function1, c13821r1, z4, interfaceC4339a, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m88796X(Function1 function1) {
        function1.invoke(InterfaceC26720a.j.f106236a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m88797Y(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC26720a.l(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m88798Z(C26722c.d dVar, Function1 function1, C13821r1 c13821r1, boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m88795W(dVar, function1, c13821r1, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m88800a0(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1923363739);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C28884h1(19);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C28884h1(20);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC25303l.m74291r(item, p720m91.Function1.m74306g((Function1) objM87133R2), null, function3, c28655q, (i15 & 14) | (C25307p.f99300b << 3) | ((i15 << 6) & 7168), 4);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m88802b0(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m88804c0(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C26723d.class), new C30366a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C30938f.class), new C30933a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m88806d0(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m88800a0(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: w */
    private static final void m88830w(C26722c.e eVar, int i13, Function1 function1, Composer composer, int i14, int i15) {
        C26722c.e eVar2;
        int i16;
        int i17;
        int i18;
        boolean z4;
        C2314t c2314t;
        int i19;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1259700759);
        if ((i14 & 6) == 0) {
            eVar2 = eVar;
            i16 = (c28655q.m87157i(eVar2) ? 4 : 2) | i14;
        } else {
            eVar2 = eVar;
            i16 = i14;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 131) != 130)) {
            int i24 = (i15 & 2) != 0 ? 1 : i13;
            C2314t c2314t2 = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), ((float) 2.5d) * f13, 0.0f, 2);
            WeakHashMap weakHashMap = C22944c2.f90553v;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3398t(modifierM3396r, 0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a(), 7), 0.0f, 1 * f13, 0.0f, 3 * f13, 5);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f13, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM79489b = eVar2.getText();
            if (strM79489b == null) {
                c28655q.m87150e0(-1038773135);
                c28655q.m87173q(false);
                i18 = 9;
                c2314t = c2314t2;
                z4 = false;
            } else {
                c28655q.m87150e0(-1038773134);
                String strM21275i = AbstractC8693b.m21275i(strM79489b, c28655q, 0);
                C21053l c21053l = C21053l.f79834a;
                C38072d c38072d = C38072d.f163053a;
                int i25 = C38072d.f163054b;
                i18 = 9;
                z4 = false;
                c2314t = c2314t2;
                AbstractC21048g.m58807M(strM21275i, null, true, c21053l.m58880a(C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q, i25), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d.m121949b(c28655q, i25).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 384, 498);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(-1280422203);
            for (InterfaceC25312u interfaceC25312u : eVar.m79488a()) {
                boolean z13 = interfaceC25312u instanceof C27256h;
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z13) {
                    c28655q.m87150e0(-805975680);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C27256h c27256h = (C27256h) interfaceC25312u;
                    boolean zM87157i = c28655q.m87157i(interfaceC25312u) | ((i16 & 896) == 256 ? true : z4);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        i19 = i18;
                        objM87133R = new C0545i(function1, c27256h, i19);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        i19 = i18;
                    }
                    AbstractC27249e.m82121d(modifierM3409f, c27256h, null, (InterfaceC4339a) objM87133R, c28655q, 6, 4);
                    c28655q.m87173q(z4);
                } else {
                    i19 = i18;
                    c28655q.m87150e0(-805640942);
                    Object objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C28884h1(21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    C25307p c25307pM74306g = p720m91.Function1.m74306g((Function1) objM87133R2);
                    boolean zM87157i2 = ((i16 & 896) == 256 ? true : z4) | c28655q.m87157i(interfaceC25312u);
                    Object objM87133R3 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C0546j(function1, interfaceC25312u, 19);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g, null, (Function1) objM87133R3, c28655q, C25307p.f99300b << 3, 4);
                    c28655q.m87173q(z4);
                }
                i18 = i19;
            }
            c28655q.m87173q(z4);
            c28655q.m87173q(true);
            i17 = i24;
        } else {
            c28655q.m87138X();
            i17 = i13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29244h(eVar, i17, function1, i14, i15, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m88831x(Function1 function1, InterfaceC25312u interfaceC25312u) {
        function1.invoke(new InterfaceC26720a.l(interfaceC25312u, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m88832y(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C26723d.class), new C30366a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C30938f.class), new C30933a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m88833z(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC26720a.l(it, interfaceC25312u));
        return C23454a0.f92919a;
    }
}
