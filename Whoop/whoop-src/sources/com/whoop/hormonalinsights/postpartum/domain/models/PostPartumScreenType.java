package com.whoop.hormonalinsights.postpartum.domain.models;

import ge3.AbstractC15751g;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", "", HMSTrackSource.SCREEN, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getScreen", "()Ljava/lang/String;", "ALL", "WEIGHTS", "DELIVERY_DATE", "NAME", "DELIVERY_METHOD", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum PostPartumScreenType {
    ALL("ALL"),
    WEIGHTS("WEIGHTS"),
    DELIVERY_DATE("DELIVERY_DATE"),
    NAME("NAME"),
    DELIVERY_METHOD("DELIVERY_METHOD");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String screen;

    PostPartumScreenType(String str) {
        this.screen = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getScreen() {
        return this.screen;
    }
}
