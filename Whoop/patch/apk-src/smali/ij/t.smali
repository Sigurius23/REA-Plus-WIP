.class public final Lij/t;
.super Lzt/q;
.source "SourceFile"


# instance fields
.field public final G:Ljava/util/LinkedHashMap;

.field public final H:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Lij/m;)V
    .locals 3

    invoke-direct {p0, p1}, Lzt/q;-><init>(Lij/m;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lij/t;->G:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lij/t;->H:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Lij/m;->b()Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getGlobalObject()Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lij/r;

    invoke-direct {v1, p1, p0}, Lij/r;-><init>(Lij/m;Lij/t;)V

    const-string v2, "setTimeout"

    invoke-interface {v0, v2, v1}, Lcom/amplitude/quickjs/wrapper/JSObject;->setProperty(Ljava/lang/String;Lcom/amplitude/quickjs/wrapper/JSCallFunction;)V

    :cond_0
    invoke-virtual {p1}, Lij/m;->b()Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getGlobalObject()Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Lij/r;

    invoke-direct {v1, p0, p1}, Lij/r;-><init>(Lij/t;Lij/m;)V

    const-string p1, "clearTimeout"

    invoke-interface {v0, p1, v1}, Lcom/amplitude/quickjs/wrapper/JSObject;->setProperty(Ljava/lang/String;Lcom/amplitude/quickjs/wrapper/JSCallFunction;)V

    :cond_1
    return-void
.end method
