.class final Lcx1/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcx1/b;->a(Lec3/l;Lec3/l;Lec3/l;Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lex1/b;",
        "managementResult",
        "Lfx1/b;",
        "adjustmentCheckoutResult",
        "Ldx1/b;",
        "manageMembershipResult",
        "Lbx1/b;",
        "checkoutResult",
        "Lcx1/a;",
        "<anonymous>",
        "(Lex1/b;Lfx1/b;Ldx1/b;Lbx1/b;)Lcx1/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.membership.management.domain.interactors.combiner.MembershipManagementResultCombiner$combine$1"
    f = "MembershipManagementResultCombiner.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcx1/b$a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x5

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lex1/b;Lfx1/b;Ldx1/b;Lbx1/b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lex1/b;",
            "Lfx1/b;",
            "Ldx1/b;",
            "Lbx1/b;",
            "Lq83/d<",
            "-",
            "Lcx1/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcx1/b$a;

    invoke-direct {v0, p5}, Lcx1/b$a;-><init>(Lq83/d;)V

    iput-object p1, v0, Lcx1/b$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcx1/b$a;->y:Ljava/lang/Object;

    iput-object p3, v0, Lcx1/b$a;->z:Ljava/lang/Object;

    iput-object p4, v0, Lcx1/b$a;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcx1/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lex1/b;

    check-cast p2, Lfx1/b;

    check-cast p3, Ldx1/b;

    check-cast p4, Lbx1/b;

    check-cast p5, Lq83/d;

    invoke-virtual/range {p0 .. p5}, Lcx1/b$a;->f(Lex1/b;Lfx1/b;Ldx1/b;Lbx1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcx1/b$a;->x:Ljava/lang/Object;

    check-cast v0, Lex1/b;

    iget-object v1, p0, Lcx1/b$a;->y:Ljava/lang/Object;

    check-cast v1, Lfx1/b;

    iget-object v2, p0, Lcx1/b$a;->z:Ljava/lang/Object;

    check-cast v2, Ldx1/b;

    iget-object v3, p0, Lcx1/b$a;->E:Ljava/lang/Object;

    check-cast v3, Lbx1/b;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lcx1/b$a;->w:I

    if-nez v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcx1/a;

    invoke-direct {p1, v0, v1, v2, v3}, Lcx1/a;-><init>(Lex1/b;Lfx1/b;Ldx1/b;Lbx1/b;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
