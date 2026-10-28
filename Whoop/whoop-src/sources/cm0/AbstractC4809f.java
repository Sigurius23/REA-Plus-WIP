package cm0;

import androidx.core.app.NotificationCompat;
import nl0.AbstractC26802d;
import p715kotlin.Metadata;
import uz0.InterfaceC35414h;

/* JADX INFO: renamed from: cm0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", NotificationCompat.CATEGORY_EVENT, "Lnl0/d;", "a", "(Ljava/lang/Object;)Lnl0/d;", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4809f {
    /* JADX INFO: renamed from: a */
    public static final AbstractC26802d m15188a(Object obj) {
        if (obj instanceof InterfaceC35414h.a) {
            InterfaceC35414h.a aVar = (InterfaceC35414h.a) obj;
            return new AbstractC26802d.a(aVar.getCurrentSelectedState(), aVar.getTileId(), false, null, aVar.getActivityTitle(), 12, null);
        }
        if (obj instanceof AbstractC26802d) {
            return (AbstractC26802d) obj;
        }
        return null;
    }
}
