package com.whoop.personalrecords.miniarch.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ou1.C28376a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eB[\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010#JV\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b6\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b7\u0010#¨\u0006:"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;", "", "", "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;", "tiles", "", "showMore", "", "nextExerciseOffset", "", "nextEndDate", "nextStartDate", "analyticsAction", "<init>", "(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$personal_records_mini_arch_release", "(Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/String;", "component5", "component6", "copy", "(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTiles", "Z", "getShowMore", "Ljava/lang/Integer;", "getNextExerciseOffset", "Ljava/lang/String;", "getNextEndDate", "getNextStartDate", "getAnalyticsAction", "Companion", "$serializer", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PersonalRecordsModel {
    private final String analyticsAction;
    private final String nextEndDate;
    private final Integer nextExerciseOffset;
    private final String nextStartDate;
    private final boolean showMore;
    private final List<PersonalRecordsExerciseDto> tiles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C28376a(15)), null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;", "serializer", "()Lwc3/c;", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PersonalRecordsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PersonalRecordsModel(int i13, List list, boolean z4, Integer num, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, PersonalRecordsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.tiles = list;
        this.showMore = z4;
        this.nextExerciseOffset = num;
        this.nextEndDate = str;
        this.nextStartDate = str2;
        if ((i13 & 32) == 0) {
            this.analyticsAction = null;
        } else {
            this.analyticsAction = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(PersonalRecordsExerciseDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PersonalRecordsModel copy$default(PersonalRecordsModel personalRecordsModel, List list, boolean z4, Integer num, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = personalRecordsModel.tiles;
        }
        if ((i13 & 2) != 0) {
            z4 = personalRecordsModel.showMore;
        }
        if ((i13 & 4) != 0) {
            num = personalRecordsModel.nextExerciseOffset;
        }
        if ((i13 & 8) != 0) {
            str = personalRecordsModel.nextEndDate;
        }
        if ((i13 & 16) != 0) {
            str2 = personalRecordsModel.nextStartDate;
        }
        if ((i13 & 32) != 0) {
            str3 = personalRecordsModel.analyticsAction;
        }
        String str4 = str2;
        String str5 = str3;
        return personalRecordsModel.copy(list, z4, num, str, str4, str5);
    }

    public static final /* synthetic */ void write$Self$personal_records_mini_arch_release(PersonalRecordsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.tiles);
        output.encodeBooleanElement(serialDesc, 1, self.showMore);
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.nextExerciseOffset);
        output.encodeStringElement(serialDesc, 3, self.nextEndDate);
        output.encodeStringElement(serialDesc, 4, self.nextStartDate);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.analyticsAction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.analyticsAction);
    }

    public final List<PersonalRecordsExerciseDto> component1() {
        return this.tiles;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowMore() {
        return this.showMore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getNextExerciseOffset() {
        return this.nextExerciseOffset;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNextEndDate() {
        return this.nextEndDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNextStartDate() {
        return this.nextStartDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAnalyticsAction() {
        return this.analyticsAction;
    }

    public final PersonalRecordsModel copy(List<PersonalRecordsExerciseDto> tiles, boolean showMore, Integer nextExerciseOffset, String nextEndDate, String nextStartDate, String analyticsAction) {
        AbstractC22676k.m65750j(tiles, "tiles");
        AbstractC22676k.m65750j(nextEndDate, "nextEndDate");
        AbstractC22676k.m65750j(nextStartDate, "nextStartDate");
        return new PersonalRecordsModel(tiles, showMore, nextExerciseOffset, nextEndDate, nextStartDate, analyticsAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalRecordsModel)) {
            return false;
        }
        PersonalRecordsModel personalRecordsModel = (PersonalRecordsModel) other;
        return AbstractC22676k.m65745e(this.tiles, personalRecordsModel.tiles) && this.showMore == personalRecordsModel.showMore && AbstractC22676k.m65745e(this.nextExerciseOffset, personalRecordsModel.nextExerciseOffset) && AbstractC22676k.m65745e(this.nextEndDate, personalRecordsModel.nextEndDate) && AbstractC22676k.m65745e(this.nextStartDate, personalRecordsModel.nextStartDate) && AbstractC22676k.m65745e(this.analyticsAction, personalRecordsModel.analyticsAction);
    }

    public final String getAnalyticsAction() {
        return this.analyticsAction;
    }

    public final String getNextEndDate() {
        return this.nextEndDate;
    }

    public final Integer getNextExerciseOffset() {
        return this.nextExerciseOffset;
    }

    public final String getNextStartDate() {
        return this.nextStartDate;
    }

    public final boolean getShowMore() {
        return this.showMore;
    }

    public final List<PersonalRecordsExerciseDto> getTiles() {
        return this.tiles;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.tiles.hashCode() * 31, 31, this.showMore);
        Integer num = this.nextExerciseOffset;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM8289b + (num == null ? 0 : num.hashCode())) * 31, 31, this.nextEndDate), 31, this.nextStartDate);
        String str = this.analyticsAction;
        return iM30450d + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        List<PersonalRecordsExerciseDto> list = this.tiles;
        boolean z4 = this.showMore;
        Integer num = this.nextExerciseOffset;
        String str = this.nextEndDate;
        String str2 = this.nextStartDate;
        String str3 = this.analyticsAction;
        StringBuilder sb4 = new StringBuilder("PersonalRecordsModel(tiles=");
        sb4.append(list);
        sb4.append(", showMore=");
        sb4.append(z4);
        sb4.append(", nextExerciseOffset=");
        AbstractC13673n.m38577x(num, ", nextEndDate=", str, ", nextStartDate=", sb4);
        return AbstractC11266d.m30464r(sb4, str2, ", analyticsAction=", str3, ")");
    }

    public PersonalRecordsModel(List<PersonalRecordsExerciseDto> tiles, boolean z4, Integer num, String nextEndDate, String nextStartDate, String str) {
        AbstractC22676k.m65750j(tiles, "tiles");
        AbstractC22676k.m65750j(nextEndDate, "nextEndDate");
        AbstractC22676k.m65750j(nextStartDate, "nextStartDate");
        this.tiles = tiles;
        this.showMore = z4;
        this.nextExerciseOffset = num;
        this.nextEndDate = nextEndDate;
        this.nextStartDate = nextStartDate;
        this.analyticsAction = str;
    }

    public /* synthetic */ PersonalRecordsModel(List list, boolean z4, Integer num, String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z4, num, str, str2, (i13 & 32) != 0 ? null : str3);
    }
}
