.class public final synthetic Lc41/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc41/o0;->w:I

    iput-wide p3, p0, Lc41/o0;->x:J

    iput p2, p0, Lc41/o0;->y:I

    iput p5, p0, Lc41/o0;->z:I

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

    iget v0, p0, Lc41/o0;->w:I

    iget-wide v1, p0, Lc41/o0;->x:J

    iget v3, p0, Lc41/o0;->y:I

    iget v4, p0, Lc41/o0;->z:I

    invoke-static/range {v0 .. v6}, Lc41/q0;->k(IJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
