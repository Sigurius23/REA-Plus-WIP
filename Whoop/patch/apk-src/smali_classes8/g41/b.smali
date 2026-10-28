.class public final synthetic Lg41/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:J

.field public final synthetic x:F

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(JFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lg41/b;->w:J

    iput p3, p0, Lg41/b;->x:F

    iput p4, p0, Lg41/b;->y:I

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

    iget-wide v0, p0, Lg41/b;->w:J

    iget v2, p0, Lg41/b;->x:F

    iget v3, p0, Lg41/b;->y:I

    invoke-static/range {v0 .. v5}, Lg41/d;->e(JFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
