package com.whoop.profile.view.edit;

import c93.InterfaceC4351m;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$1 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9755x169524a0 implements Function1 {
    final /* synthetic */ List $items;
    final /* synthetic */ InterfaceC4351m $key;

    public C9755x169524a0(InterfaceC4351m interfaceC4351m, List list) {
        this.$key = interfaceC4351m;
        this.$items = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i13) {
        return this.$key.invoke(Integer.valueOf(i13), this.$items.get(i13));
    }
}
