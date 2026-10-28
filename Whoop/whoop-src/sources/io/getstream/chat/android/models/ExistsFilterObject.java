package io.getstream.chat.android.models;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/models/ExistsFilterObject;", "Lio/getstream/chat/android/models/FilterObject;", "fieldName", "", "<init>", "(Ljava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "component1", "copy", "copy$stream_chat_android_core", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ExistsFilterObject extends FilterObject {
    private final String fieldName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExistsFilterObject(String fieldName) {
        super(null);
        AbstractC22676k.m65750j(fieldName, "fieldName");
        this.fieldName = fieldName;
    }

    public static /* synthetic */ ExistsFilterObject copy$stream_chat_android_core$default(ExistsFilterObject existsFilterObject, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = existsFilterObject.fieldName;
        }
        return existsFilterObject.copy$stream_chat_android_core(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFieldName() {
        return this.fieldName;
    }

    public final ExistsFilterObject copy$stream_chat_android_core(String fieldName) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        return new ExistsFilterObject(fieldName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExistsFilterObject) && AbstractC22676k.m65745e(this.fieldName, ((ExistsFilterObject) other).fieldName);
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public int hashCode() {
        return this.fieldName.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("ExistsFilterObject(fieldName=", this.fieldName, ")");
    }
}
