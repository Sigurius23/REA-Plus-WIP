.class public final Ldm1/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldm1/b;-><init>(Lj02/o0;Lgl1/b;Lu92/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lsr2/y;Lxm1/a;Ldp0/g;Lo02/d;Loz1/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lj02/c;)Lj02/c;
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lj02/m0$q1;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const-string v2, "home"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lj02/m0$q1;->c(Lj02/m0$q1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lj02/m0$q1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj02/c;

    invoke-virtual {p0, p1}, Ldm1/b$b;->a(Lj02/c;)Lj02/c;

    move-result-object p1

    return-object p1
.end method
