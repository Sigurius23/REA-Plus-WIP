package a02;

import androidx.core.app.NotificationCompat;
import b02.InterfaceC2199c;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.UniversalBuyNowScreenModel;
import com.whoop.universalcheckout.features.cart.domain.CartAddIntent;
import h02.C16581k0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"La02/a;", "", "<init>", "()V", "Lb02/c$f;", NotificationCompat.CATEGORY_EVENT, "Lb02/c;", "a", "(Lb02/c$f;)Lb02/c;", "Lb02/c$h;", "b", "(Lb02/c$h;)Lb02/c;", "c", "(Ljava/lang/Object;)Lb02/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0096a {
    /* JADX INFO: renamed from: a */
    private final InterfaceC2199c m260a(InterfaceC2199c.f event) {
        AppScreen appScreen = event.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9286c6.f27533w)) {
            CartAddIntent addIntent = event.getAddIntent();
            if (addIntent != null) {
                return new InterfaceC2199c.a(addIntent);
            }
        } else if (AbstractC22676k.m65745e(appScreen, AppScreen.C9278b6.f27508w)) {
            CartAddIntent addIntent2 = event.getAddIntent();
            if (addIntent2 != null) {
                NavigationScreenModel parameters = event.getDestination().getParameters();
                UniversalBuyNowScreenModel universalBuyNowScreenModel = parameters instanceof UniversalBuyNowScreenModel ? (UniversalBuyNowScreenModel) parameters : null;
                return new InterfaceC2199c.d(addIntent2, universalBuyNowScreenModel != null ? universalBuyNowScreenModel.getStoreDomain() : null);
            }
        } else if (!AbstractC22676k.m65745e(appScreen, AppScreen.C9318g6.f27632w)) {
            return new InterfaceC2199c.c(event.getDestination());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC2199c m261b(InterfaceC2199c.h event) {
        C9598e destination;
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (!(obj instanceof C16581k0) || (destination = ((C16581k0) obj).getSizeChart().getDestination()) == null) {
            return null;
        }
        return new InterfaceC2199c.c(destination);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2199c m262c(Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC2199c.h) {
            return m261b((InterfaceC2199c.h) event);
        }
        if (event instanceof InterfaceC2199c.f) {
            return m260a((InterfaceC2199c.f) event);
        }
        if (event instanceof InterfaceC2199c) {
            return (InterfaceC2199c) event;
        }
        if (event instanceof C9598e) {
            return new InterfaceC2199c.c((C9598e) event);
        }
        return null;
    }
}
