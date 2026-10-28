package tk2;

import kk2.AbstractC22550c;
import kk2.AbstractC22551d;
import mk2.EnumC25643j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tk2.p */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmk2/j;", "Ltk2/o;", "a", "(Lmk2/j;)Ltk2/o;", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33898p {

    /* JADX INFO: renamed from: tk2.p$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f142066a;

        static {
            int[] iArr = new int[EnumC25643j.values().length];
            try {
                iArr[EnumC25643j.NAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25643j.SLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f142066a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C33897o m107244a(EnumC25643j enumC25643j) {
        AbstractC22676k.m65750j(enumC25643j, "<this>");
        int i13 = a.f142066a[enumC25643j.ordinal()];
        if (i13 == 1) {
            return new C33897o(AbstractC22550c.f88656a, AbstractC22551d.f88664F, AbstractC22551d.f88663E, AbstractC22551d.f88675Q);
        }
        if (i13 == 2) {
            return new C33897o(AbstractC22550c.f88657b, AbstractC22551d.f88677S, AbstractC22551d.f88676R, AbstractC22551d.f88675Q);
        }
        throw new IllegalStateException("Not sleep content");
    }
}
