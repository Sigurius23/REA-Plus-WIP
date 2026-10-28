package b91;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.C22396h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: b91.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020.0-¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010?R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010=\u001a\u0004\bG\u0010?R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010=\u001a\u0004\bI\u0010?R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010=\u001a\u0004\bK\u0010?R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010=\u001a\u0004\bM\u0010?R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010=\u001a\u0004\bO\u0010?R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010=\u001a\u0004\bQ\u0010?R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010=\u001a\u0004\bS\u0010?R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010=\u001a\u0004\bU\u0010?R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010=\u001a\u0004\bW\u0010?R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010=\u001a\u0004\b<\u0010?R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\b@\u0010?R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010?R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010=\u001a\u0004\bF\u0010?R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010=\u001a\u0004\bN\u0010?R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010=\u001a\u0004\bP\u0010?R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010=\u001a\u0004\bR\u0010?R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010=\u001a\u0004\bH\u0010?R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u0010=\u001a\u0004\bJ\u0010?R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010=\u001a\u0004\bL\u0010?R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010=\u001a\u0004\bY\u0010?R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010=\u001a\u0004\b[\u0010?R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u0010=\u001a\u0004\b\\\u0010?R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010=\u001a\u0004\b]\u0010?R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u0010=\u001a\u0004\b^\u0010?R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010=\u001a\u0004\b_\u0010?R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010=\u001a\u0004\b`\u0010?R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010=\u001a\u0004\ba\u0010?R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010=\u001a\u0004\bb\u0010?R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010=\u001a\u0004\bc\u0010?R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010=\u001a\u0004\bd\u0010?R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010=\u001a\u0004\bZ\u0010?R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010=\u001a\u0004\bV\u0010?R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010=\u001a\u0004\bX\u0010?R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010=\u001a\u0004\be\u0010?R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\be\u0010=\u001a\u0004\bf\u0010?R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u0010=\u001a\u0004\bg\u0010?R\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bg\u0010=\u001a\u0004\bh\u0010?R#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020.0-8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bT\u0010j¨\u0006k"}, m65681d2 = {"Lb91/d;", "", "Lb91/a;", "h1", "h2", "h3", "h4", "h5", "h6", "sh1", "sh2", "sh3", "sh4", "sh5", "p1", "p2", "b1", "b2", "b3", "b4", "b5", "btL", "btM", "btS", "bnL", "bnM", "bnS", "n1", "n2", "n3", "n4", "n45", "n5", "n55", "n6", "n7", "n8", "n9", "n10", "formLabel", "formLabelMedium", "t1", "t2", "t3", "t4", "", "Lkd1/h;", "descriptions", "<init>", "(Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb91/a;", "o", "()Lb91/a;", "b", "p", "c", "q", "d", "r", "e", "s", "f", "t", "g", "I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "J", "i", "K", "j", "L", "k", "M", "l", "G", "m", "H", "n", "u", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "z", "A", "B", "C", "D", "E", "F", "N", "O", "P", "Q", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2889d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final C2886a n3;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final C2886a n4;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final C2886a n45;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final C2886a n5;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C2886a n55;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C2886a n6;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C2886a n7;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C2886a n8;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C2886a n9;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C2886a n10;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C2886a formLabel;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final C2886a formLabelMedium;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final C2886a t1;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final C2886a t2;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final C2886a t3;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final C2886a t4;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final List<C22396h<C2886a>> descriptions;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C2886a h1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C2886a h2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C2886a h3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C2886a h4;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C2886a h5;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C2886a h6;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C2886a sh1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C2886a sh2;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C2886a sh3;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C2886a sh4;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C2886a sh5;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C2886a p1;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C2886a p2;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C2886a b1;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C2886a b2;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C2886a b3;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C2886a b4;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C2886a b5;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C2886a btL;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C2886a btM;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final C2886a btS;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final C2886a bnL;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C2886a bnM;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C2886a bnS;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C2886a n1;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C2886a n2;

    public C2889d(C2886a h1, C2886a h7, C2886a h13, C2886a h14, C2886a h15, C2886a h16, C2886a sh3, C2886a sh4, C2886a sh5, C2886a sh6, C2886a sh7, C2886a p13, C2886a p14, C2886a b6, C2886a b8, C2886a b14, C2886a b15, C2886a b16, C2886a btL, C2886a btM, C2886a btS, C2886a bnL, C2886a bnM, C2886a bnS, C2886a n13, C2886a n14, C2886a n15, C2886a n16, C2886a n45, C2886a n17, C2886a n55, C2886a n18, C2886a n19, C2886a n24, C2886a n25, C2886a n110, C2886a formLabel, C2886a formLabelMedium, C2886a t14, C2886a t15, C2886a t16, C2886a t17, List<C22396h<C2886a>> descriptions) {
        AbstractC22676k.m65750j(h1, "h1");
        AbstractC22676k.m65750j(h7, "h2");
        AbstractC22676k.m65750j(h13, "h3");
        AbstractC22676k.m65750j(h14, "h4");
        AbstractC22676k.m65750j(h15, "h5");
        AbstractC22676k.m65750j(h16, "h6");
        AbstractC22676k.m65750j(sh3, "sh1");
        AbstractC22676k.m65750j(sh4, "sh2");
        AbstractC22676k.m65750j(sh5, "sh3");
        AbstractC22676k.m65750j(sh6, "sh4");
        AbstractC22676k.m65750j(sh7, "sh5");
        AbstractC22676k.m65750j(p13, "p1");
        AbstractC22676k.m65750j(p14, "p2");
        AbstractC22676k.m65750j(b6, "b1");
        AbstractC22676k.m65750j(b8, "b2");
        AbstractC22676k.m65750j(b14, "b3");
        AbstractC22676k.m65750j(b15, "b4");
        AbstractC22676k.m65750j(b16, "b5");
        AbstractC22676k.m65750j(btL, "btL");
        AbstractC22676k.m65750j(btM, "btM");
        AbstractC22676k.m65750j(btS, "btS");
        AbstractC22676k.m65750j(bnL, "bnL");
        AbstractC22676k.m65750j(bnM, "bnM");
        AbstractC22676k.m65750j(bnS, "bnS");
        AbstractC22676k.m65750j(n13, "n1");
        AbstractC22676k.m65750j(n14, "n2");
        AbstractC22676k.m65750j(n15, "n3");
        AbstractC22676k.m65750j(n16, "n4");
        AbstractC22676k.m65750j(n45, "n45");
        AbstractC22676k.m65750j(n17, "n5");
        AbstractC22676k.m65750j(n55, "n55");
        AbstractC22676k.m65750j(n18, "n6");
        AbstractC22676k.m65750j(n19, "n7");
        AbstractC22676k.m65750j(n24, "n8");
        AbstractC22676k.m65750j(n25, "n9");
        AbstractC22676k.m65750j(n110, "n10");
        AbstractC22676k.m65750j(formLabel, "formLabel");
        AbstractC22676k.m65750j(formLabelMedium, "formLabelMedium");
        AbstractC22676k.m65750j(t14, "t1");
        AbstractC22676k.m65750j(t15, "t2");
        AbstractC22676k.m65750j(t16, "t3");
        AbstractC22676k.m65750j(t17, "t4");
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.h1 = h1;
        this.h2 = h7;
        this.h3 = h13;
        this.h4 = h14;
        this.h5 = h15;
        this.h6 = h16;
        this.sh1 = sh3;
        this.sh2 = sh4;
        this.sh3 = sh5;
        this.sh4 = sh6;
        this.sh5 = sh7;
        this.p1 = p13;
        this.p2 = p14;
        this.b1 = b6;
        this.b2 = b8;
        this.b3 = b14;
        this.b4 = b15;
        this.b5 = b16;
        this.btL = btL;
        this.btM = btM;
        this.btS = btS;
        this.bnL = bnL;
        this.bnM = bnM;
        this.bnS = bnS;
        this.n1 = n13;
        this.n2 = n14;
        this.n3 = n15;
        this.n4 = n16;
        this.n45 = n45;
        this.n5 = n17;
        this.n55 = n55;
        this.n6 = n18;
        this.n7 = n19;
        this.n8 = n24;
        this.n9 = n25;
        this.n10 = n110;
        this.formLabel = formLabel;
        this.formLabelMedium = formLabelMedium;
        this.t1 = t14;
        this.t2 = t15;
        this.t3 = t16;
        this.t4 = t17;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final C2886a getN5() {
        return this.n5;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final C2886a getN55() {
        return this.n55;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final C2886a getN6() {
        return this.n6;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final C2886a getN7() {
        return this.n7;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final C2886a getN8() {
        return this.n8;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final C2886a getN9() {
        return this.n9;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final C2886a getP1() {
        return this.p1;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final C2886a getP2() {
        return this.p2;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final C2886a getSh1() {
        return this.sh1;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final C2886a getSh2() {
        return this.sh2;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final C2886a getSh3() {
        return this.sh3;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final C2886a getSh4() {
        return this.sh4;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final C2886a getSh5() {
        return this.sh5;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final C2886a getT1() {
        return this.t1;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final C2886a getT2() {
        return this.t2;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final C2886a getT3() {
        return this.t3;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final C2886a getT4() {
        return this.t4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C2886a getB1() {
        return this.b1;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C2886a getB2() {
        return this.b2;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C2886a getB3() {
        return this.b3;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C2886a getB4() {
        return this.b4;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C2886a getB5() {
        return this.b5;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2889d)) {
            return false;
        }
        C2889d c2889d = (C2889d) other;
        return AbstractC22676k.m65745e(this.h1, c2889d.h1) && AbstractC22676k.m65745e(this.h2, c2889d.h2) && AbstractC22676k.m65745e(this.h3, c2889d.h3) && AbstractC22676k.m65745e(this.h4, c2889d.h4) && AbstractC22676k.m65745e(this.h5, c2889d.h5) && AbstractC22676k.m65745e(this.h6, c2889d.h6) && AbstractC22676k.m65745e(this.sh1, c2889d.sh1) && AbstractC22676k.m65745e(this.sh2, c2889d.sh2) && AbstractC22676k.m65745e(this.sh3, c2889d.sh3) && AbstractC22676k.m65745e(this.sh4, c2889d.sh4) && AbstractC22676k.m65745e(this.sh5, c2889d.sh5) && AbstractC22676k.m65745e(this.p1, c2889d.p1) && AbstractC22676k.m65745e(this.p2, c2889d.p2) && AbstractC22676k.m65745e(this.b1, c2889d.b1) && AbstractC22676k.m65745e(this.b2, c2889d.b2) && AbstractC22676k.m65745e(this.b3, c2889d.b3) && AbstractC22676k.m65745e(this.b4, c2889d.b4) && AbstractC22676k.m65745e(this.b5, c2889d.b5) && AbstractC22676k.m65745e(this.btL, c2889d.btL) && AbstractC22676k.m65745e(this.btM, c2889d.btM) && AbstractC22676k.m65745e(this.btS, c2889d.btS) && AbstractC22676k.m65745e(this.bnL, c2889d.bnL) && AbstractC22676k.m65745e(this.bnM, c2889d.bnM) && AbstractC22676k.m65745e(this.bnS, c2889d.bnS) && AbstractC22676k.m65745e(this.n1, c2889d.n1) && AbstractC22676k.m65745e(this.n2, c2889d.n2) && AbstractC22676k.m65745e(this.n3, c2889d.n3) && AbstractC22676k.m65745e(this.n4, c2889d.n4) && AbstractC22676k.m65745e(this.n45, c2889d.n45) && AbstractC22676k.m65745e(this.n5, c2889d.n5) && AbstractC22676k.m65745e(this.n55, c2889d.n55) && AbstractC22676k.m65745e(this.n6, c2889d.n6) && AbstractC22676k.m65745e(this.n7, c2889d.n7) && AbstractC22676k.m65745e(this.n8, c2889d.n8) && AbstractC22676k.m65745e(this.n9, c2889d.n9) && AbstractC22676k.m65745e(this.n10, c2889d.n10) && AbstractC22676k.m65745e(this.formLabel, c2889d.formLabel) && AbstractC22676k.m65745e(this.formLabelMedium, c2889d.formLabelMedium) && AbstractC22676k.m65745e(this.t1, c2889d.t1) && AbstractC22676k.m65745e(this.t2, c2889d.t2) && AbstractC22676k.m65745e(this.t3, c2889d.t3) && AbstractC22676k.m65745e(this.t4, c2889d.t4) && AbstractC22676k.m65745e(this.descriptions, c2889d.descriptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C2886a getBnL() {
        return this.bnL;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C2886a getBnM() {
        return this.bnM;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C2886a getBnS() {
        return this.bnS;
    }

    public int hashCode() {
        return this.descriptions.hashCode() + AbstractC11895b.m31984c(this.t4, AbstractC11895b.m31984c(this.t3, AbstractC11895b.m31984c(this.t2, AbstractC11895b.m31984c(this.t1, AbstractC11895b.m31984c(this.formLabelMedium, AbstractC11895b.m31984c(this.formLabel, AbstractC11895b.m31984c(this.n10, AbstractC11895b.m31984c(this.n9, AbstractC11895b.m31984c(this.n8, AbstractC11895b.m31984c(this.n7, AbstractC11895b.m31984c(this.n6, AbstractC11895b.m31984c(this.n55, AbstractC11895b.m31984c(this.n5, AbstractC11895b.m31984c(this.n45, AbstractC11895b.m31984c(this.n4, AbstractC11895b.m31984c(this.n3, AbstractC11895b.m31984c(this.n2, AbstractC11895b.m31984c(this.n1, AbstractC11895b.m31984c(this.bnS, AbstractC11895b.m31984c(this.bnM, AbstractC11895b.m31984c(this.bnL, AbstractC11895b.m31984c(this.btS, AbstractC11895b.m31984c(this.btM, AbstractC11895b.m31984c(this.btL, AbstractC11895b.m31984c(this.b5, AbstractC11895b.m31984c(this.b4, AbstractC11895b.m31984c(this.b3, AbstractC11895b.m31984c(this.b2, AbstractC11895b.m31984c(this.b1, AbstractC11895b.m31984c(this.p2, AbstractC11895b.m31984c(this.p1, AbstractC11895b.m31984c(this.sh5, AbstractC11895b.m31984c(this.sh4, AbstractC11895b.m31984c(this.sh3, AbstractC11895b.m31984c(this.sh2, AbstractC11895b.m31984c(this.sh1, AbstractC11895b.m31984c(this.h6, AbstractC11895b.m31984c(this.h5, AbstractC11895b.m31984c(this.h4, AbstractC11895b.m31984c(this.h3, AbstractC11895b.m31984c(this.h2, this.h1.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C2886a getBtL() {
        return this.btL;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C2886a getBtM() {
        return this.btM;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C2886a getBtS() {
        return this.btS;
    }

    /* JADX INFO: renamed from: l */
    public final List<C22396h<C2886a>> m8431l() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C2886a getFormLabel() {
        return this.formLabel;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C2886a getFormLabelMedium() {
        return this.formLabelMedium;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C2886a getH1() {
        return this.h1;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final C2886a getH2() {
        return this.h2;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final C2886a getH3() {
        return this.h3;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final C2886a getH4() {
        return this.h4;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final C2886a getH5() {
        return this.h5;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final C2886a getH6() {
        return this.h6;
    }

    public String toString() {
        C2886a c2886a = this.h1;
        C2886a c2886a2 = this.h2;
        C2886a c2886a3 = this.h3;
        C2886a c2886a4 = this.h4;
        C2886a c2886a5 = this.h5;
        C2886a c2886a6 = this.h6;
        C2886a c2886a7 = this.sh1;
        C2886a c2886a8 = this.sh2;
        C2886a c2886a9 = this.sh3;
        C2886a c2886a10 = this.sh4;
        C2886a c2886a11 = this.sh5;
        C2886a c2886a12 = this.p1;
        C2886a c2886a13 = this.p2;
        C2886a c2886a14 = this.b1;
        C2886a c2886a15 = this.b2;
        C2886a c2886a16 = this.b3;
        C2886a c2886a17 = this.b4;
        C2886a c2886a18 = this.b5;
        C2886a c2886a19 = this.btL;
        C2886a c2886a20 = this.btM;
        C2886a c2886a21 = this.btS;
        C2886a c2886a22 = this.bnL;
        C2886a c2886a23 = this.bnM;
        C2886a c2886a24 = this.bnS;
        C2886a c2886a25 = this.n1;
        C2886a c2886a26 = this.n2;
        C2886a c2886a27 = this.n3;
        C2886a c2886a28 = this.n4;
        C2886a c2886a29 = this.n45;
        C2886a c2886a30 = this.n5;
        C2886a c2886a31 = this.n55;
        C2886a c2886a32 = this.n6;
        C2886a c2886a33 = this.n7;
        C2886a c2886a34 = this.n8;
        C2886a c2886a35 = this.n9;
        C2886a c2886a36 = this.n10;
        C2886a c2886a37 = this.formLabel;
        C2886a c2886a38 = this.formLabelMedium;
        C2886a c2886a39 = this.t1;
        C2886a c2886a40 = this.t2;
        C2886a c2886a41 = this.t3;
        C2886a c2886a42 = this.t4;
        List<C22396h<C2886a>> list = this.descriptions;
        StringBuilder sb4 = new StringBuilder("WhoopTypography(h1=");
        sb4.append(c2886a);
        sb4.append(", h2=");
        sb4.append(c2886a2);
        sb4.append(", h3=");
        AbstractC30802r.m94774w(sb4, c2886a3, ", h4=", c2886a4, ", h5=");
        AbstractC30802r.m94774w(sb4, c2886a5, ", h6=", c2886a6, ", sh1=");
        AbstractC30802r.m94774w(sb4, c2886a7, ", sh2=", c2886a8, ", sh3=");
        AbstractC30802r.m94774w(sb4, c2886a9, ", sh4=", c2886a10, ", sh5=");
        AbstractC30802r.m94774w(sb4, c2886a11, ", p1=", c2886a12, ", p2=");
        AbstractC30802r.m94774w(sb4, c2886a13, ", b1=", c2886a14, ", b2=");
        AbstractC30802r.m94774w(sb4, c2886a15, ", b3=", c2886a16, ", b4=");
        AbstractC30802r.m94774w(sb4, c2886a17, ", b5=", c2886a18, ", btL=");
        AbstractC30802r.m94774w(sb4, c2886a19, ", btM=", c2886a20, ", btS=");
        AbstractC30802r.m94774w(sb4, c2886a21, ", bnL=", c2886a22, ", bnM=");
        AbstractC30802r.m94774w(sb4, c2886a23, ", bnS=", c2886a24, ", n1=");
        AbstractC30802r.m94774w(sb4, c2886a25, ", n2=", c2886a26, ", n3=");
        AbstractC30802r.m94774w(sb4, c2886a27, ", n4=", c2886a28, ", n45=");
        AbstractC30802r.m94774w(sb4, c2886a29, ", n5=", c2886a30, ", n55=");
        AbstractC30802r.m94774w(sb4, c2886a31, ", n6=", c2886a32, ", n7=");
        AbstractC30802r.m94774w(sb4, c2886a33, ", n8=", c2886a34, ", n9=");
        AbstractC30802r.m94774w(sb4, c2886a35, ", n10=", c2886a36, ", formLabel=");
        AbstractC30802r.m94774w(sb4, c2886a37, ", formLabelMedium=", c2886a38, ", t1=");
        AbstractC30802r.m94774w(sb4, c2886a39, ", t2=", c2886a40, ", t3=");
        AbstractC30802r.m94774w(sb4, c2886a41, ", t4=", c2886a42, ", descriptions=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final C2886a getN1() {
        return this.n1;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final C2886a getN10() {
        return this.n10;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final C2886a getN2() {
        return this.n2;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final C2886a getN3() {
        return this.n3;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final C2886a getN4() {
        return this.n4;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final C2886a getN45() {
        return this.n45;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2889d(C2886a c2886a, C2886a c2886a2, C2886a c2886a3, C2886a c2886a4, C2886a c2886a5, C2886a c2886a6, C2886a c2886a7, C2886a c2886a8, C2886a c2886a9, C2886a c2886a10, C2886a c2886a11, C2886a c2886a12, C2886a c2886a13, C2886a c2886a14, C2886a c2886a15, C2886a c2886a16, C2886a c2886a17, C2886a c2886a18, C2886a c2886a19, C2886a c2886a20, C2886a c2886a21, C2886a c2886a22, C2886a c2886a23, C2886a c2886a24, C2886a c2886a25, C2886a c2886a26, C2886a c2886a27, C2886a c2886a28, C2886a c2886a29, C2886a c2886a30, C2886a c2886a31, C2886a c2886a32, C2886a c2886a33, C2886a c2886a34, C2886a c2886a35, C2886a c2886a36, C2886a c2886a37, C2886a c2886a38, C2886a c2886a39, C2886a c2886a40, C2886a c2886a41, C2886a c2886a42, List list, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        C2886a c2886aM8401a = (i13 & 1) != 0 ? C2886a.INSTANCE.m8401a() : c2886a;
        this(c2886aM8401a, (i13 & 2) != 0 ? C2886a.INSTANCE.m8401a() : c2886a2, (i13 & 4) != 0 ? C2886a.INSTANCE.m8401a() : c2886a3, (i13 & 8) != 0 ? C2886a.INSTANCE.m8401a() : c2886a4, (i13 & 16) != 0 ? C2886a.INSTANCE.m8401a() : c2886a5, (i13 & 32) != 0 ? C2886a.INSTANCE.m8401a() : c2886a6, (i13 & 64) != 0 ? C2886a.INSTANCE.m8401a() : c2886a7, (i13 & 128) != 0 ? C2886a.INSTANCE.m8401a() : c2886a8, (i13 & 256) != 0 ? C2886a.INSTANCE.m8401a() : c2886a9, (i13 & 512) != 0 ? C2886a.INSTANCE.m8401a() : c2886a10, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C2886a.INSTANCE.m8401a() : c2886a11, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? C2886a.INSTANCE.m8401a() : c2886a12, (i13 & 4096) != 0 ? C2886a.INSTANCE.m8401a() : c2886a13, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? C2886a.INSTANCE.m8401a() : c2886a14, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? C2886a.INSTANCE.m8401a() : c2886a15, (i13 & 32768) != 0 ? C2886a.INSTANCE.m8401a() : c2886a16, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? C2886a.INSTANCE.m8401a() : c2886a17, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? C2886a.INSTANCE.m8401a() : c2886a18, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? C2886a.INSTANCE.m8401a() : c2886a19, (i13 & 524288) != 0 ? C2886a.INSTANCE.m8401a() : c2886a20, (i13 & 1048576) != 0 ? C2886a.INSTANCE.m8401a() : c2886a21, (i13 & 2097152) != 0 ? C2886a.INSTANCE.m8401a() : c2886a22, (i13 & 4194304) != 0 ? C2886a.INSTANCE.m8401a() : c2886a23, (i13 & 8388608) != 0 ? C2886a.INSTANCE.m8401a() : c2886a24, (i13 & 16777216) != 0 ? C2886a.INSTANCE.m8401a() : c2886a25, (i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? C2886a.INSTANCE.m8401a() : c2886a26, (i13 & 67108864) != 0 ? C2886a.INSTANCE.m8401a() : c2886a27, (i13 & 134217728) != 0 ? C2886a.INSTANCE.m8401a() : c2886a28, (i13 & 268435456) != 0 ? C2886a.INSTANCE.m8401a() : c2886a29, (i13 & 536870912) != 0 ? C2886a.INSTANCE.m8401a() : c2886a30, (i13 & 1073741824) != 0 ? C2886a.INSTANCE.m8401a() : c2886a31, (i13 & Integer.MIN_VALUE) != 0 ? C2886a.INSTANCE.m8401a() : c2886a32, (i14 & 1) != 0 ? C2886a.INSTANCE.m8401a() : c2886a33, (i14 & 2) != 0 ? C2886a.INSTANCE.m8401a() : c2886a34, (i14 & 4) != 0 ? C2886a.INSTANCE.m8401a() : c2886a35, (i14 & 8) != 0 ? C2886a.INSTANCE.m8401a() : c2886a36, (i14 & 16) != 0 ? C2886a.INSTANCE.m8401a() : c2886a37, (i14 & 32) != 0 ? C2886a.INSTANCE.m8401a() : c2886a38, (i14 & 64) != 0 ? C2886a.INSTANCE.m8401a() : c2886a39, (i14 & 128) != 0 ? C2886a.INSTANCE.m8401a() : c2886a40, (i14 & 256) != 0 ? C2886a.INSTANCE.m8401a() : c2886a41, (i14 & 512) != 0 ? C2886a.INSTANCE.m8401a() : c2886a42, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C25271y.f99162w : list);
    }
}
