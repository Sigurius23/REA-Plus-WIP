package p700bd1;

import a80.C0542f;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aq1.C1910d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.C24827m;
import p163g1.AbstractC15011f9;
import p291l0.InterfaceC22997s1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import pz0.AbstractC29641d;
import x81.C38072d;

/* JADX INFO: renamed from: bd1.v */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0017¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lbd1/v;", "Lm91/f;", "Lbd1/w;", "<init>", "()V", "", "enabled", "isChecked", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ZZ)Ljava/lang/String;", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lbd1/w;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3104v implements InterfaceC25297f<C3105w> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m8914e(InterfaceC28601c1 interfaceC28601c1, C3105w c3105w, C3104v c3104v, InterfaceC22997s1 GalleryRowCard, Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c2;
        AbstractC22676k.m65750j(GalleryRowCard, "$this$GalleryRowCard");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            boolean enabled = c3105w.getEnabled();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R = new C1910d(6, interfaceC28601c2);
                c28655q.m87172p0(objM87133R);
            } else {
                interfaceC28601c2 = interfaceC28601c1;
            }
            AbstractC29641d.m91043e(null, zBooleanValue, enabled, 0L, null, null, (Function1) objM87133R, c28655q, 1572864, 57);
            AbstractC15011f9.m43114b(c3104v.m8917h(c3105w.getEnabled(), ((Boolean) interfaceC28601c2.getValue()).booleanValue()), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 0, 0, 131066);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m8915f(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m8916g(C3104v c3104v, Modifier modifier, C3105w c3105w, Function1 function1, int i13, Composer composer, int i14) {
        c3104v.Compose(modifier, c3105w, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private final String m8917h(boolean enabled, boolean isChecked) {
        if (enabled && isChecked) {
            return "Checked";
        }
        if (!enabled || isChecked) {
            return (enabled || !isChecked) ? "Unchecked - Disabled" : "Checked - Disabled";
        }
        return "Unchecked";
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C3105w itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-153504149);
        if ((i13 & 48) == 0) {
            i14 = (c28655q.m87153g(itemState) ? 32 : 16) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(this) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1041) != 1040)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(itemState.getChecked()));
                c28655q.m87172p0(objM87133R);
            }
            AbstractC42782p.m8885c(AbstractC37817c.m121344e(-1108904584, c28655q, new C0542f((InterfaceC28601c1) objM87133R, itemState, this, 3)), c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24827m(this, modifier, itemState, onViewEvent, i13, 24);
        }
    }
}
