.class public final Ln83/i;
.super Lm83/j;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final x:Ln83/i;


# instance fields
.field public final w:Ln83/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln83/i;

    sget-object v1, Ln83/f;->N:Ln83/f;

    sget-object v1, Ln83/f;->N:Ln83/f;

    invoke-direct {v0, v1}, Ln83/i;-><init>(Ln83/f;)V

    sput-object v0, Ln83/i;->x:Ln83/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 3
    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    invoke-direct {p0, v0}, Ln83/i;-><init>(Ln83/f;)V

    return-void
.end method

.method public constructor <init>(Ln83/f;)V
    .locals 1

    const-string v0, "backing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 2
    iput-object p1, p0, Ln83/i;->w:Ln83/f;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Ln83/i;->w:Ln83/f;

    iget v0, v0, Ln83/f;->I:I

    return v0
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ln83/i;->w:Ln83/f;

    invoke-virtual {v0, p1}, Ln83/f;->a(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln83/i;->w:Ln83/f;

    invoke-virtual {v0}, Ln83/f;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Ln83/i;->w:Ln83/f;

    invoke-virtual {v0}, Ln83/f;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ln83/i;->w:Ln83/f;

    invoke-virtual {v0, p1}, Ln83/f;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Ln83/i;->w:Ln83/f;

    invoke-virtual {v0}, Ln83/f;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget-object v0, p0, Ln83/i;->w:Ln83/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ln83/d;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Ln83/d;-><init>(Ln83/f;I)V

    return-object v1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ln83/i;->w:Ln83/f;

    invoke-virtual {v0}, Ln83/f;->c()V

    invoke-virtual {v0, p1}, Ln83/f;->i(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Ln83/f;->m(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln83/i;->w:Ln83/f;

    invoke-virtual {v0}, Ln83/f;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln83/i;->w:Ln83/f;

    invoke-virtual {v0}, Ln83/f;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method
