.class public final synthetic Lg40/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:I

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ll83/e;

.field public final synthetic K:Ll83/e;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(ZIILcom/whoop/design/model/ParagraphInsets;ZZLc31/k;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lg40/b2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg40/b2;->x:Z

    iput p2, p0, Lg40/b2;->y:I

    iput p3, p0, Lg40/b2;->z:I

    iput-object p4, p0, Lg40/b2;->H:Ljava/lang/Object;

    iput-boolean p5, p0, Lg40/b2;->E:Z

    iput-boolean p6, p0, Lg40/b2;->F:Z

    iput-object p7, p0, Lg40/b2;->I:Ljava/lang/Object;

    iput-object p8, p0, Lg40/b2;->J:Ll83/e;

    iput-object p9, p0, Lg40/b2;->K:Ll83/e;

    iput-object p10, p0, Lg40/b2;->L:Ljava/lang/Object;

    iput p11, p0, Lg40/b2;->G:I

    return-void
.end method

.method public synthetic constructor <init>(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLg2/s;Lc93/m;III)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lg40/b2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg40/b2;->x:Z

    iput-object p2, p0, Lg40/b2;->H:Ljava/lang/Object;

    iput-object p3, p0, Lg40/b2;->I:Ljava/lang/Object;

    iput-object p4, p0, Lg40/b2;->J:Ll83/e;

    iput-boolean p5, p0, Lg40/b2;->E:Z

    iput-boolean p6, p0, Lg40/b2;->F:Z

    iput-object p7, p0, Lg40/b2;->L:Ljava/lang/Object;

    iput-object p8, p0, Lg40/b2;->K:Ll83/e;

    iput p9, p0, Lg40/b2;->y:I

    iput p10, p0, Lg40/b2;->z:I

    iput p11, p0, Lg40/b2;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lg40/b2;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg40/b2;->H:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/model/ParagraphInsets;

    iget-object v0, p0, Lg40/b2;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc31/k;

    iget-object v0, p0, Lg40/b2;->J:Ll83/e;

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lg40/b2;->K:Ll83/e;

    move-object v9, v0

    check-cast v9, Lc93/a;

    iget-object v0, p0, Lg40/b2;->L:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lc93/a;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-boolean v1, p0, Lg40/b2;->x:Z

    iget v2, p0, Lg40/b2;->y:I

    iget v3, p0, Lg40/b2;->z:I

    iget-boolean v5, p0, Lg40/b2;->E:Z

    iget-boolean v6, p0, Lg40/b2;->F:Z

    iget v11, p0, Lg40/b2;->G:I

    invoke-static/range {v1 .. v13}, Lp12/l;->b(ZIILcom/whoop/design/model/ParagraphInsets;ZZLc31/k;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg40/b2;->H:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lg40/z1;

    iget-object v0, p0, Lg40/b2;->I:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg40/b2;->J:Ll83/e;

    move-object v4, v0

    check-cast v4, Lc93/m;

    iget-object v0, p0, Lg40/b2;->L:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lg2/s;

    iget-object v0, p0, Lg40/b2;->K:Ll83/e;

    move-object v8, v0

    check-cast v8, Lc93/m;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg40/b2;->z:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-boolean v1, p0, Lg40/b2;->x:Z

    iget-boolean v5, p0, Lg40/b2;->E:Z

    iget-boolean v6, p0, Lg40/b2;->F:Z

    iget v9, p0, Lg40/b2;->y:I

    iget v12, p0, Lg40/b2;->G:I

    invoke-static/range {v1 .. v12}, Ldp/d;->g(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLg2/s;Lc93/m;ILandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
