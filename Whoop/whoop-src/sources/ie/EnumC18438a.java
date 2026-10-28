package ie;

import bf.InterfaceC3186a;
import com.whoop.service.network.model.UserSessionDto;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v20 ie.a[], still in use, count: 1, list:
  (r0v20 ie.a[]) from 0x0120: INVOKE (r0v20 ie.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ie.a */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC18438a implements InterfaceC3186a {
    CREDENTIALS_CODE("e"),
    CREDENTIALS_JVM_SYSTEM_PROPERTIES("f"),
    CREDENTIALS_ENV_VARS("g"),
    CREDENTIALS_ENV_VARS_STS_WEB_ID_TOKEN(StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT),
    CREDENTIALS_STS_ASSUME_ROLE("i"),
    CREDENTIALS_STS_ASSUME_ROLE_WEB_ID("k"),
    CREDENTIALS_PROFILE("n"),
    CREDENTIALS_PROFILE_SOURCE_PROFILE("o"),
    CREDENTIALS_PROFILE_NAMED_PROVIDER("p"),
    CREDENTIALS_PROFILE_STS_WEB_ID_TOKEN("q"),
    CREDENTIALS_PROFILE_SSO("r"),
    CREDENTIALS_SSO("s"),
    CREDENTIALS_PROFILE_SSO_LEGACY("t"),
    CREDENTIALS_SSO_LEGACY("u"),
    CREDENTIALS_PROFILE_PROCESS("v"),
    CREDENTIALS_PROCESS(StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH),
    CREDENTIALS_HTTP("z"),
    CREDENTIALS_IMDS(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE),
    CREDENTIALS_PROFILE_LOGIN("AC"),
    CREDENTIALS_LOGIN("AD");


    /* JADX INFO: renamed from: w */
    public final String f71795w;

    static {
        AbstractC15751g.m44468u(enumC18438aArr);
    }

    public EnumC18438a(String str) {
        super(str, i);
        this.f71795w = str;
    }

    public static EnumC18438a valueOf(String str) {
        return (EnumC18438a) Enum.valueOf(EnumC18438a.class, str);
    }

    public static EnumC18438a[] values() {
        return (EnumC18438a[]) f71791V.clone();
    }

    @Override // bf.InterfaceC3186a
    /* JADX INFO: renamed from: a */
    public final String mo9168a() {
        return this.f71795w;
    }
}
