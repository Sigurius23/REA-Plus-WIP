package hq1;

import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hq1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lhq1/b;", "", "<init>", "()V", "b", "a", "c", "Lhq1/b$a;", "Lhq1/b$b;", "Lhq1/b$c;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17563b {

    /* JADX INFO: renamed from: hq1.b$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lhq1/b$a;", "Lhq1/b;", "", "error", "Lhq1/f;", "metadata", "<init>", "(Ljava/lang/String;Lhq1/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getError", "b", "Lhq1/f;", "()Lhq1/f;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC17563b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String error;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C17567f metadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String error, C17567f metadata) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            AbstractC22676k.m65750j(metadata, "metadata");
            this.error = error;
            this.metadata = metadata;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C17567f getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.error, aVar.error) && AbstractC22676k.m65745e(this.metadata, aVar.metadata);
        }

        public int hashCode() {
            return this.metadata.hashCode() + (this.error.hashCode() * 31);
        }

        public String toString() {
            return "Error(error=" + this.error + ", metadata=" + this.metadata + ")";
        }
    }

    /* JADX INFO: renamed from: hq1.b$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lhq1/b$b;", "Lhq1/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC17563b {

        /* JADX INFO: renamed from: a */
        public static final b f67988a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1728482210;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: renamed from: hq1.b$c */
    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b\u001b\u0010+¨\u0006,"}, m65681d2 = {"Lhq1/b$c;", "Lhq1/b;", "Lhq1/e;", "header", "", "Lhq1/g;", "sections", "Lhq1/d;", "footer", "Lhq1/f;", "metadata", "", "analyticsId", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "aiContextMetadata", "<init>", "(Lhq1/e;Ljava/util/List;Lhq1/d;Lhq1/f;Ljava/lang/String;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhq1/e;", "d", "()Lhq1/e;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "Lhq1/d;", "()Lhq1/d;", "Lhq1/f;", "e", "()Lhq1/f;", "Ljava/lang/String;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC17563b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17566e header;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<C17568g> sections;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C17565d footer;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C17567f metadata;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String analyticsId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final AiContextMetadata aiContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C17566e header, List<C17568g> sections, C17565d c17565d, C17567f metadata, String str, AiContextMetadata aiContextMetadata) {
            super(null);
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(sections, "sections");
            AbstractC22676k.m65750j(metadata, "metadata");
            this.header = header;
            this.sections = sections;
            this.footer = c17565d;
            this.metadata = metadata;
            this.analyticsId = str;
            this.aiContextMetadata = aiContextMetadata;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AiContextMetadata getAiContextMetadata() {
            return this.aiContextMetadata;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAnalyticsId() {
            return this.analyticsId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C17565d getFooter() {
            return this.footer;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C17566e getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C17567f getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.header, cVar.header) && AbstractC22676k.m65745e(this.sections, cVar.sections) && AbstractC22676k.m65745e(this.footer, cVar.footer) && AbstractC22676k.m65745e(this.metadata, cVar.metadata) && AbstractC22676k.m65745e(this.analyticsId, cVar.analyticsId) && AbstractC22676k.m65745e(this.aiContextMetadata, cVar.aiContextMetadata);
        }

        /* JADX INFO: renamed from: f */
        public final List<C17568g> m49989f() {
            return this.sections;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(this.header.hashCode() * 31, 31, this.sections);
            C17565d c17565d = this.footer;
            int iHashCode = (this.metadata.hashCode() + ((iM31983b + (c17565d == null ? 0 : c17565d.hashCode())) * 31)) * 31;
            String str = this.analyticsId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AiContextMetadata aiContextMetadata = this.aiContextMetadata;
            return iHashCode2 + (aiContextMetadata != null ? aiContextMetadata.hashCode() : 0);
        }

        public String toString() {
            return "Success(header=" + this.header + ", sections=" + this.sections + ", footer=" + this.footer + ", metadata=" + this.metadata + ", analyticsId=" + this.analyticsId + ", aiContextMetadata=" + this.aiContextMetadata + ")";
        }
    }

    public /* synthetic */ AbstractC17563b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC17563b() {
    }
}
