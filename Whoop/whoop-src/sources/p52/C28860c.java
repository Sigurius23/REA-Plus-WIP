package p52;

import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractC1354v1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import o52.C27542a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p52.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lp52/c;", "Landroidx/fragment/app/v1;", "Landroidx/fragment/app/o1;", "fragmentManager", "", "isSleep", "<init>", "(Landroidx/fragment/app/o1;Z)V", "", "position", "Landroidx/fragment/app/m0;", "t", "(I)Landroidx/fragment/app/m0;", "d", "()I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28860c extends AbstractC1354v1 {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isSleep;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28860c(AbstractC1329o1 fragmentManager, boolean z4) {
        super(fragmentManager);
        AbstractC22676k.m65750j(fragmentManager, "fragmentManager");
        this.isSleep = z4;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: d */
    public int mo28901d() {
        return 1;
    }

    @Override // androidx.fragment.app.AbstractC1354v1
    /* JADX INFO: renamed from: t */
    public AbstractComponentCallbacksC1320m0 mo4240t(int position) {
        return this.isSleep ? C27542a0.INSTANCE.m83101b() : C27542a0.INSTANCE.m83100a();
    }
}
