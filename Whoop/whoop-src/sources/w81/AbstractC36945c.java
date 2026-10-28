package w81;

import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.viewpager2.widget.ViewPager2;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.C19254a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p292l1.C23151p0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p602x1.C37816b;
import p707gt1.C16201o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31915d;
import rm1.C31598l;
import w01.C36680e;

/* JADX INFO: renamed from: w81.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ak\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\u0018\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "pageCount", "currentPage", "Lkotlin/Function1;", "Ll83/a0;", "onPageUpdate", "Lw81/d;", "onPageStateChanged", "pageContents", "i", "(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "currentContents", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36945c {
    /* JADX WARN: Code duplicated, block: B:102:0x0140 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:108:0x0157  */
    /* JADX WARN: Code duplicated, block: B:109:0x015a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0167  */
    /* JADX WARN: Code duplicated, block: B:115:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0173  */
    /* JADX WARN: Code duplicated, block: B:118:0x0188  */
    /* JADX WARN: Code duplicated, block: B:121:0x0196  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:0x0108  */
    /* JADX WARN: Code duplicated, block: B:90:0x0116  */
    /* JADX WARN: Code duplicated, block: B:91:0x0119  */
    /* JADX WARN: Code duplicated, block: B:94:0x0126  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129  */
    /* JADX WARN: Code duplicated, block: B:98:0x0134  */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    /* JADX INFO: renamed from: i */
    public static final void m118620i(Modifier modifier, int i13, int i14, Function1 function1, Function1 function2, Function3 pageContents, Composer composer, int i15, int i16) {
        Modifier modifier2;
        int i17;
        int i18;
        int i19;
        Function1 function3;
        int i24;
        int i25;
        int i26;
        boolean z4;
        Modifier modifier3;
        int i27;
        Function1 function4;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        int i28;
        C28676v0 c28676v0;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        int i29;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        boolean z17;
        boolean zM87153g;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        int i34;
        AbstractC22676k.m65750j(pageContents, "pageContents");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(145216355);
        int i35 = i16 & 1;
        if (i35 != 0) {
            i17 = i15 | 6;
            modifier2 = modifier;
        } else if ((i15 & 6) == 0) {
            modifier2 = modifier;
            i17 = (c28655q.m87153g(modifier2) ? 4 : 2) | i15;
        } else {
            modifier2 = modifier;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        int i36 = i16 & 4;
        if (i36 == 0) {
            if ((i15 & 384) == 0) {
                i18 = i14;
                i17 |= c28655q.m87149e(i18) ? 256 : 128;
            }
            i19 = i16 & 8;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    function3 = function1;
                    if (c28655q.m87157i(function3)) {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i17 |= i24;
                }
                i25 = i16 & 16;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        if (c28655q.m87157i(function2)) {
                            i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i26 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i17 |= i26;
                    }
                    if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(pageContents)) {
                            i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i17 |= i34;
                    }
                    if ((i17 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i17 & 1, z4)) {
                        if (i35 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i36 != 0) {
                            i28 = 0;
                        } else {
                            i28 = i18;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i19 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C36680e(20);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function4 = (Function1) objM87133R5;
                        } else {
                            function4 = function3;
                        }
                        if (i25 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C36680e(21);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function5 = (Function1) objM87133R4;
                        } else {
                            function5 = function2;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11895b.m32005x(i28, c28655q);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(pageContents, c28655q);
                        i29 = i17 & 112;
                        if (i29 == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean zM87153g2 = z13 | c28655q.m87153g(interfaceC28601c1M87238F);
                        if ((i17 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z18 = z14 | zM87153g2;
                        if ((57344 & i17) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z18 | z15;
                        objM87133R2 = c28655q.m87133R();
                        if (!z16 || objM87133R2 == c28676v0) {
                            interfaceC28601c2 = interfaceC28601c1;
                            C23151p0 c23151p0 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                            c28655q.m87172p0(c23151p0);
                            objM87133R2 = c23151p0;
                        } else {
                            interfaceC28601c2 = interfaceC28601c1;
                        }
                        Function1 function6 = (Function1) objM87133R2;
                        if (i29 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = z17 | c28655q.m87153g(interfaceC28601c1M87238F) | ((i17 & 896) == 256);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g || objM87133R3 == c28676v0) {
                            objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC1137a.m3601a(function6, modifier3, (Function1) objM87133R3, c28655q, (i17 << 3) & 112, 0);
                        i27 = i28;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        i27 = i18;
                        function4 = function3;
                        function5 = function2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C31598l(modifier3, i13, i27, function4, function5, pageContents, i15, i16);
                    }
                }
                i17 |= 24576;
                if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(pageContents)) {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i17 |= i34;
                }
                if ((i17 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i17 & 1, z4)) {
                    if (i35 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i36 != 0) {
                        i28 = 0;
                    } else {
                        i28 = i18;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C36680e(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function3;
                    }
                    if (i25 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C36680e(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function5 = (Function1) objM87133R4;
                    } else {
                        function5 = function2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11895b.m32005x(i28, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(pageContents, c28655q);
                    i29 = i17 & 112;
                    if (i29 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean zM87153g3 = z13 | c28655q.m87153g(interfaceC28601c1M87238F);
                    if ((i17 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z19 = z14 | zM87153g3;
                    if ((57344 & i17) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z19 | z15;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        interfaceC28601c2 = interfaceC28601c1;
                        C23151p0 c23151p1 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                        c28655q.m87172p0(c23151p1);
                        objM87133R2 = c23151p1;
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        C23151p0 c23151p2 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                        c28655q.m87172p0(c23151p2);
                        objM87133R2 = c23151p2;
                    }
                    Function1 function7 = (Function1) objM87133R2;
                    if (i29 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = z17 | c28655q.m87153g(interfaceC28601c1M87238F) | ((i17 & 896) == 256);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC1137a.m3601a(function7, modifier3, (Function1) objM87133R3, c28655q, (i17 << 3) & 112, 0);
                    i27 = i28;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    i27 = i18;
                    function4 = function3;
                    function5 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C31598l(modifier3, i13, i27, function4, function5, pageContents, i15, i16);
                }
            }
            i17 |= 3072;
            function3 = function1;
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    if (c28655q.m87157i(function2)) {
                        i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i26 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i17 |= i26;
                }
                if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(pageContents)) {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i17 |= i34;
                }
                if ((i17 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i17 & 1, z4)) {
                    if (i35 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i36 != 0) {
                        i28 = 0;
                    } else {
                        i28 = i18;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C36680e(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function3;
                    }
                    if (i25 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C36680e(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function5 = (Function1) objM87133R4;
                    } else {
                        function5 = function2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11895b.m32005x(i28, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(pageContents, c28655q);
                    i29 = i17 & 112;
                    if (i29 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean zM87153g4 = z13 | c28655q.m87153g(interfaceC28601c1M87238F);
                    if ((i17 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z110 = z14 | zM87153g4;
                    if ((57344 & i17) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z110 | z15;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        interfaceC28601c2 = interfaceC28601c1;
                        C23151p0 c23151p3 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                        c28655q.m87172p0(c23151p3);
                        objM87133R2 = c23151p3;
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        C23151p0 c23151p4 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                        c28655q.m87172p0(c23151p4);
                        objM87133R2 = c23151p4;
                    }
                    Function1 function8 = (Function1) objM87133R2;
                    if (i29 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = z17 | c28655q.m87153g(interfaceC28601c1M87238F) | ((i17 & 896) == 256);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC1137a.m3601a(function8, modifier3, (Function1) objM87133R3, c28655q, (i17 << 3) & 112, 0);
                    i27 = i28;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    i27 = i18;
                    function4 = function3;
                    function5 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C31598l(modifier3, i13, i27, function4, function5, pageContents, i15, i16);
                }
            }
            i17 |= 24576;
            if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(pageContents)) {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i17 |= i34;
            }
            if ((i17 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i17 & 1, z4)) {
                if (i35 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i36 != 0) {
                    i28 = 0;
                } else {
                    i28 = i18;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C36680e(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function3;
                }
                if (i25 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C36680e(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function5 = (Function1) objM87133R4;
                } else {
                    function5 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11895b.m32005x(i28, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(pageContents, c28655q);
                i29 = i17 & 112;
                if (i29 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87153g5 = z13 | c28655q.m87153g(interfaceC28601c1M87238F);
                if ((i17 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z111 = z14 | zM87153g5;
                if ((57344 & i17) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z111 | z15;
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    interfaceC28601c2 = interfaceC28601c1;
                    C23151p0 c23151p5 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                    c28655q.m87172p0(c23151p5);
                    objM87133R2 = c23151p5;
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    C23151p0 c23151p6 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                    c28655q.m87172p0(c23151p6);
                    objM87133R2 = c23151p6;
                }
                Function1 function9 = (Function1) objM87133R2;
                if (i29 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g = z17 | c28655q.m87153g(interfaceC28601c1M87238F) | ((i17 & 896) == 256);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC1137a.m3601a(function9, modifier3, (Function1) objM87133R3, c28655q, (i17 << 3) & 112, 0);
                i27 = i28;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                i27 = i18;
                function4 = function3;
                function5 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31598l(modifier3, i13, i27, function4, function5, pageContents, i15, i16);
            }
        }
        i17 |= 384;
        i18 = i14;
        i19 = i16 & 8;
        if (i19 != 0) {
            if ((i15 & 3072) == 0) {
                function3 = function1;
                if (c28655q.m87157i(function3)) {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i17 |= i24;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    if (c28655q.m87157i(function2)) {
                        i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i26 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i17 |= i26;
                }
                if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(pageContents)) {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i17 |= i34;
                }
                if ((i17 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i17 & 1, z4)) {
                    if (i35 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i36 != 0) {
                        i28 = 0;
                    } else {
                        i28 = i18;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C36680e(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function3;
                    }
                    if (i25 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C36680e(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function5 = (Function1) objM87133R4;
                    } else {
                        function5 = function2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11895b.m32005x(i28, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(pageContents, c28655q);
                    i29 = i17 & 112;
                    if (i29 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean zM87153g6 = z13 | c28655q.m87153g(interfaceC28601c1M87238F);
                    if ((i17 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z112 = z14 | zM87153g6;
                    if ((57344 & i17) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z112 | z15;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        interfaceC28601c2 = interfaceC28601c1;
                        C23151p0 c23151p7 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                        c28655q.m87172p0(c23151p7);
                        objM87133R2 = c23151p7;
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        C23151p0 c23151p8 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                        c28655q.m87172p0(c23151p8);
                        objM87133R2 = c23151p8;
                    }
                    Function1 function10 = (Function1) objM87133R2;
                    if (i29 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = z17 | c28655q.m87153g(interfaceC28601c1M87238F) | ((i17 & 896) == 256);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC1137a.m3601a(function10, modifier3, (Function1) objM87133R3, c28655q, (i17 << 3) & 112, 0);
                    i27 = i28;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    i27 = i18;
                    function4 = function3;
                    function5 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C31598l(modifier3, i13, i27, function4, function5, pageContents, i15, i16);
                }
            }
            i17 |= 24576;
            if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(pageContents)) {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i17 |= i34;
            }
            if ((i17 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i17 & 1, z4)) {
                if (i35 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i36 != 0) {
                    i28 = 0;
                } else {
                    i28 = i18;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C36680e(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function3;
                }
                if (i25 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C36680e(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function5 = (Function1) objM87133R4;
                } else {
                    function5 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11895b.m32005x(i28, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(pageContents, c28655q);
                i29 = i17 & 112;
                if (i29 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87153g7 = z13 | c28655q.m87153g(interfaceC28601c1M87238F);
                if ((i17 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z113 = z14 | zM87153g7;
                if ((57344 & i17) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z113 | z15;
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    interfaceC28601c2 = interfaceC28601c1;
                    C23151p0 c23151p9 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                    c28655q.m87172p0(c23151p9);
                    objM87133R2 = c23151p9;
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    C23151p0 c23151p10 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                    c28655q.m87172p0(c23151p10);
                    objM87133R2 = c23151p10;
                }
                Function1 function11 = (Function1) objM87133R2;
                if (i29 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g = z17 | c28655q.m87153g(interfaceC28601c1M87238F) | ((i17 & 896) == 256);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC1137a.m3601a(function11, modifier3, (Function1) objM87133R3, c28655q, (i17 << 3) & 112, 0);
                i27 = i28;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                i27 = i18;
                function4 = function3;
                function5 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31598l(modifier3, i13, i27, function4, function5, pageContents, i15, i16);
            }
        }
        i17 |= 3072;
        function3 = function1;
        i25 = i16 & 16;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                if (c28655q.m87157i(function2)) {
                    i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i26 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i17 |= i26;
            }
            if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(pageContents)) {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i17 |= i34;
            }
            if ((i17 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i17 & 1, z4)) {
                if (i35 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i36 != 0) {
                    i28 = 0;
                } else {
                    i28 = i18;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C36680e(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function3;
                }
                if (i25 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C36680e(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function5 = (Function1) objM87133R4;
                } else {
                    function5 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11895b.m32005x(i28, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(pageContents, c28655q);
                i29 = i17 & 112;
                if (i29 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87153g8 = z13 | c28655q.m87153g(interfaceC28601c1M87238F);
                if ((i17 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z114 = z14 | zM87153g8;
                if ((57344 & i17) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z114 | z15;
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    interfaceC28601c2 = interfaceC28601c1;
                    C23151p0 c23151p11 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                    c28655q.m87172p0(c23151p11);
                    objM87133R2 = c23151p11;
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    C23151p0 c23151p12 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                    c28655q.m87172p0(c23151p12);
                    objM87133R2 = c23151p12;
                }
                Function1 function12 = (Function1) objM87133R2;
                if (i29 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g = z17 | c28655q.m87153g(interfaceC28601c1M87238F) | ((i17 & 896) == 256);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC1137a.m3601a(function12, modifier3, (Function1) objM87133R3, c28655q, (i17 << 3) & 112, 0);
                i27 = i28;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                i27 = i18;
                function4 = function3;
                function5 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31598l(modifier3, i13, i27, function4, function5, pageContents, i15, i16);
            }
        }
        i17 |= 24576;
        if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87157i(pageContents)) {
                i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i17 |= i34;
        }
        if ((i17 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i17 & 1, z4)) {
            if (i35 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i36 != 0) {
                i28 = 0;
            } else {
                i28 = i18;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C36680e(20);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function3;
            }
            if (i25 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C36680e(21);
                    c28655q.m87172p0(objM87133R4);
                }
                function5 = (Function1) objM87133R4;
            } else {
                function5 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11895b.m32005x(i28, c28655q);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(pageContents, c28655q);
            i29 = i17 & 112;
            if (i29 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean zM87153g9 = z13 | c28655q.m87153g(interfaceC28601c1M87238F);
            if ((i17 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z115 = z14 | zM87153g9;
            if ((57344 & i17) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z115 | z15;
            objM87133R2 = c28655q.m87133R();
            if (z16) {
                interfaceC28601c2 = interfaceC28601c1;
                C23151p0 c23151p13 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                c28655q.m87172p0(c23151p13);
                objM87133R2 = c23151p13;
            } else {
                interfaceC28601c2 = interfaceC28601c1;
                C23151p0 c23151p14 = new C23151p0(i13, interfaceC28601c1M87238F, interfaceC28601c2, function4, function5);
                c28655q.m87172p0(c23151p14);
                objM87133R2 = c23151p14;
            }
            Function1 function13 = (Function1) objM87133R2;
            if (i29 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87153g = z17 | c28655q.m87153g(interfaceC28601c1M87238F) | ((i17 & 896) == 256);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C19254a(i13, i28, interfaceC28601c2, interfaceC28601c1M87238F);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC1137a.m3601a(function13, modifier3, (Function1) objM87133R3, c28655q, (i17 << 3) & 112, 0);
            i27 = i28;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            i27 = i18;
            function4 = function3;
            function5 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31598l(modifier3, i13, i27, function4, function5, pageContents, i15, i16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m118621j(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m118622k(EnumC36946d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final Function3 m118623l(InterfaceC28670t2 interfaceC28670t2) {
        return (Function3) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final ViewPager2 m118624m(int i13, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, Function1 function1, Function1 function2, Context context) {
        AbstractC22676k.m65750j(context, "context");
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setAdapter(new C36943a(i13, new C37816b(new C16201o(interfaceC28670t2, 6), true, 955667092)));
        viewPager2.m5508b(new C36944b(new C31915d((Object) interfaceC28601c1, (Object) viewPager2, (Object) function1, (Object) function2, 22)));
        return viewPager2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m118625n(InterfaceC28670t2 interfaceC28670t2, int i13, Composer composer, int i14) {
        if ((i14 & 6) == 0) {
            i14 |= ((C28655q) composer).m87149e(i13) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            m118623l(interfaceC28670t2).invoke(Integer.valueOf(i13), c28655q, Integer.valueOf(i14 & 14));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m118626o(InterfaceC28601c1 interfaceC28601c1, ViewPager2 viewPager2, Function1 function1, Function1 function2, int i13) {
        if (((Number) interfaceC28601c1.getValue()).intValue() != viewPager2.getCurrentItem() && i13 == 0) {
            function1.invoke(Integer.valueOf(viewPager2.getCurrentItem()));
            interfaceC28601c1.setValue(Integer.valueOf(viewPager2.getCurrentItem()));
        }
        function2.invoke(EnumC36946d.INSTANCE.m118630a(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m118627p(int i13, int i14, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, ViewPager2 viewPager) {
        AbstractC22676k.m65750j(viewPager, "viewPager");
        AbstractC1692i1 adapter = viewPager.getAdapter();
        if (adapter == null || adapter.getPageCount() != i13) {
            viewPager.setAdapter(new C36943a(i13, new C37816b(new C16201o(interfaceC28670t2, 5), true, -1998213921)));
        }
        if (viewPager.getCurrentItem() != i14) {
            viewPager.m5510d(i14, false);
        }
        interfaceC28601c1.setValue(Integer.valueOf(i14));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m118628q(InterfaceC28670t2 interfaceC28670t2, int i13, Composer composer, int i14) {
        if ((i14 & 6) == 0) {
            i14 |= ((C28655q) composer).m87149e(i13) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            m118623l(interfaceC28670t2).invoke(Integer.valueOf(i13), c28655q, Integer.valueOf(i14 & 14));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m118629r(Modifier modifier, int i13, int i14, Function1 function1, Function1 function2, Function3 function3, int i15, int i16, Composer composer, int i17) {
        m118620i(modifier, i13, i14, function1, function2, function3, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }
}
