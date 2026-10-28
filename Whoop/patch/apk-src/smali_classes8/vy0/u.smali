.class public final synthetic Lvy0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ld0/z1;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ly71/g;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ly71/g;JJZLd0/z1;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvy0/u;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lvy0/u;->x:Ly71/g;

    iput-wide p3, p0, Lvy0/u;->y:J

    iput-wide p5, p0, Lvy0/u;->z:J

    iput-boolean p7, p0, Lvy0/u;->E:Z

    iput-object p8, p0, Lvy0/u;->F:Ld0/z1;

    iput-object p9, p0, Lvy0/u;->G:Lkotlin/jvm/functions/Function1;

    iput p10, p0, Lvy0/u;->H:I

    iput p11, p0, Lvy0/u;->I:I

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

    iget-object v0, p0, Lvy0/u;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lvy0/u;->x:Ly71/g;

    iget-wide v2, p0, Lvy0/u;->y:J

    iget-wide v4, p0, Lvy0/u;->z:J

    iget-boolean v6, p0, Lvy0/u;->E:Z

    iget-object v7, p0, Lvy0/u;->F:Ld0/z1;

    iget-object v8, p0, Lvy0/u;->G:Lkotlin/jvm/functions/Function1;

    iget v9, p0, Lvy0/u;->H:I

    iget v10, p0, Lvy0/u;->I:I

    invoke-static/range {v0 .. v12}, Lvy0/x;->i(Landroidx/compose/ui/Modifier;Ly71/g;JJZLd0/z1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
