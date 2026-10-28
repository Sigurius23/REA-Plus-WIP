package io.getstream.chat.android.models;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\"\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÀ\u0001¢\u0006\u0002\b\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/models/GreaterThanOrEqualsFilterObject;", "Lio/getstream/chat/android/models/FilterObject;", "fieldName", "", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getFieldName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "copy$stream_chat_android_core", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class GreaterThanOrEqualsFilterObject extends FilterObject {
    private final String fieldName;
    private final Object value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GreaterThanOrEqualsFilterObject(String fieldName, Object value) {
        super(null);
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(value, "value");
        this.fieldName = fieldName;
        this.value = value;
    }

    public static /* synthetic */ GreaterThanOrEqualsFilterObject copy$stream_chat_android_core$default(GreaterThanOrEqualsFilterObject greaterThanOrEqualsFilterObject, String str, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            str = greaterThanOrEqualsFilterObject.fieldName;
        }
        if ((i13 & 2) != 0) {
            obj = greaterThanOrEqualsFilterObject.value;
        }
        return greaterThanOrEqualsFilterObject.copy$stream_chat_android_core(str, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFieldName() {
        return this.fieldName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final GreaterThanOrEqualsFilterObject copy$stream_chat_android_core(String fieldName, Object value) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(value, "value");
        return new GreaterThanOrEqualsFilterObject(fieldName, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GreaterThanOrEqualsFilterObject)) {
            return false;
        }
        GreaterThanOrEqualsFilterObject greaterThanOrEqualsFilterObject = (GreaterThanOrEqualsFilterObject) other;
        return AbstractC22676k.m65745e(this.fieldName, greaterThanOrEqualsFilterObject.fieldName) && AbstractC22676k.m65745e(this.value, greaterThanOrEqualsFilterObject.value);
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.fieldName.hashCode() * 31);
    }

    public String toString() {
        return "GreaterThanOrEqualsFilterObject(fieldName=" + this.fieldName + ", value=" + this.value + ")";
    }
}
