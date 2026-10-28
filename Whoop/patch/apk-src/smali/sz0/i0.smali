.class public final synthetic Lsz0/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lsz0/p0;

.field public final synthetic x:J

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lsz0/p0;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsz0/i0;->w:Lsz0/p0;

    iput-wide p2, p0, Lsz0/i0;->x:J

    iput p4, p0, Lsz0/i0;->y:I

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

    iget-object v0, p0, Lsz0/i0;->w:Lsz0/p0;

    iget-wide v1, p0, Lsz0/i0;->x:J

    iget v3, p0, Lsz0/i0;->y:I

    invoke-static/range {v0 .. v5}, Lsz0/m0;->n(Lsz0/p0;JILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
