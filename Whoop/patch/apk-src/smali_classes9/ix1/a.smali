.class public final synthetic Lix1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/lifecycle/g0;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Lp1/t2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p6, p0, Lix1/a;->w:I

    iput-object p1, p0, Lix1/a;->x:Landroidx/lifecycle/g0;

    iput-object p2, p0, Lix1/a;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lix1/a;->z:Lp1/t2;

    iput-object p4, p0, Lix1/a;->E:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lix1/a;->F:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lix1/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Lc0/o;

    move-object v7, p2

    check-cast v7, Leb/q;

    move-object v8, p3

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lix1/a;->x:Landroidx/lifecycle/g0;

    iget-object v2, p0, Lix1/a;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lix1/a;->z:Lp1/t2;

    iget-object v4, p0, Lix1/a;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lix1/a;->F:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v9}, Lcom/whoop/membership/management/navigation/a;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Lp1/t2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Lc0/o;

    move-object v6, p2

    check-cast v6, Leb/q;

    move-object v7, p3

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lix1/a;->x:Landroidx/lifecycle/g0;

    iget-object v1, p0, Lix1/a;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lix1/a;->z:Lp1/t2;

    iget-object v3, p0, Lix1/a;->E:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lix1/a;->F:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v8}, Lcom/whoop/membership/management/navigation/a;->d(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Lp1/t2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
