.class public final Landroidx/lifecycle/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/lifecycle/x;

.field public final b:Landroidx/lifecycle/w;

.field public final c:Landroidx/lifecycle/n;

.field public final d:Landroidx/lifecycle/y;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;Landroidx/lifecycle/w;Landroidx/lifecycle/n;Lbc3/k1;)V
    .locals 1

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatchQueue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/z;->a:Landroidx/lifecycle/x;

    iput-object p2, p0, Landroidx/lifecycle/z;->b:Landroidx/lifecycle/w;

    iput-object p3, p0, Landroidx/lifecycle/z;->c:Landroidx/lifecycle/n;

    new-instance p2, Landroidx/lifecycle/y;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p0, p4}, Landroidx/lifecycle/y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Landroidx/lifecycle/z;->d:Landroidx/lifecycle/y;

    invoke-virtual {p1}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object p3

    sget-object v0, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-ne p3, v0, :cond_0

    const/4 p1, 0x0

    invoke-interface {p4, p1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {p0}, Landroidx/lifecycle/z;->a()V

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/z;->a:Landroidx/lifecycle/x;

    iget-object v1, p0, Landroidx/lifecycle/z;->d:Landroidx/lifecycle/y;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    const/4 v0, 0x1

    iget-object v1, p0, Landroidx/lifecycle/z;->c:Landroidx/lifecycle/n;

    iput-boolean v0, v1, Landroidx/lifecycle/n;->b:Z

    invoke-virtual {v1}, Landroidx/lifecycle/n;->a()V

    return-void
.end method
