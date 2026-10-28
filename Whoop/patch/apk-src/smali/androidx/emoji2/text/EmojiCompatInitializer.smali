.class public Landroidx/emoji2/text/EmojiCompatInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyb/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lyb/b;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Landroid/content/Context;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lh6/t;

    new-instance v1, Lbl/d;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lbl/d;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Lh6/t;-><init>(Lh6/i;)V

    const/4 v1, 0x1

    iput v1, v0, Lh6/t;->b:I

    sget-object v1, Lh6/j;->k:Lh6/j;

    if-nez v1, :cond_1

    sget-object v1, Lh6/j;->j:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lh6/j;->k:Lh6/j;

    if-nez v2, :cond_0

    new-instance v2, Lh6/j;

    invoke-direct {v2, v0}, Lh6/j;-><init>(Lh6/t;)V

    sput-object v2, Lh6/j;->k:Lh6/j;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    goto :goto_2

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    invoke-static {p1}, Lyb/a;->c(Landroid/content/Context;)Lyb/a;

    move-result-object p1

    const-class v0, Landroidx/lifecycle/ProcessLifecycleInitializer;

    invoke-virtual {p1, v0}, Lyb/a;->d(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/g0;

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    new-instance v0, Lh6/k;

    invoke-direct {v0, p0, p1}, Lh6/k;-><init>(Landroidx/emoji2/text/EmojiCompatInitializer;Landroidx/lifecycle/x;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final dependencies()Ljava/util/List;
    .locals 1

    const-class v0, Landroidx/lifecycle/ProcessLifecycleInitializer;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
