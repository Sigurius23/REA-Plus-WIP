package b80;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c80.AbstractC4300a;
import c93.InterfaceC4351m;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserSessionDto;
import f70.C14201q0;
import f70.InterfaceC14176e;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import hf1.InterfaceC17235b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.C25272z;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: b80.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0002A?B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJa\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010#\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b,\u0010*J\u001d\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b.\u0010*J%\u00101\u001a\u00020\u00142\u0006\u00100\u001a\u00020/2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b5\u00104J\u0015\u00106\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b6\u00104J\u001d\u00107\u001a\u00020\u00142\u0006\u0010%\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b7\u0010'J%\u00109\u001a\u00020\u00142\u0006\u0010\f\u001a\u0002082\u0006\u0010%\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b9\u0010:J-\u0010=\u001a\u00020\u00142\u0006\u0010<\u001a\u00020;2\u0006\u0010-\u001a\u00020\n2\u0006\u0010%\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010E¨\u0006G"}, m65681d2 = {"Lb80/c;", "", "Lfi0/a;", "analytics", "Lhf1/b;", "experimentsChecker", "Lbc3/c0;", "coroutineScope", "<init>", "(Lfi0/a;Lhf1/b;Lbc3/c0;)V", "", "screenName", "action", "label", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "signUpSource", "category", "value", "", "otherProps", "Ll83/a0;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "d", "(Ljava/lang/String;Lcom/whoop/activation/iajf/domain/SignUpSource;)Ljava/util/Map;", "Lf70/e;", "domainResult", "r", "(Lf70/e;Lcom/whoop/activation/iajf/domain/SignUpSource;)V", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "currentScreen", "Lf70/q0;", "memberInfo", "", "isSkipAction", "p", "(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lf70/q0;Lcom/whoop/activation/iajf/domain/SignUpSource;Z)V", "optedIn", "m", "(ZLcom/whoop/activation/iajf/domain/SignUpSource;)V", "country", "g", "(Ljava/lang/String;Lcom/whoop/activation/iajf/domain/SignUpSource;)V", "state", "s", NotificationCompat.CATEGORY_EMAIL, "k", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "commitmentType", "n", "(Lcom/whoop/activation/domain/models/steps/CommitmentType;Lf70/q0;Lcom/whoop/activation/iajf/domain/SignUpSource;)V", "o", "(Lcom/whoop/activation/iajf/domain/SignUpSource;)V", "l", "q", "i", "Lb80/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lb80/a;ZLcom/whoop/activation/iajf/domain/SignUpSource;)V", "Lb80/b;", "result", "j", "(Lb80/b;Ljava/lang/String;ZLcom/whoop/activation/iajf/domain/SignUpSource;)V", "a", "Lfi0/a;", "b", "Lhf1/b;", "c", "Lbc3/c0;", "Ljava/lang/String;", "lastViewedScreen", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2792c {

    /* JADX INFO: renamed from: e */
    private static final a f10953e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f10954f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String lastViewedScreen;

    /* JADX INFO: renamed from: b80.c$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, m65681d2 = {"Lb80/c$a;", "", "<init>", "()V", "", "IN_APP_JOIN_FLOW_EVENT", "Ljava/lang/String;", "SOURCE_VALUE", "ACCOUNT_CREATION_CATEGORY", "AUTHENTICATION_CATEGORY", "CHECK_OPT_IN_KEY", "EMAIL_PROP", "VALUE_NEXT", "SIGN_UP_SOURCE_KEY", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: b80.c$b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0082\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B1\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000fj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m65681d2 = {"Lb80/c$b;", "", "", "", "analyticsNames", "screenName", "category", "viewLabel", "<init>", "(Ljava/lang/String;ILjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/Set;", "getAnalyticsNames", "()Ljava/util/Set;", "Ljava/lang/String;", "getScreenName", "()Ljava/lang/String;", "getCategory", "getViewLabel", "Companion", "a", "GET_STARTED", "EMAIL_ONLY", "COUNTRY", "STATE", "MEMBER_OPTIONS", "SET_PASSWORD", "NAME_USERNAME", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        GET_STARTED(AbstractC12350b.m34570S("get_started_with_whoop"), "get_started_with_whoop", null, HMSTrackSource.SCREEN),
        EMAIL_ONLY(AbstractC12350b.m34570S("email_only"), "email_only", "account_creation", HMSTrackSource.SCREEN),
        COUNTRY(AbstractC25260n.m74059b1(new String[]{"location_country", "select_country"}), "location_country", "account_creation", HMSTrackSource.SCREEN),
        STATE(AbstractC25260n.m74059b1(new String[]{"location_state", "select_state"}), "location_state", "account_creation", HMSTrackSource.SCREEN),
        MEMBER_OPTIONS(AbstractC12350b.m34570S("member_options"), "member_options", null, HMSTrackSource.SCREEN),
        SET_PASSWORD(AbstractC25260n.m74059b1(new String[]{"set_up_your_password", "enter_password", "create_password"}), "set_up_your_password", "account_creation", HMSTrackSource.SCREEN),
        NAME_USERNAME(AbstractC25260n.m74059b1(new String[]{"name_username", "create_account"}), "name_username", "account_creation", HMSTrackSource.SCREEN);

        private final Set<String> analyticsNames;
        private final String category;
        private final String screenName;
        private final String viewLabel;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b80.c$b$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lb80/c$b$a;", "", "<init>", "()V", "", "name", "Lb80/c$b;", "a", "(Ljava/lang/String;)Lb80/c$b;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final b m7952a(String name) {
                AbstractC22676k.m65750j(name, "name");
                for (b bVar : b.values()) {
                    if (bVar.getAnalyticsNames().contains(name)) {
                        return bVar;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        b(Set set, String str, String str2, String str3) {
            this.analyticsNames = set;
            this.screenName = str;
            this.category = str2;
            this.viewLabel = str3;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final Set<String> getAnalyticsNames() {
            return this.analyticsNames;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getScreenName() {
            return this.screenName;
        }

        public final String getViewLabel() {
            return this.viewLabel;
        }
    }

    /* JADX INFO: renamed from: b80.c$c */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10959a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f10960b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f10961c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f10962d;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.GET_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.EMAIL_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.SET_PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.NAME_USERNAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10959a = iArr;
            int[] iArr2 = new int[CommitmentType.values().length];
            try {
                iArr2[CommitmentType.TRIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CommitmentType.JOIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CommitmentType.JOIN_ONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f10960b = iArr2;
            int[] iArr3 = new int[EnumC2790a.values().length];
            try {
                iArr3[EnumC2790a.IGNORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[EnumC2790a.UPDATE_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f10961c = iArr3;
            int[] iArr4 = new int[EnumC2791b.values().length];
            try {
                iArr4[EnumC2791b.EXISTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[EnumC2791b.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f10962d = iArr4;
        }
    }

    /* JADX INFO: renamed from: b80.c$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.iajf.analytics.IAJFAnalyticsHelper$sendEvent$1", m100430f = "IAJFAnalyticsHelper.kt", m100431l = {296}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f10963E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f10964F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f10965G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ SignUpSource f10966H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ Map<String, Object> f10967I;

        /* JADX INFO: renamed from: w */
        int f10968w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f10970y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f10971z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, String str4, String str5, SignUpSource signUpSource, Map<String, ? extends Object> map, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f10970y = str;
            this.f10971z = str2;
            this.f10963E = str3;
            this.f10964F = str4;
            this.f10965G = str5;
            this.f10966H = signUpSource;
            this.f10967I = map;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C2792c.this.new d(this.f10970y, this.f10971z, this.f10963E, this.f10964F, this.f10965G, this.f10966H, this.f10967I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f10968w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC17235b interfaceC17235b = C2792c.this.experimentsChecker;
                this.f10968w = 1;
                obj = interfaceC17235b.mo48744c(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C2792c.this.analytics.mo41422d(this.f10970y, this.f10971z, this.f10963E, "In App Join Flow", this.f10964F, AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(C2792c.this.m7936d(this.f10965G, this.f10966H), (Map) obj), this.f10967I));
            return C23454a0.f92919a;
        }
    }

    public C2792c(InterfaceC14515a analytics, InterfaceC17235b experimentsChecker, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.analytics = analytics;
        this.experimentsChecker = experimentsChecker;
        this.coroutineScope = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final Map<String, Object> m7936d(String screenName, SignUpSource signUpSource) {
        C23465k c23465k = new C23465k("screen_name", screenName);
        C23465k c23465k2 = new C23465k("source", "in_app_join_flow");
        String lowerCase = signUpSource.name().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return AbstractC25247g0.m73990Y(c23465k, c23465k2, new C23465k("sign_up_source", lowerCase));
    }

    /* JADX INFO: renamed from: e */
    private final void m7937e(String screenName, String action, String label, SignUpSource signUpSource, String category, String value, Map<String, ? extends Object> otherProps) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(category, action, label, value, screenName, signUpSource, otherProps, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m7938f(C2792c c2792c, String str, String str2, String str3, SignUpSource signUpSource, String str4, String str5, Map map, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            str4 = null;
        }
        if ((i13 & 32) != 0) {
            str5 = null;
        }
        if ((i13 & 64) != 0) {
            map = C25272z.f99163w;
        }
        c2792c.m7937e(str, str2, str3, signUpSource, str4, str5, map);
    }

    /* JADX INFO: renamed from: g */
    public final void m7939g(String country, SignUpSource signUpSource) {
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        if (AbstractC4300a.m13542a(signUpSource)) {
            m7938f(this, b.COUNTRY.getScreenName(), "cta", "country_picker", signUpSource, "account_creation", null, AbstractC31061c.m95645u("country", country), 32, null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7940h(EnumC2790a action, boolean optedIn, SignUpSource signUpSource) {
        String str;
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        int i13 = c.f10961c[action.ordinal()];
        if (i13 == 1) {
            str = "ignore";
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "update_email";
        }
        m7937e(b.EMAIL_ONLY.getScreenName(), "tap", "cta", signUpSource, "authentication", str, AbstractC36095b.m114688p(Boolean.valueOf(optedIn), "check_opt_in"));
    }

    /* JADX INFO: renamed from: i */
    public final void m7941i(boolean optedIn, SignUpSource signUpSource) {
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        m7937e(b.EMAIL_ONLY.getScreenName(), "error", "error", signUpSource, "authentication", "confirm_your_email", AbstractC36095b.m114688p(Boolean.valueOf(optedIn), "check_opt_in"));
    }

    /* JADX INFO: renamed from: j */
    public final void m7942j(EnumC2791b result, String email, boolean optedIn, SignUpSource signUpSource) {
        String str;
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        int i13 = c.f10962d[result.ordinal()];
        if (i13 == 1) {
            str = "existing_email";
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "new_email";
        }
        String str2 = str;
        m7938f(this, b.EMAIL_ONLY.getScreenName(), "input", str2, signUpSource, "account_creation", null, AbstractC25247g0.m73990Y(new C23465k(NotificationCompat.CATEGORY_EMAIL, email), new C23465k("check_opt_in", Boolean.valueOf(optedIn))), 32, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m7943k(String email, SignUpSource signUpSource) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        if (AbstractC4300a.m13542a(signUpSource)) {
            m7938f(this, b.EMAIL_ONLY.getScreenName(), "input", NotificationCompat.CATEGORY_EMAIL, signUpSource, "account_creation", null, AbstractC31061c.m95645u(NotificationCompat.CATEGORY_EMAIL, email), 32, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m7944l(SignUpSource signUpSource) {
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        if (AbstractC4300a.m13542a(signUpSource)) {
            m7938f(this, b.SET_PASSWORD.getScreenName(), "input", "existing_account", signUpSource, "account_creation", null, null, 96, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m7945m(boolean optedIn, SignUpSource signUpSource) {
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        if (AbstractC4300a.m13542a(signUpSource)) {
            m7938f(this, b.EMAIL_ONLY.getScreenName(), "checked", "marketing_opt_in", signUpSource, "account_creation", optedIn ? UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE : UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, null, 64, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m7946n(CommitmentType commitmentType, C14201q0 memberInfo, SignUpSource signUpSource) {
        String str;
        AbstractC22676k.m65750j(commitmentType, "commitmentType");
        AbstractC22676k.m65750j(memberInfo, "memberInfo");
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        if (AbstractC4300a.m13542a(signUpSource)) {
            int i13 = c.f10960b[commitmentType.ordinal()];
            if (i13 == 1) {
                str = "try_whoop_for_free";
            } else {
                if (i13 != 2 && i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "choose_your_membership";
            }
            String str2 = str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String value = memberInfo.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue();
            if (!AbstractC39414r.m125890i0(value)) {
                linkedHashMap.put(NotificationCompat.CATEGORY_EMAIL, value);
            }
            m7937e(b.MEMBER_OPTIONS.getScreenName(), "cta", "cta", signUpSource, null, str2, linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7947o(SignUpSource signUpSource) {
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        if (AbstractC4300a.m13542a(signUpSource)) {
            m7938f(this, b.SET_PASSWORD.getScreenName(), "error", "inline_error", signUpSource, "authentication", "email_password_incorrect", null, 64, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m7948p(ActivationFlowStepModel currentScreen, C14201q0 memberInfo, SignUpSource signUpSource, boolean isSkipAction) {
        String analyticsName;
        AbstractC22676k.m65750j(memberInfo, "memberInfo");
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        if (!AbstractC4300a.m13542a(signUpSource) || isSkipAction || currentScreen == null || (analyticsName = currentScreen.getAnalyticsName()) == null) {
            return;
        }
        b bVarM7952a = b.INSTANCE.m7952a(analyticsName);
        int i13 = bVarM7952a == null ? -1 : c.f10959a[bVarM7952a.ordinal()];
        if (i13 == 1) {
            m7938f(this, b.GET_STARTED.getScreenName(), "cta", "cta", signUpSource, null, "next", null, 80, null);
            return;
        }
        if (i13 == 2) {
            m7937e(b.EMAIL_ONLY.getScreenName(), "tap", "cta", signUpSource, "account_creation", "next", AbstractC36095b.m114688p(Boolean.valueOf(memberInfo.getMarketingOptIn()), "check_opt_in"));
            return;
        }
        C25272z c25272z = C25272z.f99163w;
        if (i13 == 3) {
            m7937e(b.SET_PASSWORD.getScreenName(), "tap", "cta", signUpSource, "account_creation", "next", c25272z);
        } else {
            if (i13 != 4) {
                return;
            }
            m7937e(b.NAME_USERNAME.getScreenName(), "tap", "cta", signUpSource, "account_creation", "next", c25272z);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m7949q(SignUpSource signUpSource) {
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        if (AbstractC4300a.m13542a(signUpSource)) {
            m7938f(this, b.SET_PASSWORD.getScreenName(), "input", "provisional_account", signUpSource, "account_creation", null, null, 96, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m7950r(InterfaceC14176e domainResult, SignUpSource signUpSource) {
        String strM7955c;
        b bVarM7952a;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        if (!AbstractC4300a.m13542a(signUpSource)) {
            this.lastViewedScreen = null;
            return;
        }
        InterfaceC14176e.b bVar = domainResult instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) domainResult : null;
        if (bVar == null || !AbstractC2793d.m7956d(bVar) || (strM7955c = AbstractC2793d.m7955c(bVar)) == null || strM7955c.equals(this.lastViewedScreen) || (bVarM7952a = b.INSTANCE.m7952a(strM7955c)) == null) {
            return;
        }
        m7938f(this, bVarM7952a.getScreenName(), ProfileAnalyticsKt.VIEW, bVarM7952a.getViewLabel(), signUpSource, bVarM7952a.getCategory(), null, C25272z.f99163w, 32, null);
        this.lastViewedScreen = strM7955c;
    }

    /* JADX INFO: renamed from: s */
    public final void m7951s(String state, SignUpSource signUpSource) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        if (AbstractC4300a.m13542a(signUpSource)) {
            m7938f(this, b.STATE.getScreenName(), "cta", "state_picker", signUpSource, "account_creation", null, AbstractC31061c.m95645u("state", state), 32, null);
        }
    }
}
