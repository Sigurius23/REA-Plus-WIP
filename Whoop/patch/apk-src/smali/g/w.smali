.class public final Lg/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lg/u;

.field public final synthetic b:Lg/u;

.field public final synthetic c:Lg/v;

.field public final synthetic d:Lg/v;


# direct methods
.method public constructor <init>(Lg/u;Lg/u;Lg/v;Lg/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg/w;->a:Lg/u;

    iput-object p2, p0, Lg/w;->b:Lg/u;

    iput-object p3, p0, Lg/w;->c:Lg/v;

    iput-object p4, p0, Lg/w;->d:Lg/v;

    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    iget-object v0, p0, Lg/w;->d:Lg/v;

    invoke-virtual {v0}, Lg/v;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Lg/w;->c:Lg/v;

    invoke-virtual {v0}, Lg/v;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 1

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg/a;

    invoke-direct {v0, p1}, Lg/a;-><init>(Landroid/window/BackEvent;)V

    iget-object p1, p0, Lg/w;->b:Lg/u;

    invoke-virtual {p1, v0}, Lg/u;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 1

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg/a;

    invoke-direct {v0, p1}, Lg/a;-><init>(Landroid/window/BackEvent;)V

    iget-object p1, p0, Lg/w;->a:Lg/u;

    invoke-virtual {p1, v0}, Lg/u;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
