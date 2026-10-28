package l62;

import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.remote.domain.response.growth.CheckoutOrigin;
import com.whoop.navigation.GenericCachePolicy;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.ReferAFriendHubScreenModel;
import com.whoop.navigation.ReferAFriendScreenModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import j02.AbstractC21155m0;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import o02.InterfaceC27353d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import u92.C34660d;

/* JADX INFO: renamed from: l62.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Ll62/c;", "Lo02/d;", "Lu92/d;", "sharedPreferences", "<init>", "(Lu92/d;)V", "Lcom/whoop/navigation/NavigationScreenModel;", "navigationScreenModel", "Lj02/m0;", "c", "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;", "a", "Lu92/d;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23382c implements InterfaceC27353d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34660d sharedPreferences;

    public C23382c(C34660d sharedPreferences) {
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: b */
    public /* bridge */ InterfaceC27353d mo67682b(List<? extends InterfaceC27353d> list, Map<InterfaceC21461d, ? extends Function1> map) {
        return super.mo67682b(list, map);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC21155m0 mo67681a(NavigationScreenModel navigationScreenModel) {
        String strM109533j;
        String str;
        CheckoutOrigin checkoutOrigin;
        AbstractC22676k.m65750j(navigationScreenModel, "navigationScreenModel");
        String str2 = "";
        if (!(navigationScreenModel instanceof ReferAFriendScreenModel)) {
            if (!(navigationScreenModel instanceof ReferAFriendHubScreenModel)) {
                return AbstractC21155m0.j3.f80414b;
            }
            ReferAFriendHubScreenModel referAFriendHubScreenModel = (ReferAFriendHubScreenModel) navigationScreenModel;
            if (referAFriendHubScreenModel.getResolveServerSide()) {
                return new AbstractC21155m0.m1(new ApiRequest(AbstractC23383d.m67684a(EnumC23385f.WEARABLE, referAFriendHubScreenModel.getSource()), (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), new GenericCachePolicy(false, (String) null, (Set) null, 6, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, 1020, null);
            }
            String shareMessage = referAFriendHubScreenModel.getShareMessage();
            if (shareMessage == null) {
                strM109533j = this.sharedPreferences.m109533j(SharedPreferenceConstants.KEY_REFER_FRIEND_MESSAGE);
                if (strM109533j != null) {
                    str2 = strM109533j;
                }
            } else {
                String str3 = shareMessage.length() > 0 ? shareMessage : null;
                if (str3 == null) {
                    strM109533j = this.sharedPreferences.m109533j(SharedPreferenceConstants.KEY_REFER_FRIEND_MESSAGE);
                    if (strM109533j != null) {
                        str2 = strM109533j;
                    }
                } else {
                    str2 = str3;
                }
            }
            return new AbstractC21155m0.a4(str2, referAFriendHubScreenModel.getSource(), referAFriendHubScreenModel.getGraphId());
        }
        ReferAFriendScreenModel referAFriendScreenModel = (ReferAFriendScreenModel) navigationScreenModel;
        String shareMessage2 = referAFriendScreenModel.getShareMessage();
        if (shareMessage2.length() == 0) {
            String strM109533j2 = this.sharedPreferences.m109533j(SharedPreferenceConstants.KEY_REFER_FRIEND_MESSAGE);
            str = strM109533j2 != null ? strM109533j2 : "";
        } else {
            str = shareMessage2;
        }
        String source = referAFriendScreenModel.getSource();
        String checkoutOrigin2 = referAFriendScreenModel.getCheckoutOrigin();
        for (CheckoutOrigin checkoutOrigin3 : CheckoutOrigin.values()) {
            if (AbstractC22676k.m65745e(checkoutOrigin3.name(), checkoutOrigin2)) {
                checkoutOrigin = checkoutOrigin3;
                return new AbstractC21155m0.b4(str, source, checkoutOrigin, referAFriendScreenModel.getAnalyticsProperties(), referAFriendScreenModel.getDisableDefaultOpenSheetAnalytic());
            }
        }
        checkoutOrigin = null;
        return new AbstractC21155m0.b4(str, source, checkoutOrigin, referAFriendScreenModel.getAnalyticsProperties(), referAFriendScreenModel.getDisableDefaultOpenSheetAnalytic());
    }
}
