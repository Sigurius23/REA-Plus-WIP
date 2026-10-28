package com.whoop.p069ui.login;

import an2.AbstractC1058a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Comparator;
import java.util.List;
import m83.AbstractC25265s;
import p000.C28503p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/ui/login/MissingImportantAppInfoException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "Lcom/whoop/ui/login/ImportantAppInfo;", "missingItems", "<init>", "(Ljava/util/List;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "metricValue", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MissingImportantAppInfoException extends IllegalStateException {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String metricValue;

    /* JADX INFO: renamed from: com.whoop.ui.login.MissingImportantAppInfoException$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10595a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(Integer.valueOf(((ImportantAppInfo) t14).getShortId()), Integer.valueOf(((ImportantAppInfo) t15).getShortId()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingImportantAppInfoException(List<? extends ImportantAppInfo> missingItems) {
        super(AbstractC1058a.m3132b(missingItems));
        AbstractC22676k.m65750j(missingItems, "missingItems");
        this.metricValue = AbstractC25265s.m74110N0(AbstractC25265s.m74152u1(missingItems, new C10595a()), null, null, null, new C28503p(26), 31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final CharSequence m27333c(ImportantAppInfo it) {
        AbstractC22676k.m65750j(it, "it");
        return String.valueOf(it.getShortId());
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMetricValue() {
        return this.metricValue;
    }
}
