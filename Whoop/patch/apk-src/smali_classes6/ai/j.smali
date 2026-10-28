.class public final Lai/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/a1;
.implements Li5/o;
.implements Lrl/d;


# instance fields
.field public w:I

.field public x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lai/j;->w:I

    iput-object p2, p0, Lai/j;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    sparse-switch p1, :sswitch_data_0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lai/j;->x:Ljava/lang/Object;

    return-void

    .line 5
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lai/j;->w:I

    .line 7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lai/j;->x:Ljava/lang/Object;

    return-void

    .line 8
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance p1, Lx8/n;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Lx8/n;-><init>(I)V

    iput-object p1, p0, Lai/j;->x:Ljava/lang/Object;

    return-void

    .line 10
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 11
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance p1, Led3/a;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Led3/a;-><init>(I)V

    iput-object p1, p0, Lai/j;->x:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_3
        0x3 -> :sswitch_2
        0x9 -> :sswitch_1
        0xd -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput-object p1, p0, Lai/j;->x:Ljava/lang/Object;

    iput p2, p0, Lai/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 2

    iget-object v0, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/a1;

    iget v1, p0, Lai/j;->w:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1, p2}, Landroidx/recyclerview/widget/a1;->a(II)V

    return-void
.end method

.method public b(II)V
    .locals 2

    iget-object v0, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/a1;

    iget v1, p0, Lai/j;->w:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1, p2}, Landroidx/recyclerview/widget/a1;->b(II)V

    return-void
.end method

.method public c(IILjava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/a1;

    iget v1, p0, Lai/j;->w:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1, p2, p3}, Landroidx/recyclerview/widget/a1;->c(IILjava/lang/Object;)V

    return-void
.end method

.method public d(II)V
    .locals 2

    iget-object v0, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/a1;

    iget v1, p0, Lai/j;->w:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-interface {v0, p1, p2}, Landroidx/recyclerview/widget/a1;->d(II)V

    return-void
.end method

.method public e(Lwk/a;)Lrl/c;
    .locals 2

    sget-object v0, Lwk/a;->E:Lwk/a;

    if-ne p1, v0, :cond_0

    sget-object p1, Lrl/b;->w:Lrl/b;

    return-object p1

    :cond_0
    iget-object p1, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast p1, Ld0/o2;

    if-nez p1, :cond_1

    new-instance p1, Ld0/o2;

    iget v0, p0, Lai/j;->w:I

    const/4 v1, 0x6

    invoke-direct {p1, v0, v1}, Ld0/o2;-><init>(II)V

    iput-object p1, p0, Lai/j;->x:Ljava/lang/Object;

    :cond_1
    iget-object p1, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast p1, Ld0/o2;

    return-object p1
.end method

.method public f(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lai/j;->w:I

    iget-object v1, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    if-nez v1, :cond_0

    const/16 v1, 0x10

    new-array v1, v1, [Ljava/lang/Object;

    iput-object v1, p0, Lai/j;->x:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    array-length v2, v1

    if-ne v0, v2, :cond_1

    shr-int/lit8 v2, v0, 0x2

    add-int/2addr v2, v0

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, p0, Lai/j;->x:Ljava/lang/Object;

    move-object v1, v2

    :cond_1
    :goto_0
    aput-object p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lai/j;->w:I

    return-void
.end method

.method public g()V
    .locals 8

    iget v0, p0, Lai/j;->w:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lai/j;->w:I

    const/16 v1, 0xa

    if-lt v0, v1, :cond_5

    const/4 v0, 0x0

    iput v0, p0, Lai/j;->w:I

    iget-object v1, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    if-gt v3, v4, :cond_2

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lai/i;

    if-eqz v2, :cond_1

    iget-object v2, v2, Lai/i;->a:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrh/j;

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    move v4, v0

    move v5, v4

    :goto_2
    if-ge v4, v3, :cond_4

    sub-int v6, v4, v5

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lai/i;

    iget-object v7, v7, Lai/i;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_3

    invoke-interface {v2, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_5
    return-void
.end method

.method public h(Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Ll30/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ll30/b;

    iget v1, v0, Ll30/b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ll30/b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ll30/b;

    invoke-direct {v0, p0, p1}, Ll30/b;-><init>(Lai/j;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Ll30/b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ll30/b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Ll30/b;->w:Lai/j;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast p1, Lab/h0;

    iput-object p0, v0, Ll30/b;->w:Lai/j;

    iput v3, v0, Ll30/b;->z:I

    iget-object v2, p1, Lab/h0;->y:Ljava/lang/Object;

    check-cast v2, Lq83/j;

    new-instance v3, La13/h;

    const/4 v4, 0x0

    const/16 v5, 0xe

    invoke-direct {v3, p1, v4, v5}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v3, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p1, Ll30/a;

    if-nez p1, :cond_4

    invoke-virtual {v0}, Lai/j;->k()Ll30/a;

    move-result-object p1

    :cond_4
    return-object p1
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lai/j;->w:I

    return v0
.end method

.method public j()Llb3/y;
    .locals 1

    iget-object v0, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast v0, Llb3/y;

    return-object v0
.end method

.method public k()Ll30/a;
    .locals 5

    new-instance v0, Ll30/a;

    const-string v1, "toString(...)"

    invoke-static {v1}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lai/j;->w:I

    invoke-direct {v0, v1, v2}, Ll30/a;-><init>(Ljava/lang/String;I)V

    iget-object v2, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast v2, Lab/h0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Lab/h0;->q()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v4, "app_version"

    iget v2, v2, Lab/h0;->x:I

    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "sdk_app_id"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-object v0
.end method

.method public l(Lt9/k;)J
    .locals 7

    iget-object v0, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast v0, Lx8/n;

    iget-object v1, v0, Lx8/n;->a:[B

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p1, v1, v2, v3, v2}, Lt9/k;->c([BIIZ)Z

    iget-object v1, v0, Lx8/n;->a:[B

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    if-nez v1, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    const/16 v4, 0x80

    move v5, v2

    :goto_0
    and-int v6, v1, v4

    if-nez v6, :cond_1

    shr-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    not-int v4, v4

    and-int/2addr v1, v4

    iget-object v4, v0, Lx8/n;->a:[B

    invoke-virtual {p1, v4, v3, v5, v2}, Lt9/k;->c([BIIZ)Z

    :goto_1
    if-ge v2, v5, :cond_2

    shl-int/lit8 p1, v1, 0x8

    iget-object v1, v0, Lx8/n;->a:[B

    add-int/lit8 v2, v2, 0x1

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v1, p1

    goto :goto_1

    :cond_2
    iget p1, p0, Lai/j;->w:I

    add-int/2addr v5, v3

    add-int/2addr v5, p1

    iput v5, p0, Lai/j;->w:I

    int-to-long v0, v1

    return-wide v0
.end method

.method public m(Landroid/view/View;)Z
    .locals 1

    iget-object p1, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v0, p0, Lai/j;->w:I

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->W(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public n(Lwm/f;)J
    .locals 7

    iget-object v0, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast v0, Led3/a;

    iget-object v1, v0, Led3/a;->a:[B

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p1, v1, v2, v3, v2}, Lwm/f;->c([BIIZ)Z

    iget-object v1, v0, Led3/a;->a:[B

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    if-nez v1, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    const/16 v4, 0x80

    move v5, v2

    :goto_0
    and-int v6, v1, v4

    if-nez v6, :cond_1

    shr-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    not-int v4, v4

    and-int/2addr v1, v4

    iget-object v4, v0, Led3/a;->a:[B

    invoke-virtual {p1, v4, v3, v5, v2}, Lwm/f;->c([BIIZ)Z

    :goto_1
    if-ge v2, v5, :cond_2

    shl-int/lit8 p1, v1, 0x8

    iget-object v1, v0, Led3/a;->a:[B

    add-int/lit8 v2, v2, 0x1

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v1, p1

    goto :goto_1

    :cond_2
    iget p1, p0, Lai/j;->w:I

    add-int/2addr v5, v3

    add-int/2addr v5, p1

    iput v5, p0, Lai/j;->w:I

    int-to-long v0, v1

    return-wide v0
.end method

.method public o(Lai/b;Lrh/j;Ljava/util/Map;J)V
    .locals 5

    iget-object v0, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v1, Ljava/util/ArrayList;

    new-instance p1, Lai/i;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {p1, v0, p3, p4, p5}, Lai/i;-><init>(Ljava/lang/ref/WeakReference;Ljava/util/Map;J)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_4

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lai/i;

    iget-wide v3, v2, Lai/i;->c:J

    cmp-long v3, p4, v3

    if-ltz v3, :cond_3

    iget-object p3, v2, Lai/i;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p3

    if-ne p3, p2, :cond_2

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    invoke-virtual {p0}, Lai/j;->g()V

    return-void
.end method
