package q80;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: q80.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0007\b\u0004\tR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lq80/e;", "", "", "Lq80/d;", "a", "()Ljava/util/List;", "flows", "d", "b", "c", "Lq80/e$a;", "Lq80/e$b;", "Lq80/e$c;", "Lq80/e$d;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC30033e {

    /* JADX INFO: renamed from: q80.e$a */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lq80/e$a;", "Lq80/e;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getFlow", "()Ljava/lang/String;", "flow", "", "Lq80/d;", "c", "Ljava/util/List;", "a", "()Ljava/util/List;", "flows", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC30033e {

        /* JADX INFO: renamed from: a */
        public static final a f122567a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final String flow = "accountTransition";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final List<C30032d> flows;

        /* JADX INFO: renamed from: d */
        public static final int f122570d;

        static {
            InterfaceC33616a entries = EnumC30029a.getEntries();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(entries, 10));
            Iterator<E> it = entries.iterator();
            while (it.hasNext()) {
                arrayList.add(((EnumC30029a) it.next()).getDescriptor());
            }
            flows = arrayList;
            f122570d = 8;
        }

        private a() {
        }

        @Override // q80.InterfaceC30033e
        /* JADX INFO: renamed from: a */
        public List<C30032d> mo91934a() {
            return flows;
        }
    }

    /* JADX INFO: renamed from: q80.e$b */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lq80/e$b;", "Lq80/e;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getFlow", "()Ljava/lang/String;", "flow", "", "Lq80/d;", "c", "Ljava/util/List;", "a", "()Ljava/util/List;", "flows", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC30033e {

        /* JADX INFO: renamed from: a */
        public static final b f122571a = new b();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final String flow = "advancedLabs";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final List<C30032d> flows;

        /* JADX INFO: renamed from: d */
        public static final int f122574d;

        static {
            InterfaceC33616a entries = EnumC30041m.getEntries();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(entries, 10));
            Iterator<E> it = entries.iterator();
            while (it.hasNext()) {
                arrayList.add(((EnumC30041m) it.next()).getDescriptor());
            }
            flows = arrayList;
            f122574d = 8;
        }

        private b() {
        }

        @Override // q80.InterfaceC30033e
        /* JADX INFO: renamed from: a */
        public List<C30032d> mo91934a() {
            return flows;
        }
    }

    /* JADX INFO: renamed from: q80.e$c */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lq80/e$c;", "Lq80/e;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getFlow", "()Ljava/lang/String;", "flow", "", "Lq80/d;", "c", "Ljava/util/List;", "a", "()Ljava/util/List;", "flows", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC30033e {

        /* JADX INFO: renamed from: a */
        public static final c f122575a = new c();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final String flow = "afterActivationFinalScreens";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final List<C30032d> flows;

        /* JADX INFO: renamed from: d */
        public static final int f122578d;

        static {
            InterfaceC33616a entries = EnumC30040l.getEntries();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(entries, 10));
            Iterator<E> it = entries.iterator();
            while (it.hasNext()) {
                arrayList.add(((EnumC30040l) it.next()).getDescriptor());
            }
            flows = arrayList;
            f122578d = 8;
        }

        private c() {
        }

        @Override // q80.InterfaceC30033e
        /* JADX INFO: renamed from: a */
        public List<C30032d> mo91934a() {
            return flows;
        }
    }

    /* JADX INFO: renamed from: q80.e$d */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lq80/e$d;", "Lq80/e;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getFlow", "()Ljava/lang/String;", "flow", "", "Lq80/d;", "c", "Ljava/util/List;", "a", "()Ljava/util/List;", "flows", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC30033e {

        /* JADX INFO: renamed from: a */
        public static final d f122579a = new d();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final String flow = "medicare";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final List<C30032d> flows;

        /* JADX INFO: renamed from: d */
        public static final int f122582d;

        static {
            InterfaceC33616a entries = EnumC30042n.getEntries();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(entries, 10));
            Iterator<E> it = entries.iterator();
            while (it.hasNext()) {
                arrayList.add(((EnumC30042n) it.next()).getDescriptor());
            }
            flows = arrayList;
            f122582d = 8;
        }

        private d() {
        }

        @Override // q80.InterfaceC30033e
        /* JADX INFO: renamed from: a */
        public List<C30032d> mo91934a() {
            return flows;
        }
    }

    /* JADX INFO: renamed from: a */
    List<C30032d> mo91934a();
}
