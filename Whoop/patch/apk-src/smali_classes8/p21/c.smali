.class public final synthetic Lp21/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:J

.field public final synthetic x:J

.field public final synthetic y:I

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(JJIFII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lp21/c;->w:J

    iput-wide p3, p0, Lp21/c;->x:J

    iput p5, p0, Lp21/c;->y:I

    iput p6, p0, Lp21/c;->z:F

    iput p7, p0, Lp21/c;->E:I

    iput p8, p0, Lp21/c;->F:I

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

    iget-wide v0, p0, Lp21/c;->w:J

    iget-wide v2, p0, Lp21/c;->x:J

    iget v4, p0, Lp21/c;->y:I

    iget v5, p0, Lp21/c;->z:F

    iget v6, p0, Lp21/c;->E:I

    iget v7, p0, Lp21/c;->F:I

    invoke-static/range {v0 .. v9}, Lp21/e;->e(JJIFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
