.class public final synthetic Lbp0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;FLjava/lang/Object;Ll83/e;I)V
    .locals 0

    iput p6, p0, Lbp0/l;->w:I

    iput-object p1, p0, Lbp0/l;->y:Ljava/lang/Object;

    iput-object p2, p0, Lbp0/l;->z:Ljava/lang/Object;

    iput p3, p0, Lbp0/l;->x:F

    iput-object p4, p0, Lbp0/l;->E:Ljava/lang/Object;

    iput-object p5, p0, Lbp0/l;->F:Ll83/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lbp0/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbp0/l;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbn0/e;

    iget-object v0, p0, Lbp0/l;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbp0/l;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbp0/l;->F:Ll83/e;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v3, p0, Lbp0/l;->x:F

    invoke-static/range {v1 .. v8}, Ldn0/p;->d(Lbn0/e;Lkotlin/jvm/functions/Function1;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbp0/l;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lbp0/l;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lvy0/j0;

    iget-object v0, p0, Lbp0/l;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    iget-object v0, p0, Lbp0/l;->F:Ll83/e;

    move-object v5, v0

    check-cast v5, Lc93/a;

    move-object v6, p1

    check-cast v6, Ll0/s1;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v3, p0, Lbp0/l;->x:F

    invoke-static/range {v1 .. v8}, Lbp0/s;->a(Landroidx/compose/ui/Modifier;Lvy0/j0;FLcom/whoop/coacheverywherecommon/models/CoachEntry;Lc93/a;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
