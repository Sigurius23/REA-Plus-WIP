.class public final Li4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final w:Li4/g;

.field public x:I


# direct methods
.method public constructor <init>(Li4/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Li4/f;->x:I

    iput-object p1, p0, Li4/f;->w:Li4/g;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Li4/f;->x:I

    iget-object v1, p0, Li4/f;->w:Li4/g;

    iget-object v1, v1, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li4/f;->w:Li4/g;

    iget-object v0, v0, Li4/b;->E:Ljava/util/ArrayList;

    iget v1, p0, Li4/f;->x:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li4/d;

    iget v1, p0, Li4/f;->x:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Li4/f;->x:I

    return-object v0
.end method
