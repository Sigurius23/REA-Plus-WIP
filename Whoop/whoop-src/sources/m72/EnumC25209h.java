package m72;

import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p719m22.C24947b;
import t83.InterfaceC33616a;
import x81.C38072d;

/* JADX INFO: renamed from: m72.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Lm72/h;", "", "Lkotlin/Function0;", "Lb91/a;", "getStyle", "<init>", "(Ljava/lang/String;ILc93/m;)V", "Lc93/m;", "getGetStyle", "()Lc93/m;", "LARGE", "SMALL", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC25209h {
    LARGE(new C24947b(1)),
    SMALL(new C24947b(2));

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final InterfaceC4351m getStyle;

    EnumC25209h(InterfaceC4351m interfaceC4351m) {
        this.getStyle = interfaceC4351m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2886a _init_$lambda$0(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-536904622);
        C2886a t14 = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT3();
        c28655q.m87173q(false);
        return t14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2886a _init_$lambda$1(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1149493534);
        C2886a sh4 = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getSh4();
        c28655q.m87173q(false);
        return sh4;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final InterfaceC4351m getGetStyle() {
        return this.getStyle;
    }
}
