package yo0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: yo0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a_\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Lb91/a;", "style", "Li2/x;", "color", "Lw3/k;", "textAlign", "", "durationPerChar", "startDelay", "Lkotlin/Function0;", "Ll83/a0;", "onAnimationComplete", "c", "(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;JIJJLc93/a;Landroidx/compose/runtime/Composer;II)V", "", "charIndex", "visibleCharCount", "coach-everywhere_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39687i {

    /* JADX INFO: renamed from: yo0.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.ui.TypewriterTextKt$TypewriterWhoopText$2$1", m100430f = "TypewriterText.kt", m100431l = {56, 61, 63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f170832E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ long f170833F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC4339a f170834G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28593a1 f170835H;

        /* JADX INFO: renamed from: w */
        int f170836w;

        /* JADX INFO: renamed from: x */
        int f170837x;

        /* JADX INFO: renamed from: y */
        int f170838y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ long f170839z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j7, String str, long j13, InterfaceC4339a interfaceC4339a, InterfaceC28593a1 interfaceC28593a1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170839z = j7;
            this.f170832E = str;
            this.f170833F = j13;
            this.f170834G = interfaceC4339a;
            this.f170835H = interfaceC28593a1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f170839z, this.f170832E, this.f170833F, this.f170834G, this.f170835H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x005d  */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (bc3.AbstractC3034m0.m8782b(r6, r8) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (bc3.AbstractC3034m0.m8782b(r5, r8) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
        
            if (bc3.AbstractC3034m0.m8782b(500, r8) == r0) goto L25;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0055 -> B:21:0x0058). Please report as a decompilation issue!!! */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r8.f170838y
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L28
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r9)
                goto L68
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                int r1 = r8.f170837x
                int r2 = r8.f170836w
                p505ts.AbstractC34132o.m107864I(r9)
                goto L58
            L24:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L3b
            L28:
                p505ts.AbstractC34132o.m107864I(r9)
                p1.a1 r9 = r8.f170835H
                yo0.AbstractC39687i.m127004h(r9, r2)
                long r6 = r8.f170839z
                r8.f170838y = r5
                java.lang.Object r9 = bc3.AbstractC3034m0.m8782b(r6, r8)
                if (r9 != r0) goto L3b
                goto L67
            L3b:
                java.lang.String r9 = r8.f170832E
                int r9 = r9.length()
                if (r9 < 0) goto L5d
                r1 = r9
            L44:
                p1.a1 r9 = r8.f170835H
                yo0.AbstractC39687i.m127004h(r9, r2)
                long r5 = r8.f170833F
                r8.f170836w = r2
                r8.f170837x = r1
                r8.f170838y = r4
                java.lang.Object r9 = bc3.AbstractC3034m0.m8782b(r5, r8)
                if (r9 != r0) goto L58
                goto L67
            L58:
                if (r2 == r1) goto L5d
                int r2 = r2 + 1
                goto L44
            L5d:
                r8.f170838y = r3
                r1 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r9 = bc3.AbstractC3034m0.m8782b(r1, r8)
                if (r9 != r0) goto L68
            L67:
                return r0
            L68:
                c93.a r9 = r8.f170834G
                r9.invoke()
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: yo0.AbstractC39687i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0136  */
    /* JADX WARN: Code duplicated, block: B:105:0x013c  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0143  */
    /* JADX WARN: Code duplicated, block: B:109:0x0146  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:113:0x014f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x017b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x017d  */
    /* JADX WARN: Code duplicated, block: B:123:0x018f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0192  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:139:0x022f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0241  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[DONT_INVERT] */
    /* JADX INFO: renamed from: c */
    public static final void m126999c(final TextResource text, Modifier modifier, final C2886a style, final long j7, int i13, long j13, long j14, InterfaceC4339a interfaceC4339a, Composer composer, final int i14, final int i15) {
        int i16;
        Modifier modifier2;
        int i17;
        int i18;
        int i19;
        int i24;
        long j15;
        int i25;
        int i26;
        int i27;
        boolean z4;
        C28655q c28655q;
        final InterfaceC4339a interfaceC4339a2;
        final Modifier modifier3;
        final int i28;
        final long j16;
        final long j17;
        C28677v1 c28677v1M87180u;
        int i29;
        C28676v0 c28676v0;
        long j18;
        long j19;
        InterfaceC4339a interfaceC4339a3;
        int i34;
        long j24;
        long j25;
        Object objM87133R;
        String strM21274h;
        boolean zM87153g;
        Object objM87133R2;
        InterfaceC28593a1 interfaceC28593a1;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R3;
        InterfaceC28593a1 interfaceC28593a2;
        String str;
        int i35;
        int i36;
        boolean zM87157i;
        int i37;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(style, "style");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2068705311);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? c28655q2.m87153g(text) : c28655q2.m87157i(text) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i38 = i15 & 2;
        if (i38 == 0) {
            if ((i14 & 48) == 0) {
                modifier2 = modifier;
                i16 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if ((i14 & 512) == 0) {
                    zM87157i = c28655q2.m87153g(style);
                } else {
                    zM87157i = c28655q2.m87157i(style);
                }
                if (zM87157i) {
                    i37 = 256;
                } else {
                    i37 = 128;
                }
                i16 |= i37;
            }
            if ((i14 & 3072) != 0) {
                if (c28655q2.m87151f(j7)) {
                    i36 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i36 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i36;
            }
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    i17 = i13;
                    if (c28655q2.m87149e(i17)) {
                        i35 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i16 |= i35;
                } else {
                    i17 = i13;
                }
                i35 = DfuBaseService.ERROR_REMOTE_MASK;
                i16 |= i35;
            } else {
                i17 = i13;
            }
            i18 = i15 & 32;
            if (i18 != 0) {
                if ((196608 & i14) == 0) {
                    if (c28655q2.m87151f(j13)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i19;
                }
                i24 = i15 & 64;
                if (i24 != 0) {
                    i16 |= 1572864;
                    j15 = j14;
                } else {
                    j15 = j14;
                    if ((i14 & 1572864) == 0) {
                        if (c28655q2.m87151f(j15)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i16 |= i25;
                    }
                }
                i26 = i15 & 128;
                if (i26 != 0) {
                    i16 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i16 |= i27;
                }
                if ((i16 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i16 & 1, z4)) {
                    c28655q2.m87140Z();
                    i29 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i29 != 0 || c28655q2.m87118C()) {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i15 & 16) != 0) {
                            i16 &= -57345;
                            i17 = 5;
                        }
                        if (i18 != 0) {
                            j18 = 75;
                        } else {
                            j18 = j13;
                        }
                        if (i24 != 0) {
                            j19 = 500;
                        } else {
                            j19 = j15;
                        }
                        if (i26 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C39681c(4);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        i34 = i17;
                        j24 = j18;
                        j25 = j19;
                    } else {
                        c28655q2.m87138X();
                        if ((i15 & 16) != 0) {
                            i16 &= -57345;
                        }
                        j24 = j13;
                        interfaceC4339a3 = interfaceC4339a;
                        i34 = i17;
                        j25 = j15;
                    }
                    c28655q2.m87175r();
                    strM21274h = AbstractC8693b.m21274h(text, c28655q2, TextResource.$stable | (i16 & 14));
                    zM87153g = c28655q2.m87153g(strM21274h);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g || objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(0, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    boolean zM87153g2 = c28655q2.m87153g(interfaceC28593a1);
                    if ((i16 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean zM87153g3 = zM87153g2 | z13 | c28655q2.m87153g(strM21274h);
                    if ((458752 & i16) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = ((29360128 & i16) == 8388608) | zM87153g3 | z14;
                    objM87133R3 = c28655q2.m87133R();
                    if (!z15 || objM87133R3 == c28676v0) {
                        interfaceC28593a2 = interfaceC28593a1;
                        objM87133R3 = new a(j25, strM21274h, j24, interfaceC4339a3, interfaceC28593a2, null);
                        str = strM21274h;
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        str = strM21274h;
                        interfaceC28593a2 = interfaceC28593a1;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, str);
                    Modifier modifier4 = modifier2;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC39414r.m125866L0(m127001e(interfaceC28593a2), str), modifier4, j7, 0L, null, null, null, 0L, null, new C36775k(i34), 0L, 0, false, 0, 0, null, style, null, c28655q, (i16 & 112) | ((i16 >> 3) & 896) | ((i16 << 15) & 1879048192), (C2886a.f11498d << 18) | ((i16 << 12) & 3670016), 196088);
                    i28 = i34;
                    modifier3 = modifier4;
                    j17 = j24;
                    j16 = j25;
                    interfaceC4339a2 = interfaceC4339a3;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    modifier3 = modifier2;
                    i28 = i17;
                    j16 = j15;
                    j17 = j13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: yo0.h
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC39687i.m127003g(text, modifier3, style, j7, i28, j17, j16, interfaceC4339a2, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i24 = i15 & 64;
            if (i24 != 0) {
                i16 |= 1572864;
                j15 = j14;
            } else {
                j15 = j14;
                if ((i14 & 1572864) == 0) {
                    if (c28655q2.m87151f(j15)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i16 |= i25;
                }
            }
            i26 = i15 & 128;
            if (i26 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i16 |= i27;
            }
            if ((i16 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                c28655q2.m87140Z();
                i29 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i29 != 0) {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i15 & 16) != 0) {
                        i16 &= -57345;
                        i17 = 5;
                    }
                    if (i18 != 0) {
                        j18 = 75;
                    } else {
                        j18 = j13;
                    }
                    if (i24 != 0) {
                        j19 = 500;
                    } else {
                        j19 = j15;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39681c(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    i34 = i17;
                    j24 = j18;
                    j25 = j19;
                } else {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i15 & 16) != 0) {
                        i16 &= -57345;
                        i17 = 5;
                    }
                    if (i18 != 0) {
                        j18 = 75;
                    } else {
                        j18 = j13;
                    }
                    if (i24 != 0) {
                        j19 = 500;
                    } else {
                        j19 = j15;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39681c(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    i34 = i17;
                    j24 = j18;
                    j25 = j19;
                }
                c28655q2.m87175r();
                strM21274h = AbstractC8693b.m21274h(text, c28655q2, TextResource.$stable | (i16 & 14));
                zM87153g = c28655q2.m87153g(strM21274h);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R2 = AbstractC31061c.m95646v(0, c28655q2);
                } else {
                    objM87133R2 = AbstractC31061c.m95646v(0, c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                boolean zM87153g4 = c28655q2.m87153g(interfaceC28593a1);
                if ((i16 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87153g5 = zM87153g4 | z13 | c28655q2.m87153g(strM21274h);
                if ((458752 & i16) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = ((29360128 & i16) == 8388608) | zM87153g5 | z14;
                objM87133R3 = c28655q2.m87133R();
                if (z15) {
                    interfaceC28593a2 = interfaceC28593a1;
                    objM87133R3 = new a(j25, strM21274h, j24, interfaceC4339a3, interfaceC28593a2, null);
                    str = strM21274h;
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    interfaceC28593a2 = interfaceC28593a1;
                    objM87133R3 = new a(j25, strM21274h, j24, interfaceC4339a3, interfaceC28593a2, null);
                    str = strM21274h;
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, str);
                Modifier modifier5 = modifier2;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(AbstractC39414r.m125866L0(m127001e(interfaceC28593a2), str), modifier5, j7, 0L, null, null, null, 0L, null, new C36775k(i34), 0L, 0, false, 0, 0, null, style, null, c28655q, (i16 & 112) | ((i16 >> 3) & 896) | ((i16 << 15) & 1879048192), (C2886a.f11498d << 18) | ((i16 << 12) & 3670016), 196088);
                i28 = i34;
                modifier3 = modifier5;
                j17 = j24;
                j16 = j25;
                interfaceC4339a2 = interfaceC4339a3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                modifier3 = modifier2;
                i28 = i17;
                j16 = j15;
                j17 = j13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: yo0.h
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC39687i.m127003g(text, modifier3, style, j7, i28, j17, j16, interfaceC4339a2, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 48;
        modifier2 = modifier;
        if ((i14 & 384) == 0) {
            if ((i14 & 512) == 0) {
                zM87157i = c28655q2.m87153g(style);
            } else {
                zM87157i = c28655q2.m87157i(style);
            }
            if (zM87157i) {
                i37 = 256;
            } else {
                i37 = 128;
            }
            i16 |= i37;
        }
        if ((i14 & 3072) != 0) {
            if (c28655q2.m87151f(j7)) {
                i36 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i36 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 |= i36;
        }
        if ((i14 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                i17 = i13;
                if (c28655q2.m87149e(i17)) {
                    i35 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i16 |= i35;
            } else {
                i17 = i13;
            }
            i35 = DfuBaseService.ERROR_REMOTE_MASK;
            i16 |= i35;
        } else {
            i17 = i13;
        }
        i18 = i15 & 32;
        if (i18 != 0) {
            if ((196608 & i14) == 0) {
                if (c28655q2.m87151f(j13)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i19;
            }
            i24 = i15 & 64;
            if (i24 != 0) {
                i16 |= 1572864;
                j15 = j14;
            } else {
                j15 = j14;
                if ((i14 & 1572864) == 0) {
                    if (c28655q2.m87151f(j15)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i16 |= i25;
                }
            }
            i26 = i15 & 128;
            if (i26 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i16 |= i27;
            }
            if ((i16 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                c28655q2.m87140Z();
                i29 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i29 != 0) {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i15 & 16) != 0) {
                        i16 &= -57345;
                        i17 = 5;
                    }
                    if (i18 != 0) {
                        j18 = 75;
                    } else {
                        j18 = j13;
                    }
                    if (i24 != 0) {
                        j19 = 500;
                    } else {
                        j19 = j15;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39681c(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    i34 = i17;
                    j24 = j18;
                    j25 = j19;
                } else {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i15 & 16) != 0) {
                        i16 &= -57345;
                        i17 = 5;
                    }
                    if (i18 != 0) {
                        j18 = 75;
                    } else {
                        j18 = j13;
                    }
                    if (i24 != 0) {
                        j19 = 500;
                    } else {
                        j19 = j15;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39681c(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    i34 = i17;
                    j24 = j18;
                    j25 = j19;
                }
                c28655q2.m87175r();
                strM21274h = AbstractC8693b.m21274h(text, c28655q2, TextResource.$stable | (i16 & 14));
                zM87153g = c28655q2.m87153g(strM21274h);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R2 = AbstractC31061c.m95646v(0, c28655q2);
                } else {
                    objM87133R2 = AbstractC31061c.m95646v(0, c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                boolean zM87153g6 = c28655q2.m87153g(interfaceC28593a1);
                if ((i16 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87153g7 = zM87153g6 | z13 | c28655q2.m87153g(strM21274h);
                if ((458752 & i16) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = ((29360128 & i16) == 8388608) | zM87153g7 | z14;
                objM87133R3 = c28655q2.m87133R();
                if (z15) {
                    interfaceC28593a2 = interfaceC28593a1;
                    objM87133R3 = new a(j25, strM21274h, j24, interfaceC4339a3, interfaceC28593a2, null);
                    str = strM21274h;
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    interfaceC28593a2 = interfaceC28593a1;
                    objM87133R3 = new a(j25, strM21274h, j24, interfaceC4339a3, interfaceC28593a2, null);
                    str = strM21274h;
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, str);
                Modifier modifier6 = modifier2;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(AbstractC39414r.m125866L0(m127001e(interfaceC28593a2), str), modifier6, j7, 0L, null, null, null, 0L, null, new C36775k(i34), 0L, 0, false, 0, 0, null, style, null, c28655q, (i16 & 112) | ((i16 >> 3) & 896) | ((i16 << 15) & 1879048192), (C2886a.f11498d << 18) | ((i16 << 12) & 3670016), 196088);
                i28 = i34;
                modifier3 = modifier6;
                j17 = j24;
                j16 = j25;
                interfaceC4339a2 = interfaceC4339a3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                modifier3 = modifier2;
                i28 = i17;
                j16 = j15;
                j17 = j13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: yo0.h
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC39687i.m127003g(text, modifier3, style, j7, i28, j17, j16, interfaceC4339a2, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i24 = i15 & 64;
        if (i24 != 0) {
            i16 |= 1572864;
            j15 = j14;
        } else {
            j15 = j14;
            if ((i14 & 1572864) == 0) {
                if (c28655q2.m87151f(j15)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i16 |= i25;
            }
        }
        i26 = i15 & 128;
        if (i26 != 0) {
            i16 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if (c28655q2.m87157i(interfaceC4339a)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i16 |= i27;
        }
        if ((i16 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            c28655q2.m87140Z();
            i29 = i14 & 1;
            c28676v0 = C28635l.f115821a;
            if (i29 != 0) {
                if (i38 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if ((i15 & 16) != 0) {
                    i16 &= -57345;
                    i17 = 5;
                }
                if (i18 != 0) {
                    j18 = 75;
                } else {
                    j18 = j13;
                }
                if (i24 != 0) {
                    j19 = 500;
                } else {
                    j19 = j15;
                }
                if (i26 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39681c(4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                i34 = i17;
                j24 = j18;
                j25 = j19;
            } else {
                if (i38 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if ((i15 & 16) != 0) {
                    i16 &= -57345;
                    i17 = 5;
                }
                if (i18 != 0) {
                    j18 = 75;
                } else {
                    j18 = j13;
                }
                if (i24 != 0) {
                    j19 = 500;
                } else {
                    j19 = j15;
                }
                if (i26 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39681c(4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                i34 = i17;
                j24 = j18;
                j25 = j19;
            }
            c28655q2.m87175r();
            strM21274h = AbstractC8693b.m21274h(text, c28655q2, TextResource.$stable | (i16 & 14));
            zM87153g = c28655q2.m87153g(strM21274h);
            objM87133R2 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R2 = AbstractC31061c.m95646v(0, c28655q2);
            } else {
                objM87133R2 = AbstractC31061c.m95646v(0, c28655q2);
            }
            interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
            boolean zM87153g8 = c28655q2.m87153g(interfaceC28593a1);
            if ((i16 & 3670016) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean zM87153g9 = zM87153g8 | z13 | c28655q2.m87153g(strM21274h);
            if ((458752 & i16) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = ((29360128 & i16) == 8388608) | zM87153g9 | z14;
            objM87133R3 = c28655q2.m87133R();
            if (z15) {
                interfaceC28593a2 = interfaceC28593a1;
                objM87133R3 = new a(j25, strM21274h, j24, interfaceC4339a3, interfaceC28593a2, null);
                str = strM21274h;
                c28655q2.m87172p0(objM87133R3);
            } else {
                interfaceC28593a2 = interfaceC28593a1;
                objM87133R3 = new a(j25, strM21274h, j24, interfaceC4339a3, interfaceC28593a2, null);
                str = strM21274h;
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, str);
            Modifier modifier7 = modifier2;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(AbstractC39414r.m125866L0(m127001e(interfaceC28593a2), str), modifier7, j7, 0L, null, null, null, 0L, null, new C36775k(i34), 0L, 0, false, 0, 0, null, style, null, c28655q, (i16 & 112) | ((i16 >> 3) & 896) | ((i16 << 15) & 1879048192), (C2886a.f11498d << 18) | ((i16 << 12) & 3670016), 196088);
            i28 = i34;
            modifier3 = modifier7;
            j17 = j24;
            j16 = j25;
            interfaceC4339a2 = interfaceC4339a3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a2 = interfaceC4339a;
            modifier3 = modifier2;
            i28 = i17;
            j16 = j15;
            j17 = j13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: yo0.h
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC39687i.m127003g(text, modifier3, style, j7, i28, j17, j16, interfaceC4339a2, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m127000d() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private static final int m127001e(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m127002f(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m127003g(TextResource textResource, Modifier modifier, C2886a c2886a, long j7, int i13, long j13, long j14, InterfaceC4339a interfaceC4339a, int i14, int i15, Composer composer, int i16) {
        m126999c(textResource, modifier, c2886a, j7, i13, j13, j14, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
