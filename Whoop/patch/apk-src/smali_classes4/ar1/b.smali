.class public final Lar1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lar1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000c2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lar1/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lar1/a;",
        "integrationsAnalyticEvent",
        "Ll83/a0;",
        "a",
        "(Lar1/a;)V",
        "Lfi0/a;",
        "b",
        "integrations_release"
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
.field public static final b:Lar1/b$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lar1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lar1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lar1/b;->b:Lar1/b$a;

    const/16 v0, 0x8

    sput v0, Lar1/b;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lar1/b;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(Lar1/a;)V
    .locals 12

    const-string v0, "integrationsAnalyticEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lar1/a$f;

    const-string v1, "Settings - Integrations"

    const-string v2, "Integrations"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lar1/b;->a:Lfi0/a;

    check-cast p1, Lar1/a$f;

    invoke-virtual {p1}, Lar1/a$f;->a()Ljava/lang/String;

    move-result-object p1

    const-string v3, "Clicked Integration"

    invoke-interface {v0, v2, v3, p1, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Lar1/a$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lar1/b;->a:Lfi0/a;

    check-cast p1, Lar1/a$a;

    invoke-virtual {p1}, Lar1/a$a;->a()Ljava/lang/String;

    move-result-object p1

    const-string v3, "Connect"

    invoke-interface {v0, v2, v3, p1, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    instance-of v0, p1, Lar1/a$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lar1/b;->a:Lfi0/a;

    check-cast p1, Lar1/a$b;

    invoke-virtual {p1}, Lar1/a$b;->a()Ljava/lang/String;

    move-result-object p1

    const-string v3, "Disconnect"

    invoke-interface {v0, v2, v3, p1, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    instance-of v0, p1, Lar1/a$c;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lar1/b;->a:Lfi0/a;

    check-cast p1, Lar1/a$c;

    invoke-virtual {p1}, Lar1/a$c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v3, "Disconnect Confirmed"

    invoke-interface {v0, v2, v3, p1, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    instance-of v0, p1, Lar1/a$d;

    const/4 v1, 0x0

    const-string v2, "source"

    if-eqz v0, :cond_5

    iget-object v3, p0, Lar1/b;->a:Lfi0/a;

    check-cast p1, Lar1/a$d;

    invoke-virtual {p1}, Lar1/a$d;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {v2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    :cond_4
    move-object v9, v1

    const/16 v10, 0x14

    const/4 v11, 0x0

    const-string v4, "healthex_auth"

    const-string v5, "initiate_connection"

    const/4 v6, 0x0

    const-string v7, "HealthEx"

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_5
    instance-of v0, p1, Lar1/a$e;

    if-eqz v0, :cond_7

    iget-object v3, p0, Lar1/b;->a:Lfi0/a;

    check-cast p1, Lar1/a$e;

    invoke-virtual {p1}, Lar1/a$e;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-static {v2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    :cond_6
    move-object v9, v1

    const/16 v10, 0x14

    const/4 v11, 0x0

    const-string v4, "healthex_refresh"

    const-string v5, "manual_refresh"

    const/4 v6, 0x0

    const-string v7, "HealthEx"

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
