package p747z81;

import android.graphics.DashPathEffect;
import p208i2.C17893k;
import p208i2.InterfaceC17912t0;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: z81.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lz81/a;", "", "<init>", "()V", "Ly81/e;", "b", "Ly81/e;", "a", "()Ly81/e;", "color", "Li2/t0;", "c", "Li2/t0;", "()Li2/t0;", "pathEffect", "Ly3/f;", "d", "F", "()F", "cornerRadius", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C40181a {

    /* JADX INFO: renamed from: a */
    public static final C40181a f173397a = new C40181a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC39332e color = EnumC39333f.WHITE_30;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final InterfaceC17912t0 pathEffect = new C17893k(new DashPathEffect(new float[]{8.0f, 4.0f}, 0.0f));

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float cornerRadius = 0 * 4;

    private C40181a() {
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC39332e m128914a() {
        return color;
    }

    /* JADX INFO: renamed from: b */
    public final float m128915b() {
        return cornerRadius;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC17912t0 m128916c() {
        return pathEffect;
    }
}
