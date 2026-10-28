package androidx.compose.p018ui.platform;

import aa3.C0627i1;
import ad3.C0783z;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.key.AbstractC1128a;
import androidx.compose.p018ui.input.rotary.AbstractC1130a;
import androidx.compose.p018ui.layout.AbstractC1133c;
import androidx.compose.p018ui.node.C1134a;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.node.Owner;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.compose.p018ui.semantics.EmptySemanticsElement;
import androidx.databinding.RunnableC1189s;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.RunnableC1645z0;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.C1833u0;
import at.C1956b;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import io.sentry.config.AbstractC20301a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import l83.C23454a0;
import l83.InterfaceC23457c;
import la.C23548b;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p002a0.AbstractC0009b1;
import p002a0.AbstractC0052t;
import p002a0.C0006a1;
import p002a0.C0023g0;
import p002a0.C0026h0;
import p002a0.C0047q0;
import p002a0.C0057v0;
import p002a0.C0062y;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p005a3.AbstractC0233o;
import p005a3.C0188c2;
import p005a3.C0191d1;
import p005a3.C0195e1;
import p005a3.C0222l0;
import p005a3.C0223l1;
import p005a3.C0224l2;
import p005a3.C0230n0;
import p005a3.C0235o1;
import p005a3.C0237p;
import p005a3.C0238p0;
import p005a3.C0258v;
import p005a3.C0271z0;
import p005a3.EnumC0214j0;
import p005a3.EnumC0267y;
import p005a3.InterfaceC0180a2;
import p005a3.InterfaceC0200f2;
import p005a3.InterfaceC0204g2;
import p005a3.InterfaceC0208h2;
import p005a3.InterfaceC0272z1;
import p026b2.AbstractC2316v;
import p026b2.C2314t;
import p026b2.C2318x;
import p026b2.C2319y;
import p027b3.AbstractC2393j1;
import p027b3.AbstractC2405l3;
import p027b3.AbstractC2415n3;
import p027b3.AbstractC2417o0;
import p027b3.C2364d2;
import p027b3.C2373f1;
import p027b3.C2374f2;
import p027b3.C2381h;
import p027b3.C2382h0;
import p027b3.C2383h1;
import p027b3.C2384h2;
import p027b3.C2386i;
import p027b3.C2387i0;
import p027b3.C2388i1;
import p027b3.C2389i2;
import p027b3.C2391j;
import p027b3.C2402l0;
import p027b3.C2404l2;
import p027b3.C2407m0;
import p027b3.C2412n0;
import p027b3.C2413n1;
import p027b3.C2414n2;
import p027b3.C2416o;
import p027b3.C2421p;
import p027b3.C2423p1;
import p027b3.C2424p2;
import p027b3.C2431r;
import p027b3.C2436s;
import p027b3.C2441t;
import p027b3.C2446u;
import p027b3.C2456w;
import p027b3.C2458w1;
import p027b3.C2461x;
import p027b3.C2462x0;
import p027b3.C2463x1;
import p027b3.C2466y;
import p027b3.C2467y0;
import p027b3.C2470z;
import p027b3.EnumC2350a3;
import p027b3.InterfaceC2395j3;
import p027b3.InterfaceC2410m3;
import p027b3.InterfaceC2418o1;
import p027b3.InterfaceC2464x2;
import p027b3.InterfaceC2473z2;
import p027b3.RunnableC2411n;
import p027b3.ViewTreeObserverOnGlobalLayoutListenerC2396k;
import p027b3.ViewTreeObserverOnScrollChangedListenerC2401l;
import p027b3.ViewTreeObserverOnTouchModeChangeListenerC2406m;
import p031b9.AbstractC2875y;
import p035bp.AbstractC3511b;
import p037bu.C3632c;
import p042c2.AbstractC3866k;
import p042c2.C3856a;
import p042c2.C3859d;
import p042c2.C3864i;
import p042c2.C3865j;
import p042c2.C3868m;
import p042c2.InterfaceC3863h;
import p048ce.AbstractC4482w;
import p079d2.AbstractC11480b;
import p079d2.ViewOnAttachStateChangeListenerC11482d;
import p088dc.AbstractC11894a;
import p106e2.ViewOnDragListenerC12586a;
import p164g2.AbstractC15235g;
import p164g2.C15232d;
import p164g2.C15238j;
import p164g2.C15240l;
import p164g2.C15252x;
import p164g2.InterfaceC15229a0;
import p164g2.InterfaceC15239k;
import p181h2.C16618c;
import p182h3.C16794j;
import p184h5.AbstractC16901p0;
import p185h6.C16955j;
import p208i2.AbstractC17918w0;
import p208i2.C17873c;
import p208i2.C17881e1;
import p208i2.C17882f;
import p208i2.C17896l0;
import p208i2.C17917w;
import p208i2.C17920x0;
import p208i2.InterfaceC17883f0;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18037s;
import p209i3.AbstractC18039u;
import p209i3.C18017a;
import p209i3.C18023e;
import p209i3.C18030l;
import p209i3.C18034p;
import p209i3.C18036r;
import p241j3.C21265b;
import p241j3.C21268e;
import p249jc.AbstractC21598x;
import p293l2.C23224a;
import p293l2.C23226c;
import p294l3.C23283u0;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p392p3.InterfaceC28769g;
import p392p3.InterfaceC28770h;
import p399pb.InterfaceC29049f;
import p411q2.InterfaceC29805a;
import p412q3.C29863b0;
import p412q3.C29878l;
import p412q3.C29891y;
import p412q3.C29892z;
import p412q3.InputConnectionC29887u;
import p446r1.C30848b;
import p446r1.C30849c;
import p447r2.C30860a;
import p447r2.C30862c;
import p447r2.InterfaceC30861b;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34454d0;
import p512u2.C34453d;
import p512u2.C34459g;
import p512u2.C34462h0;
import p512u2.C34474t;
import p512u2.C34480z;
import p512u2.InterfaceC34457f;
import p512u2.InterfaceC34469o;
import p512u2.InterfaceC34470p;
import p550vd.AbstractC35902e;
import p557vo.AbstractC36220b;
import p558vp.AbstractC36259c;
import p570w2.C36706a;
import p581we.C37199o;
import p603x2.AbstractC37831a;
import p619xl.C38445a;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39110l1;
import p635y2.C39116n1;
import p635y2.C39118o0;
import p635y2.RunnableC39123q;
import p636y3.C39169a;
import p636y3.C39173e;
import p636y3.C39178j;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p668z1.AbstractC39963l;
import p668z1.C39972u;
import p668z1.C39973v;
import p669z2.C40001d;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import so.C32800q;
import va3.AbstractC35849g;
import va3.AbstractC35854l;
import vd1.C35909c;
import wb3.AbstractC37056f;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0003¦\u0002\u0018J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00102\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R+\u0010.\u001a\u00020&2\u0006\u0010'\u001a\u00020&8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u00104\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R*\u0010=\u001a\u0002052\u0006\u00106\u001a\u0002058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010C\u001a\u00020>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010I\u001a\u00020D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010O\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010W\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010V\u001a\u0004\bS\u0010TR \u0010]\u001a\b\u0012\u0004\u0012\u00020P0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010c\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010i\u001a\u00020d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010o\u001a\u00020j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001a\u0010}\u001a\u00020x8\u0016X\u0096\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u001e\u0010\u0083\u0001\u001a\u00020~8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0089\u0001\u001a\u00030\u0084\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R5\u0010\u0090\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u0004\u0012\u00020\u00100\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0005\b\u008f\u0001\u0010\u001bR\"\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u009c\u0001\u001a\u00030\u0097\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R \u0010¢\u0001\u001a\u00030\u009d\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R \u0010¨\u0001\u001a\u00030£\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R1\u0010±\u0001\u001a\u00030©\u00018V@\u0016X\u0096\u000e¢\u0006\u001f\n\u0006\bª\u0001\u0010«\u0001\u0012\u0005\b°\u0001\u0010V\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R/\u0010¸\u0001\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b²\u0001\u0010³\u0001\u0012\u0005\b·\u0001\u0010V\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0005\b¶\u0001\u0010\u0012R5\u0010¾\u0001\u001a\u0004\u0018\u00010\u00182\b\u0010'\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b¹\u0001\u0010)\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R\"\u0010Â\u0001\u001a\u0004\u0018\u00010\u00188FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010»\u0001R'\u0010É\u0001\u001a\u00030Ã\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bÄ\u0001\u0010Å\u0001\u0012\u0005\bÈ\u0001\u0010V\u001a\u0006\bÆ\u0001\u0010Ç\u0001R \u0010Ï\u0001\u001a\u00030Ê\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R'\u0010Ö\u0001\u001a\u00030Ð\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bÑ\u0001\u0010Ò\u0001\u0012\u0005\bÕ\u0001\u0010V\u001a\u0006\bÓ\u0001\u0010Ô\u0001R3\u0010Ý\u0001\u001a\u00030×\u00012\u0007\u0010'\u001a\u00030×\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bØ\u0001\u0010)\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R3\u0010ä\u0001\u001a\u00030Þ\u00012\u0007\u0010'\u001a\u00030Þ\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bß\u0001\u0010)\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R \u0010ê\u0001\u001a\u00030å\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001R \u0010ð\u0001\u001a\u00030ë\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001R \u0010ö\u0001\u001a\u00030ñ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001R \u0010ü\u0001\u001a\u00030÷\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bø\u0001\u0010ù\u0001\u001a\u0006\bú\u0001\u0010û\u0001R\u0017\u0010ÿ\u0001\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\b\u001a\u0006\bý\u0001\u0010þ\u0001R\u0018\u0010\u0083\u0002\u001a\u00030\u0080\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002R*\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0005\b\u0088\u0002\u0010\u0016R\u001a\u0010\u008c\u0002\u001a\u0005\u0018\u00010\u0089\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001a\u0010\u0090\u0002\u001a\u0005\u0018\u00010\u008d\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0018\u0010\u0094\u0002\u001a\u00030\u0091\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0017\u0010\u0096\u0002\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010µ\u0001R\u0018\u0010\u0098\u0002\u001a\u00030©\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010\u00ad\u0001R\u0018\u0010\u009c\u0002\u001a\u00030\u0099\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0018\u0010 \u0002\u001a\u00030\u009d\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u0018\u0010¢\u0002\u001a\u00030©\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¡\u0002\u0010\u00ad\u0001R\u0019\u0010¥\u0002\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0002\u0010¤\u0002¨\u0006§\u0002"}, m65681d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Lg2/a0;", "", "Lu2/f;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "La3/z1;", "", "getImportantForAutofill", "()I", "Lh2/c;", "getEmbeddedViewFocusRect", "()Lh2/c;", "", "intervalMillis", "Ll83/a0;", "setAccessibilityEventBatchIntervalMillis", "(J)V", "La3/g2;", "handler", "setUncaughtExceptionHandler", "(La3/g2;)V", "Lkotlin/Function1;", "Lb3/o;", "callback", "setOnViewTreeOwnersAvailable", "(Lkotlin/jvm/functions/Function1;)V", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "La3/p0;", "y", "La3/p0;", "getSharedDrawScope", "()La3/p0;", "sharedDrawScope", "Ly3/c;", "<set-?>", "z", "Lp1/c1;", "getDensity", "()Ly3/c;", "setDensity", "(Ly3/c;)V", "density", "Lg2/k;", "G", "Lg2/k;", "getFocusOwner", "()Lg2/k;", "focusOwner", "Lq83/j;", "value", "H", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "setCoroutineContext", "(Lq83/j;)V", "coroutineContext", "Le2/a;", "I", "Le2/a;", "getDragAndDropManager", "()Le2/a;", "dragAndDropManager", "Lb3/j3;", "L", "Lb3/j3;", "getViewConfiguration", "()Lb3/j3;", "viewConfiguration", "Ly2/q;", "M", "Ly2/q;", "getInsetsListener", "()Ly2/q;", "insetsListener", "La3/n0;", "N", "La3/n0;", "getRoot", "()La3/n0;", "getRoot$annotations", "()V", "root", "La0/g0;", "O", "La0/g0;", "getLayoutNodes", "()La0/g0;", "layoutNodes", "Lj3/b;", "P", "Lj3/b;", "getRectManager", "()Lj3/b;", "rectManager", "La3/h2;", "Q", "La3/h2;", "getRootForTest", "()La3/h2;", "rootForTest", "Li3/r;", "R", "Li3/r;", "getSemanticsOwner", "()Li3/r;", "semanticsOwner", "Ld2/d;", "T", "Ld2/d;", "getContentCaptureManager$ui_release", "()Ld2/d;", "setContentCaptureManager$ui_release", "(Ld2/d;)V", "contentCaptureManager", "Lb3/h;", "U", "Lb3/h;", "getAccessibilityManager", "()Lb3/h;", "accessibilityManager", "Li2/f0;", "V", "Li2/f0;", "getGraphicsContext", "()Li2/f0;", "graphicsContext", "Lc2/m;", "W", "Lc2/m;", "getAutofillTree", "()Lc2/m;", "autofillTree", "Landroid/content/res/Configuration;", "g0", "Lkotlin/jvm/functions/Function1;", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "configurationChangeObserver", "Lc2/d;", "i0", "Lc2/d;", "get_autofillManager$ui_release", "()Lc2/d;", "_autofillManager", "Lb3/j;", "k0", "Lb3/j;", "getClipboardManager", "()Lb3/j;", "clipboardManager", "Lb3/i;", "l0", "Lb3/i;", "getClipboard", "()Lb3/i;", "clipboard", "La3/c2;", "m0", "La3/c2;", "getSnapshotObserver", "()La3/c2;", "snapshotObserver", "", "n0", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "showLayoutBounds", "x0", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "A0", "get_viewTreeOwners", "()Lb3/o;", "set_viewTreeOwners", "(Lb3/o;)V", "_viewTreeOwners", "B0", "Lp1/t2;", "getViewTreeOwners", "viewTreeOwners", "Lq3/z;", "H0", "Lq3/z;", "getTextInputService", "()Lq3/z;", "getTextInputService$annotations", "textInputService", "Lb3/x2;", "J0", "Lb3/x2;", "getSoftwareKeyboardController", "()Lb3/x2;", "softwareKeyboardController", "Lp3/g;", "K0", "Lp3/g;", "getFontLoader", "()Lp3/g;", "getFontLoader$annotations", "fontLoader", "Lp3/h;", "L0", "getFontFamilyResolver", "()Lp3/h;", "setFontFamilyResolver", "(Lp3/h;)V", "fontFamilyResolver", "Ly3/m;", "N0", "getLayoutDirection", "()Ly3/m;", "setLayoutDirection", "(Ly3/m;)V", "layoutDirection", "Lq2/a;", "O0", "Lq2/a;", "getHapticFeedBack", "()Lq2/a;", "hapticFeedBack", "Lz2/d;", "Q0", "Lz2/d;", "getModifierLocalManager", "()Lz2/d;", "modifierLocalManager", "Lb3/z2;", "R0", "Lb3/z2;", "getTextToolbar", "()Lb3/z2;", "textToolbar", "Lu2/p;", "g1", "Lu2/p;", "getPointerIconService", "()Lu2/p;", "pointerIconService", "getView", "()Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Lb3/m3;", "getWindowInfo", "()Lb3/m3;", "windowInfo", "uncaughtExceptionHandler", "La3/g2;", "getUncaughtExceptionHandler$ui_release", "()La3/g2;", "setUncaughtExceptionHandler$ui_release", "Lc2/h;", "getAutofill", "()Lc2/h;", "autofill", "Lc2/k;", "getAutofillManager", "()Lc2/k;", "autofillManager", "Lb3/h1;", "getAndroidViewsHandler$ui_release", "()Lb3/h1;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Ly2/i1;", "getPlacementScope", "()Ly2/i1;", "placementScope", "Lr2/b;", "getInputModeManager", "()Lr2/b;", "inputModeManager", "getScrollCaptureInProgress$ui_release", "scrollCaptureInProgress", "getOutOfFrameExecutor", "()Landroidx/compose/ui/platform/AndroidComposeView;", "outOfFrameExecutor", "b3/o0", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class AndroidComposeView extends ViewGroup implements Owner, InterfaceC15229a0, InterfaceC0208h2, InterfaceC34457f, DefaultLifecycleObserver, InterfaceC0272z1 {

    /* JADX INFO: renamed from: h1 */
    public static Class f4886h1;

    /* JADX INFO: renamed from: i1 */
    public static Method f4887i1;

    /* JADX INFO: renamed from: j1 */
    public static Method f4888j1;

    /* JADX INFO: renamed from: k1 */
    public static final C0047q0 f4889k1 = new C0047q0();

    /* JADX INFO: renamed from: l1 */
    public static RunnableC2411n f4890l1;

    /* JADX INFO: renamed from: m1 */
    public static Method f4891m1;

    /* JADX INFO: renamed from: A0 */
    public final C28633k1 f4892A0;

    /* JADX INFO: renamed from: B0 */
    public final C28612f0 f4893B0;

    /* JADX INFO: renamed from: C0 */
    public Function1 f4894C0;

    /* JADX INFO: renamed from: D0 */
    public final ViewTreeObserverOnGlobalLayoutListenerC2396k f4895D0;

    /* JADX INFO: renamed from: E */
    public final View f4896E;

    /* JADX INFO: renamed from: E0 */
    public final ViewTreeObserverOnScrollChangedListenerC2401l f4897E0;

    /* JADX INFO: renamed from: F */
    public final boolean f4898F;

    /* JADX INFO: renamed from: F0 */
    public final ViewTreeObserverOnTouchModeChangeListenerC2406m f4899F0;

    /* JADX INFO: renamed from: G */
    public final C15240l f4900G;

    /* JADX INFO: renamed from: G0 */
    public final C29863b0 f4901G0;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public InterfaceC30063j coroutineContext;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public final C29892z textInputService;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final ViewOnDragListenerC12586a dragAndDropManager;

    /* JADX INFO: renamed from: I0 */
    public final AtomicReference f4905I0;

    /* JADX INFO: renamed from: J */
    public final C2414n2 f4906J;

    /* JADX INFO: renamed from: J0 */
    public final C2463x1 f4907J0;

    /* JADX INFO: renamed from: K */
    public final C17917w f4908K;

    /* JADX INFO: renamed from: K0 */
    public final C2384h2 f4909K0;

    /* JADX INFO: renamed from: L */
    public final C2373f1 f4910L;

    /* JADX INFO: renamed from: L0 */
    public final C28633k1 f4911L0;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public final RunnableC39123q insetsListener;

    /* JADX INFO: renamed from: M0 */
    public int f4913M0;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public final C0230n0 root;

    /* JADX INFO: renamed from: N0 */
    public final C28633k1 f4915N0;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final C0023g0 layoutNodes;

    /* JADX INFO: renamed from: O0 */
    public final C2458w1 f4917O0;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final C21265b rectManager;

    /* JADX INFO: renamed from: P0 */
    public final C30862c f4919P0;

    /* JADX INFO: renamed from: Q */
    public final AndroidComposeView f4920Q;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public final C40001d modifierLocalManager;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public final C18036r semanticsOwner;

    /* JADX INFO: renamed from: R0 */
    public final C2467y0 f4923R0;

    /* JADX INFO: renamed from: S */
    public final C2382h0 f4924S;

    /* JADX INFO: renamed from: S0 */
    public MotionEvent f4925S0;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public ViewOnAttachStateChangeListenerC11482d contentCaptureManager;

    /* JADX INFO: renamed from: T0 */
    public long f4927T0;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final C2381h accessibilityManager;

    /* JADX INFO: renamed from: U0 */
    public final C37199o f4929U0;

    /* JADX INFO: renamed from: V */
    public final C17882f f4930V;

    /* JADX INFO: renamed from: V0 */
    public final C0047q0 f4931V0;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final C3868m autofillTree;

    /* JADX INFO: renamed from: W0 */
    public float f4933W0;

    /* JADX INFO: renamed from: X0 */
    public float f4934X0;

    /* JADX INFO: renamed from: Y0 */
    public final RunnableC1189s f4935Y0;

    /* JADX INFO: renamed from: Z0 */
    public final RunnableC1645z0 f4936Z0;

    /* JADX INFO: renamed from: a0 */
    public final ArrayList f4937a0;

    /* JADX INFO: renamed from: a1 */
    public boolean f4938a1;

    /* JADX INFO: renamed from: b0 */
    public ArrayList f4939b0;

    /* JADX INFO: renamed from: b1 */
    public final C2456w f4940b1;

    /* JADX INFO: renamed from: c0 */
    public boolean f4941c0;

    /* JADX INFO: renamed from: c1 */
    public final InterfaceC2418o1 f4942c1;

    /* JADX INFO: renamed from: d0 */
    public boolean f4943d0;

    /* JADX INFO: renamed from: d1 */
    public boolean f4944d1;

    /* JADX INFO: renamed from: e0 */
    public final C34459g f4945e0;

    /* JADX INFO: renamed from: e1 */
    public final C16794j f4946e1;

    /* JADX INFO: renamed from: f0 */
    public final C23224a f4947f0;

    /* JADX INFO: renamed from: f1 */
    public View f4948f1;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public Function1 configurationChangeObserver;

    /* JADX INFO: renamed from: g1 */
    public final C2461x f4950g1;

    /* JADX INFO: renamed from: h0 */
    public final C3856a f4951h0;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public final C3859d _autofillManager;

    /* JADX INFO: renamed from: j0 */
    public boolean f4953j0;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public final C2391j clipboardManager;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public final C2386i clipboard;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public final C0188c2 snapshotObserver;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public boolean showLayoutBounds;

    /* JADX INFO: renamed from: o0 */
    public C2383h1 f4958o0;

    /* JADX INFO: renamed from: p0 */
    public C39169a f4959p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f4960q0;

    /* JADX INFO: renamed from: r0 */
    public final C0195e1 f4961r0;

    /* JADX INFO: renamed from: s0 */
    public long f4962s0;

    /* JADX INFO: renamed from: t0 */
    public final int[] f4963t0;

    /* JADX INFO: renamed from: u0 */
    public final float[] f4964u0;

    /* JADX INFO: renamed from: v0 */
    public final float[] f4965v0;

    /* JADX INFO: renamed from: w */
    public long f4966w;

    /* JADX INFO: renamed from: w0 */
    public final float[] f4967w0;

    /* JADX INFO: renamed from: x */
    public final boolean f4968x;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public final C0238p0 sharedDrawScope;

    /* JADX INFO: renamed from: y0 */
    public boolean f4971y0;

    /* JADX INFO: renamed from: z */
    public final C28633k1 f4972z;

    /* JADX INFO: renamed from: z0 */
    public long f4973z0;

    /* JADX WARN: Type inference failed for: r4v14, types: [b3.l] */
    /* JADX WARN: Type inference failed for: r4v15, types: [b3.m] */
    public AndroidComposeView(Context context, InterfaceC30063j interfaceC30063j) {
        EnumC39181m enumC39181m;
        super(context);
        this.f4966w = 9205357640488583168L;
        int i13 = 1;
        this.f4968x = true;
        this.sharedDrawScope = new C0238p0();
        C39173e c39173eM113799a = AbstractC35849g.m113799a(context);
        C28676v0 c28676v0 = C28676v0.f115977z;
        this.f4972z = new C28633k1(c39173eM113799a, c28676v0);
        int i14 = Build.VERSION.SDK_INT;
        boolean z4 = i14 >= 35;
        this.f4898F = z4;
        C18023e c18023e = new C18023e();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(c18023e);
        AbstractC0207h1 abstractC0207h1 = new AbstractC0207h1() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // p005a3.AbstractC0207h1
            public final AbstractC2316v create() {
                C2413n1 c2413n1 = new C2413n1();
                c2413n1.f9467O = this.f4974w;
                return c2413n1;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f4974w.hashCode();
            }

            @Override // p005a3.AbstractC0207h1
            public final void inspectableProperties(C2404l2 c2404l2) {
                c2404l2.m7401c("BringIntoViewOnScreen");
            }

            @Override // p005a3.AbstractC0207h1
            public final void update(AbstractC2316v abstractC2316v) {
                ((C2413n1) abstractC2316v).f9467O = this.f4974w;
            }
        };
        this.f4900G = new C15240l(this, this);
        this.coroutineContext = interfaceC30063j;
        this.dragAndDropManager = new ViewOnDragListenerC12586a(new C2436s(3, 0, AndroidComposeView.class, this, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z"));
        this.f4906J = new C2414n2();
        Modifier modifierM3493a = AbstractC1128a.m3493a(C2314t.f9131w, new C2421p(this, i13));
        Modifier modifierM3496a = AbstractC1130a.m3496a();
        this.f4908K = new C17917w();
        this.f4910L = new C2373f1(ViewConfiguration.get(context));
        RunnableC39123q runnableC39123q = new RunnableC39123q();
        this.insetsListener = runnableC39123q;
        int i15 = 3;
        C0230n0 c0230n0 = new C0230n0(3);
        c0230n0.m584D0(C39116n1.f168244b);
        c0230n0.m578A0(getDensity());
        c0230n0.m587F0(getViewConfiguration());
        c0230n0.m586E0(AbstractC1133c.m3505b(runnableC39123q).mo3471e(emptySemanticsElement).mo3471e(modifierM3496a).mo3471e(modifierM3493a).mo3471e(((C15240l) getFocusOwner()).f57243e).mo3471e(getDragAndDropManager().f42967c).mo3471e(abstractC0207h1));
        this.root = c0230n0;
        C0023g0 c0023g0 = AbstractC0052t.f161a;
        this.layoutNodes = new C0023g0();
        m134040getLayoutNodes();
        this.rectManager = new C21265b();
        this.f4920Q = this;
        this.semanticsOwner = new C18036r(getRoot(), c18023e, m134040getLayoutNodes());
        C2382h0 c2382h0 = new C2382h0(this);
        this.f4924S = c2382h0;
        this.contentCaptureManager = new ViewOnAttachStateChangeListenerC11482d(this, new C1833u0(0, this, AbstractC2417o0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 1));
        this.accessibilityManager = new C2381h(context);
        this.f4930V = new C17882f(this);
        this.autofillTree = new C3868m();
        this.f4937a0 = new ArrayList();
        this.f4945e0 = new C34459g();
        C0230n0 root = getRoot();
        C23224a c23224a = new C23224a();
        c23224a.f91958b = root;
        c23224a.f91959c = new C34453d((C1134a) root.f783e0.f740d);
        c23224a.f91960d = new C3632c(27);
        c23224a.f91961e = new C0258v();
        this.f4947f0 = c23224a;
        this.configurationChangeObserver = C2431r.f9522x;
        this.f4951h0 = new C3856a(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw AbstractC2875y.m8310w("Autofill service could not be located.");
        }
        this._autofillManager = new C3859d(new C0783z(autofillManager, i15), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.clipboardManager = new C2391j(context);
        this.clipboard = new C2386i(getClipboardManager());
        int i16 = 2;
        this.snapshotObserver = new C0188c2(new C2421p(this, i16));
        this.f4961r0 = new C0195e1(getRoot());
        long j7 = Integer.MAX_VALUE;
        this.f4962s0 = (j7 & 4294967295L) | (j7 << 32);
        this.f4963t0 = new int[]{0, 0};
        float[] fArrM51471a = C17896l0.m51471a();
        this.f4964u0 = fArrM51471a;
        this.f4965v0 = C17896l0.m51471a();
        this.f4967w0 = C17896l0.m51471a();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.f4973z0 = 9187343241974906880L;
        this.f4892A0 = AbstractC28683x.m87272z(null);
        this.f4893B0 = AbstractC28683x.m87264r(new C2456w(this, i16));
        this.f4895D0 = new ViewTreeObserverOnGlobalLayoutListenerC2396k(this, 0);
        this.f4897E0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: b3.l
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Class cls = AndroidComposeView.f4886h1;
                this.f9452a.m3582O();
            }
        };
        this.f4899F0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: b3.m
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z13) {
                this.f9461w.f4919P0.f127257a.setValue(new C30860a(z13 ? 1 : 2));
            }
        };
        C29863b0 c29863b0 = new C29863b0(getView(), this);
        this.f4901G0 = c29863b0;
        this.textInputService = new C29892z(c29863b0);
        this.f4905I0 = new AtomicReference(null);
        this.f4907J0 = new C2463x1(getTextInputService());
        this.f4909K0 = new C2384h2();
        this.f4911L0 = new C28633k1(AbstractC15751g.m44464q(context), c28676v0);
        this.f4913M0 = i14 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        if (layoutDirection != 0) {
            enumC39181m = layoutDirection != 1 ? null : EnumC39181m.f168424x;
        } else {
            enumC39181m = EnumC39181m.f168423w;
        }
        this.f4915N0 = AbstractC28683x.m87272z(enumC39181m == null ? EnumC39181m.f168423w : enumC39181m);
        this.f4917O0 = new C2458w1(this, i13);
        this.f4919P0 = new C30862c(isInTouchMode() ? 1 : 2, new C2421p(this, 0));
        this.modifierLocalManager = new C40001d(this);
        C2467y0 c2467y0 = new C2467y0();
        new C0627i1(new C0222l0(c2467y0, i15));
        EnumC2350a3[] enumC2350a3Arr = EnumC2350a3.f9290w;
        this.f4923R0 = c2467y0;
        this.f4929U0 = new C37199o(4, false);
        this.f4931V0 = new C0047q0();
        this.f4935Y0 = new RunnableC1189s(this, i13);
        this.f4936Z0 = new RunnableC1645z0(this, i16);
        this.f4940b1 = new C2456w(this, i13);
        this.f4942c1 = i14 < 29 ? new C38445a(fArrM51471a) : new C2423p1();
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        C2412n0.f9466a.m7406a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AbstractC16901p0.m47583n(this, c2382h0);
        setOnDragListener(getDragAndDropManager());
        getRoot().m612c(this);
        if (i14 >= 29) {
            C2387i0.f9437a.m7390a(this);
        }
        if (z4) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.f4896E = view;
            addView(view, -1);
        }
        this.f4946e1 = i14 >= 31 ? new C16794j() : null;
        this.f4950g1 = new C2461x(this);
    }

    /* JADX INFO: renamed from: a */
    public static final void m3560a(AndroidComposeView androidComposeView, int i13, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iM23d;
        C2382h0 c2382h0 = androidComposeView.f4924S;
        if (AbstractC22676k.m65745e(str, c2382h0.f9398G)) {
            int iM23d2 = c2382h0.f9396E.m23d(i13);
            if (iM23d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM23d2);
                return;
            }
            return;
        }
        if (!AbstractC22676k.m65745e(str, c2382h0.f9399H) || (iM23d = c2382h0.f9397F.m23d(i13)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iM23d);
    }

    /* JADX INFO: renamed from: e */
    public static void m3564e(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).m3569A();
            } else if (childAt instanceof ViewGroup) {
                m3564e((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static long m3565f(int i13) {
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j7 = size;
        return j7 | (j7 << 32);
    }

    @InterfaceC23457c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC23457c
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2416o get_viewTreeOwners() {
        return (C2416o) this.f4892A0.getValue();
    }

    /* JADX INFO: renamed from: j */
    public static View m3566j(View view, int i13) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC22676k.m65745e(declaredMethod.invoke(view, null), Integer.valueOf(i13))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View viewM3566j = m3566j(viewGroup.getChildAt(i14), i13);
                    if (viewM3566j != null) {
                        return viewM3566j;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static void m3567o(C0230n0 c0230n0) {
        c0230n0.m599Q();
        C30849c c30849cM595M = c0230n0.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            m3567o((C0230n0) objArr[i14]);
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m3568q(MotionEvent motionEvent) {
        boolean z4 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z4) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i13 = 1; i13 < pointerCount; i13++) {
                z4 = (Float.floatToRawIntBits(motionEvent.getX(i13)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i13)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !C2424p2.f9511a.m7426a(motionEvent, i13));
                if (z4) {
                    break;
                }
            }
        }
        return z4;
    }

    private void setDensity(InterfaceC39171c interfaceC39171c) {
        this.f4972z.setValue(interfaceC39171c);
    }

    private void setFontFamilyResolver(InterfaceC28770h interfaceC28770h) {
        this.f4911L0.setValue(interfaceC28770h);
    }

    private void setLayoutDirection(EnumC39181m enumC39181m) {
        this.f4915N0.setValue(enumC39181m);
    }

    private final void set_viewTreeOwners(C2416o c2416o) {
        this.f4892A0.setValue(c2416o);
    }

    /* JADX INFO: renamed from: A */
    public final void m3569A() {
        if (this.f4953j0) {
            C39973v c39973v = getSnapshotObserver().f608a;
            synchronized (c39973v.f172500g) {
                try {
                    C30849c c30849c = c39973v.f172499f;
                    int i13 = c30849c.f127229y;
                    int i14 = 0;
                    for (int i15 = 0; i15 < i13; i15++) {
                        C39972u c39972u = (C39972u) c30849c.f127227w[i15];
                        c39972u.m128200e();
                        if (!c39972u.f172487f.m132j()) {
                            i14++;
                        } else if (i14 > 0) {
                            Object[] objArr = c30849c.f127227w;
                            objArr[i15 - i14] = objArr[i15];
                        }
                    }
                    int i16 = i13 - i14;
                    Arrays.fill(c30849c.f127227w, i16, i13, (Object) null);
                    c30849c.f127229y = i16;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f4953j0 = false;
        }
        C2383h1 c2383h1 = this.f4958o0;
        if (c2383h1 != null) {
            m3564e(c2383h1);
        }
        C3859d c3859d = this._autofillManager;
        if (c3859d != null) {
            C0026h0 c0026h0 = c3859d.f15794h;
            if (c0026h0.f65d == 0 && c3859d.f15795i) {
                ((AutofillManager) c3859d.f15787a.f2818x).commit();
                c3859d.f15795i = false;
            }
            if (c0026h0.f65d != 0) {
                c3859d.f15795i = true;
            }
        }
        while (this.f4931V0.m105h() && this.f4931V0.m102e(0) != null) {
            int i17 = this.f4931V0.f137b;
            for (int i18 = 0; i18 < i17; i18++) {
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f4931V0.m102e(i18);
                C0047q0 c0047q0 = this.f4931V0;
                if (i18 < 0 || i18 >= c0047q0.f137b) {
                    c0047q0.m110m(i18);
                    throw null;
                }
                Object[] objArr2 = c0047q0.f136a;
                Object obj = objArr2[i18];
                objArr2[i18] = null;
                if (interfaceC4339a != null) {
                    interfaceC4339a.invoke();
                }
            }
            this.f4931V0.m108k(0, i17);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m3570B(C0230n0 c0230n0) {
        C2382h0 c2382h0 = this.f4924S;
        c2382h0.f9392A = true;
        if (c2382h0.m7386v()) {
            c2382h0.m7387w(c0230n0);
        }
        ViewOnAttachStateChangeListenerC11482d viewOnAttachStateChangeListenerC11482d = this.contentCaptureManager;
        viewOnAttachStateChangeListenerC11482d.f36901G = true;
        if (viewOnAttachStateChangeListenerC11482d.m30900e()) {
            viewOnAttachStateChangeListenerC11482d.f36902H.mo32218s(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m3571C(C0230n0 c0230n0, boolean z4, boolean z13, boolean z14) {
        C0230n0 c0230n0M588G;
        C0230n0 c0230n0M588G2;
        C0195e1 c0195e1 = this.f4961r0;
        if (!z4) {
            if (c0195e1.m492p(c0230n0, z13) && z14) {
                m3577I(c0230n0);
                return;
            }
            return;
        }
        C0237p c0237p = c0195e1.f626b;
        if (c0230n0.f759G == null) {
            AbstractC37831a.m121374b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = c0230n0.m646v().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!c0230n0.m648x() || z13) {
                    c0230n0.m620g0();
                    c0230n0.m622h0();
                    if (c0230n0.f793o0) {
                        return;
                    }
                    if ((AbstractC22676k.m65745e(c0230n0.m609a0(), Boolean.TRUE) || C0195e1.m479h(c0230n0)) && ((c0230n0M588G = c0230n0.m588G()) == null || !c0230n0M588G.m648x())) {
                        c0237p.m697b(c0230n0, EnumC0267y.f912w);
                    } else if ((c0230n0.m606Y() || C0195e1.m480i(c0230n0)) && ((c0230n0M588G2 = c0230n0.m588G()) == null || !c0230n0M588G2.m577A())) {
                        c0237p.m697b(c0230n0, EnumC0267y.f914y);
                    }
                    if (c0195e1.f628d || !z14) {
                        return;
                    }
                    m3577I(c0230n0);
                    return;
                }
                return;
            }
        }
        c0195e1.f632h.m94885b(new C0191d1(c0230n0, true, z13));
    }

    /* JADX INFO: renamed from: D */
    public final void m3572D(C0230n0 c0230n0, boolean z4, boolean z13) {
        C0195e1 c0195e1 = this.f4961r0;
        if (!z4) {
            c0195e1.getClass();
            int iOrdinal = c0230n0.m646v().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            C0230n0 c0230n0M588G = c0230n0.m588G();
            boolean z14 = c0230n0M588G == null || c0230n0M588G.m606Y();
            if (!z13) {
                if (c0230n0.m577A()) {
                    return;
                }
                if (c0230n0.m644u() && c0230n0.m606Y() == z14 && c0230n0.m606Y() == c0230n0.m607Z()) {
                    return;
                }
            }
            c0230n0.m616e0();
            if (!c0230n0.f793o0 && c0230n0.m607Z() && z14) {
                if ((c0230n0M588G == null || !c0230n0M588G.m644u()) && (c0230n0M588G == null || !c0230n0M588G.m577A())) {
                    c0195e1.f626b.m697b(c0230n0, EnumC0267y.f915z);
                }
                if (c0195e1.f628d) {
                    return;
                }
                m3577I(null);
                return;
            }
            return;
        }
        C0237p c0237p = c0195e1.f626b;
        int iOrdinal2 = c0230n0.m646v().ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if ((c0230n0.m648x() || c0230n0.m647w()) && !z13) {
            return;
        }
        c0230n0.m618f0();
        c0230n0.m616e0();
        if (c0230n0.f793o0) {
            return;
        }
        C0230n0 c0230n0M588G2 = c0230n0.m588G();
        if (AbstractC22676k.m65745e(c0230n0.m609a0(), Boolean.TRUE) && ((c0230n0M588G2 == null || !c0230n0M588G2.m648x()) && (c0230n0M588G2 == null || !c0230n0M588G2.m647w()))) {
            c0237p.m697b(c0230n0, EnumC0267y.f913x);
        } else if (c0230n0.m606Y() && ((c0230n0M588G2 == null || !c0230n0M588G2.m644u()) && (c0230n0M588G2 == null || !c0230n0M588G2.m577A()))) {
            c0237p.m697b(c0230n0, EnumC0267y.f915z);
        }
        if (c0195e1.f628d) {
            return;
        }
        m3577I(null);
    }

    /* JADX INFO: renamed from: E */
    public final void m3573E() {
        C2382h0 c2382h0 = this.f4924S;
        c2382h0.f9392A = true;
        if (c2382h0.m7386v() && !c2382h0.f9403L) {
            c2382h0.f9403L = true;
            c2382h0.f9416l.post(c2382h0.f9405N);
        }
        ViewOnAttachStateChangeListenerC11482d viewOnAttachStateChangeListenerC11482d = this.contentCaptureManager;
        viewOnAttachStateChangeListenerC11482d.f36901G = true;
        if (!viewOnAttachStateChangeListenerC11482d.m30900e() || viewOnAttachStateChangeListenerC11482d.f36908N) {
            return;
        }
        viewOnAttachStateChangeListenerC11482d.f36908N = true;
        viewOnAttachStateChangeListenerC11482d.f36903I.post(viewOnAttachStateChangeListenerC11482d.f36909O);
    }

    /* JADX INFO: renamed from: F */
    public final void m3574F() {
        if (this.f4971y0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            InterfaceC2418o1 interfaceC2418o1 = this.f4942c1;
            float[] fArr = this.f4965v0;
            interfaceC2418o1.mo7425h(this, fArr);
            AbstractC2417o0.m7421m(fArr, this.f4967w0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f4963t0;
            view.getLocationOnScreen(iArr);
            float f13 = iArr[0];
            float f14 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f4973z0 = (((long) Float.floatToRawIntBits(f13 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f14 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m3575G(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC2418o1 interfaceC2418o1 = this.f4942c1;
        float[] fArr = this.f4965v0;
        interfaceC2418o1.mo7425h(this, fArr);
        AbstractC2417o0.m7421m(fArr, this.f4967w0);
        float x3 = motionEvent.getX();
        float y13 = motionEvent.getY();
        long jM51472b = C17896l0.m51472b((((long) Float.floatToRawIntBits(x3)) << 32) | (((long) Float.floatToRawIntBits(y13)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM51472b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM51472b & 4294967295L));
        this.f4973z0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m3576H() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    /* JADX INFO: renamed from: I */
    public final void m3577I(C0230n0 c0230n0) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c0230n0 != null) {
            while (c0230n0 != null && c0230n0.m579B() == EnumC0214j0.f713w) {
                if (!this.f4960q0) {
                    C0230n0 c0230n0M588G = c0230n0.m588G();
                    if (c0230n0M588G == null) {
                        break;
                    }
                    long j7 = ((C1134a) c0230n0M588G.f783e0.f740d).f168214z;
                    if (C39169a.m124763g(j7) && C39169a.m124762f(j7)) {
                        break;
                    }
                }
                c0230n0 = c0230n0.m588G();
            }
            if (c0230n0 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: K */
    public final long m3578K(long j7) {
        m3574F();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat((int) (this.f4973z0 >> 32));
        return C17896l0.m51472b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) - Float.intBitsToFloat((int) (this.f4973z0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f4967w0);
    }

    /* JADX INFO: renamed from: L */
    public final int m3579L(MotionEvent motionEvent) {
        Object obj;
        if (this.f4944d1) {
            this.f4944d1 = false;
            int metaState = motionEvent.getMetaState();
            this.f4906J.getClass();
            C28633k1 c28633k1 = AbstractC2415n3.f9471a;
            AbstractC20301a.m56303B().setValue(new C34480z(metaState));
        }
        C34459g c34459g = this.f4945e0;
        C32800q c32800qM108927a = c34459g.m108927a(motionEvent, this);
        C23224a c23224a = this.f4947f0;
        if (c32800qM108927a == null) {
            if (!c23224a.f91957a) {
                ((C0062y) ((C3632c) c23224a.f91960d).f14788w).m149a();
                ((C34453d) c23224a.f91959c).m108908c();
            }
            return AbstractC34454d0.m108910a(false, false, false);
        }
        List listM102861e = c32800qM108927a.m102861e();
        int size = listM102861e.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i13 = size - 1;
            obj = listM102861e.get(size);
            if (((C34474t) obj).m108960a()) {
                break;
            }
            if (i13 < 0) {
                obj = null;
                break;
            }
            size = i13;
        }
        C34474t c34474t = (C34474t) obj;
        if (c34474t != null) {
            this.f4966w = c34474t.m108964e();
        }
        int iM67206a = c23224a.m67206a(c32800qM108927a, this, m3588r(motionEvent));
        c32800qM108927a.m102863g();
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iM67206a & 1) != 0) {
            return iM67206a;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c34459g.f144769c.delete(pointerId);
        c34459g.f144768b.delete(pointerId);
        return iM67206a;
    }

    /* JADX INFO: renamed from: M */
    public final void m3580M(MotionEvent motionEvent, int i13, long j7, boolean z4) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i13 != 9 && i13 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i14 = 0; i14 < pointerCount; i14++) {
            pointerPropertiesArr[i14] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i15 = 0; i15 < pointerCount; i15++) {
            pointerCoordsArr[i15] = new MotionEvent.PointerCoords();
        }
        int i16 = 0;
        while (i16 < pointerCount) {
            int i17 = ((actionIndex < 0 || i16 < actionIndex) ? 0 : 1) + i16;
            motionEvent.getPointerProperties(i17, pointerPropertiesArr[i16]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i16];
            motionEvent.getPointerCoords(i17, pointerCoords);
            float f13 = pointerCoords.x;
            long jM3591v = m3591v((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jM3591v >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jM3591v & 4294967295L));
            i16++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j7 : motionEvent.getDownTime(), j7, i13, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z4 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C32800q c32800qM108927a = this.f4945e0.m108927a(motionEventObtain, this);
        AbstractC22676k.m65747g(c32800qM108927a);
        this.f4947f0.m67206a(c32800qM108927a, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: N */
    public final void m3581N(InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        C2470z c2470z;
        if (abstractC32269c instanceof C2470z) {
            c2470z = (C2470z) abstractC32269c;
            int i13 = c2470z.f9623y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2470z.f9623y = i13 - Integer.MIN_VALUE;
            } else {
                c2470z = new C2470z(this, abstractC32269c);
            }
        } else {
            c2470z = new C2470z(this, abstractC32269c);
        }
        Object obj = c2470z.f9621w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c2470z.f9623y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C0006a1 c0006a1 = new C0006a1(this, 7);
            c2470z.f9623y = 1;
            if (AbstractC3006f0.m8719m(new C2319y(c0006a1, this.f4905I0, interfaceC4351m, (InterfaceC30057d) null), c2470z) == enumC31071a) {
                return;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX INFO: renamed from: O */
    public final void m3582O() {
        boolean z4;
        boolean z13;
        int[] iArr = this.f4963t0;
        getLocationOnScreen(iArr);
        long j7 = this.f4962s0;
        int i13 = (int) (j7 >> 32);
        int i14 = (int) (j7 & 4294967295L);
        int i15 = iArr[0];
        if (i13 == i15 && i14 == iArr[1] && this.lastMatrixRecalculationAnimationTime >= 0) {
            z4 = false;
        } else {
            this.f4962s0 = (((long) i15) << 32) | (((long) iArr[1]) & 4294967295L);
            if (i13 == Integer.MAX_VALUE || i14 == Integer.MAX_VALUE) {
                z4 = false;
            } else {
                getRoot().m643t().f854p.m525H0();
                z4 = true;
            }
        }
        m3574F();
        View rootView = this.f4948f1;
        if (rootView == null) {
            rootView = getRootView();
            this.f4948f1 = rootView;
        }
        C21265b rectManager = getRectManager();
        long j13 = this.f4962s0;
        long jM115291C = AbstractC36220b.m115291C(this.f4973z0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.f4965v0;
        int iM60676d = AbstractC21598x.m60676d(fArr);
        C21268e c21268e = rectManager.f81184b;
        if ((iM60676d & 2) != 0) {
            fArr = null;
        }
        if (C39178j.m124792b(jM115291C, c21268e.f81211d)) {
            z13 = false;
        } else {
            c21268e.f81211d = jM115291C;
            z13 = true;
        }
        if (!C39178j.m124792b(j13, c21268e.f81212e)) {
            c21268e.f81212e = j13;
            z13 = true;
        }
        if (fArr != null) {
            c21268e.f81214g = fArr;
            z13 = true;
        }
        long j14 = (((long) width) << 32) | (((long) height) & 4294967295L);
        if (j14 != c21268e.f81213f) {
            c21268e.f81213f = j14;
            z13 = true;
        }
        rectManager.f81187e = z13 || rectManager.f81187e;
        this.f4961r0.m481a(z4);
        getRectManager().m59668b();
    }

    /* JADX INFO: renamed from: P */
    public final void m3583P(float f13) {
        if (this.f4898F) {
            if (f13 > 0.0f) {
                if (Float.isNaN(this.f4933W0) || f13 > this.f4933W0) {
                    this.f4933W0 = f13;
                    return;
                }
                return;
            }
            if (f13 < 0.0f) {
                if (Float.isNaN(this.f4934X0) || f13 < this.f4934X0) {
                    this.f4934X0 = f13;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C18030l c18030lM591I;
        Function1 function1;
        C3859d c3859d = this._autofillManager;
        if (c3859d != null) {
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int iKeyAt = sparseArray.keyAt(i13);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                if (C3864i.m11848e(autofillValue)) {
                    C0230n0 c0230n0 = (C0230n0) c3859d.f15788b.f69997c.m121b(iKeyAt);
                    if (c0230n0 != null && (c18030lM591I = c0230n0.m591I()) != null) {
                        Object objM129g = c18030lM591I.f69980w.m129g(AbstractC18029k.f69960g);
                        if (objM129g == null) {
                            objM129g = null;
                        }
                        C18017a c18017a = (C18017a) objM129g;
                        if (c18017a != null && (function1 = (Function1) c18017a.f69929b) != null) {
                        }
                    }
                } else if (C3864i.m11846c(autofillValue)) {
                    Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                } else if (C3864i.m11847d(autofillValue)) {
                    Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                } else if (C3864i.m11849f(autofillValue)) {
                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                }
            }
        }
        C3856a c3856a = this.f4951h0;
        if (c3856a != null) {
            AbstractC37978j.m121634R(c3856a, sparseArray);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i13) {
        return this.f4924S.m7378m(i13, this.f4966w, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i13) {
        return this.f4924S.m7378m(i13, this.f4966w, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws Throwable {
        if (!isAttachedToWindow()) {
            m3567o(getRoot());
        }
        m3592w(true);
        AbstractC39963l.m128171k().mo128125m();
        this.f4941c0 = true;
        C17917w c17917w = this.f4908K;
        C17873c c17873c = c17917w.f69620a;
        Canvas canvas2 = c17873c.f69556a;
        c17873c.f69556a = canvas;
        getRoot().m627k(c17873c, null);
        c17917w.f69620a.f69556a = canvas2;
        ArrayList arrayList = this.f4937a0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((C2374f2) ((InterfaceC0180a2) arrayList.get(i13))).m7312g();
            }
        }
        int i14 = AbstractC2405l3.f9460w;
        arrayList.clear();
        this.f4941c0 = false;
        ArrayList arrayList2 = this.f4939b0;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.f4898F) {
            AbstractC2393j1.m7395a(this, this.f4933W0);
            View view = this.f4896E;
            if (view == null) {
                AbstractC22676k.m65757q("frameRateCategoryView");
                throw null;
            }
            AbstractC2393j1.m7395a(view, this.f4934X0);
            if (!Float.isNaN(this.f4934X0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.f4933W0 = Float.NaN;
            this.f4934X0 = Float.NaN;
        }
        getRectManager().m59668b();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C0223l1 c0223l1;
        C36706a c36706a;
        int size;
        C0223l1 c0223l2;
        AbstractC2316v abstractC2316vM504d;
        C0223l1 c0223l3;
        if (this.f4938a1) {
            RunnableC1645z0 runnableC1645z0 = this.f4936Z0;
            removeCallbacks(runnableC1645z0);
            if (motionEvent.getActionMasked() == 8) {
                this.f4938a1 = false;
            } else {
                runnableC1645z0.run();
            }
        }
        if (m3568q(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x3 = motionEvent.getX();
                float y13 = motionEvent.getY();
                Float.floatToRawIntBits(x3);
                Float.floatToRawIntBits(y13);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                C15240l c15240l = (C15240l) getFocusOwner();
                if (c15240l.f57242d.f57237e) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    C15252x c15252xM43318h = AbstractC15235g.m43318h(c15240l.f57241c);
                    if (c15252xM43318h != null) {
                        if (!c15252xM43318h.f9142w.f9141N) {
                            AbstractC37831a.m121374b("visitAncestors called on an unattached node");
                        }
                        AbstractC2316v abstractC2316v = c15252xM43318h.f9142w;
                        C0230n0 c0230n0M516p = AbstractC0201g.m516p(c15252xM43318h);
                        while (c0230n0M516p != null) {
                            if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & 2097152) != 0) {
                                while (abstractC2316v != null) {
                                    if ((abstractC2316v.f9144y & 2097152) != 0) {
                                        AbstractC2316v abstractC2316vM504d2 = abstractC2316v;
                                        C30849c c30849c = null;
                                        while (abstractC2316vM504d2 != null) {
                                            if ((abstractC2316vM504d2.f9144y & 2097152) != 0 && (abstractC2316vM504d2 instanceof AbstractC0233o)) {
                                                int i13 = 0;
                                                for (AbstractC2316v abstractC2316v2 = ((AbstractC0233o) abstractC2316vM504d2).f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
                                                    if ((abstractC2316v2.f9144y & 2097152) != 0) {
                                                        i13++;
                                                        if (i13 == 1) {
                                                            abstractC2316vM504d2 = abstractC2316v2;
                                                        } else {
                                                            if (c30849c == null) {
                                                                c30849c = new C30849c(new AbstractC2316v[16]);
                                                            }
                                                            if (abstractC2316vM504d2 != null) {
                                                                c30849c.m94885b(abstractC2316vM504d2);
                                                                abstractC2316vM504d2 = null;
                                                            }
                                                            c30849c.m94885b(abstractC2316v2);
                                                        }
                                                    }
                                                }
                                                if (i13 == 1) {
                                                }
                                            }
                                            abstractC2316vM504d2 = AbstractC0201g.m504d(c30849c);
                                        }
                                    }
                                    abstractC2316v = abstractC2316v.f9132E;
                                }
                            }
                            c0230n0M516p = c0230n0M516p.m588G();
                            abstractC2316v = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (m3586n(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        getContext();
        AbstractC36259c.m115675T(viewConfiguration);
        getContext();
        AbstractC36259c.m115674M(viewConfiguration);
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        InterfaceC15239k focusOwner = getFocusOwner();
        C0271z0 c0271z0 = new C0271z0(2, this, motionEvent);
        C15240l c15240l2 = (C15240l) focusOwner;
        if (c15240l2.f57242d.f57237e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        C15252x c15252xM43318h2 = AbstractC15235g.m43318h(c15240l2.f57241c);
        if (c15252xM43318h2 != null) {
            if (!c15252xM43318h2.f9142w.f9141N) {
                AbstractC37831a.m121374b("visitAncestors called on an unattached node");
            }
            AbstractC2316v abstractC2316v3 = c15252xM43318h2.f9142w;
            C0230n0 c0230n0M516p2 = AbstractC0201g.m516p(c15252xM43318h2);
            loop0: while (true) {
                if (c0230n0M516p2 == null) {
                    abstractC2316vM504d = null;
                    break;
                }
                if ((((AbstractC2316v) c0230n0M516p2.f783e0.f743g).f9145z & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
                    while (abstractC2316v3 != null) {
                        if ((abstractC2316v3.f9144y & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
                            abstractC2316vM504d = abstractC2316v3;
                            C30849c c30849c2 = null;
                            while (abstractC2316vM504d != null) {
                                if (abstractC2316vM504d instanceof C36706a) {
                                    break loop0;
                                }
                                if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_CONNECTION_MASK) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                    int i14 = 0;
                                    for (AbstractC2316v abstractC2316v4 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v4 != null; abstractC2316v4 = abstractC2316v4.f9133F) {
                                        if ((abstractC2316v4.f9144y & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                abstractC2316vM504d = abstractC2316v4;
                                            } else {
                                                if (c30849c2 == null) {
                                                    c30849c2 = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (abstractC2316vM504d != null) {
                                                    c30849c2.m94885b(abstractC2316vM504d);
                                                    abstractC2316vM504d = null;
                                                }
                                                c30849c2.m94885b(abstractC2316v4);
                                            }
                                        }
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                abstractC2316vM504d = AbstractC0201g.m504d(c30849c2);
                            }
                        }
                        abstractC2316v3 = abstractC2316v3.f9132E;
                    }
                }
                c0230n0M516p2 = c0230n0M516p2.m588G();
                abstractC2316v3 = (c0230n0M516p2 == null || (c0223l3 = c0230n0M516p2.f783e0) == null) ? null : (C0224l2) c0223l3.f742f;
            }
            c36706a = (C36706a) abstractC2316vM504d;
        } else {
            c36706a = null;
        }
        if (c36706a != null) {
            C36706a c36706a2 = c36706a;
            if (!c36706a2.f9142w.f9141N) {
                AbstractC37831a.m121374b("visitAncestors called on an unattached node");
            }
            AbstractC2316v abstractC2316v5 = c36706a2.f9142w.f9132E;
            C0230n0 c0230n0M516p3 = AbstractC0201g.m516p(c36706a);
            ArrayList arrayList = null;
            while (c0230n0M516p3 != null) {
                if ((((AbstractC2316v) c0230n0M516p3.f783e0.f743g).f9145z & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
                    while (abstractC2316v5 != null) {
                        if ((abstractC2316v5.f9144y & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
                            AbstractC2316v abstractC2316vM504d3 = abstractC2316v5;
                            C30849c c30849c3 = null;
                            while (abstractC2316vM504d3 != null) {
                                if (abstractC2316vM504d3 instanceof C36706a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC2316vM504d3);
                                } else if ((abstractC2316vM504d3.f9144y & DfuBaseService.ERROR_CONNECTION_MASK) != 0 && (abstractC2316vM504d3 instanceof AbstractC0233o)) {
                                    int i15 = 0;
                                    for (AbstractC2316v abstractC2316v6 = ((AbstractC0233o) abstractC2316vM504d3).f804P; abstractC2316v6 != null; abstractC2316v6 = abstractC2316v6.f9133F) {
                                        if ((abstractC2316v6.f9144y & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                abstractC2316vM504d3 = abstractC2316v6;
                                            } else {
                                                if (c30849c3 == null) {
                                                    c30849c3 = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (abstractC2316vM504d3 != null) {
                                                    c30849c3.m94885b(abstractC2316vM504d3);
                                                    abstractC2316vM504d3 = null;
                                                }
                                                c30849c3.m94885b(abstractC2316v6);
                                            }
                                        }
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                abstractC2316vM504d3 = AbstractC0201g.m504d(c30849c3);
                            }
                        }
                        abstractC2316v5 = abstractC2316v5.f9132E;
                    }
                }
                c0230n0M516p3 = c0230n0M516p3.m588G();
                abstractC2316v5 = (c0230n0M516p3 == null || (c0223l2 = c0230n0M516p3.f783e0) == null) ? null : (C0224l2) c0223l2.f742f;
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i16 = size - 1;
                    ((C36706a) arrayList.get(size)).getClass();
                    if (i16 < 0) {
                        break;
                    }
                    size = i16;
                }
            }
            AbstractC2316v abstractC2316vM504d4 = c36706a2.f9142w;
            C30849c c30849c4 = null;
            while (abstractC2316vM504d4 != null) {
                if (abstractC2316vM504d4 instanceof C36706a) {
                } else if ((abstractC2316vM504d4.f9144y & DfuBaseService.ERROR_CONNECTION_MASK) != 0 && (abstractC2316vM504d4 instanceof AbstractC0233o)) {
                    int i17 = 0;
                    for (AbstractC2316v abstractC2316v7 = ((AbstractC0233o) abstractC2316vM504d4).f804P; abstractC2316v7 != null; abstractC2316v7 = abstractC2316v7.f9133F) {
                        if ((abstractC2316v7.f9144y & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
                            i17++;
                            if (i17 == 1) {
                                abstractC2316vM504d4 = abstractC2316v7;
                            } else {
                                if (c30849c4 == null) {
                                    c30849c4 = new C30849c(new AbstractC2316v[16]);
                                }
                                if (abstractC2316vM504d4 != null) {
                                    c30849c4.m94885b(abstractC2316vM504d4);
                                    abstractC2316vM504d4 = null;
                                }
                                c30849c4.m94885b(abstractC2316v7);
                            }
                        }
                    }
                    if (i17 == 1) {
                    }
                }
                abstractC2316vM504d4 = AbstractC0201g.m504d(c30849c4);
            }
            if (!((Boolean) c0271z0.invoke()).booleanValue()) {
                AbstractC2316v abstractC2316vM504d5 = c36706a2.f9142w;
                C30849c c30849c5 = null;
                while (abstractC2316vM504d5 != null) {
                    if (abstractC2316vM504d5 instanceof C36706a) {
                    } else if ((abstractC2316vM504d5.f9144y & DfuBaseService.ERROR_CONNECTION_MASK) != 0 && (abstractC2316vM504d5 instanceof AbstractC0233o)) {
                        int i18 = 0;
                        for (AbstractC2316v abstractC2316v8 = ((AbstractC0233o) abstractC2316vM504d5).f804P; abstractC2316v8 != null; abstractC2316v8 = abstractC2316v8.f9133F) {
                            if ((abstractC2316v8.f9144y & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
                                i18++;
                                if (i18 == 1) {
                                    abstractC2316vM504d5 = abstractC2316v8;
                                } else {
                                    if (c30849c5 == null) {
                                        c30849c5 = new C30849c(new AbstractC2316v[16]);
                                    }
                                    if (abstractC2316vM504d5 != null) {
                                        c30849c5.m94885b(abstractC2316vM504d5);
                                        abstractC2316vM504d5 = null;
                                    }
                                    c30849c5.m94885b(abstractC2316v8);
                                }
                            }
                        }
                        if (i18 == 1) {
                        }
                    }
                    abstractC2316vM504d5 = AbstractC0201g.m504d(c30849c5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        C2431r c2431r = ((C36706a) arrayList.get(i19)).f157184O;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x015c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0163 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i13;
        boolean z4 = this.f4938a1;
        RunnableC1645z0 runnableC1645z0 = this.f4936Z0;
        if (z4) {
            removeCallbacks(runnableC1645z0);
            runnableC1645z0.run();
        }
        if (!m3568q(motionEvent) && isAttachedToWindow()) {
            C2382h0 c2382h0 = this.f4924S;
            AndroidComposeView androidComposeView = c2382h0.f9408d;
            AccessibilityManager accessibilityManager = c2382h0.f9411g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x3 = motionEvent.getX();
                    float y13 = motionEvent.getY();
                    androidComposeView.m3592w(true);
                    C0258v c0258v = new C0258v();
                    C0230n0 root = androidComposeView.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x3)) << 32) | (((long) Float.floatToRawIntBits(y13)) & 4294967295L);
                    C0223l1 c0223l1 = root.f783e0;
                    NodeCoordinator nodeCoordinator = (NodeCoordinator) c0223l1.f741e;
                    C17920x0 c17920x0 = NodeCoordinator.f4853k0;
                    ((NodeCoordinator) c0223l1.f741e).m3539l1(NodeCoordinator.f4857o0, nodeCoordinator.m3529d1(jFloatToRawIntBits), c0258v, 1, true);
                    int iM118951C = AbstractC37056f.m118951C(c0258v);
                    while (true) {
                        if (-1 < iM118951C) {
                            Object objM102e = c0258v.f881w.m102e(iM118951C);
                            AbstractC22676k.m65748h(objM102e, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                            C0230n0 c0230n0M516p = AbstractC0201g.m516p((AbstractC2316v) objM102e);
                            if (androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(c0230n0M516p) == null) {
                                if (c0230n0M516p.f783e0.m560j(8)) {
                                    int iM7364A = c2382h0.m7364A(c0230n0M516p.f795x);
                                    C18034p c18034pM51796a = AbstractC18037s.m51796a(c0230n0M516p, false);
                                    if (AbstractC18037s.m51801f(c18034pM51796a)) {
                                        if (!c18034pM51796a.m51786k().f69980w.m125c(AbstractC18039u.f70059z)) {
                                            i13 = iM7364A;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                iM118951C--;
                            }
                        }
                        i13 = Integer.MIN_VALUE;
                        break;
                    }
                    androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i14 = c2382h0.f9409e;
                    if (i14 != i13) {
                        c2382h0.f9409e = i13;
                        C2382h0.m7355E(c2382h0, i13, 128, null, 12);
                        C2382h0.m7355E(c2382h0, i14, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i15 = c2382h0.f9409e;
                    if (i15 == Integer.MIN_VALUE) {
                        androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i15 != Integer.MIN_VALUE) {
                        c2382h0.f9409e = Integer.MIN_VALUE;
                        C2382h0.m7355E(c2382h0, Integer.MIN_VALUE, 128, null, 12);
                        C2382h0.m7355E(c2382h0, i15, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && m3588r(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f4925S0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f4925S0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f4938a1 = true;
                        postDelayed(runnableC1645z0, 8L);
                        return false;
                    }
                } else if ((m3586n(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (m3589t(motionEvent)) {
                if ((m3586n(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i13 = 1;
        if (!isFocused()) {
            return ((C15240l) getFocusOwner()).m43343f(keyEvent, new C0271z0(i13, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f4906J.getClass();
        C28633k1 c28633k1 = AbstractC2415n3.f9471a;
        AbstractC20301a.m56303B().setValue(new C34480z(metaState));
        return ((C15240l) getFocusOwner()).m43343f(keyEvent, C15238j.f57238w) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0223l1 c0223l1;
        if (isFocused()) {
            C15240l c15240l = (C15240l) getFocusOwner();
            if (c15240l.f57242d.f57237e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C15252x c15252xM43318h = AbstractC15235g.m43318h(c15240l.f57241c);
                if (c15252xM43318h != null) {
                    if (!c15252xM43318h.f9142w.f9141N) {
                        AbstractC37831a.m121374b("visitAncestors called on an unattached node");
                    }
                    AbstractC2316v abstractC2316v = c15252xM43318h.f9142w;
                    C0230n0 c0230n0M516p = AbstractC0201g.m516p(c15252xM43318h);
                    while (c0230n0M516p != null) {
                        if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
                            while (abstractC2316v != null) {
                                if ((abstractC2316v.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
                                    AbstractC2316v abstractC2316vM504d = abstractC2316v;
                                    C30849c c30849c = null;
                                    while (abstractC2316vM504d != null) {
                                        if ((abstractC2316vM504d.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                            int i13 = 0;
                                            for (AbstractC2316v abstractC2316v2 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
                                                if ((abstractC2316v2.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
                                                        abstractC2316vM504d = abstractC2316v2;
                                                    } else {
                                                        if (c30849c == null) {
                                                            c30849c = new C30849c(new AbstractC2316v[16]);
                                                        }
                                                        if (abstractC2316vM504d != null) {
                                                            c30849c.m94885b(abstractC2316vM504d);
                                                            abstractC2316vM504d = null;
                                                        }
                                                        c30849c.m94885b(abstractC2316v2);
                                                    }
                                                }
                                            }
                                            if (i13 == 1) {
                                            }
                                        }
                                        abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                                    }
                                }
                                abstractC2316v = abstractC2316v.f9132E;
                            }
                        }
                        c0230n0M516p = c0230n0M516p.m588G();
                        abstractC2316v = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f4938a1) {
            RunnableC1645z0 runnableC1645z0 = this.f4936Z0;
            removeCallbacks(runnableC1645z0);
            MotionEvent motionEvent2 = this.f4925S0;
            AbstractC22676k.m65747g(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f4938a1 = false;
            } else {
                runnableC1645z0.run();
            }
        }
        if (!m3568q(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || m3589t(motionEvent))) {
            int iM3586n = m3586n(motionEvent);
            if ((iM3586n & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iM3586n & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return m3566j(this, accessibilityId);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i13) {
        C16618c c16618cM60688l;
        if (view == null || this.f4961r0.f627c) {
            return super.focusSearch(view, i13);
        }
        C1956b c1956b = C2364d2.f9330f;
        View viewM7289b = AbstractC11894a.m31933A().m7289b(i13, view, this);
        if (view == this) {
            C15252x c15252xM43318h = AbstractC15235g.m43318h(((C15240l) getFocusOwner()).f57241c);
            c16618cM60688l = c15252xM43318h != null ? AbstractC15235g.m43321k(c15252xM43318h) : null;
            if (c16618cM60688l == null) {
                c16618cM60688l = AbstractC21598x.m60688l(view, this);
            }
        } else {
            c16618cM60688l = AbstractC21598x.m60688l(view, this);
        }
        C15232d c15232dM60707v0 = AbstractC21598x.m60707v0(i13);
        int iM43300d = c15232dM60707v0 != null ? c15232dM60707v0.m43300d() : 6;
        C22669g0 c22669g0 = new C22669g0();
        if (((C15240l) getFocusOwner()).m43344g(iM43300d, c16618cM60688l, new C2441t(c22669g0, 0)) != null) {
            if (c22669g0.f89336w != null) {
                if (viewM7289b != null) {
                    if (AbstractC15235g.m43332v(iM43300d)) {
                        return super.focusSearch(view, i13);
                    }
                    if (AbstractC15235g.m43333w(AbstractC15235g.m43321k((C15252x) c22669g0.f89336w), AbstractC21598x.m60688l(viewM7289b, this), c16618cM60688l, iM43300d)) {
                    }
                }
                return this;
            }
            if (viewM7289b == null) {
            }
            return viewM7289b;
        }
        return view;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0180a2 m3584g(InterfaceC4351m interfaceC4351m, C0235o1 c0235o1, C23226c c23226c) {
        C30849c c30849c;
        Reference referencePoll;
        Object obj;
        if (c23226c != null) {
            return new C2374f2(c23226c, null, this, interfaceC4351m, c0235o1);
        }
        do {
            C37199o c37199o = this.f4929U0;
            ReferenceQueue referenceQueue = (ReferenceQueue) c37199o.f159041x;
            c30849c = (C30849c) c37199o.f159040w;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                c30849c.m94893k(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i13 = c30849c.f127229y;
            if (i13 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) c30849c.m94894l(i13 - 1)).get();
        } while (obj == null);
        InterfaceC0180a2 interfaceC0180a2 = (InterfaceC0180a2) obj;
        if (interfaceC0180a2 == null) {
            return new C2374f2(getGraphicsContext().mo51440a(), getGraphicsContext(), this, interfaceC4351m, c0235o1);
        }
        C2374f2 c2374f2 = (C2374f2) interfaceC0180a2;
        InterfaceC17883f0 interfaceC17883f0 = c2374f2.f9378x;
        if (interfaceC17883f0 == null) {
            throw AbstractC2875y.m8310w("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!c2374f2.f9377w.f91983s) {
            AbstractC37831a.m121373a("layer should have been released before reuse");
        }
        c2374f2.f9377w = interfaceC17883f0.mo51440a();
        c2374f2.f9362G = false;
        c2374f2.f9380z = interfaceC4351m;
        c2374f2.f9360E = c0235o1;
        c2374f2.f9372Q = false;
        c2374f2.f9373R = false;
        c2374f2.f9374S = true;
        C17896l0.m51474d(c2374f2.f9363H);
        float[] fArr = c2374f2.f9364I;
        if (fArr != null) {
            C17896l0.m51474d(fArr);
        }
        c2374f2.f9370O = C17881e1.f69566b;
        c2374f2.f9375T = false;
        long j7 = Integer.MAX_VALUE;
        c2374f2.f9361F = (j7 & 4294967295L) | (j7 << 32);
        c2374f2.f9371P = null;
        c2374f2.f9369N = 0;
        return interfaceC0180a2;
    }

    public final C2383h1 getAndroidViewsHandler$ui_release() {
        if (this.f4958o0 == null) {
            C2383h1 c2383h1 = new C2383h1(getContext());
            this.f4958o0 = c2383h1;
            addView(c2383h1, -1);
            requestLayout();
        }
        C2383h1 c2383h2 = this.f4958o0;
        AbstractC22676k.m65747g(c2383h2);
        return c2383h2;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC3863h getAutofill() {
        return this.f4951h0;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public AbstractC3866k getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public C3868m getAutofillTree() {
        return this.autofillTree;
    }

    public final Function1 getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    /* JADX INFO: renamed from: getContentCaptureManager$ui_release, reason: from getter */
    public final ViewOnAttachStateChangeListenerC11482d getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC30063j getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC39171c getDensity() {
        return (InterfaceC39171c) this.f4972z.getValue();
    }

    @Override // p164g2.InterfaceC15229a0
    public C16618c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            C15252x c15252xM43318h = AbstractC15235g.m43318h(((C15240l) getFocusOwner()).f57241c);
            if (c15252xM43318h != null) {
                return AbstractC15235g.m43321k(c15252xM43318h);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return AbstractC21598x.m60688l(viewFindFocus, this);
        }
        return null;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC15239k getFocusOwner() {
        return this.f4900G;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C16618c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f63939a);
            rect.top = Math.round(embeddedViewFocusRect.f63940b);
            rect.right = Math.round(embeddedViewFocusRect.f63941c);
            rect.bottom = Math.round(embeddedViewFocusRect.f63942d);
            return;
        }
        if (AbstractC22676k.m65745e(((C15240l) getFocusOwner()).m43344g(6, null, C2446u.f9551w), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC28770h getFontFamilyResolver() {
        return (InterfaceC28770h) this.f4911L0.getValue();
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC28769g getFontLoader() {
        return this.f4909K0;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC17883f0 getGraphicsContext() {
        return this.f4930V;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC29805a getHapticFeedBack() {
        return this.f4917O0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f4961r0.f626b.m673D();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC30861b getInputModeManager() {
        return this.f4919P0;
    }

    public final RunnableC39123q getInsetsListener() {
        return this.insetsListener;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.p018ui.node.Owner
    public EnumC39181m getLayoutDirection() {
        return (EnumC39181m) this.f4915N0.getValue();
    }

    public long getMeasureIteration() {
        C0195e1 c0195e1 = this.f4961r0;
        if (!c0195e1.f627c) {
            AbstractC37831a.m121373a("measureIteration should be only used during the measure/layout pass");
        }
        return c0195e1.f631g;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public C40001d getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public AbstractC39101i1 getPlacementScope() {
        int i13 = AbstractC39110l1.f168222b;
        return new C39118o0(this, 1);
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC34470p getPointerIconService() {
        return this.f4950g1;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public C21265b getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public C0230n0 getRoot() {
        return this.root;
    }

    public InterfaceC0208h2 getRootForTest() {
        return this.f4920Q;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        C16794j c16794j;
        if (Build.VERSION.SDK_INT < 31 || (c16794j = this.f4946e1) == null) {
            return false;
        }
        return ((Boolean) c16794j.f64547a.getValue()).booleanValue();
    }

    @Override // androidx.compose.p018ui.node.Owner
    public C18036r getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public C0238p0 getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C2388i1.f9438a.m7391a(this) : this.showLayoutBounds;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public C0188c2 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC2464x2 getSoftwareKeyboardController() {
        return this.f4907J0;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public C29892z getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC2473z2 getTextToolbar() {
        return this.f4923R0;
    }

    public final InterfaceC0204g2 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public View getView() {
        return this;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC2395j3 getViewConfiguration() {
        return this.f4910L;
    }

    public final C2416o getViewTreeOwners() {
        return (C2416o) this.f4893B0.getValue();
    }

    @Override // androidx.compose.p018ui.node.Owner
    public InterfaceC2410m3 getWindowInfo() {
        return this.f4906J;
    }

    /* JADX INFO: renamed from: get_autofillManager$ui_release, reason: from getter */
    public final C3859d get_autofillManager() {
        return this._autofillManager;
    }

    /* JADX INFO: renamed from: l */
    public final void m3585l(C0230n0 c0230n0, boolean z4) {
        this.f4961r0.m484f(c0230n0, z4);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX INFO: renamed from: n */
    public final int m3586n(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        AndroidComposeView androidComposeView;
        removeCallbacks(this.f4935Y0);
        try {
            m3575G(motionEvent);
            this.f4971y0 = true;
            m3592w(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.f4925S0;
                boolean z4 = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                C23224a c23224a = this.f4947f0;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!c23224a.f91957a) {
                                ((C0062y) ((C3632c) c23224a.f91960d).f14788w).m149a();
                                ((C34453d) c23224a.f91959c).m108908c();
                            }
                        } else if (motionEvent3.getActionMasked() == 10 || !z4) {
                            motionEvent2 = motionEvent3;
                        } else {
                            m3580M(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    motionEvent2 = motionEvent3;
                }
                boolean z13 = motionEvent.getToolType(0) == 3;
                if (z4 || !z13 || actionMasked2 == 3 || actionMasked2 == 9 || !m3588r(motionEvent)) {
                    androidComposeView = this;
                } else {
                    androidComposeView = this;
                    androidComposeView.m3580M(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = androidComposeView.f4925S0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = androidComposeView.f4925S0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    C34459g c34459g = androidComposeView.f4945e0;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            c34459g.f144769c.delete(pointerId);
                            c34459g.f144768b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = androidComposeView.f4925S0;
                        float x3 = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = androidComposeView.f4925S0;
                        boolean z14 = (x3 == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = androidComposeView.f4925S0;
                        boolean z15 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z14 || z15) {
                            if (pointerId >= 0) {
                                c34459g.f144769c.delete(pointerId);
                                c34459g.f144768b.delete(pointerId);
                            }
                            C34453d c34453d = (C34453d) c23224a.f91959c;
                            if (c34453d.f144751d) {
                                c34453d.f144751d = true;
                            } else {
                                c34453d.f144754g.f144798a.m94890g();
                            }
                        }
                    }
                }
                androidComposeView.f4925S0 = MotionEvent.obtainNoHistory(motionEvent);
                int iM3579L = m3579L(motionEvent);
                Trace.endSection();
                androidComposeView.f4971y0 = false;
                return iM3579L;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            this.f4971y0 = false;
            throw th5;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AbstractC1638x lifecycle;
        InterfaceC1585g0 interfaceC1585g0;
        super.onAttachedToWindow();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30) {
            setShowLayoutBounds(AbstractC2417o0.m7419k());
        }
        this.insetsListener.onViewAttachedToWindow(this);
        int i14 = 0;
        if (i13 > 28) {
            if (f4890l1 == null) {
                RunnableC2411n runnableC2411n = new RunnableC2411n(0);
                f4890l1 = runnableC2411n;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f4886h1 == null) {
                        f4886h1 = Class.forName("android.os.SystemProperties");
                    }
                    if (f4888j1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f4886h1;
                        f4888j1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f4888j1;
                    if (method != null) {
                        method.invoke(null, runnableC2411n);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            C0047q0 c0047q0 = f4889k1;
            synchronized (c0047q0) {
                c0047q0.m98a(this);
            }
        }
        this.f4906J.f9470c.setValue(Boolean.valueOf(hasWindowFocus()));
        C2414n2 c2414n2 = this.f4906J;
        C2456w c2456w = new C2456w(this, i14);
        C28633k1 c28633k1 = c2414n2.f9469b;
        if (c28633k1 == null) {
            c2414n2.f9468a = c2456w;
        }
        if (c28633k1 != null) {
            c28633k1.setValue(new C39180l(AbstractC4482w.m14012v(this)));
        }
        m3587p(getRoot());
        m3567o(getRoot());
        getSnapshotObserver().f608a.m128205e();
        C3856a c3856a = this.f4951h0;
        if (c3856a != null) {
            C3865j c3865j = C3865j.f15799a;
            c3865j.getClass();
            c3856a.f15780c.registerCallback(c3865j);
        }
        InterfaceC1585g0 interfaceC1585g0M5017g = AbstractC1613o1.m5017g(this);
        InterfaceC29049f interfaceC29049fM107891t = AbstractC34132o.m107891t(this);
        C2416o viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC1585g0M5017g != null && interfaceC29049fM107891t != null && (interfaceC1585g0M5017g != (interfaceC1585g0 = viewTreeOwners.f9472a) || interfaceC29049fM107891t != interfaceC1585g0))) {
            if (interfaceC1585g0M5017g == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (interfaceC29049fM107891t == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f9472a.getLifecycle()) != null) {
                lifecycle.mo4988d(this);
            }
            interfaceC1585g0M5017g.getLifecycle().mo4986a(this);
            C2416o c2416o = new C2416o(interfaceC1585g0M5017g, interfaceC29049fM107891t);
            set_viewTreeOwners(c2416o);
            Function1 function1 = this.f4894C0;
            if (function1 != null) {
                function1.invoke(c2416o);
            }
            this.f4894C0 = null;
        }
        this.f4919P0.f127257a.setValue(new C30860a(isInTouchMode() ? 1 : 2));
        C2416o viewTreeOwners2 = getViewTreeOwners();
        AbstractC1638x lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.f9472a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw AbstractC2875y.m8310w("No lifecycle owner exists");
        }
        lifecycle2.mo4986a(this);
        lifecycle2.mo4986a(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f4895D0);
        getViewTreeObserver().addOnScrollChangedListener(this.f4897E0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f4899F0);
        if (Build.VERSION.SDK_INT >= 31) {
            C2402l0.f9453a.m7398b(this);
        }
        C3859d c3859d = this._autofillManager;
        if (c3859d != null) {
            ((C15240l) getFocusOwner()).f57245g.m98a(c3859d);
            getSemanticsOwner().f69998d.m98a(c3859d);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C2318x c2318x = (C2318x) this.f4905I0.get();
        C2462x0 c2462x0 = (C2462x0) (c2318x != null ? c2318x.f9147b : null);
        if (c2462x0 == null) {
            return this.f4901G0.f122052d;
        }
        C2318x c2318x2 = (C2318x) c2462x0.f9613z.get();
        C2389i2 c2389i2 = (C2389i2) (c2318x2 != null ? c2318x2.f9147b : null);
        return c2389i2 != null && c2389i2.m7393b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(AbstractC35849g.m113799a(getContext()));
        C28633k1 c28633k1 = this.f4906J.f9469b;
        if (c28633k1 != null) {
            c28633k1.setValue(new C39180l(AbstractC4482w.m14012v(this)));
        }
        int i13 = Build.VERSION.SDK_INT;
        if ((i13 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f4913M0) {
            this.f4913M0 = i13 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(AbstractC15751g.m44464q(getContext()));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i13;
        C2318x c2318x = (C2318x) this.f4905I0.get();
        C2462x0 c2462x0 = (C2462x0) (c2318x != null ? c2318x.f9147b : null);
        if (c2462x0 == null) {
            C29863b0 c29863b0 = this.f4901G0;
            if (c29863b0.f122052d) {
                C29878l c29878l = c29863b0.f122056h;
                C29891y c29891y = c29863b0.f122055g;
                int i14 = c29878l.f122103e;
                boolean z4 = c29878l.f122099a;
                if (i14 == 1) {
                    i13 = z4 ? 6 : 0;
                } else if (i14 == 0) {
                    i13 = 1;
                } else if (i14 == 2) {
                    i13 = 2;
                } else if (i14 == 6) {
                    i13 = 5;
                } else if (i14 == 5) {
                    i13 = 7;
                } else if (i14 == 3) {
                    i13 = 3;
                } else if (i14 == 4) {
                    i13 = 4;
                } else {
                    if (i14 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
                editorInfo.imeOptions = i13;
                int i15 = c29878l.f122102d;
                if (i15 == 1) {
                    editorInfo.inputType = 1;
                } else if (i15 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i13;
                } else if (i15 == 3) {
                    editorInfo.inputType = 2;
                } else if (i15 == 4) {
                    editorInfo.inputType = 3;
                } else if (i15 == 5) {
                    editorInfo.inputType = 17;
                } else if (i15 == 6) {
                    editorInfo.inputType = 33;
                } else if (i15 == 7) {
                    editorInfo.inputType = 129;
                } else if (i15 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i15 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z4) {
                    int i16 = editorInfo.inputType;
                    if ((i16 & 1) == 1) {
                        editorInfo.inputType = i16 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        if (i14 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i17 = editorInfo.inputType;
                if ((i17 & 1) == 1) {
                    int i18 = c29878l.f122100b;
                    if (i18 == 1) {
                        editorInfo.inputType = i17 | 4096;
                    } else if (i18 == 2) {
                        editorInfo.inputType = i17 | DfuBaseService.ERROR_REMOTE_MASK;
                    } else if (i18 == 3) {
                        editorInfo.inputType = i17 | DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    if (c29878l.f122101c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j7 = c29891y.f122126b;
                int i19 = C23283u0.f92252c;
                editorInfo.initialSelStart = (int) (j7 >> 32);
                editorInfo.initialSelEnd = (int) (j7 & 4294967295L);
                AbstractC35902e.m113956a0(editorInfo, c29891y.f122125a.f92135x);
                editorInfo.imeOptions |= AndroidSDKConstants.FLAG_MUTABLE;
                if (C16955j.m47709d()) {
                    C16955j.m47708a().m47716i(editorInfo);
                }
                InputConnectionC29887u inputConnectionC29887u = new InputConnectionC29887u(c29863b0.f122055g, new C23548b(c29863b0, 28), c29863b0.f122056h.f122101c);
                c29863b0.f122057i.add(new WeakReference(inputConnectionC29887u));
                return inputConnectionC29887u;
            }
        } else {
            C2318x c2318x2 = (C2318x) c2462x0.f9613z.get();
            C2389i2 c2389i2 = (C2389i2) (c2318x2 != null ? c2318x2.f9147b : null);
            if (c2389i2 != null) {
                return c2389i2.m7392a(editorInfo);
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        ViewOnAttachStateChangeListenerC11482d viewOnAttachStateChangeListenerC11482d = this.contentCaptureManager;
        viewOnAttachStateChangeListenerC11482d.getClass();
        AbstractC11480b.m30887m(viewOnAttachStateChangeListenerC11482d, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.insetsListener.onViewDetachedFromWindow(this);
        if (this.f4898F) {
            View view = this.f4896E;
            if (view == null) {
                AbstractC22676k.m65757q("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 > 28) {
            C0047q0 c0047q0 = f4889k1;
            synchronized (c0047q0) {
                c0047q0.m106i(this);
            }
        }
        C39973v c39973v = getSnapshotObserver().f608a;
        C35909c c35909c = c39973v.f172501h;
        if (c35909c != null) {
            c35909c.m114042a();
        }
        c39973v.m128201a();
        C2414n2 c2414n2 = this.f4906J;
        if (c2414n2.f9469b == null) {
            c2414n2.f9468a = null;
        }
        C2416o viewTreeOwners = getViewTreeOwners();
        AbstractC1638x lifecycle = viewTreeOwners != null ? viewTreeOwners.f9472a.getLifecycle() : null;
        if (lifecycle == null) {
            throw AbstractC2875y.m8310w("No lifecycle owner exists");
        }
        lifecycle.mo4988d(this.contentCaptureManager);
        lifecycle.mo4988d(this);
        C3856a c3856a = this.f4951h0;
        if (c3856a != null) {
            C3865j c3865j = C3865j.f15799a;
            c3865j.getClass();
            c3856a.f15780c.unregisterCallback(c3865j);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f4895D0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f4897E0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f4899F0);
        if (i13 >= 31) {
            C2402l0.f9453a.m7397a(this);
        }
        C3859d c3859d = this._autofillManager;
        if (c3859d != null) {
            getSemanticsOwner().f69998d.m106i(c3859d);
            ((C15240l) getFocusOwner()).f57245g.m106i(c3859d);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z4, int i13, Rect rect) {
        super.onFocusChanged(z4, i13, rect);
        if (z4 || hasFocus()) {
            return;
        }
        AbstractC15235g.m43315e(((C15240l) getFocusOwner()).f57241c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        this.lastMatrixRecalculationAnimationTime = 0L;
        this.f4961r0.m486j(this.f4940b1);
        this.f4959p0 = null;
        m3582O();
        if (this.f4958o0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i15 - i13, i16 - i14);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        C0195e1 c0195e1 = this.f4961r0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m3587p(getRoot());
            }
            long jM3565f = m3565f(i13);
            long jM3565f2 = m3565f(i14);
            long jM113833m = AbstractC35854l.m113833m((int) (jM3565f >>> 32), (int) (jM3565f & 4294967295L), (int) (jM3565f2 >>> 32), (int) (4294967295L & jM3565f2));
            C39169a c39169a = this.f4959p0;
            if (c39169a == null) {
                this.f4959p0 = new C39169a(jM113833m);
                this.f4960q0 = false;
            } else if (!C39169a.m124759c(c39169a.f168407a, jM113833m)) {
                this.f4960q0 = true;
            }
            c0195e1.m493q(jM113833m);
            c0195e1.m488l();
            setMeasuredDimension(getRoot().m592J(), getRoot().m641s());
            if (this.f4958o0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().m592J(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().m641s(), 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i13) {
        if (viewStructure != null) {
            C3859d c3859d = this._autofillManager;
            if (c3859d != null) {
                C0230n0 c0230n0 = c3859d.f15788b.f69995a;
                AutofillId autofillId = c3859d.f15793g;
                String str = c3859d.f15791e;
                C21265b c21265b = c3859d.f15790d;
                AbstractC3511b.m10366F(viewStructure, c0230n0, autofillId, str, c21265b);
                Object[] objArr = AbstractC0009b1.f23a;
                C0047q0 c0047q0 = new C0047q0(2);
                c0047q0.m98a(c0230n0);
                c0047q0.m98a(viewStructure);
                while (c0047q0.m105h()) {
                    Object objM107j = c0047q0.m107j(c0047q0.f137b - 1);
                    AbstractC22676k.m65748h(objM107j, "null cannot be cast to non-null type android.view.ViewStructure");
                    ViewStructure viewStructure2 = (ViewStructure) objM107j;
                    Object objM107j2 = c0047q0.m107j(c0047q0.f137b - 1);
                    AbstractC22676k.m65748h(objM107j2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                    List listM637q = ((C0230n0) objM107j2).m637q();
                    int size = listM637q.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        C0230n0 c0230n1 = (C0230n0) ((C30848b) listM637q).get(i14);
                        if (!c0230n1.f793o0 && c0230n1.m605X() && c0230n1.m606Y()) {
                            C18030l c18030lM591I = c0230n1.m591I();
                            if (c18030lM591I != null) {
                                C0057v0 c0057v0 = c18030lM591I.f69980w;
                                if (c0057v0.m124b(AbstractC18029k.f69960g) || c0057v0.m124b(AbstractC18039u.f70050q) || c0057v0.m124b(AbstractC18039u.f70051r)) {
                                    ViewStructure viewStructureM11850g = C3864i.m11850g(viewStructure2, C3864i.m11844a(viewStructure2));
                                    AbstractC3511b.m10366F(viewStructureM11850g, c0230n1, autofillId, str, c21265b);
                                    c0047q0.m98a(c0230n1);
                                    c0047q0.m98a(viewStructureM11850g);
                                } else {
                                    c0047q0.m98a(c0230n1);
                                    c0047q0.m98a(viewStructure2);
                                }
                            } else {
                                c0047q0.m98a(c0230n1);
                                c0047q0.m98a(viewStructure2);
                            }
                        }
                    }
                }
            }
            C3856a c3856a = this.f4951h0;
            if (c3856a != null) {
                AbstractC37978j.m121635S(c3856a, viewStructure);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i13) {
        InterfaceC34469o interfaceC34469o;
        int toolType = motionEvent.getToolType(i13);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (interfaceC34469o = ((C2461x) getPointerIconService()).f9608a) == null) ? super.onResolvePointerIcon(motionEvent, i13) : C2407m0.m7403b(getContext(), interfaceC34469o);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC1585g0 interfaceC1585g0) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(AbstractC2417o0.m7419k());
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        EnumC39181m enumC39181m;
        if (this.f4968x) {
            if (i13 != 0) {
                enumC39181m = i13 != 1 ? null : EnumC39181m.f168424x;
            } else {
                enumC39181m = EnumC39181m.f168423w;
            }
            if (enumC39181m == null) {
                enumC39181m = EnumC39181m.f168423w;
            }
            setLayoutDirection(enumC39181m);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C16794j c16794j;
        if (Build.VERSION.SDK_INT < 31 || (c16794j = this.f4946e1) == null) {
            return;
        }
        c16794j.m47341a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC11482d viewOnAttachStateChangeListenerC11482d = this.contentCaptureManager;
        viewOnAttachStateChangeListenerC11482d.getClass();
        AbstractC11480b.m30889o(viewOnAttachStateChangeListenerC11482d, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        boolean zM7419k;
        this.f4906J.f9470c.setValue(Boolean.valueOf(z4));
        this.f4944d1 = true;
        super.onWindowFocusChanged(z4);
        if (!z4 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zM7419k = AbstractC2417o0.m7419k())) {
            return;
        }
        setShowLayoutBounds(zM7419k);
        m3567o(getRoot());
    }

    /* JADX INFO: renamed from: p */
    public final void m3587p(C0230n0 c0230n0) {
        this.f4961r0.m492p(c0230n0, false);
        C30849c c30849cM595M = c0230n0.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            m3587p((C0230n0) objArr[i14]);
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3588r(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y13 = motionEvent.getY();
        return 0.0f <= x3 && x3 <= ((float) getWidth()) && 0.0f <= y13 && y13 <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i13, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (((C15240l) getFocusOwner()).f57241c.m43358Z0().m43353a()) {
            return super.requestFocus(i13, rect);
        }
        C15232d c15232dM60707v0 = AbstractC21598x.m60707v0(i13);
        int iM43300d = c15232dM60707v0 != null ? c15232dM60707v0.m43300d() : 7;
        return AbstractC22676k.m65745e(((C15240l) getFocusOwner()).m43344g(iM43300d, rect != null ? AbstractC17918w0.m51508J(rect) : null, new C2466y(iM43300d, 0)), Boolean.TRUE);
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.f4924S.f9412h = intervalMillis;
    }

    public final void setConfigurationChangeObserver(Function1 function1) {
        this.configurationChangeObserver = function1;
    }

    public final void setContentCaptureManager$ui_release(ViewOnAttachStateChangeListenerC11482d viewOnAttachStateChangeListenerC11482d) {
        this.contentCaptureManager = viewOnAttachStateChangeListenerC11482d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void setCoroutineContext(InterfaceC30063j interfaceC30063j) {
        this.coroutineContext = interfaceC30063j;
        AbstractC2316v abstractC2316v = (AbstractC2316v) getRoot().f783e0.f743g;
        if (abstractC2316v instanceof C34462h0) {
            ((C34462h0) abstractC2316v).m108936Z0();
        }
        if (!abstractC2316v.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitSubtreeIf called on an unattached node");
        }
        C30849c c30849c = new C30849c(new AbstractC2316v[16]);
        AbstractC2316v abstractC2316v2 = abstractC2316v.f9142w;
        AbstractC2316v abstractC2316v3 = abstractC2316v2.f9133F;
        if (abstractC2316v3 == null) {
            AbstractC0201g.m501a(c30849c, abstractC2316v2);
        } else {
            c30849c.m94885b(abstractC2316v3);
        }
        while (true) {
            int i13 = c30849c.f127229y;
            if (i13 == 0) {
                return;
            }
            AbstractC2316v abstractC2316v4 = (AbstractC2316v) c30849c.m94894l(i13 - 1);
            if ((abstractC2316v4.f9145z & 16) != 0) {
                for (AbstractC2316v abstractC2316v5 = abstractC2316v4; abstractC2316v5 != null; abstractC2316v5 = abstractC2316v5.f9133F) {
                    if ((abstractC2316v5.f9144y & 16) != 0) {
                        ?? M504d = abstractC2316v5;
                        ?? c30849c2 = 0;
                        while (M504d != 0) {
                            if (M504d instanceof InterfaceC0200f2) {
                                InterfaceC0200f2 interfaceC0200f2 = (InterfaceC0200f2) M504d;
                                if (interfaceC0200f2 instanceof C34462h0) {
                                    ((C34462h0) interfaceC0200f2).m108936Z0();
                                }
                            } else if ((M504d.f9144y & 16) != 0 && (M504d instanceof AbstractC0233o)) {
                                AbstractC2316v abstractC2316v6 = ((AbstractC0233o) M504d).f804P;
                                int i14 = 0;
                                M504d = M504d;
                                c30849c2 = c30849c2;
                                while (abstractC2316v6 != null) {
                                    if ((abstractC2316v6.f9144y & 16) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            c30849c2 = c30849c2;
                                            M504d = abstractC2316v6;
                                        } else {
                                            if (c30849c2 == 0) {
                                                c30849c2 = new C30849c(new AbstractC2316v[16]);
                                            }
                                            if (M504d != 0) {
                                                c30849c2.m94885b(M504d);
                                                M504d = 0;
                                            }
                                            c30849c2.m94885b(abstractC2316v6);
                                        }
                                    }
                                    abstractC2316v6 = abstractC2316v6.f9133F;
                                    M504d = M504d;
                                    c30849c2 = c30849c2;
                                }
                                if (i14 == 1) {
                                }
                            }
                            M504d = AbstractC0201g.m504d(c30849c2);
                        }
                    }
                }
            }
            AbstractC0201g.m501a(c30849c, abstractC2316v4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j7) {
        this.lastMatrixRecalculationAnimationTime = j7;
    }

    public final void setOnViewTreeOwnersAvailable(Function1 callback) {
        C2416o viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f4894C0 = callback;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public void setShowLayoutBounds(boolean z4) {
        this.showLayoutBounds = z4;
    }

    public void setUncaughtExceptionHandler(InterfaceC0204g2 handler) {
        this.f4961r0.getClass();
    }

    public final void setUncaughtExceptionHandler$ui_release(InterfaceC0204g2 interfaceC0204g2) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m3589t(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f4925S0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final void m3590u(float[] fArr) {
        m3574F();
        C17896l0.m51476f(fArr, this.f4965v0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f4973z0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f4973z0 & 4294967295L));
        float[] fArr2 = this.f4964u0;
        C17896l0.m51474d(fArr2);
        C17896l0.m51477g(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        AbstractC2417o0.m7422n(fArr, fArr2);
    }

    /* JADX INFO: renamed from: v */
    public final long m3591v(long j7) {
        m3574F();
        long jM51472b = C17896l0.m51472b(j7, this.f4965v0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f4973z0 >> 32)) + Float.intBitsToFloat((int) (jM51472b >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f4973z0 & 4294967295L)) + Float.intBitsToFloat((int) (jM51472b & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: w */
    public final void m3592w(boolean z4) {
        C2456w c2456w;
        C0195e1 c0195e1 = this.f4961r0;
        if (c0195e1.f626b.m673D() || ((C30849c) c0195e1.f629e.f21443x).f127229y != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z4) {
                try {
                    c2456w = this.f4940b1;
                } finally {
                    Trace.endSection();
                }
            } else {
                c2456w = null;
            }
            if (c0195e1.m486j(c2456w)) {
                requestLayout();
            }
            c0195e1.m481a(false);
            if (this.f4943d0) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f4943d0 = false;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m3593y(C0230n0 c0230n0, long j7) {
        C0195e1 c0195e1 = this.f4961r0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c0195e1.m487k(c0230n0, j7);
            if (!c0195e1.f626b.m673D()) {
                c0195e1.m481a(false);
                if (this.f4943d0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f4943d0 = false;
                }
            }
            getRectManager().m59668b();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m3594z(InterfaceC0180a2 interfaceC0180a2, boolean z4) {
        ArrayList arrayList = this.f4937a0;
        if (!z4) {
            if (this.f4941c0) {
                return;
            }
            arrayList.remove(interfaceC0180a2);
            ArrayList arrayList2 = this.f4939b0;
            if (arrayList2 != null) {
                arrayList2.remove(interfaceC0180a2);
                return;
            }
            return;
        }
        if (!this.f4941c0) {
            arrayList.add(interfaceC0180a2);
            return;
        }
        ArrayList arrayList3 = this.f4939b0;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f4939b0 = arrayList3;
        }
        arrayList3.add(interfaceC0180a2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13) {
        AbstractC22676k.m65747g(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i13, layoutParams, true);
    }

    @Override // androidx.compose.p018ui.node.Owner
    public C2381h getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public C2386i getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public C2391j getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public ViewOnDragListenerC12586a getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: from getter and merged with bridge method [inline-methods] */
    public C0023g0 m134040getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // androidx.compose.p018ui.node.Owner
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, int i14) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i13;
        layoutParamsGenerateDefaultLayoutParams.height = i14;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i13, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
