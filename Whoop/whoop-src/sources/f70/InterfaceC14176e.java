package f70;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.activation.domain.interactors.activation.SubscriptionError;
import com.whoop.activation.domain.models.ActivationFlowCountry;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.domain.model.AuthMaterial;
import com.whoop.navigation.C9598e;
import com.whoop.service.network.model.PasswordRequirement;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import n70.C26418e;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: f70.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lf70/e;", "", "a", "b", "Lf70/e$a;", "Lf70/e$b;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14176e {

    /* JADX INFO: renamed from: f70.e$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/e$a;", "Lf70/e;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC14176e {

        /* JADX INFO: renamed from: a */
        public static final a f51223a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: f70.e$b */
    @Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$Jè\u0001\u0010%\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b>\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bC\u0010ER\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b:\u0010@\u001a\u0004\bF\u0010BR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b7\u0010IR\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010BR\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bL\u0010@\u001a\u0004\bM\u0010BR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b5\u0010N\u001a\u0004\bO\u0010PR%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b1\u0010Q\u001a\u0004\b<\u0010RR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bK\u0010S\u001a\u0004\bT\u0010UR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00028\u0006¢\u0006\f\n\u0004\bM\u00100\u001a\u0004\bL\u00102R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bT\u0010V\u001a\u0004\bJ\u0010WR\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bO\u0010X\u001a\u0004\bG\u0010Y¨\u0006Z"}, m65681d2 = {"Lf70/e$b;", "Lf70/e;", "", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "screens", "Ln70/e;", NotificationCompat.CATEGORY_PROGRESS, "Lcom/whoop/activation/domain/models/ActivationFlowCountry;", "countries", "Lf70/q0;", "memberInfo", "Lf70/b0;", "fullScreenState", "", "isProgressButtonError", "Lf70/n0;", "loginErrorType", "isProgressButtonLoading", "Lcom/whoop/domain/model/AuthMaterial;", "authMaterial", "shouldAskForNotificationsPermissions", "shouldDismissError", "Lcom/whoop/activation/domain/interactors/activation/SubscriptionError;", "subscriptionError", "", "", "experimentProperties", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "signUpSource", "Lcom/whoop/service/network/model/PasswordRequirement;", "passwordRequirements", "Lf70/u0;", "passwordPolicyError", "Lcom/whoop/navigation/e;", "onComplete", "<init>", "(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;)V", "a", "(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;)Lf70/e$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "m", "()Ljava/util/List;", "b", "Ln70/e;", "l", "()Ln70/e;", "c", "d", "Lf70/q0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lf70/q0;", "e", "Lf70/b0;", "f", "()Lf70/b0;", "Z", "r", "()Z", "g", "Lf70/n0;", "()Lf70/n0;", "s", "i", "Lcom/whoop/domain/model/AuthMaterial;", "()Lcom/whoop/domain/model/AuthMaterial;", "j", "n", "k", "o", "Lcom/whoop/activation/domain/interactors/activation/SubscriptionError;", "q", "()Lcom/whoop/activation/domain/interactors/activation/SubscriptionError;", "Ljava/util/Map;", "()Ljava/util/Map;", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "p", "()Lcom/whoop/activation/iajf/domain/SignUpSource;", "Lf70/u0;", "()Lf70/u0;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC14176e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<ActivationFlowStepModel> screens;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C26418e progress;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<ActivationFlowCountry> countries;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C14201q0 memberInfo;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC14168b0 fullScreenState;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isProgressButtonError;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final EnumC14195n0 loginErrorType;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean isProgressButtonLoading;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final AuthMaterial authMaterial;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean shouldAskForNotificationsPermissions;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final boolean shouldDismissError;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final SubscriptionError subscriptionError;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final Map<String, String> experimentProperties;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final SignUpSource signUpSource;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final List<PasswordRequirement> passwordRequirements;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final AbstractC14209u0 passwordPolicyError;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final C9598e onComplete;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends ActivationFlowStepModel> list, C26418e progress, List<ActivationFlowCountry> list2, C14201q0 memberInfo, EnumC14168b0 fullScreenState, boolean z4, EnumC14195n0 enumC14195n0, boolean z13, AuthMaterial authMaterial, boolean z14, boolean z15, SubscriptionError subscriptionError, Map<String, String> map, SignUpSource signUpSource, List<PasswordRequirement> passwordRequirements, AbstractC14209u0 abstractC14209u0, C9598e c9598e) {
            AbstractC22676k.m65750j(progress, "progress");
            AbstractC22676k.m65750j(memberInfo, "memberInfo");
            AbstractC22676k.m65750j(fullScreenState, "fullScreenState");
            AbstractC22676k.m65750j(signUpSource, "signUpSource");
            AbstractC22676k.m65750j(passwordRequirements, "passwordRequirements");
            this.screens = list;
            this.progress = progress;
            this.countries = list2;
            this.memberInfo = memberInfo;
            this.fullScreenState = fullScreenState;
            this.isProgressButtonError = z4;
            this.loginErrorType = enumC14195n0;
            this.isProgressButtonLoading = z13;
            this.authMaterial = authMaterial;
            this.shouldAskForNotificationsPermissions = z14;
            this.shouldDismissError = z15;
            this.subscriptionError = subscriptionError;
            this.experimentProperties = map;
            this.signUpSource = signUpSource;
            this.passwordRequirements = passwordRequirements;
            this.passwordPolicyError = abstractC14209u0;
            this.onComplete = c9598e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m40416b(b bVar, List list, C26418e c26418e, List list2, C14201q0 c14201q0, EnumC14168b0 enumC14168b0, boolean z4, EnumC14195n0 enumC14195n0, boolean z13, AuthMaterial authMaterial, boolean z14, boolean z15, SubscriptionError subscriptionError, Map map, SignUpSource signUpSource, List list3, AbstractC14209u0 abstractC14209u0, C9598e c9598e, int i13, Object obj) {
            C9598e c9598e2;
            AbstractC14209u0 abstractC14209u1;
            List list4 = (i13 & 1) != 0 ? bVar.screens : list;
            C26418e c26418e2 = (i13 & 2) != 0 ? bVar.progress : c26418e;
            List list5 = (i13 & 4) != 0 ? bVar.countries : list2;
            C14201q0 c14201q1 = (i13 & 8) != 0 ? bVar.memberInfo : c14201q0;
            EnumC14168b0 enumC14168b1 = (i13 & 16) != 0 ? bVar.fullScreenState : enumC14168b0;
            boolean z16 = (i13 & 32) != 0 ? bVar.isProgressButtonError : z4;
            EnumC14195n0 enumC14195n1 = (i13 & 64) != 0 ? bVar.loginErrorType : enumC14195n0;
            boolean z17 = (i13 & 128) != 0 ? bVar.isProgressButtonLoading : z13;
            AuthMaterial authMaterial2 = (i13 & 256) != 0 ? bVar.authMaterial : authMaterial;
            boolean z18 = (i13 & 512) != 0 ? bVar.shouldAskForNotificationsPermissions : z14;
            boolean z19 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? bVar.shouldDismissError : z15;
            SubscriptionError subscriptionError2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? bVar.subscriptionError : subscriptionError;
            Map map2 = (i13 & 4096) != 0 ? bVar.experimentProperties : map;
            SignUpSource signUpSource2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? bVar.signUpSource : signUpSource;
            List list6 = list4;
            List list7 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? bVar.passwordRequirements : list3;
            AbstractC14209u0 abstractC14209u2 = (i13 & 32768) != 0 ? bVar.passwordPolicyError : abstractC14209u0;
            if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                abstractC14209u1 = abstractC14209u2;
                c9598e2 = bVar.onComplete;
            } else {
                c9598e2 = c9598e;
                abstractC14209u1 = abstractC14209u2;
            }
            return bVar.m40417a(list6, c26418e2, list5, c14201q1, enumC14168b1, z16, enumC14195n1, z17, authMaterial2, z18, z19, subscriptionError2, map2, signUpSource2, list7, abstractC14209u1, c9598e2);
        }

        /* JADX INFO: renamed from: a */
        public final b m40417a(List<? extends ActivationFlowStepModel> screens, C26418e progress, List<ActivationFlowCountry> countries, C14201q0 memberInfo, EnumC14168b0 fullScreenState, boolean isProgressButtonError, EnumC14195n0 loginErrorType, boolean isProgressButtonLoading, AuthMaterial authMaterial, boolean shouldAskForNotificationsPermissions, boolean shouldDismissError, SubscriptionError subscriptionError, Map<String, String> experimentProperties, SignUpSource signUpSource, List<PasswordRequirement> passwordRequirements, AbstractC14209u0 passwordPolicyError, C9598e onComplete) {
            AbstractC22676k.m65750j(progress, "progress");
            AbstractC22676k.m65750j(memberInfo, "memberInfo");
            AbstractC22676k.m65750j(fullScreenState, "fullScreenState");
            AbstractC22676k.m65750j(signUpSource, "signUpSource");
            AbstractC22676k.m65750j(passwordRequirements, "passwordRequirements");
            return new b(screens, progress, countries, memberInfo, fullScreenState, isProgressButtonError, loginErrorType, isProgressButtonLoading, authMaterial, shouldAskForNotificationsPermissions, shouldDismissError, subscriptionError, experimentProperties, signUpSource, passwordRequirements, passwordPolicyError, onComplete);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AuthMaterial getAuthMaterial() {
            return this.authMaterial;
        }

        /* JADX INFO: renamed from: d */
        public final List<ActivationFlowCountry> m40419d() {
            return this.countries;
        }

        /* JADX INFO: renamed from: e */
        public final Map<String, String> m40420e() {
            return this.experimentProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.screens, bVar.screens) && AbstractC22676k.m65745e(this.progress, bVar.progress) && AbstractC22676k.m65745e(this.countries, bVar.countries) && AbstractC22676k.m65745e(this.memberInfo, bVar.memberInfo) && this.fullScreenState == bVar.fullScreenState && this.isProgressButtonError == bVar.isProgressButtonError && this.loginErrorType == bVar.loginErrorType && this.isProgressButtonLoading == bVar.isProgressButtonLoading && AbstractC22676k.m65745e(this.authMaterial, bVar.authMaterial) && this.shouldAskForNotificationsPermissions == bVar.shouldAskForNotificationsPermissions && this.shouldDismissError == bVar.shouldDismissError && AbstractC22676k.m65745e(this.subscriptionError, bVar.subscriptionError) && AbstractC22676k.m65745e(this.experimentProperties, bVar.experimentProperties) && this.signUpSource == bVar.signUpSource && AbstractC22676k.m65745e(this.passwordRequirements, bVar.passwordRequirements) && AbstractC22676k.m65745e(this.passwordPolicyError, bVar.passwordPolicyError) && AbstractC22676k.m65745e(this.onComplete, bVar.onComplete);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final EnumC14168b0 getFullScreenState() {
            return this.fullScreenState;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final EnumC14195n0 getLoginErrorType() {
            return this.loginErrorType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C14201q0 getMemberInfo() {
            return this.memberInfo;
        }

        public int hashCode() {
            List<ActivationFlowStepModel> list = this.screens;
            int iHashCode = (this.progress.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31;
            List<ActivationFlowCountry> list2 = this.countries;
            int iM8289b = AbstractC2875y.m8289b((this.fullScreenState.hashCode() + ((this.memberInfo.hashCode() + ((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31)) * 31, 31, this.isProgressButtonError);
            EnumC14195n0 enumC14195n0 = this.loginErrorType;
            int iM8289b2 = AbstractC2875y.m8289b((iM8289b + (enumC14195n0 == null ? 0 : enumC14195n0.hashCode())) * 31, 31, this.isProgressButtonLoading);
            AuthMaterial authMaterial = this.authMaterial;
            int iM8289b3 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b2 + (authMaterial == null ? 0 : authMaterial.hashCode())) * 31, 31, this.shouldAskForNotificationsPermissions), 31, this.shouldDismissError);
            SubscriptionError subscriptionError = this.subscriptionError;
            int iHashCode2 = (iM8289b3 + (subscriptionError == null ? 0 : subscriptionError.hashCode())) * 31;
            Map<String, String> map = this.experimentProperties;
            int iM31983b = AbstractC11895b.m31983b((this.signUpSource.hashCode() + ((iHashCode2 + (map == null ? 0 : map.hashCode())) * 31)) * 31, 31, this.passwordRequirements);
            AbstractC14209u0 abstractC14209u0 = this.passwordPolicyError;
            int iHashCode3 = (iM31983b + (abstractC14209u0 == null ? 0 : abstractC14209u0.hashCode())) * 31;
            C9598e c9598e = this.onComplete;
            return iHashCode3 + (c9598e != null ? c9598e.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final C9598e getOnComplete() {
            return this.onComplete;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final AbstractC14209u0 getPasswordPolicyError() {
            return this.passwordPolicyError;
        }

        /* JADX INFO: renamed from: k */
        public final List<PasswordRequirement> m40426k() {
            return this.passwordRequirements;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final C26418e getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: m */
        public final List<ActivationFlowStepModel> m40428m() {
            return this.screens;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getShouldAskForNotificationsPermissions() {
            return this.shouldAskForNotificationsPermissions;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getShouldDismissError() {
            return this.shouldDismissError;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final SignUpSource getSignUpSource() {
            return this.signUpSource;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final SubscriptionError getSubscriptionError() {
            return this.subscriptionError;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final boolean getIsProgressButtonError() {
            return this.isProgressButtonError;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getIsProgressButtonLoading() {
            return this.isProgressButtonLoading;
        }

        public String toString() {
            List<ActivationFlowStepModel> list = this.screens;
            C26418e c26418e = this.progress;
            List<ActivationFlowCountry> list2 = this.countries;
            C14201q0 c14201q0 = this.memberInfo;
            EnumC14168b0 enumC14168b0 = this.fullScreenState;
            boolean z4 = this.isProgressButtonError;
            EnumC14195n0 enumC14195n0 = this.loginErrorType;
            boolean z13 = this.isProgressButtonLoading;
            AuthMaterial authMaterial = this.authMaterial;
            boolean z14 = this.shouldAskForNotificationsPermissions;
            boolean z15 = this.shouldDismissError;
            SubscriptionError subscriptionError = this.subscriptionError;
            Map<String, String> map = this.experimentProperties;
            SignUpSource signUpSource = this.signUpSource;
            List<PasswordRequirement> list3 = this.passwordRequirements;
            AbstractC14209u0 abstractC14209u0 = this.passwordPolicyError;
            C9598e c9598e = this.onComplete;
            StringBuilder sb4 = new StringBuilder("Result(screens=");
            sb4.append(list);
            sb4.append(", progress=");
            sb4.append(c26418e);
            sb4.append(", countries=");
            sb4.append(list2);
            sb4.append(", memberInfo=");
            sb4.append(c14201q0);
            sb4.append(", fullScreenState=");
            sb4.append(enumC14168b0);
            sb4.append(", isProgressButtonError=");
            sb4.append(z4);
            sb4.append(", loginErrorType=");
            sb4.append(enumC14195n0);
            sb4.append(", isProgressButtonLoading=");
            sb4.append(z13);
            sb4.append(", authMaterial=");
            sb4.append(authMaterial);
            sb4.append(", shouldAskForNotificationsPermissions=");
            sb4.append(z14);
            sb4.append(", shouldDismissError=");
            sb4.append(z15);
            sb4.append(", subscriptionError=");
            sb4.append(subscriptionError);
            sb4.append(", experimentProperties=");
            sb4.append(map);
            sb4.append(", signUpSource=");
            sb4.append(signUpSource);
            sb4.append(", passwordRequirements=");
            sb4.append(list3);
            sb4.append(", passwordPolicyError=");
            sb4.append(abstractC14209u0);
            sb4.append(", onComplete=");
            return AbstractC33745d.m106656o(sb4, c9598e, ")");
        }

        public /* synthetic */ b(List list, C26418e c26418e, List list2, C14201q0 c14201q0, EnumC14168b0 enumC14168b0, boolean z4, EnumC14195n0 enumC14195n0, boolean z13, AuthMaterial authMaterial, boolean z14, boolean z15, SubscriptionError subscriptionError, Map map, SignUpSource signUpSource, List list3, AbstractC14209u0 abstractC14209u0, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? new C26418e(0, 0, 0, null, null, 31, null) : c26418e, (i13 & 4) != 0 ? null : list2, (i13 & 8) != 0 ? new C14201q0(null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073741823, null) : c14201q0, (i13 & 16) != 0 ? EnumC14168b0.CONTENT : enumC14168b0, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? null : enumC14195n0, (i13 & 128) != 0 ? false : z13, (i13 & 256) != 0 ? null : authMaterial, (i13 & 512) != 0 ? false : z14, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 ? z15 : false, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : subscriptionError, (i13 & 4096) != 0 ? null : map, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? SignUpSource.ACTIVATION : signUpSource, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? C25271y.f99162w : list3, (i13 & 32768) != 0 ? null : abstractC14209u0, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : c9598e);
        }
    }
}
