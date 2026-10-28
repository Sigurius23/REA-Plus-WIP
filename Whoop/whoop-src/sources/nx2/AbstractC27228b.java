package nx2;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.data.remote.domain.dto.bff.BottomSheetOption;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignDetailsScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CancelScreenOptionResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.ConnectedDeviceDisplay;
import com.whoop.whooplabs.data.remote.domain.dto.bff.ContentBlockResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.DisconnectView;
import com.whoop.whooplabs.data.remote.domain.dto.bff.LegalDocumentResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.OptionsConfigResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.TaskResponse;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l83.C23465k;
import lz2.AbstractC24825a;
import m83.AbstractC25267u;
import mx2.AbstractC26019f;
import mx2.AbstractC26024k;
import mx2.C26022i;
import mx2.C26023j;
import mx2.C26025l;
import mx2.C26026m;
import mx2.InterfaceC26015b;
import mx2.InterfaceC26018e;
import nz2.AbstractC27307a;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23653j2;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import px2.AbstractC29598a;
import px2.AbstractC29599b;
import px2.AbstractC29607j;
import px2.C29600c;
import px2.C29605h;
import px2.C29606i;
import px2.C29608k;
import px2.C29609l;
import px2.C29610m;
import px2.C29611n;
import px2.InterfaceC29602e;
import px2.InterfaceC29603f;
import px2.InterfaceC29604g;
import y71.C39274g;
import y71.C39282o;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: nx2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\f\u001a\u00020\t*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\u000b\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u0015*\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010\"\u001a\u00020\u0015*\u00020!H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0015*\u00020!H\u0002¢\u0006\u0004\b$\u0010#\u001a\u0013\u0010&\u001a\u00020%*\u00020!H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010(\u001a\u00020%*\u00020!H\u0002¢\u0006\u0004\b(\u0010'\u001a\u0013\u0010+\u001a\u00020**\u00020)H\u0000¢\u0006\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lmx2/f$a;", "Lpx2/f$a;", "m", "(Lmx2/f$a;)Lpx2/f$a;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse;", "Lpx2/n;", "p", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse;)Lpx2/n;", "", "Ly81/e;", "j", "(Ljava/lang/String;)Ly81/e;", "i", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;", "", "campaignId", "Lpx2/m;", "o", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)Lpx2/m;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;", "action", "Lmx2/l;", "f", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lmx2/l;", "d", "Lmx2/k;", "Lpx2/g;", "k", "(Lmx2/k;)Lpx2/g;", "Lmx2/e;", "Lpx2/e;", "l", "(Lmx2/e;)Lpx2/e;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;", "e", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;)Lmx2/l;", "c", "Lmx2/m;", "g", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;)Lmx2/m;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;", "Lpx2/k;", "n", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;)Lpx2/k;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27228b {

    /* JADX INFO: renamed from: nx2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f108988a;

        static {
            int[] iArr = new int[BottomSheetOption.values().length];
            try {
                iArr[BottomSheetOption.CANCEL_ENROLLMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomSheetOption.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BottomSheetOption.CANCEL_TASK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BottomSheetOption.CANCEL_ENROLLMENT_EXTENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f108988a = iArr;
        }
    }

    /* JADX INFO: renamed from: nx2.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f108989w = new b();

        /* JADX INFO: renamed from: a */
        public final long m82058a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getNeutral15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m82058a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: nx2.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f108990w = new c();

        /* JADX INFO: renamed from: a */
        public final long m82059a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m82059a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: nx2.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f108991w = new d();

        /* JADX INFO: renamed from: a */
        public final long m82060a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m82060a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: nx2.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f108992w = new e();

        /* JADX INFO: renamed from: a */
        public final long m82061a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getNeutral15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m82061a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: nx2.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f108993w = new f();

        /* JADX INFO: renamed from: a */
        public final long m82062a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m82062a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: nx2.b$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f108994w = new g();

        /* JADX INFO: renamed from: a */
        public final long m82063a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m82063a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: nx2.b$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f108995w = new h();

        /* JADX INFO: renamed from: a */
        public final long m82064a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m82064a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: nx2.b$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f108996w = new i();

        /* JADX INFO: renamed from: a */
        public final long m82065a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m82065a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: nx2.b$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f108997w = new j();

        /* JADX INFO: renamed from: a */
        public final long m82066a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m82066a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: nx2.b$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f108998w = new k();

        /* JADX INFO: renamed from: a */
        public final long m82067a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m82067a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: nx2.b$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f108999w = new l();

        /* JADX INFO: renamed from: a */
        public final long m82068a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m82068a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: nx2.b$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f109000w = new m();

        /* JADX INFO: renamed from: a */
        public final long m82069a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getNeutral15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m82069a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c */
    private static final C26025l m82044c(ConnectedDeviceDisplay connectedDeviceDisplay) {
        DisconnectView disconnectView = connectedDeviceDisplay.getDisconnectView();
        String errorTitle = disconnectView != null ? disconnectView.getErrorTitle() : null;
        if (errorTitle == null) {
            errorTitle = "";
        }
        DisconnectView disconnectView2 = connectedDeviceDisplay.getDisconnectView();
        String errorBody = disconnectView2 != null ? disconnectView2.getErrorBody() : null;
        if (errorBody == null) {
            errorBody = "";
        }
        DisconnectView disconnectView3 = connectedDeviceDisplay.getDisconnectView();
        String errorPositiveCta = disconnectView3 != null ? disconnectView3.getErrorPositiveCta() : null;
        if (errorPositiveCta == null) {
            errorPositiveCta = "";
        }
        DisconnectView disconnectView4 = connectedDeviceDisplay.getDisconnectView();
        String errorNegativeCta = disconnectView4 != null ? disconnectView4.getErrorNegativeCta() : null;
        return new C26025l(errorTitle, errorBody, errorPositiveCta, errorNegativeCta != null ? errorNegativeCta : "");
    }

    /* JADX INFO: renamed from: d */
    private static final C26025l m82045d(OptionsConfigResponse optionsConfigResponse, BottomSheetOption bottomSheetOption) {
        return new C26025l((String) optionsConfigResponse.getErrorTitle().invoke(bottomSheetOption), (String) optionsConfigResponse.getErrorBody().invoke(bottomSheetOption), (String) optionsConfigResponse.getErrorPositiveCta().invoke(bottomSheetOption), (String) optionsConfigResponse.getErrorNegativeCta().invoke(bottomSheetOption));
    }

    /* JADX INFO: renamed from: e */
    private static final C26025l m82046e(ConnectedDeviceDisplay connectedDeviceDisplay) {
        DisconnectView disconnectView = connectedDeviceDisplay.getDisconnectView();
        String title = disconnectView != null ? disconnectView.getTitle() : null;
        if (title == null) {
            title = "";
        }
        DisconnectView disconnectView2 = connectedDeviceDisplay.getDisconnectView();
        String body = disconnectView2 != null ? disconnectView2.getBody() : null;
        if (body == null) {
            body = "";
        }
        DisconnectView disconnectView3 = connectedDeviceDisplay.getDisconnectView();
        String positiveCta = disconnectView3 != null ? disconnectView3.getPositiveCta() : null;
        if (positiveCta == null) {
            positiveCta = "";
        }
        DisconnectView disconnectView4 = connectedDeviceDisplay.getDisconnectView();
        String negativeCta = disconnectView4 != null ? disconnectView4.getNegativeCta() : null;
        return new C26025l(title, body, positiveCta, negativeCta != null ? negativeCta : "");
    }

    /* JADX INFO: renamed from: f */
    private static final C26025l m82047f(OptionsConfigResponse optionsConfigResponse, BottomSheetOption bottomSheetOption) {
        return new C26025l((String) optionsConfigResponse.getTitle().invoke(bottomSheetOption), (String) optionsConfigResponse.getBody().invoke(bottomSheetOption), (String) optionsConfigResponse.getPositiveCta().invoke(bottomSheetOption), (String) optionsConfigResponse.getNegativeCta().invoke(bottomSheetOption));
    }

    /* JADX INFO: renamed from: g */
    private static final C26026m m82048g(ConnectedDeviceDisplay connectedDeviceDisplay) {
        DisconnectView disconnectView = connectedDeviceDisplay.getDisconnectView();
        String submittingTitle = disconnectView != null ? disconnectView.getSubmittingTitle() : null;
        if (submittingTitle == null) {
            submittingTitle = "";
        }
        DisconnectView disconnectView2 = connectedDeviceDisplay.getDisconnectView();
        String submittingBody = disconnectView2 != null ? disconnectView2.getSubmittingBody() : null;
        return new C26026m(submittingTitle, submittingBody != null ? submittingBody : "");
    }

    /* JADX INFO: renamed from: h */
    private static final C26026m m82049h(ConnectedDeviceDisplay connectedDeviceDisplay) {
        DisconnectView disconnectView = connectedDeviceDisplay.getDisconnectView();
        String successText = disconnectView != null ? disconnectView.getSuccessText() : null;
        if (successText == null) {
            successText = "";
        }
        DisconnectView disconnectView2 = connectedDeviceDisplay.getDisconnectView();
        String successSubtext = disconnectView2 != null ? disconnectView2.getSuccessSubtext() : null;
        return new C26026m(successText, successSubtext != null ? successSubtext : "");
    }

    /* JADX INFO: renamed from: i */
    private static final InterfaceC39332e m82050i(String str) {
        String upperCase;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (upperCase != null) {
            int iHashCode = upperCase.hashCode();
            if (iHashCode != -1732662873) {
                if (iHashCode != 1530431993) {
                    if (iHashCode == 1703738421 && upperCase.equals("NEGATIVE")) {
                        return p745y81.Function1.m125323a(d.f108991w);
                    }
                } else if (upperCase.equals("POSITIVE")) {
                    return p745y81.Function1.m125323a(c.f108990w);
                }
            } else if (upperCase.equals("NEUTRAL")) {
                return p745y81.Function1.m125323a(b.f108989w);
            }
        }
        return p745y81.Function1.m125323a(e.f108992w);
    }

    /* JADX INFO: renamed from: j */
    private static final InterfaceC39332e m82051j(String str) {
        String upperCase;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (upperCase != null) {
            int iHashCode = upperCase.hashCode();
            if (iHashCode != -1732662873) {
                if (iHashCode != 1530431993) {
                    if (iHashCode == 1703738421 && upperCase.equals("NEGATIVE")) {
                        return p745y81.Function1.m125323a(h.f108995w);
                    }
                } else if (upperCase.equals("POSITIVE")) {
                    return p745y81.Function1.m125323a(g.f108994w);
                }
            } else if (upperCase.equals("NEUTRAL")) {
                return p745y81.Function1.m125323a(f.f108993w);
            }
        }
        return p745y81.Function1.m125323a(i.f108996w);
    }

    /* JADX INFO: renamed from: k */
    private static final InterfaceC29604g m82052k(AbstractC26024k abstractC26024k) {
        if (AbstractC22676k.m65745e(abstractC26024k, AbstractC26024k.d.f102940a)) {
            return InterfaceC29604g.c.f120919a;
        }
        if (abstractC26024k instanceof AbstractC26024k.a) {
            AbstractC26024k.a aVar = (AbstractC26024k.a) abstractC26024k;
            return new InterfaceC29604g.b(new C29609l(AbstractC8693b.m21278l(aVar.m77411e()), AbstractC8693b.m21278l(aVar.m77408b()), AbstractC8693b.m21278l(aVar.m77410d()), AbstractC8693b.m21278l(aVar.m77409c()), aVar.getAction(), true));
        }
        if (abstractC26024k instanceof AbstractC26024k.e) {
            AbstractC26024k.e eVar = (AbstractC26024k.e) abstractC26024k;
            return new InterfaceC29604g.b(new C29609l(AbstractC8693b.m21278l(eVar.m77428e()), AbstractC8693b.m21278l(eVar.m77425b()), AbstractC8693b.m21278l(eVar.m77427d()), AbstractC8693b.m21278l(eVar.m77426c()), eVar.getAction(), false));
        }
        if (!(abstractC26024k instanceof AbstractC26024k.b)) {
            if (!(abstractC26024k instanceof AbstractC26024k.c)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC26024k.c cVar = (AbstractC26024k.c) abstractC26024k;
            return new InterfaceC29604g.a(new AbstractC29599b.b(cVar.getOriginalAction(), AbstractC8693b.m21278l(cVar.getFeedbackConfig().getTitle()), AbstractC8693b.m21278l(cVar.getFeedbackConfig().getSubtitle()), AbstractC8693b.m21278l(cVar.getSelectedReasonDisplayText()), cVar.getReasonKey(), cVar.getAdditionalText(), AbstractC8693b.m21278l(cVar.getFeedbackConfig().getBottomText()), AbstractC8693b.m21278l(cVar.getFeedbackConfig().getCtaText())));
        }
        AbstractC26024k.b bVar = (AbstractC26024k.b) abstractC26024k;
        InterfaceC26015b originalAction = bVar.getOriginalAction();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(bVar.getFeedbackConfig().getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(bVar.getFeedbackConfig().getSubtitle());
        List<C26023j> listM77401c = bVar.getFeedbackConfig().m77401c();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM77401c, 10));
        for (C26023j c26023j : listM77401c) {
            arrayList.add(new C29605h(c26023j.getKey(), AbstractC8693b.m21278l(c26023j.getDisplayText()), c26023j.getRequiresAdditionalInput(), AbstractC22676k.m65745e(c26023j.getKey(), bVar.getSelectedReason())));
        }
        return new InterfaceC29604g.a(new AbstractC29599b.a(originalAction, textResourceM21278l, textResourceM21278l2, arrayList, AbstractC8693b.m21278l(bVar.getFeedbackConfig().getBottomText()), AbstractC8693b.m21278l(bVar.getFeedbackConfig().getCtaText())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC29602e m82053l(InterfaceC26018e interfaceC26018e) {
        if (interfaceC26018e instanceof InterfaceC26018e.a) {
            return new InterfaceC29602e.a(((InterfaceC26018e.a) interfaceC26018e).getCampaignId());
        }
        if (AbstractC22676k.m65745e(interfaceC26018e, InterfaceC26018e.b.f102845a)) {
            return InterfaceC29602e.b.f120878a;
        }
        if (interfaceC26018e instanceof InterfaceC26018e.d) {
            InterfaceC26018e.d dVar = (InterfaceC26018e.d) interfaceC26018e;
            return new InterfaceC29602e.d(AbstractC8693b.m21278l(dVar.getTitle()), AbstractC8693b.m21278l(dVar.getSupportText()));
        }
        if (!(interfaceC26018e instanceof InterfaceC26018e.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC26018e.c cVar = (InterfaceC26018e.c) interfaceC26018e;
        return new InterfaceC29602e.c(cVar.getCampaignId(), AbstractC8693b.m21278l(cVar.getTitle()), AbstractC8693b.m21278l(cVar.getSupportText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x015a  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c8  */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC29603f.a m82054m(AbstractC26019f.a aVar) {
        AbstractC29607j abstractC29607j;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        ArrayList arrayList;
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        EnumC16313m0 enumC16313m2;
        AbstractC29607j bVar;
        if (aVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getConnectedDeviceDisplay() != null) {
            ConnectedDeviceDisplay connectedDeviceDisplay = aVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getConnectedDeviceDisplay();
            if (aVar.getIsDeviceConnected()) {
                bVar = new AbstractC29607j.a(AbstractC8693b.m21278l(connectedDeviceDisplay.getTitle()), AbstractC8693b.m21278l(connectedDeviceDisplay.getConnectedSubtitle()), AbstractC8693b.m21278l(connectedDeviceDisplay.getConnectedText()), AbstractC16315n0.m46379d(connectedDeviceDisplay.getConnectedIcon(), null, 1, null), new C29606i(AbstractC16315n0.m46379d(connectedDeviceDisplay.getConnectedCtaButton().getIcon(), null, 1, null), AbstractC8693b.m21278l(connectedDeviceDisplay.getConnectedCtaButton().getText())), new InterfaceC26015b.c(aVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getCampaignId(), m82046e(connectedDeviceDisplay), m82044c(connectedDeviceDisplay), null, m82049h(connectedDeviceDisplay), m82048g(connectedDeviceDisplay), 8, null));
            } else {
                bVar = new AbstractC29607j.b(AbstractC8693b.m21278l(connectedDeviceDisplay.getTitle()), AbstractC8693b.m21278l(AbstractC27307a.m82457b(aVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getConnectedDeviceDisplay().getDisconnectedSubtitle(), aVar.getLastBtHrReceivedTime(), null, null, 12, null)), AbstractC8693b.m21278l(connectedDeviceDisplay.getDisconnectedText()), AbstractC16315n0.m46379d(connectedDeviceDisplay.getDisconnectedIcon(), null, 1, null), new C29606i(AbstractC16315n0.m46379d(connectedDeviceDisplay.getDisconnectedCtaButton().getIcon(), null, 1, null), AbstractC8693b.m21278l(connectedDeviceDisplay.getDisconnectedCtaButton().getText())));
            }
            abstractC29607j = bVar;
        } else {
            abstractC29607j = null;
        }
        CampaignDetailsScreenResponse campaignDetailsScreenResponse = aVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
        int campaignId = campaignDetailsScreenResponse.getCampaignId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(campaignDetailsScreenResponse.getToolbarTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(campaignDetailsScreenResponse.getTitle());
        String headerSubtitle = campaignDetailsScreenResponse.getHeaderSubtitle();
        String headerImage = campaignDetailsScreenResponse.getHeaderImage();
        String headerIcon = campaignDetailsScreenResponse.getHeaderIcon();
        int i13 = 0;
        if (headerIcon != null) {
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    enumC16313m2 = null;
                    break;
                }
                enumC16313m2 = enumC16313m0ArrValues[i14];
                if (AbstractC22676k.m65745e(enumC16313m2.name(), headerIcon)) {
                    break;
                }
                i14++;
            }
            numValueOf = enumC16313m2 != null ? Integer.valueOf(enumC16313m2.toWhoopIcon()) : null;
        } else {
            numValueOf = null;
        }
        AbstractC29598a.Companion companion = AbstractC29598a.INSTANCE;
        String badgeType = campaignDetailsScreenResponse.getBadgeType();
        String badge = campaignDetailsScreenResponse.getBadge();
        if (badge != null) {
            EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues2[i15];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), badge)) {
                    break;
                }
                i15++;
            }
            if (enumC16313m1 != null) {
                numValueOf2 = Integer.valueOf(enumC16313m1.toWhoopIcon());
            } else {
                numValueOf2 = null;
            }
        } else {
            numValueOf2 = null;
        }
        AbstractC29598a abstractC29598aM90782a = companion.m90782a(badgeType, numValueOf2, campaignDetailsScreenResponse.getBadgeText(), campaignDetailsScreenResponse.getBadgeTextSubtitle());
        List<ContentBlockResponse> contentBlocks = campaignDetailsScreenResponse.getContentBlocks();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(contentBlocks, 10));
        Iterator<T> it = contentBlocks.iterator();
        while (it.hasNext()) {
            arrayList2.add(m82055n((ContentBlockResponse) it.next()));
        }
        String scheduleText = campaignDetailsScreenResponse.getScheduleText();
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(campaignDetailsScreenResponse.getScheduleCta());
        String statusBadgeIcon = campaignDetailsScreenResponse.getStatusBadgeIcon();
        if (statusBadgeIcon != null) {
            EnumC16313m0[] enumC16313m0ArrValues3 = EnumC16313m0.values();
            int length3 = enumC16313m0ArrValues3.length;
            while (true) {
                if (i13 >= length3) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues3[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), statusBadgeIcon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m0 != null) {
                numValueOf3 = Integer.valueOf(enumC16313m0.toWhoopIcon());
            } else {
                numValueOf3 = null;
            }
        } else {
            numValueOf3 = null;
        }
        InterfaceC39332e interfaceC39332eM82051j = m82051j(campaignDetailsScreenResponse.getStatusBadgeType());
        InterfaceC39332e interfaceC39332eM82050i = m82050i(campaignDetailsScreenResponse.getStatusBadgeType());
        String statusTitle = campaignDetailsScreenResponse.getStatusTitle();
        String str = statusTitle == null ? "" : statusTitle;
        String statusBody = campaignDetailsScreenResponse.getStatusBody();
        String str2 = statusBody == null ? "" : statusBody;
        List<TaskResponse> nextTasks = campaignDetailsScreenResponse.getNextTasks();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(nextTasks, 10));
        Iterator<T> it3 = nextTasks.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m82057p((TaskResponse) it3.next()));
        }
        String description = campaignDetailsScreenResponse.getDescription();
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(campaignDetailsScreenResponse.getDescriptionCta());
        String subDescription = campaignDetailsScreenResponse.getSubDescription();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(campaignDetailsScreenResponse.getAlertTitle());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(campaignDetailsScreenResponse.getAlertDisplay());
        String fullDescription = campaignDetailsScreenResponse.getFullDescription();
        String cta = campaignDetailsScreenResponse.getCta();
        OptionsConfigResponse optionsConfig = campaignDetailsScreenResponse.getOptionsConfig();
        C29610m c29610mM82056o = optionsConfig != null ? m82056o(optionsConfig, campaignDetailsScreenResponse.getCampaignId()) : null;
        String documentDisplay = campaignDetailsScreenResponse.getDocumentDisplay();
        List<LegalDocumentResponse> documents = campaignDetailsScreenResponse.getDocuments();
        if (documents != null) {
            List<LegalDocumentResponse> list = documents;
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList4.add(AbstractC24825a.m72772a((LegalDocumentResponse) it4.next()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        InterfaceC29604g interfaceC29604gM82052k = m82052k(aVar.getOverlayState());
        InfoCalloutTileModel dataSubmittedCallout = campaignDetailsScreenResponse.getDataSubmittedCallout();
        return new InterfaceC29603f.a(campaignId, textResourceM21278l, textResourceM21278l2, headerSubtitle, numValueOf, abstractC29598aM90782a, headerImage, arrayList2, abstractC29607j, scheduleText, c8691eM21279m, interfaceC39332eM82051j, interfaceC39332eM82050i, numValueOf3, str, str2, arrayList3, description, textResourceM21278l3, subDescription, textResourceM21278l4, textResourceM21278l5, fullDescription, cta, c29610mM82056o, documentDisplay, arrayList, interfaceC29604gM82052k, dataSubmittedCallout != null ? AbstractC23653j2.m68922b(dataSubmittedCallout) : null);
    }

    /* JADX INFO: renamed from: n */
    public static final C29608k m82055n(ContentBlockResponse contentBlockResponse) {
        String str;
        AbstractC22676k.m65750j(contentBlockResponse, "<this>");
        String topText = contentBlockResponse.getTopText();
        String str2 = null;
        if (topText != null) {
            List listM125906y0 = AbstractC39414r.m125906y0(topText, new String[]{" "}, 2);
            str = (String) (listM125906y0.size() > 0 ? listM125906y0.get(0) : "");
        } else {
            str = null;
        }
        String topText2 = contentBlockResponse.getTopText();
        if (topText2 != null) {
            List listM125906y1 = AbstractC39414r.m125906y0(topText2, new String[]{" "}, 2);
            str2 = (String) (1 < listM125906y1.size() ? listM125906y1.get(1) : "");
        }
        C23465k c23465k = new C23465k(AbstractC8693b.m21278l(str), AbstractC8693b.m21278l(str2));
        String bottomText = contentBlockResponse.getBottomText();
        return new C29608k(c23465k, bottomText != null ? bottomText : "");
    }

    /* JADX INFO: renamed from: o */
    private static final C29610m m82056o(OptionsConfigResponse optionsConfigResponse, int i13) {
        InterfaceC26015b aVar;
        InterfaceC26015b dVar;
        Map<BottomSheetOption, String> bottomSheetOptions = optionsConfigResponse.getBottomSheetOptions();
        ArrayList arrayList = new ArrayList(bottomSheetOptions.size());
        for (Map.Entry<BottomSheetOption, String> entry : bottomSheetOptions.entrySet()) {
            BottomSheetOption key = entry.getKey();
            int i14 = a.f108988a[key.ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    dVar = new InterfaceC26015b.d(-1, m82047f(optionsConfigResponse, key), m82045d(optionsConfigResponse, key), null, null, null, 56, null);
                } else if (i14 == 3) {
                    aVar = new InterfaceC26015b.b(i13, m82047f(optionsConfigResponse, key), m82045d(optionsConfigResponse, key), null, null, null, 56, null);
                } else {
                    if (i14 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C26025l c26025lM82047f = m82047f(optionsConfigResponse, key);
                    C26025l c26025lM82045d = m82045d(optionsConfigResponse, key);
                    String str = (String) optionsConfigResponse.getCancelScreenTitle().invoke(key);
                    String str2 = (String) optionsConfigResponse.getCancelScreenSubtitle().invoke(key);
                    String str3 = (String) optionsConfigResponse.getCancelScreenBottomText().invoke(key);
                    Iterable<CancelScreenOptionResponse> iterable = (Iterable) optionsConfigResponse.getCancelScreenOptions().invoke(key);
                    ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
                    for (CancelScreenOptionResponse cancelScreenOptionResponse : iterable) {
                        arrayList2.add(new C26023j(cancelScreenOptionResponse.getKey(), cancelScreenOptionResponse.getValue(), cancelScreenOptionResponse.getAdditionalText()));
                    }
                    dVar = new InterfaceC26015b.a(i13, c26025lM82047f, c26025lM82045d, new C26022i(str, str2, arrayList2, str3, (String) optionsConfigResponse.getCancelScreenCtaText().invoke(key), (String) optionsConfigResponse.getCancelScreenBackText().invoke(key)), null, null, null, 112, null);
                }
                arrayList.add(new C29600c(dVar, entry.getValue()));
            } else {
                aVar = new InterfaceC26015b.a(i13, m82047f(optionsConfigResponse, key), m82045d(optionsConfigResponse, key), null, null, null, null, 56, null);
            }
            dVar = aVar;
            arrayList.add(new C29600c(dVar, entry.getValue()));
        }
        return new C29610m(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private static final C29611n m82057p(TaskResponse taskResponse) {
        C39274g c39274g;
        EnumC16313m0 enumC16313m0;
        int sessionId = taskResponse.getSessionId();
        C39282o.Companion companion = C39282o.INSTANCE;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(taskResponse.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(taskResponse.getSubtitle());
        InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(j.f108997w);
        String leftIcon = taskResponse.getLeftIcon();
        Object c39274g2 = null;
        if (leftIcon != null) {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.ACTIVITY;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), leftIcon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            c39274g = new C39274g(enumC16313m1.toWhoopIcon(), AbstractC8693b.m21278l(""));
        } else {
            c39274g = null;
        }
        InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a(k.f108998w);
        String rightIcon = taskResponse.getRightIcon();
        if (rightIcon != null) {
            EnumC16313m0 enumC16313m2 = EnumC16313m0.CARET_FORWARD;
            for (EnumC16313m0 enumC16313m3 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m3.name(), rightIcon)) {
                    c39274g2 = enumC16313m3;
                    break;
                }
            }
            if (c39274g2 != null) {
                enumC16313m2 = c39274g2;
            }
            c39274g2 = new C39274g(enumC16313m2.toWhoopIcon(), AbstractC8693b.m21278l(""));
        }
        return new C29611n(sessionId, C39282o.Companion.m125229d(companion, textResourceM21278l, null, null, textResourceM21278l2, interfaceC39332eM125323a, c39274g, interfaceC39332eM125323a2, c39274g2, p745y81.Function1.m125323a(l.f108999w), null, null, null, null, p745y81.Function1.m125323a(m.f109000w), AbstractC22676k.m65745e(taskResponse.getMenuItemState(), "ENABLED"), false, null, false, null, null, null, false, null, 8363526, null));
    }
}
