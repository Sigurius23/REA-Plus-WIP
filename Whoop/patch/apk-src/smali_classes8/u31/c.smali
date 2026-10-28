.class public final synthetic Lu31/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Lb91/a;

.field public final synthetic w:Lq0/y;

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:F

.field public final synthetic z:Lbc3/c0;


# direct methods
.method public synthetic constructor <init>(Lq0/y;Ljava/util/List;FLbc3/c0;FLb91/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu31/c;->w:Lq0/y;

    iput-object p2, p0, Lu31/c;->x:Ljava/util/List;

    iput p3, p0, Lu31/c;->y:F

    iput-object p4, p0, Lu31/c;->z:Lbc3/c0;

    iput p5, p0, Lu31/c;->E:F

    iput-object p6, p0, Lu31/c;->F:Lb91/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v6, p1

    check-cast v6, Lq0/r;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move-object v8, p3

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Lu31/c;->w:Lq0/y;

    iget-object v1, p0, Lu31/c;->x:Ljava/util/List;

    iget v2, p0, Lu31/c;->y:F

    iget-object v3, p0, Lu31/c;->z:Lbc3/c0;

    iget v4, p0, Lu31/c;->E:F

    iget-object v5, p0, Lu31/c;->F:Lb91/a;

    invoke-static/range {v0 .. v9}, Lu31/e;->b(Lq0/y;Ljava/util/List;FLbc3/c0;FLb91/a;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
