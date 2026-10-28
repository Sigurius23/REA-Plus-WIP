.class public final synthetic Lc31/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:I

.field public final synthetic w:Ly81/e;

.field public final synthetic x:Li2/t;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ly81/e;Li2/t;FFFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc31/o;->w:Ly81/e;

    iput-object p2, p0, Lc31/o;->x:Li2/t;

    iput p3, p0, Lc31/o;->y:F

    iput p4, p0, Lc31/o;->z:F

    iput p5, p0, Lc31/o;->E:F

    iput p6, p0, Lc31/o;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lc31/o;->w:Ly81/e;

    iget-object v1, p0, Lc31/o;->x:Li2/t;

    iget v2, p0, Lc31/o;->y:F

    iget v3, p0, Lc31/o;->z:F

    iget v4, p0, Lc31/o;->E:F

    iget v5, p0, Lc31/o;->F:I

    invoke-static/range {v0 .. v7}, Lc31/p;->a(Ly81/e;Li2/t;FFFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
