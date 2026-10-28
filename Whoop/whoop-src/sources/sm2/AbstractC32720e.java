package sm2;

import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.viewpager2.adapter.AbstractC1861i;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sm2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\tR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006\""}, m65681d2 = {"Lsm2/e;", "Landroidx/viewpager2/adapter/i;", "Landroidx/fragment/app/m0;", "fragment", "<init>", "(Landroidx/fragment/app/m0;)V", "", "position", "createFragment", "(I)Landroidx/fragment/app/m0;", "", "getItemId", "(I)J", "d", "", "a", "Ljava/util/Map;", "getFragmentMap", "()Ljava/util/Map;", "fragmentMap", "Ljava/lang/ref/WeakReference;", "", "b", "Ljava/lang/ref/WeakReference;", "listener", "Landroidx/fragment/app/o1;", "c", "Landroidx/fragment/app/o1;", "getFragmentManager", "()Landroidx/fragment/app/o1;", "fragmentManager", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "expectedItemCount", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32720e extends AbstractC1861i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<Integer, AbstractComponentCallbacksC1320m0> fragmentMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private WeakReference<Object> listener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC1329o1 fragmentManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Integer expectedItemCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC32720e(AbstractComponentCallbacksC1320m0 fragment) {
        super(fragment);
        AbstractC22676k.m65750j(fragment, "fragment");
        this.fragmentMap = new WeakHashMap();
        AbstractC1329o1 childFragmentManager = fragment.getChildFragmentManager();
        AbstractC22676k.m65749i(childFragmentManager, "getChildFragmentManager(...)");
        this.fragmentManager = childFragmentManager;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public Integer getExpectedItemCount() {
        return this.expectedItemCount;
    }

    @Override // androidx.viewpager2.adapter.AbstractC1861i
    public AbstractComponentCallbacksC1320m0 createFragment(int position) {
        WeakReference<Object> weakReference;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0Mo100815d = mo100815d(position);
        this.fragmentMap.put(Integer.valueOf(position), abstractComponentCallbacksC1320m0Mo100815d);
        int size = this.fragmentMap.size();
        Integer expectedItemCount = getExpectedItemCount();
        if (expectedItemCount == null || size != expectedItemCount.intValue() || (weakReference = this.listener) == null || weakReference.get() == null) {
            return abstractComponentCallbacksC1320m0Mo100815d;
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractComponentCallbacksC1320m0 mo100815d(int position);

    @Override // androidx.viewpager2.adapter.AbstractC1861i, androidx.recyclerview.widget.AbstractC1692i1
    public long getItemId(int position) {
        return position;
    }
}
