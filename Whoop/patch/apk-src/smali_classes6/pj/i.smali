.class public final Lpj/i;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:F

.field public final synthetic G:Lp3/r;

.field public final synthetic H:Landroid/graphics/Typeface;

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJIFLp3/r;Landroid/graphics/Typeface;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput-object p1, p0, Lpj/i;->w:Ljava/lang/String;

    iput-object p2, p0, Lpj/i;->x:Landroidx/compose/ui/Modifier;

    iput-wide p3, p0, Lpj/i;->y:J

    iput-wide p5, p0, Lpj/i;->z:J

    iput p7, p0, Lpj/i;->E:I

    iput p8, p0, Lpj/i;->F:F

    iput-object p9, p0, Lpj/i;->G:Lp3/r;

    iput-object p10, p0, Lpj/i;->H:Landroid/graphics/Typeface;

    iput-object p11, p0, Lpj/i;->I:Lkotlin/jvm/functions/Function1;

    iput p12, p0, Lpj/i;->J:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lpj/i;->J:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v12

    iget-object v0, p0, Lpj/i;->w:Ljava/lang/String;

    iget-object v1, p0, Lpj/i;->x:Landroidx/compose/ui/Modifier;

    iget-wide v2, p0, Lpj/i;->y:J

    iget-wide v4, p0, Lpj/i;->z:J

    iget v6, p0, Lpj/i;->E:I

    iget v7, p0, Lpj/i;->F:F

    iget-object v8, p0, Lpj/i;->G:Lp3/r;

    iget-object v9, p0, Lpj/i;->H:Landroid/graphics/Typeface;

    iget-object v10, p0, Lpj/i;->I:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v12}, Lvd/e;->d(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJIFLp3/r;Landroid/graphics/Typeface;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
