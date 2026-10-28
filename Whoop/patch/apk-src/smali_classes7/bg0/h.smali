.class public final synthetic Lbg0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/16 v0, 0xc

    iput v0, p0, Lbg0/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lbg0/h;->y:I

    iput-object p3, p0, Lbg0/h;->E:Ljava/lang/Object;

    iput-object p4, p0, Lbg0/h;->F:Ljava/lang/Object;

    iput-boolean p5, p0, Lbg0/h;->x:Z

    iput p2, p0, Lbg0/h;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZIII)V
    .locals 0

    .line 2
    iput p6, p0, Lbg0/h;->w:I

    iput-object p1, p0, Lbg0/h;->E:Ljava/lang/Object;

    iput-object p2, p0, Lbg0/h;->F:Ljava/lang/Object;

    iput-boolean p3, p0, Lbg0/h;->x:Z

    iput p4, p0, Lbg0/h;->y:I

    iput p5, p0, Lbg0/h;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;III)V
    .locals 0

    .line 3
    iput p6, p0, Lbg0/h;->w:I

    iput-object p1, p0, Lbg0/h;->E:Ljava/lang/Object;

    iput-boolean p2, p0, Lbg0/h;->x:Z

    iput-object p3, p0, Lbg0/h;->F:Ljava/lang/Object;

    iput p4, p0, Lbg0/h;->y:I

    iput p5, p0, Lbg0/h;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lqt0/b;IZLc93/a;I)V
    .locals 1

    .line 4
    const/16 v0, 0x15

    iput v0, p0, Lbg0/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbg0/h;->E:Ljava/lang/Object;

    iput p2, p0, Lbg0/h;->y:I

    iput-boolean p3, p0, Lbg0/h;->x:Z

    iput-object p4, p0, Lbg0/h;->F:Ljava/lang/Object;

    iput p5, p0, Lbg0/h;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Ly81/f;Ly81/f;IZI)V
    .locals 1

    .line 5
    const/4 v0, 0x4

    iput v0, p0, Lbg0/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbg0/h;->E:Ljava/lang/Object;

    iput-object p2, p0, Lbg0/h;->F:Ljava/lang/Object;

    iput p3, p0, Lbg0/h;->y:I

    iput-boolean p4, p0, Lbg0/h;->x:Z

    iput p5, p0, Lbg0/h;->z:I

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ll83/e;III)V
    .locals 0

    .line 6
    iput p6, p0, Lbg0/h;->w:I

    iput-boolean p1, p0, Lbg0/h;->x:Z

    iput-object p2, p0, Lbg0/h;->E:Ljava/lang/Object;

    iput-object p3, p0, Lbg0/h;->F:Ljava/lang/Object;

    iput p4, p0, Lbg0/h;->y:I

    iput p5, p0, Lbg0/h;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;Lc93/a;II)V
    .locals 1

    .line 7
    const/16 v0, 0xb

    iput v0, p0, Lbg0/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lbg0/h;->x:Z

    iput-object p2, p0, Lbg0/h;->F:Ljava/lang/Object;

    iput-object p3, p0, Lbg0/h;->E:Ljava/lang/Object;

    iput p4, p0, Lbg0/h;->y:I

    iput p5, p0, Lbg0/h;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lbg0/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lrg2/n;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lsg2/p;->b(Lrg2/n;ZLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvn1/q;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lrm1/i;->a(Lvn1/q;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Log0/c;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lqg0/e;->c(Log0/c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Log0/c$d;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lqg0/d;->h(Log0/c$d;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lr51/f;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lph1/i;->i(Lr51/f;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lgz0/m0;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v1, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lp12/x;->e(ZLgz0/m0;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Loy0/a;->a(Landroidx/compose/ui/Modifier;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkd1/o;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lmx1/s;->a(Lkd1/o;Landroidx/compose/ui/Modifier;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lqt0/b;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v2, p0, Lbg0/h;->y:I

    iget-boolean v3, p0, Lbg0/h;->x:Z

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lm22/j;->d(Lqt0/b;IZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Llw1/i;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Llw1/h;->c(Llw1/i;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Llf0/e;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Llf0/z1;->e(Llf0/e;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lj72/l;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Ll72/p;->g(Lj72/l;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/achievements/celebration/d;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lcom/whoop/achievements/celebration/a;->b(Lcom/whoop/achievements/celebration/d;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lkw1/v;->e(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Liw1/f;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lkw1/g;->a(Liw1/f;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Leb/u0;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lkv2/b;->i(Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Leb/u0;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lje2/f;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lke2/c;->g(Lje2/f;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v1, p0, Lbg0/h;->y:I

    iget-boolean v4, p0, Lbg0/h;->x:Z

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lj01/b;->c(ILjava/lang/String;Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v1, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lih2/b;->b(ZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lic2/h;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lic2/f;->d(Lic2/h;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lh01/t;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lh01/s;->g(Lh01/t;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg40/q3;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lbg0/h;->y:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v6, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v6}, Lg40/j4;->h(Lg40/q3;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lg11/c;->e(Lcom/whoop/design/util/TextResource;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function3;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lfy0/a;->a(Ll0/u;ZLkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ld30/v;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lbg0/h;->y:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v6, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v6}, Lse/g;->m(Ld30/v;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly81/f;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly81/f;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v3, p0, Lbg0/h;->y:I

    iget-boolean v4, p0, Lbg0/h;->x:Z

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lc41/v4;->a(Ly81/f;Ly81/f;IZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lc41/b;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lorg/joda/time/LocalTime;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/m;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v1, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lbs1/c0;->s(ZLorg/joda/time/LocalTime;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lxq2/l;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lbr2/e;->d(Landroidx/compose/ui/Modifier;Lxq2/l;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lbg0/h;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lzf0/c;

    iget-object v0, p0, Lbg0/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lbg0/h;->x:Z

    iget v4, p0, Lbg0/h;->y:I

    iget v5, p0, Lbg0/h;->z:I

    invoke-static/range {v1 .. v7}, Lbg0/i;->c(Lzf0/c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
.end method
