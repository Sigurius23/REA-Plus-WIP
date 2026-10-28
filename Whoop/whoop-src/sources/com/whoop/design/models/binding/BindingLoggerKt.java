package com.whoop.design.models.binding;

import java.util.Map;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", "", "propertyName", "resolveContentBindingKey", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "field", "stateKey", "", "value", "Ll83/a0;", "logContentBinding", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BindingLoggerKt {
    public static final void logContentBinding(String field, String stateKey, Object obj) {
        AbstractC22676k.m65750j(field, "field");
        AbstractC22676k.m65750j(stateKey, "stateKey");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("JdslBinding");
        StringBuilder sbM32001t = AbstractC11895b.m32001t("content_binding field=", field, " key=", stateKey, " value=");
        sbM32001t.append(obj);
        interfaceC34116nM107848a.mo85228t(sbM32001t.toString(), new AbstractC30556a.a[0]);
    }

    public static final String resolveContentBindingKey(Map<String, String> map, String propertyName) {
        AbstractC22676k.m65750j(map, "<this>");
        AbstractC22676k.m65750j(propertyName, "propertyName");
        String str = map.get(propertyName);
        return str == null ? map.get(AggregateBindingKt.camelToSnakeCase(propertyName)) : str;
    }
}
