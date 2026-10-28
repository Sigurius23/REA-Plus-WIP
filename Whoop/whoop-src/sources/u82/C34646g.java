package u82;

import ad3.AbstractC0757c;
import com.google.gson.Gson;
import java.util.Set;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.AbstractC29185f;
import pg3.AbstractC29199m;
import pg3.C29222x0;
import pg3.C29224y0;
import rg3.C31410a;
import ud3.C34826l0;

/* JADX INFO: renamed from: u82.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lu82/g;", "", "Ll83/h;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Ll83/h;)V", "Lcom/google/gson/Gson;", "gson", "Lad3/c;", "json", "", "", "flagNames", "Lpg3/m;", "c", "(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lpg3/m;", "baseUrl", "Lud3/l0;", "client", "Lpg3/f;", "callAdapterFactory", "Lpg3/y0;", "a", "(Ljava/lang/String;Lud3/l0;Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;Lpg3/f;)Lpg3/y0;", "Ll83/h;", "serialization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34646g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    public C34646g(InterfaceC23462h featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C29224y0 m109483b(C34646g c34646g, String str, C34826l0 c34826l0, Gson gson, AbstractC0757c abstractC0757c, Set set, AbstractC29185f abstractC29185f, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            abstractC29185f = null;
        }
        return c34646g.m109485a(str, c34826l0, gson, abstractC0757c, set, abstractC29185f);
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC29199m m109484c(Gson gson, AbstractC0757c json, Set<String> flagNames) {
        return new C34643d(this.featureFlagChecker, flagNames, C31410a.m96728a(gson), AbstractC34645f.m109482a(json));
    }

    /* JADX INFO: renamed from: a */
    public final C29224y0 m109485a(String baseUrl, C34826l0 client, Gson gson, AbstractC0757c json, Set<String> flagNames, AbstractC29185f callAdapterFactory) {
        AbstractC22676k.m65750j(baseUrl, "baseUrl");
        AbstractC22676k.m65750j(client, "client");
        AbstractC22676k.m65750j(gson, "gson");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(flagNames, "flagNames");
        AbstractC29199m abstractC29199mM109484c = m109484c(gson, json, flagNames);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.f118281a = client;
        c29222x0.m88729c(baseUrl);
        c29222x0.m88728b(abstractC29199mM109484c);
        if (callAdapterFactory != null) {
            c29222x0.m88727a(callAdapterFactory);
        }
        return c29222x0.m88730d();
    }
}
