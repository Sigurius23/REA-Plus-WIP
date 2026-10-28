package live.hms.video.utils;

import bc3.C2986a0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m65681d2 = {"exceptionSurfacer", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "tag", "", "lib_release"}, m65682k = 2, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class CoroutineExceptionTrackerKt {
    public static final CoroutineExceptionHandler exceptionSurfacer(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        return new C24395xf88f56d(C2986a0.f11990w, tag);
    }
}
