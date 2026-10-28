.class public final Lcom/iterable/iterableapi/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/w;


# instance fields
.field public w:Z

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/iterable/iterableapi/g1;->w:Z

    .line 5
    iput-object p1, p0, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf5/e;Z)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/iterable/iterableapi/g1;-><init>(Ljava/lang/Object;)V

    .line 7
    iput-boolean p2, p0, Lcom/iterable/iterableapi/g1;->w:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Z)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/iterable/iterableapi/g1;->w:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ZLcom/iterable/iterableapi/f1;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-boolean p1, p0, Lcom/iterable/iterableapi/g1;->w:Z

    .line 10
    iput-object p2, p0, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 7

    invoke-static {}, Lox/a;->a()[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    invoke-static {v4, p0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v4, p0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " binary detected!"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lce/w;->m0(Ljava/lang/String;)V

    const/4 v3, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v3
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/iterable/iterableapi/g1;->w:Z

    return v0
.end method

.method public c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/iterable/iterableapi/g1;->w:Z

    return v0
.end method

.method public e(Ljava/util/ArrayList;)Z
    .locals 5

    iget-object v0, p0, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :catch_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    :try_start_0
    invoke-virtual {v0, v3, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ROOT management app detected!"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lce/w;->G(Ljava/io/Serializable;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method

.method public f(ILjava/lang/CharSequence;)Z
    .locals 6

    if-eqz p2, :cond_6

    if-ltz p1, :cond_6

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr v0, p1

    if-ltz v0, :cond_6

    iget-object v0, p0, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v0, Lf5/e;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/iterable/iterableapi/g1;->b()Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    move v2, v0

    move v3, v1

    :goto_0
    const/4 v4, 0x1

    if-ge v2, p1, :cond_3

    if-ne v3, v1, :cond_3

    invoke-interface {p2, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->getDirectionality(C)B

    move-result v3

    sget-object v5, Lf5/f;->a:Lcom/iterable/iterableapi/g1;

    if-eqz v3, :cond_2

    if-eq v3, v4, :cond_1

    if-eq v3, v1, :cond_1

    packed-switch v3, :pswitch_data_0

    move v3, v1

    goto :goto_1

    :cond_1
    :pswitch_0
    move v3, v0

    goto :goto_1

    :cond_2
    :pswitch_1
    move v3, v4

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_5

    if-eq v3, v4, :cond_4

    invoke-virtual {p0}, Lcom/iterable/iterableapi/g1;->b()Z

    move-result p1

    return p1

    :cond_4
    return v0

    :cond_5
    return v4

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lr/l;Z)V
    .locals 1

    iget-object p2, p0, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast p2, Lm/i0;

    iget-boolean v0, p0, Lcom/iterable/iterableapi/g1;->w:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/iterable/iterableapi/g1;->w:Z

    iget-object v0, p2, Lm/i0;->a:Ls/t2;

    iget-object v0, v0, Ls/t2;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->f()V

    iget-object p2, p2, Lm/i0;->b:Landroid/view/Window$Callback;

    const/16 v0, 0x6c

    invoke-interface {p2, v0, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/iterable/iterableapi/g1;->w:Z

    return-void
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/iterable/iterableapi/g1;->w:Z

    sput v0, Lce/w;->E:I

    return-void
.end method

.method public i(Ljava/lang/String;)Ll53/m;
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Ll53/m;

    invoke-direct {v1, p1}, Ll53/m;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/iterable/iterableapi/g1;->w:Z

    iget-object v3, v1, Ll53/m;->b:Ljava/util/List;

    monitor-enter v3

    :try_start_0
    iget-boolean v4, v1, Ll53/m;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v4, v2, :cond_0

    monitor-exit v3

    goto :goto_0

    :cond_0
    :try_start_1
    iput-boolean v2, v1, Ll53/m;->c:Z

    iget-object v2, v1, Ll53/m;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    :goto_0
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, p1

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v3

    throw p1

    :cond_2
    :goto_1
    check-cast v1, Ll53/m;

    return-object v1
.end method

.method public s(Lr/l;)Z
    .locals 2

    iget-object v0, p0, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v0, Lm/i0;

    iget-object v0, v0, Lm/i0;->b:Landroid/view/Window$Callback;

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    const/4 p1, 0x1

    return p1
.end method
