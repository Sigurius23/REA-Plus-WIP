.class public final Lxg3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/a;


# instance fields
.field public final synthetic w:Lxg3/r;

.field public final synthetic x:Lxg3/j;

.field public final synthetic y:Lch3/b1;


# direct methods
.method public constructor <init>(Lch3/b1;Lxg3/r;Lxg3/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxg3/n;->y:Lch3/b1;

    iput-object p2, p0, Lxg3/n;->w:Lxg3/r;

    iput-object p3, p0, Lxg3/n;->x:Lxg3/j;

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 2

    new-instance v0, Lxg3/m;

    invoke-direct {v0, p0}, Lxg3/m;-><init>(Lxg3/n;)V

    iget-object v1, p0, Lxg3/n;->w:Lxg3/r;

    invoke-virtual {v1, v0}, Lxg3/r;->c(Lxg3/t;)V

    iget-object v1, p0, Lxg3/n;->y:Lch3/b1;

    iget-object v1, v1, Lch3/b1;->x:Lxg3/p;

    invoke-virtual {v1, v0}, Lxg3/p;->c(Lxg3/r;)Lxg3/t;

    return-void
.end method
