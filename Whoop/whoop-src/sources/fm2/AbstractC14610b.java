package fm2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fm2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lfm2/b;", "", "<init>", "()V", "a", "Lfm2/b$a;", "trends-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14610b {

    /* JADX INFO: renamed from: fm2.b$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lfm2/b$a;", "Lfm2/b;", "", "path", "Lfm2/c;", "domainState", "<init>", "(Ljava/lang/String;Lfm2/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lfm2/c;", "()Lfm2/c;", "trends-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC14610b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C14611c domainState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String path, C14611c c14611c) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            this.path = path;
            this.domainState = c14611c;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C14611c getDomainState() {
            return this.domainState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.path, aVar.path) && AbstractC22676k.m65745e(this.domainState, aVar.domainState);
        }

        public int hashCode() {
            int iHashCode = this.path.hashCode() * 31;
            C14611c c14611c = this.domainState;
            return iHashCode + (c14611c == null ? 0 : c14611c.hashCode());
        }

        public String toString() {
            return "Refresh(path=" + this.path + ", domainState=" + this.domainState + ")";
        }

        public /* synthetic */ a(String str, C14611c c14611c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? null : c14611c);
        }
    }

    public /* synthetic */ AbstractC14610b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC14610b() {
    }
}
