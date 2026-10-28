.class public final Llg3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg3/f;


# instance fields
.field public final w:Lng3/m;

.field public final x:Llg3/c;

.field public volatile y:Llg3/i;


# direct methods
.method public constructor <init>(Lng3/m;Llg3/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llg3/m;->w:Lng3/m;

    iput-object p2, p0, Llg3/m;->x:Llg3/c;

    return-void
.end method


# virtual methods
.method public final a(Llg3/q;Ljava/lang/CharSequence;I)I
    .locals 11

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ltz p3, :cond_7

    if-gt p3, v0, :cond_7

    iget-boolean v0, p1, Llg3/q;->c:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Llg3/w;->w:Llg3/w;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Llg3/m;->x:Llg3/c;

    iget-object v2, v2, Llg3/c;->a:Ld1/j;

    iget-object v2, v2, Ld1/j;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_4

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    move-object v3, p1

    move-object v6, p2

    move v7, p3

    invoke-virtual/range {v3 .. v8}, Llg3/q;->l(Ljava/lang/CharSequence;ILjava/lang/CharSequence;II)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object v6, p0, Llg3/m;->w:Lng3/m;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result p3

    add-int v10, p3, v7

    move-object v5, v3

    move v9, v7

    move-wide v7, p1

    invoke-virtual/range {v5 .. v10}, Llg3/q;->k(Lng3/m;JII)I

    move-result p1

    return p1

    :cond_2
    move-object p1, v3

    move-object p2, v6

    move p3, v7

    goto :goto_1

    :cond_3
    move-object v3, p1

    move-object v6, p2

    move v7, p3

    iget-boolean p1, v3, Llg3/q;->c:Z

    if-eqz p1, :cond_5

    not-int p1, v7

    return p1

    :cond_4
    move-object v3, p1

    move-object v6, p2

    move v7, p3

    :cond_5
    iget-object p1, p0, Llg3/m;->y:Llg3/i;

    if-nez p1, :cond_6

    new-instance p1, Llg3/i;

    iget-object p2, p0, Llg3/m;->w:Lng3/m;

    const/16 p3, 0x13

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0, p3, v0}, Llg3/i;-><init>(Lng3/m;III)V

    iput-object p1, p0, Llg3/m;->y:Llg3/i;

    :cond_6
    iget-object p1, p0, Llg3/m;->y:Llg3/i;

    invoke-virtual {p1, v3, v6, v7}, Llg3/i;->a(Llg3/q;Ljava/lang/CharSequence;I)I

    move-result p1

    return p1

    :cond_7
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final b(Lab/h0;Ljava/lang/StringBuilder;)Z
    .locals 4

    iget-object v0, p0, Llg3/m;->w:Lng3/m;

    invoke-virtual {p1, v0}, Lab/h0;->r(Lng3/m;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Llg3/m;->x:Llg3/c;

    sget-object v2, Llg3/w;->w:Llg3/w;

    iget-object v1, v1, Llg3/c;->a:Ld1/j;

    iget-object v1, v1, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Llg3/m;->y:Llg3/i;

    if-nez v0, :cond_2

    new-instance v0, Llg3/i;

    iget-object v2, p0, Llg3/m;->w:Lng3/m;

    const/16 v3, 0x13

    invoke-direct {v0, v2, v1, v3, v1}, Llg3/i;-><init>(Lng3/m;III)V

    iput-object v0, p0, Llg3/m;->y:Llg3/i;

    :cond_2
    iget-object v0, p0, Llg3/m;->y:Llg3/i;

    invoke-virtual {v0, p1, p2}, Llg3/i;->b(Lab/h0;Ljava/lang/StringBuilder;)Z

    move-result p1

    return p1

    :cond_3
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Text("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llg3/m;->w:Lng3/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
