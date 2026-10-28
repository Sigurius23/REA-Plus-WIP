package vy0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c41.C4074m5;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.C11421z1;
import p098dt.AbstractC12350b;
import p163g1.AbstractC14961b3;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p291l0.InterfaceC23001u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p700bd1.C3092j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import vs2.C36478d;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: vy0.x */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001ai\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aC\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0015H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001d\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u000bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ly71/g;", "icon", "Li2/x;", "backgroundTint", "iconTint", "", "glowEffect", "Ld0/z1;", "transition", "Lkotlin/Function1;", "Ll83/a0;", "stateChanged", "s", "(Landroidx/compose/ui/Modifier;Ly71/g;JJZLd0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "descriptiveText", "", "buttonScale", "iconAlpha", "Lkotlin/Function0;", "onClick", "k", "(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;JJZFFLc93/a;Landroidx/compose/runtime/Composer;II)V", "n", "(Landroidx/compose/ui/Modifier;Ly71/g;JJLc93/a;Landroidx/compose/runtime/Composer;II)V", "Ll0/u;", "content", "o", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36596x {
    /* JADX WARN: Code duplicated, block: B:104:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x014c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0151  */
    /* JADX WARN: Code duplicated, block: B:109:0x015e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0164  */
    /* JADX WARN: Code duplicated, block: B:114:0x0173  */
    /* JADX WARN: Code duplicated, block: B:116:0x0176  */
    /* JADX WARN: Code duplicated, block: B:117:0x0178  */
    /* JADX WARN: Code duplicated, block: B:119:0x017c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0188  */
    /* JADX WARN: Code duplicated, block: B:124:0x01be  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:133:0x023f  */
    /* JADX WARN: Code duplicated, block: B:134:0x026e  */
    /* JADX WARN: Code duplicated, block: B:136:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:139:0x02df  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0110  */
    /* JADX WARN: Code duplicated, block: B:92:0x0119  */
    /* JADX WARN: Code duplicated, block: B:94:0x0126  */
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
    /* JADX INFO: renamed from: k */
    public static final void m117521k(Modifier modifier, final C39274g icon, final TextResource descriptiveText, long j7, long j13, boolean z4, float f13, float f14, final InterfaceC4339a onClick, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        long jM125426w;
        boolean z13;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z14;
        final long j14;
        final float f15;
        final float f16;
        final Modifier modifier3;
        final boolean z15;
        final long j15;
        C28677v1 c28677v1M87180u;
        int i24;
        C2314t c2314t;
        long jM125430y;
        float f17;
        float f18;
        int i25;
        boolean z16;
        long j16;
        Modifier modifier4;
        long j17;
        final long j18;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f19;
        long j19;
        float f24;
        boolean z17;
        long j24;
        int i26;
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(descriptiveText, "descriptiveText");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(502253411);
        int i27 = i14 & 1;
        if (i27 != 0) {
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
            i15 |= c28655q.m87153g(icon) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(descriptiveText) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= ((i14 & 8) == 0 && c28655q.m87151f(j7)) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            jM125426w = j13;
            i15 |= ((i14 & 16) == 0 && c28655q.m87151f(jM125426w)) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            jM125426w = j13;
        }
        int i28 = i14 & 32;
        if (i28 == 0) {
            if ((196608 & i13) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 = i14 & 64;
            if (i16 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q.m87147d(f13)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            i18 = i14 & 128;
            if (i18 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q.m87147d(f14)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i15 |= i19;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87157i(onClick)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i26;
                }
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i24 != 0 || c28655q.m87118C()) {
                        if (i27 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -7169;
                        } else {
                            jM125430y = j7;
                        }
                        if ((i14 & 16) != 0) {
                            jM125426w = C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack();
                            i15 &= -57345;
                        }
                        if (i28 != 0) {
                            z13 = false;
                        }
                        if (i16 != 0) {
                            f17 = 0.0f;
                        } else {
                            f17 = f13;
                        }
                        if (i18 != 0) {
                            f18 = 1.0f;
                        } else {
                            f18 = f14;
                        }
                        i25 = i15;
                        z16 = z13;
                        j16 = jM125426w;
                        modifier4 = modifier2;
                        j17 = jM125430y;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                        }
                        if ((i14 & 16) != 0) {
                            i15 &= -57345;
                        }
                        f17 = f13;
                        f18 = f14;
                        i25 = i15;
                        z16 = z13;
                        j16 = jM125426w;
                        modifier4 = modifier2;
                        j17 = j7;
                    }
                    c28655q.m87175r();
                    Modifier modifierM34565N = AbstractC12350b.m34565N(f17, AbstractC34132o.m107879c(f18, modifier4));
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    j18 = j17;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM34565N);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    C38072d c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(descriptiveText, c28655q, (i25 >> 6) & 14), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196090);
                    f19 = 8;
                    AbstractC18489d0.m53380u(2, f19, c2314t, c28655q);
                    if (z16) {
                        c28655q.m87150e0(551454792);
                        final long j25 = j16;
                        j19 = j25;
                        m117525o(AbstractC37817c.m121344e(640663521, c28655q, new Function3() { // from class: vy0.v
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC36596x.m117522l(icon, j18, j25, onClick, (InterfaceC23001u) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q, 6);
                        c28655q.m87173q(false);
                        f24 = f18;
                        j24 = j18;
                        z17 = true;
                    } else {
                        j19 = j16;
                        c28655q.m87150e0(551802116);
                        int i29 = i25 >> 3;
                        f24 = f18;
                        z17 = true;
                        j24 = j18;
                        m117524n(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 1 * f19, 0.0f, 11), icon, j24, j19, onClick, c28655q, (i25 & 112) | 6 | (i29 & 896) | (i29 & 7168) | ((i25 >> 12) & 57344), 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z17);
                    f15 = f17;
                    f16 = f24;
                    modifier3 = modifier4;
                    z15 = z16;
                    j15 = j19;
                    j14 = j24;
                } else {
                    c28655q.m87138X();
                    j14 = j7;
                    f15 = f13;
                    f16 = f14;
                    modifier3 = modifier2;
                    z15 = z13;
                    j15 = jM125426w;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.w
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC36596x.m117523m(modifier3, icon, descriptiveText, j14, j15, z15, f15, f16, onClick, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 12582912;
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i26;
            }
            if ((i15 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -7169;
                    } else {
                        jM125430y = j7;
                    }
                    if ((i14 & 16) != 0) {
                        jM125426w = C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack();
                        i15 &= -57345;
                    }
                    if (i28 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f13;
                    }
                    if (i18 != 0) {
                        f18 = 1.0f;
                    } else {
                        f18 = f14;
                    }
                    i25 = i15;
                    z16 = z13;
                    j16 = jM125426w;
                    modifier4 = modifier2;
                    j17 = jM125430y;
                } else {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -7169;
                    } else {
                        jM125430y = j7;
                    }
                    if ((i14 & 16) != 0) {
                        jM125426w = C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack();
                        i15 &= -57345;
                    }
                    if (i28 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f13;
                    }
                    if (i18 != 0) {
                        f18 = 1.0f;
                    } else {
                        f18 = f14;
                    }
                    i25 = i15;
                    z16 = z13;
                    j16 = jM125426w;
                    modifier4 = modifier2;
                    j17 = jM125430y;
                }
                c28655q.m87175r();
                Modifier modifierM34565N2 = AbstractC12350b.m34565N(f17, AbstractC34132o.m107879c(f18, modifier4));
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                j18 = j17;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM34565N2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                C38072d c38072d2 = C38072d.f163053a;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(descriptiveText, c28655q, (i25 >> 6) & 14), null, c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196090);
                f19 = 8;
                AbstractC18489d0.m53380u(2, f19, c2314t, c28655q);
                if (z16) {
                    c28655q.m87150e0(551454792);
                    final long j26 = j16;
                    j19 = j26;
                    m117525o(AbstractC37817c.m121344e(640663521, c28655q, new Function3() { // from class: vy0.v
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC36596x.m117522l(icon, j18, j26, onClick, (InterfaceC23001u) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q, 6);
                    c28655q.m87173q(false);
                    f24 = f18;
                    j24 = j18;
                    z17 = true;
                } else {
                    j19 = j16;
                    c28655q.m87150e0(551802116);
                    int i210 = i25 >> 3;
                    f24 = f18;
                    z17 = true;
                    j24 = j18;
                    m117524n(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 1 * f19, 0.0f, 11), icon, j24, j19, onClick, c28655q, (i25 & 112) | 6 | (i210 & 896) | (i210 & 7168) | ((i25 >> 12) & 57344), 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z17);
                f15 = f17;
                f16 = f24;
                modifier3 = modifier4;
                z15 = z16;
                j15 = j19;
                j14 = j24;
            } else {
                c28655q.m87138X();
                j14 = j7;
                f15 = f13;
                f16 = f14;
                modifier3 = modifier2;
                z15 = z13;
                j15 = jM125426w;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.w
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC36596x.m117523m(modifier3, icon, descriptiveText, j14, j15, z15, f15, f16, onClick, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z13 = z4;
        i16 = i14 & 64;
        if (i16 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q.m87147d(f13)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i15 |= i17;
        }
        i18 = i14 & 128;
        if (i18 != 0) {
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87147d(f14)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i15 |= i19;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i26;
            }
            if ((i15 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -7169;
                    } else {
                        jM125430y = j7;
                    }
                    if ((i14 & 16) != 0) {
                        jM125426w = C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack();
                        i15 &= -57345;
                    }
                    if (i28 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f13;
                    }
                    if (i18 != 0) {
                        f18 = 1.0f;
                    } else {
                        f18 = f14;
                    }
                    i25 = i15;
                    z16 = z13;
                    j16 = jM125426w;
                    modifier4 = modifier2;
                    j17 = jM125430y;
                } else {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -7169;
                    } else {
                        jM125430y = j7;
                    }
                    if ((i14 & 16) != 0) {
                        jM125426w = C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack();
                        i15 &= -57345;
                    }
                    if (i28 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f13;
                    }
                    if (i18 != 0) {
                        f18 = 1.0f;
                    } else {
                        f18 = f14;
                    }
                    i25 = i15;
                    z16 = z13;
                    j16 = jM125426w;
                    modifier4 = modifier2;
                    j17 = jM125430y;
                }
                c28655q.m87175r();
                Modifier modifierM34565N3 = AbstractC12350b.m34565N(f17, AbstractC34132o.m107879c(f18, modifier4));
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                j18 = j17;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM34565N3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                C38072d c38072d3 = C38072d.f163053a;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(descriptiveText, c28655q, (i25 >> 6) & 14), null, c38072d3.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196090);
                f19 = 8;
                AbstractC18489d0.m53380u(2, f19, c2314t, c28655q);
                if (z16) {
                    c28655q.m87150e0(551454792);
                    final long j27 = j16;
                    j19 = j27;
                    m117525o(AbstractC37817c.m121344e(640663521, c28655q, new Function3() { // from class: vy0.v
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC36596x.m117522l(icon, j18, j27, onClick, (InterfaceC23001u) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q, 6);
                    c28655q.m87173q(false);
                    f24 = f18;
                    j24 = j18;
                    z17 = true;
                } else {
                    j19 = j16;
                    c28655q.m87150e0(551802116);
                    int i211 = i25 >> 3;
                    f24 = f18;
                    z17 = true;
                    j24 = j18;
                    m117524n(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 1 * f19, 0.0f, 11), icon, j24, j19, onClick, c28655q, (i25 & 112) | 6 | (i211 & 896) | (i211 & 7168) | ((i25 >> 12) & 57344), 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z17);
                f15 = f17;
                f16 = f24;
                modifier3 = modifier4;
                z15 = z16;
                j15 = j19;
                j14 = j24;
            } else {
                c28655q.m87138X();
                j14 = j7;
                f15 = f13;
                f16 = f14;
                modifier3 = modifier2;
                z15 = z13;
                j15 = jM125426w;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.w
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC36596x.m117523m(modifier3, icon, descriptiveText, j14, j15, z15, f15, f16, onClick, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 12582912;
        if ((i13 & 100663296) == 0) {
            if (c28655q.m87157i(onClick)) {
                i26 = 67108864;
            } else {
                i26 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 |= i26;
        }
        if ((i15 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28655q.m87140Z();
            i24 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 8) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -7169;
                } else {
                    jM125430y = j7;
                }
                if ((i14 & 16) != 0) {
                    jM125426w = C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack();
                    i15 &= -57345;
                }
                if (i28 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f13;
                }
                if (i18 != 0) {
                    f18 = 1.0f;
                } else {
                    f18 = f14;
                }
                i25 = i15;
                z16 = z13;
                j16 = jM125426w;
                modifier4 = modifier2;
                j17 = jM125430y;
            } else {
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 8) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -7169;
                } else {
                    jM125430y = j7;
                }
                if ((i14 & 16) != 0) {
                    jM125426w = C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack();
                    i15 &= -57345;
                }
                if (i28 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f13;
                }
                if (i18 != 0) {
                    f18 = 1.0f;
                } else {
                    f18 = f14;
                }
                i25 = i15;
                z16 = z13;
                j16 = jM125426w;
                modifier4 = modifier2;
                j17 = jM125430y;
            }
            c28655q.m87175r();
            Modifier modifierM34565N4 = AbstractC12350b.m34565N(f17, AbstractC34132o.m107879c(f18, modifier4));
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            j18 = j17;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM34565N4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            C38072d c38072d4 = C38072d.f163053a;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(descriptiveText, c28655q, (i25 >> 6) & 14), null, c38072d4.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196090);
            f19 = 8;
            AbstractC18489d0.m53380u(2, f19, c2314t, c28655q);
            if (z16) {
                c28655q.m87150e0(551454792);
                final long j28 = j16;
                j19 = j28;
                m117525o(AbstractC37817c.m121344e(640663521, c28655q, new Function3() { // from class: vy0.v
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC36596x.m117522l(icon, j18, j28, onClick, (InterfaceC23001u) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, 6);
                c28655q.m87173q(false);
                f24 = f18;
                j24 = j18;
                z17 = true;
            } else {
                j19 = j16;
                c28655q.m87150e0(551802116);
                int i212 = i25 >> 3;
                f24 = f18;
                z17 = true;
                j24 = j18;
                m117524n(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 1 * f19, 0.0f, 11), icon, j24, j19, onClick, c28655q, (i25 & 112) | 6 | (i212 & 896) | (i212 & 7168) | ((i25 >> 12) & 57344), 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z17);
            f15 = f17;
            f16 = f24;
            modifier3 = modifier4;
            z15 = z16;
            j15 = j19;
            j14 = j24;
        } else {
            c28655q.m87138X();
            j14 = j7;
            f15 = f13;
            f16 = f14;
            modifier3 = modifier2;
            z15 = z13;
            j15 = jM125426w;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.w
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC36596x.m117523m(modifier3, icon, descriptiveText, j14, j15, z15, f15, f16, onClick, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m117522l(C39274g c39274g, long j7, long j13, InterfaceC4339a interfaceC4339a, InterfaceC23001u FabGlowEffect, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(FabGlowEffect, "$this$FabGlowEffect");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(FabGlowEffect) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            m117524n(FabGlowEffect.mo3400a(C2314t.f9131w, C2299e.f9102E), c39274g, j7, j13, interfaceC4339a, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m117523m(Modifier modifier, C39274g c39274g, TextResource textResource, long j7, long j13, boolean z4, float f13, float f14, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m117521k(modifier, c39274g, textResource, j7, j13, z4, f13, f14, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m117524n(Modifier modifier, C39274g c39274g, long j7, long j13, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        long jM125430y;
        long jM125426w;
        C28655q c28655q;
        Modifier modifier3;
        long j14;
        long j15;
        int i16;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1650975442);
        int i17 = i14 & 1;
        if (i17 != 0) {
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
            i15 |= c28655q2.m87153g(c39274g) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                jM125430y = j7;
                int i18 = c28655q2.m87151f(jM125430y) ? 256 : 128;
                i15 |= i18;
            } else {
                jM125430y = j7;
            }
            i15 |= i18;
        } else {
            jM125430y = j7;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                jM125426w = j13;
                if (c28655q2.m87151f(jM125426w)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i16;
            } else {
                jM125426w = j13;
            }
            i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i16;
        } else {
            jM125426w = j13;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            c28655q2.m87140Z();
            if ((i13 & 1) == 0 || c28655q2.m87118C()) {
                modifier3 = i17 != 0 ? C2314t.f9131w : modifier2;
                if ((i14 & 4) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    jM125426w = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                    i15 &= -7169;
                }
            } else {
                c28655q2.m87138X();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
                modifier3 = modifier2;
            }
            long j16 = jM125426w;
            long j17 = jM125430y;
            c28655q2.m87175r();
            int i19 = i15 << 6;
            c28655q = c28655q2;
            AbstractC14961b3.m43085a(interfaceC4339a, AbstractC1102d.m3419p(12 * 4, modifier3), null, j17, j16, null, AbstractC37817c.m121344e(-1504453012, c28655q2, new C36587o(c39274g, 2)), c28655q, ((i15 >> 12) & 14) | 12582912 | (57344 & i19) | (i19 & 458752), 76);
            j14 = j17;
            j15 = j16;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            j14 = jM125430y;
            j15 = jM125426w;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4074m5(modifier3, c39274g, j14, j15, interfaceC4339a, i13, i14);
        }
    }

    /* JADX INFO: renamed from: o */
    private static final void m117525o(Function3 function3, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(638022576);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function3) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3419p = AbstractC1102d.m3419p(17 * 4, C2314t.f9131w);
            C33252i c33252i = AbstractC33253j.f138651a;
            C17909s c17909s = AbstractC17911t.f69612b;
            C38072d c38072d = C38072d.f163053a;
            Modifier modifierM3357b = AbstractC1092a.m3357b(modifierM3419p, C17909s.m51489g(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, 6).getBrandWhite()), new C17919x(c38072d.m121949b(c28655q, 6).getBrandWhite()), new C17919x(c38072d.m121949b(c28655q, 6).getBlack5())), 0L, 0.0f, 14), c33252i, 0.0f, 4);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3357b);
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
            function3.invoke(C1100b.f4583a, c28655q, Integer.valueOf(((i14 << 3) & 112) | 6));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3092j(function3, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m117526p(Function3 function3, int i13, Composer composer, int i14) {
        m117525o(function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m117527q(C39274g c39274g, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c39274g.getIcon(), c28655q, 6), AbstractC8693b.m21274h(c39274g.getContentDescription(), c28655q, 0), AbstractC1102d.m3419p(6 * 4, C2314t.f9131w), 0L, c28655q, 384, 8);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m117528r(Modifier modifier, C39274g c39274g, long j7, long j13, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m117524n(modifier, c39274g, j7, j13, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:106:0x0137  */
    /* JADX WARN: Code duplicated, block: B:108:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:112:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0181  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:123:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:134:0x0208  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:94:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    /* JADX INFO: renamed from: s */
    public static final void m117529s(Modifier modifier, final C39274g icon, long j7, long j13, boolean z4, C11421z1 c11421z1, Function1 function1, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        long jM125430y;
        long jM125426w;
        boolean z13;
        int i16;
        C11421z1 c11421z2;
        int i17;
        int i18;
        Function1 function2;
        int i19;
        boolean z14;
        C28655q c28655q;
        final Modifier modifier3;
        final long j14;
        final long j15;
        final boolean z15;
        final Function1 function3;
        final C11421z1 c11421z3;
        C28677v1 c28677v1M87180u;
        int i24;
        C28676v0 c28676v0;
        Modifier modifier4;
        Modifier modifier5;
        Object objM87133R;
        int i25;
        final Function1 function4;
        final long j16;
        final long j17;
        final C11421z1 c11421z4;
        long j18;
        long j19;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        int i26;
        AbstractC22676k.m65750j(icon, "icon");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1087110205);
        int i27 = i14 & 1;
        if (i27 != 0) {
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
            i15 |= c28655q2.m87153g(icon) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                jM125430y = j7;
                int i28 = c28655q2.m87151f(jM125430y) ? 256 : 128;
                i15 |= i28;
            } else {
                jM125430y = j7;
            }
            i15 |= i28;
        } else {
            jM125430y = j7;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                jM125426w = j13;
                if (c28655q2.m87151f(jM125426w)) {
                    i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i26;
            } else {
                jM125426w = j13;
            }
            i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i26;
        } else {
            jM125426w = j13;
        }
        int i29 = i14 & 16;
        if (i29 == 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    c11421z2 = c11421z1;
                    if (c28655q2.m87153g(c11421z2)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 64;
                if (i18 != 0) {
                    i15 |= 1572864;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(function2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i15 |= i19;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    c28655q2.m87140Z();
                    i24 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0 || c28655q2.m87118C()) {
                        if (i27 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if ((i14 & 4) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            jM125426w = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                            i15 &= -7169;
                        }
                        if (i29 != 0) {
                            z13 = false;
                        }
                        if (i16 != 0) {
                            c11421z2 = null;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C36478d(22);
                                c28655q2.m87172p0(objM87133R);
                            }
                            modifier5 = modifier4;
                            i25 = i15;
                            long j24 = jM125426w;
                            function4 = (Function1) objM87133R;
                            j16 = jM125430y;
                            j17 = j24;
                        } else {
                            modifier5 = modifier4;
                        }
                        c11421z4 = c11421z2;
                        c28655q2.m87175r();
                        if (z13) {
                            c28655q2.m87150e0(2047056423);
                            final Modifier modifier6 = modifier5;
                            j18 = j16;
                            j19 = j17;
                            function2 = function4;
                            c11421z2 = c11421z4;
                            m117525o(AbstractC37817c.m121344e(558820635, c28655q2, new Function3() { // from class: vy0.s
                                @Override // p715kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    return AbstractC36596x.m117531u(modifier6, icon, j16, j17, function4, c11421z4, (InterfaceC23001u) obj, (Composer) obj2, iIntValue);
                                }
                            }), c28655q2, 6);
                            c28655q2.m87173q(false);
                            c28655q = c28655q2;
                        } else {
                            j18 = j16;
                            j19 = j17;
                            function2 = function4;
                            c11421z2 = c11421z4;
                            c28655q2.m87150e0(2047440575);
                            float f13 = 1;
                            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC12889b.m36262a0(modifier5, f13 * 4, AbstractC33253j.f138651a, false, 0L, 0L, 28), 0.0f, 0.0f, f13 * 8, 0.0f, 11);
                            if ((3670016 & i25) == 1048576) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if ((458752 & i25) == 131072) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z16 | z17;
                            objM87133R2 = c28655q2.m87133R();
                            if (z18 || objM87133R2 == c28676v0) {
                                objM87133R2 = new C36592t(function2, c11421z2, 0);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            m117524n(modifierM3398t, icon, j18, j19, (InterfaceC4339a) objM87133R2, c28655q2, i25 & 8176, 0);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                        }
                        j15 = j19;
                        modifier3 = modifier5;
                        j14 = j18;
                    } else {
                        c28655q2.m87138X();
                        if ((i14 & 4) != 0) {
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                        }
                        modifier5 = modifier2;
                    }
                    i25 = i15;
                    j16 = jM125430y;
                    j17 = jM125426w;
                    function4 = function2;
                    c11421z4 = c11421z2;
                    c28655q2.m87175r();
                    if (z13) {
                        c28655q2.m87150e0(2047056423);
                        final Modifier modifier7 = modifier5;
                        j18 = j16;
                        j19 = j17;
                        function2 = function4;
                        c11421z2 = c11421z4;
                        m117525o(AbstractC37817c.m121344e(558820635, c28655q2, new Function3() { // from class: vy0.s
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC36596x.m117531u(modifier7, icon, j16, j17, function4, c11421z4, (InterfaceC23001u) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q2, 6);
                        c28655q2.m87173q(false);
                        c28655q = c28655q2;
                    } else {
                        j18 = j16;
                        j19 = j17;
                        function2 = function4;
                        c11421z2 = c11421z4;
                        c28655q2.m87150e0(2047440575);
                        float f14 = 1;
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC12889b.m36262a0(modifier5, f14 * 4, AbstractC33253j.f138651a, false, 0L, 0L, 28), 0.0f, 0.0f, f14 * 8, 0.0f, 11);
                        if ((3670016 & i25) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((458752 & i25) == 131072) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objM87133R2 = c28655q2.m87133R();
                        if (z18) {
                            objM87133R2 = new C36592t(function2, c11421z2, 0);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C36592t(function2, c11421z2, 0);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        m117524n(modifierM3398t2, icon, j18, j19, (InterfaceC4339a) objM87133R2, c28655q2, i25 & 8176, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    }
                    j15 = j19;
                    modifier3 = modifier5;
                    j14 = j18;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    j14 = jM125430y;
                    j15 = jM125426w;
                }
                z15 = z13;
                function3 = function2;
                c11421z3 = c11421z2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.u
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC36596x.m117534x(modifier3, icon, j14, j15, z15, c11421z3, function3, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            c11421z2 = c11421z1;
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
            }
            if ((i15 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c28655q2.m87140Z();
                i24 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i14 & 4) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        jM125426w = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                        i15 &= -7169;
                    }
                    if (i29 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        c11421z2 = null;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C36478d(22);
                            c28655q2.m87172p0(objM87133R);
                        }
                        modifier5 = modifier4;
                        i25 = i15;
                        long j25 = jM125426w;
                        function4 = (Function1) objM87133R;
                        j16 = jM125430y;
                        j17 = j25;
                    } else {
                        modifier5 = modifier4;
                        i25 = i15;
                        j16 = jM125430y;
                        j17 = jM125426w;
                        function4 = function2;
                    }
                } else {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i14 & 4) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        jM125426w = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                        i15 &= -7169;
                    }
                    if (i29 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        c11421z2 = null;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C36478d(22);
                            c28655q2.m87172p0(objM87133R);
                        }
                        modifier5 = modifier4;
                        i25 = i15;
                        long j26 = jM125426w;
                        function4 = (Function1) objM87133R;
                        j16 = jM125430y;
                        j17 = j26;
                    } else {
                        modifier5 = modifier4;
                        i25 = i15;
                        j16 = jM125430y;
                        j17 = jM125426w;
                        function4 = function2;
                    }
                }
                c11421z4 = c11421z2;
                c28655q2.m87175r();
                if (z13) {
                    c28655q2.m87150e0(2047056423);
                    final Modifier modifier8 = modifier5;
                    j18 = j16;
                    j19 = j17;
                    function2 = function4;
                    c11421z2 = c11421z4;
                    m117525o(AbstractC37817c.m121344e(558820635, c28655q2, new Function3() { // from class: vy0.s
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC36596x.m117531u(modifier8, icon, j16, j17, function4, c11421z4, (InterfaceC23001u) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q2, 6);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                } else {
                    j18 = j16;
                    j19 = j17;
                    function2 = function4;
                    c11421z2 = c11421z4;
                    c28655q2.m87150e0(2047440575);
                    float f15 = 1;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC12889b.m36262a0(modifier5, f15 * 4, AbstractC33253j.f138651a, false, 0L, 0L, 28), 0.0f, 0.0f, f15 * 8, 0.0f, 11);
                    if ((3670016 & i25) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((458752 & i25) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objM87133R2 = c28655q2.m87133R();
                    if (z18) {
                        objM87133R2 = new C36592t(function2, c11421z2, 0);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C36592t(function2, c11421z2, 0);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    m117524n(modifierM3398t3, icon, j18, j19, (InterfaceC4339a) objM87133R2, c28655q2, i25 & 8176, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                j15 = j19;
                modifier3 = modifier5;
                j14 = j18;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                j14 = jM125430y;
                j15 = jM125426w;
            }
            z15 = z13;
            function3 = function2;
            c11421z3 = c11421z2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.u
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC36596x.m117534x(modifier3, icon, j14, j15, z15, c11421z3, function3, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 24576;
        z13 = z4;
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                c11421z2 = c11421z1;
                if (c28655q2.m87153g(c11421z2)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
            }
            if ((i15 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c28655q2.m87140Z();
                i24 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i14 & 4) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        jM125426w = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                        i15 &= -7169;
                    }
                    if (i29 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        c11421z2 = null;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C36478d(22);
                            c28655q2.m87172p0(objM87133R);
                        }
                        modifier5 = modifier4;
                        i25 = i15;
                        long j27 = jM125426w;
                        function4 = (Function1) objM87133R;
                        j16 = jM125430y;
                        j17 = j27;
                    } else {
                        modifier5 = modifier4;
                        i25 = i15;
                        j16 = jM125430y;
                        j17 = jM125426w;
                        function4 = function2;
                    }
                } else {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i14 & 4) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        jM125426w = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                        i15 &= -7169;
                    }
                    if (i29 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        c11421z2 = null;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C36478d(22);
                            c28655q2.m87172p0(objM87133R);
                        }
                        modifier5 = modifier4;
                        i25 = i15;
                        long j28 = jM125426w;
                        function4 = (Function1) objM87133R;
                        j16 = jM125430y;
                        j17 = j28;
                    } else {
                        modifier5 = modifier4;
                        i25 = i15;
                        j16 = jM125430y;
                        j17 = jM125426w;
                        function4 = function2;
                    }
                }
                c11421z4 = c11421z2;
                c28655q2.m87175r();
                if (z13) {
                    c28655q2.m87150e0(2047056423);
                    final Modifier modifier9 = modifier5;
                    j18 = j16;
                    j19 = j17;
                    function2 = function4;
                    c11421z2 = c11421z4;
                    m117525o(AbstractC37817c.m121344e(558820635, c28655q2, new Function3() { // from class: vy0.s
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC36596x.m117531u(modifier9, icon, j16, j17, function4, c11421z4, (InterfaceC23001u) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q2, 6);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                } else {
                    j18 = j16;
                    j19 = j17;
                    function2 = function4;
                    c11421z2 = c11421z4;
                    c28655q2.m87150e0(2047440575);
                    float f16 = 1;
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC12889b.m36262a0(modifier5, f16 * 4, AbstractC33253j.f138651a, false, 0L, 0L, 28), 0.0f, 0.0f, f16 * 8, 0.0f, 11);
                    if ((3670016 & i25) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((458752 & i25) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objM87133R2 = c28655q2.m87133R();
                    if (z18) {
                        objM87133R2 = new C36592t(function2, c11421z2, 0);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C36592t(function2, c11421z2, 0);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    m117524n(modifierM3398t4, icon, j18, j19, (InterfaceC4339a) objM87133R2, c28655q2, i25 & 8176, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                j15 = j19;
                modifier3 = modifier5;
                j14 = j18;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                j14 = jM125430y;
                j15 = jM125426w;
            }
            z15 = z13;
            function3 = function2;
            c11421z3 = c11421z2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.u
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC36596x.m117534x(modifier3, icon, j14, j15, z15, c11421z3, function3, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        c11421z2 = c11421z1;
        i18 = i14 & 64;
        if (i18 != 0) {
            i15 |= 1572864;
            function2 = function1;
        } else {
            function2 = function1;
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
        }
        if ((i15 & 599187) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            c28655q2.m87140Z();
            i24 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                if (i27 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 4) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    jM125426w = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                    i15 &= -7169;
                }
                if (i29 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    c11421z2 = null;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C36478d(22);
                        c28655q2.m87172p0(objM87133R);
                    }
                    modifier5 = modifier4;
                    i25 = i15;
                    long j29 = jM125426w;
                    function4 = (Function1) objM87133R;
                    j16 = jM125430y;
                    j17 = j29;
                } else {
                    modifier5 = modifier4;
                    i25 = i15;
                    j16 = jM125430y;
                    j17 = jM125426w;
                    function4 = function2;
                }
            } else {
                if (i27 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 4) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    jM125426w = C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack();
                    i15 &= -7169;
                }
                if (i29 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    c11421z2 = null;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C36478d(22);
                        c28655q2.m87172p0(objM87133R);
                    }
                    modifier5 = modifier4;
                    i25 = i15;
                    long j210 = jM125426w;
                    function4 = (Function1) objM87133R;
                    j16 = jM125430y;
                    j17 = j210;
                } else {
                    modifier5 = modifier4;
                    i25 = i15;
                    j16 = jM125430y;
                    j17 = jM125426w;
                    function4 = function2;
                }
            }
            c11421z4 = c11421z2;
            c28655q2.m87175r();
            if (z13) {
                c28655q2.m87150e0(2047056423);
                final Modifier modifier10 = modifier5;
                j18 = j16;
                j19 = j17;
                function2 = function4;
                c11421z2 = c11421z4;
                m117525o(AbstractC37817c.m121344e(558820635, c28655q2, new Function3() { // from class: vy0.s
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC36596x.m117531u(modifier10, icon, j16, j17, function4, c11421z4, (InterfaceC23001u) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q2, 6);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                j18 = j16;
                j19 = j17;
                function2 = function4;
                c11421z2 = c11421z4;
                c28655q2.m87150e0(2047440575);
                float f17 = 1;
                Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC12889b.m36262a0(modifier5, f17 * 4, AbstractC33253j.f138651a, false, 0L, 0L, 28), 0.0f, 0.0f, f17 * 8, 0.0f, 11);
                if ((3670016 & i25) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((458752 & i25) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                objM87133R2 = c28655q2.m87133R();
                if (z18) {
                    objM87133R2 = new C36592t(function2, c11421z2, 0);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C36592t(function2, c11421z2, 0);
                    c28655q2.m87172p0(objM87133R2);
                }
                m117524n(modifierM3398t5, icon, j18, j19, (InterfaceC4339a) objM87133R2, c28655q2, i25 & 8176, 0);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            j15 = j19;
            modifier3 = modifier5;
            j14 = j18;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            j14 = jM125430y;
            j15 = jM125426w;
        }
        z15 = z13;
        function3 = function2;
        c11421z3 = c11421z2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.u
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC36596x.m117534x(modifier3, icon, j14, j15, z15, c11421z3, function3, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m117530t(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m117531u(Modifier modifier, C39274g c39274g, long j7, long j13, Function1 function1, C11421z1 c11421z1, InterfaceC23001u FabGlowEffect, Composer composer, int i13) {
        AbstractC22676k.m65750j(FabGlowEffect, "$this$FabGlowEffect");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(FabGlowEffect) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            Modifier modifierMo3400a = FabGlowEffect.mo3400a(modifier, C2299e.f9102E);
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(c11421z1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C36592t(function1, c11421z1, 1);
                c28655q.m87172p0(objM87133R);
            }
            m117524n(modifierMo3400a, c39274g, j7, j13, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m117532v(Function1 function1, C11421z1 c11421z1) {
        boolean z4 = false;
        if (c11421z1 != null && ((Boolean) c11421z1.f36630a.mo2428y0()).booleanValue()) {
            z4 = true;
        }
        function1.invoke(Boolean.valueOf(!z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m117533w(Function1 function1, C11421z1 c11421z1) {
        boolean z4 = false;
        if (c11421z1 != null && ((Boolean) c11421z1.f36630a.mo2428y0()).booleanValue()) {
            z4 = true;
        }
        function1.invoke(Boolean.valueOf(!z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m117534x(Modifier modifier, C39274g c39274g, long j7, long j13, boolean z4, C11421z1 c11421z1, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m117529s(modifier, c39274g, j7, j13, z4, c11421z1, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
