package p007a6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.health.platform.client.proto.C1533u;
import androidx.work.impl.WorkDatabase;
import b23.C2343i;
import b23.C2345k;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import coil.compose.AsyncImagePainter;
import com.whoop.data.remote.domain.response.growth.UserStraps;
import com.whoop.data.repositories.UserStrapsRepository;
import d61.InterfaceC11732a;
import dk0.AbstractC12109i;
import e61.AbstractC12765h;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.ChatApiConfig;
import io.getstream.chat.android.client.api.interceptor.HeadersInterceptor;
import io.getstream.chat.android.client.api2.MoshiChatApi;
import io.getstream.chat.android.client.parser2.MoshiChatParser;
import io.getstream.chat.android.client.parser2.adapters.CustomObjectDtoAdapter;
import io.getstream.chat.android.client.persistence.p225db.ChatClientDatabase_Impl;
import io.getstream.chat.android.client.persistence.p225db.dao.MessageReceiptDao_Impl;
import io.getstream.chat.android.client.scope.user.UserIdentifier;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import jj1.C21740b;
import l83.C23454a0;
import lb.C23573p;
import lc.AbstractC23815a;
import lc.C23817c;
import mh.C25542j;
import mh.C25545m;
import n73.InterfaceC26443b;
import ne3.AbstractC26604b;
import ne3.C26619i0;
import ne3.C26621j0;
import p005a3.AbstractC0201g;
import p077d0.AbstractC11348f;
import p077d0.C11350f1;
import p077d0.C11421z1;
import p092dh.AbstractC12027n;
import p092dh.AbstractC12028o;
import p092dh.AbstractC12037x;
import p092dh.C12015b;
import p092dh.C12018e;
import p092dh.C12021h;
import p092dh.C12024k;
import p092dh.C12025l;
import p092dh.C12038y;
import p092dh.EnumC12026m;
import p098dt.AbstractC12350b;
import p105e1.C12529p;
import p105e1.C12532s;
import p132f0.AbstractC13788g1;
import p132f0.C13798k;
import p132f0.C13801l;
import p132f0.C13824s1;
import p163g1.C14949a2;
import p163g1.C15093n7;
import p163g1.EnumC14960b2;
import p180h0.C16473w2;
import p249jc.AbstractC21585k;
import p249jc.C21589o;
import p249jc.C21596v;
import p273k6.C22222g;
import p341nh.C26714h;
import p341nh.EnumC26713g;
import p425qh.AbstractC30358d;
import p457rc.AbstractC31218a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pl0.C29343a;
import q73.EnumC30025d;
import u82.C34643d;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: a6.l0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0438l0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1506w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f1507x;

    public /* synthetic */ C0438l0(Object obj, int i13) {
        this.f1506w = i13;
        this.f1507x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01e7  */
    @Override // c93.InterfaceC4339a
    public final Object invoke() throws Exception {
        C12024k c12024k;
        boolean z4;
        int i13;
        int iMin;
        double dMax;
        Bitmap bitmapCreateBitmap;
        int i14 = 2;
        switch (this.f1506w) {
            case 0:
                File file = (File) this.f1507x;
                synchronized (C0441m0.f1513e) {
                    C0441m0.f1512d.remove(file.getAbsolutePath());
                }
                return C23454a0.f92919a;
            case 1:
                ((Runnable) this.f1507x).run();
                return C23454a0.f92919a;
            case 2:
                return ((Callable) this.f1507x).call();
            case 3:
                return new C2345k((String) this.f1507x, C2343i.f9271c, C2343i.f9272d);
            case 4:
                return (C25542j) ((AsyncImagePainter) this.f1507x).f20224R.getValue();
            case 5:
                return Boolean.valueOf(UserStrapsRepository.updateStrapGenerationStatus$lambda$0((UserStraps) this.f1507x));
            case 6:
                return Float.valueOf(AbstractC11348f.m30568p(((InterfaceC2994c0) this.f1507x).getCoroutineContext()));
            case 7:
                C11350f1 c11350f1 = (C11350f1) this.f1507x;
                C11421z1 c11421z1 = c11350f1.f36381F;
                c11350f1.f36382G = c11421z1 != null ? ((Number) c11421z1.f36641l.getValue()).longValue() : 0L;
                return C23454a0.f92919a;
            case 8:
                C12018e c12018e = (C12018e) this.f1507x;
                BitmapFactory.Options options = new BitmapFactory.Options();
                C25545m c25545m = c12018e.f39756b;
                AbstractC12037x abstractC12037x = c12018e.f39755a;
                C12015b c12015b = new C12015b(abstractC12037x.mo33152d1());
                C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(c12015b);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new C26619i0(c26621j0M79158c.peek()), null, options);
                Exception exc = (Exception) c12015b.f39747y;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = AbstractC12027n.f39774a;
                String str = options.outMimeType;
                EnumC12026m enumC12026m = c12018e.f39758d;
                Set set = AbstractC12028o.f39775a;
                int iOrdinal = enumC12026m.ordinal();
                if (iOrdinal == 0) {
                    c12024k = C12024k.f39767c;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (str == null || !AbstractC12028o.f39775a.contains(str)) {
                        c12024k = C12024k.f39767c;
                    }
                    C22222g c22222g = new C22222g(new C12025l(new C26619i0(c26621j0M79158c.peek())));
                    c12024k = new C12024k(c22222g.m63704p(), c22222g.m63700l());
                }
                int i15 = c12024k.f39769b;
                boolean z13 = c12024k.f39768a;
                Exception exc2 = (Exception) c12015b.f39747y;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                ColorSpace colorSpace = c25545m.f100137c;
                Context context = c25545m.f100135a;
                C26714h c26714h = c25545m.f100138d;
                if (colorSpace != null) {
                    options.inPreferredColorSpace = colorSpace;
                }
                options.inPremultiplied = c25545m.f100142h;
                Bitmap.Config config = c25545m.f100136b;
                if ((z13 || i15 > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (c25545m.f100141g && config == Bitmap.Config.ARGB_8888 && AbstractC22676k.m65745e(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                AbstractC12350b abstractC12350bMo33151b = abstractC12037x.mo33151b();
                if ((abstractC12350bMo33151b instanceof C12038y) && AbstractC22676k.m65745e(c26714h, C26714h.f106216c)) {
                    options.inSampleSize = 1;
                    options.inScaled = true;
                    options.inDensity = ((C12038y) abstractC12350bMo33151b).f39808c;
                    options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                    z4 = false;
                } else {
                    int i16 = options.outWidth;
                    if (i16 <= 0 || (i13 = options.outHeight) <= 0) {
                        options.inSampleSize = 1;
                        z4 = false;
                        options.inScaled = false;
                    } else {
                        int i17 = (i15 == 90 || i15 == 270) ? i13 : i16;
                        if (i15 != 90 && i15 != 270) {
                            i16 = i13;
                        }
                        EnumC26713g enumC26713g = c25545m.f100139e;
                        C26714h c26714h2 = C26714h.f106216c;
                        int iM92830d = AbstractC22676k.m65745e(c26714h, c26714h2) ? i17 : AbstractC30358d.m92830d(c26714h.f106217a, enumC26713g);
                        int iM92830d2 = AbstractC22676k.m65745e(c26714h, c26714h2) ? i16 : AbstractC30358d.m92830d(c26714h.f106218b, enumC26713g);
                        int iHighestOneBit = Integer.highestOneBit(i17 / iM92830d);
                        int iHighestOneBit2 = Integer.highestOneBit(i16 / iM92830d2);
                        int iOrdinal2 = enumC26713g.ordinal();
                        if (iOrdinal2 == 0) {
                            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                        } else {
                            if (iOrdinal2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                        }
                        if (iMin < 1) {
                            iMin = 1;
                        }
                        options.inSampleSize = iMin;
                        double d3 = iMin;
                        double d14 = ((double) iM92830d) / (((double) i17) / d3);
                        double d15 = ((double) iM92830d2) / (((double) i16) / d3);
                        int iOrdinal3 = enumC26713g.ordinal();
                        if (iOrdinal3 == 0) {
                            dMax = Math.max(d14, d15);
                        } else {
                            if (iOrdinal3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dMax = Math.min(d14, d15);
                        }
                        if (c25545m.f100140f && dMax > 1.0d) {
                            dMax = 1.0d;
                        }
                        boolean z14 = dMax == 1.0d;
                        options.inScaled = !z14;
                        if (!z14) {
                            if (dMax > 1.0d) {
                                options.inDensity = AbstractC12889b.m36257W(((double) Integer.MAX_VALUE) / dMax);
                                options.inTargetDensity = Integer.MAX_VALUE;
                            } else {
                                options.inDensity = Integer.MAX_VALUE;
                                options.inTargetDensity = AbstractC12889b.m36257W(((double) Integer.MAX_VALUE) * dMax);
                            }
                        }
                        z4 = false;
                    }
                }
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new C26619i0(c26621j0M79158c), null, options);
                    c26621j0M79158c.close();
                    Exception exc3 = (Exception) c12015b.f39747y;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (bitmapDecodeStream == null) {
                        throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                    }
                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z13 != 0 || i15 > 0) {
                        Matrix matrix = new Matrix();
                        float width = bitmapDecodeStream.getWidth() / 2.0f;
                        float height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z13) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i15 > 0) {
                            matrix.postRotate(i15, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f13 = rectF.left;
                        if (f13 != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f13, -rectF.top);
                        }
                        if (i15 == 90 || i15 == 270) {
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
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC12027n.f39774a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    return new C12021h(new BitmapDrawable(context.getResources(), bitmapDecodeStream), (options.inSampleSize > 1 || options.inScaled) ? true : z4);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(c26621j0M79158c, th3);
                        throw th4;
                    }
                }
            case 9:
                return AbstractC12109i.m33452S((ByteBuffer) this.f1507x);
            case 10:
                C12529p c12529p = (C12529p) this.f1507x;
                c12529p.f42816f0 = null;
                AbstractC0201g.m510j(c12529p);
                AbstractC0201g.m509i(c12529p);
                AbstractC0201g.m508h(c12529p);
                return Boolean.TRUE;
            case 11:
                C12532s c12532s = (C12532s) this.f1507x;
                c12532s.f42834Z = null;
                AbstractC0201g.m510j(c12532s);
                AbstractC0201g.m509i(c12532s);
                AbstractC0201g.m508h(c12532s);
                return Boolean.TRUE;
            case 12:
                return Boolean.valueOf(AbstractC12765h.m35740v((InterfaceC11732a) this.f1507x));
            case 13:
                C13824s1 c13824s1 = (C13824s1) this.f1507x;
                C13801l c13801l = (C13801l) AbstractC0201g.m506f(c13824s1, AbstractC13788g1.f49194a);
                c13824s1.f49342a0 = c13801l;
                c13824s1.f49343b0 = c13801l != null ? new C13798k(c13801l.f49245a, c13801l.f49246b, c13801l.f49247c, c13801l.f49248d) : null;
                return C23454a0.f92919a;
            case 14:
                return new C14949a2(EnumC14960b2.f55823w, (Function1) this.f1507x, i14);
            case 15:
                return (Map) ((C15093n7) this.f1507x).f56516i.getValue();
            case 16:
                return Boolean.valueOf(((C16473w2) this.f1507x).f9141N);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ChatClient.Builder.m54537a((ChatClient.Builder) this.f1507x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return HeadersInterceptor.m54540a((HeadersInterceptor) this.f1507x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return MoshiChatApi.callPostponeHelper_delegate$lambda$0((MoshiChatApi) this.f1507x);
            case 20:
                return Boolean.valueOf(((ChatApiConfig) this.f1507x).getDistinctApiCalls());
            case 21:
                return MoshiChatParser.moshi_delegate$lambda$0((MoshiChatParser) this.f1507x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return CustomObjectDtoAdapter.m54903a((CustomObjectDtoAdapter) this.f1507x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new MessageReceiptDao_Impl((ChatClientDatabase_Impl) this.f1507x);
            case 24:
                return ((UserIdentifier) this.f1507x).getValue();
            case 25:
                C21589o c21589o = (C21589o) this.f1507x;
                c21589o.getClass();
                AbstractC31218a.m96155a(c21589o);
                return C23454a0.f92919a;
            case 26:
                C21596v c21596v = (C21596v) this.f1507x;
                WorkDatabase workDatabase = c21596v.f82807c;
                Context context2 = c21596v.f82805a;
                String str2 = C23817c.f94218F;
                if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC23815a.m69916b(context2).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context2.getSystemService("jobscheduler");
                ArrayList arrayListM69919d = C23817c.m69919d(context2, jobScheduler);
                if (arrayListM69919d != null && !arrayListM69919d.isEmpty()) {
                    Iterator it = arrayListM69919d.iterator();
                    while (it.hasNext()) {
                        C23817c.m69918b(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ((Number) AbstractC15751g.m44432L(workDatabase.mo5521h().f123665a, false, true, new C29343a(29))).intValue();
                AbstractC21585k.m60632b(c21596v.f82806b, workDatabase, c21596v.f82809e);
                return C23454a0.f92919a;
            case 27:
                InterfaceC26443b interfaceC26443b = (InterfaceC26443b) ((AtomicReference) this.f1507x).getAndSet(EnumC30025d.f122538w);
                if (interfaceC26443b != null) {
                    interfaceC26443b.dispose();
                }
                return C23454a0.f92919a;
            case 28:
                return C21740b.m61338u((C34643d) this.f1507x);
            default:
                C23573p c23573p = (C23573p) this.f1507x;
                return c23573p.f93485w.mo11169h(c23573p.f93486x);
        }
    }

    public /* synthetic */ C0438l0(Function1 function1) {
        this.f1506w = 14;
        EnumC14960b2 enumC14960b2 = EnumC14960b2.f55823w;
        this.f1507x = function1;
    }
}
