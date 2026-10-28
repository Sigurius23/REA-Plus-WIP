.class public final synthetic Lg40/c4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:Lg2/s;

.field public final synthetic I:Z

.field public final synthetic J:Z

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:Lg40/m3;

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Lg40/m3;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILg2/s;ZZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/c4;->w:Lg40/m3;

    iput-boolean p2, p0, Lg40/c4;->x:Z

    iput p3, p0, Lg40/c4;->y:I

    iput-object p4, p0, Lg40/c4;->z:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lg40/c4;->E:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Lg40/c4;->F:I

    iput p7, p0, Lg40/c4;->G:I

    iput-object p8, p0, Lg40/c4;->H:Lg2/s;

    iput-boolean p9, p0, Lg40/c4;->I:Z

    iput-boolean p10, p0, Lg40/c4;->J:Z

    iput p11, p0, Lg40/c4;->K:I

    iput p12, p0, Lg40/c4;->L:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg40/c4;->K:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-object v0, p0, Lg40/c4;->w:Lg40/m3;

    iget-boolean v1, p0, Lg40/c4;->x:Z

    iget v2, p0, Lg40/c4;->y:I

    iget-object v3, p0, Lg40/c4;->z:Landroidx/compose/ui/Modifier;

    iget-object v4, p0, Lg40/c4;->E:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Lg40/c4;->F:I

    iget v6, p0, Lg40/c4;->G:I

    iget-object v7, p0, Lg40/c4;->H:Lg2/s;

    iget-boolean v8, p0, Lg40/c4;->I:Z

    iget-boolean v9, p0, Lg40/c4;->J:Z

    iget v12, p0, Lg40/c4;->L:I

    invoke-static/range {v0 .. v12}, Lg40/j4;->c(Lg40/m3;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILg2/s;ZZLandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
