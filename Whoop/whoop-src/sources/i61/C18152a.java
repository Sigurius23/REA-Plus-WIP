package i61;

import g61.C15529b;
import g61.EnumC15531d;
import j61.C21374h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i61.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Li61/a;", "", "<init>", "()V", "Lj61/h;", "state", "", "axisScale", "Li61/b;", "a", "(Lj61/h;F)Li61/b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18152a {
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: a */
    public final InterfaceC18153b m52119a(C21374h state, float axisScale) {
        boolean z4;
        AbstractC22676k.m65750j(state, "state");
        C15529b startVerticalAxis = state.getStartVerticalAxis();
        EnumC15531d type = startVerticalAxis != null ? startVerticalAxis.getType() : null;
        EnumC15531d enumC15531d = EnumC15531d.TIME_MARKER;
        boolean z13 = true;
        if (type == enumC15531d) {
            z4 = true;
        } else {
            C15529b startVerticalAxis2 = state.getStartVerticalAxis();
            if ((startVerticalAxis2 != null ? startVerticalAxis2.getType() : null) == EnumC15531d.TIME_MARKER_WITHOUT_BULB) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        C15529b endVerticalAxis = state.getEndVerticalAxis();
        if ((endVerticalAxis != null ? endVerticalAxis.getType() : null) != enumC15531d) {
            C15529b endVerticalAxis2 = state.getEndVerticalAxis();
            if ((endVerticalAxis2 != null ? endVerticalAxis2.getType() : null) != EnumC15531d.TIME_MARKER_WITHOUT_BULB) {
                z13 = false;
            }
        }
        return (z4 || z13) ? new C18155d(state, axisScale) : new C18154c(state, axisScale);
    }
}
