package zt0;

import ad3.AbstractC0757c;
import ad3.C0755b;
import com.whoop.connectivityDataPacketsModels.console.dto.ConsolePacketsMetadata;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xc3.AbstractC38195a;

/* JADX INFO: renamed from: zt0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lzt0/c;", "", "<init>", "()V", "Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;", "metadata", "", "a", "(Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;)Ljava/lang/String;", "json", "b", "(Ljava/lang/String;)Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41125c {
    /* JADX INFO: renamed from: a */
    public final String m133514a(ConsolePacketsMetadata metadata) {
        C0755b c0755b = AbstractC0757c.f2762d;
        c0755b.getClass();
        return c0755b.m1833d(AbstractC38195a.m122336d(ConsolePacketsMetadata.INSTANCE.serializer()), metadata);
    }

    /* JADX INFO: renamed from: b */
    public final ConsolePacketsMetadata m133515b(String json) {
        AbstractC22676k.m65750j(json, "json");
        C0755b c0755b = AbstractC0757c.f2762d;
        c0755b.getClass();
        return (ConsolePacketsMetadata) c0755b.m1831b(AbstractC38195a.m122336d(ConsolePacketsMetadata.INSTANCE.serializer()), json);
    }
}
