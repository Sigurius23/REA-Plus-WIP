.class public final Llu1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llu1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Llu1/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lmc1/b;",
        "selectedHrZone",
        "",
        "a",
        "(Lmc1/b;)Ljava/lang/String;",
        "Lqu1/c$a;",
        "event",
        "Ll83/a0;",
        "b",
        "(Lqu1/c$a;)V",
        "Lfi0/a;",
        "last-night-sleep_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llu1/a;->a:Lfi0/a;

    return-void
.end method

.method private final a(Lmc1/b;)Ljava/lang/String;
    .locals 2

    sget-object v0, Llu1/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "REM"

    return-object p1

    :cond_1
    const-string p1, "SWS (DEEP)"

    return-object p1

    :cond_2
    const-string p1, "LIGHT"

    return-object p1

    :cond_3
    const-string p1, "AWAKE"

    return-object p1
.end method


# virtual methods
.method public final b(Lqu1/c$a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lqu1/c$f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Llu1/a;->a:Lfi0/a;

    check-cast p1, Lqu1/c$f;

    invoke-virtual {p1}, Lqu1/c$f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Llu1/b;->c(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Lqu1/c$g;

    if-eqz v0, :cond_1

    iget-object v0, p0, Llu1/a;->a:Lfi0/a;

    check-cast p1, Lqu1/c$g;

    invoke-virtual {p1}, Lqu1/c$g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Llu1/b;->b(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_1
    instance-of v0, p1, Lqu1/c$i;

    if-eqz v0, :cond_2

    iget-object v0, p0, Llu1/a;->a:Lfi0/a;

    check-cast p1, Lqu1/c$i;

    invoke-virtual {p1}, Lqu1/c$i;->a()Lmc1/b;

    move-result-object p1

    invoke-direct {p0, p1}, Llu1/a;->a(Lmc1/b;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Llu1/b;->a(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_2
    instance-of v0, p1, Lqu1/c$h;

    if-eqz v0, :cond_3

    iget-object v0, p0, Llu1/a;->a:Lfi0/a;

    check-cast p1, Lqu1/c$h;

    invoke-virtual {p1}, Lqu1/c$h;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Llu1/b;->d(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
