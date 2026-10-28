.class public final Lsr/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxr/l;


# instance fields
.field public final w:Lxr/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lgm/j;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lgm/j;-><init>(Landroid/content/Context;B)V

    .line 4
    sget-object p1, Lsr/a;->b:Lng3/n;

    invoke-static {p1}, Lxr/k;->b(Lxr/l;)Lxr/k;

    move-result-object p1

    new-instance v1, Lng3/o;

    invoke-direct {v1, v0}, Lng3/o;-><init>(Lgm/j;)V

    new-instance v1, Lq3/i;

    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Lq3/i;->w:Ljava/lang/Object;

    iput-object p1, v1, Lq3/i;->x:Ljava/lang/Object;

    .line 6
    invoke-static {v1}, Lxr/k;->b(Lxr/l;)Lxr/k;

    move-result-object p1

    new-instance v0, Lsr/m;

    invoke-direct {v0, p1}, Lsr/m;-><init>(Lxr/k;)V

    invoke-static {v0}, Lxr/k;->b(Lxr/l;)Lxr/k;

    move-result-object v0

    new-instance v1, Lpg3/p;

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-direct {v1, p1, v0, v3, v2}, Lpg3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-static {v1}, Lxr/k;->b(Lxr/l;)Lxr/k;

    move-result-object p1

    iput-object p1, p0, Lsr/m;->w:Lxr/k;

    return-void
.end method

.method public constructor <init>(Lxr/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsr/m;->w:Lxr/k;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lsr/m;->w:Lxr/k;

    invoke-virtual {v0}, Lxr/k;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lsr/l;

    check-cast v0, Lsr/h;

    invoke-direct {v1, v0}, Lsr/l;-><init>(Lsr/h;)V

    return-object v1
.end method
