package bk2;

import com.mapbox.common.HttpHeaders;
import java.time.LocalDate;
import p181h2.C16618c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: bk2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lbk2/g;", "", "<init>", "()V", "b", "a", "c", "Lbk2/g$a;", "Lbk2/g$b;", "Lbk2/g$c;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3360g {

    /* JADX INFO: renamed from: bk2.g$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lbk2/g$a;", "Lbk2/g;", "Ljava/time/LocalDate;", HttpHeaders.DATE, "<init>", "(Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC3360g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDate date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LocalDate date) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.date, ((a) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return "Error(date=" + this.date + ")";
        }
    }

    /* JADX INFO: renamed from: bk2.g$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lbk2/g$b;", "Lbk2/g;", "<init>", "()V", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC3360g {

        /* JADX INFO: renamed from: a */
        public static final b f13097a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: bk2.g$c */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lbk2/g$c;", "Lbk2/g;", "Lbk2/c;", "toolbarState", "Lm91/u;", "tiltGraph", "Lh2/c;", "plotPadding", "<init>", "(Lbk2/c;Lm91/u;Lh2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk2/c;", "c", "()Lbk2/c;", "b", "Lm91/u;", "()Lm91/u;", "Lh2/c;", "()Lh2/c;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC3360g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C3356c toolbarState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC25312u tiltGraph;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C16618c plotPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3356c toolbarState, InterfaceC25312u interfaceC25312u, C16618c plotPadding) {
            super(null);
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(plotPadding, "plotPadding");
            this.toolbarState = toolbarState;
            this.tiltGraph = interfaceC25312u;
            this.plotPadding = plotPadding;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C16618c getPlotPadding() {
            return this.plotPadding;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC25312u getTiltGraph() {
            return this.tiltGraph;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C3356c getToolbarState() {
            return this.toolbarState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.toolbarState, cVar.toolbarState) && AbstractC22676k.m65745e(this.tiltGraph, cVar.tiltGraph) && AbstractC22676k.m65745e(this.plotPadding, cVar.plotPadding);
        }

        public int hashCode() {
            int iHashCode = this.toolbarState.hashCode() * 31;
            InterfaceC25312u interfaceC25312u = this.tiltGraph;
            return this.plotPadding.hashCode() + ((iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31);
        }

        public String toString() {
            return "Success(toolbarState=" + this.toolbarState + ", tiltGraph=" + this.tiltGraph + ", plotPadding=" + this.plotPadding + ")";
        }
    }

    public /* synthetic */ AbstractC3360g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3360g() {
    }
}
