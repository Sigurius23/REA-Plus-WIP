package a23;

import androidx.lifecycle.AbstractC1637w1;
import io.getstream.chat.android.p226ui.viewmodel.channel.ChannelAttachmentsViewModel;
import io2.AbstractC20773m0;
import java.util.List;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a23.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0174a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f560w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f561x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f562y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f563z;

    public /* synthetic */ C0174a(String str, List list, Function1 function1) {
        this.f563z = str;
        this.f561x = list;
        this.f562y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f560w) {
            case 0:
                return ChannelAttachmentsViewModel._init_$lambda$1(this.f563z, this.f561x, this.f562y, (AbstractC1637w1) obj);
            default:
                return AbstractC20773m0.m57225q(this.f561x, this.f562y, this.f563z, (InterfaceC26064q) obj);
        }
    }

    public /* synthetic */ C0174a(List list, Function1 function1, String str) {
        this.f561x = list;
        this.f562y = function1;
        this.f563z = str;
    }
}
