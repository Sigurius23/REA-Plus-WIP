.class public final synthetic Lis0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Ll83/e;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;FZLc93/a;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lis0/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lis0/o;->x:I

    iput-object p2, p0, Lis0/o;->y:Ljava/lang/Object;

    iput p3, p0, Lis0/o;->E:F

    iput-boolean p4, p0, Lis0/o;->z:Z

    iput-object p5, p0, Lis0/o;->F:Ll83/e;

    iput p6, p0, Lis0/o;->G:I

    iput p7, p0, Lis0/o;->H:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZFLc93/a;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lis0/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lis0/o;->x:I

    iput-object p2, p0, Lis0/o;->y:Ljava/lang/Object;

    iput-boolean p3, p0, Lis0/o;->z:Z

    iput p4, p0, Lis0/o;->E:F

    iput-object p5, p0, Lis0/o;->F:Ll83/e;

    iput p6, p0, Lis0/o;->G:I

    iput p7, p0, Lis0/o;->H:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;IFZLkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lis0/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis0/o;->y:Ljava/lang/Object;

    iput p2, p0, Lis0/o;->x:I

    iput p3, p0, Lis0/o;->E:F

    iput-boolean p4, p0, Lis0/o;->z:Z

    iput-object p5, p0, Lis0/o;->F:Ll83/e;

    iput p6, p0, Lis0/o;->G:I

    iput p7, p0, Lis0/o;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lis0/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lis0/o;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lis0/o;->F:Ll83/e;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v2, p0, Lis0/o;->x:I

    iget v3, p0, Lis0/o;->E:F

    iget-boolean v4, p0, Lis0/o;->z:Z

    iget v6, p0, Lis0/o;->G:I

    iget v7, p0, Lis0/o;->H:I

    invoke-static/range {v1 .. v9}, Lsl0/z0;->d(Landroidx/compose/ui/Modifier;IFZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lis0/o;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lis0/o;->F:Ll83/e;

    move-object v5, v0

    check-cast v5, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Lis0/o;->x:I

    iget v3, p0, Lis0/o;->E:F

    iget-boolean v4, p0, Lis0/o;->z:Z

    iget v6, p0, Lis0/o;->G:I

    iget v7, p0, Lis0/o;->H:I

    invoke-static/range {v1 .. v9}, Lny0/a;->b(ILjava/lang/String;FZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lis0/o;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lis0/o;->F:Ll83/e;

    move-object v5, v0

    check-cast v5, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Lis0/o;->x:I

    iget v3, p0, Lis0/o;->E:F

    iget-boolean v4, p0, Lis0/o;->z:Z

    iget v6, p0, Lis0/o;->G:I

    iget v7, p0, Lis0/o;->H:I

    invoke-static/range {v1 .. v9}, Lis0/p;->f(ILjava/lang/String;FZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
