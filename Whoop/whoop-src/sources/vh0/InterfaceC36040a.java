package vh0;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vh0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lvh0/a;", "", "b", "a", "Lvh0/a$a;", "Lvh0/a$b;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC36040a {

    /* JADX INFO: renamed from: vh0.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvh0/a$a;", "Lvh0/a;", "<init>", "()V", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC36040a {

        /* JADX INFO: renamed from: a */
        public static final a f153737a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: vh0.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lvh0/a$b;", "Lvh0/a;", "", "sourceContextType", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC36040a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String sourceContextType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String sourceId;

        public b(String sourceContextType, String sourceId) {
            AbstractC22676k.m65750j(sourceContextType, "sourceContextType");
            AbstractC22676k.m65750j(sourceId, "sourceId");
            this.sourceContextType = sourceContextType;
            this.sourceId = sourceId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSourceContextType() {
            return this.sourceContextType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.sourceContextType, bVar.sourceContextType) && AbstractC22676k.m65745e(this.sourceId, bVar.sourceId);
        }

        public int hashCode() {
            return this.sourceId.hashCode() + (this.sourceContextType.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("LoadAiInsights(sourceContextType=", this.sourceContextType, ", sourceId=", this.sourceId, ")");
        }
    }
}
