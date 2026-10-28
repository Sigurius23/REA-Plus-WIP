.class public final Lei2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lei2/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lei2/c;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lei2/b;",
        "stravaAnalyticEvent",
        "Ll83/a0;",
        "b",
        "(Lei2/b;)V",
        "a",
        "Lfi0/a;",
        "strava_release"
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
.field public static final b:Lei2/c$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lei2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lei2/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lei2/c;->b:Lei2/c$a;

    const/16 v0, 0x8

    sput v0, Lei2/c;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lei2/c;->a:Lfi0/a;

    return-void
.end method

.method public static synthetic a(Lji2/c;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lei2/c;->c(Lji2/c;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lji2/c;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lji2/c;->e()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lei2/b;)V
    .locals 10

    const-string v0, "stravaAnalyticEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lei2/b$a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lei2/c;->a:Lfi0/a;

    const/16 v8, 0x34

    const/4 v9, 0x0

    const-string v2, "Integrations"

    const-string v3, "Connect"

    const/4 v4, 0x0

    const-string v5, "Strava"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_0
    instance-of v0, p1, Lei2/b$i;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lei2/c;->a:Lfi0/a;

    const/16 v8, 0x34

    const/4 v9, 0x0

    const-string v2, "Integrations"

    const-string v3, "Enable auto-share"

    const/4 v4, 0x0

    const-string v5, "Strava"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_1
    instance-of v0, p1, Lei2/b$e;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lei2/c;->a:Lfi0/a;

    const/16 v8, 0x34

    const/4 v9, 0x0

    const-string v2, "Integrations"

    const-string v3, "Select Activities to auto-share"

    const/4 v4, 0x0

    const-string v5, "Strava"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_2
    instance-of v0, p1, Lei2/b$g;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lei2/c;->a:Lfi0/a;

    const/16 v8, 0x34

    const/4 v9, 0x0

    const-string v2, "Integrations"

    const-string v3, "Disable auto-share"

    const/4 v4, 0x0

    const-string v5, "Strava"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_3
    instance-of v0, p1, Lei2/b$h;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lei2/c;->a:Lfi0/a;

    const/16 v8, 0x34

    const/4 v9, 0x0

    const-string v2, "Integrations"

    const-string v3, "Enable auto-import"

    const/4 v4, 0x0

    const-string v5, "Strava"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_4
    instance-of v0, p1, Lei2/b$f;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lei2/c;->a:Lfi0/a;

    const/16 v8, 0x34

    const/4 v9, 0x0

    const-string v2, "Integrations"

    const-string v3, "Disable auto-import"

    const/4 v4, 0x0

    const-string v5, "Strava"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_5
    instance-of v0, p1, Lei2/b$b;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lei2/c;->a:Lfi0/a;

    const/16 v8, 0x34

    const/4 v9, 0x0

    const-string v2, "Integrations"

    const-string v3, "Disconnect"

    const/4 v4, 0x0

    const-string v5, "Strava"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_6
    instance-of v0, p1, Lei2/b$c;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lei2/c;->a:Lfi0/a;

    const/16 v8, 0x34

    const/4 v9, 0x0

    const-string v2, "Integrations"

    const-string v3, "Disconnect Confirmed"

    const/4 v4, 0x0

    const-string v5, "Strava"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_7
    instance-of v0, p1, Lei2/b$d;

    if-eqz v0, :cond_11

    check-cast p1, Lei2/b$d;

    invoke-virtual {p1}, Lei2/b$d;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_1

    :cond_8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lji2/c;

    invoke-virtual {v1}, Lji2/c;->h()Z

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual {p1}, Lei2/b$d;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_a

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_0

    :cond_a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lji2/c;

    invoke-virtual {v1}, Lji2/c;->h()Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v0, Lei2/a;->SOME_SELECTED:Lei2/a;

    const/4 v2, 0x1

    goto :goto_2

    :cond_c
    :goto_0
    sget-object v0, Lei2/a;->NONE_SELECTED:Lei2/a;

    goto :goto_2

    :cond_d
    :goto_1
    sget-object v0, Lei2/a;->ALL_SELECTED:Lei2/a;

    :goto_2
    if-eqz v2, :cond_10

    invoke-virtual {p1}, Lei2/b$d;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_e
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lji2/c;

    invoke-virtual {v3}, Lji2/c;->h()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_f
    new-instance v5, Le81/e;

    const/16 p1, 0x1b

    invoke-direct {v5, p1}, Le81/e;-><init>(I)V

    const/16 v6, 0x1e

    const-string v2, ","

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_10
    const/4 p1, 0x0

    :goto_4
    iget-object v1, p0, Lei2/c;->a:Lfi0/a;

    invoke-virtual {v0}, Lei2/a;->getLabel()Ljava/lang/String;

    move-result-object v4

    const-string v0, "activities_selected"

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const-string v3, "Save Selected Activities"

    const-string v5, "Strava"

    const-string v2, "Integrations"

    invoke-interface/range {v1 .. v6}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_11
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
