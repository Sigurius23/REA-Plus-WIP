package p646yd;

import cg.C4559n;
import cg.C4560o;
import live.hms.video.utils.HMSConstantsKt;
import p163g1.C14954a7;
import p182h3.C16793i;
import p250jf.AbstractC21636e;
import p250jf.C21632a;
import p250jf.C21637f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: yd.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39455f {

    /* JADX INFO: renamed from: a */
    public static final C21632a f169739a;

    /* JADX INFO: renamed from: b */
    public static final C21632a f169740b;

    /* JADX INFO: renamed from: c */
    public static final C21632a f169741c;

    /* JADX INFO: renamed from: d */
    public static final C21632a f169742d;

    /* JADX INFO: renamed from: e */
    public static final C21632a f169743e;

    /* JADX INFO: renamed from: f */
    public static final C21637f f169744f;

    /* JADX INFO: renamed from: g */
    public static final C21632a f169745g;

    /* JADX INFO: renamed from: h */
    public static final C21632a f169746h;

    /* JADX INFO: renamed from: i */
    public static final C21632a f169747i;

    /* JADX INFO: renamed from: j */
    public static final C21632a f169748j;

    /* JADX INFO: renamed from: k */
    public static final C21632a f169749k;

    /* JADX INFO: renamed from: l */
    public static final C21632a f169750l;

    /* JADX INFO: renamed from: m */
    public static final C21632a f169751m;

    /* JADX INFO: renamed from: n */
    public static final C21632a f169752n;

    /* JADX INFO: renamed from: o */
    public static final C21632a f169753o;

    /* JADX INFO: renamed from: p */
    public static final C21632a f169754p;

    /* JADX INFO: renamed from: q */
    public static final C21632a f169755q;

    /* JADX INFO: renamed from: r */
    public static final C21632a f169756r;

    /* JADX INFO: renamed from: s */
    public static final C21632a f169757s;

    /* JADX INFO: renamed from: t */
    public static final C21632a f169758t;

    /* JADX INFO: renamed from: u */
    public static final C21632a f169759u;

    /* JADX INFO: renamed from: v */
    public static final C21632a f169760v;

    /* JADX INFO: renamed from: w */
    public static final C21632a f169761w;

    /* JADX INFO: renamed from: x */
    public static final C21632a f169762x;

    /* JADX INFO: renamed from: y */
    public static final C21632a f169763y;

    /* JADX INFO: renamed from: z */
    public static final C21632a f169764z;

    static {
        C14954a7 c14954a7 = AbstractC21636e.f83075d;
        f169739a = (C21632a) c14954a7.invoke("aws.accessKeyId", "AWS_ACCESS_KEY_ID");
        f169740b = (C21632a) c14954a7.invoke("aws.secretAccessKey", "AWS_SECRET_ACCESS_KEY");
        f169741c = (C21632a) c14954a7.invoke("aws.sessionToken", "AWS_SESSION_TOKEN");
        f169742d = (C21632a) c14954a7.invoke("aws.region", "AWS_REGION");
        f169743e = (C21632a) c14954a7.invoke("aws.accountId", "AWS_ACCOUNT_ID");
        f169744f = AbstractC21636e.m60884e((C21632a) c14954a7.invoke("aws.userAgentAppId", "AWS_SDK_UA_APP_ID"), AbstractC37056f.m118958J("sdk.ua.appId"));
        f169745g = (C21632a) c14954a7.invoke("aws.configFile", "AWS_CONFIG_FILE");
        f169746h = (C21632a) c14954a7.invoke("aws.sharedCredentialsFile", "AWS_SHARED_CREDENTIALS_FILE");
        c14954a7.invoke("aws.executionEnvironment", "AWS_EXECUTION_ENV");
        C21632a c21632a = (C21632a) c14954a7.invoke("aws.profile", "AWS_PROFILE");
        Function1 parse = c21632a.f83065a;
        String sysProp = c21632a.f83066b;
        String envVar = c21632a.f83067c;
        AbstractC22676k.m65750j(parse, "parse");
        AbstractC22676k.m65750j(sysProp, "sysProp");
        AbstractC22676k.m65750j(envVar, "envVar");
        f169747i = new C21632a(parse, sysProp, envVar, HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY);
        C14954a7 c14954a8 = AbstractC21636e.f83072a;
        C21632a c21632a2 = (C21632a) c14954a8.invoke("aws.disableEc2Metadata", "AWS_EC2_METADATA_DISABLED");
        Boolean bool = Boolean.FALSE;
        Function1 parse2 = c21632a2.f83065a;
        String sysProp2 = c21632a2.f83066b;
        String envVar2 = c21632a2.f83067c;
        AbstractC22676k.m65750j(parse2, "parse");
        AbstractC22676k.m65750j(sysProp2, "sysProp");
        AbstractC22676k.m65750j(envVar2, "envVar");
        f169748j = new C21632a(parse2, sysProp2, envVar2, bool);
        f169749k = (C21632a) c14954a7.invoke("aws.ec2MetadataServiceEndpoint", "AWS_EC2_METADATA_SERVICE_ENDPOINT");
        f169750l = (C21632a) c14954a7.invoke("aws.ec2MetadataServiceEndpointMode", "AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE");
        f169751m = (C21632a) c14954a7.invoke("aws.roleArn", "AWS_ROLE_ARN");
        f169752n = (C21632a) c14954a7.invoke("aws.roleSessionName", "AWS_ROLE_SESSION_NAME");
        f169753o = (C21632a) c14954a7.invoke("aws.webIdentityTokenFile", "AWS_WEB_IDENTITY_TOKEN_FILE");
        f169754p = (C21632a) c14954a7.invoke("aws.containerCredentialsPath", "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI");
        f169755q = (C21632a) c14954a7.invoke("aws.containerCredentialsFullUri", "AWS_CONTAINER_CREDENTIALS_FULL_URI");
        f169756r = (C21632a) c14954a7.invoke("aws.containerAuthorizationToken", "AWS_CONTAINER_AUTHORIZATION_TOKEN");
        f169757s = (C21632a) c14954a7.invoke("aws.containerAuthorizationTokenFile", "AWS_CONTAINER_AUTHORIZATION_TOKEN_FILE");
        f169758t = (C21632a) AbstractC21636e.f83073b.invoke("aws.maxAttempts", "AWS_MAX_ATTEMPTS");
        f169759u = new C21632a(C39454e.f169735x, "aws.retryMode", "AWS_RETRY_MODE", null);
        f169760v = (C21632a) c14954a8.invoke("aws.useFipsEndpoint", "AWS_USE_FIPS_ENDPOINT");
        f169761w = (C21632a) c14954a8.invoke("aws.useDualstackEndpoint", "AWS_USE_DUALSTACK_ENDPOINT");
        f169762x = new C21632a(new C16793i(1, C4560o.f18367i, C4559n.class, "parse", "parse(Ljava/lang/String;Laws/smithy/kotlin/runtime/net/url/UrlEncoding;)Laws/smithy/kotlin/runtime/net/url/Url;", 0, 2), "aws.endpointUrl", "AWS_ENDPOINT_URL", null);
        f169763y = (C21632a) c14954a8.invoke("aws.ignoreConfiguredEndpointUrls", "AWS_IGNORE_CONFIGURED_ENDPOINT_URLS");
        c14954a8.invoke("aws.disableRequestCompression", "AWS_DISABLE_REQUEST_COMPRESSION");
        AbstractC21636e.f83074c.invoke("aws.requestMinCompressionSizeBytes", "AWS_REQUEST_MIN_COMPRESSION_SIZE_BYTES");
        AbstractC21636e.m60884e((C21632a) c14954a7.invoke("aws.sigV4aSigningRegionSet", "AWS_SIGV4A_SIGNING_REGION_SET"), AbstractC37056f.m118958J("aws.sigv4a.signing.region.set"));
        c14954a8.invoke("aws.endpointDiscoveryEnabled", "AWS_ENABLE_ENDPOINT_DISCOVERY");
        new C21632a(C39454e.f169736y, "aws.requestChecksumCalculation", "AWS_REQUEST_CHECKSUM_CALCULATION", null);
        new C21632a(C39454e.f169737z, "aws.responseChecksumValidation", "AWS_RESPONSE_CHECKSUM_VALIDATION", null);
        f169764z = (C21632a) c14954a7.invoke("aws.authSchemePreference", "AWS_AUTH_SCHEME_PREFERENCE");
    }

    /* JADX INFO: renamed from: a */
    public static C21632a m125995a() {
        return f169756r;
    }

    /* JADX INFO: renamed from: b */
    public static C21632a m125996b() {
        return f169757s;
    }

    /* JADX INFO: renamed from: c */
    public static C21632a m125997c() {
        return f169755q;
    }

    /* JADX INFO: renamed from: d */
    public static C21632a m125998d() {
        return f169754p;
    }

    /* JADX INFO: renamed from: e */
    public static C21632a m125999e() {
        return f169748j;
    }

    /* JADX INFO: renamed from: f */
    public static C21632a m126000f() {
        return f169742d;
    }
}
