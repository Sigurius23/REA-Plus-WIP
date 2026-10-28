.class public final Lqe1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u000c2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lqe1/b;",
        "",
        "Lfi0/a;",
        "baseAnalytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lqe1/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lqe1/a;)V",
        "Lqe1/e;",
        "b",
        "(Lqe1/e;)V",
        "Lfi0/a;",
        "education_release"
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
.field private static final b:Lqe1/b$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqe1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqe1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lqe1/b;->b:Lqe1/b$a;

    const/16 v0, 0x8

    sput v0, Lqe1/b;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "baseAnalytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqe1/b;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(Lqe1/a;)V
    .locals 11

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lqe1/a$c;

    const-string v1, "Type"

    const-string v2, "Community"

    const-string v3, "Source"

    if-eqz v0, :cond_1

    check-cast p1, Lqe1/a$c;

    iget-object v4, p0, Lqe1/b;->a:Lfi0/a;

    invoke-virtual {p1}, Lqe1/a$c;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lqe1/a$c;->a()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    new-instance v0, Ll83/k;

    invoke-direct {v0, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lqe1/a$c;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v1, "Native"

    const-string v3, "Yes"

    invoke-direct {p1, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v2, p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v10

    const/4 v5, 0x0

    const-string v6, "Tap"

    const-string v8, "Education Tile"

    invoke-interface/range {v4 .. v10}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_1
    instance-of v0, p1, Lqe1/a$d;

    if-eqz v0, :cond_2

    check-cast p1, Lqe1/a$d;

    iget-object v4, p0, Lqe1/b;->a:Lfi0/a;

    invoke-virtual {p1}, Lqe1/a$d;->a()Ljava/lang/String;

    move-result-object v7

    const-string v9, ""

    invoke-static {v3, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v10

    const/4 v5, 0x0

    const-string v6, "Viewed Full Video"

    const-string v8, "Education Tile"

    invoke-interface/range {v4 .. v10}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_2
    instance-of v0, p1, Lqe1/a$a;

    if-eqz v0, :cond_3

    check-cast p1, Lqe1/a$a;

    iget-object v4, p0, Lqe1/b;->a:Lfi0/a;

    invoke-virtual {p1}, Lqe1/a$a;->a()Ljava/lang/String;

    move-result-object v7

    new-instance p1, Ll83/k;

    invoke-direct {p1, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const-string v2, "VIDEO"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p1, v0}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v10

    const/4 v5, 0x0

    const-string v6, "Close"

    const-string v8, "Education Tile"

    const-string v9, ""

    invoke-interface/range {v4 .. v10}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_3
    sget-object v0, Lqe1/a$b;->a:Lqe1/a$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object v4, p0, Lqe1/b;->a:Lfi0/a;

    const/4 v9, 0x0

    invoke-static {v3, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v10

    const/4 v5, 0x0

    const-string v6, "View All"

    const/4 v7, 0x0

    const-string v8, "Education Tile"

    invoke-interface/range {v4 .. v10}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final b(Lqe1/e;)V
    .locals 11

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lqe1/e$b;->a:Lqe1/e$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "toLowerCase(...)"

    const-string v2, "Community"

    const-string v3, "screen_name"

    if-eqz v0, :cond_0

    iget-object v4, p0, Lqe1/b;->a:Lfi0/a;

    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v10

    const/4 v5, 0x0

    const-string v6, "Tap"

    const/4 v7, 0x0

    const-string v8, "View Refer a Friend menu"

    const/4 v9, 0x0

    invoke-interface/range {v4 .. v10}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_0
    sget-object v0, Lqe1/e$a;->a:Lqe1/e$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object v4, p0, Lqe1/b;->a:Lfi0/a;

    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v10

    const/4 v5, 0x0

    const-string v6, "Tap"

    const/4 v7, 0x0

    const-string v8, "Community Tab Family Plan Entry"

    const/4 v9, 0x0

    invoke-interface/range {v4 .. v10}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
