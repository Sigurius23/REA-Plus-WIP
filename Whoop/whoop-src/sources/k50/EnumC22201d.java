package k50;

import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.UnitSystemExtKt;
import d21.C11503a;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: k50.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\tj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Lk50/d;", "", "<init>", "(Ljava/lang/String;I)V", "", "value", "Lcom/whoop/domain/model/UnitSystem;", "from", "toCanonical", "(ILcom/whoop/domain/model/UnitSystem;)I", "canonical", "to", "fromCanonical", "LENGTH", "MASS", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC22201d {
    LENGTH,
    MASS;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: k50.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f86234a;

        static {
            int[] iArr = new int[EnumC22201d.values().length];
            try {
                iArr[EnumC22201d.LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC22201d.MASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f86234a = iArr;
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int fromCanonical(int canonical, UnitSystem to3) {
        AbstractC22676k.m65750j(to3, "to");
        int i13 = a.f86234a[ordinal()];
        if (i13 == 1) {
            return UnitSystemExtKt.isImperial(to3) ? C11503a.f37005a.m30912a(canonical) : canonical;
        }
        if (i13 == 2) {
            return UnitSystemExtKt.isImperial(to3) ? canonical : C11503a.f37005a.m30927p(canonical);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int toCanonical(int value, UnitSystem from) {
        AbstractC22676k.m65750j(from, "from");
        int i13 = a.f86234a[ordinal()];
        if (i13 == 1) {
            return UnitSystemExtKt.isImperial(from) ? C11503a.f37005a.m30921j(value) : value;
        }
        if (i13 == 2) {
            return UnitSystemExtKt.isImperial(from) ? value : C11503a.f37005a.m30925n(value);
        }
        throw new NoWhenBranchMatchedException();
    }
}
