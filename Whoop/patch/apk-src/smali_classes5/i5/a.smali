.class public final Li5/a;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field public final w:I

.field public final x:Li5/f;

.field public final y:I


# direct methods
.method public constructor <init>(ILi5/f;I)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput p1, p0, Li5/a;->w:I

    iput-object p2, p0, Li5/a;->x:Li5/f;

    iput p3, p0, Li5/a;->y:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    iget v1, p0, Li5/a;->w:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget v0, p0, Li5/a;->y:I

    iget-object v1, p0, Li5/a;->x:Li5/f;

    iget-object v1, v1, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(ILandroid/os/Bundle;)Z

    return-void
.end method
