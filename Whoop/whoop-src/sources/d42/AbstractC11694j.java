package d42;

import a31.C0343e;
import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aq1.C1909c;
import b91.C2886a;
import bs1.C3590i;
import c42.C4167d;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cy1.C11186b;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import l83.C23454a0;
import l83.C23471q;
import l83.InterfaceC23459e;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import u32.AbstractC34506a;
import u32.AbstractC34507b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: d42.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0081\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a=\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aQ\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e²\u0006\u000e\u0010\u0015\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "isDueDateLoading", "isGeneralError", "isDueDateUpdateError", "Lc42/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onSavedClicked", "Lkotlin/Function0;", "onPregnancyOnboardingDueDateExit", "onErrorRetry", "onErrorForceExit", "onDueDateRetry", "C", "(ZZZLc42/d;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroid/app/DatePickerDialog;", "datePickerDialog", "selectedDateText", "o", "(Landroidx/compose/ui/Modifier;Lc42/d;Lc93/a;Landroid/app/DatePickerDialog;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "buttonTextResource", "t", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(ZZZLc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "pregnancy_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11694j {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m31179A(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m31180B(boolean z4, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, int i13, Composer composer, int i14) {
        m31209w(z4, z13, z14, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0179 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x017b  */
    /* JADX WARN: Code duplicated, block: B:105:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:111:0x0203  */
    /* JADX WARN: Code duplicated, block: B:114:0x0231  */
    /* JADX WARN: Code duplicated, block: B:115:0x0235  */
    /* JADX WARN: Code duplicated, block: B:118:0x0242  */
    /* JADX WARN: Code duplicated, block: B:120:0x0250  */
    /* JADX WARN: Code duplicated, block: B:123:0x029e  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:130:0x02df  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00de  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0106  */
    /* JADX WARN: Code duplicated, block: B:83:0x0108  */
    /* JADX WARN: Code duplicated, block: B:86:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:88:0x0115  */
    /* JADX WARN: Code duplicated, block: B:90:0x0118  */
    /* JADX WARN: Code duplicated, block: B:91:0x011a  */
    /* JADX WARN: Code duplicated, block: B:94:0x011e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    /* JADX INFO: renamed from: C */
    public static final void m31181C(boolean z4, boolean z13, boolean z14, C4167d viewState, Function1 onSavedClicked, InterfaceC4339a onPregnancyOnboardingDueDateExit, InterfaceC4339a onErrorRetry, InterfaceC4339a onErrorForceExit, InterfaceC4339a onDueDateRetry, Composer composer, int i13, int i14) {
        boolean z15;
        int i15;
        boolean z16;
        int i16;
        boolean z17;
        int i17;
        int i18;
        boolean z18;
        boolean z19;
        boolean z24;
        C28677v1 c28677v1M87180u;
        boolean z25;
        boolean z26;
        boolean z27;
        SimpleDateFormat simpleDateFormat;
        Calendar calendar;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87157i;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        boolean z28;
        Object objM87133R3;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean zM87157i2;
        int i28;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onSavedClicked, "onSavedClicked");
        AbstractC22676k.m65750j(onPregnancyOnboardingDueDateExit, "onPregnancyOnboardingDueDateExit");
        AbstractC22676k.m65750j(onErrorRetry, "onErrorRetry");
        AbstractC22676k.m65750j(onErrorForceExit, "onErrorForceExit");
        AbstractC22676k.m65750j(onDueDateRetry, "onDueDateRetry");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(693799388);
        int i29 = i14 & 1;
        if (i29 != 0) {
            i15 = i13 | 6;
            z15 = z4;
        } else if ((i13 & 6) == 0) {
            z15 = z4;
            i15 = (c28655q.m87155h(z15) ? 4 : 2) | i13;
        } else {
            z15 = z4;
            i15 = i13;
        }
        int i34 = i14 & 2;
        if (i34 == 0) {
            if ((i13 & 48) == 0) {
                z16 = z13;
                i15 |= c28655q.m87155h(z16) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z17 = z14;
                    if (c28655q.m87155h(z17)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if ((i13 & 4096) == 0) {
                        zM87157i2 = c28655q.m87153g(viewState);
                    } else {
                        zM87157i2 = c28655q.m87157i(viewState);
                    }
                    if (zM87157i2) {
                        i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i28;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(onSavedClicked)) {
                        i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i27;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(onPregnancyOnboardingDueDateExit)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(onErrorRetry)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(onErrorForceExit)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i15 |= i24;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87157i(onDueDateRetry)) {
                        i19 = 67108864;
                    } else {
                        i19 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i19;
                }
                i18 = i15;
                if ((38347923 & i18) != 38347922) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i18 & 1, z18)) {
                    if (i29 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if (i34 != 0) {
                        z26 = false;
                    } else {
                        z26 = z16;
                    }
                    boolean z29 = z25;
                    if (i16 != 0) {
                        z27 = false;
                    } else {
                        z27 = z17;
                    }
                    Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    calendar = Calendar.getInstance();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(viewState.getMaxDate());
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    C23471q c23471qM13030b = viewState.getCalendarDialogStartDate();
                    int iIntValue = ((Number) c23471qM13030b.f92947w).intValue();
                    int iIntValue2 = ((Number) c23471qM13030b.f92948x).intValue();
                    int iIntValue3 = ((Number) c23471qM13030b.f92949y).intValue();
                    int i35 = AbstractC34507b.f145070a;
                    zM87157i = c28655q.m87157i(calendar) | c28655q.m87157i(simpleDateFormat);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new C11689e(calendar, simpleDateFormat, interfaceC28601c1, 0);
                        c28655q.m87172p0(objM87133R2);
                    }
                    DatePickerDialog datePickerDialog = new DatePickerDialog(context, i35, (DatePickerDialog.OnDateSetListener) objM87133R2, iIntValue, iIntValue2, iIntValue3);
                    DatePicker datePicker = datePickerDialog.getDatePicker();
                    datePicker.setMinDate(simpleDateFormat.parse(viewState.getMinDate()).getTime());
                    datePicker.setMaxDate(simpleDateFormat.parse(viewState.getMaxDate()).getTime());
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    C2307m c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    boolean z34 = z26;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    boolean z35 = z27;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Modifier modifierM44010T = AbstractC15673b0.m44010T(AbstractC1102d.m3407d(1.0f, c2314t));
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44010T);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C2307m c2307m2 = C2299e.f9115x;
                    C1100b c1100b = C1100b.f4583a;
                    Modifier modifierMo3400a = c1100b.mo3400a(modifierM3409f, c2307m2);
                    String strM31182D = m31182D(interfaceC28601c1);
                    int i36 = TextResource.$stable << 3;
                    int i37 = i18 >> 9;
                    m31201o(modifierMo3400a, viewState, onPregnancyOnboardingDueDateExit, datePickerDialog, strM31182D, c28655q, ((i18 >> 6) & 112) | i36 | (i37 & 896));
                    Modifier modifierMo3400a2 = c1100b.mo3400a(AbstractC1099a.m3394p(4 * 8, c2314t), C2299e.f9105H);
                    TextResource textResourceM13029a = viewState.getButtonText();
                    if ((i18 & 57344) == 16384) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z28 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C3590i(onSavedClicked, interfaceC28601c1, 7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m31206t(modifierMo3400a2, textResourceM13029a, (InterfaceC4339a) objM87133R3, c28655q, i36);
                    c28655q.m87173q(true);
                    m31209w(z29, z34, z35, onErrorRetry, onErrorForceExit, onDueDateRetry, c28655q, (i18 & 1022) | (i37 & 7168) | (57344 & i37) | (458752 & i37));
                    c28655q.m87173q(true);
                    z19 = z34;
                    z24 = z35;
                    z15 = z29;
                } else {
                    c28655q.m87138X();
                    z19 = z16;
                    z24 = z17;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11691g(z15, z19, z24, viewState, onSavedClicked, onPregnancyOnboardingDueDateExit, onErrorRetry, onErrorForceExit, onDueDateRetry, i13, i14);
                }
            }
            i15 |= 384;
            z17 = z14;
            if ((i13 & 3072) == 0) {
                if ((i13 & 4096) == 0) {
                    zM87157i2 = c28655q.m87153g(viewState);
                } else {
                    zM87157i2 = c28655q.m87157i(viewState);
                }
                if (zM87157i2) {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i28;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onSavedClicked)) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i27;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(onPregnancyOnboardingDueDateExit)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(onErrorRetry)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(onErrorForceExit)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i15 |= i24;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87157i(onDueDateRetry)) {
                    i19 = 67108864;
                } else {
                    i19 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i19;
            }
            i18 = i15;
            if ((38347923 & i18) != 38347922) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i18 & 1, z18)) {
                if (i29 != 0) {
                    z25 = false;
                } else {
                    z25 = z15;
                }
                if (i34 != 0) {
                    z26 = false;
                } else {
                    z26 = z16;
                }
                boolean z210 = z25;
                if (i16 != 0) {
                    z27 = false;
                } else {
                    z27 = z17;
                }
                Context context2 = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                calendar = Calendar.getInstance();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(viewState.getMaxDate());
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                C23471q c23471qM13030b2 = viewState.getCalendarDialogStartDate();
                int iIntValue4 = ((Number) c23471qM13030b2.f92947w).intValue();
                int iIntValue5 = ((Number) c23471qM13030b2.f92948x).intValue();
                int iIntValue6 = ((Number) c23471qM13030b2.f92949y).intValue();
                int i38 = AbstractC34507b.f145070a;
                zM87157i = c28655q.m87157i(calendar) | c28655q.m87157i(simpleDateFormat);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C11689e(calendar, simpleDateFormat, interfaceC28601c1, 0);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C11689e(calendar, simpleDateFormat, interfaceC28601c1, 0);
                    c28655q.m87172p0(objM87133R2);
                }
                DatePickerDialog datePickerDialog2 = new DatePickerDialog(context2, i38, (DatePickerDialog.OnDateSetListener) objM87133R2, iIntValue4, iIntValue5, iIntValue6);
                DatePicker datePicker2 = datePickerDialog2.getDatePicker();
                datePicker2.setMinDate(simpleDateFormat.parse(viewState.getMinDate()).getTime());
                datePicker2.setMaxDate(simpleDateFormat.parse(viewState.getMaxDate()).getTime());
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t2);
                C2307m c2307m3 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m3, false);
                boolean z36 = z26;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d3);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                boolean z37 = z27;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                Modifier modifierM44010T2 = AbstractC15673b0.m44010T(AbstractC1102d.m3407d(1.0f, c2314t2));
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM44010T2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C2307m c2307m4 = C2299e.f9115x;
                C1100b c1100b2 = C1100b.f4583a;
                Modifier modifierMo3400a3 = c1100b2.mo3400a(modifierM3409f2, c2307m4);
                String strM31182D2 = m31182D(interfaceC28601c1);
                int i39 = TextResource.$stable << 3;
                int i310 = i18 >> 9;
                m31201o(modifierMo3400a3, viewState, onPregnancyOnboardingDueDateExit, datePickerDialog2, strM31182D2, c28655q, ((i18 >> 6) & 112) | i39 | (i310 & 896));
                Modifier modifierMo3400a4 = c1100b2.mo3400a(AbstractC1099a.m3394p(4 * 8, c2314t2), C2299e.f9105H);
                TextResource textResourceM13029a2 = viewState.getButtonText();
                if ((i18 & 57344) == 16384) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z28) {
                    objM87133R3 = new C3590i(onSavedClicked, interfaceC28601c1, 7);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3590i(onSavedClicked, interfaceC28601c1, 7);
                    c28655q.m87172p0(objM87133R3);
                }
                m31206t(modifierMo3400a4, textResourceM13029a2, (InterfaceC4339a) objM87133R3, c28655q, i39);
                c28655q.m87173q(true);
                m31209w(z210, z36, z37, onErrorRetry, onErrorForceExit, onDueDateRetry, c28655q, (i18 & 1022) | (i310 & 7168) | (57344 & i310) | (458752 & i310));
                c28655q.m87173q(true);
                z19 = z36;
                z24 = z37;
                z15 = z210;
            } else {
                c28655q.m87138X();
                z19 = z16;
                z24 = z17;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11691g(z15, z19, z24, viewState, onSavedClicked, onPregnancyOnboardingDueDateExit, onErrorRetry, onErrorForceExit, onDueDateRetry, i13, i14);
            }
        }
        i15 |= 48;
        z16 = z13;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z17 = z14;
                if (c28655q.m87155h(z17)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if ((i13 & 4096) == 0) {
                    zM87157i2 = c28655q.m87153g(viewState);
                } else {
                    zM87157i2 = c28655q.m87157i(viewState);
                }
                if (zM87157i2) {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i28;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onSavedClicked)) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i27;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(onPregnancyOnboardingDueDateExit)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(onErrorRetry)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(onErrorForceExit)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i15 |= i24;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87157i(onDueDateRetry)) {
                    i19 = 67108864;
                } else {
                    i19 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i19;
            }
            i18 = i15;
            if ((38347923 & i18) != 38347922) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i18 & 1, z18)) {
                if (i29 != 0) {
                    z25 = false;
                } else {
                    z25 = z15;
                }
                if (i34 != 0) {
                    z26 = false;
                } else {
                    z26 = z16;
                }
                boolean z211 = z25;
                if (i16 != 0) {
                    z27 = false;
                } else {
                    z27 = z17;
                }
                Context context3 = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                calendar = Calendar.getInstance();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(viewState.getMaxDate());
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                C23471q c23471qM13030b3 = viewState.getCalendarDialogStartDate();
                int iIntValue7 = ((Number) c23471qM13030b3.f92947w).intValue();
                int iIntValue8 = ((Number) c23471qM13030b3.f92948x).intValue();
                int iIntValue9 = ((Number) c23471qM13030b3.f92949y).intValue();
                int i311 = AbstractC34507b.f145070a;
                zM87157i = c28655q.m87157i(calendar) | c28655q.m87157i(simpleDateFormat);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C11689e(calendar, simpleDateFormat, interfaceC28601c1, 0);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C11689e(calendar, simpleDateFormat, interfaceC28601c1, 0);
                    c28655q.m87172p0(objM87133R2);
                }
                DatePickerDialog datePickerDialog3 = new DatePickerDialog(context3, i311, (DatePickerDialog.OnDateSetListener) objM87133R2, iIntValue7, iIntValue8, iIntValue9);
                DatePicker datePicker3 = datePickerDialog3.getDatePicker();
                datePicker3.setMinDate(simpleDateFormat.parse(viewState.getMinDate()).getTime());
                datePicker3.setMaxDate(simpleDateFormat.parse(viewState.getMaxDate()).getTime());
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t3);
                C2307m c2307m5 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m5, false);
                boolean z38 = z26;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d5);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                boolean z39 = z27;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                Modifier modifierM44010T3 = AbstractC15673b0.m44010T(AbstractC1102d.m3407d(1.0f, c2314t3));
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m5, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM44010T3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                C2307m c2307m6 = C2299e.f9115x;
                C1100b c1100b3 = C1100b.f4583a;
                Modifier modifierMo3400a5 = c1100b3.mo3400a(modifierM3409f3, c2307m6);
                String strM31182D3 = m31182D(interfaceC28601c1);
                int i312 = TextResource.$stable << 3;
                int i313 = i18 >> 9;
                m31201o(modifierMo3400a5, viewState, onPregnancyOnboardingDueDateExit, datePickerDialog3, strM31182D3, c28655q, ((i18 >> 6) & 112) | i312 | (i313 & 896));
                Modifier modifierMo3400a6 = c1100b3.mo3400a(AbstractC1099a.m3394p(4 * 8, c2314t3), C2299e.f9105H);
                TextResource textResourceM13029a3 = viewState.getButtonText();
                if ((i18 & 57344) == 16384) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z28) {
                    objM87133R3 = new C3590i(onSavedClicked, interfaceC28601c1, 7);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3590i(onSavedClicked, interfaceC28601c1, 7);
                    c28655q.m87172p0(objM87133R3);
                }
                m31206t(modifierMo3400a6, textResourceM13029a3, (InterfaceC4339a) objM87133R3, c28655q, i312);
                c28655q.m87173q(true);
                m31209w(z211, z38, z39, onErrorRetry, onErrorForceExit, onDueDateRetry, c28655q, (i18 & 1022) | (i313 & 7168) | (57344 & i313) | (458752 & i313));
                c28655q.m87173q(true);
                z19 = z38;
                z24 = z39;
                z15 = z211;
            } else {
                c28655q.m87138X();
                z19 = z16;
                z24 = z17;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11691g(z15, z19, z24, viewState, onSavedClicked, onPregnancyOnboardingDueDateExit, onErrorRetry, onErrorForceExit, onDueDateRetry, i13, i14);
            }
        }
        i15 |= 384;
        z17 = z14;
        if ((i13 & 3072) == 0) {
            if ((i13 & 4096) == 0) {
                zM87157i2 = c28655q.m87153g(viewState);
            } else {
                zM87157i2 = c28655q.m87157i(viewState);
            }
            if (zM87157i2) {
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i28;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(onSavedClicked)) {
                i27 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i27 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i27;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87157i(onPregnancyOnboardingDueDateExit)) {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i26;
        }
        if ((i13 & 1572864) == 0) {
            if (c28655q.m87157i(onErrorRetry)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i15 |= i25;
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q.m87157i(onErrorForceExit)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i15 |= i24;
        }
        if ((i13 & 100663296) == 0) {
            if (c28655q.m87157i(onDueDateRetry)) {
                i19 = 67108864;
            } else {
                i19 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 |= i19;
        }
        i18 = i15;
        if ((38347923 & i18) != 38347922) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (c28655q.m87135U(i18 & 1, z18)) {
            if (i29 != 0) {
                z25 = false;
            } else {
                z25 = z15;
            }
            if (i34 != 0) {
                z26 = false;
            } else {
                z26 = z16;
            }
            boolean z212 = z25;
            if (i16 != 0) {
                z27 = false;
            } else {
                z27 = z17;
            }
            Context context4 = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            calendar = Calendar.getInstance();
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(viewState.getMaxDate());
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C23471q c23471qM13030b4 = viewState.getCalendarDialogStartDate();
            int iIntValue10 = ((Number) c23471qM13030b4.f92947w).intValue();
            int iIntValue11 = ((Number) c23471qM13030b4.f92948x).intValue();
            int iIntValue12 = ((Number) c23471qM13030b4.f92949y).intValue();
            int i314 = AbstractC34507b.f145070a;
            zM87157i = c28655q.m87157i(calendar) | c28655q.m87157i(simpleDateFormat);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new C11689e(calendar, simpleDateFormat, interfaceC28601c1, 0);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C11689e(calendar, simpleDateFormat, interfaceC28601c1, 0);
                c28655q.m87172p0(objM87133R2);
            }
            DatePickerDialog datePickerDialog4 = new DatePickerDialog(context4, i314, (DatePickerDialog.OnDateSetListener) objM87133R2, iIntValue10, iIntValue11, iIntValue12);
            DatePicker datePicker4 = datePickerDialog4.getDatePicker();
            datePicker4.setMinDate(simpleDateFormat.parse(viewState.getMinDate()).getTime());
            datePicker4.setMaxDate(simpleDateFormat.parse(viewState.getMaxDate()).getTime());
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t4);
            C2307m c2307m7 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m7, false);
            boolean z310 = z26;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d7);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            boolean z311 = z27;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            Modifier modifierM44010T4 = AbstractC15673b0.m44010T(AbstractC1102d.m3407d(1.0f, c2314t4));
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m7, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM44010T4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t4);
            C2307m c2307m8 = C2299e.f9115x;
            C1100b c1100b4 = C1100b.f4583a;
            Modifier modifierMo3400a7 = c1100b4.mo3400a(modifierM3409f4, c2307m8);
            String strM31182D4 = m31182D(interfaceC28601c1);
            int i315 = TextResource.$stable << 3;
            int i316 = i18 >> 9;
            m31201o(modifierMo3400a7, viewState, onPregnancyOnboardingDueDateExit, datePickerDialog4, strM31182D4, c28655q, ((i18 >> 6) & 112) | i315 | (i316 & 896));
            Modifier modifierMo3400a8 = c1100b4.mo3400a(AbstractC1099a.m3394p(4 * 8, c2314t4), C2299e.f9105H);
            TextResource textResourceM13029a4 = viewState.getButtonText();
            if ((i18 & 57344) == 16384) {
                z28 = true;
            } else {
                z28 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z28) {
                objM87133R3 = new C3590i(onSavedClicked, interfaceC28601c1, 7);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C3590i(onSavedClicked, interfaceC28601c1, 7);
                c28655q.m87172p0(objM87133R3);
            }
            m31206t(modifierMo3400a8, textResourceM13029a4, (InterfaceC4339a) objM87133R3, c28655q, i315);
            c28655q.m87173q(true);
            m31209w(z212, z310, z311, onErrorRetry, onErrorForceExit, onDueDateRetry, c28655q, (i18 & 1022) | (i316 & 7168) | (57344 & i316) | (458752 & i316));
            c28655q.m87173q(true);
            z19 = z310;
            z24 = z311;
            z15 = z212;
        } else {
            c28655q.m87138X();
            z19 = z16;
            z24 = z17;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11691g(z15, z19, z24, viewState, onSavedClicked, onPregnancyOnboardingDueDateExit, onErrorRetry, onErrorForceExit, onDueDateRetry, i13, i14);
        }
    }

    /* JADX INFO: renamed from: D */
    private static final String m31182D(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: E */
    private static final void m31183E(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m31184F(Calendar calendar, SimpleDateFormat simpleDateFormat, InterfaceC28601c1 interfaceC28601c1, DatePicker datePicker, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(datePicker, "<unused var>");
        calendar.set(i13, i14, i15);
        String str = simpleDateFormat.format(calendar.getTime());
        AbstractC22676k.m65747g(str);
        m31183E(interfaceC28601c1, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m31185G(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(m31182D(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m31186H(boolean z4, boolean z13, boolean z14, C4167d c4167d, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, int i13, int i14, Composer composer, int i15) {
        m31181C(z4, z13, z14, c4167d, function1, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m31201o(Modifier modifier, C4167d c4167d, InterfaceC4339a interfaceC4339a, DatePickerDialog datePickerDialog, String str, Composer composer, int i13) {
        int i14;
        int i15;
        DatePickerDialog datePickerDialog2 = datePickerDialog;
        String str2 = str;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-740213995);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c4167d) : c28655q.m87157i(c4167d) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(datePickerDialog2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(str2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
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
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            C38072d c38072d = C38072d.f163053a;
            AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21267a, null, AbstractC13673n.m38561h(c38072d), AbstractC30060g.m92103Y(c28655q, AbstractC34506a.f145067i), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            boolean z4 = (i14 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C0343e(interfaceC4339a, 27);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 2.5d) * f13, AbstractC1102d.m3409f(1.0f, c2314t));
            float f14 = 1 * f13;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            TextResource textResourceM13034f = c4167d.getTitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM13034f, c28655q, i16);
            int i17 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
            C2886a c2886aM8417O = c38072d.m121952e(c28655q, i17).getT2();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 0, i18, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4167d.getDescription(), c28655q, i16), null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, i18, 196602);
            AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
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
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC34506a.f145065g), null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getH4(), null, c28655q, 0, i18, 196602);
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i17).getWhite10(), 0L, 0L, 0L, c28655q, 0, 14);
            Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(((float) 0.5d) * 4));
            float f15 = ((float) 3.5d) * f13;
            C22976l1 c22976l2 = new C22976l1(f15, f14, f15, f14);
            datePickerDialog2 = datePickerDialog;
            boolean zM87157i = c28655q.m87157i(datePickerDialog2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                i15 = 0;
                objM87133R2 = new C11693i(datePickerDialog2, i15);
                c28655q.m87172p0(objM87133R2);
            } else {
                i15 = 0;
            }
            str2 = str;
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R2, modifierM118994r, false, null, null, null, c15077m1M43196a, c22976l2, AbstractC37817c.m121344e(1921443541, c28655q, new C11690f(str2, i15)), c28655q, 905994240, 108);
            c28655q = c28655q;
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c((Object) modifier, (Object) c4167d, (InterfaceC23459e) interfaceC4339a, (Object) datePickerDialog2, (Object) str2, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m31202p(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m31203q(DatePickerDialog datePickerDialog) {
        datePickerDialog.show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m31204r(String str, InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getN8(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m31205s(Modifier modifier, C4167d c4167d, InterfaceC4339a interfaceC4339a, DatePickerDialog datePickerDialog, String str, int i13, Composer composer, int i14) {
        m31201o(modifier, c4167d, interfaceC4339a, datePickerDialog, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m31206t(Modifier modifier, TextResource textResource, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(793651440);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
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
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable | ((i14 >> 3) & 14));
            long jM125377a = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAction();
            boolean z4 = (i14 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C0343e(interfaceC4339a, 22);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h, false, jM125377a, null, false, (InterfaceC4339a) objM87133R, c28655q, 54, 104);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(modifier, textResource, interfaceC4339a, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m31207u(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m31208v(Modifier modifier, TextResource textResource, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m31206t(modifier, textResource, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX INFO: renamed from: w */
    private static final void m31209w(final boolean z4, final boolean z13, final boolean z14, final InterfaceC4339a interfaceC4339a, final InterfaceC4339a interfaceC4339a2, final InterfaceC4339a interfaceC4339a3, Composer composer, final int i13) {
        int i14;
        C28655q c28655q;
        int i15;
        C28676v0 c28676v0;
        ?? r10;
        boolean z15;
        int i16;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(507922677);
        int i17 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87155h(z14) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a3) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q2.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            C28676v0 c28676v1 = C28635l.f115821a;
            List list = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            if (z13) {
                c28655q2.m87150e0(354940033);
                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC34506a.f145066h, list, i17, objArr7 == true ? 1 : 0), false, null, 6, null);
                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC34506a.f145069k, objArr6 == true ? 1 : 0, i17, objArr5 == true ? 1 : 0);
                TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC34506a.f145068j, objArr4 == true ? 1 : 0, i17, objArr3 == true ? 1 : 0);
                boolean z16 = (i14 & 7168) == 2048;
                Object objM87133R = c28655q2.m87133R();
                if (z16 || objM87133R == c28676v1) {
                    objM87133R = new C0343e(interfaceC4339a, 23);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC34506a.f145060b, objArr2 == true ? 1 : 0, i17, objArr == true ? 1 : 0);
                boolean z17 = (i14 & 57344) == 16384;
                Object objM87133R2 = c28655q2.m87133R();
                if (z17 || objM87133R2 == c28676v1) {
                    objM87133R2 = new C0343e(interfaceC4339a2, 24);
                    c28655q2.m87172p0(objM87133R2);
                }
                int i18 = AbstractC33208p0.b.f138467h | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                int i19 = TextResource.C8688b.f25889c;
                int i24 = i18 | (i19 << 3) | (i19 << 9) | (i19 << 21);
                z15 = false;
                i15 = i14;
                r10 = 0;
                c28676v0 = c28676v1;
                i16 = 2;
                AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, interfaceC4339a4, true, false, c8688b3, (InterfaceC4339a) objM87133R2, null, false, false, c28655q2, i24, 0, 3652);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                i15 = i14;
                c28676v0 = c28676v1;
                r10 = 0;
                z15 = false;
                c28655q = c28655q2;
                i16 = 2;
                c28655q.m87150e0(355443597);
                c28655q.m87173q(false);
            }
            if (z14) {
                c28655q.m87150e0(355491895);
                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC34506a.f145066h, r10, i16, r10), false, null, 6, null);
                TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC34506a.f145063e, r10, i16, r10);
                TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC34506a.f145062d, r10, i16, r10);
                boolean z18 = (i15 & 458752) == 131072 ? true : z15;
                Object objM87133R3 = c28655q.m87133R();
                C28676v0 c28676v2 = c28676v0;
                if (z18 || objM87133R3 == c28676v2) {
                    objM87133R3 = new C0343e(interfaceC4339a3, 25);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R3;
                TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC34506a.f145060b, r10, i16, r10);
                boolean z19 = (i15 & 57344) != 16384 ? z15 : true;
                Object objM87133R4 = c28655q.m87133R();
                if (z19 || objM87133R4 == c28676v2) {
                    objM87133R4 = new C0343e(interfaceC4339a2, 26);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R4;
                int i25 = AbstractC33208p0.b.f138467h | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                int i26 = TextResource.C8688b.f25889c;
                C28655q c28655q3 = c28655q;
                AbstractC33199m0.m105214F(bVar2, c8688b4, null, c8688b5, interfaceC4339a5, true, false, c8688b6, interfaceC4339a6, null, false, false, c28655q3, i25 | (i26 << 3) | (i26 << 9) | (i26 << 21), 0, 3652);
                c28655q = c28655q3;
                c28655q.m87173q(z15);
            } else {
                c28655q.m87150e0(356005069);
                c28655q.m87173q(z15);
            }
            if (z4) {
                c28655q.m87150e0(356041711);
                C28655q c28655q4 = c28655q;
                AbstractC33199m0.m105214F(new AbstractC33208p0.e(new TextResource.C8688b(AbstractC34506a.f145064f, r10, 2, r10), C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCalendar()), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q4, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q4;
                c28655q.m87173q(z15);
            } else {
                c28655q.m87150e0(356316557);
                c28655q.m87173q(z15);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: d42.h
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC11694j.m31180B(z4, z13, z14, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m31210x(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m31211y(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m31212z(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }
}
