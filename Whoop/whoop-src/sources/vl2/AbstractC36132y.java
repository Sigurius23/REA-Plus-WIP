package vl2;

import com.mapbox.common.HttpHeaders;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import or2.EnumC28166h0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: vl2.y */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lvl2/y;", "", "<init>", "()V", "a", "Lvl2/y$a;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36132y {
    public /* synthetic */ AbstractC36132y(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36132y() {
    }

    /* JADX INFO: renamed from: vl2.y$a */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0017\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, m65681d2 = {"Lvl2/y$a;", "Lvl2/y;", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "Lor2/h0;", "graphKey", "", HttpHeaders.DATE, "", "Lvl2/z;", "scrubValue", "<init>", "(Lvl2/a;Lor2/h0;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvl2/a;", "b", "()Lvl2/a;", "Lor2/h0;", "c", "()Lor2/h0;", "Ljava/lang/String;", "d", "Ljava/util/List;", "()Ljava/util/List;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC36132y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC36106a duration;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C36133z> scrubValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC36106a duration, EnumC28166h0 graphKey, String date, List<C36133z> scrubValue) {
            super(null);
            AbstractC22676k.m65750j(duration, "duration");
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(date, "date");
            AbstractC22676k.m65750j(scrubValue, "scrubValue");
            this.duration = duration;
            this.graphKey = graphKey;
            this.date = date;
            this.scrubValue = scrubValue;
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
        public final List<C36133z> m114955d() {
            return this.scrubValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.duration == aVar.duration && this.graphKey == aVar.graphKey && AbstractC22676k.m65745e(this.date, aVar.date) && AbstractC22676k.m65745e(this.scrubValue, aVar.scrubValue);
        }

        public int hashCode() {
            return this.scrubValue.hashCode() + AbstractC11266d.m30450d((this.graphKey.hashCode() + (this.duration.hashCode() * 31)) * 31, 31, this.date);
        }

        public String toString() {
            EnumC36106a enumC36106a = this.duration;
            EnumC28166h0 enumC28166h0 = this.graphKey;
            String str = this.date;
            List<C36133z> list = this.scrubValue;
            StringBuilder sb4 = new StringBuilder("ResultV3(duration=");
            sb4.append(enumC36106a);
            sb4.append(", graphKey=");
            sb4.append(enumC28166h0);
            sb4.append(", date=");
            return AbstractC30007c.m91840j(str, ", scrubValue=", ")", sb4, list);
        }

        public /* synthetic */ a(EnumC36106a enumC36106a, EnumC28166h0 enumC28166h0, String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC36106a, enumC28166h0, str, (i13 & 8) != 0 ? AbstractC37056f.m118958J(new C36133z(null, null, null, null, null, null, null, 127, null)) : list);
        }
    }
}
