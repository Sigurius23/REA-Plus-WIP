package p717lq2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kr2.AbstractC22815d;
import kr2.AbstractC22816e;
import l83.C23454a0;
import l83.C23465k;
import lc0.C23821c;
import lq0.C24656d;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p002a0.C0006a1;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p134f2.C14015d;
import p134f2.C14018g;
import p181h2.C16618c;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p208i2.C17894k0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lq2.p */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002?NB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\t*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\t*\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001a\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010%J/\u0010(\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J©\u0001\u0010=\u001a\u00020\u0006*\u00020\u00062\u0006\u0010/\u001a\u00020.2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u00100\u001a\u00020\t2\b\b\u0002\u00101\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\t2\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\t2\b\b\u0002\u00107\u001a\u00020\t2\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\t2\b\b\u0002\u0010<\u001a\u00020\u001c¢\u0006\u0004\b=\u0010>R\u0017\u0010C\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010F\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010BR\u0017\u0010I\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010BR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020*0\u00118\u0006¢\u0006\f\n\u0004\b,\u0010J\u001a\u0004\bK\u0010L¨\u0006O"}, m65681d2 = {"Llq2/p;", "", "<init>", "()V", "Llq2/p$a;", "preset", "Landroidx/compose/ui/Modifier;", "n", "(Llq2/p$a;)Landroidx/compose/ui/Modifier;", "", "v", "i", "(F)F", "Lh2/e;", "l", "(J)F", "m", "", "Li2/x;", "colors", "Li2/t;", "j", "(Ljava/util/List;)Li2/t;", "Lh2/b;", "start", "end", "k", "(Ljava/util/List;JJ)Li2/t;", "", "isTop", "topY", "bottomY", "f", "(ZFF)Li2/t;", "center", "radius", "g", "(JF)Li2/t;", "color", "alpha", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(JFJF)Li2/t;", "Lkr2/d;", "type", "e", "(Lkr2/d;)Landroidx/compose/ui/Modifier;", "Llq2/f;", "option", "circleAlpha", "radiusFraction", "circleCenterYOffsetFraction", "linearStartXFraction", "linearStartYFraction", "linearEndXFraction", "linearEndYFraction", "bandStartScreenFraction", "bandAlpha", "baseDark", "vignetteDark", "vignetteStrength", "drawBaseDark", "q", "(Landroidx/compose/ui/Modifier;Llq2/f;Ljava/util/List;FFFFFFFFFJJFZ)Landroidx/compose/ui/Modifier;", "b", "J", "getLANDING_DARK_START-0d7_KjU", "()J", "LANDING_DARK_START", "c", "getLANDING_DARK_MID-0d7_KjU", "LANDING_DARK_MID", "d", "getLANDING_DARK_END-0d7_KjU", "LANDING_DARK_END", "Ljava/util/List;", "getPreviewBackgrounds", "()Ljava/util/List;", "previewBackgrounds", "a", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24684p {

    /* JADX INFO: renamed from: a */
    public static final C24684p f96548a = new C24684p();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final long LANDING_DARK_START = AbstractC17918w0.m51517e(4280824633L);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final long LANDING_DARK_MID = AbstractC17918w0.m51517e(4279507229L);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final long LANDING_DARK_END = AbstractC17918w0.m51517e(4279244056L);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final List<AbstractC22815d> previewBackgrounds;

    /* JADX INFO: renamed from: f */
    public static final int f96553f;

    /* JADX INFO: renamed from: lq2.p$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\t\n\u0007\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Llq2/p$a;", "", "<init>", "()V", "Lkr2/d;", "type", "Li2/t;", "a", "(Lkr2/d;)Li2/t;", "d", "c", "b", "Llq2/p$a$a;", "Llq2/p$a$b;", "Llq2/p$a$c;", "Llq2/p$a$d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: lq2.p$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001d\u0010 ¨\u0006\""}, m65681d2 = {"Llq2/p$a$a;", "Llq2/p$a;", "Li2/x;", "start", "end", "", "startAlpha", "endAlpha", "bottomDark", "bottomDarkStartFraction", "<init>", "(JJFFJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "f", "()J", "b", "d", "c", "F", "g", "()F", "e", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41970a extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final long start;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final long end;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final float startAlpha;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final float endAlpha;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final long bottomDark;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final float bottomDarkStartFraction;

            public /* synthetic */ C41970a(long j7, long j13, float f13, float f14, long j14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
                this(j7, j13, f13, f14, j14, f15);
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final long getBottomDark() {
                return this.bottomDark;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final float getBottomDarkStartFraction() {
                return this.bottomDarkStartFraction;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final long getEnd() {
                return this.end;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final float getEndAlpha() {
                return this.endAlpha;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C41970a)) {
                    return false;
                }
                C41970a c41970a = (C41970a) other;
                return C17919x.m51542d(this.start, c41970a.start) && C17919x.m51542d(this.end, c41970a.end) && Float.compare(this.startAlpha, c41970a.startAlpha) == 0 && Float.compare(this.endAlpha, c41970a.endAlpha) == 0 && C17919x.m51542d(this.bottomDark, c41970a.bottomDark) && Float.compare(this.bottomDarkStartFraction, c41970a.bottomDarkStartFraction) == 0;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final long getStart() {
                return this.start;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final float getStartAlpha() {
                return this.startAlpha;
            }

            public int hashCode() {
                long j7 = this.start;
                int i13 = C17919x.f69638o;
                return Float.hashCode(this.bottomDarkStartFraction) + AbstractC11266d.m30451e(AbstractC11266d.m30447a(this.endAlpha, AbstractC11266d.m30447a(this.startAlpha, AbstractC11266d.m30451e(Long.hashCode(j7) * 31, this.end, 31), 31), 31), this.bottomDark, 31);
            }

            public String toString() {
                String strM51548j = C17919x.m51548j(this.start);
                String strM51548j2 = C17919x.m51548j(this.end);
                float f13 = this.startAlpha;
                float f14 = this.endAlpha;
                String strM51548j3 = C17919x.m51548j(this.bottomDark);
                float f15 = this.bottomDarkStartFraction;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("DiagonalFadeBottom(start=", strM51548j, ", end=", strM51548j2, ", startAlpha=");
                AbstractC30802r.m94772u(sbM32001t, f13, ", endAlpha=", f14, ", bottomDark=");
                sbM32001t.append(strM51548j3);
                sbM32001t.append(", bottomDarkStartFraction=");
                sbM32001t.append(f15);
                sbM32001t.append(")");
                return sbM32001t.toString();
            }

            private C41970a(long j7, long j13, float f13, float f14, long j14, float f15) {
                super(null);
                this.start = j7;
                this.end = j13;
                this.startAlpha = f13;
                this.endAlpha = f14;
                this.bottomDark = j14;
                this.bottomDarkStartFraction = f15;
            }

            public /* synthetic */ C41970a(long j7, long j13, float f13, float f14, long j14, float f15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(j7, j13, (i13 & 4) != 0 ? 0.5f : f13, (i13 & 8) != 0 ? 0.5f : f14, (i13 & 16) != 0 ? AbstractC17918w0.m51517e(4279244056L) : j14, (i13 & 32) != 0 ? 0.5f : f15, null);
            }
        }

        /* JADX INFO: renamed from: lq2.p$a$d */
        @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001c¨\u0006 "}, m65681d2 = {"Llq2/p$a$d;", "Llq2/p$a;", "Li2/x;", "color", "", "alpha", "radiusFraction", "vignetteStrength", "circleTopFeatherFraction", "<init>", "(JFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "F", "()F", "d", "e", "getCircleTopFeatherFraction", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final long color;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final float alpha;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final float radiusFraction;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final float vignetteStrength;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final float circleTopFeatherFraction;

            public /* synthetic */ d(long j7, float f13, float f14, float f15, float f16, DefaultConstructorMarker defaultConstructorMarker) {
                this(j7, f13, f14, f15, f16);
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final float getAlpha() {
                return this.alpha;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final long getColor() {
                return this.color;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final float getRadiusFraction() {
                return this.radiusFraction;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final float getVignetteStrength() {
                return this.vignetteStrength;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof d)) {
                    return false;
                }
                d dVar = (d) other;
                return C17919x.m51542d(this.color, dVar.color) && Float.compare(this.alpha, dVar.alpha) == 0 && Float.compare(this.radiusFraction, dVar.radiusFraction) == 0 && Float.compare(this.vignetteStrength, dVar.vignetteStrength) == 0 && Float.compare(this.circleTopFeatherFraction, dVar.circleTopFeatherFraction) == 0;
            }

            public int hashCode() {
                long j7 = this.color;
                int i13 = C17919x.f69638o;
                return Float.hashCode(this.circleTopFeatherFraction) + AbstractC11266d.m30447a(this.vignetteStrength, AbstractC11266d.m30447a(this.radiusFraction, AbstractC11266d.m30447a(this.alpha, Long.hashCode(j7) * 31, 31), 31), 31);
            }

            public String toString() {
                String strM51548j = C17919x.m51548j(this.color);
                float f13 = this.alpha;
                float f14 = this.radiusFraction;
                float f15 = this.vignetteStrength;
                float f16 = this.circleTopFeatherFraction;
                StringBuilder sb4 = new StringBuilder("SingleGlowBottom(color=");
                sb4.append(strM51548j);
                sb4.append(", alpha=");
                sb4.append(f13);
                sb4.append(", radiusFraction=");
                AbstractC30802r.m94772u(sb4, f14, ", vignetteStrength=", f15, ", circleTopFeatherFraction=");
                return AbstractC30007c.m91837g(f16, ")", sb4);
            }

            private d(long j7, float f13, float f14, float f15, float f16) {
                super(null);
                this.color = j7;
                this.alpha = f13;
                this.radiusFraction = f14;
                this.vignetteStrength = f15;
                this.circleTopFeatherFraction = f16;
            }

            public /* synthetic */ d(long j7, float f13, float f14, float f15, float f16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(j7, (i13 & 2) != 0 ? 0.4f : f13, (i13 & 4) != 0 ? 1.15f : f14, (i13 & 8) != 0 ? 0.45f : f15, (i13 & 16) != 0 ? 0.16f : f16, null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC17911t m72155a(AbstractC22815d type) {
            AbstractC22676k.m65750j(type, "type");
            if (type.equals(AbstractC22815d.d.f89842b)) {
                return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66168l()), new C17919x(AbstractC22816e.m66167k())), 0L, 0L, 14);
            }
            if (type.equals(AbstractC22815d.h.f89849b)) {
                return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66180x()), new C17919x(AbstractC22816e.m66179w())), 0L, 0L, 14);
            }
            if (type.equals(AbstractC22815d.g.f89848b)) {
                return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66177u()), new C17919x(AbstractC22816e.m66176t())), 0L, 0L, 14);
            }
            if (type.equals(AbstractC22815d.c.f89840b)) {
                return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66165i()), new C17919x(AbstractC22816e.m66164h())), 0L, 0L, 14);
            }
            if (type.equals(AbstractC22815d.b.f89838b)) {
                return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66162f()), new C17919x(AbstractC22816e.m66161e())), 0L, 0L, 14);
            }
            if (type.equals(AbstractC22815d.f.f89846b)) {
                return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66174r()), new C17919x(AbstractC22816e.m66173q())), 0L, 0L, 14);
            }
            if (type.equals(AbstractC22815d.e.f89844b)) {
                return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66171o()), new C17919x(AbstractC22816e.m66170n())), 0L, 0L, 14);
            }
            return type.equals(AbstractC22815d.a.f89836b) ? C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66159c()), new C17919x(AbstractC22816e.m66158b())), 0L, 0L, 14) : C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC22816e.m66168l()), new C17919x(AbstractC22816e.m66167k())), 0L, 0L, 14);
        }

        private a() {
        }

        /* JADX INFO: renamed from: lq2.p$a$c */
        @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006\""}, m65681d2 = {"Llq2/p$a$c;", "Llq2/p$a;", "", "Li2/x;", "colors", "", "circleAlpha", "Llq2/p$b;", "direction", "circleCenterYOffsetFraction", "<init>", "(Ljava/util/List;FLlq2/p$b;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "F", "()F", "c", "Llq2/p$b;", "e", "()Llq2/p$b;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final List<C17919x> colors;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final float circleAlpha;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final b direction;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final float circleCenterYOffsetFraction;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List<C17919x> colors, float f13, b direction, float f14) {
                super(null);
                AbstractC22676k.m65750j(colors, "colors");
                AbstractC22676k.m65750j(direction, "direction");
                this.colors = colors;
                this.circleAlpha = f13;
                this.direction = direction;
                this.circleCenterYOffsetFraction = f14;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final float getCircleAlpha() {
                return this.circleAlpha;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final float getCircleCenterYOffsetFraction() {
                return this.circleCenterYOffsetFraction;
            }

            /* JADX INFO: renamed from: d */
            public final List<C17919x> m72172d() {
                return this.colors;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final b getDirection() {
                return this.direction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof c)) {
                    return false;
                }
                c cVar = (c) other;
                return AbstractC22676k.m65745e(this.colors, cVar.colors) && Float.compare(this.circleAlpha, cVar.circleAlpha) == 0 && this.direction == cVar.direction && Float.compare(this.circleCenterYOffsetFraction, cVar.circleCenterYOffsetFraction) == 0;
            }

            public int hashCode() {
                return Float.hashCode(this.circleCenterYOffsetFraction) + ((this.direction.hashCode() + AbstractC11266d.m30447a(this.circleAlpha, this.colors.hashCode() * 31, 31)) * 31);
            }

            public String toString() {
                return "MultiGlowBottom(colors=" + this.colors + ", circleAlpha=" + this.circleAlpha + ", direction=" + this.direction + ", circleCenterYOffsetFraction=" + this.circleCenterYOffsetFraction + ")";
            }

            public /* synthetic */ c(List list, float f13, b bVar, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i13 & 2) != 0 ? 0.4f : f13, (i13 & 4) != 0 ? b.Normal : bVar, (i13 & 8) != 0 ? 0.12f : f14);
            }
        }

        /* JADX INFO: renamed from: lq2.p$a$b */
        @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010 R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010 R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b%\u0010 R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b&\u0010 R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b#\u0010(¨\u0006)"}, m65681d2 = {"Llq2/p$a$b;", "Llq2/p$a;", "", "Li2/x;", "topGlowColors", "", "circleAlpha", "linearStartXFraction", "linearStartYFraction", "linearEndXFraction", "linearEndYFraction", "circleCenterYOffsetFraction", "", "drawBaseDark", "<init>", "(Ljava/util/List;FFFFFFZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "i", "()Ljava/util/List;", "b", "F", "()F", "c", "g", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "f", "Z", "()Z", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final List<C17919x> topGlowColors;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final float circleAlpha;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final float linearStartXFraction;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final float linearStartYFraction;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final float linearEndXFraction;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final float linearEndYFraction;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final float circleCenterYOffsetFraction;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final boolean drawBaseDark;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List<C17919x> topGlowColors, float f13, float f14, float f15, float f16, float f17, float f18, boolean z4) {
                super(null);
                AbstractC22676k.m65750j(topGlowColors, "topGlowColors");
                this.topGlowColors = topGlowColors;
                this.circleAlpha = f13;
                this.linearStartXFraction = f14;
                this.linearStartYFraction = f15;
                this.linearEndXFraction = f16;
                this.linearEndYFraction = f17;
                this.circleCenterYOffsetFraction = f18;
                this.drawBaseDark = z4;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final float getCircleAlpha() {
                return this.circleAlpha;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final float getCircleCenterYOffsetFraction() {
                return this.circleCenterYOffsetFraction;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getDrawBaseDark() {
                return this.drawBaseDark;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final float getLinearEndXFraction() {
                return this.linearEndXFraction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return AbstractC22676k.m65745e(this.topGlowColors, bVar.topGlowColors) && Float.compare(this.circleAlpha, bVar.circleAlpha) == 0 && Float.compare(this.linearStartXFraction, bVar.linearStartXFraction) == 0 && Float.compare(this.linearStartYFraction, bVar.linearStartYFraction) == 0 && Float.compare(this.linearEndXFraction, bVar.linearEndXFraction) == 0 && Float.compare(this.linearEndYFraction, bVar.linearEndYFraction) == 0 && Float.compare(this.circleCenterYOffsetFraction, bVar.circleCenterYOffsetFraction) == 0 && this.drawBaseDark == bVar.drawBaseDark;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final float getLinearEndYFraction() {
                return this.linearEndYFraction;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final float getLinearStartXFraction() {
                return this.linearStartXFraction;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final float getLinearStartYFraction() {
                return this.linearStartYFraction;
            }

            public int hashCode() {
                return Boolean.hashCode(this.drawBaseDark) + AbstractC11266d.m30447a(this.circleCenterYOffsetFraction, AbstractC11266d.m30447a(this.linearEndYFraction, AbstractC11266d.m30447a(this.linearEndXFraction, AbstractC11266d.m30447a(this.linearStartYFraction, AbstractC11266d.m30447a(this.linearStartXFraction, AbstractC11266d.m30447a(this.circleAlpha, this.topGlowColors.hashCode() * 31, 31), 31), 31), 31), 31), 31);
            }

            /* JADX INFO: renamed from: i */
            public final List<C17919x> m72169i() {
                return this.topGlowColors;
            }

            public String toString() {
                List<C17919x> list = this.topGlowColors;
                float f13 = this.circleAlpha;
                float f14 = this.linearStartXFraction;
                float f15 = this.linearStartYFraction;
                float f16 = this.linearEndXFraction;
                float f17 = this.linearEndYFraction;
                float f18 = this.circleCenterYOffsetFraction;
                boolean z4 = this.drawBaseDark;
                StringBuilder sb4 = new StringBuilder("LandingDarkTopGlow(topGlowColors=");
                sb4.append(list);
                sb4.append(", circleAlpha=");
                sb4.append(f13);
                sb4.append(", linearStartXFraction=");
                AbstractC30802r.m94772u(sb4, f14, ", linearStartYFraction=", f15, ", linearEndXFraction=");
                AbstractC30802r.m94772u(sb4, f16, ", linearEndYFraction=", f17, ", circleCenterYOffsetFraction=");
                sb4.append(f18);
                sb4.append(", drawBaseDark=");
                sb4.append(z4);
                sb4.append(")");
                return sb4.toString();
            }

            public /* synthetic */ b(List list, float f13, float f14, float f15, float f16, float f17, float f18, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i13 & 2) != 0 ? 0.4f : f13, (i13 & 4) != 0 ? -0.0066f : f14, (i13 & 8) != 0 ? -0.1865f : f15, (i13 & 16) != 0 ? 1.0065f : f16, (i13 & 32) != 0 ? 0.2744f : f17, (i13 & 64) != 0 ? 0.0428f : f18, (i13 & 128) != 0 ? false : z4);
            }
        }
    }

    /* JADX INFO: renamed from: lq2.p$b */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Llq2/p$b;", "", "", "startX", "startY", "endX", "endY", "<init>", "(Ljava/lang/String;IFFFF)V", "F", "getStartX", "()F", "getStartY", "getEndX", "getEndY", "Normal", "Reversed", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        Normal(0.0f, 0.554f, 1.0f, 1.64f),
        Reversed(1.0f, 1.64f, 0.0f, 0.55f);

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        private final float endX;
        private final float endY;
        private final float startX;
        private final float startY;

        b(float f13, float f14, float f15, float f16) {
            this.startX = f13;
            this.startY = f14;
            this.endX = f15;
            this.endY = f16;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final float getEndX() {
            return this.endX;
        }

        public final float getEndY() {
            return this.endY;
        }

        public final float getStartX() {
            return this.startX;
        }

        public final float getStartY() {
            return this.startY;
        }
    }

    static {
        EnumC24674f enumC24674f = EnumC24674f.PRIMARY;
        AbstractC22815d.p pVar = new AbstractC22815d.p(enumC24674f);
        AbstractC22815d.q qVar = new AbstractC22815d.q(enumC24674f);
        EnumC24674f enumC24674f2 = EnumC24674f.SECONDARY;
        previewBackgrounds = AbstractC37056f.m118959K(pVar, qVar, new AbstractC22815d.o(enumC24674f2), new AbstractC22815d.a0(enumC24674f2), new AbstractC22815d.m(enumC24674f2), new AbstractC22815d.i(enumC24674f2), new AbstractC22815d.j(enumC24674f2), new AbstractC22815d.l(enumC24674f2), new AbstractC22815d.k(enumC24674f2), new AbstractC22815d.n(enumC24674f2), AbstractC22815d.d.f89842b, AbstractC22815d.h.f89849b, AbstractC22815d.g.f89848b, AbstractC22815d.c.f89840b, AbstractC22815d.b.f89838b, AbstractC22815d.f.f89846b, AbstractC22815d.e.f89844b, AbstractC22815d.a.f89836b, AbstractC22815d.w.f89864b, AbstractC22815d.v.f89863b, AbstractC22815d.y.f89866b, AbstractC22815d.z.f89867b, AbstractC22815d.u.f89862b, AbstractC22815d.x.f89865b, AbstractC22815d.b0.f89839b, AbstractC22815d.f0.f89847b, AbstractC22815d.d0.f89843b, AbstractC22815d.e0.f89845b, AbstractC22815d.c0.f89841b, new AbstractC22815d.s(enumC24674f2), new AbstractC22815d.r(enumC24674f2), new AbstractC22815d.t(enumC24674f2));
        f96553f = 8;
    }

    private C24684p() {
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC17911t m72139f(boolean isTop, float topY, float bottomY) {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        return isTop ? C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(fValueOf2, new C17919x(C17919x.f69629f)), new C23465k(fValueOf, new C17919x(C17919x.f69636m))}, topY, bottomY, 8) : C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(fValueOf2, new C17919x(C17919x.f69636m)), new C23465k(fValueOf, new C17919x(C17919x.f69629f))}, topY, bottomY, 8);
    }

    /* JADX INFO: renamed from: g */
    private final AbstractC17911t m72140g(long center, float radius) {
        C17909s c17909s = AbstractC17911t.f69612b;
        Float fValueOf = Float.valueOf(0.0f);
        long j7 = C17919x.f69629f;
        C23465k c23465k = new C23465k(fValueOf, new C17919x(j7));
        C23465k c23465k2 = new C23465k(Float.valueOf(0.9f), new C17919x(j7));
        C23465k c23465k3 = new C23465k(Float.valueOf(0.999f), new C17919x(C17919x.m51541c(0.5f, j7)));
        Float fValueOf2 = Float.valueOf(1.0f);
        long j13 = C17919x.f69636m;
        return C17909s.m51490h(c17909s, new C23465k[]{c23465k, c23465k2, c23465k3, new C23465k(fValueOf2, new C17919x(j13)), new C23465k(fValueOf2, new C17919x(j13))}, center, radius, 8);
    }

    /* JADX INFO: renamed from: h */
    private final AbstractC17911t m72141h(long center, float radius, long color, float alpha) {
        return C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C17919x.m51541c(alpha, color))), center, radius, 8);
    }

    /* JADX INFO: renamed from: i */
    private final float m72142i(float v13) {
        return AbstractC12889b.m36283m(v13, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: j */
    private final AbstractC17911t m72143j(List<C17919x> colors) {
        return colors.size() < 2 ? new C17875c1(((C17919x) AbstractC25265s.m74096F0(colors)).f69639a) : C17909s.m51483a(AbstractC17911t.f69612b, colors, 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: k */
    private final AbstractC17911t m72144k(List<C17919x> colors, long start, long end) {
        return colors.size() < 2 ? new C17875c1(((C17919x) AbstractC25265s.m74096F0(colors)).f69639a) : C17909s.m51486d(AbstractC17911t.f69612b, colors, start, end, 8);
    }

    /* JADX INFO: renamed from: l */
    private final float m72145l(long j7) {
        return Math.max(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
    }

    /* JADX INFO: renamed from: m */
    private final float m72146m(long j7) {
        return Math.min(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
    }

    /* JADX INFO: renamed from: n */
    private final Modifier m72147n(a preset) {
        boolean z4 = preset instanceof a.d;
        C2314t c2314t = C2314t.f9131w;
        if (z4) {
            a.d dVar = (a.d) preset;
            return m72150r(this, c2314t, EnumC24674f.SECONDARY, AbstractC37056f.m118958J(new C17919x(C17919x.m51541c(dVar.getAlpha(), dVar.getColor()))), 1.0f, dVar.getRadiusFraction(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, 0L, dVar.getVignetteStrength(), false, 24560, null);
        }
        if (preset instanceof a.c) {
            a.c cVar = (a.c) preset;
            return m72150r(this, c2314t, EnumC24674f.SECONDARY, cVar.m72172d(), cVar.getCircleAlpha(), 0.0f, cVar.getCircleCenterYOffsetFraction(), cVar.getDirection().getStartX(), cVar.getDirection().getStartY(), cVar.getDirection().getEndX(), cVar.getDirection().getEndY(), 0.0f, 0.0f, 0L, 0L, 0.0f, false, 32264, null);
        }
        if (preset instanceof a.C41970a) {
            return AbstractC1125a.m3479b(c2314t, new C23821c((a.C41970a) preset, 6));
        }
        if (!(preset instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) preset;
        return m72150r(this, AbstractC1092a.m3357b(c2314t, C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(LANDING_DARK_START)), new C23465k(Float.valueOf(0.341139f), new C17919x(LANDING_DARK_MID)), new C23465k(Float.valueOf(1.0f), new C17919x(LANDING_DARK_END))}, 0.0f, 0.0f, 14), null, 0.0f, 6), EnumC24674f.PRIMARY, bVar.m72169i(), bVar.getCircleAlpha(), 0.0f, bVar.getCircleCenterYOffsetFraction(), bVar.getLinearStartXFraction(), bVar.getLinearStartYFraction(), bVar.getLinearEndXFraction(), bVar.getLinearEndYFraction(), 0.0f, 0.0f, 0L, 0L, 0.0f, bVar.getDrawBaseDark(), 15880, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C14018g m72148o(a aVar, C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        C17909s c17909s = AbstractC17911t.f69612b;
        a.C41970a c41970a = (a.C41970a) aVar;
        List listM118959K = AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(c41970a.getStartAlpha(), c41970a.getStart())), new C17919x(C17919x.m51541c(c41970a.getEndAlpha(), c41970a.getEnd())));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() >> 32));
        return drawWithCache.m39910a(new C0006a1(new C24656d(2, C17909s.m51486d(c17909s, listM118959K, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), 8), C17909s.m51494l(c17909s, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m)), new C23465k(Float.valueOf(1.0f), new C17919x(c41970a.getBottomDark()))}, c41970a.getBottomDarkStartFraction() * Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & 4294967295L)), Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & 4294967295L)), 8)), 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m72149p(AbstractC17911t abstractC17911t, AbstractC17911t abstractC17911t2, InterfaceC22131e onDrawBehind) {
        AbstractC22676k.m65750j(onDrawBehind, "$this$onDrawBehind");
        InterfaceC22131e.m63385u(onDrawBehind, abstractC17911t, 0L, 0L, 0.0f, null, 0, 126);
        InterfaceC22131e.m63385u(onDrawBehind, abstractC17911t2, 0L, 0L, 0.0f, null, 0, 126);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static Modifier m72150r(C24684p c24684p, Modifier modifier, EnumC24674f enumC24674f, List list, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f24, float f25, long j7, long j13, float f26, boolean z4, int i13, Object obj) {
        long j14;
        float f27 = (i13 & 4) != 0 ? 0.8f : f13;
        float f28 = (i13 & 8) != 0 ? 1.15f : f14;
        float f29 = (i13 & 16) != 0 ? 0.0f : f15;
        float f34 = (i13 & 32) != 0 ? 0.0f : f16;
        float f35 = (i13 & 64) != 0 ? 0.0f : f17;
        float f36 = (i13 & 128) != 0 ? 1.0f : f18;
        float f37 = (i13 & 256) != 0 ? 1.0f : f19;
        float f38 = (i13 & 512) != 0 ? 0.5f : f24;
        float f39 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0.25f : f25;
        long jM51517e = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? AbstractC17918w0.m51517e(4278585358L) : j7;
        if ((i13 & 4096) != 0) {
            int i14 = C17919x.f69638o;
            j14 = C17919x.f69625b;
        } else {
            j14 = j13;
        }
        return c24684p.m72154q(modifier, enumC24674f, list, f27, f28, f29, f34, f35, f36, f37, f38, f39, jM51517e, j14, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? 0.45f : f26, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? true : z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C14018g m72151s(EnumC24674f enumC24674f, List list, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j7, float f24, long j13, float f25, float f26, final boolean z4, C14015d drawWithCache) {
        long j14;
        float fIntBitsToFloat;
        C17909s c17909s;
        C17894k0 c17894k0M51487e;
        Float fValueOf = Float.valueOf(0.9f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Float fValueOf3 = Float.valueOf(0.0f);
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        boolean z13 = enumC24674f == EnumC24674f.PRIMARY;
        List listM118958J = list;
        if (listM118958J.isEmpty()) {
            listM118958J = AbstractC37056f.m118958J(new C17919x(C17919x.f69636m));
        }
        List list2 = listM118958J;
        if (z13) {
            j14 = 4294967295L;
            fIntBitsToFloat = AbstractC12889b.m36283m(f13, -1.0f, 1.0f) * Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & 4294967295L));
        } else {
            j14 = 4294967295L;
            fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & 4294967295L)) - (AbstractC12889b.m36283m(f13, -1.0f, 1.0f) * Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & 4294967295L)));
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j14) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() >> 32)) / 2.0f)) << 32);
        C24684p c24684p = f96548a;
        float fM36283m = AbstractC12889b.m36283m(f14, 0.1f, 2.0f) * c24684p.m72146m(drawWithCache.f50036w.mo468d());
        float fIntBitsToFloat2 = z13 ? fM36283m : Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & j14)) - fM36283m;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & j14)) * c24684p.m72142i(f15);
        float fMin = z13 ? fIntBitsToFloat2 : Math.min(fIntBitsToFloat2, fIntBitsToFloat3);
        if (z13) {
            fIntBitsToFloat2 = Math.max(fIntBitsToFloat2, fIntBitsToFloat3);
        }
        List list3 = list2;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        for (Iterator it = list3.iterator(); it.hasNext(); it = it) {
            long j15 = ((C17919x) it.next()).f69639a;
            C24684p c24684p2 = f96548a;
            arrayList.add(new C17919x(C17919x.m51541c(c24684p2.m72142i(C17919x.m51543e(j15) * c24684p2.m72142i(f25) * f26), j15)));
        }
        C24684p c24684p3 = f96548a;
        final AbstractC17911t abstractC17911tM72143j = c24684p3.m72143j(arrayList);
        final AbstractC17911t abstractC17911tM72139f = c24684p3.m72139f(z13, fMin, fIntBitsToFloat2);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            long j16 = ((C17919x) it3.next()).f69639a;
            arrayList2.add(new C17919x(C17919x.m51541c(f96548a.m72142i(C17919x.m51543e(j16) * f26), j16)));
            fMin = fMin;
        }
        final float f27 = fMin;
        C24684p c24684p4 = f96548a;
        final AbstractC17911t abstractC17911tM72144k = c24684p4.m72144k(arrayList2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() >> 32)) * f16)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & j14)) * f17)) & j14), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() >> 32)) * f18)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & j14)) * f19)) & j14));
        final AbstractC17911t abstractC17911tM72140g = c24684p4.m72140g(jFloatToRawIntBits, fM36283m);
        C17909s c17909s2 = AbstractC17911t.f69612b;
        long j17 = C17919x.f69625b;
        C23465k c23465k = new C23465k(fValueOf3, new C17919x(C17919x.m51541c(0.35f, j17)));
        Float fValueOf4 = Float.valueOf(0.5f);
        long j18 = C17919x.f69636m;
        final C17894k0 c17894k0M51484b = C17909s.m51484b(c17909s2, new C23465k[]{c23465k, new C23465k(fValueOf4, new C17919x(j18)), new C23465k(fValueOf2, new C17919x(C17919x.m51541c(0.35f, j17)))});
        final AbstractC17911t abstractC17911tM72141h = c24684p4.m72141h(jFloatToRawIntBits, c24684p4.m72145l(drawWithCache.f50036w.mo468d()) * (z13 ? 1.5f : 1.2f), j7, c24684p4.m72142i(f24));
        float fM72146m = c24684p4.m72146m(drawWithCache.f50036w.mo468d()) * 0.9f;
        float fIntBitsToFloat4 = z13 ? 0.0f : Float.intBitsToFloat((int) (jFloatToRawIntBits & j14)) - fM72146m;
        if (!z13) {
            fM72146m = Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & j14));
        }
        float f28 = fM72146m - fIntBitsToFloat4;
        float fM36283m2 = AbstractC12889b.m36283m((((AbstractC12889b.m36283m(0.16f, 0.0f, 0.9f) * f28) + fIntBitsToFloat4) - fIntBitsToFloat4) / f28, 0.0f, 1.0f);
        float f29 = 1.0f - fM36283m2;
        float f34 = (0.33f * f29) + fM36283m2;
        float f35 = (f29 * 0.66f) + fM36283m2;
        if (z13) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & j14);
            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fM72146m)) & j14);
            long j19 = C17919x.f69629f;
            c17894k0M51487e = C17909s.m51487e(c17909s2, new C23465k[]{new C23465k(fValueOf3, new C17919x(j19)), new C23465k(Float.valueOf(AbstractC12889b.m36283m(fM36283m2 * 0.5f, 0.0f, 1.0f)), new C17919x(j19)), new C23465k(Float.valueOf(f34), new C17919x(C17919x.m51541c(0.8f, j19))), new C23465k(Float.valueOf(f35), new C17919x(C17919x.m51541c(0.45f, j19))), new C23465k(fValueOf, new C17919x(C17919x.m51541c(0.2f, j19))), new C23465k(fValueOf2, new C17919x(j18))}, jFloatToRawIntBits2, jFloatToRawIntBits3, 8);
            c17909s = c17909s2;
        } else {
            c17909s = c17909s2;
            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & j14);
            long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fM72146m)) & j14);
            C23465k c23465k2 = new C23465k(fValueOf3, new C17919x(j18));
            C23465k c23465k3 = new C23465k(Float.valueOf(AbstractC12889b.m36283m(fM36283m2 * 0.5f, 0.0f, 1.0f)), new C17919x(j18));
            Float fValueOf5 = Float.valueOf(f34);
            long j24 = C17919x.f69629f;
            c17894k0M51487e = C17909s.m51487e(c17909s, new C23465k[]{c23465k2, c23465k3, new C23465k(fValueOf5, new C17919x(C17919x.m51541c(0.2f, j24))), new C23465k(Float.valueOf(f35), new C17919x(C17919x.m51541c(0.45f, j24))), new C23465k(fValueOf, new C17919x(C17919x.m51541c(0.8f, j24))), new C23465k(fValueOf2, new C17919x(j24))}, jFloatToRawIntBits4, jFloatToRawIntBits5, 8);
        }
        C17894k0 c17894k0M51494l = z13 ? C17909s.m51494l(c17909s, new C23465k[]{new C23465k(fValueOf2, new C17919x(j13)), new C23465k(Float.valueOf(0.6f), new C17919x(C17919x.m51541c(0.0f, j13)))}, 0.0f, 0.0f, 14) : C17909s.m51494l(c17909s, new C23465k[]{new C23465k(fValueOf3, new C17919x(j13)), new C23465k(Float.valueOf(0.7f), new C17919x(C17919x.m51541c(0.0f, j13)))}, 0.0f, 0.0f, 14);
        final C17894k0 c17894k0 = c17894k0M51487e;
        final C17894k0 c17894k1 = c17894k0M51494l;
        final float f36 = fIntBitsToFloat2;
        return drawWithCache.m39910a(new C0006a1(new Function1() { // from class: lq2.n
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C24684p.m72152t(z4, c17894k1, f36, f27, abstractC17911tM72143j, abstractC17911tM72139f, abstractC17911tM72144k, abstractC17911tM72140g, c17894k0, c17894k0M51484b, abstractC17911tM72141h, (InterfaceC22131e) obj);
            }
        }, 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m72152t(boolean z4, AbstractC17911t abstractC17911t, float f13, float f14, AbstractC17911t abstractC17911t2, AbstractC17911t abstractC17911t3, AbstractC17911t abstractC17911t4, AbstractC17911t abstractC17911t5, AbstractC17911t abstractC17911t6, AbstractC17911t abstractC17911t7, AbstractC17911t abstractC17911t8, InterfaceC22131e onDrawBehind) {
        AbstractC22676k.m65750j(onDrawBehind, "$this$onDrawBehind");
        if (z4) {
            InterfaceC22131e.m63385u(onDrawBehind, C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4279244056L)), new C17919x(AbstractC17918w0.m51517e(4279244056L))), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (onDrawBehind.mo731d() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (onDrawBehind.mo731d() & 4294967295L)) / 2.0f)) & 4294967295L), f96548a.m72145l(onDrawBehind.mo731d()) * 1.2f, 8), 0L, 0L, 0.0f, null, 0, 126);
            InterfaceC22131e.m63385u(onDrawBehind, abstractC17911t, 0L, 0L, 0.0f, null, 0, 126);
        }
        C16618c c16618c = f13 > f14 ? new C16618c(0.0f, f14, Float.intBitsToFloat((int) (onDrawBehind.mo731d() >> 32)), f13) : C16618c.f63938e;
        if (!c16618c.m47203i()) {
            onDrawBehind.mo744t0().m716w().mo51425p(c16618c, AbstractC17918w0.m51522j());
            InterfaceC22131e.m63385u(onDrawBehind, abstractC17911t2, 0L, 0L, 0.0f, null, 0, 126);
            InterfaceC22131e.m63385u(onDrawBehind, abstractC17911t3, 0L, 0L, 0.0f, null, 6, 62);
            onDrawBehind.mo744t0().m716w().mo51417g();
        }
        onDrawBehind.mo744t0().m716w().mo51425p(new C16618c(0.0f, 0.0f, Float.intBitsToFloat((int) (onDrawBehind.mo731d() >> 32)), Float.intBitsToFloat((int) (onDrawBehind.mo731d() & 4294967295L))), AbstractC17918w0.m51522j());
        InterfaceC22131e.m63385u(onDrawBehind, abstractC17911t4, 0L, 0L, 0.0f, null, 0, 126);
        InterfaceC22131e.m63385u(onDrawBehind, abstractC17911t5, 0L, 0L, 0.0f, null, 6, 62);
        InterfaceC22131e.m63385u(onDrawBehind, abstractC17911t6, 0L, 0L, 0.0f, null, 6, 62);
        InterfaceC22131e.m63385u(onDrawBehind, abstractC17911t7, 0L, 0L, 0.0f, null, 24, 62);
        onDrawBehind.mo744t0().m716w().mo51417g();
        InterfaceC22131e.m63385u(onDrawBehind, abstractC17911t8, 0L, 0L, 0.0f, null, 0, 126);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public final Modifier m72153e(AbstractC22815d type) {
        AbstractC22676k.m65750j(type, "type");
        return m72147n(type.mo66100a());
    }

    /* JADX INFO: renamed from: q */
    public final Modifier m72154q(Modifier userJourneyCircularGlow, final EnumC24674f option, final List<C17919x> colors, final float f13, final float f14, final float f15, final float f16, final float f17, final float f18, final float f19, final float f24, final float f25, final long j7, final long j13, final float f26, final boolean z4) {
        AbstractC22676k.m65750j(userJourneyCircularGlow, "$this$userJourneyCircularGlow");
        AbstractC22676k.m65750j(option, "option");
        AbstractC22676k.m65750j(colors, "colors");
        return userJourneyCircularGlow.mo3471e(AbstractC1125a.m3479b(C2314t.f9131w, new Function1() { // from class: lq2.o
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C24684p.m72151s(option, colors, f15, f14, f24, f16, f17, f18, f19, j13, f26, j7, f25, f13, z4, (C14015d) obj);
            }
        }));
    }
}
