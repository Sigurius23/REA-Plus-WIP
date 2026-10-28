.class public final Lbf3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:Laf3/y;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Laf3/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lbf3/d;->a:Ljava/lang/CharSequence;

    iput-object p2, p0, Lbf3/d;->b:Laf3/y;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "content must not be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(II)Lbf3/d;
    .locals 3

    iget-object v0, p0, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v1, p0, Lbf3/d;->b:Laf3/y;

    if-eqz v1, :cond_0

    iget v2, v1, Laf3/y;->b:I

    add-int/2addr v2, p1

    sub-int/2addr p2, p1

    if-eqz p2, :cond_0

    iget p1, v1, Laf3/y;->a:I

    new-instance v1, Laf3/y;

    invoke-direct {v1, p1, v2, p2}, Laf3/y;-><init>(III)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance p1, Lbf3/d;

    invoke-direct {p1, v0, v1}, Lbf3/d;-><init>(Ljava/lang/CharSequence;Laf3/y;)V

    return-object p1
.end method
