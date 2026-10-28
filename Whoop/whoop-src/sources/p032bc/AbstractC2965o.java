package p032bc;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: bc.o */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2965o {
    /* JADX INFO: renamed from: a */
    public static <T, V> ObjectAnimator m8637a(T t14, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t14, property, (TypeConverter) null, path);
    }
}
