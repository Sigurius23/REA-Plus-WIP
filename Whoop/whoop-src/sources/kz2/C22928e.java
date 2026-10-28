package kz2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import d11.C11469d;
import d11.C11474i;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import j41.C21313a;
import kx1.C22881b;
import l83.C23454a0;
import mh.C25540h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import p745y81.C39336i;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: kz2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lkz2/e;", "Lm91/f;", "Ld11/i;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ld11/d;", "a", "Ld11/d;", "ctaTileItem", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22928e implements InterfaceC25297f<C11474i> {

    /* JADX INFO: renamed from: b */
    public static final int f90501b = C11469d.f36809a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C11469d ctaTileItem = new C11469d();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final AbstractC17911t m66692e(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(856691992)), new C17919x(AbstractC17918w0.m51515c(856691992))), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m66693f(C25540h copy) {
        AbstractC22676k.m65750j(copy, "$this$copy");
        copy.m75118b();
        copy.m75119c(500);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m66694g(C22928e c22928e, Modifier modifier, C11474i c11474i, Function1 function1, int i13, Composer composer, int i14) {
        c22928e.Compose(modifier, c11474i, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C11474i itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2084915841);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(itemState) : c28655q2.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q2.m87153g(this) : c28655q2.m87157i(this) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C11469d c11469d = this.ctaTileItem;
            Modifier modifierM3413j = AbstractC1102d.m3413j(modifier, 30 * 4, 0.0f, 2);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C22881b(3);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC18247a abstractC18247aM52572j = AbstractC18249c.m52572j((Function1) objM87133R);
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C22881b(4);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q = c28655q2;
            c11469d.Compose(modifierM3413j, C11474i.m30808f(itemState, null, null, null, null, null, null, null, null, null, null, (Function1) objM87133R2, false, false, null, null, null, false, false, null, abstractC18247aM52572j, null, null, 0.0f, 0.0f, 0.0f, 0.0f, Float.NaN, null, null, 469236735, null), onViewEvent, c28655q, (i14 & 896) | (C11474i.f36854E << 3) | (C11469d.f36809a << 9));
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21313a(this, modifier, itemState, onViewEvent, i13, 25);
        }
    }
}
