.class public final Lqg3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/g;


# instance fields
.field public final E:Z

.field public final w:Ljava/lang/reflect/Type;

.field public final x:Z

.field public final y:Z

.field public final z:Z


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;ZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg3/e;->w:Ljava/lang/reflect/Type;

    iput-boolean p2, p0, Lqg3/e;->x:Z

    iput-boolean p3, p0, Lqg3/e;->y:Z

    iput-boolean p4, p0, Lqg3/e;->z:Z

    iput-boolean p5, p0, Lqg3/e;->E:Z

    return-void
.end method


# virtual methods
.method public final adapt(Lpg3/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lch3/p;

    check-cast p1, Lpg3/b0;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lch3/p;-><init>(Ljava/lang/Object;I)V

    iget-boolean p1, p0, Lqg3/e;->x:Z

    if-eqz p1, :cond_0

    new-instance p1, Lqg3/b;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Lqg3/b;-><init>(Lxg3/e;I)V

    :goto_0
    move-object v0, p1

    goto :goto_1

    :cond_0
    iget-boolean p1, p0, Lqg3/e;->y:Z

    if-eqz p1, :cond_1

    new-instance p1, Lqg3/b;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lqg3/b;-><init>(Lxg3/e;I)V

    goto :goto_0

    :cond_1
    :goto_1
    invoke-static {v0}, Lxg3/g;->j(Lxg3/e;)Lxg3/g;

    move-result-object p1

    iget-boolean v0, p0, Lqg3/e;->z:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lxg3/g;->U()Lxg3/p;

    move-result-object p1

    return-object p1

    :cond_2
    iget-boolean v0, p0, Lqg3/e;->E:Z

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lxg3/g;->T()Lxg3/d;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method public final responseType()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lqg3/e;->w:Ljava/lang/reflect/Type;

    return-object v0
.end method
