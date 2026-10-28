.class public final Lji/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lji/e;


# instance fields
.field public final w:Lhi/a;

.field public final x:Lfi/l;


# direct methods
.method public constructor <init>(Lhi/a;Lfi/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lji/c;->w:Lhi/a;

    iput-object p2, p0, Lji/c;->x:Lfi/l;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lji/c;->x:Lfi/l;

    instance-of v1, v0, Lfi/q;

    iget-object v2, p0, Lji/c;->w:Lhi/a;

    if-eqz v1, :cond_0

    check-cast v0, Lfi/q;

    iget-object v0, v0, Lfi/q;->a:Lrh/j;

    invoke-virtual {v2, v0}, Lhi/a;->b(Lrh/j;)V

    return-void

    :cond_0
    instance-of v1, v0, Lfi/d;

    if-eqz v1, :cond_1

    check-cast v0, Lfi/d;

    iget-object v0, v0, Lfi/d;->a:Lrh/j;

    invoke-virtual {v2, v0}, Lhi/a;->b(Lrh/j;)V

    return-void

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
