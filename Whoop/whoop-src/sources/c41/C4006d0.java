package c41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import cz0.AbstractC11254o;
import f11.AbstractC14004d;
import f11.C14005e;
import f11.C14008h;
import gz0.EnumC16313m0;
import hy0.AbstractC17781q1;
import hy0.EnumC17784r1;
import java.util.List;
import kd1.AbstractC22403o;
import p719m22.AbstractC42788s;

/* JADX INFO: renamed from: c41.d0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4006d0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f16285E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f16286F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16287w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f16288x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f16289y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f16290z;

    public /* synthetic */ C4006d0(float f13, Object obj, Object obj2, int i13, int i14, int i15) {
        this.f16287w = i15;
        this.f16288x = f13;
        this.f16286F = obj;
        this.f16289y = obj2;
        this.f16290z = i13;
        this.f16285E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16287w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4013e0.m12188l((EnumC16313m0) this.f16286F, this.f16288x, (Modifier) this.f16289y, this.f16290z, this.f16285E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC4066l4.m12449j((AbstractC22403o) this.f16286F, this.f16288x, (Modifier) this.f16289y, this.f16290z, this.f16285E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC11254o.m30377i(this.f16288x, (List) this.f16286F, (List) this.f16289y, this.f16290z, this.f16285E, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC14004d.m39867p(this.f16290z, (C14008h) this.f16286F, (C14005e) this.f16289y, this.f16288x, this.f16285E, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC17781q1.m51089q((TextResource) this.f16286F, (EnumC17784r1) this.f16289y, this.f16288x, this.f16290z, this.f16285E, (Composer) obj, iIntValue5);
            default:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC42788s.m73239k(this.f16288x, (InterfaceC4339a) this.f16286F, (Modifier) this.f16289y, this.f16290z, this.f16285E, (Composer) obj, iIntValue6);
        }
    }

    public /* synthetic */ C4006d0(int i13, C14008h c14008h, C14005e c14005e, float f13, int i14) {
        this.f16287w = 3;
        this.f16290z = i13;
        this.f16286F = c14008h;
        this.f16289y = c14005e;
        this.f16288x = f13;
        this.f16285E = i14;
    }

    public /* synthetic */ C4006d0(TextResource textResource, EnumC17784r1 enumC17784r1, float f13, int i13, int i14) {
        this.f16287w = 4;
        this.f16286F = textResource;
        this.f16289y = enumC17784r1;
        this.f16288x = f13;
        this.f16290z = i13;
        this.f16285E = i14;
    }

    public /* synthetic */ C4006d0(Object obj, float f13, Modifier modifier, int i13, int i14, int i15) {
        this.f16287w = i15;
        this.f16286F = obj;
        this.f16288x = f13;
        this.f16289y = modifier;
        this.f16290z = i13;
        this.f16285E = i14;
    }
}
