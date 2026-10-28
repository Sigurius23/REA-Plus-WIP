package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dq2.C12293a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import vy2.C36604b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J4\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010 ¨\u00063"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;", "", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto;", "questions", "", "sessionId", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;", "config", "<init>", "(Ljava/util/List;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Lvy2/b;", "toDomain", "()Lvy2/b;", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;", "copy", "(Ljava/util/List;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getQuestions", "I", "getSessionId", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;", "getConfig", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CampaignScreeningResponse {
    private final ScreeningConfigDto config;
    private final List<ScreeningQuestionDto> questions;
    private final int sessionId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12293a(24)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CampaignScreeningResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CampaignScreeningResponse(int i13, List list, int i14, ScreeningConfigDto screeningConfigDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, CampaignScreeningResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.questions = list;
        this.sessionId = i14;
        this.config = screeningConfigDto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ScreeningQuestionDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignScreeningResponse copy$default(CampaignScreeningResponse campaignScreeningResponse, List list, int i13, ScreeningConfigDto screeningConfigDto, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            list = campaignScreeningResponse.questions;
        }
        if ((i14 & 2) != 0) {
            i13 = campaignScreeningResponse.sessionId;
        }
        if ((i14 & 4) != 0) {
            screeningConfigDto = campaignScreeningResponse.config;
        }
        return campaignScreeningResponse.copy(list, i13, screeningConfigDto);
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(CampaignScreeningResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.questions);
        output.encodeIntElement(serialDesc, 1, self.sessionId);
        output.encodeSerializableElement(serialDesc, 2, ScreeningConfigDto$$serializer.INSTANCE, self.config);
    }

    public final List<ScreeningQuestionDto> component1() {
        return this.questions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ScreeningConfigDto getConfig() {
        return this.config;
    }

    public final CampaignScreeningResponse copy(List<ScreeningQuestionDto> questions, int sessionId, ScreeningConfigDto config) {
        AbstractC22676k.m65750j(questions, "questions");
        AbstractC22676k.m65750j(config, "config");
        return new CampaignScreeningResponse(questions, sessionId, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignScreeningResponse)) {
            return false;
        }
        CampaignScreeningResponse campaignScreeningResponse = (CampaignScreeningResponse) other;
        return AbstractC22676k.m65745e(this.questions, campaignScreeningResponse.questions) && this.sessionId == campaignScreeningResponse.sessionId && AbstractC22676k.m65745e(this.config, campaignScreeningResponse.config);
    }

    public final ScreeningConfigDto getConfig() {
        return this.config;
    }

    public final List<ScreeningQuestionDto> getQuestions() {
        return this.questions;
    }

    public final int getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.config.hashCode() + AbstractC11266d.m30448b(this.sessionId, this.questions.hashCode() * 31, 31);
    }

    public final C36604b toDomain() {
        List<ScreeningQuestionDto> list = this.questions;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ScreeningQuestionDto) it.next()).toDomain());
        }
        return new C36604b(arrayList, this.sessionId, this.config.toDomain());
    }

    public String toString() {
        return "CampaignScreeningResponse(questions=" + this.questions + ", sessionId=" + this.sessionId + ", config=" + this.config + ")";
    }

    public CampaignScreeningResponse(List<ScreeningQuestionDto> questions, int i13, ScreeningConfigDto config) {
        AbstractC22676k.m65750j(questions, "questions");
        AbstractC22676k.m65750j(config, "config");
        this.questions = questions;
        this.sessionId = i13;
        this.config = config;
    }
}
