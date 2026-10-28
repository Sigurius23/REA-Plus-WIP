.class public final synthetic Lsz0/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:J

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lsz0/k0;->w:J

    iput p3, p0, Lsz0/k0;->x:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lsz0/k0;->x:I

    iget-wide v1, p0, Lsz0/k0;->w:J

    invoke-static {v0, v1, v2, p1, p2}, Lsz0/m0;->d(IJLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
