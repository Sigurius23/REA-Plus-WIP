package p454r9;

import a30.C0332w0;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.core.app.NotificationManagerCompat;
import androidx.health.platform.client.proto.C1533u;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.mapbox.common.logger.LogPriority;
import com.mapbox.common.module.RunnableC5445c;
import cr.C11078p;
import d30.C11530f0;
import e10.C12554k0;
import hn.C17508p;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import mo.C25724e;
import mo.C25725f;
import mo.C25727h;
import mo.C25735p;
import mo.HandlerThreadC25722c;
import na.C26488a;
import org.joda.time.DateTimeConstants;
import p010a9.C0580e;
import p031b9.AbstractC2829f;
import p031b9.C2832g;
import p031b9.C2835h;
import p031b9.C2836h0;
import p031b9.C2840i1;
import p097ds.EnumC12315r;
import p158fw.C14828h;
import p215i9.AbstractC18239o;
import p215i9.AbstractC18243s;
import p215i9.C18232h;
import p215i9.C18237m;
import p215i9.InterfaceC18235k;
import p299l9.C23488c0;
import p299l9.InterfaceC23540z0;
import p450r5.RunnableC30928b;
import p516u8.AbstractC34587d0;
import p516u8.AbstractC34609o0;
import p516u8.C34592g;
import p516u8.C34605m0;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.C34629y0;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38060o;
import p607x8.C38061p;
import p607x8.C38063r;
import p607x8.RunnableC38050e;
import p619xl.C38445a;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p705ea2.C12915l;
import qg3.C30352d;
import ug.AbstractC34924m;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: r9.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C31080e extends AbstractC18239o {

    /* JADX INFO: renamed from: Q1 */
    public static final int[] f128141Q1 = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: R1 */
    public static boolean f128142R1;

    /* JADX INFO: renamed from: S1 */
    public static boolean f128143S1;

    /* JADX INFO: renamed from: A1 */
    public int f128144A1;

    /* JADX INFO: renamed from: B1 */
    public long f128145B1;

    /* JADX INFO: renamed from: C1 */
    public int f128146C1;

    /* JADX INFO: renamed from: D1 */
    public long f128147D1;

    /* JADX INFO: renamed from: E1 */
    public C34629y0 f128148E1;

    /* JADX INFO: renamed from: F1 */
    public C34629y0 f128149F1;

    /* JADX INFO: renamed from: G1 */
    public int f128150G1;

    /* JADX INFO: renamed from: H1 */
    public boolean f128151H1;

    /* JADX INFO: renamed from: I1 */
    public int f128152I1;

    /* JADX INFO: renamed from: J1 */
    public C25727h f128153J1;

    /* JADX INFO: renamed from: K1 */
    public InterfaceC31088m f128154K1;

    /* JADX INFO: renamed from: L1 */
    public long f128155L1;

    /* JADX INFO: renamed from: M1 */
    public long f128156M1;

    /* JADX INFO: renamed from: N1 */
    public boolean f128157N1;

    /* JADX INFO: renamed from: O1 */
    public boolean f128158O1;

    /* JADX INFO: renamed from: P1 */
    public int f128159P1;

    /* JADX INFO: renamed from: c1 */
    public final Context f128160c1;

    /* JADX INFO: renamed from: d1 */
    public final boolean f128161d1;

    /* JADX INFO: renamed from: e1 */
    public final C38445a f128162e1;

    /* JADX INFO: renamed from: f1 */
    public final int f128163f1;

    /* JADX INFO: renamed from: g1 */
    public final boolean f128164g1;

    /* JADX INFO: renamed from: h1 */
    public final C31089n f128165h1;

    /* JADX INFO: renamed from: i1 */
    public final C26488a f128166i1;

    /* JADX INFO: renamed from: j1 */
    public final long f128167j1;

    /* JADX INFO: renamed from: k1 */
    public final PriorityQueue f128168k1;

    /* JADX INFO: renamed from: l1 */
    public C11078p f128169l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f128170m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f128171n1;

    /* JADX INFO: renamed from: o1 */
    public C14828h f128172o1;

    /* JADX INFO: renamed from: p1 */
    public boolean f128173p1;

    /* JADX INFO: renamed from: q1 */
    public List f128174q1;

    /* JADX INFO: renamed from: r1 */
    public Surface f128175r1;

    /* JADX INFO: renamed from: s1 */
    public C31081f f128176s1;

    /* JADX INFO: renamed from: t1 */
    public C38060o f128177t1;

    /* JADX INFO: renamed from: u1 */
    public boolean f128178u1;

    /* JADX INFO: renamed from: v1 */
    public int f128179v1;

    /* JADX INFO: renamed from: w1 */
    public int f128180w1;

    /* JADX INFO: renamed from: x1 */
    public long f128181x1;

    /* JADX INFO: renamed from: y1 */
    public int f128182y1;

    /* JADX INFO: renamed from: z1 */
    public int f128183z1;

    public C31080e(C31079d c31079d) {
        super(2, c31079d.f128136c, 30.0f);
        Context applicationContext = c31079d.f128134a.getApplicationContext();
        this.f128160c1 = applicationContext;
        this.f128163f1 = c31079d.f128140g;
        this.f128172o1 = null;
        this.f128162e1 = new C38445a(c31079d.f128138e, c31079d.f128139f);
        this.f128161d1 = this.f128172o1 == null;
        this.f128165h1 = new C31089n(applicationContext, this, c31079d.f128137d);
        this.f128166i1 = new C26488a();
        this.f128164g1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f128177t1 = C38060o.f163020c;
        this.f128179v1 = 1;
        this.f128180w1 = 0;
        this.f128148E1 = C34629y0.f145874d;
        this.f128152I1 = 0;
        this.f128149F1 = null;
        this.f128150G1 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.f128155L1 = -9223372036854775807L;
        this.f128156M1 = -9223372036854775807L;
        this.f128168k1 = new PriorityQueue();
        this.f128167j1 = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0182  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01de  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0208  */
    /* JADX WARN: Code duplicated, block: B:170:0x020c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0216  */
    /* JADX WARN: Code duplicated, block: B:174:0x021a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0224  */
    /* JADX WARN: Code duplicated, block: B:178:0x0228  */
    /* JADX WARN: Code duplicated, block: B:181:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x0236  */
    /* JADX WARN: Code duplicated, block: B:185:0x0240  */
    /* JADX WARN: Code duplicated, block: B:186:0x0244  */
    /* JADX WARN: Code duplicated, block: B:189:0x024e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0252  */
    /* JADX WARN: Code duplicated, block: B:193:0x025c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0260  */
    /* JADX WARN: Code duplicated, block: B:197:0x026a  */
    /* JADX WARN: Code duplicated, block: B:198:0x026e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0278  */
    /* JADX WARN: Code duplicated, block: B:202:0x027c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0286  */
    /* JADX WARN: Code duplicated, block: B:206:0x028a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0294  */
    /* JADX WARN: Code duplicated, block: B:210:0x0298  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02be  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:229:0x02da  */
    /* JADX WARN: Code duplicated, block: B:230:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:241:0x0304  */
    /* JADX WARN: Code duplicated, block: B:242:0x0308  */
    /* JADX WARN: Code duplicated, block: B:245:0x0312  */
    /* JADX WARN: Code duplicated, block: B:246:0x0316  */
    /* JADX WARN: Code duplicated, block: B:249:0x0320  */
    /* JADX WARN: Code duplicated, block: B:250:0x0324  */
    /* JADX WARN: Code duplicated, block: B:253:0x032e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0332  */
    /* JADX WARN: Code duplicated, block: B:257:0x033c  */
    /* JADX WARN: Code duplicated, block: B:258:0x0340  */
    /* JADX WARN: Code duplicated, block: B:261:0x034a  */
    /* JADX WARN: Code duplicated, block: B:262:0x034e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0358  */
    /* JADX WARN: Code duplicated, block: B:266:0x035c  */
    /* JADX WARN: Code duplicated, block: B:269:0x0366  */
    /* JADX WARN: Code duplicated, block: B:270:0x036a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0374  */
    /* JADX WARN: Code duplicated, block: B:274:0x0378  */
    /* JADX WARN: Code duplicated, block: B:277:0x0382  */
    /* JADX WARN: Code duplicated, block: B:278:0x0386  */
    /* JADX WARN: Code duplicated, block: B:281:0x0390  */
    /* JADX WARN: Code duplicated, block: B:282:0x0394  */
    /* JADX WARN: Code duplicated, block: B:285:0x039e  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:294:0x03be  */
    /* JADX WARN: Code duplicated, block: B:297:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:298:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:302:0x03da  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:306:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:313:0x0400  */
    /* JADX WARN: Code duplicated, block: B:314:0x0404  */
    /* JADX WARN: Code duplicated, block: B:317:0x040e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0412  */
    /* JADX WARN: Code duplicated, block: B:321:0x041c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0420  */
    /* JADX WARN: Code duplicated, block: B:325:0x042a  */
    /* JADX WARN: Code duplicated, block: B:326:0x042e  */
    /* JADX WARN: Code duplicated, block: B:329:0x0438  */
    /* JADX WARN: Code duplicated, block: B:330:0x043c  */
    /* JADX WARN: Code duplicated, block: B:333:0x0446  */
    /* JADX WARN: Code duplicated, block: B:334:0x044a  */
    /* JADX WARN: Code duplicated, block: B:337:0x0454  */
    /* JADX WARN: Code duplicated, block: B:338:0x0458  */
    /* JADX WARN: Code duplicated, block: B:341:0x0462  */
    /* JADX WARN: Code duplicated, block: B:342:0x0466  */
    /* JADX WARN: Code duplicated, block: B:345:0x0470  */
    /* JADX WARN: Code duplicated, block: B:346:0x0474  */
    /* JADX WARN: Code duplicated, block: B:349:0x047e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0482  */
    /* JADX WARN: Code duplicated, block: B:353:0x048c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0490  */
    /* JADX WARN: Code duplicated, block: B:357:0x049a  */
    /* JADX WARN: Code duplicated, block: B:358:0x049e  */
    /* JADX WARN: Code duplicated, block: B:361:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:366:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:370:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:381:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:386:0x0500  */
    /* JADX WARN: Code duplicated, block: B:389:0x050a  */
    /* JADX WARN: Code duplicated, block: B:390:0x050e  */
    /* JADX WARN: Code duplicated, block: B:393:0x0518  */
    /* JADX WARN: Code duplicated, block: B:394:0x051c  */
    /* JADX WARN: Code duplicated, block: B:397:0x0526  */
    /* JADX WARN: Code duplicated, block: B:398:0x052a  */
    /* JADX WARN: Code duplicated, block: B:401:0x0534  */
    /* JADX WARN: Code duplicated, block: B:402:0x0538  */
    /* JADX WARN: Code duplicated, block: B:405:0x0542  */
    /* JADX WARN: Code duplicated, block: B:406:0x0546  */
    /* JADX WARN: Code duplicated, block: B:409:0x0550  */
    /* JADX WARN: Code duplicated, block: B:410:0x0554  */
    /* JADX WARN: Code duplicated, block: B:413:0x055e  */
    /* JADX WARN: Code duplicated, block: B:414:0x0562  */
    /* JADX WARN: Code duplicated, block: B:417:0x056c  */
    /* JADX WARN: Code duplicated, block: B:418:0x0570  */
    /* JADX WARN: Code duplicated, block: B:421:0x057a  */
    /* JADX WARN: Code duplicated, block: B:422:0x057e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0588  */
    /* JADX WARN: Code duplicated, block: B:426:0x058c  */
    /* JADX WARN: Code duplicated, block: B:429:0x0596  */
    /* JADX WARN: Code duplicated, block: B:430:0x059a  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:434:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:441:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:445:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:449:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:450:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:453:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:454:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:457:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:461:0x0606  */
    /* JADX WARN: Code duplicated, block: B:462:0x060a  */
    /* JADX WARN: Code duplicated, block: B:465:0x0614  */
    /* JADX WARN: Code duplicated, block: B:466:0x0618  */
    /* JADX WARN: Code duplicated, block: B:469:0x0622  */
    /* JADX WARN: Code duplicated, block: B:470:0x0626  */
    /* JADX WARN: Code duplicated, block: B:473:0x0630  */
    /* JADX WARN: Code duplicated, block: B:474:0x0634  */
    /* JADX WARN: Code duplicated, block: B:477:0x063e  */
    /* JADX WARN: Code duplicated, block: B:478:0x0642  */
    /* JADX WARN: Code duplicated, block: B:481:0x064c  */
    /* JADX WARN: Code duplicated, block: B:482:0x0650  */
    /* JADX WARN: Code duplicated, block: B:485:0x065a  */
    /* JADX WARN: Code duplicated, block: B:486:0x065e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0668  */
    /* JADX WARN: Code duplicated, block: B:490:0x066c  */
    /* JADX WARN: Code duplicated, block: B:493:0x0676  */
    /* JADX WARN: Code duplicated, block: B:494:0x067a  */
    /* JADX WARN: Code duplicated, block: B:497:0x0684  */
    /* JADX WARN: Code duplicated, block: B:498:0x0688  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:501:0x0692  */
    /* JADX WARN: Code duplicated, block: B:502:0x0696  */
    /* JADX WARN: Code duplicated, block: B:505:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:509:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:513:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:514:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:517:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:518:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:521:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:522:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:526:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:530:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:533:0x0702  */
    /* JADX WARN: Code duplicated, block: B:534:0x0706  */
    /* JADX WARN: Code duplicated, block: B:537:0x0710  */
    /* JADX WARN: Code duplicated, block: B:538:0x0714  */
    /* JADX WARN: Code duplicated, block: B:541:0x071e  */
    /* JADX WARN: Code duplicated, block: B:542:0x0722  */
    /* JADX WARN: Code duplicated, block: B:545:0x072c  */
    /* JADX WARN: Code duplicated, block: B:546:0x0730  */
    /* JADX WARN: Code duplicated, block: B:549:0x073a  */
    /* JADX WARN: Code duplicated, block: B:552:0x0744  */
    /* JADX WARN: Code duplicated, block: B:553:0x0747  */
    /* JADX WARN: Code duplicated, block: B:556:0x0751  */
    /* JADX WARN: Code duplicated, block: B:557:0x0754  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[Catch: all -> 0x08be, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:560:0x075e  */
    /* JADX WARN: Code duplicated, block: B:561:0x0762  */
    /* JADX WARN: Code duplicated, block: B:564:0x076c  */
    /* JADX WARN: Code duplicated, block: B:565:0x0770  */
    /* JADX WARN: Code duplicated, block: B:568:0x077a  */
    /* JADX WARN: Code duplicated, block: B:569:0x077e  */
    /* JADX WARN: Code duplicated, block: B:572:0x0788  */
    /* JADX WARN: Code duplicated, block: B:573:0x078c  */
    /* JADX WARN: Code duplicated, block: B:576:0x0796  */
    /* JADX WARN: Code duplicated, block: B:577:0x079a  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:581:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:592:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:596:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:600:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:601:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:604:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:608:0x0806  */
    /* JADX WARN: Code duplicated, block: B:609:0x080a  */
    /* JADX WARN: Code duplicated, block: B:612:0x0814  */
    /* JADX WARN: Code duplicated, block: B:613:0x0818  */
    /* JADX WARN: Code duplicated, block: B:616:0x0822  */
    /* JADX WARN: Code duplicated, block: B:617:0x0826  */
    /* JADX WARN: Code duplicated, block: B:620:0x0830  */
    /* JADX WARN: Code duplicated, block: B:621:0x0834  */
    /* JADX WARN: Code duplicated, block: B:624:0x083e  */
    /* JADX WARN: Code duplicated, block: B:625:0x0842  */
    /* JADX WARN: Code duplicated, block: B:628:0x084c  */
    /* JADX WARN: Code duplicated, block: B:629:0x084f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:632:0x0859  */
    /* JADX WARN: Code duplicated, block: B:633:0x085b  */
    /* JADX WARN: Code duplicated, block: B:636:0x0865  */
    /* JADX WARN: Code duplicated, block: B:637:0x0867  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:640:0x0871  */
    /* JADX WARN: Code duplicated, block: B:641:0x0873  */
    /* JADX WARN: Code duplicated, block: B:644:0x087d  */
    /* JADX WARN: Code duplicated, block: B:645:0x087f  */
    /* JADX WARN: Code duplicated, block: B:648:0x0889  */
    /* JADX WARN: Code duplicated, block: B:649:0x088b  */
    /* JADX WARN: Code duplicated, block: B:652:0x0895  */
    /* JADX WARN: Code duplicated, block: B:653:0x0897  */
    /* JADX WARN: Code duplicated, block: B:656:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:657:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:660:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:662:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118 A[Catch: all -> 0x08be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: w0 */
    public static boolean m95723w0(String str) {
        String str2;
        byte b;
        String str3;
        byte b6;
        boolean z4 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C31080e.class) {
            try {
                if (!f128142R1) {
                    int i13 = AbstractC38065t.f163031a;
                    byte b8 = 28;
                    if (i13 <= 28) {
                        String str4 = Build.DEVICE;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b6 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b6 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b6 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b6 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b6 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b6 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b6 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b6 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b6 = -1;
                                break;
                        }
                        switch (b6) {
                            default:
                                if (i13 <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                    str2 = Build.MODEL;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b = 6;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b = 7;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b = 8;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        default:
                                            if (i13 <= 26) {
                                                str3 = Build.DEVICE;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b8 = 0;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b8 = 1;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b8 = 2;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b8 = 3;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b8 = 4;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b8 = 5;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b8 = 6;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b8 = 7;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b8 = 8;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b8 = 9;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b8 = 10;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b8 = 11;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b8 = 12;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b8 = 13;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b8 = 14;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b8 = 15;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b8 = 16;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b8 = 17;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b8 = 18;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b8 = 19;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b8 = 20;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b8 = 21;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b8 = 22;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b8 = 23;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b8 = 24;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b8 = 25;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b8 = 26;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b8 = 27;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b8 = 29;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b8 = 30;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b8 = 31;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b8 = 32;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b8 = 33;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b8 = 34;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b8 = 35;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b8 = 36;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b8 = 37;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b8 = 38;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b8 = 39;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b8 = 40;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b8 = 41;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b8 = 42;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b8 = 43;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b8 = 44;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b8 = 45;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b8 = 46;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b8 = 47;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b8 = 48;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b8 = 49;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b8 = 50;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b8 = 51;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b8 = 52;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b8 = 53;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b8 = 54;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b8 = 55;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b8 = 56;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b8 = 57;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b8 = 58;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b8 = 59;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b8 = 60;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b8 = 61;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b8 = 62;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b8 = 63;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b8 = 64;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b8 = 65;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b8 = 66;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b8 = 67;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b8 = 68;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b8 = 69;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b8 = 70;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b8 = 71;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b8 = 72;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b8 = 73;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b8 = 74;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b8 = 75;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b8 = 76;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b8 = 77;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b8 = 78;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b8 = 79;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b8 = 80;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b8 = 81;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b8 = 82;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b8 = 83;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b8 = 84;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b8 = 85;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b8 = 86;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b8 = 87;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b8 = 88;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b8 = 89;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b8 = 90;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b8 = 91;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b8 = 92;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b8 = 93;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b8 = 94;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b8 = 95;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b8 = 96;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b8 = 97;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b8 = 98;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b8 = 99;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b8 = 100;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b8 = 101;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b8 = 102;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b8 = 103;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b8 = 104;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b8 = 105;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b8 = 106;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b8 = 107;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b8 = 108;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b8 = 109;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b8 = 110;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b8 = 111;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b8 = 112;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b8 = 113;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b8 = 114;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b8 = 115;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b8 = 116;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b8 = 117;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b8 = 118;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b8 = 119;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b8 = 120;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b8 = 121;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b8 = 122;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b8 = 123;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b8 = 124;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b8 = 125;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b8 = 126;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b8 = 127;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b8 = 128;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b8 = 129;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b8 = 130;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b8 = 131;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b8 = 132;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b8 = 133;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b8 = 134;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b8 = 135;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b8 = 136;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b8 = 137;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b8 = 138;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b8 = 139;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b8 = -1;
                                                        break;
                                                }
                                                switch (b8) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                                    case 20:
                                                    case 21:
                                                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case 30:
                                                    case 31:
                                                    case 32:
                                                    case 33:
                                                    case 34:
                                                    case 35:
                                                    case 36:
                                                    case 37:
                                                    case 38:
                                                    case 39:
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                    case 43:
                                                    case 44:
                                                    case 45:
                                                    case 46:
                                                    case 47:
                                                    case 48:
                                                    case 49:
                                                    case 50:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case 64:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case 80:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case LogPriority.NONE /* 99 */:
                                                    case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case 121:
                                                    case 122:
                                                    case 123:
                                                    case 124:
                                                    case 125:
                                                    case 126:
                                                    case 127:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z4 = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z4 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z4 = true;
                                break;
                        }
                    } else if (i13 <= 27) {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = 7;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = 8;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i13 <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b8 = 0;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b8 = 1;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b8 = 2;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b8 = 3;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b8 = 4;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b8 = 5;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b8 = 6;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b8 = 7;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b8 = 8;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b8 = 9;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b8 = 10;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b8 = 11;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b8 = 12;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b8 = 13;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b8 = 14;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b8 = 15;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b8 = 16;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b8 = 17;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b8 = 18;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b8 = 19;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b8 = 20;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b8 = 21;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b8 = 22;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b8 = 23;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b8 = 24;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b8 = 25;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b8 = 26;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b8 = 27;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b8 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b8 = 29;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b8 = 30;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b8 = 31;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b8 = 32;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b8 = 33;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b8 = 34;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b8 = 35;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b8 = 36;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b8 = 37;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b8 = 38;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b8 = 39;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b8 = 40;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b8 = 41;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b8 = 42;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b8 = 43;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b8 = 44;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b8 = 45;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b8 = 46;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b8 = 47;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b8 = 48;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b8 = 49;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b8 = 50;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b8 = 51;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b8 = 52;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b8 = 53;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b8 = 54;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b8 = 55;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b8 = 56;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b8 = 57;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b8 = 58;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b8 = 59;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b8 = 60;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b8 = 61;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b8 = 62;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b8 = 63;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b8 = 64;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b8 = 65;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b8 = 66;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b8 = 67;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b8 = 68;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b8 = 69;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b8 = 70;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b8 = 71;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b8 = 72;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b8 = 73;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b8 = 74;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b8 = 75;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b8 = 76;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b8 = 77;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b8 = 78;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b8 = 79;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b8 = 80;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b8 = 81;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b8 = 82;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b8 = 83;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b8 = 84;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b8 = 85;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b8 = 86;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b8 = 87;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b8 = 88;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b8 = 89;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b8 = 90;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b8 = 91;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b8 = 92;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b8 = 93;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b8 = 94;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b8 = 95;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b8 = 96;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b8 = 97;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b8 = 98;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b8 = 99;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b8 = 100;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b8 = 101;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b8 = 102;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b8 = 103;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b8 = 104;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b8 = 105;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b8 = 106;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b8 = 107;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b8 = 108;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b8 = 109;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b8 = 110;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b8 = 111;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b8 = 112;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b8 = 113;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b8 = 114;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b8 = 115;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b8 = 116;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b8 = 117;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b8 = 118;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b8 = 119;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b8 = 120;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b8 = 121;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b8 = 122;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b8 = 123;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b8 = 124;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b8 = 125;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b8 = 126;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b8 = 127;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b8 = 128;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b8 = 129;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b8 = 130;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b8 = 131;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b8 = 132;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b8 = 133;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b8 = 134;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b8 = 135;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b8 = 136;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b8 = 137;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b8 = 138;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b8 = 139;
                                            } else {
                                                b8 = -1;
                                            }
                                            break;
                                        default:
                                            b8 = -1;
                                            break;
                                    }
                                    switch (b8) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                        case 20:
                                        case 21:
                                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case LogPriority.NONE /* 99 */:
                                        case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z4 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z4 = true;
                                break;
                        }
                    } else {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i13 <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b8 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b8 = -1;
                                            } else {
                                                b8 = 139;
                                            }
                                            break;
                                        default:
                                            b8 = -1;
                                            break;
                                    }
                                    switch (b8) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                        case 20:
                                        case 21:
                                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case LogPriority.NONE /* 99 */:
                                        case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z4 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z4 = true;
                                break;
                        }
                    }
                    f128143S1 = z4;
                    f128142R1 = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f128143S1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX INFO: renamed from: x0 */
    public static int m95724x0(C18237m c18237m, C34610p c34610p) {
        int i13 = c34610p.f145790u;
        int i14 = c34610p.f145791v;
        if (i13 != -1 && i14 != -1) {
            String str = c34610p.f145783n;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairM52550d = AbstractC18243s.m52550d(c34610p);
                if (pairM52550d == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairM52550d.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i13 * i14) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i13 * i14) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !c18237m.f70953f)))) {
                        return ((AbstractC38065t.m121912e(i14, 16) * AbstractC38065t.m121912e(i13, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i13 * i14) * 3) / 8;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: y0 */
    public static List m95725y0(Context context, C18232h c18232h, C34610p c34610p, boolean z4, boolean z13) {
        String str = c34610p.f145783n;
        if (str == null) {
            return C41060w0.f177067E;
        }
        if (AbstractC38065t.f163031a >= 26 && "video/dolby-vision".equals(str) && !AbstractC34924m.m110163x(context)) {
            String strM52548b = AbstractC18243s.m52548b(c34610p);
            List listM52503b = strM52548b == null ? C41060w0.f177067E : c18232h.m52503b(strM52548b, z4, z13);
            if (!listM52503b.isEmpty()) {
                return listM52503b;
            }
        }
        return AbstractC18243s.m52553g(c18232h, c34610p, z4, z13);
    }

    /* JADX INFO: renamed from: z0 */
    public static int m95726z0(C18237m c18237m, C34610p c34610p) {
        int i13 = c34610p.f145784o;
        List list = c34610p.f145786q;
        if (i13 == -1) {
            return m95724x0(c18237m, c34610p);
        }
        int size = list.size();
        int length = 0;
        for (int i14 = 0; i14 < size; i14++) {
            length += ((byte[]) list.get(i14)).length;
        }
        return c34610p.f145784o + length;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: A0 */
    public final Surface m95727A0(C18237m c18237m) {
        boolean z4;
        HandlerThreadC25722c handlerThreadC25722c;
        int i13;
        RuntimeException runtimeException;
        Error error;
        boolean z13 = false;
        if (this.f128172o1 != null) {
            AbstractC35849g.m113807i(false);
            AbstractC35849g.m113808j(null);
            throw null;
        }
        Surface surface = this.f128175r1;
        if (surface != null) {
            return surface;
        }
        if (AbstractC38065t.f163031a >= 35 && c18237m.f70955h) {
            return null;
        }
        AbstractC35849g.m113807i(m95734H0(c18237m));
        C31081f c31081f = this.f128176s1;
        if (c31081f != null && c31081f.f128186w != c18237m.f70953f && c31081f != null) {
            c31081f.release();
            this.f128176s1 = null;
        }
        if (this.f128176s1 == null) {
            Context context = this.f128160c1;
            boolean z14 = c18237m.f70953f;
            if (z14) {
                if (!C31081f.m95738b(context)) {
                    z4 = false;
                }
                AbstractC35849g.m113807i(z4);
                handlerThreadC25722c = new HandlerThreadC25722c("ExoPlayer:PlaceholderSurface", 1);
                if (z14) {
                    i13 = C31081f.f128185z;
                } else {
                    i13 = 0;
                }
                handlerThreadC25722c.start();
                Handler handler = new Handler(handlerThreadC25722c.getLooper(), handlerThreadC25722c);
                handlerThreadC25722c.f101333x = handler;
                handlerThreadC25722c.f101330E = new RunnableC38050e(handler);
                synchronized (handlerThreadC25722c) {
                    handlerThreadC25722c.f101333x.obtainMessage(1, i13, 0).sendToTarget();
                    while (((C31081f) handlerThreadC25722c.f101331F) == null && handlerThreadC25722c.f101335z == null && handlerThreadC25722c.f101334y == null) {
                        try {
                            handlerThreadC25722c.wait();
                        } catch (InterruptedException unused) {
                            z13 = true;
                        }
                    }
                }
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = handlerThreadC25722c.f101335z;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = handlerThreadC25722c.f101334y;
                if (error == null) {
                    throw error;
                }
                C31081f c31081f2 = (C31081f) handlerThreadC25722c.f101331F;
                c31081f2.getClass();
                this.f128176s1 = c31081f2;
            } else {
                int i14 = C31081f.f128185z;
            }
            z4 = true;
            AbstractC35849g.m113807i(z4);
            handlerThreadC25722c = new HandlerThreadC25722c("ExoPlayer:PlaceholderSurface", 1);
            if (z14) {
                i13 = C31081f.f128185z;
            } else {
                i13 = 0;
            }
            handlerThreadC25722c.start();
            Handler handler2 = new Handler(handlerThreadC25722c.getLooper(), handlerThreadC25722c);
            handlerThreadC25722c.f101333x = handler2;
            handlerThreadC25722c.f101330E = new RunnableC38050e(handler2);
            synchronized (handlerThreadC25722c) {
                handlerThreadC25722c.f101333x.obtainMessage(1, i13, 0).sendToTarget();
                while (((C31081f) handlerThreadC25722c.f101331F) == null) {
                    handlerThreadC25722c.wait();
                }
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = handlerThreadC25722c.f101335z;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = handlerThreadC25722c.f101334y;
                if (error == null) {
                    throw error;
                }
                C31081f c31081f3 = (C31081f) handlerThreadC25722c.f101331F;
                c31081f3.getClass();
                this.f128176s1 = c31081f3;
            }
        }
        return this.f128176s1;
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m95728B0(C18237m c18237m) {
        if (this.f128172o1 != null) {
            return true;
        }
        Surface surface = this.f128175r1;
        if (surface == null || !surface.isValid()) {
            return (AbstractC38065t.f163031a >= 35 && c18237m.f70955h) || m95734H0(c18237m);
        }
        return true;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m95729C0() {
        if (this.f128182y1 > 0) {
            this.f11083G.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j7 = jElapsedRealtime - this.f128181x1;
            int i13 = this.f128182y1;
            C38445a c38445a = this.f128162e1;
            Handler handler = (Handler) c38445a.f164636x;
            if (handler != null) {
                handler.post(new RunnableC31092q(c38445a, i13, j7));
            }
            this.f128182y1 = 0;
            this.f128181x1 = jElapsedRealtime;
        }
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: D */
    public final C2835h mo31572D(C18237m c18237m, C34610p c34610p, C34610p c34610p2) {
        C2835h c2835hM52510b = c18237m.m52510b(c34610p, c34610p2);
        int i13 = c2835hM52510b.f11187e;
        C11078p c11078p = this.f128169l1;
        c11078p.getClass();
        if (c34610p2.f145790u > c11078p.f35038a || c34610p2.f145791v > c11078p.f35039b) {
            i13 |= 256;
        }
        if (m95726z0(c18237m, c34610p2) > c11078p.f35040c) {
            i13 |= 64;
        }
        int i14 = i13;
        return new C2835h(c18237m.f70948a, c34610p, c34610p2, i14 != 0 ? 0 : c2835hM52510b.f11186d, i14);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m95730D0() {
        int i13;
        InterfaceC18235k interfaceC18235k;
        if (!this.f128151H1 || (i13 = AbstractC38065t.f163031a) < 23 || (interfaceC18235k = this.f71009k0) == null) {
            return;
        }
        this.f128153J1 = new C25727h(this, interfaceC18235k);
        if (i13 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            interfaceC18235k.setParameters(bundle);
        }
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: E */
    public final MediaCodecDecoderException mo52518E(IllegalStateException illegalStateException, C18237m c18237m) {
        Surface surface = this.f128175r1;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, c18237m);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m95731E0(InterfaceC18235k interfaceC18235k, int i13, long j7) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC18235k.mo52486d(i13, j7);
        Trace.endSection();
        this.f70993X0.f11170f++;
        this.f128183z1 = 0;
        if (this.f128172o1 == null) {
            C34629y0 c34629y0 = this.f128148E1;
            boolean zEquals = c34629y0.equals(C34629y0.f145874d);
            C38445a c38445a = this.f128162e1;
            if (!zEquals && !c34629y0.equals(this.f128149F1)) {
                this.f128149F1 = c34629y0;
                c38445a.m123171H(c34629y0);
            }
            C31089n c31089n = this.f128165h1;
            boolean z4 = c31089n.f128220e != 3;
            c31089n.f128220e = 3;
            c31089n.f128227l.getClass();
            c31089n.f128222g = AbstractC38065t.m121896J(SystemClock.elapsedRealtime());
            if (!z4 || (surface = this.f128175r1) == null) {
                return;
            }
            Handler handler = (Handler) c38445a.f164636x;
            if (handler != null) {
                handler.post(new RunnableC5445c(c38445a, surface, SystemClock.elapsedRealtime(), 6));
            }
            this.f128178u1 = true;
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m95732F0(Object obj) throws ExoPlaybackException {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f128175r1;
        C38445a c38445a = this.f128162e1;
        if (surface2 == surface) {
            if (surface != null) {
                C34629y0 c34629y0 = this.f128149F1;
                if (c34629y0 != null) {
                    c38445a.m123171H(c34629y0);
                }
                Surface surface3 = this.f128175r1;
                if (surface3 == null || !this.f128178u1 || (handler = (Handler) c38445a.f164636x) == null) {
                    return;
                }
                handler.post(new RunnableC5445c(c38445a, surface3, SystemClock.elapsedRealtime(), 6));
                return;
            }
            return;
        }
        this.f128175r1 = surface;
        C14828h c14828h = this.f128172o1;
        C31089n c31089n = this.f128165h1;
        if (c14828h == null) {
            c31089n.getClass();
            c31089n.f128228m = surface != null;
            c31089n.f128229n = false;
            C25735p c25735p = c31089n.f128217b;
            if (c25735p.f101410c != surface) {
                c25735p.m75875b();
                c25735p.f101410c = surface;
                c25735p.m75877d(true);
            }
            c31089n.m95744d(1);
        }
        this.f128178u1 = false;
        int i13 = this.f11084H;
        InterfaceC18235k interfaceC18235k = this.f71009k0;
        if (interfaceC18235k != null && this.f128172o1 == null) {
            C18237m c18237m = this.f71016r0;
            c18237m.getClass();
            boolean zM95728B0 = m95728B0(c18237m);
            int i14 = AbstractC38065t.f163031a;
            if (i14 < 23 || !zM95728B0 || this.f128170m1) {
                m52537j0();
                m52530U();
            } else {
                Surface surfaceM95727A0 = m95727A0(c18237m);
                if (i14 >= 23 && surfaceM95727A0 != null) {
                    interfaceC18235k.mo52485c(surfaceM95727A0);
                } else {
                    if (i14 < 35) {
                        throw new IllegalStateException();
                    }
                    interfaceC18235k.mo52490h();
                }
            }
        }
        if (surface != null) {
            C34629y0 c34629y1 = this.f128149F1;
            if (c34629y1 != null) {
                c38445a.m123171H(c34629y1);
            }
        } else {
            this.f128149F1 = null;
            C14828h c14828h2 = this.f128172o1;
            if (c14828h2 != null) {
                C31084i c31084i = (C31084i) c14828h2.f55092e;
                int i15 = C38060o.f163020c.f163021a;
                c31084i.f128200j = null;
            }
        }
        if (i13 == 2) {
            C14828h c14828h3 = this.f128172o1;
            if (c14828h3 != null) {
                ((C31084i) c14828h3.f55092e).f128196f.f128125a.m95743c(true);
            } else {
                c31089n.m95743c(true);
            }
        }
        m95730D0();
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m95733G0(long j7, long j13, boolean z4, boolean z13) throws ExoPlaybackException {
        long j14 = this.f128167j1;
        if (j14 != -9223372036854775807L) {
            this.f128158O1 = j13 > this.f11088L + 200000 && j7 < j14;
        }
        if (j7 < -500000 && !z4) {
            InterfaceC23540z0 interfaceC23540z0 = this.f11085I;
            interfaceC23540z0.getClass();
            int iMo36171j = interfaceC23540z0.mo36171j(j13 - this.f11087K);
            if (iMo36171j != 0) {
                PriorityQueue priorityQueue = this.f128168k1;
                if (z13) {
                    C2832g c2832g = this.f70993X0;
                    int i13 = c2832g.f11169e + iMo36171j;
                    c2832g.f11169e = i13;
                    c2832g.f11171g += this.f128144A1;
                    c2832g.f11169e = priorityQueue.size() + i13;
                } else {
                    this.f70993X0.f11175k++;
                    m95736J0(priorityQueue.size() + iMo36171j, this.f128144A1);
                }
                if (m52524K()) {
                    m52530U();
                }
                C14828h c14828h = this.f128172o1;
                if (c14828h != null) {
                    c14828h.m42619a(false);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m95734H0(C18237m c18237m) {
        if (AbstractC38065t.f163031a < 23 || this.f128151H1 || m95723w0(c18237m.f70948a)) {
            return false;
        }
        return !c18237m.f70953f || C31081f.m95738b(this.f128160c1);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m95735I0(InterfaceC18235k interfaceC18235k, int i13) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC18235k.mo52491i(i13);
        Trace.endSection();
        this.f70993X0.f11171g++;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m95736J0(int i13, int i14) {
        C2832g c2832g = this.f70993X0;
        c2832g.f11173i += i13;
        int i15 = i13 + i14;
        c2832g.f11172h += i15;
        this.f128182y1 += i15;
        int i16 = this.f128183z1 + i15;
        this.f128183z1 = i16;
        c2832g.f11174j = Math.max(i16, c2832g.f11174j);
        int i17 = this.f128163f1;
        if (i17 <= 0 || this.f128182y1 < i17) {
            return;
        }
        m95729C0();
    }

    /* JADX INFO: renamed from: K0 */
    public final void m95737K0(long j7) {
        C2832g c2832g = this.f70993X0;
        c2832g.f11176l += j7;
        c2832g.f11177m++;
        this.f128145B1 += j7;
        this.f128146C1++;
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: M */
    public final int mo52526M(C0580e c0580e) {
        return (AbstractC38065t.f163031a < 34 || !this.f128151H1 || c0580e.f2065G >= this.f11088L) ? 0 : 32;
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: N */
    public final boolean mo52527N() {
        return this.f128151H1 && AbstractC38065t.f163031a < 23;
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: O */
    public final float mo31573O(float f13, C34610p[] c34610pArr) {
        float fMax = -1.0f;
        for (C34610p c34610p : c34610pArr) {
            float f14 = c34610p.f145792w;
            if (f14 != -1.0f) {
                fMax = Math.max(fMax, f14);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f13;
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: P */
    public final ArrayList mo31574P(C18232h c18232h, C34610p c34610p, boolean z4) {
        List listM95725y0 = m95725y0(this.f128160c1, c18232h, c34610p, z4, this.f128151H1);
        HashMap map = AbstractC18243s.f71028a;
        ArrayList arrayList = new ArrayList(listM95725y0);
        Collections.sort(arrayList, new C12915l(new C17508p(c34610p, 2), 4));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x013c, please report this as an issue */
    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: Q */
    public final C0332w0 mo31575Q(C18237m c18237m, C34610p c34610p, MediaCrypto mediaCrypto, float f13) {
        C34592g c34592g;
        int i13;
        C11078p c11078p;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b;
        boolean z4;
        Pair pairM52550d;
        int iM95724x0;
        String str = c18237m.f70950c;
        C34610p[] c34610pArr = this.f11086J;
        c34610pArr.getClass();
        int i14 = c34610p.f145790u;
        float f14 = c34610p.f145792w;
        C34592g c34592g2 = c34610p.f145757B;
        int i15 = c34610p.f145791v;
        int iM95726z0 = m95726z0(c18237m, c34610p);
        if (c34610pArr.length == 1) {
            if (iM95726z0 != -1 && (iM95724x0 = m95724x0(c18237m, c34610p)) != -1) {
                iM95726z0 = Math.min((int) (iM95726z0 * 1.5f), iM95724x0);
            }
            c11078p = new C11078p(i14, i15, iM95726z0);
            c34592g = c34592g2;
            i13 = i15;
        } else {
            int length = c34610pArr.length;
            int iMax = i14;
            int iMax2 = i15;
            int i16 = 0;
            boolean z13 = false;
            while (i16 < length) {
                C34610p c34610p2 = c34610pArr[i16];
                C34610p[] c34610pArr2 = c34610pArr;
                if (c34592g2 != null && c34610p2.f145757B == null) {
                    C34608o c34608oM109410a = c34610p2.m109410a();
                    c34608oM109410a.f145717A = c34592g2;
                    c34610p2 = new C34610p(c34608oM109410a);
                }
                C2835h c2835hM52510b = c18237m.m52510b(c34610p, c34610p2);
                int i17 = length;
                int i18 = c34610p2.f145791v;
                if (c2835hM52510b.f11186d != 0) {
                    int i19 = c34610p2.f145790u;
                    b = -1;
                    z13 |= i19 == -1 || i18 == -1;
                    iMax = Math.max(iMax, i19);
                    iMax2 = Math.max(iMax2, i18);
                    iM95726z0 = Math.max(iM95726z0, m95726z0(c18237m, c34610p2));
                } else {
                    b = -1;
                }
                length = i17;
                i16++;
                c34610pArr = c34610pArr2;
            }
            if (z13) {
                AbstractC38046a.m121826u("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z14 = i15 > i14;
                int i24 = z14 ? i15 : i14;
                boolean z15 = z14;
                int i25 = z14 ? i14 : i15;
                float f15 = i25 / i24;
                int i26 = 0;
                while (true) {
                    c34592g = c34592g2;
                    if (i26 < 9) {
                        int i27 = f128141Q1[i26];
                        int i28 = i26;
                        int i29 = (int) (i27 * f15);
                        if (i27 > i24 && i29 > i25) {
                            if (!z15) {
                                i29 = i27;
                            }
                            if (!z15) {
                                i27 = i29;
                            }
                            int i34 = i25;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = c18237m.f70951d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(AbstractC38065t.m121912e(i29, widthAlignment) * widthAlignment, AbstractC38065t.m121912e(i27, heightAlignment) * heightAlignment);
                            }
                            if (point != null) {
                                i13 = i15;
                                if (c18237m.m52515g(point.x, point.y, f14)) {
                                }
                            } else {
                                i13 = i15;
                            }
                            i26 = i28 + 1;
                            i15 = i13;
                            c34592g2 = c34592g;
                            i25 = i34;
                            i24 = i24;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            C34608o c34608oM109410a2 = c34610p.m109410a();
                            c34608oM109410a2.f145748t = iMax;
                            c34608oM109410a2.f145749u = iMax2;
                            iM95726z0 = Math.max(iM95726z0, m95724x0(c18237m, new C34610p(c34608oM109410a2)));
                            AbstractC38046a.m121826u("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    i13 = i15;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        C34608o c34608oM109410a3 = c34610p.m109410a();
                        c34608oM109410a3.f145748t = iMax;
                        c34608oM109410a3.f145749u = iMax2;
                        iM95726z0 = Math.max(iM95726z0, m95724x0(c18237m, new C34610p(c34608oM109410a3)));
                        AbstractC38046a.m121826u("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                c34592g = c34592g2;
                i13 = i15;
            }
            c11078p = new C11078p(iMax, iMax2, iM95726z0);
        }
        this.f128169l1 = c11078p;
        int i35 = this.f128151H1 ? this.f128152I1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i14);
        mediaFormat.setInteger("height", i13);
        AbstractC38046a.m121825t(mediaFormat, c34610p.f145786q);
        if (f14 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f14);
        }
        AbstractC38046a.m121821p(mediaFormat, "rotation-degrees", c34610p.f145793x);
        if (c34592g != null) {
            C34592g c34592g3 = c34592g;
            AbstractC38046a.m121821p(mediaFormat, "color-transfer", c34592g3.f145660c);
            AbstractC38046a.m121821p(mediaFormat, "color-standard", c34592g3.f145658a);
            AbstractC38046a.m121821p(mediaFormat, "color-range", c34592g3.f145659b);
            byte[] bArr = c34592g3.f145661d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c34610p.f145783n) && (pairM52550d = AbstractC18243s.m52550d(c34610p)) != null) {
            AbstractC38046a.m121821p(mediaFormat, "profile", ((Integer) pairM52550d.first).intValue());
        }
        mediaFormat.setInteger("max-width", c11078p.f35038a);
        mediaFormat.setInteger("max-height", c11078p.f35039b);
        AbstractC38046a.m121821p(mediaFormat, "max-input-size", c11078p.f35040c);
        int i36 = AbstractC38065t.f163031a;
        if (i36 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f13 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f13);
            }
        }
        if (this.f128164g1) {
            z4 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z4 = true;
        }
        if (i35 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z4);
            mediaFormat.setInteger("audio-session-id", i35);
        }
        if (i36 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f128150G1));
        }
        Surface surfaceM95727A0 = m95727A0(c18237m);
        if (this.f128172o1 != null && !AbstractC38065t.m121894H(this.f128160c1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new C0332w0(c18237m, mediaFormat, c34610p, surfaceM95727A0, mediaCrypto, null, 6);
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: R */
    public final void mo31576R(C0580e c0580e) {
        if (this.f128171n1) {
            ByteBuffer byteBuffer = c0580e.f2066H;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s13 = byteBuffer.getShort();
                short s14 = byteBuffer.getShort();
                byte b6 = byteBuffer.get();
                byte b8 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s13 == 60 && s14 == 1 && b6 == 4) {
                    if (b8 == 0 || b8 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC18235k interfaceC18235k = this.f71009k0;
                        interfaceC18235k.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC18235k.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: W */
    public final boolean mo52532W(C34610p c34610p) throws ExoPlaybackException {
        C14828h c14828h = this.f128172o1;
        if (c14828h == null) {
            return true;
        }
        try {
            c14828h.m42620b(c34610p);
            throw null;
        } catch (VideoSink$VideoSinkException e5) {
            throw m8059g(e5, c34610p, false, 7000);
        }
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: X */
    public final void mo31577X(Exception exc) {
        AbstractC38046a.m121813h("MediaCodecVideoRenderer", "Video codec error", exc);
        C38445a c38445a = this.f128162e1;
        Handler handler = (Handler) c38445a.f164636x;
        if (handler != null) {
            handler.post(new RunnableC31092q(c38445a, exc, 1));
        }
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: Y */
    public final void mo31578Y(long j7, long j13, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C38445a c38445a = this.f128162e1;
        Handler handler = (Handler) c38445a.f164636x;
        if (handler != null) {
            str2 = str;
            handler.post(new RunnableC31092q(c38445a, str2, j7, j13));
        } else {
            str2 = str;
        }
        this.f128170m1 = m95723w0(str2);
        C18237m c18237m = this.f71016r0;
        c18237m.getClass();
        boolean z4 = false;
        if (AbstractC38065t.f163031a >= 29 && "video/x-vnd.on2.vp9".equals(c18237m.f70949b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c18237m.f70951d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z4 = true;
                    break;
                }
            }
        }
        this.f128171n1 = z4;
        m95730D0();
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: Z */
    public final void mo31579Z(String str) {
        C38445a c38445a = this.f128162e1;
        Handler handler = (Handler) c38445a.f164636x;
        if (handler != null) {
            handler.post(new RunnableC31092q(c38445a, str, 2));
        }
    }

    @Override // p031b9.AbstractC2829f, p031b9.InterfaceC2828e1
    /* JADX INFO: renamed from: a */
    public final void mo8047a(int i13, Object obj) throws ExoPlaybackException {
        if (i13 == 1) {
            m95732F0(obj);
            return;
        }
        if (i13 == 7) {
            obj.getClass();
            InterfaceC31088m interfaceC31088m = (InterfaceC31088m) obj;
            this.f128154K1 = interfaceC31088m;
            C14828h c14828h = this.f128172o1;
            if (c14828h != null) {
                c14828h.m42626h(interfaceC31088m);
                return;
            }
            return;
        }
        if (i13 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f128152I1 != iIntValue) {
                this.f128152I1 = iIntValue;
                if (this.f128151H1) {
                    m52537j0();
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f128179v1 = iIntValue2;
            InterfaceC18235k interfaceC18235k = this.f71009k0;
            if (interfaceC18235k != null) {
                interfaceC18235k.mo52484b(iIntValue2);
                return;
            }
            return;
        }
        if (i13 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f128180w1 = iIntValue3;
            C14828h c14828h2 = this.f128172o1;
            if (c14828h2 != null) {
                c14828h2.m42621c(iIntValue3);
                return;
            }
            C25735p c25735p = this.f128165h1.f128217b;
            if (c25735p.f101415h == iIntValue3) {
                return;
            }
            c25735p.f101415h = iIntValue3;
            c25735p.m75877d(true);
            return;
        }
        if (i13 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f128174q1 = list;
            C14828h c14828h3 = this.f128172o1;
            if (c14828h3 != null) {
                c14828h3.m42625g(list);
                return;
            }
            return;
        }
        if (i13 == 14) {
            obj.getClass();
            C38060o c38060o = (C38060o) obj;
            if (c38060o.f163021a == 0 || c38060o.f163022b == 0) {
                return;
            }
            this.f128177t1 = c38060o;
            C14828h c14828h4 = this.f128172o1;
            if (c14828h4 != null) {
                Surface surface = this.f128175r1;
                AbstractC35849g.m113808j(surface);
                c14828h4.m42622d(surface, c38060o);
                return;
            }
            return;
        }
        if (i13 == 16) {
            obj.getClass();
            this.f128150G1 = ((Integer) obj).intValue();
            InterfaceC18235k interfaceC18235k2 = this.f71009k0;
            if (interfaceC18235k2 != null && AbstractC38065t.f163031a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f128150G1));
                interfaceC18235k2.setParameters(bundle);
                return;
            }
            return;
        }
        if (i13 == 17) {
            Surface surface2 = this.f128175r1;
            m95732F0(null);
            obj.getClass();
            ((C31080e) obj).mo8047a(1, surface2);
            return;
        }
        if (i13 == 11) {
            C2836h0 c2836h0 = (C2836h0) obj;
            c2836h0.getClass();
            this.f71004f0 = c2836h0;
        }
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: a0 */
    public final C2835h mo31580a0(C30352d c30352d) throws ExoPlaybackException {
        C2835h c2835hMo31580a0 = super.mo31580a0(c30352d);
        C34610p c34610p = (C34610p) c30352d.f124536y;
        c34610p.getClass();
        C38445a c38445a = this.f128162e1;
        Handler handler = (Handler) c38445a.f164636x;
        if (handler != null) {
            handler.post(new RunnableC31092q(c38445a, c34610p, c2835hMo31580a0));
        }
        return c2835hMo31580a0;
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: b0 */
    public final void mo31581b0(C34610p c34610p, MediaFormat mediaFormat) {
        int integer;
        int i13;
        InterfaceC18235k interfaceC18235k = this.f71009k0;
        if (interfaceC18235k != null) {
            interfaceC18235k.mo52484b(this.f128179v1);
        }
        if (this.f128151H1) {
            i13 = c34610p.f145790u;
            integer = c34610p.f145791v;
        } else {
            mediaFormat.getClass();
            boolean z4 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z4 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z4 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i13 = integer2;
        }
        float f13 = c34610p.f145794y;
        int i14 = c34610p.f145793x;
        if (i14 == 90 || i14 == 270) {
            f13 = 1.0f / f13;
            int i15 = integer;
            integer = i13;
            i13 = i15;
        }
        this.f128148E1 = new C34629y0(f13, i13, integer);
        C14828h c14828h = this.f128172o1;
        if (c14828h == null || !this.f128157N1) {
            float f14 = c34610p.f145792w;
            C25735p c25735p = this.f128165h1.f128217b;
            c25735p.f101411d = f14;
            C25725f c25725f = (C25725f) c25735p.f101423p;
            ((C25724e) c25725f.f101353d).m75846c();
            ((C25724e) c25725f.f101354e).m75846c();
            c25725f.f101350a = false;
            c25725f.f101351b = -9223372036854775807L;
            c25725f.f101352c = 0;
            c25735p.m75876c();
            this.f128157N1 = false;
            return;
        }
        C34608o c34608oM109410a = c34610p.m109410a();
        c34608oM109410a.f145748t = i13;
        c34608oM109410a.f145749u = integer;
        c34608oM109410a.f145752x = f13;
        C34610p c34610p2 = new C34610p(c34608oM109410a);
        Iterable iterable = this.f128174q1;
        if (iterable == null) {
            C41017e0 c41017e0 = AbstractC41023g0.f176998x;
            iterable = C41060w0.f177067E;
        }
        AbstractC35849g.m113807i(false);
        C31084i c31084i = (C31084i) c14828h.f55092e;
        c31084i.f128193c.getClass();
        C41014d0 c41014d0 = new C41014d0(4);
        c41014d0.m133224c(iterable);
        c41014d0.m133224c(c31084i.f128195e);
        c14828h.f55089b = c41014d0.m133239f();
        c14828h.f55090c = c34610p2;
        C34608o c34608oM109410a2 = c34610p2.m109410a();
        C34592g c34592g = c34610p2.f145757B;
        if (c34592g == null || !c34592g.m109389d()) {
            c34592g = C34592g.f145657h;
        }
        c34608oM109410a2.f145717A = c34592g;
        c34608oM109410a2.m109403a();
        AbstractC35849g.m113808j(null);
        throw null;
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: d0 */
    public final void mo52533d0(long j7) {
        super.mo52533d0(j7);
        if (this.f128151H1) {
            return;
        }
        this.f128144A1--;
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: e0 */
    public final void mo31583e0() {
        C14828h c14828h = this.f128172o1;
        if (c14828h != null) {
            c14828h.m42627i();
            this.f128172o1.m42624f(this.f70995Y0.f70959b, -this.f128155L1);
        } else {
            this.f128165h1.m95744d(2);
        }
        this.f128157N1 = true;
        m95730D0();
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: f0 */
    public final void mo52534f0(C0580e c0580e) {
        Surface surface;
        this.f128159P1 = 0;
        boolean z4 = this.f128151H1;
        if (!z4) {
            this.f128144A1++;
        }
        if (AbstractC38065t.f163031a >= 23 || !z4) {
            return;
        }
        long j7 = c0580e.f2065G;
        m52546v0(j7);
        C34629y0 c34629y0 = this.f128148E1;
        boolean zEquals = c34629y0.equals(C34629y0.f145874d);
        C38445a c38445a = this.f128162e1;
        if (!zEquals && !c34629y0.equals(this.f128149F1)) {
            this.f128149F1 = c34629y0;
            c38445a.m123171H(c34629y0);
        }
        this.f70993X0.f11170f++;
        C31089n c31089n = this.f128165h1;
        boolean z13 = c31089n.f128220e != 3;
        c31089n.f128220e = 3;
        c31089n.f128227l.getClass();
        c31089n.f128222g = AbstractC38065t.m121896J(SystemClock.elapsedRealtime());
        if (z13 && (surface = this.f128175r1) != null) {
            Handler handler = (Handler) c38445a.f164636x;
            if (handler != null) {
                handler.post(new RunnableC5445c(c38445a, surface, SystemClock.elapsedRealtime(), 6));
            }
            this.f128178u1 = true;
        }
        mo52533d0(j7);
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: h */
    public final void mo8060h() {
        C14828h c14828h = this.f128172o1;
        if (c14828h != null) {
            C31089n c31089n = ((C31084i) c14828h.f55092e).f128196f.f128125a;
            if (c31089n.f128220e == 0) {
                c31089n.f128220e = 1;
                return;
            }
            return;
        }
        C31089n c31089n2 = this.f128165h1;
        if (c31089n2.f128220e == 0) {
            c31089n2.f128220e = 1;
        }
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: h0 */
    public final boolean mo31584h0(long j7, long j13, InterfaceC18235k interfaceC18235k, ByteBuffer byteBuffer, int i13, int i14, int i15, long j14, boolean z4, boolean z13, C34610p c34610p) {
        interfaceC18235k.getClass();
        long j15 = j14 - this.f70995Y0.f70960c;
        int i16 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f128168k1;
            Long l7 = (Long) priorityQueue.peek();
            if (l7 == null || l7.longValue() >= j14) {
                break;
            }
            i16++;
            priorityQueue.poll();
        }
        m95736J0(i16, 0);
        C14828h c14828h = this.f128172o1;
        if (c14828h == null) {
            int iM95741a = this.f128165h1.m95741a(j14, j7, j13, this.f70995Y0.f70959b, z4, z13, this.f128166i1);
            C26488a c26488a = this.f128166i1;
            if (iM95741a == 0) {
                this.f11083G.getClass();
                long jNanoTime = System.nanoTime();
                InterfaceC31088m interfaceC31088m = this.f128154K1;
                if (interfaceC31088m != null) {
                    interfaceC31088m.mo8050d(j15, jNanoTime, c34610p, this.f71011m0);
                }
                m95731E0(interfaceC18235k, i13, jNanoTime);
                m95737K0(c26488a.f105201a);
                return true;
            }
            if (iM95741a == 1) {
                long j16 = c26488a.f105202b;
                long j17 = c26488a.f105201a;
                if (j16 == this.f128147D1) {
                    m95735I0(interfaceC18235k, i13);
                } else {
                    InterfaceC31088m interfaceC31088m2 = this.f128154K1;
                    if (interfaceC31088m2 != null) {
                        interfaceC31088m2.mo8050d(j15, j16, c34610p, this.f71011m0);
                    }
                    m95731E0(interfaceC18235k, i13, j16);
                }
                m95737K0(j17);
                this.f128147D1 = j16;
                return true;
            }
            if (iM95741a == 2) {
                Trace.beginSection("dropVideoBuffer");
                interfaceC18235k.mo52491i(i13);
                Trace.endSection();
                m95736J0(0, 1);
                m95737K0(c26488a.f105201a);
                return true;
            }
            if (iM95741a == 3) {
                m95735I0(interfaceC18235k, i13);
                m95737K0(c26488a.f105201a);
                return true;
            }
            if (iM95741a != 4 && iM95741a != 5) {
                throw new IllegalStateException(String.valueOf(iM95741a));
            }
        } else {
            if (z4 && !z13) {
                m95735I0(interfaceC18235k, i13);
                return true;
            }
            AbstractC35849g.m113807i(false);
            int i17 = ((C31084i) c14828h.f55092e).f128204n;
            if (i17 != -1 && i17 == 0) {
                AbstractC35849g.m113808j(null);
                throw null;
            }
        }
        return false;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: j */
    public final String mo8062j() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: k0 */
    public final void mo31585k0() {
        C14828h c14828h = this.f128172o1;
        if (c14828h != null) {
            c14828h.m42627i();
        }
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: l */
    public final boolean mo8064l() {
        return this.f70985T0 && this.f128172o1 == null;
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: l0 */
    public final void mo52538l0() {
        super.mo52538l0();
        this.f128168k1.clear();
        this.f128158O1 = false;
        this.f128144A1 = 0;
        this.f128159P1 = 0;
    }

    @Override // p215i9.AbstractC18239o, p031b9.AbstractC2829f
    /* JADX INFO: renamed from: n */
    public final boolean mo8065n() {
        boolean zMo8065n = super.mo8065n();
        C14828h c14828h = this.f128172o1;
        if (c14828h != null) {
            return ((C31084i) c14828h.f55092e).f128196f.f128125a.m95742b(false);
        }
        if (zMo8065n && (this.f71009k0 == null || this.f128151H1)) {
            return true;
        }
        return this.f128165h1.m95742b(zMo8065n);
    }

    @Override // p215i9.AbstractC18239o, p031b9.AbstractC2829f
    /* JADX INFO: renamed from: o */
    public final void mo8066o() {
        C2832g c2832g;
        C38445a c38445a = this.f128162e1;
        this.f128149F1 = null;
        this.f128156M1 = -9223372036854775807L;
        C14828h c14828h = this.f128172o1;
        if (c14828h != null) {
            ((C31084i) c14828h.f55092e).f128196f.f128125a.m95744d(0);
        } else {
            this.f128165h1.m95744d(0);
        }
        m95730D0();
        this.f128178u1 = false;
        this.f128153J1 = null;
        try {
            super.mo8066o();
            c2832g = this.f70993X0;
            c38445a.getClass();
            synchronized (c2832g) {
            }
        } finally {
            c2832g = this.f70993X0;
            c38445a.getClass();
            synchronized (c2832g) {
                Handler handler = (Handler) c38445a.f164636x;
                if (handler != null) {
                    handler.post(new RunnableC30928b(4, c38445a, c2832g));
                }
                c38445a.m123171H(C34629y0.f145874d);
            }
        }
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: p */
    public final void mo8067p(boolean z4, boolean z13) {
        this.f70993X0 = new C2832g(0);
        C2840i1 c2840i1 = this.f11097z;
        c2840i1.getClass();
        boolean z14 = c2840i1.f11220b;
        AbstractC35849g.m113807i((z14 && this.f128152I1 == 0) ? false : true);
        if (this.f128151H1 != z14) {
            this.f128151H1 = z14;
            m52537j0();
        }
        C2832g c2832g = this.f70993X0;
        C38445a c38445a = this.f128162e1;
        Handler handler = (Handler) c38445a.f164636x;
        if (handler != null) {
            handler.post(new RunnableC31092q(c38445a, c2832g, 5));
        }
        boolean z15 = this.f128173p1;
        C31089n c31089n = this.f128165h1;
        if (!z15) {
            if (this.f128174q1 != null && this.f128172o1 == null) {
                C11530f0 c11530f0 = new C11530f0(this.f128160c1, c31089n);
                C38061p c38061p = this.f11083G;
                c38061p.getClass();
                c11530f0.f37149b = c38061p;
                AbstractC35849g.m113807i(!c11530f0.f37148a);
                if (((C31083h) c11530f0.f37153f) == null) {
                    if (((C31082g) c11530f0.f37152e) == null) {
                        c11530f0.f37152e = new C31082g();
                    }
                    c11530f0.f37153f = new C31083h((C31082g) c11530f0.f37152e);
                }
                C31084i c31084i = new C31084i(c11530f0);
                c11530f0.f37148a = true;
                c31084i.f128204n = 1;
                SparseArray sparseArray = c31084i.f128194d;
                AbstractC35849g.m113807i(!AbstractC38065t.m121916i(sparseArray, 0));
                C14828h c14828h = new C14828h(c31084i, c31084i.f128191a);
                c31084i.f128198h.add(c14828h);
                sparseArray.put(0, c14828h);
                this.f128172o1 = c14828h;
            }
            this.f128173p1 = true;
        }
        C14828h c14828h2 = this.f128172o1;
        if (c14828h2 == null) {
            C38061p c38061p2 = this.f11083G;
            c38061p2.getClass();
            c31089n.f128227l = c38061p2;
            c31089n.f128220e = z13 ? 1 : 0;
            return;
        }
        c14828h2.f55091d = EnumC12315r.f41243w;
        InterfaceC31088m interfaceC31088m = this.f128154K1;
        if (interfaceC31088m != null) {
            c14828h2.m42626h(interfaceC31088m);
        }
        if (this.f128175r1 != null && !this.f128177t1.equals(C38060o.f163020c)) {
            this.f128172o1.m42622d(this.f128175r1, this.f128177t1);
        }
        this.f128172o1.m42621c(this.f128180w1);
        this.f128172o1.m42623e(this.f71007i0);
        List list = this.f128174q1;
        if (list != null) {
            this.f128172o1.m42625g(list);
        }
        C14828h c14828h3 = this.f128172o1;
        ((C31084i) c14828h3.f55092e).f128196f.f128125a.f128220e = z13 ? 1 : 0;
        if (this.f71004f0 != null) {
            c14828h3.getClass();
        }
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: p0 */
    public final boolean mo52542p0(C0580e c0580e) {
        if (!m8063k() && !c0580e.m1496f(536870912)) {
            long j7 = this.f128156M1;
            if (j7 != -9223372036854775807L && j7 - (c0580e.f2065G - this.f70995Y0.f70960c) > 100000 && !c0580e.m1496f(1073741824)) {
                boolean z4 = c0580e.f2065G < this.f11088L;
                if ((z4 || this.f128158O1) && !c0580e.m1496f(268435456) && c0580e.m1496f(67108864)) {
                    c0580e.mo1506o();
                    if (z4) {
                        this.f70993X0.f11169e++;
                        return true;
                    }
                    if (this.f128158O1) {
                        this.f128168k1.add(Long.valueOf(c0580e.f2065G));
                        this.f128159P1++;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p215i9.AbstractC18239o, p031b9.AbstractC2829f
    /* JADX INFO: renamed from: q */
    public final void mo8068q(long j7, boolean z4) throws ExoPlaybackException {
        C14828h c14828h = this.f128172o1;
        if (c14828h != null) {
            if (!z4) {
                c14828h.m42619a(true);
            }
            this.f128172o1.m42624f(this.f70995Y0.f70959b, -this.f128155L1);
            this.f128157N1 = true;
        }
        super.mo8068q(j7, z4);
        C14828h c14828h2 = this.f128172o1;
        C31089n c31089n = this.f128165h1;
        if (c14828h2 == null) {
            C25735p c25735p = c31089n.f128217b;
            c25735p.f101418k = 0L;
            c25735p.f101421n = -1L;
            c25735p.f101419l = -1L;
            c31089n.f128223h = -9223372036854775807L;
            c31089n.f128221f = -9223372036854775807L;
            c31089n.m95744d(1);
            c31089n.f128224i = -9223372036854775807L;
        }
        if (z4) {
            C14828h c14828h3 = this.f128172o1;
            if (c14828h3 != null) {
                ((C31084i) c14828h3.f55092e).f128196f.f128125a.m95743c(false);
            } else {
                c31089n.m95743c(false);
            }
        }
        m95730D0();
        this.f128183z1 = 0;
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: q0 */
    public final boolean mo52543q0(C18237m c18237m) {
        return m95728B0(c18237m);
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: r */
    public final void mo8069r() {
        C14828h c14828h = this.f128172o1;
        if (c14828h == null || !this.f128161d1) {
            return;
        }
        C31084i c31084i = (C31084i) c14828h.f55092e;
        if (c31084i.f128201k == 2) {
            return;
        }
        C38063r c38063r = c31084i.f128199i;
        if (c38063r != null) {
            c38063r.f163026a.removeCallbacksAndMessages(null);
        }
        c31084i.f128200j = null;
        c31084i.f128201k = 2;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: s */
    public final void mo8070s() {
        try {
            try {
                m52519F();
                m52537j0();
                C12554k0 c12554k0 = this.f71003e0;
                if (c12554k0 != null) {
                    c12554k0.m35222K(null);
                }
                this.f71003e0 = null;
                this.f128173p1 = false;
                this.f128155L1 = -9223372036854775807L;
                C31081f c31081f = this.f128176s1;
                if (c31081f != null) {
                    c31081f.release();
                    this.f128176s1 = null;
                }
            } catch (Throwable th3) {
                C12554k0 c12554k1 = this.f71003e0;
                if (c12554k1 != null) {
                    c12554k1.m35222K(null);
                }
                this.f71003e0 = null;
                throw th3;
            }
        } catch (Throwable th4) {
            this.f128173p1 = false;
            this.f128155L1 = -9223372036854775807L;
            C31081f c31081f2 = this.f128176s1;
            if (c31081f2 != null) {
                c31081f2.release();
                this.f128176s1 = null;
            }
            throw th4;
        }
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: s0 */
    public final int mo31587s0(C18232h c18232h, C34610p c34610p) {
        boolean z4;
        int i13 = 0;
        if (!AbstractC34587d0.m109381n(c34610p.f145783n)) {
            return AbstractC2829f.m8055f(0, 0, 0, 0);
        }
        boolean z13 = c34610p.f145787r != null;
        Context context = this.f128160c1;
        List listM95725y0 = m95725y0(context, c18232h, c34610p, z13, false);
        if (z13 && listM95725y0.isEmpty()) {
            listM95725y0 = m95725y0(context, c18232h, c34610p, false, false);
        }
        if (listM95725y0.isEmpty()) {
            return AbstractC2829f.m8055f(1, 0, 0, 0);
        }
        int i14 = c34610p.f145768M;
        int i15 = 2;
        if (i14 != 0 && i14 != 2) {
            return AbstractC2829f.m8055f(2, 0, 0, 0);
        }
        C18237m c18237m = (C18237m) listM95725y0.get(0);
        boolean zM52513e = c18237m.m52513e(c34610p);
        if (!zM52513e) {
            int i16 = 1;
            while (true) {
                if (i16 >= listM95725y0.size()) {
                    z4 = true;
                    break;
                }
                C18237m c18237m2 = (C18237m) listM95725y0.get(i16);
                if (c18237m2.m52513e(c34610p)) {
                    z4 = false;
                    zM52513e = true;
                    c18237m = c18237m2;
                    break;
                }
                i16++;
            }
        } else {
            z4 = true;
            break;
        }
        int i17 = 4;
        int i18 = zM52513e ? 4 : 3;
        int i19 = c18237m.m52514f(c34610p) ? 16 : 8;
        int i24 = c18237m.f70954g ? 64 : 0;
        int i25 = z4 ? 128 : 0;
        if (AbstractC38065t.f163031a >= 26 && "video/dolby-vision".equals(c34610p.f145783n) && !AbstractC34924m.m110163x(context)) {
            i25 = 256;
        }
        if (zM52513e) {
            List listM95725y1 = m95725y0(context, c18232h, c34610p, z13, true);
            if (!listM95725y1.isEmpty()) {
                HashMap map = AbstractC18243s.f71028a;
                ArrayList arrayList = new ArrayList(listM95725y1);
                Collections.sort(arrayList, new C12915l(new C17508p(c34610p, i15), i17));
                C18237m c18237m3 = (C18237m) arrayList.get(0);
                if (c18237m3.m52513e(c34610p) && c18237m3.m52514f(c34610p)) {
                    i13 = 32;
                }
            }
        }
        return i18 | i19 | i13 | i24 | i25;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: t */
    public final void mo8071t() {
        this.f128182y1 = 0;
        this.f11083G.getClass();
        this.f128181x1 = SystemClock.elapsedRealtime();
        this.f128145B1 = 0L;
        this.f128146C1 = 0;
        C14828h c14828h = this.f128172o1;
        if (c14828h != null) {
            ((C31084i) c14828h.f55092e).f128196f.f128125a.m95745e();
        } else {
            this.f128165h1.m95745e();
        }
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: u */
    public final void mo8072u() {
        m95729C0();
        int i13 = this.f128146C1;
        if (i13 != 0) {
            long j7 = this.f128145B1;
            C38445a c38445a = this.f128162e1;
            Handler handler = (Handler) c38445a.f164636x;
            if (handler != null) {
                handler.post(new RunnableC31092q(c38445a, j7, i13));
            }
            this.f128145B1 = 0L;
            this.f128146C1 = 0;
        }
        C14828h c14828h = this.f128172o1;
        if (c14828h != null) {
            ((C31084i) c14828h.f55092e).f128196f.f128125a.m95746f();
        } else {
            this.f128165h1.m95746f();
        }
    }

    @Override // p215i9.AbstractC18239o, p031b9.AbstractC2829f
    /* JADX INFO: renamed from: v */
    public final void mo8073v(C34610p[] c34610pArr, long j7, long j13, C23488c0 c23488c0) {
        super.mo8073v(c34610pArr, j7, j13, c23488c0);
        if (this.f128155L1 == -9223372036854775807L) {
            this.f128155L1 = j7;
        }
        AbstractC34609o0 abstractC34609o0 = this.f11092P;
        if (abstractC34609o0.m109408p()) {
            this.f128156M1 = -9223372036854775807L;
        } else {
            c23488c0.getClass();
            this.f128156M1 = abstractC34609o0.mo8135g(c23488c0.f92976a, new C34605m0()).f145694d;
        }
    }

    @Override // p215i9.AbstractC18239o, p031b9.AbstractC2829f
    /* JADX INFO: renamed from: x */
    public final void mo8075x(long j7, long j13) throws ExoPlaybackException {
        C14828h c14828h = this.f128172o1;
        if (c14828h != null) {
            try {
                C31078c c31078c = ((C31084i) c14828h.f55092e).f128196f;
                c31078c.getClass();
                try {
                    c31078c.f128127c.m95748a(j7, j13);
                } catch (ExoPlaybackException e5) {
                    throw new VideoSink$VideoSinkException(e5, c31078c.f128129e);
                }
            } catch (VideoSink$VideoSinkException e13) {
                throw m8059g(e13, e13.f6398w, false, 7001);
            }
        }
        super.mo8075x(j7, j13);
    }

    @Override // p215i9.AbstractC18239o, p031b9.AbstractC2829f
    /* JADX INFO: renamed from: z */
    public final void mo8077z(float f13, float f14) throws ExoPlaybackException {
        super.mo8077z(f13, f14);
        C14828h c14828h = this.f128172o1;
        if (c14828h != null) {
            c14828h.m42623e(f13);
        } else {
            this.f128165h1.m95747g(f13);
        }
    }
}
