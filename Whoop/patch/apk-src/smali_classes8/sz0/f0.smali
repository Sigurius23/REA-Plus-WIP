.class public final synthetic Lsz0/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIILandroidx/compose/ui/Modifier;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lsz0/f0;->w:I

    iput-boolean p5, p0, Lsz0/f0;->x:Z

    iput-object p4, p0, Lsz0/f0;->y:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lsz0/f0;->z:I

    iput p3, p0, Lsz0/f0;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v0, p0, Lsz0/f0;->w:I

    iget-boolean v1, p0, Lsz0/f0;->x:Z

    iget-object v2, p0, Lsz0/f0;->y:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lsz0/f0;->z:I

    iget v4, p0, Lsz0/f0;->E:I

    invoke-static/range {v0 .. v6}, Lsz0/g0;->e(IZLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
