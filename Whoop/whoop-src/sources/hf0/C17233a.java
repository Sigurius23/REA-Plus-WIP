package hf0;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: hf0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lhf0/a;", "", "<init>", "()V", "", "baseUrl", "testType", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "b", "Ljava/lang/String;", "typeformStartQueryParametersCharacter", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17233a {

    /* JADX INFO: renamed from: a */
    public static final C17233a f66224a = new C17233a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String typeformStartQueryParametersCharacter = "#";

    private C17233a() {
    }

    /* JADX INFO: renamed from: a */
    public final String m48739a(String baseUrl, String testType) {
        if (baseUrl == null) {
            return null;
        }
        if (testType == null || AbstractC39414r.m125890i0(testType)) {
            return baseUrl;
        }
        String str = typeformStartQueryParametersCharacter;
        if (AbstractC39414r.m125876U(baseUrl, str, false)) {
            str = "&";
        }
        return AbstractC11895b.m31997p(baseUrl, str, "test_type=", testType);
    }
}
