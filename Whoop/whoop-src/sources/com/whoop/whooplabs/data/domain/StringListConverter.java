package com.whoop.whooplabs.data.domain;

import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/StringListConverter;", "", "<init>", "()V", "fromStringList", "", "value", "", "toStringList", "Companion", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StringListConverter {
    public static final int $stable = 0;
    public static final String SEPARATOR = "__,__";

    public final String fromStringList(List<String> value) {
        AbstractC22676k.m65750j(value, "value");
        return AbstractC25265s.m74110N0(value, SEPARATOR, null, null, null, 62);
    }

    public final List<String> toStringList(String value) {
        AbstractC22676k.m65750j(value, "value");
        return AbstractC39414r.m125906y0(value, new String[]{SEPARATOR}, 6);
    }
}
