package com.whoop.data.repositories;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&J+\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0002\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/repositories/StringsRepository;", "", "getString", "", "resourceId", "", "args", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface StringsRepository {
    String getString(int resourceId);

    String getString(int resourceId, Object... args);
}
