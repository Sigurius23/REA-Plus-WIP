.class public final synthetic Lio2/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lio2/l0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio2/l0;->x:Ljava/util/List;

    iput-object p2, p0, Lio2/l0;->y:Ljava/lang/String;

    iput p3, p0, Lio2/l0;->z:I

    iput-object p4, p0, Lio2/l0;->E:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lio2/l0;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lio2/l0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio2/l0;->x:Ljava/util/List;

    iput-object p2, p0, Lio2/l0;->y:Ljava/lang/String;

    iput-object p3, p0, Lio2/l0;->E:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Lio2/l0;->z:I

    iput p5, p0, Lio2/l0;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lio2/l0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lio2/l0;->y:Ljava/lang/String;

    iget-object v2, p0, Lio2/l0;->x:Ljava/util/List;

    iget v3, p0, Lio2/l0;->z:I

    iget-object v4, p0, Lio2/l0;->E:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Lio2/l0;->F:I

    invoke-static/range {v1 .. v7}, Lsl0/g1;->e(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lio2/l0;->y:Ljava/lang/String;

    iget-object v1, p0, Lio2/l0;->x:Ljava/util/List;

    iget v2, p0, Lio2/l0;->z:I

    iget-object v3, p0, Lio2/l0;->E:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Lio2/l0;->F:I

    invoke-static/range {v0 .. v6}, Lio2/m0;->f(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
