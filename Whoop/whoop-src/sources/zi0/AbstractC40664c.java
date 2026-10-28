package zi0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.archv2.feature.domain.EnumC6009o;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import gy0.AbstractC16272a;
import java.io.IOException;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p209i3.C18027i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23112i3;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import ri0.InterfaceC31443b;
import rz0.AbstractC31926e;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ti0.C33842g;
import wb3.AbstractC37056f;
import x30.C37888f1;
import x81.C38072d;
import yo1.C39689b;

/* JADX INFO: renamed from: zi0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lti0/g;", "viewState", "Lkotlin/Function1;", "Lri0/b;", "Ll83/a0;", "onEvent", "e", "(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "g", "Ly3/f;", "a", "F", "STATUS_ICON_SIZE", "b", "STATUS_ICON_GAP", "Lcom/whoop/navigation/models/ApiRequest;", "c", "Lcom/whoop/navigation/models/ApiRequest;", "previewRequest", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40664c {

    /* JADX INFO: renamed from: a */
    private static final float f175578a;

    /* JADX INFO: renamed from: b */
    private static final float f175579b;

    /* JADX INFO: renamed from: c */
    private static final ApiRequest f175580c = new ApiRequest("/v1/items?page=2", (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: zi0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.template.list.PaginationControlViewKt$PaginationControlView$1$1", m100430f = "PaginationControlView.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f175581w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33842g f175582x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f175583y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C33842g c33842g, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f175582x = c33842g;
            this.f175583y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f175582x, this.f175583y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f175581w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f175582x.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC6009o.IDLE) {
                this.f175583y.invoke(new InterfaceC31443b.k(this.f175582x.getNextPageRequest()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zi0.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f175584a;

        static {
            int[] iArr = new int[EnumC6009o.values().length];
            try {
                iArr[EnumC6009o.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6009o.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6009o.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f175584a = iArr;
        }
    }

    static {
        float f13 = 4;
        f175578a = 6 * f13;
        f175579b = 3 * f13;
    }

    /* JADX INFO: renamed from: e */
    public static final void m131987e(C33842g viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1770600597);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            ApiRequest nextPageRequest = viewState.getNextPageRequest();
            int i15 = i14 & 14;
            boolean z13 = i15 == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState));
            int i16 = i14 & 112;
            boolean z14 = z13 | (i16 == 32);
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new a(viewState, onEvent, null);
                c28655q.m87172p0(objM87133R);
            }
            int i17 = ApiRequest.$stable;
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, nextPageRequest);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            int i18 = b.f175584a[viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().ordinal()];
            if (i18 == 1 || i18 == 2) {
                c28655q.m87150e0(1102605679);
                z4 = true;
                AbstractC23112i3.m67090a(AbstractC1102d.m3419p(24, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 2, 0L, 0, 0.0f, c28655q, 390, 56);
                c28655q.m87173q(false);
            } else {
                if (i18 != 3) {
                    throw AbstractC11895b.m32003v(2113774918, c28655q, false);
                }
                c28655q.m87150e0(1102864436);
                m131989g(viewState, onEvent, c28655q, i16 | i17 | i15);
                c28655q.m87173q(false);
                z4 = true;
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40663b(viewState, onEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m131988f(C33842g c33842g, Function1 function1, int i13, Composer composer, int i14) {
        m131987e(c33842g, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final void m131989g(C33842g c33842g, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-100386922);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c33842g) : c28655q.m87157i(c33842g) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentNegativeTrend15(), null, null, null, 0.0f, AbstractC37817c.m121344e(-1237801178, c28655q, new C37888f1(14, c33842g, function1)), c28655q, 12582918, 122);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40663b(c33842g, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m131990h(C33842g c33842g, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        C0209i c0209i;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2;
            float f14 = 8;
            float f15 = ((float) 1.5d) * f14;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f13 * f14, f15);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            C2306l c2306l = C2299e.f9108K;
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(AbstractC16272a.f61940I4, c28655q, 6);
            C0209i c0209i6 = c0209i;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14 * 1, 0.0f, 0.0f, 13);
            float f16 = f175578a;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f16, modifierM3398t);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, i14).getAccentNegativeTrend(), c28655q, 432, 0);
            float f17 = f175579b;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t));
            String messageText = c33842g.getMessageText();
            C2886a c2886aM8421b = c38072d.m121952e(c28655q, i14).getB2();
            long jM125392f = c38072d.m121949b(c28655q, i14).getAccentNegativeTrend();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(messageText, layoutWeightElement, jM125392f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q, 0, i15, 196600);
            C28655q c28655q2 = c28655q;
            c28655q2.m87173q(true);
            String retryActionText = c33842g.getRetryActionText();
            if (retryActionText == null) {
                c28655q2.m87150e0(2077883790);
                c28655q2.m87173q(false);
                z4 = true;
            } else {
                c28655q2.m87150e0(2077883791);
                float f18 = 4;
                Modifier modifierM3411h = AbstractC1102d.m3411h(6 * f18, AbstractC1099a.m3398t(c2314t, f16 + f17, 0.0f, 0.0f, 0.0f, 14));
                C18027i c18027i = new C18027i(0);
                boolean zM87153g = c28655q2.m87153g(function1) | c28655q2.m87157i(c33842g);
                Object objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C39689b(16, function1, c33842g);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3411h, false, null, c18027i, (InterfaceC4339a) objM87133R, 11);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, 48);
                int iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                AbstractC30795n.m94707h(retryActionText, null, c38072d.m121949b(c28655q2, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i14).getBtS(), null, c28655q2, 0, i15, 196602);
                c28655q2 = c28655q2;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13 * f18, c2314t));
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), c28655q2, 6), null, AbstractC1102d.m3419p(f18 * f18, c2314t), c38072d.m121949b(c28655q2, i14).getBrandWhite(), c28655q2, 432, 0);
                z4 = true;
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m131991i(Function1 function1, C33842g c33842g) {
        function1.invoke(new InterfaceC31443b.k(c33842g.getNextPageRequest()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m131992j(C33842g c33842g, Function1 function1, int i13, Composer composer, int i14) {
        m131989g(c33842g, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
