package zm0;

import ad3.AbstractC0757c;
import com.whoop.design.json.AbstractC6728b;
import j93.InterfaceC21461d;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u82.C34648i;
import u82.InterfaceC34640a;

/* JADX INFO: renamed from: zm0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"", "", "Lj93/d;", "featureModels", "Lad3/c;", "b", "(Ljava/util/Map;)Lad3/c;", "json", "Lu82/a;", "a", "(Lad3/c;)Lu82/a;", "calendar-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40889e {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC34640a m132516a(AbstractC0757c json) {
        AbstractC22676k.m65750j(json, "json");
        return new C34648i(json);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC0757c m132517b(Map<String, ? extends InterfaceC21461d> featureModels) {
        AbstractC22676k.m65750j(featureModels, "featureModels");
        return AbstractC6728b.m20379d(featureModels, null, null, null, null, 30, null);
    }
}
