package sy2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.relocation.AbstractC1108a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gb1.AbstractC15673b0;
import iz0.AbstractC21048g;
import iz0.C21054m;
import java.util.WeakHashMap;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kz2.AbstractC22927d;
import l83.C23454a0;
import l83.InterfaceC23459e;
import live.hms.video.utils.AndroidSDKConstants;
import mh.C25540h;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny2.AbstractC27299a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p132f0.C13821r1;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22937b;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.InterfaceC22940b2;
import p315m0.AbstractC24868a;
import p341nh.C26714h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p445r0.C30835c;
import p445r0.InterfaceC30833a;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.AbstractC31917f;
import p733ry2.AbstractC31920i;
import p734sl0.C32618h3;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30784c;
import qz0.AbstractC30792k;
import r83.EnumC31071a;
import s01.C32049e;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32417h;
import sr2.C32940v;
import ty2.AbstractC34268a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sy2.k */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001am\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e²\u0006\f\u0010\u001d\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, m65681d2 = {"Lty2/a$a$c;", "viewState", "Lkotlin/Function1;", "Lny2/a;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/whooplabs/feature/navigation/c;", "onNavEvent", "j", "(Lty2/a$a$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "label", "Lb91/a;", "labelTextStyle", "text", "errorMessage", "Lq3/n;", "keyboardType", "Lqz0/c;", "endingType", "", "isError", "Lq3/k;", "imeAction", "", "testTag", "onTextChanged", "r", "(Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILqz0/c;ZILjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isFocused", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33108k {

    /* JADX INFO: renamed from: sy2.k$a */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.view.screens.MysticStepScreenKt$MysticReadingField$1$1", m100430f = "MysticStepScreen.kt", m100431l = {216, 217}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC39171c f138092E;

        /* JADX INFO: renamed from: w */
        int f138093w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC30833a f138094x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f138095y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC22940b2 f138096z;

        /* JADX INFO: renamed from: sy2.k$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42354a implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f138097w;

            /* JADX INFO: renamed from: sy2.k$a$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42355a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f138098w;

                /* JADX INFO: renamed from: sy2.k$a$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.view.screens.MysticStepScreenKt$MysticReadingField$1$1$invokeSuspend$$inlined$filter$1$2", m100430f = "MysticStepScreen.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42356a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f138100F;

                    /* JADX INFO: renamed from: G */
                    Object f138101G;

                    /* JADX INFO: renamed from: H */
                    int f138102H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f138103w;

                    /* JADX INFO: renamed from: x */
                    int f138104x;

                    /* JADX INFO: renamed from: y */
                    Object f138105y;

                    /* JADX INFO: renamed from: z */
                    Object f138106z;

                    public C42356a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f138103w = obj;
                        this.f138104x |= Integer.MIN_VALUE;
                        return C42355a.this.emit(null, this);
                    }
                }

                public C42355a(InterfaceC13062m interfaceC13062m) {
                    this.f138098w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42356a c42356a;
                    if (interfaceC30057d instanceof C42356a) {
                        c42356a = (C42356a) interfaceC30057d;
                        int i13 = c42356a.f138104x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42356a.f138104x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42356a = new C42356a(interfaceC30057d);
                        }
                    } else {
                        c42356a = new C42356a(interfaceC30057d);
                    }
                    Object obj2 = c42356a.f138103w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42356a.f138104x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f138098w;
                        if (((Number) obj).intValue() > 0) {
                            c42356a.f138105y = null;
                            c42356a.f138106z = null;
                            c42356a.f138100F = null;
                            c42356a.f138101G = null;
                            c42356a.f138102H = 0;
                            c42356a.f138104x = 1;
                            if (interfaceC13062m.emit(obj, c42356a) == enumC31071a) {
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

            public C42354a(InterfaceC13058l interfaceC13058l) {
                this.f138097w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f138097w.collect(new C42355a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30833a interfaceC30833a, InterfaceC28670t2 interfaceC28670t2, InterfaceC22940b2 interfaceC22940b2, InterfaceC39171c interfaceC39171c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f138094x = interfaceC30833a;
            this.f138095y = interfaceC28670t2;
            this.f138096z = interfaceC22940b2;
            this.f138092E = interfaceC39171c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final int m104925h(InterfaceC22940b2 interfaceC22940b2, InterfaceC39171c interfaceC39171c) {
            return interfaceC22940b2.mo43079c(interfaceC39171c);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f138094x, this.f138095y, this.f138096z, this.f138092E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f138093w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (AbstractC33108k.m104920s(this.f138095y)) {
                    C42354a c42354a = new C42354a(AbstractC28683x.m87240H(new C33107j(0, this.f138096z, this.f138092E)));
                    this.f138093w = 1;
                    if (AbstractC13091v.m36575A(c42354a, this) != enumC31071a) {
                    }
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC30833a interfaceC30833a = this.f138094x;
            this.f138093w = 2;
            return ((C30835c) interfaceC30833a).m94839b(null, this) == enumC31071a ? enumC31071a : c23454a0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:118:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:121:0x0409  */
    /* JADX WARN: Code duplicated, block: B:122:0x040b  */
    /* JADX WARN: Code duplicated, block: B:124:0x040e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0410  */
    /* JADX WARN: Code duplicated, block: B:128:0x0417  */
    /* JADX WARN: Code duplicated, block: B:131:0x041c  */
    /* JADX WARN: Code duplicated, block: B:132:0x041f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0464  */
    /* JADX WARN: Code duplicated, block: B:137:0x0466  */
    /* JADX WARN: Code duplicated, block: B:140:0x046d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x046f  */
    /* JADX INFO: renamed from: j */
    public static final void m104911j(AbstractC34268a.a.c viewState, Function1 onViewEvent, Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        boolean z4;
        C2314t c2314t;
        float f13;
        C28676v0 c28676v0;
        C28676v0 c28676v1;
        C28676v0 c28676v2;
        Object objM108442k;
        TextResource textResourceM108443l;
        boolean z13;
        boolean z14;
        Object objM87133R;
        C28676v0 c28676v3;
        boolean z15;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1480457072);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(c2314t2);
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v4 = C28635l.f115821a;
            if (objM87133R3 == c28676v4) {
                objM87133R3 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R3;
            boolean zM87157i = c28655q.m87157i(interfaceC15237i);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i || objM87133R4 == c28676v4) {
                objM87133R4 = new C33104g(interfaceC15237i, 0);
                c28655q.m87172p0(objM87133R4);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM44028b0, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R4, 28);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, c2314t2));
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66722k);
            c28655q.m87158i0();
            int i15 = i14;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            int i16 = i15 & 112;
            AbstractC31917f.m99349g(viewState, onViewEvent, c28655q, i15 & 126);
            float f14 = 2;
            float f15 = 4 * f14;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t2));
            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            C2305k c2305k = C2299e.f9111N;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f16 = 8;
            float f17 = f14 * f16;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3393o(AbstractC1099a.m3379a(f17, 0.0f, 2), new LayoutWeightElement(1.0f, true)), c13821r1M92099U, 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            String strM108437f = viewState.getContent();
            if (strM108437f == null) {
                c28655q.m87150e0(-596148182);
                c28655q.m87173q(false);
                z4 = false;
                f13 = f17;
                c2314t = c2314t2;
            } else {
                c28655q.m87150e0(-596148181);
                z4 = false;
                c2314t = c2314t2;
                f13 = f17;
                AbstractC21048g.m58807M(AbstractC8693b.m21275i(strM108437f, c28655q, 0), AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, ((float) 0.5d) * f16, 0.0f, 0.0f, 13), false, AbstractC22927d.m66688a(c28655q, 0), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(r36, c2314t));
            String strM108446o = viewState.getImageUrl();
            if (strM108446o == null) {
                c28655q.m87150e0(-595639472);
                c28655q.m87173q(z4);
                c28676v0 = c28676v4;
            } else {
                c28655q.m87150e0(-595639471);
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f13, AbstractC1102d.m3409f(1.0f, c2314t)), "basicStepImage");
                AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(strM108446o);
                Object objM87133R5 = c28655q.m87133R();
                c28676v0 = r22;
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C32618h3(28);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM64503l, null, (Function1) objM87133R5, c28655q, AbstractC22403o.f87638a | 384, 1), viewState.getImageUrl(), modifierM3599a, null, C39102j.f168202d, 0.0f, null, c28655q, 24960, 104);
                c28655q.m87173q(z4);
            }
            TextResource textResourceM108450s = viewState.getSystolicLabel();
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i17).getB1();
            Object objM108448q = viewState.getSystolic();
            if (objM108448q == null) {
                objM108448q = "";
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(objM108448q);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(sb4.toString());
            TextResource textResourceM108449r = viewState.getSystolicError();
            if (textResourceM108449r == null) {
                textResourceM108449r = AbstractC8693b.m21267a();
            }
            AbstractC30784c.c cVar = new AbstractC30784c.c(viewState.getSystolicSuffix(), c38072d.m121952e(c28655q, i17).getB1());
            boolean z16 = viewState.getSystolicError() != null ? true : z4;
            boolean z17 = i16 == 32 ? true : z4;
            Object objM87133R6 = c28655q.m87133R();
            if (z17 || objM87133R6 == c28676v0) {
                objM87133R6 = new C33105h(onViewEvent, 0);
                c28655q.m87172p0(objM87133R6);
            }
            Function1 function2 = (Function1) objM87133R6;
            int i18 = TextResource.$stable;
            int i19 = C2886a.f11498d << 3;
            int i24 = i18 << 6;
            int i25 = i18 << 9;
            int i26 = AbstractC30784c.c.f126792d << 15;
            int i27 = i18 | 113270784 | i19 | i24 | i25 | i26;
            C28676v0 c28676v5 = c28676v0;
            C2314t c2314t3 = c2314t;
            m104919r(textResourceM108450s, c2886aM8420a, textResourceM21278l, textResourceM108449r, 3, cVar, z16, 6, "systolic", function2, c28655q, i27, 0);
            TextResource textResourceM108440i = viewState.getDiastolicLabel();
            C2886a c2886aM8420a2 = c38072d.m121952e(c28655q, i17).getB1();
            Object objM108438g = viewState.getDiastolic();
            if (objM108438g == null) {
                objM108438g = "";
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(objM108438g);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(sb5.toString());
            TextResource textResourceM108439h = viewState.getDiastolicError();
            if (textResourceM108439h == null) {
                textResourceM108439h = AbstractC8693b.m21267a();
            }
            AbstractC30784c.c cVar2 = new AbstractC30784c.c(viewState.getDiastolicSuffix(), c38072d.m121952e(c28655q, i17).getB1());
            boolean z18 = viewState.getDiastolicError() != null;
            boolean z19 = i16 == 32;
            Object objM87133R7 = c28655q.m87133R();
            if (z19) {
                c28676v1 = c28676v5;
            } else {
                c28676v1 = c28676v5;
                if (objM87133R7 == c28676v1) {
                }
                c28676v2 = c28676v1;
                m104919r(textResourceM108440i, c2886aM8420a2, textResourceM21278l2, textResourceM108439h, 3, cVar2, z18, 6, "diastolic", (Function1) objM87133R7, c28655q, i27, 0);
                TextResource textResourceM108444m = viewState.getHrLabel();
                C2886a c2886aM8420a3 = c38072d.m121952e(c28655q, i17).getB1();
                objM108442k = viewState.getHr();
                if (objM108442k == null) {
                    objM108442k = "";
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append(objM108442k);
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(sb6.toString());
                textResourceM108443l = viewState.getHrError();
                if (textResourceM108443l == null) {
                    textResourceM108443l = AbstractC8693b.m21267a();
                }
                AbstractC30784c.c cVar3 = new AbstractC30784c.c(viewState.getHrSuffix(), c38072d.m121952e(c28655q, i17).getB1());
                if (viewState.getHrError() != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z14) {
                    c28676v3 = c28676v2;
                } else {
                    c28676v3 = c28676v2;
                    if (objM87133R == c28676v3) {
                    }
                    function1 = onViewEvent;
                    m104919r(textResourceM108444m, c2886aM8420a3, textResourceM21278l3, textResourceM108443l, 3, cVar3, z13, 0, "hr", (Function1) objM87133R, c28655q, i18 | 100687872 | i19 | i24 | i25 | i26, 128);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t3));
                    c28655q.m87173q(true);
                    Modifier modifierM66720i = AbstractC22953f.m66720i(c2314t3);
                    TextResource textResourceM108447p = viewState.getPrimaryButton();
                    boolean zM108452u = viewState.getIsPrimaryButtonEnabled();
                    if (i16 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z15 || objM87133R2 == c28676v3) {
                        objM87133R2 = new C33098a(function1, 3);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC31920i.m99360c(textResourceM108447p, zM108452u, modifierM66720i, (InterfaceC4339a) objM87133R2, c28655q, i18, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                }
                objM87133R = new C33105h(onViewEvent, 2);
                c28655q.m87172p0(objM87133R);
                function1 = onViewEvent;
                m104919r(textResourceM108444m, c2886aM8420a3, textResourceM21278l3, textResourceM108443l, 3, cVar3, z13, 0, "hr", (Function1) objM87133R, c28655q, i18 | 100687872 | i19 | i24 | i25 | i26, 128);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t3));
                c28655q.m87173q(true);
                Modifier modifierM66720i2 = AbstractC22953f.m66720i(c2314t3);
                TextResource textResourceM108447p2 = viewState.getPrimaryButton();
                boolean zM108452u2 = viewState.getIsPrimaryButtonEnabled();
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C33098a(function1, 3);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C33098a(function1, 3);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC31920i.m99360c(textResourceM108447p2, zM108452u2, modifierM66720i2, (InterfaceC4339a) objM87133R2, c28655q, i18, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            }
            objM87133R7 = new C33105h(onViewEvent, 1);
            c28655q.m87172p0(objM87133R7);
            c28676v2 = c28676v1;
            m104919r(textResourceM108440i, c2886aM8420a2, textResourceM21278l2, textResourceM108439h, 3, cVar2, z18, 6, "diastolic", (Function1) objM87133R7, c28655q, i27, 0);
            TextResource textResourceM108444m2 = viewState.getHrLabel();
            C2886a c2886aM8420a4 = c38072d.m121952e(c28655q, i17).getB1();
            objM108442k = viewState.getHr();
            if (objM108442k == null) {
                objM108442k = "";
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append(objM108442k);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(sb7.toString());
            textResourceM108443l = viewState.getHrError();
            if (textResourceM108443l == null) {
                textResourceM108443l = AbstractC8693b.m21267a();
            }
            AbstractC30784c.c cVar4 = new AbstractC30784c.c(viewState.getHrSuffix(), c38072d.m121952e(c28655q, i17).getB1());
            if (viewState.getHrError() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z14) {
                c28676v3 = c28676v2;
                if (objM87133R == c28676v3) {
                }
                function1 = onViewEvent;
                m104919r(textResourceM108444m2, c2886aM8420a4, textResourceM21278l4, textResourceM108443l, 3, cVar4, z13, 0, "hr", (Function1) objM87133R, c28655q, i18 | 100687872 | i19 | i24 | i25 | i26, 128);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t3));
                c28655q.m87173q(true);
                Modifier modifierM66720i3 = AbstractC22953f.m66720i(c2314t3);
                TextResource textResourceM108447p3 = viewState.getPrimaryButton();
                boolean zM108452u3 = viewState.getIsPrimaryButtonEnabled();
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C33098a(function1, 3);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C33098a(function1, 3);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC31920i.m99360c(textResourceM108447p3, zM108452u3, modifierM66720i3, (InterfaceC4339a) objM87133R2, c28655q, i18, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                c28676v3 = c28676v2;
            }
            objM87133R = new C33105h(onViewEvent, 2);
            c28655q.m87172p0(objM87133R);
            function1 = onViewEvent;
            m104919r(textResourceM108444m2, c2886aM8420a4, textResourceM21278l4, textResourceM108443l, 3, cVar4, z13, 0, "hr", (Function1) objM87133R, c28655q, i18 | 100687872 | i19 | i24 | i25 | i26, 128);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t3));
            c28655q.m87173q(true);
            Modifier modifierM66720i4 = AbstractC22953f.m66720i(c2314t3);
            TextResource textResourceM108447p4 = viewState.getPrimaryButton();
            boolean zM108452u4 = viewState.getIsPrimaryButtonEnabled();
            if (i16 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z15) {
                objM87133R2 = new C33098a(function1, 3);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C33098a(function1, 3);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC31920i.m99360c(textResourceM108447p4, zM108452u4, modifierM66720i4, (InterfaceC4339a) objM87133R2, c28655q, i18, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e((Object) viewState, function1, (InterfaceC23459e) onNavEvent, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m104912k(InterfaceC15237i interfaceC15237i) {
        ((C15240l) interfaceC15237i).m43339b(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m104913l(C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.m75118b();
        rememberImagePainter.m75119c(300);
        rememberImagePainter.m75121e(C26714h.f106216c);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m104914m(Function1 function1, String it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.length() <= 3) {
            function1.invoke(new AbstractC27299a.x(it));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m104915n(Function1 function1, String it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.length() <= 3) {
            function1.invoke(new AbstractC27299a.h(it));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m104916o(Function1 function1, String it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.length() <= 3) {
            function1.invoke(new AbstractC27299a.m(it));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m104917p(Function1 function1) {
        function1.invoke(AbstractC27299a.o.f109339a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m104918q(AbstractC34268a.a.c cVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m104911j(cVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x014e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0184  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:127:0x0292  */
    /* JADX WARN: Code duplicated, block: B:130:0x029d  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    /* JADX INFO: renamed from: r */
    private static final void m104919r(final TextResource textResource, final C2886a c2886a, final TextResource textResource2, final TextResource textResource3, final int i13, final AbstractC30784c abstractC30784c, final boolean z4, int i14, final String str, final Function1 function1, Composer composer, final int i15, final int i16) {
        int i17;
        boolean z13;
        int i18;
        int i19;
        boolean z14;
        C28655q c28655q;
        final int i24;
        C28677v1 c28677v1M87180u;
        int i25;
        InterfaceC39171c interfaceC39171c;
        C22937b c22937b;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1M101215x;
        Object objM87133R2;
        InterfaceC30833a interfaceC30833a;
        boolean zM87153g;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R4;
        int i26;
        int i27;
        int i28;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-226783996);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? c28655q2.m87153g(c2886a) : c28655q2.m87157i(c2886a) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= (i15 & 512) == 0 ? c28655q2.m87153g(textResource2) : c28655q2.m87157i(textResource2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= (i15 & 4096) == 0 ? c28655q2.m87153g(textResource3) : c28655q2.m87157i(textResource3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            i17 |= c28655q2.m87149e(i13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i15) == 0) {
            i17 |= (262144 & i15) == 0 ? c28655q2.m87153g(abstractC30784c) : c28655q2.m87157i(abstractC30784c) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i15) == 0) {
            z13 = z4;
            i17 |= c28655q2.m87155h(z13) ? 1048576 : 524288;
        } else {
            z13 = z4;
        }
        int i29 = i16 & 128;
        if (i29 == 0) {
            if ((12582912 & i15) == 0) {
                i18 = i14;
                i17 |= c28655q2.m87149e(i18) ? 8388608 : 4194304;
            }
            if ((100663296 & i15) != 0) {
                if (c28655q2.m87153g(str)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i17 |= i28;
            }
            if ((805306368 & i15) != 0) {
                if (c28655q2.m87157i(function1)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i17 |= i27;
            }
            i19 = i17;
            if ((306783379 & i17) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i19 & 1, z14)) {
                if (i29 != 0) {
                    i25 = 1;
                } else {
                    i25 = i18;
                }
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                WeakHashMap weakHashMap = C22944c2.f90553v;
                c22937b = C22949e.m66712e(c28655q2).f90556c;
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                interfaceC28601c1M101215x = AbstractC32417h.m101215x(interfaceC21083i, c28655q2, 6);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C30835c();
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC30833a = (InterfaceC30833a) objM87133R2;
                Boolean boolValueOf = Boolean.valueOf(m104920s(interfaceC28601c1M101215x));
                Boolean boolValueOf2 = Boolean.valueOf(z13);
                zM87153g = c28655q2.m87153g(interfaceC28601c1M101215x) | c28655q2.m87153g(c22937b) | c28655q2.m87153g(interfaceC39171c) | c28655q2.m87157i(interfaceC30833a);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    objM87133R3 = new a(interfaceC30833a, interfaceC28601c1M101215x, c22937b, interfaceC39171c, null);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87254h(boolValueOf, boolValueOf2, (InterfaceC4351m) objM87133R3, c28655q2);
                Modifier modifierM3443a = AbstractC1108a.m3443a(C2314t.f9131w, interfaceC30833a);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3443a);
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
                objM87133R4 = c28655q2.m87133R();
                i26 = 12;
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C32940v(i26);
                    c28655q2.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
                int i34 = TextResource.$stable;
                int i35 = i19 >> 3;
                int i36 = i19 << 9;
                boolean z15 = z13;
                AbstractC30792k.m94678l(null, textResource2, null, textResource, c2886a, null, null, abstractC30784c, textResource3, z15, false, null, 0L, false, i13, 0, i25, false, null, false, false, 0, false, interfaceC21083i, str, null, null, null, null, null, interfaceC4339a, function1, c28655q2, (i34 << 24) | (C2886a.f11498d << 12) | (i34 << 3) | (i35 & 112) | (i34 << 9) | (i36 & 7168) | (i36 & 57344) | (AbstractC30784c.f126784a << 21) | ((i19 << 6) & 29360128) | (234881024 & (i19 << 15)) | (1879048192 & i36), (i19 & 57344) | (3670016 & i35), ((i19 >> 12) & 57344) | 3072, ((i19 >> 24) & 112) | 6, 1048493157, 0);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                i24 = i25;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                i24 = i18;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy2.i
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC33108k.m104922u(textResource, c2886a, textResource2, textResource3, i13, abstractC30784c, z4, i24, str, function1, i15, i16, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i17 |= 12582912;
        i18 = i14;
        if ((100663296 & i15) != 0) {
            if (c28655q2.m87153g(str)) {
                i28 = 67108864;
            } else {
                i28 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i17 |= i28;
        }
        if ((805306368 & i15) != 0) {
            if (c28655q2.m87157i(function1)) {
                i27 = 536870912;
            } else {
                i27 = 268435456;
            }
            i17 |= i27;
        }
        i19 = i17;
        if ((306783379 & i17) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i19 & 1, z14)) {
            if (i29 != 0) {
                i25 = 1;
            } else {
                i25 = i18;
            }
            interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            WeakHashMap weakHashMap2 = C22944c2.f90553v;
            c22937b = C22949e.m66712e(c28655q2).f90556c;
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
            interfaceC28601c1M101215x = AbstractC32417h.m101215x(interfaceC21083i2, c28655q2, 6);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C30835c();
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC30833a = (InterfaceC30833a) objM87133R2;
            Boolean boolValueOf3 = Boolean.valueOf(m104920s(interfaceC28601c1M101215x));
            Boolean boolValueOf4 = Boolean.valueOf(z13);
            zM87153g = c28655q2.m87153g(interfaceC28601c1M101215x) | c28655q2.m87153g(c22937b) | c28655q2.m87153g(interfaceC39171c) | c28655q2.m87157i(interfaceC30833a);
            objM87133R3 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R3 = new a(interfaceC30833a, interfaceC28601c1M101215x, c22937b, interfaceC39171c, null);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new a(interfaceC30833a, interfaceC28601c1M101215x, c22937b, interfaceC39171c, null);
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87254h(boolValueOf3, boolValueOf4, (InterfaceC4351m) objM87133R3, c28655q2);
            Modifier modifierM3443a2 = AbstractC1108a.m3443a(C2314t.f9131w, interfaceC30833a);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3443a2);
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
            objM87133R4 = c28655q2.m87133R();
            i26 = 12;
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C32940v(i26);
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
            int i37 = TextResource.$stable;
            int i38 = i19 >> 3;
            int i39 = i19 << 9;
            boolean z16 = z13;
            AbstractC30792k.m94678l(null, textResource2, null, textResource, c2886a, null, null, abstractC30784c, textResource3, z16, false, null, 0L, false, i13, 0, i25, false, null, false, false, 0, false, interfaceC21083i2, str, null, null, null, null, null, interfaceC4339a2, function1, c28655q2, (i37 << 24) | (C2886a.f11498d << 12) | (i37 << 3) | (i38 & 112) | (i37 << 9) | (i39 & 7168) | (i39 & 57344) | (AbstractC30784c.f126784a << 21) | ((i19 << 6) & 29360128) | (234881024 & (i19 << 15)) | (1879048192 & i39), (i19 & 57344) | (3670016 & i38), ((i19 >> 12) & 57344) | 3072, ((i19 >> 24) & 112) | 6, 1048493157, 0);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            i24 = i25;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            i24 = i18;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy2.i
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC33108k.m104922u(textResource, c2886a, textResource2, textResource3, i13, abstractC30784c, z4, i24, str, function1, i15, i16, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final boolean m104920s(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m104921t() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m104922u(TextResource textResource, C2886a c2886a, TextResource textResource2, TextResource textResource3, int i13, AbstractC30784c abstractC30784c, boolean z4, int i14, String str, Function1 function1, int i15, int i16, Composer composer, int i17) {
        m104919r(textResource, c2886a, textResource2, textResource3, i13, abstractC30784c, z4, i14, str, function1, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }
}
