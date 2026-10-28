.class public final Lg/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;
.implements Lg/b;


# instance fields
.field public final w:Landroidx/lifecycle/x;

.field public final x:Lg/t;

.field public y:Lg/y;

.field public final synthetic z:Lg/z;


# direct methods
.method public constructor <init>(Lg/z;Landroidx/lifecycle/x;Lg/t;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "onBackPressedCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg/x;->z:Lg/z;

    iput-object p2, p0, Lg/x;->w:Landroidx/lifecycle/x;

    iput-object p3, p0, Lg/x;->x:Lg/t;

    invoke-virtual {p2, p0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lg/x;->w:Landroidx/lifecycle/x;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    iget-object v0, p0, Lg/x;->x:Lg/t;

    invoke-virtual {v0, p0}, Lg/t;->i(Lg/b;)V

    iget-object v0, p0, Lg/x;->y:Lg/y;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg/y;->cancel()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lg/x;->y:Lg/y;

    return-void
.end method

.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lg/x;->z:Lg/z;

    iget-object p2, p0, Lg/x;->x:Lg/t;

    invoke-virtual {p1, p2}, Lg/z;->b(Lg/t;)Lg/y;

    move-result-object p1

    iput-object p1, p0, Lg/x;->y:Lg/y;

    return-void

    :cond_0
    sget-object p1, Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Lg/x;->y:Lg/y;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lg/y;->cancel()V

    return-void

    :cond_1
    sget-object p1, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_2

    invoke-virtual {p0}, Lg/x;->cancel()V

    :cond_2
    return-void
.end method
