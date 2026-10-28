package lw1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2541i2;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.wipeable.C6517d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.payments.domain.models.Card;
import com.whoop.profile.view.edit.C9788l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import live.hms.video.media.capturers.camera.utils.C24174a;
import live.hms.video.utils.C24405c;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27248d1;
import ny0.EnumC27250e0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p22.AbstractC28755a;
import p22.AbstractC28756b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q22.AbstractC29854d;
import q22.C29855e;
import q22.EnumC29858h;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lw1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u001ae\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014²\u0006\u000e\u0010\u0011\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00128\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llw1/j;", "viewState", "Lq22/e;", "formValidator", "", "updateCardOnPaymentOptionChange", "Lkotlin/Function2;", "Lcom/whoop/payments/domain/models/Card;", "Ll83/a0;", "onCardUpdated", "Lkotlin/Function1;", "", "onOptionUpdated", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Llw1/j;Lq22/e;ZLc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "textIndexSelected", "", "ccIcons", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24769e {
    /* JADX WARN: Code duplicated, block: B:100:0x019e  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:106:0x025c  */
    /* JADX WARN: Code duplicated, block: B:110:0x028a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0292  */
    /* JADX WARN: Code duplicated, block: B:114:0x029d  */
    /* JADX WARN: Code duplicated, block: B:115:0x029f  */
    /* JADX WARN: Code duplicated, block: B:118:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:126:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:133:0x030b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0339  */
    /* JADX WARN: Code duplicated, block: B:136:0x033d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0350  */
    /* JADX WARN: Code duplicated, block: B:141:0x035e  */
    /* JADX WARN: Code duplicated, block: B:144:0x039d  */
    /* JADX WARN: Code duplicated, block: B:145:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:150:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d8 A[LOOP:1: B:152:0x03d2->B:154:0x03d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x040d  */
    /* JADX WARN: Code duplicated, block: B:160:0x041f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0434  */
    /* JADX WARN: Code duplicated, block: B:164:0x0436  */
    /* JADX WARN: Code duplicated, block: B:167:0x043d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x0443  */
    /* JADX WARN: Code duplicated, block: B:172:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:174:0x0503  */
    /* JADX WARN: Code duplicated, block: B:175:0x051e  */
    /* JADX WARN: Code duplicated, block: B:177:0x052f  */
    /* JADX WARN: Code duplicated, block: B:180:0x053d  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:86:0x0105  */
    /* JADX WARN: Code duplicated, block: B:90:0x0117  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:96:0x0187  */
    /* JADX WARN: Code duplicated, block: B:97:0x018b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r27v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r27v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r27v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v7, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r8v8, types: [p1.q] */
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
    /* JADX INFO: renamed from: h */
    public static final void m72542h(Modifier modifier, C24774j viewState, C29855e formValidator, boolean z4, InterfaceC4351m interfaceC4351m, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        int i16;
        InterfaceC4351m interfaceC4351m2;
        int i17;
        int i18;
        int i19;
        Function1 function2;
        int i24;
        int i25;
        boolean z13;
        boolean z14;
        Function1 function3;
        Modifier modifier3;
        InterfaceC4351m interfaceC4351m3;
        ?? r10;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        boolean z15;
        C28676v0 c28676v0;
        InterfaceC4351m interfaceC4351m4;
        Object objM87133R;
        Object objM95646v;
        InterfaceC28593a1 interfaceC28593a1;
        Object objM87133R2;
        Object obj;
        InterfaceC28601c1 interfaceC28601c1;
        C28676v0 c28676v1;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function4;
        C2314t c2314t2;
        InterfaceC4351m interfaceC4351m5;
        InterfaceC28593a1 interfaceC28593a2;
        ?? r14;
        int i26;
        C28655q c28655q;
        ?? r15;
        ?? r16;
        C28676v0 c28676v2;
        Function1 function5;
        InterfaceC4351m interfaceC4351m6;
        ?? r17;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        float f13;
        int iHashCode3;
        Iterator it;
        ?? r18;
        Object objM87133R3;
        Object obj2;
        Object objM87133R4;
        Object obj3;
        ?? r19;
        InterfaceC4351m interfaceC4351m7;
        Object obj4;
        int i27;
        ?? r24;
        ?? r110;
        int i28;
        Object objM87133R5;
        C28676v0 c28676v3;
        InterfaceC28593a1 interfaceC28593a3;
        Object objM87133R6;
        Object obj5;
        Object objM87133R7;
        Object obj6;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(formValidator, "formValidator");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1019156169);
        int i29 = i14 & 1;
        if (i29 != 0) {
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
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q2.m87153g(formValidator) : c28655q2.m87157i(formValidator) ? 256 : 128;
        }
        int i34 = i14 & 8;
        if (i34 == 0) {
            if ((i13 & 3072) == 0) {
                i15 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4351m2 = interfaceC4351m;
                    if (c28655q2.m87157i(interfaceC4351m2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                i19 = i15;
                if (i18 != 0) {
                    function2 = function1;
                    i24 = i19 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else {
                    function2 = function1;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(function2)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i24 = i19 | i25;
                    } else {
                        i24 = i19;
                    }
                }
                if ((i24 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q2.m87135U(i24 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i34 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            obj6 = objM87133R7;
                            C24405c c24405c = new C24405c(27);
                            c28655q2.m87172p0(c24405c);
                            obj6 = c24405c;
                        }
                        obj6 = objM87133R7;
                        interfaceC4351m4 = (InterfaceC4351m) obj6;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            obj5 = objM87133R6;
                            C24174a c24174a = new C24174a(23);
                            c28655q2.m87172p0(c24174a);
                            obj5 = c24174a;
                        }
                        obj5 = objM87133R6;
                        function2 = (Function1) obj5;
                    }
                    objM87133R = c28655q2.m87133R();
                    objM95646v = objM87133R;
                    if (objM87133R == c28676v0) {
                        objM95646v = AbstractC31061c.m95646v(viewState.getOptionSelected(), c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM95646v;
                    objM87133R2 = c28655q2.m87133R();
                    obj = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(AbstractC37056f.m118959K(Integer.valueOf(AbstractC28755a.f116467b), Integer.valueOf(AbstractC28755a.f116470e), Integer.valueOf(AbstractC28755a.f116471f), Integer.valueOf(AbstractC28755a.f116469d), Integer.valueOf(AbstractC28755a.f116468c)));
                        c28655q2.m87172p0(c28633k1M87272z);
                        obj = c28633k1M87272z;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj;
                    Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier4);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    c28676v1 = c28676v0;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    if (AbstractC8693b.m21270d(viewState.getTitle())) {
                        c28655q2.m87150e0(1765354327);
                        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
                        String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, TextResource.$stable);
                        C38072d c38072d = C38072d.f163053a;
                        int i35 = C38072d.f163054b;
                        C2886a c2886aM8436q = c38072d.m121952e(c28655q2, i35).getH3();
                        long jM125430y = c38072d.m121949b(c28655q2, i35).getBrandWhite();
                        int i36 = C2886a.f11498d << 18;
                        interfaceC4351m5 = interfaceC4351m4;
                        interfaceC28593a2 = interfaceC28593a1;
                        c2314t2 = c2314t;
                        r14 = 0;
                        function4 = function2;
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        AbstractC30795n.m94707h(strM21274h, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q2, 48, i36, 196600);
                        C28655q c28655q3 = c28655q2;
                        c28655q3.m87173q(false);
                        c28655q = c28655q3;
                    } else {
                        function4 = function2;
                        c2314t2 = c2314t;
                        interfaceC4351m5 = interfaceC4351m4;
                        interfaceC28593a2 = interfaceC28593a1;
                        r14 = 0;
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        c28655q2.m87150e0(1765602575);
                        c28655q2.m87173q(false);
                        c28655q = c28655q2;
                    }
                    c28655q.m87150e0(1442429434);
                    r15 = r14;
                    r16 = c28655q;
                    for (Object obj7 : viewState.m72606c()) {
                        i27 = r15 + 1;
                        if (r15 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        TextResource textResource = (TextResource) obj7;
                        EnumC27250e0 enumC27250e0 = EnumC27250e0.TEXT;
                        if (m72545k(interfaceC28593a2) == r15) {
                            r24 = 1;
                        } else {
                            r24 = r14;
                        }
                        boolean zM87149e = r16.m87149e(r15);
                        if ((i24 & 458752) == i26) {
                            r110 = 1;
                        } else {
                            r110 = r14;
                        }
                        i28 = (zM87149e ? 1 : 0) | r110;
                        objM87133R5 = r16.m87133R();
                        if (i28 == 0) {
                            c28676v3 = c28676v1;
                            if (objM87133R5 == c28676v3) {
                                interfaceC28593a3 = interfaceC28593a2;
                            }
                            ?? r27 = r16;
                            c28676v1 = c28676v3;
                            interfaceC28593a2 = interfaceC28593a3;
                            AbstractC27248d1.m82113e(null, textResource, enumC27250e0, 0L, r24, false, null, null, (Function1) objM87133R5, r27, (TextResource.$stable << 3) | 384, 233);
                            r16 = r27;
                            r15 = i27;
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            c28676v3 = c28676v1;
                        }
                        interfaceC28593a3 = interfaceC28593a2;
                        objM87133R5 = new C6517d((int) r15, function4, interfaceC28593a3, 5);
                        r16.m87172p0(objM87133R5);
                        ?? r28 = r16;
                        c28676v1 = c28676v3;
                        interfaceC28593a2 = interfaceC28593a3;
                        AbstractC27248d1.m82113e(null, textResource, enumC27250e0, 0L, r24, false, null, null, (Function1) objM87133R5, r28, (TextResource.$stable << 3) | 384, 233);
                        r16 = r28;
                        r15 = i27;
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    c28676v2 = c28676v1;
                    r16.m87173q(r14);
                    r16.m87173q(true);
                    if (m72545k(interfaceC28593a2) == AbstractC37056f.m118951C(viewState.m72606c())) {
                        r16.m87150e0(559257823);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, r16, r14);
                        iHashCode2 = Long.hashCode(r16.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = r16.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(r16, modifierM3409f);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        r16.m87158i0();
                        if (r16.f115903S) {
                            r16.m87163l(c0213j2);
                        } else {
                            r16.m87178s0();
                        }
                        C0209i c0209i3 = C0217k.f729g;
                        AbstractC28683x.m87239G(r16, c0209i3, c23010xM66775a2);
                        C0209i c0209i4 = C0217k.f728f;
                        AbstractC28683x.m87239G(r16, c0209i4, interfaceC28653p1M87165m2);
                        c0209i2 = C0217k.f732j;
                        if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                        }
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(r16, c0209i5, modifierM118962N2);
                        f13 = 8;
                        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 4 * f13, 1);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(1 * f13, C2299e.f9111N), C2299e.f9107J, r16, 6);
                        iHashCode3 = Long.hashCode(r16.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = r16.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(r16, modifierM3396r);
                        r16.m87158i0();
                        if (r16.f115903S) {
                            r16.m87163l(c0213j2);
                        } else {
                            r16.m87178s0();
                        }
                        AbstractC28683x.m87239G(r16, c0209i3, c22994r1M66759a);
                        AbstractC28683x.m87239G(r16, c0209i4, interfaceC28653p1M87165m3);
                        if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, r16, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(r16, c0209i5, modifierM118962N3);
                        r16.m87150e0(969809183);
                        it = m72547m(interfaceC28601c1).iterator();
                        r18 = r16;
                        while (it.hasNext()) {
                            ?? r29 = r18;
                            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(((Number) it.next()).intValue(), r18, r14), null, null, C17919x.f69637n, r29, 3120, 4);
                            r18 = r29;
                            f13 = f13;
                        }
                        float f14 = f13;
                        r18.m87173q(r14);
                        r18.m87173q(true);
                        Card cardM72604a = viewState.getCard();
                        objM87133R3 = r18.m87133R();
                        obj2 = objM87133R3;
                        if (objM87133R3 == c28676v2) {
                            C24405c c24405c2 = new C24405c(28);
                            r18.m87172p0(c24405c2);
                            obj2 = c24405c2;
                        }
                        InterfaceC4351m interfaceC4351m8 = (InterfaceC4351m) obj2;
                        objM87133R4 = r18.m87133R();
                        obj3 = objM87133R4;
                        if (objM87133R4 == c28676v2) {
                            C24174a c24174a2 = new C24174a(24);
                            r18.m87172p0(c24174a2);
                            obj3 = c24174a2;
                        }
                        Function1 function6 = (Function1) obj3;
                        if ((i24 & 57344) == 16384) {
                            r19 = 1;
                        } else {
                            r19 = r14;
                        }
                        Object objM87133R8 = r18.m87133R();
                        if (r19 == 0 || objM87133R8 == c28676v2) {
                            interfaceC4351m7 = interfaceC4351m5;
                            C9788l c9788l = new C9788l(5, interfaceC4351m7);
                            r18.m87172p0(c9788l);
                            obj4 = c9788l;
                        } else {
                            interfaceC4351m7 = interfaceC4351m5;
                            obj4 = objM87133R8;
                        }
                        function5 = function4;
                        AbstractC29854d.m91467r(formValidator, cardM72604a, interfaceC4351m8, function6, (InterfaceC4351m) obj4, r18, (Card.$stable << 3) | C29855e.f122028d | 3456 | ((i24 >> 6) & 14), 0);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t2, 0.0f, 2 * f14, 0.0f, 0.0f, 13));
                        String strM21273g = AbstractC8693b.m21273g(AbstractC28756b.f116488p, r18, r14);
                        ?? r25 = C38072d.f163053a;
                        int i37 = C38072d.f163054b;
                        ?? r210 = r18;
                        interfaceC4351m6 = interfaceC4351m7;
                        AbstractC30795n.m94707h(strM21273g, modifierM3409f2, r25.m121949b(r18, i37).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(r25.m121952e(r18, i37).getB3(), C23285v0.m67364b(r25.m121952e(r18, i37).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), null, 2, null), null, r210, 48, C2886a.f11498d << 18, 196600);
                        ?? r26 = r210;
                        r26.m87173q(true);
                        r26.m87173q(r14);
                        r17 = r26;
                    } else {
                        function5 = function4;
                        interfaceC4351m6 = interfaceC4351m5;
                        if (z15) {
                            r16.m87150e0(560741390);
                            r16.m87173q(r14);
                            interfaceC4351m6.invoke(Boolean.TRUE, new Card((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null));
                            r17 = r16;
                        } else {
                            r16.m87150e0(560794958);
                            r16.m87173q(r14);
                            r17 = r16;
                        }
                    }
                    interfaceC4351m3 = interfaceC4351m6;
                    z14 = z15;
                    modifier3 = modifier4;
                    function3 = function5;
                    r10 = r17;
                } else {
                    c28655q2.m87138X();
                    z14 = z4;
                    function3 = function2;
                    modifier3 = modifier2;
                    interfaceC4351m3 = interfaceC4351m2;
                    r10 = c28655q2;
                }
                c28677v1M87180u = r10.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(modifier3, viewState, formValidator, z14, interfaceC4351m3, function3, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4351m2 = interfaceC4351m;
            i18 = i14 & 32;
            i19 = i15;
            if (i18 != 0) {
                function2 = function1;
                i24 = i19 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else {
                function2 = function1;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i24 = i19 | i25;
                } else {
                    i24 = i19;
                }
            }
            if ((i24 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i34 != 0) {
                    z15 = true;
                } else {
                    z15 = z4;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        obj6 = objM87133R7;
                        C24405c c24405c3 = new C24405c(27);
                        c28655q2.m87172p0(c24405c3);
                        obj6 = c24405c3;
                    }
                    obj6 = objM87133R7;
                    interfaceC4351m4 = (InterfaceC4351m) obj6;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        obj5 = objM87133R6;
                        C24174a c24174a3 = new C24174a(23);
                        c28655q2.m87172p0(c24174a3);
                        obj5 = c24174a3;
                    }
                    obj5 = objM87133R6;
                    function2 = (Function1) obj5;
                }
                objM87133R = c28655q2.m87133R();
                objM95646v = objM87133R;
                if (objM87133R == c28676v0) {
                    objM95646v = AbstractC31061c.m95646v(viewState.getOptionSelected(), c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM95646v;
                objM87133R2 = c28655q2.m87133R();
                obj = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    C28633k1 c28633k1M87272z2 = AbstractC28683x.m87272z(AbstractC37056f.m118959K(Integer.valueOf(AbstractC28755a.f116467b), Integer.valueOf(AbstractC28755a.f116470e), Integer.valueOf(AbstractC28755a.f116471f), Integer.valueOf(AbstractC28755a.f116469d), Integer.valueOf(AbstractC28755a.f116468c)));
                    c28655q2.m87172p0(c28633k1M87272z2);
                    obj = c28633k1M87272z2;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj;
                Modifier modifierMo3471e2 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier4);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                c28676v1 = c28676v0;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                if (AbstractC8693b.m21270d(viewState.getTitle())) {
                    c28655q2.m87150e0(1765354327);
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
                    String strM21274h2 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, TextResource.$stable);
                    C38072d c38072d2 = C38072d.f163053a;
                    int i38 = C38072d.f163054b;
                    C2886a c2886aM8436q2 = c38072d2.m121952e(c28655q2, i38).getH3();
                    long jM125430y2 = c38072d2.m121949b(c28655q2, i38).getBrandWhite();
                    int i39 = C2886a.f11498d << 18;
                    interfaceC4351m5 = interfaceC4351m4;
                    interfaceC28593a2 = interfaceC28593a1;
                    c2314t2 = c2314t;
                    r14 = 0;
                    function4 = function2;
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    AbstractC30795n.m94707h(strM21274h2, modifierM3398t2, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q2, null, c28655q2, 48, i39, 196600);
                    C28655q c28655q4 = c28655q2;
                    c28655q4.m87173q(false);
                    c28655q = c28655q4;
                } else {
                    function4 = function2;
                    c2314t2 = c2314t;
                    interfaceC4351m5 = interfaceC4351m4;
                    interfaceC28593a2 = interfaceC28593a1;
                    r14 = 0;
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    c28655q2.m87150e0(1765602575);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                }
                c28655q.m87150e0(1442429434);
                r15 = r14;
                r16 = c28655q;
                while (r18.hasNext()) {
                    i27 = r15 + 1;
                    if (r15 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    TextResource textResource2 = (TextResource) obj7;
                    EnumC27250e0 enumC27250e1 = EnumC27250e0.TEXT;
                    if (m72545k(interfaceC28593a2) == r15) {
                        r24 = 1;
                    } else {
                        r24 = r14;
                    }
                    boolean zM87149e2 = r16.m87149e(r15);
                    if ((i24 & 458752) == i26) {
                        r110 = 1;
                    } else {
                        r110 = r14;
                    }
                    i28 = (zM87149e2 ? 1 : 0) | r110;
                    objM87133R5 = r16.m87133R();
                    if (i28 == 0) {
                        c28676v3 = c28676v1;
                        if (objM87133R5 == c28676v3) {
                            interfaceC28593a3 = interfaceC28593a2;
                        }
                        ?? r211 = r16;
                        c28676v1 = c28676v3;
                        interfaceC28593a2 = interfaceC28593a3;
                        AbstractC27248d1.m82113e(null, textResource2, enumC27250e1, 0L, r24, false, null, null, (Function1) objM87133R5, r211, (TextResource.$stable << 3) | 384, 233);
                        r16 = r211;
                        r15 = i27;
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        c28676v3 = c28676v1;
                    }
                    interfaceC28593a3 = interfaceC28593a2;
                    objM87133R5 = new C6517d((int) r15, function4, interfaceC28593a3, 5);
                    r16.m87172p0(objM87133R5);
                    ?? r212 = r16;
                    c28676v1 = c28676v3;
                    interfaceC28593a2 = interfaceC28593a3;
                    AbstractC27248d1.m82113e(null, textResource2, enumC27250e1, 0L, r24, false, null, null, (Function1) objM87133R5, r212, (TextResource.$stable << 3) | 384, 233);
                    r16 = r212;
                    r15 = i27;
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                c28676v2 = c28676v1;
                r16.m87173q(r14);
                r16.m87173q(true);
                if (m72545k(interfaceC28593a2) == AbstractC37056f.m118951C(viewState.m72606c())) {
                    r16.m87150e0(559257823);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, r16, r14);
                    iHashCode2 = Long.hashCode(r16.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = r16.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(r16, modifierM3409f3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    r16.m87158i0();
                    if (r16.f115903S) {
                        r16.m87163l(c0213j2);
                    } else {
                        r16.m87178s0();
                    }
                    C0209i c0209i6 = C0217k.f729g;
                    AbstractC28683x.m87239G(r16, c0209i6, c23010xM66775a4);
                    C0209i c0209i7 = C0217k.f728f;
                    AbstractC28683x.m87239G(r16, c0209i7, interfaceC28653p1M87165m5);
                    c0209i2 = C0217k.f732j;
                    if (r16.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(r16, c0209i8, modifierM118962N5);
                    f13 = 8;
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 4 * f13, 1);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(1 * f13, C2299e.f9111N), C2299e.f9107J, r16, 6);
                    iHashCode3 = Long.hashCode(r16.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = r16.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(r16, modifierM3396r2);
                    r16.m87158i0();
                    if (r16.f115903S) {
                        r16.m87163l(c0213j2);
                    } else {
                        r16.m87178s0();
                    }
                    AbstractC28683x.m87239G(r16, c0209i6, c22994r1M66759a2);
                    AbstractC28683x.m87239G(r16, c0209i7, interfaceC28653p1M87165m6);
                    if (r16.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, r16, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, r16, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(r16, c0209i8, modifierM118962N6);
                    r16.m87150e0(969809183);
                    it = m72547m(interfaceC28601c1).iterator();
                    r18 = r16;
                    while (it.hasNext()) {
                        ?? r213 = r18;
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(((Number) it.next()).intValue(), r18, r14), null, null, C17919x.f69637n, r213, 3120, 4);
                        r18 = r213;
                        f13 = f13;
                    }
                    float f15 = f13;
                    r18.m87173q(r14);
                    r18.m87173q(true);
                    Card cardM72604a2 = viewState.getCard();
                    objM87133R3 = r18.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v2) {
                        C24405c c24405c4 = new C24405c(28);
                        r18.m87172p0(c24405c4);
                        obj2 = c24405c4;
                    }
                    InterfaceC4351m interfaceC4351m9 = (InterfaceC4351m) obj2;
                    objM87133R4 = r18.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v2) {
                        C24174a c24174a4 = new C24174a(24);
                        r18.m87172p0(c24174a4);
                        obj3 = c24174a4;
                    }
                    Function1 function7 = (Function1) obj3;
                    if ((i24 & 57344) == 16384) {
                        r19 = 1;
                    } else {
                        r19 = r14;
                    }
                    Object objM87133R9 = r18.m87133R();
                    if (r19 == 0) {
                        interfaceC4351m7 = interfaceC4351m5;
                        C9788l c9788l2 = new C9788l(5, interfaceC4351m7);
                        r18.m87172p0(c9788l2);
                        obj4 = c9788l2;
                    } else {
                        interfaceC4351m7 = interfaceC4351m5;
                        C9788l c9788l3 = new C9788l(5, interfaceC4351m7);
                        r18.m87172p0(c9788l3);
                        obj4 = c9788l3;
                    }
                    function5 = function4;
                    AbstractC29854d.m91467r(formValidator, cardM72604a2, interfaceC4351m9, function7, (InterfaceC4351m) obj4, r18, (Card.$stable << 3) | C29855e.f122028d | 3456 | ((i24 >> 6) & 14), 0);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t2, 0.0f, 2 * f15, 0.0f, 0.0f, 13));
                    String strM21273g2 = AbstractC8693b.m21273g(AbstractC28756b.f116488p, r18, r14);
                    ?? r214 = C38072d.f163053a;
                    int i310 = C38072d.f163054b;
                    ?? r215 = r18;
                    interfaceC4351m6 = interfaceC4351m7;
                    AbstractC30795n.m94707h(strM21273g2, modifierM3409f4, r214.m121949b(r18, i310).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(r214.m121952e(r18, i310).getB3(), C23285v0.m67364b(r214.m121952e(r18, i310).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), null, 2, null), null, r215, 48, C2886a.f11498d << 18, 196600);
                    ?? r216 = r215;
                    r216.m87173q(true);
                    r216.m87173q(r14);
                    r17 = r216;
                } else {
                    function5 = function4;
                    interfaceC4351m6 = interfaceC4351m5;
                    if (z15) {
                        r16.m87150e0(560741390);
                        r16.m87173q(r14);
                        interfaceC4351m6.invoke(Boolean.TRUE, new Card((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null));
                        r17 = r16;
                    } else {
                        r16.m87150e0(560794958);
                        r16.m87173q(r14);
                        r17 = r16;
                    }
                }
                interfaceC4351m3 = interfaceC4351m6;
                z14 = z15;
                modifier3 = modifier4;
                function3 = function5;
                r10 = r17;
            } else {
                c28655q2.m87138X();
                z14 = z4;
                function3 = function2;
                modifier3 = modifier2;
                interfaceC4351m3 = interfaceC4351m2;
                r10 = c28655q2;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(modifier3, viewState, formValidator, z14, interfaceC4351m3, function3, i13, i14);
            }
        }
        i15 |= 3072;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                if (c28655q2.m87157i(interfaceC4351m2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            i19 = i15;
            if (i18 != 0) {
                function2 = function1;
                i24 = i19 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else {
                function2 = function1;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i24 = i19 | i25;
                } else {
                    i24 = i19;
                }
            }
            if ((i24 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i34 != 0) {
                    z15 = true;
                } else {
                    z15 = z4;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        obj6 = objM87133R7;
                        C24405c c24405c5 = new C24405c(27);
                        c28655q2.m87172p0(c24405c5);
                        obj6 = c24405c5;
                    }
                    obj6 = objM87133R7;
                    interfaceC4351m4 = (InterfaceC4351m) obj6;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        obj5 = objM87133R6;
                        C24174a c24174a5 = new C24174a(23);
                        c28655q2.m87172p0(c24174a5);
                        obj5 = c24174a5;
                    }
                    obj5 = objM87133R6;
                    function2 = (Function1) obj5;
                }
                objM87133R = c28655q2.m87133R();
                objM95646v = objM87133R;
                if (objM87133R == c28676v0) {
                    objM95646v = AbstractC31061c.m95646v(viewState.getOptionSelected(), c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM95646v;
                objM87133R2 = c28655q2.m87133R();
                obj = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    C28633k1 c28633k1M87272z3 = AbstractC28683x.m87272z(AbstractC37056f.m118959K(Integer.valueOf(AbstractC28755a.f116467b), Integer.valueOf(AbstractC28755a.f116470e), Integer.valueOf(AbstractC28755a.f116471f), Integer.valueOf(AbstractC28755a.f116469d), Integer.valueOf(AbstractC28755a.f116468c)));
                    c28655q2.m87172p0(c28633k1M87272z3);
                    obj = c28633k1M87272z3;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj;
                Modifier modifierMo3471e3 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier4);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                c28676v1 = c28676v0;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                if (AbstractC8693b.m21270d(viewState.getTitle())) {
                    c28655q2.m87150e0(1765354327);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
                    String strM21274h3 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, TextResource.$stable);
                    C38072d c38072d3 = C38072d.f163053a;
                    int i311 = C38072d.f163054b;
                    C2886a c2886aM8436q3 = c38072d3.m121952e(c28655q2, i311).getH3();
                    long jM125430y3 = c38072d3.m121949b(c28655q2, i311).getBrandWhite();
                    int i312 = C2886a.f11498d << 18;
                    interfaceC4351m5 = interfaceC4351m4;
                    interfaceC28593a2 = interfaceC28593a1;
                    c2314t2 = c2314t;
                    r14 = 0;
                    function4 = function2;
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    AbstractC30795n.m94707h(strM21274h3, modifierM3398t3, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q3, null, c28655q2, 48, i312, 196600);
                    C28655q c28655q5 = c28655q2;
                    c28655q5.m87173q(false);
                    c28655q = c28655q5;
                } else {
                    function4 = function2;
                    c2314t2 = c2314t;
                    interfaceC4351m5 = interfaceC4351m4;
                    interfaceC28593a2 = interfaceC28593a1;
                    r14 = 0;
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    c28655q2.m87150e0(1765602575);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                }
                c28655q.m87150e0(1442429434);
                r15 = r14;
                r16 = c28655q;
                while (r18.hasNext()) {
                    i27 = r15 + 1;
                    if (r15 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    TextResource textResource3 = (TextResource) obj7;
                    EnumC27250e0 enumC27250e2 = EnumC27250e0.TEXT;
                    if (m72545k(interfaceC28593a2) == r15) {
                        r24 = 1;
                    } else {
                        r24 = r14;
                    }
                    boolean zM87149e3 = r16.m87149e(r15);
                    if ((i24 & 458752) == i26) {
                        r110 = 1;
                    } else {
                        r110 = r14;
                    }
                    i28 = (zM87149e3 ? 1 : 0) | r110;
                    objM87133R5 = r16.m87133R();
                    if (i28 == 0) {
                        c28676v3 = c28676v1;
                        if (objM87133R5 == c28676v3) {
                            interfaceC28593a3 = interfaceC28593a2;
                        }
                        ?? r217 = r16;
                        c28676v1 = c28676v3;
                        interfaceC28593a2 = interfaceC28593a3;
                        AbstractC27248d1.m82113e(null, textResource3, enumC27250e2, 0L, r24, false, null, null, (Function1) objM87133R5, r217, (TextResource.$stable << 3) | 384, 233);
                        r16 = r217;
                        r15 = i27;
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        c28676v3 = c28676v1;
                    }
                    interfaceC28593a3 = interfaceC28593a2;
                    objM87133R5 = new C6517d((int) r15, function4, interfaceC28593a3, 5);
                    r16.m87172p0(objM87133R5);
                    ?? r218 = r16;
                    c28676v1 = c28676v3;
                    interfaceC28593a2 = interfaceC28593a3;
                    AbstractC27248d1.m82113e(null, textResource3, enumC27250e2, 0L, r24, false, null, null, (Function1) objM87133R5, r218, (TextResource.$stable << 3) | 384, 233);
                    r16 = r218;
                    r15 = i27;
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                c28676v2 = c28676v1;
                r16.m87173q(r14);
                r16.m87173q(true);
                if (m72545k(interfaceC28593a2) == AbstractC37056f.m118951C(viewState.m72606c())) {
                    r16.m87150e0(559257823);
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, r16, r14);
                    iHashCode2 = Long.hashCode(r16.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = r16.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(r16, modifierM3409f5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    r16.m87158i0();
                    if (r16.f115903S) {
                        r16.m87163l(c0213j2);
                    } else {
                        r16.m87178s0();
                    }
                    C0209i c0209i9 = C0217k.f729g;
                    AbstractC28683x.m87239G(r16, c0209i9, c23010xM66775a6);
                    C0209i c0209i10 = C0217k.f728f;
                    AbstractC28683x.m87239G(r16, c0209i10, interfaceC28653p1M87165m8);
                    c0209i2 = C0217k.f732j;
                    if (r16.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                    }
                    C0209i c0209i11 = C0217k.f726d;
                    AbstractC28683x.m87239G(r16, c0209i11, modifierM118962N8);
                    f13 = 8;
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 4 * f13, 1);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(1 * f13, C2299e.f9111N), C2299e.f9107J, r16, 6);
                    iHashCode3 = Long.hashCode(r16.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = r16.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(r16, modifierM3396r3);
                    r16.m87158i0();
                    if (r16.f115903S) {
                        r16.m87163l(c0213j2);
                    } else {
                        r16.m87178s0();
                    }
                    AbstractC28683x.m87239G(r16, c0209i9, c22994r1M66759a3);
                    AbstractC28683x.m87239G(r16, c0209i10, interfaceC28653p1M87165m9);
                    if (r16.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, r16, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, r16, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(r16, c0209i11, modifierM118962N9);
                    r16.m87150e0(969809183);
                    it = m72547m(interfaceC28601c1).iterator();
                    r18 = r16;
                    while (it.hasNext()) {
                        ?? r219 = r18;
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(((Number) it.next()).intValue(), r18, r14), null, null, C17919x.f69637n, r219, 3120, 4);
                        r18 = r219;
                        f13 = f13;
                    }
                    float f16 = f13;
                    r18.m87173q(r14);
                    r18.m87173q(true);
                    Card cardM72604a3 = viewState.getCard();
                    objM87133R3 = r18.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v2) {
                        C24405c c24405c6 = new C24405c(28);
                        r18.m87172p0(c24405c6);
                        obj2 = c24405c6;
                    }
                    InterfaceC4351m interfaceC4351m10 = (InterfaceC4351m) obj2;
                    objM87133R4 = r18.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v2) {
                        C24174a c24174a6 = new C24174a(24);
                        r18.m87172p0(c24174a6);
                        obj3 = c24174a6;
                    }
                    Function1 function8 = (Function1) obj3;
                    if ((i24 & 57344) == 16384) {
                        r19 = 1;
                    } else {
                        r19 = r14;
                    }
                    Object objM87133R10 = r18.m87133R();
                    if (r19 == 0) {
                        interfaceC4351m7 = interfaceC4351m5;
                        C9788l c9788l4 = new C9788l(5, interfaceC4351m7);
                        r18.m87172p0(c9788l4);
                        obj4 = c9788l4;
                    } else {
                        interfaceC4351m7 = interfaceC4351m5;
                        C9788l c9788l5 = new C9788l(5, interfaceC4351m7);
                        r18.m87172p0(c9788l5);
                        obj4 = c9788l5;
                    }
                    function5 = function4;
                    AbstractC29854d.m91467r(formValidator, cardM72604a3, interfaceC4351m10, function8, (InterfaceC4351m) obj4, r18, (Card.$stable << 3) | C29855e.f122028d | 3456 | ((i24 >> 6) & 14), 0);
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t2, 0.0f, 2 * f16, 0.0f, 0.0f, 13));
                    String strM21273g3 = AbstractC8693b.m21273g(AbstractC28756b.f116488p, r18, r14);
                    ?? r2110 = C38072d.f163053a;
                    int i313 = C38072d.f163054b;
                    ?? r2111 = r18;
                    interfaceC4351m6 = interfaceC4351m7;
                    AbstractC30795n.m94707h(strM21273g3, modifierM3409f6, r2110.m121949b(r18, i313).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(r2110.m121952e(r18, i313).getB3(), C23285v0.m67364b(r2110.m121952e(r18, i313).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), null, 2, null), null, r2111, 48, C2886a.f11498d << 18, 196600);
                    ?? r2112 = r2111;
                    r2112.m87173q(true);
                    r2112.m87173q(r14);
                    r17 = r2112;
                } else {
                    function5 = function4;
                    interfaceC4351m6 = interfaceC4351m5;
                    if (z15) {
                        r16.m87150e0(560741390);
                        r16.m87173q(r14);
                        interfaceC4351m6.invoke(Boolean.TRUE, new Card((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null));
                        r17 = r16;
                    } else {
                        r16.m87150e0(560794958);
                        r16.m87173q(r14);
                        r17 = r16;
                    }
                }
                interfaceC4351m3 = interfaceC4351m6;
                z14 = z15;
                modifier3 = modifier4;
                function3 = function5;
                r10 = r17;
            } else {
                c28655q2.m87138X();
                z14 = z4;
                function3 = function2;
                modifier3 = modifier2;
                interfaceC4351m3 = interfaceC4351m2;
                r10 = c28655q2;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(modifier3, viewState, formValidator, z14, interfaceC4351m3, function3, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC4351m2 = interfaceC4351m;
        i18 = i14 & 32;
        i19 = i15;
        if (i18 != 0) {
            function2 = function1;
            i24 = i19 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else {
            function2 = function1;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i24 = i19 | i25;
            } else {
                i24 = i19;
            }
        }
        if ((i24 & 74899) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i24 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i34 != 0) {
                z15 = true;
            } else {
                z15 = z4;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    obj6 = objM87133R7;
                    C24405c c24405c7 = new C24405c(27);
                    c28655q2.m87172p0(c24405c7);
                    obj6 = c24405c7;
                }
                obj6 = objM87133R7;
                interfaceC4351m4 = (InterfaceC4351m) obj6;
            } else {
                interfaceC4351m4 = interfaceC4351m2;
            }
            if (i18 != 0) {
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    obj5 = objM87133R6;
                    C24174a c24174a7 = new C24174a(23);
                    c28655q2.m87172p0(c24174a7);
                    obj5 = c24174a7;
                }
                obj5 = objM87133R6;
                function2 = (Function1) obj5;
            }
            objM87133R = c28655q2.m87133R();
            objM95646v = objM87133R;
            if (objM87133R == c28676v0) {
                objM95646v = AbstractC31061c.m95646v(viewState.getOptionSelected(), c28655q2);
            }
            interfaceC28593a1 = (InterfaceC28593a1) objM95646v;
            objM87133R2 = c28655q2.m87133R();
            obj = objM87133R2;
            if (objM87133R2 == c28676v0) {
                C28633k1 c28633k1M87272z4 = AbstractC28683x.m87272z(AbstractC37056f.m118959K(Integer.valueOf(AbstractC28755a.f116467b), Integer.valueOf(AbstractC28755a.f116470e), Integer.valueOf(AbstractC28755a.f116471f), Integer.valueOf(AbstractC28755a.f116469d), Integer.valueOf(AbstractC28755a.f116468c)));
                c28655q2.m87172p0(c28633k1M87272z4);
                obj = c28633k1M87272z4;
            }
            interfaceC28601c1 = (InterfaceC28601c1) obj;
            Modifier modifierMo3471e4 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier4);
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
            c28676v1 = c28676v0;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a7);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N10);
            if (AbstractC8693b.m21270d(viewState.getTitle())) {
                c28655q2.m87150e0(1765354327);
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
                String strM21274h4 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, TextResource.$stable);
                C38072d c38072d4 = C38072d.f163053a;
                int i314 = C38072d.f163054b;
                C2886a c2886aM8436q4 = c38072d4.m121952e(c28655q2, i314).getH3();
                long jM125430y4 = c38072d4.m121949b(c28655q2, i314).getBrandWhite();
                int i315 = C2886a.f11498d << 18;
                interfaceC4351m5 = interfaceC4351m4;
                interfaceC28593a2 = interfaceC28593a1;
                c2314t2 = c2314t;
                r14 = 0;
                function4 = function2;
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                AbstractC30795n.m94707h(strM21274h4, modifierM3398t4, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q4, null, c28655q2, 48, i315, 196600);
                C28655q c28655q6 = c28655q2;
                c28655q6.m87173q(false);
                c28655q = c28655q6;
            } else {
                function4 = function2;
                c2314t2 = c2314t;
                interfaceC4351m5 = interfaceC4351m4;
                interfaceC28593a2 = interfaceC28593a1;
                r14 = 0;
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                c28655q2.m87150e0(1765602575);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            }
            c28655q.m87150e0(1442429434);
            r15 = r14;
            r16 = c28655q;
            while (r18.hasNext()) {
                i27 = r15 + 1;
                if (r15 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                TextResource textResource4 = (TextResource) obj7;
                EnumC27250e0 enumC27250e3 = EnumC27250e0.TEXT;
                if (m72545k(interfaceC28593a2) == r15) {
                    r24 = 1;
                } else {
                    r24 = r14;
                }
                boolean zM87149e4 = r16.m87149e(r15);
                if ((i24 & 458752) == i26) {
                    r110 = 1;
                } else {
                    r110 = r14;
                }
                i28 = (zM87149e4 ? 1 : 0) | r110;
                objM87133R5 = r16.m87133R();
                if (i28 == 0) {
                    c28676v3 = c28676v1;
                    if (objM87133R5 == c28676v3) {
                        interfaceC28593a3 = interfaceC28593a2;
                    }
                    ?? r2113 = r16;
                    c28676v1 = c28676v3;
                    interfaceC28593a2 = interfaceC28593a3;
                    AbstractC27248d1.m82113e(null, textResource4, enumC27250e3, 0L, r24, false, null, null, (Function1) objM87133R5, r2113, (TextResource.$stable << 3) | 384, 233);
                    r16 = r2113;
                    r15 = i27;
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    c28676v3 = c28676v1;
                }
                interfaceC28593a3 = interfaceC28593a2;
                objM87133R5 = new C6517d((int) r15, function4, interfaceC28593a3, 5);
                r16.m87172p0(objM87133R5);
                ?? r2114 = r16;
                c28676v1 = c28676v3;
                interfaceC28593a2 = interfaceC28593a3;
                AbstractC27248d1.m82113e(null, textResource4, enumC27250e3, 0L, r24, false, null, null, (Function1) objM87133R5, r2114, (TextResource.$stable << 3) | 384, 233);
                r16 = r2114;
                r15 = i27;
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            }
            c28676v2 = c28676v1;
            r16.m87173q(r14);
            r16.m87173q(true);
            if (m72545k(interfaceC28593a2) == AbstractC37056f.m118951C(viewState.m72606c())) {
                r16.m87150e0(559257823);
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, r16, r14);
                iHashCode2 = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = r16.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(r16, modifierM3409f7);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j2);
                } else {
                    r16.m87178s0();
                }
                C0209i c0209i12 = C0217k.f729g;
                AbstractC28683x.m87239G(r16, c0209i12, c23010xM66775a8);
                C0209i c0209i13 = C0217k.f728f;
                AbstractC28683x.m87239G(r16, c0209i13, interfaceC28653p1M87165m11);
                c0209i2 = C0217k.f732j;
                if (r16.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                }
                C0209i c0209i14 = C0217k.f726d;
                AbstractC28683x.m87239G(r16, c0209i14, modifierM118962N11);
                f13 = 8;
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 4 * f13, 1);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(1 * f13, C2299e.f9111N), C2299e.f9107J, r16, 6);
                iHashCode3 = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = r16.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(r16, modifierM3396r4);
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j2);
                } else {
                    r16.m87178s0();
                }
                AbstractC28683x.m87239G(r16, c0209i12, c22994r1M66759a4);
                AbstractC28683x.m87239G(r16, c0209i13, interfaceC28653p1M87165m12);
                if (r16.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r16, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r16, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(r16, c0209i14, modifierM118962N12);
                r16.m87150e0(969809183);
                it = m72547m(interfaceC28601c1).iterator();
                r18 = r16;
                while (it.hasNext()) {
                    ?? r2115 = r18;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(((Number) it.next()).intValue(), r18, r14), null, null, C17919x.f69637n, r2115, 3120, 4);
                    r18 = r2115;
                    f13 = f13;
                }
                float f17 = f13;
                r18.m87173q(r14);
                r18.m87173q(true);
                Card cardM72604a4 = viewState.getCard();
                objM87133R3 = r18.m87133R();
                obj2 = objM87133R3;
                if (objM87133R3 == c28676v2) {
                    C24405c c24405c8 = new C24405c(28);
                    r18.m87172p0(c24405c8);
                    obj2 = c24405c8;
                }
                InterfaceC4351m interfaceC4351m11 = (InterfaceC4351m) obj2;
                objM87133R4 = r18.m87133R();
                obj3 = objM87133R4;
                if (objM87133R4 == c28676v2) {
                    C24174a c24174a8 = new C24174a(24);
                    r18.m87172p0(c24174a8);
                    obj3 = c24174a8;
                }
                Function1 function9 = (Function1) obj3;
                if ((i24 & 57344) == 16384) {
                    r19 = 1;
                } else {
                    r19 = r14;
                }
                Object objM87133R11 = r18.m87133R();
                if (r19 == 0) {
                    interfaceC4351m7 = interfaceC4351m5;
                    C9788l c9788l6 = new C9788l(5, interfaceC4351m7);
                    r18.m87172p0(c9788l6);
                    obj4 = c9788l6;
                } else {
                    interfaceC4351m7 = interfaceC4351m5;
                    C9788l c9788l7 = new C9788l(5, interfaceC4351m7);
                    r18.m87172p0(c9788l7);
                    obj4 = c9788l7;
                }
                function5 = function4;
                AbstractC29854d.m91467r(formValidator, cardM72604a4, interfaceC4351m11, function9, (InterfaceC4351m) obj4, r18, (Card.$stable << 3) | C29855e.f122028d | 3456 | ((i24 >> 6) & 14), 0);
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t2, 0.0f, 2 * f17, 0.0f, 0.0f, 13));
                String strM21273g4 = AbstractC8693b.m21273g(AbstractC28756b.f116488p, r18, r14);
                ?? r2116 = C38072d.f163053a;
                int i316 = C38072d.f163054b;
                ?? r2117 = r18;
                interfaceC4351m6 = interfaceC4351m7;
                AbstractC30795n.m94707h(strM21273g4, modifierM3409f8, r2116.m121949b(r18, i316).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(r2116.m121952e(r18, i316).getB3(), C23285v0.m67364b(r2116.m121952e(r18, i316).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), null, 2, null), null, r2117, 48, C2886a.f11498d << 18, 196600);
                ?? r2118 = r2117;
                r2118.m87173q(true);
                r2118.m87173q(r14);
                r17 = r2118;
            } else {
                function5 = function4;
                interfaceC4351m6 = interfaceC4351m5;
                if (z15) {
                    r16.m87150e0(560741390);
                    r16.m87173q(r14);
                    interfaceC4351m6.invoke(Boolean.TRUE, new Card((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null));
                    r17 = r16;
                } else {
                    r16.m87150e0(560794958);
                    r16.m87173q(r14);
                    r17 = r16;
                }
            }
            interfaceC4351m3 = interfaceC4351m6;
            z14 = z15;
            modifier3 = modifier4;
            function3 = function5;
            r10 = r17;
        } else {
            c28655q2.m87138X();
            z14 = z4;
            function3 = function2;
            modifier3 = modifier2;
            interfaceC4351m3 = interfaceC4351m2;
            r10 = c28655q2;
        }
        c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(modifier3, viewState, formValidator, z14, interfaceC4351m3, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m72543i(boolean z4, Card card) {
        AbstractC22676k.m65750j(card, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m72544j(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final int m72545k(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: l */
    private static final void m72546l(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: m */
    private static final List<Integer> m72547m(InterfaceC28601c1 interfaceC28601c1) {
        return (List) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m72548n(int i13, Function1 function1, InterfaceC28593a1 interfaceC28593a1, boolean z4) {
        m72546l(interfaceC28593a1, i13);
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m72549o(EnumC29858h enumC29858h, boolean z4) {
        AbstractC22676k.m65750j(enumC29858h, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m72550p(EnumC29858h enumC29858h) {
        AbstractC22676k.m65750j(enumC29858h, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m72551q(InterfaceC4351m interfaceC4351m, boolean z4, Card newCard) {
        AbstractC22676k.m65750j(newCard, "newCard");
        interfaceC4351m.invoke(Boolean.valueOf(z4), newCard);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m72552r(Modifier modifier, C24774j c24774j, C29855e c29855e, boolean z4, InterfaceC4351m interfaceC4351m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m72542h(modifier, c24774j, c29855e, z4, interfaceC4351m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
