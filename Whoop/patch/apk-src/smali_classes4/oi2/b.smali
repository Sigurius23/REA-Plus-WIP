.class public final Loi2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loi2/b$a;,
        Loi2/b$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000f\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Loi2/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lti2/g;",
        "viewState",
        "Ll83/a0;",
        "c",
        "(Lti2/g;)V",
        "b",
        "()V",
        "Loi2/a;",
        "event",
        "a",
        "(Loi2/a;)V",
        "Lfi0/a;",
        "streaks_release"
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
.field public static final b:Loi2/b$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Loi2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Loi2/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Loi2/b;->b:Loi2/b$a;

    const/16 v0, 0x8

    sput v0, Loi2/b;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loi2/b;->a:Lfi0/a;

    return-void
.end method

.method private final b()V
    .locals 9

    iget-object v0, p0, Loi2/b;->a:Lfi0/a;

    const/16 v7, 0x35

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "view error"

    const/4 v3, 0x0

    const-string v4, "Streaks"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final c(Lti2/g;)V
    .locals 9

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lti2/g;->a()Lui2/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lui2/c;->h()Lui2/a;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-static {v1}, Loi2/c;->a(Lui2/a;)Ljava/lang/String;

    move-result-object v1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lti2/g;->a()Lui2/c;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lui2/c;->f()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_2
    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Lh01/a0;

    if-eqz v6, :cond_3

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {v3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh01/a0;

    new-instance v3, Loi2/b$b;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lh01/a0;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    goto :goto_2

    :cond_5
    move-object v4, v0

    :goto_2
    instance-of v6, v4, Lcom/whoop/design/util/TextResource$e;

    if-eqz v6, :cond_6

    check-cast v4, Lcom/whoop/design/util/TextResource$e;

    goto :goto_3

    :cond_6
    move-object v4, v0

    :goto_3
    const-string v6, ""

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lcom/whoop/design/util/TextResource$e;->a()Ljava/lang/CharSequence;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_8

    :cond_7
    move-object v4, v6

    :cond_8
    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lh01/a0;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    goto :goto_4

    :cond_9
    move-object v7, v0

    :goto_4
    instance-of v8, v7, Lcom/whoop/design/util/TextResource$e;

    if-eqz v8, :cond_a

    check-cast v7, Lcom/whoop/design/util/TextResource$e;

    goto :goto_5

    :cond_a
    move-object v7, v0

    :goto_5
    if-eqz v7, :cond_b

    invoke-virtual {v7}, Lcom/whoop/design/util/TextResource$e;->a()Ljava/lang/CharSequence;

    move-result-object v7

    if-eqz v7, :cond_b

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_c

    :cond_b
    move-object v7, v6

    :cond_c
    if-eqz v2, :cond_d

    invoke-virtual {v2}, Lh01/a0;->getId()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_e

    :cond_d
    move-object v2, v6

    :cond_e
    invoke-direct {v3, v4, v7, v2}, Loi2/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lti2/g;->a()Lui2/c;

    move-result-object p1

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lui2/c;->k()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    goto :goto_6

    :cond_f
    move-object p1, v0

    :goto_6
    instance-of v2, p1, Lcom/whoop/design/util/TextResource$e;

    if-eqz v2, :cond_10

    move-object v0, p1

    check-cast v0, Lcom/whoop/design/util/TextResource$e;

    :cond_10
    if-eqz v0, :cond_12

    invoke-virtual {v0}, Lcom/whoop/design/util/TextResource$e;->a()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_11

    goto :goto_7

    :cond_11
    move-object v6, p1

    :cond_12
    :goto_7
    const-string p1, "streak_value"

    invoke-interface {v5, p1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "streak_state"

    invoke-interface {v5, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "title"

    invoke-virtual {v3}, Loi2/b$b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Loi2/b;->a:Lfi0/a;

    invoke-virtual {v3}, Loi2/b$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Loi2/b$b;->a()Ljava/lang/String;

    move-result-object v3

    const-string v2, "view streak explainer page"

    const-string v4, "Streaks"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final a(Loi2/a;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Loi2/a$c;

    if-eqz v0, :cond_0

    check-cast p1, Loi2/a$c;

    invoke-virtual {p1}, Loi2/a$c;->a()Lti2/g;

    move-result-object p1

    invoke-direct {p0, p1}, Loi2/b;->c(Lti2/g;)V

    return-void

    :cond_0
    instance-of v0, p1, Loi2/a$b;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Loi2/b;->b()V

    return-void

    :cond_1
    instance-of v0, p1, Loi2/a$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Loi2/b;->a:Lfi0/a;

    check-cast p1, Loi2/a$a;

    invoke-virtual {p1}, Loi2/a$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Loi2/a$a;->a()Lui2/a;

    move-result-object p1

    invoke-static {p1}, Loi2/c;->a(Lui2/a;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Loi2/d;->a(Lfi0/a;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
