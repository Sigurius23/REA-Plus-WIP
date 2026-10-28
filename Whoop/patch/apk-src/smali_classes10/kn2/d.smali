.class public final synthetic Lkn2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic w:Lcom/whoop/ui/views/TooltipView;

.field public final synthetic x:Landroid/view/View;

.field public final synthetic y:Landroid/widget/PopupWindow;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/ui/views/TooltipView;Landroid/view/View;Landroid/widget/PopupWindow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkn2/d;->w:Lcom/whoop/ui/views/TooltipView;

    iput-object p2, p0, Lkn2/d;->x:Landroid/view/View;

    iput-object p3, p0, Lkn2/d;->y:Landroid/widget/PopupWindow;

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 12

    iget-object v1, p0, Lkn2/d;->x:Landroid/view/View;

    iget-object v2, p0, Lkn2/d;->y:Landroid/widget/PopupWindow;

    iget-object v0, p0, Lkn2/d;->w:Lcom/whoop/ui/views/TooltipView;

    move-object v3, p1

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    invoke-static/range {v0 .. v11}, Lcom/whoop/ui/views/TooltipView;->b(Lcom/whoop/ui/views/TooltipView;Landroid/view/View;Landroid/widget/PopupWindow;Landroid/view/View;IIIIIIII)V

    return-void
.end method
