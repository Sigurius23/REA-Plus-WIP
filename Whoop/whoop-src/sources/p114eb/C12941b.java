package p114eb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: eb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C12941b extends C12977n0 {

    /* JADX INFO: renamed from: L */
    public Intent f44707L;

    /* JADX INFO: renamed from: M */
    public String f44708M;

    /* JADX INFO: renamed from: p */
    public static String m36415p(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        AbstractC22676k.m65749i(packageName, "context.packageName");
        return AbstractC39421y.m125926K(str, "${applicationId}", packageName, false);
    }

    @Override // p114eb.C12977n0
    public final boolean equals(Object obj) {
        boolean zFilterEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C12941b) && super.equals(obj)) {
            Intent intent = this.f44707L;
            if (intent != null) {
                zFilterEquals = intent.filterEquals(((C12941b) obj).f44707L);
            } else {
                zFilterEquals = ((C12941b) obj).f44707L == null;
            }
            if (zFilterEquals && AbstractC22676k.m65745e(this.f44708M, ((C12941b) obj).f44708M)) {
                return true;
            }
        }
        return false;
    }

    @Override // p114eb.C12977n0
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.f44707L;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.f44708M;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p114eb.C12977n0
    /* JADX INFO: renamed from: m */
    public final void mo36416m(Context context, AttributeSet attributeSet) {
        AbstractC22676k.m65750j(context, "context");
        super.mo36416m(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC12973l1.f44808a);
        AbstractC22676k.m65749i(typedArrayObtainAttributes, "context.resources.obtain…leable.ActivityNavigator)");
        String strM36415p = m36415p(context, typedArrayObtainAttributes.getString(4));
        if (this.f44707L == null) {
            this.f44707L = new Intent();
        }
        Intent intent = this.f44707L;
        AbstractC22676k.m65747g(intent);
        intent.setPackage(strM36415p);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.f44707L == null) {
                this.f44707L = new Intent();
            }
            Intent intent2 = this.f44707L;
            AbstractC22676k.m65747g(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(1);
        if (this.f44707L == null) {
            this.f44707L = new Intent();
        }
        Intent intent3 = this.f44707L;
        AbstractC22676k.m65747g(intent3);
        intent3.setAction(string2);
        String strM36415p2 = m36415p(context, typedArrayObtainAttributes.getString(2));
        if (strM36415p2 != null) {
            Uri uri = Uri.parse(strM36415p2);
            if (this.f44707L == null) {
                this.f44707L = new Intent();
            }
            Intent intent4 = this.f44707L;
            AbstractC22676k.m65747g(intent4);
            intent4.setData(uri);
        }
        this.f44708M = m36415p(context, typedArrayObtainAttributes.getString(3));
        typedArrayObtainAttributes.recycle();
    }

    @Override // p114eb.C12977n0
    public final String toString() {
        Intent intent = this.f44707L;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.toString());
        if (component != null) {
            sb4.append(" class=");
            sb4.append(component.getClassName());
        } else {
            Intent intent2 = this.f44707L;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb4.append(" action=");
                sb4.append(action);
            }
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "sb.toString()");
        return string;
    }
}
