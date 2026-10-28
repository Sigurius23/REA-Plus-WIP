.class public final Ln41/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R+\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00028F@@X\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0007\u0010\t\"\u0004\u0008\n\u0010\u0005\u00a8\u0006\u000c"
    }
    d2 = {
        "Ln41/f;",
        "",
        "",
        "remainingMs",
        "<init>",
        "(J)V",
        "<set-?>",
        "a",
        "Lp1/b1;",
        "()J",
        "b",
        "timeMs",
        "design_release"
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
.field private final a:Lp1/b1;


# direct methods
.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp1/i1;

    invoke-direct {v0, p1, p2}, Lp1/i1;-><init>(J)V

    iput-object v0, p0, Ln41/f;->a:Lp1/b1;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, Ln41/f;->a:Lp1/b1;

    check-cast v0, Lp1/i1;

    invoke-virtual {v0}, Lp1/i1;->x()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b(J)V
    .locals 1

    iget-object v0, p0, Ln41/f;->a:Lp1/b1;

    check-cast v0, Lp1/i1;

    invoke-virtual {v0, p1, p2}, Lp1/i1;->y(J)V

    return-void
.end method
