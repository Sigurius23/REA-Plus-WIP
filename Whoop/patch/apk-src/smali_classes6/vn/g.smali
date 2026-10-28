.class public final Lvn/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwn/h;

.field public final b:J

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(Lwn/h;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn/g;->a:Lwn/h;

    iput-wide p2, p0, Lvn/g;->b:J

    iput p4, p0, Lvn/g;->c:I

    instance-of p2, p1, Lwn/e;

    if-eqz p2, :cond_0

    check-cast p1, Lwn/e;

    iget-boolean p1, p1, Lwn/e;->M:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lvn/g;->d:Z

    return-void
.end method
