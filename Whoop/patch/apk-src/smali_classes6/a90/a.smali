.class public final synthetic La90/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lc93/r;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Lg80/f;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;III)V
    .locals 0

    iput p8, p0, La90/a;->w:I

    iput-object p1, p0, La90/a;->x:Lg80/f;

    iput-object p2, p0, La90/a;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La90/a;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La90/a;->E:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La90/a;->F:Lc93/r;

    iput p6, p0, La90/a;->G:I

    iput p7, p0, La90/a;->H:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, La90/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, La90/a;->x:Lg80/f;

    iget-object v2, p0, La90/a;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, La90/a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, La90/a;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, La90/a;->F:Lc93/r;

    iget v6, p0, La90/a;->G:I

    iget v7, p0, La90/a;->H:I

    invoke-static/range {v1 .. v9}, Ly80/b;->d(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, La90/a;->x:Lg80/f;

    iget-object v1, p0, La90/a;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, La90/a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, La90/a;->E:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, La90/a;->F:Lc93/r;

    iget v5, p0, La90/a;->G:I

    iget v6, p0, La90/a;->H:I

    invoke-static/range {v0 .. v8}, La90/b;->d(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
