package nj0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nj0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000b\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0012¨\u0006\u0013À\u0006\u0003"}, m65681d2 = {"Lnj0/f;", "", "Ljava/util/UUID;", "c", "()Ljava/util/UUID;", "serviceId", "Lnj0/b;", "d", "()Lnj0/b;", "characteristics", "", "b", "()I", "mtuRequest", "Lnj0/a;", "a", "()Lnj0/a;", "bondingPolicy", "Lnj0/f$b;", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC26750f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f106376a;

    /* JADX INFO: renamed from: nj0.f$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, m65681d2 = {"Lnj0/f$a;", "", "<init>", "()V", "Ljava/util/UUID;", "serviceId", "Lnj0/f;", "a", "(Ljava/util/UUID;)Lnj0/f;", "", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "all", "Lnj0/f$b;", "c", "sensors", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f106376a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final Set<InterfaceC26750f> all;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final Set<b> sensors;

        static {
            Set<InterfaceC26750f> setM74059b1 = AbstractC25260n.m74059b1(new b[]{b.C42056b.f106385b, b.c.f106390b, b.a.C42055b.f106382b, b.a.C42054a.f106379b});
            all = setM74059b1;
            ArrayList arrayList = new ArrayList();
            for (Object obj : setM74059b1) {
                if (obj instanceof b) {
                    arrayList.add(obj);
                }
            }
            sensors = AbstractC25265s.m74103I1(arrayList);
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC26750f m79623a(UUID serviceId) {
            Object next;
            AbstractC22676k.m65750j(serviceId, "serviceId");
            Iterator<T> it = all.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (AbstractC22676k.m65745e(((InterfaceC26750f) next).mo79621c(), serviceId)) {
                    return (InterfaceC26750f) next;
                }
            }
            next = null;
            return (InterfaceC26750f) next;
        }

        /* JADX INFO: renamed from: b */
        public final Set<InterfaceC26750f> m79624b() {
            return all;
        }

        /* JADX INFO: renamed from: c */
        public final Set<b> m79625c() {
            return sensors;
        }
    }

    /* JADX INFO: renamed from: nj0.f$b */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lnj0/f$b;", "Lnj0/f;", "b", "c", "a", "Lnj0/f$b$a;", "Lnj0/f$b$b;", "Lnj0/f$b$c;", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b extends InterfaceC26750f {

        /* JADX INFO: renamed from: nj0.f$b$a */
        @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0007R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lnj0/f$b$a;", "Lnj0/f$b;", "", "b", "()I", "mtuRequest", "Lnj0/a;", "a", "()Lnj0/a;", "bondingPolicy", "Lnj0/f$b$a$a;", "Lnj0/f$b$a$b;", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public interface a extends b {

            /* JADX INFO: renamed from: nj0.f$b$a$a, reason: collision with other inner class name */
            @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lnj0/f$b$a$a;", "Lnj0/f$b$a;", "<init>", "()V", "Ljava/util/UUID;", "c", "Ljava/util/UUID;", "()Ljava/util/UUID;", "serviceId", "Lnj0/b;", "d", "Lnj0/b;", "()Lnj0/b;", "characteristics", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42054a implements a {

                /* JADX INFO: renamed from: b */
                public static final C42054a f106379b = new C42054a();

                /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                private static final UUID serviceId = AbstractC26749e.m79617c();

                /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                private static final C26746b characteristics = C26748d.f106366a.m79613c();

                private C42054a() {
                }

                @Override // nj0.InterfaceC26750f.b.a, nj0.InterfaceC26750f
                /* JADX INFO: renamed from: a */
                public /* bridge */ EnumC26745a mo79619a() {
                    return super.mo79619a();
                }

                @Override // nj0.InterfaceC26750f.b.a, nj0.InterfaceC26750f
                /* JADX INFO: renamed from: b */
                public /* bridge */ int mo79620b() {
                    return super.mo79620b();
                }

                @Override // nj0.InterfaceC26750f
                /* JADX INFO: renamed from: c */
                public UUID mo79621c() {
                    return serviceId;
                }

                @Override // nj0.InterfaceC26750f
                /* JADX INFO: renamed from: d */
                public C26746b mo79622d() {
                    return characteristics;
                }
            }

            /* JADX INFO: renamed from: nj0.f$b$a$b, reason: collision with other inner class name */
            @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lnj0/f$b$a$b;", "Lnj0/f$b$a;", "<init>", "()V", "Ljava/util/UUID;", "c", "Ljava/util/UUID;", "()Ljava/util/UUID;", "serviceId", "Lnj0/b;", "d", "Lnj0/b;", "()Lnj0/b;", "characteristics", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42055b implements a {

                /* JADX INFO: renamed from: b */
                public static final C42055b f106382b = new C42055b();

                /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                private static final UUID serviceId = AbstractC26749e.m79618d();

                /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                private static final C26746b characteristics = C26748d.f106366a.m79614d();

                private C42055b() {
                }

                @Override // nj0.InterfaceC26750f.b.a, nj0.InterfaceC26750f
                /* JADX INFO: renamed from: a */
                public /* bridge */ EnumC26745a mo79619a() {
                    return super.mo79619a();
                }

                @Override // nj0.InterfaceC26750f.b.a, nj0.InterfaceC26750f
                /* JADX INFO: renamed from: b */
                public /* bridge */ int mo79620b() {
                    return super.mo79620b();
                }

                @Override // nj0.InterfaceC26750f
                /* JADX INFO: renamed from: c */
                public UUID mo79621c() {
                    return serviceId;
                }

                @Override // nj0.InterfaceC26750f
                /* JADX INFO: renamed from: d */
                public C26746b mo79622d() {
                    return characteristics;
                }
            }

            @Override // nj0.InterfaceC26750f
            /* JADX INFO: renamed from: a */
            default EnumC26745a mo79619a() {
                return EnumC26745a.Required;
            }

            @Override // nj0.InterfaceC26750f
            /* JADX INFO: renamed from: b */
            default int mo79620b() {
                return 247;
            }
        }

        /* JADX INFO: renamed from: nj0.f$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lnj0/f$b$b;", "Lnj0/f$b;", "<init>", "()V", "Ljava/util/UUID;", "c", "Ljava/util/UUID;", "()Ljava/util/UUID;", "serviceId", "Lnj0/b;", "d", "Lnj0/b;", "()Lnj0/b;", "characteristics", "", "e", "I", "b", "()I", "mtuRequest", "Lnj0/a;", "f", "Lnj0/a;", "a", "()Lnj0/a;", "bondingPolicy", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42056b implements b {

            /* JADX INFO: renamed from: b */
            public static final C42056b f106385b = new C42056b();

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private static final UUID serviceId = AbstractC26749e.m79615a();

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private static final C26746b characteristics = C26748d.f106366a.m79611a();

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private static final int mtuRequest = 247;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private static final EnumC26745a bondingPolicy = EnumC26745a.Required;

            private C42056b() {
            }

            @Override // nj0.InterfaceC26750f
            /* JADX INFO: renamed from: a */
            public EnumC26745a mo79619a() {
                return bondingPolicy;
            }

            @Override // nj0.InterfaceC26750f
            /* JADX INFO: renamed from: b */
            public int mo79620b() {
                return mtuRequest;
            }

            @Override // nj0.InterfaceC26750f
            /* JADX INFO: renamed from: c */
            public UUID mo79621c() {
                return serviceId;
            }

            @Override // nj0.InterfaceC26750f
            /* JADX INFO: renamed from: d */
            public C26746b mo79622d() {
                return characteristics;
            }
        }

        /* JADX INFO: renamed from: nj0.f$b$c */
        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lnj0/f$b$c;", "Lnj0/f$b;", "<init>", "()V", "Ljava/util/UUID;", "c", "Ljava/util/UUID;", "()Ljava/util/UUID;", "serviceId", "Lnj0/b;", "d", "Lnj0/b;", "()Lnj0/b;", "characteristics", "", "e", "I", "b", "()I", "mtuRequest", "Lnj0/a;", "f", "Lnj0/a;", "a", "()Lnj0/a;", "bondingPolicy", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements b {

            /* JADX INFO: renamed from: b */
            public static final c f106390b = new c();

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private static final UUID serviceId = AbstractC26749e.m79616b();

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private static final C26746b characteristics = C26748d.f106366a.m79612b();

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private static final int mtuRequest = 247;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private static final EnumC26745a bondingPolicy = EnumC26745a.Required;

            private c() {
            }

            @Override // nj0.InterfaceC26750f
            /* JADX INFO: renamed from: a */
            public EnumC26745a mo79619a() {
                return bondingPolicy;
            }

            @Override // nj0.InterfaceC26750f
            /* JADX INFO: renamed from: b */
            public int mo79620b() {
                return mtuRequest;
            }

            @Override // nj0.InterfaceC26750f
            /* JADX INFO: renamed from: c */
            public UUID mo79621c() {
                return serviceId;
            }

            @Override // nj0.InterfaceC26750f
            /* JADX INFO: renamed from: d */
            public C26746b mo79622d() {
                return characteristics;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    EnumC26745a mo79619a();

    /* JADX INFO: renamed from: b */
    int mo79620b();

    /* JADX INFO: renamed from: c */
    UUID mo79621c();

    /* JADX INFO: renamed from: d */
    C26746b mo79622d();
}
