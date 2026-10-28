package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final FieldNamingStrategy fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    private final List<ReflectionAccessFilter> reflectionFilters;

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {
        final Map<String, BoundField> boundFields;

        public Adapter(Map<String, BoundField> map) {
            this.boundFields = map;
        }

        public abstract A createAccumulator();

        public abstract T finalize(A a5);

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public T read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            A aCreateAccumulator = createAccumulator();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    BoundField boundField = this.boundFields.get(jsonReader.nextName());
                    if (boundField == null || !boundField.deserialized) {
                        jsonReader.skipValue();
                    } else {
                        readField(aCreateAccumulator, jsonReader, boundField);
                    }
                }
                jsonReader.endObject();
                return finalize(aCreateAccumulator);
            } catch (IllegalAccessException e5) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e5);
            } catch (IllegalStateException e13) {
                throw new JsonSyntaxException(e13);
            }
        }

        public abstract void readField(A a5, JsonReader jsonReader, BoundField boundField) throws IllegalAccessException, IOException;

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t14) throws IOException {
            if (t14 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator<BoundField> it = this.boundFields.values().iterator();
                while (it.hasNext()) {
                    it.next().write(jsonWriter, t14);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e5) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e5);
            }
        }
    }

    public static abstract class BoundField {
        final boolean deserialized;
        final Field field;
        final String fieldName;
        final String name;
        final boolean serialized;

        public BoundField(String str, Field field, boolean z4, boolean z13) {
            this.name = str;
            this.field = field;
            this.fieldName = field.getName();
            this.serialized = z4;
            this.deserialized = z13;
        }

        public abstract void readIntoArray(JsonReader jsonReader, int i13, Object[] objArr) throws JsonParseException, IOException;

        public abstract void readIntoField(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException;

        public abstract void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;
    }

    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {
        private final ObjectConstructor<T> constructor;

        public FieldReflectionAdapter(ObjectConstructor<T> objectConstructor, Map<String, BoundField> map) {
            super(map);
            this.constructor = objectConstructor;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T createAccumulator() {
            return this.constructor.construct();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T finalize(T t14) {
            return t14;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public void readField(T t14, JsonReader jsonReader, BoundField boundField) throws IllegalAccessException, IOException {
            boundField.readIntoField(jsonReader, t14);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {
        static final Map<Class<?>, Object> PRIMITIVE_DEFAULTS = primitiveDefaults();
        private final Map<String, Integer> componentIndices;
        private final Constructor<T> constructor;
        private final Object[] constructorArgsDefaults;

        public RecordAdapter(Class<T> cls, Map<String, BoundField> map, boolean z4) {
            super(map);
            this.componentIndices = new HashMap();
            Constructor<T> canonicalRecordConstructor = ReflectionHelper.getCanonicalRecordConstructor(cls);
            this.constructor = canonicalRecordConstructor;
            if (z4) {
                ReflectiveTypeAdapterFactory.checkAccessible(null, canonicalRecordConstructor);
            } else {
                ReflectionHelper.makeAccessible(canonicalRecordConstructor);
            }
            String[] recordComponentNames = ReflectionHelper.getRecordComponentNames(cls);
            for (int i13 = 0; i13 < recordComponentNames.length; i13++) {
                this.componentIndices.put(recordComponentNames[i13], Integer.valueOf(i13));
            }
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            this.constructorArgsDefaults = new Object[parameterTypes.length];
            for (int i14 = 0; i14 < parameterTypes.length; i14++) {
                this.constructorArgsDefaults[i14] = PRIMITIVE_DEFAULTS.get(parameterTypes[i14]);
            }
        }

        private static Map<Class<?>, Object> primitiveDefaults() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public Object[] createAccumulator() {
            return (Object[]) this.constructorArgsDefaults.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T finalize(Object[] objArr) {
            try {
                return this.constructor.newInstance(objArr);
            } catch (IllegalAccessException e5) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e5);
            } catch (IllegalArgumentException e13) {
                e = e13;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e14) {
                e = e14;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e15) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e15.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public void readField(Object[] objArr, JsonReader jsonReader, BoundField boundField) throws IOException {
            Integer num = this.componentIndices.get(boundField.fieldName);
            if (num != null) {
                boundField.readIntoArray(jsonReader, num.intValue(), objArr);
                return;
            }
            StringBuilder sb4 = new StringBuilder("Could not find the index in the constructor '");
            sb4.append(ReflectionHelper.constructorToString(this.constructor));
            sb4.append("' for field with name '");
            throw new IllegalStateException(AbstractC25012a.m73376i(boundField.fieldName, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.", sb4));
        }
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<ReflectionAccessFilter> list) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = fieldNamingStrategy;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        this.reflectionFilters = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <M extends AccessibleObject & Member> void checkAccessible(Object obj, M m10) {
        if (Modifier.isStatic(m10.getModifiers())) {
            obj = null;
        }
        if (!ReflectionAccessFilterHelper.canAccess(m10, obj)) {
            throw new JsonIOException(AbstractC2875y.m8299l(ReflectionHelper.getAccessibleObjectDescription(m10, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    private BoundField createBoundField(final Gson gson, Field field, final Method method, String str, final TypeToken<?> typeToken, boolean z4, boolean z13, final boolean z14) {
        final boolean zIsPrimitive = Primitives.isPrimitive(typeToken.getRawType());
        int modifiers = field.getModifiers();
        final boolean z15 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        TypeAdapter<?> typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter) : null;
        final boolean z16 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = gson.getAdapter(typeToken);
        }
        final TypeAdapter<?> typeAdapter2 = typeAdapter;
        return new BoundField(str, field, z4, z13) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void readIntoArray(JsonReader jsonReader, int i13, Object[] objArr) throws JsonParseException, IOException {
                Object obj = typeAdapter2.read2(jsonReader);
                if (obj != null || !zIsPrimitive) {
                    objArr[i13] = obj;
                    return;
                }
                throw new JsonParseException("null is not allowed as value for record component '" + this.fieldName + "' of primitive type; at path " + jsonReader.getPath());
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void readIntoField(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
                Object obj2 = typeAdapter2.read2(jsonReader);
                if (obj2 == null && zIsPrimitive) {
                    return;
                }
                if (z14) {
                    ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                } else if (z15) {
                    throw new JsonIOException(AbstractC11266d.m30461o("Cannot set value of 'static final' ", ReflectionHelper.getAccessibleObjectDescription(this.field, false)));
                }
                this.field.set(obj, obj2);
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
                Object objInvoke;
                if (this.serialized) {
                    if (z14) {
                        Method method2 = method;
                        if (method2 == null) {
                            ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                        } else {
                            ReflectiveTypeAdapterFactory.checkAccessible(obj, method2);
                        }
                    }
                    Method method3 = method;
                    if (method3 != null) {
                        try {
                            objInvoke = method3.invoke(obj, null);
                        } catch (InvocationTargetException e5) {
                            throw new JsonIOException(AbstractC11895b.m31996o("Accessor ", ReflectionHelper.getAccessibleObjectDescription(method, false), " threw exception"), e5.getCause());
                        }
                    } else {
                        objInvoke = this.field.get(obj);
                    }
                    if (objInvoke == obj) {
                        return;
                    }
                    jsonWriter.name(this.name);
                    (z16 ? typeAdapter2 : new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, typeToken.getType())).write(jsonWriter, objInvoke);
                }
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0101  */
    /* JADX WARN: Code duplicated, block: B:66:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0102 A[SYNTHETIC] */
    private Map<String, BoundField> getBoundFields(Gson gson, TypeToken<?> typeToken, Class<?> cls, boolean z4, boolean z13) {
        boolean z14;
        Method method;
        Type typeResolve;
        List<String> fieldNames;
        int size;
        BoundField boundField;
        int i13;
        int i14;
        int i15;
        BoundField boundField2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            TypeToken<?> typeToken2 = typeToken;
            boolean z15 = z4;
            Class<?> rawType = cls;
            while (rawType != Object.class) {
                Field[] declaredFields = rawType.getDeclaredFields();
                boolean z16 = true;
                boolean z17 = false;
                if (rawType != cls && declaredFields.length > 0) {
                    ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
                    if (filterResult == ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
                        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                    }
                    z15 = filterResult == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
                }
                boolean z18 = z15;
                int length = declaredFields.length;
                int i16 = 0;
                while (i16 < length) {
                    int i17 = i16;
                    Field field = declaredFields[i17];
                    boolean zIncludeField = this.includeField(field, z16);
                    boolean zIncludeField2 = this.includeField(field, z17);
                    if (zIncludeField || zIncludeField2) {
                        if (z13) {
                            if (Modifier.isStatic(field.getModifiers())) {
                                z14 = z17;
                            } else {
                                Method accessor = ReflectionHelper.getAccessor(rawType, field);
                                if (!z18) {
                                    ReflectionHelper.makeAccessible(accessor);
                                }
                                if (accessor.getAnnotation(SerializedName.class) != null && field.getAnnotation(SerializedName.class) == null) {
                                    throw new JsonIOException(AbstractC11895b.m31996o("@SerializedName on ", ReflectionHelper.getAccessibleObjectDescription(accessor, z17), " is not supported"));
                                }
                                i17 = i17;
                                method = accessor;
                                z14 = zIncludeField2;
                            }
                            if (!z18 && method == null) {
                                ReflectionHelper.makeAccessible(field);
                            }
                            typeResolve = C$Gson$Types.resolve(typeToken2.getType(), rawType, field.getGenericType());
                            fieldNames = this.getFieldNames(field);
                            size = fieldNames.size();
                            boundField = null;
                            i13 = 0;
                            while (i13 < size) {
                                String str = fieldNames.get(i13);
                                if (i13 != 0) {
                                    zIncludeField = false;
                                }
                                int i18 = i17;
                                List<String> list = fieldNames;
                                boolean z19 = zIncludeField;
                                int i19 = length;
                                boundField2 = (BoundField) linkedHashMap.put(str, this.createBoundField(gson, field, method, str, TypeToken.get(typeResolve), z19, z14, z18));
                                if (boundField == null) {
                                    boundField = boundField2;
                                }
                                i13++;
                                this = this;
                                zIncludeField = z19;
                                length = i19;
                                i17 = i18;
                                fieldNames = list;
                            }
                            i14 = length;
                            i15 = i17;
                            if (boundField == null) {
                                StringBuilder sb4 = new StringBuilder("Class ");
                                AbstractC11266d.m30443A(cls, sb4, " declares multiple JSON fields named '");
                                sb4.append(boundField.name);
                                sb4.append("'; conflict is caused by fields ");
                                sb4.append(ReflectionHelper.fieldToString(boundField.field));
                                sb4.append(" and ");
                                sb4.append(ReflectionHelper.fieldToString(field));
                                throw new IllegalArgumentException(sb4.toString());
                            }
                        } else {
                            z14 = zIncludeField2;
                        }
                        method = null;
                        if (!z18) {
                            ReflectionHelper.makeAccessible(field);
                        }
                        typeResolve = C$Gson$Types.resolve(typeToken2.getType(), rawType, field.getGenericType());
                        fieldNames = this.getFieldNames(field);
                        size = fieldNames.size();
                        boundField = null;
                        i13 = 0;
                        while (i13 < size) {
                            String str2 = fieldNames.get(i13);
                            if (i13 != 0) {
                                zIncludeField = false;
                            }
                            int i110 = i17;
                            List<String> list2 = fieldNames;
                            boolean z110 = zIncludeField;
                            int i111 = length;
                            boundField2 = (BoundField) linkedHashMap.put(str2, this.createBoundField(gson, field, method, str2, TypeToken.get(typeResolve), z110, z14, z18));
                            if (boundField == null) {
                                boundField = boundField2;
                            }
                            i13++;
                            this = this;
                            zIncludeField = z110;
                            length = i111;
                            i17 = i110;
                            fieldNames = list2;
                        }
                        i14 = length;
                        i15 = i17;
                        if (boundField == null) {
                            StringBuilder sb5 = new StringBuilder("Class ");
                            AbstractC11266d.m30443A(cls, sb5, " declares multiple JSON fields named '");
                            sb5.append(boundField.name);
                            sb5.append("'; conflict is caused by fields ");
                            sb5.append(ReflectionHelper.fieldToString(boundField.field));
                            sb5.append(" and ");
                            sb5.append(ReflectionHelper.fieldToString(field));
                            throw new IllegalArgumentException(sb5.toString());
                        }
                    } else {
                        i14 = length;
                        i15 = i17;
                    }
                    i16 = i15 + 1;
                    z16 = true;
                    z17 = false;
                    this = this;
                    typeToken2 = typeToken2;
                    declaredFields = declaredFields;
                    length = i14;
                }
                typeToken2 = TypeToken.get(C$Gson$Types.resolve(typeToken2.getType(), rawType, rawType.getGenericSuperclass()));
                rawType = typeToken2.getRawType();
                z15 = z18;
            }
        }
        return linkedHashMap;
    }

    private List<String> getFieldNames(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.fieldNamingPolicy.translateName(field));
        }
        String strValue = serializedName.value();
        String[] strArrAlternate = serializedName.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        Collections.addAll(arrayList, strArrAlternate);
        return arrayList;
    }

    private boolean includeField(Field field, boolean z4) {
        return (this.excluder.excludeClass(field.getType(), z4) || this.excluder.excludeField(field, z4)) ? false : true;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        if (filterResult != ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
            boolean z4 = filterResult == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
            return ReflectionHelper.isRecord(rawType) ? new RecordAdapter(rawType, getBoundFields(gson, typeToken, rawType, z4, true), z4) : new FieldReflectionAdapter(this.constructorConstructor.get(typeToken), getBoundFields(gson, typeToken, rawType, z4, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
