package od1;

import androidx.core.app.NotificationCompat;
import com.whoop.domain.model.Login;
import com.whoop.domain.model.Logout;
import com.whoop.domain.model.Session;
import com.whoop.domain.model.UserSwitchEvent;
import com.whoop.service.network.model.LoginResult;
import ec3.InterfaceC13087t1;
import fj0.C14527a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import xg3.C38280g;

/* JADX INFO: renamed from: od1.a0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011H'¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011H'¢\u0006\u0004\b\u0018\u0010\u0014R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001e8&X§\u0004¢\u0006\f\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010%¨\u0006+À\u0006\u0003"}, m65681d2 = {"Lod1/a0;", "", "", NotificationCompat.CATEGORY_EMAIL, "password", "seonFingerprint", "Lcom/whoop/service/network/model/LoginResult;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lfj0/a;", "cognitoAuthMaterial", "Ll83/a0;", "f", "(Lfj0/a;Lq83/d;)Ljava/lang/Object;", "a", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lxg3/g;", "Lcom/whoop/domain/model/UserSwitchEvent;", "g", "()Lxg3/g;", "Lcom/whoop/domain/model/Logout;", "j", "Lcom/whoop/domain/model/Login;", "e", "Lcom/whoop/domain/model/Session;", "q", "()Lcom/whoop/domain/model/Session;", "getSession$annotations", "session", "", "getUserId", "()I", "getUserId$annotations", "userId", "Lec3/t1;", "i", "()Lec3/t1;", "loginFlow", "b", "logoutFlow", "d", "userSwitchFlow", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC27837a0 {
    /* JADX INFO: renamed from: a */
    void mo83911a();

    /* JADX INFO: renamed from: b */
    InterfaceC13087t1 getLogoutFlow();

    /* JADX INFO: renamed from: c */
    Object mo83913c(String str, String str2, String str3, InterfaceC30057d<? super LoginResult> interfaceC30057d);

    /* JADX INFO: renamed from: d */
    InterfaceC13087t1 getUserSwitchFlow();

    @InterfaceC23457c
    /* JADX INFO: renamed from: e */
    C38280g<Login> mo83915e();

    /* JADX INFO: renamed from: f */
    Object mo83916f(C14527a c14527a, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC23457c
    /* JADX INFO: renamed from: g */
    C38280g<UserSwitchEvent> mo83917g();

    int getUserId();

    /* JADX INFO: renamed from: h */
    void mo83918h();

    /* JADX INFO: renamed from: i */
    InterfaceC13087t1 getLoginFlow();

    @InterfaceC23457c
    /* JADX INFO: renamed from: j */
    C38280g<Logout> mo83920j();

    /* JADX INFO: renamed from: q */
    Session mo83921q();
}
