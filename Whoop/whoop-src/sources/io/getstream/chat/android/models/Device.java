package io.getstream.chat.android.models;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/models/Device;", "", "token", "", "pushProvider", "Lio/getstream/chat/android/models/PushProvider;", "providerName", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/models/PushProvider;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getPushProvider", "()Lio/getstream/chat/android/models/PushProvider;", "getProviderName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Device {
    private final String providerName;
    private final PushProvider pushProvider;
    private final String token;

    public Device(String token, PushProvider pushProvider, String str) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(pushProvider, "pushProvider");
        this.token = token;
        this.pushProvider = pushProvider;
        this.providerName = str;
    }

    public static /* synthetic */ Device copy$default(Device device, String str, PushProvider pushProvider, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = device.token;
        }
        if ((i13 & 2) != 0) {
            pushProvider = device.pushProvider;
        }
        if ((i13 & 4) != 0) {
            str2 = device.providerName;
        }
        return device.copy(str, pushProvider, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PushProvider getPushProvider() {
        return this.pushProvider;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProviderName() {
        return this.providerName;
    }

    public final Device copy(String token, PushProvider pushProvider, String providerName) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(pushProvider, "pushProvider");
        return new Device(token, pushProvider, providerName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Device)) {
            return false;
        }
        Device device = (Device) other;
        return AbstractC22676k.m65745e(this.token, device.token) && this.pushProvider == device.pushProvider && AbstractC22676k.m65745e(this.providerName, device.providerName);
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final PushProvider getPushProvider() {
        return this.pushProvider;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iHashCode = (this.pushProvider.hashCode() + (this.token.hashCode() * 31)) * 31;
        String str = this.providerName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.token;
        PushProvider pushProvider = this.pushProvider;
        String str2 = this.providerName;
        StringBuilder sb4 = new StringBuilder("Device(token=");
        sb4.append(str);
        sb4.append(", pushProvider=");
        sb4.append(pushProvider);
        sb4.append(", providerName=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
