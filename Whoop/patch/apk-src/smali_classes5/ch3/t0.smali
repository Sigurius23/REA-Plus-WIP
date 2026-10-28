.class public final Lch3/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/e;


# instance fields
.field public final w:Lxg3/k;

.field public final x:Lxg3/g;

.field public final y:Z


# direct methods
.method public constructor <init>(Lxg3/g;Lxg3/k;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lch3/t0;->w:Lxg3/k;

    iput-object p1, p0, Lch3/t0;->x:Lxg3/g;

    iput-boolean p3, p0, Lch3/t0;->y:Z

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Lxg3/s;

    iget-object v0, p0, Lch3/t0;->w:Lxg3/k;

    invoke-virtual {v0}, Lxg3/k;->a()Lxg3/j;

    move-result-object v0

    new-instance v1, Lch3/s0;

    iget-boolean v2, p0, Lch3/t0;->y:Z

    iget-object v3, p0, Lch3/t0;->x:Lxg3/g;

    invoke-direct {v1, p1, v2, v0, v3}, Lch3/s0;-><init>(Lxg3/s;ZLxg3/j;Lxg3/g;)V

    invoke-virtual {p1, v1}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {p1, v0}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {v0, v1}, Lxg3/j;->c(Lbh3/a;)Lxg3/t;

    return-void
.end method
