package c41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2880b;
import bf0.C3189a;
import bm2.C3467p0;
import c31.C3929m;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import hg3.AbstractC17269i;
import hy0.AbstractC17746g1;
import hy0.EnumC17775o1;
import ih0.AbstractC18489d0;
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
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: c41.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "heading", "subheading", "Ly71/g;", "leadingIcon", "actionText", "actionIcon", "Lhy0/o1;", "tileTagStyle", "Lc41/g;", "actionTileStyle", "Lkotlin/Function1;", "", "Ll83/a0;", "onClickEvent", "e", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Lcom/whoop/design/util/TextResource;Ly71/g;Lhy0/o1;Lc41/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Li2/x;", "j", "(Lhy0/o1;Landroidx/compose/runtime/Composer;I)J", "m", "(Lc41/g;Landroidx/compose/runtime/Composer;I)J", "k", "Lf0/t;", "l", "(Lc41/g;Landroidx/compose/runtime/Composer;I)Lf0/t;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4012e {

    /* JADX INFO: renamed from: c41.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16307a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f16308b;

        static {
            int[] iArr = new int[EnumC17775o1.values().length];
            try {
                iArr[EnumC17775o1.JOURNAL_ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17775o1.ONBOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16307a = iArr;
            int[] iArr2 = new int[EnumC4026g.values().length];
            try {
                iArr2[EnumC4026g.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC4026g.ONBOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f16308b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x011c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x0124  */
    /* JADX WARN: Code duplicated, block: B:108:0x012a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0130  */
    /* JADX WARN: Code duplicated, block: B:112:0x013d  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0164 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0166  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094 A[PHI: r15
      0x0094: PHI (r15v10 int) = (r15v0 int), (r15v5 int), (r15v6 int) binds: [B:51:0x0092, B:61:0x00aa, B:60:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    /* JADX INFO: renamed from: e */
    public static final void m12168e(TextResource heading, TextResource textResource, C39274g leadingIcon, TextResource textResource2, C39274g c39274g, EnumC17775o1 enumC17775o1, EnumC4026g enumC4026g, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        TextResource textResource3;
        int i16;
        TextResource textResource4;
        int i17;
        int i18;
        C39274g c39274g2;
        int i19;
        int i24;
        int i25;
        int iOrdinal;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        boolean z4;
        C28655q c28655q;
        EnumC17775o1 enumC17775o2;
        Function1 function2;
        TextResource textResource5;
        TextResource textResource6;
        C39274g c39274g3;
        EnumC4026g enumC4026g2;
        C28677v1 c28677v1M87180u;
        TextResource textResource7;
        C39274g c39274g4;
        EnumC4026g enumC4026g3;
        C28676v0 c28676v0;
        Function1 function3;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        int i35;
        AbstractC22676k.m65750j(heading, "heading");
        AbstractC22676k.m65750j(leadingIcon, "leadingIcon");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1954429339);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(heading) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i36 = i14 & 2;
        if (i36 == 0) {
            if ((i13 & 48) == 0) {
                textResource3 = textResource;
                i15 |= c28655q2.m87153g(textResource3) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87153g(leadingIcon)) {
                    i35 = 256;
                } else {
                    i35 = 128;
                }
                i15 |= i35;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    textResource4 = textResource2;
                    if (c28655q2.m87153g(textResource4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        c39274g2 = c39274g;
                        if (c28655q2.m87153g(c39274g2)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 32;
                    i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    if (i24 == 0) {
                        i15 |= i25;
                    } else if ((196608 & i13) == 0) {
                        if (enumC17775o1 == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = enumC17775o1.ordinal();
                        }
                        if (c28655q2.m87149e(iOrdinal)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 64;
                    if (i26 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87149e(enumC4026g != null ? enumC4026g.ordinal() : -1)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 128;
                    if (i28 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i15 |= i29;
                    }
                    i34 = i15;
                    if ((i34 & 4793491) != 4793490) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i34 & 1, z4)) {
                        if (i36 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource7 = null;
                        } else {
                            textResource7 = textResource4;
                        }
                        if (i18 != 0) {
                            c39274g4 = null;
                        } else {
                            c39274g4 = c39274g2;
                        }
                        if (i24 != 0) {
                            enumC17775o2 = EnumC17775o1.NONE;
                        } else {
                            enumC17775o2 = enumC17775o1;
                        }
                        if (i26 != 0) {
                            enumC4026g3 = EnumC4026g.DEFAULT;
                        } else {
                            enumC4026g3 = enumC4026g;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C3929m(5);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        } else {
                            function3 = function1;
                        }
                        int i37 = (i34 >> 18) & 14;
                        C13825t c13825tM12175l = m12175l(enumC4026g3, c28655q2, i37);
                        C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * 4);
                        long jM12174k = m12174k(enumC4026g3, c28655q2, i37);
                        z13 = (i34 & 29360128) == 8388608;
                        objM87133R = c28655q2.m87133R();
                        if (z13 || objM87133R == c28676v0) {
                            objM87133R = new C3189a(function3, 10);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q = c28655q2;
                        AbstractC31926e.m99375j(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), null, jM12174k, c33252iM105489e, c13825tM12175l, null, 0.0f, AbstractC37817c.m121344e(2012542987, c28655q2, new C3467p0(leadingIcon, enumC4026g3, textResource7, heading, textResource3, enumC17775o2, c39274g4)), c28655q, 12582912, 98);
                        C39274g c39274g5 = c39274g4;
                        enumC4026g2 = enumC4026g3;
                        textResource5 = textResource3;
                        c39274g3 = c39274g5;
                        function2 = function3;
                        textResource6 = textResource7;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        enumC17775o2 = enumC17775o1;
                        function2 = function1;
                        textResource5 = textResource3;
                        textResource6 = textResource4;
                        c39274g3 = c39274g2;
                        enumC4026g2 = enumC4026g;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2880b((Object) heading, (Object) textResource5, (Object) leadingIcon, (Object) textResource6, (Object) c39274g3, (Object) enumC17775o2, (Object) enumC4026g2, function2, i13, i14, 2);
                    }
                }
                i15 |= 24576;
                c39274g2 = c39274g;
                i24 = i14 & 32;
                i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if (i24 == 0) {
                    i15 |= i25;
                } else if ((196608 & i13) == 0) {
                    if (enumC17775o1 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC17775o1.ordinal();
                    }
                    if (c28655q2.m87149e(iOrdinal)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87149e(enumC4026g != null ? enumC4026g.ordinal() : -1)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 128;
                if (i28 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i15 |= i29;
                }
                i34 = i15;
                if ((i34 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i34 & 1, z4)) {
                    if (i36 != 0) {
                        textResource3 = null;
                    }
                    if (i16 != 0) {
                        textResource7 = null;
                    } else {
                        textResource7 = textResource4;
                    }
                    if (i18 != 0) {
                        c39274g4 = null;
                    } else {
                        c39274g4 = c39274g2;
                    }
                    if (i24 != 0) {
                        enumC17775o2 = EnumC17775o1.NONE;
                    } else {
                        enumC17775o2 = enumC17775o1;
                    }
                    if (i26 != 0) {
                        enumC4026g3 = EnumC4026g.DEFAULT;
                    } else {
                        enumC4026g3 = enumC4026g;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C3929m(5);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    } else {
                        function3 = function1;
                    }
                    int i38 = (i34 >> 18) & 14;
                    C13825t c13825tM12175l2 = m12175l(enumC4026g3, c28655q2, i38);
                    C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * 4);
                    long jM12174k2 = m12174k(enumC4026g3, c28655q2, i38);
                    if ((i34 & 29360128) == 8388608) {
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z13) {
                        objM87133R = new C3189a(function3, 10);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3189a(function3, 10);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), null, jM12174k2, c33252iM105489e2, c13825tM12175l2, null, 0.0f, AbstractC37817c.m121344e(2012542987, c28655q2, new C3467p0(leadingIcon, enumC4026g3, textResource7, heading, textResource3, enumC17775o2, c39274g4)), c28655q, 12582912, 98);
                    C39274g c39274g6 = c39274g4;
                    enumC4026g2 = enumC4026g3;
                    textResource5 = textResource3;
                    c39274g3 = c39274g6;
                    function2 = function3;
                    textResource6 = textResource7;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    enumC17775o2 = enumC17775o1;
                    function2 = function1;
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    c39274g3 = c39274g2;
                    enumC4026g2 = enumC4026g;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2880b((Object) heading, (Object) textResource5, (Object) leadingIcon, (Object) textResource6, (Object) c39274g3, (Object) enumC17775o2, (Object) enumC4026g2, function2, i13, i14, 2);
                }
            }
            i15 |= 3072;
            textResource4 = textResource2;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    c39274g2 = c39274g;
                    if (c28655q2.m87153g(c39274g2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if (i24 == 0) {
                    i15 |= i25;
                } else if ((196608 & i13) == 0) {
                    if (enumC17775o1 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC17775o1.ordinal();
                    }
                    if (c28655q2.m87149e(iOrdinal)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87149e(enumC4026g != null ? enumC4026g.ordinal() : -1)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 128;
                if (i28 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i15 |= i29;
                }
                i34 = i15;
                if ((i34 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i34 & 1, z4)) {
                    if (i36 != 0) {
                        textResource3 = null;
                    }
                    if (i16 != 0) {
                        textResource7 = null;
                    } else {
                        textResource7 = textResource4;
                    }
                    if (i18 != 0) {
                        c39274g4 = null;
                    } else {
                        c39274g4 = c39274g2;
                    }
                    if (i24 != 0) {
                        enumC17775o2 = EnumC17775o1.NONE;
                    } else {
                        enumC17775o2 = enumC17775o1;
                    }
                    if (i26 != 0) {
                        enumC4026g3 = EnumC4026g.DEFAULT;
                    } else {
                        enumC4026g3 = enumC4026g;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C3929m(5);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    } else {
                        function3 = function1;
                    }
                    int i39 = (i34 >> 18) & 14;
                    C13825t c13825tM12175l3 = m12175l(enumC4026g3, c28655q2, i39);
                    C33252i c33252iM105489e3 = AbstractC33253j.m105489e(3 * 4);
                    long jM12174k3 = m12174k(enumC4026g3, c28655q2, i39);
                    if ((i34 & 29360128) == 8388608) {
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z13) {
                        objM87133R = new C3189a(function3, 10);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3189a(function3, 10);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), null, jM12174k3, c33252iM105489e3, c13825tM12175l3, null, 0.0f, AbstractC37817c.m121344e(2012542987, c28655q2, new C3467p0(leadingIcon, enumC4026g3, textResource7, heading, textResource3, enumC17775o2, c39274g4)), c28655q, 12582912, 98);
                    C39274g c39274g7 = c39274g4;
                    enumC4026g2 = enumC4026g3;
                    textResource5 = textResource3;
                    c39274g3 = c39274g7;
                    function2 = function3;
                    textResource6 = textResource7;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    enumC17775o2 = enumC17775o1;
                    function2 = function1;
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    c39274g3 = c39274g2;
                    enumC4026g2 = enumC4026g;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2880b((Object) heading, (Object) textResource5, (Object) leadingIcon, (Object) textResource6, (Object) c39274g3, (Object) enumC17775o2, (Object) enumC4026g2, function2, i13, i14, 2);
                }
            }
            i15 |= 24576;
            c39274g2 = c39274g;
            i24 = i14 & 32;
            i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i24 == 0) {
                i15 |= i25;
            } else if ((196608 & i13) == 0) {
                if (enumC17775o1 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC17775o1.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87149e(enumC4026g != null ? enumC4026g.ordinal() : -1)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i15 |= i27;
            }
            i28 = i14 & 128;
            if (i28 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i15 |= i29;
            }
            i34 = i15;
            if ((i34 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i34 & 1, z4)) {
                if (i36 != 0) {
                    textResource3 = null;
                }
                if (i16 != 0) {
                    textResource7 = null;
                } else {
                    textResource7 = textResource4;
                }
                if (i18 != 0) {
                    c39274g4 = null;
                } else {
                    c39274g4 = c39274g2;
                }
                if (i24 != 0) {
                    enumC17775o2 = EnumC17775o1.NONE;
                } else {
                    enumC17775o2 = enumC17775o1;
                }
                if (i26 != 0) {
                    enumC4026g3 = EnumC4026g.DEFAULT;
                } else {
                    enumC4026g3 = enumC4026g;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C3929m(5);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function1;
                }
                int i310 = (i34 >> 18) & 14;
                C13825t c13825tM12175l4 = m12175l(enumC4026g3, c28655q2, i310);
                C33252i c33252iM105489e4 = AbstractC33253j.m105489e(3 * 4);
                long jM12174k4 = m12174k(enumC4026g3, c28655q2, i310);
                if ((i34 & 29360128) == 8388608) {
                }
                objM87133R = c28655q2.m87133R();
                if (z13) {
                    objM87133R = new C3189a(function3, 10);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3189a(function3, 10);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), null, jM12174k4, c33252iM105489e4, c13825tM12175l4, null, 0.0f, AbstractC37817c.m121344e(2012542987, c28655q2, new C3467p0(leadingIcon, enumC4026g3, textResource7, heading, textResource3, enumC17775o2, c39274g4)), c28655q, 12582912, 98);
                C39274g c39274g8 = c39274g4;
                enumC4026g2 = enumC4026g3;
                textResource5 = textResource3;
                c39274g3 = c39274g8;
                function2 = function3;
                textResource6 = textResource7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                enumC17775o2 = enumC17775o1;
                function2 = function1;
                textResource5 = textResource3;
                textResource6 = textResource4;
                c39274g3 = c39274g2;
                enumC4026g2 = enumC4026g;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b((Object) heading, (Object) textResource5, (Object) leadingIcon, (Object) textResource6, (Object) c39274g3, (Object) enumC17775o2, (Object) enumC4026g2, function2, i13, i14, 2);
            }
        }
        i15 |= 48;
        textResource3 = textResource;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87153g(leadingIcon)) {
                i35 = 256;
            } else {
                i35 = 128;
            }
            i15 |= i35;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                textResource4 = textResource2;
                if (c28655q2.m87153g(textResource4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    c39274g2 = c39274g;
                    if (c28655q2.m87153g(c39274g2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if (i24 == 0) {
                    i15 |= i25;
                } else if ((196608 & i13) == 0) {
                    if (enumC17775o1 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC17775o1.ordinal();
                    }
                    if (c28655q2.m87149e(iOrdinal)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87149e(enumC4026g != null ? enumC4026g.ordinal() : -1)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 128;
                if (i28 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i15 |= i29;
                }
                i34 = i15;
                if ((i34 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i34 & 1, z4)) {
                    if (i36 != 0) {
                        textResource3 = null;
                    }
                    if (i16 != 0) {
                        textResource7 = null;
                    } else {
                        textResource7 = textResource4;
                    }
                    if (i18 != 0) {
                        c39274g4 = null;
                    } else {
                        c39274g4 = c39274g2;
                    }
                    if (i24 != 0) {
                        enumC17775o2 = EnumC17775o1.NONE;
                    } else {
                        enumC17775o2 = enumC17775o1;
                    }
                    if (i26 != 0) {
                        enumC4026g3 = EnumC4026g.DEFAULT;
                    } else {
                        enumC4026g3 = enumC4026g;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C3929m(5);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    } else {
                        function3 = function1;
                    }
                    int i311 = (i34 >> 18) & 14;
                    C13825t c13825tM12175l5 = m12175l(enumC4026g3, c28655q2, i311);
                    C33252i c33252iM105489e5 = AbstractC33253j.m105489e(3 * 4);
                    long jM12174k5 = m12174k(enumC4026g3, c28655q2, i311);
                    if ((i34 & 29360128) == 8388608) {
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z13) {
                        objM87133R = new C3189a(function3, 10);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3189a(function3, 10);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), null, jM12174k5, c33252iM105489e5, c13825tM12175l5, null, 0.0f, AbstractC37817c.m121344e(2012542987, c28655q2, new C3467p0(leadingIcon, enumC4026g3, textResource7, heading, textResource3, enumC17775o2, c39274g4)), c28655q, 12582912, 98);
                    C39274g c39274g9 = c39274g4;
                    enumC4026g2 = enumC4026g3;
                    textResource5 = textResource3;
                    c39274g3 = c39274g9;
                    function2 = function3;
                    textResource6 = textResource7;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    enumC17775o2 = enumC17775o1;
                    function2 = function1;
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    c39274g3 = c39274g2;
                    enumC4026g2 = enumC4026g;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2880b((Object) heading, (Object) textResource5, (Object) leadingIcon, (Object) textResource6, (Object) c39274g3, (Object) enumC17775o2, (Object) enumC4026g2, function2, i13, i14, 2);
                }
            }
            i15 |= 24576;
            c39274g2 = c39274g;
            i24 = i14 & 32;
            i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i24 == 0) {
                i15 |= i25;
            } else if ((196608 & i13) == 0) {
                if (enumC17775o1 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC17775o1.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87149e(enumC4026g != null ? enumC4026g.ordinal() : -1)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i15 |= i27;
            }
            i28 = i14 & 128;
            if (i28 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i15 |= i29;
            }
            i34 = i15;
            if ((i34 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i34 & 1, z4)) {
                if (i36 != 0) {
                    textResource3 = null;
                }
                if (i16 != 0) {
                    textResource7 = null;
                } else {
                    textResource7 = textResource4;
                }
                if (i18 != 0) {
                    c39274g4 = null;
                } else {
                    c39274g4 = c39274g2;
                }
                if (i24 != 0) {
                    enumC17775o2 = EnumC17775o1.NONE;
                } else {
                    enumC17775o2 = enumC17775o1;
                }
                if (i26 != 0) {
                    enumC4026g3 = EnumC4026g.DEFAULT;
                } else {
                    enumC4026g3 = enumC4026g;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C3929m(5);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function1;
                }
                int i312 = (i34 >> 18) & 14;
                C13825t c13825tM12175l6 = m12175l(enumC4026g3, c28655q2, i312);
                C33252i c33252iM105489e6 = AbstractC33253j.m105489e(3 * 4);
                long jM12174k6 = m12174k(enumC4026g3, c28655q2, i312);
                if ((i34 & 29360128) == 8388608) {
                }
                objM87133R = c28655q2.m87133R();
                if (z13) {
                    objM87133R = new C3189a(function3, 10);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3189a(function3, 10);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), null, jM12174k6, c33252iM105489e6, c13825tM12175l6, null, 0.0f, AbstractC37817c.m121344e(2012542987, c28655q2, new C3467p0(leadingIcon, enumC4026g3, textResource7, heading, textResource3, enumC17775o2, c39274g4)), c28655q, 12582912, 98);
                C39274g c39274g10 = c39274g4;
                enumC4026g2 = enumC4026g3;
                textResource5 = textResource3;
                c39274g3 = c39274g10;
                function2 = function3;
                textResource6 = textResource7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                enumC17775o2 = enumC17775o1;
                function2 = function1;
                textResource5 = textResource3;
                textResource6 = textResource4;
                c39274g3 = c39274g2;
                enumC4026g2 = enumC4026g;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b((Object) heading, (Object) textResource5, (Object) leadingIcon, (Object) textResource6, (Object) c39274g3, (Object) enumC17775o2, (Object) enumC4026g2, function2, i13, i14, 2);
            }
        }
        i15 |= 3072;
        textResource4 = textResource2;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                c39274g2 = c39274g;
                if (c28655q2.m87153g(c39274g2)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i24 == 0) {
                i15 |= i25;
            } else if ((196608 & i13) == 0) {
                if (enumC17775o1 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC17775o1.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87149e(enumC4026g != null ? enumC4026g.ordinal() : -1)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i15 |= i27;
            }
            i28 = i14 & 128;
            if (i28 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i15 |= i29;
            }
            i34 = i15;
            if ((i34 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i34 & 1, z4)) {
                if (i36 != 0) {
                    textResource3 = null;
                }
                if (i16 != 0) {
                    textResource7 = null;
                } else {
                    textResource7 = textResource4;
                }
                if (i18 != 0) {
                    c39274g4 = null;
                } else {
                    c39274g4 = c39274g2;
                }
                if (i24 != 0) {
                    enumC17775o2 = EnumC17775o1.NONE;
                } else {
                    enumC17775o2 = enumC17775o1;
                }
                if (i26 != 0) {
                    enumC4026g3 = EnumC4026g.DEFAULT;
                } else {
                    enumC4026g3 = enumC4026g;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C3929m(5);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function1;
                }
                int i313 = (i34 >> 18) & 14;
                C13825t c13825tM12175l7 = m12175l(enumC4026g3, c28655q2, i313);
                C33252i c33252iM105489e7 = AbstractC33253j.m105489e(3 * 4);
                long jM12174k7 = m12174k(enumC4026g3, c28655q2, i313);
                if ((i34 & 29360128) == 8388608) {
                }
                objM87133R = c28655q2.m87133R();
                if (z13) {
                    objM87133R = new C3189a(function3, 10);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3189a(function3, 10);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), null, jM12174k7, c33252iM105489e7, c13825tM12175l7, null, 0.0f, AbstractC37817c.m121344e(2012542987, c28655q2, new C3467p0(leadingIcon, enumC4026g3, textResource7, heading, textResource3, enumC17775o2, c39274g4)), c28655q, 12582912, 98);
                C39274g c39274g11 = c39274g4;
                enumC4026g2 = enumC4026g3;
                textResource5 = textResource3;
                c39274g3 = c39274g11;
                function2 = function3;
                textResource6 = textResource7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                enumC17775o2 = enumC17775o1;
                function2 = function1;
                textResource5 = textResource3;
                textResource6 = textResource4;
                c39274g3 = c39274g2;
                enumC4026g2 = enumC4026g;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b((Object) heading, (Object) textResource5, (Object) leadingIcon, (Object) textResource6, (Object) c39274g3, (Object) enumC17775o2, (Object) enumC4026g2, function2, i13, i14, 2);
            }
        }
        i15 |= 24576;
        c39274g2 = c39274g;
        i24 = i14 & 32;
        i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if (i24 == 0) {
            i15 |= i25;
        } else if ((196608 & i13) == 0) {
            if (enumC17775o1 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC17775o1.ordinal();
            }
            if (c28655q2.m87149e(iOrdinal)) {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i25;
        }
        i26 = i14 & 64;
        if (i26 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q2.m87149e(enumC4026g != null ? enumC4026g.ordinal() : -1)) {
                i27 = 1048576;
            } else {
                i27 = 524288;
            }
            i15 |= i27;
        }
        i28 = i14 & 128;
        if (i28 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c28655q2.m87157i(function1)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i15 |= i29;
        }
        i34 = i15;
        if ((i34 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i34 & 1, z4)) {
            if (i36 != 0) {
                textResource3 = null;
            }
            if (i16 != 0) {
                textResource7 = null;
            } else {
                textResource7 = textResource4;
            }
            if (i18 != 0) {
                c39274g4 = null;
            } else {
                c39274g4 = c39274g2;
            }
            if (i24 != 0) {
                enumC17775o2 = EnumC17775o1.NONE;
            } else {
                enumC17775o2 = enumC17775o1;
            }
            if (i26 != 0) {
                enumC4026g3 = EnumC4026g.DEFAULT;
            } else {
                enumC4026g3 = enumC4026g;
            }
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C3929m(5);
                    c28655q2.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function1;
            }
            int i314 = (i34 >> 18) & 14;
            C13825t c13825tM12175l8 = m12175l(enumC4026g3, c28655q2, i314);
            C33252i c33252iM105489e8 = AbstractC33253j.m105489e(3 * 4);
            long jM12174k8 = m12174k(enumC4026g3, c28655q2, i314);
            if ((i34 & 29360128) == 8388608) {
            }
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C3189a(function3, 10);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C3189a(function3, 10);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), null, jM12174k8, c33252iM105489e8, c13825tM12175l8, null, 0.0f, AbstractC37817c.m121344e(2012542987, c28655q2, new C3467p0(leadingIcon, enumC4026g3, textResource7, heading, textResource3, enumC17775o2, c39274g4)), c28655q, 12582912, 98);
            C39274g c39274g12 = c39274g4;
            enumC4026g2 = enumC4026g3;
            textResource5 = textResource3;
            c39274g3 = c39274g12;
            function2 = function3;
            textResource6 = textResource7;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            enumC17775o2 = enumC17775o1;
            function2 = function1;
            textResource5 = textResource3;
            textResource6 = textResource4;
            c39274g3 = c39274g2;
            enumC4026g2 = enumC4026g;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b((Object) heading, (Object) textResource5, (Object) leadingIcon, (Object) textResource6, (Object) c39274g3, (Object) enumC17775o2, (Object) enumC4026g2, function2, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m12169f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m12170g(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
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
    public static final C23454a0 m12171h(C39274g c39274g, EnumC4026g enumC4026g, TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC17775o1 enumC17775o1, C39274g c39274g2, Composer composer, int i13) {
        boolean z4;
        float f13;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f14 = 4;
            float f15 = f14 * f14;
            float f16 = 3 * f14;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3397s(c2314t, f16, f15, f16, f15));
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
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
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            float f17 = 8;
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, f17, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            float f18 = 5 * f14;
            C2314t c2314t2 = c2314t;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c39274g.getIcon(), c28655q, 6), c39274g.getContentDescription().toString(), AbstractC1102d.m3419p(f18, c2314t2), m12176m(enumC4026g, c28655q, 0), c28655q, 384, 0);
            C28655q c28655q2 = c28655q;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            String strM21274h = AbstractC8693b.m21274h(textResource2, c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH4(), null, c28655q2, 0, 0, 196602);
            if (textResource3 == null) {
                c28655q2.m87150e0(-1486916716);
                z4 = false;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1486916715);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, 0), null, AbstractC13673n.m38559f(c38072d, c28655q2, 6, 0.5f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB2(), null, c28655q2, 0, 0, 196602);
                z4 = false;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            if (textResource == null) {
                c28655q2.m87150e0(-1155658296);
                c28655q2.m87173q(z4);
                c38072d = c38072d;
                f13 = f18;
                c2314t2 = c2314t2;
            } else {
                c28655q2.m87150e0(-1155658295);
                if (enumC17775o1 == null) {
                    c28655q2.m87150e0(1546116590);
                    c28655q2.m87173q(z4);
                    f13 = f18;
                } else {
                    c28655q2.m87150e0(1546116591);
                    long jM12173j = m12173j(enumC17775o1, c28655q2, z4 ? 1 : 0);
                    C33252i c33252iM105489e = AbstractC33253j.m105489e(2 * f14);
                    Object[] objArr = z4 ? 1 : 0;
                    f13 = f18;
                    AbstractC17746g1.m50874j(textResource, c38072d.m121949b(c28655q2, 6).getRecovery(), null, jM12173j, null, false, c39274g2, null, 0.0f, enumC17775o1, c33252iM105489e, ((float) 0.75d) * f17, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q2, 0, 48, 0, 8384948);
                    c28655q2 = c28655q2;
                    z4 = false;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z4);
            }
            if (textResource == null) {
                c28655q2.m87150e0(-1155059375);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q2, 6), new C39274g(AbstractC11895b.m31981D(c38072d), null, 2, 0 == true ? 1 : 0).getContentDescription().toString(), AbstractC1102d.m3419p(f13, c2314t2), c38072d.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 384, 0);
                c28655q2.m87173q(z4);
            } else {
                c28655q2.m87150e0(-1154646145);
                c28655q2.m87173q(z4);
            }
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m12172i(TextResource textResource, TextResource textResource2, C39274g c39274g, TextResource textResource3, C39274g c39274g2, EnumC17775o1 enumC17775o1, EnumC4026g enumC4026g, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m12168e(textResource, textResource2, c39274g, textResource3, c39274g2, enumC17775o1, enumC4026g, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final long m12173j(EnumC17775o1 enumC17775o1, Composer composer, int i13) {
        int i14 = a.f16307a[enumC17775o1.ordinal()];
        if (i14 == 1 || i14 == 2) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(519917167);
            return AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(519918607);
        return AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
    }

    /* JADX INFO: renamed from: k */
    private static final long m12174k(EnumC4026g enumC4026g, Composer composer, int i13) {
        int i14 = a.f16308b[enumC4026g.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(134956283);
            return AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
        }
        if (i14 != 2) {
            throw AbstractC11895b.m32003v(134951887, (C28655q) composer, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(134954331);
        long jM125420t = C38072d.f163053a.m121949b(c28655q2, 6).getBlack50();
        c28655q2.m87173q(false);
        return jM125420t;
    }

    /* JADX INFO: renamed from: l */
    private static final C13825t m12175l(EnumC4026g enumC4026g, Composer composer, int i13) {
        int i14 = a.f16308b[enumC4026g.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1501383237);
            C13825t c13825tM48880a = AbstractC17269i.m48880a(0, C38072d.f163053a.m121949b(c28655q, 6).getTransparent());
            c28655q.m87173q(false);
            return c13825tM48880a;
        }
        if (i14 != 2) {
            throw AbstractC11895b.m32003v(1501378097, (C28655q) composer, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(1501379951);
        c28655q2.m87173q(false);
        return new C13825t((float) 1.5d, AbstractC15673b0.m43983F0());
    }

    /* JADX INFO: renamed from: m */
    private static final long m12176m(EnumC4026g enumC4026g, Composer composer, int i13) {
        int i14 = a.f16308b[enumC4026g.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-916187152);
            return AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
        }
        if (i14 != 2) {
            throw AbstractC11895b.m32003v(-916189500, (C28655q) composer, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-916185104);
        long jM125374Y0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite30();
        c28655q2.m87173q(false);
        return jM125374Y0;
    }
}
