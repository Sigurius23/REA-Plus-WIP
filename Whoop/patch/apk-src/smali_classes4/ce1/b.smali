.class public final Lce1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lce1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 (2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J-\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ?\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00162\u0014\u0008\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u001fH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0015\u0010$\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020#\u00a2\u0006\u0004\u0008$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lce1/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Ll83/a0;",
        "h",
        "()V",
        "Lce1/a$a;",
        "event",
        "f",
        "(Lce1/a$a;)V",
        "Lce1/a$b;",
        "g",
        "(Lce1/a$b;)V",
        "Lce1/a$d;",
        "j",
        "(Lce1/a$d;)V",
        "Lce1/a$e;",
        "k",
        "(Lce1/a$e;)V",
        "",
        "eventName",
        "action",
        "",
        "Lce1/c;",
        "activities",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V",
        "label",
        "",
        "properties",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V",
        "Lce1/a;",
        "i",
        "(Lce1/a;)V",
        "a",
        "Lfi0/a;",
        "b",
        "add-activity_release"
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
.field public static final b:Lce1/b$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lce1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lce1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lce1/b;->b:Lce1/b$a;

    const/16 v0, 0x8

    sput v0, Lce1/b;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce1/b;->a:Lfi0/a;

    return-void
.end method

.method public static synthetic a(Lce1/c;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lce1/b;->m(Lce1/c;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lce1/c;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lce1/b;->l(Lce1/c;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lce1/c;",
            ">;)V"
        }
    .end annotation

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lce1/c;

    invoke-virtual {v0}, Lce1/c;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "activity"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lce1/c;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v3, "activity_id"

    invoke-direct {v1, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v1}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "bulk delete activities"

    invoke-direct {p0, p1, p2, v1, v0}, Lce1/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    iget-object v0, p0, Lce1/b;->a:Lfi0/a;

    new-instance v1, Ll83/k;

    const-string v2, "screen"

    const-string v3, "overview"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1, p4}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v5

    const-string v1, "Activity, Edit Activities"

    move-object v4, p1

    move-object v2, p2

    move-object v3, p3

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic e(Lce1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const-string p3, ""

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    sget-object p4, Lm83/z;->w:Lm83/z;

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lce1/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final f(Lce1/a$a;)V
    .locals 2

    const-string v0, "Delete"

    invoke-virtual {p1}, Lce1/a$a;->a()Ljava/util/List;

    move-result-object p1

    const-string v1, "Activity - Delete"

    invoke-direct {p0, v1, v0, p1}, Lce1/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private final g(Lce1/a$b;)V
    .locals 2

    const-string v0, "Confirm"

    invoke-virtual {p1}, Lce1/a$b;->a()Ljava/util/List;

    move-result-object p1

    const-string v1, "Activity - Delete - Confirm"

    invoke-direct {p0, v1, v0, p1}, Lce1/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private final h()V
    .locals 7

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v1, "Activity - Edit"

    const-string v2, "Edit"

    const-string v3, "bulk edit activities"

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lce1/b;->e(Lce1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final j(Lce1/a$d;)V
    .locals 3

    invoke-virtual {p1}, Lce1/a$d;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v1, "num_activities_merged"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "Activity - Merge"

    const-string v1, "Merge"

    const-string v2, "merge activities"

    invoke-direct {p0, v0, v1, v2, p1}, Lce1/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final k(Lce1/a$e;)V
    .locals 8

    invoke-virtual {p1}, Lce1/a$e;->a()Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Lc62/a;

    const/4 v0, 0x5

    invoke-direct {v5, v0}, Lc62/a;-><init>(I)V

    const/16 v6, 0x1e

    const-string v2, ", "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lce1/a$e;->a()Ljava/util/List;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Lc62/a;

    const/4 v1, 0x6

    invoke-direct {v6, v1}, Lc62/a;-><init>(I)V

    const/16 v7, 0x1e

    const-string v3, ", "

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lce1/a$e;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v3, "num_activities_merged"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v3, "activity_id"

    invoke-direct {p1, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "Activity - Merge - Confirm"

    const-string v2, "Merge Confirm"

    invoke-direct {p0, v1, v2, v0, p1}, Lce1/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private static final l(Lce1/c;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lce1/c;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lce1/c;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lce1/c;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final i(Lce1/a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lce1/a$c;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lce1/b;->h()V

    return-void

    :cond_0
    instance-of v0, p1, Lce1/a$a;

    if-eqz v0, :cond_1

    check-cast p1, Lce1/a$a;

    invoke-direct {p0, p1}, Lce1/b;->f(Lce1/a$a;)V

    return-void

    :cond_1
    instance-of v0, p1, Lce1/a$b;

    if-eqz v0, :cond_2

    check-cast p1, Lce1/a$b;

    invoke-direct {p0, p1}, Lce1/b;->g(Lce1/a$b;)V

    return-void

    :cond_2
    instance-of v0, p1, Lce1/a$d;

    if-eqz v0, :cond_3

    check-cast p1, Lce1/a$d;

    invoke-direct {p0, p1}, Lce1/b;->j(Lce1/a$d;)V

    return-void

    :cond_3
    instance-of v0, p1, Lce1/a$e;

    if-eqz v0, :cond_4

    check-cast p1, Lce1/a$e;

    invoke-direct {p0, p1}, Lce1/b;->k(Lce1/a$e;)V

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
