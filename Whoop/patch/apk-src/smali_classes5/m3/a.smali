.class public final synthetic Lm3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/Layout$TextInclusionStrategy;


# instance fields
.field public final synthetic a:Lkk1/b;


# direct methods
.method public synthetic constructor <init>(Lkk1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/a;->a:Lkk1/b;

    return-void
.end method


# virtual methods
.method public final isSegmentInside(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z
    .locals 1

    iget-object v0, p0, Lm3/a;->a:Lkk1/b;

    invoke-virtual {v0, p1, p2}, Lkk1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method
