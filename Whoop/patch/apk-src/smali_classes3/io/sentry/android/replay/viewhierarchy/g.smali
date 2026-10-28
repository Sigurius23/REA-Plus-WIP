.class public abstract Lio/sentry/android/replay/viewhierarchy/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:F

.field public final d:Z

.field public final e:Z

.field public final f:Landroid/graphics/Rect;

.field public g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(IIFLio/sentry/android/replay/viewhierarchy/g;ZZLandroid/graphics/Rect;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/sentry/android/replay/viewhierarchy/g;->a:I

    iput p2, p0, Lio/sentry/android/replay/viewhierarchy/g;->b:I

    iput p3, p0, Lio/sentry/android/replay/viewhierarchy/g;->c:F

    iput-boolean p5, p0, Lio/sentry/android/replay/viewhierarchy/g;->d:Z

    iput-boolean p6, p0, Lio/sentry/android/replay/viewhierarchy/g;->e:Z

    iput-object p7, p0, Lio/sentry/android/replay/viewhierarchy/g;->f:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final a(Lc4/k;)V
    .locals 2

    invoke-virtual {p1, p0}, Lc4/k;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/replay/viewhierarchy/g;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/android/replay/viewhierarchy/g;

    invoke-virtual {v1, p1}, Lio/sentry/android/replay/viewhierarchy/g;->a(Lc4/k;)V

    goto :goto_0

    :cond_0
    return-void
.end method
