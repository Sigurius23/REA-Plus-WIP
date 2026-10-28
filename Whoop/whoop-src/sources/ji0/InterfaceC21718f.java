package ji0;

import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.data.remote.AppConfigurationRepository;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ji0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015À\u0006\u0003"}, m65681d2 = {"Lji0/f;", "Lcom/whoop/data/remote/AppConfigurationRepository;", "Lcom/whoop/appconfiguration/TabConfiguration;", "b", "()Lcom/whoop/appconfiguration/TabConfiguration;", "", "tabId", "", "a", "(Ljava/lang/String;)Z", "c", "(Ljava/lang/String;)Lcom/whoop/appconfiguration/TabConfiguration;", "Lec3/f2;", "", "d", "()Lec3/f2;", "tabsFlow", "Lec3/l;", "e", "()Lec3/l;", "shouldFetchAiContextFlow", "app-configuration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC21718f extends AppConfigurationRepository {
    /* JADX INFO: renamed from: a */
    boolean mo61185a(String tabId);

    /* JADX INFO: renamed from: b */
    TabConfiguration mo61186b();

    /* JADX INFO: renamed from: c */
    TabConfiguration mo61187c(String tabId);

    /* JADX INFO: renamed from: d */
    InterfaceC13037f2 mo61188d();

    /* JADX INFO: renamed from: e */
    InterfaceC13058l mo61189e();
}
