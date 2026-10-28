package uz0;

import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uz0.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, m65681d2 = {"Luz0/h;", "", "a", "Luz0/h$a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC35414h {

    /* JADX INFO: renamed from: uz0.h$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0018"}, m65681d2 = {"Luz0/h$a;", "Luz0/h;", "", "tileId", "", "currentSelectedState", "activityTitle", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC35414h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String tileId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean currentSelectedState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String activityTitle;

        public a(String tileId, boolean z4, String activityTitle) {
            AbstractC22676k.m65750j(tileId, "tileId");
            AbstractC22676k.m65750j(activityTitle, "activityTitle");
            this.tileId = tileId;
            this.currentSelectedState = z4;
            this.activityTitle = activityTitle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityTitle() {
            return this.activityTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getCurrentSelectedState() {
            return this.currentSelectedState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTileId() {
            return this.tileId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.tileId, aVar.tileId) && this.currentSelectedState == aVar.currentSelectedState && AbstractC22676k.m65745e(this.activityTitle, aVar.activityTitle);
        }

        public int hashCode() {
            return this.activityTitle.hashCode() + AbstractC2875y.m8289b(this.tileId.hashCode() * 31, 31, this.currentSelectedState);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.activityTitle, ")", AbstractC25012a.m73379l("CommitButtonClicked(tileId=", this.tileId, ", currentSelectedState=", ", activityTitle=", this.currentSelectedState));
        }
    }
}
