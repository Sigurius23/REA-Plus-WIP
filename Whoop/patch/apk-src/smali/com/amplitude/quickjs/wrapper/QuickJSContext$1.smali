.class Lcom/amplitude/quickjs/wrapper/QuickJSContext$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amplitude/quickjs/wrapper/JSObjectCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amplitude/quickjs/wrapper/QuickJSContext;->create()Lcom/amplitude/quickjs/wrapper/QuickJSContext;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public newArray(Lcom/amplitude/quickjs/wrapper/QuickJSContext;J)Lcom/amplitude/quickjs/wrapper/JSArray;
    .locals 1

    new-instance v0, Lcom/amplitude/quickjs/wrapper/QuickJSArray;

    invoke-direct {v0, p1, p2, p3}, Lcom/amplitude/quickjs/wrapper/QuickJSArray;-><init>(Lcom/amplitude/quickjs/wrapper/QuickJSContext;J)V

    return-object v0
.end method

.method public newFunction(Lcom/amplitude/quickjs/wrapper/QuickJSContext;JJI)Lcom/amplitude/quickjs/wrapper/JSFunction;
    .locals 7

    new-instance v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;-><init>(Lcom/amplitude/quickjs/wrapper/QuickJSContext;JJI)V

    return-object v0
.end method

.method public newObject(Lcom/amplitude/quickjs/wrapper/QuickJSContext;J)Lcom/amplitude/quickjs/wrapper/JSObject;
    .locals 1

    new-instance v0, Lcom/amplitude/quickjs/wrapper/QuickJSObject;

    invoke-direct {v0, p1, p2, p3}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;-><init>(Lcom/amplitude/quickjs/wrapper/QuickJSContext;J)V

    return-object v0
.end method
