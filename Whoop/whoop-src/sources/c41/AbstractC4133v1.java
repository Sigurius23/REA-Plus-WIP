package c41;

import a61.C0468a;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import aq1.C1910d;
import b01.C2192m;
import b30.C2609r;
import b91.C2886a;
import bs1.C3603v;
import c31.C3929m;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import d11.AbstractC11471f;
import d11.InterfaceC11466a;
import f01.EnumC13892q1;
import gz0.EnumC16313m0;
import h01.AbstractC16549p;
import h01.AbstractC16557x;
import h01.C16536c;
import h01.EnumC16533a;
import java.util.Arrays;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.error.ErrorCodes;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p181h2.C16617b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17914u0;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23001u;
import p294l3.C23277r0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.v1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u001a?\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000b\u001a\u0013\u0010\u000f\u001a\u00020\b*\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006'²\u0006\u000e\u0010 \u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002²\u0006\u000e\u0010%\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010&\u001a\u00020#8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc41/w1;", "viewState", "", "isExpandedView", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "B", "(Landroidx/compose/ui/Modifier;Lc41/w1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onOverflow", "r", "Ll0/u;", "o", "(Ll0/u;Landroidx/compose/runtime/Composer;I)V", "", "Ll83/k;", "", "Li2/x;", "a", "[Ll83/k;", "GRADIENT_COLOR_STOPS", "Ly3/f;", "b", "F", "GRADIENT_SIZE", "Lh2/b;", "c", "J", "GRADIENT_CENTER", "hasOverflow", "isExpanded", "maxHeight", "", "titleMaxLines", "bodyMaxLinesWhenExpanded", "bodyMaxLines", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4133v1 {

    /* JADX INFO: renamed from: a */
    private static final C23465k[] f16809a = {new C23465k(Float.valueOf(0.0f), new C17919x(AbstractC17918w0.m51517e(4278251935L))), new C23465k(Float.valueOf(0.6f), new C17919x(AbstractC17918w0.m51515c(1298640614))), new C23465k(Float.valueOf(0.9f), new C17919x(AbstractC17918w0.m51515c(16777215)))};

    /* JADX INFO: renamed from: b */
    private static final float f16810b = 88 * 4;

    /* JADX INFO: renamed from: c */
    private static final long f16811c = C16617b.m47185a(0.0f, 0.0f, 9187343241974906880L, 1);

    /* JADX INFO: renamed from: c41.v1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f16812w = new a();

        /* JADX INFO: renamed from: a */
        public final long m12799a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m12799a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c41.v1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16813a;

        static {
            int[] iArr = new int[EnumC13892q1.values().length];
            try {
                iArr[EnumC13892q1.ONBOARDING_WITH_BORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13892q1.HAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13892q1.PROMO_LINEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC13892q1.SUFFICIENT_WITH_BORDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16813a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m12759A(Modifier modifier, C4140w1 c4140w1, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m12790r(modifier, c4140w1, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:72:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x012b  */
    /* JADX WARN: Code duplicated, block: B:76:0x012d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0137  */
    /* JADX WARN: Code duplicated, block: B:83:0x018e  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: B */
    public static final void m12760B(Modifier modifier, C4140w1 viewState, boolean z4, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        boolean z14;
        C28655q c28655q;
        boolean z15;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int i16;
        InterfaceC11466a borderInformation;
        C13825t c13825tM30800y;
        C13825t c13825t;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R4;
        int i17;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-306723382);
        int i18 = i14 & 1;
        if (i18 != 0) {
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
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87157i(onViewEvent)) {
                    i17 = 2048;
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
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i19 != 0) {
                    z13 = false;
                }
                i16 = b.f16813a[viewState.getBackgroundStyle().ordinal()];
                if (i16 != 1 || i16 == 2 || i16 == 3 || i16 == 4) {
                    c28655q2.m87150e0(2094590970);
                    borderInformation = viewState.getStyle().getBorderInformation();
                    if (borderInformation == null) {
                        c28655q2.m87150e0(2094590969);
                        c28655q2.m87173q(false);
                        c13825tM30800y = null;
                    } else {
                        c28655q2.m87150e0(1591588104);
                        c13825tM30800y = AbstractC11471f.m30800y(borderInformation, (float) 1.5d, c28655q2, 48);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(false);
                    c13825t = c13825tM30800y;
                } else {
                    c28655q2.m87150e0(2094636787);
                    c28655q2.m87173q(false);
                    c13825t = null;
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z13, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87264r(new C2192m(7, interfaceC28601c1));
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                if (viewState.getStyle() == EnumC16533a.ADVANCED_LABS) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zM87157i = c28655q2.m87157i(viewState);
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | zM87157i;
                objM87133R4 = c28655q2.m87133R();
                if (z18 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C3603v(viewState, onViewEvent, 11);
                    c28655q2.m87172p0(objM87133R4);
                }
                c28655q = c28655q2;
                modifier2 = modifier4;
                AbstractC31926e.m99375j(AbstractC1772c1.m5391i(modifier4, false, null, (InterfaceC4339a) objM87133R4, 3), null, C38072d.f163053a.m121949b(c28655q2, 6).getTransparent(), AbstractC33253j.m105489e(3 * 4), c13825t, null, viewState.getStyle().getElevation(), AbstractC37817c.m121344e(2094843226, c28655q2, new C4119t1(viewState, interfaceC28670t2, z16, interfaceC28601c1, interfaceC28601c2, onViewEvent, 0)), c28655q, 12582912, 34);
                z15 = z13;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4112s1(modifier3, viewState, z15, onViewEvent, i13, i14, 1);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i13 & 3072) == 0) {
            if (c28655q2.m87157i(onViewEvent)) {
                i17 = 2048;
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
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i18 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i19 != 0) {
                z13 = false;
            }
            i16 = b.f16813a[viewState.getBackgroundStyle().ordinal()];
            if (i16 != 1) {
                c28655q2.m87150e0(2094590970);
                borderInformation = viewState.getStyle().getBorderInformation();
                if (borderInformation == null) {
                    c28655q2.m87150e0(2094590969);
                    c28655q2.m87173q(false);
                    c13825tM30800y = null;
                } else {
                    c28655q2.m87150e0(1591588104);
                    c13825tM30800y = AbstractC11471f.m30800y(borderInformation, (float) 1.5d, c28655q2, 48);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(false);
                c13825t = c13825tM30800y;
            } else {
                c28655q2.m87150e0(2094590970);
                borderInformation = viewState.getStyle().getBorderInformation();
                if (borderInformation == null) {
                    c28655q2.m87150e0(2094590969);
                    c28655q2.m87173q(false);
                    c13825tM30800y = null;
                } else {
                    c28655q2.m87150e0(1591588104);
                    c13825tM30800y = AbstractC11471f.m30800y(borderInformation, (float) 1.5d, c28655q2, 48);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(false);
                c13825t = c13825tM30800y;
            }
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95647w(z13, c28655q2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87264r(new C2192m(7, interfaceC28601c1));
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) objM87133R3;
            if (viewState.getStyle() == EnumC16533a.ADVANCED_LABS) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean zM87157i2 = c28655q2.m87157i(viewState);
            if ((i15 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z17 | zM87157i2;
            objM87133R4 = c28655q2.m87133R();
            if (z18) {
                objM87133R4 = new C3603v(viewState, onViewEvent, 11);
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C3603v(viewState, onViewEvent, 11);
                c28655q2.m87172p0(objM87133R4);
            }
            c28655q = c28655q2;
            modifier2 = modifier4;
            AbstractC31926e.m99375j(AbstractC1772c1.m5391i(modifier4, false, null, (InterfaceC4339a) objM87133R4, 3), null, C38072d.f163053a.m121949b(c28655q2, 6).getTransparent(), AbstractC33253j.m105489e(3 * 4), c13825t, null, viewState.getStyle().getElevation(), AbstractC37817c.m121344e(2094843226, c28655q2, new C4119t1(viewState, interfaceC28670t3, z16, interfaceC28601c1, interfaceC28601c3, onViewEvent, 0)), c28655q, 12582912, 34);
            z15 = z13;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z15 = z13;
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4112s1(modifier3, viewState, z15, onViewEvent, i13, i14, 1);
        }
    }

    /* JADX INFO: renamed from: C */
    private static final boolean m12761C(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m12762D(Modifier modifier, C4140w1 c4140w1, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m12760B(modifier, c4140w1, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final void m12763E(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: F */
    private static final boolean m12764F(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: G */
    private static final void m12765G(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C39174f m12766H(InterfaceC28601c1 interfaceC28601c1) {
        return new C39174f(m12764F(interfaceC28601c1) ? ErrorCodes.WebsocketMethodErrors.cServerErrors : C16536c.f63627a.m46720b());
    }

    /* JADX INFO: renamed from: I */
    private static final float m12767I(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m12768J(C4140w1 c4140w1, Function1 function1) {
        GenericInteraction genericInteractionM12867j = c4140w1.getGenericInteraction();
        if (genericInteractionM12867j != null) {
            function1.invoke(genericInteractionM12867j);
        } else {
            C9598e c9598eM12864g = c4140w1.getDestination();
            if (c9598eM12864g != null) {
                function1.invoke(c9598eM12864g);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m12769K(C4140w1 c4140w1, InterfaceC28670t2 interfaceC28670t2, boolean z4, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function1, Composer composer, int i13) {
        InterfaceC39332e endIconColor;
        C28676v0 c28676v0;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 4;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3412i(AbstractC1091c.m3355a(c4140w1.getStyle().getStyleModifier(), C16536c.f63627a.m46719a(), 2), 35 * f13, m12767I(interfaceC28670t2)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            C1100b c1100b = C1100b.f4583a;
            if (z4) {
                c28655q.m87150e0(-2080136916);
                m12787o(c1100b, c28655q, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2080085022);
                c28655q.m87173q(false);
            }
            boolean zM12764F = m12764F(interfaceC28601c1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R == c28676v1) {
                objM87133R = new C1910d(7, interfaceC28601c2);
                c28655q.m87172p0(objM87133R);
            }
            m12790r(null, c4140w1, zM12764F, (Function1) objM87133R, c28655q, 3072, 1);
            EnumC16313m0 enumC16313m0M12866i = c4140w1.getEndIcon();
            if (enumC16313m0M12866i == null) {
                c28655q.m87150e0(-2079780076);
                c28655q.m87173q(false);
                c28676v0 = c28676v1;
            } else {
                c28655q.m87150e0(-2079780075);
                Modifier modifierM3419p = AbstractC1102d.m3419p(5 * f13, AbstractC1136a.m3599a(C2314t.f9131w, "entry_point_end_icon"));
                boolean zM87149e = c28655q.m87149e(enumC16313m0M12866i.ordinal()) | c28655q.m87157i(c4140w1) | c28655q.m87153g(function1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87149e || objM87133R2 == c28676v1) {
                    objM87133R2 = new C3718c(enumC16313m0M12866i, c4140w1, function1, 25);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM5391i = AbstractC1772c1.m5391i(modifierM3419p, false, null, (InterfaceC4339a) objM87133R2, 3);
                if (enumC16313m0M12866i == EnumC16313m0.CROSS) {
                    c28655q.m87150e0(1293112717);
                    Object objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v1) {
                        objM87133R3 = a.f16812w;
                        c28655q.m87172p0(objM87133R3);
                    }
                    endIconColor = p745y81.Function1.m125323a((Function1) objM87133R3);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1293114208);
                    c28655q.m87173q(false);
                    endIconColor = c4140w1.getStyle().getEndIconColor();
                }
                InterfaceC39332e interfaceC39332e = endIconColor;
                c28676v0 = c28676v1;
                AbstractC16557x.m46854i(c1100b, modifierM5391i, AbstractC1099a.m3381c(0.0f, ((float) (c4140w1.getNavigationTag() != null ? 2.7d : 2.5d)) * 8, 2 * 8, 0.0f, 9), enumC16313m0M12866i, interfaceC39332e, c28655q, 6, 0);
                c28655q.m87173q(false);
            }
            if (m12761C(interfaceC28601c2) || m12764F(interfaceC28601c1)) {
                c28655q.m87150e0(-2078639244);
                boolean zM12764F2 = m12764F(interfaceC28601c1);
                Object objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C2192m(8, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC16557x.m46850e(c1100b, null, zM12764F2, false, (InterfaceC4339a) objM87133R4, c28655q, 24582, 5);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2078472030);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m12770L(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m12763E(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m12771M(EnumC16313m0 enumC16313m0, C4140w1 c4140w1, Function1 function1) {
        if (enumC16313m0 == EnumC16313m0.CROSS) {
            Action actionM12865h = c4140w1.getDismissAction();
            if (actionM12865h != null) {
                function1.invoke(actionM12865h);
            }
            String id4 = c4140w1.getId();
            if (id4 != null) {
                function1.invoke(new C4091p1(id4));
            }
        } else {
            C9598e c9598eM12864g = c4140w1.getDestination();
            if (c9598eM12864g != null) {
                function1.invoke(c9598eM12864g);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m12772N(InterfaceC28601c1 interfaceC28601c1) {
        m12765G(interfaceC28601c1, !m12764F(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m12787o(InterfaceC23001u interfaceC23001u, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(interfaceC23001u, "<this>");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1418155394);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f16810b);
            C17909s c17909s = AbstractC17911t.f69612b;
            C23465k[] c23465kArr = f16809a;
            C17914u0 c17914u0M51490h = C17909s.m51490h(c17909s, (C23465k[]) Arrays.copyOf(c23465kArr, c23465kArr.length), f16811c, fMo743q0 / 1.4f, 8);
            Modifier modifierMo3401b = interfaceC23001u.mo3401b(C2314t.f9131w);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C3929m(10);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1127a.m3486a(modifierMo3401b, (Function1) objM87133R), c17914u0M51490h, null, 0.0f, 6), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4126u1(interfaceC23001u, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m12788p(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51551a(0.4f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m12789q(InterfaceC23001u interfaceC23001u, int i13, Composer composer, int i14) {
        m12787o(interfaceC23001u, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0204  */
    /* JADX WARN: Code duplicated, block: B:106:0x0210  */
    /* JADX WARN: Code duplicated, block: B:109:0x0238  */
    /* JADX WARN: Code duplicated, block: B:110:0x023a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0241 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0243  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:124:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:127:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:128:0x0303  */
    /* JADX WARN: Code duplicated, block: B:131:0x0312  */
    /* JADX WARN: Code duplicated, block: B:133:0x0320  */
    /* JADX WARN: Code duplicated, block: B:140:0x0380  */
    /* JADX WARN: Code duplicated, block: B:141:0x0384  */
    /* JADX WARN: Code duplicated, block: B:144:0x0391  */
    /* JADX WARN: Code duplicated, block: B:146:0x039f  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:153:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:159:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:163:0x040e  */
    /* JADX WARN: Code duplicated, block: B:166:0x043a  */
    /* JADX WARN: Code duplicated, block: B:167:0x043c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0443  */
    /* JADX WARN: Code duplicated, block: B:174:0x044b  */
    /* JADX WARN: Code duplicated, block: B:177:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:179:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:181:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:184:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x0125  */
    /* JADX WARN: Code duplicated, block: B:74:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Code duplicated, block: B:80:0x014d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0161  */
    /* JADX WARN: Code duplicated, block: B:85:0x0181  */
    /* JADX WARN: Code duplicated, block: B:87:0x0193  */
    /* JADX WARN: Code duplicated, block: B:88:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ef  */
    /* JADX WARN: Instruction removed from duplicated block: B:118:0x02c5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v19, types: [int] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r9v11, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r9v12, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r9v9, types: [androidx.compose.runtime.Composer, p1.q] */
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
    /* JADX INFO: renamed from: r */
    public static final void m12790r(Modifier modifier, C4140w1 viewState, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        int i16;
        Function1 function2;
        int i17;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        Function1 function3;
        ?? r10;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean z16;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28670t2 interfaceC28670t2;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        int iM12794v;
        float f13;
        C22957g c22957g;
        C2305k c2305k;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        Modifier modifier4;
        C0209i c0209i4;
        TextResource textResourceM12871n;
        Modifier modifierM3409f;
        C2314t c2314t2;
        Modifier modifierMo3471e;
        int iHashCode2;
        C0209i c0209i5;
        boolean z17;
        Object objM87133R3;
        C2314t c2314t3;
        C0209i c0209i6;
        C22957g c22957g2;
        C2305k c2305k2;
        Function1 function5;
        C28676v0 c28676v1;
        ?? r14;
        C28655q c28655q;
        InterfaceC25312u interfaceC25312uM12869l;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i7;
        boolean z18;
        C28655q c28655q2;
        C28655q c28655q3;
        ?? r15;
        C2314t c2314t4;
        int iHashCode4;
        double d3;
        int iHashCode5;
        ?? r16;
        Object objM87133R4;
        Function1 function6;
        ?? r17;
        AbstractC22403o abstractC22403oM12868k;
        ?? r18;
        Object objM87133R5;
        C2306l c2306l = C2299e.f9108K;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-1390113160);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q4.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87157i(viewState) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q4.m87155h(z13) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q4.m87157i(function2)) {
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
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i18 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i19 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C3929m(11);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87264r(new C4105r1(z16, 0));
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11895b.m32005x(100, c28655q4);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (z16) {
                        iM12794v = m12794v(interfaceC28601c1);
                    } else {
                        iM12794v = 5;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30589c = AbstractC11352g.m30589c(iM12794v, c28655q4);
                    float f14 = 8;
                    f13 = ((float) 2.5d) * f14;
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3393o(new C22976l1(f13, f13, 3 * f14, f13), modifier2));
                    c22957g = AbstractC22977m.f90652c;
                    c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3409f2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    boolean z19 = z16;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        modifier4 = modifier2;
                    } else {
                        modifier4 = modifier2;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                        textResourceM12871n = viewState.getTitle();
                        if (textResourceM12871n == null) {
                            c28655q4.m87150e0(1139561213);
                            r14 = 0;
                            c28655q4.m87173q(false);
                            c28676v1 = c28676v0;
                            function5 = function4;
                            c2305k2 = c2305k;
                            c2314t3 = c2314t;
                            c0209i7 = c0209i3;
                            c22957g2 = c22957g;
                            r15 = 1;
                            c0213j2 = c0213j;
                            c28655q3 = c28655q4;
                        } else {
                            c28655q4.m87150e0(1139561214);
                            modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                            if (viewState.getNavigationTag() != null) {
                                c2314t2 = c2314t;
                                modifierMo3471e = modifierM3409f.mo3471e(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11));
                            } else {
                                c2314t2 = c2314t;
                                modifierMo3471e = modifierM3409f.mo3471e(c2314t2);
                            }
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
                            if (c28655q4.f115903S && AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                                c0209i5 = c0209i3;
                            } else {
                                c0209i5 = c0209i3;
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
                            if (0.9f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(0.9f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.9f, true);
                            String strM21274h = AbstractC8693b.m21274h(textResourceM12871n, c28655q4, 0);
                            C38072d c38072d = C38072d.f163053a;
                            long jM125430y = c38072d.m121949b(c28655q4, 6).getBrandWhite();
                            C2886a c2886aM8420a = c38072d.m121952e(c28655q4, 6).getB1();
                            int iM12793u = m12793u(interfaceC28670t2);
                            if ((i15 & 7168) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R3 = c28655q4.m87133R();
                            if (z17 || objM87133R3 == c28676v0) {
                                objM87133R3 = new C0468a(function4, 17);
                                c28655q4.m87172p0(objM87133R3);
                            }
                            c2314t3 = c2314t2;
                            c0209i6 = c0209i5;
                            c22957g2 = c22957g;
                            c2305k2 = c2305k;
                            function5 = function4;
                            c28676v1 = c28676v0;
                            r14 = 0;
                            AbstractC30795n.m94707h(strM21274h, layoutWeightElement, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12793u, 0, (Function1) objM87133R3, c2886aM8420a, null, c28655q4, 0, 48, 153592);
                            c28655q = c28655q4;
                            interfaceC25312uM12869l = viewState.getNavigationTag();
                            if (interfaceC25312uM12869l == null) {
                                c28655q.m87150e0(-1695816015);
                                c28655q.m87173q(false);
                                c0213j2 = c0213j;
                                c0209i7 = c0209i6;
                                z18 = true;
                                c28655q2 = c28655q;
                            } else {
                                c28655q.m87150e0(-1695816014);
                                if (0.4f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, false);
                                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                iHashCode3 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c0213j2 = c0213j;
                                    c28655q.m87163l(c0213j2);
                                } else {
                                    c0213j2 = c0213j;
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                                if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                    c0209i7 = c0209i6;
                                } else {
                                    c0209i7 = c0209i6;
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                                AbstractC25303l.m74291r(interfaceC25312uM12869l, null, null, null, c28655q, 0, 14);
                                C28655q c28655q5 = c28655q;
                                z18 = true;
                                c28655q5.m87173q(true);
                                c28655q5.m87173q(false);
                                c28655q2 = c28655q5;
                            }
                            c28655q2.m87173q(z18);
                            c28655q2.m87173q(false);
                            r15 = z18;
                            c28655q3 = c28655q2;
                        }
                        c2314t4 = c2314t3;
                        AbstractC22953f.m66715b(c28655q3, AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, ((float) r15) * r23, 7));
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q3, 54);
                        iHashCode4 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierM3409f3);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N4);
                        d3 = 1.0f;
                        if (d3 <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, r14);
                        iHashCode5 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement3);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m5);
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode5))) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N5);
                        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t4, 0.0f, ((float) 0.5d) * f14, 0.0f, 0.0f, 13);
                        if (d3 <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3398t, r14, 1.0f);
                        String strM21274h2 = AbstractC8693b.m21274h(viewState.getBody(), c28655q3, r14);
                        C38072d c38072d2 = C38072d.f163053a;
                        long jM125385c1 = c38072d2.m121949b(c28655q3, 6).getWhite70();
                        C2886a c2886aM8421b = c38072d2.m121952e(c28655q3, 6).getB2();
                        int iM12796x = m12796x(interfaceC28670t2M30589c);
                        if ((i15 & 7168) == 2048) {
                            r16 = 1;
                        } else {
                            r16 = r14;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (r16 == 0 || objM87133R4 == c28676v1) {
                            function6 = function5;
                            objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            function6 = function5;
                        }
                        C28655q c28655q6 = c28655q3;
                        AbstractC30795n.m94707h(strM21274h2, modifierM31988g, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12796x, 0, (Function1) objM87133R4, c2886aM8421b, null, c28655q6, 0, 48, 153592);
                        Function1 function7 = function6;
                        AbstractC16549p.m46783q(viewState.getCtaText(), viewState.getCtaIcon(), viewState.getStyle().getButtonColor(), z19, function7, c28655q6, (i15 << 3) & 64512, 0);
                        r17 = c28655q6;
                        r17.m87173q(true);
                        abstractC22403oM12868k = viewState.getImage();
                        if (abstractC22403oM12868k == null) {
                            r17.m87150e0(986656915);
                            r17.m87173q(r14);
                            r18 = r17;
                        } else {
                            r17.m87150e0(986656916);
                            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM12868k, null, null, r17, 0, 3), null, AbstractC1102d.m3419p(25 * 4, c2314t4), null, null, 0.0f, null, r17, 432, 120);
                            ?? r19 = r17;
                            r19.m87173q(r14);
                            r18 = r19;
                        }
                        r18.m87173q(true);
                        r18.m87173q(true);
                        z15 = z19;
                        modifier3 = modifier4;
                        function3 = function7;
                        r10 = r18;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                    textResourceM12871n = viewState.getTitle();
                    if (textResourceM12871n == null) {
                        c28655q4.m87150e0(1139561213);
                        r14 = 0;
                        c28655q4.m87173q(false);
                        c28676v1 = c28676v0;
                        function5 = function4;
                        c2305k2 = c2305k;
                        c2314t3 = c2314t;
                        c0209i7 = c0209i3;
                        c22957g2 = c22957g;
                        r15 = 1;
                        c0213j2 = c0213j;
                        c28655q3 = c28655q4;
                    } else {
                        c28655q4.m87150e0(1139561214);
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (viewState.getNavigationTag() != null) {
                            c2314t2 = c2314t;
                            modifierMo3471e = modifierM3409f.mo3471e(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11));
                        } else {
                            c2314t2 = c2314t;
                            modifierMo3471e = modifierM3409f.mo3471e(c2314t2);
                        }
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m6);
                        if (c28655q4.f115903S) {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        } else {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N6);
                        if (0.9f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(0.9f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.9f, true);
                        String strM21274h3 = AbstractC8693b.m21274h(textResourceM12871n, c28655q4, 0);
                        C38072d c38072d3 = C38072d.f163053a;
                        long jM125430y2 = c38072d3.m121949b(c28655q4, 6).getBrandWhite();
                        C2886a c2886aM8420a2 = c38072d3.m121952e(c28655q4, 6).getB1();
                        int iM12793u2 = m12793u(interfaceC28670t2);
                        if ((i15 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R3 = c28655q4.m87133R();
                        if (z17) {
                            objM87133R3 = new C0468a(function4, 17);
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C0468a(function4, 17);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        c2314t3 = c2314t2;
                        c0209i6 = c0209i5;
                        c22957g2 = c22957g;
                        c2305k2 = c2305k;
                        function5 = function4;
                        c28676v1 = c28676v0;
                        r14 = 0;
                        AbstractC30795n.m94707h(strM21274h3, layoutWeightElement4, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12793u2, 0, (Function1) objM87133R3, c2886aM8420a2, null, c28655q4, 0, 48, 153592);
                        c28655q = c28655q4;
                        interfaceC25312uM12869l = viewState.getNavigationTag();
                        if (interfaceC25312uM12869l == null) {
                            c28655q.m87150e0(-1695816015);
                            c28655q.m87173q(false);
                            c0213j2 = c0213j;
                            c0209i7 = c0209i6;
                            z18 = true;
                            c28655q2 = c28655q;
                        } else {
                            c28655q.m87150e0(-1695816014);
                            if (0.4f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, false);
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, layoutWeightElement5);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c0213j2 = c0213j;
                                c28655q.m87163l(c0213j2);
                            } else {
                                c0213j2 = c0213j;
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                            if (c28655q.f115903S) {
                                c0209i7 = c0209i6;
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                            } else {
                                c0209i7 = c0209i6;
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                            AbstractC25303l.m74291r(interfaceC25312uM12869l, null, null, null, c28655q, 0, 14);
                            C28655q c28655q7 = c28655q;
                            z18 = true;
                            c28655q7.m87173q(true);
                            c28655q7.m87173q(false);
                            c28655q2 = c28655q7;
                        }
                        c28655q2.m87173q(z18);
                        c28655q2.m87173q(false);
                        r15 = z18;
                        c28655q3 = c28655q2;
                    }
                    c2314t4 = c2314t3;
                    AbstractC22953f.m66715b(c28655q3, AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, ((float) r15) * r23, 7));
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q3, 54);
                    iHashCode4 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, modifierM3409f4);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m8);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N8);
                    d3 = 1.0f;
                    if (d3 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, r14);
                    iHashCode5 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement6);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m9);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N9);
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t4, 0.0f, ((float) 0.5d) * f14, 0.0f, 0.0f, 13);
                    if (d3 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g2 = AbstractC11895b.m31988g(modifierM3398t2, r14, 1.0f);
                    String strM21274h4 = AbstractC8693b.m21274h(viewState.getBody(), c28655q3, r14);
                    C38072d c38072d4 = C38072d.f163053a;
                    long jM125385c2 = c38072d4.m121949b(c28655q3, 6).getWhite70();
                    C2886a c2886aM8421b2 = c38072d4.m121952e(c28655q3, 6).getB2();
                    int iM12796x2 = m12796x(interfaceC28670t2M30589c);
                    if ((i15 & 7168) == 2048) {
                        r16 = 1;
                    } else {
                        r16 = r14;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (r16 == 0) {
                        function6 = function5;
                        objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        function6 = function5;
                        objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    C28655q c28655q8 = c28655q3;
                    AbstractC30795n.m94707h(strM21274h4, modifierM31988g2, jM125385c2, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12796x2, 0, (Function1) objM87133R4, c2886aM8421b2, null, c28655q8, 0, 48, 153592);
                    Function1 function8 = function6;
                    AbstractC16549p.m46783q(viewState.getCtaText(), viewState.getCtaIcon(), viewState.getStyle().getButtonColor(), z19, function8, c28655q8, (i15 << 3) & 64512, 0);
                    r17 = c28655q8;
                    r17.m87173q(true);
                    abstractC22403oM12868k = viewState.getImage();
                    if (abstractC22403oM12868k == null) {
                        r17.m87150e0(986656915);
                        r17.m87173q(r14);
                        r18 = r17;
                    } else {
                        r17.m87150e0(986656916);
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM12868k, null, null, r17, 0, 3), null, AbstractC1102d.m3419p(25 * 4, c2314t4), null, null, 0.0f, null, r17, 432, 120);
                        ?? r110 = r17;
                        r110.m87173q(r14);
                        r18 = r110;
                    }
                    r18.m87173q(true);
                    r18.m87173q(true);
                    z15 = z19;
                    modifier3 = modifier4;
                    function3 = function8;
                    r10 = r18;
                } else {
                    c28655q4.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                    function3 = function2;
                    r10 = c28655q4;
                }
                c28677v1M87180u = r10.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4112s1(modifier3, viewState, z15, function3, i13, i14, 0);
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if (i19 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C3929m(11);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87264r(new C4105r1(z16, 0));
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
                objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11895b.m32005x(100, c28655q4);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (z16) {
                    iM12794v = m12794v(interfaceC28601c1);
                } else {
                    iM12794v = 5;
                }
                InterfaceC28670t2 interfaceC28670t2M30589c2 = AbstractC11352g.m30589c(iM12794v, c28655q4);
                float f15 = 8;
                f13 = ((float) 2.5d) * f15;
                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3393o(new C22976l1(f13, f13, 3 * f15, f13), modifier2));
                c22957g = AbstractC22977m.f90652c;
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, modifierM3409f5);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                boolean z110 = z16;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a4);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m10);
                c0209i3 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    modifier4 = modifier2;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N10);
                    textResourceM12871n = viewState.getTitle();
                    if (textResourceM12871n == null) {
                        c28655q4.m87150e0(1139561213);
                        r14 = 0;
                        c28655q4.m87173q(false);
                        c28676v1 = c28676v0;
                        function5 = function4;
                        c2305k2 = c2305k;
                        c2314t3 = c2314t;
                        c0209i7 = c0209i3;
                        c22957g2 = c22957g;
                        r15 = 1;
                        c0213j2 = c0213j;
                        c28655q3 = c28655q4;
                    } else {
                        c28655q4.m87150e0(1139561214);
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (viewState.getNavigationTag() != null) {
                            c2314t2 = c2314t;
                            modifierMo3471e = modifierM3409f.mo3471e(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11));
                        } else {
                            c2314t2 = c2314t;
                            modifierMo3471e = modifierM3409f.mo3471e(c2314t2);
                        }
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11);
                        if (c28655q4.f115903S) {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        } else {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11);
                        if (0.9f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(0.9f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.9f, true);
                        String strM21274h5 = AbstractC8693b.m21274h(textResourceM12871n, c28655q4, 0);
                        C38072d c38072d5 = C38072d.f163053a;
                        long jM125430y3 = c38072d5.m121949b(c28655q4, 6).getBrandWhite();
                        C2886a c2886aM8420a3 = c38072d5.m121952e(c28655q4, 6).getB1();
                        int iM12793u3 = m12793u(interfaceC28670t2);
                        if ((i15 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R3 = c28655q4.m87133R();
                        if (z17) {
                            objM87133R3 = new C0468a(function4, 17);
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C0468a(function4, 17);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        c2314t3 = c2314t2;
                        c0209i6 = c0209i5;
                        c22957g2 = c22957g;
                        c2305k2 = c2305k;
                        function5 = function4;
                        c28676v1 = c28676v0;
                        r14 = 0;
                        AbstractC30795n.m94707h(strM21274h5, layoutWeightElement7, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12793u3, 0, (Function1) objM87133R3, c2886aM8420a3, null, c28655q4, 0, 48, 153592);
                        c28655q = c28655q4;
                        interfaceC25312uM12869l = viewState.getNavigationTag();
                        if (interfaceC25312uM12869l == null) {
                            c28655q.m87150e0(-1695816015);
                            c28655q.m87173q(false);
                            c0213j2 = c0213j;
                            c0209i7 = c0209i6;
                            z18 = true;
                            c28655q2 = c28655q;
                        } else {
                            c28655q.m87150e0(-1695816014);
                            if (0.4f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, false);
                            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, layoutWeightElement8);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c0213j2 = c0213j;
                                c28655q.m87163l(c0213j2);
                            } else {
                                c0213j2 = c0213j;
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
                            if (c28655q.f115903S) {
                                c0209i7 = c0209i6;
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                            } else {
                                c0209i7 = c0209i6;
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                            AbstractC25303l.m74291r(interfaceC25312uM12869l, null, null, null, c28655q, 0, 14);
                            C28655q c28655q9 = c28655q;
                            z18 = true;
                            c28655q9.m87173q(true);
                            c28655q9.m87173q(false);
                            c28655q2 = c28655q9;
                        }
                        c28655q2.m87173q(z18);
                        c28655q2.m87173q(false);
                        r15 = z18;
                        c28655q3 = c28655q2;
                    }
                    c2314t4 = c2314t3;
                    AbstractC22953f.m66715b(c28655q3, AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, ((float) r15) * r23, 7));
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q3, 54);
                    iHashCode4 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q3.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q3, modifierM3409f6);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m13);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N13);
                    d3 = 1.0f;
                    if (d3 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement9 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, r14);
                    iHashCode5 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q3.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement9);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m14);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N14);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t4, 0.0f, ((float) 0.5d) * f15, 0.0f, 0.0f, 13);
                    if (d3 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g3 = AbstractC11895b.m31988g(modifierM3398t3, r14, 1.0f);
                    String strM21274h6 = AbstractC8693b.m21274h(viewState.getBody(), c28655q3, r14);
                    C38072d c38072d6 = C38072d.f163053a;
                    long jM125385c3 = c38072d6.m121949b(c28655q3, 6).getWhite70();
                    C2886a c2886aM8421b3 = c38072d6.m121952e(c28655q3, 6).getB2();
                    int iM12796x3 = m12796x(interfaceC28670t2M30589c2);
                    if ((i15 & 7168) == 2048) {
                        r16 = 1;
                    } else {
                        r16 = r14;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (r16 == 0) {
                        function6 = function5;
                        objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        function6 = function5;
                        objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    C28655q c28655q10 = c28655q3;
                    AbstractC30795n.m94707h(strM21274h6, modifierM31988g3, jM125385c3, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12796x3, 0, (Function1) objM87133R4, c2886aM8421b3, null, c28655q10, 0, 48, 153592);
                    Function1 function9 = function6;
                    AbstractC16549p.m46783q(viewState.getCtaText(), viewState.getCtaIcon(), viewState.getStyle().getButtonColor(), z110, function9, c28655q10, (i15 << 3) & 64512, 0);
                    r17 = c28655q10;
                    r17.m87173q(true);
                    abstractC22403oM12868k = viewState.getImage();
                    if (abstractC22403oM12868k == null) {
                        r17.m87150e0(986656915);
                        r17.m87173q(r14);
                        r18 = r17;
                    } else {
                        r17.m87150e0(986656916);
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM12868k, null, null, r17, 0, 3), null, AbstractC1102d.m3419p(25 * 4, c2314t4), null, null, 0.0f, null, r17, 432, 120);
                        ?? r111 = r17;
                        r111.m87173q(r14);
                        r18 = r111;
                    }
                    r18.m87173q(true);
                    r18.m87173q(true);
                    z15 = z110;
                    modifier3 = modifier4;
                    function3 = function9;
                    r10 = r18;
                } else {
                    modifier4 = modifier2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N10);
                textResourceM12871n = viewState.getTitle();
                if (textResourceM12871n == null) {
                    c28655q4.m87150e0(1139561213);
                    r14 = 0;
                    c28655q4.m87173q(false);
                    c28676v1 = c28676v0;
                    function5 = function4;
                    c2305k2 = c2305k;
                    c2314t3 = c2314t;
                    c0209i7 = c0209i3;
                    c22957g2 = c22957g;
                    r15 = 1;
                    c0213j2 = c0213j;
                    c28655q3 = c28655q4;
                } else {
                    c28655q4.m87150e0(1139561214);
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (viewState.getNavigationTag() != null) {
                        c2314t2 = c2314t;
                        modifierMo3471e = modifierM3409f.mo3471e(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11));
                    } else {
                        c2314t2 = c2314t;
                        modifierMo3471e = modifierM3409f.mo3471e(c2314t2);
                    }
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q4.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m15);
                    if (c28655q4.f115903S) {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    } else {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N15);
                    if (0.9f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement10 = new LayoutWeightElement(0.9f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.9f, true);
                    String strM21274h7 = AbstractC8693b.m21274h(textResourceM12871n, c28655q4, 0);
                    C38072d c38072d7 = C38072d.f163053a;
                    long jM125430y4 = c38072d7.m121949b(c28655q4, 6).getBrandWhite();
                    C2886a c2886aM8420a4 = c38072d7.m121952e(c28655q4, 6).getB1();
                    int iM12793u4 = m12793u(interfaceC28670t2);
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R3 = c28655q4.m87133R();
                    if (z17) {
                        objM87133R3 = new C0468a(function4, 17);
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C0468a(function4, 17);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    c2314t3 = c2314t2;
                    c0209i6 = c0209i5;
                    c22957g2 = c22957g;
                    c2305k2 = c2305k;
                    function5 = function4;
                    c28676v1 = c28676v0;
                    r14 = 0;
                    AbstractC30795n.m94707h(strM21274h7, layoutWeightElement10, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12793u4, 0, (Function1) objM87133R3, c2886aM8420a4, null, c28655q4, 0, 48, 153592);
                    c28655q = c28655q4;
                    interfaceC25312uM12869l = viewState.getNavigationTag();
                    if (interfaceC25312uM12869l == null) {
                        c28655q.m87150e0(-1695816015);
                        c28655q.m87173q(false);
                        c0213j2 = c0213j;
                        c0209i7 = c0209i6;
                        z18 = true;
                        c28655q2 = c28655q;
                    } else {
                        c28655q.m87150e0(-1695816014);
                        if (0.4f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement11 = new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, false);
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, layoutWeightElement11);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c0213j2 = c0213j;
                            c28655q.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m16);
                        if (c28655q.f115903S) {
                            c0209i7 = c0209i6;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                        } else {
                            c0209i7 = c0209i6;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
                        AbstractC25303l.m74291r(interfaceC25312uM12869l, null, null, null, c28655q, 0, 14);
                        C28655q c28655q11 = c28655q;
                        z18 = true;
                        c28655q11.m87173q(true);
                        c28655q11.m87173q(false);
                        c28655q2 = c28655q11;
                    }
                    c28655q2.m87173q(z18);
                    c28655q2.m87173q(false);
                    r15 = z18;
                    c28655q3 = c28655q2;
                }
                c2314t4 = c2314t3;
                AbstractC22953f.m66715b(c28655q3, AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, ((float) r15) * r23, 7));
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t4);
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q3, 54);
                iHashCode4 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q3.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q3, modifierM3409f7);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a8);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m17);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N17);
                d3 = 1.0f;
                if (d3 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement12 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, r14);
                iHashCode5 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q3.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement12);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m18);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N18);
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t4, 0.0f, ((float) 0.5d) * f15, 0.0f, 0.0f, 13);
                if (d3 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g4 = AbstractC11895b.m31988g(modifierM3398t4, r14, 1.0f);
                String strM21274h8 = AbstractC8693b.m21274h(viewState.getBody(), c28655q3, r14);
                C38072d c38072d8 = C38072d.f163053a;
                long jM125385c4 = c38072d8.m121949b(c28655q3, 6).getWhite70();
                C2886a c2886aM8421b4 = c38072d8.m121952e(c28655q3, 6).getB2();
                int iM12796x4 = m12796x(interfaceC28670t2M30589c2);
                if ((i15 & 7168) == 2048) {
                    r16 = 1;
                } else {
                    r16 = r14;
                }
                objM87133R4 = c28655q3.m87133R();
                if (r16 == 0) {
                    function6 = function5;
                    objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                    c28655q3.m87172p0(objM87133R4);
                } else {
                    function6 = function5;
                    objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                    c28655q3.m87172p0(objM87133R4);
                }
                C28655q c28655q12 = c28655q3;
                AbstractC30795n.m94707h(strM21274h8, modifierM31988g4, jM125385c4, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12796x4, 0, (Function1) objM87133R4, c2886aM8421b4, null, c28655q12, 0, 48, 153592);
                Function1 function10 = function6;
                AbstractC16549p.m46783q(viewState.getCtaText(), viewState.getCtaIcon(), viewState.getStyle().getButtonColor(), z110, function10, c28655q12, (i15 << 3) & 64512, 0);
                r17 = c28655q12;
                r17.m87173q(true);
                abstractC22403oM12868k = viewState.getImage();
                if (abstractC22403oM12868k == null) {
                    r17.m87150e0(986656915);
                    r17.m87173q(r14);
                    r18 = r17;
                } else {
                    r17.m87150e0(986656916);
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM12868k, null, null, r17, 0, 3), null, AbstractC1102d.m3419p(25 * 4, c2314t4), null, null, 0.0f, null, r17, 432, 120);
                    ?? r112 = r17;
                    r112.m87173q(r14);
                    r18 = r112;
                }
                r18.m87173q(true);
                r18.m87173q(true);
                z15 = z110;
                modifier3 = modifier4;
                function3 = function10;
                r10 = r18;
            } else {
                c28655q4.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                function3 = function2;
                r10 = c28655q4;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4112s1(modifier3, viewState, z15, function3, i13, i14, 0);
            }
        }
        i15 |= 384;
        z13 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q4.m87157i(function2)) {
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
            if (c28655q4.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if (i19 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C3929m(11);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87264r(new C4105r1(z16, 0));
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
                objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11895b.m32005x(100, c28655q4);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (z16) {
                    iM12794v = m12794v(interfaceC28601c1);
                } else {
                    iM12794v = 5;
                }
                InterfaceC28670t2 interfaceC28670t2M30589c3 = AbstractC11352g.m30589c(iM12794v, c28655q4);
                float f16 = 8;
                f13 = ((float) 2.5d) * f16;
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3393o(new C22976l1(f13, f13, 3 * f16, f13), modifier2));
                c22957g = AbstractC22977m.f90652c;
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q4.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q4, modifierM3409f8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                boolean z111 = z16;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a7);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m19);
                c0209i3 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    modifier4 = modifier2;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N19);
                    textResourceM12871n = viewState.getTitle();
                    if (textResourceM12871n == null) {
                        c28655q4.m87150e0(1139561213);
                        r14 = 0;
                        c28655q4.m87173q(false);
                        c28676v1 = c28676v0;
                        function5 = function4;
                        c2305k2 = c2305k;
                        c2314t3 = c2314t;
                        c0209i7 = c0209i3;
                        c22957g2 = c22957g;
                        r15 = 1;
                        c0213j2 = c0213j;
                        c28655q3 = c28655q4;
                    } else {
                        c28655q4.m87150e0(1139561214);
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (viewState.getNavigationTag() != null) {
                            c2314t2 = c2314t;
                            modifierMo3471e = modifierM3409f.mo3471e(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11));
                        } else {
                            c2314t2 = c2314t;
                            modifierMo3471e = modifierM3409f.mo3471e(c2314t2);
                        }
                        C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q4.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a9);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m110);
                        if (c28655q4.f115903S) {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        } else {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N110);
                        if (0.9f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement13 = new LayoutWeightElement(0.9f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.9f, true);
                        String strM21274h9 = AbstractC8693b.m21274h(textResourceM12871n, c28655q4, 0);
                        C38072d c38072d9 = C38072d.f163053a;
                        long jM125430y5 = c38072d9.m121949b(c28655q4, 6).getBrandWhite();
                        C2886a c2886aM8420a5 = c38072d9.m121952e(c28655q4, 6).getB1();
                        int iM12793u5 = m12793u(interfaceC28670t2);
                        if ((i15 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R3 = c28655q4.m87133R();
                        if (z17) {
                            objM87133R3 = new C0468a(function4, 17);
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C0468a(function4, 17);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        c2314t3 = c2314t2;
                        c0209i6 = c0209i5;
                        c22957g2 = c22957g;
                        c2305k2 = c2305k;
                        function5 = function4;
                        c28676v1 = c28676v0;
                        r14 = 0;
                        AbstractC30795n.m94707h(strM21274h9, layoutWeightElement13, jM125430y5, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12793u5, 0, (Function1) objM87133R3, c2886aM8420a5, null, c28655q4, 0, 48, 153592);
                        c28655q = c28655q4;
                        interfaceC25312uM12869l = viewState.getNavigationTag();
                        if (interfaceC25312uM12869l == null) {
                            c28655q.m87150e0(-1695816015);
                            c28655q.m87173q(false);
                            c0213j2 = c0213j;
                            c0209i7 = c0209i6;
                            z18 = true;
                            c28655q2 = c28655q;
                        } else {
                            c28655q.m87150e0(-1695816014);
                            if (0.4f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement14 = new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, false);
                            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                            Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, layoutWeightElement14);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c0213j2 = c0213j;
                                c28655q.m87163l(c0213j2);
                            } else {
                                c0213j2 = c0213j;
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d5);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111);
                            if (c28655q.f115903S) {
                                c0209i7 = c0209i6;
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                            } else {
                                c0209i7 = c0209i6;
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111);
                            AbstractC25303l.m74291r(interfaceC25312uM12869l, null, null, null, c28655q, 0, 14);
                            C28655q c28655q13 = c28655q;
                            z18 = true;
                            c28655q13.m87173q(true);
                            c28655q13.m87173q(false);
                            c28655q2 = c28655q13;
                        }
                        c28655q2.m87173q(z18);
                        c28655q2.m87173q(false);
                        r15 = z18;
                        c28655q3 = c28655q2;
                    }
                    c2314t4 = c2314t3;
                    AbstractC22953f.m66715b(c28655q3, AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, ((float) r15) * r23, 7));
                    Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q3, 54);
                    iHashCode4 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q3.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q3, modifierM3409f9);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a10);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m112);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N112);
                    d3 = 1.0f;
                    if (d3 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement15 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, r14);
                    iHashCode5 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q3.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement15);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m113);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N113);
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t4, 0.0f, ((float) 0.5d) * f16, 0.0f, 0.0f, 13);
                    if (d3 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g5 = AbstractC11895b.m31988g(modifierM3398t5, r14, 1.0f);
                    String strM21274h10 = AbstractC8693b.m21274h(viewState.getBody(), c28655q3, r14);
                    C38072d c38072d10 = C38072d.f163053a;
                    long jM125385c5 = c38072d10.m121949b(c28655q3, 6).getWhite70();
                    C2886a c2886aM8421b5 = c38072d10.m121952e(c28655q3, 6).getB2();
                    int iM12796x5 = m12796x(interfaceC28670t2M30589c3);
                    if ((i15 & 7168) == 2048) {
                        r16 = 1;
                    } else {
                        r16 = r14;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (r16 == 0) {
                        function6 = function5;
                        objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        function6 = function5;
                        objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    C28655q c28655q14 = c28655q3;
                    AbstractC30795n.m94707h(strM21274h10, modifierM31988g5, jM125385c5, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12796x5, 0, (Function1) objM87133R4, c2886aM8421b5, null, c28655q14, 0, 48, 153592);
                    Function1 function11 = function6;
                    AbstractC16549p.m46783q(viewState.getCtaText(), viewState.getCtaIcon(), viewState.getStyle().getButtonColor(), z111, function11, c28655q14, (i15 << 3) & 64512, 0);
                    r17 = c28655q14;
                    r17.m87173q(true);
                    abstractC22403oM12868k = viewState.getImage();
                    if (abstractC22403oM12868k == null) {
                        r17.m87150e0(986656915);
                        r17.m87173q(r14);
                        r18 = r17;
                    } else {
                        r17.m87150e0(986656916);
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM12868k, null, null, r17, 0, 3), null, AbstractC1102d.m3419p(25 * 4, c2314t4), null, null, 0.0f, null, r17, 432, 120);
                        ?? r113 = r17;
                        r113.m87173q(r14);
                        r18 = r113;
                    }
                    r18.m87173q(true);
                    r18.m87173q(true);
                    z15 = z111;
                    modifier3 = modifier4;
                    function3 = function11;
                    r10 = r18;
                } else {
                    modifier4 = modifier2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N19);
                textResourceM12871n = viewState.getTitle();
                if (textResourceM12871n == null) {
                    c28655q4.m87150e0(1139561213);
                    r14 = 0;
                    c28655q4.m87173q(false);
                    c28676v1 = c28676v0;
                    function5 = function4;
                    c2305k2 = c2305k;
                    c2314t3 = c2314t;
                    c0209i7 = c0209i3;
                    c22957g2 = c22957g;
                    r15 = 1;
                    c0213j2 = c0213j;
                    c28655q3 = c28655q4;
                } else {
                    c28655q4.m87150e0(1139561214);
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (viewState.getNavigationTag() != null) {
                        c2314t2 = c2314t;
                        modifierMo3471e = modifierM3409f.mo3471e(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11));
                    } else {
                        c2314t2 = c2314t;
                        modifierMo3471e = modifierM3409f.mo3471e(c2314t2);
                    }
                    C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q4.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a11);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m114);
                    if (c28655q4.f115903S) {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    } else {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N114);
                    if (0.9f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement16 = new LayoutWeightElement(0.9f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.9f, true);
                    String strM21274h11 = AbstractC8693b.m21274h(textResourceM12871n, c28655q4, 0);
                    C38072d c38072d11 = C38072d.f163053a;
                    long jM125430y6 = c38072d11.m121949b(c28655q4, 6).getBrandWhite();
                    C2886a c2886aM8420a6 = c38072d11.m121952e(c28655q4, 6).getB1();
                    int iM12793u6 = m12793u(interfaceC28670t2);
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R3 = c28655q4.m87133R();
                    if (z17) {
                        objM87133R3 = new C0468a(function4, 17);
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C0468a(function4, 17);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    c2314t3 = c2314t2;
                    c0209i6 = c0209i5;
                    c22957g2 = c22957g;
                    c2305k2 = c2305k;
                    function5 = function4;
                    c28676v1 = c28676v0;
                    r14 = 0;
                    AbstractC30795n.m94707h(strM21274h11, layoutWeightElement16, jM125430y6, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12793u6, 0, (Function1) objM87133R3, c2886aM8420a6, null, c28655q4, 0, 48, 153592);
                    c28655q = c28655q4;
                    interfaceC25312uM12869l = viewState.getNavigationTag();
                    if (interfaceC25312uM12869l == null) {
                        c28655q.m87150e0(-1695816015);
                        c28655q.m87173q(false);
                        c0213j2 = c0213j;
                        c0209i7 = c0209i6;
                        z18 = true;
                        c28655q2 = c28655q;
                    } else {
                        c28655q.m87150e0(-1695816014);
                        if (0.4f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement17 = new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, false);
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, layoutWeightElement17);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c0213j2 = c0213j;
                            c28655q.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m115);
                        if (c28655q.f115903S) {
                            c0209i7 = c0209i6;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                        } else {
                            c0209i7 = c0209i6;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N115);
                        AbstractC25303l.m74291r(interfaceC25312uM12869l, null, null, null, c28655q, 0, 14);
                        C28655q c28655q15 = c28655q;
                        z18 = true;
                        c28655q15.m87173q(true);
                        c28655q15.m87173q(false);
                        c28655q2 = c28655q15;
                    }
                    c28655q2.m87173q(z18);
                    c28655q2.m87173q(false);
                    r15 = z18;
                    c28655q3 = c28655q2;
                }
                c2314t4 = c2314t3;
                AbstractC22953f.m66715b(c28655q3, AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, ((float) r15) * r23, 7));
                Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t4);
                C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q3, 54);
                iHashCode4 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q3.m87165m();
                Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q3, modifierM3409f10);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a12);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m116);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N116);
                d3 = 1.0f;
                if (d3 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement18 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, r14);
                iHashCode5 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q3.m87165m();
                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement18);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m117);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N117);
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t4, 0.0f, ((float) 0.5d) * f16, 0.0f, 0.0f, 13);
                if (d3 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g6 = AbstractC11895b.m31988g(modifierM3398t6, r14, 1.0f);
                String strM21274h12 = AbstractC8693b.m21274h(viewState.getBody(), c28655q3, r14);
                C38072d c38072d12 = C38072d.f163053a;
                long jM125385c6 = c38072d12.m121949b(c28655q3, 6).getWhite70();
                C2886a c2886aM8421b6 = c38072d12.m121952e(c28655q3, 6).getB2();
                int iM12796x6 = m12796x(interfaceC28670t2M30589c3);
                if ((i15 & 7168) == 2048) {
                    r16 = 1;
                } else {
                    r16 = r14;
                }
                objM87133R4 = c28655q3.m87133R();
                if (r16 == 0) {
                    function6 = function5;
                    objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                    c28655q3.m87172p0(objM87133R4);
                } else {
                    function6 = function5;
                    objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                    c28655q3.m87172p0(objM87133R4);
                }
                C28655q c28655q16 = c28655q3;
                AbstractC30795n.m94707h(strM21274h12, modifierM31988g6, jM125385c6, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12796x6, 0, (Function1) objM87133R4, c2886aM8421b6, null, c28655q16, 0, 48, 153592);
                Function1 function12 = function6;
                AbstractC16549p.m46783q(viewState.getCtaText(), viewState.getCtaIcon(), viewState.getStyle().getButtonColor(), z111, function12, c28655q16, (i15 << 3) & 64512, 0);
                r17 = c28655q16;
                r17.m87173q(true);
                abstractC22403oM12868k = viewState.getImage();
                if (abstractC22403oM12868k == null) {
                    r17.m87150e0(986656915);
                    r17.m87173q(r14);
                    r18 = r17;
                } else {
                    r17.m87150e0(986656916);
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM12868k, null, null, r17, 0, 3), null, AbstractC1102d.m3419p(25 * 4, c2314t4), null, null, 0.0f, null, r17, 432, 120);
                    ?? r114 = r17;
                    r114.m87173q(r14);
                    r18 = r114;
                }
                r18.m87173q(true);
                r18.m87173q(true);
                z15 = z111;
                modifier3 = modifier4;
                function3 = function12;
                r10 = r18;
            } else {
                c28655q4.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                function3 = function2;
                r10 = c28655q4;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4112s1(modifier3, viewState, z15, function3, i13, i14, 0);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier2 = c2314t;
            }
            if (i19 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C3929m(11);
                    c28655q4.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q4.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new C4105r1(z16, 0));
                c28655q4.m87172p0(objM87133R);
            }
            interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
            objM87133R2 = c28655q4.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11895b.m32005x(100, c28655q4);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            if (z16) {
                iM12794v = m12794v(interfaceC28601c1);
            } else {
                iM12794v = 5;
            }
            InterfaceC28670t2 interfaceC28670t2M30589c4 = AbstractC11352g.m30589c(iM12794v, c28655q4);
            float f17 = 8;
            f13 = ((float) 2.5d) * f17;
            Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3393o(new C22976l1(f13, f13, 3 * f17, f13), modifier2));
            c22957g = AbstractC22977m.f90652c;
            c2305k = C2299e.f9110M;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q4.m87165m();
            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q4, modifierM3409f11);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            boolean z112 = z16;
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a10);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m118);
            c0209i3 = C0217k.f732j;
            if (c28655q4.f115903S) {
                modifier4 = modifier2;
                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N118);
                textResourceM12871n = viewState.getTitle();
                if (textResourceM12871n == null) {
                    c28655q4.m87150e0(1139561213);
                    r14 = 0;
                    c28655q4.m87173q(false);
                    c28676v1 = c28676v0;
                    function5 = function4;
                    c2305k2 = c2305k;
                    c2314t3 = c2314t;
                    c0209i7 = c0209i3;
                    c22957g2 = c22957g;
                    r15 = 1;
                    c0213j2 = c0213j;
                    c28655q3 = c28655q4;
                } else {
                    c28655q4.m87150e0(1139561214);
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (viewState.getNavigationTag() != null) {
                        c2314t2 = c2314t;
                        modifierMo3471e = modifierM3409f.mo3471e(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11));
                    } else {
                        c2314t2 = c2314t;
                        modifierMo3471e = modifierM3409f.mo3471e(c2314t2);
                    }
                    C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q4.m87165m();
                    Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a13);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m119);
                    if (c28655q4.f115903S) {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    } else {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N119);
                    if (0.9f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement19 = new LayoutWeightElement(0.9f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.9f, true);
                    String strM21274h13 = AbstractC8693b.m21274h(textResourceM12871n, c28655q4, 0);
                    C38072d c38072d13 = C38072d.f163053a;
                    long jM125430y7 = c38072d13.m121949b(c28655q4, 6).getBrandWhite();
                    C2886a c2886aM8420a7 = c38072d13.m121952e(c28655q4, 6).getB1();
                    int iM12793u7 = m12793u(interfaceC28670t2);
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R3 = c28655q4.m87133R();
                    if (z17) {
                        objM87133R3 = new C0468a(function4, 17);
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C0468a(function4, 17);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    c2314t3 = c2314t2;
                    c0209i6 = c0209i5;
                    c22957g2 = c22957g;
                    c2305k2 = c2305k;
                    function5 = function4;
                    c28676v1 = c28676v0;
                    r14 = 0;
                    AbstractC30795n.m94707h(strM21274h13, layoutWeightElement19, jM125430y7, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12793u7, 0, (Function1) objM87133R3, c2886aM8420a7, null, c28655q4, 0, 48, 153592);
                    c28655q = c28655q4;
                    interfaceC25312uM12869l = viewState.getNavigationTag();
                    if (interfaceC25312uM12869l == null) {
                        c28655q.m87150e0(-1695816015);
                        c28655q.m87173q(false);
                        c0213j2 = c0213j;
                        c0209i7 = c0209i6;
                        z18 = true;
                        c28655q2 = c28655q;
                    } else {
                        c28655q.m87150e0(-1695816014);
                        if (0.4f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement110 = new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, false);
                        InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                        Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, layoutWeightElement110);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c0213j2 = c0213j;
                            c28655q.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d7);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1110);
                        if (c28655q.f115903S) {
                            c0209i7 = c0209i6;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                        } else {
                            c0209i7 = c0209i6;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1110);
                        AbstractC25303l.m74291r(interfaceC25312uM12869l, null, null, null, c28655q, 0, 14);
                        C28655q c28655q17 = c28655q;
                        z18 = true;
                        c28655q17.m87173q(true);
                        c28655q17.m87173q(false);
                        c28655q2 = c28655q17;
                    }
                    c28655q2.m87173q(z18);
                    c28655q2.m87173q(false);
                    r15 = z18;
                    c28655q3 = c28655q2;
                }
                c2314t4 = c2314t3;
                AbstractC22953f.m66715b(c28655q3, AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, ((float) r15) * r23, 7));
                Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t4);
                C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q3, 54);
                iHashCode4 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q3.m87165m();
                Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q3, modifierM3409f12);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a14);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m1111);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N1111);
                d3 = 1.0f;
                if (d3 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement111 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, r14);
                iHashCode5 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q3.m87165m();
                Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement111);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m1112);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N1112);
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t4, 0.0f, ((float) 0.5d) * f17, 0.0f, 0.0f, 13);
                if (d3 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g7 = AbstractC11895b.m31988g(modifierM3398t7, r14, 1.0f);
                String strM21274h14 = AbstractC8693b.m21274h(viewState.getBody(), c28655q3, r14);
                C38072d c38072d14 = C38072d.f163053a;
                long jM125385c7 = c38072d14.m121949b(c28655q3, 6).getWhite70();
                C2886a c2886aM8421b7 = c38072d14.m121952e(c28655q3, 6).getB2();
                int iM12796x7 = m12796x(interfaceC28670t2M30589c4);
                if ((i15 & 7168) == 2048) {
                    r16 = 1;
                } else {
                    r16 = r14;
                }
                objM87133R4 = c28655q3.m87133R();
                if (r16 == 0) {
                    function6 = function5;
                    objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                    c28655q3.m87172p0(objM87133R4);
                } else {
                    function6 = function5;
                    objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                    c28655q3.m87172p0(objM87133R4);
                }
                C28655q c28655q18 = c28655q3;
                AbstractC30795n.m94707h(strM21274h14, modifierM31988g7, jM125385c7, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12796x7, 0, (Function1) objM87133R4, c2886aM8421b7, null, c28655q18, 0, 48, 153592);
                Function1 function13 = function6;
                AbstractC16549p.m46783q(viewState.getCtaText(), viewState.getCtaIcon(), viewState.getStyle().getButtonColor(), z112, function13, c28655q18, (i15 << 3) & 64512, 0);
                r17 = c28655q18;
                r17.m87173q(true);
                abstractC22403oM12868k = viewState.getImage();
                if (abstractC22403oM12868k == null) {
                    r17.m87150e0(986656915);
                    r17.m87173q(r14);
                    r18 = r17;
                } else {
                    r17.m87150e0(986656916);
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM12868k, null, null, r17, 0, 3), null, AbstractC1102d.m3419p(25 * 4, c2314t4), null, null, 0.0f, null, r17, 432, 120);
                    ?? r115 = r17;
                    r115.m87173q(r14);
                    r18 = r115;
                }
                r18.m87173q(true);
                r18.m87173q(true);
                z15 = z112;
                modifier3 = modifier4;
                function3 = function13;
                r10 = r18;
            } else {
                modifier4 = modifier2;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N118);
            textResourceM12871n = viewState.getTitle();
            if (textResourceM12871n == null) {
                c28655q4.m87150e0(1139561213);
                r14 = 0;
                c28655q4.m87173q(false);
                c28676v1 = c28676v0;
                function5 = function4;
                c2305k2 = c2305k;
                c2314t3 = c2314t;
                c0209i7 = c0209i3;
                c22957g2 = c22957g;
                r15 = 1;
                c0213j2 = c0213j;
                c28655q3 = c28655q4;
            } else {
                c28655q4.m87150e0(1139561214);
                modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                if (viewState.getNavigationTag() != null) {
                    c2314t2 = c2314t;
                    modifierMo3471e = modifierM3409f.mo3471e(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11));
                } else {
                    c2314t2 = c2314t;
                    modifierMo3471e = modifierM3409f.mo3471e(c2314t2);
                }
                C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q4.m87165m();
                Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a15);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1113);
                if (c28655q4.f115903S) {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                } else {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1113);
                if (0.9f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement112 = new LayoutWeightElement(0.9f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.9f, true);
                String strM21274h15 = AbstractC8693b.m21274h(textResourceM12871n, c28655q4, 0);
                C38072d c38072d15 = C38072d.f163053a;
                long jM125430y8 = c38072d15.m121949b(c28655q4, 6).getBrandWhite();
                C2886a c2886aM8420a8 = c38072d15.m121952e(c28655q4, 6).getB1();
                int iM12793u8 = m12793u(interfaceC28670t2);
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R3 = c28655q4.m87133R();
                if (z17) {
                    objM87133R3 = new C0468a(function4, 17);
                    c28655q4.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C0468a(function4, 17);
                    c28655q4.m87172p0(objM87133R3);
                }
                c2314t3 = c2314t2;
                c0209i6 = c0209i5;
                c22957g2 = c22957g;
                c2305k2 = c2305k;
                function5 = function4;
                c28676v1 = c28676v0;
                r14 = 0;
                AbstractC30795n.m94707h(strM21274h15, layoutWeightElement112, jM125430y8, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12793u8, 0, (Function1) objM87133R3, c2886aM8420a8, null, c28655q4, 0, 48, 153592);
                c28655q = c28655q4;
                interfaceC25312uM12869l = viewState.getNavigationTag();
                if (interfaceC25312uM12869l == null) {
                    c28655q.m87150e0(-1695816015);
                    c28655q.m87173q(false);
                    c0213j2 = c0213j;
                    c0209i7 = c0209i6;
                    z18 = true;
                    c28655q2 = c28655q;
                } else {
                    c28655q.m87150e0(-1695816014);
                    if (0.4f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement113 = new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, false);
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q.m87165m();
                    Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q, layoutWeightElement113);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c0213j2 = c0213j;
                        c28655q.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1114);
                    if (c28655q.f115903S) {
                        c0209i7 = c0209i6;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                    } else {
                        c0209i7 = c0209i6;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1114);
                    AbstractC25303l.m74291r(interfaceC25312uM12869l, null, null, null, c28655q, 0, 14);
                    C28655q c28655q19 = c28655q;
                    z18 = true;
                    c28655q19.m87173q(true);
                    c28655q19.m87173q(false);
                    c28655q2 = c28655q19;
                }
                c28655q2.m87173q(z18);
                c28655q2.m87173q(false);
                r15 = z18;
                c28655q3 = c28655q2;
            }
            c2314t4 = c2314t3;
            AbstractC22953f.m66715b(c28655q3, AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, ((float) r15) * r23, 7));
            Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t4);
            C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q3, 54);
            iHashCode4 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q3.m87165m();
            Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q3, modifierM3409f13);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j2);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a16);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m1115);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i7);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N1115);
            d3 = 1.0f;
            if (d3 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement114 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, r14);
            iHashCode5 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q3.m87165m();
            Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement114);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j2);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a12);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m1116);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
            } else {
                AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i7);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N1116);
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t4, 0.0f, ((float) 0.5d) * f17, 0.0f, 0.0f, 13);
            if (d3 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g8 = AbstractC11895b.m31988g(modifierM3398t8, r14, 1.0f);
            String strM21274h16 = AbstractC8693b.m21274h(viewState.getBody(), c28655q3, r14);
            C38072d c38072d16 = C38072d.f163053a;
            long jM125385c8 = c38072d16.m121949b(c28655q3, 6).getWhite70();
            C2886a c2886aM8421b8 = c38072d16.m121952e(c28655q3, 6).getB2();
            int iM12796x8 = m12796x(interfaceC28670t2M30589c4);
            if ((i15 & 7168) == 2048) {
                r16 = 1;
            } else {
                r16 = r14;
            }
            objM87133R4 = c28655q3.m87133R();
            if (r16 == 0) {
                function6 = function5;
                objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                c28655q3.m87172p0(objM87133R4);
            } else {
                function6 = function5;
                objM87133R4 = new C2609r(function6, interfaceC28601c1, 4);
                c28655q3.m87172p0(objM87133R4);
            }
            C28655q c28655q110 = c28655q3;
            AbstractC30795n.m94707h(strM21274h16, modifierM31988g8, jM125385c8, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM12796x8, 0, (Function1) objM87133R4, c2886aM8421b8, null, c28655q110, 0, 48, 153592);
            Function1 function14 = function6;
            AbstractC16549p.m46783q(viewState.getCtaText(), viewState.getCtaIcon(), viewState.getStyle().getButtonColor(), z112, function14, c28655q110, (i15 << 3) & 64512, 0);
            r17 = c28655q110;
            r17.m87173q(true);
            abstractC22403oM12868k = viewState.getImage();
            if (abstractC22403oM12868k == null) {
                r17.m87150e0(986656915);
                r17.m87173q(r14);
                r18 = r17;
            } else {
                r17.m87150e0(986656916);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM12868k, null, null, r17, 0, 3), null, AbstractC1102d.m3419p(25 * 4, c2314t4), null, null, 0.0f, null, r17, 432, 120);
                ?? r116 = r17;
                r116.m87173q(r14);
                r18 = r116;
            }
            r18.m87173q(true);
            r18.m87173q(true);
            z15 = z112;
            modifier3 = modifier4;
            function3 = function14;
            r10 = r18;
        } else {
            c28655q4.m87138X();
            modifier3 = modifier2;
            z15 = z13;
            function3 = function2;
            r10 = c28655q4;
        }
        c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4112s1(modifier3, viewState, z15, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m12791s(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final int m12792t(boolean z4) {
        return z4 ? Integer.MAX_VALUE : 2;
    }

    /* JADX INFO: renamed from: u */
    private static final int m12793u(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: renamed from: v */
    private static final int m12794v(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: w */
    private static final void m12795w(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: x */
    private static final int m12796x(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m12797y(Function1 function1, C23277r0 result) {
        AbstractC22676k.m65750j(result, "result");
        function1.invoke(Boolean.valueOf(result.m67336e()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m12798z(Function1 function1, InterfaceC28601c1 interfaceC28601c1, C23277r0 result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.m67336e()) {
            function1.invoke(Boolean.TRUE);
        } else {
            m12795w(interfaceC28601c1, result.f92228b.f92263f);
        }
        return C23454a0.f92919a;
    }
}
