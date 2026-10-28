package j02;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import nf1.AbstractC26660a;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j02.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lj02/k;", "Lj02/k0;", "Landroid/content/Context;", "context", "Lj02/i0;", "navDeepLinkRequestHelper", "Landroid/content/Intent;", "bluetoothSettingsIntent", "Leb/x0;", "strapSettingsOptions", "statusIntent", "<init>", "(Landroid/content/Context;Lj02/i0;Landroid/content/Intent;Leb/x0;Landroid/content/Intent;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Landroid/content/Context;", "b", "Lj02/i0;", "c", "Landroid/content/Intent;", "d", "Leb/x0;", "e", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21150k implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Intent bluetoothSettingsIntent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C12997x0 strapSettingsOptions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Intent statusIntent;

    public C21150k(Context context, C21147i0 navDeepLinkRequestHelper, Intent bluetoothSettingsIntent, C12997x0 strapSettingsOptions, Intent statusIntent) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(bluetoothSettingsIntent, "bluetoothSettingsIntent");
        AbstractC22676k.m65750j(strapSettingsOptions, "strapSettingsOptions");
        AbstractC22676k.m65750j(statusIntent, "statusIntent");
        this.context = context;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.bluetoothSettingsIntent = bluetoothSettingsIntent;
        this.strapSettingsOptions = strapSettingsOptions;
        this.statusIntent = statusIntent;
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (navigationScreen instanceof AbstractC21155m0.r0) {
            String connectivityNavType = ((AbstractC21155m0.r0) navigationScreen).getConnectivityNavType();
            int iHashCode = connectivityNavType.hashCode();
            if (iHashCode != -2032180703) {
                if (iHashCode != 460509838) {
                    if (iHashCode == 1182300349 && connectivityNavType.equals("SERVER_ISSUE")) {
                        this.context.startActivity(this.statusIntent);
                        return InterfaceC21149j0.a.f80236a;
                    }
                } else if (connectivityNavType.equals("BLUETOOTH")) {
                    this.context.startActivity(this.bluetoothSettingsIntent);
                    return InterfaceC21149j0.a.f80236a;
                }
            } else if (connectivityNavType.equals("DEFAULT")) {
                return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a("whoop://com.whoop/settings/newStrapSettings"), this.strapSettingsOptions, null, 4, null);
            }
        }
        return InterfaceC21149j0.d.f80241a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21150k(Context context, C21147i0 c21147i0, Intent intent, C12997x0 c12997x0, Intent intent2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Intent intentAddFlags;
        C21147i0 c21147i1 = (i13 & 2) != 0 ? new C21147i0() : c21147i0;
        if ((i13 & 4) != 0) {
            intentAddFlags = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268435456);
            AbstractC22676k.m65749i(intentAddFlags, "addFlags(...)");
        } else {
            intentAddFlags = intent;
        }
        this(context, c21147i1, intentAddFlags, (i13 & 8) != 0 ? new C12997x0(false, false, -1, false, false, AbstractC26660a.f105960e, -1, -1, -1) : c12997x0, (i13 & 16) != 0 ? new Intent("android.intent.action.VIEW", Uri.parse("https://status.whoop.com/")) : intent2);
    }
}
