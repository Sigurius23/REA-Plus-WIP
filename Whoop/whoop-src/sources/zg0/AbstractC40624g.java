package zg0;

import android.net.Uri;
import c13.AbstractC3855a;
import c91.AbstractC4328b;
import com.whoop.p057ai.chat.models.TurnFeedback;
import fl0.C14567l;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import m83.C25271y;
import m83.C25272z;
import nh3.AbstractC26725a;
import nl0.EnumC26800b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: zg0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0017\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0017\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01¨\u00062"}, m65681d2 = {"Lzg0/g;", "", "<init>", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "q", "d", "r", "g", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "v", "m", "l", "s", "a", "o", "n", "c", "f", "t", "u", "j", "i", "k", "p", "Lzg0/g$a;", "Lzg0/g$b;", "Lzg0/g$c;", "Lzg0/g$d;", "Lzg0/g$e;", "Lzg0/g$f;", "Lzg0/g$g;", "Lzg0/g$h;", "Lzg0/g$i;", "Lzg0/g$j;", "Lzg0/g$k;", "Lzg0/g$l;", "Lzg0/g$m;", "Lzg0/g$n;", "Lzg0/g$o;", "Lzg0/g$p;", "Lzg0/g$q;", "Lzg0/g$r;", "Lzg0/g$s;", "Lzg0/g$t;", "Lzg0/g$u;", "Lzg0/g$v;", "Lzg0/g$w;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40624g {

    /* JADX INFO: renamed from: zg0.g$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lzg0/g$c;", "Lzg0/g;", "", "turnId", "actionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String turnId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String actionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String turnId, String actionId) {
            super(null);
            AbstractC22676k.m65750j(turnId, "turnId");
            AbstractC22676k.m65750j(actionId, "actionId");
            this.turnId = turnId;
            this.actionId = actionId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActionId() {
            return this.actionId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.turnId, cVar.turnId) && AbstractC22676k.m65745e(this.actionId, cVar.actionId);
        }

        public int hashCode() {
            return this.actionId.hashCode() + (this.turnId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("CreateMxmSupportTicket(turnId=", this.turnId, ", actionId=", this.actionId, ")");
        }
    }

    /* JADX INFO: renamed from: zg0.g$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lzg0/g$e;", "Lzg0/g;", "", "fingerprint", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String fingerprint) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.fingerprint, ((e) other).fingerprint);
        }

        public int hashCode() {
            return this.fingerprint.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DeleteConversation(fingerprint=", this.fingerprint, ")");
        }
    }

    /* JADX INFO: renamed from: zg0.g$f */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lzg0/g$f;", "Lzg0/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC40624g {

        /* JADX INFO: renamed from: a */
        public static final f f175108a = new f();

        private f() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return -2109057442;
        }

        public String toString() {
            return "DrawerClosed";
        }
    }

    /* JADX INFO: renamed from: zg0.g$g */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lzg0/g$g;", "Lzg0/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC40624g {

        /* JADX INFO: renamed from: a */
        public static final g f175109a = new g();

        private g() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof g);
        }

        public int hashCode() {
            return 1497766171;
        }

        public String toString() {
            return "FetchHistory";
        }
    }

    /* JADX INFO: renamed from: zg0.g$h */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lzg0/g$h;", "Lzg0/g;", "", "turnId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String turnId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String turnId) {
            super(null);
            AbstractC22676k.m65750j(turnId, "turnId");
            this.turnId = turnId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.turnId, ((h) other).turnId);
        }

        public int hashCode() {
            return this.turnId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("GetConversationTurn(turnId=", this.turnId, ")");
        }
    }

    /* JADX INFO: renamed from: zg0.g$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lzg0/g$i;", "Lzg0/g;", "", "fingerprint", "turnId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String turnId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String fingerprint, String turnId) {
            super(null);
            AbstractC22676k.m65750j(fingerprint, "fingerprint");
            AbstractC22676k.m65750j(turnId, "turnId");
            this.fingerprint = fingerprint;
            this.turnId = turnId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.fingerprint, iVar.fingerprint) && AbstractC22676k.m65745e(this.turnId, iVar.turnId);
        }

        public int hashCode() {
            return this.turnId.hashCode() + (this.fingerprint.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("LastViewedTurn(fingerprint=", this.fingerprint, ", turnId=", this.turnId, ")");
        }
    }

    /* JADX INFO: renamed from: zg0.g$j */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lzg0/g$j;", "Lzg0/g;", "", "isVisible", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isVisible;

        public j(boolean z4) {
            super(null);
            this.isVisible = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && this.isVisible == ((j) other).isVisible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVisible);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ReadingVisibilityChanged(isVisible=", ")", this.isVisible);
        }
    }

    /* JADX INFO: renamed from: zg0.g$k */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lzg0/g$k;", "Lzg0/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC40624g {

        /* JADX INFO: renamed from: a */
        public static final k f175114a = new k();

        private k() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof k);
        }

        public int hashCode() {
            return -2145118836;
        }

        public String toString() {
            return "RefreshConversationMetadata";
        }
    }

    /* JADX INFO: renamed from: zg0.g$l */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lzg0/g$l;", "Lzg0/g;", "", "fileId", "Landroid/net/Uri;", "fileUri", "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/net/Uri;", "()Landroid/net/Uri;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fileId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Uri fileUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, Uri fileUri) {
            super(null);
            AbstractC22676k.m65750j(fileUri, "fileUri");
            this.fileId = str;
            this.fileUri = fileUri;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFileId() {
            return this.fileId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Uri getFileUri() {
            return this.fileUri;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.fileId, lVar.fileId) && AbstractC22676k.m65745e(this.fileUri, lVar.fileUri);
        }

        public int hashCode() {
            String str = this.fileId;
            return this.fileUri.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "RemoveFile(fileId=" + this.fileId + ", fileUri=" + this.fileUri + ")";
        }
    }

    /* JADX INFO: renamed from: zg0.g$m */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lzg0/g$m;", "Lzg0/g;", "", "fileId", "Landroid/net/Uri;", "uri", "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/net/Uri;", "()Landroid/net/Uri;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fileId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Uri uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, Uri uri) {
            super(null);
            AbstractC22676k.m65750j(uri, "uri");
            this.fileId = str;
            this.uri = uri;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFileId() {
            return this.fileId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return AbstractC22676k.m65745e(this.fileId, mVar.fileId) && AbstractC22676k.m65745e(this.uri, mVar.uri);
        }

        public int hashCode() {
            String str = this.fileId;
            return this.uri.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "RemoveImage(fileId=" + this.fileId + ", uri=" + this.uri + ")";
        }
    }

    /* JADX INFO: renamed from: zg0.g$n */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lzg0/g$n;", "Lzg0/g;", "Lfl0/l;", "analyticsData", "<init>", "(Lfl0/l;)V", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfl0/l;", "()Lfl0/l;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C14567l analyticsData;

        public n(C14567l c14567l) {
            super(null);
            this.analyticsData = c14567l;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C14567l getAnalyticsData() {
            return this.analyticsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && AbstractC22676k.m65745e(this.analyticsData, ((n) other).analyticsData);
        }

        public int hashCode() {
            C14567l c14567l = this.analyticsData;
            if (c14567l == null) {
                return 0;
            }
            return c14567l.hashCode();
        }

        public String toString() {
            return "Retry(analyticsData=" + this.analyticsData + ")";
        }

        public n() {
            this(null);
        }
    }

    /* JADX INFO: renamed from: zg0.g$o */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lzg0/g$o;", "Lzg0/g;", "", "content", "", "index", "messageCount", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int messageCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String content, int i13, int i14) {
            super(null);
            AbstractC22676k.m65750j(content, "content");
            this.content = content;
            this.index = i13;
            this.messageCount = i14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMessageCount() {
            return this.messageCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof o)) {
                return false;
            }
            o oVar = (o) other;
            return AbstractC22676k.m65745e(this.content, oVar.content) && this.index == oVar.index && this.messageCount == oVar.messageCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageCount) + AbstractC11266d.m30448b(this.index, this.content.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.content;
            int i13 = this.index;
            return AbstractC18489d0.m53371l(AbstractC11266d.m30467u(i13, "SendQuestionSuggestion(content=", str, ", index=", ", messageCount="), this.messageCount, ")");
        }
    }

    /* JADX INFO: renamed from: zg0.g$p */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzg0/g$p;", "Lzg0/g;", "Lc91/b;", "error", "<init>", "(Lc91/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc91/b;", "()Lc91/b;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC40624g {

        /* JADX INFO: renamed from: b */
        public static final int f175123b = AbstractC4328b.f17583a;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC4328b error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(AbstractC4328b error) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            this.error = error;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC4328b getError() {
            return this.error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof p) && AbstractC22676k.m65745e(this.error, ((p) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "ShowSubmitError(error=" + this.error + ")";
        }
    }

    /* JADX INFO: renamed from: zg0.g$q */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lzg0/g$q;", "Lzg0/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q extends AbstractC40624g {

        /* JADX INFO: renamed from: a */
        public static final q f175125a = new q();

        private q() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof q);
        }

        public int hashCode() {
            return 644637986;
        }

        public String toString() {
            return "StartNewConversation";
        }
    }

    /* JADX INFO: renamed from: zg0.g$r */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lzg0/g$r;", "Lzg0/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r extends AbstractC40624g {

        /* JADX INFO: renamed from: a */
        public static final r f175126a = new r();

        private r() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof r);
        }

        public int hashCode() {
            return 2046848192;
        }

        public String toString() {
            return "StopTurn";
        }
    }

    /* JADX INFO: renamed from: zg0.g$s */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lzg0/g$s;", "Lzg0/g;", "Lcom/whoop/ai/chat/models/TurnFeedback;", "turnFeedback", "", "showToast", "<init>", "(Lcom/whoop/ai/chat/models/TurnFeedback;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/ai/chat/models/TurnFeedback;", "b", "()Lcom/whoop/ai/chat/models/TurnFeedback;", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TurnFeedback turnFeedback;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean showToast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(TurnFeedback turnFeedback, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(turnFeedback, "turnFeedback");
            this.turnFeedback = turnFeedback;
            this.showToast = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getShowToast() {
            return this.showToast;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TurnFeedback getTurnFeedback() {
            return this.turnFeedback;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof s)) {
                return false;
            }
            s sVar = (s) other;
            return AbstractC22676k.m65745e(this.turnFeedback, sVar.turnFeedback) && this.showToast == sVar.showToast;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showToast) + (this.turnFeedback.hashCode() * 31);
        }

        public String toString() {
            return "SubmitTurnFeedback(turnFeedback=" + this.turnFeedback + ", showToast=" + this.showToast + ")";
        }

        public /* synthetic */ s(TurnFeedback turnFeedback, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(turnFeedback, (i13 & 2) != 0 ? true : z4);
        }
    }

    /* JADX INFO: renamed from: zg0.g$t */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lzg0/g$t;", "Lzg0/g;", "", "turnId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String turnId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String turnId) {
            super(null);
            AbstractC22676k.m65750j(turnId, "turnId");
            this.turnId = turnId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof t) && AbstractC22676k.m65745e(this.turnId, ((t) other).turnId);
        }

        public int hashCode() {
            return this.turnId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TurnEndViewed(turnId=", this.turnId, ")");
        }
    }

    /* JADX INFO: renamed from: zg0.g$u */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lzg0/g$u;", "Lzg0/g;", "", "turnId", "", "isVisible", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String turnId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String turnId, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(turnId, "turnId");
            this.turnId = turnId;
            this.isVisible = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof u)) {
                return false;
            }
            u uVar = (u) other;
            return AbstractC22676k.m65745e(this.turnId, uVar.turnId) && this.isVisible == uVar.isVisible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVisible) + (this.turnId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("TurnEndVisibilityChanged(turnId=", this.turnId, ", isVisible=", ")", this.isVisible);
        }
    }

    public /* synthetic */ AbstractC40624g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC40624g() {
    }

    /* JADX INFO: renamed from: zg0.g$v */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lzg0/g$v;", "Lzg0/g;", "", "Landroid/net/Uri;", "fileUris", "", "displayNames", "", "fileSizesBytes", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class v extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<Uri> fileUris;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<String> displayNames;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<Long> fileSizesBytes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public v(List<? extends Uri> fileUris, List<String> displayNames, List<Long> fileSizesBytes) {
            super(null);
            AbstractC22676k.m65750j(fileUris, "fileUris");
            AbstractC22676k.m65750j(displayNames, "displayNames");
            AbstractC22676k.m65750j(fileSizesBytes, "fileSizesBytes");
            this.fileUris = fileUris;
            this.displayNames = displayNames;
            this.fileSizesBytes = fileSizesBytes;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m131804a() {
            return this.displayNames;
        }

        /* JADX INFO: renamed from: b */
        public final List<Long> m131805b() {
            return this.fileSizesBytes;
        }

        /* JADX INFO: renamed from: c */
        public final List<Uri> m131806c() {
            return this.fileUris;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof v)) {
                return false;
            }
            v vVar = (v) other;
            return AbstractC22676k.m65745e(this.fileUris, vVar.fileUris) && AbstractC22676k.m65745e(this.displayNames, vVar.displayNames) && AbstractC22676k.m65745e(this.fileSizesBytes, vVar.fileSizesBytes);
        }

        public int hashCode() {
            return this.fileSizesBytes.hashCode() + AbstractC11895b.m31983b(this.fileUris.hashCode() * 31, 31, this.displayNames);
        }

        public String toString() {
            List<Uri> list = this.fileUris;
            List<String> list2 = this.displayNames;
            return AbstractC3855a.m11829m(AbstractC38963t7.m124380j("UploadFiles(fileUris=", ", displayNames=", list, ", fileSizesBytes=", list2), this.fileSizesBytes, ")");
        }

        public /* synthetic */ v(List list, List list2, List list3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, list2, (i13 & 4) != 0 ? C25271y.f99162w : list3);
        }
    }

    /* JADX INFO: renamed from: zg0.g$w */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001b"}, m65681d2 = {"Lzg0/g$w;", "Lzg0/g;", "", "Landroid/net/Uri;", "imageUris", "", "method", "", "fileSizesBytes", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class w extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<Uri> imageUris;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String method;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<Long> fileSizesBytes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public w(List<? extends Uri> imageUris, String str, List<Long> fileSizesBytes) {
            super(null);
            AbstractC22676k.m65750j(imageUris, "imageUris");
            AbstractC22676k.m65750j(fileSizesBytes, "fileSizesBytes");
            this.imageUris = imageUris;
            this.method = str;
            this.fileSizesBytes = fileSizesBytes;
        }

        /* JADX INFO: renamed from: a */
        public final List<Long> m131807a() {
            return this.fileSizesBytes;
        }

        /* JADX INFO: renamed from: b */
        public final List<Uri> m131808b() {
            return this.imageUris;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof w)) {
                return false;
            }
            w wVar = (w) other;
            return AbstractC22676k.m65745e(this.imageUris, wVar.imageUris) && AbstractC22676k.m65745e(this.method, wVar.method) && AbstractC22676k.m65745e(this.fileSizesBytes, wVar.fileSizesBytes);
        }

        public int hashCode() {
            int iHashCode = this.imageUris.hashCode() * 31;
            String str = this.method;
            return this.fileSizesBytes.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            List<Uri> list = this.imageUris;
            String str = this.method;
            return AbstractC3855a.m11829m(AbstractC26725a.m79507k("UploadImages(imageUris=", ", method=", str, ", fileSizesBytes=", list), this.fileSizesBytes, ")");
        }

        public /* synthetic */ w(List list, String str, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? C25271y.f99162w : list2);
        }
    }

    /* JADX INFO: renamed from: zg0.g$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lzg0/g$a;", "Lzg0/g;", "", "recommendationId", "", "committed", "replacementId", "activityTitle", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "d", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String recommendationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean committed;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String replacementId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String activityTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String recommendationId, boolean z4, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(recommendationId, "recommendationId");
            this.recommendationId = recommendationId;
            this.committed = z4;
            this.replacementId = str;
            this.activityTitle = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityTitle() {
            return this.activityTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getCommitted() {
            return this.committed;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRecommendationId() {
            return this.recommendationId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getReplacementId() {
            return this.replacementId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.recommendationId, aVar.recommendationId) && this.committed == aVar.committed && AbstractC22676k.m65745e(this.replacementId, aVar.replacementId) && AbstractC22676k.m65745e(this.activityTitle, aVar.activityTitle);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.recommendationId.hashCode() * 31, 31, this.committed);
            String str = this.replacementId;
            int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.activityTitle;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.recommendationId;
            boolean z4 = this.committed;
            return AbstractC11266d.m30464r(AbstractC25012a.m73379l("CommitRecommendation(recommendationId=", str, ", committed=", ", replacementId=", z4), this.replacementId, ", activityTitle=", this.activityTitle, ")");
        }

        public /* synthetic */ a(String str, boolean z4, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z4, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3);
        }
    }

    /* JADX INFO: renamed from: zg0.g$d */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\t\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b#\u0010\"¨\u0006'"}, m65681d2 = {"Lzg0/g$d;", "Lzg0/g;", "", "content", "Lnl0/b;", "role", "", "fileIds", "", "isStreaming", "", "userTimestamp", "isSuggestion", "<init>", "(Ljava/lang/String;Lnl0/b;Ljava/util/List;ZJZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lnl0/b;", "c", "()Lnl0/b;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Z", "()Z", "e", "J", "()J", "f", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC26800b role;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<String> fileIds;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isStreaming;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final long userTimestamp;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isSuggestion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, EnumC26800b role, List<String> list, boolean z4, long j7, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(role, "role");
            this.content = str;
            this.role = role;
            this.fileIds = list;
            this.isStreaming = z4;
            this.userTimestamp = j7;
            this.isSuggestion = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: b */
        public final List<String> m131781b() {
            return this.fileIds;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC26800b getRole() {
            return this.role;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getUserTimestamp() {
            return this.userTimestamp;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsSuggestion() {
            return this.isSuggestion;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.content, dVar.content) && this.role == dVar.role && AbstractC22676k.m65745e(this.fileIds, dVar.fileIds) && this.isStreaming == dVar.isStreaming && this.userTimestamp == dVar.userTimestamp && this.isSuggestion == dVar.isSuggestion;
        }

        public int hashCode() {
            String str = this.content;
            int iHashCode = (this.role.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            List<String> list = this.fileIds;
            return Boolean.hashCode(this.isSuggestion) + AbstractC11266d.m30451e(AbstractC2875y.m8289b((iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.isStreaming), this.userTimestamp, 31);
        }

        public String toString() {
            String str = this.content;
            EnumC26800b enumC26800b = this.role;
            List<String> list = this.fileIds;
            boolean z4 = this.isStreaming;
            long j7 = this.userTimestamp;
            boolean z13 = this.isSuggestion;
            StringBuilder sb4 = new StringBuilder("CreateTurn(content=");
            sb4.append(str);
            sb4.append(", role=");
            sb4.append(enumC26800b);
            sb4.append(", fileIds=");
            AbstractC26725a.m79512p(", isStreaming=", ", userTimestamp=", sb4, list, z4);
            sb4.append(j7);
            sb4.append(", isSuggestion=");
            sb4.append(z13);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ d(String str, EnumC26800b enumC26800b, List list, boolean z4, long j7, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, enumC26800b, (i13 & 4) != 0 ? null : list, (i13 & 8) != 0 ? false : z4, j7, (i13 & 32) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: zg0.g$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b!\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0014R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b+\u0010)¨\u0006,"}, m65681d2 = {"Lzg0/g$b;", "Lzg0/g;", "", "fingerprint", "source", "sourceId", "initialMessage", "presetQuestionKey", "", "Lkotlinx/serialization/json/JsonElement;", "args", "", "isWcePrefetch", "isPastConversation", "initialUserTurnContent", "entrypointExperience", "isDay0", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZZLjava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "e", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "Z", "k", "()Z", "j", "i", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC40624g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String sourceId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String initialMessage;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String presetQuestionKey;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Map<String, JsonElement> args;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean isWcePrefetch;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean isPastConversation;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String initialUserTurnContent;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String entrypointExperience;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final boolean isDay0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, String source, String str2, String str3, String str4, Map<String, ? extends JsonElement> args, boolean z4, boolean z13, String str5, String str6, boolean z14) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(args, "args");
            this.fingerprint = str;
            this.source = source;
            this.sourceId = str2;
            this.initialMessage = str3;
            this.presetQuestionKey = str4;
            this.args = args;
            this.isWcePrefetch = z4;
            this.isPastConversation = z13;
            this.initialUserTurnContent = str5;
            this.entrypointExperience = str6;
            this.isDay0 = z14;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, JsonElement> m131767a() {
            return this.args;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEntrypointExperience() {
            return this.entrypointExperience;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getInitialMessage() {
            return this.initialMessage;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getInitialUserTurnContent() {
            return this.initialUserTurnContent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.fingerprint, bVar.fingerprint) && AbstractC22676k.m65745e(this.source, bVar.source) && AbstractC22676k.m65745e(this.sourceId, bVar.sourceId) && AbstractC22676k.m65745e(this.initialMessage, bVar.initialMessage) && AbstractC22676k.m65745e(this.presetQuestionKey, bVar.presetQuestionKey) && AbstractC22676k.m65745e(this.args, bVar.args) && this.isWcePrefetch == bVar.isWcePrefetch && this.isPastConversation == bVar.isPastConversation && AbstractC22676k.m65745e(this.initialUserTurnContent, bVar.initialUserTurnContent) && AbstractC22676k.m65745e(this.entrypointExperience, bVar.entrypointExperience) && this.isDay0 == bVar.isDay0;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPresetQuestionKey() {
            return this.presetQuestionKey;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        public int hashCode() {
            String str = this.fingerprint;
            int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.source);
            String str2 = this.sourceId;
            int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.initialMessage;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.presetQuestionKey;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.args, (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31, this.isWcePrefetch), 31, this.isPastConversation);
            String str5 = this.initialUserTurnContent;
            int iHashCode3 = (iM8289b + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.entrypointExperience;
            return Boolean.hashCode(this.isDay0) + ((iHashCode3 + (str6 != null ? str6.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsDay0() {
            return this.isDay0;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsPastConversation() {
            return this.isPastConversation;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsWcePrefetch() {
            return this.isWcePrefetch;
        }

        public String toString() {
            String str = this.fingerprint;
            String str2 = this.source;
            String str3 = this.sourceId;
            String str4 = this.initialMessage;
            String str5 = this.presetQuestionKey;
            Map<String, JsonElement> map = this.args;
            boolean z4 = this.isWcePrefetch;
            boolean z13 = this.isPastConversation;
            String str6 = this.initialUserTurnContent;
            String str7 = this.entrypointExperience;
            boolean z14 = this.isDay0;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("CreateConversation(fingerprint=", str, ", source=", str2, ", sourceId=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", initialMessage=", str4, ", presetQuestionKey=");
            AbstractC36095b.m114695w(sbM32001t, str5, ", args=", map, ", isWcePrefetch=");
            AbstractC38963t7.m124392v(sbM32001t, z4, ", isPastConversation=", z13, ", initialUserTurnContent=");
            AbstractC11266d.m30444B(sbM32001t, str6, ", entrypointExperience=", str7, ", isDay0=");
            return AbstractC18489d0.m53372m(sbM32001t, z14, ")");
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, Map map, boolean z4, boolean z13, String str6, String str7, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i13 & 4) != 0 ? null : str3, str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? C25272z.f99163w : map, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? false : z13, (i13 & 256) != 0 ? null : str6, (i13 & 512) != 0 ? null : str7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z14);
        }
    }
}
