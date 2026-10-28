package com.mapbox.common;

/* JADX INFO: loaded from: classes.dex */
public interface ConfigurationServiceObserver {
    void didEncounterError(ConfigurationServiceError configurationServiceError);

    void didStartUpdate();

    void didUpdate(ConfigurationOptions configurationOptions);
}
