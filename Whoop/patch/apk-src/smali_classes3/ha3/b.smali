.class public final Lha3/b;
.super Lu93/j;
.source "SourceFile"

# interfaces
.implements Lha3/a;


# instance fields
.field public f0:Ljava/lang/Boolean;

.field public g0:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Lr93/e;Lha3/b;Ls93/i;ZILr93/s0;)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-eqz p3, :cond_2

    if-eqz p5, :cond_1

    if-eqz p6, :cond_0

    invoke-direct/range {p0 .. p6}, Lu93/j;-><init>(Lr93/e;Lr93/j;Ls93/i;ZILr93/s0;)V

    move-object p1, p0

    iput-object v0, p1, Lha3/b;->f0:Ljava/lang/Boolean;

    iput-object v0, p1, Lha3/b;->g0:Ljava/lang/Boolean;

    return-void

    :cond_0
    move-object p1, p0

    const/4 p2, 0x3

    invoke-static {p2}, Lha3/b;->r0(I)V

    throw v0

    :cond_1
    move-object p1, p0

    const/4 p2, 0x2

    invoke-static {p2}, Lha3/b;->r0(I)V

    throw v0

    :cond_2
    move-object p1, p0

    const/4 p2, 0x1

    invoke-static {p2}, Lha3/b;->r0(I)V

    throw v0

    :cond_3
    move-object p1, p0

    const/4 p2, 0x0

    invoke-static {p2}, Lha3/b;->r0(I)V

    throw v0
.end method

.method public static a1(Lr93/e;Ls93/i;ZLw93/f;)Lha3/b;
    .locals 7

    if-eqz p0, :cond_0

    new-instance v0, Lha3/b;

    const/4 v2, 0x0

    const/4 v5, 0x1

    move-object v1, p0

    move-object v3, p1

    move v4, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lha3/b;-><init>(Lr93/e;Lha3/b;Ls93/i;ZILr93/s0;)V

    return-object v0

    :cond_0
    const/4 p0, 0x4

    invoke-static {p0}, Lha3/b;->r0(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic r0(I)V
    .locals 9

    const/16 v0, 0x12

    const/16 v1, 0xb

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v2, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v3, 0x2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v4, 0x3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor"

    const/4 v6, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v7, "containingDeclaration"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_1
    const-string v7, "enhancedReturnType"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_2
    const-string v7, "enhancedValueParameterTypes"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_3
    const-string v7, "sourceElement"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_4
    aput-object v5, v4, v6

    goto :goto_2

    :pswitch_5
    const-string v7, "newOwner"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_6
    const-string v7, "source"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_7
    const-string v7, "kind"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_8
    const-string v7, "annotations"

    aput-object v7, v4, v6

    :goto_2
    const-string v6, "createSubstitutedCopy"

    const-string v7, "enhance"

    const/4 v8, 0x1

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v5, v4, v8

    goto :goto_3

    :cond_2
    aput-object v7, v4, v8

    goto :goto_3

    :cond_3
    aput-object v6, v4, v8

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v5, "<init>"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_9
    aput-object v7, v4, v3

    goto :goto_4

    :pswitch_a
    const-string v5, "createDescriptor"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_b
    aput-object v6, v4, v3

    goto :goto_4

    :pswitch_c
    const-string v5, "createJavaConstructor"

    aput-object v5, v4, v3

    :goto_4
    :pswitch_d
    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eq p0, v1, :cond_4

    if-eq p0, v0, :cond_4

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_8
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_8
        :pswitch_6
        :pswitch_4
        :pswitch_5
        :pswitch_7
        :pswitch_3
        :pswitch_8
        :pswitch_2
        :pswitch_1
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_d
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_d
    .end packed-switch
.end method


# virtual methods
.method public final J(Llb3/y;Ljava/util/ArrayList;Llb3/y;Ll83/k;)Lha3/a;
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    invoke-virtual/range {p0 .. p0}, Lu93/j;->V0()Lr93/e;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lu93/x;->getKind()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v7

    const/4 v4, 0x0

    move-object/from16 v2, p0

    invoke-virtual/range {v2 .. v7}, Lha3/b;->b1(Lr93/k;Lr93/w;ILs93/i;Lr93/s0;)Lha3/b;

    move-result-object v8

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    move-object/from16 v2, p0

    move-object v9, v0

    goto :goto_1

    :cond_0
    sget-object v2, Ls93/g;->a:Ls93/f;

    invoke-static {v8, v0, v2}, Lya3/p;->j(Lr93/b;Llb3/y;Ls93/i;)Lu93/p0;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v10, v2, Lu93/x;->K:Lr93/q0;

    invoke-virtual {v2}, Lu93/x;->getTypeParameters()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v2}, Lu93/x;->v()Ljava/util/List;

    move-result-object v0

    move-object/from16 v3, p2

    invoke-static {v3, v0, v8}, Lce/w;->E(Ljava/util/ArrayList;Ljava/util/Collection;Lr93/w;)Ljava/util/ArrayList;

    move-result-object v13

    invoke-virtual {v2}, Lu93/x;->k()Lr93/a0;

    move-result-object v15

    invoke-virtual {v2}, Lu93/x;->getVisibility()Lr93/r;

    move-result-object v16

    sget-object v11, Lm83/y;->w:Lm83/y;

    move-object/from16 v14, p3

    invoke-virtual/range {v8 .. v16}, Lu93/x;->O0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;)V

    if-eqz v1, :cond_1

    iget-object v0, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Lr93/a;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    invoke-virtual {v8, v0, v1}, Lu93/x;->Q0(Lr93/a;Ljava/lang/Object;)V

    :cond_1
    return-object v8
.end method

.method public final bridge synthetic L0(ILr93/k;Lr93/w;Lr93/s0;Ls93/i;Lva3/h;)Lu93/x;
    .locals 0

    move-object p6, p4

    move p4, p1

    move-object p1, p0

    invoke-virtual/range {p1 .. p6}, Lha3/b;->b1(Lr93/k;Lr93/w;ILs93/i;Lr93/s0;)Lha3/b;

    move-result-object p2

    return-object p2
.end method

.method public final R0(Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lha3/b;->f0:Ljava/lang/Boolean;

    return-void
.end method

.method public final S()Z
    .locals 1

    iget-object v0, p0, Lha3/b;->g0:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final S0(Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lha3/b;->g0:Ljava/lang/Boolean;

    return-void
.end method

.method public final bridge synthetic U0(ILr93/k;Lr93/w;Lr93/s0;Ls93/i;Lva3/h;)Lu93/j;
    .locals 0

    move-object p6, p4

    move p4, p1

    move-object p1, p0

    invoke-virtual/range {p1 .. p6}, Lha3/b;->b1(Lr93/k;Lr93/w;ILs93/i;Lr93/s0;)Lha3/b;

    move-result-object p2

    return-object p2
.end method

.method public final b1(Lr93/k;Lr93/w;ILs93/i;Lr93/s0;)Lha3/b;
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    if-eqz p3, :cond_5

    if-eqz p4, :cond_4

    if-eqz p5, :cond_3

    const/4 v1, 0x1

    if-eq p3, v1, :cond_1

    const/4 v1, 0x4

    if-ne p3, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "Attempt at creating a constructor that is not a declaration: \ncopy from: "

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p5, "\nnewOwner: "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\nkind: "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Lq63/c;->E(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    move-object v1, p1

    check-cast v1, Lr93/e;

    move-object v2, p2

    check-cast v2, Lha3/b;

    if-eqz p3, :cond_2

    new-instance v0, Lha3/b;

    iget-boolean v4, p0, Lu93/j;->e0:Z

    move v5, p3

    move-object v3, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lha3/b;-><init>(Lr93/e;Lha3/b;Ls93/i;ZILr93/s0;)V

    iget-object p1, p0, Lha3/b;->f0:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Lha3/b;->f0:Ljava/lang/Boolean;

    iget-object p1, p0, Lha3/b;->g0:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Lha3/b;->g0:Ljava/lang/Boolean;

    return-object v0

    :cond_2
    const/16 p1, 0xd

    invoke-static {p1}, Lha3/b;->r0(I)V

    throw v0

    :cond_3
    const/16 p1, 0xa

    invoke-static {p1}, Lha3/b;->r0(I)V

    throw v0

    :cond_4
    const/16 p1, 0x9

    invoke-static {p1}, Lha3/b;->r0(I)V

    throw v0

    :cond_5
    const/16 p1, 0x8

    invoke-static {p1}, Lha3/b;->r0(I)V

    throw v0

    :cond_6
    const/4 p1, 0x7

    invoke-static {p1}, Lha3/b;->r0(I)V

    throw v0
.end method
