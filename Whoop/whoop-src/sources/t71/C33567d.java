package t71;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: t71.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C33567d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f140054E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f140055F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f140056w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f140057x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33569f f140058y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f140059z;

    public /* synthetic */ C33567d(Modifier modifier, C33569f c33569f, Function1 function1, int i13, int i14, int i15) {
        this.f140056w = i15;
        this.f140057x = modifier;
        this.f140058y = c33569f;
        this.f140059z = function1;
        this.f140054E = i13;
        this.f140055F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f140056w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33568e.m106006e(this.f140057x, this.f140058y, this.f140059z, this.f140054E, this.f140055F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC33580q.m106071e(this.f140057x, this.f140058y, this.f140059z, this.f140054E, this.f140055F, (Composer) obj, iIntValue2);
        }
    }
}
