package com.whoop.home.domain.models;

import com.whoop.coacheverywherecommon.models.AiContextMetadataBottomRow;
import com.whoop.coacheverywherecommon.models.AiContextMetadataBottomRow$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/home/domain/models/HomeResponseMetaData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/home/domain/models/HomeResponseMetaData;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/home/domain/models/HomeResponseMetaData;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/home/domain/models/HomeResponseMetaData;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HomeResponseMetaData$$serializer implements GeneratedSerializer<HomeResponseMetaData> {
    public static final int $stable;
    public static final HomeResponseMetaData$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HomeResponseMetaData$$serializer homeResponseMetaData$$serializer = new HomeResponseMetaData$$serializer();
        INSTANCE = homeResponseMetaData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.home.domain.models.HomeResponseMetaData", homeResponseMetaData$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("cycle_metadata", false);
        pluginGeneratedSerialDescriptor.addElement("journal_metadata", false);
        pluginGeneratedSerialDescriptor.addElement("user_metadata", false);
        pluginGeneratedSerialDescriptor.addElement("whoop_live_metadata", false);
        pluginGeneratedSerialDescriptor.addElement("experimentIds", false);
        pluginGeneratedSerialDescriptor.addElement("autopopMetadata", false);
        pluginGeneratedSerialDescriptor.addElement("aiContextMetadata", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HomeResponseMetaData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{CycleMetaData$$serializer.INSTANCE, JournalMetaData$$serializer.INSTANCE, UserMetaData$$serializer.INSTANCE, WhoopLiveMetaData$$serializer.INSTANCE, AbstractC38195a.m122336d((InterfaceC37138c) HomeResponseMetaData.$childSerializers[4].getValue()), AbstractC38195a.m122336d(AutopopMetadata$$serializer.INSTANCE), AbstractC38195a.m122336d(AiContextMetadataBottomRow$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HomeResponseMetaData deserialize(InterfaceC40541d decoder) {
        int i13;
        AiContextMetadataBottomRow aiContextMetadataBottomRow;
        AutopopMetadata autopopMetadata;
        CycleMetaData cycleMetaData;
        JournalMetaData journalMetaData;
        UserMetaData userMetaData;
        WhoopLiveMetaData whoopLiveMetaData;
        List list;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HomeResponseMetaData.$childSerializers;
        int i14 = 6;
        CycleMetaData cycleMetaData2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            CycleMetaData cycleMetaData3 = (CycleMetaData) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, CycleMetaData$$serializer.INSTANCE, null);
            JournalMetaData journalMetaData2 = (JournalMetaData) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, JournalMetaData$$serializer.INSTANCE, null);
            UserMetaData userMetaData2 = (UserMetaData) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, UserMetaData$$serializer.INSTANCE, null);
            WhoopLiveMetaData whoopLiveMetaData2 = (WhoopLiveMetaData) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, WhoopLiveMetaData$$serializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            AutopopMetadata autopopMetadata2 = (AutopopMetadata) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, AutopopMetadata$$serializer.INSTANCE, null);
            list = list2;
            cycleMetaData = cycleMetaData3;
            aiContextMetadataBottomRow = (AiContextMetadataBottomRow) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, AiContextMetadataBottomRow$$serializer.INSTANCE, null);
            autopopMetadata = autopopMetadata2;
            whoopLiveMetaData = whoopLiveMetaData2;
            userMetaData = userMetaData2;
            i13 = 127;
            journalMetaData = journalMetaData2;
        } else {
            boolean z4 = true;
            int i15 = 0;
            AiContextMetadataBottomRow aiContextMetadataBottomRow2 = null;
            AutopopMetadata autopopMetadata3 = null;
            JournalMetaData journalMetaData3 = null;
            UserMetaData userMetaData3 = null;
            WhoopLiveMetaData whoopLiveMetaData3 = null;
            List list3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 6;
                        break;
                    case 0:
                        cycleMetaData2 = (CycleMetaData) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, CycleMetaData$$serializer.INSTANCE, cycleMetaData2);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        journalMetaData3 = (JournalMetaData) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, JournalMetaData$$serializer.INSTANCE, journalMetaData3);
                        i15 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        userMetaData3 = (UserMetaData) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, UserMetaData$$serializer.INSTANCE, userMetaData3);
                        i15 |= 4;
                        i14 = 6;
                        break;
                    case 3:
                        whoopLiveMetaData3 = (WhoopLiveMetaData) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, WhoopLiveMetaData$$serializer.INSTANCE, whoopLiveMetaData3);
                        i15 |= 8;
                        break;
                    case 4:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), list3);
                        i15 |= 16;
                        break;
                    case 5:
                        autopopMetadata3 = (AutopopMetadata) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, AutopopMetadata$$serializer.INSTANCE, autopopMetadata3);
                        i15 |= 32;
                        break;
                    case 6:
                        aiContextMetadataBottomRow2 = (AiContextMetadataBottomRow) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, AiContextMetadataBottomRow$$serializer.INSTANCE, aiContextMetadataBottomRow2);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            aiContextMetadataBottomRow = aiContextMetadataBottomRow2;
            autopopMetadata = autopopMetadata3;
            cycleMetaData = cycleMetaData2;
            journalMetaData = journalMetaData3;
            userMetaData = userMetaData3;
            whoopLiveMetaData = whoopLiveMetaData3;
            list = list3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HomeResponseMetaData(i13, cycleMetaData, journalMetaData, userMetaData, whoopLiveMetaData, list, autopopMetadata, aiContextMetadataBottomRow, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HomeResponseMetaData value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HomeResponseMetaData.write$Self$home_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
