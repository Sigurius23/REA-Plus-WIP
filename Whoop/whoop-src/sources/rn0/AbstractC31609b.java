package rn0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import l83.C23454a0;
import p026b2.C2314t;
import p132f0.C13821r1;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rn0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Lf0/r1;", "scrollState", "", "alphaMagnifier", "translationYMagnifier", "b", "(Landroidx/compose/ui/Modifier;Lf0/r1;FF)Landroidx/compose/ui/Modifier;", "challenge-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31609b {
    /* JADX INFO: renamed from: b */
    public static final Modifier m97639b(Modifier modifier, C13821r1 scrollState, float f13, float f14) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(scrollState, "scrollState");
        return modifier.mo3471e(AbstractC1127a.m3486a(C2314t.f9131w, new C31608a(scrollState, f13, f14, 0)));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Modifier m97640c(Modifier modifier, C13821r1 c13821r1, float f13, float f14, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = 200.0f;
        }
        if ((i13 & 4) != 0) {
            f14 = 0.1f;
        }
        return m97639b(modifier, c13821r1, f13, f14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m97641d(C13821r1 c13821r1, float f13, float f14, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51551a(Math.min(1.0f, 1 - (c13821r1.f49318a.m87024x() / f13)));
        c17920x0.m51550E((-c13821r1.f49318a.m87024x()) * f14);
        return C23454a0.f92919a;
    }
}
