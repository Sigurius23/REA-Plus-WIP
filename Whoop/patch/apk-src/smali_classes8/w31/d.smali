.class public final synthetic Lw31/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Lg1/n7;

.field public final synthetic G:Lgz0/m0;

.field public final synthetic H:J

.field public final synthetic I:J

.field public final synthetic J:Lkotlin/jvm/functions/Function3;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:F

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;FZZLc93/a;Lg1/n7;Lgz0/m0;JJLkotlin/jvm/functions/Function3;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw31/d;->w:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lw31/d;->x:F

    iput-boolean p3, p0, Lw31/d;->y:Z

    iput-boolean p4, p0, Lw31/d;->z:Z

    iput-object p5, p0, Lw31/d;->E:Lc93/a;

    iput-object p6, p0, Lw31/d;->F:Lg1/n7;

    iput-object p7, p0, Lw31/d;->G:Lgz0/m0;

    iput-wide p8, p0, Lw31/d;->H:J

    iput-wide p10, p0, Lw31/d;->I:J

    iput-object p12, p0, Lw31/d;->J:Lkotlin/jvm/functions/Function3;

    iput p13, p0, Lw31/d;->K:I

    iput p14, p0, Lw31/d;->L:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v1, v0, Lw31/d;->w:Landroidx/compose/ui/Modifier;

    iget v2, v0, Lw31/d;->x:F

    iget-boolean v3, v0, Lw31/d;->y:Z

    iget-boolean v4, v0, Lw31/d;->z:Z

    iget-object v5, v0, Lw31/d;->E:Lc93/a;

    iget-object v6, v0, Lw31/d;->F:Lg1/n7;

    iget-object v7, v0, Lw31/d;->G:Lgz0/m0;

    iget-wide v8, v0, Lw31/d;->H:J

    iget-wide v10, v0, Lw31/d;->I:J

    iget-object v12, v0, Lw31/d;->J:Lkotlin/jvm/functions/Function3;

    iget v13, v0, Lw31/d;->K:I

    iget v14, v0, Lw31/d;->L:I

    invoke-static/range {v1 .. v16}, Lw31/e;->b(Landroidx/compose/ui/Modifier;FZZLc93/a;Lg1/n7;Lgz0/m0;JJLkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
