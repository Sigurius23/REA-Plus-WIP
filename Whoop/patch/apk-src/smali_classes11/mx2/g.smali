.class public abstract Lmx2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0019\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a!\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u0019\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0006\u001a\u0011\u0010\u0014\u001a\u00020\u0003*\u00020\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a#\u0010\u0017\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lmx2/f$a;",
        "c",
        "(Lmx2/f$a;)Lmx2/f$a;",
        "Lmx2/b;",
        "action",
        "a",
        "(Lmx2/f$a;Lmx2/b;)Lmx2/f$a;",
        "Lmx2/i;",
        "config",
        "b",
        "(Lmx2/f$a;Lmx2/b;Lmx2/i;)Lmx2/f$a;",
        "",
        "reason",
        "g",
        "(Lmx2/f$a;Ljava/lang/String;)Lmx2/f$a;",
        "reasonKey",
        "reasonDisplayText",
        "e",
        "(Lmx2/f$a;Ljava/lang/String;Ljava/lang/String;)Lmx2/f$a;",
        "d",
        "h",
        "(Lmx2/b;)Lmx2/b;",
        "additionalText",
        "f",
        "(Lmx2/b;Ljava/lang/String;Ljava/lang/String;)Lmx2/b;",
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
.method public static final a(Lmx2/f$a;Lmx2/b;)Lmx2/f$a;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lmx2/k$a;

    invoke-direct {v3, p1}, Lmx2/k$a;-><init>(Lmx2/b;)V

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lmx2/f$a;->b(Lmx2/f$a;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;Lmx2/k;ZLorg/joda/time/DateTime;ILjava/lang/Object;)Lmx2/f$a;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lmx2/f$a;Lmx2/b;Lmx2/i;)Lmx2/f$a;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lmx2/k$b;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lmx2/k$b;-><init>(Lmx2/b;Lmx2/i;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, v1

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lmx2/f$a;->b(Lmx2/f$a;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;Lmx2/k;ZLorg/joda/time/DateTime;ILjava/lang/Object;)Lmx2/f$a;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lmx2/f$a;)Lmx2/f$a;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lmx2/k$d;->a:Lmx2/k$d;

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lmx2/f$a;->b(Lmx2/f$a;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;Lmx2/k;ZLorg/joda/time/DateTime;ILjava/lang/Object;)Lmx2/f$a;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lmx2/f$a;->g(Ljava/lang/String;)Lmx2/f$a;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lmx2/f$a;Lmx2/b;)Lmx2/f$a;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lmx2/k$e;

    invoke-direct {v3, p1}, Lmx2/k$e;-><init>(Lmx2/b;)V

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lmx2/f$a;->b(Lmx2/f$a;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;Lmx2/k;ZLorg/joda/time/DateTime;ILjava/lang/Object;)Lmx2/f$a;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lmx2/f$a;Ljava/lang/String;Ljava/lang/String;)Lmx2/f$a;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reasonKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reasonDisplayText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lmx2/f$a;->d()Lmx2/k;

    move-result-object v0

    instance-of v1, v0, Lmx2/k$b;

    if-eqz v1, :cond_0

    check-cast v0, Lmx2/k$b;

    invoke-virtual {v0}, Lmx2/k$b;->d()Lmx2/b;

    move-result-object v2

    invoke-virtual {v0}, Lmx2/k$b;->c()Lmx2/i;

    move-result-object v3

    new-instance v1, Lmx2/k$c;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v8}, Lmx2/k$c;-><init>(Lmx2/b;Lmx2/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v9, 0xd

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v4, p0

    move-object v6, v1

    invoke-static/range {v4 .. v10}, Lmx2/f$a;->b(Lmx2/f$a;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;Lmx2/k;ZLorg/joda/time/DateTime;ILjava/lang/Object;)Lmx2/f$a;

    move-result-object p0

    return-object p0

    :cond_0
    move-object v4, p0

    return-object v4
.end method

.method public static final f(Lmx2/b;Ljava/lang/String;Ljava/lang/String;)Lmx2/b;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lmx2/b$a;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Lmx2/b$a;

    new-instance v8, Lmx2/a;

    invoke-direct {v8, p1, p2}, Lmx2/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v10}, Lmx2/b$a;->h(Lmx2/b$a;ILmx2/l;Lmx2/l;Lmx2/i;Lmx2/m;Lmx2/m;Lmx2/a;ILjava/lang/Object;)Lmx2/b$a;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final g(Lmx2/f$a;Ljava/lang/String;)Lmx2/f$a;
    .locals 8

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "reason"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lmx2/f$a;->d()Lmx2/k;

    move-result-object v1

    instance-of v2, v1, Lmx2/k$b;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lmx2/k$b;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p1

    invoke-static/range {v2 .. v7}, Lmx2/k$b;->b(Lmx2/k$b;Lmx2/b;Lmx2/i;Ljava/lang/String;ILjava/lang/Object;)Lmx2/k$b;

    move-result-object v2

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lmx2/f$a;->b(Lmx2/f$a;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;Lmx2/k;ZLorg/joda/time/DateTime;ILjava/lang/Object;)Lmx2/f$a;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p0
.end method

.method public static final h(Lmx2/b;)Lmx2/b;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lmx2/b$a;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Lmx2/b$a;

    const/16 v9, 0x77

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lmx2/b$a;->h(Lmx2/b$a;ILmx2/l;Lmx2/l;Lmx2/i;Lmx2/m;Lmx2/m;Lmx2/a;ILjava/lang/Object;)Lmx2/b$a;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lmx2/b$b;

    if-eqz v0, :cond_1

    move-object v1, p0

    check-cast v1, Lmx2/b$b;

    const/16 v8, 0x37

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lmx2/b$b;->h(Lmx2/b$b;ILmx2/l;Lmx2/l;Lmx2/i;Lmx2/m;Lmx2/m;ILjava/lang/Object;)Lmx2/b$b;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lmx2/b$d;

    if-eqz v0, :cond_2

    move-object v1, p0

    check-cast v1, Lmx2/b$d;

    const/16 v8, 0x37

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lmx2/b$d;->h(Lmx2/b$d;ILmx2/l;Lmx2/l;Lmx2/i;Lmx2/m;Lmx2/m;ILjava/lang/Object;)Lmx2/b$d;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v0, p0, Lmx2/b$c;

    if-eqz v0, :cond_3

    move-object v1, p0

    check-cast v1, Lmx2/b$c;

    const/16 v8, 0x37

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lmx2/b$c;->h(Lmx2/b$c;ILmx2/l;Lmx2/l;Lmx2/i;Lmx2/m;Lmx2/m;ILjava/lang/Object;)Lmx2/b$c;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
