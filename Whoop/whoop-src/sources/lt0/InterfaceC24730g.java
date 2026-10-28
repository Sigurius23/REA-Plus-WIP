package lt0;

import hk0.EnumC17381p;
import java.util.ArrayList;
import java.util.Set;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lt0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00062\u00020\u0001:\u0003\u0003\b\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Llt0/g;", "", "", "b", "()I", "frameRevision", "a", "packetType", "c", "Llt0/g$b;", "Llt0/g$c;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC24730g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f96722a;

    /* JADX INFO: renamed from: lt0.g$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00020\u0004\"\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Llt0/g$a;", "", "<init>", "()V", "", "", "revisions", "", "Llt0/g$b;", "a", "([S)Ljava/util/Set;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f96722a = new Companion();

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final Set<b> m72408a(short... revisions) {
            AbstractC22676k.m65750j(revisions, "revisions");
            ArrayList arrayList = new ArrayList(revisions.length);
            for (short s13 : revisions) {
                arrayList.add(new b(s13));
            }
            return AbstractC25265s.m74103I1(arrayList);
        }
    }

    /* JADX INFO: renamed from: lt0.g$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Llt0/g$b;", "Llt0/g;", "", "revision", "<init>", "(S)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "S", "getRevision", "()S", "frameRevision", "a", "packetType", "c", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC24730g {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final short revision;

        public b(short s13) {
            this.revision = s13;
        }

        @Override // lt0.InterfaceC24730g
        /* JADX INFO: renamed from: a */
        public int mo72406a() {
            return this.revision;
        }

        @Override // lt0.InterfaceC24730g
        /* JADX INFO: renamed from: b */
        public int mo72407b() {
            return 1;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.revision == ((b) other).revision;
        }

        public int hashCode() {
            return Short.hashCode(this.revision);
        }

        public String toString() {
            return AbstractC2875y.m8295h(this.revision, "V");
        }
    }

    /* JADX INFO: renamed from: lt0.g$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0018"}, m65681d2 = {"Llt0/g$c;", "Llt0/g;", "Lhk0/p;", "type", "<init>", "(Lhk0/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lhk0/p;", "c", "()Lhk0/p;", "frameRevision", "a", "packetType", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC24730g {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC17381p type;

        public c(EnumC17381p type) {
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
        }

        @Override // lt0.InterfaceC24730g
        /* JADX INFO: renamed from: a */
        public int mo72406a() {
            return this.type.getValue();
        }

        @Override // lt0.InterfaceC24730g
        /* JADX INFO: renamed from: b */
        public int mo72407b() {
            return 2;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC17381p getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.type == ((c) other).type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return AbstractC11266d.m30461o("Rev2.", this.type.name());
        }
    }

    /* JADX INFO: renamed from: a */
    int mo72406a();

    /* JADX INFO: renamed from: b */
    int mo72407b();
}
