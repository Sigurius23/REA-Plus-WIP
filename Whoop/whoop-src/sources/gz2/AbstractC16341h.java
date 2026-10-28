package gz2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.C4055k0;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import p026b2.C2314t;
import p178gz.C16283a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;
import y71.C39274g;
import yw2.AbstractC39833e;

/* JADX INFO: renamed from: gz2.h */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "toolbarTitle", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/whoop/whooplabs/feature/navigation/c;", "Ll83/a0;", "onBack", "c", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16341h {
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m46556c(String toolbarTitle, Modifier modifier, Function1 onBack, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        boolean z13;
        Object objM87133R;
        int i16;
        AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
        AbstractC22676k.m65750j(onBack, "onBack");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1789926098);
        int i17 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(toolbarTitle) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(onBack)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i15 |= i16;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(toolbarTitle), null, new C39274g(AbstractC18489d0.m53357C(C38072d.f163053a), new TextResource.C8688b(AbstractC39833e.f171716a, null, i17, 0 == true ? 1 : 0)), null, null, null, false, null, null, null, null, null, null, null, null, 32762, null);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C16283a(onBack, 3);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC6719b.m20143d(modifier4, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, ((i15 >> 3) & 14) | (AbstractC6721d.a.f25641r << 3), 52);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4055k0(toolbarTitle, modifier3, onBack, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(onBack)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21278l(toolbarTitle), null, new C39274g(AbstractC18489d0.m53357C(C38072d.f163053a), new TextResource.C8688b(AbstractC39833e.f171716a, null, i17, 0 == true ? 1 : 0)), null, null, null, false, null, null, null, null, null, null, null, null, 32762, null);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C16283a(onBack, 3);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C16283a(onBack, 3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifier4, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, ((i15 >> 3) & 14) | (AbstractC6721d.a.f25641r << 3), 52);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4055k0(toolbarTitle, modifier3, onBack, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m46557d(Function1 function1) {
        function1.invoke(AbstractC10840c.b.f33257a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m46558e(String str, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m46556c(str, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
