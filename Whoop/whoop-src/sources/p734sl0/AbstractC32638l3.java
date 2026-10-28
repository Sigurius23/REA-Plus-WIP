package p734sl0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import j93.AbstractC21478l0;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sl0.l3 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u0011²\u0006\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "isActive", "", "audioLevel", "Li2/x;", "barColor", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;ZFJLandroidx/compose/runtime/Composer;II)V", "", "voiceBars", "slideOffsetPx", "", "visibleBarCount", "currentAudioLevel", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32638l3 {

    /* JADX INFO: renamed from: sl0.l3$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.VoiceRecordingAnimationKt$VoiceRecordingAnimation$1$1", m100430f = "VoiceRecordingAnimation.kt", m100431l = {67, 78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f135273E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ float f135274F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ float f135275G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ float f135276H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28601c1 f135277I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ InterfaceC28601c1 f135278J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ InterfaceC28670t2 f135279K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ InterfaceC28601c1 f135280L;

        /* JADX INFO: renamed from: w */
        float f135281w;

        /* JADX INFO: renamed from: x */
        Object f135282x;

        /* JADX INFO: renamed from: y */
        int f135283y;

        /* JADX INFO: renamed from: z */
        int f135284z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, float f13, float f14, float f15, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135273E = z4;
            this.f135274F = f13;
            this.f135275G = f14;
            this.f135276H = f15;
            this.f135277I = interfaceC28601c1;
            this.f135278J = interfaceC28601c2;
            this.f135279K = interfaceC28670t2;
            this.f135280L = interfaceC28601c3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f135273E, this.f135274F, this.f135275G, this.f135276H, this.f135277I, this.f135278J, this.f135279K, this.f135280L, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0078  */
        /* JADX WARN: Code duplicated, block: B:24:0x0082  */
        /* JADX WARN: Code duplicated, block: B:26:0x0094  */
        /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:33:0x00f4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0111 -> B:22:0x0078). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p734sl0.AbstractC32638l3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:106:0x0200  */
    /* JADX WARN: Code duplicated, block: B:109:0x020c  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x010d  */
    /* JADX WARN: Code duplicated, block: B:79:0x011b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0183  */
    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a8  */
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
    /* JADX INFO: renamed from: c */
    public static final void m101993c(Modifier modifier, final boolean z4, float f13, long j7, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        float f14;
        long brandWhite;
        boolean z13;
        final Modifier modifier3;
        final float f15;
        final long j13;
        C28677v1 c28677v1M87180u;
        int i16;
        C2314t c2314t;
        long j14;
        final float f16;
        float f17;
        final float f18;
        Object objM87133R;
        C28676v0 c28676v0;
        final InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        final InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        final InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        Boolean boolValueOf;
        boolean z14;
        boolean zM87153g;
        Object objM87133R4;
        C2314t c2314t2;
        Boolean bool;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z15;
        Object objM87133R5;
        final long j15;
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1627462230);
        int i18 = i14 & 1;
        if (i18 != 0) {
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
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                f14 = f13;
                i15 |= c28655q.m87147d(f14) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                brandWhite = j7;
                if ((i14 & 8) == 0 || !c28655q.m87151f(brandWhite)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i17;
            } else {
                brandWhite = j7;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i18 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i19 != 0) {
                        f14 = 0.0f;
                    }
                    if ((i14 & 8) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
                        i15 &= -7169;
                    }
                } else {
                    c28655q.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                }
                float f19 = f14;
                j14 = brandWhite;
                c28655q.m87175r();
                f16 = 1;
                float f24 = 4;
                f17 = 5 * f24;
                Modifier modifier4 = modifier2;
                f18 = ((float) 1.5d) * f24;
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(C25271y.f99162w);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC3855a.m11831o(0.0f, c28655q);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC11895b.m32005x(0, c28655q);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(Float.valueOf(f19), c28655q);
                boolValueOf = Boolean.valueOf(z4);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87153g = z14 | c28655q.m87153g(interfaceC28601c1M87238F);
                objM87133R4 = c28655q.m87133R();
                if (!zM87153g || objM87133R4 == c28676v0) {
                    c2314t2 = c2314t;
                    bool = boolValueOf;
                    a aVar = new a(z4, f18, f17, f16, interfaceC28601c1, interfaceC28601c3, interfaceC28601c1M87238F, interfaceC28601c2, null);
                    c28655q.m87172p0(aVar);
                    objM87133R4 = aVar;
                } else {
                    bool = boolValueOf;
                    c2314t2 = c2314t;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool);
                float f25 = 11 * f24;
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f25, AbstractC1102d.m3409f(1.0f, modifier4)), AbstractC33253j.m105489e(f24));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9117z, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM118994r);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3411h(f25, AbstractC1102d.m3409f(1.0f, c2314t2)), 16, 0.0f, 2);
                z15 = (((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87151f(j14)) || (i15 & 3072) == 2048;
                objM87133R5 = c28655q.m87133R();
                if (!z15 || objM87133R5 == c28676v0) {
                    j15 = j14;
                    objM87133R5 = new Function1() { // from class: sl0.j3
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC32638l3.m101995e(f16, f16, interfaceC28601c3, f18, j15, interfaceC28601c2, interfaceC28601c1, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                } else {
                    j15 = j14;
                }
                AbstractC21478l0.m60421a(modifierM3396r, (Function1) objM87133R5, c28655q, 6);
                c28655q.m87173q(true);
                f15 = f19;
                modifier3 = modifier4;
                j13 = j15;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                f15 = f14;
                j13 = brandWhite;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.k3
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC32638l3.m101996f(modifier3, z4, f15, j13, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 384;
        f14 = f13;
        if ((i13 & 3072) == 0) {
            brandWhite = j7;
            if ((i14 & 8) == 0) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        } else {
            brandWhite = j7;
        }
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if (i19 != 0) {
                    f14 = 0.0f;
                }
                if ((i14 & 8) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
                    i15 &= -7169;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if (i19 != 0) {
                    f14 = 0.0f;
                }
                if ((i14 & 8) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
                    i15 &= -7169;
                }
            }
            float f110 = f14;
            j14 = brandWhite;
            c28655q.m87175r();
            f16 = 1;
            float f26 = 4;
            f17 = 5 * f26;
            Modifier modifier5 = modifier2;
            f18 = ((float) 1.5d) * f26;
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(C25271y.f99162w);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC3855a.m11831o(0.0f, c28655q);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC11895b.m32005x(0, c28655q);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(Float.valueOf(f110), c28655q);
            boolValueOf = Boolean.valueOf(z4);
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            zM87153g = z14 | c28655q.m87153g(interfaceC28601c1M87238F);
            objM87133R4 = c28655q.m87133R();
            if (zM87153g) {
                c2314t2 = c2314t;
                bool = boolValueOf;
                a aVar2 = new a(z4, f18, f17, f16, interfaceC28601c1, interfaceC28601c3, interfaceC28601c1M87238F, interfaceC28601c2, null);
                c28655q.m87172p0(aVar2);
                objM87133R4 = aVar2;
            } else {
                c2314t2 = c2314t;
                bool = boolValueOf;
                a aVar3 = new a(z4, f18, f17, f16, interfaceC28601c1, interfaceC28601c3, interfaceC28601c1M87238F, interfaceC28601c2, null);
                c28655q.m87172p0(aVar3);
                objM87133R4 = aVar3;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool);
            float f27 = 11 * f26;
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f27, AbstractC1102d.m3409f(1.0f, modifier5)), AbstractC33253j.m105489e(f26));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9117z, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM118994r2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3411h(f27, AbstractC1102d.m3409f(1.0f, c2314t2)), 16, 0.0f, 2);
            if (((i15 & 7168) ^ 3072) <= 2048) {
            }
            objM87133R5 = c28655q.m87133R();
            if (z15) {
                j15 = j14;
                objM87133R5 = new Function1() { // from class: sl0.j3
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC32638l3.m101995e(f16, f16, interfaceC28601c3, f18, j15, interfaceC28601c2, interfaceC28601c1, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(objM87133R5);
            } else {
                j15 = j14;
                objM87133R5 = new Function1() { // from class: sl0.j3
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC32638l3.m101995e(f16, f16, interfaceC28601c3, f18, j15, interfaceC28601c2, interfaceC28601c1, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC21478l0.m60421a(modifierM3396r2, (Function1) objM87133R5, c28655q, 6);
            c28655q.m87173q(true);
            f15 = f110;
            modifier3 = modifier5;
            j13 = j15;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            f15 = f14;
            j13 = brandWhite;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.k3
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC32638l3.m101996f(modifier3, z4, f15, j13, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final List<Float> m101994d(InterfaceC28601c1 interfaceC28601c1) {
        return (List) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m101995e(float f13, float f14, InterfaceC28601c1 interfaceC28601c1, float f15, long j7, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC22131e interfaceC22131e) {
        InterfaceC28601c1 interfaceC28601c4;
        char c3;
        int i13;
        InterfaceC22131e Canvas = interfaceC22131e;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        char c7 = ' ';
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L));
        float fMo743q0 = Canvas.mo743q0(f13);
        float fMo743q1 = Canvas.mo743q0(f14);
        float f16 = fMo743q1 + fMo743q0;
        int i14 = (int) ((fIntBitsToFloat + fMo743q0) / f16);
        if (i14 != m102000j(interfaceC28601c1)) {
            interfaceC28601c4 = interfaceC28601c1;
            m102001k(interfaceC28601c4, i14);
        } else {
            interfaceC28601c4 = interfaceC28601c1;
        }
        int iM102000j = m102000j(interfaceC28601c4);
        int i15 = 0;
        while (i15 < iM102000j) {
            float fM101998h = (i15 * f16) + m101998h(interfaceC28601c2);
            int size = (m101994d(interfaceC28601c3).size() - m102000j(interfaceC28601c4)) + i15;
            float density = Canvas.getDensity() * ((size < 0 || size >= m101994d(interfaceC28601c3).size()) ? f15 : m101994d(interfaceC28601c3).get(size).floatValue());
            float f17 = (fIntBitsToFloat2 / 2.0f) - (density / 2.0f);
            if (fM101998h + fMo743q1 <= 0.0f || fM101998h >= fIntBitsToFloat) {
                c3 = c7;
                i13 = i15;
            } else {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM101998h)) << c7) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo743q1)) << c7) | (((long) Float.floatToRawIntBits(density)) & 4294967295L);
                float fMo743q2 = Canvas.mo743q0(2);
                c3 = c7;
                i13 = i15;
                InterfaceC22131e.m63374D(Canvas, j7, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMo743q2)) << c3) | (((long) Float.floatToRawIntBits(fMo743q2)) & 4294967295L), null, 0.0f, 240);
            }
            i15 = i13 + 1;
            interfaceC28601c4 = interfaceC28601c1;
            Canvas = interfaceC22131e;
            iM102000j = iM102000j;
            c7 = c3;
            fIntBitsToFloat = fIntBitsToFloat;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m101996f(Modifier modifier, boolean z4, float f13, long j7, int i13, int i14, Composer composer, int i15) {
        m101993c(modifier, z4, f13, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m101997g(InterfaceC28601c1 interfaceC28601c1, List<Float> list) {
        interfaceC28601c1.setValue(list);
    }

    /* JADX INFO: renamed from: h */
    private static final float m101998h(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m101999i(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final int m102000j(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: k */
    private static final void m102001k(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final float m102002l(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }
}
