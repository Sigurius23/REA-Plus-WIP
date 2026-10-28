.class public final Lgv1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000cR\u001d\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u000b\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lgv1/d;",
        "",
        "<init>",
        "()V",
        "Lgv1/m;",
        "event",
        "Ll83/a0;",
        "b",
        "(Lgv1/m;)V",
        "Lec3/p1;",
        "Lgv1/o;",
        "a",
        "Lec3/p1;",
        "lottieSource",
        "",
        "isSelectLottieSheetVisible",
        "Lec3/l;",
        "Lgv1/e;",
        "c",
        "Lec3/l;",
        "()Lec3/l;",
        "state",
        "lottie-tester_release"
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
.field private final a:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final b:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final c:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Lgv1/d;->a:Lec3/p1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, p0, Lgv1/d;->b:Lec3/p1;

    new-instance v3, Lgv1/d$a;

    invoke-direct {v3, v0}, Lgv1/d$a;-><init>(Lq83/d;)V

    new-instance v0, Lec3/l1;

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    iput-object v0, p0, Lgv1/d;->c:Lec3/l;

    return-void
.end method


# virtual methods
.method public final a()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lgv1/d;->c:Lec3/l;

    return-object v0
.end method

.method public final b(Lgv1/m;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lgv1/m$d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgv1/d;->a:Lec3/p1;

    new-instance v2, Lgv1/o$d;

    check-cast p1, Lgv1/m$d;

    invoke-virtual {p1}, Lgv1/m$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lgv1/o$d;-><init>(Ljava/lang/String;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_0
    instance-of v0, p1, Lgv1/m$c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgv1/d;->a:Lec3/p1;

    new-instance v2, Lgv1/o$c;

    check-cast p1, Lgv1/m$c;

    invoke-virtual {p1}, Lgv1/m$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lgv1/o$c;-><init>(Ljava/lang/String;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_1
    instance-of v0, p1, Lgv1/m$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lgv1/d;->a:Lec3/p1;

    new-instance v2, Lgv1/o$b;

    check-cast p1, Lgv1/m$b;

    invoke-virtual {p1}, Lgv1/m$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lgv1/o$b;-><init>(Ljava/lang/String;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_2
    instance-of v0, p1, Lgv1/m$a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lgv1/d;->a:Lec3/p1;

    new-instance v2, Lgv1/o$a;

    check-cast p1, Lgv1/m$a;

    invoke-virtual {p1}, Lgv1/m$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lgv1/o$a;-><init>(Ljava/lang/String;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_3
    instance-of v0, p1, Lgv1/m$e;

    if-eqz v0, :cond_4

    iget-object p1, p0, Lgv1/d;->a:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_4
    instance-of v0, p1, Lgv1/m$f;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lgv1/d;->b:Lec3/p1;

    check-cast p1, Lgv1/m$f;

    invoke-virtual {p1}, Lgv1/m$f;->a()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
