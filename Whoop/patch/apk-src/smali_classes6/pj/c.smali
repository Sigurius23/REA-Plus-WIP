.class public final Lpj/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic G:F

.field public final synthetic H:Lp3/r;

.field public final synthetic I:Landroid/graphics/Typeface;

.field public final synthetic J:J

.field public final synthetic K:Lkotlin/jvm/functions/Function1;

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;JJIFLp3/r;Landroid/graphics/Typeface;JLkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput-object p1, p0, Lpj/c;->w:Ljava/lang/String;

    iput-object p2, p0, Lpj/c;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lpj/c;->y:Ljava/lang/String;

    iput-wide p4, p0, Lpj/c;->z:J

    iput-wide p6, p0, Lpj/c;->E:J

    iput p8, p0, Lpj/c;->F:I

    iput p9, p0, Lpj/c;->G:F

    iput-object p10, p0, Lpj/c;->H:Lp3/r;

    iput-object p11, p0, Lpj/c;->I:Landroid/graphics/Typeface;

    iput-wide p12, p0, Lpj/c;->J:J

    iput-object p14, p0, Lpj/c;->K:Lkotlin/jvm/functions/Function1;

    iput p15, p0, Lpj/c;->L:I

    move/from16 p1, p16

    iput p1, p0, Lpj/c;->M:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    iget v1, v0, Lpj/c;->L:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v16

    iget v1, v0, Lpj/c;->M:I

    move/from16 v17, v1

    iget-object v1, v0, Lpj/c;->w:Ljava/lang/String;

    iget-object v2, v0, Lpj/c;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Lpj/c;->y:Ljava/lang/String;

    iget-wide v4, v0, Lpj/c;->z:J

    iget-wide v6, v0, Lpj/c;->E:J

    iget v8, v0, Lpj/c;->F:I

    iget v9, v0, Lpj/c;->G:F

    iget-object v10, v0, Lpj/c;->H:Lp3/r;

    iget-object v11, v0, Lpj/c;->I:Landroid/graphics/Typeface;

    iget-wide v12, v0, Lpj/c;->J:J

    iget-object v14, v0, Lpj/c;->K:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v17}, Lup/d;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;JJIFLp3/r;Landroid/graphics/Typeface;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
