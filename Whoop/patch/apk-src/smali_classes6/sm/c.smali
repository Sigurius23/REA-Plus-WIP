.class public final synthetic Lsm/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llo/h;
.implements Lrm/e;
.implements Lyr/e;
.implements Lt9/r;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lsm/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lsn/o0;

    iget-object p1, p1, Lsn/o0;->b:Lvm/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lu8/q;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Lu8/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lu8/q;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d()[Lt9/n;
    .locals 3

    new-instance v0, Lu9/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu9/a;-><init>(I)V

    const/4 v2, 0x1

    new-array v2, v2, [Lt9/n;

    aput-object v0, v2, v1

    return-object v2
.end method

.method public e(Landroid/os/Bundle;)Lrm/f;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lsm/c;->w:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/16 v7, 0x24

    const/4 v8, 0x0

    packed-switch v2, :pswitch_data_0

    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v10

    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const/4 v6, -0x1

    invoke-virtual {v1, v2, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v12

    invoke-static {v5, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v4, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v4

    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    move-result-object v3

    const/4 v5, 0x5

    invoke-static {v5, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v16

    const/4 v5, 0x6

    invoke-static {v5, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v18

    new-instance v9, Ltn/a;

    if-nez v4, :cond_0

    new-array v4, v8, [I

    :cond_0
    move-object v13, v4

    new-array v1, v8, [Landroid/net/Uri;

    if-nez v2, :cond_1

    :goto_0
    move-object v14, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/net/Uri;

    goto :goto_0

    :goto_1
    if-nez v3, :cond_2

    new-array v3, v8, [J

    :cond_2
    move-object v15, v3

    invoke-direct/range {v9 .. v18}, Ltn/a;-><init>(JI[I[Landroid/net/Uri;[JJZ)V

    return-object v9

    :pswitch_0
    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    if-nez v2, :cond_3

    new-array v2, v8, [Ltn/a;

    move-object v10, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    new-array v6, v6, [Ltn/a;

    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_4

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/os/Bundle;

    sget-object v10, Ltn/a;->H:Lsm/c;

    invoke-virtual {v10, v9}, Lsm/c;->e(Landroid/os/Bundle;)Lrm/f;

    move-result-object v9

    check-cast v9, Ltn/a;

    aput-object v9, v6, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_4
    move-object v10, v6

    :goto_3
    invoke-static {v5, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v5, 0x0

    invoke-virtual {v1, v2, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v11

    invoke-static {v4, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v13

    invoke-static {v3, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v15

    new-instance v9, Ltn/b;

    invoke-direct/range {v9 .. v15}, Ltn/b;-><init>([Ltn/a;JJI)V

    return-object v9

    :pswitch_1
    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    sget-object v2, Lzr/g0;->x:Lzr/e0;

    sget-object v2, Lzr/w0;->E:Lzr/w0;

    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    sget-object v2, Lsn/w0;->E:Lsm/c;

    invoke-static {v2, v1}, Llo/a;->q(Lrm/e;Ljava/util/ArrayList;)Lzr/w0;

    move-result-object v2

    :goto_4
    new-instance v1, Lsn/x0;

    new-array v3, v8, [Lsn/w0;

    invoke-virtual {v2, v3}, Lzr/b0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lsn/w0;

    invoke-direct {v1, v2}, Lsn/x0;-><init>([Lsn/w0;)V

    return-object v1

    :pswitch_2
    sget-object v2, Lrm/c0;->h0:Lqa/b;

    invoke-static {v8, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    sget-object v4, Lzr/g0;->x:Lzr/e0;

    sget-object v4, Lzr/w0;->E:Lzr/w0;

    if-nez v3, :cond_6

    goto :goto_5

    :cond_6
    invoke-static {v2, v3}, Llo/a;->q(Lrm/e;Ljava/util/ArrayList;)Lzr/w0;

    move-result-object v4

    :goto_5
    invoke-static {v6, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lsn/w0;

    new-array v3, v8, [Lrm/c0;

    invoke-virtual {v4, v3}, Lzr/b0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lrm/c0;

    invoke-direct {v2, v1, v3}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lsm/c;->w:I

    invoke-static {p1}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1
.end method
