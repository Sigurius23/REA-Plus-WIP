package u82;

import ad3.AbstractC0757c;
import com.google.gson.Gson;
import java.util.Set;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rg3.C31410a;

/* JADX INFO: renamed from: u82.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lu82/e;", "", "Ll83/h;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Ll83/h;)V", "Lcom/google/gson/Gson;", "gson", "Lad3/c;", "json", "", "", "flagNames", "Lu82/d;", "a", "(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lu82/d;", "Ll83/h;", "serialization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34644e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    public C34644e(InterfaceC23462h featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    public final C34643d m109481a(Gson gson, AbstractC0757c json, Set<String> flagNames) {
        AbstractC22676k.m65750j(gson, "gson");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(flagNames, "flagNames");
        return new C34643d(this.featureFlagChecker, flagNames, C31410a.m96728a(gson), AbstractC34645f.m109482a(json));
    }
}
