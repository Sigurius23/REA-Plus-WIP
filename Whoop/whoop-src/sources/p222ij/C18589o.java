package p222ij;

import android.content.SharedPreferences;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.quickjs.wrapper.JSNull;
import com.google.android.gms.common.C4989f;
import java.util.List;
import m83.AbstractC25265s;
import p014aj.C0928c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ij.o */
/* JADX INFO: loaded from: classes.dex */
public final class C18589o extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72614w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0928c f72615x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18589o(C0928c c0928c, int i13) {
        super(1);
        this.f72614w = i13;
        this.f72615x = c0928c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer numM125932Q;
        switch (this.f72614w) {
            case 0:
                Object[] args = (Object[]) obj;
                AbstractC22676k.m65750j(args, "args");
                if (args.length == 0) {
                    return JSNull.VALUE;
                }
                String key = args[0].toString();
                C4989f c4989f = ((C4861a) this.f72615x.f3421x).f20264e;
                if (c4989f != null) {
                    AbstractC22676k.m65750j(key, "key");
                    String string = c4989f.m15617b().getString(key, null);
                    if (string != null) {
                        return string;
                    }
                }
                return JSNull.VALUE;
            case 1:
                Object[] args2 = (Object[]) obj;
                AbstractC22676k.m65750j(args2, "args");
                if (args2.length < 2) {
                    return null;
                }
                String key2 = args2[0].toString();
                String value = args2[1].toString();
                C4989f c4989f2 = ((C4861a) this.f72615x.f3421x).f20264e;
                if (c4989f2 == null) {
                    return null;
                }
                AbstractC22676k.m65750j(key2, "key");
                AbstractC22676k.m65750j(value, "value");
                SharedPreferences.Editor editorEdit = c4989f2.m15617b().edit();
                editorEdit.putString(key2, value);
                editorEdit.apply();
                editorEdit.apply();
                return null;
            case 2:
                Object[] args3 = (Object[]) obj;
                AbstractC22676k.m65750j(args3, "args");
                if (args3.length == 0) {
                    return null;
                }
                String key3 = args3[0].toString();
                C4989f c4989f3 = ((C4861a) this.f72615x.f3421x).f20264e;
                if (c4989f3 == null) {
                    return null;
                }
                AbstractC22676k.m65750j(key3, "key");
                SharedPreferences.Editor editorEdit2 = c4989f3.m15617b().edit();
                editorEdit2.remove(key3);
                editorEdit2.apply();
                editorEdit2.apply();
                return null;
            case 3:
                Object[] args4 = (Object[]) obj;
                AbstractC22676k.m65750j(args4, "args");
                if (args4.length != 0 && (numM125932Q = AbstractC39421y.m125932Q(args4[0].toString())) != null) {
                    int iIntValue = numM125932Q.intValue();
                    C4989f c4989f4 = ((C4861a) this.f72615x.f3421x).f20264e;
                    if (c4989f4 != null) {
                        List listM74150t1 = AbstractC25265s.m74150t1(c4989f4.m15617b().getAll().keySet());
                        String str = (iIntValue < 0 || iIntValue >= listM74150t1.size()) ? null : (String) listM74150t1.get(iIntValue);
                        if (str != null) {
                            return str;
                        }
                    }
                    return JSNull.VALUE;
                }
                return JSNull.VALUE;
            default:
                AbstractC22676k.m65750j((Object[]) obj, "<anonymous parameter 0>");
                C4989f c4989f5 = ((C4861a) this.f72615x.f3421x).f20264e;
                if (c4989f5 == null) {
                    return null;
                }
                SharedPreferences.Editor editorEdit3 = c4989f5.m15617b().edit();
                editorEdit3.clear();
                editorEdit3.apply();
                editorEdit3.apply();
                return null;
        }
    }
}
