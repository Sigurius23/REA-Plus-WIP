package zy1;

import c31.C3927k;
import c31.EnumC3920d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import py1.AbstractC29625d;

/* JADX INFO: renamed from: zy1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0012"}, m65681d2 = {"Lzy1/d;", "", "<init>", "()V", "Lc31/k;", "b", "Lc31/k;", "a", "()Lc31/k;", "firstStep", "c", "getMiddleStep", "middleStep", "d", "lastStep", "e", "getLoadingStep", "loadingStep", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41222d {

    /* JADX INFO: renamed from: a */
    public static final C41222d f177881a = new C41222d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C3927k firstStep;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C3927k middleStep;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C3927k lastStep;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C3927k loadingStep;

    /* JADX INFO: renamed from: f */
    public static final int f177886f;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC3920d enumC3920d = EnumC3920d.FILLED;
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC29625d.f121010x);
        EnumC16313m0 enumC16313m0 = EnumC16313m0.ARROW_FORWARD;
        EnumC39333f enumC39333f = EnumC39333f.STRAIN;
        EnumC39333f enumC39333f2 = EnumC39333f.BRAND_WHITE;
        firstStep = new C3927k(enumC3920d, c8688bM21277k, enumC39333f2, null, null, enumC16313m0, 100, 0, null, true, false, enumC39333f, null, enumC39333f2, null, null, null, 120088, null);
        EnumC3920d enumC3920d2 = EnumC3920d.PROGRESS;
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC29625d.f121012z);
        EnumC39333f enumC39333f3 = EnumC39333f.ACCENT_ACTION;
        int i13 = 120088;
        DefaultConstructorMarker defaultConstructorMarker = null;
        middleStep = new C3927k(enumC3920d2, c8688bM21277k2, enumC39333f2, null, null, enumC16313m0, 100, 50, null, true, false, enumC39333f3, 0 == true ? 1 : 0, enumC39333f2, null, 0 == true ? 1 : 0, null, i13, defaultConstructorMarker);
        Object[] objArr = 0 == true ? 1 : 0;
        lastStep = new C3927k(enumC3920d, AbstractC8693b.m21277k(AbstractC29625d.f120971B), enumC39333f2, null, null, EnumC16313m0.CHECKMARK, 100, 100, null, true, false, EnumC39333f.ACCENT_POSITIVE_TREND, null, EnumC39333f.BRAND_BLACK, null, 0 == true ? 1 : 0, null, 120088, objArr);
        loadingStep = new C3927k(EnumC3920d.LOADING, AbstractC8693b.m21277k(AbstractC29625d.f121012z), enumC39333f2, null, null, enumC16313m0, 100, 66, null, false, false, enumC39333f3, 0 == true ? 1 : 0, enumC39333f2, null, 0 == true ? 1 : 0, null, i13, defaultConstructorMarker);
        f177886f = C3927k.f16020r;
    }

    private C41222d() {
    }

    /* JADX INFO: renamed from: a */
    public final C3927k m133910a() {
        return firstStep;
    }

    /* JADX INFO: renamed from: b */
    public final C3927k m133911b() {
        return lastStep;
    }
}
