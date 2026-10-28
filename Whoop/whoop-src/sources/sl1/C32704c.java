package sl1;

import a11.C0140r;
import a11.EnumC0123a;
import live.hms.video.error.ErrorCodes;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sl1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lsl1/c;", "", "<init>", "()V", "Lsl1/b;", "alertTile", "La11/r;", "a", "(Lsl1/b;)La11/r;", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32704c {

    /* JADX INFO: renamed from: a */
    public static final int f135890a = 0;

    /* JADX INFO: renamed from: a */
    public final C0140r m102648a(AbstractC32703b alertTile) {
        AbstractC22676k.m65750j(alertTile, "alertTile");
        if (alertTile instanceof AbstractC32703b.a) {
            return new C0140r(alertTile.getTitleMessage(), alertTile.getSubTitleMessage(), null, alertTile.getLeftIcon(), false, null, null, alertTile.getCtaButtonLabel(), false, null, null, alertTile.getConnectivityNavType(), null, true, ErrorCodes.GenericErrors.cJsonParsingFailed, null);
        }
        if (alertTile instanceof AbstractC32703b.p) {
            return new C0140r(alertTile.getTitleMessage(), alertTile.getSubTitleMessage(), null, alertTile.getLeftIcon(), false, null, null, null, false, null, null, null, null, true, 8180, null);
        }
        if (alertTile instanceof AbstractC32703b.d) {
            return new C0140r(alertTile.getTitleMessage(), null, null, alertTile.getLeftIcon(), false, alertTile.getDataLabel(), alertTile.getTimeLabel(), null, false, null, alertTile.getConnectivityStatusType(), null, null, true, 7062, null);
        }
        if (alertTile instanceof AbstractC32703b.e) {
            return new C0140r(alertTile.getTitleMessage(), null, null, null, false, alertTile.getDataLabel(), alertTile.getTimeLabel(), null, false, null, alertTile.getConnectivityStatusType(), null, null, true, 7070, null);
        }
        if (alertTile instanceof AbstractC32703b.q) {
            return new C0140r(alertTile.getTitleMessage(), alertTile.getSubTitleMessage(), null, alertTile.getLeftIcon(), false, null, null, alertTile.getCtaButtonLabel(), false, null, alertTile.getConnectivityStatusType(), alertTile.getConnectivityNavType(), null, true, 4980, null);
        }
        if ((alertTile instanceof AbstractC32703b.c) || (alertTile instanceof AbstractC32703b.b) || (alertTile instanceof AbstractC32703b.g)) {
            return new C0140r(alertTile.getTitleMessage(), null, null, alertTile.getLeftIcon(), false, null, null, null, false, null, alertTile.getConnectivityStatusType(), null, null, true, 7158, null);
        }
        if (alertTile instanceof AbstractC32703b.r) {
            return new C0140r(alertTile.getTitleMessage(), alertTile.getSubTitleMessage(), null, alertTile.getLeftIcon(), false, null, null, null, false, null, null, null, null, true, 8180, null);
        }
        if (alertTile instanceof AbstractC32703b.k) {
            return new C0140r(alertTile.getTitleMessage(), alertTile.getSubTitleMessage(), null, alertTile.getLeftIcon(), false, null, null, alertTile.getCtaButtonLabel(), false, null, null, null, null, true, 8052, null);
        }
        if (alertTile instanceof AbstractC32703b.m) {
            return new C0140r(alertTile.getTitleMessage(), alertTile.getSubTitleMessage(), null, null, alertTile.getLeftLottieAnimation(), null, null, null, false, null, null, null, null, true, 8172, null);
        }
        if (alertTile instanceof AbstractC32703b.l) {
            return new C0140r(alertTile.getTitleMessage(), alertTile.getSubTitleMessage(), null, alertTile.getLeftIcon(), false, null, null, null, false, alertTile.getConnectivityInfoTileType(), alertTile.getConnectivityStatusType(), null, EnumC0123a.RESET_FW_STATE, true, 2548, null);
        }
        if (alertTile instanceof AbstractC32703b.i) {
            return new C0140r(alertTile.getTitleMessage(), null, null, alertTile.getLeftIcon(), false, null, null, null, false, alertTile.getConnectivityInfoTileType(), alertTile.getConnectivityStatusType(), null, EnumC0123a.RESET_FW_STATE, true, 2550, null);
        }
        if (alertTile instanceof AbstractC32703b.j) {
            return new C0140r(alertTile.getTitleMessage(), alertTile.getSubTitleMessage(), null, alertTile.getLeftIcon(), false, null, null, null, false, alertTile.getConnectivityInfoTileType(), alertTile.getConnectivityStatusType(), null, EnumC0123a.RETRY_FW_UPDATE, true, 2548, null);
        }
        if (alertTile instanceof AbstractC32703b.h) {
            return new C0140r(alertTile.getTitleMessage(), alertTile.getSubTitleMessage(), null, alertTile.getLeftIcon(), false, null, null, alertTile.getCtaButtonLabel(), alertTile.getUseSolidCtaButton(), null, null, null, EnumC0123a.PROCESS_FW, true, 3700, null);
        }
        if (alertTile instanceof AbstractC32703b.n) {
            return new C0140r(alertTile.getTitleMessage(), alertTile.getSubTitleMessage(), null, alertTile.getLeftIcon(), false, null, null, alertTile.getCtaButtonLabel(), alertTile.getUseSolidCtaButton(), null, null, null, EnumC0123a.LOCATION_PERMISSION_REQUIRED, true, 3700, null);
        }
        return alertTile instanceof AbstractC32703b.o ? new C0140r(alertTile.getTitleMessage(), alertTile.getSubTitleMessage(), null, alertTile.getLeftIcon(), false, null, null, null, false, null, alertTile.getConnectivityStatusType(), null, EnumC0123a.LOW_BATTERY_ONCE_A_DAY_DISMISS, true, 3060, null) : new C0140r(null, null, null, null, false, null, null, null, false, null, null, null, null, false, 16383, null);
    }
}
