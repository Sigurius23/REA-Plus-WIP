package p229ip;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.AbstractC4977h;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C4974e;
import com.google.android.gms.common.api.C4975f;
import com.google.android.gms.common.api.C4976g;
import com.google.android.gms.common.api.Status;
import p096dq.C12281y;
import p402po.C29393j;
import p402po.C29395l;
import p402po.C29396m;
import p460rg.AbstractC31366a;

/* JADX INFO: renamed from: ip.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C20792c extends AbstractC4977h {

    /* JADX INFO: renamed from: b */
    public static final C4975f f78077b = new C4975f("Auth.Api.Identity.CredentialSaving.API", new C12281y(1), new C4974e());

    /* JADX INFO: renamed from: c */
    public static final C4975f f78078c = new C4975f("Auth.Api.Identity.SignIn.API", new C12281y(2), new C4974e());

    /* JADX INFO: renamed from: a */
    public final String f78079a;

    public C20792c(HiddenActivity hiddenActivity, C29395l c29395l) {
        super(hiddenActivity, hiddenActivity, f78077b, c29395l, C4976g.f20501c);
        this.f78079a = AbstractC20796g.m57331a();
    }

    /* JADX INFO: renamed from: c */
    public C29393j m57327c(Intent intent) throws ApiException {
        Status status = Status.f20490G;
        if (intent == null) {
            throw new ApiException(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra(NotificationCompat.CATEGORY_STATUS);
        Status status2 = (Status) (byteArrayExtra == null ? null : AbstractC31366a.m96470j(byteArrayExtra, creator));
        if (status2 == null) {
            throw new ApiException(Status.f20492I);
        }
        if (!status2.m15593b()) {
            throw new ApiException(status2);
        }
        Parcelable.Creator<C29393j> creator2 = C29393j.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        C29393j c29393j = (C29393j) (byteArrayExtra2 != null ? AbstractC31366a.m96470j(byteArrayExtra2, creator2) : null);
        if (c29393j != null) {
            return c29393j;
        }
        throw new ApiException(status);
    }

    public C20792c(HiddenActivity hiddenActivity, C29396m c29396m) {
        super(hiddenActivity, hiddenActivity, f78078c, c29396m, C4976g.f20501c);
        this.f78079a = AbstractC20796g.m57331a();
    }

    public C20792c(Context context, C29396m c29396m) {
        super(context, null, f78078c, c29396m, C4976g.f20501c);
        this.f78079a = AbstractC20796g.m57331a();
    }
}
