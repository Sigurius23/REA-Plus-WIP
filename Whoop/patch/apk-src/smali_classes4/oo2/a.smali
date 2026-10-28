.class public final Loo2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Loo2/a;",
        "",
        "Lho2/a;",
        "analytics",
        "<init>",
        "(Lho2/a;)V",
        "Lpo2/a$o;",
        "event",
        "Lpo2/a;",
        "a",
        "(Lpo2/a$o;)Lpo2/a;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "b",
        "(Lcom/whoop/navigation/e;)Lpo2/a;",
        "actionEvent",
        "c",
        "(Lpo2/a;)Lpo2/a;",
        "Lho2/a;",
        "universal-checkout_release"
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
.field private final a:Lho2/a;


# direct methods
.method public constructor <init>(Lho2/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loo2/a;->a:Lho2/a;

    return-void
.end method

.method private final a(Lpo2/a$o;)Lpo2/a;
    .locals 3

    invoke-virtual {p1}, Lpo2/a$o;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lm91/u;

    if-eqz v0, :cond_0

    new-instance v0, Lpo2/a$b;

    check-cast p1, Lm91/u;

    invoke-direct {v0, p1}, Lpo2/a$b;-><init>(Lm91/u;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p0, p1}, Loo2/a;->b(Lcom/whoop/navigation/e;)Lpo2/a;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lio2/d;

    if-eqz v0, :cond_2

    new-instance v0, Lpo2/a$g;

    check-cast p1, Lio2/d;

    invoke-virtual {p1}, Lio2/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio2/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio2/d;->c()Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lpo2/a$g;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lio2/o;

    if-eqz v0, :cond_3

    sget-object p1, Lpo2/a$j0;->a:Lpo2/a$j0;

    return-object p1

    :cond_3
    instance-of v0, p1, Lio2/j0;

    if-eqz v0, :cond_4

    sget-object p1, Lpo2/a$k0;->a:Lpo2/a$k0;

    return-object p1

    :cond_4
    instance-of v0, p1, Lio2/h0;

    if-eqz v0, :cond_5

    sget-object p1, Lpo2/a$h;->a:Lpo2/a$h;

    return-object p1

    :cond_5
    instance-of v0, p1, Lio2/g0;

    if-eqz v0, :cond_6

    new-instance v0, Lpo2/a$c;

    check-cast p1, Lio2/g0;

    invoke-virtual {p1}, Lio2/g0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio2/g0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lpo2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_6
    instance-of v0, p1, Lio2/i0;

    if-eqz v0, :cond_7

    new-instance v0, Lpo2/a$c0;

    check-cast p1, Lio2/i0;

    invoke-virtual {p1}, Lio2/i0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio2/i0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lpo2/a$c0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_7
    instance-of v0, p1, Lio2/y;

    if-eqz v0, :cond_8

    sget-object p1, Lpo2/a$u;->a:Lpo2/a$u;

    return-object p1

    :cond_8
    instance-of v0, p1, Lio2/z;

    if-eqz v0, :cond_9

    new-instance v0, Lpo2/a$p;

    check-cast p1, Lio2/z;

    invoke-virtual {p1}, Lio2/z;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio2/z;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio2/z;->a()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lpo2/a$p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v0

    :cond_9
    instance-of v0, p1, Lhy0/j0;

    if-eqz v0, :cond_a

    new-instance v0, Lpo2/a$i0;

    check-cast p1, Lhy0/j0;

    invoke-virtual {p1}, Lhy0/j0;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lpo2/a$i0;-><init>(Z)V

    return-object v0

    :cond_a
    instance-of v0, p1, Lpo2/a$s;

    if-eqz v0, :cond_b

    check-cast p1, Lpo2/a;

    return-object p1

    :cond_b
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lcom/whoop/navigation/e;)Lpo2/a;
    .locals 1

    new-instance v0, Lpo2/a$d;

    invoke-direct {v0, p1}, Lpo2/a$d;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0
.end method


# virtual methods
.method public final c(Lpo2/a;)Lpo2/a;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lpo2/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Loo2/a;->a:Lho2/a;

    move-object v1, p1

    check-cast v1, Lpo2/a$a;

    invoke-virtual {v0, v1}, Lho2/a;->a(Lpo2/a$a;)V

    :cond_0
    instance-of v0, p1, Lpo2/a$o;

    if-eqz v0, :cond_1

    check-cast p1, Lpo2/a$o;

    invoke-direct {p0, p1}, Loo2/a;->a(Lpo2/a$o;)Lpo2/a;

    move-result-object p1

    :cond_1
    return-object p1
.end method
