package sy0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import g40.C15375j3;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p163g1.AbstractC14959b1;
import p163g1.AbstractC15027h3;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r51.C30936d;
import x81.C38072d;

/* JADX INFO: renamed from: sy0.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\r\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"", "initialToggle", "Lcom/whoop/design/util/TextResource;", "contentDescription", "Lkotlin/Function1;", "Ll83/a0;", "onToggle", "Landroidx/compose/ui/Modifier;", "modifier", "isEnabled", "localMinimumInteractiveComponentEnforcement", "Li2/x;", "checkedColor", "d", "(ZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZJLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33092o {
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0137  */
    /* JADX WARN: Code duplicated, block: B:97:0x0144  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m104843d(final boolean z4, final TextResource contentDescription, final Function1 onToggle, Modifier modifier, boolean z13, boolean z14, long j7, Composer composer, final int i13, final int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z15;
        int i17;
        int i18;
        boolean z16;
        int i19;
        long brandWhite;
        boolean z17;
        final Modifier modifier3;
        final boolean z18;
        final long j13;
        final boolean z19;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1583931603);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(contentDescription) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onToggle) ? 256 : 128;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        z16 = z14;
                        if (c28655q.m87155h(z16)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    if ((1572864 & i13) == 0) {
                        if ((i14 & 64) == 0) {
                            brandWhite = j7;
                            int i25 = c28655q.m87151f(brandWhite) ? 1048576 : 524288;
                            i15 |= i25;
                        } else {
                            brandWhite = j7;
                        }
                        i15 |= i25;
                    } else {
                        brandWhite = j7;
                    }
                    if ((599187 & i15) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z17)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0 || c28655q.m87118C()) {
                            if (i24 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if (i16 != 0) {
                                z15 = true;
                            }
                            if (i18 != 0) {
                                z16 = false;
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
                        modifier3 = modifier2;
                        boolean z24 = z15;
                        long j14 = brandWhite;
                        c28655q.m87175r();
                        AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z16)), AbstractC37817c.m121344e(-641580013, c28655q, new C15375j3(modifier3, AbstractC8693b.m21274h(contentDescription, c28655q, (i15 >> 3) & 14), j14, z4, onToggle, z24)), c28655q, 56);
                        j13 = j14;
                        z18 = z24;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        z18 = z15;
                        j13 = brandWhite;
                    }
                    z19 = z16;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.n
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC33092o.m104846g(z4, contentDescription, onToggle, modifier3, z18, z19, j13, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z16 = z14;
                if ((1572864 & i13) == 0) {
                    if ((i14 & 64) == 0) {
                        brandWhite = j7;
                        if (c28655q.m87151f(brandWhite)) {
                        }
                        i15 |= i25;
                    } else {
                        brandWhite = j7;
                    }
                    i15 |= i25;
                } else {
                    brandWhite = j7;
                }
                if ((599187 & i15) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q.m87135U(i15 & 1, z17)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            z15 = true;
                        }
                        if (i18 != 0) {
                            z16 = false;
                        }
                        if ((i14 & 64) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -3670017;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            z15 = true;
                        }
                        if (i18 != 0) {
                            z16 = false;
                        }
                        if ((i14 & 64) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -3670017;
                        }
                    }
                    modifier3 = modifier2;
                    boolean z25 = z15;
                    long j15 = brandWhite;
                    c28655q.m87175r();
                    AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z16)), AbstractC37817c.m121344e(-641580013, c28655q, new C15375j3(modifier3, AbstractC8693b.m21274h(contentDescription, c28655q, (i15 >> 3) & 14), j15, z4, onToggle, z25)), c28655q, 56);
                    j13 = j15;
                    z18 = z25;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z18 = z15;
                    j13 = brandWhite;
                }
                z19 = z16;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.n
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33092o.m104846g(z4, contentDescription, onToggle, modifier3, z18, z19, j13, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 24576;
            z15 = z13;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    z16 = z14;
                    if (c28655q.m87155h(z16)) {
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
                        i15 |= i25;
                    } else {
                        brandWhite = j7;
                    }
                    i15 |= i25;
                } else {
                    brandWhite = j7;
                }
                if ((599187 & i15) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q.m87135U(i15 & 1, z17)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            z15 = true;
                        }
                        if (i18 != 0) {
                            z16 = false;
                        }
                        if ((i14 & 64) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -3670017;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            z15 = true;
                        }
                        if (i18 != 0) {
                            z16 = false;
                        }
                        if ((i14 & 64) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -3670017;
                        }
                    }
                    modifier3 = modifier2;
                    boolean z26 = z15;
                    long j16 = brandWhite;
                    c28655q.m87175r();
                    AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z16)), AbstractC37817c.m121344e(-641580013, c28655q, new C15375j3(modifier3, AbstractC8693b.m21274h(contentDescription, c28655q, (i15 >> 3) & 14), j16, z4, onToggle, z26)), c28655q, 56);
                    j13 = j16;
                    z18 = z26;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z18 = z15;
                    j13 = brandWhite;
                }
                z19 = z16;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.n
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33092o.m104846g(z4, contentDescription, onToggle, modifier3, z18, z19, j13, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z16 = z14;
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) == 0) {
                    brandWhite = j7;
                    if (c28655q.m87151f(brandWhite)) {
                    }
                    i15 |= i25;
                } else {
                    brandWhite = j7;
                }
                i15 |= i25;
            } else {
                brandWhite = j7;
            }
            if ((599187 & i15) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q.m87135U(i15 & 1, z17)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if ((i14 & 64) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -3670017;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if ((i14 & 64) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -3670017;
                    }
                }
                modifier3 = modifier2;
                boolean z27 = z15;
                long j17 = brandWhite;
                c28655q.m87175r();
                AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z16)), AbstractC37817c.m121344e(-641580013, c28655q, new C15375j3(modifier3, AbstractC8693b.m21274h(contentDescription, c28655q, (i15 >> 3) & 14), j17, z4, onToggle, z27)), c28655q, 56);
                j13 = j17;
                z18 = z27;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z18 = z15;
                j13 = brandWhite;
            }
            z19 = z16;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.n
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33092o.m104846g(z4, contentDescription, onToggle, modifier3, z18, z19, j13, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                z15 = z13;
                if (c28655q.m87155h(z15)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    z16 = z14;
                    if (c28655q.m87155h(z16)) {
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
                        i15 |= i25;
                    } else {
                        brandWhite = j7;
                    }
                    i15 |= i25;
                } else {
                    brandWhite = j7;
                }
                if ((599187 & i15) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q.m87135U(i15 & 1, z17)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            z15 = true;
                        }
                        if (i18 != 0) {
                            z16 = false;
                        }
                        if ((i14 & 64) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -3670017;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            z15 = true;
                        }
                        if (i18 != 0) {
                            z16 = false;
                        }
                        if ((i14 & 64) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -3670017;
                        }
                    }
                    modifier3 = modifier2;
                    boolean z28 = z15;
                    long j18 = brandWhite;
                    c28655q.m87175r();
                    AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z16)), AbstractC37817c.m121344e(-641580013, c28655q, new C15375j3(modifier3, AbstractC8693b.m21274h(contentDescription, c28655q, (i15 >> 3) & 14), j18, z4, onToggle, z28)), c28655q, 56);
                    j13 = j18;
                    z18 = z28;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z18 = z15;
                    j13 = brandWhite;
                }
                z19 = z16;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.n
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33092o.m104846g(z4, contentDescription, onToggle, modifier3, z18, z19, j13, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z16 = z14;
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) == 0) {
                    brandWhite = j7;
                    if (c28655q.m87151f(brandWhite)) {
                    }
                    i15 |= i25;
                } else {
                    brandWhite = j7;
                }
                i15 |= i25;
            } else {
                brandWhite = j7;
            }
            if ((599187 & i15) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q.m87135U(i15 & 1, z17)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if ((i14 & 64) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -3670017;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if ((i14 & 64) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -3670017;
                    }
                }
                modifier3 = modifier2;
                boolean z29 = z15;
                long j19 = brandWhite;
                c28655q.m87175r();
                AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z16)), AbstractC37817c.m121344e(-641580013, c28655q, new C15375j3(modifier3, AbstractC8693b.m21274h(contentDescription, c28655q, (i15 >> 3) & 14), j19, z4, onToggle, z29)), c28655q, 56);
                j13 = j19;
                z18 = z29;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z18 = z15;
                j13 = brandWhite;
            }
            z19 = z16;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.n
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33092o.m104846g(z4, contentDescription, onToggle, modifier3, z18, z19, j13, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 24576;
        z15 = z13;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                z16 = z14;
                if (c28655q.m87155h(z16)) {
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
                    i15 |= i25;
                } else {
                    brandWhite = j7;
                }
                i15 |= i25;
            } else {
                brandWhite = j7;
            }
            if ((599187 & i15) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q.m87135U(i15 & 1, z17)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if ((i14 & 64) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -3670017;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if ((i14 & 64) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -3670017;
                    }
                }
                modifier3 = modifier2;
                boolean z210 = z15;
                long j110 = brandWhite;
                c28655q.m87175r();
                AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z16)), AbstractC37817c.m121344e(-641580013, c28655q, new C15375j3(modifier3, AbstractC8693b.m21274h(contentDescription, c28655q, (i15 >> 3) & 14), j110, z4, onToggle, z210)), c28655q, 56);
                j13 = j110;
                z18 = z210;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z18 = z15;
                j13 = brandWhite;
            }
            z19 = z16;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.n
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33092o.m104846g(z4, contentDescription, onToggle, modifier3, z18, z19, j13, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z16 = z14;
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) == 0) {
                brandWhite = j7;
                if (c28655q.m87151f(brandWhite)) {
                }
                i15 |= i25;
            } else {
                brandWhite = j7;
            }
            i15 |= i25;
        } else {
            brandWhite = j7;
        }
        if ((599187 & i15) != 599186) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (c28655q.m87135U(i15 & 1, z17)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 != 0) {
                    z15 = true;
                }
                if (i18 != 0) {
                    z16 = false;
                }
                if ((i14 & 64) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -3670017;
                }
            } else {
                if (i24 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 != 0) {
                    z15 = true;
                }
                if (i18 != 0) {
                    z16 = false;
                }
                if ((i14 & 64) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -3670017;
                }
            }
            modifier3 = modifier2;
            boolean z211 = z15;
            long j111 = brandWhite;
            c28655q.m87175r();
            AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z16)), AbstractC37817c.m121344e(-641580013, c28655q, new C15375j3(modifier3, AbstractC8693b.m21274h(contentDescription, c28655q, (i15 >> 3) & 14), j111, z4, onToggle, z211)), c28655q, 56);
            j13 = j111;
            z18 = z211;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z18 = z15;
            j13 = brandWhite;
        }
        z19 = z16;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.n
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC33092o.m104846g(z4, contentDescription, onToggle, modifier3, z18, z19, j13, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m104844e(Modifier modifier, String str, long j7, boolean z4, Function1 function1, boolean z13, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87153g = c28655q.m87153g(str);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C30936d(str, 4);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifier, false, (Function1) objM87133R);
            C38072d c38072d = C38072d.f163053a;
            AbstractC14959b1.m43082a(z4, function1, modifierM51775c, z13, AbstractC12240d.m34081r(j7, c38072d.m121949b(c28655q, 6).getBrandWhite(), c38072d.m121949b(c28655q, 6).getBrandBlack(), 0L, c28655q, 0, 24), c28655q, 0, 16);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m104845f(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m104846g(boolean z4, TextResource textResource, Function1 function1, Modifier modifier, boolean z13, boolean z14, long j7, int i13, int i14, Composer composer, int i15) {
        m104843d(z4, textResource, function1, modifier, z13, z14, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
