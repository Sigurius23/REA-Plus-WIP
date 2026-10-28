.class public abstract Lwb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/c;


# instance fields
.field public final w:Lub/a;

.field public final x:Ljava/lang/String;

.field public y:Z


# direct methods
.method public constructor <init>(Lub/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/f;->w:Lub/a;

    iput-object p2, p0, Lwb/f;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-boolean v0, p0, Lwb/f;->y:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x15

    const-string v1, "statement is closed"

    invoke-static {v0, v1}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public reset()V
    .locals 0

    invoke-virtual {p0}, Lwb/f;->b()V

    return-void
.end method

.method public w()V
    .locals 0

    invoke-virtual {p0}, Lwb/f;->b()V

    return-void
.end method
