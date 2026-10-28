package ug;

import a33.C0352d;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Display;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.relocation.AbstractC1108a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.C1836v0;
import aws.smithy.kotlin.runtime.time.IncompleteException;
import b30.C2531h0;
import b30.C2539i0;
import b30.C2547j0;
import b30.C2571m0;
import b30.C2641v3;
import b30.C2665z;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.C3003e1;
import bf0.C3195g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.ContentBlock;
import com.amplitude.android.engagement.types.NudgeStep;
import com.amplitude.android.engagement.types.SurveyListBlock;
import com.amplitude.android.engagement.types.SurveyRatingBlock;
import com.amplitude.android.engagement.types.SurveyTextBlock;
import com.amplitude.android.engagement.types.SurveyTextShortBlock;
import com.google.android.material.textfield.C5057p;
import com.iterable.iterableapi.C5309c;
import com.iterable.iterableapi.C5313d;
import com.iterable.iterableapi.C5341k;
import com.squareup.moshi.JsonAdapter;
import com.whoop.android.R;
import d30.C11514a;
import d40.AbstractC11673r;
import da3.C11834a;
import da3.C11835b;
import da3.C11836c;
import e30.AbstractC12605c;
import ec3.C13081r1;
import ed3.C13117a;
import ed3.C13131o;
import fc0.C14361e;
import g11.C15218b;
import g40.AbstractC15376j4;
import g40.C15351f3;
import g40.C15454z1;
import g40.InterfaceC15361h1;
import g40.InterfaceC15391m3;
import g63.C15537a;
import h00.AbstractC16501f0;
import h00.EnumC16505h0;
import h20.C16657g;
import h20.C16671i1;
import h20.C16735t;
import h20.C16760x0;
import hc3.AbstractC17182o;
import hc3.C17171d;
import hg3.AbstractC17269i;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.ktor.utils.p228io.InterfaceC20021n;
import io.ktor.utils.p228io.InterfaceC20024q;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.C20121k0;
import io.sentry.android.core.internal.util.PixelCopyOnPixelCopyFinishedListenerC20110k;
import iz0.C21045d;
import j00.AbstractC21114q;
import j00.C21090a0;
import j00.C21092b0;
import j00.C21103h;
import j00.C21108k;
import j00.C21115r;
import j00.C21118u;
import j00.C21121x;
import j00.C21122y;
import j00.EnumC21094c0;
import j93.AbstractC21478l0;
import j93.C21462d0;
import j93.EnumC21464e0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21463e;
import j93.InterfaceC21467g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k20.C22136a;
import k20.C22139d;
import k93.AbstractC22304a;
import kc3.C22365e;
import kotlin.C2032u;
import lb3.AbstractC23773f1;
import lb3.AbstractC23791o;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23778h0;
import lb3.C23784k0;
import lb3.C23792o0;
import lb3.C23806v0;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mb3.C25396m;
import mw1.C25985a;
import n00.EnumC26076d;
import n53.C26318e;
import nf3.C26669a;
import ng3.C26701n;
import ni.C26726a;
import ni.C26728c;
import ni.C26729d;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26944e0;
import nq0.C27050m;
import o00.C27343a;
import o00.C27344b;
import o73.C27648a;
import of3.InterfaceC27903a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p000.C29656q;
import p002a0.C0057v0;
import p003a1.C0106e;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2464x2;
import p031b9.AbstractC2875y;
import p042c2.C3867l;
import p042c2.C3868m;
import p042c2.InterfaceC3863h;
import p044c5.ExecutorC4220l;
import p048ce.AbstractC4482w;
import p095dp.AbstractC12240d;
import p097ds.AbstractC12313p;
import p098dt.AbstractC12350b;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15011f9;
import p163g1.C14970c1;
import p163g1.C15052j6;
import p163g1.C15069l3;
import p164g2.C15247s;
import p164g2.InterfaceC15237i;
import p182h3.C16793i;
import p182h3.C16795k;
import p208i2.AbstractC17918w0;
import p208i2.C17913u;
import p208i2.C17919x;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18037s;
import p209i3.AbstractC18039u;
import p209i3.C18028j;
import p209i3.C18030l;
import p209i3.C18034p;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p441qx.C30722l0;
import p445r0.C30835c;
import p445r0.InterfaceC30833a;
import p446r1.C30849c;
import p471rx.AbstractC31885f;
import p471rx.C31879a;
import p471rx.C31880b;
import p479s4.AbstractC32126g;
import p479s4.AbstractC32128i;
import p513u4.AbstractC34523k;
import p530up.AbstractC35148d;
import p547v8.AbstractC35785b;
import p550vd.AbstractC35903f;
import p557vo.AbstractC36221c;
import p602x1.AbstractC37817c;
import p607x8.C38059n;
import p634y1.AbstractC39038k;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.C39176h;
import p636y3.C39179k;
import p696zy.InterfaceC41211c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.KClassImpl;
import p715kotlin.reflect.jvm.internal.KTypeParameterImpl;
import p715kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p715kotlin.reflect.jvm.internal.impl.p286km.InconsistentKotlinMetadataException;
import pf.AbstractC29125c;
import pf3.C29155a;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.AbstractC29841z;
import q20.C29818g;
import q20.C29822i;
import q20.C29824j;
import q20.C29828m;
import q20.C29829n;
import q20.C29830o;
import q20.C29834s;
import q20.C29838w;
import q20.C29839x;
import q20.EnumC29836u;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import sa3.C32331e;
import se.AbstractC32416g;
import te0.AbstractC33745d;
import v00.C35459c0;
import wb3.AbstractC37056f;
import wb3.C37058h;
import y00.C38793c;
import y00.C38977v3;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: ug.m */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC34924m {
    /* JADX INFO: renamed from: A */
    public static final String m110119A(int i13, int i14, int i15, String str) {
        return "expected " + (i13 == i14 ? "exactly" : "at least") + ' ' + i15 + " digits; " + str;
    }

    /* JADX INFO: renamed from: B */
    public static final C26669a m110120B(ComponentCallbacks componentCallbacks) {
        AbstractC22676k.m65750j(componentCallbacks, "<this>");
        if (componentCallbacks instanceof InterfaceC27903a) {
            return ((InterfaceC27903a) componentCallbacks).getKoin();
        }
        C26669a c26669a = C29155a.f118017b;
        if (c26669a != null) {
            return c26669a;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    /* JADX INFO: renamed from: C */
    public static final InterfaceC41211c m110121C(AbstractC29840y abstractC29840y) {
        AbstractC22676k.m65750j(abstractC29840y, "<this>");
        if (abstractC29840y instanceof C29822i) {
            return ((C29822i) abstractC29840y).f121903z;
        }
        if (abstractC29840y instanceof C29818g) {
            return ((C29818g) abstractC29840y).f121890z;
        }
        if (abstractC29840y.equals(C29824j.f121906x)) {
            return AbstractC32128i.m100054h(R.string.stripe_google_pay);
        }
        if (abstractC29840y instanceof C29828m) {
            return AbstractC32128i.m100054h(R.string.stripe_link);
        }
        if (abstractC29840y instanceof C29829n) {
            return AbstractC32128i.m100061p(AbstractC12240d.m34086w(((C29829n) abstractC29840y).f121921H));
        }
        if (abstractC29840y instanceof C29830o) {
            return ((C29830o) abstractC29840y).f121931x;
        }
        if (abstractC29840y instanceof C29834s) {
            return AbstractC32128i.m100055i(((C29834s) abstractC29840y).f121948x);
        }
        if (!(abstractC29840y instanceof C29838w)) {
            if (abstractC29840y instanceof C29839x) {
                return AbstractC32128i.m100054h(R.string.stripe_shop_pay);
            }
            throw new NoWhenBranchMatchedException();
        }
        C29838w c29838w = (C29838w) abstractC29840y;
        InterfaceC41211c interfaceC41211cM34043I = AbstractC12240d.m34043I(c29838w.f121955x, true);
        if (interfaceC41211cM34043I == null) {
            EnumC29836u enumC29836u = c29838w.f121956y;
            int i13 = enumC29836u == null ? -1 : AbstractC29841z.f121960a[enumC29836u.ordinal()];
            if (i13 != 1) {
                interfaceC41211cM34043I = i13 != 2 ? null : AbstractC32128i.m100054h(R.string.stripe_google_pay);
            } else {
                interfaceC41211cM34043I = AbstractC32128i.m100054h(R.string.stripe_link);
            }
        }
        return AbstractC32128i.m100061p(interfaceC41211cM34043I);
    }

    /* JADX INFO: renamed from: D */
    public static final String m110122D(AbstractC29840y abstractC29840y) {
        String str;
        AbstractC22676k.m65750j(abstractC29840y, "<this>");
        if (abstractC29840y instanceof C29822i) {
            return ((C29822i) abstractC29840y).f121901x;
        }
        if (abstractC29840y instanceof C29818g) {
            return ((C29818g) abstractC29840y).f121888x;
        }
        if (abstractC29840y.equals(C29824j.f121906x)) {
            return "google_pay";
        }
        if (abstractC29840y instanceof C29828m) {
            return "link";
        }
        if (abstractC29840y instanceof AbstractC29835t) {
            return ((AbstractC29835t) abstractC29840y).mo91330i().f167026w;
        }
        if (abstractC29840y instanceof C29838w) {
            EnumC38828f4 enumC38828f4 = ((C29838w) abstractC29840y).f121955x.f167511E;
            return (enumC38828f4 == null || (str = enumC38828f4.f167132w) == null) ? "card" : str;
        }
        if (abstractC29840y instanceof C29839x) {
            return "shop_pay";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: E */
    public static final int m110123E(C5057p c5057p, int i13) {
        int iM15867j;
        int iM15867j2;
        if (c5057p.m15862e(c5057p.m15867j(i13))) {
            c5057p.m15859b(i13);
            iM15867j = i13;
            while (iM15867j != -1 && (c5057p.m15866i(iM15867j) || !c5057p.m15862e(iM15867j))) {
                iM15867j = c5057p.m15867j(iM15867j);
            }
        } else {
            c5057p.m15859b(i13);
            if (c5057p.m15861d(i13)) {
                if (!c5057p.m15863f(i13) || c5057p.m15865h(i13)) {
                    iM15867j2 = c5057p.m15867j(i13);
                    iM15867j = iM15867j2;
                } else {
                    iM15867j = i13;
                }
            } else if (c5057p.m15865h(i13)) {
                iM15867j2 = c5057p.m15867j(i13);
                iM15867j = iM15867j2;
            } else {
                iM15867j = -1;
            }
        }
        return iM15867j == -1 ? i13 : iM15867j;
    }

    /* JADX INFO: renamed from: F */
    public static final int m110124F(C5057p c5057p, int i13) {
        int iM15868k;
        int iM15868k2;
        if (c5057p.m15866i(c5057p.m15868k(i13))) {
            c5057p.m15859b(i13);
            iM15868k = i13;
            while (iM15868k != -1 && (!c5057p.m15866i(iM15868k) || c5057p.m15862e(iM15868k))) {
                iM15868k = c5057p.m15868k(iM15868k);
            }
        } else {
            c5057p.m15859b(i13);
            if (c5057p.m15865h(i13)) {
                if (!c5057p.m15863f(i13) || c5057p.m15861d(i13)) {
                    iM15868k2 = c5057p.m15868k(i13);
                    iM15868k = iM15868k2;
                } else {
                    iM15868k = i13;
                }
            } else if (c5057p.m15861d(i13)) {
                iM15868k2 = c5057p.m15868k(i13);
                iM15868k = iM15868k2;
            } else {
                iM15868k = -1;
            }
        }
        return iM15868k == -1 ? i13 : iM15868k;
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m110125G(AbstractC29840y abstractC29840y) {
        AbstractC22676k.m65750j(abstractC29840y, "<this>");
        if (abstractC29840y instanceof C29824j) {
            return false;
        }
        if (abstractC29840y instanceof C29828m) {
            return true;
        }
        if (abstractC29840y instanceof C29829n) {
            return ((C29829n) abstractC29840y).f121920G != null;
        }
        if (abstractC29840y instanceof AbstractC29835t) {
            return false;
        }
        if (abstractC29840y instanceof C29838w) {
            return ((C29838w) abstractC29840y).f121956y == EnumC29836u.Link;
        }
        if ((abstractC29840y instanceof C29818g) || (abstractC29840y instanceof C29822i) || (abstractC29840y instanceof C29839x)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: H */
    public static boolean m110126H(AbstractC23773f1 abstractC23773f1) {
        return AbstractC4482w.m13984U(C25396m.f99492w.m74578p0(), AbstractC12313p.m34261M(abstractC23773f1), C23792o0.f94172b);
    }

    /* JADX INFO: renamed from: I */
    public static final InterfaceC20021n m110127I(InterfaceC20024q interfaceC20024q, InterfaceC30063j context, Long l7, Function3 function3) {
        AbstractC22676k.m65750j(interfaceC20024q, "<this>");
        AbstractC22676k.m65750j(context, "context");
        return AbstractC17269i.m48915s0(C3003e1.f12012w, context, true, new C15537a(l7, interfaceC20024q, function3, null)).f75135x;
    }

    /* JADX INFO: renamed from: J */
    public static final void m110128J(int i13, int i14, String input) {
        AbstractC22676k.m65750j(input, "input");
        if (i14 == 0) {
            if (i13 < input.length()) {
                return;
            }
        } else if (i13 + i14 <= input.length()) {
            return;
        }
        throw new IncompleteException(input, i14 == 0 ? C34916e.f147020w : new C34915d(i14));
    }

    /* JADX INFO: renamed from: K */
    public static AbstractC35148d m110129K(Metadata metadata) {
        String string;
        if (metadata.m65683mv().length == 0) {
            throw new IllegalArgumentException("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
        }
        C32331e c32331e = new C32331e(metadata.m65683mv(), (metadata.m65685xi() & 8) != 0);
        boolean zM100625a = c32331e.m100625a(1, 1, 0);
        if (!zM100625a) {
            if (zM100625a) {
                StringBuilder sb4 = new StringBuilder("while maximum supported version is ");
                sb4.append(c32331e.f133829f ? C32331e.f133827g : C32331e.f133828h);
                sb4.append(". To support newer versions, update the kotlin-metadata-jvm library.");
                string = sb4.toString();
            } else {
                string = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
            }
            throw new IllegalArgumentException("Provided Metadata instance has version " + c32331e + ", " + string);
        }
        try {
            int iM65682k = metadata.m65682k();
            if (iM65682k == 1) {
                return new C11835b(metadata);
            }
            if (iM65682k == 2) {
                AbstractC32416g.m101141J(metadata);
                new C11834a(metadata.m65683mv());
                metadata.m65685xi();
                return new C11836c();
            }
            if (iM65682k == 3) {
                return new C11836c(metadata);
            }
            if (iM65682k == 4) {
                AbstractC25260n.m74048W(metadata.m65680d1());
                new C11834a(metadata.m65683mv());
                metadata.m65685xi();
                return new C11836c();
            }
            if (iM65682k != 5) {
                C11836c c11836c = new C11836c();
                new C11834a(metadata.m65683mv());
                metadata.m65685xi();
                return c11836c;
            }
            AbstractC32416g.m101141J(metadata);
            String facadeClassName = metadata.m65686xs();
            new C11834a(metadata.m65683mv());
            metadata.m65685xi();
            AbstractC22676k.m65750j(facadeClassName, "facadeClassName");
            return new C11836c();
        } catch (Throwable th3) {
            if ((th3 instanceof IllegalArgumentException) || (th3 instanceof VirtualMachineError) || (th3 instanceof ThreadDeath)) {
                throw th3;
            }
            throw new InconsistentKotlinMetadataException("Exception occurred when reading Kotlin metadata", th3);
        }
    }

    /* JADX INFO: renamed from: L */
    public static long m110130L(C38059n c38059n, int i13, int i14) {
        c38059n.m121846F(i13);
        if (c38059n.m121848a() < 5) {
            return -9223372036854775807L;
        }
        int iM121854g = c38059n.m121854g();
        if ((8388608 & iM121854g) != 0 || ((2096896 & iM121854g) >> 8) != i14 || (iM121854g & 32) == 0 || c38059n.m121867t() < 7 || c38059n.m121848a() < 7 || (c38059n.m121867t() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c38059n.m121852e(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* JADX INFO: renamed from: M */
    public static void m110131M(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    /* JADX INFO: renamed from: N */
    public static void m110132N(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }

    /* JADX INFO: renamed from: O */
    public static final void m110133O(String message) {
        AbstractC22676k.m65750j(message, "message");
        throw new IllegalArgumentException(message);
    }

    /* JADX INFO: renamed from: P */
    public static final void m110134P(String message) {
        AbstractC22676k.m65750j(message, "message");
        throw new IllegalStateException(message);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m110135Q(String message) {
        AbstractC22676k.m65750j(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    /* JADX INFO: renamed from: R */
    public static final void m110136R(String message) {
        AbstractC22676k.m65750j(message, "message");
        throw new NoSuchElementException(message);
    }

    /* JADX INFO: renamed from: S */
    public static final C16671i1 m110137S(C38977v3 c38977v3) {
        AbstractC22676k.m65750j(c38977v3, "<this>");
        C38793c c38793c = c38977v3.f167773w;
        return new C16671i1(new C16760x0(c38793c != null ? c38793c.f166960w : null, c38793c != null ? c38793c.f166961x : null, c38793c != null ? c38793c.f166962y : null, c38793c != null ? c38793c.f166963z : null, c38793c != null ? c38793c.f166958E : null, c38793c != null ? c38793c.f166959F : null), c38977v3.f167774x, c38977v3.f167775y, c38977v3.f167776z);
    }

    /* JADX INFO: renamed from: T */
    public static final void m110138T(C18034p c18034p, int i13, C16793i c16793i) {
        C30849c c30849c = new C30849c(new C18034p[16]);
        List listM51785i = c18034p.m51785i(false, false);
        while (true) {
            c30849c.m94886c(c30849c.f127229y, listM51785i);
            while (true) {
                int i14 = c30849c.f127229y;
                if (i14 == 0) {
                    return;
                }
                C18034p c18034p2 = (C18034p) c30849c.m94894l(i14 - 1);
                boolean zM51800e = AbstractC18037s.m51800e(c18034p2);
                C18030l c18030l = c18034p2.f69989d;
                C0057v0 c0057v0 = c18030l.f69980w;
                if (!zM51800e && !c0057v0.m125c(AbstractC18039u.f70042i)) {
                    NodeCoordinator nodeCoordinatorM51780d = c18034p2.m51780d();
                    if (nodeCoordinatorM51780d == null) {
                        throw AbstractC2875y.m8310w("Expected semantics node to have a coordinator.");
                    }
                    C39179k c39179kM115322c = AbstractC36221c.m115322c(AbstractC39125q1.m124660f(nodeCoordinatorM51780d));
                    if (c39179kM115322c.f168418a < c39179kM115322c.f168420c && c39179kM115322c.f168419b < c39179kM115322c.f168421d) {
                        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) AbstractC18037s.m51799d(c18030l, AbstractC18029k.f69958e);
                        Object objM129g = c0057v0.m129g(AbstractC18039u.f70054u);
                        if (objM129g == null) {
                            objM129g = null;
                        }
                        C18028j c18028j = (C18028j) objM129g;
                        if (interfaceC4351m == null || c18028j == null || ((Number) c18028j.f69951b.invoke()).floatValue() <= 0.0f) {
                            listM51785i = c18034p2.m51785i(false, false);
                        } else {
                            int i15 = i13 + 1;
                            c16793i.invoke(new C16795k(c18034p2, i15, c39179kM115322c, nodeCoordinatorM51780d));
                            m110138T(c18034p2, i15, c16793i);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m110140a(boolean z4, InterfaceC15391m3 emailController, EnumC26076d signUpState, int i13, C15247s c15247s, InterfaceC4351m interfaceC4351m, Composer composer, int i14, int i15) {
        int i16;
        InterfaceC4351m interfaceC4351m2;
        C28655q c28655q;
        InterfaceC4351m interfaceC4351m3;
        AbstractC22676k.m65750j(emailController, "emailController");
        AbstractC22676k.m65750j(signUpState, "signUpState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1449184955);
        int i17 = i14 | (c28655q2.m87155h(z4) ? 4 : 2) | (c28655q2.m87157i(emailController) ? 32 : 16) | (c28655q2.m87153g(signUpState) ? 256 : 128) | (c28655q2.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q2.m87153g(c15247s) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK);
        int i18 = 196608 | i17;
        int i19 = i15 & 64;
        if (i19 != 0) {
            i16 = i17 | 1769472;
            interfaceC4351m2 = interfaceC4351m;
        } else {
            InterfaceC4351m interfaceC4351m4 = interfaceC4351m;
            i16 = i18 | (c28655q2.m87157i(interfaceC4351m4) ? 1048576 : 524288);
            interfaceC4351m2 = interfaceC4351m4;
        }
        if ((i16 & 599187) == 599186 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
            interfaceC4351m3 = interfaceC4351m2;
        } else {
            if (i19 != 0) {
                interfaceC4351m2 = null;
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            int i24 = i16 >> 3;
            C28655q c28655q3 = c28655q2;
            InterfaceC4351m interfaceC4351m5 = interfaceC4351m2;
            AbstractC15376j4.m43587c(emailController, z4, i13, AbstractC1126a.m3483b(new LayoutWeightElement(1.0f, true), c15247s), null, 0, 0, null, false, false, c28655q3, (i24 & 14) | ((i16 << 3) & 112) | (i24 & 896), MessageListItemViewType.GIPHY);
            c28655q3.m87150e0(-1293860336);
            if (signUpState == EnumC26076d.f103267x) {
                float f13 = 8;
                Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3419p(32, c2314t), 0, f13, 16, f13);
                c28655q3.m87150e0(-1293852049);
                Object objM87133R = c28655q3.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C21045d(10);
                    c28655q3.m87172p0(objM87133R);
                }
                c28655q3.m87173q(false);
                AbstractC32126g.m100036a(2, 384, ((C14970c1) c28655q3.m87161k(AbstractC14981d1.f55997a)).m43091f(), 0L, c28655q3, AbstractC18032n.m51775c(modifierM3397s, false, (Function1) objM87133R));
            }
            c28655q3.m87173q(false);
            c28655q3.m87150e0(-1293845083);
            InterfaceC4351m interfaceC4351m6 = interfaceC4351m5;
            if (interfaceC4351m6 != null) {
                interfaceC4351m6.invoke(c28655q3, Integer.valueOf((i16 >> 18) & 14));
            }
            c28655q3.m87173q(false);
            c28655q3.m87173q(true);
            interfaceC4351m3 = interfaceC4351m6;
            c28655q = c28655q3;
        }
        InterfaceC4351m interfaceC4351m7 = interfaceC4351m3;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g(z4, emailController, signUpState, i13, c15247s, interfaceC4351m7, i14, i15);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m110141b(Modifier modifier, C39174f c39174f, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifierM3413j;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1354851612);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (((i15 | 16) & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87140Z();
            int i17 = i13 & 1;
            C2314t c2314t = C2314t.f9131w;
            if (i17 == 0 || c28655q.m87118C()) {
                if (i16 != 0) {
                    modifier = c2314t;
                }
                C39176h c39176h = (C39176h) c28655q.m87161k(AbstractC16501f0.f63425b);
                c39174f = c39176h != null ? new C39174f(C39176h.m124786b(c39176h.f168415a)) : null;
            } else {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            if (c39174f == null || (modifierM3413j = AbstractC1102d.m3413j(c2314t, c39174f.f168413w, 0.0f, 2)) == null) {
                modifierM3413j = c2314t;
            }
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier.mo3471e(modifierM3413j)), 0.0f, 64, 1));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC35148d.m111175f(0.0f, 6, 14, 0L, 0L, c28655q, AbstractC1102d.m3419p(48, c2314t));
            c28655q.m87173q(true);
        }
        Modifier modifier2 = modifier;
        C39174f c39174f2 = c39174f;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(modifier2, c39174f2, i13, i14, 8);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m110142c(Modifier modifier, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-572223225);
        if ((i13 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(AbstractC11673r.m31087p(AbstractC11673r.m31082k(c28655q).f37668a) ? R.drawable.stripe_link_logo_knockout_black : R.drawable.stripe_link_logo_knockout_white, c28655q, 0);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_link);
            c28655q.m87150e0(-881754639);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C21045d(9);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC15005f3.m43107a(abstractC26165aM88500I, strM92103Y, AbstractC18032n.m51775c(modifier, false, (Function1) objM87133R), C17919x.f69637n, c28655q, 3072, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2641v3(modifier, i13, 3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m110143d(C0352d sectionController, InterfaceC15391m3 emailController, C15454z1 phoneNumberController, InterfaceC15391m3 nameController, boolean z4, EnumC26076d signUpState, boolean z13, boolean z14, String str, Modifier modifier, Composer composer, int i13) {
        int i14;
        InterfaceC30833a interfaceC30833a;
        InterfaceC28601c1 interfaceC28601c1;
        C15247s c15247s;
        C15247s c15247s2;
        C15247s c15247s3;
        boolean z15;
        C28655q c28655q;
        AbstractC22676k.m65750j(sectionController, "sectionController");
        AbstractC22676k.m65750j(emailController, "emailController");
        AbstractC22676k.m65750j(phoneNumberController, "phoneNumberController");
        AbstractC22676k.m65750j(nameController, "nameController");
        AbstractC22676k.m65750j(signUpState, "signUpState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1871214805);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(sectionController) : c28655q2.m87157i(sectionController) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(emailController) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q2.m87153g(phoneNumberController) : c28655q2.m87157i(phoneNumberController) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(nameController) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87153g(signUpState) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q2.m87155h(z13) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q2.m87155h(z14) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= c28655q2.m87153g(str) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((805306368 & i13) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? 536870912 : 268435456;
        }
        if ((306783379 & i14) == 306783378 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            c28655q2.m87150e0(726212203);
            Object objM87133R = c28655q2.m87133R();
            Object obj = C28635l.f115821a;
            if (objM87133R == obj) {
                objM87133R = new C30835c();
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC30833a interfaceC30833a2 = (InterfaceC30833a) objM87133R;
            Object objM94759h = AbstractC30802r.m94759h(726214499, c28655q2, false);
            if (objM94759h == obj) {
                objM94759h = AbstractC33745d.m106649h(c28655q2);
            }
            C15247s c15247s4 = (C15247s) objM94759h;
            Object objM94759h2 = AbstractC30802r.m94759h(726216547, c28655q2, false);
            if (objM94759h2 == obj) {
                objM94759h2 = AbstractC33745d.m106649h(c28655q2);
            }
            C15247s c15247s5 = (C15247s) objM94759h2;
            Object objM94759h3 = AbstractC30802r.m94759h(726218563, c28655q2, false);
            if (objM94759h3 == obj) {
                objM94759h3 = AbstractC33745d.m106649h(c28655q2);
            }
            C15247s c15247s6 = (C15247s) objM94759h3;
            c28655q2.m87173q(false);
            Object[] objArr = new Object[0];
            c28655q2.m87150e0(726221119);
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == obj) {
                objM87133R2 = new C21118u(1);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q2.m87173q(false);
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr, null, (InterfaceC4339a) objM87133R2, c28655q2, 3072, 6);
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t((C26318e) sectionController.f1239z, c28655q2, 0);
            c28655q2.m87150e0(726225719);
            if (signUpState == EnumC26076d.f103268y) {
                c28655q2.m87150e0(726228778);
                interfaceC30833a = interfaceC30833a2;
                boolean zM87157i = ((i14 & 57344) == 16384) | c28655q2.m87157i(interfaceC30833a2) | c28655q2.m87157i(emailController) | ((i14 & 29360128) == 8388608);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87157i || objM87133R3 == obj) {
                    interfaceC28601c1 = interfaceC28601c2;
                    c15247s = c15247s4;
                    c15247s2 = c15247s5;
                    c15247s3 = c15247s6;
                    C21092b0 c21092b0 = new C21092b0(interfaceC30833a, emailController, z4, c15247s, c15247s2, c15247s3, z14, null);
                    c28655q2.m87172p0(c21092b0);
                    objM87133R3 = c21092b0;
                } else {
                    interfaceC28601c1 = interfaceC28601c2;
                    c15247s = c15247s4;
                    c15247s2 = c15247s5;
                    c15247s3 = c15247s6;
                }
                z15 = false;
                c28655q2.m87173q(false);
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, signUpState);
            } else {
                interfaceC30833a = interfaceC30833a2;
                interfaceC28601c1 = interfaceC28601c2;
                c15247s = c15247s4;
                c15247s2 = c15247s5;
                c15247s3 = c15247s6;
                i14 = i14;
                z15 = false;
            }
            c28655q2.m87173q(z15);
            InterfaceC15361h1 interfaceC15361h1 = (InterfaceC15361h1) interfaceC28601c1M83597t.getValue();
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            c28655q2.m87150e0(726273025);
            InterfaceC28601c1 interfaceC28601c3 = interfaceC28601c1;
            boolean zM87153g = c28655q2.m87153g(interfaceC28601c3);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87153g || objM87133R4 == obj) {
                objM87133R4 = new C15218b(23, interfaceC28601c3);
                c28655q2.m87172p0(objM87133R4);
            }
            c28655q2.m87173q(false);
            int i15 = i14 >> 3;
            int i16 = (i14 & 112) | 100663808 | (i14 & 896) | (i14 & 7168) | (i15 & 57344) | (i15 & 458752) | (3670016 & (i14 << 6)) | (i14 & 29360128) | ((i14 << 3) & 1879048192);
            InterfaceC30833a interfaceC30833a3 = interfaceC30833a;
            AbstractC21114q.m58931b(interfaceC15361h1, emailController, phoneNumberController, nameController, signUpState, z13, z4, z14, false, str, zBooleanValue, (InterfaceC4339a) objM87133R4, null, c15247s, c15247s2, c15247s3, c28655q2, i16, 224256, 4096);
            c28655q = c28655q2;
            AbstractC35785b.m113410e(z4 ? EnumC16505h0.f63465w : EnumC16505h0.f63466x, AbstractC1108a.m3443a(AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 8, 0.0f, 0.0f, 13), interfaceC30833a3), 5, c28655q, 0);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21090a0(sectionController, emailController, phoneNumberController, nameController, z4, signUpState, z13, z14, str, modifier, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final void m110144e(C21103h c21103h, boolean z4, Function1 onStateChanged, Modifier modifier, Composer composer, int i13) {
        int i14;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC30057d interfaceC30057d;
        C28655q c28655q;
        AbstractC22676k.m65750j(onStateChanged, "onStateChanged");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1868616687);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(c21103h) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onStateChanged) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 1171) == 1170 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(c21103h.f80016I, c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(c21103h.f80027T, c28655q2, 0);
            C21108k c21108k = (C21108k) interfaceC28601c1M83597t.getValue();
            c28655q2.m87150e0(-233531408);
            boolean zM87153g = ((i14 & 896) == 256) | c28655q2.m87153g(interfaceC28601c1M83597t);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            InterfaceC30057d interfaceC30057d2 = null;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C21121x(onStateChanged, interfaceC28601c1M83597t, interfaceC30057d2, 1);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, c21108k);
            InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) c28655q2.m87161k(AbstractC2453v1.f9577p);
            EnumC26076d enumC26076d = ((C21108k) interfaceC28601c1M83597t.getValue()).f80054k;
            c28655q2.m87150e0(-233524718);
            boolean zM87153g2 = c28655q2.m87153g(interfaceC28601c1M83597t) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87153g(interfaceC2464x2);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c1M83597t;
                interfaceC30057d = null;
                objM87133R2 = new C21122y(interfaceC15237i, interfaceC2464x2, interfaceC28601c1, interfaceC30057d, 1);
                c28655q2.m87172p0(objM87133R2);
            } else {
                interfaceC28601c1 = interfaceC28601c1M83597t;
                interfaceC30057d = null;
            }
            c28655q2.m87173q(false);
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, enumC26076d);
            C0352d c0352d = c21103h.f80022O;
            C15351f3 c15351f3 = c21103h.f80019L;
            C15454z1 c15454z1 = c21103h.f80020M;
            C15351f3 c15351f4 = c21103h.f80021N;
            EnumC26076d enumC26076d2 = ((C21108k) interfaceC28601c1.getValue()).f80054k;
            boolean z13 = AbstractC25265s.m74096F0(((C21108k) interfaceC28601c1.getValue()).f80047d) == EnumC21094c0.f79981x;
            boolean zContains = c21103h.f80014G.f80047d.contains(EnumC21094c0.f79982y);
            InterfaceC41211c interfaceC41211c = (InterfaceC41211c) interfaceC28601c1M83597t2.getValue();
            c28655q2.m87150e0(-233502768);
            String strM113396S = interfaceC41211c == null ? interfaceC30057d : AbstractC35785b.m113396S(interfaceC41211c, c28655q2);
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            m110143d(c0352d, c15351f3, c15454z1, c15351f4, z13, enumC26076d2, z4, zContains, strM113396S, modifier, c28655q, 4680 | ((i14 << 15) & 3670016) | ((i14 << 18) & 1879048192));
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21115r(c21103h, z4, onStateChanged, modifier, i13, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final C17913u m110145f(Shader shader) {
        return new C17913u(shader);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m110146g(C27344b viewModel, Composer composer, int i13) {
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1351879179);
        if ((((c28655q2.m87157i(viewModel) ? 4 : 2) | i13) & 3) != 2 || !c28655q2.m87121F()) {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(viewModel.f109531I, c28655q2, 0);
            C2571m0 c2571m0 = (C2571m0) C27648a.m83597t(viewModel.f109533K, c28655q2, 0).getValue();
            if (c2571m0 == null) {
                c28655q2.m87150e0(893582900);
                m110141b(null, null, c28655q2, 0, 3);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(893584267);
                C27343a c27343a = (C27343a) interfaceC28601c1M83597t.getValue();
                c28655q2.m87150e0(893587995);
                boolean zM87157i = c28655q2.m87157i(viewModel);
                Object objM87133R = c28655q2.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87157i || objM87133R == c28676v0) {
                    C2539i0 c2539i0 = new C2539i0(0, viewModel, C27344b.class, "onUpdateClicked", "onUpdateClicked()V", 0, 27);
                    c28655q2.m87172p0(c2539i0);
                    objM87133R = c2539i0;
                }
                c28655q2.m87173q(false);
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R);
                c28655q2.m87150e0(893590115);
                boolean zM87157i2 = c28655q2.m87157i(viewModel);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    C2539i0 c2539i1 = new C2539i0(0, viewModel, C27344b.class, "onDisabledUpdateClicked", "onDisabledUpdateClicked()V", 0, 28);
                    c28655q2.m87172p0(c2539i1);
                    objM87133R2 = c2539i1;
                }
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                m110147h(c2571m0, c27343a, interfaceC4339a, (InterfaceC4339a) ((InterfaceC21467g) objM87133R2), c28655q, 0);
                c28655q.m87173q(false);
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25985a(viewModel, i13, 22);
            }
        }
        c28655q2.m87138X();
        c28655q = c28655q2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25985a(viewModel, i13, 22);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m110147h(C2571m0 c2571m0, C27343a state, InterfaceC4339a onUpdateClicked, InterfaceC4339a onDisabledButtonClicked, Composer composer, int i13) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onUpdateClicked, "onUpdateClicked");
        AbstractC22676k.m65750j(onDisabledButtonClicked, "onDisabledButtonClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2118897543);
        if ((((c28655q.m87153g(c2571m0) ? 4 : 2) | i13 | (c28655q.m87153g(state) ? 32 : 16) | (c28655q.m87157i(onUpdateClicked) ? 256 : 128) | (c28655q.m87157i(onDisabledButtonClicked) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED)) & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC35903f.m114008c(null, AbstractC37817c.m121344e(-1844681347, c28655q, new C15052j6(state, (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i), onUpdateClicked, onDisabledButtonClicked, c2571m0, 1)), c28655q, 48);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2032u(c2571m0, state, onUpdateClicked, onDisabledButtonClicked, i13, 28);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m110148i(String text, Composer composer, int i13) {
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1860183759);
        int i14 = i13 | (c28655q.m87153g(text) ? 4 : 2);
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C2306l c2306l = C2299e.f9108K;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m110149j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c28655q, 0);
            AbstractC15011f9.m43114b(text, AbstractC1099a.m3396r(c2314t, 8, 0.0f, 2), AbstractC11673r.m31082k(c28655q).f37672e, 0L, null, C28780r.f116539F, null, 0L, null, null, 0L, 0, false, 0, 0, null, C15069l3.m43149c(c28655q).f56285l, c28655q, (i14 & 14) | 196656, 0, 65496);
            c28655q = c28655q;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m110149j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c28655q, 0);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2665z(text, i13, 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m110149j(Modifier modifier, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-256253185);
        if ((((c28655q.m87153g(modifier) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC22989q.m66760a(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(AbstractC11673r.m31083l(c28655q).f37679c, AbstractC1092a.m3358c(modifier, AbstractC11673r.m31087p(C15069l3.m43147a(c28655q).m43093h()) ? C17919x.m51541c(0.2f, C17919x.f69625b) : C17919x.m51541c(0.2f, C17919x.f69629f), AbstractC17918w0.f69621a))), c28655q, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2641v3(modifier, i13, 2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final C13131o m110150k(C13131o c13131o, long j7) {
        return new C13131o(j7 == 19500 ? c13131o.m36745f() : c13131o.m36744e());
    }

    /* JADX INFO: renamed from: l */
    public static final void m110151l(Throwable th3) {
        throw new IllegalStateException("Dispatchers.Main was accessed when the platform dispatcher was absent and the test dispatcher was unset. Please make sure that Dispatchers.setMain() is called before accessing Dispatchers.Main and that Dispatchers.Main is not accessed after Dispatchers.resetMain().", th3);
    }

    /* JADX INFO: renamed from: m */
    public static final JsonAdapter m110152m(C30722l0 c30722l0, InterfaceC21456a0 ktype) {
        AbstractC22676k.m65750j(c30722l0, "<this>");
        AbstractC22676k.m65750j(ktype, "ktype");
        JsonAdapter jsonAdapterM94399b = c30722l0.m94399b(AbstractC21478l0.m60396B(ktype), AbstractC31885f.f132390a);
        if ((jsonAdapterM94399b instanceof C31880b) || (jsonAdapterM94399b instanceof C31879a)) {
            return jsonAdapterM94399b;
        }
        if (ktype.isMarkedNullable()) {
            JsonAdapter jsonAdapterNullSafe = jsonAdapterM94399b.nullSafe();
            AbstractC22676k.m65749i(jsonAdapterNullSafe, "{\n    adapter.nullSafe()\n  }");
            return jsonAdapterNullSafe;
        }
        JsonAdapter jsonAdapterNonNull = jsonAdapterM94399b.nonNull();
        AbstractC22676k.m65749i(jsonAdapterNonNull, "{\n    adapter.nonNull()\n  }");
        return jsonAdapterNonNull;
    }

    /* JADX INFO: renamed from: n */
    public static final Modifier m110153n(Modifier modifier, List list, Function1 onFill, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(onFill, "onFill");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-322372817);
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(onFill, c28655q);
        c28655q.m87150e0(-1148860887);
        boolean zM87153g = c28655q.m87153g(list);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C3867l(list, (Function1) interfaceC28601c1M87238F.getValue());
            c28655q.m87172p0(objM87133R);
        }
        C3867l c3867l = (C3867l) objM87133R;
        c28655q.m87173q(false);
        InterfaceC3863h interfaceC3863h = (InterfaceC3863h) c28655q.m87161k(AbstractC2453v1.f9563b);
        ((C3868m) c28655q.m87161k(AbstractC2453v1.f9564c)).f15804a.put(Integer.valueOf(c3867l.m11853b()), c3867l);
        c28655q.m87150e0(-1148853015);
        boolean zM87157i = c28655q.m87157i(c3867l);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new C26944e0(c3867l, 27);
            c28655q.m87172p0(objM87133R2);
        }
        c28655q.m87173q(false);
        Modifier modifierM3500d = AbstractC1131a.m3500d(modifier, (Function1) objM87133R2);
        c28655q.m87150e0(-1148850260);
        boolean zM87157i2 = c28655q.m87157i(c3867l) | c28655q.m87157i(interfaceC3863h);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i2 || objM87133R3 == c28676v0) {
            objM87133R3 = new C27050m(19, c3867l, interfaceC3863h);
            c28655q.m87172p0(objM87133R3);
        }
        c28655q.m87173q(false);
        Modifier modifierM3484c = AbstractC1126a.m3484c(modifierM3500d, (Function1) objM87133R3);
        c28655q.m87173q(false);
        return modifierM3484c;
    }

    /* JADX INFO: renamed from: o */
    public static Bitmap m110154o(Activity activity, InterfaceC20602v0 interfaceC20602v0, C20121k0 c20121k0) {
        boolean z4 = false;
        if (activity.isFinishing() || activity.isDestroyed()) {
            interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View rootView = viewPeekDecorView.getRootView();
        if (rootView == null) {
            interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
            return null;
        }
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            c20121k0.getClass();
            HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
            handlerThread.start();
            try {
                Handler handler = new Handler(handlerThread.getLooper());
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                PixelCopy.request(window, bitmapCreateBitmap, new PixelCopyOnPixelCopyFinishedListenerC20110k(0, atomicBoolean, countDownLatch), handler);
                if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS) && atomicBoolean.get()) {
                    z4 = true;
                }
            } catch (Throwable th3) {
                try {
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Taking screenshot using PixelCopy failed.", th3);
                } catch (Throwable th4) {
                    handlerThread.quit();
                    throw th4;
                }
            }
            handlerThread.quit();
            if (z4) {
                return bitmapCreateBitmap;
            }
            return null;
        } catch (Throwable th5) {
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Taking screenshot failed.", th5);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m110155p(long j7, String str) {
        if (j7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j7 + ") must be >= 0");
    }

    /* JADX INFO: renamed from: q */
    public static final long m110156q(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        Resources resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = AbstractC34523k.f145117a;
        return AbstractC17918w0.m51515c(resources.getColor(i13, theme));
    }

    /* JADX INFO: renamed from: r */
    public static C2547j0 m110157r(AbstractC12605c viewModel, C35459c0 paymentMethodMetadata) {
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3069w1 abstractC3069w1 = AbstractC17182o.f65999a;
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(abstractC3069w1.plus(AbstractC3006f0.m8710d()));
        C16657g c16657gM47261b = C16735t.m47261b(viewModel, paymentMethodMetadata, 4);
        C0106e c0106e = new C0106e(1, viewModel, AbstractC12605c.class, "updateSelection", "updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0, 21);
        C35459c0 c35459c0 = (C35459c0) viewModel.f43008L.getValue();
        C0352d c0352d = new C0352d(c35459c0 != null ? c35459c0.f150979V : null);
        C11514a c11514a = new C11514a(c0106e, c0352d);
        int i13 = 0;
        int i14 = 1;
        return new C2547j0(viewModel.m35329l(), viewModel.f43012P, viewModel.f43013Q, viewModel.f43011O, (C13081r1) c0352d.f1239z, paymentMethodMetadata.m112532J(), new C0106e(i14, c16657gM47261b, C16657g.class, "createFormArguments", "createFormArguments(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", i13, 5), new C0106e(i14, c16657gM47261b, C16657g.class, "formElementsForCode", "formElementsForCode(Ljava/lang/String;)Ljava/util/List;", i13, 6), new C2539i0(0, viewModel, AbstractC12605c.class, "clearErrorMessages", "clearErrorMessages()V", 0, 0), new C0106e(1, viewModel.f43021Y, C22139d.class, "reportFieldInteraction", "reportFieldInteraction(Ljava/lang/String;)V", 0, 7), new C1836v0(2, c16657gM47261b, C16657g.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", i13, 1), new C0106e(1, viewModel.f43026x, C22136a.class, "onSelectPaymentMethod", "onSelectPaymentMethod(Ljava/lang/String;)V", 0, 8), new C29656q(viewModel, paymentMethodMetadata, c11514a, 8), c17171dM8708b, abstractC3069w1, new C2531h0(viewModel, 0), paymentMethodMetadata.f150996w.mo124338q0());
    }

    /* JADX INFO: renamed from: s */
    public static ExecutorC4220l m110158s(Handler handler) {
        return new ExecutorC4220l(handler, 0);
    }

    /* JADX INFO: renamed from: t */
    public static final C37058h m110159t(InterfaceC21463e interfaceC21463e, List arguments, boolean z4) {
        InterfaceC31126h descriptor;
        AbstractC23804u0 c23778h0;
        AbstractC22676k.m65750j(interfaceC21463e, "<this>");
        AbstractC22676k.m65750j(arguments, "arguments");
        if (interfaceC21463e instanceof KClassImpl) {
            descriptor = ((KClassImpl) interfaceC21463e).getDescriptor();
        } else {
            if (!(interfaceC21463e instanceof KTypeParameterImpl)) {
                throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + interfaceC21463e + " (" + interfaceC21463e.getClass() + ')');
            }
            descriptor = ((KTypeParameterImpl) interfaceC21463e).getDescriptor();
        }
        AbstractC21598x.m60694p(descriptor.mo60496e().getParameters().size(), arguments.size());
        InterfaceC23796q0 interfaceC23796q0Mo60496e = descriptor.mo60496e();
        AbstractC22676k.m65749i(interfaceC23796q0Mo60496e, "getTypeConstructor(...)");
        List parameters = interfaceC23796q0Mo60496e.getParameters();
        AbstractC22676k.m65749i(parameters, "getParameters(...)");
        C23784k0.f94165x.getClass();
        C23784k0 c23784k0 = C23784k0.f94166y;
        List list = arguments;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                return new C37058h(AbstractC23791o.m69890i(arrayList, c23784k0, interfaceC23796q0Mo60496e, z4), null);
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C21462d0 c21462d0 = (C21462d0) next;
            C37058h c37058h = (C37058h) c21462d0.f82425b;
            AbstractC23811y abstractC23811y = c37058h != null ? c37058h.f158553x : null;
            EnumC21464e0 enumC21464e0 = c21462d0.f82424a;
            int i15 = enumC21464e0 == null ? -1 : AbstractC22304a.f87028a[enumC21464e0.ordinal()];
            if (i15 == -1) {
                Object obj = parameters.get(i13);
                AbstractC22676k.m65749i(obj, "get(...)");
                c23778h0 = new C23778h0((InterfaceC31165x0) obj);
            } else if (i15 == 1) {
                EnumC23776g1 enumC23776g1 = EnumC23776g1.INVARIANT;
                AbstractC22676k.m65747g(abstractC23811y);
                c23778h0 = new C23806v0(abstractC23811y, enumC23776g1);
            } else if (i15 == 2) {
                EnumC23776g1 enumC23776g2 = EnumC23776g1.IN_VARIANCE;
                AbstractC22676k.m65747g(abstractC23811y);
                c23778h0 = new C23806v0(abstractC23811y, enumC23776g2);
            } else {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                EnumC23776g1 enumC23776g3 = EnumC23776g1.OUT_VARIANCE;
                AbstractC22676k.m65747g(abstractC23811y);
                c23778h0 = new C23806v0(abstractC23811y, enumC23776g3);
            }
            arrayList.add(c23778h0);
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: u */
    public static C26726a m110160u(C13117a c13117a) {
        long jM36684F = 0;
        String strM36711u = "";
        String strM36711u2 = "";
        while (true) {
            int iM36714x = c13117a.m36714x();
            if (iM36714x == 0) {
                return new C26726a(jM36684F, strM36711u, strM36711u2);
            }
            int i13 = iM36714x >>> 3;
            int i14 = iM36714x & 7;
            switch (i13) {
                case 1:
                    C13117a.m36678d(i13, 0, i14);
                    c13117a.m36684F();
                    break;
                case 2:
                    C13117a.m36678d(i13, 0, i14);
                    jM36684F = c13117a.m36684F();
                    break;
                case 3:
                    C13117a.m36678d(i13, 0, i14);
                    c13117a.m36684F();
                    break;
                case 4:
                    C13117a.m36678d(i13, 2, i14);
                    strM36711u = c13117a.m36711u();
                    break;
                case 5:
                    C13117a.m36678d(i13, 0, i14);
                    c13117a.m36684F();
                    break;
                case 6:
                    C13117a.m36678d(i13, 2, i14);
                    strM36711u2 = c13117a.m36711u();
                    break;
                case 7:
                    C13117a.m36678d(i13, 0, i14);
                    c13117a.m36684F();
                    break;
                case 8:
                    C13117a.m36678d(i13, 2, i14);
                    c13117a.m36711u();
                    break;
                default:
                    c13117a.m36691M(i14);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static C26701n m110161v(C13117a c13117a) {
        while (true) {
            int iM36714x = c13117a.m36714x();
            if (iM36714x == 0) {
                return new C26701n(5);
            }
            int i13 = iM36714x >>> 3;
            int i14 = iM36714x & 7;
            if (i13 == 1) {
                C13117a.m36678d(i13, 2, i14);
                c13117a.m36711u();
            } else if (i13 == 2) {
                C13117a.m36678d(i13, 2, i14);
                c13117a.m36711u();
            } else if (i13 == 3) {
                C13117a.m36678d(i13, 0, i14);
                c13117a.m36684F();
            } else if (i13 == 4) {
                C13117a.m36678d(i13, 2, i14);
                c13117a.m36698h();
            } else if (i13 != 6) {
                c13117a.m36691M(i14);
            } else {
                C13117a.m36678d(i13, 2, i14);
                C13117a c13117aM36707q = c13117a.m36707q();
                while (true) {
                    int iM36714x2 = c13117aM36707q.m36714x();
                    if (iM36714x2 != 0) {
                        int i15 = iM36714x2 >>> 3;
                        int i16 = iM36714x2 & 7;
                        if (i15 != 1) {
                            c13117aM36707q.m36691M(i16);
                        } else {
                            C13117a.m36678d(i15, 2, i16);
                            c13117aM36707q.m36698h();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m110162w(C13117a c13117a, HashMap map) {
        int i13;
        int i14;
        C13117a c13117a2;
        int i15 = 0;
        C26729d c26729d = null;
        int iM36684F = 0;
        while (true) {
            int iM36714x = c13117a.m36714x();
            if (iM36714x == 0) {
                if (c26729d != null) {
                    map.put(Integer.valueOf(iM36684F), c26729d);
                    return;
                }
                return;
            }
            int i16 = iM36714x >>> 3;
            int i17 = iM36714x & 7;
            int i18 = 1;
            if (i16 == 1) {
                i13 = i15;
                C13117a.m36678d(i16, i13, i17);
                iM36684F = (int) c13117a.m36684F();
            } else if (i16 != 2) {
                c13117a.m36691M(i17);
                i13 = i15;
            } else {
                C13117a.m36678d(i16, 2, i17);
                C13117a c13117aM36707q = c13117a.m36707q();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int iM36684F2 = i15;
                String strM36711u = "";
                while (true) {
                    int iM36714x2 = c13117aM36707q.m36714x();
                    if (iM36714x2 != 0) {
                        int i19 = iM36714x2 >>> 3;
                        int i24 = iM36714x2 & 7;
                        switch (i19) {
                            case 1:
                                i14 = i15;
                                c13117a2 = c13117aM36707q;
                                C13117a.m36678d(i19, i14, i24);
                                iM36684F2 = (int) c13117a2.m36684F();
                                break;
                            case 2:
                                c13117a2 = c13117aM36707q;
                                C13117a.m36678d(i19, 2, i24);
                                strM36711u = c13117a2.m36711u();
                                i14 = 0;
                                break;
                            case 3:
                                C13117a.m36678d(i19, 2, i24);
                                C13117a c13117aM36707q2 = c13117aM36707q.m36707q();
                                String strM36711u2 = "";
                                long jM36684F = 0;
                                while (true) {
                                    int iM36714x3 = c13117aM36707q2.m36714x();
                                    if (iM36714x3 == 0) {
                                        c13117a2 = c13117aM36707q;
                                        arrayList.add(new C26728c(strM36711u2, jM36684F));
                                        i14 = 0;
                                    } else {
                                        int i25 = iM36714x3 >>> 3;
                                        C13117a c13117a3 = c13117aM36707q;
                                        int i26 = iM36714x3 & 7;
                                        if (i25 == i18) {
                                            C13117a.m36678d(i25, 2, i26);
                                            strM36711u2 = c13117aM36707q2.m36711u();
                                        } else if (i25 != 2) {
                                            c13117aM36707q2.m36691M(i26);
                                        } else {
                                            C13117a.m36678d(i25, 0, i26);
                                            jM36684F = c13117aM36707q2.m36684F();
                                        }
                                        c13117aM36707q = c13117a3;
                                        i18 = 1;
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                C13117a.m36678d(i19, 2, i24);
                                arrayList4.add(m110160u(c13117aM36707q.m36707q()));
                                c13117a2 = c13117aM36707q;
                                i14 = 0;
                                break;
                            case 5:
                                C13117a.m36678d(i19, 2, i24);
                                arrayList5.add(m110161v(c13117aM36707q.m36707q()));
                                c13117a2 = c13117aM36707q;
                                i14 = 0;
                                break;
                            case 6:
                                C13117a.m36678d(i19, i15, i24);
                                c13117aM36707q.m36684F();
                                i14 = i15;
                                c13117a2 = c13117aM36707q;
                                break;
                            case 7:
                                C13117a.m36678d(i19, 2, i24);
                                arrayList2.add(c13117aM36707q.m36711u());
                                c13117a2 = c13117aM36707q;
                                i14 = 0;
                                break;
                            case 8:
                                C13117a.m36678d(i19, i15, i24);
                                c13117aM36707q.m36684F();
                                i14 = i15;
                                c13117a2 = c13117aM36707q;
                                break;
                            case 9:
                                C13117a.m36678d(i19, 2, i24);
                                arrayList3.add(c13117aM36707q.m36711u());
                                c13117a2 = c13117aM36707q;
                                i14 = 0;
                                break;
                            default:
                                c13117aM36707q.m36691M(i24);
                                c13117a2 = c13117aM36707q;
                                i14 = 0;
                                break;
                        }
                        i15 = i14;
                        c13117aM36707q = c13117a2;
                        i18 = 1;
                    } else {
                        i13 = i15;
                        c26729d = new C26729d(iM36684F2, strM36711u, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
                    }
                }
            }
            i15 = i13;
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m110163x(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i13 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i13 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m110164y(Context context, C5309c c5309c, int i13) {
        if (c5309c != null) {
            C5313d c5313d = new C5313d(i13);
            if (c5309c.m16417c() != null && c5309c.m16417c().equals("openUrl")) {
                Uri uri = Uri.parse(c5309c.f21650a.optString("data", null));
                String str = uri.toString().split("://")[0];
                if (!str.equals("https")) {
                    String[] strArr = C5341k.f21742r.f21744b.f21881g;
                    int length = strArr.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            AbstractC12350b.m34593n("IterableUtilImpl", str.concat(" is not in the allowed protocols"));
                            return false;
                        }
                        if (str.equals(strArr[i14])) {
                            break;
                        }
                        i14++;
                    }
                }
                if (C5341k.f21742r.f21744b.f21876b != null && C5341k.f21742r.f21744b.f21876b.mo16437a(uri, c5313d)) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                if (context.getPackageManager() == null) {
                    AbstractC12350b.m34595p("IterableActionRunner", "Could not find package manager to handle deep link:" + uri);
                    return false;
                }
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
                if (listQueryIntentActivities.size() > 1) {
                    for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                        if (resolveInfo.activityInfo.packageName.equals(context.getPackageName())) {
                            Log.d("IterableActionRunner", "The deep link will be handled by the app: " + resolveInfo.activityInfo.packageName);
                            intent.setPackage(resolveInfo.activityInfo.packageName);
                            break;
                        }
                    }
                }
                intent.setFlags(872415232);
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(intent);
                    return true;
                }
                AbstractC12350b.m34595p("IterableActionRunner", "Could not find activities to handle deep link:" + uri);
                return false;
            }
            if (c5309c.m16417c() != null && !c5309c.m16417c().isEmpty() && C5341k.f21742r.f21744b.f21877c != null) {
                return C5341k.f21742r.f21744b.f21877c.mo16540a(c5309c, c5313d);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static final ContentBlock m110165z(NudgeStep nudgeStep) {
        Object next;
        AbstractC22676k.m65750j(nudgeStep, "<this>");
        Iterator<T> it = nudgeStep.getContent().iterator();
        while (it.hasNext()) {
            next = it.next();
            ContentBlock contentBlock = (ContentBlock) next;
            if ((contentBlock instanceof SurveyTextShortBlock) || (contentBlock instanceof SurveyTextBlock) || (contentBlock instanceof SurveyListBlock) || (contentBlock instanceof SurveyRatingBlock)) {
                return (ContentBlock) next;
            }
        }
        next = null;
        return (ContentBlock) next;
    }
}
