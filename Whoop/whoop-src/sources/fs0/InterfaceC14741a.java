package fs0;

import com.whoop.whoopaction.domain.models.UpdateAction;
import ds0.InterfaceC12323b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fs0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lfs0/a;", "", "a", "b", "Lfs0/a$a;", "Lfs0/a$b;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14741a {

    /* JADX INFO: renamed from: fs0.a$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lfs0/a$a;", "Lfs0/a;", "Lds0/b;", "key", "Lcom/whoop/whoopaction/domain/models/UpdateAction;", "action", "<init>", "(Lds0/b;Lcom/whoop/whoopaction/domain/models/UpdateAction;)V", "a", "()Lds0/b;", "b", "()Lcom/whoop/whoopaction/domain/models/UpdateAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lds0/b;", "getKey", "Lcom/whoop/whoopaction/domain/models/UpdateAction;", "getAction", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC14741a {

        /* JADX INFO: renamed from: c */
        public static final int f54477c = UpdateAction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC12323b key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final UpdateAction action;

        public a(InterfaceC12323b key, UpdateAction updateAction) {
            AbstractC22676k.m65750j(key, "key");
            this.key = key;
            this.action = updateAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC12323b getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final UpdateAction getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.key, aVar.key) && AbstractC22676k.m65745e(this.action, aVar.action);
        }

        public int hashCode() {
            int iHashCode = this.key.hashCode() * 31;
            UpdateAction updateAction = this.action;
            return iHashCode + (updateAction == null ? 0 : updateAction.hashCode());
        }

        public String toString() {
            return "Post(key=" + this.key + ", action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: fs0.a$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lfs0/a$b;", "Lfs0/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC14741a {

        /* JADX INFO: renamed from: a */
        public static final b f54480a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1699229496;
        }

        public String toString() {
            return "Refresh";
        }
    }
}
