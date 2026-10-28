.class final Ldt1/h$m;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldt1/h;->y(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ldt1/i;",
        "internalState",
        "Ldt1/b;",
        "internalEvent",
        "<anonymous>",
        "(Ldt1/i;Ldt1/b;)Ldt1/i;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$interact$2"
    f = "LabradorDetailsInteractor.kt"
    l = {
        0x65
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ldt1/h;

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldt1/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/h;",
            "Lq83/d<",
            "-",
            "Ldt1/h$m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldt1/h$m;->E:Ldt1/h;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ldt1/i;Ldt1/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/i;",
            "Ldt1/b;",
            "Lq83/d<",
            "-",
            "Ldt1/i;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ldt1/h$m;

    iget-object v1, p0, Ldt1/h$m;->E:Ldt1/h;

    invoke-direct {v0, v1, p3}, Ldt1/h$m;-><init>(Ldt1/h;Lq83/d;)V

    iput-object p1, v0, Ldt1/h$m;->y:Ljava/lang/Object;

    iput-object p2, v0, Ldt1/h$m;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ldt1/h$m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldt1/i;

    check-cast p2, Ldt1/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ldt1/h$m;->f(Ldt1/i;Ldt1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Ldt1/h$m;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ldt1/i;

    iget-object v0, p0, Ldt1/h$m;->z:Ljava/lang/Object;

    check-cast v0, Ldt1/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Ldt1/h$m;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v0, p0, Ldt1/h$m;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Ldt1/b$i;->a:Ldt1/b$i;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object v2, Ldt1/g$h;->a:Ldt1/g$h;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, Ldt1/b$h;->a:Ldt1/b$h;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v3, 0x0

    if-eqz p1, :cond_3

    iget-object p1, p0, Ldt1/h$m;->E:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->e(Ldt1/h;)Lss1/a;

    move-result-object p1

    invoke-virtual {p1}, Lss1/a;->p()V

    new-instance v2, Ldt1/g$d;

    invoke-direct {v2, v3, v4, v3}, Ldt1/g$d;-><init>(Ldt1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v0, Ldt1/b$o;

    if-eqz p1, :cond_5

    check-cast v0, Ldt1/b$o;

    invoke-virtual {v0}, Ldt1/b$o;->a()Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/labrador/feature/details/domain/model/DomainMapperKt;->toDomainHolder(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-result-object v6

    iget-object p1, p0, Ldt1/h$m;->E:Ldt1/h;

    new-instance v5, Ldt1/g$g;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Ldt1/g$g;-><init>(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/a;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, p0, Ldt1/h$m;->y:Ljava/lang/Object;

    iput-object v3, p0, Ldt1/h$m;->z:Ljava/lang/Object;

    iput-object v6, p0, Ldt1/h$m;->w:Ljava/lang/Object;

    iput v4, p0, Ldt1/h$m;->x:I

    invoke-static {p1, v5, p0}, Ldt1/h;->a(Ldt1/h;Ldt1/g$g;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    return-object v2

    :cond_4
    move-object v2, v6

    :goto_0
    move-object v1, p1

    check-cast v1, Ldt1/g$g;

    new-instance v0, Ldt1/i;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Ldt1/i;-><init>(Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_5
    sget-object p1, Ldt1/b$m;->a:Ldt1/b$m;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object v2, Ldt1/g$j;->a:Ldt1/g$j;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v0, Ldt1/b$p;

    if-eqz p1, :cond_7

    iget-object p1, p0, Ldt1/h$m;->E:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->e(Ldt1/h;)Lss1/a;

    move-result-object p1

    invoke-virtual {p1}, Lss1/a;->w()V

    new-instance v2, Ldt1/g$k;

    check-cast v0, Ldt1/b$p;

    invoke-virtual {v0}, Ldt1/b$p;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ldt1/b$p;->d()Ljava/time/Instant;

    move-result-object v3

    invoke-virtual {v0}, Ldt1/b$p;->c()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0}, Ldt1/b$p;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, p1, v3, v4, v0}, Ldt1/g$k;-><init>(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_7
    sget-object p1, Ldt1/b$l;->a:Ldt1/b$l;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Ldt1/h$m;->E:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->e(Ldt1/h;)Lss1/a;

    move-result-object p1

    invoke-virtual {p1}, Lss1/a;->x()V

    sget-object v2, Ldt1/g$i;->a:Ldt1/g$i;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of p1, v0, Ldt1/b$b;

    if-eqz p1, :cond_9

    new-instance v2, Ldt1/g$c;

    move-object p1, v0

    check-cast p1, Ldt1/b$b;

    invoke-virtual {p1}, Ldt1/b$b;->a()Ljava/time/Instant;

    move-result-object p1

    invoke-direct {v2, p1}, Ldt1/g$c;-><init>(Ljava/time/Instant;)V

    move-object v4, v0

    check-cast v4, Ldt1/b$j;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of p1, v0, Ldt1/b$c;

    if-eqz p1, :cond_a

    iget-object p1, p0, Ldt1/h$m;->E:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->e(Ldt1/h;)Lss1/a;

    move-result-object p1

    invoke-virtual {p1}, Lss1/a;->c()V

    new-instance v2, Ldt1/g$a;

    check-cast v0, Ldt1/b$c;

    invoke-virtual {v0}, Ldt1/b$c;->a()Ljava/time/Instant;

    move-result-object p1

    invoke-direct {v2, p1}, Ldt1/g$a;-><init>(Ljava/time/Instant;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_a
    sget-object p1, Ldt1/b$d;->a:Ldt1/b$d;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Ldt1/h$m;->E:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->e(Ldt1/h;)Lss1/a;

    move-result-object p1

    invoke-virtual {p1}, Lss1/a;->n()V

    sget-object v2, Ldt1/g$b;->a:Ldt1/g$b;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_b
    sget-object p1, Ldt1/b$e;->a:Ldt1/b$e;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-virtual {v1}, Ldt1/i;->d()Ldt1/g;

    move-result-object p1

    instance-of p1, p1, Ldt1/g$d;

    if-eqz p1, :cond_c

    new-instance p1, Ldt1/g$d;

    invoke-direct {p1, v3}, Ldt1/g$d;-><init>(Ldt1/a;)V

    move-object v2, p1

    goto :goto_1

    :cond_c
    new-instance v4, Ldt1/g$g;

    invoke-virtual {v1}, Ldt1/i;->c()Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-result-object v5

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Ldt1/g$g;-><init>(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/a;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v4

    :goto_1
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_d
    sget-object p1, Ldt1/b$n;->a:Ldt1/b$n;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    iget-object p1, p0, Ldt1/h$m;->E:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->e(Ldt1/h;)Lss1/a;

    move-result-object p1

    invoke-virtual {p1}, Lss1/a;->e()V

    invoke-virtual {v1}, Ldt1/i;->d()Ldt1/g;

    move-result-object p1

    instance-of p1, p1, Ldt1/g$d;

    if-eqz p1, :cond_e

    new-instance p1, Ldt1/g$d;

    new-instance v0, Ldt1/a;

    invoke-virtual {v1}, Ldt1/i;->c()Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ldt1/i;->c()Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getTimestamp()Ljava/time/Instant;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Ldt1/a;-><init>(Ljava/lang/String;Ljava/time/Instant;)V

    invoke-direct {p1, v0}, Ldt1/g$d;-><init>(Ldt1/a;)V

    move-object v2, p1

    goto :goto_2

    :cond_e
    new-instance v4, Ldt1/g$g;

    invoke-virtual {v1}, Ldt1/i;->c()Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-result-object v5

    new-instance v6, Ldt1/a;

    invoke-virtual {v1}, Ldt1/i;->c()Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ldt1/i;->c()Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getTimestamp()Ljava/time/Instant;

    move-result-object v0

    invoke-direct {v6, p1, v0}, Ldt1/a;-><init>(Ljava/lang/String;Ljava/time/Instant;)V

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Ldt1/g$g;-><init>(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/a;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v4

    :goto_2
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_f
    sget-object p1, Ldt1/b$g;->a:Ldt1/b$g;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_10

    sget-object v2, Ldt1/g$f;->a:Ldt1/g$f;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_10
    sget-object p1, Ldt1/b$f;->a:Ldt1/b$f;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    sget-object v2, Ldt1/g$e;->a:Ldt1/g$e;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_11
    sget-object p1, Ldt1/b$k;->a:Ldt1/b$k;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    iget-object p1, p0, Ldt1/h$m;->E:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->e(Ldt1/h;)Lss1/a;

    move-result-object p1

    invoke-virtual {p1}, Lss1/a;->l()V

    invoke-virtual {v1}, Ldt1/i;->d()Ldt1/g;

    move-result-object p1

    instance-of p1, p1, Ldt1/g$g;

    if-eqz p1, :cond_12

    invoke-virtual {v1}, Ldt1/i;->d()Ldt1/g;

    move-result-object p1

    check-cast p1, Ldt1/g$g;

    invoke-virtual {p1}, Ldt1/g$g;->e()Ljava/lang/String;

    move-result-object v3

    :cond_12
    move-object v7, v3

    invoke-virtual {v1}, Ldt1/i;->c()Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-result-object v5

    new-instance v2, Ldt1/g$g;

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x1

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, Ldt1/g$g;-><init>(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/a;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_13
    sget-object p1, Ldt1/b$a;->a:Ldt1/b$a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_15

    invoke-virtual {v1}, Ldt1/i;->d()Ldt1/g;

    move-result-object p1

    instance-of p1, p1, Ldt1/g$g;

    if-eqz p1, :cond_14

    invoke-virtual {v1}, Ldt1/i;->d()Ldt1/g;

    move-result-object p1

    check-cast p1, Ldt1/g$g;

    invoke-virtual {p1}, Ldt1/g$g;->e()Ljava/lang/String;

    move-result-object v3

    :cond_14
    move-object v7, v3

    invoke-virtual {v1}, Ldt1/i;->c()Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-result-object v5

    new-instance v2, Ldt1/g$g;

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, Ldt1/g$g;-><init>(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/a;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/i;->b(Ldt1/i;Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;ILjava/lang/Object;)Ldt1/i;

    move-result-object p1

    return-object p1

    :cond_15
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
