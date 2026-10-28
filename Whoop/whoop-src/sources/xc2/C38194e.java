package xc2;

import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import vc2.AbstractC35880c;

/* JADX INFO: renamed from: xc2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lxc2/e;", "", "<init>", "()V", "Lvc2/c;", "result", "Lxc2/d;", "a", "(Lvc2/c;)Lxc2/d;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38194e {
    /* JADX INFO: renamed from: a */
    public final InterfaceC38193d m122332a(AbstractC35880c result) {
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof AbstractC35880c.a) {
            AbstractC35880c.a aVar = (AbstractC35880c.a) result;
            return new InterfaceC38193d.a(aVar.getError(), aVar.getPlan());
        }
        if (result instanceof AbstractC35880c.b) {
            AbstractC35880c.b bVar = (AbstractC35880c.b) result;
            return new InterfaceC38193d.b(bVar.getResult().getTitle(), bVar.getResult().getSubtitle(), bVar.getResult().getAcceptButton().getText(), bVar.getResult().getRejectButton().getText(), bVar.getPlan());
        }
        if (result instanceof AbstractC35880c.c) {
            return InterfaceC38193d.c.f163559a;
        }
        if (!(result instanceof AbstractC35880c.d)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC35880c.d dVar = (AbstractC35880c.d) result;
        return new InterfaceC38193d.d(dVar.getResult().getSuccessText(), dVar.getResult().getSuccessSubtext());
    }
}
