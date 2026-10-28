package mo;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.mapbox.common.module.RunnableC5445c;
import cr.C11078p;
import hn.AbstractC17506n;
import hn.AbstractC17513u;
import hn.C17501i;
import hn.C17504l;
import hn.C17507o;
import hn.C17508p;
import hn.InterfaceC17502j;
import hn.InterfaceC17503k;
import io.sentry.android.core.RunnableC20151r0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import mm.C25680d;
import org.joda.time.DateTimeConstants;
import p031b9.C2832g;
import p078d1.C11457j;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31523d;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p465rm.C31534g1;
import p465rm.SurfaceHolderCallbackC31565r;
import p508ty.C34249c;
import p527um.C35073c;
import p527um.C35074d;
import p619xl.C38445a;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p705ea2.C12915l;

/* JADX INFO: renamed from: mo.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C25728i extends AbstractC17506n {

    /* JADX INFO: renamed from: N1 */
    public static final int[] f101362N1 = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: O1 */
    public static boolean f101363O1;

    /* JADX INFO: renamed from: P1 */
    public static boolean f101364P1;

    /* JADX INFO: renamed from: A1 */
    public long f101365A1;

    /* JADX INFO: renamed from: B1 */
    public long f101366B1;

    /* JADX INFO: renamed from: C1 */
    public long f101367C1;

    /* JADX INFO: renamed from: D1 */
    public int f101368D1;

    /* JADX INFO: renamed from: E1 */
    public int f101369E1;

    /* JADX INFO: renamed from: F1 */
    public int f101370F1;

    /* JADX INFO: renamed from: G1 */
    public int f101371G1;

    /* JADX INFO: renamed from: H1 */
    public float f101372H1;

    /* JADX INFO: renamed from: I1 */
    public C25737r f101373I1;

    /* JADX INFO: renamed from: J1 */
    public boolean f101374J1;

    /* JADX INFO: renamed from: K1 */
    public int f101375K1;

    /* JADX INFO: renamed from: L1 */
    public C25727h f101376L1;

    /* JADX INFO: renamed from: M1 */
    public InterfaceC25730k f101377M1;

    /* JADX INFO: renamed from: e1 */
    public final Context f101378e1;

    /* JADX INFO: renamed from: f1 */
    public final C25735p f101379f1;

    /* JADX INFO: renamed from: g1 */
    public final C11457j f101380g1;

    /* JADX INFO: renamed from: h1 */
    public final long f101381h1;

    /* JADX INFO: renamed from: i1 */
    public final int f101382i1;

    /* JADX INFO: renamed from: j1 */
    public final boolean f101383j1;

    /* JADX INFO: renamed from: k1 */
    public C11078p f101384k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f101385l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f101386m1;

    /* JADX INFO: renamed from: n1 */
    public Surface f101387n1;

    /* JADX INFO: renamed from: o1 */
    public C25723d f101388o1;

    /* JADX INFO: renamed from: p1 */
    public boolean f101389p1;

    /* JADX INFO: renamed from: q1 */
    public int f101390q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f101391r1;

    /* JADX INFO: renamed from: s1 */
    public boolean f101392s1;

    /* JADX INFO: renamed from: t1 */
    public boolean f101393t1;

    /* JADX INFO: renamed from: u1 */
    public long f101394u1;

    /* JADX INFO: renamed from: v1 */
    public long f101395v1;

    /* JADX INFO: renamed from: w1 */
    public long f101396w1;

    /* JADX INFO: renamed from: x1 */
    public int f101397x1;

    /* JADX INFO: renamed from: y1 */
    public int f101398y1;

    /* JADX INFO: renamed from: z1 */
    public int f101399z1;

    public C25728i(Context context, InterfaceC17502j interfaceC17502j, Handler handler, SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r) {
        super(2, interfaceC17502j, 30.0f);
        this.f101381h1 = 5000L;
        this.f101382i1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f101378e1 = applicationContext;
        this.f101379f1 = new C25735p(applicationContext, 0);
        this.f101380g1 = new C11457j(21, handler, surfaceHolderCallbackC31565r);
        this.f101383j1 = "NVIDIA".equals(AbstractC24567y.f95877c);
        this.f101395v1 = -9223372036854775807L;
        this.f101369E1 = -1;
        this.f101370F1 = -1;
        this.f101372H1 = -1.0f;
        this.f101390q1 = 1;
        this.f101375K1 = 0;
        this.f101373I1 = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012d  */
    /* JADX WARN: Code duplicated, block: B:101:0x0131  */
    /* JADX WARN: Code duplicated, block: B:104:0x013b  */
    /* JADX WARN: Code duplicated, block: B:105:0x013f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x014d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0157  */
    /* JADX WARN: Code duplicated, block: B:113:0x015b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0165  */
    /* JADX WARN: Code duplicated, block: B:117:0x0169  */
    /* JADX WARN: Code duplicated, block: B:120:0x0173  */
    /* JADX WARN: Code duplicated, block: B:121:0x0177  */
    /* JADX WARN: Code duplicated, block: B:124:0x0181  */
    /* JADX WARN: Code duplicated, block: B:125:0x0185  */
    /* JADX WARN: Code duplicated, block: B:128:0x018f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0193  */
    /* JADX WARN: Code duplicated, block: B:132:0x019d  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:137:0x01af  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:161:0x0203  */
    /* JADX WARN: Code duplicated, block: B:164:0x020d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0211  */
    /* JADX WARN: Code duplicated, block: B:168:0x021b  */
    /* JADX WARN: Code duplicated, block: B:169:0x021f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0229  */
    /* JADX WARN: Code duplicated, block: B:173:0x022d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0237  */
    /* JADX WARN: Code duplicated, block: B:177:0x023b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0245  */
    /* JADX WARN: Code duplicated, block: B:181:0x0249  */
    /* JADX WARN: Code duplicated, block: B:184:0x0253  */
    /* JADX WARN: Code duplicated, block: B:185:0x0257  */
    /* JADX WARN: Code duplicated, block: B:188:0x0261  */
    /* JADX WARN: Code duplicated, block: B:189:0x0265  */
    /* JADX WARN: Code duplicated, block: B:192:0x026f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0273  */
    /* JADX WARN: Code duplicated, block: B:196:0x027d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0281  */
    /* JADX WARN: Code duplicated, block: B:200:0x028b  */
    /* JADX WARN: Code duplicated, block: B:201:0x028f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0299  */
    /* JADX WARN: Code duplicated, block: B:205:0x029d  */
    /* JADX WARN: Code duplicated, block: B:208:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:209:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:212:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:213:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:216:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:217:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:220:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:221:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:224:0x02df  */
    /* JADX WARN: Code duplicated, block: B:225:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:228:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:229:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:232:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:233:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:236:0x0309  */
    /* JADX WARN: Code duplicated, block: B:237:0x030d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0317  */
    /* JADX WARN: Code duplicated, block: B:241:0x031b  */
    /* JADX WARN: Code duplicated, block: B:244:0x0325  */
    /* JADX WARN: Code duplicated, block: B:245:0x0329  */
    /* JADX WARN: Code duplicated, block: B:248:0x0333  */
    /* JADX WARN: Code duplicated, block: B:249:0x0337  */
    /* JADX WARN: Code duplicated, block: B:252:0x0341  */
    /* JADX WARN: Code duplicated, block: B:253:0x0345  */
    /* JADX WARN: Code duplicated, block: B:256:0x034f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0353  */
    /* JADX WARN: Code duplicated, block: B:260:0x035d  */
    /* JADX WARN: Code duplicated, block: B:261:0x0361  */
    /* JADX WARN: Code duplicated, block: B:264:0x036b  */
    /* JADX WARN: Code duplicated, block: B:265:0x036f  */
    /* JADX WARN: Code duplicated, block: B:268:0x0379  */
    /* JADX WARN: Code duplicated, block: B:269:0x037d  */
    /* JADX WARN: Code duplicated, block: B:272:0x0387  */
    /* JADX WARN: Code duplicated, block: B:273:0x038b  */
    /* JADX WARN: Code duplicated, block: B:276:0x0395  */
    /* JADX WARN: Code duplicated, block: B:277:0x0399  */
    /* JADX WARN: Code duplicated, block: B:280:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:281:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:284:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:285:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:288:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:289:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:292:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:293:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:296:0x03db  */
    /* JADX WARN: Code duplicated, block: B:297:0x03df  */
    /* JADX WARN: Code duplicated, block: B:300:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:301:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:304:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:305:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:308:0x0405  */
    /* JADX WARN: Code duplicated, block: B:309:0x0409  */
    /* JADX WARN: Code duplicated, block: B:312:0x0413  */
    /* JADX WARN: Code duplicated, block: B:313:0x0417  */
    /* JADX WARN: Code duplicated, block: B:316:0x0421  */
    /* JADX WARN: Code duplicated, block: B:317:0x0425  */
    /* JADX WARN: Code duplicated, block: B:320:0x042f  */
    /* JADX WARN: Code duplicated, block: B:321:0x0433  */
    /* JADX WARN: Code duplicated, block: B:324:0x043d  */
    /* JADX WARN: Code duplicated, block: B:325:0x0441  */
    /* JADX WARN: Code duplicated, block: B:328:0x044b  */
    /* JADX WARN: Code duplicated, block: B:329:0x044f  */
    /* JADX WARN: Code duplicated, block: B:332:0x0459  */
    /* JADX WARN: Code duplicated, block: B:333:0x045d  */
    /* JADX WARN: Code duplicated, block: B:336:0x0467  */
    /* JADX WARN: Code duplicated, block: B:337:0x046b  */
    /* JADX WARN: Code duplicated, block: B:340:0x0475  */
    /* JADX WARN: Code duplicated, block: B:341:0x0479  */
    /* JADX WARN: Code duplicated, block: B:344:0x0483  */
    /* JADX WARN: Code duplicated, block: B:345:0x0487  */
    /* JADX WARN: Code duplicated, block: B:348:0x0491  */
    /* JADX WARN: Code duplicated, block: B:349:0x0495  */
    /* JADX WARN: Code duplicated, block: B:352:0x049f  */
    /* JADX WARN: Code duplicated, block: B:353:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:356:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:357:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:360:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:361:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:364:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:365:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:368:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:369:0x04db  */
    /* JADX WARN: Code duplicated, block: B:372:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:373:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:376:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:377:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:380:0x0501  */
    /* JADX WARN: Code duplicated, block: B:381:0x0505  */
    /* JADX WARN: Code duplicated, block: B:384:0x050f  */
    /* JADX WARN: Code duplicated, block: B:385:0x0513  */
    /* JADX WARN: Code duplicated, block: B:388:0x051d  */
    /* JADX WARN: Code duplicated, block: B:389:0x0521  */
    /* JADX WARN: Code duplicated, block: B:392:0x052b  */
    /* JADX WARN: Code duplicated, block: B:393:0x052f  */
    /* JADX WARN: Code duplicated, block: B:396:0x0539  */
    /* JADX WARN: Code duplicated, block: B:397:0x053d  */
    /* JADX WARN: Code duplicated, block: B:400:0x0547  */
    /* JADX WARN: Code duplicated, block: B:401:0x054b  */
    /* JADX WARN: Code duplicated, block: B:404:0x0555  */
    /* JADX WARN: Code duplicated, block: B:405:0x0559  */
    /* JADX WARN: Code duplicated, block: B:408:0x0563  */
    /* JADX WARN: Code duplicated, block: B:409:0x0567  */
    /* JADX WARN: Code duplicated, block: B:412:0x0571  */
    /* JADX WARN: Code duplicated, block: B:413:0x0575  */
    /* JADX WARN: Code duplicated, block: B:416:0x057f  */
    /* JADX WARN: Code duplicated, block: B:417:0x0583  */
    /* JADX WARN: Code duplicated, block: B:420:0x058d  */
    /* JADX WARN: Code duplicated, block: B:421:0x0591  */
    /* JADX WARN: Code duplicated, block: B:424:0x059b  */
    /* JADX WARN: Code duplicated, block: B:425:0x059f  */
    /* JADX WARN: Code duplicated, block: B:428:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:429:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:432:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:433:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:436:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:437:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:440:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:441:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:444:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:445:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:448:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:449:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:452:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:453:0x0601  */
    /* JADX WARN: Code duplicated, block: B:456:0x060b  */
    /* JADX WARN: Code duplicated, block: B:457:0x060f  */
    /* JADX WARN: Code duplicated, block: B:460:0x0619  */
    /* JADX WARN: Code duplicated, block: B:461:0x061d  */
    /* JADX WARN: Code duplicated, block: B:464:0x0627  */
    /* JADX WARN: Code duplicated, block: B:465:0x062b  */
    /* JADX WARN: Code duplicated, block: B:468:0x0635  */
    /* JADX WARN: Code duplicated, block: B:469:0x0639  */
    /* JADX WARN: Code duplicated, block: B:472:0x0643  */
    /* JADX WARN: Code duplicated, block: B:473:0x0647  */
    /* JADX WARN: Code duplicated, block: B:476:0x0651  */
    /* JADX WARN: Code duplicated, block: B:477:0x0655  */
    /* JADX WARN: Code duplicated, block: B:480:0x065f  */
    /* JADX WARN: Code duplicated, block: B:481:0x0663  */
    /* JADX WARN: Code duplicated, block: B:484:0x066d  */
    /* JADX WARN: Code duplicated, block: B:485:0x0671  */
    /* JADX WARN: Code duplicated, block: B:488:0x067b  */
    /* JADX WARN: Code duplicated, block: B:489:0x067f  */
    /* JADX WARN: Code duplicated, block: B:492:0x0689  */
    /* JADX WARN: Code duplicated, block: B:493:0x068d  */
    /* JADX WARN: Code duplicated, block: B:496:0x0697  */
    /* JADX WARN: Code duplicated, block: B:497:0x069b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:500:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:501:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:504:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:505:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:508:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:509:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:512:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:513:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:516:0x06db  */
    /* JADX WARN: Code duplicated, block: B:517:0x06de  */
    /* JADX WARN: Code duplicated, block: B:520:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:521:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:524:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:525:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:528:0x0704  */
    /* JADX WARN: Code duplicated, block: B:529:0x0708  */
    /* JADX WARN: Code duplicated, block: B:532:0x0712  */
    /* JADX WARN: Code duplicated, block: B:533:0x0716  */
    /* JADX WARN: Code duplicated, block: B:536:0x0720  */
    /* JADX WARN: Code duplicated, block: B:537:0x0724  */
    /* JADX WARN: Code duplicated, block: B:540:0x072e  */
    /* JADX WARN: Code duplicated, block: B:541:0x0732  */
    /* JADX WARN: Code duplicated, block: B:544:0x073c  */
    /* JADX WARN: Code duplicated, block: B:545:0x0740  */
    /* JADX WARN: Code duplicated, block: B:548:0x074a  */
    /* JADX WARN: Code duplicated, block: B:549:0x074e  */
    /* JADX WARN: Code duplicated, block: B:552:0x0758  */
    /* JADX WARN: Code duplicated, block: B:553:0x075c  */
    /* JADX WARN: Code duplicated, block: B:556:0x0766  */
    /* JADX WARN: Code duplicated, block: B:557:0x076a  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:560:0x0774  */
    /* JADX WARN: Code duplicated, block: B:561:0x0778  */
    /* JADX WARN: Code duplicated, block: B:564:0x0782  */
    /* JADX WARN: Code duplicated, block: B:565:0x0786  */
    /* JADX WARN: Code duplicated, block: B:568:0x0790  */
    /* JADX WARN: Code duplicated, block: B:569:0x0794  */
    /* JADX WARN: Code duplicated, block: B:572:0x079e  */
    /* JADX WARN: Code duplicated, block: B:573:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:576:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:577:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f A[Catch: all -> 0x086e, TRY_LEAVE, TryCatch #0 {all -> 0x086e, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x001f, B:637:0x0869, B:52:0x0090, B:57:0x009f, B:621:0x083a, B:640:0x0870), top: B:645:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:580:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:581:0x07be  */
    /* JADX WARN: Code duplicated, block: B:584:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:585:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:588:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:589:0x07da  */
    /* JADX WARN: Code duplicated, block: B:592:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:595:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:596:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:599:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:600:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:603:0x0806  */
    /* JADX WARN: Code duplicated, block: B:604:0x0808  */
    /* JADX WARN: Code duplicated, block: B:607:0x0812  */
    /* JADX WARN: Code duplicated, block: B:608:0x0814  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:611:0x081e  */
    /* JADX WARN: Code duplicated, block: B:612:0x0820  */
    /* JADX WARN: Code duplicated, block: B:615:0x082a  */
    /* JADX WARN: Code duplicated, block: B:616:0x082c  */
    /* JADX WARN: Code duplicated, block: B:619:0x0836  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:621:0x083a A[Catch: all -> 0x086e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x086e, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x001f, B:637:0x0869, B:52:0x0090, B:57:0x009f, B:621:0x083a, B:640:0x0870), top: B:645:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:624:0x0846  */
    /* JADX WARN: Code duplicated, block: B:625:0x0848  */
    /* JADX WARN: Code duplicated, block: B:628:0x0851  */
    /* JADX WARN: Code duplicated, block: B:631:0x085a  */
    /* JADX WARN: Code duplicated, block: B:632:0x085c  */
    /* JADX WARN: Code duplicated, block: B:635:0x0865  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:655:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:660:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
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
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
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
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
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
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
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
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
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
    /* JADX WARN: Code duplicated, block: B:77:0x00e2  */
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
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0123  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: p0 */
    public static boolean m75849p0(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 3090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mo.C25728i.m75849p0(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: q0 */
    public static int m75850q0(C17504l c17504l, C31521c0 c31521c0) {
        int iM71675f;
        int iIntValue;
        int i13 = c31521c0.f130082Q;
        int i14 = c31521c0.f130083R;
        if (i13 == -1 || i14 == -1) {
            return -1;
        }
        String str = c31521c0.f130077L;
        if ("video/dolby-vision".equals(str)) {
            Pair pairM49753d = AbstractC17513u.m49753d(c31521c0);
            str = (pairM49753d == null || !((iIntValue = ((Integer) pairM49753d.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        int i15 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                iM71675f = i13 * i14;
                i15 = 2;
                return (iM71675f * 3) / (i15 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                iM71675f = i13 * i14;
                return (iM71675f * 3) / (i15 * 2);
            case "video/avc":
                String str2 = AbstractC24567y.f95878d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(AbstractC24567y.f95877c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && c17504l.f67662f)))) {
                    return -1;
                }
                iM71675f = AbstractC24567y.m71675f(i14, 16) * AbstractC24567y.m71675f(i13, 16) * 256;
                i15 = 2;
                return (iM71675f * 3) / (i15 * 2);
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static AbstractC41023g0 m75851r0(C17507o c17507o, C31521c0 c31521c0, boolean z4, boolean z13) {
        String str = c31521c0.f130077L;
        if (str == null) {
            C41017e0 c41017e0 = AbstractC41023g0.f176998x;
            return C41060w0.f177067E;
        }
        c17507o.getClass();
        List listM49754e = AbstractC17513u.m49754e(str, z4, z13);
        String strM49751b = AbstractC17513u.m49751b(c31521c0);
        if (strM49751b == null) {
            return AbstractC41023g0.m133252m(listM49754e);
        }
        List listM49754e2 = AbstractC17513u.m49754e(strM49751b, z4, z13);
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        c41014d0M133251l.m133224c(listM49754e);
        c41014d0M133251l.m133224c(listM49754e2);
        return c41014d0M133251l.m133239f();
    }

    /* JADX INFO: renamed from: s0 */
    public static int m75852s0(C17504l c17504l, C31521c0 c31521c0) {
        int i13 = c31521c0.f130078M;
        List list = c31521c0.f130079N;
        if (i13 == -1) {
            return m75850q0(c17504l, c31521c0);
        }
        int size = list.size();
        int length = 0;
        for (int i14 = 0; i14 < size; i14++) {
            length += ((byte[]) list.get(i14)).length;
        }
        return c31521c0.f130078M + length;
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: A */
    public final C35074d mo49700A(C17504l c17504l, C31521c0 c31521c0, C31521c0 c31521c1) {
        C35074d c35074dM49694b = c17504l.m49694b(c31521c0, c31521c1);
        int i13 = c35074dM49694b.f148806e;
        int i14 = c31521c1.f130082Q;
        C11078p c11078p = this.f101384k1;
        if (i14 > c11078p.f35038a || c31521c1.f130083R > c11078p.f35039b) {
            i13 |= 256;
        }
        if (m75852s0(c17504l, c31521c1) > this.f101384k1.f35040c) {
            i13 |= 64;
        }
        int i15 = i13;
        return new C35074d(c17504l.f67657a, c31521c0, c31521c1, i15 != 0 ? 0 : c35074dM49694b.f148805d, i15);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m75853A0(int i13, int i14) {
        C2832g c2832g = this.f67705Z0;
        c2832g.f11173i += i13;
        int i15 = i13 + i14;
        c2832g.f11172h += i15;
        this.f101397x1 += i15;
        int i16 = this.f101398y1 + i15;
        this.f101398y1 = i16;
        c2832g.f11174j = Math.max(i16, c2832g.f11174j);
        int i17 = this.f101382i1;
        if (i17 <= 0 || this.f101397x1 < i17) {
            return;
        }
        m75861t0();
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: B */
    public final MediaCodecDecoderException mo49701B(IllegalStateException illegalStateException, C17504l c17504l) {
        Surface surface = this.f101387n1;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, c17504l);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m75854B0(long j7) {
        C2832g c2832g = this.f67705Z0;
        c2832g.f11176l += j7;
        c2832g.f11177m++;
        this.f101367C1 += j7;
        this.f101368D1++;
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: J */
    public final boolean mo49709J() {
        return this.f101374J1 && AbstractC24567y.f95875a < 23;
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: K */
    public final float mo49710K(float f13, C31521c0[] c31521c0Arr) {
        float fMax = -1.0f;
        for (C31521c0 c31521c0 : c31521c0Arr) {
            float f14 = c31521c0.f130084S;
            if (f14 != -1.0f) {
                fMax = Math.max(fMax, f14);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f13;
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: L */
    public final ArrayList mo49711L(C17507o c17507o, C31521c0 c31521c0, boolean z4) {
        AbstractC41023g0 abstractC41023g0M75851r0 = m75851r0(c17507o, c31521c0, z4, this.f101374J1);
        Pattern pattern = AbstractC17513u.f67745a;
        ArrayList arrayList = new ArrayList(abstractC41023g0M75851r0);
        Collections.sort(arrayList, new C12915l(new C17508p(c31521c0, 0), 2));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0172  */
    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: N */
    public final C17501i mo49713N(C17504l c17504l, C31521c0 c31521c0, MediaCrypto mediaCrypto, float f13) {
        int i13;
        C25721b c25721b;
        C11078p c11078p;
        Point point;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b;
        boolean z4;
        Pair pairM49753d;
        int iM75850q0;
        C25723d c25723d = this.f101388o1;
        if (c25723d != null && c25723d.f101338w != c17504l.f67662f) {
            if (this.f101387n1 == c25723d) {
                this.f101387n1 = null;
            }
            c25723d.release();
            this.f101388o1 = null;
        }
        String str = c17504l.f67659c;
        C31521c0[] c31521c0Arr = this.f130105H;
        c31521c0Arr.getClass();
        int i14 = c31521c0.f130082Q;
        float f14 = c31521c0.f130084S;
        int i15 = c31521c0.f130083R;
        C25721b c25721b2 = c31521c0.f130089X;
        int iM75852s0 = m75852s0(c17504l, c31521c0);
        if (c31521c0Arr.length == 1) {
            if (iM75852s0 != -1 && (iM75850q0 = m75850q0(c17504l, c31521c0)) != -1) {
                iM75852s0 = Math.min((int) (iM75852s0 * 1.5f), iM75850q0);
            }
            c11078p = new C11078p(i14, i15, iM75852s0);
            i13 = i15;
            c25721b = c25721b2;
        } else {
            int iMax = i14;
            int iMax2 = i15;
            int i16 = 0;
            boolean z13 = false;
            for (int length = c31521c0Arr.length; i16 < length; length = length) {
                C31521c0 c31521c1 = c31521c0Arr[i16];
                int i17 = i16;
                if (c25721b2 != null && c31521c1.f130089X == null) {
                    C31518b0 c31518b0M97113a = c31521c1.m97113a();
                    c31518b0M97113a.f130059w = c25721b2;
                    c31521c1 = new C31521c0(c31518b0M97113a);
                }
                C35074d c35074dM49694b = c17504l.m49694b(c31521c0, c31521c1);
                C31521c0[] c31521c0Arr2 = c31521c0Arr;
                int i18 = c31521c1.f130083R;
                if (c35074dM49694b.f148805d != 0) {
                    int i19 = c31521c1.f130082Q;
                    b = -1;
                    z13 |= i19 == -1 || i18 == -1;
                    iMax = Math.max(iMax, i19);
                    iMax2 = Math.max(iMax2, i18);
                    iM75852s0 = Math.max(iM75852s0, m75852s0(c17504l, c31521c1));
                } else {
                    b = -1;
                }
                i16 = i17 + 1;
                c31521c0Arr = c31521c0Arr2;
            }
            if (z13) {
                StringBuilder sb4 = new StringBuilder(66);
                sb4.append("Resolutions unknown. Codec max resolution: ");
                sb4.append(iMax);
                sb4.append("x");
                sb4.append(iMax2);
                Log.w("MediaCodecVideoRenderer", sb4.toString());
                boolean z14 = i15 > i14;
                int i24 = z14 ? i15 : i14;
                boolean z15 = z14;
                int i25 = z14 ? i14 : i15;
                float f15 = i25 / i24;
                c25721b = c25721b2;
                int i26 = 0;
                while (true) {
                    if (i26 < 9) {
                        int i27 = f101362N1[i26];
                        int i28 = i26;
                        int i29 = (int) (i27 * f15);
                        if (i27 > i24 && i29 > i25) {
                            int i34 = i25;
                            int i35 = i24;
                            if (AbstractC24567y.f95875a >= 21) {
                                int i36 = z15 ? i29 : i27;
                                if (!z15) {
                                    i27 = i29;
                                }
                                MediaCodecInfo.CodecCapabilities codecCapabilities = c17504l.f67660d;
                                if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                    point2 = null;
                                } else {
                                    int widthAlignment = videoCapabilities.getWidthAlignment();
                                    int heightAlignment = videoCapabilities.getHeightAlignment();
                                    point2 = new Point(AbstractC24567y.m71675f(i36, widthAlignment) * widthAlignment, AbstractC24567y.m71675f(i27, heightAlignment) * heightAlignment);
                                }
                                i13 = i15;
                                if (c17504l.m49697e(point2.x, point2.y, f14)) {
                                    point = point2;
                                } else {
                                    i26 = i28 + 1;
                                    i15 = i13;
                                    i25 = i34;
                                    i24 = i35;
                                }
                            } else {
                                i13 = i15;
                                try {
                                    int iM71675f = AbstractC24567y.m71675f(i27, 16) * 16;
                                    int iM71675f2 = AbstractC24567y.m71675f(i29, 16) * 16;
                                    if (iM71675f * iM71675f2 <= AbstractC17513u.m49758i()) {
                                        int i37 = z15 ? iM71675f2 : iM71675f;
                                        if (!z15) {
                                            iM71675f = iM71675f2;
                                        }
                                        point2 = new Point(i37, iM71675f);
                                        point = point2;
                                    } else {
                                        i26 = i28 + 1;
                                        i15 = i13;
                                        i25 = i34;
                                        i24 = i35;
                                    }
                                } catch (MediaCodecUtil$DecoderQueryException unused) {
                                    point = null;
                                }
                            }
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            C31518b0 c31518b0M97113a2 = c31521c0.m97113a();
                            c31518b0M97113a2.f130052p = iMax;
                            c31518b0M97113a2.f130053q = iMax2;
                            iM75852s0 = Math.max(iM75852s0, m75850q0(c17504l, new C31521c0(c31518b0M97113a2)));
                            StringBuilder sb5 = new StringBuilder(57);
                            sb5.append("Codec max resolution adjusted to: ");
                            sb5.append(iMax);
                            sb5.append("x");
                            sb5.append(iMax2);
                            Log.w("MediaCodecVideoRenderer", sb5.toString());
                        }
                    }
                    i13 = i15;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        C31518b0 c31518b0M97113a3 = c31521c0.m97113a();
                        c31518b0M97113a3.f130052p = iMax;
                        c31518b0M97113a3.f130053q = iMax2;
                        iM75852s0 = Math.max(iM75852s0, m75850q0(c17504l, new C31521c0(c31518b0M97113a3)));
                        StringBuilder sb6 = new StringBuilder(57);
                        sb6.append("Codec max resolution adjusted to: ");
                        sb6.append(iMax);
                        sb6.append("x");
                        sb6.append(iMax2);
                        Log.w("MediaCodecVideoRenderer", sb6.toString());
                    }
                }
            } else {
                i13 = i15;
                c25721b = c25721b2;
            }
            c11078p = new C11078p(iMax, iMax2, iM75852s0);
        }
        this.f101384k1 = c11078p;
        int i38 = this.f101374J1 ? this.f101375K1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i14);
        mediaFormat.setInteger("height", i13);
        AbstractC24543a.m71562D(mediaFormat, c31521c0.f130079N);
        if (f14 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f14);
        }
        AbstractC24543a.m71588x(mediaFormat, "rotation-degrees", c31521c0.f130085T);
        if (c25721b != null) {
            C25721b c25721b3 = c25721b;
            AbstractC24543a.m71588x(mediaFormat, "color-transfer", c25721b3.f101328y);
            AbstractC24543a.m71588x(mediaFormat, "color-standard", c25721b3.f101326w);
            AbstractC24543a.m71588x(mediaFormat, "color-range", c25721b3.f101327x);
            byte[] bArr = c25721b3.f101329z;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c31521c0.f130077L) && (pairM49753d = AbstractC17513u.m49753d(c31521c0)) != null) {
            AbstractC24543a.m71588x(mediaFormat, "profile", ((Integer) pairM49753d.first).intValue());
        }
        mediaFormat.setInteger("max-width", c11078p.f35038a);
        mediaFormat.setInteger("max-height", c11078p.f35039b);
        AbstractC24543a.m71588x(mediaFormat, "max-input-size", c11078p.f35040c);
        if (AbstractC24567y.f95875a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f13 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f13);
            }
        }
        if (this.f101383j1) {
            z4 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z4 = true;
        }
        if (i38 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z4);
            mediaFormat.setInteger("audio-session-id", i38);
        }
        if (this.f101387n1 == null) {
            if (!m75866y0(c17504l)) {
                throw new IllegalStateException();
            }
            if (this.f101388o1 == null) {
                this.f101388o1 = C25723d.m75843h(this.f101378e1, c17504l.f67662f);
            }
            this.f101387n1 = this.f101388o1;
        }
        return new C17501i(c17504l, mediaFormat, c31521c0, this.f101387n1, mediaCrypto);
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: O */
    public final void mo49714O(C35073c c35073c) {
        if (this.f101386m1) {
            ByteBuffer byteBuffer = c35073c.f148798G;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s13 = byteBuffer.getShort();
                short s14 = byteBuffer.getShort();
                byte b6 = byteBuffer.get();
                byte b8 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s13 == 60 && s14 == 1 && b6 == 4 && b8 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    InterfaceC17503k interfaceC17503k = this.f67717i0;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    interfaceC17503k.setParameters(bundle);
                }
            }
        }
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: S */
    public final void mo49718S(Exception exc) {
        AbstractC24543a.m71578n("MediaCodecVideoRenderer", "Video codec error", exc);
        C11457j c11457j = this.f101380g1;
        Handler handler = (Handler) c11457j.f36753x;
        if (handler != null) {
            handler.post(new RunnableC25736q(c11457j, exc, 2));
        }
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: T */
    public final void mo49719T(long j7, long j13, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C11457j c11457j = this.f101380g1;
        Handler handler = (Handler) c11457j.f36753x;
        if (handler != null) {
            str2 = str;
            handler.post(new RunnableC25736q(c11457j, str2, j7, j13));
        } else {
            str2 = str;
        }
        this.f101385l1 = m75849p0(str2);
        C17504l c17504l = this.f67724p0;
        c17504l.getClass();
        boolean z4 = false;
        if (AbstractC24567y.f95875a >= 29 && "video/x-vnd.on2.vp9".equals(c17504l.f67658b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c17504l.f67660d;
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
        this.f101386m1 = z4;
        if (AbstractC24567y.f95875a < 23 || !this.f101374J1) {
            return;
        }
        InterfaceC17503k interfaceC17503k = this.f67717i0;
        interfaceC17503k.getClass();
        this.f101376L1 = new C25727h(this, interfaceC17503k);
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: U */
    public final void mo49720U(String str) {
        C11457j c11457j = this.f101380g1;
        Handler handler = (Handler) c11457j.f36753x;
        if (handler != null) {
            handler.post(new RunnableC25736q(c11457j, str, 1));
        }
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: V */
    public final C35074d mo49721V(C38445a c38445a) throws ExoPlaybackException {
        C35074d c35074dMo49721V = super.mo49721V(c38445a);
        C31521c0 c31521c0 = (C31521c0) c38445a.f164637y;
        C11457j c11457j = this.f101380g1;
        Handler handler = (Handler) c11457j.f36753x;
        if (handler != null) {
            handler.post(new RunnableC25736q(c11457j, c31521c0, c35074dMo49721V));
        }
        return c35074dMo49721V;
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: W */
    public final void mo49722W(C31521c0 c31521c0, MediaFormat mediaFormat) {
        InterfaceC17503k interfaceC17503k = this.f67717i0;
        if (interfaceC17503k != null) {
            interfaceC17503k.mo45159b(this.f101390q1);
        }
        if (this.f101374J1) {
            this.f101369E1 = c31521c0.f130082Q;
            this.f101370F1 = c31521c0.f130083R;
        } else {
            mediaFormat.getClass();
            boolean z4 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f101369E1 = z4 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f101370F1 = z4 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f13 = c31521c0.f130086U;
        int i13 = c31521c0.f130085T;
        this.f101372H1 = f13;
        if (AbstractC24567y.f95875a < 21) {
            this.f101371G1 = i13;
        } else if (i13 == 90 || i13 == 270) {
            int i14 = this.f101369E1;
            this.f101369E1 = this.f101370F1;
            this.f101370F1 = i14;
            this.f101372H1 = 1.0f / f13;
        }
        float f14 = c31521c0.f130084S;
        C25735p c25735p = this.f101379f1;
        c25735p.f101411d = f14;
        C25725f c25725f = (C25725f) c25735p.f101423p;
        ((C25724e) c25725f.f101353d).m75846c();
        ((C25724e) c25725f.f101354e).m75846c();
        c25725f.f101350a = false;
        c25725f.f101351b = -9223372036854775807L;
        c25725f.f101352c = 0;
        c25735p.m75876c();
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: X */
    public final void mo49723X(long j7) {
        super.mo49723X(j7);
        if (this.f101374J1) {
            return;
        }
        this.f101399z1--;
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: Y */
    public final void mo49724Y() {
        m75858o0();
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: Z */
    public final void mo49725Z(C35073c c35073c) {
        boolean z4 = this.f101374J1;
        if (!z4) {
            this.f101399z1++;
        }
        if (AbstractC24567y.f95875a >= 23 || !z4) {
            return;
        }
        long j7 = c35073c.f148797F;
        m49742n0(j7);
        m75863v0();
        this.f67705Z0.f11170f++;
        m75862u0();
        mo49723X(j7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [hn.k] */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r11v9, types: [mo.d] */
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
    @Override // p465rm.AbstractC31523d, p465rm.InterfaceC31522c1
    /* JADX INFO: renamed from: a */
    public final void mo75855a(int i13, Object obj) throws ExoPlaybackException {
        ?? M75843h;
        Handler handler;
        Handler handler2;
        Surface surface;
        int iIntValue;
        C25735p c25735p = this.f101379f1;
        if (i13 != 1) {
            if (i13 == 7) {
                this.f101377M1 = (InterfaceC25730k) obj;
                return;
            }
            if (i13 == 10) {
                int iIntValue2 = ((Integer) obj).intValue();
                if (this.f101375K1 != iIntValue2) {
                    this.f101375K1 = iIntValue2;
                    if (this.f101374J1) {
                        m49729d0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i13 != 4) {
                if (i13 == 5 && c25735p.f101415h != (iIntValue = ((Integer) obj).intValue())) {
                    c25735p.f101415h = iIntValue;
                    c25735p.m75877d(true);
                    return;
                }
                return;
            }
            int iIntValue3 = ((Integer) obj).intValue();
            this.f101390q1 = iIntValue3;
            InterfaceC17503k interfaceC17503k = this.f67717i0;
            if (interfaceC17503k != null) {
                interfaceC17503k.mo45159b(iIntValue3);
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            M75843h = 0;
        }
        if (M75843h == 0) {
            C25723d c25723d = this.f101388o1;
            if (c25723d != null) {
                M75843h = surface;
                M75843h = c25723d;
            } else {
                C17504l c17504l = this.f67724p0;
                if (c17504l != null && m75866y0(c17504l)) {
                    M75843h = surface;
                    M75843h = C25723d.m75843h(this.f101378e1, c17504l.f67662f);
                    this.f101388o1 = M75843h;
                }
            }
        }
        M75843h = surface;
        M75843h = surface;
        M75843h = surface;
        Surface surface2 = this.f101387n1;
        C11457j c11457j = this.f101380g1;
        if (surface2 == M75843h) {
            if (M75843h == 0 || M75843h == this.f101388o1) {
                return;
            }
            C25737r c25737r = this.f101373I1;
            if (c25737r != null && (handler = (Handler) c11457j.f36753x) != null) {
                handler.post(new RunnableC20151r0(22, c11457j, c25737r));
            }
            if (this.f101389p1) {
                Surface surface3 = this.f101387n1;
                Handler handler3 = (Handler) c11457j.f36753x;
                if (handler3 != null) {
                    handler3.post(new RunnableC5445c(c11457j, surface3, SystemClock.elapsedRealtime(), 5));
                    return;
                }
                return;
            }
            return;
        }
        this.f101387n1 = M75843h;
        c25735p.getClass();
        ?? r10 = M75843h instanceof C25723d ? 0 : M75843h;
        if (c25735p.f101410c != r10) {
            c25735p.m75875b();
            c25735p.f101410c = r10;
            c25735p.m75877d(true);
        }
        this.f101389p1 = false;
        int i14 = this.f130103F;
        ?? r14 = this.f67717i0;
        if (r14 != 0) {
            if (AbstractC24567y.f95875a < 23 || M75843h == 0 || this.f101385l1) {
                m49729d0();
                m49716Q();
            } else {
                r14.mo45160c(M75843h);
            }
        }
        if (M75843h == 0 || M75843h == this.f101388o1) {
            this.f101373I1 = null;
            m75858o0();
            return;
        }
        C25737r c25737r2 = this.f101373I1;
        if (c25737r2 != null && (handler2 = (Handler) c11457j.f36753x) != null) {
            handler2.post(new RunnableC20151r0(22, c11457j, c25737r2));
        }
        m75858o0();
        if (i14 == 2) {
            long j7 = this.f101381h1;
            this.f101395v1 = j7 > 0 ? SystemClock.elapsedRealtime() + j7 : -9223372036854775807L;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v7 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v8 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v9 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v10 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v17 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v7 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v9 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r30v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v0 'this'  ??, new type: mo.i
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r33v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r33v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r40v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r40v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r40v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r40v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r40v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r40v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v18 ??, new type: mo.k
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v22 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v24 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v25 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v26 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v6 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v7 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v8 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v13 ??, new type: mo.k
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v15 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v16 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v17 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v18 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v19 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v20 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v21 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v10 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r30v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v0 'this'  ??, new type: mo.i
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r33v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r33v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: b0 */
    public final boolean mo49727b0(long r31, long r33, hn.InterfaceC17503k r35, java.nio.ByteBuffer r36, int r37, int r38, int r39, long r40, boolean r42, boolean r43, p465rm.C31521c0 r44) {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mo.C25728i.mo49727b0(long, long, hn.k, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, rm.c0):boolean");
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: f0 */
    public final void mo49731f0() {
        super.mo49731f0();
        this.f101399z1 = 0;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: h */
    public final String mo54420h() {
        return "MediaCodecVideoRenderer";
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: i0 */
    public final boolean mo49734i0(C17504l c17504l) {
        return this.f101387n1 != null || m75866y0(c17504l);
    }

    @Override // hn.AbstractC17506n, p465rm.AbstractC31523d
    /* JADX INFO: renamed from: k */
    public final boolean mo49737k() {
        C25723d c25723d;
        if (super.mo49737k() && (this.f101391r1 || (((c25723d = this.f101388o1) != null && this.f101387n1 == c25723d) || this.f67717i0 == null || this.f101374J1))) {
            this.f101395v1 = -9223372036854775807L;
            return true;
        }
        if (this.f101395v1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f101395v1) {
            return true;
        }
        this.f101395v1 = -9223372036854775807L;
        return false;
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: k0 */
    public final int mo49738k0(C17507o c17507o, C31521c0 c31521c0) {
        boolean z4;
        int i13 = 0;
        if (!AbstractC24555m.m71616j(c31521c0.f130077L)) {
            return AbstractC31523d.m97116d(0, 0, 0);
        }
        boolean z13 = c31521c0.f130080O != null;
        AbstractC41023g0 abstractC41023g0M75851r0 = m75851r0(c17507o, c31521c0, z13, false);
        if (z13 && abstractC41023g0M75851r0.isEmpty()) {
            abstractC41023g0M75851r0 = m75851r0(c17507o, c31521c0, false, false);
        }
        if (abstractC41023g0M75851r0.isEmpty()) {
            return AbstractC31523d.m97116d(1, 0, 0);
        }
        int i14 = c31521c0.f130096e0;
        int i15 = 2;
        if (i14 != 0 && i14 != 2) {
            return AbstractC31523d.m97116d(2, 0, 0);
        }
        C17504l c17504l = (C17504l) abstractC41023g0M75851r0.get(0);
        boolean zM49695c = c17504l.m49695c(c31521c0);
        if (!zM49695c) {
            int i16 = 1;
            while (true) {
                if (i16 >= abstractC41023g0M75851r0.size()) {
                    z4 = true;
                    break;
                }
                C17504l c17504l2 = (C17504l) abstractC41023g0M75851r0.get(i16);
                if (c17504l2.m49695c(c31521c0)) {
                    z4 = false;
                    zM49695c = true;
                    c17504l = c17504l2;
                    break;
                }
                i16++;
            }
        } else {
            z4 = true;
            break;
        }
        int i17 = zM49695c ? 4 : 3;
        int i18 = c17504l.m49696d(c31521c0) ? 16 : 8;
        int i19 = c17504l.f67663g ? 64 : 0;
        int i24 = z4 ? 128 : 0;
        if (zM49695c) {
            AbstractC41023g0 abstractC41023g0M75851r1 = m75851r0(c17507o, c31521c0, z13, true);
            if (!abstractC41023g0M75851r1.isEmpty()) {
                Pattern pattern = AbstractC17513u.f67745a;
                ArrayList arrayList = new ArrayList(abstractC41023g0M75851r1);
                Collections.sort(arrayList, new C12915l(new C17508p(c31521c0, i13), i15));
                C17504l c17504l3 = (C17504l) arrayList.get(0);
                if (c17504l3.m49695c(c31521c0) && c17504l3.m49696d(c31521c0)) {
                    i13 = 32;
                }
            }
        }
        return i17 | i18 | i13 | i19 | i24;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: l */
    public final void mo54421l() {
        C2832g c2832g;
        C11457j c11457j = this.f101380g1;
        this.f101373I1 = null;
        m75858o0();
        this.f101389p1 = false;
        this.f101376L1 = null;
        try {
            this.f67704Z = null;
            this.f67707a1 = -9223372036854775807L;
            this.f67709b1 = -9223372036854775807L;
            this.f67711c1 = 0;
            m49707H();
            c2832g = this.f67705Z0;
            c11457j.getClass();
            synchronized (c2832g) {
            }
        } finally {
            c2832g = this.f67705Z0;
            c11457j.getClass();
            synchronized (c2832g) {
                Handler handler = (Handler) c11457j.f36753x;
                if (handler != null) {
                    handler.post(new RunnableC20151r0(23, c11457j, c2832g));
                }
            }
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: m */
    public final void mo75856m(boolean z4, boolean z13) {
        this.f67705Z0 = new C2832g(1);
        C31534g1 c31534g1 = this.f130112y;
        c31534g1.getClass();
        boolean z14 = c31534g1.f130151a;
        AbstractC24543a.m71573i((z14 && this.f101375K1 == 0) ? false : true);
        if (this.f101374J1 != z14) {
            this.f101374J1 = z14;
            m49729d0();
        }
        C2832g c2832g = this.f67705Z0;
        C11457j c11457j = this.f101380g1;
        Handler handler = (Handler) c11457j.f36753x;
        if (handler != null) {
            handler.post(new RunnableC25736q(c11457j, c2832g, 4));
        }
        this.f101392s1 = z13;
        this.f101393t1 = false;
    }

    @Override // hn.AbstractC17506n, p465rm.AbstractC31523d
    /* JADX INFO: renamed from: n */
    public final void mo49741n(long j7, boolean z4) throws ExoPlaybackException {
        super.mo49741n(j7, z4);
        m75858o0();
        C25735p c25735p = this.f101379f1;
        c25735p.f101418k = 0L;
        c25735p.f101421n = -1L;
        c25735p.f101419l = -1L;
        this.f101365A1 = -9223372036854775807L;
        this.f101394u1 = -9223372036854775807L;
        this.f101398y1 = 0;
        if (!z4) {
            this.f101395v1 = -9223372036854775807L;
        } else {
            long j13 = this.f101381h1;
            this.f101395v1 = j13 > 0 ? SystemClock.elapsedRealtime() + j13 : -9223372036854775807L;
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: o */
    public final void mo75857o() {
        try {
            try {
                m49702C();
                m49729d0();
                C34249c c34249c = this.f67710c0;
                if (c34249c != null) {
                    c34249c.m108304u(null);
                }
                this.f67710c0 = null;
                C25723d c25723d = this.f101388o1;
                if (c25723d != null) {
                    if (this.f101387n1 == c25723d) {
                        this.f101387n1 = null;
                    }
                    c25723d.release();
                    this.f101388o1 = null;
                }
            } catch (Throwable th3) {
                C34249c c34249c2 = this.f67710c0;
                if (c34249c2 != null) {
                    c34249c2.m108304u(null);
                }
                this.f67710c0 = null;
                throw th3;
            }
        } catch (Throwable th4) {
            C25723d c25723d2 = this.f101388o1;
            if (c25723d2 != null) {
                if (this.f101387n1 == c25723d2) {
                    this.f101387n1 = null;
                }
                c25723d2.release();
                this.f101388o1 = null;
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m75858o0() {
        InterfaceC17503k interfaceC17503k;
        this.f101391r1 = false;
        if (AbstractC24567y.f95875a < 23 || !this.f101374J1 || (interfaceC17503k = this.f67717i0) == null) {
            return;
        }
        this.f101376L1 = new C25727h(this, interfaceC17503k);
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: p */
    public final void mo75859p() {
        this.f101397x1 = 0;
        this.f101396w1 = SystemClock.elapsedRealtime();
        this.f101366B1 = SystemClock.elapsedRealtime() * 1000;
        this.f101367C1 = 0L;
        this.f101368D1 = 0;
        C25735p c25735p = this.f101379f1;
        c25735p.f101409b = true;
        c25735p.f101418k = 0L;
        c25735p.f101421n = -1L;
        c25735p.f101419l = -1L;
        InterfaceC25732m interfaceC25732m = (InterfaceC25732m) c25735p.f101424q;
        if (interfaceC25732m != null) {
            ChoreographerFrameCallbackC25734o choreographerFrameCallbackC25734o = (ChoreographerFrameCallbackC25734o) c25735p.f101425r;
            choreographerFrameCallbackC25734o.getClass();
            choreographerFrameCallbackC25734o.f101405x.sendEmptyMessage(1);
            interfaceC25732m.mo68186y(new C25680d(c25735p, 4));
        }
        c25735p.m75877d(false);
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: q */
    public final void mo75860q() {
        this.f101395v1 = -9223372036854775807L;
        m75861t0();
        int i13 = this.f101368D1;
        if (i13 != 0) {
            long j7 = this.f101367C1;
            C11457j c11457j = this.f101380g1;
            Handler handler = (Handler) c11457j.f36753x;
            if (handler != null) {
                handler.post(new RunnableC25736q(c11457j, j7, i13));
            }
            this.f101367C1 = 0L;
            this.f101368D1 = 0;
        }
        C25735p c25735p = this.f101379f1;
        c25735p.f101409b = false;
        InterfaceC25732m interfaceC25732m = (InterfaceC25732m) c25735p.f101424q;
        if (interfaceC25732m != null) {
            interfaceC25732m.mo68185x();
            ChoreographerFrameCallbackC25734o choreographerFrameCallbackC25734o = (ChoreographerFrameCallbackC25734o) c25735p.f101425r;
            choreographerFrameCallbackC25734o.getClass();
            choreographerFrameCallbackC25734o.f101405x.sendEmptyMessage(2);
        }
        c25735p.m75875b();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m75861t0() {
        if (this.f101397x1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j7 = jElapsedRealtime - this.f101396w1;
            int i13 = this.f101397x1;
            C11457j c11457j = this.f101380g1;
            Handler handler = (Handler) c11457j.f36753x;
            if (handler != null) {
                handler.post(new RunnableC25736q(c11457j, i13, j7));
            }
            this.f101397x1 = 0;
            this.f101396w1 = jElapsedRealtime;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m75862u0() {
        this.f101393t1 = true;
        if (this.f101391r1) {
            return;
        }
        this.f101391r1 = true;
        Surface surface = this.f101387n1;
        C11457j c11457j = this.f101380g1;
        Handler handler = (Handler) c11457j.f36753x;
        if (handler != null) {
            handler.post(new RunnableC5445c(c11457j, surface, SystemClock.elapsedRealtime(), 5));
        }
        this.f101389p1 = true;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m75863v0() {
        int i13 = this.f101369E1;
        if (i13 == -1 && this.f101370F1 == -1) {
            return;
        }
        C25737r c25737r = this.f101373I1;
        if (c25737r != null && c25737r.f101429w == i13 && c25737r.f101430x == this.f101370F1 && c25737r.f101431y == this.f101371G1 && c25737r.f101432z == this.f101372H1) {
            return;
        }
        C25737r c25737r2 = new C25737r(this.f101372H1, i13, this.f101370F1, this.f101371G1);
        this.f101373I1 = c25737r2;
        C11457j c11457j = this.f101380g1;
        Handler handler = (Handler) c11457j.f36753x;
        if (handler != null) {
            handler.post(new RunnableC20151r0(22, c11457j, c25737r2));
        }
    }

    @Override // hn.AbstractC17506n, p465rm.AbstractC31523d
    /* JADX INFO: renamed from: w */
    public final void mo49745w(float f13, float f14) throws ExoPlaybackException {
        super.mo49745w(f13, f14);
        C25735p c25735p = this.f101379f1;
        c25735p.f101414g = f13;
        c25735p.f101418k = 0L;
        c25735p.f101421n = -1L;
        c25735p.f101419l = -1L;
        c25735p.m75877d(false);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m75864w0(InterfaceC17503k interfaceC17503k, int i13) {
        m75863v0();
        AbstractC24543a.m71567c("releaseOutputBuffer");
        interfaceC17503k.releaseOutputBuffer(i13, true);
        AbstractC24543a.m71579o();
        this.f101366B1 = SystemClock.elapsedRealtime() * 1000;
        this.f67705Z0.f11170f++;
        this.f101398y1 = 0;
        m75862u0();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m75865x0(InterfaceC17503k interfaceC17503k, int i13, long j7) {
        m75863v0();
        AbstractC24543a.m71567c("releaseOutputBuffer");
        interfaceC17503k.mo45161d(i13, j7);
        AbstractC24543a.m71579o();
        this.f101366B1 = SystemClock.elapsedRealtime() * 1000;
        this.f67705Z0.f11170f++;
        this.f101398y1 = 0;
        m75862u0();
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m75866y0(C17504l c17504l) {
        if (AbstractC24567y.f95875a < 23 || this.f101374J1 || m75849p0(c17504l.f67657a)) {
            return false;
        }
        return !c17504l.f67662f || C25723d.m75842f(this.f101378e1);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m75867z0(InterfaceC17503k interfaceC17503k, int i13) {
        AbstractC24543a.m71567c("skipVideoBuffer");
        interfaceC17503k.releaseOutputBuffer(i13, false);
        AbstractC24543a.m71579o();
        this.f67705Z0.f11171g++;
    }
}
