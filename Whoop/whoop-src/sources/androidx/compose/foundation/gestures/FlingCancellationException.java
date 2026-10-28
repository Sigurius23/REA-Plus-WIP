package androidx.compose.foundation.gestures;

import androidx.compose.foundation.internal.PlatformOptimizedCancellationException;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Landroidx/compose/foundation/gestures/FlingCancellationException;", "Landroidx/compose/foundation/internal/PlatformOptimizedCancellationException;", "<init>", "()V", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class FlingCancellationException extends PlatformOptimizedCancellationException {
    public FlingCancellationException() {
        super("The fling animation was cancelled");
    }
}
