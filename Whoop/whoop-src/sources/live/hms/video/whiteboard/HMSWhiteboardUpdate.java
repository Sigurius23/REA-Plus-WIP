package live.hms.video.whiteboard;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Llive/hms/video/whiteboard/HMSWhiteboardUpdate;", "", "<init>", "()V", "Start", "Stop", "Llive/hms/video/whiteboard/HMSWhiteboardUpdate$Start;", "Llive/hms/video/whiteboard/HMSWhiteboardUpdate$Stop;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class HMSWhiteboardUpdate {

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/whiteboard/HMSWhiteboardUpdate$Start;", "Llive/hms/video/whiteboard/HMSWhiteboardUpdate;", "hmsWhiteboard", "Llive/hms/video/whiteboard/HMSWhiteboard;", "<init>", "(Llive/hms/video/whiteboard/HMSWhiteboard;)V", "getHmsWhiteboard", "()Llive/hms/video/whiteboard/HMSWhiteboard;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Start extends HMSWhiteboardUpdate {
        private final HMSWhiteboard hmsWhiteboard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Start(HMSWhiteboard hmsWhiteboard) {
            super(null);
            AbstractC22676k.m65750j(hmsWhiteboard, "hmsWhiteboard");
            this.hmsWhiteboard = hmsWhiteboard;
        }

        public static /* synthetic */ Start copy$default(Start start, HMSWhiteboard hMSWhiteboard, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hMSWhiteboard = start.hmsWhiteboard;
            }
            return start.copy(hMSWhiteboard);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSWhiteboard getHmsWhiteboard() {
            return this.hmsWhiteboard;
        }

        public final Start copy(HMSWhiteboard hmsWhiteboard) {
            AbstractC22676k.m65750j(hmsWhiteboard, "hmsWhiteboard");
            return new Start(hmsWhiteboard);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Start) && AbstractC22676k.m65745e(this.hmsWhiteboard, ((Start) other).hmsWhiteboard);
        }

        public final HMSWhiteboard getHmsWhiteboard() {
            return this.hmsWhiteboard;
        }

        public int hashCode() {
            return this.hmsWhiteboard.hashCode();
        }

        public String toString() {
            return "Start(hmsWhiteboard=" + this.hmsWhiteboard + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/whiteboard/HMSWhiteboardUpdate$Stop;", "Llive/hms/video/whiteboard/HMSWhiteboardUpdate;", "hmsWhiteboard", "Llive/hms/video/whiteboard/HMSWhiteboard;", "<init>", "(Llive/hms/video/whiteboard/HMSWhiteboard;)V", "getHmsWhiteboard", "()Llive/hms/video/whiteboard/HMSWhiteboard;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Stop extends HMSWhiteboardUpdate {
        private final HMSWhiteboard hmsWhiteboard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stop(HMSWhiteboard hmsWhiteboard) {
            super(null);
            AbstractC22676k.m65750j(hmsWhiteboard, "hmsWhiteboard");
            this.hmsWhiteboard = hmsWhiteboard;
        }

        public static /* synthetic */ Stop copy$default(Stop stop, HMSWhiteboard hMSWhiteboard, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hMSWhiteboard = stop.hmsWhiteboard;
            }
            return stop.copy(hMSWhiteboard);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSWhiteboard getHmsWhiteboard() {
            return this.hmsWhiteboard;
        }

        public final Stop copy(HMSWhiteboard hmsWhiteboard) {
            AbstractC22676k.m65750j(hmsWhiteboard, "hmsWhiteboard");
            return new Stop(hmsWhiteboard);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stop) && AbstractC22676k.m65745e(this.hmsWhiteboard, ((Stop) other).hmsWhiteboard);
        }

        public final HMSWhiteboard getHmsWhiteboard() {
            return this.hmsWhiteboard;
        }

        public int hashCode() {
            return this.hmsWhiteboard.hashCode();
        }

        public String toString() {
            return "Stop(hmsWhiteboard=" + this.hmsWhiteboard + ')';
        }
    }

    public /* synthetic */ HMSWhiteboardUpdate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HMSWhiteboardUpdate() {
    }
}
