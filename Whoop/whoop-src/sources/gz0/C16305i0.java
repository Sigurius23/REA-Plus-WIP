package gz0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.C22396h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.i0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0002\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0003\u0010 \u001a\u00020\u0002\u0012\b\b\u0003\u0010!\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020#0\"¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b2\u0010+R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b3\u0010+R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b4\u0010+R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b5\u0010+R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b6\u0010+R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b7\u0010+R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b8\u0010+R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b9\u0010+R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b:\u0010+R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b;\u0010+R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b<\u0010+R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b=\u0010+R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b>\u0010+R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u00101\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010+R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u00101\u001a\u0004\b?\u0010+R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u00101\u001a\u0004\bC\u0010+R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u00101\u001a\u0004\bD\u0010+R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u00101\u0012\u0004\bH\u0010B\u001a\u0004\bG\u0010+R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\bJ\u0010+R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u00101\u001a\u0004\bF\u0010+R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u00101\u001a\u0004\bE\u0010+R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u00101\u001a\u0004\bI\u0010+R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u00101\u001a\u0004\bK\u0010+R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u00101\u001a\u0004\bL\u0010+R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u00101\u001a\u0004\bM\u0010+R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u00101\u001a\u0004\bN\u0010+R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u00101\u001a\u0004\bO\u0010+R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u00101\u001a\u0004\bP\u0010+R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u00101\u001a\u0004\bQ\u0010+R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u00101\u001a\u0004\bR\u0010+R#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020#0\"8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y¨\u0006Z"}, m65681d2 = {"Lgz0/i0;", "", "", "attention", "attentionOrange", "attentionRed", "attentionWhite", "backwardArrow", "barGraph", "bluetooth", "borderedCheckmark", "checkmark", "chip", "cross", "downArrow", "ellipse", "forwardArrow", "leftArrow", "pill", "play", "refresh", "rightArrow", "tinyAttention", "tinyCollapse", "tinyCharging", "tinyExpand", "tinyHeartRate", "tinyHelp", "tinyInformation", "tinySleep", "tinyStrap", "triangleDown", "triangleUp", "upArrow", "", "Lkd1/h;", "descriptions", "<init>", "(IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "e", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "j", "k", "l", "m", "n", "o", "getLeftArrow", "getLeftArrow$annotations", "()V", "p", "q", "r", "s", "getRightArrow", "getRightArrow$annotations", "t", "getTinyAttention", "u", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "z", "A", "B", "C", "D", "E", "F", "Ljava/util/List;", "getDescriptions", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16305i0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int tinySleep;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int tinyStrap;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final int triangleDown;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final int triangleUp;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final int upArrow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final List<C22396h<Integer>> descriptions;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int attention;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int attentionOrange;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int attentionRed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int attentionWhite;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int backwardArrow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int barGraph;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int bluetooth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int borderedCheckmark;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int checkmark;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int chip;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int cross;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int downArrow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int ellipse;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int forwardArrow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int leftArrow;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int pill;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int play;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int refresh;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int rightArrow;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int tinyAttention;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int tinyCollapse;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int tinyCharging;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int tinyExpand;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int tinyHeartRate;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int tinyHelp;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int tinyInformation;

    public C16305i0(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34, int i35, int i36, int i37, int i38, int i39, int i44, int i45, int i46, int i47, int i48, int i49, int i54, int i55, int i56, int i57, int i58, int i59, List<C22396h<Integer>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.attention = i13;
        this.attentionOrange = i14;
        this.attentionRed = i15;
        this.attentionWhite = i16;
        this.backwardArrow = i17;
        this.barGraph = i18;
        this.bluetooth = i19;
        this.borderedCheckmark = i24;
        this.checkmark = i25;
        this.chip = i26;
        this.cross = i27;
        this.downArrow = i28;
        this.ellipse = i29;
        this.forwardArrow = i34;
        this.leftArrow = i35;
        this.pill = i36;
        this.play = i37;
        this.refresh = i38;
        this.rightArrow = i39;
        this.tinyAttention = i44;
        this.tinyCollapse = i45;
        this.tinyCharging = i46;
        this.tinyExpand = i47;
        this.tinyHeartRate = i48;
        this.tinyHelp = i49;
        this.tinyInformation = i54;
        this.tinySleep = i55;
        this.tinyStrap = i56;
        this.triangleDown = i57;
        this.triangleUp = i58;
        this.upArrow = i59;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final int getTriangleUp() {
        return this.triangleUp;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final int getUpArrow() {
        return this.upArrow;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAttention() {
        return this.attention;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAttentionOrange() {
        return this.attentionOrange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAttentionRed() {
        return this.attentionRed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAttentionWhite() {
        return this.attentionWhite;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getBackwardArrow() {
        return this.backwardArrow;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16305i0)) {
            return false;
        }
        C16305i0 c16305i0 = (C16305i0) other;
        return this.attention == c16305i0.attention && this.attentionOrange == c16305i0.attentionOrange && this.attentionRed == c16305i0.attentionRed && this.attentionWhite == c16305i0.attentionWhite && this.backwardArrow == c16305i0.backwardArrow && this.barGraph == c16305i0.barGraph && this.bluetooth == c16305i0.bluetooth && this.borderedCheckmark == c16305i0.borderedCheckmark && this.checkmark == c16305i0.checkmark && this.chip == c16305i0.chip && this.cross == c16305i0.cross && this.downArrow == c16305i0.downArrow && this.ellipse == c16305i0.ellipse && this.forwardArrow == c16305i0.forwardArrow && this.leftArrow == c16305i0.leftArrow && this.pill == c16305i0.pill && this.play == c16305i0.play && this.refresh == c16305i0.refresh && this.rightArrow == c16305i0.rightArrow && this.tinyAttention == c16305i0.tinyAttention && this.tinyCollapse == c16305i0.tinyCollapse && this.tinyCharging == c16305i0.tinyCharging && this.tinyExpand == c16305i0.tinyExpand && this.tinyHeartRate == c16305i0.tinyHeartRate && this.tinyHelp == c16305i0.tinyHelp && this.tinyInformation == c16305i0.tinyInformation && this.tinySleep == c16305i0.tinySleep && this.tinyStrap == c16305i0.tinyStrap && this.triangleDown == c16305i0.triangleDown && this.triangleUp == c16305i0.triangleUp && this.upArrow == c16305i0.upArrow && AbstractC22676k.m65745e(this.descriptions, c16305i0.descriptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getBarGraph() {
        return this.barGraph;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getBluetooth() {
        return this.bluetooth;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getBorderedCheckmark() {
        return this.borderedCheckmark;
    }

    public int hashCode() {
        return this.descriptions.hashCode() + AbstractC11266d.m30448b(this.upArrow, AbstractC11266d.m30448b(this.triangleUp, AbstractC11266d.m30448b(this.triangleDown, AbstractC11266d.m30448b(this.tinyStrap, AbstractC11266d.m30448b(this.tinySleep, AbstractC11266d.m30448b(this.tinyInformation, AbstractC11266d.m30448b(this.tinyHelp, AbstractC11266d.m30448b(this.tinyHeartRate, AbstractC11266d.m30448b(this.tinyExpand, AbstractC11266d.m30448b(this.tinyCharging, AbstractC11266d.m30448b(this.tinyCollapse, AbstractC11266d.m30448b(this.tinyAttention, AbstractC11266d.m30448b(this.rightArrow, AbstractC11266d.m30448b(this.refresh, AbstractC11266d.m30448b(this.play, AbstractC11266d.m30448b(this.pill, AbstractC11266d.m30448b(this.leftArrow, AbstractC11266d.m30448b(this.forwardArrow, AbstractC11266d.m30448b(this.ellipse, AbstractC11266d.m30448b(this.downArrow, AbstractC11266d.m30448b(this.cross, AbstractC11266d.m30448b(this.chip, AbstractC11266d.m30448b(this.checkmark, AbstractC11266d.m30448b(this.borderedCheckmark, AbstractC11266d.m30448b(this.bluetooth, AbstractC11266d.m30448b(this.barGraph, AbstractC11266d.m30448b(this.backwardArrow, AbstractC11266d.m30448b(this.attentionWhite, AbstractC11266d.m30448b(this.attentionRed, AbstractC11266d.m30448b(this.attentionOrange, Integer.hashCode(this.attention) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getCheckmark() {
        return this.checkmark;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getChip() {
        return this.chip;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getCross() {
        return this.cross;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getDownArrow() {
        return this.downArrow;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getEllipse() {
        return this.ellipse;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getForwardArrow() {
        return this.forwardArrow;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getPill() {
        return this.pill;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getPlay() {
        return this.play;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getRefresh() {
        return this.refresh;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getTinyCharging() {
        return this.tinyCharging;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getTinyCollapse() {
        return this.tinyCollapse;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getTinyExpand() {
        return this.tinyExpand;
    }

    public String toString() {
        int i13 = this.attention;
        int i14 = this.attentionOrange;
        int i15 = this.attentionRed;
        int i16 = this.attentionWhite;
        int i17 = this.backwardArrow;
        int i18 = this.barGraph;
        int i19 = this.bluetooth;
        int i24 = this.borderedCheckmark;
        int i25 = this.checkmark;
        int i26 = this.chip;
        int i27 = this.cross;
        int i28 = this.downArrow;
        int i29 = this.ellipse;
        int i34 = this.forwardArrow;
        int i35 = this.leftArrow;
        int i36 = this.pill;
        int i37 = this.play;
        int i38 = this.refresh;
        int i39 = this.rightArrow;
        int i44 = this.tinyAttention;
        int i45 = this.tinyCollapse;
        int i46 = this.tinyCharging;
        int i47 = this.tinyExpand;
        int i48 = this.tinyHeartRate;
        int i49 = this.tinyHelp;
        int i54 = this.tinyInformation;
        int i55 = this.tinySleep;
        int i56 = this.tinyStrap;
        int i57 = this.triangleDown;
        int i58 = this.triangleUp;
        int i59 = this.upArrow;
        List<C22396h<Integer>> list = this.descriptions;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "TinyIcons(attention=", ", attentionOrange=", ", attentionRed=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", attentionWhite=", i16, ", backwardArrow=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", barGraph=", i18, ", bluetooth=");
        AbstractC30802r.m94773v(sbM30465s, i19, ", borderedCheckmark=", i24, ", checkmark=");
        AbstractC30802r.m94773v(sbM30465s, i25, ", chip=", i26, ", cross=");
        AbstractC30802r.m94773v(sbM30465s, i27, ", downArrow=", i28, ", ellipse=");
        AbstractC30802r.m94773v(sbM30465s, i29, ", forwardArrow=", i34, ", leftArrow=");
        AbstractC30802r.m94773v(sbM30465s, i35, ", pill=", i36, ", play=");
        AbstractC30802r.m94773v(sbM30465s, i37, ", refresh=", i38, ", rightArrow=");
        AbstractC30802r.m94773v(sbM30465s, i39, ", tinyAttention=", i44, ", tinyCollapse=");
        AbstractC30802r.m94773v(sbM30465s, i45, ", tinyCharging=", i46, ", tinyExpand=");
        AbstractC30802r.m94773v(sbM30465s, i47, ", tinyHeartRate=", i48, ", tinyHelp=");
        AbstractC30802r.m94773v(sbM30465s, i49, ", tinyInformation=", i54, ", tinySleep=");
        AbstractC30802r.m94773v(sbM30465s, i55, ", tinyStrap=", i56, ", triangleDown=");
        AbstractC30802r.m94773v(sbM30465s, i57, ", triangleUp=", i58, ", upArrow=");
        sbM30465s.append(i59);
        sbM30465s.append(", descriptions=");
        sbM30465s.append(list);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getTinyHeartRate() {
        return this.tinyHeartRate;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getTinyHelp() {
        return this.tinyHelp;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final int getTinyInformation() {
        return this.tinyInformation;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getTinySleep() {
        return this.tinySleep;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getTinyStrap() {
        return this.tinyStrap;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final int getTriangleDown() {
        return this.triangleDown;
    }
}
