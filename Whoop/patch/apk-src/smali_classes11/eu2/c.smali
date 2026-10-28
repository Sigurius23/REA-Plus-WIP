.class public final synthetic Leu2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lin2/e;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Ln0/u;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroidx/compose/ui/Modifier;Ln0/u;Lin2/e;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Leu2/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leu2/c;->x:Ljava/util/List;

    iput-object p2, p0, Leu2/c;->y:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Leu2/c;->z:Ln0/u;

    iput-object p4, p0, Leu2/c;->E:Lin2/e;

    iput-object p5, p0, Leu2/c;->F:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Leu2/c;->G:I

    iput p7, p0, Leu2/c;->H:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ln0/u;Lin2/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Leu2/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leu2/c;->x:Ljava/util/List;

    iput-object p2, p0, Leu2/c;->z:Ln0/u;

    iput-object p3, p0, Leu2/c;->E:Lin2/e;

    iput-object p4, p0, Leu2/c;->y:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Leu2/c;->F:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Leu2/c;->G:I

    iput p7, p0, Leu2/c;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Leu2/c;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Leu2/c;->x:Ljava/util/List;

    iget-object v2, p0, Leu2/c;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Leu2/c;->z:Ln0/u;

    iget-object v4, p0, Leu2/c;->E:Lin2/e;

    iget-object v5, p0, Leu2/c;->F:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Leu2/c;->G:I

    iget v7, p0, Leu2/c;->H:I

    invoke-static/range {v1 .. v9}, Leu2/g;->a(Ljava/util/List;Landroidx/compose/ui/Modifier;Ln0/u;Lin2/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Leu2/c;->x:Ljava/util/List;

    iget-object v1, p0, Leu2/c;->y:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Leu2/c;->z:Ln0/u;

    iget-object v3, p0, Leu2/c;->E:Lin2/e;

    iget-object v4, p0, Leu2/c;->F:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Leu2/c;->G:I

    iget v6, p0, Leu2/c;->H:I

    invoke-static/range {v0 .. v8}, Leu2/g;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;Ln0/u;Lin2/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
