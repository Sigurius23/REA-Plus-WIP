.class public final Lko0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lko0/c;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "<init>",
        "(Lj02/o0;Leb/a0;)V",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "Ll83/a0;",
        "a",
        "(Lcom/whoop/navigation/e;)V",
        "Llo0/r;",
        "event",
        "b",
        "(Llo0/r;)V",
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

    iput-object p1, p0, Lko0/c;->a:Lj02/o0;

    iput-object p2, p0, Lko0/c;->b:Leb/a0;

    return-void
.end method

.method private final a(Lcom/whoop/navigation/e;)V
    .locals 3

    iget-object v0, p0, Lko0/c;->b:Leb/a0;

    sget v1, Lfo0/a;->a:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Leb/a0;->A(IZ)Z

    iget-object v0, p0, Lko0/c;->a:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void
.end method


# virtual methods
.method public final b(Llo0/r;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llo0/o;

    if-eqz v0, :cond_0

    check-cast p1, Llo0/o;

    invoke-virtual {p1}, Llo0/o;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lko0/c;->a(Lcom/whoop/navigation/e;)V

    return-void

    :cond_0
    instance-of p1, p1, Llo0/p;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lko0/c;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
