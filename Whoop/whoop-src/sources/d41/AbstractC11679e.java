package d41;

import a31.C0341c;
import a31.C0343e;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2541i2;
import b30.C2648w3;
import b91.C2886a;
import bm2.C3428b1;
import bm2.C3444h;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.preview.C9809a;
import cp0.C11005v0;
import cu2.C11132l;
import d11.AbstractC11471f;
import d11.InterfaceC11466a;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import i91.AbstractC18249c;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.C22411w;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import mh.C25540h;
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
import p132f0.C13825t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p292l1.AbstractC23164r1;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import ph.C29227a;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: d41.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0016\u0010\u0012\u001a\u000f\u0010\u0017\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0017\u0010\u0014\u001as\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\u000bH\u0003¢\u0006\u0004\b#\u0010\u0014\u001a\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0018H\u0003¢\u0006\u0004\b$\u0010%\u001aO\u0010(\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b*\u0010+\u001a1\u0010-\u001a\u00020,2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ld41/g;", "tileSize", "Ld11/a;", "border", "Ld41/j;", "type", "", "overrideTitleAndSubtitleFontToB2", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "q", "(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "Lkd1/o;", "image", "I", "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "K", "(Landroidx/compose/runtime/Composer;I)V", "imageUrl", "z", "x", "Lcom/whoop/design/util/TextResource;", "imageContentDescription", "", "iconRes", "title", "subText", "body", "tag", "isVideo", "D", "(Ld41/g;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLd41/j;ZLandroidx/compose/runtime/Composer;III)V", "B", "v", "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "Ld41/i;", "textSubType", "o", "(Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLd41/i;ZLandroidx/compose/runtime/Composer;II)V", "G", "(ILandroidx/compose/runtime/Composer;I)V", "Lb91/a;", "M", "(Ld41/i;ZLcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;I)Lb91/a;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11679e {

    /* JADX INFO: renamed from: d41.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37756a;

        static {
            int[] iArr = new int[EnumC11681g.values().length];
            try {
                iArr[EnumC11681g.FULLWIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f37756a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m31095A(AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m31133z(abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final void m31096B(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2011805762);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), AbstractC11675a.m31089a(c28655q, 0)), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m31097C(int i13, Composer composer, int i14) {
        m31096B(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x0125  */
    /* JADX WARN: Code duplicated, block: B:107:0x0129  */
    /* JADX WARN: Code duplicated, block: B:108:0x012c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0160  */
    /* JADX WARN: Code duplicated, block: B:113:0x0169  */
    /* JADX WARN: Code duplicated, block: B:116:0x0181  */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:134:0x0226  */
    /* JADX WARN: Code duplicated, block: B:137:0x0231  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x0121, please report this as an issue */
    /* JADX INFO: renamed from: D */
    private static final void m31098D(EnumC11681g enumC11681g, AbstractC22403o abstractC22403o, TextResource textResource, Integer num, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, boolean z4, AbstractC11684j abstractC11684j, boolean z13, Composer composer, int i13, int i14, int i15) {
        int i16;
        AbstractC22403o abstractC22403o2;
        TextResource textResource6;
        TextResource textResource7;
        int i17;
        TextResource textResource8;
        int i18;
        int i19;
        int i24;
        boolean z14;
        EnumC11681g enumC11681g2;
        C28677v1 c28677v1M87180u;
        TextResource textResource9;
        float fM134206getWidthD9Ej5fM;
        float fFloatValue;
        float fFloatValue2;
        EnumC11681g enumC11681g3;
        C2314t c2314t;
        Modifier modifierM3421r;
        boolean zM87147d;
        Object objM87133R;
        String strM21274h;
        AbstractC11684j.c cVar;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-739483798);
        if ((i13 & 6) == 0) {
            i16 = (c28655q.m87149e(enumC11681g.ordinal()) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            abstractC22403o2 = abstractC22403o;
            i16 |= c28655q.m87153g(abstractC22403o2) ? 32 : 16;
        } else {
            abstractC22403o2 = abstractC22403o;
        }
        int i35 = i15 & 4;
        if (i35 == 0) {
            if ((i13 & 384) == 0) {
                textResource6 = textResource;
                i16 |= c28655q.m87153g(textResource6) ? 256 : 128;
            }
            if ((i13 & 3072) != 0) {
                if (c28655q.m87153g(num)) {
                    i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i34;
            }
            if ((i13 & 24576) == 0) {
                textResource7 = textResource2;
                if (c28655q.m87153g(textResource7)) {
                    i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i29 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i29;
            } else {
                textResource7 = textResource2;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i13) == 0) {
                    textResource8 = textResource3;
                    if (c28655q.m87153g(textResource8)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
                if ((1572864 & i13) != 0) {
                    if (c28655q.m87153g(textResource4)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
                if ((12582912 & i13) == 0) {
                    if (c28655q.m87153g(textResource5)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i16 |= i27;
                }
                if ((100663296 & i13) != 0) {
                    if (c28655q.m87155h(z4)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i26;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87153g(abstractC11684j)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i16 |= i25;
                }
                i19 = i16;
                if ((i14 & 6) == 0) {
                    i24 = i14 | (c28655q.m87155h(z13) ? 4 : 2);
                } else {
                    i24 = i14;
                }
                if ((i19 & 306783379) == 306783378 || (i24 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i19 & 1, z14)) {
                    if (i35 != 0) {
                        textResource6 = null;
                    }
                    if (i17 != 0) {
                        textResource9 = null;
                    } else {
                        textResource9 = textResource8;
                    }
                    fM134206getWidthD9Ej5fM = enumC11681g.getWidth() * 0.75f;
                    InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    Float fValueOf = Float.valueOf(interfaceC39171c.mo743q0(enumC11681g.getWidth()));
                    Float fValueOf2 = Float.valueOf(interfaceC39171c.mo743q0(fM134206getWidthD9Ej5fM));
                    fFloatValue = fValueOf.floatValue();
                    fFloatValue2 = fValueOf2.floatValue();
                    enumC11681g3 = EnumC11681g.FULLWIDTH;
                    c2314t = C2314t.f9131w;
                    enumC11681g2 = enumC11681g;
                    if (enumC11681g2 == enumC11681g3) {
                        modifierM3421r = AbstractC1102d.m3407d(1.0f, c2314t);
                    } else {
                        modifierM3421r = AbstractC1102d.m3421r(c2314t, enumC11681g2.getWidth(), fM134206getWidthD9Ej5fM);
                    }
                    Modifier modifier = modifierM3421r;
                    zM87147d = c28655q.m87147d(fFloatValue) | c28655q.m87147d(fFloatValue2);
                    objM87133R = c28655q.m87133R();
                    if (zM87147d || objM87133R == C28635l.f115821a) {
                        objM87133R = new C11005v0(fFloatValue, fFloatValue2, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o2, null, (Function1) objM87133R, c28655q, (i19 >> 3) & 14, 1);
                    if (textResource6 == null) {
                        c28655q.m87150e0(-1073535585);
                        c28655q.m87173q(false);
                        strM21274h = null;
                    } else {
                        c28655q.m87150e0(-1073535584);
                        strM21274h = AbstractC8693b.m21274h(textResource6, c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    AbstractC29125c.m88522c(abstractC26165aM64500i, strM21274h, modifier, null, C39102j.f168199a, 0.0f, null, c28655q, 24576, 104);
                    m31096B(c28655q, 0);
                    if (textResource5 != null) {
                        c28655q.m87150e0(-1073416172);
                        m31129v(textResource5, c28655q, (i19 >> 21) & 14);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1073381576);
                        c28655q.m87173q(false);
                    }
                    if (abstractC11684j instanceof AbstractC11684j.c) {
                        cVar = (AbstractC11684j.c) abstractC11684j;
                    } else {
                        cVar = null;
                    }
                    TextResource textResource10 = textResource9;
                    m31122o(num, textResource7, textResource10, textResource4, z4, cVar != null ? cVar.getTextSubType() : null, z13, c28655q, ((i19 >> 9) & 8190) | ((i19 >> 12) & 57344) | ((i24 << 18) & 3670016), 0);
                    textResource8 = textResource10;
                } else {
                    enumC11681g2 = enumC11681g;
                    c28655q.m87138X();
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11677c(enumC11681g2, abstractC22403o, textResource6, num, textResource2, textResource8, textResource4, textResource5, z4, abstractC11684j, z13, i13, i14, i15);
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            textResource8 = textResource3;
            if ((1572864 & i13) != 0) {
                if (c28655q.m87153g(textResource4)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i16 |= i28;
            }
            if ((12582912 & i13) == 0) {
                if (c28655q.m87153g(textResource5)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i16 |= i27;
            }
            if ((100663296 & i13) != 0) {
                if (c28655q.m87155h(z4)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i26;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87153g(abstractC11684j)) {
                    i25 = 536870912;
                } else {
                    i25 = 268435456;
                }
                i16 |= i25;
            }
            i19 = i16;
            if ((i14 & 6) == 0) {
                i24 = i14 | (c28655q.m87155h(z13) ? 4 : 2);
            } else {
                i24 = i14;
            }
            if ((i19 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q.m87135U(i19 & 1, z14)) {
                if (i35 != 0) {
                    textResource6 = null;
                }
                if (i17 != 0) {
                    textResource9 = null;
                } else {
                    textResource9 = textResource8;
                }
                fM134206getWidthD9Ej5fM = enumC11681g.getWidth() * 0.75f;
                InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                Float fValueOf3 = Float.valueOf(interfaceC39171c2.mo743q0(enumC11681g.getWidth()));
                Float fValueOf4 = Float.valueOf(interfaceC39171c2.mo743q0(fM134206getWidthD9Ej5fM));
                fFloatValue = fValueOf3.floatValue();
                fFloatValue2 = fValueOf4.floatValue();
                enumC11681g3 = EnumC11681g.FULLWIDTH;
                c2314t = C2314t.f9131w;
                enumC11681g2 = enumC11681g;
                if (enumC11681g2 == enumC11681g3) {
                    modifierM3421r = AbstractC1102d.m3407d(1.0f, c2314t);
                } else {
                    modifierM3421r = AbstractC1102d.m3421r(c2314t, enumC11681g2.getWidth(), fM134206getWidthD9Ej5fM);
                }
                Modifier modifier2 = modifierM3421r;
                zM87147d = c28655q.m87147d(fFloatValue) | c28655q.m87147d(fFloatValue2);
                objM87133R = c28655q.m87133R();
                if (zM87147d) {
                    objM87133R = new C11005v0(fFloatValue, fFloatValue2, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11005v0(fFloatValue, fFloatValue2, 1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(abstractC22403o2, null, (Function1) objM87133R, c28655q, (i19 >> 3) & 14, 1);
                if (textResource6 == null) {
                    c28655q.m87150e0(-1073535585);
                    c28655q.m87173q(false);
                    strM21274h = null;
                } else {
                    c28655q.m87150e0(-1073535584);
                    strM21274h = AbstractC8693b.m21274h(textResource6, c28655q, 0);
                    c28655q.m87173q(false);
                }
                AbstractC29125c.m88522c(abstractC26165aM64500i2, strM21274h, modifier2, null, C39102j.f168199a, 0.0f, null, c28655q, 24576, 104);
                m31096B(c28655q, 0);
                if (textResource5 != null) {
                    c28655q.m87150e0(-1073416172);
                    m31129v(textResource5, c28655q, (i19 >> 21) & 14);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1073381576);
                    c28655q.m87173q(false);
                }
                if (abstractC11684j instanceof AbstractC11684j.c) {
                    cVar = (AbstractC11684j.c) abstractC11684j;
                } else {
                    cVar = null;
                }
                TextResource textResource11 = textResource9;
                m31122o(num, textResource7, textResource11, textResource4, z4, cVar != null ? cVar.getTextSubType() : null, z13, c28655q, ((i19 >> 9) & 8190) | ((i19 >> 12) & 57344) | ((i24 << 18) & 3670016), 0);
                textResource8 = textResource11;
            } else {
                enumC11681g2 = enumC11681g;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11677c(enumC11681g2, abstractC22403o, textResource6, num, textResource2, textResource8, textResource4, textResource5, z4, abstractC11684j, z13, i13, i14, i15);
            }
        }
        i16 |= 384;
        textResource6 = textResource;
        if ((i13 & 3072) != 0) {
            if (c28655q.m87153g(num)) {
                i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 |= i34;
        }
        if ((i13 & 24576) == 0) {
            textResource7 = textResource2;
            if (c28655q.m87153g(textResource7)) {
                i29 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i29 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i29;
        } else {
            textResource7 = textResource2;
        }
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i13) == 0) {
                textResource8 = textResource3;
                if (c28655q.m87153g(textResource8)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
            if ((1572864 & i13) != 0) {
                if (c28655q.m87153g(textResource4)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i16 |= i28;
            }
            if ((12582912 & i13) == 0) {
                if (c28655q.m87153g(textResource5)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i16 |= i27;
            }
            if ((100663296 & i13) != 0) {
                if (c28655q.m87155h(z4)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i26;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87153g(abstractC11684j)) {
                    i25 = 536870912;
                } else {
                    i25 = 268435456;
                }
                i16 |= i25;
            }
            i19 = i16;
            if ((i14 & 6) == 0) {
                i24 = i14 | (c28655q.m87155h(z13) ? 4 : 2);
            } else {
                i24 = i14;
            }
            if ((i19 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q.m87135U(i19 & 1, z14)) {
                if (i35 != 0) {
                    textResource6 = null;
                }
                if (i17 != 0) {
                    textResource9 = null;
                } else {
                    textResource9 = textResource8;
                }
                fM134206getWidthD9Ej5fM = enumC11681g.getWidth() * 0.75f;
                InterfaceC39171c interfaceC39171c3 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                Float fValueOf5 = Float.valueOf(interfaceC39171c3.mo743q0(enumC11681g.getWidth()));
                Float fValueOf6 = Float.valueOf(interfaceC39171c3.mo743q0(fM134206getWidthD9Ej5fM));
                fFloatValue = fValueOf5.floatValue();
                fFloatValue2 = fValueOf6.floatValue();
                enumC11681g3 = EnumC11681g.FULLWIDTH;
                c2314t = C2314t.f9131w;
                enumC11681g2 = enumC11681g;
                if (enumC11681g2 == enumC11681g3) {
                    modifierM3421r = AbstractC1102d.m3407d(1.0f, c2314t);
                } else {
                    modifierM3421r = AbstractC1102d.m3421r(c2314t, enumC11681g2.getWidth(), fM134206getWidthD9Ej5fM);
                }
                Modifier modifier3 = modifierM3421r;
                zM87147d = c28655q.m87147d(fFloatValue) | c28655q.m87147d(fFloatValue2);
                objM87133R = c28655q.m87133R();
                if (zM87147d) {
                    objM87133R = new C11005v0(fFloatValue, fFloatValue2, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11005v0(fFloatValue, fFloatValue2, 1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC26165a abstractC26165aM64500i3 = AbstractC22404p.m64500i(abstractC22403o2, null, (Function1) objM87133R, c28655q, (i19 >> 3) & 14, 1);
                if (textResource6 == null) {
                    c28655q.m87150e0(-1073535585);
                    c28655q.m87173q(false);
                    strM21274h = null;
                } else {
                    c28655q.m87150e0(-1073535584);
                    strM21274h = AbstractC8693b.m21274h(textResource6, c28655q, 0);
                    c28655q.m87173q(false);
                }
                AbstractC29125c.m88522c(abstractC26165aM64500i3, strM21274h, modifier3, null, C39102j.f168199a, 0.0f, null, c28655q, 24576, 104);
                m31096B(c28655q, 0);
                if (textResource5 != null) {
                    c28655q.m87150e0(-1073416172);
                    m31129v(textResource5, c28655q, (i19 >> 21) & 14);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1073381576);
                    c28655q.m87173q(false);
                }
                if (abstractC11684j instanceof AbstractC11684j.c) {
                    cVar = (AbstractC11684j.c) abstractC11684j;
                } else {
                    cVar = null;
                }
                TextResource textResource12 = textResource9;
                m31122o(num, textResource7, textResource12, textResource4, z4, cVar != null ? cVar.getTextSubType() : null, z13, c28655q, ((i19 >> 9) & 8190) | ((i19 >> 12) & 57344) | ((i24 << 18) & 3670016), 0);
                textResource8 = textResource12;
            } else {
                enumC11681g2 = enumC11681g;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11677c(enumC11681g2, abstractC22403o, textResource6, num, textResource2, textResource8, textResource4, textResource5, z4, abstractC11684j, z13, i13, i14, i15);
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        textResource8 = textResource3;
        if ((1572864 & i13) != 0) {
            if (c28655q.m87153g(textResource4)) {
                i28 = 1048576;
            } else {
                i28 = 524288;
            }
            i16 |= i28;
        }
        if ((12582912 & i13) == 0) {
            if (c28655q.m87153g(textResource5)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i16 |= i27;
        }
        if ((100663296 & i13) != 0) {
            if (c28655q.m87155h(z4)) {
                i26 = 67108864;
            } else {
                i26 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i26;
        }
        if ((i13 & 805306368) == 0) {
            if (c28655q.m87153g(abstractC11684j)) {
                i25 = 536870912;
            } else {
                i25 = 268435456;
            }
            i16 |= i25;
        }
        i19 = i16;
        if ((i14 & 6) == 0) {
            i24 = i14 | (c28655q.m87155h(z13) ? 4 : 2);
        } else {
            i24 = i14;
        }
        if ((i19 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (c28655q.m87135U(i19 & 1, z14)) {
            if (i35 != 0) {
                textResource6 = null;
            }
            if (i17 != 0) {
                textResource9 = null;
            } else {
                textResource9 = textResource8;
            }
            fM134206getWidthD9Ej5fM = enumC11681g.getWidth() * 0.75f;
            InterfaceC39171c interfaceC39171c4 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            Float fValueOf7 = Float.valueOf(interfaceC39171c4.mo743q0(enumC11681g.getWidth()));
            Float fValueOf8 = Float.valueOf(interfaceC39171c4.mo743q0(fM134206getWidthD9Ej5fM));
            fFloatValue = fValueOf7.floatValue();
            fFloatValue2 = fValueOf8.floatValue();
            enumC11681g3 = EnumC11681g.FULLWIDTH;
            c2314t = C2314t.f9131w;
            enumC11681g2 = enumC11681g;
            if (enumC11681g2 == enumC11681g3) {
                modifierM3421r = AbstractC1102d.m3407d(1.0f, c2314t);
            } else {
                modifierM3421r = AbstractC1102d.m3421r(c2314t, enumC11681g2.getWidth(), fM134206getWidthD9Ej5fM);
            }
            Modifier modifier4 = modifierM3421r;
            zM87147d = c28655q.m87147d(fFloatValue) | c28655q.m87147d(fFloatValue2);
            objM87133R = c28655q.m87133R();
            if (zM87147d) {
                objM87133R = new C11005v0(fFloatValue, fFloatValue2, 1);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C11005v0(fFloatValue, fFloatValue2, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC26165a abstractC26165aM64500i4 = AbstractC22404p.m64500i(abstractC22403o2, null, (Function1) objM87133R, c28655q, (i19 >> 3) & 14, 1);
            if (textResource6 == null) {
                c28655q.m87150e0(-1073535585);
                c28655q.m87173q(false);
                strM21274h = null;
            } else {
                c28655q.m87150e0(-1073535584);
                strM21274h = AbstractC8693b.m21274h(textResource6, c28655q, 0);
                c28655q.m87173q(false);
            }
            AbstractC29125c.m88522c(abstractC26165aM64500i4, strM21274h, modifier4, null, C39102j.f168199a, 0.0f, null, c28655q, 24576, 104);
            m31096B(c28655q, 0);
            if (textResource5 != null) {
                c28655q.m87150e0(-1073416172);
                m31129v(textResource5, c28655q, (i19 >> 21) & 14);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1073381576);
                c28655q.m87173q(false);
            }
            if (abstractC11684j instanceof AbstractC11684j.c) {
                cVar = (AbstractC11684j.c) abstractC11684j;
            } else {
                cVar = null;
            }
            TextResource textResource13 = textResource9;
            m31122o(num, textResource7, textResource13, textResource4, z4, cVar != null ? cVar.getTextSubType() : null, z13, c28655q, ((i19 >> 9) & 8190) | ((i19 >> 12) & 57344) | ((i24 << 18) & 3670016), 0);
            textResource8 = textResource13;
        } else {
            enumC11681g2 = enumC11681g;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11677c(enumC11681g2, abstractC22403o, textResource6, num, textResource2, textResource8, textResource4, textResource5, z4, abstractC11684j, z13, i13, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m31099E(float f13, float f14, C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.m75120d((int) f13, (int) f14);
        rememberImagePainter.f100086j = new C29227a(0, 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m31100F(EnumC11681g enumC11681g, AbstractC22403o abstractC22403o, TextResource textResource, Integer num, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, boolean z4, AbstractC11684j abstractC11684j, boolean z13, int i13, int i14, int i15, Composer composer, int i16) {
        m31098D(enumC11681g, abstractC22403o, textResource, num, textResource2, textResource3, textResource4, textResource5, z4, abstractC11684j, z13, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final void m31101G(int i13, Composer composer, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2027902412);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(8 * f13, c2314t);
            C38072d c38072d = C38072d.f163053a;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3419p, c38072d.m121949b(c28655q, 6).getBlack70(), AbstractC33253j.f138651a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
            AbstractC23164r1.m67133b(AbstractC34132o.m107874S(i13, c28655q, ((i15 << 3) & 112) | 6), null, AbstractC1102d.m3419p(f13 * f13, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3444h(i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m31102H(int i13, int i14, Composer composer, int i15) {
        m31101G(i13, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final void m31103I(AbstractC22403o abstractC22403o, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1467189617);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, i14 & 14, 3), null, AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t, "ArticleTileImage")), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * 8, AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9106I, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m31105K(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11678d(abstractC22403o, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m31104J(AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m31103I(abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final void m31105K(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(49608673);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(8 * f13, c2314t);
            C38072d c38072d = C38072d.f163053a;
            Modifier modifierM95629e = AbstractC31061c.m95629e(modifierM3419p, 2, f13, c38072d.m121949b(c28655q, 6).getBrandWhite());
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM95629e);
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
            AbstractC23164r1.m67133b(AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getPlay(), c28655q, 6), null, AbstractC1102d.m3419p(5 * f13, c2314t), c38072d.m121949b(c28655q, 6).getBrandBlack(), c28655q, 432, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m31106L(int i13, Composer composer, int i14) {
        m31105K(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final C2886a m31107M(AbstractC11683i abstractC11683i, boolean z4, TextResource textResource, boolean z13, Composer composer, int i13) {
        if (z13 || AbstractC22676k.m65745e(abstractC11683i, AbstractC11683i.a.f37764a) || (z4 && AbstractC8693b.m21269c(textResource))) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(544267343);
            C2886a c2886aM8421b = C38072d.f163053a.m121952e(c28655q, 6).getB2();
            c28655q.m87173q(false);
            return c2886aM8421b;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(544268527);
        C2886a c2886aM8437r = C38072d.f163053a.m121952e(c28655q2, 6).getH4();
        c28655q2.m87173q(false);
        return c2886aM8437r;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:102:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:106:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:109:0x031e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0331  */
    /* JADX WARN: Code duplicated, block: B:114:0x033c  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:71:0x0101  */
    /* JADX WARN: Code duplicated, block: B:74:0x0112  */
    /* JADX WARN: Code duplicated, block: B:78:0x0141  */
    /* JADX WARN: Code duplicated, block: B:79:0x0145  */
    /* JADX WARN: Code duplicated, block: B:82:0x0152  */
    /* JADX WARN: Code duplicated, block: B:84:0x0160  */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:88:0x0175  */
    /* JADX WARN: Code duplicated, block: B:90:0x017e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0193  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:96:0x0244  */
    /* JADX WARN: Code duplicated, block: B:99:0x0259  */
    /* JADX INFO: renamed from: o */
    private static final void m31122o(Integer num, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, AbstractC11683i abstractC11683i, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        TextResource textResource4;
        int i16;
        boolean z14;
        TextResource textResource5;
        C28677v1 c28677v1M87180u;
        TextResource textResource6;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource textResource7;
        int iHashCode2;
        boolean z15;
        TextResource textResource8;
        int i17;
        C2886a c2886aM8439t;
        int i18;
        int i19;
        int i24;
        int i25;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1394705925);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(num) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(textResource) ? 32 : 16;
        }
        int i26 = i14 & 4;
        if (i26 == 0) {
            if ((i13 & 384) == 0) {
                textResource4 = textResource2;
                i15 |= c28655q.m87153g(textResource4) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87153g(textResource3)) {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i25;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87155h(z4)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i24;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87153g(abstractC11683i)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q.m87155h(z13)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i15 |= i18;
            }
            i16 = i15;
            if ((i16 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                if (i26 != 0) {
                    textResource6 = null;
                } else {
                    textResource6 = textResource4;
                }
                c2314t = C2314t.f9131w;
                float f13 = 8;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), ((float) 1.5d) * f13, 2 * f13);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9104G, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
                if (c28655q.f115903S) {
                    textResource7 = textResource6;
                } else {
                    textResource7 = textResource6;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    if (num == null) {
                        c28655q.m87150e0(175453870);
                        c28655q.m87173q(false);
                        z15 = false;
                    } else {
                        c28655q.m87150e0(175453871);
                        if (z4) {
                            c28655q.m87150e0(1145648327);
                            m31101G(num.intValue(), c28655q, i16 & 14);
                            c28655q.m87173q(false);
                            z15 = false;
                        } else {
                            c28655q.m87150e0(1145719286);
                            z15 = false;
                            AbstractC23164r1.m67133b(AbstractC34132o.m107874S(num.intValue(), c28655q, ((i16 << 3) & 112) | 6), null, AbstractC1102d.m3419p(6 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z15);
                    }
                    if (AbstractC8693b.m21270d(textResource)) {
                        c28655q.m87150e0(175915213);
                        int i27 = i16 >> 3;
                        int i28 = i16 >> 9;
                        C28655q c28655q2 = c28655q;
                        textResource8 = textResource7;
                        i17 = 6;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i27 & 14), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, m31107M(abstractC11683i, z4, textResource3, z13, c28655q, (i27 & 896) | ((i16 >> 15) & 14) | (i28 & 112) | (i28 & 7168)), null, c28655q2, 0, 3120, 186362);
                        c28655q = c28655q2;
                        c28655q.m87173q(z15);
                    } else {
                        textResource8 = textResource7;
                        i17 = 6;
                        c28655q.m87150e0(176234699);
                        c28655q.m87173q(z15);
                    }
                    if (AbstractC8693b.m21270d(textResource3)) {
                        c28655q.m87150e0(176297443);
                        String strM21274h = AbstractC8693b.m21274h(textResource3, c28655q, (i16 >> 9) & 14);
                        C38072d c38072d = C38072d.f163053a;
                        C28655q c28655q3 = c28655q;
                        AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 5, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q3, 0, 3120, 186362);
                        c28655q = c28655q3;
                        c28655q.m87173q(z15);
                    } else {
                        c28655q.m87150e0(176565035);
                        c28655q.m87173q(z15);
                    }
                    if (textResource8 != null) {
                        c28655q.m87150e0(176625268);
                        TextResource textResource9 = textResource8;
                        String strM21274h2 = AbstractC8693b.m21274h(textResource9, c28655q, (i16 >> 6) & 14);
                        if (z13) {
                            c28655q.m87150e0(836985881);
                            c2886aM8439t = C38072d.f163053a.m121952e(c28655q, i17).getB2();
                        } else {
                            c28655q.m87150e0(836986841);
                            c2886aM8439t = C38072d.f163053a.m121952e(c28655q, i17).getH6();
                        }
                        c28655q.m87173q(z15);
                        textResource8 = textResource9;
                        C28655q c28655q4 = c28655q;
                        AbstractC30795n.m94707h(strM21274h2, null, C38072d.f163053a.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t, null, c28655q4, 0, 0, 196602);
                        c28655q = c28655q4;
                        c28655q.m87173q(z15);
                    } else {
                        c28655q.m87150e0(176876523);
                        c28655q.m87173q(z15);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    textResource5 = textResource8;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                if (num == null) {
                    c28655q.m87150e0(175453870);
                    c28655q.m87173q(false);
                    z15 = false;
                } else {
                    c28655q.m87150e0(175453871);
                    if (z4) {
                        c28655q.m87150e0(1145648327);
                        m31101G(num.intValue(), c28655q, i16 & 14);
                        c28655q.m87173q(false);
                        z15 = false;
                    } else {
                        c28655q.m87150e0(1145719286);
                        z15 = false;
                        AbstractC23164r1.m67133b(AbstractC34132o.m107874S(num.intValue(), c28655q, ((i16 << 3) & 112) | 6), null, AbstractC1102d.m3419p(6 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                }
                if (AbstractC8693b.m21270d(textResource)) {
                    c28655q.m87150e0(175915213);
                    int i29 = i16 >> 3;
                    int i210 = i16 >> 9;
                    C28655q c28655q5 = c28655q;
                    textResource8 = textResource7;
                    i17 = 6;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i29 & 14), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, m31107M(abstractC11683i, z4, textResource3, z13, c28655q, (i29 & 896) | ((i16 >> 15) & 14) | (i210 & 112) | (i210 & 7168)), null, c28655q5, 0, 3120, 186362);
                    c28655q = c28655q5;
                    c28655q.m87173q(z15);
                } else {
                    textResource8 = textResource7;
                    i17 = 6;
                    c28655q.m87150e0(176234699);
                    c28655q.m87173q(z15);
                }
                if (AbstractC8693b.m21270d(textResource3)) {
                    c28655q.m87150e0(176297443);
                    String strM21274h3 = AbstractC8693b.m21274h(textResource3, c28655q, (i16 >> 9) & 14);
                    C38072d c38072d2 = C38072d.f163053a;
                    C28655q c28655q6 = c28655q;
                    AbstractC30795n.m94707h(strM21274h3, null, c38072d2.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 5, 0, null, c38072d2.m121952e(c28655q, i17).getB2(), null, c28655q6, 0, 3120, 186362);
                    c28655q = c28655q6;
                    c28655q.m87173q(z15);
                } else {
                    c28655q.m87150e0(176565035);
                    c28655q.m87173q(z15);
                }
                if (textResource8 != null) {
                    c28655q.m87150e0(176625268);
                    TextResource textResource10 = textResource8;
                    String strM21274h4 = AbstractC8693b.m21274h(textResource10, c28655q, (i16 >> 6) & 14);
                    if (z13) {
                        c28655q.m87150e0(836985881);
                        c2886aM8439t = C38072d.f163053a.m121952e(c28655q, i17).getB2();
                    } else {
                        c28655q.m87150e0(836986841);
                        c2886aM8439t = C38072d.f163053a.m121952e(c28655q, i17).getH6();
                    }
                    c28655q.m87173q(z15);
                    textResource8 = textResource10;
                    C28655q c28655q7 = c28655q;
                    AbstractC30795n.m94707h(strM21274h4, null, C38072d.f163053a.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t, null, c28655q7, 0, 0, 196602);
                    c28655q = c28655q7;
                    c28655q.m87173q(z15);
                } else {
                    c28655q.m87150e0(176876523);
                    c28655q.m87173q(z15);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                textResource5 = textResource8;
            } else {
                c28655q.m87138X();
                textResource5 = textResource4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2648w3(num, textResource, textResource5, textResource3, z4, abstractC11683i, z13, i13, i14);
            }
        }
        i15 |= 384;
        textResource4 = textResource2;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87153g(textResource3)) {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i25;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q.m87155h(z4)) {
                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i24;
        }
        if ((196608 & i13) == 0) {
            if (c28655q.m87153g(abstractC11683i)) {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i19;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q.m87155h(z13)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i15 |= i18;
        }
        i16 = i15;
        if ((i16 & 599187) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            if (i26 != 0) {
                textResource6 = null;
            } else {
                textResource6 = textResource4;
            }
            c2314t = C2314t.f9131w;
            float f14 = 8;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), ((float) 1.5d) * f14, 2 * f14);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9104G, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                textResource7 = textResource6;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                if (num == null) {
                    c28655q.m87150e0(175453870);
                    c28655q.m87173q(false);
                    z15 = false;
                } else {
                    c28655q.m87150e0(175453871);
                    if (z4) {
                        c28655q.m87150e0(1145648327);
                        m31101G(num.intValue(), c28655q, i16 & 14);
                        c28655q.m87173q(false);
                        z15 = false;
                    } else {
                        c28655q.m87150e0(1145719286);
                        z15 = false;
                        AbstractC23164r1.m67133b(AbstractC34132o.m107874S(num.intValue(), c28655q, ((i16 << 3) & 112) | 6), null, AbstractC1102d.m3419p(6 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                }
                if (AbstractC8693b.m21270d(textResource)) {
                    c28655q.m87150e0(175915213);
                    int i211 = i16 >> 3;
                    int i212 = i16 >> 9;
                    C28655q c28655q8 = c28655q;
                    textResource8 = textResource7;
                    i17 = 6;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i211 & 14), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, m31107M(abstractC11683i, z4, textResource3, z13, c28655q, (i211 & 896) | ((i16 >> 15) & 14) | (i212 & 112) | (i212 & 7168)), null, c28655q8, 0, 3120, 186362);
                    c28655q = c28655q8;
                    c28655q.m87173q(z15);
                } else {
                    textResource8 = textResource7;
                    i17 = 6;
                    c28655q.m87150e0(176234699);
                    c28655q.m87173q(z15);
                }
                if (AbstractC8693b.m21270d(textResource3)) {
                    c28655q.m87150e0(176297443);
                    String strM21274h5 = AbstractC8693b.m21274h(textResource3, c28655q, (i16 >> 9) & 14);
                    C38072d c38072d3 = C38072d.f163053a;
                    C28655q c28655q9 = c28655q;
                    AbstractC30795n.m94707h(strM21274h5, null, c38072d3.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 5, 0, null, c38072d3.m121952e(c28655q, i17).getB2(), null, c28655q9, 0, 3120, 186362);
                    c28655q = c28655q9;
                    c28655q.m87173q(z15);
                } else {
                    c28655q.m87150e0(176565035);
                    c28655q.m87173q(z15);
                }
                if (textResource8 != null) {
                    c28655q.m87150e0(176625268);
                    TextResource textResource11 = textResource8;
                    String strM21274h6 = AbstractC8693b.m21274h(textResource11, c28655q, (i16 >> 6) & 14);
                    if (z13) {
                        c28655q.m87150e0(836985881);
                        c2886aM8439t = C38072d.f163053a.m121952e(c28655q, i17).getB2();
                    } else {
                        c28655q.m87150e0(836986841);
                        c2886aM8439t = C38072d.f163053a.m121952e(c28655q, i17).getH6();
                    }
                    c28655q.m87173q(z15);
                    textResource8 = textResource11;
                    C28655q c28655q10 = c28655q;
                    AbstractC30795n.m94707h(strM21274h6, null, C38072d.f163053a.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t, null, c28655q10, 0, 0, 196602);
                    c28655q = c28655q10;
                    c28655q.m87173q(z15);
                } else {
                    c28655q.m87150e0(176876523);
                    c28655q.m87173q(z15);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                textResource5 = textResource8;
            } else {
                textResource7 = textResource6;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            if (num == null) {
                c28655q.m87150e0(175453870);
                c28655q.m87173q(false);
                z15 = false;
            } else {
                c28655q.m87150e0(175453871);
                if (z4) {
                    c28655q.m87150e0(1145648327);
                    m31101G(num.intValue(), c28655q, i16 & 14);
                    c28655q.m87173q(false);
                    z15 = false;
                } else {
                    c28655q.m87150e0(1145719286);
                    z15 = false;
                    AbstractC23164r1.m67133b(AbstractC34132o.m107874S(num.intValue(), c28655q, ((i16 << 3) & 112) | 6), null, AbstractC1102d.m3419p(6 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
            }
            if (AbstractC8693b.m21270d(textResource)) {
                c28655q.m87150e0(175915213);
                int i213 = i16 >> 3;
                int i214 = i16 >> 9;
                C28655q c28655q11 = c28655q;
                textResource8 = textResource7;
                i17 = 6;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i213 & 14), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, m31107M(abstractC11683i, z4, textResource3, z13, c28655q, (i213 & 896) | ((i16 >> 15) & 14) | (i214 & 112) | (i214 & 7168)), null, c28655q11, 0, 3120, 186362);
                c28655q = c28655q11;
                c28655q.m87173q(z15);
            } else {
                textResource8 = textResource7;
                i17 = 6;
                c28655q.m87150e0(176234699);
                c28655q.m87173q(z15);
            }
            if (AbstractC8693b.m21270d(textResource3)) {
                c28655q.m87150e0(176297443);
                String strM21274h7 = AbstractC8693b.m21274h(textResource3, c28655q, (i16 >> 9) & 14);
                C38072d c38072d4 = C38072d.f163053a;
                C28655q c28655q12 = c28655q;
                AbstractC30795n.m94707h(strM21274h7, null, c38072d4.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 5, 0, null, c38072d4.m121952e(c28655q, i17).getB2(), null, c28655q12, 0, 3120, 186362);
                c28655q = c28655q12;
                c28655q.m87173q(z15);
            } else {
                c28655q.m87150e0(176565035);
                c28655q.m87173q(z15);
            }
            if (textResource8 != null) {
                c28655q.m87150e0(176625268);
                TextResource textResource12 = textResource8;
                String strM21274h8 = AbstractC8693b.m21274h(textResource12, c28655q, (i16 >> 6) & 14);
                if (z13) {
                    c28655q.m87150e0(836985881);
                    c2886aM8439t = C38072d.f163053a.m121952e(c28655q, i17).getB2();
                } else {
                    c28655q.m87150e0(836986841);
                    c2886aM8439t = C38072d.f163053a.m121952e(c28655q, i17).getH6();
                }
                c28655q.m87173q(z15);
                textResource8 = textResource12;
                C28655q c28655q13 = c28655q;
                AbstractC30795n.m94707h(strM21274h8, null, C38072d.f163053a.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t, null, c28655q13, 0, 0, 196602);
                c28655q = c28655q13;
                c28655q.m87173q(z15);
            } else {
                c28655q.m87150e0(176876523);
                c28655q.m87173q(z15);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            textResource5 = textResource8;
        } else {
            c28655q.m87138X();
            textResource5 = textResource4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2648w3(num, textResource, textResource5, textResource3, z4, abstractC11683i, z13, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m31123p(Integer num, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, AbstractC11683i abstractC11683i, boolean z13, int i13, int i14, Composer composer, int i15) {
        m31122o(num, textResource, textResource2, textResource3, z4, abstractC11683i, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:91:0x0139  */
    /* JADX WARN: Code duplicated, block: B:94:0x0181  */
    /* JADX WARN: Code duplicated, block: B:97:0x018f  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public static final void m31124q(Modifier modifier, EnumC11681g tileSize, InterfaceC11466a interfaceC11466a, AbstractC11684j type, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z13;
        C28655q c28655q;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a3;
        InterfaceC11466a interfaceC11466a2;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        C13825t c13825tM30800y;
        Modifier modifierM3411h;
        Modifier modifierM3424u;
        boolean z14;
        Object objM87133R;
        Object objM87133R2;
        InterfaceC11466a interfaceC11466a3 = interfaceC11466a;
        AbstractC22676k.m65750j(tileSize, "tileSize");
        AbstractC22676k.m65750j(type, "type");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(325445809);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q2.m87149e(tileSize.ordinal()) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q2.m87153g(interfaceC11466a3) : c28655q2.m87157i(interfaceC11466a3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(type) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i18 = i14 & 32;
        if (i18 == 0) {
            if ((196608 & i13) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                if (i17 != 0) {
                    interfaceC11466a3 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C11132l(22);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (interfaceC11466a3 == null) {
                    c28655q2.m87150e0(1615167698);
                    c28655q2.m87173q(false);
                    c13825tM30800y = null;
                } else {
                    c28655q2.m87150e0(-779181809);
                    c13825tM30800y = AbstractC11471f.m30800y(interfaceC11466a3, (float) 1.5d, c28655q2, ((i15 >> 6) & 14) | 48);
                    c28655q2.m87173q(false);
                }
                modifierM3411h = AbstractC1102d.m3411h(tileSize.getHeight(), c2314t);
                if (a.f37756a[tileSize.ordinal()] == 1) {
                    modifierM3424u = AbstractC1102d.m3409f(1.0f, modifierM3411h);
                } else {
                    modifierM3424u = AbstractC1102d.m3424u(tileSize.getWidth(), modifierM3411h);
                }
                Modifier modifier4 = modifierM3424u;
                z14 = (i15 & 458752) == 131072;
                objM87133R = c28655q2.m87133R();
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C0343e(interfaceC4339a4, 17);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R, 15).mo3471e(modifier2), null, 0L, C22411w.f87680a.m64535a().m64090c(), c13825tM30800y, null, 0.0f, AbstractC37817c.m121344e(-1071077311, c28655q2, new C0341c(type, tileSize, z4)), c28655q, 12582912, 102);
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            interfaceC11466a2 = interfaceC11466a3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(modifier3, tileSize, interfaceC11466a2, type, z4, interfaceC4339a3, i13, i14, 2);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a2 = interfaceC4339a;
        if ((74899 & i15) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            if (i17 != 0) {
                interfaceC11466a3 = null;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C11132l(22);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (interfaceC11466a3 == null) {
                c28655q2.m87150e0(1615167698);
                c28655q2.m87173q(false);
                c13825tM30800y = null;
            } else {
                c28655q2.m87150e0(-779181809);
                c13825tM30800y = AbstractC11471f.m30800y(interfaceC11466a3, (float) 1.5d, c28655q2, ((i15 >> 6) & 14) | 48);
                c28655q2.m87173q(false);
            }
            modifierM3411h = AbstractC1102d.m3411h(tileSize.getHeight(), c2314t);
            if (a.f37756a[tileSize.ordinal()] == 1) {
                modifierM3424u = AbstractC1102d.m3409f(1.0f, modifierM3411h);
            } else {
                modifierM3424u = AbstractC1102d.m3424u(tileSize.getWidth(), modifierM3411h);
            }
            Modifier modifier5 = modifierM3424u;
            if ((i15 & 458752) == 131072) {
            }
            objM87133R = c28655q2.m87133R();
            if (z14) {
                objM87133R = new C0343e(interfaceC4339a4, 17);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C0343e(interfaceC4339a4, 17);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifier5, false, null, null, (InterfaceC4339a) objM87133R, 15).mo3471e(modifier2), null, 0L, C22411w.f87680a.m64535a().m64090c(), c13825tM30800y, null, 0.0f, AbstractC37817c.m121344e(-1071077311, c28655q2, new C0341c(type, tileSize, z4)), c28655q, 12582912, 102);
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        interfaceC11466a2 = interfaceC11466a3;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(modifier3, tileSize, interfaceC11466a2, type, z4, interfaceC4339a3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m31125r() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m31126s(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m31127t(AbstractC11684j abstractC11684j, EnumC11681g enumC11681g, boolean z4, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87138X();
        } else if (AbstractC22676k.m65745e(abstractC11684j, AbstractC11684j.a.f37766a)) {
            c28655q.m87150e0(1486857238);
            m31131x(c28655q, 0);
            c28655q.m87173q(false);
        } else if (abstractC11684j instanceof AbstractC11684j.c) {
            c28655q.m87150e0(1486859675);
            AbstractC11684j.c cVar = (AbstractC11684j.c) abstractC11684j;
            m31098D(enumC11681g, cVar.getImage(), cVar.getImageContentDescription(), cVar.getIconRes(), cVar.getTitle(), cVar.getSubText(), cVar.getBody(), cVar.getTag(), false, abstractC11684j, z4, c28655q, 100663296, 0, 0);
            c28655q.m87173q(false);
        } else if (abstractC11684j instanceof AbstractC11684j.d) {
            c28655q.m87150e0(1486877125);
            AbstractC11684j.d dVar = (AbstractC11684j.d) abstractC11684j;
            m31098D(enumC11681g, dVar.getImage(), null, Integer.valueOf(C38072d.f163053a.m121951d().getTinyIcons().getPlay()), dVar.getTitle(), dVar.getSubText(), dVar.getBody(), dVar.getTag(), true, abstractC11684j, z4, c28655q, 100663296, 0, 4);
            c28655q.m87173q(false);
        } else if (abstractC11684j instanceof AbstractC11684j.e) {
            c28655q.m87150e0(1486892806);
            m31103I(((AbstractC11684j.e) abstractC11684j).getImage(), c28655q, 0);
            c28655q.m87173q(false);
        } else {
            if (!(abstractC11684j instanceof AbstractC11684j.b)) {
                throw AbstractC11895b.m32003v(1486856771, c28655q, false);
            }
            c28655q.m87150e0(1486895325);
            m31133z(((AbstractC11684j.b) abstractC11684j).getImage(), c28655q, 0);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m31128u(Modifier modifier, EnumC11681g enumC11681g, InterfaceC11466a interfaceC11466a, AbstractC11684j abstractC11684j, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m31124q(modifier, enumC11681g, interfaceC11466a, abstractC11684j, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m31129v(TextResource textResource, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(225124661);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9116y, false);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            float f14 = (float) 0.5d;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14 * f13, AbstractC11895b.m31987f(f14, 4, c2314t, c38072d.m121949b(c28655q, 6).getBlack50()));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i14 & 14), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH6(), null, c28655q, 0, 0, 196090);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3428b1(textResource, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m31130w(TextResource textResource, int i13, Composer composer, int i14) {
        m31129v(textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m31131x(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1091271590);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44010T = AbstractC15673b0.m44010T(AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44010T);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 4;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * f13), C2299e.f9111N, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
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
            AbstractC23164r1.m67133b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCom.mapbox.common.MapboxServices.SEARCH java.lang.String(), c28655q, 6), null, AbstractC1102d.m3419p(8 * f13, c2314t), c38072d.m121949b(c28655q, 6).getWhite30(), c28655q, 432, 0);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62221C), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196090);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m31132y(int i13, Composer composer, int i14) {
        m31131x(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m31133z(AbstractC22403o abstractC22403o, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1237884636);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(C2314t.f9131w, "ArticleTileImage")), false, 1.0f);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, i14 & 14, 3);
            abstractC22403o2 = abstractC22403o;
            AbstractC29125c.m88522c(abstractC26165aM64500i, "", modifierM3384f, null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
            c28655q = c28655q;
        } else {
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11678d(abstractC22403o2, i13, 0);
        }
    }
}
