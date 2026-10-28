package gu0;

import ad3.AbstractC0757c;
import ad3.C0764g;
import com.whoop.connectivityDataPacketsModels.firmware.rawdata.rev2.dto.Rev2DataSettingsMetadata;
import go1.C16016a;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gu0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lgu0/b;", "", "<init>", "()V", "Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;", "metadata", "", "d", "(Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;)Ljava/lang/String;", "json", "b", "(Ljava/lang/String;)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;", "a", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16210b {

    /* JADX INFO: renamed from: a */
    private static final a f61563a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final AbstractC0757c f61564b = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C16016a(14));

    /* JADX INFO: renamed from: gu0.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgu0/b$a;", "", "<init>", "()V", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m45890c(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2776c = true;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final Rev2DataSettingsMetadata m45891b(String json) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC0757c abstractC0757c = f61564b;
        abstractC0757c.getClass();
        return (Rev2DataSettingsMetadata) abstractC0757c.m1831b(Rev2DataSettingsMetadata.INSTANCE.serializer(), json);
    }

    /* JADX INFO: renamed from: d */
    public final String m45892d(Rev2DataSettingsMetadata metadata) {
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC0757c abstractC0757c = f61564b;
        abstractC0757c.getClass();
        return abstractC0757c.m1833d(Rev2DataSettingsMetadata.INSTANCE.serializer(), metadata);
    }
}
