package fn2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fn2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m65681d2 = {"Lfn2/k;", "", "Lfn2/g;", "orientationHelper", "<init>", "(Lfn2/g;)V", "", "orientationDegrees", "Lfn2/j;", "a", "(I)Lfn2/j;", "Lfn2/g;", "b", "Lfn2/j;", "previousOrientation", "c", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14651k {

    /* JADX INFO: renamed from: c */
    private static final a f54081c = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14647g orientationHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private EnumC14650j previousOrientation;

    /* JADX INFO: renamed from: fn2.k$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lfn2/k$a;", "", "<init>", "()V", "", "ORIENTATION_UNKNOWN", "I", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C14651k(C14647g orientationHelper) {
        AbstractC22676k.m65750j(orientationHelper, "orientationHelper");
        this.orientationHelper = orientationHelper;
    }

    /* JADX INFO: renamed from: a */
    public final EnumC14650j m41861a(int orientationDegrees) {
        if (orientationDegrees == -1) {
            return null;
        }
        EnumC14650j enumC14650jM41863b = AbstractC14653m.m41863b(this.orientationHelper.m41851a(orientationDegrees));
        EnumC14650j enumC14650j = this.previousOrientation;
        if (enumC14650j == null) {
            this.previousOrientation = enumC14650jM41863b;
            return null;
        }
        if (enumC14650jM41863b == enumC14650j) {
            return null;
        }
        this.previousOrientation = enumC14650jM41863b;
        return enumC14650jM41863b;
    }
}
