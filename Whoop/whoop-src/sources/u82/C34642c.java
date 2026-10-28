package u82;

import ad3.AbstractC0757c;
import com.google.gson.Gson;
import com.whoop.data.repositories.FeatureFlagChecker;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p549vb.AbstractC35862g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u82.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lu82/c;", "Lu82/a;", "Lad3/c;", "json", "Lcom/google/gson/Gson;", "gson", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "", "", "featureFlags", "<init>", "(Lad3/c;Lcom/google/gson/Gson;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/util/Set;)V", "T", "string", "Ljava/lang/reflect/Type;", "type", "a", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "Lad3/c;", "b", "Lcom/google/gson/Gson;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Ljava/util/Set;", "serialization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34642c implements InterfaceC34640a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Gson gson;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Set<String> featureFlags;

    public C34642c(AbstractC0757c json, Gson gson, FeatureFlagChecker featureFlagChecker, Set<String> featureFlags) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(gson, "gson");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(featureFlags, "featureFlags");
        this.json = json;
        this.gson = gson;
        this.featureFlagChecker = featureFlagChecker;
        this.featureFlags = featureFlags;
    }

    @Override // u82.InterfaceC34640a
    /* JADX INFO: renamed from: a */
    public <T> T mo109477a(String string, Type type) {
        AbstractC22676k.m65750j(string, "string");
        AbstractC22676k.m65750j(type, "type");
        Set<String> set = this.featureFlags;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (this.featureFlagChecker.isFeatureEnabled((String) it.next())) {
                    return (T) this.json.m1831b(AbstractC35862g.m113845h(this.json.f2764b, type), string);
                }
            }
        }
        return (T) this.gson.fromJson(string, type);
    }
}
