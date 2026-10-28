package com.mapbox.common.module.provider;

import java.util.Arrays;
import java.util.Locale;
import p405pu.EnumC29546b;
import p405pu.InterfaceC29545a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39415s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lpu/b;", "type", "<init>", "(Lpu/b;)V", "component1", "()Lpu/b;", "copy", "(Lpu/b;)Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lpu/b;", "common-android"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final /* data */ class MapboxInvalidModuleException extends RuntimeException {
    private final EnumC29546b type;

    public MapboxInvalidModuleException(EnumC29546b type) {
        AbstractC22676k.m65750j(type, "type");
        StringBuilder sb4 = new StringBuilder("\n    ");
        sb4.append(type.name());
        sb4.append(" has been excluded from build but a correct alternative was not provided.\n    Make sure that:\n    - Your custom module implements ");
        sb4.append(type.f120321x);
        sb4.append('.');
        sb4.append(type.f120322y);
        sb4.append(".\n    - Your custom module class is annotated with @");
        sb4.append(InterfaceC29545a.class.getSimpleName());
        sb4.append('(');
        sb4.append(EnumC29546b.class.getSimpleName());
        sb4.append('.');
        sb4.append(type.name());
        sb4.append(").\n    - You've provided a `ModuleProvider` instance to ");
        sb4.append(String.format("Mapbox_%sModuleConfiguration", Arrays.copyOf(new Object[]{type.f120320w}, 1)));
        sb4.append("#set");
        Locale locale = Locale.getDefault();
        AbstractC22676k.m65749i(locale, "getDefault(...)");
        String string = "moduleProvider";
        char cCharAt = "moduleProvider".charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            StringBuilder sb5 = new StringBuilder();
            char titleCase = Character.toTitleCase(cCharAt);
            if (titleCase != Character.toUpperCase(cCharAt)) {
                sb5.append(titleCase);
            } else {
                String upperCase = "m".toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                sb5.append(upperCase);
            }
            sb5.append("oduleProvider");
            string = sb5.toString();
        }
        sb4.append(string);
        sb4.append(" before initializing the library,\n      unless `enableConfiguration` flag is set to false and your implementation has a public, non-arg constructor or is a Kotlin object.\n  ");
        super(AbstractC39415s.m125909s(sb4.toString()));
        this.type = type;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final EnumC29546b getType() {
        return this.type;
    }

    public static /* synthetic */ MapboxInvalidModuleException copy$default(MapboxInvalidModuleException mapboxInvalidModuleException, EnumC29546b enumC29546b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC29546b = mapboxInvalidModuleException.type;
        }
        return mapboxInvalidModuleException.copy(enumC29546b);
    }

    public final MapboxInvalidModuleException copy(EnumC29546b type) {
        AbstractC22676k.m65750j(type, "type");
        return new MapboxInvalidModuleException(type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MapboxInvalidModuleException) && this.type == ((MapboxInvalidModuleException) other).type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "MapboxInvalidModuleException(type=" + this.type + ')';
    }
}
