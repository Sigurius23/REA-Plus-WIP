.class public final synthetic Lvy0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(FI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lvy0/e0;->w:F

    iput p2, p0, Lvy0/e0;->x:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lvy0/e0;->w:F

    iget v1, p0, Lvy0/e0;->x:I

    invoke-static {v0, v1, p1, p2}, Lvy0/h0;->f(FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
