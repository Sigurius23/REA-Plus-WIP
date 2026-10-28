package p014aj;

import al.AbstractC0954a;
import al.C0960g;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import bc3.C3033m;
import bd3.C3143v;
import cf.InterfaceC4532g;
import ch3.AbstractC4677d;
import ch3.C4688i0;
import com.mapbox.common.logger.LogPriority;
import com.whoop.android.R;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import dj.AbstractC12058c;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import io.sentry.C20315e;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20602v0;
import io.sentry.cache.C20283f;
import io.sentry.cache.tape.InterfaceC20288e;
import io.sentry.protocol.C20505z;
import io.sentry.util.AbstractC20582d;
import io.sentry.vendor.gson.stream.C20613c;
import j93.InterfaceC21493z;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import jb3.C21561u;
import l83.C23454a0;
import lb3.AbstractC23811y;
import m83.AbstractC25265s;
import ne3.AbstractC26604b;
import no.nordicsemi.android.dfu.DfuBaseService;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import p005a3.C0237p;
import p037bu.C3632c;
import p077d0.C11401t;
import p108e4.C12669c;
import p173gj.C15906g;
import p184h5.C16925y;
import p185h6.C16955j;
import p208i2.AbstractC17892j0;
import p208i2.InterfaceC17910s0;
import p208i2.InterfaceC17915v;
import p249jc.AbstractC21598x;
import p249jc.C21565a;
import p355o2.AbstractC27422a;
import p355o2.C27436h;
import p355o2.C27438i;
import p355o2.C27439j;
import p355o2.C27440k;
import p355o2.C27441l;
import p355o2.C27442m;
import p355o2.C27443n;
import p355o2.C27444o;
import p355o2.C27445p;
import p355o2.C27446q;
import p355o2.C27447r;
import p355o2.C27448s;
import p355o2.C27449t;
import p355o2.C27450u;
import p355o2.C27451v;
import p355o2.C27452w;
import p355o2.C27453x;
import p355o2.C27454y;
import p355o2.C27455z;
import p389p0.C28532k;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.InterfaceC28670t2;
import p426qi.AbstractC30391l;
import p426qi.C30374b0;
import p446r1.C30849c;
import p493t3.C33494f;
import p493t3.C33498j;
import p505ts.AbstractC34132o;
import p581we.C37199o;
import p586wk.C37330h;
import p586wk.InterfaceC37325c;
import p586wk.InterfaceC37328f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import pg3.InterfaceC29182e;
import pg3.InterfaceC29189h;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31107a1;
import r93.InterfaceC31109b0;
import r93.InterfaceC31117e;
import r93.InterfaceC31124g0;
import r93.InterfaceC31132j;
import r93.InterfaceC31135k;
import r93.InterfaceC31136k0;
import r93.InterfaceC31141m;
import r93.InterfaceC31145n0;
import r93.InterfaceC31147o0;
import r93.InterfaceC31149p0;
import r93.InterfaceC31151q0;
import r93.InterfaceC31162w;
import r93.InterfaceC31163w0;
import r93.InterfaceC31165x0;
import retrofit2.HttpException;
import sa3.C32331e;
import u93.AbstractC34676g;
import u93.AbstractC34677g0;
import u93.AbstractC34685k0;
import u93.AbstractC34690n;
import u93.AbstractC34710x;
import u93.C34665a0;
import u93.C34682j;
import u93.C34709w0;
import v63.AbstractC35744b;
import va3.AbstractC35846d;
import va3.AbstractC35849g;
import va3.AbstractC35852j;
import va3.AbstractC35854l;
import va3.C35845c;
import va3.C35847e;
import va3.C35848f;
import va3.C35850h;
import vf3.AbstractC35952b;
import w93.C36969b;
import xa3.C38146g;
import xa3.C38147h;
import xa3.C38148i;
import xa3.C38151l;
import xa3.EnumC38149j;
import xa3.EnumC38156q;
import xg3.InterfaceC38282i;
import ya3.AbstractC39363f;
import yb3.AbstractC39397a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: aj.d */
/* JADX INFO: loaded from: classes.dex */
public class C0929d implements InterfaceC4532g, InterfaceC38282i, InterfaceC37325c, InterfaceC37328f, InterfaceC20288e, InterfaceC29189h, InterfaceC31141m {

    /* JADX INFO: renamed from: w */
    public Object f3422w;

    public /* synthetic */ C0929d(Object obj) {
        this.f3422w = obj;
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m2335q(String str, List list, List list2) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            if (str.startsWith((String) it3.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static C0929d m2336s(int i13, int i14, int i15, int i16, boolean z4) {
        return new C0929d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i13, i14, i15, i16, false, z4));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01de  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:124:0x0210  */
    /* JADX WARN: Code duplicated, block: B:131:0x0220  */
    /* JADX WARN: Code duplicated, block: B:134:0x0226  */
    /* JADX WARN: Code duplicated, block: B:135:0x022b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0235  */
    /* JADX WARN: Code duplicated, block: B:141:0x0246  */
    /* JADX WARN: Code duplicated, block: B:149:0x0266  */
    /* JADX WARN: Code duplicated, block: B:151:0x026c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0273  */
    /* JADX WARN: Code duplicated, block: B:157:0x0285  */
    /* JADX WARN: Code duplicated, block: B:158:0x028b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0296  */
    /* JADX WARN: Code duplicated, block: B:177:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:179:0x02d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:181:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:183:0x02de  */
    /* JADX WARN: Code duplicated, block: B:185:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:208:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:211:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:213:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:215:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:217:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:221:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:328:0x0402 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x0260 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0194  */
    /* JADX WARN: Code duplicated, block: B:86:0x019d  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:95:0x01be  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static ArrayList m2337t(C0929d c0929d, String str) {
        int i13;
        int i14;
        char cCharAt;
        int i15;
        char c3;
        int i16;
        long j7;
        char cCharAt2;
        int i17;
        int i18;
        int i19;
        char c7;
        char c14;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        long j13;
        char c15;
        long j14;
        int iFloatToRawIntBits;
        float f13;
        long jFloatToRawIntBits;
        char cCharAt3;
        int i34;
        int i35;
        long j15;
        char cCharAt4;
        int i36;
        int i37;
        char cCharAt5;
        char c16;
        char cCharAt6;
        int i38;
        int i39;
        int i44;
        char cCharAt7;
        long j16;
        long jFloatToRawIntBits2;
        int i45;
        float fIntBitsToFloat;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i46 = 0;
        while (true) {
            i13 = 32;
            if (i46 >= length || AbstractC22676k.m65751k(str.charAt(i46), 32) > 0) {
                break;
            }
            i46++;
        }
        while (length > i46 && AbstractC22676k.m65751k(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i47 = 0;
        while (i46 < length) {
            while (true) {
                i14 = i46 + 1;
                cCharAt = str.charAt(i46);
                int i48 = cCharAt | ' ';
                if ((i48 - 122) * (i48 - 97) > 0 || i48 == 101) {
                    if (i14 >= length) {
                        cCharAt = 0;
                    } else {
                        i46 = i14;
                    }
                }
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i47 = 0;
                    while (true) {
                        if (i14 >= length || AbstractC22676k.m65751k(str.charAt(i14), i13) > 0) {
                            if (i14 == length) {
                                int i49 = i13;
                                i16 = i47;
                                jFloatToRawIntBits = (((long) i14) << i49) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
                                i15 = i49;
                            } else {
                                int i54 = i13;
                                i16 = i47;
                                char cCharAt8 = str.charAt(i14);
                                boolean z4 = cCharAt8 == '-';
                                i15 = i54;
                                if (z4) {
                                    i17 = i14 + 1;
                                    if (i17 == length) {
                                        jFloatToRawIntBits = (((long) i17) << i15) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
                                    } else {
                                        c3 = 1;
                                        cCharAt2 = str.charAt(i17);
                                        j7 = 4294967295L;
                                        if (((char) (cCharAt2 - '0')) >= '\n' && cCharAt2 != '.') {
                                            j16 = ((long) i17) << i15;
                                            jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                        }
                                        jFloatToRawIntBits = j16 | (jFloatToRawIntBits2 & j7);
                                        cCharAt = cCharAt;
                                        i14 = (int) (jFloatToRawIntBits >>> i15);
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j7));
                                        if (Float.isNaN(fIntBitsToFloat)) {
                                            i47 = i16;
                                        } else {
                                            fArr = (float[]) c0929d.f3422w;
                                            i47 = i16 + 1;
                                            fArr[i16] = fIntBitsToFloat;
                                            if (i47 >= fArr.length) {
                                                float[] fArr2 = new float[i47 * 2];
                                                c0929d.f3422w = fArr2;
                                                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                                            }
                                        }
                                        while (i14 < length && str.charAt(i14) == ',') {
                                            i14++;
                                        }
                                        if (i14 >= length && !Float.isNaN(fIntBitsToFloat)) {
                                            i13 = i15;
                                            cCharAt = cCharAt;
                                        }
                                    }
                                } else {
                                    j7 = 4294967295L;
                                    c3 = 1;
                                    cCharAt2 = cCharAt8;
                                    i17 = i14;
                                }
                                int length2 = str.length();
                                int i55 = i17;
                                long j17 = 0;
                                while (i55 != length) {
                                    int i56 = cCharAt2 - '0';
                                    if (((char) i56) < '\n') {
                                        int i57 = i14;
                                        j17 = (j17 * 10) + ((long) i56);
                                        i55++;
                                        cCharAt2 = i55 < length2 ? str.charAt(i55) : (char) 0;
                                        i14 = i57;
                                    } else {
                                        i18 = i14;
                                        i19 = i55 - i17;
                                        if (i55 == length && cCharAt2 == '.') {
                                            int i58 = i55 + 1;
                                            i24 = i58;
                                            c7 = 16;
                                            while (true) {
                                                c14 = '0';
                                                if (length - i24 >= 4) {
                                                    i45 = i58;
                                                    long jCharAt = ((long) str.charAt(i24)) | (((long) str.charAt(i24 + 1)) << 16) | (((long) str.charAt(i24 + 2)) << i15) | (((long) str.charAt(i24 + 3)) << 48);
                                                    long j18 = jCharAt - 13511005043687472L;
                                                    int i59 = (((jCharAt + 19703549022044230L) | j18) & (-35747867511423104L)) != 0 ? -1 : (int) ((j18 * 281475406208040961L) >>> 48);
                                                    if (i59 >= 0) {
                                                        j17 = (j17 * ChatClient.RESOLVE_DEPENDENCY_TIMEOUT) + ((long) i59);
                                                        i24 += 4;
                                                        i58 = i45;
                                                    }
                                                } else {
                                                    i45 = i58;
                                                }
                                            }
                                            char cCharAt9 = i24 < length2 ? str.charAt(i24) : (char) 0;
                                            while (true) {
                                                cCharAt2 = cCharAt9;
                                                while (true) {
                                                    if (i24 != length) {
                                                        int i64 = cCharAt2 - '0';
                                                        if (((char) i64) < '\n') {
                                                            j17 = (j17 * 10) + ((long) i64);
                                                            i24++;
                                                            if (i24 < length2) {
                                                                cCharAt9 = str.charAt(i24);
                                                            } else {
                                                                cCharAt2 = 0;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            int i65 = i45 - i24;
                                            i19 -= i65;
                                            i26 = i65;
                                            i25 = i45;
                                        } else {
                                            c7 = 16;
                                            c14 = '0';
                                            i24 = i55;
                                            i25 = i24;
                                            i26 = 0;
                                        }
                                        if (i19 == 0) {
                                            j16 = ((long) i24) << i15;
                                            jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                            jFloatToRawIntBits = j16 | (jFloatToRawIntBits2 & j7);
                                            cCharAt = cCharAt;
                                        } else {
                                            if ((cCharAt2 | ' ') == 101) {
                                                i27 = i24 + 1;
                                                if (i27 < length2) {
                                                    cCharAt5 = str.charAt(i27);
                                                } else {
                                                    cCharAt5 = 0;
                                                }
                                                if (cCharAt5 == '-') {
                                                    c16 = c3;
                                                } else {
                                                    c16 = 0;
                                                }
                                                if (c16 == 0 || cCharAt5 == '+') {
                                                    i27 = i24 + 2;
                                                }
                                                cCharAt6 = str.charAt(i27);
                                                i38 = 0;
                                                while (true) {
                                                    if (i27 != length) {
                                                        i44 = cCharAt6 - '0';
                                                        i39 = i26;
                                                        if (((char) i44) < '\n') {
                                                            if (i38 < 1024) {
                                                                i38 = (i38 * 10) + i44;
                                                            }
                                                            i27++;
                                                            if (i27 < length2) {
                                                                cCharAt7 = str.charAt(i27);
                                                            } else {
                                                                cCharAt7 = 0;
                                                            }
                                                            cCharAt6 = cCharAt7;
                                                            i26 = i39;
                                                        }
                                                    } else {
                                                        i39 = i26;
                                                    }
                                                }
                                                if (c16 != 0) {
                                                    i28 = -i38;
                                                } else {
                                                    i28 = i38;
                                                }
                                                i26 = i39 + i28;
                                            } else {
                                                i27 = i24;
                                                i28 = 0;
                                            }
                                            i29 = 19;
                                            if (i19 > 19) {
                                                cCharAt3 = str.charAt(i17);
                                                i34 = i17;
                                                while (i27 != length) {
                                                    if (cCharAt3 != c14 || cCharAt3 == '.') {
                                                        if (cCharAt3 == '0') {
                                                            i19--;
                                                        }
                                                        i37 = i34 + 1;
                                                        if (i37 < length2) {
                                                            cCharAt3 = str.charAt(i37);
                                                        } else {
                                                            cCharAt3 = 0;
                                                        }
                                                        i34 = i37;
                                                        i29 = 19;
                                                        c14 = '0';
                                                    } else {
                                                        i29 = 19;
                                                        if (i19 > i29) {
                                                            char cCharAt10 = str.charAt(i17);
                                                            i35 = i28;
                                                            j13 = 0;
                                                            while (true) {
                                                                if (i17 == i55 && Long.compareUnsigned(j13, 1000000000000000000L) < 0) {
                                                                    j13 = (j13 * 10) + ((long) (cCharAt10 - '0'));
                                                                    i17++;
                                                                    cCharAt10 = i17 < length2 ? str.charAt(i17) : (char) 0;
                                                                }
                                                            }
                                                            if (Long.compareUnsigned(j13, 1000000000000000000L) >= 0) {
                                                                i26 = (i55 - i17) + i35;
                                                            } else {
                                                                cCharAt4 = str.charAt(i25);
                                                                i36 = i25;
                                                                for (j15 = 1000000000000000000L; i36 != i24 && Long.compareUnsigned(j13, j15) < 0; j15 = 1000000000000000000L) {
                                                                    j13 = (j13 * 10) + ((long) (cCharAt4 - '0'));
                                                                    i36++;
                                                                    if (i36 < length2) {
                                                                        cCharAt4 = str.charAt(i36);
                                                                    } else {
                                                                        cCharAt4 = 0;
                                                                    }
                                                                }
                                                                i26 = (i25 - i36) + i35;
                                                            }
                                                            c15 = c3;
                                                        } else {
                                                            j13 = j17;
                                                            c15 = 0;
                                                        }
                                                    }
                                                }
                                                if (i19 > i29) {
                                                    char cCharAt11 = str.charAt(i17);
                                                    i35 = i28;
                                                    j13 = 0;
                                                    while (true) {
                                                        if (i17 == i55) {
                                                        }
                                                        if (Long.compareUnsigned(j13, 1000000000000000000L) >= 0) {
                                                            i26 = (i55 - i17) + i35;
                                                        } else {
                                                            cCharAt4 = str.charAt(i25);
                                                            i36 = i25;
                                                            while (i36 != i24) {
                                                                j13 = (j13 * 10) + ((long) (cCharAt4 - '0'));
                                                                i36++;
                                                                if (i36 < length2) {
                                                                    cCharAt4 = str.charAt(i36);
                                                                } else {
                                                                    cCharAt4 = 0;
                                                                }
                                                            }
                                                            i26 = (i25 - i36) + i35;
                                                        }
                                                        c15 = c3;
                                                    }
                                                } else {
                                                    j13 = j17;
                                                    c15 = 0;
                                                }
                                            } else {
                                                j13 = j17;
                                                c15 = 0;
                                            }
                                            if (-10 > i26 && i26 < 11 && c15 == 0 && Long.compareUnsigned(j13, 16777216L) <= 0) {
                                                float f14 = j13;
                                                float[] fArr3 = AbstractC27422a.f110478a;
                                                float f15 = i26 < 0 ? f14 / fArr3[-i26] : f14 * fArr3[i26];
                                                if (z4) {
                                                    f15 = -f15;
                                                }
                                                j14 = ((long) i27) << i15;
                                                iFloatToRawIntBits = Float.floatToRawIntBits(f15);
                                            } else if (j13 == 0) {
                                                if (z4) {
                                                    f13 = -0.0f;
                                                } else {
                                                    f13 = 0.0f;
                                                }
                                                j14 = ((long) i27) << i15;
                                                iFloatToRawIntBits = Float.floatToRawIntBits(f13);
                                            } else if (-126 <= i26 || i26 >= 128) {
                                                String strSubstring = str.substring(i18, i27);
                                                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                                                j14 = ((long) i27) << i15;
                                                iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring));
                                            } else {
                                                long j19 = AbstractC27422a.f110479b[i26 + 325];
                                                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j13);
                                                long j24 = j13 << iNumberOfLeadingZeros;
                                                long j25 = j24 & j7;
                                                long j26 = j24 >>> i15;
                                                long j27 = j19 & j7;
                                                long j28 = j19 >>> i15;
                                                long j29 = j26 * j28;
                                                long j34 = j28 * j25;
                                                long j35 = j29 + ((((j26 * j27) + ((j25 * j27) >>> i15)) + (j34 & j7)) >>> i15) + (j34 >>> i15);
                                                int i66 = (int) (j35 >>> 63);
                                                long j36 = j35 >>> (i66 + 9);
                                                int i67 = iNumberOfLeadingZeros + (i66 ^ 1);
                                                long j37 = j35 & 511;
                                                if (j37 == 511 || (j37 == 0 && (3 & j36) == 1)) {
                                                    String strSubstring2 = str.substring(i18, i27);
                                                    AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                                                    j14 = ((long) i27) << i15;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring2));
                                                } else {
                                                    long j38 = (j36 + 1) >>> c3;
                                                    if (j38 >= 9007199254740992L) {
                                                        i67--;
                                                        j38 = 4503599627370496L;
                                                    }
                                                    long j39 = j38 & (-4503599627370497L);
                                                    long j44 = ((((((long) i26) * 217706) >> c7) + ((long) DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED)) + ((long) 63)) - ((long) i67);
                                                    if (j44 < 1 || j44 > 2046) {
                                                        String strSubstring3 = str.substring(i18, i27);
                                                        AbstractC22676k.m65749i(strSubstring3, "substring(...)");
                                                        j14 = ((long) i27) << i15;
                                                        iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring3));
                                                    } else {
                                                        j14 = ((long) i27) << i15;
                                                        iFloatToRawIntBits = Float.floatToRawIntBits((float) Double.longBitsToDouble((j44 << 52) | j39 | (z4 ? Long.MIN_VALUE : 0L)));
                                                    }
                                                }
                                            }
                                            jFloatToRawIntBits = j14 | (((long) iFloatToRawIntBits) & j7);
                                        }
                                        i14 = (int) (jFloatToRawIntBits >>> i15);
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j7));
                                        if (Float.isNaN(fIntBitsToFloat)) {
                                            fArr = (float[]) c0929d.f3422w;
                                            i47 = i16 + 1;
                                            fArr[i16] = fIntBitsToFloat;
                                            if (i47 >= fArr.length) {
                                                float[] fArr4 = new float[i47 * 2];
                                                c0929d.f3422w = fArr4;
                                                System.arraycopy(fArr, 0, fArr4, 0, fArr.length);
                                            }
                                        } else {
                                            i47 = i16;
                                        }
                                        while (i14 < length) {
                                            i14++;
                                        }
                                        if (i14 >= length) {
                                        }
                                    }
                                }
                                i18 = i14;
                                i19 = i55 - i17;
                                if (i55 == length) {
                                    c7 = 16;
                                    c14 = '0';
                                    i24 = i55;
                                    i25 = i24;
                                    i26 = 0;
                                } else {
                                    c7 = 16;
                                    c14 = '0';
                                    i24 = i55;
                                    i25 = i24;
                                    i26 = 0;
                                }
                                if (i19 == 0) {
                                    j16 = ((long) i24) << i15;
                                    jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                    jFloatToRawIntBits = j16 | (jFloatToRawIntBits2 & j7);
                                    cCharAt = cCharAt;
                                } else {
                                    if ((cCharAt2 | ' ') == 101) {
                                        i27 = i24 + 1;
                                        if (i27 < length2) {
                                            cCharAt5 = str.charAt(i27);
                                        } else {
                                            cCharAt5 = 0;
                                        }
                                        if (cCharAt5 == '-') {
                                            c16 = c3;
                                        } else {
                                            c16 = 0;
                                        }
                                        if (c16 == 0) {
                                            i27 = i24 + 2;
                                        } else {
                                            i27 = i24 + 2;
                                        }
                                        cCharAt6 = str.charAt(i27);
                                        i38 = 0;
                                        while (true) {
                                            if (i27 != length) {
                                                i44 = cCharAt6 - '0';
                                                i39 = i26;
                                                if (((char) i44) < '\n') {
                                                    if (i38 < 1024) {
                                                        i38 = (i38 * 10) + i44;
                                                    }
                                                    i27++;
                                                    if (i27 < length2) {
                                                        cCharAt7 = str.charAt(i27);
                                                    } else {
                                                        cCharAt7 = 0;
                                                    }
                                                    cCharAt6 = cCharAt7;
                                                    i26 = i39;
                                                }
                                            } else {
                                                i39 = i26;
                                            }
                                        }
                                        if (c16 != 0) {
                                            i28 = -i38;
                                        } else {
                                            i28 = i38;
                                        }
                                        i26 = i39 + i28;
                                    } else {
                                        i27 = i24;
                                        i28 = 0;
                                    }
                                    i29 = 19;
                                    if (i19 > 19) {
                                        cCharAt3 = str.charAt(i17);
                                        i34 = i17;
                                        while (i27 != length) {
                                            if (cCharAt3 != c14) {
                                            }
                                            if (cCharAt3 == '0') {
                                                i19--;
                                            }
                                            i37 = i34 + 1;
                                            if (i37 < length2) {
                                                cCharAt3 = str.charAt(i37);
                                            } else {
                                                cCharAt3 = 0;
                                            }
                                            i34 = i37;
                                            i29 = 19;
                                            c14 = '0';
                                        }
                                        if (i19 > i29) {
                                            char cCharAt12 = str.charAt(i17);
                                            i35 = i28;
                                            j13 = 0;
                                            while (true) {
                                                if (i17 == i55) {
                                                }
                                                if (Long.compareUnsigned(j13, 1000000000000000000L) >= 0) {
                                                    i26 = (i55 - i17) + i35;
                                                } else {
                                                    cCharAt4 = str.charAt(i25);
                                                    i36 = i25;
                                                    while (i36 != i24) {
                                                        j13 = (j13 * 10) + ((long) (cCharAt4 - '0'));
                                                        i36++;
                                                        if (i36 < length2) {
                                                            cCharAt4 = str.charAt(i36);
                                                        } else {
                                                            cCharAt4 = 0;
                                                        }
                                                    }
                                                    i26 = (i25 - i36) + i35;
                                                }
                                                c15 = c3;
                                            }
                                        } else {
                                            j13 = j17;
                                            c15 = 0;
                                        }
                                    } else {
                                        j13 = j17;
                                        c15 = 0;
                                    }
                                    if (-10 > i26) {
                                        if (j13 == 0) {
                                            if (z4) {
                                                f13 = -0.0f;
                                            } else {
                                                f13 = 0.0f;
                                            }
                                            j14 = ((long) i27) << i15;
                                            iFloatToRawIntBits = Float.floatToRawIntBits(f13);
                                        } else if (-126 <= i26) {
                                            String strSubstring4 = str.substring(i18, i27);
                                            AbstractC22676k.m65749i(strSubstring4, "substring(...)");
                                            j14 = ((long) i27) << i15;
                                            iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring4));
                                        } else {
                                            String strSubstring5 = str.substring(i18, i27);
                                            AbstractC22676k.m65749i(strSubstring5, "substring(...)");
                                            j14 = ((long) i27) << i15;
                                            iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring5));
                                        }
                                    } else if (j13 == 0) {
                                        if (z4) {
                                            f13 = -0.0f;
                                        } else {
                                            f13 = 0.0f;
                                        }
                                        j14 = ((long) i27) << i15;
                                        iFloatToRawIntBits = Float.floatToRawIntBits(f13);
                                    } else if (-126 <= i26) {
                                        String strSubstring6 = str.substring(i18, i27);
                                        AbstractC22676k.m65749i(strSubstring6, "substring(...)");
                                        j14 = ((long) i27) << i15;
                                        iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring6));
                                    } else {
                                        String strSubstring7 = str.substring(i18, i27);
                                        AbstractC22676k.m65749i(strSubstring7, "substring(...)");
                                        j14 = ((long) i27) << i15;
                                        iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring7));
                                    }
                                    jFloatToRawIntBits = j14 | (((long) iFloatToRawIntBits) & j7);
                                }
                                i14 = (int) (jFloatToRawIntBits >>> i15);
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j7));
                                if (Float.isNaN(fIntBitsToFloat)) {
                                    fArr = (float[]) c0929d.f3422w;
                                    i47 = i16 + 1;
                                    fArr[i16] = fIntBitsToFloat;
                                    if (i47 >= fArr.length) {
                                        float[] fArr5 = new float[i47 * 2];
                                        c0929d.f3422w = fArr5;
                                        System.arraycopy(fArr, 0, fArr5, 0, fArr.length);
                                    }
                                } else {
                                    i47 = i16;
                                }
                                while (i14 < length) {
                                    i14++;
                                }
                                if (i14 >= length) {
                                }
                            }
                            j7 = 4294967295L;
                            c3 = 1;
                            i14 = (int) (jFloatToRawIntBits >>> i15);
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j7));
                            if (Float.isNaN(fIntBitsToFloat)) {
                                fArr = (float[]) c0929d.f3422w;
                                i47 = i16 + 1;
                                fArr[i16] = fIntBitsToFloat;
                                if (i47 >= fArr.length) {
                                    float[] fArr6 = new float[i47 * 2];
                                    c0929d.f3422w = fArr6;
                                    System.arraycopy(fArr, 0, fArr6, 0, fArr.length);
                                }
                            } else {
                                i47 = i16;
                            }
                            while (i14 < length) {
                                i14++;
                            }
                            if (i14 >= length) {
                            }
                        } else {
                            i14++;
                        }
                    }
                } else {
                    cCharAt = cCharAt;
                    i15 = i13;
                    c3 = 1;
                }
                i46 = i14;
                float[] fArr7 = (float[]) c0929d.f3422w;
                int i68 = 2;
                switch (cCharAt) {
                    case 'A':
                        int i69 = i47 - 7;
                        for (int i74 = 0; i74 <= i69; i74 += 7) {
                            arrayList.add(new C27436h(fArr7[i74], fArr7[i74 + 1], fArr7[i74 + 2], Float.compare(fArr7[i74 + 3], 0.0f) != 0 ? c3 : 0, Float.compare(fArr7[i74 + 4], 0.0f) != 0 ? c3 : 0, fArr7[i74 + 5], fArr7[i74 + 6]));
                        }
                        i13 = i15;
                        break;
                    case 'C':
                        int i75 = i47 - 6;
                        for (int i76 = 0; i76 <= i75; i76 += 6) {
                            arrayList.add(new C27439j(fArr7[i76], fArr7[i76 + 1], fArr7[i76 + 2], fArr7[i76 + 3], fArr7[i76 + 4], fArr7[i76 + 5]));
                        }
                        i13 = i15;
                        break;
                    case 'H':
                        int i77 = i47 - 1;
                        for (int i78 = 0; i78 <= i77; i78++) {
                            arrayList.add(new C27440k(fArr7[i78]));
                        }
                        i13 = i15;
                        break;
                    case 'L':
                        int i79 = i47 - 2;
                        for (int i83 = 0; i83 <= i79; i83 += 2) {
                            arrayList.add(new C27441l(fArr7[i83], fArr7[i83 + 1]));
                        }
                        i13 = i15;
                        break;
                    case 'M':
                        int i84 = i47 - 2;
                        if (i84 >= 0) {
                            arrayList.add(new C27442m(fArr7[0], fArr7[c3]));
                            while (i68 <= i84) {
                                arrayList.add(new C27441l(fArr7[i68], fArr7[i68 + 1]));
                                i68 += 2;
                            }
                        }
                        i13 = i15;
                        break;
                    case 'Q':
                        int i85 = i47 - 4;
                        for (int i86 = 0; i86 <= i85; i86 += 4) {
                            arrayList.add(new C27443n(fArr7[i86], fArr7[i86 + 1], fArr7[i86 + 2], fArr7[i86 + 3]));
                        }
                        i13 = i15;
                        break;
                    case 'S':
                        int i87 = i47 - 4;
                        for (int i88 = 0; i88 <= i87; i88 += 4) {
                            arrayList.add(new C27444o(fArr7[i88], fArr7[i88 + 1], fArr7[i88 + 2], fArr7[i88 + 3]));
                        }
                        i13 = i15;
                        break;
                    case 'T':
                        int i89 = i47 - 2;
                        for (int i94 = 0; i94 <= i89; i94 += 2) {
                            arrayList.add(new C27445p(fArr7[i94], fArr7[i94 + 1]));
                        }
                        i13 = i15;
                        break;
                    case 'V':
                        int i95 = i47 - 1;
                        for (int i96 = 0; i96 <= i95; i96++) {
                            arrayList.add(new C27455z(fArr7[i96]));
                        }
                        i13 = i15;
                        break;
                    case 'Z':
                    case 'z':
                        arrayList.add(C27438i.f110602c);
                        i13 = i15;
                        break;
                    case 'a':
                        int i97 = i47 - 7;
                        for (int i98 = 0; i98 <= i97; i98 += 7) {
                            arrayList.add(new C27446q(fArr7[i98], fArr7[i98 + 1], fArr7[i98 + 2], Float.compare(fArr7[i98 + 3], 0.0f) != 0 ? c3 : 0, Float.compare(fArr7[i98 + 4], 0.0f) != 0 ? c3 : 0, fArr7[i98 + 5], fArr7[i98 + 6]));
                        }
                        i13 = i15;
                        break;
                    case LogPriority.NONE /* 99 */:
                        int i99 = i47 - 6;
                        for (int i100 = 0; i100 <= i99; i100 += 6) {
                            arrayList.add(new C27447r(fArr7[i100], fArr7[i100 + 1], fArr7[i100 + 2], fArr7[i100 + 3], fArr7[i100 + 4], fArr7[i100 + 5]));
                        }
                        i13 = i15;
                        break;
                    case 'h':
                        int i101 = i47 - 1;
                        for (int i102 = 0; i102 <= i101; i102++) {
                            arrayList.add(new C27448s(fArr7[i102]));
                        }
                        i13 = i15;
                        break;
                    case 'l':
                        int i103 = i47 - 2;
                        for (int i104 = 0; i104 <= i103; i104 += 2) {
                            arrayList.add(new C27449t(fArr7[i104], fArr7[i104 + 1]));
                        }
                        i13 = i15;
                        break;
                    case 'm':
                        int i105 = i47 - 2;
                        if (i105 >= 0) {
                            arrayList.add(new C27450u(fArr7[0], fArr7[c3]));
                            while (i68 <= i105) {
                                arrayList.add(new C27449t(fArr7[i68], fArr7[i68 + 1]));
                                i68 += 2;
                            }
                        }
                        i13 = i15;
                        break;
                    case 'q':
                        int i106 = i47 - 4;
                        for (int i107 = 0; i107 <= i106; i107 += 4) {
                            arrayList.add(new C27451v(fArr7[i107], fArr7[i107 + 1], fArr7[i107 + 2], fArr7[i107 + 3]));
                        }
                        i13 = i15;
                        break;
                    case 's':
                        int i108 = i47 - 4;
                        for (int i109 = 0; i109 <= i108; i109 += 4) {
                            arrayList.add(new C27452w(fArr7[i109], fArr7[i109 + 1], fArr7[i109 + 2], fArr7[i109 + 3]));
                        }
                        i13 = i15;
                        break;
                    case 't':
                        int i110 = i47 - 2;
                        for (int i111 = 0; i111 <= i110; i111 += 2) {
                            arrayList.add(new C27453x(fArr7[i111], fArr7[i111 + 1]));
                        }
                        i13 = i15;
                        break;
                    case 'v':
                        int i112 = i47 - 1;
                        for (int i113 = 0; i113 <= i112; i113++) {
                            arrayList.add(new C27454y(fArr7[i113]));
                        }
                        i13 = i15;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command for: " + cCharAt);
                }
            } else {
                i46 = i14;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: A */
    public void m2338A(Resources.Theme theme, TypedValue typedValue) {
        int i13;
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i13 = typedValue.resourceId) == 0) {
            return;
        }
        ((MainActivity) this.f3422w).setTheme(i13);
    }

    /* JADX INFO: renamed from: B */
    public void m2339B(float f13, float f14) {
        ((C0237p) this.f3422w).m716w().mo51416f(f13, f14);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x011f  */
    /* JADX INFO: renamed from: C */
    public AbstractC0954a m2340C(String events, String str) throws Throwable {
        InputStream errorStream;
        AbstractC22676k.m65750j(events, "events");
        C15906g c15906g = (C15906g) this.f3422w;
        String str2 = c15906g.f60170s == 2 ? "https://api.eu.amplitude.com/2/httpapi" : "https://api2.amplitude.com/2/httpapi";
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str2).openConnection();
            AbstractC22676k.m65748h(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(20000);
            String apiKey = c15906g.f60152a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            AbstractC22676k.m65750j(apiKey, "apiKey");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StreamDateFormatter.DATE_FORMAT, Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("{\"api_key\":\"", apiKey, "\",\"client_upload_time\":\"");
            String str3 = simpleDateFormat.format(new Date(jCurrentTimeMillis));
            AbstractC22676k.m65749i(str3, "sdf.format(Date(clientUploadTime))");
            sbM53375p.append(str3);
            sbM53375p.append("\",\"events\":");
            sbM53375p.append(events);
            sb4.append(sbM53375p.toString());
            if (str != null) {
                sb4.append(",\"request_metadata\":{\"sdk\":" + str + '}');
            }
            sb4.append("}");
            String string = sb4.toString();
            AbstractC22676k.m65749i(string, "StringBuilder().apply(builderAction).toString()");
            byte[] bytes = string.getBytes(AbstractC39397a.f169546a);
            AbstractC22676k.m65749i(bytes, "this as java.lang.String).getBytes(charset)");
            httpURLConnection.getOutputStream().write(bytes, 0, bytes.length);
            httpURLConnection.getOutputStream().close();
            int responseCode = httpURLConnection.getResponseCode();
            InputStream inputStream = null;
            try {
                try {
                    try {
                        try {
                            errorStream = httpURLConnection.getInputStream();
                            AbstractC22676k.m65749i(errorStream, "{\n            connection.inputStream\n        }");
                        } catch (Throwable th3) {
                            th = th3;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (IOException unused) {
                        errorStream = null;
                        AbstractC0954a abstractC0954aM5394l = AbstractC1772c1.m5394l(408, null);
                        if (errorStream != null) {
                            errorStream.close();
                        }
                        httpURLConnection.disconnect();
                        return abstractC0954aM5394l;
                    }
                } catch (IOException unused2) {
                    errorStream = httpURLConnection.getErrorStream();
                    AbstractC22676k.m65749i(errorStream, "{\n            connection.errorStream\n        }");
                }
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, AbstractC39397a.f169546a), DfuBaseService.ERROR_REMOTE_MASK);
                    try {
                        String strM114200h = AbstractC35952b.m114200h(bufferedReader);
                        bufferedReader.close();
                        AbstractC0954a abstractC0954aM5394l2 = AbstractC1772c1.m5394l(responseCode, strM114200h);
                        errorStream.close();
                        httpURLConnection.disconnect();
                        return abstractC0954aM5394l2;
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            AbstractC35854l.m113829i(bufferedReader, th4);
                            throw th5;
                        }
                    }
                } catch (IOException unused3) {
                    AbstractC0954a abstractC0954aM5394l3 = AbstractC1772c1.m5394l(408, null);
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    httpURLConnection.disconnect();
                    return abstractC0954aM5394l3;
                }
            } catch (Throwable th6) {
                th = th6;
                inputStream = null;
            }
        } catch (MalformedURLException e5) {
            throw new IOException("Attempted to use malformed url: ".concat(str2), e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b5  */
    /* JADX INFO: renamed from: D */
    public void m2341D(InterfaceC31162w interfaceC31162w, StringBuilder sb4) {
        String strM122188X;
        boolean z4;
        C38148i c38148i = (C38148i) this.f3422w;
        C38151l c38151l = c38148i.f163321a;
        C38151l c38151l2 = c38148i.f163321a;
        if (!c38148i.m122215r()) {
            C12669c c12669c = c38151l2.f163372g;
            InterfaceC21493z[] interfaceC21493zArr = C38151l.f163341Y;
            if (!((Boolean) c12669c.getValue(c38151l2, interfaceC21493zArr[5])).booleanValue()) {
                List listMo78671c0 = interfaceC31162w.mo78671c0();
                AbstractC22676k.m65749i(listMo78671c0, "getContextReceiverParameters(...)");
                c38148i.m122168C(sb4, listMo78671c0);
                c38148i.m122221y(sb4, interfaceC31162w, null);
                AbstractC31152r visibility = interfaceC31162w.getVisibility();
                AbstractC22676k.m65749i(visibility, "getVisibility(...)");
                c38148i.m122204g0(visibility, sb4);
                c38148i.m122178M(interfaceC31162w, sb4);
                if (((Boolean) c38151l2.f163361T.getValue(c38151l2, interfaceC21493zArr[44])).booleanValue()) {
                    c38148i.m122176K(interfaceC31162w, sb4);
                }
                c38148i.m122184S(interfaceC31162w, sb4);
                if (((Boolean) c38151l2.f163361T.getValue(c38151l2, interfaceC21493zArr[44])).booleanValue()) {
                    boolean z13 = false;
                    if (interfaceC31162w.isOperator()) {
                        Collection collectionMo78673h = interfaceC31162w.mo78673h();
                        AbstractC22676k.m65749i(collectionMo78673h, "getOverriddenDescriptors(...)");
                        Collection collection = collectionMo78673h;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((InterfaceC31162w) it.next()).isOperator()) {
                                        if (!((Boolean) c38151l2.f163356O.getValue(c38151l2, C38151l.f163341Y[39])).booleanValue()) {
                                            z4 = false;
                                        }
                                    }
                                }
                            }
                        }
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (interfaceC31162w.isInfix()) {
                        Collection collectionMo78673h2 = interfaceC31162w.mo78673h();
                        AbstractC22676k.m65749i(collectionMo78673h2, "getOverriddenDescriptors(...)");
                        Collection collection2 = collectionMo78673h2;
                        if (!collection2.isEmpty()) {
                            Iterator it3 = collection2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((InterfaceC31162w) it3.next()).isInfix()) {
                                        if (!((Boolean) c38151l2.f163356O.getValue(c38151l2, C38151l.f163341Y[39])).booleanValue()) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z13 = true;
                                break;
                            }
                        }
                        z13 = true;
                        break;
                    }
                    c38148i.m122179N(sb4, interfaceC31162w.mo60566q(), "tailrec");
                    c38148i.m122179N(sb4, interfaceC31162w.isSuspend(), "suspend");
                    c38148i.m122179N(sb4, interfaceC31162w.isInline(), "inline");
                    c38148i.m122179N(sb4, z13, "infix");
                    c38148i.m122179N(sb4, z4, "operator");
                } else {
                    c38148i.m122179N(sb4, interfaceC31162w.isSuspend(), "suspend");
                }
                c38148i.m122175J(interfaceC31162w, sb4);
                if (c38148i.m122218u()) {
                    if (interfaceC31162w.mo95881f0()) {
                        sb4.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC31162w.mo95882j0()) {
                        sb4.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb4.append(c38148i.m122174I("fun"));
            sb4.append(" ");
            List typeParameters = interfaceC31162w.getTypeParameters();
            AbstractC22676k.m65749i(typeParameters, "getTypeParameters(...)");
            c38148i.m122196c0(typeParameters, sb4, true);
            c38148i.m122186U(interfaceC31162w, sb4);
        }
        c38148i.m122181P(interfaceC31162w, sb4, true);
        List listMo78676v = interfaceC31162w.mo78676v();
        AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
        c38148i.m122202f0(listMo78676v, interfaceC31162w.mo48179S(), sb4);
        c38148i.m122187V(interfaceC31162w, sb4);
        AbstractC23811y returnType = interfaceC31162w.getReturnType();
        C12669c c12669c2 = c38151l.f163377l;
        InterfaceC21493z[] interfaceC21493zArr2 = C38151l.f163341Y;
        if (!((Boolean) c12669c2.getValue(c38151l, interfaceC21493zArr2[10])).booleanValue()) {
            if (((Boolean) c38151l.f163376k.getValue(c38151l, interfaceC21493zArr2[9])).booleanValue() || returnType == null) {
                sb4.append(": ");
                if (returnType == null) {
                    strM122188X = "[NULL]";
                } else {
                    strM122188X = c38148i.m122188X(returnType);
                }
                sb4.append(strM122188X);
            } else {
                C35850h c35850h = AbstractC27736h.f111789e;
                if (!AbstractC27736h.m83803E(returnType, AbstractC27741m.f111849d)) {
                    sb4.append(": ");
                    if (returnType == null) {
                        strM122188X = "[NULL]";
                    } else {
                        strM122188X = c38148i.m122188X(returnType);
                    }
                    sb4.append(strM122188X);
                }
            }
        }
        List typeParameters2 = interfaceC31162w.getTypeParameters();
        AbstractC22676k.m65749i(typeParameters2, "getTypeParameters(...)");
        c38148i.m122206h0(sb4, typeParameters2);
    }

    /* JADX INFO: renamed from: E */
    public void m2342E(AbstractC34685k0 abstractC34685k0, StringBuilder sb4, String str) {
        C38148i c38148i = (C38148i) this.f3422w;
        C38151l c38151l = c38148i.f163321a;
        int iOrdinal = ((EnumC38156q) c38151l.f163349H.getValue(c38151l, C38151l.f163341Y[32])).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                m2341D(abstractC34685k0, sb4);
                return;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        c38148i.m122176K(abstractC34685k0, sb4);
        sb4.append(str.concat(" for "));
        InterfaceC31145n0 interfaceC31145n0M109573J0 = abstractC34685k0.m109573J0();
        AbstractC22676k.m65749i(interfaceC31145n0M109573J0, "getCorrespondingProperty(...)");
        C38148i.m122163o(c38148i, interfaceC31145n0M109573J0, sb4);
    }

    @Override // p586wk.InterfaceC37328f
    /* JADX INFO: renamed from: a */
    public void mo2343a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l7 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f3422w)) {
            ((ByteBuffer) this.f3422w).position(0);
            messageDigest.update(((ByteBuffer) this.f3422w).putLong(l7.longValue()).array());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2344b(InterfaceC17910s0 interfaceC17910s0, int i13) {
        ((C0237p) this.f3422w).m716w().mo51423n(interfaceC17910s0, i13);
    }

    @Override // p586wk.InterfaceC37325c
    /* JADX INFO: renamed from: c */
    public boolean mo2345c(Object obj, File file, C37330h c37330h) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C0960g c0960g = (C0960g) this.f3422w;
        byte[] bArr = (byte[]) c0960g.m2444c(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i13 = inputStream.read(bArr);
                        if (i13 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i13);
                    } catch (IOException e5) {
                        e = e5;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        c0960g.m2448g(bArr);
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c0960g.m2448g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c0960g.m2448g(bArr);
                return true;
            } catch (IOException e13) {
                e = e13;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2346d(float f13, float f14, float f15, float f16, int i13) {
        ((C0237p) this.f3422w).m716w().mo51415e(f13, f14, f15, f16, i13);
    }

    /* JADX INFO: renamed from: f */
    public void m2347f(String key) {
        AbstractC22676k.m65750j(key, "key");
        ((SharedPreferences) this.f3422w).edit().remove(key).commit();
    }

    @Override // pg3.InterfaceC29189h
    /* JADX INFO: renamed from: g */
    public void mo2323g(InterfaceC29182e interfaceC29182e, C29218v0 c29218v0) {
        C3033m c3033m = (C3033m) this.f3422w;
        if (c29218v0.f118269a.f146788Q) {
            c3033m.resumeWith(c29218v0.f118270b);
        } else {
            c3033m.resumeWith(AbstractC34132o.m107888l(new HttpException(c29218v0)));
        }
    }

    /* JADX INFO: renamed from: h */
    public C3632c m2348h(C35845c classId, C32331e metadataVersion) {
        C36969b c36969bM113810l;
        AbstractC22676k.m65750j(classId, "classId");
        AbstractC22676k.m65750j(metadataVersion, "metadataVersion");
        String strM125927L = AbstractC39421y.m125927L(classId.f152610b.f152613a.f152616a, '.', '$');
        C35847e c35847e = classId.f152609a;
        if (!c35847e.f152613a.m113793c()) {
            strM125927L = c35847e + '.' + strM125927L;
        }
        Class clsM113786k = AbstractC35846d.m113786k((ClassLoader) this.f3422w, strM125927L);
        if (clsM113786k == null || (c36969bM113810l = AbstractC35849g.m113810l(clsM113786k)) == null) {
            return null;
        }
        return new C3632c(c36969bM113810l);
    }

    @Override // io.sentry.cache.tape.InterfaceC20288e
    /* JADX INFO: renamed from: i */
    public Object mo2349i(byte[] bArr) {
        C20283f c20283f = (C20283f) this.f3422w;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), C20283f.f76164c));
            try {
                C20315e c20315e = (C20315e) c20283f.f76165a.getSerializer().mo56239e(bufferedReader, C20315e.class);
                bufferedReader.close();
                return c20315e;
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            c20283f.f76165a.getLogger().mo16058i(EnumC20436n5.ERROR, th5, "Error reading entity from scope cache", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public C30374b0 m2350j(Context context, String str, InputStream inputStream, String str2, String str3) {
        C30374b0 c30374b0M92869h;
        EnumC0927b enumC0927b;
        C0928c c0928c = (C0928c) this.f3422w;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            AbstractC12058c.m33238a();
            EnumC0927b enumC0927b2 = EnumC0927b.ZIP;
            c30374b0M92869h = str3 != null ? AbstractC30391l.m92869h(context, new ZipInputStream(new FileInputStream(c0928c.m2316Z(str, inputStream, enumC0927b2))), str) : AbstractC30391l.m92869h(context, new ZipInputStream(inputStream), null);
            enumC0927b = enumC0927b2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            AbstractC12058c.m33238a();
            enumC0927b = EnumC0927b.GZIP;
            if (str3 != null) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(c0928c.m2316Z(str, inputStream, enumC0927b)));
                HashMap map = AbstractC30391l.f124703a;
                c30374b0M92869h = AbstractC30391l.m92866e(AbstractC26604b.m79166k(gZIPInputStream), str);
            } else {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
                HashMap map2 = AbstractC30391l.f124703a;
                c30374b0M92869h = AbstractC30391l.m92866e(AbstractC26604b.m79166k(gZIPInputStream2), null);
            }
        } else {
            AbstractC12058c.m33238a();
            enumC0927b = EnumC0927b.JSON;
            if (str3 != null) {
                FileInputStream fileInputStream = new FileInputStream(c0928c.m2316Z(str, inputStream, enumC0927b).getAbsolutePath());
                HashMap map3 = AbstractC30391l.f124703a;
                c30374b0M92869h = AbstractC30391l.m92866e(AbstractC26604b.m79166k(fileInputStream), str);
            } else {
                HashMap map4 = AbstractC30391l.f124703a;
                c30374b0M92869h = AbstractC30391l.m92866e(AbstractC26604b.m79166k(inputStream), null);
            }
        }
        if (str3 != null && c30374b0M92869h.f124646a != null) {
            File file = new File(c0928c.m2305O(), C0928c.m2289F(str, enumC0927b, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            AbstractC12058c.m33238a();
            if (!zRenameTo) {
                AbstractC12058c.m33239b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return c30374b0M92869h;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC28670t2 m2351k() {
        C16955j c16955jM47708a = C16955j.m47708a();
        if (c16955jM47708a.m47711c() == 1) {
            return new C33498j(true);
        }
        C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(Boolean.FALSE);
        c16955jM47708a.m47715h(new C33494f(c28633k1M87272z, this));
        return c28633k1M87272z;
    }

    /* JADX INFO: renamed from: l */
    public long m2352l(String key, long j7) {
        AbstractC22676k.m65750j(key, "key");
        return ((SharedPreferences) this.f3422w).getLong(key, j7);
    }

    @Override // io.sentry.cache.tape.InterfaceC20288e
    /* JADX INFO: renamed from: m */
    public void mo2353m(OutputStream outputStream, Object obj) throws IOException {
        C20315e c20315e = (C20315e) obj;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, C20283f.f76164c));
        try {
            ((C20283f) this.f3422w).f76165a.getSerializer().mo56235a(bufferedWriter, c20315e);
            bufferedWriter.close();
        } catch (Throwable th3) {
            try {
                bufferedWriter.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: n */
    public ArrayList m2354n(StackTraceElement[] stackTraceElementArr, boolean z4) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z4 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    C20505z c20505z = new C20505z();
                    C20513q6 c20513q6 = (C20513q6) this.f3422w;
                    c20505z.f76830K = m2335q(className, c20513q6.getInAppIncludes(), c20513q6.getInAppExcludes());
                    c20505z.f76825F = className;
                    c20505z.f76824E = stackTraceElement.getMethodName();
                    c20505z.f76845z = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        c20505z.f76826G = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    c20505z.f76832M = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(c20505z);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public void m2355o(float f13, float f14, float f15, float f16) {
        C0237p c0237p = (C0237p) this.f3422w;
        InterfaceC17915v interfaceC17915vM716w = c0237p.m716w();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0237p.m670A() >> 32)) - (f15 + f13);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0237p.m670A() & 4294967295L)) - (f16 + f14))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            AbstractC17892j0.m51467a("Width and height must be greater than or equal to zero");
        }
        c0237p.m690U(jFloatToRawIntBits);
        interfaceC17915vM716w.mo51416f(f13, f14);
    }

    /* JADX INFO: renamed from: p */
    public void mo2356p() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = ((MainActivity) this.f3422w).getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        m2338A(theme, typedValue);
    }

    @Override // pg3.InterfaceC29189h
    /* JADX INFO: renamed from: r */
    public void mo2329r(InterfaceC29182e interfaceC29182e, Throwable th3) {
        ((C3033m) this.f3422w).resumeWith(AbstractC34132o.m107888l(th3));
    }

    @Override // xg3.InterfaceC38282i
    public void request(long j7) {
        C4688i0 c4688i0 = (C4688i0) this.f3422w;
        if (j7 > 0) {
            AbstractC4677d.m14745b(c4688i0.f19198K, j7);
            c4688i0.m14767h();
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m2357u(long j7, String key) {
        AbstractC22676k.m65750j(key, "key");
        return ((SharedPreferences) this.f3422w).edit().putLong(key, j7).commit();
    }

    /* JADX INFO: renamed from: v */
    public void m2358v(float f13, long j7) {
        InterfaceC17915v interfaceC17915vM716w = ((C0237p) this.f3422w).m716w();
        int i13 = (int) (j7 >> 32);
        int i14 = (int) (j7 & 4294967295L);
        interfaceC17915vM716w.mo51416f(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14));
        interfaceC17915vM716w.mo51419j(f13);
        interfaceC17915vM716w.mo51416f(-Float.intBitsToFloat(i13), -Float.intBitsToFloat(i14));
    }

    @Override // r93.InterfaceC31141m
    public Object visitClassDescriptor(InterfaceC31117e interfaceC31117e, Object obj) throws IOException {
        C34682j c34682jMo60501s;
        String str;
        StringBuilder sb4 = (StringBuilder) obj;
        C38148i c38148i = (C38148i) this.f3422w;
        C38151l c38151l = c38148i.f163321a;
        boolean z4 = interfaceC31117e.getKind() == EnumC31120f.f128331z;
        if (!c38148i.m122215r()) {
            List listMo60578M = interfaceC31117e.mo60578M();
            AbstractC22676k.m65749i(listMo60578M, "getContextReceivers(...)");
            c38148i.m122168C(sb4, listMo60578M);
            c38148i.m122221y(sb4, interfaceC31117e, null);
            if (!z4) {
                AbstractC31152r visibility = interfaceC31117e.getVisibility();
                AbstractC22676k.m65749i(visibility, "getVisibility(...)");
                c38148i.m122204g0(visibility, sb4);
            }
            if ((interfaceC31117e.getKind() != EnumC31120f.f128329x || interfaceC31117e.mo60498k() != EnumC31106a0.f128307E) && (!interfaceC31117e.getKind().m95867a() || interfaceC31117e.mo60498k() != EnumC31106a0.f128310x)) {
                EnumC31106a0 enumC31106a0Mo60498k = interfaceC31117e.mo60498k();
                AbstractC22676k.m65749i(enumC31106a0Mo60498k, "getModality(...)");
                c38148i.m122177L(enumC31106a0Mo60498k, sb4, C38148i.m122164v(interfaceC31117e));
            }
            c38148i.m122176K(interfaceC31117e, sb4);
            c38148i.m122179N(sb4, c38148i.m122214q().contains(EnumC38149j.INNER) && interfaceC31117e.isInner(), "inner");
            c38148i.m122179N(sb4, c38148i.m122214q().contains(EnumC38149j.DATA) && interfaceC31117e.mo60500o0(), "data");
            c38148i.m122179N(sb4, c38148i.m122214q().contains(EnumC38149j.INLINE) && interfaceC31117e.isInline(), "inline");
            c38148i.m122179N(sb4, c38148i.m122214q().contains(EnumC38149j.VALUE) && interfaceC31117e.isValue(), "value");
            c38148i.m122179N(sb4, c38148i.m122214q().contains(EnumC38149j.FUN) && interfaceC31117e.mo60492Q(), "fun");
            if (interfaceC31117e instanceof InterfaceC31163w0) {
                str = "typealias";
            } else if (interfaceC31117e.mo60491N()) {
                str = "companion object";
            } else {
                int iOrdinal = interfaceC31117e.getKind().ordinal();
                if (iOrdinal == 0) {
                    str = "class";
                } else if (iOrdinal == 1) {
                    str = "interface";
                } else if (iOrdinal == 2) {
                    str = "enum class";
                } else if (iOrdinal == 3) {
                    str = "enum entry";
                } else if (iOrdinal == 4) {
                    str = "annotation class";
                } else {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "object";
                }
            }
            sb4.append(c38148i.m122174I(str));
        }
        if (AbstractC39363f.m125529k(interfaceC31117e)) {
            if (((Boolean) c38151l.f163348G.getValue(c38151l, C38151l.f163341Y[31])).booleanValue()) {
                if (c38148i.m122215r()) {
                    sb4.append("companion object");
                }
                C38148i.m122161W(sb4);
                InterfaceC31135k interfaceC31135kMo60581g = interfaceC31117e.mo60581g();
                if (interfaceC31135kMo60581g != null) {
                    sb4.append("of ");
                    C35850h name = interfaceC31135kMo60581g.getName();
                    AbstractC22676k.m65749i(name, "getName(...)");
                    sb4.append(c38148i.m122180O(name, false));
                }
            }
            if (c38148i.m122218u() || !AbstractC22676k.m65745e(interfaceC31117e.getName(), AbstractC35852j.f152625b)) {
                if (!c38148i.m122215r()) {
                    C38148i.m122161W(sb4);
                }
                C35850h name2 = interfaceC31117e.getName();
                AbstractC22676k.m65749i(name2, "getName(...)");
                sb4.append(c38148i.m122180O(name2, true));
            }
        } else {
            if (!c38148i.m122215r()) {
                C38148i.m122161W(sb4);
            }
            c38148i.m122181P(interfaceC31117e, sb4, true);
        }
        if (!z4) {
            List listMo60497j = interfaceC31117e.mo60497j();
            AbstractC22676k.m65749i(listMo60497j, "getDeclaredTypeParameters(...)");
            c38148i.m122196c0(listMo60497j, sb4, false);
            c38148i.m122166A(interfaceC31117e, sb4);
            if (!interfaceC31117e.getKind().m95867a() && ((Boolean) c38151l.f163374i.getValue(c38151l, C38151l.f163341Y[7])).booleanValue() && (c34682jMo60501s = interfaceC31117e.mo60501s()) != null) {
                sb4.append(" ");
                c38148i.m122221y(sb4, c34682jMo60501s, null);
                C34682j c34682j = c34682jMo60501s;
                AbstractC31152r visibility2 = c34682j.getVisibility();
                AbstractC22676k.m65749i(visibility2, "getVisibility(...)");
                c38148i.m122204g0(visibility2, sb4);
                sb4.append(c38148i.m122174I("constructor"));
                List listMo78676v = c34682j.mo78676v();
                AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
                c38148i.m122202f0(listMo78676v, c34682jMo60501s.mo48179S(), sb4);
            }
            if (!((Boolean) c38151l.f163389x.getValue(c38151l, C38151l.f163341Y[22])).booleanValue() && !AbstractC27736h.m83804F(interfaceC31117e.mo60594i())) {
                Collection supertypes = interfaceC31117e.mo60496e().getSupertypes();
                AbstractC22676k.m65749i(supertypes, "getSupertypes(...)");
                if (!supertypes.isEmpty() && (supertypes.size() != 1 || !AbstractC27736h.m83813y((AbstractC23811y) supertypes.iterator().next()))) {
                    C38148i.m122161W(sb4);
                    sb4.append(": ");
                    AbstractC25265s.m74109M0(supertypes, sb4, ", ", null, null, new C38147h(c38148i, 1), 60);
                }
            }
            c38148i.m122206h0(sb4, listMo60497j);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0048  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r93.InterfaceC31141m
    public Object visitConstructorDescriptor(InterfaceC31132j interfaceC31132j, Object obj) {
        boolean z4;
        C34682j c34682jMo60501s;
        StringBuilder sb4 = (StringBuilder) obj;
        C38148i c38148i = (C38148i) this.f3422w;
        c38148i.getClass();
        c38148i.m122221y(sb4, interfaceC31132j, null);
        C38151l c38151l = c38148i.f163321a;
        C12669c c12669c = c38151l.f163380o;
        InterfaceC21493z[] interfaceC21493zArr = C38151l.f163341Y;
        if (((Boolean) c12669c.getValue(c38151l, interfaceC21493zArr[13])).booleanValue() || ((C34682j) interfaceC31132j).mo95870P().mo60498k() != EnumC31106a0.f128311y) {
            AbstractC31152r visibility = ((AbstractC34710x) interfaceC31132j).getVisibility();
            AbstractC22676k.m65749i(visibility, "getVisibility(...)");
            if (c38148i.m122204g0(visibility, sb4)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        c38148i.m122175J(interfaceC31132j, sb4);
        boolean z13 = ((Boolean) c38151l.f163357P.getValue(c38151l, interfaceC21493zArr[40])).booleanValue() || !((C34682j) interfaceC31132j).f146080e0 || z4;
        if (z13) {
            sb4.append(c38148i.m122174I("constructor"));
        }
        C34682j c34682j = (C34682j) interfaceC31132j;
        InterfaceC31117e interfaceC31117eM109566V0 = c34682j.mo60581g();
        AbstractC22676k.m65749i(interfaceC31117eM109566V0, "getContainingDeclaration(...)");
        if (((Boolean) c38151l.f163342A.getValue(c38151l, interfaceC21493zArr[25])).booleanValue()) {
            if (z13) {
                sb4.append(" ");
            }
            c38148i.m122181P(interfaceC31117eM109566V0, sb4, true);
            c38148i.m122196c0(((AbstractC34710x) interfaceC31132j).getTypeParameters(), sb4, false);
        }
        AbstractC34710x abstractC34710x = (AbstractC34710x) interfaceC31132j;
        List listMo78676v = abstractC34710x.mo78676v();
        AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
        c38148i.m122202f0(listMo78676v, interfaceC31132j.mo48179S(), sb4);
        if (((Boolean) c38151l.f163382q.getValue(c38151l, interfaceC21493zArr[15])).booleanValue() && !c34682j.f146080e0 && (c34682jMo60501s = interfaceC31117eM109566V0.mo60501s()) != null) {
            List listMo78676v2 = c34682jMo60501s.mo78676v();
            AbstractC22676k.m65749i(listMo78676v2, "getValueParameters(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listMo78676v2) {
                C34709w0 c34709w0 = (C34709w0) ((InterfaceC31107a1) obj2);
                if (!c34709w0.m109625J0() && c34709w0.f146190K == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                sb4.append(" : ");
                sb4.append(c38148i.m122174I("this"));
                sb4.append(AbstractC25265s.m74110N0(arrayList, ", ", "(", ")", C38146g.f163313y, 24));
            }
        }
        if (((Boolean) c38151l.f163342A.getValue(c38151l, C38151l.f163341Y[25])).booleanValue()) {
            c38148i.m122206h0(sb4, abstractC34710x.getTypeParameters());
        }
        return C23454a0.f92919a;
    }

    @Override // r93.InterfaceC31141m
    public /* bridge */ /* synthetic */ Object visitFunctionDescriptor(InterfaceC31162w interfaceC31162w, Object obj) {
        m2341D(interfaceC31162w, (StringBuilder) obj);
        return C23454a0.f92919a;
    }

    @Override // r93.InterfaceC31141m
    public Object visitModuleDeclaration(InterfaceC31109b0 interfaceC31109b0, Object obj) {
        ((C38148i) this.f3422w).m122181P(interfaceC31109b0, (StringBuilder) obj, true);
        return C23454a0.f92919a;
    }

    @Override // r93.InterfaceC31141m
    public Object visitPackageFragmentDescriptor(InterfaceC31124g0 interfaceC31124g0, Object obj) {
        StringBuilder sb4 = (StringBuilder) obj;
        C38148i c38148i = (C38148i) this.f3422w;
        c38148i.getClass();
        AbstractC34677g0 abstractC34677g0 = (AbstractC34677g0) interfaceC31124g0;
        C35847e c35847e = abstractC34677g0.f146067F;
        sb4.append(c38148i.m122174I("package-fragment"));
        C35848f fqName = c35847e.f152613a;
        AbstractC22676k.m65750j(fqName, "fqName");
        String strM122213p = c38148i.m122213p(AbstractC35744b.m113237j(C35848f.m113790f(fqName)));
        if (strM122213p.length() > 0) {
            sb4.append(" ");
            sb4.append(strM122213p);
        }
        if (c38148i.f163321a.m122222o()) {
            sb4.append(" in ");
            c38148i.m122181P(abstractC34677g0.mo60581g(), sb4, false);
        }
        return C23454a0.f92919a;
    }

    @Override // r93.InterfaceC31141m
    public Object visitPackageViewDescriptor(InterfaceC31136k0 interfaceC31136k0, Object obj) {
        StringBuilder sb4 = (StringBuilder) obj;
        C38148i c38148i = (C38148i) this.f3422w;
        c38148i.getClass();
        C34665a0 c34665a0 = (C34665a0) interfaceC31136k0;
        C35847e c35847e = c34665a0.f146028E;
        sb4.append(c38148i.m122174I("package"));
        C35848f fqName = c35847e.f152613a;
        AbstractC22676k.m65750j(fqName, "fqName");
        String strM122213p = c38148i.m122213p(AbstractC35744b.m113237j(C35848f.m113790f(fqName)));
        if (strM122213p.length() > 0) {
            sb4.append(" ");
            sb4.append(strM122213p);
        }
        if (c38148i.f163321a.m122222o()) {
            sb4.append(" in context of ");
            c38148i.m122181P(c34665a0.f146032z, sb4, false);
        }
        return C23454a0.f92919a;
    }

    @Override // r93.InterfaceC31141m
    public Object visitPropertyDescriptor(InterfaceC31145n0 descriptor, Object obj) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        C38148i.m122163o((C38148i) this.f3422w, descriptor, (StringBuilder) obj);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r93.InterfaceC31141m
    public Object visitPropertyGetterDescriptor(InterfaceC31147o0 interfaceC31147o0, Object obj) {
        m2342E((AbstractC34685k0) interfaceC31147o0, (StringBuilder) obj, "getter");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r93.InterfaceC31141m
    public Object visitPropertySetterDescriptor(InterfaceC31149p0 interfaceC31149p0, Object obj) {
        m2342E((AbstractC34685k0) interfaceC31149p0, (StringBuilder) obj, "setter");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r93.InterfaceC31141m
    public Object visitReceiverParameterDescriptor(InterfaceC31151q0 interfaceC31151q0, Object obj) {
        ((StringBuilder) obj).append(((AbstractC34690n) interfaceC31151q0).getName());
        return C23454a0.f92919a;
    }

    @Override // r93.InterfaceC31141m
    public Object visitTypeAliasDescriptor(InterfaceC31163w0 interfaceC31163w0, Object obj) {
        StringBuilder sb4 = (StringBuilder) obj;
        C38148i c38148i = (C38148i) this.f3422w;
        c38148i.getClass();
        c38148i.m122221y(sb4, interfaceC31163w0, null);
        AbstractC34676g abstractC34676g = (AbstractC34676g) interfaceC31163w0;
        AbstractC31152r visibility = abstractC34676g.getVisibility();
        AbstractC22676k.m65749i(visibility, "getVisibility(...)");
        c38148i.m122204g0(visibility, sb4);
        c38148i.m122176K(abstractC34676g, sb4);
        sb4.append(c38148i.m122174I("typealias"));
        sb4.append(" ");
        c38148i.m122181P(abstractC34676g, sb4, true);
        c38148i.m122196c0(abstractC34676g.mo60497j(), sb4, false);
        c38148i.m122166A(abstractC34676g, sb4);
        sb4.append(" = ");
        sb4.append(c38148i.m122188X(((C21561u) abstractC34676g).m60591L0()));
        return C23454a0.f92919a;
    }

    @Override // r93.InterfaceC31141m
    public Object visitTypeParameterDescriptor(InterfaceC31165x0 interfaceC31165x0, Object obj) {
        ((C38148i) this.f3422w).m122192a0(interfaceC31165x0, (StringBuilder) obj, true);
        return C23454a0.f92919a;
    }

    @Override // r93.InterfaceC31141m
    public Object visitValueParameterDescriptor(InterfaceC31107a1 interfaceC31107a1, Object obj) {
        ((C38148i) this.f3422w).m122200e0(interfaceC31107a1, true, (StringBuilder) obj, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public void m2359w(float f13, long j7, float f14) {
        InterfaceC17915v interfaceC17915vM716w = ((C0237p) this.f3422w).m716w();
        int i13 = (int) (j7 >> 32);
        int i14 = (int) (j7 & 4294967295L);
        interfaceC17915vM716w.mo51416f(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14));
        interfaceC17915vM716w.mo51411a(f13, f14);
        interfaceC17915vM716w.mo51416f(-Float.intBitsToFloat(i13), -Float.intBitsToFloat(i14));
    }

    /* JADX INFO: renamed from: x */
    public void m2360x(C37199o c37199o, InterfaceC20602v0 interfaceC20602v0, Object obj) throws IOException {
        C20613c c20613c = (C20613c) c37199o.f159040w;
        if (obj == null) {
            c20613c.m56754k();
            return;
        }
        if (obj instanceof Character) {
            c37199o.m119222b0(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            c37199o.m119222b0((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            c37199o.m119223c0(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            c37199o.m119221a0((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                c37199o.m119222b0(AbstractC21598x.m60667W((Date) obj));
                return;
            } catch (Exception e5) {
                interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error when serializing Date", e5);
                c20613c.m56754k();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                c37199o.m119222b0(((TimeZone) obj).getID());
                return;
            } catch (Exception e13) {
                interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error when serializing TimeZone", e13);
                c20613c.m56754k();
                return;
            }
        }
        if (obj instanceof InterfaceC20348h2) {
            ((InterfaceC20348h2) obj).serialize(c37199o, interfaceC20602v0);
            return;
        }
        if (obj instanceof Collection) {
            m2361y(c37199o, interfaceC20602v0, (Collection) obj);
            return;
        }
        int i13 = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i13 < length) {
                arrayList.add(Boolean.valueOf(zArr[i13]));
                i13++;
            }
            m2361y(c37199o, interfaceC20602v0, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i13 < length2) {
                arrayList2.add(Byte.valueOf(bArr[i13]));
                i13++;
            }
            m2361y(c37199o, interfaceC20602v0, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i13 < length3) {
                arrayList3.add(Short.valueOf(sArr[i13]));
                i13++;
            }
            m2361y(c37199o, interfaceC20602v0, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i13 < length4) {
                arrayList4.add(Character.valueOf(cArr[i13]));
                i13++;
            }
            m2361y(c37199o, interfaceC20602v0, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i13 < length5) {
                arrayList5.add(Integer.valueOf(iArr[i13]));
                i13++;
            }
            m2361y(c37199o, interfaceC20602v0, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i13 < length6) {
                arrayList6.add(Long.valueOf(jArr[i13]));
                i13++;
            }
            m2361y(c37199o, interfaceC20602v0, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i13 < length7) {
                arrayList7.add(Float.valueOf(fArr[i13]));
                i13++;
            }
            m2361y(c37199o, interfaceC20602v0, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i13 < length8) {
                arrayList8.add(Double.valueOf(dArr[i13]));
                i13++;
            }
            m2361y(c37199o, interfaceC20602v0, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            m2361y(c37199o, interfaceC20602v0, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            m2362z(c37199o, interfaceC20602v0, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            c37199o.m119222b0(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = AbstractC20582d.f77083a;
            int length9 = atomicIntegerArray.length();
            ArrayList arrayList9 = new ArrayList(length9);
            while (i13 < length9) {
                arrayList9.add(Integer.valueOf(atomicIntegerArray.get(i13)));
                i13++;
            }
            m2361y(c37199o, interfaceC20602v0, arrayList9);
            return;
        }
        if (obj instanceof AtomicBoolean) {
            c37199o.m119223c0(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            c37199o.m119222b0(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            c37199o.m119222b0(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            c37199o.m119222b0(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            c37199o.m119222b0(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            m2362z(c37199o, interfaceC20602v0, AbstractC20582d.m56713a((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            c37199o.m119222b0(obj.toString());
            return;
        }
        try {
            m2360x(c37199o, interfaceC20602v0, ((C3143v) this.f3422w).m9044m(interfaceC20602v0, obj));
        } catch (Exception e14) {
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Failed serializing unknown object.", e14);
            c37199o.m119222b0("[OBJECT]");
        }
    }

    /* JADX INFO: renamed from: y */
    public void m2361y(C37199o c37199o, InterfaceC20602v0 interfaceC20602v0, Collection collection) throws IOException {
        C20613c c20613c = (C20613c) c37199o.f159040w;
        c20613c.m56757x();
        c20613c.m56751b();
        int i13 = c20613c.f77150y;
        int[] iArr = c20613c.f77149x;
        if (i13 == iArr.length) {
            c20613c.f77149x = Arrays.copyOf(iArr, i13 * 2);
        }
        int[] iArr2 = c20613c.f77149x;
        int i14 = c20613c.f77150y;
        c20613c.f77150y = i14 + 1;
        iArr2[i14] = 1;
        c20613c.f77148w.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m2360x(c37199o, interfaceC20602v0, it.next());
        }
        c20613c.m56752h(1, 2, ']');
    }

    /* JADX INFO: renamed from: z */
    public void m2362z(C37199o c37199o, InterfaceC20602v0 interfaceC20602v0, Map map) throws IOException {
        c37199o.m119227i();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                c37199o.m119207K((String) obj);
                m2360x(c37199o, interfaceC20602v0, map.get(obj));
            }
        }
        c37199o.m119200C();
    }

    public C0929d(int i13, boolean z4) {
        switch (i13) {
            case 2:
                this.f3422w = new ArrayDeque();
                break;
            case 11:
                this.f3422w = ByteBuffer.allocate(8);
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                this.f3422w = new C30849c(new C28532k[16]);
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                this.f3422w = new C21565a(17);
                break;
            default:
                this.f3422w = new AtomicInteger(0);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[PHI: r9
      0x0024: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:10:0x001d, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    public C0929d(int[] iArr, float[] fArr, float[][] fArr2) {
        int i13;
        int length = fArr.length - 1;
        C11401t[][] c11401tArr = new C11401t[length][];
        int i14 = 1;
        int i15 = 1;
        int i16 = 0;
        while (i16 < length) {
            int i17 = iArr[i16];
            int i18 = 3;
            if (i17 == 0) {
                i13 = i18;
            } else if (i17 == 1) {
                i14 = 1;
                i13 = i14;
            } else {
                if (i17 != 2) {
                    if (i17 != 3) {
                        i18 = 4;
                        if (i17 != 4) {
                            i18 = 5;
                            if (i17 != 5) {
                                i13 = i15;
                            } else {
                                i13 = i18;
                            }
                        } else {
                            i13 = i18;
                        }
                    } else {
                        if (i14 != 1) {
                            i14 = 1;
                        }
                        i13 = i14;
                    }
                }
                i14 = 2;
                i13 = i14;
            }
            float[] fArr3 = fArr2[i16];
            int i19 = i16 + 1;
            float[] fArr4 = fArr2[i19];
            float f13 = fArr[i16];
            float f14 = fArr[i19];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            C11401t[] c11401tArr2 = new C11401t[length2];
            int i24 = 0;
            while (i24 < length2) {
                int i25 = i24 * 2;
                C11401t[] c11401tArr3 = c11401tArr2;
                int i26 = i24;
                int i27 = i25 + 1;
                c11401tArr3[i26] = new C11401t(i13, f13, f14, fArr3[i25], fArr3[i27], fArr4[i25], fArr4[i27]);
                i24 = i26 + 1;
                c11401tArr2 = c11401tArr3;
            }
            c11401tArr[i16] = c11401tArr2;
            i16 = i19;
            i15 = i13;
        }
        this.f3422w = c11401tArr;
    }

    public C0929d(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            C16925y c16925y = new C16925y(view, 11);
            c16925y.f64892y = view;
            this.f3422w = c16925y;
            return;
        }
        this.f3422w = new C0928c(view, 11);
    }

    public C0929d(WindowInsetsController windowInsetsController) {
        C16925y c16925y = new C16925y(null, 11);
        c16925y.f64893z = windowInsetsController;
        this.f3422w = c16925y;
    }
}
