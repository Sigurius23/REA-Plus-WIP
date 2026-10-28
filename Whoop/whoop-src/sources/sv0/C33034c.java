package sv0;

import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import c41.C4161z2;
import c41.EnumC4009d3;
import com.whoop.video.VideoActivity;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pv0.InterfaceC29574a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: sv0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lsv0/c;", "", "Leb/a0;", "fragmentNavController", "composeNavController", "<init>", "(Leb/a0;Leb/a0;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Ljava/lang/Object;)V", "Leb/a0;", "b", "c", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33034c {

    /* JADX INFO: renamed from: d */
    public static final int f137585d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 fragmentNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 composeNavController;

    public C33034c(AbstractC12939a0 fragmentNavController, AbstractC12939a0 composeNavController) {
        AbstractC22676k.m65750j(fragmentNavController, "fragmentNavController");
        AbstractC22676k.m65750j(composeNavController, "composeNavController");
        this.fragmentNavController = fragmentNavController;
        this.composeNavController = composeNavController;
    }

    /* JADX INFO: renamed from: a */
    public final void m104310a(Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC29574a.c) {
            AbstractC12939a0.m36374y(this.composeNavController, "SEARCH", null, 6);
            return;
        }
        if (event instanceof InterfaceC29574a.b) {
            AbstractC12939a0.m36374y(this.composeNavController, "LANDING", null, 6);
            return;
        }
        if (event instanceof InterfaceC29574a.a) {
            this.fragmentNavController.m36410z();
            return;
        }
        if (event instanceof C4161z2) {
            C4161z2 c4161z2 = (C4161z2) event;
            if (c4161z2.getType() == EnumC4009d3.VIDEO) {
                Intent intent = new Intent(this.fragmentNavController.f44680a, (Class<?>) VideoActivity.class);
                intent.putExtra("videoUrl", c4161z2.getCtaUrl());
                intent.putExtra("SHOULD_SUBTITLES_DEFAULT_TO_OFF", true);
                this.fragmentNavController.f44680a.startActivity(intent);
                return;
            }
            String strM125926K = AbstractC39421y.m125926K(AbstractC39421y.m125926K(c4161z2.getName(), "&", "%26", false), "+", "%2B", false);
            String strName = c4161z2.getType().name();
            String name = c4161z2.getName();
            StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/education?path=", strM125926K, "&entryPoint=Content Search&eventName=Content Search&contentType=", strName, "&articleId=");
            sbM32001t.append(name);
            Uri uri = Uri.parse(sbM32001t.toString());
            AbstractC22676k.m65750j(uri, "uri");
            this.fragmentNavController.m36404s(new C12969k0(uri, null, null));
        }
    }
}
