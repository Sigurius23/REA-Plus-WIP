package p189hb;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p114eb.C12977n0;
import p114eb.InterfaceC12950e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17066b extends C12977n0 implements InterfaceC12950e {

    /* JADX INFO: renamed from: L */
    public String f65594L;

    @Override // p114eb.C12977n0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof C17066b) && super.equals(obj) && AbstractC22676k.m65745e(this.f65594L, ((C17066b) obj).f65594L);
    }

    @Override // p114eb.C12977n0
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f65594L;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p114eb.C12977n0
    /* JADX INFO: renamed from: m */
    public final void mo36416m(Context context, AttributeSet attributeSet) {
        AbstractC22676k.m65750j(context, "context");
        super.mo36416m(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC17076l.f65617a);
        AbstractC22676k.m65749i(typedArrayObtainAttributes, "context.resources.obtain….DialogFragmentNavigator)");
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.f65594L = string;
        }
        typedArrayObtainAttributes.recycle();
    }
}
