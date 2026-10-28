package com.whoop.domain.model;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import uv0.AbstractC35283c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/domain/model/Gender;", "", "value", "", "displayResId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getValue", "()Ljava/lang/String;", "getDisplayResId", "()I", "MALE", "FEMALE", "NON_BINARY", "PREFER_NOT_TO_SAY", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum Gender {
    MALE("male", AbstractC35283c.f150179Q),
    FEMALE("female", AbstractC35283c.f150177O),
    NON_BINARY("non-binary", AbstractC35283c.f150181S),
    PREFER_NOT_TO_SAY("i prefer not to choose", AbstractC35283c.f150182T);

    private final int displayResId;
    private final String value;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/Gender$Companion;", "", "<init>", "()V", "fromName", "Lcom/whoop/domain/model/Gender;", "value", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0021  */
        public final Gender fromName(String value) {
            AbstractC22676k.m65750j(value, "value");
            for (Gender gender : Gender.values()) {
                if (AbstractC22676k.m65745e(gender.getValue(), value)) {
                    if (gender != null) {
                        return gender;
                    }
                    throw new IllegalArgumentException("No gender with value ".concat(value));
                }
            }
            gender = null;
            if (gender != null) {
                return gender;
            }
            throw new IllegalArgumentException("No gender with value ".concat(value));
        }

        private Companion() {
        }
    }

    Gender(String str, int i13) {
        this.value = str;
        this.displayResId = i13;
    }

    public static final Gender fromName(String str) {
        return INSTANCE.fromName(str);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getDisplayResId() {
        return this.displayResId;
    }

    public final String getValue() {
        return this.value;
    }
}
