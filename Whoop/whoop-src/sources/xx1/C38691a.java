package xx1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import or2.C28176k1;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xx1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lxx1/a;", "", "Leb/a0;", "navController", "Lor2/k1;", "shareUtil", "<init>", "(Leb/a0;Lor2/k1;)V", "Landroid/content/Context;", "context", "", "policyCtaUrl", "Ll83/a0;", "a", "(Landroid/content/Context;Ljava/lang/String;)V", "Lxx1/b;", "navigationEvent", "b", "(Lxx1/b;)V", "filePath", "c", "(Ljava/lang/String;Landroid/content/Context;)V", "Leb/a0;", "Lor2/k1;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38691a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28176k1 shareUtil;

    public C38691a(AbstractC12939a0 navController, C28176k1 shareUtil) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(shareUtil, "shareUtil");
        this.navController = navController;
        this.shareUtil = shareUtil;
    }

    /* JADX INFO: renamed from: a */
    private final void m124096a(Context context, String policyCtaUrl) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(policyCtaUrl)));
    }

    /* JADX INFO: renamed from: b */
    public final void m124097b(InterfaceC38692b navigationEvent) {
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        if (navigationEvent instanceof InterfaceC38692b.a) {
            this.navController.m36410z();
        } else if (navigationEvent instanceof InterfaceC38692b.b) {
            m124096a(this.navController.f44680a, ((InterfaceC38692b.b) navigationEvent).getPolicyCtaUrl());
        } else {
            if (!(navigationEvent instanceof InterfaceC38692b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            m124098c(((InterfaceC38692b.c) navigationEvent).getFilePath(), this.navController.f44680a);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m124098c(String filePath, Context context) {
        AbstractC22676k.m65750j(filePath, "filePath");
        AbstractC22676k.m65750j(context, "context");
        C28176k1.m85289b(this.shareUtil, new File(filePath), context, null, 4, null);
    }
}
