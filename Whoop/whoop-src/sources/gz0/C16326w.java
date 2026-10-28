package gz0;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.C22396h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.w */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0003\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0003\u0010 \u001a\u00020\u0002\u0012\b\b\u0003\u0010!\u001a\u00020\u0002\u0012\b\b\u0003\u0010\"\u001a\u00020\u0002\u0012\b\b\u0003\u0010#\u001a\u00020\u0002\u0012\b\b\u0003\u0010$\u001a\u00020\u0002\u0012\b\b\u0003\u0010%\u001a\u00020\u0002\u0012\b\b\u0003\u0010&\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020(0'¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00100R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\b7\u00100R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00106\u0012\u0004\b:\u0010;\u001a\u0004\b9\u00100R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u00106\u0012\u0004\b=\u0010;\u001a\u0004\b8\u00100R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b<\u00100R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b>\u00100R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\b?\u00100R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u00106\u001a\u0004\bB\u00100R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\b@\u00100R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u00106\u001a\u0004\bA\u00100R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u00106\u001a\u0004\bC\u00100R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bD\u00100R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\bF\u00100R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u00106\u001a\u0004\bG\u00100R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bH\u00100R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u00106\u001a\u0004\bK\u00100R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u00106\u001a\u0004\bI\u00100R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u00106\u001a\u0004\bN\u00100R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u00106\u001a\u0004\bP\u00100R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u00106\u001a\u0004\bR\u00100R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u00106\u001a\u0004\bJ\u00100R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u00106\u001a\u0004\bL\u00100R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u00106\u001a\u0004\bM\u00100R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u00106\u001a\u0004\bO\u00100R \u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bW\u00106\u0012\u0004\bY\u0010;\u001a\u0004\bX\u00100R \u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bZ\u00106\u0012\u0004\b\\\u0010;\u001a\u0004\b[\u00100R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u00106\u001a\u0004\bQ\u00100R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u00106\u001a\u0004\bS\u00100R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u00106\u001a\u0004\bT\u00100R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u00106\u001a\u0004\bU\u00100R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u00106\u001a\u0004\bV\u00100R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u00106\u001a\u0004\bW\u00100R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u00106\u001a\u0004\bZ\u00100R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u00106\u001a\u0004\be\u00100R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00106\u001a\u0004\b]\u00100R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u00106\u001a\u0004\b^\u00100R#\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020(0'8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bE\u0010i¨\u0006j"}, m65681d2 = {"Lgz0/w;", "", "", "arrowBackward", "arrowForward", "arrowLeft", "arrowRight", "arrowUp", "calendar", "camera", "cameraOff", "caretDown", "caretUp", "coach", "community", "dotMenu", "health", "home", "lockedPa", "menu", "menuCutout", "menuThick", "menuWithGift", "monthlyPA", "navigationBackward", "navigationDown", "navigationForward", "navigationLeft", "navigationRight", "pause", "play", "profile", "settings", "sleepCoach", "stopActivity", "strainCoach", "trend", "zoomIn", "zoomOut", "", "Lkd1/h;", "descriptions", "<init>", "(IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "getArrowLeft", "getArrowLeft$annotations", "()V", "d", "getArrowRight$annotations", "e", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getCameraOff", "i", "j", "k", "l", "m", "n", "o", "p", "getLockedPa", "q", "r", "getMenuCutout", "s", "getMenuThick", "t", "getMenuWithGift", "u", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "getNavigationLeft", "getNavigationLeft$annotations", "z", "getNavigationRight", "getNavigationRight$annotations", "A", "B", "C", "D", "E", "F", "G", "H", "getTrend", "J", "K", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16326w {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int pause;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int play;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final int profile;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final int settings;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final int sleepCoach;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int stopActivity;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int strainCoach;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int trend;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int zoomIn;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final int zoomOut;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final List<C22396h<Integer>> descriptions;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int arrowBackward;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int arrowForward;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int arrowLeft;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int arrowRight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int arrowUp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int calendar;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int camera;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int cameraOff;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int caretDown;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int caretUp;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int coach;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int community;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int dotMenu;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int health;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int home;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int lockedPa;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int menu;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int menuCutout;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int menuThick;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int menuWithGift;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int monthlyPA;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int navigationBackward;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int navigationDown;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int navigationForward;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int navigationLeft;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int navigationRight;

    public C16326w(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34, int i35, int i36, int i37, int i38, int i39, int i44, int i45, int i46, int i47, int i48, int i49, int i54, int i55, int i56, int i57, int i58, int i59, int i64, int i65, int i66, int i67, int i68, List<C22396h<Integer>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.arrowBackward = i13;
        this.arrowForward = i14;
        this.arrowLeft = i15;
        this.arrowRight = i16;
        this.arrowUp = i17;
        this.calendar = i18;
        this.camera = i19;
        this.cameraOff = i24;
        this.caretDown = i25;
        this.caretUp = i26;
        this.coach = i27;
        this.community = i28;
        this.dotMenu = i29;
        this.health = i34;
        this.home = i35;
        this.lockedPa = i36;
        this.menu = i37;
        this.menuCutout = i38;
        this.menuThick = i39;
        this.menuWithGift = i44;
        this.monthlyPA = i45;
        this.navigationBackward = i46;
        this.navigationDown = i47;
        this.navigationForward = i48;
        this.navigationLeft = i49;
        this.navigationRight = i54;
        this.pause = i55;
        this.play = i56;
        this.profile = i57;
        this.settings = i58;
        this.sleepCoach = i59;
        this.stopActivity = i64;
        this.strainCoach = i65;
        this.trend = i66;
        this.zoomIn = i67;
        this.zoomOut = i68;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final int getZoomIn() {
        return this.zoomIn;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final int getZoomOut() {
        return this.zoomOut;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getArrowBackward() {
        return this.arrowBackward;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getArrowForward() {
        return this.arrowForward;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getArrowRight() {
        return this.arrowRight;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getArrowUp() {
        return this.arrowUp;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCalendar() {
        return this.calendar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16326w)) {
            return false;
        }
        C16326w c16326w = (C16326w) other;
        return this.arrowBackward == c16326w.arrowBackward && this.arrowForward == c16326w.arrowForward && this.arrowLeft == c16326w.arrowLeft && this.arrowRight == c16326w.arrowRight && this.arrowUp == c16326w.arrowUp && this.calendar == c16326w.calendar && this.camera == c16326w.camera && this.cameraOff == c16326w.cameraOff && this.caretDown == c16326w.caretDown && this.caretUp == c16326w.caretUp && this.coach == c16326w.coach && this.community == c16326w.community && this.dotMenu == c16326w.dotMenu && this.health == c16326w.health && this.home == c16326w.home && this.lockedPa == c16326w.lockedPa && this.menu == c16326w.menu && this.menuCutout == c16326w.menuCutout && this.menuThick == c16326w.menuThick && this.menuWithGift == c16326w.menuWithGift && this.monthlyPA == c16326w.monthlyPA && this.navigationBackward == c16326w.navigationBackward && this.navigationDown == c16326w.navigationDown && this.navigationForward == c16326w.navigationForward && this.navigationLeft == c16326w.navigationLeft && this.navigationRight == c16326w.navigationRight && this.pause == c16326w.pause && this.play == c16326w.play && this.profile == c16326w.profile && this.settings == c16326w.settings && this.sleepCoach == c16326w.sleepCoach && this.stopActivity == c16326w.stopActivity && this.strainCoach == c16326w.strainCoach && this.trend == c16326w.trend && this.zoomIn == c16326w.zoomIn && this.zoomOut == c16326w.zoomOut && AbstractC22676k.m65745e(this.descriptions, c16326w.descriptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCamera() {
        return this.camera;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getCaretDown() {
        return this.caretDown;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getCaretUp() {
        return this.caretUp;
    }

    public int hashCode() {
        return this.descriptions.hashCode() + AbstractC11266d.m30448b(this.zoomOut, AbstractC11266d.m30448b(this.zoomIn, AbstractC11266d.m30448b(this.trend, AbstractC11266d.m30448b(this.strainCoach, AbstractC11266d.m30448b(this.stopActivity, AbstractC11266d.m30448b(this.sleepCoach, AbstractC11266d.m30448b(this.settings, AbstractC11266d.m30448b(this.profile, AbstractC11266d.m30448b(this.play, AbstractC11266d.m30448b(this.pause, AbstractC11266d.m30448b(this.navigationRight, AbstractC11266d.m30448b(this.navigationLeft, AbstractC11266d.m30448b(this.navigationForward, AbstractC11266d.m30448b(this.navigationDown, AbstractC11266d.m30448b(this.navigationBackward, AbstractC11266d.m30448b(this.monthlyPA, AbstractC11266d.m30448b(this.menuWithGift, AbstractC11266d.m30448b(this.menuThick, AbstractC11266d.m30448b(this.menuCutout, AbstractC11266d.m30448b(this.menu, AbstractC11266d.m30448b(this.lockedPa, AbstractC11266d.m30448b(this.home, AbstractC11266d.m30448b(this.health, AbstractC11266d.m30448b(this.dotMenu, AbstractC11266d.m30448b(this.community, AbstractC11266d.m30448b(this.coach, AbstractC11266d.m30448b(this.caretUp, AbstractC11266d.m30448b(this.caretDown, AbstractC11266d.m30448b(this.cameraOff, AbstractC11266d.m30448b(this.camera, AbstractC11266d.m30448b(this.calendar, AbstractC11266d.m30448b(this.arrowUp, AbstractC11266d.m30448b(this.arrowRight, AbstractC11266d.m30448b(this.arrowLeft, AbstractC11266d.m30448b(this.arrowForward, Integer.hashCode(this.arrowBackward) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getCoach() {
        return this.coach;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getCommunity() {
        return this.community;
    }

    /* JADX INFO: renamed from: k */
    public final List<C22396h<Integer>> m46496k() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getDotMenu() {
        return this.dotMenu;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getHealth() {
        return this.health;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getHome() {
        return this.home;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getMenu() {
        return this.menu;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getMonthlyPA() {
        return this.monthlyPA;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getNavigationBackward() {
        return this.navigationBackward;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getNavigationDown() {
        return this.navigationDown;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getNavigationForward() {
        return this.navigationForward;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getPause() {
        return this.pause;
    }

    public String toString() {
        int i13 = this.arrowBackward;
        int i14 = this.arrowForward;
        int i15 = this.arrowLeft;
        int i16 = this.arrowRight;
        int i17 = this.arrowUp;
        int i18 = this.calendar;
        int i19 = this.camera;
        int i24 = this.cameraOff;
        int i25 = this.caretDown;
        int i26 = this.caretUp;
        int i27 = this.coach;
        int i28 = this.community;
        int i29 = this.dotMenu;
        int i34 = this.health;
        int i35 = this.home;
        int i36 = this.lockedPa;
        int i37 = this.menu;
        int i38 = this.menuCutout;
        int i39 = this.menuThick;
        int i44 = this.menuWithGift;
        int i45 = this.monthlyPA;
        int i46 = this.navigationBackward;
        int i47 = this.navigationDown;
        int i48 = this.navigationForward;
        int i49 = this.navigationLeft;
        int i54 = this.navigationRight;
        int i55 = this.pause;
        int i56 = this.play;
        int i57 = this.profile;
        int i58 = this.settings;
        int i59 = this.sleepCoach;
        int i64 = this.stopActivity;
        int i65 = this.strainCoach;
        int i66 = this.trend;
        int i67 = this.zoomIn;
        int i68 = this.zoomOut;
        List<C22396h<Integer>> list = this.descriptions;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "NavigationIcons(arrowBackward=", ", arrowForward=", ", arrowLeft=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", arrowRight=", i16, ", arrowUp=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", calendar=", i18, ", camera=");
        AbstractC30802r.m94773v(sbM30465s, i19, ", cameraOff=", i24, ", caretDown=");
        AbstractC30802r.m94773v(sbM30465s, i25, ", caretUp=", i26, ", coach=");
        AbstractC30802r.m94773v(sbM30465s, i27, ", community=", i28, ", dotMenu=");
        AbstractC30802r.m94773v(sbM30465s, i29, ", health=", i34, ", home=");
        AbstractC30802r.m94773v(sbM30465s, i35, ", lockedPa=", i36, ", menu=");
        AbstractC30802r.m94773v(sbM30465s, i37, ", menuCutout=", i38, ", menuThick=");
        AbstractC30802r.m94773v(sbM30465s, i39, ", menuWithGift=", i44, ", monthlyPA=");
        AbstractC30802r.m94773v(sbM30465s, i45, ", navigationBackward=", i46, ", navigationDown=");
        AbstractC30802r.m94773v(sbM30465s, i47, ", navigationForward=", i48, ", navigationLeft=");
        AbstractC30802r.m94773v(sbM30465s, i49, ", navigationRight=", i54, ", pause=");
        AbstractC30802r.m94773v(sbM30465s, i55, ", play=", i56, ", profile=");
        AbstractC30802r.m94773v(sbM30465s, i57, ", settings=", i58, ", sleepCoach=");
        AbstractC30802r.m94773v(sbM30465s, i59, ", stopActivity=", i64, ", strainCoach=");
        AbstractC30802r.m94773v(sbM30465s, i65, ", trend=", i66, ", zoomIn=");
        AbstractC30802r.m94773v(sbM30465s, i67, ", zoomOut=", i68, ", descriptions=");
        return AbstractC3855a.m11829m(sbM30465s, list, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getPlay() {
        return this.play;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getProfile() {
        return this.profile;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final int getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getSleepCoach() {
        return this.sleepCoach;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getStopActivity() {
        return this.stopActivity;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final int getStrainCoach() {
        return this.strainCoach;
    }
}
