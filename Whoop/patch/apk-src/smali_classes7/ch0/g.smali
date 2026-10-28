.class public final synthetic Lch0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZFLkotlin/jvm/functions/Function1;Li93/f;ILc93/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lch0/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/g;->x:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lch0/g;->y:Z

    iput p3, p0, Lch0/g;->z:F

    iput-object p4, p0, Lch0/g;->F:Ljava/lang/Object;

    iput-object p5, p0, Lch0/g;->G:Ljava/lang/Object;

    iput p6, p0, Lch0/g;->E:I

    iput-object p7, p0, Lch0/g;->H:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lch0/v0;Lzg0/i;Landroidx/compose/ui/Modifier;Lf0/r1;FZI)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lch0/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/g;->F:Ljava/lang/Object;

    iput-object p2, p0, Lch0/g;->G:Ljava/lang/Object;

    iput-object p3, p0, Lch0/g;->x:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lch0/g;->H:Ljava/lang/Object;

    iput p5, p0, Lch0/g;->z:F

    iput-boolean p6, p0, Lch0/g;->y:Z

    iput p7, p0, Lch0/g;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lch0/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/g;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lch0/g;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Li93/f;

    iget-object v0, p0, Lch0/g;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lch0/g;->x:Landroidx/compose/ui/Modifier;

    iget-boolean v2, p0, Lch0/g;->y:Z

    iget v3, p0, Lch0/g;->z:F

    iget v6, p0, Lch0/g;->E:I

    invoke-static/range {v1 .. v9}, Lhy0/k2;->a(Landroidx/compose/ui/Modifier;ZFLkotlin/jvm/functions/Function1;Li93/f;ILc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch0/g;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lch0/v0;

    iget-object v0, p0, Lch0/g;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzg0/i;

    iget-object v0, p0, Lch0/g;->H:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lf0/r1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v3, p0, Lch0/g;->x:Landroidx/compose/ui/Modifier;

    iget v5, p0, Lch0/g;->z:F

    iget-boolean v6, p0, Lch0/g;->y:Z

    iget v7, p0, Lch0/g;->E:I

    invoke-static/range {v1 .. v9}, Lch0/n;->c(Lch0/v0;Lzg0/i;Landroidx/compose/ui/Modifier;Lf0/r1;FZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
