.class public final Lcom/whoop/membership/view/upcycle/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/membership/view/upcycle/a$a;,
        Lcom/whoop/membership/view/upcycle/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000b\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/membership/view/upcycle/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lqx1/e$c;",
        "viewState",
        "Lcom/whoop/membership/view/upcycle/a$b;",
        "analyticEvent",
        "Ll83/a0;",
        "a",
        "(Lqx1/e$c;Lcom/whoop/membership/view/upcycle/a$b;)V",
        "Lfi0/a;",
        "b",
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


# static fields
.field public static final b:Lcom/whoop/membership/view/upcycle/a$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/membership/view/upcycle/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/membership/view/upcycle/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/membership/view/upcycle/a;->b:Lcom/whoop/membership/view/upcycle/a$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/membership/view/upcycle/a;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/membership/view/upcycle/a;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(Lqx1/e$c;Lcom/whoop/membership/view/upcycle/a$b;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "viewState"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "analyticEvent"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lcom/whoop/membership/view/upcycle/a$b$b;

    const-string v4, "upcycle_offer"

    const-string v5, "no"

    const-string v6, "yes"

    const-string v7, "upcycle_kit"

    if-eqz v2, :cond_1

    iget-object v8, v0, Lcom/whoop/membership/view/upcycle/a;->a:Lfi0/a;

    invoke-virtual {v3}, Lqx1/e$c;->a()Lqx1/d;

    move-result-object v1

    invoke-virtual {v1}, Lqx1/d;->a()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lqx1/e$c;->a()Lqx1/d;

    move-result-object v1

    invoke-virtual {v1}, Lqx1/d;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v5, v6

    :cond_0
    new-instance v1, Ll83/k;

    invoke-direct {v1, v7, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lqx1/e$c;->a()Lqx1/d;

    move-result-object v2

    invoke-virtual {v2}, Lqx1/d;->c()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v3}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x14

    const/16 v16, 0x0

    const-string v10, "View"

    const/4 v11, 0x0

    const-string v12, "In App Upcycle Screen"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_1
    instance-of v2, v1, Lcom/whoop/membership/view/upcycle/a$b$a;

    if-eqz v2, :cond_3

    iget-object v8, v0, Lcom/whoop/membership/view/upcycle/a;->a:Lfi0/a;

    invoke-virtual {v3}, Lqx1/e$c;->a()Lqx1/d;

    move-result-object v2

    invoke-virtual {v2}, Lqx1/d;->a()Ljava/lang/String;

    move-result-object v9

    check-cast v1, Lcom/whoop/membership/view/upcycle/a$b$a;

    invoke-virtual {v1}, Lcom/whoop/membership/view/upcycle/a$b$a;->a()Lqx1/a;

    move-result-object v1

    invoke-virtual {v1}, Lqx1/a;->a()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3}, Lqx1/e$c;->a()Lqx1/d;

    move-result-object v1

    invoke-virtual {v1}, Lqx1/d;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v5, v6

    :cond_2
    new-instance v1, Ll83/k;

    invoke-direct {v1, v7, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lqx1/e$c;->a()Lqx1/d;

    move-result-object v2

    invoke-virtual {v2}, Lqx1/d;->c()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v3}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v13

    const-string v10, "Click CTA"

    const-string v12, "In App Upcycle Screen"

    invoke-interface/range {v8 .. v13}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_3
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
