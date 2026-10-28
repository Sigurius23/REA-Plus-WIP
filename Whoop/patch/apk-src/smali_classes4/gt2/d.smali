.class public final Lgt2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\r\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lgt2/d;",
        "",
        "<init>",
        "()V",
        "Lct2/b;",
        "domainResult",
        "Lgt2/c;",
        "a",
        "(Lct2/b;)Lgt2/c;",
        "Ljb1/a;",
        "Ljb1/a;",
        "getReducer",
        "()Ljb1/a;",
        "reducer",
        "weekly-plan_release"
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
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lgt2/d;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lgt2/a;->e()Ljb1/a;

    move-result-object v0

    iput-object v0, p0, Lgt2/d;->a:Ljb1/a;

    return-void
.end method


# virtual methods
.method public final a(Lct2/b;)Lgt2/c;
    .locals 11

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lct2/b$b;

    if-eqz v0, :cond_0

    sget-object p1, Lgt2/c$b;->b:Lgt2/c$b;

    return-object p1

    :cond_0
    instance-of v0, p1, Lct2/b$a;

    if-eqz v0, :cond_1

    new-instance v0, Lgt2/c$a;

    check-cast p1, Lct2/b$a;

    invoke-virtual {p1}, Lct2/b$a;->a()Ljava/time/LocalDate;

    move-result-object p1

    invoke-direct {v0, p1}, Lgt2/c$a;-><init>(Ljava/time/LocalDate;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lct2/b$c;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lgt2/d;->a:Ljb1/a;

    check-cast p1, Lct2/b$c;

    invoke-virtual {p1}, Lct2/b$c;->a()Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometileResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometileResponse;->getTile()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p1

    instance-of v0, p1, Lht2/a;

    if-eqz v0, :cond_2

    move-object v1, p1

    check-cast v1, Lht2/a;

    sget-object v2, Lht2/h;->SUCCESS:Lht2/h;

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lht2/a;->b(Lht2/a;Lht2/h;ZLjava/lang/String;Ljava/lang/String;Lht2/g;Ljava/util/List;Lny0/h;ILjava/lang/Object;)Lht2/a;

    move-result-object p1

    :cond_2
    new-instance v0, Lgt2/c$c;

    invoke-direct {v0, p1}, Lgt2/c$c;-><init>(Lm91/u;)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
