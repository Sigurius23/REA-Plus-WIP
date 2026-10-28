package l62;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1340r0;
import com.whoop.data.remote.domain.response.growth.CheckoutOrigin;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.referafriend.utils.SharingBroadcastReceiver;
import f62.AbstractC14152b;
import h62.AbstractC16981a;
import h62.C16982b;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import j02.AbstractC21155m0;
import j02.AbstractC21161p0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import java.util.LinkedHashMap;
import java.util.Map;
import jp1.C21851c;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import nf1.AbstractC26660a;
import o62.C27609b;
import p114eb.C12969k0;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: l62.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ll62/b;", "Lj02/k0;", "Landroidx/fragment/app/r0;", "activity", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lj02/i0;", "navDeepLinkRequestHelper", "Lh62/b;", "analyticsHelper", "<init>", "(Landroidx/fragment/app/r0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/i0;Lh62/b;)V", "", "disableDefaultOpenSheetAnalytic", "c", "(Ljava/lang/Boolean;)Z", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Landroidx/fragment/app/r0;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lj02/i0;", "d", "Lh62/b;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23381b implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractActivityC1340r0 activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C16982b analyticsHelper;

    public C23381b(AbstractActivityC1340r0 activity, FeatureFlagChecker featureFlagChecker, C21147i0 navDeepLinkRequestHelper, C16982b analyticsHelper) {
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.activity = activity;
        this.featureFlagChecker = featureFlagChecker;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m67679b(C23381b c23381b, String str, AbstractC16981a it) {
        AbstractC22676k.m65750j(it, "it");
        c23381b.analyticsHelper.m47809a(it, str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m67680c(Boolean disableDefaultOpenSheetAnalytic) {
        return !AbstractC22676k.m65745e(disableDefaultOpenSheetAnalytic, Boolean.TRUE);
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        boolean z4;
        int iIntValue;
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.b4)) {
            if (!(navigationScreen instanceof AbstractC21155m0.a4)) {
                return InterfaceC21149j0.d.f80241a;
            }
            if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.RAF_HUB)) {
                AbstractC21155m0.a4 a4Var = (AbstractC21155m0.a4) navigationScreen;
                if (a4Var.getShareMessage().length() != 0) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.TEXT", a4Var.getShareMessage());
                    intent.setType(MimeType.MIME_TYPE_TXT);
                    this.activity.startActivity(Intent.createChooser(intent, this.activity.getString(AbstractC14152b.f50984f)));
                    return InterfaceC21149j0.d.f80241a;
                }
            }
            AbstractC21155m0.a4 a4Var2 = (AbstractC21155m0.a4) navigationScreen;
            C12969k0 c12969k0M58994a = this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/referafriend?source=" + a4Var2.getSource());
            Integer graphId = a4Var2.getGraphId();
            int i13 = AbstractC26660a.f105970o;
            int i14 = AbstractC26660a.f105971p;
            if (graphId != null) {
                iIntValue = graphId.intValue();
                z4 = true;
            } else {
                z4 = false;
                iIntValue = -1;
            }
            return new InterfaceC21149j0.c(c12969k0M58994a, new C12997x0(false, false, iIntValue, z4, false, i13, -1, -1, i14), AbstractC21161p0.d.f80690a);
        }
        AbstractC21155m0.b4 b4Var = (AbstractC21155m0.b4) navigationScreen;
        String source = b4Var.getSource();
        CheckoutOrigin checkoutOrigin = b4Var.getCheckoutOrigin();
        String serializedValue = checkoutOrigin != null ? checkoutOrigin.getSerializedValue() : null;
        if (m67680c(b4Var.getDisableDefaultOpenSheetAnalytic())) {
            C16982b c16982b = this.analyticsHelper;
            LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("Region", serializedValue));
            Map<String, String> mapM59031b = b4Var.m59031b();
            if (mapM59031b != null) {
                linkedHashMapM73993b0.putAll(mapM59031b);
            }
            c16982b.m47809a(new AbstractC16981a.d(null, null, serializedValue, linkedHashMapM73993b0, 3, null), source);
        }
        new C27609b(this.activity, serializedValue, b4Var.m59031b(), new C21851c(21, this, source)).m83372c();
        Intent intent2 = new Intent();
        intent2.setAction("android.intent.action.SEND");
        intent2.putExtra("android.intent.extra.TEXT", b4Var.getShareMessage());
        intent2.setType(MimeType.MIME_TYPE_TXT);
        Intent intent3 = new Intent(this.activity, (Class<?>) SharingBroadcastReceiver.class);
        intent3.putExtra("source", source);
        intent3.putExtra("checkout_origin", serializedValue);
        Map<String, String> mapM59031b2 = b4Var.m59031b();
        if (mapM59031b2 != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : mapM59031b2.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            intent3.putExtra("analytics_properties", bundle);
        }
        this.activity.startActivity(Intent.createChooser(intent2, this.activity.getString(AbstractC14152b.f50984f), PendingIntent.getBroadcast(this.activity, 0, intent3, 167772160).getIntentSender()));
        return InterfaceC21149j0.d.f80241a;
    }

    public /* synthetic */ C23381b(AbstractActivityC1340r0 abstractActivityC1340r0, FeatureFlagChecker featureFlagChecker, C21147i0 c21147i0, C16982b c16982b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractActivityC1340r0, featureFlagChecker, (i13 & 4) != 0 ? new C21147i0() : c21147i0, c16982b);
    }
}
