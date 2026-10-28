.class public final Lc2/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Lc2/d;

.field public final synthetic x:I


# direct methods
.method public constructor <init>(Lc2/d;I)V
    .locals 0

    iput-object p1, p0, Lc2/b;->w:Lc2/d;

    iput p2, p0, Lc2/b;->x:I

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    iget-object v0, p0, Lc2/b;->w:Lc2/d;

    iget-object v1, v0, Lc2/d;->a:Lad3/z;

    iget-object v0, v0, Lc2/d;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, p1, p2, p3, p4}, Landroid/graphics/Rect;-><init>(IIII)V

    iget-object p1, v1, Lad3/z;->x:Ljava/lang/Object;

    check-cast p1, Landroid/view/autofill/AutofillManager;

    iget p2, p0, Lc2/b;->x:I

    invoke-virtual {p1, v0, p2, v2}, Landroid/view/autofill/AutofillManager;->notifyViewEntered(Landroid/view/View;ILandroid/graphics/Rect;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
