.class public final Ldd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/h;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ldd/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Ldg/a;Lrf/l;[B)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "context"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "call"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Lrf/l;->x:Lwf/a;

    iget-object v6, v5, Lwf/a;->a:Lmf/t;

    invoke-static {v6}, Lbi/g;->L(Lmf/t;)Z

    move-result v6

    const/16 v7, 0xd

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-nez v6, :cond_41

    invoke-static {v5, v2}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v6

    invoke-static {v1, v6}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object v1

    :try_start_0
    sget-object v10, Lze/a;->a:Lhg/i;

    iget-object v5, v5, Lwf/a;->b:Lmf/h;

    invoke-static {v5, v2}, Lze/a;->a(Lmf/h;[B)Lye/c;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v10, v5, Lye/c;->a:Ljava/lang/String;

    if-eqz v10, :cond_40

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v11

    const-string v12, "value"

    const-string v13, "reason"

    const-string v14, "error_description"

    const-string v15, "error"

    sparse-switch v11, :sswitch_data_0

    goto/16 :goto_26

    :sswitch_0
    const-string v7, "UnsupportedGrantTypeException"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_40

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljk/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    if-eqz v2, :cond_4

    new-instance v1, Ljg/b;

    invoke-direct {v1, v2}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    invoke-direct {v4, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v8, [Lhg/d;

    aput-object v4, v7, v9

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    new-instance v7, Ljg/e;

    invoke-direct {v7, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v8, [Lhg/d;

    aput-object v7, v8, v9

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v3, v7, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v2, v4}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v3

    invoke-static {v3, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v3

    iget v7, v2, Lhg/i;->b:I

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_1

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ljk/c;->a:Ljava/lang/String;

    goto :goto_0

    :cond_1
    :goto_1
    iget v7, v4, Lhg/i;->b:I

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_3

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ljk/c;->b:Ljava/lang/String;

    goto :goto_0

    :cond_3
    :goto_2
    if-eqz v3, :cond_4

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_4
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/UnsupportedGrantTypeException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/UnsupportedGrantTypeException;-><init>(Ljk/c;)V

    goto/16 :goto_27

    :sswitch_1
    const-string v7, "InvalidGrantException"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_40

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljk/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    if-eqz v2, :cond_9

    new-instance v1, Ljg/b;

    invoke-direct {v1, v2}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    invoke-direct {v4, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v8, [Lhg/d;

    aput-object v4, v7, v9

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    new-instance v7, Ljg/e;

    invoke-direct {v7, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v8, [Lhg/d;

    aput-object v7, v8, v9

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v3, v7, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v2, v4}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v3

    invoke-static {v3, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v3

    iget v7, v2, Lhg/i;->b:I

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_6

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ljk/c;->a:Ljava/lang/String;

    goto :goto_3

    :cond_6
    :goto_4
    iget v7, v4, Lhg/i;->b:I

    if-nez v3, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_8

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ljk/c;->b:Ljava/lang/String;

    goto :goto_3

    :cond_8
    :goto_5
    if-eqz v3, :cond_9

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_3

    :cond_9
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/InvalidGrantException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/InvalidGrantException;-><init>(Ljk/c;)V

    goto/16 :goto_27

    :sswitch_2
    const-string v11, "InvalidRequestException"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_40

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgm/r;

    const/16 v1, 0x1b

    invoke-direct {v0, v1, v9}, Lgm/r;-><init>(IZ)V

    if-eqz v2, :cond_14

    new-instance v1, Ljg/b;

    invoke-direct {v1, v2}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    invoke-direct {v4, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v10, v8, [Lhg/d;

    aput-object v4, v10, v9

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    new-instance v10, Ljg/e;

    invoke-direct {v10, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v11, v8, [Lhg/d;

    aput-object v10, v11, v9

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-direct {v4, v3, v10, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v3, Lhg/i;

    sget-object v10, Lhg/l;->d:Lhg/l;

    new-instance v11, Ljg/e;

    invoke-direct {v11, v13}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v8, [Lhg/d;

    aput-object v11, v8, v9

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v3, v10, v8, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lxl/a;

    invoke-direct {v8, v7}, Lxl/a;-><init>(I)V

    invoke-virtual {v8, v2}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v8, v4}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v8, v3}, Lxl/a;->p(Lhg/i;)V

    invoke-static {v8, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v7

    iget v8, v2, Lhg/i;->b:I

    if-nez v7, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ne v9, v8, :cond_b

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lgm/r;->x:Ljava/lang/Object;

    goto :goto_6

    :cond_b
    :goto_7
    iget v8, v4, Lhg/i;->b:I

    if-nez v7, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ne v9, v8, :cond_d

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lgm/r;->y:Ljava/lang/Object;

    goto :goto_6

    :cond_d
    :goto_8
    iget v8, v3, Lhg/i;->b:I

    if-nez v7, :cond_e

    goto :goto_b

    :cond_e
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ne v9, v8, :cond_13

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v7

    sget v8, Lod/l;->a:I

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_1

    goto :goto_9

    :sswitch_3
    const-string v8, "KMS_InvalidStateException"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_9

    :cond_f
    sget-object v7, Lod/i;->b:Lod/i;

    goto :goto_a

    :sswitch_4
    const-string v8, "KMS_DisabledException"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_11

    sget-object v7, Lod/g;->b:Lod/g;

    goto :goto_a

    :sswitch_5
    const-string v8, "KMS_InvalidKeyUsageException"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    goto :goto_9

    :cond_10
    sget-object v7, Lod/h;->b:Lod/h;

    goto :goto_a

    :sswitch_6
    const-string v8, "KMS_NotFoundException"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_12

    :cond_11
    :goto_9
    new-instance v8, Lod/k;

    invoke-direct {v8, v7}, Lod/k;-><init>(Ljava/lang/String;)V

    move-object v7, v8

    goto :goto_a

    :cond_12
    sget-object v7, Lod/j;->b:Lod/j;

    :goto_a
    iput-object v7, v0, Lgm/r;->z:Ljava/lang/Object;

    goto :goto_6

    :cond_13
    :goto_b
    if-eqz v7, :cond_14

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto/16 :goto_6

    :cond_14
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/InvalidRequestException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/InvalidRequestException;-><init>(Lgm/r;)V

    goto/16 :goto_27

    :sswitch_7
    const-string v7, "InvalidScopeException"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_40

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/seon/androidsdk/service/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    if-eqz v2, :cond_19

    new-instance v1, Ljg/b;

    invoke-direct {v1, v2}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    invoke-direct {v4, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v8, [Lhg/d;

    aput-object v4, v7, v9

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    new-instance v7, Ljg/e;

    invoke-direct {v7, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v8, [Lhg/d;

    aput-object v7, v8, v9

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v3, v7, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v2, v4}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v3

    invoke-static {v3, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_c
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v3

    iget v7, v2, Lhg/i;->b:I

    if-nez v3, :cond_15

    goto :goto_d

    :cond_15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_16

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/seon/androidsdk/service/c0;->a:Ljava/lang/String;

    goto :goto_c

    :cond_16
    :goto_d
    iget v7, v4, Lhg/i;->b:I

    if-nez v3, :cond_17

    goto :goto_e

    :cond_17
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_18

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/seon/androidsdk/service/c0;->b:Ljava/lang/String;

    goto :goto_c

    :cond_18
    :goto_e
    if-eqz v3, :cond_19

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_c

    :cond_19
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/InvalidScopeException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/InvalidScopeException;-><init>(Lio/seon/androidsdk/service/c0;)V

    goto/16 :goto_27

    :sswitch_8
    const-string v7, "InternalServerException"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_40

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf9/u;

    invoke-direct {v0, v8}, Lf9/u;-><init>(I)V

    if-eqz v2, :cond_1e

    new-instance v1, Ljg/b;

    invoke-direct {v1, v2}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    invoke-direct {v4, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v8, [Lhg/d;

    aput-object v4, v7, v9

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    new-instance v7, Ljg/e;

    invoke-direct {v7, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v8, [Lhg/d;

    aput-object v7, v8, v9

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v3, v7, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v2, v4}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v3

    invoke-static {v3, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_f
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v3

    iget v7, v2, Lhg/i;->b:I

    if-nez v3, :cond_1a

    goto :goto_10

    :cond_1a
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_1b

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lf9/u;->b:Ljava/lang/String;

    goto :goto_f

    :cond_1b
    :goto_10
    iget v7, v4, Lhg/i;->b:I

    if-nez v3, :cond_1c

    goto :goto_11

    :cond_1c
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_1d

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lf9/u;->c:Ljava/lang/String;

    goto :goto_f

    :cond_1d
    :goto_11
    if-eqz v3, :cond_1e

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_f

    :cond_1e
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/InternalServerException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/InternalServerException;-><init>(Lf9/u;)V

    goto/16 :goto_27

    :sswitch_9
    const-string v7, "UnauthorizedClientException"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_40

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lod/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    if-eqz v2, :cond_23

    new-instance v1, Ljg/b;

    invoke-direct {v1, v2}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    invoke-direct {v4, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v8, [Lhg/d;

    aput-object v4, v7, v9

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    new-instance v7, Ljg/e;

    invoke-direct {v7, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v8, [Lhg/d;

    aput-object v7, v8, v9

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v3, v7, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v2, v4}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v3

    invoke-static {v3, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_12
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v3

    iget v7, v2, Lhg/i;->b:I

    if-nez v3, :cond_1f

    goto :goto_13

    :cond_1f
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_20

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lod/f;->a:Ljava/lang/String;

    goto :goto_12

    :cond_20
    :goto_13
    iget v7, v4, Lhg/i;->b:I

    if-nez v3, :cond_21

    goto :goto_14

    :cond_21
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_22

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lod/f;->b:Ljava/lang/String;

    goto :goto_12

    :cond_22
    :goto_14
    if-eqz v3, :cond_23

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_12

    :cond_23
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/UnauthorizedClientException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/UnauthorizedClientException;-><init>(Lod/f;)V

    goto/16 :goto_27

    :sswitch_a
    const-string v11, "AccessDeniedException"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_40

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgm/r;

    const/16 v1, 0x1a

    invoke-direct {v0, v1, v9}, Lgm/r;-><init>(IZ)V

    if-eqz v2, :cond_2b

    new-instance v1, Ljg/b;

    invoke-direct {v1, v2}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    invoke-direct {v4, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v10, v8, [Lhg/d;

    aput-object v4, v10, v9

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    new-instance v10, Ljg/e;

    invoke-direct {v10, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v11, v8, [Lhg/d;

    aput-object v10, v11, v9

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-direct {v4, v3, v10, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v3, Lhg/i;

    sget-object v10, Lhg/l;->d:Lhg/l;

    new-instance v11, Ljg/e;

    invoke-direct {v11, v13}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v8, [Lhg/d;

    aput-object v11, v8, v9

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v3, v10, v8, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lxl/a;

    invoke-direct {v8, v7}, Lxl/a;-><init>(I)V

    invoke-virtual {v8, v2}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v8, v4}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v8, v3}, Lxl/a;->p(Lhg/i;)V

    invoke-static {v8, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_15
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v7

    iget v8, v2, Lhg/i;->b:I

    if-nez v7, :cond_24

    goto :goto_16

    :cond_24
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ne v9, v8, :cond_25

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lgm/r;->x:Ljava/lang/Object;

    goto :goto_15

    :cond_25
    :goto_16
    iget v8, v4, Lhg/i;->b:I

    if-nez v7, :cond_26

    goto :goto_17

    :cond_26
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ne v9, v8, :cond_27

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lgm/r;->y:Ljava/lang/Object;

    goto :goto_15

    :cond_27
    :goto_17
    iget v8, v3, Lhg/i;->b:I

    if-nez v7, :cond_28

    goto :goto_19

    :cond_28
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ne v9, v8, :cond_2a

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v7

    sget v8, Lod/c;->a:I

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "KMS_AccessDeniedException"

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_29

    sget-object v7, Lod/a;->b:Lod/a;

    goto :goto_18

    :cond_29
    new-instance v8, Lod/b;

    invoke-direct {v8, v7}, Lod/b;-><init>(Ljava/lang/String;)V

    move-object v7, v8

    :goto_18
    iput-object v7, v0, Lgm/r;->z:Ljava/lang/Object;

    goto :goto_15

    :cond_2a
    :goto_19
    if-eqz v7, :cond_2b

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_15

    :cond_2b
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;-><init>(Lgm/r;)V

    goto/16 :goto_27

    :sswitch_b
    const-string v7, "SlowDownException"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_40

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf9/u;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lf9/u;-><init>(I)V

    if-eqz v2, :cond_30

    new-instance v1, Ljg/b;

    invoke-direct {v1, v2}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    invoke-direct {v4, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v8, [Lhg/d;

    aput-object v4, v7, v9

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    new-instance v7, Ljg/e;

    invoke-direct {v7, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v8, [Lhg/d;

    aput-object v7, v8, v9

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v3, v7, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v2, v4}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v3

    invoke-static {v3, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_1a
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v3

    iget v7, v2, Lhg/i;->b:I

    if-nez v3, :cond_2c

    goto :goto_1b

    :cond_2c
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_2d

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lf9/u;->b:Ljava/lang/String;

    goto :goto_1a

    :cond_2d
    :goto_1b
    iget v7, v4, Lhg/i;->b:I

    if-nez v3, :cond_2e

    goto :goto_1c

    :cond_2e
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_2f

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lf9/u;->c:Ljava/lang/String;

    goto :goto_1a

    :cond_2f
    :goto_1c
    if-eqz v3, :cond_30

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_1a

    :cond_30
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;-><init>(Lf9/u;)V

    goto/16 :goto_27

    :sswitch_c
    const-string v7, "ExpiredTokenException"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_40

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/seon/androidsdk/service/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    if-eqz v2, :cond_35

    new-instance v1, Ljg/b;

    invoke-direct {v1, v2}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    invoke-direct {v4, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v8, [Lhg/d;

    aput-object v4, v7, v9

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    new-instance v7, Ljg/e;

    invoke-direct {v7, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v8, [Lhg/d;

    aput-object v7, v8, v9

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v3, v7, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v2, v4}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v3

    invoke-static {v3, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_1d
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v3

    iget v7, v2, Lhg/i;->b:I

    if-nez v3, :cond_31

    goto :goto_1e

    :cond_31
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_32

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/seon/androidsdk/service/c0;->a:Ljava/lang/String;

    goto :goto_1d

    :cond_32
    :goto_1e
    iget v7, v4, Lhg/i;->b:I

    if-nez v3, :cond_33

    goto :goto_1f

    :cond_33
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_34

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/seon/androidsdk/service/c0;->b:Ljava/lang/String;

    goto :goto_1d

    :cond_34
    :goto_1f
    if-eqz v3, :cond_35

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_1d

    :cond_35
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/ExpiredTokenException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/ExpiredTokenException;-><init>(Lio/seon/androidsdk/service/c0;)V

    goto/16 :goto_27

    :sswitch_d
    const-string v7, "InvalidClientException"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_40

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lod/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    if-eqz v2, :cond_3a

    new-instance v1, Ljg/b;

    invoke-direct {v1, v2}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    invoke-direct {v4, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v8, [Lhg/d;

    aput-object v4, v7, v9

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    new-instance v7, Ljg/e;

    invoke-direct {v7, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v8, [Lhg/d;

    aput-object v7, v8, v9

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v3, v7, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v2, v4}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v3

    invoke-static {v3, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_20
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v3

    iget v7, v2, Lhg/i;->b:I

    if-nez v3, :cond_36

    goto :goto_21

    :cond_36
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_37

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lod/f;->a:Ljava/lang/String;

    goto :goto_20

    :cond_37
    :goto_21
    iget v7, v4, Lhg/i;->b:I

    if-nez v3, :cond_38

    goto :goto_22

    :cond_38
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_39

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lod/f;->b:Ljava/lang/String;

    goto :goto_20

    :cond_39
    :goto_22
    if-eqz v3, :cond_3a

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_20

    :cond_3a
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/InvalidClientException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/InvalidClientException;-><init>(Lod/f;)V

    goto/16 :goto_27

    :sswitch_e
    const-string v7, "AuthorizationPendingException"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_40

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljk/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    if-eqz v2, :cond_3f

    new-instance v1, Ljg/b;

    invoke-direct {v1, v2}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    invoke-direct {v4, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v8, [Lhg/d;

    aput-object v4, v7, v9

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    new-instance v7, Ljg/e;

    invoke-direct {v7, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v8, [Lhg/d;

    aput-object v7, v8, v9

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v3, v7, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v2, v4}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v3

    invoke-static {v3, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_23
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v3

    iget v7, v2, Lhg/i;->b:I

    if-nez v3, :cond_3b

    goto :goto_24

    :cond_3b
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_3c

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ljk/c;->a:Ljava/lang/String;

    goto :goto_23

    :cond_3c
    :goto_24
    iget v7, v4, Lhg/i;->b:I

    if-nez v3, :cond_3d

    goto :goto_25

    :cond_3d
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_3e

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ljk/c;->b:Ljava/lang/String;

    goto :goto_23

    :cond_3e
    :goto_25
    if-eqz v3, :cond_3f

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_23

    :cond_3f
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AuthorizationPendingException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AuthorizationPendingException;-><init>(Ljk/c;)V

    goto :goto_27

    :cond_40
    :goto_26
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;

    iget-object v0, v5, Lye/c;->b:Ljava/lang/String;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_27
    invoke-static {v1, v6, v5}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v1

    :catch_0
    move-exception v0

    new-instance v2, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;

    const-string v3, "Failed to parse response as \'restJson1\' error"

    invoke-direct {v2, v0, v3}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object v0, v1, Lrf/l;->x:Lwf/a;

    const/4 v1, 0x0

    invoke-static {v2, v0, v1}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v2

    :cond_41
    new-instance v0, Lab/i0;

    const/4 v1, 0x7

    invoke-direct {v0, v1, v9}, Lab/i0;-><init>(IZ)V

    if-eqz v2, :cond_4c

    new-instance v1, Ljg/b;

    invoke-direct {v1, v2}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    const-string v5, "accessToken"

    invoke-direct {v4, v5}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v5, v8, [Lhg/d;

    aput-object v4, v5, v9

    invoke-static {v5}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    sget-object v5, Lhg/l;->e:Lhg/l;

    new-instance v6, Ljg/e;

    const-string v10, "expiresIn"

    invoke-direct {v6, v10}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v10, v8, [Lhg/d;

    aput-object v6, v10, v9

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v4, v5, v6, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    new-instance v6, Ljg/e;

    const-string v10, "idToken"

    invoke-direct {v6, v10}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v10, v8, [Lhg/d;

    aput-object v6, v10, v9

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v5, v3, v6, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v6, Lhg/i;

    new-instance v10, Ljg/e;

    const-string v11, "refreshToken"

    invoke-direct {v10, v11}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v11, v8, [Lhg/d;

    aput-object v10, v11, v9

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-direct {v6, v3, v10, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v10, Lhg/i;

    new-instance v11, Ljg/e;

    const-string v12, "tokenType"

    invoke-direct {v11, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v8, [Lhg/d;

    aput-object v11, v8, v9

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v10, v3, v8, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v3, Lxl/a;

    invoke-direct {v3, v7}, Lxl/a;-><init>(I)V

    invoke-virtual {v3, v2}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v4}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v5}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v6}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v10}, Lxl/a;->p(Lhg/i;)V

    invoke-static {v3, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_28
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v3

    iget v7, v2, Lhg/i;->b:I

    if-nez v3, :cond_42

    goto :goto_29

    :cond_42
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_43

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lab/i0;->y:Ljava/lang/Object;

    goto :goto_28

    :cond_43
    :goto_29
    iget v7, v4, Lhg/i;->b:I

    if-nez v3, :cond_44

    goto :goto_2a

    :cond_44
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_45

    invoke-interface {v1}, Lhg/g;->h()I

    move-result v3

    iput v3, v0, Lab/i0;->x:I

    goto :goto_28

    :cond_45
    :goto_2a
    iget v7, v5, Lhg/i;->b:I

    if-nez v3, :cond_46

    goto :goto_2b

    :cond_46
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_47

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lab/i0;->z:Ljava/lang/Object;

    goto :goto_28

    :cond_47
    :goto_2b
    iget v7, v6, Lhg/i;->b:I

    if-nez v3, :cond_48

    goto :goto_2c

    :cond_48
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_49

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lab/i0;->E:Ljava/lang/Object;

    goto :goto_28

    :cond_49
    :goto_2c
    iget v7, v10, Lhg/i;->b:I

    if-nez v3, :cond_4a

    goto :goto_2d

    :cond_4a
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v7, :cond_4b

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lab/i0;->F:Ljava/lang/Object;

    goto :goto_28

    :cond_4b
    :goto_2d
    if-eqz v3, :cond_4c

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_28

    :cond_4c
    new-instance v1, Lod/e;

    invoke-direct {v1, v0}, Lod/e;-><init>(Lab/i0;)V

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x46f73d0f -> :sswitch_e
        -0x41aa8a13 -> :sswitch_d
        -0x2440c345 -> :sswitch_c
        -0xcb38ed4 -> :sswitch_b
        0x752b0d0 -> :sswitch_a
        0x1607d110 -> :sswitch_9
        0x2bc913af -> :sswitch_8
        0x2f8f6212 -> :sswitch_7
        0x446dae77 -> :sswitch_2
        0x4da4804a -> :sswitch_1
        0x7891096e -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x158890e -> :sswitch_6
        0x13160824 -> :sswitch_5
        0x69320385 -> :sswitch_4
        0x6e7209e7 -> :sswitch_3
    .end sparse-switch
.end method

.method private final c(Ldg/a;Lrf/l;[B)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "context"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "call"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lrf/l;->x:Lwf/a;

    iget-object v4, v3, Lwf/a;->a:Lmf/t;

    invoke-static {v4}, Lbi/g;->L(Lmf/t;)Z

    move-result v4

    if-nez v4, :cond_a

    invoke-static {v3, v2}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v4

    invoke-static {v1, v4}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object v1

    :try_start_0
    sget-object v5, Lze/a;->a:Lhg/i;

    iget-object v3, v3, Lwf/a;->b:Lmf/h;

    invoke-static {v3, v2}, Lze/a;->a(Lmf/h;[B)Lye/c;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v5, v3, Lye/c;->a:Ljava/lang/String;

    if-eqz v5, :cond_9

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v6, "PasswordResetRequiredException"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {v0, v1, v2}, Lse/c;->k(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordResetRequiredException;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_1
    const-string v6, "ResourceNotFoundException"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-static {v0, v1, v2}, Lse/c;->l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ResourceNotFoundException;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_2
    const-string v6, "InvalidParameterException"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v0, v1, v2}, Ldd/a;->j(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;

    move-result-object v0

    goto :goto_1

    :sswitch_3
    const-string v6, "TooManyRequestsException"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v0, v1, v2}, Lse/c;->m(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/TooManyRequestsException;

    move-result-object v0

    goto :goto_1

    :sswitch_4
    const-string v6, "InternalErrorException"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {v0, v1, v2}, Ldd/a;->g(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InternalErrorException;

    move-result-object v0

    goto :goto_1

    :sswitch_5
    const-string v6, "UserNotConfirmedException"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {v0, v1, v2}, Lse/c;->q(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotConfirmedException;

    move-result-object v0

    goto :goto_1

    :sswitch_6
    const-string v6, "UserNotFoundException"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {v0, v1, v2}, Lse/c;->r(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotFoundException;

    move-result-object v0

    goto :goto_1

    :sswitch_7
    const-string v6, "ForbiddenException"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_0

    :cond_7
    invoke-static {v0, v1, v2}, Ldd/a;->f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ForbiddenException;

    move-result-object v0

    goto :goto_1

    :sswitch_8
    const-string v6, "NotAuthorizedException"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_0

    :cond_8
    invoke-static {v0, v1, v2}, Lse/c;->i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/NotAuthorizedException;

    move-result-object v0

    goto :goto_1

    :cond_9
    :goto_0
    new-instance v0, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    iget-object v1, v3, Lye/c;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-static {v0, v4, v3}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v2, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    const-string v3, "Failed to parse response as \'awsJson1_1\' error"

    invoke-direct {v2, v0, v3}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object v0, v1, Lrf/l;->x:Lwf/a;

    const/4 v1, 0x0

    invoke-static {v2, v0, v1}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v2

    :cond_a
    new-instance v0, Lb30/m;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lb30/m;-><init>(I)V

    const-string v1, ""

    if-eqz v2, :cond_26

    new-instance v3, Ljg/b;

    invoke-direct {v3, v2}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v4, Lhg/l;->f:Lhg/l;

    new-instance v5, Ljg/e;

    const-string v6, "MFAOptions"

    invoke-direct {v5, v6}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x1

    new-array v7, v6, [Lhg/d;

    const/4 v8, 0x0

    aput-object v5, v7, v8

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v2, v4, v5, v8}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    sget-object v7, Lhg/l;->i:Lhg/l;

    new-instance v9, Ljg/e;

    const-string v10, "PreferredMfaSetting"

    invoke-direct {v9, v10}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v10, v6, [Lhg/d;

    aput-object v9, v10, v8

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-direct {v5, v7, v9, v8}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v9, Lhg/i;

    new-instance v10, Ljg/e;

    const-string v11, "UserAttributes"

    invoke-direct {v10, v11}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v11, v6, [Lhg/d;

    aput-object v10, v11, v8

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-direct {v9, v4, v10, v8}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v10, Lhg/i;

    new-instance v11, Ljg/e;

    const-string v12, "UserMFASettingList"

    invoke-direct {v11, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v12, v6, [Lhg/d;

    aput-object v11, v12, v8

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v10, v4, v11, v8}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    new-instance v11, Ljg/e;

    const-string v12, "Username"

    invoke-direct {v11, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v12, v6, [Lhg/d;

    aput-object v11, v12, v8

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v4, v7, v11, v8}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v11, Lxl/a;

    const/16 v12, 0xd

    invoke-direct {v11, v12}, Lxl/a;-><init>(I)V

    invoke-virtual {v11, v2}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v11, v5}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v11, v9}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v11, v10}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v11, v4}, Lxl/a;->p(Lhg/i;)V

    invoke-static {v11, v3}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v12

    iget v13, v2, Lhg/i;->b:I

    if-nez v12, :cond_c

    :cond_b
    move-object/from16 p3, v2

    goto/16 :goto_a

    :cond_c
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-ne v14, v13, :cond_b

    invoke-virtual {v3, v2}, Ljg/b;->a(Lhg/i;)Lhg/a;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :goto_3
    invoke-virtual {v3}, Ljg/b;->e()Z

    move-result v13

    if-eqz v13, :cond_13

    invoke-virtual {v3}, Ljg/b;->i()Z

    move-result v13

    if-eqz v13, :cond_12

    new-instance v13, Lq3/i;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    new-instance v14, Lhg/i;

    new-instance v15, Ljg/e;

    move/from16 p1, v8

    const-string v8, "AttributeName"

    invoke-direct {v15, v8}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v6, [Lhg/d;

    aput-object v15, v8, p1

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    move/from16 v15, p1

    invoke-direct {v14, v7, v8, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    sget-object v15, Lhg/l;->d:Lhg/l;

    new-instance v6, Ljg/e;

    move-object/from16 p3, v2

    const-string v2, "DeliveryMedium"

    invoke-direct {v6, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v6

    const/4 v2, 0x1

    new-array v6, v2, [Lhg/d;

    aput-object v16, v6, p1

    invoke-static {v6}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    move/from16 v6, p1

    invoke-direct {v8, v15, v2, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v14, v8}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v2

    invoke-static {v2, v3}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v6

    iget v15, v14, Lhg/i;->b:I

    move-object/from16 v16, v2

    if-nez v6, :cond_d

    goto :goto_6

    :cond_d
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v15, :cond_e

    invoke-interface/range {v16 .. v16}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v13, Lq3/i;->w:Ljava/lang/Object;

    :goto_5
    move-object/from16 v2, v16

    goto :goto_4

    :cond_e
    :goto_6
    iget v2, v8, Lhg/i;->b:I

    if-nez v6, :cond_f

    goto :goto_7

    :cond_f
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-ne v15, v2, :cond_10

    invoke-interface/range {v16 .. v16}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v2

    sget v6, Lre/g0;->a:I

    invoke-static {v2}, Lvp/c;->K(Ljava/lang/String;)Lre/g0;

    move-result-object v2

    iput-object v2, v13, Lq3/i;->x:Ljava/lang/Object;

    goto :goto_5

    :cond_10
    :goto_7
    if-eqz v6, :cond_11

    invoke-interface/range {v16 .. v16}, Lhg/c;->skipValue()V

    goto :goto_5

    :cond_11
    new-instance v2, Lre/p0;

    invoke-direct {v2, v13}, Lre/p0;-><init>(Lq3/i;)V

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p3

    :goto_8
    const/4 v6, 0x1

    const/4 v8, 0x0

    goto/16 :goto_3

    :cond_12
    move-object/from16 p3, v2

    invoke-virtual {v3}, Ljg/b;->c()V

    goto :goto_8

    :cond_13
    move-object/from16 p3, v2

    iput-object v12, v0, Lb30/m;->x:Ljava/lang/Object;

    :goto_9
    const/4 v6, 0x1

    const/4 v8, 0x0

    goto/16 :goto_2

    :goto_a
    iget v2, v5, Lhg/i;->b:I

    if-nez v12, :cond_14

    goto :goto_c

    :cond_14
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v2, :cond_15

    invoke-interface {v11}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lb30/m;->y:Ljava/lang/Object;

    :goto_b
    move-object/from16 v2, p3

    goto :goto_9

    :cond_15
    :goto_c
    iget v2, v9, Lhg/i;->b:I

    if-nez v12, :cond_16

    goto/16 :goto_12

    :cond_16
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v2, :cond_1f

    invoke-virtual {v3, v9}, Ljg/b;->a(Lhg/i;)Lhg/a;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_d
    invoke-virtual {v3}, Ljg/b;->e()Z

    move-result v6

    if-eqz v6, :cond_1e

    invoke-virtual {v3}, Ljg/b;->i()Z

    move-result v6

    if-eqz v6, :cond_1d

    new-instance v6, Lre/a;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v8, Lhg/i;

    new-instance v12, Ljg/e;

    const-string v13, "Name"

    invoke-direct {v12, v13}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v13, 0x1

    new-array v14, v13, [Lhg/d;

    const/4 v15, 0x0

    aput-object v12, v14, v15

    invoke-static {v14}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v12

    invoke-direct {v8, v7, v12, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v12, Lhg/i;

    new-instance v14, Ljg/e;

    move/from16 p1, v15

    const-string v15, "Value"

    invoke-direct {v14, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v15, v13, [Lhg/d;

    aput-object v14, v15, p1

    invoke-static {v15}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v14

    move/from16 v15, p1

    invoke-direct {v12, v7, v14, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v8, v12}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v14

    invoke-static {v14, v3}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v14

    :goto_e
    invoke-interface {v14}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v16

    iget v13, v8, Lhg/i;->b:I

    if-nez v16, :cond_17

    goto :goto_10

    :cond_17
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-ne v15, v13, :cond_18

    invoke-interface {v14}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v13

    iput-object v13, v6, Lre/a;->a:Ljava/lang/String;

    :goto_f
    const/4 v13, 0x1

    const/4 v15, 0x0

    goto :goto_e

    :cond_18
    :goto_10
    iget v13, v12, Lhg/i;->b:I

    if-nez v16, :cond_19

    goto :goto_11

    :cond_19
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-ne v15, v13, :cond_1a

    invoke-interface {v14}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v13

    iput-object v13, v6, Lre/a;->b:Ljava/lang/String;

    goto :goto_f

    :cond_1a
    :goto_11
    if-eqz v16, :cond_1b

    invoke-interface {v14}, Lhg/c;->skipValue()V

    goto :goto_f

    :cond_1b
    iget-object v8, v6, Lre/a;->a:Ljava/lang/String;

    if-nez v8, :cond_1c

    iput-object v1, v6, Lre/a;->a:Ljava/lang/String;

    :cond_1c
    new-instance v8, Lre/b;

    invoke-direct {v8, v6}, Lre/b;-><init>(Lre/a;)V

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_d

    :cond_1d
    invoke-virtual {v3}, Ljg/b;->c()V

    goto/16 :goto_d

    :cond_1e
    iput-object v2, v0, Lb30/m;->z:Ljava/lang/Object;

    goto/16 :goto_b

    :cond_1f
    :goto_12
    iget v2, v10, Lhg/i;->b:I

    if-nez v12, :cond_20

    goto :goto_14

    :cond_20
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v2, :cond_23

    invoke-virtual {v3, v10}, Ljg/b;->a(Lhg/i;)Lhg/a;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_13
    invoke-virtual {v3}, Ljg/b;->e()Z

    move-result v6

    if-eqz v6, :cond_22

    invoke-virtual {v3}, Ljg/b;->i()Z

    move-result v6

    if-eqz v6, :cond_21

    invoke-virtual {v3}, Ljg/b;->o()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_21
    invoke-virtual {v3}, Ljg/b;->c()V

    goto :goto_13

    :cond_22
    iput-object v2, v0, Lb30/m;->E:Ljava/lang/Object;

    goto/16 :goto_b

    :cond_23
    :goto_14
    iget v2, v4, Lhg/i;->b:I

    if-nez v12, :cond_24

    goto :goto_15

    :cond_24
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v2, :cond_25

    invoke-interface {v11}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lb30/m;->F:Ljava/lang/Object;

    goto/16 :goto_b

    :cond_25
    :goto_15
    if-eqz v12, :cond_26

    invoke-interface {v11}, Lhg/c;->skipValue()V

    goto/16 :goto_b

    :cond_26
    iget-object v2, v0, Lb30/m;->z:Ljava/lang/Object;

    if-nez v2, :cond_27

    sget-object v2, Lm83/y;->w:Lm83/y;

    iput-object v2, v0, Lb30/m;->z:Ljava/lang/Object;

    :cond_27
    iget-object v2, v0, Lb30/m;->F:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_28

    iput-object v1, v0, Lb30/m;->F:Ljava/lang/Object;

    :cond_28
    new-instance v1, Lre/m0;

    invoke-direct {v1, v0}, Lre/m0;-><init>(Lb30/m;)V

    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x5475acbf -> :sswitch_8
        -0x176b878a -> :sswitch_7
        -0x148a780b -> :sswitch_6
        -0x199df48 -> :sswitch_5
        0x1e0f1764 -> :sswitch_4
        0x528a7f78 -> :sswitch_3
        0x63cc68dd -> :sswitch_2
        0x6c8eee12 -> :sswitch_1
        0x737c2e7c -> :sswitch_0
    .end sparse-switch
.end method

.method private final d(Ldg/a;Lrf/l;[B)Ljava/lang/Object;
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lrf/l;->x:Lwf/a;

    iget-object v1, v0, Lwf/a;->a:Lmf/t;

    invoke-static {v1}, Lbi/g;->L(Lmf/t;)Z

    move-result v1

    if-nez v1, :cond_12

    invoke-static {v0, p3}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v1

    invoke-static {p2, v1}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object p2

    :try_start_0
    sget-object v2, Lze/a;->a:Lhg/i;

    iget-object v0, v0, Lwf/a;->b:Lmf/h;

    invoke-static {v0, p3}, Lze/a;->a(Lmf/h;[B)Lye/c;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, v0, Lye/c;->a:Ljava/lang/String;

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v3, "InvalidUserPoolConfigurationException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {p1, p2, p3}, Lse/c;->g(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidUserPoolConfigurationException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_1
    const-string v3, "UnsupportedOperationException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-static {p1, p2, p3}, Lse/c;->o(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UnsupportedOperationException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_2
    const-string v3, "PasswordResetRequiredException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-static {p1, p2, p3}, Lse/c;->k(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordResetRequiredException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_3
    const-string v3, "ResourceNotFoundException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_0

    :cond_3
    invoke-static {p1, p2, p3}, Lse/c;->l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ResourceNotFoundException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_4
    const-string v3, "InvalidParameterException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_0

    :cond_4
    invoke-static {p1, p2, p3}, Ldd/a;->j(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_5
    const-string v3, "TooManyRequestsException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_0

    :cond_5
    invoke-static {p1, p2, p3}, Lse/c;->m(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/TooManyRequestsException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_6
    const-string v3, "UnexpectedLambdaException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_0

    :cond_6
    invoke-static {p1, p2, p3}, Lse/c;->n(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UnexpectedLambdaException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_7
    const-string v3, "UserLambdaValidationException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_0

    :cond_7
    invoke-static {p1, p2, p3}, Lse/c;->p(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserLambdaValidationException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_8
    const-string v3, "InternalErrorException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_0

    :cond_8
    invoke-static {p1, p2, p3}, Ldd/a;->g(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InternalErrorException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_9
    const-string v3, "UserNotConfirmedException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto/16 :goto_0

    :cond_9
    invoke-static {p1, p2, p3}, Lse/c;->q(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotConfirmedException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_a
    const-string v3, "UserNotFoundException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_0

    :cond_a
    invoke-static {p1, p2, p3}, Lse/c;->r(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotFoundException;

    move-result-object p1

    goto :goto_1

    :sswitch_b
    const-string v3, "ForbiddenException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_0

    :cond_b
    invoke-static {p1, p2, p3}, Ldd/a;->f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ForbiddenException;

    move-result-object p1

    goto :goto_1

    :sswitch_c
    const-string v3, "InvalidSmsRoleTrustRelationshipException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_0

    :cond_c
    invoke-static {p1, p2, p3}, Lse/c;->f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidSmsRoleTrustRelationshipException;

    move-result-object p1

    goto :goto_1

    :sswitch_d
    const-string v3, "InvalidSmsRoleAccessPolicyException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_0

    :cond_d
    invoke-static {p1, p2, p3}, Ldd/a;->l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidSmsRoleAccessPolicyException;

    move-result-object p1

    goto :goto_1

    :sswitch_e
    const-string v3, "InvalidLambdaResponseException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_0

    :cond_e
    invoke-static {p1, p2, p3}, Ldd/a;->i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidLambdaResponseException;

    move-result-object p1

    goto :goto_1

    :sswitch_f
    const-string v3, "NotAuthorizedException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_0

    :cond_f
    invoke-static {p1, p2, p3}, Lse/c;->i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/NotAuthorizedException;

    move-result-object p1

    goto :goto_1

    :sswitch_10
    const-string v3, "InvalidEmailRoleAccessPolicyException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_0

    :cond_10
    invoke-static {p1, p2, p3}, Ldd/a;->h(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidEmailRoleAccessPolicyException;

    move-result-object p1

    goto :goto_1

    :cond_11
    :goto_0
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    iget-object p2, v0, Lye/c;->b:Ljava/lang/String;

    invoke-direct {p1, p2}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-static {p1, v1, v0}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance p3, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    const-string v0, "Failed to parse response as \'awsJson1_1\' error"

    invoke-direct {p3, p1, v0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object p1, p2, Lrf/l;->x:Lwf/a;

    const/4 p2, 0x0

    invoke-static {p3, p1, p2}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p3

    :cond_12
    new-instance p1, Lb30/m;

    const/16 p2, 0xf

    invoke-direct {p1, p2}, Lb30/m;-><init>(I)V

    if-eqz p3, :cond_21

    new-instance p2, Ljg/b;

    invoke-direct {p2, p3}, Ljg/b;-><init>([B)V

    new-instance p3, Lhg/i;

    sget-object v0, Lhg/l;->j:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "AuthenticationResult"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v3, v2, [Lhg/d;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p3, v0, v1, v4}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v0, Lhg/i;

    sget-object v1, Lhg/l;->f:Lhg/l;

    new-instance v3, Ljg/e;

    const-string v5, "AvailableChallenges"

    invoke-direct {v3, v5}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v5, v2, [Lhg/d;

    aput-object v3, v5, v4

    invoke-static {v5}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v0, v1, v3, v4}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Lhg/i;

    sget-object v3, Lhg/l;->d:Lhg/l;

    new-instance v5, Ljg/e;

    const-string v6, "ChallengeName"

    invoke-direct {v5, v6}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v6, v2, [Lhg/d;

    aput-object v5, v6, v4

    invoke-static {v6}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v1, v3, v5, v4}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v3, Lhg/i;

    sget-object v5, Lhg/l;->h:Lhg/l;

    new-instance v6, Ljg/e;

    const-string v7, "ChallengeParameters"

    invoke-direct {v6, v7}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v2, [Lhg/d;

    aput-object v6, v7, v4

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v3, v5, v6, v4}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    sget-object v6, Lhg/l;->i:Lhg/l;

    new-instance v7, Ljg/e;

    const-string v8, "Session"

    invoke-direct {v7, v8}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v2, v2, [Lhg/d;

    aput-object v7, v2, v4

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v5, v6, v2, v4}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v2, Lxl/a;

    const/16 v4, 0xd

    invoke-direct {v2, v4}, Lxl/a;-><init>(I)V

    invoke-virtual {v2, p3}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v2, v0}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v2, v1}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v2, v3}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v2, v5}, Lxl/a;->p(Lhg/i;)V

    invoke-static {v2, p2}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v4

    iget v6, p3, Lhg/i;->b:I

    if-nez v4, :cond_13

    goto :goto_3

    :cond_13
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_14

    invoke-static {p2}, Lrj/o;->r(Ljg/b;)Lre/h;

    move-result-object v4

    iput-object v4, p1, Lb30/m;->x:Ljava/lang/Object;

    goto :goto_2

    :cond_14
    :goto_3
    iget v6, v0, Lhg/i;->b:I

    if-nez v4, :cond_15

    goto :goto_5

    :cond_15
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_18

    invoke-virtual {p2, v0}, Ljg/b;->a(Lhg/i;)Lhg/a;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-virtual {p2}, Ljg/b;->e()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-virtual {p2}, Ljg/b;->i()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {p2}, Ljg/b;->o()Ljava/lang/String;

    move-result-object v6

    sget v7, Lre/z;->a:I

    invoke-static {v6}, Lvd/f;->q(Ljava/lang/String;)Lre/z;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_16
    invoke-virtual {p2}, Ljg/b;->c()V

    goto :goto_4

    :cond_17
    iput-object v4, p1, Lb30/m;->y:Ljava/lang/Object;

    goto :goto_2

    :cond_18
    :goto_5
    iget v6, v1, Lhg/i;->b:I

    if-nez v4, :cond_19

    goto :goto_6

    :cond_19
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_1a

    invoke-interface {v2}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v4

    sget v6, Lre/z;->a:I

    invoke-static {v4}, Lvd/f;->q(Ljava/lang/String;)Lre/z;

    move-result-object v4

    iput-object v4, p1, Lb30/m;->z:Ljava/lang/Object;

    goto :goto_2

    :cond_1a
    :goto_6
    iget v6, v3, Lhg/i;->b:I

    if-nez v4, :cond_1b

    goto :goto_8

    :cond_1b
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_1e

    invoke-virtual {p2, v3}, Ljg/b;->b(Lhg/i;)Lhg/b;

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_7
    invoke-virtual {p2}, Ljg/b;->f()Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-virtual {p2}, Ljg/b;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2}, Ljg/b;->i()Z

    move-result v7

    if-eqz v7, :cond_1c

    invoke-virtual {p2}, Ljg/b;->o()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_1c
    invoke-virtual {p2}, Ljg/b;->c()V

    goto :goto_7

    :cond_1d
    iput-object v4, p1, Lb30/m;->E:Ljava/lang/Object;

    goto/16 :goto_2

    :cond_1e
    :goto_8
    iget v6, v5, Lhg/i;->b:I

    if-nez v4, :cond_1f

    goto :goto_9

    :cond_1f
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_20

    invoke-interface {v2}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p1, Lb30/m;->F:Ljava/lang/Object;

    goto/16 :goto_2

    :cond_20
    :goto_9
    if-eqz v4, :cond_21

    invoke-interface {v2}, Lhg/c;->skipValue()V

    goto/16 :goto_2

    :cond_21
    new-instance p2, Lre/o0;

    invoke-direct {p2, p1}, Lre/o0;-><init>(Lb30/m;)V

    return-object p2

    :sswitch_data_0
    .sparse-switch
        -0x654a7a22 -> :sswitch_10
        -0x5475acbf -> :sswitch_f
        -0x3bc9abd0 -> :sswitch_e
        -0x315aeb7f -> :sswitch_d
        -0x27dc44c9 -> :sswitch_c
        -0x176b878a -> :sswitch_b
        -0x148a780b -> :sswitch_a
        -0x199df48 -> :sswitch_9
        0x1e0f1764 -> :sswitch_8
        0x35f586e4 -> :sswitch_7
        0x3c9c0b97 -> :sswitch_6
        0x528a7f78 -> :sswitch_5
        0x63cc68dd -> :sswitch_4
        0x6c8eee12 -> :sswitch_3
        0x737c2e7c -> :sswitch_2
        0x7d02499d -> :sswitch_1
        0x7efe4b17 -> :sswitch_0
    .end sparse-switch
.end method

.method private final e(Ldg/a;Lrf/l;[B)Ljava/lang/Object;
    .locals 10

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "call"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p2, Lrf/l;->x:Lwf/a;

    iget-object v3, v2, Lwf/a;->a:Lmf/t;

    invoke-static {v3}, Lbi/g;->L(Lmf/t;)Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_1c

    invoke-static {v2, p3}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v3

    invoke-static {p2, v3}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object p2

    const/4 v6, 0x0

    :try_start_0
    sget-object v7, Lze/a;->a:Lhg/i;

    iget-object v2, v2, Lwf/a;->b:Lmf/h;

    invoke-static {v2, p3}, Lze/a;->a(Lmf/h;[B)Lye/c;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v7, v2, Lye/c;->a:Ljava/lang/String;

    if-eqz v7, :cond_1b

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    const-string v9, "message"

    sparse-switch v8, :sswitch_data_0

    goto/16 :goto_4

    :sswitch_0
    const-string v0, "InvalidUserPoolConfigurationException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-static {p1, p2, p3}, Lse/c;->g(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidUserPoolConfigurationException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_1
    const-string v0, "AliasExistsException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_4

    :cond_1
    invoke-static {p1, p2, p3}, Ldd/a;->b(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/AliasExistsException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_2
    const-string v0, "PasswordResetRequiredException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_4

    :cond_2
    invoke-static {p1, p2, p3}, Lse/c;->k(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordResetRequiredException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_3
    const-string v0, "CodeMismatchException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_4

    :cond_3
    invoke-static {p1, p2, p3}, Ldd/a;->d(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/CodeMismatchException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_4
    const-string v0, "ResourceNotFoundException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_4

    :cond_4
    invoke-static {p1, p2, p3}, Lse/c;->l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ResourceNotFoundException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_5
    const-string v0, "InvalidParameterException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_4

    :cond_5
    invoke-static {p1, p2, p3}, Ldd/a;->j(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_6
    const-string v0, "TooManyRequestsException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_4

    :cond_6
    invoke-static {p1, p2, p3}, Lse/c;->m(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/TooManyRequestsException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_7
    const-string v0, "UnexpectedLambdaException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_4

    :cond_7
    invoke-static {p1, p2, p3}, Lse/c;->n(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UnexpectedLambdaException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_8
    const-string v0, "UserLambdaValidationException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_4

    :cond_8
    invoke-static {p1, p2, p3}, Lse/c;->p(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserLambdaValidationException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_9
    const-string v0, "ExpiredCodeException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_4

    :cond_9
    invoke-static {p1, p2, p3}, Ldd/a;->e(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ExpiredCodeException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_a
    const-string v8, "SoftwareTokenMFANotFoundException"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_c

    new-instance p1, Ljg/b;

    invoke-direct {p1, p3}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object p3, Lhg/l;->i:Lhg/l;

    new-instance v0, Ljg/e;

    invoke-direct {v0, v9}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v1, v4, [Lhg/d;

    aput-object v0, v1, v5

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {p2, p3, v0, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object p3

    invoke-static {p3, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object p3

    iget v0, p2, Lhg/i;->b:I

    if-nez p3, :cond_a

    goto :goto_1

    :cond_a
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_b

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_b
    :goto_1
    if-eqz p3, :cond_c

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_c
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/SoftwareTokenMfaNotFoundException;

    invoke-direct {p1, v6}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p2, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p2, p2, Lte/c;->a:Lgf/c;

    sget-object p3, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p2, p3, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_b
    const-string v0, "InternalErrorException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_4

    :cond_d
    invoke-static {p1, p2, p3}, Ldd/a;->g(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InternalErrorException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_c
    const-string v0, "UserNotConfirmedException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_4

    :cond_e
    invoke-static {p1, p2, p3}, Lse/c;->q(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotConfirmedException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_d
    const-string v0, "UserNotFoundException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_4

    :cond_f
    invoke-static {p1, p2, p3}, Lse/c;->r(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotFoundException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_e
    const-string v0, "ForbiddenException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_4

    :cond_10
    invoke-static {p1, p2, p3}, Ldd/a;->f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ForbiddenException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_f
    const-string v0, "PasswordHistoryPolicyViolationException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_4

    :cond_11
    invoke-static {p1, p2, p3}, Lse/c;->j(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordHistoryPolicyViolationException;

    move-result-object p1

    goto/16 :goto_5

    :sswitch_10
    const-string v8, "MFAMethodNotFoundException"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_14

    new-instance p1, Ljg/b;

    invoke-direct {p1, p3}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object p3, Lhg/l;->i:Lhg/l;

    new-instance v0, Ljg/e;

    invoke-direct {v0, v9}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v1, v4, [Lhg/d;

    aput-object v0, v1, v5

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {p2, p3, v0, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object p3

    invoke-static {p3, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object p3

    iget v0, p2, Lhg/i;->b:I

    if-nez p3, :cond_12

    goto :goto_3

    :cond_12
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_13

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_13
    :goto_3
    if-eqz p3, :cond_14

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_2

    :cond_14
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/MfaMethodNotFoundException;

    invoke-direct {p1, v6}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p2, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p2, p2, Lte/c;->a:Lgf/c;

    sget-object p3, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p2, p3, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    goto :goto_5

    :sswitch_11
    const-string v0, "InvalidSmsRoleTrustRelationshipException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_4

    :cond_15
    invoke-static {p1, p2, p3}, Lse/c;->f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidSmsRoleTrustRelationshipException;

    move-result-object p1

    goto :goto_5

    :sswitch_12
    const-string v0, "InvalidSmsRoleAccessPolicyException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_4

    :cond_16
    invoke-static {p1, p2, p3}, Ldd/a;->l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidSmsRoleAccessPolicyException;

    move-result-object p1

    goto :goto_5

    :sswitch_13
    const-string v0, "InvalidLambdaResponseException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_4

    :cond_17
    invoke-static {p1, p2, p3}, Ldd/a;->i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidLambdaResponseException;

    move-result-object p1

    goto :goto_5

    :sswitch_14
    const-string v0, "NotAuthorizedException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_4

    :cond_18
    invoke-static {p1, p2, p3}, Lse/c;->i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/NotAuthorizedException;

    move-result-object p1

    goto :goto_5

    :sswitch_15
    const-string v0, "InvalidPasswordException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_4

    :cond_19
    invoke-static {p1, p2, p3}, Ldd/a;->k(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidPasswordException;

    move-result-object p1

    goto :goto_5

    :sswitch_16
    const-string v0, "InvalidEmailRoleAccessPolicyException"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto :goto_4

    :cond_1a
    invoke-static {p1, p2, p3}, Ldd/a;->h(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidEmailRoleAccessPolicyException;

    move-result-object p1

    goto :goto_5

    :cond_1b
    :goto_4
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    iget-object p2, v2, Lye/c;->b:Ljava/lang/String;

    invoke-direct {p1, p2}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_5
    invoke-static {p1, v3, v2}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance p3, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    const-string v0, "Failed to parse response as \'awsJson1_1\' error"

    invoke-direct {p3, p1, v0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object p1, p2, Lrf/l;->x:Lwf/a;

    invoke-static {p3, p1, v6}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p3

    :cond_1c
    new-instance p1, Lq/f;

    const/4 p2, 0x5

    invoke-direct {p1, p2, v5}, Lq/f;-><init>(IZ)V

    if-eqz p3, :cond_27

    new-instance p2, Ljg/b;

    invoke-direct {p2, p3}, Ljg/b;-><init>([B)V

    new-instance p3, Lhg/i;

    sget-object v0, Lhg/l;->j:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "AuthenticationResult"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v2, v4, [Lhg/d;

    aput-object v1, v2, v5

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p3, v0, v1, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v0, Lhg/i;

    sget-object v1, Lhg/l;->d:Lhg/l;

    new-instance v2, Ljg/e;

    const-string v3, "ChallengeName"

    invoke-direct {v2, v3}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v3, v4, [Lhg/d;

    aput-object v2, v3, v5

    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v1, v2, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Lhg/i;

    sget-object v2, Lhg/l;->h:Lhg/l;

    new-instance v3, Ljg/e;

    const-string v6, "ChallengeParameters"

    invoke-direct {v3, v6}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v6, v4, [Lhg/d;

    aput-object v3, v6, v5

    invoke-static {v6}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v1, v2, v3, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v6, Ljg/e;

    const-string v7, "Session"

    invoke-direct {v6, v7}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v4, v4, [Lhg/d;

    aput-object v6, v4, v5

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v3, Lxl/a;

    const/16 v4, 0xd

    invoke-direct {v3, v4}, Lxl/a;-><init>(I)V

    invoke-virtual {v3, p3}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v0}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v1}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v2}, Lxl/a;->p(Lhg/i;)V

    invoke-static {v3, p2}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v4

    iget v5, p3, Lhg/i;->b:I

    if-nez v4, :cond_1d

    goto :goto_7

    :cond_1d
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_1e

    invoke-static {p2}, Lrj/o;->r(Ljg/b;)Lre/h;

    move-result-object v4

    iput-object v4, p1, Lq/f;->x:Ljava/lang/Object;

    goto :goto_6

    :cond_1e
    :goto_7
    iget v5, v0, Lhg/i;->b:I

    if-nez v4, :cond_1f

    goto :goto_8

    :cond_1f
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_20

    invoke-interface {v3}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v4

    sget v5, Lre/z;->a:I

    invoke-static {v4}, Lvd/f;->q(Ljava/lang/String;)Lre/z;

    move-result-object v4

    iput-object v4, p1, Lq/f;->y:Ljava/lang/Object;

    goto :goto_6

    :cond_20
    :goto_8
    iget v5, v1, Lhg/i;->b:I

    if-nez v4, :cond_21

    goto :goto_a

    :cond_21
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_24

    invoke-virtual {p2, v1}, Ljg/b;->b(Lhg/i;)Lhg/b;

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_9
    invoke-virtual {p2}, Ljg/b;->f()Z

    move-result v5

    if-eqz v5, :cond_23

    invoke-virtual {p2}, Ljg/b;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Ljg/b;->i()Z

    move-result v6

    if-eqz v6, :cond_22

    invoke-virtual {p2}, Ljg/b;->o()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_22
    invoke-virtual {p2}, Ljg/b;->c()V

    goto :goto_9

    :cond_23
    iput-object v4, p1, Lq/f;->z:Ljava/lang/Object;

    goto :goto_6

    :cond_24
    :goto_a
    iget v5, v2, Lhg/i;->b:I

    if-nez v4, :cond_25

    goto :goto_b

    :cond_25
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_26

    invoke-interface {v3}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p1, Lq/f;->E:Ljava/lang/Object;

    goto :goto_6

    :cond_26
    :goto_b
    if-eqz v4, :cond_27

    invoke-interface {v3}, Lhg/c;->skipValue()V

    goto :goto_6

    :cond_27
    new-instance p2, Lre/s0;

    invoke-direct {p2, p1}, Lre/s0;-><init>(Lq/f;)V

    return-object p2

    :sswitch_data_0
    .sparse-switch
        -0x654a7a22 -> :sswitch_16
        -0x5dbb4d23 -> :sswitch_15
        -0x5475acbf -> :sswitch_14
        -0x3bc9abd0 -> :sswitch_13
        -0x315aeb7f -> :sswitch_12
        -0x27dc44c9 -> :sswitch_11
        -0x25a57129 -> :sswitch_10
        -0x1c00f00b -> :sswitch_f
        -0x176b878a -> :sswitch_e
        -0x148a780b -> :sswitch_d
        -0x199df48 -> :sswitch_c
        0x1e0f1764 -> :sswitch_b
        0x27deef2a -> :sswitch_a
        0x2986dddd -> :sswitch_9
        0x35f586e4 -> :sswitch_8
        0x3c9c0b97 -> :sswitch_7
        0x528a7f78 -> :sswitch_6
        0x63cc68dd -> :sswitch_5
        0x6c8eee12 -> :sswitch_4
        0x6e695f94 -> :sswitch_3
        0x737c2e7c -> :sswitch_2
        0x7db80f03 -> :sswitch_1
        0x7efe4b17 -> :sswitch_0
    .end sparse-switch
.end method

.method private final f(Ldg/a;Lrf/l;[B)Ljava/lang/Object;
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lrf/l;->x:Lwf/a;

    iget-object v1, v0, Lwf/a;->a:Lmf/t;

    invoke-static {v1}, Lbi/g;->L(Lmf/t;)Z

    move-result v1

    if-nez v1, :cond_9

    invoke-static {v0, p3}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v1

    invoke-static {p2, v1}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object p2

    :try_start_0
    sget-object v2, Lze/a;->a:Lhg/i;

    iget-object v0, v0, Lwf/a;->b:Lmf/h;

    invoke-static {v0, p3}, Lze/a;->a(Lmf/h;[B)Lye/c;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, v0, Lye/c;->a:Ljava/lang/String;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v3, "PasswordResetRequiredException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {p1, p2, p3}, Lse/c;->k(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordResetRequiredException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_1
    const-string v3, "ResourceNotFoundException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2, p3}, Lse/c;->l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ResourceNotFoundException;

    move-result-object p1

    goto :goto_1

    :sswitch_2
    const-string v3, "InvalidParameterException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p1, p2, p3}, Ldd/a;->j(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;

    move-result-object p1

    goto :goto_1

    :sswitch_3
    const-string v3, "InternalErrorException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {p1, p2, p3}, Ldd/a;->g(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InternalErrorException;

    move-result-object p1

    goto :goto_1

    :sswitch_4
    const-string v3, "UserNotConfirmedException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {p1, p2, p3}, Lse/c;->q(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotConfirmedException;

    move-result-object p1

    goto :goto_1

    :sswitch_5
    const-string v3, "UserNotFoundException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {p1, p2, p3}, Lse/c;->r(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotFoundException;

    move-result-object p1

    goto :goto_1

    :sswitch_6
    const-string v3, "ForbiddenException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {p1, p2, p3}, Ldd/a;->f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ForbiddenException;

    move-result-object p1

    goto :goto_1

    :sswitch_7
    const-string v3, "NotAuthorizedException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    invoke-static {p1, p2, p3}, Lse/c;->i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/NotAuthorizedException;

    move-result-object p1

    goto :goto_1

    :cond_8
    :goto_0
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    iget-object p2, v0, Lye/c;->b:Ljava/lang/String;

    invoke-direct {p1, p2}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-static {p1, v1, v0}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance p3, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    const-string v0, "Failed to parse response as \'awsJson1_1\' error"

    invoke-direct {p3, p1, v0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object p1, p2, Lrf/l;->x:Lwf/a;

    const/4 p2, 0x0

    invoke-static {p3, p1, p2}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p3

    :cond_9
    new-instance p1, Lre/x0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5475acbf -> :sswitch_7
        -0x176b878a -> :sswitch_6
        -0x148a780b -> :sswitch_5
        -0x199df48 -> :sswitch_4
        0x1e0f1764 -> :sswitch_3
        0x63cc68dd -> :sswitch_2
        0x6c8eee12 -> :sswitch_1
        0x737c2e7c -> :sswitch_0
    .end sparse-switch
.end method

.method private final g(Ldg/a;Lrf/l;[B)Ljava/lang/Object;
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lrf/l;->x:Lwf/a;

    iget-object v1, v0, Lwf/a;->a:Lmf/t;

    invoke-static {v1}, Lbi/g;->L(Lmf/t;)Z

    move-result v1

    if-nez v1, :cond_14

    invoke-static {v0, p3}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v1

    invoke-static {p2, v1}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object p2

    :try_start_0
    sget-object v2, Lze/a;->a:Lhg/i;

    iget-object v0, v0, Lwf/a;->b:Lmf/h;

    invoke-static {v0, p3}, Lze/a;->a(Lmf/h;[B)Lye/c;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, v0, Lye/c;->a:Ljava/lang/String;

    if-eqz v2, :cond_13

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v3, "AliasExistsException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {p1, p2, p3}, Ldd/a;->b(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/AliasExistsException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_1
    const-string v3, "CodeDeliveryFailureException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-static {p1, p2, p3}, Ldd/a;->c(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/CodeDeliveryFailureException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_2
    const-string v3, "PasswordResetRequiredException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-static {p1, p2, p3}, Lse/c;->k(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordResetRequiredException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_3
    const-string v3, "CodeMismatchException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_0

    :cond_3
    invoke-static {p1, p2, p3}, Ldd/a;->d(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/CodeMismatchException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_4
    const-string v3, "ResourceNotFoundException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_0

    :cond_4
    invoke-static {p1, p2, p3}, Lse/c;->l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ResourceNotFoundException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_5
    const-string v3, "InvalidParameterException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_0

    :cond_5
    invoke-static {p1, p2, p3}, Ldd/a;->j(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_6
    const-string v3, "TooManyRequestsException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_0

    :cond_6
    invoke-static {p1, p2, p3}, Lse/c;->m(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/TooManyRequestsException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_7
    const-string v3, "UnexpectedLambdaException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_0

    :cond_7
    invoke-static {p1, p2, p3}, Lse/c;->n(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UnexpectedLambdaException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_8
    const-string v3, "UserLambdaValidationException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_0

    :cond_8
    invoke-static {p1, p2, p3}, Lse/c;->p(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserLambdaValidationException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_9
    const-string v3, "ExpiredCodeException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto/16 :goto_0

    :cond_9
    invoke-static {p1, p2, p3}, Ldd/a;->e(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ExpiredCodeException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_a
    const-string v3, "InternalErrorException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto/16 :goto_0

    :cond_a
    invoke-static {p1, p2, p3}, Ldd/a;->g(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InternalErrorException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_b
    const-string v3, "UserNotConfirmedException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto/16 :goto_0

    :cond_b
    invoke-static {p1, p2, p3}, Lse/c;->q(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotConfirmedException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_c
    const-string v3, "UserNotFoundException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_0

    :cond_c
    invoke-static {p1, p2, p3}, Lse/c;->r(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotFoundException;

    move-result-object p1

    goto :goto_1

    :sswitch_d
    const-string v3, "ForbiddenException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_0

    :cond_d
    invoke-static {p1, p2, p3}, Ldd/a;->f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ForbiddenException;

    move-result-object p1

    goto :goto_1

    :sswitch_e
    const-string v3, "InvalidSmsRoleTrustRelationshipException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_0

    :cond_e
    invoke-static {p1, p2, p3}, Lse/c;->f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidSmsRoleTrustRelationshipException;

    move-result-object p1

    goto :goto_1

    :sswitch_f
    const-string v3, "InvalidSmsRoleAccessPolicyException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_0

    :cond_f
    invoke-static {p1, p2, p3}, Ldd/a;->l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidSmsRoleAccessPolicyException;

    move-result-object p1

    goto :goto_1

    :sswitch_10
    const-string v3, "InvalidLambdaResponseException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_0

    :cond_10
    invoke-static {p1, p2, p3}, Ldd/a;->i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidLambdaResponseException;

    move-result-object p1

    goto :goto_1

    :sswitch_11
    const-string v3, "NotAuthorizedException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_0

    :cond_11
    invoke-static {p1, p2, p3}, Lse/c;->i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/NotAuthorizedException;

    move-result-object p1

    goto :goto_1

    :sswitch_12
    const-string v3, "InvalidEmailRoleAccessPolicyException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_0

    :cond_12
    invoke-static {p1, p2, p3}, Ldd/a;->h(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidEmailRoleAccessPolicyException;

    move-result-object p1

    goto :goto_1

    :cond_13
    :goto_0
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    iget-object p2, v0, Lye/c;->b:Ljava/lang/String;

    invoke-direct {p1, p2}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-static {p1, v1, v0}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance p3, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    const-string v0, "Failed to parse response as \'awsJson1_1\' error"

    invoke-direct {p3, p1, v0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object p1, p2, Lrf/l;->x:Lwf/a;

    const/4 p2, 0x0

    invoke-static {p3, p1, p2}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p3

    :cond_14
    new-instance p1, Laa3/u0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_19

    new-instance p2, Ljg/b;

    invoke-direct {p2, p3}, Ljg/b;-><init>([B)V

    new-instance p3, Lhg/i;

    sget-object v0, Lhg/l;->f:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "CodeDeliveryDetailsList"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p3, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p3}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p2}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v1

    iget v2, p3, Lhg/i;->b:I

    if-nez v1, :cond_15

    goto :goto_4

    :cond_15
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v2, :cond_18

    invoke-virtual {p2, p3}, Ljg/b;->a(Lhg/i;)Lhg/a;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_3
    invoke-virtual {p2}, Ljg/b;->e()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-virtual {p2}, Ljg/b;->i()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-static {p2}, Lrs/b;->h(Ljg/b;)Lre/c0;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_16
    invoke-virtual {p2}, Ljg/b;->c()V

    goto :goto_3

    :cond_17
    iput-object v1, p1, Laa3/u0;->a:Ljava/util/ArrayList;

    goto :goto_2

    :cond_18
    :goto_4
    if-eqz v1, :cond_19

    invoke-interface {v0}, Lhg/c;->skipValue()V

    goto :goto_2

    :cond_19
    new-instance p2, Lre/d1;

    invoke-direct {p2, p1}, Lre/d1;-><init>(Laa3/u0;)V

    return-object p2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x654a7a22 -> :sswitch_12
        -0x5475acbf -> :sswitch_11
        -0x3bc9abd0 -> :sswitch_10
        -0x315aeb7f -> :sswitch_f
        -0x27dc44c9 -> :sswitch_e
        -0x176b878a -> :sswitch_d
        -0x148a780b -> :sswitch_c
        -0x199df48 -> :sswitch_b
        0x1e0f1764 -> :sswitch_a
        0x2986dddd -> :sswitch_9
        0x35f586e4 -> :sswitch_8
        0x3c9c0b97 -> :sswitch_7
        0x528a7f78 -> :sswitch_6
        0x63cc68dd -> :sswitch_5
        0x6c8eee12 -> :sswitch_4
        0x6e695f94 -> :sswitch_3
        0x737c2e7c -> :sswitch_2
        0x740b0126 -> :sswitch_1
        0x7db80f03 -> :sswitch_0
    .end sparse-switch
.end method

.method private final h(Ldg/a;Lrf/l;[B)Ljava/lang/Object;
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lrf/l;->x:Lwf/a;

    iget-object v1, v0, Lwf/a;->a:Lmf/t;

    invoke-static {v1}, Lbi/g;->L(Lmf/t;)Z

    move-result v1

    if-nez v1, :cond_e

    invoke-static {v0, p3}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v1

    invoke-static {p2, v1}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object p2

    :try_start_0
    sget-object v2, Lze/a;->a:Lhg/i;

    iget-object v0, v0, Lwf/a;->b:Lmf/h;

    invoke-static {v0, p3}, Lze/a;->a(Lmf/h;[B)Lye/c;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, v0, Lye/c;->a:Ljava/lang/String;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v3, "AliasExistsException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {p1, p2, p3}, Ldd/a;->b(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/AliasExistsException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_1
    const-string v3, "PasswordResetRequiredException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-static {p1, p2, p3}, Lse/c;->k(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordResetRequiredException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_2
    const-string v3, "CodeMismatchException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-static {p1, p2, p3}, Ldd/a;->d(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/CodeMismatchException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_3
    const-string v3, "ResourceNotFoundException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_0

    :cond_3
    invoke-static {p1, p2, p3}, Lse/c;->l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ResourceNotFoundException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_4
    const-string v3, "InvalidParameterException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_0

    :cond_4
    invoke-static {p1, p2, p3}, Ldd/a;->j(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_5
    const-string v3, "TooManyRequestsException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_0

    :cond_5
    invoke-static {p1, p2, p3}, Lse/c;->m(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/TooManyRequestsException;

    move-result-object p1

    goto/16 :goto_1

    :sswitch_6
    const-string v3, "ExpiredCodeException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {p1, p2, p3}, Ldd/a;->e(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ExpiredCodeException;

    move-result-object p1

    goto :goto_1

    :sswitch_7
    const-string v3, "InternalErrorException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    invoke-static {p1, p2, p3}, Ldd/a;->g(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InternalErrorException;

    move-result-object p1

    goto :goto_1

    :sswitch_8
    const-string v3, "UserNotConfirmedException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_0

    :cond_8
    invoke-static {p1, p2, p3}, Lse/c;->q(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotConfirmedException;

    move-result-object p1

    goto :goto_1

    :sswitch_9
    const-string v3, "UserNotFoundException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_0

    :cond_9
    invoke-static {p1, p2, p3}, Lse/c;->r(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotFoundException;

    move-result-object p1

    goto :goto_1

    :sswitch_a
    const-string v3, "ForbiddenException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_0

    :cond_a
    invoke-static {p1, p2, p3}, Ldd/a;->f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ForbiddenException;

    move-result-object p1

    goto :goto_1

    :sswitch_b
    const-string v3, "NotAuthorizedException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_0

    :cond_b
    invoke-static {p1, p2, p3}, Lse/c;->i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/NotAuthorizedException;

    move-result-object p1

    goto :goto_1

    :sswitch_c
    const-string v3, "LimitExceededException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_0

    :cond_c
    invoke-static {p1, p2, p3}, Lse/c;->h(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/LimitExceededException;

    move-result-object p1

    goto :goto_1

    :cond_d
    :goto_0
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    iget-object p2, v0, Lye/c;->b:Ljava/lang/String;

    invoke-direct {p1, p2}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-static {p1, v1, v0}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance p3, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    const-string v0, "Failed to parse response as \'awsJson1_1\' error"

    invoke-direct {p3, p1, v0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object p1, p2, Lrf/l;->x:Lwf/a;

    const/4 p2, 0x0

    invoke-static {p3, p1, p2}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p3

    :cond_e
    new-instance p1, Lre/f1;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6c64c81f -> :sswitch_c
        -0x5475acbf -> :sswitch_b
        -0x176b878a -> :sswitch_a
        -0x148a780b -> :sswitch_9
        -0x199df48 -> :sswitch_8
        0x1e0f1764 -> :sswitch_7
        0x2986dddd -> :sswitch_6
        0x528a7f78 -> :sswitch_5
        0x63cc68dd -> :sswitch_4
        0x6c8eee12 -> :sswitch_3
        0x6e695f94 -> :sswitch_2
        0x737c2e7c -> :sswitch_1
        0x7db80f03 -> :sswitch_0
    .end sparse-switch
.end method

.method private final i(Ldg/a;Lrf/l;[B)Ljava/lang/Object;
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lrf/l;->x:Lwf/a;

    iget-object v1, v0, Lwf/a;->a:Lmf/t;

    invoke-static {v1}, Lbi/g;->L(Lmf/t;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static {v0, p3}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v0

    invoke-static {p2, v0}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object p2

    if-eqz p3, :cond_5

    :try_start_0
    invoke-static {p3}, Lvd/f;->E([B)Lye/c;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, v1, Lye/c;->a:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "MalformedPolicyDocument"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2, p3}, Lse/c;->c(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/MalformedPolicyDocumentException;

    move-result-object p1

    goto :goto_1

    :sswitch_1
    const-string v3, "RegionDisabledException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2, p3}, Lse/c;->e(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/RegionDisabledException;

    move-result-object p1

    goto :goto_1

    :sswitch_2
    const-string v3, "ExpiredTokenException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p1, p2, p3}, Lse/c;->b(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/ExpiredTokenException;

    move-result-object p1

    goto :goto_1

    :sswitch_3
    const-string v3, "PackedPolicyTooLarge"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {p1, p2, p3}, Lse/c;->d(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/PackedPolicyTooLargeException;

    move-result-object p1

    goto :goto_1

    :cond_4
    :goto_0
    new-instance p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/StsException;

    iget-object p2, v1, Lye/c;->b:Ljava/lang/String;

    invoke-direct {p1, p2}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-static {p1, v0, v1}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_5
    :try_start_1
    const-string p1, "unable to parse error from empty response"

    new-instance p3, Ljava/lang/IllegalStateException;

    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    new-instance p3, Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/StsException;

    const-string v0, "Failed to parse response as \'awsQuery\' error"

    invoke-direct {p3, p1, v0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object p1, p2, Lrf/l;->x:Lwf/a;

    const/4 p2, 0x0

    invoke-static {p3, p1, p2}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p3

    :cond_6
    new-instance p1, Lq/f;

    const/16 p2, 0x10

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lq/f;-><init>(IZ)V

    if-eqz p3, :cond_f

    invoke-static {p3}, Lvd/f;->Z([B)Lb9/b;

    move-result-object p2

    const-string p3, "AssumeRole"

    invoke-static {p2, p3}, Ls4/i;->v(Lb9/b;Ljava/lang/String;)Lb9/b;

    move-result-object p2

    :goto_3
    invoke-virtual {p2}, Lb9/b;->t()Lb9/b;

    move-result-object p3

    if-nez p3, :cond_7

    goto/16 :goto_a

    :cond_7
    invoke-virtual {p3}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_1

    goto/16 :goto_9

    :sswitch_4
    const-string v1, "Credentials"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_9

    :cond_8
    invoke-static {p3}, Ls4/l;->i(Lb9/b;)Lud/f;

    move-result-object v0

    iput-object v0, p1, Lq/f;->y:Ljava/lang/Object;

    goto/16 :goto_9

    :sswitch_5
    const-string v1, "SourceIdentity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_9

    :cond_9
    :try_start_2
    invoke-static {p3}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_5

    :cond_a
    const-string v0, "expected (string: `com.amazonaws.sts#sourceIdentityType`)"

    invoke-static {v0, v1}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_5
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lq/f;->E:Ljava/lang/Object;

    goto :goto_9

    :sswitch_6
    const-string v1, "PackedPolicySize"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_9

    :cond_b
    :try_start_3
    invoke-static {p3}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_6
    instance-of v1, v0, Ll83/m;

    if-nez v1, :cond_c

    :try_start_4
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_7

    :catchall_2
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :cond_c
    :goto_7
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_d

    goto :goto_8

    :cond_d
    const-string v0, "expected (integer: `com.amazonaws.sts#nonNegativeIntegerType`)"

    invoke-static {v0, v1}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_8
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p1, Lq/f;->z:Ljava/lang/Object;

    goto :goto_9

    :sswitch_7
    const-string v1, "AssumedRoleUser"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_9

    :cond_e
    invoke-static {p3}, Ls4/g;->g(Lb9/b;)Lud/e;

    move-result-object v0

    iput-object v0, p1, Lq/f;->x:Ljava/lang/Object;

    :goto_9
    invoke-virtual {p3}, Lb9/b;->j()V

    goto/16 :goto_3

    :cond_f
    :goto_a
    new-instance p2, Lud/b;

    invoke-direct {p2, p1}, Lud/b;-><init>(Lq/f;)V

    return-object p2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x37176faf -> :sswitch_3
        -0x2440c345 -> :sswitch_2
        -0x68b0781 -> :sswitch_1
        0x1fdac4e8 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x6a8fbf67 -> :sswitch_7
        -0x6485b8f5 -> :sswitch_6
        0x6ae9be19 -> :sswitch_5
        0x74a2cadc -> :sswitch_4
    .end sparse-switch
.end method

.method private final j(Ldg/a;Lrf/l;[B)Ljava/lang/Object;
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lrf/l;->x:Lwf/a;

    iget-object v1, v0, Lwf/a;->a:Lmf/t;

    invoke-static {v1}, Lbi/g;->L(Lmf/t;)Z

    move-result v1

    if-nez v1, :cond_f

    invoke-static {v0, p3}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v0

    invoke-static {p2, v0}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object p2

    if-eqz p3, :cond_e

    :try_start_0
    invoke-static {p3}, Lvd/f;->E([B)Lye/c;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, v1, Lye/c;->a:Ljava/lang/String;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_9

    :sswitch_0
    const-string v3, "IDPRejectedClaim"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const-string v2, "context"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "call"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz p3, :cond_2

    invoke-static {p3}, Lvd/f;->Z([B)Lb9/b;

    move-result-object p2

    invoke-static {p2}, Ls40/e0;->j(Lb9/b;)Lb9/b;

    move-result-object p2

    :goto_0
    invoke-virtual {p2}, Lb9/b;->t()Lb9/b;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v2

    const-string v3, "message"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    :try_start_1
    invoke-static {p3}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    const-string p1, "expected (string: `com.amazonaws.sts#idpRejectedClaimMessage`)"

    invoke-static {p1, v2}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/String;

    :cond_1
    invoke-virtual {p3}, Lb9/b;->j()V

    goto :goto_0

    :cond_2
    new-instance p2, Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/IdpRejectedClaimException;

    invoke-direct {p2, p1}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p1, p2, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p1, p1, Lte/c;->a:Lgf/c;

    sget-object p3, Lte/e;->g:Lgf/a;

    sget-object v2, Lte/f;->w:Lte/f;

    invoke-virtual {p1, p3, v2}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    goto/16 :goto_a

    :sswitch_1
    const-string v3, "InvalidIdentityToken"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const-string v2, "context"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "call"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz p3, :cond_5

    invoke-static {p3}, Lvd/f;->Z([B)Lb9/b;

    move-result-object p2

    invoke-static {p2}, Ls40/e0;->j(Lb9/b;)Lb9/b;

    move-result-object p2

    :goto_3
    invoke-virtual {p2}, Lb9/b;->t()Lb9/b;

    move-result-object p3

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v2

    const-string v3, "message"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    :try_start_2
    invoke-static {p3}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_4
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_5

    :cond_3
    const-string p1, "expected (string: `com.amazonaws.sts#invalidIdentityTokenMessage`)"

    invoke-static {p1, v2}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/String;

    :cond_4
    invoke-virtual {p3}, Lb9/b;->j()V

    goto :goto_3

    :cond_5
    new-instance p2, Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/InvalidIdentityTokenException;

    invoke-direct {p2, p1}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p1, p2, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p1, p1, Lte/c;->a:Lgf/c;

    sget-object p3, Lte/e;->g:Lgf/a;

    sget-object v2, Lte/f;->w:Lte/f;

    invoke-virtual {p1, p3, v2}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    goto/16 :goto_a

    :sswitch_2
    const-string v3, "MalformedPolicyDocument"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_9

    :cond_6
    invoke-static {p1, p2, p3}, Lse/c;->c(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/MalformedPolicyDocumentException;

    move-result-object p2

    goto/16 :goto_a

    :sswitch_3
    const-string v3, "RegionDisabledException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_9

    :cond_7
    invoke-static {p1, p2, p3}, Lse/c;->e(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/RegionDisabledException;

    move-result-object p2

    goto/16 :goto_a

    :sswitch_4
    const-string v3, "ExpiredTokenException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_9

    :cond_8
    invoke-static {p1, p2, p3}, Lse/c;->b(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/ExpiredTokenException;

    move-result-object p2

    goto/16 :goto_a

    :sswitch_5
    const-string v3, "PackedPolicyTooLarge"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-static {p1, p2, p3}, Lse/c;->d(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/PackedPolicyTooLargeException;

    move-result-object p2

    goto :goto_a

    :sswitch_6
    const-string v3, "IDPCommunicationError"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const-string v2, "context"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "call"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz p3, :cond_c

    invoke-static {p3}, Lvd/f;->Z([B)Lb9/b;

    move-result-object p2

    invoke-static {p2}, Ls40/e0;->j(Lb9/b;)Lb9/b;

    move-result-object p2

    :goto_6
    invoke-virtual {p2}, Lb9/b;->t()Lb9/b;

    move-result-object p3

    if-eqz p3, :cond_c

    invoke-virtual {p3}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v2

    const-string v3, "message"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    :try_start_3
    invoke-static {p3}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_7

    :catchall_2
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_7
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_a

    goto :goto_8

    :cond_a
    const-string p1, "expected (string: `com.amazonaws.sts#idpCommunicationErrorMessage`)"

    invoke-static {p1, v2}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/String;

    :cond_b
    invoke-virtual {p3}, Lb9/b;->j()V

    goto :goto_6

    :cond_c
    new-instance p2, Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/IdpCommunicationErrorException;

    invoke-direct {p2, p1}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p1, p2, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p1, p1, Lte/c;->a:Lgf/c;

    sget-object p3, Lte/e;->g:Lgf/a;

    sget-object v2, Lte/f;->w:Lte/f;

    invoke-virtual {p1, p3, v2}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    goto :goto_a

    :cond_d
    :goto_9
    new-instance p2, Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/StsException;

    iget-object p1, v1, Lye/c;->b:Ljava/lang/String;

    invoke-direct {p2, p1}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_a
    invoke-static {p2, v0, v1}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p2

    :catch_0
    move-exception p1

    goto :goto_b

    :cond_e
    :try_start_4
    const-string p1, "unable to parse error from empty response"

    new-instance p3, Ljava/lang/IllegalStateException;

    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_b
    new-instance p3, Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/StsException;

    const-string v0, "Failed to parse response as \'awsQuery\' error"

    invoke-direct {p3, p1, v0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object p1, p2, Lrf/l;->x:Lwf/a;

    const/4 p2, 0x0

    invoke-static {p3, p1, p2}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw p3

    :cond_f
    new-instance p1, Lm63/d;

    const/16 p2, 0x9

    invoke-direct {p1, p2}, Lm63/d;-><init>(I)V

    if-eqz p3, :cond_1e

    invoke-static {p3}, Lvd/f;->Z([B)Lb9/b;

    move-result-object p2

    const-string p3, "AssumeRoleWithWebIdentity"

    invoke-static {p2, p3}, Ls4/i;->v(Lb9/b;Ljava/lang/String;)Lb9/b;

    move-result-object p2

    :goto_c
    invoke-virtual {p2}, Lb9/b;->t()Lb9/b;

    move-result-object p3

    if-nez p3, :cond_10

    goto/16 :goto_19

    :cond_10
    invoke-virtual {p3}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_1

    goto/16 :goto_18

    :sswitch_7
    const-string v1, "Credentials"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_18

    :cond_11
    invoke-static {p3}, Ls4/l;->i(Lb9/b;)Lud/f;

    move-result-object v0

    iput-object v0, p1, Lm63/d;->z:Ljava/lang/Object;

    goto/16 :goto_18

    :sswitch_8
    const-string v1, "SourceIdentity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_18

    :cond_12
    :try_start_5
    invoke-static {p3}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_d

    :catchall_3
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_d
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_13

    goto :goto_e

    :cond_13
    const-string v0, "expected (string: `com.amazonaws.sts#sourceIdentityType`)"

    invoke-static {v0, v1}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_e
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lm63/d;->G:Ljava/lang/Object;

    goto/16 :goto_18

    :sswitch_9
    const-string v1, "Audience"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_18

    :cond_14
    :try_start_6
    invoke-static {p3}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_f

    :catchall_4
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_f
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_15

    goto :goto_10

    :cond_15
    const-string v0, "expected (string: `com.amazonaws.sts#Audience`)"

    invoke-static {v0, v1}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_10
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lm63/d;->y:Ljava/lang/Object;

    goto/16 :goto_18

    :sswitch_a
    const-string v1, "Provider"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_18

    :cond_16
    :try_start_7
    invoke-static {p3}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    goto :goto_11

    :catchall_5
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_11
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_17

    goto :goto_12

    :cond_17
    const-string v0, "expected (string: `com.amazonaws.sts#Issuer`)"

    invoke-static {v0, v1}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_12
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lm63/d;->F:Ljava/lang/Object;

    goto/16 :goto_18

    :sswitch_b
    const-string v1, "SubjectFromWebIdentityToken"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_18

    :cond_18
    :try_start_8
    invoke-static {p3}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    goto :goto_13

    :catchall_6
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_13
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_19

    goto :goto_14

    :cond_19
    const-string v0, "expected (string: `com.amazonaws.sts#webIdentitySubjectType`)"

    invoke-static {v0, v1}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_14
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lm63/d;->H:Ljava/lang/Object;

    goto :goto_18

    :sswitch_c
    const-string v1, "PackedPolicySize"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto :goto_18

    :cond_1a
    :try_start_9
    invoke-static {p3}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    goto :goto_15

    :catchall_7
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_15
    instance-of v1, v0, Ll83/m;

    if-nez v1, :cond_1b

    :try_start_a
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    goto :goto_16

    :catchall_8
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :cond_1b
    :goto_16
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_1c

    goto :goto_17

    :cond_1c
    const-string v0, "expected (integer: `com.amazonaws.sts#nonNegativeIntegerType`)"

    invoke-static {v0, v1}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_17
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p1, Lm63/d;->E:Ljava/lang/Object;

    goto :goto_18

    :sswitch_d
    const-string v1, "AssumedRoleUser"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_18

    :cond_1d
    invoke-static {p3}, Ls4/g;->g(Lb9/b;)Lud/e;

    move-result-object v0

    iput-object v0, p1, Lm63/d;->x:Ljava/lang/Object;

    :goto_18
    invoke-virtual {p3}, Lb9/b;->j()V

    goto/16 :goto_c

    :cond_1e
    :goto_19
    new-instance p2, Lud/d;

    invoke-direct {p2, p1}, Lud/d;-><init>(Lm63/d;)V

    return-object p2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x66153cb9 -> :sswitch_6
        -0x37176faf -> :sswitch_5
        -0x2440c345 -> :sswitch_4
        -0x68b0781 -> :sswitch_3
        0x1fdac4e8 -> :sswitch_2
        0x27abbb44 -> :sswitch_1
        0x32c571c9 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x6a8fbf67 -> :sswitch_d
        -0x6485b8f5 -> :sswitch_c
        -0x3b618823 -> :sswitch_b
        -0x370195ef -> :sswitch_a
        0x3e014e24 -> :sswitch_9
        0x6ae9be19 -> :sswitch_8
        0x74a2cadc -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final a(Ldg/a;Lrf/l;[B)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p0

    move-object/from16 v3, p3

    iget v4, v2, Ldd/b;->a:I

    const-string v5, "LimitExceededException"

    const-string v6, "NotAuthorizedException"

    const-string v7, "UserNotFoundException"

    const-string v8, "UserNotConfirmedException"

    const-string v9, "PasswordResetRequiredException"

    const-string v10, "UnauthorizedException"

    const-string v11, "ResourceNotFoundException"

    const-string v12, "Failed to parse response as \'awsJson1_1\' error"

    const-string v13, "ForbiddenException"

    const-string v14, "InternalErrorException"

    const-string v15, "InvalidParameterException"

    const-string v2, "TooManyRequestsException"

    move/from16 v17, v4

    const-string v4, "message"

    move-object/from16 v18, v5

    const-string v5, "call"

    move-object/from16 v19, v6

    const-string v6, "context"

    move-object/from16 v20, v7

    const/4 v7, 0x0

    packed-switch v17, :pswitch_data_0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lrf/l;->x:Lwf/a;

    iget-object v1, v0, Lwf/a;->a:Lmf/t;

    invoke-static {v1}, Lbi/g;->L(Lmf/t;)Z

    move-result v2

    if-nez v2, :cond_6

    sget-object v2, Lwc/j;->a:Ljava/util/Set;

    iget-object v0, v0, Lwf/a;->b:Lmf/h;

    const-string v2, "Content-Type"

    invoke-interface {v0, v2}, Lgf/t;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "application/json"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljg/b;

    invoke-direct {v0, v3}, Ljg/b;-><init>([B)V

    invoke-static {v0}, Lrg/j;->g(Ljg/b;)Lrj/j;

    move-result-object v0

    instance-of v2, v0, Lwc/t;

    if-eqz v2, :cond_1

    check-cast v0, Lwc/t;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "code="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, Lwc/t;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; message="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lwc/t;->d:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "HTTP "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_3
    new-instance v2, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v3, "Error retrieving credentials from container service: "

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object v0, v2, Laws/smithy/kotlin/runtime/SdkBaseException;->w:Lte/c;

    iget-object v3, v0, Lte/c;->a:Lgf/c;

    sget-object v4, Lte/c;->d:Lgf/a;

    sget-object v5, Lmf/t;->g:Lmf/t;

    invoke-virtual {v1, v5}, Lmf/t;->equals(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    iget-object v3, v0, Lte/c;->a:Lgf/c;

    sget-object v4, Lte/c;->c:Lgf/a;

    invoke-virtual {v0}, Lte/c;->d()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {v1}, Lbi/g;->m(Lmf/t;)Lmf/s;

    move-result-object v0

    sget-object v1, Lmf/s;->z:Lmf/s;

    if-ne v0, v1, :cond_5

    :cond_4
    const/4 v7, 0x1

    :cond_5
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    throw v2

    :cond_6
    if-eqz v3, :cond_8

    new-instance v0, Ljg/b;

    invoke-direct {v0, v3}, Ljg/b;-><init>([B)V

    invoke-static {v0}, Lrg/j;->g(Ljg/b;)Lrj/j;

    move-result-object v0

    instance-of v1, v0, Lwc/u;

    if-eqz v1, :cond_7

    check-cast v0, Lwc/u;

    iget-object v1, v0, Lwc/u;->c:Ljava/lang/String;

    iget-object v2, v0, Lwc/u;->d:Ljava/lang/String;

    iget-object v3, v0, Lwc/u;->e:Ljava/lang/String;

    iget-object v4, v0, Lwc/u;->f:Lug/b;

    const-string v5, "EcsContainer"

    iget-object v6, v0, Lwc/u;->g:Ljava/lang/String;

    invoke-static/range {v1 .. v6}, Ls93/h;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Ljava/lang/String;Ljava/lang/String;)Lve/e;

    move-result-object v0

    return-object v0

    :cond_7
    new-instance v0, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v1, "HTTP credentials response was not of expected format"

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v0

    :cond_8
    const/4 v3, 0x0

    new-instance v0, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v1, "HTTP credentials response did not contain a payload"

    invoke-direct {v0, v3, v1}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-direct/range {p0 .. p3}, Ldd/b;->j(Ldg/a;Lrf/l;[B)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-direct/range {p0 .. p3}, Ldd/b;->i(Ldg/a;Lrf/l;[B)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-direct/range {p0 .. p3}, Ldd/b;->h(Ldg/a;Lrf/l;[B)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-direct/range {p0 .. p3}, Ldd/b;->g(Ldg/a;Lrf/l;[B)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-direct/range {p0 .. p3}, Ldd/b;->f(Ldg/a;Lrf/l;[B)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v1, Lrf/l;->x:Lwf/a;

    iget-object v9, v8, Lwf/a;->a:Lmf/t;

    invoke-static {v9}, Lbi/g;->L(Lmf/t;)Z

    move-result v9

    if-nez v9, :cond_17

    invoke-static {v8, v3}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v9

    invoke-static {v1, v9}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object v1

    :try_start_0
    sget-object v11, Lze/a;->a:Lhg/i;

    iget-object v8, v8, Lwf/a;->b:Lmf/h;

    invoke-static {v8, v3}, Lze/a;->a(Lmf/h;[B)Lye/c;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v11, v8, Lye/c;->a:Ljava/lang/String;

    if-eqz v11, :cond_16

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v12

    sparse-switch v12, :sswitch_data_0

    goto/16 :goto_6

    :sswitch_0
    const-string v2, "UnsupportedOperationException"

    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto/16 :goto_6

    :cond_9
    invoke-static {v0, v1, v3}, Lse/c;->o(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UnsupportedOperationException;

    move-result-object v0

    goto/16 :goto_7

    :sswitch_1
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto/16 :goto_6

    :cond_a
    invoke-static {v0, v1, v3}, Ldd/a;->j(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;

    move-result-object v0

    goto/16 :goto_7

    :sswitch_2
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto/16 :goto_6

    :cond_b
    invoke-static {v0, v1, v3}, Lse/c;->m(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/TooManyRequestsException;

    move-result-object v0

    goto/16 :goto_7

    :sswitch_3
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto/16 :goto_6

    :cond_c
    invoke-static {v0, v1, v3}, Ldd/a;->g(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InternalErrorException;

    move-result-object v0

    goto/16 :goto_7

    :sswitch_4
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto/16 :goto_6

    :cond_d
    invoke-static {v0, v1, v3}, Ldd/a;->f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ForbiddenException;

    move-result-object v0

    goto/16 :goto_7

    :sswitch_5
    const-string v2, "UnsupportedTokenTypeException"

    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v3, :cond_10

    new-instance v0, Ljg/b;

    invoke-direct {v0, v3}, Ljg/b;-><init>([B)V

    new-instance v1, Lhg/i;

    sget-object v2, Lhg/l;->i:Lhg/l;

    new-instance v3, Ljg/e;

    invoke-direct {v3, v4}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x1

    new-array v4, v4, [Lhg/d;

    aput-object v3, v4, v7

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v1, v2, v3, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v1}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v2

    invoke-static {v2, v0}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v0

    const/4 v5, 0x0

    :goto_2
    invoke-interface {v0}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v2

    iget v3, v1, Lhg/i;->b:I

    if-nez v2, :cond_e

    goto :goto_3

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v3, :cond_f

    invoke-interface {v0}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_f
    :goto_3
    if-eqz v2, :cond_11

    invoke-interface {v0}, Lhg/c;->skipValue()V

    goto :goto_2

    :cond_10
    const/4 v5, 0x0

    :cond_11
    new-instance v0, Laws/sdk/kotlin/services/cognitoidentityprovider/model/UnsupportedTokenTypeException;

    invoke-direct {v0, v5}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object v1, v0, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object v1, v1, Lte/c;->a:Lgf/c;

    sget-object v2, Lte/e;->g:Lgf/a;

    sget-object v3, Lte/f;->w:Lte/f;

    invoke-virtual {v1, v2, v3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    goto :goto_7

    :sswitch_6
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v3, :cond_14

    new-instance v0, Ljg/b;

    invoke-direct {v0, v3}, Ljg/b;-><init>([B)V

    new-instance v1, Lhg/i;

    sget-object v2, Lhg/l;->i:Lhg/l;

    new-instance v3, Ljg/e;

    invoke-direct {v3, v4}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x1

    new-array v4, v4, [Lhg/d;

    aput-object v3, v4, v7

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v1, v2, v3, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v1}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v2

    invoke-static {v2, v0}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v0

    const/4 v5, 0x0

    :goto_4
    invoke-interface {v0}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v2

    iget v3, v1, Lhg/i;->b:I

    if-nez v2, :cond_12

    goto :goto_5

    :cond_12
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v3, :cond_13

    invoke-interface {v0}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_13
    :goto_5
    if-eqz v2, :cond_15

    invoke-interface {v0}, Lhg/c;->skipValue()V

    goto :goto_4

    :cond_14
    const/4 v5, 0x0

    :cond_15
    new-instance v0, Laws/sdk/kotlin/services/cognitoidentityprovider/model/UnauthorizedException;

    invoke-direct {v0, v5}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object v1, v0, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object v1, v1, Lte/c;->a:Lgf/c;

    sget-object v2, Lte/e;->g:Lgf/a;

    sget-object v3, Lte/f;->w:Lte/f;

    invoke-virtual {v1, v2, v3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    goto :goto_7

    :cond_16
    :goto_6
    new-instance v0, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    iget-object v1, v8, Lye/c;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_7
    invoke-static {v0, v9, v8}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v2, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    invoke-direct {v2, v0, v12}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object v0, v1, Lrf/l;->x:Lwf/a;

    const/4 v3, 0x0

    invoke-static {v2, v0, v3}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v2

    :cond_17
    new-instance v0, Lre/u0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_6
    invoke-direct/range {p0 .. p3}, Ldd/b;->e(Ldg/a;Lrf/l;[B)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-direct/range {p0 .. p3}, Ldd/b;->d(Ldg/a;Lrf/l;[B)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-direct/range {p0 .. p3}, Ldd/b;->c(Ldg/a;Lrf/l;[B)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v1, Lrf/l;->x:Lwf/a;

    iget-object v5, v4, Lwf/a;->a:Lmf/t;

    invoke-static {v5}, Lbi/g;->L(Lmf/t;)Z

    move-result v5

    if-nez v5, :cond_2a

    invoke-static {v4, v3}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v5

    invoke-static {v1, v5}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object v1

    :try_start_1
    sget-object v6, Lze/a;->a:Lhg/i;

    iget-object v4, v4, Lwf/a;->b:Lmf/h;

    invoke-static {v4, v3}, Lze/a;->a(Lmf/h;[B)Lye/c;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    iget-object v6, v4, Lye/c;->a:Ljava/lang/String;

    if-eqz v6, :cond_29

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_1

    goto/16 :goto_8

    :sswitch_7
    const-string v2, "CodeDeliveryFailureException"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    goto/16 :goto_8

    :cond_18
    invoke-static {v0, v1, v3}, Ldd/a;->c(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/CodeDeliveryFailureException;

    move-result-object v0

    goto/16 :goto_9

    :sswitch_8
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    goto/16 :goto_8

    :cond_19
    invoke-static {v0, v1, v3}, Lse/c;->k(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordResetRequiredException;

    move-result-object v0

    goto/16 :goto_9

    :sswitch_9
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    goto/16 :goto_8

    :cond_1a
    invoke-static {v0, v1, v3}, Lse/c;->l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ResourceNotFoundException;

    move-result-object v0

    goto/16 :goto_9

    :sswitch_a
    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    goto/16 :goto_8

    :cond_1b
    invoke-static {v0, v1, v3}, Ldd/a;->j(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;

    move-result-object v0

    goto/16 :goto_9

    :sswitch_b
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    goto/16 :goto_8

    :cond_1c
    invoke-static {v0, v1, v3}, Lse/c;->m(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/TooManyRequestsException;

    move-result-object v0

    goto/16 :goto_9

    :sswitch_c
    const-string v2, "UnexpectedLambdaException"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1d

    goto/16 :goto_8

    :cond_1d
    invoke-static {v0, v1, v3}, Lse/c;->n(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UnexpectedLambdaException;

    move-result-object v0

    goto/16 :goto_9

    :sswitch_d
    const-string v2, "UserLambdaValidationException"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    goto/16 :goto_8

    :cond_1e
    invoke-static {v0, v1, v3}, Lse/c;->p(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserLambdaValidationException;

    move-result-object v0

    goto/16 :goto_9

    :sswitch_e
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    goto/16 :goto_8

    :cond_1f
    invoke-static {v0, v1, v3}, Ldd/a;->g(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InternalErrorException;

    move-result-object v0

    goto/16 :goto_9

    :sswitch_f
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    goto/16 :goto_8

    :cond_20
    invoke-static {v0, v1, v3}, Lse/c;->q(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotConfirmedException;

    move-result-object v0

    goto/16 :goto_9

    :sswitch_10
    move-object/from16 v7, v20

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    goto/16 :goto_8

    :cond_21
    invoke-static {v0, v1, v3}, Lse/c;->r(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotFoundException;

    move-result-object v0

    goto/16 :goto_9

    :sswitch_11
    invoke-virtual {v6, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_22

    goto :goto_8

    :cond_22
    invoke-static {v0, v1, v3}, Ldd/a;->f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ForbiddenException;

    move-result-object v0

    goto :goto_9

    :sswitch_12
    const-string v2, "InvalidSmsRoleTrustRelationshipException"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_23

    goto :goto_8

    :cond_23
    invoke-static {v0, v1, v3}, Lse/c;->f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidSmsRoleTrustRelationshipException;

    move-result-object v0

    goto :goto_9

    :sswitch_13
    const-string v2, "InvalidSmsRoleAccessPolicyException"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_24

    goto :goto_8

    :cond_24
    invoke-static {v0, v1, v3}, Ldd/a;->l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidSmsRoleAccessPolicyException;

    move-result-object v0

    goto :goto_9

    :sswitch_14
    const-string v2, "InvalidLambdaResponseException"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_25

    goto :goto_8

    :cond_25
    invoke-static {v0, v1, v3}, Ldd/a;->i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidLambdaResponseException;

    move-result-object v0

    goto :goto_9

    :sswitch_15
    move-object/from16 v10, v19

    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_26

    goto :goto_8

    :cond_26
    invoke-static {v0, v1, v3}, Lse/c;->i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/NotAuthorizedException;

    move-result-object v0

    goto :goto_9

    :sswitch_16
    const-string v2, "InvalidEmailRoleAccessPolicyException"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_27

    goto :goto_8

    :cond_27
    invoke-static {v0, v1, v3}, Ldd/a;->h(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidEmailRoleAccessPolicyException;

    move-result-object v0

    goto :goto_9

    :sswitch_17
    move-object/from16 v2, v18

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    goto :goto_8

    :cond_28
    invoke-static {v0, v1, v3}, Lse/c;->h(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/LimitExceededException;

    move-result-object v0

    goto :goto_9

    :cond_29
    :goto_8
    new-instance v0, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    iget-object v1, v4, Lye/c;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_9
    invoke-static {v0, v5, v4}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v0

    :catch_1
    move-exception v0

    new-instance v2, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    invoke-direct {v2, v0, v12}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object v0, v1, Lrf/l;->x:Lwf/a;

    const/4 v3, 0x0

    invoke-static {v2, v0, v3}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v2

    :cond_2a
    new-instance v0, Lq30/u0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lq30/u0;-><init>(I)V

    if-eqz v3, :cond_2d

    new-instance v1, Ljg/b;

    invoke-direct {v1, v3}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->j:Lhg/l;

    new-instance v4, Ljg/e;

    const-string v5, "CodeDeliveryDetails"

    invoke-direct {v4, v5}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x1

    new-array v5, v5, [Lhg/d;

    aput-object v4, v5, v7

    invoke-static {v5}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v3

    invoke-static {v3, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v3

    :goto_a
    invoke-interface {v3}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v4

    iget v5, v2, Lhg/i;->b:I

    if-nez v4, :cond_2b

    goto :goto_b

    :cond_2b
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_2c

    invoke-static {v1}, Lrs/b;->h(Ljg/b;)Lre/c0;

    move-result-object v4

    iput-object v4, v0, Lq30/u0;->x:Ljava/lang/Object;

    goto :goto_a

    :cond_2c
    :goto_b
    if-eqz v4, :cond_2d

    invoke-interface {v3}, Lhg/c;->skipValue()V

    goto :goto_a

    :cond_2d
    new-instance v1, Lre/k0;

    invoke-direct {v1, v0}, Lre/k0;-><init>(Lq30/u0;)V

    return-object v1

    :pswitch_a
    move-object/from16 v4, v18

    move-object/from16 v10, v19

    move-object/from16 v7, v20

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Lrf/l;->x:Lwf/a;

    iget-object v6, v5, Lwf/a;->a:Lmf/t;

    invoke-static {v6}, Lbi/g;->L(Lmf/t;)Z

    move-result v6

    if-nez v6, :cond_3b

    invoke-static {v5, v3}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v6

    invoke-static {v1, v6}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object v1

    :try_start_2
    sget-object v16, Lze/a;->a:Lhg/i;

    iget-object v5, v5, Lwf/a;->b:Lmf/h;

    invoke-static {v5, v3}, Lze/a;->a(Lmf/h;[B)Lye/c;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    iget-object v12, v5, Lye/c;->a:Ljava/lang/String;

    if-eqz v12, :cond_3a

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v16

    sparse-switch v16, :sswitch_data_2

    goto/16 :goto_c

    :sswitch_18
    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2e

    goto/16 :goto_c

    :cond_2e
    invoke-static {v0, v1, v3}, Lse/c;->k(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordResetRequiredException;

    move-result-object v0

    goto/16 :goto_d

    :sswitch_19
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2f

    goto/16 :goto_c

    :cond_2f
    invoke-static {v0, v1, v3}, Lse/c;->l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ResourceNotFoundException;

    move-result-object v0

    goto/16 :goto_d

    :sswitch_1a
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_30

    goto/16 :goto_c

    :cond_30
    invoke-static {v0, v1, v3}, Ldd/a;->j(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;

    move-result-object v0

    goto/16 :goto_d

    :sswitch_1b
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_31

    goto/16 :goto_c

    :cond_31
    invoke-static {v0, v1, v3}, Lse/c;->m(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/TooManyRequestsException;

    move-result-object v0

    goto/16 :goto_d

    :sswitch_1c
    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_32

    goto/16 :goto_c

    :cond_32
    invoke-static {v0, v1, v3}, Ldd/a;->g(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InternalErrorException;

    move-result-object v0

    goto/16 :goto_d

    :sswitch_1d
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_33

    goto :goto_c

    :cond_33
    invoke-static {v0, v1, v3}, Lse/c;->q(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotConfirmedException;

    move-result-object v0

    goto :goto_d

    :sswitch_1e
    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_34

    goto :goto_c

    :cond_34
    invoke-static {v0, v1, v3}, Lse/c;->r(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotFoundException;

    move-result-object v0

    goto :goto_d

    :sswitch_1f
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_35

    goto :goto_c

    :cond_35
    invoke-static {v0, v1, v3}, Ldd/a;->f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ForbiddenException;

    move-result-object v0

    goto :goto_d

    :sswitch_20
    const-string v2, "PasswordHistoryPolicyViolationException"

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_36

    goto :goto_c

    :cond_36
    invoke-static {v0, v1, v3}, Lse/c;->j(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordHistoryPolicyViolationException;

    move-result-object v0

    goto :goto_d

    :sswitch_21
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_37

    goto :goto_c

    :cond_37
    invoke-static {v0, v1, v3}, Lse/c;->i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/NotAuthorizedException;

    move-result-object v0

    goto :goto_d

    :sswitch_22
    const-string v2, "InvalidPasswordException"

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_38

    goto :goto_c

    :cond_38
    invoke-static {v0, v1, v3}, Ldd/a;->k(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidPasswordException;

    move-result-object v0

    goto :goto_d

    :sswitch_23
    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_39

    goto :goto_c

    :cond_39
    invoke-static {v0, v1, v3}, Lse/c;->h(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/LimitExceededException;

    move-result-object v0

    goto :goto_d

    :cond_3a
    :goto_c
    new-instance v0, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    iget-object v1, v5, Lye/c;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_d
    invoke-static {v0, v6, v5}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v0

    :catch_2
    move-exception v0

    new-instance v2, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;

    invoke-direct {v2, v0, v12}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object v0, v1, Lrf/l;->x:Lwf/a;

    const/4 v3, 0x0

    invoke-static {v2, v0, v3}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v2

    :cond_3b
    new-instance v0, Lre/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_b
    invoke-direct/range {p0 .. p3}, Ldd/b;->b(Ldg/a;Lrf/l;[B)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v1, Lrf/l;->x:Lwf/a;

    iget-object v9, v8, Lwf/a;->a:Lmf/t;

    invoke-static {v9}, Lbi/g;->L(Lmf/t;)Z

    move-result v9

    if-nez v9, :cond_4d

    invoke-static {v8, v3}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v9

    invoke-static {v1, v9}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object v1

    :try_start_3
    sget-object v12, Lze/a;->a:Lhg/i;

    iget-object v8, v8, Lwf/a;->b:Lmf/h;

    invoke-static {v8, v3}, Lze/a;->a(Lmf/h;[B)Lye/c;

    move-result-object v8
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    iget-object v12, v8, Lye/c;->a:Ljava/lang/String;

    if-eqz v12, :cond_4c

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v13

    sparse-switch v13, :sswitch_data_3

    goto/16 :goto_16

    :sswitch_24
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4c

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v3, :cond_3e

    new-instance v0, Ljg/b;

    invoke-direct {v0, v3}, Ljg/b;-><init>([B)V

    new-instance v1, Lhg/i;

    sget-object v2, Lhg/l;->i:Lhg/l;

    new-instance v3, Ljg/e;

    invoke-direct {v3, v4}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x1

    new-array v4, v4, [Lhg/d;

    aput-object v3, v4, v7

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v1, v2, v3, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v1}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v2

    invoke-static {v2, v0}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v0

    const/4 v5, 0x0

    :goto_e
    invoke-interface {v0}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v2

    iget v3, v1, Lhg/i;->b:I

    if-nez v2, :cond_3c

    goto :goto_f

    :cond_3c
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v3, :cond_3d

    invoke-interface {v0}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v5

    goto :goto_e

    :cond_3d
    :goto_f
    if-eqz v2, :cond_3f

    invoke-interface {v0}, Lhg/c;->skipValue()V

    goto :goto_e

    :cond_3e
    const/4 v5, 0x0

    :cond_3f
    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/internal/sso/model/ResourceNotFoundException;

    invoke-direct {v0, v5}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object v1, v0, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object v1, v1, Lte/c;->a:Lgf/c;

    sget-object v2, Lte/e;->g:Lgf/a;

    sget-object v3, Lte/f;->w:Lte/f;

    invoke-virtual {v1, v2, v3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    goto/16 :goto_17

    :sswitch_25
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4c

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v3, :cond_42

    new-instance v0, Ljg/b;

    invoke-direct {v0, v3}, Ljg/b;-><init>([B)V

    new-instance v1, Lhg/i;

    sget-object v2, Lhg/l;->i:Lhg/l;

    new-instance v3, Ljg/e;

    invoke-direct {v3, v4}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x1

    new-array v4, v4, [Lhg/d;

    aput-object v3, v4, v7

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v1, v2, v3, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v1}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v2

    invoke-static {v2, v0}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v0

    const/4 v5, 0x0

    :goto_10
    invoke-interface {v0}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v2

    iget v3, v1, Lhg/i;->b:I

    if-nez v2, :cond_40

    goto :goto_11

    :cond_40
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v3, :cond_41

    invoke-interface {v0}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v5

    goto :goto_10

    :cond_41
    :goto_11
    if-eqz v2, :cond_43

    invoke-interface {v0}, Lhg/c;->skipValue()V

    goto :goto_10

    :cond_42
    const/4 v5, 0x0

    :cond_43
    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/internal/sso/model/TooManyRequestsException;

    invoke-direct {v0, v5}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object v1, v0, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object v1, v1, Lte/c;->a:Lgf/c;

    sget-object v2, Lte/e;->g:Lgf/a;

    sget-object v3, Lte/f;->w:Lte/f;

    invoke-virtual {v1, v2, v3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    goto/16 :goto_17

    :sswitch_26
    const-string v2, "InvalidRequestException"

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4c

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v3, :cond_46

    new-instance v0, Ljg/b;

    invoke-direct {v0, v3}, Ljg/b;-><init>([B)V

    new-instance v1, Lhg/i;

    sget-object v2, Lhg/l;->i:Lhg/l;

    new-instance v3, Ljg/e;

    invoke-direct {v3, v4}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x1

    new-array v4, v4, [Lhg/d;

    aput-object v3, v4, v7

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v1, v2, v3, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v1}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v2

    invoke-static {v2, v0}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v0

    const/4 v5, 0x0

    :goto_12
    invoke-interface {v0}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v2

    iget v3, v1, Lhg/i;->b:I

    if-nez v2, :cond_44

    goto :goto_13

    :cond_44
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v3, :cond_45

    invoke-interface {v0}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v5

    goto :goto_12

    :cond_45
    :goto_13
    if-eqz v2, :cond_47

    invoke-interface {v0}, Lhg/c;->skipValue()V

    goto :goto_12

    :cond_46
    const/4 v5, 0x0

    :cond_47
    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/internal/sso/model/InvalidRequestException;

    invoke-direct {v0, v5}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object v1, v0, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object v1, v1, Lte/c;->a:Lgf/c;

    sget-object v2, Lte/e;->g:Lgf/a;

    sget-object v3, Lte/f;->w:Lte/f;

    invoke-virtual {v1, v2, v3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    goto :goto_17

    :sswitch_27
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4c

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v3, :cond_4a

    new-instance v0, Ljg/b;

    invoke-direct {v0, v3}, Ljg/b;-><init>([B)V

    new-instance v1, Lhg/i;

    sget-object v2, Lhg/l;->i:Lhg/l;

    new-instance v3, Ljg/e;

    invoke-direct {v3, v4}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x1

    new-array v4, v4, [Lhg/d;

    aput-object v3, v4, v7

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v1, v2, v3, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v1}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v2

    invoke-static {v2, v0}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v0

    const/4 v5, 0x0

    :goto_14
    invoke-interface {v0}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v2

    iget v3, v1, Lhg/i;->b:I

    if-nez v2, :cond_48

    goto :goto_15

    :cond_48
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v3, :cond_49

    invoke-interface {v0}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v5

    goto :goto_14

    :cond_49
    :goto_15
    if-eqz v2, :cond_4b

    invoke-interface {v0}, Lhg/c;->skipValue()V

    goto :goto_14

    :cond_4a
    const/4 v5, 0x0

    :cond_4b
    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/internal/sso/model/UnauthorizedException;

    invoke-direct {v0, v5}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object v1, v0, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object v1, v1, Lte/c;->a:Lgf/c;

    sget-object v2, Lte/e;->g:Lgf/a;

    sget-object v3, Lte/f;->w:Lte/f;

    invoke-virtual {v1, v2, v3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    goto :goto_17

    :cond_4c
    :goto_16
    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/internal/sso/model/SsoException;

    iget-object v1, v8, Lye/c;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_17
    invoke-static {v0, v9, v8}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v0

    :catch_3
    move-exception v0

    new-instance v2, Laws/sdk/kotlin/runtime/auth/credentials/internal/sso/model/SsoException;

    const-string v3, "Failed to parse response as \'restJson1\' error"

    invoke-direct {v2, v0, v3}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object v0, v1, Lrf/l;->x:Lwf/a;

    const/4 v3, 0x0

    invoke-static {v2, v0, v3}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v2

    :cond_4d
    new-instance v0, Lhm/d;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lhm/d;-><init>(I)V

    if-eqz v3, :cond_59

    new-instance v1, Ljg/b;

    invoke-direct {v1, v3}, Ljg/b;-><init>([B)V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->j:Lhg/l;

    new-instance v4, Ljg/e;

    const-string v5, "roleCredentials"

    invoke-direct {v4, v5}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x1

    new-array v6, v5, [Lhg/d;

    aput-object v4, v6, v7

    invoke-static {v6}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v3

    invoke-static {v3, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v3

    :goto_18
    invoke-interface {v3}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v4

    iget v5, v2, Lhg/i;->b:I

    if-nez v4, :cond_4e

    goto/16 :goto_1e

    :cond_4e
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_58

    new-instance v4, Lgf/o;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lhg/i;

    sget-object v6, Lhg/l;->i:Lhg/l;

    new-instance v8, Ljg/e;

    const-string v9, "accessKeyId"

    invoke-direct {v8, v9}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x1

    new-array v10, v9, [Lhg/d;

    aput-object v8, v10, v7

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v5, v6, v8, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    sget-object v10, Lhg/l;->g:Lhg/l;

    new-instance v11, Ljg/e;

    const-string v12, "expiration"

    invoke-direct {v11, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v12, v9, [Lhg/d;

    aput-object v11, v12, v7

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v8, v10, v11, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v10, Lhg/i;

    new-instance v11, Ljg/e;

    const-string v12, "secretAccessKey"

    invoke-direct {v11, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v12, v9, [Lhg/d;

    aput-object v11, v12, v7

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v10, v6, v11, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v11, Lhg/i;

    new-instance v12, Ljg/e;

    const-string v13, "sessionToken"

    invoke-direct {v12, v13}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v13, v9, [Lhg/d;

    aput-object v12, v13, v7

    invoke-static {v13}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-direct {v11, v6, v9, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v6, Lxl/a;

    const/16 v9, 0xd

    invoke-direct {v6, v9}, Lxl/a;-><init>(I)V

    invoke-virtual {v6, v5}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v8}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v10}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v11}, Lxl/a;->p(Lhg/i;)V

    invoke-static {v6, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v6

    :goto_19
    invoke-interface {v6}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v9

    iget v12, v5, Lhg/i;->b:I

    if-nez v9, :cond_4f

    goto :goto_1a

    :cond_4f
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-ne v13, v12, :cond_50

    invoke-interface {v6}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v9

    iput-object v9, v4, Lgf/o;->b:Ljava/io/Serializable;

    goto :goto_19

    :cond_50
    :goto_1a
    iget v12, v8, Lhg/i;->b:I

    if-nez v9, :cond_51

    goto :goto_1b

    :cond_51
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-ne v13, v12, :cond_52

    invoke-interface {v6}, Lhg/g;->v()J

    move-result-wide v12

    iput-wide v12, v4, Lgf/o;->a:J

    goto :goto_19

    :cond_52
    :goto_1b
    iget v12, v10, Lhg/i;->b:I

    if-nez v9, :cond_53

    goto :goto_1c

    :cond_53
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-ne v13, v12, :cond_54

    invoke-interface {v6}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v9

    iput-object v9, v4, Lgf/o;->c:Ljava/lang/Object;

    goto :goto_19

    :cond_54
    :goto_1c
    iget v12, v11, Lhg/i;->b:I

    if-nez v9, :cond_55

    goto :goto_1d

    :cond_55
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-ne v13, v12, :cond_56

    invoke-interface {v6}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v9

    iput-object v9, v4, Lgf/o;->d:Ljava/lang/Comparable;

    goto :goto_19

    :cond_56
    :goto_1d
    if-eqz v9, :cond_57

    invoke-interface {v6}, Lhg/c;->skipValue()V

    goto :goto_19

    :cond_57
    new-instance v5, Lid/c;

    invoke-direct {v5, v4}, Lid/c;-><init>(Lgf/o;)V

    iput-object v5, v0, Lhm/d;->x:Ljava/lang/Object;

    goto/16 :goto_18

    :cond_58
    :goto_1e
    if-eqz v4, :cond_59

    invoke-interface {v3}, Lhg/c;->skipValue()V

    goto/16 :goto_18

    :cond_59
    new-instance v1, Lid/b;

    invoke-direct {v1, v0}, Lid/b;-><init>(Lhm/d;)V

    return-object v1

    :pswitch_d
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lrf/l;->x:Lwf/a;

    iget-object v8, v2, Lwf/a;->a:Lmf/t;

    invoke-static {v8}, Lbi/g;->L(Lmf/t;)Z

    move-result v8

    const-string v9, ""

    if-nez v8, :cond_77

    invoke-static {v2, v3}, Lsb3/a;->v(Lwf/a;[B)Lwf/a;

    move-result-object v8

    invoke-static {v1, v8}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object v1

    :try_start_4
    sget-object v10, Lze/a;->a:Lhg/i;

    iget-object v2, v2, Lwf/a;->b:Lmf/h;

    invoke-static {v2, v3}, Lze/a;->a(Lmf/h;[B)Lye/c;

    move-result-object v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    iget-object v10, v2, Lye/c;->a:Ljava/lang/String;

    if-eqz v10, :cond_76

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v11

    const-string v12, "no value provided"

    const-string v13, "error"

    sparse-switch v11, :sswitch_data_4

    goto/16 :goto_2b

    :sswitch_28
    const-string v11, "ValidationException"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_76

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqg3/d;

    const/4 v1, 0x6

    invoke-direct {v0, v1, v7}, Lqg3/d;-><init>(IC)V

    if-eqz v3, :cond_5e

    new-instance v1, Ljg/b;

    invoke-direct {v1, v3}, Ljg/b;-><init>([B)V

    new-instance v3, Lhg/i;

    sget-object v5, Lhg/l;->d:Lhg/l;

    new-instance v6, Ljg/e;

    invoke-direct {v6, v13}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v10, 0x1

    new-array v11, v10, [Lhg/d;

    aput-object v6, v11, v7

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v3, v5, v6, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    sget-object v6, Lhg/l;->i:Lhg/l;

    new-instance v11, Ljg/e;

    invoke-direct {v11, v4}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v4, v10, [Lhg/d;

    aput-object v11, v4, v7

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v5, v6, v4, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v3, v5}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v4

    invoke-static {v4, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_1f
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v4

    iget v6, v3, Lhg/i;->b:I

    if-nez v4, :cond_5a

    goto :goto_20

    :cond_5a
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_5b

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v4

    sget v6, Lcd/n;->a:I

    invoke-static {v4}, Lvp/c;->H(Ljava/lang/String;)Lcd/n;

    move-result-object v4

    iput-object v4, v0, Lqg3/d;->x:Ljava/lang/Object;

    goto :goto_1f

    :cond_5b
    :goto_20
    iget v6, v5, Lhg/i;->b:I

    if-nez v4, :cond_5c

    goto :goto_21

    :cond_5c
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_5d

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Lqg3/d;->y:Ljava/lang/Object;

    goto :goto_1f

    :cond_5d
    :goto_21
    if-eqz v4, :cond_5e

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_1f

    :cond_5e
    iget-object v1, v0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v1, Lcd/n;

    if-nez v1, :cond_5f

    new-instance v1, Lcd/j;

    invoke-direct {v1, v12}, Lcd/j;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lqg3/d;->x:Ljava/lang/Object;

    :cond_5f
    iget-object v1, v0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_60

    iput-object v9, v0, Lqg3/d;->y:Ljava/lang/Object;

    :cond_60
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/ValidationException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/ValidationException;-><init>(Lqg3/d;)V

    goto/16 :goto_2c

    :sswitch_29
    const-string v11, "TooManyRequestsError"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_76

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    const/4 v1, 0x7

    invoke-direct {v0, v1, v7}, Lio/sentry/internal/debugmeta/c;-><init>(IC)V

    if-eqz v3, :cond_65

    new-instance v1, Ljg/b;

    invoke-direct {v1, v3}, Ljg/b;-><init>([B)V

    new-instance v3, Lhg/i;

    sget-object v5, Lhg/l;->d:Lhg/l;

    new-instance v6, Ljg/e;

    invoke-direct {v6, v13}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v10, 0x1

    new-array v11, v10, [Lhg/d;

    aput-object v6, v11, v7

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v3, v5, v6, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    sget-object v6, Lhg/l;->i:Lhg/l;

    new-instance v11, Ljg/e;

    invoke-direct {v11, v4}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v4, v10, [Lhg/d;

    aput-object v11, v4, v7

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v5, v6, v4, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v3, v5}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v4

    invoke-static {v4, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_22
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v4

    iget v6, v3, Lhg/i;->b:I

    if-nez v4, :cond_61

    goto :goto_23

    :cond_61
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_62

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v4

    sget v6, Lcd/n;->a:I

    invoke-static {v4}, Lvp/c;->H(Ljava/lang/String;)Lcd/n;

    move-result-object v4

    iput-object v4, v0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    goto :goto_22

    :cond_62
    :goto_23
    iget v6, v5, Lhg/i;->b:I

    if-nez v4, :cond_63

    goto :goto_24

    :cond_63
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_64

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    goto :goto_22

    :cond_64
    :goto_24
    if-eqz v4, :cond_65

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_22

    :cond_65
    iget-object v1, v0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v1, Lcd/n;

    if-nez v1, :cond_66

    new-instance v1, Lcd/j;

    invoke-direct {v1, v12}, Lcd/j;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    :cond_66
    iget-object v1, v0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_67

    iput-object v9, v0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    :cond_67
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/TooManyRequestsError;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/TooManyRequestsError;-><init>(Lio/sentry/internal/debugmeta/c;)V

    goto/16 :goto_2c

    :sswitch_2a
    const-string v11, "InternalServerException"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_76

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ld1/j;

    const/4 v1, 0x7

    invoke-direct {v0, v1, v7}, Ld1/j;-><init>(IZ)V

    if-eqz v3, :cond_6c

    new-instance v1, Ljg/b;

    invoke-direct {v1, v3}, Ljg/b;-><init>([B)V

    new-instance v3, Lhg/i;

    sget-object v5, Lhg/l;->d:Lhg/l;

    new-instance v6, Ljg/e;

    invoke-direct {v6, v13}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v10, 0x1

    new-array v11, v10, [Lhg/d;

    aput-object v6, v11, v7

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v3, v5, v6, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    sget-object v6, Lhg/l;->i:Lhg/l;

    new-instance v11, Ljg/e;

    invoke-direct {v11, v4}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v4, v10, [Lhg/d;

    aput-object v11, v4, v7

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v5, v6, v4, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v3, v5}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v4

    invoke-static {v4, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_25
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v4

    iget v6, v3, Lhg/i;->b:I

    if-nez v4, :cond_68

    goto :goto_26

    :cond_68
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_69

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v4

    sget v6, Lcd/n;->a:I

    invoke-static {v4}, Lvp/c;->H(Ljava/lang/String;)Lcd/n;

    move-result-object v4

    iput-object v4, v0, Ld1/j;->x:Ljava/lang/Object;

    goto :goto_25

    :cond_69
    :goto_26
    iget v6, v5, Lhg/i;->b:I

    if-nez v4, :cond_6a

    goto :goto_27

    :cond_6a
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_6b

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Ld1/j;->y:Ljava/lang/Object;

    goto :goto_25

    :cond_6b
    :goto_27
    if-eqz v4, :cond_6c

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_25

    :cond_6c
    iget-object v1, v0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Lcd/n;

    if-nez v1, :cond_6d

    new-instance v1, Lcd/j;

    invoke-direct {v1, v12}, Lcd/j;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Ld1/j;->x:Ljava/lang/Object;

    :cond_6d
    iget-object v1, v0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_6e

    iput-object v9, v0, Ld1/j;->y:Ljava/lang/Object;

    :cond_6e
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/InternalServerException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/InternalServerException;-><init>(Ld1/j;)V

    goto/16 :goto_2c

    :sswitch_2b
    const-string v11, "AccessDeniedException"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_76

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxl/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1, v7}, Lxl/a;-><init>(IZ)V

    if-eqz v3, :cond_73

    new-instance v1, Ljg/b;

    invoke-direct {v1, v3}, Ljg/b;-><init>([B)V

    new-instance v3, Lhg/i;

    sget-object v5, Lhg/l;->d:Lhg/l;

    new-instance v6, Ljg/e;

    invoke-direct {v6, v13}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v10, 0x1

    new-array v11, v10, [Lhg/d;

    aput-object v6, v11, v7

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v3, v5, v6, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    sget-object v6, Lhg/l;->i:Lhg/l;

    new-instance v11, Ljg/e;

    invoke-direct {v11, v4}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v4, v10, [Lhg/d;

    aput-object v11, v4, v7

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v5, v6, v4, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v3, v5}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v4

    invoke-static {v4, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v1

    :goto_28
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v4

    iget v6, v3, Lhg/i;->b:I

    if-nez v4, :cond_6f

    goto :goto_29

    :cond_6f
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_70

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v4

    sget v6, Lcd/n;->a:I

    invoke-static {v4}, Lvp/c;->H(Ljava/lang/String;)Lcd/n;

    move-result-object v4

    iput-object v4, v0, Lxl/a;->x:Ljava/lang/Object;

    goto :goto_28

    :cond_70
    :goto_29
    iget v6, v5, Lhg/i;->b:I

    if-nez v4, :cond_71

    goto :goto_2a

    :cond_71
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_72

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Lxl/a;->y:Ljava/lang/Object;

    goto :goto_28

    :cond_72
    :goto_2a
    if-eqz v4, :cond_73

    invoke-interface {v1}, Lhg/c;->skipValue()V

    goto :goto_28

    :cond_73
    iget-object v1, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v1, Lcd/n;

    if-nez v1, :cond_74

    new-instance v1, Lcd/j;

    invoke-direct {v1, v12}, Lcd/j;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lxl/a;->x:Ljava/lang/Object;

    :cond_74
    iget-object v1, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_75

    iput-object v9, v0, Lxl/a;->y:Ljava/lang/Object;

    :cond_75
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;-><init>(Lxl/a;)V

    goto :goto_2c

    :cond_76
    :goto_2b
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/SigninException;

    iget-object v0, v2, Lye/c;->b:Ljava/lang/String;

    invoke-direct {v1, v0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    :goto_2c
    invoke-static {v1, v8, v2}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v1

    :catch_4
    move-exception v0

    new-instance v2, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/SigninException;

    const-string v3, "Failed to parse response as \'restJson1\' error"

    invoke-direct {v2, v0, v3}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object v0, v1, Lrf/l;->x:Lwf/a;

    const/4 v3, 0x0

    invoke-static {v2, v0, v3}, Ls93/k;->h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V

    throw v2

    :cond_77
    new-instance v0, Lro/i;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lro/i;-><init>(I)V

    if-eqz v3, :cond_90

    new-instance v1, Ljg/b;

    invoke-direct {v1, v3}, Ljg/b;-><init>([B)V

    new-instance v2, Lb30/m;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lb30/m;-><init>(I)V

    new-instance v3, Lhg/i;

    sget-object v4, Lhg/l;->j:Lhg/l;

    new-instance v5, Ljg/e;

    const-string v6, "accessToken"

    invoke-direct {v5, v6}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v10, 0x1

    new-array v6, v10, [Lhg/d;

    aput-object v5, v6, v7

    invoke-static {v6}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v3, v4, v5, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    sget-object v5, Lhg/l;->e:Lhg/l;

    new-instance v6, Ljg/e;

    const-string v8, "expiresIn"

    invoke-direct {v6, v8}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v10, [Lhg/d;

    aput-object v6, v8, v7

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v4, v5, v6, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    sget-object v6, Lhg/l;->i:Lhg/l;

    new-instance v8, Ljg/e;

    const-string v11, "idToken"

    invoke-direct {v8, v11}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v11, v10, [Lhg/d;

    aput-object v8, v11, v7

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v5, v6, v8, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    new-instance v11, Ljg/e;

    const-string v12, "refreshToken"

    invoke-direct {v11, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v12, v10, [Lhg/d;

    aput-object v11, v12, v7

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v8, v6, v11, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v11, Lhg/i;

    new-instance v12, Ljg/e;

    const-string v13, "tokenType"

    invoke-direct {v12, v13}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v13, v10, [Lhg/d;

    aput-object v12, v13, v7

    invoke-static {v13}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-direct {v11, v6, v10, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v10, Lxl/a;

    const/16 v12, 0xd

    invoke-direct {v10, v12}, Lxl/a;-><init>(I)V

    invoke-virtual {v10, v3}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v10, v4}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v10, v5}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v10, v8}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v10, v11}, Lxl/a;->p(Lhg/i;)V

    invoke-static {v10, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v10

    :goto_2d
    invoke-interface {v10}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v12

    iget v13, v3, Lhg/i;->b:I

    if-nez v12, :cond_79

    :cond_78
    move-object/from16 p1, v3

    move-object/from16 p2, v10

    goto/16 :goto_34

    :cond_79
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-ne v14, v13, :cond_78

    new-instance v12, Lcd/a;

    invoke-direct {v12, v7}, Lcd/a;-><init>(I)V

    new-instance v13, Lhg/i;

    new-instance v14, Ljg/e;

    const-string v15, "accessKeyId"

    invoke-direct {v14, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    move/from16 v17, v7

    const/4 v15, 0x1

    new-array v7, v15, [Lhg/d;

    aput-object v14, v7, v17

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    move/from16 v14, v17

    invoke-direct {v13, v6, v7, v14}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v7, Lhg/i;

    new-instance v14, Ljg/e;

    move-object/from16 p1, v3

    const-string v3, "secretAccessKey"

    invoke-direct {v14, v3}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v3, v15, [Lhg/d;

    aput-object v14, v3, v17

    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    move/from16 v14, v17

    invoke-direct {v7, v6, v3, v14}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v3, Lhg/i;

    new-instance v14, Ljg/e;

    move-object/from16 p2, v10

    const-string v10, "sessionToken"

    invoke-direct {v14, v10}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v10, v15, [Lhg/d;

    aput-object v14, v10, v17

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    move/from16 v14, v17

    invoke-direct {v3, v6, v10, v14}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v10, Lxl/a;

    const/16 v14, 0xd

    invoke-direct {v10, v14}, Lxl/a;-><init>(I)V

    invoke-virtual {v10, v13}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v10, v7}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v10, v3}, Lxl/a;->p(Lhg/i;)V

    invoke-static {v10, v1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v10

    :goto_2e
    invoke-interface {v10}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v16

    iget v14, v13, Lhg/i;->b:I

    if-nez v16, :cond_7a

    goto :goto_30

    :cond_7a
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-ne v15, v14, :cond_7b

    invoke-interface {v10}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v14

    iput-object v14, v12, Lcd/a;->b:Ljava/lang/String;

    :goto_2f
    const/16 v14, 0xd

    const/4 v15, 0x1

    goto :goto_2e

    :cond_7b
    :goto_30
    iget v14, v7, Lhg/i;->b:I

    if-nez v16, :cond_7c

    goto :goto_31

    :cond_7c
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-ne v15, v14, :cond_7d

    invoke-interface {v10}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v14

    iput-object v14, v12, Lcd/a;->c:Ljava/lang/String;

    goto :goto_2f

    :cond_7d
    :goto_31
    iget v14, v3, Lhg/i;->b:I

    if-nez v16, :cond_7e

    goto :goto_32

    :cond_7e
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-ne v15, v14, :cond_7f

    invoke-interface {v10}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v14

    iput-object v14, v12, Lcd/a;->d:Ljava/lang/String;

    goto :goto_2f

    :cond_7f
    :goto_32
    if-eqz v16, :cond_80

    invoke-interface {v10}, Lhg/c;->skipValue()V

    goto :goto_2f

    :cond_80
    iget-object v3, v12, Lcd/a;->b:Ljava/lang/String;

    if-nez v3, :cond_81

    iput-object v9, v12, Lcd/a;->b:Ljava/lang/String;

    :cond_81
    iget-object v3, v12, Lcd/a;->c:Ljava/lang/String;

    if-nez v3, :cond_82

    iput-object v9, v12, Lcd/a;->c:Ljava/lang/String;

    :cond_82
    iget-object v3, v12, Lcd/a;->d:Ljava/lang/String;

    if-nez v3, :cond_83

    iput-object v9, v12, Lcd/a;->d:Ljava/lang/String;

    :cond_83
    new-instance v3, Lcd/b;

    invoke-direct {v3, v12}, Lcd/b;-><init>(Lcd/a;)V

    iput-object v3, v2, Lb30/m;->x:Ljava/lang/Object;

    :goto_33
    move-object/from16 v3, p1

    move-object/from16 v10, p2

    const/4 v7, 0x0

    goto/16 :goto_2d

    :goto_34
    iget v3, v4, Lhg/i;->b:I

    if-nez v12, :cond_84

    goto :goto_35

    :cond_84
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v3, :cond_85

    invoke-interface/range {p2 .. p2}, Lhg/g;->h()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lb30/m;->y:Ljava/lang/Object;

    goto :goto_33

    :cond_85
    :goto_35
    iget v3, v5, Lhg/i;->b:I

    if-nez v12, :cond_86

    goto :goto_36

    :cond_86
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v3, :cond_87

    invoke-interface/range {p2 .. p2}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lb30/m;->z:Ljava/lang/Object;

    goto :goto_33

    :cond_87
    :goto_36
    iget v3, v8, Lhg/i;->b:I

    if-nez v12, :cond_88

    goto :goto_37

    :cond_88
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v3, :cond_89

    invoke-interface/range {p2 .. p2}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lb30/m;->E:Ljava/lang/Object;

    goto :goto_33

    :cond_89
    :goto_37
    iget v3, v11, Lhg/i;->b:I

    if-nez v12, :cond_8a

    goto :goto_38

    :cond_8a
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v3, :cond_8b

    invoke-interface/range {p2 .. p2}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lb30/m;->F:Ljava/lang/Object;

    goto :goto_33

    :cond_8b
    :goto_38
    if-eqz v12, :cond_8c

    invoke-interface/range {p2 .. p2}, Lhg/c;->skipValue()V

    goto :goto_33

    :cond_8c
    iget-object v1, v2, Lb30/m;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_8d

    const/16 v17, 0x0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v2, Lb30/m;->y:Ljava/lang/Object;

    :cond_8d
    iget-object v1, v2, Lb30/m;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_8e

    iput-object v9, v2, Lb30/m;->E:Ljava/lang/Object;

    :cond_8e
    iget-object v1, v2, Lb30/m;->F:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_8f

    iput-object v9, v2, Lb30/m;->F:Ljava/lang/Object;

    :cond_8f
    new-instance v1, Lcd/f;

    invoke-direct {v1, v2}, Lcd/f;-><init>(Lb30/m;)V

    iput-object v1, v0, Lro/i;->x:Ljava/lang/Object;

    :cond_90
    new-instance v1, Lcd/e;

    invoke-direct {v1, v0}, Lcd/e;-><init>(Lro/i;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x513c4665 -> :sswitch_6
        -0x223ae04f -> :sswitch_5
        -0x176b878a -> :sswitch_4
        0x1e0f1764 -> :sswitch_3
        0x528a7f78 -> :sswitch_2
        0x63cc68dd -> :sswitch_1
        0x7d02499d -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x6c64c81f -> :sswitch_17
        -0x654a7a22 -> :sswitch_16
        -0x5475acbf -> :sswitch_15
        -0x3bc9abd0 -> :sswitch_14
        -0x315aeb7f -> :sswitch_13
        -0x27dc44c9 -> :sswitch_12
        -0x176b878a -> :sswitch_11
        -0x148a780b -> :sswitch_10
        -0x199df48 -> :sswitch_f
        0x1e0f1764 -> :sswitch_e
        0x35f586e4 -> :sswitch_d
        0x3c9c0b97 -> :sswitch_c
        0x528a7f78 -> :sswitch_b
        0x63cc68dd -> :sswitch_a
        0x6c8eee12 -> :sswitch_9
        0x737c2e7c -> :sswitch_8
        0x740b0126 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x6c64c81f -> :sswitch_23
        -0x5dbb4d23 -> :sswitch_22
        -0x5475acbf -> :sswitch_21
        -0x1c00f00b -> :sswitch_20
        -0x176b878a -> :sswitch_1f
        -0x148a780b -> :sswitch_1e
        -0x199df48 -> :sswitch_1d
        0x1e0f1764 -> :sswitch_1c
        0x528a7f78 -> :sswitch_1b
        0x63cc68dd -> :sswitch_1a
        0x6c8eee12 -> :sswitch_19
        0x737c2e7c -> :sswitch_18
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        -0x513c4665 -> :sswitch_27
        0x446dae77 -> :sswitch_26
        0x528a7f78 -> :sswitch_25
        0x6c8eee12 -> :sswitch_24
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x752b0d0 -> :sswitch_2b
        0x2bc913af -> :sswitch_2a
        0x39ff7db1 -> :sswitch_29
        0x5f75e7b6 -> :sswitch_28
    .end sparse-switch
.end method
