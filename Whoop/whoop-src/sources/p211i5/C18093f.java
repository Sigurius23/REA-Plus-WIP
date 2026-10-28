package p211i5;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p014aj.C0929d;
import p043c4.AbstractC3979v;
import p107e3.AbstractC12602c;
import p171g9.C15585b;

/* JADX INFO: renamed from: i5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C18093f {

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo f70317a;

    /* JADX INFO: renamed from: b */
    public int f70318b = -1;

    /* JADX INFO: renamed from: c */
    public int f70319c = -1;

    public C18093f(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f70317a = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: d */
    public static String m51946d(int i13) {
        if (i13 == 1) {
            return "ACTION_FOCUS";
        }
        if (i13 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i13) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case DfuBaseService.ERROR_REMOTE_MASK /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case DfuBaseService.ERROR_CONNECTION_MASK /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST /* 65536 */:
                return "ACTION_CUT";
            case ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ /* 131072 */:
                return "ACTION_SET_SELECTION";
            case ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION /* 262144 */:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i13) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i13) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i13) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m51947a(int i13) {
        this.f70317a.addAction(i13);
    }

    /* JADX INFO: renamed from: b */
    public final void m51948b(C18091d c18091d) {
        this.f70317a.addAction((AccessibilityNodeInfo.AccessibilityAction) c18091d.f70313a);
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m51949c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f70317a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m51950e(int i13) {
        Bundle extras = this.f70317a.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i13) == i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C18093f)) {
            return false;
        }
        C18093f c18093f = (C18093f) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = c18093f.f70317a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f70317a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f70319c == c18093f.f70319c && this.f70318b == c18093f.f70318b;
    }

    /* JADX INFO: renamed from: f */
    public final void m51951f(Rect rect) {
        this.f70317a.getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: g */
    public final CharSequence m51952g() {
        boolean zIsEmpty = m51949c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f70317a;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListM51949c = m51949c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListM51949c2 = m51949c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListM51949c3 = m51949c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListM51949c4 = m51949c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i13 = 0; i13 < arrayListM51949c.size(); i13++) {
            spannableString.setSpan(new C18088a(((Integer) arrayListM51949c4.get(i13)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListM51949c.get(i13)).intValue(), ((Integer) arrayListM51949c2.get(i13)).intValue(), ((Integer) arrayListM51949c3.get(i13)).intValue());
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: h */
    public final void m51953h(CharSequence charSequence) {
        this.f70317a.setClassName(charSequence);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f70317a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m51954i(C15585b c15585b) {
        this.f70317a.setCollectionInfo(c15585b == null ? null : (AccessibilityNodeInfo.CollectionInfo) c15585b.f58535a);
    }

    /* JADX INFO: renamed from: j */
    public final void m51955j(C0929d c0929d) {
        this.f70317a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c0929d.f3422w);
    }

    /* JADX INFO: renamed from: k */
    public final void m51956k(boolean z4) {
        this.f70317a.setScrollable(z4);
    }

    /* JADX INFO: renamed from: l */
    public final void m51957l(CharSequence charSequence) {
        this.f70317a.setText(charSequence);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.toString());
        Rect rect = new Rect();
        m51951f(rect);
        sb4.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f70317a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb4.append("; boundsInScreen: " + rect);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            AbstractC18092e.m51942c(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb4.append("; boundsInWindow: " + rect);
        sb4.append("; packageName: ");
        sb4.append(accessibilityNodeInfo.getPackageName());
        sb4.append("; className: ");
        sb4.append(accessibilityNodeInfo.getClassName());
        sb4.append("; text: ");
        sb4.append(m51952g());
        sb4.append("; error: ");
        sb4.append(accessibilityNodeInfo.getError());
        sb4.append("; maxTextLength: ");
        sb4.append(accessibilityNodeInfo.getMaxTextLength());
        sb4.append("; stateDescription: ");
        sb4.append(i13 >= 30 ? AbstractC12602c.m35322d(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb4.append("; contentDescription: ");
        sb4.append(accessibilityNodeInfo.getContentDescription());
        sb4.append("; tooltipText: ");
        sb4.append(accessibilityNodeInfo.getTooltipText());
        sb4.append("; viewIdResName: ");
        sb4.append(accessibilityNodeInfo.getViewIdResourceName());
        sb4.append("; uniqueId: ");
        sb4.append(i13 >= 33 ? AbstractC3979v.m12014e(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb4.append("; checkable: ");
        sb4.append(accessibilityNodeInfo.isCheckable());
        sb4.append("; checked: ");
        sb4.append(accessibilityNodeInfo.isChecked());
        sb4.append("; focusable: ");
        sb4.append(accessibilityNodeInfo.isFocusable());
        sb4.append("; focused: ");
        sb4.append(accessibilityNodeInfo.isFocused());
        sb4.append("; selected: ");
        sb4.append(accessibilityNodeInfo.isSelected());
        sb4.append("; clickable: ");
        sb4.append(accessibilityNodeInfo.isClickable());
        sb4.append("; longClickable: ");
        sb4.append(accessibilityNodeInfo.isLongClickable());
        sb4.append("; contextClickable: ");
        sb4.append(accessibilityNodeInfo.isContextClickable());
        sb4.append("; enabled: ");
        sb4.append(accessibilityNodeInfo.isEnabled());
        sb4.append("; password: ");
        sb4.append(accessibilityNodeInfo.isPassword());
        sb4.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb4.append("; containerTitle: ");
        sb4.append(i13 >= 34 ? AbstractC18092e.m51943d(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb4.append("; granularScrollingSupported: ");
        sb4.append(m51950e(67108864));
        sb4.append("; importantForAccessibility: ");
        sb4.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb4.append("; visible: ");
        sb4.append(accessibilityNodeInfo.isVisibleToUser());
        sb4.append("; isTextSelectable: ");
        sb4.append(i13 >= 33 ? AbstractC3979v.m12016g(accessibilityNodeInfo) : m51950e(8388608));
        sb4.append("; accessibilityDataSensitive: ");
        sb4.append(i13 >= 34 ? AbstractC18092e.m51944e(accessibilityNodeInfo) : m51950e(64));
        sb4.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new C18091d(actionList.get(i14), 0, null, null, null));
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            C18091d c18091d = (C18091d) arrayList.get(i15);
            int iM51939a = c18091d.m51939a();
            Object obj = c18091d.f70313a;
            String strM51946d = m51946d(iM51939a);
            if (strM51946d.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM51946d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
            sb4.append(strM51946d);
            if (i15 != arrayList.size() - 1) {
                sb4.append(", ");
            }
        }
        sb4.append("]");
        return sb4.toString();
    }
}
