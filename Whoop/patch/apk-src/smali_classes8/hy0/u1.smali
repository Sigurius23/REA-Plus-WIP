.class public final synthetic Lhy0/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:Lhy0/a2;

.field public final synthetic x:Li2/a1;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lhy0/a2;Li2/a1;FFFII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/u1;->w:Lhy0/a2;

    iput-object p2, p0, Lhy0/u1;->x:Li2/a1;

    iput p3, p0, Lhy0/u1;->y:F

    iput p4, p0, Lhy0/u1;->z:F

    iput p5, p0, Lhy0/u1;->E:F

    iput p6, p0, Lhy0/u1;->F:I

    iput p7, p0, Lhy0/u1;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lhy0/u1;->w:Lhy0/a2;

    iget-object v1, p0, Lhy0/u1;->x:Li2/a1;

    iget v2, p0, Lhy0/u1;->y:F

    iget v3, p0, Lhy0/u1;->z:F

    iget v4, p0, Lhy0/u1;->E:F

    iget v5, p0, Lhy0/u1;->F:I

    iget v6, p0, Lhy0/u1;->G:I

    invoke-static/range {v0 .. v8}, Lhy0/v1;->a(Lhy0/a2;Li2/a1;FFFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
