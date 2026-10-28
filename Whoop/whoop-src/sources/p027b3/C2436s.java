package p027b3;

import android.content.res.Resources;
import androidx.compose.p018ui.platform.AndroidComposeView;
import p000.AbstractC30802r;
import p106e2.C12587b;
import p181h2.C16620e;
import p636y3.C39172d;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: b3.s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2436s extends C22672i implements Function3 {
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC30802r.m94771t(obj);
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        Class cls = AndroidComposeView.f4886h1;
        Resources resources = androidComposeView.getContext().getResources();
        return Boolean.valueOf(C2392j0.f9447a.m7394a(androidComposeView, null, new C12587b(new C39172d(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((C16620e) obj2).f63951a, (Function1) obj3)));
    }
}
