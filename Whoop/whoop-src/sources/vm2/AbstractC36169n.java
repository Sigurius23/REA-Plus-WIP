package vm2;

import com.whoop.navigation.models.ApiRequest;
import j02.AbstractC21155m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vm2.n */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lj02/m0;", "other", "", "b", "(Lj02/m0;Lj02/m0;)Z", "Lcom/whoop/navigation/models/ApiRequest;", "a", "(Lj02/m0;)Lcom/whoop/navigation/models/ApiRequest;", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36169n {
    /* JADX INFO: renamed from: a */
    private static final ApiRequest m115111a(AbstractC21155m0 abstractC21155m0) {
        if (abstractC21155m0 instanceof AbstractC21155m0.m1) {
            return ((AbstractC21155m0.m1) abstractC21155m0).getRequest();
        }
        if (abstractC21155m0 instanceof AbstractC21155m0.e5) {
            return ((AbstractC21155m0.e5) abstractC21155m0).getRequest();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m115112b(AbstractC21155m0 abstractC21155m0, AbstractC21155m0 other) {
        AbstractC22676k.m65750j(abstractC21155m0, "<this>");
        AbstractC22676k.m65750j(other, "other");
        ApiRequest apiRequestM115111a = m115111a(abstractC21155m0);
        ApiRequest apiRequestM115111a2 = m115111a(other);
        if (apiRequestM115111a != null && apiRequestM115111a2 != null) {
            return AbstractC22676k.m65745e(apiRequestM115111a.getPath(), apiRequestM115111a2.getPath()) && apiRequestM115111a.getMethod() == apiRequestM115111a2.getMethod();
        }
        if ((abstractC21155m0 instanceof AbstractC21155m0.i3) && (other instanceof AbstractC21155m0.i3)) {
            return AbstractC22676k.m65745e(((AbstractC21155m0.i3) abstractC21155m0).getSource(), ((AbstractC21155m0.i3) other).getSource());
        }
        return abstractC21155m0.getClass() == other.getClass();
    }
}
