.class public final Lhy/f;
.super Lhy/h;
.source "SourceFile"


# instance fields
.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ly00/q1;

.field public final h:Z

.field public final i:Z

.field public final j:Lhy/d;

.field public final k:Lhy/e;

.field public final l:Z

.field public final m:Ljava/lang/String;

.field public final n:Z

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ly00/q1;ZZLhy/d;Lhy/e;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p11

    move-object/from16 v8, p12

    const-string v9, "arbId"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "experiment"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "providedDefaultValues"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "elementsSessionId"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mobileSessionId"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Ll83/k;

    const-string v9, "integration_type"

    const-string v11, "mpe_android"

    invoke-direct {v10, v9, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p4 .. p4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v9

    new-instance v11, Ll83/k;

    const-string v12, "is_returning_link_user"

    invoke-direct {v11, v12, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v9, v5, Lhy/e;->a:Z

    const-string v12, "email"

    const/4 v13, 0x0

    if-eqz v9, :cond_0

    move-object v9, v12

    goto :goto_0

    :cond_0
    move-object v9, v13

    :goto_0
    iget-boolean v14, v5, Lhy/e;->b:Z

    if-eqz v14, :cond_1

    const-string v14, "name"

    goto :goto_1

    :cond_1
    move-object v14, v13

    :goto_1
    iget-boolean v15, v5, Lhy/e;->c:Z

    if-eqz v15, :cond_2

    const-string v15, "phone"

    goto :goto_2

    :cond_2
    move-object v15, v13

    :goto_2
    filled-new-array {v9, v14, v15}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/16 v18, 0x0

    const/16 v19, 0x3e

    const-string v15, " "

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v9

    move-object v14, v12

    new-instance v12, Ll83/k;

    const-string v15, "dvs_provided"

    invoke-direct {v12, v15, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p5 .. p5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v9

    move-object v15, v13

    new-instance v13, Ll83/k;

    const-string v15, "use_link_native"

    invoke-direct {v13, v15, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    const/4 v14, 0x0

    :goto_3
    new-instance v9, Ll83/k;

    const-string v15, "recognition_type"

    invoke-direct {v9, v15, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p8 .. p8}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ll83/k;

    move-object/from16 v16, v9

    const-string v9, "has_spms"

    invoke-direct {v15, v9, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Ll83/k;

    const-string v14, "integration_shape"

    invoke-direct {v9, v14, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p10 .. p10}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v17, v9

    new-instance v9, Ll83/k;

    move-object/from16 v18, v10

    const-string v10, "link_displayed"

    invoke-direct {v9, v10, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Ll83/k;

    const-string v14, "mobile_sdk_version"

    move-object/from16 v19, v9

    const-string v9, "22.6.1"

    invoke-direct {v10, v14, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Ll83/k;

    move-object/from16 v20, v10

    const-string v10, "elements_session_id"

    invoke-direct {v14, v10, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Ll83/k;

    move-object/from16 v21, v11

    const-string v11, "mobile_session_id"

    invoke-direct {v10, v11, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v11, v20

    move-object/from16 v20, v10

    move-object/from16 v10, v18

    move-object/from16 v18, v11

    move-object/from16 v11, v19

    move-object/from16 v19, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v11

    move-object/from16 v11, v21

    filled-new-array/range {v10 .. v20}, [Ll83/k;

    move-result-object v10

    invoke-static {v10}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v10

    invoke-static {v10}, Lcom/squareup/wire/n;->y(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v10

    invoke-direct {v0, v3, v1, v2, v10}, Lhy/h;-><init>(Ly00/q1;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    iput-object v1, v0, Lhy/f;->e:Ljava/lang/String;

    iput-object v2, v0, Lhy/f;->f:Ljava/lang/String;

    iput-object v3, v0, Lhy/f;->g:Ly00/q1;

    move/from16 v1, p4

    iput-boolean v1, v0, Lhy/f;->h:Z

    move/from16 v1, p5

    iput-boolean v1, v0, Lhy/f;->i:Z

    iput-object v4, v0, Lhy/f;->j:Lhy/d;

    iput-object v5, v0, Lhy/f;->k:Lhy/e;

    move/from16 v1, p8

    iput-boolean v1, v0, Lhy/f;->l:Z

    iput-object v6, v0, Lhy/f;->m:Ljava/lang/String;

    move/from16 v1, p10

    iput-boolean v1, v0, Lhy/f;->n:Z

    iput-object v7, v0, Lhy/f;->o:Ljava/lang/String;

    iput-object v9, v0, Lhy/f;->p:Ljava/lang/String;

    iput-object v8, v0, Lhy/f;->q:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhy/f;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ly00/q1;
    .locals 1

    iget-object v0, p0, Lhy/f;->g:Ly00/q1;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhy/f;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lhy/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lhy/f;

    iget-object v1, p0, Lhy/f;->e:Ljava/lang/String;

    iget-object v3, p1, Lhy/f;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lhy/f;->f:Ljava/lang/String;

    iget-object v3, p1, Lhy/f;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lhy/f;->g:Ly00/q1;

    iget-object v3, p1, Lhy/f;->g:Ly00/q1;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lhy/f;->h:Z

    iget-boolean v3, p1, Lhy/f;->h:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lhy/f;->i:Z

    iget-boolean v3, p1, Lhy/f;->i:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lhy/f;->j:Lhy/d;

    iget-object v3, p1, Lhy/f;->j:Lhy/d;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lhy/f;->k:Lhy/e;

    iget-object v3, p1, Lhy/f;->k:Lhy/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lhy/f;->l:Z

    iget-boolean v3, p1, Lhy/f;->l:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lhy/f;->m:Ljava/lang/String;

    iget-object v3, p1, Lhy/f;->m:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lhy/f;->n:Z

    iget-boolean v3, p1, Lhy/f;->n:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lhy/f;->o:Ljava/lang/String;

    iget-object v3, p1, Lhy/f;->o:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lhy/f;->p:Ljava/lang/String;

    iget-object v3, p1, Lhy/f;->p:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lhy/f;->q:Ljava/lang/String;

    iget-object p1, p1, Lhy/f;->q:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lhy/f;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lhy/f;->f:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lhy/f;->g:Ly00/q1;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lhy/f;->h:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lhy/f;->i:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lhy/f;->j:Lhy/d;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lhy/f;->k:Lhy/e;

    invoke-virtual {v2}, Lhy/e;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lhy/f;->l:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lhy/f;->m:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lhy/f;->n:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lhy/f;->o:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lhy/f;->p:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lhy/f;->q:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", group="

    const-string v1, ", experiment="

    const-string v2, "LinkHoldback(arbId="

    iget-object v3, p0, Lhy/f;->e:Ljava/lang/String;

    iget-object v4, p0, Lhy/f;->f:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lhy/f;->g:Ly00/q1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isReturningLinkUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lhy/f;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", useLinkNative="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lhy/f;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", emailRecognitionSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhy/f;->j:Lhy/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", providedDefaultValues="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhy/f;->k:Lhy/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", spmEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lhy/f;->l:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", integrationShape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linkDisplayed="

    const-string v2, ", elementsSessionId="

    iget-object v3, p0, Lhy/f;->m:Ljava/lang/String;

    iget-boolean v4, p0, Lhy/f;->n:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", mobileSdkVersion="

    const-string v2, ", mobileSessionId="

    iget-object v3, p0, Lhy/f;->o:Ljava/lang/String;

    iget-object v4, p0, Lhy/f;->p:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    iget-object v2, p0, Lhy/f;->q:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
