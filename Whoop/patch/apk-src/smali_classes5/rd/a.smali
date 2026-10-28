.class public final Lrd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/c;
.implements Lxf/f;
.implements Luf/f;


# instance fields
.field public final w:Lqd/f;


# direct methods
.method public constructor <init>(Lqd/f;I)V
    .locals 0

    packed-switch p2, :pswitch_data_0

    const-string p2, "config"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrd/a;->w:Lqd/f;

    return-void

    :pswitch_0
    const-string p2, "config"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrd/a;->w:Lqd/f;

    return-void

    :pswitch_1
    const-string p2, "config"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrd/a;->w:Lqd/f;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public c(Luf/w;Lq83/d;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Ltd/a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Ltd/a;

    iget v4, v3, Ltd/a;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Ltd/a;->z:I

    goto :goto_0

    :cond_0
    new-instance v3, Ltd/a;

    check-cast v2, Ls83/c;

    invoke-direct {v3, v0, v2}, Ltd/a;-><init>(Lrd/a;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Ltd/a;->x:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Ltd/a;->z:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Ltd/a;->w:Luf/w;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v2, "config"

    iget-object v5, v0, Lrd/a;->w:Lqd/f;

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "request"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v7, v5, Lqd/f;->z:Ljava/lang/String;

    iget-boolean v8, v5, Lqd/f;->M:Z

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    iget-boolean v9, v5, Lqd/f;->N:Z

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iget-object v10, v5, Lqd/f;->H:Lcg/o;

    if-eqz v10, :cond_3

    iget-object v10, v10, Lcg/o;->h:Ljava/lang/String;

    goto :goto_1

    :cond_3
    const/4 v10, 0x0

    :goto_1
    iget-object v11, v1, Luf/w;->a:Ldg/a;

    sget-object v12, Lcf/l;->a:Lgf/a;

    invoke-static {v11, v12}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    iget-object v5, v5, Lqd/f;->G:Lng3/o;

    iput-object v1, v3, Ltd/a;->w:Luf/w;

    iput v6, v3, Ltd/a;->z:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Ltd/b;->a:Ljava/util/List;

    invoke-static {v7, v3}, Ltx/f;->X(Ljava/lang/String;Ljava/util/List;)Lfe/b;

    move-result-object v5

    const-string v11, "us-east-1"

    const-string v12, "aws-global"

    const-string v13, "https://sts."

    const-string v15, "https://sts.amazonaws.com"

    const-string v14, "<this>"

    sget-object v6, Lcg/o;->i:Lcg/n;

    if-eqz v5, :cond_14

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    if-nez v10, :cond_14

    if-eqz v7, :cond_14

    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    const-string v0, "ap-northeast-1"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    :goto_2
    move-object v2, v3

    :goto_3
    move-object v0, v4

    goto/16 :goto_6

    :cond_4
    const-string v0, "ap-south-1"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto :goto_2

    :cond_5
    const-string v0, "ap-southeast-1"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto :goto_2

    :cond_6
    const-string v0, "ap-southeast-2"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto :goto_2

    :cond_7
    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_8
    const-string v0, "ca-central-1"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_9
    const-string v0, "eu-central-1"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_a
    const-string v0, "eu-north-1"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_b
    const-string v0, "eu-west-1"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_c
    const-string v0, "eu-west-2"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_d
    const-string v0, "eu-west-3"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_e
    const-string v0, "sa-east-1"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_f
    invoke-virtual {v7, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_10
    const-string v0, "us-east-2"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_11
    const-string v0, "us-west-1"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_12
    const-string v0, "us-west-2"

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, v5, Lfe/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v7}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v3, Lef/a;

    invoke-direct {v3, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_14
    if-eqz v10, :cond_17

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    invoke-static {v6, v10}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v2

    new-instance v3, Lgf/c;

    invoke-direct {v3}, Lgf/c;-><init>()V

    sget-object v5, Lbf/b;->c:Lgf/a;

    invoke-static {v5, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v5, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v0, Lef/a;

    invoke-direct {v0, v2, v3}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    move-object v2, v0

    goto/16 :goto_3

    :cond_15
    new-instance v0, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string v1, "Invalid Configuration: Dualstack and custom endpoint are not supported"

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string v1, "Invalid Configuration: FIPS and custom endpoint are not supported"

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    if-eqz v7, :cond_25

    invoke-static {v7, v3}, Ltx/f;->X(Ljava/lang/String;Ljava/util/List;)Lfe/b;

    move-result-object v0

    if-eqz v0, :cond_25

    iget-object v2, v0, Lfe/b;->b:Ljava/lang/String;

    iget-object v3, v0, Lfe/b;->c:Ljava/lang/String;

    iget-object v5, v0, Lfe/b;->e:Ljava/lang/Boolean;

    iget-object v10, v0, Lfe/b;->d:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16

    move-object/from16 v17, v4

    const-string v4, "https://sts-fips."

    if-eqz v16, :cond_19

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_19

    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    new-instance v0, Lef/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v1

    invoke-direct {v0, v1}, Lef/a;-><init>(Lcg/o;)V

    :goto_4
    move-object v2, v0

    :goto_5
    move-object/from16 v0, v17

    goto/16 :goto_6

    :cond_18
    new-instance v0, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string v1, "FIPS and DualStack are enabled, but this partition does not support one or both"

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1c

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1b

    iget-object v0, v0, Lfe/b;->a:Ljava/lang/String;

    const-string v1, "aws-us-gov"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    new-instance v0, Lef/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".amazonaws.com"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v1

    invoke-direct {v0, v1}, Lef/a;-><init>(Lcg/o;)V

    goto :goto_4

    :cond_1a
    new-instance v0, Lef/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x2e

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v1

    invoke-direct {v0, v1}, Lef/a;-><init>(Lcg/o;)V

    goto :goto_4

    :cond_1b
    new-instance v0, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string v1, "FIPS is enabled but this partition does not support FIPS"

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    new-instance v0, Lef/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v1

    invoke-direct {v0, v1}, Lef/a;-><init>(Lcg/o;)V

    goto/16 :goto_4

    :cond_1d
    new-instance v0, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string v1, "DualStack is enabled but this partition does not support DualStack"

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-static {v6, v15}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v1, Lgf/c;

    invoke-direct {v1}, Lgf/c;-><init>()V

    sget-object v2, Lef/b;->a:Lgf/a;

    const/16 v5, 0x11

    invoke-static {v5, v11}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v2, Lef/a;

    invoke-direct {v2, v0, v1}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_5

    :cond_1f
    new-instance v0, Lef/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x2e

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v1

    invoke-direct {v0, v1}, Lef/a;-><init>(Lcg/o;)V

    goto/16 :goto_4

    :goto_6
    if-ne v2, v0, :cond_20

    return-object v0

    :cond_20
    move-object/from16 v1, p1

    :goto_7
    check-cast v2, Lef/a;

    iget-object v0, v2, Lef/a;->b:Lgf/b;

    sget-object v3, Lbf/b;->c:Lgf/a;

    invoke-interface {v0, v3}, Lgf/b;->d(Lgf/a;)Z

    move-result v3

    if-eqz v3, :cond_21

    iget-object v3, v1, Luf/w;->a:Ldg/a;

    sget-object v4, Lbf/c;->z:Lbf/c;

    invoke-static {v3, v4}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_21
    sget-object v3, Lbf/b;->b:Lgf/a;

    invoke-interface {v0, v3}, Lgf/b;->d(Lgf/a;)Z

    move-result v3

    if-eqz v3, :cond_22

    iget-object v3, v1, Luf/w;->a:Ldg/a;

    sget-object v4, Lbf/c;->E:Lbf/c;

    invoke-static {v3, v4}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_22
    sget-object v3, Lwe/f;->d:Lgf/a;

    invoke-interface {v0, v3}, Lgf/b;->d(Lgf/a;)Z

    move-result v4

    if-eqz v4, :cond_23

    invoke-static {v0, v3}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "s3express"

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    iget-object v0, v1, Luf/w;->a:Ldg/a;

    sget-object v3, Lie/b;->x:Lie/b;

    invoke-static {v0, v3}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_23
    iget-object v0, v1, Luf/w;->c:Lxf/a;

    invoke-interface {v0}, Lxf/a;->getAttributes()Lgf/b;

    move-result-object v0

    sget-object v3, Lxd/a;->b:Lgf/a;

    invoke-interface {v0, v3}, Lgf/b;->d(Lgf/a;)Z

    move-result v0

    if-eqz v0, :cond_24

    iget-object v0, v1, Luf/w;->a:Ldg/a;

    sget-object v1, Lbf/c;->G:Lbf/c;

    invoke-static {v0, v1}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_24
    return-object v2

    :cond_25
    new-instance v0, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string v1, "Invalid Configuration: Missing Region"

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f(Luf/u;Luf/a;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p1, Luf/u;->a:Ldg/a;

    sget-object p2, Lcf/l;->a:Lgf/a;

    invoke-static {p1, p2}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object p2, p0, Lrd/a;->w:Lqd/f;

    iget-object p2, p2, Lqd/f;->P:Lfd/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p2, Lfd/a;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p2, Lfd/a;->c:Ljava/util/List;

    :cond_0
    check-cast p1, Ljava/util/List;

    iget-object p2, p2, Lfd/a;->a:Ljava/util/List;

    if-eqz p2, :cond_1

    invoke-static {p2, p1}, Lds/p;->P(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public j(Ljava/lang/String;)Lxf/c;
    .locals 3

    const-string v0, "schemeId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aws.auth#sigv4"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lrd/a;->w:Lqd/f;

    iget-object p1, p1, Lqd/f;->F:Lve/f;

    return-object p1

    :cond_0
    const-string v0, "smithy.api#noAuth"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lnf/d;->w:Lnf/d;

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "auth scheme "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lue/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " not configured for client"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
