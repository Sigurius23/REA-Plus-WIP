.class public final Lha3/e;
.super Lu93/q0;
.source "SourceFile"

# interfaces
.implements Lha3/a;


# static fields
.field public static final g0:Lbb3/b;

.field public static final h0:Lbb3/b;


# instance fields
.field public e0:I

.field public final f0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbb3/b;

    invoke-direct {v0}, Lbb3/b;-><init>()V

    sput-object v0, Lha3/e;->g0:Lbb3/b;

    new-instance v0, Lbb3/b;

    invoke-direct {v0}, Lbb3/b;-><init>()V

    sput-object v0, Lha3/e;->h0:Lbb3/b;

    return-void
.end method

.method public constructor <init>(Lr93/k;Lu93/q0;Ls93/i;Lva3/h;ILr93/s0;Z)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    if-eqz p3, :cond_2

    if-eqz p4, :cond_1

    if-eqz p5, :cond_0

    invoke-direct/range {p0 .. p6}, Lu93/q0;-><init>(Lr93/k;Lu93/q0;Ls93/i;Lva3/h;ILr93/s0;)V

    move-object p1, p0

    iput v0, p1, Lha3/e;->e0:I

    iput-boolean p7, p1, Lha3/e;->f0:Z

    return-void

    :cond_0
    move-object p1, p0

    const/4 p2, 0x3

    invoke-static {p2}, Lha3/e;->r0(I)V

    throw v1

    :cond_1
    move-object p1, p0

    const/4 p2, 0x2

    invoke-static {p2}, Lha3/e;->r0(I)V

    throw v1

    :cond_2
    move-object p1, p0

    const/4 p2, 0x1

    invoke-static {p2}, Lha3/e;->r0(I)V

    throw v1

    :cond_3
    move-object p1, p0

    invoke-static {v0}, Lha3/e;->r0(I)V

    throw v1
.end method

.method public static Y0(Lr93/k;Lia3/c;Lva3/h;Lw93/f;Z)Lha3/e;
    .locals 9

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    if-eqz p2, :cond_0

    new-instance v1, Lha3/e;

    const/4 v3, 0x0

    const/4 v6, 0x1

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v1 .. v8}, Lha3/e;-><init>(Lr93/k;Lu93/q0;Ls93/i;Lva3/h;ILr93/s0;Z)V

    return-object v1

    :cond_0
    const/4 p0, 0x7

    invoke-static {p0}, Lha3/e;->r0(I)V

    throw v0

    :cond_1
    const/4 p0, 0x5

    invoke-static {p0}, Lha3/e;->r0(I)V

    throw v0
.end method

.method public static synthetic r0(I)V
    .locals 11

    const/16 v0, 0x15

    const/16 v1, 0x12

    const/16 v2, 0xd

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v3, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v3, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v4, 0x2

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v5, 0x3

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor"

    const/4 v7, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v8, "containingDeclaration"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_1
    const-string v8, "enhancedReturnType"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_2
    const-string v8, "enhancedValueParameterTypes"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_3
    const-string v8, "newOwner"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_4
    aput-object v6, v5, v7

    goto :goto_2

    :pswitch_5
    const-string v8, "visibility"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_6
    const-string v8, "unsubstitutedValueParameters"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_7
    const-string v8, "typeParameters"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_8
    const-string v8, "contextReceiverParameters"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_9
    const-string v8, "source"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_a
    const-string v8, "kind"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_b
    const-string v8, "name"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_c
    const-string v8, "annotations"

    aput-object v8, v5, v7

    :goto_2
    const-string v7, "initialize"

    const-string v8, "createSubstitutedCopy"

    const-string v9, "enhance"

    const/4 v10, 0x1

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v6, v5, v10

    goto :goto_3

    :cond_2
    aput-object v9, v5, v10

    goto :goto_3

    :cond_3
    aput-object v8, v5, v10

    goto :goto_3

    :cond_4
    aput-object v7, v5, v10

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v6, "<init>"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_d
    aput-object v9, v5, v4

    goto :goto_4

    :pswitch_e
    aput-object v8, v5, v4

    goto :goto_4

    :pswitch_f
    aput-object v7, v5, v4

    goto :goto_4

    :pswitch_10
    const-string v6, "createJavaMethod"

    aput-object v6, v5, v4

    :goto_4
    :pswitch_11
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eq p0, v2, :cond_5

    if-eq p0, v1, :cond_5

    if-eq p0, v0, :cond_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_a
        :pswitch_c
        :pswitch_9
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x5
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_11
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_11
        :pswitch_d
        :pswitch_d
        :pswitch_11
    .end packed-switch
.end method


# virtual methods
.method public final J(Llb3/y;Ljava/util/ArrayList;Llb3/y;Ll83/k;)Lha3/a;
    .locals 2

    invoke-virtual {p0}, Lu93/x;->v()Ljava/util/List;

    move-result-object v0

    invoke-static {p2, v0, p0}, Lce/w;->E(Ljava/util/ArrayList;Ljava/util/Collection;Lr93/w;)Ljava/util/ArrayList;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    sget-object v1, Ls93/g;->a:Ls93/f;

    invoke-static {p0, p1, v1}, Lya3/p;->j(Lr93/b;Llb3/y;Ls93/i;)Lu93/p0;

    move-result-object p1

    :goto_0
    sget-object v1, Llb3/a1;->b:Llb3/a1;

    invoke-virtual {p0, v1}, Lu93/x;->P0(Llb3/a1;)Lu93/w;

    move-result-object v1

    iput-object p2, v1, Lu93/w;->G:Ljava/util/List;

    iput-object p3, v1, Lu93/w;->K:Llb3/y;

    iput-object p1, v1, Lu93/w;->I:Lr93/q0;

    const/4 p1, 0x1

    iput-boolean p1, v1, Lu93/w;->P:Z

    iput-boolean p1, v1, Lu93/w;->O:Z

    iget-object p1, v1, Lu93/w;->X:Lu93/x;

    invoke-virtual {p1, v1}, Lu93/x;->M0(Lu93/w;)Lu93/x;

    move-result-object p1

    check-cast p1, Lha3/e;

    if-eqz p4, :cond_1

    iget-object p2, p4, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Lr93/a;

    iget-object p3, p4, Ll83/k;->x:Ljava/lang/Object;

    invoke-virtual {p1, p2, p3}, Lu93/x;->Q0(Lr93/a;Ljava/lang/Object;)V

    :cond_1
    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    const/16 p1, 0x15

    invoke-static {p1}, Lha3/e;->r0(I)V

    throw v0
.end method

.method public final L0(ILr93/k;Lr93/w;Lr93/s0;Ls93/i;Lva3/h;)Lu93/x;
    .locals 9

    const/4 v0, 0x0

    if-eqz p2, :cond_3

    if-eqz p1, :cond_2

    if-eqz p5, :cond_1

    new-instance v1, Lha3/e;

    move-object v3, p3

    check-cast v3, Lu93/q0;

    if-eqz p6, :cond_0

    :goto_0
    move-object v5, p6

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lu93/n;->getName()Lva3/h;

    move-result-object p6

    goto :goto_0

    :goto_1
    iget-boolean v8, p0, Lha3/e;->f0:Z

    move v6, p1

    move-object v2, p2

    move-object v7, p4

    move-object v4, p5

    invoke-direct/range {v1 .. v8}, Lha3/e;-><init>(Lr93/k;Lu93/q0;Ls93/i;Lva3/h;ILr93/s0;Z)V

    iget p1, p0, Lha3/e;->e0:I

    invoke-static {p1}, Lev/n;->b(I)Z

    move-result p2

    invoke-static {p1}, Lev/n;->c(I)Z

    move-result p1

    invoke-static {p2, p1}, Lev/n;->a(ZZ)I

    move-result p1

    iput p1, v1, Lha3/e;->e0:I

    return-object v1

    :cond_1
    const/16 p1, 0x10

    invoke-static {p1}, Lha3/e;->r0(I)V

    throw v0

    :cond_2
    const/16 p1, 0xf

    invoke-static {p1}, Lha3/e;->r0(I)V

    throw v0

    :cond_3
    const/16 p1, 0xe

    invoke-static {p1}, Lha3/e;->r0(I)V

    throw v0
.end method

.method public final S()Z
    .locals 1

    iget v0, p0, Lha3/e;->e0:I

    invoke-static {v0}, Lev/n;->c(I)Z

    move-result v0

    return v0
.end method

.method public final X0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;Ljava/util/Map;)Lu93/q0;
    .locals 1

    const/4 v0, 0x0

    if-eqz p3, :cond_3

    if-eqz p4, :cond_2

    if-eqz p5, :cond_1

    if-eqz p8, :cond_0

    invoke-super/range {p0 .. p9}, Lu93/q0;->X0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;Ljava/util/Map;)Lu93/q0;

    move-object p1, p0

    sget-object p2, Lrb3/r;->d:Ljava/util/List;

    invoke-static {p0}, Lup/d;->q(Lha3/e;)Lrb3/g;

    move-result-object p2

    invoke-virtual {p2}, Lrb3/g;->c()Z

    move-result p2

    iput-boolean p2, p1, Lu93/x;->N:Z

    return-object p1

    :cond_0
    move-object p1, p0

    const/16 p2, 0xc

    invoke-static {p2}, Lha3/e;->r0(I)V

    throw v0

    :cond_1
    move-object p1, p0

    const/16 p2, 0xb

    invoke-static {p2}, Lha3/e;->r0(I)V

    throw v0

    :cond_2
    move-object p1, p0

    const/16 p2, 0xa

    invoke-static {p2}, Lha3/e;->r0(I)V

    throw v0

    :cond_3
    move-object p1, p0

    const/16 p2, 0x9

    invoke-static {p2}, Lha3/e;->r0(I)V

    throw v0
.end method
