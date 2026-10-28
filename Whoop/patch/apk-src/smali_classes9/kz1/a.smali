.class public final Lkz1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkz1/a$a;,
        Lkz1/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\r*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\r*\u0004\u0018\u00010\u0013H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lkz1/a;",
        "",
        "<init>",
        "()V",
        "Liz1/e;",
        "Ljz1/c$a;",
        "f",
        "(Liz1/e;)Ljz1/c$a;",
        "Lgz1/b;",
        "detection",
        "Ljz1/e;",
        "a",
        "(Lgz1/b;)Ljz1/e;",
        "",
        "d",
        "(Lgz1/b;)Ljava/lang/String;",
        "",
        "c",
        "(Ljava/util/List;)Ljava/lang/String;",
        "Lgz1/c;",
        "b",
        "(Lgz1/c;)Ljava/lang/String;",
        "Liz1/b;",
        "state",
        "Ljz1/c;",
        "e",
        "(Liz1/b;)Ljz1/c;",
        "motion-tracking-sandbox_release"
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
.field private static final a:Lkz1/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkz1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkz1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkz1/a;->a:Lkz1/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lgz1/b;)Ljz1/e;
    .locals 5

    instance-of v0, p1, Lgz1/b$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lgz1/b$c;

    invoke-virtual {v0}, Lgz1/b$c;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    sget-object v0, Lgz1/b$a;->a:Lgz1/b$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lgz1/b$b;->a:Lgz1/b$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    move-object v0, v1

    :goto_1
    new-instance v2, Ljz1/d;

    const-string v3, "Motion-tracking state"

    invoke-direct {p0, p1}, Lkz1/a;->d(Lgz1/b;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v3, p1}, Ljz1/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_3

    new-instance p1, Ljz1/d;

    const-string v3, "Reason"

    invoke-direct {p1, v3, v0}, Ljz1/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    move-object p1, v1

    :goto_2
    new-instance v0, Ljz1/d;

    const-string v3, "Top 5 exercises"

    invoke-direct {p0, v1}, Lkz1/a;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Ljz1/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljz1/d;

    const-string v4, "Final classification"

    invoke-direct {p0, v1}, Lkz1/a;->b(Lgz1/c;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Ljz1/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v2, p1, v0, v3}, [Ljz1/d;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljz1/e;

    const-string v1, "Exercise detection"

    invoke-direct {v0, v1, p1}, Ljz1/e;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method private final b(Lgz1/c;)Ljava/lang/String;
    .locals 0

    const-string p1, "none yet"

    return-object p1
.end method

.method private final c(Ljava/util/List;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-nez p1, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    const/4 v0, 0x5

    invoke-static {p1, v0}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "none yet"

    return-object p1

    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, "\n"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1
.end method

.method private final d(Lgz1/b;)Ljava/lang/String;
    .locals 1

    instance-of v0, p1, Lgz1/b$c;

    if-eqz v0, :cond_0

    const-string p1, "Unavailable"

    return-object p1

    :cond_0
    sget-object v0, Lgz1/b$a;->a:Lgz1/b$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Idle"

    return-object p1

    :cond_1
    sget-object v0, Lgz1/b$b;->a:Lgz1/b$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "Starting"

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final f(Liz1/e;)Ljz1/c$a;
    .locals 2

    sget-object v0, Lkz1/a$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    new-instance p1, Ljz1/c$a;

    const-string v0, "Stop session"

    sget-object v1, Ljz1/a$b;->a:Ljz1/a$b;

    invoke-direct {p1, v0, v1}, Ljz1/c$a;-><init>(Ljava/lang/String;Ljz1/a;)V

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljz1/c$a;

    const-string v0, "Start session"

    sget-object v1, Ljz1/a$a;->a:Ljz1/a$a;

    invoke-direct {p1, v0, v1}, Ljz1/c$a;-><init>(Ljava/lang/String;Ljz1/a;)V

    return-object p1
.end method


# virtual methods
.method public final e(Liz1/b;)Ljz1/c;
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljz1/c;

    invoke-virtual {p1}, Liz1/b;->d()Liz1/e;

    move-result-object v1

    invoke-direct {p0, v1}, Lkz1/a;->f(Liz1/e;)Ljz1/c$a;

    move-result-object v1

    invoke-virtual {p1}, Liz1/b;->c()Lgz1/b;

    move-result-object p1

    invoke-direct {p0, p1}, Lkz1/a;->a(Lgz1/b;)Ljz1/e;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljz1/c;-><init>(Ljz1/c$a;Ljava/util/List;)V

    return-object v0
.end method
