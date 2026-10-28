package com.whoop.weightlifting.data.dto;

import com.whoop.design.util.TextResource;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weightlifting/data/dto/WorkoutDetailsModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class WorkoutDetailsModel$$serializer implements GeneratedSerializer<WorkoutDetailsModel> {
    public static final int $stable;
    public static final WorkoutDetailsModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        WorkoutDetailsModel$$serializer workoutDetailsModel$$serializer = new WorkoutDetailsModel$$serializer();
        INSTANCE = workoutDetailsModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weightlifting.data.dto.WorkoutDetailsModel", workoutDetailsModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("call_to_action_display", false);
        pluginGeneratedSerialDescriptor.addElement("details_page_title", false);
        pluginGeneratedSerialDescriptor.addElement("exercise_list_title_display", false);
        pluginGeneratedSerialDescriptor.addElement("exercises", false);
        pluginGeneratedSerialDescriptor.addElement("prebuilt_template_details_header", false);
        pluginGeneratedSerialDescriptor.addElement("workout_metadata_descriptions", false);
        pluginGeneratedSerialDescriptor.addElement("workout_summary_display", false);
        pluginGeneratedSerialDescriptor.addElement("workout_template", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WorkoutDetailsModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = WorkoutDetailsModel.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{c25452a, c25452a, c25452a, interfaceC23462hArr[3].getValue(), PrebuiltTemplateDetailsHeader$$serializer.INSTANCE, interfaceC23462hArr[5].getValue(), c25452a, WorkoutTemplateDto$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final WorkoutDetailsModel deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        WorkoutTemplateDto workoutTemplateDto;
        List list;
        PrebuiltTemplateDetailsHeader prebuiltTemplateDetailsHeader;
        TextResource textResource2;
        TextResource textResource3;
        TextResource textResource4;
        List list2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = WorkoutDetailsModel.$childSerializers;
        int i14 = 7;
        TextResource textResource5 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            TextResource textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, c25452a, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            PrebuiltTemplateDetailsHeader prebuiltTemplateDetailsHeader2 = (PrebuiltTemplateDetailsHeader) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, PrebuiltTemplateDetailsHeader$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            textResource = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, c25452a, null);
            workoutTemplateDto = (WorkoutTemplateDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, WorkoutTemplateDto$$serializer.INSTANCE, null);
            i13 = 255;
            prebuiltTemplateDetailsHeader = prebuiltTemplateDetailsHeader2;
            textResource4 = textResource8;
            list2 = list3;
            textResource3 = textResource7;
            textResource2 = textResource6;
        } else {
            int i15 = 3;
            boolean z4 = true;
            int i16 = 0;
            TextResource textResource9 = null;
            WorkoutTemplateDto workoutTemplateDto2 = null;
            List list4 = null;
            PrebuiltTemplateDetailsHeader prebuiltTemplateDetailsHeader3 = null;
            TextResource textResource10 = null;
            TextResource textResource11 = null;
            List list5 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        i15 = 3;
                        break;
                    case 0:
                        textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource5);
                        i16 |= 1;
                        i14 = 7;
                        i15 = 3;
                        break;
                    case 1:
                        textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource10);
                        i16 |= 2;
                        i14 = 7;
                        i15 = 3;
                        break;
                    case 2:
                        textResource11 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource11);
                        i16 |= 4;
                        i14 = 7;
                        i15 = 3;
                        break;
                    case 3:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list5);
                        i16 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        prebuiltTemplateDetailsHeader3 = (PrebuiltTemplateDetailsHeader) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, PrebuiltTemplateDetailsHeader$$serializer.INSTANCE, prebuiltTemplateDetailsHeader3);
                        i16 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), list4);
                        i16 |= 32;
                        break;
                    case 6:
                        textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, C25452a.f99689a, textResource9);
                        i16 |= 64;
                        break;
                    case 7:
                        workoutTemplateDto2 = (WorkoutTemplateDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, WorkoutTemplateDto$$serializer.INSTANCE, workoutTemplateDto2);
                        i16 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            textResource = textResource9;
            workoutTemplateDto = workoutTemplateDto2;
            list = list4;
            prebuiltTemplateDetailsHeader = prebuiltTemplateDetailsHeader3;
            textResource2 = textResource5;
            textResource3 = textResource10;
            textResource4 = textResource11;
            list2 = list5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new WorkoutDetailsModel(i13, textResource2, textResource3, textResource4, list2, prebuiltTemplateDetailsHeader, list, textResource, workoutTemplateDto, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, WorkoutDetailsModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        WorkoutDetailsModel.write$Self$weightlifting_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
