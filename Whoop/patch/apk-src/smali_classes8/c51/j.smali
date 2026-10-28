.class public final synthetic Lc51/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc51/s;Li2/s0;Li2/t;FI)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lc51/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc51/j;->z:Ljava/lang/Object;

    iput-object p2, p0, Lc51/j;->E:Ljava/lang/Object;

    iput-object p3, p0, Lc51/j;->F:Ljava/lang/Object;

    iput p4, p0, Lc51/j;->x:F

    iput p5, p0, Lc51/j;->y:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FLjava/lang/Object;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 2
    iput p6, p0, Lc51/j;->w:I

    iput-object p1, p0, Lc51/j;->z:Ljava/lang/Object;

    iput p2, p0, Lc51/j;->x:F

    iput-object p3, p0, Lc51/j;->E:Ljava/lang/Object;

    iput-object p4, p0, Lc51/j;->F:Ljava/lang/Object;

    iput p5, p0, Lc51/j;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lc51/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc51/j;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lc51/j;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/educationModels/StickyButton;

    iget-object v0, p0, Lc51/j;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v2, p0, Lc51/j;->x:F

    iget v5, p0, Lc51/j;->y:I

    invoke-static/range {v1 .. v7}, Lre1/m;->a(Ll0/u;FLcom/whoop/educationModels/StickyButton;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc51/j;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhy0/r1;

    iget-object v0, p0, Lc51/j;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lc51/j;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v2, p0, Lc51/j;->x:F

    iget v5, p0, Lc51/j;->y:I

    invoke-static/range {v1 .. v7}, Lhy0/q1;->a(Lhy0/r1;FLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lc51/j;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc51/s;

    iget-object v0, p0, Lc51/j;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li2/s0;

    iget-object v0, p0, Lc51/j;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Li2/t;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v4, p0, Lc51/j;->x:F

    iget v5, p0, Lc51/j;->y:I

    invoke-static/range {v1 .. v7}, Lc51/k;->f(Lc51/s;Li2/s0;Li2/t;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
