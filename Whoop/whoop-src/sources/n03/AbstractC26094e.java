package n03;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import d03.AbstractC11446a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import o03.AbstractC27356a;
import o73.C27648a;
import p008a7.C0515f;
import p335n6.C26384a;
import p335n6.C26387d;
import p335n6.C26396m;
import p335n6.InterfaceC26398o;
import p358o6.InterfaceC27593a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p463rj.AbstractC31484o;
import p470rv.AbstractC31834n;
import p477s2.AbstractC32072d;
import p477s2.AbstractC32076h;
import p545v6.InterfaceC35718g;
import p602x1.AbstractC37817c;
import p636y3.C39183o;
import p672z6.C40119b;
import p672z6.C40123f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import rs.AbstractC31780b;
import v63.AbstractC35745c;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: n03.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Landroid/content/Context;", "context", "", "text", "Li2/x;", "textColor", "", "icon", "label", "Lo6/a;", "clickAction", "Ln6/o;", "background", "Ly3/f;", "contentSpacing", "Ll83/a0;", "d", "(Landroid/content/Context;Ljava/lang/String;JILjava/lang/String;Lo6/a;Ln6/o;FLandroidx/compose/runtime/Composer;II)V", "widget_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26094e {
    /* JADX WARN: Code duplicated, block: B:100:0x0144  */
    /* JADX WARN: Code duplicated, block: B:103:0x0150  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8 A[PHI: r6 r10 r13
      0x00f8: PHI (r6v10 java.lang.String) = (r6v4 java.lang.String), (r6v2 java.lang.String) binds: [B:96:0x011b, B:86:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r10v13 o6.a) = (r10v9 o6.a), (r10v7 o6.a) binds: [B:96:0x011b, B:86:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r13v8 n6.o) = (r13v5 n6.o), (r13v3 n6.o) binds: [B:96:0x011b, B:86:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /* JADX INFO: renamed from: d */
    public static final void m77617d(final Context context, final String text, final long j7, final int i13, String str, InterfaceC27593a interfaceC27593a, InterfaceC26398o interfaceC26398o, float f13, Composer composer, final int i14, final int i15) {
        int i16;
        final String str2;
        InterfaceC27593a interfaceC27593aM82534a;
        InterfaceC26398o c26387d;
        int i17;
        float f14;
        int i18;
        boolean z4;
        C28655q c28655q;
        final InterfaceC27593a interfaceC27593a2;
        final InterfaceC26398o interfaceC26398o2;
        final float f15;
        C28677v1 c28677v1M87180u;
        final InterfaceC27593a interfaceC27593a3;
        final InterfaceC26398o interfaceC26398o3;
        final String str3;
        final float f16;
        int i19;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1907050658);
        if ((i14 & 6) == 0) {
            i16 = (c28655q2.m87157i(context) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87153g(text) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87151f(j7) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q2.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i24 = i15 & 16;
        if (i24 == 0) {
            if ((i14 & 24576) == 0) {
                str2 = str;
                i16 |= c28655q2.m87153g(str2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((196608 & i14) == 0) {
                if ((i15 & 32) == 0) {
                    interfaceC27593aM82534a = interfaceC27593a;
                    if (c28655q2.m87157i(interfaceC27593aM82534a)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i16 |= i19;
                } else {
                    interfaceC27593aM82534a = interfaceC27593a;
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                i16 |= i19;
            } else {
                interfaceC27593aM82534a = interfaceC27593a;
            }
            if ((1572864 & i14) == 0) {
                if ((i15 & 64) == 0) {
                    c26387d = interfaceC26398o;
                    int i25 = c28655q2.m87153g(c26387d) ? 1048576 : 524288;
                    i16 |= i25;
                } else {
                    c26387d = interfaceC26398o;
                }
                i16 |= i25;
            } else {
                c26387d = interfaceC26398o;
            }
            i17 = i15 & 128;
            if (i17 != 0) {
                if ((12582912 & i14) == 0) {
                    f14 = f13;
                    if (c28655q2.m87147d(f14)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i16 |= i18;
                }
                if ((i16 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i16 & 1, z4)) {
                    c28655q2.m87140Z();
                    if ((i14 & 1) != 0 || c28655q2.m87118C()) {
                        if (i24 != 0) {
                            str2 = null;
                        }
                        if ((i15 & 32) != 0) {
                            interfaceC27593aM82534a = AbstractC27356a.m82534a(context);
                        }
                        if ((i15 & 64) != 0) {
                            c26387d = new C26387d(new C26384a(AbstractC11446a.f36711j));
                        }
                        if (i17 != 0) {
                            interfaceC27593a3 = interfaceC27593aM82534a;
                            interfaceC26398o3 = c26387d;
                            str3 = str2;
                            f16 = 2;
                        }
                        c28655q2.m87175r();
                        c26387d = interfaceC26398o3;
                        f14 = f16;
                        AbstractC31780b.m98680a(null, null, AbstractC37817c.m121344e(-713186240, c28655q2, new InterfaceC4351m() { // from class: n03.b
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC26094e.m77618e(interfaceC26398o3, interfaceC27593a3, i13, f16, text, j7, str3, (Composer) obj, iIntValue);
                            }
                        }), c28655q2, 384, 3);
                        c28655q = c28655q2;
                        interfaceC27593a2 = interfaceC27593a3;
                        str2 = str3;
                    } else {
                        c28655q2.m87138X();
                    }
                    interfaceC27593a3 = interfaceC27593aM82534a;
                    interfaceC26398o3 = c26387d;
                    str3 = str2;
                    f16 = f14;
                    c28655q2.m87175r();
                    c26387d = interfaceC26398o3;
                    f14 = f16;
                    AbstractC31780b.m98680a(null, null, AbstractC37817c.m121344e(-713186240, c28655q2, new InterfaceC4351m() { // from class: n03.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC26094e.m77618e(interfaceC26398o3, interfaceC27593a3, i13, f16, text, j7, str3, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, 384, 3);
                    c28655q = c28655q2;
                    interfaceC27593a2 = interfaceC27593a3;
                    str2 = str3;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC27593a2 = interfaceC27593aM82534a;
                }
                interfaceC26398o2 = c26387d;
                f15 = f14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n03.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC26094e.m77620g(context, text, j7, i13, str2, interfaceC27593a2, interfaceC26398o2, f15, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 12582912;
            f14 = f13;
            if ((i16 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i24 != 0) {
                        str2 = null;
                    }
                    if ((i15 & 32) != 0) {
                        interfaceC27593aM82534a = AbstractC27356a.m82534a(context);
                    }
                    if ((i15 & 64) != 0) {
                        c26387d = new C26387d(new C26384a(AbstractC11446a.f36711j));
                    }
                    if (i17 != 0) {
                        interfaceC27593a3 = interfaceC27593aM82534a;
                        interfaceC26398o3 = c26387d;
                        str3 = str2;
                        f16 = 2;
                    } else {
                        interfaceC27593a3 = interfaceC27593aM82534a;
                        interfaceC26398o3 = c26387d;
                        str3 = str2;
                        f16 = f14;
                    }
                } else {
                    if (i24 != 0) {
                        str2 = null;
                    }
                    if ((i15 & 32) != 0) {
                        interfaceC27593aM82534a = AbstractC27356a.m82534a(context);
                    }
                    if ((i15 & 64) != 0) {
                        c26387d = new C26387d(new C26384a(AbstractC11446a.f36711j));
                    }
                    if (i17 != 0) {
                        interfaceC27593a3 = interfaceC27593aM82534a;
                        interfaceC26398o3 = c26387d;
                        str3 = str2;
                        f16 = 2;
                    } else {
                        interfaceC27593a3 = interfaceC27593aM82534a;
                        interfaceC26398o3 = c26387d;
                        str3 = str2;
                        f16 = f14;
                    }
                }
                c28655q2.m87175r();
                c26387d = interfaceC26398o3;
                f14 = f16;
                AbstractC31780b.m98680a(null, null, AbstractC37817c.m121344e(-713186240, c28655q2, new InterfaceC4351m() { // from class: n03.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC26094e.m77618e(interfaceC26398o3, interfaceC27593a3, i13, f16, text, j7, str3, (Composer) obj, iIntValue);
                    }
                }), c28655q2, 384, 3);
                c28655q = c28655q2;
                interfaceC27593a2 = interfaceC27593a3;
                str2 = str3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC27593a2 = interfaceC27593aM82534a;
            }
            interfaceC26398o2 = c26387d;
            f15 = f14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n03.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC26094e.m77620g(context, text, j7, i13, str2, interfaceC27593a2, interfaceC26398o2, f15, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        str2 = str;
        if ((196608 & i14) == 0) {
            if ((i15 & 32) == 0) {
                interfaceC27593aM82534a = interfaceC27593a;
                if (c28655q2.m87157i(interfaceC27593aM82534a)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i16 |= i19;
            } else {
                interfaceC27593aM82534a = interfaceC27593a;
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i16 |= i19;
        } else {
            interfaceC27593aM82534a = interfaceC27593a;
        }
        if ((1572864 & i14) == 0) {
            if ((i15 & 64) == 0) {
                c26387d = interfaceC26398o;
                if (c28655q2.m87153g(c26387d)) {
                }
                i16 |= i25;
            } else {
                c26387d = interfaceC26398o;
            }
            i16 |= i25;
        } else {
            c26387d = interfaceC26398o;
        }
        i17 = i15 & 128;
        if (i17 != 0) {
            if ((12582912 & i14) == 0) {
                f14 = f13;
                if (c28655q2.m87147d(f14)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i16 |= i18;
            }
            if ((i16 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i24 != 0) {
                        str2 = null;
                    }
                    if ((i15 & 32) != 0) {
                        interfaceC27593aM82534a = AbstractC27356a.m82534a(context);
                    }
                    if ((i15 & 64) != 0) {
                        c26387d = new C26387d(new C26384a(AbstractC11446a.f36711j));
                    }
                    if (i17 != 0) {
                        interfaceC27593a3 = interfaceC27593aM82534a;
                        interfaceC26398o3 = c26387d;
                        str3 = str2;
                        f16 = 2;
                    } else {
                        interfaceC27593a3 = interfaceC27593aM82534a;
                        interfaceC26398o3 = c26387d;
                        str3 = str2;
                        f16 = f14;
                    }
                } else {
                    if (i24 != 0) {
                        str2 = null;
                    }
                    if ((i15 & 32) != 0) {
                        interfaceC27593aM82534a = AbstractC27356a.m82534a(context);
                    }
                    if ((i15 & 64) != 0) {
                        c26387d = new C26387d(new C26384a(AbstractC11446a.f36711j));
                    }
                    if (i17 != 0) {
                        interfaceC27593a3 = interfaceC27593aM82534a;
                        interfaceC26398o3 = c26387d;
                        str3 = str2;
                        f16 = 2;
                    } else {
                        interfaceC27593a3 = interfaceC27593aM82534a;
                        interfaceC26398o3 = c26387d;
                        str3 = str2;
                        f16 = f14;
                    }
                }
                c28655q2.m87175r();
                c26387d = interfaceC26398o3;
                f14 = f16;
                AbstractC31780b.m98680a(null, null, AbstractC37817c.m121344e(-713186240, c28655q2, new InterfaceC4351m() { // from class: n03.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC26094e.m77618e(interfaceC26398o3, interfaceC27593a3, i13, f16, text, j7, str3, (Composer) obj, iIntValue);
                    }
                }), c28655q2, 384, 3);
                c28655q = c28655q2;
                interfaceC27593a2 = interfaceC27593a3;
                str2 = str3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC27593a2 = interfaceC27593aM82534a;
            }
            interfaceC26398o2 = c26387d;
            f15 = f14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n03.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC26094e.m77620g(context, text, j7, i13, str2, interfaceC27593a2, interfaceC26398o2, f15, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 12582912;
        f14 = f13;
        if ((i16 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0) {
                if (i24 != 0) {
                    str2 = null;
                }
                if ((i15 & 32) != 0) {
                    interfaceC27593aM82534a = AbstractC27356a.m82534a(context);
                }
                if ((i15 & 64) != 0) {
                    c26387d = new C26387d(new C26384a(AbstractC11446a.f36711j));
                }
                if (i17 != 0) {
                    interfaceC27593a3 = interfaceC27593aM82534a;
                    interfaceC26398o3 = c26387d;
                    str3 = str2;
                    f16 = 2;
                } else {
                    interfaceC27593a3 = interfaceC27593aM82534a;
                    interfaceC26398o3 = c26387d;
                    str3 = str2;
                    f16 = f14;
                }
            } else {
                if (i24 != 0) {
                    str2 = null;
                }
                if ((i15 & 32) != 0) {
                    interfaceC27593aM82534a = AbstractC27356a.m82534a(context);
                }
                if ((i15 & 64) != 0) {
                    c26387d = new C26387d(new C26384a(AbstractC11446a.f36711j));
                }
                if (i17 != 0) {
                    interfaceC27593a3 = interfaceC27593aM82534a;
                    interfaceC26398o3 = c26387d;
                    str3 = str2;
                    f16 = 2;
                } else {
                    interfaceC27593a3 = interfaceC27593aM82534a;
                    interfaceC26398o3 = c26387d;
                    str3 = str2;
                    f16 = f14;
                }
            }
            c28655q2.m87175r();
            c26387d = interfaceC26398o3;
            f14 = f16;
            AbstractC31780b.m98680a(null, null, AbstractC37817c.m121344e(-713186240, c28655q2, new InterfaceC4351m() { // from class: n03.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC26094e.m77618e(interfaceC26398o3, interfaceC27593a3, i13, f16, text, j7, str3, (Composer) obj, iIntValue);
                }
            }), c28655q2, 384, 3);
            c28655q = c28655q2;
            interfaceC27593a2 = interfaceC27593a3;
            str2 = str3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC27593a2 = interfaceC27593aM82534a;
        }
        interfaceC26398o2 = c26387d;
        f15 = f14;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n03.c
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC26094e.m77620g(context, text, j7, i13, str2, interfaceC27593a2, interfaceC26398o2, f15, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m77618e(InterfaceC26398o interfaceC26398o, InterfaceC27593a interfaceC27593a, final int i13, final float f13, final String str, final long j7, final String str2, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC31834n.m98892a(AbstractC37926s0.m121474l(AbstractC32072d.m99702k(interfaceC26398o), interfaceC27593a), 1, 1, AbstractC37817c.m121344e(432798902, c28655q, new Function3() { // from class: n03.d
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC26094e.m77619f(i13, f13, str, j7, str2, (InterfaceC35718g) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, 3072, 0);
            AbstractC31780b.m98680a(AbstractC37926s0.m121474l(AbstractC32072d.m99702k(C26396m.f104850a), interfaceC27593a), null, C26090a.f103329a.m77613b(), c28655q, 384, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m77619f(int i13, float f13, String str, long j7, String str2, InterfaceC35718g Column, Composer composer, int i14) {
        AbstractC22676k.m65750j(Column, "$this$Column");
        C27648a.m83581d(new C26384a(i13), null, AbstractC32072d.m99710t(5 * 4), 0, composer, 48, 24);
        AbstractC32076h.m99771d(AbstractC32072d.m99710t(f13), composer, 0);
        AbstractC31484o.m96953e(str, null, new C40123f(new C0515f(j7), new C39183o(AbstractC35745c.m113246h(17)), new C40119b(700), null, 120), 0, composer, 0, 10);
        if (str2 != null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(20810229);
            AbstractC32076h.m99771d(AbstractC32072d.m99710t(f13), c28655q, 0);
            AbstractC31484o.m96953e(str2, null, new C40123f(new C0515f(j7), new C39183o(AbstractC35745c.m113246h(9)), new C40119b(500), null, 120), 0, c28655q, 0, 10);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(21170604);
            c28655q2.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m77620g(Context context, String str, long j7, int i13, String str2, InterfaceC27593a interfaceC27593a, InterfaceC26398o interfaceC26398o, float f13, int i14, int i15, Composer composer, int i16) {
        m77617d(context, str, j7, i13, str2, interfaceC27593a, interfaceC26398o, f13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
