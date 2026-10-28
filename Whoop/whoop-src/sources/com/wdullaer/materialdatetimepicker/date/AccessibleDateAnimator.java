package com.wdullaer.materialdatetimepicker.date;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ViewAnimator;

/* JADX INFO: loaded from: classes6.dex */
public class AccessibleDateAnimator extends ViewAnimator {

    /* JADX INFO: renamed from: w */
    public long f22598w;

    public AccessibleDateAnimator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), this.f22598w, 22));
        return true;
    }

    public void setDateMillis(long j7) {
        this.f22598w = j7;
    }
}
