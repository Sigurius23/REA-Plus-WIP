package kz2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c41.C4107r3;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9785i;
import gz0.AbstractC16319p0;
import io2.C20769k0;
import iy0.C21026a;
import java.util.List;
import jp1.C21852d;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import yw2.AbstractC39833e;

/* JADX INFO: renamed from: kz2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a/\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aY\u0010\u0013\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\r\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aU\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a_\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "supportText", "Ll83/a0;", "u", "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V", "title", "Lkotlin/Function0;", "onDisplayTimeElapsed", "r", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "v", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V", "primaryAction", "primaryButtonText", "secondaryAction", "secondaryButtonText", "body", "", "removeBackground", "n", "(Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V", "y", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V", "isLowSeverity", "l", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLandroidx/compose/runtime/Composer;II)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22926c {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m66660A(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m66661B(TextResource textResource, TextResource textResource2, TextResource textResource3, InterfaceC4339a interfaceC4339a, TextResource textResource4, InterfaceC4339a interfaceC4339a2, boolean z4, int i13, int i14, Composer composer, int i15) {
        m66686y(textResource, textResource2, textResource3, interfaceC4339a, textResource4, interfaceC4339a2, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0100  */
    /* JADX WARN: Code duplicated, block: B:82:0x0103  */
    /* JADX WARN: Code duplicated, block: B:85:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0110  */
    /* JADX WARN: Code duplicated, block: B:89:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0117  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:94:0x015b  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ad  */
    /* JADX INFO: renamed from: l */
    public static final void m66673l(TextResource title, TextResource supportText, TextResource primaryButtonText, InterfaceC4339a primaryAction, TextResource secondaryButtonText, InterfaceC4339a secondaryAction, boolean z4, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        boolean z14;
        int i17;
        boolean z15;
        boolean z16;
        boolean z17;
        C28677v1 c28677v1M87180u;
        boolean z18;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(supportText, "supportText");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        AbstractC22676k.m65750j(primaryAction, "primaryAction");
        AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
        AbstractC22676k.m65750j(secondaryAction, "secondaryAction");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-561480451);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(title) : c28655q.m87157i(title) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(supportText) : c28655q.m87157i(supportText) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(primaryButtonText) : c28655q.m87157i(primaryButtonText) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(primaryAction) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= (32768 & i13) == 0 ? c28655q.m87153g(secondaryButtonText) : c28655q.m87157i(secondaryButtonText) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(secondaryAction) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i18 = i14 & 64;
        if (i18 == 0) {
            if ((1572864 & i13) == 0) {
                i15 |= c28655q.m87155h(z4) ? 1048576 : 524288;
            }
            i16 = i14 & 128;
            if (i16 != 0) {
                if ((12582912 & i13) == 0) {
                    z14 = z13;
                    if (c28655q.m87155h(z14)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
                if ((4793491 & i15) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z4;
                    }
                    if (i16 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if (z16) {
                        c28655q.m87150e0(1833820520);
                        int i19 = TextResource.$stable;
                        m66686y(title, supportText, primaryButtonText, primaryAction, secondaryButtonText, secondaryAction, z18, c28655q, i19 | (i15 & 14) | (i19 << 3) | (i15 & 112) | (i19 << 6) | (i15 & 896) | (i15 & 7168) | (i19 << 12) | (i15 & 57344) | (i15 & 458752) | ((i15 >> 3) & 3670016), 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1834172401);
                        int i24 = i15 >> 9;
                        int i25 = TextResource.$stable;
                        int i26 = i15 >> 3;
                        int i27 = i15 << 12;
                        m66675n(primaryAction, primaryButtonText, secondaryAction, secondaryButtonText, title, supportText, z18, c28655q, (i24 & 896) | (i24 & 14) | (i25 << 3) | (i26 & 112) | (i25 << 9) | (i26 & 7168) | (i25 << 12) | (i27 & 57344) | (i25 << 15) | (i27 & 458752) | (i26 & 3670016), 0);
                        c28655q.m87173q(false);
                    }
                    z17 = z18;
                } else {
                    c28655q.m87138X();
                    z16 = z4;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(title, supportText, primaryButtonText, primaryAction, secondaryButtonText, secondaryAction, z16, z17, i13, i14);
                }
            }
            i15 |= 12582912;
            z14 = z13;
            if ((4793491 & i15) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z4;
                }
                if (i16 != 0) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                if (z16) {
                    c28655q.m87150e0(1833820520);
                    int i110 = TextResource.$stable;
                    m66686y(title, supportText, primaryButtonText, primaryAction, secondaryButtonText, secondaryAction, z18, c28655q, i110 | (i15 & 14) | (i110 << 3) | (i15 & 112) | (i110 << 6) | (i15 & 896) | (i15 & 7168) | (i110 << 12) | (i15 & 57344) | (i15 & 458752) | ((i15 >> 3) & 3670016), 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1834172401);
                    int i28 = i15 >> 9;
                    int i29 = TextResource.$stable;
                    int i210 = i15 >> 3;
                    int i211 = i15 << 12;
                    m66675n(primaryAction, primaryButtonText, secondaryAction, secondaryButtonText, title, supportText, z18, c28655q, (i28 & 896) | (i28 & 14) | (i29 << 3) | (i210 & 112) | (i29 << 9) | (i210 & 7168) | (i29 << 12) | (i211 & 57344) | (i29 << 15) | (i211 & 458752) | (i210 & 3670016), 0);
                    c28655q.m87173q(false);
                }
                z17 = z18;
            } else {
                c28655q.m87138X();
                z16 = z4;
                z17 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9785i(title, supportText, primaryButtonText, primaryAction, secondaryButtonText, secondaryAction, z16, z17, i13, i14);
            }
        }
        i15 |= 1572864;
        i16 = i14 & 128;
        if (i16 != 0) {
            if ((12582912 & i13) == 0) {
                z14 = z13;
                if (c28655q.m87155h(z14)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i15 |= i17;
            }
            if ((4793491 & i15) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z4;
                }
                if (i16 != 0) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                if (z16) {
                    c28655q.m87150e0(1833820520);
                    int i111 = TextResource.$stable;
                    m66686y(title, supportText, primaryButtonText, primaryAction, secondaryButtonText, secondaryAction, z18, c28655q, i111 | (i15 & 14) | (i111 << 3) | (i15 & 112) | (i111 << 6) | (i15 & 896) | (i15 & 7168) | (i111 << 12) | (i15 & 57344) | (i15 & 458752) | ((i15 >> 3) & 3670016), 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1834172401);
                    int i212 = i15 >> 9;
                    int i213 = TextResource.$stable;
                    int i214 = i15 >> 3;
                    int i215 = i15 << 12;
                    m66675n(primaryAction, primaryButtonText, secondaryAction, secondaryButtonText, title, supportText, z18, c28655q, (i212 & 896) | (i212 & 14) | (i213 << 3) | (i214 & 112) | (i213 << 9) | (i214 & 7168) | (i213 << 12) | (i215 & 57344) | (i213 << 15) | (i215 & 458752) | (i214 & 3670016), 0);
                    c28655q.m87173q(false);
                }
                z17 = z18;
            } else {
                c28655q.m87138X();
                z16 = z4;
                z17 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9785i(title, supportText, primaryButtonText, primaryAction, secondaryButtonText, secondaryAction, z16, z17, i13, i14);
            }
        }
        i15 |= 12582912;
        z14 = z13;
        if ((4793491 & i15) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i15 & 1, z15)) {
            if (i18 != 0) {
                z16 = false;
            } else {
                z16 = z4;
            }
            if (i16 != 0) {
                z18 = true;
            } else {
                z18 = z14;
            }
            if (z16) {
                c28655q.m87150e0(1833820520);
                int i112 = TextResource.$stable;
                m66686y(title, supportText, primaryButtonText, primaryAction, secondaryButtonText, secondaryAction, z18, c28655q, i112 | (i15 & 14) | (i112 << 3) | (i15 & 112) | (i112 << 6) | (i15 & 896) | (i15 & 7168) | (i112 << 12) | (i15 & 57344) | (i15 & 458752) | ((i15 >> 3) & 3670016), 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1834172401);
                int i216 = i15 >> 9;
                int i217 = TextResource.$stable;
                int i218 = i15 >> 3;
                int i219 = i15 << 12;
                m66675n(primaryAction, primaryButtonText, secondaryAction, secondaryButtonText, title, supportText, z18, c28655q, (i216 & 896) | (i216 & 14) | (i217 << 3) | (i218 & 112) | (i217 << 9) | (i218 & 7168) | (i217 << 12) | (i219 & 57344) | (i217 << 15) | (i219 & 458752) | (i218 & 3670016), 0);
                c28655q.m87173q(false);
            }
            z17 = z18;
        } else {
            c28655q.m87138X();
            z16 = z4;
            z17 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9785i(title, supportText, primaryButtonText, primaryAction, secondaryButtonText, secondaryAction, z16, z17, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m66674m(TextResource textResource, TextResource textResource2, TextResource textResource3, InterfaceC4339a interfaceC4339a, TextResource textResource4, InterfaceC4339a interfaceC4339a2, boolean z4, boolean z13, int i13, int i14, Composer composer, int i15) {
        m66673l(textResource, textResource2, textResource3, interfaceC4339a, textResource4, interfaceC4339a2, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015a  */
    /* JADX WARN: Code duplicated, block: B:101:0x015d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0169  */
    /* JADX WARN: Code duplicated, block: B:108:0x0179  */
    /* JADX WARN: Code duplicated, block: B:111:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0183  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0116 A[PHI: r3 r4 r6
      0x0116: PHI (r3v6 com.whoop.design.util.TextResource) = 
      (r3v2 com.whoop.design.util.TextResource)
      (r3v0 com.whoop.design.util.TextResource)
      (r3v0 com.whoop.design.util.TextResource)
     binds: [B:96:0x0137, B:87:0x0113, B:88:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r4v7 com.whoop.design.util.TextResource) = 
      (r4v2 com.whoop.design.util.TextResource)
      (r4v0 com.whoop.design.util.TextResource)
      (r4v0 com.whoop.design.util.TextResource)
     binds: [B:96:0x0137, B:87:0x0113, B:88:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r6v25 int) = (r6v18 int), (r6v26 int), (r6v27 int) binds: [B:96:0x0137, B:87:0x0113, B:88:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x011a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0121  */
    /* JADX WARN: Code duplicated, block: B:95:0x012e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0139  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static final void m66675n(InterfaceC4339a primaryAction, TextResource primaryButtonText, InterfaceC4339a secondaryAction, TextResource secondaryButtonText, TextResource textResource, TextResource textResource2, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        TextResource textResource3;
        TextResource textResource4;
        boolean z15;
        C28677v1 c28677v1M87180u;
        List list;
        TextResource textResource5;
        TextResource textResource6;
        Object[] objArr;
        Object objM87133R;
        boolean z16;
        Object objM87133R2;
        int i16;
        int i17;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        TextResource c8688b = textResource;
        TextResource c8688b2 = textResource2;
        AbstractC22676k.m65750j(primaryAction, "primaryAction");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        AbstractC22676k.m65750j(secondaryAction, "secondaryAction");
        AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1708225074);
        int i18 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(primaryAction) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(primaryButtonText) : c28655q.m87157i(primaryButtonText) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(secondaryAction) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q.m87153g(secondaryButtonText) : c28655q.m87157i(secondaryButtonText) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) != 0) {
                i17 = DfuBaseService.ERROR_REMOTE_MASK;
            } else {
                if ((32768 & i13) == 0 ? c28655q.m87153g(c8688b) : c28655q.m87157i(c8688b)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
            }
            i15 |= i17;
        }
        if ((196608 & i13) == 0) {
            if ((i14 & 32) != 0) {
                i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            } else {
                if ((262144 & i13) == 0 ? c28655q.m87153g(c8688b2) : c28655q.m87157i(c8688b2)) {
                    i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
            }
            i15 |= i16;
        }
        int i19 = i14 & 64;
        if (i19 == 0) {
            if ((1572864 & i13) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 1048576 : 524288;
            }
            if ((599187 & i15) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    list = null;
                    objArr4 = 0;
                    objArr3 = 0;
                    objArr2 = 0;
                    if ((i14 & 16) != 0) {
                        c8688b = new TextResource.C8688b(AbstractC39833e.f171733r, list, i18, objArr2 == true ? 1 : 0);
                        i15 &= -57345;
                    }
                    if ((i14 & 32) != 0) {
                        c8688b2 = new TextResource.C8688b(AbstractC39833e.f171732q, objArr3 == true ? 1 : 0, i18, objArr4 == true ? 1 : 0);
                        i15 &= -458753;
                    }
                    if (i19 != 0) {
                        textResource5 = c8688b;
                        textResource6 = c8688b2;
                        z13 = true;
                    }
                    c28655q.m87175r();
                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(textResource5, false, null, 6, null);
                    Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "ErrorModal");
                    if ((i15 & 14) == 4) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (objArr == true || objM87133R == c28676v0) {
                        objM87133R = new C21026a(primaryAction, 17);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    z16 = (i15 & 896) == 256;
                    objM87133R2 = c28655q.m87133R();
                    if (z16 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C21026a(secondaryAction, 18);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    int i24 = 805502976 | AbstractC33208p0.b.f138467h;
                    int i25 = TextResource.$stable;
                    AbstractC33199m0.m105214F(bVar, textResource6, null, primaryButtonText, interfaceC4339a, true, false, secondaryButtonText, interfaceC4339a2, modifierM3599a, z13, false, c28655q, i24 | (i25 << 3) | ((i15 >> 12) & 112) | (i25 << 9) | ((i15 << 6) & 7168) | (i25 << 21) | (29360128 & (i15 << 12)), (i15 >> 18) & 14, 2116);
                    textResource4 = textResource6;
                    textResource3 = textResource5;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 16) != 0) {
                        i15 &= -57345;
                    }
                    if ((i14 & 32) != 0) {
                        i15 &= -458753;
                    }
                }
                textResource5 = c8688b;
                textResource6 = c8688b2;
                c28655q.m87175r();
                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(textResource5, false, null, 6, null);
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(C2314t.f9131w, "ErrorModal");
                if ((i15 & 14) == 4) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v1 = C28635l.f115821a;
                if (objArr == true) {
                    objM87133R = new C21026a(primaryAction, 17);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C21026a(primaryAction, 17);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                if ((i15 & 896) == 256) {
                }
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    objM87133R2 = new C21026a(secondaryAction, 18);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C21026a(secondaryAction, 18);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                int i26 = 805502976 | AbstractC33208p0.b.f138467h;
                int i27 = TextResource.$stable;
                AbstractC33199m0.m105214F(bVar2, textResource6, null, primaryButtonText, interfaceC4339a3, true, false, secondaryButtonText, interfaceC4339a4, modifierM3599a2, z13, false, c28655q, i26 | (i27 << 3) | ((i15 >> 12) & 112) | (i27 << 9) | ((i15 << 6) & 7168) | (i27 << 21) | (29360128 & (i15 << 12)), (i15 >> 18) & 14, 2116);
                textResource4 = textResource6;
                textResource3 = textResource5;
            } else {
                c28655q.m87138X();
                textResource3 = c8688b;
                textResource4 = c8688b2;
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22925b(primaryAction, primaryButtonText, secondaryAction, secondaryButtonText, textResource3, textResource4, z15, i13, i14);
            }
        }
        i15 |= 1572864;
        z13 = z4;
        if ((599187 & i15) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                list = null;
                objArr4 = 0;
                objArr3 = 0;
                objArr2 = 0;
                if ((i14 & 16) != 0) {
                    c8688b = new TextResource.C8688b(AbstractC39833e.f171733r, list, i18, objArr2 == true ? 1 : 0);
                    i15 &= -57345;
                }
                if ((i14 & 32) != 0) {
                    c8688b2 = new TextResource.C8688b(AbstractC39833e.f171732q, objArr3 == true ? 1 : 0, i18, objArr4 == true ? 1 : 0);
                    i15 &= -458753;
                }
                if (i19 != 0) {
                    textResource5 = c8688b;
                    textResource6 = c8688b2;
                    z13 = true;
                } else {
                    textResource5 = c8688b;
                    textResource6 = c8688b2;
                }
            } else {
                list = null;
                objArr4 = 0;
                objArr3 = 0;
                objArr2 = 0;
                if ((i14 & 16) != 0) {
                    c8688b = new TextResource.C8688b(AbstractC39833e.f171733r, list, i18, objArr2 == true ? 1 : 0);
                    i15 &= -57345;
                }
                if ((i14 & 32) != 0) {
                    c8688b2 = new TextResource.C8688b(AbstractC39833e.f171732q, objArr3 == true ? 1 : 0, i18, objArr4 == true ? 1 : 0);
                    i15 &= -458753;
                }
                if (i19 != 0) {
                    textResource5 = c8688b;
                    textResource6 = c8688b2;
                    z13 = true;
                } else {
                    textResource5 = c8688b;
                    textResource6 = c8688b2;
                }
            }
            c28655q.m87175r();
            AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(textResource5, false, null, 6, null);
            Modifier modifierM3599a3 = AbstractC1136a.m3599a(C2314t.f9131w, "ErrorModal");
            if ((i15 & 14) == 4) {
                objArr = true;
            } else {
                objArr = false;
            }
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (objArr == true) {
                objM87133R = new C21026a(primaryAction, 17);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21026a(primaryAction, 17);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
            if ((i15 & 896) == 256) {
            }
            objM87133R2 = c28655q.m87133R();
            if (z16) {
                objM87133R2 = new C21026a(secondaryAction, 18);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C21026a(secondaryAction, 18);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
            int i28 = 805502976 | AbstractC33208p0.b.f138467h;
            int i29 = TextResource.$stable;
            AbstractC33199m0.m105214F(bVar3, textResource6, null, primaryButtonText, interfaceC4339a5, true, false, secondaryButtonText, interfaceC4339a6, modifierM3599a3, z13, false, c28655q, i28 | (i29 << 3) | ((i15 >> 12) & 112) | (i29 << 9) | ((i15 << 6) & 7168) | (i29 << 21) | (29360128 & (i15 << 12)), (i15 >> 18) & 14, 2116);
            textResource4 = textResource6;
            textResource3 = textResource5;
        } else {
            c28655q.m87138X();
            textResource3 = c8688b;
            textResource4 = c8688b2;
        }
        z15 = z13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22925b(primaryAction, primaryButtonText, secondaryAction, secondaryButtonText, textResource3, textResource4, z15, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m66676o(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m66677p(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m66678q(InterfaceC4339a interfaceC4339a, TextResource textResource, InterfaceC4339a interfaceC4339a2, TextResource textResource2, TextResource textResource3, TextResource textResource4, boolean z4, int i13, int i14, Composer composer, int i15) {
        m66675n(interfaceC4339a, textResource, interfaceC4339a2, textResource2, textResource3, textResource4, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX INFO: renamed from: r */
    public static final void m66679r(TextResource title, TextResource textResource, InterfaceC4339a onDisplayTimeElapsed, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q;
        TextResource textResource2;
        int i16;
        TextResource textResourceM21267a = textResource;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(onDisplayTimeElapsed, "onDisplayTimeElapsed");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2037046481);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(title) : c28655q2.m87157i(title) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) != 0) {
                i16 = 16;
            } else {
                if ((i13 & 64) == 0 ? c28655q2.m87153g(textResourceM21267a) : c28655q2.m87157i(textResourceM21267a)) {
                    i16 = 32;
                } else {
                    i16 = 16;
                }
            }
            i15 |= i16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onDisplayTimeElapsed) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                }
            } else if ((i14 & 2) != 0) {
                textResourceM21267a = AbstractC8693b.m21267a();
                i15 &= -113;
            }
            TextResource textResource3 = textResourceM21267a;
            int i17 = i15;
            c28655q2.m87175r();
            boolean z4 = (i17 & 896) == 256;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C21026a(onDisplayTimeElapsed, 19);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC33199m0.m105214F(new AbstractC33208p0.h(title, 0L, (InterfaceC4339a) objM87133R, 2, null), textResource3, null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3) | (i17 & 112), 6, 3068);
            textResource2 = textResource3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            textResource2 = textResourceM21267a;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(title, textResource2, onDisplayTimeElapsed, i13, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m66680s(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m66681t(TextResource textResource, TextResource textResource2, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m66679r(textResource, textResource2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX INFO: renamed from: u */
    public static final void m66682u(TextResource textResource, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        TextResource textResourceM21267a = textResource;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1451329417);
        if ((i13 & 6) == 0) {
            if ((i14 & 1) != 0) {
                i16 = 2;
            } else {
                if ((i13 & 8) == 0 ? c28655q.m87153g(textResourceM21267a) : c28655q.m87157i(textResourceM21267a)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
            }
            i15 = i16 | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                if ((i14 & 1) != 0) {
                    i15 &= -15;
                }
            } else if ((i14 & 1) != 0) {
                textResourceM21267a = AbstractC8693b.m21267a();
                i15 &= -15;
            }
            TextResource textResource2 = textResourceM21267a;
            c28655q.m87175r();
            AbstractC33199m0.m105214F(AbstractC33208p0.g.f138480e, textResource2, null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.g.f138481f | (TextResource.$stable << 3) | ((i15 << 3) & 112), 6, 3068);
            textResourceM21267a = textResource2;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4107r3(textResourceM21267a, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX INFO: renamed from: v */
    public static final void m66683v(TextResource title, TextResource textResource, Composer composer, int i13, int i14) {
        int i15;
        TextResource textResource2;
        int i16;
        TextResource textResourceM21267a = textResource;
        AbstractC22676k.m65750j(title, "title");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1041372388);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(title) : c28655q.m87157i(title) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) != 0) {
                i16 = 16;
            } else {
                if ((i13 & 64) == 0 ? c28655q.m87153g(textResourceM21267a) : c28655q.m87157i(textResourceM21267a)) {
                    i16 = 32;
                } else {
                    i16 = 16;
                }
            }
            i15 |= i16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                }
            } else if ((i14 & 2) != 0) {
                textResourceM21267a = AbstractC8693b.m21267a();
                i15 &= -113;
            }
            TextResource textResource3 = textResourceM21267a;
            c28655q.m87175r();
            AbstractC33199m0.m105214F(new AbstractC33208p0.e(title, AbstractC16319p0.m46430a().getStrap().getStrap()), textResource3, null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3) | (i15 & 112), 0, 4092);
            textResource2 = textResource3;
        } else {
            c28655q.m87138X();
            textResource2 = textResourceM21267a;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(title, i13, textResource2, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m66684w(TextResource textResource, int i13, int i14, Composer composer, int i15) {
        m66682u(textResource, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m66685x(TextResource textResource, TextResource textResource2, int i13, int i14, Composer composer, int i15) {
        m66683v(textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x0121  */
    /* JADX WARN: Code duplicated, block: B:88:0x0132  */
    /* JADX WARN: Code duplicated, block: B:92:0x013c  */
    /* JADX WARN: Code duplicated, block: B:94:0x017f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0189  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    public static final void m66686y(TextResource title, TextResource supportText, TextResource primaryButtonText, InterfaceC4339a primaryAction, TextResource secondaryButtonText, InterfaceC4339a secondaryAction, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        boolean z17;
        Object objM87133R;
        boolean z18;
        Object objM87133R2;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(supportText, "supportText");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        AbstractC22676k.m65750j(primaryAction, "primaryAction");
        AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
        AbstractC22676k.m65750j(secondaryAction, "secondaryAction");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1674496158);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(title) : c28655q.m87157i(title) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(supportText) : c28655q.m87157i(supportText) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(primaryButtonText) : c28655q.m87157i(primaryButtonText) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(primaryAction) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= (32768 & i13) == 0 ? c28655q.m87153g(secondaryButtonText) : c28655q.m87157i(secondaryButtonText) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(secondaryAction) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i17 = i14 & 64;
        if (i17 == 0) {
            if ((1572864 & i13) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 1048576 : 524288;
            }
            i16 = i15;
            if ((599187 & i16) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                if (i17 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                AbstractC33208p0.b bVar = new AbstractC33208p0.b(title, true, null, 4, null);
                Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "WarningModal");
                if ((i16 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z17 || objM87133R == c28676v0) {
                    objM87133R = new C21026a(primaryAction, 20);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                z18 = (458752 & i16) == 131072;
                objM87133R2 = c28655q.m87133R();
                if (z18 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C21026a(secondaryAction, 21);
                    c28655q.m87172p0(objM87133R2);
                }
                int i18 = 805502976 | AbstractC33208p0.b.f138467h;
                int i19 = TextResource.$stable;
                boolean z19 = z16;
                AbstractC33199m0.m105214F(bVar, supportText, null, primaryButtonText, interfaceC4339a, true, false, secondaryButtonText, (InterfaceC4339a) objM87133R2, modifierM3599a, z19, false, c28655q, i18 | (i19 << 3) | (i16 & 112) | (i19 << 9) | ((i16 << 3) & 7168) | (i19 << 21) | (29360128 & (i16 << 9)), (i16 >> 18) & 14, 2116);
                z15 = z19;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22925b(title, supportText, primaryButtonText, primaryAction, secondaryButtonText, secondaryAction, z15, i13, i14);
            }
        }
        i15 |= 1572864;
        z13 = z4;
        i16 = i15;
        if ((599187 & i16) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            if (i17 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(title, true, null, 4, null);
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(C2314t.f9131w, "WarningModal");
            if ((i16 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z17) {
                objM87133R = new C21026a(primaryAction, 20);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21026a(primaryAction, 20);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
            if ((458752 & i16) == 131072) {
            }
            objM87133R2 = c28655q.m87133R();
            if (z18) {
                objM87133R2 = new C21026a(secondaryAction, 21);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C21026a(secondaryAction, 21);
                c28655q.m87172p0(objM87133R2);
            }
            int i110 = 805502976 | AbstractC33208p0.b.f138467h;
            int i111 = TextResource.$stable;
            boolean z110 = z16;
            AbstractC33199m0.m105214F(bVar2, supportText, null, primaryButtonText, interfaceC4339a2, true, false, secondaryButtonText, (InterfaceC4339a) objM87133R2, modifierM3599a2, z110, false, c28655q, i110 | (i111 << 3) | (i16 & 112) | (i111 << 9) | ((i16 << 3) & 7168) | (i111 << 21) | (29360128 & (i16 << 9)), (i16 >> 18) & 14, 2116);
            z15 = z110;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22925b(title, supportText, primaryButtonText, primaryAction, secondaryButtonText, secondaryAction, z15, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m66687z(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }
}
