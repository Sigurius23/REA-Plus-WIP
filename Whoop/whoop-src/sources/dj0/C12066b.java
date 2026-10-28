package dj0;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.AliasExistsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.CodeMismatchException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.ExpiredCodeException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InternalErrorException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidParameterException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidPasswordException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.PasswordHistoryPolicyViolationException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.TooManyRequestsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UnexpectedLambdaException;
import aws.smithy.kotlin.runtime.ClientException;
import aws.smithy.kotlin.runtime.SdkBaseException;
import aws.smithy.kotlin.runtime.ServiceException;
import aws.smithy.kotlin.runtime.http.HttpException;
import b30.C2656x4;
import cd.C4421a;
import ck1.C4780c;
import com.whoop.auth.NoSetupChallengeDataFoundException;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import dh0.C12040a;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import fj0.C14527a;
import fj0.C14528b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import iy1.InterfaceC21030c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jy1.C22047a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25271y;
import m83.C25272z;
import ne.C26595d;
import ne.InterfaceC26594c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p087db.C11856j0;
import p255jk.C21745c;
import p326mf.C25500t;
import p408q.C29662f;
import p501te.C33740e;
import p501te.InterfaceC33739d;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35902e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29205p;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import re.AbstractC31272g0;
import re.AbstractC31309z;
import re.C31253a;
import re.C31254a0;
import re.C31255a1;
import re.C31256b;
import re.C31257b0;
import re.C31260c0;
import re.C31261c1;
import re.C31262d;
import re.C31264d1;
import re.C31265e;
import re.C31267e1;
import re.C31270f1;
import re.C31273h;
import re.C31274h0;
import re.C31278j0;
import re.C31280k0;
import re.C31282l0;
import re.C31284m0;
import re.C31286n0;
import re.C31288o0;
import re.C31296s0;
import re.C31298t0;
import re.C31300u0;
import re.C31302v0;
import re.C31304w0;
import re.C31306x0;
import re.C31308y0;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import wf.C37236a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: dj0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B=\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001d\u001a\u00020\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b!\u0010\u001eJ\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0010\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b$\u0010\u001eJ.\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b'\u0010\u001bJ&\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b)\u0010*J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b/\u00100J \u00102\u001a\u0002012\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b2\u00100J \u00104\u001a\u0002012\u0006\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b4\u0010*J \u00105\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b5\u00100J\u001a\u00107\u001a\u0004\u0018\u0001062\u0006\u0010-\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b7\u0010\u001eJ\u0018\u00108\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b8\u0010\u001eJ4\u0010:\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b:\u0010;J\"\u0010>\u001a\u00020\u00112\u0006\u0010=\u001a\u00020<2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b>\u0010?J\u0018\u0010A\u001a\u00020#2\u0006\u0010,\u001a\u00020@H\u0082@¢\u0006\u0004\bA\u0010BJ4\u0010H\u001a\u00020#2\u0006\u0010,\u001a\u00020@2\n\u0010E\u001a\u00060Cj\u0002`D2\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00060FH\u0082@¢\u0006\u0004\bH\u0010IJ'\u0010L\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0018\u0010O\u001a\u00020N2\u0006\u0010K\u001a\u00020JH\u0082@¢\u0006\u0004\bO\u0010PJ\u0018\u0010R\u001a\u00020N2\u0006\u0010K\u001a\u00020QH\u0082@¢\u0006\u0004\bR\u0010SJ\u001b\u0010W\u001a\u0004\u0018\u00010V2\b\u0010U\u001a\u0004\u0018\u00010TH\u0002¢\u0006\u0004\bW\u0010XJ\u0013\u0010Z\u001a\u00020Y*\u00020+H\u0002¢\u0006\u0004\bZ\u0010[J\u001b\u0010^\u001a\u00020#*\u00020\\2\u0006\u0010]\u001a\u00020+H\u0002¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006l"}, m65681d2 = {"Ldj0/b;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lne/c;", "identityProviderClient", "", "cognitoClientId", "Liy1/c;", "metricWriter", "Ldj0/v;", "mfaChallengeRepository", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lne/c;Ljava/lang/String;Liy1/c;Ldj0/v;Ltr2/n;)V", "refreshToken", "", "forOnboarding", "Ldj0/m;", "y", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", NotificationCompat.CATEGORY_EMAIL, "password", "seonFingerprint", "Ldj0/q;", "H", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "accessToken", "F", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "code", "Ldj0/h;", "t", "Ldj0/e;", "Ll83/a0;", "K", "oldPassword", "newPassword", "q", "newEmail", "p", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ldj0/w;", "method", "currentAccessToken", "Ldj0/k;", "L", "(Ldj0/w;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ldj0/t;", "E", "submittedCode", "M", "G", "Lfj0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "u", "forResendCode", "I", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ldj0/u$a;", "challengeData", "x", "(Ldj0/u$a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ldj0/l;", "D", "(Ldj0/l;Lq83/d;)Ljava/lang/Object;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "additionalData", "B", "(Ldj0/l;Ljava/lang/Exception;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lre/o0;", "response", "A", "(Ljava/lang/String;Ljava/lang/String;Lre/o0;)V", "Lfj0/a;", "s", "(Lre/o0;Lq83/d;)Ljava/lang/Object;", "Lre/s0;", "r", "(Lre/s0;Lq83/d;)Ljava/lang/Object;", "Lre/c0;", "codeDeliveryDetailsType", "Ldj0/a;", "v", "(Lre/c0;)Ldj0/a;", "Lre/b;", "m", "(Ldj0/w;)Lre/b;", "Lre/v0;", "mfaMethod", "N", "(Lre/v0;Ldj0/w;)V", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Lne/c;", "c", "Ljava/lang/String;", "d", "Liy1/c;", "e", "Ldj0/v;", "f", "Ltr2/n;", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12066b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC26594c identityProviderClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String cognitoClientId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C12086v mfaChallengeRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: dj0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {829, 455, 458}, m100432m = "changeEmail", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f40046E;

        /* JADX INFO: renamed from: G */
        int f40048G;

        /* JADX INFO: renamed from: w */
        Object f40049w;

        /* JADX INFO: renamed from: x */
        Object f40050x;

        /* JADX INFO: renamed from: y */
        Object f40051y;

        /* JADX INFO: renamed from: z */
        int f40052z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40046E = obj;
            this.f40048G |= Integer.MIN_VALUE;
            return C12066b.this.m33307p(null, null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ String f40053w;

        public b(String str) {
            this.f40053w = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m33313a(C31253a AttributeType) {
            AbstractC22676k.m65750j(AttributeType, "$this$AttributeType");
            AttributeType.f128756a = NotificationCompat.CATEGORY_EMAIL;
            AttributeType.f128757b = this.f40053w;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m33313a((C31253a) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dj0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {829, 376, 379}, m100432m = "changePassword", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f40054E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f40055F;

        /* JADX INFO: renamed from: H */
        int f40057H;

        /* JADX INFO: renamed from: w */
        Object f40058w;

        /* JADX INFO: renamed from: x */
        Object f40059x;

        /* JADX INFO: renamed from: y */
        Object f40060y;

        /* JADX INFO: renamed from: z */
        Object f40061z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40055F = obj;
            this.f40057H |= Integer.MIN_VALUE;
            return C12066b.this.m33308q(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {770}, m100432m = "cognitoAuthMaterialFromChallengeResponse", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f40062E;

        /* JADX INFO: renamed from: w */
        Object f40063w;

        /* JADX INFO: renamed from: x */
        Object f40064x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f40065y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40065y = obj;
            this.f40062E |= Integer.MIN_VALUE;
            return C12066b.this.m33295r(null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {753}, m100432m = "cognitoAuthMaterialFromResponse", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f40067E;

        /* JADX INFO: renamed from: w */
        Object f40068w;

        /* JADX INFO: renamed from: x */
        Object f40069x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f40070y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40070y = obj;
            this.f40067E |= Integer.MIN_VALUE;
            return C12066b.this.m33296s(null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {256, 273, 829, 292, 293, 297}, m100432m = "completeMfaChallenge", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f40072E;

        /* JADX INFO: renamed from: F */
        Object f40073F;

        /* JADX INFO: renamed from: G */
        int f40074G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f40075H;

        /* JADX INFO: renamed from: J */
        int f40077J;

        /* JADX INFO: renamed from: w */
        Object f40078w;

        /* JADX INFO: renamed from: x */
        Object f40079x;

        /* JADX INFO: renamed from: y */
        Object f40080y;

        /* JADX INFO: renamed from: z */
        Object f40081z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40075H = obj;
            this.f40077J |= Integer.MIN_VALUE;
            return C12066b.this.m33309t(null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {829, 696, 699}, m100432m = "disableMFA", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f40083F;

        /* JADX INFO: renamed from: w */
        Object f40084w;

        /* JADX INFO: renamed from: x */
        Object f40085x;

        /* JADX INFO: renamed from: y */
        int f40086y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f40087z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40087z = obj;
            this.f40083F |= Integer.MIN_VALUE;
            return C12066b.this.m33310u(null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$h */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f40088w = new h();

        /* JADX INFO: renamed from: a */
        public final void m33314a(C31274h0 emailMfaSettings) {
            AbstractC22676k.m65750j(emailMfaSettings, "$this$emailMfaSettings");
            emailMfaSettings.f128797a = false;
            emailMfaSettings.f128798b = false;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m33314a((C31274h0) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dj0.b$i */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f40089w = new i();

        /* JADX INFO: renamed from: a */
        public final void m33315a(C31308y0 smsMfaSettings) {
            AbstractC22676k.m65750j(smsMfaSettings, "$this$smsMfaSettings");
            smsMfaSettings.f128858a = false;
            smsMfaSettings.f128859b = false;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m33315a((C31308y0) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dj0.b$j */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f40090w = new j();

        /* JADX INFO: renamed from: a */
        public final void m33316a(C31255a1 softwareTokenMfaSettings) {
            AbstractC22676k.m65750j(softwareTokenMfaSettings, "$this$softwareTokenMfaSettings");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m33316a((C31255a1) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dj0.b$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {829, 653, 670}, m100432m = "getUserMfaStatus", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f40092F;

        /* JADX INFO: renamed from: w */
        Object f40093w;

        /* JADX INFO: renamed from: x */
        Object f40094x;

        /* JADX INFO: renamed from: y */
        int f40095y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f40096z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40096z = obj;
            this.f40092F |= Integer.MIN_VALUE;
            return C12066b.this.m33311w(null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$l */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {241}, m100432m = "handleSetupResend", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f40097E;

        /* JADX INFO: renamed from: G */
        int f40099G;

        /* JADX INFO: renamed from: w */
        Object f40100w;

        /* JADX INFO: renamed from: x */
        Object f40101x;

        /* JADX INFO: renamed from: y */
        Object f40102y;

        /* JADX INFO: renamed from: z */
        Object f40103z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40097E = obj;
            this.f40099G |= Integer.MIN_VALUE;
            return C12066b.this.m33298x(null, null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$m */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {829, 65, 66, AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB, 123}, m100432m = "improvedMetricsRefreshToken", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f40104E;

        /* JADX INFO: renamed from: F */
        Object f40105F;

        /* JADX INFO: renamed from: G */
        boolean f40106G;

        /* JADX INFO: renamed from: H */
        int f40107H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f40108I;

        /* JADX INFO: renamed from: K */
        int f40110K;

        /* JADX INFO: renamed from: w */
        Object f40111w;

        /* JADX INFO: renamed from: x */
        Object f40112x;

        /* JADX INFO: renamed from: y */
        Object f40113y;

        /* JADX INFO: renamed from: z */
        Object f40114z;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40108I = obj;
            this.f40110K |= Integer.MIN_VALUE;
            return C12066b.this.m33312y(null, false, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$n */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {829, 546, 553}, m100432m = "requestMfaSetupChallengeCode", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f40115E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f40116F;

        /* JADX INFO: renamed from: H */
        int f40118H;

        /* JADX INFO: renamed from: w */
        Object f40119w;

        /* JADX INFO: renamed from: x */
        Object f40120x;

        /* JADX INFO: renamed from: y */
        Object f40121y;

        /* JADX INFO: renamed from: z */
        Object f40122z;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40116F = obj;
            this.f40118H |= Integer.MIN_VALUE;
            return C12066b.this.m33300E(null, null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$o */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {212, 216}, m100432m = "resendCode", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f40123E;

        /* JADX INFO: renamed from: G */
        int f40125G;

        /* JADX INFO: renamed from: w */
        Object f40126w;

        /* JADX INFO: renamed from: x */
        Object f40127x;

        /* JADX INFO: renamed from: y */
        Object f40128y;

        /* JADX INFO: renamed from: z */
        Object f40129z;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40123E = obj;
            this.f40125G |= Integer.MIN_VALUE;
            return C12066b.this.m33301F(null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$p */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {829, 636, 639}, m100432m = "setMfaPreference", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f40130E;

        /* JADX INFO: renamed from: G */
        int f40132G;

        /* JADX INFO: renamed from: w */
        Object f40133w;

        /* JADX INFO: renamed from: x */
        Object f40134x;

        /* JADX INFO: renamed from: y */
        Object f40135y;

        /* JADX INFO: renamed from: z */
        int f40136z;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40130E = obj;
            this.f40132G |= Integer.MIN_VALUE;
            return C12066b.this.m33302G(null, null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$q */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {829, 156, 158, 167}, m100432m = "signIn", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f40137E;

        /* JADX INFO: renamed from: F */
        boolean f40138F;

        /* JADX INFO: renamed from: G */
        int f40139G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f40140H;

        /* JADX INFO: renamed from: J */
        int f40142J;

        /* JADX INFO: renamed from: w */
        Object f40143w;

        /* JADX INFO: renamed from: x */
        Object f40144x;

        /* JADX INFO: renamed from: y */
        Object f40145y;

        /* JADX INFO: renamed from: z */
        Object f40146z;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40140H = obj;
            this.f40142J |= Integer.MIN_VALUE;
            return C12066b.this.m33274I(null, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$r */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {829, 339, 342}, m100432m = "signOut", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f40148F;

        /* JADX INFO: renamed from: w */
        Object f40149w;

        /* JADX INFO: renamed from: x */
        Object f40150x;

        /* JADX INFO: renamed from: y */
        int f40151y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f40152z;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40152z = obj;
            this.f40148F |= Integer.MIN_VALUE;
            return C12066b.this.m33304K(null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$s */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {829, 504, FrameMetricsAggregator.EVERY_DURATION}, m100432m = "startMfaEnablement", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f40153E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f40154F;

        /* JADX INFO: renamed from: H */
        int f40156H;

        /* JADX INFO: renamed from: w */
        Object f40157w;

        /* JADX INFO: renamed from: x */
        Object f40158x;

        /* JADX INFO: renamed from: y */
        Object f40159y;

        /* JADX INFO: renamed from: z */
        Object f40160z;

        public s(InterfaceC30057d<? super s> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40154F = obj;
            this.f40156H |= Integer.MIN_VALUE;
            return C12066b.this.m33305L(null, null, this);
        }
    }

    /* JADX INFO: renamed from: dj0.b$t */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.auth.CognitoAuthApi", m100430f = "CognitoAuthApi.kt", m100431l = {829, 586, 590}, m100432m = "verifyUserAttribute", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f40161E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f40162F;

        /* JADX INFO: renamed from: H */
        int f40164H;

        /* JADX INFO: renamed from: w */
        Object f40165w;

        /* JADX INFO: renamed from: x */
        Object f40166x;

        /* JADX INFO: renamed from: y */
        Object f40167y;

        /* JADX INFO: renamed from: z */
        Object f40168z;

        public t(InterfaceC30057d<? super t> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40162F = obj;
            this.f40164H |= Integer.MIN_VALUE;
            return C12066b.this.m33306M(null, null, this);
        }
    }

    public C12066b(FeatureFlagChecker featureFlagChecker, InterfaceC26594c identityProviderClient, String cognitoClientId, InterfaceC21030c metricWriter, C12086v mfaChallengeRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(identityProviderClient, "identityProviderClient");
        AbstractC22676k.m65750j(cognitoClientId, "cognitoClientId");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(mfaChallengeRepository, "mfaChallengeRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.featureFlagChecker = featureFlagChecker;
        this.identityProviderClient = identityProviderClient;
        this.cognitoClientId = cognitoClientId;
        this.metricWriter = metricWriter;
        this.mfaChallengeRepository = mfaChallengeRepository;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: A */
    private final void m33270A(String email, String password, C31288o0 response) {
        AbstractC31309z abstractC31309zM96302b;
        String strM96304d = response.m96304d();
        if (strM96304d == null || (abstractC31309zM96302b = response.m96302b()) == null) {
            return;
        }
        InterfaceC13075p1 interfaceC13075p1M33346a = this.mfaChallengeRepository.getChallengeData();
        String strMo96296a = abstractC31309zM96302b.mo96296a();
        Map mapM96303c = response.m96303c();
        if (mapM96303c == null) {
            mapM96303c = C25272z.f99163w;
        }
        InterfaceC12085u.b bVar = new InterfaceC12085u.b(strM96304d, email, password, strMo96296a, mapM96303c);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1M33346a;
        c13045h2.getClass();
        c13045h2.m36571k(null, bVar);
    }

    /* JADX INFO: renamed from: B */
    private final Object m33271B(InterfaceC12076l interfaceC12076l, Exception exc, List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "auth.cognito", null, AbstractC25265s.m74129g1(list, AbstractC37056f.m118959K(AbstractC11266d.m30461o("method:", interfaceC12076l.getName()), "success:false", AbstractC11266d.m30461o("error:", AbstractC22671h0.f89337a.getOrCreateKotlinClass(exc.getClass()).getSimpleName()))), null, 21, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Object m33272C(C12066b c12066b, InterfaceC12076l interfaceC12076l, Exception exc, List list, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            list = C25271y.f99162w;
        }
        return c12066b.m33271B(interfaceC12076l, exc, list, interfaceC30057d);
    }

    /* JADX INFO: renamed from: D */
    private final Object m33273D(InterfaceC12076l interfaceC12076l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "auth.cognito", null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("method:", interfaceC12076l.getName()), "success:true"), null, 21, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x018a A[Catch: SdkBaseException -> 0x007b, TryCatch #1 {SdkBaseException -> 0x007b, blocks: (B:19:0x0076, B:50:0x01a0, B:24:0x0099, B:45:0x0184, B:47:0x018a, B:53:0x01aa, B:54:0x01ad, B:27:0x00b5), top: B:103:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x019f  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x01aa A[Catch: SdkBaseException -> 0x007b, TryCatch #1 {SdkBaseException -> 0x007b, blocks: (B:19:0x0076, B:50:0x01a0, B:24:0x0099, B:45:0x0184, B:47:0x018a, B:53:0x01aa, B:54:0x01ad, B:27:0x00b5), top: B:103:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:63:0x021e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0225  */
    /* JADX WARN: Code duplicated, block: B:67:0x022e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0233  */
    /* JADX WARN: Code duplicated, block: B:71:0x0238  */
    /* JADX WARN: Code duplicated, block: B:82:0x0292  */
    /* JADX WARN: Code duplicated, block: B:84:0x0296  */
    /* JADX WARN: Code duplicated, block: B:85:0x029a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:90:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ad  */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x01fb, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [dj0.b] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [dj0.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.StringBuilder] */
    /* JADX INFO: renamed from: I */
    public final Object m33274I(String str, String str2, boolean z4, String str3, InterfaceC30057d<? super InterfaceC12081q> interfaceC30057d) {
        q qVar;
        ?? r10;
        ?? r14;
        SdkBaseException sdkBaseException;
        ?? r15;
        int iM74906a;
        ServiceException serviceException;
        InterfaceC33739d interfaceC33739dM106627h;
        C37236a c37236a;
        C12078n c12078n;
        C25500t c25500tM119336b;
        C33740e f8399w;
        C33740e f8399w2;
        InterfaceC33739d interfaceC33739dM106627h2;
        NotAuthorizedException notAuthorizedException;
        String message;
        C25500t c25500tM119336b2;
        InterfaceC12076l interfaceC12076l;
        Object objM79096k;
        String str4;
        C31288o0 c31288o0;
        String str5;
        ?? r16;
        InterfaceC12076l interfaceC12076l2;
        String str6 = str;
        String str7 = str2;
        ?? r17 = z4;
        if (interfaceC30057d instanceof q) {
            qVar = (q) interfaceC30057d;
            int i13 = qVar.f40142J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                qVar.f40142J = i13 - Integer.MIN_VALUE;
            } else {
                qVar = new q(interfaceC30057d);
            }
        } else {
            qVar = new q(interfaceC30057d);
        }
        q qVar2 = qVar;
        Object objM33296s = qVar2.f40140H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = qVar2.f40142J;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM33296s);
                if (r17 != 0) {
                    this.logger.mo85228t(AbstractC11266d.m30461o("Cognito resend code with userName: ", str6), new AbstractC30556a.a[0]);
                    interfaceC12076l = InterfaceC12076l.g.f40203a;
                } else {
                    this.logger.mo85228t(AbstractC11266d.m30461o("Cognito sign-in with userName: ", str6), new AbstractC30556a.a[0]);
                    interfaceC12076l = InterfaceC12076l.i.f40207a;
                }
                try {
                    InterfaceC26594c interfaceC26594c = this.identityProviderClient;
                    C29662f c29662f = new C29662f(3, false);
                    c29662f.m91087I0(this.cognitoClientId);
                    c29662f.m91080D0(C31265e.f128778a);
                    c29662f.m91082E0(AbstractC25247g0.m73990Y(new C23465k("USERNAME", str6), new C23465k("PASSWORD", str7)));
                    if (str3 != null) {
                        c29662f.m91088J0(AbstractC25247g0.m73989X(new C23465k("Fingerprint", str3)));
                    }
                    C31286n0 c31286n0M91118i0 = c29662f.m91118i0();
                    qVar2.f40143w = str6;
                    qVar2.f40144x = str7;
                    qVar2.f40145y = null;
                    qVar2.f40146z = interfaceC12076l;
                    qVar2.f40137E = null;
                    qVar2.f40138F = r17;
                    qVar2.f40139G = 0;
                    qVar2.f40142J = 1;
                    objM79096k = ((C26595d) interfaceC26594c).m79096k(c31286n0M91118i0, qVar2);
                    r17 = r17;
                    if (objM79096k == enumC31071a) {
                    }
                } catch (SdkBaseException e5) {
                    e = e5;
                    r14 = interfaceC12076l;
                    r10 = r17;
                    this.logger.mo85230v("got exception during cognito sdk " + r14 + " call " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(e.getClass()).getSimpleName(), e, new AbstractC30556a.a[0]);
                    qVar2.f40143w = null;
                    qVar2.f40144x = null;
                    qVar2.f40145y = null;
                    qVar2.f40146z = r14;
                    qVar2.f40137E = e;
                    qVar2.f40138F = r10;
                    qVar2.f40142J = 4;
                    SdkBaseException sdkBaseException2 = e;
                    if (m33272C(this, r14, sdkBaseException2, null, qVar2, 4, null) != enumC31071a) {
                        sdkBaseException = sdkBaseException2;
                        r15 = r14;
                        if (sdkBaseException instanceof HttpException) {
                            this.logger.mo85222m("HttpException: something went wrong networking: " + ((HttpException) sdkBaseException).getF8401x(), new AbstractC30556a.a[0]);
                            return new C12079o(sdkBaseException);
                        }
                        iM74906a = -1;
                        if (sdkBaseException instanceof NotAuthorizedException) {
                            f8399w2 = ((ServiceException) sdkBaseException).getF8399w();
                            if (f8399w2 != null) {
                                interfaceC33739dM106627h2 = f8399w2.m106627h();
                            } else {
                                interfaceC33739dM106627h2 = null;
                            }
                            if (interfaceC33739dM106627h2 instanceof C37236a) {
                            }
                            if (c37236a != null) {
                                iM74906a = c25500tM119336b2.m74906a();
                            }
                            notAuthorizedException = (NotAuthorizedException) sdkBaseException;
                            message = notAuthorizedException.getMessage();
                            if (message == null) {
                            }
                            this.logger.mo85222m(AbstractC11266d.m30456j(iM74906a, "User entered invalid email or password: ", " ", notAuthorizedException.getMessage()), new AbstractC30556a.a[0]);
                            c12078n = new C12078n(sdkBaseException, AbstractC11266d.m30461o("invalid email or password: ", notAuthorizedException.getMessage()), 401);
                        } else {
                            if (sdkBaseException instanceof ServiceException) {
                                serviceException = (ServiceException) sdkBaseException;
                            } else {
                                serviceException = null;
                            }
                            if (serviceException != null) {
                                interfaceC33739dM106627h = null;
                            } else {
                                interfaceC33739dM106627h = null;
                            }
                            if (interfaceC33739dM106627h instanceof C37236a) {
                            }
                            if (c37236a != null) {
                                iM74906a = c25500tM119336b.m74906a();
                            }
                            this.logger.mo85222m(AbstractC11266d.m30456j(iM74906a, "Non network IO exception: ", " ", sdkBaseException.getMessage()), new AbstractC30556a.a[0]);
                            c12078n = new C12078n(sdkBaseException, "Error during Cognito " + r15 + ": " + sdkBaseException.getMessage(), iM74906a);
                        }
                        return c12078n;
                    }
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                boolean z13 = qVar2.f40138F;
                InterfaceC12076l interfaceC12076l3 = (InterfaceC12076l) qVar2.f40146z;
                String str8 = (String) qVar2.f40144x;
                String str9 = (String) qVar2.f40143w;
                AbstractC34132o.m107864I(objM33296s);
                str7 = str8;
                str6 = str9;
                objM79096k = objM33296s;
                interfaceC12076l = interfaceC12076l3;
                r17 = z13;
            } else if (i14 == 2) {
                boolean z14 = qVar2.f40138F;
                c31288o0 = (C31288o0) qVar2.f40137E;
                interfaceC12076l2 = (InterfaceC12076l) qVar2.f40146z;
                str5 = (String) qVar2.f40144x;
                str4 = (String) qVar2.f40143w;
                AbstractC34132o.m107864I(objM33296s);
                r16 = z14;
                if (c31288o0.m96302b() == null) {
                    if (r16 == 0) {
                        m33270A(str4, str5, c31288o0);
                    }
                    return InterfaceC12081q.a.f40226a;
                }
                qVar2.f40143w = null;
                qVar2.f40144x = null;
                qVar2.f40145y = null;
                qVar2.f40146z = interfaceC12076l2;
                qVar2.f40137E = null;
                qVar2.f40138F = r16;
                qVar2.f40142J = 3;
                objM33296s = m33296s(c31288o0, qVar2);
                if (objM33296s == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 3) {
                    if (i14 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sdkBaseException = (SdkBaseException) qVar2.f40137E;
                    InterfaceC12076l interfaceC12076l4 = (InterfaceC12076l) qVar2.f40146z;
                    AbstractC34132o.m107864I(objM33296s);
                    r15 = interfaceC12076l4;
                    if (sdkBaseException instanceof HttpException) {
                        this.logger.mo85222m("HttpException: something went wrong networking: " + ((HttpException) sdkBaseException).getF8401x(), new AbstractC30556a.a[0]);
                        return new C12079o(sdkBaseException);
                    }
                    iM74906a = -1;
                    if (sdkBaseException instanceof NotAuthorizedException) {
                        f8399w2 = ((ServiceException) sdkBaseException).getF8399w();
                        if (f8399w2 != null) {
                            interfaceC33739dM106627h2 = f8399w2.m106627h();
                        } else {
                            interfaceC33739dM106627h2 = null;
                        }
                        c37236a = interfaceC33739dM106627h2 instanceof C37236a ? (C37236a) interfaceC33739dM106627h2 : null;
                        if (c37236a != null && (c25500tM119336b2 = c37236a.m119336b()) != null) {
                            iM74906a = c25500tM119336b2.m74906a();
                        }
                        notAuthorizedException = (NotAuthorizedException) sdkBaseException;
                        message = notAuthorizedException.getMessage();
                        if (message == null && AbstractC39414r.m125876U(message, "Password attempts exceeded", true)) {
                            this.logger.mo85222m(AbstractC11266d.m30456j(iM74906a, "Password attempts exceeded: ", " ", notAuthorizedException.getMessage()), new AbstractC30556a.a[0]);
                            return C12080p.f40225a;
                        }
                        this.logger.mo85222m(AbstractC11266d.m30456j(iM74906a, "User entered invalid email or password: ", " ", notAuthorizedException.getMessage()), new AbstractC30556a.a[0]);
                        c12078n = new C12078n(sdkBaseException, AbstractC11266d.m30461o("invalid email or password: ", notAuthorizedException.getMessage()), 401);
                    } else {
                        if (sdkBaseException instanceof ServiceException) {
                            serviceException = (ServiceException) sdkBaseException;
                        } else {
                            serviceException = null;
                        }
                        if (serviceException != null || (f8399w = serviceException.getF8399w()) == null) {
                            interfaceC33739dM106627h = null;
                        } else {
                            interfaceC33739dM106627h = f8399w.m106627h();
                        }
                        c37236a = interfaceC33739dM106627h instanceof C37236a ? (C37236a) interfaceC33739dM106627h : null;
                        if (c37236a != null && (c25500tM119336b = c37236a.m119336b()) != null) {
                            iM74906a = c25500tM119336b.m74906a();
                        }
                        this.logger.mo85222m(AbstractC11266d.m30456j(iM74906a, "Non network IO exception: ", " ", sdkBaseException.getMessage()), new AbstractC30556a.a[0]);
                        c12078n = new C12078n(sdkBaseException, "Error during Cognito " + r15 + ": " + sdkBaseException.getMessage(), iM74906a);
                    }
                    return c12078n;
                }
                boolean z15 = qVar2.f40138F;
                AbstractC34132o.m107864I(objM33296s);
            }
            return new InterfaceC12081q.b((C14527a) objM33296s);
            this.logger.mo85228t("Cognito " + interfaceC12076l + " response: " + ((C31288o0) objM79096k), new AbstractC30556a.a[0]);
            C31288o0 c31288o1 = (C31288o0) objM79096k;
            qVar2.f40143w = str6;
            qVar2.f40144x = str7;
            qVar2.f40145y = null;
            qVar2.f40146z = interfaceC12076l;
            qVar2.f40137E = c31288o1;
            qVar2.f40138F = r17;
            qVar2.f40142J = 2;
            if (m33273D(interfaceC12076l, qVar2) != enumC31071a) {
                str4 = str6;
                c31288o0 = c31288o1;
                str5 = str7;
                r16 = r17;
                interfaceC12076l2 = interfaceC12076l;
                if (c31288o0.m96302b() == null) {
                    if (r16 == 0) {
                        m33270A(str4, str5, c31288o0);
                    }
                    return InterfaceC12081q.a.f40226a;
                }
                qVar2.f40143w = null;
                qVar2.f40144x = null;
                qVar2.f40145y = null;
                qVar2.f40146z = interfaceC12076l2;
                qVar2.f40137E = null;
                qVar2.f40138F = r16;
                qVar2.f40142J = 3;
                objM33296s = m33296s(c31288o0, qVar2);
                if (objM33296s == enumC31071a) {
                }
                return new InterfaceC12081q.b((C14527a) objM33296s);
            }
        } catch (SdkBaseException e13) {
            e = e13;
            r10 = str7;
            r14 = r17;
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ Object m33275J(C12066b c12066b, String str, String str2, boolean z4, String str3, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            str3 = null;
        }
        return c12066b.m33274I(str, str2, z4, str3, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final void m33276N(C31302v0 c31302v0, InterfaceC12087w interfaceC12087w) {
        c31302v0.m96308b(new C2656x4(interfaceC12087w instanceof InterfaceC12087w.a, 1));
        c31302v0.m96310d(new C2656x4(interfaceC12087w instanceof InterfaceC12087w.b, 2));
        c31302v0.m96311e(new C12040a(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m33277O(boolean z4, C31274h0 emailMfaSettings) {
        AbstractC22676k.m65750j(emailMfaSettings, "$this$emailMfaSettings");
        emailMfaSettings.m96294a(z4);
        emailMfaSettings.m96295b(z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m33278P(boolean z4, C31308y0 smsMfaSettings) {
        AbstractC22676k.m65750j(smsMfaSettings, "$this$smsMfaSettings");
        smsMfaSettings.m96312a(z4);
        smsMfaSettings.m96313b(z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m33279Q(C31255a1 softwareTokenMfaSettings) {
        AbstractC22676k.m65750j(softwareTokenMfaSettings, "$this$softwareTokenMfaSettings");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final C31256b m33292m(InterfaceC12087w interfaceC12087w) {
        if (interfaceC12087w instanceof InterfaceC12087w.a) {
            return AbstractC35902e.m113938F(new C4780c((InterfaceC12087w.a) interfaceC12087w, 21));
        }
        if (interfaceC12087w instanceof InterfaceC12087w.b) {
            return AbstractC35902e.m113938F(new C4780c((InterfaceC12087w.b) interfaceC12087w, 22));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m33293n(InterfaceC12087w interfaceC12087w, C31253a AttributeType) {
        AbstractC22676k.m65750j(AttributeType, "$this$AttributeType");
        AttributeType.m96279a(NotificationCompat.CATEGORY_EMAIL);
        AttributeType.m96280b(((InterfaceC12087w.a) interfaceC12087w).getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m33294o(InterfaceC12087w interfaceC12087w, C31253a AttributeType) {
        AbstractC22676k.m65750j(AttributeType, "$this$AttributeType");
        AttributeType.m96279a("phone_number");
        AttributeType.m96280b(((InterfaceC12087w.b) interfaceC12087w).getPhone());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: r */
    public final Object m33295r(C31296s0 c31296s0, InterfaceC30057d<? super C14527a> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f40062E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f40062E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f40065y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f40062E;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            IllegalArgumentException illegalArgumentException = (IllegalArgumentException) dVar2.f40064x;
            AbstractC34132o.m107864I(obj);
            throw illegalArgumentException;
        }
        AbstractC34132o.m107864I(obj);
        try {
            C31273h c31273hM96305a = c31296s0.m96305a();
            if (c31273hM96305a == null) {
                throw new IllegalArgumentException("challenge authenticationResult missing");
            }
            String strM96291a = c31273hM96305a.m96291a();
            if (strM96291a == null) {
                throw new IllegalArgumentException("challenge accessToken missing");
            }
            String strM96293c = c31273hM96305a.m96293c();
            if (strM96293c != null) {
                return new C14527a(strM96291a, strM96293c, c31273hM96305a.m96292b());
            }
            throw new IllegalArgumentException("challenge refreshToken missing");
        } catch (IllegalArgumentException e5) {
            InterfaceC21030c interfaceC21030c = this.metricWriter;
            C22047a c22047a = new C22047a(0, "cognito.auth.challenge.contract_violation", null, C25271y.f99162w, null, 21, null);
            dVar2.f40063w = null;
            dVar2.f40064x = e5;
            dVar2.f40062E = 1;
            if (interfaceC21030c.mo58700a(c22047a, dVar2) == enumC31071a) {
                return enumC31071a;
            }
            throw e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: s */
    public final Object m33296s(C31288o0 c31288o0, InterfaceC30057d<? super C14527a> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f40067E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f40067E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f40070y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f40067E;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            IllegalArgumentException illegalArgumentException = (IllegalArgumentException) eVar2.f40069x;
            AbstractC34132o.m107864I(obj);
            throw illegalArgumentException;
        }
        AbstractC34132o.m107864I(obj);
        try {
            C31273h c31273hM96301a = c31288o0.m96301a();
            if (c31273hM96301a == null) {
                throw new IllegalArgumentException("authenticationResult missing");
            }
            String strM96291a = c31273hM96301a.m96291a();
            if (strM96291a == null) {
                throw new IllegalArgumentException("accessToken missing");
            }
            String strM96293c = c31273hM96301a.m96293c();
            if (strM96293c != null) {
                return new C14527a(strM96291a, strM96293c, c31273hM96301a.m96292b());
            }
            throw new IllegalArgumentException("refreshToken missing");
        } catch (IllegalArgumentException e5) {
            InterfaceC21030c interfaceC21030c = this.metricWriter;
            C22047a c22047a = new C22047a(0, "cognito.auth.contract_violation", null, C25271y.f99162w, null, 21, null);
            eVar2.f40068w = null;
            eVar2.f40069x = e5;
            eVar2.f40067E = 1;
            if (interfaceC21030c.mo58700a(c22047a, eVar2) == enumC31071a) {
                return enumC31071a;
            }
            throw e5;
        }
    }

    /* JADX INFO: renamed from: v */
    private final C12065a m33297v(C31260c0 codeDeliveryDetailsType) {
        String strM96286c;
        AbstractC31272g0 abstractC31272g0M96285b;
        String strMo96287a;
        String strM96284a;
        if (codeDeliveryDetailsType == null || (strM96286c = codeDeliveryDetailsType.m96286c()) == null || (abstractC31272g0M96285b = codeDeliveryDetailsType.m96285b()) == null || (strMo96287a = abstractC31272g0M96285b.mo96287a()) == null || (strM96284a = codeDeliveryDetailsType.m96284a()) == null) {
            return null;
        }
        return new C12065a(strM96286c, strMo96287a, strM96284a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    public final Object m33298x(InterfaceC12085u.a aVar, String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        l lVar;
        InterfaceC12087w bVar;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i13 = lVar.f40099G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f40099G = i13 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        Object objM33300E = lVar.f40097E;
        Object obj = EnumC31071a.f128113w;
        int i14 = lVar.f40099G;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM33300E);
            if (str == null) {
                this.logger.mo85222m("No access token available for MFA setup resend", new AbstractC30556a.a[0]);
                return Boolean.FALSE;
            }
            C12065a codeDeliveryInfo = aVar.getCodeDeliveryInfo();
            String attributeName = codeDeliveryInfo != null ? codeDeliveryInfo.getAttributeName() : null;
            if (AbstractC22676k.m65745e(attributeName, NotificationCompat.CATEGORY_EMAIL)) {
                bVar = new InterfaceC12087w.a(codeDeliveryInfo.getDestination());
            } else {
                if (!AbstractC22676k.m65745e(attributeName, "phone_number")) {
                    this.logger.mo85222m(AbstractC11266d.m30461o("Unknown attribute name for MFA setup resend: ", codeDeliveryInfo != null ? codeDeliveryInfo.getAttributeName() : null), new AbstractC30556a.a[0]);
                    return Boolean.FALSE;
                }
                bVar = new InterfaceC12087w.b(codeDeliveryInfo.getDestination());
            }
            lVar.f40100w = null;
            lVar.f40101x = null;
            lVar.f40102y = null;
            lVar.f40103z = null;
            lVar.f40099G = 1;
            objM33300E = m33300E(bVar, str, lVar);
            if (objM33300E == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM33300E);
        }
        InterfaceC12084t interfaceC12084t = (InterfaceC12084t) objM33300E;
        if (interfaceC12084t instanceof InterfaceC12084t.a) {
            this.logger.mo85228t("Setup MFA code resend successful", new AbstractC30556a.a[0]);
        } else {
            this.logger.mo85222m("Failed to resend setup MFA code: " + interfaceC12084t, new AbstractC30556a.a[0]);
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Object m33299z(C12066b c12066b, String str, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return c12066b.m33312y(str, z4, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: E */
    public final Object m33300E(InterfaceC12087w interfaceC12087w, String str, InterfaceC30057d<? super InterfaceC12084t> interfaceC30057d) {
        n nVar;
        String simpleName;
        C12066b c12066b;
        SdkBaseException sdkBaseException;
        C25500t c25500tM119336b;
        C33740e f8399w;
        C31280k0 c31280k0;
        if (interfaceC30057d instanceof n) {
            nVar = (n) interfaceC30057d;
            int i13 = nVar.f40118H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nVar.f40118H = i13 - Integer.MIN_VALUE;
            } else {
                nVar = new n(interfaceC30057d);
            }
        } else {
            nVar = new n(interfaceC30057d);
        }
        n nVar2 = nVar;
        Object objM79095i = nVar2.f40116F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = nVar2.f40118H;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM79095i);
                this.logger.mo85228t("verifyMfaMethod with " + interfaceC12087w, new AbstractC30556a.a[0]);
                InterfaceC26594c interfaceC26594c = this.identityProviderClient;
                C21745c c21745c = new C21745c();
                c21745c.m61356c(str);
                c21745c.m61357d(m33292m(interfaceC12087w).m96281a());
                C31278j0 c31278j0M61354a = c21745c.m61354a();
                nVar2.f40119w = null;
                nVar2.f40120x = null;
                nVar2.f40121y = null;
                nVar2.f40115E = 0;
                nVar2.f40118H = 1;
                objM79095i = ((C26595d) interfaceC26594c).m79095i(c31278j0M61354a, nVar2);
                if (objM79095i != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM79095i);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    simpleName = (String) nVar2.f40122z;
                    sdkBaseException = (SdkBaseException) nVar2.f40121y;
                    AbstractC34132o.m107864I(objM79095i);
                    c12066b = this;
                    if (sdkBaseException instanceof HttpException) {
                        c12066b.logger.mo85222m("HttpException: something went wrong networking: " + ((HttpException) sdkBaseException).getF8401x(), new AbstractC30556a.a[0]);
                        return C12083s.f40235a;
                    }
                    ServiceException serviceException = sdkBaseException instanceof ServiceException ? (ServiceException) sdkBaseException : null;
                    InterfaceC33739d interfaceC33739dM106627h = (serviceException == null || (f8399w = serviceException.getF8399w()) == null) ? null : f8399w.m106627h();
                    C37236a c37236a = interfaceC33739dM106627h instanceof C37236a ? (C37236a) interfaceC33739dM106627h : null;
                    int iM74906a = (c37236a == null || (c25500tM119336b = c37236a.m119336b()) == null) ? -1 : c25500tM119336b.m74906a();
                    c12066b.logger.mo85222m(AbstractC2875y.m8295h(iM74906a, "error code "), new AbstractC30556a.a[0]);
                    return new InterfaceC12082r.c(sdkBaseException, simpleName, iM74906a);
                }
                c31280k0 = (C31280k0) nVar2.f40121y;
                AbstractC34132o.m107864I(objM79095i);
            }
            C12065a c12065aM33297v = m33297v(c31280k0.m96297a());
            InterfaceC13075p1 interfaceC13075p1M33346a = this.mfaChallengeRepository.getChallengeData();
            InterfaceC12085u.a aVar = new InterfaceC12085u.a(c12065aM33297v);
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1M33346a;
            c13045h2.getClass();
            c13045h2.m36571k(null, aVar);
            return InterfaceC12084t.a.f40236a;
            this.logger.mo85228t("verify MFA method response: " + ((C31280k0) objM79095i), new AbstractC30556a.a[0]);
            c31280k0 = (C31280k0) objM79095i;
            InterfaceC12076l.e eVar = InterfaceC12076l.e.f40199a;
            nVar2.f40119w = null;
            nVar2.f40120x = null;
            nVar2.f40121y = c31280k0;
            nVar2.f40118H = 2;
            if (m33273D(eVar, nVar2) == enumC31071a) {
                return enumC31071a;
            }
            C12065a c12065aM33297v2 = m33297v(c31280k0.m96297a());
            InterfaceC13075p1 interfaceC13075p1M33346a2 = this.mfaChallengeRepository.getChallengeData();
            InterfaceC12085u.a aVar2 = new InterfaceC12085u.a(c12065aM33297v2);
            C13045h2 c13045h3 = (C13045h2) interfaceC13075p1M33346a2;
            c13045h3.getClass();
            c13045h3.m36571k(null, aVar2);
            return InterfaceC12084t.a.f40236a;
        } catch (SdkBaseException e5) {
            simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(e5.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            InterfaceC12076l.e eVar2 = InterfaceC12076l.e.f40199a;
            nVar2.f40119w = null;
            nVar2.f40120x = null;
            nVar2.f40121y = e5;
            nVar2.f40122z = simpleName;
            nVar2.f40118H = 3;
            c12066b = this;
            if (m33272C(c12066b, eVar2, e5, null, nVar2, 4, null) != enumC31071a) {
                sdkBaseException = e5;
            }
            return enumC31071a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (r11 == r0) goto L28;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m33301F(java.lang.String r10, q83.InterfaceC30057d<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dj0.C12066b.m33301F(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: G */
    public final Object m33302G(InterfaceC12087w interfaceC12087w, String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        p pVar;
        C12066b c12066b;
        SdkBaseException sdkBaseException;
        if (interfaceC30057d instanceof p) {
            pVar = (p) interfaceC30057d;
            int i13 = pVar.f40132G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                pVar.f40132G = i13 - Integer.MIN_VALUE;
            } else {
                pVar = new p(interfaceC30057d);
            }
        } else {
            pVar = new p(interfaceC30057d);
        }
        p pVar2 = pVar;
        Object objM79090J = pVar2.f40130E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = pVar2.f40132G;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM79090J);
                this.logger.mo85228t("setMfaPreference with " + interfaceC12087w, new AbstractC30556a.a[0]);
                InterfaceC26594c interfaceC26594c = this.identityProviderClient;
                C31302v0 c31302v0 = new C31302v0();
                c31302v0.m96309c(str);
                m33276N(c31302v0, interfaceC12087w);
                C31304w0 c31304w0M96307a = c31302v0.m96307a();
                pVar2.f40133w = null;
                pVar2.f40134x = null;
                pVar2.f40135y = null;
                pVar2.f40136z = 0;
                pVar2.f40132G = 1;
                objM79090J = ((C26595d) interfaceC26594c).m79090J(c31304w0M96307a, pVar2);
                if (objM79090J != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM79090J);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sdkBaseException = (SdkBaseException) pVar2.f40135y;
                    AbstractC34132o.m107864I(objM79090J);
                    c12066b = this;
                    c12066b.logger.mo85230v(AbstractC11266d.m30461o("got exception during cognito sdk setMfaPreference call ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(sdkBaseException.getClass()).getSimpleName()), sdkBaseException, new AbstractC30556a.a[0]);
                    return Boolean.FALSE;
                }
                AbstractC34132o.m107864I(objM79090J);
            }
            return Boolean.TRUE;
            this.logger.mo85228t("setMfaPreference response: " + ((C31306x0) objM79090J), new AbstractC30556a.a[0]);
            InterfaceC12076l.h hVar = InterfaceC12076l.h.f40205a;
            pVar2.f40133w = null;
            pVar2.f40134x = null;
            pVar2.f40135y = null;
            pVar2.f40132G = 2;
            if (m33273D(hVar, pVar2) == enumC31071a) {
                return enumC31071a;
            }
            return Boolean.TRUE;
        } catch (SdkBaseException e5) {
            InterfaceC12076l.h hVar2 = InterfaceC12076l.h.f40205a;
            pVar2.f40133w = null;
            pVar2.f40134x = null;
            pVar2.f40135y = e5;
            pVar2.f40132G = 3;
            c12066b = this;
            if (m33272C(c12066b, hVar2, e5, null, pVar2, 4, null) != enumC31071a) {
                sdkBaseException = e5;
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: H */
    public final Object m33303H(String str, String str2, String str3, InterfaceC30057d<? super InterfaceC12081q> interfaceC30057d) {
        return m33274I(str, str2, false, str3, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: K */
    public final Object m33304K(String str, InterfaceC30057d<? super InterfaceC12069e<C23454a0>> interfaceC30057d) {
        r rVar;
        C12066b c12066b;
        SdkBaseException sdkBaseException;
        if (interfaceC30057d instanceof r) {
            rVar = (r) interfaceC30057d;
            int i13 = rVar.f40148F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                rVar.f40148F = i13 - Integer.MIN_VALUE;
            } else {
                rVar = new r(interfaceC30057d);
            }
        } else {
            rVar = new r(interfaceC30057d);
        }
        r rVar2 = rVar;
        Object objM79099x = rVar2.f40152z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = rVar2.f40148F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM79099x);
                this.logger.mo85228t("Signing out from Cognito with refresh token", new AbstractC30556a.a[0]);
                InterfaceC26594c interfaceC26594c = this.identityProviderClient;
                C21745c c21745c = new C21745c();
                c21745c.m61358e(this.cognitoClientId);
                c21745c.m61359f(str);
                C31298t0 c31298t0M61355b = c21745c.m61355b();
                rVar2.f40149w = null;
                rVar2.f40150x = null;
                rVar2.f40151y = 0;
                rVar2.f40148F = 1;
                objM79099x = ((C26595d) interfaceC26594c).m79099x(c31298t0M61355b, rVar2);
                if (objM79099x != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM79099x);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sdkBaseException = (SdkBaseException) rVar2.f40150x;
                    AbstractC34132o.m107864I(objM79099x);
                    c12066b = this;
                    c12066b.logger.mo85230v(AbstractC11266d.m30461o("got exception during cognito sdk sign out call ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(sdkBaseException.getClass()).getSimpleName()), sdkBaseException, new AbstractC30556a.a[0]);
                    if (sdkBaseException instanceof HttpException) {
                        c12066b.logger.mo85222m("HttpException: something went wrong networking: " + sdkBaseException, new AbstractC30556a.a[0]);
                        return new C12068d(sdkBaseException, AbstractC11266d.m30461o("Network error during Cognito sign out: ", sdkBaseException.getMessage()));
                    }
                    c12066b.logger.mo85222m("Failed with " + sdkBaseException, new AbstractC30556a.a[0]);
                    return new C12067c(sdkBaseException, AbstractC11266d.m30461o("Error during Cognito sign out: ", sdkBaseException.getMessage()), -2);
                }
                AbstractC34132o.m107864I(objM79099x);
            }
            return new InterfaceC12069e.a(C23454a0.f92919a);
            this.logger.mo85228t("Cognito sign out response: " + ((C31300u0) objM79099x), new AbstractC30556a.a[0]);
            InterfaceC12076l.j jVar = InterfaceC12076l.j.f40209a;
            rVar2.f40149w = null;
            rVar2.f40150x = null;
            rVar2.f40148F = 2;
            if (m33273D(jVar, rVar2) == enumC31071a) {
                return enumC31071a;
            }
            return new InterfaceC12069e.a(C23454a0.f92919a);
        } catch (SdkBaseException e5) {
            InterfaceC12076l.j jVar2 = InterfaceC12076l.j.f40209a;
            rVar2.f40149w = null;
            rVar2.f40150x = e5;
            rVar2.f40148F = 3;
            c12066b = this;
            if (m33272C(c12066b, jVar2, e5, null, rVar2, 4, null) != enumC31071a) {
                sdkBaseException = e5;
            }
            return enumC31071a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d6 A[Catch: SdkBaseException -> 0x005e, TryCatch #0 {SdkBaseException -> 0x005e, blocks: (B:18:0x0059, B:32:0x00d0, B:34:0x00d6, B:36:0x00de, B:23:0x006f, B:29:0x00a6, B:26:0x0076), top: B:70:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: L */
    public final Object m33305L(InterfaceC12087w interfaceC12087w, String str, InterfaceC30057d<? super InterfaceC12075k> interfaceC30057d) {
        s sVar;
        String simpleName;
        C12066b c12066b;
        SdkBaseException sdkBaseException;
        C25500t c25500tM119336b;
        C33740e f8399w;
        C31264d1 c31264d1;
        List listM96288a;
        C31260c0 c31260c0;
        if (interfaceC30057d instanceof s) {
            sVar = (s) interfaceC30057d;
            int i13 = sVar.f40156H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                sVar.f40156H = i13 - Integer.MIN_VALUE;
            } else {
                sVar = new s(interfaceC30057d);
            }
        } else {
            sVar = new s(interfaceC30057d);
        }
        s sVar2 = sVar;
        Object objM79091T = sVar2.f40154F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = sVar2.f40156H;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM79091T);
                InterfaceC26594c interfaceC26594c = this.identityProviderClient;
                C29205p c29205p = new C29205p(3, false);
                c29205p.m88712i(str);
                c29205p.m88715l(AbstractC37056f.m118958J(m33292m(interfaceC12087w)));
                C31261c1 c31261c1M88708d = c29205p.m88708d();
                sVar2.f40157w = null;
                sVar2.f40158x = null;
                sVar2.f40159y = null;
                sVar2.f40153E = 0;
                sVar2.f40156H = 1;
                objM79091T = ((C26595d) interfaceC26594c).m79091T(c31261c1M88708d, sVar2);
                if (objM79091T != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM79091T);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    simpleName = (String) sVar2.f40160z;
                    sdkBaseException = (SdkBaseException) sVar2.f40159y;
                    AbstractC34132o.m107864I(objM79091T);
                    c12066b = this;
                    c12066b.logger.mo85230v(AbstractC11266d.m30461o("got exception during cognito sdk enableMfa call ", simpleName), sdkBaseException, new AbstractC30556a.a[0]);
                    if (sdkBaseException instanceof HttpException) {
                        c12066b.logger.mo85222m("HttpException: something went wrong networking: " + ((HttpException) sdkBaseException).getF8401x(), new AbstractC30556a.a[0]);
                        return C12074j.f40189a;
                    }
                    if (sdkBaseException instanceof InvalidParameterException) {
                        return new InterfaceC12073i.a(sdkBaseException);
                    }
                    ServiceException serviceException = sdkBaseException instanceof ServiceException ? (ServiceException) sdkBaseException : null;
                    InterfaceC33739d interfaceC33739dM106627h = (serviceException == null || (f8399w = serviceException.getF8399w()) == null) ? null : f8399w.m106627h();
                    C37236a c37236a = interfaceC33739dM106627h instanceof C37236a ? (C37236a) interfaceC33739dM106627h : null;
                    c12066b.logger.mo85222m(AbstractC2875y.m8295h((c37236a == null || (c25500tM119336b = c37236a.m119336b()) == null) ? -1 : c25500tM119336b.m74906a(), "error code "), new AbstractC30556a.a[0]);
                    return new InterfaceC12073i.b(sdkBaseException, simpleName);
                }
                c31264d1 = (C31264d1) sVar2.f40159y;
                AbstractC34132o.m107864I(objM79091T);
            }
            listM96288a = c31264d1.m96288a();
            if (listM96288a != null) {
                c31260c0 = (C31260c0) AbstractC25265s.m74100H0(listM96288a);
            } else {
                c31260c0 = null;
            }
            C12065a c12065aM33297v = m33297v(c31260c0);
            InterfaceC13075p1 interfaceC13075p1M33346a = this.mfaChallengeRepository.getChallengeData();
            InterfaceC12085u.a aVar = new InterfaceC12085u.a(c12065aM33297v);
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1M33346a;
            c13045h2.getClass();
            c13045h2.m36571k(null, aVar);
            return new InterfaceC12075k.a(c12065aM33297v);
            this.logger.mo85228t("enable MFA response: " + ((C31264d1) objM79091T), new AbstractC30556a.a[0]);
            c31264d1 = (C31264d1) objM79091T;
            InterfaceC12076l.k kVar = InterfaceC12076l.k.f40211a;
            sVar2.f40157w = null;
            sVar2.f40158x = null;
            sVar2.f40159y = c31264d1;
            sVar2.f40156H = 2;
            if (m33273D(kVar, sVar2) == enumC31071a) {
                return enumC31071a;
            }
            listM96288a = c31264d1.m96288a();
            if (listM96288a != null) {
                c31260c0 = (C31260c0) AbstractC25265s.m74100H0(listM96288a);
            } else {
                c31260c0 = null;
            }
            C12065a c12065aM33297v2 = m33297v(c31260c0);
            InterfaceC13075p1 interfaceC13075p1M33346a2 = this.mfaChallengeRepository.getChallengeData();
            InterfaceC12085u.a aVar2 = new InterfaceC12085u.a(c12065aM33297v2);
            C13045h2 c13045h3 = (C13045h2) interfaceC13075p1M33346a2;
            c13045h3.getClass();
            c13045h3.m36571k(null, aVar2);
            return new InterfaceC12075k.a(c12065aM33297v2);
        } catch (SdkBaseException e5) {
            simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(e5.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            InterfaceC12076l.k kVar2 = InterfaceC12076l.k.f40211a;
            sVar2.f40157w = null;
            sVar2.f40158x = null;
            sVar2.f40159y = e5;
            sVar2.f40160z = simpleName;
            sVar2.f40156H = 3;
            c12066b = this;
            if (m33272C(c12066b, kVar2, e5, null, sVar2, 4, null) != enumC31071a) {
                sdkBaseException = e5;
            }
            return enumC31071a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: M */
    public final Object m33306M(String str, String str2, InterfaceC30057d<? super InterfaceC12084t> interfaceC30057d) {
        t tVar;
        C12066b c12066b;
        SdkBaseException sdkBaseException;
        Object aVar;
        C25500t c25500tM119336b;
        C33740e f8399w;
        C12065a codeDeliveryInfo;
        String attributeName;
        if (interfaceC30057d instanceof t) {
            tVar = (t) interfaceC30057d;
            int i13 = tVar.f40164H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                tVar.f40164H = i13 - Integer.MIN_VALUE;
            } else {
                tVar = new t(interfaceC30057d);
            }
        } else {
            tVar = new t(interfaceC30057d);
        }
        t tVar2 = tVar;
        Object objM79092a0 = tVar2.f40162F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = tVar2.f40164H;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM79092a0);
                this.logger.mo85228t("verifyUserAttribute with", new AbstractC30556a.a[0]);
                Object value = ((C13045h2) this.mfaChallengeRepository.getChallengeData()).getValue();
                InterfaceC12085u.a aVar2 = value instanceof InterfaceC12085u.a ? (InterfaceC12085u.a) value : null;
                if (aVar2 != null && (codeDeliveryInfo = aVar2.getCodeDeliveryInfo()) != null && (attributeName = codeDeliveryInfo.getAttributeName()) != null) {
                    InterfaceC26594c interfaceC26594c = this.identityProviderClient;
                    C4421a c4421a = new C4421a(4);
                    c4421a.m13868c(str2);
                    c4421a.m13869d(attributeName);
                    c4421a.m13870e(str);
                    C31267e1 c31267e1M13867b = c4421a.m13867b();
                    tVar2.f40165w = null;
                    tVar2.f40166x = null;
                    tVar2.f40167y = null;
                    tVar2.f40168z = null;
                    tVar2.f40161E = 0;
                    tVar2.f40164H = 1;
                    objM79092a0 = ((C26595d) interfaceC26594c).m79092a0(c31267e1M13867b, tVar2);
                    if (objM79092a0 != enumC31071a) {
                    }
                    return enumC31071a;
                }
                this.logger.mo85222m("failed to verifyUserAttribute: no challenge data found", new AbstractC30556a.a[0]);
                return new InterfaceC12082r.c(new NoSetupChallengeDataFoundException(), "NoSetupChallengeDataFound", -2);
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM79092a0);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sdkBaseException = (SdkBaseException) tVar2.f40167y;
                    AbstractC34132o.m107864I(objM79092a0);
                    c12066b = this;
                    String simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(sdkBaseException.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "unknown";
                    }
                    ServiceException serviceException = sdkBaseException instanceof ServiceException ? (ServiceException) sdkBaseException : null;
                    InterfaceC33739d interfaceC33739dM106627h = (serviceException == null || (f8399w = serviceException.getF8399w()) == null) ? null : f8399w.m106627h();
                    C37236a c37236a = interfaceC33739dM106627h instanceof C37236a ? (C37236a) interfaceC33739dM106627h : null;
                    int iM74906a = (c37236a == null || (c25500tM119336b = c37236a.m119336b()) == null) ? -1 : c25500tM119336b.m74906a();
                    if (sdkBaseException instanceof HttpException) {
                        c12066b.logger.mo85222m("HttpException: something went wrong networking: " + ((HttpException) sdkBaseException).getF8401x(), new AbstractC30556a.a[0]);
                        return C12083s.f40235a;
                    }
                    if (sdkBaseException instanceof CodeMismatchException) {
                        c12066b.logger.mo85222m("User entered incorrect code", new AbstractC30556a.a[0]);
                        aVar = new InterfaceC12082r.b(sdkBaseException);
                    } else {
                        if (!(sdkBaseException instanceof ExpiredCodeException)) {
                            c12066b.logger.mo85222m(AbstractC11266d.m30456j(iM74906a, "Non network IO exception: ", " ", sdkBaseException.getMessage()), new AbstractC30556a.a[0]);
                            return new InterfaceC12082r.c(sdkBaseException, simpleName, iM74906a);
                        }
                        c12066b.logger.mo85222m("User entered expired code", new AbstractC30556a.a[0]);
                        aVar = new InterfaceC12082r.a(sdkBaseException);
                    }
                    return aVar;
                }
                AbstractC34132o.m107864I(objM79092a0);
            }
            return InterfaceC12084t.a.f40236a;
            this.logger.mo85228t("verifyUserAttribute response: " + ((C31270f1) objM79092a0), new AbstractC30556a.a[0]);
            InterfaceC12076l.l lVar = InterfaceC12076l.l.f40213a;
            tVar2.f40165w = null;
            tVar2.f40166x = null;
            tVar2.f40167y = null;
            tVar2.f40168z = null;
            tVar2.f40164H = 2;
            if (m33273D(lVar, tVar2) == enumC31071a) {
                return enumC31071a;
            }
            return InterfaceC12084t.a.f40236a;
        } catch (SdkBaseException e5) {
            this.logger.mo85230v(AbstractC11266d.m30461o("got exception during cognito verifyUserAttribute call ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(e5.getClass()).getSimpleName()), e5, new AbstractC30556a.a[0]);
            InterfaceC12076l.l lVar2 = InterfaceC12076l.l.f40213a;
            tVar2.f40165w = null;
            tVar2.f40166x = null;
            tVar2.f40167y = e5;
            tVar2.f40168z = null;
            tVar2.f40164H = 3;
            c12066b = this;
            if (m33272C(c12066b, lVar2, e5, null, tVar2, 4, null) != enumC31071a) {
                sdkBaseException = e5;
            }
            return enumC31071a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: p */
    public final Object m33307p(String str, String str2, InterfaceC30057d<? super InterfaceC12069e<C23454a0>> interfaceC30057d) {
        a aVar;
        C12066b c12066b;
        SdkBaseException sdkBaseException;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f40048G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f40048G = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM79091T = aVar2.f40046E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f40048G;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM79091T);
                InterfaceC26594c interfaceC26594c = this.identityProviderClient;
                C29205p c29205p = new C29205p(3, false);
                c29205p.m88712i(str);
                c29205p.m88715l(AbstractC37056f.m118958J(AbstractC35902e.m113938F(new b(str2))));
                C31261c1 c31261c1M88708d = c29205p.m88708d();
                aVar2.f40049w = null;
                aVar2.f40050x = null;
                aVar2.f40051y = null;
                aVar2.f40052z = 0;
                aVar2.f40048G = 1;
                objM79091T = ((C26595d) interfaceC26594c).m79091T(c31261c1M88708d, aVar2);
                if (objM79091T != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM79091T);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sdkBaseException = (SdkBaseException) aVar2.f40051y;
                    AbstractC34132o.m107864I(objM79091T);
                    c12066b = this;
                    c12066b.logger.mo85230v(AbstractC11266d.m30461o("got exception during cognito sdk change email call ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(sdkBaseException.getClass()).getSimpleName()), sdkBaseException, new AbstractC30556a.a[0]);
                    if (!(sdkBaseException instanceof HttpException)) {
                        if (sdkBaseException instanceof AliasExistsException) {
                            return new C12067c(sdkBaseException, AbstractC11266d.m30461o("AliasExistsException: ", ((AliasExistsException) sdkBaseException).getMessage()), 409);
                        }
                        c12066b.logger.mo85222m(AbstractC11266d.m30461o("Failed with ", sdkBaseException.getMessage()), new AbstractC30556a.a[0]);
                        return new C12067c(sdkBaseException, AbstractC11266d.m30461o("Error during Cognito change email: ", sdkBaseException.getMessage()), -2);
                    }
                    c12066b.logger.mo85222m("HttpException: something went wrong networking: " + ((HttpException) sdkBaseException).getF8401x(), new AbstractC30556a.a[0]);
                    return new C12068d(sdkBaseException, AbstractC11266d.m30461o("Network error during Cognito change email: ", sdkBaseException.getMessage()));
                }
                AbstractC34132o.m107864I(objM79091T);
            }
            return new InterfaceC12069e.a(C23454a0.f92919a);
            this.logger.mo85228t("Cognito change email response: " + ((C31264d1) objM79091T), new AbstractC30556a.a[0]);
            InterfaceC12076l.a aVar3 = InterfaceC12076l.a.f40191a;
            aVar2.f40049w = null;
            aVar2.f40050x = null;
            aVar2.f40051y = null;
            aVar2.f40048G = 2;
            if (m33273D(aVar3, aVar2) == enumC31071a) {
                return enumC31071a;
            }
            return new InterfaceC12069e.a(C23454a0.f92919a);
        } catch (SdkBaseException e5) {
            InterfaceC12076l.a aVar4 = InterfaceC12076l.a.f40191a;
            aVar2.f40049w = null;
            aVar2.f40050x = null;
            aVar2.f40051y = e5;
            aVar2.f40048G = 3;
            c12066b = this;
            if (m33272C(c12066b, aVar4, e5, null, aVar2, 4, null) != enumC31071a) {
                sdkBaseException = e5;
            }
            return enumC31071a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: q */
    public final Object m33308q(String str, String str2, String str3, InterfaceC30057d<? super InterfaceC12069e<C23454a0>> interfaceC30057d) {
        c cVar;
        C12066b c12066b;
        SdkBaseException sdkBaseException;
        C25500t c25500tM119336b;
        C33740e f8399w;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f40057H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f40057H = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM79093b = cVar2.f40055F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f40057H;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM79093b);
                InterfaceC26594c interfaceC26594c = this.identityProviderClient;
                C4421a c4421a = new C4421a(3);
                c4421a.m13868c(str);
                c4421a.m13871f(str2);
                c4421a.m13872g(str3);
                C31254a0 c31254a0M13866a = c4421a.m13866a();
                cVar2.f40058w = null;
                cVar2.f40059x = null;
                cVar2.f40060y = null;
                cVar2.f40061z = null;
                cVar2.f40054E = 0;
                cVar2.f40057H = 1;
                objM79093b = ((C26595d) interfaceC26594c).m79093b(c31254a0M13866a, cVar2);
                if (objM79093b != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM79093b);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sdkBaseException = (SdkBaseException) cVar2.f40061z;
                    AbstractC34132o.m107864I(objM79093b);
                    c12066b = this;
                    c12066b.logger.mo85230v(AbstractC11266d.m30461o("got exception during cognito sdk change password call ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(sdkBaseException.getClass()).getSimpleName()), sdkBaseException, new AbstractC30556a.a[0]);
                    if (sdkBaseException instanceof HttpException) {
                        c12066b.logger.mo85222m("HttpException: something went wrong networking: " + ((HttpException) sdkBaseException).getF8401x(), new AbstractC30556a.a[0]);
                        return new C12068d(sdkBaseException, AbstractC11266d.m30461o("Network error during Cognito change password: ", sdkBaseException.getMessage()));
                    }
                    if (sdkBaseException instanceof NotAuthorizedException) {
                        NotAuthorizedException notAuthorizedException = (NotAuthorizedException) sdkBaseException;
                        c12066b.logger.mo85222m(AbstractC11266d.m30461o("NotAuthorizedException ", notAuthorizedException.getMessage()), new AbstractC30556a.a[0]);
                        return new C12067c(sdkBaseException, notAuthorizedException.getMessage(), 403);
                    }
                    if (sdkBaseException instanceof PasswordHistoryPolicyViolationException) {
                        PasswordHistoryPolicyViolationException passwordHistoryPolicyViolationException = (PasswordHistoryPolicyViolationException) sdkBaseException;
                        c12066b.logger.mo85222m(AbstractC11266d.m30461o("PasswordHistoryPolicyViolationException ", passwordHistoryPolicyViolationException.getMessage()), new AbstractC30556a.a[0]);
                        return new C12067c(sdkBaseException, passwordHistoryPolicyViolationException.getMessage(), 409);
                    }
                    if (sdkBaseException instanceof InvalidPasswordException) {
                        InvalidPasswordException invalidPasswordException = (InvalidPasswordException) sdkBaseException;
                        c12066b.logger.mo85222m(AbstractC11266d.m30461o("InvalidPasswordException ", invalidPasswordException.getMessage()), new AbstractC30556a.a[0]);
                        return c12066b.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.PASSWORD_RESET_FLOW) ? new C12067c(sdkBaseException, invalidPasswordException.getMessage(), 403) : new C12067c(sdkBaseException, invalidPasswordException.getMessage(), 422);
                    }
                    ServiceException serviceException = sdkBaseException instanceof ServiceException ? (ServiceException) sdkBaseException : null;
                    InterfaceC33739d interfaceC33739dM106627h = (serviceException == null || (f8399w = serviceException.getF8399w()) == null) ? null : f8399w.m106627h();
                    C37236a c37236a = interfaceC33739dM106627h instanceof C37236a ? (C37236a) interfaceC33739dM106627h : null;
                    int iM74906a = (c37236a == null || (c25500tM119336b = c37236a.m119336b()) == null) ? -1 : c25500tM119336b.m74906a();
                    c12066b.logger.mo85222m(AbstractC11266d.m30461o("Non network exception: ", sdkBaseException.getMessage()), new AbstractC30556a.a[0]);
                    return new C12067c(sdkBaseException, AbstractC11266d.m30461o("Error during Cognito change password: ", sdkBaseException.getMessage()), iM74906a);
                }
                AbstractC34132o.m107864I(objM79093b);
            }
            return new InterfaceC12069e.a(C23454a0.f92919a);
            this.logger.mo85228t("Cognito change password response: " + ((C31257b0) objM79093b), new AbstractC30556a.a[0]);
            InterfaceC12076l.b bVar = InterfaceC12076l.b.f40193a;
            cVar2.f40058w = null;
            cVar2.f40059x = null;
            cVar2.f40060y = null;
            cVar2.f40061z = null;
            cVar2.f40057H = 2;
            if (m33273D(bVar, cVar2) == enumC31071a) {
                return enumC31071a;
            }
            return new InterfaceC12069e.a(C23454a0.f92919a);
        } catch (SdkBaseException e5) {
            InterfaceC12076l.a aVar = InterfaceC12076l.a.f40191a;
            cVar2.f40058w = null;
            cVar2.f40059x = null;
            cVar2.f40060y = null;
            cVar2.f40061z = e5;
            cVar2.f40057H = 3;
            c12066b = this;
            if (m33272C(c12066b, aVar, e5, null, cVar2, 4, null) != enumC31071a) {
                sdkBaseException = e5;
            }
            return enumC31071a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01f0 A[Catch: SdkBaseException -> 0x006c, TryCatch #0 {SdkBaseException -> 0x006c, blocks: (B:15:0x0067, B:68:0x021e, B:20:0x0084, B:65:0x0203, B:23:0x009d, B:60:0x01d2, B:62:0x01f0, B:70:0x0224, B:71:0x022b, B:57:0x0194), top: B:108:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0202  */
    /* JADX WARN: Code duplicated, block: B:65:0x0203 A[Catch: SdkBaseException -> 0x006c, PHI: r2
      0x0203: PHI (r2v36 java.lang.Object) = (r2v35 java.lang.Object), (r2v1 java.lang.Object) binds: [B:63:0x0200, B:20:0x0084] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {SdkBaseException -> 0x006c, blocks: (B:15:0x0067, B:68:0x021e, B:20:0x0084, B:65:0x0203, B:23:0x009d, B:60:0x01d2, B:62:0x01f0, B:70:0x0224, B:71:0x022b, B:57:0x0194), top: B:108:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x021d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0224 A[Catch: SdkBaseException -> 0x006c, TryCatch #0 {SdkBaseException -> 0x006c, blocks: (B:15:0x0067, B:68:0x021e, B:20:0x0084, B:65:0x0203, B:23:0x009d, B:60:0x01d2, B:62:0x01f0, B:70:0x0224, B:71:0x022b, B:57:0x0194), top: B:108:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0105, code lost:
    
        if (r0.mo58700a(r11, r5) == r8) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0167, code lost:
    
        if (r0.mo58700a(r11, r5) == r8) goto L74;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m33309t(java.lang.String r20, q83.InterfaceC30057d<? super dj0.InterfaceC12072h> r21) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dj0.C12066b.m33309t(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: u */
    public final Object m33310u(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        g gVar;
        C12066b c12066b;
        SdkBaseException sdkBaseException;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f40083F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f40083F = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object objM79090J = gVar2.f40087z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f40083F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM79090J);
                this.logger.mo85228t("disableMFA", new AbstractC30556a.a[0]);
                InterfaceC26594c interfaceC26594c = this.identityProviderClient;
                C31302v0 c31302v0 = new C31302v0();
                c31302v0.m96309c(str);
                c31302v0.m96308b(h.f40088w);
                c31302v0.m96310d(i.f40089w);
                c31302v0.m96311e(j.f40090w);
                C31304w0 c31304w0M96307a = c31302v0.m96307a();
                gVar2.f40084w = null;
                gVar2.f40085x = null;
                gVar2.f40086y = 0;
                gVar2.f40083F = 1;
                objM79090J = ((C26595d) interfaceC26594c).m79090J(c31304w0M96307a, gVar2);
                if (objM79090J != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM79090J);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sdkBaseException = (SdkBaseException) gVar2.f40085x;
                    AbstractC34132o.m107864I(objM79090J);
                    c12066b = this;
                    c12066b.logger.mo85230v(AbstractC11266d.m30461o("got exception during cognito sdk disableMFA call ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(sdkBaseException.getClass()).getSimpleName()), sdkBaseException, new AbstractC30556a.a[0]);
                    return Boolean.FALSE;
                }
                AbstractC34132o.m107864I(objM79090J);
            }
            return Boolean.TRUE;
            this.logger.mo85228t("disableMFA response: " + ((C31306x0) objM79090J), new AbstractC30556a.a[0]);
            InterfaceC12076l.h hVar = InterfaceC12076l.h.f40205a;
            gVar2.f40084w = null;
            gVar2.f40085x = null;
            gVar2.f40083F = 2;
            if (m33273D(hVar, gVar2) == enumC31071a) {
                return enumC31071a;
            }
            return Boolean.TRUE;
        } catch (SdkBaseException e5) {
            InterfaceC12076l.h hVar2 = InterfaceC12076l.h.f40205a;
            gVar2.f40084w = null;
            gVar2.f40085x = e5;
            gVar2.f40083F = 3;
            c12066b = this;
            if (m33272C(c12066b, hVar2, e5, null, gVar2, 4, null) != enumC31071a) {
                sdkBaseException = e5;
            }
            return enumC31071a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ce A[Catch: SdkBaseException -> 0x0054, TryCatch #0 {SdkBaseException -> 0x0054, blocks: (B:18:0x0050, B:32:0x00bd, B:33:0x00c8, B:35:0x00ce, B:39:0x00e3, B:41:0x00e7, B:43:0x00ee, B:44:0x00f4, B:46:0x00fa, B:50:0x010f, B:52:0x0113, B:54:0x011c, B:56:0x0122, B:61:0x012c, B:23:0x0060, B:29:0x0094, B:26:0x0070), top: B:69:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7 A[Catch: SdkBaseException -> 0x0054, TryCatch #0 {SdkBaseException -> 0x0054, blocks: (B:18:0x0050, B:32:0x00bd, B:33:0x00c8, B:35:0x00ce, B:39:0x00e3, B:41:0x00e7, B:43:0x00ee, B:44:0x00f4, B:46:0x00fa, B:50:0x010f, B:52:0x0113, B:54:0x011c, B:56:0x0122, B:61:0x012c, B:23:0x0060, B:29:0x0094, B:26:0x0070), top: B:69:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa A[Catch: SdkBaseException -> 0x0054, TryCatch #0 {SdkBaseException -> 0x0054, blocks: (B:18:0x0050, B:32:0x00bd, B:33:0x00c8, B:35:0x00ce, B:39:0x00e3, B:41:0x00e7, B:43:0x00ee, B:44:0x00f4, B:46:0x00fa, B:50:0x010f, B:52:0x0113, B:54:0x011c, B:56:0x0122, B:61:0x012c, B:23:0x0060, B:29:0x0094, B:26:0x0070), top: B:69:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0113 A[Catch: SdkBaseException -> 0x0054, TryCatch #0 {SdkBaseException -> 0x0054, blocks: (B:18:0x0050, B:32:0x00bd, B:33:0x00c8, B:35:0x00ce, B:39:0x00e3, B:41:0x00e7, B:43:0x00ee, B:44:0x00f4, B:46:0x00fa, B:50:0x010f, B:52:0x0113, B:54:0x011c, B:56:0x0122, B:61:0x012c, B:23:0x0060, B:29:0x0094, B:26:0x0070), top: B:69:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:60:0x012b  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: w */
    public final Object m33311w(String str, InterfaceC30057d<? super C14528b> interfaceC30057d) {
        k kVar;
        SdkBaseException sdkBaseException;
        C31284m0 c31284m0;
        Iterator it;
        Object next;
        C31256b c31256b;
        String strM96282b;
        Iterator it3;
        Object next2;
        C31256b c31256b2;
        String strM96282b2;
        List listM96300c;
        boolean z4;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f40092F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f40092F = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        k kVar2 = kVar;
        Object objM79094h = kVar2.f40096z;
        Object obj = EnumC31071a.f128113w;
        int i14 = kVar2.f40092F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM79094h);
                this.logger.mo85228t("getUserMFAStatus", new AbstractC30556a.a[0]);
                InterfaceC26594c interfaceC26594c = this.identityProviderClient;
                C11856j0 c11856j0 = new C11856j0(9);
                c11856j0.m31827m(str);
                C31282l0 c31282l0M31824h = c11856j0.m31824h();
                kVar2.f40093w = null;
                kVar2.f40094x = null;
                kVar2.f40095y = 0;
                kVar2.f40092F = 1;
                objM79094h = ((C26595d) interfaceC26594c).m79094h(c31282l0M31824h, kVar2);
                if (objM79094h == obj) {
                }
                return obj;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM79094h);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sdkBaseException = (SdkBaseException) kVar2.f40094x;
                    AbstractC34132o.m107864I(objM79094h);
                    this.logger.mo85230v(AbstractC11266d.m30461o("got exception during cognito sdk getUser call ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(sdkBaseException.getClass()).getSimpleName()), sdkBaseException, new AbstractC30556a.a[0]);
                    return null;
                }
                c31284m0 = (C31284m0) kVar2.f40094x;
                AbstractC34132o.m107864I(objM79094h);
            }
            List listM96299b = c31284m0.m96299b();
            it = listM96299b.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((C31256b) next).m96281a(), NotificationCompat.CATEGORY_EMAIL));
            c31256b = (C31256b) next;
            if (c31256b != null) {
                strM96282b = c31256b.m96282b();
            } else {
                strM96282b = null;
            }
            it3 = listM96299b.iterator();
            do {
                if (it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!AbstractC22676k.m65745e(((C31256b) next2).m96281a(), "phone_number"));
            c31256b2 = (C31256b) next2;
            if (c31256b2 != null) {
                strM96282b2 = c31256b2.m96282b();
            } else {
                strM96282b2 = null;
            }
            listM96300c = c31284m0.m96300c();
            if (listM96300c != null || listM96300c.isEmpty()) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new C14528b(!z4, c31284m0.m96298a(), listM96300c, strM96282b, strM96282b2);
            this.logger.mo85228t("getUser response: " + ((C31284m0) objM79094h), new AbstractC30556a.a[0]);
            c31284m0 = (C31284m0) objM79094h;
            InterfaceC12076l interfaceC12076l = InterfaceC12076l.d.f40197a;
            kVar2.f40093w = null;
            kVar2.f40094x = c31284m0;
            kVar2.f40092F = 2;
            if (m33273D(interfaceC12076l, kVar2) == obj) {
                return obj;
            }
            List listM96299b2 = c31284m0.m96299b();
            it = listM96299b2.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((C31256b) next).m96281a(), NotificationCompat.CATEGORY_EMAIL));
            c31256b = (C31256b) next;
            if (c31256b != null) {
                strM96282b = c31256b.m96282b();
            } else {
                strM96282b = null;
            }
            it3 = listM96299b2.iterator();
            do {
                if (it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!AbstractC22676k.m65745e(((C31256b) next2).m96281a(), "phone_number"));
            c31256b2 = (C31256b) next2;
            if (c31256b2 != null) {
                strM96282b2 = c31256b2.m96282b();
            } else {
                strM96282b2 = null;
            }
            listM96300c = c31284m0.m96300c();
            if (listM96300c != null) {
                z4 = true;
            } else {
                z4 = true;
            }
            return new C14528b(!z4, c31284m0.m96298a(), listM96300c, strM96282b, strM96282b2);
        } catch (SdkBaseException e5) {
            InterfaceC12076l.d dVar = InterfaceC12076l.d.f40197a;
            kVar2.f40093w = null;
            kVar2.f40094x = e5;
            kVar2.f40092F = 3;
            if (m33272C(this, dVar, e5, null, kVar2, 4, null) != obj) {
                sdkBaseException = e5;
            }
            return obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0251  */
    /* JADX WARN: Code duplicated, block: B:104:0x027b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:105:0x027c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0130  */
    /* JADX WARN: Code duplicated, block: B:56:0x0150  */
    /* JADX WARN: Code duplicated, block: B:59:0x0164  */
    /* JADX WARN: Code duplicated, block: B:60:0x0184  */
    /* JADX WARN: Code duplicated, block: B:62:0x0188  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x0206  */
    /* JADX WARN: Code duplicated, block: B:85:0x020a A[PHI: r0 r2 r7 r9 r10
      0x020a: PHI (r0v25 wf.a) = (r0v16 wf.a), (r0v28 wf.a) binds: [B:79:0x01da, B:84:0x0208] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r2v32 int) = (r2v9 int), (r2v33 int) binds: [B:79:0x01da, B:84:0x0208] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r7v4 ??) = (r7v17 ??), (r7v5 ??) binds: [B:79:0x01da, B:84:0x0208] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v3 java.lang.String) binds: [B:79:0x01da, B:84:0x0208] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r10v4 aws.smithy.kotlin.runtime.SdkBaseException) = (r10v2 aws.smithy.kotlin.runtime.SdkBaseException), (r10v5 aws.smithy.kotlin.runtime.SdkBaseException) binds: [B:79:0x01da, B:84:0x0208] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0210  */
    /* JADX WARN: Code duplicated, block: B:90:0x0213  */
    /* JADX WARN: Code duplicated, block: B:94:0x0223  */
    /* JADX WARN: Code duplicated, block: B:97:0x022f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x0164, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [dj0.b] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX INFO: renamed from: y */
    public final Object m33312y(String str, boolean z4, InterfaceC30057d<? super InterfaceC12077m> interfaceC30057d) {
        m mVar;
        SdkBaseException sdkBaseException;
        ?? r10;
        String simpleName;
        String str2;
        Object c41475a;
        ServiceException serviceException;
        InterfaceC33739d interfaceC33739dM106627h;
        C37236a c37236a;
        int i13;
        InterfaceC21030c interfaceC21030c;
        C22047a c22047a;
        C37236a c37236a2;
        boolean z13;
        ?? r14;
        List listM118959K;
        InterfaceC12076l.f fVar;
        ?? r15;
        C25500t c25500tM119336b;
        boolean z14;
        boolean z15;
        boolean z16;
        C14527a c14527a;
        InterfaceC12076l.f fVar2;
        ?? r16 = "Cognito token refresh response: ";
        if (interfaceC30057d instanceof m) {
            mVar = (m) interfaceC30057d;
            int i14 = mVar.f40110K;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f40110K = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(interfaceC30057d);
            }
        } else {
            mVar = new m(interfaceC30057d);
        }
        Object objM79096k = mVar.f40108I;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = mVar.f40110K;
        int iM74906a = -1;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objM79096k);
                try {
                    InterfaceC26594c interfaceC26594c = this.identityProviderClient;
                    C29662f c29662f = new C29662f(3, false);
                    c29662f.m91087I0(this.cognitoClientId);
                    c29662f.m91080D0(C31262d.f128775a);
                    c29662f.m91082E0(AbstractC25247g0.m73989X(new C23465k("REFRESH_TOKEN", str)));
                    C31286n0 c31286n0M91118i0 = c29662f.m91118i0();
                    mVar.f40111w = null;
                    mVar.f40112x = null;
                    z14 = z4;
                    try {
                        mVar.f40106G = z14;
                        mVar.f40107H = 0;
                        mVar.f40110K = 1;
                        objM79096k = ((C26595d) interfaceC26594c).m79096k(c31286n0M91118i0, mVar);
                        if (objM79096k != enumC31071a) {
                            z15 = z14 ? 1 : 0;
                        }
                    } catch (SdkBaseException e5) {
                        e = e5;
                        sdkBaseException = e;
                        r10 = z14;
                        simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(sdkBaseException.getClass()).getSimpleName();
                        if (simpleName == null) {
                            simpleName = "unknown";
                        }
                        str2 = simpleName;
                        this.logger.mo85230v("got exception during cognito sdk refresh call ".concat(str2), sdkBaseException, new AbstractC30556a.a[0]);
                        if (sdkBaseException instanceof HttpException) {
                            this.logger.mo85222m("HttpException: something went wrong networking: " + ((HttpException) sdkBaseException).getF8401x(), new AbstractC30556a.a[0]);
                            c41475a = InterfaceC12077m.a.b.f40219a;
                            r14 = r10;
                        } else if (sdkBaseException instanceof ClientException) {
                            this.logger.mo85222m(AbstractC11266d.m30461o("ClientException: something went wrong with the client: ", sdkBaseException.getMessage()), new AbstractC30556a.a[0]);
                            c41475a = new InterfaceC12077m.a.C41475a(sdkBaseException, -1, true, str2);
                            r14 = r10;
                        } else if (sdkBaseException instanceof ServiceException) {
                            serviceException = (ServiceException) sdkBaseException;
                            this.logger.mo85222m(AbstractC11266d.m30461o("ServiceException ", serviceException.getMessage()), new AbstractC30556a.a[0]);
                            interfaceC33739dM106627h = serviceException.getF8399w().m106627h();
                            if (interfaceC33739dM106627h instanceof C37236a) {
                                c37236a = (C37236a) interfaceC33739dM106627h;
                            } else {
                                c37236a = null;
                            }
                            if (!(serviceException instanceof InternalErrorException) || (serviceException instanceof UnexpectedLambdaException) || (serviceException instanceof TooManyRequestsException)) {
                                i13 = 1;
                            } else {
                                i13 = 0;
                            }
                            r15 = r10;
                            if (sdkBaseException instanceof InvalidParameterException) {
                                interfaceC21030c = this.metricWriter;
                                c22047a = new C22047a(0, "cognito.refresh.invalid_parameter", null, C25271y.f99162w, null, 21, null);
                                mVar.f40111w = null;
                                mVar.f40112x = sdkBaseException;
                                mVar.f40113y = str2;
                                mVar.f40114z = c37236a;
                                mVar.f40106G = r10;
                                mVar.f40107H = i13;
                                mVar.f40110K = 4;
                                if (interfaceC21030c.mo58700a(c22047a, mVar) != enumC31071a) {
                                    c37236a2 = c37236a;
                                    z13 = r10 == true ? 1 : 0;
                                    r15 = z13;
                                    c37236a = c37236a2;
                                    ServiceException serviceException2 = (ServiceException) sdkBaseException;
                                    if (i13 == 0) {
                                    }
                                    if (c37236a != null) {
                                        iM74906a = c25500tM119336b.m74906a();
                                    }
                                    c41475a = new InterfaceC12077m.a.C41475a(serviceException2, iM74906a, z, str2);
                                    r14 = r15;
                                }
                            } else {
                                ServiceException serviceException3 = (ServiceException) sdkBaseException;
                                if (i13 == 0) {
                                }
                                if (c37236a != null) {
                                    iM74906a = c25500tM119336b.m74906a();
                                }
                                c41475a = new InterfaceC12077m.a.C41475a(serviceException3, iM74906a, z, str2);
                                r14 = r15;
                            }
                        } else {
                            c41475a = new InterfaceC12077m.a.C41475a(sdkBaseException, -2, true, str2);
                            r14 = r10;
                        }
                        if (c41475a instanceof InterfaceC12077m.a.C41475a) {
                            listM118959K = AbstractC37056f.m118959K(AbstractC11266d.m30462p("user_signed_out:", ((InterfaceC12077m.a.C41475a) c41475a).getSignOutUser()), AbstractC11266d.m30462p("onboarding:", r14));
                        } else {
                            if (!AbstractC22676k.m65745e(c41475a, InterfaceC12077m.a.b.f40219a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            listM118959K = AbstractC37056f.m118959K("user_signed_out:false", AbstractC11266d.m30462p("onboarding:", r14));
                        }
                        fVar = InterfaceC12076l.f.f40201a;
                        mVar.f40111w = null;
                        mVar.f40112x = null;
                        mVar.f40113y = null;
                        mVar.f40114z = c41475a;
                        mVar.f40104E = null;
                        mVar.f40105F = null;
                        mVar.f40106G = r14;
                        mVar.f40107H = 0;
                        mVar.f40110K = 5;
                        if (m33271B(fVar, sdkBaseException, listM118959K, mVar) == enumC31071a) {
                            return c41475a;
                        }
                    }
                } catch (SdkBaseException e13) {
                    e = e13;
                    z14 = z4;
                }
                return enumC31071a;
            }
            if (i15 == 1) {
                z15 = mVar.f40106G;
                try {
                    AbstractC34132o.m107864I(objM79096k);
                } catch (SdkBaseException e14) {
                    sdkBaseException = e14;
                    r10 = z15;
                    simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(sdkBaseException.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "unknown";
                    }
                    str2 = simpleName;
                    this.logger.mo85230v("got exception during cognito sdk refresh call ".concat(str2), sdkBaseException, new AbstractC30556a.a[0]);
                    if (sdkBaseException instanceof HttpException) {
                        this.logger.mo85222m("HttpException: something went wrong networking: " + ((HttpException) sdkBaseException).getF8401x(), new AbstractC30556a.a[0]);
                        c41475a = InterfaceC12077m.a.b.f40219a;
                        r14 = r10;
                    } else if (sdkBaseException instanceof ClientException) {
                        this.logger.mo85222m(AbstractC11266d.m30461o("ClientException: something went wrong with the client: ", sdkBaseException.getMessage()), new AbstractC30556a.a[0]);
                        c41475a = new InterfaceC12077m.a.C41475a(sdkBaseException, -1, true, str2);
                        r14 = r10;
                    } else if (sdkBaseException instanceof ServiceException) {
                        serviceException = (ServiceException) sdkBaseException;
                        this.logger.mo85222m(AbstractC11266d.m30461o("ServiceException ", serviceException.getMessage()), new AbstractC30556a.a[0]);
                        interfaceC33739dM106627h = serviceException.getF8399w().m106627h();
                        if (interfaceC33739dM106627h instanceof C37236a) {
                            c37236a = (C37236a) interfaceC33739dM106627h;
                        } else {
                            c37236a = null;
                        }
                        if (serviceException instanceof InternalErrorException) {
                            i13 = 1;
                        } else {
                            i13 = 1;
                        }
                        r15 = r10;
                        if (sdkBaseException instanceof InvalidParameterException) {
                            interfaceC21030c = this.metricWriter;
                            c22047a = new C22047a(0, "cognito.refresh.invalid_parameter", null, C25271y.f99162w, null, 21, null);
                            mVar.f40111w = null;
                            mVar.f40112x = sdkBaseException;
                            mVar.f40113y = str2;
                            mVar.f40114z = c37236a;
                            mVar.f40106G = r10;
                            mVar.f40107H = i13;
                            mVar.f40110K = 4;
                            if (interfaceC21030c.mo58700a(c22047a, mVar) != enumC31071a) {
                                c37236a2 = c37236a;
                                z13 = r10 == true ? 1 : 0;
                                r15 = z13;
                                c37236a = c37236a2;
                                ServiceException serviceException4 = (ServiceException) sdkBaseException;
                                if (i13 == 0) {
                                }
                                if (c37236a != null) {
                                    iM74906a = c25500tM119336b.m74906a();
                                }
                                c41475a = new InterfaceC12077m.a.C41475a(serviceException4, iM74906a, z, str2);
                                r14 = r15;
                            }
                        } else {
                            ServiceException serviceException5 = (ServiceException) sdkBaseException;
                            if (i13 == 0) {
                            }
                            if (c37236a != null) {
                                iM74906a = c25500tM119336b.m74906a();
                            }
                            c41475a = new InterfaceC12077m.a.C41475a(serviceException5, iM74906a, z, str2);
                            r14 = r15;
                        }
                    } else {
                        c41475a = new InterfaceC12077m.a.C41475a(sdkBaseException, -2, true, str2);
                        r14 = r10;
                    }
                    if (c41475a instanceof InterfaceC12077m.a.C41475a) {
                        listM118959K = AbstractC37056f.m118959K(AbstractC11266d.m30462p("user_signed_out:", ((InterfaceC12077m.a.C41475a) c41475a).getSignOutUser()), AbstractC11266d.m30462p("onboarding:", r14));
                    } else {
                        if (!AbstractC22676k.m65745e(c41475a, InterfaceC12077m.a.b.f40219a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listM118959K = AbstractC37056f.m118959K("user_signed_out:false", AbstractC11266d.m30462p("onboarding:", r14));
                    }
                    fVar = InterfaceC12076l.f.f40201a;
                    mVar.f40111w = null;
                    mVar.f40112x = null;
                    mVar.f40113y = null;
                    mVar.f40114z = c41475a;
                    mVar.f40104E = null;
                    mVar.f40105F = null;
                    mVar.f40106G = r14;
                    mVar.f40107H = 0;
                    mVar.f40110K = 5;
                    if (m33271B(fVar, sdkBaseException, listM118959K, mVar) == enumC31071a) {
                        return c41475a;
                    }
                }
            } else if (i15 == 2) {
                boolean z17 = mVar.f40106G;
                AbstractC34132o.m107864I(objM79096k);
                z16 = z17;
                c14527a = (C14527a) objM79096k;
                fVar2 = InterfaceC12076l.f.f40201a;
                mVar.f40111w = null;
                mVar.f40112x = null;
                mVar.f40113y = c14527a;
                mVar.f40106G = z16;
                mVar.f40110K = 3;
                r16 = z16;
                if (m33273D(fVar2, mVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 3) {
                    if (i15 != 4) {
                        if (i15 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC12077m.a aVar = (InterfaceC12077m.a) mVar.f40114z;
                        AbstractC34132o.m107864I(objM79096k);
                        return aVar;
                    }
                    i13 = mVar.f40107H;
                    z13 = mVar.f40106G;
                    c37236a2 = (C37236a) mVar.f40114z;
                    str2 = (String) mVar.f40113y;
                    sdkBaseException = (SdkBaseException) mVar.f40112x;
                    AbstractC34132o.m107864I(objM79096k);
                    r15 = z13;
                    c37236a = c37236a2;
                    ServiceException serviceException6 = (ServiceException) sdkBaseException;
                    boolean z18 = i13 == 0;
                    if (c37236a != null && (c25500tM119336b = c37236a.m119336b()) != null) {
                        iM74906a = c25500tM119336b.m74906a();
                    }
                    c41475a = new InterfaceC12077m.a.C41475a(serviceException6, iM74906a, z18, str2);
                    r14 = r15;
                    if (c41475a instanceof InterfaceC12077m.a.C41475a) {
                        listM118959K = AbstractC37056f.m118959K(AbstractC11266d.m30462p("user_signed_out:", ((InterfaceC12077m.a.C41475a) c41475a).getSignOutUser()), AbstractC11266d.m30462p("onboarding:", r14));
                    } else {
                        if (!AbstractC22676k.m65745e(c41475a, InterfaceC12077m.a.b.f40219a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listM118959K = AbstractC37056f.m118959K("user_signed_out:false", AbstractC11266d.m30462p("onboarding:", r14));
                    }
                    fVar = InterfaceC12076l.f.f40201a;
                    mVar.f40111w = null;
                    mVar.f40112x = null;
                    mVar.f40113y = null;
                    mVar.f40114z = c41475a;
                    mVar.f40104E = null;
                    mVar.f40105F = null;
                    mVar.f40106G = r14;
                    mVar.f40107H = 0;
                    mVar.f40110K = 5;
                    if (m33271B(fVar, sdkBaseException, listM118959K, mVar) == enumC31071a) {
                        return enumC31071a;
                    }
                    return c41475a;
                }
                boolean z19 = mVar.f40106G;
                c14527a = (C14527a) mVar.f40113y;
                AbstractC34132o.m107864I(objM79096k);
                r16 = z19;
            }
            return new InterfaceC12077m.b(c14527a);
            this.logger.mo85228t("Cognito token refresh response: " + ((C31288o0) objM79096k), new AbstractC30556a.a[0]);
            mVar.f40111w = null;
            mVar.f40112x = null;
            mVar.f40106G = z15;
            mVar.f40110K = 2;
            objM79096k = m33296s((C31288o0) objM79096k, mVar);
            if (objM79096k != enumC31071a) {
                z16 = z15 ? 1 : 0;
                c14527a = (C14527a) objM79096k;
                fVar2 = InterfaceC12076l.f.f40201a;
                mVar.f40111w = null;
                mVar.f40112x = null;
                mVar.f40113y = c14527a;
                mVar.f40106G = z16;
                mVar.f40110K = 3;
                r16 = z16;
                if (m33273D(fVar2, mVar) == enumC31071a) {
                }
                return new InterfaceC12077m.b(c14527a);
            }
        } catch (SdkBaseException e15) {
            sdkBaseException = e15;
            r10 = r16;
        }
        return enumC31071a;
    }

    public /* synthetic */ C12066b(FeatureFlagChecker featureFlagChecker, InterfaceC26594c interfaceC26594c, String str, InterfaceC21030c interfaceC21030c, C12086v c12086v, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagChecker, interfaceC26594c, (i13 & 4) != 0 ? "5311fm7hqak9lrnpht6kp2p5uh" : str, interfaceC21030c, c12086v, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CognitoAuthApi") : interfaceC34116n);
    }
}
