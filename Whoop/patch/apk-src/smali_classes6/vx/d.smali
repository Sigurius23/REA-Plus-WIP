.class public final synthetic Lvx/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic w:Landroidx/lifecycle/k1;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvx/d;->w:Landroidx/lifecycle/k1;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget-object v0, p0, Lvx/d;->w:Landroidx/lifecycle/k1;

    const-string v1, "STRIPE_ANALYTICS_LOCAL_SESSION"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvx/c;

    if-eqz v0, :cond_2

    instance-of v1, v0, Lvx/b;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    sput-boolean v0, Lrv/n;->a:Z

    return-void

    :cond_0
    instance-of v0, v0, Lvx/a;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    :goto_0
    return-void
.end method
