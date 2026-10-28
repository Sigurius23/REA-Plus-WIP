.class public Lmm2/d$a;
.super Lor2/a2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmm2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lor2/a2;-><init>(Landroid/view/View;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lmm2/d$a;->a:Landroid/widget/TextView;

    return-void
.end method
