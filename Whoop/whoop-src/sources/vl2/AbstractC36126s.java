package vl2;

import bm2.C3439f0;
import cm2.EnumC4821i;
import com.mapbox.common.HttpHeaders;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import or2.EnumC28166h0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: vl2.s */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, m65681d2 = {"Lvl2/s;", "", "<init>", "()V", "m", "i", "l", "k", "a", "b", "p", "d", "j", "e", "f", "o", "n", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Lvl2/s$a;", "Lvl2/s$b;", "Lvl2/s$c;", "Lvl2/s$d;", "Lvl2/s$e;", "Lvl2/s$f;", "Lvl2/s$g;", "Lvl2/s$h;", "Lvl2/s$i;", "Lvl2/s$j;", "Lvl2/s$k;", "Lvl2/s$l;", "Lvl2/s$m;", "Lvl2/s$n;", "Lvl2/s$o;", "Lvl2/s$p;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36126s {

    /* JADX INFO: renamed from: vl2.s$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lvl2/s$a;", "Lvl2/s;", "Lbm2/f0;", "body", "<init>", "(Lbm2/f0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbm2/f0;", "()Lbm2/f0;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC36126s {

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

    /* JADX INFO: renamed from: vl2.s$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lvl2/s$b;", "Lvl2/s;", "Lbm2/f0;", "body", "<init>", "(Lbm2/f0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbm2/f0;", "()Lbm2/f0;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC36126s {

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

    /* JADX INFO: renamed from: vl2.s$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lvl2/s$c;", "Lvl2/s;", "Lcm2/i;", "measurementId", "Lvl2/a0;", "body", "<init>", "(Lcm2/i;Lvl2/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/i;", "b", "()Lcm2/i;", "Lvl2/a0;", "()Lvl2/a0;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC36126s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4821i measurementId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C36107a0 body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC4821i measurementId, C36107a0 body) {
            super(null);
            AbstractC22676k.m65750j(measurementId, "measurementId");
            AbstractC22676k.m65750j(body, "body");
            this.measurementId = measurementId;
            this.body = body;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C36107a0 getBody() {
            return this.body;
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
            return this.measurementId == cVar.measurementId && AbstractC22676k.m65745e(this.body, cVar.body);
        }

        public int hashCode() {
            return this.body.hashCode() + (this.measurementId.hashCode() * 31);
        }

        public String toString() {
            return "AddMenuSheetManualMeasurement(measurementId=" + this.measurementId + ", body=" + this.body + ")";
        }
    }

    /* JADX INFO: renamed from: vl2.s$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lvl2/s$d;", "Lvl2/s;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC36126s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String id4) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.id, ((d) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DeleteMeasurement(id=", this.id, ")");
        }
    }

    /* JADX INFO: renamed from: vl2.s$e */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lvl2/s$e;", "Lvl2/s;", "Lcm2/i;", "measurementId", "", "id", "<init>", "(Lcm2/i;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/i;", "b", "()Lcm2/i;", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC36126s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4821i measurementId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EnumC4821i measurementId, String id4) {
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
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.measurementId == eVar.measurementId && AbstractC22676k.m65745e(this.id, eVar.id);
        }

        public int hashCode() {
            return this.id.hashCode() + (this.measurementId.hashCode() * 31);
        }

        public String toString() {
            return "DeleteReportMeasurement(measurementId=" + this.measurementId + ", id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: vl2.s$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvl2/s$f;", "Lvl2/s;", "<init>", "()V", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC36126s {

        /* JADX INFO: renamed from: a */
        public static final f f154418a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vl2.s$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lvl2/s$g;", "Lvl2/s;", "", "componentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC36126s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String componentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String componentId) {
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
            return (other instanceof g) && AbstractC22676k.m65745e(this.componentId, ((g) other).componentId);
        }

        public int hashCode() {
            return this.componentId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DismissComponent(componentId=", this.componentId, ")");
        }
    }

    /* JADX INFO: renamed from: vl2.s$h */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lvl2/s$h;", "Lvl2/s;", "Lcm2/i;", "measurementId", "Lvl2/a0;", "body", "<init>", "(Lcm2/i;Lvl2/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/i;", "b", "()Lcm2/i;", "Lvl2/a0;", "()Lvl2/a0;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC36126s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4821i measurementId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C36107a0 body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(EnumC4821i measurementId, C36107a0 body) {
            super(null);
            AbstractC22676k.m65750j(measurementId, "measurementId");
            AbstractC22676k.m65750j(body, "body");
            this.measurementId = measurementId;
            this.body = body;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C36107a0 getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC4821i getMeasurementId() {
            return this.measurementId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return this.measurementId == hVar.measurementId && AbstractC22676k.m65745e(this.body, hVar.body);
        }

        public int hashCode() {
            return this.body.hashCode() + (this.measurementId.hashCode() * 31);
        }

        public String toString() {
            return "EditManualMeasurement(measurementId=" + this.measurementId + ", body=" + this.body + ")";
        }
    }

    /* JADX INFO: renamed from: vl2.s$i */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lvl2/s$i;", "Lvl2/s;", "Lor2/h0;", "graphKey", "", HttpHeaders.DATE, "", "sendTileProperties", "<init>", "(Lor2/h0;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lor2/h0;", "b", "()Lor2/h0;", "Ljava/lang/String;", "c", "Z", "()Z", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC36126s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean sendTileProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(EnumC28166h0 graphKey, String date, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(date, "date");
            this.graphKey = graphKey;
            this.date = date;
            this.sendTileProperties = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC28166h0 getGraphKey() {
            return this.graphKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getSendTileProperties() {
            return this.sendTileProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return this.graphKey == iVar.graphKey && AbstractC22676k.m65745e(this.date, iVar.date) && this.sendTileProperties == iVar.sendTileProperties;
        }

        public int hashCode() {
            return Boolean.hashCode(this.sendTileProperties) + AbstractC11266d.m30450d(this.graphKey.hashCode() * 31, 31, this.date);
        }

        public String toString() {
            EnumC28166h0 enumC28166h0 = this.graphKey;
            String str = this.date;
            boolean z4 = this.sendTileProperties;
            StringBuilder sb4 = new StringBuilder("LoadDataV3(graphKey=");
            sb4.append(enumC28166h0);
            sb4.append(", date=");
            sb4.append(str);
            sb4.append(", sendTileProperties=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    /* JADX INFO: renamed from: vl2.s$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lvl2/s$j;", "Lvl2/s;", "Lcm2/i;", "measurementId", "<init>", "(Lcm2/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/i;", "()Lcm2/i;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC36126s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4821i measurementId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(EnumC4821i measurementId) {
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
            return (other instanceof j) && this.measurementId == ((j) other).measurementId;
        }

        public int hashCode() {
            return this.measurementId.hashCode();
        }

        public String toString() {
            return "LoadMeasurementAllRecordsData(measurementId=" + this.measurementId + ")";
        }
    }

    /* JADX INFO: renamed from: vl2.s$k */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lvl2/s$k;", "Lvl2/s;", "Lor2/h0;", "graphKey", "", "nextToken", "<init>", "(Lor2/h0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lor2/h0;", "()Lor2/h0;", "b", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC36126s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String nextToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(EnumC28166h0 graphKey, String nextToken) {
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
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return this.graphKey == kVar.graphKey && AbstractC22676k.m65745e(this.nextToken, kVar.nextToken);
        }

        public int hashCode() {
            return this.nextToken.hashCode() + (this.graphKey.hashCode() * 31);
        }

        public String toString() {
            return "LoadMoreRecordedData(graphKey=" + this.graphKey + ", nextToken=" + this.nextToken + ")";
        }
    }

    /* JADX INFO: renamed from: vl2.s$l */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lvl2/s$l;", "Lvl2/s;", "Lor2/h0;", "graphKey", "<init>", "(Lor2/h0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lor2/h0;", "()Lor2/h0;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC36126s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(EnumC28166h0 graphKey) {
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
            return (other instanceof l) && this.graphKey == ((l) other).graphKey;
        }

        public int hashCode() {
            return this.graphKey.hashCode();
        }

        public String toString() {
            return "LoadRecordedData(graphKey=" + this.graphKey + ")";
        }
    }

    /* JADX INFO: renamed from: vl2.s$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvl2/s$m;", "Lvl2/s;", "<init>", "()V", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC36126s {

        /* JADX INFO: renamed from: a */
        public static final m f154429a = new m();

        private m() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vl2.s$n */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvl2/s$n;", "Lvl2/s;", "<init>", "()V", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC36126s {

        /* JADX INFO: renamed from: a */
        public static final n f154430a = new n();

        private n() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vl2.s$o */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvl2/s$o;", "Lvl2/s;", "<init>", "()V", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC36126s {

        /* JADX INFO: renamed from: a */
        public static final o f154431a = new o();

        private o() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vl2.s$p */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lvl2/s$p;", "Lvl2/s;", "", "id", "Lbm2/f0;", "body", "<init>", "(Ljava/lang/String;Lbm2/f0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lbm2/f0;", "()Lbm2/f0;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC36126s {

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

    public /* synthetic */ AbstractC36126s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36126s() {
    }
}
