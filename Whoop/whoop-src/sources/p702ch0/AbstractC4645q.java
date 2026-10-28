package p702ch0;

import androidx.core.app.NotificationCompat;
import c41.C4067l5;
import c91.InterfaceC4327a;
import java.time.Clock;
import nl0.AbstractC26802d;
import nl0.EnumC26800b;
import oz0.C28497c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uz0.InterfaceC35414h;
import zg0.AbstractC40624g;

/* JADX INFO: renamed from: ch0.q */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", NotificationCompat.CATEGORY_EVENT, "", "turnId", "Ljava/time/Clock;", "clock", "Lzg0/g;", "a", "(Ljava/lang/Object;Ljava/lang/String;Ljava/time/Clock;)Lzg0/g;", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4645q {
    /* JADX INFO: renamed from: a */
    public static final AbstractC40624g m14584a(Object obj, String str, Clock clock) {
        AbstractC22676k.m65750j(clock, "clock");
        if (obj instanceof C4067l5) {
            if (str == null) {
                return null;
            }
            String string = ((C4067l5) obj).getId().toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            return new AbstractC40624g.c(str, string);
        }
        if (obj instanceof InterfaceC35414h.a) {
            InterfaceC35414h.a aVar = (InterfaceC35414h.a) obj;
            return new AbstractC40624g.a(aVar.getTileId(), aVar.getCurrentSelectedState(), null, aVar.getActivityTitle(), 4, null);
        }
        if (obj instanceof AbstractC26802d.a) {
            AbstractC26802d.a aVar2 = (AbstractC26802d.a) obj;
            return new AbstractC40624g.a(aVar2.getRecommendationId(), aVar2.getCommitted(), aVar2.getReplacementId(), aVar2.getActivityName());
        }
        if (obj instanceof AbstractC26802d.l) {
            return new AbstractC40624g.d(((AbstractC26802d.l) obj).getUserQuestion(), EnumC26800b.USER, null, false, clock.millis(), false, 44, null);
        }
        if (obj instanceof C28497c) {
            return new AbstractC40624g.d(((C28497c) obj).getContent(), EnumC26800b.USER, null, false, clock.millis(), true, 12, null);
        }
        if (obj instanceof InterfaceC4327a.b) {
            return new AbstractC40624g.d(((InterfaceC4327a.b) obj).getMessage(), EnumC26800b.USER, null, false, clock.millis(), false, 44, null);
        }
        if (obj instanceof InterfaceC4327a.a) {
            return new AbstractC40624g.h(((InterfaceC4327a.a) obj).getTurnId());
        }
        if (obj instanceof InterfaceC4327a.c) {
            return new AbstractC40624g.p(((InterfaceC4327a.c) obj).getError());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AbstractC40624g m14585b(Object obj, String str, Clock clock, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        if ((i13 & 4) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        return m14584a(obj, str, clock);
    }
}
