.class public final synthetic Lm12/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:F

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(FIZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p3, p0, Lm12/a;->w:Z

    iput p1, p0, Lm12/a;->x:F

    iput p2, p0, Lm12/a;->y:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v0, p0, Lm12/a;->w:Z

    iget v1, p0, Lm12/a;->x:F

    iget v2, p0, Lm12/a;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lm12/d;->r(ZFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
