.class public final Ldz0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00082\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J=\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00082\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010&\u001a\u00020\"8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010#\u001a\u0004\u0008$\u0010%R\u0013\u0010)\u001a\u0004\u0018\u00010\'8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Ldz0/c;",
        "",
        "Lcz0/g;",
        "state",
        "Lcz0/i;",
        "filter",
        "<init>",
        "(Lcz0/g;Lcz0/i;)V",
        "Lh2/b;",
        "offset",
        "",
        "Lcz0/r;",
        "scrubbableData",
        "Lu2/v;",
        "scope",
        "Ll83/a0;",
        "d",
        "(JLjava/util/List;Lu2/v;)V",
        "Ldz0/b;",
        "change",
        "dragAmount",
        "",
        "isScrubberFixEnabled",
        "b",
        "(Ldz0/b;JLjava/util/List;Lu2/v;Z)V",
        "c",
        "()V",
        "a",
        "Lcz0/g;",
        "getState",
        "()Lcz0/g;",
        "Lcz0/i;",
        "getFilter",
        "()Lcz0/i;",
        "Ldz0/a;",
        "Ldz0/a;",
        "getInternalScrubberState",
        "()Ldz0/a;",
        "internalScrubberState",
        "",
        "()Ljava/lang/Float;",
        "positionOfScrubber",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcz0/g;

.field private final b:Lcz0/i;

.field private final c:Ldz0/a;


# direct methods
.method public constructor <init>(Lcz0/g;Lcz0/i;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldz0/c;->a:Lcz0/g;

    .line 3
    iput-object p2, p0, Ldz0/c;->b:Lcz0/i;

    .line 4
    new-instance p1, Ldz0/a;

    const/4 p2, 0x0

    const/4 v0, 0x3

    invoke-direct {p1, p2, p2, v0, p2}, Ldz0/a;-><init>(Ljava/lang/Float;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Ldz0/c;->c:Ldz0/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcz0/g;Lcz0/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 5
    new-instance p2, Lcz0/i;

    invoke-direct {p2}, Lcz0/i;-><init>()V

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Ldz0/c;-><init>(Lcz0/g;Lcz0/i;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 2

    iget-object v0, p0, Ldz0/c;->a:Lcz0/g;

    invoke-virtual {v0}, Lcz0/g;->b()Ld61/a;

    move-result-object v0

    invoke-interface {v0}, Ld61/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz0/s;

    invoke-virtual {v0}, Lcz0/s;->d()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(Ldz0/b;JLjava/util/List;Lu2/v;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldz0/b;",
            "J",
            "Ljava/util/List<",
            "+",
            "Lcz0/r;",
            ">;",
            "Lu2/v;",
            "Z)V"
        }
    .end annotation

    const-string v0, "change"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrubbableData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ldz0/b;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    const-wide/16 v0, 0x0

    const/16 v2, 0xa

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/16 v5, 0x20

    if-eqz p6, :cond_2

    iget-object p6, p0, Ldz0/c;->c:Ldz0/a;

    invoke-virtual {p6}, Ldz0/a;->a()Ljava/lang/Float;

    move-result-object p6

    if-eqz p6, :cond_5

    invoke-virtual {p6}, Ljava/lang/Number;->floatValue()F

    move-result p6

    iget-object v6, p0, Ldz0/c;->c:Ldz0/a;

    invoke-virtual {v6}, Ldz0/a;->b()Ljava/lang/Float;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    shr-long/2addr p2, v5

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    check-cast p5, Lu2/h0;

    iget-wide v7, p5, Lu2/h0;->Y:J

    shr-long/2addr v7, v5

    long-to-int p5, v7

    int-to-float p5, p5

    div-float/2addr p3, p5

    add-float/2addr p3, p6

    iget-object p5, p0, Ldz0/c;->c:Ldz0/a;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p6

    invoke-virtual {p5, p6}, Ldz0/a;->c(Ljava/lang/Float;)V

    cmpg-float p5, v4, p3

    if-gtz p5, :cond_5

    cmpg-float p5, p3, v3

    if-gtz p5, :cond_5

    iget-object p5, p0, Ldz0/c;->c:Ldz0/a;

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    add-float/2addr p2, v6

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p5, p2}, Ldz0/a;->d(Ljava/lang/Float;)V

    iget-object p2, p0, Ldz0/c;->b:Lcz0/i;

    check-cast p4, Ljava/lang/Iterable;

    new-instance p5, Ljava/util/ArrayList;

    invoke-static {p4, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p5, p6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lcz0/r;

    invoke-interface {p6, p3}, Lcz0/r;->a(F)Lcz0/s;

    move-result-object p6

    invoke-virtual {p5, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p3, p5}, Lcz0/i;->a(FLjava/util/List;)Ljava/util/Map;

    move-result-object p2

    new-instance p3, Ld61/a$a;

    iget-object p4, p0, Ldz0/c;->c:Ldz0/a;

    invoke-virtual {p4}, Ldz0/a;->b()Ljava/lang/Float;

    move-result-object p4

    invoke-direct {p3, p2, p4}, Ld61/a$a;-><init>(Ljava/util/Map;Ljava/lang/Float;)V

    invoke-virtual {p1}, Ldz0/b;->b()J

    move-result-wide p4

    invoke-static {p4, p5, v0, v1}, Lh2/b;->c(JJ)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ldz0/b;->a()V

    :cond_1
    iget-object p1, p0, Ldz0/c;->a:Lcz0/g;

    invoke-virtual {p1}, Lcz0/g;->a()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    iget-object p6, p0, Ldz0/c;->c:Ldz0/a;

    invoke-virtual {p6}, Ldz0/a;->a()Ljava/lang/Float;

    move-result-object p6

    invoke-static {p6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p6}, Ljava/lang/Float;->floatValue()F

    move-result p6

    shr-long/2addr p2, v5

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    check-cast p5, Lu2/h0;

    iget-wide v6, p5, Lu2/h0;->Y:J

    shr-long v5, v6, v5

    long-to-int p5, v5

    int-to-float p5, p5

    div-float/2addr p3, p5

    add-float/2addr p3, p6

    iget-object p5, p0, Ldz0/c;->c:Ldz0/a;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p6

    invoke-virtual {p5, p6}, Ldz0/a;->c(Ljava/lang/Float;)V

    iget-object p5, p0, Ldz0/c;->c:Ldz0/a;

    invoke-virtual {p5}, Ldz0/a;->a()Ljava/lang/Float;

    move-result-object p5

    invoke-static {p5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p5}, Ljava/lang/Float;->floatValue()F

    move-result p5

    cmpg-float p6, v4, p5

    if-gtz p6, :cond_5

    cmpg-float p5, p5, v3

    if-gtz p5, :cond_5

    iget-object p5, p0, Ldz0/c;->c:Ldz0/a;

    invoke-virtual {p5}, Ldz0/a;->b()Ljava/lang/Float;

    move-result-object p6

    invoke-static {p6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p6}, Ljava/lang/Float;->floatValue()F

    move-result p6

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    add-float/2addr p2, p6

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p5, p2}, Ldz0/a;->d(Ljava/lang/Float;)V

    iget-object p2, p0, Ldz0/c;->b:Lcz0/i;

    check-cast p4, Ljava/lang/Iterable;

    new-instance p5, Ljava/util/ArrayList;

    invoke-static {p4, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p5, p6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_3

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lcz0/r;

    invoke-interface {p6, p3}, Lcz0/r;->a(F)Lcz0/s;

    move-result-object p6

    invoke-virtual {p5, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p2, p3, p5}, Lcz0/i;->a(FLjava/util/List;)Ljava/util/Map;

    move-result-object p2

    new-instance p3, Ld61/a$a;

    iget-object p4, p0, Ldz0/c;->c:Ldz0/a;

    invoke-virtual {p4}, Ldz0/a;->b()Ljava/lang/Float;

    move-result-object p4

    invoke-direct {p3, p2, p4}, Ld61/a$a;-><init>(Ljava/util/Map;Ljava/lang/Float;)V

    invoke-virtual {p1}, Ldz0/b;->b()J

    move-result-wide p4

    invoke-static {p4, p5, v0, v1}, Lh2/b;->c(JJ)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p1}, Ldz0/b;->a()V

    :cond_4
    iget-object p1, p0, Ldz0/c;->a:Lcz0/g;

    invoke-virtual {p1}, Lcz0/g;->a()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Ldz0/c;->c:Ldz0/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ldz0/a;->c(Ljava/lang/Float;)V

    iget-object v0, p0, Ldz0/c;->c:Ldz0/a;

    invoke-virtual {v0, v1}, Ldz0/a;->d(Ljava/lang/Float;)V

    sget-object v0, Ld61/a$b;->a:Ld61/a$b;

    iget-object v1, p0, Ldz0/c;->a:Lcz0/g;

    invoke-virtual {v1}, Lcz0/g;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final d(JLjava/util/List;Lu2/v;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lcz0/r;",
            ">;",
            "Lu2/v;",
            ")V"
        }
    .end annotation

    const-string v0, "scrubbableData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldz0/c;->a:Lcz0/g;

    invoke-virtual {v0}, Lcz0/g;->b()Ld61/a;

    move-result-object v0

    instance-of v0, v0, Ld61/a$c;

    if-nez v0, :cond_1

    const/16 v0, 0x20

    shr-long/2addr p1, v0

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    check-cast p4, Lu2/h0;

    iget-wide v1, p4, Lu2/h0;->Y:J

    shr-long v0, v1, v0

    long-to-int p4, v0

    int-to-float p4, p4

    div-float/2addr p2, p4

    iget-object p4, p0, Ldz0/c;->c:Ldz0/a;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p4, v0}, Ldz0/a;->c(Ljava/lang/Float;)V

    iget-object p4, p0, Ldz0/c;->c:Ldz0/a;

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p4, v0}, Ldz0/a;->d(Ljava/lang/Float;)V

    check-cast p3, Ljava/lang/Iterable;

    new-instance p4, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p3, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p4, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz0/r;

    invoke-interface {v0, p2}, Lcz0/r;->a(F)Lcz0/s;

    move-result-object v0

    invoke-interface {p4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p3, p0, Ldz0/c;->b:Lcz0/i;

    invoke-virtual {p3, p2, p4}, Lcz0/i;->a(FLjava/util/List;)Ljava/util/Map;

    move-result-object p2

    new-instance p3, Ld61/a$c;

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {p3, p2, p1}, Ld61/a$c;-><init>(Ljava/util/Map;Ljava/lang/Float;)V

    iget-object p1, p0, Ldz0/c;->a:Lcz0/g;

    invoke-virtual {p1}, Lcz0/g;->a()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
