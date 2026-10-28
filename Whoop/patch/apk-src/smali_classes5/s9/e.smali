.class public final Ls9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls9/d;

.field public final b:Ls9/d;

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(Ls9/d;Ls9/d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls9/e;->a:Ls9/d;

    iput-object p2, p0, Ls9/e;->b:Ls9/d;

    iput p3, p0, Ls9/e;->c:I

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ls9/e;->d:Z

    return-void
.end method
