.class public final Lv6/l;
.super Ln6/k;
.source "SourceFile"


# instance fields
.field public c:Ln6/o;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Ln6/k;-><init>(II)V

    sget-object v0, Ln6/m;->a:Ln6/m;

    iput-object v0, p0, Lv6/l;->c:Ln6/o;

    iput v1, p0, Lv6/l;->d:I

    iput v1, p0, Lv6/l;->e:I

    return-void
.end method


# virtual methods
.method public final a()Ln6/i;
    .locals 4

    new-instance v0, Lv6/l;

    invoke-direct {v0}, Lv6/l;-><init>()V

    iget-object v1, p0, Lv6/l;->c:Ln6/o;

    iput-object v1, v0, Lv6/l;->c:Ln6/o;

    iget v1, p0, Lv6/l;->d:I

    iput v1, v0, Lv6/l;->d:I

    iget v1, p0, Lv6/l;->e:I

    iput v1, v0, Lv6/l;->e:I

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
    .locals 0

    iput-object p1, p0, Lv6/l;->c:Ln6/o;

    return-void
.end method

.method public final c()Ln6/o;
    .locals 1

    iget-object v0, p0, Lv6/l;->c:Ln6/o;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EmittableRow(modifier="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lv6/l;->c:Ln6/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lv6/l;->d:I

    invoke-static {v1}, Lv6/a;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", verticalAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lv6/l;->e:I

    invoke-static {v1}, Lv6/b;->b(I)Ljava/lang/String;

    move-result-object v1

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
