.class public final Lm83/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ld93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/Enumeration;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm83/t;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lm83/t;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu1/e;)V
    .locals 4

    const/4 v0, 0x1

    iput v0, p0, Lm83/t;->w:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    .line 6
    new-array v1, v0, [Lu1/p;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    new-instance v3, Lu1/s;

    invoke-direct {v3, p0}, Lu1/s;-><init>(Lm83/t;)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Lu1/f;

    invoke-direct {v0, p1, v1}, Lu1/f;-><init>(Lu1/e;[Lu1/p;)V

    iput-object v0, p0, Lm83/t;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lm83/t;->w:I

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {p1}, Lkotlin/jvm/internal/m0;->h([Ljava/lang/Object;)La0/i1;

    move-result-object p1

    iput-object p1, p0, Lm83/t;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget v0, p0, Lm83/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm83/t;->x:Ljava/lang/Object;

    check-cast v0, La0/i1;

    invoke-virtual {v0}, La0/i1;->hasNext()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lm83/t;->x:Ljava/lang/Object;

    check-cast v0, Lu1/f;

    iget-boolean v0, v0, Lu1/d;->y:Z

    return v0

    :pswitch_1
    iget-object v0, p0, Lm83/t;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Enumeration;

    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lm83/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm83/t;->x:Ljava/lang/Object;

    check-cast v0, La0/i1;

    invoke-virtual {v0}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lm83/t;->x:Ljava/lang/Object;

    check-cast v0, Lu1/f;

    invoke-virtual {v0}, Lu1/f;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lm83/t;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Enumeration;

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, Lm83/t;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lm83/t;->x:Ljava/lang/Object;

    check-cast v0, Lu1/f;

    invoke-virtual {v0}, Lu1/f;->remove()V

    return-void

    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
