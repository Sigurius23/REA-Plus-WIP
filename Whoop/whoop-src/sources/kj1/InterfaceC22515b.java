package kj1;

import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kj1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lkj1/b;", "", "a", "d", "b", "e", "f", "c", "Lkj1/b$a;", "Lkj1/b$b;", "Lkj1/b$d;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC22515b {

    /* JADX INFO: renamed from: kj1.b$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lkj1/b$a;", "Lkj1/b;", "", "wereAllPermissionsGranted", "", "", "permissionsGranted", "<init>", "(ZLjava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getWereAllPermissionsGranted", "()Z", "b", "Ljava/util/Set;", "getPermissionsGranted", "()Ljava/util/Set;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC22515b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean wereAllPermissionsGranted;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Set<String> permissionsGranted;

        public a(boolean z4, Set<String> permissionsGranted) {
            AbstractC22676k.m65750j(permissionsGranted, "permissionsGranted");
            this.wereAllPermissionsGranted = z4;
            this.permissionsGranted = permissionsGranted;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.wereAllPermissionsGranted == aVar.wereAllPermissionsGranted && AbstractC22676k.m65745e(this.permissionsGranted, aVar.permissionsGranted);
        }

        public int hashCode() {
            return this.permissionsGranted.hashCode() + (Boolean.hashCode(this.wereAllPermissionsGranted) * 31);
        }

        public String toString() {
            return "Connected(wereAllPermissionsGranted=" + this.wereAllPermissionsGranted + ", permissionsGranted=" + this.permissionsGranted + ")";
        }
    }

    /* JADX INFO: renamed from: kj1.b$b */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lkj1/b$b;", "Lkj1/b;", "Lkj1/b$c;", "Lkj1/b$e;", "Lkj1/b$f;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b extends InterfaceC22515b {
    }

    /* JADX INFO: renamed from: kj1.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkj1/b$c;", "Lkj1/b$b;", "<init>", "()V", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public static final c f88243a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: kj1.b$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkj1/b$d;", "Lkj1/b;", "<init>", "()V", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC22515b {

        /* JADX INFO: renamed from: a */
        public static final d f88244a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: kj1.b$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkj1/b$e;", "Lkj1/b$b;", "<init>", "()V", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements b {

        /* JADX INFO: renamed from: a */
        public static final e f88245a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: kj1.b$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkj1/b$f;", "Lkj1/b$b;", "<init>", "()V", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements b {

        /* JADX INFO: renamed from: a */
        public static final f f88246a = new f();

        private f() {
        }
    }
}
