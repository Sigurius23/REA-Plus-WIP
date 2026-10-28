package br2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cw2.AbstractC11163d;
import gz0.EnumC16313m0;
import l83.C23454a0;
import mz0.AbstractC26037b;
import mz0.EnumC26036a;
import ok2.C27998d;
import p208i2.InterfaceC17869a1;
import p390p1.AbstractC28683x;
import p484s9.AbstractC32281f;
import qk2.AbstractC30446b;
import zy0.AbstractC41215c;
import zy0.EnumC41216d;

/* JADX INFO: renamed from: br2.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3565g implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f14424E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f14425F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14426w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f14427x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f14428y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f14429z;

    public /* synthetic */ C3565g(long j7, Object obj, Modifier modifier, int i13, int i14, int i15) {
        this.f14426w = i15;
        this.f14427x = j7;
        this.f14425F = obj;
        this.f14428y = modifier;
        this.f14429z = i13;
        this.f14424E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14426w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3566h.m10703o((C3561c) this.f14425F, this.f14428y, this.f14427x, this.f14429z, this.f14424E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC11163d.m30258j((EnumC16313m0) this.f14425F, this.f14427x, this.f14428y, this.f14429z, this.f14424E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC26037b.m77459e(this.f14428y, (EnumC26036a) this.f14425F, this.f14427x, this.f14429z, this.f14424E, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC30446b.m93159p((C27998d) this.f14425F, this.f14427x, this.f14428y, this.f14429z, this.f14424E, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC30446b.m93168y(this.f14427x, (InterfaceC17869a1) this.f14425F, this.f14428y, this.f14429z, this.f14424E, (Composer) obj, iIntValue5);
            case 5:
                ((Integer) obj2).getClass();
                AbstractC32281f.m100438c(this.f14427x, (InterfaceC4339a) this.f14425F, this.f14428y, this.f14429z, (Composer) obj, AbstractC28683x.m87244L(this.f14424E | 1));
                return C23454a0.f92919a;
            default:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC41215c.m133897c(this.f14428y, (EnumC41216d) this.f14425F, this.f14427x, this.f14429z, this.f14424E, (Composer) obj, iIntValue6);
        }
    }

    public /* synthetic */ C3565g(Modifier modifier, Enum r10, long j7, int i13, int i14, int i15) {
        this.f14426w = i15;
        this.f14428y = modifier;
        this.f14425F = r10;
        this.f14427x = j7;
        this.f14429z = i13;
        this.f14424E = i14;
    }

    public /* synthetic */ C3565g(C3561c c3561c, Modifier modifier, long j7, int i13, int i14) {
        this.f14426w = 0;
        this.f14425F = c3561c;
        this.f14428y = modifier;
        this.f14427x = j7;
        this.f14429z = i13;
        this.f14424E = i14;
    }

    public /* synthetic */ C3565g(Object obj, long j7, Modifier modifier, int i13, int i14, int i15) {
        this.f14426w = i15;
        this.f14425F = obj;
        this.f14427x = j7;
        this.f14428y = modifier;
        this.f14429z = i13;
        this.f14424E = i14;
    }
}
