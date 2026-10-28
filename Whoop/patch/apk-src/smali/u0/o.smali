.class public final synthetic Lu0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Z

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:Ljava/util/Map;

.field public final synthetic J:Li2/a0;

.field public final synthetic K:Lu0/z0;

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic w:Ll3/g;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ll3/v0;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Li2/a0;Lu0/z0;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/o;->w:Ll3/g;

    iput-object p2, p0, Lu0/o;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lu0/o;->y:Ll3/v0;

    iput-object p4, p0, Lu0/o;->z:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lu0/o;->E:I

    iput-boolean p6, p0, Lu0/o;->F:Z

    iput p7, p0, Lu0/o;->G:I

    iput p8, p0, Lu0/o;->H:I

    iput-object p9, p0, Lu0/o;->I:Ljava/util/Map;

    iput-object p10, p0, Lu0/o;->J:Li2/a0;

    iput-object p11, p0, Lu0/o;->K:Lu0/z0;

    iput p12, p0, Lu0/o;->L:I

    iput p13, p0, Lu0/o;->M:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lu0/o;->L:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v12

    iget-object v0, p0, Lu0/o;->w:Ll3/g;

    iget-object v1, p0, Lu0/o;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lu0/o;->y:Ll3/v0;

    iget-object v3, p0, Lu0/o;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lu0/o;->E:I

    iget-boolean v5, p0, Lu0/o;->F:Z

    iget v6, p0, Lu0/o;->G:I

    iget v7, p0, Lu0/o;->H:I

    iget-object v8, p0, Lu0/o;->I:Ljava/util/Map;

    iget-object v9, p0, Lu0/o;->J:Li2/a0;

    iget-object v10, p0, Lu0/o;->K:Lu0/z0;

    iget v13, p0, Lu0/o;->M:I

    invoke-static/range {v0 .. v13}, Lq83/g;->a(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Li2/a0;Lu0/z0;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
