package vp1;

import com.whoop.hormonalinsights.settings.view.HormonalSettingsFragment;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import sp1.AbstractC32871a;
import sp1.C32872b;
import tp1.AbstractC34073m;

/* JADX INFO: renamed from: vp1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C36267c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f155328w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f155329x;

    public /* synthetic */ C36267c(Object obj, int i13) {
        this.f155328w = i13;
        this.f155329x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f155328w) {
            case 0:
                return HormonalSettingsFragment.m22168H((HormonalSettingsFragment) this.f155329x, (AbstractC34073m) obj);
            case 1:
                return HormonalSettingsFragment.m22169I((C32872b) this.f155329x, (AbstractC32871a) obj);
            case 2:
                return AbstractC36272h.m115886v1((InterfaceC28601c1) this.f155329x, (String) obj);
            default:
                return AbstractC36272h.m115885v0((Function1) this.f155329x, ((Boolean) obj).booleanValue());
        }
    }
}
