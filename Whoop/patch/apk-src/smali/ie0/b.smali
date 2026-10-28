.class public final Lie0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lie0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\rB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lie0/b;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Leb/a0;Lj02/o0;Ltr2/n;)V",
        "Lie0/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lie0/a;)V",
        "Leb/a0;",
        "b",
        "Lj02/o0;",
        "c",
        "Ltr2/n;",
        "d",
        "advanced-labs_release"
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
.field public static final d:Lie0/b$a;

.field public static final e:I


# instance fields
.field private final a:Leb/a0;

.field private final b:Lj02/o0;

.field private final c:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lie0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lie0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lie0/b;->d:Lie0/b$a;

    const/16 v0, 0x8

    sput v0, Lie0/b;->e:I

    return-void
.end method

.method public constructor <init>(Leb/a0;Lj02/o0;Ltr2/n;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lie0/b;->a:Leb/a0;

    .line 3
    iput-object p2, p0, Lie0/b;->b:Lj02/o0;

    .line 4
    iput-object p3, p0, Lie0/b;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Leb/a0;Lj02/o0;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "SchedulingStepNavigationRouter"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lie0/b;-><init>(Leb/a0;Lj02/o0;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Lie0/a;)V
    .locals 10

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lie0/a$a;

    if-nez v0, :cond_2

    instance-of v0, p1, Lie0/a$b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lie0/a$c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lie0/b;->b:Lj02/o0;

    check-cast p1, Lie0/a$c;

    invoke-virtual {p1}, Lie0/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget-object p1, p0, Lie0/b;->a:Leb/a0;

    new-instance v0, Lcom/whoop/navigation/PopUpToModel;

    new-instance v1, Lcom/whoop/navigation/e;

    sget-object v2, Lcom/whoop/navigation/AppScreen$a0;->w:Lcom/whoop/navigation/AppScreen$a0;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/whoop/navigation/PopUpToModel;-><init>(ZLcom/whoop/navigation/e;)V

    iget-object v1, p0, Lie0/b;->c:Ltr2/n;

    invoke-static {p1, v0, v3, v1}, Lcom/whoop/navigation/d;->d(Leb/a0;Lcom/whoop/navigation/PopUpToModel;Ljava/lang/Integer;Ltr2/n;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lie0/b;->a:Leb/a0;

    new-instance v4, Lcom/whoop/navigation/e;

    sget-object v5, Lcom/whoop/navigation/AppScreen$q2;->w:Lcom/whoop/navigation/AppScreen$q2;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, v4, v2}, Lcom/whoop/navigation/d;->g(Leb/a0;Lcom/whoop/navigation/e;Z)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lie0/b;->a:Leb/a0;

    new-instance v4, Lcom/whoop/navigation/e;

    sget-object v5, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, v4, v2}, Lcom/whoop/navigation/d;->g(Leb/a0;Lcom/whoop/navigation/e;Z)Z

    :cond_3
    iget-object p1, p0, Lie0/b;->b:Lj02/o0;

    new-instance v0, Lj02/m0$p;

    const-string v1, "scheduling_step"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2, v3}, Lj02/m0$p;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    :cond_4
    return-void
.end method
