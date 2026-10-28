package com.amplitude.quickjs.wrapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p047c9.C4316g;

/* JADX INFO: loaded from: classes.dex */
public class QuickJSObject implements JSObject {
    private final QuickJSContext context;
    private final long pointer;
    private int refCount;
    private Throwable stackTrace;

    public QuickJSObject(QuickJSContext quickJSContext, long j7) {
        this.context = quickJSContext;
        this.pointer = j7;
        this.refCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$setProperty$0(Method method, Object obj, Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return null;
        } catch (InvocationTargetException e13) {
            e13.printStackTrace();
            return null;
        }
    }

    private void setPropertyObject(String str, Object obj) {
        checkRefCountIsZero();
        this.context.setProperty(this, str, obj);
    }

    public final void checkRefCountIsZero() {
        if (isRefCountZero()) {
            throw new QuickJSException("The call threw an exception, the reference count of the current object has already reached zero.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0100  */
    /* JADX WARN: Code duplicated, block: B:52:0x0104  */
    /* JADX WARN: Code duplicated, block: B:66:0x010a A[SYNTHETIC] */
    public void convertToMap(Object obj, Object obj2, HashMap<Long, Object> map, MapFilter mapFilter, Object obj3, MapCreator mapCreator) {
        QuickJSObject quickJSObject;
        String str;
        Object property;
        Map<String, Object> map2;
        ArrayList arrayList;
        HashMap<Long, Object> map3 = map;
        JSObject jSObject = (JSObject) obj;
        map3.put(Long.valueOf(jSObject.getPointer()), obj2);
        boolean z4 = obj instanceof JSArray;
        JSArray names = z4 ? (JSArray) obj : jSObject.getNames();
        int length = names.length();
        int i13 = 0;
        while (i13 < length) {
            if (z4) {
                str = null;
                property = names.get(i13);
                quickJSObject = this;
            } else {
                String str2 = (String) names.get(i13);
                quickJSObject = this;
                if (mapFilter == 0 || !mapFilter.shouldSkipKey(str2, quickJSObject.pointer, obj3)) {
                    str = str2;
                    property = jSObject.getProperty(str2);
                }
                i13++;
                map3 = map;
            }
            boolean z13 = property instanceof JSObject;
            if (z13) {
                long pointer = ((JSObject) property).getPointer();
                if (map3.containsKey(Long.valueOf(pointer))) {
                    Object obj4 = map3.get(Long.valueOf(pointer));
                    if (obj2 instanceof Map) {
                        ((Map) obj2).put(str, obj4);
                    } else if (obj2 instanceof ArrayList) {
                        ((ArrayList) obj2).add(obj4);
                    }
                } else if (property instanceof JSFunction) {
                    ((JSFunction) property).release();
                } else if (property instanceof JSArray) {
                    JSArray jSArray = (JSArray) property;
                    arrayList = new ArrayList(jSArray.length());
                    quickJSObject.convertToMap(property, arrayList, map3, mapFilter, obj3, mapCreator);
                    if (obj2 instanceof Map) {
                        ((Map) obj2).put(str, arrayList);
                    } else if (obj2 instanceof ArrayList) {
                        ((ArrayList) obj2).add(arrayList);
                    }
                    jSArray.release();
                } else if (z13) {
                    map2 = mapCreator.get();
                    convertToMap(property, map2, map, mapFilter, obj3, mapCreator);
                    if (obj2 instanceof Map) {
                        ((Map) obj2).put(str, map2);
                    } else if (obj2 instanceof ArrayList) {
                        ((ArrayList) obj2).add(map2);
                    }
                    ((JSObject) property).release();
                } else if (obj2 instanceof Map) {
                    ((Map) obj2).put(str, property);
                } else if (obj2 instanceof ArrayList) {
                    ((ArrayList) obj2).add(property);
                }
            } else if (property instanceof JSFunction) {
                ((JSFunction) property).release();
            } else if (property instanceof JSArray) {
                JSArray jSArray2 = (JSArray) property;
                arrayList = new ArrayList(jSArray2.length());
                quickJSObject.convertToMap(property, arrayList, map3, mapFilter, obj3, mapCreator);
                if (obj2 instanceof Map) {
                    ((Map) obj2).put(str, arrayList);
                } else if (obj2 instanceof ArrayList) {
                    ((ArrayList) obj2).add(arrayList);
                }
                jSArray2.release();
            } else if (z13) {
                map2 = mapCreator.get();
                convertToMap(property, map2, map, mapFilter, obj3, mapCreator);
                if (obj2 instanceof Map) {
                    ((Map) obj2).put(str, map2);
                } else if (obj2 instanceof ArrayList) {
                    ((ArrayList) obj2).add(map2);
                }
                ((JSObject) property).release();
            } else if (obj2 instanceof Map) {
                ((Map) obj2).put(str, property);
            } else if (obj2 instanceof ArrayList) {
                ((ArrayList) obj2).add(property);
            }
            i13++;
            map3 = map;
        }
        if (z4) {
            return;
        }
        names.release();
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public void decrementRefCount() {
        checkRefCountIsZero();
        this.refCount--;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public Boolean getBoolean(String str) {
        Object property = getProperty(str);
        if (property instanceof Boolean) {
            return (Boolean) property;
        }
        return null;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public Boolean getBooleanProperty(String str) {
        return getBoolean(str);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public byte[] getBytes(String str) {
        Object property = getProperty(str);
        if (property instanceof byte[]) {
            return (byte[]) property;
        }
        return null;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public QuickJSContext getContext() {
        return this.context;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public Double getDouble(String str) {
        Object property = getProperty(str);
        if (property instanceof Double) {
            return (Double) property;
        }
        return null;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public Double getDoubleProperty(String str) {
        return getDouble(str);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public Integer getIntProperty(String str) {
        return getInteger(str);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public Integer getInteger(String str) {
        Object property = getProperty(str);
        if (property instanceof Integer) {
            return (Integer) property;
        }
        return null;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public JSArray getJSArray(String str) {
        Object property = getProperty(str);
        if (property instanceof JSArray) {
            return (JSArray) property;
        }
        return null;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public JSArray getJSArrayProperty(String str) {
        return getJSArray(str);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public JSFunction getJSFunction(String str) {
        Object property = getProperty(str);
        if (property instanceof JSFunction) {
            return (JSFunction) property;
        }
        return null;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public JSFunction getJSFunctionProperty(String str) {
        return getJSFunction(str);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public JSObject getJSObject(String str) {
        Object property = getProperty(str);
        if (property instanceof JSObject) {
            return (JSObject) property;
        }
        return null;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public JSObject getJSObjectProperty(String str) {
        return getJSObject(str);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public Long getLong(String str) {
        Object property = getProperty(str);
        if (property instanceof Long) {
            return (Long) property;
        }
        return null;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public JSArray getNames() {
        checkRefCountIsZero();
        return (JSArray) this.context.getOwnPropertyNames(this);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public JSArray getOwnPropertyNames() {
        return getNames();
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public long getPointer() {
        return this.pointer;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public Object getProperty(String str) {
        checkRefCountIsZero();
        return this.context.getProperty(this, str);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public int getRefCount() {
        return this.refCount;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public Throwable getStackTrace() {
        return this.stackTrace;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public String getString(String str) {
        Object property = getProperty(str);
        if (property instanceof String) {
            return (String) property;
        }
        return null;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public String getStringProperty(String str) {
        return getString(str);
    }

    public int hashCode() {
        return Arrays.hashCode(new long[]{this.pointer});
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public void hold() {
        checkRefCountIsZero();
        this.refCount++;
        this.context.hold(this);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public boolean isAlive() {
        return !isRefCountZero();
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public boolean isRefCountZero() {
        return this.refCount == 0;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public void release() {
        if (isRefCountZero()) {
            return;
        }
        this.refCount--;
        this.context.freeValue(this);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public void setProperty(String str, String str2) {
        setPropertyObject(str, str2);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public void setStackTrace(Throwable th3) {
        this.stackTrace = th3;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public String stringify() {
        checkRefCountIsZero();
        return this.context.stringify(this);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public ArrayList<Object> toArray() {
        return toArray(null);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public HashMap<String, Object> toMap() {
        return toMap(null);
    }

    public String toString() {
        checkRefCountIsZero();
        JSFunction jSFunction = getJSFunction("toString");
        String str = (String) jSFunction.call(new Object[0]);
        jSFunction.release();
        return str;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public void setProperty(String str, int i13) {
        setPropertyObject(str, Integer.valueOf(i13));
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public ArrayList<Object> toArray(MapFilter mapFilter, Object obj, MapCreator mapCreator) {
        throw new UnsupportedOperationException("Object types are not yet supported for conversion to array. You should use toMap.");
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public HashMap<String, Object> toMap(MapFilter mapFilter) {
        return (HashMap) toMap(mapFilter, null, new C4316g(8));
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public void setProperty(String str, long j7) {
        setPropertyObject(str, Long.valueOf(j7));
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public ArrayList<Object> toArray(MapFilter mapFilter) {
        return toArray(mapFilter, null, null);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public Map<String, Object> toMap(MapFilter mapFilter, Object obj, MapCreator mapCreator) {
        Map<String, Object> map = mapCreator.get();
        HashMap<Long, Object> map2 = new HashMap<>();
        convertToMap(this, map, map2, mapFilter, obj, mapCreator);
        map2.clear();
        return map;
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public void setProperty(String str, JSObject jSObject) {
        setPropertyObject(str, jSObject);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public void setProperty(String str, boolean z4) {
        setPropertyObject(str, Boolean.valueOf(z4));
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public void setProperty(String str, double d3) {
        setPropertyObject(str, Double.valueOf(d3));
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public void setProperty(String str, byte[] bArr) {
        setPropertyObject(str, bArr);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public void setProperty(String str, JSCallFunction jSCallFunction) {
        setPropertyObject(str, jSCallFunction);
    }

    @Override // com.amplitude.quickjs.wrapper.JSObject
    public void setProperty(String str, Class<?> cls) {
        final Object objNewInstance;
        try {
            objNewInstance = cls.newInstance();
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            objNewInstance = null;
        } catch (InstantiationException e13) {
            e13.printStackTrace();
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            JSObject jSObjectCreateNewJSObject = this.context.createNewJSObject();
            for (final Method method : cls.getMethods()) {
                if (method.isAnnotationPresent(JSMethod.class)) {
                    jSObjectCreateNewJSObject.setProperty(method.getName(), new JSCallFunction() { // from class: com.amplitude.quickjs.wrapper.b
                        @Override // com.amplitude.quickjs.wrapper.JSCallFunction
                        public final Object call(Object[] objArr) {
                            return QuickJSObject.lambda$setProperty$0(method, objNewInstance, objArr);
                        }
                    });
                }
            }
            setProperty(str, jSObjectCreateNewJSObject);
            jSObjectCreateNewJSObject.release();
            return;
        }
        throw new NullPointerException("The JavaObj cannot be null. An error occurred in newInstance!");
    }
}
