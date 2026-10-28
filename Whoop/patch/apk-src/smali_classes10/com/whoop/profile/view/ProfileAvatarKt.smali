.class public final Lcom/whoop/profile/view/ProfileAvatarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a-\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u000f\u0010\t\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lkd1/o;",
        "avatarImageSource",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "contentDescription",
        "Ll83/a0;",
        "ProfileAvatar",
        "(Lkd1/o;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V",
        "ProfileAvatarWithImagePreview",
        "(Landroidx/compose/runtime/Composer;I)V",
        "profile_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final ProfileAvatar(Lkd1/o;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v6, p4

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v1, -0x2a317284

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v6, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_2

    and-int/lit8 v1, v6, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v6

    goto :goto_2

    :cond_2
    move v1, v6

    :goto_2
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v1, v1, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_3

    :cond_5
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v1, v5

    :goto_4
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_8

    and-int/lit8 v5, p5, 0x4

    if-nez v5, :cond_6

    move-object/from16 v5, p2

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_5

    :cond_6
    move-object/from16 v5, p2

    :cond_7
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v1, v7

    goto :goto_6

    :cond_8
    move-object/from16 v5, p2

    :goto_6
    and-int/lit16 v7, v1, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_9

    move v7, v10

    goto :goto_7

    :cond_9
    move v7, v9

    :goto_7
    and-int/lit8 v8, v1, 0x1

    invoke-virtual {v14, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-virtual {v14}, Lp1/q;->Z()V

    and-int/lit8 v7, v6, 0x1

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_c

    invoke-virtual {v14}, Lp1/q;->C()Z

    move-result v7

    if-eqz v7, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v14}, Lp1/q;->X()V

    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_b

    and-int/lit16 v1, v1, -0x381

    :cond_b
    move v12, v1

    move-object v7, v4

    move-object v11, v5

    goto :goto_9

    :cond_c
    :goto_8
    if-eqz v3, :cond_d

    move-object v4, v8

    :cond_d
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_b

    sget v3, Lcom/whoop/profile/R$string;->profile_picture_content_description:I

    invoke-static {v14, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    and-int/lit16 v1, v1, -0x381

    move v12, v1

    move-object v11, v3

    move-object v7, v4

    :goto_9
    invoke-virtual {v14}, Lp1/q;->r()V

    const/16 v1, 0x19

    int-to-float v1, v1

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->E:Lb2/m;

    invoke-static {v2, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v14, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v14, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v13, v14, Lp1/q;->S:Z

    if-eqz v13, :cond_e

    invoke-virtual {v14, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_a
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v14, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v14, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-nez v4, :cond_f

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    :cond_f
    invoke-static {v3, v14, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v14, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v0, :cond_11

    const v1, -0x3352b89

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    sget v1, Lkd1/o;->a:I

    and-int/lit8 v2, v12, 0xe

    or-int v4, v1, v2

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v14

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lt0/j;->a:Lt0/i;

    invoke-static {v0, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    shr-int/lit8 v2, v12, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/lit16 v15, v2, 0x6000

    const/16 v16, 0x68

    move v2, v10

    const/4 v10, 0x0

    move-object v8, v11

    sget-object v11, Ly2/j;->a:Ly2/b1;

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v4, v9

    move-object v9, v0

    move v0, v4

    move-object v4, v7

    move-object v7, v1

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    move-object v4, v7

    move v0, v9

    move v2, v10

    move-object v8, v11

    const v1, -0x3305880

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    move-object v3, v8

    :goto_c
    move-object v2, v4

    goto :goto_d

    :cond_12
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v5

    goto :goto_c

    :goto_d
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Lcom/whoop/profile/view/a;

    move-object/from16 v1, p0

    move/from16 v5, p5

    move v4, v6

    invoke-direct/range {v0 .. v5}, Lcom/whoop/profile/view/a;-><init>(Lkd1/o;Landroidx/compose/ui/Modifier;Ljava/lang/String;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final ProfileAvatar$lambda$1(Lkd1/o;Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/whoop/profile/view/ProfileAvatarKt;->ProfileAvatar(Lkd1/o;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileAvatarWithImagePreview(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x29785901

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lcom/whoop/profile/view/ProfileAvatarKt$ProfileAvatarWithImagePreview$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v1}, Lcom/whoop/profile/view/ProfileAvatarKt$ProfileAvatarWithImagePreview$$inlined$WhoopPreviewTheme$1;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lbz0/c;

    const/16 v1, 0xd

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final ProfileAvatarWithImagePreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/ProfileAvatarKt;->ProfileAvatarWithImagePreview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileAvatarKt;->ProfileAvatarWithImagePreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Lkd1/o;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p2

    move-object p2, p0

    move-object p0, p1

    move-object p1, v0

    invoke-static/range {p0 .. p6}, Lcom/whoop/profile/view/ProfileAvatarKt;->ProfileAvatar$lambda$1(Lkd1/o;Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method
