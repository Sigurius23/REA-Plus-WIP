package bs2;

import a31.C0343e;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.exoplayer2.p051ui.StyledPlayerView;
import com.whoop.design.util.AbstractC8693b;
import gy0.AbstractC16277f;
import io.C18744f;
import io.C20033m;
import io.C20710v;
import io.C20711w;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.C2853n;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22989q;
import p309lo.AbstractC24543a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p465rm.C31527e0;
import p465rm.C31533g0;
import p465rm.C31536h0;
import p465rm.C31539i0;
import p465rm.C31541j;
import p465rm.C31545k0;
import p465rm.C31551m0;
import p465rm.C31571u;
import p465rm.InterfaceC31544k;
import p465rm.InterfaceC31582z0;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: bs2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a©\u0001\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "videoUri", "", "shouldImmediatelyPlay", "shouldSubtitlesDefaultToOff", "shouldForceHdVideo", "shouldShowSubtitleButton", "shouldShowUserControls", "shouldShowCloseButton", "shouldRepeatReproduction", "shouldShowBuffering", "Lkotlin/Function0;", "Ll83/a0;", "goFullScreen", "clearFullScreen", "onCrossButtonClicked", "onUserViewedFullVideo", "f", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZZZZZZZLc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V", "Lio/w;", "l", "(Lio/w;ZZ)Lio/w;", "video_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3613f {

    /* JADX INFO: renamed from: bs2.f$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"bs2/f$a", "Lrm/z0;", "", "playbackState", "Ll83/a0;", "onPlaybackStateChanged", "(I)V", "video_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC31582z0 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC4339a f14700w;

        public a(InterfaceC4339a interfaceC4339a) {
            this.f14700w = interfaceC4339a;
        }

        @Override // p465rm.InterfaceC31582z0
        public void onPlaybackStateChanged(int playbackState) {
            if (playbackState == 4) {
                this.f14700w.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: bs2.f$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"bs2/f$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC31544k f14701a;

        public b(InterfaceC31544k interfaceC31544k) {
            this.f14701a = interfaceC31544k;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            ((C31571u) this.f14701a).m97219n0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0150  */
    /* JADX WARN: Code duplicated, block: B:103:0x0153  */
    /* JADX WARN: Code duplicated, block: B:107:0x015b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0161  */
    /* JADX WARN: Code duplicated, block: B:110:0x0164  */
    /* JADX WARN: Code duplicated, block: B:112:0x0169  */
    /* JADX WARN: Code duplicated, block: B:115:0x016f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0175  */
    /* JADX WARN: Code duplicated, block: B:118:0x0178  */
    /* JADX WARN: Code duplicated, block: B:122:0x0180  */
    /* JADX WARN: Code duplicated, block: B:124:0x0186  */
    /* JADX WARN: Code duplicated, block: B:128:0x018e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0194  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:143:0x01be  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:158:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:160:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:165:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:168:0x0218  */
    /* JADX WARN: Code duplicated, block: B:169:0x021c  */
    /* JADX WARN: Code duplicated, block: B:172:0x022f  */
    /* JADX WARN: Code duplicated, block: B:174:0x023d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0255  */
    /* JADX WARN: Code duplicated, block: B:179:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:183:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:184:0x02df  */
    /* JADX WARN: Code duplicated, block: B:186:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:189:0x030a  */
    /* JADX WARN: Code duplicated, block: B:190:0x030c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0317  */
    /* JADX WARN: Code duplicated, block: B:194:0x0319  */
    /* JADX WARN: Code duplicated, block: B:197:0x0321  */
    /* JADX WARN: Code duplicated, block: B:198:0x0323  */
    /* JADX WARN: Code duplicated, block: B:201:0x032d  */
    /* JADX WARN: Code duplicated, block: B:202:0x032f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0339  */
    /* JADX WARN: Code duplicated, block: B:206:0x033b  */
    /* JADX WARN: Code duplicated, block: B:209:0x0343  */
    /* JADX WARN: Code duplicated, block: B:210:0x0345  */
    /* JADX WARN: Code duplicated, block: B:213:0x034d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x0358  */
    /* JADX WARN: Code duplicated, block: B:219:0x0396 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:220:0x0398  */
    /* JADX WARN: Code duplicated, block: B:223:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:225:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:226:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:229:0x03f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:233:0x043c  */
    /* JADX WARN: Code duplicated, block: B:235:0x045a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0472  */
    /* JADX WARN: Code duplicated, block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x0110  */
    /* JADX WARN: Code duplicated, block: B:82:0x0113  */
    /* JADX WARN: Code duplicated, block: B:86:0x011d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0124  */
    /* JADX WARN: Code duplicated, block: B:90:0x0128  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132  */
    /* JADX WARN: Code duplicated, block: B:93:0x0135  */
    /* JADX WARN: Code duplicated, block: B:97:0x013f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0144  */
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
    /* JADX INFO: renamed from: f */
    public static final void m10967f(Modifier modifier, final String videoUri, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, final InterfaceC4339a goFullScreen, final InterfaceC4339a clearFullScreen, final InterfaceC4339a onCrossButtonClicked, final InterfaceC4339a onUserViewedFullVideo, Composer composer, final int i13, final int i14, final int i15) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i16;
        boolean z24;
        int i17;
        int i18;
        boolean z25;
        int i19;
        int i24;
        boolean z26;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        boolean z27;
        C28655q c28655q;
        final boolean z28;
        final boolean z29;
        final boolean z34;
        final boolean z35;
        final Modifier modifier3;
        final boolean z36;
        final boolean z37;
        final boolean z38;
        final boolean z39;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean z44;
        boolean z45;
        boolean z46;
        boolean z47;
        boolean z48;
        boolean z49;
        int i46;
        boolean z52;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Context context;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC31544k interfaceC31544k;
        boolean z54;
        boolean z55;
        boolean z56;
        boolean z57;
        boolean z58;
        boolean z59;
        boolean z60;
        Object objM87133R2;
        InterfaceC31544k interfaceC31544k2;
        boolean z64;
        boolean zM87157i;
        Object objM87133R3;
        boolean z65;
        Object objM87133R4;
        List list;
        C41060w0 c41060w0;
        Uri uri;
        C31539i0 c31539i0;
        int i47;
        int i48;
        int i49;
        AbstractC22676k.m65750j(videoUri, "videoUri");
        AbstractC22676k.m65750j(goFullScreen, "goFullScreen");
        AbstractC22676k.m65750j(clearFullScreen, "clearFullScreen");
        AbstractC22676k.m65750j(onCrossButtonClicked, "onCrossButtonClicked");
        AbstractC22676k.m65750j(onUserViewedFullVideo, "onUserViewedFullVideo");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1279206435);
        int i54 = i15 & 1;
        if (i54 != 0) {
            i16 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87153g(videoUri) ? 32 : 16;
        }
        int i55 = i15 & 4;
        if (i55 == 0) {
            if ((i13 & 384) == 0) {
                z24 = z4;
                i16 |= c28655q2.m87155h(z24) ? 256 : 128;
            }
            i17 = i15 & 8;
            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    z25 = z13;
                    if (c28655q2.m87155h(z25)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = 1024;
                    }
                    i16 |= i19;
                }
                i24 = i15 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        z26 = z14;
                        if (c28655q2.m87155h(z26)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i16 |= i25;
                    }
                    i26 = i15 & 32;
                    if (i26 != 0) {
                        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87155h(z15)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i16 |= i27;
                    }
                    i28 = i15 & 64;
                    if (i28 != 0) {
                        i16 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87155h(z16)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i16 |= i29;
                    }
                    i34 = i15 & 128;
                    if (i34 != 0) {
                        if ((i13 & 12582912) == 0) {
                            if (c28655q2.m87155h(z17)) {
                                i35 = 8388608;
                            } else {
                                i35 = 4194304;
                            }
                            i16 |= i35;
                        }
                        i36 = i15 & 256;
                        if (i36 != 0) {
                            if ((i13 & 100663296) == 0) {
                                if (c28655q2.m87155h(z18)) {
                                    i37 = 67108864;
                                } else {
                                    i37 = AndroidSDKConstants.FLAG_MUTABLE;
                                }
                                i16 |= i37;
                            }
                            i38 = i15 & 512;
                            if (i38 != 0) {
                                i16 |= 805306368;
                            } else if ((i13 & 805306368) == 0) {
                                if (c28655q2.m87155h(z19)) {
                                    i39 = 536870912;
                                } else {
                                    i39 = 268435456;
                                }
                                i16 |= i39;
                            }
                            if ((i14 & 6) == 0) {
                                if (c28655q2.m87157i(goFullScreen)) {
                                    i49 = 4;
                                } else {
                                    i49 = 2;
                                }
                                i44 = i14 | i49;
                            } else {
                                i44 = i14;
                            }
                            if ((i14 & 48) == 0) {
                                if (c28655q2.m87157i(clearFullScreen)) {
                                    i48 = 32;
                                } else {
                                    i48 = 16;
                                }
                                i44 |= i48;
                            }
                            if ((i14 & 384) == 0) {
                                i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                            }
                            if ((i14 & 3072) == 0) {
                                if (c28655q2.m87157i(onUserViewedFullVideo)) {
                                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                }
                                i44 |= i18;
                            }
                            i45 = i44;
                            if ((i16 & 306783379) == 306783378 || (i45 & 1171) != 1170) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            if (c28655q2.m87135U(i16 & 1, z27)) {
                                c2314t = C2314t.f9131w;
                                if (i54 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i55 != 0) {
                                    z24 = true;
                                }
                                if (i17 != 0) {
                                    z25 = false;
                                }
                                if (i24 != 0) {
                                    z26 = false;
                                }
                                if (i26 != 0) {
                                    z44 = true;
                                } else {
                                    z44 = z15;
                                }
                                if (i28 != 0) {
                                    z45 = true;
                                } else {
                                    z45 = z16;
                                }
                                if (i34 != 0) {
                                    z46 = true;
                                } else {
                                    z46 = z17;
                                }
                                if (i36 != 0) {
                                    z47 = false;
                                } else {
                                    z47 = z18;
                                }
                                if (i38 != 0) {
                                    z48 = true;
                                } else {
                                    z48 = z19;
                                }
                                z49 = z44;
                                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                i46 = i16;
                                z52 = z45;
                                iHashCode = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier2);
                                InterfaceC0221l.f734a.getClass();
                                Modifier modifier4 = modifier2;
                                c0213j = C0217k.f724b;
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                                c0209i = C0217k.f732j;
                                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                                objM87133R = c28655q2.m87133R();
                                c28676v0 = C28635l.f115821a;
                                if (objM87133R == c28676v0) {
                                    C31541j c31541j = new C31541j(context);
                                    C20033m c20033m = new C20033m(context);
                                    AbstractC24543a.m71573i(!c31541j.f130194q);
                                    c31541j.f130182e = new C2853n(c20033m, 3);
                                    AbstractC24543a.m71573i(!c31541j.f130194q);
                                    c31541j.f130194q = true;
                                    C31571u c31571u = new C31571u(c31541j);
                                    C18744f c18744fM97213g0 = c31571u.m97213g0();
                                    AbstractC22676k.m65749i(c18744fM97213g0, "getTrackSelectionParameters(...)");
                                    c31571u.m97227v0(m10973l(c18744fM97213g0, z25, z26));
                                    C31527e0 c31527e0 = new C31527e0();
                                    C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                                    C41060w0 c41060w1 = C41060w0.f177067E;
                                    list = Collections.EMPTY_LIST;
                                    c41060w0 = C41060w0.f177067E;
                                    uri = Uri.parse(videoUri);
                                    if (uri != null) {
                                        c31539i0 = new C31539i0(uri, null, list, c41060w0);
                                    } else {
                                        c31539i0 = null;
                                    }
                                    c31571u.m381O(new C31545k0("", new C31533g0(c31527e0), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                                    c31571u.m97225t0(z24);
                                    if (z47) {
                                        i47 = 2;
                                    } else {
                                        i47 = 0;
                                    }
                                    c31571u.m97226u0(i47);
                                    c31571u.m97218m0();
                                    c28655q2.m87172p0(c31571u);
                                    objM87133R = c31571u;
                                }
                                interfaceC31544k = (InterfaceC31544k) objM87133R;
                                AbstractC22676k.m65747g(interfaceC31544k);
                                Modifier modifierM3599a = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                                if ((i46 & 3670016) == 1048576) {
                                    z54 = true;
                                } else {
                                    z54 = false;
                                }
                                boolean zM87157i2 = z54 | c28655q2.m87157i(interfaceC31544k);
                                if ((i45 & 14) == 4) {
                                    z55 = true;
                                } else {
                                    z55 = false;
                                }
                                boolean z66 = zM87157i2 | z55;
                                if ((i45 & 112) == 32) {
                                    z56 = true;
                                } else {
                                    z56 = false;
                                }
                                boolean z67 = z66 | z56;
                                if ((i46 & 458752) == 131072) {
                                    z57 = true;
                                } else {
                                    z57 = false;
                                }
                                boolean z68 = z67 | z57;
                                if ((i46 & 1879048192) == 536870912) {
                                    z58 = true;
                                } else {
                                    z58 = false;
                                }
                                boolean z69 = z68 | z58;
                                if ((i45 & 7168) == 2048) {
                                    z59 = true;
                                } else {
                                    z59 = false;
                                }
                                z60 = z69 | z59;
                                objM87133R2 = c28655q2.m87133R();
                                if (!z60 || objM87133R2 == c28676v0) {
                                    boolean z74 = z48;
                                    objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z74, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                                    interfaceC31544k2 = interfaceC31544k;
                                    z64 = z74;
                                    c28655q2.m87172p0(objM87133R2);
                                } else {
                                    interfaceC31544k2 = interfaceC31544k;
                                    z64 = z48;
                                }
                                AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a, null, c28655q2, 0, 4);
                                c28655q = c28655q2;
                                zM87157i = c28655q.m87157i(interfaceC31544k2);
                                objM87133R3 = c28655q.m87133R();
                                if (zM87157i || objM87133R3 == c28676v0) {
                                    objM87133R3 = new C3610c(interfaceC31544k2, 0);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                                if (z46) {
                                    c28655q.m87150e0(1094583544);
                                    C38072d c38072d = C38072d.f163053a;
                                    C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCross(), c28655q, 6);
                                    String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                                    float f13 = 4;
                                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f13, AbstractC1099a.m3394p(6 * f13, c2314t))), "closeIcon");
                                    if ((i45 & 896) == 256) {
                                        z65 = true;
                                    } else {
                                        z65 = false;
                                    }
                                    objM87133R4 = c28655q.m87133R();
                                    if (z65 || objM87133R4 == c28676v0) {
                                        objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S, strM21273g, AbstractC1092a.m3362g(modifierM3599a2, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(1095124587);
                                    c28655q.m87173q(false);
                                }
                                c28655q.m87173q(true);
                                z37 = z49;
                                z38 = z52;
                                z39 = z64;
                                z36 = z24;
                                z28 = z46;
                                z29 = z47;
                                modifier3 = modifier4;
                                z34 = z25;
                                z35 = z26;
                            } else {
                                c28655q = c28655q2;
                                c28655q.m87138X();
                                z28 = z17;
                                z29 = z18;
                                z34 = z25;
                                z35 = z26;
                                modifier3 = modifier2;
                                z36 = z24;
                                z37 = z15;
                                z38 = z16;
                                z39 = z19;
                            }
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i16 |= 100663296;
                        i38 = i15 & 512;
                        if (i38 != 0) {
                            i16 |= 805306368;
                        } else if ((i13 & 805306368) == 0) {
                            if (c28655q2.m87155h(z19)) {
                                i39 = 536870912;
                            } else {
                                i39 = 268435456;
                            }
                            i16 |= i39;
                        }
                        if ((i14 & 6) == 0) {
                            if (c28655q2.m87157i(goFullScreen)) {
                                i49 = 4;
                            } else {
                                i49 = 2;
                            }
                            i44 = i14 | i49;
                        } else {
                            i44 = i14;
                        }
                        if ((i14 & 48) == 0) {
                            if (c28655q2.m87157i(clearFullScreen)) {
                                i48 = 32;
                            } else {
                                i48 = 16;
                            }
                            i44 |= i48;
                        }
                        if ((i14 & 384) == 0) {
                            i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                        }
                        if ((i14 & 3072) == 0) {
                            if (c28655q2.m87157i(onUserViewedFullVideo)) {
                                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            }
                            i44 |= i18;
                        }
                        i45 = i44;
                        if ((i16 & 306783379) == 306783378) {
                            z27 = true;
                        } else {
                            z27 = true;
                        }
                        if (c28655q2.m87135U(i16 & 1, z27)) {
                            c2314t = C2314t.f9131w;
                            if (i54 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i55 != 0) {
                                z24 = true;
                            }
                            if (i17 != 0) {
                                z25 = false;
                            }
                            if (i24 != 0) {
                                z26 = false;
                            }
                            if (i26 != 0) {
                                z44 = true;
                            } else {
                                z44 = z15;
                            }
                            if (i28 != 0) {
                                z45 = true;
                            } else {
                                z45 = z16;
                            }
                            if (i34 != 0) {
                                z46 = true;
                            } else {
                                z46 = z17;
                            }
                            if (i36 != 0) {
                                z47 = false;
                            } else {
                                z47 = z18;
                            }
                            if (i38 != 0) {
                                z48 = true;
                            } else {
                                z48 = z19;
                            }
                            z49 = z44;
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            i46 = i16;
                            z52 = z45;
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifier2);
                            InterfaceC0221l.f734a.getClass();
                            Modifier modifier5 = modifier2;
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                            context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                            objM87133R = c28655q2.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R == c28676v0) {
                                C31541j c31541j2 = new C31541j(context);
                                C20033m c20033m2 = new C20033m(context);
                                AbstractC24543a.m71573i(!c31541j2.f130194q);
                                c31541j2.f130182e = new C2853n(c20033m2, 3);
                                AbstractC24543a.m71573i(!c31541j2.f130194q);
                                c31541j2.f130194q = true;
                                C31571u c31571u2 = new C31571u(c31541j2);
                                C18744f c18744fM97213g1 = c31571u2.m97213g0();
                                AbstractC22676k.m65749i(c18744fM97213g1, "getTrackSelectionParameters(...)");
                                c31571u2.m97227v0(m10973l(c18744fM97213g1, z25, z26));
                                C31527e0 c31527e1 = new C31527e0();
                                C41017e0 c41017e1 = AbstractC41023g0.f176998x;
                                C41060w0 c41060w2 = C41060w0.f177067E;
                                list = Collections.EMPTY_LIST;
                                c41060w0 = C41060w0.f177067E;
                                uri = Uri.parse(videoUri);
                                if (uri != null) {
                                    c31539i0 = new C31539i0(uri, null, list, c41060w0);
                                } else {
                                    c31539i0 = null;
                                }
                                c31571u2.m381O(new C31545k0("", new C31533g0(c31527e1), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                                c31571u2.m97225t0(z24);
                                if (z47) {
                                    i47 = 2;
                                } else {
                                    i47 = 0;
                                }
                                c31571u2.m97226u0(i47);
                                c31571u2.m97218m0();
                                c28655q2.m87172p0(c31571u2);
                                objM87133R = c31571u2;
                            }
                            interfaceC31544k = (InterfaceC31544k) objM87133R;
                            AbstractC22676k.m65747g(interfaceC31544k);
                            Modifier modifierM3599a3 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                            if ((i46 & 3670016) == 1048576) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            boolean zM87157i3 = z54 | c28655q2.m87157i(interfaceC31544k);
                            if ((i45 & 14) == 4) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                            boolean z610 = zM87157i3 | z55;
                            if ((i45 & 112) == 32) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            boolean z611 = z610 | z56;
                            if ((i46 & 458752) == 131072) {
                                z57 = true;
                            } else {
                                z57 = false;
                            }
                            boolean z612 = z611 | z57;
                            if ((i46 & 1879048192) == 536870912) {
                                z58 = true;
                            } else {
                                z58 = false;
                            }
                            boolean z613 = z612 | z58;
                            if ((i45 & 7168) == 2048) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                            z60 = z613 | z59;
                            objM87133R2 = c28655q2.m87133R();
                            if (z60) {
                                boolean z75 = z48;
                                objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z75, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                                interfaceC31544k2 = interfaceC31544k;
                                z64 = z75;
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                boolean z76 = z48;
                                objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z76, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                                interfaceC31544k2 = interfaceC31544k;
                                z64 = z76;
                                c28655q2.m87172p0(objM87133R2);
                            }
                            AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a3, null, c28655q2, 0, 4);
                            c28655q = c28655q2;
                            zM87157i = c28655q.m87157i(interfaceC31544k2);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R3 = new C3610c(interfaceC31544k2, 0);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C3610c(interfaceC31544k2, 0);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                            if (z46) {
                                c28655q.m87150e0(1094583544);
                                C38072d c38072d2 = C38072d.f163053a;
                                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c38072d2.m121951d().getAction().getCross(), c28655q, 6);
                                String strM21273g2 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                                float f14 = 4;
                                Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f14, AbstractC1099a.m3394p(6 * f14, c2314t))), "closeIcon");
                                if ((i45 & 896) == 256) {
                                    z65 = true;
                                } else {
                                    z65 = false;
                                }
                                objM87133R4 = c28655q.m87133R();
                                if (z65) {
                                    objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S2, strM21273g2, AbstractC1092a.m3362g(modifierM3599a4, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d2.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1095124587);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            z37 = z49;
                            z38 = z52;
                            z39 = z64;
                            z36 = z24;
                            z28 = z46;
                            z29 = z47;
                            modifier3 = modifier5;
                            z34 = z25;
                            z35 = z26;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            z28 = z17;
                            z29 = z18;
                            z34 = z25;
                            z35 = z26;
                            modifier3 = modifier2;
                            z36 = z24;
                            z37 = z15;
                            z38 = z16;
                            z39 = z19;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i16 |= 12582912;
                    i36 = i15 & 256;
                    if (i36 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87155h(z18)) {
                                i37 = 67108864;
                            } else {
                                i37 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i16 |= i37;
                        }
                        i38 = i15 & 512;
                        if (i38 != 0) {
                            i16 |= 805306368;
                        } else if ((i13 & 805306368) == 0) {
                            if (c28655q2.m87155h(z19)) {
                                i39 = 536870912;
                            } else {
                                i39 = 268435456;
                            }
                            i16 |= i39;
                        }
                        if ((i14 & 6) == 0) {
                            if (c28655q2.m87157i(goFullScreen)) {
                                i49 = 4;
                            } else {
                                i49 = 2;
                            }
                            i44 = i14 | i49;
                        } else {
                            i44 = i14;
                        }
                        if ((i14 & 48) == 0) {
                            if (c28655q2.m87157i(clearFullScreen)) {
                                i48 = 32;
                            } else {
                                i48 = 16;
                            }
                            i44 |= i48;
                        }
                        if ((i14 & 384) == 0) {
                            i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                        }
                        if ((i14 & 3072) == 0) {
                            if (c28655q2.m87157i(onUserViewedFullVideo)) {
                                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            }
                            i44 |= i18;
                        }
                        i45 = i44;
                        if ((i16 & 306783379) == 306783378) {
                            z27 = true;
                        } else {
                            z27 = true;
                        }
                        if (c28655q2.m87135U(i16 & 1, z27)) {
                            c2314t = C2314t.f9131w;
                            if (i54 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i55 != 0) {
                                z24 = true;
                            }
                            if (i17 != 0) {
                                z25 = false;
                            }
                            if (i24 != 0) {
                                z26 = false;
                            }
                            if (i26 != 0) {
                                z44 = true;
                            } else {
                                z44 = z15;
                            }
                            if (i28 != 0) {
                                z45 = true;
                            } else {
                                z45 = z16;
                            }
                            if (i34 != 0) {
                                z46 = true;
                            } else {
                                z46 = z17;
                            }
                            if (i36 != 0) {
                                z47 = false;
                            } else {
                                z47 = z18;
                            }
                            if (i38 != 0) {
                                z48 = true;
                            } else {
                                z48 = z19;
                            }
                            z49 = z44;
                            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            i46 = i16;
                            z52 = z45;
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifier2);
                            InterfaceC0221l.f734a.getClass();
                            Modifier modifier6 = modifier2;
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                            context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                            objM87133R = c28655q2.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R == c28676v0) {
                                C31541j c31541j3 = new C31541j(context);
                                C20033m c20033m3 = new C20033m(context);
                                AbstractC24543a.m71573i(!c31541j3.f130194q);
                                c31541j3.f130182e = new C2853n(c20033m3, 3);
                                AbstractC24543a.m71573i(!c31541j3.f130194q);
                                c31541j3.f130194q = true;
                                C31571u c31571u3 = new C31571u(c31541j3);
                                C18744f c18744fM97213g2 = c31571u3.m97213g0();
                                AbstractC22676k.m65749i(c18744fM97213g2, "getTrackSelectionParameters(...)");
                                c31571u3.m97227v0(m10973l(c18744fM97213g2, z25, z26));
                                C31527e0 c31527e2 = new C31527e0();
                                C41017e0 c41017e2 = AbstractC41023g0.f176998x;
                                C41060w0 c41060w3 = C41060w0.f177067E;
                                list = Collections.EMPTY_LIST;
                                c41060w0 = C41060w0.f177067E;
                                uri = Uri.parse(videoUri);
                                if (uri != null) {
                                    c31539i0 = new C31539i0(uri, null, list, c41060w0);
                                } else {
                                    c31539i0 = null;
                                }
                                c31571u3.m381O(new C31545k0("", new C31533g0(c31527e2), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                                c31571u3.m97225t0(z24);
                                if (z47) {
                                    i47 = 2;
                                } else {
                                    i47 = 0;
                                }
                                c31571u3.m97226u0(i47);
                                c31571u3.m97218m0();
                                c28655q2.m87172p0(c31571u3);
                                objM87133R = c31571u3;
                            }
                            interfaceC31544k = (InterfaceC31544k) objM87133R;
                            AbstractC22676k.m65747g(interfaceC31544k);
                            Modifier modifierM3599a5 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                            if ((i46 & 3670016) == 1048576) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            boolean zM87157i4 = z54 | c28655q2.m87157i(interfaceC31544k);
                            if ((i45 & 14) == 4) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                            boolean z614 = zM87157i4 | z55;
                            if ((i45 & 112) == 32) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            boolean z615 = z614 | z56;
                            if ((i46 & 458752) == 131072) {
                                z57 = true;
                            } else {
                                z57 = false;
                            }
                            boolean z616 = z615 | z57;
                            if ((i46 & 1879048192) == 536870912) {
                                z58 = true;
                            } else {
                                z58 = false;
                            }
                            boolean z617 = z616 | z58;
                            if ((i45 & 7168) == 2048) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                            z60 = z617 | z59;
                            objM87133R2 = c28655q2.m87133R();
                            if (z60) {
                                boolean z77 = z48;
                                objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z77, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                                interfaceC31544k2 = interfaceC31544k;
                                z64 = z77;
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                boolean z78 = z48;
                                objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z78, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                                interfaceC31544k2 = interfaceC31544k;
                                z64 = z78;
                                c28655q2.m87172p0(objM87133R2);
                            }
                            AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a5, null, c28655q2, 0, 4);
                            c28655q = c28655q2;
                            zM87157i = c28655q.m87157i(interfaceC31544k2);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R3 = new C3610c(interfaceC31544k2, 0);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C3610c(interfaceC31544k2, 0);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                            if (z46) {
                                c28655q.m87150e0(1094583544);
                                C38072d c38072d3 = C38072d.f163053a;
                                C27430e c27430eM107874S3 = AbstractC34132o.m107874S(c38072d3.m121951d().getAction().getCross(), c28655q, 6);
                                String strM21273g3 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                                float f15 = 4;
                                Modifier modifierM3599a6 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f15, AbstractC1099a.m3394p(6 * f15, c2314t))), "closeIcon");
                                if ((i45 & 896) == 256) {
                                    z65 = true;
                                } else {
                                    z65 = false;
                                }
                                objM87133R4 = c28655q.m87133R();
                                if (z65) {
                                    objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S3, strM21273g3, AbstractC1092a.m3362g(modifierM3599a6, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d3.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1095124587);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            z37 = z49;
                            z38 = z52;
                            z39 = z64;
                            z36 = z24;
                            z28 = z46;
                            z29 = z47;
                            modifier3 = modifier6;
                            z34 = z25;
                            z35 = z26;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            z28 = z17;
                            z29 = z18;
                            z34 = z25;
                            z35 = z26;
                            modifier3 = modifier2;
                            z36 = z24;
                            z37 = z15;
                            z38 = z16;
                            z39 = z19;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i16 |= 100663296;
                    i38 = i15 & 512;
                    if (i38 != 0) {
                        i16 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87155h(z19)) {
                            i39 = 536870912;
                        } else {
                            i39 = 268435456;
                        }
                        i16 |= i39;
                    }
                    if ((i14 & 6) == 0) {
                        if (c28655q2.m87157i(goFullScreen)) {
                            i49 = 4;
                        } else {
                            i49 = 2;
                        }
                        i44 = i14 | i49;
                    } else {
                        i44 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87157i(clearFullScreen)) {
                            i48 = 32;
                        } else {
                            i48 = 16;
                        }
                        i44 |= i48;
                    }
                    if ((i14 & 384) == 0) {
                        i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                    }
                    if ((i14 & 3072) == 0) {
                        if (c28655q2.m87157i(onUserViewedFullVideo)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i44 |= i18;
                    }
                    i45 = i44;
                    if ((i16 & 306783379) == 306783378) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z27)) {
                        c2314t = C2314t.f9131w;
                        if (i54 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i55 != 0) {
                            z24 = true;
                        }
                        if (i17 != 0) {
                            z25 = false;
                        }
                        if (i24 != 0) {
                            z26 = false;
                        }
                        if (i26 != 0) {
                            z44 = true;
                        } else {
                            z44 = z15;
                        }
                        if (i28 != 0) {
                            z45 = true;
                        } else {
                            z45 = z16;
                        }
                        if (i34 != 0) {
                            z46 = true;
                        } else {
                            z46 = z17;
                        }
                        if (i36 != 0) {
                            z47 = false;
                        } else {
                            z47 = z18;
                        }
                        if (i38 != 0) {
                            z48 = true;
                        } else {
                            z48 = z19;
                        }
                        z49 = z44;
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        i46 = i16;
                        z52 = z45;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier7 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                        context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            C31541j c31541j4 = new C31541j(context);
                            C20033m c20033m4 = new C20033m(context);
                            AbstractC24543a.m71573i(!c31541j4.f130194q);
                            c31541j4.f130182e = new C2853n(c20033m4, 3);
                            AbstractC24543a.m71573i(!c31541j4.f130194q);
                            c31541j4.f130194q = true;
                            C31571u c31571u4 = new C31571u(c31541j4);
                            C18744f c18744fM97213g3 = c31571u4.m97213g0();
                            AbstractC22676k.m65749i(c18744fM97213g3, "getTrackSelectionParameters(...)");
                            c31571u4.m97227v0(m10973l(c18744fM97213g3, z25, z26));
                            C31527e0 c31527e3 = new C31527e0();
                            C41017e0 c41017e3 = AbstractC41023g0.f176998x;
                            C41060w0 c41060w4 = C41060w0.f177067E;
                            list = Collections.EMPTY_LIST;
                            c41060w0 = C41060w0.f177067E;
                            uri = Uri.parse(videoUri);
                            if (uri != null) {
                                c31539i0 = new C31539i0(uri, null, list, c41060w0);
                            } else {
                                c31539i0 = null;
                            }
                            c31571u4.m381O(new C31545k0("", new C31533g0(c31527e3), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                            c31571u4.m97225t0(z24);
                            if (z47) {
                                i47 = 2;
                            } else {
                                i47 = 0;
                            }
                            c31571u4.m97226u0(i47);
                            c31571u4.m97218m0();
                            c28655q2.m87172p0(c31571u4);
                            objM87133R = c31571u4;
                        }
                        interfaceC31544k = (InterfaceC31544k) objM87133R;
                        AbstractC22676k.m65747g(interfaceC31544k);
                        Modifier modifierM3599a7 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                        if ((i46 & 3670016) == 1048576) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zM87157i5 = z54 | c28655q2.m87157i(interfaceC31544k);
                        if ((i45 & 14) == 4) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                        boolean z618 = zM87157i5 | z55;
                        if ((i45 & 112) == 32) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean z619 = z618 | z56;
                        if ((i46 & 458752) == 131072) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        boolean z6110 = z619 | z57;
                        if ((i46 & 1879048192) == 536870912) {
                            z58 = true;
                        } else {
                            z58 = false;
                        }
                        boolean z6111 = z6110 | z58;
                        if ((i45 & 7168) == 2048) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                        z60 = z6111 | z59;
                        objM87133R2 = c28655q2.m87133R();
                        if (z60) {
                            boolean z79 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z79, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z79;
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            boolean z710 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z710, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z710;
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a7, null, c28655q2, 0, 4);
                        c28655q = c28655q2;
                        zM87157i = c28655q.m87157i(interfaceC31544k2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                        if (z46) {
                            c28655q.m87150e0(1094583544);
                            C38072d c38072d4 = C38072d.f163053a;
                            C27430e c27430eM107874S4 = AbstractC34132o.m107874S(c38072d4.m121951d().getAction().getCross(), c28655q, 6);
                            String strM21273g4 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                            float f16 = 4;
                            Modifier modifierM3599a8 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f16, AbstractC1099a.m3394p(6 * f16, c2314t))), "closeIcon");
                            if ((i45 & 896) == 256) {
                                z65 = true;
                            } else {
                                z65 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z65) {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S4, strM21273g4, AbstractC1092a.m3362g(modifierM3599a8, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d4.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1095124587);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z37 = z49;
                        z38 = z52;
                        z39 = z64;
                        z36 = z24;
                        z28 = z46;
                        z29 = z47;
                        modifier3 = modifier7;
                        z34 = z25;
                        z35 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z28 = z17;
                        z29 = z18;
                        z34 = z25;
                        z35 = z26;
                        modifier3 = modifier2;
                        z36 = z24;
                        z37 = z15;
                        z38 = z16;
                        z39 = z19;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 24576;
                z26 = z14;
                i26 = i15 & 32;
                if (i26 != 0) {
                    i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i27;
                }
                i28 = i15 & 64;
                if (i28 != 0) {
                    i16 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87155h(z16)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i16 |= i29;
                }
                i34 = i15 & 128;
                if (i34 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87155h(z17)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i16 |= i35;
                    }
                    i36 = i15 & 256;
                    if (i36 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87155h(z18)) {
                                i37 = 67108864;
                            } else {
                                i37 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i16 |= i37;
                        }
                        i38 = i15 & 512;
                        if (i38 != 0) {
                            i16 |= 805306368;
                        } else if ((i13 & 805306368) == 0) {
                            if (c28655q2.m87155h(z19)) {
                                i39 = 536870912;
                            } else {
                                i39 = 268435456;
                            }
                            i16 |= i39;
                        }
                        if ((i14 & 6) == 0) {
                            if (c28655q2.m87157i(goFullScreen)) {
                                i49 = 4;
                            } else {
                                i49 = 2;
                            }
                            i44 = i14 | i49;
                        } else {
                            i44 = i14;
                        }
                        if ((i14 & 48) == 0) {
                            if (c28655q2.m87157i(clearFullScreen)) {
                                i48 = 32;
                            } else {
                                i48 = 16;
                            }
                            i44 |= i48;
                        }
                        if ((i14 & 384) == 0) {
                            i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                        }
                        if ((i14 & 3072) == 0) {
                            if (c28655q2.m87157i(onUserViewedFullVideo)) {
                                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            }
                            i44 |= i18;
                        }
                        i45 = i44;
                        if ((i16 & 306783379) == 306783378) {
                            z27 = true;
                        } else {
                            z27 = true;
                        }
                        if (c28655q2.m87135U(i16 & 1, z27)) {
                            c2314t = C2314t.f9131w;
                            if (i54 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i55 != 0) {
                                z24 = true;
                            }
                            if (i17 != 0) {
                                z25 = false;
                            }
                            if (i24 != 0) {
                                z26 = false;
                            }
                            if (i26 != 0) {
                                z44 = true;
                            } else {
                                z44 = z15;
                            }
                            if (i28 != 0) {
                                z45 = true;
                            } else {
                                z45 = z16;
                            }
                            if (i34 != 0) {
                                z46 = true;
                            } else {
                                z46 = z17;
                            }
                            if (i36 != 0) {
                                z47 = false;
                            } else {
                                z47 = z18;
                            }
                            if (i38 != 0) {
                                z48 = true;
                            } else {
                                z48 = z19;
                            }
                            z49 = z44;
                            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            i46 = i16;
                            z52 = z45;
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifier2);
                            InterfaceC0221l.f734a.getClass();
                            Modifier modifier8 = modifier2;
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d5);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                            context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                            objM87133R = c28655q2.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R == c28676v0) {
                                C31541j c31541j5 = new C31541j(context);
                                C20033m c20033m5 = new C20033m(context);
                                AbstractC24543a.m71573i(!c31541j5.f130194q);
                                c31541j5.f130182e = new C2853n(c20033m5, 3);
                                AbstractC24543a.m71573i(!c31541j5.f130194q);
                                c31541j5.f130194q = true;
                                C31571u c31571u5 = new C31571u(c31541j5);
                                C18744f c18744fM97213g4 = c31571u5.m97213g0();
                                AbstractC22676k.m65749i(c18744fM97213g4, "getTrackSelectionParameters(...)");
                                c31571u5.m97227v0(m10973l(c18744fM97213g4, z25, z26));
                                C31527e0 c31527e4 = new C31527e0();
                                C41017e0 c41017e4 = AbstractC41023g0.f176998x;
                                C41060w0 c41060w5 = C41060w0.f177067E;
                                list = Collections.EMPTY_LIST;
                                c41060w0 = C41060w0.f177067E;
                                uri = Uri.parse(videoUri);
                                if (uri != null) {
                                    c31539i0 = new C31539i0(uri, null, list, c41060w0);
                                } else {
                                    c31539i0 = null;
                                }
                                c31571u5.m381O(new C31545k0("", new C31533g0(c31527e4), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                                c31571u5.m97225t0(z24);
                                if (z47) {
                                    i47 = 2;
                                } else {
                                    i47 = 0;
                                }
                                c31571u5.m97226u0(i47);
                                c31571u5.m97218m0();
                                c28655q2.m87172p0(c31571u5);
                                objM87133R = c31571u5;
                            }
                            interfaceC31544k = (InterfaceC31544k) objM87133R;
                            AbstractC22676k.m65747g(interfaceC31544k);
                            Modifier modifierM3599a9 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                            if ((i46 & 3670016) == 1048576) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            boolean zM87157i6 = z54 | c28655q2.m87157i(interfaceC31544k);
                            if ((i45 & 14) == 4) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                            boolean z6112 = zM87157i6 | z55;
                            if ((i45 & 112) == 32) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            boolean z6113 = z6112 | z56;
                            if ((i46 & 458752) == 131072) {
                                z57 = true;
                            } else {
                                z57 = false;
                            }
                            boolean z6114 = z6113 | z57;
                            if ((i46 & 1879048192) == 536870912) {
                                z58 = true;
                            } else {
                                z58 = false;
                            }
                            boolean z6115 = z6114 | z58;
                            if ((i45 & 7168) == 2048) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                            z60 = z6115 | z59;
                            objM87133R2 = c28655q2.m87133R();
                            if (z60) {
                                boolean z711 = z48;
                                objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z711, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                                interfaceC31544k2 = interfaceC31544k;
                                z64 = z711;
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                boolean z712 = z48;
                                objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z712, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                                interfaceC31544k2 = interfaceC31544k;
                                z64 = z712;
                                c28655q2.m87172p0(objM87133R2);
                            }
                            AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a9, null, c28655q2, 0, 4);
                            c28655q = c28655q2;
                            zM87157i = c28655q.m87157i(interfaceC31544k2);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R3 = new C3610c(interfaceC31544k2, 0);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C3610c(interfaceC31544k2, 0);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                            if (z46) {
                                c28655q.m87150e0(1094583544);
                                C38072d c38072d5 = C38072d.f163053a;
                                C27430e c27430eM107874S5 = AbstractC34132o.m107874S(c38072d5.m121951d().getAction().getCross(), c28655q, 6);
                                String strM21273g5 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                                float f17 = 4;
                                Modifier modifierM3599a10 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f17, AbstractC1099a.m3394p(6 * f17, c2314t))), "closeIcon");
                                if ((i45 & 896) == 256) {
                                    z65 = true;
                                } else {
                                    z65 = false;
                                }
                                objM87133R4 = c28655q.m87133R();
                                if (z65) {
                                    objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S5, strM21273g5, AbstractC1092a.m3362g(modifierM3599a10, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d5.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1095124587);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            z37 = z49;
                            z38 = z52;
                            z39 = z64;
                            z36 = z24;
                            z28 = z46;
                            z29 = z47;
                            modifier3 = modifier8;
                            z34 = z25;
                            z35 = z26;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            z28 = z17;
                            z29 = z18;
                            z34 = z25;
                            z35 = z26;
                            modifier3 = modifier2;
                            z36 = z24;
                            z37 = z15;
                            z38 = z16;
                            z39 = z19;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i16 |= 100663296;
                    i38 = i15 & 512;
                    if (i38 != 0) {
                        i16 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87155h(z19)) {
                            i39 = 536870912;
                        } else {
                            i39 = 268435456;
                        }
                        i16 |= i39;
                    }
                    if ((i14 & 6) == 0) {
                        if (c28655q2.m87157i(goFullScreen)) {
                            i49 = 4;
                        } else {
                            i49 = 2;
                        }
                        i44 = i14 | i49;
                    } else {
                        i44 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87157i(clearFullScreen)) {
                            i48 = 32;
                        } else {
                            i48 = 16;
                        }
                        i44 |= i48;
                    }
                    if ((i14 & 384) == 0) {
                        i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                    }
                    if ((i14 & 3072) == 0) {
                        if (c28655q2.m87157i(onUserViewedFullVideo)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i44 |= i18;
                    }
                    i45 = i44;
                    if ((i16 & 306783379) == 306783378) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z27)) {
                        c2314t = C2314t.f9131w;
                        if (i54 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i55 != 0) {
                            z24 = true;
                        }
                        if (i17 != 0) {
                            z25 = false;
                        }
                        if (i24 != 0) {
                            z26 = false;
                        }
                        if (i26 != 0) {
                            z44 = true;
                        } else {
                            z44 = z15;
                        }
                        if (i28 != 0) {
                            z45 = true;
                        } else {
                            z45 = z16;
                        }
                        if (i34 != 0) {
                            z46 = true;
                        } else {
                            z46 = z17;
                        }
                        if (i36 != 0) {
                            z47 = false;
                        } else {
                            z47 = z18;
                        }
                        if (i38 != 0) {
                            z48 = true;
                        } else {
                            z48 = z19;
                        }
                        z49 = z44;
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        i46 = i16;
                        z52 = z45;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier9 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                        context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            C31541j c31541j6 = new C31541j(context);
                            C20033m c20033m6 = new C20033m(context);
                            AbstractC24543a.m71573i(!c31541j6.f130194q);
                            c31541j6.f130182e = new C2853n(c20033m6, 3);
                            AbstractC24543a.m71573i(!c31541j6.f130194q);
                            c31541j6.f130194q = true;
                            C31571u c31571u6 = new C31571u(c31541j6);
                            C18744f c18744fM97213g5 = c31571u6.m97213g0();
                            AbstractC22676k.m65749i(c18744fM97213g5, "getTrackSelectionParameters(...)");
                            c31571u6.m97227v0(m10973l(c18744fM97213g5, z25, z26));
                            C31527e0 c31527e5 = new C31527e0();
                            C41017e0 c41017e5 = AbstractC41023g0.f176998x;
                            C41060w0 c41060w6 = C41060w0.f177067E;
                            list = Collections.EMPTY_LIST;
                            c41060w0 = C41060w0.f177067E;
                            uri = Uri.parse(videoUri);
                            if (uri != null) {
                                c31539i0 = new C31539i0(uri, null, list, c41060w0);
                            } else {
                                c31539i0 = null;
                            }
                            c31571u6.m381O(new C31545k0("", new C31533g0(c31527e5), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                            c31571u6.m97225t0(z24);
                            if (z47) {
                                i47 = 2;
                            } else {
                                i47 = 0;
                            }
                            c31571u6.m97226u0(i47);
                            c31571u6.m97218m0();
                            c28655q2.m87172p0(c31571u6);
                            objM87133R = c31571u6;
                        }
                        interfaceC31544k = (InterfaceC31544k) objM87133R;
                        AbstractC22676k.m65747g(interfaceC31544k);
                        Modifier modifierM3599a11 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                        if ((i46 & 3670016) == 1048576) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zM87157i7 = z54 | c28655q2.m87157i(interfaceC31544k);
                        if ((i45 & 14) == 4) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                        boolean z6116 = zM87157i7 | z55;
                        if ((i45 & 112) == 32) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean z6117 = z6116 | z56;
                        if ((i46 & 458752) == 131072) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        boolean z6118 = z6117 | z57;
                        if ((i46 & 1879048192) == 536870912) {
                            z58 = true;
                        } else {
                            z58 = false;
                        }
                        boolean z6119 = z6118 | z58;
                        if ((i45 & 7168) == 2048) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                        z60 = z6119 | z59;
                        objM87133R2 = c28655q2.m87133R();
                        if (z60) {
                            boolean z713 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z713, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z713;
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            boolean z714 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z714, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z714;
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a11, null, c28655q2, 0, 4);
                        c28655q = c28655q2;
                        zM87157i = c28655q.m87157i(interfaceC31544k2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                        if (z46) {
                            c28655q.m87150e0(1094583544);
                            C38072d c38072d6 = C38072d.f163053a;
                            C27430e c27430eM107874S6 = AbstractC34132o.m107874S(c38072d6.m121951d().getAction().getCross(), c28655q, 6);
                            String strM21273g6 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                            float f18 = 4;
                            Modifier modifierM3599a12 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f18, AbstractC1099a.m3394p(6 * f18, c2314t))), "closeIcon");
                            if ((i45 & 896) == 256) {
                                z65 = true;
                            } else {
                                z65 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z65) {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S6, strM21273g6, AbstractC1092a.m3362g(modifierM3599a12, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d6.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1095124587);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z37 = z49;
                        z38 = z52;
                        z39 = z64;
                        z36 = z24;
                        z28 = z46;
                        z29 = z47;
                        modifier3 = modifier9;
                        z34 = z25;
                        z35 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z28 = z17;
                        z29 = z18;
                        z34 = z25;
                        z35 = z26;
                        modifier3 = modifier2;
                        z36 = z24;
                        z37 = z15;
                        z38 = z16;
                        z39 = z19;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 12582912;
                i36 = i15 & 256;
                if (i36 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87155h(z18)) {
                            i37 = 67108864;
                        } else {
                            i37 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i37;
                    }
                    i38 = i15 & 512;
                    if (i38 != 0) {
                        i16 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87155h(z19)) {
                            i39 = 536870912;
                        } else {
                            i39 = 268435456;
                        }
                        i16 |= i39;
                    }
                    if ((i14 & 6) == 0) {
                        if (c28655q2.m87157i(goFullScreen)) {
                            i49 = 4;
                        } else {
                            i49 = 2;
                        }
                        i44 = i14 | i49;
                    } else {
                        i44 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87157i(clearFullScreen)) {
                            i48 = 32;
                        } else {
                            i48 = 16;
                        }
                        i44 |= i48;
                    }
                    if ((i14 & 384) == 0) {
                        i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                    }
                    if ((i14 & 3072) == 0) {
                        if (c28655q2.m87157i(onUserViewedFullVideo)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i44 |= i18;
                    }
                    i45 = i44;
                    if ((i16 & 306783379) == 306783378) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z27)) {
                        c2314t = C2314t.f9131w;
                        if (i54 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i55 != 0) {
                            z24 = true;
                        }
                        if (i17 != 0) {
                            z25 = false;
                        }
                        if (i24 != 0) {
                            z26 = false;
                        }
                        if (i26 != 0) {
                            z44 = true;
                        } else {
                            z44 = z15;
                        }
                        if (i28 != 0) {
                            z45 = true;
                        } else {
                            z45 = z16;
                        }
                        if (i34 != 0) {
                            z46 = true;
                        } else {
                            z46 = z17;
                        }
                        if (i36 != 0) {
                            z47 = false;
                        } else {
                            z47 = z18;
                        }
                        if (i38 != 0) {
                            z48 = true;
                        } else {
                            z48 = z19;
                        }
                        z49 = z44;
                        InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        i46 = i16;
                        z52 = z45;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier10 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d7);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                        context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            C31541j c31541j7 = new C31541j(context);
                            C20033m c20033m7 = new C20033m(context);
                            AbstractC24543a.m71573i(!c31541j7.f130194q);
                            c31541j7.f130182e = new C2853n(c20033m7, 3);
                            AbstractC24543a.m71573i(!c31541j7.f130194q);
                            c31541j7.f130194q = true;
                            C31571u c31571u7 = new C31571u(c31541j7);
                            C18744f c18744fM97213g6 = c31571u7.m97213g0();
                            AbstractC22676k.m65749i(c18744fM97213g6, "getTrackSelectionParameters(...)");
                            c31571u7.m97227v0(m10973l(c18744fM97213g6, z25, z26));
                            C31527e0 c31527e6 = new C31527e0();
                            C41017e0 c41017e6 = AbstractC41023g0.f176998x;
                            C41060w0 c41060w7 = C41060w0.f177067E;
                            list = Collections.EMPTY_LIST;
                            c41060w0 = C41060w0.f177067E;
                            uri = Uri.parse(videoUri);
                            if (uri != null) {
                                c31539i0 = new C31539i0(uri, null, list, c41060w0);
                            } else {
                                c31539i0 = null;
                            }
                            c31571u7.m381O(new C31545k0("", new C31533g0(c31527e6), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                            c31571u7.m97225t0(z24);
                            if (z47) {
                                i47 = 2;
                            } else {
                                i47 = 0;
                            }
                            c31571u7.m97226u0(i47);
                            c31571u7.m97218m0();
                            c28655q2.m87172p0(c31571u7);
                            objM87133R = c31571u7;
                        }
                        interfaceC31544k = (InterfaceC31544k) objM87133R;
                        AbstractC22676k.m65747g(interfaceC31544k);
                        Modifier modifierM3599a13 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                        if ((i46 & 3670016) == 1048576) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zM87157i8 = z54 | c28655q2.m87157i(interfaceC31544k);
                        if ((i45 & 14) == 4) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                        boolean z61110 = zM87157i8 | z55;
                        if ((i45 & 112) == 32) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean z61111 = z61110 | z56;
                        if ((i46 & 458752) == 131072) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        boolean z61112 = z61111 | z57;
                        if ((i46 & 1879048192) == 536870912) {
                            z58 = true;
                        } else {
                            z58 = false;
                        }
                        boolean z61113 = z61112 | z58;
                        if ((i45 & 7168) == 2048) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                        z60 = z61113 | z59;
                        objM87133R2 = c28655q2.m87133R();
                        if (z60) {
                            boolean z715 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z715, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z715;
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            boolean z716 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z716, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z716;
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a13, null, c28655q2, 0, 4);
                        c28655q = c28655q2;
                        zM87157i = c28655q.m87157i(interfaceC31544k2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                        if (z46) {
                            c28655q.m87150e0(1094583544);
                            C38072d c38072d7 = C38072d.f163053a;
                            C27430e c27430eM107874S7 = AbstractC34132o.m107874S(c38072d7.m121951d().getAction().getCross(), c28655q, 6);
                            String strM21273g7 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                            float f19 = 4;
                            Modifier modifierM3599a14 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f19, AbstractC1099a.m3394p(6 * f19, c2314t))), "closeIcon");
                            if ((i45 & 896) == 256) {
                                z65 = true;
                            } else {
                                z65 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z65) {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S7, strM21273g7, AbstractC1092a.m3362g(modifierM3599a14, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d7.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1095124587);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z37 = z49;
                        z38 = z52;
                        z39 = z64;
                        z36 = z24;
                        z28 = z46;
                        z29 = z47;
                        modifier3 = modifier10;
                        z34 = z25;
                        z35 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z28 = z17;
                        z29 = z18;
                        z34 = z25;
                        z35 = z26;
                        modifier3 = modifier2;
                        z36 = z24;
                        z37 = z15;
                        z38 = z16;
                        z39 = z19;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 100663296;
                i38 = i15 & 512;
                if (i38 != 0) {
                    i16 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87155h(z19)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i16 |= i39;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(goFullScreen)) {
                        i49 = 4;
                    } else {
                        i49 = 2;
                    }
                    i44 = i14 | i49;
                } else {
                    i44 = i14;
                }
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87157i(clearFullScreen)) {
                        i48 = 32;
                    } else {
                        i48 = 16;
                    }
                    i44 |= i48;
                }
                if ((i14 & 384) == 0) {
                    i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(onUserViewedFullVideo)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i44 |= i18;
                }
                i45 = i44;
                if ((i16 & 306783379) == 306783378) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z27)) {
                    c2314t = C2314t.f9131w;
                    if (i54 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i55 != 0) {
                        z24 = true;
                    }
                    if (i17 != 0) {
                        z25 = false;
                    }
                    if (i24 != 0) {
                        z26 = false;
                    }
                    if (i26 != 0) {
                        z44 = true;
                    } else {
                        z44 = z15;
                    }
                    if (i28 != 0) {
                        z45 = true;
                    } else {
                        z45 = z16;
                    }
                    if (i34 != 0) {
                        z46 = true;
                    } else {
                        z46 = z17;
                    }
                    if (i36 != 0) {
                        z47 = false;
                    } else {
                        z47 = z18;
                    }
                    if (i38 != 0) {
                        z48 = true;
                    } else {
                        z48 = z19;
                    }
                    z49 = z44;
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    i46 = i16;
                    z52 = z45;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier11 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        C31541j c31541j8 = new C31541j(context);
                        C20033m c20033m8 = new C20033m(context);
                        AbstractC24543a.m71573i(!c31541j8.f130194q);
                        c31541j8.f130182e = new C2853n(c20033m8, 3);
                        AbstractC24543a.m71573i(!c31541j8.f130194q);
                        c31541j8.f130194q = true;
                        C31571u c31571u8 = new C31571u(c31541j8);
                        C18744f c18744fM97213g7 = c31571u8.m97213g0();
                        AbstractC22676k.m65749i(c18744fM97213g7, "getTrackSelectionParameters(...)");
                        c31571u8.m97227v0(m10973l(c18744fM97213g7, z25, z26));
                        C31527e0 c31527e7 = new C31527e0();
                        C41017e0 c41017e7 = AbstractC41023g0.f176998x;
                        C41060w0 c41060w8 = C41060w0.f177067E;
                        list = Collections.EMPTY_LIST;
                        c41060w0 = C41060w0.f177067E;
                        uri = Uri.parse(videoUri);
                        if (uri != null) {
                            c31539i0 = new C31539i0(uri, null, list, c41060w0);
                        } else {
                            c31539i0 = null;
                        }
                        c31571u8.m381O(new C31545k0("", new C31533g0(c31527e7), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                        c31571u8.m97225t0(z24);
                        if (z47) {
                            i47 = 2;
                        } else {
                            i47 = 0;
                        }
                        c31571u8.m97226u0(i47);
                        c31571u8.m97218m0();
                        c28655q2.m87172p0(c31571u8);
                        objM87133R = c31571u8;
                    }
                    interfaceC31544k = (InterfaceC31544k) objM87133R;
                    AbstractC22676k.m65747g(interfaceC31544k);
                    Modifier modifierM3599a15 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                    if ((i46 & 3670016) == 1048576) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zM87157i9 = z54 | c28655q2.m87157i(interfaceC31544k);
                    if ((i45 & 14) == 4) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                    boolean z61114 = zM87157i9 | z55;
                    if ((i45 & 112) == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z61115 = z61114 | z56;
                    if ((i46 & 458752) == 131072) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    boolean z61116 = z61115 | z57;
                    if ((i46 & 1879048192) == 536870912) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    boolean z61117 = z61116 | z58;
                    if ((i45 & 7168) == 2048) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    z60 = z61117 | z59;
                    objM87133R2 = c28655q2.m87133R();
                    if (z60) {
                        boolean z717 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z717, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z717;
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        boolean z718 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z718, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z718;
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a15, null, c28655q2, 0, 4);
                    c28655q = c28655q2;
                    zM87157i = c28655q.m87157i(interfaceC31544k2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                    if (z46) {
                        c28655q.m87150e0(1094583544);
                        C38072d c38072d8 = C38072d.f163053a;
                        C27430e c27430eM107874S8 = AbstractC34132o.m107874S(c38072d8.m121951d().getAction().getCross(), c28655q, 6);
                        String strM21273g8 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                        float f110 = 4;
                        Modifier modifierM3599a16 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f110, AbstractC1099a.m3394p(6 * f110, c2314t))), "closeIcon");
                        if ((i45 & 896) == 256) {
                            z65 = true;
                        } else {
                            z65 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z65) {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S8, strM21273g8, AbstractC1092a.m3362g(modifierM3599a16, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d8.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1095124587);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z37 = z49;
                    z38 = z52;
                    z39 = z64;
                    z36 = z24;
                    z28 = z46;
                    z29 = z47;
                    modifier3 = modifier11;
                    z34 = z25;
                    z35 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z28 = z17;
                    z29 = z18;
                    z34 = z25;
                    z35 = z26;
                    modifier3 = modifier2;
                    z36 = z24;
                    z37 = z15;
                    z38 = z16;
                    z39 = z19;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 3072;
            z25 = z13;
            i24 = i15 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    z26 = z14;
                    if (c28655q2.m87155h(z26)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i25;
                }
                i26 = i15 & 32;
                if (i26 != 0) {
                    i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i27;
                }
                i28 = i15 & 64;
                if (i28 != 0) {
                    i16 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87155h(z16)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i16 |= i29;
                }
                i34 = i15 & 128;
                if (i34 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87155h(z17)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i16 |= i35;
                    }
                    i36 = i15 & 256;
                    if (i36 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87155h(z18)) {
                                i37 = 67108864;
                            } else {
                                i37 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i16 |= i37;
                        }
                        i38 = i15 & 512;
                        if (i38 != 0) {
                            i16 |= 805306368;
                        } else if ((i13 & 805306368) == 0) {
                            if (c28655q2.m87155h(z19)) {
                                i39 = 536870912;
                            } else {
                                i39 = 268435456;
                            }
                            i16 |= i39;
                        }
                        if ((i14 & 6) == 0) {
                            if (c28655q2.m87157i(goFullScreen)) {
                                i49 = 4;
                            } else {
                                i49 = 2;
                            }
                            i44 = i14 | i49;
                        } else {
                            i44 = i14;
                        }
                        if ((i14 & 48) == 0) {
                            if (c28655q2.m87157i(clearFullScreen)) {
                                i48 = 32;
                            } else {
                                i48 = 16;
                            }
                            i44 |= i48;
                        }
                        if ((i14 & 384) == 0) {
                            i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                        }
                        if ((i14 & 3072) == 0) {
                            if (c28655q2.m87157i(onUserViewedFullVideo)) {
                                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            }
                            i44 |= i18;
                        }
                        i45 = i44;
                        if ((i16 & 306783379) == 306783378) {
                            z27 = true;
                        } else {
                            z27 = true;
                        }
                        if (c28655q2.m87135U(i16 & 1, z27)) {
                            c2314t = C2314t.f9131w;
                            if (i54 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i55 != 0) {
                                z24 = true;
                            }
                            if (i17 != 0) {
                                z25 = false;
                            }
                            if (i24 != 0) {
                                z26 = false;
                            }
                            if (i26 != 0) {
                                z44 = true;
                            } else {
                                z44 = z15;
                            }
                            if (i28 != 0) {
                                z45 = true;
                            } else {
                                z45 = z16;
                            }
                            if (i34 != 0) {
                                z46 = true;
                            } else {
                                z46 = z17;
                            }
                            if (i36 != 0) {
                                z47 = false;
                            } else {
                                z47 = z18;
                            }
                            if (i38 != 0) {
                                z48 = true;
                            } else {
                                z48 = z19;
                            }
                            z49 = z44;
                            InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            i46 = i16;
                            z52 = z45;
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifier2);
                            InterfaceC0221l.f734a.getClass();
                            Modifier modifier12 = modifier2;
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d9);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m9);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N9);
                            context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                            objM87133R = c28655q2.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R == c28676v0) {
                                C31541j c31541j9 = new C31541j(context);
                                C20033m c20033m9 = new C20033m(context);
                                AbstractC24543a.m71573i(!c31541j9.f130194q);
                                c31541j9.f130182e = new C2853n(c20033m9, 3);
                                AbstractC24543a.m71573i(!c31541j9.f130194q);
                                c31541j9.f130194q = true;
                                C31571u c31571u9 = new C31571u(c31541j9);
                                C18744f c18744fM97213g8 = c31571u9.m97213g0();
                                AbstractC22676k.m65749i(c18744fM97213g8, "getTrackSelectionParameters(...)");
                                c31571u9.m97227v0(m10973l(c18744fM97213g8, z25, z26));
                                C31527e0 c31527e8 = new C31527e0();
                                C41017e0 c41017e8 = AbstractC41023g0.f176998x;
                                C41060w0 c41060w9 = C41060w0.f177067E;
                                list = Collections.EMPTY_LIST;
                                c41060w0 = C41060w0.f177067E;
                                uri = Uri.parse(videoUri);
                                if (uri != null) {
                                    c31539i0 = new C31539i0(uri, null, list, c41060w0);
                                } else {
                                    c31539i0 = null;
                                }
                                c31571u9.m381O(new C31545k0("", new C31533g0(c31527e8), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                                c31571u9.m97225t0(z24);
                                if (z47) {
                                    i47 = 2;
                                } else {
                                    i47 = 0;
                                }
                                c31571u9.m97226u0(i47);
                                c31571u9.m97218m0();
                                c28655q2.m87172p0(c31571u9);
                                objM87133R = c31571u9;
                            }
                            interfaceC31544k = (InterfaceC31544k) objM87133R;
                            AbstractC22676k.m65747g(interfaceC31544k);
                            Modifier modifierM3599a17 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                            if ((i46 & 3670016) == 1048576) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            boolean zM87157i10 = z54 | c28655q2.m87157i(interfaceC31544k);
                            if ((i45 & 14) == 4) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                            boolean z61118 = zM87157i10 | z55;
                            if ((i45 & 112) == 32) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            boolean z61119 = z61118 | z56;
                            if ((i46 & 458752) == 131072) {
                                z57 = true;
                            } else {
                                z57 = false;
                            }
                            boolean z611110 = z61119 | z57;
                            if ((i46 & 1879048192) == 536870912) {
                                z58 = true;
                            } else {
                                z58 = false;
                            }
                            boolean z611111 = z611110 | z58;
                            if ((i45 & 7168) == 2048) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                            z60 = z611111 | z59;
                            objM87133R2 = c28655q2.m87133R();
                            if (z60) {
                                boolean z719 = z48;
                                objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z719, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                                interfaceC31544k2 = interfaceC31544k;
                                z64 = z719;
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                boolean z7110 = z48;
                                objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7110, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                                interfaceC31544k2 = interfaceC31544k;
                                z64 = z7110;
                                c28655q2.m87172p0(objM87133R2);
                            }
                            AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a17, null, c28655q2, 0, 4);
                            c28655q = c28655q2;
                            zM87157i = c28655q.m87157i(interfaceC31544k2);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R3 = new C3610c(interfaceC31544k2, 0);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C3610c(interfaceC31544k2, 0);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                            if (z46) {
                                c28655q.m87150e0(1094583544);
                                C38072d c38072d9 = C38072d.f163053a;
                                C27430e c27430eM107874S9 = AbstractC34132o.m107874S(c38072d9.m121951d().getAction().getCross(), c28655q, 6);
                                String strM21273g9 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                                float f111 = 4;
                                Modifier modifierM3599a18 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f111, AbstractC1099a.m3394p(6 * f111, c2314t))), "closeIcon");
                                if ((i45 & 896) == 256) {
                                    z65 = true;
                                } else {
                                    z65 = false;
                                }
                                objM87133R4 = c28655q.m87133R();
                                if (z65) {
                                    objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S9, strM21273g9, AbstractC1092a.m3362g(modifierM3599a18, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d9.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1095124587);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            z37 = z49;
                            z38 = z52;
                            z39 = z64;
                            z36 = z24;
                            z28 = z46;
                            z29 = z47;
                            modifier3 = modifier12;
                            z34 = z25;
                            z35 = z26;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            z28 = z17;
                            z29 = z18;
                            z34 = z25;
                            z35 = z26;
                            modifier3 = modifier2;
                            z36 = z24;
                            z37 = z15;
                            z38 = z16;
                            z39 = z19;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i16 |= 100663296;
                    i38 = i15 & 512;
                    if (i38 != 0) {
                        i16 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87155h(z19)) {
                            i39 = 536870912;
                        } else {
                            i39 = 268435456;
                        }
                        i16 |= i39;
                    }
                    if ((i14 & 6) == 0) {
                        if (c28655q2.m87157i(goFullScreen)) {
                            i49 = 4;
                        } else {
                            i49 = 2;
                        }
                        i44 = i14 | i49;
                    } else {
                        i44 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87157i(clearFullScreen)) {
                            i48 = 32;
                        } else {
                            i48 = 16;
                        }
                        i44 |= i48;
                    }
                    if ((i14 & 384) == 0) {
                        i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                    }
                    if ((i14 & 3072) == 0) {
                        if (c28655q2.m87157i(onUserViewedFullVideo)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i44 |= i18;
                    }
                    i45 = i44;
                    if ((i16 & 306783379) == 306783378) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z27)) {
                        c2314t = C2314t.f9131w;
                        if (i54 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i55 != 0) {
                            z24 = true;
                        }
                        if (i17 != 0) {
                            z25 = false;
                        }
                        if (i24 != 0) {
                            z26 = false;
                        }
                        if (i26 != 0) {
                            z44 = true;
                        } else {
                            z44 = z15;
                        }
                        if (i28 != 0) {
                            z45 = true;
                        } else {
                            z45 = z16;
                        }
                        if (i34 != 0) {
                            z46 = true;
                        } else {
                            z46 = z17;
                        }
                        if (i36 != 0) {
                            z47 = false;
                        } else {
                            z47 = z18;
                        }
                        if (i38 != 0) {
                            z48 = true;
                        } else {
                            z48 = z19;
                        }
                        z49 = z44;
                        InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        i46 = i16;
                        z52 = z45;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier13 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d10);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m10);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N10);
                        context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            C31541j c31541j10 = new C31541j(context);
                            C20033m c20033m10 = new C20033m(context);
                            AbstractC24543a.m71573i(!c31541j10.f130194q);
                            c31541j10.f130182e = new C2853n(c20033m10, 3);
                            AbstractC24543a.m71573i(!c31541j10.f130194q);
                            c31541j10.f130194q = true;
                            C31571u c31571u10 = new C31571u(c31541j10);
                            C18744f c18744fM97213g9 = c31571u10.m97213g0();
                            AbstractC22676k.m65749i(c18744fM97213g9, "getTrackSelectionParameters(...)");
                            c31571u10.m97227v0(m10973l(c18744fM97213g9, z25, z26));
                            C31527e0 c31527e9 = new C31527e0();
                            C41017e0 c41017e9 = AbstractC41023g0.f176998x;
                            C41060w0 c41060w10 = C41060w0.f177067E;
                            list = Collections.EMPTY_LIST;
                            c41060w0 = C41060w0.f177067E;
                            uri = Uri.parse(videoUri);
                            if (uri != null) {
                                c31539i0 = new C31539i0(uri, null, list, c41060w0);
                            } else {
                                c31539i0 = null;
                            }
                            c31571u10.m381O(new C31545k0("", new C31533g0(c31527e9), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                            c31571u10.m97225t0(z24);
                            if (z47) {
                                i47 = 2;
                            } else {
                                i47 = 0;
                            }
                            c31571u10.m97226u0(i47);
                            c31571u10.m97218m0();
                            c28655q2.m87172p0(c31571u10);
                            objM87133R = c31571u10;
                        }
                        interfaceC31544k = (InterfaceC31544k) objM87133R;
                        AbstractC22676k.m65747g(interfaceC31544k);
                        Modifier modifierM3599a19 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                        if ((i46 & 3670016) == 1048576) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zM87157i11 = z54 | c28655q2.m87157i(interfaceC31544k);
                        if ((i45 & 14) == 4) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                        boolean z611112 = zM87157i11 | z55;
                        if ((i45 & 112) == 32) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean z611113 = z611112 | z56;
                        if ((i46 & 458752) == 131072) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        boolean z611114 = z611113 | z57;
                        if ((i46 & 1879048192) == 536870912) {
                            z58 = true;
                        } else {
                            z58 = false;
                        }
                        boolean z611115 = z611114 | z58;
                        if ((i45 & 7168) == 2048) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                        z60 = z611115 | z59;
                        objM87133R2 = c28655q2.m87133R();
                        if (z60) {
                            boolean z7111 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7111, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z7111;
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            boolean z7112 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7112, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z7112;
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a19, null, c28655q2, 0, 4);
                        c28655q = c28655q2;
                        zM87157i = c28655q.m87157i(interfaceC31544k2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                        if (z46) {
                            c28655q.m87150e0(1094583544);
                            C38072d c38072d10 = C38072d.f163053a;
                            C27430e c27430eM107874S10 = AbstractC34132o.m107874S(c38072d10.m121951d().getAction().getCross(), c28655q, 6);
                            String strM21273g10 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                            float f112 = 4;
                            Modifier modifierM3599a110 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f112, AbstractC1099a.m3394p(6 * f112, c2314t))), "closeIcon");
                            if ((i45 & 896) == 256) {
                                z65 = true;
                            } else {
                                z65 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z65) {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S10, strM21273g10, AbstractC1092a.m3362g(modifierM3599a110, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d10.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1095124587);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z37 = z49;
                        z38 = z52;
                        z39 = z64;
                        z36 = z24;
                        z28 = z46;
                        z29 = z47;
                        modifier3 = modifier13;
                        z34 = z25;
                        z35 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z28 = z17;
                        z29 = z18;
                        z34 = z25;
                        z35 = z26;
                        modifier3 = modifier2;
                        z36 = z24;
                        z37 = z15;
                        z38 = z16;
                        z39 = z19;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 12582912;
                i36 = i15 & 256;
                if (i36 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87155h(z18)) {
                            i37 = 67108864;
                        } else {
                            i37 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i37;
                    }
                    i38 = i15 & 512;
                    if (i38 != 0) {
                        i16 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87155h(z19)) {
                            i39 = 536870912;
                        } else {
                            i39 = 268435456;
                        }
                        i16 |= i39;
                    }
                    if ((i14 & 6) == 0) {
                        if (c28655q2.m87157i(goFullScreen)) {
                            i49 = 4;
                        } else {
                            i49 = 2;
                        }
                        i44 = i14 | i49;
                    } else {
                        i44 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87157i(clearFullScreen)) {
                            i48 = 32;
                        } else {
                            i48 = 16;
                        }
                        i44 |= i48;
                    }
                    if ((i14 & 384) == 0) {
                        i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                    }
                    if ((i14 & 3072) == 0) {
                        if (c28655q2.m87157i(onUserViewedFullVideo)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i44 |= i18;
                    }
                    i45 = i44;
                    if ((i16 & 306783379) == 306783378) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z27)) {
                        c2314t = C2314t.f9131w;
                        if (i54 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i55 != 0) {
                            z24 = true;
                        }
                        if (i17 != 0) {
                            z25 = false;
                        }
                        if (i24 != 0) {
                            z26 = false;
                        }
                        if (i26 != 0) {
                            z44 = true;
                        } else {
                            z44 = z15;
                        }
                        if (i28 != 0) {
                            z45 = true;
                        } else {
                            z45 = z16;
                        }
                        if (i34 != 0) {
                            z46 = true;
                        } else {
                            z46 = z17;
                        }
                        if (i36 != 0) {
                            z47 = false;
                        } else {
                            z47 = z18;
                        }
                        if (i38 != 0) {
                            z48 = true;
                        } else {
                            z48 = z19;
                        }
                        z49 = z44;
                        InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        i46 = i16;
                        z52 = z45;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier14 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d11);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11);
                        context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            C31541j c31541j11 = new C31541j(context);
                            C20033m c20033m11 = new C20033m(context);
                            AbstractC24543a.m71573i(!c31541j11.f130194q);
                            c31541j11.f130182e = new C2853n(c20033m11, 3);
                            AbstractC24543a.m71573i(!c31541j11.f130194q);
                            c31541j11.f130194q = true;
                            C31571u c31571u11 = new C31571u(c31541j11);
                            C18744f c18744fM97213g10 = c31571u11.m97213g0();
                            AbstractC22676k.m65749i(c18744fM97213g10, "getTrackSelectionParameters(...)");
                            c31571u11.m97227v0(m10973l(c18744fM97213g10, z25, z26));
                            C31527e0 c31527e10 = new C31527e0();
                            C41017e0 c41017e10 = AbstractC41023g0.f176998x;
                            C41060w0 c41060w11 = C41060w0.f177067E;
                            list = Collections.EMPTY_LIST;
                            c41060w0 = C41060w0.f177067E;
                            uri = Uri.parse(videoUri);
                            if (uri != null) {
                                c31539i0 = new C31539i0(uri, null, list, c41060w0);
                            } else {
                                c31539i0 = null;
                            }
                            c31571u11.m381O(new C31545k0("", new C31533g0(c31527e10), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                            c31571u11.m97225t0(z24);
                            if (z47) {
                                i47 = 2;
                            } else {
                                i47 = 0;
                            }
                            c31571u11.m97226u0(i47);
                            c31571u11.m97218m0();
                            c28655q2.m87172p0(c31571u11);
                            objM87133R = c31571u11;
                        }
                        interfaceC31544k = (InterfaceC31544k) objM87133R;
                        AbstractC22676k.m65747g(interfaceC31544k);
                        Modifier modifierM3599a111 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                        if ((i46 & 3670016) == 1048576) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zM87157i12 = z54 | c28655q2.m87157i(interfaceC31544k);
                        if ((i45 & 14) == 4) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                        boolean z611116 = zM87157i12 | z55;
                        if ((i45 & 112) == 32) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean z611117 = z611116 | z56;
                        if ((i46 & 458752) == 131072) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        boolean z611118 = z611117 | z57;
                        if ((i46 & 1879048192) == 536870912) {
                            z58 = true;
                        } else {
                            z58 = false;
                        }
                        boolean z611119 = z611118 | z58;
                        if ((i45 & 7168) == 2048) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                        z60 = z611119 | z59;
                        objM87133R2 = c28655q2.m87133R();
                        if (z60) {
                            boolean z7113 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7113, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z7113;
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            boolean z7114 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7114, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z7114;
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a111, null, c28655q2, 0, 4);
                        c28655q = c28655q2;
                        zM87157i = c28655q.m87157i(interfaceC31544k2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                        if (z46) {
                            c28655q.m87150e0(1094583544);
                            C38072d c38072d11 = C38072d.f163053a;
                            C27430e c27430eM107874S11 = AbstractC34132o.m107874S(c38072d11.m121951d().getAction().getCross(), c28655q, 6);
                            String strM21273g11 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                            float f113 = 4;
                            Modifier modifierM3599a112 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f113, AbstractC1099a.m3394p(6 * f113, c2314t))), "closeIcon");
                            if ((i45 & 896) == 256) {
                                z65 = true;
                            } else {
                                z65 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z65) {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S11, strM21273g11, AbstractC1092a.m3362g(modifierM3599a112, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d11.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1095124587);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z37 = z49;
                        z38 = z52;
                        z39 = z64;
                        z36 = z24;
                        z28 = z46;
                        z29 = z47;
                        modifier3 = modifier14;
                        z34 = z25;
                        z35 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z28 = z17;
                        z29 = z18;
                        z34 = z25;
                        z35 = z26;
                        modifier3 = modifier2;
                        z36 = z24;
                        z37 = z15;
                        z38 = z16;
                        z39 = z19;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 100663296;
                i38 = i15 & 512;
                if (i38 != 0) {
                    i16 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87155h(z19)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i16 |= i39;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(goFullScreen)) {
                        i49 = 4;
                    } else {
                        i49 = 2;
                    }
                    i44 = i14 | i49;
                } else {
                    i44 = i14;
                }
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87157i(clearFullScreen)) {
                        i48 = 32;
                    } else {
                        i48 = 16;
                    }
                    i44 |= i48;
                }
                if ((i14 & 384) == 0) {
                    i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(onUserViewedFullVideo)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i44 |= i18;
                }
                i45 = i44;
                if ((i16 & 306783379) == 306783378) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z27)) {
                    c2314t = C2314t.f9131w;
                    if (i54 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i55 != 0) {
                        z24 = true;
                    }
                    if (i17 != 0) {
                        z25 = false;
                    }
                    if (i24 != 0) {
                        z26 = false;
                    }
                    if (i26 != 0) {
                        z44 = true;
                    } else {
                        z44 = z15;
                    }
                    if (i28 != 0) {
                        z45 = true;
                    } else {
                        z45 = z16;
                    }
                    if (i34 != 0) {
                        z46 = true;
                    } else {
                        z46 = z17;
                    }
                    if (i36 != 0) {
                        z47 = false;
                    } else {
                        z47 = z18;
                    }
                    if (i38 != 0) {
                        z48 = true;
                    } else {
                        z48 = z19;
                    }
                    z49 = z44;
                    InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    i46 = i16;
                    z52 = z45;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier15 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d12);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m12);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N12);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        C31541j c31541j12 = new C31541j(context);
                        C20033m c20033m12 = new C20033m(context);
                        AbstractC24543a.m71573i(!c31541j12.f130194q);
                        c31541j12.f130182e = new C2853n(c20033m12, 3);
                        AbstractC24543a.m71573i(!c31541j12.f130194q);
                        c31541j12.f130194q = true;
                        C31571u c31571u12 = new C31571u(c31541j12);
                        C18744f c18744fM97213g11 = c31571u12.m97213g0();
                        AbstractC22676k.m65749i(c18744fM97213g11, "getTrackSelectionParameters(...)");
                        c31571u12.m97227v0(m10973l(c18744fM97213g11, z25, z26));
                        C31527e0 c31527e11 = new C31527e0();
                        C41017e0 c41017e11 = AbstractC41023g0.f176998x;
                        C41060w0 c41060w12 = C41060w0.f177067E;
                        list = Collections.EMPTY_LIST;
                        c41060w0 = C41060w0.f177067E;
                        uri = Uri.parse(videoUri);
                        if (uri != null) {
                            c31539i0 = new C31539i0(uri, null, list, c41060w0);
                        } else {
                            c31539i0 = null;
                        }
                        c31571u12.m381O(new C31545k0("", new C31533g0(c31527e11), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                        c31571u12.m97225t0(z24);
                        if (z47) {
                            i47 = 2;
                        } else {
                            i47 = 0;
                        }
                        c31571u12.m97226u0(i47);
                        c31571u12.m97218m0();
                        c28655q2.m87172p0(c31571u12);
                        objM87133R = c31571u12;
                    }
                    interfaceC31544k = (InterfaceC31544k) objM87133R;
                    AbstractC22676k.m65747g(interfaceC31544k);
                    Modifier modifierM3599a113 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                    if ((i46 & 3670016) == 1048576) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zM87157i13 = z54 | c28655q2.m87157i(interfaceC31544k);
                    if ((i45 & 14) == 4) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                    boolean z6111110 = zM87157i13 | z55;
                    if ((i45 & 112) == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z6111111 = z6111110 | z56;
                    if ((i46 & 458752) == 131072) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    boolean z6111112 = z6111111 | z57;
                    if ((i46 & 1879048192) == 536870912) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    boolean z6111113 = z6111112 | z58;
                    if ((i45 & 7168) == 2048) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    z60 = z6111113 | z59;
                    objM87133R2 = c28655q2.m87133R();
                    if (z60) {
                        boolean z7115 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7115, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z7115;
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        boolean z7116 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7116, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z7116;
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a113, null, c28655q2, 0, 4);
                    c28655q = c28655q2;
                    zM87157i = c28655q.m87157i(interfaceC31544k2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                    if (z46) {
                        c28655q.m87150e0(1094583544);
                        C38072d c38072d12 = C38072d.f163053a;
                        C27430e c27430eM107874S12 = AbstractC34132o.m107874S(c38072d12.m121951d().getAction().getCross(), c28655q, 6);
                        String strM21273g12 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                        float f114 = 4;
                        Modifier modifierM3599a114 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f114, AbstractC1099a.m3394p(6 * f114, c2314t))), "closeIcon");
                        if ((i45 & 896) == 256) {
                            z65 = true;
                        } else {
                            z65 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z65) {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S12, strM21273g12, AbstractC1092a.m3362g(modifierM3599a114, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d12.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1095124587);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z37 = z49;
                    z38 = z52;
                    z39 = z64;
                    z36 = z24;
                    z28 = z46;
                    z29 = z47;
                    modifier3 = modifier15;
                    z34 = z25;
                    z35 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z28 = z17;
                    z29 = z18;
                    z34 = z25;
                    z35 = z26;
                    modifier3 = modifier2;
                    z36 = z24;
                    z37 = z15;
                    z38 = z16;
                    z39 = z19;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            z26 = z14;
            i26 = i15 & 32;
            if (i26 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i27;
            }
            i28 = i15 & 64;
            if (i28 != 0) {
                i16 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87155h(z16)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i16 |= i29;
            }
            i34 = i15 & 128;
            if (i34 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87155h(z17)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i16 |= i35;
                }
                i36 = i15 & 256;
                if (i36 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87155h(z18)) {
                            i37 = 67108864;
                        } else {
                            i37 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i37;
                    }
                    i38 = i15 & 512;
                    if (i38 != 0) {
                        i16 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87155h(z19)) {
                            i39 = 536870912;
                        } else {
                            i39 = 268435456;
                        }
                        i16 |= i39;
                    }
                    if ((i14 & 6) == 0) {
                        if (c28655q2.m87157i(goFullScreen)) {
                            i49 = 4;
                        } else {
                            i49 = 2;
                        }
                        i44 = i14 | i49;
                    } else {
                        i44 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87157i(clearFullScreen)) {
                            i48 = 32;
                        } else {
                            i48 = 16;
                        }
                        i44 |= i48;
                    }
                    if ((i14 & 384) == 0) {
                        i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                    }
                    if ((i14 & 3072) == 0) {
                        if (c28655q2.m87157i(onUserViewedFullVideo)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i44 |= i18;
                    }
                    i45 = i44;
                    if ((i16 & 306783379) == 306783378) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z27)) {
                        c2314t = C2314t.f9131w;
                        if (i54 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i55 != 0) {
                            z24 = true;
                        }
                        if (i17 != 0) {
                            z25 = false;
                        }
                        if (i24 != 0) {
                            z26 = false;
                        }
                        if (i26 != 0) {
                            z44 = true;
                        } else {
                            z44 = z15;
                        }
                        if (i28 != 0) {
                            z45 = true;
                        } else {
                            z45 = z16;
                        }
                        if (i34 != 0) {
                            z46 = true;
                        } else {
                            z46 = z17;
                        }
                        if (i36 != 0) {
                            z47 = false;
                        } else {
                            z47 = z18;
                        }
                        if (i38 != 0) {
                            z48 = true;
                        } else {
                            z48 = z19;
                        }
                        z49 = z44;
                        InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        i46 = i16;
                        z52 = z45;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier16 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d13);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m13);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N13);
                        context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            C31541j c31541j13 = new C31541j(context);
                            C20033m c20033m13 = new C20033m(context);
                            AbstractC24543a.m71573i(!c31541j13.f130194q);
                            c31541j13.f130182e = new C2853n(c20033m13, 3);
                            AbstractC24543a.m71573i(!c31541j13.f130194q);
                            c31541j13.f130194q = true;
                            C31571u c31571u13 = new C31571u(c31541j13);
                            C18744f c18744fM97213g12 = c31571u13.m97213g0();
                            AbstractC22676k.m65749i(c18744fM97213g12, "getTrackSelectionParameters(...)");
                            c31571u13.m97227v0(m10973l(c18744fM97213g12, z25, z26));
                            C31527e0 c31527e12 = new C31527e0();
                            C41017e0 c41017e12 = AbstractC41023g0.f176998x;
                            C41060w0 c41060w13 = C41060w0.f177067E;
                            list = Collections.EMPTY_LIST;
                            c41060w0 = C41060w0.f177067E;
                            uri = Uri.parse(videoUri);
                            if (uri != null) {
                                c31539i0 = new C31539i0(uri, null, list, c41060w0);
                            } else {
                                c31539i0 = null;
                            }
                            c31571u13.m381O(new C31545k0("", new C31533g0(c31527e12), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                            c31571u13.m97225t0(z24);
                            if (z47) {
                                i47 = 2;
                            } else {
                                i47 = 0;
                            }
                            c31571u13.m97226u0(i47);
                            c31571u13.m97218m0();
                            c28655q2.m87172p0(c31571u13);
                            objM87133R = c31571u13;
                        }
                        interfaceC31544k = (InterfaceC31544k) objM87133R;
                        AbstractC22676k.m65747g(interfaceC31544k);
                        Modifier modifierM3599a115 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                        if ((i46 & 3670016) == 1048576) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zM87157i14 = z54 | c28655q2.m87157i(interfaceC31544k);
                        if ((i45 & 14) == 4) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                        boolean z6111114 = zM87157i14 | z55;
                        if ((i45 & 112) == 32) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean z6111115 = z6111114 | z56;
                        if ((i46 & 458752) == 131072) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        boolean z6111116 = z6111115 | z57;
                        if ((i46 & 1879048192) == 536870912) {
                            z58 = true;
                        } else {
                            z58 = false;
                        }
                        boolean z6111117 = z6111116 | z58;
                        if ((i45 & 7168) == 2048) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                        z60 = z6111117 | z59;
                        objM87133R2 = c28655q2.m87133R();
                        if (z60) {
                            boolean z7117 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7117, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z7117;
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            boolean z7118 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7118, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z7118;
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a115, null, c28655q2, 0, 4);
                        c28655q = c28655q2;
                        zM87157i = c28655q.m87157i(interfaceC31544k2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                        if (z46) {
                            c28655q.m87150e0(1094583544);
                            C38072d c38072d13 = C38072d.f163053a;
                            C27430e c27430eM107874S13 = AbstractC34132o.m107874S(c38072d13.m121951d().getAction().getCross(), c28655q, 6);
                            String strM21273g13 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                            float f115 = 4;
                            Modifier modifierM3599a116 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f115, AbstractC1099a.m3394p(6 * f115, c2314t))), "closeIcon");
                            if ((i45 & 896) == 256) {
                                z65 = true;
                            } else {
                                z65 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z65) {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S13, strM21273g13, AbstractC1092a.m3362g(modifierM3599a116, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d13.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1095124587);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z37 = z49;
                        z38 = z52;
                        z39 = z64;
                        z36 = z24;
                        z28 = z46;
                        z29 = z47;
                        modifier3 = modifier16;
                        z34 = z25;
                        z35 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z28 = z17;
                        z29 = z18;
                        z34 = z25;
                        z35 = z26;
                        modifier3 = modifier2;
                        z36 = z24;
                        z37 = z15;
                        z38 = z16;
                        z39 = z19;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 100663296;
                i38 = i15 & 512;
                if (i38 != 0) {
                    i16 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87155h(z19)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i16 |= i39;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(goFullScreen)) {
                        i49 = 4;
                    } else {
                        i49 = 2;
                    }
                    i44 = i14 | i49;
                } else {
                    i44 = i14;
                }
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87157i(clearFullScreen)) {
                        i48 = 32;
                    } else {
                        i48 = 16;
                    }
                    i44 |= i48;
                }
                if ((i14 & 384) == 0) {
                    i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(onUserViewedFullVideo)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i44 |= i18;
                }
                i45 = i44;
                if ((i16 & 306783379) == 306783378) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z27)) {
                    c2314t = C2314t.f9131w;
                    if (i54 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i55 != 0) {
                        z24 = true;
                    }
                    if (i17 != 0) {
                        z25 = false;
                    }
                    if (i24 != 0) {
                        z26 = false;
                    }
                    if (i26 != 0) {
                        z44 = true;
                    } else {
                        z44 = z15;
                    }
                    if (i28 != 0) {
                        z45 = true;
                    } else {
                        z45 = z16;
                    }
                    if (i34 != 0) {
                        z46 = true;
                    } else {
                        z46 = z17;
                    }
                    if (i36 != 0) {
                        z47 = false;
                    } else {
                        z47 = z18;
                    }
                    if (i38 != 0) {
                        z48 = true;
                    } else {
                        z48 = z19;
                    }
                    z49 = z44;
                    InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    i46 = i16;
                    z52 = z45;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier17 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d14);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m14);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N14);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        C31541j c31541j14 = new C31541j(context);
                        C20033m c20033m14 = new C20033m(context);
                        AbstractC24543a.m71573i(!c31541j14.f130194q);
                        c31541j14.f130182e = new C2853n(c20033m14, 3);
                        AbstractC24543a.m71573i(!c31541j14.f130194q);
                        c31541j14.f130194q = true;
                        C31571u c31571u14 = new C31571u(c31541j14);
                        C18744f c18744fM97213g13 = c31571u14.m97213g0();
                        AbstractC22676k.m65749i(c18744fM97213g13, "getTrackSelectionParameters(...)");
                        c31571u14.m97227v0(m10973l(c18744fM97213g13, z25, z26));
                        C31527e0 c31527e13 = new C31527e0();
                        C41017e0 c41017e13 = AbstractC41023g0.f176998x;
                        C41060w0 c41060w14 = C41060w0.f177067E;
                        list = Collections.EMPTY_LIST;
                        c41060w0 = C41060w0.f177067E;
                        uri = Uri.parse(videoUri);
                        if (uri != null) {
                            c31539i0 = new C31539i0(uri, null, list, c41060w0);
                        } else {
                            c31539i0 = null;
                        }
                        c31571u14.m381O(new C31545k0("", new C31533g0(c31527e13), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                        c31571u14.m97225t0(z24);
                        if (z47) {
                            i47 = 2;
                        } else {
                            i47 = 0;
                        }
                        c31571u14.m97226u0(i47);
                        c31571u14.m97218m0();
                        c28655q2.m87172p0(c31571u14);
                        objM87133R = c31571u14;
                    }
                    interfaceC31544k = (InterfaceC31544k) objM87133R;
                    AbstractC22676k.m65747g(interfaceC31544k);
                    Modifier modifierM3599a117 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                    if ((i46 & 3670016) == 1048576) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zM87157i15 = z54 | c28655q2.m87157i(interfaceC31544k);
                    if ((i45 & 14) == 4) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                    boolean z6111118 = zM87157i15 | z55;
                    if ((i45 & 112) == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z6111119 = z6111118 | z56;
                    if ((i46 & 458752) == 131072) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    boolean z61111110 = z6111119 | z57;
                    if ((i46 & 1879048192) == 536870912) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    boolean z61111111 = z61111110 | z58;
                    if ((i45 & 7168) == 2048) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    z60 = z61111111 | z59;
                    objM87133R2 = c28655q2.m87133R();
                    if (z60) {
                        boolean z7119 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7119, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z7119;
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        boolean z71110 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71110, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z71110;
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a117, null, c28655q2, 0, 4);
                    c28655q = c28655q2;
                    zM87157i = c28655q.m87157i(interfaceC31544k2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                    if (z46) {
                        c28655q.m87150e0(1094583544);
                        C38072d c38072d14 = C38072d.f163053a;
                        C27430e c27430eM107874S14 = AbstractC34132o.m107874S(c38072d14.m121951d().getAction().getCross(), c28655q, 6);
                        String strM21273g14 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                        float f116 = 4;
                        Modifier modifierM3599a118 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f116, AbstractC1099a.m3394p(6 * f116, c2314t))), "closeIcon");
                        if ((i45 & 896) == 256) {
                            z65 = true;
                        } else {
                            z65 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z65) {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S14, strM21273g14, AbstractC1092a.m3362g(modifierM3599a118, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d14.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1095124587);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z37 = z49;
                    z38 = z52;
                    z39 = z64;
                    z36 = z24;
                    z28 = z46;
                    z29 = z47;
                    modifier3 = modifier17;
                    z34 = z25;
                    z35 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z28 = z17;
                    z29 = z18;
                    z34 = z25;
                    z35 = z26;
                    modifier3 = modifier2;
                    z36 = z24;
                    z37 = z15;
                    z38 = z16;
                    z39 = z19;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 12582912;
            i36 = i15 & 256;
            if (i36 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87155h(z18)) {
                        i37 = 67108864;
                    } else {
                        i37 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i37;
                }
                i38 = i15 & 512;
                if (i38 != 0) {
                    i16 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87155h(z19)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i16 |= i39;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(goFullScreen)) {
                        i49 = 4;
                    } else {
                        i49 = 2;
                    }
                    i44 = i14 | i49;
                } else {
                    i44 = i14;
                }
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87157i(clearFullScreen)) {
                        i48 = 32;
                    } else {
                        i48 = 16;
                    }
                    i44 |= i48;
                }
                if ((i14 & 384) == 0) {
                    i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(onUserViewedFullVideo)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i44 |= i18;
                }
                i45 = i44;
                if ((i16 & 306783379) == 306783378) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z27)) {
                    c2314t = C2314t.f9131w;
                    if (i54 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i55 != 0) {
                        z24 = true;
                    }
                    if (i17 != 0) {
                        z25 = false;
                    }
                    if (i24 != 0) {
                        z26 = false;
                    }
                    if (i26 != 0) {
                        z44 = true;
                    } else {
                        z44 = z15;
                    }
                    if (i28 != 0) {
                        z45 = true;
                    } else {
                        z45 = z16;
                    }
                    if (i34 != 0) {
                        z46 = true;
                    } else {
                        z46 = z17;
                    }
                    if (i36 != 0) {
                        z47 = false;
                    } else {
                        z47 = z18;
                    }
                    if (i38 != 0) {
                        z48 = true;
                    } else {
                        z48 = z19;
                    }
                    z49 = z44;
                    InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    i46 = i16;
                    z52 = z45;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier18 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d15);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m15);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N15);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        C31541j c31541j15 = new C31541j(context);
                        C20033m c20033m15 = new C20033m(context);
                        AbstractC24543a.m71573i(!c31541j15.f130194q);
                        c31541j15.f130182e = new C2853n(c20033m15, 3);
                        AbstractC24543a.m71573i(!c31541j15.f130194q);
                        c31541j15.f130194q = true;
                        C31571u c31571u15 = new C31571u(c31541j15);
                        C18744f c18744fM97213g14 = c31571u15.m97213g0();
                        AbstractC22676k.m65749i(c18744fM97213g14, "getTrackSelectionParameters(...)");
                        c31571u15.m97227v0(m10973l(c18744fM97213g14, z25, z26));
                        C31527e0 c31527e14 = new C31527e0();
                        C41017e0 c41017e14 = AbstractC41023g0.f176998x;
                        C41060w0 c41060w15 = C41060w0.f177067E;
                        list = Collections.EMPTY_LIST;
                        c41060w0 = C41060w0.f177067E;
                        uri = Uri.parse(videoUri);
                        if (uri != null) {
                            c31539i0 = new C31539i0(uri, null, list, c41060w0);
                        } else {
                            c31539i0 = null;
                        }
                        c31571u15.m381O(new C31545k0("", new C31533g0(c31527e14), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                        c31571u15.m97225t0(z24);
                        if (z47) {
                            i47 = 2;
                        } else {
                            i47 = 0;
                        }
                        c31571u15.m97226u0(i47);
                        c31571u15.m97218m0();
                        c28655q2.m87172p0(c31571u15);
                        objM87133R = c31571u15;
                    }
                    interfaceC31544k = (InterfaceC31544k) objM87133R;
                    AbstractC22676k.m65747g(interfaceC31544k);
                    Modifier modifierM3599a119 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                    if ((i46 & 3670016) == 1048576) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zM87157i16 = z54 | c28655q2.m87157i(interfaceC31544k);
                    if ((i45 & 14) == 4) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                    boolean z61111112 = zM87157i16 | z55;
                    if ((i45 & 112) == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z61111113 = z61111112 | z56;
                    if ((i46 & 458752) == 131072) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    boolean z61111114 = z61111113 | z57;
                    if ((i46 & 1879048192) == 536870912) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    boolean z61111115 = z61111114 | z58;
                    if ((i45 & 7168) == 2048) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    z60 = z61111115 | z59;
                    objM87133R2 = c28655q2.m87133R();
                    if (z60) {
                        boolean z71111 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71111, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z71111;
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        boolean z71112 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71112, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z71112;
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a119, null, c28655q2, 0, 4);
                    c28655q = c28655q2;
                    zM87157i = c28655q.m87157i(interfaceC31544k2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                    if (z46) {
                        c28655q.m87150e0(1094583544);
                        C38072d c38072d15 = C38072d.f163053a;
                        C27430e c27430eM107874S15 = AbstractC34132o.m107874S(c38072d15.m121951d().getAction().getCross(), c28655q, 6);
                        String strM21273g15 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                        float f117 = 4;
                        Modifier modifierM3599a1110 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f117, AbstractC1099a.m3394p(6 * f117, c2314t))), "closeIcon");
                        if ((i45 & 896) == 256) {
                            z65 = true;
                        } else {
                            z65 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z65) {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S15, strM21273g15, AbstractC1092a.m3362g(modifierM3599a1110, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d15.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1095124587);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z37 = z49;
                    z38 = z52;
                    z39 = z64;
                    z36 = z24;
                    z28 = z46;
                    z29 = z47;
                    modifier3 = modifier18;
                    z34 = z25;
                    z35 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z28 = z17;
                    z29 = z18;
                    z34 = z25;
                    z35 = z26;
                    modifier3 = modifier2;
                    z36 = z24;
                    z37 = z15;
                    z38 = z16;
                    z39 = z19;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 100663296;
            i38 = i15 & 512;
            if (i38 != 0) {
                i16 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87155h(z19)) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i16 |= i39;
            }
            if ((i14 & 6) == 0) {
                if (c28655q2.m87157i(goFullScreen)) {
                    i49 = 4;
                } else {
                    i49 = 2;
                }
                i44 = i14 | i49;
            } else {
                i44 = i14;
            }
            if ((i14 & 48) == 0) {
                if (c28655q2.m87157i(clearFullScreen)) {
                    i48 = 32;
                } else {
                    i48 = 16;
                }
                i44 |= i48;
            }
            if ((i14 & 384) == 0) {
                i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q2.m87157i(onUserViewedFullVideo)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i44 |= i18;
            }
            i45 = i44;
            if ((i16 & 306783379) == 306783378) {
                z27 = true;
            } else {
                z27 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z27)) {
                c2314t = C2314t.f9131w;
                if (i54 != 0) {
                    modifier2 = c2314t;
                }
                if (i55 != 0) {
                    z24 = true;
                }
                if (i17 != 0) {
                    z25 = false;
                }
                if (i24 != 0) {
                    z26 = false;
                }
                if (i26 != 0) {
                    z44 = true;
                } else {
                    z44 = z15;
                }
                if (i28 != 0) {
                    z45 = true;
                } else {
                    z45 = z16;
                }
                if (i34 != 0) {
                    z46 = true;
                } else {
                    z46 = z17;
                }
                if (i36 != 0) {
                    z47 = false;
                } else {
                    z47 = z18;
                }
                if (i38 != 0) {
                    z48 = true;
                } else {
                    z48 = z19;
                }
                z49 = z44;
                InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                i46 = i16;
                z52 = z45;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier19 = modifier2;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d16);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N16);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    C31541j c31541j16 = new C31541j(context);
                    C20033m c20033m16 = new C20033m(context);
                    AbstractC24543a.m71573i(!c31541j16.f130194q);
                    c31541j16.f130182e = new C2853n(c20033m16, 3);
                    AbstractC24543a.m71573i(!c31541j16.f130194q);
                    c31541j16.f130194q = true;
                    C31571u c31571u16 = new C31571u(c31541j16);
                    C18744f c18744fM97213g15 = c31571u16.m97213g0();
                    AbstractC22676k.m65749i(c18744fM97213g15, "getTrackSelectionParameters(...)");
                    c31571u16.m97227v0(m10973l(c18744fM97213g15, z25, z26));
                    C31527e0 c31527e15 = new C31527e0();
                    C41017e0 c41017e15 = AbstractC41023g0.f176998x;
                    C41060w0 c41060w16 = C41060w0.f177067E;
                    list = Collections.EMPTY_LIST;
                    c41060w0 = C41060w0.f177067E;
                    uri = Uri.parse(videoUri);
                    if (uri != null) {
                        c31539i0 = new C31539i0(uri, null, list, c41060w0);
                    } else {
                        c31539i0 = null;
                    }
                    c31571u16.m381O(new C31545k0("", new C31533g0(c31527e15), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                    c31571u16.m97225t0(z24);
                    if (z47) {
                        i47 = 2;
                    } else {
                        i47 = 0;
                    }
                    c31571u16.m97226u0(i47);
                    c31571u16.m97218m0();
                    c28655q2.m87172p0(c31571u16);
                    objM87133R = c31571u16;
                }
                interfaceC31544k = (InterfaceC31544k) objM87133R;
                AbstractC22676k.m65747g(interfaceC31544k);
                Modifier modifierM3599a1111 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                if ((i46 & 3670016) == 1048576) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                boolean zM87157i17 = z54 | c28655q2.m87157i(interfaceC31544k);
                if ((i45 & 14) == 4) {
                    z55 = true;
                } else {
                    z55 = false;
                }
                boolean z61111116 = zM87157i17 | z55;
                if ((i45 & 112) == 32) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                boolean z61111117 = z61111116 | z56;
                if ((i46 & 458752) == 131072) {
                    z57 = true;
                } else {
                    z57 = false;
                }
                boolean z61111118 = z61111117 | z57;
                if ((i46 & 1879048192) == 536870912) {
                    z58 = true;
                } else {
                    z58 = false;
                }
                boolean z61111119 = z61111118 | z58;
                if ((i45 & 7168) == 2048) {
                    z59 = true;
                } else {
                    z59 = false;
                }
                z60 = z61111119 | z59;
                objM87133R2 = c28655q2.m87133R();
                if (z60) {
                    boolean z71113 = z48;
                    objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71113, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                    interfaceC31544k2 = interfaceC31544k;
                    z64 = z71113;
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    boolean z71114 = z48;
                    objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71114, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                    interfaceC31544k2 = interfaceC31544k;
                    z64 = z71114;
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a1111, null, c28655q2, 0, 4);
                c28655q = c28655q2;
                zM87157i = c28655q.m87157i(interfaceC31544k2);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R3 = new C3610c(interfaceC31544k2, 0);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3610c(interfaceC31544k2, 0);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                if (z46) {
                    c28655q.m87150e0(1094583544);
                    C38072d c38072d16 = C38072d.f163053a;
                    C27430e c27430eM107874S16 = AbstractC34132o.m107874S(c38072d16.m121951d().getAction().getCross(), c28655q, 6);
                    String strM21273g16 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                    float f118 = 4;
                    Modifier modifierM3599a1112 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f118, AbstractC1099a.m3394p(6 * f118, c2314t))), "closeIcon");
                    if ((i45 & 896) == 256) {
                        z65 = true;
                    } else {
                        z65 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z65) {
                        objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S16, strM21273g16, AbstractC1092a.m3362g(modifierM3599a1112, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d16.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1095124587);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z37 = z49;
                z38 = z52;
                z39 = z64;
                z36 = z24;
                z28 = z46;
                z29 = z47;
                modifier3 = modifier19;
                z34 = z25;
                z35 = z26;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z28 = z17;
                z29 = z18;
                z34 = z25;
                z35 = z26;
                modifier3 = modifier2;
                z36 = z24;
                z37 = z15;
                z38 = z16;
                z39 = z19;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 384;
        z24 = z4;
        i17 = i15 & 8;
        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                z25 = z13;
                if (c28655q2.m87155h(z25)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            i24 = i15 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    z26 = z14;
                    if (c28655q2.m87155h(z26)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i25;
                }
                i26 = i15 & 32;
                if (i26 != 0) {
                    i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i27;
                }
                i28 = i15 & 64;
                if (i28 != 0) {
                    i16 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87155h(z16)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i16 |= i29;
                }
                i34 = i15 & 128;
                if (i34 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87155h(z17)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i16 |= i35;
                    }
                    i36 = i15 & 256;
                    if (i36 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87155h(z18)) {
                                i37 = 67108864;
                            } else {
                                i37 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i16 |= i37;
                        }
                        i38 = i15 & 512;
                        if (i38 != 0) {
                            i16 |= 805306368;
                        } else if ((i13 & 805306368) == 0) {
                            if (c28655q2.m87155h(z19)) {
                                i39 = 536870912;
                            } else {
                                i39 = 268435456;
                            }
                            i16 |= i39;
                        }
                        if ((i14 & 6) == 0) {
                            if (c28655q2.m87157i(goFullScreen)) {
                                i49 = 4;
                            } else {
                                i49 = 2;
                            }
                            i44 = i14 | i49;
                        } else {
                            i44 = i14;
                        }
                        if ((i14 & 48) == 0) {
                            if (c28655q2.m87157i(clearFullScreen)) {
                                i48 = 32;
                            } else {
                                i48 = 16;
                            }
                            i44 |= i48;
                        }
                        if ((i14 & 384) == 0) {
                            i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                        }
                        if ((i14 & 3072) == 0) {
                            if (c28655q2.m87157i(onUserViewedFullVideo)) {
                                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            }
                            i44 |= i18;
                        }
                        i45 = i44;
                        if ((i16 & 306783379) == 306783378) {
                            z27 = true;
                        } else {
                            z27 = true;
                        }
                        if (c28655q2.m87135U(i16 & 1, z27)) {
                            c2314t = C2314t.f9131w;
                            if (i54 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i55 != 0) {
                                z24 = true;
                            }
                            if (i17 != 0) {
                                z25 = false;
                            }
                            if (i24 != 0) {
                                z26 = false;
                            }
                            if (i26 != 0) {
                                z44 = true;
                            } else {
                                z44 = z15;
                            }
                            if (i28 != 0) {
                                z45 = true;
                            } else {
                                z45 = z16;
                            }
                            if (i34 != 0) {
                                z46 = true;
                            } else {
                                z46 = z17;
                            }
                            if (i36 != 0) {
                                z47 = false;
                            } else {
                                z47 = z18;
                            }
                            if (i38 != 0) {
                                z48 = true;
                            } else {
                                z48 = z19;
                            }
                            z49 = z44;
                            InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            i46 = i16;
                            z52 = z45;
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                            Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifier2);
                            InterfaceC0221l.f734a.getClass();
                            Modifier modifier110 = modifier2;
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d17);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m17);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N17);
                            context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                            objM87133R = c28655q2.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R == c28676v0) {
                                C31541j c31541j17 = new C31541j(context);
                                C20033m c20033m17 = new C20033m(context);
                                AbstractC24543a.m71573i(!c31541j17.f130194q);
                                c31541j17.f130182e = new C2853n(c20033m17, 3);
                                AbstractC24543a.m71573i(!c31541j17.f130194q);
                                c31541j17.f130194q = true;
                                C31571u c31571u17 = new C31571u(c31541j17);
                                C18744f c18744fM97213g16 = c31571u17.m97213g0();
                                AbstractC22676k.m65749i(c18744fM97213g16, "getTrackSelectionParameters(...)");
                                c31571u17.m97227v0(m10973l(c18744fM97213g16, z25, z26));
                                C31527e0 c31527e16 = new C31527e0();
                                C41017e0 c41017e16 = AbstractC41023g0.f176998x;
                                C41060w0 c41060w17 = C41060w0.f177067E;
                                list = Collections.EMPTY_LIST;
                                c41060w0 = C41060w0.f177067E;
                                uri = Uri.parse(videoUri);
                                if (uri != null) {
                                    c31539i0 = new C31539i0(uri, null, list, c41060w0);
                                } else {
                                    c31539i0 = null;
                                }
                                c31571u17.m381O(new C31545k0("", new C31533g0(c31527e16), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                                c31571u17.m97225t0(z24);
                                if (z47) {
                                    i47 = 2;
                                } else {
                                    i47 = 0;
                                }
                                c31571u17.m97226u0(i47);
                                c31571u17.m97218m0();
                                c28655q2.m87172p0(c31571u17);
                                objM87133R = c31571u17;
                            }
                            interfaceC31544k = (InterfaceC31544k) objM87133R;
                            AbstractC22676k.m65747g(interfaceC31544k);
                            Modifier modifierM3599a1113 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                            if ((i46 & 3670016) == 1048576) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            boolean zM87157i18 = z54 | c28655q2.m87157i(interfaceC31544k);
                            if ((i45 & 14) == 4) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                            boolean z611111110 = zM87157i18 | z55;
                            if ((i45 & 112) == 32) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            boolean z611111111 = z611111110 | z56;
                            if ((i46 & 458752) == 131072) {
                                z57 = true;
                            } else {
                                z57 = false;
                            }
                            boolean z611111112 = z611111111 | z57;
                            if ((i46 & 1879048192) == 536870912) {
                                z58 = true;
                            } else {
                                z58 = false;
                            }
                            boolean z611111113 = z611111112 | z58;
                            if ((i45 & 7168) == 2048) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                            z60 = z611111113 | z59;
                            objM87133R2 = c28655q2.m87133R();
                            if (z60) {
                                boolean z71115 = z48;
                                objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71115, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                                interfaceC31544k2 = interfaceC31544k;
                                z64 = z71115;
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                boolean z71116 = z48;
                                objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71116, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                                interfaceC31544k2 = interfaceC31544k;
                                z64 = z71116;
                                c28655q2.m87172p0(objM87133R2);
                            }
                            AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a1113, null, c28655q2, 0, 4);
                            c28655q = c28655q2;
                            zM87157i = c28655q.m87157i(interfaceC31544k2);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R3 = new C3610c(interfaceC31544k2, 0);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C3610c(interfaceC31544k2, 0);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                            if (z46) {
                                c28655q.m87150e0(1094583544);
                                C38072d c38072d17 = C38072d.f163053a;
                                C27430e c27430eM107874S17 = AbstractC34132o.m107874S(c38072d17.m121951d().getAction().getCross(), c28655q, 6);
                                String strM21273g17 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                                float f119 = 4;
                                Modifier modifierM3599a1114 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f119, AbstractC1099a.m3394p(6 * f119, c2314t))), "closeIcon");
                                if ((i45 & 896) == 256) {
                                    z65 = true;
                                } else {
                                    z65 = false;
                                }
                                objM87133R4 = c28655q.m87133R();
                                if (z65) {
                                    objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S17, strM21273g17, AbstractC1092a.m3362g(modifierM3599a1114, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d17.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1095124587);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            z37 = z49;
                            z38 = z52;
                            z39 = z64;
                            z36 = z24;
                            z28 = z46;
                            z29 = z47;
                            modifier3 = modifier110;
                            z34 = z25;
                            z35 = z26;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            z28 = z17;
                            z29 = z18;
                            z34 = z25;
                            z35 = z26;
                            modifier3 = modifier2;
                            z36 = z24;
                            z37 = z15;
                            z38 = z16;
                            z39 = z19;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i16 |= 100663296;
                    i38 = i15 & 512;
                    if (i38 != 0) {
                        i16 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87155h(z19)) {
                            i39 = 536870912;
                        } else {
                            i39 = 268435456;
                        }
                        i16 |= i39;
                    }
                    if ((i14 & 6) == 0) {
                        if (c28655q2.m87157i(goFullScreen)) {
                            i49 = 4;
                        } else {
                            i49 = 2;
                        }
                        i44 = i14 | i49;
                    } else {
                        i44 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87157i(clearFullScreen)) {
                            i48 = 32;
                        } else {
                            i48 = 16;
                        }
                        i44 |= i48;
                    }
                    if ((i14 & 384) == 0) {
                        i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                    }
                    if ((i14 & 3072) == 0) {
                        if (c28655q2.m87157i(onUserViewedFullVideo)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i44 |= i18;
                    }
                    i45 = i44;
                    if ((i16 & 306783379) == 306783378) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z27)) {
                        c2314t = C2314t.f9131w;
                        if (i54 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i55 != 0) {
                            z24 = true;
                        }
                        if (i17 != 0) {
                            z25 = false;
                        }
                        if (i24 != 0) {
                            z26 = false;
                        }
                        if (i26 != 0) {
                            z44 = true;
                        } else {
                            z44 = z15;
                        }
                        if (i28 != 0) {
                            z45 = true;
                        } else {
                            z45 = z16;
                        }
                        if (i34 != 0) {
                            z46 = true;
                        } else {
                            z46 = z17;
                        }
                        if (i36 != 0) {
                            z47 = false;
                        } else {
                            z47 = z18;
                        }
                        if (i38 != 0) {
                            z48 = true;
                        } else {
                            z48 = z19;
                        }
                        z49 = z44;
                        InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        i46 = i16;
                        z52 = z45;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier111 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d18);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m18);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N18);
                        context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            C31541j c31541j18 = new C31541j(context);
                            C20033m c20033m18 = new C20033m(context);
                            AbstractC24543a.m71573i(!c31541j18.f130194q);
                            c31541j18.f130182e = new C2853n(c20033m18, 3);
                            AbstractC24543a.m71573i(!c31541j18.f130194q);
                            c31541j18.f130194q = true;
                            C31571u c31571u18 = new C31571u(c31541j18);
                            C18744f c18744fM97213g17 = c31571u18.m97213g0();
                            AbstractC22676k.m65749i(c18744fM97213g17, "getTrackSelectionParameters(...)");
                            c31571u18.m97227v0(m10973l(c18744fM97213g17, z25, z26));
                            C31527e0 c31527e17 = new C31527e0();
                            C41017e0 c41017e17 = AbstractC41023g0.f176998x;
                            C41060w0 c41060w18 = C41060w0.f177067E;
                            list = Collections.EMPTY_LIST;
                            c41060w0 = C41060w0.f177067E;
                            uri = Uri.parse(videoUri);
                            if (uri != null) {
                                c31539i0 = new C31539i0(uri, null, list, c41060w0);
                            } else {
                                c31539i0 = null;
                            }
                            c31571u18.m381O(new C31545k0("", new C31533g0(c31527e17), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                            c31571u18.m97225t0(z24);
                            if (z47) {
                                i47 = 2;
                            } else {
                                i47 = 0;
                            }
                            c31571u18.m97226u0(i47);
                            c31571u18.m97218m0();
                            c28655q2.m87172p0(c31571u18);
                            objM87133R = c31571u18;
                        }
                        interfaceC31544k = (InterfaceC31544k) objM87133R;
                        AbstractC22676k.m65747g(interfaceC31544k);
                        Modifier modifierM3599a1115 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                        if ((i46 & 3670016) == 1048576) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zM87157i19 = z54 | c28655q2.m87157i(interfaceC31544k);
                        if ((i45 & 14) == 4) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                        boolean z611111114 = zM87157i19 | z55;
                        if ((i45 & 112) == 32) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean z611111115 = z611111114 | z56;
                        if ((i46 & 458752) == 131072) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        boolean z611111116 = z611111115 | z57;
                        if ((i46 & 1879048192) == 536870912) {
                            z58 = true;
                        } else {
                            z58 = false;
                        }
                        boolean z611111117 = z611111116 | z58;
                        if ((i45 & 7168) == 2048) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                        z60 = z611111117 | z59;
                        objM87133R2 = c28655q2.m87133R();
                        if (z60) {
                            boolean z71117 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71117, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z71117;
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            boolean z71118 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71118, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z71118;
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a1115, null, c28655q2, 0, 4);
                        c28655q = c28655q2;
                        zM87157i = c28655q.m87157i(interfaceC31544k2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                        if (z46) {
                            c28655q.m87150e0(1094583544);
                            C38072d c38072d18 = C38072d.f163053a;
                            C27430e c27430eM107874S18 = AbstractC34132o.m107874S(c38072d18.m121951d().getAction().getCross(), c28655q, 6);
                            String strM21273g18 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                            float f1110 = 4;
                            Modifier modifierM3599a1116 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f1110, AbstractC1099a.m3394p(6 * f1110, c2314t))), "closeIcon");
                            if ((i45 & 896) == 256) {
                                z65 = true;
                            } else {
                                z65 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z65) {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S18, strM21273g18, AbstractC1092a.m3362g(modifierM3599a1116, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d18.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1095124587);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z37 = z49;
                        z38 = z52;
                        z39 = z64;
                        z36 = z24;
                        z28 = z46;
                        z29 = z47;
                        modifier3 = modifier111;
                        z34 = z25;
                        z35 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z28 = z17;
                        z29 = z18;
                        z34 = z25;
                        z35 = z26;
                        modifier3 = modifier2;
                        z36 = z24;
                        z37 = z15;
                        z38 = z16;
                        z39 = z19;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 12582912;
                i36 = i15 & 256;
                if (i36 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87155h(z18)) {
                            i37 = 67108864;
                        } else {
                            i37 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i37;
                    }
                    i38 = i15 & 512;
                    if (i38 != 0) {
                        i16 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87155h(z19)) {
                            i39 = 536870912;
                        } else {
                            i39 = 268435456;
                        }
                        i16 |= i39;
                    }
                    if ((i14 & 6) == 0) {
                        if (c28655q2.m87157i(goFullScreen)) {
                            i49 = 4;
                        } else {
                            i49 = 2;
                        }
                        i44 = i14 | i49;
                    } else {
                        i44 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87157i(clearFullScreen)) {
                            i48 = 32;
                        } else {
                            i48 = 16;
                        }
                        i44 |= i48;
                    }
                    if ((i14 & 384) == 0) {
                        i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                    }
                    if ((i14 & 3072) == 0) {
                        if (c28655q2.m87157i(onUserViewedFullVideo)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i44 |= i18;
                    }
                    i45 = i44;
                    if ((i16 & 306783379) == 306783378) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z27)) {
                        c2314t = C2314t.f9131w;
                        if (i54 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i55 != 0) {
                            z24 = true;
                        }
                        if (i17 != 0) {
                            z25 = false;
                        }
                        if (i24 != 0) {
                            z26 = false;
                        }
                        if (i26 != 0) {
                            z44 = true;
                        } else {
                            z44 = z15;
                        }
                        if (i28 != 0) {
                            z45 = true;
                        } else {
                            z45 = z16;
                        }
                        if (i34 != 0) {
                            z46 = true;
                        } else {
                            z46 = z17;
                        }
                        if (i36 != 0) {
                            z47 = false;
                        } else {
                            z47 = z18;
                        }
                        if (i38 != 0) {
                            z48 = true;
                        } else {
                            z48 = z19;
                        }
                        z49 = z44;
                        InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        i46 = i16;
                        z52 = z45;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                        Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier112 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d19);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m19);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N19);
                        context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            C31541j c31541j19 = new C31541j(context);
                            C20033m c20033m19 = new C20033m(context);
                            AbstractC24543a.m71573i(!c31541j19.f130194q);
                            c31541j19.f130182e = new C2853n(c20033m19, 3);
                            AbstractC24543a.m71573i(!c31541j19.f130194q);
                            c31541j19.f130194q = true;
                            C31571u c31571u19 = new C31571u(c31541j19);
                            C18744f c18744fM97213g18 = c31571u19.m97213g0();
                            AbstractC22676k.m65749i(c18744fM97213g18, "getTrackSelectionParameters(...)");
                            c31571u19.m97227v0(m10973l(c18744fM97213g18, z25, z26));
                            C31527e0 c31527e18 = new C31527e0();
                            C41017e0 c41017e18 = AbstractC41023g0.f176998x;
                            C41060w0 c41060w19 = C41060w0.f177067E;
                            list = Collections.EMPTY_LIST;
                            c41060w0 = C41060w0.f177067E;
                            uri = Uri.parse(videoUri);
                            if (uri != null) {
                                c31539i0 = new C31539i0(uri, null, list, c41060w0);
                            } else {
                                c31539i0 = null;
                            }
                            c31571u19.m381O(new C31545k0("", new C31533g0(c31527e18), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                            c31571u19.m97225t0(z24);
                            if (z47) {
                                i47 = 2;
                            } else {
                                i47 = 0;
                            }
                            c31571u19.m97226u0(i47);
                            c31571u19.m97218m0();
                            c28655q2.m87172p0(c31571u19);
                            objM87133R = c31571u19;
                        }
                        interfaceC31544k = (InterfaceC31544k) objM87133R;
                        AbstractC22676k.m65747g(interfaceC31544k);
                        Modifier modifierM3599a1117 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                        if ((i46 & 3670016) == 1048576) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zM87157i110 = z54 | c28655q2.m87157i(interfaceC31544k);
                        if ((i45 & 14) == 4) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                        boolean z611111118 = zM87157i110 | z55;
                        if ((i45 & 112) == 32) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean z611111119 = z611111118 | z56;
                        if ((i46 & 458752) == 131072) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        boolean z6111111110 = z611111119 | z57;
                        if ((i46 & 1879048192) == 536870912) {
                            z58 = true;
                        } else {
                            z58 = false;
                        }
                        boolean z6111111111 = z6111111110 | z58;
                        if ((i45 & 7168) == 2048) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                        z60 = z6111111111 | z59;
                        objM87133R2 = c28655q2.m87133R();
                        if (z60) {
                            boolean z71119 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71119, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z71119;
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            boolean z711110 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z711110, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z711110;
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a1117, null, c28655q2, 0, 4);
                        c28655q = c28655q2;
                        zM87157i = c28655q.m87157i(interfaceC31544k2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                        if (z46) {
                            c28655q.m87150e0(1094583544);
                            C38072d c38072d19 = C38072d.f163053a;
                            C27430e c27430eM107874S19 = AbstractC34132o.m107874S(c38072d19.m121951d().getAction().getCross(), c28655q, 6);
                            String strM21273g19 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                            float f1111 = 4;
                            Modifier modifierM3599a1118 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f1111, AbstractC1099a.m3394p(6 * f1111, c2314t))), "closeIcon");
                            if ((i45 & 896) == 256) {
                                z65 = true;
                            } else {
                                z65 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z65) {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S19, strM21273g19, AbstractC1092a.m3362g(modifierM3599a1118, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d19.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1095124587);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z37 = z49;
                        z38 = z52;
                        z39 = z64;
                        z36 = z24;
                        z28 = z46;
                        z29 = z47;
                        modifier3 = modifier112;
                        z34 = z25;
                        z35 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z28 = z17;
                        z29 = z18;
                        z34 = z25;
                        z35 = z26;
                        modifier3 = modifier2;
                        z36 = z24;
                        z37 = z15;
                        z38 = z16;
                        z39 = z19;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 100663296;
                i38 = i15 & 512;
                if (i38 != 0) {
                    i16 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87155h(z19)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i16 |= i39;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(goFullScreen)) {
                        i49 = 4;
                    } else {
                        i49 = 2;
                    }
                    i44 = i14 | i49;
                } else {
                    i44 = i14;
                }
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87157i(clearFullScreen)) {
                        i48 = 32;
                    } else {
                        i48 = 16;
                    }
                    i44 |= i48;
                }
                if ((i14 & 384) == 0) {
                    i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(onUserViewedFullVideo)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i44 |= i18;
                }
                i45 = i44;
                if ((i16 & 306783379) == 306783378) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z27)) {
                    c2314t = C2314t.f9131w;
                    if (i54 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i55 != 0) {
                        z24 = true;
                    }
                    if (i17 != 0) {
                        z25 = false;
                    }
                    if (i24 != 0) {
                        z26 = false;
                    }
                    if (i26 != 0) {
                        z44 = true;
                    } else {
                        z44 = z15;
                    }
                    if (i28 != 0) {
                        z45 = true;
                    } else {
                        z45 = z16;
                    }
                    if (i34 != 0) {
                        z46 = true;
                    } else {
                        z46 = z17;
                    }
                    if (i36 != 0) {
                        z47 = false;
                    } else {
                        z47 = z18;
                    }
                    if (i38 != 0) {
                        z48 = true;
                    } else {
                        z48 = z19;
                    }
                    z49 = z44;
                    InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    i46 = i16;
                    z52 = z45;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier113 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d110);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m110);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N110);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        C31541j c31541j110 = new C31541j(context);
                        C20033m c20033m110 = new C20033m(context);
                        AbstractC24543a.m71573i(!c31541j110.f130194q);
                        c31541j110.f130182e = new C2853n(c20033m110, 3);
                        AbstractC24543a.m71573i(!c31541j110.f130194q);
                        c31541j110.f130194q = true;
                        C31571u c31571u110 = new C31571u(c31541j110);
                        C18744f c18744fM97213g19 = c31571u110.m97213g0();
                        AbstractC22676k.m65749i(c18744fM97213g19, "getTrackSelectionParameters(...)");
                        c31571u110.m97227v0(m10973l(c18744fM97213g19, z25, z26));
                        C31527e0 c31527e19 = new C31527e0();
                        C41017e0 c41017e19 = AbstractC41023g0.f176998x;
                        C41060w0 c41060w110 = C41060w0.f177067E;
                        list = Collections.EMPTY_LIST;
                        c41060w0 = C41060w0.f177067E;
                        uri = Uri.parse(videoUri);
                        if (uri != null) {
                            c31539i0 = new C31539i0(uri, null, list, c41060w0);
                        } else {
                            c31539i0 = null;
                        }
                        c31571u110.m381O(new C31545k0("", new C31533g0(c31527e19), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                        c31571u110.m97225t0(z24);
                        if (z47) {
                            i47 = 2;
                        } else {
                            i47 = 0;
                        }
                        c31571u110.m97226u0(i47);
                        c31571u110.m97218m0();
                        c28655q2.m87172p0(c31571u110);
                        objM87133R = c31571u110;
                    }
                    interfaceC31544k = (InterfaceC31544k) objM87133R;
                    AbstractC22676k.m65747g(interfaceC31544k);
                    Modifier modifierM3599a1119 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                    if ((i46 & 3670016) == 1048576) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zM87157i111 = z54 | c28655q2.m87157i(interfaceC31544k);
                    if ((i45 & 14) == 4) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                    boolean z6111111112 = zM87157i111 | z55;
                    if ((i45 & 112) == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z6111111113 = z6111111112 | z56;
                    if ((i46 & 458752) == 131072) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    boolean z6111111114 = z6111111113 | z57;
                    if ((i46 & 1879048192) == 536870912) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    boolean z6111111115 = z6111111114 | z58;
                    if ((i45 & 7168) == 2048) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    z60 = z6111111115 | z59;
                    objM87133R2 = c28655q2.m87133R();
                    if (z60) {
                        boolean z711111 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z711111, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z711111;
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        boolean z711112 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z711112, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z711112;
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a1119, null, c28655q2, 0, 4);
                    c28655q = c28655q2;
                    zM87157i = c28655q.m87157i(interfaceC31544k2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                    if (z46) {
                        c28655q.m87150e0(1094583544);
                        C38072d c38072d110 = C38072d.f163053a;
                        C27430e c27430eM107874S110 = AbstractC34132o.m107874S(c38072d110.m121951d().getAction().getCross(), c28655q, 6);
                        String strM21273g110 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                        float f1112 = 4;
                        Modifier modifierM3599a11110 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f1112, AbstractC1099a.m3394p(6 * f1112, c2314t))), "closeIcon");
                        if ((i45 & 896) == 256) {
                            z65 = true;
                        } else {
                            z65 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z65) {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S110, strM21273g110, AbstractC1092a.m3362g(modifierM3599a11110, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d110.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1095124587);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z37 = z49;
                    z38 = z52;
                    z39 = z64;
                    z36 = z24;
                    z28 = z46;
                    z29 = z47;
                    modifier3 = modifier113;
                    z34 = z25;
                    z35 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z28 = z17;
                    z29 = z18;
                    z34 = z25;
                    z35 = z26;
                    modifier3 = modifier2;
                    z36 = z24;
                    z37 = z15;
                    z38 = z16;
                    z39 = z19;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            z26 = z14;
            i26 = i15 & 32;
            if (i26 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i27;
            }
            i28 = i15 & 64;
            if (i28 != 0) {
                i16 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87155h(z16)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i16 |= i29;
            }
            i34 = i15 & 128;
            if (i34 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87155h(z17)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i16 |= i35;
                }
                i36 = i15 & 256;
                if (i36 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87155h(z18)) {
                            i37 = 67108864;
                        } else {
                            i37 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i37;
                    }
                    i38 = i15 & 512;
                    if (i38 != 0) {
                        i16 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87155h(z19)) {
                            i39 = 536870912;
                        } else {
                            i39 = 268435456;
                        }
                        i16 |= i39;
                    }
                    if ((i14 & 6) == 0) {
                        if (c28655q2.m87157i(goFullScreen)) {
                            i49 = 4;
                        } else {
                            i49 = 2;
                        }
                        i44 = i14 | i49;
                    } else {
                        i44 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87157i(clearFullScreen)) {
                            i48 = 32;
                        } else {
                            i48 = 16;
                        }
                        i44 |= i48;
                    }
                    if ((i14 & 384) == 0) {
                        i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                    }
                    if ((i14 & 3072) == 0) {
                        if (c28655q2.m87157i(onUserViewedFullVideo)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i44 |= i18;
                    }
                    i45 = i44;
                    if ((i16 & 306783379) == 306783378) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z27)) {
                        c2314t = C2314t.f9131w;
                        if (i54 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i55 != 0) {
                            z24 = true;
                        }
                        if (i17 != 0) {
                            z25 = false;
                        }
                        if (i24 != 0) {
                            z26 = false;
                        }
                        if (i26 != 0) {
                            z44 = true;
                        } else {
                            z44 = z15;
                        }
                        if (i28 != 0) {
                            z45 = true;
                        } else {
                            z45 = z16;
                        }
                        if (i34 != 0) {
                            z46 = true;
                        } else {
                            z46 = z17;
                        }
                        if (i36 != 0) {
                            z47 = false;
                        } else {
                            z47 = z18;
                        }
                        if (i38 != 0) {
                            z48 = true;
                        } else {
                            z48 = z19;
                        }
                        z49 = z44;
                        InterfaceC39127r0 interfaceC39127r0M66763d111 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        i46 = i16;
                        z52 = z45;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                        Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier114 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d111);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m111);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N111);
                        context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            C31541j c31541j111 = new C31541j(context);
                            C20033m c20033m111 = new C20033m(context);
                            AbstractC24543a.m71573i(!c31541j111.f130194q);
                            c31541j111.f130182e = new C2853n(c20033m111, 3);
                            AbstractC24543a.m71573i(!c31541j111.f130194q);
                            c31541j111.f130194q = true;
                            C31571u c31571u111 = new C31571u(c31541j111);
                            C18744f c18744fM97213g110 = c31571u111.m97213g0();
                            AbstractC22676k.m65749i(c18744fM97213g110, "getTrackSelectionParameters(...)");
                            c31571u111.m97227v0(m10973l(c18744fM97213g110, z25, z26));
                            C31527e0 c31527e110 = new C31527e0();
                            C41017e0 c41017e110 = AbstractC41023g0.f176998x;
                            C41060w0 c41060w111 = C41060w0.f177067E;
                            list = Collections.EMPTY_LIST;
                            c41060w0 = C41060w0.f177067E;
                            uri = Uri.parse(videoUri);
                            if (uri != null) {
                                c31539i0 = new C31539i0(uri, null, list, c41060w0);
                            } else {
                                c31539i0 = null;
                            }
                            c31571u111.m381O(new C31545k0("", new C31533g0(c31527e110), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                            c31571u111.m97225t0(z24);
                            if (z47) {
                                i47 = 2;
                            } else {
                                i47 = 0;
                            }
                            c31571u111.m97226u0(i47);
                            c31571u111.m97218m0();
                            c28655q2.m87172p0(c31571u111);
                            objM87133R = c31571u111;
                        }
                        interfaceC31544k = (InterfaceC31544k) objM87133R;
                        AbstractC22676k.m65747g(interfaceC31544k);
                        Modifier modifierM3599a11111 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                        if ((i46 & 3670016) == 1048576) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zM87157i112 = z54 | c28655q2.m87157i(interfaceC31544k);
                        if ((i45 & 14) == 4) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                        boolean z6111111116 = zM87157i112 | z55;
                        if ((i45 & 112) == 32) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean z6111111117 = z6111111116 | z56;
                        if ((i46 & 458752) == 131072) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        boolean z6111111118 = z6111111117 | z57;
                        if ((i46 & 1879048192) == 536870912) {
                            z58 = true;
                        } else {
                            z58 = false;
                        }
                        boolean z6111111119 = z6111111118 | z58;
                        if ((i45 & 7168) == 2048) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                        z60 = z6111111119 | z59;
                        objM87133R2 = c28655q2.m87133R();
                        if (z60) {
                            boolean z711113 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z711113, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z711113;
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            boolean z711114 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z711114, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z711114;
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a11111, null, c28655q2, 0, 4);
                        c28655q = c28655q2;
                        zM87157i = c28655q.m87157i(interfaceC31544k2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                        if (z46) {
                            c28655q.m87150e0(1094583544);
                            C38072d c38072d111 = C38072d.f163053a;
                            C27430e c27430eM107874S111 = AbstractC34132o.m107874S(c38072d111.m121951d().getAction().getCross(), c28655q, 6);
                            String strM21273g111 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                            float f1113 = 4;
                            Modifier modifierM3599a11112 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f1113, AbstractC1099a.m3394p(6 * f1113, c2314t))), "closeIcon");
                            if ((i45 & 896) == 256) {
                                z65 = true;
                            } else {
                                z65 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z65) {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S111, strM21273g111, AbstractC1092a.m3362g(modifierM3599a11112, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d111.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1095124587);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z37 = z49;
                        z38 = z52;
                        z39 = z64;
                        z36 = z24;
                        z28 = z46;
                        z29 = z47;
                        modifier3 = modifier114;
                        z34 = z25;
                        z35 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z28 = z17;
                        z29 = z18;
                        z34 = z25;
                        z35 = z26;
                        modifier3 = modifier2;
                        z36 = z24;
                        z37 = z15;
                        z38 = z16;
                        z39 = z19;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 100663296;
                i38 = i15 & 512;
                if (i38 != 0) {
                    i16 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87155h(z19)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i16 |= i39;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(goFullScreen)) {
                        i49 = 4;
                    } else {
                        i49 = 2;
                    }
                    i44 = i14 | i49;
                } else {
                    i44 = i14;
                }
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87157i(clearFullScreen)) {
                        i48 = 32;
                    } else {
                        i48 = 16;
                    }
                    i44 |= i48;
                }
                if ((i14 & 384) == 0) {
                    i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(onUserViewedFullVideo)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i44 |= i18;
                }
                i45 = i44;
                if ((i16 & 306783379) == 306783378) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z27)) {
                    c2314t = C2314t.f9131w;
                    if (i54 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i55 != 0) {
                        z24 = true;
                    }
                    if (i17 != 0) {
                        z25 = false;
                    }
                    if (i24 != 0) {
                        z26 = false;
                    }
                    if (i26 != 0) {
                        z44 = true;
                    } else {
                        z44 = z15;
                    }
                    if (i28 != 0) {
                        z45 = true;
                    } else {
                        z45 = z16;
                    }
                    if (i34 != 0) {
                        z46 = true;
                    } else {
                        z46 = z17;
                    }
                    if (i36 != 0) {
                        z47 = false;
                    } else {
                        z47 = z18;
                    }
                    if (i38 != 0) {
                        z48 = true;
                    } else {
                        z48 = z19;
                    }
                    z49 = z44;
                    InterfaceC39127r0 interfaceC39127r0M66763d112 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    i46 = i16;
                    z52 = z45;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier115 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d112);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m112);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N112);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        C31541j c31541j112 = new C31541j(context);
                        C20033m c20033m112 = new C20033m(context);
                        AbstractC24543a.m71573i(!c31541j112.f130194q);
                        c31541j112.f130182e = new C2853n(c20033m112, 3);
                        AbstractC24543a.m71573i(!c31541j112.f130194q);
                        c31541j112.f130194q = true;
                        C31571u c31571u112 = new C31571u(c31541j112);
                        C18744f c18744fM97213g111 = c31571u112.m97213g0();
                        AbstractC22676k.m65749i(c18744fM97213g111, "getTrackSelectionParameters(...)");
                        c31571u112.m97227v0(m10973l(c18744fM97213g111, z25, z26));
                        C31527e0 c31527e111 = new C31527e0();
                        C41017e0 c41017e111 = AbstractC41023g0.f176998x;
                        C41060w0 c41060w112 = C41060w0.f177067E;
                        list = Collections.EMPTY_LIST;
                        c41060w0 = C41060w0.f177067E;
                        uri = Uri.parse(videoUri);
                        if (uri != null) {
                            c31539i0 = new C31539i0(uri, null, list, c41060w0);
                        } else {
                            c31539i0 = null;
                        }
                        c31571u112.m381O(new C31545k0("", new C31533g0(c31527e111), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                        c31571u112.m97225t0(z24);
                        if (z47) {
                            i47 = 2;
                        } else {
                            i47 = 0;
                        }
                        c31571u112.m97226u0(i47);
                        c31571u112.m97218m0();
                        c28655q2.m87172p0(c31571u112);
                        objM87133R = c31571u112;
                    }
                    interfaceC31544k = (InterfaceC31544k) objM87133R;
                    AbstractC22676k.m65747g(interfaceC31544k);
                    Modifier modifierM3599a11113 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                    if ((i46 & 3670016) == 1048576) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zM87157i113 = z54 | c28655q2.m87157i(interfaceC31544k);
                    if ((i45 & 14) == 4) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                    boolean z61111111110 = zM87157i113 | z55;
                    if ((i45 & 112) == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z61111111111 = z61111111110 | z56;
                    if ((i46 & 458752) == 131072) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    boolean z61111111112 = z61111111111 | z57;
                    if ((i46 & 1879048192) == 536870912) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    boolean z61111111113 = z61111111112 | z58;
                    if ((i45 & 7168) == 2048) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    z60 = z61111111113 | z59;
                    objM87133R2 = c28655q2.m87133R();
                    if (z60) {
                        boolean z711115 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z711115, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z711115;
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        boolean z711116 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z711116, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z711116;
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a11113, null, c28655q2, 0, 4);
                    c28655q = c28655q2;
                    zM87157i = c28655q.m87157i(interfaceC31544k2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                    if (z46) {
                        c28655q.m87150e0(1094583544);
                        C38072d c38072d112 = C38072d.f163053a;
                        C27430e c27430eM107874S112 = AbstractC34132o.m107874S(c38072d112.m121951d().getAction().getCross(), c28655q, 6);
                        String strM21273g112 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                        float f1114 = 4;
                        Modifier modifierM3599a11114 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f1114, AbstractC1099a.m3394p(6 * f1114, c2314t))), "closeIcon");
                        if ((i45 & 896) == 256) {
                            z65 = true;
                        } else {
                            z65 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z65) {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S112, strM21273g112, AbstractC1092a.m3362g(modifierM3599a11114, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d112.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1095124587);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z37 = z49;
                    z38 = z52;
                    z39 = z64;
                    z36 = z24;
                    z28 = z46;
                    z29 = z47;
                    modifier3 = modifier115;
                    z34 = z25;
                    z35 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z28 = z17;
                    z29 = z18;
                    z34 = z25;
                    z35 = z26;
                    modifier3 = modifier2;
                    z36 = z24;
                    z37 = z15;
                    z38 = z16;
                    z39 = z19;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 12582912;
            i36 = i15 & 256;
            if (i36 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87155h(z18)) {
                        i37 = 67108864;
                    } else {
                        i37 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i37;
                }
                i38 = i15 & 512;
                if (i38 != 0) {
                    i16 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87155h(z19)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i16 |= i39;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(goFullScreen)) {
                        i49 = 4;
                    } else {
                        i49 = 2;
                    }
                    i44 = i14 | i49;
                } else {
                    i44 = i14;
                }
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87157i(clearFullScreen)) {
                        i48 = 32;
                    } else {
                        i48 = 16;
                    }
                    i44 |= i48;
                }
                if ((i14 & 384) == 0) {
                    i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(onUserViewedFullVideo)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i44 |= i18;
                }
                i45 = i44;
                if ((i16 & 306783379) == 306783378) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z27)) {
                    c2314t = C2314t.f9131w;
                    if (i54 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i55 != 0) {
                        z24 = true;
                    }
                    if (i17 != 0) {
                        z25 = false;
                    }
                    if (i24 != 0) {
                        z26 = false;
                    }
                    if (i26 != 0) {
                        z44 = true;
                    } else {
                        z44 = z15;
                    }
                    if (i28 != 0) {
                        z45 = true;
                    } else {
                        z45 = z16;
                    }
                    if (i34 != 0) {
                        z46 = true;
                    } else {
                        z46 = z17;
                    }
                    if (i36 != 0) {
                        z47 = false;
                    } else {
                        z47 = z18;
                    }
                    if (i38 != 0) {
                        z48 = true;
                    } else {
                        z48 = z19;
                    }
                    z49 = z44;
                    InterfaceC39127r0 interfaceC39127r0M66763d113 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    i46 = i16;
                    z52 = z45;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier116 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d113);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m113);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N113);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        C31541j c31541j113 = new C31541j(context);
                        C20033m c20033m113 = new C20033m(context);
                        AbstractC24543a.m71573i(!c31541j113.f130194q);
                        c31541j113.f130182e = new C2853n(c20033m113, 3);
                        AbstractC24543a.m71573i(!c31541j113.f130194q);
                        c31541j113.f130194q = true;
                        C31571u c31571u113 = new C31571u(c31541j113);
                        C18744f c18744fM97213g112 = c31571u113.m97213g0();
                        AbstractC22676k.m65749i(c18744fM97213g112, "getTrackSelectionParameters(...)");
                        c31571u113.m97227v0(m10973l(c18744fM97213g112, z25, z26));
                        C31527e0 c31527e112 = new C31527e0();
                        C41017e0 c41017e112 = AbstractC41023g0.f176998x;
                        C41060w0 c41060w113 = C41060w0.f177067E;
                        list = Collections.EMPTY_LIST;
                        c41060w0 = C41060w0.f177067E;
                        uri = Uri.parse(videoUri);
                        if (uri != null) {
                            c31539i0 = new C31539i0(uri, null, list, c41060w0);
                        } else {
                            c31539i0 = null;
                        }
                        c31571u113.m381O(new C31545k0("", new C31533g0(c31527e112), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                        c31571u113.m97225t0(z24);
                        if (z47) {
                            i47 = 2;
                        } else {
                            i47 = 0;
                        }
                        c31571u113.m97226u0(i47);
                        c31571u113.m97218m0();
                        c28655q2.m87172p0(c31571u113);
                        objM87133R = c31571u113;
                    }
                    interfaceC31544k = (InterfaceC31544k) objM87133R;
                    AbstractC22676k.m65747g(interfaceC31544k);
                    Modifier modifierM3599a11115 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                    if ((i46 & 3670016) == 1048576) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zM87157i114 = z54 | c28655q2.m87157i(interfaceC31544k);
                    if ((i45 & 14) == 4) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                    boolean z61111111114 = zM87157i114 | z55;
                    if ((i45 & 112) == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z61111111115 = z61111111114 | z56;
                    if ((i46 & 458752) == 131072) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    boolean z61111111116 = z61111111115 | z57;
                    if ((i46 & 1879048192) == 536870912) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    boolean z61111111117 = z61111111116 | z58;
                    if ((i45 & 7168) == 2048) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    z60 = z61111111117 | z59;
                    objM87133R2 = c28655q2.m87133R();
                    if (z60) {
                        boolean z711117 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z711117, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z711117;
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        boolean z711118 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z711118, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z711118;
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a11115, null, c28655q2, 0, 4);
                    c28655q = c28655q2;
                    zM87157i = c28655q.m87157i(interfaceC31544k2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                    if (z46) {
                        c28655q.m87150e0(1094583544);
                        C38072d c38072d113 = C38072d.f163053a;
                        C27430e c27430eM107874S113 = AbstractC34132o.m107874S(c38072d113.m121951d().getAction().getCross(), c28655q, 6);
                        String strM21273g113 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                        float f1115 = 4;
                        Modifier modifierM3599a11116 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f1115, AbstractC1099a.m3394p(6 * f1115, c2314t))), "closeIcon");
                        if ((i45 & 896) == 256) {
                            z65 = true;
                        } else {
                            z65 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z65) {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S113, strM21273g113, AbstractC1092a.m3362g(modifierM3599a11116, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d113.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1095124587);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z37 = z49;
                    z38 = z52;
                    z39 = z64;
                    z36 = z24;
                    z28 = z46;
                    z29 = z47;
                    modifier3 = modifier116;
                    z34 = z25;
                    z35 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z28 = z17;
                    z29 = z18;
                    z34 = z25;
                    z35 = z26;
                    modifier3 = modifier2;
                    z36 = z24;
                    z37 = z15;
                    z38 = z16;
                    z39 = z19;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 100663296;
            i38 = i15 & 512;
            if (i38 != 0) {
                i16 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87155h(z19)) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i16 |= i39;
            }
            if ((i14 & 6) == 0) {
                if (c28655q2.m87157i(goFullScreen)) {
                    i49 = 4;
                } else {
                    i49 = 2;
                }
                i44 = i14 | i49;
            } else {
                i44 = i14;
            }
            if ((i14 & 48) == 0) {
                if (c28655q2.m87157i(clearFullScreen)) {
                    i48 = 32;
                } else {
                    i48 = 16;
                }
                i44 |= i48;
            }
            if ((i14 & 384) == 0) {
                i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q2.m87157i(onUserViewedFullVideo)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i44 |= i18;
            }
            i45 = i44;
            if ((i16 & 306783379) == 306783378) {
                z27 = true;
            } else {
                z27 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z27)) {
                c2314t = C2314t.f9131w;
                if (i54 != 0) {
                    modifier2 = c2314t;
                }
                if (i55 != 0) {
                    z24 = true;
                }
                if (i17 != 0) {
                    z25 = false;
                }
                if (i24 != 0) {
                    z26 = false;
                }
                if (i26 != 0) {
                    z44 = true;
                } else {
                    z44 = z15;
                }
                if (i28 != 0) {
                    z45 = true;
                } else {
                    z45 = z16;
                }
                if (i34 != 0) {
                    z46 = true;
                } else {
                    z46 = z17;
                }
                if (i36 != 0) {
                    z47 = false;
                } else {
                    z47 = z18;
                }
                if (i38 != 0) {
                    z48 = true;
                } else {
                    z48 = z19;
                }
                z49 = z44;
                InterfaceC39127r0 interfaceC39127r0M66763d114 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                i46 = i16;
                z52 = z45;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier117 = modifier2;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d114);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m114);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N114);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    C31541j c31541j114 = new C31541j(context);
                    C20033m c20033m114 = new C20033m(context);
                    AbstractC24543a.m71573i(!c31541j114.f130194q);
                    c31541j114.f130182e = new C2853n(c20033m114, 3);
                    AbstractC24543a.m71573i(!c31541j114.f130194q);
                    c31541j114.f130194q = true;
                    C31571u c31571u114 = new C31571u(c31541j114);
                    C18744f c18744fM97213g113 = c31571u114.m97213g0();
                    AbstractC22676k.m65749i(c18744fM97213g113, "getTrackSelectionParameters(...)");
                    c31571u114.m97227v0(m10973l(c18744fM97213g113, z25, z26));
                    C31527e0 c31527e113 = new C31527e0();
                    C41017e0 c41017e113 = AbstractC41023g0.f176998x;
                    C41060w0 c41060w114 = C41060w0.f177067E;
                    list = Collections.EMPTY_LIST;
                    c41060w0 = C41060w0.f177067E;
                    uri = Uri.parse(videoUri);
                    if (uri != null) {
                        c31539i0 = new C31539i0(uri, null, list, c41060w0);
                    } else {
                        c31539i0 = null;
                    }
                    c31571u114.m381O(new C31545k0("", new C31533g0(c31527e113), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                    c31571u114.m97225t0(z24);
                    if (z47) {
                        i47 = 2;
                    } else {
                        i47 = 0;
                    }
                    c31571u114.m97226u0(i47);
                    c31571u114.m97218m0();
                    c28655q2.m87172p0(c31571u114);
                    objM87133R = c31571u114;
                }
                interfaceC31544k = (InterfaceC31544k) objM87133R;
                AbstractC22676k.m65747g(interfaceC31544k);
                Modifier modifierM3599a11117 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                if ((i46 & 3670016) == 1048576) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                boolean zM87157i115 = z54 | c28655q2.m87157i(interfaceC31544k);
                if ((i45 & 14) == 4) {
                    z55 = true;
                } else {
                    z55 = false;
                }
                boolean z61111111118 = zM87157i115 | z55;
                if ((i45 & 112) == 32) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                boolean z61111111119 = z61111111118 | z56;
                if ((i46 & 458752) == 131072) {
                    z57 = true;
                } else {
                    z57 = false;
                }
                boolean z611111111110 = z61111111119 | z57;
                if ((i46 & 1879048192) == 536870912) {
                    z58 = true;
                } else {
                    z58 = false;
                }
                boolean z611111111111 = z611111111110 | z58;
                if ((i45 & 7168) == 2048) {
                    z59 = true;
                } else {
                    z59 = false;
                }
                z60 = z611111111111 | z59;
                objM87133R2 = c28655q2.m87133R();
                if (z60) {
                    boolean z711119 = z48;
                    objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z711119, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                    interfaceC31544k2 = interfaceC31544k;
                    z64 = z711119;
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    boolean z7111110 = z48;
                    objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7111110, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                    interfaceC31544k2 = interfaceC31544k;
                    z64 = z7111110;
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a11117, null, c28655q2, 0, 4);
                c28655q = c28655q2;
                zM87157i = c28655q.m87157i(interfaceC31544k2);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R3 = new C3610c(interfaceC31544k2, 0);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3610c(interfaceC31544k2, 0);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                if (z46) {
                    c28655q.m87150e0(1094583544);
                    C38072d c38072d114 = C38072d.f163053a;
                    C27430e c27430eM107874S114 = AbstractC34132o.m107874S(c38072d114.m121951d().getAction().getCross(), c28655q, 6);
                    String strM21273g114 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                    float f1116 = 4;
                    Modifier modifierM3599a11118 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f1116, AbstractC1099a.m3394p(6 * f1116, c2314t))), "closeIcon");
                    if ((i45 & 896) == 256) {
                        z65 = true;
                    } else {
                        z65 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z65) {
                        objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S114, strM21273g114, AbstractC1092a.m3362g(modifierM3599a11118, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d114.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1095124587);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z37 = z49;
                z38 = z52;
                z39 = z64;
                z36 = z24;
                z28 = z46;
                z29 = z47;
                modifier3 = modifier117;
                z34 = z25;
                z35 = z26;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z28 = z17;
                z29 = z18;
                z34 = z25;
                z35 = z26;
                modifier3 = modifier2;
                z36 = z24;
                z37 = z15;
                z38 = z16;
                z39 = z19;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 3072;
        z25 = z13;
        i24 = i15 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                z26 = z14;
                if (c28655q2.m87155h(z26)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i25;
            }
            i26 = i15 & 32;
            if (i26 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i27;
            }
            i28 = i15 & 64;
            if (i28 != 0) {
                i16 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87155h(z16)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i16 |= i29;
            }
            i34 = i15 & 128;
            if (i34 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87155h(z17)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i16 |= i35;
                }
                i36 = i15 & 256;
                if (i36 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87155h(z18)) {
                            i37 = 67108864;
                        } else {
                            i37 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i37;
                    }
                    i38 = i15 & 512;
                    if (i38 != 0) {
                        i16 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87155h(z19)) {
                            i39 = 536870912;
                        } else {
                            i39 = 268435456;
                        }
                        i16 |= i39;
                    }
                    if ((i14 & 6) == 0) {
                        if (c28655q2.m87157i(goFullScreen)) {
                            i49 = 4;
                        } else {
                            i49 = 2;
                        }
                        i44 = i14 | i49;
                    } else {
                        i44 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87157i(clearFullScreen)) {
                            i48 = 32;
                        } else {
                            i48 = 16;
                        }
                        i44 |= i48;
                    }
                    if ((i14 & 384) == 0) {
                        i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                    }
                    if ((i14 & 3072) == 0) {
                        if (c28655q2.m87157i(onUserViewedFullVideo)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i44 |= i18;
                    }
                    i45 = i44;
                    if ((i16 & 306783379) == 306783378) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z27)) {
                        c2314t = C2314t.f9131w;
                        if (i54 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i55 != 0) {
                            z24 = true;
                        }
                        if (i17 != 0) {
                            z25 = false;
                        }
                        if (i24 != 0) {
                            z26 = false;
                        }
                        if (i26 != 0) {
                            z44 = true;
                        } else {
                            z44 = z15;
                        }
                        if (i28 != 0) {
                            z45 = true;
                        } else {
                            z45 = z16;
                        }
                        if (i34 != 0) {
                            z46 = true;
                        } else {
                            z46 = z17;
                        }
                        if (i36 != 0) {
                            z47 = false;
                        } else {
                            z47 = z18;
                        }
                        if (i38 != 0) {
                            z48 = true;
                        } else {
                            z48 = z19;
                        }
                        z49 = z44;
                        InterfaceC39127r0 interfaceC39127r0M66763d115 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        i46 = i16;
                        z52 = z45;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q2.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier118 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d115);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m115);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N115);
                        context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            C31541j c31541j115 = new C31541j(context);
                            C20033m c20033m115 = new C20033m(context);
                            AbstractC24543a.m71573i(!c31541j115.f130194q);
                            c31541j115.f130182e = new C2853n(c20033m115, 3);
                            AbstractC24543a.m71573i(!c31541j115.f130194q);
                            c31541j115.f130194q = true;
                            C31571u c31571u115 = new C31571u(c31541j115);
                            C18744f c18744fM97213g114 = c31571u115.m97213g0();
                            AbstractC22676k.m65749i(c18744fM97213g114, "getTrackSelectionParameters(...)");
                            c31571u115.m97227v0(m10973l(c18744fM97213g114, z25, z26));
                            C31527e0 c31527e114 = new C31527e0();
                            C41017e0 c41017e114 = AbstractC41023g0.f176998x;
                            C41060w0 c41060w115 = C41060w0.f177067E;
                            list = Collections.EMPTY_LIST;
                            c41060w0 = C41060w0.f177067E;
                            uri = Uri.parse(videoUri);
                            if (uri != null) {
                                c31539i0 = new C31539i0(uri, null, list, c41060w0);
                            } else {
                                c31539i0 = null;
                            }
                            c31571u115.m381O(new C31545k0("", new C31533g0(c31527e114), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                            c31571u115.m97225t0(z24);
                            if (z47) {
                                i47 = 2;
                            } else {
                                i47 = 0;
                            }
                            c31571u115.m97226u0(i47);
                            c31571u115.m97218m0();
                            c28655q2.m87172p0(c31571u115);
                            objM87133R = c31571u115;
                        }
                        interfaceC31544k = (InterfaceC31544k) objM87133R;
                        AbstractC22676k.m65747g(interfaceC31544k);
                        Modifier modifierM3599a11119 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                        if ((i46 & 3670016) == 1048576) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zM87157i116 = z54 | c28655q2.m87157i(interfaceC31544k);
                        if ((i45 & 14) == 4) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                        boolean z611111111112 = zM87157i116 | z55;
                        if ((i45 & 112) == 32) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean z611111111113 = z611111111112 | z56;
                        if ((i46 & 458752) == 131072) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        boolean z611111111114 = z611111111113 | z57;
                        if ((i46 & 1879048192) == 536870912) {
                            z58 = true;
                        } else {
                            z58 = false;
                        }
                        boolean z611111111115 = z611111111114 | z58;
                        if ((i45 & 7168) == 2048) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                        z60 = z611111111115 | z59;
                        objM87133R2 = c28655q2.m87133R();
                        if (z60) {
                            boolean z7111111 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7111111, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z7111111;
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            boolean z7111112 = z48;
                            objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7111112, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                            interfaceC31544k2 = interfaceC31544k;
                            z64 = z7111112;
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a11119, null, c28655q2, 0, 4);
                        c28655q = c28655q2;
                        zM87157i = c28655q.m87157i(interfaceC31544k2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C3610c(interfaceC31544k2, 0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                        if (z46) {
                            c28655q.m87150e0(1094583544);
                            C38072d c38072d115 = C38072d.f163053a;
                            C27430e c27430eM107874S115 = AbstractC34132o.m107874S(c38072d115.m121951d().getAction().getCross(), c28655q, 6);
                            String strM21273g115 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                            float f1117 = 4;
                            Modifier modifierM3599a111110 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f1117, AbstractC1099a.m3394p(6 * f1117, c2314t))), "closeIcon");
                            if ((i45 & 896) == 256) {
                                z65 = true;
                            } else {
                                z65 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z65) {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S115, strM21273g115, AbstractC1092a.m3362g(modifierM3599a111110, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d115.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1095124587);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z37 = z49;
                        z38 = z52;
                        z39 = z64;
                        z36 = z24;
                        z28 = z46;
                        z29 = z47;
                        modifier3 = modifier118;
                        z34 = z25;
                        z35 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z28 = z17;
                        z29 = z18;
                        z34 = z25;
                        z35 = z26;
                        modifier3 = modifier2;
                        z36 = z24;
                        z37 = z15;
                        z38 = z16;
                        z39 = z19;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 100663296;
                i38 = i15 & 512;
                if (i38 != 0) {
                    i16 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87155h(z19)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i16 |= i39;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(goFullScreen)) {
                        i49 = 4;
                    } else {
                        i49 = 2;
                    }
                    i44 = i14 | i49;
                } else {
                    i44 = i14;
                }
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87157i(clearFullScreen)) {
                        i48 = 32;
                    } else {
                        i48 = 16;
                    }
                    i44 |= i48;
                }
                if ((i14 & 384) == 0) {
                    i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(onUserViewedFullVideo)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i44 |= i18;
                }
                i45 = i44;
                if ((i16 & 306783379) == 306783378) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z27)) {
                    c2314t = C2314t.f9131w;
                    if (i54 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i55 != 0) {
                        z24 = true;
                    }
                    if (i17 != 0) {
                        z25 = false;
                    }
                    if (i24 != 0) {
                        z26 = false;
                    }
                    if (i26 != 0) {
                        z44 = true;
                    } else {
                        z44 = z15;
                    }
                    if (i28 != 0) {
                        z45 = true;
                    } else {
                        z45 = z16;
                    }
                    if (i34 != 0) {
                        z46 = true;
                    } else {
                        z46 = z17;
                    }
                    if (i36 != 0) {
                        z47 = false;
                    } else {
                        z47 = z18;
                    }
                    if (i38 != 0) {
                        z48 = true;
                    } else {
                        z48 = z19;
                    }
                    z49 = z44;
                    InterfaceC39127r0 interfaceC39127r0M66763d116 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    i46 = i16;
                    z52 = z45;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q2.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier119 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d116);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m116);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N116);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        C31541j c31541j116 = new C31541j(context);
                        C20033m c20033m116 = new C20033m(context);
                        AbstractC24543a.m71573i(!c31541j116.f130194q);
                        c31541j116.f130182e = new C2853n(c20033m116, 3);
                        AbstractC24543a.m71573i(!c31541j116.f130194q);
                        c31541j116.f130194q = true;
                        C31571u c31571u116 = new C31571u(c31541j116);
                        C18744f c18744fM97213g115 = c31571u116.m97213g0();
                        AbstractC22676k.m65749i(c18744fM97213g115, "getTrackSelectionParameters(...)");
                        c31571u116.m97227v0(m10973l(c18744fM97213g115, z25, z26));
                        C31527e0 c31527e115 = new C31527e0();
                        C41017e0 c41017e115 = AbstractC41023g0.f176998x;
                        C41060w0 c41060w116 = C41060w0.f177067E;
                        list = Collections.EMPTY_LIST;
                        c41060w0 = C41060w0.f177067E;
                        uri = Uri.parse(videoUri);
                        if (uri != null) {
                            c31539i0 = new C31539i0(uri, null, list, c41060w0);
                        } else {
                            c31539i0 = null;
                        }
                        c31571u116.m381O(new C31545k0("", new C31533g0(c31527e115), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                        c31571u116.m97225t0(z24);
                        if (z47) {
                            i47 = 2;
                        } else {
                            i47 = 0;
                        }
                        c31571u116.m97226u0(i47);
                        c31571u116.m97218m0();
                        c28655q2.m87172p0(c31571u116);
                        objM87133R = c31571u116;
                    }
                    interfaceC31544k = (InterfaceC31544k) objM87133R;
                    AbstractC22676k.m65747g(interfaceC31544k);
                    Modifier modifierM3599a111111 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                    if ((i46 & 3670016) == 1048576) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zM87157i117 = z54 | c28655q2.m87157i(interfaceC31544k);
                    if ((i45 & 14) == 4) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                    boolean z611111111116 = zM87157i117 | z55;
                    if ((i45 & 112) == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z611111111117 = z611111111116 | z56;
                    if ((i46 & 458752) == 131072) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    boolean z611111111118 = z611111111117 | z57;
                    if ((i46 & 1879048192) == 536870912) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    boolean z611111111119 = z611111111118 | z58;
                    if ((i45 & 7168) == 2048) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    z60 = z611111111119 | z59;
                    objM87133R2 = c28655q2.m87133R();
                    if (z60) {
                        boolean z7111113 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7111113, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z7111113;
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        boolean z7111114 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7111114, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z7111114;
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a111111, null, c28655q2, 0, 4);
                    c28655q = c28655q2;
                    zM87157i = c28655q.m87157i(interfaceC31544k2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                    if (z46) {
                        c28655q.m87150e0(1094583544);
                        C38072d c38072d116 = C38072d.f163053a;
                        C27430e c27430eM107874S116 = AbstractC34132o.m107874S(c38072d116.m121951d().getAction().getCross(), c28655q, 6);
                        String strM21273g116 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                        float f1118 = 4;
                        Modifier modifierM3599a111112 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f1118, AbstractC1099a.m3394p(6 * f1118, c2314t))), "closeIcon");
                        if ((i45 & 896) == 256) {
                            z65 = true;
                        } else {
                            z65 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z65) {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S116, strM21273g116, AbstractC1092a.m3362g(modifierM3599a111112, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d116.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1095124587);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z37 = z49;
                    z38 = z52;
                    z39 = z64;
                    z36 = z24;
                    z28 = z46;
                    z29 = z47;
                    modifier3 = modifier119;
                    z34 = z25;
                    z35 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z28 = z17;
                    z29 = z18;
                    z34 = z25;
                    z35 = z26;
                    modifier3 = modifier2;
                    z36 = z24;
                    z37 = z15;
                    z38 = z16;
                    z39 = z19;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 12582912;
            i36 = i15 & 256;
            if (i36 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87155h(z18)) {
                        i37 = 67108864;
                    } else {
                        i37 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i37;
                }
                i38 = i15 & 512;
                if (i38 != 0) {
                    i16 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87155h(z19)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i16 |= i39;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(goFullScreen)) {
                        i49 = 4;
                    } else {
                        i49 = 2;
                    }
                    i44 = i14 | i49;
                } else {
                    i44 = i14;
                }
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87157i(clearFullScreen)) {
                        i48 = 32;
                    } else {
                        i48 = 16;
                    }
                    i44 |= i48;
                }
                if ((i14 & 384) == 0) {
                    i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(onUserViewedFullVideo)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i44 |= i18;
                }
                i45 = i44;
                if ((i16 & 306783379) == 306783378) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z27)) {
                    c2314t = C2314t.f9131w;
                    if (i54 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i55 != 0) {
                        z24 = true;
                    }
                    if (i17 != 0) {
                        z25 = false;
                    }
                    if (i24 != 0) {
                        z26 = false;
                    }
                    if (i26 != 0) {
                        z44 = true;
                    } else {
                        z44 = z15;
                    }
                    if (i28 != 0) {
                        z45 = true;
                    } else {
                        z45 = z16;
                    }
                    if (i34 != 0) {
                        z46 = true;
                    } else {
                        z46 = z17;
                    }
                    if (i36 != 0) {
                        z47 = false;
                    } else {
                        z47 = z18;
                    }
                    if (i38 != 0) {
                        z48 = true;
                    } else {
                        z48 = z19;
                    }
                    z49 = z44;
                    InterfaceC39127r0 interfaceC39127r0M66763d117 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    i46 = i16;
                    z52 = z45;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
                    Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier1110 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d117);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m117);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N117);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        C31541j c31541j117 = new C31541j(context);
                        C20033m c20033m117 = new C20033m(context);
                        AbstractC24543a.m71573i(!c31541j117.f130194q);
                        c31541j117.f130182e = new C2853n(c20033m117, 3);
                        AbstractC24543a.m71573i(!c31541j117.f130194q);
                        c31541j117.f130194q = true;
                        C31571u c31571u117 = new C31571u(c31541j117);
                        C18744f c18744fM97213g116 = c31571u117.m97213g0();
                        AbstractC22676k.m65749i(c18744fM97213g116, "getTrackSelectionParameters(...)");
                        c31571u117.m97227v0(m10973l(c18744fM97213g116, z25, z26));
                        C31527e0 c31527e116 = new C31527e0();
                        C41017e0 c41017e116 = AbstractC41023g0.f176998x;
                        C41060w0 c41060w117 = C41060w0.f177067E;
                        list = Collections.EMPTY_LIST;
                        c41060w0 = C41060w0.f177067E;
                        uri = Uri.parse(videoUri);
                        if (uri != null) {
                            c31539i0 = new C31539i0(uri, null, list, c41060w0);
                        } else {
                            c31539i0 = null;
                        }
                        c31571u117.m381O(new C31545k0("", new C31533g0(c31527e116), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                        c31571u117.m97225t0(z24);
                        if (z47) {
                            i47 = 2;
                        } else {
                            i47 = 0;
                        }
                        c31571u117.m97226u0(i47);
                        c31571u117.m97218m0();
                        c28655q2.m87172p0(c31571u117);
                        objM87133R = c31571u117;
                    }
                    interfaceC31544k = (InterfaceC31544k) objM87133R;
                    AbstractC22676k.m65747g(interfaceC31544k);
                    Modifier modifierM3599a111113 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                    if ((i46 & 3670016) == 1048576) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zM87157i118 = z54 | c28655q2.m87157i(interfaceC31544k);
                    if ((i45 & 14) == 4) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                    boolean z6111111111110 = zM87157i118 | z55;
                    if ((i45 & 112) == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z6111111111111 = z6111111111110 | z56;
                    if ((i46 & 458752) == 131072) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    boolean z6111111111112 = z6111111111111 | z57;
                    if ((i46 & 1879048192) == 536870912) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    boolean z6111111111113 = z6111111111112 | z58;
                    if ((i45 & 7168) == 2048) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    z60 = z6111111111113 | z59;
                    objM87133R2 = c28655q2.m87133R();
                    if (z60) {
                        boolean z7111115 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7111115, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z7111115;
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        boolean z7111116 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7111116, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z7111116;
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a111113, null, c28655q2, 0, 4);
                    c28655q = c28655q2;
                    zM87157i = c28655q.m87157i(interfaceC31544k2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                    if (z46) {
                        c28655q.m87150e0(1094583544);
                        C38072d c38072d117 = C38072d.f163053a;
                        C27430e c27430eM107874S117 = AbstractC34132o.m107874S(c38072d117.m121951d().getAction().getCross(), c28655q, 6);
                        String strM21273g117 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                        float f1119 = 4;
                        Modifier modifierM3599a111114 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f1119, AbstractC1099a.m3394p(6 * f1119, c2314t))), "closeIcon");
                        if ((i45 & 896) == 256) {
                            z65 = true;
                        } else {
                            z65 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z65) {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S117, strM21273g117, AbstractC1092a.m3362g(modifierM3599a111114, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d117.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1095124587);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z37 = z49;
                    z38 = z52;
                    z39 = z64;
                    z36 = z24;
                    z28 = z46;
                    z29 = z47;
                    modifier3 = modifier1110;
                    z34 = z25;
                    z35 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z28 = z17;
                    z29 = z18;
                    z34 = z25;
                    z35 = z26;
                    modifier3 = modifier2;
                    z36 = z24;
                    z37 = z15;
                    z38 = z16;
                    z39 = z19;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 100663296;
            i38 = i15 & 512;
            if (i38 != 0) {
                i16 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87155h(z19)) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i16 |= i39;
            }
            if ((i14 & 6) == 0) {
                if (c28655q2.m87157i(goFullScreen)) {
                    i49 = 4;
                } else {
                    i49 = 2;
                }
                i44 = i14 | i49;
            } else {
                i44 = i14;
            }
            if ((i14 & 48) == 0) {
                if (c28655q2.m87157i(clearFullScreen)) {
                    i48 = 32;
                } else {
                    i48 = 16;
                }
                i44 |= i48;
            }
            if ((i14 & 384) == 0) {
                i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q2.m87157i(onUserViewedFullVideo)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i44 |= i18;
            }
            i45 = i44;
            if ((i16 & 306783379) == 306783378) {
                z27 = true;
            } else {
                z27 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z27)) {
                c2314t = C2314t.f9131w;
                if (i54 != 0) {
                    modifier2 = c2314t;
                }
                if (i55 != 0) {
                    z24 = true;
                }
                if (i17 != 0) {
                    z25 = false;
                }
                if (i24 != 0) {
                    z26 = false;
                }
                if (i26 != 0) {
                    z44 = true;
                } else {
                    z44 = z15;
                }
                if (i28 != 0) {
                    z45 = true;
                } else {
                    z45 = z16;
                }
                if (i34 != 0) {
                    z46 = true;
                } else {
                    z46 = z17;
                }
                if (i36 != 0) {
                    z47 = false;
                } else {
                    z47 = z18;
                }
                if (i38 != 0) {
                    z48 = true;
                } else {
                    z48 = z19;
                }
                z49 = z44;
                InterfaceC39127r0 interfaceC39127r0M66763d118 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                i46 = i16;
                z52 = z45;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q2.m87165m();
                Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q2, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier1111 = modifier2;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d118);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m118);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N118);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    C31541j c31541j118 = new C31541j(context);
                    C20033m c20033m118 = new C20033m(context);
                    AbstractC24543a.m71573i(!c31541j118.f130194q);
                    c31541j118.f130182e = new C2853n(c20033m118, 3);
                    AbstractC24543a.m71573i(!c31541j118.f130194q);
                    c31541j118.f130194q = true;
                    C31571u c31571u118 = new C31571u(c31541j118);
                    C18744f c18744fM97213g117 = c31571u118.m97213g0();
                    AbstractC22676k.m65749i(c18744fM97213g117, "getTrackSelectionParameters(...)");
                    c31571u118.m97227v0(m10973l(c18744fM97213g117, z25, z26));
                    C31527e0 c31527e117 = new C31527e0();
                    C41017e0 c41017e117 = AbstractC41023g0.f176998x;
                    C41060w0 c41060w118 = C41060w0.f177067E;
                    list = Collections.EMPTY_LIST;
                    c41060w0 = C41060w0.f177067E;
                    uri = Uri.parse(videoUri);
                    if (uri != null) {
                        c31539i0 = new C31539i0(uri, null, list, c41060w0);
                    } else {
                        c31539i0 = null;
                    }
                    c31571u118.m381O(new C31545k0("", new C31533g0(c31527e117), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                    c31571u118.m97225t0(z24);
                    if (z47) {
                        i47 = 2;
                    } else {
                        i47 = 0;
                    }
                    c31571u118.m97226u0(i47);
                    c31571u118.m97218m0();
                    c28655q2.m87172p0(c31571u118);
                    objM87133R = c31571u118;
                }
                interfaceC31544k = (InterfaceC31544k) objM87133R;
                AbstractC22676k.m65747g(interfaceC31544k);
                Modifier modifierM3599a111115 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                if ((i46 & 3670016) == 1048576) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                boolean zM87157i119 = z54 | c28655q2.m87157i(interfaceC31544k);
                if ((i45 & 14) == 4) {
                    z55 = true;
                } else {
                    z55 = false;
                }
                boolean z6111111111114 = zM87157i119 | z55;
                if ((i45 & 112) == 32) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                boolean z6111111111115 = z6111111111114 | z56;
                if ((i46 & 458752) == 131072) {
                    z57 = true;
                } else {
                    z57 = false;
                }
                boolean z6111111111116 = z6111111111115 | z57;
                if ((i46 & 1879048192) == 536870912) {
                    z58 = true;
                } else {
                    z58 = false;
                }
                boolean z6111111111117 = z6111111111116 | z58;
                if ((i45 & 7168) == 2048) {
                    z59 = true;
                } else {
                    z59 = false;
                }
                z60 = z6111111111117 | z59;
                objM87133R2 = c28655q2.m87133R();
                if (z60) {
                    boolean z7111117 = z48;
                    objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7111117, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                    interfaceC31544k2 = interfaceC31544k;
                    z64 = z7111117;
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    boolean z7111118 = z48;
                    objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7111118, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                    interfaceC31544k2 = interfaceC31544k;
                    z64 = z7111118;
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a111115, null, c28655q2, 0, 4);
                c28655q = c28655q2;
                zM87157i = c28655q.m87157i(interfaceC31544k2);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R3 = new C3610c(interfaceC31544k2, 0);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3610c(interfaceC31544k2, 0);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                if (z46) {
                    c28655q.m87150e0(1094583544);
                    C38072d c38072d118 = C38072d.f163053a;
                    C27430e c27430eM107874S118 = AbstractC34132o.m107874S(c38072d118.m121951d().getAction().getCross(), c28655q, 6);
                    String strM21273g118 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                    float f11110 = 4;
                    Modifier modifierM3599a111116 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f11110, AbstractC1099a.m3394p(6 * f11110, c2314t))), "closeIcon");
                    if ((i45 & 896) == 256) {
                        z65 = true;
                    } else {
                        z65 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z65) {
                        objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S118, strM21273g118, AbstractC1092a.m3362g(modifierM3599a111116, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d118.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1095124587);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z37 = z49;
                z38 = z52;
                z39 = z64;
                z36 = z24;
                z28 = z46;
                z29 = z47;
                modifier3 = modifier1111;
                z34 = z25;
                z35 = z26;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z28 = z17;
                z29 = z18;
                z34 = z25;
                z35 = z26;
                modifier3 = modifier2;
                z36 = z24;
                z37 = z15;
                z38 = z16;
                z39 = z19;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        z26 = z14;
        i26 = i15 & 32;
        if (i26 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87155h(z15)) {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i27;
        }
        i28 = i15 & 64;
        if (i28 != 0) {
            i16 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q2.m87155h(z16)) {
                i29 = 1048576;
            } else {
                i29 = 524288;
            }
            i16 |= i29;
        }
        i34 = i15 & 128;
        if (i34 != 0) {
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87155h(z17)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i16 |= i35;
            }
            i36 = i15 & 256;
            if (i36 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87155h(z18)) {
                        i37 = 67108864;
                    } else {
                        i37 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i37;
                }
                i38 = i15 & 512;
                if (i38 != 0) {
                    i16 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87155h(z19)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i16 |= i39;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(goFullScreen)) {
                        i49 = 4;
                    } else {
                        i49 = 2;
                    }
                    i44 = i14 | i49;
                } else {
                    i44 = i14;
                }
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87157i(clearFullScreen)) {
                        i48 = 32;
                    } else {
                        i48 = 16;
                    }
                    i44 |= i48;
                }
                if ((i14 & 384) == 0) {
                    i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(onUserViewedFullVideo)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i44 |= i18;
                }
                i45 = i44;
                if ((i16 & 306783379) == 306783378) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z27)) {
                    c2314t = C2314t.f9131w;
                    if (i54 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i55 != 0) {
                        z24 = true;
                    }
                    if (i17 != 0) {
                        z25 = false;
                    }
                    if (i24 != 0) {
                        z26 = false;
                    }
                    if (i26 != 0) {
                        z44 = true;
                    } else {
                        z44 = z15;
                    }
                    if (i28 != 0) {
                        z45 = true;
                    } else {
                        z45 = z16;
                    }
                    if (i34 != 0) {
                        z46 = true;
                    } else {
                        z46 = z17;
                    }
                    if (i36 != 0) {
                        z47 = false;
                    } else {
                        z47 = z18;
                    }
                    if (i38 != 0) {
                        z48 = true;
                    } else {
                        z48 = z19;
                    }
                    z49 = z44;
                    InterfaceC39127r0 interfaceC39127r0M66763d119 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    i46 = i16;
                    z52 = z45;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q2.m87165m();
                    Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier1112 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d119);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m119);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N119);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        C31541j c31541j119 = new C31541j(context);
                        C20033m c20033m119 = new C20033m(context);
                        AbstractC24543a.m71573i(!c31541j119.f130194q);
                        c31541j119.f130182e = new C2853n(c20033m119, 3);
                        AbstractC24543a.m71573i(!c31541j119.f130194q);
                        c31541j119.f130194q = true;
                        C31571u c31571u119 = new C31571u(c31541j119);
                        C18744f c18744fM97213g118 = c31571u119.m97213g0();
                        AbstractC22676k.m65749i(c18744fM97213g118, "getTrackSelectionParameters(...)");
                        c31571u119.m97227v0(m10973l(c18744fM97213g118, z25, z26));
                        C31527e0 c31527e118 = new C31527e0();
                        C41017e0 c41017e118 = AbstractC41023g0.f176998x;
                        C41060w0 c41060w119 = C41060w0.f177067E;
                        list = Collections.EMPTY_LIST;
                        c41060w0 = C41060w0.f177067E;
                        uri = Uri.parse(videoUri);
                        if (uri != null) {
                            c31539i0 = new C31539i0(uri, null, list, c41060w0);
                        } else {
                            c31539i0 = null;
                        }
                        c31571u119.m381O(new C31545k0("", new C31533g0(c31527e118), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                        c31571u119.m97225t0(z24);
                        if (z47) {
                            i47 = 2;
                        } else {
                            i47 = 0;
                        }
                        c31571u119.m97226u0(i47);
                        c31571u119.m97218m0();
                        c28655q2.m87172p0(c31571u119);
                        objM87133R = c31571u119;
                    }
                    interfaceC31544k = (InterfaceC31544k) objM87133R;
                    AbstractC22676k.m65747g(interfaceC31544k);
                    Modifier modifierM3599a111117 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                    if ((i46 & 3670016) == 1048576) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zM87157i1110 = z54 | c28655q2.m87157i(interfaceC31544k);
                    if ((i45 & 14) == 4) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                    boolean z6111111111118 = zM87157i1110 | z55;
                    if ((i45 & 112) == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z6111111111119 = z6111111111118 | z56;
                    if ((i46 & 458752) == 131072) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    boolean z61111111111110 = z6111111111119 | z57;
                    if ((i46 & 1879048192) == 536870912) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    boolean z61111111111111 = z61111111111110 | z58;
                    if ((i45 & 7168) == 2048) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    z60 = z61111111111111 | z59;
                    objM87133R2 = c28655q2.m87133R();
                    if (z60) {
                        boolean z7111119 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z7111119, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z7111119;
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        boolean z71111110 = z48;
                        objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71111110, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                        interfaceC31544k2 = interfaceC31544k;
                        z64 = z71111110;
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a111117, null, c28655q2, 0, 4);
                    c28655q = c28655q2;
                    zM87157i = c28655q.m87157i(interfaceC31544k2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3610c(interfaceC31544k2, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                    if (z46) {
                        c28655q.m87150e0(1094583544);
                        C38072d c38072d119 = C38072d.f163053a;
                        C27430e c27430eM107874S119 = AbstractC34132o.m107874S(c38072d119.m121951d().getAction().getCross(), c28655q, 6);
                        String strM21273g119 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                        float f11111 = 4;
                        Modifier modifierM3599a111118 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f11111, AbstractC1099a.m3394p(6 * f11111, c2314t))), "closeIcon");
                        if ((i45 & 896) == 256) {
                            z65 = true;
                        } else {
                            z65 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z65) {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S119, strM21273g119, AbstractC1092a.m3362g(modifierM3599a111118, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d119.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1095124587);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z37 = z49;
                    z38 = z52;
                    z39 = z64;
                    z36 = z24;
                    z28 = z46;
                    z29 = z47;
                    modifier3 = modifier1112;
                    z34 = z25;
                    z35 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z28 = z17;
                    z29 = z18;
                    z34 = z25;
                    z35 = z26;
                    modifier3 = modifier2;
                    z36 = z24;
                    z37 = z15;
                    z38 = z16;
                    z39 = z19;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 100663296;
            i38 = i15 & 512;
            if (i38 != 0) {
                i16 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87155h(z19)) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i16 |= i39;
            }
            if ((i14 & 6) == 0) {
                if (c28655q2.m87157i(goFullScreen)) {
                    i49 = 4;
                } else {
                    i49 = 2;
                }
                i44 = i14 | i49;
            } else {
                i44 = i14;
            }
            if ((i14 & 48) == 0) {
                if (c28655q2.m87157i(clearFullScreen)) {
                    i48 = 32;
                } else {
                    i48 = 16;
                }
                i44 |= i48;
            }
            if ((i14 & 384) == 0) {
                i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q2.m87157i(onUserViewedFullVideo)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i44 |= i18;
            }
            i45 = i44;
            if ((i16 & 306783379) == 306783378) {
                z27 = true;
            } else {
                z27 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z27)) {
                c2314t = C2314t.f9131w;
                if (i54 != 0) {
                    modifier2 = c2314t;
                }
                if (i55 != 0) {
                    z24 = true;
                }
                if (i17 != 0) {
                    z25 = false;
                }
                if (i24 != 0) {
                    z26 = false;
                }
                if (i26 != 0) {
                    z44 = true;
                } else {
                    z44 = z15;
                }
                if (i28 != 0) {
                    z45 = true;
                } else {
                    z45 = z16;
                }
                if (i34 != 0) {
                    z46 = true;
                } else {
                    z46 = z17;
                }
                if (i36 != 0) {
                    z47 = false;
                } else {
                    z47 = z18;
                }
                if (i38 != 0) {
                    z48 = true;
                } else {
                    z48 = z19;
                }
                z49 = z44;
                InterfaceC39127r0 interfaceC39127r0M66763d1110 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                i46 = i16;
                z52 = z45;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q2.m87165m();
                Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q2, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier1113 = modifier2;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1110);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1110);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1110);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    C31541j c31541j1110 = new C31541j(context);
                    C20033m c20033m1110 = new C20033m(context);
                    AbstractC24543a.m71573i(!c31541j1110.f130194q);
                    c31541j1110.f130182e = new C2853n(c20033m1110, 3);
                    AbstractC24543a.m71573i(!c31541j1110.f130194q);
                    c31541j1110.f130194q = true;
                    C31571u c31571u1110 = new C31571u(c31541j1110);
                    C18744f c18744fM97213g119 = c31571u1110.m97213g0();
                    AbstractC22676k.m65749i(c18744fM97213g119, "getTrackSelectionParameters(...)");
                    c31571u1110.m97227v0(m10973l(c18744fM97213g119, z25, z26));
                    C31527e0 c31527e119 = new C31527e0();
                    C41017e0 c41017e119 = AbstractC41023g0.f176998x;
                    C41060w0 c41060w1110 = C41060w0.f177067E;
                    list = Collections.EMPTY_LIST;
                    c41060w0 = C41060w0.f177067E;
                    uri = Uri.parse(videoUri);
                    if (uri != null) {
                        c31539i0 = new C31539i0(uri, null, list, c41060w0);
                    } else {
                        c31539i0 = null;
                    }
                    c31571u1110.m381O(new C31545k0("", new C31533g0(c31527e119), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                    c31571u1110.m97225t0(z24);
                    if (z47) {
                        i47 = 2;
                    } else {
                        i47 = 0;
                    }
                    c31571u1110.m97226u0(i47);
                    c31571u1110.m97218m0();
                    c28655q2.m87172p0(c31571u1110);
                    objM87133R = c31571u1110;
                }
                interfaceC31544k = (InterfaceC31544k) objM87133R;
                AbstractC22676k.m65747g(interfaceC31544k);
                Modifier modifierM3599a111119 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                if ((i46 & 3670016) == 1048576) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                boolean zM87157i1111 = z54 | c28655q2.m87157i(interfaceC31544k);
                if ((i45 & 14) == 4) {
                    z55 = true;
                } else {
                    z55 = false;
                }
                boolean z61111111111112 = zM87157i1111 | z55;
                if ((i45 & 112) == 32) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                boolean z61111111111113 = z61111111111112 | z56;
                if ((i46 & 458752) == 131072) {
                    z57 = true;
                } else {
                    z57 = false;
                }
                boolean z61111111111114 = z61111111111113 | z57;
                if ((i46 & 1879048192) == 536870912) {
                    z58 = true;
                } else {
                    z58 = false;
                }
                boolean z61111111111115 = z61111111111114 | z58;
                if ((i45 & 7168) == 2048) {
                    z59 = true;
                } else {
                    z59 = false;
                }
                z60 = z61111111111115 | z59;
                objM87133R2 = c28655q2.m87133R();
                if (z60) {
                    boolean z71111111 = z48;
                    objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71111111, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                    interfaceC31544k2 = interfaceC31544k;
                    z64 = z71111111;
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    boolean z71111112 = z48;
                    objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71111112, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                    interfaceC31544k2 = interfaceC31544k;
                    z64 = z71111112;
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a111119, null, c28655q2, 0, 4);
                c28655q = c28655q2;
                zM87157i = c28655q.m87157i(interfaceC31544k2);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R3 = new C3610c(interfaceC31544k2, 0);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3610c(interfaceC31544k2, 0);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                if (z46) {
                    c28655q.m87150e0(1094583544);
                    C38072d c38072d1110 = C38072d.f163053a;
                    C27430e c27430eM107874S1110 = AbstractC34132o.m107874S(c38072d1110.m121951d().getAction().getCross(), c28655q, 6);
                    String strM21273g1110 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                    float f11112 = 4;
                    Modifier modifierM3599a1111110 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f11112, AbstractC1099a.m3394p(6 * f11112, c2314t))), "closeIcon");
                    if ((i45 & 896) == 256) {
                        z65 = true;
                    } else {
                        z65 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z65) {
                        objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S1110, strM21273g1110, AbstractC1092a.m3362g(modifierM3599a1111110, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d1110.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1095124587);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z37 = z49;
                z38 = z52;
                z39 = z64;
                z36 = z24;
                z28 = z46;
                z29 = z47;
                modifier3 = modifier1113;
                z34 = z25;
                z35 = z26;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z28 = z17;
                z29 = z18;
                z34 = z25;
                z35 = z26;
                modifier3 = modifier2;
                z36 = z24;
                z37 = z15;
                z38 = z16;
                z39 = z19;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 12582912;
        i36 = i15 & 256;
        if (i36 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87155h(z18)) {
                    i37 = 67108864;
                } else {
                    i37 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i37;
            }
            i38 = i15 & 512;
            if (i38 != 0) {
                i16 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87155h(z19)) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i16 |= i39;
            }
            if ((i14 & 6) == 0) {
                if (c28655q2.m87157i(goFullScreen)) {
                    i49 = 4;
                } else {
                    i49 = 2;
                }
                i44 = i14 | i49;
            } else {
                i44 = i14;
            }
            if ((i14 & 48) == 0) {
                if (c28655q2.m87157i(clearFullScreen)) {
                    i48 = 32;
                } else {
                    i48 = 16;
                }
                i44 |= i48;
            }
            if ((i14 & 384) == 0) {
                i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q2.m87157i(onUserViewedFullVideo)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i44 |= i18;
            }
            i45 = i44;
            if ((i16 & 306783379) == 306783378) {
                z27 = true;
            } else {
                z27 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z27)) {
                c2314t = C2314t.f9131w;
                if (i54 != 0) {
                    modifier2 = c2314t;
                }
                if (i55 != 0) {
                    z24 = true;
                }
                if (i17 != 0) {
                    z25 = false;
                }
                if (i24 != 0) {
                    z26 = false;
                }
                if (i26 != 0) {
                    z44 = true;
                } else {
                    z44 = z15;
                }
                if (i28 != 0) {
                    z45 = true;
                } else {
                    z45 = z16;
                }
                if (i34 != 0) {
                    z46 = true;
                } else {
                    z46 = z17;
                }
                if (i36 != 0) {
                    z47 = false;
                } else {
                    z47 = z18;
                }
                if (i38 != 0) {
                    z48 = true;
                } else {
                    z48 = z19;
                }
                z49 = z44;
                InterfaceC39127r0 interfaceC39127r0M66763d1111 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                i46 = i16;
                z52 = z45;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q2.m87165m();
                Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q2, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier1114 = modifier2;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1111);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1111);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1111);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    C31541j c31541j1111 = new C31541j(context);
                    C20033m c20033m1111 = new C20033m(context);
                    AbstractC24543a.m71573i(!c31541j1111.f130194q);
                    c31541j1111.f130182e = new C2853n(c20033m1111, 3);
                    AbstractC24543a.m71573i(!c31541j1111.f130194q);
                    c31541j1111.f130194q = true;
                    C31571u c31571u1111 = new C31571u(c31541j1111);
                    C18744f c18744fM97213g1110 = c31571u1111.m97213g0();
                    AbstractC22676k.m65749i(c18744fM97213g1110, "getTrackSelectionParameters(...)");
                    c31571u1111.m97227v0(m10973l(c18744fM97213g1110, z25, z26));
                    C31527e0 c31527e1110 = new C31527e0();
                    C41017e0 c41017e1110 = AbstractC41023g0.f176998x;
                    C41060w0 c41060w1111 = C41060w0.f177067E;
                    list = Collections.EMPTY_LIST;
                    c41060w0 = C41060w0.f177067E;
                    uri = Uri.parse(videoUri);
                    if (uri != null) {
                        c31539i0 = new C31539i0(uri, null, list, c41060w0);
                    } else {
                        c31539i0 = null;
                    }
                    c31571u1111.m381O(new C31545k0("", new C31533g0(c31527e1110), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                    c31571u1111.m97225t0(z24);
                    if (z47) {
                        i47 = 2;
                    } else {
                        i47 = 0;
                    }
                    c31571u1111.m97226u0(i47);
                    c31571u1111.m97218m0();
                    c28655q2.m87172p0(c31571u1111);
                    objM87133R = c31571u1111;
                }
                interfaceC31544k = (InterfaceC31544k) objM87133R;
                AbstractC22676k.m65747g(interfaceC31544k);
                Modifier modifierM3599a1111111 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
                if ((i46 & 3670016) == 1048576) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                boolean zM87157i1112 = z54 | c28655q2.m87157i(interfaceC31544k);
                if ((i45 & 14) == 4) {
                    z55 = true;
                } else {
                    z55 = false;
                }
                boolean z61111111111116 = zM87157i1112 | z55;
                if ((i45 & 112) == 32) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                boolean z61111111111117 = z61111111111116 | z56;
                if ((i46 & 458752) == 131072) {
                    z57 = true;
                } else {
                    z57 = false;
                }
                boolean z61111111111118 = z61111111111117 | z57;
                if ((i46 & 1879048192) == 536870912) {
                    z58 = true;
                } else {
                    z58 = false;
                }
                boolean z61111111111119 = z61111111111118 | z58;
                if ((i45 & 7168) == 2048) {
                    z59 = true;
                } else {
                    z59 = false;
                }
                z60 = z61111111111119 | z59;
                objM87133R2 = c28655q2.m87133R();
                if (z60) {
                    boolean z71111113 = z48;
                    objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71111113, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                    interfaceC31544k2 = interfaceC31544k;
                    z64 = z71111113;
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    boolean z71111114 = z48;
                    objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71111114, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                    interfaceC31544k2 = interfaceC31544k;
                    z64 = z71111114;
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a1111111, null, c28655q2, 0, 4);
                c28655q = c28655q2;
                zM87157i = c28655q.m87157i(interfaceC31544k2);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R3 = new C3610c(interfaceC31544k2, 0);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3610c(interfaceC31544k2, 0);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
                if (z46) {
                    c28655q.m87150e0(1094583544);
                    C38072d c38072d1111 = C38072d.f163053a;
                    C27430e c27430eM107874S1111 = AbstractC34132o.m107874S(c38072d1111.m121951d().getAction().getCross(), c28655q, 6);
                    String strM21273g1111 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                    float f11113 = 4;
                    Modifier modifierM3599a1111112 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f11113, AbstractC1099a.m3394p(6 * f11113, c2314t))), "closeIcon");
                    if ((i45 & 896) == 256) {
                        z65 = true;
                    } else {
                        z65 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z65) {
                        objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S1111, strM21273g1111, AbstractC1092a.m3362g(modifierM3599a1111112, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d1111.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1095124587);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z37 = z49;
                z38 = z52;
                z39 = z64;
                z36 = z24;
                z28 = z46;
                z29 = z47;
                modifier3 = modifier1114;
                z34 = z25;
                z35 = z26;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z28 = z17;
                z29 = z18;
                z34 = z25;
                z35 = z26;
                modifier3 = modifier2;
                z36 = z24;
                z37 = z15;
                z38 = z16;
                z39 = z19;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 100663296;
        i38 = i15 & 512;
        if (i38 != 0) {
            i16 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (c28655q2.m87155h(z19)) {
                i39 = 536870912;
            } else {
                i39 = 268435456;
            }
            i16 |= i39;
        }
        if ((i14 & 6) == 0) {
            if (c28655q2.m87157i(goFullScreen)) {
                i49 = 4;
            } else {
                i49 = 2;
            }
            i44 = i14 | i49;
        } else {
            i44 = i14;
        }
        if ((i14 & 48) == 0) {
            if (c28655q2.m87157i(clearFullScreen)) {
                i48 = 32;
            } else {
                i48 = 16;
            }
            i44 |= i48;
        }
        if ((i14 & 384) == 0) {
            i44 |= c28655q2.m87157i(onCrossButtonClicked) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q2.m87157i(onUserViewedFullVideo)) {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            i44 |= i18;
        }
        i45 = i44;
        if ((i16 & 306783379) == 306783378) {
            z27 = true;
        } else {
            z27 = true;
        }
        if (c28655q2.m87135U(i16 & 1, z27)) {
            c2314t = C2314t.f9131w;
            if (i54 != 0) {
                modifier2 = c2314t;
            }
            if (i55 != 0) {
                z24 = true;
            }
            if (i17 != 0) {
                z25 = false;
            }
            if (i24 != 0) {
                z26 = false;
            }
            if (i26 != 0) {
                z44 = true;
            } else {
                z44 = z15;
            }
            if (i28 != 0) {
                z45 = true;
            } else {
                z45 = z16;
            }
            if (i34 != 0) {
                z46 = true;
            } else {
                z46 = z17;
            }
            if (i36 != 0) {
                z47 = false;
            } else {
                z47 = z18;
            }
            if (i38 != 0) {
                z48 = true;
            } else {
                z48 = z19;
            }
            z49 = z44;
            InterfaceC39127r0 interfaceC39127r0M66763d1112 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            i46 = i16;
            z52 = z45;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q2.m87165m();
            Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q2, modifier2);
            InterfaceC0221l.f734a.getClass();
            Modifier modifier1115 = modifier2;
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1112);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1112);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1112);
            context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C31541j c31541j1112 = new C31541j(context);
                C20033m c20033m1112 = new C20033m(context);
                AbstractC24543a.m71573i(!c31541j1112.f130194q);
                c31541j1112.f130182e = new C2853n(c20033m1112, 3);
                AbstractC24543a.m71573i(!c31541j1112.f130194q);
                c31541j1112.f130194q = true;
                C31571u c31571u1112 = new C31571u(c31541j1112);
                C18744f c18744fM97213g1111 = c31571u1112.m97213g0();
                AbstractC22676k.m65749i(c18744fM97213g1111, "getTrackSelectionParameters(...)");
                c31571u1112.m97227v0(m10973l(c18744fM97213g1111, z25, z26));
                C31527e0 c31527e1111 = new C31527e0();
                C41017e0 c41017e1111 = AbstractC41023g0.f176998x;
                C41060w0 c41060w1112 = C41060w0.f177067E;
                list = Collections.EMPTY_LIST;
                c41060w0 = C41060w0.f177067E;
                uri = Uri.parse(videoUri);
                if (uri != null) {
                    c31539i0 = new C31539i0(uri, null, list, c41060w0);
                } else {
                    c31539i0 = null;
                }
                c31571u1112.m381O(new C31545k0("", new C31533g0(c31527e1111), c31539i0, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                c31571u1112.m97225t0(z24);
                if (z47) {
                    i47 = 2;
                } else {
                    i47 = 0;
                }
                c31571u1112.m97226u0(i47);
                c31571u1112.m97218m0();
                c28655q2.m87172p0(c31571u1112);
                objM87133R = c31571u1112;
            }
            interfaceC31544k = (InterfaceC31544k) objM87133R;
            AbstractC22676k.m65747g(interfaceC31544k);
            Modifier modifierM3599a1111113 = AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), "videoPlayer");
            if ((i46 & 3670016) == 1048576) {
                z54 = true;
            } else {
                z54 = false;
            }
            boolean zM87157i1113 = z54 | c28655q2.m87157i(interfaceC31544k);
            if ((i45 & 14) == 4) {
                z55 = true;
            } else {
                z55 = false;
            }
            boolean z611111111111110 = zM87157i1113 | z55;
            if ((i45 & 112) == 32) {
                z56 = true;
            } else {
                z56 = false;
            }
            boolean z611111111111111 = z611111111111110 | z56;
            if ((i46 & 458752) == 131072) {
                z57 = true;
            } else {
                z57 = false;
            }
            boolean z611111111111112 = z611111111111111 | z57;
            if ((i46 & 1879048192) == 536870912) {
                z58 = true;
            } else {
                z58 = false;
            }
            boolean z611111111111113 = z611111111111112 | z58;
            if ((i45 & 7168) == 2048) {
                z59 = true;
            } else {
                z59 = false;
            }
            z60 = z611111111111113 | z59;
            objM87133R2 = c28655q2.m87133R();
            if (z60) {
                boolean z71111115 = z48;
                objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71111115, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                interfaceC31544k2 = interfaceC31544k;
                z64 = z71111115;
                c28655q2.m87172p0(objM87133R2);
            } else {
                boolean z71111116 = z48;
                objM87133R2 = new C3609b(z52, interfaceC31544k, z49, z71111116, goFullScreen, clearFullScreen, onUserViewedFullVideo);
                interfaceC31544k2 = interfaceC31544k;
                z64 = z71111116;
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3599a1111113, null, c28655q2, 0, 4);
            c28655q = c28655q2;
            zM87157i = c28655q.m87157i(interfaceC31544k2);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R3 = new C3610c(interfaceC31544k2, 0);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C3610c(interfaceC31544k2, 0);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R3, c28655q);
            if (z46) {
                c28655q.m87150e0(1094583544);
                C38072d c38072d1112 = C38072d.f163053a;
                C27430e c27430eM107874S1112 = AbstractC34132o.m107874S(c38072d1112.m121951d().getAction().getCross(), c28655q, 6);
                String strM21273g1112 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                float f11114 = 4;
                Modifier modifierM3599a1111114 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3415l(((float) 8.5d) * f11114, AbstractC1099a.m3394p(6 * f11114, c2314t))), "closeIcon");
                if ((i45 & 896) == 256) {
                    z65 = true;
                } else {
                    z65 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z65) {
                    objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C0343e(onCrossButtonClicked, 6);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC15005f3.m43108b(c27430eM107874S1112, strM21273g1112, AbstractC1092a.m3362g(modifierM3599a1111114, false, null, null, (InterfaceC4339a) objM87133R4, 15), c38072d1112.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1095124587);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            z37 = z49;
            z38 = z52;
            z39 = z64;
            z36 = z24;
            z28 = z46;
            z29 = z47;
            modifier3 = modifier1115;
            z34 = z25;
            z35 = z26;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z28 = z17;
            z29 = z18;
            z34 = z25;
            z35 = z26;
            modifier3 = modifier2;
            z36 = z24;
            z37 = z15;
            z38 = z16;
            z39 = z19;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bs2.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC3613f.m10972k(modifier3, videoUri, z36, z34, z35, z37, z38, z28, z29, z39, goFullScreen, clearFullScreen, onCrossButtonClicked, onUserViewedFullVideo, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final StyledPlayerView m10968g(boolean z4, InterfaceC31544k interfaceC31544k, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Context context) {
        AbstractC22676k.m65750j(context, "context");
        StyledPlayerView styledPlayerView = new StyledPlayerView(context);
        styledPlayerView.setLayoutDirection(0);
        styledPlayerView.setUseController(z4);
        styledPlayerView.setPlayer(interfaceC31544k);
        styledPlayerView.setControllerOnFullScreenModeChangedListener(new C3612e(interfaceC4339a, interfaceC4339a2));
        styledPlayerView.setShowSubtitleButton(z13);
        styledPlayerView.setShowBuffering(z14 ? 1 : 0);
        ((C31571u) interfaceC31544k).m97199Q(new a(interfaceC4339a3));
        return styledPlayerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m10969h(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, boolean z4) {
        if (z4) {
            interfaceC4339a.invoke();
        } else {
            interfaceC4339a2.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC28620h0 m10970i(InterfaceC31544k interfaceC31544k, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new b(interfaceC31544k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m10971j(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m10972k(Modifier modifier, String str, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, int i13, int i14, int i15, Composer composer, int i16) throws XmlPullParserException, IOException {
        m10967f(modifier, str, z4, z13, z14, z15, z16, z17, z18, z19, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final C20711w m10973l(C20711w c20711w, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(c20711w, "<this>");
        C20710v c20710vMo54510a = c20711w.mo54510a();
        if (z4) {
            c20710vMo54510a.mo54512c(AbstractC12350b.m34570S(3));
        }
        if (z13) {
            c20710vMo54510a.mo54514e();
            c20710vMo54510a.mo54513d();
        }
        return c20710vMo54510a.mo54511a();
    }
}
