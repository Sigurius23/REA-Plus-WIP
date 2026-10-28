.class public abstract Lq83/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/i;


# instance fields
.field public final w:Lkotlin/jvm/functions/Function1;

.field public final x:Lq83/i;


# direct methods
.method public constructor <init>(Lq83/i;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "baseKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq83/b;->w:Lkotlin/jvm/functions/Function1;

    instance-of p2, p1, Lq83/b;

    if-eqz p2, :cond_0

    check-cast p1, Lq83/b;

    iget-object p1, p1, Lq83/b;->x:Lq83/i;

    :cond_0
    iput-object p1, p0, Lq83/b;->x:Lq83/i;

    return-void
.end method
