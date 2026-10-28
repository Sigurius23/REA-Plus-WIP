package p425qh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import mh.C25535c;
import mh.C25542j;
import p031b9.AbstractC2875y;
import p341nh.C26709c;
import p715kotlin.NoWhenBranchMatchedException;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: qh.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC30356b {

    /* JADX INFO: renamed from: a */
    public static final C25535c f124546a = new C25535c();

    /* JADX INFO: renamed from: a */
    public static final boolean m92825a(C25542j c25542j) {
        int iOrdinal = c25542j.f100114g.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return c25542j.f100106E.f100066a == null && (c25542j.f100132y instanceof C26709c);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final Drawable m92826b(C25542j c25542j, Integer num) {
        if (num == null || num.intValue() == 0) {
            return null;
        }
        Context context = c25542j.f100108a;
        int iIntValue = num.intValue();
        Drawable drawableM92133x = AbstractC30060g.m92133x(context, iIntValue);
        if (drawableM92133x != null) {
            return drawableM92133x;
        }
        throw new IllegalStateException(AbstractC2875y.m8295h(iIntValue, "Invalid resource ID: ").toString());
    }
}
