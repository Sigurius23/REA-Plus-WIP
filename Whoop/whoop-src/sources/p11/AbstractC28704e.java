package p11;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import bf0.C3195g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.profile.view.edit.C9788l;
import gy0.AbstractC16277f;
import gz0.AbstractC16315n0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import java.util.Iterator;
import jp1.C21859k;
import l83.C23454a0;
import n11.AbstractC26161a;
import n11.C26162b;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import ov2.C28402f;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p023ay.C2124a0;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p133f1.C13996z;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p725ot1.C28329e;
import q83.AbstractC30060g;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: p11.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001ac\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "isExpanded", "Lkotlin/Function0;", "Ll83/a0;", "onToggleExpand", "", "iconCollapsed", "iconExpanded", "collapsedContent", "expandedContent", "m", "(Landroidx/compose/ui/Modifier;ZLc93/a;Ljava/lang/String;Ljava/lang/String;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Lp11/f;", "state", "Lkotlin/Function1;", "", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/ui/Modifier;Lp11/f;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "chevronRotation", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28704e {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m87303A(Modifier modifier, C28705f c28705f, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m87326w(modifier, c28705f, z4, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ec A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x0110  */
    /* JADX WARN: Code duplicated, block: B:89:0x0114  */
    /* JADX WARN: Code duplicated, block: B:92:0x0171  */
    /* JADX WARN: Code duplicated, block: B:95:0x017c  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:99:0x01da  */
    /* JADX INFO: renamed from: m */
    public static final void m87316m(Modifier modifier, final boolean z4, final InterfaceC4339a onToggleExpand, String str, String str2, final InterfaceC4351m collapsedContent, final InterfaceC4351m expandedContent, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        String str3;
        int i16;
        int i17;
        boolean z13;
        InterfaceC4339a interfaceC4339a;
        final String str4;
        final Modifier modifier3;
        final String str5;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        final Modifier modifier4;
        final String str6;
        String str7;
        C37816b c37816bM121344e;
        boolean z14;
        Object objM87133R;
        final String str8;
        int i18;
        int i19;
        AbstractC22676k.m65750j(onToggleExpand, "onToggleExpand");
        AbstractC22676k.m65750j(collapsedContent, "collapsedContent");
        AbstractC22676k.m65750j(expandedContent, "expandedContent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(313144188);
        int i24 = i14 & 1;
        if (i24 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onToggleExpand) ? 256 : 128;
        }
        int i25 = i14 & 8;
        if (i25 == 0) {
            if ((i13 & 3072) == 0) {
                str3 = str;
                i15 |= c28655q.m87153g(str3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87153g(str2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(collapsedContent)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(expandedContent)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i15 |= i18;
                }
                if ((599187 & i15) != 599186) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i25 != 0) {
                        str6 = null;
                    } else {
                        str6 = str3;
                    }
                    if (i16 != 0) {
                        str7 = null;
                    } else {
                        str7 = str2;
                    }
                    c37816bM121344e = AbstractC37817c.m121344e(1255574279, c28655q, new C2124a0(z4, str6, str7, collapsedContent));
                    if (z4) {
                        Modifier modifier5 = modifier4;
                        interfaceC4339a = onToggleExpand;
                        c28655q.m87150e0(211545606);
                        c28655q.m87173q(false);
                        AbstractC31926e.m99375j(AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, modifier5), null, 3), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(-996291092, c28655q, new C21859k(interfaceC4339a, c37816bM121344e, expandedContent, 13)), c28655q, 12582912, 114);
                        modifier3 = modifier5;
                        str5 = str6;
                        str4 = str7;
                    } else {
                        c28655q.m87150e0(211208295);
                        Modifier modifierM3355a = AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, modifier4), null, 3);
                        z14 = (i15 & 896) == 256;
                        objM87133R = c28655q.m87133R();
                        if (z14 || objM87133R == C28635l.f115821a) {
                            objM87133R = new C28329e(onToggleExpand, 2);
                            c28655q.m87172p0(objM87133R);
                        }
                        str8 = str7;
                        AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3355a, false, null, null, (InterfaceC4339a) objM87133R, 15), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(462499121, c28655q, new C13996z(c37816bM121344e, 5)), c28655q, 12582912, 114);
                        c28655q.m87173q(false);
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        }
                        final int i26 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: p11.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i26) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC28704e.m87321r(modifier4, z4, onToggleExpand, str6, str8, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC28704e.m87325v(modifier4, z4, onToggleExpand, str6, str8, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                interfaceC4339a = onToggleExpand;
                c28655q.m87138X();
                str4 = str2;
                modifier3 = modifier2;
                str5 = str3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i27 = 1;
                    final InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
                    interfaceC4351m = new InterfaceC4351m() { // from class: p11.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i27) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC28704e.m87321r(modifier3, z4, interfaceC4339a2, str5, str4, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC28704e.m87325v(modifier3, z4, interfaceC4339a2, str5, str4, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i15 |= 24576;
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(collapsedContent)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(expandedContent)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i15 |= i18;
            }
            if ((599187 & i15) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i25 != 0) {
                    str6 = null;
                } else {
                    str6 = str3;
                }
                if (i16 != 0) {
                    str7 = null;
                } else {
                    str7 = str2;
                }
                c37816bM121344e = AbstractC37817c.m121344e(1255574279, c28655q, new C2124a0(z4, str6, str7, collapsedContent));
                if (z4) {
                    c28655q.m87150e0(211208295);
                    Modifier modifierM3355a2 = AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, modifier4), null, 3);
                    if ((i15 & 896) == 256) {
                    }
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        objM87133R = new C28329e(onToggleExpand, 2);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C28329e(onToggleExpand, 2);
                        c28655q.m87172p0(objM87133R);
                    }
                    str8 = str7;
                    AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3355a2, false, null, null, (InterfaceC4339a) objM87133R, 15), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(462499121, c28655q, new C13996z(c37816bM121344e, 5)), c28655q, 12582912, 114);
                    c28655q.m87173q(false);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i28 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: p11.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i28) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC28704e.m87321r(modifier4, z4, onToggleExpand, str6, str8, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC28704e.m87325v(modifier4, z4, onToggleExpand, str6, str8, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    Modifier modifier6 = modifier4;
                    interfaceC4339a = onToggleExpand;
                    c28655q.m87150e0(211545606);
                    c28655q.m87173q(false);
                    AbstractC31926e.m99375j(AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, modifier6), null, 3), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(-996291092, c28655q, new C21859k(interfaceC4339a, c37816bM121344e, expandedContent, 13)), c28655q, 12582912, 114);
                    modifier3 = modifier6;
                    str5 = str6;
                    str4 = str7;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            interfaceC4339a = onToggleExpand;
            c28655q.m87138X();
            str4 = str2;
            modifier3 = modifier2;
            str5 = str3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i29 = 1;
                final InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
                interfaceC4351m = new InterfaceC4351m() { // from class: p11.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i29) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC28704e.m87321r(modifier3, z4, interfaceC4339a3, str5, str4, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC28704e.m87325v(modifier3, z4, interfaceC4339a3, str5, str4, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 3072;
        str3 = str;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q.m87153g(str2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(collapsedContent)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(expandedContent)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i15 |= i18;
            }
            if ((599187 & i15) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i25 != 0) {
                    str6 = null;
                } else {
                    str6 = str3;
                }
                if (i16 != 0) {
                    str7 = null;
                } else {
                    str7 = str2;
                }
                c37816bM121344e = AbstractC37817c.m121344e(1255574279, c28655q, new C2124a0(z4, str6, str7, collapsedContent));
                if (z4) {
                    c28655q.m87150e0(211208295);
                    Modifier modifierM3355a3 = AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, modifier4), null, 3);
                    if ((i15 & 896) == 256) {
                    }
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        objM87133R = new C28329e(onToggleExpand, 2);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C28329e(onToggleExpand, 2);
                        c28655q.m87172p0(objM87133R);
                    }
                    str8 = str7;
                    AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3355a3, false, null, null, (InterfaceC4339a) objM87133R, 15), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(462499121, c28655q, new C13996z(c37816bM121344e, 5)), c28655q, 12582912, 114);
                    c28655q.m87173q(false);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i210 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: p11.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i210) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC28704e.m87321r(modifier4, z4, onToggleExpand, str6, str8, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC28704e.m87325v(modifier4, z4, onToggleExpand, str6, str8, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    Modifier modifier7 = modifier4;
                    interfaceC4339a = onToggleExpand;
                    c28655q.m87150e0(211545606);
                    c28655q.m87173q(false);
                    AbstractC31926e.m99375j(AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, modifier7), null, 3), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(-996291092, c28655q, new C21859k(interfaceC4339a, c37816bM121344e, expandedContent, 13)), c28655q, 12582912, 114);
                    modifier3 = modifier7;
                    str5 = str6;
                    str4 = str7;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            interfaceC4339a = onToggleExpand;
            c28655q.m87138X();
            str4 = str2;
            modifier3 = modifier2;
            str5 = str3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i211 = 1;
                final InterfaceC4339a interfaceC4339a4 = interfaceC4339a;
                interfaceC4351m = new InterfaceC4351m() { // from class: p11.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i211) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC28704e.m87321r(modifier3, z4, interfaceC4339a4, str5, str4, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC28704e.m87325v(modifier3, z4, interfaceC4339a4, str5, str4, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 24576;
        if ((196608 & i13) == 0) {
            if (c28655q.m87157i(collapsedContent)) {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i19;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q.m87157i(expandedContent)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i15 |= i18;
        }
        if ((599187 & i15) != 599186) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i24 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i25 != 0) {
                str6 = null;
            } else {
                str6 = str3;
            }
            if (i16 != 0) {
                str7 = null;
            } else {
                str7 = str2;
            }
            c37816bM121344e = AbstractC37817c.m121344e(1255574279, c28655q, new C2124a0(z4, str6, str7, collapsedContent));
            if (z4) {
                c28655q.m87150e0(211208295);
                Modifier modifierM3355a4 = AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, modifier4), null, 3);
                if ((i15 & 896) == 256) {
                }
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C28329e(onToggleExpand, 2);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C28329e(onToggleExpand, 2);
                    c28655q.m87172p0(objM87133R);
                }
                str8 = str7;
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3355a4, false, null, null, (InterfaceC4339a) objM87133R, 15), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(462499121, c28655q, new C13996z(c37816bM121344e, 5)), c28655q, 12582912, 114);
                c28655q.m87173q(false);
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                }
                final int i212 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: p11.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i212) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC28704e.m87321r(modifier4, z4, onToggleExpand, str6, str8, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC28704e.m87325v(modifier4, z4, onToggleExpand, str6, str8, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                Modifier modifier8 = modifier4;
                interfaceC4339a = onToggleExpand;
                c28655q.m87150e0(211545606);
                c28655q.m87173q(false);
                AbstractC31926e.m99375j(AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, modifier8), null, 3), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(-996291092, c28655q, new C21859k(interfaceC4339a, c37816bM121344e, expandedContent, 13)), c28655q, 12582912, 114);
                modifier3 = modifier8;
                str5 = str6;
                str4 = str7;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        interfaceC4339a = onToggleExpand;
        c28655q.m87138X();
        str4 = str2;
        modifier3 = modifier2;
        str5 = str3;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i213 = 1;
            final InterfaceC4339a interfaceC4339a5 = interfaceC4339a;
            interfaceC4351m = new InterfaceC4351m() { // from class: p11.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i213) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC28704e.m87321r(modifier3, z4, interfaceC4339a5, str5, str4, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC28704e.m87325v(modifier3, z4, interfaceC4339a5, str5, str4, collapsedContent, expandedContent, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m87317n(boolean z4, String str, String str2, InterfaceC4351m interfaceC4351m, Composer composer, int i13) throws XmlPullParserException, IOException {
        String strM92103Y;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(z4 ? 180.0f : 0.0f, null, "expandable_card_toggle_rotation", null, c28655q, 3072, 22);
            Integer numM46376a = AbstractC16315n0.m46376a(str);
            int iM46492g = (numM46376a == null && (numM46376a = AbstractC16315n0.m46376a(str2)) == null) ? C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretDown() : numM46376a.intValue();
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), 2 * f13, ((float) 2.5d) * f13);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
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
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC11895b.m32007z(0, interfaceC4351m, c28655q, true);
            float f14 = 4;
            Modifier modifierM5375L = AbstractC1772c1.m5375L(m87318o(interfaceC28670t2M30588b), AbstractC1102d.m3419p(f14 * f14, AbstractC1099a.m3394p(1 * f13, c2314t)));
            C27430e c27430eM107874S = AbstractC34132o.m107874S(iM46492g, c28655q, 6);
            if (z4) {
                c28655q.m87150e0(-531672270);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62367q0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-531558252);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62371r0);
                c28655q.m87173q(false);
            }
            AbstractC15005f3.m43108b(c27430eM107874S, strM92103Y, modifierM5375L, C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final float m87318o(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m87319p(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m87320q(InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            interfaceC4351m.invoke(c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m87321r(Modifier modifier, boolean z4, InterfaceC4339a interfaceC4339a, String str, String str2, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, int i13, int i14, Composer composer, int i15) {
        m87316m(modifier, z4, interfaceC4339a, str, str2, interfaceC4351m, interfaceC4351m2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m87322s(InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
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
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C28329e(interfaceC4339a, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(1979414310, c28655q, new C9788l(6, interfaceC4351m)), c28655q, 12582912, 114);
            float f13 = 8;
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3395q(c2314t, 2 * f13, f13 * 1.5f));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
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
            AbstractC11895b.m31978A(0, interfaceC4351m2, c28655q, true, true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m87323t(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m87324u(InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            interfaceC4351m.invoke(c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m87325v(Modifier modifier, boolean z4, InterfaceC4339a interfaceC4339a, String str, String str2, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, int i13, int i14, Composer composer, int i15) {
        m87316m(modifier, z4, interfaceC4339a, str, str2, interfaceC4351m, interfaceC4351m2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m87326w(Modifier modifier, final C28705f state, boolean z4, InterfaceC4339a onToggleExpand, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Function1 function2;
        final Function1 function3;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onToggleExpand, "onToggleExpand");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1865644754);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onToggleExpand) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i14 & 16;
        if (i17 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier3 = modifier;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C28402f(14);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            String strM87332c = state.getIconCollapsed();
            String strM87333e = state.getIconExpanded();
            final int i18 = 0;
            C37816b c37816bM121344e = AbstractC37817c.m121344e(1071913461, c28655q, new InterfaceC4351m() { // from class: p11.c
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i18;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i19) {
                        case 0:
                            return AbstractC28704e.m87328y(state, function3, composer2, iIntValue);
                        default:
                            return AbstractC28704e.m87329z(state, function3, composer2, iIntValue);
                    }
                }
            });
            final int i19 = 1;
            C37816b c37816bM121344e2 = AbstractC37817c.m121344e(-2059472650, c28655q, new InterfaceC4351m() { // from class: p11.c
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int i110 = i19;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i110) {
                        case 0:
                            return AbstractC28704e.m87328y(state, function3, composer2, iIntValue);
                        default:
                            return AbstractC28704e.m87329z(state, function3, composer2, iIntValue);
                    }
                }
            });
            int i24 = (i15 & 14) | 1769472;
            int i25 = i15 >> 3;
            m87316m(modifier3, z4, onToggleExpand, strM87332c, strM87333e, c37816bM121344e, c37816bM121344e2, c28655q, i24 | (i25 & 112) | (i25 & 896), 0);
            function2 = function3;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g((Object) modifier2, (Object) state, z4, (Object) onToggleExpand, function2, i13, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m87327x(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m87328y(C28705f c28705f, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC25312u interfaceC25312uM87331b = c28705f.getHeaderState();
            if (interfaceC25312uM87331b instanceof C26162b) {
                c28655q.m87150e0(-683311581);
                AbstractC26161a.m77698b((C26162b) interfaceC25312uM87331b, null, c28655q, 0, 2);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-683309186);
                AbstractC25303l.m74291r(interfaceC25312uM87331b, p720m91.Function1.m74307h(null, 1, null), null, function1, c28655q, 0, 4);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m87329z(C28705f c28705f, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 1 * f13, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13 * 1.5f), C2299e.f9110M, c28655q, 6);
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
            c28655q.m87150e0(-1391052219);
            Iterator<T> it = c28705f.m87330a().iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), p720m91.Function1.m74307h(null, 1, null), null, function1, c28655q, 0, 4);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
