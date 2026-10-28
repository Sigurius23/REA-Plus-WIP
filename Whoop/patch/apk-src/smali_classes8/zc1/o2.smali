.class public final synthetic Lzc1/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:F

.field public final synthetic x:Li91/a;

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FLi91/a;ZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lzc1/o2;->w:F

    iput-object p2, p0, Lzc1/o2;->x:Li91/a;

    iput-boolean p3, p0, Lzc1/o2;->y:Z

    iput p4, p0, Lzc1/o2;->z:I

    iput p5, p0, Lzc1/o2;->E:I

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

    iget v0, p0, Lzc1/o2;->w:F

    iget-object v1, p0, Lzc1/o2;->x:Li91/a;

    iget-boolean v2, p0, Lzc1/o2;->y:Z

    iget v3, p0, Lzc1/o2;->z:I

    iget v4, p0, Lzc1/o2;->E:I

    invoke-static/range {v0 .. v6}, Lzc1/p2;->b(FLi91/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
