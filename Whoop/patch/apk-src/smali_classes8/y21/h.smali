.class public final synthetic Ly21/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:J

.field public final synthetic G:Landroidx/compose/ui/Modifier;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:Lc93/a;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FFFIIJLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly21/h;->w:F

    iput p2, p0, Ly21/h;->x:F

    iput p3, p0, Ly21/h;->y:F

    iput p4, p0, Ly21/h;->z:I

    iput p5, p0, Ly21/h;->E:I

    iput-wide p6, p0, Ly21/h;->F:J

    iput-object p8, p0, Ly21/h;->G:Landroidx/compose/ui/Modifier;

    iput-object p9, p0, Ly21/h;->H:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Ly21/h;->I:Lc93/a;

    iput p11, p0, Ly21/h;->J:I

    iput p12, p0, Ly21/h;->K:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget v0, p0, Ly21/h;->w:F

    iget v1, p0, Ly21/h;->x:F

    iget v2, p0, Ly21/h;->y:F

    iget v3, p0, Ly21/h;->z:I

    iget v4, p0, Ly21/h;->E:I

    iget-wide v5, p0, Ly21/h;->F:J

    iget-object v7, p0, Ly21/h;->G:Landroidx/compose/ui/Modifier;

    iget-object v8, p0, Ly21/h;->H:Lkotlin/jvm/functions/Function1;

    iget-object v9, p0, Ly21/h;->I:Lc93/a;

    iget v10, p0, Ly21/h;->J:I

    iget v11, p0, Ly21/h;->K:I

    invoke-static/range {v0 .. v13}, Ly21/i;->l(FFFIIJLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
