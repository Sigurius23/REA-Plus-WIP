package m51;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import gb1.AbstractC15673b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p088dc.AbstractC11895b;
import p163g1.C14984d4;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: m51.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Lm51/a;", "state", "", "radiusScale", "b", "(Landroidx/compose/ui/Modifier;Lm51/a;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25080b {
    /* JADX INFO: renamed from: b */
    public static final Modifier m73578b(Modifier modifier, InterfaceC25079a state, float f13, Composer composer, int i13, int i14) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(state, "state");
        if ((i14 & 2) != 0) {
            f13 = 1.0f;
        }
        if (state instanceof InterfaceC25079a.c) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1123998228);
            long jMo134584toComposableColorWaAFU9c = ((InterfaceC25079a.c) state).getColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            boolean zM87151f = c28655q.m87151f(jMo134584toComposableColorWaAFU9c) | ((((i13 & 112) ^ 48) > 32 && c28655q.m87157i(state)) || (i13 & 48) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                objM87133R = new C14984d4(jMo134584toComposableColorWaAFU9c, state, 1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3478a = AbstractC1125a.m3478a(modifier, (Function1) objM87133R);
            c28655q.m87173q(false);
            return modifierM3478a;
        }
        if (state instanceof InterfaceC25079a.b) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-1349209713);
            InterfaceC25079a.b bVar = (InterfaceC25079a.b) state;
            Modifier modifierM43986H = AbstractC15673b0.m43986H(modifier, bVar.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), bVar.getOpacity(), f13);
            c28655q2.m87173q(false);
            return modifierM43986H;
        }
        if (!(state instanceof InterfaceC25079a.a)) {
            throw AbstractC11895b.m32003v(-1349216624, (C28655q) composer, false);
        }
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87150e0(-1349205063);
        InterfaceC25079a.a aVar = (InterfaceC25079a.a) state;
        List<InterfaceC39332e> listM73571a = aVar.m73571a();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM73571a, 10));
        Iterator<T> it = listM73571a.iterator();
        while (it.hasNext()) {
            arrayList.add(new C17919x(((InterfaceC39332e) it.next()).mo134584toComposableColorWaAFU9c(c28655q3, 0)));
        }
        Modifier modifierM44005Q0 = AbstractC15673b0.m44005Q0(modifier, arrayList, aVar.getOpacity(), f13);
        c28655q3.m87173q(false);
        return modifierM44005Q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m73579c(long j7, InterfaceC25079a interfaceC25079a, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63383i0(drawBehind, j7, 0L, 0L, ((InterfaceC25079a.c) interfaceC25079a).getOpacity(), null, 0, 118);
        return C23454a0.f92919a;
    }
}
