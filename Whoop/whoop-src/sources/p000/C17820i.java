package p000;

import a61.AbstractC0470c;
import a61.C0472e;
import a81.AbstractC0567r;
import am2.AbstractC1035o0;
import am2.AbstractC1046w;
import androidx.health.platform.client.proto.C1533u;
import aws.sdk.kotlin.runtime.config.imds.EC2MetadataError;
import az1.AbstractC2173n;
import b01.AbstractC2181b;
import b01.AbstractC2195p;
import b01.C2182c;
import b01.InterfaceC2189j;
import b11.C2274a;
import b11.C2281h;
import b30.C2482b;
import b30.C2506e;
import b30.C2521f6;
import b30.C2547j0;
import b30.C2659y0;
import b31.AbstractC2673b;
import b31.C2674c;
import b90.AbstractC2884f;
import b90.C2885g;
import bf0.AbstractC3199k;
import bm0.AbstractC3409l;
import bm0.C3410m;
import bm2.AbstractC3435e;
import bm2.AbstractC3436e0;
import bm2.AbstractC3487z0;
import bm2.C3448i0;
import bs1.AbstractC3583c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4353o;
import cm2.AbstractC4813a0;
import cm2.C4824l;
import com.whoop.design.models.modal.ToastActionButton;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.straphistorysync.sync.C10277e;
import ds1.AbstractC12336f;
import ds1.C12341k;
import e30.AbstractC12605c;
import hv1.C17671a;
import io.getstream.chat.android.p226ui.common.feature.channel.attachments.ChannelAttachmentsViewController;
import io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoMemberViewController;
import io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoViewController;
import io.getstream.chat.android.p226ui.viewmodel.channel.ChannelAttachmentsViewModel;
import io.getstream.chat.android.p226ui.viewmodel.channel.ChannelInfoMemberViewModel;
import io.getstream.chat.android.p226ui.viewmodel.channel.ChannelInfoViewModel;
import java.util.Collection;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import org.joda.time.DateTime;
import p004a2.C0154c;
import p004a2.C0159h;
import p048ce.AbstractC4482w;
import p114eb.C12991u0;
import p326mf.C25500t;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p390p1.AbstractC28622h2;
import p390p1.C28594a2;
import p390p1.C28610e2;
import p390p1.C28614f2;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p698au1.AbstractC2063h;
import p715kotlin.jvm.functions.Function1;
import pv0.InterfaceC29575b;
import r20.C30868f;
import t20.C33333n;
import ug.AbstractC34924m;
import v00.C35459c0;
import ze0.InterfaceC40582a;
import zt1.C41127b;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C17820i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69304w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f69305x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f69306y;

    public /* synthetic */ C17820i(int i13, Object obj, Object obj2) {
        this.f69304w = i13;
        this.f69305x = obj;
        this.f69306y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02c5  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        boolean z4;
        C0159h c0159h;
        boolean z13;
        boolean z14;
        switch (this.f69304w) {
            case 0:
                C26068u c26068u = (C26068u) this.f69305x;
                String str = (String) this.f69306y;
                InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(c26068u.m77565h().f103177k);
                if (interfaceC26054g != null && str != null) {
                    z4 = ((C26062o) interfaceC26054g).f103184a >= c26068u.m77565h().f103180n - 1 && c26068u.m77565h().f103180n > 10;
                }
                return Boolean.valueOf(z4);
            case 1:
                ((Function1) this.f69305x).invoke(new InterfaceC29575b.c(AbstractC8693b.m21268b((TextResource) this.f69306y)));
                return C23454a0.f92919a;
            case 2:
                C28655q c28655q = ((C0154c) this.f69305x).f478w;
                C28614f2 c28614f2 = c28655q.f115908c;
                boolean z15 = c28655q.f115887C;
                Collection collectionM13997j0 = C25271y.f99162w;
                if (!z15) {
                    return collectionM13997j0;
                }
                C28610e2 c28610e2M87016d = c28614f2.m87016d();
                int i13 = 0;
                while (true) {
                    try {
                        c0159h = null;
                        if (i13 < c28614f2.f115765x) {
                            boolean zM87000l = c28610e2M87016d.m87000l(i13);
                            Object obj = this.f69306y;
                            if (zM87000l) {
                                Object objM87002n = c28610e2M87016d.m87002n(i13);
                                if (objM87002n != obj) {
                                    C28594a2 c28594a2 = objM87002n instanceof C28594a2 ? (C28594a2) objM87002n : null;
                                    z14 = (c28594a2 != null ? c28594a2.f115707a : null) == obj;
                                }
                                if (z14) {
                                    C0159h c0159h2 = new C0159h(i13, null);
                                    c28610e2M87016d.m86991c();
                                    c0159h = c0159h2;
                                }
                            }
                            int[] iArr = c28610e2M87016d.f115739b;
                            int i14 = i13 + 1;
                            int iM87028c = (i14 < c28610e2M87016d.f115740c ? iArr[(i14 * 5) + 4] : c28610e2M87016d.f115742e) - AbstractC28622h2.m87028c(iArr, i13);
                            int i15 = 0;
                            while (true) {
                                if (i15 >= iM87028c) {
                                    i13 = i14;
                                } else {
                                    Object objM86996h = c28610e2M87016d.m86996h(i13, i15);
                                    if (objM86996h != obj) {
                                        C28594a2 c28594a3 = objM86996h instanceof C28594a2 ? (C28594a2) objM86996h : null;
                                        z13 = (c28594a3 != null ? c28594a3.f115707a : null) == obj;
                                    }
                                    if (z13) {
                                        c0159h = new C0159h(i13, Integer.valueOf(i15));
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        }
                        c28610e2M87016d.m86991c();
                    } catch (Throwable th3) {
                        c28610e2M87016d.m86991c();
                        throw th3;
                    }
                }
                if (c0159h == null) {
                    return collectionM13997j0;
                }
                int i16 = c0159h.f482a;
                Integer num = c0159h.f483b;
                if (c28655q.f115887C) {
                    C28610e2 c28610e2M87016d2 = c28614f2.m87016d();
                    try {
                        collectionM13997j0 = AbstractC4482w.m13997j0(c28610e2M87016d2, i16, num);
                    } finally {
                        c28610e2M87016d2.m86991c();
                    }
                }
                return AbstractC25265s.m74129g1(collectionM13997j0, c28655q.m87126K());
            case 3:
                return (ChannelAttachmentsViewController) ((Function1) this.f69305x).invoke((ChannelAttachmentsViewModel) this.f69306y);
            case 4:
                return (ChannelInfoMemberViewController) ((Function1) this.f69305x).invoke((ChannelInfoMemberViewModel) this.f69306y);
            case 5:
                return (ChannelInfoViewController) ((Function1) this.f69305x).invoke((ChannelInfoViewModel) this.f69306y);
            case 6:
                return AbstractC0470c.m1139j((Function1) this.f69305x, (C0472e) this.f69306y);
            case 7:
                return AbstractC0567r.m1453n((ToastActionButton) this.f69305x, (Function1) this.f69306y);
            case 8:
                return AbstractC1046w.m3003O((Function1) this.f69305x, (C4824l) this.f69306y);
            case 9:
                return AbstractC1035o0.m2854W0((Function1) this.f69305x, (AbstractC4813a0) this.f69306y);
            case 10:
                return AbstractC2063h.m6499g((Function1) this.f69305x, (C41127b) this.f69306y);
            case 11:
                return AbstractC2173n.m6802H((Function1) this.f69305x, (C12991u0) this.f69306y);
            case 12:
                return AbstractC2181b.m6870f((C2182c) this.f69305x, (Function1) this.f69306y);
            case 13:
                return AbstractC2195p.m6902D((Function1) this.f69305x, (InterfaceC2189j) this.f69306y);
            case 14:
                return C2274a.m7107e((Function1) this.f69305x, (C2281h) this.f69306y);
            case 15:
                ((C2547j0) this.f69305x).m7467a(new C2506e(((C2482b) ((InterfaceC28601c1) this.f69306y).getValue()).f9663a));
                return C23454a0.f92919a;
            case 16:
                AbstractC12605c abstractC12605c = (AbstractC12605c) this.f69305x;
                abstractC12605c.f43009M.m94922e(new C30868f(AbstractC34924m.m110157r(abstractC12605c, (C35459c0) this.f69306y)));
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C33333n c33333n = (C33333n) this.f69305x;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f69306y;
                if (!((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                    c33333n.f139041t.invoke();
                }
                interfaceC28601c1.setValue(Boolean.TRUE);
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) this.f69305x;
                C2659y0 c2659y0 = (C2659y0) this.f69306y;
                interfaceC28601c2.setValue(Boolean.FALSE);
                c2659y0.m7526c(C2521f6.f9811a);
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC2673b.m7537h((Function1) this.f69305x, (C2674c) this.f69306y);
            case 20:
                return AbstractC2884f.m8376x((Function1) this.f69305x, (C2885g) this.f69306y);
            case 21:
                return "IMDS error: statusCode=" + ((C25500t) this.f69305x) + "; " + ((EC2MetadataError) ((Throwable) this.f69306y)).getMessage();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC3199k.m9231w((Function1) this.f69305x, (InterfaceC40582a) this.f69306y);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C10277e.m26274m((C10277e) this.f69305x, (String) this.f69306y);
            case 24:
                return AbstractC3409l.m9814u((Function1) this.f69305x, (C3410m) this.f69306y);
            case 25:
                return AbstractC3435e.m9920n((Function1) this.f69305x, (C3448i0) this.f69306y);
            case 26:
                return Boolean.valueOf(AbstractC3436e0.m9996j0((DateTime) this.f69305x, (InterfaceC28601c1) this.f69306y));
            case 27:
                return AbstractC3487z0.m10225H((C17671a) this.f69305x, (InterfaceC28601c1) this.f69306y);
            case 28:
                return AbstractC3583c0.m10790S0((InterfaceC4353o) this.f69305x, (AbstractC12336f) this.f69306y);
            default:
                return AbstractC3583c0.m10763J0((Function1) this.f69305x, (C12341k) this.f69306y);
        }
    }
}
