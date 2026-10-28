.class public final synthetic Lz71/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Li2/t;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FFFFLi2/t;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz71/j;->w:F

    iput p2, p0, Lz71/j;->x:F

    iput p3, p0, Lz71/j;->y:F

    iput p4, p0, Lz71/j;->z:F

    iput-object p5, p0, Lz71/j;->E:Li2/t;

    iput p6, p0, Lz71/j;->F:I

    iput p7, p0, Lz71/j;->G:I

    iput p8, p0, Lz71/j;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v0, p0, Lz71/j;->w:F

    iget v1, p0, Lz71/j;->x:F

    iget v2, p0, Lz71/j;->y:F

    iget v3, p0, Lz71/j;->z:F

    iget-object v4, p0, Lz71/j;->E:Li2/t;

    iget v5, p0, Lz71/j;->F:I

    iget v6, p0, Lz71/j;->G:I

    iget v7, p0, Lz71/j;->H:I

    invoke-static/range {v0 .. v9}, Lz71/l;->e(FFFFLi2/t;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
