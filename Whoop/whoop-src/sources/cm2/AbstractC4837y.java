package cm2;

import am2.InterfaceC1038q;
import androidx.core.app.NotificationCompat;
import bm2.C3439f0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import or2.EnumC28166h0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vl2.C36133z;
import vl2.EnumC36106a;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: cm2.y */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, m65681d2 = {"Lcm2/y;", "", "<init>", "()V", "n", "f", "l", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "j", "a", "b", "p", "d", "i", "m", "o", "c", "k", "e", "Lcm2/y$a;", "Lcm2/y$b;", "Lcm2/y$c;", "Lcm2/y$d;", "Lcm2/y$e;", "Lcm2/y$f;", "Lcm2/y$g;", "Lcm2/y$h;", "Lcm2/y$i;", "Lcm2/y$j;", "Lcm2/y$k;", "Lcm2/y$l;", "Lcm2/y$m;", "Lcm2/y$n;", "Lcm2/y$o;", "Lcm2/y$p;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4837y {

    /* JADX INFO: renamed from: cm2.y$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcm2/y$a;", "Lcm2/y;", "Lbm2/f0;", "body", "<init>", "(Lbm2/f0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbm2/f0;", "()Lbm2/f0;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C3439f0 body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3439f0 body) {
            super(null);
            AbstractC22676k.m65750j(body, "body");
            this.body = body;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C3439f0 getBody() {
            return this.body;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.body, ((a) other).body);
        }

        public int hashCode() {
            return this.body.hashCode();
        }

        public String toString() {
            return "AddManualMeasurement(body=" + this.body + ")";
        }
    }

    /* JADX INFO: renamed from: cm2.y$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcm2/y$b;", "Lcm2/y;", "Lbm2/f0;", "body", "<init>", "(Lbm2/f0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbm2/f0;", "()Lbm2/f0;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C3439f0 body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3439f0 body) {
            super(null);
            AbstractC22676k.m65750j(body, "body");
            this.body = body;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C3439f0 getBody() {
            return this.body;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.body, ((b) other).body);
        }

        public int hashCode() {
            return this.body.hashCode();
        }

        public String toString() {
            return "AddManualMeasurementAndRefresh(body=" + this.body + ")";
        }
    }

    /* JADX INFO: renamed from: cm2.y$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lcm2/y$c;", "Lcm2/y;", "Lcm2/i;", "measurementId", "", "id", "<init>", "(Lcm2/i;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/i;", "b", "()Lcm2/i;", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4821i measurementId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC4821i measurementId, String id4) {
            super(null);
            AbstractC22676k.m65750j(measurementId, "measurementId");
            AbstractC22676k.m65750j(id4, "id");
            this.measurementId = measurementId;
            this.id = id4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC4821i getMeasurementId() {
            return this.measurementId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.measurementId == cVar.measurementId && AbstractC22676k.m65745e(this.id, cVar.id);
        }

        public int hashCode() {
            return this.id.hashCode() + (this.measurementId.hashCode() * 31);
        }

        public String toString() {
            return "DeleteManualMeasurement(measurementId=" + this.measurementId + ", id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: cm2.y$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lcm2/y$d;", "Lcm2/y;", "", "id", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String id4, String source) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(source, "source");
            this.id = id4;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.id, dVar.id) && AbstractC22676k.m65745e(this.source, dVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("DeleteMeasurement(id=", this.id, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: cm2.y$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcm2/y$e;", "Lcm2/y;", "", "componentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String componentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String componentId) {
            super(null);
            AbstractC22676k.m65750j(componentId, "componentId");
            this.componentId = componentId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getComponentId() {
            return this.componentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.componentId, ((e) other).componentId);
        }

        public int hashCode() {
            return this.componentId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DismissInfoCallout(componentId=", this.componentId, ")");
        }
    }

    /* JADX INFO: renamed from: cm2.y$f */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lcm2/y$f;", "Lcm2/y;", "Lor2/h0;", "graphKey", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "", "dateString", "<init>", "(Lor2/h0;Lvl2/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lor2/h0;", "c", "()Lor2/h0;", "b", "Lvl2/a;", "()Lvl2/a;", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC36106a duration;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String dateString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EnumC28166h0 graphKey, EnumC36106a duration, String dateString) {
            super(null);
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(duration, "duration");
            AbstractC22676k.m65750j(dateString, "dateString");
            this.graphKey = graphKey;
            this.duration = duration;
            this.dateString = dateString;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDateString() {
            return this.dateString;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC36106a getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC28166h0 getGraphKey() {
            return this.graphKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return this.graphKey == fVar.graphKey && this.duration == fVar.duration && AbstractC22676k.m65745e(this.dateString, fVar.dateString);
        }

        public int hashCode() {
            return this.dateString.hashCode() + ((this.duration.hashCode() + (this.graphKey.hashCode() * 31)) * 31);
        }

        public String toString() {
            EnumC28166h0 enumC28166h0 = this.graphKey;
            EnumC36106a enumC36106a = this.duration;
            String str = this.dateString;
            StringBuilder sb4 = new StringBuilder("GraphSwitchV3(graphKey=");
            sb4.append(enumC28166h0);
            sb4.append(", duration=");
            sb4.append(enumC36106a);
            sb4.append(", dateString=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: cm2.y$g */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lcm2/y$g;", "Lcm2/y;", "Lor2/h0;", "graphKey", "", "nextToken", "<init>", "(Lor2/h0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lor2/h0;", "()Lor2/h0;", "b", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String nextToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumC28166h0 graphKey, String nextToken) {
            super(null);
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(nextToken, "nextToken");
            this.graphKey = graphKey;
            this.nextToken = nextToken;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC28166h0 getGraphKey() {
            return this.graphKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNextToken() {
            return this.nextToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return this.graphKey == gVar.graphKey && AbstractC22676k.m65745e(this.nextToken, gVar.nextToken);
        }

        public int hashCode() {
            return this.nextToken.hashCode() + (this.graphKey.hashCode() * 31);
        }

        public String toString() {
            return "LoadMoreRecordedData(graphKey=" + this.graphKey + ", nextToken=" + this.nextToken + ")";
        }
    }

    /* JADX INFO: renamed from: cm2.y$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcm2/y$h;", "Lcm2/y;", "Lor2/h0;", "graphKey", "<init>", "(Lor2/h0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lor2/h0;", "()Lor2/h0;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(EnumC28166h0 graphKey) {
            super(null);
            AbstractC22676k.m65750j(graphKey, "graphKey");
            this.graphKey = graphKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC28166h0 getGraphKey() {
            return this.graphKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && this.graphKey == ((h) other).graphKey;
        }

        public int hashCode() {
            return this.graphKey.hashCode();
        }

        public String toString() {
            return "LoadRecordedData(graphKey=" + this.graphKey + ")";
        }
    }

    /* JADX INFO: renamed from: cm2.y$i */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcm2/y$i;", "Lcm2/y;", "Lcm2/i;", "measurementId", "<init>", "(Lcm2/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/i;", "()Lcm2/i;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4821i measurementId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(EnumC4821i measurementId) {
            super(null);
            AbstractC22676k.m65750j(measurementId, "measurementId");
            this.measurementId = measurementId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC4821i getMeasurementId() {
            return this.measurementId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && this.measurementId == ((i) other).measurementId;
        }

        public int hashCode() {
            return this.measurementId.hashCode();
        }

        public String toString() {
            return "LoadReportData(measurementId=" + this.measurementId + ")";
        }
    }

    /* JADX INFO: renamed from: cm2.y$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcm2/y$j;", "Lcm2/y;", "<init>", "()V", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC4837y {

        /* JADX INFO: renamed from: a */
        public static final j f19977a = new j();

        private j() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: cm2.y$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcm2/y$k;", "Lcm2/y;", "Lam2/q;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lam2/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lam2/q;", "()Lam2/q;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC1038q event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC1038q event) {
            super(null);
            AbstractC22676k.m65750j(event, "event");
            this.event = event;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC1038q getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && AbstractC22676k.m65745e(this.event, ((k) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "MenuBottomSheetEvent(event=" + this.event + ")";
        }
    }

    /* JADX INFO: renamed from: cm2.y$l */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, m65681d2 = {"Lcm2/y$l;", "Lcm2/y;", "", "Lvl2/z;", "scrubValues", "Lor2/h0;", "graphKey", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "", "dateString", "", "sendAnalytics", "<init>", "(Ljava/util/List;Lor2/h0;Lvl2/a;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lor2/h0;", "c", "()Lor2/h0;", "Lvl2/a;", "()Lvl2/a;", "Ljava/lang/String;", "e", "Z", "()Z", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C36133z> scrubValues;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC36106a duration;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String dateString;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean sendAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List<C36133z> scrubValues, EnumC28166h0 graphKey, EnumC36106a duration, String dateString, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(scrubValues, "scrubValues");
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(duration, "duration");
            AbstractC22676k.m65750j(dateString, "dateString");
            this.scrubValues = scrubValues;
            this.graphKey = graphKey;
            this.duration = duration;
            this.dateString = dateString;
            this.sendAnalytics = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDateString() {
            return this.dateString;
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
        public final List<C36133z> m15379d() {
            return this.scrubValues;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getSendAnalytics() {
            return this.sendAnalytics;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.scrubValues, lVar.scrubValues) && this.graphKey == lVar.graphKey && this.duration == lVar.duration && AbstractC22676k.m65745e(this.dateString, lVar.dateString) && this.sendAnalytics == lVar.sendAnalytics;
        }

        public int hashCode() {
            return Boolean.hashCode(this.sendAnalytics) + AbstractC11266d.m30450d((this.duration.hashCode() + ((this.graphKey.hashCode() + (this.scrubValues.hashCode() * 31)) * 31)) * 31, 31, this.dateString);
        }

        public String toString() {
            List<C36133z> list = this.scrubValues;
            EnumC28166h0 enumC28166h0 = this.graphKey;
            EnumC36106a enumC36106a = this.duration;
            String str = this.dateString;
            boolean z4 = this.sendAnalytics;
            StringBuilder sb4 = new StringBuilder("OnScrubV3(scrubValues=");
            sb4.append(list);
            sb4.append(", graphKey=");
            sb4.append(enumC28166h0);
            sb4.append(", duration=");
            sb4.append(enumC36106a);
            sb4.append(", dateString=");
            sb4.append(str);
            sb4.append(", sendAnalytics=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    /* JADX INFO: renamed from: cm2.y$m */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcm2/y$m;", "Lcm2/y;", "Lcm2/i;", "measurementId", "<init>", "(Lcm2/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/i;", "()Lcm2/i;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4821i measurementId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(EnumC4821i measurementId) {
            super(null);
            AbstractC22676k.m65750j(measurementId, "measurementId");
            this.measurementId = measurementId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC4821i getMeasurementId() {
            return this.measurementId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && this.measurementId == ((m) other).measurementId;
        }

        public int hashCode() {
            return this.measurementId.hashCode();
        }

        public String toString() {
            return "OpenReportData(measurementId=" + this.measurementId + ")";
        }
    }

    /* JADX INFO: renamed from: cm2.y$o */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcm2/y$o;", "Lcm2/y;", "Lcm2/i;", "measurementId", "<init>", "(Lcm2/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/i;", "()Lcm2/i;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4821i measurementId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(EnumC4821i measurementId) {
            super(null);
            AbstractC22676k.m65750j(measurementId, "measurementId");
            this.measurementId = measurementId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC4821i getMeasurementId() {
            return this.measurementId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && this.measurementId == ((o) other).measurementId;
        }

        public int hashCode() {
            return this.measurementId.hashCode();
        }

        public String toString() {
            return "ReloadReportDataAfterDelete(measurementId=" + this.measurementId + ")";
        }
    }

    /* JADX INFO: renamed from: cm2.y$p */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lcm2/y$p;", "Lcm2/y;", "", "id", "Lbm2/f0;", "body", "<init>", "(Ljava/lang/String;Lbm2/f0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lbm2/f0;", "()Lbm2/f0;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C3439f0 body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String id4, C3439f0 body) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(body, "body");
            this.id = id4;
            this.body = body;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C3439f0 getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return AbstractC22676k.m65745e(this.id, pVar.id) && AbstractC22676k.m65745e(this.body, pVar.body);
        }

        public int hashCode() {
            return this.body.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "UpdateManualMeasurement(id=" + this.id + ", body=" + this.body + ")";
        }
    }

    public /* synthetic */ AbstractC4837y(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4837y() {
    }

    /* JADX INFO: renamed from: cm2.y$n */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001c\u0010%R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010#¨\u0006'"}, m65681d2 = {"Lcm2/y$n;", "Lcm2/y;", "Lor2/h0;", "graphKey", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "", "dateString", "", "sendTileProperties", "Lcm2/d;", "direction", "isTrendMenuSelection", "<init>", "(Lor2/h0;Lvl2/a;Ljava/lang/String;ZLcm2/d;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lor2/h0;", "d", "()Lor2/h0;", "b", "Lvl2/a;", "c", "()Lvl2/a;", "Ljava/lang/String;", "Z", "e", "()Z", "Lcm2/d;", "()Lcm2/d;", "f", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC4837y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC36106a duration;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String dateString;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean sendTileProperties;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC4816d direction;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isTrendMenuSelection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(EnumC28166h0 graphKey, EnumC36106a duration, String dateString, boolean z4, EnumC4816d direction, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(duration, "duration");
            AbstractC22676k.m65750j(dateString, "dateString");
            AbstractC22676k.m65750j(direction, "direction");
            this.graphKey = graphKey;
            this.duration = duration;
            this.dateString = dateString;
            this.sendTileProperties = z4;
            this.direction = direction;
            this.isTrendMenuSelection = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDateString() {
            return this.dateString;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC4816d getDirection() {
            return this.direction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC36106a getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final EnumC28166h0 getGraphKey() {
            return this.graphKey;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getSendTileProperties() {
            return this.sendTileProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n)) {
                return false;
            }
            n nVar = (n) other;
            return this.graphKey == nVar.graphKey && this.duration == nVar.duration && AbstractC22676k.m65745e(this.dateString, nVar.dateString) && this.sendTileProperties == nVar.sendTileProperties && this.direction == nVar.direction && this.isTrendMenuSelection == nVar.isTrendMenuSelection;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsTrendMenuSelection() {
            return this.isTrendMenuSelection;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isTrendMenuSelection) + ((this.direction.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d((this.duration.hashCode() + (this.graphKey.hashCode() * 31)) * 31, 31, this.dateString), 31, this.sendTileProperties)) * 31);
        }

        public String toString() {
            EnumC28166h0 enumC28166h0 = this.graphKey;
            EnumC36106a enumC36106a = this.duration;
            String str = this.dateString;
            boolean z4 = this.sendTileProperties;
            EnumC4816d enumC4816d = this.direction;
            boolean z13 = this.isTrendMenuSelection;
            StringBuilder sb4 = new StringBuilder("RefreshV3(graphKey=");
            sb4.append(enumC28166h0);
            sb4.append(", duration=");
            sb4.append(enumC36106a);
            sb4.append(", dateString=");
            AbstractC38963t7.m124390t(sb4, str, ", sendTileProperties=", z4, ", direction=");
            sb4.append(enumC4816d);
            sb4.append(", isTrendMenuSelection=");
            sb4.append(z13);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ n(EnumC28166h0 enumC28166h0, EnumC36106a enumC36106a, String str, boolean z4, EnumC4816d enumC4816d, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC28166h0, enumC36106a, str, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? EnumC4816d.NONE : enumC4816d, (i13 & 32) != 0 ? false : z13);
        }
    }
}
