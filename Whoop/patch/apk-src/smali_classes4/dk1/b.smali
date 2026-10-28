.class public final Ldk1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldk1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u000eJ\u001f\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u000eJG\u0010\"\u001a\u00020\u00082\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010 \u001a\u00020\u000b2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u0015\u0010&\u001a\u00020\u00082\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008&\u0010\'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Ldk1/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "",
        "isLocked",
        "Ll83/a0;",
        "j",
        "(Z)V",
        "",
        "name",
        "h",
        "(Ljava/lang/String;)V",
        "c",
        "()V",
        "Lcom/whoop/navigation/e;",
        "location",
        "g",
        "(Lcom/whoop/navigation/e;)V",
        "b",
        "d",
        "source",
        "k",
        "isExpanded",
        "category",
        "i",
        "(ZLjava/lang/String;)V",
        "a",
        "action",
        "label",
        "eventName",
        "value",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "Ldk1/a;",
        "event",
        "l",
        "(Ldk1/a;)V",
        "Lfi0/a;",
        "healthspan_release"
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
.field public static final b:Ldk1/b$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldk1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldk1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldk1/b;->b:Ldk1/b$a;

    const/16 v0, 0x8

    sput v0, Ldk1/b;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldk1/b;->a:Lfi0/a;

    return-void
.end method

.method private final a(Ljava/lang/String;)V
    .locals 8

    const/16 v6, 0x10

    const/4 v7, 0x0

    const-string v2, "CTA"

    const-string v3, "advanced_labs_card"

    const-string v4, "Healthspan"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Ldk1/b;->f(Ldk1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final b()V
    .locals 8

    const/16 v6, 0x10

    const/4 v7, 0x0

    const-string v1, "healthspan"

    const-string v2, "Click"

    const-string v3, "create_custom_plan"

    const-string v4, "Weekly Plan"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Ldk1/b;->f(Ldk1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final c()V
    .locals 8

    const/16 v6, 0x11

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v2, "dismiss"

    const-string v3, "Calibration"

    const-string v4, "Healthspan"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Ldk1/b;->f(Ldk1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final d()V
    .locals 8

    const/16 v6, 0x10

    const/4 v7, 0x0

    const-string v1, "healthspan"

    const-string v2, "Click"

    const-string v3, "edit_current_plan"

    const-string v4, "Weekly Plan"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Ldk1/b;->f(Ldk1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Ldk1/b;->a:Lfi0/a;

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic f(Ldk1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    move-object p5, v0

    :cond_3
    invoke-direct/range {p0 .. p5}, Ldk1/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final g(Lcom/whoop/navigation/e;)V
    .locals 8

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p1

    instance-of p1, p1, Lcom/whoop/navigation/AppScreen$l6;

    if-eqz p1, :cond_0

    const-string p1, "view_plan"

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_0
    const-string p1, "start_plan"

    goto :goto_0

    :goto_1
    const/16 v6, 0x10

    const/4 v7, 0x0

    const-string v2, "CTA"

    const-string v3, "VoW"

    const-string v4, "Healthspan"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Ldk1/b;->f(Ldk1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final h(Ljava/lang/String;)V
    .locals 8

    const/16 v6, 0x10

    const/4 v7, 0x0

    const-string v2, "Open"

    const-string v3, "Contributor"

    const-string v4, "Healthspan"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Ldk1/b;->f(Ldk1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final i(ZLjava/lang/String;)V
    .locals 8

    if-eqz p1, :cond_0

    const-string p1, "Open"

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_0
    const-string p1, "close"

    goto :goto_0

    :goto_1
    const/16 v6, 0x10

    const/4 v7, 0x0

    const-string v3, "advanced_labs_card"

    const-string v4, "Healthspan"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p2

    invoke-static/range {v0 .. v7}, Ldk1/b;->f(Ldk1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final j(Z)V
    .locals 8

    if-eqz p1, :cond_0

    const-string p1, "Locked"

    :goto_0
    move-object v3, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    const/16 v6, 0x11

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v2, "View"

    const-string v4, "Healthspan"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Ldk1/b;->f(Ldk1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final k(Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Ldk1/b;->a:Lfi0/a;

    const-string v1, "source"

    invoke-static {v1, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const-string v1, "main_screen"

    const-string v2, "View"

    const-string v3, "education"

    const-string v4, "Healthspan"

    const/4 v5, 0x0

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final l(Ldk1/a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ldk1/a$i;

    if-eqz v0, :cond_0

    check-cast p1, Ldk1/a$i;

    invoke-virtual {p1}, Ldk1/a$i;->a()Z

    move-result p1

    invoke-direct {p0, p1}, Ldk1/b;->j(Z)V

    return-void

    :cond_0
    instance-of v0, p1, Ldk1/a$f;

    if-eqz v0, :cond_1

    check-cast p1, Ldk1/a$f;

    invoke-virtual {p1}, Ldk1/a$f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ldk1/b;->h(Ljava/lang/String;)V

    return-void

    :cond_1
    sget-object v0, Ldk1/a$c;->a:Ldk1/a$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Ldk1/b;->c()V

    return-void

    :cond_2
    instance-of v0, p1, Ldk1/a$e;

    if-eqz v0, :cond_3

    check-cast p1, Ldk1/a$e;

    invoke-virtual {p1}, Ldk1/a$e;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Ldk1/b;->g(Lcom/whoop/navigation/e;)V

    return-void

    :cond_3
    sget-object v0, Ldk1/a$b;->a:Ldk1/a$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0}, Ldk1/b;->b()V

    return-void

    :cond_4
    sget-object v0, Ldk1/a$d;->a:Ldk1/a$d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-direct {p0}, Ldk1/b;->d()V

    return-void

    :cond_5
    instance-of v0, p1, Ldk1/a$h;

    if-eqz v0, :cond_6

    check-cast p1, Ldk1/a$h;

    invoke-virtual {p1}, Ldk1/a$h;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ldk1/b;->k(Ljava/lang/String;)V

    return-void

    :cond_6
    instance-of v0, p1, Ldk1/a$g;

    if-eqz v0, :cond_7

    check-cast p1, Ldk1/a$g;

    invoke-virtual {p1}, Ldk1/a$g;->b()Z

    move-result v0

    invoke-virtual {p1}, Ldk1/a$g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Ldk1/b;->i(ZLjava/lang/String;)V

    return-void

    :cond_7
    instance-of v0, p1, Ldk1/a$a;

    if-eqz v0, :cond_8

    check-cast p1, Ldk1/a$a;

    invoke-virtual {p1}, Ldk1/a$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ldk1/b;->a(Ljava/lang/String;)V

    return-void

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
