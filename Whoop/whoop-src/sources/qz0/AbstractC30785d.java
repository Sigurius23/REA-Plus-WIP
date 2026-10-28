package qz0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.Locale;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qb0.C30179a;
import x81.C38072d;

/* JADX INFO: renamed from: qz0.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "label", "Landroidx/compose/ui/Modifier;", "modifier", "Lb91/a;", "labelTextStyle", "Ll83/a0;", "b", "(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30785d {
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m94660b(TextResource label, Modifier modifier, C2886a c2886a, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        C2886a c2886a2;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C2886a c2886a3;
        Modifier modifier5;
        int i16;
        boolean zM87157i;
        C2886a formLabel = c2886a;
        AbstractC22676k.m65750j(label, "label");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-64048557);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(label) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i14 & 4) != 0) {
                    i16 = 128;
                } else {
                    if ((i13 & 512) == 0) {
                        zM87157i = c28655q2.m87153g(formLabel);
                    } else {
                        zM87157i = c28655q2.m87157i(formLabel);
                    }
                    if (zM87157i) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                }
                i15 |= i16;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                    if (i17 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i14 & 4) != 0) {
                        formLabel = C38072d.f163053a.m121952e(c28655q2, 6).getFormLabel();
                        i15 &= -897;
                    }
                    c2886a3 = formLabel;
                    modifier5 = modifier4;
                } else {
                    c28655q2.m87138X();
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                    c2886a3 = formLabel;
                    modifier5 = modifier2;
                }
                c28655q2.m87175r();
                String upperCase = AbstractC8693b.m21274h(label, c28655q2, i15 & 14).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                float f13 = 4;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(upperCase, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, modifier5), 1 * f13, 2 * f13), C38072d.f163053a.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a3, null, c28655q, 0, (i15 << 12) & 3670016, 196600);
                modifier3 = modifier5;
                c2886a2 = c2886a3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c2886a2 = formLabel;
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(label, modifier3, c2886a2, i13, i14, 18);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if ((i14 & 4) != 0) {
                i16 = 128;
            } else {
                if ((i13 & 512) == 0) {
                    zM87157i = c28655q2.m87153g(formLabel);
                } else {
                    zM87157i = c28655q2.m87157i(formLabel);
                }
                if (zM87157i) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
            }
            i15 |= i16;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                if (i17 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 4) != 0) {
                    formLabel = C38072d.f163053a.m121952e(c28655q2, 6).getFormLabel();
                    i15 &= -897;
                }
                c2886a3 = formLabel;
                modifier5 = modifier4;
            } else {
                if (i17 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 4) != 0) {
                    formLabel = C38072d.f163053a.m121952e(c28655q2, 6).getFormLabel();
                    i15 &= -897;
                }
                c2886a3 = formLabel;
                modifier5 = modifier4;
            }
            c28655q2.m87175r();
            String upperCase2 = AbstractC8693b.m21274h(label, c28655q2, i15 & 14).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            float f14 = 4;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(upperCase2, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, modifier5), 1 * f14, 2 * f14), C38072d.f163053a.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a3, null, c28655q, 0, (i15 << 12) & 3670016, 196600);
            modifier3 = modifier5;
            c2886a2 = c2886a3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            c2886a2 = formLabel;
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(label, modifier3, c2886a2, i13, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m94661c(TextResource textResource, Modifier modifier, C2886a c2886a, int i13, int i14, Composer composer, int i15) {
        m94660b(textResource, modifier, c2886a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
