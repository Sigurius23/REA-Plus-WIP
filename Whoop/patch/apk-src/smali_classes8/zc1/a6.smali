.class public final synthetic Lzc1/a6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FFFZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p4, p0, Lzc1/a6;->w:Z

    iput p1, p0, Lzc1/a6;->x:F

    iput p2, p0, Lzc1/a6;->y:F

    iput p3, p0, Lzc1/a6;->z:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-boolean v0, p0, Lzc1/a6;->w:Z

    iget v1, p0, Lzc1/a6;->x:F

    iget v2, p0, Lzc1/a6;->y:F

    iget v3, p0, Lzc1/a6;->z:F

    invoke-static/range {v0 .. v5}, Lzc1/d6;->j(ZFFFLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
