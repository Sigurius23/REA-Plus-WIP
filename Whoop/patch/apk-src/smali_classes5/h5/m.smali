.class public final Lh5/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/lifecycle/x;

.field public b:Landroidx/lifecycle/e0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;Landroidx/lifecycle/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh5/m;->a:Landroidx/lifecycle/x;

    iput-object p2, p0, Lh5/m;->b:Landroidx/lifecycle/e0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lh5/m;->a:Landroidx/lifecycle/x;

    iget-object v1, p0, Lh5/m;->b:Landroidx/lifecycle/e0;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lh5/m;->b:Landroidx/lifecycle/e0;

    return-void
.end method
