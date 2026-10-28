package pz1;

import com.whoop.nativestore.home.domain.model.NativeStoreResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pz1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lpz1/c;", "", "<init>", "()V", "c", "b", "a", "Lpz1/c$a;", "Lpz1/c$b;", "Lpz1/c$c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29645c {

    /* JADX INFO: renamed from: pz1.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpz1/c$a;", "Lpz1/c;", "<init>", "()V", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC29645c {

        /* JADX INFO: renamed from: a */
        public static final a f121041a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: pz1.c$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lpz1/c$b;", "Lpz1/c;", "Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;", "response", "", "isRefreshing", "<init>", "(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;", "()Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;", "b", "Z", "()Z", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC29645c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final NativeStoreResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isRefreshing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NativeStoreResponse response, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
            this.isRefreshing = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final NativeStoreResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsRefreshing() {
            return this.isRefreshing;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.response, bVar.response) && this.isRefreshing == bVar.isRefreshing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRefreshing) + (this.response.hashCode() * 31);
        }

        public String toString() {
            return "Loaded(response=" + this.response + ", isRefreshing=" + this.isRefreshing + ")";
        }

        public /* synthetic */ b(NativeStoreResponse nativeStoreResponse, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(nativeStoreResponse, (i13 & 2) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: pz1.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpz1/c$c;", "Lpz1/c;", "<init>", "()V", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC29645c {

        /* JADX INFO: renamed from: a */
        public static final c f121044a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC29645c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC29645c() {
    }
}
