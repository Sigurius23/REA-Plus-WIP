package com.whoop.data.local.room.entity;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\n¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/GpsMetaDataDto;", "", "start", "", "end", "<init>", "(JJ)V", "getStart", "()J", "setStart", "(J)V", "getEnd", "setEnd", "id", "getId", "setId", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GpsMetaDataDto {
    private long end;
    private long id;
    private long start;

    public GpsMetaDataDto(long j7, long j13) {
        this.start = j7;
        this.end = j13;
    }

    public final long getEnd() {
        return this.end;
    }

    public final long getId() {
        return this.id;
    }

    public final long getStart() {
        return this.start;
    }

    public final void setEnd(long j7) {
        this.end = j7;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setStart(long j7) {
        this.start = j7;
    }
}
