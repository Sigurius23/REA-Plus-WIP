.class public final Lzy1/f;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lzy1/f;",
        "Landroidx/lifecycle/w1;",
        "Lpy1/a;",
        "mfaAnalyticsHelper",
        "<init>",
        "(Lpy1/a;)V",
        "Lzy1/e;",
        "event",
        "Ll83/a0;",
        "g",
        "(Lzy1/e;)V",
        "w",
        "Lpy1/a;",
        "mfa_release"
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
.field private final w:Lpy1/a;


# direct methods
.method public constructor <init>(Lpy1/a;)V
    .locals 1

    const-string v0, "mfaAnalyticsHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lzy1/f;->w:Lpy1/a;

    return-void
.end method


# virtual methods
.method public final g(Lzy1/e;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lzy1/e$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzy1/f;->w:Lpy1/a;

    check-cast p1, Lzy1/e$a;

    invoke-virtual {p1}, Lzy1/e$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lpy1/a;->w(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
