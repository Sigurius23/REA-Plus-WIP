package ep1;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.mapbox.common.HttpHeaders;
import com.whoop.data.local.room.dao.wipeable.C6517d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9790n;
import cp1.AbstractC11022i;
import cp1.C11016c;
import cp1.C11020g;
import cp1.C11029p;
import d30.C11546l;
import d30.C11558r;
import e11.C12582b;
import eg.C13161j;
import eo2.C13390j;
import g51.AbstractC15492b;
import g51.C15493c;
import gb1.AbstractC15673b0;
import h91.C17027b;
import i11.AbstractC17862e;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kb1.AbstractC22324d;
import kb1.C22325e;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.AbstractC25260n;
import m83.C25271y;
import m83.C25272z;
import ny0.AbstractC27265l0;
import p000.AbstractC11266d;
import p000.C22931l;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p668z1.C39967p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qy0.InterfaceC30768a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import vo1.AbstractC36229d;
import w81.AbstractC36945c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import zo1.C40925b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ep1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u0006\u000e\u0010\u0015\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcp1/g;", "viewState", "Lzr2/a;", "dateAndTimeProvider", "Lkotlin/Function1;", "Lcp1/i;", "Ll83/a0;", "onViewEvent", "m", "(Lcp1/g;Lzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", HttpHeaders.DATE, "", "monthIndex", "", "selectedDays", "Ljava/util/Locale;", "locale", "Lg51/c;", "A", "(Ljava/lang/String;ILjava/util/List;Lzr2/a;Ljava/util/Locale;)Lg51/c;", "selectedMonthIndex", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13413h {
    /* JADX INFO: renamed from: A */
    private static final C15493c m37930A(String str, int i13, List<String> list, InterfaceC41070a interfaceC41070a, Locale locale) {
        LocalDate localDateNow;
        LocalDate localDate = LocalDate.parse(str);
        org.joda.time.LocalDate localDateMo133365d = interfaceC41070a != null ? interfaceC41070a.mo133365d() : null;
        if (localDateMo133365d == null || (localDateNow = LocalDate.of(localDateMo133365d.getYear(), localDateMo133365d.getMonthOfYear(), localDateMo133365d.getDayOfMonth())) == null) {
            localDateNow = LocalDate.now();
        }
        LocalDate localDate2 = localDateNow;
        C17027b.Companion companion = C17027b.INSTANCE;
        AbstractC22676k.m65747g(localDate2);
        AbstractC22676k.m65747g(localDate);
        C17027b c17027bM48086b = C17027b.Companion.m48086b(companion, locale, localDate2, localDate, localDate2, C25272z.f99163w, false, null, 0, 224, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.put((String) it.next(), Boolean.TRUE);
        }
        return AbstractC22324d.m64148a(c17027bM48086b, i13, new C13161j(linkedHashMap, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC30768a m37931B(Map map, C22325e dateArgs) {
        AbstractC22676k.m65750j(dateArgs, "dateArgs");
        return AbstractC36229d.m115398R(dateArgs, map);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:104:0x025c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0351  */
    /* JADX WARN: Code duplicated, block: B:108:0x0355  */
    /* JADX WARN: Code duplicated, block: B:111:0x0364  */
    /* JADX WARN: Code duplicated, block: B:113:0x0372  */
    /* JADX WARN: Code duplicated, block: B:118:0x039b  */
    /* JADX WARN: Code duplicated, block: B:122:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:125:0x03af  */
    /* JADX WARN: Code duplicated, block: B:126:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:129:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:130:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:133:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:135:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:143:0x040c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0418  */
    /* JADX WARN: Code duplicated, block: B:149:0x041d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0425  */
    /* JADX WARN: Code duplicated, block: B:154:0x046f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0480  */
    /* JADX WARN: Code duplicated, block: B:158:0x0499  */
    /* JADX WARN: Code duplicated, block: B:160:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:163:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:166:0x04e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:171:0x0549  */
    /* JADX WARN: Code duplicated, block: B:172:0x054b  */
    /* JADX WARN: Code duplicated, block: B:175:0x055c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x0562  */
    /* JADX WARN: Code duplicated, block: B:181:0x0583  */
    /* JADX WARN: Code duplicated, block: B:183:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:184:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:187:0x05b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:191:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:194:0x0609  */
    /* JADX WARN: Code duplicated, block: B:195:0x060b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0612 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:199:0x0614  */
    /* JADX WARN: Code duplicated, block: B:201:0x0626  */
    /* JADX WARN: Code duplicated, block: B:204:0x0630  */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0131  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x0169  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Code duplicated, block: B:75:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x018c  */
    /* JADX WARN: Code duplicated, block: B:80:0x018f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0197 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x019d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0201  */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:97:0x0238  */
    /* JADX WARN: Code duplicated, block: B:99:0x023e  */
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: m */
    public static final void m37944m(C11020g c11020g, InterfaceC41070a interfaceC41070a, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int size;
        Object objM87133R;
        InterfaceC28593a1 interfaceC28593a1;
        Object objM87133R2;
        InterfaceC28593a1 interfaceC28593a2;
        boolean zM87153g;
        Object objM87133R3;
        List<String> listM29602h;
        C39967p c39967p;
        C2314t c2314t;
        C2305k c2305k;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC28593a1 interfaceC28593a3;
        TextResource textResourceM29604j;
        int i16;
        boolean z13;
        boolean zM87157i;
        Object objM87133R4;
        boolean z14;
        Object objM87133R5;
        int i17;
        Function1 function5;
        InterfaceC28593a1 interfaceC28593a4;
        float f13;
        int iHashCode2;
        C38072d c38072d;
        float f14;
        int iHashCode3;
        C11029p c11029p;
        TextResource textResourceM21267a;
        boolean z15;
        boolean z16;
        C11029p c11029p2;
        String strM29660a;
        C11029p c11029p3;
        String str;
        boolean zM87157i2;
        Object objM87133R6;
        C28676v0 c28676v1;
        InterfaceC28593a1 interfaceC28593a5;
        InterfaceC28593a1 interfaceC28593a6;
        C28676v0 c28676v2;
        InterfaceC28593a1 interfaceC28593a7;
        C11029p c11029p4;
        Locale locale;
        C28621h1 c28621h1;
        boolean zM87149e;
        Object objM87133R7;
        C39967p c39967p2;
        Object objM87133R8;
        boolean z17;
        boolean zM87157i3;
        Object objM87133R9;
        Function1 function6;
        int i18;
        Function1 function7;
        boolean z18;
        Object objM87133R10;
        boolean z19;
        boolean zM87157i4;
        Object objM87133R11;
        String strM29660a2;
        Object objM87133R12;
        C11020g viewState = c11020g;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1979577765);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(interfaceC41070a) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R12 = c28655q.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C13406a(7);
                        c28655q.m87172p0(objM87133R12);
                    }
                    function4 = (Function1) objM87133R12;
                } else {
                    function4 = function2;
                }
                size = viewState.m29597c().size();
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(0, c28655q);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.m29597c().size() - 1, c28655q);
                }
                interfaceC28593a2 = (InterfaceC28593a1) objM87133R2;
                zM87153g = c28655q.m87153g(viewState.m29602h());
                objM87133R3 = c28655q.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    listM29602h = viewState.m29602h();
                    if (listM29602h == null) {
                        listM29602h = C25271y.f99162w;
                    }
                    String[] strArr = (String[]) listM29602h.toArray(new String[0]);
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
                    C39967p c39967p3 = new C39967p();
                    c39967p3.addAll(AbstractC25260n.m74049W0(objArrCopyOf));
                    c28655q.m87172p0(c39967p3);
                    objM87133R3 = c39967p3;
                }
                c39967p = (C39967p) objM87133R3;
                c2314t = C2314t.f9131w;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                c2305k = C2299e.f9111N;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
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
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    interfaceC28593a3 = interfaceC28593a1;
                } else {
                    interfaceC28593a3 = interfaceC28593a1;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    TextResource textResourceM29599e = viewState.getNavigationTitle();
                    TextResource textResourceM29598d = viewState.getNavigationSubtitle();
                    textResourceM29604j = viewState.getSkipTitle();
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                        textResourceM29604j = null;
                    }
                    i16 = i15 & 896;
                    if (i16 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q.m87157i(viewState);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i || objM87133R4 == c28676v0) {
                        objM87133R4 = new C11546l(18, function4, viewState);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
                    if (i16 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z14 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C13390j(function4, 6);
                        c28655q.m87172p0(objM87133R5);
                    }
                    i17 = TextResource.$stable;
                    int i24 = i17 | (i17 << 3);
                    int i25 = i17 << 9;
                    function5 = function4;
                    interfaceC28593a4 = interfaceC28593a3;
                    AbstractC13424s.m38062e(textResourceM29599e, textResourceM29598d, 0, textResourceM29604j, interfaceC4339a, (InterfaceC4339a) objM87133R5, c28655q, i24 | i25, 4);
                    f13 = 3;
                    float f15 = 8;
                    float f16 = f13 * f15;
                    Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f16, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierMo3471e = modifierM92116f0.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    String strM21274h = AbstractC8693b.m21274h(c11020g.getTitle(), c28655q, i17);
                    c38072d = C38072d.f163053a;
                    int i26 = C38072d.f163054b;
                    long jM125430y = c38072d.m121949b(c28655q, i26).getBrandWhite();
                    C2886a c2886aM8416N = c38072d.m121952e(c28655q, i26).getT1();
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C36775k c36775k = new C36775k(5);
                    int i27 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h, modifierM3409f, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q, 48, i27, 196088);
                    f14 = 4;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f14, c2314t));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c11020g.getDescriptionDisplay(), c28655q, i17), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i26).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i26).getB1(), null, c28655q, 48, i27, 196088);
                    AbstractC18489d0.m53380u(f14, f14, c2314t, c28655q);
                    Modifier modifierM3424u = AbstractC1102d.m3424u(40 * f14, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3424u);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    Modifier modifierM3411h = AbstractC1102d.m3411h(12 * f14, c2314t);
                    c11029p = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2)));
                    if (c11029p != null || (textResourceM21267a = c11029p.getTitle()) == null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    TextResource textResource = textResourceM21267a;
                    if (m37946o(interfaceC28593a2) > 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (m37946o(interfaceC28593a2) < c11020g.m29597c().size() - 1) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    c11029p2 = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2) - 1));
                    if (c11029p2 != null || (strM29660a = c11029p2.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()) == null) {
                        strM29660a = "";
                    }
                    c11029p3 = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2) + 1));
                    if (c11029p3 != null || (strM29660a2 = c11029p3.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()) == null) {
                        str = "";
                    } else {
                        str = strM29660a2;
                    }
                    viewState = c11020g;
                    zM87157i2 = c28655q.m87157i(viewState);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87157i2) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R6 == c28676v1) {
                            interfaceC28593a5 = interfaceC28593a2;
                            interfaceC28593a6 = interfaceC28593a4;
                        }
                        c28676v2 = c28676v1;
                        interfaceC28593a7 = interfaceC28593a6;
                        AbstractC17862e.m51358q(modifierM3411h, false, null, textResource, z15, z16, strM29660a, str, null, null, null, null, (Function1) objM87133R6, c28655q, i25 | 6, 0, 3846);
                        c28655q.m87173q(true);
                        c11029p4 = viewState.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a5)));
                        if (c11029p4 == null) {
                            c28655q.m87150e0(-1435312871);
                            c28655q.m87173q(false);
                            c39967p2 = c39967p;
                        } else {
                            c28655q.m87150e0(-1435312870);
                            locale = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
                            if (locale == null) {
                                c28655q.m87150e0(-609844754);
                                objM87133R8 = c28655q.m87133R();
                                if (objM87133R8 == c28676v2) {
                                    objM87133R8 = Locale.getDefault();
                                    c28655q.m87172p0(objM87133R8);
                                }
                                locale = (Locale) objM87133R8;
                            } else {
                                c28655q.m87150e0(-573863135);
                            }
                            c28655q.m87173q(false);
                            String strM29660a3 = c11029p4.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                            c28621h1 = (C28621h1) interfaceC28593a7;
                            int iM87024x = c28621h1.m87024x();
                            AbstractC22676k.m65747g(locale);
                            C15493c c15493cM37930A = m37930A(strM29660a3, iM87024x, c39967p, interfaceC41070a, locale);
                            int iM87024x2 = (size - c28621h1.m87024x()) - 1;
                            zM87149e = c28655q.m87149e(size);
                            objM87133R7 = c28655q.m87133R();
                            if (zM87149e || objM87133R7 == c28676v2) {
                                objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                                c28655q.m87172p0(objM87133R7);
                            }
                            c39967p2 = c39967p;
                            AbstractC36945c.m118620i(c2314t, size, iM87024x2, (Function1) objM87133R7, null, AbstractC37817c.m121344e(488654871, c28655q, new C22931l(19, c15493cM37930A, c39967p)), c28655q, 196614, 16);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f16, ((float) 0.5d) * f15, f16, 0.0f, 8);
                        C11016c c11016cM29601g = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                        TextResource textResourceM29595a = viewState.getButtonTitle();
                        boolean z24 = !c39967p2.isEmpty();
                        if (i16 == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i3 = z17 | c28655q.m87157i(viewState) | c28655q.m87153g(c39967p2);
                        objM87133R9 = c28655q.m87133R();
                        if (!zM87157i3 || objM87133R9 == c28676v2) {
                            function6 = function5;
                            objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            function6 = function5;
                        }
                        AbstractC13410e.m37926c(c11016cM29601g, textResourceM29595a, modifierM3398t, z24, (InterfaceC4339a) objM87133R9, c28655q, i24, 0);
                        c28655q = c28655q;
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                            AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, -1743522641, f13, f14, c2314t));
                            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(c2305k);
                            TextResource textResourceM29604j2 = viewState.getSkipTitle();
                            C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                            if (i16 == 256) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87157i4 = z19 | c28655q.m87157i(viewState);
                            objM87133R11 = c28655q.m87133R();
                            if (zM87157i4 || objM87133R11 == c28676v2) {
                                objM87133R11 = new C9790n(18, function6, viewState);
                                c28655q.m87172p0(objM87133R11);
                            }
                            i18 = i16;
                            function7 = function6;
                            AbstractC27265l0.m82217i(horizontalAlignElement, null, textResourceM29604j2, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R11, c28655q, (i17 << 6) | (C39274g.f168929c << 12), 0, 4074);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            i18 = i16;
                            function7 = function6;
                            c28655q.m87150e0(-1743130553);
                            c28655q.m87173q(false);
                        }
                        AbstractC30007c.m91851u(c2314t, f16, c28655q, true);
                        if (i18 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R10 = c28655q.m87133R();
                        if (z18 || objM87133R10 == c28676v2) {
                            objM87133R10 = new C13390j(function7, 7);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R10, false, c28655q, 0, 1);
                        function3 = function7;
                    }
                    interfaceC28593a5 = interfaceC28593a2;
                    interfaceC28593a6 = interfaceC28593a4;
                    objM87133R6 = new C13412g(viewState, interfaceC28593a6, interfaceC28593a5, 0);
                    c28655q.m87172p0(objM87133R6);
                    c28676v2 = c28676v1;
                    interfaceC28593a7 = interfaceC28593a6;
                    AbstractC17862e.m51358q(modifierM3411h, false, null, textResource, z15, z16, strM29660a, str, null, null, null, null, (Function1) objM87133R6, c28655q, i25 | 6, 0, 3846);
                    c28655q.m87173q(true);
                    c11029p4 = viewState.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a5)));
                    if (c11029p4 == null) {
                        c28655q.m87150e0(-1435312871);
                        c28655q.m87173q(false);
                        c39967p2 = c39967p;
                    } else {
                        c28655q.m87150e0(-1435312870);
                        locale = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
                        if (locale == null) {
                            c28655q.m87150e0(-609844754);
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v2) {
                                objM87133R8 = Locale.getDefault();
                                c28655q.m87172p0(objM87133R8);
                            }
                            locale = (Locale) objM87133R8;
                        } else {
                            c28655q.m87150e0(-573863135);
                        }
                        c28655q.m87173q(false);
                        String strM29660a4 = c11029p4.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                        c28621h1 = (C28621h1) interfaceC28593a7;
                        int iM87024x3 = c28621h1.m87024x();
                        AbstractC22676k.m65747g(locale);
                        C15493c c15493cM37930A2 = m37930A(strM29660a4, iM87024x3, c39967p, interfaceC41070a, locale);
                        int iM87024x4 = (size - c28621h1.m87024x()) - 1;
                        zM87149e = c28655q.m87149e(size);
                        objM87133R7 = c28655q.m87133R();
                        if (zM87149e) {
                            objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                            c28655q.m87172p0(objM87133R7);
                        }
                        c39967p2 = c39967p;
                        AbstractC36945c.m118620i(c2314t, size, iM87024x4, (Function1) objM87133R7, null, AbstractC37817c.m121344e(488654871, c28655q, new C22931l(19, c15493cM37930A2, c39967p)), c28655q, 196614, 16);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f16, ((float) 0.5d) * f15, f16, 0.0f, 8);
                    C11016c c11016cM29601g2 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                    TextResource textResourceM29595a2 = viewState.getButtonTitle();
                    boolean z25 = !c39967p2.isEmpty();
                    if (i16 == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i3 = z17 | c28655q.m87157i(viewState) | c28655q.m87153g(c39967p2);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i3) {
                        function6 = function5;
                        objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        function6 = function5;
                        objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC13410e.m37926c(c11016cM29601g2, textResourceM29595a2, modifierM3398t2, z25, (InterfaceC4339a) objM87133R9, c28655q, i24, 0);
                    c28655q = c28655q;
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, -1743522641, f13, f14, c2314t));
                        HorizontalAlignElement horizontalAlignElement2 = new HorizontalAlignElement(c2305k);
                        TextResource textResourceM29604j3 = viewState.getSkipTitle();
                        C39274g c39274g2 = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                        if (i16 == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i4 = z19 | c28655q.m87157i(viewState);
                        objM87133R11 = c28655q.m87133R();
                        if (zM87157i4) {
                            objM87133R11 = new C9790n(18, function6, viewState);
                            c28655q.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C9790n(18, function6, viewState);
                            c28655q.m87172p0(objM87133R11);
                        }
                        i18 = i16;
                        function7 = function6;
                        AbstractC27265l0.m82217i(horizontalAlignElement2, null, textResourceM29604j3, null, c39274g2, false, null, null, false, false, null, null, (Function1) objM87133R11, c28655q, (i17 << 6) | (C39274g.f168929c << 12), 0, 4074);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        i18 = i16;
                        function7 = function6;
                        c28655q.m87150e0(-1743130553);
                        c28655q.m87173q(false);
                    }
                    AbstractC30007c.m91851u(c2314t, f16, c28655q, true);
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z18) {
                        objM87133R10 = new C13390j(function7, 7);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C13390j(function7, 7);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R10, false, c28655q, 0, 1);
                    function3 = function7;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                TextResource textResourceM29599e2 = viewState.getNavigationTitle();
                TextResource textResourceM29598d2 = viewState.getNavigationSubtitle();
                textResourceM29604j = viewState.getSkipTitle();
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                    textResourceM29604j = null;
                }
                i16 = i15 & 896;
                if (i16 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q.m87157i(viewState);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C11546l(18, function4, viewState);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C11546l(18, function4, viewState);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                if (i16 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z14) {
                    objM87133R5 = new C13390j(function4, 6);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C13390j(function4, 6);
                    c28655q.m87172p0(objM87133R5);
                }
                i17 = TextResource.$stable;
                int i28 = i17 | (i17 << 3);
                int i29 = i17 << 9;
                function5 = function4;
                interfaceC28593a4 = interfaceC28593a3;
                AbstractC13424s.m38062e(textResourceM29599e2, textResourceM29598d2, 0, textResourceM29604j, interfaceC4339a2, (InterfaceC4339a) objM87133R5, c28655q, i28 | i29, 4);
                f13 = 3;
                float f17 = 8;
                float f18 = f13 * f17;
                Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f18, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierMo3471e2 = modifierM92116f1.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                String strM21274h2 = AbstractC8693b.m21274h(c11020g.getTitle(), c28655q, i17);
                c38072d = C38072d.f163053a;
                int i210 = C38072d.f163054b;
                long jM125430y2 = c38072d.m121949b(c28655q, i210).getBrandWhite();
                C2886a c2886aM8416N2 = c38072d.m121952e(c28655q, i210).getT1();
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C36775k c36775k2 = new C36775k(5);
                int i211 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h2, modifierM3409f2, jM125430y2, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8416N2, null, c28655q, 48, i211, 196088);
                f14 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f14, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c11020g.getDescriptionDisplay(), c28655q, i17), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i210).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i210).getB1(), null, c28655q, 48, i211, 196088);
                AbstractC18489d0.m53380u(f14, f14, c2314t, c28655q);
                Modifier modifierM3424u2 = AbstractC1102d.m3424u(40 * f14, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3424u2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                Modifier modifierM3411h2 = AbstractC1102d.m3411h(12 * f14, c2314t);
                c11029p = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2)));
                if (c11029p != null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                TextResource textResource2 = textResourceM21267a;
                if (m37946o(interfaceC28593a2) > 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (m37946o(interfaceC28593a2) < c11020g.m29597c().size() - 1) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                c11029p2 = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2) - 1));
                if (c11029p2 != null) {
                    strM29660a = "";
                } else {
                    strM29660a = "";
                }
                c11029p3 = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2) + 1));
                if (c11029p3 != null) {
                    str = "";
                } else {
                    str = "";
                }
                viewState = c11020g;
                zM87157i2 = c28655q.m87157i(viewState);
                objM87133R6 = c28655q.m87133R();
                if (zM87157i2) {
                    c28676v1 = c28676v0;
                    if (objM87133R6 == c28676v1) {
                        interfaceC28593a5 = interfaceC28593a2;
                        interfaceC28593a6 = interfaceC28593a4;
                    }
                    c28676v2 = c28676v1;
                    interfaceC28593a7 = interfaceC28593a6;
                    AbstractC17862e.m51358q(modifierM3411h2, false, null, textResource2, z15, z16, strM29660a, str, null, null, null, null, (Function1) objM87133R6, c28655q, i29 | 6, 0, 3846);
                    c28655q.m87173q(true);
                    c11029p4 = viewState.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a5)));
                    if (c11029p4 == null) {
                        c28655q.m87150e0(-1435312871);
                        c28655q.m87173q(false);
                        c39967p2 = c39967p;
                    } else {
                        c28655q.m87150e0(-1435312870);
                        locale = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
                        if (locale == null) {
                            c28655q.m87150e0(-609844754);
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v2) {
                                objM87133R8 = Locale.getDefault();
                                c28655q.m87172p0(objM87133R8);
                            }
                            locale = (Locale) objM87133R8;
                        } else {
                            c28655q.m87150e0(-573863135);
                        }
                        c28655q.m87173q(false);
                        String strM29660a5 = c11029p4.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                        c28621h1 = (C28621h1) interfaceC28593a7;
                        int iM87024x5 = c28621h1.m87024x();
                        AbstractC22676k.m65747g(locale);
                        C15493c c15493cM37930A3 = m37930A(strM29660a5, iM87024x5, c39967p, interfaceC41070a, locale);
                        int iM87024x6 = (size - c28621h1.m87024x()) - 1;
                        zM87149e = c28655q.m87149e(size);
                        objM87133R7 = c28655q.m87133R();
                        if (zM87149e) {
                            objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                            c28655q.m87172p0(objM87133R7);
                        }
                        c39967p2 = c39967p;
                        AbstractC36945c.m118620i(c2314t, size, iM87024x6, (Function1) objM87133R7, null, AbstractC37817c.m121344e(488654871, c28655q, new C22931l(19, c15493cM37930A3, c39967p)), c28655q, 196614, 16);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f18, ((float) 0.5d) * f17, f18, 0.0f, 8);
                    C11016c c11016cM29601g3 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                    TextResource textResourceM29595a3 = viewState.getButtonTitle();
                    boolean z26 = !c39967p2.isEmpty();
                    if (i16 == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i3 = z17 | c28655q.m87157i(viewState) | c28655q.m87153g(c39967p2);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i3) {
                        function6 = function5;
                        objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        function6 = function5;
                        objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC13410e.m37926c(c11016cM29601g3, textResourceM29595a3, modifierM3398t3, z26, (InterfaceC4339a) objM87133R9, c28655q, i28, 0);
                    c28655q = c28655q;
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, -1743522641, f13, f14, c2314t));
                        HorizontalAlignElement horizontalAlignElement3 = new HorizontalAlignElement(c2305k);
                        TextResource textResourceM29604j4 = viewState.getSkipTitle();
                        C39274g c39274g3 = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                        if (i16 == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i4 = z19 | c28655q.m87157i(viewState);
                        objM87133R11 = c28655q.m87133R();
                        if (zM87157i4) {
                            objM87133R11 = new C9790n(18, function6, viewState);
                            c28655q.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C9790n(18, function6, viewState);
                            c28655q.m87172p0(objM87133R11);
                        }
                        i18 = i16;
                        function7 = function6;
                        AbstractC27265l0.m82217i(horizontalAlignElement3, null, textResourceM29604j4, null, c39274g3, false, null, null, false, false, null, null, (Function1) objM87133R11, c28655q, (i17 << 6) | (C39274g.f168929c << 12), 0, 4074);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        i18 = i16;
                        function7 = function6;
                        c28655q.m87150e0(-1743130553);
                        c28655q.m87173q(false);
                    }
                    AbstractC30007c.m91851u(c2314t, f18, c28655q, true);
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z18) {
                        objM87133R10 = new C13390j(function7, 7);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C13390j(function7, 7);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R10, false, c28655q, 0, 1);
                    function3 = function7;
                } else {
                    c28676v1 = c28676v0;
                }
                interfaceC28593a5 = interfaceC28593a2;
                interfaceC28593a6 = interfaceC28593a4;
                objM87133R6 = new C13412g(viewState, interfaceC28593a6, interfaceC28593a5, 0);
                c28655q.m87172p0(objM87133R6);
                c28676v2 = c28676v1;
                interfaceC28593a7 = interfaceC28593a6;
                AbstractC17862e.m51358q(modifierM3411h2, false, null, textResource2, z15, z16, strM29660a, str, null, null, null, null, (Function1) objM87133R6, c28655q, i29 | 6, 0, 3846);
                c28655q.m87173q(true);
                c11029p4 = viewState.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a5)));
                if (c11029p4 == null) {
                    c28655q.m87150e0(-1435312871);
                    c28655q.m87173q(false);
                    c39967p2 = c39967p;
                } else {
                    c28655q.m87150e0(-1435312870);
                    locale = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
                    if (locale == null) {
                        c28655q.m87150e0(-609844754);
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v2) {
                            objM87133R8 = Locale.getDefault();
                            c28655q.m87172p0(objM87133R8);
                        }
                        locale = (Locale) objM87133R8;
                    } else {
                        c28655q.m87150e0(-573863135);
                    }
                    c28655q.m87173q(false);
                    String strM29660a6 = c11029p4.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                    c28621h1 = (C28621h1) interfaceC28593a7;
                    int iM87024x7 = c28621h1.m87024x();
                    AbstractC22676k.m65747g(locale);
                    C15493c c15493cM37930A4 = m37930A(strM29660a6, iM87024x7, c39967p, interfaceC41070a, locale);
                    int iM87024x8 = (size - c28621h1.m87024x()) - 1;
                    zM87149e = c28655q.m87149e(size);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                        c28655q.m87172p0(objM87133R7);
                    }
                    c39967p2 = c39967p;
                    AbstractC36945c.m118620i(c2314t, size, iM87024x8, (Function1) objM87133R7, null, AbstractC37817c.m121344e(488654871, c28655q, new C22931l(19, c15493cM37930A4, c39967p)), c28655q, 196614, 16);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f18, ((float) 0.5d) * f17, f18, 0.0f, 8);
                C11016c c11016cM29601g4 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                TextResource textResourceM29595a4 = viewState.getButtonTitle();
                boolean z27 = !c39967p2.isEmpty();
                if (i16 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i3 = z17 | c28655q.m87157i(viewState) | c28655q.m87153g(c39967p2);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i3) {
                    function6 = function5;
                    objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    function6 = function5;
                    objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                    c28655q.m87172p0(objM87133R9);
                }
                AbstractC13410e.m37926c(c11016cM29601g4, textResourceM29595a4, modifierM3398t4, z27, (InterfaceC4339a) objM87133R9, c28655q, i28, 0);
                c28655q = c28655q;
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                    AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, -1743522641, f13, f14, c2314t));
                    HorizontalAlignElement horizontalAlignElement4 = new HorizontalAlignElement(c2305k);
                    TextResource textResourceM29604j5 = viewState.getSkipTitle();
                    C39274g c39274g4 = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                    if (i16 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i4 = z19 | c28655q.m87157i(viewState);
                    objM87133R11 = c28655q.m87133R();
                    if (zM87157i4) {
                        objM87133R11 = new C9790n(18, function6, viewState);
                        c28655q.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C9790n(18, function6, viewState);
                        c28655q.m87172p0(objM87133R11);
                    }
                    i18 = i16;
                    function7 = function6;
                    AbstractC27265l0.m82217i(horizontalAlignElement4, null, textResourceM29604j5, null, c39274g4, false, null, null, false, false, null, null, (Function1) objM87133R11, c28655q, (i17 << 6) | (C39274g.f168929c << 12), 0, 4074);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    i18 = i16;
                    function7 = function6;
                    c28655q.m87150e0(-1743130553);
                    c28655q.m87173q(false);
                }
                AbstractC30007c.m91851u(c2314t, f18, c28655q, true);
                if (i18 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z18) {
                    objM87133R10 = new C13390j(function7, 7);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C13390j(function7, 7);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R10, false, c28655q, 0, 1);
                function3 = function7;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 16, (Object) viewState, (Object) interfaceC41070a, (InterfaceC23459e) function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R12 = c28655q.m87133R();
                if (objM87133R12 == c28676v0) {
                    objM87133R12 = new C13406a(7);
                    c28655q.m87172p0(objM87133R12);
                }
                function4 = (Function1) objM87133R12;
            } else {
                function4 = function2;
            }
            size = viewState.m29597c().size();
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95646v(0, c28655q);
            }
            interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95646v(viewState.m29597c().size() - 1, c28655q);
            }
            interfaceC28593a2 = (InterfaceC28593a1) objM87133R2;
            zM87153g = c28655q.m87153g(viewState.m29602h());
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                listM29602h = viewState.m29602h();
                if (listM29602h == null) {
                    listM29602h = C25271y.f99162w;
                }
                String[] strArr2 = (String[]) listM29602h.toArray(new String[0]);
                Object[] objArrCopyOf2 = Arrays.copyOf(strArr2, strArr2.length);
                C39967p c39967p4 = new C39967p();
                c39967p4.addAll(AbstractC25260n.m74049W0(objArrCopyOf2));
                c28655q.m87172p0(c39967p4);
                objM87133R3 = c39967p4;
            } else {
                listM29602h = viewState.m29602h();
                if (listM29602h == null) {
                    listM29602h = C25271y.f99162w;
                }
                String[] strArr3 = (String[]) listM29602h.toArray(new String[0]);
                Object[] objArrCopyOf3 = Arrays.copyOf(strArr3, strArr3.length);
                C39967p c39967p5 = new C39967p();
                c39967p5.addAll(AbstractC25260n.m74049W0(objArrCopyOf3));
                c28655q.m87172p0(c39967p5);
                objM87133R3 = c39967p5;
            }
            c39967p = (C39967p) objM87133R3;
            c2314t = C2314t.f9131w;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            c2305k = C2299e.f9111N;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a4);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                interfaceC28593a3 = interfaceC28593a1;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
                TextResource textResourceM29599e3 = viewState.getNavigationTitle();
                TextResource textResourceM29598d3 = viewState.getNavigationSubtitle();
                textResourceM29604j = viewState.getSkipTitle();
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                    textResourceM29604j = null;
                }
                i16 = i15 & 896;
                if (i16 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q.m87157i(viewState);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C11546l(18, function4, viewState);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C11546l(18, function4, viewState);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
                if (i16 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z14) {
                    objM87133R5 = new C13390j(function4, 6);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C13390j(function4, 6);
                    c28655q.m87172p0(objM87133R5);
                }
                i17 = TextResource.$stable;
                int i212 = i17 | (i17 << 3);
                int i213 = i17 << 9;
                function5 = function4;
                interfaceC28593a4 = interfaceC28593a3;
                AbstractC13424s.m38062e(textResourceM29599e3, textResourceM29598d3, 0, textResourceM29604j, interfaceC4339a3, (InterfaceC4339a) objM87133R5, c28655q, i212 | i213, 4);
                f13 = 3;
                float f19 = 8;
                float f110 = f13 * f19;
                Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f110, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierMo3471e3 = modifierM92116f2.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N7);
                String strM21274h3 = AbstractC8693b.m21274h(c11020g.getTitle(), c28655q, i17);
                c38072d = C38072d.f163053a;
                int i214 = C38072d.f163054b;
                long jM125430y3 = c38072d.m121949b(c28655q, i214).getBrandWhite();
                C2886a c2886aM8416N3 = c38072d.m121952e(c28655q, i214).getT1();
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                C36775k c36775k3 = new C36775k(5);
                int i215 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h3, modifierM3409f3, jM125430y3, 0L, null, null, null, 0L, null, c36775k3, 0L, 0, false, 0, 0, null, c2886aM8416N3, null, c28655q, 48, i215, 196088);
                f14 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f14, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c11020g.getDescriptionDisplay(), c28655q, i17), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i214).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i214).getB1(), null, c28655q, 48, i215, 196088);
                AbstractC18489d0.m53380u(f14, f14, c2314t, c28655q);
                Modifier modifierM3424u3 = AbstractC1102d.m3424u(40 * f14, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3424u3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N8);
                Modifier modifierM3411h3 = AbstractC1102d.m3411h(12 * f14, c2314t);
                c11029p = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2)));
                if (c11029p != null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                TextResource textResource3 = textResourceM21267a;
                if (m37946o(interfaceC28593a2) > 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (m37946o(interfaceC28593a2) < c11020g.m29597c().size() - 1) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                c11029p2 = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2) - 1));
                if (c11029p2 != null) {
                    strM29660a = "";
                } else {
                    strM29660a = "";
                }
                c11029p3 = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2) + 1));
                if (c11029p3 != null) {
                    str = "";
                } else {
                    str = "";
                }
                viewState = c11020g;
                zM87157i2 = c28655q.m87157i(viewState);
                objM87133R6 = c28655q.m87133R();
                if (zM87157i2) {
                    c28676v1 = c28676v0;
                    if (objM87133R6 == c28676v1) {
                        interfaceC28593a5 = interfaceC28593a2;
                        interfaceC28593a6 = interfaceC28593a4;
                    }
                    c28676v2 = c28676v1;
                    interfaceC28593a7 = interfaceC28593a6;
                    AbstractC17862e.m51358q(modifierM3411h3, false, null, textResource3, z15, z16, strM29660a, str, null, null, null, null, (Function1) objM87133R6, c28655q, i213 | 6, 0, 3846);
                    c28655q.m87173q(true);
                    c11029p4 = viewState.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a5)));
                    if (c11029p4 == null) {
                        c28655q.m87150e0(-1435312871);
                        c28655q.m87173q(false);
                        c39967p2 = c39967p;
                    } else {
                        c28655q.m87150e0(-1435312870);
                        locale = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
                        if (locale == null) {
                            c28655q.m87150e0(-609844754);
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v2) {
                                objM87133R8 = Locale.getDefault();
                                c28655q.m87172p0(objM87133R8);
                            }
                            locale = (Locale) objM87133R8;
                        } else {
                            c28655q.m87150e0(-573863135);
                        }
                        c28655q.m87173q(false);
                        String strM29660a7 = c11029p4.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                        c28621h1 = (C28621h1) interfaceC28593a7;
                        int iM87024x9 = c28621h1.m87024x();
                        AbstractC22676k.m65747g(locale);
                        C15493c c15493cM37930A5 = m37930A(strM29660a7, iM87024x9, c39967p, interfaceC41070a, locale);
                        int iM87024x10 = (size - c28621h1.m87024x()) - 1;
                        zM87149e = c28655q.m87149e(size);
                        objM87133R7 = c28655q.m87133R();
                        if (zM87149e) {
                            objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                            c28655q.m87172p0(objM87133R7);
                        }
                        c39967p2 = c39967p;
                        AbstractC36945c.m118620i(c2314t, size, iM87024x10, (Function1) objM87133R7, null, AbstractC37817c.m121344e(488654871, c28655q, new C22931l(19, c15493cM37930A5, c39967p)), c28655q, 196614, 16);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f110, ((float) 0.5d) * f19, f110, 0.0f, 8);
                    C11016c c11016cM29601g5 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                    TextResource textResourceM29595a5 = viewState.getButtonTitle();
                    boolean z28 = !c39967p2.isEmpty();
                    if (i16 == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i3 = z17 | c28655q.m87157i(viewState) | c28655q.m87153g(c39967p2);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i3) {
                        function6 = function5;
                        objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        function6 = function5;
                        objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC13410e.m37926c(c11016cM29601g5, textResourceM29595a5, modifierM3398t5, z28, (InterfaceC4339a) objM87133R9, c28655q, i212, 0);
                    c28655q = c28655q;
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, -1743522641, f13, f14, c2314t));
                        HorizontalAlignElement horizontalAlignElement5 = new HorizontalAlignElement(c2305k);
                        TextResource textResourceM29604j6 = viewState.getSkipTitle();
                        C39274g c39274g5 = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                        if (i16 == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i4 = z19 | c28655q.m87157i(viewState);
                        objM87133R11 = c28655q.m87133R();
                        if (zM87157i4) {
                            objM87133R11 = new C9790n(18, function6, viewState);
                            c28655q.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C9790n(18, function6, viewState);
                            c28655q.m87172p0(objM87133R11);
                        }
                        i18 = i16;
                        function7 = function6;
                        AbstractC27265l0.m82217i(horizontalAlignElement5, null, textResourceM29604j6, null, c39274g5, false, null, null, false, false, null, null, (Function1) objM87133R11, c28655q, (i17 << 6) | (C39274g.f168929c << 12), 0, 4074);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        i18 = i16;
                        function7 = function6;
                        c28655q.m87150e0(-1743130553);
                        c28655q.m87173q(false);
                    }
                    AbstractC30007c.m91851u(c2314t, f110, c28655q, true);
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z18) {
                        objM87133R10 = new C13390j(function7, 7);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C13390j(function7, 7);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R10, false, c28655q, 0, 1);
                    function3 = function7;
                } else {
                    c28676v1 = c28676v0;
                }
                interfaceC28593a5 = interfaceC28593a2;
                interfaceC28593a6 = interfaceC28593a4;
                objM87133R6 = new C13412g(viewState, interfaceC28593a6, interfaceC28593a5, 0);
                c28655q.m87172p0(objM87133R6);
                c28676v2 = c28676v1;
                interfaceC28593a7 = interfaceC28593a6;
                AbstractC17862e.m51358q(modifierM3411h3, false, null, textResource3, z15, z16, strM29660a, str, null, null, null, null, (Function1) objM87133R6, c28655q, i213 | 6, 0, 3846);
                c28655q.m87173q(true);
                c11029p4 = viewState.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a5)));
                if (c11029p4 == null) {
                    c28655q.m87150e0(-1435312871);
                    c28655q.m87173q(false);
                    c39967p2 = c39967p;
                } else {
                    c28655q.m87150e0(-1435312870);
                    locale = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
                    if (locale == null) {
                        c28655q.m87150e0(-609844754);
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v2) {
                            objM87133R8 = Locale.getDefault();
                            c28655q.m87172p0(objM87133R8);
                        }
                        locale = (Locale) objM87133R8;
                    } else {
                        c28655q.m87150e0(-573863135);
                    }
                    c28655q.m87173q(false);
                    String strM29660a8 = c11029p4.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                    c28621h1 = (C28621h1) interfaceC28593a7;
                    int iM87024x11 = c28621h1.m87024x();
                    AbstractC22676k.m65747g(locale);
                    C15493c c15493cM37930A6 = m37930A(strM29660a8, iM87024x11, c39967p, interfaceC41070a, locale);
                    int iM87024x12 = (size - c28621h1.m87024x()) - 1;
                    zM87149e = c28655q.m87149e(size);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                        c28655q.m87172p0(objM87133R7);
                    }
                    c39967p2 = c39967p;
                    AbstractC36945c.m118620i(c2314t, size, iM87024x12, (Function1) objM87133R7, null, AbstractC37817c.m121344e(488654871, c28655q, new C22931l(19, c15493cM37930A6, c39967p)), c28655q, 196614, 16);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f110, ((float) 0.5d) * f19, f110, 0.0f, 8);
                C11016c c11016cM29601g6 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                TextResource textResourceM29595a6 = viewState.getButtonTitle();
                boolean z29 = !c39967p2.isEmpty();
                if (i16 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i3 = z17 | c28655q.m87157i(viewState) | c28655q.m87153g(c39967p2);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i3) {
                    function6 = function5;
                    objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    function6 = function5;
                    objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                    c28655q.m87172p0(objM87133R9);
                }
                AbstractC13410e.m37926c(c11016cM29601g6, textResourceM29595a6, modifierM3398t6, z29, (InterfaceC4339a) objM87133R9, c28655q, i212, 0);
                c28655q = c28655q;
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                    AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, -1743522641, f13, f14, c2314t));
                    HorizontalAlignElement horizontalAlignElement6 = new HorizontalAlignElement(c2305k);
                    TextResource textResourceM29604j7 = viewState.getSkipTitle();
                    C39274g c39274g6 = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                    if (i16 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i4 = z19 | c28655q.m87157i(viewState);
                    objM87133R11 = c28655q.m87133R();
                    if (zM87157i4) {
                        objM87133R11 = new C9790n(18, function6, viewState);
                        c28655q.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C9790n(18, function6, viewState);
                        c28655q.m87172p0(objM87133R11);
                    }
                    i18 = i16;
                    function7 = function6;
                    AbstractC27265l0.m82217i(horizontalAlignElement6, null, textResourceM29604j7, null, c39274g6, false, null, null, false, false, null, null, (Function1) objM87133R11, c28655q, (i17 << 6) | (C39274g.f168929c << 12), 0, 4074);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    i18 = i16;
                    function7 = function6;
                    c28655q.m87150e0(-1743130553);
                    c28655q.m87173q(false);
                }
                AbstractC30007c.m91851u(c2314t, f110, c28655q, true);
                if (i18 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z18) {
                    objM87133R10 = new C13390j(function7, 7);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C13390j(function7, 7);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R10, false, c28655q, 0, 1);
                function3 = function7;
            } else {
                interfaceC28593a3 = interfaceC28593a1;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            TextResource textResourceM29599e4 = viewState.getNavigationTitle();
            TextResource textResourceM29598d4 = viewState.getNavigationSubtitle();
            textResourceM29604j = viewState.getSkipTitle();
            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                textResourceM29604j = null;
            }
            i16 = i15 & 896;
            if (i16 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i = z13 | c28655q.m87157i(viewState);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R4 = new C11546l(18, function4, viewState);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C11546l(18, function4, viewState);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
            if (i16 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R5 = c28655q.m87133R();
            if (z14) {
                objM87133R5 = new C13390j(function4, 6);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C13390j(function4, 6);
                c28655q.m87172p0(objM87133R5);
            }
            i17 = TextResource.$stable;
            int i216 = i17 | (i17 << 3);
            int i217 = i17 << 9;
            function5 = function4;
            interfaceC28593a4 = interfaceC28593a3;
            AbstractC13424s.m38062e(textResourceM29599e4, textResourceM29598d4, 0, textResourceM29604j, interfaceC4339a4, (InterfaceC4339a) objM87133R5, c28655q, i216 | i217, 4);
            f13 = 3;
            float f111 = 8;
            float f112 = f13 * f111;
            Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f112, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e4 = modifierM92116f3.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m9);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N9);
            String strM21274h4 = AbstractC8693b.m21274h(c11020g.getTitle(), c28655q, i17);
            c38072d = C38072d.f163053a;
            int i218 = C38072d.f163054b;
            long jM125430y4 = c38072d.m121949b(c28655q, i218).getBrandWhite();
            C2886a c2886aM8416N4 = c38072d.m121952e(c28655q, i218).getT1();
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            C36775k c36775k4 = new C36775k(5);
            int i219 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h4, modifierM3409f4, jM125430y4, 0L, null, null, null, 0L, null, c36775k4, 0L, 0, false, 0, 0, null, c2886aM8416N4, null, c28655q, 48, i219, 196088);
            f14 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c11020g.getDescriptionDisplay(), c28655q, i17), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i218).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i218).getB1(), null, c28655q, 48, i219, 196088);
            AbstractC18489d0.m53380u(f14, f14, c2314t, c28655q);
            Modifier modifierM3424u4 = AbstractC1102d.m3424u(40 * f14, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3424u4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m10);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N10);
            Modifier modifierM3411h4 = AbstractC1102d.m3411h(12 * f14, c2314t);
            c11029p = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2)));
            if (c11029p != null) {
                textResourceM21267a = AbstractC8693b.m21267a();
            } else {
                textResourceM21267a = AbstractC8693b.m21267a();
            }
            TextResource textResource4 = textResourceM21267a;
            if (m37946o(interfaceC28593a2) > 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (m37946o(interfaceC28593a2) < c11020g.m29597c().size() - 1) {
                z16 = true;
            } else {
                z16 = false;
            }
            c11029p2 = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2) - 1));
            if (c11029p2 != null) {
                strM29660a = "";
            } else {
                strM29660a = "";
            }
            c11029p3 = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2) + 1));
            if (c11029p3 != null) {
                str = "";
            } else {
                str = "";
            }
            viewState = c11020g;
            zM87157i2 = c28655q.m87157i(viewState);
            objM87133R6 = c28655q.m87133R();
            if (zM87157i2) {
                c28676v1 = c28676v0;
                if (objM87133R6 == c28676v1) {
                    interfaceC28593a5 = interfaceC28593a2;
                    interfaceC28593a6 = interfaceC28593a4;
                }
                c28676v2 = c28676v1;
                interfaceC28593a7 = interfaceC28593a6;
                AbstractC17862e.m51358q(modifierM3411h4, false, null, textResource4, z15, z16, strM29660a, str, null, null, null, null, (Function1) objM87133R6, c28655q, i217 | 6, 0, 3846);
                c28655q.m87173q(true);
                c11029p4 = viewState.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a5)));
                if (c11029p4 == null) {
                    c28655q.m87150e0(-1435312871);
                    c28655q.m87173q(false);
                    c39967p2 = c39967p;
                } else {
                    c28655q.m87150e0(-1435312870);
                    locale = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
                    if (locale == null) {
                        c28655q.m87150e0(-609844754);
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v2) {
                            objM87133R8 = Locale.getDefault();
                            c28655q.m87172p0(objM87133R8);
                        }
                        locale = (Locale) objM87133R8;
                    } else {
                        c28655q.m87150e0(-573863135);
                    }
                    c28655q.m87173q(false);
                    String strM29660a9 = c11029p4.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                    c28621h1 = (C28621h1) interfaceC28593a7;
                    int iM87024x13 = c28621h1.m87024x();
                    AbstractC22676k.m65747g(locale);
                    C15493c c15493cM37930A7 = m37930A(strM29660a9, iM87024x13, c39967p, interfaceC41070a, locale);
                    int iM87024x14 = (size - c28621h1.m87024x()) - 1;
                    zM87149e = c28655q.m87149e(size);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                        c28655q.m87172p0(objM87133R7);
                    }
                    c39967p2 = c39967p;
                    AbstractC36945c.m118620i(c2314t, size, iM87024x14, (Function1) objM87133R7, null, AbstractC37817c.m121344e(488654871, c28655q, new C22931l(19, c15493cM37930A7, c39967p)), c28655q, 196614, 16);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f112, ((float) 0.5d) * f111, f112, 0.0f, 8);
                C11016c c11016cM29601g7 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                TextResource textResourceM29595a7 = viewState.getButtonTitle();
                boolean z210 = !c39967p2.isEmpty();
                if (i16 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i3 = z17 | c28655q.m87157i(viewState) | c28655q.m87153g(c39967p2);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i3) {
                    function6 = function5;
                    objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    function6 = function5;
                    objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                    c28655q.m87172p0(objM87133R9);
                }
                AbstractC13410e.m37926c(c11016cM29601g7, textResourceM29595a7, modifierM3398t7, z210, (InterfaceC4339a) objM87133R9, c28655q, i216, 0);
                c28655q = c28655q;
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                    AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, -1743522641, f13, f14, c2314t));
                    HorizontalAlignElement horizontalAlignElement7 = new HorizontalAlignElement(c2305k);
                    TextResource textResourceM29604j8 = viewState.getSkipTitle();
                    C39274g c39274g7 = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                    if (i16 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i4 = z19 | c28655q.m87157i(viewState);
                    objM87133R11 = c28655q.m87133R();
                    if (zM87157i4) {
                        objM87133R11 = new C9790n(18, function6, viewState);
                        c28655q.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C9790n(18, function6, viewState);
                        c28655q.m87172p0(objM87133R11);
                    }
                    i18 = i16;
                    function7 = function6;
                    AbstractC27265l0.m82217i(horizontalAlignElement7, null, textResourceM29604j8, null, c39274g7, false, null, null, false, false, null, null, (Function1) objM87133R11, c28655q, (i17 << 6) | (C39274g.f168929c << 12), 0, 4074);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    i18 = i16;
                    function7 = function6;
                    c28655q.m87150e0(-1743130553);
                    c28655q.m87173q(false);
                }
                AbstractC30007c.m91851u(c2314t, f112, c28655q, true);
                if (i18 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z18) {
                    objM87133R10 = new C13390j(function7, 7);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C13390j(function7, 7);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R10, false, c28655q, 0, 1);
                function3 = function7;
            } else {
                c28676v1 = c28676v0;
            }
            interfaceC28593a5 = interfaceC28593a2;
            interfaceC28593a6 = interfaceC28593a4;
            objM87133R6 = new C13412g(viewState, interfaceC28593a6, interfaceC28593a5, 0);
            c28655q.m87172p0(objM87133R6);
            c28676v2 = c28676v1;
            interfaceC28593a7 = interfaceC28593a6;
            AbstractC17862e.m51358q(modifierM3411h4, false, null, textResource4, z15, z16, strM29660a, str, null, null, null, null, (Function1) objM87133R6, c28655q, i217 | 6, 0, 3846);
            c28655q.m87173q(true);
            c11029p4 = viewState.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a5)));
            if (c11029p4 == null) {
                c28655q.m87150e0(-1435312871);
                c28655q.m87173q(false);
                c39967p2 = c39967p;
            } else {
                c28655q.m87150e0(-1435312870);
                locale = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
                if (locale == null) {
                    c28655q.m87150e0(-609844754);
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v2) {
                        objM87133R8 = Locale.getDefault();
                        c28655q.m87172p0(objM87133R8);
                    }
                    locale = (Locale) objM87133R8;
                } else {
                    c28655q.m87150e0(-573863135);
                }
                c28655q.m87173q(false);
                String strM29660a10 = c11029p4.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                c28621h1 = (C28621h1) interfaceC28593a7;
                int iM87024x15 = c28621h1.m87024x();
                AbstractC22676k.m65747g(locale);
                C15493c c15493cM37930A8 = m37930A(strM29660a10, iM87024x15, c39967p, interfaceC41070a, locale);
                int iM87024x16 = (size - c28621h1.m87024x()) - 1;
                zM87149e = c28655q.m87149e(size);
                objM87133R7 = c28655q.m87133R();
                if (zM87149e) {
                    objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C6517d(size, c28621h1, interfaceC28593a5, 2);
                    c28655q.m87172p0(objM87133R7);
                }
                c39967p2 = c39967p;
                AbstractC36945c.m118620i(c2314t, size, iM87024x16, (Function1) objM87133R7, null, AbstractC37817c.m121344e(488654871, c28655q, new C22931l(19, c15493cM37930A8, c39967p)), c28655q, 196614, 16);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f112, ((float) 0.5d) * f111, f112, 0.0f, 8);
            C11016c c11016cM29601g8 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
            TextResource textResourceM29595a8 = viewState.getButtonTitle();
            boolean z211 = !c39967p2.isEmpty();
            if (i16 == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87157i3 = z17 | c28655q.m87157i(viewState) | c28655q.m87153g(c39967p2);
            objM87133R9 = c28655q.m87133R();
            if (zM87157i3) {
                function6 = function5;
                objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                c28655q.m87172p0(objM87133R9);
            } else {
                function6 = function5;
                objM87133R9 = new C11558r(function6, viewState, c39967p2, 8);
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC13410e.m37926c(c11016cM29601g8, textResourceM29595a8, modifierM3398t8, z211, (InterfaceC4339a) objM87133R9, c28655q, i216, 0);
            c28655q = c28655q;
            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, -1743522641, f13, f14, c2314t));
                HorizontalAlignElement horizontalAlignElement8 = new HorizontalAlignElement(c2305k);
                TextResource textResourceM29604j9 = viewState.getSkipTitle();
                C39274g c39274g8 = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                if (i16 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87157i4 = z19 | c28655q.m87157i(viewState);
                objM87133R11 = c28655q.m87133R();
                if (zM87157i4) {
                    objM87133R11 = new C9790n(18, function6, viewState);
                    c28655q.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C9790n(18, function6, viewState);
                    c28655q.m87172p0(objM87133R11);
                }
                i18 = i16;
                function7 = function6;
                AbstractC27265l0.m82217i(horizontalAlignElement8, null, textResourceM29604j9, null, c39274g8, false, null, null, false, false, null, null, (Function1) objM87133R11, c28655q, (i17 << 6) | (C39274g.f168929c << 12), 0, 4074);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                i18 = i16;
                function7 = function6;
                c28655q.m87150e0(-1743130553);
                c28655q.m87173q(false);
            }
            AbstractC30007c.m91851u(c2314t, f112, c28655q, true);
            if (i18 == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R10 = c28655q.m87133R();
            if (z18) {
                objM87133R10 = new C13390j(function7, 7);
                c28655q.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new C13390j(function7, 7);
                c28655q.m87172p0(objM87133R10);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R10, false, c28655q, 0, 1);
            function3 = function7;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 16, (Object) viewState, (Object) interfaceC41070a, (InterfaceC23459e) function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m37945n(AbstractC11022i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final int m37946o(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: p */
    private static final void m37947p(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m37948q(Function1 function1, C11020g c11020g) {
        function1.invoke(new AbstractC11022i.f(c11020g.getSkipNextId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m37949r(Function1 function1) {
        function1.invoke(AbstractC11022i.a.f34542a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m37950s(C11020g c11020g, InterfaceC28593a1 interfaceC28593a1, InterfaceC28593a1 interfaceC28593a2, Object it) {
        AbstractC22676k.m65750j(it, "it");
        String str = (String) it;
        C11029p c11029p = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2) - 1));
        if (str.equals(c11029p != null ? c11029p.getCom.mapbox.common.HttpHeaders.DATE java.lang.String() : null)) {
            C28621h1 c28621h1 = (C28621h1) interfaceC28593a1;
            c28621h1.m87025y(c28621h1.m87024x() + 1);
            m37947p(interfaceC28593a2, m37946o(interfaceC28593a2) - 1);
        } else {
            C11029p c11029p2 = c11020g.m29597c().get(Integer.valueOf(m37946o(interfaceC28593a2) + 1));
            if (str.equals(c11029p2 != null ? c11029p2.getCom.mapbox.common.HttpHeaders.DATE java.lang.String() : null)) {
                C28621h1 c28621h2 = (C28621h1) interfaceC28593a1;
                int iM87024x = c28621h2.m87024x() - 1;
                if (iM87024x < 0) {
                    iM87024x = 0;
                }
                c28621h2.m87025y(iM87024x);
                m37947p(interfaceC28593a2, m37946o(interfaceC28593a2) + 1);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m37951t(int i13, InterfaceC28593a1 interfaceC28593a1, InterfaceC28593a1 interfaceC28593a2, int i14) {
        int i15 = i13 - i14;
        ((C28621h1) interfaceC28593a1).m87025y(i15 - 1);
        m37947p(interfaceC28593a2, i13 - i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m37952u(C15493c c15493c, C39967p c39967p, int i13, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 17) != 16)) {
            boolean zM87153g = c28655q.m87153g(c39967p);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C13411f(c39967p, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15492b.m43693d(c15493c, 1.0f, null, (Function1) objM87133R, null, c28655q, C15493c.f58150e | 48, 20);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m37953v(C39967p c39967p, Object argument) {
        AbstractC22676k.m65750j(argument, "argument");
        C22325e c22325e = argument instanceof C22325e ? (C22325e) argument : null;
        if (c22325e != null && !((C22325e) argument).getIsFutureDay()) {
            String str = c22325e.getCom.mapbox.common.HttpHeaders.DATE java.lang.String().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            if (c39967p.contains(str)) {
                c39967p.remove(str);
            } else {
                AbstractC22676k.m65747g(str);
                c39967p.add(str);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m37954w(Function1 function1, C11020g c11020g, C39967p c39967p) {
        function1.invoke(new AbstractC11022i.d(c11020g.getNextId(), new C40925b(c39967p, null, null, null, null, null, null, 126, null)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m37955x(Function1 function1, C11020g c11020g, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC11022i.f(c11020g.getSkipNextId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m37956y(Function1 function1) {
        function1.invoke(AbstractC11022i.a.f34542a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m37957z(C11020g c11020g, InterfaceC41070a interfaceC41070a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m37944m(c11020g, interfaceC41070a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
