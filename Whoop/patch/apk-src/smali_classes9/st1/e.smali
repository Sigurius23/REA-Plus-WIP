.class public final synthetic Lst1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:F

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:J

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FFJFFFII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lst1/e;->w:F

    iput p2, p0, Lst1/e;->x:F

    iput-wide p3, p0, Lst1/e;->y:J

    iput p5, p0, Lst1/e;->z:F

    iput p6, p0, Lst1/e;->E:F

    iput p7, p0, Lst1/e;->F:F

    iput p8, p0, Lst1/e;->G:I

    iput p9, p0, Lst1/e;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v0, p0, Lst1/e;->w:F

    iget v1, p0, Lst1/e;->x:F

    iget-wide v2, p0, Lst1/e;->y:J

    iget v4, p0, Lst1/e;->z:F

    iget v5, p0, Lst1/e;->E:F

    iget v6, p0, Lst1/e;->F:F

    iget v7, p0, Lst1/e;->G:I

    iget v8, p0, Lst1/e;->H:I

    invoke-static/range {v0 .. v10}, Lst1/f;->a(FFJFFFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
