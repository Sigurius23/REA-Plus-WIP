.class public final Leu/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/x;

.field public final synthetic b:Leu/k;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Leu/s;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;Leu/k;Landroid/content/Context;Leu/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leu/p;->a:Landroidx/lifecycle/x;

    iput-object p2, p0, Leu/p;->b:Leu/k;

    iput-object p3, p0, Leu/p;->c:Landroid/content/Context;

    iput-object p4, p0, Leu/p;->d:Leu/s;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    iget-object v0, p0, Leu/p;->a:Landroidx/lifecycle/x;

    iget-object v1, p0, Leu/p;->b:Leu/k;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    iget-object v0, p0, Leu/p;->c:Landroid/content/Context;

    iget-object v1, p0, Leu/p;->d:Leu/s;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void
.end method
