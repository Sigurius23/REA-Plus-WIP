package com.whoop.design.models;

import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;", "Lwc3/c;", "Lcom/whoop/design/models/AchievementsBackgroundStyle;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/AchievementsBackgroundStyle;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/AchievementsBackgroundStyle;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AchievementsBackgroundStyleSerializer implements InterfaceC37138c {
    public static final AchievementsBackgroundStyleSerializer INSTANCE = new AchievementsBackgroundStyleSerializer();
    private static final InterfaceC39443g descriptor = AbstractC35952b.m114194b("AchievementsBackgroundStyle", C39441e.f169698i);
    public static final int $stable = 8;

    private AchievementsBackgroundStyleSerializer() {
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0032 A[RETURN] */
    @Override // wc3.InterfaceC37137b
    public AchievementsBackgroundStyle deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        String upperCase = decoder.decodeString().toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        AchievementsBackgroundStyle achievementsBackgroundStyle = AchievementsBackgroundStyle.DEFAULT;
        for (AchievementsBackgroundStyle achievementsBackgroundStyle2 : AchievementsBackgroundStyle.values()) {
            if (AbstractC22676k.m65745e(achievementsBackgroundStyle2.name(), upperCase)) {
                if (achievementsBackgroundStyle2 == null) {
                    return achievementsBackgroundStyle;
                }
                return achievementsBackgroundStyle2;
            }
        }
        achievementsBackgroundStyle2 = null;
        if (achievementsBackgroundStyle2 == null) {
            return achievementsBackgroundStyle;
        }
        return achievementsBackgroundStyle2;
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, AchievementsBackgroundStyle value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        encoder.encodeString(value.name());
    }
}
