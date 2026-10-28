package mw0;

import com.whoop.core.details.network.model.sleep.KeyMetricBodyModalDomain;
import com.whoop.design.util.TextResource;
import hy0.EnumC17727b2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: mw0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lmw0/d;", "", "<init>", "()V", "f", "a", "i", "g", "b", "e", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "d", "Lmw0/d$a;", "Lmw0/d$b;", "Lmw0/d$c;", "Lmw0/d$d;", "Lmw0/d$e;", "Lmw0/d$f;", "Lmw0/d$g;", "Lmw0/d$h;", "Lmw0/d$i;", "Lmw0/d$j;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25976d {

    /* JADX INFO: renamed from: mw0.d$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lmw0/d$a;", "Lmw0/d;", "", "sleepIdV2", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC25976d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String sleepIdV2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String sleepIdV2) {
            super(null);
            AbstractC22676k.m65750j(sleepIdV2, "sleepIdV2");
            this.sleepIdV2 = sleepIdV2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSleepIdV2() {
            return this.sleepIdV2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.sleepIdV2, ((a) other).sleepIdV2);
        }

        public int hashCode() {
            return this.sleepIdV2.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DeleteSleep(sleepIdV2=", this.sleepIdV2, ")");
        }
    }

    /* JADX INFO: renamed from: mw0.d$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lmw0/d$b;", "Lmw0/d;", "Lcom/whoop/design/util/TextResource;", "errorTitle", "message", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC25976d {

        /* JADX INFO: renamed from: c */
        public static final int f102569c = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource errorTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextResource errorTitle, TextResource message) {
            super(null);
            AbstractC22676k.m65750j(errorTitle, "errorTitle");
            AbstractC22676k.m65750j(message, "message");
            this.errorTitle = errorTitle;
            this.message = message;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getErrorTitle() {
            return this.errorTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.errorTitle, bVar.errorTitle) && AbstractC22676k.m65745e(this.message, bVar.message);
        }

        public int hashCode() {
            return this.message.hashCode() + (this.errorTitle.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79501e("FailedDelete(errorTitle=", this.errorTitle, ", message=", this.message, ")");
        }
    }

    /* JADX INFO: renamed from: mw0.d$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lmw0/d$c;", "Lmw0/d;", "Lcom/whoop/design/util/TextResource;", "errorTitle", "message", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC25976d {

        /* JADX INFO: renamed from: c */
        public static final int f102572c = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource errorTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextResource errorTitle, TextResource message) {
            super(null);
            AbstractC22676k.m65750j(errorTitle, "errorTitle");
            AbstractC22676k.m65750j(message, "message");
            this.errorTitle = errorTitle;
            this.message = message;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getErrorTitle() {
            return this.errorTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.errorTitle, cVar.errorTitle) && AbstractC22676k.m65745e(this.message, cVar.message);
        }

        public int hashCode() {
            return this.message.hashCode() + (this.errorTitle.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79501e("FailedNapToSleep(errorTitle=", this.errorTitle, ", message=", this.message, ")");
        }
    }

    /* JADX INFO: renamed from: mw0.d$d */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, m65681d2 = {"Lmw0/d$d;", "Lmw0/d;", "Lcom/whoop/core/details/network/model/sleep/KeyMetricBodyModalDomain;", "body", "", "icon", "Lcom/whoop/design/util/TextResource;", "trendSubTitle", "trendTitle", "Lhy0/b2;", "trendType", "<init>", "(Lcom/whoop/core/details/network/model/sleep/KeyMetricBodyModalDomain;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/core/details/network/model/sleep/KeyMetricBodyModalDomain;", "()Lcom/whoop/core/details/network/model/sleep/KeyMetricBodyModalDomain;", "b", "I", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "e", "Lhy0/b2;", "()Lhy0/b2;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC25976d {

        /* JADX INFO: renamed from: f */
        public static final int f102575f = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final KeyMetricBodyModalDomain body;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource trendSubTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource trendTitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC17727b2 trendType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(KeyMetricBodyModalDomain body, int i13, TextResource trendSubTitle, TextResource trendTitle, EnumC17727b2 trendType) {
            super(null);
            AbstractC22676k.m65750j(body, "body");
            AbstractC22676k.m65750j(trendSubTitle, "trendSubTitle");
            AbstractC22676k.m65750j(trendTitle, "trendTitle");
            AbstractC22676k.m65750j(trendType, "trendType");
            this.body = body;
            this.icon = i13;
            this.trendSubTitle = trendSubTitle;
            this.trendTitle = trendTitle;
            this.trendType = trendType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final KeyMetricBodyModalDomain getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getTrendSubTitle() {
            return this.trendSubTitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getTrendTitle() {
            return this.trendTitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC17727b2 getTrendType() {
            return this.trendType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.body, dVar.body) && this.icon == dVar.icon && AbstractC22676k.m65745e(this.trendSubTitle, dVar.trendSubTitle) && AbstractC22676k.m65745e(this.trendTitle, dVar.trendTitle) && this.trendType == dVar.trendType;
        }

        public int hashCode() {
            return this.trendType.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.icon, this.body.hashCode() * 31, 31), this.trendSubTitle, 31), this.trendTitle, 31);
        }

        public String toString() {
            KeyMetricBodyModalDomain keyMetricBodyModalDomain = this.body;
            int i13 = this.icon;
            TextResource textResource = this.trendSubTitle;
            TextResource textResource2 = this.trendTitle;
            EnumC17727b2 enumC17727b2 = this.trendType;
            StringBuilder sb4 = new StringBuilder("KeyMetricTile(body=");
            sb4.append(keyMetricBodyModalDomain);
            sb4.append(", icon=");
            sb4.append(i13);
            sb4.append(", trendSubTitle=");
            AbstractC30007c.m91855y(sb4, textResource, ", trendTitle=", textResource2, ", trendType=");
            sb4.append(enumC17727b2);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: mw0.d$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lmw0/d$e;", "Lmw0/d;", "", "sleepIdV2", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC25976d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String sleepIdV2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String sleepIdV2) {
            super(null);
            AbstractC22676k.m65750j(sleepIdV2, "sleepIdV2");
            this.sleepIdV2 = sleepIdV2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSleepIdV2() {
            return this.sleepIdV2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.sleepIdV2, ((e) other).sleepIdV2);
        }

        public int hashCode() {
            return this.sleepIdV2.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("NapToSleep(sleepIdV2=", this.sleepIdV2, ")");
        }
    }

    /* JADX INFO: renamed from: mw0.d$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmw0/d$f;", "Lmw0/d;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC25976d {

        /* JADX INFO: renamed from: a */
        public static final f f102582a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: mw0.d$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmw0/d$g;", "Lmw0/d;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC25976d {

        /* JADX INFO: renamed from: a */
        public static final g f102583a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: mw0.d$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmw0/d$h;", "Lmw0/d;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC25976d {

        /* JADX INFO: renamed from: a */
        public static final h f102584a = new h();

        private h() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: mw0.d$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmw0/d$i;", "Lmw0/d;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC25976d {

        /* JADX INFO: renamed from: a */
        public static final i f102585a = new i();

        private i() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: mw0.d$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmw0/d$j;", "Lmw0/d;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC25976d {

        /* JADX INFO: renamed from: a */
        public static final j f102586a = new j();

        private j() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC25976d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC25976d() {
    }
}
