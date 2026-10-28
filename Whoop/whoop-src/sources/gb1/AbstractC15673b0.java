package gb1;

import ai1.C0910b;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import e61.C12769l;
import g40.C15449y1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p005a3.C0238p0;
import p026b2.C2314t;
import p181h2.C16620e;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17916v0;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import ug.AbstractC34924m;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: gb1.b0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bO\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0002\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0002\u001a\u001f\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0002\u001a\u0013\u0010\u0014\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0002\u001a\u0011\u0010\u0017\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0002\u001a\u0011\u0010\u0018\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0002\u001a\u0011\u0010\u0019\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u0002\u001a\u0011\u0010\u001a\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u0002\u001a\u0011\u0010\u001b\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u0002\u001a\u0011\u0010\u001c\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u0002\u001a\u0011\u0010\u001d\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u0002\u001a3\u0010!\u001a\u00020\u0000*\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b#\u0010\u0015\u001a\u0013\u0010$\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b$\u0010\u0015\u001a\u0013\u0010%\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b%\u0010\u0015\u001a5\u0010*\u001a\u00020\u0000*\u00020\u00002\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\b\b\u0002\u0010(\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010,\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b,\u0010\u0015\u001a\u0013\u0010-\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b-\u0010\u0015\u001a\u0013\u0010.\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b.\u0010\u0015\u001a\u0013\u0010/\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b/\u0010\u0015\u001a\u0013\u00100\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b0\u0010\u0015\u001a\u0013\u00101\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b1\u0010\u0015\u001a\u0019\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105\u001a-\u00106\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e¢\u0006\u0004\b6\u00107\u001a\u001b\u0010:\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;\u001a\u0019\u0010=\u001a\u00020\u0000*\u00020\u00002\u0006\u0010<\u001a\u00020\u001e¢\u0006\u0004\b=\u0010>\u001a3\u0010B\u001a\u00020\u0000*\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020\u001e¢\u0006\u0004\bB\u0010\"\u001a\u0019\u0010D\u001a\u00020\u0000*\u00020\u00002\u0006\u0010C\u001a\u00020\u0005¢\u0006\u0004\bD\u0010E\u001a\u0011\u0010G\u001a\u00020\u0005*\u00020F¢\u0006\u0004\bG\u0010H\u001a\r\u0010I\u001a\u00020\u0005¢\u0006\u0004\bI\u0010\u0007\u001a\r\u0010J\u001a\u00020\u0005¢\u0006\u0004\bJ\u0010\u0007\u001a\r\u0010K\u001a\u00020\u0005¢\u0006\u0004\bK\u0010\u0007\u001a\r\u0010L\u001a\u00020\u0005¢\u0006\u0004\bL\u0010\u0007\u001a\r\u0010M\u001a\u00020\u0005¢\u0006\u0004\bM\u0010\u0007\u001a\r\u0010N\u001a\u00020\u0005¢\u0006\u0004\bN\u0010\u0007\u001a\r\u0010O\u001a\u00020\u0005¢\u0006\u0004\bO\u0010\u0007\u001a\r\u0010P\u001a\u00020\u0005¢\u0006\u0004\bP\u0010\u0007\u001a\r\u0010Q\u001a\u00020\u0005¢\u0006\u0004\bQ\u0010\u0007\u001a\r\u0010R\u001a\u00020\u0005¢\u0006\u0004\bR\u0010\u0007\u001a\r\u0010S\u001a\u00020\u0005¢\u0006\u0004\bS\u0010\u0007\u001a\r\u0010T\u001a\u00020\u0005¢\u0006\u0004\bT\u0010\u0007\u001a\r\u0010U\u001a\u00020\u0005¢\u0006\u0004\bU\u0010\u0007\u001a\r\u0010V\u001a\u00020\u0005¢\u0006\u0004\bV\u0010\u0007\u001a\r\u0010W\u001a\u00020\u0005¢\u0006\u0004\bW\u0010\u0007\u001a\r\u0010X\u001a\u00020\u0005¢\u0006\u0004\bX\u0010\u0007\u001a\r\u0010Y\u001a\u00020\u0005¢\u0006\u0004\bY\u0010\u0007\u001a\r\u0010Z\u001a\u00020\u0005¢\u0006\u0004\bZ\u0010\u0007\u001a\r\u0010[\u001a\u00020\u0005¢\u0006\u0004\b[\u0010\u0007\u001a\r\u0010\\\u001a\u00020\u0005¢\u0006\u0004\b\\\u0010\u0007\u001a\u0011\u0010]\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b]\u0010\u0002\u001a\r\u0010^\u001a\u00020\u0005¢\u0006\u0004\b^\u0010\u0007\u001a\r\u0010_\u001a\u00020\u0005¢\u0006\u0004\b_\u0010\u0007\u001a\r\u0010`\u001a\u00020\u0005¢\u0006\u0004\b`\u0010\u0007\u001a\r\u0010a\u001a\u00020\u0005¢\u0006\u0004\ba\u0010\u0007\u001a\r\u0010b\u001a\u00020\u0005¢\u0006\u0004\bb\u0010\u0007\u001a\u0013\u0010c\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\bc\u0010\u0015\u001a\r\u0010d\u001a\u00020\u0005¢\u0006\u0004\bd\u0010\u0007\u001a\r\u0010e\u001a\u00020\u0005¢\u0006\u0004\be\u0010\u0007\u001a\r\u0010f\u001a\u00020\u0005¢\u0006\u0004\bf\u0010\u0007\u001a\r\u0010g\u001a\u00020\u0005¢\u0006\u0004\bg\u0010\u0007\u001a\r\u0010h\u001a\u00020\u0005¢\u0006\u0004\bh\u0010\u0007\u001a\r\u0010i\u001a\u00020\u0005¢\u0006\u0004\bi\u0010\u0007\u001a\r\u0010j\u001a\u00020\u0005¢\u0006\u0004\bj\u0010\u0007\u001a\r\u0010k\u001a\u00020\u0005¢\u0006\u0004\bk\u0010\u0007\" \u0010p\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\" \u0010s\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bq\u0010m\u001a\u0004\br\u0010o\"\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010m\"\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010m\" \u0010z\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010m\u001a\u0004\by\u0010o\" \u0010}\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b{\u0010m\u001a\u0004\b|\u0010o\"\u001a\u0010\u0082\u0001\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u001b\u0010\u0085\u0001\u001a\u00020\f8\u0006¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010\u007f\u001a\u0006\b\u0084\u0001\u0010\u0081\u0001\"#\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010m\u001a\u0005\b\u0087\u0001\u0010o\"\u001c\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010m\"\u001c\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010m\"\u001b\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010m\"\u001b\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010m\"\u001c\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010m\"\u001c\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010m\"\u001c\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010m\"\u001b\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010m\"\u001b\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010m\"\u001b\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010m¨\u0006\u0095\u0001"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "S", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "d0", "T", "Li2/t;", "U", "()Li2/t;", "c0", "b0", "g0", "", "Li2/x;", "colors", "Y0", "(Landroidx/compose/ui/Modifier;Ljava/util/List;)Landroidx/compose/ui/Modifier;", "color", "u", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "o0", "t0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "x0", "Y", "v0", "u0", "w0", "j0", "e0", "V", "", "opacity", "radiusScale", "Q0", "(Landroidx/compose/ui/Modifier;Ljava/util/List;FF)Landroidx/compose/ui/Modifier;", "W", "z0", "s0", "phaseColor", "backgroundColor", "alpha", "endY", "q0", "(Landroidx/compose/ui/Modifier;JJFF)Landroidx/compose/ui/Modifier;", "m0", "f0", "p0", "l0", "k0", "n0", "Ly81/f;", "colorKey", "G", "(Landroidx/compose/ui/Modifier;Ly81/f;)Landroidx/compose/ui/Modifier;", "H", "(Landroidx/compose/ui/Modifier;JFF)Landroidx/compose/ui/Modifier;", "Li2/a1;", "shape", "W0", "(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;", "width", "a1", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "Ly3/f;", "cornerRadius", "radiusFactor", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "brush", "s", "(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;", "Ly81/i;", "l", "(Ly81/i;)Li2/t;", "U0", "V0", "P0", "h0", "F0", "z", "H0", "G0", "E0", "O0", "N0", "I0", "J0", "Q", "O", "K", "N", "A", "C", "D", "E", "B", "P", "D0", "C0", "A0", "a0", "B0", "T0", "M0", "R", "K0", "L0", "M", "L", "a", "Ljava/util/List;", "q", "()Ljava/util/List;", "onboardingGradient", "b", "getAccessHomeTileGradient", "accessHomeTileGradient", "c", "informationalGradient", "d", "whoopProGradient", "e", "r", "promoGradient", "f", "m", "aiChatGradient", "g", "J", "o", "()J", "aiCoachConfettiColor", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "p", "onboardingConfettiColor", "i", "n", "aiChatGradientLowOpacity", "j", "aiChatScreenBackgroundColors", "k", "notableStatsGradient", "simpleWhoopProGradient", "healthspanVowGradient", "goldGradient", "cardGradient", "borderGradient", "referralsGradient", "cyberGradient", "cyberBadgesGradient", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15673b0 {

    /* JADX INFO: renamed from: a */
    private static final List<C17919x> f58831a;

    /* JADX INFO: renamed from: b */
    private static final List<C17919x> f58832b;

    /* JADX INFO: renamed from: c */
    private static final List<C17919x> f58833c;

    /* JADX INFO: renamed from: d */
    private static final List<C17919x> f58834d;

    /* JADX INFO: renamed from: e */
    private static final List<C17919x> f58835e;

    /* JADX INFO: renamed from: f */
    private static final List<C17919x> f58836f;

    /* JADX INFO: renamed from: g */
    private static final long f58837g;

    /* JADX INFO: renamed from: h */
    private static final long f58838h;

    /* JADX INFO: renamed from: i */
    private static final List<C17919x> f58839i;

    /* JADX INFO: renamed from: j */
    private static final List<C17919x> f58840j;

    /* JADX INFO: renamed from: k */
    private static final List<C17919x> f58841k;

    /* JADX INFO: renamed from: l */
    private static final List<C17919x> f58842l;

    /* JADX INFO: renamed from: m */
    private static final List<C17919x> f58843m;

    /* JADX INFO: renamed from: n */
    private static final List<C17919x> f58844n;

    /* JADX INFO: renamed from: o */
    private static final List<C17919x> f58845o;

    /* JADX INFO: renamed from: p */
    private static final List<C17919x> f58846p;

    /* JADX INFO: renamed from: q */
    private static final List<C17919x> f58847q;

    /* JADX INFO: renamed from: r */
    private static final List<C17919x> f58848r;

    /* JADX INFO: renamed from: s */
    private static final List<C17919x> f58849s;

    static {
        List<C17919x> listM118959K = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4294942342L)), new C17919x(AbstractC17918w0.m51517e(4289799935L)));
        f58831a = listM118959K;
        f58832b = AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.15f, AbstractC17918w0.m51517e(4294942342L))), new C17919x(C17919x.m51541c(0.15f, AbstractC17918w0.m51517e(4291514072L))));
        f58833c = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4290363305L)), new C17919x(AbstractC17918w0.m51517e(4291224543L)), new C17919x(AbstractC17918w0.m51517e(4292462262L)), new C17919x(AbstractC17918w0.m51517e(4289964224L)));
        f58834d = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4290288239L)), new C17919x(AbstractC17918w0.m51517e(4294304200L)), new C17919x(AbstractC17918w0.m51517e(4292128115L)), new C17919x(AbstractC17918w0.m51517e(4294038968L)));
        f58835e = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4290363305L)), new C17919x(AbstractC17918w0.m51517e(4291224543L)), new C17919x(AbstractC17918w0.m51517e(4292462262L)), new C17919x(AbstractC17918w0.m51517e(4289964224L)));
        List<C17919x> listM118959K2 = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4287324927L)), new C17919x(AbstractC17918w0.m51517e(4283487743L)));
        f58836f = listM118959K2;
        f58837g = ((C17919x) AbstractC25265s.m74096F0(listM118959K2)).f69639a;
        f58838h = ((C17919x) AbstractC25265s.m74112P0(listM118959K)).f69639a;
        f58839i = AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.15f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.m51541c(0.15f, AbstractC17918w0.m51517e(4283487743L))));
        f58840j = AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, AbstractC17918w0.m51517e(4286544383L))), new C17919x(C17919x.m51541c(0.15f, AbstractC17918w0.m51517e(4284072958L))), new C17919x(C17919x.m51541c(0.0f, AbstractC17918w0.m51517e(4286544383L))));
        f58841k = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4291597605L)), new C17919x(AbstractC17918w0.m51517e(4294957948L)), new C17919x(AbstractC17918w0.m51517e(4294896314L)), new C17919x(AbstractC17918w0.m51517e(4294957948L)), new C17919x(AbstractC17918w0.m51517e(4291597087L)));
        f58842l = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4279244056L)), new C17919x(AbstractC17918w0.m51517e(2295375694L)));
        f58843m = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(452984831)), new C17919x(AbstractC17918w0.m51515c(16777215)));
        f58844n = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4294504915L)), new C17919x(AbstractC17918w0.m51517e(4291606123L)));
        f58845o = AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.15f, AbstractC17918w0.m51517e(4289577677L))), new C17919x(C17919x.m51541c(0.0f, AbstractC17918w0.m51517e(4279244056L))));
        long j7 = C17919x.f69629f;
        f58846p = AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.12f, j7)), new C17919x(C17919x.m51541c(0.0f, j7)));
        f58847q = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4290621630L)), new C17919x(AbstractC17918w0.m51517e(4291157977L)), new C17919x(AbstractC17918w0.m51517e(4290429613L)));
        f58848r = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4292594804L)), new C17919x(AbstractC17918w0.m51517e(4287655729L)));
        f58849s = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4291160570L)), new C17919x(AbstractC17918w0.m51517e(4287613160L)));
    }

    /* JADX INFO: renamed from: A */
    public static final AbstractC17911t m43972A() {
        return AbstractC15693u.m44155b(AbstractC17911t.f69612b, f58836f, null, 0, 315.0f, false, 22, null);
    }

    /* JADX INFO: renamed from: A0 */
    public static final AbstractC17911t m43973A0() {
        return C17909s.m51486d(AbstractC17911t.f69612b, f58845o, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(400.0f)) & 4294967295L) | (Float.floatToRawIntBits(400.0f) << 32), 8);
    }

    /* JADX INFO: renamed from: B */
    public static final AbstractC17911t m43974B() {
        C17909s c17909s = AbstractC17911t.f69612b;
        List<C17919x> list = f58836f;
        return C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.15f, ((C17919x) AbstractC25265s.m74096F0(list)).f69639a)), new C17919x(C17919x.m51541c(0.0f, ((C17919x) AbstractC25265s.m74112P0(list)).f69639a))), 0L, 0L, 14);
    }

    /* JADX INFO: renamed from: B0 */
    public static final AbstractC17911t m43975B0() {
        return C17909s.m51493k(AbstractC17911t.f69612b, f58846p, 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: C */
    public static final AbstractC17911t m43976C() {
        return C17909s.m51483a(AbstractC17911t.f69612b, f58836f, 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: C0 */
    public static final AbstractC17911t m43977C0() {
        return AbstractC15693u.m44155b(AbstractC17911t.f69612b, f58844n, null, 0, 136.0f, false, 22, null);
    }

    /* JADX INFO: renamed from: D */
    public static final AbstractC17911t m43978D() {
        return C17909s.m51486d(AbstractC17911t.f69612b, f58839i, 0L, 0L, 14);
    }

    /* JADX INFO: renamed from: D0 */
    public static final AbstractC17911t m43979D0() {
        return C17909s.m51493k(AbstractC17911t.f69612b, f58843m, 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: E */
    public static final Modifier m43980E(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return AbstractC1125a.m3478a(m44028b0(modifier), new C15449y1(18));
    }

    /* JADX INFO: renamed from: E0 */
    public static final AbstractC17911t m43981E0() {
        return C17909s.m51483a(AbstractC17911t.f69612b, f58833c, 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m43982F(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51489g(AbstractC17911t.f69612b, f58840j, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 1.2f * Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)), 8), 0L, 0L, 0.0f, null, 0, 126);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F0 */
    public static final AbstractC17911t m43983F0() {
        return C17909s.m51483a(AbstractC17911t.f69612b, f58831a, 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: G */
    public static final Modifier m43984G(Modifier modifier, EnumC39333f colorKey) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(colorKey, "colorKey");
        return m43988I(modifier, colorKey.getColor(), 0.0f, 0.0f, 6, null);
    }

    /* JADX INFO: renamed from: G0 */
    public static final AbstractC17911t m43985G0() {
        return C17909s.m51486d(AbstractC17911t.f69612b, f58831a, 0L, 0L, 14);
    }

    /* JADX INFO: renamed from: H */
    public static final Modifier m43986H(Modifier whoopCenteredRadialGradientBackground, long j7, float f13, float f14) {
        AbstractC22676k.m65750j(whoopCenteredRadialGradientBackground, "$this$whoopCenteredRadialGradientBackground");
        return whoopCenteredRadialGradientBackground.mo3471e(AbstractC1125a.m3478a(C2314t.f9131w, new C12769l(j7, f14, f13, 3)));
    }

    /* JADX INFO: renamed from: H0 */
    public static final AbstractC17911t m43987H0() {
        return C17909s.m51493k(AbstractC17911t.f69612b, f58831a, 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ Modifier m43988I(Modifier modifier, long j7, float f13, float f14, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = 0.6f;
        }
        if ((i13 & 4) != 0) {
            f14 = 1.0f;
        }
        return m43986H(modifier, j7, f13, f14);
    }

    /* JADX INFO: renamed from: I0 */
    public static final AbstractC17911t m43989I0() {
        return AbstractC15693u.m44155b(AbstractC17911t.f69612b, f58835e, null, 0, 300.0f, false, 22, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m43990J(long j7, float f13, float f14, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) * f13, 8), 0L, 0L, f14, null, 0, 118);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J0 */
    public static final AbstractC17911t m43991J0() {
        C17909s c17909s = AbstractC17911t.f69612b;
        List<C17919x> list = f58835e;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C17919x(C17919x.m51541c(0.15f, ((C17919x) it.next()).f69639a)));
        }
        return AbstractC15693u.m44155b(c17909s, arrayList, null, 0, 300.0f, false, 22, null);
    }

    /* JADX INFO: renamed from: K */
    public static final AbstractC17911t m43992K() {
        return AbstractC15693u.m44155b(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4294942342L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4289799935L)))), null, 0, 335.0f, false, 22, null);
    }

    /* JADX INFO: renamed from: K0 */
    public static final AbstractC17911t m43993K0() {
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(443002598)), new C17919x(AbstractC17918w0.m51515c(6794982))), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: L */
    public static final AbstractC17911t m43994L() {
        return C17909s.m51493k(AbstractC17911t.f69612b, f58849s, 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: L0 */
    public static final AbstractC17911t m43995L0() {
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(224898790)), new C17919x(AbstractC17918w0.m51515c(6794982))), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: M */
    public static final AbstractC17911t m43996M() {
        return C17909s.m51486d(AbstractC17911t.f69612b, f58848r, 0L, 0L, 14);
    }

    /* JADX INFO: renamed from: M0 */
    public static final AbstractC17911t m43997M0() {
        return C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.4f, AbstractC17918w0.m51517e(4290429613L))), new C17919x(C17919x.m51541c(0.2f, AbstractC17918w0.m51517e(4291157977L))), new C17919x(C17919x.m51541c(0.0f, AbstractC17918w0.m51517e(4290621630L)))), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 1500.0f, 8);
    }

    /* JADX INFO: renamed from: N */
    public static final AbstractC17911t m43998N() {
        return AbstractC15693u.m44155b(AbstractC17911t.f69612b, f58833c, null, 0, 300.0f, false, 22, null);
    }

    /* JADX INFO: renamed from: N0 */
    public static final AbstractC17911t m43999N0() {
        return AbstractC15693u.m44155b(AbstractC17911t.f69612b, f58842l, null, 0, -300.0f, false, 22, null);
    }

    /* JADX INFO: renamed from: O */
    public static final AbstractC17911t m44000O() {
        return AbstractC15693u.m44155b(AbstractC17911t.f69612b, f58831a, null, 0, 300.0f, false, 22, null);
    }

    /* JADX INFO: renamed from: O0 */
    public static final AbstractC17911t m44001O0() {
        return C17909s.m51486d(AbstractC17911t.f69612b, f58834d, 0L, 0L, 14);
    }

    /* JADX INFO: renamed from: P */
    public static final AbstractC17911t m44002P() {
        C17909s c17909s = AbstractC17911t.f69612b;
        List<C17919x> list = f58836f;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C17919x(C17919x.m51541c(0.15f, ((C17919x) it.next()).f69639a)));
        }
        return AbstractC15693u.m44155b(c17909s, arrayList, null, 0, 315.0f, false, 22, null);
    }

    /* JADX INFO: renamed from: P0 */
    public static final AbstractC17911t m44003P0() {
        return C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(12431550)), new C17919x(AbstractC17918w0.m51517e(2160451545L)), new C17919x(AbstractC17918w0.m51517e(4290429613L))), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: Q */
    public static final AbstractC17911t m44004Q() {
        return AbstractC15693u.m44155b(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4278251935L)), new C17919x(AbstractC17918w0.m51515c(6794982))), null, 0, 300.0f, false, 22, null);
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Modifier m44005Q0(Modifier modifier, List<C17919x> colors, float f13, float f14) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(colors, "colors");
        return modifier.mo3471e(AbstractC1125a.m3478a(C2314t.f9131w, new C15698z(colors, f14, f13)));
    }

    /* JADX INFO: renamed from: R */
    public static final AbstractC17911t m44006R() {
        return C17909s.m51491i(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4278227943L)), new C17919x(AbstractC17918w0.m51517e(4284985062L)), new C17919x(AbstractC17918w0.m51517e(4288074239L))));
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ Modifier m44007R0(Modifier modifier, List list, float f13, float f14, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = 0.6f;
        }
        if ((i13 & 4) != 0) {
            f14 = 1.0f;
        }
        return m44005Q0(modifier, list, f13, f14);
    }

    /* JADX INFO: renamed from: S */
    public static final Modifier m44008S(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return modifier.mo3471e(AbstractC1092a.m3357b(C2314t.f9131w, C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4282141524L)), new C17919x(AbstractC17918w0.m51517e(2149196327L)), new C17919x(AbstractC17918w0.m51517e(4279902759L))), 0.0f, 0.0f, 14), null, 0.0f, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C23454a0 m44009S0(List list, float f13, float f14, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32));
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(AbstractC17918w0.m51506H(((C17919x) it.next()).f69639a)));
        }
        int[] iArrM74091C1 = AbstractC25265s.m74091C1(arrayList);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        InterfaceC22131e.m63385u(drawBehind, AbstractC34924m.m110145f(new ComposeShader(new LinearGradient(0.0f, 0.0f, fIntBitsToFloat, 0.0f, iArrM74091C1, (float[]) null, tileMode), new RadialGradient(Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) / 2.0f, 0.0f, Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) * f13, new int[]{-1, 16777215}, (float[]) null, tileMode), PorterDuff.Mode.DST_IN)), 0L, 0L, f14, null, 0, 118);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    public static final Modifier m44010T(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return modifier.mo3471e(AbstractC1092a.m3357b(C2314t.f9131w, m44012U(), null, 0.0f, 6));
    }

    /* JADX INFO: renamed from: T0 */
    public static final AbstractC17911t m44011T0() {
        return C17909s.m51486d(AbstractC17911t.f69612b, f58841k, 0L, 0L, 14);
    }

    /* JADX INFO: renamed from: U */
    public static final AbstractC17911t m44012U() {
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4281418058L)), new C17919x(AbstractC17918w0.m51517e(4279968552L)), new C17919x(AbstractC17918w0.m51517e(4279902759L))), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32), 8);
    }

    /* JADX INFO: renamed from: U0 */
    public static final AbstractC17911t m44013U0() {
        C17909s c17909s = AbstractC17911t.f69612b;
        long j7 = C17919x.f69629f;
        return C17909s.m51483a(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.0f, j7)), new C17919x(C17919x.m51541c(0.1f, j7)), new C17919x(C17919x.m51541c(0.3f, j7))), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: V */
    public static final Modifier m44014V(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return m44007R0(modifier, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4287324927L)), new C17919x(AbstractC17918w0.m51517e(4283487743L))), 0.0f, 0.0f, 6, null);
    }

    /* JADX INFO: renamed from: V0 */
    public static final AbstractC17911t m44015V0() {
        return C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(AbstractC17918w0.m51515c(1296538306)), new C17919x(AbstractC17918w0.m51517e(4289577677L))), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: W */
    public static final Modifier m44016W(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        C38072d c38072d = C38072d.f163053a;
        final long jM125410o = c38072d.m121949b(composer, 6).getBackgroundDarkStd();
        final long jM125365U = c38072d.m121949b(composer, 6).getPatrioticBlue();
        final long jM125430y = c38072d.m121949b(composer, 6).getBrandWhite();
        final long jM125367V = c38072d.m121949b(composer, 6).getPatrioticRed();
        C17916v0 c17916v0 = AbstractC17918w0.f69621a;
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3358c = AbstractC1092a.m3358c(c2314t, jM125410o, c17916v0);
        C28655q c28655q = (C28655q) composer;
        boolean zM87151f = c28655q.m87151f(jM125365U) | c28655q.m87151f(jM125367V) | c28655q.m87151f(jM125430y) | c28655q.m87151f(jM125410o);
        Object objM87133R = c28655q.m87133R();
        if (zM87151f || objM87133R == C28635l.f115821a) {
            objM87133R = new Function1() { // from class: gb1.a0
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC15673b0.m44018X(jM125365U, jM125367V, jM125430y, jM125410o, (InterfaceC22131e) obj);
                }
            };
            c28655q.m87172p0(objM87133R);
        }
        return modifier.mo3471e(modifierM3358c).mo3471e(AbstractC1125a.m3478a(c2314t, (Function1) objM87133R));
    }

    /* JADX INFO: renamed from: W0 */
    public static final Modifier m44017W0(Modifier modifier, InterfaceC17869a1 shape) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(shape, "shape");
        return modifier.mo3471e(AbstractC1092a.m3357b(C2314t.f9131w, C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4280824633L)), new C17919x(AbstractC17918w0.m51517e(4279507229L)), new C17919x(AbstractC17918w0.m51517e(4279244056L))), 0L, 0L, 14), shape, 0.0f, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m44018X(long j7, long j13, long j14, long j15, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L));
        C17909s c17909s = AbstractC17911t.f69612b;
        C17919x c17919x = new C17919x(C17919x.m51541c(0.55f, j7));
        long j16 = C17919x.f69636m;
        float f13 = 1.1f * fIntBitsToFloat;
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51489g(c17909s, AbstractC37056f.m118959K(c17919x, new C17919x(j16)), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), f13, 8), 0L, 0L, 0.0f, null, 0, 126);
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51489g(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.55f, j13)), new C17919x(j16)), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), f13, 8), 0L, 0L, 0.0f, null, 0, 126);
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51489g(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.22f, j14)), new C17919x(j16)), (((long) Float.floatToRawIntBits(fIntBitsToFloat / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0.55f * fIntBitsToFloat, 8), 0L, 0L, 0.0f, null, 0, 126);
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51494l(c17909s, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(j16)), new C23465k(Float.valueOf(0.12f), new C17919x(C17919x.m51541c(0.25f, j15))), new C23465k(Float.valueOf(0.22f), new C17919x(C17919x.m51541c(0.75f, j15))), new C23465k(Float.valueOf(0.35f), new C17919x(j15)), new C23465k(Float.valueOf(1.0f), new C17919x(j15))}, 0.0f, fIntBitsToFloat2, 8), 0L, 0L, 0.0f, null, 0, 126);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ Modifier m44019X0(Modifier modifier, InterfaceC17869a1 interfaceC17869a1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC17869a1 = AbstractC17918w0.f69621a;
        }
        return m44017W0(modifier, interfaceC17869a1);
    }

    /* JADX INFO: renamed from: Y */
    public static final Modifier m44020Y(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return modifier.mo3471e(AbstractC1125a.m3478a(C2314t.f9131w, new C15449y1(20)));
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Modifier m44021Y0(Modifier modifier, List<C17919x> colors) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(colors, "colors");
        return modifier.mo3471e(AbstractC1125a.m3478a(C2314t.f9131w, new C15685m(colors, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m44022Z(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4288210175L)), new C17919x(AbstractC17918w0.m51515c(1053976))), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) * 0.8f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)), 8), 0L, 0L, 0.3f, null, 0, 118);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C23454a0 m44023Z0(List list, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51489g(AbstractC17911t.f69612b, list, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)), 8), 0L, 0L, 0.4f, null, 0, 118);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Modifier m44025a0(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return m44016W(modifier, composer, i13 & 14);
    }

    /* JADX INFO: renamed from: a1 */
    public static final Modifier m44026a1(Modifier modifier, float f13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return modifier.mo3471e(AbstractC1092a.m3357b(C2314t.f9131w, C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4283394423L)), new C17919x(AbstractC17918w0.m51517e(4279902759L))), (((long) Float.floatToRawIntBits(f13 / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), f13, 8), null, 0.0f, 6));
    }

    /* JADX INFO: renamed from: b0 */
    public static final Modifier m44028b0(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return modifier.mo3471e(AbstractC1092a.m3357b(C2314t.f9131w, C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4280824633L)), new C17919x(AbstractC17918w0.m51517e(4279507229L)), new C17919x(AbstractC17918w0.m51517e(4279244056L))), 0.0f, 0.0f, 14), null, 0.0f, 6));
    }

    /* JADX INFO: renamed from: c0 */
    public static final AbstractC17911t m44030c0() {
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4280824633L)), new C17919x(AbstractC17918w0.m51517e(4279507229L)), new C17919x(AbstractC17918w0.m51517e(4279244056L))), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: d0 */
    public static final Modifier m44032d0(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return modifier.mo3471e(AbstractC1092a.m3357b(C2314t.f9131w, C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(436207616)), new C17919x(AbstractC17918w0.m51517e(2149196327L)), new C17919x(AbstractC17918w0.m51517e(4282141524L))), 0.0f, 0.0f, 14), null, 0.0f, 6));
    }

    /* JADX INFO: renamed from: e0 */
    public static final Modifier m44034e0(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return m43988I(modifier, AbstractC17918w0.m51517e(4285625719L), 0.0f, 0.0f, 6, null);
    }

    /* JADX INFO: renamed from: f0 */
    public static final Modifier m44036f0(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        C38072d c38072d = C38072d.f163053a;
        return m44060r0(modifier, c38072d.m121949b(composer, 6).getSurfaceMciFollicular(), c38072d.m121949b(composer, 6).getBackgroundDarkStd(), 0.0f, 0.0f, 12, null);
    }

    /* JADX INFO: renamed from: g0 */
    public static final Modifier m44038g0(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return modifier.mo3471e(AbstractC1125a.m3478a(C2314t.f9131w, new C15449y1(17)));
    }

    /* JADX INFO: renamed from: h0 */
    public static final AbstractC17911t m44040h0() {
        return C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4278251935L)), new C17919x(AbstractC17918w0.m51515c(6794982))), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m44042i0(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4278251935L)), new C17919x(AbstractC17918w0.m51515c(6794982))), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)), 8), 0L, 0L, 0.4f, null, 0, 118);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Modifier m44044j0(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return m43988I(modifier, AbstractC17918w0.m51517e(4279428834L), 0.0f, 0.0f, 6, null);
    }

    /* JADX INFO: renamed from: k0 */
    public static final Modifier m44046k0(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        C38072d c38072d = C38072d.f163053a;
        return m44060r0(modifier, c38072d.m121949b(composer, 6).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String(), c38072d.m121949b(composer, 6).getBackgroundDarkStd(), 0.0f, 0.0f, 12, null);
    }

    /* JADX INFO: renamed from: l */
    public static final AbstractC17911t m44047l(C39336i c39336i) {
        AbstractC22676k.m65750j(c39336i, "<this>");
        return AbstractC15693u.m44155b(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c39336i.getPatrioticBlue()), new C17919x(c39336i.getBrandWhite()), new C17919x(c39336i.getPatrioticRed())), null, 0, 15.0f, false, 22, null);
    }

    /* JADX INFO: renamed from: l0 */
    public static final Modifier m44048l0(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        C38072d c38072d = C38072d.f163053a;
        return m44060r0(modifier, c38072d.m121949b(composer, 6).getSurfaceMciLuteal(), c38072d.m121949b(composer, 6).getBackgroundDarkStd(), 0.0f, 0.0f, 12, null);
    }

    /* JADX INFO: renamed from: m */
    public static final List<C17919x> m44049m() {
        return f58836f;
    }

    /* JADX INFO: renamed from: m0 */
    public static final Modifier m44050m0(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        C38072d c38072d = C38072d.f163053a;
        return m44060r0(modifier, c38072d.m121949b(composer, 6).getSurfaceMciMenstrual(), c38072d.m121949b(composer, 6).getBackgroundDarkStd(), 0.0f, 0.0f, 12, null);
    }

    /* JADX INFO: renamed from: n */
    public static final List<C17919x> m44051n() {
        return f58839i;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Modifier m44052n0(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        C38072d c38072d = C38072d.f163053a;
        return m44060r0(modifier, c38072d.m121949b(composer, 6).getStrainZone1(), c38072d.m121949b(composer, 6).getBackgroundDarkStd(), 0.0f, 0.0f, 12, null);
    }

    /* JADX INFO: renamed from: o */
    public static final long m44053o() {
        return f58837g;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Modifier m44054o0(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return m44065u(modifier, AbstractC17918w0.m51517e(4294944546L));
    }

    /* JADX INFO: renamed from: p */
    public static final long m44055p() {
        return f58838h;
    }

    /* JADX INFO: renamed from: p0 */
    public static final Modifier m44056p0(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        C38072d c38072d = C38072d.f163053a;
        return m44060r0(modifier, c38072d.m121949b(composer, 6).getSurfaceMciOvulatory(), c38072d.m121949b(composer, 6).getBackgroundDarkStd(), 0.0f, 0.0f, 12, null);
    }

    /* JADX INFO: renamed from: q */
    public static final List<C17919x> m44057q() {
        return f58831a;
    }

    /* JADX INFO: renamed from: q0 */
    public static final Modifier m44058q0(Modifier whoopGradientBackgroundPhaseTint, long j7, long j13, float f13, float f14) {
        AbstractC22676k.m65750j(whoopGradientBackgroundPhaseTint, "$this$whoopGradientBackgroundPhaseTint");
        return AbstractC1092a.m3357b(whoopGradientBackgroundPhaseTint, C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(f13, j7)), new C17919x(j13)), 0.0f, f14, 10), null, 0.0f, 6);
    }

    /* JADX INFO: renamed from: r */
    public static final List<C17919x> m44059r() {
        return f58835e;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ Modifier m44060r0(Modifier modifier, long j7, long j13, float f13, float f14, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            f13 = 0.3f;
        }
        float f15 = f13;
        if ((i13 & 8) != 0) {
            f14 = 500.0f;
        }
        return m44058q0(modifier, j7, j13, f15, f14);
    }

    /* JADX INFO: renamed from: s */
    public static final Modifier m44061s(Modifier modifier, AbstractC17911t brush) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(brush, "brush");
        return AbstractC1125a.m3480c(AbstractC1127a.m3488c(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751), new C15685m(brush, 1));
    }

    /* JADX INFO: renamed from: s0 */
    public static final Modifier m44062s0(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return m44064t0(AbstractC1092a.m3358c(modifier, C38072d.f163053a.m121949b(composer, 6).getBackgroundDarkStd(), AbstractC17918w0.f69621a), composer, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m44063t(AbstractC17911t abstractC17911t, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, abstractC17911t, 0L, 0L, 0.0f, null, 5, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t0 */
    public static final Modifier m44064t0(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return m44065u(modifier, C38072d.f163053a.m121949b(composer, 6).getRecovery());
    }

    /* JADX INFO: renamed from: u */
    private static final Modifier m44065u(Modifier modifier, long j7) {
        return modifier.mo3471e(AbstractC1125a.m3478a(C2314t.f9131w, new C0910b(j7, 15)));
    }

    /* JADX INFO: renamed from: u0 */
    public static final Modifier m44066u0(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return m43988I(modifier, AbstractC17918w0.m51517e(4279888902L), 0.0f, 0.0f, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m44067v(long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        C17909s c17909s = AbstractC17911t.f69612b;
        List listM118959K = AbstractC37056f.m118959K(new C17919x(j7), new C17919x(C17919x.m51541c(0.0f, j7)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)) * (-0.2f);
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51489g(c17909s, listM118959K, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) * 1.2f, 8), 0L, 0L, 0.6f, null, 0, 118);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v0 */
    public static final Modifier m44068v0(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return m43988I(modifier, AbstractC17918w0.m51517e(4286292411L), 0.0f, 0.0f, 6, null);
    }

    /* JADX INFO: renamed from: w */
    public static final Modifier m44069w(Modifier upsellGradientModifier, List<C17919x> colors, float f13, float f14) {
        AbstractC22676k.m65750j(upsellGradientModifier, "$this$upsellGradientModifier");
        AbstractC22676k.m65750j(colors, "colors");
        return upsellGradientModifier.mo3471e(AbstractC1125a.m3478a(C2314t.f9131w, new C15698z(f14, colors, f13)));
    }

    /* JADX INFO: renamed from: w0 */
    public static final Modifier m44070w0(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return m43988I(modifier, AbstractC17918w0.m51517e(4278227943L), 0.0f, 0.0f, 6, null);
    }

    /* JADX INFO: renamed from: x */
    public static Modifier m44071x(Modifier modifier, List list, float f13, float f14, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = 16;
        }
        if ((i13 & 4) != 0) {
            f14 = 0.8f;
        }
        return m44069w(modifier, list, f13, f14);
    }

    /* JADX INFO: renamed from: x0 */
    public static final Modifier m44072x0(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return modifier.mo3471e(AbstractC1125a.m3478a(C2314t.f9131w, new C15449y1(19)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m44073y(float f13, List list, float f14, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63376J0(drawBehind, C17909s.m51489g(AbstractC17911t.f69612b, list, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) / 2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), C16620e.m47212d(drawBehind.mo731d()) * f13, 8), 0L, drawBehind.mo731d(), (((long) Float.floatToRawIntBits(drawBehind.mo743q0(f14))) << 32) | (((long) Float.floatToRawIntBits(drawBehind.mo743q0(f14))) & 4294967295L), 0.0f, null, 242);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m44074y0(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        C17909s c17909s = AbstractC17911t.f69612b;
        List listM118959K = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4285250753L)), new C17919x(AbstractC17918w0.m51515c(7060673)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32));
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51489g(c17909s, listM118959K, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)) * (-0.2f))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), 1.2f * Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)), 8), 0L, 0L, 0.6f, null, 0, 118);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final AbstractC17911t m44075z() {
        return C17909s.m51483a(AbstractC17911t.f69612b, f58832b, 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: z0 */
    public static final Modifier m44076z0(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return m44054o0(AbstractC1092a.m3358c(modifier, C38072d.f163053a.m121949b(composer, 6).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
    }
}
