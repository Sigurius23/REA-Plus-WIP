package p479s4;

import al0.C0971f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.TtsSpan;
import android.util.Log;
import b10.C2222b;
import b20.C2326f;
import bc3.AbstractC3050q0;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.GenericStripeException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.StripeException;
import ed3.C13117a;
import java.io.File;
import java.io.IOException;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kotlinx.serialization.SerializationException;
import m83.C25235a0;
import org.json.JSONException;
import p002a0.C0023g0;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0242q0;
import p005a3.C0230n0;
import p012ab.C0684i0;
import p026b2.AbstractC2316v;
import p031b9.AbstractC2875y;
import p241j3.C21265b;
import p241j3.C21267d;
import p241j3.C21268e;
import p294l3.C23289x0;
import p442qy.C30765d;
import p442qy.C30766e;
import p508ty.C34247a;
import p537ux.C35331f0;
import p588wm.InterfaceC37377s;
import p598wy.InterfaceC37689b;
import p664yy.C39865j;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29205p;
import q30.C29934u0;
import q83.InterfaceC30063j;
import s93.AbstractC32309k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: s4.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32123d implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static final C34247a m100021a(Context context, InterfaceC30063j workContext) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(workContext, "workContext");
        C29205p c29205p = new C29205p(context, workContext);
        C29934u0 c29934u0 = new C29934u0(context);
        C0684i0 c0684i0 = new C0684i0(workContext, (C30765d) null, 30);
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        C22365e c22365e = AbstractC3050q0.f12077a;
        ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
        AbstractC32309k.m100574c(executorC22364d);
        return new C34247a(c29205p, c29934u0, c0684i0, new C2326f(new C39865j(C30766e.f126697b, executorC22364d), new C2222b(applicationContext, C25235a0.f99113w, new C0971f(applicationContext, 1))), workContext, new C35331f0(0));
    }

    /* JADX INFO: renamed from: b */
    public static void m100022b(long j7, C13117a c13117a, InterfaceC37377s[] interfaceC37377sArr) {
        int i13;
        int iM36715y;
        while (true) {
            if (c13117a.m36692a() <= 1) {
                return;
            }
            int i14 = 0;
            while (true) {
                if (c13117a.m36692a() == 0) {
                    i13 = -1;
                    break;
                }
                int iM36715y2 = c13117a.m36715y();
                i14 += iM36715y2;
                if (iM36715y2 != 255) {
                    i13 = i14;
                    break;
                }
            }
            int i15 = 0;
            do {
                if (c13117a.m36692a() == 0) {
                    i15 = -1;
                    break;
                } else {
                    iM36715y = c13117a.m36715y();
                    i15 += iM36715y;
                }
            } while (iM36715y == 255);
            int i16 = c13117a.f45382b + i15;
            if (i15 == -1 || i15 > c13117a.m36692a()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i16 = c13117a.f45383c;
            } else if (i13 == 4 && i15 >= 8) {
                int iM36715y3 = c13117a.m36715y();
                int iM36682D = c13117a.m36682D();
                int iM36699i = iM36682D == 49 ? c13117a.m36699i() : 0;
                int iM36715y4 = c13117a.m36715y();
                if (iM36682D == 47) {
                    c13117a.m36690L(1);
                }
                boolean z4 = iM36715y3 == 181 && (iM36682D == 49 || iM36682D == 47) && iM36715y4 == 3;
                if (iM36682D == 49) {
                    z4 &= iM36699i == 1195456820;
                }
                if (z4) {
                    m100023c(j7, c13117a, interfaceC37377sArr);
                }
            }
            c13117a.m36689K(i16);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m100023c(long j7, C13117a c13117a, InterfaceC37377s[] interfaceC37377sArr) {
        long j13;
        int iM36715y = c13117a.m36715y();
        if ((iM36715y & 64) != 0) {
            c13117a.m36690L(1);
            int i13 = (iM36715y & 31) * 3;
            int i14 = c13117a.f45382b;
            int length = interfaceC37377sArr.length;
            int i15 = 0;
            while (i15 < length) {
                InterfaceC37377s interfaceC37377s = interfaceC37377sArr[i15];
                c13117a.m36689K(i14);
                interfaceC37377s.mo102732c(i13, c13117a);
                if (j7 != -9223372036854775807L) {
                    j13 = j7;
                    interfaceC37377s.mo102733d(j13, 1, i13, 0, null);
                } else {
                    j13 = j7;
                }
                i15++;
                j7 = j13;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static StripeException m100024d(Throwable throwable) {
        AbstractC22676k.m65750j(throwable, "throwable");
        if (throwable instanceof StripeException) {
            return (StripeException) throwable;
        }
        if (throwable instanceof JSONException) {
            return new APIException(0, 7, null, throwable.getMessage(), throwable, null);
        }
        if (throwable instanceof IOException) {
            int i13 = APIConnectionException.f22150F;
            return AbstractC32120a.m99975a((IOException) throwable, null);
        }
        if (throwable instanceof IllegalArgumentException) {
            return new InvalidRequestException(0, 7, null, throwable.getMessage(), throwable, null);
        }
        Class<?> cls = throwable.getClass();
        return new GenericStripeException((AbstractC39421y.m125930O(cls.getName(), "android.", false) || AbstractC39421y.m125930O(cls.getName(), "java.", false)) ? cls.getName() : null, throwable);
    }

    /* JADX INFO: renamed from: e */
    public static File[] m100025e(Context context) {
        return context.getExternalMediaDirs();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:27:0x007d, B:29:0x0085, B:30:0x0090, B:37:0x00a0, B:24:0x006c, B:39:0x00a3, B:41:0x00a8, B:42:0x00a9, B:23:0x0066, B:31:0x0091, B:33:0x0097), top: B:57:0x0021, outer: #1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #3 {, blocks: (B:31:0x0091, B:33:0x0097), top: B:61:0x0091, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:27:0x007d, B:29:0x0085, B:30:0x0090, B:37:0x00a0, B:24:0x006c, B:39:0x00a3, B:41:0x00a8, B:42:0x00a9, B:23:0x0066, B:31:0x0091, B:33:0x0097), top: B:57:0x0021, outer: #1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:33:0x0097, B:36:0x009f], limit reached: 61 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007a -> B:27:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    public static final java.lang.Object m100026f(s83.AbstractC32269c r10) {
        /*
            boolean r0 = r10 instanceof p605x6.C37996a
            if (r0 == 0) goto L13
            r0 = r10
            x6.a r0 = (p605x6.C37996a) r0
            int r1 = r0.f162764F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162764F = r1
            goto L18
        L13:
            x6.a r0 = new x6.a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f162763E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f162764F
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 != r5) goto L34
            dc3.c r2 = r0.f162768z
            dc3.w r6 = r0.f162767y
            vd1.c r7 = r0.f162766x
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.f162765w
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Throwable -> L31
            goto L7d
        L31:
            r10 = move-exception
            goto Lb5
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3c:
            p505ts.AbstractC34132o.m107864I(r10)
            r10 = 6
            dc3.h r6 = q83.AbstractC30060g.m92111d(r5, r10, r4)
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r10.<init>(r3)
            x30.j1 r2 = new x30.j1
            r7 = 3
            r2.<init>(r7, r10, r6)
            java.lang.Object r7 = p668z1.AbstractC39963l.f172462c
            monitor-enter(r7)
            java.lang.Object r8 = p668z1.AbstractC39963l.f172468i     // Catch: java.lang.Throwable -> Lbf
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> Lbf
            java.util.ArrayList r8 = m83.AbstractC25265s.m74128f1(r2, r8)     // Catch: java.lang.Throwable -> Lbf
            p668z1.AbstractC39963l.f172468i = r8     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r7)
            p668z1.AbstractC39963l.m128161a()
            vd1.c r7 = new vd1.c
            r8 = 3
            r7.<init>(r2, r8)
            dc3.c r2 = new dc3.c     // Catch: java.lang.Throwable -> L31
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r8 = r10
        L6c:
            r0.f162765w = r8     // Catch: java.lang.Throwable -> L31
            r0.f162766x = r7     // Catch: java.lang.Throwable -> L31
            r0.f162767y = r6     // Catch: java.lang.Throwable -> L31
            r0.f162768z = r2     // Catch: java.lang.Throwable -> L31
            r0.f162764F = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r2.m32187a(r0)     // Catch: java.lang.Throwable -> L31
            if (r10 != r1) goto L7d
            return r1
        L7d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L31
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto Laa
            java.lang.Object r10 = r2.m32188c()     // Catch: java.lang.Throwable -> L31
            l83.a0 r10 = (l83.C23454a0) r10     // Catch: java.lang.Throwable -> L31
            r8.set(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = p668z1.AbstractC39963l.f172462c     // Catch: java.lang.Throwable -> L31
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L31
            z1.a r9 = p668z1.AbstractC39963l.f172469j     // Catch: java.lang.Throwable -> La7
            a0.w0 r9 = r9.f172413h     // Catch: java.lang.Throwable -> La7
            if (r9 == 0) goto L9f
            boolean r9 = r9.m143h()     // Catch: java.lang.Throwable -> La7
            if (r9 != r5) goto L9f
            r9 = r5
            goto La0
        L9f:
            r9 = r3
        La0:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L6c
            p668z1.AbstractC39963l.m128161a()     // Catch: java.lang.Throwable -> L31
            goto L6c
        La7:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        Laa:
            r6.cancel(r4)     // Catch: java.lang.Throwable -> Lb3
            r7.m114042a()
            l83.a0 r10 = l83.C23454a0.f92919a
            return r10
        Lb3:
            r10 = move-exception
            goto Lbb
        Lb5:
            throw r10     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r0 = move-exception
            p505ts.AbstractC34132o.m107882f(r6, r10)     // Catch: java.lang.Throwable -> Lb3
            throw r0     // Catch: java.lang.Throwable -> Lb3
        Lbb:
            r7.m114042a()
            throw r10
        Lbf:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p479s4.AbstractC32123d.m100026f(s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m100027g(Context context, String str) {
        return AbstractC32122c.checkSelfPermission(context, str) == 0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    public static final C21267d m100028h(AbstractC2316v abstractC2316v, Function1 function1) {
        C0230n0 c0230n0M516p = AbstractC0201g.m516p(abstractC2316v);
        int i13 = c0230n0M516p.f795x;
        C21265b rectManager = AbstractC0242q0.m750a(c0230n0M516p).getRectManager();
        C21268e c21268e = rectManager.f81184b;
        c21268e.getClass();
        C0023g0 c0023g0 = c21268e.f81208a;
        C21267d c21267d = new C21267d(c21268e, i13, abstractC2316v, function1);
        Object objM121b = c0023g0.m121b(i13);
        if (objM121b == null) {
            c0023g0.m51h(i13, c21267d);
            objM121b = c21267d;
        }
        C21267d c21267d2 = (C21267d) objM121b;
        if (c21267d2 != c21267d) {
            while (true) {
                C21267d c21267d3 = c21267d2.f81203d;
                if (c21267d3 == null) {
                    break;
                }
                c21267d2 = c21267d3;
            }
            c21267d2.f81203d = c21267d;
        }
        rectManager.f81186d = true;
        rectManager.m59675k();
        return c21267d;
    }

    /* JADX INFO: renamed from: i */
    public static final void m100029i(int i13) {
        throw new SerializationException(AbstractC2875y.m8295h(i13, "An unknown field for index "));
    }

    /* JADX INFO: renamed from: j */
    public static Bitmap m100030j(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        boolean z4 = drawable instanceof BitmapDrawable;
        if (z4 && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        if (z4) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i13 = bounds.left;
        int i14 = bounds.top;
        int i15 = bounds.right;
        int i16 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i13, i14, i15, i16);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: k */
    public static final TtsSpan m100031k(C23289x0 c23289x0) {
        if (c23289x0 instanceof C23289x0) {
            return new TtsSpan.VerbatimBuilder(c23289x0.f92269a).build();
        }
        throw new NoWhenBranchMatchedException();
    }
}
