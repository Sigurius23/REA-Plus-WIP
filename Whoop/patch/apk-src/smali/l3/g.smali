.class public final Ll3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/CharSequence;


# static fields
.field public static final synthetic E:I


# instance fields
.field public final w:Ljava/util/List;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/util/ArrayList;

.field public final z:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ll3/l0;->a:Lp0/n0;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    .line 32
    sget-object p3, Lm83/y;->w:Lm83/y;

    .line 33
    :cond_0
    sget-object p1, Ll3/h;->a:Ll3/g;

    .line 34
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p3, 0x0

    .line 35
    :cond_1
    invoke-direct {p0, p3, p2}, Ll3/g;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 36
    sget-object v0, Lm83/y;->w:Lm83/y;

    .line 37
    invoke-direct {p0, p1, v0}, Ll3/g;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    .line 38
    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    check-cast p2, Ljava/util/List;

    invoke-direct {p0, p2, p1}, Ll3/g;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/g;->w:Ljava/util/List;

    iput-object p2, p0, Ll3/g;->x:Ljava/lang/String;

    const/4 p2, 0x0

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 2
    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    move v2, p2

    move-object v3, v0

    move-object v4, v3

    :goto_0
    if-ge v2, v1, :cond_5

    .line 3
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 4
    check-cast v5, Ll3/e;

    .line 5
    iget-object v6, v5, Ll3/e;->a:Ljava/lang/Object;

    .line 6
    instance-of v7, v6, Ll3/m0;

    if-eqz v7, :cond_1

    if-nez v3, :cond_0

    .line 7
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 8
    :cond_0
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 9
    :cond_1
    instance-of v6, v6, Ll3/b0;

    if-eqz v6, :cond_3

    if-nez v4, :cond_2

    .line 10
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 11
    :cond_2
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    move-object v3, v0

    move-object v4, v3

    .line 12
    :cond_5
    iput-object v3, p0, Ll3/g;->y:Ljava/util/ArrayList;

    .line 13
    iput-object v4, p0, Ll3/g;->z:Ljava/util/ArrayList;

    if-eqz v4, :cond_6

    .line 14
    new-instance p1, Ll3/f;

    invoke-direct {p1, p2}, Ll3/f;-><init>(I)V

    invoke-static {v4, p1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 15
    :cond_6
    move-object p1, v0

    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_b

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_5

    .line 16
    :cond_7
    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll3/e;

    .line 17
    iget p1, p1, Ll3/e;->c:I

    .line 18
    sget-object p2, La0/r;->a:La0/f0;

    .line 19
    new-instance p2, La0/f0;

    const/4 v1, 0x1

    invoke-direct {p2, v1}, La0/f0;-><init>(I)V

    .line 20
    invoke-virtual {p2, p1}, La0/f0;->a(I)V

    .line 21
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    move v2, v1

    :goto_2
    if-ge v2, p1, :cond_b

    .line 22
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll3/e;

    .line 23
    :goto_3
    iget v4, p2, La0/f0;->b:I

    if-eqz v4, :cond_a

    .line 24
    invoke-virtual {p2}, La0/f0;->d()I

    move-result v4

    .line 25
    iget v5, v3, Ll3/e;->b:I

    iget v6, v3, Ll3/e;->c:I

    if-lt v5, v4, :cond_8

    .line 26
    iget v4, p2, La0/f0;->b:I

    sub-int/2addr v4, v1

    .line 27
    invoke-virtual {p2, v4}, La0/f0;->f(I)V

    goto :goto_3

    :cond_8
    if-gt v6, v4, :cond_9

    goto :goto_4

    .line 28
    :cond_9
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "Paragraph overlap not allowed, end "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " should be less than or equal to "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 29
    invoke-static {v4}, Lr3/a;->a(Ljava/lang/String;)V

    .line 30
    :cond_a
    :goto_4
    iget v3, v3, Ll3/e;->c:I

    .line 31
    invoke-virtual {p2, v3}, La0/f0;->a(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_b
    :goto_5
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/util/List;
    .locals 8

    iget-object v0, p0, Ll3/g;->w:Ljava/util/List;

    if-eqz v0, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ll3/e;

    iget-object v7, v6, Ll3/e;->a:Ljava/lang/Object;

    instance-of v7, v7, Ll3/v;

    if-eqz v7, :cond_0

    iget v7, v6, Ll3/e;->b:I

    iget v6, v6, Ll3/e;->c:I

    invoke-static {v3, p1, v7, v6}, Ll3/h;->b(IIII)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final b(II)Ljava/util/List;
    .locals 7

    iget-object v0, p0, Ll3/g;->w:Ljava/util/List;

    if-eqz v0, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/e;

    iget-object v5, v4, Ll3/e;->a:Ljava/lang/Object;

    instance-of v5, v5, Ll3/o0;

    if-eqz v5, :cond_0

    iget v5, v4, Ll3/e;->b:I

    iget v6, v4, Ll3/e;->c:I

    invoke-static {p1, p2, v5, v6}, Ll3/h;->b(IIII)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v4}, Ll3/s;->h(Ll3/e;)Ll3/e;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final c(IILjava/lang/String;)Ljava/util/List;
    .locals 7

    iget-object v0, p0, Ll3/g;->w:Ljava/util/List;

    if-eqz v0, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/e;

    iget-object v5, v4, Ll3/e;->a:Ljava/lang/Object;

    instance-of v5, v5, Ll3/o0;

    if-eqz v5, :cond_0

    iget-object v5, v4, Ll3/e;->d:Ljava/lang/String;

    invoke-virtual {p3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget v5, v4, Ll3/e;->b:I

    iget v6, v4, Ll3/e;->c:I

    invoke-static {p1, p2, v5, v6}, Ll3/h;->b(IIII)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v4}, Ll3/s;->h(Ll3/e;)Ll3/e;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final charAt(I)C
    .locals 1

    iget-object v0, p0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1
.end method

.method public final d(Lkotlin/jvm/functions/Function1;)Ll3/g;
    .locals 9

    new-instance v0, Ll3/d;

    invoke-direct {v0, p0}, Ll3/d;-><init>(Ll3/g;)V

    iget-object v1, v0, Ll3/d;->y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/c;

    const/high16 v5, -0x80000000

    invoke-virtual {v4, v5}, Ll3/c;->a(I)Ll3/e;

    move-result-object v4

    invoke-interface {p1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/e;

    new-instance v5, Ll3/c;

    iget-object v6, v4, Ll3/e;->a:Ljava/lang/Object;

    iget v7, v4, Ll3/e;->b:I

    iget v8, v4, Ll3/e;->c:I

    iget-object v4, v4, Ll3/e;->d:Ljava/lang/String;

    invoke-direct {v5, v7, v8, v6, v4}, Ll3/c;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ll3/d;->k()Ll3/g;

    move-result-object p1

    return-object p1
.end method

.method public final e(II)Ll3/g;
    .locals 10

    const/16 v0, 0x29

    const-string v1, "start ("

    if-gt p1, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ") should be less or equal to end ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_0
    iget-object v2, p0, Ll3/g;->x:Ljava/lang/String;

    if-nez p1, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ne p2, v3, :cond_1

    return-object p0

    :cond_1
    invoke-virtual {v2, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Ll3/h;->a:Ll3/g;

    if-gt p1, p2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") should be less than or equal to end ("

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Ll3/g;->w:Ljava/util/List;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_5

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll3/e;

    iget v6, v5, Ll3/e;->b:I

    iget v7, v5, Ll3/e;->c:I

    invoke-static {p1, p2, v6, v7}, Ll3/h;->b(IIII)Z

    move-result v6

    if-eqz v6, :cond_4

    new-instance v6, Ll3/e;

    iget-object v8, v5, Ll3/e;->a:Ljava/lang/Object;

    iget v9, v5, Ll3/e;->b:I

    invoke-static {p1, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    sub-int/2addr v9, p1

    invoke-static {p2, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    sub-int/2addr v7, p1

    iget-object v5, v5, Ll3/e;->d:Ljava/lang/String;

    invoke-direct {v6, v9, v7, v8, v5}, Ll3/e;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    :goto_3
    const/4 v1, 0x0

    :cond_6
    new-instance p1, Ll3/g;

    invoke-direct {p1, v1, v2}, Ll3/g;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll3/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll3/g;

    iget-object v1, p1, Ll3/g;->x:Ljava/lang/String;

    iget-object v3, p0, Ll3/g;->x:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ll3/g;->w:Ljava/util/List;

    iget-object p1, p1, Ll3/g;->w:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll3/g;->w:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final length()I
    .locals 1

    iget-object v0, p0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic subSequence(II)Ljava/lang/CharSequence;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ll3/g;->e(II)Ll3/g;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll3/g;->x:Ljava/lang/String;

    return-object v0
.end method
