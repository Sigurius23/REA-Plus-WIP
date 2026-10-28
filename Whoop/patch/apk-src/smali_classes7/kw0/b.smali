.class public final Lkw0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lkw0/b;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "",
        "sleepId",
        "<init>",
        "(Leb/a0;Lj02/o0;Ljava/lang/String;)V",
        "Lkw0/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lkw0/a;)V",
        "Leb/a0;",
        "b",
        "Lj02/o0;",
        "c",
        "Ljava/lang/String;",
        "core-details_release"
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
.field private final a:Leb/a0;

.field private final b:Lj02/o0;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;Ljava/lang/String;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkw0/b;->a:Leb/a0;

    iput-object p2, p0, Lkw0/b;->b:Lj02/o0;

    iput-object p3, p0, Lkw0/b;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lkw0/a;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "event"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lkw0/a$a;->a:Lkw0/a$a;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v0, Lkw0/b;->a:Leb/a0;

    invoke-virtual {v1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v2, v1, Lkw0/a$b;

    if-eqz v2, :cond_1

    iget-object v2, v0, Lkw0/b;->b:Lj02/o0;

    new-instance v3, Lj02/m0$z;

    check-cast v1, Lkw0/a$b;

    invoke-virtual {v1}, Lkw0/a$b;->a()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Lkw0/b;->c:Ljava/lang/String;

    sget-object v1, Ls01/a;->SLEEP_ACTIVITY:Ls01/a;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    const/16 v16, 0xfc3

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v8, "VoW_Sleep_Details"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v3 .. v17}, Lj02/m0$z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_1
    instance-of v2, v1, Lkw0/a$c;

    if-eqz v2, :cond_3

    iget-object v2, v0, Lkw0/b;->b:Lj02/o0;

    check-cast v1, Lkw0/a$c;

    invoke-virtual {v1}, Lkw0/a$c;->a()Lorg/joda/time/LocalDateTime;

    move-result-object v4

    invoke-virtual {v1}, Lkw0/a$c;->c()Lorg/joda/time/LocalDateTime;

    move-result-object v5

    invoke-virtual {v1}, Lkw0/a$c;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lkw0/a$c;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Nap"

    :goto_0
    move-object v6, v1

    goto :goto_1

    :cond_2
    const-string v1, "Sleep"

    goto :goto_0

    :goto_1
    new-instance v3, Lj02/m0$c1;

    const/16 v11, 0x60

    const/4 v12, 0x0

    const-string v7, "Sleep"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lj02/m0$c1;-><init>(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_3
    instance-of v2, v1, Lkw0/a$d;

    if-eqz v2, :cond_4

    iget-object v2, v0, Lkw0/b;->b:Lj02/o0;

    check-cast v1, Lkw0/a$d;

    invoke-virtual {v1}, Lkw0/a$d;->a()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-interface {v2, v1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
