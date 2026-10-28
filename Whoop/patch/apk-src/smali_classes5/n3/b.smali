.class public final Ln3/b;
.super Luf/c0;
.source "SourceFile"


# instance fields
.field public final x:Ljava/lang/CharSequence;

.field public final y:Landroid/text/TextPaint;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/b;->x:Ljava/lang/CharSequence;

    iput-object p2, p0, Ln3/b;->y:Landroid/text/TextPaint;

    return-void
.end method


# virtual methods
.method public final d0(I)I
    .locals 7

    iget-object v1, p0, Ln3/b;->x:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x0

    const/4 v6, 0x0

    iget-object v0, p0, Ln3/b;->y:Landroid/text/TextPaint;

    const/4 v2, 0x0

    move v5, p1

    invoke-virtual/range {v0 .. v6}, Landroid/text/TextPaint;->getTextRunCursor(Ljava/lang/CharSequence;IIZII)I

    move-result p1

    return p1
.end method

.method public final g0(I)I
    .locals 7

    iget-object v1, p0, Ln3/b;->x:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x0

    const/4 v6, 0x2

    iget-object v0, p0, Ln3/b;->y:Landroid/text/TextPaint;

    const/4 v2, 0x0

    move v5, p1

    invoke-virtual/range {v0 .. v6}, Landroid/text/TextPaint;->getTextRunCursor(Ljava/lang/CharSequence;IIZII)I

    move-result p1

    return p1
.end method
