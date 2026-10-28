package a33;

import a30.C0332w0;
import a33.C0352d;
import al.C0960g;
import android.animation.ValueAnimator;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.view.Choreographer;
import androidx.fragment.app.RunnableC1283d;
import androidx.lifecycle.AbstractServiceC1597j0;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.RunnableC1631u1;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import androidx.room.C1778e;
import androidx.room.C1844y;
import ar.C1916d;
import au.C2049f;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bi.AbstractC3269g;
import c33.C3935b;
import c93.InterfaceC4339a;
import ch3.C4712u0;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.C5097j0;
import com.mapbox.maps.C5538l;
import d30.C11535h;
import dk.C12100f;
import dm.C12171a;
import dm.C12173c;
import dm.EnumC12174d;
import dz.AbstractC12462i;
import e10.C12554k0;
import e43.AbstractC12710b;
import e43.C12711c;
import e43.C12717i;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ed3.C13117a;
import fk.InterfaceC14544a;
import g40.C15378k0;
import g40.InterfaceC15361h1;
import g40.InterfaceC15455z2;
import gl.C15956u;
import gm.C15981i;
import gm.C15985m;
import gm.C15989q;
import gm.C15990r;
import h20.C16761x1;
import hc3.C17171d;
import io.getstream.android.video.generated.apis.ProductvideoApi;
import io.getstream.android.video.generated.models.ClientEvent;
import io.getstream.video.android.core.notifications.internal.DismissNotificationActivity;
import io.getstream.video.android.model.StreamCallId;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import jh3.AbstractC21702c;
import jp.HandlerC21846d;
import kr.C22786e;
import l83.C23470p;
import lb3.AbstractC23811y;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n53.C26318e;
import p000.C12473e;
import p012ab.C0680g0;
import p012ab.C0690l0;
import p012ab.InterfaceC0676e0;
import p021av.C2088b;
import p048ce.C4463d;
import p073cq.C11040i;
import p073cq.C11043l;
import p073cq.InterfaceC11035d;
import p075ct.C11105a;
import p085d9.C11784c0;
import p085d9.C11802s;
import p151fn.InterfaceC14633u;
import p168g6.ChoreographerFrameCallbackC15520a;
import p307lm.C24504a;
import p307lm.InterfaceC24505b;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.C24566x;
import p389p0.C28539n0;
import p428qk.C30438a;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p479s4.AbstractC32121b;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p508ty.C34249c;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p537ux.C35331f0;
import p547v8.C35787d;
import p547v8.C35791h;
import p547v8.InterfaceC35788e;
import p586wk.InterfaceC37326d;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p607x8.C38064s;
import p618xk.C38417h;
import p664yy.AbstractC39851c;
import p664yy.C39865j;
import p692zt.AbstractC41110n;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import pe3.C29119a;
import pf.AbstractC29125c;
import q20.C29810c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qg3.C30352d;
import re.C31271g;
import ss.C32945a;
import va3.AbstractC35849g;
import wb3.AbstractC37056f;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: a33.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C0352d implements InterfaceC0676e0, InterfaceC38282i, InterfaceC11035d, InterfaceC14633u {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1236w;

    /* JADX INFO: renamed from: x */
    public Object f1237x;

    /* JADX INFO: renamed from: y */
    public Object f1238y;

    /* JADX INFO: renamed from: z */
    public Object f1239z;

    public /* synthetic */ C0352d(Object obj, Object obj2, Object obj3, int i13) {
        this.f1236w = i13;
        this.f1237x = obj;
        this.f1238y = obj2;
        this.f1239z = obj3;
    }

    /* JADX INFO: renamed from: F */
    public static PendingIntent m909F(C0352d c0352d, StreamCallId callId, Map payload) {
        int notificationId = callId.getNotificationId(C12717i.f43512b);
        c0352d.getClass();
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(payload, "payload");
        Intent intentPutExtras = new Intent("io.getstream.video.android.action.ACCEPT_CALL").putExtras(new Bundle());
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        return c0352d.m919G(intentPutExtras, callId, notificationId);
    }

    /* JADX INFO: renamed from: J */
    public static PendingIntent m910J(C0352d c0352d, StreamCallId callId, Map payload) {
        int notificationId = callId.getNotificationId(C12717i.f43512b);
        c0352d.getClass();
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(payload, "payload");
        Intent intentPutExtras = new Intent("io.getstream.video.android.action.INCOMING_CALL").putExtras(new Bundle());
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        return c0352d.m919G(intentPutExtras, callId, notificationId);
    }

    /* JADX INFO: renamed from: S */
    private final void m911S() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m912a(int i13) {
        String str = (i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "valueParameters";
                break;
            case 2:
                objArr[0] = "typeParameters";
                break;
            case 3:
                objArr[0] = "signatureErrors";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                break;
            default:
                objArr[0] = "returnType";
                break;
        }
        if (i13 == 4) {
            objArr[1] = "getReturnType";
        } else if (i13 == 5) {
            objArr[1] = "getValueParameters";
        } else if (i13 == 6) {
            objArr[1] = "getTypeParameters";
        } else if (i13 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
        } else {
            objArr[1] = "getErrors";
        }
        if (i13 != 4 && i13 != 5 && i13 != 6 && i13 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 4 && i13 != 5 && i13 != 6 && i13 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: n */
    public static void m913n(C0352d c0352d, C30352d c30352d) {
        long[] jArr = (long[]) c0352d.f1237x;
        C0352d c0352d2 = (C0352d) c30352d.f124535x;
        long[] jArr2 = (long[]) c0352d2.f1237x;
        long[] jArr3 = (long[]) c30352d.f124536y;
        AbstractC5078a.m15938k(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) c0352d.f1238y;
        long[] jArr5 = (long[]) c0352d2.f1238y;
        long[] jArr6 = (long[]) c0352d2.f1239z;
        AbstractC5078a.m15938k(jArr4, jArr5, jArr6);
        AbstractC5078a.m15938k((long[]) c0352d.f1239z, jArr6, jArr3);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ac A[Catch: Exception -> 0x0084, TryCatch #4 {Exception -> 0x0084, blocks: (B:33:0x0080, B:42:0x009c, B:44:0x00ac, B:46:0x00bf), top: B:80:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf A[Catch: Exception -> 0x0084, TRY_LEAVE, TryCatch #4 {Exception -> 0x0084, blocks: (B:33:0x0080, B:42:0x009c, B:44:0x00ac, B:46:0x00bf), top: B:80:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd A[Catch: Exception -> 0x0039, TryCatch #3 {Exception -> 0x0039, blocks: (B:15:0x0034, B:55:0x0106, B:57:0x010c, B:64:0x013b, B:65:0x016c, B:48:0x00c6, B:50:0x00cd, B:54:0x00f2, B:66:0x01a4), top: B:79:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #3 {Exception -> 0x0039, blocks: (B:15:0x0034, B:55:0x0106, B:57:0x010c, B:64:0x013b, B:65:0x016c, B:48:0x00c6, B:50:0x00cd, B:54:0x00f2, B:66:0x01a4), top: B:79:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a4 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #3 {Exception -> 0x0039, blocks: (B:15:0x0034, B:55:0x0106, B:57:0x010c, B:64:0x013b, B:65:0x016c, B:48:0x00c6, B:50:0x00cd, B:54:0x00f2, B:66:0x01a4), top: B:79:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [bk.b, s83.c] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00f2 -> B:55:0x0106). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: A */
    public java.lang.Object m914A(s83.AbstractC32269c r18) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a33.C0352d.m914A(s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (r9 == r4) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [dk.f] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m915B(p223ik.EnumC18597a r12, s83.AbstractC32269c r13) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a33.C0352d.m915B(ik.a, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[PHI: r2
      0x0073: PHI (r2v4 a33.d) = (r2v2 a33.d), (r2v5 a33.d) binds: [B:24:0x0070, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0081 A[PHI: r2
      0x0081: PHI (r2v6 a33.d) = (r2v4 a33.d), (r2v7 a33.d) binds: [B:27:0x007e, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x008f A[PHI: r2
      0x008f: PHI (r2v8 a33.d) = (r2v6 a33.d), (r2v9 a33.d) binds: [B:30:0x008c, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x009d A[PHI: r2
      0x009d: PHI (r2v10 a33.d) = (r2v8 a33.d), (r2v11 a33.d) binds: [B:33:0x009a, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab A[PHI: r2
      0x00ab: PHI (r2v12 a33.d) = (r2v10 a33.d), (r2v13 a33.d) binds: [B:36:0x00a8, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r2.m915B(p223ik.EnumC18597a.APP_BUILD, r0) == r1) goto L40;
     */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m916C(s83.AbstractC32269c r5) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a33.C0352d.m916C(s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: D */
    public void m917D(EnumC1632v enumC1632v) {
        RunnableC1631u1 runnableC1631u1 = (RunnableC1631u1) this.f1239z;
        if (runnableC1631u1 != null) {
            runnableC1631u1.run();
        }
        RunnableC1631u1 runnableC1631u2 = new RunnableC1631u1((C1593i0) this.f1237x, enumC1632v);
        this.f1239z = runnableC1631u2;
        ((Handler) this.f1238y).postAtFrontOfQueue(runnableC1631u2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:68:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x00e1 -> B:63:0x00e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x00ea -> B:65:0x00eb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: E */
    public java.lang.Object m918E(int r13, a33.C0351c r14, s83.AbstractC32269c r15) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a33.C0352d.m918E(int, a33.c, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: G */
    public PendingIntent m919G(Intent intent, StreamCallId streamCallId, int i13) {
        ResolveInfo resolveInfoM925N = m925N(new C12711c(this, intent, 0));
        if (resolveInfoM925N == null) {
            return null;
        }
        int iIntValue = ((Number) AbstractC12710b.f43496w.getValue()).intValue();
        Context context = (Context) this.f1237x;
        String action = intent.getAction();
        if (action == null) {
            C2345k c2345k = (C2345k) ((C23470p) this.f1239z).getValue();
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, "Developer error. Intent action must be set", null);
            }
            throw new IllegalArgumentException("kotlin.Unit");
        }
        int i14 = DismissNotificationActivity.f74906w;
        AbstractC22676k.m65750j(context, "context");
        Intent intent2 = new Intent(context, (Class<?>) DismissNotificationActivity.class);
        intent2.putExtra("KEY_NOTIFICATION_ID", i13);
        intent2.setAction(action);
        Intent intent3 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfoM925N.activityInfo;
        intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
        intent3.putExtra("io.getstream.video.android.intent-extra.call_cid", streamCallId);
        PendingIntent activities = PendingIntent.getActivities(context, 0, new Intent[]{intent3, intent2}, iIntValue);
        AbstractC22676k.m65749i(activities, "getActivities(...)");
        return activities;
    }

    /* JADX INFO: renamed from: H */
    public PendingIntent m920H(Intent intent, StreamCallId streamCallId) {
        ResolveInfo resolveInfoM925N = m925N(new C12711c(this, intent, 1));
        if (resolveInfoM925N == null) {
            return null;
        }
        int iIntValue = ((Number) AbstractC12710b.f43496w.getValue()).intValue();
        Context context = (Context) this.f1237x;
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfoM925N.activityInfo;
        intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
        intent2.putExtra("io.getstream.video.android.intent-extra.call_cid", streamCallId);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent2, iIntValue);
        AbstractC22676k.m65749i(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    /* JADX INFO: renamed from: I */
    public PendingIntent m921I(StreamCallId callId, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(payload, "payload");
        Intent intentPutExtras = new Intent("io.getstream.video.android.action.LEAVE_CALL").putExtras(new Bundle());
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        return m920H(intentPutExtras, callId);
    }

    /* JADX INFO: renamed from: K */
    public PendingIntent m922K(StreamCallId callId, int i13, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(payload, "payload");
        Intent intentPutExtras = new Intent("io.getstream.video.android.action.ONGOING_CALL").putExtra("io.getstream.video.android.intent-extra.call_cid", callId.getCid()).putExtras(new Bundle());
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        return m919G(intentPutExtras, callId, i13);
    }

    /* JADX INFO: renamed from: L */
    public PendingIntent m923L(StreamCallId callId, int i13, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(payload, "payload");
        Intent intentPutExtras = new Intent("io.getstream.video.android.action.OUTGOING_CALL").addFlags(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ).putExtras(new Bundle());
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        return m919G(intentPutExtras, callId, i13);
    }

    /* JADX INFO: renamed from: M */
    public PendingIntent m924M(StreamCallId callId, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(payload, "payload");
        Intent intentPutExtras = new Intent("io.getstream.video.android.action.REJECT_CALL").putExtras(new Bundle());
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        return m920H(intentPutExtras, callId);
    }

    /* JADX INFO: renamed from: N */
    public ResolveInfo m925N(InterfaceC4339a interfaceC4339a) {
        Object obj;
        Iterable iterable = (Iterable) interfaceC4339a.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (AbstractC22676k.m65745e(((ResolveInfo) obj2).activityInfo.packageName, ((Context) this.f1237x).getPackageName())) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int i13 = ((ResolveInfo) next).priority;
                do {
                    Object next2 = it.next();
                    int i14 = ((ResolveInfo) next2).priority;
                    if (i13 < i14) {
                        next = next2;
                        i13 = i14;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (ResolveInfo) obj;
    }

    /* JADX INFO: renamed from: O */
    public void m926O(C12171a c12171a) {
        C5538l c5538l = new C5538l(24);
        C15989q c15989q = (C15989q) this.f1239z;
        C15981i c15981i = (C15981i) this.f1237x;
        C12173c c12173c = (C12173c) this.f1238y;
        InterfaceC24505b interfaceC24505b = c15989q.f60508c;
        C0352d c0352dM45125a = C15981i.m45125a();
        c0352dM45125a.m928Q(c15981i.f60488a);
        c0352dM45125a.f1239z = EnumC12174d.f40479w;
        c0352dM45125a.f1238y = c15981i.f60489b;
        C15981i c15981iM932d = c0352dM45125a.m932d();
        C0332w0 c0332w0 = new C0332w0(4);
        c0332w0.f1166G = new HashMap();
        c0332w0.f1164E = Long.valueOf(c15989q.f60506a.getTime());
        c0332w0.f1165F = Long.valueOf(c15989q.f60507b.getTime());
        c0332w0.f1170z = "FCM_CLIENT_EVENT_LOGGING";
        C2049f c2049f = c12171a.f40475a;
        C15990r c15990r = AbstractC41110n.f177215a;
        c15990r.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c15990r.m45138A(c2049f, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        c0332w0.f1169y = new C15985m(c12173c, byteArrayOutputStream.toByteArray());
        c0332w0.f1168x = null;
        C24504a c24504a = (C24504a) interfaceC24505b;
        c24504a.f95599b.execute(new RunnableC1283d(c24504a, c15981iM932d, c5538l, c0332w0.m860m()));
    }

    /* JADX INFO: renamed from: P */
    public void m927P(ClientEvent clientEvent) {
        List listM118958J = AbstractC37056f.m118958J(clientEvent);
        if (listM118958J.isEmpty()) {
            return;
        }
        AbstractC3006f0.m8732z((C17171d) this.f1238y, null, null, new C12473e(this, listM118958J, (InterfaceC30057d) null, 5), 3);
    }

    /* JADX INFO: renamed from: Q */
    public void m928Q(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f1237x = str;
    }

    /* JADX INFO: renamed from: R */
    public void m929R() {
        switch (this.f1236w) {
            case 26:
                C15956u c15956u = (C15956u) ((C34249c) this.f1237x).f143660x;
                synchronized (c15956u) {
                    c15956u.f60387y = c15956u.f60385w.length;
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m930b(int[] iArr, ValueAnimator valueAnimator) {
        C22786e c22786e = new C22786e(iArr, valueAnimator);
        valueAnimator.addListener((C1916d) this.f1239z);
        ((ArrayList) this.f1237x).add(c22786e);
    }

    @Override // p012ab.InterfaceC0676e0
    /* JADX INFO: renamed from: c */
    public void mo931c(C38059n c38059n) {
        long jM121885d;
        long j7;
        AbstractC35849g.m113808j((C38064s) this.f1238y);
        int i13 = AbstractC38065t.f163031a;
        C38064s c38064s = (C38064s) this.f1238y;
        synchronized (c38064s) {
            try {
                long j13 = c38064s.f163029c;
                jM121885d = j13 != -9223372036854775807L ? j13 + c38064s.f163028b : c38064s.m121885d();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C38064s c38064s2 = (C38064s) this.f1238y;
        synchronized (c38064s2) {
            j7 = c38064s2.f163028b;
        }
        if (jM121885d == -9223372036854775807L || j7 == -9223372036854775807L) {
            return;
        }
        C34610p c34610p = (C34610p) this.f1237x;
        if (j7 != c34610p.f145788s) {
            C34608o c34608oM109410a = c34610p.m109410a();
            c34608oM109410a.f145746r = j7;
            C34610p c34610p2 = new C34610p(c34608oM109410a);
            this.f1237x = c34610p2;
            ((InterfaceC33639k0) this.f1239z).mo36173a(c34610p2);
        }
        int iM121848a = c38059n.m121848a();
        ((InterfaceC33639k0) this.f1239z).mo36176d(c38059n, iM121848a, 0);
        ((InterfaceC33639k0) this.f1239z).mo36174b(jM121885d, 1, iM121848a, 0, null);
    }

    /* JADX INFO: renamed from: d */
    public C15981i m932d() {
        String strConcat = ((String) this.f1237x) == null ? " backendName" : "";
        if (((EnumC12174d) this.f1239z) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new C15981i((String) this.f1237x, (byte[]) this.f1238y, (EnumC12174d) this.f1239z);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    /* JADX INFO: renamed from: e */
    public String m933e(String str, long j7, long j13, int i13) {
        ArrayList arrayList = (ArrayList) this.f1237x;
        ArrayList arrayList2 = (ArrayList) this.f1239z;
        ArrayList arrayList3 = (ArrayList) this.f1238y;
        StringBuilder sb4 = new StringBuilder();
        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
            sb4.append((String) arrayList.get(i14));
            if (((Integer) arrayList3.get(i14)).intValue() == 1) {
                sb4.append(str);
            } else if (((Integer) arrayList3.get(i14)).intValue() == 2) {
                sb4.append(String.format(Locale.US, (String) arrayList2.get(i14), Long.valueOf(j7)));
            } else if (((Integer) arrayList3.get(i14)).intValue() == 3) {
                sb4.append(String.format(Locale.US, (String) arrayList2.get(i14), Integer.valueOf(i13)));
            } else if (((Integer) arrayList3.get(i14)).intValue() == 4) {
                sb4.append(String.format(Locale.US, (String) arrayList2.get(i14), Long.valueOf(j13)));
            }
        }
        sb4.append((String) arrayList.get(arrayList3.size()));
        return sb4.toString();
    }

    @Override // p151fn.InterfaceC14633u
    /* JADX INFO: renamed from: f */
    public void mo934f(C13117a c13117a) {
        long jM71661c;
        long j7;
        AbstractC24543a.m71574j((C24566x) this.f1238y);
        int i13 = AbstractC24567y.f95875a;
        C24566x c24566x = (C24566x) this.f1238y;
        synchronized (c24566x) {
            try {
                long j13 = c24566x.f95873c;
                jM71661c = j13 != -9223372036854775807L ? j13 + c24566x.f95872b : c24566x.m71661c();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C24566x c24566x2 = (C24566x) this.f1238y;
        synchronized (c24566x2) {
            j7 = c24566x2.f95872b;
        }
        if (jM71661c == -9223372036854775807L || j7 == -9223372036854775807L) {
            return;
        }
        C31521c0 c31521c0 = (C31521c0) this.f1237x;
        if (j7 != c31521c0.f130081P) {
            C31518b0 c31518b0M97113a = c31521c0.m97113a();
            c31518b0M97113a.f130051o = j7;
            C31521c0 c31521c1 = new C31521c0(c31518b0M97113a);
            this.f1237x = c31521c1;
            ((InterfaceC37377s) this.f1239z).mo102730a(c31521c1);
        }
        int iM36692a = c13117a.m36692a();
        ((InterfaceC37377s) this.f1239z).mo102732c(iM36692a, c13117a);
        ((InterfaceC37377s) this.f1239z).mo102733d(jM71661c, 1, iM36692a, 0, null);
    }

    @Override // p012ab.InterfaceC0676e0
    /* JADX INFO: renamed from: g */
    public void mo935g(C38064s c38064s, InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        this.f1238y = c38064s;
        c0690l0.m1733c();
        c0690l0.m1738h();
        InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(c0690l0.f2494e, 5);
        this.f1239z = interfaceC33639k0Mo3101o;
        interfaceC33639k0Mo3101o.mo36173a((C34610p) this.f1237x);
    }

    /* JADX INFO: renamed from: h */
    public void m936h(InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        InterfaceC33639k0[] interfaceC33639k0Arr = (InterfaceC33639k0[]) this.f1238y;
        for (int i13 = 0; i13 < interfaceC33639k0Arr.length; i13++) {
            c0690l0.m1733c();
            c0690l0.m1738h();
            InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(c0690l0.f2494e, 3);
            C34610p c34610p = (C34610p) ((List) this.f1237x).get(i13);
            String str = c34610p.f145783n;
            AbstractC35849g.m113803e("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String str2 = c34610p.f145770a;
            if (str2 == null) {
                c0690l0.m1738h();
                str2 = (String) c0690l0.f2495f;
            }
            C34608o c34608o = new C34608o();
            c34608o.f145729a = str2;
            c34608o.f145740l = AbstractC34587d0.m109382o("video/mp2t");
            c34608o.f145741m = AbstractC34587d0.m109382o(str);
            c34608o.f145733e = c34610p.f145774e;
            c34608o.f145732d = c34610p.f145773d;
            c34608o.f145724H = c34610p.f145764I;
            c34608o.f145744p = c34610p.f145786q;
            AbstractC21702c.m61152w(c34608o, interfaceC33639k0Mo3101o);
            interfaceC33639k0Arr[i13] = interfaceC33639k0Mo3101o;
        }
    }

    @Override // p151fn.InterfaceC14633u
    /* JADX INFO: renamed from: i */
    public void mo937i(C24566x c24566x, InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        this.f1238y = c24566x;
        c0690l0.m1733c();
        c0690l0.m1738h();
        InterfaceC37377s interfaceC37377sMo3102o = interfaceC37369k.mo3102o(c0690l0.f2494e, 5);
        this.f1239z = interfaceC37377sMo3102o;
        interfaceC37377sMo3102o.mo102730a((C31521c0) this.f1237x);
    }

    /* JADX INFO: renamed from: j */
    public Bitmap m938j(BitmapFactory.Options options) {
        switch (this.f1236w) {
            case 26:
                C15956u c15956u = (C15956u) ((C34249c) this.f1237x).f143660x;
                c15956u.reset();
                return BitmapFactory.decodeStream(c15956u, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((C29119a) ((C38417h) this.f1239z).f164480w).m88489a().getFileDescriptor(), null, options);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r2.m916C(r0) == r1) goto L22;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m939k(s83.AbstractC32269c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p033bk.C3333a
            if (r0 == 0) goto L13
            r0 = r6
            bk.a r0 = (p033bk.C3333a) r0
            int r1 = r0.f12932z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12932z = r1
            goto L18
        L13:
            bk.a r0 = new bk.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12930x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f12932z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r6)
            goto L53
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            a33.d r2 = r0.f12929w
            p505ts.AbstractC34132o.m107864I(r6)
            goto L47
        L38:
            p505ts.AbstractC34132o.m107864I(r6)
            r0.f12929w = r5
            r0.f12932z = r4
            java.lang.Object r6 = r5.m914A(r0)
            if (r6 != r1) goto L46
            goto L52
        L46:
            r2 = r5
        L47:
            r6 = 0
            r0.f12929w = r6
            r0.f12932z = r3
            java.lang.Object r6 = r2.m916C(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a33.C0352d.m939k(s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: l */
    public void m940l() {
        C28539n0 c28539n0 = (C28539n0) this.f1238y;
        InterfaceC14544a interfaceC14544a = (InterfaceC14544a) this.f1239z;
        try {
            C30438a c30438aM86837g = ((C28539n0) this.f1237x).m86837g();
            interfaceC14544a.debug("Loaded old identity: " + c30438aM86837g);
            String str = c30438aM86837g.f125060a;
            if (str != null) {
                c28539n0.m86839k(str);
            }
            String str2 = c30438aM86837g.f125061b;
            if (str2 != null) {
                c28539n0.m86838j(str2);
            }
        } catch (Exception e5) {
            interfaceC14544a.error("Unable to migrate file identity storage: " + e5.getMessage());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m941m(AbstractC12462i abstractC12462i) {
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b((InterfaceC30063j) this.f1239z), null, null, new C1778e(this, abstractC12462i, null, 4), 3);
    }

    /* JADX INFO: renamed from: o */
    public Collection m942o() {
        return ((Map) this.f1237x).values();
    }

    /* JADX INFO: renamed from: p */
    public PendingIntent m943p(Map payload) {
        AbstractC22676k.m65750j(payload, "payload");
        Context context = (Context) this.f1237x;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            launchIntentForPackage = new Intent("android.intent.action.MAIN");
            launchIntentForPackage.setPackage(context.getPackageName());
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        Intent intentAddFlags = launchIntentForPackage.addFlags(536870912);
        ((C22786e) this.f1238y).getClass();
        intentAddFlags.putExtras(new Bundle());
        PendingIntent activity = PendingIntent.getActivity(context, 0, launchIntentForPackage, 201326592);
        AbstractC22676k.m65749i(activity, "getActivity(...)");
        return activity;
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public void mo944q(Task task) {
        ((HandlerC21846d) this.f1237x).removeCallbacksAndMessages(null);
        C11040i c11040i = (C11040i) this.f1238y;
        if (task.isSuccessful()) {
            c11040i.m29689d(task.getResult());
        } else {
            if (task.isCanceled()) {
                ((C11043l) this.f1239z).f34649a.m29703b(null);
                return;
            }
            Exception exception = task.getException();
            Objects.requireNonNull(exception);
            c11040i.m29688c(exception);
        }
    }

    /* JADX INFO: renamed from: r */
    public List m945r() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m912a(7);
        throw null;
    }

    @Override // xg3.InterfaceC38282i
    public void request(long j7) {
        long j13;
        long jMin;
        AtomicLong atomicLong = (AtomicLong) this.f1237x;
        C4712u0 c4712u0 = (C4712u0) this.f1239z;
        if (j7 <= 0 || c4712u0.f19286F) {
            return;
        }
        do {
            j13 = atomicLong.get();
            jMin = Math.min(j7, ((long) c4712u0.f19288H.f19290w) - j13);
            if (jMin == 0) {
                return;
            }
        } while (!atomicLong.compareAndSet(j13, j13 + jMin));
        ((InterfaceC38282i) this.f1238y).request(jMin);
    }

    /* JADX INFO: renamed from: s */
    public int m946s() throws Throwable {
        switch (this.f1236w) {
            case 26:
                List list = (List) this.f1239z;
                C15956u c15956u = (C15956u) ((C34249c) this.f1237x).f143660x;
                c15956u.reset();
                return AbstractC32121b.m100005j(list, c15956u, (C0960g) this.f1238y);
            default:
                List list2 = (List) this.f1238y;
                C38417h c38417h = (C38417h) this.f1239z;
                C0960g c0960g = (C0960g) this.f1237x;
                int size = list2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    InterfaceC37326d interfaceC37326d = (InterfaceC37326d) list2.get(i13);
                    C15956u c15956u2 = null;
                    try {
                        C15956u c15956u3 = new C15956u(new FileInputStream(((C29119a) c38417h.f164480w).m88489a().getFileDescriptor()), c0960g);
                        try {
                            int iMo45008c = interfaceC37326d.mo45008c(c15956u3, c0960g);
                            try {
                                c15956u3.close();
                                break;
                            } catch (IOException unused) {
                            }
                            ((C29119a) c38417h.f164480w).m88489a();
                            if (iMo45008c != -1) {
                                return iMo45008c;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c15956u2 = c15956u3;
                            if (c15956u2 != null) {
                                try {
                                    c15956u2.close();
                                    break;
                                } catch (IOException unused2) {
                                }
                            }
                            ((C29119a) c38417h.f164480w).m88489a();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return -1;
        }
    }

    /* JADX INFO: renamed from: t */
    public ImageHeaderParser$ImageType m947t() throws Throwable {
        switch (this.f1236w) {
            case 26:
                List list = (List) this.f1239z;
                C15956u c15956u = (C15956u) ((C34249c) this.f1237x).f143660x;
                c15956u.reset();
                return AbstractC32121b.m100008n(list, c15956u, (C0960g) this.f1238y);
            default:
                List list2 = (List) this.f1238y;
                C38417h c38417h = (C38417h) this.f1239z;
                C0960g c0960g = (C0960g) this.f1237x;
                int size = list2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    InterfaceC37326d interfaceC37326d = (InterfaceC37326d) list2.get(i13);
                    C15956u c15956u2 = null;
                    try {
                        C15956u c15956u3 = new C15956u(new FileInputStream(((C29119a) c38417h.f164480w).m88489a().getFileDescriptor()), c0960g);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo45007b = interfaceC37326d.mo45007b(c15956u3);
                            try {
                                c15956u3.close();
                                break;
                            } catch (IOException unused) {
                            }
                            ((C29119a) c38417h.f164480w).m88489a();
                            if (imageHeaderParser$ImageTypeMo45007b != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo45007b;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c15956u2 = c15956u3;
                            if (c15956u2 != null) {
                                try {
                                    c15956u2.close();
                                    break;
                                } catch (IOException unused2) {
                                }
                            }
                            ((C29119a) c38417h.f164480w).m88489a();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: u */
    public C5097j0 m948u() {
        return (C5097j0) this.f1238y;
    }

    /* JADX INFO: renamed from: v */
    public List m949v(byte[] bArr) {
        List list = (List) ((Map) this.f1237x).get(C11105a.m30034a(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: w */
    public AbstractC23811y m950w() {
        AbstractC23811y abstractC23811y = (AbstractC23811y) this.f1237x;
        if (abstractC23811y != null) {
            return abstractC23811y;
        }
        m912a(4);
        throw null;
    }

    /* JADX INFO: renamed from: x */
    public List m951x() {
        return (ArrayList) this.f1239z;
    }

    /* JADX INFO: renamed from: y */
    public List m952y() {
        List list = (List) this.f1238y;
        if (list != null) {
            return list;
        }
        m912a(5);
        throw null;
    }

    /* JADX INFO: renamed from: z */
    public boolean m953z() {
        return !((C32945a) this.f1239z).f137238a.isEmpty();
    }

    public C0352d(C28539n0 source, C28539n0 c28539n0, InterfaceC14544a logger) {
        this.f1236w = 5;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(logger, "logger");
        this.f1237x = source;
        this.f1238y = c28539n0;
        this.f1239z = logger;
    }

    public C0352d(C12100f source, C12100f c12100f, InterfaceC14544a logger) {
        this.f1236w = 4;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(logger, "logger");
        this.f1237x = source;
        this.f1238y = c12100f;
        this.f1239z = logger;
    }

    public C0352d(C29810c c29810c) {
        this.f1236w = 13;
        this.f1237x = c29810c;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(c29810c);
        this.f1238y = c13045h2M36593c;
        this.f1239z = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    public C0352d(List list, InterfaceC41211c interfaceC41211c) {
        InterfaceC13058l c1844y;
        InterfaceC15361h1 interfaceC15361h1;
        this.f1236w = 23;
        this.f1237x = interfaceC41211c;
        this.f1238y = C15378k0.f57812w;
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC15455z2) it.next()).mo43544f());
        }
        if (arrayList.isEmpty()) {
            Iterator it3 = AbstractC25265s.m74152u1(C25271y.f99162w, (C15378k0) this.f1238y).iterator();
            do {
                if (!it3.hasNext()) {
                    interfaceC15361h1 = null;
                    break;
                }
                interfaceC15361h1 = (InterfaceC15361h1) it3.next();
            } while (interfaceC15361h1 == null);
            c1844y = AbstractC3269g.m9493Z(interfaceC15361h1);
        } else {
            c1844y = new C1844y(3, (InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList).toArray(new InterfaceC13058l[0]), this);
        }
        this.f1239z = new C26318e(c1844y, new C4463d(1, arrayList, this));
    }

    public C0352d(C39865j analyticsRequestExecutor, AbstractC39851c analyticsRequestFactory, InterfaceC30063j workContext) {
        this.f1236w = 16;
        AbstractC22676k.m65750j(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC22676k.m65750j(analyticsRequestFactory, "analyticsRequestFactory");
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f1237x = analyticsRequestExecutor;
        this.f1238y = analyticsRequestFactory;
        this.f1239z = workContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0352d(C16761x1 config, C26318e currentScreenFlow, C26318e buttonsEnabledFlow, InterfaceC13037f2 paymentMethodMetadataFlow, C13081r1 selectionFlow, C13045h2 customPrimaryButtonUiStateFlow, C13045h2 cvcCompleteFlow, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        this.f1236w = 17;
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(currentScreenFlow, "currentScreenFlow");
        AbstractC22676k.m65750j(buttonsEnabledFlow, "buttonsEnabledFlow");
        AbstractC22676k.m65750j(paymentMethodMetadataFlow, "paymentMethodMetadataFlow");
        AbstractC22676k.m65750j(selectionFlow, "selectionFlow");
        AbstractC22676k.m65750j(customPrimaryButtonUiStateFlow, "customPrimaryButtonUiStateFlow");
        AbstractC22676k.m65750j(cvcCompleteFlow, "cvcCompleteFlow");
        this.f1237x = config;
        this.f1238y = interfaceC4339a;
        this.f1239z = (C22672i) interfaceC4339a2;
    }

    public C0352d(AbstractServiceC1597j0 abstractServiceC1597j0) {
        this.f1236w = 3;
        this.f1237x = new C1593i0(abstractServiceC1597j0);
        this.f1238y = new Handler();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0352d(int i13) {
        this(new long[10], new long[10], new long[10], 9);
        this.f1236w = i13;
        switch (i13) {
            case 9:
                break;
            case 12:
                this.f1237x = new ArrayList();
                this.f1238y = null;
                this.f1239z = new C1916d(this, 4);
                break;
            case 28:
                break;
            default:
                this.f1237x = new AtomicBoolean(false);
                this.f1239z = AbstractC30060g.m92088H(C3935b.f16065x);
                this.f1238y = AbstractC30060g.m92088H(new C2088b(this, 4));
                break;
        }
    }

    public C0352d(Application context, C22786e c22786e) {
        this.f1236w = 18;
        AbstractC22676k.m65750j(context, "context");
        this.f1237x = context;
        this.f1238y = c22786e;
        this.f1239z = AbstractC1772c1.m5382S(this, "IntentResolver");
    }

    public C0352d(C15981i c15981i, C12173c c12173c, C35331f0 c35331f0, C15989q c15989q) {
        this.f1236w = 29;
        this.f1237x = c15981i;
        this.f1238y = c12173c;
        this.f1239z = c15989q;
    }

    public C0352d(ProductvideoApi productvideoApi, C17171d c17171d) {
        this.f1236w = 0;
        this.f1237x = productvideoApi;
        this.f1238y = c17171d;
        this.f1239z = AbstractC1772c1.m5382S(this, "ImmediateEventSender");
    }

    public C0352d(InputStream inputStream, ArrayList arrayList, C0960g c0960g) {
        this.f1236w = 26;
        AbstractC29125c.m88539p(c0960g, "Argument must not be null");
        this.f1238y = c0960g;
        AbstractC29125c.m88539p(arrayList, "Argument must not be null");
        this.f1239z = arrayList;
        this.f1237x = new C34249c(inputStream, c0960g);
    }

    public C0352d(List list) {
        this.f1236w = 2;
        this.f1237x = list;
        this.f1238y = new InterfaceC33639k0[list.size()];
        this.f1239z = new C31271g(new C0680g0(this, 0));
    }

    public C0352d(String str, int i13) {
        this.f1236w = i13;
        switch (i13) {
            case 21:
                C31518b0 c31518b0 = new C31518b0();
                c31518b0.f130047k = str;
                this.f1237x = new C31521c0(c31518b0);
                break;
            default:
                C34608o c34608o = new C34608o();
                c34608o.f145740l = AbstractC34587d0.m109382o("video/mp2t");
                c34608o.f145741m = AbstractC34587d0.m109382o(str);
                this.f1237x = new C34610p(c34608o);
                break;
        }
    }

    public C0352d(AbstractC23811y abstractC23811y, List list, ArrayList arrayList) {
        this.f1236w = 25;
        List list2 = Collections.EMPTY_LIST;
        if (list == null) {
            m912a(1);
            throw null;
        }
        if (list2 != null) {
            this.f1237x = abstractC23811y;
            this.f1238y = list;
            this.f1239z = arrayList;
            return;
        }
        m912a(3);
        throw null;
    }

    public C0352d(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C0960g c0960g) {
        this.f1236w = 27;
        AbstractC29125c.m88539p(c0960g, "Argument must not be null");
        this.f1237x = c0960g;
        AbstractC29125c.m88539p(arrayList, "Argument must not be null");
        this.f1238y = arrayList;
        this.f1239z = new C38417h(parcelFileDescriptor);
    }

    public C0352d(int i13, String str, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f1236w = 22;
        this.f1237x = str;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f1238y = listUnmodifiableList;
        this.f1239z = bArr;
    }

    public C0352d(C0352d c0352d) {
        this.f1236w = 9;
        this.f1237x = Arrays.copyOf((long[]) c0352d.f1237x, 10);
        this.f1238y = Arrays.copyOf((long[]) c0352d.f1238y, 10);
        this.f1239z = Arrays.copyOf((long[]) c0352d.f1239z, 10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0352d(C30352d c30352d) {
        this(9);
        this.f1236w = 9;
        m913n(this, c30352d);
    }

    public C0352d(C4712u0 c4712u0, InterfaceC38282i interfaceC38282i) {
        this.f1236w = 8;
        this.f1239z = c4712u0;
        this.f1238y = interfaceC38282i;
        this.f1237x = new AtomicLong(0L);
    }

    public C0352d(InterfaceC35788e[] interfaceC35788eArr) {
        this.f1236w = 14;
        C11784c0 c11784c0 = new C11784c0();
        C35791h c35791h = new C35791h();
        c35791h.f152230c = 1.0f;
        c35791h.f152231d = 1.0f;
        C35787d c35787d = C35787d.f152193e;
        c35791h.f152232e = c35787d;
        c35791h.f152233f = c35787d;
        c35791h.f152234g = c35787d;
        c35791h.f152235h = c35787d;
        ByteBuffer byteBuffer = InterfaceC35788e.f152198a;
        c35791h.f152238k = byteBuffer;
        c35791h.f152239l = byteBuffer.asShortBuffer();
        c35791h.f152240m = byteBuffer;
        c35791h.f152229b = -1;
        InterfaceC35788e[] interfaceC35788eArr2 = new InterfaceC35788e[interfaceC35788eArr.length + 2];
        this.f1237x = interfaceC35788eArr2;
        System.arraycopy(interfaceC35788eArr, 0, interfaceC35788eArr2, 0, interfaceC35788eArr.length);
        this.f1238y = c11784c0;
        this.f1239z = c35791h;
        interfaceC35788eArr2[interfaceC35788eArr.length] = c11784c0;
        interfaceC35788eArr2[interfaceC35788eArr.length + 1] = c35791h;
    }

    public C0352d(C12554k0 c12554k0) {
        this.f1236w = 24;
        this.f1236w = 24;
        this.f1237x = c12554k0;
        this.f1238y = Choreographer.getInstance();
        this.f1239z = new ChoreographerFrameCallbackC15520a(this);
    }

    public C0352d(Map map, C5097j0 c5097j0, C32945a c32945a, Class cls) {
        this.f1236w = 10;
        this.f1237x = map;
        this.f1238y = c5097j0;
        this.f1239z = c32945a;
    }

    public C0352d(AudioTrack audioTrack, C11535h c11535h) {
        this.f1236w = 15;
        this.f1237x = audioTrack;
        this.f1238y = c11535h;
        this.f1239z = new AudioRouting.OnRoutingChangedListener() { // from class: d9.s
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                AudioDeviceInfo routedDevice;
                C0352d c0352d = this.f38323a;
                if (((C11802s) c0352d.f1239z) == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                    return;
                }
                ((C11535h) c0352d.f1238y).m30993c(routedDevice);
            }
        };
        audioTrack.addOnRoutingChangedListener((C11802s) this.f1239z, new Handler(Looper.myLooper()));
    }
}
