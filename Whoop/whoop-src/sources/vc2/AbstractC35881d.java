package vc2;

import p715kotlin.Metadata;
import xc2.InterfaceC38193d;

/* JADX INFO: renamed from: vc2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lvc2/c;", "result", "Lxc2/d;", "a", "(Lvc2/c;)Lxc2/d;", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35881d {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC38193d m113935a(AbstractC35880c abstractC35880c) {
        if (abstractC35880c instanceof AbstractC35880c.a) {
            AbstractC35880c.a aVar = (AbstractC35880c.a) abstractC35880c;
            return new InterfaceC38193d.a(aVar.getError(), aVar.getPlan());
        }
        if (abstractC35880c instanceof AbstractC35880c.b) {
            AbstractC35880c.b bVar = (AbstractC35880c.b) abstractC35880c;
            return new InterfaceC38193d.b(bVar.getResult().getTitle(), bVar.getResult().getSubtitle(), bVar.getResult().getAcceptButton().getText(), bVar.getResult().getRejectButton().getText(), bVar.getPlan());
        }
        if (abstractC35880c instanceof AbstractC35880c.c) {
            return InterfaceC38193d.c.f163559a;
        }
        if (!(abstractC35880c instanceof AbstractC35880c.d)) {
            return null;
        }
        AbstractC35880c.d dVar = (AbstractC35880c.d) abstractC35880c;
        return new InterfaceC38193d.d(dVar.getResult().getSuccessText(), dVar.getResult().getSuccessSubtext());
    }
}
