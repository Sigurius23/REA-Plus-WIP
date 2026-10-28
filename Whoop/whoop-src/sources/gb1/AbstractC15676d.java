package gb1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p132f0.C13818q1;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18042x;
import p209i3.InterfaceC18044z;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gb1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0006¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\u000f\u001a\u00020\u0000\"\u0004\b\u0000\u0010\n*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "thenModifier", "f", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "condition", "Lkotlin/Function1;", "block", "b", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "T", "value", "Lkotlin/Function2;", "ifNotNull", "ifNull", "c", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/m;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "", "tag", "d", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15676d {
    /* JADX INFO: renamed from: b */
    public static final Modifier m44099b(Modifier modifier, boolean z4, Function1 block) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(block, "block");
        return z4 ? modifier.mo3471e((Modifier) block.invoke(modifier)) : modifier;
    }

    /* JADX INFO: renamed from: c */
    public static final <T> Modifier m44100c(Modifier modifier, T t14, InterfaceC4351m ifNotNull, Function1 ifNull) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(ifNotNull, "ifNotNull");
        AbstractC22676k.m65750j(ifNull, "ifNull");
        return modifier.mo3471e((Modifier) (t14 != null ? ifNotNull.invoke(modifier, t14) : ifNull.invoke(modifier)));
    }

    /* JADX INFO: renamed from: d */
    public static final Modifier m44101d(Modifier modifier, String str) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return str != null ? AbstractC1136a.m3599a(AbstractC18032n.m51775c(modifier, false, new C13818q1(9)), str) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m44102e(InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18042x.m51816a(semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static final Modifier m44103f(Modifier modifier, Modifier modifier2) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return modifier2 != null ? modifier.mo3471e(modifier2) : modifier;
    }
}
