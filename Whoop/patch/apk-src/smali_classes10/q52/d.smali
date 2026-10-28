.class public abstract Lq52/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq52/d$c;,
        Lq52/d$b;
    }
.end annotation


# static fields
.field public static final a:Lq52/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq52/d$b;

    invoke-direct {v0}, Lq52/d$b;-><init>()V

    sput-object v0, Lq52/d;->a:Lq52/d$c;

    return-void
.end method

.method public static a(Landroid/view/View;IIFFLq52/d$c;)V
    .locals 6

    new-instance v0, Lq52/d$a;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v1, p5

    invoke-direct/range {v0 .. v5}, Lq52/d$a;-><init>(Lq52/d$c;IIFF)V

    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method public static b(Landroid/view/View;IIFFLq52/d$c;)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-static/range {p0 .. p5}, Lq52/d;->a(Landroid/view/View;IIFFLq52/d$c;)V

    return-void
.end method
