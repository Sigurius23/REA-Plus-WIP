package ds1;

import h11.EnumC16612g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ds1.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lds1/h;", "Lh11/g;", "a", "(Lds1/h;)Lh11/g;", "journal_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12339i {

    /* JADX INFO: renamed from: ds1.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41472a;

        static {
            int[] iArr = new int[EnumC12338h.values().length];
            try {
                iArr[EnumC12338h.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12338h.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC12338h.INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41472a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC16612g m34476a(EnumC12338h enumC12338h) {
        AbstractC22676k.m65750j(enumC12338h, "<this>");
        int i13 = a.f41472a[enumC12338h.ordinal()];
        if (i13 == 1) {
            return EnumC16612g.COMPLETED_JOURNAL;
        }
        if (i13 == 2) {
            return EnumC16612g.INCOMPLETE_JOURNAL;
        }
        if (i13 == 3) {
            return EnumC16612g.INVALID;
        }
        throw new NoWhenBranchMatchedException();
    }
}
