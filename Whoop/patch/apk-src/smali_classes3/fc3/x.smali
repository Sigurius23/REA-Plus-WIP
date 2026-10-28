.class public final Lfc3/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/d;
.implements Ls83/d;


# instance fields
.field public final w:Lq83/d;

.field public final x:Lq83/j;


# direct methods
.method public constructor <init>(Lq83/j;Lq83/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lfc3/x;->w:Lq83/d;

    iput-object p1, p0, Lfc3/x;->x:Lq83/j;

    return-void
.end method


# virtual methods
.method public final getCallerFrame()Ls83/d;
    .locals 2

    iget-object v0, p0, Lfc3/x;->w:Lq83/d;

    instance-of v1, v0, Ls83/d;

    if-eqz v1, :cond_0

    check-cast v0, Ls83/d;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lfc3/x;->x:Lq83/j;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lfc3/x;->w:Lq83/d;

    invoke-interface {v0, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
