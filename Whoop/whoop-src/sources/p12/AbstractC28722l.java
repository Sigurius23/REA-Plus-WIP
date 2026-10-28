package p12;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c31.AbstractC3926j;
import c31.C3927k;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.model.ParagraphInsets;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import g40.C15326b2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kz0.AbstractC22922c;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import o12.AbstractC27420g;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p180h0.AbstractC16434o3;
import p180h0.AbstractC16486z0;
import p181h2.C16617b;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p512u2.AbstractC34452c0;
import p512u2.C34462h0;
import p512u2.C34472r;
import p512u2.InterfaceC34476v;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: p12.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aw\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0015\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0017\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001b\u0010\u001a\u001a\u00020\u0000*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "shouldShow", "", "pageNumber", "totalScreens", "Lcom/whoop/design/model/ParagraphInsets;", "insets", "isProgressButtonFeatureFlagEnabled", "shouldShowSkip", "Lc31/k;", "viewState", "Lkotlin/Function1;", "Lc31/c;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onStoryBackPress", "onSkipPress", "f", "(ZIILcom/whoop/design/model/ParagraphInsets;ZZLc31/k;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "onStoryNextPress", "l", "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lh2/b;", "screenWidth", "r", "(JI)Z", "Lp12/d0;", "direction", "onboarding-story_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28722l {

    /* JADX INFO: renamed from: p12.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC4339a f116155w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f116156x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f116157y;

        /* JADX INFO: renamed from: p12.l$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C42150a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f116158a;

            static {
                int[] iArr = new int[EnumC28713d0.values().length];
                try {
                    iArr[EnumC28713d0.NEXT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC28713d0.PREVIOUS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f116158a = iArr;
            }
        }

        public a(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC28601c1 interfaceC28601c1) {
            this.f116155w = interfaceC4339a;
            this.f116156x = interfaceC4339a2;
            this.f116157y = interfaceC28601c1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final C23454a0 m87384c(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC28601c1 interfaceC28601c1) {
            int i13 = C42150a.f116158a[AbstractC28722l.m87372i(interfaceC28601c1).ordinal()];
            if (i13 == 1) {
                interfaceC4339a.invoke();
            } else if (i13 == 2) {
                interfaceC4339a2.invoke();
            }
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final C23454a0 m87385d(InterfaceC28601c1 interfaceC28601c1, C34472r change, float f13) {
            AbstractC22676k.m65750j(change, "change");
            change.m108946a();
            if (f13 < 0.0f) {
                AbstractC28722l.m87373j(interfaceC28601c1, EnumC28713d0.NEXT);
            } else if (f13 > 0.0f) {
                AbstractC28722l.m87373j(interfaceC28601c1, EnumC28713d0.PREVIOUS);
            }
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            final InterfaceC4339a interfaceC4339a = this.f116155w;
            final InterfaceC4339a interfaceC4339a2 = this.f116156x;
            final InterfaceC28601c1 interfaceC28601c1 = this.f116157y;
            Object objM46659h = AbstractC16486z0.m46659h(interfaceC34476v, new InterfaceC4339a() { // from class: p12.j
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return AbstractC28722l.a.m87384c(interfaceC4339a, interfaceC4339a2, interfaceC28601c1);
                }
            }, null, new InterfaceC4351m() { // from class: p12.k
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    return AbstractC28722l.a.m87385d(interfaceC28601c1, (C34472r) obj, fFloatValue);
                }
            }, interfaceC30057d, 5);
            return objM46659h == EnumC31071a.f128113w ? objM46659h : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: p12.l$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC4339a f116159w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f116160x;

        public b(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            this.f116159w = interfaceC4339a;
            this.f116160x = interfaceC4339a2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m87387b(int i13, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C16617b c16617b) {
            if (AbstractC28722l.m87381r(c16617b.f63937a, i13)) {
                interfaceC4339a.invoke();
            } else {
                interfaceC4339a2.invoke();
            }
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            final int i13 = (int) (((C34462h0) interfaceC34476v).f144789Y >> 32);
            final InterfaceC4339a interfaceC4339a = this.f116159w;
            final InterfaceC4339a interfaceC4339a2 = this.f116160x;
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new Function1() { // from class: p12.m
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC28722l.b.m87387b(i13, interfaceC4339a, interfaceC4339a2, (C16617b) obj);
                }
            }, interfaceC30057d, 7);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m87369f(boolean z4, int i13, int i14, ParagraphInsets insets, boolean z13, boolean z14, C3927k viewState, Function1 onViewEvent, InterfaceC4339a onStoryBackPress, InterfaceC4339a onSkipPress, Composer composer, int i15) {
        int i16;
        boolean z15;
        C0209i c0209i;
        C2314t c2314t;
        C0213j c0213j;
        C2314t c2314t2;
        AbstractC22676k.m65750j(insets, "insets");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onStoryBackPress, "onStoryBackPress");
        AbstractC22676k.m65750j(onSkipPress, "onSkipPress");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-877815774);
        if ((i15 & 6) == 0) {
            i16 = (c28655q.m87155h(z4) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= c28655q.m87149e(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= (i15 & 4096) == 0 ? c28655q.m87153g(insets) : c28655q.m87157i(insets) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            i16 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i15) == 0) {
            i16 |= c28655q.m87155h(z14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i15) == 0) {
            i16 |= (2097152 & i15) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 1048576 : 524288;
        }
        if ((12582912 & i15) == 0) {
            i16 |= c28655q.m87157i(onViewEvent) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i16 |= c28655q.m87157i(onStoryBackPress) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((805306368 & i15) == 0) {
            i16 |= c28655q.m87157i(onSkipPress) ? 536870912 : 268435456;
        }
        int i17 = i16;
        if (!c28655q.m87135U(i17 & 1, (306783379 & i16) != 306783378)) {
            c28655q.m87138X();
        } else if (z4) {
            c28655q.m87150e0(1046581227);
            C2314t c2314t3 = C2314t.f9131w;
            if (z13) {
                c28655q.m87150e0(1046609499);
                float f13 = 2 * 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t3), 0.0f, f13, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 54);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                C0209i c0209i4 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                if (i13 != 0) {
                    c28655q.m87150e0(-994416314);
                    c2314t = c2314t3;
                    c0209i = c0209i4;
                    c0213j = c0213j2;
                    Modifier modifierM3362g = AbstractC1092a.m3362g(AbstractC1099a.m3398t(c2314t3, 16, 0.0f, 0.0f, 0.0f, 14), false, null, null, onStoryBackPress, 15);
                    C38072d c38072d = C38072d.f163053a;
                    AbstractC15005f3.m43108b(AbstractC13673n.m38571r(c38072d, c28655q, 6), null, modifierM3362g, c38072d.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 48, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c0209i = c0209i4;
                    c2314t = c2314t3;
                    c0213j = c0213j2;
                    c28655q.m87150e0(-993998682);
                    c28655q.m87173q(false);
                }
                if (!(((double) 1.0f) > 0.0d)) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                if (!z14 || i13 == 0) {
                    c2314t2 = c2314t;
                    c28655q.m87150e0(-993623706);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-993879332);
                    c2314t2 = c2314t;
                    C28655q c28655q2 = c28655q;
                    AbstractC27265l0.m82217i(AbstractC1092a.m3362g(c2314t2, false, null, null, onSkipPress, 15), null, AbstractC8693b.m21277k(AbstractC27420g.f110470e), null, null, false, null, null, false, false, null, null, null, c28655q2, TextResource.C8688b.f25889c << 6, 0, 8186);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1102d.m3407d(1.0f, c2314t2));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9112O, c28655q, 54);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                int i18 = i17 >> 18;
                z15 = false;
                AbstractC3926j.m11931e(viewState, onViewEvent, c28655q, C3927k.f16020r | (i18 & 14) | (i18 & 112), 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1048146510);
                float f14 = 8;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t3), ((float) insets.getLeading()) * f14, 0.0f, ((float) insets.getTrailing()) * f14, f14 * f14, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j3 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                C0209i c0209i6 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                AbstractC22922c.m66645b(c2314t3, i13 + 1, i14, 0L, 0L, C25271y.f99162w, 0, 0.0f, null, c28655q, (i17 & 896) | 196614, 472);
                c28655q = c28655q;
                c28655q.m87173q(true);
                z15 = false;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z15);
        } else {
            c28655q.m87150e0(1048754048);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15326b2(z4, i13, i14, insets, z13, z14, viewState, onViewEvent, onStoryBackPress, onSkipPress, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m87370g(boolean z4, int i13, int i14, ParagraphInsets paragraphInsets, boolean z13, boolean z14, C3927k c3927k, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i15, Composer composer, int i16) {
        m87369f(z4, i13, i14, paragraphInsets, z13, z14, c3927k, function1, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i15 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m87371h(InterfaceC4339a onStoryBackPress, InterfaceC4339a onStoryNextPress, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onStoryBackPress, "onStoryBackPress");
        AbstractC22676k.m65750j(onStoryNextPress, "onStoryNextPress");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(434518366);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onStoryBackPress) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onStoryNextPress) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(EnumC28713d0.NONE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3406c(1.0f, AbstractC1136a.m3599a(C2314t.f9131w, "Swipe and Tab")));
            int i15 = i14 & 112;
            int i16 = i14 & 14;
            boolean z4 = (i15 == 32) | (i16 == 4);
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new a(onStoryNextPress, onStoryBackPress, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            C23454a0 c23454a0 = C23454a0.f92919a;
            Modifier modifierM108903b = AbstractC34452c0.m108903b(modifierM3409f, c23454a0, (PointerInputEventHandler) objM87133R2);
            boolean z13 = (i16 == 4) | (i15 == 32);
            Object objM87133R3 = c28655q.m87133R();
            if (z13 || objM87133R3 == c28676v0) {
                objM87133R3 = new b(onStoryBackPress, onStoryNextPress);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC22989q.m66760a(AbstractC34452c0.m108903b(modifierM108903b, c23454a0, (PointerInputEventHandler) objM87133R3), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28719i(onStoryBackPress, onStoryNextPress, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final EnumC28713d0 m87372i(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC28713d0) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m87373j(InterfaceC28601c1 interfaceC28601c1, EnumC28713d0 enumC28713d0) {
        interfaceC28601c1.setValue(enumC28713d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m87374k(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m87371h(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m87375l(InterfaceC4339a onStoryBackPress, InterfaceC4339a onStoryNextPress, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onStoryBackPress, "onStoryBackPress");
        AbstractC22676k.m65750j(onStoryNextPress, "onStoryNextPress");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1856447643);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onStoryBackPress) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onStoryNextPress) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, AbstractC1136a.m3599a(c2314t, "Back Press"));
            if (0.3f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e = modifierM3406c.mo3471e(new LayoutWeightElement(0.3f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.3f, true));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C28718h(onStoryBackPress, 0);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3471e, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28), c28655q, 0);
            Modifier modifierM3406c2 = AbstractC1102d.m3406c(1.0f, AbstractC1136a.m3599a(c2314t, "Forward Press"));
            if (0.7f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e2 = modifierM3406c2.mo3471e(new LayoutWeightElement(0.7f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.7f, true));
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R3;
            boolean z13 = (i14 & 112) == 32;
            Object objM87133R4 = c28655q.m87133R();
            if (z13 || objM87133R4 == c28676v0) {
                objM87133R4 = new C28718h(onStoryNextPress, 1);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3471e2, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R4, 28), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28719i(onStoryBackPress, onStoryNextPress, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m87376m(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m87377n(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m87378o(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m87375l(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m87381r(long j7, int i13) {
        return ((double) Float.intBitsToFloat((int) (j7 >> 32))) <= ((double) i13) * 0.3d;
    }
}
