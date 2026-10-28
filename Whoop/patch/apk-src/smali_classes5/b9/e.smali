.class public final Lb9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lyr/i;

.field public final b:Landroid/os/Handler;

.field public c:Lb9/l0;

.field public d:Lu8/d;

.field public e:I

.field public f:I

.field public g:F

.field public h:Lv8/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lb9/l0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lb9/e;->g:F

    new-instance v0, Lb9/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lb9/d;-><init>(Landroid/content/Context;I)V

    instance-of p1, v0, Ljava/io/Serializable;

    if-eqz p1, :cond_0

    new-instance p1, Lyr/j;

    invoke-direct {p1, v0}, Lyr/j;-><init>(Lyr/i;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lyr/k;

    invoke-direct {p1, v0}, Lyr/k;-><init>(Lyr/i;)V

    :goto_0
    iput-object p1, p0, Lb9/e;->a:Lyr/i;

    iput-object p3, p0, Lb9/e;->c:Lb9/l0;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lb9/e;->b:Landroid/os/Handler;

    const/4 p1, 0x0

    iput p1, p0, Lb9/e;->e:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget v0, p0, Lb9/e;->e:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb9/e;->h:Lv8/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lb9/e;->a:Lyr/i;

    invoke-interface {v0}, Lyr/i;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iget-object v1, p0, Lb9/e;->h:Lv8/a;

    sget v2, Lx8/t;->a:I

    const/16 v3, 0x1a

    if-lt v2, v3, :cond_1

    iget-object v1, v1, Lv8/a;->f:Landroid/media/AudioFocusRequest;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocusRequest(Landroid/media/AudioFocusRequest;)I

    return-void

    :cond_1
    iget-object v1, v1, Lv8/a;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    :cond_2
    :goto_0
    return-void
.end method

.method public final b(I)V
    .locals 4

    iget-object v0, p0, Lb9/e;->c:Lb9/l0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lb9/l0;->H:Lx8/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lx8/r;->b()Lx8/q;

    move-result-object v1

    iget-object v0, v0, Lx8/r;->a:Landroid/os/Handler;

    const/16 v2, 0x21

    const/4 v3, 0x0

    invoke-virtual {v0, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    iput-object p1, v1, Lx8/q;->a:Landroid/os/Message;

    invoke-virtual {v1}, Lx8/q;->b()V

    :cond_0
    return-void
.end method

.method public final c(I)V
    .locals 1

    iget v0, p0, Lb9/e;->e:I

    if-ne v0, p1, :cond_0

    goto :goto_1

    :cond_0
    iput p1, p0, Lb9/e;->e:I

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    const p1, 0x3e4ccccd    # 0.2f

    goto :goto_0

    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    iget v0, p0, Lb9/e;->g:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iput p1, p0, Lb9/e;->g:F

    iget-object p1, p0, Lb9/e;->c:Lb9/l0;

    if-eqz p1, :cond_3

    iget-object p1, p1, Lb9/l0;->H:Lx8/r;

    const/16 v0, 0x22

    invoke-virtual {p1, v0}, Lx8/r;->e(I)Z

    :cond_3
    :goto_1
    return-void
.end method

.method public final d(IZ)I
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_9

    iget p1, p0, Lb9/e;->f:I

    if-ne p1, v1, :cond_9

    const/4 v2, 0x3

    const/4 v3, -0x1

    if-eqz p2, :cond_6

    iget p2, p0, Lb9/e;->e:I

    const/4 v4, 0x2

    if-ne p2, v4, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object p2, p0, Lb9/e;->h:Lv8/a;

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    if-nez p2, :cond_2

    new-instance p2, Ld/s;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    sget-object v5, Lu8/d;->c:Lu8/d;

    iput-object v5, p2, Ld/s;->c:Ljava/lang/Object;

    iput p1, p2, Ld/s;->a:I

    goto :goto_0

    :cond_2
    new-instance p1, Ld/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iget v5, p2, Lv8/a;->a:I

    iput v5, p1, Ld/s;->a:I

    iget-object v5, p2, Lv8/a;->d:Lu8/d;

    iput-object v5, p1, Ld/s;->c:Ljava/lang/Object;

    iget-boolean p2, p2, Lv8/a;->e:Z

    iput-boolean p2, p1, Ld/s;->b:Z

    move-object p2, p1

    :goto_0
    iget-object p1, p0, Lb9/e;->d:Lu8/d;

    if-eqz p1, :cond_3

    iget v5, p1, Lu8/d;->a:I

    if-ne v5, v1, :cond_3

    move v0, v1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p2, Ld/s;->c:Ljava/lang/Object;

    iput-boolean v0, p2, Ld/s;->b:Z

    new-instance v7, Lb9/c;

    const/4 p1, 0x0

    invoke-direct {v7, p0, p1}, Lb9/c;-><init>(Ljava/lang/Object;I)V

    iget-object v8, p0, Lb9/e;->b:Landroid/os/Handler;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lv8/a;

    iget v6, p2, Ld/s;->a:I

    iget-object p1, p2, Ld/s;->c:Ljava/lang/Object;

    move-object v9, p1

    check-cast v9, Lu8/d;

    iget-boolean v10, p2, Ld/s;->b:Z

    invoke-direct/range {v5 .. v10}, Lv8/a;-><init>(ILandroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;Lu8/d;Z)V

    iput-object v5, p0, Lb9/e;->h:Lv8/a;

    :goto_1
    iget-object p1, p0, Lb9/e;->a:Lyr/i;

    invoke-interface {p1}, Lyr/i;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    iget-object p2, p0, Lb9/e;->h:Lv8/a;

    sget v0, Lx8/t;->a:I

    const/16 v5, 0x1a

    if-lt v0, v5, :cond_4

    iget-object p2, p2, Lv8/a;->f:Landroid/media/AudioFocusRequest;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, p2}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    move-result p1

    goto :goto_2

    :cond_4
    iget-object v0, p2, Lv8/a;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    iget-object v5, p2, Lv8/a;->d:Lu8/d;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p2, Lv8/a;->a:I

    invoke-virtual {p1, v0, v2, p2}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result p1

    :goto_2
    if-ne p1, v1, :cond_5

    invoke-virtual {p0, v4}, Lb9/e;->c(I)V

    return v1

    :cond_5
    invoke-virtual {p0, v1}, Lb9/e;->c(I)V

    return v3

    :cond_6
    iget p1, p0, Lb9/e;->e:I

    if-eq p1, v1, :cond_8

    if-eq p1, v2, :cond_7

    :goto_3
    return v1

    :cond_7
    return v0

    :cond_8
    return v3

    :cond_9
    invoke-virtual {p0}, Lb9/e;->a()V

    invoke-virtual {p0, v0}, Lb9/e;->c(I)V

    return v1
.end method
