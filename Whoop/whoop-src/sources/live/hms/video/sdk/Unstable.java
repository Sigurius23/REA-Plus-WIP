package live.hms.video.sdk;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Retention(RetentionPolicy.RUNTIME)
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Llive/hms/video/sdk/Unstable;", "", "message", "", "()Ljava/lang/String;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public @interface Unstable {
    String message() default "This API is unstable and may not do what it implies. Please wait for a stable version.";
}
