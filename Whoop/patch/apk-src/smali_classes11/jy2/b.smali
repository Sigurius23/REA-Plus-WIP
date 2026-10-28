.class public abstract Ljy2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lky2/g;",
        "Lvy2/c;",
        "currentDomainState",
        "d",
        "(Lky2/g;Lvy2/c;)Lky2/g;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;",
        "screeningSubmissionResponse",
        "c",
        "(Lky2/g;Lvy2/c;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)Lky2/g;",
        "Liy2/b$e;",
        "Lky2/g$a$b;",
        "f",
        "(Liy2/b$e;)Lky2/g$a$b;",
        "Liy2/b$a;",
        "Lky2/g$a$a;",
        "e",
        "(Liy2/b$a;)Lky2/g$a$a;",
        "Lvy2/d;",
        "Lky2/i;",
        "i",
        "(Lvy2/d;)Lky2/i;",
        "Liy2/b$g;",
        "Lky2/g$f;",
        "h",
        "(Liy2/b$g;)Lky2/g$f;",
        "Liy2/b$c;",
        "Lky2/g$c;",
        "g",
        "(Liy2/b$c;)Lky2/g$c;",
        "whooplabs_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Liy2/b$c;)Lky2/g$c;
    .locals 0

    invoke-static {p0}, Ljy2/b;->g(Liy2/b$c;)Lky2/g$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Liy2/b$g;)Lky2/g$f;
    .locals 0

    invoke-static {p0}, Ljy2/b;->h(Liy2/b$g;)Lky2/g$f;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lky2/g;Lvy2/c;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)Lky2/g;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "currentDomainState"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "screeningSubmissionResponse"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v0, Lky2/g$a$a;

    if-eqz v2, :cond_0

    move-object v3, v0

    check-cast v3, Lky2/g$a$a;

    new-instance v9, Lky2/k;

    invoke-virtual/range {p1 .. p1}, Lvy2/c;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lvy2/c;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v2

    invoke-direct {v9, v0, v2, v1}, Lky2/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)V

    const/16 v15, 0x7cf

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v3 .. v16}, Lky2/g$a$a;->e(Lky2/g$a$a;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;ILjava/lang/Object;)Lky2/g$a$a;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v2, v0, Lky2/g$a$b;

    if-eqz v2, :cond_1

    move-object v3, v0

    check-cast v3, Lky2/g$a$b;

    new-instance v9, Lky2/k;

    invoke-virtual/range {p1 .. p1}, Lvy2/c;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lvy2/c;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v2

    invoke-direct {v9, v0, v2, v1}, Lky2/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)V

    const/16 v15, 0x7cf

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v3 .. v16}, Lky2/g$a$b;->e(Lky2/g$a$b;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ILjava/lang/Object;)Lky2/g$a$b;

    move-result-object v0

    return-object v0

    :cond_1
    instance-of v2, v0, Lky2/g$c;

    if-eqz v2, :cond_2

    move-object v3, v0

    check-cast v3, Lky2/g$c;

    new-instance v9, Lky2/k;

    invoke-virtual/range {p1 .. p1}, Lvy2/c;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lvy2/c;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v2

    invoke-direct {v9, v0, v2, v1}, Lky2/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)V

    const/16 v10, 0xf

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Lky2/g$c;->b(Lky2/g$c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lky2/l;Lky2/k;ILjava/lang/Object;)Lky2/g$c;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public static final d(Lky2/g;Lvy2/c;)Lky2/g;
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "currentDomainState"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lky2/g$a$a;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Lky2/g$a$a;

    new-instance v7, Lky2/l;

    invoke-virtual/range {p1 .. p1}, Lvy2/c;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lvy2/c;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-direct {v7, v0, v1}, Lky2/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/16 v14, 0x7ef

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lky2/g$a$a;->e(Lky2/g$a$a;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;ILjava/lang/Object;)Lky2/g$a$a;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v1, v0, Lky2/g$a$b;

    if-eqz v1, :cond_1

    move-object v2, v0

    check-cast v2, Lky2/g$a$b;

    new-instance v7, Lky2/l;

    invoke-virtual/range {p1 .. p1}, Lvy2/c;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lvy2/c;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-direct {v7, v0, v1}, Lky2/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/16 v14, 0x7ef

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lky2/g$a$b;->e(Lky2/g$a$b;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ILjava/lang/Object;)Lky2/g$a$b;

    move-result-object v0

    return-object v0

    :cond_1
    instance-of v1, v0, Lky2/g$c;

    if-eqz v1, :cond_2

    move-object v2, v0

    check-cast v2, Lky2/g$c;

    new-instance v7, Lky2/l;

    invoke-virtual/range {p1 .. p1}, Lvy2/c;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lvy2/c;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-direct {v7, v0, v1}, Lky2/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/16 v9, 0x2f

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lky2/g$c;->b(Lky2/g$c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lky2/l;Lky2/k;ILjava/lang/Object;)Lky2/g$c;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public static final e(Liy2/b$a;)Lky2/g$a$a;
    .locals 15

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Liy2/b$a;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->b()I

    move-result v2

    invoke-virtual {p0}, Liy2/b$a;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Liy2/b$a;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v4

    invoke-virtual {p0}, Liy2/b$a;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {p0}, Liy2/b$a;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v9

    invoke-virtual {p0}, Liy2/b$a;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0}, Liy2/b$a;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvy2/d;

    invoke-static {v1}, Ljy2/b;->i(Lvy2/d;)Lky2/i;

    move-result-object v1

    invoke-interface {v11, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Liy2/b$a;->b()Ljava/util/Set;

    move-result-object v12

    new-instance v1, Lky2/g$a$a;

    const/16 v13, 0x30

    const/4 v14, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v14}, Lky2/g$a$a;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final f(Liy2/b$e;)Lky2/g$a$b;
    .locals 15

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Liy2/b$e;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->b()I

    move-result v2

    invoke-virtual {p0}, Liy2/b$e;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Liy2/b$e;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v4

    invoke-virtual {p0}, Liy2/b$e;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {p0}, Liy2/b$e;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v9

    invoke-virtual {p0}, Liy2/b$e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lor2/o1;->c(Ljava/lang/String;)Z

    move-result v5

    invoke-virtual {p0}, Liy2/b$e;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0}, Liy2/b$e;->a()Lvy2/e;

    move-result-object v0

    invoke-virtual {v0}, Lvy2/e;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvy2/d;

    invoke-static {v1}, Ljy2/b;->i(Lvy2/d;)Lky2/i;

    move-result-object v1

    invoke-interface {v11, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Liy2/b$e;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Liy2/b$e;->a()Lvy2/e;

    move-result-object p0

    invoke-virtual {p0}, Lvy2/e;->d()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v6, 0x0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lvy2/d;

    invoke-virtual {v7}, Lvy2/d;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, -0x1

    :goto_2
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-ltz v0, :cond_3

    move-object v1, p0

    :cond_3
    move-object v12, v1

    new-instance v1, Lky2/g$a$b;

    const/16 v13, 0x30

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v14}, Lky2/g$a$b;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final g(Liy2/b$c;)Lky2/g$c;
    .locals 9

    new-instance v0, Lky2/g$c;

    invoke-virtual {p0}, Liy2/b$c;->a()Lvy2/c;

    move-result-object v1

    invoke-virtual {v1}, Lvy2/c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Liy2/b$c;->a()Lvy2/c;

    move-result-object v2

    invoke-virtual {v2}, Lvy2/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Liy2/b$c;->a()Lvy2/c;

    move-result-object v3

    invoke-virtual {v3}, Lvy2/c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Liy2/b$c;->a()Lvy2/c;

    move-result-object p0

    invoke-virtual {p0}, Lvy2/c;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/16 v7, 0x30

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lky2/g$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lky2/l;Lky2/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final h(Liy2/b$g;)Lky2/g$f;
    .locals 10

    invoke-virtual {p0}, Liy2/b$g;->b()I

    move-result v1

    invoke-virtual {p0}, Liy2/b$g;->e()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const/4 v7, 0x0

    if-ge v6, v4, :cond_1

    aget-object v8, v3, v6

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    move-object v8, v7

    :goto_1
    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v8

    :goto_2
    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-virtual {p0}, Liy2/b$g;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    const-string v0, ""

    :cond_3
    sget-object v3, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v4

    array-length v6, v4

    :goto_3
    if-ge v5, v6, :cond_5

    aget-object v8, v4, v5

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    move-object v7, v8

    goto :goto_4

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_5
    :goto_4
    if-nez v7, :cond_6

    goto :goto_5

    :cond_6
    move-object v3, v7

    :goto_5
    invoke-virtual {p0}, Liy2/b$g;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Liy2/b$g;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v6

    invoke-virtual {p0}, Liy2/b$g;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Liy2/b$g;->g()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v0, Lcom/whoop/whooplabs/feature/navigation/c$i;

    invoke-virtual {p0}, Liy2/b$g;->g()Lcom/whoop/navigation/e;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/whoop/whooplabs/feature/navigation/c$i;-><init>(Lcom/whoop/navigation/e;)V

    :goto_6
    move-object v7, v0

    goto :goto_7

    :cond_7
    new-instance v0, Lcom/whoop/whooplabs/feature/navigation/c$f;

    invoke-virtual {p0}, Liy2/b$g;->b()I

    move-result v7

    invoke-virtual {p0}, Liy2/b$g;->h()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {v0, v7, p0}, Lcom/whoop/whooplabs/feature/navigation/c$f;-><init>(ILjava/lang/Integer;)V

    goto :goto_6

    :goto_7
    new-instance v0, Lky2/g$f;

    invoke-direct/range {v0 .. v7}, Lky2/g$f;-><init>(IILy81/f;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/whooplabs/feature/navigation/c;)V

    return-object v0
.end method

.method public static final i(Lvy2/d;)Lky2/i;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lky2/i;

    invoke-virtual {p0}, Lvy2/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lvy2/d;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lky2/i;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    return-object v0
.end method
