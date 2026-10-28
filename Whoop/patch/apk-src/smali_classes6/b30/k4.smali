.class public final synthetic Lb30/k4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZZLc93/a;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lb30/k4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/k4;->x:Ljava/lang/Object;

    iput-boolean p2, p0, Lb30/k4;->y:Z

    iput-boolean p3, p0, Lb30/k4;->z:Z

    iput-object p4, p0, Lb30/k4;->G:Ljava/lang/Object;

    iput p5, p0, Lb30/k4;->E:I

    iput p6, p0, Lb30/k4;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZZIII)V
    .locals 0

    .line 2
    iput p7, p0, Lb30/k4;->w:I

    iput-object p1, p0, Lb30/k4;->G:Ljava/lang/Object;

    iput-object p2, p0, Lb30/k4;->x:Ljava/lang/Object;

    iput-boolean p3, p0, Lb30/k4;->y:Z

    iput-boolean p4, p0, Lb30/k4;->z:Z

    iput p5, p0, Lb30/k4;->E:I

    iput p6, p0, Lb30/k4;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZZIIIZ)V
    .locals 0

    .line 3
    iput p7, p0, Lb30/k4;->w:I

    iput-object p1, p0, Lb30/k4;->x:Ljava/lang/Object;

    iput-object p2, p0, Lb30/k4;->G:Ljava/lang/Object;

    iput-boolean p3, p0, Lb30/k4;->y:Z

    iput-boolean p4, p0, Lb30/k4;->z:Z

    iput p5, p0, Lb30/k4;->E:I

    iput p6, p0, Lb30/k4;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZZLjava/lang/Object;III)V
    .locals 0

    .line 4
    iput p7, p0, Lb30/k4;->w:I

    iput-object p1, p0, Lb30/k4;->G:Ljava/lang/Object;

    iput-boolean p2, p0, Lb30/k4;->y:Z

    iput-boolean p3, p0, Lb30/k4;->z:Z

    iput-object p4, p0, Lb30/k4;->x:Ljava/lang/Object;

    iput p5, p0, Lb30/k4;->E:I

    iput p6, p0, Lb30/k4;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lb30/k4;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/k4;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lb30/k4;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v2, p0, Lb30/k4;->y:Z

    iget-boolean v3, p0, Lb30/k4;->z:Z

    iget v5, p0, Lb30/k4;->E:I

    iget v6, p0, Lb30/k4;->F:I

    invoke-static/range {v1 .. v8}, Lzc1/i5;->a(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/k4;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lz01/d$a;

    iget-object v0, p0, Lb30/k4;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v2, p0, Lb30/k4;->y:Z

    iget-boolean v3, p0, Lb30/k4;->z:Z

    iget v5, p0, Lb30/k4;->E:I

    iget v6, p0, Lb30/k4;->F:I

    invoke-static/range {v1 .. v8}, Lz01/c;->a(Lz01/d$a;ZZLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb30/k4;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltp1/k;

    iget-object v0, p0, Lb30/k4;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v2, p0, Lb30/k4;->y:Z

    iget-boolean v3, p0, Lb30/k4;->z:Z

    iget v5, p0, Lb30/k4;->E:I

    iget v6, p0, Lb30/k4;->F:I

    invoke-static/range {v1 .. v8}, Lvp1/h;->l(Ltp1/k;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lb30/k4;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/model/FeatureEducationParagraph;

    iget-object v0, p0, Lb30/k4;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v3, p0, Lb30/k4;->y:Z

    iget-boolean v4, p0, Lb30/k4;->z:Z

    iget v5, p0, Lb30/k4;->E:I

    iget v6, p0, Lb30/k4;->F:I

    invoke-static/range {v1 .. v8}, Lre1/j;->t(Lcom/whoop/design/model/FeatureEducationParagraph;Lkotlin/jvm/functions/Function1;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lb30/k4;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/s1;

    iget-object v0, p0, Lb30/k4;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v3, p0, Lb30/k4;->y:Z

    iget-boolean v4, p0, Lb30/k4;->z:Z

    iget v5, p0, Lb30/k4;->E:I

    iget v6, p0, Lb30/k4;->F:I

    invoke-static/range {v1 .. v8}, Lq21/c;->e(Ll0/s1;Ljava/lang/String;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lb30/k4;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/s1;

    iget-object v0, p0, Lb30/k4;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v3, p0, Lb30/k4;->y:Z

    iget-boolean v4, p0, Lb30/k4;->z:Z

    iget v5, p0, Lb30/k4;->E:I

    iget v6, p0, Lb30/k4;->F:I

    invoke-static/range {v1 .. v8}, Lq21/c;->a(Ll0/s1;Lcom/whoop/design/util/TextResource;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lb30/k4;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lb30/k4;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lnq2/a;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v3, p0, Lb30/k4;->y:Z

    iget-boolean v4, p0, Lb30/k4;->z:Z

    iget v5, p0, Lb30/k4;->E:I

    iget v6, p0, Lb30/k4;->F:I

    invoke-static/range {v1 .. v8}, Lnq2/e;->o(Landroidx/compose/ui/Modifier;Lnq2/a;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lb30/k4;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Liw0/z;

    iget-object v0, p0, Lb30/k4;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v3, p0, Lb30/k4;->y:Z

    iget-boolean v4, p0, Lb30/k4;->z:Z

    iget v5, p0, Lb30/k4;->E:I

    iget v6, p0, Lb30/k4;->F:I

    invoke-static/range {v1 .. v8}, Liw0/c0;->f(Liw0/z;Lkotlin/jvm/functions/Function1;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lb30/k4;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lb30/k4;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v2, p0, Lb30/k4;->y:Z

    iget-boolean v3, p0, Lb30/k4;->z:Z

    iget v5, p0, Lb30/k4;->E:I

    iget v6, p0, Lb30/k4;->F:I

    invoke-static/range {v1 .. v8}, Lfg2/g;->a(Landroidx/compose/ui/Modifier;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lb30/k4;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lb30/k4;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/k4;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-boolean v3, p0, Lb30/k4;->y:Z

    iget-boolean v4, p0, Lb30/k4;->z:Z

    iget v7, p0, Lb30/k4;->F:I

    invoke-static/range {v1 .. v7}, Lio/sentry/config/a;->k(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
.end method
