.class public final synthetic Lsz0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lsz0/c0;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lsz0/c0;IIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsz0/a0;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lsz0/a0;->x:Lsz0/c0;

    iput p3, p0, Lsz0/a0;->y:I

    iput p4, p0, Lsz0/a0;->z:I

    iput p5, p0, Lsz0/a0;->E:I

    iput p6, p0, Lsz0/a0;->F:I

    iput p7, p0, Lsz0/a0;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lsz0/a0;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lsz0/a0;->x:Lsz0/c0;

    iget v2, p0, Lsz0/a0;->y:I

    iget v3, p0, Lsz0/a0;->z:I

    iget v4, p0, Lsz0/a0;->E:I

    iget v5, p0, Lsz0/a0;->F:I

    iget v6, p0, Lsz0/a0;->G:I

    invoke-static/range {v0 .. v8}, Lsz0/b0;->c(Landroidx/compose/ui/Modifier;Lsz0/c0;IIIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
