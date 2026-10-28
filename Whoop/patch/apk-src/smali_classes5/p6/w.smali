.class public final Lp6/w;
.super Ln6/k;
.source "SourceFile"


# instance fields
.field public c:J

.field public d:Lp6/u1;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Ln6/k;-><init>(II)V

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v0, p0, Lp6/w;->c:J

    sget-object v0, Lp6/t1;->a:Lp6/t1;

    iput-object v0, p0, Lp6/w;->d:Lp6/u1;

    return-void
.end method


# virtual methods
.method public final a()Ln6/i;
    .locals 4

    new-instance v0, Lp6/w;

    invoke-direct {v0}, Lp6/w;-><init>()V

    iget-wide v1, p0, Lp6/w;->c:J

    iput-wide v1, v0, Lp6/w;->c:J

    iget-object v1, p0, Lp6/w;->d:Lp6/u1;

    iput-object v1, v0, Lp6/w;->d:Lp6/u1;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    iget-object v3, p0, Ln6/k;->b:Ljava/util/ArrayList;

    invoke-static {v3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln6/i;

    invoke-interface {v3}, Ln6/i;->a()Ln6/i;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v2, v0, Ln6/k;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final b(Ln6/o;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalAccessError;

    const-string v0, "You cannot set the modifier of an EmittableSizeBox"

    invoke-direct {p1, v0}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Ln6/o;
    .locals 1

    iget-object v0, p0, Ln6/k;->b:Ljava/util/ArrayList;

    invoke-static {v0}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/i;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ln6/i;->c()Ln6/o;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    sget-object v0, Ln6/m;->a:Ln6/m;

    invoke-static {v0}, Ls2/d;->k(Ln6/o;)Ln6/o;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EmittableSizeBox(size="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lp6/w;->c:J

    invoke-static {v1, v2}, Ly3/h;->d(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sizeMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp6/w;->d:Lp6/u1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", children=[\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ln6/k;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n])"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
