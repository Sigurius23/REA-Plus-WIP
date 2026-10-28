.class public final synthetic Lbb2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lbb2/c;->w:I

    iput p2, p0, Lbb2/c;->x:I

    iput p3, p0, Lbb2/c;->y:I

    iput p4, p0, Lbb2/c;->z:I

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

    iget v0, p0, Lbb2/c;->w:I

    iget v1, p0, Lbb2/c;->x:I

    iget v2, p0, Lbb2/c;->y:I

    iget v3, p0, Lbb2/c;->z:I

    invoke-static/range {v0 .. v5}, Lbb2/f;->c(IIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
