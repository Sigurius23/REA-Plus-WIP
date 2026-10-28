package fs2;

import androidx.compose.runtime.Composer;
import ar2.C1935f;
import c93.InterfaceC4339a;
import cy1.C11186b;
import hs2.C17608b;
import hs2.C17609c;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fs2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lfs2/e;", "Lfs2/m;", "<init>", "()V", "Lkotlin/Function0;", "Ll83/a0;", "onLeaveCompleted", "Lhs2/c;", "participants", "b", "(Lc93/a;Lhs2/c;Landroidx/compose/runtime/Composer;I)V", "Lhs2/b;", "localParticipant", "", "arePermissionsEnabled", "a", "(Lhs2/b;ZLandroidx/compose/runtime/Composer;I)V", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14752e implements InterfaceC14760m {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m42297e(C14752e c14752e, InterfaceC4339a interfaceC4339a, C17609c c17609c, int i13, Composer composer, int i14) {
        c14752e.mo42300b(interfaceC4339a, c17609c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m42298f(C14752e c14752e, C17608b c17608b, boolean z4, int i13, Composer composer, int i14) {
        c14752e.mo42299a(c17608b, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // fs2.InterfaceC14760m
    /* JADX INFO: renamed from: a */
    public void mo42299a(C17608b localParticipant, boolean z4, Composer composer, int i13) {
        AbstractC22676k.m65750j(localParticipant, "localParticipant");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(380962869);
        int i14 = i13 & 1;
        if (!c28655q.m87135U(i14, i14 != 0)) {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(this, localParticipant, z4, i13, 14);
        }
    }

    @Override // fs2.InterfaceC14760m
    /* JADX INFO: renamed from: b */
    public void mo42300b(InterfaceC4339a onLeaveCompleted, C17609c participants, Composer composer, int i13) {
        AbstractC22676k.m65750j(onLeaveCompleted, "onLeaveCompleted");
        AbstractC22676k.m65750j(participants, "participants");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1762295288);
        int i14 = i13 & 1;
        if (!c28655q.m87135U(i14, i14 != 0)) {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(this, onLeaveCompleted, participants, i13, 15);
        }
    }
}
