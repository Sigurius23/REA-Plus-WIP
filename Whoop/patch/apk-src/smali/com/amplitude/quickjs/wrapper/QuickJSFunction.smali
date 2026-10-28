.class public Lcom/amplitude/quickjs/wrapper/QuickJSFunction;
.super Lcom/amplitude/quickjs/wrapper/QuickJSObject;
.source "SourceFile"

# interfaces
.implements Lcom/amplitude/quickjs/wrapper/JSFunction;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;
    }
.end annotation


# instance fields
.field private currentStatus:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

.field private stashTimes:I

.field private final thisPointer:J

.field private final thisPointerTag:I


# direct methods
.method public constructor <init>(Lcom/amplitude/quickjs/wrapper/QuickJSContext;JJI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;-><init>(Lcom/amplitude/quickjs/wrapper/QuickJSContext;J)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->stashTimes:I

    sget-object p1, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->NOT_CALLED:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    iput-object p1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->currentStatus:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    iput-wide p4, p0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->thisPointer:J

    iput p6, p0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->thisPointerTag:I

    return-void
.end method


# virtual methods
.method public varargs call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->checkRefCountIsZero()V

    sget-object v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->CALLING:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    iput-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->currentStatus:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getContext()Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    move-result-object v2

    iget-wide v4, p0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->thisPointer:J

    iget v6, p0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->thisPointerTag:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v3, p0

    move-object v7, p1

    :try_start_1
    invoke-virtual/range {v2 .. v7}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->call(Lcom/amplitude/quickjs/wrapper/JSObject;JI[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->CALLED:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    iput-object v0, v3, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->currentStatus:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    iget v0, v3, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->stashTimes:I

    if-lez v0, :cond_1

    move v0, v1

    :goto_0
    iget v2, v3, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->stashTimes:I

    if-ge v0, v2, :cond_0

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->release()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iput v1, v3, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->stashTimes:I

    :cond_1
    return-object p1

    :catchall_0
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v3, p0

    goto :goto_1

    :goto_2
    sget-object v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->CALLED:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    iput-object v0, v3, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->currentStatus:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    iget v0, v3, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->stashTimes:I

    if-lez v0, :cond_3

    move v0, v1

    :goto_3
    iget v2, v3, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->stashTimes:I

    if-ge v0, v2, :cond_2

    invoke-virtual {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->release()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_2
    iput v1, v3, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->stashTimes:I

    :cond_3
    throw p1
.end method

.method public varargs callVoid([Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/amplitude/quickjs/wrapper/JSObject;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/amplitude/quickjs/wrapper/JSObject;

    invoke-interface {p1}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    :cond_0
    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->currentStatus:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    sget-object v1, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->CALLING:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->stashTimes:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction;->stashTimes:I

    return-void

    :cond_0
    invoke-super {p0}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->release()V

    return-void
.end method

.method public toArray()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "JSFunction types do not support conversion to map or array."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toMap()Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "JSFunction types do not support conversion to map or array."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
