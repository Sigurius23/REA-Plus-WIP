.class public final Lc4/i;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/types/ContentBlock;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    .line 1
    iput p4, p0, Lc4/i;->w:I

    iput-object p1, p0, Lc4/i;->z:Ljava/lang/Object;

    iput-object p2, p0, Lc4/i;->y:Ljava/lang/Object;

    iput p3, p0, Lc4/i;->x:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;ILl83/e;II)V
    .locals 0

    .line 2
    iput p5, p0, Lc4/i;->w:I

    iput-object p1, p0, Lc4/i;->y:Ljava/lang/Object;

    iput p2, p0, Lc4/i;->x:I

    iput-object p3, p0, Lc4/i;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 3
    iput p4, p0, Lc4/i;->w:I

    iput-object p1, p0, Lc4/i;->y:Ljava/lang/Object;

    iput-object p2, p0, Lc4/i;->z:Ljava/lang/Object;

    iput p3, p0, Lc4/i;->x:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lsj/l;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    const/4 p3, 0x6

    iput p3, p0, Lc4/i;->w:I

    .line 4
    iput-object p1, p0, Lc4/i;->z:Ljava/lang/Object;

    iput-object p2, p0, Lc4/i;->y:Ljava/lang/Object;

    iput p4, p0, Lc4/i;->x:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    iget v1, v0, Lc4/i;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    iget-object v2, v0, Lc4/i;->y:Ljava/lang/Object;

    check-cast v2, Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v3, v0, Lc4/i;->z:Ljava/lang/Object;

    check-cast v3, Lx1/b;

    const/16 v4, 0x189

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v4

    iget v5, v0, Lc4/i;->x:I

    invoke-static {v2, v5, v3, v1, v4}, Ltj/b;->a(Lcom/amplitude/android/engagement/types/Nudge;ILx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    iget-object v2, v0, Lc4/i;->z:Ljava/lang/Object;

    check-cast v2, Lsj/l;

    iget-object v3, v0, Lc4/i;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const/16 v4, 0x41

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v4

    iget v5, v0, Lc4/i;->x:I

    invoke-virtual {v2, v3, v4, v1, v5}, Lsj/l;->b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v3, v0, Lc4/i;->y:Ljava/lang/Object;

    check-cast v3, Luj/i;

    and-int/lit8 v2, v2, 0xb

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    move-object v2, v1

    check-cast v2, Lp1/q;

    const v4, -0x1896950d

    invoke-virtual {v2, v4}, Lp1/q;->f0(I)V

    sget-object v4, Luj/k;->a:Lp1/u2;

    invoke-virtual {v2, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Luj/m;

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    iget v2, v3, Luj/i;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4, v2, v1, v5}, Luj/m;->a(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll3/v0;

    move-result-object v18

    iget-wide v4, v3, Luj/i;->g:J

    iget-object v2, v0, Lc4/i;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget v3, v0, Lc4/i;->x:I

    and-int/lit8 v20, v3, 0xe

    const/16 v21, 0xc00

    const v22, 0xdffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    move-object/from16 v19, v1

    invoke-static/range {v2 .. v22}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    iget-object v2, v0, Lc4/i;->z:Ljava/lang/Object;

    check-cast v2, Lcom/amplitude/android/engagement/types/VideoBlock;

    iget-object v3, v0, Lc4/i;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/ui/Modifier;

    iget v4, v0, Lc4/i;->x:I

    or-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v4

    invoke-static {v2, v3, v1, v4}, Lse/h;->r(Lcom/amplitude/android/engagement/types/VideoBlock;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    iget-object v2, v0, Lc4/i;->z:Ljava/lang/Object;

    check-cast v2, Lcom/amplitude/android/engagement/types/ImageBlock;

    iget-object v3, v0, Lc4/i;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/ui/Modifier;

    iget v4, v0, Lc4/i;->x:I

    or-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v4

    invoke-static {v2, v3, v1, v4}, Lse/b;->h(Lcom/amplitude/android/engagement/types/ImageBlock;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    iget-object v2, v0, Lc4/i;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lc4/i;->z:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget v4, v0, Lc4/i;->x:I

    or-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v4

    invoke-static {v2, v3, v1, v4}, Lx43/j;->l(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    iget-object v2, v0, Lc4/i;->y:Ljava/lang/Object;

    check-cast v2, Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v3, v0, Lc4/i;->z:Ljava/lang/Object;

    check-cast v3, Lmj/n;

    const/16 v4, 0x9

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v4

    iget v5, v0, Lc4/i;->x:I

    invoke-static {v2, v5, v3, v1, v4}, Lds/q;->g(Lcom/amplitude/android/engagement/types/Nudge;ILmj/n;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    iget-object v2, v0, Lc4/i;->y:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Lc4/i;->z:Ljava/lang/Object;

    check-cast v3, Lc93/m;

    iget v4, v0, Lc4/i;->x:I

    or-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Lp1/x;->L(I)I

    move-result v4

    invoke-static {v2, v3, v1, v4}, Lse/b;->t(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
