package io.getstream.chat.android.client.internal.file;

import java.io.File;
import java.util.Comparator;
import p715kotlin.Metadata;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.file.StreamFileManager$evictCacheFiles$2$invokeSuspend$$inlined$sortBy$1 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class C19094xf9a3cc34<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t14, T t15) {
        return AbstractC30060g.m92127q(Long.valueOf(((File) t14).lastModified()), Long.valueOf(((File) t15).lastModified()));
    }
}
