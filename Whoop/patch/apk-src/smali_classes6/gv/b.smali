.class public final Lgv/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/animation/Animator$AnimatorListener;

.field public final synthetic y:Lgv/d;


# direct methods
.method public constructor <init>(Landroid/animation/Animator$AnimatorListener;Lgv/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lgv/b;->w:I

    .line 1
    iput-object p1, p0, Lgv/b;->x:Landroid/animation/Animator$AnimatorListener;

    iput-object p2, p0, Lgv/b;->y:Lgv/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lgv/d;Landroid/animation/Animator$AnimatorListener;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lgv/b;->w:I

    .line 2
    iput-object p1, p0, Lgv/b;->y:Lgv/d;

    iput-object p2, p0, Lgv/b;->x:Landroid/animation/Animator$AnimatorListener;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lgv/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgv/b;->y:Lgv/d;

    iget-object v1, v0, Lgv/d;->G:Lb30/q3;

    iget-object v2, v0, Lgv/d;->I:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v3, p0, Lgv/b;->x:Landroid/animation/Animator$AnimatorListener;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v3, v0}, Lgv/d;->f(Landroid/animation/Animator$AnimatorListener;Lgv/d;)V

    :cond_0
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    :cond_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lgv/b;->y:Lgv/d;

    iget-object v1, v0, Lgv/d;->G:Lb30/q3;

    iget-object v2, p0, Lgv/b;->x:Landroid/animation/Animator$AnimatorListener;

    if-eqz v1, :cond_2

    invoke-static {v2, v0}, Lgv/d;->a(Landroid/animation/Animator$AnimatorListener;Lgv/d;)V

    :cond_2
    iget-object v0, v0, Lgv/d;->I:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
