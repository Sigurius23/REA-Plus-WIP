.class public final Lx1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/z1;


# instance fields
.field public final w:Ljava/util/Set;

.field public final x:Lr1/c;


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/e;->w:Ljava/util/Set;

    new-instance p1, Lr1/c;

    const/16 v0, 0x10

    new-array v0, v0, [Lp1/a2;

    invoke-direct {p1, v0}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lx1/e;->x:Lr1/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lx1/e;->x:Lr1/c;

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, v1, v2

    check-cast v3, Lp1/a2;

    iget-object v3, v3, Lp1/a2;->a:Lp1/z1;

    iget-object v4, p0, Lx1/e;->w:Ljava/util/Set;

    invoke-interface {v4, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-interface {v3}, Lp1/z1;->a()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b()Lr1/c;
    .locals 1

    iget-object v0, p0, Lx1/e;->x:Lr1/c;

    return-object v0
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final d()V
    .locals 0

    return-void
.end method
