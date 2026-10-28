package p524ui;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: ui.f */
/* JADX INFO: loaded from: classes.dex */
public final class C34978f extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f147994w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34981i f147995x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f147996y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34978f(C34981i c34981i, int i13, int i14) {
        super(1);
        this.f147994w = i14;
        this.f147995x = c34981i;
        this.f147996y = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f147994w) {
            case 0:
                return Boolean.valueOf(C34981i.m110467a(this.f147995x, this.f147996y, ((Number) obj).longValue()));
            default:
                return Boolean.valueOf(C34981i.m110467a(this.f147995x, this.f147996y, ((Number) obj).longValue()));
        }
    }
}
