package androidx.compose.p018ui.viewinterop;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p028b4.ViewTreeObserverOnGlobalFocusChangeListenerC2708s;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;", "La3/h1;", "Lb4/s;", "<init>", "()V", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class FocusGroupPropertiesElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public static final FocusGroupPropertiesElement f4988w = new FocusGroupPropertiesElement();

    private FocusGroupPropertiesElement() {
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new ViewTreeObserverOnGlobalFocusChangeListenerC2708s();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return -1929324230;
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "FocusGroupProperties";
    }

    @Override // p005a3.AbstractC0207h1
    public final /* bridge */ /* synthetic */ void update(AbstractC2316v abstractC2316v) {
    }
}
