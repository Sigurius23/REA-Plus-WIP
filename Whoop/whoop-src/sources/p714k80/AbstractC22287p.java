package p714k80;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import by1.C3696c;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import jp1.C21852d;
import jx2.C22038b;
import l83.C23454a0;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15011f9;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.InterfaceC22997s1;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x60.AbstractC38022b;
import x81.C38072d;

/* JADX INFO: renamed from: k80.p */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "buttonText", "", "testTag", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "d", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22287p {
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m64027d(TextResource textResource, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        String str3;
        InterfaceC4339a interfaceC4339a3;
        TextResource textResource2;
        C28677v1 c28677v1M87180u;
        String str4;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        TextResource textResource3 = textResource;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1778975659);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(textResource3) : c28655q.m87157i(textResource3) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i18 != 0) {
                        textResource3 = null;
                    }
                    if (i19 != 0) {
                        str4 = "Forgot Password Button Tag";
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C22038b(12);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    AbstractC12350b.m34583d(interfaceC4339a4, AbstractC1136a.m3599a(C2314t.f9131w, str4), false, null, null, null, AbstractC1099a.m3379a(0.0f, 0.0f, 3), AbstractC37817c.m121344e(-1467444722, c28655q, new C3696c(textResource3, 3)), c28655q, ((i15 >> 6) & 14) | 905969664, 252);
                    str3 = str4;
                    interfaceC4339a3 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                textResource2 = textResource3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21852d(textResource2, str3, interfaceC4339a3, i13, i14, 9);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    textResource3 = null;
                }
                if (i19 != 0) {
                    str4 = "Forgot Password Button Tag";
                } else {
                    str4 = str2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C22038b(12);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                AbstractC12350b.m34583d(interfaceC4339a4, AbstractC1136a.m3599a(C2314t.f9131w, str4), false, null, null, null, AbstractC1099a.m3379a(0.0f, 0.0f, 3), AbstractC37817c.m121344e(-1467444722, c28655q, new C3696c(textResource3, 3)), c28655q, ((i15 >> 6) & 14) | 905969664, 252);
                str3 = str4;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                str3 = str2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            textResource2 = textResource3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(textResource2, str3, interfaceC4339a3, i13, i14, 9);
            }
        }
        i15 |= 48;
        str2 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    textResource3 = null;
                }
                if (i19 != 0) {
                    str4 = "Forgot Password Button Tag";
                } else {
                    str4 = str2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C22038b(12);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                AbstractC12350b.m34583d(interfaceC4339a4, AbstractC1136a.m3599a(C2314t.f9131w, str4), false, null, null, null, AbstractC1099a.m3379a(0.0f, 0.0f, 3), AbstractC37817c.m121344e(-1467444722, c28655q, new C3696c(textResource3, 3)), c28655q, ((i15 >> 6) & 14) | 905969664, 252);
                str3 = str4;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                str3 = str2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            textResource2 = textResource3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(textResource2, str3, interfaceC4339a3, i13, i14, 9);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                textResource3 = null;
            }
            if (i19 != 0) {
                str4 = "Forgot Password Button Tag";
            } else {
                str4 = str2;
            }
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C22038b(12);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            AbstractC12350b.m34583d(interfaceC4339a4, AbstractC1136a.m3599a(C2314t.f9131w, str4), false, null, null, null, AbstractC1099a.m3379a(0.0f, 0.0f, 3), AbstractC37817c.m121344e(-1467444722, c28655q, new C3696c(textResource3, 3)), c28655q, ((i15 >> 6) & 14) | 905969664, 252);
            str3 = str4;
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            str3 = str2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        textResource2 = textResource3;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(textResource2, str3, interfaceC4339a3, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m64028e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m64029f(TextResource textResource, InterfaceC22997s1 TextButton, Composer composer, int i13) {
        String strM21274h;
        AbstractC22676k.m65750j(TextButton, "$this$TextButton");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            if (textResource == null) {
                c28655q.m87150e0(1826440499);
                c28655q.m87173q(false);
                strM21274h = null;
            } else {
                c28655q.m87150e0(1826440500);
                strM21274h = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable);
                c28655q.m87173q(false);
            }
            if (strM21274h == null) {
                c28655q.m87150e0(-1465102041);
                strM21274h = AbstractC8693b.m21273g(AbstractC38022b.f162913x, c28655q, 0);
            } else {
                c28655q.m87150e0(-1465103529);
            }
            c28655q.m87173q(false);
            AbstractC15011f9.m43114b(strM21274h, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67363a(C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getBtS().getStyle(), C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4278227943L)), new C17919x(AbstractC17918w0.m51517e(4283210713L)), new C17919x(AbstractC17918w0.m51517e(4284923135L))), 0L, 0L, 14), 0L, null, null, 0L, 33554430), c28655q, 0, 0, 65534);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m64030g(TextResource textResource, String str, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m64027d(textResource, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
