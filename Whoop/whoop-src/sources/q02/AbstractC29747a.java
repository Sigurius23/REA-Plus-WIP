package q02;

import com.whoop.navigation.models.GenericHttpMethod;
import java.util.Map;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: q02.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lq02/a;", "", "<init>", "()V", "a", "b", "Lq02/a$a;", "Lq02/a$b;", "nested-bff-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29747a {

    /* JADX INFO: renamed from: q02.a$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lq02/a$a;", "Lq02/a;", "", "path", "Lcom/whoop/navigation/models/GenericHttpMethod;", "method", "", "metadata", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/whoop/navigation/models/GenericHttpMethod;", "()Lcom/whoop/navigation/models/GenericHttpMethod;", "Ljava/util/Map;", "()Ljava/util/Map;", "nested-bff-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC29747a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final GenericHttpMethod method;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Map<String, String> metadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String path, GenericHttpMethod method, Map<String, String> map) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(method, "method");
            this.path = path;
            this.method = method;
            this.metadata = map;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m91199a() {
            return this.metadata;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final GenericHttpMethod getMethod() {
            return this.method;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return AbstractC22676k.m65745e(this.path, aVar.path) && this.method == aVar.method && AbstractC22676k.m65745e(this.metadata, aVar.metadata);
        }

        public int hashCode() {
            int iHashCode = (this.method.hashCode() + (this.path.hashCode() * 31)) * 31;
            Map<String, String> map = this.metadata;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            String str = this.path;
            GenericHttpMethod genericHttpMethod = this.method;
            Map<String, String> map = this.metadata;
            StringBuilder sb4 = new StringBuilder("Load(path=");
            sb4.append(str);
            sb4.append(", method=");
            sb4.append(genericHttpMethod);
            sb4.append(", metadata=");
            return AbstractC13673n.m38565l(sb4, map, ")");
        }
    }

    /* JADX INFO: renamed from: q02.a$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lq02/a$b;", "Lq02/a;", "", "path", "Lcom/whoop/navigation/models/GenericHttpMethod;", "method", "", "metadata", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/whoop/navigation/models/GenericHttpMethod;", "()Lcom/whoop/navigation/models/GenericHttpMethod;", "Ljava/util/Map;", "()Ljava/util/Map;", "nested-bff-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC29747a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final GenericHttpMethod method;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Map<String, String> metadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String path, GenericHttpMethod method, Map<String, String> map) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(method, "method");
            this.path = path;
            this.method = method;
            this.metadata = map;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m91202a() {
            return this.metadata;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final GenericHttpMethod getMethod() {
            return this.method;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.path, bVar.path) && this.method == bVar.method && AbstractC22676k.m65745e(this.metadata, bVar.metadata);
        }

        public int hashCode() {
            int iHashCode = (this.method.hashCode() + (this.path.hashCode() * 31)) * 31;
            Map<String, String> map = this.metadata;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            String str = this.path;
            GenericHttpMethod genericHttpMethod = this.method;
            Map<String, String> map = this.metadata;
            StringBuilder sb4 = new StringBuilder("Retry(path=");
            sb4.append(str);
            sb4.append(", method=");
            sb4.append(genericHttpMethod);
            sb4.append(", metadata=");
            return AbstractC13673n.m38565l(sb4, map, ")");
        }
    }

    public /* synthetic */ AbstractC29747a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC29747a() {
    }
}
