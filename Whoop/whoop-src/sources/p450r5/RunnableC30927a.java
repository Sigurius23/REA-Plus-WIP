package p450r5;

import androidx.credentials.exceptions.GetCredentialException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r5.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC30927a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f127621w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30931e f127622x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ GetCredentialException f127623y;

    public /* synthetic */ RunnableC30927a(C30931e c30931e, GetCredentialException getCredentialException, int i13) {
        this.f127621w = i13;
        this.f127622x = c30931e;
        this.f127623y = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f127621w) {
            case 0:
                C30931e this$0 = this.f127622x;
                AbstractC22676k.m65750j(this$0, "this$0");
                GetCredentialException e5 = this.f127623y;
                AbstractC22676k.m65750j(e5, "$e");
                this$0.m95139e().mo38428a(e5);
                break;
            default:
                C30931e this$1 = this.f127622x;
                AbstractC22676k.m65750j(this$1, "this$0");
                GetCredentialException e13 = this.f127623y;
                AbstractC22676k.m65750j(e13, "$e");
                this$1.m95139e().mo38428a(e13);
                break;
        }
    }
}
