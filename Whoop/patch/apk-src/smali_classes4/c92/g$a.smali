.class Lc92/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc92/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic w:Lc92/g;


# direct methods
.method public constructor <init>(Lc92/g;)V
    .locals 0

    iput-object p1, p0, Lc92/g$a;->w:Lc92/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lc92/g$a;->w:Lc92/g;

    invoke-static {v0}, Lc92/g;->n(Lc92/g;)Ltd1/b;

    move-result-object v0

    invoke-interface {v0}, Ltd1/b;->A()Ltd1/e;

    move-result-object v0

    invoke-virtual {v0}, Ltd1/e;->isReady()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lc92/g$a;->w:Lc92/g;

    invoke-static {v0}, Lc92/g;->l(Lc92/g;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Connect timeout expired and no strap is ready, aborting foreground"

    invoke-interface {v0, v2, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lc92/g$a;->w:Lc92/g;

    invoke-static {v0}, Lc92/g;->u(Lc92/g;)V

    :cond_0
    return-void
.end method
