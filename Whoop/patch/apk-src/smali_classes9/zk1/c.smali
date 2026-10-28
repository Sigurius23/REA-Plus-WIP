.class public final Lzk1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lzk1/c;",
        "",
        "Leb/u0;",
        "navController",
        "Lor2/y;",
        "externalLinkNavigator",
        "Lg/l;",
        "activity",
        "Lj02/o0;",
        "navigator",
        "<init>",
        "(Leb/u0;Lor2/y;Lg/l;Lj02/o0;)V",
        "Lzk1/b;",
        "navEvent",
        "",
        "a",
        "(Lzk1/b;)Z",
        "Leb/u0;",
        "b",
        "Lor2/y;",
        "c",
        "Lg/l;",
        "d",
        "Lj02/o0;",
        "help-center_release"
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
.field private final a:Leb/u0;

.field private final b:Lor2/y;

.field private final c:Lg/l;

.field private final d:Lj02/o0;


# direct methods
.method public constructor <init>(Leb/u0;Lor2/y;Lg/l;Lj02/o0;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalLinkNavigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzk1/c;->a:Leb/u0;

    iput-object p2, p0, Lzk1/c;->b:Lor2/y;

    iput-object p3, p0, Lzk1/c;->c:Lg/l;

    iput-object p4, p0, Lzk1/c;->d:Lj02/o0;

    return-void
.end method


# virtual methods
.method public final a(Lzk1/b;)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "navEvent"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lzk1/b$b;

    if-eqz v2, :cond_0

    iget-object v2, v0, Lzk1/c;->a:Leb/u0;

    check-cast v1, Lzk1/b$b;

    invoke-virtual {v1}, Lzk1/b$b;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {v2, v1, v3, v4}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    goto :goto_0

    :cond_0
    instance-of v2, v1, Lzk1/b$c;

    if-eqz v2, :cond_1

    iget-object v3, v0, Lzk1/c;->b:Lor2/y;

    iget-object v4, v0, Lzk1/c;->c:Lg/l;

    check-cast v1, Lzk1/b$c;

    invoke-virtual {v1}, Lzk1/b$c;->a()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    instance-of v2, v1, Lzk1/b$a;

    if-eqz v2, :cond_2

    iget-object v1, v0, Lzk1/c;->c:Lg/l;

    invoke-virtual {v1}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object v1

    invoke-virtual {v1}, Lg/z;->d()V

    goto :goto_0

    :cond_2
    sget-object v2, Lzk1/b$d;->a:Lzk1/b$d;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lzk1/c;->d:Lj02/o0;

    new-instance v2, Lj02/m0$z;

    sget-object v3, Ls01/a;->HELP_CENTER:Ls01/a;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    const/16 v15, 0xfcf

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "Help Center"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v2 .. v16}, Lj02/m0$z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    :goto_0
    const/4 v1, 0x1

    return v1

    :cond_3
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
