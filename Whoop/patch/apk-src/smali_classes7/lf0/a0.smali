.class public final synthetic Llf0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(IIILandroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput p3, p0, Llf0/a0;->w:I

    iput-object p4, p0, Llf0/a0;->x:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Llf0/a0;->y:Ljava/lang/String;

    iput-object p6, p0, Llf0/a0;->z:Ljava/util/List;

    iput-object p7, p0, Llf0/a0;->E:Lkotlin/jvm/functions/Function1;

    iput p1, p0, Llf0/a0;->F:I

    iput p2, p0, Llf0/a0;->G:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Llf0/a0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Llf0/a0;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Llf0/a0;->y:Ljava/lang/String;

    iget-object v3, p0, Llf0/a0;->z:Ljava/util/List;

    iget-object v4, p0, Llf0/a0;->E:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Llf0/a0;->F:I

    iget v6, p0, Llf0/a0;->G:I

    invoke-static/range {v1 .. v8}, Llf0/b0;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Llf0/a0;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Llf0/a0;->y:Ljava/lang/String;

    iget-object v2, p0, Llf0/a0;->z:Ljava/util/List;

    iget-object v3, p0, Llf0/a0;->E:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Llf0/a0;->F:I

    iget v5, p0, Llf0/a0;->G:I

    invoke-static/range {v0 .. v7}, Llf0/b0;->j(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
