.class public Lcom/amplitude/quickjs/wrapper/QuickJSContext;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amplitude/quickjs/wrapper/QuickJSContext$Console;,
        Lcom/amplitude/quickjs/wrapper/QuickJSContext$LeakDetectionListener;,
        Lcom/amplitude/quickjs/wrapper/QuickJSContext$BytecodeModuleLoader;,
        Lcom/amplitude/quickjs/wrapper/QuickJSContext$DefaultModuleLoader;
    }
.end annotation


# static fields
.field private static final UNKNOWN_FILE:Ljava/lang/String; = "unknown.js"


# instance fields
.field private final callFunctionMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/amplitude/quickjs/wrapper/JSCallFunction;",
            ">;"
        }
    .end annotation
.end field

.field private final context:J

.field private final creator:Lcom/amplitude/quickjs/wrapper/JSObjectCreator;

.field private final currentThreadId:J

.field private destroyed:Z

.field private enableStackTrace:Z

.field private globalObject:Lcom/amplitude/quickjs/wrapper/JSObject;

.field private leakDetectionListener:Lcom/amplitude/quickjs/wrapper/QuickJSContext$LeakDetectionListener;

.field private moduleLoader:Lcom/amplitude/quickjs/wrapper/ModuleLoader;

.field private final objectRecords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/amplitude/quickjs/wrapper/JSObject;",
            ">;"
        }
    .end annotation
.end field

.field private final runtime:J


# direct methods
.method private constructor <init>(Lcom/amplitude/quickjs/wrapper/JSObjectCreator;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->destroyed:Z

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->callFunctionMap:Ljava/util/HashMap;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->objectRecords:Ljava/util/List;

    iput-boolean v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->enableStackTrace:Z

    :try_start_0
    new-instance v0, Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;

    invoke-direct {v0, p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;-><init>(Lcom/amplitude/quickjs/wrapper/QuickJSContext;Lcom/amplitude/quickjs/wrapper/JSObjectCreator;)V

    iput-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->creator:Lcom/amplitude/quickjs/wrapper/JSObjectCreator;

    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->createRuntime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->runtime:J

    invoke-direct {p0, v0, v1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->createContext(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->currentThreadId:J

    return-void

    :catch_0
    new-instance p1, Lcom/amplitude/quickjs/wrapper/QuickJSException;

    const-string v0, "The so library must be initialized before createContext! QuickJSLoader.init should be called on the Android platform. In the JVM, you need to manually call System.loadLibrary"

    invoke-direct {p1, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic access$000(Lcom/amplitude/quickjs/wrapper/QuickJSContext;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->enableStackTrace:Z

    return p0
.end method

.method public static synthetic access$100(Lcom/amplitude/quickjs/wrapper/QuickJSContext;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->objectRecords:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic b(Lcom/amplitude/quickjs/wrapper/QuickJSContext$Console;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->lambda$setConsole$0(Lcom/amplitude/quickjs/wrapper/QuickJSContext$Console;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private native call(JJJI[Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method private checkDestroyed()V
    .locals 2

    iget-boolean v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->destroyed:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/amplitude/quickjs/wrapper/QuickJSException;

    const-string v1, "Can not called this after QuickJSContext was destroyed!"

    invoke-direct {v0, v1}, Lcom/amplitude/quickjs/wrapper/QuickJSException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private checkSameThread()V
    .locals 4

    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->currentThreadId:J

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/amplitude/quickjs/wrapper/QuickJSException;

    const-string v1, "Must be call same thread in QuickJSContext.create!"

    invoke-direct {v0, v1}, Lcom/amplitude/quickjs/wrapper/QuickJSException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private native compile(JLjava/lang/String;Ljava/lang/String;Z)[B
.end method

.method public static create()Lcom/amplitude/quickjs/wrapper/QuickJSContext;
    .locals 2

    .line 1
    new-instance v0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    new-instance v1, Lcom/amplitude/quickjs/wrapper/QuickJSContext$1;

    invoke-direct {v1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext$1;-><init>()V

    invoke-direct {v0, v1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;-><init>(Lcom/amplitude/quickjs/wrapper/JSObjectCreator;)V

    return-object v0
.end method

.method public static create(Lcom/amplitude/quickjs/wrapper/JSObjectCreator;)Lcom/amplitude/quickjs/wrapper/QuickJSContext;
    .locals 1

    .line 2
    new-instance v0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-direct {v0, p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;-><init>(Lcom/amplitude/quickjs/wrapper/JSObjectCreator;)V

    return-object v0
.end method

.method private native createContext(J)J
.end method

.method private native createRuntime()J
.end method

.method private native destroyContext(J)V
.end method

.method private native dumpMemoryUsage(JLjava/lang/String;)V
.end method

.method private native dupValue(JJ)V
.end method

.method private dupValue(Lcom/amplitude/quickjs/wrapper/JSObject;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 3
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-interface {p1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->dupValue(JJ)V

    return-void
.end method

.method private native evaluate(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
.end method

.method private native evaluateModule(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
.end method

.method private native execute(J[B)Ljava/lang/Object;
.end method

.method private native freeDupValue(JJ)V
.end method

.method private native freeValue(JJ)V
.end method

.method private native get(JJI)Ljava/lang/Object;
.end method

.method private native getGlobalObject(J)Lcom/amplitude/quickjs/wrapper/JSObject;
.end method

.method private native getMemoryUsedSize(J)J
.end method

.method private native getOwnPropertyNames(JJ)Ljava/lang/Object;
.end method

.method private native getProperty(JJLjava/lang/String;)Ljava/lang/Object;
.end method

.method private native isLiveObject(JJ)Z
.end method

.method private static synthetic lambda$setConsole$0(Lcom/amplitude/quickjs/wrapper/QuickJSContext$Console;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    array-length v0, p1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object v0, p1, v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x1

    aget-object p1, p1, v1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "error"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext$Console;->error(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_1
    const-string v1, "debug"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext$Console;->debug(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_2
    const-string v1, "warn"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext$Console;->warn(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_3
    const-string v1, "log"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    :cond_0
    :goto_0
    invoke-interface {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext$Console;->log(Ljava/lang/String;)V

    :cond_1
    :goto_1
    const/4 p0, 0x0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1a344 -> :sswitch_3
        0x379286 -> :sswitch_2
        0x5b09653 -> :sswitch_1
        0x5c4d208 -> :sswitch_0
    .end sparse-switch
.end method

.method private native length(JJ)I
.end method

.method private native parseJSON(JLjava/lang/String;)Ljava/lang/Object;
.end method

.method private putCallFunction(Lcom/amplitude/quickjs/wrapper/JSCallFunction;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->callFunctionMap:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private native runGC(J)V
.end method

.method private native set(JJLjava/lang/Object;I)V
.end method

.method private native setGCThreshold(JI)V
.end method

.method private native setMaxStackSize(JI)V
.end method

.method private native setMemoryLimit(JI)V
.end method

.method private native setProperty(JJLjava/lang/String;Ljava/lang/Object;)V
.end method

.method private native stringify(JJ)Ljava/lang/String;
.end method


# virtual methods
.method public varargs call(Lcom/amplitude/quickjs/wrapper/JSObject;JI[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    const/4 v0, 0x0

    .line 3
    :goto_0
    array-length v1, p5

    if-ge v0, v1, :cond_1

    .line 4
    aget-object v1, p5, v0

    .line 5
    instance-of v2, v1, Lcom/amplitude/quickjs/wrapper/JSCallFunction;

    if-eqz v2, :cond_0

    .line 6
    check-cast v1, Lcom/amplitude/quickjs/wrapper/JSCallFunction;

    invoke-direct {p0, v1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->putCallFunction(Lcom/amplitude/quickjs/wrapper/JSCallFunction;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 7
    :cond_1
    iget-wide v2, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-interface {p1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v4

    move-object v1, p0

    move-wide v6, p2

    move v8, p4

    move-object v9, p5

    invoke-direct/range {v1 .. v9}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->call(JJJI[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public varargs callFunctionBack(I[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->callFunctionMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amplitude/quickjs/wrapper/JSCallFunction;

    invoke-interface {p1, p2}, Lcom/amplitude/quickjs/wrapper/JSCallFunction;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lcom/amplitude/quickjs/wrapper/JSCallFunction;

    if-eqz p2, :cond_0

    move-object p2, p1

    check-cast p2, Lcom/amplitude/quickjs/wrapper/JSCallFunction;

    invoke-direct {p0, p2}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->putCallFunction(Lcom/amplitude/quickjs/wrapper/JSCallFunction;)V

    :cond_0
    instance-of p2, p1, Lcom/amplitude/quickjs/wrapper/JSObject;

    if-eqz p2, :cond_1

    move-object p2, p1

    check-cast p2, Lcom/amplitude/quickjs/wrapper/JSObject;

    invoke-interface {p2}, Lcom/amplitude/quickjs/wrapper/JSObject;->decrementRefCount()V

    invoke-interface {p2}, Lcom/amplitude/quickjs/wrapper/JSObject;->getRefCount()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->objectRecords:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_1
    return-object p1
.end method

.method public close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/amplitude/quickjs/wrapper/QuickJSException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->destroy()V

    return-void
.end method

.method public compile(Ljava/lang/String;)[B
    .locals 1

    .line 1
    const-string v0, "unknown.js"

    invoke-virtual {p0, p1, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->compile(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    return-object p1
.end method

.method public compile(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 6

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 3
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 4
    iget-wide v1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    const/4 v5, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->compile(JLjava/lang/String;Ljava/lang/String;Z)[B

    move-result-object p1

    return-object p1

    :cond_0
    move-object v4, p2

    .line 5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Script cannot be null with "

    .line 6
    invoke-static {p2, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 7
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public compileModule(Ljava/lang/String;)[B
    .locals 1

    .line 1
    const-string v0, "unknown.js"

    invoke-virtual {p0, p1, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->compileModule(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    return-object p1
.end method

.method public compileModule(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 6

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 3
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 4
    iget-wide v1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    const/4 v5, 0x1

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->compile(JLjava/lang/String;Ljava/lang/String;Z)[B

    move-result-object p1

    return-object p1

    :cond_0
    move-object v4, p2

    .line 5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Script cannot be null with "

    .line 6
    invoke-static {p2, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 7
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public createNewJSArray()Lcom/amplitude/quickjs/wrapper/JSArray;
    .locals 1

    const-string v0, "[]"

    invoke-virtual {p0, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->parseJSON(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object v0

    check-cast v0, Lcom/amplitude/quickjs/wrapper/JSArray;

    return-object v0
.end method

.method public createNewJSObject()Lcom/amplitude/quickjs/wrapper/JSObject;
    .locals 1

    const-string v0, "{}"

    invoke-virtual {p0, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->parseJSON(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object v0

    return-object v0
.end method

.method public destroy()V
    .locals 2

    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->callFunctionMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->releaseObjectRecords()V

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->objectRecords:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-direct {p0, v0, v1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->destroyContext(J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->destroyed:Z

    return-void
.end method

.method public dumpMemoryUsage()V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->dumpMemoryUsage(Ljava/io/File;)V

    return-void
.end method

.method public dumpMemoryUsage(Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    :goto_0
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->runtime:J

    invoke-direct {p0, v0, v1, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->dumpMemoryUsage(JLjava/lang/String;)V

    return-void
.end method

.method public evaluate(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "unknown.js"

    invoke-virtual {p0, p1, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->evaluate(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public evaluate(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 3
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 4
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->evaluate(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Script cannot be null with "

    .line 6
    invoke-static {v0, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 7
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public evaluateModule(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 11
    const-string v0, "unknown.js"

    invoke-virtual {p0, p1, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->evaluateModule(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public evaluateModule(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 3
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->evaluateModule(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Script cannot be null with "

    .line 5
    invoke-static {v0, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 6
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public execute([B)Ljava/lang/Object;
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 3
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-direct {p0, v0, v1, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->execute(J[B)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Bytecode cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public freeValue(Lcom/amplitude/quickjs/wrapper/JSObject;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 3
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-interface {p1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->freeValue(JJ)V

    .line 4
    invoke-interface {p1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getRefCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->objectRecords:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public get(Lcom/amplitude/quickjs/wrapper/JSArray;I)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 3
    iget-wide v1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-interface {p1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v3

    move-object v0, p0

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->get(JJI)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getCallFunctionMapSize()I
    .locals 1

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->callFunctionMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method public getCreator()Lcom/amplitude/quickjs/wrapper/JSObjectCreator;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->creator:Lcom/amplitude/quickjs/wrapper/JSObjectCreator;

    return-object v0
.end method

.method public getCurrentThreadId()J
    .locals 2

    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->currentThreadId:J

    return-wide v0
.end method

.method public getGlobalObject()Lcom/amplitude/quickjs/wrapper/JSObject;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 3
    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->globalObject:Lcom/amplitude/quickjs/wrapper/JSObject;

    if-nez v0, :cond_0

    .line 4
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-direct {p0, v0, v1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getGlobalObject(J)Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object v0

    iput-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->globalObject:Lcom/amplitude/quickjs/wrapper/JSObject;

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->globalObject:Lcom/amplitude/quickjs/wrapper/JSObject;

    return-object v0
.end method

.method public getMemoryUsedSize()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->runtime:J

    invoke-direct {p0, v0, v1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getMemoryUsedSize(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getModuleLoader()Lcom/amplitude/quickjs/wrapper/ModuleLoader;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->moduleLoader:Lcom/amplitude/quickjs/wrapper/ModuleLoader;

    return-object v0
.end method

.method public getObjectRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/amplitude/quickjs/wrapper/JSObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->objectRecords:Ljava/util/List;

    return-object v0
.end method

.method public getOwnPropertyNames(Lcom/amplitude/quickjs/wrapper/JSObject;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-interface {p1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getOwnPropertyNames(JJ)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getProperty(Lcom/amplitude/quickjs/wrapper/JSObject;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 3
    iget-wide v1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-interface {p1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v3

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getProperty(JJLjava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public hold(Lcom/amplitude/quickjs/wrapper/JSObject;)V
    .locals 0

    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    invoke-direct {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->dupValue(Lcom/amplitude/quickjs/wrapper/JSObject;)V

    return-void
.end method

.method public isLiveObject(Lcom/amplitude/quickjs/wrapper/JSObject;)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->runtime:J

    invoke-interface {p1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->isLiveObject(JJ)Z

    move-result p1

    return p1
.end method

.method public length(Lcom/amplitude/quickjs/wrapper/JSArray;)I
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 3
    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->isLiveObject(Lcom/amplitude/quickjs/wrapper/JSObject;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 4
    :cond_0
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-interface {p1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->length(JJ)I

    move-result p1

    return p1
.end method

.method public parse(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-direct {p0, v0, v1, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->parseJSON(JLjava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public parseJSON(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSObject;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 3
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-direct {p0, v0, v1, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->parseJSON(JLjava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    .line 4
    instance-of v0, p1, Lcom/amplitude/quickjs/wrapper/JSObject;

    if-eqz v0, :cond_0

    .line 5
    check-cast p1, Lcom/amplitude/quickjs/wrapper/JSObject;

    return-object p1

    .line 6
    :cond_0
    new-instance p1, Lcom/amplitude/quickjs/wrapper/QuickJSException;

    const-string v0, "Only parse json with valid format, must be start with \'{\', if it contains other case, use parse(String) replace."

    invoke-direct {p1, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public releaseObjectRecords()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->releaseObjectRecords(Z)V

    return-void
.end method

.method public releaseObjectRecords(Z)V
    .locals 9

    .line 2
    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getGlobalObject()Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object v0

    const-string v1, "format"

    invoke-interface {v0, v1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getJSFunction(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSFunction;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->objectRecords:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 4
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 5
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/amplitude/quickjs/wrapper/JSObject;

    .line 6
    invoke-interface {v2}, Lcom/amplitude/quickjs/wrapper/JSObject;->isRefCountZero()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getGlobalObject()Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object v3

    if-eq v2, v3, :cond_0

    if-eq v2, v0, :cond_0

    .line 7
    invoke-interface {v2}, Lcom/amplitude/quickjs/wrapper/JSObject;->getRefCount()I

    move-result v3

    .line 8
    iget-object v4, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->leakDetectionListener:Lcom/amplitude/quickjs/wrapper/QuickJSContext$LeakDetectionListener;

    if-eqz v4, :cond_1

    .line 9
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v4}, Lcom/amplitude/quickjs/wrapper/JSFunction;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 10
    iget-object v5, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->leakDetectionListener:Lcom/amplitude/quickjs/wrapper/QuickJSContext$LeakDetectionListener;

    invoke-interface {v5, v2, v4}, Lcom/amplitude/quickjs/wrapper/QuickJSContext$LeakDetectionListener;->notifyLeakDetected(Lcom/amplitude/quickjs/wrapper/JSObject;Ljava/lang/String;)V

    :cond_1
    if-eqz p1, :cond_0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_2

    .line 11
    invoke-interface {v2}, Lcom/amplitude/quickjs/wrapper/JSObject;->decrementRefCount()V

    .line 12
    iget-wide v5, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-interface {v2}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v7

    invoke-direct {p0, v5, v6, v7, v8}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->freeValue(JJ)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 13
    :cond_2
    invoke-interface {v2}, Lcom/amplitude/quickjs/wrapper/JSObject;->getRefCount()I

    move-result v2

    if-nez v2, :cond_0

    .line 14
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 15
    :cond_3
    invoke-interface {v0}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    return-void
.end method

.method public removeCallFunction(I)V
    .locals 1

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->callFunctionMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public runGC()V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->runtime:J

    invoke-direct {p0, v0, v1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->runGC(J)V

    return-void
.end method

.method public set(Lcom/amplitude/quickjs/wrapper/JSArray;Ljava/lang/Object;I)V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 3
    iget-wide v1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-interface {p1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v3

    move-object v0, p0

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->set(JJLjava/lang/Object;I)V

    return-void
.end method

.method public setConsole(Lcom/amplitude/quickjs/wrapper/QuickJSContext$Console;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getGlobalObject()Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object v0

    const-string v1, "console"

    invoke-interface {v0, v1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getJSObject(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object v0

    new-instance v1, Lcom/amplitude/quickjs/wrapper/a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/amplitude/quickjs/wrapper/a;-><init>(Ljava/lang/Object;I)V

    const-string p1, "stdout"

    invoke-interface {v0, p1, v1}, Lcom/amplitude/quickjs/wrapper/JSObject;->setProperty(Ljava/lang/String;Lcom/amplitude/quickjs/wrapper/JSCallFunction;)V

    invoke-interface {v0}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    return-void
.end method

.method public setEnableStackTrace(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->enableStackTrace:Z

    return-void
.end method

.method public setGCThreshold(I)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->runtime:J

    invoke-direct {p0, v0, v1, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->setGCThreshold(JI)V

    return-void
.end method

.method public setLeakDetectionListener(Lcom/amplitude/quickjs/wrapper/QuickJSContext$LeakDetectionListener;)V
    .locals 0

    iput-object p1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->leakDetectionListener:Lcom/amplitude/quickjs/wrapper/QuickJSContext$LeakDetectionListener;

    return-void
.end method

.method public setMaxStackSize(I)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->runtime:J

    invoke-direct {p0, v0, v1, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->setMaxStackSize(JI)V

    return-void
.end method

.method public setMemoryLimit(I)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->runtime:J

    invoke-direct {p0, v0, v1, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->setMemoryLimit(JI)V

    return-void
.end method

.method public setModuleLoader(Lcom/amplitude/quickjs/wrapper/ModuleLoader;)V
    .locals 1

    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->moduleLoader:Lcom/amplitude/quickjs/wrapper/ModuleLoader;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "The moduleLoader can not be null!"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setProperty(Lcom/amplitude/quickjs/wrapper/JSObject;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 3
    instance-of v0, p3, Lcom/amplitude/quickjs/wrapper/JSCallFunction;

    if-eqz v0, :cond_0

    .line 4
    move-object v0, p3

    check-cast v0, Lcom/amplitude/quickjs/wrapper/JSCallFunction;

    invoke-direct {p0, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->putCallFunction(Lcom/amplitude/quickjs/wrapper/JSCallFunction;)V

    .line 5
    :cond_0
    iget-wide v2, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-interface {p1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v4

    move-object v1, p0

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->setProperty(JJLjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public stringify(Lcom/amplitude/quickjs/wrapper/JSObject;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkSameThread()V

    .line 2
    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->checkDestroyed()V

    .line 3
    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->context:J

    invoke-interface {p1}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->stringify(JJ)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public throwJSException(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "throw \""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\";"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->evaluate(Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method
