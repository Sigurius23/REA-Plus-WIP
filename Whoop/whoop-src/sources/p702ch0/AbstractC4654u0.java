package p702ch0;

import java.util.Iterator;
import nl0.EnumC26800b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zg0.C40621d;
import zg0.C40626i;

/* JADX INFO: renamed from: ch0.u0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzg0/i;", "Lch0/v;", "a", "(Lzg0/i;)Lch0/v;", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4654u0 {
    /* JADX INFO: renamed from: a */
    public static final C4655v m14667a(C40626i c40626i) {
        Object next;
        AbstractC22676k.m65750j(c40626i, "<this>");
        Iterator<T> it = c40626i.getConversation().m131760d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C40621d c40621d = (C40621d) next;
            if (c40621d.getRole() == EnumC26800b.ASSISTANT && c40621d.getRawTextContent().length() > 0) {
                break;
            }
        }
        C40621d c40621d2 = (C40621d) next;
        if (c40621d2 == null || c40621d2.getTurnId().length() == 0) {
            return null;
        }
        return new C4655v(c40621d2.getRawTextContent(), c40621d2.getTurnId());
    }
}
