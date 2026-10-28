package mj2;

import a11.C0140r;
import a11.EnumC0125c;
import ca2.EnumC4363c;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ej2.AbstractC13266c;
import gz0.AbstractC16319p0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mj2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lca2/c;", "alertTile", "", "lastSyncTimestamp", "La11/r;", "a", "(Lca2/c;Ljava/lang/String;)La11/r;", "stress_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25621b {

    /* JADX INFO: renamed from: mj2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100508a;

        static {
            int[] iArr = new int[EnumC4363c.values().length];
            try {
                iArr[EnumC4363c.CATCHING_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4363c.CAUGHT_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4363c.STANDBY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f100508a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C0140r m75354a(EnumC4363c alertTile, String str) {
        TextResource textResourceM21278l;
        AbstractC22676k.m65750j(alertTile, "alertTile");
        int i13 = a.f100508a[alertTile.ordinal()];
        if (i13 != 1) {
            if (i13 == 2 || i13 == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC13266c.f45930b);
        Integer numValueOf = Integer.valueOf(AbstractC16319p0.m46430a().getConnections().getCloud());
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC13266c.f45929a);
        if (str == null || (textResourceM21278l = AbstractC8693b.m21278l(str)) == null) {
            textResourceM21278l = AbstractC8693b.m21278l("--:--");
        }
        return new C0140r(c8688bM21277k, null, null, numValueOf, false, c8688bM21277k2, textResourceM21278l, null, false, null, EnumC0125c.LOADING, null, null, true, 7062, null);
    }
}
