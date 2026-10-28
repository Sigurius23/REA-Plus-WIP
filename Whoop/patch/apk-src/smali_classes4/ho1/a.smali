.class public final Lho1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lho1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u000e\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u000cJW\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00082\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0015\u001a\u00020\u00082\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00082\u0016\u0008\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lho1/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "Lyn1/b;",
        "hormonalInsightsAnalyticsHelper",
        "<init>",
        "(Lfi0/a;Lyn1/b;)V",
        "",
        "source",
        "Ll83/a0;",
        "d",
        "(Ljava/lang/String;)V",
        "phaseLabel",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "tabId",
        "e",
        "category",
        "action",
        "label",
        "eventName",
        "value",
        "",
        "otherProperties",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V",
        "Llo1/a$a;",
        "event",
        "f",
        "(Llo1/a$a;)V",
        "Lfi0/a;",
        "b",
        "Lyn1/b;",
        "hormonal-insights_release"
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
.field public static final c:Lho1/a$a;

.field public static final d:I


# instance fields
.field private final a:Lfi0/a;

.field private final b:Lyn1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lho1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lho1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lho1/a;->c:Lho1/a$a;

    const/16 v0, 0x8

    sput v0, Lho1/a;->d:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;Lyn1/b;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lho1/a;->a:Lfi0/a;

    iput-object p2, p0, Lho1/a;->b:Lyn1/b;

    return-void
.end method

.method private final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lho1/a;->a:Lfi0/a;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic b(Lho1/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_2

    move-object p6, v0

    :cond_2
    invoke-direct/range {p0 .. p6}, Lho1/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lho1/a;->b:Lyn1/b;

    if-eqz v0, :cond_0

    sget-object v1, Lyn1/a$i;->a:Lyn1/a$i;

    invoke-virtual {v0, v1}, Lyn1/b;->M(Lyn1/a;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lho1/a;->b:Lyn1/b;

    if-eqz v0, :cond_1

    new-instance v1, Lyn1/a$j;

    invoke-direct {v1, p1, p2}, Lyn1/a$j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lyn1/b;->M(Lyn1/a;)V

    :cond_1
    return-void
.end method

.method private final d(Ljava/lang/String;)V
    .locals 10

    const-string v0, "source"

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x14

    const/4 v9, 0x0

    const-string v2, "symptom_drawer"

    const-string v3, "log_symptom_drawer"

    const/4 v4, 0x0

    const-string v5, "MCI"

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lho1/a;->b(Lho1/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final e(Ljava/lang/String;)V
    .locals 11

    const-string v0, "source"

    const-string v1, "mci"

    invoke-static {v0, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    const/16 v9, 0x10

    const/4 v10, 0x0

    const-string v3, "symptom_drawer"

    const-string v4, "click"

    const-string v6, "MCI"

    const/4 v7, 0x0

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v2 .. v10}, Lho1/a;->b(Lho1/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final f(Llo1/a$a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llo1/a$e;

    if-eqz v0, :cond_0

    check-cast p1, Llo1/a$e;

    invoke-virtual {p1}, Llo1/a$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lho1/a;->d(Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Llo1/a$j;

    if-eqz v0, :cond_1

    check-cast p1, Llo1/a$j;

    invoke-virtual {p1}, Llo1/a$j;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lho1/a;->e(Ljava/lang/String;)V

    return-void

    :cond_1
    instance-of v0, p1, Llo1/a$i;

    if-eqz v0, :cond_2

    check-cast p1, Llo1/a$i;

    invoke-virtual {p1}, Llo1/a$i;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Llo1/a$i;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lho1/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
