.class public final Lhr/a;
.super Ls2/e;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Typeface;

.field public final b:Lcr/b;

.field public c:Z


# direct methods
.method public constructor <init>(Lcr/b;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lhr/a;->a:Landroid/graphics/Typeface;

    iput-object p1, p0, Lhr/a;->b:Lcr/b;

    return-void
.end method


# virtual methods
.method public final Q(I)V
    .locals 1

    iget-boolean p1, p0, Lhr/a;->c:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lhr/a;->b:Lcr/b;

    iget-object v0, p0, Lhr/a;->a:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Lcr/b;->a(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method

.method public final R(Landroid/graphics/Typeface;Z)V
    .locals 0

    iget-boolean p2, p0, Lhr/a;->c:Z

    if-nez p2, :cond_0

    iget-object p2, p0, Lhr/a;->b:Lcr/b;

    invoke-virtual {p2, p1}, Lcr/b;->a(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
