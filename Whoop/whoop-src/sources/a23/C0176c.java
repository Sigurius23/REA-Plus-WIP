package a23;

import androidx.lifecycle.AbstractC1637w1;
import fe0.AbstractC14415e;
import io.getstream.chat.android.p226ui.viewmodel.channel.ChannelInfoViewModel;
import iw0.AbstractC20992x;
import jr1.AbstractC21897e;
import mi2.AbstractC25580c;
import p715kotlin.jvm.functions.Function1;
import pj2.AbstractC29310i;
import pq2.AbstractC29484a;
import vs2.AbstractC36479e;
import y51.AbstractC39234b;

/* JADX INFO: renamed from: a23.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0176c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f567w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f568x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f569y;

    public /* synthetic */ C0176c(String str, Function1 function1, int i13) {
        this.f567w = i13;
        this.f569y = str;
        this.f568x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f567w) {
            case 0:
                return ChannelInfoViewModel._init_$lambda$1(this.f569y, this.f568x, (AbstractC1637w1) obj);
            case 1:
                return AbstractC14415e.m41063D(this.f568x, this.f569y, obj);
            case 2:
                return AbstractC20992x.m58369L1(this.f568x, this.f569y, obj);
            case 3:
                return AbstractC21897e.m62224B(this.f568x, this.f569y, obj);
            case 4:
                return AbstractC25580c.m75229r(this.f568x, this.f569y, obj);
            case 5:
                return AbstractC29310i.m89043h1(this.f568x, this.f569y, obj);
            case 6:
                return AbstractC29484a.m90060k(this.f568x, this.f569y, obj);
            case 7:
                return AbstractC36479e.m116861W(this.f569y, this.f568x, obj);
            default:
                return AbstractC39234b.m125011k(this.f568x, this.f569y, obj);
        }
    }

    public /* synthetic */ C0176c(Function1 function1, String str, int i13) {
        this.f567w = i13;
        this.f568x = function1;
        this.f569y = str;
    }
}
