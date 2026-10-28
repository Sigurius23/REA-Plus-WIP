.class final Lhc2/j$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhc2/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lhc2/j;


# direct methods
.method public constructor <init>(Lhc2/j;)V
    .locals 0

    iput-object p1, p0, Lhc2/j$a$b;->w:Lhc2/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Loa2/d;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loa2/d;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lhc2/j$a$b;->w:Lhc2/j;

    invoke-static {v1}, Lhc2/j;->M(Lhc2/j;)Landroidx/lifecycle/t0;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lhc2/k;

    if-eqz v2, :cond_0

    const/16 v15, 0xfdf

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v2 .. v16}, Lhc2/k;->b(Lhc2/k;Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;Lcom/whoop/data/remote/domain/response/growth/AffiliateType;ZLcom/whoop/data/remote/domain/response/growth/TrialDetails;Loa2/d;Lhc2/b;ZLy71/o;Ly71/o;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lhc2/k;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    new-instance v2, Lhc2/k;

    const/16 v15, 0xfde

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v8, p1

    invoke-direct/range {v2 .. v16}, Lhc2/k;-><init>(Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;Lcom/whoop/data/remote/domain/response/growth/AffiliateType;ZLcom/whoop/data/remote/domain/response/growth/TrialDetails;Loa2/d;Lhc2/b;ZLy71/o;Ly71/o;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v2

    :cond_1
    iget-object v2, v0, Lhc2/j$a$b;->w:Lhc2/j;

    invoke-static {v2}, Lhc2/j;->M(Lhc2/j;)Landroidx/lifecycle/t0;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Loa2/d;

    invoke-virtual {p0, p1, p2}, Lhc2/j$a$b;->b(Loa2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
