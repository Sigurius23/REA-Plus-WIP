package sc0;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.google.android.gms.common.api.C4976g;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.whoop.advancedlabs.feature.marketingconsent.view.MarketingConsentFragment;
import com.whoop.advancedlabs.rafReceiver.view.RafReceiverFragment;
import com.whoop.advancedlabsjoin.feature.join.view.AdvancedLabsJoinFragment;
import com.whoop.android.R;
import com.whoop.cache.persistence.BffCacheDatabase_Impl;
import com.whoop.debug.localservice.DebugLocalServiceFragment;
import com.whoop.debug.lottietester.LottieTesterFragment;
import com.whoop.debug.share.ShareDebugFragment;
import com.whoop.settings.switchPlan.SwitchPlanDialogFragment;
import com.whoop.sleep.coach.alarmWarning.view.TurnoffAlarmWarningFragment;
import d30.C11530f0;
import e93.AbstractC12889b;
import fi.AbstractC14504j;
import fi.AbstractC14505k;
import fi.C14509o;
import gi.C15878i;
import gi.EnumC15873d;
import gi.EnumC15876g;
import io.sentry.android.replay.video.C20245d;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C22136a;
import k30.C22170c;
import l83.C23454a0;
import ne3.AbstractC26604b;
import ne3.C26619i0;
import ne3.C26621j0;
import p077d0.C11387o2;
import p096dq.AbstractC12277u;
import p096dq.C12272p;
import p096dq.C12276t;
import p116ef.C13140a;
import p180h0.EnumC16377d2;
import p181h2.C16620e;
import p249jc.C21568b0;
import p273k6.C22222g;
import p294l3.C23254g;
import p319m4.AbstractC25012a;
import p390p1.C28633k1;
import p461rh.AbstractC31426o;
import p461rh.InterfaceC31421j;
import p474s.AbstractC32004s;
import p499t9.C33623c0;
import p507tx.AbstractC34235f;
import p510u0.C34340n1;
import p510u0.C34354s0;
import p542v3.C35591d;
import p636y3.C39178j;
import p636y3.C39179k;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import rt1.C31809g;
import sh.AbstractC32489o;
import sh.C32476b;
import sh.C32479e;
import sh.C32483i;
import sh.C32486l;
import sh.C32487m;
import sr.AbstractC32893a;
import sr.C32894b;
import sr.C32905m;
import st1.AbstractC32991l;
import sz.C33121b;
import sz.C33125d;
import sz.C33127e;
import sz.EnumC33131g;
import t30.DialogC33515q;
import t40.C33536f;
import u10.C34416d;
import u10.C34423k;
import u10.C34429q;
import u40.InterfaceC34532h;
import uc3.C34768f;
import uc3.C34775m;
import uz1.AbstractC35436n;
import uz1.C35437o;
import v01.AbstractC35510l;
import v01.C35511m;
import v41.AbstractC35667g0;
import va3.AbstractC35854l;
import vb1.C35868a;
import vg.InterfaceC35960g;
import vt2.AbstractC36497f;
import vt2.C36499h;
import x30.AbstractC37926s0;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: sc0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32355c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133923w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f133924x;

    public /* synthetic */ C32355c(Object obj, int i13) {
        this.f133923w = i13;
        this.f133924x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() throws Exception {
        boolean z4;
        C32486l c32486l;
        boolean z13;
        Bitmap bitmapCreateBitmap;
        int i13;
        int iMin;
        double dMax;
        C32905m c32905m;
        switch (this.f133923w) {
            case 0:
                return MarketingConsentFragment.m17459E((MarketingConsentFragment) this.f133924x);
            case 1:
                C32479e c32479e = (C32479e) this.f133924x;
                BitmapFactory.Options options = new BitmapFactory.Options();
                C14509o c14509o = c32479e.f134500b;
                C32476b c32476b = new C32476b(c32479e.f134499a.mo101470d1());
                C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(c32476b);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new C26619i0(c26621j0M79158c.peek()), null, options);
                Exception exc = (Exception) c32476b.f134491y;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = AbstractC32489o.f134522a;
                String str = options.outMimeType;
                switch (c32479e.f134502d.f134521a) {
                    case 0:
                        z4 = str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"));
                        break;
                    default:
                        z4 = true;
                        break;
                }
                if (z4) {
                    C22222g c22222g = new C22222g(new C32487m(new C26619i0(c26621j0M79158c.peek())));
                    c32486l = new C32486l(c22222g.m63704p(), c22222g.m63700l());
                } else {
                    c32486l = C32486l.f134513c;
                }
                int i14 = c32486l.f134515b;
                boolean z14 = c32486l.f134514a;
                Exception exc2 = (Exception) c32476b.f134491y;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                ColorSpace colorSpaceM41413b = AbstractC14505k.m41413b(c14509o);
                Context context = c14509o.f53003a;
                if (colorSpaceM41413b != null) {
                    options.inPreferredColorSpace = (ColorSpace) AbstractC31426o.m96742f(c14509o, AbstractC14505k.f52995c);
                }
                options.inPremultiplied = ((Boolean) AbstractC31426o.m96742f(c14509o, AbstractC14505k.f52996d)).booleanValue();
                Bitmap.Config config = (Bitmap.Config) AbstractC31426o.m96742f(c14509o, AbstractC14505k.f52994b);
                if ((z14 || i14 > 0) && (config == null || AbstractC37926s0.m121481u(config))) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) AbstractC31426o.m96742f(c14509o, AbstractC14505k.f52999g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && AbstractC22676k.m65745e(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                int i15 = options.outWidth;
                if (i15 <= 0 || (i13 = options.outHeight) <= 0) {
                    options.inSampleSize = 1;
                    z13 = false;
                    options.inScaled = false;
                } else {
                    int i16 = (i14 == 90 || i14 == 270) ? i13 : i15;
                    if (i14 != 90 && i14 != 270) {
                        i15 = i13;
                    }
                    C15878i c15878i = c14509o.f53004b;
                    EnumC15876g enumC15876g = c14509o.f53005c;
                    long jM99537f = AbstractC32004s.m99537f(i16, i15, c15878i, enumC15876g, (C15878i) AbstractC31426o.m96742f(c14509o, AbstractC14504j.f52990b));
                    int i17 = (int) (jM99537f >> 32);
                    int i18 = (int) (jM99537f & 4294967295L);
                    int iHighestOneBit = Integer.highestOneBit(i16 / i17);
                    int iHighestOneBit2 = Integer.highestOneBit(i15 / i18);
                    z14 = z14;
                    int iOrdinal = enumC15876g.ordinal();
                    if (iOrdinal == 0) {
                        iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                    }
                    if (iMin < 1) {
                        iMin = 1;
                    }
                    options.inSampleSize = iMin;
                    double d3 = iMin;
                    context = context;
                    double d14 = ((double) i17) / (((double) i16) / d3);
                    double d15 = ((double) i18) / (((double) i15) / d3);
                    int iOrdinal2 = enumC15876g.ordinal();
                    if (iOrdinal2 == 0) {
                        dMax = Math.max(d14, d15);
                    } else {
                        if (iOrdinal2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dMax = Math.min(d14, d15);
                    }
                    if (c14509o.f53006d == EnumC15873d.f59981x && dMax > 1.0d) {
                        dMax = 1.0d;
                    }
                    boolean z15 = dMax == 1.0d;
                    options.inScaled = !z15;
                    if (!z15) {
                        if (dMax > 1.0d) {
                            options.inDensity = AbstractC12889b.m36257W(((double) Integer.MAX_VALUE) / dMax);
                            options.inTargetDensity = Integer.MAX_VALUE;
                        } else {
                            options.inDensity = Integer.MAX_VALUE;
                            options.inTargetDensity = AbstractC12889b.m36257W(((double) Integer.MAX_VALUE) * dMax);
                        }
                    }
                    z13 = false;
                }
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new C26619i0(c26621j0M79158c), null, options);
                    c26621j0M79158c.close();
                    Exception exc3 = (Exception) c32476b.f134491y;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (bitmapDecodeStream == null) {
                        throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                    }
                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z14 || i14 > 0) {
                        Matrix matrix = new Matrix();
                        float width = bitmapDecodeStream.getWidth() / 2.0f;
                        float height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z14) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i14 > 0) {
                            matrix.postRotate(i14, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f13 = rectF.left;
                        if (f13 != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f13, -rectF.top);
                        }
                        if (i14 == 90 || i14 == 270) {
                            int height2 = bitmapDecodeStream.getHeight();
                            int width2 = bitmapDecodeStream.getWidth();
                            Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                        } else {
                            int width3 = bitmapDecodeStream.getWidth();
                            int height3 = bitmapDecodeStream.getHeight();
                            Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC32489o.f134522a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    InterfaceC31421j interfaceC31421jM96739c = AbstractC31426o.m96739c(new BitmapDrawable(context.getResources(), bitmapDecodeStream));
                    if (options.inSampleSize > 1 || options.inScaled) {
                        z13 = true;
                    }
                    return new C32483i(interfaceC31421jM96739c, z13);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(c26621j0M79158c, th3);
                        throw th4;
                    }
                }
            case 2:
                return AbstractC32991l.m104154F((C31809g) this.f133924x);
            case 3:
                return DebugLocalServiceFragment.m20075D((DebugLocalServiceFragment) this.f133924x);
            case 4:
                C33125d c33125d = (C33125d) this.f133924x;
                C33127e c33127e = c33125d.f138183e;
                EnumC33131g environment = c33125d.f138179a;
                c33127e.getClass();
                AbstractC22676k.m65750j(environment, "environment");
                C11387o2 c11387o2 = new C11387o2(2);
                c11387o2.m30623o(environment.f138197w);
                return new C33121b(new C12272p(c33127e.f138189a, null, AbstractC12277u.f41106a, new C12276t(c11387o2), C4976g.f20501c));
            case 5:
                C22136a c22136a = (C22136a) ((C11530f0) this.f133924x).f37149b;
                C33623c0 c33623c0 = EnumC38828f4.f167088G;
                c22136a.m63394n("us_bank_account");
                return C23454a0.f92919a;
            case 6:
                View viewInflate = ((DialogC33515q) this.f133924x).getLayoutInflater().inflate(R.layout.stripe_challenge_submit_dialog, (ViewGroup) null, false);
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) AbstractC34235f.m108203J(viewInflate, R.id.progress_bar);
                if (circularProgressIndicator != null) {
                    return new C22170c((FrameLayout) viewInflate, circularProgressIndicator);
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.progress_bar)));
            case 7:
                Context context2 = (Application) ((C33536f) this.f133924x).f139993c.f122249x;
                synchronized (AbstractC32893a.class) {
                    try {
                        if (AbstractC32893a.f137093a == null) {
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext != null) {
                                context2 = applicationContext;
                            }
                            AbstractC32893a.f137093a = new C32905m(context2);
                        }
                        c32905m = AbstractC32893a.f137093a;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                C32894b c32894b = (C32894b) c32905m.f137125w.mo45127a();
                AbstractC22676k.m65749i(c32894b, "createStandard(...)");
                return c32894b;
            case 8:
                return SwitchPlanDialogFragment.m25805K((SwitchPlanDialogFragment) this.f133924x);
            case 9:
                return LottieTesterFragment.m20082D((LottieTesterFragment) this.f133924x);
            case 10:
                return (C23254g) this.f133924x;
            case 11:
                return new C34340n1((EnumC16377d2) this.f133924x, 0.0f);
            case 12:
                return ((C34354s0) this.f133924x).m108662d();
            case 13:
                return new C39178j(((C39179k) this.f133924x).m124797b());
            case 14:
                ((C34429q) ((C34416d) this.f133924x).f144646f.get()).m108796a(C34423k.f144661b);
                return C23454a0.f92919a;
            case 15:
                Iterator it = ((ArrayList) ((C20245d) this.f133924x).f76049e).iterator();
                while (it.hasNext()) {
                    ((InterfaceC34532h) it.next()).mo109106h();
                }
                return C23454a0.f92919a;
            case 16:
                return "Unexpected end of input: yet to parse " + ((C34768f) this.f133924x).m109778b();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC25012a.m73377j(new StringBuilder("Unexpected end of input: yet to parse '"), ((C34775m) this.f133924x).f146444a, '\'');
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return RafReceiverFragment.m17509G((RafReceiverFragment) this.f133924x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return "resolved endpoint: " + ((C13140a) this.f133924x);
            case 20:
                return AdvancedLabsJoinFragment.m17699C((AdvancedLabsJoinFragment) this.f133924x);
            case 21:
                return BffCacheDatabase_Impl.m18301d((BffCacheDatabase_Impl) this.f133924x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ShareDebugFragment.m20089C((ShareDebugFragment) this.f133924x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return Integer.valueOf(AbstractC35436n.m112482k((C35437o) this.f133924x));
            case 24:
                return AbstractC35510l.m112626B((C35511m) this.f133924x);
            case 25:
                C35591d c35591d = (C35591d) this.f133924x;
                C28633k1 c28633k1 = c35591d.f151358y;
                if (((C16620e) c28633k1.getValue()).f63951a == 9205357640488583168L || C16620e.m47214f(((C16620e) c28633k1.getValue()).f63951a)) {
                    return null;
                }
                return c35591d.f151356w.mo29549b(((C16620e) c28633k1.getValue()).f63951a);
            case 26:
                return AbstractC35667g0.m112973o((InterfaceC25312u) this.f133924x);
            case 27:
                return TurnoffAlarmWarningFragment.m25917F((TurnoffAlarmWarningFragment) this.f133924x);
            case 28:
                C21568b0 c21568b0 = (C21568b0) this.f133924x;
                return ((Function1) c21568b0.f82713c).invoke(((InterfaceC35960g) c21568b0.f82715e).mo56533g(new C35868a(3)));
            default:
                return AbstractC36497f.m116964J((C36499h) this.f133924x);
        }
    }
}
