.class public final Ll3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Appendable;


# instance fields
.field public final w:Ljava/lang/StringBuilder;

.field public final x:Ljava/util/ArrayList;

.field public final y:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/16 v0, 0x10

    .line 1
    invoke-direct {p0, v0}, Ll3/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll3/d;->x:Ljava/util/ArrayList;

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll3/d;->y:Ljava/util/ArrayList;

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll3/g;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ll3/d;-><init>()V

    .line 8
    invoke-virtual {p0, p1}, Ll3/d;->c(Ll3/g;)V

    return-void
.end method


# virtual methods
.method public final a(Ll3/m0;II)V
    .locals 6

    new-instance v0, Ll3/c;

    const/4 v1, 0x0

    const/16 v4, 0x8

    move-object v5, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Ll3/c;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    iget-object p1, p0, Ll3/d;->y:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final append(C)Ljava/lang/Appendable;
    .locals 1

    .line 7
    iget-object v0, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 1

    .line 1
    instance-of v0, p1, Ll3/g;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Ll3/g;

    invoke-virtual {p0, p1}, Ll3/d;->c(Ll3/g;)V

    return-object p0

    .line 3
    :cond_0
    iget-object v0, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 1

    .line 4
    instance-of v0, p1, Ll3/g;

    if-eqz v0, :cond_0

    .line 5
    check-cast p1, Ll3/g;

    invoke-virtual {p0, p1, p2, p3}, Ll3/d;->d(Ll3/g;II)V

    return-object p0

    .line 6
    :cond_0
    iget-object v0, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final c(Ll3/g;)V
    .locals 8

    iget-object v0, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    iget-object v2, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll3/g;->w:Ljava/util/List;

    if-eqz p1, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll3/e;

    new-instance v4, Ll3/c;

    iget-object v5, v3, Ll3/e;->a:Ljava/lang/Object;

    iget v6, v3, Ll3/e;->b:I

    add-int/2addr v6, v1

    iget v7, v3, Ll3/e;->c:I

    add-int/2addr v7, v1

    iget-object v3, v3, Ll3/e;->d:Ljava/lang/String;

    invoke-direct {v4, v6, v7, v5, v3}, Ll3/c;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Ll3/d;->y:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Ll3/g;II)V
    .locals 6

    iget-object v0, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    iget-object v2, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0, v2, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-static {p1, p2, p3, v0}, Ll3/h;->a(Ll3/g;IILkg2/e;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_0

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/e;

    new-instance v2, Ll3/c;

    iget-object v3, v0, Ll3/e;->a:Ljava/lang/Object;

    iget v4, v0, Ll3/e;->b:I

    add-int/2addr v4, v1

    iget v5, v0, Ll3/e;->c:I

    add-int/2addr v5, v1

    iget-object v0, v0, Ll3/e;->d:Ljava/lang/String;

    invoke-direct {v2, v4, v5, v3, v0}, Ll3/c;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll3/d;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Ll3/d;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Nothing to pop."

    invoke-static {v1}, Lr3/a;->c(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/c;

    iget-object v1, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    iput v1, v0, Ll3/c;->c:I

    return-void
.end method

.method public final f(I)V
    .locals 3

    iget-object v0, p0, Ll3/d;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " should be less than "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lr3/a;->c(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-lt v1, p1, :cond_1

    invoke-virtual {p0}, Ll3/d;->e()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final g(Ll3/t;)I
    .locals 6

    new-instance v0, Ll3/c;

    iget-object v1, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/4 v1, 0x0

    const/16 v4, 0xc

    const/4 v3, 0x0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ll3/c;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    iget-object p1, p0, Ll3/d;->x:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Ll3/d;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    new-instance v0, Ll3/c;

    new-instance v5, Ll3/o0;

    invoke-direct {v5, p2}, Ll3/o0;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Ll3/c;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    iget-object p1, p0, Ll3/d;->x:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Ll3/d;->y:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    return-void
.end method

.method public final i(Ll3/b0;)I
    .locals 6

    new-instance v0, Ll3/c;

    iget-object v1, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/4 v1, 0x0

    const/16 v4, 0xc

    const/4 v3, 0x0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ll3/c;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    iget-object p1, p0, Ll3/d;->x:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Ll3/d;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public final j(Ll3/m0;)I
    .locals 6

    new-instance v0, Ll3/c;

    iget-object v1, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/4 v1, 0x0

    const/16 v4, 0xc

    const/4 v3, 0x0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ll3/c;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    iget-object p1, p0, Ll3/d;->x:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Ll3/d;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public final k()Ll3/g;
    .locals 8

    iget-object v0, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll3/d;->y:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll3/c;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    invoke-virtual {v6, v7}, Ll3/c;->a(I)Ll3/e;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ll3/g;

    invoke-direct {v0, v1, v2}, Ll3/g;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method
