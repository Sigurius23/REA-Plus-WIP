.class public final synthetic Lw12/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:F

.field public final synthetic y:Lv12/c;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;FLv12/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw12/g;->w:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lw12/g;->x:F

    iput-object p3, p0, Lw12/g;->y:Lv12/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lw12/g;->w:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lw12/g;->x:F

    iget-object v2, p0, Lw12/g;->y:Lv12/c;

    invoke-static {v0, v1, v2, p1, p2}, Lw12/h;->b(Landroidx/compose/ui/Modifier;FLv12/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
