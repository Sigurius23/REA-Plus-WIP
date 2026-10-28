package h01;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e61.C12762e;
import ga1.C15621b;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11344e;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C23010x;
import p291l0.InterfaceC22974l;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import wn1.AbstractC37419c;
import wn1.AbstractC37420d;
import wn1.AbstractC37421e;
import wn1.AbstractC37422f;
import x81.C38072d;

/* JADX INFO: renamed from: h01.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ay\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0017²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "quantity", "", "rotation", AttachmentExtensionsKt.EXTRA_DURATION, "", "highlightCounter", "inUpdatingState", "shouldPlayShimmer", "animateToReplayIcon", "Lkotlin/Function0;", "Ll83/a0;", "onShimmerFinished", "onClick", "e", "(Landroidx/compose/ui/Modifier;IFIZZZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "counterWidth", "checkmarkIconSize", "isAnimatingShimmer", "shimmerAlpha", "home-notifications-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16539f {

    /* JADX INFO: renamed from: h01.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.card.notification.NotificationCardCounterKt$CardCounter$3$1", m100430f = "NotificationCardCounter.kt", m100431l = {87, 93}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4339a f63642E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f63643F;

        /* JADX INFO: renamed from: w */
        int f63644w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f63645x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C11344e f63646y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ float f63647z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, C11344e c11344e, float f13, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f63645x = z4;
            this.f63646y = c11344e;
            this.f63647z = f13;
            this.f63642E = interfaceC4339a;
            this.f63643F = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f63645x, this.f63646y, this.f63647z, this.f63642E, this.f63643F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
        
            if (r12.m30551g(r2, r11) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r11.f63644w
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L19
                if (r1 != r3) goto L11
                p505ts.AbstractC34132o.m107864I(r12)
                goto L65
            L11:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L19:
                p505ts.AbstractC34132o.m107864I(r12)
                r9 = r11
                goto L48
            L1e:
                p505ts.AbstractC34132o.m107864I(r12)
                boolean r12 = r11.f63645x
                if (r12 == 0) goto L65
                p1.c1 r12 = r11.f63643F
                h01.AbstractC16539f.m46736o(r12, r4)
                d0.e r5 = r11.f63646y
                float r12 = r11.f63647z
                java.lang.Float r6 = new java.lang.Float
                r6.<init>(r12)
                r12 = 1000(0x3e8, float:1.401E-42)
                r1 = 6
                r7 = 0
                d0.e2 r7 = p077d0.AbstractC11348f.m30574v(r12, r2, r7, r1)
                r11.f63644w = r4
                r8 = 0
                r10 = 12
                r9 = r11
                java.lang.Object r12 = p077d0.C11344e.m30547d(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L48
                goto L64
            L48:
                p1.c1 r12 = r9.f63643F
                h01.AbstractC16539f.m46736o(r12, r2)
                c93.a r12 = r9.f63642E
                r12.invoke()
                d0.e r12 = r9.f63646y
                float r1 = r9.f63647z
                float r1 = -r1
                java.lang.Float r2 = new java.lang.Float
                r2.<init>(r1)
                r9.f63644w = r3
                java.lang.Object r12 = r12.m30551g(r2, r11)
                if (r12 != r0) goto L66
            L64:
                return r0
            L65:
                r9 = r11
            L66:
                l83.a0 r12 = l83.C23454a0.f92919a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: h01.AbstractC16539f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:101:0x012a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:106:0x0137  */
    /* JADX WARN: Code duplicated, block: B:108:0x013a  */
    /* JADX WARN: Code duplicated, block: B:110:0x013d  */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0143  */
    /* JADX WARN: Code duplicated, block: B:115:0x0146  */
    /* JADX WARN: Code duplicated, block: B:116:0x0148  */
    /* JADX WARN: Code duplicated, block: B:119:0x014f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0155  */
    /* JADX WARN: Code duplicated, block: B:123:0x0160  */
    /* JADX WARN: Code duplicated, block: B:125:0x0164  */
    /* JADX WARN: Code duplicated, block: B:127:0x016a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0177  */
    /* JADX WARN: Code duplicated, block: B:132:0x017d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0189  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:145:0x0209  */
    /* JADX WARN: Code duplicated, block: B:147:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x0268  */
    /* JADX WARN: Code duplicated, block: B:157:0x0278  */
    /* JADX WARN: Code duplicated, block: B:160:0x028b  */
    /* JADX WARN: Code duplicated, block: B:161:0x028e  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:169:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:178:0x0343  */
    /* JADX WARN: Code duplicated, block: B:179:0x0345  */
    /* JADX WARN: Code duplicated, block: B:182:0x034c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x034e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0392  */
    /* JADX WARN: Code duplicated, block: B:187:0x0396  */
    /* JADX WARN: Code duplicated, block: B:190:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:193:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:197:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:199:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:202:0x0409  */
    /* JADX WARN: Code duplicated, block: B:203:0x0412  */
    /* JADX WARN: Code duplicated, block: B:206:0x0431  */
    /* JADX WARN: Code duplicated, block: B:207:0x0435  */
    /* JADX WARN: Code duplicated, block: B:210:0x0442  */
    /* JADX WARN: Code duplicated, block: B:212:0x0450  */
    /* JADX WARN: Code duplicated, block: B:215:0x0458  */
    /* JADX WARN: Code duplicated, block: B:216:0x046b  */
    /* JADX WARN: Code duplicated, block: B:218:0x048b  */
    /* JADX WARN: Code duplicated, block: B:219:0x048f  */
    /* JADX WARN: Code duplicated, block: B:222:0x049c  */
    /* JADX WARN: Code duplicated, block: B:224:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:227:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:228:0x0535  */
    /* JADX WARN: Code duplicated, block: B:230:0x0552  */
    /* JADX WARN: Code duplicated, block: B:233:0x0569  */
    /* JADX WARN: Code duplicated, block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    /* JADX INFO: renamed from: e */
    public static final void m46726e(Modifier modifier, final int i13, final float f13, final int i14, boolean z4, boolean z13, boolean z14, boolean z15, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, final int i15, final int i16) {
        Modifier modifier2;
        int i17;
        boolean z16;
        int i18;
        int i19;
        int i24;
        boolean z17;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        boolean z18;
        final boolean z19;
        final InterfaceC4339a interfaceC4339a3;
        final boolean z24;
        final Modifier modifier3;
        C28655q c28655q;
        final boolean z25;
        final boolean z26;
        final InterfaceC4339a interfaceC4339a4;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean z27;
        boolean z28;
        C28676v0 c28676v0;
        int i37;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        int i38;
        float f14;
        float f15;
        InterfaceC28670t2 interfaceC28670t2M30587a;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1M44460m;
        C17916v0 c17916v0;
        boolean z29;
        boolean z34;
        Modifier modifierM3357b;
        float fMo743q0;
        Object objM87133R2;
        C11344e c11344e;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c1;
        float f16;
        InterfaceC28670t2 interfaceC28670t2M30588b;
        boolean z35;
        boolean z36;
        boolean z37;
        Object objM87133R4;
        boolean z38;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC28601c1 interfaceC28601c2;
        int i39;
        boolean z39;
        Object objM87133R5;
        C2307m c2307m;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        InterfaceC4339a interfaceC4339a8;
        C0209i c0209i4;
        float f17;
        InterfaceC22974l interfaceC22974lM66748k;
        int iHashCode2;
        int iHashCode3;
        boolean z44;
        boolean z45;
        boolean z46;
        Object objM87133R6;
        Object objM87133R7;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-489705302);
        int i44 = i16 & 1;
        if (i44 != 0) {
            i17 = i15 | 6;
            modifier2 = modifier;
        } else if ((i15 & 6) == 0) {
            modifier2 = modifier;
            i17 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i15;
        } else {
            modifier2 = modifier;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q2.m87149e(i13) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q2.m87147d(f13) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= c28655q2.m87149e(i14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i45 = i16 & 16;
        if (i45 == 0) {
            if ((i15 & 24576) == 0) {
                z16 = z4;
                i17 |= c28655q2.m87155h(z16) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i18 = i16 & 32;
            if (i18 != 0) {
                if ((196608 & i15) == 0) {
                    if (c28655q2.m87155h(z13)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i17 |= i19;
                }
                i24 = i16 & 64;
                if (i24 != 0) {
                    i17 |= 1572864;
                    z17 = z14;
                } else {
                    z17 = z14;
                    if ((i15 & 1572864) == 0) {
                        if (c28655q2.m87155h(z17)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i17 |= i25;
                    }
                }
                i26 = i16 & 128;
                if (i26 != 0) {
                    i17 |= 12582912;
                    i27 = i44;
                } else {
                    i27 = i44;
                    if ((i15 & 12582912) == 0) {
                        if (c28655q2.m87155h(z15)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i17 |= i28;
                    }
                }
                i29 = i16 & 256;
                if (i29 != 0) {
                    i17 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i34 = 67108864;
                    } else {
                        i34 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i17 |= i34;
                }
                i35 = i16 & 512;
                if (i35 != 0) {
                    i17 |= 805306368;
                } else if ((i15 & 805306368) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i17 |= i36;
                }
                if ((i17 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q2.m87135U(i17 & 1, z18)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i45 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z27 = false;
                    } else {
                        z27 = z13;
                    }
                    if (i24 != 0) {
                        z17 = false;
                    }
                    if (i26 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    c28676v0 = C28635l.f115821a;
                    i37 = 6;
                    if (i29 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C15621b(i37);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R7;
                    } else {
                        interfaceC4339a5 = interfaceC4339a;
                    }
                    if (i35 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C15621b(7);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a6 = interfaceC4339a2;
                    }
                    if (i13 == 0) {
                        i38 = 4;
                        f14 = 4 * 12;
                    } else {
                        i38 = 4;
                        f14 = 4 * 6;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(f14, null, "buttonWidth", c28655q2, 384, 10);
                    if (i13 == 0) {
                        f15 = 6 * i38;
                    } else {
                        float f18 = i38;
                        f15 = f18 * f18;
                    }
                    interfaceC28670t2M30587a = AbstractC11352g.m30587a(f15, null, "checkmarkIconSize", c28655q2, 384, 10);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                    interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i, c28655q2, 6);
                    c17916v0 = AbstractC17918w0.f69621a;
                    z29 = z17;
                    if (z28) {
                        c28655q2.m87150e0(1839634551);
                        z34 = z28;
                        modifierM3357b = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack30(), c17916v0);
                        c28655q2.m87173q(false);
                    } else {
                        z34 = z28;
                        if (!((Boolean) interfaceC28601c1M44460m.getValue()).booleanValue() || i13 == 0 || z16) {
                            c28655q2.m87150e0(1839638419);
                            c28655q2.m87173q(false);
                            modifierM3357b = AbstractC1092a.m3357b(c2314t, AbstractC15673b0.m43972A(), null, 0.0f, 6);
                        } else {
                            c28655q2.m87150e0(1839640559);
                            c28655q2.m87173q(false);
                            modifierM3357b = AbstractC1092a.m3358c(c2314t, AbstractC17918w0.m51517e(4281744190L), c17916v0);
                        }
                        C28674u2 c28674u2 = AbstractC2453v1.f9569h;
                        float f19 = 4;
                        float f24 = 12 * f19;
                        fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u2)).mo743q0(f24);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC11348f.m30553a(-fMo743q0);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        c11344e = (C11344e) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                        if (m46734m(interfaceC28601c1)) {
                            f16 = 1.0f;
                        } else {
                            f16 = 0.1f;
                        }
                        boolean z47 = z16;
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(f16, AbstractC11348f.m30574v(1000, 0, null, 6), "shimmerTransparency", null, c28655q2, 3120, 20);
                        float fontScale = ((InterfaceC39171c) c28655q2.m87161k(c28674u2)).getFontScale();
                        Boolean boolValueOf = Boolean.valueOf(z29);
                        if ((i17 & 3670016) == 1048576) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean zM87157i = z35 | c28655q2.m87157i(c11344e) | c28655q2.m87147d(fMo743q0);
                        if ((i17 & 234881024) == 67108864) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        z37 = zM87157i | z36;
                        objM87133R4 = c28655q2.m87133R();
                        if (!z37 || objM87133R4 == c28676v0) {
                            InterfaceC4339a interfaceC4339a9 = interfaceC4339a5;
                            objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a9, interfaceC28601c1, null);
                            z38 = z29;
                            interfaceC4339a7 = interfaceC4339a9;
                            interfaceC28601c2 = interfaceC28601c1;
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            interfaceC4339a7 = interfaceC4339a5;
                            z38 = z29;
                            interfaceC28601c2 = interfaceC28601c1;
                        }
                        i39 = i17 >> 18;
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, boolValueOf);
                        Modifier modifierM3421r = AbstractC1102d.m3421r(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2 * f19)).mo3471e(modifierM3357b), m46732k(interfaceC28670t2M30587a2), f24);
                        if ((i17 & 1879048192) == 536870912) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        objM87133R5 = c28655q2.m87133R();
                        if (z39 || objM87133R5 == c28676v0) {
                            objM87133R5 = new C12762e(interfaceC4339a6, 4);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        Modifier modifierMo3471e = AbstractC1092a.m3360e(modifierM3421r, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R5, 28).mo3471e(modifier2);
                        c2307m = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        boolean z48 = z38;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            interfaceC4339a8 = interfaceC4339a7;
                        } else {
                            interfaceC4339a8 = interfaceC4339a7;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                            if (m46734m(interfaceC28601c2)) {
                                c28655q2.m87150e0(-1003627836);
                                AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-1003541346);
                                c28655q2.m87173q(false);
                            }
                            Modifier modifier4 = modifier2;
                            InterfaceC4339a interfaceC4339a10 = interfaceC4339a6;
                            f17 = ((float) 0.5d) * 8;
                            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale, (((float) 1.5d) * f19) / fontScale);
                            if (i13 > 0) {
                                C22949e c22949e = AbstractC22977m.f90650a;
                                interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                            } else {
                                interfaceC22974lM66748k = AbstractC22977m.f90654e;
                            }
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                            if (z27 != 0) {
                                c28655q2.m87150e0(-1967833484);
                                AbstractC37421e.m119789b(c28655q2, 0);
                                c28655q2.m87173q(false);
                                z46 = false;
                                z44 = z34;
                                z45 = true;
                            } else {
                                c28655q2.m87150e0(-1967739988);
                                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
                                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
                                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                                int i46 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                                boolean z49 = z34;
                                AbstractC37419c.m119780c(f13, z49, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i46);
                                AbstractC37420d.m119785c(f13, z49, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i46);
                                z44 = z49;
                                z45 = true;
                                c28655q2.m87173q(true);
                                z46 = false;
                                c28655q2.m87173q(false);
                            }
                            if (i13 > 0) {
                                c28655q2.m87150e0(-1966895300);
                                String strValueOf = String.valueOf(i13);
                                C38072d c38072d = C38072d.f163053a;
                                int i47 = C38072d.f163054b;
                                AbstractC30795n.m94707h(strValueOf, null, c38072d.m121949b(c28655q2, i47).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i47).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                                c28655q2.m87173q(z46);
                            } else {
                                c28655q2.m87150e0(-1966687724);
                                c28655q2.m87173q(z46);
                            }
                            c28655q2.m87173q(z45);
                            c28655q2.m87173q(z45);
                            interfaceC4339a4 = interfaceC4339a10;
                            modifier3 = modifier4;
                            c28655q = c28655q2;
                            z19 = z27;
                            interfaceC4339a3 = interfaceC4339a8;
                            z25 = z47;
                            z24 = z48;
                            z26 = z44;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                        if (m46734m(interfaceC28601c2)) {
                            c28655q2.m87150e0(-1003627836);
                            AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1003541346);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifier5 = modifier2;
                        InterfaceC4339a interfaceC4339a11 = interfaceC4339a6;
                        f17 = ((float) 0.5d) * 8;
                        Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale, (((float) 1.5d) * f19) / fontScale);
                        if (i13 > 0) {
                            C22949e c22949e2 = AbstractC22977m.f90650a;
                            interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                        } else {
                            interfaceC22974lM66748k = AbstractC22977m.f90654e;
                        }
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3395q2);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                        if (z27 != 0) {
                            c28655q2.m87150e0(-1967833484);
                            AbstractC37421e.m119789b(c28655q2, 0);
                            c28655q2.m87173q(false);
                            z46 = false;
                            z44 = z34;
                            z45 = true;
                        } else {
                            c28655q2.m87150e0(-1967739988);
                            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, c2314t);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d3);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
                            int i48 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                            boolean z410 = z34;
                            AbstractC37419c.m119780c(f13, z410, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i48);
                            AbstractC37420d.m119785c(f13, z410, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i48);
                            z44 = z410;
                            z45 = true;
                            c28655q2.m87173q(true);
                            z46 = false;
                            c28655q2.m87173q(false);
                        }
                        if (i13 > 0) {
                            c28655q2.m87150e0(-1966895300);
                            String strValueOf2 = String.valueOf(i13);
                            C38072d c38072d2 = C38072d.f163053a;
                            int i49 = C38072d.f163054b;
                            AbstractC30795n.m94707h(strValueOf2, null, c38072d2.m121949b(c28655q2, i49).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i49).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                            c28655q2.m87173q(z46);
                        } else {
                            c28655q2.m87150e0(-1966687724);
                            c28655q2.m87173q(z46);
                        }
                        c28655q2.m87173q(z45);
                        c28655q2.m87173q(z45);
                        interfaceC4339a4 = interfaceC4339a11;
                        modifier3 = modifier5;
                        c28655q = c28655q2;
                        z19 = z27;
                        interfaceC4339a3 = interfaceC4339a8;
                        z25 = z47;
                        z24 = z48;
                        z26 = z44;
                    }
                    C28674u2 c28674u3 = AbstractC2453v1.f9569h;
                    float f110 = 4;
                    float f25 = 12 * f110;
                    fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u3)).mo743q0(f25);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11348f.m30553a(-fMo743q0);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    c11344e = (C11344e) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    if (m46734m(interfaceC28601c1)) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.1f;
                    }
                    boolean z411 = z16;
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f16, AbstractC11348f.m30574v(1000, 0, null, 6), "shimmerTransparency", null, c28655q2, 3120, 20);
                    float fontScale2 = ((InterfaceC39171c) c28655q2.m87161k(c28674u3)).getFontScale();
                    Boolean boolValueOf2 = Boolean.valueOf(z29);
                    if ((i17 & 3670016) == 1048576) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean zM87157i2 = z35 | c28655q2.m87157i(c11344e) | c28655q2.m87147d(fMo743q0);
                    if ((i17 & 234881024) == 67108864) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = zM87157i2 | z36;
                    objM87133R4 = c28655q2.m87133R();
                    if (z37) {
                        InterfaceC4339a interfaceC4339a12 = interfaceC4339a5;
                        objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a12, interfaceC28601c1, null);
                        z38 = z29;
                        interfaceC4339a7 = interfaceC4339a12;
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        InterfaceC4339a interfaceC4339a13 = interfaceC4339a5;
                        objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a13, interfaceC28601c1, null);
                        z38 = z29;
                        interfaceC4339a7 = interfaceC4339a13;
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q2.m87172p0(objM87133R4);
                    }
                    i39 = i17 >> 18;
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, boolValueOf2);
                    Modifier modifierM3421r2 = AbstractC1102d.m3421r(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2 * f110)).mo3471e(modifierM3357b), m46732k(interfaceC28670t2M30587a2), f25);
                    if ((i17 & 1879048192) == 536870912) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    objM87133R5 = c28655q2.m87133R();
                    if (z39) {
                        objM87133R5 = new C12762e(interfaceC4339a6, 4);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C12762e(interfaceC4339a6, 4);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    Modifier modifierMo3471e2 = AbstractC1092a.m3360e(modifierM3421r2, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R5, 28).mo3471e(modifier2);
                    c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    boolean z412 = z38;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d4);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m6);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        interfaceC4339a8 = interfaceC4339a7;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N6);
                        if (m46734m(interfaceC28601c2)) {
                            c28655q2.m87150e0(-1003627836);
                            AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1003541346);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifier6 = modifier2;
                        InterfaceC4339a interfaceC4339a14 = interfaceC4339a6;
                        f17 = ((float) 0.5d) * 8;
                        Modifier modifierM3395q3 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale2, (((float) 1.5d) * f110) / fontScale2);
                        if (i13 > 0) {
                            C22949e c22949e3 = AbstractC22977m.f90650a;
                            interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                        } else {
                            interfaceC22974lM66748k = AbstractC22977m.f90654e;
                        }
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3395q3);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m7);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N7);
                        if (z27 != 0) {
                            c28655q2.m87150e0(-1967833484);
                            AbstractC37421e.m119789b(c28655q2, 0);
                            c28655q2.m87173q(false);
                            z46 = false;
                            z44 = z34;
                            z45 = true;
                        } else {
                            c28655q2.m87150e0(-1967739988);
                            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, c2314t);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d5);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m8);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N8);
                            int i410 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                            boolean z413 = z34;
                            AbstractC37419c.m119780c(f13, z413, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i410);
                            AbstractC37420d.m119785c(f13, z413, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i410);
                            z44 = z413;
                            z45 = true;
                            c28655q2.m87173q(true);
                            z46 = false;
                            c28655q2.m87173q(false);
                        }
                        if (i13 > 0) {
                            c28655q2.m87150e0(-1966895300);
                            String strValueOf3 = String.valueOf(i13);
                            C38072d c38072d3 = C38072d.f163053a;
                            int i411 = C38072d.f163054b;
                            AbstractC30795n.m94707h(strValueOf3, null, c38072d3.m121949b(c28655q2, i411).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i411).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                            c28655q2.m87173q(z46);
                        } else {
                            c28655q2.m87150e0(-1966687724);
                            c28655q2.m87173q(z46);
                        }
                        c28655q2.m87173q(z45);
                        c28655q2.m87173q(z45);
                        interfaceC4339a4 = interfaceC4339a14;
                        modifier3 = modifier6;
                        c28655q = c28655q2;
                        z19 = z27;
                        interfaceC4339a3 = interfaceC4339a8;
                        z25 = z411;
                        z24 = z412;
                        z26 = z44;
                    } else {
                        interfaceC4339a8 = interfaceC4339a7;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N6);
                    if (m46734m(interfaceC28601c2)) {
                        c28655q2.m87150e0(-1003627836);
                        AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1003541346);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifier7 = modifier2;
                    InterfaceC4339a interfaceC4339a15 = interfaceC4339a6;
                    f17 = ((float) 0.5d) * 8;
                    Modifier modifierM3395q4 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale2, (((float) 1.5d) * f110) / fontScale2);
                    if (i13 > 0) {
                        C22949e c22949e4 = AbstractC22977m.f90650a;
                        interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                    } else {
                        interfaceC22974lM66748k = AbstractC22977m.f90654e;
                    }
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3395q4);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m9);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N9);
                    if (z27 != 0) {
                        c28655q2.m87150e0(-1967833484);
                        AbstractC37421e.m119789b(c28655q2, 0);
                        c28655q2.m87173q(false);
                        z46 = false;
                        z44 = z34;
                        z45 = true;
                    } else {
                        c28655q2.m87150e0(-1967739988);
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, c2314t);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m10);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N10);
                        int i412 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                        boolean z414 = z34;
                        AbstractC37419c.m119780c(f13, z414, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i412);
                        AbstractC37420d.m119785c(f13, z414, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i412);
                        z44 = z414;
                        z45 = true;
                        c28655q2.m87173q(true);
                        z46 = false;
                        c28655q2.m87173q(false);
                    }
                    if (i13 > 0) {
                        c28655q2.m87150e0(-1966895300);
                        String strValueOf4 = String.valueOf(i13);
                        C38072d c38072d4 = C38072d.f163053a;
                        int i413 = C38072d.f163054b;
                        AbstractC30795n.m94707h(strValueOf4, null, c38072d4.m121949b(c28655q2, i413).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q2, i413).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                        c28655q2.m87173q(z46);
                    } else {
                        c28655q2.m87150e0(-1966687724);
                        c28655q2.m87173q(z46);
                    }
                    c28655q2.m87173q(z45);
                    c28655q2.m87173q(z45);
                    interfaceC4339a4 = interfaceC4339a15;
                    modifier3 = modifier7;
                    c28655q = c28655q2;
                    z19 = z27;
                    interfaceC4339a3 = interfaceC4339a8;
                    z25 = z411;
                    z24 = z412;
                    z26 = z44;
                } else {
                    c28655q2.m87138X();
                    z19 = z13;
                    interfaceC4339a3 = interfaceC4339a;
                    z24 = z17;
                    modifier3 = modifier2;
                    c28655q = c28655q2;
                    z25 = z16;
                    z26 = z15;
                    interfaceC4339a4 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h01.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC16539f.m46731j(modifier3, i13, f13, i14, z25, z19, z24, z26, interfaceC4339a3, interfaceC4339a4, i15, i16, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i17 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i24 = i16 & 64;
            if (i24 != 0) {
                i17 |= 1572864;
                z17 = z14;
            } else {
                z17 = z14;
                if ((i15 & 1572864) == 0) {
                    if (c28655q2.m87155h(z17)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i17 |= i25;
                }
            }
            i26 = i16 & 128;
            if (i26 != 0) {
                i17 |= 12582912;
                i27 = i44;
            } else {
                i27 = i44;
                if ((i15 & 12582912) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i17 |= i28;
                }
            }
            i29 = i16 & 256;
            if (i29 != 0) {
                i17 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i34 = 67108864;
                } else {
                    i34 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i17 |= i34;
            }
            i35 = i16 & 512;
            if (i35 != 0) {
                i17 |= 805306368;
            } else if ((i15 & 805306368) == 0) {
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i17 |= i36;
            }
            if ((i17 & 306783379) != 306783378) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q2.m87135U(i17 & 1, z18)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if (i45 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z27 = false;
                } else {
                    z27 = z13;
                }
                if (i24 != 0) {
                    z17 = false;
                }
                if (i26 != 0) {
                    z28 = false;
                } else {
                    z28 = z15;
                }
                c28676v0 = C28635l.f115821a;
                i37 = 6;
                if (i29 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C15621b(i37);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    interfaceC4339a5 = (InterfaceC4339a) objM87133R7;
                } else {
                    interfaceC4339a5 = interfaceC4339a;
                }
                if (i35 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C15621b(7);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a6 = interfaceC4339a2;
                }
                if (i13 == 0) {
                    i38 = 4;
                    f14 = 4 * 12;
                } else {
                    i38 = 4;
                    f14 = 4 * 6;
                }
                InterfaceC28670t2 interfaceC28670t2M30587a3 = AbstractC11352g.m30587a(f14, null, "buttonWidth", c28655q2, 384, 10);
                if (i13 == 0) {
                    f15 = 6 * i38;
                } else {
                    float f111 = i38;
                    f15 = f111 * f111;
                }
                interfaceC28670t2M30587a = AbstractC11352g.m30587a(f15, null, "checkmarkIconSize", c28655q2, 384, 10);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q2, 6);
                c17916v0 = AbstractC17918w0.f69621a;
                z29 = z17;
                if (z28) {
                    c28655q2.m87150e0(1839634551);
                    z34 = z28;
                    modifierM3357b = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack30(), c17916v0);
                    c28655q2.m87173q(false);
                } else {
                    z34 = z28;
                    if (((Boolean) interfaceC28601c1M44460m.getValue()).booleanValue()) {
                    }
                    c28655q2.m87150e0(1839638419);
                    c28655q2.m87173q(false);
                    modifierM3357b = AbstractC1092a.m3357b(c2314t, AbstractC15673b0.m43972A(), null, 0.0f, 6);
                    C28674u2 c28674u4 = AbstractC2453v1.f9569h;
                    float f112 = 4;
                    float f26 = 12 * f112;
                    fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u4)).mo743q0(f26);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11348f.m30553a(-fMo743q0);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    c11344e = (C11344e) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    if (m46734m(interfaceC28601c1)) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.1f;
                    }
                    boolean z415 = z16;
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f16, AbstractC11348f.m30574v(1000, 0, null, 6), "shimmerTransparency", null, c28655q2, 3120, 20);
                    float fontScale3 = ((InterfaceC39171c) c28655q2.m87161k(c28674u4)).getFontScale();
                    Boolean boolValueOf3 = Boolean.valueOf(z29);
                    if ((i17 & 3670016) == 1048576) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean zM87157i3 = z35 | c28655q2.m87157i(c11344e) | c28655q2.m87147d(fMo743q0);
                    if ((i17 & 234881024) == 67108864) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = zM87157i3 | z36;
                    objM87133R4 = c28655q2.m87133R();
                    if (z37) {
                        InterfaceC4339a interfaceC4339a16 = interfaceC4339a5;
                        objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a16, interfaceC28601c1, null);
                        z38 = z29;
                        interfaceC4339a7 = interfaceC4339a16;
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        InterfaceC4339a interfaceC4339a17 = interfaceC4339a5;
                        objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a17, interfaceC28601c1, null);
                        z38 = z29;
                        interfaceC4339a7 = interfaceC4339a17;
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q2.m87172p0(objM87133R4);
                    }
                    i39 = i17 >> 18;
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, boolValueOf3);
                    Modifier modifierM3421r3 = AbstractC1102d.m3421r(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2 * f112)).mo3471e(modifierM3357b), m46732k(interfaceC28670t2M30587a3), f26);
                    if ((i17 & 1879048192) == 536870912) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    objM87133R5 = c28655q2.m87133R();
                    if (z39) {
                        objM87133R5 = new C12762e(interfaceC4339a6, 4);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C12762e(interfaceC4339a6, 4);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    Modifier modifierMo3471e3 = AbstractC1092a.m3360e(modifierM3421r3, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R5, 28).mo3471e(modifier2);
                    c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    boolean z416 = z38;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d7);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        interfaceC4339a8 = interfaceC4339a7;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11);
                        if (m46734m(interfaceC28601c2)) {
                            c28655q2.m87150e0(-1003627836);
                            AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1003541346);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifier8 = modifier2;
                        InterfaceC4339a interfaceC4339a18 = interfaceC4339a6;
                        f17 = ((float) 0.5d) * 8;
                        Modifier modifierM3395q5 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale3, (((float) 1.5d) * f112) / fontScale3);
                        if (i13 > 0) {
                            C22949e c22949e5 = AbstractC22977m.f90650a;
                            interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                        } else {
                            interfaceC22974lM66748k = AbstractC22977m.f90654e;
                        }
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3395q5);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m12);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N12);
                        if (z27 != 0) {
                            c28655q2.m87150e0(-1967833484);
                            AbstractC37421e.m119789b(c28655q2, 0);
                            c28655q2.m87173q(false);
                            z46 = false;
                            z44 = z34;
                            z45 = true;
                        } else {
                            c28655q2.m87150e0(-1967739988);
                            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, c2314t);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d8);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m13);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N13);
                            int i414 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                            boolean z417 = z34;
                            AbstractC37419c.m119780c(f13, z417, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i414);
                            AbstractC37420d.m119785c(f13, z417, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i414);
                            z44 = z417;
                            z45 = true;
                            c28655q2.m87173q(true);
                            z46 = false;
                            c28655q2.m87173q(false);
                        }
                        if (i13 > 0) {
                            c28655q2.m87150e0(-1966895300);
                            String strValueOf5 = String.valueOf(i13);
                            C38072d c38072d5 = C38072d.f163053a;
                            int i415 = C38072d.f163054b;
                            AbstractC30795n.m94707h(strValueOf5, null, c38072d5.m121949b(c28655q2, i415).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q2, i415).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                            c28655q2.m87173q(z46);
                        } else {
                            c28655q2.m87150e0(-1966687724);
                            c28655q2.m87173q(z46);
                        }
                        c28655q2.m87173q(z45);
                        c28655q2.m87173q(z45);
                        interfaceC4339a4 = interfaceC4339a18;
                        modifier3 = modifier8;
                        c28655q = c28655q2;
                        z19 = z27;
                        interfaceC4339a3 = interfaceC4339a8;
                        z25 = z415;
                        z24 = z416;
                        z26 = z44;
                    } else {
                        interfaceC4339a8 = interfaceC4339a7;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11);
                    if (m46734m(interfaceC28601c2)) {
                        c28655q2.m87150e0(-1003627836);
                        AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1003541346);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifier9 = modifier2;
                    InterfaceC4339a interfaceC4339a19 = interfaceC4339a6;
                    f17 = ((float) 0.5d) * 8;
                    Modifier modifierM3395q6 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale3, (((float) 1.5d) * f112) / fontScale3);
                    if (i13 > 0) {
                        C22949e c22949e6 = AbstractC22977m.f90650a;
                        interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                    } else {
                        interfaceC22974lM66748k = AbstractC22977m.f90654e;
                    }
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3395q6);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m14);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N14);
                    if (z27 != 0) {
                        c28655q2.m87150e0(-1967833484);
                        AbstractC37421e.m119789b(c28655q2, 0);
                        c28655q2.m87173q(false);
                        z46 = false;
                        z44 = z34;
                        z45 = true;
                    } else {
                        c28655q2.m87150e0(-1967739988);
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, c2314t);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m15);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N15);
                        int i416 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                        boolean z418 = z34;
                        AbstractC37419c.m119780c(f13, z418, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i416);
                        AbstractC37420d.m119785c(f13, z418, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i416);
                        z44 = z418;
                        z45 = true;
                        c28655q2.m87173q(true);
                        z46 = false;
                        c28655q2.m87173q(false);
                    }
                    if (i13 > 0) {
                        c28655q2.m87150e0(-1966895300);
                        String strValueOf6 = String.valueOf(i13);
                        C38072d c38072d6 = C38072d.f163053a;
                        int i417 = C38072d.f163054b;
                        AbstractC30795n.m94707h(strValueOf6, null, c38072d6.m121949b(c28655q2, i417).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q2, i417).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                        c28655q2.m87173q(z46);
                    } else {
                        c28655q2.m87150e0(-1966687724);
                        c28655q2.m87173q(z46);
                    }
                    c28655q2.m87173q(z45);
                    c28655q2.m87173q(z45);
                    interfaceC4339a4 = interfaceC4339a19;
                    modifier3 = modifier9;
                    c28655q = c28655q2;
                    z19 = z27;
                    interfaceC4339a3 = interfaceC4339a8;
                    z25 = z415;
                    z24 = z416;
                    z26 = z44;
                }
                C28674u2 c28674u5 = AbstractC2453v1.f9569h;
                float f113 = 4;
                float f27 = 12 * f113;
                fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u5)).mo743q0(f27);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11348f.m30553a(-fMo743q0);
                    c28655q2.m87172p0(objM87133R2);
                }
                c11344e = (C11344e) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                if (m46734m(interfaceC28601c1)) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.1f;
                }
                boolean z419 = z16;
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f16, AbstractC11348f.m30574v(1000, 0, null, 6), "shimmerTransparency", null, c28655q2, 3120, 20);
                float fontScale4 = ((InterfaceC39171c) c28655q2.m87161k(c28674u5)).getFontScale();
                Boolean boolValueOf4 = Boolean.valueOf(z29);
                if ((i17 & 3670016) == 1048576) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean zM87157i4 = z35 | c28655q2.m87157i(c11344e) | c28655q2.m87147d(fMo743q0);
                if ((i17 & 234881024) == 67108864) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = zM87157i4 | z36;
                objM87133R4 = c28655q2.m87133R();
                if (z37) {
                    InterfaceC4339a interfaceC4339a110 = interfaceC4339a5;
                    objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a110, interfaceC28601c1, null);
                    z38 = z29;
                    interfaceC4339a7 = interfaceC4339a110;
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    InterfaceC4339a interfaceC4339a111 = interfaceC4339a5;
                    objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a111, interfaceC28601c1, null);
                    z38 = z29;
                    interfaceC4339a7 = interfaceC4339a111;
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q2.m87172p0(objM87133R4);
                }
                i39 = i17 >> 18;
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, boolValueOf4);
                Modifier modifierM3421r4 = AbstractC1102d.m3421r(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2 * f113)).mo3471e(modifierM3357b), m46732k(interfaceC28670t2M30587a3), f27);
                if ((i17 & 1879048192) == 536870912) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                objM87133R5 = c28655q2.m87133R();
                if (z39) {
                    objM87133R5 = new C12762e(interfaceC4339a6, 4);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C12762e(interfaceC4339a6, 4);
                    c28655q2.m87172p0(objM87133R5);
                }
                Modifier modifierMo3471e4 = AbstractC1092a.m3360e(modifierM3421r4, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R5, 28).mo3471e(modifier2);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                boolean z4110 = z38;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d10);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m16);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    interfaceC4339a8 = interfaceC4339a7;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N16);
                    if (m46734m(interfaceC28601c2)) {
                        c28655q2.m87150e0(-1003627836);
                        AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1003541346);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifier10 = modifier2;
                    InterfaceC4339a interfaceC4339a112 = interfaceC4339a6;
                    f17 = ((float) 0.5d) * 8;
                    Modifier modifierM3395q7 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale4, (((float) 1.5d) * f113) / fontScale4);
                    if (i13 > 0) {
                        C22949e c22949e7 = AbstractC22977m.f90650a;
                        interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                    } else {
                        interfaceC22974lM66748k = AbstractC22977m.f90654e;
                    }
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM3395q7);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m17);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N17);
                    if (z27 != 0) {
                        c28655q2.m87150e0(-1967833484);
                        AbstractC37421e.m119789b(c28655q2, 0);
                        c28655q2.m87173q(false);
                        z46 = false;
                        z44 = z34;
                        z45 = true;
                    } else {
                        c28655q2.m87150e0(-1967739988);
                        InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, c2314t);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d11);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m18);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N18);
                        int i418 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                        boolean z4111 = z34;
                        AbstractC37419c.m119780c(f13, z4111, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i418);
                        AbstractC37420d.m119785c(f13, z4111, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i418);
                        z44 = z4111;
                        z45 = true;
                        c28655q2.m87173q(true);
                        z46 = false;
                        c28655q2.m87173q(false);
                    }
                    if (i13 > 0) {
                        c28655q2.m87150e0(-1966895300);
                        String strValueOf7 = String.valueOf(i13);
                        C38072d c38072d7 = C38072d.f163053a;
                        int i419 = C38072d.f163054b;
                        AbstractC30795n.m94707h(strValueOf7, null, c38072d7.m121949b(c28655q2, i419).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q2, i419).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                        c28655q2.m87173q(z46);
                    } else {
                        c28655q2.m87150e0(-1966687724);
                        c28655q2.m87173q(z46);
                    }
                    c28655q2.m87173q(z45);
                    c28655q2.m87173q(z45);
                    interfaceC4339a4 = interfaceC4339a112;
                    modifier3 = modifier10;
                    c28655q = c28655q2;
                    z19 = z27;
                    interfaceC4339a3 = interfaceC4339a8;
                    z25 = z419;
                    z24 = z4110;
                    z26 = z44;
                } else {
                    interfaceC4339a8 = interfaceC4339a7;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N16);
                if (m46734m(interfaceC28601c2)) {
                    c28655q2.m87150e0(-1003627836);
                    AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1003541346);
                    c28655q2.m87173q(false);
                }
                Modifier modifier11 = modifier2;
                InterfaceC4339a interfaceC4339a113 = interfaceC4339a6;
                f17 = ((float) 0.5d) * 8;
                Modifier modifierM3395q8 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale4, (((float) 1.5d) * f113) / fontScale4);
                if (i13 > 0) {
                    C22949e c22949e8 = AbstractC22977m.f90650a;
                    interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                } else {
                    interfaceC22974lM66748k = AbstractC22977m.f90654e;
                }
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM3395q8);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m19);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N19);
                if (z27 != 0) {
                    c28655q2.m87150e0(-1967833484);
                    AbstractC37421e.m119789b(c28655q2, 0);
                    c28655q2.m87173q(false);
                    z46 = false;
                    z44 = z34;
                    z45 = true;
                } else {
                    c28655q2.m87150e0(-1967739988);
                    InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d12);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N110);
                    int i4110 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                    boolean z4112 = z34;
                    AbstractC37419c.m119780c(f13, z4112, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i4110);
                    AbstractC37420d.m119785c(f13, z4112, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i4110);
                    z44 = z4112;
                    z45 = true;
                    c28655q2.m87173q(true);
                    z46 = false;
                    c28655q2.m87173q(false);
                }
                if (i13 > 0) {
                    c28655q2.m87150e0(-1966895300);
                    String strValueOf8 = String.valueOf(i13);
                    C38072d c38072d8 = C38072d.f163053a;
                    int i4111 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strValueOf8, null, c38072d8.m121949b(c28655q2, i4111).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q2, i4111).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                    c28655q2.m87173q(z46);
                } else {
                    c28655q2.m87150e0(-1966687724);
                    c28655q2.m87173q(z46);
                }
                c28655q2.m87173q(z45);
                c28655q2.m87173q(z45);
                interfaceC4339a4 = interfaceC4339a113;
                modifier3 = modifier11;
                c28655q = c28655q2;
                z19 = z27;
                interfaceC4339a3 = interfaceC4339a8;
                z25 = z419;
                z24 = z4110;
                z26 = z44;
            } else {
                c28655q2.m87138X();
                z19 = z13;
                interfaceC4339a3 = interfaceC4339a;
                z24 = z17;
                modifier3 = modifier2;
                c28655q = c28655q2;
                z25 = z16;
                z26 = z15;
                interfaceC4339a4 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h01.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC16539f.m46731j(modifier3, i13, f13, i14, z25, z19, z24, z26, interfaceC4339a3, interfaceC4339a4, i15, i16, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i17 |= 24576;
        z16 = z4;
        i18 = i16 & 32;
        if (i18 != 0) {
            if ((196608 & i15) == 0) {
                if (c28655q2.m87155h(z13)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i17 |= i19;
            }
            i24 = i16 & 64;
            if (i24 != 0) {
                i17 |= 1572864;
                z17 = z14;
            } else {
                z17 = z14;
                if ((i15 & 1572864) == 0) {
                    if (c28655q2.m87155h(z17)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i17 |= i25;
                }
            }
            i26 = i16 & 128;
            if (i26 != 0) {
                i17 |= 12582912;
                i27 = i44;
            } else {
                i27 = i44;
                if ((i15 & 12582912) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i17 |= i28;
                }
            }
            i29 = i16 & 256;
            if (i29 != 0) {
                i17 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i34 = 67108864;
                } else {
                    i34 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i17 |= i34;
            }
            i35 = i16 & 512;
            if (i35 != 0) {
                i17 |= 805306368;
            } else if ((i15 & 805306368) == 0) {
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i17 |= i36;
            }
            if ((i17 & 306783379) != 306783378) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q2.m87135U(i17 & 1, z18)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if (i45 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z27 = false;
                } else {
                    z27 = z13;
                }
                if (i24 != 0) {
                    z17 = false;
                }
                if (i26 != 0) {
                    z28 = false;
                } else {
                    z28 = z15;
                }
                c28676v0 = C28635l.f115821a;
                i37 = 6;
                if (i29 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C15621b(i37);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    interfaceC4339a5 = (InterfaceC4339a) objM87133R7;
                } else {
                    interfaceC4339a5 = interfaceC4339a;
                }
                if (i35 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C15621b(7);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a6 = interfaceC4339a2;
                }
                if (i13 == 0) {
                    i38 = 4;
                    f14 = 4 * 12;
                } else {
                    i38 = 4;
                    f14 = 4 * 6;
                }
                InterfaceC28670t2 interfaceC28670t2M30587a4 = AbstractC11352g.m30587a(f14, null, "buttonWidth", c28655q2, 384, 10);
                if (i13 == 0) {
                    f15 = 6 * i38;
                } else {
                    float f114 = i38;
                    f15 = f114 * f114;
                }
                interfaceC28670t2M30587a = AbstractC11352g.m30587a(f15, null, "checkmarkIconSize", c28655q2, 384, 10);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i3, c28655q2, 6);
                c17916v0 = AbstractC17918w0.f69621a;
                z29 = z17;
                if (z28) {
                    c28655q2.m87150e0(1839634551);
                    z34 = z28;
                    modifierM3357b = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack30(), c17916v0);
                    c28655q2.m87173q(false);
                } else {
                    z34 = z28;
                    if (((Boolean) interfaceC28601c1M44460m.getValue()).booleanValue()) {
                    }
                    c28655q2.m87150e0(1839638419);
                    c28655q2.m87173q(false);
                    modifierM3357b = AbstractC1092a.m3357b(c2314t, AbstractC15673b0.m43972A(), null, 0.0f, 6);
                    C28674u2 c28674u6 = AbstractC2453v1.f9569h;
                    float f115 = 4;
                    float f28 = 12 * f115;
                    fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u6)).mo743q0(f28);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11348f.m30553a(-fMo743q0);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    c11344e = (C11344e) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    if (m46734m(interfaceC28601c1)) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.1f;
                    }
                    boolean z4113 = z16;
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f16, AbstractC11348f.m30574v(1000, 0, null, 6), "shimmerTransparency", null, c28655q2, 3120, 20);
                    float fontScale5 = ((InterfaceC39171c) c28655q2.m87161k(c28674u6)).getFontScale();
                    Boolean boolValueOf5 = Boolean.valueOf(z29);
                    if ((i17 & 3670016) == 1048576) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean zM87157i5 = z35 | c28655q2.m87157i(c11344e) | c28655q2.m87147d(fMo743q0);
                    if ((i17 & 234881024) == 67108864) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = zM87157i5 | z36;
                    objM87133R4 = c28655q2.m87133R();
                    if (z37) {
                        InterfaceC4339a interfaceC4339a114 = interfaceC4339a5;
                        objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a114, interfaceC28601c1, null);
                        z38 = z29;
                        interfaceC4339a7 = interfaceC4339a114;
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        InterfaceC4339a interfaceC4339a115 = interfaceC4339a5;
                        objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a115, interfaceC28601c1, null);
                        z38 = z29;
                        interfaceC4339a7 = interfaceC4339a115;
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q2.m87172p0(objM87133R4);
                    }
                    i39 = i17 >> 18;
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, boolValueOf5);
                    Modifier modifierM3421r5 = AbstractC1102d.m3421r(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2 * f115)).mo3471e(modifierM3357b), m46732k(interfaceC28670t2M30587a4), f28);
                    if ((i17 & 1879048192) == 536870912) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    objM87133R5 = c28655q2.m87133R();
                    if (z39) {
                        objM87133R5 = new C12762e(interfaceC4339a6, 4);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C12762e(interfaceC4339a6, 4);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    Modifier modifierMo3471e5 = AbstractC1092a.m3360e(modifierM3421r5, interfaceC21083i3, null, false, null, (InterfaceC4339a) objM87133R5, 28).mo3471e(modifier2);
                    c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    boolean z4114 = z38;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d13);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        interfaceC4339a8 = interfaceC4339a7;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111);
                        if (m46734m(interfaceC28601c2)) {
                            c28655q2.m87150e0(-1003627836);
                            AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1003541346);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifier12 = modifier2;
                        InterfaceC4339a interfaceC4339a116 = interfaceC4339a6;
                        f17 = ((float) 0.5d) * 8;
                        Modifier modifierM3395q9 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale5, (((float) 1.5d) * f115) / fontScale5);
                        if (i13 > 0) {
                            C22949e c22949e9 = AbstractC22977m.f90650a;
                            interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                        } else {
                            interfaceC22974lM66748k = AbstractC22977m.f90654e;
                        }
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
                        Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM3395q9);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a9);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m112);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N112);
                        if (z27 != 0) {
                            c28655q2.m87150e0(-1967833484);
                            AbstractC37421e.m119789b(c28655q2, 0);
                            c28655q2.m87173q(false);
                            z46 = false;
                            z44 = z34;
                            z45 = true;
                        } else {
                            c28655q2.m87150e0(-1967739988);
                            InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                            Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, c2314t);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d14);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m113);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N113);
                            int i4112 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                            boolean z4115 = z34;
                            AbstractC37419c.m119780c(f13, z4115, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i4112);
                            AbstractC37420d.m119785c(f13, z4115, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i4112);
                            z44 = z4115;
                            z45 = true;
                            c28655q2.m87173q(true);
                            z46 = false;
                            c28655q2.m87173q(false);
                        }
                        if (i13 > 0) {
                            c28655q2.m87150e0(-1966895300);
                            String strValueOf9 = String.valueOf(i13);
                            C38072d c38072d9 = C38072d.f163053a;
                            int i4113 = C38072d.f163054b;
                            AbstractC30795n.m94707h(strValueOf9, null, c38072d9.m121949b(c28655q2, i4113).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d9.m121952e(c28655q2, i4113).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                            c28655q2.m87173q(z46);
                        } else {
                            c28655q2.m87150e0(-1966687724);
                            c28655q2.m87173q(z46);
                        }
                        c28655q2.m87173q(z45);
                        c28655q2.m87173q(z45);
                        interfaceC4339a4 = interfaceC4339a116;
                        modifier3 = modifier12;
                        c28655q = c28655q2;
                        z19 = z27;
                        interfaceC4339a3 = interfaceC4339a8;
                        z25 = z4113;
                        z24 = z4114;
                        z26 = z44;
                    } else {
                        interfaceC4339a8 = interfaceC4339a7;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111);
                    if (m46734m(interfaceC28601c2)) {
                        c28655q2.m87150e0(-1003627836);
                        AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1003541346);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifier13 = modifier2;
                    InterfaceC4339a interfaceC4339a117 = interfaceC4339a6;
                    f17 = ((float) 0.5d) * 8;
                    Modifier modifierM3395q10 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale5, (((float) 1.5d) * f115) / fontScale5);
                    if (i13 > 0) {
                        C22949e c22949e10 = AbstractC22977m.f90650a;
                        interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                    } else {
                        interfaceC22974lM66748k = AbstractC22977m.f90654e;
                    }
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifierM3395q10);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m114);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N114);
                    if (z27 != 0) {
                        c28655q2.m87150e0(-1967833484);
                        AbstractC37421e.m119789b(c28655q2, 0);
                        c28655q2.m87173q(false);
                        z46 = false;
                        z44 = z34;
                        z45 = true;
                    } else {
                        c28655q2.m87150e0(-1967739988);
                        InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q2.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q2, c2314t);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d15);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m115);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N115);
                        int i4114 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                        boolean z4116 = z34;
                        AbstractC37419c.m119780c(f13, z4116, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i4114);
                        AbstractC37420d.m119785c(f13, z4116, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i4114);
                        z44 = z4116;
                        z45 = true;
                        c28655q2.m87173q(true);
                        z46 = false;
                        c28655q2.m87173q(false);
                    }
                    if (i13 > 0) {
                        c28655q2.m87150e0(-1966895300);
                        String strValueOf10 = String.valueOf(i13);
                        C38072d c38072d10 = C38072d.f163053a;
                        int i4115 = C38072d.f163054b;
                        AbstractC30795n.m94707h(strValueOf10, null, c38072d10.m121949b(c28655q2, i4115).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d10.m121952e(c28655q2, i4115).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                        c28655q2.m87173q(z46);
                    } else {
                        c28655q2.m87150e0(-1966687724);
                        c28655q2.m87173q(z46);
                    }
                    c28655q2.m87173q(z45);
                    c28655q2.m87173q(z45);
                    interfaceC4339a4 = interfaceC4339a117;
                    modifier3 = modifier13;
                    c28655q = c28655q2;
                    z19 = z27;
                    interfaceC4339a3 = interfaceC4339a8;
                    z25 = z4113;
                    z24 = z4114;
                    z26 = z44;
                }
                C28674u2 c28674u7 = AbstractC2453v1.f9569h;
                float f116 = 4;
                float f29 = 12 * f116;
                fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u7)).mo743q0(f29);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11348f.m30553a(-fMo743q0);
                    c28655q2.m87172p0(objM87133R2);
                }
                c11344e = (C11344e) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                if (m46734m(interfaceC28601c1)) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.1f;
                }
                boolean z4117 = z16;
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f16, AbstractC11348f.m30574v(1000, 0, null, 6), "shimmerTransparency", null, c28655q2, 3120, 20);
                float fontScale6 = ((InterfaceC39171c) c28655q2.m87161k(c28674u7)).getFontScale();
                Boolean boolValueOf6 = Boolean.valueOf(z29);
                if ((i17 & 3670016) == 1048576) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean zM87157i6 = z35 | c28655q2.m87157i(c11344e) | c28655q2.m87147d(fMo743q0);
                if ((i17 & 234881024) == 67108864) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = zM87157i6 | z36;
                objM87133R4 = c28655q2.m87133R();
                if (z37) {
                    InterfaceC4339a interfaceC4339a118 = interfaceC4339a5;
                    objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a118, interfaceC28601c1, null);
                    z38 = z29;
                    interfaceC4339a7 = interfaceC4339a118;
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    InterfaceC4339a interfaceC4339a119 = interfaceC4339a5;
                    objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a119, interfaceC28601c1, null);
                    z38 = z29;
                    interfaceC4339a7 = interfaceC4339a119;
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q2.m87172p0(objM87133R4);
                }
                i39 = i17 >> 18;
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, boolValueOf6);
                Modifier modifierM3421r6 = AbstractC1102d.m3421r(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2 * f116)).mo3471e(modifierM3357b), m46732k(interfaceC28670t2M30587a4), f29);
                if ((i17 & 1879048192) == 536870912) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                objM87133R5 = c28655q2.m87133R();
                if (z39) {
                    objM87133R5 = new C12762e(interfaceC4339a6, 4);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C12762e(interfaceC4339a6, 4);
                    c28655q2.m87172p0(objM87133R5);
                }
                Modifier modifierMo3471e6 = AbstractC1092a.m3360e(modifierM3421r6, interfaceC21083i3, null, false, null, (InterfaceC4339a) objM87133R5, 28).mo3471e(modifier2);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q2.m87165m();
                Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                boolean z4118 = z38;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d16);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m116);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    interfaceC4339a8 = interfaceC4339a7;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N116);
                    if (m46734m(interfaceC28601c2)) {
                        c28655q2.m87150e0(-1003627836);
                        AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1003541346);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifier14 = modifier2;
                    InterfaceC4339a interfaceC4339a1110 = interfaceC4339a6;
                    f17 = ((float) 0.5d) * 8;
                    Modifier modifierM3395q11 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale6, (((float) 1.5d) * f116) / fontScale6);
                    if (i13 > 0) {
                        C22949e c22949e11 = AbstractC22977m.f90650a;
                        interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                    } else {
                        interfaceC22974lM66748k = AbstractC22977m.f90654e;
                    }
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
                    Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, modifierM3395q11);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a11);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m117);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N117);
                    if (z27 != 0) {
                        c28655q2.m87150e0(-1967833484);
                        AbstractC37421e.m119789b(c28655q2, 0);
                        c28655q2.m87173q(false);
                        z46 = false;
                        z44 = z34;
                        z45 = true;
                    } else {
                        c28655q2.m87150e0(-1967739988);
                        InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q2.m87165m();
                        Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q2, c2314t);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d17);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m118);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N118);
                        int i4116 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                        boolean z4119 = z34;
                        AbstractC37419c.m119780c(f13, z4119, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i4116);
                        AbstractC37420d.m119785c(f13, z4119, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i4116);
                        z44 = z4119;
                        z45 = true;
                        c28655q2.m87173q(true);
                        z46 = false;
                        c28655q2.m87173q(false);
                    }
                    if (i13 > 0) {
                        c28655q2.m87150e0(-1966895300);
                        String strValueOf11 = String.valueOf(i13);
                        C38072d c38072d11 = C38072d.f163053a;
                        int i4117 = C38072d.f163054b;
                        AbstractC30795n.m94707h(strValueOf11, null, c38072d11.m121949b(c28655q2, i4117).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11.m121952e(c28655q2, i4117).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                        c28655q2.m87173q(z46);
                    } else {
                        c28655q2.m87150e0(-1966687724);
                        c28655q2.m87173q(z46);
                    }
                    c28655q2.m87173q(z45);
                    c28655q2.m87173q(z45);
                    interfaceC4339a4 = interfaceC4339a1110;
                    modifier3 = modifier14;
                    c28655q = c28655q2;
                    z19 = z27;
                    interfaceC4339a3 = interfaceC4339a8;
                    z25 = z4117;
                    z24 = z4118;
                    z26 = z44;
                } else {
                    interfaceC4339a8 = interfaceC4339a7;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N116);
                if (m46734m(interfaceC28601c2)) {
                    c28655q2.m87150e0(-1003627836);
                    AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1003541346);
                    c28655q2.m87173q(false);
                }
                Modifier modifier15 = modifier2;
                InterfaceC4339a interfaceC4339a1111 = interfaceC4339a6;
                f17 = ((float) 0.5d) * 8;
                Modifier modifierM3395q12 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale6, (((float) 1.5d) * f116) / fontScale6);
                if (i13 > 0) {
                    C22949e c22949e12 = AbstractC22977m.f90650a;
                    interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                } else {
                    interfaceC22974lM66748k = AbstractC22977m.f90654e;
                }
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q2.m87165m();
                Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q2, modifierM3395q12);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m119);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N119);
                if (z27 != 0) {
                    c28655q2.m87150e0(-1967833484);
                    AbstractC37421e.m119789b(c28655q2, 0);
                    c28655q2.m87173q(false);
                    z46 = false;
                    z44 = z34;
                    z45 = true;
                } else {
                    c28655q2.m87150e0(-1967739988);
                    InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q2.m87165m();
                    Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d18);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1110);
                    int i4118 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                    boolean z41110 = z34;
                    AbstractC37419c.m119780c(f13, z41110, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i4118);
                    AbstractC37420d.m119785c(f13, z41110, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i4118);
                    z44 = z41110;
                    z45 = true;
                    c28655q2.m87173q(true);
                    z46 = false;
                    c28655q2.m87173q(false);
                }
                if (i13 > 0) {
                    c28655q2.m87150e0(-1966895300);
                    String strValueOf12 = String.valueOf(i13);
                    C38072d c38072d12 = C38072d.f163053a;
                    int i4119 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strValueOf12, null, c38072d12.m121949b(c28655q2, i4119).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d12.m121952e(c28655q2, i4119).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                    c28655q2.m87173q(z46);
                } else {
                    c28655q2.m87150e0(-1966687724);
                    c28655q2.m87173q(z46);
                }
                c28655q2.m87173q(z45);
                c28655q2.m87173q(z45);
                interfaceC4339a4 = interfaceC4339a1111;
                modifier3 = modifier15;
                c28655q = c28655q2;
                z19 = z27;
                interfaceC4339a3 = interfaceC4339a8;
                z25 = z4117;
                z24 = z4118;
                z26 = z44;
            } else {
                c28655q2.m87138X();
                z19 = z13;
                interfaceC4339a3 = interfaceC4339a;
                z24 = z17;
                modifier3 = modifier2;
                c28655q = c28655q2;
                z25 = z16;
                z26 = z15;
                interfaceC4339a4 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h01.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC16539f.m46731j(modifier3, i13, f13, i14, z25, z19, z24, z26, interfaceC4339a3, interfaceC4339a4, i15, i16, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i17 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i24 = i16 & 64;
        if (i24 != 0) {
            i17 |= 1572864;
            z17 = z14;
        } else {
            z17 = z14;
            if ((i15 & 1572864) == 0) {
                if (c28655q2.m87155h(z17)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i17 |= i25;
            }
        }
        i26 = i16 & 128;
        if (i26 != 0) {
            i17 |= 12582912;
            i27 = i44;
        } else {
            i27 = i44;
            if ((i15 & 12582912) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i17 |= i28;
            }
        }
        i29 = i16 & 256;
        if (i29 != 0) {
            i17 |= 100663296;
        } else if ((i15 & 100663296) == 0) {
            if (c28655q2.m87157i(interfaceC4339a)) {
                i34 = 67108864;
            } else {
                i34 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i17 |= i34;
        }
        i35 = i16 & 512;
        if (i35 != 0) {
            i17 |= 805306368;
        } else if ((i15 & 805306368) == 0) {
            if (c28655q2.m87157i(interfaceC4339a2)) {
                i36 = 536870912;
            } else {
                i36 = 268435456;
            }
            i17 |= i36;
        }
        if ((i17 & 306783379) != 306783378) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (c28655q2.m87135U(i17 & 1, z18)) {
            c2314t = C2314t.f9131w;
            if (i27 != 0) {
                modifier2 = c2314t;
            }
            if (i45 != 0) {
                z16 = false;
            }
            if (i18 != 0) {
                z27 = false;
            } else {
                z27 = z13;
            }
            if (i24 != 0) {
                z17 = false;
            }
            if (i26 != 0) {
                z28 = false;
            } else {
                z28 = z15;
            }
            c28676v0 = C28635l.f115821a;
            i37 = 6;
            if (i29 != 0) {
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C15621b(i37);
                    c28655q2.m87172p0(objM87133R7);
                }
                interfaceC4339a5 = (InterfaceC4339a) objM87133R7;
            } else {
                interfaceC4339a5 = interfaceC4339a;
            }
            if (i35 != 0) {
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C15621b(7);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC4339a6 = (InterfaceC4339a) objM87133R6;
            } else {
                interfaceC4339a6 = interfaceC4339a2;
            }
            if (i13 == 0) {
                i38 = 4;
                f14 = 4 * 12;
            } else {
                i38 = 4;
                f14 = 4 * 6;
            }
            InterfaceC28670t2 interfaceC28670t2M30587a5 = AbstractC11352g.m30587a(f14, null, "buttonWidth", c28655q2, 384, 10);
            if (i13 == 0) {
                f15 = 6 * i38;
            } else {
                float f117 = i38;
                f15 = f117 * f117;
            }
            interfaceC28670t2M30587a = AbstractC11352g.m30587a(f15, null, "checkmarkIconSize", c28655q2, 384, 10);
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
            interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i4, c28655q2, 6);
            c17916v0 = AbstractC17918w0.f69621a;
            z29 = z17;
            if (z28) {
                c28655q2.m87150e0(1839634551);
                z34 = z28;
                modifierM3357b = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack30(), c17916v0);
                c28655q2.m87173q(false);
            } else {
                z34 = z28;
                if (((Boolean) interfaceC28601c1M44460m.getValue()).booleanValue()) {
                }
                c28655q2.m87150e0(1839638419);
                c28655q2.m87173q(false);
                modifierM3357b = AbstractC1092a.m3357b(c2314t, AbstractC15673b0.m43972A(), null, 0.0f, 6);
                C28674u2 c28674u8 = AbstractC2453v1.f9569h;
                float f118 = 4;
                float f210 = 12 * f118;
                fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u8)).mo743q0(f210);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11348f.m30553a(-fMo743q0);
                    c28655q2.m87172p0(objM87133R2);
                }
                c11344e = (C11344e) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                if (m46734m(interfaceC28601c1)) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.1f;
                }
                boolean z41111 = z16;
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f16, AbstractC11348f.m30574v(1000, 0, null, 6), "shimmerTransparency", null, c28655q2, 3120, 20);
                float fontScale7 = ((InterfaceC39171c) c28655q2.m87161k(c28674u8)).getFontScale();
                Boolean boolValueOf7 = Boolean.valueOf(z29);
                if ((i17 & 3670016) == 1048576) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean zM87157i7 = z35 | c28655q2.m87157i(c11344e) | c28655q2.m87147d(fMo743q0);
                if ((i17 & 234881024) == 67108864) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = zM87157i7 | z36;
                objM87133R4 = c28655q2.m87133R();
                if (z37) {
                    InterfaceC4339a interfaceC4339a1112 = interfaceC4339a5;
                    objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a1112, interfaceC28601c1, null);
                    z38 = z29;
                    interfaceC4339a7 = interfaceC4339a1112;
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    InterfaceC4339a interfaceC4339a1113 = interfaceC4339a5;
                    objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a1113, interfaceC28601c1, null);
                    z38 = z29;
                    interfaceC4339a7 = interfaceC4339a1113;
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q2.m87172p0(objM87133R4);
                }
                i39 = i17 >> 18;
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, boolValueOf7);
                Modifier modifierM3421r7 = AbstractC1102d.m3421r(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2 * f118)).mo3471e(modifierM3357b), m46732k(interfaceC28670t2M30587a5), f210);
                if ((i17 & 1879048192) == 536870912) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                objM87133R5 = c28655q2.m87133R();
                if (z39) {
                    objM87133R5 = new C12762e(interfaceC4339a6, 4);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C12762e(interfaceC4339a6, 4);
                    c28655q2.m87172p0(objM87133R5);
                }
                Modifier modifierMo3471e7 = AbstractC1092a.m3360e(modifierM3421r7, interfaceC21083i4, null, false, null, (InterfaceC4339a) objM87133R5, 28).mo3471e(modifier2);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q2.m87165m();
                Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                boolean z41112 = z38;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d19);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    interfaceC4339a8 = interfaceC4339a7;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111);
                    if (m46734m(interfaceC28601c2)) {
                        c28655q2.m87150e0(-1003627836);
                        AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1003541346);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifier16 = modifier2;
                    InterfaceC4339a interfaceC4339a1114 = interfaceC4339a6;
                    f17 = ((float) 0.5d) * 8;
                    Modifier modifierM3395q13 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale7, (((float) 1.5d) * f118) / fontScale7);
                    if (i13 > 0) {
                        C22949e c22949e13 = AbstractC22977m.f90650a;
                        interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                    } else {
                        interfaceC22974lM66748k = AbstractC22977m.f90654e;
                    }
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q2.m87165m();
                    Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q2, modifierM3395q13);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a13);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1112);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1112);
                    if (z27 != 0) {
                        c28655q2.m87150e0(-1967833484);
                        AbstractC37421e.m119789b(c28655q2, 0);
                        c28655q2.m87173q(false);
                        z46 = false;
                        z44 = z34;
                        z45 = true;
                    } else {
                        c28655q2.m87150e0(-1967739988);
                        InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q2.m87165m();
                        Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q2, c2314t);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d110);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1113);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1113);
                        int i41110 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                        boolean z41113 = z34;
                        AbstractC37419c.m119780c(f13, z41113, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i41110);
                        AbstractC37420d.m119785c(f13, z41113, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i41110);
                        z44 = z41113;
                        z45 = true;
                        c28655q2.m87173q(true);
                        z46 = false;
                        c28655q2.m87173q(false);
                    }
                    if (i13 > 0) {
                        c28655q2.m87150e0(-1966895300);
                        String strValueOf13 = String.valueOf(i13);
                        C38072d c38072d13 = C38072d.f163053a;
                        int i41111 = C38072d.f163054b;
                        AbstractC30795n.m94707h(strValueOf13, null, c38072d13.m121949b(c28655q2, i41111).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d13.m121952e(c28655q2, i41111).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                        c28655q2.m87173q(z46);
                    } else {
                        c28655q2.m87150e0(-1966687724);
                        c28655q2.m87173q(z46);
                    }
                    c28655q2.m87173q(z45);
                    c28655q2.m87173q(z45);
                    interfaceC4339a4 = interfaceC4339a1114;
                    modifier3 = modifier16;
                    c28655q = c28655q2;
                    z19 = z27;
                    interfaceC4339a3 = interfaceC4339a8;
                    z25 = z41111;
                    z24 = z41112;
                    z26 = z44;
                } else {
                    interfaceC4339a8 = interfaceC4339a7;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111);
                if (m46734m(interfaceC28601c2)) {
                    c28655q2.m87150e0(-1003627836);
                    AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1003541346);
                    c28655q2.m87173q(false);
                }
                Modifier modifier17 = modifier2;
                InterfaceC4339a interfaceC4339a1115 = interfaceC4339a6;
                f17 = ((float) 0.5d) * 8;
                Modifier modifierM3395q14 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale7, (((float) 1.5d) * f118) / fontScale7);
                if (i13 > 0) {
                    C22949e c22949e14 = AbstractC22977m.f90650a;
                    interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                } else {
                    interfaceC22974lM66748k = AbstractC22977m.f90654e;
                }
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q2.m87165m();
                Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q2, modifierM3395q14);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1114);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1114);
                if (z27 != 0) {
                    c28655q2.m87150e0(-1967833484);
                    AbstractC37421e.m119789b(c28655q2, 0);
                    c28655q2.m87173q(false);
                    z46 = false;
                    z44 = z34;
                    z45 = true;
                } else {
                    c28655q2.m87150e0(-1967739988);
                    InterfaceC39127r0 interfaceC39127r0M66763d111 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q2.m87165m();
                    Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d111);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1115);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1115);
                    int i41112 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                    boolean z41114 = z34;
                    AbstractC37419c.m119780c(f13, z41114, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i41112);
                    AbstractC37420d.m119785c(f13, z41114, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i41112);
                    z44 = z41114;
                    z45 = true;
                    c28655q2.m87173q(true);
                    z46 = false;
                    c28655q2.m87173q(false);
                }
                if (i13 > 0) {
                    c28655q2.m87150e0(-1966895300);
                    String strValueOf14 = String.valueOf(i13);
                    C38072d c38072d14 = C38072d.f163053a;
                    int i41113 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strValueOf14, null, c38072d14.m121949b(c28655q2, i41113).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d14.m121952e(c28655q2, i41113).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                    c28655q2.m87173q(z46);
                } else {
                    c28655q2.m87150e0(-1966687724);
                    c28655q2.m87173q(z46);
                }
                c28655q2.m87173q(z45);
                c28655q2.m87173q(z45);
                interfaceC4339a4 = interfaceC4339a1115;
                modifier3 = modifier17;
                c28655q = c28655q2;
                z19 = z27;
                interfaceC4339a3 = interfaceC4339a8;
                z25 = z41111;
                z24 = z41112;
                z26 = z44;
            }
            C28674u2 c28674u9 = AbstractC2453v1.f9569h;
            float f119 = 4;
            float f211 = 12 * f119;
            fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u9)).mo743q0(f211);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11348f.m30553a(-fMo743q0);
                c28655q2.m87172p0(objM87133R2);
            }
            c11344e = (C11344e) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
            if (m46734m(interfaceC28601c1)) {
                f16 = 1.0f;
            } else {
                f16 = 0.1f;
            }
            boolean z41115 = z16;
            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f16, AbstractC11348f.m30574v(1000, 0, null, 6), "shimmerTransparency", null, c28655q2, 3120, 20);
            float fontScale8 = ((InterfaceC39171c) c28655q2.m87161k(c28674u9)).getFontScale();
            Boolean boolValueOf8 = Boolean.valueOf(z29);
            if ((i17 & 3670016) == 1048576) {
                z35 = true;
            } else {
                z35 = false;
            }
            boolean zM87157i8 = z35 | c28655q2.m87157i(c11344e) | c28655q2.m87147d(fMo743q0);
            if ((i17 & 234881024) == 67108864) {
                z36 = true;
            } else {
                z36 = false;
            }
            z37 = zM87157i8 | z36;
            objM87133R4 = c28655q2.m87133R();
            if (z37) {
                InterfaceC4339a interfaceC4339a1116 = interfaceC4339a5;
                objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a1116, interfaceC28601c1, null);
                z38 = z29;
                interfaceC4339a7 = interfaceC4339a1116;
                interfaceC28601c2 = interfaceC28601c1;
                c28655q2.m87172p0(objM87133R4);
            } else {
                InterfaceC4339a interfaceC4339a1117 = interfaceC4339a5;
                objM87133R4 = new a(z29, c11344e, fMo743q0, interfaceC4339a1117, interfaceC28601c1, null);
                z38 = z29;
                interfaceC4339a7 = interfaceC4339a1117;
                interfaceC28601c2 = interfaceC28601c1;
                c28655q2.m87172p0(objM87133R4);
            }
            i39 = i17 >> 18;
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, boolValueOf8);
            Modifier modifierM3421r8 = AbstractC1102d.m3421r(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2 * f119)).mo3471e(modifierM3357b), m46732k(interfaceC28670t2M30587a5), f211);
            if ((i17 & 1879048192) == 536870912) {
                z39 = true;
            } else {
                z39 = false;
            }
            objM87133R5 = c28655q2.m87133R();
            if (z39) {
                objM87133R5 = new C12762e(interfaceC4339a6, 4);
                c28655q2.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C12762e(interfaceC4339a6, 4);
                c28655q2.m87172p0(objM87133R5);
            }
            Modifier modifierMo3471e8 = AbstractC1092a.m3360e(modifierM3421r8, interfaceC21083i4, null, false, null, (InterfaceC4339a) objM87133R5, 28).mo3471e(modifier2);
            c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d112 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q2.m87165m();
            Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            boolean z41116 = z38;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d112);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1116);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                interfaceC4339a8 = interfaceC4339a7;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1116);
                if (m46734m(interfaceC28601c2)) {
                    c28655q2.m87150e0(-1003627836);
                    AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1003541346);
                    c28655q2.m87173q(false);
                }
                Modifier modifier18 = modifier2;
                InterfaceC4339a interfaceC4339a1118 = interfaceC4339a6;
                f17 = ((float) 0.5d) * 8;
                Modifier modifierM3395q15 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale8, (((float) 1.5d) * f119) / fontScale8);
                if (i13 > 0) {
                    C22949e c22949e15 = AbstractC22977m.f90650a;
                    interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
                } else {
                    interfaceC22974lM66748k = AbstractC22977m.f90654e;
                }
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q2.m87165m();
                Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q2, modifierM3395q15);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a15);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1117);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1117);
                if (z27 != 0) {
                    c28655q2.m87150e0(-1967833484);
                    AbstractC37421e.m119789b(c28655q2, 0);
                    c28655q2.m87173q(false);
                    z46 = false;
                    z44 = z34;
                    z45 = true;
                } else {
                    c28655q2.m87150e0(-1967739988);
                    InterfaceC39127r0 interfaceC39127r0M66763d113 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q2.m87165m();
                    Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d113);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1118);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1118);
                    int i41114 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                    boolean z41117 = z34;
                    AbstractC37419c.m119780c(f13, z41117, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i41114);
                    AbstractC37420d.m119785c(f13, z41117, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i41114);
                    z44 = z41117;
                    z45 = true;
                    c28655q2.m87173q(true);
                    z46 = false;
                    c28655q2.m87173q(false);
                }
                if (i13 > 0) {
                    c28655q2.m87150e0(-1966895300);
                    String strValueOf15 = String.valueOf(i13);
                    C38072d c38072d15 = C38072d.f163053a;
                    int i41115 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strValueOf15, null, c38072d15.m121949b(c28655q2, i41115).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d15.m121952e(c28655q2, i41115).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                    c28655q2.m87173q(z46);
                } else {
                    c28655q2.m87150e0(-1966687724);
                    c28655q2.m87173q(z46);
                }
                c28655q2.m87173q(z45);
                c28655q2.m87173q(z45);
                interfaceC4339a4 = interfaceC4339a1118;
                modifier3 = modifier18;
                c28655q = c28655q2;
                z19 = z27;
                interfaceC4339a3 = interfaceC4339a8;
                z25 = z41115;
                z24 = z41116;
                z26 = z44;
            } else {
                interfaceC4339a8 = interfaceC4339a7;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1116);
            if (m46734m(interfaceC28601c2)) {
                c28655q2.m87150e0(-1003627836);
                AbstractC37422f.m119792b(m46729h(interfaceC28670t2M30588b), c11344e, c28655q2, 64);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1003541346);
                c28655q2.m87173q(false);
            }
            Modifier modifier19 = modifier2;
            InterfaceC4339a interfaceC4339a1119 = interfaceC4339a6;
            f17 = ((float) 0.5d) * 8;
            Modifier modifierM3395q16 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f17 / fontScale8, (((float) 1.5d) * f119) / fontScale8);
            if (i13 > 0) {
                C22949e c22949e16 = AbstractC22977m.f90650a;
                interfaceC22974lM66748k = AbstractC22977m.m66748k(f17, C2299e.f9108K);
            } else {
                interfaceC22974lM66748k = AbstractC22977m.f90654e;
            }
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(interfaceC22974lM66748k, C2299e.f9111N, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q2.m87165m();
            Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q2, modifierM3395q16);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a16);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1119);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1119);
            if (z27 != 0) {
                c28655q2.m87150e0(-1967833484);
                AbstractC37421e.m119789b(c28655q2, 0);
                c28655q2.m87173q(false);
                z46 = false;
                z44 = z34;
                z45 = true;
            } else {
                c28655q2.m87150e0(-1967739988);
                InterfaceC39127r0 interfaceC39127r0M66763d114 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q2.m87165m();
                Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d114);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11110);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11110);
                int i41116 = ((i17 >> 6) & 14) | (i39 & 112) | ((i17 >> 3) & 896);
                boolean z41118 = z34;
                AbstractC37419c.m119780c(f13, z41118, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i41116);
                AbstractC37420d.m119785c(f13, z41118, i14, m46733l(interfaceC28670t2M30587a), c28655q2, i41116);
                z44 = z41118;
                z45 = true;
                c28655q2.m87173q(true);
                z46 = false;
                c28655q2.m87173q(false);
            }
            if (i13 > 0) {
                c28655q2.m87150e0(-1966895300);
                String strValueOf16 = String.valueOf(i13);
                C38072d c38072d16 = C38072d.f163053a;
                int i41117 = C38072d.f163054b;
                AbstractC30795n.m94707h(strValueOf16, null, c38072d16.m121949b(c28655q2, i41117).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d16.m121952e(c28655q2, i41117).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q2.m87173q(z46);
            } else {
                c28655q2.m87150e0(-1966687724);
                c28655q2.m87173q(z46);
            }
            c28655q2.m87173q(z45);
            c28655q2.m87173q(z45);
            interfaceC4339a4 = interfaceC4339a1119;
            modifier3 = modifier19;
            c28655q = c28655q2;
            z19 = z27;
            interfaceC4339a3 = interfaceC4339a8;
            z25 = z41115;
            z24 = z41116;
            z26 = z44;
        } else {
            c28655q2.m87138X();
            z19 = z13;
            interfaceC4339a3 = interfaceC4339a;
            z24 = z17;
            modifier3 = modifier2;
            c28655q = c28655q2;
            z25 = z16;
            z26 = z15;
            interfaceC4339a4 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h01.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC16539f.m46731j(modifier3, i13, f13, i14, z25, z19, z24, z26, interfaceC4339a3, interfaceC4339a4, i15, i16, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m46727f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m46728g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final float m46729h(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m46730i(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m46731j(Modifier modifier, int i13, float f13, int i14, boolean z4, boolean z13, boolean z14, boolean z15, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i15, int i16, Composer composer, int i17) {
        m46726e(modifier, i13, f13, i14, z4, z13, z14, z15, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final float m46732k(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: l */
    private static final float m46733l(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: m */
    private static final boolean m46734m(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m46735n(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }
}
