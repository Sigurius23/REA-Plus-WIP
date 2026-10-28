.class public final Lyn0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lyn0/c;",
        "",
        "Leb/a0;",
        "navController",
        "Lz92/a;",
        "userInfoAccessor",
        "Lj02/o0;",
        "navigator",
        "Lo02/d;",
        "navigationReducer",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "<init>",
        "(Leb/a0;Lz92/a;Lj02/o0;Lo02/d;Lj02/i0;)V",
        "Lyn0/b;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lyn0/b;Lq83/d;)Ljava/lang/Object;",
        "Leb/a0;",
        "b",
        "Lz92/a;",
        "c",
        "Lj02/o0;",
        "d",
        "Lo02/d;",
        "e",
        "Lj02/i0;",
        "change-password_release"
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

.field private final b:Lz92/a;

.field private final c:Lj02/o0;

.field private final d:Lo02/d;

.field private final e:Lj02/i0;


# direct methods
.method public constructor <init>(Leb/a0;Lz92/a;Lj02/o0;Lo02/d;Lj02/i0;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userInfoAccessor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationReducer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lyn0/c;->a:Leb/a0;

    .line 3
    iput-object p2, p0, Lyn0/c;->b:Lz92/a;

    .line 4
    iput-object p3, p0, Lyn0/c;->c:Lj02/o0;

    .line 5
    iput-object p4, p0, Lyn0/c;->d:Lo02/d;

    .line 6
    iput-object p5, p0, Lyn0/c;->e:Lj02/i0;

    return-void
.end method

.method public synthetic constructor <init>(Leb/a0;Lz92/a;Lj02/o0;Lo02/d;Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 7
    new-instance p5, Lj02/i0;

    invoke-direct {p5}, Lj02/i0;-><init>()V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lyn0/c;-><init>(Leb/a0;Lz92/a;Lj02/o0;Lo02/d;Lj02/i0;)V

    return-void
.end method


# virtual methods
.method public final a(Lyn0/b;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyn0/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lyn0/c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lyn0/c$a;

    iget v1, v0, Lyn0/c$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyn0/c$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lyn0/c$a;

    invoke-direct {v0, p0, p2}, Lyn0/c$a;-><init>(Lyn0/c;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lyn0/c$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lyn0/c$a;->z:I

    const/4 v4, 0x1

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lyn0/c$a;->w:Ljava/lang/Object;

    check-cast p1, Lyn0/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Lyn0/b$d;

    if-eqz p2, :cond_5

    iput-object v3, v0, Lyn0/c$a;->w:Ljava/lang/Object;

    iput v4, v0, Lyn0/c$a;->z:I

    const-wide/16 p1, 0x3e8

    invoke-static {p1, p2, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object p1, p0, Lyn0/c;->b:Lz92/a;

    invoke-interface {p1}, Lz92/a;->d()Lcom/whoop/domain/model/User;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lyn0/c;->d:Lo02/d;

    new-instance p2, Lcom/whoop/navigation/HomeScreenModel;

    const/4 v0, 0x3

    invoke-direct {p2, v3, v3, v0, v3}, Lcom/whoop/navigation/HomeScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p2}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object p1

    instance-of p2, p1, Lj02/m0;

    if-eqz p2, :cond_a

    iget-object p2, p0, Lyn0/c;->c:Lj02/o0;

    check-cast p1, Lj02/m0;

    invoke-interface {p2, p1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    goto :goto_3

    :cond_4
    iget-object p1, p0, Lyn0/c;->e:Lj02/i0;

    const-string p2, "android-app://com.whoop/activation?startScreen=START_SCREEN"

    invoke-virtual {p1, p2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object p2, p0, Lyn0/c;->a:Leb/a0;

    invoke-virtual {p2}, Leb/a0;->k()Leb/r0;

    move-result-object p2

    iget v6, p2, Leb/n0;->H:I

    new-instance v3, Leb/x0;

    const/4 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, -0x1

    move v10, v9

    move v11, v9

    move v12, v9

    invoke-direct/range {v3 .. v12}, Leb/x0;-><init>(ZZIZZIIII)V

    iget-object p2, p0, Lyn0/c;->a:Leb/a0;

    invoke-virtual {p2, p1, v3}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    goto :goto_3

    :cond_5
    instance-of p2, p1, Lyn0/b$b;

    if-nez p2, :cond_7

    instance-of p2, p1, Lyn0/b$a;

    if-nez p2, :cond_7

    instance-of p1, p1, Lyn0/b$c;

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_2
    iget-object p1, p0, Lyn0/c;->a:Leb/a0;

    iget-object p2, p1, Leb/a0;->a:Landroid/content/Context;

    instance-of v0, p2, Landroid/app/Activity;

    if-eqz v0, :cond_8

    move-object v3, p2

    check-cast v3, Landroid/app/Activity;

    :cond_8
    if-eqz v3, :cond_9

    invoke-virtual {v3}, Landroid/app/Activity;->finish()V

    goto :goto_3

    :cond_9
    invoke-virtual {p1}, Leb/a0;->z()Z

    :cond_a
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
