.class final Leg2/j$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leg2/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lh/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/i;"
        }
    .end annotation
.end field

.field final synthetic x:Lh/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/i;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh/i;Lh/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/i;",
            "Lh/i;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Leg2/j$a$a;->w:Lh/i;

    iput-object p2, p0, Leg2/j$a$a;->x:Lh/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lbg2/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbg2/e;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Lbg2/e$b;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iget-object p2, p0, Leg2/j$a$a;->w:Lh/i;

    check-cast p1, Lbg2/e$b;

    invoke-virtual {p1}, Lbg2/e$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lbg2/e$b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Leg2/j;->T(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p2, p1, v0}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lbg2/e$a;

    if-eqz p2, :cond_1

    iget-object p2, p0, Leg2/j$a$a;->x:Lh/i;

    check-cast p1, Lbg2/e$a;

    invoke-virtual {p1}, Lbg2/e$a;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Leg2/j;->U(Ljava/util/List;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p2, p1, v0}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbg2/e;

    invoke-virtual {p0, p1, p2}, Leg2/j$a$a;->b(Lbg2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
