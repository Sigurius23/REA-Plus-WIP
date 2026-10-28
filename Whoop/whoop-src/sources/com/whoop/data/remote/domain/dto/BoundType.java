package com.whoop.data.remote.domain.dto;

import ge3.AbstractC15751g;
import java.util.NoSuchElementException;
import java.util.Set;
import m83.AbstractC25260n;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\nj\u0002\b\u000b¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/BoundType;", "", "lowerChar", "", "upperChar", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getLowerChar", "()Ljava/lang/String;", "getUpperChar", "OPEN", "CLOSED", "chars", "", "getChars", "()Ljava/util/Set;", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum BoundType {
    OPEN("(", ")"),
    CLOSED("[", "]");

    private final Set<String> chars;
    private final String lowerChar;
    private final String upperChar;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] acceptableValues = {"(", ")", "[", "]"};

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/BoundType$Companion;", "", "<init>", "()V", "acceptableValues", "", "", "[Ljava/lang/String;", "fromBound", "Lcom/whoop/data/remote/domain/dto/BoundType;", "bound", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BoundType fromBound(String bound) {
            AbstractC22676k.m65750j(bound, "bound");
            if (!AbstractC25260n.m74056a0(BoundType.acceptableValues, bound)) {
                throw new IllegalArgumentException(AbstractC11895b.m31996o("Bound was ", bound, ", but must be (, ), [, or ]").toString());
            }
            for (BoundType boundType : BoundType.values()) {
                if (boundType.getChars().contains(bound)) {
                    return boundType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    BoundType(String str, String str2) {
        this.lowerChar = str;
        this.upperChar = str2;
        this.chars = AbstractC25260n.m74059b1(new String[]{str, str2});
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final Set<String> getChars() {
        return this.chars;
    }

    public final String getLowerChar() {
        return this.lowerChar;
    }

    public final String getUpperChar() {
        return this.upperChar;
    }
}
