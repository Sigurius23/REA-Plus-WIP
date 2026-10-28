package hc2;

import com.whoop.settings.myaccount.MyAccountFragment;
import p715kotlin.jvm.functions.Function1;
import y71.C39282o;

/* JADX INFO: renamed from: hc2.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17159g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65867w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39282o f65868x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ MyAccountFragment f65869y;

    public /* synthetic */ C17159g(MyAccountFragment myAccountFragment, C39282o c39282o) {
        this.f65869y = myAccountFragment;
        this.f65868x = c39282o;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f65867w) {
            case 0:
                return MyAccountFragment.m25650u1(this.f65869y, this.f65868x, obj);
            default:
                return MyAccountFragment.m25598U0(this.f65868x, this.f65869y, obj);
        }
    }

    public /* synthetic */ C17159g(C39282o c39282o, MyAccountFragment myAccountFragment) {
        this.f65868x = c39282o;
        this.f65869y = myAccountFragment;
    }
}
