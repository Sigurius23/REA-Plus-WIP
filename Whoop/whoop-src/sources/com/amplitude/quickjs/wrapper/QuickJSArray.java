package com.amplitude.quickjs.wrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p047c9.C4316g;

/* JADX INFO: loaded from: classes6.dex */
public class QuickJSArray extends QuickJSObject implements JSArray {
    public QuickJSArray(QuickJSContext quickJSContext, long j7) {
        super(quickJSContext, j7);
    }

    @Override // com.amplitude.quickjs.wrapper.JSArray
    public Object get(int i13) {
        checkRefCountIsZero();
        return getContext().get(this, i13);
    }

    @Override // com.amplitude.quickjs.wrapper.JSArray
    public int length() {
        checkRefCountIsZero();
        return getContext().length(this);
    }

    @Override // com.amplitude.quickjs.wrapper.JSArray
    public void set(Object obj, int i13) {
        checkRefCountIsZero();
        getContext().set(this, obj, i13);
    }

    @Override // com.amplitude.quickjs.wrapper.QuickJSObject, com.amplitude.quickjs.wrapper.JSObject
    public ArrayList<Object> toArray() {
        return toArray(null);
    }

    @Override // com.amplitude.quickjs.wrapper.QuickJSObject, com.amplitude.quickjs.wrapper.JSObject
    public HashMap<String, Object> toMap() {
        return toMap(null);
    }

    @Override // com.amplitude.quickjs.wrapper.QuickJSObject, com.amplitude.quickjs.wrapper.JSObject
    public ArrayList<Object> toArray(MapFilter mapFilter) {
        return toArray(mapFilter, null, new C4316g(7));
    }

    @Override // com.amplitude.quickjs.wrapper.QuickJSObject, com.amplitude.quickjs.wrapper.JSObject
    public HashMap<String, Object> toMap(MapFilter mapFilter) {
        return (HashMap) toMap(mapFilter, null, null);
    }

    @Override // com.amplitude.quickjs.wrapper.QuickJSObject, com.amplitude.quickjs.wrapper.JSObject
    public ArrayList<Object> toArray(MapFilter mapFilter, Object obj, MapCreator mapCreator) {
        ArrayList<Object> arrayList = new ArrayList<>(length());
        HashMap<Long, Object> map = new HashMap<>();
        convertToMap(this, arrayList, map, mapFilter, obj, mapCreator);
        map.clear();
        return arrayList;
    }

    @Override // com.amplitude.quickjs.wrapper.QuickJSObject, com.amplitude.quickjs.wrapper.JSObject
    public Map<String, Object> toMap(MapFilter mapFilter, Object obj, MapCreator mapCreator) {
        throw new UnsupportedOperationException("Array types are not yet supported for conversion to map. You should use toArray.");
    }
}
