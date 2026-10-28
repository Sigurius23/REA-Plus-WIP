package oy2;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.navigation.C9598e;
import com.whoop.whooplabs.data.domain.OptionSelection;
import com.whoop.whooplabs.data.domain.SurveyProvider;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepConfigResponse;
import com.whoop.whooplabs.data.room.entity.ProtocolStepResult;
import d13.AbstractC11478a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.List;
import jh3.AbstractC21702c;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;
import yw2.C39830b;

/* JADX INFO: renamed from: oy2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0014\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\b\"\u000f\u000b#\u0005\u0016$%\u0013J\u001b\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\t*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0001\u000b\u0002&'()*+,-./¨\u00060À\u0006\u0003"}, m65681d2 = {"Loy2/b;", "", "Loy2/b$f;", "", "isAddNoteShowing", "e", "(Loy2/b$f;Z)Loy2/b$f;", "isCancelStudyShowing", "f", "Loy2/g;", "cancelStudyState", "c", "(Loy2/b$f;Loy2/g;)Loy2/b$f;", "Loy2/p;", "timerState", "g", "(Loy2/b$f;Loy2/p;)Loy2/b$f;", "Loy2/b$a;", "isDeviceConnecting", "b", "(Loy2/b$a;Z)Loy2/b$a;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "d", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)Loy2/g;", "q", "m", "t", "k", "l", "n", "o", "p", "r", "s", "i", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "j", "Loy2/b$k;", "Loy2/b$l;", "Loy2/b$m;", "Loy2/b$n;", "Loy2/b$o;", "Loy2/b$p;", "Loy2/b$q;", "Loy2/b$r;", "Loy2/b$s;", "Loy2/b$t;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC28476b {

    /* JADX INFO: renamed from: oy2.b$f */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\t\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Loy2/b$f;", "Loy2/b;", "", "a", "()Z", "isCancelStudyShowing", "Loy2/b$a;", "Loy2/b$b;", "Loy2/b$c;", "Loy2/b$d;", "Loy2/b$e;", "Loy2/b$g;", "Loy2/b$h;", "Loy2/b$i;", "Loy2/b$j;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface f extends InterfaceC28476b {
        /* JADX INFO: renamed from: a */
        boolean getIsCancelStudyShowing();
    }

    /* JADX INFO: renamed from: oy2.b$k */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, m65681d2 = {"Loy2/b$k;", "Loy2/b;", "", "campaignId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements InterfaceC28476b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        public k(int i13) {
            this.campaignId = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && this.campaignId == ((k) other).campaignId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        public int hashCode() {
            return Integer.hashCode(this.campaignId);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.campaignId, "Discarded(campaignId=", ")");
        }
    }

    /* JADX INFO: renamed from: oy2.b$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loy2/b$l;", "Loy2/b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC28476b {

        /* JADX INFO: renamed from: a */
        public static final l f114983a = new l();

        private l() {
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: e */
        public /* bridge */ f mo86416e(f fVar, boolean z4) {
            return super.mo86416e(fVar, z4);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: f */
        public /* bridge */ f mo86417f(f fVar, boolean z4) {
            return super.mo86417f(fVar, z4);
        }
    }

    /* JADX INFO: renamed from: oy2.b$n */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\r¨\u0006#"}, m65681d2 = {"Loy2/b$n;", "Loy2/b;", "", "campaignId", "", "deviceAddress", "title", "body", "positiveCta", "negativeCta", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "i", "b", "Ljava/lang/String;", "j", "c", "m", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "l", "f", "k", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n implements InterfaceC28476b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String deviceAddress;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String body;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String positiveCta;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String negativeCta;

        public n(int i13, String deviceAddress, String str, String str2, String str3, String str4) {
            AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
            this.campaignId = i13;
            this.deviceAddress = deviceAddress;
            this.title = str;
            this.body = str2;
            this.positiveCta = str3;
            this.negativeCta = str4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n)) {
                return false;
            }
            n nVar = (n) other;
            return this.campaignId == nVar.campaignId && AbstractC22676k.m65745e(this.deviceAddress, nVar.deviceAddress) && AbstractC22676k.m65745e(this.title, nVar.title) && AbstractC22676k.m65745e(this.body, nVar.body) && AbstractC22676k.m65745e(this.positiveCta, nVar.positiveCta) && AbstractC22676k.m65745e(this.negativeCta, nVar.negativeCta);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(Integer.hashCode(this.campaignId) * 31, 31, this.deviceAddress);
            String str = this.title;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.body;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.positiveCta;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.negativeCta;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getDeviceAddress() {
            return this.deviceAddress;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getNegativeCta() {
            return this.negativeCta;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getPositiveCta() {
            return this.positiveCta;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public String toString() {
            int i13 = this.campaignId;
            String str = this.deviceAddress;
            String str2 = this.title;
            String str3 = this.body;
            String str4 = this.positiveCta;
            String str5 = this.negativeCta;
            StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "ErrorConnectingDevice(campaignId=", ", deviceAddress=", str, ", title=");
            AbstractC11266d.m30444B(sbM53373n, str2, ", body=", str3, ", positiveCta=");
            return AbstractC11266d.m30464r(sbM53373n, str4, ", negativeCta=", str5, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.b$o */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\n¨\u0006\u001c"}, m65681d2 = {"Loy2/b$o;", "Loy2/b;", "", "title", "body", "positiveCta", "negativeCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "k", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "j", "d", "i", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o implements InterfaceC28476b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String body;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String positiveCta;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String negativeCta;

        public o(String title, String body, String positiveCta, String negativeCta) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(body, "body");
            AbstractC22676k.m65750j(positiveCta, "positiveCta");
            AbstractC22676k.m65750j(negativeCta, "negativeCta");
            this.title = title;
            this.body = body;
            this.positiveCta = positiveCta;
            this.negativeCta = negativeCta;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof o)) {
                return false;
            }
            o oVar = (o) other;
            return AbstractC22676k.m65745e(this.title, oVar.title) && AbstractC22676k.m65745e(this.body, oVar.body) && AbstractC22676k.m65745e(this.positiveCta, oVar.positiveCta) && AbstractC22676k.m65745e(this.negativeCta, oVar.negativeCta);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        public int hashCode() {
            return this.negativeCta.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.body), 31, this.positiveCta);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getNegativeCta() {
            return this.negativeCta;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getPositiveCta() {
            return this.positiveCta;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public String toString() {
            String str = this.title;
            String str2 = this.body;
            return AbstractC11266d.m30464r(AbstractC11895b.m32001t("ErrorSubmitting(title=", str, ", body=", str2, ", positiveCta="), this.positiveCta, ", negativeCta=", this.negativeCta, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.b$p */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\f¨\u0006\u0019"}, m65681d2 = {"Loy2/b$p;", "Loy2/b;", "", "title", "description", "primaryActionText", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "j", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "i", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p implements InterfaceC28476b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int primaryActionText;

        public p(int i13, int i14, int i15) {
            this.title = i13;
            this.description = i14;
            this.primaryActionText = i15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return this.title == pVar.title && this.description == pVar.description && this.primaryActionText == pVar.primaryActionText;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getDescription() {
            return this.description;
        }

        public int hashCode() {
            return Integer.hashCode(this.primaryActionText) + AbstractC11266d.m30448b(this.description, Integer.hashCode(this.title) * 31, 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getPrimaryActionText() {
            return this.primaryActionText;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getTitle() {
            return this.title;
        }

        public String toString() {
            int i13 = this.title;
            int i14 = this.description;
            return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(i13, i14, "FWUpdateInProgress(title=", ", description=", ", primaryActionText="), this.primaryActionText, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.b$q */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loy2/b$q;", "Loy2/b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements InterfaceC28476b {

        /* JADX INFO: renamed from: a */
        public static final q f115003a = new q();

        private q() {
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: b */
        public /* bridge */ a mo86413b(a aVar, boolean z4) {
            return super.mo86413b(aVar, z4);
        }
    }

    /* JADX INFO: renamed from: oy2.b$r */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m65681d2 = {"Loy2/b$r;", "Loy2/b;", "", "text", "subtext", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r implements InterfaceC28476b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String text;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String subtext;

        public r(String text, String subtext) {
            AbstractC22676k.m65750j(text, "text");
            AbstractC22676k.m65750j(subtext, "subtext");
            this.text = text;
            this.subtext = subtext;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof r)) {
                return false;
            }
            r rVar = (r) other;
            return AbstractC22676k.m65745e(this.text, rVar.text) && AbstractC22676k.m65745e(this.subtext, rVar.subtext);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSubtext() {
            return this.subtext;
        }

        public int hashCode() {
            return this.subtext.hashCode() + (this.text.hashCode() * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public String toString() {
            return AbstractC2875y.m8300m("Submitted(text=", this.text, ", subtext=", this.subtext, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.b$s */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Loy2/b$s;", "Loy2/b;", "", "campaignId", "", "icon", "text", "backgroundUrl", "cta", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "i", "b", "Ljava/lang/String;", "k", "c", "m", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "j", "f", "Lcom/whoop/navigation/e;", "l", "()Lcom/whoop/navigation/e;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s implements InterfaceC28476b {

        /* JADX INFO: renamed from: g */
        public static final int f115006g = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String icon;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String text;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String backgroundUrl;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String cta;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C9598e navigationAction;

        public s(int i13, String icon, String text, String str, String cta, C9598e c9598e) {
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(text, "text");
            AbstractC22676k.m65750j(cta, "cta");
            this.campaignId = i13;
            this.icon = icon;
            this.text = text;
            this.backgroundUrl = str;
            this.cta = cta;
            this.navigationAction = c9598e;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof s)) {
                return false;
            }
            s sVar = (s) other;
            return this.campaignId == sVar.campaignId && AbstractC22676k.m65745e(this.icon, sVar.icon) && AbstractC22676k.m65745e(this.text, sVar.text) && AbstractC22676k.m65745e(this.backgroundUrl, sVar.backgroundUrl) && AbstractC22676k.m65745e(this.cta, sVar.cta) && AbstractC22676k.m65745e(this.navigationAction, sVar.navigationAction);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getBackgroundUrl() {
            return this.backgroundUrl;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.campaignId) * 31, 31, this.icon), 31, this.text);
            String str = this.backgroundUrl;
            int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.cta);
            C9598e c9598e = this.navigationAction;
            return iM30450d2 + (c9598e != null ? c9598e.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getCta() {
            return this.cta;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final C9598e getNavigationAction() {
            return this.navigationAction;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public String toString() {
            int i13 = this.campaignId;
            String str = this.icon;
            String str2 = this.text;
            String str3 = this.backgroundUrl;
            String str4 = this.cta;
            C9598e c9598e = this.navigationAction;
            StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "SubmittedSuccessfully(campaignId=", ", icon=", str, ", text=");
            AbstractC11266d.m30444B(sbM53373n, str2, ", backgroundUrl=", str3, ", cta=");
            return AbstractC13673n.m38563j(sbM53373n, str4, ", navigationAction=", c9598e, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.b$t */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Loy2/b$t;", "Loy2/b;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t implements InterfaceC28476b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String text;

        public t(String text) {
            AbstractC22676k.m65750j(text, "text");
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof t) && AbstractC22676k.m65745e(this.text, ((t) other).text);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Submitting(text=", this.text, ")");
        }
    }

    /* JADX INFO: renamed from: b */
    default a mo86413b(a aVar, boolean z4) {
        AbstractC22676k.m65750j(aVar, "<this>");
        return a.m86419i(aVar, null, null, null, false, false, null, null, null, z4, false, null, null, 3839, null);
    }

    /* JADX INFO: renamed from: c */
    default f mo86414c(f fVar, C28481g c28481g) {
        AbstractC22676k.m65750j(fVar, "<this>");
        if (fVar instanceof c) {
            return c.m86448i((c) fVar, null, null, null, false, false, c28481g, null, null, null, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, false, false, false, -33, 31, null);
        }
        if (fVar instanceof g) {
            return g.m86509i((g) fVar, null, null, null, false, false, c28481g, null, 0, null, null, null, null, null, false, false, 0, null, 131039, null);
        }
        if (fVar instanceof i) {
            return i.m86539i((i) fVar, null, null, null, false, false, c28481g, null, null, null, null, null, 2015, null);
        }
        if (fVar instanceof a) {
            return a.m86419i((a) fVar, null, null, null, false, false, c28481g, null, null, false, false, null, null, 4063, null);
        }
        if (fVar instanceof e) {
            return e.m86498i((e) fVar, null, null, null, false, false, c28481g, null, null, null, false, 991, null);
        }
        if (fVar instanceof d) {
            return d.m86486i((d) fVar, null, null, null, false, false, c28481g, null, false, null, null, null, 2015, null);
        }
        if (fVar instanceof h) {
            return h.m86527i((h) fVar, null, null, null, false, false, c28481g, 0, null, false, null, null, 2015, null);
        }
        if (fVar instanceof j) {
            return j.m86550i((j) fVar, null, null, null, false, false, c28481g, null, 0, 0, 479, null);
        }
        if (fVar instanceof b) {
            return b.m86432i((b) fVar, null, null, null, false, false, c28481g, false, false, null, 0, 0, 0, 0, 0, null, 32735, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    default C28481g mo86415d(CampaignStepConfigResponse campaignStepConfigResponse) {
        AbstractC22676k.m65750j(campaignStepConfigResponse, "<this>");
        return new C28481g(campaignStepConfigResponse.getCancelCta(), campaignStepConfigResponse.getCancelDialogTitle(), campaignStepConfigResponse.getCancelDialogBody(), campaignStepConfigResponse.getCancelDialogPositiveCta(), campaignStepConfigResponse.getCancelDialogNegativeCta());
    }

    /* JADX INFO: renamed from: e */
    default f mo86416e(f fVar, boolean z4) {
        AbstractC22676k.m65750j(fVar, "<this>");
        if (fVar instanceof c) {
            return c.m86448i((c) fVar, null, null, null, z4, false, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, false, false, false, -9, 31, null);
        }
        if (fVar instanceof g) {
            return g.m86509i((g) fVar, null, null, null, z4, false, null, null, 0, null, null, null, null, null, false, false, 0, null, 131063, null);
        }
        if (fVar instanceof i) {
            return i.m86539i((i) fVar, null, null, null, z4, false, null, null, null, null, null, null, 2039, null);
        }
        if (fVar instanceof a) {
            return a.m86419i((a) fVar, null, null, null, z4, false, null, null, null, false, false, null, null, 4087, null);
        }
        if (fVar instanceof e) {
            return e.m86498i((e) fVar, null, null, null, z4, false, null, null, null, null, false, MessageListItemViewType.LINK_ATTACHMENTS, null);
        }
        if (fVar instanceof d) {
            return d.m86486i((d) fVar, null, null, null, z4, false, null, null, false, null, null, null, 2039, null);
        }
        if (fVar instanceof h) {
            return h.m86527i((h) fVar, null, null, null, z4, false, null, 0, null, false, null, null, 2039, null);
        }
        if (fVar instanceof j) {
            return j.m86550i((j) fVar, null, null, null, z4, false, null, null, 0, 0, 503, null);
        }
        if (fVar instanceof b) {
            return b.m86432i((b) fVar, null, null, null, z4, false, null, false, false, null, 0, 0, 0, 0, 0, null, 32759, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    default f mo86417f(f fVar, boolean z4) {
        AbstractC22676k.m65750j(fVar, "<this>");
        if (fVar instanceof c) {
            return c.m86448i((c) fVar, null, null, null, false, z4, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, false, false, false, -17, 31, null);
        }
        if (fVar instanceof g) {
            return g.m86509i((g) fVar, null, null, null, false, z4, null, null, 0, null, null, null, null, null, false, false, 0, null, 131055, null);
        }
        if (fVar instanceof i) {
            return i.m86539i((i) fVar, null, null, null, false, z4, null, null, null, null, null, null, 2031, null);
        }
        if (fVar instanceof a) {
            return a.m86419i((a) fVar, null, null, null, false, z4, null, null, null, false, false, null, null, 4079, null);
        }
        if (fVar instanceof e) {
            return e.m86498i((e) fVar, null, null, null, false, z4, null, null, null, null, false, MessageListItemViewType.TYPING_INDICATOR, null);
        }
        if (fVar instanceof d) {
            return d.m86486i((d) fVar, null, null, null, false, z4, null, null, false, null, null, null, 2031, null);
        }
        if (fVar instanceof h) {
            return h.m86527i((h) fVar, null, null, null, false, z4, null, 0, null, false, null, null, 2031, null);
        }
        if (fVar instanceof j) {
            return j.m86550i((j) fVar, null, null, null, false, z4, null, null, 0, 0, 495, null);
        }
        if (fVar instanceof b) {
            return b.m86432i((b) fVar, null, null, null, false, z4, null, false, false, null, 0, 0, 0, 0, 0, null, 32751, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    default f mo86418g(f fVar, AbstractC28490p timerState) {
        AbstractC22676k.m65750j(fVar, "<this>");
        AbstractC22676k.m65750j(timerState, "timerState");
        if (fVar instanceof c) {
            c cVar = (c) fVar;
            return c.m86448i(cVar, C28489o.m86778b(cVar.getToolbarState(), null, null, timerState, 3, null), null, null, false, false, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, false, false, false, -2, 31, null);
        }
        if (fVar instanceof g) {
            g gVar = (g) fVar;
            return g.m86509i(gVar, C28489o.m86778b(gVar.getToolbarState(), null, null, timerState, 3, null), null, null, false, false, null, null, 0, null, null, null, null, null, false, false, 0, null, 131070, null);
        }
        if (fVar instanceof i) {
            i iVar = (i) fVar;
            return i.m86539i(iVar, C28489o.m86778b(iVar.getToolbarState(), null, null, timerState, 3, null), null, null, false, false, null, null, null, null, null, null, 2046, null);
        }
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            return a.m86419i(aVar, C28489o.m86778b(aVar.getToolbarState(), null, null, timerState, 3, null), null, null, false, false, null, null, null, false, false, null, null, 4094, null);
        }
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            return e.m86498i(eVar, C28489o.m86778b(eVar.getToolbarState(), null, null, timerState, 3, null), null, null, false, false, null, null, null, null, false, 1022, null);
        }
        if (fVar instanceof d) {
            d dVar = (d) fVar;
            return d.m86486i(dVar, C28489o.m86778b(dVar.getToolbarState(), null, null, timerState, 3, null), null, null, false, false, null, null, false, null, null, null, 2046, null);
        }
        if (fVar instanceof h) {
            h hVar = (h) fVar;
            return h.m86527i(hVar, C28489o.m86778b(hVar.getToolbarState(), null, null, timerState, 3, null), null, null, false, false, null, 0, null, false, null, null, 2046, null);
        }
        if (fVar instanceof j) {
            j jVar = (j) fVar;
            return j.m86550i(jVar, C28489o.m86778b(jVar.getToolbarState(), null, null, timerState, 3, null), null, null, false, false, null, null, 0, 0, 510, null);
        }
        if (!(fVar instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        b bVar = (b) fVar;
        return b.m86432i(bVar, C28489o.m86778b(bVar.getToolbarState(), null, null, timerState, 3, null), null, null, false, false, null, false, false, null, 0, 0, 0, 0, 0, null, 32766, null);
    }

    /* JADX INFO: renamed from: oy2.b$m */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\r¨\u0006%"}, m65681d2 = {"Loy2/b$m;", "Loy2/b;", "", "campaignId", "sessionId", "", "title", "body", "positiveCta", "negativeCta", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "i", "b", "Ljava/lang/Integer;", "l", "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "m", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "k", "f", "j", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m implements InterfaceC28476b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer sessionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String body;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String positiveCta;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String negativeCta;

        public m(int i13, Integer num, String str, String str2, String str3, String str4) {
            this.campaignId = i13;
            this.sessionId = num;
            this.title = str;
            this.body = str2;
            this.positiveCta = str3;
            this.negativeCta = str4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return this.campaignId == mVar.campaignId && AbstractC22676k.m65745e(this.sessionId, mVar.sessionId) && AbstractC22676k.m65745e(this.title, mVar.title) && AbstractC22676k.m65745e(this.body, mVar.body) && AbstractC22676k.m65745e(this.positiveCta, mVar.positiveCta) && AbstractC22676k.m65745e(this.negativeCta, mVar.negativeCta);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.campaignId) * 31;
            Integer num = this.sessionId;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.title;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.body;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.positiveCta;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.negativeCta;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getNegativeCta() {
            return this.negativeCta;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getPositiveCta() {
            return this.positiveCta;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final Integer getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public String toString() {
            int i13 = this.campaignId;
            Integer num = this.sessionId;
            String str = this.title;
            String str2 = this.body;
            String str3 = this.positiveCta;
            String str4 = this.negativeCta;
            StringBuilder sb4 = new StringBuilder("Error(campaignId=");
            sb4.append(i13);
            sb4.append(", sessionId=");
            sb4.append(num);
            sb4.append(", title=");
            AbstractC11266d.m30444B(sb4, str, ", body=", str2, ", positiveCta=");
            return AbstractC11266d.m30464r(sb4, str3, ", negativeCta=", str4, ")");
        }

        public /* synthetic */ m(int i13, Integer num, String str, String str2, String str3, String str4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4);
        }
    }

    /* JADX INFO: renamed from: oy2.b$j */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011Jp\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b\u001c\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010\u0017¨\u00064"}, m65681d2 = {"Loy2/b$j;", "Loy2/b$f;", "Loy2/o;", "toolbarState", "", "primaryButtonText", "secondaryButtonText", "", "isAddNoteShowing", "isCancelStudyShowing", "Loy2/g;", "cancelStudyState", "content", "", "hour", "minutes", "<init>", "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Ljava/lang/String;II)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Ljava/lang/String;II)Loy2/b$j;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Loy2/o;", "p", "()Loy2/o;", "b", "Ljava/lang/String;", "n", "c", "o", "d", "Z", "q", "()Z", "e", "f", "Loy2/g;", "j", "()Loy2/g;", "g", "k", "I", "l", "i", "m", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28489o toolbarState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String primaryButtonText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String secondaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isAddNoteShowing;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isCancelStudyShowing;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C28481g cancelStudyState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final int hour;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final int minutes;

        public j(C28489o toolbarState, String primaryButtonText, String str, boolean z4, boolean z13, C28481g c28481g, String str2, int i13, int i14) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            this.toolbarState = toolbarState;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = str;
            this.isAddNoteShowing = z4;
            this.isCancelStudyShowing = z13;
            this.cancelStudyState = c28481g;
            this.content = str2;
            this.hour = i13;
            this.minutes = i14;
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ j m86550i(j jVar, C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, String str3, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                c28489o = jVar.toolbarState;
            }
            if ((i15 & 2) != 0) {
                str = jVar.primaryButtonText;
            }
            if ((i15 & 4) != 0) {
                str2 = jVar.secondaryButtonText;
            }
            if ((i15 & 8) != 0) {
                z4 = jVar.isAddNoteShowing;
            }
            if ((i15 & 16) != 0) {
                z13 = jVar.isCancelStudyShowing;
            }
            if ((i15 & 32) != 0) {
                c28481g = jVar.cancelStudyState;
            }
            if ((i15 & 64) != 0) {
                str3 = jVar.content;
            }
            if ((i15 & 128) != 0) {
                i13 = jVar.hour;
            }
            if ((i15 & 256) != 0) {
                i14 = jVar.minutes;
            }
            int i16 = i13;
            int i17 = i14;
            C28481g c28481g2 = c28481g;
            String str4 = str3;
            boolean z14 = z13;
            String str5 = str2;
            return jVar.m86551h(c28489o, str, str5, z4, z14, c28481g2, str4, i16, i17);
        }

        @Override // oy2.InterfaceC28476b.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsCancelStudyShowing() {
            return this.isCancelStudyShowing;
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: c */
        public /* bridge */ f mo86414c(f fVar, C28481g c28481g) {
            return super.mo86414c(fVar, c28481g);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: d */
        public /* bridge */ C28481g mo86415d(CampaignStepConfigResponse campaignStepConfigResponse) {
            return super.mo86415d(campaignStepConfigResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.toolbarState, jVar.toolbarState) && AbstractC22676k.m65745e(this.primaryButtonText, jVar.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, jVar.secondaryButtonText) && this.isAddNoteShowing == jVar.isAddNoteShowing && this.isCancelStudyShowing == jVar.isCancelStudyShowing && AbstractC22676k.m65745e(this.cancelStudyState, jVar.cancelStudyState) && AbstractC22676k.m65745e(this.content, jVar.content) && this.hour == jVar.hour && this.minutes == jVar.minutes;
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: f */
        public /* bridge */ f mo86417f(f fVar, boolean z4) {
            return super.mo86417f(fVar, z4);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: g */
        public /* bridge */ f mo86418g(f fVar, AbstractC28490p abstractC28490p) {
            return super.mo86418g(fVar, abstractC28490p);
        }

        /* JADX INFO: renamed from: h */
        public final j m86551h(C28489o toolbarState, String primaryButtonText, String secondaryButtonText, boolean isAddNoteShowing, boolean isCancelStudyShowing, C28481g cancelStudyState, String content, int hour, int minutes) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            return new j(toolbarState, primaryButtonText, secondaryButtonText, isAddNoteShowing, isCancelStudyShowing, cancelStudyState, content, hour, minutes);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.toolbarState.hashCode() * 31, 31, this.primaryButtonText);
            String str = this.secondaryButtonText;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.isAddNoteShowing), 31, this.isCancelStudyShowing);
            C28481g c28481g = this.cancelStudyState;
            int iHashCode = (iM8289b + (c28481g == null ? 0 : c28481g.hashCode())) * 31;
            String str2 = this.content;
            return Integer.hashCode(this.minutes) + AbstractC11266d.m30448b(this.hour, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public C28481g getCancelStudyState() {
            return this.cancelStudyState;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final int getHour() {
            return this.hour;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getMinutes() {
            return this.minutes;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public C28489o getToolbarState() {
            return this.toolbarState;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public boolean getIsAddNoteShowing() {
            return this.isAddNoteShowing;
        }

        public String toString() {
            C28489o c28489o = this.toolbarState;
            String str = this.primaryButtonText;
            String str2 = this.secondaryButtonText;
            boolean z4 = this.isAddNoteShowing;
            boolean z13 = this.isCancelStudyShowing;
            C28481g c28481g = this.cancelStudyState;
            String str3 = this.content;
            int i13 = this.hour;
            int i14 = this.minutes;
            StringBuilder sb4 = new StringBuilder("CampaignTimePickerStepDomainState(toolbarState=");
            sb4.append(c28489o);
            sb4.append(", primaryButtonText=");
            sb4.append(str);
            sb4.append(", secondaryButtonText=");
            AbstractC38963t7.m124390t(sb4, str2, ", isAddNoteShowing=", z4, ", isCancelStudyShowing=");
            sb4.append(z13);
            sb4.append(", cancelStudyState=");
            sb4.append(c28481g);
            sb4.append(", content=");
            AbstractC11266d.m30470x(i13, str3, ", hour=", ", minutes=", sb4);
            return AbstractC18489d0.m53371l(sb4, i14, ")");
        }

        public /* synthetic */ j(C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, String str3, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(c28489o, str, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? false : z4, (i15 & 16) != 0 ? false : z13, (i15 & 32) != 0 ? null : c28481g, str3, i13, i14);
        }
    }

    /* JADX INFO: renamed from: oy2.b$e */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0082\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b\u001f\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010\u0017R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b8\u0010+¨\u00069"}, m65681d2 = {"Loy2/b$e;", "Loy2/b$f;", "Loy2/o;", "toolbarState", "", "primaryButtonText", "secondaryButtonText", "", "isAddNoteShowing", "isCancelStudyShowing", "Loy2/g;", "cancelStudyState", "content", "", "Lcom/whoop/whooplabs/data/domain/OptionSelection;", "options", "selected", "isRequired", "<init>", "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)Loy2/b$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Loy2/o;", "p", "()Loy2/o;", "b", "Ljava/lang/String;", "m", "c", "n", "d", "Z", "q", "()Z", "e", "f", "Loy2/g;", "j", "()Loy2/g;", "g", "k", "Ljava/util/List;", "l", "()Ljava/util/List;", "i", "o", "r", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28489o toolbarState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String primaryButtonText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String secondaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isAddNoteShowing;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isCancelStudyShowing;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C28481g cancelStudyState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<OptionSelection> options;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String selected;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean isRequired;

        public e(C28489o toolbarState, String primaryButtonText, String str, boolean z4, boolean z13, C28481g c28481g, String str2, List<OptionSelection> options, String str3, boolean z14) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(options, "options");
            this.toolbarState = toolbarState;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = str;
            this.isAddNoteShowing = z4;
            this.isCancelStudyShowing = z13;
            this.cancelStudyState = c28481g;
            this.content = str2;
            this.options = options;
            this.selected = str3;
            this.isRequired = z14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public static /* synthetic */ e m86498i(e eVar, C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, String str3, List list, String str4, boolean z14, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c28489o = eVar.toolbarState;
            }
            if ((i13 & 2) != 0) {
                str = eVar.primaryButtonText;
            }
            if ((i13 & 4) != 0) {
                str2 = eVar.secondaryButtonText;
            }
            if ((i13 & 8) != 0) {
                z4 = eVar.isAddNoteShowing;
            }
            if ((i13 & 16) != 0) {
                z13 = eVar.isCancelStudyShowing;
            }
            if ((i13 & 32) != 0) {
                c28481g = eVar.cancelStudyState;
            }
            if ((i13 & 64) != 0) {
                str3 = eVar.content;
            }
            if ((i13 & 128) != 0) {
                list = eVar.options;
            }
            if ((i13 & 256) != 0) {
                str4 = eVar.selected;
            }
            if ((i13 & 512) != 0) {
                z14 = eVar.isRequired;
            }
            String str5 = str4;
            boolean z15 = z14;
            String str6 = str3;
            List list2 = list;
            boolean z16 = z13;
            C28481g c28481g2 = c28481g;
            return eVar.m86499h(c28489o, str, str2, z4, z16, c28481g2, str6, list2, str5, z15);
        }

        @Override // oy2.InterfaceC28476b.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsCancelStudyShowing() {
            return this.isCancelStudyShowing;
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: c */
        public /* bridge */ f mo86414c(f fVar, C28481g c28481g) {
            return super.mo86414c(fVar, c28481g);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: d */
        public /* bridge */ C28481g mo86415d(CampaignStepConfigResponse campaignStepConfigResponse) {
            return super.mo86415d(campaignStepConfigResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.toolbarState, eVar.toolbarState) && AbstractC22676k.m65745e(this.primaryButtonText, eVar.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, eVar.secondaryButtonText) && this.isAddNoteShowing == eVar.isAddNoteShowing && this.isCancelStudyShowing == eVar.isCancelStudyShowing && AbstractC22676k.m65745e(this.cancelStudyState, eVar.cancelStudyState) && AbstractC22676k.m65745e(this.content, eVar.content) && AbstractC22676k.m65745e(this.options, eVar.options) && AbstractC22676k.m65745e(this.selected, eVar.selected) && this.isRequired == eVar.isRequired;
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: f */
        public /* bridge */ f mo86417f(f fVar, boolean z4) {
            return super.mo86417f(fVar, z4);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: g */
        public /* bridge */ f mo86418g(f fVar, AbstractC28490p abstractC28490p) {
            return super.mo86418g(fVar, abstractC28490p);
        }

        /* JADX INFO: renamed from: h */
        public final e m86499h(C28489o toolbarState, String primaryButtonText, String secondaryButtonText, boolean isAddNoteShowing, boolean isCancelStudyShowing, C28481g cancelStudyState, String content, List<OptionSelection> options, String selected, boolean isRequired) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(options, "options");
            return new e(toolbarState, primaryButtonText, secondaryButtonText, isAddNoteShowing, isCancelStudyShowing, cancelStudyState, content, options, selected, isRequired);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.toolbarState.hashCode() * 31, 31, this.primaryButtonText);
            String str = this.secondaryButtonText;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.isAddNoteShowing), 31, this.isCancelStudyShowing);
            C28481g c28481g = this.cancelStudyState;
            int iHashCode = (iM8289b + (c28481g == null ? 0 : c28481g.hashCode())) * 31;
            String str2 = this.content;
            int iM31983b = AbstractC11895b.m31983b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.options);
            String str3 = this.selected;
            return Boolean.hashCode(this.isRequired) + ((iM31983b + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public C28481g getCancelStudyState() {
            return this.cancelStudyState;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: l */
        public final List<OptionSelection> m86502l() {
            return this.options;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getSelected() {
            return this.selected;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public C28489o getToolbarState() {
            return this.toolbarState;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public boolean getIsAddNoteShowing() {
            return this.isAddNoteShowing;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public String toString() {
            C28489o c28489o = this.toolbarState;
            String str = this.primaryButtonText;
            String str2 = this.secondaryButtonText;
            boolean z4 = this.isAddNoteShowing;
            boolean z13 = this.isCancelStudyShowing;
            C28481g c28481g = this.cancelStudyState;
            String str3 = this.content;
            List<OptionSelection> list = this.options;
            String str4 = this.selected;
            boolean z14 = this.isRequired;
            StringBuilder sb4 = new StringBuilder("CampaignOptionSelectionStepDomainState(toolbarState=");
            sb4.append(c28489o);
            sb4.append(", primaryButtonText=");
            sb4.append(str);
            sb4.append(", secondaryButtonText=");
            AbstractC38963t7.m124390t(sb4, str2, ", isAddNoteShowing=", z4, ", isCancelStudyShowing=");
            sb4.append(z13);
            sb4.append(", cancelStudyState=");
            sb4.append(c28481g);
            sb4.append(", content=");
            AbstractC36095b.m114694v(str3, ", options=", ", selected=", sb4, list);
            return AbstractC21702c.m61137h(sb4, str4, ", isRequired=", z14, ")");
        }

        public /* synthetic */ e(C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, String str3, List list, String str4, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c28489o, str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? null : c28481g, str3, (i13 & 128) != 0 ? C25271y.f99162w : list, (i13 & 256) != 0 ? null : str4, z14);
        }
    }

    /* JADX INFO: renamed from: oy2.b$d */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0088\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b\u001f\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b3\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b8\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b9\u0010\u0017¨\u0006:"}, m65681d2 = {"Loy2/b$d;", "Loy2/b$f;", "Loy2/o;", "toolbarState", "", "primaryButtonText", "secondaryButtonText", "", "isAddNoteShowing", "isCancelStudyShowing", "Loy2/g;", "cancelStudyState", "content", "isRequired", "Loy2/i;", "inputConfig", "value", "hint", "<init>", "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Ljava/lang/String;ZLoy2/i;Ljava/lang/String;Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Ljava/lang/String;ZLoy2/i;Ljava/lang/String;Ljava/lang/String;)Loy2/b$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Loy2/o;", "p", "()Loy2/o;", "b", "Ljava/lang/String;", "n", "c", "o", "d", "Z", "r", "()Z", "e", "f", "Loy2/g;", "j", "()Loy2/g;", "g", "k", "s", "i", "Loy2/i;", "m", "()Loy2/i;", "q", "l", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28489o toolbarState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String primaryButtonText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String secondaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isAddNoteShowing;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isCancelStudyShowing;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C28481g cancelStudyState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean isRequired;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C28483i inputConfig;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String hint;

        public d(C28489o toolbarState, String primaryButtonText, String str, boolean z4, boolean z13, C28481g c28481g, String str2, boolean z14, C28483i inputConfig, String str3, String str4) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(inputConfig, "inputConfig");
            this.toolbarState = toolbarState;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = str;
            this.isAddNoteShowing = z4;
            this.isCancelStudyShowing = z13;
            this.cancelStudyState = c28481g;
            this.content = str2;
            this.isRequired = z14;
            this.inputConfig = inputConfig;
            this.value = str3;
            this.hint = str4;
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ d m86486i(d dVar, C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, String str3, boolean z14, C28483i c28483i, String str4, String str5, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c28489o = dVar.toolbarState;
            }
            if ((i13 & 2) != 0) {
                str = dVar.primaryButtonText;
            }
            if ((i13 & 4) != 0) {
                str2 = dVar.secondaryButtonText;
            }
            if ((i13 & 8) != 0) {
                z4 = dVar.isAddNoteShowing;
            }
            if ((i13 & 16) != 0) {
                z13 = dVar.isCancelStudyShowing;
            }
            if ((i13 & 32) != 0) {
                c28481g = dVar.cancelStudyState;
            }
            if ((i13 & 64) != 0) {
                str3 = dVar.content;
            }
            if ((i13 & 128) != 0) {
                z14 = dVar.isRequired;
            }
            if ((i13 & 256) != 0) {
                c28483i = dVar.inputConfig;
            }
            if ((i13 & 512) != 0) {
                str4 = dVar.value;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                str5 = dVar.hint;
            }
            String str6 = str4;
            String str7 = str5;
            boolean z15 = z14;
            C28483i c28483i2 = c28483i;
            C28481g c28481g2 = c28481g;
            String str8 = str3;
            boolean z16 = z13;
            String str9 = str2;
            return dVar.m86487h(c28489o, str, str9, z4, z16, c28481g2, str8, z15, c28483i2, str6, str7);
        }

        @Override // oy2.InterfaceC28476b.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsCancelStudyShowing() {
            return this.isCancelStudyShowing;
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: c */
        public /* bridge */ f mo86414c(f fVar, C28481g c28481g) {
            return super.mo86414c(fVar, c28481g);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: d */
        public /* bridge */ C28481g mo86415d(CampaignStepConfigResponse campaignStepConfigResponse) {
            return super.mo86415d(campaignStepConfigResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.toolbarState, dVar.toolbarState) && AbstractC22676k.m65745e(this.primaryButtonText, dVar.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, dVar.secondaryButtonText) && this.isAddNoteShowing == dVar.isAddNoteShowing && this.isCancelStudyShowing == dVar.isCancelStudyShowing && AbstractC22676k.m65745e(this.cancelStudyState, dVar.cancelStudyState) && AbstractC22676k.m65745e(this.content, dVar.content) && this.isRequired == dVar.isRequired && AbstractC22676k.m65745e(this.inputConfig, dVar.inputConfig) && AbstractC22676k.m65745e(this.value, dVar.value) && AbstractC22676k.m65745e(this.hint, dVar.hint);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: f */
        public /* bridge */ f mo86417f(f fVar, boolean z4) {
            return super.mo86417f(fVar, z4);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: g */
        public /* bridge */ f mo86418g(f fVar, AbstractC28490p abstractC28490p) {
            return super.mo86418g(fVar, abstractC28490p);
        }

        /* JADX INFO: renamed from: h */
        public final d m86487h(C28489o toolbarState, String primaryButtonText, String secondaryButtonText, boolean isAddNoteShowing, boolean isCancelStudyShowing, C28481g cancelStudyState, String content, boolean isRequired, C28483i inputConfig, String value, String hint) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(inputConfig, "inputConfig");
            return new d(toolbarState, primaryButtonText, secondaryButtonText, isAddNoteShowing, isCancelStudyShowing, cancelStudyState, content, isRequired, inputConfig, value, hint);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.toolbarState.hashCode() * 31, 31, this.primaryButtonText);
            String str = this.secondaryButtonText;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.isAddNoteShowing), 31, this.isCancelStudyShowing);
            C28481g c28481g = this.cancelStudyState;
            int iHashCode = (iM8289b + (c28481g == null ? 0 : c28481g.hashCode())) * 31;
            String str2 = this.content;
            int iHashCode2 = (this.inputConfig.hashCode() + AbstractC2875y.m8289b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isRequired)) * 31;
            String str3 = this.value;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.hint;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public C28481g getCancelStudyState() {
            return this.cancelStudyState;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final C28483i getInputConfig() {
            return this.inputConfig;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public C28489o getToolbarState() {
            return this.toolbarState;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public boolean getIsAddNoteShowing() {
            return this.isAddNoteShowing;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public String toString() {
            C28489o c28489o = this.toolbarState;
            String str = this.primaryButtonText;
            String str2 = this.secondaryButtonText;
            boolean z4 = this.isAddNoteShowing;
            boolean z13 = this.isCancelStudyShowing;
            C28481g c28481g = this.cancelStudyState;
            String str3 = this.content;
            boolean z14 = this.isRequired;
            C28483i c28483i = this.inputConfig;
            String str4 = this.value;
            String str5 = this.hint;
            StringBuilder sb4 = new StringBuilder("CampaignNumberInputStepDomainState(toolbarState=");
            sb4.append(c28489o);
            sb4.append(", primaryButtonText=");
            sb4.append(str);
            sb4.append(", secondaryButtonText=");
            AbstractC38963t7.m124390t(sb4, str2, ", isAddNoteShowing=", z4, ", isCancelStudyShowing=");
            sb4.append(z13);
            sb4.append(", cancelStudyState=");
            sb4.append(c28481g);
            sb4.append(", content=");
            AbstractC38963t7.m124390t(sb4, str3, ", isRequired=", z14, ", inputConfig=");
            sb4.append(c28483i);
            sb4.append(", value=");
            sb4.append(str4);
            sb4.append(", hint=");
            return AbstractC25012a.m73376i(str5, ")", sb4);
        }

        public /* synthetic */ d(C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, String str3, boolean z14, C28483i c28483i, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c28489o, str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? null : c28481g, str3, z14, (i13 & 256) != 0 ? new C28483i(null, null, null, null, null, null, 0, 127, null) : c28483i, (i13 & 512) != 0 ? null : str4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str5);
        }
    }

    /* JADX INFO: renamed from: oy2.b$h */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0084\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b\u001f\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b4\u0010\u0018R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010+R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010$\u001a\u0004\b:\u0010\u0018¨\u0006;"}, m65681d2 = {"Loy2/b$h;", "Loy2/b$f;", "Loy2/o;", "toolbarState", "", "primaryButtonText", "secondaryButtonText", "", "isAddNoteShowing", "isCancelStudyShowing", "Loy2/g;", "cancelStudyState", "", "stepId", "content", "isRequired", "Loy2/i;", "inputConfig", "textInput", "<init>", "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;ILjava/lang/String;ZLoy2/i;Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;ILjava/lang/String;ZLoy2/i;Ljava/lang/String;)Loy2/b$h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Loy2/o;", "q", "()Loy2/o;", "b", "Ljava/lang/String;", "m", "c", "n", "d", "Z", "r", "()Z", "e", "f", "Loy2/g;", "j", "()Loy2/g;", "g", "I", "o", "k", "i", "s", "Loy2/i;", "l", "()Loy2/i;", "p", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28489o toolbarState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String primaryButtonText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String secondaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isAddNoteShowing;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isCancelStudyShowing;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C28481g cancelStudyState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final int stepId;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean isRequired;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final C28483i inputConfig;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String textInput;

        public h(C28489o toolbarState, String primaryButtonText, String str, boolean z4, boolean z13, C28481g c28481g, int i13, String str2, boolean z14, C28483i inputConfig, String textInput) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(inputConfig, "inputConfig");
            AbstractC22676k.m65750j(textInput, "textInput");
            this.toolbarState = toolbarState;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = str;
            this.isAddNoteShowing = z4;
            this.isCancelStudyShowing = z13;
            this.cancelStudyState = c28481g;
            this.stepId = i13;
            this.content = str2;
            this.isRequired = z14;
            this.inputConfig = inputConfig;
            this.textInput = textInput;
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ h m86527i(h hVar, C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, int i13, String str3, boolean z14, C28483i c28483i, String str4, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                c28489o = hVar.toolbarState;
            }
            if ((i14 & 2) != 0) {
                str = hVar.primaryButtonText;
            }
            if ((i14 & 4) != 0) {
                str2 = hVar.secondaryButtonText;
            }
            if ((i14 & 8) != 0) {
                z4 = hVar.isAddNoteShowing;
            }
            if ((i14 & 16) != 0) {
                z13 = hVar.isCancelStudyShowing;
            }
            if ((i14 & 32) != 0) {
                c28481g = hVar.cancelStudyState;
            }
            if ((i14 & 64) != 0) {
                i13 = hVar.stepId;
            }
            if ((i14 & 128) != 0) {
                str3 = hVar.content;
            }
            if ((i14 & 256) != 0) {
                z14 = hVar.isRequired;
            }
            if ((i14 & 512) != 0) {
                c28483i = hVar.inputConfig;
            }
            if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                str4 = hVar.textInput;
            }
            C28483i c28483i2 = c28483i;
            String str5 = str4;
            String str6 = str3;
            boolean z15 = z14;
            C28481g c28481g2 = c28481g;
            int i15 = i13;
            boolean z16 = z13;
            String str7 = str2;
            return hVar.m86528h(c28489o, str, str7, z4, z16, c28481g2, i15, str6, z15, c28483i2, str5);
        }

        @Override // oy2.InterfaceC28476b.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsCancelStudyShowing() {
            return this.isCancelStudyShowing;
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: c */
        public /* bridge */ f mo86414c(f fVar, C28481g c28481g) {
            return super.mo86414c(fVar, c28481g);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: d */
        public /* bridge */ C28481g mo86415d(CampaignStepConfigResponse campaignStepConfigResponse) {
            return super.mo86415d(campaignStepConfigResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.toolbarState, hVar.toolbarState) && AbstractC22676k.m65745e(this.primaryButtonText, hVar.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, hVar.secondaryButtonText) && this.isAddNoteShowing == hVar.isAddNoteShowing && this.isCancelStudyShowing == hVar.isCancelStudyShowing && AbstractC22676k.m65745e(this.cancelStudyState, hVar.cancelStudyState) && this.stepId == hVar.stepId && AbstractC22676k.m65745e(this.content, hVar.content) && this.isRequired == hVar.isRequired && AbstractC22676k.m65745e(this.inputConfig, hVar.inputConfig) && AbstractC22676k.m65745e(this.textInput, hVar.textInput);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: f */
        public /* bridge */ f mo86417f(f fVar, boolean z4) {
            return super.mo86417f(fVar, z4);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: g */
        public /* bridge */ f mo86418g(f fVar, AbstractC28490p abstractC28490p) {
            return super.mo86418g(fVar, abstractC28490p);
        }

        /* JADX INFO: renamed from: h */
        public final h m86528h(C28489o toolbarState, String primaryButtonText, String secondaryButtonText, boolean isAddNoteShowing, boolean isCancelStudyShowing, C28481g cancelStudyState, int stepId, String content, boolean isRequired, C28483i inputConfig, String textInput) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(inputConfig, "inputConfig");
            AbstractC22676k.m65750j(textInput, "textInput");
            return new h(toolbarState, primaryButtonText, secondaryButtonText, isAddNoteShowing, isCancelStudyShowing, cancelStudyState, stepId, content, isRequired, inputConfig, textInput);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.toolbarState.hashCode() * 31, 31, this.primaryButtonText);
            String str = this.secondaryButtonText;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.isAddNoteShowing), 31, this.isCancelStudyShowing);
            C28481g c28481g = this.cancelStudyState;
            int iM30448b = AbstractC11266d.m30448b(this.stepId, (iM8289b + (c28481g == null ? 0 : c28481g.hashCode())) * 31, 31);
            String str2 = this.content;
            return this.textInput.hashCode() + ((this.inputConfig.hashCode() + AbstractC2875y.m8289b((iM30448b + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isRequired)) * 31);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public C28481g getCancelStudyState() {
            return this.cancelStudyState;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final C28483i getInputConfig() {
            return this.inputConfig;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final int getStepId() {
            return this.stepId;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getTextInput() {
            return this.textInput;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public C28489o getToolbarState() {
            return this.toolbarState;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public boolean getIsAddNoteShowing() {
            return this.isAddNoteShowing;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public String toString() {
            C28489o c28489o = this.toolbarState;
            String str = this.primaryButtonText;
            String str2 = this.secondaryButtonText;
            boolean z4 = this.isAddNoteShowing;
            boolean z13 = this.isCancelStudyShowing;
            C28481g c28481g = this.cancelStudyState;
            int i13 = this.stepId;
            String str3 = this.content;
            boolean z14 = this.isRequired;
            C28483i c28483i = this.inputConfig;
            String str4 = this.textInput;
            StringBuilder sb4 = new StringBuilder("CampaignTextInputStepDomainState(toolbarState=");
            sb4.append(c28489o);
            sb4.append(", primaryButtonText=");
            sb4.append(str);
            sb4.append(", secondaryButtonText=");
            AbstractC38963t7.m124390t(sb4, str2, ", isAddNoteShowing=", z4, ", isCancelStudyShowing=");
            sb4.append(z13);
            sb4.append(", cancelStudyState=");
            sb4.append(c28481g);
            sb4.append(", stepId=");
            AbstractC11895b.m31979B(i13, ", content=", str3, ", isRequired=", sb4);
            sb4.append(z14);
            sb4.append(", inputConfig=");
            sb4.append(c28483i);
            sb4.append(", textInput=");
            return AbstractC25012a.m73376i(str4, ")", sb4);
        }

        public /* synthetic */ h(C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, int i13, String str3, boolean z14, C28483i c28483i, String str4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(c28489o, str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? false : z4, (i14 & 16) != 0 ? false : z13, (i14 & 32) != 0 ? null : c28481g, i13, str3, z14, (i14 & 512) != 0 ? new C28483i(null, null, null, null, null, null, 0, 127, null) : c28483i, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? "" : str4);
        }
    }

    /* JADX INFO: renamed from: oy2.b$i */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u008c\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b\u001e\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b2\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b5\u0010\u0016R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\b7\u00108¨\u00069"}, m65681d2 = {"Loy2/b$i;", "Loy2/b$f;", "Loy2/o;", "toolbarState", "", "primaryButtonText", "secondaryButtonText", "", "isAddNoteShowing", "isCancelStudyShowing", "Loy2/g;", "cancelStudyState", "content", "imageUrl", "imageAlt", "typeformUrl", "typeformSubmitted", "<init>", "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Loy2/b$i;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Loy2/o;", "p", "()Loy2/o;", "b", "Ljava/lang/String;", "n", "c", "o", "d", "Z", "r", "()Z", "e", "f", "Loy2/g;", "j", "()Loy2/g;", "g", "k", "m", "i", "l", "q", "Ljava/lang/Boolean;", "getTypeformSubmitted", "()Ljava/lang/Boolean;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28489o toolbarState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String primaryButtonText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String secondaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isAddNoteShowing;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isCancelStudyShowing;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C28481g cancelStudyState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String imageUrl;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String imageAlt;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String typeformUrl;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final Boolean typeformSubmitted;

        public i(C28489o toolbarState, String primaryButtonText, String str, boolean z4, boolean z13, C28481g c28481g, String str2, String str3, String str4, String str5, Boolean bool) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            this.toolbarState = toolbarState;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = str;
            this.isAddNoteShowing = z4;
            this.isCancelStudyShowing = z13;
            this.cancelStudyState = c28481g;
            this.content = str2;
            this.imageUrl = str3;
            this.imageAlt = str4;
            this.typeformUrl = str5;
            this.typeformSubmitted = bool;
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ i m86539i(i iVar, C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, String str3, String str4, String str5, String str6, Boolean bool, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c28489o = iVar.toolbarState;
            }
            if ((i13 & 2) != 0) {
                str = iVar.primaryButtonText;
            }
            if ((i13 & 4) != 0) {
                str2 = iVar.secondaryButtonText;
            }
            if ((i13 & 8) != 0) {
                z4 = iVar.isAddNoteShowing;
            }
            if ((i13 & 16) != 0) {
                z13 = iVar.isCancelStudyShowing;
            }
            if ((i13 & 32) != 0) {
                c28481g = iVar.cancelStudyState;
            }
            if ((i13 & 64) != 0) {
                str3 = iVar.content;
            }
            if ((i13 & 128) != 0) {
                str4 = iVar.imageUrl;
            }
            if ((i13 & 256) != 0) {
                str5 = iVar.imageAlt;
            }
            if ((i13 & 512) != 0) {
                str6 = iVar.typeformUrl;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                bool = iVar.typeformSubmitted;
            }
            String str7 = str6;
            Boolean bool2 = bool;
            String str8 = str4;
            String str9 = str5;
            C28481g c28481g2 = c28481g;
            String str10 = str3;
            boolean z14 = z13;
            String str11 = str2;
            return iVar.m86540h(c28489o, str, str11, z4, z14, c28481g2, str10, str8, str9, str7, bool2);
        }

        @Override // oy2.InterfaceC28476b.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsCancelStudyShowing() {
            return this.isCancelStudyShowing;
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: c */
        public /* bridge */ f mo86414c(f fVar, C28481g c28481g) {
            return super.mo86414c(fVar, c28481g);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: d */
        public /* bridge */ C28481g mo86415d(CampaignStepConfigResponse campaignStepConfigResponse) {
            return super.mo86415d(campaignStepConfigResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.toolbarState, iVar.toolbarState) && AbstractC22676k.m65745e(this.primaryButtonText, iVar.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, iVar.secondaryButtonText) && this.isAddNoteShowing == iVar.isAddNoteShowing && this.isCancelStudyShowing == iVar.isCancelStudyShowing && AbstractC22676k.m65745e(this.cancelStudyState, iVar.cancelStudyState) && AbstractC22676k.m65745e(this.content, iVar.content) && AbstractC22676k.m65745e(this.imageUrl, iVar.imageUrl) && AbstractC22676k.m65745e(this.imageAlt, iVar.imageAlt) && AbstractC22676k.m65745e(this.typeformUrl, iVar.typeformUrl) && AbstractC22676k.m65745e(this.typeformSubmitted, iVar.typeformSubmitted);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: f */
        public /* bridge */ f mo86417f(f fVar, boolean z4) {
            return super.mo86417f(fVar, z4);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: g */
        public /* bridge */ f mo86418g(f fVar, AbstractC28490p abstractC28490p) {
            return super.mo86418g(fVar, abstractC28490p);
        }

        /* JADX INFO: renamed from: h */
        public final i m86540h(C28489o toolbarState, String primaryButtonText, String secondaryButtonText, boolean isAddNoteShowing, boolean isCancelStudyShowing, C28481g cancelStudyState, String content, String imageUrl, String imageAlt, String typeformUrl, Boolean typeformSubmitted) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            return new i(toolbarState, primaryButtonText, secondaryButtonText, isAddNoteShowing, isCancelStudyShowing, cancelStudyState, content, imageUrl, imageAlt, typeformUrl, typeformSubmitted);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.toolbarState.hashCode() * 31, 31, this.primaryButtonText);
            String str = this.secondaryButtonText;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.isAddNoteShowing), 31, this.isCancelStudyShowing);
            C28481g c28481g = this.cancelStudyState;
            int iHashCode = (iM8289b + (c28481g == null ? 0 : c28481g.hashCode())) * 31;
            String str2 = this.content;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.imageUrl;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.imageAlt;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.typeformUrl;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.typeformSubmitted;
            return iHashCode5 + (bool != null ? bool.hashCode() : 0);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public C28481g getCancelStudyState() {
            return this.cancelStudyState;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getImageAlt() {
            return this.imageAlt;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public C28489o getToolbarState() {
            return this.toolbarState;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getTypeformUrl() {
            return this.typeformUrl;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public boolean getIsAddNoteShowing() {
            return this.isAddNoteShowing;
        }

        public String toString() {
            C28489o c28489o = this.toolbarState;
            String str = this.primaryButtonText;
            String str2 = this.secondaryButtonText;
            boolean z4 = this.isAddNoteShowing;
            boolean z13 = this.isCancelStudyShowing;
            C28481g c28481g = this.cancelStudyState;
            String str3 = this.content;
            String str4 = this.imageUrl;
            String str5 = this.imageAlt;
            String str6 = this.typeformUrl;
            Boolean bool = this.typeformSubmitted;
            StringBuilder sb4 = new StringBuilder("CampaignTextStepDomainState(toolbarState=");
            sb4.append(c28489o);
            sb4.append(", primaryButtonText=");
            sb4.append(str);
            sb4.append(", secondaryButtonText=");
            AbstractC38963t7.m124390t(sb4, str2, ", isAddNoteShowing=", z4, ", isCancelStudyShowing=");
            sb4.append(z13);
            sb4.append(", cancelStudyState=");
            sb4.append(c28481g);
            sb4.append(", content=");
            AbstractC11266d.m30444B(sb4, str3, ", imageUrl=", str4, ", imageAlt=");
            AbstractC11266d.m30444B(sb4, str5, ", typeformUrl=", str6, ", typeformSubmitted=");
            return AbstractC11478a.m30858j(sb4, bool, ")");
        }

        public /* synthetic */ i(C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, String str3, String str4, String str5, String str6, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c28489o, str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? null : c28481g, str3, str4, str5, str6, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : bool);
        }
    }

    /* JADX INFO: renamed from: oy2.b$a */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0098\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b!\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010\u0019R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0016\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b\u0010\u0010-R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b;\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b9\u0010\u0019¨\u0006<"}, m65681d2 = {"Loy2/b$a;", "Loy2/b$f;", "Loy2/o;", "toolbarState", "", "primaryButtonText", "secondaryButtonText", "", "isAddNoteShowing", "isCancelStudyShowing", "Loy2/g;", "cancelStudyState", "content", "", "Lyw2/b;", "devices", "isDeviceConnecting", "isRequired", "requiredRegex", "blockedRegex", "<init>", "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;)Loy2/b$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Loy2/o;", "q", "()Loy2/o;", "b", "Ljava/lang/String;", "n", "c", "p", "d", "Z", "r", "()Z", "e", "f", "Loy2/g;", "k", "()Loy2/g;", "g", "l", "Ljava/util/List;", "m", "()Ljava/util/List;", "i", "j", "s", "o", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28489o toolbarState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String primaryButtonText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String secondaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isAddNoteShowing;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isCancelStudyShowing;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C28481g cancelStudyState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<C39830b> devices;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean isDeviceConnecting;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean isRequired;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String requiredRegex;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final String blockedRegex;

        public a(C28489o toolbarState, String primaryButtonText, String str, boolean z4, boolean z13, C28481g c28481g, String str2, List<C39830b> devices, boolean z14, boolean z15, String str3, String str4) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(devices, "devices");
            this.toolbarState = toolbarState;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = str;
            this.isAddNoteShowing = z4;
            this.isCancelStudyShowing = z13;
            this.cancelStudyState = c28481g;
            this.content = str2;
            this.devices = devices;
            this.isDeviceConnecting = z14;
            this.isRequired = z15;
            this.requiredRegex = str3;
            this.blockedRegex = str4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public static /* synthetic */ a m86419i(a aVar, C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, String str3, List list, boolean z14, boolean z15, String str4, String str5, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c28489o = aVar.toolbarState;
            }
            if ((i13 & 2) != 0) {
                str = aVar.primaryButtonText;
            }
            if ((i13 & 4) != 0) {
                str2 = aVar.secondaryButtonText;
            }
            if ((i13 & 8) != 0) {
                z4 = aVar.isAddNoteShowing;
            }
            if ((i13 & 16) != 0) {
                z13 = aVar.isCancelStudyShowing;
            }
            if ((i13 & 32) != 0) {
                c28481g = aVar.cancelStudyState;
            }
            if ((i13 & 64) != 0) {
                str3 = aVar.content;
            }
            if ((i13 & 128) != 0) {
                list = aVar.devices;
            }
            if ((i13 & 256) != 0) {
                z14 = aVar.isDeviceConnecting;
            }
            if ((i13 & 512) != 0) {
                z15 = aVar.isRequired;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                str4 = aVar.requiredRegex;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                str5 = aVar.blockedRegex;
            }
            String str6 = str4;
            String str7 = str5;
            boolean z16 = z14;
            boolean z17 = z15;
            String str8 = str3;
            List list2 = list;
            boolean z18 = z13;
            C28481g c28481g2 = c28481g;
            return aVar.m86421h(c28489o, str, str2, z4, z18, c28481g2, str8, list2, z16, z17, str6, str7);
        }

        @Override // oy2.InterfaceC28476b.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsCancelStudyShowing() {
            return this.isCancelStudyShowing;
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: b */
        public /* bridge */ a mo86413b(a aVar, boolean z4) {
            return super.mo86413b(aVar, z4);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: c */
        public /* bridge */ f mo86414c(f fVar, C28481g c28481g) {
            return super.mo86414c(fVar, c28481g);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: d */
        public /* bridge */ C28481g mo86415d(CampaignStepConfigResponse campaignStepConfigResponse) {
            return super.mo86415d(campaignStepConfigResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.toolbarState, aVar.toolbarState) && AbstractC22676k.m65745e(this.primaryButtonText, aVar.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, aVar.secondaryButtonText) && this.isAddNoteShowing == aVar.isAddNoteShowing && this.isCancelStudyShowing == aVar.isCancelStudyShowing && AbstractC22676k.m65745e(this.cancelStudyState, aVar.cancelStudyState) && AbstractC22676k.m65745e(this.content, aVar.content) && AbstractC22676k.m65745e(this.devices, aVar.devices) && this.isDeviceConnecting == aVar.isDeviceConnecting && this.isRequired == aVar.isRequired && AbstractC22676k.m65745e(this.requiredRegex, aVar.requiredRegex) && AbstractC22676k.m65745e(this.blockedRegex, aVar.blockedRegex);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: f */
        public /* bridge */ f mo86417f(f fVar, boolean z4) {
            return super.mo86417f(fVar, z4);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: g */
        public /* bridge */ f mo86418g(f fVar, AbstractC28490p abstractC28490p) {
            return super.mo86418g(fVar, abstractC28490p);
        }

        /* JADX INFO: renamed from: h */
        public final a m86421h(C28489o toolbarState, String primaryButtonText, String secondaryButtonText, boolean isAddNoteShowing, boolean isCancelStudyShowing, C28481g cancelStudyState, String content, List<C39830b> devices, boolean isDeviceConnecting, boolean isRequired, String requiredRegex, String blockedRegex) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(devices, "devices");
            return new a(toolbarState, primaryButtonText, secondaryButtonText, isAddNoteShowing, isCancelStudyShowing, cancelStudyState, content, devices, isDeviceConnecting, isRequired, requiredRegex, blockedRegex);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.toolbarState.hashCode() * 31, 31, this.primaryButtonText);
            String str = this.secondaryButtonText;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.isAddNoteShowing), 31, this.isCancelStudyShowing);
            C28481g c28481g = this.cancelStudyState;
            int iHashCode = (iM8289b + (c28481g == null ? 0 : c28481g.hashCode())) * 31;
            String str2 = this.content;
            int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.devices), 31, this.isDeviceConnecting), 31, this.isRequired);
            String str3 = this.requiredRegex;
            int iHashCode2 = (iM8289b2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.blockedRegex;
            return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getBlockedRegex() {
            return this.blockedRegex;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public C28481g getCancelStudyState() {
            return this.cancelStudyState;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: m */
        public final List<C39830b> m86425m() {
            return this.devices;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getRequiredRegex() {
            return this.requiredRegex;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public C28489o getToolbarState() {
            return this.toolbarState;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public boolean getIsAddNoteShowing() {
            return this.isAddNoteShowing;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public String toString() {
            C28489o c28489o = this.toolbarState;
            String str = this.primaryButtonText;
            String str2 = this.secondaryButtonText;
            boolean z4 = this.isAddNoteShowing;
            boolean z13 = this.isCancelStudyShowing;
            C28481g c28481g = this.cancelStudyState;
            String str3 = this.content;
            List<C39830b> list = this.devices;
            boolean z14 = this.isDeviceConnecting;
            boolean z15 = this.isRequired;
            String str4 = this.requiredRegex;
            String str5 = this.blockedRegex;
            StringBuilder sb4 = new StringBuilder("CampaignBtHrStepDomainState(toolbarState=");
            sb4.append(c28489o);
            sb4.append(", primaryButtonText=");
            sb4.append(str);
            sb4.append(", secondaryButtonText=");
            AbstractC38963t7.m124390t(sb4, str2, ", isAddNoteShowing=", z4, ", isCancelStudyShowing=");
            sb4.append(z13);
            sb4.append(", cancelStudyState=");
            sb4.append(c28481g);
            sb4.append(", content=");
            AbstractC36095b.m114694v(str3, ", devices=", ", isDeviceConnecting=", sb4, list);
            AbstractC38963t7.m124392v(sb4, z14, ", isRequired=", z15, ", requiredRegex=");
            return AbstractC11266d.m30464r(sb4, str4, ", blockedRegex=", str5, ")");
        }

        public /* synthetic */ a(C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, String str3, List list, boolean z14, boolean z15, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c28489o, str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? null : c28481g, str3, (i13 & 128) != 0 ? C25271y.f99162w : list, (i13 & 256) != 0 ? false : z14, z15, str4, str5);
        }
    }

    /* JADX INFO: renamed from: oy2.b$b */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J¬\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b#\u0010/R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b7\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b=\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b?\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\b@\u0010\u001eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bA\u0010\u001eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b:\u0010<\u001a\u0004\bB\u0010\u001eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bB\u0010(\u001a\u0004\b>\u0010\u001c¨\u0006C"}, m65681d2 = {"Loy2/b$b;", "Loy2/b$f;", "Loy2/o;", "toolbarState", "", "primaryButtonText", "secondaryButtonText", "", "isAddNoteShowing", "isCancelStudyShowing", "Loy2/g;", "cancelStudyState", "userHasPickedDateTime", "isRequired", "Loy2/i;", "inputConfig", "", "year", "month", "dayOfMonth", "hour", "minutes", "content", "<init>", "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;ZZLoy2/i;IIIIILjava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;ZZLoy2/i;IIIIILjava/lang/String;)Loy2/b$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Loy2/o;", "s", "()Loy2/o;", "b", "Ljava/lang/String;", "q", "c", "r", "d", "Z", "v", "()Z", "e", "f", "Loy2/g;", "j", "()Loy2/g;", "g", "t", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "i", "Loy2/i;", "n", "()Loy2/i;", "I", "u", "k", "p", "l", "m", "o", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28489o toolbarState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String primaryButtonText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String secondaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isAddNoteShowing;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isCancelStudyShowing;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C28481g cancelStudyState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean userHasPickedDateTime;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean isRequired;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C28483i inputConfig;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final int year;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final int month;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final int dayOfMonth;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final int hour;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final int minutes;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final String content;

        public b(C28489o toolbarState, String primaryButtonText, String str, boolean z4, boolean z13, C28481g c28481g, boolean z14, boolean z15, C28483i inputConfig, int i13, int i14, int i15, int i16, int i17, String str2) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(inputConfig, "inputConfig");
            this.toolbarState = toolbarState;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = str;
            this.isAddNoteShowing = z4;
            this.isCancelStudyShowing = z13;
            this.cancelStudyState = c28481g;
            this.userHasPickedDateTime = z14;
            this.isRequired = z15;
            this.inputConfig = inputConfig;
            this.year = i13;
            this.month = i14;
            this.dayOfMonth = i15;
            this.hour = i16;
            this.minutes = i17;
            this.content = str2;
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ b m86432i(b bVar, C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, boolean z14, boolean z15, C28483i c28483i, int i13, int i14, int i15, int i16, int i17, String str3, int i18, Object obj) {
            return bVar.m86433h((i18 & 1) != 0 ? bVar.toolbarState : c28489o, (i18 & 2) != 0 ? bVar.primaryButtonText : str, (i18 & 4) != 0 ? bVar.secondaryButtonText : str2, (i18 & 8) != 0 ? bVar.isAddNoteShowing : z4, (i18 & 16) != 0 ? bVar.isCancelStudyShowing : z13, (i18 & 32) != 0 ? bVar.cancelStudyState : c28481g, (i18 & 64) != 0 ? bVar.userHasPickedDateTime : z14, (i18 & 128) != 0 ? bVar.isRequired : z15, (i18 & 256) != 0 ? bVar.inputConfig : c28483i, (i18 & 512) != 0 ? bVar.year : i13, (i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? bVar.month : i14, (i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? bVar.dayOfMonth : i15, (i18 & 4096) != 0 ? bVar.hour : i16, (i18 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? bVar.minutes : i17, (i18 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? bVar.content : str3);
        }

        @Override // oy2.InterfaceC28476b.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsCancelStudyShowing() {
            return this.isCancelStudyShowing;
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: c */
        public /* bridge */ f mo86414c(f fVar, C28481g c28481g) {
            return super.mo86414c(fVar, c28481g);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: d */
        public /* bridge */ C28481g mo86415d(CampaignStepConfigResponse campaignStepConfigResponse) {
            return super.mo86415d(campaignStepConfigResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.toolbarState, bVar.toolbarState) && AbstractC22676k.m65745e(this.primaryButtonText, bVar.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, bVar.secondaryButtonText) && this.isAddNoteShowing == bVar.isAddNoteShowing && this.isCancelStudyShowing == bVar.isCancelStudyShowing && AbstractC22676k.m65745e(this.cancelStudyState, bVar.cancelStudyState) && this.userHasPickedDateTime == bVar.userHasPickedDateTime && this.isRequired == bVar.isRequired && AbstractC22676k.m65745e(this.inputConfig, bVar.inputConfig) && this.year == bVar.year && this.month == bVar.month && this.dayOfMonth == bVar.dayOfMonth && this.hour == bVar.hour && this.minutes == bVar.minutes && AbstractC22676k.m65745e(this.content, bVar.content);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: f */
        public /* bridge */ f mo86417f(f fVar, boolean z4) {
            return super.mo86417f(fVar, z4);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: g */
        public /* bridge */ f mo86418g(f fVar, AbstractC28490p abstractC28490p) {
            return super.mo86418g(fVar, abstractC28490p);
        }

        /* JADX INFO: renamed from: h */
        public final b m86433h(C28489o toolbarState, String primaryButtonText, String secondaryButtonText, boolean isAddNoteShowing, boolean isCancelStudyShowing, C28481g cancelStudyState, boolean userHasPickedDateTime, boolean isRequired, C28483i inputConfig, int year, int month, int dayOfMonth, int hour, int minutes, String content) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(inputConfig, "inputConfig");
            return new b(toolbarState, primaryButtonText, secondaryButtonText, isAddNoteShowing, isCancelStudyShowing, cancelStudyState, userHasPickedDateTime, isRequired, inputConfig, year, month, dayOfMonth, hour, minutes, content);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.toolbarState.hashCode() * 31, 31, this.primaryButtonText);
            String str = this.secondaryButtonText;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.isAddNoteShowing), 31, this.isCancelStudyShowing);
            C28481g c28481g = this.cancelStudyState;
            int iM30448b = AbstractC11266d.m30448b(this.minutes, AbstractC11266d.m30448b(this.hour, AbstractC11266d.m30448b(this.dayOfMonth, AbstractC11266d.m30448b(this.month, AbstractC11266d.m30448b(this.year, (this.inputConfig.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (c28481g == null ? 0 : c28481g.hashCode())) * 31, 31, this.userHasPickedDateTime), 31, this.isRequired)) * 31, 31), 31), 31), 31), 31);
            String str2 = this.content;
            return iM30448b + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public C28481g getCancelStudyState() {
            return this.cancelStudyState;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final int getDayOfMonth() {
            return this.dayOfMonth;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getHour() {
            return this.hour;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final C28483i getInputConfig() {
            return this.inputConfig;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final int getMinutes() {
            return this.minutes;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final int getMonth() {
            return this.month;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public C28489o getToolbarState() {
            return this.toolbarState;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getUserHasPickedDateTime() {
            return this.userHasPickedDateTime;
        }

        public String toString() {
            C28489o c28489o = this.toolbarState;
            String str = this.primaryButtonText;
            String str2 = this.secondaryButtonText;
            boolean z4 = this.isAddNoteShowing;
            boolean z13 = this.isCancelStudyShowing;
            C28481g c28481g = this.cancelStudyState;
            boolean z14 = this.userHasPickedDateTime;
            boolean z15 = this.isRequired;
            C28483i c28483i = this.inputConfig;
            int i13 = this.year;
            int i14 = this.month;
            int i15 = this.dayOfMonth;
            int i16 = this.hour;
            int i17 = this.minutes;
            String str3 = this.content;
            StringBuilder sb4 = new StringBuilder("CampaignDateTimePickerStepDomainState(toolbarState=");
            sb4.append(c28489o);
            sb4.append(", primaryButtonText=");
            sb4.append(str);
            sb4.append(", secondaryButtonText=");
            AbstractC38963t7.m124390t(sb4, str2, ", isAddNoteShowing=", z4, ", isCancelStudyShowing=");
            sb4.append(z13);
            sb4.append(", cancelStudyState=");
            sb4.append(c28481g);
            sb4.append(", userHasPickedDateTime=");
            AbstractC38963t7.m124392v(sb4, z14, ", isRequired=", z15, ", inputConfig=");
            sb4.append(c28483i);
            sb4.append(", year=");
            sb4.append(i13);
            sb4.append(", month=");
            AbstractC30802r.m94773v(sb4, i14, ", dayOfMonth=", i15, ", hour=");
            AbstractC30802r.m94773v(sb4, i16, ", minutes=", i17, ", content=");
            return AbstractC25012a.m73376i(str3, ")", sb4);
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final int getYear() {
            return this.year;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public boolean getIsAddNoteShowing() {
            return this.isAddNoteShowing;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public /* synthetic */ b(C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, boolean z14, boolean z15, C28483i c28483i, int i13, int i14, int i15, int i16, int i17, String str3, int i18, DefaultConstructorMarker defaultConstructorMarker) {
            this(c28489o, str, (i18 & 4) != 0 ? null : str2, (i18 & 8) != 0 ? false : z4, (i18 & 16) != 0 ? false : z13, (i18 & 32) != 0 ? null : c28481g, (i18 & 64) != 0 ? false : z14, z15, (i18 & 256) != 0 ? new C28483i(null, null, null, null, null, null, 0, 127, null) : c28483i, i13, i14, i15, i16, i17, str3);
        }
    }

    /* JADX INFO: renamed from: oy2.b$g */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJÈ\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b&\u00102R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010<\u001a\u0004\b=\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b?\u0010\u001fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b@\u0010\u001fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b?\u0010+\u001a\u0004\bA\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010+\u001a\u0004\bB\u0010\u001fR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010+\u001a\u0004\bC\u0010\u001fR\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u00100\u001a\u0004\bD\u00102R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bE\u00100\u001a\u0004\bF\u00102R\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b:\u0010<\u001a\u0004\bE\u0010!R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b.\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, m65681d2 = {"Loy2/b$g;", "Loy2/b$f;", "Loy2/o;", "toolbarState", "", "primaryButtonText", "secondaryButtonText", "", "isAddNoteShowing", "isCancelStudyShowing", "Loy2/g;", "cancelStudyState", "Loy2/n;", "retryState", "", "stepId", "content", "imageUrl", "imageAlt", "typeformUrl", "typeformTitle", "typeformSubmitted", "isErrorLoading", "retryAttempt", "Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "surveyProvider", "<init>", "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Loy2/n;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILcom/whoop/whooplabs/data/domain/SurveyProvider;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Loy2/n;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILcom/whoop/whooplabs/data/domain/SurveyProvider;)Loy2/b$g;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Loy2/o;", "t", "()Loy2/o;", "b", "Ljava/lang/String;", "n", "c", "q", "d", "Z", "x", "()Z", "e", "f", "Loy2/g;", "j", "()Loy2/g;", "g", "Loy2/n;", "p", "()Loy2/n;", "I", "r", "i", "k", "m", "l", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "v", "u", "o", "y", "Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "s", "()Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28489o toolbarState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String primaryButtonText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String secondaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isAddNoteShowing;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isCancelStudyShowing;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C28481g cancelStudyState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C28488n retryState;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final int stepId;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String imageUrl;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String imageAlt;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final String typeformUrl;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final String typeformTitle;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final boolean typeformSubmitted;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final boolean isErrorLoading;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final int retryAttempt;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final SurveyProvider surveyProvider;

        public g(C28489o toolbarState, String primaryButtonText, String str, boolean z4, boolean z13, C28481g c28481g, C28488n c28488n, int i13, String str2, String str3, String str4, String typeformUrl, String typeformTitle, boolean z14, boolean z15, int i14, SurveyProvider surveyProvider) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(typeformUrl, "typeformUrl");
            AbstractC22676k.m65750j(typeformTitle, "typeformTitle");
            this.toolbarState = toolbarState;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = str;
            this.isAddNoteShowing = z4;
            this.isCancelStudyShowing = z13;
            this.cancelStudyState = c28481g;
            this.retryState = c28488n;
            this.stepId = i13;
            this.content = str2;
            this.imageUrl = str3;
            this.imageAlt = str4;
            this.typeformUrl = typeformUrl;
            this.typeformTitle = typeformTitle;
            this.typeformSubmitted = z14;
            this.isErrorLoading = z15;
            this.retryAttempt = i14;
            this.surveyProvider = surveyProvider;
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ g m86509i(g gVar, C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, C28488n c28488n, int i13, String str3, String str4, String str5, String str6, String str7, boolean z14, boolean z15, int i14, SurveyProvider surveyProvider, int i15, Object obj) {
            SurveyProvider surveyProvider2;
            int i16;
            C28489o c28489o2 = (i15 & 1) != 0 ? gVar.toolbarState : c28489o;
            String str8 = (i15 & 2) != 0 ? gVar.primaryButtonText : str;
            String str9 = (i15 & 4) != 0 ? gVar.secondaryButtonText : str2;
            boolean z16 = (i15 & 8) != 0 ? gVar.isAddNoteShowing : z4;
            boolean z17 = (i15 & 16) != 0 ? gVar.isCancelStudyShowing : z13;
            C28481g c28481g2 = (i15 & 32) != 0 ? gVar.cancelStudyState : c28481g;
            C28488n c28488n2 = (i15 & 64) != 0 ? gVar.retryState : c28488n;
            int i17 = (i15 & 128) != 0 ? gVar.stepId : i13;
            String str10 = (i15 & 256) != 0 ? gVar.content : str3;
            String str11 = (i15 & 512) != 0 ? gVar.imageUrl : str4;
            String str12 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? gVar.imageAlt : str5;
            String str13 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? gVar.typeformUrl : str6;
            String str14 = (i15 & 4096) != 0 ? gVar.typeformTitle : str7;
            boolean z18 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? gVar.typeformSubmitted : z14;
            C28489o c28489o3 = c28489o2;
            boolean z19 = (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? gVar.isErrorLoading : z15;
            int i18 = (i15 & 32768) != 0 ? gVar.retryAttempt : i14;
            if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                i16 = i18;
                surveyProvider2 = gVar.surveyProvider;
            } else {
                surveyProvider2 = surveyProvider;
                i16 = i18;
            }
            return gVar.m86510h(c28489o3, str8, str9, z16, z17, c28481g2, c28488n2, i17, str10, str11, str12, str13, str14, z18, z19, i16, surveyProvider2);
        }

        @Override // oy2.InterfaceC28476b.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsCancelStudyShowing() {
            return this.isCancelStudyShowing;
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: c */
        public /* bridge */ f mo86414c(f fVar, C28481g c28481g) {
            return super.mo86414c(fVar, c28481g);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: d */
        public /* bridge */ C28481g mo86415d(CampaignStepConfigResponse campaignStepConfigResponse) {
            return super.mo86415d(campaignStepConfigResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.toolbarState, gVar.toolbarState) && AbstractC22676k.m65745e(this.primaryButtonText, gVar.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, gVar.secondaryButtonText) && this.isAddNoteShowing == gVar.isAddNoteShowing && this.isCancelStudyShowing == gVar.isCancelStudyShowing && AbstractC22676k.m65745e(this.cancelStudyState, gVar.cancelStudyState) && AbstractC22676k.m65745e(this.retryState, gVar.retryState) && this.stepId == gVar.stepId && AbstractC22676k.m65745e(this.content, gVar.content) && AbstractC22676k.m65745e(this.imageUrl, gVar.imageUrl) && AbstractC22676k.m65745e(this.imageAlt, gVar.imageAlt) && AbstractC22676k.m65745e(this.typeformUrl, gVar.typeformUrl) && AbstractC22676k.m65745e(this.typeformTitle, gVar.typeformTitle) && this.typeformSubmitted == gVar.typeformSubmitted && this.isErrorLoading == gVar.isErrorLoading && this.retryAttempt == gVar.retryAttempt && this.surveyProvider == gVar.surveyProvider;
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: f */
        public /* bridge */ f mo86417f(f fVar, boolean z4) {
            return super.mo86417f(fVar, z4);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: g */
        public /* bridge */ f mo86418g(f fVar, AbstractC28490p abstractC28490p) {
            return super.mo86418g(fVar, abstractC28490p);
        }

        /* JADX INFO: renamed from: h */
        public final g m86510h(C28489o toolbarState, String primaryButtonText, String secondaryButtonText, boolean isAddNoteShowing, boolean isCancelStudyShowing, C28481g cancelStudyState, C28488n retryState, int stepId, String content, String imageUrl, String imageAlt, String typeformUrl, String typeformTitle, boolean typeformSubmitted, boolean isErrorLoading, int retryAttempt, SurveyProvider surveyProvider) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(typeformUrl, "typeformUrl");
            AbstractC22676k.m65750j(typeformTitle, "typeformTitle");
            return new g(toolbarState, primaryButtonText, secondaryButtonText, isAddNoteShowing, isCancelStudyShowing, cancelStudyState, retryState, stepId, content, imageUrl, imageAlt, typeformUrl, typeformTitle, typeformSubmitted, isErrorLoading, retryAttempt, surveyProvider);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.toolbarState.hashCode() * 31, 31, this.primaryButtonText);
            String str = this.secondaryButtonText;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.isAddNoteShowing), 31, this.isCancelStudyShowing);
            C28481g c28481g = this.cancelStudyState;
            int iHashCode = (iM8289b + (c28481g == null ? 0 : c28481g.hashCode())) * 31;
            C28488n c28488n = this.retryState;
            int iM30448b = AbstractC11266d.m30448b(this.stepId, (iHashCode + (c28488n == null ? 0 : c28488n.hashCode())) * 31, 31);
            String str2 = this.content;
            int iHashCode2 = (iM30448b + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.imageUrl;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.imageAlt;
            int iM30448b2 = AbstractC11266d.m30448b(this.retryAttempt, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.typeformUrl), 31, this.typeformTitle), 31, this.typeformSubmitted), 31, this.isErrorLoading), 31);
            SurveyProvider surveyProvider = this.surveyProvider;
            return iM30448b2 + (surveyProvider != null ? surveyProvider.hashCode() : 0);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public C28481g getCancelStudyState() {
            return this.cancelStudyState;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getImageAlt() {
            return this.imageAlt;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final int getRetryAttempt() {
            return this.retryAttempt;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final C28488n getRetryState() {
            return this.retryState;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final int getStepId() {
            return this.stepId;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final SurveyProvider getSurveyProvider() {
            return this.surveyProvider;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public C28489o getToolbarState() {
            return this.toolbarState;
        }

        public String toString() {
            C28489o c28489o = this.toolbarState;
            String str = this.primaryButtonText;
            String str2 = this.secondaryButtonText;
            boolean z4 = this.isAddNoteShowing;
            boolean z13 = this.isCancelStudyShowing;
            C28481g c28481g = this.cancelStudyState;
            C28488n c28488n = this.retryState;
            int i13 = this.stepId;
            String str3 = this.content;
            String str4 = this.imageUrl;
            String str5 = this.imageAlt;
            String str6 = this.typeformUrl;
            String str7 = this.typeformTitle;
            boolean z14 = this.typeformSubmitted;
            boolean z15 = this.isErrorLoading;
            int i14 = this.retryAttempt;
            SurveyProvider surveyProvider = this.surveyProvider;
            StringBuilder sb4 = new StringBuilder("CampaignStepTypeformDomainState(toolbarState=");
            sb4.append(c28489o);
            sb4.append(", primaryButtonText=");
            sb4.append(str);
            sb4.append(", secondaryButtonText=");
            AbstractC38963t7.m124390t(sb4, str2, ", isAddNoteShowing=", z4, ", isCancelStudyShowing=");
            sb4.append(z13);
            sb4.append(", cancelStudyState=");
            sb4.append(c28481g);
            sb4.append(", retryState=");
            sb4.append(c28488n);
            sb4.append(", stepId=");
            sb4.append(i13);
            sb4.append(", content=");
            AbstractC11266d.m30444B(sb4, str3, ", imageUrl=", str4, ", imageAlt=");
            AbstractC11266d.m30444B(sb4, str5, ", typeformUrl=", str6, ", typeformTitle=");
            AbstractC38963t7.m124390t(sb4, str7, ", typeformSubmitted=", z14, ", isErrorLoading=");
            AbstractC30802r.m94769r(i14, ", retryAttempt=", ", surveyProvider=", sb4, z15);
            sb4.append(surveyProvider);
            sb4.append(")");
            return sb4.toString();
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final boolean getTypeformSubmitted() {
            return this.typeformSubmitted;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getTypeformTitle() {
            return this.typeformTitle;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final String getTypeformUrl() {
            return this.typeformUrl;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public boolean getIsAddNoteShowing() {
            return this.isAddNoteShowing;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final boolean getIsErrorLoading() {
            return this.isErrorLoading;
        }

        public /* synthetic */ g(C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, C28488n c28488n, int i13, String str3, String str4, String str5, String str6, String str7, boolean z14, boolean z15, int i14, SurveyProvider surveyProvider, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(c28489o, str, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? false : z4, (i15 & 16) != 0 ? false : z13, (i15 & 32) != 0 ? null : c28481g, (i15 & 64) != 0 ? null : c28488n, i13, str3, str4, str5, str6, str7, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z14, (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z15, (i15 & 32768) != 0 ? 0 : i14, surveyProvider);
        }
    }

    /* JADX INFO: renamed from: oy2.b$c */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0012\u0012\u0006\u0010$\u001a\u00020\u0012\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0007\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\b\b\u0002\u0010*\u001a\u00020\u0007\u0012\b\b\u0002\u0010+\u001a\u00020\u0007\u0012\b\b\u0002\u0010,\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J\u008c\u0003\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u00020\u00072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u00102R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\bA\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\b9\u0010ER\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010>\u001a\u0004\bO\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bP\u0010>\u001a\u0004\bQ\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bI\u0010>\u001a\u0004\bR\u00102R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010>\u001a\u0004\bS\u00102R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bU\u00104R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bV\u0010U\u001a\u0004\bW\u00104R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010>\u001a\u0004\bY\u00102R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010>\u001a\u0004\b[\u00102R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010>\u001a\u0004\b]\u00102R\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b^\u0010C\u001a\u0004\b_\u0010ER\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b`\u0010>\u001a\u0004\ba\u00102R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bb\u0010>\u001a\u0004\bV\u00102R\u0017\u0010\u001b\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bc\u0010U\u001a\u0004\bX\u00104R\u0017\u0010\u001c\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bd\u0010U\u001a\u0004\bZ\u00104R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\be\u0010>\u001a\u0004\b`\u00102R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bf\u0010>\u001a\u0004\bb\u00102R\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010>\u001a\u0004\b^\u00102R\u0017\u0010 \u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\bi\u0010ER\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010>\u001a\u0004\b\\\u00102R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bk\u0010>\u001a\u0004\bd\u00102R\u0017\u0010#\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bR\u0010U\u001a\u0004\be\u00104R\u0017\u0010$\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bQ\u0010U\u001a\u0004\bf\u00104R\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\bj\u00102R\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010>\u001a\u0004\bk\u00102R\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bh\u00102R\u0017\u0010(\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bl\u0010C\u001a\u0004\bm\u0010ER\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010>\u001a\u0004\bg\u00102R\u0017\u0010*\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bU\u0010C\u001a\u0004\bl\u0010ER\u0017\u0010+\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bW\u0010C\u001a\u0004\bT\u0010ER\u0017\u0010,\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\ba\u0010C\u001a\u0004\bc\u0010E¨\u0006n"}, m65681d2 = {"Loy2/b$c;", "Loy2/b$f;", "Loy2/o;", "toolbarState", "", "primaryButtonText", "secondaryButtonText", "", "isAddNoteShowing", "isCancelStudyShowing", "Loy2/g;", "cancelStudyState", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "protocolStepResult", "content", "imageUrl", "imageAlt", "systolicLabel", "", "systolicMax", "systolicMin", "systolicTooHighText", "systolicTooLowText", "systolicSuffix", "isSystolicRequired", "systolicRequiredText", "diastolicLabel", "diastolicMax", "diastolicMin", "diastolicTooHighText", "diastolicTooLowText", "diastolicSuffix", "isDiastolicRequired", "diastolicRequiredText", "hrLabel", "hrMax", "hrMin", "hrTooHighText", "hrTooLowText", "hrSuffix", "isHrRequired", "hrRequiredText", "systolicHasBeenInteracted", "diastolicHasBeenInteracted", "hrHasBeenInteracted", "<init>", "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZ)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZ)Loy2/b$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Loy2/o;", "O", "()Loy2/o;", "b", "Ljava/lang/String;", "D", "c", "F", "d", "Z", "P", "()Z", "e", "f", "Loy2/g;", "j", "()Loy2/g;", "g", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "E", "()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "k", "i", "C", "B", "H", "l", "I", "m", "J", "n", "M", "o", "N", "p", "L", "q", "S", "r", "K", "s", "t", "u", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "Q", "z", "A", "G", "R", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements f {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private final String hrLabel;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private final int hrMax;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private final int hrMin;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        private final String hrTooHighText;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        private final String hrTooLowText;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final String hrSuffix;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private final boolean isHrRequired;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        private final String hrRequiredText;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        private final boolean systolicHasBeenInteracted;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        private final boolean diastolicHasBeenInteracted;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        private final boolean hrHasBeenInteracted;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28489o toolbarState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String primaryButtonText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String secondaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isAddNoteShowing;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isCancelStudyShowing;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C28481g cancelStudyState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final ProtocolStepResult protocolStepResult;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String imageUrl;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String imageAlt;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String systolicLabel;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final int systolicMax;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final int systolicMin;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final String systolicTooHighText;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final String systolicTooLowText;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final String systolicSuffix;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final boolean isSystolicRequired;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final String systolicRequiredText;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final String diastolicLabel;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final int diastolicMax;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final int diastolicMin;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final String diastolicTooHighText;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final String diastolicTooLowText;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final String diastolicSuffix;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final boolean isDiastolicRequired;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        private final String diastolicRequiredText;

        public c(C28489o toolbarState, String primaryButtonText, String str, boolean z4, boolean z13, C28481g c28481g, ProtocolStepResult protocolStepResult, String str2, String str3, String str4, String systolicLabel, int i13, int i14, String systolicTooHighText, String systolicTooLowText, String systolicSuffix, boolean z14, String systolicRequiredText, String diastolicLabel, int i15, int i16, String diastolicTooHighText, String diastolicTooLowText, String diastolicSuffix, boolean z15, String diastolicRequiredText, String hrLabel, int i17, int i18, String hrTooHighText, String hrTooLowText, String hrSuffix, boolean z16, String hrRequiredText, boolean z17, boolean z18, boolean z19) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(protocolStepResult, "protocolStepResult");
            AbstractC22676k.m65750j(systolicLabel, "systolicLabel");
            AbstractC22676k.m65750j(systolicTooHighText, "systolicTooHighText");
            AbstractC22676k.m65750j(systolicTooLowText, "systolicTooLowText");
            AbstractC22676k.m65750j(systolicSuffix, "systolicSuffix");
            AbstractC22676k.m65750j(systolicRequiredText, "systolicRequiredText");
            AbstractC22676k.m65750j(diastolicLabel, "diastolicLabel");
            AbstractC22676k.m65750j(diastolicTooHighText, "diastolicTooHighText");
            AbstractC22676k.m65750j(diastolicTooLowText, "diastolicTooLowText");
            AbstractC22676k.m65750j(diastolicSuffix, "diastolicSuffix");
            AbstractC22676k.m65750j(diastolicRequiredText, "diastolicRequiredText");
            AbstractC22676k.m65750j(hrLabel, "hrLabel");
            AbstractC22676k.m65750j(hrTooHighText, "hrTooHighText");
            AbstractC22676k.m65750j(hrTooLowText, "hrTooLowText");
            AbstractC22676k.m65750j(hrSuffix, "hrSuffix");
            AbstractC22676k.m65750j(hrRequiredText, "hrRequiredText");
            this.toolbarState = toolbarState;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = str;
            this.isAddNoteShowing = z4;
            this.isCancelStudyShowing = z13;
            this.cancelStudyState = c28481g;
            this.protocolStepResult = protocolStepResult;
            this.content = str2;
            this.imageUrl = str3;
            this.imageAlt = str4;
            this.systolicLabel = systolicLabel;
            this.systolicMax = i13;
            this.systolicMin = i14;
            this.systolicTooHighText = systolicTooHighText;
            this.systolicTooLowText = systolicTooLowText;
            this.systolicSuffix = systolicSuffix;
            this.isSystolicRequired = z14;
            this.systolicRequiredText = systolicRequiredText;
            this.diastolicLabel = diastolicLabel;
            this.diastolicMax = i15;
            this.diastolicMin = i16;
            this.diastolicTooHighText = diastolicTooHighText;
            this.diastolicTooLowText = diastolicTooLowText;
            this.diastolicSuffix = diastolicSuffix;
            this.isDiastolicRequired = z15;
            this.diastolicRequiredText = diastolicRequiredText;
            this.hrLabel = hrLabel;
            this.hrMax = i17;
            this.hrMin = i18;
            this.hrTooHighText = hrTooHighText;
            this.hrTooLowText = hrTooLowText;
            this.hrSuffix = hrSuffix;
            this.isHrRequired = z16;
            this.hrRequiredText = hrRequiredText;
            this.systolicHasBeenInteracted = z17;
            this.diastolicHasBeenInteracted = z18;
            this.hrHasBeenInteracted = z19;
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ c m86448i(c cVar, C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, ProtocolStepResult protocolStepResult, String str3, String str4, String str5, String str6, int i13, int i14, String str7, String str8, String str9, boolean z14, String str10, String str11, int i15, int i16, String str12, String str13, String str14, boolean z15, String str15, String str16, int i17, int i18, String str17, String str18, String str19, boolean z16, String str20, boolean z17, boolean z18, boolean z19, int i19, int i24, Object obj) {
            boolean z24;
            boolean z25;
            C28489o c28489o2 = (i19 & 1) != 0 ? cVar.toolbarState : c28489o;
            String str21 = (i19 & 2) != 0 ? cVar.primaryButtonText : str;
            String str22 = (i19 & 4) != 0 ? cVar.secondaryButtonText : str2;
            boolean z26 = (i19 & 8) != 0 ? cVar.isAddNoteShowing : z4;
            boolean z27 = (i19 & 16) != 0 ? cVar.isCancelStudyShowing : z13;
            C28481g c28481g2 = (i19 & 32) != 0 ? cVar.cancelStudyState : c28481g;
            ProtocolStepResult protocolStepResult2 = (i19 & 64) != 0 ? cVar.protocolStepResult : protocolStepResult;
            String str23 = (i19 & 128) != 0 ? cVar.content : str3;
            String str24 = (i19 & 256) != 0 ? cVar.imageUrl : str4;
            String str25 = (i19 & 512) != 0 ? cVar.imageAlt : str5;
            String str26 = (i19 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? cVar.systolicLabel : str6;
            int i25 = (i19 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? cVar.systolicMax : i13;
            int i26 = (i19 & 4096) != 0 ? cVar.systolicMin : i14;
            String str27 = (i19 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? cVar.systolicTooHighText : str7;
            C28489o c28489o3 = c28489o2;
            String str28 = (i19 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? cVar.systolicTooLowText : str8;
            String str29 = (i19 & 32768) != 0 ? cVar.systolicSuffix : str9;
            boolean z28 = (i19 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? cVar.isSystolicRequired : z14;
            String str30 = (i19 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? cVar.systolicRequiredText : str10;
            String str31 = (i19 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? cVar.diastolicLabel : str11;
            int i27 = (i19 & 524288) != 0 ? cVar.diastolicMax : i15;
            int i28 = (i19 & 1048576) != 0 ? cVar.diastolicMin : i16;
            String str32 = (i19 & 2097152) != 0 ? cVar.diastolicTooHighText : str12;
            String str33 = (i19 & 4194304) != 0 ? cVar.diastolicTooLowText : str13;
            String str34 = (i19 & 8388608) != 0 ? cVar.diastolicSuffix : str14;
            boolean z29 = (i19 & 16777216) != 0 ? cVar.isDiastolicRequired : z15;
            String str35 = (i19 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? cVar.diastolicRequiredText : str15;
            String str36 = (i19 & 67108864) != 0 ? cVar.hrLabel : str16;
            int i29 = (i19 & 134217728) != 0 ? cVar.hrMax : i17;
            int i34 = (i19 & 268435456) != 0 ? cVar.hrMin : i18;
            String str37 = (i19 & 536870912) != 0 ? cVar.hrTooHighText : str17;
            String str38 = (i19 & 1073741824) != 0 ? cVar.hrTooLowText : str18;
            String str39 = (i19 & Integer.MIN_VALUE) != 0 ? cVar.hrSuffix : str19;
            boolean z34 = (i24 & 1) != 0 ? cVar.isHrRequired : z16;
            String str40 = (i24 & 2) != 0 ? cVar.hrRequiredText : str20;
            boolean z35 = (i24 & 4) != 0 ? cVar.systolicHasBeenInteracted : z17;
            boolean z36 = (i24 & 8) != 0 ? cVar.diastolicHasBeenInteracted : z18;
            if ((i24 & 16) != 0) {
                z25 = z36;
                z24 = cVar.hrHasBeenInteracted;
            } else {
                z24 = z19;
                z25 = z36;
            }
            return cVar.m86468h(c28489o3, str21, str22, z26, z27, c28481g2, protocolStepResult2, str23, str24, str25, str26, i25, i26, str27, str28, str29, z28, str30, str31, i27, i28, str32, str33, str34, z29, str35, str36, i29, i34, str37, str38, str39, z34, str40, z35, z25, z24);
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final String getHrTooLowText() {
            return this.hrTooLowText;
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final String getImageAlt() {
            return this.imageAlt;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final ProtocolStepResult getProtocolStepResult() {
            return this.protocolStepResult;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final boolean getSystolicHasBeenInteracted() {
            return this.systolicHasBeenInteracted;
        }

        /* JADX INFO: renamed from: H, reason: from getter */
        public final String getSystolicLabel() {
            return this.systolicLabel;
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final int getSystolicMax() {
            return this.systolicMax;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final int getSystolicMin() {
            return this.systolicMin;
        }

        /* JADX INFO: renamed from: K, reason: from getter */
        public final String getSystolicRequiredText() {
            return this.systolicRequiredText;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final String getSystolicSuffix() {
            return this.systolicSuffix;
        }

        /* JADX INFO: renamed from: M, reason: from getter */
        public final String getSystolicTooHighText() {
            return this.systolicTooHighText;
        }

        /* JADX INFO: renamed from: N, reason: from getter */
        public final String getSystolicTooLowText() {
            return this.systolicTooLowText;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public C28489o getToolbarState() {
            return this.toolbarState;
        }

        /* JADX INFO: renamed from: P, reason: from getter */
        public boolean getIsAddNoteShowing() {
            return this.isAddNoteShowing;
        }

        /* JADX INFO: renamed from: Q, reason: from getter */
        public final boolean getIsDiastolicRequired() {
            return this.isDiastolicRequired;
        }

        /* JADX INFO: renamed from: R, reason: from getter */
        public final boolean getIsHrRequired() {
            return this.isHrRequired;
        }

        /* JADX INFO: renamed from: S, reason: from getter */
        public final boolean getIsSystolicRequired() {
            return this.isSystolicRequired;
        }

        @Override // oy2.InterfaceC28476b.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsCancelStudyShowing() {
            return this.isCancelStudyShowing;
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: c */
        public /* bridge */ f mo86414c(f fVar, C28481g c28481g) {
            return super.mo86414c(fVar, c28481g);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: d */
        public /* bridge */ C28481g mo86415d(CampaignStepConfigResponse campaignStepConfigResponse) {
            return super.mo86415d(campaignStepConfigResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.toolbarState, cVar.toolbarState) && AbstractC22676k.m65745e(this.primaryButtonText, cVar.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, cVar.secondaryButtonText) && this.isAddNoteShowing == cVar.isAddNoteShowing && this.isCancelStudyShowing == cVar.isCancelStudyShowing && AbstractC22676k.m65745e(this.cancelStudyState, cVar.cancelStudyState) && AbstractC22676k.m65745e(this.protocolStepResult, cVar.protocolStepResult) && AbstractC22676k.m65745e(this.content, cVar.content) && AbstractC22676k.m65745e(this.imageUrl, cVar.imageUrl) && AbstractC22676k.m65745e(this.imageAlt, cVar.imageAlt) && AbstractC22676k.m65745e(this.systolicLabel, cVar.systolicLabel) && this.systolicMax == cVar.systolicMax && this.systolicMin == cVar.systolicMin && AbstractC22676k.m65745e(this.systolicTooHighText, cVar.systolicTooHighText) && AbstractC22676k.m65745e(this.systolicTooLowText, cVar.systolicTooLowText) && AbstractC22676k.m65745e(this.systolicSuffix, cVar.systolicSuffix) && this.isSystolicRequired == cVar.isSystolicRequired && AbstractC22676k.m65745e(this.systolicRequiredText, cVar.systolicRequiredText) && AbstractC22676k.m65745e(this.diastolicLabel, cVar.diastolicLabel) && this.diastolicMax == cVar.diastolicMax && this.diastolicMin == cVar.diastolicMin && AbstractC22676k.m65745e(this.diastolicTooHighText, cVar.diastolicTooHighText) && AbstractC22676k.m65745e(this.diastolicTooLowText, cVar.diastolicTooLowText) && AbstractC22676k.m65745e(this.diastolicSuffix, cVar.diastolicSuffix) && this.isDiastolicRequired == cVar.isDiastolicRequired && AbstractC22676k.m65745e(this.diastolicRequiredText, cVar.diastolicRequiredText) && AbstractC22676k.m65745e(this.hrLabel, cVar.hrLabel) && this.hrMax == cVar.hrMax && this.hrMin == cVar.hrMin && AbstractC22676k.m65745e(this.hrTooHighText, cVar.hrTooHighText) && AbstractC22676k.m65745e(this.hrTooLowText, cVar.hrTooLowText) && AbstractC22676k.m65745e(this.hrSuffix, cVar.hrSuffix) && this.isHrRequired == cVar.isHrRequired && AbstractC22676k.m65745e(this.hrRequiredText, cVar.hrRequiredText) && this.systolicHasBeenInteracted == cVar.systolicHasBeenInteracted && this.diastolicHasBeenInteracted == cVar.diastolicHasBeenInteracted && this.hrHasBeenInteracted == cVar.hrHasBeenInteracted;
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: f */
        public /* bridge */ f mo86417f(f fVar, boolean z4) {
            return super.mo86417f(fVar, z4);
        }

        @Override // oy2.InterfaceC28476b
        /* JADX INFO: renamed from: g */
        public /* bridge */ f mo86418g(f fVar, AbstractC28490p abstractC28490p) {
            return super.mo86418g(fVar, abstractC28490p);
        }

        /* JADX INFO: renamed from: h */
        public final c m86468h(C28489o toolbarState, String primaryButtonText, String secondaryButtonText, boolean isAddNoteShowing, boolean isCancelStudyShowing, C28481g cancelStudyState, ProtocolStepResult protocolStepResult, String content, String imageUrl, String imageAlt, String systolicLabel, int systolicMax, int systolicMin, String systolicTooHighText, String systolicTooLowText, String systolicSuffix, boolean isSystolicRequired, String systolicRequiredText, String diastolicLabel, int diastolicMax, int diastolicMin, String diastolicTooHighText, String diastolicTooLowText, String diastolicSuffix, boolean isDiastolicRequired, String diastolicRequiredText, String hrLabel, int hrMax, int hrMin, String hrTooHighText, String hrTooLowText, String hrSuffix, boolean isHrRequired, String hrRequiredText, boolean systolicHasBeenInteracted, boolean diastolicHasBeenInteracted, boolean hrHasBeenInteracted) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(protocolStepResult, "protocolStepResult");
            AbstractC22676k.m65750j(systolicLabel, "systolicLabel");
            AbstractC22676k.m65750j(systolicTooHighText, "systolicTooHighText");
            AbstractC22676k.m65750j(systolicTooLowText, "systolicTooLowText");
            AbstractC22676k.m65750j(systolicSuffix, "systolicSuffix");
            AbstractC22676k.m65750j(systolicRequiredText, "systolicRequiredText");
            AbstractC22676k.m65750j(diastolicLabel, "diastolicLabel");
            AbstractC22676k.m65750j(diastolicTooHighText, "diastolicTooHighText");
            AbstractC22676k.m65750j(diastolicTooLowText, "diastolicTooLowText");
            AbstractC22676k.m65750j(diastolicSuffix, "diastolicSuffix");
            AbstractC22676k.m65750j(diastolicRequiredText, "diastolicRequiredText");
            AbstractC22676k.m65750j(hrLabel, "hrLabel");
            AbstractC22676k.m65750j(hrTooHighText, "hrTooHighText");
            AbstractC22676k.m65750j(hrTooLowText, "hrTooLowText");
            AbstractC22676k.m65750j(hrSuffix, "hrSuffix");
            AbstractC22676k.m65750j(hrRequiredText, "hrRequiredText");
            return new c(toolbarState, primaryButtonText, secondaryButtonText, isAddNoteShowing, isCancelStudyShowing, cancelStudyState, protocolStepResult, content, imageUrl, imageAlt, systolicLabel, systolicMax, systolicMin, systolicTooHighText, systolicTooLowText, systolicSuffix, isSystolicRequired, systolicRequiredText, diastolicLabel, diastolicMax, diastolicMin, diastolicTooHighText, diastolicTooLowText, diastolicSuffix, isDiastolicRequired, diastolicRequiredText, hrLabel, hrMax, hrMin, hrTooHighText, hrTooLowText, hrSuffix, isHrRequired, hrRequiredText, systolicHasBeenInteracted, diastolicHasBeenInteracted, hrHasBeenInteracted);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.toolbarState.hashCode() * 31, 31, this.primaryButtonText);
            String str = this.secondaryButtonText;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.isAddNoteShowing), 31, this.isCancelStudyShowing);
            C28481g c28481g = this.cancelStudyState;
            int iHashCode = (this.protocolStepResult.hashCode() + ((iM8289b + (c28481g == null ? 0 : c28481g.hashCode())) * 31)) * 31;
            String str2 = this.content;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.imageUrl;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.imageAlt;
            return Boolean.hashCode(this.hrHasBeenInteracted) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.hrMin, AbstractC11266d.m30448b(this.hrMax, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.diastolicMin, AbstractC11266d.m30448b(this.diastolicMax, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.systolicMin, AbstractC11266d.m30448b(this.systolicMax, AbstractC11266d.m30450d((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.systolicLabel), 31), 31), 31, this.systolicTooHighText), 31, this.systolicTooLowText), 31, this.systolicSuffix), 31, this.isSystolicRequired), 31, this.systolicRequiredText), 31, this.diastolicLabel), 31), 31), 31, this.diastolicTooHighText), 31, this.diastolicTooLowText), 31, this.diastolicSuffix), 31, this.isDiastolicRequired), 31, this.diastolicRequiredText), 31, this.hrLabel), 31), 31), 31, this.hrTooHighText), 31, this.hrTooLowText), 31, this.hrSuffix), 31, this.isHrRequired), 31, this.hrRequiredText), 31, this.systolicHasBeenInteracted), 31, this.diastolicHasBeenInteracted);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public C28481g getCancelStudyState() {
            return this.cancelStudyState;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getDiastolicHasBeenInteracted() {
            return this.diastolicHasBeenInteracted;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getDiastolicLabel() {
            return this.diastolicLabel;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getDiastolicMax() {
            return this.diastolicMax;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final int getDiastolicMin() {
            return this.diastolicMin;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getDiastolicRequiredText() {
            return this.diastolicRequiredText;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getDiastolicSuffix() {
            return this.diastolicSuffix;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getDiastolicTooHighText() {
            return this.diastolicTooHighText;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getDiastolicTooLowText() {
            return this.diastolicTooLowText;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getHrHasBeenInteracted() {
            return this.hrHasBeenInteracted;
        }

        public String toString() {
            C28489o c28489o = this.toolbarState;
            String str = this.primaryButtonText;
            String str2 = this.secondaryButtonText;
            boolean z4 = this.isAddNoteShowing;
            boolean z13 = this.isCancelStudyShowing;
            C28481g c28481g = this.cancelStudyState;
            ProtocolStepResult protocolStepResult = this.protocolStepResult;
            String str3 = this.content;
            String str4 = this.imageUrl;
            String str5 = this.imageAlt;
            String str6 = this.systolicLabel;
            int i13 = this.systolicMax;
            int i14 = this.systolicMin;
            String str7 = this.systolicTooHighText;
            String str8 = this.systolicTooLowText;
            String str9 = this.systolicSuffix;
            boolean z14 = this.isSystolicRequired;
            String str10 = this.systolicRequiredText;
            String str11 = this.diastolicLabel;
            int i15 = this.diastolicMax;
            int i16 = this.diastolicMin;
            String str12 = this.diastolicTooHighText;
            String str13 = this.diastolicTooLowText;
            String str14 = this.diastolicSuffix;
            boolean z15 = this.isDiastolicRequired;
            String str15 = this.diastolicRequiredText;
            String str16 = this.hrLabel;
            int i17 = this.hrMax;
            int i18 = this.hrMin;
            String str17 = this.hrTooHighText;
            String str18 = this.hrTooLowText;
            String str19 = this.hrSuffix;
            boolean z16 = this.isHrRequired;
            String str20 = this.hrRequiredText;
            boolean z17 = this.systolicHasBeenInteracted;
            boolean z18 = this.diastolicHasBeenInteracted;
            boolean z19 = this.hrHasBeenInteracted;
            StringBuilder sb4 = new StringBuilder("CampaignMysticFormDomainState(toolbarState=");
            sb4.append(c28489o);
            sb4.append(", primaryButtonText=");
            sb4.append(str);
            sb4.append(", secondaryButtonText=");
            AbstractC38963t7.m124390t(sb4, str2, ", isAddNoteShowing=", z4, ", isCancelStudyShowing=");
            sb4.append(z13);
            sb4.append(", cancelStudyState=");
            sb4.append(c28481g);
            sb4.append(", protocolStepResult=");
            sb4.append(protocolStepResult);
            sb4.append(", content=");
            sb4.append(str3);
            sb4.append(", imageUrl=");
            AbstractC11266d.m30444B(sb4, str4, ", imageAlt=", str5, ", systolicLabel=");
            AbstractC11266d.m30470x(i13, str6, ", systolicMax=", ", systolicMin=", sb4);
            AbstractC11895b.m31979B(i14, ", systolicTooHighText=", str7, ", systolicTooLowText=", sb4);
            AbstractC11266d.m30444B(sb4, str8, ", systolicSuffix=", str9, ", isSystolicRequired=");
            AbstractC38963t7.m124391u(sb4, z14, ", systolicRequiredText=", str10, ", diastolicLabel=");
            AbstractC11266d.m30470x(i15, str11, ", diastolicMax=", ", diastolicMin=", sb4);
            AbstractC11895b.m31979B(i16, ", diastolicTooHighText=", str12, ", diastolicTooLowText=", sb4);
            AbstractC11266d.m30444B(sb4, str13, ", diastolicSuffix=", str14, ", isDiastolicRequired=");
            AbstractC38963t7.m124391u(sb4, z15, ", diastolicRequiredText=", str15, ", hrLabel=");
            AbstractC11266d.m30470x(i17, str16, ", hrMax=", ", hrMin=", sb4);
            AbstractC11895b.m31979B(i18, ", hrTooHighText=", str17, ", hrTooLowText=", sb4);
            AbstractC11266d.m30444B(sb4, str18, ", hrSuffix=", str19, ", isHrRequired=");
            AbstractC38963t7.m124391u(sb4, z16, ", hrRequiredText=", str20, ", systolicHasBeenInteracted=");
            AbstractC38963t7.m124392v(sb4, z17, ", diastolicHasBeenInteracted=", z18, ", hrHasBeenInteracted=");
            return AbstractC18489d0.m53372m(sb4, z19, ")");
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final String getHrLabel() {
            return this.hrLabel;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final int getHrMax() {
            return this.hrMax;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final int getHrMin() {
            return this.hrMin;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getHrRequiredText() {
            return this.hrRequiredText;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getHrSuffix() {
            return this.hrSuffix;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getHrTooHighText() {
            return this.hrTooHighText;
        }

        public /* synthetic */ c(C28489o c28489o, String str, String str2, boolean z4, boolean z13, C28481g c28481g, ProtocolStepResult protocolStepResult, String str3, String str4, String str5, String str6, int i13, int i14, String str7, String str8, String str9, boolean z14, String str10, String str11, int i15, int i16, String str12, String str13, String str14, boolean z15, String str15, String str16, int i17, int i18, String str17, String str18, String str19, boolean z16, String str20, boolean z17, boolean z18, boolean z19, int i19, int i24, DefaultConstructorMarker defaultConstructorMarker) {
            this(c28489o, str, (i19 & 4) != 0 ? null : str2, (i19 & 8) != 0 ? false : z4, (i19 & 16) != 0 ? false : z13, (i19 & 32) != 0 ? null : c28481g, protocolStepResult, str3, str4, str5, str6, i13, i14, str7, str8, str9, z14, str10, str11, i15, i16, str12, str13, str14, z15, str15, str16, i17, i18, str17, str18, str19, z16, str20, (i24 & 4) != 0 ? false : z17, (i24 & 8) != 0 ? false : z18, (i24 & 16) != 0 ? false : z19);
        }
    }
}
