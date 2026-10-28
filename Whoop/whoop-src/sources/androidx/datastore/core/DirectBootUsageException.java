package androidx.datastore.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Landroidx/datastore/core/DirectBootUsageException;", "Ljava/io/IOException;", "Landroidx/datastore/core/IOException;", "datastore-core"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class DirectBootUsageException extends IOException {

    /* JADX INFO: renamed from: w */
    public final String f5348w;

    public DirectBootUsageException(FileNotFoundException fileNotFoundException) {
        super(fileNotFoundException);
        this.f5348w = "Encountered a [" + fileNotFoundException.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f5348w;
    }
}
