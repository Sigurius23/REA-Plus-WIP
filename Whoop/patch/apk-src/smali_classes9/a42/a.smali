.class public final La42/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "La42/a;",
        "",
        "Landroid/app/Activity;",
        "activity",
        "Leb/a0;",
        "globalNavController",
        "Leb/u0;",
        "composeNavController",
        "Lj02/o0;",
        "navigator",
        "Lor2/y;",
        "externalLinkNavigator",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "<init>",
        "(Landroid/app/Activity;Leb/a0;Leb/u0;Lj02/o0;Lor2/y;Lj02/i0;)V",
        "event",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/Object;)V",
        "Landroid/app/Activity;",
        "b",
        "Leb/a0;",
        "c",
        "Leb/u0;",
        "d",
        "Lj02/o0;",
        "e",
        "Lor2/y;",
        "f",
        "Lj02/i0;",
        "pregnancy_release"
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
.field private final a:Landroid/app/Activity;

.field private final b:Leb/a0;

.field private final c:Leb/u0;

.field private final d:Lj02/o0;

.field private final e:Lor2/y;

.field private final f:Lj02/i0;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Leb/a0;Leb/u0;Lj02/o0;Lor2/y;Lj02/i0;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalNavController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "composeNavController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalLinkNavigator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La42/a;->a:Landroid/app/Activity;

    .line 3
    iput-object p2, p0, La42/a;->b:Leb/a0;

    .line 4
    iput-object p3, p0, La42/a;->c:Leb/u0;

    .line 5
    iput-object p4, p0, La42/a;->d:Lj02/o0;

    .line 6
    iput-object p5, p0, La42/a;->e:Lor2/y;

    .line 7
    iput-object p6, p0, La42/a;->f:Lj02/i0;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Leb/a0;Leb/u0;Lj02/o0;Lor2/y;Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 8
    new-instance p6, Lj02/i0;

    invoke-direct {p6}, Lj02/i0;-><init>()V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, La42/a;-><init>(Landroid/app/Activity;Leb/a0;Leb/u0;Lj02/o0;Lor2/y;Lj02/i0;)V

    return-void
.end method

.method private static final b(Leb/y0;)Ll83/a0;
    .locals 2

    const-string v0, "$this$navOptions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SETTINGS_HOME"

    sget-object v1, Leb/v;->G:Leb/v;

    invoke-virtual {p0, v0, v1}, Leb/y0;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final c(Leb/y0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navOptions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Leb/y0;->b:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 8

    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, La42/a;->d:Lj02/o0;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_0
    sget-object v0, Lcom/whoop/pregnancy/view/a$a;->a:Lcom/whoop/pregnancy/view/a$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, La42/a;->c:Leb/u0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_1
    instance-of v0, p1, Lcom/whoop/pregnancy/view/a$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, La42/a;->d:Lj02/o0;

    new-instance v1, Lj02/m0$w1;

    check-cast p1, Lcom/whoop/pregnancy/view/a$b;

    invoke-virtual {p1}, Lcom/whoop/pregnancy/view/a$b;->a()Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v2, "PREGNANCY_INSIGHTS_DATA_PRIVACY"

    const-string v3, "Pregnancy Settings"

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lj02/m0$w1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_2
    instance-of v0, p1, Lcom/whoop/pregnancy/view/a$c;

    const/4 v1, 0x4

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_5

    check-cast p1, Lcom/whoop/pregnancy/view/a$c;

    invoke-virtual {p1}, Lcom/whoop/pregnancy/view/a$c;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Leb/y0;

    invoke-direct {v0}, Leb/y0;-><init>()V

    invoke-static {v0}, La42/a;->b(Leb/y0;)Ll83/a0;

    iget-boolean v4, v0, Leb/y0;->b:Z

    iget-object v5, v0, Leb/y0;->a:Leb/w0;

    iput-boolean v4, v5, Leb/w0;->a:Z

    iget-boolean v4, v0, Leb/y0;->c:Z

    iput-boolean v4, v5, Leb/w0;->b:Z

    iget-object v4, v0, Leb/y0;->e:Ljava/lang/String;

    if-eqz v4, :cond_3

    iget-boolean v3, v0, Leb/y0;->f:Z

    iget-boolean v0, v0, Leb/y0;->g:Z

    iput-object v4, v5, Leb/w0;->d:Ljava/lang/String;

    iput v2, v5, Leb/w0;->c:I

    iput-boolean v3, v5, Leb/w0;->e:Z

    iput-boolean v0, v5, Leb/w0;->f:Z

    goto :goto_0

    :cond_3
    iget v2, v0, Leb/y0;->d:I

    iget-boolean v4, v0, Leb/y0;->f:Z

    iget-boolean v0, v0, Leb/y0;->g:Z

    iput v2, v5, Leb/w0;->c:I

    iput-object v3, v5, Leb/w0;->d:Ljava/lang/String;

    iput-boolean v4, v5, Leb/w0;->e:Z

    iput-boolean v0, v5, Leb/w0;->f:Z

    :goto_0
    invoke-virtual {v5}, Leb/w0;->a()Leb/x0;

    move-result-object v3

    :cond_4
    iget-object v0, p0, La42/a;->c:Leb/u0;

    invoke-virtual {p1}, Lcom/whoop/pregnancy/view/a$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v3, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_5
    sget-object v0, Lcom/whoop/pregnancy/view/a$d;->a:Lcom/whoop/pregnancy/view/a$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object p1, p0, La42/a;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    iget-object p1, p0, La42/a;->d:Lj02/o0;

    new-instance v0, Lj02/m0$q3;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lj02/m0$q3;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_6
    instance-of v0, p1, Lcom/whoop/pregnancy/view/a$e;

    if-eqz v0, :cond_7

    iget-object v0, p0, La42/a;->f:Lj02/i0;

    check-cast p1, Lcom/whoop/pregnancy/view/a$e;

    invoke-virtual {p1}, Lcom/whoop/pregnancy/view/a$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, La42/a;->b:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v0, p0, La42/a;->b:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_7
    instance-of v0, p1, Lcom/whoop/pregnancy/view/a$f;

    if-eqz v0, :cond_8

    iget-object v0, p0, La42/a;->b:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    check-cast p1, Lcom/whoop/pregnancy/view/a$f;

    invoke-virtual {p1}, Lcom/whoop/pregnancy/view/a$f;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "pregInsights"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p1}, Lcom/whoop/pregnancy/view/a$f;->b()Z

    move-result p1

    if-nez p1, :cond_b

    iget-object p1, p0, La42/a;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_8
    sget-object v0, Lcom/whoop/pregnancy/view/a$g;->a:Lcom/whoop/pregnancy/view/a$g;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object p1, p0, La42/a;->c:Leb/u0;

    new-instance v0, Leb/y0;

    invoke-direct {v0}, Leb/y0;-><init>()V

    invoke-static {v0}, La42/a;->c(Leb/y0;)Ll83/a0;

    iget-boolean v4, v0, Leb/y0;->b:Z

    iget-object v5, v0, Leb/y0;->a:Leb/w0;

    iput-boolean v4, v5, Leb/w0;->a:Z

    iget-boolean v4, v0, Leb/y0;->c:Z

    iput-boolean v4, v5, Leb/w0;->b:Z

    iget-object v4, v0, Leb/y0;->e:Ljava/lang/String;

    if-eqz v4, :cond_9

    iget-boolean v3, v0, Leb/y0;->f:Z

    iget-boolean v0, v0, Leb/y0;->g:Z

    iput-object v4, v5, Leb/w0;->d:Ljava/lang/String;

    iput v2, v5, Leb/w0;->c:I

    iput-boolean v3, v5, Leb/w0;->e:Z

    iput-boolean v0, v5, Leb/w0;->f:Z

    goto :goto_1

    :cond_9
    iget v2, v0, Leb/y0;->d:I

    iget-boolean v4, v0, Leb/y0;->f:Z

    iget-boolean v0, v0, Leb/y0;->g:Z

    iput v2, v5, Leb/w0;->c:I

    iput-object v3, v5, Leb/w0;->d:Ljava/lang/String;

    iput-boolean v4, v5, Leb/w0;->e:Z

    iput-boolean v0, v5, Leb/w0;->f:Z

    :goto_1
    invoke-virtual {v5}, Leb/w0;->a()Leb/x0;

    move-result-object v0

    const-string v2, "SETTINGS_HOME"

    invoke-static {p1, v2, v0, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_a
    instance-of v0, p1, Lcom/whoop/pregnancy/view/a$h;

    if-eqz v0, :cond_b

    iget-object v0, p0, La42/a;->c:Leb/u0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v1, p0, La42/a;->e:Lor2/y;

    iget-object v2, p0, La42/a;->a:Landroid/app/Activity;

    check-cast p1, Lcom/whoop/pregnancy/view/a$h;

    invoke-virtual {p1}, Lcom/whoop/pregnancy/view/a$h;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    :cond_b
    return-void
.end method
