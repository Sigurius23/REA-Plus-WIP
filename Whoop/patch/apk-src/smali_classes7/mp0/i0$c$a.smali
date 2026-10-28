.class final Lmp0/i0$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmp0/i0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Landroidx/lifecycle/q0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/q0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/q0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/q0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lmp0/i0$c$a;->w:Landroidx/lifecycle/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lmp0/c;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp0/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lmp0/i0$c$a;->w:Landroidx/lifecycle/q0;

    invoke-virtual {p1}, Lmp0/c;->b()Lmp0/b;

    move-result-object v1

    sget-object v2, Lmp0/b;->COLLAPSED_STATE_FLOW:Lmp0/b;

    if-eq v1, v2, :cond_1

    invoke-virtual {p1}, Lmp0/c;->b()Lmp0/b;

    move-result-object p1

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Landroidx/lifecycle/r0;

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/r0;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmp0/c;

    invoke-virtual {p0, p1, p2}, Lmp0/i0$c$a;->b(Lmp0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
