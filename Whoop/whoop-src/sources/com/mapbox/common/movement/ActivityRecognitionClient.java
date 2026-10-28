package com.mapbox.common.movement;

import com.mapbox.common.MovementInfo;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001:\u0001\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lcom/mapbox/common/movement/ActivityRecognitionClient;", "", "", "isPlatformActivityRecognitionAvailable", "()Z", "Ll83/a0;", "start", "()V", "stop", "Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;", "observer", "addObserver", "(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V", "removeObserver", "Observer", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface ActivityRecognitionClient {

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;", "", "Lcom/mapbox/common/MovementInfo;", "info", "Ll83/a0;", "onMovementInfo", "(Lcom/mapbox/common/MovementInfo;)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public interface Observer {
        void onMovementInfo(MovementInfo info);
    }

    void addObserver(Observer observer);

    boolean isPlatformActivityRecognitionAvailable();

    void removeObserver(Observer observer);

    void start();

    void stop();
}
