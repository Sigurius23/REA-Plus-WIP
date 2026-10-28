package com.whoop.access.omronauth.domain.models;

import com.whoop.design.models.TitleSubTitleModel;
import com.whoop.design.models.TitleSubTitleModel$$serializer;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.design.models.items.FeatureListModel;
import com.whoop.design.models.items.FeatureListModel$$serializer;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.ImageUrlModel$$serializer;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.NavigationBarModel$$serializer;
import com.whoop.navigation.C9598e;
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
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/access/omronauth/domain/models/OmronAuthModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class OmronAuthModel$$serializer implements GeneratedSerializer<OmronAuthModel> {
    public static final int $stable;
    public static final OmronAuthModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        OmronAuthModel$$serializer omronAuthModel$$serializer = new OmronAuthModel$$serializer();
        INSTANCE = omronAuthModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.access.omronauth.domain.models.OmronAuthModel", omronAuthModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("navBar", false);
        pluginGeneratedSerialDescriptor.addElement("image", false);
        pluginGeneratedSerialDescriptor.addElement("content", false);
        pluginGeneratedSerialDescriptor.addElement("featuresList", false);
        pluginGeneratedSerialDescriptor.addElement("button", false);
        pluginGeneratedSerialDescriptor.addElement("omronUrl", false);
        pluginGeneratedSerialDescriptor.addElement("navigateOnSuccess", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OmronAuthModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(NavigationBarModel$$serializer.INSTANCE), AbstractC38195a.m122336d(ImageUrlModel$$serializer.INSTANCE), TitleSubTitleModel$$serializer.INSTANCE, FeatureListModel$$serializer.INSTANCE, CardButtonModel$$serializer.INSTANCE, StringSerializer.INSTANCE, AbstractC38195a.m122336d((InterfaceC37138c) OmronAuthModel.$childSerializers[6].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final OmronAuthModel deserialize(InterfaceC40541d decoder) {
        int i13;
        C9598e c9598e;
        NavigationBarModel navigationBarModel;
        ImageUrlModel imageUrlModel;
        TitleSubTitleModel titleSubTitleModel;
        FeatureListModel featureListModel;
        CardButtonModel cardButtonModel;
        String str;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = OmronAuthModel.$childSerializers;
        int i14 = 5;
        NavigationBarModel navigationBarModel2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            NavigationBarModel navigationBarModel3 = (NavigationBarModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, NavigationBarModel$$serializer.INSTANCE, null);
            ImageUrlModel imageUrlModel2 = (ImageUrlModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, ImageUrlModel$$serializer.INSTANCE, null);
            TitleSubTitleModel titleSubTitleModel2 = (TitleSubTitleModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, TitleSubTitleModel$$serializer.INSTANCE, null);
            FeatureListModel featureListModel2 = (FeatureListModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, FeatureListModel$$serializer.INSTANCE, null);
            CardButtonModel cardButtonModel2 = (CardButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, CardButtonModel$$serializer.INSTANCE, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            navigationBarModel = navigationBarModel3;
            str = strDecodeStringElement;
            featureListModel = featureListModel2;
            cardButtonModel = cardButtonModel2;
            titleSubTitleModel = titleSubTitleModel2;
            i13 = 127;
            imageUrlModel = imageUrlModel2;
        } else {
            boolean z4 = true;
            int i15 = 0;
            C9598e c9598e2 = null;
            ImageUrlModel imageUrlModel3 = null;
            TitleSubTitleModel titleSubTitleModel3 = null;
            FeatureListModel featureListModel3 = null;
            CardButtonModel cardButtonModel3 = null;
            String strDecodeStringElement2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 5;
                        break;
                    case 0:
                        navigationBarModel2 = (NavigationBarModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, NavigationBarModel$$serializer.INSTANCE, navigationBarModel2);
                        i15 |= 1;
                        i14 = 5;
                        break;
                    case 1:
                        imageUrlModel3 = (ImageUrlModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, ImageUrlModel$$serializer.INSTANCE, imageUrlModel3);
                        i15 |= 2;
                        i14 = 5;
                        break;
                    case 2:
                        titleSubTitleModel3 = (TitleSubTitleModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, TitleSubTitleModel$$serializer.INSTANCE, titleSubTitleModel3);
                        i15 |= 4;
                        break;
                    case 3:
                        featureListModel3 = (FeatureListModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, FeatureListModel$$serializer.INSTANCE, featureListModel3);
                        i15 |= 8;
                        break;
                    case 4:
                        cardButtonModel3 = (CardButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, CardButtonModel$$serializer.INSTANCE, cardButtonModel3);
                        i15 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i14);
                        i15 |= 32;
                        break;
                    case 6:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), c9598e2);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            c9598e = c9598e2;
            navigationBarModel = navigationBarModel2;
            imageUrlModel = imageUrlModel3;
            titleSubTitleModel = titleSubTitleModel3;
            featureListModel = featureListModel3;
            cardButtonModel = cardButtonModel3;
            str = strDecodeStringElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new OmronAuthModel(i13, navigationBarModel, imageUrlModel, titleSubTitleModel, featureListModel, cardButtonModel, str, c9598e, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, OmronAuthModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        OmronAuthModel.write$Self$access_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
