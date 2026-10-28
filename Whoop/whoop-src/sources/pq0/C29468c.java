package pq0;

import bc3.InterfaceC2994c0;
import hj0.AbstractC17356o;
import or2.C28180m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pq0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lpq0/c;", "Lhj0/o;", "Lbc3/c0;", "coroutineScope", "<init>", "(Lbc3/c0;)V", "", "E", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Lpq0/h;", "F", "Lpq0/h;", "getShareWidgetButtonViewState", "()Lpq0/h;", "shareWidgetButtonViewState", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29468c extends AbstractC17356o {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C29473h shareWidgetButtonViewState;

    /* JADX WARN: Multi-variable type inference failed */
    public C29468c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29468c(InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.logTag = "GlobalShareButtonViewModel";
        this.shareWidgetButtonViewState = new C29473h(null, null, 3, null);
    }

    public /* synthetic */ C29468c(InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
