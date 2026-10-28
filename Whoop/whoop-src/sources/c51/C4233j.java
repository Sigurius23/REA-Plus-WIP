package c51;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.educationModels.StickyButton;
import hy0.AbstractC17781q1;
import hy0.EnumC17784r1;
import p208i2.AbstractC17911t;
import p208i2.InterfaceC17910s0;
import p291l0.InterfaceC23001u;
import p715kotlin.jvm.functions.Function1;
import re1.AbstractC31326m;

/* JADX INFO: renamed from: c51.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4233j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f17156E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f17157F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17158w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f17159x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f17160y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f17161z;

    public /* synthetic */ C4233j(C4242s c4242s, InterfaceC17910s0 interfaceC17910s0, AbstractC17911t abstractC17911t, float f13, int i13) {
        this.f17158w = 0;
        this.f17161z = c4242s;
        this.f17156E = interfaceC17910s0;
        this.f17157F = abstractC17911t;
        this.f17159x = f13;
        this.f17160y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17158w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4234k.m13143P((C4242s) this.f17161z, (InterfaceC17910s0) this.f17156E, (AbstractC17911t) this.f17157F, this.f17159x, this.f17160y, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC17781q1.m51084l((EnumC17784r1) this.f17161z, this.f17159x, (TextResource) this.f17156E, (Function1) this.f17157F, this.f17160y, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC31326m.m96416h((InterfaceC23001u) this.f17161z, this.f17159x, (StickyButton) this.f17156E, (Function1) this.f17157F, this.f17160y, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C4233j(Object obj, float f13, Object obj2, Function1 function1, int i13, int i14) {
        this.f17158w = i14;
        this.f17161z = obj;
        this.f17159x = f13;
        this.f17156E = obj2;
        this.f17157F = function1;
        this.f17160y = i13;
    }
}
