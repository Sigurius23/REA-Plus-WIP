package f61;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aw0.C2108h;
import b11.C2276c;
import c93.InterfaceC4351m;
import ci0.C4728c;
import com.whoop.design.util.TextResource;
import cy1.C11186b;
import e61.AbstractC12765h;
import ej1.C13256s;
import f01.C13845b;
import f41.C14068f;
import g61.C15529b;
import g61.EnumC15530c;
import g61.EnumC15531d;
import gb1.AbstractC15676d;
import h61.C16980a;
import i61.InterfaceC18153b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j93.AbstractC21478l0;
import java.util.List;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p132f0.C13818q1;
import p181h2.C16618c;
import p208i2.AbstractC17911t;
import p208i2.C17893k;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.InterfaceC17912t0;
import p209i3.AbstractC18032n;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.EnumC22935a1;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23001u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import p91.C29007a;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yy0.AbstractC39888b;
import yy0.AbstractC39892f;
import yy0.C39889c;

/* JADX INFO: renamed from: f61.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\nJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u000fH\u0003¢\u0006\u0004\b!\u0010 J?\u0010'\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0003¢\u0006\u0004\b'\u0010(JM\u00104\u001a\u00020\b*\u00020)2\u0006\u0010$\u001a\u00020#2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b4\u00105JM\u00106\u001a\u00020\b*\u00020)2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b6\u00107J/\u0010=\u001a\u00020\b2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020/H\u0003¢\u0006\u0004\b=\u0010>J/\u0010?\u001a\u00020\b2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020/H\u0003¢\u0006\u0004\b?\u0010>J1\u0010B\u001a\u00020\b*\u00020@2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020\u000fH\u0003¢\u0006\u0004\bB\u0010CJ;\u0010D\u001a\u00020\b*\u00020)2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\bD\u0010EJ;\u0010G\u001a\u00020\b*\u00020)2\u0006\u0010F\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\bG\u0010EJ;\u0010H\u001a\u00020\b*\u00020)2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\bH\u0010EJ+\u0010K\u001a\u00020\b*\u00020)2\u0006\u0010+\u001a\u00020*2\u0006\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020,H\u0002¢\u0006\u0004\bK\u0010LJ\u0013\u0010N\u001a\u00020\b*\u00020MH\u0003¢\u0006\u0004\bN\u0010O¨\u0006P"}, m65681d2 = {"Lf61/i;", "", "<init>", "()V", "Lg61/b;", "state", "Li61/b;", "geometry", "Ll83/a0;", "S", "(Lg61/b;Li61/b;Landroidx/compose/runtime/Composer;I)V", "Lh61/a;", "R", "(Lg61/b;Lh61/a;Landroidx/compose/runtime/Composer;I)V", "B", "", "isStart", "t", "(Lg61/b;Li61/b;ZLandroidx/compose/runtime/Composer;I)V", "showDot", "V", "(Lg61/b;Li61/b;ZZLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lyy0/c;", "labels", "Lp91/a;", "anchorPoint", "J", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lp91/a;Landroidx/compose/runtime/Composer;II)V", "M", "(Li61/b;Lg61/b;ZLandroidx/compose/runtime/Composer;II)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "isZeroOffset", "Lg61/c;", "style", "Ly81/e;", "lineColorOverride", "X", "(ZZLg61/c;ZLy81/e;Landroidx/compose/runtime/Composer;II)V", "Lk2/e;", "Li2/x;", "color", "Lh2/b;", "start", "end", "", "strokeWidth", "Li2/t0;", "pathEffect", "dotRadius", "c0", "(Lk2/e;Lg61/c;JJJFLi2/t0;Ljava/lang/Float;)V", "b0", "(Lk2/e;ZJJJFLi2/t0;Ljava/lang/Float;)V", "Lh2/c;", "rect", "Lcom/whoop/design/util/TextResource;", "label", "xPercent", "z", "(Lh2/c;Lcom/whoop/design/util/TextResource;Lp91/a;FLandroidx/compose/runtime/Composer;I)V", "P", "Ll0/s1;", "scrimPresent", "d0", "(Ll0/s1;Ljava/util/List;Lp91/a;ZLandroidx/compose/runtime/Composer;I)V", "I", "(Lk2/e;JJJFLi2/t0;)V", "startingColor", "D", "E", "radius", "center", "v", "(Lk2/e;JFJ)V", "Ll0/u;", "F", "(Ll0/u;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14147i {

    /* JADX INFO: renamed from: f61.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f50954w = new a();

        /* JADX INFO: renamed from: a */
        public final long m40315a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m40315a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f61.i$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f50955w = new b();

        /* JADX INFO: renamed from: a */
        public final long m40316a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m40316a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f61.i$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f50956a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f50957b;

        static {
            int[] iArr = new int[EnumC15531d.values().length];
            try {
                iArr[EnumC15531d.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15531d.TIME_MARKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC15531d.TIME_MARKER_WITHOUT_BULB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f50956a = iArr;
            int[] iArr2 = new int[EnumC15530c.values().length];
            try {
                iArr2[EnumC15530c.FADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC15530c.SOLID.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC15530c.FADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f50957b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m40258A(C14147i c14147i, C16618c c16618c, TextResource textResource, C29007a c29007a, float f13, int i13, Composer composer, int i14) {
        c14147i.m40311z(c16618c, textResource, c29007a, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m40259C(C14147i c14147i, C15529b c15529b, InterfaceC18153b interfaceC18153b, int i13, Composer composer, int i14) {
        c14147i.m40312B(c15529b, interfaceC18153b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private final void m40260D(InterfaceC22131e interfaceC22131e, long j7, long j13, long j14, float f13, InterfaceC17912t0 interfaceC17912t0) {
        interfaceC22131e.mo727R(C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(j7)), 0L, 0L, 14), j13, j14, f13, (496 & 32) != 0 ? null : interfaceC17912t0, (496 & 64) != 0 ? 1.0f : 0.0f);
    }

    /* JADX INFO: renamed from: E */
    private final void m40261E(InterfaceC22131e interfaceC22131e, long j7, long j13, long j14, float f13, InterfaceC17912t0 interfaceC17912t0) {
        interfaceC22131e.mo732d0(C17919x.m51541c(0.2f, j7), j13, j14, (496 & 8) != 0 ? 0.0f : f13, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : interfaceC17912t0);
    }

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
    /* JADX INFO: renamed from: F */
    private final void m40262F(InterfaceC23001u interfaceC23001u, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(221049881);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            List listM118959K = AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getBlack50()));
            Modifier modifierMo3401b = interfaceC23001u.mo3401b(C2314t.f9131w);
            boolean zM87153g = c28655q.m87153g(listM118959K);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C13256s(listM118959K, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierMo3401b, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(this, interfaceC23001u, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m40263G(List list, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() >> 32));
        InterfaceC22131e.m63385u(Canvas, C17909s.m51493k(AbstractC17911t.f69612b, list, 0.0f, Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)), 8), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L))))) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), 0.0f, null, 0, 120);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m40264H(C14147i c14147i, InterfaceC23001u interfaceC23001u, int i13, Composer composer, int i14) {
        c14147i.m40262F(interfaceC23001u, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private final void m40265I(InterfaceC22131e interfaceC22131e, long j7, long j13, long j14, float f13, InterfaceC17912t0 interfaceC17912t0) {
        interfaceC22131e.mo732d0(j7, j13, j14, (496 & 8) != 0 ? 0.0f : f13, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : interfaceC17912t0);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX INFO: renamed from: J */
    private final void m40266J(Modifier modifier, List<C39889c> list, C29007a c29007a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        List<C39889c> list2;
        C29007a c29007a2;
        Modifier modifier3;
        Modifier modifier4;
        C29007a c29007a3;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-403206548);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            list2 = list;
            i15 |= c28655q.m87157i(list2) ? 32 : 16;
        } else {
            list2 = list;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                c29007a2 = c29007a;
                int i17 = c28655q.m87153g(c29007a2) ? 256 : 128;
                i15 |= i17;
            } else {
                c29007a2 = c29007a;
            }
            i15 |= i17;
        } else {
            c29007a2 = c29007a;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                    c29007a3 = new C29007a(1.0f, 0.5f, false, false, 12, null);
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C13818q1(1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC39892f.m127987b(AbstractC18032n.m51774b(modifier4, (Function1) objM87133R), list2, c29007a3, c28655q, i15 & MessageListItemViewType.GIPHY, 0);
                modifier3 = modifier4;
                c29007a2 = c29007a3;
            } else {
                c28655q.m87138X();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                modifier4 = modifier2;
            }
            c29007a3 = c29007a2;
            c28655q.m87175r();
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C13818q1(1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39892f.m127987b(AbstractC18032n.m51774b(modifier4, (Function1) objM87133R), list2, c29007a3, c28655q, i15 & MessageListItemViewType.GIPHY, 0);
            modifier3 = modifier4;
            c29007a2 = c29007a3;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2276c(this, modifier3, list, c29007a2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m40267K(InterfaceC18044z clearAndSetSemantics) {
        AbstractC22676k.m65750j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m40268L(C14147i c14147i, Modifier modifier, List list, C29007a c29007a, int i13, int i14, Composer composer, int i15) {
        c14147i.m40266J(modifier, list, c29007a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Code duplicated, block: B:63:0x0180  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r23v0, types: [f61.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [f61.i] */
    /* JADX INFO: renamed from: M */
    private final void m40269M(InterfaceC18153b interfaceC18153b, C15529b c15529b, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        ?? r10;
        boolean z14;
        ?? r14;
        C28677v1 c28677v1M87180u;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        ?? r15;
        int i16;
        ?? r16 = (C28655q) composer;
        r16.m87154g0(1127799189);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? r16.m87153g(interfaceC18153b) : r16.m87157i(interfaceC18153b) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= r16.m87157i(c15529b) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= r16.m87155h(z13) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                r15 = this;
                if (r16.m87153g(r15)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i16;
                r10 = r15;
            } else {
                r10 = this;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (r16.m87135U(i15 & 1, z14)) {
                if (i17 != 0) {
                    z13 = true;
                }
                List<C39889c> listM43722e = c15529b.m43722e();
                Modifier modifierM35717F = AbstractC12765h.m35717F(C2314t.f9131w, interfaceC18153b.mo52125f(), new C29007a(0.0f, 1.0f, false, false, 12, null));
                objM87133R = r16.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C14068f(4);
                    r16.m87172p0(objM87133R);
                }
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC18032n.m51774b(modifierM35717F, (Function1) objM87133R));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, r16, 0);
                iHashCode = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = r16.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(r16, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j);
                } else {
                    r16.m87178s0();
                }
                AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, r16, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N);
                int i18 = i15 << 3;
                int i19 = i18 & 57344;
                r10.m40288d0(C23000t1.f90727a, listM43722e, new C29007a(1.0f, 0.5f, false, false, 12, null), c15529b.getScrimPresent(), r16, 6 | i19);
                m40278X(c15529b.getIsZeroOffsetTimeMarker(), true, c15529b.getStyle(), z13, c15529b.getAxisColorOverride(), r16, ((i15 << 6) & 458752) | (i18 & 7168) | 48, 0);
                ?? r17 = r16;
                r17.m87173q(true);
                m40272P(interfaceC18153b.mo52124e(), c15529b.getAxisDescription(), new C29007a(0.0f, 0.0f, false, false, 12, null), 0.0f, r17, i19 | 3072);
                r14 = r17;
            } else {
                r16.m87138X();
                r14 = r16;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h((Object) this, interfaceC18153b, c15529b, z13, i13, i14, 9);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i13 & 3072) == 0) {
            r15 = this;
            if (r16.m87153g(r15)) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i16;
            r10 = r15;
        } else {
            r10 = this;
        }
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (r16.m87135U(i15 & 1, z14)) {
            if (i17 != 0) {
                z13 = true;
            }
            List<C39889c> listM43722e2 = c15529b.m43722e();
            Modifier modifierM35717F2 = AbstractC12765h.m35717F(C2314t.f9131w, interfaceC18153b.mo52125f(), new C29007a(0.0f, 1.0f, false, false, 12, null));
            objM87133R = r16.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C14068f(4);
                r16.m87172p0(objM87133R);
            }
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, AbstractC18032n.m51774b(modifierM35717F2, (Function1) objM87133R));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, r16, 0);
            iHashCode = Long.hashCode(r16.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = r16.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(r16, modifierM3407d2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            r16.m87158i0();
            if (r16.f115903S) {
                r16.m87163l(c0213j);
            } else {
                r16.m87178s0();
            }
            AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (r16.f115903S) {
                AbstractC11266d.m30471y(iHashCode, r16, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, r16, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N2);
            int i110 = i15 << 3;
            int i111 = i110 & 57344;
            r10.m40288d0(C23000t1.f90727a, listM43722e2, new C29007a(1.0f, 0.5f, false, false, 12, null), c15529b.getScrimPresent(), r16, 6 | i111);
            m40278X(c15529b.getIsZeroOffsetTimeMarker(), true, c15529b.getStyle(), z13, c15529b.getAxisColorOverride(), r16, ((i15 << 6) & 458752) | (i110 & 7168) | 48, 0);
            ?? r18 = r16;
            r18.m87173q(true);
            m40272P(interfaceC18153b.mo52124e(), c15529b.getAxisDescription(), new C29007a(0.0f, 0.0f, false, false, 12, null), 0.0f, r18, i111 | 3072);
            r14 = r18;
        } else {
            r16.m87138X();
            r14 = r16;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h((Object) this, interfaceC18153b, c15529b, z13, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m40270N(InterfaceC18044z clearAndSetSemantics) {
        AbstractC22676k.m65750j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m40271O(C14147i c14147i, InterfaceC18153b interfaceC18153b, C15529b c15529b, boolean z4, int i13, int i14, Composer composer, int i15) {
        c14147i.m40269M(interfaceC18153b, c15529b, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private final void m40272P(C16618c c16618c, TextResource textResource, C29007a c29007a, float f13, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(918618090);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c16618c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(textResource) ? 32 : 16;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87147d(f13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1043) != 1042)) {
            Modifier modifierM35717F = AbstractC12765h.m35717F(C2314t.f9131w, c16618c, new C29007a(0.0f, 1.0f, false, false, 12, null));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM35717F);
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
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = b.f50955w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39888b.m127973e(AbstractC37056f.m118958J(new C39889c(textResource, null, p745y81.Function1.m125323a((Function1) objM87133R), f13, 0.0f, null, 34, null)), new C29007a(0.0f, 0.0f, false, false, 12, null), false, c28655q, 384, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4728c(this, c16618c, textResource, c29007a, f13, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m40273Q(C14147i c14147i, C16618c c16618c, TextResource textResource, C29007a c29007a, float f13, int i13, Composer composer, int i14) {
        c14147i.m40272P(c16618c, textResource, c29007a, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m40274T(C14147i c14147i, C15529b c15529b, InterfaceC18153b interfaceC18153b, int i13, Composer composer, int i14) {
        c14147i.m40314S(c15529b, interfaceC18153b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m40275U(C14147i c14147i, C15529b c15529b, C16980a c16980a, int i13, Composer composer, int i14) {
        c14147i.m40313R(c15529b, c16980a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: V */
    private final void m40276V(C15529b c15529b, InterfaceC18153b interfaceC18153b, boolean z4, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-437459549);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c15529b) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(interfaceC18153b) : c28655q.m87157i(interfaceC18153b) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                z14 = z13;
                i15 |= c28655q.m87155h(z14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87153g(this)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i16;
            }
            if ((i15 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                if (i17 != 0) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                if (z4) {
                    c28655q.m87150e0(-1426475554);
                    int i18 = i15 >> 3;
                    m40269M(interfaceC18153b, c15529b, z16, c28655q, (i18 & 7168) | ((i15 << 3) & 112) | (i18 & 14) | (i18 & 896), 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1426405184);
                    int i19 = i15 >> 3;
                    m40308w(interfaceC18153b, c15529b, z16, c28655q, ((i15 << 3) & 112) | (i19 & 14) | (i19 & 896) | (i19 & 7168), 0);
                    c28655q.m87173q(false);
                }
                z14 = z16;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14139a(this, c15529b, interfaceC18153b, z4, z14, i13, i14);
            }
        }
        i15 |= 3072;
        z14 = z13;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87153g(this)) {
                i16 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i16;
        }
        if ((i15 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i15 & 1, z15)) {
            if (i17 != 0) {
                z16 = true;
            } else {
                z16 = z14;
            }
            if (z4) {
                c28655q.m87150e0(-1426475554);
                int i110 = i15 >> 3;
                m40269M(interfaceC18153b, c15529b, z16, c28655q, (i110 & 7168) | ((i15 << 3) & 112) | (i110 & 14) | (i110 & 896), 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1426405184);
                int i111 = i15 >> 3;
                m40308w(interfaceC18153b, c15529b, z16, c28655q, ((i15 << 3) & 112) | (i111 & 14) | (i111 & 896) | (i111 & 7168), 0);
                c28655q.m87173q(false);
            }
            z14 = z16;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14139a(this, c15529b, interfaceC18153b, z4, z14, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m40277W(C14147i c14147i, C15529b c15529b, InterfaceC18153b interfaceC18153b, boolean z4, boolean z13, int i13, int i14, Composer composer, int i15) {
        c14147i.m40276V(c15529b, interfaceC18153b, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:82:0x0119  */
    /* JADX WARN: Code duplicated, block: B:85:0x0123  */
    /* JADX WARN: Code duplicated, block: B:86:0x012e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0142  */
    /* JADX WARN: Code duplicated, block: B:89:0x0150  */
    /* JADX WARN: Code duplicated, block: B:92:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01de  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [y81.e] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [y81.e] */
    /* JADX INFO: renamed from: X */
    private final void m40278X(final boolean z4, final boolean z13, final EnumC15530c enumC15530c, boolean z14, InterfaceC39332e interfaceC39332e, Composer composer, final int i13, final int i14) {
        int i15;
        boolean z15;
        final boolean z16;
        int i16;
        boolean zM87157i;
        int i17;
        boolean z17;
        final ?? r10;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifierM3399u;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C17919x c17919xM31989h;
        long jM95624D;
        Object objM87133R;
        int i18;
        ?? r14 = interfaceC39332e;
        ?? r15 = (C28655q) composer;
        r15.m87154g0(1095867207);
        if ((i13 & 6) == 0) {
            i15 = (r15.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            z15 = z13;
            i15 |= r15.m87155h(z15) ? 32 : 16;
        } else {
            z15 = z13;
        }
        if ((i13 & 384) == 0) {
            i15 |= r15.m87149e(enumC15530c == null ? -1 : enumC15530c.ordinal()) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                z16 = z14;
                i15 |= r15.m87155h(z16) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if ((32768 & i13) == 0) {
                    zM87157i = r15.m87153g(r14);
                } else {
                    zM87157i = r15.m87157i(r14);
                }
                if (zM87157i) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((196608 & i13) != 0) {
                if (r15.m87153g(this)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i18;
            }
            if ((74899 & i15) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (r15.m87135U(i15 & 1, z17)) {
                if (i19 != 0) {
                    z16 = true;
                }
                if (i16 != 0) {
                    r14 = 0;
                }
                c2314t = C2314t.f9131w;
                if (z4) {
                    modifierM3399u = AbstractC1102d.m3424u(3, AbstractC1102d.m3406c(1.0f, c2314t));
                } else {
                    modifierM3399u = AbstractC1099a.m3399u(c2314t, EnumC22935a1.f90537w);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = r15.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(r15, modifierM3399u);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(r15, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, r15, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(r15, C0217k.f726d, modifierM118962N);
                if (r14 == 0) {
                    r15.m87150e0(-1711685055);
                    r15.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    r15.m87150e0(-1163594304);
                    c17919xM31989h = AbstractC11895b.m31989h(r15, false, r14.mo134584toComposableColorWaAFU9c(r15, (i15 >> 12) & 14));
                }
                if (c17919xM31989h == null) {
                    r15.m87150e0(-1163593001);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, r15, 6, false);
                } else {
                    r15.m87150e0(-1163594861);
                    r15.m87173q(false);
                    jM95624D = c17919xM31989h.f69639a;
                }
                C28674u2 c28674u2 = AbstractC2453v1.f9569h;
                float f13 = 3;
                final float fMo743q0 = ((InterfaceC39171c) r15.m87161k(c28674u2)).mo743q0(f13);
                float f14 = 2;
                final float fMo743q1 = ((InterfaceC39171c) r15.m87161k(c28674u2)).mo743q0(f14);
                ?? r24 = r14;
                final float fMo743q2 = ((InterfaceC39171c) r15.m87161k(c28674u2)).mo743q0(1);
                final long j7 = jM95624D;
                final C22669g0 c22669g0 = new C22669g0();
                c22669g0.f89336w = Float.valueOf(((InterfaceC39171c) r15.m87161k(c28674u2)).mo743q0(f14));
                Modifier modifierM3424u = AbstractC1102d.m3424u(f13, AbstractC1102d.m3406c(1.0f, c2314t));
                objM87133R = r15.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C13818q1(3);
                    r15.m87172p0(objM87133R);
                }
                Modifier modifierM51774b = AbstractC18032n.m51774b(modifierM3424u, (Function1) objM87133R);
                final boolean z18 = z15;
                AbstractC21478l0.m60421a(modifierM51774b, new Function1() { // from class: f61.g
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C14147i.m40280Z(z18, c22669g0, fMo743q0, fMo743q1, z16, enumC15530c, this, j7, fMo743q2, z4, (InterfaceC22131e) obj);
                    }
                }, r15, 0);
                r15.m87173q(true);
                r10 = r24;
            } else {
                r15.m87138X();
                r10 = r14;
            }
            c28677v1M87180u = r15.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f61.h
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return C14147i.m40282a0(this.f50950w, z4, z13, enumC15530c, z16, r10, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 3072;
        z16 = z14;
        i16 = i14 & 16;
        if (i16 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            if ((32768 & i13) == 0) {
                zM87157i = r15.m87153g(r14);
            } else {
                zM87157i = r15.m87157i(r14);
            }
            if (zM87157i) {
                i17 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i17;
        }
        if ((196608 & i13) != 0) {
            if (r15.m87153g(this)) {
                i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i18;
        }
        if ((74899 & i15) != 74898) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (r15.m87135U(i15 & 1, z17)) {
            if (i19 != 0) {
                z16 = true;
            }
            if (i16 != 0) {
                r14 = 0;
            }
            c2314t = C2314t.f9131w;
            if (z4) {
                modifierM3399u = AbstractC1102d.m3424u(3, AbstractC1102d.m3406c(1.0f, c2314t));
            } else {
                modifierM3399u = AbstractC1099a.m3399u(c2314t, EnumC22935a1.f90537w);
            }
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = r15.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(r15, modifierM3399u);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(r15, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (r15.f115903S) {
                AbstractC11266d.m30471y(iHashCode, r15, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, r15, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(r15, C0217k.f726d, modifierM118962N2);
            if (r14 == 0) {
                r15.m87150e0(-1711685055);
                r15.m87173q(false);
                c17919xM31989h = null;
            } else {
                r15.m87150e0(-1163594304);
                c17919xM31989h = AbstractC11895b.m31989h(r15, false, r14.mo134584toComposableColorWaAFU9c(r15, (i15 >> 12) & 14));
            }
            if (c17919xM31989h == null) {
                r15.m87150e0(-1163593001);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, r15, 6, false);
            } else {
                r15.m87150e0(-1163594861);
                r15.m87173q(false);
                jM95624D = c17919xM31989h.f69639a;
            }
            C28674u2 c28674u3 = AbstractC2453v1.f9569h;
            float f15 = 3;
            final float fMo743q3 = ((InterfaceC39171c) r15.m87161k(c28674u3)).mo743q0(f15);
            float f16 = 2;
            final float fMo743q4 = ((InterfaceC39171c) r15.m87161k(c28674u3)).mo743q0(f16);
            ?? r25 = r14;
            final float fMo743q5 = ((InterfaceC39171c) r15.m87161k(c28674u3)).mo743q0(1);
            final long j13 = jM95624D;
            final C22669g0 c22669g1 = new C22669g0();
            c22669g1.f89336w = Float.valueOf(((InterfaceC39171c) r15.m87161k(c28674u3)).mo743q0(f16));
            Modifier modifierM3424u2 = AbstractC1102d.m3424u(f15, AbstractC1102d.m3406c(1.0f, c2314t));
            objM87133R = r15.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C13818q1(3);
                r15.m87172p0(objM87133R);
            }
            Modifier modifierM51774b2 = AbstractC18032n.m51774b(modifierM3424u2, (Function1) objM87133R);
            final boolean z19 = z15;
            AbstractC21478l0.m60421a(modifierM51774b2, new Function1() { // from class: f61.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C14147i.m40280Z(z19, c22669g1, fMo743q3, fMo743q4, z16, enumC15530c, this, j13, fMo743q5, z4, (InterfaceC22131e) obj);
                }
            }, r15, 0);
            r15.m87173q(true);
            r10 = r25;
        } else {
            r15.m87138X();
            r10 = r14;
        }
        c28677v1M87180u = r15.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f61.h
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return C14147i.m40282a0(this.f50950w, z4, z13, enumC15530c, z16, r10, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m40279Y(InterfaceC18044z clearAndSetSemantics) {
        AbstractC22676k.m65750j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m40280Z(boolean z4, C22669g0 c22669g0, float f13, float f14, boolean z13, EnumC15530c enumC15530c, C14147i c14147i, long j7, float f15, boolean z14, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float f16 = z4 ? 0.0f : 1.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L));
        Float f17 = (Float) c22669g0.f89336w;
        float fFloatValue = fIntBitsToFloat - ((f17 != null ? f17.floatValue() : 0.0f) * 2);
        C17893k c17893k = new C17893k(new DashPathEffect(new float[]{f13, f14}, 0.0f));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f16)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fFloatValue)));
        Float f18 = z13 ? (Float) c22669g0.f89336w : null;
        c22669g0.f89336w = f18;
        if (enumC15530c != null) {
            c14147i.m40286c0(Canvas, enumC15530c, j7, jFloatToRawIntBits, jFloatToRawIntBits2, f15, c17893k, f18);
        } else {
            c14147i.m40284b0(Canvas, z14, j7, jFloatToRawIntBits, jFloatToRawIntBits2, f15, c17893k, f18);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m40282a0(C14147i c14147i, boolean z4, boolean z13, EnumC15530c enumC15530c, boolean z14, InterfaceC39332e interfaceC39332e, int i13, int i14, Composer composer, int i15) {
        c14147i.m40278X(z4, z13, enumC15530c, z14, interfaceC39332e, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b0 */
    private final void m40284b0(InterfaceC22131e interfaceC22131e, boolean z4, long j7, long j13, long j14, float f13, InterfaceC17912t0 interfaceC17912t0, Float f14) {
        InterfaceC22131e interfaceC22131e2;
        if (z4) {
            interfaceC22131e2 = interfaceC22131e;
            m40265I(interfaceC22131e2, j7, j13, j14, f13, interfaceC17912t0);
        } else {
            interfaceC22131e2 = interfaceC22131e;
            m40260D(interfaceC22131e2, j7, j13, j14, f13, interfaceC17912t0);
        }
        if (f14 != null) {
            m40307v(interfaceC22131e2, j7, f14.floatValue(), j14);
        }
    }

    /* JADX INFO: renamed from: c0 */
    private final void m40286c0(InterfaceC22131e interfaceC22131e, EnumC15530c enumC15530c, long j7, long j13, long j14, float f13, InterfaceC17912t0 interfaceC17912t0, Float f14) {
        int i13 = c.f50957b[enumC15530c.ordinal()];
        if (i13 == 1) {
            m40261E(interfaceC22131e, j7, j13, j14, f13, interfaceC17912t0);
            return;
        }
        if (i13 == 2) {
            m40265I(interfaceC22131e, j7, j13, j14, f13, interfaceC17912t0);
            if (f14 != null) {
                m40307v(interfaceC22131e, j7, f14.floatValue(), j14);
                return;
            }
            return;
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        m40260D(interfaceC22131e, j7, j13, j14, f13, interfaceC17912t0);
        if (f14 != null) {
            m40307v(interfaceC22131e, j7, f14.floatValue(), j14);
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m40288d0(InterfaceC22997s1 interfaceC22997s1, List<C39889c> list, C29007a c29007a, boolean z4, Composer composer, int i13) {
        int i14;
        C29007a c29007a2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1577061412);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            c29007a2 = c29007a;
            i14 |= c28655q.m87153g(c29007a2) ? 256 : 128;
        } else {
            c29007a2 = c29007a;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(this) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, interfaceC22997s1.mo66772c(C2314t.f9131w, true, 1.0f));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3406c);
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
            if (z4) {
                c28655q.m87150e0(-1269352239);
                m40262F(C1100b.f4583a, c28655q, ((i14 >> 9) & 112) | 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1269314760);
                c28655q.m87173q(false);
            }
            if (list.isEmpty()) {
                c28655q.m87150e0(-1269132232);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1269272538);
                m40266J(null, list, c29007a2, c28655q, (i14 & MessageListItemViewType.GIPHY) | ((i14 >> 3) & 7168), 1);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14144f(this, interfaceC22997s1, list, c29007a, z4, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m40290e0(C14147i c14147i, InterfaceC22997s1 interfaceC22997s1, List list, C29007a c29007a, boolean z4, int i13, Composer composer, int i14) {
        c14147i.m40288d0(interfaceC22997s1, list, c29007a, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private final void m40305t(final C15529b c15529b, final InterfaceC18153b interfaceC18153b, final boolean z4, Composer composer, final int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1787958139);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c15529b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(interfaceC18153b) : c28655q.m87157i(interfaceC18153b) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(this) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            int i15 = c.f50956a[c15529b.getType().ordinal()];
            if (i15 == 1) {
                c28655q.m87150e0(1123646191);
                m40266J(AbstractC12765h.m35718G(C2314t.f9131w, z4 ? interfaceC18153b.mo52125f() : interfaceC18153b.mo52132m(), null, 2, null), c15529b.m43722e(), C29007a.INSTANCE.m88136a(), c28655q, (i14 & 7168) | 384, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (i15 == 2) {
                c28655q.m87150e0(1124103193);
                m40276V(c15529b, interfaceC18153b, z4, false, c28655q, (i14 & 1022) | ((i14 << 3) & 57344), 8);
                c28655q.m87173q(false);
            } else {
                if (i15 != 3) {
                    throw AbstractC11895b.m32003v(-240849576, c28655q, false);
                }
                c28655q.m87150e0(-240828816);
                m40276V(c15529b, interfaceC18153b, z4, false, c28655q, (i14 & 14) | 3072 | (i14 & 112) | (i14 & 896) | ((i14 << 3) & 57344), 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f61.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return C14147i.m40306u(this.f50918w, c15529b, interfaceC18153b, z4, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m40306u(C14147i c14147i, C15529b c15529b, InterfaceC18153b interfaceC18153b, boolean z4, int i13, Composer composer, int i14) {
        c14147i.m40305t(c15529b, interfaceC18153b, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private final void m40307v(InterfaceC22131e interfaceC22131e, long j7, float f13, long j13) {
        InterfaceC22131e.m63379M(interfaceC22131e, j7, f13, j13, 0.0f, null, 120);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x0108  */
    /* JADX WARN: Code duplicated, block: B:61:0x017d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0186  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r24v0, types: [f61.i] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [f61.i] */
    /* JADX INFO: renamed from: w */
    private final void m40308w(InterfaceC18153b interfaceC18153b, C15529b c15529b, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        ?? r10;
        boolean z14;
        ?? r14;
        C28677v1 c28677v1M87180u;
        boolean z15;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        ?? r15;
        int i16;
        ?? r16 = (C28655q) composer;
        r16.m87154g0(1941229116);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? r16.m87153g(interfaceC18153b) : r16.m87157i(interfaceC18153b) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= r16.m87157i(c15529b) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= r16.m87155h(z13) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                r15 = this;
                if (r16.m87153g(r15)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i16;
                r10 = r15;
            } else {
                r10 = this;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (r16.m87135U(i15 & 1, z14)) {
                if (i17 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                List<C39889c> listM43722e = c15529b.m43722e();
                Modifier modifierM35717F = AbstractC12765h.m35717F(C2314t.f9131w, interfaceC18153b.mo52132m(), new C29007a(0.0f, 1.0f, false, false, 12, null));
                objM87133R = r16.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C13818q1(2);
                    r16.m87172p0(objM87133R);
                }
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC18032n.m51774b(modifierM35717F, (Function1) objM87133R));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, r16, 0);
                iHashCode = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = r16.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(r16, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j);
                } else {
                    r16.m87178s0();
                }
                AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, r16, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N);
                int i18 = i15 << 3;
                r10.m40278X(c15529b.getIsZeroOffsetTimeMarker(), false, c15529b.getStyle(), z15, c15529b.getAxisColorOverride(), r16, (i18 & 7168) | 48 | ((i15 << 6) & 458752), 0);
                ?? r17 = r16;
                int i19 = i18 & 57344;
                m40288d0(C23000t1.f90727a, listM43722e, new C29007a(0.0f, 0.5f, false, false, 12, null), c15529b.getScrimPresent(), r17, 6 | i19);
                r17.m87173q(true);
                m40311z(interfaceC18153b.mo52124e(), c15529b.getAxisDescription(), new C29007a(1.0f, 1.0f, false, false, 12, null), 1.0f, r17, i19 | 3072);
                z13 = z15;
                r14 = r17;
            } else {
                r16.m87138X();
                r14 = r16;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14143e(this, interfaceC18153b, c15529b, z13, i13, i14);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i13 & 3072) == 0) {
            r15 = this;
            if (r16.m87153g(r15)) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i16;
            r10 = r15;
        } else {
            r10 = this;
        }
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (r16.m87135U(i15 & 1, z14)) {
            if (i17 != 0) {
                z15 = true;
            } else {
                z15 = z13;
            }
            List<C39889c> listM43722e2 = c15529b.m43722e();
            Modifier modifierM35717F2 = AbstractC12765h.m35717F(C2314t.f9131w, interfaceC18153b.mo52132m(), new C29007a(0.0f, 1.0f, false, false, 12, null));
            objM87133R = r16.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C13818q1(2);
                r16.m87172p0(objM87133R);
            }
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, AbstractC18032n.m51774b(modifierM35717F2, (Function1) objM87133R));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, r16, 0);
            iHashCode = Long.hashCode(r16.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = r16.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(r16, modifierM3407d2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            r16.m87158i0();
            if (r16.f115903S) {
                r16.m87163l(c0213j);
            } else {
                r16.m87178s0();
            }
            AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (r16.f115903S) {
                AbstractC11266d.m30471y(iHashCode, r16, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, r16, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N2);
            int i110 = i15 << 3;
            r10.m40278X(c15529b.getIsZeroOffsetTimeMarker(), false, c15529b.getStyle(), z15, c15529b.getAxisColorOverride(), r16, (i110 & 7168) | 48 | ((i15 << 6) & 458752), 0);
            ?? r18 = r16;
            int i111 = i110 & 57344;
            m40288d0(C23000t1.f90727a, listM43722e2, new C29007a(0.0f, 0.5f, false, false, 12, null), c15529b.getScrimPresent(), r18, 6 | i111);
            r18.m87173q(true);
            m40311z(interfaceC18153b.mo52124e(), c15529b.getAxisDescription(), new C29007a(1.0f, 1.0f, false, false, 12, null), 1.0f, r18, i111 | 3072);
            z13 = z15;
            r14 = r18;
        } else {
            r16.m87138X();
            r14 = r16;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14143e(this, interfaceC18153b, c15529b, z13, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m40309x(InterfaceC18044z clearAndSetSemantics) {
        AbstractC22676k.m65750j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m40310y(C14147i c14147i, InterfaceC18153b interfaceC18153b, C15529b c15529b, boolean z4, int i13, int i14, Composer composer, int i15) {
        c14147i.m40308w(interfaceC18153b, c15529b, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private final void m40311z(final C16618c c16618c, final TextResource textResource, final C29007a c29007a, final float f13, Composer composer, final int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1768498269);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c16618c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(textResource) ? 32 : 16;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87147d(f13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1043) != 1042)) {
            Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC12765h.m35717F(C2314t.f9131w, c16618c, new C29007a(0.0f, 1.0f, false, false, 12, null)), "GraphTimeMarker_End");
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44101d);
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
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = a.f50954w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39888b.m127973e(AbstractC37056f.m118958J(new C39889c(textResource, null, p745y81.Function1.m125323a((Function1) objM87133R), f13, 0.0f, null, 34, null)), new C29007a(1.0f, 0.0f, false, false, 12, null), false, c28655q, 384, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f61.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return C14147i.m40258A(this.f50908w, c16618c, textResource, c29007a, f13, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m40312B(C15529b state, InterfaceC18153b geometry, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(geometry, "geometry");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1979673268);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(geometry) : c28655q.m87157i(geometry) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(this) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            m40305t(state, geometry, false, c28655q, (i14 & 14) | 384 | (i14 & 112) | ((i14 << 3) & 7168));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14141c(this, state, geometry, i13, 1);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m40313R(C15529b state, C16980a geometry, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(geometry, "geometry");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1654604414);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(geometry) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(this) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            m40266J(AbstractC12765h.m35718G(C2314t.f9131w, geometry.m47802e(), null, 2, null), state.m43722e(), C29007a.INSTANCE.m88136a(), c28655q, ((i14 << 3) & 7168) | 384, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(this, state, geometry, i13, 13);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m40314S(C15529b state, InterfaceC18153b geometry, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(geometry, "geometry");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1562224795);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(geometry) : c28655q.m87157i(geometry) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(this) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            m40305t(state, geometry, true, c28655q, (i14 & 14) | 384 | (i14 & 112) | ((i14 << 3) & 7168));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14141c(this, state, geometry, i13, 0);
        }
    }
}
