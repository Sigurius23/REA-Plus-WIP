package oy2;

import c13.AbstractC3855a;
import com.whoop.whooplabs.data.domain.ProtocolStepWithOptions;
import com.whoop.whooplabs.data.domain.SurveyProvider;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepConfigResponse;
import com.whoop.whooplabs.data.room.entity.ProtocolStepResult;
import com.whoop.whooplabs.data.room.entity.RemoteCampaign;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudy;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;
import yw2.C39830b;

/* JADX INFO: renamed from: oy2.l */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u001e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u001e\"#$%&'()*+,-./0123456789:;<=>?¨\u0006@"}, m65681d2 = {"Loy2/l;", "", "<init>", "()V", "q", "i", "z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "y", "c", "m", "n", "l", "x", "o", "g", "a0", "d", "f", "j", "d0", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "b", "t", "s", "b0", "r", "u", "c0", "k", "e", "p", "a", "Loy2/l$a;", "Loy2/l$b;", "Loy2/l$c;", "Loy2/l$d;", "Loy2/l$e;", "Loy2/l$f;", "Loy2/l$g;", "Loy2/l$h;", "Loy2/l$i;", "Loy2/l$j;", "Loy2/l$k;", "Loy2/l$l;", "Loy2/l$m;", "Loy2/l$n;", "Loy2/l$o;", "Loy2/l$p;", "Loy2/l$q;", "Loy2/l$r;", "Loy2/l$s;", "Loy2/l$t;", "Loy2/l$u;", "Loy2/l$v;", "Loy2/l$w;", "Loy2/l$x;", "Loy2/l$y;", "Loy2/l$z;", "Loy2/l$a0;", "Loy2/l$b0;", "Loy2/l$c0;", "Loy2/l$d0;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28486l {

    /* JADX INFO: renamed from: oy2.l$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loy2/l$a;", "Loy2/l;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC28486l {

        /* JADX INFO: renamed from: a */
        public static final a f115313a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oy2.l$a0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Loy2/l$a0;", "Loy2/l;", "", "reading", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a0 extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String reading;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String reading) {
            super(null);
            AbstractC22676k.m65750j(reading, "reading");
            this.reading = reading;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getReading() {
            return this.reading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a0) && AbstractC22676k.m65745e(this.reading, ((a0) other).reading);
        }

        public int hashCode() {
            return this.reading.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SystolicChanged(reading=", this.reading, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.l$b */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m65681d2 = {"Loy2/l$b;", "Loy2/l;", "Loy2/b$f;", "campaignStepDomainState", "<init>", "(Loy2/b$f;)V", "a", "Loy2/b$f;", "()Loy2/b$f;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC28476b.f campaignStepDomainState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28476b.f campaignStepDomainState) {
            super(null);
            AbstractC22676k.m65750j(campaignStepDomainState, "campaignStepDomainState");
            this.campaignStepDomainState = campaignStepDomainState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC28476b.f getCampaignStepDomainState() {
            return this.campaignStepDomainState;
        }
    }

    /* JADX INFO: renamed from: oy2.l$b0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Loy2/l$b0;", "Loy2/l;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b0 extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String text) {
            super(null);
            AbstractC22676k.m65750j(text, "text");
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b0) && AbstractC22676k.m65745e(this.text, ((b0) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TextInputChanged(text=", this.text, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.l$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Loy2/l$c;", "Loy2/l;", "", "campaignId", "sessionId", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int sessionId;

        public c(int i13, int i14) {
            super(null);
            this.campaignId = i13;
            this.sessionId = i14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.campaignId == cVar.campaignId && this.sessionId == cVar.sessionId;
        }

        public int hashCode() {
            return Integer.hashCode(this.sessionId) + (Integer.hashCode(this.campaignId) * 31);
        }

        public String toString() {
            return AbstractC25012a.m73372e(this.campaignId, this.sessionId, "CancelStudy(campaignId=", ", sessionId=", ")");
        }
    }

    /* JADX INFO: renamed from: oy2.l$c0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Loy2/l$c0;", "Loy2/l;", "", "hour", "minutes", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c0 extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int hour;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int minutes;

        public c0(int i13, int i14) {
            super(null);
            this.hour = i13;
            this.minutes = i14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getHour() {
            return this.hour;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getMinutes() {
            return this.minutes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) other;
            return this.hour == c0Var.hour && this.minutes == c0Var.minutes;
        }

        public int hashCode() {
            return Integer.hashCode(this.minutes) + (Integer.hashCode(this.hour) * 31);
        }

        public String toString() {
            return AbstractC25012a.m73372e(this.hour, this.minutes, "TimePickerChanged(hour=", ", minutes=", ")");
        }
    }

    /* JADX INFO: renamed from: oy2.l$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Loy2/l$d;", "Loy2/l;", "", "address", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String address;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String address) {
            super(null);
            AbstractC22676k.m65750j(address, "address");
            this.address = address;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.address, ((d) other).address);
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ConnectingDevice(address=", this.address, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.l$d0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Loy2/l$d0;", "Loy2/l;", "", "step", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d0 extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int step;

        public d0(int i13) {
            super(null);
            this.step = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getStep() {
            return this.step;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d0) && this.step == ((d0) other).step;
        }

        public int hashCode() {
            return Integer.hashCode(this.step);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.step, "UpdateCurrentStep(step=", ")");
        }
    }

    /* JADX INFO: renamed from: oy2.l$e */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Loy2/l$e;", "Loy2/l;", "", "year", "month", "day", "hour", "minutes", "", "isUserInteraction", "<init>", "(IIIIIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "d", "c", "f", "Z", "()Z", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int year;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int month;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int day;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int hour;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final int minutes;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isUserInteraction;

        public e(int i13, int i14, int i15, int i16, int i17, boolean z4) {
            super(null);
            this.year = i13;
            this.month = i14;
            this.day = i15;
            this.hour = i16;
            this.minutes = i17;
            this.isUserInteraction = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getDay() {
            return this.day;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getHour() {
            return this.hour;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMinutes() {
            return this.minutes;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMonth() {
            return this.month;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getYear() {
            return this.year;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.year == eVar.year && this.month == eVar.month && this.day == eVar.day && this.hour == eVar.hour && this.minutes == eVar.minutes && this.isUserInteraction == eVar.isUserInteraction;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsUserInteraction() {
            return this.isUserInteraction;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isUserInteraction) + AbstractC11266d.m30448b(this.minutes, AbstractC11266d.m30448b(this.hour, AbstractC11266d.m30448b(this.day, AbstractC11266d.m30448b(this.month, Integer.hashCode(this.year) * 31, 31), 31), 31), 31);
        }

        public String toString() {
            int i13 = this.year;
            int i14 = this.month;
            int i15 = this.day;
            int i16 = this.hour;
            int i17 = this.minutes;
            boolean z4 = this.isUserInteraction;
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "DateTimeChanged(year=", ", month=", ", day=");
            AbstractC30802r.m94773v(sbM30465s, i15, ", hour=", i16, ", minutes=");
            sbM30465s.append(i17);
            sbM30465s.append(", isUserInteraction=");
            sbM30465s.append(z4);
            sbM30465s.append(")");
            return sbM30465s.toString();
        }
    }

    /* JADX INFO: renamed from: oy2.l$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Loy2/l$f;", "Loy2/l;", "", "address", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String address;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String address) {
            super(null);
            AbstractC22676k.m65750j(address, "address");
            this.address = address;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.address, ((f) other).address);
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DeviceConnected(address=", this.address, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.l$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Loy2/l$g;", "Loy2/l;", "", "reading", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String reading;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String reading) {
            super(null);
            AbstractC22676k.m65750j(reading, "reading");
            this.reading = reading;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getReading() {
            return this.reading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.reading, ((g) other).reading);
        }

        public int hashCode() {
            return this.reading.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DiastolicChanged(reading=", this.reading, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.l$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loy2/l$h;", "Loy2/l;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC28486l {

        /* JADX INFO: renamed from: a */
        public static final h f115331a = new h();

        private h() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oy2.l$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Loy2/l$i;", "Loy2/l;", "", "campaignId", "sessionId", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer sessionId;

        public i(int i13, Integer num) {
            super(null);
            this.campaignId = i13;
            this.sessionId = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return this.campaignId == iVar.campaignId && AbstractC22676k.m65745e(this.sessionId, iVar.sessionId);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.campaignId) * 31;
            Integer num = this.sessionId;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Error(campaignId=" + this.campaignId + ", sessionId=" + this.sessionId + ")";
        }
    }

    /* JADX INFO: renamed from: oy2.l$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Loy2/l$j;", "Loy2/l;", "", "address", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String address;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String address) {
            super(null);
            AbstractC22676k.m65750j(address, "address");
            this.address = address;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && AbstractC22676k.m65745e(this.address, ((j) other).address);
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ErrorConnectingDevice(address=", this.address, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.l$k */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Loy2/l$k;", "Loy2/l;", "", "message", "Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "surveyProvider", "<init>", "(Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "()Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final SurveyProvider surveyProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String message, SurveyProvider surveyProvider) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(surveyProvider, "surveyProvider");
            this.message = message;
            this.surveyProvider = surveyProvider;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final SurveyProvider getSurveyProvider() {
            return this.surveyProvider;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.message, kVar.message) && this.surveyProvider == kVar.surveyProvider;
        }

        public int hashCode() {
            return this.surveyProvider.hashCode() + (this.message.hashCode() * 31);
        }

        public String toString() {
            return "ErrorLoadingWebView(message=" + this.message + ", surveyProvider=" + this.surveyProvider + ")";
        }
    }

    /* JADX INFO: renamed from: oy2.l$l */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Loy2/l$l;", "Loy2/l;", "", "campaignId", "sessionId", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer sessionId;

        public l(int i13, Integer num) {
            super(null);
            this.campaignId = i13;
            this.sessionId = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return this.campaignId == lVar.campaignId && AbstractC22676k.m65745e(this.sessionId, lVar.sessionId);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.campaignId) * 31;
            Integer num = this.sessionId;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "ErrorNoStrap(campaignId=" + this.campaignId + ", sessionId=" + this.sessionId + ")";
        }
    }

    /* JADX INFO: renamed from: oy2.l$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loy2/l$m;", "Loy2/l;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC28486l {

        /* JADX INFO: renamed from: a */
        public static final m f115339a = new m();

        private m() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oy2.l$n */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loy2/l$n;", "Loy2/l;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC28486l {

        /* JADX INFO: renamed from: a */
        public static final n f115340a = new n();

        private n() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oy2.l$o */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Loy2/l$o;", "Loy2/l;", "", "reading", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String reading;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String reading) {
            super(null);
            AbstractC22676k.m65750j(reading, "reading");
            this.reading = reading;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getReading() {
            return this.reading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && AbstractC22676k.m65745e(this.reading, ((o) other).reading);
        }

        public int hashCode() {
            return this.reading.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("HeartRateChanged(reading=", this.reading, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.l$p */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Loy2/l$p;", "Loy2/l;", "", "Lyw2/b;", "devices", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C39830b> devices;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(List<C39830b> devices) {
            super(null);
            AbstractC22676k.m65750j(devices, "devices");
            this.devices = devices;
        }

        /* JADX INFO: renamed from: a */
        public final List<C39830b> m86766a() {
            return this.devices;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof p) && AbstractC22676k.m65745e(this.devices, ((p) other).devices);
        }

        public int hashCode() {
            return this.devices.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("HrDevicesUpdate(devices=", ")", this.devices);
        }
    }

    /* JADX INFO: renamed from: oy2.l$q */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loy2/l$q;", "Loy2/l;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC28486l {

        /* JADX INFO: renamed from: a */
        public static final q f115343a = new q();

        private q() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oy2.l$r */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loy2/l$r;", "Loy2/l;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC28486l {

        /* JADX INFO: renamed from: a */
        public static final r f115344a = new r();

        private r() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oy2.l$s */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Loy2/l$s;", "Loy2/l;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String value) {
            super(null);
            AbstractC22676k.m65750j(value, "value");
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s) && AbstractC22676k.m65745e(this.value, ((s) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("NumberInputEntered(value=", this.value, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.l$t */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Loy2/l$t;", "Loy2/l;", "", "key", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String key) {
            super(null);
            AbstractC22676k.m65750j(key, "key");
            this.key = key;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof t) && AbstractC22676k.m65745e(this.key, ((t) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OptionSelected(key=", this.key, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.l$u */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Loy2/l$u;", "Loy2/l;", "", "isResuming", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isResuming;

        public u(boolean z4) {
            super(null);
            this.isResuming = z4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof u) && this.isResuming == ((u) other).isResuming;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isResuming);
        }

        public String toString() {
            return AbstractC3855a.m11827k("RefreshElapsedTime(isResuming=", ")", this.isResuming);
        }
    }

    /* JADX INFO: renamed from: oy2.l$v */
    @Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001a\u0010(¨\u0006)"}, m65681d2 = {"Loy2/l$v;", "Loy2/l;", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "study", "", "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;", "steps", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "studyConfig", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "protocolStepResults", "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;", "remoteCampaign", "<init>", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "getStudy", "()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "d", "getProtocolStepResults", "e", "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;", "()Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class v extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final WhoopLabsStudy study;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<ProtocolStepWithOptions> steps;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final CampaignStepConfigResponse studyConfig;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<ProtocolStepResult> protocolStepResults;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final RemoteCampaign remoteCampaign;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(WhoopLabsStudy study, List<ProtocolStepWithOptions> steps, CampaignStepConfigResponse studyConfig, List<ProtocolStepResult> protocolStepResults, RemoteCampaign remoteCampaign) {
            super(null);
            AbstractC22676k.m65750j(study, "study");
            AbstractC22676k.m65750j(steps, "steps");
            AbstractC22676k.m65750j(studyConfig, "studyConfig");
            AbstractC22676k.m65750j(protocolStepResults, "protocolStepResults");
            AbstractC22676k.m65750j(remoteCampaign, "remoteCampaign");
            this.study = study;
            this.steps = steps;
            this.studyConfig = studyConfig;
            this.protocolStepResults = protocolStepResults;
            this.remoteCampaign = remoteCampaign;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final RemoteCampaign getRemoteCampaign() {
            return this.remoteCampaign;
        }

        /* JADX INFO: renamed from: b */
        public final List<ProtocolStepWithOptions> m86770b() {
            return this.steps;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CampaignStepConfigResponse getStudyConfig() {
            return this.studyConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof v)) {
                return false;
            }
            v vVar = (v) other;
            return AbstractC22676k.m65745e(this.study, vVar.study) && AbstractC22676k.m65745e(this.steps, vVar.steps) && AbstractC22676k.m65745e(this.studyConfig, vVar.studyConfig) && AbstractC22676k.m65745e(this.protocolStepResults, vVar.protocolStepResults) && AbstractC22676k.m65745e(this.remoteCampaign, vVar.remoteCampaign);
        }

        public int hashCode() {
            return this.remoteCampaign.hashCode() + AbstractC11895b.m31983b((this.studyConfig.hashCode() + AbstractC11895b.m31983b(this.study.hashCode() * 31, 31, this.steps)) * 31, 31, this.protocolStepResults);
        }

        public String toString() {
            return "Setup(study=" + this.study + ", steps=" + this.steps + ", studyConfig=" + this.studyConfig + ", protocolStepResults=" + this.protocolStepResults + ", remoteCampaign=" + this.remoteCampaign + ")";
        }
    }

    /* JADX INFO: renamed from: oy2.l$w */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Loy2/l$w;", "Loy2/l;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "studyConfig", "<init>", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class w extends AbstractC28486l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CampaignStepConfigResponse studyConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(CampaignStepConfigResponse studyConfig) {
            super(null);
            AbstractC22676k.m65750j(studyConfig, "studyConfig");
            this.studyConfig = studyConfig;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CampaignStepConfigResponse getStudyConfig() {
            return this.studyConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof w) && AbstractC22676k.m65745e(this.studyConfig, ((w) other).studyConfig);
        }

        public int hashCode() {
            return this.studyConfig.hashCode();
        }

        public String toString() {
            return "SetupStudyConfig(studyConfig=" + this.studyConfig + ")";
        }
    }

    /* JADX INFO: renamed from: oy2.l$x */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loy2/l$x;", "Loy2/l;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x extends AbstractC28486l {

        /* JADX INFO: renamed from: a */
        public static final x f115354a = new x();

        private x() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oy2.l$y */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loy2/l$y;", "Loy2/l;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y extends AbstractC28486l {

        /* JADX INFO: renamed from: a */
        public static final y f115355a = new y();

        private y() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oy2.l$z */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loy2/l$z;", "Loy2/l;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z extends AbstractC28486l {

        /* JADX INFO: renamed from: a */
        public static final z f115356a = new z();

        private z() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC28486l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC28486l() {
    }
}
