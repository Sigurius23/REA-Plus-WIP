.class public final Le73/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxn/f;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Ljava/lang/Object;

.field public d:I

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 4

    iput p1, p0, Le73/b;->a:I

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 4
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance p1, Lxn/h;

    const/4 v0, 0x1

    .line 6
    invoke-direct {p1, v0}, Lum/c;-><init>(I)V

    .line 7
    iput-object p1, p0, Le73/b;->e:Ljava/lang/Object;

    .line 8
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Le73/b;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    move v0, p1

    :goto_0
    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 9
    iget-object v1, p0, Le73/b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayDeque;

    new-instance v2, Lxn/c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lxn/c;-><init>(Lxn/f;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 10
    :cond_0
    iput p1, p0, Le73/b;->d:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    const/4 v0, 0x2

    iput v0, p0, Le73/b;->a:I

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 31
    new-array v1, v0, [J

    iput-object v1, p0, Le73/b;->e:Ljava/lang/Object;

    .line 32
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readLongArray([J)V

    .line 33
    sget-object v1, Landroid/widget/RemoteViews;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v2, "CREATOR"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    new-array v0, v0, [Landroid/widget/RemoteViews;

    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readTypedArray([Ljava/lang/Object;Landroid/os/Parcelable$Creator;)V

    .line 36
    invoke-static {v0}, Lm83/n;->I0([Ljava/lang/Object;)V

    .line 37
    iput-object v0, p0, Le73/b;->c:Ljava/lang/Object;

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Le73/b;->b:Z

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Le73/b;->d:I

    return-void
.end method

.method public constructor <init>(Lc9/k;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le73/b;->a:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Le73/b;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Le73/b;->a:I

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le73/b;->c:Ljava/lang/Object;

    .line 43
    new-instance p1, Lpq/e;

    invoke-direct {p1, p0}, Lpq/e;-><init>(Le73/b;)V

    iput-object p1, p0, Le73/b;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Le73/b;->a:I

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le73/b;->c:Ljava/lang/Object;

    .line 41
    new-instance p1, Llr/e;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Llr/e;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Le73/b;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le73/b;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Le73/b;->b:Z

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Le73/b;->e:Ljava/lang/Object;

    .line 3
    sget-object p1, Ljg/q;->w:Ljg/q;

    filled-new-array {p1}, [Ljg/q;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Le73/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([J[Landroid/widget/RemoteViews;)V
    .locals 4

    const/4 v0, 0x2

    iput v0, p0, Le73/b;->a:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Le73/b;->e:Ljava/lang/Object;

    .line 13
    iput-object p2, p0, Le73/b;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Le73/b;->b:Z

    const/4 v1, 0x1

    .line 15
    iput v1, p0, Le73/b;->d:I

    .line 16
    array-length p1, p1

    array-length v2, p2

    if-ne p1, v2, :cond_2

    .line 17
    new-instance p1, Ljava/util/ArrayList;

    array-length v2, p2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    array-length v2, p2

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p2, v0

    .line 19
    invoke-virtual {v3}, Landroid/widget/RemoteViews;->getLayoutId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 20
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 21
    :cond_0
    invoke-static {p1}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    if-gt p1, v1, :cond_1

    return-void

    .line 22
    :cond_1
    const-string p2, "View type count is set to 1, but the collection contains "

    .line 23
    const-string v0, " different layout ids"

    .line 24
    invoke-static {p1, p2, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 25
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 26
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "RemoteCollectionItems has different number of ids and views"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static e(Le73/b;Lq/f;Laf3/f;)V
    .locals 8

    iget-object v0, p1, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lz63/h;

    invoke-virtual {p1}, Lq/f;->w0()I

    move-result v1

    invoke-virtual {p1, p2}, Lq/f;->V0(Laf3/t;)V

    iget-object p2, p0, Le73/b;->c:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    if-eqz p2, :cond_5

    iget-object p2, v0, Lz63/h;->w:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/16 v3, 0xa

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-lez v2, :cond_0

    sub-int/2addr v2, v5

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p2

    if-eq v3, p2, :cond_0

    move p2, v5

    goto :goto_0

    :cond_0
    move p2, v4

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {v0, v3}, Lz63/h;->a(C)V

    :cond_1
    const/16 v2, 0xa0

    invoke-virtual {v0, v2}, Lz63/h;->a(C)V

    new-instance v0, Le73/e;

    iget-object v2, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v2, Lc9/k;

    iget-object v3, p0, Le73/b;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    iget-boolean v6, p0, Le73/b;->b:Z

    iget v7, p0, Le73/b;->d:I

    rem-int/lit8 v7, v7, 0x2

    if-ne v7, v5, :cond_2

    move v7, v5

    goto :goto_1

    :cond_2
    move v7, v4

    :goto_1
    invoke-direct {v0, v2, v3, v6, v7}, Le73/e;-><init>(Lc9/k;Ljava/util/ArrayList;ZZ)V

    iget-boolean v2, p0, Le73/b;->b:Z

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    iget v2, p0, Le73/b;->d:I

    add-int/lit8 v4, v2, 0x1

    :goto_2
    iput v4, p0, Le73/b;->d:I

    if-eqz p2, :cond_4

    add-int/lit8 v1, v1, 0x1

    :cond_4
    invoke-virtual {p1, v1, v0}, Lq/f;->Q0(ILjava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Le73/b;->c:Ljava/lang/Object;

    :cond_5
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Le73/b;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    iget-object v1, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v1, Lxn/h;

    iget-boolean v2, p0, Le73/b;->b:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Llo/a;->i(Z)V

    iget v2, p0, Le73/b;->d:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lxn/c;

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, La9/a;->f(I)Z

    move-result v3

    const/4 v8, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, La9/a;->a(I)V

    goto :goto_0

    :cond_1
    new-instance v5, Lan/d;

    iget-wide v3, v1, Lum/c;->F:J

    iget-object v0, v1, Lum/c;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v6

    array-length v7, v0

    invoke-virtual {v6, v0, v8, v7}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v6, v8}, Landroid/os/Parcel;->setDataPosition(I)V

    const-class v0, Landroid/os/Bundle;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    const-string v6, "c"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lxn/b;->S:Lux/f0;

    invoke-static {v6, v0}, Llo/a;->q(Lrm/e;Ljava/util/ArrayList;)Lzr/w0;

    move-result-object v0

    const/16 v6, 0xb

    invoke-direct {v5, v3, v4, v0, v6}, Lan/d;-><init>(JLjava/lang/Object;I)V

    iget-wide v3, v1, Lum/c;->F:J

    const-wide/16 v6, 0x0

    invoke-virtual/range {v2 .. v7}, Lxn/c;->p(JLxn/e;J)V

    :goto_0
    invoke-virtual {v1}, Lum/c;->o()V

    iput v8, p0, Le73/b;->d:I

    return-object v2

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public c()Ljava/lang/Object;
    .locals 2

    iget-boolean v0, p0, Le73/b;->b:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Llo/a;->i(Z)V

    iget v0, p0, Le73/b;->d:I

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iput v1, p0, Le73/b;->d:I

    iget-object v0, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v0, Lxn/h;

    return-object v0
.end method

.method public d(Lxn/h;)V
    .locals 3

    iget-boolean v0, p0, Le73/b;->b:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Llo/a;->i(Z)V

    iget v0, p0, Le73/b;->d:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Llo/a;->i(Z)V

    iget-object v0, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v0, Lxn/h;

    if-ne v0, p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-static {v1}, Llo/a;->e(Z)V

    const/4 p1, 0x2

    iput p1, p0, Le73/b;->d:I

    return-void
.end method

.method public f()V
    .locals 3

    sget-object v0, Ljg/q;->z:Ljg/q;

    const-string v1, "{"

    invoke-virtual {p0, v1}, Le73/b;->j(Ljava/lang/String;)V

    iget-boolean v1, p0, Le73/b;->b:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    iget v1, p0, Le73/b;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Le73/b;->d:I

    iget-object v1, p0, Le73/b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public flush()V
    .locals 1

    iget-boolean v0, p0, Le73/b;->b:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Llo/a;->i(Z)V

    iget-object v0, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v0, Lxn/h;

    invoke-virtual {v0}, Lum/c;->o()V

    const/4 v0, 0x0

    iput v0, p0, Le73/b;->d:I

    return-void
.end method

.method public g()Lto/j0;
    .locals 4

    iget-object v0, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v0, Lto/n;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "execute parameter required"

    invoke-static {v0, v1}, Luo/w;->b(ZLjava/lang/String;)V

    new-instance v0, Lto/j0;

    iget-object v1, p0, Le73/b;->c:Ljava/lang/Object;

    check-cast v1, [Lcom/google/android/gms/common/c;

    iget-boolean v2, p0, Le73/b;->b:Z

    iget v3, p0, Le73/b;->d:I

    invoke-direct {v0, p0, v1, v2, v3}, Lto/j0;-><init>(Le73/b;[Lcom/google/android/gms/common/c;ZI)V

    return-object v0
.end method

.method public varargs h(Ljava/lang/String;[Ljg/q;)V
    .locals 7

    iget-object v0, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Le73/b;->b:Z

    if-eqz v1, :cond_0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    iget v1, p0, Le73/b;->d:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Le73/b;->d:I

    invoke-virtual {p0}, Le73/b;->p()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Le73/b;->c:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/s;->l1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljg/q;

    invoke-static {p2, p1}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid JSON encoder state "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "; expected one of "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v5, 0x0

    const/16 v6, 0x3f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v6}, Lm83/n;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public i(I)V
    .locals 3

    iget v0, p0, Le73/b;->a:I

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le73/b;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iput p1, p0, Le73/b;->d:I

    iget-boolean p1, p0, Le73/b;->b:Z

    if-nez p1, :cond_1

    iget-object p1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iget-object v0, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v0, Lpq/e;

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    iput-boolean v1, p0, Le73/b;->b:Z

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Le73/b;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v2, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    iput p1, p0, Le73/b;->d:I

    iget-boolean p1, p0, Le73/b;->b:Z

    if-nez p1, :cond_3

    iget-object p1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iget-object v0, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v0, Llr/e;

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    iput-boolean v1, p0, Le73/b;->b:Z

    :cond_3
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public j(Ljava/lang/String;)V
    .locals 5

    iget-boolean v0, p0, Le73/b;->b:Z

    iget-object v1, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Le73/b;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v2}, Ldp/d;->b0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljg/q;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_4

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x5

    if-eq v3, v4, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_1

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    sget-object v0, Ljg/q;->E:Ljg/q;

    invoke-static {v2, v0}, Ldp/d;->U(Ljava/util/List;Ljg/q;)V

    goto :goto_0

    :cond_2
    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_3

    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {p0}, Le73/b;->p()V

    goto :goto_0

    :cond_4
    sget-object v0, Ljg/q;->y:Ljg/q;

    invoke-static {v2, v0}, Ldp/d;->U(Ljava/util/List;Ljg/q;)V

    invoke-virtual {p0}, Le73/b;->p()V

    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public k()V
    .locals 2

    sget-object v0, Ljg/q;->z:Ljg/q;

    sget-object v1, Ljg/q;->E:Ljg/q;

    filled-new-array {v0, v1}, [Ljg/q;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {p0, v1, v0}, Le73/b;->h(Ljava/lang/String;[Ljg/q;)V

    return-void
.end method

.method public l()[B
    .locals 2

    iget-object v0, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public m(Lto/n;)V
    .locals 0

    iput-object p1, p0, Le73/b;->e:Ljava/lang/Object;

    return-void
.end method

.method public varargs n([Lcom/google/android/gms/common/c;)V
    .locals 0

    iput-object p1, p0, Le73/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public o(I)V
    .locals 0

    iput p1, p0, Le73/b;->d:I

    return-void
.end method

.method public p()V
    .locals 2

    iget-boolean v0, p0, Le73/b;->b:Z

    if-eqz v0, :cond_0

    iget v0, p0, Le73/b;->d:I

    if-lez v0, :cond_0

    mul-int/lit8 v0, v0, 0x4

    const-string v1, " "

    invoke-static {v0, v1}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Le73/b;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/StringBuilder;

    const-string v1, "name"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Le73/b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-static {v1}, Ldp/d;->b0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Ljg/q;->E:Ljg/q;

    if-ne v2, v3, :cond_0

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Le73/b;->b:Z

    if-eqz v2, :cond_0

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, Le73/b;->p()V

    invoke-static {p1}, Lbp/b;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Ljg/q;->F:Ljg/q;

    invoke-static {v1, p1}, Ldp/d;->U(Ljava/util/List;Ljg/q;)V

    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lbp/b;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x22

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Le73/b;->j(Ljava/lang/String;)V

    return-void
.end method

.method public release()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Le73/b;->b:Z

    return-void
.end method
