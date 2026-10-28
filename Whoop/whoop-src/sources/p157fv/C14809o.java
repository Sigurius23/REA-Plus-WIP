package p157fv;

import android.animation.AnimatorSet;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.threading.AnimationThreadController;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fv.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C14809o implements Cancelable {

    /* JADX INFO: renamed from: a */
    public final String f54991a;

    /* JADX INFO: renamed from: b */
    public final AnimatorSet f54992b;

    public C14809o(String str, AnimatorSet animatorSet) {
        this.f54991a = str;
        this.f54992b = animatorSet;
    }

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C14798d(this, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14809o)) {
            return false;
        }
        C14809o c14809o = (C14809o) obj;
        return AbstractC22676k.m65745e(this.f54991a, c14809o.f54991a) && AbstractC22676k.m65745e(this.f54992b, c14809o.f54992b);
    }

    public final int hashCode() {
        String str = this.f54991a;
        return this.f54992b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "HighLevelAnimatorSet(owner=" + this.f54991a + ", animatorSet=" + this.f54992b + ')';
    }
}
