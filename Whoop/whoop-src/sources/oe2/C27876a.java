package oe2;

import com.whoop.shepherd.fragment.ShepherdAboutFragment;
import com.whoop.shepherd.fragment.ShepherdDetailsFragment;
import com.whoop.shepherd.fragment.ShepherdToggleSettingsFragment;
import je2.InterfaceC21622a;
import p114eb.AbstractC12939a0;
import p715kotlin.jvm.functions.Function1;
import pd2.InterfaceC29106b;
import pe2.C29118b;
import td2.InterfaceC33715f;

/* JADX INFO: renamed from: oe2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27876a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112414w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC12939a0 f112415x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C29118b f112416y;

    public /* synthetic */ C27876a(AbstractC12939a0 abstractC12939a0, C29118b c29118b, int i13) {
        this.f112414w = i13;
        this.f112415x = abstractC12939a0;
        this.f112416y = c29118b;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f112414w) {
            case 0:
                return ShepherdAboutFragment.m25843E(this.f112415x, this.f112416y, (InterfaceC29106b.c) obj);
            case 1:
                return ShepherdDetailsFragment.m25856K(this.f112415x, this.f112416y, (InterfaceC33715f.f) obj);
            default:
                return ShepherdToggleSettingsFragment.m25908G(this.f112415x, this.f112416y, (InterfaceC21622a.e) obj);
        }
    }
}
