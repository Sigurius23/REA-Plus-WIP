package tv;

import android.content.res.TypedArray;
import android.graphics.Color;
import l83.C23454a0;
import p127ev.EnumC13677r;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: tv.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C34198a extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ TypedArray f143447w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f143448x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f143449y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34198a(TypedArray typedArray, float f13, boolean z4) {
        super(1);
        this.f143447w = typedArray;
        this.f143448x = f13;
        this.f143449y = z4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C34199b LocationComponentSettings = (C34199b) obj;
        AbstractC22676k.m65750j(LocationComponentSettings, "$this$LocationComponentSettings");
        TypedArray typedArray = this.f143447w;
        LocationComponentSettings.f143451b = typedArray.getBoolean(51, false);
        LocationComponentSettings.f143452c = typedArray.getBoolean(93, false);
        LocationComponentSettings.f143453d = typedArray.getColor(92, Color.parseColor("#4A90E2"));
        LocationComponentSettings.f143454e = typedArray.getDimension(94, this.f143448x * 10.0f);
        LocationComponentSettings.f143455f = typedArray.getBoolean(95, false);
        LocationComponentSettings.f143456g = typedArray.getColor(50, Color.parseColor("#4d89cff0"));
        LocationComponentSettings.f143457h = typedArray.getColor(49, Color.parseColor("#4d89cff0"));
        LocationComponentSettings.f143458i = typedArray.getString(52);
        LocationComponentSettings.f143459j = typedArray.getString(53);
        LocationComponentSettings.f143460k = this.f143449y;
        EnumC13677r enumC13677r = EnumC13677r.values()[typedArray.getInt(90, 0)];
        AbstractC22676k.m65750j(enumC13677r, "<set-?>");
        LocationComponentSettings.f143461l = enumC13677r;
        LocationComponentSettings.f143462m = typedArray.getString(96);
        return C23454a0.f92919a;
    }
}
