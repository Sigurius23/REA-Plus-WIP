package p700bd1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.C22931l;
import p000.C24827m;
import p025b1.C2217h;
import p026b2.C2314t;
import p163g1.AbstractC15011f9;
import p291l0.AbstractC22953f;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import x81.C38072d;

/* JADX INFO: renamed from: bd1.m */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0017¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lbd1/m;", "Lm91/f;", "Lbd1/n;", "<init>", "()V", "Lny0/q;", "type", "", "i", "(Lny0/q;)Ljava/lang/String;", "", "enabled", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Z)Ljava/lang/String;", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lbd1/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3095m implements InterfaceC25297f<C3096n> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m8874e(C3096n c3096n, C3095m c3095m, InterfaceC23013y GalleryColumnCard, Composer composer, int i13) {
        AbstractC22676k.m65750j(GalleryColumnCard, "$this$GalleryColumnCard");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C27270o state = c3096n.getState();
            String strM53370k = AbstractC18489d0.m53370k(c3095m.m8878i(c3096n.getState().m82251m()), " ", c3095m.m8877h(c3096n.getState().m82249k()));
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C2217h(26);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(state, strM53370k, null, null, (InterfaceC4339a) objM87133R, c28655q, C27270o.f109105k | 24576, 12);
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13 * f13, c2314t));
            String strM8878i = c3095m.m8878i(c3096n.getState().m82251m());
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC15011f9.m43114b(strM8878i, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 0, 0, 131066);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f13, c2314t));
            AbstractC15011f9.m43114b(c3095m.m8877h(c3096n.getState().m82249k()), null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 0, 0, 131066);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m8875f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m8876g(C3095m c3095m, Modifier modifier, C3096n c3096n, Function1 function1, int i13, Composer composer, int i14) {
        c3095m.Compose(modifier, c3096n, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private final String m8877h(boolean enabled) {
        return enabled ? "Enabled" : "Disabled";
    }

    /* JADX INFO: renamed from: i */
    private final String m8878i(AbstractC27274q type) {
        if (AbstractC22676k.m65745e(type, AbstractC27274q.c.f109140f)) {
            return "Primary Small";
        }
        if (AbstractC22676k.m65745e(type, AbstractC27274q.b.f109138f)) {
            return "Primary Medium";
        }
        if (AbstractC22676k.m65745e(type, AbstractC27274q.a.f109136f)) {
            return "Primary Large";
        }
        if (AbstractC22676k.m65745e(type, AbstractC27274q.g.f109144f)) {
            return "Secondary Small";
        }
        if (AbstractC22676k.m65745e(type, AbstractC27274q.e.f109142f)) {
            return "Secondary Medium";
        }
        if (AbstractC22676k.m65745e(type, AbstractC27274q.d.f109141f)) {
            return "Secondary Extra Small";
        }
        if (AbstractC22676k.m65745e(type, AbstractC27274q.f.f109143f)) {
            return "Secondary Medium V2";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C3096n itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-124803514);
        if ((i13 & 48) == 0) {
            i14 = ((i13 & 64) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 32 : 16) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(this) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1041) != 1040)) {
            Function1.m8863c(AbstractC37817c.m121344e(-642393597, c28655q, new C22931l(5, itemState, this)), c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24827m(this, modifier, itemState, onViewEvent, i13, 22);
        }
    }
}
