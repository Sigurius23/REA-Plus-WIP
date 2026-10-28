package com.mapbox.common.loader;

import androidx.annotation.Keep;
import com.mapbox.common.module.LibraryLoader;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/mapbox/common/loader/MapboxLibraryLoader;", "Lcom/mapbox/common/module/LibraryLoader;", "<init>", "()V", "", "libraryName", "Ll83/a0;", "load", "(Ljava/lang/String;)V", "libloader_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxLibraryLoader implements LibraryLoader {
    public static final MapboxLibraryLoader INSTANCE = new MapboxLibraryLoader();

    private MapboxLibraryLoader() {
    }

    @Override // com.mapbox.common.module.LibraryLoader
    public void load(String libraryName) {
        AbstractC22676k.m65750j(libraryName, "libraryName");
        System.loadLibrary(libraryName);
    }
}
