package ds0;

import androidx.core.app.NotificationCompat;
import com.whoop.communityreactions.domain.model.ReactionsResponse;
import com.whoop.design.models.modal.AnyModal;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Set;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y82.EnumC39339b;

/* JADX INFO: renamed from: ds0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Lds0/e;", "", "d", "c", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "f", "e", "a", "Lds0/e$a;", "Lds0/e$b;", "Lds0/e$c;", "Lds0/e$d;", "Lds0/e$e;", "Lds0/e$f;", "Lds0/e$g;", "Lds0/e$h;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12326e {

    /* JADX INFO: renamed from: ds0.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lds0/e$a;", "Lds0/e;", "Lds0/a;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Lds0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lds0/a;", "()Lds0/a;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC12326e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC12322a progress;

        public a(InterfaceC12322a interfaceC12322a) {
            this.progress = interfaceC12322a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC12322a getProgress() {
            return this.progress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.progress, ((a) other).progress);
        }

        public int hashCode() {
            InterfaceC12322a interfaceC12322a = this.progress;
            if (interfaceC12322a == null) {
                return 0;
            }
            return interfaceC12322a.hashCode();
        }

        public String toString() {
            return "ActionProgressed(progress=" + this.progress + ")";
        }
    }

    /* JADX INFO: renamed from: ds0.e$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lds0/e$b;", "Lds0/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC12326e {

        /* JADX INFO: renamed from: a */
        public static final b f41280a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 1854162521;
        }

        public String toString() {
            return EnumC39339b.RESULT_FAILURE;
        }
    }

    /* JADX INFO: renamed from: ds0.e$d */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lds0/e$d;", "Lds0/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC12326e {

        /* JADX INFO: renamed from: a */
        public static final d f41283a = new d();

        private d() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -1227263328;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: renamed from: ds0.e$e */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lds0/e$e;", "Lds0/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC12326e {

        /* JADX INFO: renamed from: a */
        public static final e f41284a = new e();

        private e() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return -590220648;
        }

        public String toString() {
            return "ModalDismissed";
        }
    }

    /* JADX INFO: renamed from: ds0.e$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lds0/e$f;", "Lds0/e;", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "<init>", "(Lcom/whoop/design/models/modal/AnyModal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC12326e {

        /* JADX INFO: renamed from: b */
        public static final int f41285b = AnyModal.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AnyModal modal;

        public f(AnyModal modal) {
            AbstractC22676k.m65750j(modal, "modal");
            this.modal = modal;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AnyModal getModal() {
            return this.modal;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.modal, ((f) other).modal);
        }

        public int hashCode() {
            return this.modal.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61135f("PresentModal(modal=", ")", this.modal);
        }
    }

    /* JADX INFO: renamed from: ds0.e$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lds0/e$g;", "Lds0/e;", "Lds0/b;", "key", "", "saved", "<init>", "(Lds0/b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lds0/b;", "()Lds0/b;", "b", "Z", "()Z", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC12326e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC12323b key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean saved;

        public g(InterfaceC12323b key, boolean z4) {
            AbstractC22676k.m65750j(key, "key");
            this.key = key;
            this.saved = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC12323b getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getSaved() {
            return this.saved;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.key, gVar.key) && this.saved == gVar.saved;
        }

        public int hashCode() {
            return Boolean.hashCode(this.saved) + (this.key.hashCode() * 31);
        }

        public String toString() {
            return "SendFinished(key=" + this.key + ", saved=" + this.saved + ")";
        }
    }

    /* JADX INFO: renamed from: ds0.e$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lds0/e$h;", "Lds0/e;", "Lds0/b;", "key", "<init>", "(Lds0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lds0/b;", "()Lds0/b;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC12326e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC12323b key;

        public h(InterfaceC12323b key) {
            AbstractC22676k.m65750j(key, "key");
            this.key = key;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC12323b getKey() {
            return this.key;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.key, ((h) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "SendStarted(key=" + this.key + ")";
        }
    }

    /* JADX INFO: renamed from: ds0.e$c */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lds0/e$c;", "Lds0/e;", "Lcom/whoop/communityreactions/domain/model/ReactionsResponse;", "data", "", "", "confirmedPendingIds", "<init>", "(Lcom/whoop/communityreactions/domain/model/ReactionsResponse;Ljava/util/Set;)V", "a", "(Lcom/whoop/communityreactions/domain/model/ReactionsResponse;Ljava/util/Set;)Lds0/e$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/communityreactions/domain/model/ReactionsResponse;", "d", "()Lcom/whoop/communityreactions/domain/model/ReactionsResponse;", "b", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC12326e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ReactionsResponse data;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Set<Long> confirmedPendingIds;

        public c(ReactionsResponse data, Set<Long> set) {
            AbstractC22676k.m65750j(data, "data");
            this.data = data;
            this.confirmedPendingIds = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m34365b(c cVar, ReactionsResponse reactionsResponse, Set set, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                reactionsResponse = cVar.data;
            }
            if ((i13 & 2) != 0) {
                set = cVar.confirmedPendingIds;
            }
            return cVar.m34366a(reactionsResponse, set);
        }

        /* JADX INFO: renamed from: a */
        public final c m34366a(ReactionsResponse data, Set<Long> confirmedPendingIds) {
            AbstractC22676k.m65750j(data, "data");
            return new c(data, confirmedPendingIds);
        }

        /* JADX INFO: renamed from: c */
        public final Set<Long> m34367c() {
            return this.confirmedPendingIds;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ReactionsResponse getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.data, cVar.data) && AbstractC22676k.m65745e(this.confirmedPendingIds, cVar.confirmedPendingIds);
        }

        public int hashCode() {
            int iHashCode = this.data.hashCode() * 31;
            Set<Long> set = this.confirmedPendingIds;
            return iHashCode + (set == null ? 0 : set.hashCode());
        }

        public String toString() {
            return "Loaded(data=" + this.data + ", confirmedPendingIds=" + this.confirmedPendingIds + ")";
        }

        public /* synthetic */ c(ReactionsResponse reactionsResponse, Set set, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(reactionsResponse, (i13 & 2) != 0 ? null : set);
        }
    }
}
