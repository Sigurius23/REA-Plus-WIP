package v61;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import az0.C2158a;
import b11.C2275b;
import j71.AbstractC21394b;
import java.util.List;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import to1.C34015h;
import x61.C38024b;
import y61.C39260a;

/* JADX INFO: renamed from: v61.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lj71/b$i;", "plotState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lj71/b$i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35741f {
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m113220d(Modifier modifier, AbstractC21394b.i plotState, Function1 function1, Composer composer, int i13, int i14) {
        Function1 function2;
        boolean z4;
        Modifier modifier2;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Context context;
        float f13;
        List<C39260a> listM60086h;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(plotState, "plotState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1306408383);
        int i15 = (i13 & 48) == 0 ? (c28655q.m87157i(plotState) ? 32 : 16) | i13 : i13;
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 145) != 144) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if ((i14 & 1) != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C34015h(25);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                f13 = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                if (plotState.getDynamicGrouping().getIsEnabled()) {
                    listM60086h = new C38024b(plotState.m60086h(), null, context, null, plotState.getDynamicGrouping().getParentWidth(), f13, 10, null).m121751b();
                } else {
                    listM60086h = plotState.m60086h();
                }
                for (C39260a c39260a : listM60086h) {
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C2275b(function3, 16);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC35738c.m113205c(c39260a, (Function1) objM87133R, c28655q, 0, 0);
                }
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2158a(modifier2, plotState, function3, i13, i14, 10);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 145) != 144) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if ((i14 & 1) != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C34015h(25);
                    c28655q.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function2;
            }
            context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            f13 = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
            if (plotState.getDynamicGrouping().getIsEnabled()) {
                listM60086h = new C38024b(plotState.m60086h(), null, context, null, plotState.getDynamicGrouping().getParentWidth(), f13, 10, null).m121751b();
            } else {
                listM60086h = plotState.m60086h();
            }
            while (r6.hasNext()) {
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C2275b(function3, 16);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2275b(function3, 16);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC35738c.m113205c(c39260a, (Function1) objM87133R, c28655q, 0, 0);
            }
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2158a(modifier2, plotState, function3, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m113221e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m113222f(Function1 function1, C35736a it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m113223g(Modifier modifier, AbstractC21394b.i iVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m113220d(modifier, iVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
