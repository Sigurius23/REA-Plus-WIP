package e43;

import a33.C0352d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import c93.InterfaceC4339a;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: e43.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C12711c extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43497w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0352d f43498x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Intent f43499y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12711c(C0352d c0352d, Intent intent, int i13) {
        super(0);
        this.f43497w = i13;
        this.f43498x = c0352d;
        this.f43499y = intent;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f43497w) {
            case 0:
                List<ResolveInfo> listQueryIntentActivities = ((Context) this.f43498x.f1237x).getPackageManager().queryIntentActivities(this.f43499y, 0);
                AbstractC22676k.m65749i(listQueryIntentActivities, "queryIntentActivities(...)");
                return listQueryIntentActivities;
            default:
                List<ResolveInfo> listQueryBroadcastReceivers = ((Context) this.f43498x.f1237x).getPackageManager().queryBroadcastReceivers(this.f43499y, 0);
                AbstractC22676k.m65749i(listQueryBroadcastReceivers, "queryBroadcastReceivers(...)");
                return listQueryBroadcastReceivers;
        }
    }
}
