package vl2;

import com.mapbox.common.HttpHeaders;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import or2.EnumC28166h0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: vl2.x */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lvl2/x;", "", "<init>", "()V", "a", "b", "Lvl2/x$a;", "Lvl2/x$b;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36131x {

    /* JADX INFO: renamed from: vl2.x$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lvl2/x$a;", "Lvl2/x;", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "Lor2/h0;", "graphKey", "", HttpHeaders.DATE, "<init>", "(Lvl2/a;Lor2/h0;Ljava/lang/String;)V", "a", "Lvl2/a;", "b", "()Lvl2/a;", "Lor2/h0;", "c", "()Lor2/h0;", "Ljava/lang/String;", "()Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC36131x {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC36106a duration;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC36106a duration, EnumC28166h0 graphKey, String date) {
            super(null);
            AbstractC22676k.m65750j(duration, "duration");
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(date, "date");
            this.duration = duration;
            this.graphKey = graphKey;
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC36106a getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC28166h0 getGraphKey() {
            return this.graphKey;
        }
    }

    /* JADX INFO: renamed from: vl2.x$b */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u0017\u0010\u000e¨\u0006\""}, m65681d2 = {"Lvl2/x$b;", "Lvl2/x;", "", "Lvl2/z;", "scrubValues", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "Lor2/h0;", "graphKey", "", HttpHeaders.DATE, "<init>", "(Ljava/util/List;Lvl2/a;Lor2/h0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lvl2/a;", "()Lvl2/a;", "c", "Lor2/h0;", "()Lor2/h0;", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC36131x {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C36133z> scrubValues;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC36106a duration;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<C36133z> scrubValues, EnumC36106a duration, EnumC28166h0 graphKey, String date) {
            super(null);
            AbstractC22676k.m65750j(scrubValues, "scrubValues");
            AbstractC22676k.m65750j(duration, "duration");
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(date, "date");
            this.scrubValues = scrubValues;
            this.duration = duration;
            this.graphKey = graphKey;
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC36106a getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC28166h0 getGraphKey() {
            return this.graphKey;
        }

        /* JADX INFO: renamed from: d */
        public final List<C36133z> m114951d() {
            return this.scrubValues;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.scrubValues, bVar.scrubValues) && this.duration == bVar.duration && this.graphKey == bVar.graphKey && AbstractC22676k.m65745e(this.date, bVar.date);
        }

        public int hashCode() {
            return this.date.hashCode() + ((this.graphKey.hashCode() + ((this.duration.hashCode() + (this.scrubValues.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return "ScrubV3(scrubValues=" + this.scrubValues + ", duration=" + this.duration + ", graphKey=" + this.graphKey + ", date=" + this.date + ")";
        }
    }

    public /* synthetic */ AbstractC36131x(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36131x() {
    }
}
