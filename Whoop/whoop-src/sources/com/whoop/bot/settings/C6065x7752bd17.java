package com.whoop.bot.settings;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6065x7752bd17 implements Function1 {
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $key;

    public C6065x7752bd17(Function1 function1, List list) {
        this.$key = function1;
        this.$items = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i13) {
        return this.$key.invoke(this.$items.get(i13));
    }
}
