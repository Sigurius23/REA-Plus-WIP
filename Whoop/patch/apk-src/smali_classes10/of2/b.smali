.class public final synthetic Lof2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lof2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lof2/b;->y:Ljava/lang/Object;

    iput-object p2, p0, Lof2/b;->z:Ljava/lang/Object;

    iput-object p3, p0, Lof2/b;->x:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Lnj2/b;Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lof2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lof2/b;->y:Ljava/lang/Object;

    iput-object p2, p0, Lof2/b;->x:Lp1/c1;

    iput-object p3, p0, Lof2/b;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lof2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lof2/b;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnj2/b;

    iget-object v0, p0, Lof2/b;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/a;

    move-object v5, p2

    check-cast v5, Lcom/whoop/stress/domain/model/StressCustomizationDrawerItem;

    move-object v6, p3

    check-cast v6, Lf31/a;

    move-object v7, p4

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v2, p0, Lof2/b;->x:Lp1/c1;

    invoke-static/range {v1 .. v8}, Lpj2/q;->t(Lnj2/b;Lp1/c1;Lp1/c1;Landroidx/compose/foundation/lazy/a;Lcom/whoop/stress/domain/model/StressCustomizationDrawerItem;Lf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lof2/b;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lof2/b;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move-object v6, p3

    check-cast v6, Lf31/a;

    move-object v7, p4

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v3, p0, Lof2/b;->x:Lp1/c1;

    invoke-static/range {v1 .. v8}, Lof2/c;->c(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
