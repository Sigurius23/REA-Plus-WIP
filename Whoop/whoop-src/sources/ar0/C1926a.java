package ar0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.universalcheckout.features.AbstractC10635a;
import fr0.C14711a;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.identifier.IdentifiersKt;
import ni0.C26732c;
import or0.C28141a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import rx0.AbstractC31902g;
import xr0.C38627a;

/* JADX INFO: renamed from: ar0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C1926a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7643w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f7644x;

    public /* synthetic */ C1926a(String str, int i13) {
        this.f7643w = i13;
        this.f7644x = str;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f7643w;
        String str = this.f7644x;
        switch (i13) {
            case 0:
                return C1927b.m5904k(str);
            case 1:
                return C14711a.m42161k(str);
            case 2:
                ChatClient.Companion companion = ChatClient.INSTANCE;
                return Integer.valueOf(IdentifiersKt.GetMessageIdentifier(str));
            case 3:
                ChatClient.Companion companion2 = ChatClient.INSTANCE;
                return Integer.valueOf(IdentifiersKt.DeleteMessageForMeIdentifier(str));
            case 4:
                ChatClient.Companion companion3 = ChatClient.INSTANCE;
                return Integer.valueOf(IdentifiersKt.GetMessageIdentifier(str));
            case 5:
                return C26732c.m79586s0(str);
            case 6:
                return C28141a.m85142k(str);
            case 7:
                return AbstractC10635a.m27552m(str);
            case 8:
                return AbstractC31902g.m99172k(str);
            case 9:
                return AbstractC11266d.m30461o("HttpRequest:\n", str);
            case 10:
                return AbstractC11266d.m30461o("HttpResponse:\n", str);
            case 11:
                return str;
            case 12:
                return AbstractC11266d.m30461o("failed to write refreshed token back to disk at ", str);
            case 13:
                return AbstractC11266d.m30461o("failed to write refreshed token back to disk at ", str);
            case 14:
                return AbstractC11266d.m30461o("Chunk trailer string to sign:\n", str);
            case 15:
                return AbstractC11266d.m30461o("Calculated chunk signature: ", str);
            case 16:
                return AbstractC11266d.m30461o("String to sign:\n", str);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC11266d.m30461o("Calculated signature: ", str);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC11266d.m30461o("Chunk string to sign:\n", str);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC11266d.m30461o("Calculated chunk signature: ", str);
            case 20:
                return C38627a.m123829k(str);
            default:
                return AbstractC11895b.m31996o("Service returned malformed \"Date\" header value \"", str, "\", skipping skew calculation");
        }
    }
}
