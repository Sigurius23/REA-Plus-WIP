package h80;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c80.AbstractC4300a;
import c93.InterfaceC4351m;
import ch.C4588i;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.steps.PaymentMethodStepModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f70.InterfaceC14176e;
import fi0.InterfaceC14515a;
import hf1.InterfaceC17235b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: h80.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0007\b\u0001\u0018\u0000 Z2\u00020\u0001:\u0003RPNB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u000fJ#\u0010\u0013\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u000fJ#\u0010\u0014\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u000fJ\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J-\u0010#\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010$J+\u0010'\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020%2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020)*\u00020%H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0002¢\u0006\u0004\b.\u0010/JI\u00105\u001a\u00020\r2\u0006\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u000b2\b\u00102\u001a\u0004\u0018\u00010\u000b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0004\b5\u00106JY\u00109\u001a\u00020\r2\u0006\u00100\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u000b2\b\u00102\u001a\u0004\u0018\u00010\u000b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0004\b9\u0010:JC\u0010;\u001a\u00020\r2\u0006\u00100\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0002¢\u0006\u0004\b;\u0010<JC\u0010=\u001a\u00020\r2\u0006\u00100\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0002¢\u0006\u0004\b=\u0010<JC\u0010>\u001a\u00020\r2\u0006\u00100\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0002¢\u0006\u0004\b>\u0010<J3\u0010?\u001a\u00020\r2\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0002¢\u0006\u0004\b?\u0010@J#\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u00100\u001a\u00020\u000bH\u0002¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u0004\u0018\u00010\u000b*\u00020\u000bH\u0002¢\u0006\u0004\bC\u0010DJ\u001d\u0010G\u001a\u0004\u0018\u00010\u000b*\u00020\u000b2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u0004\u0018\u00010\u000b*\u00020\u000bH\u0002¢\u0006\u0004\bI\u0010DJ\u0015\u0010J\u001a\u0004\u0018\u00010\u000b*\u00020\u000bH\u0002¢\u0006\u0004\bJ\u0010DJ\u0015\u0010L\u001a\u0004\u0018\u00010\u000b*\u00020KH\u0002¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010V¨\u0006["}, m65681d2 = {"Lh80/c;", "", "Lfi0/a;", "analytics", "Lhf1/b;", "experimentsChecker", "Lbc3/c0;", "coroutineScope", "<init>", "(Lfi0/a;Lhf1/b;Lbc3/c0;)V", "", "", "extraOtherProperties", "Ll83/a0;", "C", "(Ljava/util/Map;)V", "eventProperties", "F", "G", "A", "B", "errorTag", "D", "(Ljava/lang/String;)V", "Lec3/l;", "Lf70/e;", "activationDomainResult", "Lh80/c$a;", "o", "(Lec3/l;)Lec3/l;", "Lh80/b;", NotificationCompat.CATEGORY_EVENT, "p", "(Lh80/b;)V", "fallbackFlowValue", "E", "(Ljava/util/Map;Ljava/lang/String;)V", "Lh80/d;", "additionalProperties", "t", "(Lh80/d;Ljava/util/Map;)V", "Lh80/c$c;", "L", "(Lh80/d;)Lh80/c$c;", "experimentName", "variant", "r", "(Ljava/lang/String;Ljava/lang/String;)V", "screenName", "value", "category", "otherProps", "eventName", "y", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "action", "label", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "u", "v", "s", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "n", "(Ljava/lang/String;)Ljava/util/Map;", "H", "(Ljava/lang/String;)Ljava/lang/String;", "", "isCta", "J", "(Ljava/lang/String;Z)Ljava/lang/String;", "K", "I", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "m", "(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;)Ljava/lang/String;", "a", "Lfi0/a;", "b", "Lhf1/b;", "c", "Lbc3/c0;", "", "d", "Ljava/util/Map;", "beExtraOtherProperties", "e", "errorExtraProperties", "f", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17003c {

    /* JADX INFO: renamed from: f */
    private static final b f65341f = new b(null);

    /* JADX INFO: renamed from: g */
    public static final int f65342g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map<String, String> beExtraOtherProperties;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Map<String, String> errorExtraProperties;

    /* JADX INFO: renamed from: h80.c$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lh80/c$a;", "", "", "screenName", "value", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String category;

        public a(String screenName, String str, String str2) {
            AbstractC22676k.m65750j(screenName, "screenName");
            this.screenName = screenName;
            this.value = str;
            this.category = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.screenName, aVar.screenName) && AbstractC22676k.m65745e(this.value, aVar.value) && AbstractC22676k.m65745e(this.category, aVar.category);
        }

        public int hashCode() {
            int iHashCode = this.screenName.hashCode() * 31;
            String str = this.value;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.category;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.category, ")", AbstractC11895b.m32001t("AnalyticsViewParams(screenName=", this.screenName, ", value=", this.value, ", category="));
        }
    }

    /* JADX INFO: renamed from: h80.c$b */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, m65681d2 = {"Lh80/c$b;", "", "<init>", "()V", "", "ACTIVATION_FLOW", "Ljava/lang/String;", "AUTH_FLOW", "SCREEN_NAME", "PASSWORD_EXPERIMENT", "FORGOT_PASSWORD_SCREEN_NAME", "RESET_PASSWORD_CHALLENGE_SCREEN_NAME", "ONBOARDING_FLOW_PROPERTY_KEY", "ONBOARDING_FLOW_HW_ONLY_VALUE", "ONBOARDING_FLOW_MEDICARE_VALUE", "ONBOARDING_FLOW_AL_ONLY_VALUE", "ONBOARDING_FLOW_ACCOUNT_TRANSITION_VALUE", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: h80.c$c */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b \u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b!\u0010\rR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010\u0013¨\u0006$"}, m65681d2 = {"Lh80/c$c;", "", "", "screenName", "action", "label", "value", "source", "", "extras", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "a", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "()Ljava/util/Map;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScreenName", "getAction", "getLabel", "getValue", "getSource", "Ljava/util/Map;", "getExtras", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Map<String, Object> extras;

        public c(String screenName, String action, String label, String str, String source, Map<String, ? extends Object> extras) {
            AbstractC22676k.m65750j(screenName, "screenName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(extras, "extras");
            this.screenName = screenName;
            this.action = action;
            this.label = label;
            this.value = str;
            this.source = source;
            this.extras = extras;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.screenName, cVar.screenName) && AbstractC22676k.m65745e(this.action, cVar.action) && AbstractC22676k.m65745e(this.label, cVar.label) && AbstractC22676k.m65745e(this.value, cVar.value) && AbstractC22676k.m65745e(this.source, cVar.source) && AbstractC22676k.m65745e(this.extras, cVar.extras);
        }

        /* JADX INFO: renamed from: f */
        public final Map<String, Object> m47950f() {
            return this.extras;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.screenName.hashCode() * 31, 31, this.action), 31, this.label);
            String str = this.value;
            return this.extras.hashCode() + AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.source);
        }

        public String toString() {
            String str = this.screenName;
            String str2 = this.action;
            String str3 = this.label;
            String str4 = this.value;
            String str5 = this.source;
            Map<String, Object> map = this.extras;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("PasswordManagerWire(screenName=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", value=", str4, ", source=");
            return AbstractC30007c.m91842l(sbM32001t, str5, ", extras=", map, ")");
        }
    }

    /* JADX INFO: renamed from: h80.c$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f65357w;

        /* JADX INFO: renamed from: h80.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f65358w;

            /* JADX INFO: renamed from: h80.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.activation.presentation.analytics.ActivationAnalyticsHelper$produceAnalyticsScreenNameFlow$$inlined$filterIsInstance$1$2", m100430f = "ActivationAnalyticsHelper.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41685a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f65360F;

                /* JADX INFO: renamed from: G */
                Object f65361G;

                /* JADX INFO: renamed from: H */
                int f65362H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f65363w;

                /* JADX INFO: renamed from: x */
                int f65364x;

                /* JADX INFO: renamed from: y */
                Object f65365y;

                /* JADX INFO: renamed from: z */
                Object f65366z;

                public C41685a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f65363w = obj;
                    this.f65364x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f65358w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41685a c41685a;
                if (interfaceC30057d instanceof C41685a) {
                    c41685a = (C41685a) interfaceC30057d;
                    int i13 = c41685a.f65364x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41685a.f65364x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41685a = new C41685a(interfaceC30057d);
                    }
                } else {
                    c41685a = new C41685a(interfaceC30057d);
                }
                Object obj2 = c41685a.f65363w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41685a.f65364x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f65358w;
                    if (obj instanceof InterfaceC14176e.b) {
                        c41685a.f65365y = null;
                        c41685a.f65366z = null;
                        c41685a.f65360F = null;
                        c41685a.f65361G = null;
                        c41685a.f65362H = 0;
                        c41685a.f65364x = 1;
                        if (interfaceC13062m.emit(obj, c41685a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC13058l interfaceC13058l) {
            this.f65357w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f65357w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h80.c$e */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f65367w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17003c f65368x;

        /* JADX INFO: renamed from: h80.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f65369w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17003c f65370x;

            /* JADX INFO: renamed from: h80.c$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes6.dex */
            @InterfaceC32271e(m100429c = "com.whoop.activation.presentation.analytics.ActivationAnalyticsHelper$produceAnalyticsScreenNameFlow$$inlined$map$1$2", m100430f = "ActivationAnalyticsHelper.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41686a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f65371E;

                /* JADX INFO: renamed from: F */
                Object f65372F;

                /* JADX INFO: renamed from: G */
                Object f65373G;

                /* JADX INFO: renamed from: H */
                int f65374H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f65375w;

                /* JADX INFO: renamed from: x */
                int f65376x;

                /* JADX INFO: renamed from: y */
                Object f65377y;

                public C41686a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f65375w = obj;
                    this.f65376x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C17003c c17003c) {
                this.f65369w = interfaceC13062m;
                this.f65370x = c17003c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41686a c41686a;
                List<ActivationFlowStepModel> listM40428m;
                ActivationFlowStepModel activationFlowStepModel;
                if (interfaceC30057d instanceof C41686a) {
                    c41686a = (C41686a) interfaceC30057d;
                    int i13 = c41686a.f65376x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41686a.f65376x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41686a = new C41686a(interfaceC30057d);
                    }
                } else {
                    c41686a = new C41686a(interfaceC30057d);
                }
                Object obj2 = c41686a.f65375w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41686a.f65376x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f65369w;
                    InterfaceC14176e.b bVar = (InterfaceC14176e.b) obj;
                    a aVar = (bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getStepTotal() == 0 || AbstractC4300a.m13542a(bVar.getSignUpSource()) || (listM40428m = bVar.m40428m()) == null || (activationFlowStepModel = (ActivationFlowStepModel) AbstractC25265s.m74102I0(bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex(), listM40428m)) == null) ? null : new a(activationFlowStepModel.getAnalyticsName(), this.f65370x.m47922m(activationFlowStepModel), AbstractC17001a.m47874a(activationFlowStepModel));
                    c41686a.f65377y = null;
                    c41686a.f65371E = null;
                    c41686a.f65372F = null;
                    c41686a.f65373G = null;
                    c41686a.f65374H = 0;
                    c41686a.f65376x = 1;
                    if (interfaceC13062m.emit(aVar, c41686a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public e(InterfaceC13058l interfaceC13058l, C17003c c17003c) {
            this.f65367w = interfaceC13058l;
            this.f65368x = c17003c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f65367w.collect(new a(interfaceC13062m, this.f65368x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h80.c$f */
    @InterfaceC32271e(m100429c = "com.whoop.activation.presentation.analytics.ActivationAnalyticsHelper$recordAnalyticsEvent$1", m100430f = "ActivationAnalyticsHelper.kt", m100431l = {119}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65379w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC17002b f65381y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC17002b interfaceC17002b, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f65381y = interfaceC17002b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C17003c.this.new f(this.f65381y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objMo48744c;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f65379w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC17235b interfaceC17235b = C17003c.this.experimentsChecker;
                this.f65379w = 1;
                objMo48744c = interfaceC17235b.mo48744c(this);
                if (objMo48744c == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objMo48744c = obj;
            }
            LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0((Map) objMo48744c, C17003c.this.beExtraOtherProperties);
            InterfaceC17002b interfaceC17002b = this.f65381y;
            boolean z4 = interfaceC17002b instanceof InterfaceC17002b.j;
            Map<String, Object> map = C25272z.f99163w;
            if (z4) {
                Map<String, Object> mapM47901b = ((InterfaceC17002b.j) interfaceC17002b).m47901b();
                if (mapM47901b != null) {
                    map = mapM47901b;
                }
                C17003c.m47933z(C17003c.this, ((InterfaceC17002b.j) this.f65381y).getScreenName(), ((InterfaceC17002b.j) this.f65381y).getValue(), ((InterfaceC17002b.j) this.f65381y).getCategory(), AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(linkedHashMapM73995d0, map), C17003c.this.m47923n(((InterfaceC17002b.j) this.f65381y).getScreenName())), null, 16, null);
            } else if (interfaceC17002b instanceof InterfaceC17002b.i) {
                Map<String, Object> mapM47896c = ((InterfaceC17002b.i) interfaceC17002b).m47896c();
                if (mapM47896c != null) {
                    map = mapM47896c;
                }
                C17003c.m47931x(C17003c.this, ((InterfaceC17002b.i) this.f65381y).getScreenName(), ((InterfaceC17002b.i) this.f65381y).getAction(), ((InterfaceC17002b.i) this.f65381y).getLabel(), ((InterfaceC17002b.i) this.f65381y).getValue(), ((InterfaceC17002b.i) this.f65381y).getCategory(), AbstractC25247g0.m73995d0(linkedHashMapM73995d0, map), null, 64, null);
            } else if (interfaceC17002b instanceof InterfaceC17002b.d) {
                C17003c.this.m47926s(((InterfaceC17002b.d) interfaceC17002b).getScreenName(), ((InterfaceC17002b.d) this.f65381y).getValue(), linkedHashMapM73995d0);
            } else if (interfaceC17002b instanceof InterfaceC17002b.a) {
                C17003c.this.m47924q(((InterfaceC17002b.a) interfaceC17002b).getScreenName(), ((InterfaceC17002b.a) this.f65381y).getLabel(), ((InterfaceC17002b.a) this.f65381y).getValue(), ((InterfaceC17002b.a) this.f65381y).getCategory(), linkedHashMapM73995d0);
            } else if (interfaceC17002b instanceof InterfaceC17002b.g) {
                C17003c.this.m47928u(((InterfaceC17002b.g) interfaceC17002b).getScreenName(), ((InterfaceC17002b.g) this.f65381y).getLabel(), ((InterfaceC17002b.g) this.f65381y).getValue(), ((InterfaceC17002b.g) this.f65381y).getCategory(), linkedHashMapM73995d0);
            } else if (interfaceC17002b instanceof InterfaceC17002b.h) {
                C17003c.this.m47929v(((InterfaceC17002b.h) interfaceC17002b).getScreenName(), ((InterfaceC17002b.h) this.f65381y).getLabel(), ((InterfaceC17002b.h) this.f65381y).getValue(), ((InterfaceC17002b.h) this.f65381y).getCategory(), linkedHashMapM73995d0);
            } else if (interfaceC17002b instanceof InterfaceC17002b.b) {
                C17003c.this.m47925r(((InterfaceC17002b.b) interfaceC17002b).getExperimentName(), ((InterfaceC17002b.b) this.f65381y).getVariant());
            } else if (interfaceC17002b instanceof InterfaceC17002b.c) {
                String str = ((InterfaceC17002b.c) interfaceC17002b).getIsPasswordResetChallenge() ? "reset_password_challenge" : "forgot_password";
                C17003c.this.m47932y(str, null, "authentication", AbstractC25247g0.m73995d0(linkedHashMapM73995d0, C17003c.this.m47923n(str)), ((InterfaceC17002b.c) this.f65381y).getIsPasswordResetChallenge() ? "Auth Flow" : "Activation Flow");
            } else if (interfaceC17002b instanceof InterfaceC17002b.f) {
                C17003c.this.m47930w("reset_password_challenge", ((InterfaceC17002b.f) interfaceC17002b).getAction(), HMSTrackSource.SCREEN, null, "authentication", linkedHashMapM73995d0, "Auth Flow");
            } else {
                if (!(interfaceC17002b instanceof InterfaceC17002b.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                C17003c.this.m47927t(((InterfaceC17002b.e) interfaceC17002b).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), linkedHashMapM73995d0);
            }
            return C23454a0.f92919a;
        }
    }

    public C17003c(InterfaceC14515a analytics, InterfaceC17235b experimentsChecker, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.analytics = analytics;
        this.experimentsChecker = experimentsChecker;
        this.coroutineScope = coroutineScope;
        this.beExtraOtherProperties = new LinkedHashMap();
        this.errorExtraProperties = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: E */
    private final void m47904E(Map<String, String> eventProperties, String fallbackFlowValue) {
        this.beExtraOtherProperties.clear();
        if (eventProperties == null) {
            eventProperties = C25272z.f99163w;
        }
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(eventProperties);
        linkedHashMapM74003l0.putIfAbsent("onboarding-flow", fallbackFlowValue);
        this.beExtraOtherProperties.putAll(linkedHashMapM74003l0);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x00df A[RETURN] */
    /* JADX INFO: renamed from: H */
    private final String m47905H(String str) {
        switch (str) {
            case "permissions_opt_in":
                return "permissions";
            case "profile_height_weight":
                return "profile";
            case "profile_gender":
                return "profile";
            case "payment_method":
                return "membership";
            case "device_edu_strap":
                return "device_education";
            case "location_country":
                return "account_creation";
            case "push_notifications":
                return "permissions";
            case "enter_password":
                return "account_creation";
            case "refer_a_friend":
                return "refer_a_friend";
            case "email_password":
            case "location_state":
                return "account_creation";
            case "payment_method_billing":
                return "membership";
            case "device_edu_bluetooth":
                return "device_education";
            case "name_username":
                return "account_creation";
            case "device_edu_battery":
                return "device_education";
            case "family_plan_block":
                return "account_creation";
            case "no_password":
                return "account_creation";
            case "device_edu_set_up":
                return "device_education";
            case "permissions_google_health_connect":
                return "permissions";
            case "profile_birthday":
                return "profile";
            case "email_only":
                return "account_creation";
            case "refer_a_friend_codes":
                return "refer_a_friend";
            case "log_in_screen":
                return "member_account";
            case "reset_password_challenge":
                return "authentication";
            case "device_edu_wake_up":
                return "device_education";
            case "create_password":
                return "account_creation";
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: I */
    private final String m47906I(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1029412550) {
            if (str.equals("payment_method")) {
                return "payment_details";
            }
            return null;
        }
        if (iHashCode == 1230624851) {
            if (str.equals("profile_birthday")) {
                return "picker";
            }
            return null;
        }
        if (iHashCode == 1656415627 && str.equals("log_in_screen")) {
            return "text_input_field";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:58:0x009c A[RETURN] */
    /* JADX INFO: renamed from: J */
    private final String m47907J(String str, boolean z4) {
        if (!z4) {
            return null;
        }
        switch (str) {
            case "permissions_opt_in":
                return "accept_terms";
            case "profile_gender":
                return "next";
            case "payment_method":
                return "next";
            case "device_edu_strap":
                return "next";
            case "location_country":
                return "next";
            case "refer_a_friend":
                return "get_codes";
            case "email_password":
                return "next";
            case "location_state":
                return "next";
            case "device_edu_bluetooth":
                return "start_pairing";
            case "device_edu_battery":
                return "next";
            case "device_edu_set_up":
                return "get_started";
            case "permissions_google_health_connect":
                return "connect";
            case "profile_birthday":
                return "next";
            case "device_edu_wake_up":
                return "next";
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: K */
    private final String m47908K(String str) {
        if (AbstractC22676k.m65745e(str, "permissions_google_health_connect")) {
            return "android_only";
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    private final c m47909L(InterfaceC17004d interfaceC17004d) {
        boolean z4 = interfaceC17004d instanceof InterfaceC17004d.b;
        C25272z c25272z = C25272z.f99163w;
        if (z4) {
            String analyticsName = EnumC17007g.EnterPassword.getAnalyticsName();
            InterfaceC17004d.b bVar = (InterfaceC17004d.b) interfaceC17004d;
            String analyticsValue = bVar.getResult().getAnalyticsValue();
            String failureReason = bVar.getFailureReason();
            Map mapM95645u = failureReason != null ? AbstractC31061c.m95645u("failure_reason", failureReason) : null;
            return new c(analyticsName, "retrieve", "credential_manager", analyticsValue, "auto_retrieve", mapM95645u == null ? c25272z : mapM95645u);
        }
        if (interfaceC17004d instanceof InterfaceC17004d.d) {
            InterfaceC17004d.d dVar = (InterfaceC17004d.d) interfaceC17004d;
            return new c(EnumC17007g.EnterPassword.getAnalyticsName(), "sign_in", dVar.getMode().getLabel(), null, dVar.getMode().getSource(), c25272z);
        }
        if (interfaceC17004d instanceof InterfaceC17004d.a) {
            InterfaceC17004d.a aVar = (InterfaceC17004d.a) interfaceC17004d;
            return new c(EnumC17007g.EnterPassword.getAnalyticsName(), "sign_in", aVar.getMode().getLabel(), (aVar.getSuccess() ? EnumC17006f.Success : EnumC17006f.Failure).getAnalyticsValue(), aVar.getMode().getSource(), c25272z);
        }
        if (!(interfaceC17004d instanceof InterfaceC17004d.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC17004d.c cVar = (InterfaceC17004d.c) interfaceC17004d;
        return new c(cVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getAnalyticsName(), ProfileAnalyticsKt.SAVE, "credential_manager", cVar.getResult().getAnalyticsValue(), "save_on_continue", c25272z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final String m47922m(ActivationFlowStepModel activationFlowStepModel) {
        if (activationFlowStepModel instanceof PaymentMethodStepModel) {
            return ((PaymentMethodStepModel) activationFlowStepModel).getAnalyticsValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final Map<String, String> m47923n(String screenName) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (AbstractC22676k.m65745e(screenName, "payment_method")) {
            linkedHashMap.putAll(this.errorExtraProperties);
            this.errorExtraProperties.clear();
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m47924q(String screenName, String label, String value, String category, Map<String, ? extends Object> otherProps) {
        this.analytics.mo41422d(category, "error", label, "Activation Flow", value, AbstractC25247g0.m73995d0(AbstractC25247g0.m73989X(new C23465k("screen_name", screenName)), otherProps));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m47925r(String experimentName, String variant) {
        InterfaceC14515a.m41418i(this.analytics, null, "assignment", null, "Activation Experiment Assignment", null, AbstractC25247g0.m73990Y(new C23465k("experiment_name", experimentName), new C23465k("variant", variant)), 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m47926s(String screenName, String value, Map<String, ? extends Object> otherProps) {
        InterfaceC14515a interfaceC14515a = this.analytics;
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(AbstractC25247g0.m73989X(new C23465k("screen_name", screenName)), otherProps);
        interfaceC14515a.mo41422d(m47905H(screenName), "input", m47906I(screenName), "Activation Flow", value, linkedHashMapM73995d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final void m47927t(InterfaceC17004d event, Map<String, ? extends Object> additionalProperties) {
        c cVarM47909L = m47909L(event);
        String screenName = cVarM47909L.getScreenName();
        String action = cVarM47909L.getAction();
        String label = cVarM47909L.getLabel();
        String value = cVarM47909L.getValue();
        String source = cVarM47909L.getSource();
        this.analytics.mo41422d("Auth", action, label, "Password Manager", value, AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(additionalProperties, AbstractC25247g0.m73990Y(new C23465k("screen_name", screenName), new C23465k("source", source))), cVarM47909L.m47950f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m47928u(String screenName, String label, String value, String category, Map<String, ? extends Object> otherProps) {
        this.analytics.mo41422d(category, "scroll", label, "Activation Flow", value, AbstractC25247g0.m73995d0(AbstractC25247g0.m73989X(new C23465k("screen_name", screenName)), otherProps));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final void m47929v(String screenName, String label, String value, String category, Map<String, ? extends Object> otherProps) {
        this.analytics.mo41422d(category, "share", label, "Activation Flow", value, AbstractC25247g0.m73995d0(AbstractC25247g0.m73989X(new C23465k("screen_name", screenName)), otherProps));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m47930w(String screenName, String action, String label, String value, String category, Map<String, ? extends Object> otherProps, String eventName) {
        InterfaceC14515a interfaceC14515a = this.analytics;
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(AbstractC25247g0.m73989X(new C23465k("screen_name", screenName)), otherProps);
        if (value == null) {
            value = m47907J(screenName, AbstractC22676k.m65745e(label, "cta"));
        }
        if (category == null) {
            category = m47905H(screenName);
        }
        interfaceC14515a.mo41422d(category, action, label, eventName, value, linkedHashMapM73995d0);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m47931x(C17003c c17003c, String str, String str2, String str3, String str4, String str5, Map map, String str6, int i13, Object obj) {
        c17003c.m47930w(str, str2, str3, str4, str5, map, (i13 & 64) != 0 ? "Activation Flow" : str6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final void m47932y(String screenName, String value, String category, Map<String, ? extends Object> otherProps, String eventName) {
        InterfaceC14515a interfaceC14515a = this.analytics;
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(AbstractC25247g0.m73989X(new C23465k("screen_name", screenName)), otherProps);
        if (value == null) {
            value = m47908K(screenName);
        }
        String str = value;
        if (category == null) {
            category = m47905H(screenName);
        }
        interfaceC14515a.mo41422d(category, ProfileAnalyticsKt.VIEW, HMSTrackSource.SCREEN, eventName, str, linkedHashMapM73995d0);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m47933z(C17003c c17003c, String str, String str2, String str3, Map map, String str4, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            str4 = "Activation Flow";
        }
        c17003c.m47932y(str, str2, str3, map, str4);
    }

    /* JADX INFO: renamed from: A */
    public final void m47934A(Map<String, String> eventProperties) {
        m47904E(eventProperties, "account_transition");
    }

    /* JADX INFO: renamed from: B */
    public final void m47935B(Map<String, String> eventProperties) {
        m47904E(eventProperties, "al_only");
    }

    /* JADX INFO: renamed from: C */
    public final void m47936C(Map<String, String> extraOtherProperties) {
        this.beExtraOtherProperties.clear();
        if (extraOtherProperties != null) {
            this.beExtraOtherProperties.putAll(extraOtherProperties);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m47937D(String errorTag) {
        AbstractC22676k.m65750j(errorTag, "errorTag");
        this.errorExtraProperties.clear();
        this.errorExtraProperties.put("error", errorTag);
    }

    /* JADX INFO: renamed from: F */
    public final void m47938F(Map<String, String> eventProperties) {
        m47904E(eventProperties, "hw_only");
    }

    /* JADX INFO: renamed from: G */
    public final void m47939G(Map<String, String> eventProperties) {
        m47904E(eventProperties, "medicare");
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m47940o(InterfaceC13058l activationDomainResult) {
        AbstractC22676k.m65750j(activationDomainResult, "activationDomainResult");
        return new C4588i(AbstractC13091v.m36610t(new e(new d(activationDomainResult), this)), 2);
    }

    /* JADX INFO: renamed from: p */
    public final void m47941p(InterfaceC17002b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new f(event, null), 3);
    }
}
