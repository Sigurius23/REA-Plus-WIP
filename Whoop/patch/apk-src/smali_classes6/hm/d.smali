.class public final Lhm/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lim/b;
.implements Li20/u0;
.implements Lio/sentry/q1;
.implements Lto/n;
.implements Luf/o;
.implements Lhg/c;
.implements Lhg/g;
.implements Lkh/g;
.implements Lq3/r;


# static fields
.field public static y:Ljava/lang/reflect/Method;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lhm/d;->w:I

    sparse-switch p1, :sswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 5
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    iput-object p1, p0, Lhm/d;->x:Ljava/lang/Object;

    return-void

    .line 7
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance p1, Lla/b;

    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Lla/b;-><init>(I)V

    .line 10
    iput-object p1, p0, Lhm/d;->x:Ljava/lang/Object;

    return-void

    .line 11
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance p1, Lb5/d;

    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lhm/d;->x:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_2
        0x17 -> :sswitch_1
        0x18 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lhm/d;->w:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Lxl/a;

    invoke-direct {v0, p1}, Lxl/a;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, Lhm/d;->w:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Lj6/g;

    invoke-direct {v0, p1}, Lj6/g;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/common/api/h;Lvo/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Lhm/d;->w:I

    iput-object p2, p0, Lhm/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lge/b;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Lhm/d;->w:I

    const-string v0, "staticMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lhm/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lhm/d;->w:I

    iput-object p1, p0, Lhm/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static i([B)[B
    .locals 1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    new-array p0, p0, [B

    :goto_0
    array-length v0, p0

    invoke-static {v0}, Ls2/a;->A(I)[B

    move-result-object v0

    filled-new-array {v0, p0}, [[B

    move-result-object p0

    invoke-static {p0}, Lrv/n;->h([[B)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    return-void
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lhm/d;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lip/e;

    check-cast p2, Lcq/i;

    new-instance v0, Lip/b;

    invoke-direct {v0, v2, p2}, Lip/b;-><init>(ILcq/i;)V

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lip/n;

    iget-object p2, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast p2, Lpo/g;

    invoke-virtual {p1}, Lip/a;->s()Landroid/os/Parcel;

    move-result-object v1

    sget v2, Lip/i;->a:I

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    invoke-static {v1, p2}, Lip/i;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p2, 0x3

    invoke-virtual {p1, v1, p2}, Lip/a;->X(Landroid/os/Parcel;I)V

    return-void

    :pswitch_0
    check-cast p1, Lip/e;

    check-cast p2, Lcq/i;

    new-instance v0, Lip/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lip/b;-><init>(ILcq/i;)V

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lip/n;

    iget-object p2, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast p2, Lpo/e;

    invoke-virtual {p1}, Lip/a;->s()Landroid/os/Parcel;

    move-result-object v2

    sget v3, Lip/i;->a:I

    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    invoke-static {v2, p2}, Lip/i;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {p1, v2, v1}, Lip/a;->X(Landroid/os/Parcel;I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v0, Lip/c;

    check-cast p1, Lip/e;

    check-cast p2, Lcq/i;

    new-instance v3, Lip/d;

    invoke-direct {v3, v1, p2}, Lip/d;-><init>(ILcq/i;)V

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lip/n;

    iget-object p2, v0, Lip/c;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lip/a;->s()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lip/i;->a:I

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v2}, Lip/a;->X(Landroid/os/Parcel;I)V

    return-void

    :pswitch_2
    check-cast p1, Lip/l;

    check-cast p2, Lcq/i;

    new-instance v0, Lip/b;

    invoke-direct {v0, v1, p2}, Lip/b;-><init>(ILcq/i;)V

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lip/m;

    iget-object p2, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast p2, Lpo/h;

    invoke-virtual {p1}, Lip/a;->s()Landroid/os/Parcel;

    move-result-object v1

    sget v3, Lip/i;->a:I

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    invoke-static {v1, p2}, Lip/i;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {p1, v1, v2}, Lip/a;->X(Landroid/os/Parcel;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(Lm63/d;)V
    .locals 3

    iget-object p1, p1, Lm63/d;->x:Ljava/lang/Object;

    check-cast p1, Lio/sentry/android/replay/video/d;

    iget-object p1, p1, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    check-cast p1, Lag/e;

    sget-object v0, Lag/f;->w:Lag/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lag/f;->x:Lag/f;

    new-instance v1, Lag/e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lag/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1, v0}, Lag/e;->c(Lag/b;Lag/f;)V

    return-void
.end method

.method public create(Ljava/lang/Class;Ll8/c;)Li20/v0;
    .locals 8

    const-string p1, "extras"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object p1

    iget-object p2, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast p2, Li20/c0;

    new-instance v0, Lt9/p;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lt9/p;-><init>(I)V

    new-instance v1, Lt9/c0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v2

    new-instance v3, Lc20/g;

    const/16 v4, 0x8

    invoke-direct {v3, v2, v4}, Lc20/g;-><init>(Lv03/e;I)V

    invoke-static {v3}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v2

    invoke-static {p2}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object p2

    new-instance v3, Lc00/f;

    const/4 v4, 0x3

    invoke-direct {v3, v2, p2, v4}, Lc00/f;-><init>(Lv03/h;Lv03/e;I)V

    invoke-static {v3}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v3

    new-instance v4, Lc20/g;

    const/4 v5, 0x7

    invoke-direct {v4, p2, v5}, Lc20/g;-><init>(Lv03/e;I)V

    invoke-static {v4}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object p2

    sget-object v4, Lp20/a;->a:Lcy/b;

    new-instance v5, Le20/a;

    const/4 v6, 0x5

    invoke-direct {v5, v0, v4, v6}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v5}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v0

    new-instance v4, Luy/a;

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v4}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v1

    new-instance v4, Lb20/g;

    const/16 v5, 0xb

    invoke-direct {v4, v0, v1, v5}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    new-instance v0, La30/h;

    const/16 v5, 0x1b

    invoke-direct {v0, v2, v5}, La30/h;-><init>(Lv03/h;I)V

    invoke-static {v0}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v0

    sget-object v5, Lp20/a;->b:Lcy/b;

    invoke-static {v5}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v5

    new-instance v6, La30/c;

    const/4 v7, 0x2

    invoke-direct {v6, v2, v0, v5, v7}, La30/c;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    new-instance v0, Lay/w;

    const/4 v2, 0x3

    invoke-direct {v0, v4, v6, v1, v2}, Lay/w;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    invoke-static {v0}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v0

    new-instance v1, La30/h;

    const/16 v2, 0x1a

    invoke-direct {v1, v0, v2}, La30/h;-><init>(Lv03/h;I)V

    invoke-static {v1}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v0

    new-instance v1, Li20/v0;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly30/e;

    invoke-interface {p2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li20/p0;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj20/c;

    invoke-direct {v1, v2, p2, v0, p1}, Li20/v0;-><init>(Ly30/e;Li20/p0;Lj20/c;Landroid/app/Application;)V

    return-object v1
.end method

.method public d(Ljava/lang/Object;Lag/d;)Ljava/lang/Object;
    .locals 12

    iget-object p2, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast p2, Lge/b;

    check-cast p1, Luf/u;

    iget-object v0, p1, Luf/u;->a:Ldg/a;

    iget-object v1, p1, Luf/u;->b:Ljava/lang/Object;

    sget-object v2, Lke/a;->c:Lgf/a;

    invoke-virtual {v0, v2}, Ldg/a;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lke/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p2, Lge/b;->h:Lke/a;

    new-instance v11, Lke/a;

    iget-object v3, v2, Lke/a;->a:Ljava/util/LinkedHashMap;

    iget-object v4, v0, Lke/a;->a:Ljava/util/LinkedHashMap;

    invoke-static {v3, v4}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    iget-object v2, v2, Lke/a;->b:Ljava/util/ArrayList;

    iget-object v0, v0, Lke/a;->b:Ljava/util/ArrayList;

    invoke-static {v2, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {v11, v3, v0}, Lke/a;-><init>(Ljava/util/Map;Ljava/util/List;)V

    iget-object v4, p2, Lge/b;->a:Lge/j;

    iget-object v5, p2, Lge/b;->b:Lge/a;

    iget-object v6, p2, Lge/b;->c:Lge/i;

    iget-object v7, p2, Lge/b;->d:Lge/g;

    iget-object v8, p2, Lge/b;->e:Lge/e;

    iget-object v9, p2, Lge/b;->f:Lge/f;

    iget-object v10, p2, Lge/b;->g:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lge/b;

    invoke-direct/range {v3 .. v11}, Lge/b;-><init>(Lge/j;Lge/a;Lge/i;Lge/g;Lge/e;Lge/f;Ljava/lang/String;Lke/a;)V

    move-object p2, v3

    :goto_0
    check-cast v1, Lvf/b;

    iget-object v0, v1, Lvf/b;->y:Lmf/c;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p2, Lge/b;->a:Lge/j;

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v3

    invoke-virtual {v3, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v4, p2, Lge/b;->h:Lke/a;

    iget-object v5, v4, Lke/a;->b:Ljava/util/ArrayList;

    iget-object v4, v4, Lke/a;->a:Ljava/util/LinkedHashMap;

    const-string v6, "internal"

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v4, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move-object v8, v4

    goto :goto_1

    :cond_1
    move-object v8, v7

    :goto_1
    if-eqz v8, :cond_2

    const-string v8, "md/internal"

    invoke-virtual {v3, v8}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_2
    const-string v8, "2.1"

    const/4 v9, 0x4

    const-string v10, "ua"

    invoke-static {v9, v10, v8, v7}, Lge/d;->c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v8, p2, Lge/b;->b:Lge/a;

    invoke-virtual {v3, v8}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v8, p2, Lge/b;->c:Lge/i;

    invoke-virtual {v3, v8}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v8, p2, Lge/b;->d:Lge/g;

    invoke-virtual {v3, v8}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v8, p2, Lge/b;->e:Lge/e;

    if-eqz v8, :cond_3

    invoke-virtual {v3, v8}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_3
    if-eqz v5, :cond_5

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v9}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    iget-object v8, p2, Lge/b;->g:Ljava/lang/String;

    if-eqz v8, :cond_6

    const-string v9, "app"

    const/4 v10, 0x2

    invoke-static {v10, v9, v7, v8}, Lge/d;->c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_6
    if-eqz v5, :cond_8

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_4

    :cond_7
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v3, v7}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    iget-object p2, p2, Lge/b;->f:Lge/f;

    if-eqz p2, :cond_9

    invoke-virtual {v3, p2}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_9
    if-eqz v4, :cond_c

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_a
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p2, v7, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_b
    invoke-static {p2}, Lce/w;->i0(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-static {v3}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v4

    const/4 v8, 0x0

    const/16 v9, 0x3e

    const-string v5, " "

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p2

    const-string v3, "User-Agent"

    invoke-virtual {v0, p2, v3}, La2/a;->N(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, v1, Lvf/b;->y:Lmf/c;

    const-string v0, "x-amz-user-agent"

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, La2/a;->N(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public e(Ls83/c;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v0, Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lch/i;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lch/i;-><init>(Lec3/l;I)V

    invoke-static {v1, p1}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1
.end method

.method public f(Lkh/a;Landroid/graphics/Bitmap;Ljava/util/Map;)V
    .locals 2

    iget-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v0, Lbd3/v;

    invoke-static {p2}, Lpf/c;->w(Landroid/graphics/Bitmap;)I

    move-result v1

    invoke-virtual {v0, p1, p2, p3, v1}, Lbd3/v;->o(Lkh/a;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    return-void
.end method

.method public g(Ljavax/crypto/spec/SecretKeySpec;[B[B[B[B[B)Ljavax/crypto/spec/SecretKeySpec;
    .locals 4

    filled-new-array {p2, p3, p4, p5, p6}, [[B

    move-result-object p2

    invoke-static {p2}, Lrv/n;->h([[B)[B

    move-result-object p2

    new-instance p3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-object p4, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast p4, Lla/b;

    iget-object p4, p4, Lla/b;->x:Ljava/lang/Object;

    check-cast p4, Ljava/security/Provider;

    const-string p5, "SHA-256"

    if-nez p4, :cond_0

    :try_start_0
    invoke-static {p5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p4

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    invoke-static {p5, p4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/MessageDigest;

    move-result-object p4
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 p5, 0x1

    :goto_1
    invoke-virtual {p4}, Ljava/security/MessageDigest;->getDigestLength()I

    move-result p6

    int-to-long v0, p6

    const-wide/16 v2, 0x8

    mul-long/2addr v0, v2

    long-to-int p6, v0

    int-to-long v2, p6

    cmp-long v0, v2, v0

    if-nez v0, :cond_4

    add-int/lit16 v0, p6, 0xff

    div-int/2addr v0, p6

    if-gt p5, v0, :cond_2

    invoke-static {p5}, Ls2/a;->A(I)[B

    move-result-object p6

    invoke-virtual {p4, p6}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {p1}, Ljavax/crypto/spec/SecretKeySpec;->getEncoded()[B

    move-result-object p6

    invoke-virtual {p4, p6}, Ljava/security/MessageDigest;->update([B)V

    if-eqz p2, :cond_1

    invoke-virtual {p4, p2}, Ljava/security/MessageDigest;->update([B)V

    :cond_1
    :try_start_1
    invoke-virtual {p4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p6

    invoke-virtual {p3, p6}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 p5, p5, 0x1

    goto :goto_1

    :catch_1
    move-exception p1

    new-instance p2, Lcom/nimbusds/jose/JOSEException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Couldn\'t write derived key: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p3}, Lc13/a;->h(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    invoke-virtual {p3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    array-length p2, p1

    const-string p3, "AES"

    const/16 p4, 0x20

    if-ne p2, p4, :cond_3

    new-instance p2, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {p2, p1, p3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object p2

    :cond_3
    new-instance p2, Ljavax/crypto/spec/SecretKeySpec;

    const/4 p5, 0x0

    invoke-static {p1, p5, p4}, Lrv/n;->l([BII)[B

    move-result-object p1

    invoke-direct {p2, p1, p3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object p2

    :cond_4
    new-instance p1, Lcom/nimbusds/jose/util/IntegerOverflowException;

    invoke-direct {p1}, Lcom/nimbusds/jose/util/IntegerOverflowException;-><init>()V

    throw p1

    :goto_2
    new-instance p2, Lcom/nimbusds/jose/JOSEException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Couldn\'t get message digest for KDF: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public get()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v0, Lf93/a;

    iget-object v0, v0, Lf93/a;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    new-instance v1, Lng3/n;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lng3/n;-><init>(I)V

    new-instance v2, Lng3/o;

    const/16 v3, 0xd

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lng3/o;-><init>(IZ)V

    new-instance v3, Lgm/r;

    const/4 v4, 0x5

    invoke-direct {v3, v0, v1, v2, v4}, Lgm/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v3
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v0, Ljg/b;

    invoke-virtual {v0}, Ljg/b;->h()I

    move-result v0

    return v0
.end method

.method public j()Z
    .locals 12

    sget-object v0, Lio/sentry/internal/a;->c:Lio/sentry/internal/a;

    if-nez v0, :cond_1

    sget-object v0, Lio/sentry/internal/a;->d:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    sget-object v1, Lio/sentry/internal/a;->c:Lio/sentry/internal/a;

    if-nez v1, :cond_0

    new-instance v1, Lio/sentry/internal/a;

    invoke-direct {v1}, Lio/sentry/internal/a;-><init>()V

    sput-object v1, Lio/sentry/internal/a;->c:Lio/sentry/internal/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    goto :goto_3

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1

    :cond_1
    :goto_3
    sget-object v0, Lio/sentry/internal/a;->c:Lio/sentry/internal/a;

    iget-boolean v1, v0, Lio/sentry/internal/a;->a:Z

    if-eqz v1, :cond_2

    goto/16 :goto_9

    :cond_2
    const/4 v1, 0x1

    :try_start_2
    iget-object v2, v0, Lio/sentry/internal/a;->b:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-boolean v3, v0, Lio/sentry/internal/a;->a:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-eqz v3, :cond_4

    :cond_3
    :try_start_4
    invoke-virtual {v2}, Lio/sentry/s;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catch_0
    iput-boolean v1, v0, Lio/sentry/internal/a;->a:Z

    goto/16 :goto_9

    :catchall_2
    move-exception v2

    goto/16 :goto_8

    :cond_4
    :try_start_5
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const-string v4, "META-INF/MANIFEST.MF"

    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object v3

    :catch_1
    :cond_5
    :goto_4
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-eqz v4, :cond_3

    :try_start_6
    new-instance v4, Ljava/util/jar/Manifest;

    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/net/URL;

    invoke-virtual {v5}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/jar/Manifest;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v4}, Ljava/util/jar/Manifest;->getMainAttributes()Ljava/util/jar/Attributes;

    move-result-object v4

    if-eqz v4, :cond_5

    const-string v5, "Sentry-Opentelemetry-SDK-Name"

    invoke-virtual {v4, v5}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Implementation-Version"

    invoke-virtual {v4, v6}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Sentry-SDK-Name"

    invoke-virtual {v4, v7}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Sentry-SDK-Package-Name"

    invoke-virtual {v4, v8}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v5, :cond_9

    if-eqz v6, :cond_9

    const-string v9, "Sentry-Opentelemetry-Version-Name"

    invoke-virtual {v4, v9}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_6

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v10

    const-string v11, "maven:io.opentelemetry:opentelemetry-sdk"

    invoke-virtual {v10, v11, v9}, Lio/sentry/l5;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v9

    const-string v10, "OpenTelemetry"

    invoke-virtual {v9, v10}, Lio/sentry/l5;->a(Ljava/lang/String;)V

    goto :goto_5

    :catchall_3
    move-exception v3

    goto :goto_6

    :cond_6
    :goto_5
    const-string v9, "Sentry-Opentelemetry-Javaagent-Version-Name"

    invoke-virtual {v4, v9}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v9

    const-string v10, "maven:io.opentelemetry.javaagent:opentelemetry-javaagent"

    invoke-virtual {v9, v10, v4}, Lio/sentry/l5;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v4

    const-string v9, "OpenTelemetry-Agent"

    invoke-virtual {v4, v9}, Lio/sentry/l5;->a(Ljava/lang/String;)V

    :cond_7
    const-string v4, "sentry.java.opentelemetry.agentless"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v4

    const-string v9, "OpenTelemetry-Agentless"

    invoke-virtual {v4, v9}, Lio/sentry/l5;->a(Ljava/lang/String;)V

    :cond_8
    const-string v4, "sentry.java.opentelemetry.agentless-spring"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v4

    const-string v5, "OpenTelemetry-Agentless-Spring"

    invoke-virtual {v4, v5}, Lio/sentry/l5;->a(Ljava/lang/String;)V

    :cond_9
    if-eqz v7, :cond_5

    if-eqz v6, :cond_5

    if-eqz v8, :cond_5

    const-string v4, "sentry.java"

    invoke-virtual {v7, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v4

    invoke-virtual {v4, v8, v6}, Lio/sentry/l5;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto/16 :goto_4

    :goto_6
    :try_start_7
    invoke-virtual {v2}, Lio/sentry/s;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_7

    :catchall_4
    move-exception v2

    :try_start_8
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v3
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_8
    iput-boolean v1, v0, Lio/sentry/internal/a;->a:Z

    throw v2

    :goto_9
    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v0

    iget-object v1, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getFatalLogger()Lio/sentry/v0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/l5;->c(Lio/sentry/v0;)Z

    move-result v0

    return v0
.end method

.method public k(Lgw/c;)Z
    .locals 3

    iget-object p1, p1, Lgw/c;->z:Ljava/util/Set;

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "b64"

    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/Set;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    return v0
.end method

.method public l(Lio/sentry/vendor/gson/stream/a;I)Ljava/io/Serializable;
    .locals 6

    iget-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v0, Lb5/d;

    iget-boolean v1, v0, Lb5/d;->x:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    const/16 v1, 0x64

    const/4 v3, 0x1

    if-lt p2, v1, :cond_1

    iput-boolean v3, v0, Lb5/d;->w:Z

    return-object v2

    :cond_1
    :try_start_0
    sget-object v1, Lio/sentry/util/network/b;->a:[I

    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v1, v1, v4

    packed-switch v1, :pswitch_data_0

    iput-boolean v3, v0, Lb5/d;->x:Z

    return-object v2

    :pswitch_0
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->J()V

    return-object v2

    :pswitch_1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->s()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->nextDouble()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->nextString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->beginArray()V

    :goto_0
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lb5/d;->x:Z

    if-nez v4, :cond_2

    add-int/lit8 v4, p2, 0x1

    invoke-virtual {p0, p1, v4}, Lhm/d;->l(Lio/sentry/vendor/gson/stream/a;I)Ljava/io/Serializable;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->endArray()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    :catch_0
    :try_start_2
    iput-boolean v3, v0, Lb5/d;->x:Z

    return-object v1

    :pswitch_5
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->beginObject()V

    :goto_1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    iget-boolean v4, v0, Lb5/d;->x:Z

    if-nez v4, :cond_3

    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->nextName()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v5, p2, 0x1

    invoke-virtual {p0, p1, v5}, Lhm/d;->l(Lio/sentry/vendor/gson/stream/a;I)Ljava/io/Serializable;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->endObject()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-object v1

    :catch_1
    :try_start_4
    iput-boolean v3, v0, Lb5/d;->x:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    return-object v1

    :catch_2
    iput-boolean v3, v0, Lb5/d;->x:Z

    return-object v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m(Li20/b;)Ljava/util/LinkedHashMap;
    .locals 12

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "address"

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    const/4 v0, 0x0

    invoke-static {p1, v0}, Li20/l1;->p(Li20/b;Lh20/i1;)Ljava/util/Map;

    move-result-object v3

    iget-object p1, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast p1, Li20/s;

    if-eqz p1, :cond_0

    iget-object v1, p1, Li20/s;->y:Ljava/util/LinkedHashSet;

    :goto_0
    move-object v5, v1

    goto :goto_1

    :cond_0
    sget-object v1, Lvy/a;->a:Ljava/util/Set;

    goto :goto_0

    :goto_1
    sget-object v1, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->REQUIRED:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eqz p1, :cond_1

    iget-object p1, p1, Li20/s;->E:Li20/r;

    if-eqz p1, :cond_1

    iget-object v0, p1, Li20/r;->w:Li20/q;

    :cond_1
    invoke-static {v0}, Li20/l1;->m(Li20/q;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object p1

    new-instance v4, Lg40/l;

    const/4 v0, 0x4

    invoke-direct {v4, p1, v1, v0}, Lg40/l;-><init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;I)V

    new-instance v1, Lg40/f;

    const/4 v10, 0x0

    const/16 v11, 0x190

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v8, Lm83/z;->w:Lm83/z;

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lg40/f;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lg40/m;Ljava/util/Set;Lg40/i0;Lg40/v2;Ljava/util/Map;ZZI)V

    invoke-virtual {v1}, Lg40/f;->e()Lec3/f2;

    move-result-object p1

    check-cast p1, Ln53/e;

    iget-object p1, p1, Ln53/e;->y:Ll83/e;

    check-cast p1, Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll40/a;

    iget-object v1, v1, Ll40/a;->a:Ljava/lang/String;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    return-object v0
.end method

.method public n(I)I
    .locals 2

    iget-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v0, Ll1/i1;

    iget v1, v0, Ll1/i1;->b:I

    add-int/lit8 v1, v1, -0x1

    if-gt p1, v1, :cond_0

    return p1

    :cond_0
    iget v1, v0, Ll1/i1;->c:I

    add-int/lit8 v1, v1, -0x1

    if-gt p1, v1, :cond_1

    add-int/lit8 p1, p1, -0x1

    return p1

    :cond_1
    iget v0, v0, Ll1/i1;->d:I

    add-int/lit8 v1, v0, 0x1

    if-gt p1, v1, :cond_2

    add-int/lit8 p1, p1, -0x2

    return p1

    :cond_2
    return v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v0, Ljg/b;

    invoke-virtual {v0}, Ljg/b;->o()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public p(Lkh/a;)Lkh/b;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public q()Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public r(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v0, Lht/i;

    invoke-virtual {v0, p1}, Ld4/h;->j(Ljava/lang/Object;)Z

    return-void
.end method

.method public s(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v0, Lht/i;

    invoke-virtual {v0, p1}, Ld4/h;->k(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public skipValue()V
    .locals 2

    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    const-string v1, "This should not be called during deserialization."

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public v()J
    .locals 2

    iget-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v0, Ljg/b;

    invoke-virtual {v0}, Ljg/b;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public x(I)I
    .locals 2

    iget-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v0, Ll1/i1;

    iget v1, v0, Ll1/i1;->b:I

    if-ge p1, v1, :cond_0

    return p1

    :cond_0
    iget v1, v0, Ll1/i1;->c:I

    if-ge p1, v1, :cond_1

    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_1
    iget v0, v0, Ll1/i1;->d:I

    if-gt p1, v0, :cond_2

    add-int/lit8 p1, p1, 0x2

    return p1

    :cond_2
    add-int/lit8 v0, v0, 0x2

    return v0
.end method
