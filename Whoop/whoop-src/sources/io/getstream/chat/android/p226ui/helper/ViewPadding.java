package io.getstream.chat.android.p226ui.helper;

import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/helper/ViewPadding;", "", "start", "", "top", "end", "bottom", "<init>", "(IIII)V", "getStart", "()I", "getTop", "getEnd", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ViewPadding {
    private final int bottom;
    private final int end;
    private final int start;
    private final int top;

    public ViewPadding(int i13, int i14, int i15, int i16) {
        this.start = i13;
        this.top = i14;
        this.end = i15;
        this.bottom = i16;
    }

    public static ViewPadding copy$default(ViewPadding viewPadding, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = viewPadding.start;
        }
        if ((i17 & 2) != 0) {
            i14 = viewPadding.top;
        }
        if ((i17 & 4) != 0) {
            i15 = viewPadding.end;
        }
        if ((i17 & 8) != 0) {
            i16 = viewPadding.bottom;
        }
        viewPadding.getClass();
        return new ViewPadding(i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    public final ViewPadding copy(int start, int top, int end, int bottom) {
        return new ViewPadding(start, top, end, bottom);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewPadding)) {
            return false;
        }
        ViewPadding viewPadding = (ViewPadding) other;
        return this.start == viewPadding.start && this.top == viewPadding.top && this.end == viewPadding.end && this.bottom == viewPadding.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getTop() {
        return this.top;
    }

    public final int hashCode() {
        return Integer.hashCode(this.bottom) + AbstractC11266d.m30448b(this.end, AbstractC11266d.m30448b(this.top, Integer.hashCode(this.start) * 31, 31), 31);
    }

    public final String toString() {
        int i13 = this.start;
        int i14 = this.top;
        return AbstractC26725a.m79505i(AbstractC11266d.m30465s(i13, i14, "ViewPadding(start=", ", top=", ", end="), this.end, ", bottom=", this.bottom, ")");
    }
}
