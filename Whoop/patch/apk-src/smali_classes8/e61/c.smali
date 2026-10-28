.class public final synthetic Le61/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:F

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IFLc93/a;Lc93/a;Landroidx/compose/ui/Modifier;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Le61/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Le61/c;->x:I

    iput p2, p0, Le61/c;->y:F

    iput-object p3, p0, Le61/c;->G:Ljava/lang/Object;

    iput-object p4, p0, Le61/c;->H:Ljava/lang/Object;

    iput-object p5, p0, Le61/c;->z:Ljava/lang/Object;

    iput p6, p0, Le61/c;->E:I

    iput p7, p0, Le61/c;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;FILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Le61/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le61/c;->z:Ljava/lang/Object;

    iput p2, p0, Le61/c;->y:F

    iput p3, p0, Le61/c;->x:I

    iput-object p4, p0, Le61/c;->G:Ljava/lang/Object;

    iput-object p5, p0, Le61/c;->H:Ljava/lang/Object;

    iput p6, p0, Le61/c;->E:I

    iput p7, p0, Le61/c;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;FLi93/f;ILkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Le61/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le61/c;->z:Ljava/lang/Object;

    iput p2, p0, Le61/c;->y:F

    iput-object p3, p0, Le61/c;->G:Ljava/lang/Object;

    iput p4, p0, Le61/c;->x:I

    iput-object p5, p0, Le61/c;->H:Ljava/lang/Object;

    iput p6, p0, Le61/c;->E:I

    iput p7, p0, Le61/c;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Le61/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le61/c;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Le61/c;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Li93/f;

    iget-object v0, p0, Le61/c;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v2, p0, Le61/c;->y:F

    iget v4, p0, Le61/c;->x:I

    iget v6, p0, Le61/c;->E:I

    iget v7, p0, Le61/c;->F:I

    invoke-static/range {v1 .. v9}, Lzc1/d6;->s(Ljava/lang/String;FLi93/f;ILkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Le61/c;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Le61/c;->H:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, Le61/c;->z:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Le61/c;->x:I

    iget v2, p0, Le61/c;->y:F

    iget v6, p0, Le61/c;->E:I

    iget v7, p0, Le61/c;->F:I

    invoke-static/range {v1 .. v9}, Le81/p;->b(IFLc93/a;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Le61/c;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Le61/c;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Le61/c;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/whoop/design/util/TextResource;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v2, p0, Le61/c;->y:F

    iget v3, p0, Le61/c;->x:I

    iget v6, p0, Le61/c;->E:I

    iget v7, p0, Le61/c;->F:I

    invoke-static/range {v1 .. v9}, Le61/d;->a(Landroidx/compose/ui/Modifier;FILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
