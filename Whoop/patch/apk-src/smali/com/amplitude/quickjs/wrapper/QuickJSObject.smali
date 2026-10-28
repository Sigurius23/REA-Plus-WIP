.class public Lcom/amplitude/quickjs/wrapper/QuickJSObject;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amplitude/quickjs/wrapper/JSObject;


# instance fields
.field private final context:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

.field private final pointer:J

.field private refCount:I

.field private stackTrace:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lcom/amplitude/quickjs/wrapper/QuickJSContext;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->context:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    iput-wide p2, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->pointer:J

    iget p1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->refCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->refCount:I

    return-void
.end method

.method public static synthetic a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->lambda$setProperty$0(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$setProperty$0(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private setPropertyObject(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->checkRefCountIsZero()V

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->context:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-virtual {v0, p0, p1, p2}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->setProperty(Lcom/amplitude/quickjs/wrapper/JSObject;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final checkRefCountIsZero()V
    .locals 2

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->isRefCountZero()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/amplitude/quickjs/wrapper/QuickJSException;

    const-string v1, "The call threw an exception, the reference count of the current object has already reached zero."

    invoke-direct {v0, v1}, Lcom/amplitude/quickjs/wrapper/QuickJSException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public convertToMap(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap;Lcom/amplitude/quickjs/wrapper/MapFilter;Ljava/lang/Object;Lcom/amplitude/quickjs/wrapper/MapCreator;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/amplitude/quickjs/wrapper/MapFilter;",
            "Ljava/lang/Object;",
            "Lcom/amplitude/quickjs/wrapper/MapCreator;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object v9, v0

    check-cast v9, Lcom/amplitude/quickjs/wrapper/JSObject;

    invoke-interface {v9}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v5, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v10, v0, Lcom/amplitude/quickjs/wrapper/JSArray;

    if-eqz v10, :cond_0

    check-cast v0, Lcom/amplitude/quickjs/wrapper/JSArray;

    goto :goto_0

    :cond_0
    invoke-interface {v9}, Lcom/amplitude/quickjs/wrapper/JSObject;->getNames()Lcom/amplitude/quickjs/wrapper/JSArray;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Lcom/amplitude/quickjs/wrapper/JSArray;->length()I

    move-result v11

    const/4 v2, 0x0

    move v12, v2

    :goto_1
    if-ge v12, v11, :cond_f

    if-eqz v10, :cond_1

    invoke-interface {v0, v12}, Lcom/amplitude/quickjs/wrapper/JSArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    move-object/from16 v4, p5

    move-object v13, v3

    move-object v3, v2

    move-object/from16 v2, p0

    goto :goto_2

    :cond_1
    invoke-interface {v0, v12}, Lcom/amplitude/quickjs/wrapper/JSArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    move-object/from16 v2, p0

    if-eqz v6, :cond_2

    iget-wide v7, v2, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->pointer:J

    move-object/from16 v4, p5

    invoke-interface {v6, v3, v7, v8, v4}, Lcom/amplitude/quickjs/wrapper/MapFilter;->shouldSkipKey(Ljava/lang/String;JLjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto/16 :goto_5

    :cond_2
    move-object/from16 v4, p5

    :cond_3
    invoke-interface {v9, v3}, Lcom/amplitude/quickjs/wrapper/JSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    move-object v13, v3

    move-object v3, v7

    :goto_2
    nop

    instance-of v7, v3, Lcom/amplitude/quickjs/wrapper/JSObject;

    if-eqz v7, :cond_5

    move-object v8, v3

    check-cast v8, Lcom/amplitude/quickjs/wrapper/JSObject;

    invoke-interface {v8}, Lcom/amplitude/quickjs/wrapper/JSObject;->getPointer()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v7, v1, Ljava/util/Map;

    if-eqz v7, :cond_4

    move-object v7, v1

    check-cast v7, Ljava/util/Map;

    invoke-interface {v7, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    :cond_4
    instance-of v7, v1, Ljava/util/ArrayList;

    if-eqz v7, :cond_e

    move-object v7, v1

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    :cond_5
    instance-of v8, v3, Lcom/amplitude/quickjs/wrapper/JSFunction;

    if-eqz v8, :cond_6

    check-cast v3, Lcom/amplitude/quickjs/wrapper/JSFunction;

    invoke-interface {v3}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    goto/16 :goto_5

    :cond_6
    instance-of v8, v3, Lcom/amplitude/quickjs/wrapper/JSArray;

    if-eqz v8, :cond_9

    new-instance v4, Ljava/util/ArrayList;

    move-object v14, v3

    check-cast v14, Lcom/amplitude/quickjs/wrapper/JSArray;

    invoke-interface {v14}, Lcom/amplitude/quickjs/wrapper/JSArray;->length()I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    invoke-virtual/range {v2 .. v8}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->convertToMap(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap;Lcom/amplitude/quickjs/wrapper/MapFilter;Ljava/lang/Object;Lcom/amplitude/quickjs/wrapper/MapCreator;)V

    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_7

    move-object v2, v1

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2, v13, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_7
    instance-of v2, v1, Ljava/util/ArrayList;

    if-eqz v2, :cond_8

    move-object v2, v1

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    :goto_3
    invoke-interface {v14}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    goto :goto_5

    :cond_9
    if-eqz v7, :cond_c

    invoke-interface/range {p6 .. p6}, Lcom/amplitude/quickjs/wrapper/MapCreator;->get()Ljava/util/Map;

    move-result-object v4

    move-object/from16 v2, p0

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    invoke-virtual/range {v2 .. v8}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->convertToMap(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap;Lcom/amplitude/quickjs/wrapper/MapFilter;Ljava/lang/Object;Lcom/amplitude/quickjs/wrapper/MapCreator;)V

    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_a

    move-object v2, v1

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2, v13, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_a
    instance-of v2, v1, Ljava/util/ArrayList;

    if-eqz v2, :cond_b

    move-object v2, v1

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    :goto_4
    check-cast v3, Lcom/amplitude/quickjs/wrapper/JSObject;

    invoke-interface {v3}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    goto :goto_5

    :cond_c
    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_d

    move-object v2, v1

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_d
    instance-of v2, v1, Ljava/util/ArrayList;

    if-eqz v2, :cond_e

    move-object v2, v1

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    :goto_5
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    goto/16 :goto_1

    :cond_f
    if-nez v10, :cond_10

    invoke-interface {v0}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    :cond_10
    return-void
.end method

.method public decrementRefCount()V
    .locals 1

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->checkRefCountIsZero()V

    iget v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->refCount:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->refCount:I

    return-void
.end method

.method public getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Boolean;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getBooleanProperty(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public getBytes(Ljava/lang/String;)[B
    .locals 1

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, [B

    if-eqz v0, :cond_0

    check-cast p1, [B

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getContext()Lcom/amplitude/quickjs/wrapper/QuickJSContext;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->context:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    return-object v0
.end method

.method public getDouble(Ljava/lang/String;)Ljava/lang/Double;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Double;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getDoubleProperty(Ljava/lang/String;)Ljava/lang/Double;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getDouble(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public getIntProperty(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public getInteger(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Integer;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getJSArray(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSArray;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/amplitude/quickjs/wrapper/JSArray;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/amplitude/quickjs/wrapper/JSArray;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getJSArrayProperty(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSArray;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getJSArray(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSArray;

    move-result-object p1

    return-object p1
.end method

.method public getJSFunction(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSFunction;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/amplitude/quickjs/wrapper/JSFunction;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/amplitude/quickjs/wrapper/JSFunction;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getJSFunctionProperty(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSFunction;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getJSFunction(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSFunction;

    move-result-object p1

    return-object p1
.end method

.method public getJSObject(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSObject;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/amplitude/quickjs/wrapper/JSObject;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/amplitude/quickjs/wrapper/JSObject;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getJSObjectProperty(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSObject;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getJSObject(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object p1

    return-object p1
.end method

.method public getLong(Ljava/lang/String;)Ljava/lang/Long;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Long;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getNames()Lcom/amplitude/quickjs/wrapper/JSArray;
    .locals 1

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->checkRefCountIsZero()V

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->context:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-virtual {v0, p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getOwnPropertyNames(Lcom/amplitude/quickjs/wrapper/JSObject;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amplitude/quickjs/wrapper/JSArray;

    return-object v0
.end method

.method public getOwnPropertyNames()Lcom/amplitude/quickjs/wrapper/JSArray;
    .locals 1

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getNames()Lcom/amplitude/quickjs/wrapper/JSArray;

    move-result-object v0

    return-object v0
.end method

.method public getPointer()J
    .locals 2

    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->pointer:J

    return-wide v0
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->checkRefCountIsZero()V

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->context:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-virtual {v0, p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getProperty(Lcom/amplitude/quickjs/wrapper/JSObject;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getRefCount()I
    .locals 1

    iget v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->refCount:I

    return v0
.end method

.method public getStackTrace()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->stackTrace:Ljava/lang/Throwable;

    return-object v0
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getStringProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->pointer:J

    const/4 v2, 0x1

    new-array v2, v2, [J

    const/4 v3, 0x0

    aput-wide v0, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([J)I

    move-result v0

    return v0
.end method

.method public hold()V
    .locals 1

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->checkRefCountIsZero()V

    iget v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->refCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->refCount:I

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->context:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-virtual {v0, p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->hold(Lcom/amplitude/quickjs/wrapper/JSObject;)V

    return-void
.end method

.method public isAlive()Z
    .locals 1

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->isRefCountZero()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isRefCountZero()Z
    .locals 1

    iget v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->refCount:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public release()V
    .locals 1

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->isRefCountZero()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->refCount:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->refCount:I

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->context:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-virtual {v0, p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->freeValue(Lcom/amplitude/quickjs/wrapper/JSObject;)V

    return-void
.end method

.method public setProperty(Ljava/lang/String;D)V
    .locals 0

    .line 6
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->setPropertyObject(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setProperty(Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->setPropertyObject(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setProperty(Ljava/lang/String;J)V
    .locals 0

    .line 3
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->setPropertyObject(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setProperty(Ljava/lang/String;Lcom/amplitude/quickjs/wrapper/JSCallFunction;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->setPropertyObject(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setProperty(Ljava/lang/String;Lcom/amplitude/quickjs/wrapper/JSObject;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->setPropertyObject(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 9
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    .line 12
    iget-object v1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->context:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-virtual {v1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->createNewJSObject()Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object v1

    .line 13
    invoke-virtual {p2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object p2

    .line 14
    array-length v2, p2

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_1

    aget-object v4, p2, v3

    .line 15
    const-class v5, Lcom/amplitude/quickjs/wrapper/JSMethod;

    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 16
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/amplitude/quickjs/wrapper/b;

    invoke-direct {v6, v4, v0}, Lcom/amplitude/quickjs/wrapper/b;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    invoke-interface {v1, v5, v6}, Lcom/amplitude/quickjs/wrapper/JSObject;->setProperty(Ljava/lang/String;Lcom/amplitude/quickjs/wrapper/JSCallFunction;)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 17
    :cond_1
    invoke-virtual {p0, p1, v1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->setProperty(Ljava/lang/String;Lcom/amplitude/quickjs/wrapper/JSObject;)V

    .line 18
    invoke-interface {v1}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    return-void

    .line 19
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "The JavaObj cannot be null. An error occurred in newInstance!"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->setPropertyObject(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setProperty(Ljava/lang/String;Z)V
    .locals 0

    .line 5
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->setPropertyObject(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setProperty(Ljava/lang/String;[B)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->setPropertyObject(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setStackTrace(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->stackTrace:Ljava/lang/Throwable;

    return-void
.end method

.method public stringify()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->checkRefCountIsZero()V

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->context:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-virtual {v0, p0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->stringify(Lcom/amplitude/quickjs/wrapper/JSObject;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toArray()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->toArray(Lcom/amplitude/quickjs/wrapper/MapFilter;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public toArray(Lcom/amplitude/quickjs/wrapper/MapFilter;)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/amplitude/quickjs/wrapper/MapFilter;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->toArray(Lcom/amplitude/quickjs/wrapper/MapFilter;Ljava/lang/Object;Lcom/amplitude/quickjs/wrapper/MapCreator;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public toArray(Lcom/amplitude/quickjs/wrapper/MapFilter;Ljava/lang/Object;Lcom/amplitude/quickjs/wrapper/MapCreator;)Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/amplitude/quickjs/wrapper/MapFilter;",
            "Ljava/lang/Object;",
            "Lcom/amplitude/quickjs/wrapper/MapCreator;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Object types are not yet supported for conversion to array. You should use toMap."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toMap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->toMap(Lcom/amplitude/quickjs/wrapper/MapFilter;)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public toMap(Lcom/amplitude/quickjs/wrapper/MapFilter;)Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/amplitude/quickjs/wrapper/MapFilter;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Lc9/g;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lc9/g;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->toMap(Lcom/amplitude/quickjs/wrapper/MapFilter;Ljava/lang/Object;Lcom/amplitude/quickjs/wrapper/MapCreator;)Ljava/util/Map;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    return-object p1
.end method

.method public toMap(Lcom/amplitude/quickjs/wrapper/MapFilter;Ljava/lang/Object;Lcom/amplitude/quickjs/wrapper/MapCreator;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/amplitude/quickjs/wrapper/MapFilter;",
            "Ljava/lang/Object;",
            "Lcom/amplitude/quickjs/wrapper/MapCreator;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 3
    invoke-interface {p3}, Lcom/amplitude/quickjs/wrapper/MapCreator;->get()Ljava/util/Map;

    move-result-object v2

    .line 4
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    move-object v1, p0

    move-object v0, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    .line 5
    invoke-virtual/range {v0 .. v6}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->convertToMap(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap;Lcom/amplitude/quickjs/wrapper/MapFilter;Ljava/lang/Object;Lcom/amplitude/quickjs/wrapper/MapCreator;)V

    .line 6
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->checkRefCountIsZero()V

    const-string v0, "toString"

    invoke-virtual {p0, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getJSFunction(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSFunction;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/amplitude/quickjs/wrapper/JSFunction;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    return-object v1
.end method
