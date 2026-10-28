package id2;

import ai1.C0910b;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import gb1.AbstractC15673b0;
import ib0.C18332c;
import l83.C23454a0;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17913u;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: id2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0003¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0003¢\u0006\u0004\b\b\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0003¢\u0006\u0004\b\t\u0010\u0006\u001a\u0013\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0003¢\u0006\u0004\b\n\u0010\u0006\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Li2/x;", "color", "j", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "q", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "p", "r", "o", "n", "l", "share_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18424i {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Modifier m53033j(Modifier modifier, long j7) {
        return AbstractC1125a.m3478a(modifier, new C0910b(j7, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m53034k(long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0.6f * Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)), 8), 0L, 0L, 0.6f, null, 0, 118);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Modifier m53035l(Modifier modifier, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C18332c(11);
            c28655q.m87172p0(objM87133R);
        }
        return AbstractC1125a.m3478a(modifier, (Function1) objM87133R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m53036m(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        InterfaceC22131e.m63385u(drawBehind, new C17913u(new ComposeShader(new LinearGradient(0.0f, 0.0f, Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)), 0.0f, new int[]{-7642369, -11479553}, (float[]) null, tileMode), new RadialGradient(Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) / 2.0f, 0.0f, Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) * 0.6f, new int[]{-1, 16777215}, (float[]) null, tileMode), PorterDuff.Mode.DST_IN)), 0L, 0L, 0.6f, null, 0, 118);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Modifier m53037n(Modifier modifier, Composer composer, int i13) {
        return AbstractC15673b0.m44008S(modifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Modifier m53038o(Modifier modifier, Composer composer, int i13) {
        return m53033j(modifier, AbstractC17918w0.m51517e(4279428834L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Modifier m53039p(Modifier modifier, Composer composer, int i13) {
        return m53033j(modifier, C38072d.f163053a.m121949b(composer, C38072d.f163054b).getRecoveryHighRecovery());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Modifier m53040q(Modifier modifier, Composer composer, int i13) {
        return m53033j(modifier, C38072d.f163053a.m121949b(composer, C38072d.f163054b).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Modifier m53041r(Modifier modifier, Composer composer, int i13) {
        return m53033j(modifier, C38072d.f163053a.m121949b(composer, C38072d.f163054b).getStrain());
    }
}
