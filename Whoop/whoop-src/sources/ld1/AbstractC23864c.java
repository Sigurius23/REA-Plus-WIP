package ld1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.InterfaceC2994c0;
import ec3.InterfaceC13058l;
import or2.C28180m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ld1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H&¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lld1/c;", "VS", "VE", "Landroidx/lifecycle/w1;", "Lbc3/c0;", "viewModelScope", "<init>", "(Lbc3/c0;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "g", "(Ljava/lang/Object;)V", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23864c<VS, VE> extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w */
    public static final int f94380w = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC23864c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo1216g(VE event);

    public abstract InterfaceC13058l getViewState();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC23864c(InterfaceC2994c0 viewModelScope) {
        super(viewModelScope);
        AbstractC22676k.m65750j(viewModelScope, "viewModelScope");
    }

    public /* synthetic */ AbstractC23864c(InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
