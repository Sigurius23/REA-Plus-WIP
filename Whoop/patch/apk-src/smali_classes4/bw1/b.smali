.class public final Lbw1/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lbw1/b;",
        "Landroidx/lifecycle/w1;",
        "Lvv1/a;",
        "coordinator",
        "Lcw1/a;",
        "reducer",
        "<init>",
        "(Lvv1/a;Lcw1/a;)V",
        "Lec3/l;",
        "Lbw1/c;",
        "w",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "membership_release"
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
.field private final w:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvv1/a;Lcw1/a;)V
    .locals 1

    const-string v0, "coordinator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    invoke-virtual {p1}, Lvv1/a;->n()Lec3/l;

    move-result-object p1

    new-instance v0, Lbw1/b$a;

    invoke-direct {v0, p1, p2}, Lbw1/b$a;-><init>(Lec3/l;Lcw1/a;)V

    iput-object v0, p0, Lbw1/b;->w:Lec3/l;

    return-void
.end method


# virtual methods
.method public final getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lbw1/b;->w:Lec3/l;

    return-object v0
.end method
