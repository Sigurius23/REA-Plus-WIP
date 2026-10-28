package androidx.compose.p018ui.input.pointer;

import java.util.Arrays;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p512u2.C34462h0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "La3/h1;", "Lu2/h0;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SuspendPointerInputElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final Object f4837w;

    /* JADX INFO: renamed from: x */
    public final Object f4838x;

    /* JADX INFO: renamed from: y */
    public final Object[] f4839y;

    /* JADX INFO: renamed from: z */
    public final PointerInputEventHandler f4840z;

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i13) {
        obj = (i13 & 1) != 0 ? null : obj;
        obj2 = (i13 & 2) != 0 ? null : obj2;
        objArr = (i13 & 4) != 0 ? null : objArr;
        this.f4837w = obj;
        this.f4838x = obj2;
        this.f4839y = objArr;
        this.f4840z = pointerInputEventHandler;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C34462h0(this.f4837w, this.f4838x, this.f4839y, this.f4840z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        Object[] objArr = suspendPointerInputElement.f4839y;
        if (!AbstractC22676k.m65745e(this.f4837w, suspendPointerInputElement.f4837w) || !AbstractC22676k.m65745e(this.f4838x, suspendPointerInputElement.f4838x)) {
            return false;
        }
        Object[] objArr2 = this.f4839y;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.f4840z == suspendPointerInputElement.f4840z;
    }

    public final int hashCode() {
        Object obj = this.f4837w;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f4838x;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f4839y;
        return this.f4840z.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("pointerInput");
        c2404l2.m7400b().m7292c(this.f4837w, "key1");
        c2404l2.m7400b().m7292c(this.f4838x, "key2");
        c2404l2.m7400b().m7292c(this.f4839y, "keys");
        c2404l2.m7400b().m7292c(this.f4840z, "pointerInputEventHandler");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C34462h0 c34462h0 = (C34462h0) abstractC2316v;
        Object obj = c34462h0.f144779O;
        Object obj2 = this.f4837w;
        boolean z4 = !AbstractC22676k.m65745e(obj, obj2);
        c34462h0.f144779O = obj2;
        Object obj3 = c34462h0.f144780P;
        Object obj4 = this.f4838x;
        if (!AbstractC22676k.m65745e(obj3, obj4)) {
            z4 = true;
        }
        c34462h0.f144780P = obj4;
        Object[] objArr = c34462h0.f144781Q;
        Object[] objArr2 = this.f4839y;
        if (objArr != null && objArr2 == null) {
            z4 = true;
        }
        if (objArr == null && objArr2 != null) {
            z4 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z4 = true;
        }
        c34462h0.f144781Q = objArr2;
        Class<?> cls = c34462h0.f144782R.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f4840z;
        if (cls == pointerInputEventHandler.getClass() ? z4 : true) {
            c34462h0.m108936Z0();
        }
        c34462h0.f144782R = pointerInputEventHandler;
    }
}
