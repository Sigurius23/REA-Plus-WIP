package i21;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bu2.C3661v;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e81.C12830h;
import gz0.EnumC16313m0;
import h02.C16576i;
import hg3.AbstractC17269i;
import hu1.C17650g;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import i01.C17841d;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
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
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y11.AbstractC39061n;
import y11.C39065r;

/* JADX INFO: renamed from: i21.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\u001aS\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aQ\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "title", "Li2/x;", "titleColor", "Ly11/r;", "horizontalImpactBarViewState", "Li21/l$a;", "impactCardType", "Lkotlin/Function1;", "Ljava/util/UUID;", "Ll83/a0;", "onViewEvent", "g", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "hideTitle", "subtitle", "Ly81/f;", "subtitleColor", "Lhy0/h1;", "autoDetectedTagState", "", "trailingTagStateList", "n", "(Lcom/whoop/design/util/TextResource;JZLcom/whoop/design/util/TextResource;Ly81/f;Lhy0/h1;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "label", "labelColor", "l", "(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17993c {
    /* JADX WARN: Code duplicated, block: B:101:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x0145  */
    /* JADX WARN: Code duplicated, block: B:105:0x0166  */
    /* JADX WARN: Code duplicated, block: B:107:0x0172  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:112:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:94:0x0128  */
    /* JADX WARN: Code duplicated, block: B:98:0x0135  */
    /* JADX INFO: renamed from: g */
    public static final void m51603g(Modifier modifier, TextResource textResource, long j7, C39065r horizontalImpactBarViewState, InterfaceC18002l.a impactCardType, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        TextResource textResource2;
        long brandWhite;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        TextResource textResourceM21267a;
        long j13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        Modifier modifier4;
        Modifier modifier5;
        int i17;
        Object objM87133R;
        Function1 function4;
        boolean zM87157i;
        Object objM87133R2;
        EnumC39333f enumC39333fM51645b;
        C13825t c13825tM48880a;
        AbstractC22676k.m65750j(horizontalImpactBarViewState, "horizontalImpactBarViewState");
        AbstractC22676k.m65750j(impactCardType, "impactCardType");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(404368901);
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
            if ((i14 & 2) == 0) {
                textResource2 = textResource;
                int i19 = c28655q2.m87153g(textResource2) ? 32 : 16;
                i15 |= i19;
            } else {
                textResource2 = textResource;
            }
            i15 |= i19;
        } else {
            textResource2 = textResource;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                brandWhite = j7;
                int i24 = c28655q2.m87151f(brandWhite) ? 256 : 128;
                i15 |= i24;
            } else {
                brandWhite = j7;
            }
            i15 |= i24;
        } else {
            brandWhite = j7;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(horizontalImpactBarViewState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(impactCardType) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i25 = i14 & 32;
        if (i25 == 0) {
            if ((196608 & i13) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                i16 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0 || c28655q2.m87118C()) {
                    if (i18 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i14 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -113;
                    } else {
                        textResourceM21267a = textResource2;
                    }
                    if ((i14 & 4) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i15 &= -897;
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C17650g(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        modifier5 = modifier4;
                        i17 = i15;
                        long j14 = brandWhite;
                        function4 = (Function1) objM87133R;
                        j13 = j14;
                    } else {
                        modifier5 = modifier4;
                        i17 = i15;
                    }
                    c28655q2.m87175r();
                    zM87157i = ((i17 & 458752) == 131072) | c28655q2.m87157i(impactCardType);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new C17841d(function4, impactCardType, 2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3362g = AbstractC1092a.m3362g(modifier5, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    Modifier modifier6 = modifier5;
                    enumC39333fM51645b = impactCardType.getBorderColor();
                    if (enumC39333fM51645b == null) {
                        c28655q2.m87150e0(-828883298);
                        c28655q2.m87173q(false);
                        c13825tM48880a = null;
                    } else {
                        c28655q2.m87150e0(-828883297);
                        c13825tM48880a = AbstractC17269i.m48880a(((float) 0.375d) * 4, enumC39333fM51645b.mo134584toComposableColorWaAFU9c(c28655q2, 0));
                        c28655q2.m87173q(false);
                    }
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(modifierM3362g, null, 0L, null, c13825tM48880a, null, 0.0f, AbstractC37817c.m121344e(1479302549, c28655q2, new C12830h(impactCardType, textResourceM21267a, j13, horizontalImpactBarViewState)), c28655q, 12582912, 110);
                    function3 = function4;
                    modifier3 = modifier6;
                } else {
                    c28655q2.m87138X();
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                    modifier5 = modifier2;
                    i17 = i15;
                    textResourceM21267a = textResource2;
                }
                j13 = brandWhite;
                function4 = function2;
                c28655q2.m87175r();
                zM87157i = ((i17 & 458752) == 131072) | c28655q2.m87157i(impactCardType);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C17841d(function4, impactCardType, 2);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C17841d(function4, impactCardType, 2);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifier5, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                Modifier modifier7 = modifier5;
                enumC39333fM51645b = impactCardType.getBorderColor();
                if (enumC39333fM51645b == null) {
                    c28655q2.m87150e0(-828883298);
                    c28655q2.m87173q(false);
                    c13825tM48880a = null;
                } else {
                    c28655q2.m87150e0(-828883297);
                    c13825tM48880a = AbstractC17269i.m48880a(((float) 0.375d) * 4, enumC39333fM51645b.mo134584toComposableColorWaAFU9c(c28655q2, 0));
                    c28655q2.m87173q(false);
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(modifierM3362g2, null, 0L, null, c13825tM48880a, null, 0.0f, AbstractC37817c.m121344e(1479302549, c28655q2, new C12830h(impactCardType, textResourceM21267a, j13, horizontalImpactBarViewState)), c28655q, 12582912, 110);
                function3 = function4;
                modifier3 = modifier7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                textResourceM21267a = textResource2;
                j13 = brandWhite;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3661v(modifier3, textResourceM21267a, j13, horizontalImpactBarViewState, impactCardType, function3, i13, i14, 1);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function2 = function1;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            i16 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 2) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -113;
                } else {
                    textResourceM21267a = textResource2;
                }
                if ((i14 & 4) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    i15 &= -897;
                }
                if (i25 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C17650g(15);
                        c28655q2.m87172p0(objM87133R);
                    }
                    modifier5 = modifier4;
                    i17 = i15;
                    long j15 = brandWhite;
                    function4 = (Function1) objM87133R;
                    j13 = j15;
                } else {
                    modifier5 = modifier4;
                    i17 = i15;
                    j13 = brandWhite;
                    function4 = function2;
                }
            } else {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 2) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -113;
                } else {
                    textResourceM21267a = textResource2;
                }
                if ((i14 & 4) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    i15 &= -897;
                }
                if (i25 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C17650g(15);
                        c28655q2.m87172p0(objM87133R);
                    }
                    modifier5 = modifier4;
                    i17 = i15;
                    long j16 = brandWhite;
                    function4 = (Function1) objM87133R;
                    j13 = j16;
                } else {
                    modifier5 = modifier4;
                    i17 = i15;
                    j13 = brandWhite;
                    function4 = function2;
                }
            }
            c28655q2.m87175r();
            zM87157i = ((i17 & 458752) == 131072) | c28655q2.m87157i(impactCardType);
            objM87133R2 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R2 = new C17841d(function4, impactCardType, 2);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C17841d(function4, impactCardType, 2);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifier5, false, null, null, (InterfaceC4339a) objM87133R2, 15);
            Modifier modifier8 = modifier5;
            enumC39333fM51645b = impactCardType.getBorderColor();
            if (enumC39333fM51645b == null) {
                c28655q2.m87150e0(-828883298);
                c28655q2.m87173q(false);
                c13825tM48880a = null;
            } else {
                c28655q2.m87150e0(-828883297);
                c13825tM48880a = AbstractC17269i.m48880a(((float) 0.375d) * 4, enumC39333fM51645b.mo134584toComposableColorWaAFU9c(c28655q2, 0));
                c28655q2.m87173q(false);
            }
            c28655q = c28655q2;
            AbstractC31926e.m99375j(modifierM3362g3, null, 0L, null, c13825tM48880a, null, 0.0f, AbstractC37817c.m121344e(1479302549, c28655q2, new C12830h(impactCardType, textResourceM21267a, j13, horizontalImpactBarViewState)), c28655q, 12582912, 110);
            function3 = function4;
            modifier3 = modifier8;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            textResourceM21267a = textResource2;
            j13 = brandWhite;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3661v(modifier3, textResourceM21267a, j13, horizontalImpactBarViewState, impactCardType, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m51604h(UUID it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m51605i(Function1 function1, InterfaceC18002l.a aVar) {
        function1.invoke(aVar.getImpactId());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m51606j(InterfaceC18002l.a aVar, TextResource textResource, long j7, C39065r c39065r, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * f13, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            m51610n(textResource, j7, aVar.getHideTitle(), aVar.getSubtitle(), aVar.getSubtitleColor(), aVar.getAutoDetectedTagState(), aVar.m51653j(), c28655q, 0);
            m51608l(aVar.getLabel(), aVar.getLabelColor(), c39065r, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m51607k(Modifier modifier, TextResource textResource, long j7, C39065r c39065r, InterfaceC18002l.a aVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m51603g(modifier, textResource, j7, c39065r, aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m51608l(TextResource label, EnumC39333f labelColor, C39065r horizontalImpactBarViewState, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(labelColor, "labelColor");
        AbstractC22676k.m65750j(horizontalImpactBarViewState, "horizontalImpactBarViewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(664663171);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(label) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87149e(labelColor.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(horizontalImpactBarViewState) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(3, 4, C2299e.f9108K, c28655q2, 54);
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
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            int i15 = i14 >> 3;
            AbstractC39061n.m124553f(new LayoutWeightElement(1.0f, true), horizontalImpactBarViewState, c28655q2, i15 & 112, 0);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(label, c28655q2, i14 & 14), null, labelColor.mo134584toComposableColorWaAFU9c(c28655q2, i15 & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN7(), null, c28655q2, 0, 0, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(label, labelColor, horizontalImpactBarViewState, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m51609m(TextResource textResource, EnumC39333f enumC39333f, C39065r c39065r, int i13, Composer composer, int i14) {
        m51608l(textResource, enumC39333f, c39065r, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
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
    /* JADX INFO: renamed from: n */
    public static final void m51610n(TextResource title, long j7, boolean z4, TextResource textResource, EnumC39333f subtitleColor, C17750h1 c17750h1, List<C17750h1> trailingTagStateList, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        InterfaceC4339a interfaceC4339a;
        boolean z13;
        C28655q c28655q2;
        ?? r10;
        C28655q c28655q3;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitleColor, "subtitleColor");
        AbstractC22676k.m65750j(trailingTagStateList, "trailingTagStateList");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(2121451052);
        if ((i13 & 6) == 0) {
            i14 = (c28655q4.m87153g(title) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q4.m87151f(j7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q4.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q4.m87153g(textResource) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q4.m87149e(subtitleColor.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q4.m87157i(c17750h1) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q4.m87157i(trailingTagStateList) ? 1048576 : 524288;
        }
        if (c28655q4.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
            int iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a2);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i4, c22994r1M66759a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N);
            int i15 = i14;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
            int iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, layoutWeightElement);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a2);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q4, c0209i5, interfaceC28653p1M87165m2);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N2);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            float f13 = 4;
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(2, f13, c2306l, c28655q4, 54);
            int iHashCode3 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3409f2);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a2);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q4, c0209i5, interfaceC28653p1M87165m3);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i = c0209i6;
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i);
            } else {
                c0209i = c0209i6;
            }
            AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N3);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode4 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, layoutWeightElement2);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a2);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q4, c0209i5, interfaceC28653p1M87165m4);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N4);
            if (z4) {
                c28655q4.m87150e0(293739623);
                C38072d c38072d = C38072d.f163053a;
                z13 = false;
                c0209i3 = c0209i4;
                c0209i2 = c0209i5;
                interfaceC4339a = interfaceC4339a2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(title, c28655q4, i15 & 14), AbstractC1092a.m3358c(c2314t, c38072d.m121949b(c28655q4, 6).getWhite20(), AbstractC17918w0.f69621a), c38072d.m121949b(c28655q4, 6).getTransparent(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                C28655q c28655q5 = c28655q4;
                c28655q5.m87173q(false);
                c28655q2 = c28655q5;
            } else {
                c0209i2 = c0209i5;
                c0209i3 = c0209i4;
                interfaceC4339a = interfaceC4339a2;
                z13 = false;
                c28655q4.m87150e0(294070145);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(title, c28655q4, i15 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q4, 6).getB1(), null, c28655q4, (i15 << 3) & 896, 0, 196602);
                C28655q c28655q6 = c28655q4;
                c28655q6.m87173q(false);
                c28655q2 = c28655q6;
            }
            c28655q2.m87173q(true);
            if (c17750h1 == null) {
                c28655q2.m87150e0(-461126717);
                c28655q2.m87173q(z13);
            } else {
                c28655q2.m87150e0(-461126716);
                AbstractC17746g1.m50872h(c17750h1, null, null, c28655q2, 0, 6);
                c28655q2.m87173q(z13);
            }
            c28655q2.m87173q(true);
            if (textResource == null) {
                c28655q2.m87150e0(-616717432);
                c28655q2.m87173q(z13);
                r10 = 1;
                c28655q3 = c28655q2;
            } else {
                c28655q2.m87150e0(-616717431);
                C28655q c28655q7 = c28655q2;
                r10 = 1;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q2, (i15 >> 9) & 14), null, subtitleColor.mo134584toComposableColorWaAFU9c(c28655q2, (i15 >> 12) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getB3(), null, c28655q7, 0, 0, 196602);
                C28655q c28655q8 = c28655q7;
                c28655q8.m87173q(z13);
                c28655q3 = c28655q8;
            }
            c28655q3.m87173q(r10);
            float f14 = ((float) r10) * f13;
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f14, c2314t));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f14, C2299e.f9112O), c2306l, c28655q3, 54);
            int iHashCode5 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, c2314t);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i3, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m5);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N5);
            c28655q3.m87150e0(438016784);
            Iterator<T> it = trailingTagStateList.iterator();
            while (it.hasNext()) {
                AbstractC17746g1.m50872h((C17750h1) it.next(), null, null, c28655q3, 0, 6);
            }
            c28655q3.m87173q(z13);
            C28655q c28655q9 = c28655q3;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.CARET_FORWARD.toWhoopIcon(), c28655q3, 6), null, AbstractC1102d.m3419p(f13 * f13, c2314t), C38072d.f163053a.m121949b(c28655q3, 6).getWhite50(), c28655q9, 432, 0);
            C28655q c28655q10 = c28655q9;
            c28655q10.m87173q(r10);
            c28655q10.m87173q(r10);
            c28655q = c28655q10;
        } else {
            c28655q4.m87138X();
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17992b(title, j7, z4, textResource, subtitleColor, c17750h1, trailingTagStateList, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m51611o(TextResource textResource, long j7, boolean z4, TextResource textResource2, EnumC39333f enumC39333f, C17750h1 c17750h1, List list, int i13, Composer composer, int i14) {
        m51610n(textResource, j7, z4, textResource2, enumC39333f, c17750h1, list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
