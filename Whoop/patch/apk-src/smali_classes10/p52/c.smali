.class public final Lp52/c;
.super Landroidx/fragment/app/v1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lp52/c;",
        "Landroidx/fragment/app/v1;",
        "Landroidx/fragment/app/o1;",
        "fragmentManager",
        "",
        "isSleep",
        "<init>",
        "(Landroidx/fragment/app/o1;Z)V",
        "",
        "position",
        "Landroidx/fragment/app/m0;",
        "t",
        "(I)Landroidx/fragment/app/m0;",
        "d",
        "()I",
        "h",
        "Z",
        "realtime-activity_release"
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
.field private final h:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/o1;Z)V
    .locals 1

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/fragment/app/v1;-><init>(Landroidx/fragment/app/o1;)V

    iput-boolean p2, p0, Lp52/c;->h:Z

    return-void
.end method


# virtual methods
.method public d()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public t(I)Landroidx/fragment/app/m0;
    .locals 0

    iget-boolean p1, p0, Lp52/c;->h:Z

    if-eqz p1, :cond_0

    sget-object p1, Lo52/a0;->y:Lo52/a0$a;

    invoke-virtual {p1}, Lo52/a0$a;->b()Lo52/a0;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lo52/a0;->y:Lo52/a0$a;

    invoke-virtual {p1}, Lo52/a0$a;->a()Lo52/a0;

    move-result-object p1

    return-object p1
.end method
