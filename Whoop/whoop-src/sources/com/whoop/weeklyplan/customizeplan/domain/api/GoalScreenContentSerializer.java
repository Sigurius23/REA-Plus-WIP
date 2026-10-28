package com.whoop.weeklyplan.customizeplan.domain.api;

import ad3.InterfaceC0768k;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;", "<init>", "()V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;)V", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GoalScreenContentSerializer implements InterfaceC37138c {
    public static final GoalScreenContentSerializer INSTANCE = new GoalScreenContentSerializer();
    private static final InterfaceC39443g descriptor = AbstractC35952b.m114195c("GoalScreenContent", new InterfaceC39443g[0]);
    public static final int $stable = 8;

    private GoalScreenContentSerializer() {
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // wc3.InterfaceC37137b
    public GoalScreenContent deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new IllegalStateException("Can only deserialize from JSON");
        }
        JsonElement jsonElementMo1838b = interfaceC0768k.mo1838b();
        boolean z4 = jsonElementMo1838b instanceof JsonObject;
        if ((!z4 || !((JsonObject) jsonElementMo1838b).isEmpty()) && z4) {
            JsonObject jsonObject = (JsonObject) jsonElementMo1838b;
            if (jsonObject.containsKey((Object) "range") || jsonObject.containsKey((Object) "value") || jsonObject.containsKey((Object) "usable_range")) {
                return (GoalScreenContent) interfaceC0768k.mo1837a().m1830a(SliderContentV2.INSTANCE.serializer(), jsonElementMo1838b);
            }
            if (jsonObject.containsKey((Object) "initial_goal_settings_tiles") || jsonObject.containsKey((Object) "bottom_button")) {
                return (GoalScreenContent) interfaceC0768k.mo1837a().m1830a(ToggleContentV2.INSTANCE.serializer(), jsonElementMo1838b);
            }
        }
        return null;
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, GoalScreenContent value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        if (value == null) {
            encoder.encodeNull();
        } else if (value instanceof SliderContentV2) {
            SliderContentV2.INSTANCE.serializer().serialize(encoder, value);
        } else {
            if (!(value instanceof ToggleContentV2)) {
                throw new NoWhenBranchMatchedException();
            }
            ToggleContentV2.INSTANCE.serializer().serialize(encoder, value);
        }
    }
}
