package com.mapbox.common.logger;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/mapbox/common/logger/LoggerObserver;", "", "", "level", "Lcom/mapbox/common/logger/LogEntry;", "entry", "Ll83/a0;", "log", "(ILcom/mapbox/common/logger/LogEntry;)V", "liblogger_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface LoggerObserver {
    void log(int level, LogEntry entry);
}
