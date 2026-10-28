package com.whoop.data.remote.domain.dto.growth;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import we1.C37224h;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0003-.,B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001b¨\u0006/"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;", "", "Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;", "lastSeenStrap", "orderedStrap", "", "previousStraps", "<init>", "(Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;", "component2", "component3", "()Ljava/util/List;", "copy", "(Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;", "getLastSeenStrap", "getOrderedStrap", "Ljava/util/List;", "getPreviousStraps", "Companion", "StrapDto", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserStrapsDto {

    @SerializedName("last_seen_strap")
    private final StrapDto lastSeenStrap;

    @SerializedName("ordered_strap")
    private final StrapDto orderedStrap;

    @SerializedName("previous_straps")
    private final List<StrapDto> previousStraps;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37224h(8))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserStrapsDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006)"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;", "", "", "generation", "serial", "firstSeen", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGeneration", "getSerial", "getFirstSeen", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class StrapDto {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @SerializedName("first_seen")
        private final String firstSeen;

        @SerializedName("generation")
        private final String generation;

        @SerializedName("serial")
        private final String serial;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return UserStrapsDto$StrapDto$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ StrapDto(int i13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i13 & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 7, UserStrapsDto$StrapDto$$serializer.INSTANCE.getDescriptor());
            }
            this.generation = str;
            this.serial = str2;
            this.firstSeen = str3;
        }

        public static /* synthetic */ StrapDto copy$default(StrapDto strapDto, String str, String str2, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = strapDto.generation;
            }
            if ((i13 & 2) != 0) {
                str2 = strapDto.serial;
            }
            if ((i13 & 4) != 0) {
                str3 = strapDto.firstSeen;
            }
            return strapDto.copy(str, str2, str3);
        }

        public static final /* synthetic */ void write$Self$core_release(StrapDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.generation);
            output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.serial);
            output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.firstSeen);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGeneration() {
            return this.generation;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSerial() {
            return this.serial;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFirstSeen() {
            return this.firstSeen;
        }

        public final StrapDto copy(String generation, String serial, String firstSeen) {
            return new StrapDto(generation, serial, firstSeen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StrapDto)) {
                return false;
            }
            StrapDto strapDto = (StrapDto) other;
            return AbstractC22676k.m65745e(this.generation, strapDto.generation) && AbstractC22676k.m65745e(this.serial, strapDto.serial) && AbstractC22676k.m65745e(this.firstSeen, strapDto.firstSeen);
        }

        public final String getFirstSeen() {
            return this.firstSeen;
        }

        public final String getGeneration() {
            return this.generation;
        }

        public final String getSerial() {
            return this.serial;
        }

        public int hashCode() {
            String str = this.generation;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.serial;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.firstSeen;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.firstSeen, ")", AbstractC11895b.m32001t("StrapDto(generation=", this.generation, ", serial=", this.serial, ", firstSeen="));
        }

        public StrapDto(String str, String str2, String str3) {
            this.generation = str;
            this.serial = str2;
            this.firstSeen = str3;
        }
    }

    public /* synthetic */ UserStrapsDto(int i13, StrapDto strapDto, StrapDto strapDto2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, UserStrapsDto$$serializer.INSTANCE.getDescriptor());
        }
        this.lastSeenStrap = strapDto;
        this.orderedStrap = strapDto2;
        this.previousStraps = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(UserStrapsDto$StrapDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserStrapsDto copy$default(UserStrapsDto userStrapsDto, StrapDto strapDto, StrapDto strapDto2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            strapDto = userStrapsDto.lastSeenStrap;
        }
        if ((i13 & 2) != 0) {
            strapDto2 = userStrapsDto.orderedStrap;
        }
        if ((i13 & 4) != 0) {
            list = userStrapsDto.previousStraps;
        }
        return userStrapsDto.copy(strapDto, strapDto2, list);
    }

    public static final /* synthetic */ void write$Self$core_release(UserStrapsDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        UserStrapsDto$StrapDto$$serializer userStrapsDto$StrapDto$$serializer = UserStrapsDto$StrapDto$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, userStrapsDto$StrapDto$$serializer, self.lastSeenStrap);
        output.encodeNullableSerializableElement(serialDesc, 1, userStrapsDto$StrapDto$$serializer, self.orderedStrap);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.previousStraps);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StrapDto getLastSeenStrap() {
        return this.lastSeenStrap;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StrapDto getOrderedStrap() {
        return this.orderedStrap;
    }

    public final List<StrapDto> component3() {
        return this.previousStraps;
    }

    public final UserStrapsDto copy(StrapDto lastSeenStrap, StrapDto orderedStrap, List<StrapDto> previousStraps) {
        return new UserStrapsDto(lastSeenStrap, orderedStrap, previousStraps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserStrapsDto)) {
            return false;
        }
        UserStrapsDto userStrapsDto = (UserStrapsDto) other;
        return AbstractC22676k.m65745e(this.lastSeenStrap, userStrapsDto.lastSeenStrap) && AbstractC22676k.m65745e(this.orderedStrap, userStrapsDto.orderedStrap) && AbstractC22676k.m65745e(this.previousStraps, userStrapsDto.previousStraps);
    }

    public final StrapDto getLastSeenStrap() {
        return this.lastSeenStrap;
    }

    public final StrapDto getOrderedStrap() {
        return this.orderedStrap;
    }

    public final List<StrapDto> getPreviousStraps() {
        return this.previousStraps;
    }

    public int hashCode() {
        StrapDto strapDto = this.lastSeenStrap;
        int iHashCode = (strapDto == null ? 0 : strapDto.hashCode()) * 31;
        StrapDto strapDto2 = this.orderedStrap;
        int iHashCode2 = (iHashCode + (strapDto2 == null ? 0 : strapDto2.hashCode())) * 31;
        List<StrapDto> list = this.previousStraps;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StrapDto strapDto = this.lastSeenStrap;
        StrapDto strapDto2 = this.orderedStrap;
        List<StrapDto> list = this.previousStraps;
        StringBuilder sb4 = new StringBuilder("UserStrapsDto(lastSeenStrap=");
        sb4.append(strapDto);
        sb4.append(", orderedStrap=");
        sb4.append(strapDto2);
        sb4.append(", previousStraps=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public UserStrapsDto(StrapDto strapDto, StrapDto strapDto2, List<StrapDto> list) {
        this.lastSeenStrap = strapDto;
        this.orderedStrap = strapDto2;
        this.previousStraps = list;
    }
}
