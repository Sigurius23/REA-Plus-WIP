package mx1;

import a00.C0073h;
import am2.C1012d;
import am2.C1044u;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import ax1.AbstractC2119a;
import b30.C2509e2;
import b91.C2886a;
import bm0.C3412o;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.payments.domain.models.Card;
import d13.AbstractC11478a;
import d30.C11547l0;
import do0.C12231e;
import ev2.C13708q;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import hg3.AbstractC17269i;
import hy0.AbstractC17755i2;
import hy0.EnumC17740f;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import ih1.C18522f;
import j21.C21245d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import jp1.C21859k;
import jx1.C22008c;
import jx1.C22010d;
import jx1.C22014f;
import jx1.C22016g;
import jx1.C22029s;
import jx1.EnumC22030t;
import jx1.EnumC22031u;
import kw1.C22852c;
import l72.C23407n;
import l80.C23434k;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import lq0.C24656d;
import lw1.AbstractC24769e;
import lw1.C24774j;
import lx1.InterfaceC24792c;
import m31.C25002h;
import mf2.C25514e;
import mh0.C25550b;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27265l0;
import ny0.AbstractC27274q;
import ny0.C27270o;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p043c4.C3948a0;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p717lq2.C24679k;
import p745y81.C39336i;
import q22.C29855e;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import se.AbstractC32411b;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: mx1.m */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u008b\u0001\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001aQ\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0003¢\u0006\u0004\b\u001f\u0010 \u001aC\u0010!\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b!\u0010\"\u001a\u001d\u0010#\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0003¢\u0006\u0004\b#\u0010$\u001aG\u0010%\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b%\u0010&\u001a_\u00101\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n2\u0006\u00100\u001a\u00020/2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b1\u00102\u001a+\u00103\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020'2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b3\u00104\u001a\u001d\u00107\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000605H\u0003¢\u0006\u0004\b7\u00108\u001a-\u0010:\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0003¢\u0006\u0004\b:\u0010;\u001aA\u0010<\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0006052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b<\u0010=\u001a#\u0010@\u001a\u00020\u0002*\u00020\u00022\u0006\u00100\u001a\u00020/2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010A¨\u0006B"}, m65681d2 = {"Ljx1/s;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d0", "(Ljx1/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "title", "subtitle", "expandedSubtitle", "price", "expandedPrice", "", "isExpanded", "", "Ljx1/c;", "summaryItems", "Ljx1/d;", "paymentOptions", "", "paymentOptionSelected", "Lq22/e;", "formValidator", "Lcom/whoop/payments/domain/models/Card;", "card", "C", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljx1/d;ILq22/e;Lcom/whoop/payments/domain/models/Card;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Landroidx/compose/runtime/Composer;I)V", "G", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "E", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "g0", "(Ljx1/d;ILq22/e;Lcom/whoop/payments/domain/models/Card;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ljx1/f;", "confirmModal", "checkoutEnabled", "Ljx1/g;", "primaryCta", "secondaryCta", "footerText", "trackingMonths", "Ljx1/t;", "style", "X", "(Ljx1/f;ZLjx1/g;Ljx1/g;Ljava/lang/String;Ljava/lang/String;Ljx1/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "I", "(Ljx1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "onDismissRequest", "U", "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "features", "S", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "M", "(Ljx1/g;Ljx1/g;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ljx1/u;", "checkoutType", "k0", "(Landroidx/compose/ui/Modifier;Ljx1/t;Ljx1/u;)Landroidx/compose/ui/Modifier;", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26007m {

    /* JADX INFO: renamed from: mx1.m$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f102798w = new a();

        /* JADX INFO: renamed from: a */
        public final long m77273a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m77273a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: mx1.m$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f102799a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f102800b;

        static {
            int[] iArr = new int[EnumC22030t.values().length];
            try {
                iArr[EnumC22030t.ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC22030t.PEAK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC22030t.LIFE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC22030t.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f102799a = iArr;
            int[] iArr2 = new int[EnumC22031u.values().length];
            try {
                iArr2[EnumC22031u.UPGRADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC22031u.DOWNGRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f102800b = iArr2;
        }
    }

    /* JADX INFO: renamed from: mx1.m$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f102801w = new c();

        /* JADX INFO: renamed from: a */
        public final long m77274a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m77274a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m77209A(String str, String str2, String str3, String str4, String str5, boolean z4, List<C22008c> list, Composer composer, int i13) {
        String str6;
        int i14;
        String str7;
        String str8;
        String str9;
        String str10;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-112841741);
        if ((i13 & 6) == 0) {
            str6 = str;
            i14 = (c28655q.m87153g(str6) ? 4 : 2) | i13;
        } else {
            str6 = str;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            str7 = str2;
            i14 |= c28655q.m87153g(str7) ? 32 : 16;
        } else {
            str7 = str2;
        }
        if ((i13 & 384) == 0) {
            str8 = str3;
            i14 |= c28655q.m87153g(str8) ? 256 : 128;
        } else {
            str8 = str3;
        }
        if ((i13 & 3072) == 0) {
            str9 = str4;
            i14 |= c28655q.m87153g(str9) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            str9 = str4;
        }
        if ((i13 & 24576) == 0) {
            str10 = str5;
            i14 |= c28655q.m87153g(str10) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            str10 = str5;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87155h(z4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(list) ? 1048576 : 524288;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (599187 & i15) != 599186)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m77215G(str6, str7, str8, str9, str10, z4, c28655q, 524286 & i15);
            if (z4) {
                c28655q.m87150e0(2064583930);
                m77213E(list, c28655q, (i15 >> 18) & 14);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2064656005);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1044u(str, str2, str3, str4, str5, z4, list, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m77210B(String str, String str2, String str3, String str4, String str5, boolean z4, List list, int i13, Composer composer, int i14) {
        m77209A(str, str2, str3, str4, str5, z4, list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m77211C(String str, String str2, String str3, String str4, String str5, boolean z4, List<C22008c> list, C22010d c22010d, int i13, C29855e c29855e, Card card, Function1 function1, Composer composer, int i14, int i15) {
        int i16;
        String str6;
        String str7;
        String str8;
        String str9;
        int i17;
        C28655q c28655q;
        boolean z13;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-54451913);
        if ((i14 & 6) == 0) {
            i16 = (c28655q2.m87153g(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            str6 = str2;
            i16 |= c28655q2.m87153g(str6) ? 32 : 16;
        } else {
            str6 = str2;
        }
        if ((i14 & 384) == 0) {
            str7 = str3;
            i16 |= c28655q2.m87153g(str7) ? 256 : 128;
        } else {
            str7 = str3;
        }
        if ((i14 & 3072) == 0) {
            str8 = str4;
            i16 |= c28655q2.m87153g(str8) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            str8 = str4;
        }
        if ((i14 & 24576) == 0) {
            str9 = str5;
            i16 |= c28655q2.m87153g(str9) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            str9 = str5;
        }
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i16 |= c28655q2.m87155h(z4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= c28655q2.m87157i(list) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= c28655q2.m87153g(c22010d) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= c28655q2.m87149e(i13) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i14 & 805306368) == 0) {
            i16 |= (i14 & 1073741824) == 0 ? c28655q2.m87153g(c29855e) : c28655q2.m87157i(c29855e) ? 536870912 : 268435456;
        }
        int i18 = i16;
        if ((i15 & 6) == 0) {
            i17 = i15 | ((i15 & 8) == 0 ? c28655q2.m87153g(card) : c28655q2.m87157i(card) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        int i19 = i17;
        if (c28655q2.m87135U(i18 & 1, ((i18 & 306783379) == 306783378 && (i19 & 19) == 18) ? false : true)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * 8), C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            m77209A(str, str6, str7, str8, str9, z4, list, c28655q2, i18 & 4194302);
            c28655q = c28655q2;
            if (z4) {
                c28655q.m87150e0(-2005485946);
                if (c22010d == null) {
                    c28655q.m87150e0(-2040522181);
                    z13 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2040522180);
                    int i24 = i18 >> 21;
                    int i25 = i19 << 9;
                    m77248g0(c22010d, i13, c29855e, card, function1, c28655q, (i24 & 896) | (i24 & 126) | (C29855e.f122028d << 6) | (Card.$stable << 9) | (i25 & 7168) | (i25 & 57344));
                    z13 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(-2040199935);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12231e(str, str2, str3, str4, str5, z4, list, c22010d, i13, c29855e, card, function1, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m77212D(String str, String str2, String str3, String str4, String str5, boolean z4, List list, C22010d c22010d, int i13, C29855e c29855e, Card card, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m77211C(str, str2, str3, str4, str5, z4, list, c22010d, i13, c29855e, card, function1, composer, AbstractC28683x.m87244L(i14 | 1), AbstractC28683x.m87244L(i15));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final void m77213E(List<C22008c> list, Composer composer, int i13) {
        int i14;
        C2314t c2314t;
        int i15;
        boolean z4;
        int i16;
        List<C22008c> list2 = list;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1500336434);
        int i17 = 2;
        int i18 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(list2) ? 4 : 2) : i13;
        boolean z13 = false;
        int i19 = 1;
        if (c28655q.m87135U(i18 & 1, (i18 & 3) != 2)) {
            int i24 = 0;
            for (Object obj : list2) {
                int i25 = i24 + 1;
                if (i24 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C22008c c22008c = (C22008c) obj;
                C2314t c2314t2 = C2314t.f9131w;
                if (i24 != 0 || list2.size() <= i17) {
                    i14 = i24;
                    c2314t = c2314t2;
                    c28655q.m87150e0(-1197377342);
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(-1197548400);
                    c2314t = c2314t2;
                    i14 = i24;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, ((float) 0.5d) * 8, i19), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
                    c28655q.m87173q(z13);
                }
                C22961h c22961h = AbstractC22977m.f90656g;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, C2299e.f9107J, c28655q, 6);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                String strM62896b = c22008c.getLabel();
                C38072d c38072d = C38072d.f163053a;
                int i26 = C38072d.f163054b;
                long jM125430y = c38072d.m121949b(c28655q, i26).getBrandWhite();
                C2886a c2886aM8420a = c38072d.m121952e(c28655q, i26).getB1();
                int i27 = C2886a.f11498d << 18;
                C28655q c28655q2 = c28655q;
                C2314t c2314t3 = c2314t;
                AbstractC30795n.m94707h(strM62896b, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, 0, i27, 196602);
                AbstractC30795n.m94707h(c22008c.getAmount(), null, c38072d.m121949b(c28655q2, i26).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i26).getN7(), null, c28655q2, 0, i27, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                if (i14 != AbstractC37056f.m118951C(list)) {
                    i15 = 2;
                    if (list.size() == 2) {
                        c28655q.m87150e0(-1196825232);
                        i16 = 1;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), 0.0f, ((float) 0.5d) * 8, 1), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
                        z4 = false;
                        c28655q.m87173q(false);
                    }
                    z13 = z4;
                    i19 = i16;
                    i24 = i25;
                    list2 = list;
                    i17 = i15;
                } else {
                    i15 = 2;
                }
                z4 = false;
                i16 = 1;
                c28655q.m87150e0(-1196654174);
                c28655q.m87173q(false);
                z13 = z4;
                i19 = i16;
                i24 = i25;
                list2 = list;
                i17 = i15;
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m77214F(List list, int i13, Composer composer, int i14) {
        m77213E(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final void m77215G(String str, String str2, String str3, String str4, String str5, boolean z4, Composer composer, int i13) {
        int i14;
        String str6;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(459901554);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(str3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            str6 = str4;
            i14 |= c28655q.m87153g(str6) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            str6 = str4;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(str5) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87155h(z4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            C22961h c22961h = AbstractC22977m.f90656g;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, C2299e.f9107J, c28655q, 6);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            int i15 = i14;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
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
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, i15 & 14, i17, 196602);
            AbstractC30795n.m94707h((!z4 || str3 == null) ? str2 : str3, null, c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB2(), null, c28655q, 0, i17, 196602);
            c28655q.m87173q(true);
            AbstractC30795n.m94707h((!z4 || str5 == null) ? str6 : str5, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getN7(), null, c28655q, 0, i17, 196602);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11547l0(i13, str, str2, str3, str6, str5, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m77216H(String str, String str2, String str3, String str4, String str5, boolean z4, int i13, Composer composer, int i14) {
        m77215G(str, str2, str3, str4, str5, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final void m77217I(C22014f c22014f, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1356462458);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c22014f) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C25514e(function1, 8);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            AbstractC32411b.m101089d(interfaceC4339a, new C3948a0(3), AbstractC37817c.m121344e(1122330001, c28655q, new C21859k(interfaceC4339a, c22014f, function1, 8)), c28655q, 432);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(c22014f, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m77218J(Function1 function1) {
        function1.invoke(InterfaceC24792c.b.f97031a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m77219K(InterfaceC4339a interfaceC4339a, C22014f c22014f, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            float f14 = 1 * f13;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
            AbstractC17911t abstractC17911tM44012U = AbstractC15673b0.m44012U();
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f14);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3357b = AbstractC1092a.m3357b(c2314t, abstractC17911tM44012U, c33252iM105489e, 0.0f, 4);
            float f15 = ((float) 2.5d) * f13;
            Modifier modifierM3409f = AbstractC1102d.m3409f(0.8f, AbstractC1099a.m3397s(modifierM3357b, f15, f15, f15, 3 * f13));
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            m77229U(interfaceC4339a, c28655q, 0);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f13, c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            m77227S(c22014f.getTitle(), c22014f.getSubtitle(), c22014f.m62917a(), c28655q, 0);
            C22016g c22016gM62918b = c22014f.getPrimaryCta();
            C22016g c22016gM62919c = c22014f.getSecondaryCta();
            int i14 = C9598e.f28134d;
            m77221M(c22016gM62918b, c22016gM62919c, interfaceC4339a, function1, c28655q, i14 | (i14 << 3));
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m77220L(C22014f c22014f, Function1 function1, int i13, Composer composer, int i14) {
        m77217I(c22014f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final void m77221M(final C22016g c22016g, final C22016g c22016g2, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-166232612);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c22016g) : c28655q.m87157i(c22016g) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c22016g2) : c28655q.m87157i(c22016g2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 1 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            long j7 = C17919x.f69636m;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(j7, 0L, 0L, 0L, c28655q, 6, 14);
            float f15 = 16 * 4;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f15);
            float f16 = 2;
            float f17 = ((float) 1.5d) * f13;
            C22976l1 c22976l2 = new C22976l1(f16, f17, f16, f17);
            Modifier modifierM44455h = AbstractC15751g.m44455h(c2314t, f16, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), AbstractC33253j.m105489e(f15));
            boolean z4 = (i14 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C24679k(interfaceC4339a, 12);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
            final int i15 = 0;
            boolean z13 = false;
            AbstractC12350b.m34578a(interfaceC4339a2, modifierM44455h, false, null, c33252iM105489e, null, c15077m1M43196a, c22976l2, AbstractC37817c.m121344e(-1059150794, c28655q, new Function3() { // from class: mx1.l
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i16 = i15;
                    InterfaceC22997s1 interfaceC22997s1 = (InterfaceC22997s1) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i16) {
                        case 0:
                            return AbstractC26007m.m77223O(c22016g, interfaceC22997s1, composer2, iIntValue);
                        default:
                            return AbstractC26007m.m77225Q(c22016g, interfaceC22997s1, composer2, iIntValue);
                    }
                }
            }), c28655q, 905994240, 76);
            C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(j7, 0L, 0L, 0L, c28655q, 6, 14);
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f15);
            C22976l1 c22976l3 = new C22976l1(f16, f17, f16, f17);
            boolean z14 = (i14 & 7168) == 2048;
            if ((i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q.m87157i(c22016g2))) {
                z13 = true;
            }
            boolean z15 = z14 | z13;
            Object objM87133R2 = c28655q.m87133R();
            if (z15 || objM87133R2 == c28676v0) {
                objM87133R2 = new C26001g(function1, c22016g2, 2);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
            final int i16 = 1;
            AbstractC12350b.m34578a(interfaceC4339a3, null, false, null, c33252iM105489e2, null, c15077m1M43196a2, c22976l3, AbstractC37817c.m121344e(-339701921, c28655q, new Function3() { // from class: mx1.l
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i17 = i16;
                    InterfaceC22997s1 interfaceC22997s1 = (InterfaceC22997s1) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i17) {
                        case 0:
                            return AbstractC26007m.m77223O(c22016g2, interfaceC22997s1, composer2, iIntValue);
                        default:
                            return AbstractC26007m.m77225Q(c22016g2, interfaceC22997s1, composer2, iIntValue);
                    }
                }
            }), c28655q, 905994240, 78);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25550b(i13, 9, c22016g, c22016g2, interfaceC4339a, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m77222N(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m77223O(C22016g c22016g, InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(AbstractC11478a.m30853e(Locale.ROOT, c22016g.getText(), "toUpperCase(...)"), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getBtM(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m77224P(Function1 function1, C22016g c22016g) {
        function1.invoke(c22016g.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m77225Q(C22016g c22016g, InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(AbstractC11478a.m30853e(Locale.ROOT, c22016g.getText(), "toUpperCase(...)"), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getBtM(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m77226R(C22016g c22016g, C22016g c22016g2, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m77221M(c22016g, c22016g2, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    private static final void m77227S(String str, String str2, List<String> list, Composer composer, int i13) {
        String str3;
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1983854749);
        if ((i13 & 6) == 0) {
            str3 = str;
            i14 = (c28655q2.m87153g(str3) ? 4 : 2) | i13;
        } else {
            str3 = str;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(str2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(list) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q2, i15).getBrandWhite();
            C2886a c2886aM8436q = c38072d.m121952e(c28655q2, i15).getH3();
            int i16 = C2886a.f11498d << 18;
            int i17 = i14;
            AbstractC30795n.m94707h(str3, null, jM125430y, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q2, i14 & 14, i16, 196090);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            float f13 = 8;
            float f14 = 1 * f13;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            int i18 = 6;
            AbstractC30795n.m94707h(str2, null, c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB2(), null, c28655q2, (i17 >> 3) & 14, i16, 196090);
            c28655q = c28655q2;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 0.75d) * f13, 0.0f, 2);
            C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 0.5d, f13, c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(914207233);
            for (String str4 : list) {
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, i18);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                C0209i c0209i5 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                C38072d c38072d2 = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                long jM125385c1 = c38072d2.m121949b(c28655q, i19).getWhite70();
                C2886a c2886aM8421b = c38072d2.m121952e(c28655q, i19).getB2();
                C36775k c36775k = new C36775k(5);
                int i24 = C2886a.f11498d << 18;
                C28655q c28655q3 = c28655q;
                AbstractC30795n.m94707h("•", null, jM125385c1, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q3, 6, i24, 196090);
                AbstractC30795n.m94707h(str4, null, c38072d2.m121949b(c28655q3, i19).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i19).getB2(), null, c28655q3, 0, i24, 196090);
                c28655q = c28655q3;
                c28655q.m87173q(true);
                i18 = 6;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(str, str2, list, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m77228T(String str, String str2, List list, int i13, Composer composer, int i14) {
        m77227S(str, str2, list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: U */
    private static final void m77229U(InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1505498323);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C27270o c27270o = new C27270o(AbstractC27274q.c.f109140f, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, false, false, false, 0.0f, false, 1020, null);
            String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C24679k(interfaceC4339a, 13);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(c27270o, strM21273g, null, null, (InterfaceC4339a) objM87133R, c28655q, C27270o.f109105k, 12);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 12, interfaceC4339a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m77230V(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m77231W(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m77229U(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X */
    private static final void m77232X(C22014f c22014f, boolean z4, C22016g c22016g, C22016g c22016g2, String str, String str2, EnumC22030t enumC22030t, Function1 function1, Composer composer, int i13) {
        int i14;
        String str3;
        boolean z13;
        int i15;
        String str4;
        C22016g c22016g3;
        boolean z14;
        int i16;
        C38072d c38072d;
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2037128650);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c22014f) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(c22016g) : c28655q.m87157i(c22016g) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(c22016g2) : c28655q.m87157i(c22016g2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(str) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87153g(str2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87149e(enumC22030t.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87157i(function1) ? 8388608 : 4194304;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 4793491) != 4793490)) {
            float f13 = 8;
            float f14 = 2 * f13;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f15 = 4;
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            C13825t c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * f15, c38072d2.m121949b(c28655q, i18).getWhite20());
            if (!(c22016g2 != null)) {
                c13825tM48880a = null;
            }
            C13825t c13825t = c13825tM48880a;
            int i19 = b.f102799a[enumC22030t.ordinal()];
            if (i19 == 1) {
                str3 = "One";
            } else if (i19 == 2) {
                str3 = "Peak";
            } else if (i19 == 3) {
                str3 = "Life";
            } else {
                if (i19 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str3 = "";
            }
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            long j7 = C17919x.f69636m;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(j7, 0L, c38072d2.m121949b(c28655q, i18).getWhite10(), 0L, c28655q, 6, 10);
            float f16 = f15 * f15;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f16);
            float f17 = 0;
            float f18 = f17 * f13;
            C22976l1 c22976l2 = new C22976l1(f17, f18, f17, f18);
            int i24 = i14 & 29360128;
            boolean zM87157i = c28655q.m87157i(c22014f) | (i24 == 8388608);
            int i25 = i14 & 458752;
            boolean zM87153g = zM87157i | (i25 == 131072) | c28655q.m87153g(str3) | ((i14 & 896) == 256 || ((i14 & 512) != 0 && c28655q.m87157i(c22016g)));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                z13 = false;
                i15 = i14;
                String str5 = str3;
                C0073h c0073h = new C0073h(c22014f, function1, str2, str5, c22016g);
                str4 = str5;
                c22016g3 = c22016g;
                c28655q.m87172p0(c0073h);
                objM87133R = c0073h;
            } else {
                c22016g3 = c22016g;
                z13 = false;
                i15 = i14;
                str4 = str3;
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            C37816b c37816bM121344e = AbstractC37817c.m121344e(-1521624912, c28655q, new C13708q(c22016g2, z4, enumC22030t, c22016g3));
            int i26 = ((i15 << 3) & 896) | 905969664;
            int i27 = i15;
            String str6 = str4;
            c28655q = c28655q;
            boolean z15 = z13;
            AbstractC12350b.m34578a(interfaceC4339a, null, z4, null, c33252iM105489e, c13825t, c15077m1M43196a, c22976l2, c37816bM121344e, c28655q, i26, 26);
            if (c22016g2 == null) {
                c28655q.m87150e0(1500466568);
                c28655q.m87173q(z15);
                i16 = i27;
                c38072d = c38072d2;
                i17 = i18;
            } else {
                c28655q.m87150e0(1500466569);
                C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(j7, 0L, c38072d2.m121949b(c28655q, i18).getWhite10(), 0L, c28655q, 6, 10);
                C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f16);
                C22976l1 c22976l3 = new C22976l1(f17, f18, f17, f18);
                if (i24 == 8388608) {
                    c28655q = c28655q;
                    z14 = true;
                } else {
                    c28655q = c28655q;
                    z14 = z15;
                }
                i16 = i27;
                boolean zM87153g2 = z14 | (i25 == 131072 ? true : z15) | c28655q.m87153g(str6) | (((i16 & 7168) == 2048 || ((i16 & 4096) != 0 && c28655q.m87157i(c22016g2))) ? true : z15);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    C1012d c1012d = new C1012d((Object) function1, str2, (Object) str6, (Object) c22016g2, 28);
                    c28655q.m87172p0(c1012d);
                    objM87133R2 = c1012d;
                }
                AbstractC12350b.m34578a((InterfaceC4339a) objM87133R2, null, z4, null, c33252iM105489e2, null, c15077m1M43196a2, c22976l3, AbstractC37817c.m121344e(1725214717, c28655q, new C18522f(25, enumC22030t, c22016g2)), c28655q, i26, 90);
                c28655q.m87173q(z15);
                c38072d = c38072d2;
                i17 = i18;
            }
            AbstractC30795n.m94707h(str, AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7)), c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, ((i16 >> 12) & 14) | 48, C2886a.f11498d << 18, 196088);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2509e2(c22014f, z4, c22016g, c22016g2, str, str2, enumC22030t, function1, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m77233Y(C22014f c22014f, Function1 function1, String str, String str2, C22016g c22016g) {
        if (c22014f != null) {
            function1.invoke(new AbstractC2119a.c(null, null, str, null, str2, null, 43, null));
            function1.invoke(InterfaceC24792c.d.f97033a);
        } else {
            function1.invoke(new AbstractC2119a.k(null, null, str, null, str2, null, 43, null));
            function1.invoke(c22016g.getDestination());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m77234Z(C22016g c22016g, boolean z4, EnumC22030t enumC22030t, C22016g c22016g2, InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC18247a buttonBackground;
        long jM53363d;
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            if (c22016g != null) {
                c28655q.m87150e0(-1992657253);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = a.f102798w;
                    c28655q.m87172p0(objM87133R);
                }
                buttonBackground = AbstractC18249c.m52575m(p745y81.Function1.m125323a((Function1) objM87133R));
                c28655q.m87173q(false);
            } else if (z4) {
                c28655q.m87150e0(-1992654560);
                c28655q.m87173q(false);
                buttonBackground = enumC22030t.getButtonBackground();
            } else {
                c28655q.m87150e0(-1992651776);
                c28655q.m87173q(false);
                buttonBackground = EnumC22030t.DISABLED.getButtonBackground();
            }
            if (z4 && c22016g == null) {
                c28655q.m87150e0(-1992647206);
                jM53363d = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else if (c22016g != null) {
                c28655q.m87150e0(-1992644998);
                jM53363d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-1992643305);
                jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            long j7 = jM53363d;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC18249c.m52565c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), buttonBackground), 0.0f, 2 * 8, 1);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21278l(c22016g2.getText()), c28655q, TextResource.$stable), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m77236a0(Function1 function1, String str, String str2, C22016g c22016g) {
        function1.invoke(new AbstractC2119a.e(null, null, str, null, str2, null, 43, null));
        function1.invoke(c22016g.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m77238b0(EnumC22030t enumC22030t, C22016g c22016g, InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC18249c.m52565c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), enumC22030t.getButtonBackground()), 0.0f, 2 * 8, 1);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            String strM21274h = AbstractC8693b.m21274h(AbstractC8693b.m21278l(c22016g.getText()), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m77240c0(C22014f c22014f, boolean z4, C22016g c22016g, C22016g c22016g2, String str, String str2, EnumC22030t enumC22030t, Function1 function1, int i13, Composer composer, int i14) {
        m77232X(c22014f, z4, c22016g, c22016g2, str, str2, enumC22030t, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x038f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0399  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0102  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x0199  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0219  */
    /* JADX WARN: Code duplicated, block: B:71:0x026d  */
    /* JADX WARN: Code duplicated, block: B:73:0x027f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0296  */
    /* JADX WARN: Code duplicated, block: B:77:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:80:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:81:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:88:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:93:0x0354  */
    /* JADX WARN: Code duplicated, block: B:95:0x0360  */
    /* JADX WARN: Code duplicated, block: B:96:0x036b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0382  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public static final void m77242d0(C22029s viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        int iHashCode2;
        C0209i c0209i5;
        C0209i c0209i6;
        int i16;
        int i17;
        int iHashCode3;
        C38072d c38072d;
        TextResource textResource;
        C39274g c39274g;
        int i18;
        boolean z13;
        Object objM87133R;
        Function1 function2;
        boolean z14;
        boolean z15;
        boolean z16;
        int i19;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(109744053);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i15 |= i19;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                float f13 = 3;
                float f14 = 8;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(f13 * f14);
                Modifier modifierM77256k0 = m77256k0(AbstractC18489d0.m53364e(modifier2, f13, 4), viewState.getStyle(), viewState.getCheckoutType());
                float f15 = 2 * f14;
                Modifier modifierM3397s = AbstractC1099a.m3397s(modifierM77256k0, f15, f15, f15, ((float) 2.5d) * f14);
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3397s);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C23010x c23010xM73381n = AbstractC25012a.m73381n(1, f14, c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i5 = c0209i3;
                } else {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c0209i6 = c0209i5;
                i16 = (i15 >> 3) & 112;
                i17 = i15;
                Modifier modifier4 = modifier2;
                m77211C(viewState.getTitle(), viewState.getSubtitle(), viewState.getExpandedSubtitle(), viewState.getPrice(), viewState.getExpandedPrice(), viewState.getIsExpanded(), viewState.m62995v(), viewState.getPaymentOptions(), viewState.getPaymentOptionSelected(), viewState.getFormValidator(), viewState.getCard(), function1, c28655q, C29855e.f122028d << 27, Card.$stable | i16);
                c28655q = c28655q;
                if (viewState.getExpandTitle() == null) {
                    c28655q.m87150e0(-1369945614);
                    c28655q.m87173q(false);
                    function2 = function1;
                    i18 = i17;
                    z15 = true;
                } else {
                    c28655q.m87150e0(-1369945613);
                    AbstractC17755i2.m50938j(AbstractC1102d.m3409f(1.0f, c2314t), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
                    C22961h c22961h = AbstractC22977m.f90656g;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, C2299e.f9107J, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    String strM62982i = viewState.getExpandTitle();
                    c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM62982i, null, c38072d.m121949b(c28655q, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q;
                    if (viewState.getExpandText() == null) {
                        c28655q.m87150e0(16710354);
                        c28655q.m87173q(false);
                        function2 = function1;
                        z14 = false;
                        i18 = i17;
                    } else {
                        c28655q.m87150e0(16710355);
                        EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getExpandText());
                        textResource = null;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (viewState.getIsExpanded()) {
                            c39274g = new C39274g(c38072d.m121951d().getTinyIcons().getUpArrow(), textResource, 2, objArr == true ? 1 : 0);
                        } else {
                            c39274g = new C39274g(c38072d.m121951d().getTinyIcons().getDownArrow(), objArr2 == true ? 1 : 0, 2, objArr3 == true ? 1 : 0);
                        }
                        C39274g c39274g2 = c39274g;
                        i18 = i17;
                        if ((i18 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (!z13 || objM87133R == C28635l.f115821a) {
                            function2 = function1;
                            objM87133R = new C23434k(function2, 24);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            function2 = function1;
                        }
                        AbstractC27265l0.m82217i(null, enumC27269n0, textResourceM21278l, null, c39274g2, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 6) | 100663344 | (C39274g.f168929c << 12), 0, 3817);
                        c28655q = c28655q;
                        z14 = false;
                        c28655q.m87173q(false);
                    }
                    z15 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(z15);
                C22014f c22014fM62980g = viewState.getConfirmModal();
                boolean zM62977c = viewState.getButtonEnabled();
                C22016g c22016gM62990q = viewState.getPrimaryCta();
                C22016g c22016gM62991r = viewState.getSecondaryCta();
                String strM62985l = viewState.getFooterText();
                String strM62997x = viewState.getTrackingMonths();
                EnumC22030t enumC22030tM62993t = viewState.getStyle();
                int i26 = C9598e.f28134d;
                onViewEvent = function2;
                m77232X(c22014fM62980g, zM62977c, c22016gM62990q, c22016gM62991r, strM62985l, strM62997x, enumC22030tM62993t, onViewEvent, c28655q, (i26 << 9) | (i26 << 6) | ((i18 << 15) & 29360128));
                c28655q.m87173q(true);
                if (viewState.getShowConfirmModal()) {
                    c28655q.m87150e0(-1910052885);
                    if (viewState.getConfirmModal() == null) {
                        c28655q.m87150e0(917902710);
                        z16 = false;
                        c28655q.m87173q(false);
                    } else {
                        z16 = false;
                        c28655q.m87150e0(917902711);
                        m77217I(viewState.getConfirmModal(), onViewEvent, c28655q, i16);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z16);
                } else {
                    c28655q.m87150e0(918052813);
                    c28655q.m87173q(false);
                }
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(i13, i14, 6, modifier3, onViewEvent, viewState);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(onViewEvent)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i15 |= i19;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier2 = c2314t;
            }
            float f16 = 3;
            float f17 = 8;
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f16 * f17);
            Modifier modifierM77256k1 = m77256k0(AbstractC18489d0.m53364e(modifier2, f16, 4), viewState.getStyle(), viewState.getCheckoutType());
            float f18 = 2 * f17;
            Modifier modifierM3397s2 = AbstractC1099a.m3397s(modifierM77256k1, f18, f18, f18, ((float) 2.5d) * f17);
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k2, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3397s2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            C23010x c23010xM73381n2 = AbstractC25012a.m73381n(1, f17, c2305k2, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
            } else {
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
            c0209i6 = c0209i5;
            i16 = (i15 >> 3) & 112;
            i17 = i15;
            Modifier modifier5 = modifier2;
            m77211C(viewState.getTitle(), viewState.getSubtitle(), viewState.getExpandedSubtitle(), viewState.getPrice(), viewState.getExpandedPrice(), viewState.getIsExpanded(), viewState.m62995v(), viewState.getPaymentOptions(), viewState.getPaymentOptionSelected(), viewState.getFormValidator(), viewState.getCard(), function1, c28655q, C29855e.f122028d << 27, Card.$stable | i16);
            c28655q = c28655q;
            if (viewState.getExpandTitle() == null) {
                c28655q.m87150e0(-1369945614);
                c28655q.m87173q(false);
                function2 = function1;
                i18 = i17;
                z15 = true;
            } else {
                c28655q.m87150e0(-1369945613);
                AbstractC17755i2.m50938j(AbstractC1102d.m3409f(1.0f, c2314t), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
                C22961h c22961h2 = AbstractC22977m.f90656g;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h2, C2299e.f9107J, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                String strM62982i2 = viewState.getExpandTitle();
                c38072d = C38072d.f163053a;
                int i27 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM62982i2, null, c38072d.m121949b(c28655q, i27).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                if (viewState.getExpandText() == null) {
                    c28655q.m87150e0(16710354);
                    c28655q.m87173q(false);
                    function2 = function1;
                    z14 = false;
                    i18 = i17;
                } else {
                    c28655q.m87150e0(16710355);
                    EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(viewState.getExpandText());
                    textResource = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (viewState.getIsExpanded()) {
                        c39274g = new C39274g(c38072d.m121951d().getTinyIcons().getUpArrow(), textResource, 2, objArr == true ? 1 : 0);
                    } else {
                        c39274g = new C39274g(c38072d.m121951d().getTinyIcons().getDownArrow(), objArr2 == true ? 1 : 0, 2, objArr3 == true ? 1 : 0);
                    }
                    C39274g c39274g3 = c39274g;
                    i18 = i17;
                    if ((i18 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        function2 = function1;
                        objM87133R = new C23434k(function2, 24);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function2 = function1;
                        objM87133R = new C23434k(function2, 24);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27265l0.m82217i(null, enumC27269n1, textResourceM21278l2, null, c39274g3, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 6) | 100663344 | (C39274g.f168929c << 12), 0, 3817);
                    c28655q = c28655q;
                    z14 = false;
                    c28655q.m87173q(false);
                }
                z15 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(z14);
            }
            c28655q.m87173q(z15);
            C22014f c22014fM62980g2 = viewState.getConfirmModal();
            boolean zM62977c2 = viewState.getButtonEnabled();
            C22016g c22016gM62990q2 = viewState.getPrimaryCta();
            C22016g c22016gM62991r2 = viewState.getSecondaryCta();
            String strM62985l2 = viewState.getFooterText();
            String strM62997x2 = viewState.getTrackingMonths();
            EnumC22030t enumC22030tM62993t2 = viewState.getStyle();
            int i28 = C9598e.f28134d;
            onViewEvent = function2;
            m77232X(c22014fM62980g2, zM62977c2, c22016gM62990q2, c22016gM62991r2, strM62985l2, strM62997x2, enumC22030tM62993t2, onViewEvent, c28655q, (i28 << 9) | (i28 << 6) | ((i18 << 15) & 29360128));
            c28655q.m87173q(true);
            if (viewState.getShowConfirmModal()) {
                c28655q.m87150e0(-1910052885);
                if (viewState.getConfirmModal() == null) {
                    c28655q.m87150e0(917902710);
                    z16 = false;
                    c28655q.m87173q(false);
                } else {
                    z16 = false;
                    c28655q.m87150e0(917902711);
                    m77217I(viewState.getConfirmModal(), onViewEvent, c28655q, i16);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z16);
            } else {
                c28655q.m87150e0(918052813);
                c28655q.m87173q(false);
            }
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(i13, i14, 6, modifier3, onViewEvent, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m77244e0(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(InterfaceC24792c.e.f97034a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m77246f0(C22029s c22029s, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m77242d0(c22029s, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g0 */
    private static final void m77248g0(C22010d c22010d, int i13, C29855e c29855e, Card card, Function1 function1, Composer composer, int i14) {
        C22010d c22010d2;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1699070799);
        if ((i14 & 6) == 0) {
            c22010d2 = c22010d;
            i15 = (c28655q.m87153g(c22010d2) ? 4 : 2) | i14;
        } else {
            c22010d2 = c22010d;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? c28655q.m87153g(c29855e) : c28655q.m87157i(c29855e) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? c28655q.m87153g(card) : c28655q.m87157i(card) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            List listM118959K = AbstractC37056f.m118959K(AbstractC8693b.m21278l(c22010d2.getExistingLabel()), AbstractC8693b.m21278l(c22010d2.getAlternateLabel()));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM118959K) {
                if (AbstractC8693b.m21270d((TextResource) obj)) {
                    arrayList.add(obj);
                }
            }
            float f13 = 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f13), C2299e.f9110M, c28655q, 6);
            int i16 = i15;
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC17755i2.m50938j(AbstractC1102d.m3409f(1.0f, c2314t), null, EnumC17740f.LEFT, AbstractC8693b.m21278l(c22010d2.getTitle()), null, 0L, 0L, null, c28655q, (TextResource.$stable << 9) | 390, 242);
            if (c29855e == null) {
                c28655q.m87150e0(-761500158);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-761500157);
                C24774j c24774j = new C24774j(AbstractC8693b.m21267a(), arrayList, i13, card == null ? new Card((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : card);
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 1 * f13, 0.0f, 2);
                int i17 = 57344 & i16;
                boolean z4 = (i17 == 16384) | ((i16 & 7168) == 2048 || ((i16 & 4096) != 0 && c28655q.m87157i(card)));
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z4 || objM87133R == c28676v0) {
                    objM87133R = new C21245d(19, card, function1);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R;
                boolean z13 = i17 == 16384;
                Object objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C23434k(function1, 23);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC24769e.m72542h(modifierM3396r, c24774j, c29855e, false, interfaceC4351m, (Function1) objM87133R2, c28655q, (C29855e.f122028d << 6) | 3078 | (i16 & 896), 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c(c22010d, i13, c29855e, card, function1, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m77250h0(Card card, Function1 function1, boolean z4, Card newCard) {
        AbstractC22676k.m65750j(newCard, "newCard");
        if (!newCard.equals(card)) {
            function1.invoke(new InterfaceC24792c.f(newCard, z4));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m77252i0(Function1 function1, int i13) {
        function1.invoke(new InterfaceC24792c.g(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m77254j0(C22010d c22010d, int i13, C29855e c29855e, Card card, Function1 function1, int i14, Composer composer, int i15) {
        m77248g0(c22010d, i13, c29855e, card, function1, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k0 */
    private static final Modifier m77256k0(Modifier modifier, EnumC22030t enumC22030t, EnumC22031u enumC22031u) {
        return AbstractC1125a.m3478a(AbstractC18249c.m52565c(modifier, AbstractC18249c.m52575m(p745y81.Function1.m125323a(c.f102801w))), new C24656d(18, enumC22031u, enumC22030t));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m77258l0(EnumC22031u enumC22031u, EnumC22030t enumC22030t, InterfaceC22131e drawBehind) {
        EnumC22030t enumC22030t2;
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        int i13 = b.f102800b[enumC22031u.ordinal()];
        if (i13 == 1) {
            enumC22030t2 = enumC22030t;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC22030t2 = EnumC22030t.ONE;
        }
        C17909s c17909s = AbstractC17911t.f69612b;
        C23465k[] backgroundColors = enumC22030t2.getBackgroundColors();
        C23465k[] c23465kArr = (C23465k[]) Arrays.copyOf(backgroundColors, backgroundColors.length);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        float fHypot = (float) Math.hypot(Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)), Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)));
        c17909s.getClass();
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51488f(c23465kArr, jFloatToRawIntBits, fHypot, 3), 0L, 0L, enumC22030t2.getAlpha(), null, 0, 118);
        return C23454a0.f92919a;
    }
}
