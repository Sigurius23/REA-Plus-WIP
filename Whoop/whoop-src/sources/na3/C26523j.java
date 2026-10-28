package na3;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ya3.EnumC39374q;

/* JADX INFO: renamed from: na3.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C26523j implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f105443w;

    /* JADX INFO: renamed from: x */
    public final String f105444x;

    /* JADX INFO: renamed from: y */
    public final String f105445y;

    public /* synthetic */ C26523j(String str, String str2, int i13) {
        this.f105443w = i13;
        this.f105444x = str;
        this.f105445y = str2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C26528o function = (C26528o) obj;
        switch (this.f105443w) {
            case 0:
                AbstractC22676k.m65750j(function, "$this$function");
                C26517d c26517d = AbstractC26525l.f105449b;
                String str = this.f105444x;
                function.m78601a(str, c26517d);
                C26517d c26517d2 = AbstractC26525l.f105448a;
                function.m78601a(this.f105445y, c26517d, c26517d, c26517d2, c26517d2);
                function.m78603c(str, c26517d2);
                break;
            case 1:
                AbstractC22676k.m65750j(function, "$this$function");
                C26517d c26517d3 = AbstractC26525l.f105449b;
                String str2 = this.f105444x;
                function.m78601a(str2, c26517d3);
                function.m78601a(this.f105445y, c26517d3, c26517d3, c26517d3);
                function.m78603c(str2, c26517d3);
                break;
            case 2:
                AbstractC22676k.m65750j(function, "$this$function");
                C26517d c26517d4 = AbstractC26525l.f105449b;
                String str3 = this.f105444x;
                function.m78601a(str3, c26517d4);
                C26517d c26517d5 = AbstractC26525l.f105450c;
                C26517d c26517d6 = AbstractC26525l.f105448a;
                function.m78601a(this.f105445y, c26517d4, c26517d4, c26517d5, c26517d6);
                function.m78603c(str3, c26517d6);
                break;
            case 3:
                AbstractC22676k.m65750j(function, "$this$function");
                C26517d c26517d7 = AbstractC26525l.f105449b;
                String str4 = this.f105444x;
                function.m78601a(str4, c26517d7);
                C26517d c26517d8 = AbstractC26525l.f105450c;
                function.m78601a(str4, c26517d8);
                C26517d c26517d9 = AbstractC26525l.f105448a;
                function.m78601a(this.f105445y, c26517d7, c26517d8, c26517d8, c26517d9);
                function.m78603c(str4, c26517d9);
                break;
            case 4:
                AbstractC22676k.m65750j(function, "$this$function");
                C26517d c26517d10 = AbstractC26525l.f105450c;
                function.m78601a(this.f105444x, c26517d10);
                function.m78603c(this.f105445y, AbstractC26525l.f105449b, c26517d10);
                EnumC39374q enumC39374q = EnumC39374q.f169426w;
                break;
            default:
                AbstractC22676k.m65750j(function, "$this$function");
                function.m78601a(this.f105444x, AbstractC26525l.f105448a);
                function.m78603c(this.f105445y, AbstractC26525l.f105449b, AbstractC26525l.f105450c);
                EnumC39374q enumC39374q2 = EnumC39374q.f169426w;
                break;
        }
        return C23454a0.f92919a;
    }
}
