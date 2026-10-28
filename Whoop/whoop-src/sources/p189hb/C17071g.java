package p189hb;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p114eb.C12977n0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hb.g */
/* JADX INFO: loaded from: classes.dex */
public final class C17071g extends C12977n0 {

    /* JADX INFO: renamed from: L */
    public String f65611L;

    @Override // p114eb.C12977n0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof C17071g) && super.equals(obj) && AbstractC22676k.m65745e(this.f65611L, ((C17071g) obj).f65611L);
    }

    @Override // p114eb.C12977n0
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f65611L;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p114eb.C12977n0
    /* JADX INFO: renamed from: m */
    public final void mo36416m(Context context, AttributeSet attributeSet) {
        AbstractC22676k.m65750j(context, "context");
        super.mo36416m(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC17076l.f65618b);
        AbstractC22676k.m65749i(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.f65611L = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    /* JADX INFO: renamed from: p */
    public final String m48197p() {
        String str = this.f65611L;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        AbstractC22676k.m65748h(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }

    @Override // p114eb.C12977n0
    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.toString());
        sb4.append(" class=");
        String str = this.f65611L;
        if (str == null) {
            sb4.append("null");
        } else {
            sb4.append(str);
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "sb.toString()");
        return string;
    }
}
