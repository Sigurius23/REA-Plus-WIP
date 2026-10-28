.class public final Lko0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lko0/e;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "<init>",
        "(Lj02/o0;Leb/a0;)V",
        "Llo0/z$f;",
        "event",
        "Ll83/a0;",
        "a",
        "(Llo0/z$f;)V",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "b",
        "(Lcom/whoop/navigation/e;)V",
        "Llo0/z$g;",
        "c",
        "(Llo0/z$g;)V",
        "Lj02/o0;",
        "Leb/a0;",
        "clinician-in-the-loop_release"
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
.field private final a:Lj02/o0;

.field private final b:Leb/a0;


# direct methods
.method public constructor <init>(Lj02/o0;Leb/a0;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko0/e;->a:Lj02/o0;

    iput-object p2, p0, Lko0/e;->b:Leb/a0;

    return-void
.end method

.method private final a(Llo0/z$f;)V
    .locals 4

    invoke-virtual {p1}, Llo0/z$f;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    new-instance v1, Ll83/k;

    const-string v2, "usState"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Llo0/z$f;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "intakeResponses"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Llo0/z$f;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v3, "rescheduleAppointmentId"

    invoke-direct {v0, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v0}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "clinicianVideoSchedulingForm"

    invoke-static {v0, p1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Lko0/e;->b:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void
.end method

.method private final b(Lcom/whoop/navigation/e;)V
    .locals 1

    iget-object v0, p0, Lko0/e;->b:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v0, p0, Lko0/e;->a:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void
.end method


# virtual methods
.method public final c(Llo0/z$g;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llo0/z$a;

    if-eqz v0, :cond_0

    check-cast p1, Llo0/z$a;

    invoke-virtual {p1}, Llo0/z$a;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lko0/e;->b(Lcom/whoop/navigation/e;)V

    return-void

    :cond_0
    instance-of v0, p1, Llo0/z$f;

    if-eqz v0, :cond_1

    check-cast p1, Llo0/z$f;

    invoke-direct {p0, p1}, Lko0/e;->a(Llo0/z$f;)V

    return-void

    :cond_1
    instance-of p1, p1, Llo0/z$b;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lko0/e;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
