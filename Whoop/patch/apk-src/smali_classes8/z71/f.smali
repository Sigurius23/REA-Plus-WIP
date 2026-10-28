.class public final synthetic Lz71/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:Li2/t;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FFLi2/t;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz71/f;->w:F

    iput p2, p0, Lz71/f;->x:F

    iput-object p3, p0, Lz71/f;->y:Li2/t;

    iput p4, p0, Lz71/f;->z:I

    iput p5, p0, Lz71/f;->E:I

    iput p6, p0, Lz71/f;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v0, p0, Lz71/f;->w:F

    iget v1, p0, Lz71/f;->x:F

    iget-object v2, p0, Lz71/f;->y:Li2/t;

    iget v3, p0, Lz71/f;->z:I

    iget v4, p0, Lz71/f;->E:I

    iget v5, p0, Lz71/f;->F:I

    invoke-static/range {v0 .. v7}, Lz71/l;->l(FFLi2/t;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
