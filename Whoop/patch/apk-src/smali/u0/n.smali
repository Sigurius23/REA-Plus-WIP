.class public final synthetic Lu0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Z

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:Li2/a0;

.field public final synthetic J:Lu0/z0;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ll3/v0;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILi2/a0;Lu0/z0;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/n;->w:Ljava/lang/String;

    iput-object p2, p0, Lu0/n;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lu0/n;->y:Ll3/v0;

    iput-object p4, p0, Lu0/n;->z:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lu0/n;->E:I

    iput-boolean p6, p0, Lu0/n;->F:Z

    iput p7, p0, Lu0/n;->G:I

    iput p8, p0, Lu0/n;->H:I

    iput-object p9, p0, Lu0/n;->I:Li2/a0;

    iput-object p10, p0, Lu0/n;->J:Lu0/z0;

    iput p11, p0, Lu0/n;->K:I

    iput p12, p0, Lu0/n;->L:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lu0/n;->K:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-object v0, p0, Lu0/n;->w:Ljava/lang/String;

    iget-object v1, p0, Lu0/n;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lu0/n;->y:Ll3/v0;

    iget-object v3, p0, Lu0/n;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lu0/n;->E:I

    iget-boolean v5, p0, Lu0/n;->F:Z

    iget v6, p0, Lu0/n;->G:I

    iget v7, p0, Lu0/n;->H:I

    iget-object v8, p0, Lu0/n;->I:Li2/a0;

    iget-object v9, p0, Lu0/n;->J:Lu0/z0;

    iget v12, p0, Lu0/n;->L:I

    invoke-static/range {v0 .. v12}, Lq83/g;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILi2/a0;Lu0/z0;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
