package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/navigation/SanguineWaitlistScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "source", "", "signUpOnEntry", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/SanguineWaitlistScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/navigation/SanguineWaitlistScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "Ljava/lang/Boolean;", "getSignUpOnEntry", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SanguineWaitlistScreenModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean signUpOnEntry;
    private final String source;

    /* JADX INFO: renamed from: com.whoop.navigation.SanguineWaitlistScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/SanguineWaitlistScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/SanguineWaitlistScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SanguineWaitlistScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SanguineWaitlistScreenModel() {
        this((String) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ SanguineWaitlistScreenModel copy$default(SanguineWaitlistScreenModel sanguineWaitlistScreenModel, String str, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sanguineWaitlistScreenModel.source;
        }
        if ((i13 & 2) != 0) {
            bool = sanguineWaitlistScreenModel.signUpOnEntry;
        }
        return sanguineWaitlistScreenModel.copy(str, bool);
    }

    public static final /* synthetic */ void write$Self$navigation_release(SanguineWaitlistScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.source != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.source);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.signUpOnEntry == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.signUpOnEntry);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSignUpOnEntry() {
        return this.signUpOnEntry;
    }

    public final SanguineWaitlistScreenModel copy(String source, Boolean signUpOnEntry) {
        return new SanguineWaitlistScreenModel(source, signUpOnEntry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SanguineWaitlistScreenModel)) {
            return false;
        }
        SanguineWaitlistScreenModel sanguineWaitlistScreenModel = (SanguineWaitlistScreenModel) other;
        return AbstractC22676k.m65745e(this.source, sanguineWaitlistScreenModel.source) && AbstractC22676k.m65745e(this.signUpOnEntry, sanguineWaitlistScreenModel.signUpOnEntry);
    }

    public final Boolean getSignUpOnEntry() {
        return this.signUpOnEntry;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.signUpOnEntry;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "SanguineWaitlistScreenModel(source=" + this.source + ", signUpOnEntry=" + this.signUpOnEntry + ")";
    }

    public /* synthetic */ SanguineWaitlistScreenModel(int i13, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.source = null;
        } else {
            this.source = str;
        }
        if ((i13 & 2) == 0) {
            this.signUpOnEntry = null;
        } else {
            this.signUpOnEntry = bool;
        }
    }

    public SanguineWaitlistScreenModel(String str, Boolean bool) {
        this.source = str;
        this.signUpOnEntry = bool;
    }

    public /* synthetic */ SanguineWaitlistScreenModel(String str, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : bool);
    }
}
