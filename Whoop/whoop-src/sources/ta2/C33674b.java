package ta2;

import android.app.Activity;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import j02.InterfaceC21159o0;
import or2.C28216y;
import p705ea2.AbstractC12922s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ta2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lta2/b;", "", "Lj02/o0;", "navigator", "Lor2/y;", "externalLinkNavigator", "Landroid/app/Activity;", "activity", "<init>", "(Lj02/o0;Lor2/y;Landroid/app/Activity;)V", "Lta2/a$c;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lta2/a$c;)V", "Lta2/a;", "a", "(Lta2/a;)V", "Lj02/o0;", "Lor2/y;", "c", "Landroid/app/Activity;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33674b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Activity activity;

    public C33674b(InterfaceC21159o0 navigator, C28216y externalLinkNavigator, Activity activity) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(activity, "activity");
        this.navigator = navigator;
        this.externalLinkNavigator = externalLinkNavigator;
        this.activity = activity;
    }

    /* JADX INFO: renamed from: b */
    private final void m106416b(AbstractC33673a.c event) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", event.getShareMessage());
        intent.setType(MimeType.MIME_TYPE_TXT);
        this.activity.startActivity(Intent.createChooser(intent, this.activity.getString(AbstractC12922s.f44583R)));
    }

    /* JADX INFO: renamed from: a */
    public final void m106417a(AbstractC33673a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC33673a.c) {
            m106416b((AbstractC33673a.c) event);
        } else if (event instanceof AbstractC33673a.a) {
            this.externalLinkNavigator.m85418e(this.activity);
        } else {
            if (!(event instanceof AbstractC33673a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigator.mo59393b(((AbstractC33673a.b) event).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String());
        }
    }
}
