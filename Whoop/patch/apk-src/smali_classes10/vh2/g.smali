.class public final Lvh2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvh2/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u0000 #2\u00020\u0001:\u0001\u0019B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J2\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0086@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lvh2/g;",
        "",
        "Lvh2/f;",
        "store",
        "Ljs0/c;",
        "configurationRepository",
        "Lvs0/a;",
        "signedInProvider",
        "Lvh2/c;",
        "unlockMetrics",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lvh2/f;Ljs0/c;Lvs0/a;Lvh2/c;Ltr2/n;)V",
        "",
        "b",
        "()I",
        "",
        "serial",
        "Lvh2/h;",
        "result",
        "",
        "isRetry",
        "firmwareVersion",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/String;Lvh2/h;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lvh2/f;",
        "Ljs0/c;",
        "c",
        "Lvs0/a;",
        "d",
        "Lvh2/c;",
        "e",
        "Ltr2/n;",
        "f",
        "strap-auth_release"
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
.field private static final f:Lvh2/g$a;


# instance fields
.field private final a:Lvh2/f;

.field private final b:Ljs0/c;

.field private final c:Lvs0/a;

.field private final d:Lvh2/c;

.field private final e:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvh2/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvh2/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvh2/g;->f:Lvh2/g$a;

    return-void
.end method

.method public constructor <init>(Lvh2/f;Ljs0/c;Lvs0/a;Lvh2/c;Ltr2/n;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signedInProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unlockMetrics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvh2/g;->a:Lvh2/f;

    .line 3
    iput-object p2, p0, Lvh2/g;->b:Ljs0/c;

    .line 4
    iput-object p3, p0, Lvh2/g;->c:Lvs0/a;

    .line 5
    iput-object p4, p0, Lvh2/g;->d:Lvh2/c;

    .line 6
    iput-object p5, p0, Lvh2/g;->e:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lvh2/f;Ljs0/c;Lvs0/a;Lvh2/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 7
    sget-object p5, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "StuckLockedTracker"

    invoke-virtual {p5, p6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lvh2/g;-><init>(Lvh2/f;Ljs0/c;Lvs0/a;Lvh2/c;Ltr2/n;)V

    return-void
.end method

.method private final b()I
    .locals 7

    iget-object v0, p0, Lvh2/g;->b:Ljs0/c;

    sget-object v1, Lvh2/g$a$a;->a:Lvh2/g$a$a;

    invoke-virtual {v0}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v0

    invoke-virtual {v1}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Ljava/lang/Integer;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    goto/16 :goto_0

    :cond_0
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    goto :goto_0

    :cond_1
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v6

    goto :goto_0

    :cond_2
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v6

    goto :goto_0

    :cond_3
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_0

    :cond_4
    const-class v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_0

    :cond_5
    move-object v6, v1

    :cond_6
    :goto_0
    if-nez v6, :cond_7

    goto :goto_1

    :cond_7
    move-object v1, v6

    :goto_1
    if-eqz v1, :cond_8

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0

    :cond_8
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type kotlin.Int"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lvh2/h;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lvh2/h;",
            "Z",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lvh2/g$b;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lvh2/g$b;

    iget v1, v0, Lvh2/g$b;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvh2/g$b;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvh2/g$b;

    invoke-direct {v0, p0, p5}, Lvh2/g$b;-><init>(Lvh2/g;Lq83/d;)V

    :goto_0
    iget-object p5, v0, Lvh2/g$b;->G:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvh2/g$b;->I:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-string v8, "Strap "

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lvh2/g$b;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v0, Lvh2/g$b;->x:Ljava/lang/Object;

    check-cast p2, Lvh2/h;

    iget-object p2, v0, Lvh2/g$b;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    :try_start_0
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception p1

    goto/16 :goto_8

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lvh2/g$b;->F:I

    iget p2, v0, Lvh2/g$b;->E:I

    iget-boolean p3, v0, Lvh2/g$b;->z:Z

    iget-object p4, v0, Lvh2/g$b;->y:Ljava/lang/Object;

    check-cast p4, Ljava/lang/String;

    iget-object v2, v0, Lvh2/g$b;->x:Ljava/lang/Object;

    check-cast v2, Lvh2/h;

    iget-object v2, v0, Lvh2/g$b;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    :try_start_1
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move v9, p2

    move p2, p1

    move-object p1, v2

    move-object v2, p5

    move p5, v9

    goto/16 :goto_5

    :cond_3
    iget-object p1, v0, Lvh2/g$b;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lvh2/g$b;->x:Ljava/lang/Object;

    check-cast p1, Lvh2/h;

    iget-object p1, v0, Lvh2/g$b;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :cond_4
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    instance-of p5, p2, Lvh2/h$c;

    if-nez p5, :cond_6

    instance-of p5, p2, Lvh2/h$a;

    if-eqz p5, :cond_5

    move-object p5, p2

    check-cast p5, Lvh2/h$a;

    invoke-virtual {p5}, Lvh2/h$a;->a()Lvh2/h$b;

    move-result-object p5

    sget-object v2, Lvh2/h$b;->FORBIDDEN:Lvh2/h$b;

    if-ne p5, v2, :cond_5

    goto :goto_1

    :cond_5
    move p5, v7

    goto :goto_2

    :cond_6
    :goto_1
    move p5, v6

    :goto_2
    instance-of v2, p2, Lvh2/h$a;

    if-eqz v2, :cond_7

    check-cast p2, Lvh2/h$a;

    invoke-virtual {p2}, Lvh2/h$a;->a()Lvh2/h$b;

    move-result-object p2

    sget-object v2, Lvh2/h$b;->NO_NETWORK:Lvh2/h$b;

    if-ne p2, v2, :cond_7

    move p2, v6

    goto :goto_3

    :cond_7
    move p2, v7

    :goto_3
    if-eqz p5, :cond_9

    iget-object p4, p0, Lvh2/g;->a:Lvh2/f;

    iput-object p1, v0, Lvh2/g$b;->w:Ljava/lang/Object;

    iput-object v5, v0, Lvh2/g$b;->x:Ljava/lang/Object;

    iput-object v5, v0, Lvh2/g$b;->y:Ljava/lang/Object;

    iput-boolean p3, v0, Lvh2/g$b;->z:Z

    iput p5, v0, Lvh2/g$b;->E:I

    iput p2, v0, Lvh2/g$b;->F:I

    iput v6, v0, Lvh2/g$b;->I:I

    invoke-virtual {p4, p1, v0}, Lvh2/f;->d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_8

    goto/16 :goto_6

    :cond_8
    :goto_4
    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_10

    iget-object p2, p0, Lvh2/g;->e:Ltr2/n;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " unlocked, clearing its stuck-locked count"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p3, v7, [Lqr2/a$a;

    invoke-interface {p2, p1, p3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto/16 :goto_9

    :cond_9
    if-eqz p2, :cond_a

    iget-object p2, p0, Lvh2/g;->e:Ltr2/n;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " unlock failed with no network, leaving its stuck-locked count alone"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p3, v7, [Lqr2/a$a;

    invoke-interface {p2, p1, p3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto/16 :goto_9

    :cond_a
    if-eqz p3, :cond_b

    iget-object p2, p0, Lvh2/g;->e:Ltr2/n;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " unlock retry failed, this connection is already counted"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p3, v7, [Lqr2/a$a;

    invoke-interface {p2, p1, p3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto/16 :goto_9

    :cond_b
    iget-object v2, p0, Lvh2/g;->c:Lvs0/a;

    iput-object p1, v0, Lvh2/g$b;->w:Ljava/lang/Object;

    iput-object v5, v0, Lvh2/g$b;->x:Ljava/lang/Object;

    iput-object p4, v0, Lvh2/g$b;->y:Ljava/lang/Object;

    iput-boolean p3, v0, Lvh2/g$b;->z:Z

    iput p5, v0, Lvh2/g$b;->E:I

    iput p2, v0, Lvh2/g$b;->F:I

    iput v4, v0, Lvh2/g$b;->I:I

    invoke-interface {v2, v0}, Lvs0/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_c

    goto :goto_6

    :cond_c
    :goto_5
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_d

    iget-object p2, p0, Lvh2/g;->e:Ltr2/n;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " unlock failed while signed out, not counting it"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p3, v7, [Lqr2/a$a;

    invoke-interface {p2, p1, p3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto/16 :goto_9

    :cond_d
    iget-object v2, p0, Lvh2/g;->a:Lvh2/f;

    iput-object p1, v0, Lvh2/g$b;->w:Ljava/lang/Object;

    iput-object v5, v0, Lvh2/g$b;->x:Ljava/lang/Object;

    iput-object p4, v0, Lvh2/g$b;->y:Ljava/lang/Object;

    iput-boolean p3, v0, Lvh2/g$b;->z:Z

    iput p5, v0, Lvh2/g$b;->E:I

    iput p2, v0, Lvh2/g$b;->F:I

    iput v3, v0, Lvh2/g$b;->I:I

    invoke-virtual {v2, p1, v0}, Lvh2/f;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_e

    :goto_6
    return-object v1

    :cond_e
    move-object p2, p1

    move-object p1, p4

    :goto_7
    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-direct {p0}, Lvh2/g;->b()I

    move-result p4

    if-ne p3, p4, :cond_f

    iget-object p4, p0, Lvh2/g;->e:Ltr2/n;

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " on firmware "

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " is stuck Locked, "

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " consecutive Locked connections reached the threshold"

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v7, [Lqr2/a$a;

    invoke-interface {p4, p2, p3}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lvh2/g;->d:Lvh2/c;

    invoke-virtual {p2, p1}, Lvh2/c;->i(Ljava/lang/String;)V

    goto :goto_9

    :cond_f
    iget-object p1, p0, Lvh2/g;->e:Ltr2/n;

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " stayed Locked, "

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " of "

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " consecutive Locked connections"

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v7, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_9

    :goto_8
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->o(Lq83/j;)V

    iget-object p2, p0, Lvh2/g;->e:Ltr2/n;

    const-string p3, "Failed to update stuck-locked state"

    new-array p4, v7, [Lqr2/a$a;

    invoke-interface {p2, p3, p1, p4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_10
    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
