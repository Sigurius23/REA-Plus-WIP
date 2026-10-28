package pf0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pf0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lpf0/b;", "", "<init>", "()V", "b", "a", "c", "Lpf0/b$a;", "Lpf0/b$b;", "Lpf0/b$c;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29146b {

    /* JADX INFO: renamed from: pf0.b$a */
    @Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lpf0/b$a;", "Lpf0/b;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC29146b {
    }

    /* JADX INFO: renamed from: pf0.b$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lpf0/b$b;", "Lpf0/b;", "", "source", "testCount", "initiallySelectedSegmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC29146b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testCount;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String initiallySelectedSegmentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String source, String testCount, String initiallySelectedSegmentId) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(testCount, "testCount");
            AbstractC22676k.m65750j(initiallySelectedSegmentId, "initiallySelectedSegmentId");
            this.source = source;
            this.testCount = testCount;
            this.initiallySelectedSegmentId = initiallySelectedSegmentId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInitiallySelectedSegmentId() {
            return this.initiallySelectedSegmentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTestCount() {
            return this.testCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.source, bVar.source) && AbstractC22676k.m65745e(this.testCount, bVar.testCount) && AbstractC22676k.m65745e(this.initiallySelectedSegmentId, bVar.initiallySelectedSegmentId);
        }

        public int hashCode() {
            return this.initiallySelectedSegmentId.hashCode() + AbstractC11266d.m30450d(this.source.hashCode() * 31, 31, this.testCount);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.initiallySelectedSegmentId, ")", AbstractC11895b.m32001t("Refresh(source=", this.source, ", testCount=", this.testCount, ", initiallySelectedSegmentId="));
        }
    }

    /* JADX INFO: renamed from: pf0.b$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lpf0/b$c;", "Lpf0/b;", "", "selectedSegmentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC29146b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String selectedSegmentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String selectedSegmentId) {
            super(null);
            AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
            this.selectedSegmentId = selectedSegmentId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSelectedSegmentId() {
            return this.selectedSegmentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.selectedSegmentId, ((c) other).selectedSegmentId);
        }

        public int hashCode() {
            return this.selectedSegmentId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SegmentSelected(selectedSegmentId=", this.selectedSegmentId, ")");
        }
    }

    public /* synthetic */ AbstractC29146b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC29146b() {
    }
}
