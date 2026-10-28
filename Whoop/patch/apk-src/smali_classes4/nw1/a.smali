.class public final Lnw1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lnw1/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lww1/h;",
        "action",
        "Ll83/a0;",
        "b",
        "(Lww1/h;)V",
        "Lww1/a;",
        "event",
        "a",
        "(Lww1/a;)V",
        "Lfi0/a;",
        "membership_release"
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
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnw1/a;->a:Lfi0/a;

    return-void
.end method

.method private final b(Lww1/h;)V
    .locals 2

    invoke-virtual {p1}, Lww1/h;->a()Lm91/u;

    move-result-object v0

    instance-of v1, v0, Lny0/h;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lww1/h;->a()Lm91/u;

    move-result-object p1

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v0, "AddNewMemberButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lnw1/a;->a:Lfi0/a;

    invoke-static {p1}, Lnw1/c;->b(Lfi0/a;)V

    return-void

    :cond_0
    const-string v0, "AddExistingMemberButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lnw1/a;->a:Lfi0/a;

    invoke-static {p1}, Lnw1/c;->a(Lfi0/a;)V

    return-void

    :cond_1
    instance-of p1, v0, Luw1/h;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lnw1/a;->a:Lfi0/a;

    invoke-static {p1}, Lnw1/c;->c(Lfi0/a;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final a(Lww1/a;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "event"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lww1/o;

    const-string v3, "none"

    const-string v4, "family_size"

    const-string v5, "fp hub"

    const-string v6, "screen_name"

    if-eqz v2, :cond_2

    check-cast v1, Lww1/o;

    invoke-virtual {v1}, Lww1/o;->a()Luw1/c$c;

    move-result-object v1

    invoke-static {v1}, Lnw1/b;->b(Luw1/c$c;)Ljava/lang/Integer;

    move-result-object v1

    iget-object v7, v0, Lnw1/a;->a:Lfi0/a;

    new-instance v2, Ll83/k;

    invoke-direct {v2, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :cond_1
    :goto_0
    new-instance v1, Ll83/k;

    invoke-direct {v1, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v1}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v13

    const/16 v14, 0x11

    const/4 v15, 0x0

    const/4 v8, 0x0

    const-string v9, "view"

    const-string v10, "screen"

    const-string v11, "Manage Family Plan"

    const/4 v12, 0x0

    invoke-static/range {v7 .. v15}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_2
    instance-of v2, v1, Lww1/p;

    const-string v7, "add existing member"

    const-string v8, "add new member"

    if-eqz v2, :cond_4

    check-cast v1, Lww1/p;

    invoke-virtual {v1}, Lww1/p;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    move-object v7, v8

    :cond_3
    iget-object v8, v0, Lnw1/a;->a:Lfi0/a;

    invoke-static {v6, v7}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x11

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "view"

    const-string v11, "screen"

    const-string v12, "Manage Family Plan"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_4
    instance-of v2, v1, Lww1/n;

    if-eqz v2, :cond_5

    iget-object v9, v0, Lnw1/a;->a:Lfi0/a;

    invoke-static {v6, v7}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v15

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/4 v10, 0x0

    const-string v11, "view"

    const-string v12, "modal"

    const-string v13, "Manage Family Plan"

    const-string v14, "invite confirmation"

    invoke-static/range {v9 .. v17}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_5
    instance-of v2, v1, Lww1/k;

    if-eqz v2, :cond_a

    check-cast v1, Lww1/k;

    invoke-virtual {v1}, Lww1/k;->a()Luw1/c$c;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {v2}, Lnw1/b;->b(Luw1/c$c;)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :cond_6
    const/4 v2, 0x0

    :goto_1
    iget-object v9, v0, Lnw1/a;->a:Lfi0/a;

    invoke-virtual {v1}, Lww1/k;->b()Z

    move-result v1

    if-eqz v1, :cond_7

    move-object v14, v8

    goto :goto_2

    :cond_7
    move-object v14, v7

    :goto_2
    new-instance v1, Ll83/k;

    invoke-direct {v1, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_8

    goto :goto_3

    :cond_8
    move-object v3, v2

    :cond_9
    :goto_3
    new-instance v2, Ll83/k;

    invoke-direct {v2, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v15

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/4 v10, 0x0

    const-string v11, "tap"

    const-string v12, "cta"

    const-string v13, "Manage Family Plan"

    invoke-static/range {v9 .. v17}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_a
    sget-object v2, Lww1/j;->a:Lww1/j;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v9, v0, Lnw1/a;->a:Lfi0/a;

    invoke-static {v6, v8}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v15

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/4 v10, 0x0

    const-string v11, "tap"

    const-string v12, "cta"

    const-string v13, "Manage Family Plan"

    const-string v14, "gift"

    invoke-static/range {v9 .. v17}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_b
    sget-object v2, Lww1/l;->a:Lww1/l;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v9, v0, Lnw1/a;->a:Lfi0/a;

    invoke-static {v6, v8}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v15

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/4 v10, 0x0

    const-string v11, "tap"

    const-string v12, "cta"

    const-string v13, "Manage Family Plan"

    const-string v14, "RAF"

    invoke-static/range {v9 .. v17}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_c
    sget-object v2, Lww1/b;->a:Lww1/b;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v8, v0, Lnw1/a;->a:Lfi0/a;

    invoke-static {v6, v7}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "tap"

    const-string v11, "cta"

    const-string v12, "Manage Family Plan"

    const-string v13, "invite confirmation continue"

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_d
    sget-object v2, Lww1/i;->a:Lww1/i;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    iget-object v7, v0, Lnw1/a;->a:Lfi0/a;

    invoke-static {v6, v5}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/4 v8, 0x0

    const-string v9, "tap"

    const-string v10, "icon"

    const-string v11, "Manage Family Plan"

    const-string v12, "remove member"

    invoke-static/range {v7 .. v15}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_e
    instance-of v2, v1, Lww1/d$c;

    const-string v3, "remove member"

    if-eqz v2, :cond_f

    iget-object v7, v0, Lnw1/a;->a:Lfi0/a;

    invoke-static {v6, v3}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/4 v8, 0x0

    const-string v9, "tap"

    const-string v10, "modal"

    const-string v11, "Manage Family Plan"

    const-string v12, "confirm removal"

    invoke-static/range {v7 .. v15}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_f
    sget-object v2, Lww1/d$a;->a:Lww1/d$a;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    iget-object v7, v0, Lnw1/a;->a:Lfi0/a;

    invoke-static {v6, v3}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/4 v8, 0x0

    const-string v9, "tap"

    const-string v10, "modal"

    const-string v11, "Manage Family Plan"

    const-string v12, "back"

    invoke-static/range {v7 .. v15}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_10
    sget-object v2, Lww1/m;->a:Lww1/m;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    iget-object v7, v0, Lnw1/a;->a:Lfi0/a;

    invoke-static {v6, v5}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/4 v8, 0x0

    const-string v9, "tap"

    const-string v10, "icon"

    const-string v11, "Manage Family Plan"

    const-string v12, "back"

    invoke-static/range {v7 .. v15}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_11
    instance-of v2, v1, Lww1/h;

    if-eqz v2, :cond_12

    check-cast v1, Lww1/h;

    invoke-direct {v0, v1}, Lnw1/a;->b(Lww1/h;)V

    return-void

    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
