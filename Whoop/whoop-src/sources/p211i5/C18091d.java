package p211i5;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.profileinstaller.ProfileVerifier;
import no.nordicsemi.android.dfu.DfuBaseService;

/* JADX INFO: renamed from: i5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18091d {

    /* JADX INFO: renamed from: e */
    public static final C18091d f70301e;

    /* JADX INFO: renamed from: f */
    public static final C18091d f70302f;

    /* JADX INFO: renamed from: g */
    public static final C18091d f70303g;

    /* JADX INFO: renamed from: h */
    public static final C18091d f70304h;

    /* JADX INFO: renamed from: i */
    public static final C18091d f70305i;

    /* JADX INFO: renamed from: j */
    public static final C18091d f70306j;

    /* JADX INFO: renamed from: k */
    public static final C18091d f70307k;

    /* JADX INFO: renamed from: l */
    public static final C18091d f70308l;

    /* JADX INFO: renamed from: m */
    public static final C18091d f70309m;

    /* JADX INFO: renamed from: n */
    public static final C18091d f70310n;

    /* JADX INFO: renamed from: o */
    public static final C18091d f70311o;

    /* JADX INFO: renamed from: p */
    public static final C18091d f70312p;

    /* JADX INFO: renamed from: a */
    public final Object f70313a;

    /* JADX INFO: renamed from: b */
    public final int f70314b;

    /* JADX INFO: renamed from: c */
    public final Class f70315c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC18102o f70316d;

    static {
        new C18091d(1, (String) null);
        new C18091d(2, (String) null);
        new C18091d(4, (String) null);
        new C18091d(8, (String) null);
        f70301e = new C18091d(16, (String) null);
        new C18091d(32, (String) null);
        f70302f = new C18091d(64, (String) null);
        f70303g = new C18091d(128, (String) null);
        new C18091d(256, AbstractC18095h.class);
        new C18091d(512, AbstractC18095h.class);
        new C18091d(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, AbstractC18096i.class);
        new C18091d(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, AbstractC18096i.class);
        f70304h = new C18091d(4096, (String) null);
        f70305i = new C18091d(DfuBaseService.ERROR_REMOTE_MASK, (String) null);
        new C18091d(DfuBaseService.ERROR_CONNECTION_MASK, (String) null);
        new C18091d(32768, (String) null);
        new C18091d(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST, (String) null);
        new C18091d(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ, AbstractC18100m.class);
        f70306j = new C18091d(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION, (String) null);
        f70307k = new C18091d(524288, (String) null);
        f70308l = new C18091d(1048576, (String) null);
        new C18091d(2097152, AbstractC18101n.class);
        int i13 = Build.VERSION.SDK_INT;
        new C18091d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C18091d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC18098k.class);
        f70309m = new C18091d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f70310n = new C18091d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f70311o = new C18091d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f70312p = new C18091d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new C18091d(i13 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C18091d(i13 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C18091d(i13 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C18091d(i13 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C18091d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C18091d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC18099l.class);
        new C18091d(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, AbstractC18097j.class);
        new C18091d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new C18091d(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new C18091d(i13 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C18091d(i13 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C18091d(i13 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C18091d(i13 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C18091d(i13 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C18091d(i13 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C18091d(i13 >= 34 ? AbstractC18092e.m51941b() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C18091d(int i13, String str) {
        this(null, i13, str, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m51939a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f70313a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C18091d)) {
            return false;
        }
        Object obj2 = ((C18091d) obj).f70313a;
        Object obj3 = this.f70313a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f70313a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AccessibilityActionCompat: ");
        String strM51946d = C18093f.m51946d(this.f70314b);
        if (strM51946d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f70313a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM51946d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb4.append(strM51946d);
        return sb4.toString();
    }

    public C18091d(int i13, Class cls) {
        this(null, i13, null, null, cls);
    }

    public C18091d(Object obj, int i13, CharSequence charSequence, InterfaceC18102o interfaceC18102o, Class cls) {
        this.f70314b = i13;
        this.f70316d = interfaceC18102o;
        if (obj == null) {
            this.f70313a = new AccessibilityNodeInfo.AccessibilityAction(i13, charSequence);
        } else {
            this.f70313a = obj;
        }
        this.f70315c = cls;
    }
}
