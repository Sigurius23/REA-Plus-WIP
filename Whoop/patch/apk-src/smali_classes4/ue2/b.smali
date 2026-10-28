.class public final Lue2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lue2/b;",
        "",
        "<init>",
        "()V",
        "Lse2/c;",
        "domainState",
        "Lue2/a;",
        "a",
        "(Lse2/c;)Lue2/a;",
        "sleep-coach_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lse2/c;)Lue2/a;
    .locals 11

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lse2/c$b;->a:Lse2/c$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lue2/a$c;

    sget-object v5, Lte2/b$b$c;->a:Lte2/b$b$c;

    const/16 v7, 0x17

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lue2/a$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lte2/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    sget-object v0, Lse2/c$c;->a:Lse2/c$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Lue2/a$c;

    sget-object v5, Lte2/b$b$a;->a:Lte2/b$b$a;

    const/16 v7, 0x17

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lue2/a$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lte2/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    sget-object v0, Lse2/c$e;->a:Lse2/c$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    new-instance v3, Lue2/a$c;

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget p1, Lqe2/g;->s1:I

    invoke-direct {v6, p1, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v7, Lte2/b$a$a;->a:Lte2/b$a$a;

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lue2/a$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lte2/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_2
    sget-object v0, Lse2/c$f;->a:Lse2/c$f;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v3, Lue2/a$c;

    new-instance v4, Lcom/whoop/design/util/TextResource$b;

    sget p1, Lqe2/g;->e0:I

    invoke-direct {v4, p1, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget p1, Lqe2/g;->D1:I

    invoke-direct {v5, p1, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget p1, Lqe2/g;->s1:I

    invoke-direct {v6, p1, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v7, Lte2/b$a$a;->a:Lte2/b$a$a;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lue2/a$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lte2/b;Z)V

    return-object v3

    :cond_3
    sget-object v0, Lse2/c$d;->a:Lse2/c$d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance p1, Lue2/a$b;

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lqe2/g;->I:I

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v4, Lqe2/g;->G:I

    invoke-direct {v3, v4, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/whoop/design/util/TextResource$b;

    sget v5, Lqe2/g;->J:I

    invoke-direct {v4, v5, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lqe2/g;->H:I

    invoke-direct {v5, v6, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v0, v3, v4, v5}, Lue2/a$b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object p1

    :cond_4
    sget-object v0, Lse2/c$g;->a:Lse2/c$g;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Lue2/a$d;->a:Lue2/a$d;

    return-object p1

    :cond_5
    sget-object v0, Lse2/c$h;->a:Lse2/c$h;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Lue2/a$e;->a:Lue2/a$e;

    return-object p1

    :cond_6
    sget-object v0, Lse2/c$a;->a:Lse2/c$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, Lue2/a$a;->a:Lue2/a$a;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
