.class public final Lhr/c;
.super Ls2/e;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Landroid/text/TextPaint;

.field public final synthetic c:Ls2/e;

.field public final synthetic d:Lhr/d;


# direct methods
.method public constructor <init>(Lhr/d;Landroid/content/Context;Landroid/text/TextPaint;Ls2/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhr/c;->d:Lhr/d;

    iput-object p2, p0, Lhr/c;->a:Landroid/content/Context;

    iput-object p3, p0, Lhr/c;->b:Landroid/text/TextPaint;

    iput-object p4, p0, Lhr/c;->c:Ls2/e;

    return-void
.end method


# virtual methods
.method public final Q(I)V
    .locals 1

    iget-object v0, p0, Lhr/c;->c:Ls2/e;

    invoke-virtual {v0, p1}, Ls2/e;->Q(I)V

    return-void
.end method

.method public final R(Landroid/graphics/Typeface;Z)V
    .locals 3

    iget-object v0, p0, Lhr/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lhr/c;->b:Landroid/text/TextPaint;

    iget-object v2, p0, Lhr/c;->d:Lhr/d;

    invoke-virtual {v2, v0, v1, p1}, Lhr/d;->g(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lhr/c;->c:Ls2/e;

    invoke-virtual {v0, p1, p2}, Ls2/e;->R(Landroid/graphics/Typeface;Z)V

    return-void
.end method
