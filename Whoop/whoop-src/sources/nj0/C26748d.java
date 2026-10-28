package nj0;

import java.util.UUID;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: nj0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0010"}, m65681d2 = {"Lnj0/d;", "", "<init>", "()V", "Lnj0/b;", "b", "Lnj0/b;", "a", "()Lnj0/b;", "Harvard", "c", "Maverick", "d", "Symphony", "e", "Monument", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26748d {

    /* JADX INFO: renamed from: a */
    public static final C26748d f106366a = new C26748d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C26746b Harvard;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C26746b Maverick;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C26746b Symphony;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C26746b Monument;

    static {
        EnumC26747c enumC26747c = EnumC26747c.CmdToStrap;
        C23465k c23465k = new C23465k(enumC26747c, UUID.fromString("61080002-8d6d-82b8-614a-1c8cb0f8dcc6"));
        EnumC26747c enumC26747c2 = EnumC26747c.CmdFromStrap;
        C23465k c23465k2 = new C23465k(enumC26747c2, UUID.fromString("61080003-8d6d-82b8-614a-1c8cb0f8dcc6"));
        EnumC26747c enumC26747c3 = EnumC26747c.EventsFromStrap;
        C23465k c23465k3 = new C23465k(enumC26747c3, UUID.fromString("61080004-8d6d-82b8-614a-1c8cb0f8dcc6"));
        EnumC26747c enumC26747c4 = EnumC26747c.DataFromStrap;
        C23465k c23465k4 = new C23465k(enumC26747c4, UUID.fromString("61080005-8d6d-82b8-614a-1c8cb0f8dcc6"));
        EnumC26747c enumC26747c5 = EnumC26747c.MemFault;
        Harvard = new C26746b(AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, c23465k4, new C23465k(enumC26747c5, UUID.fromString("61080007-8d6d-82b8-614a-1c8cb0f8dcc6"))));
        Maverick = new C26746b(AbstractC25247g0.m73990Y(new C23465k(enumC26747c, UUID.fromString("fd4b0002-cce1-4033-93ce-002d5875f58a")), new C23465k(enumC26747c2, UUID.fromString("fd4b0003-cce1-4033-93ce-002d5875f58a")), new C23465k(enumC26747c3, UUID.fromString("fd4b0004-cce1-4033-93ce-002d5875f58a")), new C23465k(enumC26747c4, UUID.fromString("fd4b0005-cce1-4033-93ce-002d5875f58a")), new C23465k(enumC26747c5, UUID.fromString("fd4b0007-cce1-4033-93ce-002d5875f58a"))));
        Symphony = new C26746b(AbstractC25247g0.m73990Y(new C23465k(enumC26747c, UUID.fromString("59830002-5955-419b-bb8d-c8262926af23")), new C23465k(enumC26747c2, UUID.fromString("59830003-5955-419b-bb8d-c8262926af23")), new C23465k(enumC26747c3, UUID.fromString("59830004-5955-419b-bb8d-c8262926af23")), new C23465k(enumC26747c4, UUID.fromString("59830005-5955-419b-bb8d-c8262926af23")), new C23465k(enumC26747c5, UUID.fromString("59830007-5955-419b-bb8d-c8262926af23"))));
        Monument = new C26746b(AbstractC25247g0.m73990Y(new C23465k(enumC26747c, UUID.fromString("8a580002-2fe8-4796-9267-b87a2b0c8234")), new C23465k(enumC26747c2, UUID.fromString("8a580003-2fe8-4796-9267-b87a2b0c8234")), new C23465k(enumC26747c3, UUID.fromString("8a580004-2fe8-4796-9267-b87a2b0c8234")), new C23465k(enumC26747c4, UUID.fromString("8a580005-2fe8-4796-9267-b87a2b0c8234")), new C23465k(enumC26747c5, UUID.fromString("8a580007-2fe8-4796-9267-b87a2b0c8234"))));
    }

    private C26748d() {
    }

    /* JADX INFO: renamed from: a */
    public final C26746b m79611a() {
        return Harvard;
    }

    /* JADX INFO: renamed from: b */
    public final C26746b m79612b() {
        return Maverick;
    }

    /* JADX INFO: renamed from: c */
    public final C26746b m79613c() {
        return Monument;
    }

    /* JADX INFO: renamed from: d */
    public final C26746b m79614d() {
        return Symphony;
    }
}
