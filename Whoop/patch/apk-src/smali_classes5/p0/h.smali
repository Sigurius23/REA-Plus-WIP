.class public final Lp0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lp0/q;


# direct methods
.method public constructor <init>(IILp0/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lp0/h;->a:I

    iput p2, p0, Lp0/h;->b:I

    iput-object p3, p0, Lp0/h;->c:Lp0/q;

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "startIndex should be >= 0"

    invoke-static {p1}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_0
    if-lez p2, :cond_1

    return-void

    :cond_1
    const-string p1, "size should be > 0"

    invoke-static {p1}, Lk0/a;->a(Ljava/lang/String;)V

    return-void
.end method
