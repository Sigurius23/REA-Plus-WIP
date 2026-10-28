package p711j31;

import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c31.C3922f;
import c93.InterfaceC4352n;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: j31.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001ac\u0010\u000f\u001a\u00020\r*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001ai\u0010\u0013\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Landroidx/compose/foundation/lazy/a;", "Lj31/m;", "reorderableState", "", "key", "Landroidx/compose/ui/Modifier;", "modifier", "", "index", "", "orientationLocked", "Lkotlin/Function2;", "Ll0/u;", "Ll83/a0;", "content", "e", "(Landroidx/compose/foundation/lazy/a;Lj31/m;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;ZLc93/n;Landroidx/compose/runtime/Composer;II)V", "state", "defaultDraggingModifier", "f", "(Lj31/m;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lc93/n;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21275f {
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x010b  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m59698e(InterfaceC1103a interfaceC1103a, AbstractC21282m<?> reorderableState, Object obj, Modifier modifier, Integer num, boolean z4, InterfaceC4352n content, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Integer num2;
        int i17;
        int i18;
        boolean z13;
        int i19;
        boolean z14;
        Modifier modifier3;
        Integer num3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Integer num4;
        int i24;
        AbstractC22676k.m65750j(interfaceC1103a, "<this>");
        AbstractC22676k.m65750j(reorderableState, "reorderableState");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1665769573);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(interfaceC1103a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(reorderableState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(obj) ? 256 : 128;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    num2 = num;
                    if (c28655q.m87153g(num2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
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
                        if (c28655q.m87157i(content)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i15 |= i24;
                    }
                    if ((599187 & i15) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        c2314t = C2314t.f9131w;
                        if (i25 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        m59699f(reorderableState, obj, modifier3, InterfaceC1103a.m3430a(interfaceC1103a, c2314t, 7), z15, num4, content, c28655q, ((i15 >> 3) & 58366) | (458752 & (i15 << 3)) | (i15 & 3670016), 0);
                        num3 = num4;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        num3 = num2;
                        z15 = z13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3922f(interfaceC1103a, reorderableState, obj, modifier3, num3, z15, content, i13, i14, 3);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z13 = z4;
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(content)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i15 |= i24;
                }
                if ((599187 & i15) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    m59699f(reorderableState, obj, modifier3, InterfaceC1103a.m3430a(interfaceC1103a, c2314t, 7), z15, num4, content, c28655q, ((i15 >> 3) & 58366) | (458752 & (i15 << 3)) | (i15 & 3670016), 0);
                    num3 = num4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    num3 = num2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(interfaceC1103a, reorderableState, obj, modifier3, num3, z15, content, i13, i14, 3);
                }
            }
            i15 |= 24576;
            num2 = num;
            i18 = i14 & 16;
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
                    if (c28655q.m87157i(content)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i15 |= i24;
                }
                if ((599187 & i15) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    m59699f(reorderableState, obj, modifier3, InterfaceC1103a.m3430a(interfaceC1103a, c2314t, 7), z15, num4, content, c28655q, ((i15 >> 3) & 58366) | (458752 & (i15 << 3)) | (i15 & 3670016), 0);
                    num3 = num4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    num3 = num2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(interfaceC1103a, reorderableState, obj, modifier3, num3, z15, content, i13, i14, 3);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z13 = z4;
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(content)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i15 |= i24;
            }
            if ((599187 & i15) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i18 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                m59699f(reorderableState, obj, modifier3, InterfaceC1103a.m3430a(interfaceC1103a, c2314t, 7), z15, num4, content, c28655q, ((i15 >> 3) & 58366) | (458752 & (i15 << 3)) | (i15 & 3670016), 0);
                num3 = num4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                num3 = num2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(interfaceC1103a, reorderableState, obj, modifier3, num3, z15, content, i13, i14, 3);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                num2 = num;
                if (c28655q.m87153g(num2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
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
                    if (c28655q.m87157i(content)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i15 |= i24;
                }
                if ((599187 & i15) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    m59699f(reorderableState, obj, modifier3, InterfaceC1103a.m3430a(interfaceC1103a, c2314t, 7), z15, num4, content, c28655q, ((i15 >> 3) & 58366) | (458752 & (i15 << 3)) | (i15 & 3670016), 0);
                    num3 = num4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    num3 = num2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(interfaceC1103a, reorderableState, obj, modifier3, num3, z15, content, i13, i14, 3);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z13 = z4;
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(content)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i15 |= i24;
            }
            if ((599187 & i15) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i18 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                m59699f(reorderableState, obj, modifier3, InterfaceC1103a.m3430a(interfaceC1103a, c2314t, 7), z15, num4, content, c28655q, ((i15 >> 3) & 58366) | (458752 & (i15 << 3)) | (i15 & 3670016), 0);
                num3 = num4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                num3 = num2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(interfaceC1103a, reorderableState, obj, modifier3, num3, z15, content, i13, i14, 3);
            }
        }
        i15 |= 24576;
        num2 = num;
        i18 = i14 & 16;
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
                if (c28655q.m87157i(content)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i15 |= i24;
            }
            if ((599187 & i15) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i18 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                m59699f(reorderableState, obj, modifier3, InterfaceC1103a.m3430a(interfaceC1103a, c2314t, 7), z15, num4, content, c28655q, ((i15 >> 3) & 58366) | (458752 & (i15 << 3)) | (i15 & 3670016), 0);
                num3 = num4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                num3 = num2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(interfaceC1103a, reorderableState, obj, modifier3, num3, z15, content, i13, i14, 3);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z13 = z4;
        if ((1572864 & i13) == 0) {
            if (c28655q.m87157i(content)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i15 |= i24;
        }
        if ((599187 & i15) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            if (i16 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if (i18 != 0) {
                z15 = true;
            } else {
                z15 = z13;
            }
            m59699f(reorderableState, obj, modifier3, InterfaceC1103a.m3430a(interfaceC1103a, c2314t, 7), z15, num4, content, c28655q, ((i15 >> 3) & 58366) | (458752 & (i15 << 3)) | (i15 & 3670016), 0);
            num3 = num4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            num3 = num2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3922f(interfaceC1103a, reorderableState, obj, modifier3, num3, z15, content, i13, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:103:0x013a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0142  */
    /* JADX WARN: Code duplicated, block: B:107:0x014e  */
    /* JADX WARN: Code duplicated, block: B:110:0x015a  */
    /* JADX WARN: Code duplicated, block: B:111:0x015c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0168  */
    /* JADX WARN: Code duplicated, block: B:114:0x016d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0174  */
    /* JADX WARN: Code duplicated, block: B:119:0x0184  */
    /* JADX WARN: Code duplicated, block: B:120:0x0186  */
    /* JADX WARN: Code duplicated, block: B:123:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0194  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:130:0x01da  */
    /* JADX WARN: Code duplicated, block: B:131:0x01de  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:139:0x0223  */
    /* JADX WARN: Code duplicated, block: B:142:0x022d  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    /* JADX INFO: renamed from: f */
    public static final void m59699f(final AbstractC21282m<?> state, Object obj, Modifier modifier, Modifier modifier2, boolean z4, Integer num, InterfaceC4352n content, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier3;
        int i16;
        Modifier modifier4;
        int i17;
        int i18;
        final boolean z13;
        int i19;
        int i24;
        Integer num2;
        int i25;
        int i26;
        boolean z14;
        Modifier modifier5;
        Modifier modifier6;
        boolean z15;
        Integer num3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean zM65745e;
        int i27;
        C21273d position;
        Object objM59693d;
        boolean zM65745e2;
        Modifier modifierM3486a;
        boolean z16;
        boolean zM87157i;
        Object objM87133R;
        C21273d position2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z17;
        boolean zM87157i2;
        Object objM87133R2;
        Integer numM59777u;
        int i28;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-590656883);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(obj) ? 32 : 16;
        }
        int i29 = i14 & 4;
        if (i29 == 0) {
            if ((i13 & 384) == 0) {
                modifier3 = modifier;
                i15 |= c28655q.m87153g(modifier3) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    modifier4 = modifier2;
                    if (c28655q.m87153g(modifier4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        z13 = z4;
                        if (c28655q.m87155h(z13)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 32;
                    if (i24 != 0) {
                        if ((196608 & i13) == 0) {
                            num2 = num;
                            if (c28655q.m87153g(num2)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i25;
                        }
                        if ((1572864 & i13) == 0) {
                            if (c28655q.m87157i(content)) {
                                i28 = 1048576;
                            } else {
                                i28 = 524288;
                            }
                            i15 |= i28;
                        }
                        i26 = i15;
                        if ((599187 & i15) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q.m87135U(i26 & 1, z14)) {
                            c2314t = C2314t.f9131w;
                            if (i29 != 0) {
                                modifier3 = c2314t;
                            }
                            if (i16 != 0) {
                                modifier4 = c2314t;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (num2 != null) {
                                int iIntValue = num2.intValue();
                                numM59777u = state.m59777u();
                                if (numM59777u == null && iIntValue == numM59777u.intValue()) {
                                    zM65745e = true;
                                } else {
                                    zM65745e = false;
                                }
                            } else {
                                zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                            }
                            C28676v0 c28676v0 = C28635l.f115821a;
                            if (zM65745e) {
                                c28655q.m87150e0(222291102);
                                Modifier modifierM7154a = AbstractC2294a.m7154a(1.0f, c2314t);
                                if ((i26 & 57344) == 16384) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                zM87157i2 = z17 | c28655q.m87157i(state);
                                objM87133R2 = c28655q.m87133R();
                                if (zM87157i2 || objM87133R2 == c28676v0) {
                                    final int i34 = 0;
                                    objM87133R2 = new Function1() { // from class: j31.e
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            switch (i34) {
                                                case 0:
                                                    return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                                default:
                                                    return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R2);
                                }
                                modifierM3486a = AbstractC1127a.m3486a(modifierM7154a, (Function1) objM87133R2);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(222648873);
                                if (num2 != null) {
                                    position2 = state.getDragCancelledAnimation().getPosition();
                                    i27 = 57344;
                                    if (position2 == null && num2.intValue() == position2.m59692c()) {
                                        zM65745e2 = true;
                                    } else {
                                        zM65745e2 = false;
                                    }
                                } else {
                                    i27 = 57344;
                                    position = state.getDragCancelledAnimation().getPosition();
                                    if (position != null) {
                                        objM59693d = position.m59693d();
                                    } else {
                                        objM59693d = null;
                                    }
                                    zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                                }
                                if (zM65745e2) {
                                    c28655q.m87150e0(222880195);
                                    Modifier modifierM7154a2 = AbstractC2294a.m7154a(1.0f, c2314t);
                                    if ((i26 & i27) == 16384) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    zM87157i = z16 | c28655q.m87157i(state);
                                    objM87133R = c28655q.m87133R();
                                    if (zM87157i || objM87133R == c28676v0) {
                                        final int i35 = 1;
                                        objM87133R = new Function1() { // from class: j31.e
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                switch (i35) {
                                                    case 0:
                                                        return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                                    default:
                                                        return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R);
                                    }
                                    modifierM3486a = AbstractC1127a.m3486a(modifierM7154a2, (Function1) objM87133R);
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(223274174);
                                    c28655q.m87173q(false);
                                    modifierM3486a = modifier4;
                                }
                                c28655q.m87173q(false);
                            }
                            Modifier modifierMo3471e = modifier3.mo3471e(modifierM3486a);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
                            content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                            c28655q.m87173q(true);
                        } else {
                            c28655q.m87138X();
                        }
                        modifier5 = modifier3;
                        modifier6 = modifier4;
                        z15 = z13;
                        num3 = num2;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
                        }
                    }
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    num2 = num;
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87157i(content)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i15 |= i28;
                    }
                    i26 = i15;
                    if ((599187 & i15) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i26 & 1, z14)) {
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i16 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            numM59777u = state.m59777u();
                            if (numM59777u == null) {
                                zM65745e = false;
                            } else {
                                zM65745e = true;
                            }
                        } else {
                            zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                        }
                        C28676v0 c28676v1 = C28635l.f115821a;
                        if (zM65745e) {
                            c28655q.m87150e0(222291102);
                            Modifier modifierM7154a3 = AbstractC2294a.m7154a(1.0f, c2314t);
                            if ((i26 & 57344) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87157i2 = z17 | c28655q.m87157i(state);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i2) {
                                final int i36 = 0;
                                objM87133R2 = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i36) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                final int i37 = 0;
                                objM87133R2 = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i37) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM3486a = AbstractC1127a.m3486a(modifierM7154a3, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(222648873);
                            if (num2 != null) {
                                position2 = state.getDragCancelledAnimation().getPosition();
                                i27 = 57344;
                                if (position2 == null) {
                                    zM65745e2 = false;
                                } else {
                                    zM65745e2 = false;
                                }
                            } else {
                                i27 = 57344;
                                position = state.getDragCancelledAnimation().getPosition();
                                if (position != null) {
                                    objM59693d = position.m59693d();
                                } else {
                                    objM59693d = null;
                                }
                                zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                            }
                            if (zM65745e2) {
                                c28655q.m87150e0(222880195);
                                Modifier modifierM7154a4 = AbstractC2294a.m7154a(1.0f, c2314t);
                                if ((i26 & i27) == 16384) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                zM87157i = z16 | c28655q.m87157i(state);
                                objM87133R = c28655q.m87133R();
                                if (zM87157i) {
                                    final int i38 = 1;
                                    objM87133R = new Function1() { // from class: j31.e
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            switch (i38) {
                                                case 0:
                                                    return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                                default:
                                                    return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    final int i39 = 1;
                                    objM87133R = new Function1() { // from class: j31.e
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            switch (i39) {
                                                case 0:
                                                    return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                                default:
                                                    return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R);
                                }
                                modifierM3486a = AbstractC1127a.m3486a(modifierM7154a4, (Function1) objM87133R);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(223274174);
                                c28655q.m87173q(false);
                                modifierM3486a = modifier4;
                            }
                            c28655q.m87173q(false);
                        }
                        Modifier modifierMo3471e2 = modifier3.mo3471e(modifierM3486a);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
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
                        content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                        c28655q.m87173q(true);
                    } else {
                        c28655q.m87138X();
                    }
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                    z15 = z13;
                    num3 = num2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
                    }
                }
                i15 |= 24576;
                z13 = z4;
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        num2 = num;
                        if (c28655q.m87153g(num2)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87157i(content)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i15 |= i28;
                    }
                    i26 = i15;
                    if ((599187 & i15) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i26 & 1, z14)) {
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i16 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (num2 != null) {
                            int iIntValue3 = num2.intValue();
                            numM59777u = state.m59777u();
                            if (numM59777u == null) {
                                zM65745e = false;
                            } else {
                                zM65745e = true;
                            }
                        } else {
                            zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                        }
                        C28676v0 c28676v2 = C28635l.f115821a;
                        if (zM65745e) {
                            c28655q.m87150e0(222291102);
                            Modifier modifierM7154a5 = AbstractC2294a.m7154a(1.0f, c2314t);
                            if ((i26 & 57344) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87157i2 = z17 | c28655q.m87157i(state);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i2) {
                                final int i310 = 0;
                                objM87133R2 = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i310) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                final int i311 = 0;
                                objM87133R2 = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i311) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM3486a = AbstractC1127a.m3486a(modifierM7154a5, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(222648873);
                            if (num2 != null) {
                                position2 = state.getDragCancelledAnimation().getPosition();
                                i27 = 57344;
                                if (position2 == null) {
                                    zM65745e2 = false;
                                } else {
                                    zM65745e2 = false;
                                }
                            } else {
                                i27 = 57344;
                                position = state.getDragCancelledAnimation().getPosition();
                                if (position != null) {
                                    objM59693d = position.m59693d();
                                } else {
                                    objM59693d = null;
                                }
                                zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                            }
                            if (zM65745e2) {
                                c28655q.m87150e0(222880195);
                                Modifier modifierM7154a6 = AbstractC2294a.m7154a(1.0f, c2314t);
                                if ((i26 & i27) == 16384) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                zM87157i = z16 | c28655q.m87157i(state);
                                objM87133R = c28655q.m87133R();
                                if (zM87157i) {
                                    final int i312 = 1;
                                    objM87133R = new Function1() { // from class: j31.e
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            switch (i312) {
                                                case 0:
                                                    return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                                default:
                                                    return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    final int i313 = 1;
                                    objM87133R = new Function1() { // from class: j31.e
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            switch (i313) {
                                                case 0:
                                                    return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                                default:
                                                    return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R);
                                }
                                modifierM3486a = AbstractC1127a.m3486a(modifierM7154a6, (Function1) objM87133R);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(223274174);
                                c28655q.m87173q(false);
                                modifierM3486a = modifier4;
                            }
                            c28655q.m87173q(false);
                        }
                        Modifier modifierMo3471e3 = modifier3.mo3471e(modifierM3486a);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                        content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                        c28655q.m87173q(true);
                    } else {
                        c28655q.m87138X();
                    }
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                    z15 = z13;
                    num3 = num2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                num2 = num;
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(content)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i15 |= i28;
                }
                i26 = i15;
                if ((599187 & i15) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i26 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i16 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        int iIntValue4 = num2.intValue();
                        numM59777u = state.m59777u();
                        if (numM59777u == null) {
                            zM65745e = false;
                        } else {
                            zM65745e = true;
                        }
                    } else {
                        zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                    }
                    C28676v0 c28676v3 = C28635l.f115821a;
                    if (zM65745e) {
                        c28655q.m87150e0(222291102);
                        Modifier modifierM7154a7 = AbstractC2294a.m7154a(1.0f, c2314t);
                        if ((i26 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i2 = z17 | c28655q.m87157i(state);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i2) {
                            final int i314 = 0;
                            objM87133R2 = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i314) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i315 = 0;
                            objM87133R2 = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i315) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM3486a = AbstractC1127a.m3486a(modifierM7154a7, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(222648873);
                        if (num2 != null) {
                            position2 = state.getDragCancelledAnimation().getPosition();
                            i27 = 57344;
                            if (position2 == null) {
                                zM65745e2 = false;
                            } else {
                                zM65745e2 = false;
                            }
                        } else {
                            i27 = 57344;
                            position = state.getDragCancelledAnimation().getPosition();
                            if (position != null) {
                                objM59693d = position.m59693d();
                            } else {
                                objM59693d = null;
                            }
                            zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                        }
                        if (zM65745e2) {
                            c28655q.m87150e0(222880195);
                            Modifier modifierM7154a8 = AbstractC2294a.m7154a(1.0f, c2314t);
                            if ((i26 & i27) == 16384) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            zM87157i = z16 | c28655q.m87157i(state);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                final int i316 = 1;
                                objM87133R = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i316) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            } else {
                                final int i317 = 1;
                                objM87133R = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i317) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            }
                            modifierM3486a = AbstractC1127a.m3486a(modifierM7154a8, (Function1) objM87133R);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(223274174);
                            c28655q.m87173q(false);
                            modifierM3486a = modifier4;
                        }
                        c28655q.m87173q(false);
                    }
                    Modifier modifierMo3471e4 = modifier3.mo3471e(modifierM3486a);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                }
                modifier5 = modifier3;
                modifier6 = modifier4;
                z15 = z13;
                num3 = num2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
                }
            }
            i15 |= 3072;
            modifier4 = modifier2;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        num2 = num;
                        if (c28655q.m87153g(num2)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87157i(content)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i15 |= i28;
                    }
                    i26 = i15;
                    if ((599187 & i15) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i26 & 1, z14)) {
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i16 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (num2 != null) {
                            int iIntValue5 = num2.intValue();
                            numM59777u = state.m59777u();
                            if (numM59777u == null) {
                                zM65745e = false;
                            } else {
                                zM65745e = true;
                            }
                        } else {
                            zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                        }
                        C28676v0 c28676v4 = C28635l.f115821a;
                        if (zM65745e) {
                            c28655q.m87150e0(222291102);
                            Modifier modifierM7154a9 = AbstractC2294a.m7154a(1.0f, c2314t);
                            if ((i26 & 57344) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87157i2 = z17 | c28655q.m87157i(state);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i2) {
                                final int i318 = 0;
                                objM87133R2 = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i318) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                final int i319 = 0;
                                objM87133R2 = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i319) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM3486a = AbstractC1127a.m3486a(modifierM7154a9, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(222648873);
                            if (num2 != null) {
                                position2 = state.getDragCancelledAnimation().getPosition();
                                i27 = 57344;
                                if (position2 == null) {
                                    zM65745e2 = false;
                                } else {
                                    zM65745e2 = false;
                                }
                            } else {
                                i27 = 57344;
                                position = state.getDragCancelledAnimation().getPosition();
                                if (position != null) {
                                    objM59693d = position.m59693d();
                                } else {
                                    objM59693d = null;
                                }
                                zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                            }
                            if (zM65745e2) {
                                c28655q.m87150e0(222880195);
                                Modifier modifierM7154a10 = AbstractC2294a.m7154a(1.0f, c2314t);
                                if ((i26 & i27) == 16384) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                zM87157i = z16 | c28655q.m87157i(state);
                                objM87133R = c28655q.m87133R();
                                if (zM87157i) {
                                    final int i3110 = 1;
                                    objM87133R = new Function1() { // from class: j31.e
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            switch (i3110) {
                                                case 0:
                                                    return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                                default:
                                                    return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    final int i3111 = 1;
                                    objM87133R = new Function1() { // from class: j31.e
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            switch (i3111) {
                                                case 0:
                                                    return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                                default:
                                                    return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R);
                                }
                                modifierM3486a = AbstractC1127a.m3486a(modifierM7154a10, (Function1) objM87133R);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(223274174);
                                c28655q.m87173q(false);
                                modifierM3486a = modifier4;
                            }
                            c28655q.m87173q(false);
                        }
                        Modifier modifierMo3471e5 = modifier3.mo3471e(modifierM3486a);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                        content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                        c28655q.m87173q(true);
                    } else {
                        c28655q.m87138X();
                    }
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                    z15 = z13;
                    num3 = num2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                num2 = num;
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(content)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i15 |= i28;
                }
                i26 = i15;
                if ((599187 & i15) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i26 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i16 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        int iIntValue6 = num2.intValue();
                        numM59777u = state.m59777u();
                        if (numM59777u == null) {
                            zM65745e = false;
                        } else {
                            zM65745e = true;
                        }
                    } else {
                        zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                    }
                    C28676v0 c28676v5 = C28635l.f115821a;
                    if (zM65745e) {
                        c28655q.m87150e0(222291102);
                        Modifier modifierM7154a11 = AbstractC2294a.m7154a(1.0f, c2314t);
                        if ((i26 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i2 = z17 | c28655q.m87157i(state);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i2) {
                            final int i3112 = 0;
                            objM87133R2 = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i3112) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i3113 = 0;
                            objM87133R2 = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i3113) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM3486a = AbstractC1127a.m3486a(modifierM7154a11, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(222648873);
                        if (num2 != null) {
                            position2 = state.getDragCancelledAnimation().getPosition();
                            i27 = 57344;
                            if (position2 == null) {
                                zM65745e2 = false;
                            } else {
                                zM65745e2 = false;
                            }
                        } else {
                            i27 = 57344;
                            position = state.getDragCancelledAnimation().getPosition();
                            if (position != null) {
                                objM59693d = position.m59693d();
                            } else {
                                objM59693d = null;
                            }
                            zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                        }
                        if (zM65745e2) {
                            c28655q.m87150e0(222880195);
                            Modifier modifierM7154a12 = AbstractC2294a.m7154a(1.0f, c2314t);
                            if ((i26 & i27) == 16384) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            zM87157i = z16 | c28655q.m87157i(state);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                final int i3114 = 1;
                                objM87133R = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i3114) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            } else {
                                final int i3115 = 1;
                                objM87133R = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i3115) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            }
                            modifierM3486a = AbstractC1127a.m3486a(modifierM7154a12, (Function1) objM87133R);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(223274174);
                            c28655q.m87173q(false);
                            modifierM3486a = modifier4;
                        }
                        c28655q.m87173q(false);
                    }
                    Modifier modifierMo3471e6 = modifier3.mo3471e(modifierM3486a);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                }
                modifier5 = modifier3;
                modifier6 = modifier4;
                z15 = z13;
                num3 = num2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
                }
            }
            i15 |= 24576;
            z13 = z4;
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    num2 = num;
                    if (c28655q.m87153g(num2)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(content)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i15 |= i28;
                }
                i26 = i15;
                if ((599187 & i15) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i26 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i16 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        int iIntValue7 = num2.intValue();
                        numM59777u = state.m59777u();
                        if (numM59777u == null) {
                            zM65745e = false;
                        } else {
                            zM65745e = true;
                        }
                    } else {
                        zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                    }
                    C28676v0 c28676v6 = C28635l.f115821a;
                    if (zM65745e) {
                        c28655q.m87150e0(222291102);
                        Modifier modifierM7154a13 = AbstractC2294a.m7154a(1.0f, c2314t);
                        if ((i26 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i2 = z17 | c28655q.m87157i(state);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i2) {
                            final int i3116 = 0;
                            objM87133R2 = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i3116) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i3117 = 0;
                            objM87133R2 = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i3117) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM3486a = AbstractC1127a.m3486a(modifierM7154a13, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(222648873);
                        if (num2 != null) {
                            position2 = state.getDragCancelledAnimation().getPosition();
                            i27 = 57344;
                            if (position2 == null) {
                                zM65745e2 = false;
                            } else {
                                zM65745e2 = false;
                            }
                        } else {
                            i27 = 57344;
                            position = state.getDragCancelledAnimation().getPosition();
                            if (position != null) {
                                objM59693d = position.m59693d();
                            } else {
                                objM59693d = null;
                            }
                            zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                        }
                        if (zM65745e2) {
                            c28655q.m87150e0(222880195);
                            Modifier modifierM7154a14 = AbstractC2294a.m7154a(1.0f, c2314t);
                            if ((i26 & i27) == 16384) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            zM87157i = z16 | c28655q.m87157i(state);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                final int i3118 = 1;
                                objM87133R = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i3118) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            } else {
                                final int i3119 = 1;
                                objM87133R = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i3119) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            }
                            modifierM3486a = AbstractC1127a.m3486a(modifierM7154a14, (Function1) objM87133R);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(223274174);
                            c28655q.m87173q(false);
                            modifierM3486a = modifier4;
                        }
                        c28655q.m87173q(false);
                    }
                    Modifier modifierMo3471e7 = modifier3.mo3471e(modifierM3486a);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                    content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                }
                modifier5 = modifier3;
                modifier6 = modifier4;
                z15 = z13;
                num3 = num2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            num2 = num;
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(content)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i15 |= i28;
            }
            i26 = i15;
            if ((599187 & i15) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i26 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier3 = c2314t;
                }
                if (i16 != 0) {
                    modifier4 = c2314t;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if (i24 != 0) {
                    num2 = null;
                }
                if (num2 != null) {
                    int iIntValue8 = num2.intValue();
                    numM59777u = state.m59777u();
                    if (numM59777u == null) {
                        zM65745e = false;
                    } else {
                        zM65745e = true;
                    }
                } else {
                    zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                }
                C28676v0 c28676v7 = C28635l.f115821a;
                if (zM65745e) {
                    c28655q.m87150e0(222291102);
                    Modifier modifierM7154a15 = AbstractC2294a.m7154a(1.0f, c2314t);
                    if ((i26 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i2 = z17 | c28655q.m87157i(state);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i31110 = 0;
                        objM87133R2 = new Function1() { // from class: j31.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i31110) {
                                    case 0:
                                        return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                    default:
                                        return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i31111 = 0;
                        objM87133R2 = new Function1() { // from class: j31.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i31111) {
                                    case 0:
                                        return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                    default:
                                        return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM3486a = AbstractC1127a.m3486a(modifierM7154a15, (Function1) objM87133R2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(222648873);
                    if (num2 != null) {
                        position2 = state.getDragCancelledAnimation().getPosition();
                        i27 = 57344;
                        if (position2 == null) {
                            zM65745e2 = false;
                        } else {
                            zM65745e2 = false;
                        }
                    } else {
                        i27 = 57344;
                        position = state.getDragCancelledAnimation().getPosition();
                        if (position != null) {
                            objM59693d = position.m59693d();
                        } else {
                            objM59693d = null;
                        }
                        zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                    }
                    if (zM65745e2) {
                        c28655q.m87150e0(222880195);
                        Modifier modifierM7154a16 = AbstractC2294a.m7154a(1.0f, c2314t);
                        if ((i26 & i27) == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zM87157i = z16 | c28655q.m87157i(state);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i) {
                            final int i31112 = 1;
                            objM87133R = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i31112) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        } else {
                            final int i31113 = 1;
                            objM87133R = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i31113) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        modifierM3486a = AbstractC1127a.m3486a(modifierM7154a16, (Function1) objM87133R);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(223274174);
                        c28655q.m87173q(false);
                        modifierM3486a = modifier4;
                    }
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3471e8 = modifier3.mo3471e(modifierM3486a);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierMo3471e8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            modifier5 = modifier3;
            modifier6 = modifier4;
            z15 = z13;
            num3 = num2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
            }
        }
        i15 |= 384;
        modifier3 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                modifier4 = modifier2;
                if (c28655q.m87153g(modifier4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        num2 = num;
                        if (c28655q.m87153g(num2)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87157i(content)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i15 |= i28;
                    }
                    i26 = i15;
                    if ((599187 & i15) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i26 & 1, z14)) {
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i16 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (num2 != null) {
                            int iIntValue9 = num2.intValue();
                            numM59777u = state.m59777u();
                            if (numM59777u == null) {
                                zM65745e = false;
                            } else {
                                zM65745e = true;
                            }
                        } else {
                            zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                        }
                        C28676v0 c28676v8 = C28635l.f115821a;
                        if (zM65745e) {
                            c28655q.m87150e0(222291102);
                            Modifier modifierM7154a17 = AbstractC2294a.m7154a(1.0f, c2314t);
                            if ((i26 & 57344) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87157i2 = z17 | c28655q.m87157i(state);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i2) {
                                final int i31114 = 0;
                                objM87133R2 = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i31114) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                final int i31115 = 0;
                                objM87133R2 = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i31115) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM3486a = AbstractC1127a.m3486a(modifierM7154a17, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(222648873);
                            if (num2 != null) {
                                position2 = state.getDragCancelledAnimation().getPosition();
                                i27 = 57344;
                                if (position2 == null) {
                                    zM65745e2 = false;
                                } else {
                                    zM65745e2 = false;
                                }
                            } else {
                                i27 = 57344;
                                position = state.getDragCancelledAnimation().getPosition();
                                if (position != null) {
                                    objM59693d = position.m59693d();
                                } else {
                                    objM59693d = null;
                                }
                                zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                            }
                            if (zM65745e2) {
                                c28655q.m87150e0(222880195);
                                Modifier modifierM7154a18 = AbstractC2294a.m7154a(1.0f, c2314t);
                                if ((i26 & i27) == 16384) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                zM87157i = z16 | c28655q.m87157i(state);
                                objM87133R = c28655q.m87133R();
                                if (zM87157i) {
                                    final int i31116 = 1;
                                    objM87133R = new Function1() { // from class: j31.e
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            switch (i31116) {
                                                case 0:
                                                    return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                                default:
                                                    return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    final int i31117 = 1;
                                    objM87133R = new Function1() { // from class: j31.e
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            switch (i31117) {
                                                case 0:
                                                    return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                                default:
                                                    return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R);
                                }
                                modifierM3486a = AbstractC1127a.m3486a(modifierM7154a18, (Function1) objM87133R);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(223274174);
                                c28655q.m87173q(false);
                                modifierM3486a = modifier4;
                            }
                            c28655q.m87173q(false);
                        }
                        Modifier modifierMo3471e9 = modifier3.mo3471e(modifierM3486a);
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo3471e9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                        content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                        c28655q.m87173q(true);
                    } else {
                        c28655q.m87138X();
                    }
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                    z15 = z13;
                    num3 = num2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                num2 = num;
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(content)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i15 |= i28;
                }
                i26 = i15;
                if ((599187 & i15) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i26 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i16 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        int iIntValue10 = num2.intValue();
                        numM59777u = state.m59777u();
                        if (numM59777u == null) {
                            zM65745e = false;
                        } else {
                            zM65745e = true;
                        }
                    } else {
                        zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                    }
                    C28676v0 c28676v9 = C28635l.f115821a;
                    if (zM65745e) {
                        c28655q.m87150e0(222291102);
                        Modifier modifierM7154a19 = AbstractC2294a.m7154a(1.0f, c2314t);
                        if ((i26 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i2 = z17 | c28655q.m87157i(state);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i2) {
                            final int i31118 = 0;
                            objM87133R2 = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i31118) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i31119 = 0;
                            objM87133R2 = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i31119) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM3486a = AbstractC1127a.m3486a(modifierM7154a19, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(222648873);
                        if (num2 != null) {
                            position2 = state.getDragCancelledAnimation().getPosition();
                            i27 = 57344;
                            if (position2 == null) {
                                zM65745e2 = false;
                            } else {
                                zM65745e2 = false;
                            }
                        } else {
                            i27 = 57344;
                            position = state.getDragCancelledAnimation().getPosition();
                            if (position != null) {
                                objM59693d = position.m59693d();
                            } else {
                                objM59693d = null;
                            }
                            zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                        }
                        if (zM65745e2) {
                            c28655q.m87150e0(222880195);
                            Modifier modifierM7154a110 = AbstractC2294a.m7154a(1.0f, c2314t);
                            if ((i26 & i27) == 16384) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            zM87157i = z16 | c28655q.m87157i(state);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                final int i311110 = 1;
                                objM87133R = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i311110) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            } else {
                                final int i311111 = 1;
                                objM87133R = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i311111) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            }
                            modifierM3486a = AbstractC1127a.m3486a(modifierM7154a110, (Function1) objM87133R);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(223274174);
                            c28655q.m87173q(false);
                            modifierM3486a = modifier4;
                        }
                        c28655q.m87173q(false);
                    }
                    Modifier modifierMo3471e10 = modifier3.mo3471e(modifierM3486a);
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierMo3471e10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                    content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                }
                modifier5 = modifier3;
                modifier6 = modifier4;
                z15 = z13;
                num3 = num2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
                }
            }
            i15 |= 24576;
            z13 = z4;
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    num2 = num;
                    if (c28655q.m87153g(num2)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(content)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i15 |= i28;
                }
                i26 = i15;
                if ((599187 & i15) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i26 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i16 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        int iIntValue11 = num2.intValue();
                        numM59777u = state.m59777u();
                        if (numM59777u == null) {
                            zM65745e = false;
                        } else {
                            zM65745e = true;
                        }
                    } else {
                        zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                    }
                    C28676v0 c28676v10 = C28635l.f115821a;
                    if (zM65745e) {
                        c28655q.m87150e0(222291102);
                        Modifier modifierM7154a111 = AbstractC2294a.m7154a(1.0f, c2314t);
                        if ((i26 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i2 = z17 | c28655q.m87157i(state);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i2) {
                            final int i311112 = 0;
                            objM87133R2 = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i311112) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i311113 = 0;
                            objM87133R2 = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i311113) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM3486a = AbstractC1127a.m3486a(modifierM7154a111, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(222648873);
                        if (num2 != null) {
                            position2 = state.getDragCancelledAnimation().getPosition();
                            i27 = 57344;
                            if (position2 == null) {
                                zM65745e2 = false;
                            } else {
                                zM65745e2 = false;
                            }
                        } else {
                            i27 = 57344;
                            position = state.getDragCancelledAnimation().getPosition();
                            if (position != null) {
                                objM59693d = position.m59693d();
                            } else {
                                objM59693d = null;
                            }
                            zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                        }
                        if (zM65745e2) {
                            c28655q.m87150e0(222880195);
                            Modifier modifierM7154a112 = AbstractC2294a.m7154a(1.0f, c2314t);
                            if ((i26 & i27) == 16384) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            zM87157i = z16 | c28655q.m87157i(state);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                final int i311114 = 1;
                                objM87133R = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i311114) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            } else {
                                final int i311115 = 1;
                                objM87133R = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i311115) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            }
                            modifierM3486a = AbstractC1127a.m3486a(modifierM7154a112, (Function1) objM87133R);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(223274174);
                            c28655q.m87173q(false);
                            modifierM3486a = modifier4;
                        }
                        c28655q.m87173q(false);
                    }
                    Modifier modifierMo3471e11 = modifier3.mo3471e(modifierM3486a);
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierMo3471e11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d11);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11);
                    content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                }
                modifier5 = modifier3;
                modifier6 = modifier4;
                z15 = z13;
                num3 = num2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            num2 = num;
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(content)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i15 |= i28;
            }
            i26 = i15;
            if ((599187 & i15) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i26 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier3 = c2314t;
                }
                if (i16 != 0) {
                    modifier4 = c2314t;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if (i24 != 0) {
                    num2 = null;
                }
                if (num2 != null) {
                    int iIntValue12 = num2.intValue();
                    numM59777u = state.m59777u();
                    if (numM59777u == null) {
                        zM65745e = false;
                    } else {
                        zM65745e = true;
                    }
                } else {
                    zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                }
                C28676v0 c28676v11 = C28635l.f115821a;
                if (zM65745e) {
                    c28655q.m87150e0(222291102);
                    Modifier modifierM7154a113 = AbstractC2294a.m7154a(1.0f, c2314t);
                    if ((i26 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i2 = z17 | c28655q.m87157i(state);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i311116 = 0;
                        objM87133R2 = new Function1() { // from class: j31.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i311116) {
                                    case 0:
                                        return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                    default:
                                        return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i311117 = 0;
                        objM87133R2 = new Function1() { // from class: j31.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i311117) {
                                    case 0:
                                        return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                    default:
                                        return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM3486a = AbstractC1127a.m3486a(modifierM7154a113, (Function1) objM87133R2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(222648873);
                    if (num2 != null) {
                        position2 = state.getDragCancelledAnimation().getPosition();
                        i27 = 57344;
                        if (position2 == null) {
                            zM65745e2 = false;
                        } else {
                            zM65745e2 = false;
                        }
                    } else {
                        i27 = 57344;
                        position = state.getDragCancelledAnimation().getPosition();
                        if (position != null) {
                            objM59693d = position.m59693d();
                        } else {
                            objM59693d = null;
                        }
                        zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                    }
                    if (zM65745e2) {
                        c28655q.m87150e0(222880195);
                        Modifier modifierM7154a114 = AbstractC2294a.m7154a(1.0f, c2314t);
                        if ((i26 & i27) == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zM87157i = z16 | c28655q.m87157i(state);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i) {
                            final int i311118 = 1;
                            objM87133R = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i311118) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        } else {
                            final int i311119 = 1;
                            objM87133R = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i311119) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        modifierM3486a = AbstractC1127a.m3486a(modifierM7154a114, (Function1) objM87133R);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(223274174);
                        c28655q.m87173q(false);
                        modifierM3486a = modifier4;
                    }
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3471e12 = modifier3.mo3471e(modifierM3486a);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierMo3471e12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            modifier5 = modifier3;
            modifier6 = modifier4;
            z15 = z13;
            num3 = num2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
            }
        }
        i15 |= 3072;
        modifier4 = modifier2;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    num2 = num;
                    if (c28655q.m87153g(num2)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(content)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i15 |= i28;
                }
                i26 = i15;
                if ((599187 & i15) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i26 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i16 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        int iIntValue13 = num2.intValue();
                        numM59777u = state.m59777u();
                        if (numM59777u == null) {
                            zM65745e = false;
                        } else {
                            zM65745e = true;
                        }
                    } else {
                        zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                    }
                    C28676v0 c28676v12 = C28635l.f115821a;
                    if (zM65745e) {
                        c28655q.m87150e0(222291102);
                        Modifier modifierM7154a115 = AbstractC2294a.m7154a(1.0f, c2314t);
                        if ((i26 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i2 = z17 | c28655q.m87157i(state);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i2) {
                            final int i3111110 = 0;
                            objM87133R2 = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i3111110) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i3111111 = 0;
                            objM87133R2 = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i3111111) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM3486a = AbstractC1127a.m3486a(modifierM7154a115, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(222648873);
                        if (num2 != null) {
                            position2 = state.getDragCancelledAnimation().getPosition();
                            i27 = 57344;
                            if (position2 == null) {
                                zM65745e2 = false;
                            } else {
                                zM65745e2 = false;
                            }
                        } else {
                            i27 = 57344;
                            position = state.getDragCancelledAnimation().getPosition();
                            if (position != null) {
                                objM59693d = position.m59693d();
                            } else {
                                objM59693d = null;
                            }
                            zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                        }
                        if (zM65745e2) {
                            c28655q.m87150e0(222880195);
                            Modifier modifierM7154a116 = AbstractC2294a.m7154a(1.0f, c2314t);
                            if ((i26 & i27) == 16384) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            zM87157i = z16 | c28655q.m87157i(state);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                final int i3111112 = 1;
                                objM87133R = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i3111112) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            } else {
                                final int i3111113 = 1;
                                objM87133R = new Function1() { // from class: j31.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        switch (i3111113) {
                                            case 0:
                                                return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                            default:
                                                return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            }
                            modifierM3486a = AbstractC1127a.m3486a(modifierM7154a116, (Function1) objM87133R);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(223274174);
                            c28655q.m87173q(false);
                            modifierM3486a = modifier4;
                        }
                        c28655q.m87173q(false);
                    }
                    Modifier modifierMo3471e13 = modifier3.mo3471e(modifierM3486a);
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierMo3471e13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d13);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                    content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                }
                modifier5 = modifier3;
                modifier6 = modifier4;
                z15 = z13;
                num3 = num2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            num2 = num;
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(content)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i15 |= i28;
            }
            i26 = i15;
            if ((599187 & i15) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i26 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier3 = c2314t;
                }
                if (i16 != 0) {
                    modifier4 = c2314t;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if (i24 != 0) {
                    num2 = null;
                }
                if (num2 != null) {
                    int iIntValue14 = num2.intValue();
                    numM59777u = state.m59777u();
                    if (numM59777u == null) {
                        zM65745e = false;
                    } else {
                        zM65745e = true;
                    }
                } else {
                    zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                }
                C28676v0 c28676v13 = C28635l.f115821a;
                if (zM65745e) {
                    c28655q.m87150e0(222291102);
                    Modifier modifierM7154a117 = AbstractC2294a.m7154a(1.0f, c2314t);
                    if ((i26 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i2 = z17 | c28655q.m87157i(state);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i3111114 = 0;
                        objM87133R2 = new Function1() { // from class: j31.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i3111114) {
                                    case 0:
                                        return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                    default:
                                        return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i3111115 = 0;
                        objM87133R2 = new Function1() { // from class: j31.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i3111115) {
                                    case 0:
                                        return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                    default:
                                        return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM3486a = AbstractC1127a.m3486a(modifierM7154a117, (Function1) objM87133R2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(222648873);
                    if (num2 != null) {
                        position2 = state.getDragCancelledAnimation().getPosition();
                        i27 = 57344;
                        if (position2 == null) {
                            zM65745e2 = false;
                        } else {
                            zM65745e2 = false;
                        }
                    } else {
                        i27 = 57344;
                        position = state.getDragCancelledAnimation().getPosition();
                        if (position != null) {
                            objM59693d = position.m59693d();
                        } else {
                            objM59693d = null;
                        }
                        zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                    }
                    if (zM65745e2) {
                        c28655q.m87150e0(222880195);
                        Modifier modifierM7154a118 = AbstractC2294a.m7154a(1.0f, c2314t);
                        if ((i26 & i27) == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zM87157i = z16 | c28655q.m87157i(state);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i) {
                            final int i3111116 = 1;
                            objM87133R = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i3111116) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        } else {
                            final int i3111117 = 1;
                            objM87133R = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i3111117) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        modifierM3486a = AbstractC1127a.m3486a(modifierM7154a118, (Function1) objM87133R);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(223274174);
                        c28655q.m87173q(false);
                        modifierM3486a = modifier4;
                    }
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3471e14 = modifier3.mo3471e(modifierM3486a);
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierMo3471e14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m14);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N14);
                content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            modifier5 = modifier3;
            modifier6 = modifier4;
            z15 = z13;
            num3 = num2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
            }
        }
        i15 |= 24576;
        z13 = z4;
        i24 = i14 & 32;
        if (i24 != 0) {
            if ((196608 & i13) == 0) {
                num2 = num;
                if (c28655q.m87153g(num2)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(content)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i15 |= i28;
            }
            i26 = i15;
            if ((599187 & i15) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i26 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier3 = c2314t;
                }
                if (i16 != 0) {
                    modifier4 = c2314t;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if (i24 != 0) {
                    num2 = null;
                }
                if (num2 != null) {
                    int iIntValue15 = num2.intValue();
                    numM59777u = state.m59777u();
                    if (numM59777u == null) {
                        zM65745e = false;
                    } else {
                        zM65745e = true;
                    }
                } else {
                    zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
                }
                C28676v0 c28676v14 = C28635l.f115821a;
                if (zM65745e) {
                    c28655q.m87150e0(222291102);
                    Modifier modifierM7154a119 = AbstractC2294a.m7154a(1.0f, c2314t);
                    if ((i26 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i2 = z17 | c28655q.m87157i(state);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i3111118 = 0;
                        objM87133R2 = new Function1() { // from class: j31.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i3111118) {
                                    case 0:
                                        return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                    default:
                                        return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i3111119 = 0;
                        objM87133R2 = new Function1() { // from class: j31.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i3111119) {
                                    case 0:
                                        return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                    default:
                                        return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM3486a = AbstractC1127a.m3486a(modifierM7154a119, (Function1) objM87133R2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(222648873);
                    if (num2 != null) {
                        position2 = state.getDragCancelledAnimation().getPosition();
                        i27 = 57344;
                        if (position2 == null) {
                            zM65745e2 = false;
                        } else {
                            zM65745e2 = false;
                        }
                    } else {
                        i27 = 57344;
                        position = state.getDragCancelledAnimation().getPosition();
                        if (position != null) {
                            objM59693d = position.m59693d();
                        } else {
                            objM59693d = null;
                        }
                        zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                    }
                    if (zM65745e2) {
                        c28655q.m87150e0(222880195);
                        Modifier modifierM7154a1110 = AbstractC2294a.m7154a(1.0f, c2314t);
                        if ((i26 & i27) == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zM87157i = z16 | c28655q.m87157i(state);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i) {
                            final int i31111110 = 1;
                            objM87133R = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i31111110) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        } else {
                            final int i31111111 = 1;
                            objM87133R = new Function1() { // from class: j31.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i31111111) {
                                        case 0:
                                            return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                        default:
                                            return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        modifierM3486a = AbstractC1127a.m3486a(modifierM7154a1110, (Function1) objM87133R);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(223274174);
                        c28655q.m87173q(false);
                        modifierM3486a = modifier4;
                    }
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3471e15 = modifier3.mo3471e(modifierM3486a);
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierMo3471e15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d15);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N15);
                content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            modifier5 = modifier3;
            modifier6 = modifier4;
            z15 = z13;
            num3 = num2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        num2 = num;
        if ((1572864 & i13) == 0) {
            if (c28655q.m87157i(content)) {
                i28 = 1048576;
            } else {
                i28 = 524288;
            }
            i15 |= i28;
        }
        i26 = i15;
        if ((599187 & i15) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i26 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                modifier3 = c2314t;
            }
            if (i16 != 0) {
                modifier4 = c2314t;
            }
            if (i18 != 0) {
                z13 = true;
            }
            if (i24 != 0) {
                num2 = null;
            }
            if (num2 != null) {
                int iIntValue16 = num2.intValue();
                numM59777u = state.m59777u();
                if (numM59777u == null) {
                    zM65745e = false;
                } else {
                    zM65745e = true;
                }
            } else {
                zM65745e = AbstractC22676k.m65745e(obj, state.m59778v());
            }
            C28676v0 c28676v15 = C28635l.f115821a;
            if (zM65745e) {
                c28655q.m87150e0(222291102);
                Modifier modifierM7154a1111 = AbstractC2294a.m7154a(1.0f, c2314t);
                if ((i26 & 57344) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i2 = z17 | c28655q.m87157i(state);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2) {
                    final int i31111112 = 0;
                    objM87133R2 = new Function1() { // from class: j31.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i31111112) {
                                case 0:
                                    return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                default:
                                    return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    final int i31111113 = 0;
                    objM87133R2 = new Function1() { // from class: j31.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i31111113) {
                                case 0:
                                    return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                default:
                                    return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                modifierM3486a = AbstractC1127a.m3486a(modifierM7154a1111, (Function1) objM87133R2);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(222648873);
                if (num2 != null) {
                    position2 = state.getDragCancelledAnimation().getPosition();
                    i27 = 57344;
                    if (position2 == null) {
                        zM65745e2 = false;
                    } else {
                        zM65745e2 = false;
                    }
                } else {
                    i27 = 57344;
                    position = state.getDragCancelledAnimation().getPosition();
                    if (position != null) {
                        objM59693d = position.m59693d();
                    } else {
                        objM59693d = null;
                    }
                    zM65745e2 = AbstractC22676k.m65745e(obj, objM59693d);
                }
                if (zM65745e2) {
                    c28655q.m87150e0(222880195);
                    Modifier modifierM7154a1112 = AbstractC2294a.m7154a(1.0f, c2314t);
                    if ((i26 & i27) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87157i = z16 | c28655q.m87157i(state);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        final int i31111114 = 1;
                        objM87133R = new Function1() { // from class: j31.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i31111114) {
                                    case 0:
                                        return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                    default:
                                        return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i31111115 = 1;
                        objM87133R = new Function1() { // from class: j31.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i31111115) {
                                    case 0:
                                        return AbstractC21275f.m59701h(z13, state, (InterfaceC17886g0) obj2);
                                    default:
                                        return AbstractC21275f.m59702i(z13, state, (InterfaceC17886g0) obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    modifierM3486a = AbstractC1127a.m3486a(modifierM7154a1112, (Function1) objM87133R);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(223274174);
                    c28655q.m87173q(false);
                    modifierM3486a = modifier4;
                }
                c28655q.m87173q(false);
            }
            Modifier modifierMo3471e16 = modifier3.mo3471e(modifierM3486a);
            InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierMo3471e16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d16);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
            content.invoke(C1100b.f4583a, Boolean.valueOf(zM65745e), c28655q, Integer.valueOf(((i26 >> 12) & 896) | 6));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        modifier5 = modifier3;
        modifier6 = modifier4;
        z15 = z13;
        num3 = num2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3922f(state, obj, modifier5, modifier6, z15, num3, content, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m59700g(InterfaceC1103a interfaceC1103a, AbstractC21282m abstractC21282m, Object obj, Modifier modifier, Integer num, boolean z4, InterfaceC4352n interfaceC4352n, int i13, int i14, Composer composer, int i15) {
        m59698e(interfaceC1103a, abstractC21282m, obj, modifier, num, z4, interfaceC4352n, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m59701h(boolean z4, AbstractC21282m abstractC21282m, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51549C((z4 && abstractC21282m.mo59728O()) ? 0.0f : abstractC21282m.m59779w());
        c17920x0.m51550E((!z4 || abstractC21282m.mo59728O()) ? abstractC21282m.m59780x() : 0.0f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m59702i(boolean z4, AbstractC21282m abstractC21282m, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51549C((z4 && abstractC21282m.mo59728O()) ? 0.0f : Float.intBitsToFloat((int) (abstractC21282m.getDragCancelledAnimation().mo59684a() >> 32)));
        c17920x0.m51550E((!z4 || abstractC21282m.mo59728O()) ? Float.intBitsToFloat((int) (abstractC21282m.getDragCancelledAnimation().mo59684a() & 4294967295L)) : 0.0f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m59703j(AbstractC21282m abstractC21282m, Object obj, Modifier modifier, Modifier modifier2, boolean z4, Integer num, InterfaceC4352n interfaceC4352n, int i13, int i14, Composer composer, int i15) {
        m59699f(abstractC21282m, obj, modifier, modifier2, z4, num, interfaceC4352n, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
