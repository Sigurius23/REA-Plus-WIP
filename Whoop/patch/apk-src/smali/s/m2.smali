.class public final Ls/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/n;
.implements Lg5/d;
.implements Ly1/e;
.implements Lne3/o0;


# instance fields
.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    sparse-switch p1, :sswitch_data_0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance p1, Ljc/b;

    const/16 v0, 0x17

    .line 12
    invoke-direct {p1, v0}, Ljc/b;-><init>(I)V

    .line 13
    iput-object p1, p0, Ls/m2;->y:Ljava/lang/Object;

    return-void

    .line 14
    :sswitch_0
    new-instance p1, Lyl/c;

    .line 15
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Lyl/a;

    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Ls/m2;->w:Ljava/lang/Object;

    .line 20
    iput-object p1, p0, Ls/m2;->x:Ljava/lang/Object;

    .line 21
    iput-object v0, p0, Ls/m2;->y:Ljava/lang/Object;

    return-void

    .line 22
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lx1/c;->c:Lx1/i;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ls/m2;->w:Ljava/lang/Object;

    .line 24
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Ls/m2;->x:Ljava/lang/Object;

    return-void

    .line 26
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Ls/m2;->w:Ljava/lang/Object;

    .line 28
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Ls/m2;->x:Ljava/lang/Object;

    .line 29
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Ls/m2;->y:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_2
        0xa -> :sswitch_1
        0xc -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ls/m2;->w:Ljava/lang/Object;

    .line 32
    iput-object p2, p0, Ls/m2;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg5/f;Lul/a;Ljc/b;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ls/m2;->y:Ljava/lang/Object;

    .line 35
    iput-object p2, p0, Ls/m2;->w:Ljava/lang/Object;

    .line 36
    iput-object p3, p0, Ls/m2;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls/m2;->w:Ljava/lang/Object;

    iput-object p2, p0, Ls/m2;->x:Ljava/lang/Object;

    iput-object p3, p0, Ls/m2;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    iput-object v0, p0, Ls/m2;->w:Ljava/lang/Object;

    .line 8
    iput-object p1, p0, Ls/m2;->x:Ljava/lang/Object;

    .line 9
    sget-object p1, Lvg/s;->a:Lvg/s;

    iput-object p1, p0, Ls/m2;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lne3/o0;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ls/m2;->w:Ljava/lang/Object;

    .line 4
    invoke-interface {p1}, Lne3/o0;->getSource()Lne3/p0;

    move-result-object v0

    invoke-static {v0}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v0

    iput-object v0, p0, Ls/m2;->x:Ljava/lang/Object;

    .line 5
    invoke-interface {p1}, Lne3/o0;->d()Lne3/n0;

    move-result-object p1

    invoke-static {p1}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object p1

    iput-object p1, p0, Ls/m2;->y:Ljava/lang/Object;

    return-void
.end method

.method public static varargs o(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    return-void
.end method

.method public static p(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ls/m2;
    .locals 1

    new-instance v0, Ls/m2;

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ls/m2;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    return-object v0
.end method

.method public static q(Landroid/content/Context;Landroid/util/AttributeSet;[II)Ls/m2;
    .locals 2

    new-instance v0, Ls/m2;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ls/m2;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lul/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lul/b;

    invoke-interface {v0}, Lul/b;->b()Lul/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lul/d;->a(Z)V

    :cond_0
    iget-object v0, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v0, Ljc/b;

    iget v0, v0, Ljc/b;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :pswitch_0
    iget-object v0, p0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v0, Lg5/f;

    invoke-virtual {v0, p1}, Lg5/f;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
.end method

.method public b()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v0, Lg5/f;

    invoke-virtual {v0}, Lg5/f;->b()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v0, Lul/a;

    invoke-interface {v0}, Lul/a;->create()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    const-string v2, "FactoryPools"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Created new "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    instance-of v1, v0, Lul/b;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lul/b;

    invoke-interface {v1}, Lul/b;->b()Lul/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lul/d;->a(Z)V

    :cond_1
    return-object v0
.end method

.method public c()Lts/h;
    .locals 4

    iget-object v0, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v1, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v1, Lts/g;

    if-eqz v1, :cond_0

    new-instance v1, Lts/h;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v2, Lts/g;

    iget-object v3, p0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v3, Lct/a;

    invoke-direct {v1, v0, v2, v3}, Lts/h;-><init>(ILts/g;Lct/a;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v0, Lne3/o0;

    invoke-interface {v0}, Lne3/o0;->cancel()V

    return-void
.end method

.method public convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v0, Lad3/z;

    iget-object v1, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v1, Lud3/h0;

    iget-object v2, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v2, Lwc3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "contentType"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "saver"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lwc3/l;

    check-cast v0, Lad3/c;

    invoke-virtual {v0, v2, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lud3/v0;->create(Lud3/h0;Ljava/lang/String;)Lud3/v0;

    move-result-object p1

    const-string v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public d()Lne3/n0;
    .locals 1

    iget-object v0, p0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v0, Lne3/h0;

    return-object v0
.end method

.method public e()V
    .locals 5

    iget-object v0, p0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashSet;

    iget-object v1, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v1, Lnf3/a;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, v1, Lnf3/a;->c:Lq83/g;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lq83/g;->D(I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v1, Lnf3/a;->c:Lq83/g;

    const-string v3, "Creating eager instances ..."

    invoke-virtual {v2, v3}, Lq83/g;->r(Ljava/lang/String;)V

    :cond_0
    new-instance v2, La3/p;

    iget-object v3, v1, Lnf3/a;->a:Lwf3/a;

    iget-object v3, v3, Lwf3/a;->d:Lxf3/c;

    const/4 v4, 0x0

    invoke-direct {v2, v1, v3, v4}, La3/p;-><init>(Lnf3/a;Lxf3/c;Luf3/a;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrf3/d;

    invoke-virtual {v3, v2}, Lrf3/d;->b(La3/p;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    return-void
.end method

.method public f()Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lx1/c;->c()J

    move-result-wide v0

    sget-wide v2, Lx1/j;->a:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iget-object v0, p0, Ls/m2;->y:Ljava/lang/Object;

    return-object v0

    :cond_0
    iget-object v2, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/i;

    invoke-virtual {v2, v0, v1}, Lx1/i;->a(J)I

    move-result v0

    if-ltz v0, :cond_1

    iget-object v1, v2, Lx1/i;->c:[Ljava/lang/Object;

    aget-object v0, v1, v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public g(Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lvg/i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lvg/i;

    iget v1, v0, Lvg/i;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvg/i;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvg/i;

    invoke-direct {v0, p0, p1}, Lvg/i;-><init>(Ls/m2;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lvg/i;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvg/i;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lvg/i;->x:Ls/m2;

    iget-object v0, v0, Lvg/i;->w:Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lvg/i;->y:I

    iget-object v4, v0, Lvg/i;->w:Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v4

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast p1, Lmc3/c;

    iput-object p1, v0, Lvg/i;->w:Lmc3/a;

    const/4 v2, 0x0

    iput v2, v0, Lvg/i;->y:I

    iput v4, v0, Lvg/i;->F:I

    invoke-virtual {p1, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    :try_start_1
    iget-object v4, p0, Ls/m2;->y:Ljava/lang/Object;

    sget-object v6, Lvg/s;->a:Lvg/s;

    if-ne v4, v6, :cond_6

    iget-object v4, p0, Ls/m2;->x:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, v0, Lvg/i;->w:Lmc3/a;

    iput-object p0, v0, Lvg/i;->x:Ls/m2;

    iput v2, v0, Lvg/i;->y:I

    iput v3, v0, Lvg/i;->F:I

    invoke-interface {v4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    move-object v1, p0

    :goto_3
    :try_start_2
    iput-object p1, v1, Ls/m2;->y:Ljava/lang/Object;

    iput-object v5, p0, Ls/m2;->x:Ljava/lang/Object;

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    goto :goto_5

    :cond_6
    move-object v0, p1

    :goto_4
    iget-object p1, p0, Ls/m2;->y:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p1

    :goto_5
    invoke-interface {v0, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public getSource()Lne3/p0;
    .locals 1

    iget-object v0, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v0, Lne3/j0;

    return-object v0
.end method

.method public h(I)Landroid/content/res/ColorStateList;
    .locals 3

    iget-object v0, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-static {v2, v1}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public i()Ls3/b;
    .locals 7

    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    move-result-object v0

    iget-object v1, p0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v1, Ljc/b;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v2, Ls3/b;

    if-eqz v2, :cond_0

    iget-object v3, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v3, Landroid/os/LocaleList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v3, :cond_0

    monitor-exit v1

    return-object v2

    :cond_0
    :try_start_1
    invoke-virtual {v0}, Landroid/os/LocaleList;->size()I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    new-instance v5, Ls3/a;

    invoke-virtual {v0, v4}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v6

    invoke-direct {v5, v6}, Ls3/a;-><init>(Ljava/util/Locale;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    new-instance v2, Ls3/b;

    invoke-direct {v2, v3}, Ls3/b;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Ls/m2;->w:Ljava/lang/Object;

    iput-object v2, p0, Ls/m2;->x:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v2

    :goto_1
    monitor-exit v1

    throw v0
.end method

.method public j(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, v1}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public k(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    iget-object v0, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Ls/p;->a()Ls/p;

    move-result-object v0

    iget-object v1, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Ls/p;->a:Ls/c2;

    const/4 v3, 0x1

    invoke-virtual {v2, v1, p1, v3}, Ls/c2;->d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public l(IILs/n0;)Landroid/graphics/Typeface;
    .locals 9

    iget-object v0, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ls/m2;->y:Ljava/lang/Object;

    check-cast p1, Landroid/util/TypedValue;

    if-nez p1, :cond_1

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    iput-object p1, p0, Ls/m2;->y:Ljava/lang/Object;

    :cond_1
    iget-object p1, p0, Ls/m2;->w:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Landroid/content/Context;

    iget-object p1, p0, Ls/m2;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroid/util/TypedValue;

    sget-object p1, Lu4/k;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_2
    const/4 v7, 0x1

    const/4 v8, 0x0

    move v5, p2

    move-object v6, p3

    invoke-static/range {v2 .. v8}, Lu4/k;->c(Landroid/content/Context;ILandroid/util/TypedValue;ILu4/b;ZZ)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public m(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    iget-object v0, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v0, Lyl/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Lyl/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/io/File;

    const-string v1, "lib"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public n(Landroid/content/Context;Ljava/lang/String;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    iget-object v0, v1, Ls/m2;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lyl/c;

    iget-object v0, v1, Ls/m2;->w:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/HashSet;

    invoke-virtual {v5, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "%s already loaded previously!"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Ls/m2;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 v6, 0x0

    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "%s (%s) was loaded normally!"

    filled-new-array {v3, v6}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v0, v7}, Ls/m2;->o(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v7, "Loading the library normally failed: %s"

    invoke-static {v7, v0}, Ls/m2;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "%s (%s) was not loaded normally, re-linking..."

    filled-new-array {v3, v6}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v0, v7}, Ls/m2;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p2}, Ls/m2;->m(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_1

    goto/16 :goto_d

    :cond_1
    const-string v7, "lib"

    const/4 v8, 0x0

    invoke-virtual {v2, v7, v8}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v7

    invoke-virtual/range {p0 .. p2}, Ls/m2;->m(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v9

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lyl/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Lyl/b;

    invoke-direct {v11, v10}, Lyl/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v11}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v7

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    array-length v10, v7

    move v11, v8

    :goto_0
    if-ge v11, v10, :cond_4

    aget-object v12, v7, v11

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    invoke-virtual {v12}, Ljava/io/File;->delete()Z

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    iget-object v7, v1, Ls/m2;->y:Ljava/lang/Object;

    check-cast v7, Lyl/a;

    sget-object v9, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    array-length v10, v9

    if-lez v10, :cond_5

    goto :goto_3

    :cond_5
    sget-object v9, Landroid/os/Build;->CPU_ABI2:Ljava/lang/String;

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    if-nez v10, :cond_6

    goto :goto_2

    :cond_6
    sget-object v10, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    filled-new-array {v10, v9}, [Ljava/lang/String;

    move-result-object v9

    goto :goto_3

    :cond_7
    :goto_2
    sget-object v9, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v9

    :goto_3
    invoke-static {v3}, Lyl/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    invoke-static {v2, v9, v10}, Lyl/a;->b(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Lq3/i;

    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    if-eqz v7, :cond_c

    iget-object v2, v7, Lq3/i;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/zip/ZipFile;

    move v9, v8

    :goto_4
    add-int/lit8 v11, v9, 0x1

    const/4 v12, 0x5

    if-ge v9, v12, :cond_a

    :try_start_2
    const-string v9, "Found %s! Extracting..."

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v12

    invoke-static {v9, v12}, Ls/m2;->o(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v9

    if-nez v9, :cond_8

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    move-result v9
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_8
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v9, :cond_8

    goto/16 :goto_c

    :catchall_0
    move-exception v0

    move-object v6, v7

    goto/16 :goto_f

    :cond_8
    :try_start_4
    iget-object v9, v7, Lq3/i;->x:Ljava/lang/Object;

    check-cast v9, Ljava/util/zip/ZipEntry;

    invoke-virtual {v2, v9}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v9
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :try_start_5
    new-instance v12, Ljava/io/FileOutputStream;

    invoke-direct {v12, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    const/16 v13, 0x1000

    :try_start_6
    new-array v13, v13, [B

    const-wide/16 v14, 0x0

    :goto_5
    invoke-virtual {v9, v13}, Ljava/io/InputStream;->read([B)I

    move-result v6

    const/4 v8, -0x1

    if-ne v6, v8, :cond_b

    invoke-virtual {v12}, Ljava/io/OutputStream;->flush()V
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    invoke-virtual {v12}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/FileDescriptor;->sync()V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v17
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    cmp-long v6, v14, v17

    if-eqz v6, :cond_9

    :catch_1
    :goto_6
    :try_start_8
    invoke-static {v9}, Lyl/a;->a(Ljava/io/Closeable;)V

    invoke-static {v12}, Lyl/a;->a(Ljava/io/Closeable;)V

    goto :goto_c

    :cond_9
    invoke-static {v9}, Lyl/a;->a(Ljava/io/Closeable;)V

    invoke-static {v12}, Lyl/a;->a(Ljava/io/Closeable;)V

    const/4 v6, 0x1

    const/4 v8, 0x0

    invoke-virtual {v0, v6, v8}, Ljava/io/File;->setReadable(ZZ)Z

    invoke-virtual {v0, v6, v8}, Ljava/io/File;->setExecutable(ZZ)Z

    invoke-virtual {v0, v6}, Ljava/io/File;->setWritable(Z)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :cond_a
    :try_start_9
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_d

    :catchall_1
    move-exception v0

    move-object v6, v9

    :goto_7
    move-object/from16 v16, v12

    goto :goto_b

    :cond_b
    const/4 v8, 0x0

    :try_start_a
    invoke-virtual {v12, v13, v8, v6}, Ljava/io/OutputStream;->write([BII)V
    :try_end_a
    .catch Ljava/io/FileNotFoundException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    move-object/from16 p1, v9

    int-to-long v8, v6

    add-long/2addr v14, v8

    move-object/from16 v9, p1

    const/4 v8, 0x0

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object/from16 p1, v9

    move-object/from16 v6, p1

    goto :goto_7

    :catch_2
    move-object/from16 p1, v9

    move-object/from16 v9, p1

    goto :goto_6

    :catch_3
    move-object/from16 p1, v9

    move-object/from16 v9, p1

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object/from16 p1, v9

    move-object/from16 v6, p1

    :goto_8
    const/16 v16, 0x0

    goto :goto_b

    :catch_4
    move-object/from16 p1, v9

    :goto_9
    const/4 v12, 0x0

    goto :goto_6

    :catch_5
    move-object/from16 p1, v9

    :goto_a
    const/4 v12, 0x0

    goto :goto_6

    :catchall_4
    move-exception v0

    const/4 v6, 0x0

    goto :goto_8

    :catch_6
    const/4 v9, 0x0

    goto :goto_9

    :catch_7
    const/4 v9, 0x0

    goto :goto_a

    :goto_b
    :try_start_b
    invoke-static {v6}, Lyl/a;->a(Ljava/io/Closeable;)V

    invoke-static/range {v16 .. v16}, Lyl/a;->a(Ljava/io/Closeable;)V

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :catch_8
    :goto_c
    move v9, v11

    const/4 v6, 0x0

    const/4 v8, 0x0

    goto/16 :goto_4

    :catch_9
    :goto_d
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "%s (%s) was re-linked!"

    const/4 v2, 0x0

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Ls/m2;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_c
    :try_start_c
    invoke-static {v2, v10}, Lyl/a;->d(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_a
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto :goto_e

    :catch_a
    move-exception v0

    :try_start_d
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    :goto_e
    new-instance v2, Lcom/getkeepsafe/relinker/MissingLibraryException;

    invoke-direct {v2, v10, v9, v0}, Lcom/getkeepsafe/relinker/MissingLibraryException;-><init>(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :catchall_5
    move-exception v0

    move-object v2, v6

    :goto_f
    if-eqz v6, :cond_d

    :try_start_e
    iget-object v2, v6, Lq3/i;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/zip/ZipFile;

    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_b

    :catch_b
    :cond_d
    throw v0
.end method

.method public r()V
    .locals 1

    iget-object v0, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public s(Ljava/lang/Object;)V
    .locals 5

    invoke-static {}, Lx1/c;->c()J

    move-result-wide v0

    sget-wide v2, Lx1/j;->a:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iput-object p1, p0, Ls/m2;->y:Ljava/lang/Object;

    return-void

    :cond_0
    iget-object v2, p0, Ls/m2;->x:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx1/i;

    invoke-virtual {v3, v0, v1}, Lx1/i;->a(J)I

    move-result v4

    if-gez v4, :cond_1

    iget-object v4, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3, v0, v1, p1}, Lx1/i;->b(JLjava/lang/Object;)Lx1/i;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_1
    iget-object v0, v3, Lx1/i;->c:[Ljava/lang/Object;

    aput-object p1, v0, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    return-void

    :goto_0
    monitor-exit v2

    throw p1
.end method

.method public t(I)V
    .locals 2

    const/16 v0, 0x10

    if-lt p1, v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ls/m2;->w:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    mul-int/lit8 p1, p1, 0x8

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid key size %d; only 128-bit or larger are supported"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public u()V
    .locals 4

    iget-object v0, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v0, La0/v0;

    iget-object v1, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_0

    iget-object v3, p0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v3, Lc93/a;

    invoke-interface {v2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method
