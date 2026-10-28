package p33;

import a00.C0071f;
import a30.C0332w0;
import a33.C0352d;
import a40.InterfaceC0358c;
import a40.InterfaceC0360e;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.glance.session.TimeoutCancellationException;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b33.AbstractC2687h;
import b33.C2689j;
import b33.EnumC2680a;
import b33.EnumC2682c;
import b33.EnumC2686g;
import b33.EnumC2688i;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import c33.C3937d;
import c33.C3938e;
import c53.AbstractC4257c;
import c93.InterfaceC4351m;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity;
import d33.C11602h1;
import d33.C11624r;
import dc3.InterfaceC11936u;
import e33.C12645n;
import e33.C12662v0;
import ec3.AbstractC13091v;
import ec3.C13043h0;
import ec3.C13045h2;
import ec3.C13081r1;
import fk.InterfaceC14544a;
import h40.C16845k;
import hc3.AbstractC17182o;
import hc3.C17171d;
import io.getstream.video.android.core.call.utils.SfuRetryableException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kc3.C22365e;
import l53.C23369j;
import l53.C23372m;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n43.C26285a;
import nh3.AbstractC26725a;
import nw0.C27198e;
import org.webrtc.Camera2Capturer;
import org.webrtc.PeerConnection;
import org.webrtc.SurfaceTextureHelper;
import p000.AbstractC11266d;
import p000.C11327d0;
import p000.C12473e;
import p027b3.InterfaceC2355b3;
import p031b9.AbstractC2875y;
import p031b9.C2817b;
import p080d4.C11653l;
import p085d9.C11783c;
import p088dc.AbstractC11894a;
import p088dc.AbstractC11895b;
import p097ds.InterfaceFutureC12319v;
import p180h0.AbstractC16434o3;
import p218ic.AbstractC18388v;
import p218ic.C18370m;
import p218ic.C18389w;
import p249jc.AbstractC21584j0;
import p292l1.C23186v;
import p294l3.C23254g;
import p328mj.C25609p;
import p335n6.InterfaceC26395l;
import p358o6.C27598f;
import p390p1.C28633k1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28661r1;
import p395p6.AbstractC28880g0;
import p395p6.C28864b;
import p395p6.C28894l;
import p395p6.C28900n;
import p415q6.InterfaceC29991a;
import p420qc.C30207q;
import p457rc.AbstractC31229l;
import p457rc.C31230m;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p512u2.InterfaceC34476v;
import p530up.AbstractC35148d;
import p537ux.C35331f0;
import p550vd.AbstractC35902e;
import p579wc.C37082e1;
import p605x6.C37997b;
import p605x6.C38011p;
import p605x6.C38017v;
import p605x6.InterfaceC38016u;
import p617xj.C38329a;
import p617xj.C38330b;
import p636y3.C39176h;
import p639y6.C39254f;
import p639y6.InterfaceC39249a;
import p639y6.InterfaceC39255g;
import p668z1.AbstractC39957f;
import p668z1.AbstractC39963l;
import p668z1.C39949b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q30.C29938w0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s30.C32101c;
import s40.C32139c0;
import s83.AbstractC32275i;
import so.C32800q;
import stream.video.sfu.models.Error;
import stream.video.sfu.signal.UpdateSubscriptionsRequest;
import stream.video.sfu.signal.UpdateSubscriptionsResponse;
import t23.C33358a2;
import t23.C33368c0;
import t23.C33374d0;
import t23.C33380e0;
import t23.C33381e1;
import t23.C33385f0;
import t23.C33390g0;
import t23.C33395h0;
import t23.C33450s0;
import t23.C33460u0;
import t23.C33476x1;
import t23.EnumC33389g;
import t23.InterfaceC33400i0;
import uz.C35399m;
import uz.C35401o;
import v10.C35526b;
import v23.C35587a;
import vf3.AbstractC35952b;
import w23.AbstractC36764v;
import w23.C36750h;
import w23.C36758p;
import w23.C36759q;
import w23.EnumC36762t;
import w43.C36827a;
import wr0.C37550r;
import x20.C37843k;
import x20.C37848p;
import x20.EnumC37847o;
import x23.EnumC37870f;
import x30.C37917p0;
import z23.AbstractC40032b;
import z23.C40031a;
import z23.C40033c;

/* JADX INFO: renamed from: p33.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C28820m extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f116679E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f116680F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116681w;

    /* JADX INFO: renamed from: x */
    public int f116682x;

    /* JADX INFO: renamed from: y */
    public Object f116683y;

    /* JADX INFO: renamed from: z */
    public Object f116684z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28820m(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f116681w = i13;
        this.f116683y = obj;
        this.f116684z = obj2;
        this.f116679E = obj3;
        this.f116680F = obj4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f116681w) {
            case 0:
                return new C28820m((C22669g0) this.f116683y, (C28822o) this.f116684z, interfaceC30057d, (C28822o) this.f116679E, (UpdateSubscriptionsRequest) this.f116680F);
            case 1:
                C28820m c28820m = new C28820m((C28894l) this.f116684z, (Context) this.f116679E, (InterfaceC28601c1) this.f116680F, interfaceC30057d, 1);
                c28820m.f116683y = obj;
                return c28820m;
            case 2:
                C28820m c28820m2 = new C28820m((AbstractC28880g0) this.f116684z, (Context) this.f116679E, (InterfaceC26395l) this.f116680F, interfaceC30057d, 2);
                c28820m2.f116683y = obj;
                return c28820m2;
            case 3:
                return new C28820m((String) this.f116684z, (C25609p) this.f116679E, (InterfaceC28601c1) this.f116680F, interfaceC30057d, 3);
            case 4:
                return new C28820m((Context) this.f116683y, (String) this.f116684z, (C28864b) this.f116679E, (C27598f) this.f116680F, interfaceC30057d, 4);
            case 5:
                return new C28820m((AbstractC18388v) this.f116683y, (C30207q) this.f116684z, (C31230m) this.f116679E, (Context) this.f116680F, interfaceC30057d, 5);
            case 6:
                return new C28820m((InterfaceC33400i0) this.f116679E, (C33368c0) this.f116680F, interfaceC30057d, 6);
            case 7:
                return new C28820m((String) this.f116679E, (C29938w0) this.f116680F, interfaceC30057d, 7);
            case 8:
                return new C28820m((C35401o) this.f116683y, (AbstractActivityC1340r0) this.f116684z, (String) this.f116679E, (String) this.f116680F, interfaceC30057d, 8);
            case 9:
                return new C28820m((PollingActivity) this.f116684z, (C16845k) this.f116679E, (InterfaceC28601c1) this.f116680F, interfaceC30057d, 9);
            case 10:
                return new C28820m((C37917p0) this.f116683y, (InterfaceC0360e) this.f116684z, (InterfaceC0358c) this.f116679E, (InterfaceC28601c1) this.f116680F, interfaceC30057d, 10);
            case 11:
                C28820m c28820m3 = new C28820m((InterfaceC28601c1) this.f116684z, (C23254g) this.f116679E, (InterfaceC2355b3) this.f116680F, interfaceC30057d, 11);
                c28820m3.f116683y = obj;
                return c28820m3;
            case 12:
                C28820m c28820m4 = new C28820m((Context) this.f116684z, (C0071f) this.f116679E, (C38011p) this.f116680F, interfaceC30057d, 12);
                c28820m4.f116683y = obj;
                return c28820m4;
            case 13:
                return new C28820m((C28894l) this.f116683y, (Context) this.f116684z, (Throwable) this.f116679E, (InterfaceC38016u) this.f116680F, interfaceC30057d, 13);
            case 14:
                return new C28820m((C38017v) this.f116683y, (C35331f0) this.f116684z, (InterfaceC2994c0) this.f116679E, (InterfaceC4351m) this.f116680F, interfaceC30057d, 14);
            default:
                return new C28820m((View) this.f116683y, (InterfaceC14544a) this.f116684z, (C23465k) this.f116679E, (List) this.f116680F, interfaceC30057d, 15);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f116681w) {
            case 0:
                return ((C28820m) create((C36827a) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C28820m) create((InterfaceC28661r1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C28820m) create((InterfaceC11936u) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C28820m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                C28820m c28820m = (C28820m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c28820m.invokeSuspend(c23454a0);
                return c23454a0;
            case 5:
                return ((C28820m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C28820m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C28820m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C28820m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 9:
                return ((C28820m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C28820m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C28820m) create((InterfaceC34476v) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 12:
                return ((C28820m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 13:
                return ((C28820m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 14:
                return ((C28820m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C28820m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0280  */
    /* JADX WARN: Code duplicated, block: B:262:0x062c A[Catch: Exception -> 0x0641, TRY_LEAVE, TryCatch #9 {Exception -> 0x0641, blocks: (B:260:0x0620, B:262:0x062c), top: B:495:0x0620 }] */
    /* JADX WARN: Code duplicated, block: B:265:0x063f  */
    /* JADX WARN: Code duplicated, block: B:270:0x0651  */
    /* JADX WARN: Code duplicated, block: B:272:0x0661 A[PHI: r6 r36
      0x0661: PHI (r6v18 ??) = (r6v19 ??), (r6v39 ??) binds: [B:271:0x0660, B:261:0x062a] A[DONT_GENERATE, DONT_INLINE]
      0x0661: PHI (r36v8 boolean) = (r36v9 boolean), (r36v10 boolean) binds: [B:271:0x0660, B:261:0x062a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:275:0x066f A[Catch: Exception -> 0x067f, TRY_LEAVE, TryCatch #1 {Exception -> 0x067f, blocks: (B:273:0x0665, B:275:0x066f), top: B:481:0x0665 }] */
    /* JADX WARN: Code duplicated, block: B:281:0x068e  */
    /* JADX WARN: Code duplicated, block: B:284:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:287:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:290:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:295:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:298:0x0703 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:299:0x0705  */
    /* JADX WARN: Code duplicated, block: B:300:0x070c  */
    /* JADX WARN: Code duplicated, block: B:302:0x0713  */
    /* JADX WARN: Code duplicated, block: B:305:0x071e  */
    /* JADX WARN: Code duplicated, block: B:308:0x0725  */
    /* JADX WARN: Code duplicated, block: B:309:0x0730  */
    /* JADX WARN: Code duplicated, block: B:311:0x0740  */
    /* JADX WARN: Code duplicated, block: B:314:0x074b  */
    /* JADX WARN: Code duplicated, block: B:316:0x074f  */
    /* JADX WARN: Code duplicated, block: B:319:0x0764  */
    /* JADX WARN: Code duplicated, block: B:323:0x077f  */
    /* JADX WARN: Code duplicated, block: B:325:0x0792  */
    /* JADX WARN: Code duplicated, block: B:326:0x079d  */
    /* JADX WARN: Code duplicated, block: B:329:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:420:0x0983  */
    /* JADX WARN: Code duplicated, block: B:421:0x0986  */
    /* JADX WARN: Code duplicated, block: B:524:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v80, types: [d33.h1] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v121 */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v60, types: [ec3.h2] */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r2v34, types: [b23.j] */
    /* JADX WARN: Type inference failed for: r3v34, types: [b23.j] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [bc3.d0, d9.c, java.lang.Object, java.lang.Throwable, q83.d, q83.j] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objUpdateSubscriptions;
        InterfaceC28661r1 interfaceC28661r1;
        Object obj2;
        InterfaceC39255g interfaceC39255gMo63262h;
        Object objM125028c;
        InterfaceC28661r1 interfaceC28661r2;
        AbstractC39957f abstractC39957fM128171k;
        C39949b c39949b;
        C39949b c39949bMo128121C;
        long jM114193a;
        InterfaceC28601c1 interfaceC28601c1;
        Rect rect;
        Object objM75332b;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM60630a;
        boolean z4;
        C33368c0 c33368c0;
        String str;
        Object objM105811b;
        InterfaceC2339e interfaceC2339e;
        EnumC2341g enumC2341g;
        InterfaceC2339e interfaceC2339e2;
        EnumC2341g enumC2341g2;
        C11602h1 c11602h1;
        C2996c2 c2996c2;
        C33476x1 c33476x1M105817h;
        Camera2Capturer camera2Capturer;
        SurfaceTextureHelper surfaceTextureHelper;
        ?? r10;
        C33358a2 c33358a2;
        C3938e c3938e;
        C2345k c2345kM105789c;
        InterfaceC2339e interfaceC2339e3;
        String str2;
        EnumC2341g enumC2341g3;
        C11783c c11783c;
        C2817b c2817b;
        C2345k c2345kM8013p;
        InterfaceC2339e interfaceC2339e4;
        EnumC2341g enumC2341g4;
        Object obj3;
        ExecutorService executorService;
        AudioManager audioManager;
        C2345k c2345kM105789c2;
        InterfaceC2339e interfaceC2339e5;
        EnumC2341g enumC2341g5;
        InterfaceC2994c0 interfaceC2994c0M11991a;
        ?? r14;
        ?? r15;
        ?? r16;
        C33460u0 c33460u0;
        C11602h1 c11602h2;
        C23465k c23465k;
        C13045h2 c13045h2;
        C12662v0 c12662v0;
        C13045h2 c13045h3;
        PeerConnection.IceConnectionState iceConnectionState;
        C13045h2 c13045h4;
        C12645n c12645n;
        C13045h2 c13045h5;
        PeerConnection.IceConnectionState iceConnectionState2;
        C23372m c23372m;
        Object objM102859c;
        String key;
        C29938w0 c29938w0;
        C35526b c35526b;
        C35526b c35526b2;
        C35526b c35526b3;
        C37997b c37997b;
        BroadcastReceiver broadcastReceiver;
        Object objInvoke;
        long jM121746a;
        Looper mainLooper;
        Object objM8705K;
        ?? r17 = -1;
        int i13 = 6;
        int i14 = 2;
        int i15 = 1;
        switch (this.f116681w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i16 = this.f116682x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C23369j c23369j = ((C28822o) this.f116679E).f116690a;
                    UpdateSubscriptionsRequest updateSubscriptionsRequest = (UpdateSubscriptionsRequest) this.f116680F;
                    this.f116682x = 1;
                    objUpdateSubscriptions = c23369j.updateSubscriptions(updateSubscriptionsRequest, this);
                    if (objUpdateSubscriptions == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objUpdateSubscriptions = obj;
                }
                ((C22669g0) this.f116683y).f89336w = objUpdateSubscriptions;
                Error error = ((UpdateSubscriptionsResponse) objUpdateSubscriptions).getError();
                if (error == null || !error.getShould_retry() || C28822o.m87679a(error)) {
                    return objUpdateSubscriptions;
                }
                throw new SfuRetryableException(error.getMessage());
            case 1:
                Context context = (Context) this.f116679E;
                C28894l c28894l = (C28894l) this.f116684z;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i17 = this.f116682x;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC28661r1 = (InterfaceC28661r1) this.f116683y;
                    if (c28894l.f116960j.getValue() != null || (interfaceC39255gMo63262h = c28894l.f116955e.getStateDefinition()) == null) {
                        obj2 = null;
                    } else {
                        InterfaceC39249a interfaceC39249a = c28894l.f116957g;
                        String str3 = c28894l.f116951a;
                        this.f116683y = interfaceC28661r1;
                        this.f116682x = 1;
                        objM125028c = ((C39254f) interfaceC39249a).m125028c(context, interfaceC39255gMo63262h, str3, this);
                        if (objM125028c == enumC31071a2) {
                            return enumC31071a2;
                        }
                        interfaceC28661r2 = interfaceC28661r1;
                    }
                    InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) this.f116680F;
                    abstractC39957fM128171k = AbstractC39963l.m128171k();
                    if (abstractC39957fM128171k instanceof C39949b) {
                        c39949b = (C39949b) abstractC39957fM128171k;
                    } else {
                        c39949b = null;
                    }
                    if (c39949b != null || (c39949bMo128121C = c39949b.mo128121C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC39957f abstractC39957fM128153j = c39949bMo128121C.m128153j();
                        try {
                            C28864b c28864b = c28894l.f116956f;
                            C28633k1 c28633k1 = c28894l.f116961k;
                            if (AbstractC35902e.m113941J(c28864b)) {
                                Object systemService = context.getSystemService("appwidget");
                                AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.appwidget.AppWidgetManager");
                                AppWidgetManager appWidgetManager = (AppWidgetManager) systemService;
                                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                                AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(c28864b.f116802a);
                                if (appWidgetInfo == null) {
                                    jM114193a = 0;
                                } else {
                                    int iMin = Math.min(appWidgetInfo.minWidth, (appWidgetInfo.resizeMode & 1) != 0 ? appWidgetInfo.minResizeWidth : Integer.MAX_VALUE);
                                    int iMin2 = Math.min(appWidgetInfo.minHeight, (appWidgetInfo.resizeMode & 2) != 0 ? appWidgetInfo.minResizeHeight : Integer.MAX_VALUE);
                                    float f13 = displayMetrics.density;
                                    jM114193a = AbstractC35952b.m114193a(iMin / f13, iMin2 / f13);
                                }
                                interfaceC28601c3.setValue(new C39176h(jM114193a));
                                if (((Bundle) c28633k1.getValue()) == null) {
                                    c28633k1.setValue(appWidgetManager.getAppWidgetOptions(c28864b.f116802a));
                                }
                            }
                            if (obj2 != null) {
                                c28894l.f116960j.setValue(obj2);
                            }
                            interfaceC28661r1.setValue(Boolean.TRUE);
                            AbstractC39957f.m128151q(abstractC39957fM128153j);
                            c39949bMo128121C.mo128127w().mo128155d();
                            c39949bMo128121C.mo128122c();
                            return C23454a0.f92919a;
                        } catch (Throwable th3) {
                            AbstractC39957f.m128151q(abstractC39957fM128153j);
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        c39949bMo128121C.mo128122c();
                        throw th4;
                    }
                }
                if (i17 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC28661r2 = (InterfaceC28661r1) this.f116683y;
                AbstractC34132o.m107864I(obj);
                objM125028c = obj;
                interfaceC28661r1 = interfaceC28661r2;
                obj2 = objM125028c;
                InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) this.f116680F;
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                if (abstractC39957fM128171k instanceof C39949b) {
                    c39949b = (C39949b) abstractC39957fM128171k;
                } else {
                    c39949b = null;
                }
                if (c39949b != null) {
                }
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i18 = this.f116682x;
                if (i18 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C28900n c28900n = new C28900n(new AtomicReference(null), (InterfaceC11936u) this.f116683y);
                    C26285a c26285a = new C26285a((AbstractC28880g0) this.f116684z, (Context) this.f116679E, (InterfaceC26395l) this.f116680F, (InterfaceC30057d) null, 9);
                    this.f116682x = 1;
                    if (AbstractC3006f0.m8705K(c28900n, c26285a, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i19 = this.f116682x;
                if (i19 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC28601c1 = (InterfaceC28601c1) this.f116680F;
                    String str4 = (String) this.f116684z;
                    if (str4 != null) {
                        C25609p c25609p = (C25609p) this.f116679E;
                        this.f116683y = interfaceC28601c1;
                        this.f116682x = 1;
                        objM75332b = c25609p.m75332b(str4, this);
                        if (objM75332b == enumC31071a4) {
                            return enumC31071a4;
                        }
                        interfaceC28601c2 = interfaceC28601c1;
                    } else {
                        rect = null;
                    }
                    interfaceC28601c1.setValue(rect);
                    return C23454a0.f92919a;
                }
                if (i19 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC28601c2 = (InterfaceC28601c1) this.f116683y;
                AbstractC34132o.m107864I(obj);
                objM75332b = obj;
                rect = (Rect) AbstractC25265s.m74102I0(0, (List) objM75332b);
                interfaceC28601c1 = interfaceC28601c2;
                interfaceC28601c1.setValue(rect);
                return C23454a0.f92919a;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i24 = this.f116682x;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                String str5 = (String) this.f116684z;
                this.f116682x = 1;
                Class<?> cls = Class.forName(str5);
                if (!InterfaceC29991a.class.isAssignableFrom(cls)) {
                    throw new IllegalStateException("Provided class must implement ActionCallback.");
                }
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                AbstractC22676k.m65748h(objNewInstance, "null cannot be cast to non-null type androidx.glance.appwidget.action.ActionCallback");
                AbstractC26725a.m79511o(objNewInstance);
                throw null;
            case 5:
                String str6 = ((C30207q) this.f116684z).f123636c;
                AbstractC18388v abstractC18388v = (AbstractC18388v) this.f116683y;
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i25 = this.f116682x;
                if (i25 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceFutureC12319v foregroundInfoAsync = abstractC18388v.getForegroundInfoAsync();
                    AbstractC22676k.m65749i(foregroundInfoAsync, "getForegroundInfoAsync(...)");
                    this.f116682x = 1;
                    objM60630a = AbstractC21584j0.m60630a(foregroundInfoAsync, abstractC18388v, this);
                    if (objM60630a != enumC31071a6) {
                    }
                    return enumC31071a6;
                }
                if (i25 != 1) {
                    if (i25 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                objM60630a = obj;
                C18370m c18370m = (C18370m) objM60630a;
                if (c18370m == null) {
                    throw new IllegalStateException(AbstractC11895b.m31996o("Worker was marked important (", str6, ") but did not provide ForegroundInfo"));
                }
                C18389w.m52886d().m52888a(AbstractC31229l.f128608a, "Updating notification for " + str6);
                C31230m c31230m = (C31230m) this.f116679E;
                C11653l c11653lM92129t = AbstractC30060g.m92129t(c31230m.f128609a.f133915a, "setForegroundAsync", new C27198e(c31230m, abstractC18388v.getId(), c18370m, (Context) this.f116680F, 10));
                this.f116682x = 2;
                Object objM108238x = AbstractC34235f.m108238x(c11653lM92129t, this);
                if (objM108238x != enumC31071a6) {
                    return objM108238x;
                }
                return enumC31071a6;
            case 6:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                int i26 = this.f116682x;
                if (i26 != 0) {
                    try {
                        if (i26 == 1) {
                            c33368c0 = (C33368c0) this.f116684z;
                            String str7 = (String) this.f116683y;
                            AbstractC34132o.m107864I(obj);
                            str = str7;
                            z4 = false;
                            objM105811b = obj;
                            try {
                                c33460u0 = (C33460u0) objM105811b;
                                c11602h2 = (C11602h1) c33368c0.f139268C.getValue();
                                r14 = str;
                                if (c11602h2 != null) {
                                    this.f116683y = str;
                                    this.f116684z = null;
                                    this.f116682x = 2;
                                    if (C11602h1.m31014B(c11602h2, c33460u0, null, null, this, 6) == enumC31071a7) {
                                        return enumC31071a7;
                                    }
                                    r16 = str;
                                    r14 = r16;
                                    r15 = (C11602h1) ((C33368c0) this.f116680F).f139268C.getValue();
                                    if (r15 != 0) {
                                        this.f116683y = null;
                                        this.f116684z = null;
                                        this.f116682x = 3;
                                        if (r15.m31026D(r14) == enumC31071a7) {
                                            return enumC31071a7;
                                        }
                                    }
                                } else {
                                    r15 = (C11602h1) ((C33368c0) this.f116680F).f139268C.getValue();
                                    if (r15 != 0) {
                                        this.f116683y = null;
                                        this.f116684z = null;
                                        this.f116682x = 3;
                                        if (r15.m31026D(r14) == enumC31071a7) {
                                            return enumC31071a7;
                                        }
                                    }
                                }
                            } catch (Exception e5) {
                                e = e5;
                                r17 = str;
                                C2343i c2343i = C2343i.f9269a;
                                interfaceC2339e = C2343i.f9272d;
                                enumC2341g = EnumC2341g.ERROR;
                                r16 = r17;
                                if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                                    C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e.getMessage()), e);
                                    r16 = r17;
                                }
                            }
                        } else if (i26 == 2) {
                            String str8 = (String) this.f116683y;
                            AbstractC34132o.m107864I(obj);
                            z4 = false;
                            r16 = str8;
                            r14 = r16;
                            try {
                                r15 = (C11602h1) ((C33368c0) this.f116680F).f139268C.getValue();
                                if (r15 != 0) {
                                    this.f116683y = null;
                                    this.f116684z = null;
                                    this.f116682x = 3;
                                    if (r15.m31026D(r14) == enumC31071a7) {
                                        return enumC31071a7;
                                    }
                                }
                            } catch (Exception e13) {
                                e = e13;
                                C2343i c2343i2 = C2343i.f9269a;
                                interfaceC2339e2 = C2343i.f9272d;
                                enumC2341g2 = EnumC2341g.ERROR;
                                if (interfaceC2339e2.isLoggable(enumC2341g2, "SafeCall")) {
                                    C2343i.f9271c.log(enumC2341g2, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e.getMessage()), e);
                                }
                            }
                        } else {
                            if (i26 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            try {
                                AbstractC34132o.m107864I(obj);
                                z4 = false;
                            } catch (Exception e14) {
                                e = e14;
                                z4 = false;
                                C2343i c2343i3 = C2343i.f9269a;
                                interfaceC2339e2 = C2343i.f9272d;
                                enumC2341g2 = EnumC2341g.ERROR;
                                if (interfaceC2339e2.isLoggable(enumC2341g2, "SafeCall")) {
                                    C2343i.f9271c.log(enumC2341g2, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e.getMessage()), e);
                                }
                            }
                        }
                    } catch (Exception e15) {
                        e = e15;
                        z4 = false;
                        C2343i c2343i4 = C2343i.f9269a;
                        interfaceC2339e = C2343i.f9272d;
                        enumC2341g = EnumC2341g.ERROR;
                        r16 = r17;
                        if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                            C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e.getMessage()), e);
                            r16 = r17;
                        }
                        r14 = r16;
                        r15 = (C11602h1) ((C33368c0) this.f116680F).f139268C.getValue();
                        if (r15 != 0) {
                            this.f116683y = null;
                            this.f116684z = null;
                            this.f116682x = 3;
                            if (r15.m31026D(r14) == enumC31071a7) {
                                return enumC31071a7;
                            }
                        }
                        C33368c0 c33368c1 = (C33368c0) this.f116680F;
                        C33450s0 c33450s0 = c33368c1.f139302p;
                        c33450s0.f139619H.clear();
                        c33450s0.f139689z0.m105843c();
                        c33450s0.m105859a();
                        c11602h1 = (C11602h1) c33368c1.f139268C.getValue();
                        if (c11602h1 != null) {
                            c11602h1.f37432L.m13289a(new C11624r(c11602h1, 1));
                        }
                        AbstractC3006f0.m8732z(AbstractC35148d.m111177h(AbstractC4257c.m13288a(), null, 2), null, null, new C32139c0(c33368c1, null, 6), 3);
                        AbstractC3006f0.m8714h(c33368c1.f139300n, null);
                        c2996c2 = c33368c1.f139298l;
                        if (c2996c2 != null) {
                            c2996c2.cancel((CancellationException) null);
                        }
                        c33476x1M105817h = c33368c1.m105817h();
                        synchronized (c33476x1M105817h.f139768p) {
                            c33476x1M105817h.f139769q = true;
                            c33476x1M105817h.m105872a();
                            C33381e1 c33381e1 = c33476x1M105817h.f139757e;
                            c33381e1.m105840k();
                            camera2Capturer = c33381e1.f139349f;
                            if (camera2Capturer != null) {
                                camera2Capturer.dispose();
                            }
                            surfaceTextureHelper = c33381e1.f139346c;
                            if (surfaceTextureHelper == null) {
                                r10 = 0;
                            } else {
                                if (surfaceTextureHelper == null) {
                                    AbstractC22676k.m65757q("surfaceTextureHelper");
                                    throw null;
                                }
                                surfaceTextureHelper.dispose();
                                r10 = 0;
                            }
                            c33381e1.f139364u = z4;
                            c33358a2 = c33476x1M105817h.f139758f;
                            c3938e = c33358a2.f139193d;
                            if (c3938e != null) {
                                interfaceC2994c0M11991a = c3938e.m11991a();
                                if (interfaceC2994c0M11991a != null) {
                                    AbstractC3006f0.m8732z(interfaceC2994c0M11991a, r10, r10, new C3937d(c3938e, r10, 1), 3);
                                }
                            } else {
                                c2345kM105789c = c33358a2.m105789c();
                                interfaceC2339e3 = c2345kM105789c.f9275c;
                                str2 = c2345kM105789c.f9273a;
                                enumC2341g3 = EnumC2341g.ERROR;
                                if (interfaceC2339e3.isLoggable(enumC2341g3, str2)) {
                                    c2345kM105789c.f9274b.log(enumC2341g3, str2, "Audio handler not initialized. Ensure calling setup(), before using the handler.", r10);
                                }
                            }
                            c11783c = c33358a2.f139196g;
                            if (c11783c != null) {
                                audioManager = c33358a2.f139195f;
                                if (audioManager != null) {
                                    audioManager.unregisterAudioDeviceCallback(c11783c);
                                }
                                c33358a2.f139196g = r10;
                                c2345kM105789c2 = c33358a2.m105789c();
                                interfaceC2339e5 = c2345kM105789c2.f9275c;
                                enumC2341g5 = EnumC2341g.INFO;
                                if (interfaceC2339e5.isLoggable(enumC2341g5, c2345kM105789c2.f9273a)) {
                                    c2345kM105789c2.f9274b.log(enumC2341g5, c2345kM105789c2.f9273a, "[cleanupUsbDeviceDetection] Unregistered AudioDeviceCallback", r10);
                                }
                            }
                            c33358a2.f139194e.set(false);
                            c33368c1.f139268C.m36570j(r10);
                            c2817b = c33368c1.f139294h;
                            if (!c2817b.f11023x) {
                                c2817b.f11023x = true;
                                c2345kM8013p = c2817b.m8013p();
                                interfaceC2339e4 = c2345kM8013p.f9275c;
                                enumC2341g4 = EnumC2341g.DEBUG;
                                if (interfaceC2339e4.isLoggable(enumC2341g4, c2345kM8013p.f9273a)) {
                                    obj3 = null;
                                    c2345kM8013p.f9274b.log(enumC2341g4, c2345kM8013p.f9273a, "Cleaning up ScopeProvider and shutting down executor", null);
                                } else {
                                    obj3 = null;
                                }
                                executorService = (ExecutorService) c2817b.f11021E;
                                if (executorService != null) {
                                    executorService.shutdown();
                                }
                                c2817b.f11021E = obj3;
                            }
                            return C23454a0.f92919a;
                        }
                    }
                } else {
                    AbstractC34132o.m107864I(obj);
                    String strM8300m = AbstractC2875y.m8300m("[reason=", AbstractC22671h0.f89337a.getOrCreateKotlinClass(((InterfaceC33400i0) this.f116679E).getClass()).getSimpleName(), ", message=", ((InterfaceC33400i0) this.f116679E).getMessage(), "]");
                    C33368c0 c33368c2 = (C33368c0) this.f116680F;
                    C35587a c35587a = c33368c2.f139276K;
                    C13045h2 session = c33368c2.f139268C;
                    InterfaceC33400i0 interfaceC33400i0 = (InterfaceC33400i0) this.f116679E;
                    C36758p c36758p = c35587a.f151341d;
                    AbstractC22676k.m65750j(session, "session");
                    EnumC37870f enumC37870f = ((C36750h) ((C13081r1) ((C32800q) c35587a.f151339b.f9984E).f136505x).f45200w.getValue()).f157284d;
                    EnumC37870f enumC37870f2 = EnumC37870f.f162184x;
                    if (enumC37870f == enumC37870f2 || ((C13081r1) ((C0332w0) c35587a.f151340c.f9985F).f1164E).f45200w.getValue() == enumC37870f2 || ((C36759q) c36758p.f157314g.f157322b.f45200w.getValue()).f157319d == enumC37870f2 || ((C36759q) c36758p.f157314g.f157322b.f45200w.getValue()).f157320e == enumC37870f2) {
                        if (interfaceC33400i0 instanceof C33374d0) {
                            C33374d0 c33374d0 = (C33374d0) interfaceC33400i0;
                            c23465k = c33374d0.f139328a == EnumC33389g.LEAVE_TIMEOUT_AFTER_DISCONNECT ? new C23465k(EnumC2680a.f10550y, c33374d0.f139329b) : new C23465k(EnumC2680a.f10549x, c33374d0.f139329b);
                        } else if (interfaceC33400i0 instanceof C33395h0) {
                            c23465k = new C23465k(EnumC2680a.f10548w, ((C33395h0) interfaceC33400i0).f139458b);
                        } else if (interfaceC33400i0 instanceof C33385f0) {
                            c23465k = new C23465k(EnumC2680a.f10551z, ((C33385f0) interfaceC33400i0).f139376b);
                        } else if (interfaceC33400i0 instanceof C33390g0) {
                            c23465k = new C23465k(EnumC2680a.f10545E, ((C33390g0) interfaceC33400i0).f139397b);
                        } else {
                            if (!(interfaceC33400i0 instanceof C33380e0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c23465k = new C23465k(EnumC2680a.f10546F, ((C33380e0) interfaceC33400i0).f139343a);
                        }
                        C11602h1 c11602h3 = (C11602h1) session.getValue();
                        EnumC36762t enumC36762tM117873a = (c11602h3 == null || (c13045h4 = c11602h3.f37421A) == null || (c12645n = (C12645n) c13045h4.getValue()) == null || (c13045h5 = c12645n.f43279s) == null || (iceConnectionState2 = (PeerConnection.IceConnectionState) c13045h5.getValue()) == null) ? EnumC36762t.NOT_CONNECTED : AbstractC36764v.m117873a(iceConnectionState2);
                        C11602h1 c11602h4 = (C11602h1) session.getValue();
                        EnumC36762t enumC36762tM117873a2 = (c11602h4 == null || (c13045h2 = c11602h4.f37464z) == null || (c12662v0 = (C12662v0) c13045h2.getValue()) == null || (c13045h3 = c12662v0.f43279s) == null || (iceConnectionState = (PeerConnection.IceConnectionState) c13045h3.getValue()) == null) ? EnumC36762t.NOT_CONNECTED : AbstractC36764v.m117873a(iceConnectionState);
                        C40033c c40033c = c35587a.f151338a;
                        String failCode = ((EnumC2680a) c23465k.f92937w).name();
                        String failMessage = (String) c23465k.f92938x;
                        c40033c.getClass();
                        AbstractC22676k.m65750j(failCode, "failCode");
                        AbstractC22676k.m65750j(failMessage, "failMessage");
                        ArrayList<C2689j> arrayList = new ArrayList();
                        ConcurrentHashMap concurrentHashMap = c40033c.f172742d;
                        z4 = false;
                        Set<Map.Entry> setEntrySet = concurrentHashMap.entrySet();
                        AbstractC22676k.m65749i(setEntrySet, "<get-entries>(...)");
                        for (Map.Entry entry : setEntrySet) {
                            AbstractC22676k.m65747g(entry);
                            String str9 = (String) entry.getKey();
                            AbstractC2687h abstractC2687h = (AbstractC2687h) entry.getValue();
                            if ((abstractC2687h instanceof C2689j) && concurrentHashMap.remove(str9, abstractC2687h)) {
                                arrayList.add(abstractC2687h);
                            }
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                        for (C2689j c2689j : arrayList) {
                            EnumC2688i enumC2688i = c2689j.f10585j;
                            int i27 = enumC2688i == null ? -1 : AbstractC40032b.f172738b[enumC2688i.ordinal()];
                            long j7 = jCurrentTimeMillis;
                            arrayList2.add(C40031a.m128361a(c40033c.f172741c, c2689j.f10576a, c2689j.f10577b, c2689j.f10579d, EnumC2686g.COMPLETED, c2689j.f10578c, c2689j.f10582g, c2689j.f10581f, Long.valueOf(j7 - c2689j.f10580e), EnumC2682c.FAILURE, 0, failMessage, failCode, c2689j.f10584i, c2689j.f10583h, c2689j.f10585j, Boolean.valueOf(c2689j.f10586k), i27 != i15 ? i27 != i14 ? null : enumC36762tM117873a2 : enumC36762tM117873a, null, null, 7995392));
                            enumC36762tM117873a2 = enumC36762tM117873a2;
                            enumC36762tM117873a = enumC36762tM117873a;
                            jCurrentTimeMillis = j7;
                            i14 = 2;
                            i15 = 1;
                        }
                        C0352d c0352d = c40033c.f172739a;
                        if (!arrayList2.isEmpty()) {
                            AbstractC3006f0.m8732z((C17171d) c0352d.f1238y, null, null, new C12473e(c0352d, arrayList2, (InterfaceC30057d) null, 5), 3);
                        }
                    } else {
                        z4 = false;
                    }
                    c33368c0 = (C33368c0) this.f116680F;
                    try {
                        C11602h1 c11602h5 = (C11602h1) c33368c0.f139268C.getValue();
                        if (c11602h5 != null && (c23372m = c11602h5.f37452n) != null) {
                            c23372m.m67653b(strM8300m, "leave-call");
                        }
                        this.f116683y = strM8300m;
                        this.f116684z = c33368c0;
                        this.f116682x = 1;
                        objM105811b = c33368c0.m105811b(this);
                        if (objM105811b == enumC31071a7) {
                            return enumC31071a7;
                        }
                        str = strM8300m;
                        c33460u0 = (C33460u0) objM105811b;
                        c11602h2 = (C11602h1) c33368c0.f139268C.getValue();
                        r14 = str;
                        if (c11602h2 != null) {
                            this.f116683y = str;
                            this.f116684z = null;
                            this.f116682x = 2;
                            if (C11602h1.m31014B(c11602h2, c33460u0, null, null, this, 6) == enumC31071a7) {
                                return enumC31071a7;
                            }
                            r16 = str;
                            r14 = r16;
                            r15 = (C11602h1) ((C33368c0) this.f116680F).f139268C.getValue();
                            if (r15 != 0) {
                                this.f116683y = null;
                                this.f116684z = null;
                                this.f116682x = 3;
                                if (r15.m31026D(r14) == enumC31071a7) {
                                    return enumC31071a7;
                                }
                            }
                        } else {
                            r15 = (C11602h1) ((C33368c0) this.f116680F).f139268C.getValue();
                            if (r15 != 0) {
                                this.f116683y = null;
                                this.f116684z = null;
                                this.f116682x = 3;
                                if (r15.m31026D(r14) == enumC31071a7) {
                                    return enumC31071a7;
                                }
                            }
                        }
                    } catch (Exception e16) {
                        e = e16;
                        r17 = strM8300m;
                        C2343i c2343i5 = C2343i.f9269a;
                        interfaceC2339e = C2343i.f9272d;
                        enumC2341g = EnumC2341g.ERROR;
                        r16 = r17;
                        if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                            C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e.getMessage()), e);
                            r16 = r17;
                        }
                        r14 = r16;
                        r15 = (C11602h1) ((C33368c0) this.f116680F).f139268C.getValue();
                        if (r15 != 0) {
                            this.f116683y = null;
                            this.f116684z = null;
                            this.f116682x = 3;
                            if (r15.m31026D(r14) == enumC31071a7) {
                                return enumC31071a7;
                            }
                        }
                        C33368c0 c33368c3 = (C33368c0) this.f116680F;
                        C33450s0 c33450s1 = c33368c3.f139302p;
                        c33450s1.f139619H.clear();
                        c33450s1.f139689z0.m105843c();
                        c33450s1.m105859a();
                        c11602h1 = (C11602h1) c33368c3.f139268C.getValue();
                        if (c11602h1 != null) {
                            c11602h1.f37432L.m13289a(new C11624r(c11602h1, 1));
                        }
                        AbstractC3006f0.m8732z(AbstractC35148d.m111177h(AbstractC4257c.m13288a(), null, 2), null, null, new C32139c0(c33368c3, null, 6), 3);
                        AbstractC3006f0.m8714h(c33368c3.f139300n, null);
                        c2996c2 = c33368c3.f139298l;
                        if (c2996c2 != null) {
                            c2996c2.cancel((CancellationException) null);
                        }
                        c33476x1M105817h = c33368c3.m105817h();
                        synchronized (c33476x1M105817h.f139768p) {
                            c33476x1M105817h.f139769q = true;
                            c33476x1M105817h.m105872a();
                            C33381e1 c33381e2 = c33476x1M105817h.f139757e;
                            c33381e2.m105840k();
                            camera2Capturer = c33381e2.f139349f;
                            if (camera2Capturer != null) {
                                camera2Capturer.dispose();
                            }
                            surfaceTextureHelper = c33381e2.f139346c;
                            if (surfaceTextureHelper == null) {
                                r10 = 0;
                            } else {
                                if (surfaceTextureHelper == null) {
                                    AbstractC22676k.m65757q("surfaceTextureHelper");
                                    throw null;
                                }
                                surfaceTextureHelper.dispose();
                                r10 = 0;
                            }
                            c33381e2.f139364u = z4;
                            c33358a2 = c33476x1M105817h.f139758f;
                            c3938e = c33358a2.f139193d;
                            if (c3938e != null) {
                                interfaceC2994c0M11991a = c3938e.m11991a();
                                if (interfaceC2994c0M11991a != null) {
                                    AbstractC3006f0.m8732z(interfaceC2994c0M11991a, r10, r10, new C3937d(c3938e, r10, 1), 3);
                                }
                            } else {
                                c2345kM105789c = c33358a2.m105789c();
                                interfaceC2339e3 = c2345kM105789c.f9275c;
                                str2 = c2345kM105789c.f9273a;
                                enumC2341g3 = EnumC2341g.ERROR;
                                if (interfaceC2339e3.isLoggable(enumC2341g3, str2)) {
                                    c2345kM105789c.f9274b.log(enumC2341g3, str2, "Audio handler not initialized. Ensure calling setup(), before using the handler.", r10);
                                }
                            }
                            c11783c = c33358a2.f139196g;
                            if (c11783c != null) {
                                audioManager = c33358a2.f139195f;
                                if (audioManager != null) {
                                    audioManager.unregisterAudioDeviceCallback(c11783c);
                                }
                                c33358a2.f139196g = r10;
                                c2345kM105789c2 = c33358a2.m105789c();
                                interfaceC2339e5 = c2345kM105789c2.f9275c;
                                enumC2341g5 = EnumC2341g.INFO;
                                if (interfaceC2339e5.isLoggable(enumC2341g5, c2345kM105789c2.f9273a)) {
                                    c2345kM105789c2.f9274b.log(enumC2341g5, c2345kM105789c2.f9273a, "[cleanupUsbDeviceDetection] Unregistered AudioDeviceCallback", r10);
                                }
                            }
                            c33358a2.f139194e.set(false);
                            c33368c3.f139268C.m36570j(r10);
                            c2817b = c33368c3.f139294h;
                            if (!c2817b.f11023x) {
                                c2817b.f11023x = true;
                                c2345kM8013p = c2817b.m8013p();
                                interfaceC2339e4 = c2345kM8013p.f9275c;
                                enumC2341g4 = EnumC2341g.DEBUG;
                                if (interfaceC2339e4.isLoggable(enumC2341g4, c2345kM8013p.f9273a)) {
                                    obj3 = null;
                                    c2345kM8013p.f9274b.log(enumC2341g4, c2345kM8013p.f9273a, "Cleaning up ScopeProvider and shutting down executor", null);
                                } else {
                                    obj3 = null;
                                }
                                executorService = (ExecutorService) c2817b.f11021E;
                                if (executorService != null) {
                                    executorService.shutdown();
                                }
                                c2817b.f11021E = obj3;
                            }
                            return C23454a0.f92919a;
                        }
                    }
                }
                C33368c0 c33368c4 = (C33368c0) this.f116680F;
                C33450s0 c33450s2 = c33368c4.f139302p;
                c33450s2.f139619H.clear();
                c33450s2.f139689z0.m105843c();
                c33450s2.m105859a();
                c11602h1 = (C11602h1) c33368c4.f139268C.getValue();
                if (c11602h1 != null) {
                    c11602h1.f37432L.m13289a(new C11624r(c11602h1, 1));
                }
                AbstractC3006f0.m8732z(AbstractC35148d.m111177h(AbstractC4257c.m13288a(), null, 2), null, null, new C32139c0(c33368c4, null, 6), 3);
                AbstractC3006f0.m8714h(c33368c4.f139300n, null);
                c2996c2 = c33368c4.f139298l;
                if (c2996c2 != null) {
                    c2996c2.cancel((CancellationException) null);
                }
                c33476x1M105817h = c33368c4.m105817h();
                synchronized (c33476x1M105817h.f139768p) {
                    c33476x1M105817h.f139769q = true;
                    c33476x1M105817h.m105872a();
                }
                C33381e1 c33381e3 = c33476x1M105817h.f139757e;
                c33381e3.m105840k();
                camera2Capturer = c33381e3.f139349f;
                if (camera2Capturer != null) {
                    camera2Capturer.dispose();
                }
                surfaceTextureHelper = c33381e3.f139346c;
                if (surfaceTextureHelper == null) {
                    r10 = 0;
                } else {
                    if (surfaceTextureHelper == null) {
                        AbstractC22676k.m65757q("surfaceTextureHelper");
                        throw null;
                    }
                    surfaceTextureHelper.dispose();
                    r10 = 0;
                }
                c33381e3.f139364u = z4;
                c33358a2 = c33476x1M105817h.f139758f;
                c3938e = c33358a2.f139193d;
                if (c3938e != null) {
                    interfaceC2994c0M11991a = c3938e.m11991a();
                    if (interfaceC2994c0M11991a != null) {
                        AbstractC3006f0.m8732z(interfaceC2994c0M11991a, r10, r10, new C3937d(c3938e, r10, 1), 3);
                    }
                } else {
                    c2345kM105789c = c33358a2.m105789c();
                    interfaceC2339e3 = c2345kM105789c.f9275c;
                    str2 = c2345kM105789c.f9273a;
                    enumC2341g3 = EnumC2341g.ERROR;
                    if (interfaceC2339e3.isLoggable(enumC2341g3, str2)) {
                        c2345kM105789c.f9274b.log(enumC2341g3, str2, "Audio handler not initialized. Ensure calling setup(), before using the handler.", r10);
                    }
                }
                c11783c = c33358a2.f139196g;
                if (c11783c != null) {
                    audioManager = c33358a2.f139195f;
                    if (audioManager != null) {
                        audioManager.unregisterAudioDeviceCallback(c11783c);
                    }
                    c33358a2.f139196g = r10;
                    c2345kM105789c2 = c33358a2.m105789c();
                    interfaceC2339e5 = c2345kM105789c2.f9275c;
                    enumC2341g5 = EnumC2341g.INFO;
                    if (interfaceC2339e5.isLoggable(enumC2341g5, c2345kM105789c2.f9273a)) {
                        c2345kM105789c2.f9274b.log(enumC2341g5, c2345kM105789c2.f9273a, "[cleanupUsbDeviceDetection] Unregistered AudioDeviceCallback", r10);
                    }
                }
                c33358a2.f139194e.set(false);
                c33368c4.f139268C.m36570j(r10);
                c2817b = c33368c4.f139294h;
                if (!c2817b.f11023x) {
                    c2817b.f11023x = true;
                    c2345kM8013p = c2817b.m8013p();
                    interfaceC2339e4 = c2345kM8013p.f9275c;
                    enumC2341g4 = EnumC2341g.DEBUG;
                    if (interfaceC2339e4.isLoggable(enumC2341g4, c2345kM8013p.f9273a)) {
                        obj3 = null;
                        c2345kM8013p.f9274b.log(enumC2341g4, c2345kM8013p.f9273a, "Cleaning up ScopeProvider and shutting down executor", null);
                    } else {
                        obj3 = null;
                    }
                    executorService = (ExecutorService) c2817b.f11021E;
                    if (executorService != null) {
                        executorService.shutdown();
                    }
                    c2817b.f11021E = obj3;
                }
                return C23454a0.f92919a;
            case 7:
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                int i28 = this.f116682x;
                if (i28 == 0) {
                    AbstractC34132o.m107864I(obj);
                    String str10 = (String) this.f116679E;
                    if (str10 == null) {
                        return null;
                    }
                    C29938w0 c29938w1 = (C29938w0) this.f116680F;
                    ((C32101c) c29938w1.f122260x).getClass();
                    Bitmap bitmap = (Bitmap) C32101c.f133103b.get(str10);
                    if (bitmap != null) {
                        return bitmap;
                    }
                    this.f116683y = c29938w1;
                    this.f116684z = str10;
                    this.f116682x = 1;
                    objM102859c = ((C32800q) c29938w1.f122261y).m102859c(str10, this);
                    if (objM102859c == enumC31071a8) {
                        return enumC31071a8;
                    }
                    key = str10;
                    c29938w0 = c29938w1;
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    key = (String) this.f116684z;
                    c29938w0 = (C29938w0) this.f116683y;
                    AbstractC34132o.m107864I(obj);
                    objM102859c = obj;
                }
                Bitmap bitmap2 = (Bitmap) objM102859c;
                if (bitmap2 == null) {
                    c29938w0.getClass();
                    return bitmap2;
                }
                ((C32101c) c29938w0.f122260x).getClass();
                AbstractC22676k.m65750j(key, "key");
                C32101c.f133103b.put(key, bitmap2);
                return bitmap2;
            case 8:
                EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                int i29 = this.f116682x;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C35401o c35401o = (C35401o) this.f116683y;
                AbstractActivityC1340r0 abstractActivityC1340r0 = (AbstractActivityC1340r0) this.f116684z;
                String str11 = (String) this.f116679E;
                String str12 = (String) this.f116680F;
                this.f116682x = 1;
                Object objM36575A = AbstractC13091v.m36575A(new C35399m(c35401o.f150839b, c35401o, abstractActivityC1340r0, str11, str12), this);
                return objM36575A == enumC31071a9 ? enumC31071a9 : objM36575A;
            case 9:
                PollingActivity pollingActivity = (PollingActivity) this.f116684z;
                EnumC31071a enumC31071a10 = EnumC31071a.f128113w;
                int i34 = this.f116682x;
                if (i34 == 0) {
                    AbstractC34132o.m107864I(obj);
                    EnumC37847o enumC37847o = ((C37848p) ((InterfaceC28601c1) this.f116680F).getValue()).f162025c;
                    int i35 = PollingActivity.f22393z;
                    C37843k args = pollingActivity.m16866o();
                    AbstractC22676k.m65750j(enumC37847o, "<this>");
                    AbstractC22676k.m65750j(args, "args");
                    int iOrdinal = enumC37847o.ordinal();
                    if (iOrdinal == 0) {
                        c35526b = null;
                    } else {
                        if (iOrdinal == 1) {
                            c35526b3 = new C35526b(args.f162011w, 1, (StripeException) null, false, (String) null, args.f162009F, 60);
                        } else if (iOrdinal == 2) {
                            c35526b = null;
                        } else {
                            if (iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c35526b3 = new C35526b(args.f162011w, 3, (StripeException) null, false, (String) null, args.f162009F, 52);
                        }
                        c35526b = c35526b3;
                    }
                    if (c35526b != null) {
                        C16845k c16845k = (C16845k) this.f116679E;
                        this.f116683y = c35526b;
                        this.f116682x = 1;
                        if (c16845k.m47442b(this) == enumC31071a10) {
                            return enumC31071a10;
                        }
                        c35526b2 = c35526b;
                    }
                    return C23454a0.f92919a;
                }
                if (i34 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c35526b2 = (C35526b) this.f116683y;
                AbstractC34132o.m107864I(obj);
                int i36 = PollingActivity.f22393z;
                pollingActivity.setResult(-1, new Intent().putExtras(c35526b2.m112682b()));
                pollingActivity.finish();
                return C23454a0.f92919a;
            case 10:
                C37917p0 c37917p0 = (C37917p0) this.f116683y;
                EnumC31071a enumC31071a11 = EnumC31071a.f128113w;
                int i37 = this.f116682x;
                if (i37 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C13043h0 c13043h0M36612v = AbstractC13091v.m36612v(c37917p0.f162368w, 1);
                    C23186v c23186v = new C23186v((InterfaceC0360e) this.f116684z, c37917p0, (InterfaceC0358c) this.f116679E, (InterfaceC28601c1) this.f116680F, (InterfaceC30057d) null, 2);
                    this.f116682x = 1;
                    if (AbstractC13091v.m36604n(c13043h0M36612v, c23186v, this) == enumC31071a11) {
                        return enumC31071a11;
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 11:
                EnumC31071a enumC31071a12 = EnumC31071a.f128113w;
                int i38 = this.f116682x;
                if (i38 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC34476v interfaceC34476v = (InterfaceC34476v) this.f116683y;
                    C37082e1 c37082e1 = new C37082e1((InterfaceC28601c1) this.f116684z, (C23254g) this.f116679E, (InterfaceC2355b3) this.f116680F, i13);
                    this.f116682x = 1;
                    if (AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, c37082e1, this, 7) == enumC31071a12) {
                        return enumC31071a12;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 12:
                Context context2 = (Context) this.f116684z;
                EnumC31071a enumC31071a13 = EnumC31071a.f128113w;
                int i39 = this.f116682x;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    broadcastReceiver = (C37997b) this.f116683y;
                    try {
                        AbstractC34132o.m107864I(obj);
                        c37997b = broadcastReceiver;
                        objInvoke = obj;
                        context2.unregisterReceiver(c37997b);
                        return objInvoke;
                    } catch (Throwable th5) {
                        th = th5;
                        context2.unregisterReceiver(broadcastReceiver);
                        throw th;
                    }
                }
                AbstractC34132o.m107864I(obj);
                c37997b = new C37997b(new C37550r(8, (InterfaceC2994c0) this.f116683y, (C38011p) this.f116680F));
                context2.registerReceiver(c37997b, C37997b.f162770c);
                try {
                    c37997b.m121737a(context2);
                    C0071f c0071f = (C0071f) this.f116679E;
                    this.f116683y = c37997b;
                    this.f116682x = 1;
                    objInvoke = c0071f.invoke(this);
                    if (objInvoke == enumC31071a13) {
                        return enumC31071a13;
                    }
                    context2.unregisterReceiver(c37997b);
                    return objInvoke;
                } catch (Throwable th6) {
                    th = th6;
                    broadcastReceiver = c37997b;
                    context2.unregisterReceiver(broadcastReceiver);
                    throw th;
                }
            case 13:
                C23454a0 c23454a0 = C23454a0.f92919a;
                Throwable th7 = (Throwable) this.f116679E;
                EnumC31071a enumC31071a14 = EnumC31071a.f128113w;
                int i44 = this.f116682x;
                if (i44 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C28894l c28894l2 = (C28894l) this.f116683y;
                    Context context3 = (Context) this.f116684z;
                    this.f116682x = 1;
                    c28894l2.f116953c.set(true);
                    Log.e("GlanceAppWidget", "Error in Glance App Widget", th7);
                    if (!c28894l2.f116959i) {
                        throw th7;
                    }
                    AbstractC28880g0 abstractC28880g0 = c28894l2.f116955e;
                    C28864b c28864b2 = c28894l2.f116956f;
                    abstractC28880g0.m87805i(context3, c28864b2, c28864b2.f116802a, th7);
                    if (c23454a0 == enumC31071a14) {
                        return enumC31071a14;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                AbstractC3006f0.m8714h((InterfaceC38016u) this.f116680F, AbstractC11894a.m31955d("Error in composition effect coroutine", th7));
                return c23454a0;
            case 14:
                C38017v c38017v = (C38017v) this.f116683y;
                EnumC31071a enumC31071a15 = EnumC31071a.f128113w;
                int i45 = this.f116682x;
                if (i45 != 0 && i45 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                do {
                    Object obj4 = c38017v.f162845x.get();
                    AbstractC22676k.m65747g(obj4);
                    long jLongValue = ((Number) obj4).longValue();
                    ((C35331f0) this.f116684z).getClass();
                    if (jLongValue <= System.currentTimeMillis()) {
                        AbstractC3006f0.m8714h((InterfaceC2994c0) this.f116679E, new TimeoutCancellationException("Timed out of executing block.", ((InterfaceC4351m) this.f116680F).hashCode()));
                        return C23454a0.f92919a;
                    }
                    jM121746a = c38017v.m121746a();
                    this.f116682x = 1;
                } while (AbstractC3034m0.m8783c(jM121746a, this) != enumC31071a15);
                return enumC31071a15;
            default:
                C23465k c23465k2 = (C23465k) this.f116679E;
                InterfaceC14544a interfaceC14544a = (InterfaceC14544a) this.f116684z;
                View view = (View) this.f116683y;
                EnumC31071a enumC31071a16 = EnumC31071a.f128113w;
                int i46 = this.f116682x;
                if (i46 == 0) {
                    AbstractC34132o.m107864I(obj);
                    Handler handler = view.getHandler();
                    if ((handler == null || (mainLooper = handler.getLooper()) == null) && (mainLooper = Looper.getMainLooper()) == null) {
                        interfaceC14544a.error("Unable to get main looper");
                        return null;
                    }
                    if (AbstractC22676k.m65745e(mainLooper.getThread(), Thread.currentThread())) {
                        return C38329a.m122889a(view, c23465k2, (List) this.f116680F, interfaceC14544a);
                    }
                    C22365e c22365e = AbstractC3050q0.f12077a;
                    AbstractC3069w1 abstractC3069w1 = AbstractC17182o.f65999a;
                    C11327d0 c11327d0 = new C11327d0(view, c23465k2, (List) this.f116680F, (InterfaceC14544a) this.f116684z, null, 10);
                    this.f116682x = 1;
                    objM8705K = AbstractC3006f0.m8705K(abstractC3069w1, c11327d0, this);
                    if (objM8705K == enumC31071a16) {
                        return enumC31071a16;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM8705K = obj;
                }
                return (C38330b) objM8705K;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28820m(Object obj, Object obj2, Object obj3, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f116681w = i13;
        this.f116684z = obj;
        this.f116679E = obj2;
        this.f116680F = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28820m(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f116681w = i13;
        this.f116679E = obj;
        this.f116680F = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28820m(C22669g0 c22669g0, C28822o c28822o, InterfaceC30057d interfaceC30057d, C28822o c28822o2, UpdateSubscriptionsRequest updateSubscriptionsRequest) {
        super(2, interfaceC30057d);
        this.f116681w = 0;
        this.f116683y = c22669g0;
        this.f116684z = c28822o;
        this.f116679E = c28822o2;
        this.f116680F = updateSubscriptionsRequest;
    }
}
