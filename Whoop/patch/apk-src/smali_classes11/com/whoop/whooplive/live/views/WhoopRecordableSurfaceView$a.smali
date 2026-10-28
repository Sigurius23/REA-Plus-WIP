.class Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;
.super Ljava/lang/Thread;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field E:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field F:[I

.field private G:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

.field w:Landroid/opengl/EGLDisplay;

.field x:Landroid/opengl/EGLContext;

.field y:Landroid/opengl/EGLSurface;

.field z:Landroid/opengl/EGLSurface;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)V
    .locals 2

    iput-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->E:Ljava/util/LinkedList;

    const/16 p1, 0xf

    new-array p1, p1, [I

    fill-array-data p1, :array_0

    iput-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->F:[I

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->F:[I

    const/16 v0, 0xa

    const/16 v1, 0x3142

    aput v1, p1, v0

    return-void

    :array_0
    .array-data 4
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3040
        0x4
        0x3142
        0x1
        0x3025
        0x10
        0x3038
    .end array-data
.end method


# virtual methods
.method public a(Landroid/opengl/EGLDisplay;)Landroid/opengl/EGLConfig;
    .locals 9

    const/4 v0, 0x0

    filled-new-array {v0}, [I

    move-result-object v7

    const/4 v6, 0x1

    new-array v4, v6, [Landroid/opengl/EGLConfig;

    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->F:[I

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    aget-object p1, v4, v0

    return-object p1
.end method

.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v0}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->a(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    const/4 v2, 0x2

    new-array v3, v2, [I

    const/4 v4, 0x1

    invoke-static {v1, v3, v0, v3, v4}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    invoke-virtual {p0, v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->a(Landroid/opengl/EGLDisplay;)Landroid/opengl/EGLConfig;

    move-result-object v1

    iget-object v3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    const/16 v6, 0x3098

    const/16 v7, 0x3038

    filled-new-array {v6, v2, v7}, [I

    move-result-object v2

    invoke-static {v3, v1, v5, v2, v0}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    move-result-object v2

    iput-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->x:Landroid/opengl/EGLContext;

    filled-new-array {v7}, [I

    move-result-object v2

    iget-object v3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    iget-object v5, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v3, v1, v5, v2, v0}, Landroid/opengl/EGL14;->eglCreateWindowSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Ljava/lang/Object;[II)Landroid/opengl/EGLSurface;

    move-result-object v3

    iput-object v3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->y:Landroid/opengl/EGLSurface;

    iget-object v5, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    iget-object v6, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->x:Landroid/opengl/EGLContext;

    invoke-static {v5, v3, v3, v6}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    iget-object v3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v3}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v3}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v3}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;

    invoke-interface {v3}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;->a()V

    :cond_1
    iget-object v3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    iget-object v5, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    iget-object v5, v5, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->w:Landroid/view/Surface;

    invoke-static {v3, v1, v5, v2, v0}, Landroid/opengl/EGL14;->eglCreateWindowSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Ljava/lang/Object;[II)Landroid/opengl/EGLSurface;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->z:Landroid/opengl/EGLSurface;

    const/high16 v1, 0x3f800000    # 1.0f

    const v2, 0x3dcccccd    # 0.1f

    invoke-static {v2, v2, v2, v1}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->a(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;

    invoke-interface {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;->b()V

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :goto_0
    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->d(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Z

    move-result v1

    if-nez v1, :cond_b

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->e(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    sget v2, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->O:I

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->f(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->f(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_3
    move v1, v4

    goto :goto_1

    :cond_4
    move v1, v0

    :goto_1
    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v2}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->h(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v2}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->i(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)I

    move-result v2

    iget-object v3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v3}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->b(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)I

    move-result v3

    invoke-static {v0, v0, v2, v3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v2}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v2}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v2}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;

    iget-object v3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v3}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->i(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)I

    move-result v3

    iget-object v5, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v5}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->b(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)I

    move-result v5

    invoke-interface {v2, v3, v5}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;->onSurfaceChanged(II)V

    :cond_5
    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v2}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->h(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_6
    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;

    invoke-interface {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;->c()V

    :cond_7
    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;

    invoke-interface {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;->e()V

    :cond_8
    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->y:Landroid/opengl/EGLSurface;

    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglSwapBuffers(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->c(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->z:Landroid/opengl/EGLSurface;

    iget-object v3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->x:Landroid/opengl/EGLContext;

    invoke-static {v1, v2, v2, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;

    invoke-interface {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;->e()V

    :cond_9
    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->z:Landroid/opengl/EGLSurface;

    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglSwapBuffers(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->y:Landroid/opengl/EGLSurface;

    iget-object v3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->x:Landroid/opengl/EGLContext;

    invoke-static {v1, v2, v2, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    :cond_a
    :goto_2
    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->E:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v1

    if-lez v1, :cond_b

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->E:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_2

    :cond_b
    const-wide/16 v1, 0x10

    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;

    invoke-interface {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;->d()V

    :cond_c
    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    if-eqz v1, :cond_f

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v1, v2, v2, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->y:Landroid/opengl/EGLSurface;

    if-eqz v1, :cond_d

    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    invoke-static {v2, v1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    :cond_d
    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->z:Landroid/opengl/EGLSurface;

    if-eqz v1, :cond_e

    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    invoke-static {v2, v1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    :cond_e
    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->x:Landroid/opengl/EGLContext;

    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->a(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->w:Landroid/opengl/EGLDisplay;

    invoke-static {v0}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    iget-object v0, v0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->w:Landroid/view/Surface;

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    :cond_f
    :goto_3
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 1

    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {p1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->i(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)I

    move-result p1

    if-ne p3, p1, :cond_1

    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {p1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->b(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)I

    move-result p1

    if-eq p4, p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-static {p4}, Lvz2/a;->b(I)I

    move-result p1

    invoke-static {p3}, Lvz2/a;->a(I)I

    move-result p2

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {v0, p3}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->k(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;I)V

    iget-object p3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {p3, p4}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->j(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;I)V

    iget-object p3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {p3}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->i(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)I

    move-result p3

    if-le p1, p3, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {p3, p1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->k(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;I)V

    :cond_2
    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {p1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->b(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)I

    move-result p1

    if-le p2, p1, :cond_3

    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {p1, p2}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->j(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;I)V

    :cond_3
    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-static {p1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->h(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Thread;->isAlive()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object p1

    sget-object v0, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    :cond_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->H:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method

.method public surfaceRedrawNeeded(Landroid/view/SurfaceHolder;)V
    .locals 0

    return-void
.end method
