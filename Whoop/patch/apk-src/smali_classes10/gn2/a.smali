.class public Lgn2/a;
.super Landroid/graphics/drawable/ShapeDrawable;
.source "SourceFile"


# instance fields
.field private a:Lgn2/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/graphics/drawable/ShapeDrawable;-><init>()V

    new-instance v0, Lgn2/b;

    invoke-direct {v0}, Lgn2/b;-><init>()V

    iput-object v0, p0, Lgn2/a;->a:Lgn2/b;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lgn2/a;->a(I)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lgn2/a;->a:Lgn2/b;

    invoke-virtual {v0, p1}, Lgn2/b;->a(I)Landroid/graphics/drawable/shapes/Shape;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/ShapeDrawable;->setShape(Landroid/graphics/drawable/shapes/Shape;)V

    return-void
.end method

.method public b(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method
