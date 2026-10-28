.class final Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lse0/b;


# direct methods
.method public constructor <init>(Lse0/b;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment$a$a;->w:Lse0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lse0/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lse0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment$a$a;->w:Lse0/b;

    invoke-virtual {p2, p1}, Lse0/b;->b(Lse0/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lse0/a;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment$a$a;->b(Lse0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
