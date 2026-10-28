.class public final Lgg2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpb/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lgg2/b;",
        "Lpb/f;",
        "Landroidx/lifecycle/x;",
        "lifecycle",
        "<init>",
        "(Landroidx/lifecycle/x;)V",
        "w",
        "Landroidx/lifecycle/x;",
        "getLifecycle",
        "()Landroidx/lifecycle/x;",
        "Lpb/d;",
        "x",
        "Lpb/d;",
        "getSavedStateRegistry",
        "()Lpb/d;",
        "savedStateRegistry",
        "snapshot-compose-host_release"
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
.field private final w:Landroidx/lifecycle/x;

.field private final x:Lpb/d;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;)V
    .locals 2

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgg2/b;->w:Landroidx/lifecycle/x;

    new-instance p1, Lrb/a;

    new-instance v0, Lm83/p;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v1}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, p0, v0}, Lrb/a;-><init>(Lpb/f;Lm83/p;)V

    new-instance v0, Lpb/e;

    invoke-direct {v0, p1}, Lpb/e;-><init>(Lrb/a;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lpb/e;->a(Landroid/os/Bundle;)V

    iget-object p1, v0, Lpb/e;->b:Lpb/d;

    iput-object p1, p0, Lgg2/b;->x:Lpb/d;

    return-void
.end method


# virtual methods
.method public getLifecycle()Landroidx/lifecycle/x;
    .locals 1

    iget-object v0, p0, Lgg2/b;->w:Landroidx/lifecycle/x;

    return-object v0
.end method

.method public getSavedStateRegistry()Lpb/d;
    .locals 1

    iget-object v0, p0, Lgg2/b;->x:Lpb/d;

    return-object v0
.end method
