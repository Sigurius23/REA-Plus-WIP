package com.amplitude.quickjs.wrapper;

import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes.dex */
public class QuickJSContext implements Closeable {
    private static final String UNKNOWN_FILE = "unknown.js";
    private final long context;
    private final JSObjectCreator creator;
    private final long currentThreadId;
    private JSObject globalObject;
    private LeakDetectionListener leakDetectionListener;
    private ModuleLoader moduleLoader;
    private final long runtime;
    private boolean destroyed = false;
    private final HashMap<Integer, JSCallFunction> callFunctionMap = new HashMap<>();
    private final List<JSObject> objectRecords = new ArrayList();
    private boolean enableStackTrace = false;

    /* JADX INFO: loaded from: classes6.dex */
    public static abstract class BytecodeModuleLoader extends ModuleLoader {
        @Override // com.amplitude.quickjs.wrapper.ModuleLoader
        public String getModuleStringCode(String str) {
            return null;
        }

        @Override // com.amplitude.quickjs.wrapper.ModuleLoader
        public boolean isBytecodeMode() {
            return true;
        }
    }

    public interface Console {
        void debug(String str);

        void error(String str);

        void info(String str);

        void log(String str);

        void warn(String str);
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static abstract class DefaultModuleLoader extends ModuleLoader {
        @Override // com.amplitude.quickjs.wrapper.ModuleLoader
        public byte[] getModuleBytecode(String str) {
            return null;
        }

        @Override // com.amplitude.quickjs.wrapper.ModuleLoader
        public boolean isBytecodeMode() {
            return false;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public interface LeakDetectionListener {
        void notifyLeakDetected(JSObject jSObject, String str);
    }

    private QuickJSContext(final JSObjectCreator jSObjectCreator) {
        try {
            this.creator = new JSObjectCreator() { // from class: com.amplitude.quickjs.wrapper.QuickJSContext.2
                @Override // com.amplitude.quickjs.wrapper.JSObjectCreator
                public JSArray newArray(QuickJSContext quickJSContext, long j7) {
                    JSArray jSArrayNewArray = jSObjectCreator.newArray(quickJSContext, j7);
                    if (QuickJSContext.this.enableStackTrace) {
                        jSArrayNewArray.setStackTrace(new Throwable());
                    }
                    QuickJSContext.this.objectRecords.add(jSArrayNewArray);
                    return jSArrayNewArray;
                }

                @Override // com.amplitude.quickjs.wrapper.JSObjectCreator
                public JSFunction newFunction(QuickJSContext quickJSContext, long j7, long j13, int i13) {
                    JSFunction jSFunctionNewFunction = jSObjectCreator.newFunction(quickJSContext, j7, j13, i13);
                    if (QuickJSContext.this.enableStackTrace) {
                        jSFunctionNewFunction.setStackTrace(new Throwable());
                    }
                    QuickJSContext.this.objectRecords.add(jSFunctionNewFunction);
                    return jSFunctionNewFunction;
                }

                @Override // com.amplitude.quickjs.wrapper.JSObjectCreator
                public JSObject newObject(QuickJSContext quickJSContext, long j7) {
                    JSObject jSObjectNewObject = jSObjectCreator.newObject(quickJSContext, j7);
                    if (QuickJSContext.this.enableStackTrace) {
                        jSObjectNewObject.setStackTrace(new Throwable());
                    }
                    QuickJSContext.this.objectRecords.add(jSObjectNewObject);
                    return jSObjectNewObject;
                }
            };
            long jCreateRuntime = createRuntime();
            this.runtime = jCreateRuntime;
            this.context = createContext(jCreateRuntime);
            this.currentThreadId = Thread.currentThread().getId();
        } catch (UnsatisfiedLinkError unused) {
            throw new QuickJSException("The so library must be initialized before createContext! QuickJSLoader.init should be called on the Android platform. In the JVM, you need to manually call System.loadLibrary");
        }
    }

    private native Object call(long j7, long j13, long j14, int i13, Object[] objArr);

    private void checkDestroyed() {
        if (this.destroyed) {
            throw new QuickJSException("Can not called this after QuickJSContext was destroyed!");
        }
    }

    private void checkSameThread() {
        if (this.currentThreadId != Thread.currentThread().getId()) {
            throw new QuickJSException("Must be call same thread in QuickJSContext.create!");
        }
    }

    private native byte[] compile(long j7, String str, String str2, boolean z4);

    public static QuickJSContext create() {
        return new QuickJSContext(new JSObjectCreator() { // from class: com.amplitude.quickjs.wrapper.QuickJSContext.1
            @Override // com.amplitude.quickjs.wrapper.JSObjectCreator
            public JSArray newArray(QuickJSContext quickJSContext, long j7) {
                return new QuickJSArray(quickJSContext, j7);
            }

            @Override // com.amplitude.quickjs.wrapper.JSObjectCreator
            public JSFunction newFunction(QuickJSContext quickJSContext, long j7, long j13, int i13) {
                return new QuickJSFunction(quickJSContext, j7, j13, i13);
            }

            @Override // com.amplitude.quickjs.wrapper.JSObjectCreator
            public JSObject newObject(QuickJSContext quickJSContext, long j7) {
                return new QuickJSObject(quickJSContext, j7);
            }
        });
    }

    private native long createContext(long j7);

    private native long createRuntime();

    private native void destroyContext(long j7);

    private native void dumpMemoryUsage(long j7, String str);

    private native void dupValue(long j7, long j13);

    private void dupValue(JSObject jSObject) {
        checkSameThread();
        checkDestroyed();
        dupValue(this.context, jSObject.getPointer());
    }

    private native Object evaluate(long j7, String str, String str2);

    private native Object evaluateModule(long j7, String str, String str2);

    private native Object execute(long j7, byte[] bArr);

    private native void freeDupValue(long j7, long j13);

    private native void freeValue(long j7, long j13);

    private native Object get(long j7, long j13, int i13);

    private native JSObject getGlobalObject(long j7);

    private native long getMemoryUsedSize(long j7);

    private native Object getOwnPropertyNames(long j7, long j13);

    private native Object getProperty(long j7, long j13, String str);

    private native boolean isLiveObject(long j7, long j13);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$setConsole$0(Console console, Object[] objArr) {
        if (objArr.length != 2) {
            return null;
        }
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        switch (str.hashCode()) {
            case 107332:
                str.equals("log");
                break;
            case 3641990:
                if (str.equals("warn")) {
                    console.warn(str2);
                    return null;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    console.debug(str2);
                    return null;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    console.error(str2);
                    return null;
                }
                break;
        }
        console.log(str2);
        return null;
    }

    private native int length(long j7, long j13);

    private native Object parseJSON(long j7, String str);

    private void putCallFunction(JSCallFunction jSCallFunction) {
        this.callFunctionMap.put(Integer.valueOf(jSCallFunction.hashCode()), jSCallFunction);
    }

    private native void runGC(long j7);

    private native void set(long j7, long j13, Object obj, int i13);

    private native void setGCThreshold(long j7, int i13);

    private native void setMaxStackSize(long j7, int i13);

    private native void setMemoryLimit(long j7, int i13);

    private native void setProperty(long j7, long j13, String str, Object obj);

    private native String stringify(long j7, long j13);

    public Object call(JSObject jSObject, long j7, int i13, Object... objArr) {
        checkSameThread();
        checkDestroyed();
        for (Object obj : objArr) {
            if (obj instanceof JSCallFunction) {
                putCallFunction((JSCallFunction) obj);
            }
        }
        return call(this.context, jSObject.getPointer(), j7, i13, objArr);
    }

    public Object callFunctionBack(int i13, Object... objArr) {
        checkSameThread();
        checkDestroyed();
        Object objCall = this.callFunctionMap.get(Integer.valueOf(i13)).call(objArr);
        if (objCall instanceof JSCallFunction) {
            putCallFunction((JSCallFunction) objCall);
        }
        if (objCall instanceof JSObject) {
            JSObject jSObject = (JSObject) objCall;
            jSObject.decrementRefCount();
            if (jSObject.getRefCount() == 0) {
                this.objectRecords.remove(jSObject);
            }
        }
        return objCall;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws QuickJSException {
        destroy();
    }

    public byte[] compile(String str) {
        return compile(str, UNKNOWN_FILE);
    }

    public byte[] compileModule(String str) {
        return compileModule(str, UNKNOWN_FILE);
    }

    public JSArray createNewJSArray() {
        return (JSArray) parseJSON("[]");
    }

    public JSObject createNewJSObject() {
        return parseJSON("{}");
    }

    public void destroy() {
        checkSameThread();
        checkDestroyed();
        this.callFunctionMap.clear();
        releaseObjectRecords();
        this.objectRecords.clear();
        destroyContext(this.context);
        this.destroyed = true;
    }

    public void dumpMemoryUsage(File file) {
        checkSameThread();
        checkDestroyed();
        dumpMemoryUsage(this.runtime, (file == null || !file.exists()) ? null : file.getAbsolutePath());
    }

    public Object evaluate(String str) {
        return evaluate(str, UNKNOWN_FILE);
    }

    public Object evaluateModule(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(AbstractC11266d.m30461o("Script cannot be null with ", str2));
        }
        checkSameThread();
        checkDestroyed();
        return evaluateModule(this.context, str, str2);
    }

    public Object execute(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Bytecode cannot be null");
        }
        checkSameThread();
        checkDestroyed();
        return execute(this.context, bArr);
    }

    public void freeValue(JSObject jSObject) {
        checkSameThread();
        checkDestroyed();
        freeValue(this.context, jSObject.getPointer());
        if (jSObject.getRefCount() == 0) {
            this.objectRecords.remove(jSObject);
        }
    }

    public Object get(JSArray jSArray, int i13) {
        checkSameThread();
        checkDestroyed();
        return get(this.context, jSArray.getPointer(), i13);
    }

    public int getCallFunctionMapSize() {
        return this.callFunctionMap.size();
    }

    public JSObjectCreator getCreator() {
        return this.creator;
    }

    public long getCurrentThreadId() {
        return this.currentThreadId;
    }

    public JSObject getGlobalObject() {
        checkSameThread();
        checkDestroyed();
        if (this.globalObject == null) {
            this.globalObject = getGlobalObject(this.context);
        }
        return this.globalObject;
    }

    public long getMemoryUsedSize() {
        return getMemoryUsedSize(this.runtime);
    }

    public ModuleLoader getModuleLoader() {
        return this.moduleLoader;
    }

    public List<JSObject> getObjectRecords() {
        return this.objectRecords;
    }

    public Object getOwnPropertyNames(JSObject jSObject) {
        return getOwnPropertyNames(this.context, jSObject.getPointer());
    }

    public Object getProperty(JSObject jSObject, String str) {
        checkSameThread();
        checkDestroyed();
        return getProperty(this.context, jSObject.getPointer(), str);
    }

    public void hold(JSObject jSObject) {
        checkSameThread();
        checkDestroyed();
        dupValue(jSObject);
    }

    public boolean isLiveObject(JSObject jSObject) {
        return isLiveObject(this.runtime, jSObject.getPointer());
    }

    public int length(JSArray jSArray) {
        checkSameThread();
        checkDestroyed();
        if (isLiveObject(jSArray)) {
            return length(this.context, jSArray.getPointer());
        }
        return 0;
    }

    public Object parse(String str) {
        checkSameThread();
        checkDestroyed();
        return parseJSON(this.context, str);
    }

    @Deprecated
    public JSObject parseJSON(String str) {
        checkSameThread();
        checkDestroyed();
        Object json = parseJSON(this.context, str);
        if (json instanceof JSObject) {
            return (JSObject) json;
        }
        throw new QuickJSException("Only parse json with valid format, must be start with '{', if it contains other case, use parse(String) replace.");
    }

    public void releaseObjectRecords() {
        releaseObjectRecords(true);
    }

    public void removeCallFunction(int i13) {
        this.callFunctionMap.remove(Integer.valueOf(i13));
    }

    public void runGC() {
        runGC(this.runtime);
    }

    public void set(JSArray jSArray, Object obj, int i13) {
        checkSameThread();
        checkDestroyed();
        set(this.context, jSArray.getPointer(), obj, i13);
    }

    public void setConsole(Console console) {
        if (console == null) {
            return;
        }
        JSObject jSObject = getGlobalObject().getJSObject("console");
        jSObject.setProperty("stdout", new C4957a(console, 0));
        jSObject.release();
    }

    public void setEnableStackTrace(boolean z4) {
        this.enableStackTrace = z4;
    }

    public void setGCThreshold(int i13) {
        setGCThreshold(this.runtime, i13);
    }

    public void setLeakDetectionListener(LeakDetectionListener leakDetectionListener) {
        this.leakDetectionListener = leakDetectionListener;
    }

    public void setMaxStackSize(int i13) {
        setMaxStackSize(this.runtime, i13);
    }

    public void setMemoryLimit(int i13) {
        setMemoryLimit(this.runtime, i13);
    }

    public void setModuleLoader(ModuleLoader moduleLoader) {
        checkSameThread();
        checkDestroyed();
        if (moduleLoader == null) {
            throw new NullPointerException("The moduleLoader can not be null!");
        }
        this.moduleLoader = moduleLoader;
    }

    public void setProperty(JSObject jSObject, String str, Object obj) {
        checkSameThread();
        checkDestroyed();
        if (obj instanceof JSCallFunction) {
            putCallFunction((JSCallFunction) obj);
        }
        setProperty(this.context, jSObject.getPointer(), str, obj);
    }

    public String stringify(JSObject jSObject) {
        checkSameThread();
        checkDestroyed();
        return stringify(this.context, jSObject.getPointer());
    }

    public void throwJSException(String str) {
        evaluate("throw \"" + str + "\";");
    }

    public static QuickJSContext create(JSObjectCreator jSObjectCreator) {
        return new QuickJSContext(jSObjectCreator);
    }

    public byte[] compile(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(AbstractC11266d.m30461o("Script cannot be null with ", str2));
        }
        checkSameThread();
        checkDestroyed();
        return compile(this.context, str, str2, false);
    }

    public byte[] compileModule(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(AbstractC11266d.m30461o("Script cannot be null with ", str2));
        }
        checkSameThread();
        checkDestroyed();
        return compile(this.context, str, str2, true);
    }

    public Object evaluate(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(AbstractC11266d.m30461o("Script cannot be null with ", str2));
        }
        checkSameThread();
        checkDestroyed();
        return evaluate(this.context, str, str2);
    }

    public void releaseObjectRecords(boolean z4) {
        JSFunction jSFunction = getGlobalObject().getJSFunction("format");
        Iterator<JSObject> it = this.objectRecords.iterator();
        while (it.hasNext()) {
            JSObject next = it.next();
            if (!next.isRefCountZero() && next != getGlobalObject() && next != jSFunction) {
                int refCount = next.getRefCount();
                if (this.leakDetectionListener != null) {
                    this.leakDetectionListener.notifyLeakDetected(next, (String) jSFunction.call(next));
                }
                if (z4) {
                    for (int i13 = 0; i13 < refCount; i13++) {
                        next.decrementRefCount();
                        freeValue(this.context, next.getPointer());
                    }
                    if (next.getRefCount() == 0) {
                        it.remove();
                    }
                }
            }
        }
        jSFunction.release();
    }

    public void dumpMemoryUsage() {
        dumpMemoryUsage(null);
    }

    public Object evaluateModule(String str) {
        return evaluateModule(str, UNKNOWN_FILE);
    }
}
