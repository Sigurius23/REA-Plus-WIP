.class public final synthetic Lcp0/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:F

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lr51/f;Lb91/a;Li2/x;FLkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcp0/u0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcp0/u0;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcp0/u0;->F:Ljava/lang/Object;

    iput-object p3, p0, Lcp0/u0;->G:Ljava/lang/Object;

    iput-object p4, p0, Lcp0/u0;->H:Ljava/lang/Object;

    iput p5, p0, Lcp0/u0;->y:F

    iput-object p6, p0, Lcp0/u0;->I:Ll83/e;

    iput p7, p0, Lcp0/u0;->z:I

    iput p8, p0, Lcp0/u0;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/ui/Modifier;FLc93/m;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcp0/u0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcp0/u0;->F:Ljava/lang/Object;

    iput-object p2, p0, Lcp0/u0;->G:Ljava/lang/Object;

    iput-object p3, p0, Lcp0/u0;->H:Ljava/lang/Object;

    iput-object p4, p0, Lcp0/u0;->x:Landroidx/compose/ui/Modifier;

    iput p5, p0, Lcp0/u0;->y:F

    iput-object p6, p0, Lcp0/u0;->I:Ll83/e;

    iput p7, p0, Lcp0/u0;->z:I

    iput p8, p0, Lcp0/u0;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lcp0/u0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp0/u0;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lr51/f;

    iget-object v0, p0, Lcp0/u0;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lb91/a;

    iget-object v0, p0, Lcp0/u0;->H:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Li2/x;

    iget-object v0, p0, Lcp0/u0;->I:Ll83/e;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v1, p0, Lcp0/u0;->x:Landroidx/compose/ui/Modifier;

    iget v5, p0, Lcp0/u0;->y:F

    iget v7, p0, Lcp0/u0;->z:I

    iget v8, p0, Lcp0/u0;->E:I

    invoke-static/range {v1 .. v10}, Lr51/e;->c(Landroidx/compose/ui/Modifier;Lr51/f;Lb91/a;Li2/x;FLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcp0/u0;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lcp0/u0;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lcp0/u0;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Lcp0/u0;->I:Ll83/e;

    move-object v6, v0

    check-cast v6, Lc93/m;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v4, p0, Lcp0/u0;->x:Landroidx/compose/ui/Modifier;

    iget v5, p0, Lcp0/u0;->y:F

    iget v7, p0, Lcp0/u0;->z:I

    iget v8, p0, Lcp0/u0;->E:I

    invoke-static/range {v1 .. v10}, Lcp0/x0;->b(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/ui/Modifier;FLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
