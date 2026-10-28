package wy0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import i91.AbstractC18247a;
import i91.AbstractC18254h;
import i91.AbstractC18255i;
import i91.C18251e;
import i91.C18253g;
import j93.AbstractC21478l0;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p014aj.C0929d;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: wy0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u001a\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ly3/f;", "radius", "", "fillPercent", "Li91/a;", "background", "strokeWidth", "", "showIndicator", "startAngle", "", "cap", "Lwy0/d;", "indicatorType", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V", "Lk2/e;", "Li91/h;", "strokeWidthPx", "Lh2/e;", "arcSize", "Lh2/b;", MapboxMap.QFE_OFFSET, "f", "(Lk2/e;FLi91/h;FJFIJ)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37692c {

    /* JADX INFO: renamed from: wy0.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f161513a;

        static {
            int[] iArr = new int[EnumC37693d.values().length];
            try {
                iArr[EnumC37693d.ARC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37693d.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f161513a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0146  */
    /* JADX WARN: Code duplicated, block: B:109:0x0149  */
    /* JADX WARN: Code duplicated, block: B:111:0x014d  */
    /* JADX WARN: Code duplicated, block: B:112:0x014f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:116:0x0155  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:120:0x015c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0161  */
    /* JADX WARN: Code duplicated, block: B:123:0x0168  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:127:0x01af  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01df  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:147:0x0205  */
    /* JADX WARN: Code duplicated, block: B:150:0x0214  */
    /* JADX WARN: Code duplicated, block: B:152:0x0218  */
    /* JADX WARN: Code duplicated, block: B:156:0x0242  */
    /* JADX WARN: Code duplicated, block: B:159:0x0252  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0111  */
    /* JADX WARN: Code duplicated, block: B:97:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
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
    public static final void m121117c(Modifier modifier, final float f13, final float f14, final AbstractC18247a background, float f15, boolean z4, float f16, int i13, EnumC37693d enumC37693d, Composer composer, final int i14, final int i15) {
        int i16;
        float f17;
        int i17;
        boolean z13;
        int i18;
        int i19;
        float f18;
        int i24;
        final int i25;
        int i26;
        int iOrdinal;
        int i27;
        boolean z14;
        final Modifier modifier2;
        final float f19;
        final float f24;
        final boolean z15;
        final EnumC37693d enumC37693d2;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        float f25;
        float f26;
        final EnumC37693d enumC37693d3;
        final float f27;
        final boolean z16;
        final long brandWhite;
        final float fMo743q0;
        final float fMo743q1;
        final float f28;
        final AbstractC18254h abstractC18254hM52584a;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean zM87151f;
        Object objM87133R;
        final int i28;
        AbstractC22676k.m65750j(background, "background");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-767790921);
        int i29 = i15 & 1;
        if (i29 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(modifier) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87147d(f14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87153g(background) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i34 = i15 & 16;
        if (i34 == 0) {
            if ((i14 & 24576) == 0) {
                f17 = f15;
                i16 |= c28655q.m87147d(f17) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 64;
                if (i19 != 0) {
                    i16 |= 1572864;
                    f18 = f16;
                } else {
                    f18 = f16;
                    if ((i14 & 1572864) == 0) {
                        if (c28655q.m87147d(f18)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i16 |= i24;
                    }
                }
                if ((i14 & 12582912) == 0) {
                    if ((i15 & 128) == 0) {
                        i25 = i13;
                        int i35 = c28655q.m87149e(i25) ? 8388608 : 4194304;
                        i16 |= i35;
                    } else {
                        i25 = i13;
                    }
                    i16 |= i35;
                } else {
                    i25 = i13;
                }
                i26 = i15 & 256;
                if (i26 != 0) {
                    i16 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (enumC37693d == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC37693d.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i27 = 67108864;
                    } else {
                        i27 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i27;
                }
                if ((38347923 & i16) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i14 & 1) != 0 || c28655q.m87118C()) {
                        if (i29 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i34 != 0) {
                            f25 = 6;
                        } else {
                            f25 = f17;
                        }
                        if (i17 != 0) {
                            z13 = false;
                        }
                        if (i19 != 0) {
                            f26 = 0.0f;
                        } else {
                            f26 = f18;
                        }
                        if ((i15 & 128) != 0) {
                            i16 &= -29360129;
                            i25 = 0;
                        }
                        if (i26 != 0) {
                            f27 = f26;
                            enumC37693d3 = EnumC37693d.ARC;
                        } else {
                            enumC37693d3 = enumC37693d;
                            f27 = f26;
                        }
                    } else {
                        c28655q.m87138X();
                        if ((i15 & 128) != 0) {
                            i16 &= -29360129;
                        }
                        modifier3 = modifier;
                        enumC37693d3 = enumC37693d;
                        f25 = f17;
                        f27 = f18;
                    }
                    z16 = z13;
                    c28655q.m87175r();
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    C28674u2 c28674u2 = AbstractC2453v1.f9569h;
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f25);
                    float f29 = 2;
                    fMo743q1 = (((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f13) * f29) - fMo743q0;
                    f28 = fMo743q0 / 2.0f;
                    abstractC18254hM52584a = AbstractC18255i.m52584a(background, c28655q, (i16 >> 9) & 14);
                    Modifier modifierM3419p = AbstractC1102d.m3419p(f29 * f13, modifier3);
                    Modifier modifier4 = modifier3;
                    if ((i16 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zM87153g = z17 | c28655q.m87153g(abstractC18254hM52584a) | c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1);
                    if ((3670016 & i16) == 1048576) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zM87147d = zM87153g | z18 | ((((29360128 & i16) ^ 12582912) <= 8388608 && c28655q.m87149e(i25)) || (i16 & 12582912) == 8388608) | c28655q.m87147d(f28);
                    if ((458752 & i16) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87151f = zM87147d | z19 | ((234881024 & i16) == 67108864) | c28655q.m87151f(brandWhite);
                    objM87133R = c28655q.m87133R();
                    if (!zM87151f || objM87133R == C28635l.f115821a) {
                        i28 = i25;
                        Function1 function1 = new Function1() { // from class: wy0.a
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC37692c.m121118d(f14, abstractC18254hM52584a, fMo743q0, fMo743q1, f27, i28, f28, z16, enumC37693d3, brandWhite, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function1);
                        objM87133R = function1;
                    } else {
                        i28 = i25;
                    }
                    AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R, c28655q, 0);
                    modifier2 = modifier4;
                    f19 = f25;
                    f24 = f27;
                    i25 = i28;
                    z15 = z16;
                    enumC37693d2 = enumC37693d3;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    f19 = f17;
                    f24 = f18;
                    z15 = z13;
                    enumC37693d2 = enumC37693d;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: wy0.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC37692c.m121119e(modifier2, f13, f14, background, f19, z15, f24, i25, enumC37693d2, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z13 = z4;
            i19 = i15 & 64;
            if (i19 != 0) {
                i16 |= 1572864;
                f18 = f16;
            } else {
                f18 = f16;
                if ((i14 & 1572864) == 0) {
                    if (c28655q.m87147d(f18)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
            }
            if ((i14 & 12582912) == 0) {
                if ((i15 & 128) == 0) {
                    i25 = i13;
                    if (c28655q.m87149e(i25)) {
                    }
                    i16 |= i35;
                } else {
                    i25 = i13;
                }
                i16 |= i35;
            } else {
                i25 = i13;
            }
            i26 = i15 & 256;
            if (i26 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (enumC37693d == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC37693d.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i27 = 67108864;
                } else {
                    i27 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i27;
            }
            if ((38347923 & i16) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i29 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i34 != 0) {
                        f25 = 6;
                    } else {
                        f25 = f17;
                    }
                    if (i17 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        f26 = 0.0f;
                    } else {
                        f26 = f18;
                    }
                    if ((i15 & 128) != 0) {
                        i16 &= -29360129;
                        i25 = 0;
                    }
                    if (i26 != 0) {
                        f27 = f26;
                        enumC37693d3 = EnumC37693d.ARC;
                    } else {
                        enumC37693d3 = enumC37693d;
                        f27 = f26;
                    }
                } else {
                    if (i29 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i34 != 0) {
                        f25 = 6;
                    } else {
                        f25 = f17;
                    }
                    if (i17 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        f26 = 0.0f;
                    } else {
                        f26 = f18;
                    }
                    if ((i15 & 128) != 0) {
                        i16 &= -29360129;
                        i25 = 0;
                    }
                    if (i26 != 0) {
                        f27 = f26;
                        enumC37693d3 = EnumC37693d.ARC;
                    } else {
                        enumC37693d3 = enumC37693d;
                        f27 = f26;
                    }
                }
                z16 = z13;
                c28655q.m87175r();
                brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                C28674u2 c28674u3 = AbstractC2453v1.f9569h;
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u3)).mo743q0(f25);
                float f210 = 2;
                fMo743q1 = (((InterfaceC39171c) c28655q.m87161k(c28674u3)).mo743q0(f13) * f210) - fMo743q0;
                f28 = fMo743q0 / 2.0f;
                abstractC18254hM52584a = AbstractC18255i.m52584a(background, c28655q, (i16 >> 9) & 14);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(f210 * f13, modifier3);
                Modifier modifier5 = modifier3;
                if ((i16 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zM87153g2 = z17 | c28655q.m87153g(abstractC18254hM52584a) | c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1);
                if ((3670016 & i16) == 1048576) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean zM87147d2 = zM87153g2 | z18 | ((((29360128 & i16) ^ 12582912) <= 8388608 && c28655q.m87149e(i25)) || (i16 & 12582912) == 8388608) | c28655q.m87147d(f28);
                if ((458752 & i16) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87151f = zM87147d2 | z19 | ((234881024 & i16) == 67108864) | c28655q.m87151f(brandWhite);
                objM87133R = c28655q.m87133R();
                if (zM87151f) {
                    i28 = i25;
                    Function1 function2 = new Function1() { // from class: wy0.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC37692c.m121118d(f14, abstractC18254hM52584a, fMo743q0, fMo743q1, f27, i28, f28, z16, enumC37693d3, brandWhite, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function2);
                    objM87133R = function2;
                } else {
                    i28 = i25;
                    Function1 function3 = new Function1() { // from class: wy0.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC37692c.m121118d(f14, abstractC18254hM52584a, fMo743q0, fMo743q1, f27, i28, f28, z16, enumC37693d3, brandWhite, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function3);
                    objM87133R = function3;
                }
                AbstractC21478l0.m60421a(modifierM3419p2, (Function1) objM87133R, c28655q, 0);
                modifier2 = modifier5;
                f19 = f25;
                f24 = f27;
                i25 = i28;
                z15 = z16;
                enumC37693d2 = enumC37693d3;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                f19 = f17;
                f24 = f18;
                z15 = z13;
                enumC37693d2 = enumC37693d;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: wy0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC37692c.m121119e(modifier2, f13, f14, background, f19, z15, f24, i25, enumC37693d2, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        f17 = f15;
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
            i19 = i15 & 64;
            if (i19 != 0) {
                i16 |= 1572864;
                f18 = f16;
            } else {
                f18 = f16;
                if ((i14 & 1572864) == 0) {
                    if (c28655q.m87147d(f18)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
            }
            if ((i14 & 12582912) == 0) {
                if ((i15 & 128) == 0) {
                    i25 = i13;
                    if (c28655q.m87149e(i25)) {
                    }
                    i16 |= i35;
                } else {
                    i25 = i13;
                }
                i16 |= i35;
            } else {
                i25 = i13;
            }
            i26 = i15 & 256;
            if (i26 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (enumC37693d == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC37693d.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i27 = 67108864;
                } else {
                    i27 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i27;
            }
            if ((38347923 & i16) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i29 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i34 != 0) {
                        f25 = 6;
                    } else {
                        f25 = f17;
                    }
                    if (i17 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        f26 = 0.0f;
                    } else {
                        f26 = f18;
                    }
                    if ((i15 & 128) != 0) {
                        i16 &= -29360129;
                        i25 = 0;
                    }
                    if (i26 != 0) {
                        f27 = f26;
                        enumC37693d3 = EnumC37693d.ARC;
                    } else {
                        enumC37693d3 = enumC37693d;
                        f27 = f26;
                    }
                } else {
                    if (i29 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i34 != 0) {
                        f25 = 6;
                    } else {
                        f25 = f17;
                    }
                    if (i17 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        f26 = 0.0f;
                    } else {
                        f26 = f18;
                    }
                    if ((i15 & 128) != 0) {
                        i16 &= -29360129;
                        i25 = 0;
                    }
                    if (i26 != 0) {
                        f27 = f26;
                        enumC37693d3 = EnumC37693d.ARC;
                    } else {
                        enumC37693d3 = enumC37693d;
                        f27 = f26;
                    }
                }
                z16 = z13;
                c28655q.m87175r();
                brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                C28674u2 c28674u4 = AbstractC2453v1.f9569h;
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u4)).mo743q0(f25);
                float f211 = 2;
                fMo743q1 = (((InterfaceC39171c) c28655q.m87161k(c28674u4)).mo743q0(f13) * f211) - fMo743q0;
                f28 = fMo743q0 / 2.0f;
                abstractC18254hM52584a = AbstractC18255i.m52584a(background, c28655q, (i16 >> 9) & 14);
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(f211 * f13, modifier3);
                Modifier modifier6 = modifier3;
                if ((i16 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zM87153g3 = z17 | c28655q.m87153g(abstractC18254hM52584a) | c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1);
                if ((3670016 & i16) == 1048576) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean zM87147d3 = zM87153g3 | z18 | ((((29360128 & i16) ^ 12582912) <= 8388608 && c28655q.m87149e(i25)) || (i16 & 12582912) == 8388608) | c28655q.m87147d(f28);
                if ((458752 & i16) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87151f = zM87147d3 | z19 | ((234881024 & i16) == 67108864) | c28655q.m87151f(brandWhite);
                objM87133R = c28655q.m87133R();
                if (zM87151f) {
                    i28 = i25;
                    Function1 function4 = new Function1() { // from class: wy0.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC37692c.m121118d(f14, abstractC18254hM52584a, fMo743q0, fMo743q1, f27, i28, f28, z16, enumC37693d3, brandWhite, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function4);
                    objM87133R = function4;
                } else {
                    i28 = i25;
                    Function1 function5 = new Function1() { // from class: wy0.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC37692c.m121118d(f14, abstractC18254hM52584a, fMo743q0, fMo743q1, f27, i28, f28, z16, enumC37693d3, brandWhite, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function5);
                    objM87133R = function5;
                }
                AbstractC21478l0.m60421a(modifierM3419p3, (Function1) objM87133R, c28655q, 0);
                modifier2 = modifier6;
                f19 = f25;
                f24 = f27;
                i25 = i28;
                z15 = z16;
                enumC37693d2 = enumC37693d3;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                f19 = f17;
                f24 = f18;
                z15 = z13;
                enumC37693d2 = enumC37693d;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: wy0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC37692c.m121119e(modifier2, f13, f14, background, f19, z15, f24, i25, enumC37693d2, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z13 = z4;
        i19 = i15 & 64;
        if (i19 != 0) {
            i16 |= 1572864;
            f18 = f16;
        } else {
            f18 = f16;
            if ((i14 & 1572864) == 0) {
                if (c28655q.m87147d(f18)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
        }
        if ((i14 & 12582912) == 0) {
            if ((i15 & 128) == 0) {
                i25 = i13;
                if (c28655q.m87149e(i25)) {
                }
                i16 |= i35;
            } else {
                i25 = i13;
            }
            i16 |= i35;
        } else {
            i25 = i13;
        }
        i26 = i15 & 256;
        if (i26 != 0) {
            i16 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (enumC37693d == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC37693d.ordinal();
            }
            if (c28655q.m87149e(iOrdinal)) {
                i27 = 67108864;
            } else {
                i27 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i27;
        }
        if ((38347923 & i16) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            c28655q.m87140Z();
            if ((i14 & 1) != 0) {
                if (i29 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i34 != 0) {
                    f25 = 6;
                } else {
                    f25 = f17;
                }
                if (i17 != 0) {
                    z13 = false;
                }
                if (i19 != 0) {
                    f26 = 0.0f;
                } else {
                    f26 = f18;
                }
                if ((i15 & 128) != 0) {
                    i16 &= -29360129;
                    i25 = 0;
                }
                if (i26 != 0) {
                    f27 = f26;
                    enumC37693d3 = EnumC37693d.ARC;
                } else {
                    enumC37693d3 = enumC37693d;
                    f27 = f26;
                }
            } else {
                if (i29 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i34 != 0) {
                    f25 = 6;
                } else {
                    f25 = f17;
                }
                if (i17 != 0) {
                    z13 = false;
                }
                if (i19 != 0) {
                    f26 = 0.0f;
                } else {
                    f26 = f18;
                }
                if ((i15 & 128) != 0) {
                    i16 &= -29360129;
                    i25 = 0;
                }
                if (i26 != 0) {
                    f27 = f26;
                    enumC37693d3 = EnumC37693d.ARC;
                } else {
                    enumC37693d3 = enumC37693d;
                    f27 = f26;
                }
            }
            z16 = z13;
            c28655q.m87175r();
            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
            C28674u2 c28674u5 = AbstractC2453v1.f9569h;
            fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u5)).mo743q0(f25);
            float f212 = 2;
            fMo743q1 = (((InterfaceC39171c) c28655q.m87161k(c28674u5)).mo743q0(f13) * f212) - fMo743q0;
            f28 = fMo743q0 / 2.0f;
            abstractC18254hM52584a = AbstractC18255i.m52584a(background, c28655q, (i16 >> 9) & 14);
            Modifier modifierM3419p4 = AbstractC1102d.m3419p(f212 * f13, modifier3);
            Modifier modifier7 = modifier3;
            if ((i16 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zM87153g4 = z17 | c28655q.m87153g(abstractC18254hM52584a) | c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1);
            if ((3670016 & i16) == 1048576) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean zM87147d4 = zM87153g4 | z18 | ((((29360128 & i16) ^ 12582912) <= 8388608 && c28655q.m87149e(i25)) || (i16 & 12582912) == 8388608) | c28655q.m87147d(f28);
            if ((458752 & i16) == 131072) {
                z19 = true;
            } else {
                z19 = false;
            }
            zM87151f = zM87147d4 | z19 | ((234881024 & i16) == 67108864) | c28655q.m87151f(brandWhite);
            objM87133R = c28655q.m87133R();
            if (zM87151f) {
                i28 = i25;
                Function1 function6 = new Function1() { // from class: wy0.a
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC37692c.m121118d(f14, abstractC18254hM52584a, fMo743q0, fMo743q1, f27, i28, f28, z16, enumC37693d3, brandWhite, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function6);
                objM87133R = function6;
            } else {
                i28 = i25;
                Function1 function7 = new Function1() { // from class: wy0.a
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC37692c.m121118d(f14, abstractC18254hM52584a, fMo743q0, fMo743q1, f27, i28, f28, z16, enumC37693d3, brandWhite, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function7);
                objM87133R = function7;
            }
            AbstractC21478l0.m60421a(modifierM3419p4, (Function1) objM87133R, c28655q, 0);
            modifier2 = modifier7;
            f19 = f25;
            f24 = f27;
            i25 = i28;
            z15 = z16;
            enumC37693d2 = enumC37693d3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            f19 = f17;
            f24 = f18;
            z15 = z13;
            enumC37693d2 = enumC37693d;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: wy0.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC37692c.m121119e(modifier2, f13, f14, background, f19, z15, f24, i25, enumC37693d2, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m121118d(float f13, AbstractC18254h abstractC18254h, float f14, float f15, float f16, int i13, float f17, boolean z4, EnumC37693d enumC37693d, long j7, InterfaceC22131e Canvas) {
        C22135i c22135i;
        float f18;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jMo721B0 = Canvas.mo721B0();
        C0237p c0237pMo744t0 = Canvas.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2358v(-90.0f, jMo721B0);
            m121120f(Canvas, f13, abstractC18254h, f14, (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), f16, i13, (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L));
            if (z4) {
                int i14 = a.f161513a[enumC37693d.ordinal()];
                if (i14 == 1) {
                    c22135i = new C22135i(f14, 0.0f, 0, 0, null, 26);
                    f18 = 3.0f;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c22135i = new C22135i(f14 - 5, 0.0f, 1, 0, null, 26);
                    f18 = 0.1f;
                }
                InterfaceC22131e.m63380P(Canvas, j7, f13 * 360.0f, f18, (((long) Float.floatToRawIntBits(f17)) & 4294967295L) | (Float.floatToRawIntBits(f17) << 32), (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32), 0.0f, c22135i, 832);
            }
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m121119e(Modifier modifier, float f13, float f14, AbstractC18247a abstractC18247a, float f15, boolean z4, float f16, int i13, EnumC37693d enumC37693d, int i14, int i15, Composer composer, int i16) {
        m121117c(modifier, f13, f14, abstractC18247a, f15, z4, f16, i13, enumC37693d, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final void m121120f(InterfaceC22131e interfaceC22131e, float f13, AbstractC18254h abstractC18254h, float f14, long j7, float f15, int i13, long j13) {
        if (abstractC18254h instanceof C18251e) {
            InterfaceC22131e.m63381X(interfaceC22131e, ((C18251e) abstractC18254h).getBrush(), f15, f13 * 360.0f, false, j13, j7, new C22135i(f14, 0.0f, i13, 0, null, 26), 0, 832);
        } else {
            if (!(abstractC18254h instanceof C18253g)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC22131e.m63380P(interfaceC22131e, ((C18253g) abstractC18254h).getColor(), f15, f13 * 360.0f, j13, j7, 0.0f, new C22135i(f14, 0.0f, i13, 0, null, 26), 832);
        }
    }
}
