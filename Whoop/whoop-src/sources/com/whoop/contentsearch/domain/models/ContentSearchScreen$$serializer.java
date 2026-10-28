package com.whoop.contentsearch.domain.models;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/contentsearch/domain/models/ContentSearchScreen.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ContentSearchScreen$$serializer implements GeneratedSerializer<ContentSearchScreen> {
    public static final int $stable;
    public static final ContentSearchScreen$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ContentSearchScreen$$serializer contentSearchScreen$$serializer = new ContentSearchScreen$$serializer();
        INSTANCE = contentSearchScreen$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.contentsearch.domain.models.ContentSearchScreen", contentSearchScreen$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("filter_types", false);
        pluginGeneratedSerialDescriptor.addElement("nav_bar", false);
        pluginGeneratedSerialDescriptor.addElement("search_text_placeholder", false);
        pluginGeneratedSerialDescriptor.addElement("search_landing", false);
        pluginGeneratedSerialDescriptor.addElement("pagination_details", false);
        pluginGeneratedSerialDescriptor.addElement("tiles", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ContentSearchScreen$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ContentSearchScreen.$childSerializers;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), NavBar$$serializer.INSTANCE, StringSerializer.INSTANCE, SearchLanding$$serializer.INSTANCE, PaginationDetails$$serializer.INSTANCE, interfaceC23462hArr[5].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ContentSearchScreen deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        NavBar navBar;
        String str;
        SearchLanding searchLanding;
        PaginationDetails paginationDetails;
        List list2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ContentSearchScreen.$childSerializers;
        int i14 = 3;
        int i15 = 0;
        List list3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            NavBar navBar2 = (NavBar) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, NavBar$$serializer.INSTANCE, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            SearchLanding searchLanding2 = (SearchLanding) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, SearchLanding$$serializer.INSTANCE, null);
            PaginationDetails paginationDetails2 = (PaginationDetails) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, PaginationDetails$$serializer.INSTANCE, null);
            list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            list = list4;
            searchLanding = searchLanding2;
            paginationDetails = paginationDetails2;
            str = strDecodeStringElement;
            i13 = 63;
            navBar = navBar2;
        } else {
            int i16 = 1;
            int i17 = 0;
            NavBar navBar3 = null;
            String strDecodeStringElement2 = null;
            SearchLanding searchLanding3 = null;
            PaginationDetails paginationDetails3 = null;
            List list5 = null;
            while (i16 != 0) {
                int i18 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        i15 = i18;
                        i16 = i15;
                        i14 = 3;
                        break;
                    case 0:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list3);
                        i17 |= 1;
                        i15 = i18;
                        i14 = 3;
                        break;
                    case 1:
                        navBar3 = (NavBar) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, NavBar$$serializer.INSTANCE, navBar3);
                        i17 |= 2;
                        i15 = i18;
                        break;
                    case 2:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i15 = i18;
                        break;
                    case 3:
                        searchLanding3 = (SearchLanding) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, SearchLanding$$serializer.INSTANCE, searchLanding3);
                        i17 |= 8;
                        i15 = i18;
                        break;
                    case 4:
                        paginationDetails3 = (PaginationDetails) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, PaginationDetails$$serializer.INSTANCE, paginationDetails3);
                        i17 |= 16;
                        i15 = i18;
                        break;
                    case 5:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), list5);
                        i17 |= 32;
                        i15 = i18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            list = list3;
            navBar = navBar3;
            str = strDecodeStringElement2;
            searchLanding = searchLanding3;
            paginationDetails = paginationDetails3;
            list2 = list5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ContentSearchScreen(i13, list, navBar, str, searchLanding, paginationDetails, list2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ContentSearchScreen value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ContentSearchScreen.write$Self$content_search_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
