.class final Lcom/whoop/stealthmode/view/StealthModeFragment$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/stealthmode/view/StealthModeFragment$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Leb/u0;


# direct methods
.method public constructor <init>(Leb/u0;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/stealthmode/view/StealthModeFragment$a$a;->w:Leb/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/whoop/stealthmode/view/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/stealthmode/view/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lcom/whoop/stealthmode/view/a$a;->a:Lcom/whoop/stealthmode/view/a$a;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x6

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/stealthmode/view/StealthModeFragment$a$a;->w:Leb/u0;

    const-string p2, "EXIT"

    invoke-static {p1, p2, v1, v0}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/whoop/stealthmode/view/a$b;->a:Lcom/whoop/stealthmode/view/a$b;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/whoop/stealthmode/view/StealthModeFragment$a$a;->w:Leb/u0;

    const-string p2, "LEARN_MORE"

    invoke-static {p1, p2, v1, v0}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

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

    check-cast p1, Lcom/whoop/stealthmode/view/a;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/stealthmode/view/StealthModeFragment$a$a;->b(Lcom/whoop/stealthmode/view/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
