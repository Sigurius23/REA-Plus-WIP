.class public final synthetic Lxq2/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(FLjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lxq2/y0;->w:F

    iput-object p2, p0, Lxq2/y0;->x:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v2, p1

    check-cast v2, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move-object v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Lxq2/y0;->w:F

    iget-object v1, p0, Lxq2/y0;->x:Ljava/util/List;

    invoke-static/range {v0 .. v5}, Lxq2/c1;->r(FLjava/util/List;Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
