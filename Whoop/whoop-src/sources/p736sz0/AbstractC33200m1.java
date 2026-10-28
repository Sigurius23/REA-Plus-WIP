package p736sz0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17808z1;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p163g1.C14980d0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sz0.m1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "icon", "Lcom/whoop/design/util/TextResource;", "stat", "Lsz0/g1;", "statTrend", "statTitle", "", "isPressed", "Li2/x;", "statValueTextColor", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33200m1 {
    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:101:0x014a  */
    /* JADX WARN: Code duplicated, block: B:104:0x015d  */
    /* JADX WARN: Code duplicated, block: B:106:0x016b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0175  */
    /* JADX WARN: Code duplicated, block: B:111:0x0185  */
    /* JADX WARN: Code duplicated, block: B:114:0x0260  */
    /* JADX WARN: Code duplicated, block: B:116:0x026d  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public static final void m105252b(Modifier modifier, Integer num, TextResource stat, C33182g1 c33182g1, TextResource statTitle, boolean z4, long j7, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Integer num2;
        int i16;
        C33182g1 c33182g2;
        int i17;
        int i18;
        boolean z13;
        int i19;
        long brandWhite;
        boolean z14;
        Modifier modifier3;
        Integer num3;
        C33182g1 c33182g3;
        boolean z15;
        long j13;
        C28677v1 c28677v1M87180u;
        int i24;
        C2314t c2314t;
        C33182g1 c33182g4;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i25;
        float f13;
        int i26;
        boolean z17;
        int i27;
        int i28;
        AbstractC22676k.m65750j(stat, "stat");
        AbstractC22676k.m65750j(statTitle, "statTitle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(318637395);
        int i29 = i14 & 1;
        if (i29 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i34 = i14 & 2;
        if (i34 == 0) {
            if ((i13 & 48) == 0) {
                num2 = num;
                i15 |= c28655q.m87153g(num2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87153g(stat)) {
                    i28 = 256;
                } else {
                    i28 = 128;
                }
                i15 |= i28;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    c33182g2 = c33182g1;
                    if (c28655q.m87153g(c33182g2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87153g(statTitle)) {
                        i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i27;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        z13 = z4;
                        if (c28655q.m87155h(z13)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    if ((1572864 & i13) == 0) {
                        if ((i14 & 64) == 0) {
                            brandWhite = j7;
                            int i35 = c28655q.m87151f(brandWhite) ? 1048576 : 524288;
                            i15 |= i35;
                        } else {
                            brandWhite = j7;
                        }
                        i15 |= i35;
                    } else {
                        brandWhite = j7;
                    }
                    if ((i15 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        c28655q.m87140Z();
                        i24 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i24 != 0 || c28655q.m87118C()) {
                            if (i29 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i34 != 0) {
                                num2 = null;
                            }
                            if (i16 != 0) {
                                c33182g2 = null;
                            }
                            if (i18 != 0) {
                                z13 = false;
                            }
                            if ((i14 & 64) != 0) {
                                brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                                i15 &= -3670017;
                            }
                        } else {
                            c28655q.m87138X();
                            if ((i14 & 64) != 0) {
                                i15 &= -3670017;
                            }
                        }
                        int i36 = i15;
                        c33182g4 = c33182g2;
                        z16 = z13;
                        long j14 = brandWhite;
                        c28655q.m87175r();
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        if (num2 == null) {
                            c28655q.m87150e0(1302897282);
                            c28655q.m87173q(false);
                            i25 = 6;
                        } else {
                            c28655q.m87150e0(1302897283);
                            i25 = 6;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num2.intValue(), c28655q, 6), null, AbstractC1102d.m3419p(5 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                            c28655q.m87173q(false);
                        }
                        f13 = 4;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                        int i37 = i36 >> 12;
                        String strM21274h = AbstractC8693b.m21274h(statTitle, c28655q, i37 & 14);
                        C38072d c38072d = C38072d.f163053a;
                        Modifier modifier4 = modifier2;
                        AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i25).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getSh5(), null, c28655q, 0, 0, 196602);
                        i26 = i36 >> i25;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(stat, c28655q, i26 & 14), null, j14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getN4(), null, c28655q, i37 & 896, 0, 196602);
                        c28655q = c28655q;
                        if (c33182g4 == 0) {
                            c28655q.m87150e0(1303549863);
                            c28655q.m87173q(false);
                            z17 = z16;
                        } else {
                            AbstractC31061c.m95623C(c28655q, 1303549864, c2314t, f13, c28655q);
                            z17 = z16;
                            AbstractC17808z1.m51177e(c33182g4.getTrendText(), true, c33182g4.getTrendType(), z17, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, (i26 & 7168) | 48, 0, 32752);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c33182g3 = c33182g4;
                        num3 = num2;
                        z15 = z17;
                        j13 = j14;
                        modifier3 = modifier4;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        num3 = num2;
                        c33182g3 = c33182g2;
                        z15 = z13;
                        j13 = brandWhite;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C14980d0(modifier3, num3, stat, c33182g3, statTitle, z15, j13, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z13 = z4;
                if ((1572864 & i13) == 0) {
                    if ((i14 & 64) == 0) {
                        brandWhite = j7;
                        if (c28655q.m87151f(brandWhite)) {
                        }
                        i15 |= i35;
                    } else {
                        brandWhite = j7;
                    }
                    i15 |= i35;
                } else {
                    brandWhite = j7;
                }
                if ((i15 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        if (i29 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i34 != 0) {
                            num2 = null;
                        }
                        if (i16 != 0) {
                            c33182g2 = null;
                        }
                        if (i18 != 0) {
                            z13 = false;
                        }
                        if ((i14 & 64) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -3670017;
                        }
                    } else {
                        if (i29 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i34 != 0) {
                            num2 = null;
                        }
                        if (i16 != 0) {
                            c33182g2 = null;
                        }
                        if (i18 != 0) {
                            z13 = false;
                        }
                        if ((i14 & 64) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -3670017;
                        }
                    }
                    int i38 = i15;
                    c33182g4 = c33182g2;
                    z16 = z13;
                    long j15 = brandWhite;
                    c28655q.m87175r();
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    if (num2 == null) {
                        c28655q.m87150e0(1302897282);
                        c28655q.m87173q(false);
                        i25 = 6;
                    } else {
                        c28655q.m87150e0(1302897283);
                        i25 = 6;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num2.intValue(), c28655q, 6), null, AbstractC1102d.m3419p(5 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    }
                    f13 = 4;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                    int i39 = i38 >> 12;
                    String strM21274h2 = AbstractC8693b.m21274h(statTitle, c28655q, i39 & 14);
                    C38072d c38072d2 = C38072d.f163053a;
                    Modifier modifier5 = modifier2;
                    AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, i25).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i25).getSh5(), null, c28655q, 0, 0, 196602);
                    i26 = i38 >> i25;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(stat, c28655q, i26 & 14), null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i25).getN4(), null, c28655q, i39 & 896, 0, 196602);
                    c28655q = c28655q;
                    if (c33182g4 == 0) {
                        c28655q.m87150e0(1303549863);
                        c28655q.m87173q(false);
                        z17 = z16;
                    } else {
                        AbstractC31061c.m95623C(c28655q, 1303549864, c2314t, f13, c28655q);
                        z17 = z16;
                        AbstractC17808z1.m51177e(c33182g4.getTrendText(), true, c33182g4.getTrendType(), z17, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, (i26 & 7168) | 48, 0, 32752);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c33182g3 = c33182g4;
                    num3 = num2;
                    z15 = z17;
                    j13 = j15;
                    modifier3 = modifier5;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    num3 = num2;
                    c33182g3 = c33182g2;
                    z15 = z13;
                    j13 = brandWhite;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14980d0(modifier3, num3, stat, c33182g3, statTitle, z15, j13, i13, i14);
                }
            }
            i15 |= 3072;
            c33182g2 = c33182g1;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87153g(statTitle)) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i27;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((1572864 & i13) == 0) {
                    if ((i14 & 64) == 0) {
                        brandWhite = j7;
                        if (c28655q.m87151f(brandWhite)) {
                        }
                        i15 |= i35;
                    } else {
                        brandWhite = j7;
                    }
                    i15 |= i35;
                } else {
                    brandWhite = j7;
                }
                if ((i15 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        if (i29 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i34 != 0) {
                            num2 = null;
                        }
                        if (i16 != 0) {
                            c33182g2 = null;
                        }
                        if (i18 != 0) {
                            z13 = false;
                        }
                        if ((i14 & 64) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -3670017;
                        }
                    } else {
                        if (i29 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i34 != 0) {
                            num2 = null;
                        }
                        if (i16 != 0) {
                            c33182g2 = null;
                        }
                        if (i18 != 0) {
                            z13 = false;
                        }
                        if ((i14 & 64) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -3670017;
                        }
                    }
                    int i310 = i15;
                    c33182g4 = c33182g2;
                    z16 = z13;
                    long j16 = brandWhite;
                    c28655q.m87175r();
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    if (num2 == null) {
                        c28655q.m87150e0(1302897282);
                        c28655q.m87173q(false);
                        i25 = 6;
                    } else {
                        c28655q.m87150e0(1302897283);
                        i25 = 6;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num2.intValue(), c28655q, 6), null, AbstractC1102d.m3419p(5 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    }
                    f13 = 4;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                    int i311 = i310 >> 12;
                    String strM21274h3 = AbstractC8693b.m21274h(statTitle, c28655q, i311 & 14);
                    C38072d c38072d3 = C38072d.f163053a;
                    Modifier modifier6 = modifier2;
                    AbstractC30795n.m94707h(strM21274h3, null, c38072d3.m121949b(c28655q, i25).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i25).getSh5(), null, c28655q, 0, 0, 196602);
                    i26 = i310 >> i25;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(stat, c28655q, i26 & 14), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i25).getN4(), null, c28655q, i311 & 896, 0, 196602);
                    c28655q = c28655q;
                    if (c33182g4 == 0) {
                        c28655q.m87150e0(1303549863);
                        c28655q.m87173q(false);
                        z17 = z16;
                    } else {
                        AbstractC31061c.m95623C(c28655q, 1303549864, c2314t, f13, c28655q);
                        z17 = z16;
                        AbstractC17808z1.m51177e(c33182g4.getTrendText(), true, c33182g4.getTrendType(), z17, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, (i26 & 7168) | 48, 0, 32752);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c33182g3 = c33182g4;
                    num3 = num2;
                    z15 = z17;
                    j13 = j16;
                    modifier3 = modifier6;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    num3 = num2;
                    c33182g3 = c33182g2;
                    z15 = z13;
                    j13 = brandWhite;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14980d0(modifier3, num3, stat, c33182g3, statTitle, z15, j13, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z13 = z4;
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) == 0) {
                    brandWhite = j7;
                    if (c28655q.m87151f(brandWhite)) {
                    }
                    i15 |= i35;
                } else {
                    brandWhite = j7;
                }
                i15 |= i35;
            } else {
                brandWhite = j7;
            }
            if ((i15 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i34 != 0) {
                        num2 = null;
                    }
                    if (i16 != 0) {
                        c33182g2 = null;
                    }
                    if (i18 != 0) {
                        z13 = false;
                    }
                    if ((i14 & 64) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -3670017;
                    }
                } else {
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i34 != 0) {
                        num2 = null;
                    }
                    if (i16 != 0) {
                        c33182g2 = null;
                    }
                    if (i18 != 0) {
                        z13 = false;
                    }
                    if ((i14 & 64) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -3670017;
                    }
                }
                int i312 = i15;
                c33182g4 = c33182g2;
                z16 = z13;
                long j17 = brandWhite;
                c28655q.m87175r();
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                if (num2 == null) {
                    c28655q.m87150e0(1302897282);
                    c28655q.m87173q(false);
                    i25 = 6;
                } else {
                    c28655q.m87150e0(1302897283);
                    i25 = 6;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num2.intValue(), c28655q, 6), null, AbstractC1102d.m3419p(5 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                }
                f13 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                int i313 = i312 >> 12;
                String strM21274h4 = AbstractC8693b.m21274h(statTitle, c28655q, i313 & 14);
                C38072d c38072d4 = C38072d.f163053a;
                Modifier modifier7 = modifier2;
                AbstractC30795n.m94707h(strM21274h4, null, c38072d4.m121949b(c28655q, i25).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i25).getSh5(), null, c28655q, 0, 0, 196602);
                i26 = i312 >> i25;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(stat, c28655q, i26 & 14), null, j17, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i25).getN4(), null, c28655q, i313 & 896, 0, 196602);
                c28655q = c28655q;
                if (c33182g4 == 0) {
                    c28655q.m87150e0(1303549863);
                    c28655q.m87173q(false);
                    z17 = z16;
                } else {
                    AbstractC31061c.m95623C(c28655q, 1303549864, c2314t, f13, c28655q);
                    z17 = z16;
                    AbstractC17808z1.m51177e(c33182g4.getTrendText(), true, c33182g4.getTrendType(), z17, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, (i26 & 7168) | 48, 0, 32752);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c33182g3 = c33182g4;
                num3 = num2;
                z15 = z17;
                j13 = j17;
                modifier3 = modifier7;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                num3 = num2;
                c33182g3 = c33182g2;
                z15 = z13;
                j13 = brandWhite;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14980d0(modifier3, num3, stat, c33182g3, statTitle, z15, j13, i13, i14);
            }
        }
        i15 |= 48;
        num2 = num;
        if ((i13 & 384) == 0) {
            if (c28655q.m87153g(stat)) {
                i28 = 256;
            } else {
                i28 = 128;
            }
            i15 |= i28;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                c33182g2 = c33182g1;
                if (c28655q.m87153g(c33182g2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87153g(statTitle)) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i27;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((1572864 & i13) == 0) {
                    if ((i14 & 64) == 0) {
                        brandWhite = j7;
                        if (c28655q.m87151f(brandWhite)) {
                        }
                        i15 |= i35;
                    } else {
                        brandWhite = j7;
                    }
                    i15 |= i35;
                } else {
                    brandWhite = j7;
                }
                if ((i15 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        if (i29 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i34 != 0) {
                            num2 = null;
                        }
                        if (i16 != 0) {
                            c33182g2 = null;
                        }
                        if (i18 != 0) {
                            z13 = false;
                        }
                        if ((i14 & 64) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -3670017;
                        }
                    } else {
                        if (i29 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i34 != 0) {
                            num2 = null;
                        }
                        if (i16 != 0) {
                            c33182g2 = null;
                        }
                        if (i18 != 0) {
                            z13 = false;
                        }
                        if ((i14 & 64) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -3670017;
                        }
                    }
                    int i314 = i15;
                    c33182g4 = c33182g2;
                    z16 = z13;
                    long j18 = brandWhite;
                    c28655q.m87175r();
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    if (num2 == null) {
                        c28655q.m87150e0(1302897282);
                        c28655q.m87173q(false);
                        i25 = 6;
                    } else {
                        c28655q.m87150e0(1302897283);
                        i25 = 6;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num2.intValue(), c28655q, 6), null, AbstractC1102d.m3419p(5 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    }
                    f13 = 4;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                    int i315 = i314 >> 12;
                    String strM21274h5 = AbstractC8693b.m21274h(statTitle, c28655q, i315 & 14);
                    C38072d c38072d5 = C38072d.f163053a;
                    Modifier modifier8 = modifier2;
                    AbstractC30795n.m94707h(strM21274h5, null, c38072d5.m121949b(c28655q, i25).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, i25).getSh5(), null, c28655q, 0, 0, 196602);
                    i26 = i314 >> i25;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(stat, c28655q, i26 & 14), null, j18, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, i25).getN4(), null, c28655q, i315 & 896, 0, 196602);
                    c28655q = c28655q;
                    if (c33182g4 == 0) {
                        c28655q.m87150e0(1303549863);
                        c28655q.m87173q(false);
                        z17 = z16;
                    } else {
                        AbstractC31061c.m95623C(c28655q, 1303549864, c2314t, f13, c28655q);
                        z17 = z16;
                        AbstractC17808z1.m51177e(c33182g4.getTrendText(), true, c33182g4.getTrendType(), z17, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, (i26 & 7168) | 48, 0, 32752);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c33182g3 = c33182g4;
                    num3 = num2;
                    z15 = z17;
                    j13 = j18;
                    modifier3 = modifier8;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    num3 = num2;
                    c33182g3 = c33182g2;
                    z15 = z13;
                    j13 = brandWhite;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14980d0(modifier3, num3, stat, c33182g3, statTitle, z15, j13, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z13 = z4;
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) == 0) {
                    brandWhite = j7;
                    if (c28655q.m87151f(brandWhite)) {
                    }
                    i15 |= i35;
                } else {
                    brandWhite = j7;
                }
                i15 |= i35;
            } else {
                brandWhite = j7;
            }
            if ((i15 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i34 != 0) {
                        num2 = null;
                    }
                    if (i16 != 0) {
                        c33182g2 = null;
                    }
                    if (i18 != 0) {
                        z13 = false;
                    }
                    if ((i14 & 64) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -3670017;
                    }
                } else {
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i34 != 0) {
                        num2 = null;
                    }
                    if (i16 != 0) {
                        c33182g2 = null;
                    }
                    if (i18 != 0) {
                        z13 = false;
                    }
                    if ((i14 & 64) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -3670017;
                    }
                }
                int i316 = i15;
                c33182g4 = c33182g2;
                z16 = z13;
                long j19 = brandWhite;
                c28655q.m87175r();
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                if (num2 == null) {
                    c28655q.m87150e0(1302897282);
                    c28655q.m87173q(false);
                    i25 = 6;
                } else {
                    c28655q.m87150e0(1302897283);
                    i25 = 6;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num2.intValue(), c28655q, 6), null, AbstractC1102d.m3419p(5 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                }
                f13 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                int i317 = i316 >> 12;
                String strM21274h6 = AbstractC8693b.m21274h(statTitle, c28655q, i317 & 14);
                C38072d c38072d6 = C38072d.f163053a;
                Modifier modifier9 = modifier2;
                AbstractC30795n.m94707h(strM21274h6, null, c38072d6.m121949b(c28655q, i25).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q, i25).getSh5(), null, c28655q, 0, 0, 196602);
                i26 = i316 >> i25;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(stat, c28655q, i26 & 14), null, j19, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q, i25).getN4(), null, c28655q, i317 & 896, 0, 196602);
                c28655q = c28655q;
                if (c33182g4 == 0) {
                    c28655q.m87150e0(1303549863);
                    c28655q.m87173q(false);
                    z17 = z16;
                } else {
                    AbstractC31061c.m95623C(c28655q, 1303549864, c2314t, f13, c28655q);
                    z17 = z16;
                    AbstractC17808z1.m51177e(c33182g4.getTrendText(), true, c33182g4.getTrendType(), z17, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, (i26 & 7168) | 48, 0, 32752);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c33182g3 = c33182g4;
                num3 = num2;
                z15 = z17;
                j13 = j19;
                modifier3 = modifier9;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                num3 = num2;
                c33182g3 = c33182g2;
                z15 = z13;
                j13 = brandWhite;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14980d0(modifier3, num3, stat, c33182g3, statTitle, z15, j13, i13, i14);
            }
        }
        i15 |= 3072;
        c33182g2 = c33182g1;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87153g(statTitle)) {
                i27 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i27 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i27;
        }
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) == 0) {
                    brandWhite = j7;
                    if (c28655q.m87151f(brandWhite)) {
                    }
                    i15 |= i35;
                } else {
                    brandWhite = j7;
                }
                i15 |= i35;
            } else {
                brandWhite = j7;
            }
            if ((i15 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i34 != 0) {
                        num2 = null;
                    }
                    if (i16 != 0) {
                        c33182g2 = null;
                    }
                    if (i18 != 0) {
                        z13 = false;
                    }
                    if ((i14 & 64) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -3670017;
                    }
                } else {
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i34 != 0) {
                        num2 = null;
                    }
                    if (i16 != 0) {
                        c33182g2 = null;
                    }
                    if (i18 != 0) {
                        z13 = false;
                    }
                    if ((i14 & 64) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -3670017;
                    }
                }
                int i318 = i15;
                c33182g4 = c33182g2;
                z16 = z13;
                long j110 = brandWhite;
                c28655q.m87175r();
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                if (num2 == null) {
                    c28655q.m87150e0(1302897282);
                    c28655q.m87173q(false);
                    i25 = 6;
                } else {
                    c28655q.m87150e0(1302897283);
                    i25 = 6;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num2.intValue(), c28655q, 6), null, AbstractC1102d.m3419p(5 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                }
                f13 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                int i319 = i318 >> 12;
                String strM21274h7 = AbstractC8693b.m21274h(statTitle, c28655q, i319 & 14);
                C38072d c38072d7 = C38072d.f163053a;
                Modifier modifier10 = modifier2;
                AbstractC30795n.m94707h(strM21274h7, null, c38072d7.m121949b(c28655q, i25).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, i25).getSh5(), null, c28655q, 0, 0, 196602);
                i26 = i318 >> i25;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(stat, c28655q, i26 & 14), null, j110, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, i25).getN4(), null, c28655q, i319 & 896, 0, 196602);
                c28655q = c28655q;
                if (c33182g4 == 0) {
                    c28655q.m87150e0(1303549863);
                    c28655q.m87173q(false);
                    z17 = z16;
                } else {
                    AbstractC31061c.m95623C(c28655q, 1303549864, c2314t, f13, c28655q);
                    z17 = z16;
                    AbstractC17808z1.m51177e(c33182g4.getTrendText(), true, c33182g4.getTrendType(), z17, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, (i26 & 7168) | 48, 0, 32752);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c33182g3 = c33182g4;
                num3 = num2;
                z15 = z17;
                j13 = j110;
                modifier3 = modifier10;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                num3 = num2;
                c33182g3 = c33182g2;
                z15 = z13;
                j13 = brandWhite;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14980d0(modifier3, num3, stat, c33182g3, statTitle, z15, j13, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z13 = z4;
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) == 0) {
                brandWhite = j7;
                if (c28655q.m87151f(brandWhite)) {
                }
                i15 |= i35;
            } else {
                brandWhite = j7;
            }
            i15 |= i35;
        } else {
            brandWhite = j7;
        }
        if ((i15 & 599187) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28655q.m87140Z();
            i24 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                if (i34 != 0) {
                    num2 = null;
                }
                if (i16 != 0) {
                    c33182g2 = null;
                }
                if (i18 != 0) {
                    z13 = false;
                }
                if ((i14 & 64) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -3670017;
                }
            } else {
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                if (i34 != 0) {
                    num2 = null;
                }
                if (i16 != 0) {
                    c33182g2 = null;
                }
                if (i18 != 0) {
                    z13 = false;
                }
                if ((i14 & 64) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -3670017;
                }
            }
            int i3110 = i15;
            c33182g4 = c33182g2;
            z16 = z13;
            long j111 = brandWhite;
            c28655q.m87175r();
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            if (num2 == null) {
                c28655q.m87150e0(1302897282);
                c28655q.m87173q(false);
                i25 = 6;
            } else {
                c28655q.m87150e0(1302897283);
                i25 = 6;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num2.intValue(), c28655q, 6), null, AbstractC1102d.m3419p(5 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            f13 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            int i3111 = i3110 >> 12;
            String strM21274h8 = AbstractC8693b.m21274h(statTitle, c28655q, i3111 & 14);
            C38072d c38072d8 = C38072d.f163053a;
            Modifier modifier11 = modifier2;
            AbstractC30795n.m94707h(strM21274h8, null, c38072d8.m121949b(c28655q, i25).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q, i25).getSh5(), null, c28655q, 0, 0, 196602);
            i26 = i3110 >> i25;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(stat, c28655q, i26 & 14), null, j111, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q, i25).getN4(), null, c28655q, i3111 & 896, 0, 196602);
            c28655q = c28655q;
            if (c33182g4 == 0) {
                c28655q.m87150e0(1303549863);
                c28655q.m87173q(false);
                z17 = z16;
            } else {
                AbstractC31061c.m95623C(c28655q, 1303549864, c2314t, f13, c28655q);
                z17 = z16;
                AbstractC17808z1.m51177e(c33182g4.getTrendText(), true, c33182g4.getTrendType(), z17, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, (i26 & 7168) | 48, 0, 32752);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c33182g3 = c33182g4;
            num3 = num2;
            z15 = z17;
            j13 = j111;
            modifier3 = modifier11;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            num3 = num2;
            c33182g3 = c33182g2;
            z15 = z13;
            j13 = brandWhite;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14980d0(modifier3, num3, stat, c33182g3, statTitle, z15, j13, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m105253c(Modifier modifier, Integer num, TextResource textResource, C33182g1 c33182g1, TextResource textResource2, boolean z4, long j7, int i13, int i14, Composer composer, int i15) {
        m105252b(modifier, num, textResource, c33182g1, textResource2, z4, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
