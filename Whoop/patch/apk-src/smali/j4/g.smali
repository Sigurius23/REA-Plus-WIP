.class public Lj4/g;
.super Lj4/b;
.source "SourceFile"

# interfaces
.implements Lk4/d;


# instance fields
.field public final k0:Le4/s;

.field public final l0:I

.field public final m0:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Le4/s;I)V
    .locals 1

    invoke-direct {p0, p1}, Lj4/b;-><init>(Le4/s;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lj4/g;->m0:Ljava/util/ArrayList;

    iput-object p1, p0, Lj4/g;->k0:Le4/s;

    iput p2, p0, Lj4/g;->l0:I

    return-void
.end method


# virtual methods
.method public final a()Lm4/e;
    .locals 1

    invoke-virtual {p0}, Lj4/g;->s()Lm4/j;

    move-result-object v0

    return-object v0
.end method

.method public apply()V
    .locals 0

    return-void
.end method

.method public final varargs q([Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj4/g;->m0:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

.method public final r()V
    .locals 0

    invoke-super {p0}, Lj4/b;->apply()V

    return-void
.end method

.method public s()Lm4/j;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
