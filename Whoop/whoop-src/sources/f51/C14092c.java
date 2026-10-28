package f51;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import f01.C13865h1;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25297f;

/* JADX INFO: renamed from: f51.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lf51/c;", "Lm91/f;", "Lf51/e;", "Lm91/p;", "itemViewFactory", "<init>", "(Lm91/p;)V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "b", "(Landroidx/compose/ui/Modifier;Lf51/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "a", "Lm91/p;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14092c implements InterfaceC25297f<C14094e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C25307p itemViewFactory;

    public C14092c(C25307p c25307p) {
        this.itemViewFactory = c25307p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m40127c(C14092c c14092c, Modifier modifier, C14094e c14094e, Function1 function1, int i13, Composer composer, int i14) {
        c14092c.Compose(modifier, c14094e, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C14094e itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(941189134);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(this) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C25307p c25307p = this.itemViewFactory;
            if (c25307p == null) {
                c28655q.m87150e0(-1755333035);
                c25307p = (C25307p) c28655q.m87161k(AbstractC25303l.m74272C());
            } else {
                c28655q.m87150e0(-1755334275);
            }
            c28655q.m87173q(false);
            AbstractC14093d.m40136h(modifier, itemState, c25307p, onViewEvent, c28655q, ((i14 << 3) & 7168) | (i14 & 126), 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13865h1(this, modifier, itemState, onViewEvent, i13, 7);
        }
    }

    public /* synthetic */ C14092c(C25307p c25307p, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c25307p);
    }
}
