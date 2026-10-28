.class public final Lt9/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lto/n;
.implements Lyf/o;
.implements Lwn/p;
.implements Lcq/d;
.implements Lqa/l;
.implements Lzx/f;


# static fields
.field public static y:Lt9/u;


# instance fields
.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lt9/u;->w:Ljava/lang/Object;

    .line 4
    iput-object p1, p0, Lt9/u;->x:Ljava/lang/Object;

    return-void

    .line 5
    :pswitch_0
    new-instance p1, Lzx/t;

    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lt9/u;->w:Ljava/lang/Object;

    .line 9
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lt9/u;->x:Ljava/lang/Object;

    return-void

    .line 10
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance p1, Lx8/n;

    invoke-direct {p1}, Lx8/n;-><init>()V

    iput-object p1, p0, Lt9/u;->w:Ljava/lang/Object;

    .line 12
    new-instance p1, Lza/a;

    invoke-direct {p1}, Lza/a;-><init>()V

    iput-object p1, p0, Lt9/u;->x:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt9/u;->w:Ljava/lang/Object;

    iput-object p2, p0, Lt9/u;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static i(Landroid/content/Context;)Lt9/u;
    .locals 7

    sget-object v0, Lt9/u;->y:Lt9/u;

    if-nez v0, :cond_0

    new-instance v0, Lt9/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    iput-object p0, v0, Lt9/u;->x:Ljava/lang/Object;

    sput-object v0, Lt9/u;->y:Lt9/u;

    iget-object p0, v0, Lt9/u;->x:Ljava/lang/Object;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    new-instance v1, Lyp/d;

    sget-object v6, Lcom/google/android/gms/common/api/g;->c:Lcom/google/android/gms/common/api/g;

    const/4 v3, 0x0

    sget-object v4, Lyp/d;->a:Lcom/google/android/gms/common/api/f;

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    iput-object v1, v0, Lt9/u;->w:Ljava/lang/Object;

    :cond_0
    sget-object p0, Lt9/u;->y:Lt9/u;

    return-object p0
.end method

.method public static j(Landroid/content/Context;Ljava/lang/String;)Lso/q;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Lso/q;

    invoke-direct {v1, v0, p1}, Lso/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x34

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Unable to get resources for "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", using local resources."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "OssLicenses"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lso/q;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Lso/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public a()Lts/i;
    .locals 4

    iget-object v0, p0, Lt9/u;->w:Ljava/lang/Object;

    check-cast v0, Lts/k;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lt9/u;->x:Ljava/lang/Object;

    check-cast v1, Lro/i;

    if-eqz v1, :cond_1

    iget v2, v0, Lts/k;->a:I

    iget-object v3, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v3, Lct/a;

    iget-object v3, v3, Lct/a;->a:[B

    array-length v3, v3

    if-ne v2, v3, :cond_0

    new-instance v2, Lts/i;

    invoke-direct {v2, v0, v1}, Lts/i;-><init>(Lts/k;Lro/i;)V

    return-object v2

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lt9/u;->w:Ljava/lang/Object;

    check-cast v0, Landroid/app/PendingIntent;

    iget-object v1, p0, Lt9/u;->x:Ljava/lang/Object;

    check-cast v1, Ltp/n;

    check-cast p1, Lnp/i;

    check-cast p2, Lcq/i;

    new-instance v2, Lip/d;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p2}, Lip/d;-><init>(ILcq/i;)V

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lnp/e;

    invoke-virtual {p1}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object p2

    invoke-static {p2, v0}, Lnp/l;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p2, v1}, Lnp/l;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p2, v2}, Lnp/l;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v0, 0x4f

    invoke-virtual {p1, p2, v0}, Lnp/a;->c0(Landroid/os/Parcel;I)V

    return-void
.end method

.method public b(Lyf/k;JLs83/c;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lt9/u;->x:Ljava/lang/Object;

    check-cast v0, Ld9/p;

    instance-of v1, p4, Lwe/a;

    if-eqz v1, :cond_0

    move-object v1, p4

    check-cast v1, Lwe/a;

    iget v2, v1, Lwe/a;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lwe/a;->E:I

    goto :goto_0

    :cond_0
    new-instance v1, Lwe/a;

    invoke-direct {v1, p0, p4}, Lwe/a;-><init>(Lt9/u;Ls83/c;)V

    :goto_0
    iget-object p4, v1, Lwe/a;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lwe/a;->E:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-wide p2, v1, Lwe/a;->x:J

    iget-object p1, v1, Lwe/a;->w:Lyf/k;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    const-wide/16 v5, 0x0

    cmp-long p4, p2, v5

    if-ltz p4, :cond_5

    iput-object p1, v1, Lwe/a;->w:Lyf/k;

    iput-wide p2, v1, Lwe/a;->x:J

    iput v4, v1, Lwe/a;->E:I

    invoke-virtual {v0, v1}, Ld9/p;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-nez p4, :cond_4

    new-instance p1, Ljava/lang/Long;

    const-wide/16 p2, -0x1

    invoke-direct {p1, p2, p3}, Ljava/lang/Long;-><init>(J)V

    return-object p1

    :cond_4
    iget-object p4, v0, Ld9/p;->g:Ljava/lang/Object;

    check-cast p4, Lyf/k;

    invoke-virtual {p4, p1, p2, p3}, Lyf/k;->c0(Lyf/k;J)J

    move-result-wide p1

    new-instance p3, Ljava/lang/Long;

    invoke-direct {p3, p1, p2}, Ljava/lang/Long;-><init>(J)V

    return-object p3

    :cond_5
    const-string p1, "Invalid limit ("

    const-string p4, ") must be >= 0L"

    invoke-static {p2, p3, p1, p4}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public c()Lko/d0;
    .locals 4

    new-instance v0, Ld1/j;

    iget-object v1, p0, Lt9/u;->w:Ljava/lang/Object;

    check-cast v1, Lwn/p;

    invoke-interface {v1}, Lwn/p;->c()Lko/d0;

    move-result-object v1

    iget-object v2, p0, Lt9/u;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    const/16 v3, 0x1c

    invoke-direct {v0, v3, v1, v2}, Ld1/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public c0()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public cancel()Z
    .locals 1

    iget-object v0, p0, Lt9/u;->w:Ljava/lang/Object;

    check-cast v0, Lyf/o;

    invoke-interface {v0}, Lyf/o;->cancel()Z

    move-result v0

    return v0
.end method

.method public d(Lzx/g;Lq83/d;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, Lt9/u;->w:Ljava/lang/Object;

    check-cast p2, Lzx/x;

    check-cast p2, Lzx/t;

    invoke-virtual {p2, p1}, Lzx/t;->a(Lzx/g;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public e(Lro/i;)V
    .locals 0

    iput-object p1, p0, Lt9/u;->x:Ljava/lang/Object;

    return-void
.end method

.method public f(Lwn/m;Lwn/j;)Lko/d0;
    .locals 2

    new-instance v0, Ld1/j;

    iget-object v1, p0, Lt9/u;->w:Ljava/lang/Object;

    check-cast v1, Lwn/p;

    invoke-interface {v1, p1, p2}, Lwn/p;->f(Lwn/m;Lwn/j;)Lko/d0;

    move-result-object p1

    iget-object p2, p0, Lt9/u;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    const/16 v1, 0x1c

    invoke-direct {v0, v1, p1, p2}, Ld1/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public g(Lts/k;)V
    .locals 0

    iput-object p1, p0, Lt9/u;->w:Ljava/lang/Object;

    return-void
.end method

.method public getLoading()Lec3/r1;
    .locals 1

    iget-object v0, p0, Lt9/u;->x:Ljava/lang/Object;

    check-cast v0, Lec3/r1;

    return-object v0
.end method

.method public h()Z
    .locals 5

    iget-object v0, p0, Lt9/u;->x:Ljava/lang/Object;

    check-cast v0, Ld9/p;

    iget-object v1, v0, Ld9/p;->g:Ljava/lang/Object;

    check-cast v1, Lyf/k;

    iget-object v1, v1, Lyf/k;->w:Lne3/h;

    iget-wide v1, v1, Lne3/h;->x:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-boolean v0, v0, Ld9/p;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt9/u;->w:Ljava/lang/Object;

    check-cast v0, Lyf/o;

    invoke-interface {v0}, Lyf/o;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public k([BIILqa/k;Lx8/d;)V
    .locals 19

    move-object/from16 v1, p0

    move/from16 v0, p2

    iget-object v2, v1, Lt9/u;->w:Ljava/lang/Object;

    check-cast v2, Lx8/n;

    add-int v3, v0, p3

    move-object/from16 v4, p1

    invoke-virtual {v2, v3, v4}, Lx8/n;->D(I[B)V

    invoke-virtual {v2, v0}, Lx8/n;->F(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-static {v2}, Lza/h;->c(Lx8/n;)V
    :try_end_0
    .catch Landroidx/media3/common/ParserException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v3}, Lx8/n;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    :goto_1
    const/4 v4, 0x0

    const/4 v5, -0x1

    move v7, v4

    move v6, v5

    :goto_2
    const/4 v9, 0x1

    const/4 v10, 0x2

    if-ne v6, v5, :cond_5

    iget v7, v2, Lx8/n;->b:I

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v6}, Lx8/n;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    move v6, v4

    goto :goto_2

    :cond_2
    const-string v11, "STYLE"

    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    move v6, v10

    goto :goto_2

    :cond_3
    const-string v10, "NOTE"

    invoke-virtual {v6, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v9

    goto :goto_2

    :cond_4
    const/4 v6, 0x3

    goto :goto_2

    :cond_5
    invoke-virtual {v2, v7}, Lx8/n;->F(I)V

    if-eqz v6, :cond_3b

    if-ne v6, v9, :cond_6

    :goto_3
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v4}, Lx8/n;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_3

    :cond_6
    const/4 v7, 0x0

    if-ne v6, v10, :cond_36

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_35

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v6}, Lx8/n;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    iget-object v6, v1, Lt9/u;->x:Ljava/lang/Object;

    check-cast v6, Lza/a;

    iget-object v11, v6, Lza/a;->a:Lx8/n;

    iget-object v6, v6, Lza/a;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    iget v12, v2, Lx8/n;->b:I

    :goto_4
    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v13}, Lx8/n;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_34

    iget-object v13, v2, Lx8/n;->a:[B

    iget v14, v2, Lx8/n;->b:I

    invoke-virtual {v11, v14, v13}, Lx8/n;->D(I[B)V

    invoke-virtual {v11, v12}, Lx8/n;->F(I)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :goto_5
    invoke-static {v11}, Lza/a;->c(Lx8/n;)V

    invoke-virtual {v11}, Lx8/n;->a()I

    move-result v13

    const-string v14, "{"

    const-string v15, ""

    const/4 v8, 0x5

    if-ge v13, v8, :cond_7

    :goto_6
    move-object v8, v7

    goto/16 :goto_a

    :cond_7
    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v11, v8, v13}, Lx8/n;->r(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v8

    const-string v13, "::cue"

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_6

    :cond_8
    iget v8, v11, Lx8/n;->b:I

    invoke-static {v11, v6}, Lza/a;->b(Lx8/n;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    invoke-virtual {v11, v8}, Lx8/n;->F(I)V

    move-object v8, v15

    goto :goto_a

    :cond_a
    const-string v8, "("

    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    iget v8, v11, Lx8/n;->b:I

    iget v13, v11, Lx8/n;->c:I

    move/from16 v16, v4

    :goto_7
    if-ge v8, v13, :cond_c

    if-nez v16, :cond_c

    iget-object v10, v11, Lx8/n;->a:[B

    add-int/lit8 v16, v8, 0x1

    aget-byte v8, v10, v8

    int-to-char v8, v8

    const/16 v10, 0x29

    if-ne v8, v10, :cond_b

    move v8, v9

    goto :goto_8

    :cond_b
    move v8, v4

    :goto_8
    move/from16 v10, v16

    move/from16 v16, v8

    move v8, v10

    const/4 v10, 0x2

    goto :goto_7

    :cond_c
    add-int/lit8 v8, v8, -0x1

    iget v10, v11, Lx8/n;->b:I

    sub-int/2addr v8, v10

    sget-object v10, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v11, v8, v10}, Lx8/n;->r(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    goto :goto_9

    :cond_d
    move-object v8, v7

    :goto_9
    invoke-static {v11, v6}, Lza/a;->b(Lx8/n;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v10

    const-string v13, ")"

    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    goto :goto_6

    :cond_e
    :goto_a
    if-eqz v8, :cond_32

    invoke-static {v11, v6}, Lza/a;->b(Lx8/n;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_f

    goto/16 :goto_1c

    :cond_f
    new-instance v10, Lza/b;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    iput-object v15, v10, Lza/b;->a:Ljava/lang/String;

    iput-object v15, v10, Lza/b;->b:Ljava/lang/String;

    sget-object v13, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    iput-object v13, v10, Lza/b;->c:Ljava/util/Set;

    iput-object v15, v10, Lza/b;->d:Ljava/lang/String;

    iput-object v7, v10, Lza/b;->e:Ljava/lang/String;

    iput-boolean v4, v10, Lza/b;->g:Z

    iput-boolean v4, v10, Lza/b;->i:Z

    iput v5, v10, Lza/b;->j:I

    iput v5, v10, Lza/b;->k:I

    iput v5, v10, Lza/b;->l:I

    iput v5, v10, Lza/b;->m:I

    iput v5, v10, Lza/b;->n:I

    iput v5, v10, Lza/b;->p:I

    iput-boolean v4, v10, Lza/b;->q:Z

    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_10

    goto :goto_d

    :cond_10
    const/16 v13, 0x5b

    invoke-virtual {v8, v13}, Ljava/lang/String;->indexOf(I)I

    move-result v13

    if-eq v13, v5, :cond_12

    sget-object v14, Lza/a;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v8, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    move-result v14

    if-eqz v14, :cond_11

    invoke-virtual {v7, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v7, v10, Lza/b;->d:Ljava/lang/String;

    :cond_11
    invoke-virtual {v8, v4, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    :cond_12
    sget v7, Lx8/t;->a:I

    const-string v7, "\\."

    invoke-virtual {v8, v7, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v7

    aget-object v8, v7, v4

    const/16 v13, 0x23

    invoke-virtual {v8, v13}, Ljava/lang/String;->indexOf(I)I

    move-result v13

    if-eq v13, v5, :cond_13

    invoke-virtual {v8, v4, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    iput-object v14, v10, Lza/b;->b:Ljava/lang/String;

    add-int/lit8 v13, v13, 0x1

    invoke-virtual {v8, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v10, Lza/b;->a:Ljava/lang/String;

    goto :goto_b

    :cond_13
    iput-object v8, v10, Lza/b;->b:Ljava/lang/String;

    :goto_b
    array-length v8, v7

    if-le v8, v9, :cond_15

    array-length v8, v7

    array-length v13, v7

    if-gt v8, v13, :cond_14

    move v13, v9

    goto :goto_c

    :cond_14
    move v13, v4

    :goto_c
    invoke-static {v13}, Lva3/g;->d(Z)V

    invoke-static {v7, v9, v8}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Ljava/lang/String;

    new-instance v8, Ljava/util/HashSet;

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-direct {v8, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v8, v10, Lza/b;->c:Ljava/util/Set;

    :cond_15
    :goto_d
    move v7, v4

    const/4 v8, 0x0

    :goto_e
    const-string v13, "}"

    if-nez v7, :cond_30

    iget v7, v11, Lx8/n;->b:I

    invoke-static {v11, v6}, Lza/a;->b(Lx8/n;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_17

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_16

    goto :goto_f

    :cond_16
    move v14, v4

    goto :goto_10

    :cond_17
    :goto_f
    move v14, v9

    :goto_10
    if-nez v14, :cond_2f

    invoke-virtual {v11, v7}, Lx8/n;->F(I)V

    invoke-static {v11}, Lza/a;->c(Lx8/n;)V

    invoke-static {v11, v6}, Lza/a;->a(Lx8/n;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_18

    goto/16 :goto_1a

    :cond_18
    const-string v4, ":"

    invoke-static {v11, v6}, Lza/a;->b(Lx8/n;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    goto/16 :goto_1a

    :cond_19
    invoke-static {v11}, Lza/a;->c(Lx8/n;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    :goto_11
    const-string v9, ";"

    if-nez v5, :cond_1d

    iget v1, v11, Lx8/n;->b:I

    move/from16 v17, v5

    invoke-static {v11, v6}, Lza/a;->b(Lx8/n;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1a

    const/4 v1, 0x0

    goto :goto_13

    :cond_1a
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_1c

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1b

    goto :goto_12

    :cond_1b
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, p0

    move/from16 v5, v17

    goto :goto_11

    :cond_1c
    :goto_12
    invoke-virtual {v11, v1}, Lx8/n;->F(I)V

    const/4 v5, 0x1

    move-object/from16 v1, p0

    goto :goto_11

    :cond_1d
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_13
    if-eqz v1, :cond_2f

    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1e

    goto/16 :goto_1a

    :cond_1e
    iget v4, v11, Lx8/n;->b:I

    invoke-static {v11, v6}, Lza/a;->b(Lx8/n;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1f

    goto :goto_14

    :cond_1f
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2f

    invoke-virtual {v11, v4}, Lx8/n;->F(I)V

    :goto_14
    const-string v4, "color"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_20

    const/4 v4, 0x1

    invoke-static {v1, v4}, Lx8/c;->a(Ljava/lang/String;Z)I

    move-result v1

    iput v1, v10, Lza/b;->f:I

    iput-boolean v4, v10, Lza/b;->g:Z

    goto/16 :goto_1a

    :cond_20
    const/4 v4, 0x1

    const-string v5, "background-color"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    invoke-static {v1, v4}, Lx8/c;->a(Ljava/lang/String;Z)I

    move-result v1

    iput v1, v10, Lza/b;->h:I

    iput-boolean v4, v10, Lza/b;->i:Z

    goto/16 :goto_1a

    :cond_21
    const-string v5, "ruby-position"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_23

    const-string v5, "over"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_22

    iput v4, v10, Lza/b;->p:I

    goto/16 :goto_1a

    :cond_22
    const-string v4, "under"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2f

    const/4 v1, 0x2

    iput v1, v10, Lza/b;->p:I

    move v5, v1

    goto/16 :goto_1b

    :cond_23
    const-string v4, "text-combine-upright"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_26

    const-string v4, "all"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_25

    const-string v4, "digits"

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_24

    goto :goto_15

    :cond_24
    const/4 v1, 0x0

    goto :goto_16

    :cond_25
    :goto_15
    const/4 v1, 0x1

    :goto_16
    iput-boolean v1, v10, Lza/b;->q:Z

    goto/16 :goto_1a

    :cond_26
    const-string v4, "text-decoration"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_27

    const-string v4, "underline"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2f

    const/4 v4, 0x1

    iput v4, v10, Lza/b;->k:I

    goto/16 :goto_1a

    :cond_27
    const-string v4, "font-family"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_28

    invoke-static {v1}, Lrg/j;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lza/b;->e:Ljava/lang/String;

    goto/16 :goto_1a

    :cond_28
    const-string v4, "font-weight"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_29

    const-string v4, "bold"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2f

    const/4 v4, 0x1

    iput v4, v10, Lza/b;->l:I

    goto/16 :goto_1a

    :cond_29
    const/4 v4, 0x1

    const-string v5, "font-style"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2a

    const-string v5, "italic"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2f

    iput v4, v10, Lza/b;->m:I

    goto/16 :goto_1a

    :cond_2a
    const-string v4, "font-size"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2f

    sget-object v4, Lza/a;->d:Ljava/util/regex/Pattern;

    invoke-static {v1}, Lrg/j;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-nez v5, :cond_2b

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Invalid font-size: \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'."

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v4, "WebvttCssParser"

    invoke-static {v4, v1}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1a

    :cond_2b
    const/4 v1, 0x2

    invoke-virtual {v4, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    :goto_17
    const/4 v1, -0x1

    goto :goto_18

    :sswitch_0
    const-string v1, "px"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    goto :goto_17

    :cond_2c
    const/4 v1, 0x2

    goto :goto_18

    :sswitch_1
    const-string v1, "em"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    goto :goto_17

    :cond_2d
    const/4 v1, 0x1

    goto :goto_18

    :sswitch_2
    const-string v1, "%"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    goto :goto_17

    :cond_2e
    const/4 v1, 0x0

    :goto_18
    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :pswitch_0
    const/4 v1, 0x1

    iput v1, v10, Lza/b;->n:I

    const/4 v5, 0x2

    goto :goto_19

    :pswitch_1
    const/4 v1, 0x1

    const/4 v5, 0x2

    iput v5, v10, Lza/b;->n:I

    goto :goto_19

    :pswitch_2
    const/4 v1, 0x1

    const/4 v5, 0x2

    const/4 v7, 0x3

    iput v7, v10, Lza/b;->n:I

    :goto_19
    invoke-virtual {v4, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v10, Lza/b;->o:F

    goto :goto_1b

    :cond_2f
    :goto_1a
    const/4 v5, 0x2

    :goto_1b
    move-object/from16 v1, p0

    move v7, v14

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v9, 0x1

    goto/16 :goto_e

    :cond_30
    const/4 v5, 0x2

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_31
    move-object/from16 v1, p0

    move v10, v5

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v7, 0x0

    const/4 v9, 0x1

    goto/16 :goto_5

    :cond_32
    :goto_1c
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_33
    :goto_1d
    move-object/from16 v1, p0

    goto/16 :goto_1

    :cond_34
    move-object/from16 v1, p0

    goto/16 :goto_4

    :cond_35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "A style block was found after the first cue."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    const/4 v7, 0x3

    if-ne v6, v7, :cond_33

    sget-object v1, Lza/g;->a:Ljava/util/regex/Pattern;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v1}, Lx8/n;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_37

    const/4 v7, 0x0

    goto :goto_1e

    :cond_37
    sget-object v5, Lza/g;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    move-result v7

    if-eqz v7, :cond_38

    const/4 v7, 0x0

    invoke-static {v7, v6, v2, v0}, Lza/g;->d(Ljava/lang/String;Ljava/util/regex/Matcher;Lx8/n;Ljava/util/ArrayList;)Lza/c;

    move-result-object v7

    goto :goto_1e

    :cond_38
    const/4 v7, 0x0

    invoke-virtual {v2, v1}, Lx8/n;->h(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_39

    goto :goto_1e

    :cond_39
    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_3a

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1, v2, v0}, Lza/g;->d(Ljava/lang/String;Ljava/util/regex/Matcher;Lx8/n;Ljava/util/ArrayList;)Lza/c;

    move-result-object v7

    :cond_3a
    :goto_1e
    if-eqz v7, :cond_33

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_3b
    new-instance v0, Lho/l;

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4}, Lho/l;-><init>(Ljava/util/ArrayList;I)V

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    invoke-static {v0, v1, v2}, Ldc/a;->P(Lqa/e;Lqa/k;Lx8/d;)V

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :sswitch_data_0
    .sparse-switch
        0x25 -> :sswitch_2
        0xca8 -> :sswitch_1
        0xe08 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public l(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    :try_start_0
    iget-object v0, p0, Lt9/u;->w:Ljava/lang/Object;

    check-cast v0, Lyp/d;

    new-instance v1, Lto/j0;

    invoke-direct {v1, v0, p1}, Lto/j0;-><init>(Lyp/d;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lpp/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Lpp/b;->M:Lcom/google/android/gms/tasks/Task;

    sget-object v2, Lpp/r;->w:Lpp/r;

    new-instance v3, Lla/b;

    const/16 v4, 0x1a

    invoke-direct {v3, v1, v4}, Lla/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcq/d;)Lcom/google/android/gms/tasks/Task;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-virtual {v1, v2, v3, v0}, Lpp/b;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    const-string v1, "OssLicenses"

    const-string v2, "Failed to get package name from OssLicensesClient"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object p1
.end method

.method public q(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object p1, p0, Lt9/u;->w:Ljava/lang/Object;

    check-cast p1, Lxr/b;

    iget-object v0, p0, Lt9/u;->x:Ljava/lang/Object;

    check-cast v0, Lcq/i;

    iget-object v1, p1, Lxr/b;->f:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object p1, p1, Lxr/b;->e:Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
