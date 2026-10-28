.class public final synthetic Lez0/a;
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

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FIILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lez0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lez0/a;->z:F

    iput p2, p0, Lez0/a;->E:I

    iput p3, p0, Lez0/a;->F:I

    iput-object p4, p0, Lez0/a;->x:Ljava/lang/Object;

    iput-boolean p5, p0, Lez0/a;->y:Z

    iput-object p6, p0, Lez0/a;->G:Ljava/lang/Object;

    iput-object p7, p0, Lez0/a;->H:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lf51/a;ZFLc93/a;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lez0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lez0/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Lez0/a;->G:Ljava/lang/Object;

    iput-boolean p3, p0, Lez0/a;->y:Z

    iput p4, p0, Lez0/a;->z:F

    iput-object p5, p0, Lez0/a;->H:Ljava/lang/Object;

    iput p6, p0, Lez0/a;->E:I

    iput p7, p0, Lez0/a;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFII)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lez0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lez0/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Lez0/a;->G:Ljava/lang/Object;

    iput-object p3, p0, Lez0/a;->H:Ljava/lang/Object;

    iput-boolean p4, p0, Lez0/a;->y:Z

    iput p5, p0, Lez0/a;->z:F

    iput p6, p0, Lez0/a;->E:I

    iput p7, p0, Lez0/a;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lez0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lez0/a;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    iget-object v0, p0, Lez0/a;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lez0/a;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lp1/c1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Lez0/a;->z:F

    iget v2, p0, Lez0/a;->E:I

    iget v3, p0, Lez0/a;->F:I

    iget-boolean v5, p0, Lez0/a;->y:Z

    invoke-static/range {v1 .. v9}, Lw71/s;->g(FIILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lez0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lez0/a;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lf51/a;

    iget-object v0, p0, Lez0/a;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v3, p0, Lez0/a;->y:Z

    iget v4, p0, Lez0/a;->z:F

    iget v6, p0, Lez0/a;->E:I

    iget v7, p0, Lez0/a;->F:I

    invoke-static/range {v1 .. v9}, Lf51/d;->e(Landroidx/compose/ui/Modifier;Lf51/a;ZFLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lez0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lez0/a;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li91/a;

    iget-object v0, p0, Lez0/a;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lk91/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v4, p0, Lez0/a;->y:Z

    iget v5, p0, Lez0/a;->z:F

    iget v6, p0, Lez0/a;->E:I

    iget v7, p0, Lez0/a;->F:I

    invoke-static/range {v1 .. v9}, Lez0/b;->c(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
