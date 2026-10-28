package e60;

import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import j02.AbstractC21155m0;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: e60.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "pipeline", "Lj02/m0$m1;", "a", "(Ljava/lang/String;)Lj02/m0$m1;", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12757b {
    /* JADX INFO: renamed from: a */
    public static final AbstractC21155m0.m1 m35702a(String pipeline) {
        AbstractC22676k.m65750j(pipeline, "pipeline");
        return new AbstractC21155m0.m1(new ApiRequest("access-service/v1/reconfirm-labs/polling?pipeline=".concat(pipeline), (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, 1022, null);
    }
}
