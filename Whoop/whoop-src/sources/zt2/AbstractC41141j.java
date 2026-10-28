package zt2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.ChallengeLandingScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import e11.AbstractC12583c;
import e11.C12584d;
import gy0.AbstractC16277f;
import i11.AbstractC17862e;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import lz0.AbstractC24821f;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import tg2.C33795i;
import vt2.AbstractC36498g;
import w20.C36727q;
import wb3.AbstractC37056f;
import wt2.AbstractC37634o;
import wt2.C37623d;
import wt2.C37626g;
import wt2.C37633n;
import wt2.EnumC37632m;
import x30.C37900j1;
import x81.C38072d;
import y71.C39274g;
import zi1.C40674e0;
import zm1.C40893d;
import zr1.C41067a;

/* JADX INFO: renamed from: zt2.j */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a[\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lwt2/n;", "planState", "", "isUpdating", "Lkotlin/Function0;", "Ll83/a0;", "onCurrentPlanClicked", "Lkotlin/Function1;", "Lvt2/g;", "onNavigationEvent", "", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lwt2/n;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", NotificationCompat.CATEGORY_EVENT, "p", "(Ljava/lang/Object;)Ljava/lang/Object;", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41141j {

    /* JADX INFO: renamed from: zt2.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f177368a;

        static {
            int[] iArr = new int[EnumC37632m.values().length];
            try {
                iArr[EnumC37632m.ON_TRACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37632m.STRUGGLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC37632m.OFF_TRACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC37632m.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f177368a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0217  */
    /* JADX WARN: Code duplicated, block: B:103:0x021e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0224  */
    /* JADX WARN: Code duplicated, block: B:106:0x0226  */
    /* JADX WARN: Code duplicated, block: B:108:0x0229  */
    /* JADX WARN: Code duplicated, block: B:111:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0234  */
    /* JADX WARN: Code duplicated, block: B:116:0x023c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0243  */
    /* JADX WARN: Code duplicated, block: B:120:0x0245  */
    /* JADX WARN: Code duplicated, block: B:123:0x024c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x024e  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:131:0x02de  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x030e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0318  */
    /* JADX WARN: Code duplicated, block: B:144:0x032a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0336  */
    /* JADX WARN: Code duplicated, block: B:147:0x0338  */
    /* JADX WARN: Code duplicated, block: B:150:0x033f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x0345  */
    /* JADX WARN: Code duplicated, block: B:158:0x0372  */
    /* JADX WARN: Code duplicated, block: B:159:0x0380  */
    /* JADX WARN: Code duplicated, block: B:162:0x043c  */
    /* JADX WARN: Code duplicated, block: B:163:0x049a  */
    /* JADX WARN: Code duplicated, block: B:165:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:166:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:169:0x0506  */
    /* JADX WARN: Code duplicated, block: B:171:0x0512  */
    /* JADX WARN: Code duplicated, block: B:173:0x054c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0550  */
    /* JADX WARN: Code duplicated, block: B:177:0x0563  */
    /* JADX WARN: Code duplicated, block: B:179:0x0571  */
    /* JADX WARN: Code duplicated, block: B:182:0x0664  */
    /* JADX WARN: Code duplicated, block: B:185:0x0672  */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x0106  */
    /* JADX WARN: Code duplicated, block: B:73:0x011c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0158  */
    /* JADX WARN: Code duplicated, block: B:77:0x015c  */
    /* JADX WARN: Code duplicated, block: B:80:0x016f  */
    /* JADX WARN: Code duplicated, block: B:82:0x017d  */
    /* JADX WARN: Code duplicated, block: B:85:0x018e  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x020f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX INFO: renamed from: h */
    public static final void m133611h(C37633n planState, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        boolean z13;
        boolean z14;
        Function1 function2;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        boolean z15;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Function1 function3;
        int i17;
        long jM125377a;
        int iHashCode;
        C2314t c2314t;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C37623d datePicker;
        int i18;
        int iHashCode2;
        String strM120897c;
        boolean z16;
        String strM120896b;
        boolean z17;
        String strM120897c2;
        String str;
        boolean z18;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a5;
        int i19;
        int i24;
        C2314t c2314t2;
        boolean z19;
        boolean z24;
        boolean z25;
        C12584d currentPlan;
        int i25;
        ?? r15;
        ?? r10;
        Object objM87133R2;
        C28676v0 c28676v1;
        int i26;
        List<InterfaceC25312u> listM120936i;
        ?? r14;
        Object objM87133R3;
        C41136e bannerTile;
        C2314t c2314t3;
        C28655q c28655q;
        int i27;
        float f13;
        float f14;
        int i28;
        C38072d c38072d;
        int i29;
        int i34;
        C2314t c2314t4;
        int i35;
        C38072d c38072d2;
        boolean z26;
        int i36;
        C37626g progressBar;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i5;
        Object objM87133R4;
        Object objM87133R5;
        int i37;
        AbstractC22676k.m65750j(planState, "planState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1126843900);
        int i38 = (i13 & 6) == 0 ? (c28655q2.m87157i(planState) ? 4 : 2) | i13 : i13;
        int i39 = i14 & 2;
        if (i39 == 0) {
            if ((i13 & 48) == 0) {
                i38 |= c28655q2.m87155h(z4) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i38 |= i16;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q2.m87157i(onViewEvent)) {
                        i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i37 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i38 |= i37;
                }
                if ((i38 & 8339) != 8338) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q2.m87135U(i38 & 1, z13)) {
                    if (i39 != 0) {
                        z15 = false;
                    } else {
                        z15 = z4;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C40674e0(15);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if ((i14 & 8) != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C40893d(17);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function3 = (Function1) objM87133R4;
                    } else {
                        function3 = function1;
                    }
                    i17 = a.f177368a[planState.getTitle().getStyle().ordinal()];
                    if (i17 != 1) {
                        c28655q2.m87150e0(-565218768);
                        jM125377a = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getAccentAction();
                        c28655q2.m87173q(false);
                    } else if (i17 != 2) {
                        c28655q2.m87150e0(-565216468);
                        jM125377a = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getRecovery();
                        c28655q2.m87173q(false);
                    } else if (i17 != 3) {
                        c28655q2.m87150e0(-565214313);
                        jM125377a = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getAccentNegativeTrend();
                        c28655q2.m87173q(false);
                    } else {
                        if (i17 == 4) {
                            throw AbstractC11895b.m32003v(-565221280, c28655q2, false);
                        }
                        c28655q2.m87150e0(-565211986);
                        jM125377a = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                    }
                    long j7 = jM125377a;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    datePicker = planState.getDatePicker();
                    if (datePicker == null) {
                        c28655q2.m87150e0(-766269168);
                        c28655q2.m87173q(false);
                        i18 = i38;
                        z19 = z15;
                        interfaceC4339a5 = interfaceC4339a4;
                        c2314t2 = c2314t;
                        i24 = 1;
                        i19 = 3;
                        z24 = false;
                    } else {
                        c28655q2.m87150e0(-766269167);
                        float f15 = 4;
                        Modifier modifierM3424u = AbstractC1102d.m3424u(50 * f15, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        i18 = i38;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3424u);
                        c28655q2.m87158i0();
                        boolean z27 = z15;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                        Modifier modifierM3411h = AbstractC1102d.m3411h(12 * f15, c2314t);
                        TextResource textResourceM120895a = datePicker.getCurrentDateRange();
                        strM120897c = datePicker.getPrevDateTime();
                        if (strM120897c != null || strM120897c.length() <= 0) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        strM120896b = datePicker.getNextDateTime();
                        if (strM120896b != null) {
                            if (strM120896b.length() > 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            z17 = z25;
                        } else {
                            z17 = false;
                        }
                        strM120897c2 = datePicker.getPrevDateTime();
                        if (strM120897c2 == null) {
                            str = "";
                        } else {
                            str = strM120897c2;
                        }
                        String strM120896b2 = datePicker.getNextDateTime();
                        String str2 = strM120896b2 != null ? strM120896b2 : "";
                        if ((i18 & 57344) == 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (z18 || objM87133R == c28676v0) {
                            objM87133R = new C41067a(onViewEvent, 2);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
                        boolean z28 = z16;
                        interfaceC4339a5 = interfaceC4339a6;
                        i19 = 3;
                        String str3 = str2;
                        i24 = 1;
                        c2314t2 = c2314t;
                        AbstractC17862e.m51358q(modifierM3411h, z27, null, textResourceM120895a, z28, z17, str, str3, null, null, null, null, (Function1) objM87133R, c28655q2, (i18 & 112) | 6 | (TextResource.$stable << 9), 0, 3844);
                        z19 = z27;
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(true);
                        z24 = false;
                        AbstractC31061c.m95650z(3, f15, c2314t2, c28655q2, false);
                    }
                    currentPlan = planState.getCurrentPlan();
                    if (currentPlan == null) {
                        c28655q2.m87150e0(-765537599);
                        c28655q2.m87173q(z24);
                        i25 = i18;
                        c28676v1 = c28676v0;
                        i26 = 4;
                    } else {
                        c28655q2.m87150e0(-765537598);
                        C12584d c12584d = new C12584d(currentPlan.getTitle(), currentPlan.getSubtitle(), currentPlan.getLeadingIcon(), currentPlan.getTrailingIcon(), currentPlan.getDestination());
                        boolean zM87157i = c28655q2.m87157i(currentPlan);
                        i25 = i18;
                        if ((i25 & 896) == 256) {
                            r15 = i24;
                        } else {
                            r15 = z24;
                        }
                        r10 = (zM87157i ? 1 : 0) | r15;
                        objM87133R2 = c28655q2.m87133R();
                        c28676v1 = c28676v0;
                        if (r10 == 0 || objM87133R2 == c28676v1) {
                            objM87133R2 = new C37900j1(24, currentPlan, interfaceC4339a5);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC12583c.m35265e(null, c12584d, (Function1) objM87133R2, c28655q2, C12584d.f42958f << 3, 1);
                        i26 = 4;
                        float f16 = 4;
                        AbstractC31061c.m95650z(f16, f16, c2314t2, c28655q2, z24);
                    }
                    listM120936i = planState.m120936i();
                    if (listM120936i == null) {
                        c28655q2.m87150e0(-764862977);
                        c28655q2.m87173q(z24);
                    } else {
                        c28655q2.m87150e0(-764862976);
                        for (InterfaceC25312u interfaceC25312u : listM120936i) {
                            if ((i25 & 57344) == 16384) {
                                r14 = i24;
                            } else {
                                r14 = z24;
                            }
                            objM87133R3 = c28655q2.m87133R();
                            if (r14 == 0 || objM87133R3 == c28676v1) {
                                objM87133R3 = new C41067a(onViewEvent, 3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            Function1 function4 = (Function1) objM87133R3;
                            C28655q c28655q3 = c28655q2;
                            AbstractC25303l.m74291r(interfaceC25312u, null, null, function4, c28655q3, 0, 6);
                            c28655q2 = c28655q3;
                            AbstractC18489d0.m53380u(i19, i26, c2314t2, c28655q2);
                        }
                        c28655q2.m87173q(z24);
                    }
                    bannerTile = planState.getBannerTile();
                    if (bannerTile == null) {
                        c28655q2.m87150e0(-764498014);
                        c28655q2.m87173q(z24);
                        c28655q = c28655q2;
                        i27 = 2;
                        c2314t3 = c2314t2;
                    } else {
                        c28655q2.m87150e0(-764498013);
                        C28655q c28655q4 = c28655q2;
                        c2314t3 = c2314t2;
                        c28655q = c28655q4;
                        i27 = 2;
                        AbstractC41135d.m133561e(AbstractC1102d.m3409f(1.0f, c2314t2), bannerTile, onViewEvent, c28655q, (((TextResource.$stable | C39274g.f168929c) | C9598e.f28134d) << i19) | 6 | ((i25 >> 6) & 896), 0);
                        float f17 = i26;
                        AbstractC31061c.m95650z(f17, f17, c2314t3, c28655q, z24);
                    }
                    f13 = i24;
                    f14 = 8 * f13;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t3));
                    TextResource textResourceM120904a = planState.getTitle().getDisplay();
                    i28 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(textResourceM120904a, c28655q, i28);
                    c38072d = C38072d.f163053a;
                    i29 = C38072d.f163054b;
                    C2886a c2886aM8418P = c38072d.m121952e(c28655q, i29).getT3();
                    i34 = C2886a.f11498d << 18;
                    c2314t4 = c2314t3;
                    i35 = i27;
                    C28655q c28655q5 = c28655q;
                    InterfaceC4339a interfaceC4339a7 = interfaceC4339a5;
                    AbstractC30795n.m94707h(strM21274h, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q5, 0, i34, 196602);
                    c28655q2 = c28655q5;
                    if (planState.getDescription() != null) {
                        c28655q2.m87150e0(-764004524);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(i35 * 4, c2314t4));
                        c38072d2 = c38072d;
                        i36 = i29;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(planState.getDescription(), c28655q2, i28), null, c38072d2.m121949b(c28655q2, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i29).getB1(), null, c28655q2, 0, i34, 196602);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                        z26 = false;
                    } else {
                        c38072d2 = c38072d;
                        if (planState.getSubtitle() != null) {
                            c28655q2.m87150e0(-763714674);
                            i36 = i29;
                            z26 = false;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(planState.getSubtitle(), c28655q2, i28), null, c38072d2.m121949b(c28655q2, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i29).getB1(), null, c28655q2, 0, i34, 196602);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else {
                            z26 = false;
                            i36 = i29;
                            c28655q2.m87150e0(-763524396);
                            c28655q2.m87173q(false);
                        }
                    }
                    progressBar = planState.getProgressBar();
                    if (progressBar == null) {
                        c28655q2.m87150e0(-763431583);
                        c28655q2.m87173q(z26);
                    } else {
                        AbstractC33745d.m106667z(c28655q2, -763431582, c2314t4, f14, c28655q2);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(c2314t4, null, 3));
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i5 = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                        AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(1933328508, c28655q2, new C36727q(progressBar, 28)), c28655q2, 56);
                        float f18 = 4 * f13;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f18, c2314t4));
                        int i44 = i36;
                        C28655q c28655q6 = c28655q2;
                        int i45 = i36;
                        AbstractC30795n.m94707h(progressBar.getSubTitle(), AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, f13, 7), c38072d2.m121949b(c28655q2, i44).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i44).getH5(), null, c28655q6, 48, i34, 196600);
                        AbstractC18489d0.m53356B(c28655q6, true, c2314t4, f18, c28655q6);
                        AbstractC24821f.m72736b(null, progressBar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q6, i45).getAccentPositiveTrend()), new C17919x(c38072d2.m121949b(c28655q6, i45).getAccentPositiveTrend())), 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q6, i45).getWhite10(), false, f18, c28655q6, 1769856, 1);
                        c28655q2 = c28655q6;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function2 = function3;
                    interfaceC4339a3 = interfaceC4339a7;
                    z14 = z19;
                } else {
                    c28655q2.m87138X();
                    z14 = z4;
                    function2 = function1;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C33795i(planState, z14, interfaceC4339a3, function2, onViewEvent, i13, i14);
                }
            }
            i38 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(onViewEvent)) {
                    i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i37 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i38 |= i37;
            }
            if ((i38 & 8339) != 8338) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i38 & 1, z13)) {
                if (i39 != 0) {
                    z15 = false;
                } else {
                    z15 = z4;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C40674e0(15);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if ((i14 & 8) != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C40893d(17);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    function3 = function1;
                }
                i17 = a.f177368a[planState.getTitle().getStyle().ordinal()];
                if (i17 != 1) {
                    c28655q2.m87150e0(-565218768);
                    jM125377a = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getAccentAction();
                    c28655q2.m87173q(false);
                } else if (i17 != 2) {
                    c28655q2.m87150e0(-565216468);
                    jM125377a = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getRecovery();
                    c28655q2.m87173q(false);
                } else if (i17 != 3) {
                    c28655q2.m87150e0(-565214313);
                    jM125377a = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getAccentNegativeTrend();
                    c28655q2.m87173q(false);
                } else {
                    if (i17 == 4) {
                        throw AbstractC11895b.m32003v(-565221280, c28655q2, false);
                    }
                    c28655q2.m87150e0(-565211986);
                    jM125377a = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                }
                long j13 = jM125377a;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                datePicker = planState.getDatePicker();
                if (datePicker == null) {
                    c28655q2.m87150e0(-766269168);
                    c28655q2.m87173q(false);
                    i18 = i38;
                    z19 = z15;
                    interfaceC4339a5 = interfaceC4339a4;
                    c2314t2 = c2314t;
                    i24 = 1;
                    i19 = 3;
                    z24 = false;
                } else {
                    c28655q2.m87150e0(-766269167);
                    float f19 = 4;
                    Modifier modifierM3424u2 = AbstractC1102d.m3424u(50 * f19, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    i18 = i38;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3424u2);
                    c28655q2.m87158i0();
                    boolean z29 = z15;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
                    Modifier modifierM3411h2 = AbstractC1102d.m3411h(12 * f19, c2314t);
                    TextResource textResourceM120895a2 = datePicker.getCurrentDateRange();
                    strM120897c = datePicker.getPrevDateTime();
                    if (strM120897c != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    strM120896b = datePicker.getNextDateTime();
                    if (strM120896b != null) {
                        if (strM120896b.length() > 0) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z17 = z25;
                    } else {
                        z17 = false;
                    }
                    strM120897c2 = datePicker.getPrevDateTime();
                    if (strM120897c2 == null) {
                        str = "";
                    } else {
                        str = strM120897c2;
                    }
                    String strM120896b3 = datePicker.getNextDateTime();
                    if (strM120896b3 != null) {
                    }
                    if ((i18 & 57344) == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z18) {
                        objM87133R = new C41067a(onViewEvent, 2);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C41067a(onViewEvent, 2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a8 = interfaceC4339a4;
                    boolean z210 = z16;
                    interfaceC4339a5 = interfaceC4339a8;
                    i19 = 3;
                    String str4 = str2;
                    i24 = 1;
                    c2314t2 = c2314t;
                    AbstractC17862e.m51358q(modifierM3411h2, z29, null, textResourceM120895a2, z210, z17, str, str4, null, null, null, null, (Function1) objM87133R, c28655q2, (i18 & 112) | 6 | (TextResource.$stable << 9), 0, 3844);
                    z19 = z29;
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(true);
                    z24 = false;
                    AbstractC31061c.m95650z(3, f19, c2314t2, c28655q2, false);
                }
                currentPlan = planState.getCurrentPlan();
                if (currentPlan == null) {
                    c28655q2.m87150e0(-765537599);
                    c28655q2.m87173q(z24);
                    i25 = i18;
                    c28676v1 = c28676v0;
                    i26 = 4;
                } else {
                    c28655q2.m87150e0(-765537598);
                    C12584d c12584d2 = new C12584d(currentPlan.getTitle(), currentPlan.getSubtitle(), currentPlan.getLeadingIcon(), currentPlan.getTrailingIcon(), currentPlan.getDestination());
                    boolean zM87157i2 = c28655q2.m87157i(currentPlan);
                    i25 = i18;
                    if ((i25 & 896) == 256) {
                        r15 = i24;
                    } else {
                        r15 = z24;
                    }
                    r10 = (zM87157i2 ? 1 : 0) | r15;
                    objM87133R2 = c28655q2.m87133R();
                    c28676v1 = c28676v0;
                    if (r10 == 0) {
                        objM87133R2 = new C37900j1(24, currentPlan, interfaceC4339a5);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C37900j1(24, currentPlan, interfaceC4339a5);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC12583c.m35265e(null, c12584d2, (Function1) objM87133R2, c28655q2, C12584d.f42958f << 3, 1);
                    i26 = 4;
                    float f110 = 4;
                    AbstractC31061c.m95650z(f110, f110, c2314t2, c28655q2, z24);
                }
                listM120936i = planState.m120936i();
                if (listM120936i == null) {
                    c28655q2.m87150e0(-764862977);
                    c28655q2.m87173q(z24);
                } else {
                    c28655q2.m87150e0(-764862976);
                    while (r2.hasNext()) {
                        if ((i25 & 57344) == 16384) {
                            r14 = i24;
                        } else {
                            r14 = z24;
                        }
                        objM87133R3 = c28655q2.m87133R();
                        if (r14 == 0) {
                            objM87133R3 = new C41067a(onViewEvent, 3);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C41067a(onViewEvent, 3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        Function1 function5 = (Function1) objM87133R3;
                        C28655q c28655q7 = c28655q2;
                        AbstractC25303l.m74291r(interfaceC25312u, null, null, function5, c28655q7, 0, 6);
                        c28655q2 = c28655q7;
                        AbstractC18489d0.m53380u(i19, i26, c2314t2, c28655q2);
                    }
                    c28655q2.m87173q(z24);
                }
                bannerTile = planState.getBannerTile();
                if (bannerTile == null) {
                    c28655q2.m87150e0(-764498014);
                    c28655q2.m87173q(z24);
                    c28655q = c28655q2;
                    i27 = 2;
                    c2314t3 = c2314t2;
                } else {
                    c28655q2.m87150e0(-764498013);
                    C28655q c28655q8 = c28655q2;
                    c2314t3 = c2314t2;
                    c28655q = c28655q8;
                    i27 = 2;
                    AbstractC41135d.m133561e(AbstractC1102d.m3409f(1.0f, c2314t2), bannerTile, onViewEvent, c28655q, (((TextResource.$stable | C39274g.f168929c) | C9598e.f28134d) << i19) | 6 | ((i25 >> 6) & 896), 0);
                    float f111 = i26;
                    AbstractC31061c.m95650z(f111, f111, c2314t3, c28655q, z24);
                }
                f13 = i24;
                f14 = 8 * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t3));
                TextResource textResourceM120904a2 = planState.getTitle().getDisplay();
                i28 = TextResource.$stable;
                String strM21274h2 = AbstractC8693b.m21274h(textResourceM120904a2, c28655q, i28);
                c38072d = C38072d.f163053a;
                i29 = C38072d.f163054b;
                C2886a c2886aM8418P2 = c38072d.m121952e(c28655q, i29).getT3();
                i34 = C2886a.f11498d << 18;
                c2314t4 = c2314t3;
                i35 = i27;
                C28655q c28655q9 = c28655q;
                InterfaceC4339a interfaceC4339a9 = interfaceC4339a5;
                AbstractC30795n.m94707h(strM21274h2, null, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P2, null, c28655q9, 0, i34, 196602);
                c28655q2 = c28655q9;
                if (planState.getDescription() != null) {
                    c28655q2.m87150e0(-764004524);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(i35 * 4, c2314t4));
                    c38072d2 = c38072d;
                    i36 = i29;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(planState.getDescription(), c28655q2, i28), null, c38072d2.m121949b(c28655q2, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i29).getB1(), null, c28655q2, 0, i34, 196602);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                    z26 = false;
                } else {
                    c38072d2 = c38072d;
                    if (planState.getSubtitle() != null) {
                        c28655q2.m87150e0(-763714674);
                        i36 = i29;
                        z26 = false;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(planState.getSubtitle(), c28655q2, i28), null, c38072d2.m121949b(c28655q2, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i29).getB1(), null, c28655q2, 0, i34, 196602);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else {
                        z26 = false;
                        i36 = i29;
                        c28655q2.m87150e0(-763524396);
                        c28655q2.m87173q(false);
                    }
                }
                progressBar = planState.getProgressBar();
                if (progressBar == null) {
                    c28655q2.m87150e0(-763431583);
                    c28655q2.m87173q(z26);
                } else {
                    AbstractC33745d.m106667z(c28655q2, -763431582, c2314t4, f14, c28655q2);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(c2314t4, null, 3));
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i5 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                    AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(1933328508, c28655q2, new C36727q(progressBar, 28)), c28655q2, 56);
                    float f112 = 4 * f13;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f112, c2314t4));
                    int i46 = i36;
                    C28655q c28655q10 = c28655q2;
                    int i47 = i36;
                    AbstractC30795n.m94707h(progressBar.getSubTitle(), AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, f13, 7), c38072d2.m121949b(c28655q2, i46).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i46).getH5(), null, c28655q10, 48, i34, 196600);
                    AbstractC18489d0.m53356B(c28655q10, true, c2314t4, f112, c28655q10);
                    AbstractC24821f.m72736b(null, progressBar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q10, i47).getAccentPositiveTrend()), new C17919x(c38072d2.m121949b(c28655q10, i47).getAccentPositiveTrend())), 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q10, i47).getWhite10(), false, f112, c28655q10, 1769856, 1);
                    c28655q2 = c28655q10;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                function2 = function3;
                interfaceC4339a3 = interfaceC4339a9;
                z14 = z19;
            } else {
                c28655q2.m87138X();
                z14 = z4;
                function2 = function1;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33795i(planState, z14, interfaceC4339a3, function2, onViewEvent, i13, i14);
            }
        }
        i38 |= 48;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i38 |= i16;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(onViewEvent)) {
                    i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i37 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i38 |= i37;
            }
            if ((i38 & 8339) != 8338) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i38 & 1, z13)) {
                if (i39 != 0) {
                    z15 = false;
                } else {
                    z15 = z4;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C40674e0(15);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if ((i14 & 8) != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C40893d(17);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    function3 = function1;
                }
                i17 = a.f177368a[planState.getTitle().getStyle().ordinal()];
                if (i17 != 1) {
                    c28655q2.m87150e0(-565218768);
                    jM125377a = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getAccentAction();
                    c28655q2.m87173q(false);
                } else if (i17 != 2) {
                    c28655q2.m87150e0(-565216468);
                    jM125377a = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getRecovery();
                    c28655q2.m87173q(false);
                } else if (i17 != 3) {
                    c28655q2.m87150e0(-565214313);
                    jM125377a = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getAccentNegativeTrend();
                    c28655q2.m87173q(false);
                } else {
                    if (i17 == 4) {
                        throw AbstractC11895b.m32003v(-565221280, c28655q2, false);
                    }
                    c28655q2.m87150e0(-565211986);
                    jM125377a = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                }
                long j14 = jM125377a;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a3);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m7);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N7);
                datePicker = planState.getDatePicker();
                if (datePicker == null) {
                    c28655q2.m87150e0(-766269168);
                    c28655q2.m87173q(false);
                    i18 = i38;
                    z19 = z15;
                    interfaceC4339a5 = interfaceC4339a4;
                    c2314t2 = c2314t;
                    i24 = 1;
                    i19 = 3;
                    z24 = false;
                } else {
                    c28655q2.m87150e0(-766269167);
                    float f113 = 4;
                    Modifier modifierM3424u3 = AbstractC1102d.m3424u(50 * f113, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    i18 = i38;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3424u3);
                    c28655q2.m87158i0();
                    boolean z211 = z15;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m8);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N8);
                    Modifier modifierM3411h3 = AbstractC1102d.m3411h(12 * f113, c2314t);
                    TextResource textResourceM120895a3 = datePicker.getCurrentDateRange();
                    strM120897c = datePicker.getPrevDateTime();
                    if (strM120897c != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    strM120896b = datePicker.getNextDateTime();
                    if (strM120896b != null) {
                        if (strM120896b.length() > 0) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z17 = z25;
                    } else {
                        z17 = false;
                    }
                    strM120897c2 = datePicker.getPrevDateTime();
                    if (strM120897c2 == null) {
                        str = "";
                    } else {
                        str = strM120897c2;
                    }
                    String strM120896b4 = datePicker.getNextDateTime();
                    if (strM120896b4 != null) {
                    }
                    if ((i18 & 57344) == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z18) {
                        objM87133R = new C41067a(onViewEvent, 2);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C41067a(onViewEvent, 2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a10 = interfaceC4339a4;
                    boolean z212 = z16;
                    interfaceC4339a5 = interfaceC4339a10;
                    i19 = 3;
                    String str5 = str2;
                    i24 = 1;
                    c2314t2 = c2314t;
                    AbstractC17862e.m51358q(modifierM3411h3, z211, null, textResourceM120895a3, z212, z17, str, str5, null, null, null, null, (Function1) objM87133R, c28655q2, (i18 & 112) | 6 | (TextResource.$stable << 9), 0, 3844);
                    z19 = z211;
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(true);
                    z24 = false;
                    AbstractC31061c.m95650z(3, f113, c2314t2, c28655q2, false);
                }
                currentPlan = planState.getCurrentPlan();
                if (currentPlan == null) {
                    c28655q2.m87150e0(-765537599);
                    c28655q2.m87173q(z24);
                    i25 = i18;
                    c28676v1 = c28676v0;
                    i26 = 4;
                } else {
                    c28655q2.m87150e0(-765537598);
                    C12584d c12584d3 = new C12584d(currentPlan.getTitle(), currentPlan.getSubtitle(), currentPlan.getLeadingIcon(), currentPlan.getTrailingIcon(), currentPlan.getDestination());
                    boolean zM87157i3 = c28655q2.m87157i(currentPlan);
                    i25 = i18;
                    if ((i25 & 896) == 256) {
                        r15 = i24;
                    } else {
                        r15 = z24;
                    }
                    r10 = (zM87157i3 ? 1 : 0) | r15;
                    objM87133R2 = c28655q2.m87133R();
                    c28676v1 = c28676v0;
                    if (r10 == 0) {
                        objM87133R2 = new C37900j1(24, currentPlan, interfaceC4339a5);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C37900j1(24, currentPlan, interfaceC4339a5);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC12583c.m35265e(null, c12584d3, (Function1) objM87133R2, c28655q2, C12584d.f42958f << 3, 1);
                    i26 = 4;
                    float f114 = 4;
                    AbstractC31061c.m95650z(f114, f114, c2314t2, c28655q2, z24);
                }
                listM120936i = planState.m120936i();
                if (listM120936i == null) {
                    c28655q2.m87150e0(-764862977);
                    c28655q2.m87173q(z24);
                } else {
                    c28655q2.m87150e0(-764862976);
                    while (r2.hasNext()) {
                        if ((i25 & 57344) == 16384) {
                            r14 = i24;
                        } else {
                            r14 = z24;
                        }
                        objM87133R3 = c28655q2.m87133R();
                        if (r14 == 0) {
                            objM87133R3 = new C41067a(onViewEvent, 3);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C41067a(onViewEvent, 3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        Function1 function6 = (Function1) objM87133R3;
                        C28655q c28655q11 = c28655q2;
                        AbstractC25303l.m74291r(interfaceC25312u, null, null, function6, c28655q11, 0, 6);
                        c28655q2 = c28655q11;
                        AbstractC18489d0.m53380u(i19, i26, c2314t2, c28655q2);
                    }
                    c28655q2.m87173q(z24);
                }
                bannerTile = planState.getBannerTile();
                if (bannerTile == null) {
                    c28655q2.m87150e0(-764498014);
                    c28655q2.m87173q(z24);
                    c28655q = c28655q2;
                    i27 = 2;
                    c2314t3 = c2314t2;
                } else {
                    c28655q2.m87150e0(-764498013);
                    C28655q c28655q12 = c28655q2;
                    c2314t3 = c2314t2;
                    c28655q = c28655q12;
                    i27 = 2;
                    AbstractC41135d.m133561e(AbstractC1102d.m3409f(1.0f, c2314t2), bannerTile, onViewEvent, c28655q, (((TextResource.$stable | C39274g.f168929c) | C9598e.f28134d) << i19) | 6 | ((i25 >> 6) & 896), 0);
                    float f115 = i26;
                    AbstractC31061c.m95650z(f115, f115, c2314t3, c28655q, z24);
                }
                f13 = i24;
                f14 = 8 * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t3));
                TextResource textResourceM120904a3 = planState.getTitle().getDisplay();
                i28 = TextResource.$stable;
                String strM21274h3 = AbstractC8693b.m21274h(textResourceM120904a3, c28655q, i28);
                c38072d = C38072d.f163053a;
                i29 = C38072d.f163054b;
                C2886a c2886aM8418P3 = c38072d.m121952e(c28655q, i29).getT3();
                i34 = C2886a.f11498d << 18;
                c2314t4 = c2314t3;
                i35 = i27;
                C28655q c28655q13 = c28655q;
                InterfaceC4339a interfaceC4339a11 = interfaceC4339a5;
                AbstractC30795n.m94707h(strM21274h3, null, j14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P3, null, c28655q13, 0, i34, 196602);
                c28655q2 = c28655q13;
                if (planState.getDescription() != null) {
                    c28655q2.m87150e0(-764004524);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(i35 * 4, c2314t4));
                    c38072d2 = c38072d;
                    i36 = i29;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(planState.getDescription(), c28655q2, i28), null, c38072d2.m121949b(c28655q2, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i29).getB1(), null, c28655q2, 0, i34, 196602);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                    z26 = false;
                } else {
                    c38072d2 = c38072d;
                    if (planState.getSubtitle() != null) {
                        c28655q2.m87150e0(-763714674);
                        i36 = i29;
                        z26 = false;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(planState.getSubtitle(), c28655q2, i28), null, c38072d2.m121949b(c28655q2, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i29).getB1(), null, c28655q2, 0, i34, 196602);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else {
                        z26 = false;
                        i36 = i29;
                        c28655q2.m87150e0(-763524396);
                        c28655q2.m87173q(false);
                    }
                }
                progressBar = planState.getProgressBar();
                if (progressBar == null) {
                    c28655q2.m87150e0(-763431583);
                    c28655q2.m87173q(z26);
                } else {
                    AbstractC33745d.m106667z(c28655q2, -763431582, c2314t4, f14, c28655q2);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(c2314t4, null, 3));
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3409f3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m9);
                    c0209i5 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N9);
                    AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(1933328508, c28655q2, new C36727q(progressBar, 28)), c28655q2, 56);
                    float f116 = 4 * f13;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f116, c2314t4));
                    int i48 = i36;
                    C28655q c28655q14 = c28655q2;
                    int i49 = i36;
                    AbstractC30795n.m94707h(progressBar.getSubTitle(), AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, f13, 7), c38072d2.m121949b(c28655q2, i48).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i48).getH5(), null, c28655q14, 48, i34, 196600);
                    AbstractC18489d0.m53356B(c28655q14, true, c2314t4, f116, c28655q14);
                    AbstractC24821f.m72736b(null, progressBar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q14, i49).getAccentPositiveTrend()), new C17919x(c38072d2.m121949b(c28655q14, i49).getAccentPositiveTrend())), 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q14, i49).getWhite10(), false, f116, c28655q14, 1769856, 1);
                    c28655q2 = c28655q14;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                function2 = function3;
                interfaceC4339a3 = interfaceC4339a11;
                z14 = z19;
            } else {
                c28655q2.m87138X();
                z14 = z4;
                function2 = function1;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33795i(planState, z14, interfaceC4339a3, function2, onViewEvent, i13, i14);
            }
        }
        i38 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i13 & 24576) == 0) {
            if (c28655q2.m87157i(onViewEvent)) {
                i37 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i37 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i38 |= i37;
        }
        if ((i38 & 8339) != 8338) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i38 & 1, z13)) {
            if (i39 != 0) {
                z15 = false;
            } else {
                z15 = z4;
            }
            c28676v0 = C28635l.f115821a;
            if (i15 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C40674e0(15);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if ((i14 & 8) != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C40893d(17);
                    c28655q2.m87172p0(objM87133R4);
                }
                function3 = (Function1) objM87133R4;
            } else {
                function3 = function1;
            }
            i17 = a.f177368a[planState.getTitle().getStyle().ordinal()];
            if (i17 != 1) {
                c28655q2.m87150e0(-565218768);
                jM125377a = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getAccentAction();
                c28655q2.m87173q(false);
            } else if (i17 != 2) {
                c28655q2.m87150e0(-565216468);
                jM125377a = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getRecovery();
                c28655q2.m87173q(false);
            } else if (i17 != 3) {
                c28655q2.m87150e0(-565214313);
                jM125377a = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getAccentNegativeTrend();
                c28655q2.m87173q(false);
            } else {
                if (i17 == 4) {
                    throw AbstractC11895b.m32003v(-565221280, c28655q2, false);
                }
                c28655q2.m87150e0(-565211986);
                jM125377a = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            }
            long j15 = jM125377a;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a4);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m10);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N10);
            datePicker = planState.getDatePicker();
            if (datePicker == null) {
                c28655q2.m87150e0(-766269168);
                c28655q2.m87173q(false);
                i18 = i38;
                z19 = z15;
                interfaceC4339a5 = interfaceC4339a4;
                c2314t2 = c2314t;
                i24 = 1;
                i19 = 3;
                z24 = false;
            } else {
                c28655q2.m87150e0(-766269167);
                float f117 = 4;
                Modifier modifierM3424u4 = AbstractC1102d.m3424u(50 * f117, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                i18 = i38;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3424u4);
                c28655q2.m87158i0();
                boolean z213 = z15;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11);
                Modifier modifierM3411h4 = AbstractC1102d.m3411h(12 * f117, c2314t);
                TextResource textResourceM120895a4 = datePicker.getCurrentDateRange();
                strM120897c = datePicker.getPrevDateTime();
                if (strM120897c != null) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                strM120896b = datePicker.getNextDateTime();
                if (strM120896b != null) {
                    if (strM120896b.length() > 0) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z17 = z25;
                } else {
                    z17 = false;
                }
                strM120897c2 = datePicker.getPrevDateTime();
                if (strM120897c2 == null) {
                    str = "";
                } else {
                    str = strM120897c2;
                }
                String strM120896b5 = datePicker.getNextDateTime();
                if (strM120896b5 != null) {
                }
                if ((i18 & 57344) == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z18) {
                    objM87133R = new C41067a(onViewEvent, 2);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C41067a(onViewEvent, 2);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a12 = interfaceC4339a4;
                boolean z214 = z16;
                interfaceC4339a5 = interfaceC4339a12;
                i19 = 3;
                String str6 = str2;
                i24 = 1;
                c2314t2 = c2314t;
                AbstractC17862e.m51358q(modifierM3411h4, z213, null, textResourceM120895a4, z214, z17, str, str6, null, null, null, null, (Function1) objM87133R, c28655q2, (i18 & 112) | 6 | (TextResource.$stable << 9), 0, 3844);
                z19 = z213;
                c28655q2 = c28655q2;
                c28655q2.m87173q(true);
                z24 = false;
                AbstractC31061c.m95650z(3, f117, c2314t2, c28655q2, false);
            }
            currentPlan = planState.getCurrentPlan();
            if (currentPlan == null) {
                c28655q2.m87150e0(-765537599);
                c28655q2.m87173q(z24);
                i25 = i18;
                c28676v1 = c28676v0;
                i26 = 4;
            } else {
                c28655q2.m87150e0(-765537598);
                C12584d c12584d4 = new C12584d(currentPlan.getTitle(), currentPlan.getSubtitle(), currentPlan.getLeadingIcon(), currentPlan.getTrailingIcon(), currentPlan.getDestination());
                boolean zM87157i4 = c28655q2.m87157i(currentPlan);
                i25 = i18;
                if ((i25 & 896) == 256) {
                    r15 = i24;
                } else {
                    r15 = z24;
                }
                r10 = (zM87157i4 ? 1 : 0) | r15;
                objM87133R2 = c28655q2.m87133R();
                c28676v1 = c28676v0;
                if (r10 == 0) {
                    objM87133R2 = new C37900j1(24, currentPlan, interfaceC4339a5);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C37900j1(24, currentPlan, interfaceC4339a5);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC12583c.m35265e(null, c12584d4, (Function1) objM87133R2, c28655q2, C12584d.f42958f << 3, 1);
                i26 = 4;
                float f118 = 4;
                AbstractC31061c.m95650z(f118, f118, c2314t2, c28655q2, z24);
            }
            listM120936i = planState.m120936i();
            if (listM120936i == null) {
                c28655q2.m87150e0(-764862977);
                c28655q2.m87173q(z24);
            } else {
                c28655q2.m87150e0(-764862976);
                while (r2.hasNext()) {
                    if ((i25 & 57344) == 16384) {
                        r14 = i24;
                    } else {
                        r14 = z24;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (r14 == 0) {
                        objM87133R3 = new C41067a(onViewEvent, 3);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C41067a(onViewEvent, 3);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Function1 function7 = (Function1) objM87133R3;
                    C28655q c28655q15 = c28655q2;
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, function7, c28655q15, 0, 6);
                    c28655q2 = c28655q15;
                    AbstractC18489d0.m53380u(i19, i26, c2314t2, c28655q2);
                }
                c28655q2.m87173q(z24);
            }
            bannerTile = planState.getBannerTile();
            if (bannerTile == null) {
                c28655q2.m87150e0(-764498014);
                c28655q2.m87173q(z24);
                c28655q = c28655q2;
                i27 = 2;
                c2314t3 = c2314t2;
            } else {
                c28655q2.m87150e0(-764498013);
                C28655q c28655q16 = c28655q2;
                c2314t3 = c2314t2;
                c28655q = c28655q16;
                i27 = 2;
                AbstractC41135d.m133561e(AbstractC1102d.m3409f(1.0f, c2314t2), bannerTile, onViewEvent, c28655q, (((TextResource.$stable | C39274g.f168929c) | C9598e.f28134d) << i19) | 6 | ((i25 >> 6) & 896), 0);
                float f119 = i26;
                AbstractC31061c.m95650z(f119, f119, c2314t3, c28655q, z24);
            }
            f13 = i24;
            f14 = 8 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t3));
            TextResource textResourceM120904a4 = planState.getTitle().getDisplay();
            i28 = TextResource.$stable;
            String strM21274h4 = AbstractC8693b.m21274h(textResourceM120904a4, c28655q, i28);
            c38072d = C38072d.f163053a;
            i29 = C38072d.f163054b;
            C2886a c2886aM8418P4 = c38072d.m121952e(c28655q, i29).getT3();
            i34 = C2886a.f11498d << 18;
            c2314t4 = c2314t3;
            i35 = i27;
            C28655q c28655q17 = c28655q;
            InterfaceC4339a interfaceC4339a13 = interfaceC4339a5;
            AbstractC30795n.m94707h(strM21274h4, null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P4, null, c28655q17, 0, i34, 196602);
            c28655q2 = c28655q17;
            if (planState.getDescription() != null) {
                c28655q2.m87150e0(-764004524);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(i35 * 4, c2314t4));
                c38072d2 = c38072d;
                i36 = i29;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(planState.getDescription(), c28655q2, i28), null, c38072d2.m121949b(c28655q2, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i29).getB1(), null, c28655q2, 0, i34, 196602);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
                z26 = false;
            } else {
                c38072d2 = c38072d;
                if (planState.getSubtitle() != null) {
                    c28655q2.m87150e0(-763714674);
                    i36 = i29;
                    z26 = false;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(planState.getSubtitle(), c28655q2, i28), null, c38072d2.m121949b(c28655q2, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i29).getB1(), null, c28655q2, 0, i34, 196602);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else {
                    z26 = false;
                    i36 = i29;
                    c28655q2.m87150e0(-763524396);
                    c28655q2.m87173q(false);
                }
            }
            progressBar = planState.getProgressBar();
            if (progressBar == null) {
                c28655q2.m87150e0(-763431583);
                c28655q2.m87173q(z26);
            } else {
                AbstractC33745d.m106667z(c28655q2, -763431582, c2314t4, f14, c28655q2);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(c2314t4, null, 3));
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3409f4);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m12);
                c0209i5 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N12);
                AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(1933328508, c28655q2, new C36727q(progressBar, 28)), c28655q2, 56);
                float f1110 = 4 * f13;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f1110, c2314t4));
                int i410 = i36;
                C28655q c28655q18 = c28655q2;
                int i411 = i36;
                AbstractC30795n.m94707h(progressBar.getSubTitle(), AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, f13, 7), c38072d2.m121949b(c28655q2, i410).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i410).getH5(), null, c28655q18, 48, i34, 196600);
                AbstractC18489d0.m53356B(c28655q18, true, c2314t4, f1110, c28655q18);
                AbstractC24821f.m72736b(null, progressBar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q18, i411).getAccentPositiveTrend()), new C17919x(c38072d2.m121949b(c28655q18, i411).getAccentPositiveTrend())), 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q18, i411).getWhite10(), false, f1110, c28655q18, 1769856, 1);
                c28655q2 = c28655q18;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            function2 = function3;
            interfaceC4339a3 = interfaceC4339a13;
            z14 = z19;
        } else {
            c28655q2.m87138X();
            z14 = z4;
            function2 = function1;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33795i(planState, z14, interfaceC4339a3, function2, onViewEvent, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m133612i() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m133613j(AbstractC36498g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m133614k(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC37634o.c((String) it, null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m133615l(C12584d c12584d, InterfaceC4339a interfaceC4339a, Object destination) {
        AbstractC22676k.m65750j(destination, "destination");
        if (c12584d.getTrailingIcon() != null && (destination instanceof C9598e) && AbstractC22676k.m65745e(((C9598e) destination).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9366m6.f27782w)) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m133616m(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(m133619p(event));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m133617n(C37626g c37626g, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
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
            String strM21275i = AbstractC8693b.m21275i(c37626g.getTitle(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8405C = c38072d.m121952e(c28655q, i14).getN6();
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21275i, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8405C, null, c28655q, 0, i15, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC16277f.f62235F1, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getN8(), null, c28655q, 48, i15, 196600);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m133618o(C37633n c37633n, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m133611h(c37633n, z4, interfaceC4339a, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final Object m133619p(Object obj) {
        C9598e c9598e = obj instanceof C9598e ? (C9598e) obj : null;
        if (c9598e != null) {
            NavigationScreenModel parameters = c9598e.getParameters();
            ChallengeLandingScreenModel challengeLandingScreenModel = parameters instanceof ChallengeLandingScreenModel ? (ChallengeLandingScreenModel) parameters : null;
            C9598e c9598eM23127b = challengeLandingScreenModel != null ? C9598e.m23127b(c9598e, null, challengeLandingScreenModel.copy("jj_tile_on_weekly_plan"), null, 5, null) : null;
            if (c9598eM23127b != null) {
                return c9598eM23127b;
            }
        }
        return obj;
    }
}
