package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\b\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aa\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00040\u0004H\u0001¢\u0006\u0004\b\f\u0010\r\u001aq\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00040\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"", "T", "", "serialName", "", "values", "Lwc3/c;", "createSimpleEnumSerializer", "(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;", "names", "", "annotations", "createMarkedEnumSerializer", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)Lwc3/c;", "entryAnnotations", "classAnnotations", "createAnnotatedEnumSerializer", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lwc3/c;", "kotlinx-serialization-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EnumsKt {
    public static final <T extends Enum<T>> InterfaceC37138c createAnnotatedEnumSerializer(String serialName, T[] values, String[] names, Annotation[][] entryAnnotations, Annotation[] annotationArr) {
        AbstractC22676k.m65750j(serialName, "serialName");
        AbstractC22676k.m65750j(values, "values");
        AbstractC22676k.m65750j(names, "names");
        AbstractC22676k.m65750j(entryAnnotations, "entryAnnotations");
        EnumDescriptor enumDescriptor = new EnumDescriptor(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                enumDescriptor.pushClassAnnotation(annotation);
            }
        }
        int length = values.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            T t14 = values[i13];
            int i15 = i14 + 1;
            String strName = (String) AbstractC25260n.m74084y0(i14, names);
            if (strName == null) {
                strName = t14.name();
            }
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, strName, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) AbstractC25260n.m74084y0(i14, entryAnnotations);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    enumDescriptor.pushAnnotation(annotation2);
                }
            }
            i13++;
            i14 = i15;
        }
        return new EnumSerializer(serialName, values, enumDescriptor);
    }

    public static final <T extends Enum<T>> InterfaceC37138c createMarkedEnumSerializer(String serialName, T[] values, String[] names, Annotation[][] annotations) {
        AbstractC22676k.m65750j(serialName, "serialName");
        AbstractC22676k.m65750j(values, "values");
        AbstractC22676k.m65750j(names, "names");
        AbstractC22676k.m65750j(annotations, "annotations");
        EnumDescriptor enumDescriptor = new EnumDescriptor(serialName, values.length);
        int length = values.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            T t14 = values[i13];
            int i15 = i14 + 1;
            String strName = (String) AbstractC25260n.m74084y0(i14, names);
            if (strName == null) {
                strName = t14.name();
            }
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, strName, false, 2, null);
            Annotation[] annotationArr = (Annotation[]) AbstractC25260n.m74084y0(i14, annotations);
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    enumDescriptor.pushAnnotation(annotation);
                }
            }
            i13++;
            i14 = i15;
        }
        return new EnumSerializer(serialName, values, enumDescriptor);
    }

    public static final <T extends Enum<T>> InterfaceC37138c createSimpleEnumSerializer(String serialName, T[] values) {
        AbstractC22676k.m65750j(serialName, "serialName");
        AbstractC22676k.m65750j(values, "values");
        return new EnumSerializer(serialName, values);
    }
}
