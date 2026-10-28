.class final Lvv1/a$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvv1/a$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lvv1/a;


# direct methods
.method public constructor <init>(Lvv1/a;)V
    .locals 0

    iput-object p1, p0, Lvv1/a$g$a;->w:Lvv1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p1, p0, Lvv1/a$g$a;->w:Lvv1/a;

    invoke-static {p1}, Lvv1/a;->b(Lvv1/a;)Lbc3/k1;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    invoke-virtual {p0, p1, p2}, Lvv1/a$g$a;->b(Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
