.class public final synthetic Ls21/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(IIJJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls21/f;->w:I

    iput p2, p0, Ls21/f;->x:I

    iput-wide p3, p0, Ls21/f;->y:J

    iput-wide p5, p0, Ls21/f;->z:J

    iput p7, p0, Ls21/f;->E:I

    iput p8, p0, Ls21/f;->F:I

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

    iget v0, p0, Ls21/f;->w:I

    iget v1, p0, Ls21/f;->x:I

    iget-wide v2, p0, Ls21/f;->y:J

    iget-wide v4, p0, Ls21/f;->z:J

    iget v6, p0, Ls21/f;->E:I

    iget v7, p0, Ls21/f;->F:I

    invoke-static/range {v0 .. v9}, Ls21/g;->g(IIJJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
