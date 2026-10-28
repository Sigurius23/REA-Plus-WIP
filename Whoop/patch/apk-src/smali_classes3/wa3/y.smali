.class public final Lwa3/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final w:Laf3/u;

.field public x:Landroidx/datastore/preferences/protobuf/e;

.field public y:I


# direct methods
.method public constructor <init>(Lwa3/z;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Laf3/u;

    invoke-direct {v0, p1}, Laf3/u;-><init>(Lwa3/e;)V

    iput-object v0, p0, Lwa3/y;->w:Laf3/u;

    invoke-virtual {v0}, Laf3/u;->a()Lwa3/u;

    move-result-object v0

    new-instance v1, Landroidx/datastore/preferences/protobuf/e;

    invoke-direct {v1, v0}, Landroidx/datastore/preferences/protobuf/e;-><init>(Lwa3/u;)V

    iput-object v1, p0, Lwa3/y;->x:Landroidx/datastore/preferences/protobuf/e;

    iget p1, p1, Lwa3/z;->x:I

    iput p1, p0, Lwa3/y;->y:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget v0, p0, Lwa3/y;->y:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lwa3/y;->x:Landroidx/datastore/preferences/protobuf/e;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/e;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lwa3/y;->w:Laf3/u;

    invoke-virtual {v0}, Laf3/u;->a()Lwa3/u;

    move-result-object v0

    new-instance v1, Landroidx/datastore/preferences/protobuf/e;

    invoke-direct {v1, v0}, Landroidx/datastore/preferences/protobuf/e;-><init>(Lwa3/u;)V

    iput-object v1, p0, Lwa3/y;->x:Landroidx/datastore/preferences/protobuf/e;

    :cond_0
    iget v0, p0, Lwa3/y;->y:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lwa3/y;->y:I

    iget-object v0, p0, Lwa3/y;->x:Landroidx/datastore/preferences/protobuf/e;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/e;->a()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
