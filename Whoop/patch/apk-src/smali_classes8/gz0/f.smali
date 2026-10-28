.class public final synthetic Lgz0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:Lb2/h;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FFLb2/h;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lgz0/f;->w:F

    iput p2, p0, Lgz0/f;->x:F

    iput-object p3, p0, Lgz0/f;->y:Lb2/h;

    iput p4, p0, Lgz0/f;->z:I

    iput p5, p0, Lgz0/f;->E:I

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

    iget v0, p0, Lgz0/f;->w:F

    iget v1, p0, Lgz0/f;->x:F

    iget-object v2, p0, Lgz0/f;->y:Lb2/h;

    iget v3, p0, Lgz0/f;->z:I

    iget v4, p0, Lgz0/f;->E:I

    invoke-static/range {v0 .. v6}, Lgz0/g;->a(FFLb2/h;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
