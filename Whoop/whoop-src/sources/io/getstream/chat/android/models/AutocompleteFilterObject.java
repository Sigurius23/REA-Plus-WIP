package io.getstream.chat.android.models;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\"\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/models/AutocompleteFilterObject;", "Lio/getstream/chat/android/models/FilterObject;", "fieldName", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "copy$stream_chat_android_core", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AutocompleteFilterObject extends FilterObject {
    private final String fieldName;
    private final String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutocompleteFilterObject(String fieldName, String value) {
        super(null);
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(value, "value");
        this.fieldName = fieldName;
        this.value = value;
    }

    public static /* synthetic */ AutocompleteFilterObject copy$stream_chat_android_core$default(AutocompleteFilterObject autocompleteFilterObject, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = autocompleteFilterObject.fieldName;
        }
        if ((i13 & 2) != 0) {
            str2 = autocompleteFilterObject.value;
        }
        return autocompleteFilterObject.copy$stream_chat_android_core(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFieldName() {
        return this.fieldName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final AutocompleteFilterObject copy$stream_chat_android_core(String fieldName, String value) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(value, "value");
        return new AutocompleteFilterObject(fieldName, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutocompleteFilterObject)) {
            return false;
        }
        AutocompleteFilterObject autocompleteFilterObject = (AutocompleteFilterObject) other;
        return AbstractC22676k.m65745e(this.fieldName, autocompleteFilterObject.fieldName) && AbstractC22676k.m65745e(this.value, autocompleteFilterObject.value);
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.fieldName.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("AutocompleteFilterObject(fieldName=", this.fieldName, ", value=", this.value, ")");
    }
}
