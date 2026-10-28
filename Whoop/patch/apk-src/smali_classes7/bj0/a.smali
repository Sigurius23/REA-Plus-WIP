.class public final synthetic Lbj0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Lm91/o;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lm91/o;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    iput p5, p0, Lbj0/a;->w:I

    iput-object p1, p0, Lbj0/a;->x:Lm91/o;

    iput-object p2, p0, Lbj0/a;->y:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lbj0/a;->z:I

    iput p4, p0, Lbj0/a;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lbj0/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lbj0/a;->x:Lm91/o;

    iget-object v2, p0, Lbj0/a;->y:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lbj0/a;->z:I

    iget v4, p0, Lbj0/a;->E:I

    invoke-static/range {v1 .. v6}, Lzi0/a;->c(Lm91/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lbj0/a;->x:Lm91/o;

    iget-object v1, p0, Lbj0/a;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lbj0/a;->z:I

    iget v3, p0, Lbj0/a;->E:I

    invoke-static/range {v0 .. v5}, Lui0/g;->d(Lm91/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lbj0/a;->x:Lm91/o;

    iget-object v1, p0, Lbj0/a;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lbj0/a;->z:I

    iget v3, p0, Lbj0/a;->E:I

    invoke-static/range {v0 .. v5}, Lcom/whoop/profile/view/ProfileScreenContentKt;->k(Lm91/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lbj0/a;->x:Lm91/o;

    iget-object v1, p0, Lbj0/a;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lbj0/a;->z:I

    iget v3, p0, Lbj0/a;->E:I

    invoke-static/range {v0 .. v5}, Lbj0/b;->c(Lm91/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
