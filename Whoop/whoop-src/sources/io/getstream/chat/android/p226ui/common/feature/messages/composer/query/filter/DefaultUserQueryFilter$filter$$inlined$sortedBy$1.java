package io.getstream.chat.android.p226ui.common.feature.messages.composer.query.filter;

import java.util.Comparator;
import l83.C23465k;
import p715kotlin.Metadata;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DefaultUserQueryFilter$filter$$inlined$sortedBy$1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t14, T t15) {
        return AbstractC30060g.m92127q(Integer.valueOf(((Number) ((C23465k) t14).f92938x).intValue()), Integer.valueOf(((Number) ((C23465k) t15).f92938x).intValue()));
    }
}
