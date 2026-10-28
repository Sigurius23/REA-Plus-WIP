.class public final synthetic Lst1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FFII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lst1/b;->w:F

    iput p2, p0, Lst1/b;->x:F

    iput p3, p0, Lst1/b;->y:I

    iput p4, p0, Lst1/b;->z:I

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

    iget v0, p0, Lst1/b;->w:F

    iget v1, p0, Lst1/b;->x:F

    iget v2, p0, Lst1/b;->y:I

    iget v3, p0, Lst1/b;->z:I

    invoke-static/range {v0 .. v5}, Lst1/c;->b(FFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
