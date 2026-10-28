.class public final synthetic Lis0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:F

.field public final synthetic G:Lis0/a0;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:Lj0/i;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lis0/s0;

.field public final synthetic y:F

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lis0/s0;FZFFLis0/a0;Lkotlin/jvm/functions/Function1;Lj0/i;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis0/n;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lis0/n;->x:Lis0/s0;

    iput p3, p0, Lis0/n;->y:F

    iput-boolean p4, p0, Lis0/n;->z:Z

    iput p5, p0, Lis0/n;->E:F

    iput p6, p0, Lis0/n;->F:F

    iput-object p7, p0, Lis0/n;->G:Lis0/a0;

    iput-object p8, p0, Lis0/n;->H:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lis0/n;->I:Lj0/i;

    iput p10, p0, Lis0/n;->J:I

    iput p11, p0, Lis0/n;->K:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Lis0/n;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lis0/n;->x:Lis0/s0;

    iget v2, p0, Lis0/n;->y:F

    iget-boolean v3, p0, Lis0/n;->z:Z

    iget v4, p0, Lis0/n;->E:F

    iget v5, p0, Lis0/n;->F:F

    iget-object v6, p0, Lis0/n;->G:Lis0/a0;

    iget-object v7, p0, Lis0/n;->H:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Lis0/n;->I:Lj0/i;

    iget v9, p0, Lis0/n;->J:I

    iget v10, p0, Lis0/n;->K:I

    invoke-static/range {v0 .. v12}, Lis0/p;->e(Landroidx/compose/ui/Modifier;Lis0/s0;FZFFLis0/a0;Lkotlin/jvm/functions/Function1;Lj0/i;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
