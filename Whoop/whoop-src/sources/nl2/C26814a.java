package nl2;

import al2.AbstractC0988d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ml2.InterfaceC25676a;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: nl2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lnl2/a;", "", "<init>", "()V", "Lnl2/c$c;", "b", "Lnl2/c$c;", "f", "()Lnl2/c$c;", "restingInfo", "c", "d", "maxHrInfo", "e", "resetHrZones", "a", "changeHrZones", "leaveScreen", "g", "discardChanges", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26814a {

    /* JADX INFO: renamed from: a */
    public static final C26814a f106892a = new C26814a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C26816c.c restingInfo = new C26816c.c(AbstractC8693b.m21277k(AbstractC0988d.f3683f0), null, null, null, AbstractC8693b.m21277k(AbstractC0988d.f3681e0), null, true, null, 174, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C26816c.c maxHrInfo = new C26816c.c(AbstractC8693b.m21277k(AbstractC0988d.f3679d0), null, null, null, AbstractC8693b.m21277k(AbstractC0988d.f3677c0), null, true, null, 174, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C26816c.c resetHrZones = new C26816c.c(AbstractC8693b.m21277k(AbstractC0988d.f3693k0), AbstractC8693b.m21277k(AbstractC0988d.f3691j0), null, AbstractC8693b.m21277k(AbstractC0988d.f3662Q), AbstractC8693b.m21277k(AbstractC0988d.f3689i0), InterfaceC25676a.b.j.f100995a, false, null, 196, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C26816c.c changeHrZones = new C26816c.c(AbstractC8693b.m21277k(AbstractC0988d.f3688i), AbstractC8693b.m21277k(AbstractC0988d.f3663R), EnumC39333f.RECOVERY, AbstractC8693b.m21277k(AbstractC0988d.f3662Q), AbstractC8693b.m21277k(AbstractC0988d.f3686h), InterfaceC25676a.b.c.f100983a, false, null, 192, null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C26816c.c leaveScreen;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final C26816c.c discardChanges;

    /* JADX INFO: renamed from: h */
    public static final int f106899h;

    static {
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC0988d.f3699q);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC0988d.f3696n);
        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC0988d.f3698p);
        TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC0988d.f3697o);
        InterfaceC25676a.a.C42010a c42010a = InterfaceC25676a.a.C42010a.f100980a;
        InterfaceC25676a.b.C42011b c42011b = InterfaceC25676a.b.C42011b.f100982a;
        leaveScreen = new C26816c.c(c8688bM21277k, c8688bM21277k3, null, c8688bM21277k4, c8688bM21277k2, c42010a, false, c42011b, 68, null);
        discardChanges = new C26816c.c(AbstractC8693b.m21277k(AbstractC0988d.f3699q), AbstractC8693b.m21277k(AbstractC0988d.f3698p), null, AbstractC8693b.m21277k(AbstractC0988d.f3697o), AbstractC8693b.m21277k(AbstractC0988d.f3695m), null, false, c42011b, 100, null);
        f106899h = 8;
    }

    private C26814a() {
    }

    /* JADX INFO: renamed from: a */
    public final C26816c.c m79993a() {
        return changeHrZones;
    }

    /* JADX INFO: renamed from: b */
    public final C26816c.c m79994b() {
        return discardChanges;
    }

    /* JADX INFO: renamed from: c */
    public final C26816c.c m79995c() {
        return leaveScreen;
    }

    /* JADX INFO: renamed from: d */
    public final C26816c.c m79996d() {
        return maxHrInfo;
    }

    /* JADX INFO: renamed from: e */
    public final C26816c.c m79997e() {
        return resetHrZones;
    }

    /* JADX INFO: renamed from: f */
    public final C26816c.c m79998f() {
        return restingInfo;
    }
}
