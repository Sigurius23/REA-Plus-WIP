.class public final Lqh0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqh0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000c2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lqh0/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lqh0/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lqh0/a;)V",
        "Lfi0/a;",
        "b",
        "ai-insights_release"
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
.field public static final b:Lqh0/b$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqh0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqh0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lqh0/b;->b:Lqh0/b$a;

    const/16 v0, 0x8

    sput v0, Lqh0/b;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqh0/b;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(Lqh0/a;)V
    .locals 9

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lqh0/a$c;

    const-string v1, "daily_outlook_tile"

    if-eqz v0, :cond_0

    iget-object v2, p0, Lqh0/b;->a:Lfi0/a;

    check-cast p1, Lqh0/a$c;

    invoke-virtual {p1}, Lqh0/a$c;->a()Ljava/lang/String;

    move-result-object v5

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v0, Ll83/k;

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v1, "source_type"

    const-string v3, "ACTIVITY_RECOMMENDATION_REVIEW"

    invoke-direct {p1, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const-string v4, "open"

    const-string v6, "AI_COACH"

    const-string v3, "coach_recommendation_drawer"

    invoke-interface/range {v2 .. v7}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_0
    instance-of v0, p1, Lqh0/a$a;

    const-string v2, "value"

    if-eqz v0, :cond_1

    iget-object v3, p0, Lqh0/b;->a:Lfi0/a;

    check-cast p1, Lqh0/a$a;

    invoke-virtual {p1}, Lqh0/a$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    const-string v6, "completed"

    const-string v7, "AI_COACH"

    const-string v4, "coach_recommendation_drawer"

    const-string v5, "tap"

    invoke-interface/range {v3 .. v8}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_1
    instance-of v0, p1, Lqh0/a$e;

    if-eqz v0, :cond_2

    iget-object v3, p0, Lqh0/b;->a:Lfi0/a;

    check-cast p1, Lqh0/a$e;

    invoke-virtual {p1}, Lqh0/a$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    const-string v6, "completed"

    const-string v7, "AI_COACH"

    const-string v4, "coach_recommendation_drawer"

    const-string v5, "start"

    invoke-interface/range {v3 .. v8}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_2
    instance-of v0, p1, Lqh0/a$b;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lqh0/b;->a:Lfi0/a;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v0, Ll83/k;

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v1, "source"

    const-string v3, "generate_alternatives"

    invoke-direct {p1, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const-string v5, "completed"

    const-string v6, "AI_COACH"

    const-string v3, "chat_entry"

    const-string v4, "chat_entered"

    invoke-interface/range {v2 .. v7}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_3
    sget-object v0, Lqh0/a$d;->a:Lqh0/a$d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object v0, p0, Lqh0/b;->a:Lfi0/a;

    const/16 v7, 0x31

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "activity_deleted"

    const-string v3, "activity_recommendation"

    const-string v4, "AI_COACH"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
