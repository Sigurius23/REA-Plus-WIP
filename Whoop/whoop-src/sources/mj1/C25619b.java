package mj1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.C4987d;
import hj1.C17364a;
import or2.C28216y;
import p030b7.C2772a;
import p030b7.InterfaceC2773b;
import p114eb.AbstractC12939a0;
import p236j.AbstractC21065d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pj1.C29298b;

/* JADX INFO: renamed from: mj1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lmj1/b;", "", "Leb/a0;", "navController", "Lor2/y;", "externalLinkNavigator", "Landroid/app/Activity;", "activity", "Lj/d;", "", "", "requestPermissionsLauncher", "Lhj1/a;", "analyticsHelper", "<init>", "(Leb/a0;Lor2/y;Landroid/app/Activity;Lj/d;Lhj1/a;)V", "Lmj1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lmj1/a;)V", "Leb/a0;", "b", "Lor2/y;", "c", "Landroid/app/Activity;", "d", "Lj/d;", "e", "Lhj1/a;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25619b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Activity activity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC21065d requestPermissionsLauncher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C17364a analyticsHelper;

    public C25619b(AbstractC12939a0 navController, C28216y externalLinkNavigator, Activity activity, AbstractC21065d requestPermissionsLauncher, C17364a analyticsHelper) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(requestPermissionsLauncher, "requestPermissionsLauncher");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.navController = navController;
        this.externalLinkNavigator = externalLinkNavigator;
        this.activity = activity;
        this.requestPermissionsLauncher = requestPermissionsLauncher;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: a */
    public final void m75351a(AbstractC25618a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC25618a.a.f100495a)) {
            this.navController.m36410z();
            return;
        }
        if (event.equals(AbstractC25618a.e.f100499a)) {
            this.analyticsHelper.m49166a("Settings");
            C28216y.m85414y(this.externalLinkNavigator, this.activity, "https://api.prod.whoop.com/url-mapping-service/v1/GOOGLE_HEALTH", false, 4, null);
            return;
        }
        if (event.equals(AbstractC25618a.d.f100498a)) {
            Activity activity = this.activity;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setPackage(C4987d.GOOGLE_PLAY_STORE_PACKAGE);
            intent.setData(Uri.parse("market://details?id=com.google.android.apps.healthdata&url=healthconnect%3A%2F%2Fonboarding"));
            intent.putExtra("overlay", true);
            intent.putExtra("callerId", this.activity.getPackageName());
            activity.startActivity(intent);
            return;
        }
        if (event.equals(AbstractC25618a.c.f100497a)) {
            this.requestPermissionsLauncher.mo4052a(C29298b.INSTANCE.m88936a(), null);
            return;
        }
        if (!event.equals(AbstractC25618a.b.f100496a)) {
            throw new NoWhenBranchMatchedException();
        }
        Activity activity2 = this.activity;
        InterfaceC2773b.f10911a.getClass();
        Intent intent2 = new Intent(C2772a.f10910b);
        intent2.addFlags(268435456);
        if (Build.VERSION.SDK_INT < 34) {
            intent2.setPackage("com.google.android.apps.healthdata");
        }
        activity2.startActivity(intent2);
    }
}
