.class public final synthetic Lej1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lm91/u;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(IIILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lm91/u;)V
    .locals 0

    .line 1
    iput p3, p0, Lej1/p;->w:I

    iput-object p4, p0, Lej1/p;->x:Landroidx/compose/ui/Modifier;

    iput-object p6, p0, Lej1/p;->y:Lm91/u;

    iput-object p5, p0, Lej1/p;->z:Lkotlin/jvm/functions/Function1;

    iput p1, p0, Lej1/p;->E:I

    iput p2, p0, Lej1/p;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;II)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lej1/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lej1/p;->y:Lm91/u;

    iput-object p2, p0, Lej1/p;->z:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lej1/p;->x:Landroidx/compose/ui/Modifier;

    iput p4, p0, Lej1/p;->E:I

    iput p5, p0, Lej1/p;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lej1/p;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lej1/p;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lej1/p;->y:Lm91/u;

    iget-object v3, p0, Lej1/p;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lej1/p;->E:I

    iget v5, p0, Lej1/p;->F:I

    invoke-static/range {v1 .. v7}, Lzi1/v;->c(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lej1/p;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lej1/p;->y:Lm91/u;

    iget-object v2, p0, Lej1/p;->z:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lej1/p;->E:I

    iget v4, p0, Lej1/p;->F:I

    invoke-static/range {v0 .. v6}, Lkm2/c;->d(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lej1/p;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lej1/p;->y:Lm91/u;

    iget-object v2, p0, Lej1/p;->z:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lej1/p;->E:I

    iget v4, p0, Lej1/p;->F:I

    invoke-static/range {v0 .. v6}, Lej1/q;->a(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
