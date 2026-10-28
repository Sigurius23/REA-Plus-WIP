.class public final Li2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/f0;


# static fields
.field public static f:Z = true


# instance fields
.field public final a:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final b:Ljava/lang/Object;

.field public c:Lm2/b;

.field public d:Z

.field public final e:Li2/e;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/f;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Li2/f;->b:Ljava/lang/Object;

    new-instance v0, Li2/e;

    invoke-direct {v0, p0}, Li2/e;-><init>(Li2/f;)V

    iput-object v0, p0, Li2/f;->e:Li2/e;

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-boolean v2, p0, Li2/f;->d:Z

    if-nez v2, :cond_0

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Li2/f;->d:Z

    :cond_0
    new-instance v0, Lb3/c0;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lb3/c0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method


# virtual methods
.method public final a()Ll2/c;
    .locals 6

    iget-object v0, p0, Li2/f;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Li2/f;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v2, v3, :cond_0

    invoke-static {v1}, Li2/b;->b(Landroidx/compose/ui/platform/AndroidComposeView;)J

    :cond_0
    if-lt v2, v3, :cond_1

    new-instance v1, Ll2/g;

    invoke-direct {v1}, Ll2/g;-><init>()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    sget-boolean v1, Li2/f;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, -0x1

    if-eqz v1, :cond_3

    :try_start_1
    new-instance v1, Ll2/f;

    iget-object v3, p0, Li2/f;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-direct {v1, v3}, Ll2/f;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    const/4 v1, 0x0

    :try_start_2
    sput-boolean v1, Li2/f;->f:Z

    new-instance v1, Ll2/i;

    iget-object v3, p0, Li2/f;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v4, p0, Li2/f;->c:Lm2/b;

    if-nez v4, :cond_2

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    new-instance v5, Lm2/b;

    invoke-direct {v5, v4}, Lm2/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v5, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->addView(Landroid/view/View;I)V

    iput-object v5, p0, Li2/f;->c:Lm2/b;

    move-object v4, v5

    :cond_2
    invoke-direct {v1, v4}, Ll2/i;-><init>(Lm2/a;)V

    goto :goto_0

    :cond_3
    new-instance v1, Ll2/i;

    iget-object v3, p0, Li2/f;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v4, p0, Li2/f;->c:Lm2/b;

    if-nez v4, :cond_4

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    new-instance v5, Lm2/b;

    invoke-direct {v5, v4}, Lm2/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v5, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->addView(Landroid/view/View;I)V

    iput-object v5, p0, Li2/f;->c:Lm2/b;

    move-object v4, v5

    :cond_4
    invoke-direct {v1, v4}, Ll2/i;-><init>(Lm2/a;)V

    :goto_0
    new-instance v2, Ll2/c;

    invoke-direct {v2, v1}, Ll2/c;-><init>(Ll2/e;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object v2

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final b(Ll2/c;)V
    .locals 2

    iget-object v0, p0, Li2/f;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p1, Ll2/c;->s:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p1, Ll2/c;->s:Z

    invoke-virtual {p1}, Ll2/c;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method
