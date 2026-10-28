package el0;

import androidx.core.app.NotificationCompat;
import hl0.C17392a;
import nl0.AbstractC26802d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: el0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lel0/d;", "", "<init>", "()V", "Lnl0/d;", NotificationCompat.CATEGORY_EVENT, "Lhl0/a;", "a", "(Lnl0/d;)Lhl0/a;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13316d {
    /* JADX INFO: renamed from: a */
    public final C17392a m37421a(AbstractC26802d event) {
        AbstractC22676k.m65750j(event, "event");
        if (!(event instanceof AbstractC26802d.k)) {
            return null;
        }
        AbstractC26802d.k kVar = (AbstractC26802d.k) event;
        return new C17392a(kVar.getMessageId(), kVar.getFeedback());
    }
}
