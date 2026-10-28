.class public abstract Lji2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lji2/i;",
        "Lgi2/b;",
        "a",
        "(Lji2/i;)Lgi2/b;",
        "strava_release"
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
.method public static final a(Lji2/i;)Lgi2/b;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lji2/i$f;

    if-eqz v1, :cond_1

    check-cast v0, Lji2/i$f;

    invoke-virtual {v0}, Lji2/i$f;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lji2/i$f;->d()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lji2/i$f;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lgi2/b$a;

    new-instance v2, Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;

    invoke-virtual {v0}, Lji2/i$f;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lji2/i$f;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lji2/i$f;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v4, v0}, Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lgi2/b$a;-><init>(Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;)V

    return-object v1

    :cond_0
    new-instance v1, Lgi2/b$b;

    invoke-virtual {v0}, Lji2/i$f;->c()Z

    move-result v0

    invoke-direct {v1, v0}, Lgi2/b$b;-><init>(Z)V

    return-object v1

    :cond_1
    sget-object v1, Lji2/i$c;->a:Lji2/i$c;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Lgi2/b$c;->a:Lgi2/b$c;

    return-object v0

    :cond_2
    instance-of v1, v0, Lji2/i$o;

    if-eqz v1, :cond_3

    new-instance v2, Lgi2/b$i;

    check-cast v0, Lji2/i$o;

    invoke-interface {v0}, Lji2/i$o;->a()Lji2/m;

    move-result-object v1

    invoke-virtual {v1}, Lji2/m;->d()Z

    move-result v3

    invoke-interface {v0}, Lji2/i$o;->a()Lji2/m;

    move-result-object v1

    invoke-virtual {v1}, Lji2/m;->c()Z

    move-result v4

    invoke-interface {v0}, Lji2/i$o;->a()Lji2/m;

    move-result-object v1

    invoke-virtual {v1}, Lji2/m;->f()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0}, Lji2/i$o;->a()Lji2/m;

    move-result-object v1

    invoke-virtual {v1}, Lji2/m;->e()Ljava/util/List;

    move-result-object v6

    invoke-interface {v0}, Lji2/i$o;->a()Lji2/m;

    move-result-object v1

    invoke-virtual {v1}, Lji2/m;->b()Z

    move-result v7

    invoke-interface {v0}, Lji2/i$o;->a()Lji2/m;

    move-result-object v0

    invoke-virtual {v0}, Lji2/m;->a()Z

    move-result v8

    invoke-direct/range {v2 .. v8}, Lgi2/b$i;-><init>(ZZLjava/lang/String;Ljava/util/List;ZZ)V

    return-object v2

    :cond_3
    instance-of v1, v0, Lji2/i$l;

    if-eqz v1, :cond_4

    new-instance v1, Lgi2/b$f;

    new-instance v2, Lhi2/b;

    check-cast v0, Lji2/i$l;

    invoke-virtual {v0}, Lji2/i$l;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lji2/i$l;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lji2/i$l;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v0}, Lji2/i$l;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lji2/i$l;->c()Z

    move-result v9

    invoke-virtual {v0}, Lji2/i$l;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lji2/i$l;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v0}, Lji2/i$l;->b()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v0}, Lji2/i$l;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v0}, Lji2/i$l;->k()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lji2/i$l;->e()Z

    move-result v15

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v17}, Lhi2/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v2}, Lgi2/b$f;-><init>(Lhi2/b;)V

    return-object v1

    :cond_4
    instance-of v1, v0, Lji2/i$g;

    if-eqz v1, :cond_5

    new-instance v1, Lgi2/b$e;

    check-cast v0, Lji2/i$g;

    invoke-virtual {v0}, Lji2/i$g;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lgi2/b$e;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_5
    instance-of v1, v0, Lji2/i$i;

    if-eqz v1, :cond_6

    new-instance v1, Lgi2/b$h;

    check-cast v0, Lji2/i$i;

    invoke-virtual {v0}, Lji2/i$i;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lji2/i$i;->b()Z

    move-result v0

    invoke-direct {v1, v2, v0}, Lgi2/b$h;-><init>(Ljava/lang/String;Z)V

    return-object v1

    :cond_6
    instance-of v1, v0, Lji2/i$h;

    if-eqz v1, :cond_7

    new-instance v1, Lgi2/b$g;

    check-cast v0, Lji2/i$h;

    invoke-virtual {v0}, Lji2/i$h;->b()Z

    move-result v0

    invoke-direct {v1, v0}, Lgi2/b$g;-><init>(Z)V

    return-object v1

    :cond_7
    instance-of v1, v0, Lji2/i$b;

    if-eqz v1, :cond_8

    new-instance v1, Lgi2/b$d;

    check-cast v0, Lji2/i$b;

    invoke-virtual {v0}, Lji2/i$b;->b()Lhi2/a;

    move-result-object v0

    invoke-direct {v1, v0}, Lgi2/b$d;-><init>(Lhi2/a;)V

    return-object v1

    :cond_8
    instance-of v1, v0, Lji2/i$a;

    if-nez v1, :cond_a

    instance-of v1, v0, Lji2/i$e;

    if-nez v1, :cond_a

    instance-of v1, v0, Lji2/i$j;

    if-eqz v1, :cond_9

    goto :goto_0

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_a
    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot send the event "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
