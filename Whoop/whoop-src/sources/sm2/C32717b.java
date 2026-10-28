package sm2;

import ad3.AbstractC0770m;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.json.C9602a;
import j02.AbstractC21155m0;
import j02.InterfaceC21134c;
import kotlinx.serialization.SerializationException;
import o02.InterfaceC27353d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import u82.AbstractC34650k;

/* JADX INFO: renamed from: sm2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lsm2/b;", "", "<init>", "()V", "", "", "c", "(Ljava/lang/String;)Z", "Lcom/whoop/navigation/e;", "destination", "b", "(Lcom/whoop/navigation/e;)Ljava/lang/String;", "json", "a", "(Ljava/lang/String;)Lcom/whoop/navigation/e;", "dismissDestination", "Lo02/d;", "reducer", "Lj02/m0;", "d", "(Ljava/lang/String;Lo02/d;)Lj02/m0;", "Lcom/whoop/navigation/json/a;", "Lcom/whoop/navigation/json/a;", "serializer", "Ltr2/n;", "Ltr2/n;", "logger", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32717b {

    /* JADX INFO: renamed from: a */
    public static final C32717b f136014a = new C32717b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C9602a serializer = new C9602a(null, null, 3, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("DismissDestinationConverter");

    /* JADX INFO: renamed from: d */
    public static final int f136017d = 8;

    private C32717b() {
    }

    /* JADX INFO: renamed from: c */
    private final boolean m102672c(String str) {
        try {
            return AbstractC0770m.m1847i(AbstractC34650k.m109496c().m1835f(str)).containsKey((Object) "parameters");
        } catch (SerializationException e5) {
            logger.mo85213c("Dismiss destination is not a JSON object", e5, new AbstractC30556a.a[0]);
            return false;
        } catch (IllegalArgumentException e13) {
            logger.mo85213c("Dismiss destination is not a JSON object", e13, new AbstractC30556a.a[0]);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C9598e m102673a(String json) {
        AbstractC22676k.m65750j(json, "json");
        return (C9598e) AbstractC34650k.m109496c().m1831b(serializer, json);
    }

    /* JADX INFO: renamed from: b */
    public final String m102674b(C9598e destination) {
        AbstractC22676k.m65750j(destination, "destination");
        return AbstractC34650k.m109496c().m1833d(serializer, destination);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC21155m0 m102675d(String dismissDestination, InterfaceC27353d reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        if (dismissDestination != null && dismissDestination.length() != 0) {
            try {
                if (!m102672c(dismissDestination)) {
                    logger.mo85226q("Dismiss destination has no parameters, falling back to back press", new AbstractC30556a.a[0]);
                    return null;
                }
                InterfaceC21134c interfaceC21134cMo67681a = reducer.mo67681a(m102673a(dismissDestination).getParameters());
                if (!(interfaceC21134cMo67681a instanceof AbstractC21155m0) || interfaceC21134cMo67681a.equals(AbstractC21155m0.j3.f80414b)) {
                    return null;
                }
                return (AbstractC21155m0) interfaceC21134cMo67681a;
            } catch (SerializationException e5) {
                logger.mo85213c("Could not decode dismiss destination, falling back to back press", e5, new AbstractC30556a.a[0]);
            }
        }
        return null;
    }
}
