.class public final Lt3/e;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field public final w:Ll3/v;


# direct methods
.method public constructor <init>(Ll3/v;)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput-object p1, p0, Lt3/e;->w:Ll3/v;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lt3/e;->w:Ll3/v;

    invoke-virtual {p1}, Ll3/v;->a()Li20/z0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Li20/z0;->a(Ll3/v;)V

    :cond_0
    return-void
.end method
