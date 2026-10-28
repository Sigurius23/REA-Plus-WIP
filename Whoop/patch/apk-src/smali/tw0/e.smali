.class public final Ltw0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ/\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001c\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Ltw0/e;",
        "",
        "Ltw0/a;",
        "bottomSheetReducer",
        "<init>",
        "(Ltw0/a;)V",
        "Lsw0/e;",
        "domainState",
        "Luw0/p;",
        "d",
        "(Lsw0/e;)Luw0/p;",
        "Lsw0/g;",
        "result",
        "",
        "performFuzzySearch",
        "",
        "Lsw0/j;",
        "removedWeeklyPlanBehaviors",
        "c",
        "(Lsw0/g;Ljava/lang/String;Ljava/util/List;)Luw0/p;",
        "bottomSheet",
        "Lkm0/e;",
        "b",
        "(Lsw0/g;Ljava/lang/String;Ljava/util/List;)Lkm0/e;",
        "Lsw0/c;",
        "fullScreenModal",
        "e",
        "(Lsw0/c;)Luw0/p;",
        "a",
        "Ltw0/a;",
        "custombottomsheet_release"
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
.field private final a:Ltw0/a;


# direct methods
.method public constructor <init>(Ltw0/a;)V
    .locals 1

    const-string v0, "bottomSheetReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltw0/e;->a:Ltw0/a;

    return-void
.end method

.method private final b(Lsw0/g;Ljava/lang/String;Ljava/util/List;)Lkm0/e;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw0/g;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lsw0/j;",
            ">;)",
            "Lkm0/e;"
        }
    .end annotation

    iget-object v0, p0, Ltw0/e;->a:Ltw0/a;

    invoke-virtual {v0, p1}, Ltw0/a;->b(Lsw0/g;)Ljava/util/List;

    move-result-object v3

    iget-object v0, p0, Ltw0/e;->a:Ltw0/a;

    invoke-virtual {v0, p1}, Ltw0/a;->c(Lsw0/g;)Ljava/util/List;

    move-result-object v4

    iget-object v1, p0, Ltw0/e;->a:Ltw0/a;

    move-object v2, p1

    move-object v5, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Ltw0/a;->e(Lsw0/g;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lkm0/e;

    move-result-object p1

    return-object p1
.end method

.method private final c(Lsw0/g;Ljava/lang/String;Ljava/util/List;)Luw0/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw0/g;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lsw0/j;",
            ">;)",
            "Luw0/p;"
        }
    .end annotation

    new-instance v0, Luw0/p;

    invoke-direct {p0, p1, p2, p3}, Ltw0/e;->b(Lsw0/g;Ljava/lang/String;Ljava/util/List;)Lkm0/e;

    move-result-object p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-direct {v0, p3, p1, p2, p3}, Luw0/p;-><init>(Luw0/p$a;Lkm0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final d(Lsw0/e;)Luw0/p;
    .locals 2

    invoke-virtual {p1}, Lsw0/e;->c()Lsw0/g;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Lsw0/c$c;->a:Lsw0/c$c;

    invoke-direct {p0, p1}, Ltw0/e;->e(Lsw0/c;)Luw0/p;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lsw0/e;->c()Lsw0/g;

    move-result-object v0

    invoke-virtual {p1}, Lsw0/e;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lsw0/e;->f()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Ltw0/e;->c(Lsw0/g;Ljava/lang/String;Ljava/util/List;)Luw0/p;

    move-result-object p1

    return-object p1
.end method

.method private final e(Lsw0/c;)Luw0/p;
    .locals 10

    sget-object v0, Lsw0/c$a;->a:Lsw0/c$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Luw0/p;

    new-instance v3, Luw0/p$a;

    sget-object v4, Lsz0/p0$c;->e:Lsz0/p0$c;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Luw0/p$a;-><init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Luw0/p;-><init>(Luw0/p$a;Lkm0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    sget-object v0, Lsw0/c$b;->a:Lsw0/c$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lsw0/c$c;->a:Lsw0/c$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    new-instance p1, Luw0/p;

    new-instance v3, Luw0/p$a;

    new-instance v4, Lsz0/p0$b;

    sget v0, Lpw0/a;->d:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lpw0/a;->c:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    const/16 v8, 0xc

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Luw0/p$a;-><init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Luw0/p;-><init>(Luw0/p$a;Lkm0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method


# virtual methods
.method public final a(Lsw0/e;)Luw0/p;
    .locals 1

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lsw0/e;->d()Lsw0/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lsw0/e;->d()Lsw0/c;

    move-result-object p1

    invoke-direct {p0, p1}, Ltw0/e;->e(Lsw0/c;)Luw0/p;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Ltw0/e;->d(Lsw0/e;)Luw0/p;

    move-result-object p1

    return-object p1
.end method
