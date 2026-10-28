package oo1;

import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseCoachingResponse;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: oo1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Loo1/j;", "", "<init>", "()V", "b", "a", "c", "Loo1/j$a;", "Loo1/j$b;", "Loo1/j$c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28064j {

    /* JADX INFO: renamed from: oo1.j$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Loo1/j$a;", "Loo1/j;", "", "error", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC28064j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String error) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            this.error = error;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getError() {
            return this.error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.error, ((a) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(error=", this.error, ")");
        }
    }

    /* JADX INFO: renamed from: oo1.j$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loo1/j$b;", "Loo1/j;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC28064j {

        /* JADX INFO: renamed from: a */
        public static final b f113545a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oo1.j$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Loo1/j$c;", "Loo1/j;", "", "selectedPhase", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;", "response", "<init>", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;)V", "a", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;)Loo1/j$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;", "c", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC28064j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String selectedPhase;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final PhaseCoachingResponse response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, PhaseCoachingResponse response) {
            super(null);
            AbstractC22676k.m65750j(response, "response");
            this.selectedPhase = str;
            this.response = response;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m84832b(c cVar, String str, PhaseCoachingResponse phaseCoachingResponse, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = cVar.selectedPhase;
            }
            if ((i13 & 2) != 0) {
                phaseCoachingResponse = cVar.response;
            }
            return cVar.m84833a(str, phaseCoachingResponse);
        }

        /* JADX INFO: renamed from: a */
        public final c m84833a(String selectedPhase, PhaseCoachingResponse response) {
            AbstractC22676k.m65750j(response, "response");
            return new c(selectedPhase, response);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final PhaseCoachingResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSelectedPhase() {
            return this.selectedPhase;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.selectedPhase, cVar.selectedPhase) && AbstractC22676k.m65745e(this.response, cVar.response);
        }

        public int hashCode() {
            String str = this.selectedPhase;
            return this.response.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "Result(selectedPhase=" + this.selectedPhase + ", response=" + this.response + ")";
        }
    }

    public /* synthetic */ AbstractC28064j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC28064j() {
    }
}
