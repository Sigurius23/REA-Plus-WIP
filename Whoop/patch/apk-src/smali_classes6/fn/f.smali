.class public final Lfn/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;)V
    .locals 0

    iput p1, p0, Lfn/f;->a:I

    iput-object p2, p0, Lfn/f;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILa33/d;)Lfn/z;
    .locals 4

    iget-object v0, p2, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x2

    if-eq p1, v1, :cond_e

    const/4 v2, 0x3

    if-eq p1, v2, :cond_d

    const/4 v2, 0x4

    if-eq p1, v2, :cond_d

    const/16 v3, 0x15

    if-eq p1, v3, :cond_c

    const/16 v3, 0x1b

    if-eq p1, v3, :cond_a

    const/16 v2, 0x24

    if-eq p1, v2, :cond_9

    const/16 v2, 0x59

    if-eq p1, v2, :cond_8

    const/16 v2, 0x8a

    if-eq p1, v2, :cond_7

    const/16 v2, 0xac

    if-eq p1, v2, :cond_6

    const/16 v2, 0x101

    if-eq p1, v2, :cond_5

    const/16 v2, 0x86

    if-eq p1, v2, :cond_3

    const/16 v2, 0x87

    if-eq p1, v2, :cond_2

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    goto/16 :goto_0

    :pswitch_0
    const/16 p1, 0x40

    invoke-virtual {p0, p1}, Lfn/f;->c(I)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_0

    :pswitch_1
    invoke-virtual {p0, v1}, Lfn/f;->c(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto/16 :goto_0

    :cond_0
    new-instance p1, Lfn/p;

    new-instance p2, Lfn/n;

    invoke-direct {p2, v0}, Lfn/n;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lfn/p;-><init>(Lfn/h;)V

    return-object p1

    :pswitch_2
    new-instance p1, Lfn/p;

    new-instance v0, Lfn/l;

    new-instance v1, Lxl/a;

    invoke-virtual {p0, p2}, Lfn/f;->b(La33/d;)Ljava/util/List;

    move-result-object p2

    const/16 v2, 0xb

    invoke-direct {v1, p2, v2}, Lxl/a;-><init>(Ljava/util/List;I)V

    invoke-direct {v0, v1}, Lfn/l;-><init>(Lxl/a;)V

    invoke-direct {p1, v0}, Lfn/p;-><init>(Lfn/h;)V

    return-object p1

    :pswitch_3
    invoke-virtual {p0, v1}, Lfn/f;->c(I)Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_0

    :cond_1
    new-instance p1, Lfn/p;

    new-instance p2, Lfn/e;

    const/4 v1, 0x0

    invoke-direct {p2, v1, v0}, Lfn/e;-><init>(ZLjava/lang/String;)V

    invoke-direct {p1, p2}, Lfn/p;-><init>(Lfn/h;)V

    return-object p1

    :cond_2
    :pswitch_4
    new-instance p1, Lfn/p;

    new-instance p2, Lfn/b;

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Lfn/b;-><init>(Ljava/lang/String;I)V

    invoke-direct {p1, p2}, Lfn/p;-><init>(Lfn/h;)V

    return-object p1

    :cond_3
    const/16 p1, 0x10

    invoke-virtual {p0, p1}, Lfn/f;->c(I)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Lfn/v;

    new-instance p2, La33/d;

    const-string v0, "application/x-scte35"

    const/16 v1, 0x15

    invoke-direct {p2, v0, v1}, La33/d;-><init>(Ljava/lang/String;I)V

    invoke-direct {p1, p2}, Lfn/v;-><init>(Lfn/u;)V

    return-object p1

    :cond_5
    new-instance p1, Lfn/v;

    new-instance p2, La33/d;

    const-string v0, "application/vnd.dvb.ait"

    const/16 v1, 0x15

    invoke-direct {p2, v0, v1}, La33/d;-><init>(Ljava/lang/String;I)V

    invoke-direct {p1, p2}, Lfn/v;-><init>(Lfn/u;)V

    return-object p1

    :cond_6
    new-instance p1, Lfn/p;

    new-instance p2, Lfn/b;

    const/4 v1, 0x1

    invoke-direct {p2, v0, v1}, Lfn/b;-><init>(Ljava/lang/String;I)V

    invoke-direct {p1, p2}, Lfn/p;-><init>(Lfn/h;)V

    return-object p1

    :cond_7
    new-instance p1, Lfn/p;

    new-instance p2, Lfn/g;

    invoke-direct {p2, v0}, Lfn/g;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lfn/p;-><init>(Lfn/h;)V

    return-object p1

    :cond_8
    new-instance p1, Lfn/p;

    new-instance v0, Lab/i;

    iget-object p2, p2, La33/d;->y:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    const/4 v1, 0x2

    invoke-direct {v0, p2, v1}, Lab/i;-><init>(Ljava/util/List;I)V

    invoke-direct {p1, v0}, Lfn/p;-><init>(Lfn/h;)V

    return-object p1

    :cond_9
    new-instance p1, Lfn/p;

    new-instance v0, Lab/t;

    new-instance v1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p0, p2}, Lfn/f;->b(La33/d;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v1, p2}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/util/List;)V

    invoke-direct {v0, v1}, Lab/t;-><init>(Lio/sentry/internal/debugmeta/c;)V

    invoke-direct {p1, v0}, Lfn/p;-><init>(Lfn/h;)V

    return-object p1

    :cond_a
    invoke-virtual {p0, v2}, Lfn/f;->c(I)Z

    move-result p1

    if-eqz p1, :cond_b

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_b
    new-instance p1, Lfn/p;

    new-instance v0, Lab/r;

    new-instance v1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p0, p2}, Lfn/f;->b(La33/d;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v1, p2}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/util/List;)V

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Lfn/f;->c(I)Z

    move-result p2

    const/16 v2, 0x8

    invoke-virtual {p0, v2}, Lfn/f;->c(I)Z

    move-result v2

    invoke-direct {v0, v1, p2, v2}, Lab/r;-><init>(Lio/sentry/internal/debugmeta/c;ZZ)V

    invoke-direct {p1, v0}, Lfn/p;-><init>(Lfn/h;)V

    return-object p1

    :cond_c
    new-instance p1, Lfn/p;

    new-instance p2, Lab/i;

    const/4 v0, 0x3

    invoke-direct {p2, v0}, Lab/i;-><init>(I)V

    invoke-direct {p1, p2}, Lfn/p;-><init>(Lfn/h;)V

    return-object p1

    :cond_d
    new-instance p1, Lfn/p;

    new-instance p2, Lfn/o;

    invoke-direct {p2, v0}, Lfn/o;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lfn/p;-><init>(Lfn/h;)V

    return-object p1

    :cond_e
    :pswitch_5
    new-instance p1, Lfn/p;

    new-instance v0, Lfn/j;

    new-instance v1, Lxl/a;

    invoke-virtual {p0, p2}, Lfn/f;->b(La33/d;)Ljava/util/List;

    move-result-object p2

    const/16 v2, 0xb

    invoke-direct {v1, p2, v2}, Lxl/a;-><init>(Ljava/util/List;I)V

    invoke-direct {v0, v1}, Lfn/j;-><init>(Lxl/a;)V

    invoke-direct {p1, v0}, Lfn/p;-><init>(Lfn/h;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_5
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method public b(La33/d;)Ljava/util/List;
    .locals 11

    const/16 v0, 0x20

    invoke-virtual {p0, v0}, Lfn/f;->c(I)Z

    move-result v0

    iget-object v1, p0, Lfn/f;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    new-instance v0, Led3/a;

    iget-object p1, p1, La33/d;->z:Ljava/lang/Object;

    check-cast p1, [B

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, p1, v2, v3}, Led3/a;-><init>([BIB)V

    :goto_0
    invoke-virtual {v0}, Led3/a;->a()I

    move-result p1

    if-lez p1, :cond_7

    invoke-virtual {v0}, Led3/a;->y()I

    move-result p1

    invoke-virtual {v0}, Led3/a;->y()I

    move-result v2

    iget v3, v0, Led3/a;->b:I

    add-int/2addr v3, v2

    const/16 v2, 0x86

    if-ne p1, v2, :cond_6

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Led3/a;->y()I

    move-result v1

    and-int/lit8 v1, v1, 0x1f

    const/4 v2, 0x0

    move v4, v2

    :goto_1
    if-ge v4, v1, :cond_5

    const/4 v5, 0x3

    sget-object v6, Lyr/d;->c:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v5, v6}, Led3/a;->v(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Led3/a;->y()I

    move-result v6

    and-int/lit16 v7, v6, 0x80

    const/4 v8, 0x1

    if-eqz v7, :cond_1

    move v7, v8

    goto :goto_2

    :cond_1
    move v7, v2

    :goto_2
    if-eqz v7, :cond_2

    and-int/lit8 v6, v6, 0x3f

    const-string v9, "application/cea-708"

    goto :goto_3

    :cond_2
    const-string v9, "application/cea-608"

    move v6, v8

    :goto_3
    invoke-virtual {v0}, Led3/a;->y()I

    move-result v10

    int-to-byte v10, v10

    invoke-virtual {v0, v8}, Led3/a;->L(I)V

    if-eqz v7, :cond_4

    and-int/lit8 v7, v10, 0x40

    if-eqz v7, :cond_3

    new-array v7, v8, [B

    aput-byte v8, v7, v2

    goto :goto_4

    :cond_3
    new-array v7, v8, [B

    aput-byte v2, v7, v2

    :goto_4
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    goto :goto_5

    :cond_4
    const/4 v7, 0x0

    :goto_5
    new-instance v8, Lrm/b0;

    invoke-direct {v8}, Lrm/b0;-><init>()V

    iput-object v9, v8, Lrm/b0;->k:Ljava/lang/String;

    iput-object v5, v8, Lrm/b0;->c:Ljava/lang/String;

    iput v6, v8, Lrm/b0;->C:I

    iput-object v7, v8, Lrm/b0;->m:Ljava/util/List;

    new-instance v5, Lrm/c0;

    invoke-direct {v5, v8}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    move-object v1, p1

    :cond_6
    invoke-virtual {v0, v3}, Led3/a;->K(I)V

    goto :goto_0

    :cond_7
    return-object v1
.end method

.method public c(I)Z
    .locals 1

    iget v0, p0, Lfn/f;->a:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
