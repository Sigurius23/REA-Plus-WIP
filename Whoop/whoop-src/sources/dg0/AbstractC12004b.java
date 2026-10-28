package dg0;

import ih0.AbstractC18489d0;
import ny0.C27256h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dg0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Ldg0/b;", "", "<init>", "()V", "c", "d", "a", "b", "Ldg0/b$a;", "Ldg0/b$b;", "Ldg0/b$c;", "Ldg0/b$d;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12004b {

    /* JADX INFO: renamed from: dg0.b$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Ldg0/b$a;", "Ldg0/b;", "Lny0/h;", "cardButtonState", "", "selectedSegmentId", "", "isFromDialog", "<init>", "(Lny0/h;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lny0/h;", "()Lny0/h;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC12004b {

        /* JADX INFO: renamed from: d */
        public static final int f39596d = C27256h.f109055z;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C27256h cardButtonState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String selectedSegmentId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isFromDialog;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C27256h cardButtonState, String selectedSegmentId, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(cardButtonState, "cardButtonState");
            AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
            this.cardButtonState = cardButtonState;
            this.selectedSegmentId = selectedSegmentId;
            this.isFromDialog = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C27256h getCardButtonState() {
            return this.cardButtonState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSelectedSegmentId() {
            return this.selectedSegmentId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsFromDialog() {
            return this.isFromDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.cardButtonState, aVar.cardButtonState) && AbstractC22676k.m65745e(this.selectedSegmentId, aVar.selectedSegmentId) && this.isFromDialog == aVar.isFromDialog;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFromDialog) + AbstractC11266d.m30450d(this.cardButtonState.hashCode() * 31, 31, this.selectedSegmentId);
        }

        public String toString() {
            C27256h c27256h = this.cardButtonState;
            String str = this.selectedSegmentId;
            boolean z4 = this.isFromDialog;
            StringBuilder sb4 = new StringBuilder("CardButtonClicked(cardButtonState=");
            sb4.append(c27256h);
            sb4.append(", selectedSegmentId=");
            sb4.append(str);
            sb4.append(", isFromDialog=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    /* JADX INFO: renamed from: dg0.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldg0/b$b;", "Ldg0/b;", "<init>", "()V", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC12004b {

        /* JADX INFO: renamed from: a */
        public static final b f39600a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dg0.b$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Ldg0/b$c;", "Ldg0/b;", "", "source", "testCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC12004b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String source, String testCount) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(testCount, "testCount");
            this.source = source;
            this.testCount = testCount;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestCount() {
            return this.testCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.source, cVar.source) && AbstractC22676k.m65745e(this.testCount, cVar.testCount);
        }

        public int hashCode() {
            return this.testCount.hashCode() + (this.source.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("Refresh(source=", this.source, ", testCount=", this.testCount, ")");
        }
    }

    /* JADX INFO: renamed from: dg0.b$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ldg0/b$d;", "Ldg0/b;", "", "selectedSegmentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC12004b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String selectedSegmentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String selectedSegmentId) {
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
            return (other instanceof d) && AbstractC22676k.m65745e(this.selectedSegmentId, ((d) other).selectedSegmentId);
        }

        public int hashCode() {
            return this.selectedSegmentId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SegmentSelected(selectedSegmentId=", this.selectedSegmentId, ")");
        }
    }

    public /* synthetic */ AbstractC12004b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12004b() {
    }
}
