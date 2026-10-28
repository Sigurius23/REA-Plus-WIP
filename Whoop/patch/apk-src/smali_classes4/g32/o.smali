.class public final Lg32/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg32/o$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 &2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJe\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2*\u0010\u0015\u001a&\u0008\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u0016H\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\rH\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u000fH\u0000\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lg32/o;",
        "",
        "Lor2/g;",
        "buildConfigProvider",
        "<init>",
        "(Lor2/g;)V",
        "Landroid/content/Context;",
        "context",
        "",
        "publishableKey",
        "Ll83/a0;",
        "e",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "Lg32/f;",
        "intentConfig",
        "Lg32/e;",
        "sheetConfig",
        "Lkotlin/Function3;",
        "Ly00/o4;",
        "Lq83/d;",
        "Lh20/e;",
        "onCreateIntent",
        "Lkotlin/Function1;",
        "Lh20/b4;",
        "onResult",
        "Lkotlin/Function0;",
        "f",
        "(Lg32/f;Lg32/e;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lc93/a;",
        "intentConfiguration",
        "Lh20/u2;",
        "c",
        "(Lg32/f;)Lh20/u2;",
        "configuration",
        "Lh20/x1;",
        "d",
        "(Lg32/e;)Lh20/x1;",
        "a",
        "Lor2/g;",
        "b",
        "payments_release"
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
.field public static final b:Lg32/o$a;

.field public static final c:I

.field private static final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lh20/e2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lor2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lg32/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg32/o$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lg32/o;->b:Lg32/o$a;

    const/16 v0, 0x8

    sput v0, Lg32/o;->c:I

    sget-object v0, Lh20/e2;->w:Lh20/e2;

    new-instance v1, Ll83/k;

    const-string v2, "BUY"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lh20/e2;->x:Lh20/e2;

    new-instance v2, Ll83/k;

    const-string v3, "BOOK"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lh20/e2;->y:Lh20/e2;

    new-instance v3, Ll83/k;

    const-string v4, "CHECKOUT"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lh20/e2;->z:Lh20/e2;

    new-instance v4, Ll83/k;

    const-string v5, "DONATE"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lh20/e2;->E:Lh20/e2;

    new-instance v5, Ll83/k;

    const-string v6, "ORDER"

    invoke-direct {v5, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lh20/e2;->G:Lh20/e2;

    new-instance v6, Ll83/k;

    const-string v7, "SUBSCRIBE"

    invoke-direct {v6, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lh20/e2;->H:Lh20/e2;

    new-instance v7, Ll83/k;

    const-string v8, "PLAIN"

    invoke-direct {v7, v8, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v1 .. v7}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lg32/o;->d:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lor2/g;)V
    .locals 1

    const-string v0, "buildConfigProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg32/o;->a:Lor2/g;

    return-void
.end method

.method public static synthetic a(Lp1/c1;Lh20/b4;)V
    .locals 0

    invoke-static {p0, p1}, Lg32/o;->g(Lp1/t2;Lh20/b4;)V

    return-void
.end method

.method public static synthetic b(Lh20/r3;Lh20/u2;Lh20/x1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lg32/o;->h(Lh20/r3;Lh20/u2;Lh20/x1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lp1/t2;Lh20/b4;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final h(Lh20/r3;Lh20/u2;Lh20/x1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh20/r3;->a(Lh20/u2;Lh20/x1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final c(Lg32/f;)Lh20/u2;
    .locals 7

    const-string v0, "intentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lh20/q2;

    invoke-virtual {p1}, Lg32/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lg32/f;->f()Lh20/t2;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Lh20/q2;-><init>(Ljava/lang/String;Lh20/t2;)V

    invoke-virtual {p1}, Lg32/f;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lg32/f;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lg32/f;->e()Z

    move-result v6

    invoke-virtual {p1}, Lg32/f;->d()Ljava/util/List;

    move-result-object v3

    new-instance v1, Lh20/u2;

    invoke-direct/range {v1 .. v6}, Lh20/u2;-><init>(Lh20/r2;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public final d(Lg32/e;)Lh20/x1;
    .locals 11

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/w1;

    invoke-virtual {p1}, Lg32/e;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lh20/w1;-><init>(Ljava/lang/String;)V

    sget-object v1, Lg32/o;->b:Lg32/o$a;

    invoke-virtual {v1}, Lg32/o$a;->a()Lh20/h1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh20/w1;->c(Lh20/h1;)V

    invoke-virtual {p1}, Lg32/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh20/w1;->i(Ljava/lang/String;)V

    invoke-virtual {p1}, Lg32/e;->b()Lg32/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lg32/c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lg32/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ltx/f;->D(Ljava/lang/String;Ljava/lang/String;)Lh20/c2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh20/w1;->e(Lh20/c2;)V

    :cond_0
    invoke-virtual {p1}, Lg32/e;->d()Lg32/d;

    invoke-virtual {p1}, Lg32/e;->c()Lg32/b;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lg32/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lg32/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lg32/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lg32/b;->a()Lg32/a;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v4, Lh20/x0;

    invoke-virtual {p1}, Lg32/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lg32/a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lg32/a;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lg32/a;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lg32/a;->e()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lg32/a;->f()Ljava/lang/String;

    move-result-object v10

    invoke-direct/range {v4 .. v10}, Lh20/x0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    new-instance p1, Lh20/i1;

    invoke-direct {p1, v4, v1, v2, v3}, Lh20/i1;-><init>(Lh20/x0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lh20/w1;->f(Lh20/i1;)V

    :cond_2
    invoke-virtual {v0}, Lh20/w1;->d()Lh20/x1;

    move-result-object p1

    return-object p1
.end method

.method public final e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lt9/c0;->r(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public final f(Lg32/f;Lg32/e;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lc93/a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg32/f;",
            "Lg32/e;",
            "Lkotlin/jvm/functions/Function3;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lc93/a;"
        }
    .end annotation

    const-string v0, "intentConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sheetConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCreateIntent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResult"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lg32/e;->c()Lg32/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg32/b;->a()Lg32/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg32/a;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p4, p5}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p4

    check-cast p5, Lp1/q;

    invoke-virtual {p5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_1

    if-ne v2, v3, :cond_2

    :cond_1
    new-instance v2, Lh20/m1;

    new-instance v1, Lg32/n;

    invoke-direct {v1, p4}, Lg32/n;-><init>(Lp1/c1;)V

    invoke-direct {v2, v1}, Lh20/m1;-><init>(Lg32/n;)V

    new-instance p4, Lg32/o$b;

    invoke-direct {p4, p3, v0}, Lg32/o$b;-><init>(Lkotlin/jvm/functions/Function3;Ljava/lang/String;)V

    invoke-virtual {v2, p4}, Lh20/m1;->b(Lh20/b;)V

    invoke-virtual {p5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lh20/m1;

    invoke-virtual {v2, p5}, Lh20/m1;->a(Lp1/q;)Lh20/r3;

    move-result-object p3

    invoke-virtual {p5, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {p5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    and-int/lit8 v0, p6, 0x70

    xor-int/lit8 v0, v0, 0x30

    const/16 v1, 0x20

    if-le v0, v1, :cond_3

    invoke-virtual {p5, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    and-int/lit8 p6, p6, 0x30

    if-ne p6, v1, :cond_5

    :cond_4
    const/4 p6, 0x1

    goto :goto_1

    :cond_5
    const/4 p6, 0x0

    :goto_1
    or-int/2addr p4, p6

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p6

    if-nez p4, :cond_6

    if-ne p6, v3, :cond_7

    :cond_6
    invoke-virtual {p0, p1}, Lg32/o;->c(Lg32/f;)Lh20/u2;

    move-result-object p1

    invoke-virtual {p0, p2}, Lg32/o;->d(Lg32/e;)Lh20/x1;

    move-result-object p2

    new-instance p6, Ld30/r;

    const/16 p4, 0x11

    invoke-direct {p6, p3, p1, p2, p4}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p5, p6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast p6, Lc93/a;

    return-object p6
.end method
