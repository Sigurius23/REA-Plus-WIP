package com.whoop.weightlifting.data.domain;

import com.whoop.service.network.model.UserSessionDto;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;
import xr2.InterfaceC38631a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/StrapLocation;", "Lxr2/a;", "", "", "serializedValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getSerializedValue", "()Ljava/lang/String;", "Unknown", "Wrist", "Bicep", "SideTorso", "Glute", "Calf", "Ankle", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum StrapLocation implements InterfaceC38631a {
    Unknown(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE),
    Wrist(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE),
    Bicep("2"),
    SideTorso("3"),
    Glute("4"),
    Calf("5"),
    Ankle("6");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String serializedValue;

    StrapLocation(String str) {
        this.serializedValue = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    @Override // xr2.InterfaceC38631a
    public String getSerializedValue() {
        return this.serializedValue;
    }
}
