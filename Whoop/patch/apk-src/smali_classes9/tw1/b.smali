.class public final synthetic Ltw1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Luw1/f;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;I)V
    .locals 0

    iput p4, p0, Ltw1/b;->w:I

    iput-object p1, p0, Ltw1/b;->x:Luw1/f;

    iput-object p2, p0, Ltw1/b;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Ltw1/b;->z:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ltw1/b;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Lc0/o;

    move-object v5, p2

    check-cast v5, Leb/q;

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Ltw1/b;->x:Luw1/f;

    iget-object v2, p0, Ltw1/b;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ltw1/b;->z:Lp1/t2;

    invoke-static/range {v1 .. v7}, Lcom/whoop/membership/familyPlan/navigation/a;->b(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Lc0/o;

    move-object v4, p2

    check-cast v4, Leb/q;

    move-object v5, p3

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Ltw1/b;->x:Luw1/f;

    iget-object v1, p0, Ltw1/b;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ltw1/b;->z:Lp1/t2;

    invoke-static/range {v0 .. v6}, Lcom/whoop/membership/familyPlan/navigation/a;->d(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
