package tk2;

import android.annotation.SuppressLint;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.UnitSystemExtKt;
import e93.AbstractC12889b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import kk2.AbstractC22551d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: tk2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u001a¨\u0006 "}, m65681d2 = {"Ltk2/b;", "", "<init>", "()V", "", "meters", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "b", "(DLcom/whoop/domain/model/UnitSystem;)D", "", "d", "(Lcom/whoop/domain/model/UnitSystem;)I", "secondsPerDisplayUnit", "", "g", "(D)Ljava/lang/String;", "f", "(DLcom/whoop/domain/model/UnitSystem;)Ljava/lang/String;", "", "activeSeconds", "distanceMeters", "e", "(JDLcom/whoop/domain/model/UnitSystem;)Ljava/lang/String;", "Lcom/whoop/design/util/TextResource;", "i", "(Lcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource;", "targetMeters", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(DLcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource;", "a", "c", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33884b {

    /* JADX INFO: renamed from: a */
    public static final C33884b f141961a = new C33884b();

    private C33884b() {
    }

    /* JADX INFO: renamed from: b */
    private final double m107161b(double meters, UnitSystem unitSystem) {
        return meters / (UnitSystemExtKt.isImperial(unitSystem) ? 1609.344d : 1000.0d);
    }

    /* JADX INFO: renamed from: d */
    private final int m107162d(UnitSystem unitSystem) {
        return UnitSystemExtKt.isImperial(unitSystem) ? AbstractC22551d.f88703q : AbstractC22551d.f88702p;
    }

    /* JADX INFO: renamed from: g */
    private final String m107163g(double secondsPerDisplayUnit) {
        int iM36257W = AbstractC12889b.m36257W(secondsPerDisplayUnit);
        if (iM36257W < 0) {
            iM36257W = 0;
        }
        return (iM36257W / 60) + ":" + AbstractC39414r.m125895n0(2, String.valueOf(iM36257W % 60));
    }

    /* JADX INFO: renamed from: a */
    public final TextResource m107164a(UnitSystem unitSystem) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        return new TextResource.C8688b(AbstractC22551d.f88712z, AbstractC8693b.m21276j(AbstractC8693b.m21277k(m107162d(unitSystem))));
    }

    /* JADX INFO: renamed from: c */
    public final TextResource m107165c(UnitSystem unitSystem) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        return new TextResource.C8688b(AbstractC22551d.f88660B, AbstractC8693b.m21276j(AbstractC8693b.m21277k(m107162d(unitSystem))));
    }

    /* JADX INFO: renamed from: e */
    public final String m107166e(long activeSeconds, double distanceMeters, UnitSystem unitSystem) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        if (distanceMeters <= 0.0d) {
            return null;
        }
        double dM107161b = m107161b(distanceMeters, unitSystem);
        if (dM107161b <= 0.0d) {
            return null;
        }
        return m107163g(activeSeconds / dM107161b);
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: f */
    public final String m107167f(double meters, UnitSystem unitSystem) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        return String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(m107161b(meters, unitSystem))}, 1));
    }

    /* JADX INFO: renamed from: h */
    public final TextResource m107168h(double targetMeters, UnitSystem unitSystem) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        return new TextResource.C8688b(UnitSystemExtKt.isImperial(unitSystem) ? AbstractC22551d.f88698l : AbstractC22551d.f88699m, new TextResource.AbstractC8690d.a(m107167f(targetMeters, unitSystem)));
    }

    /* JADX INFO: renamed from: i */
    public final TextResource m107169i(UnitSystem unitSystem) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        return new TextResource.C8688b(UnitSystemExtKt.isImperial(unitSystem) ? AbstractC22551d.f88700n : AbstractC22551d.f88701o, null, 2, null);
    }
}
