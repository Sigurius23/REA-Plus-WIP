.class final Lnq0/i$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnq0/i$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lnq0/i;


# direct methods
.method public constructor <init>(Lnq0/i;)V
    .locals 0

    iput-object p1, p0, Lnq0/i$c$a;->w:Lnq0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lqe1/c;Lq83/d;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqe1/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iget-object v2, v1, Lnq0/i$c$a;->w:Lnq0/i;

    invoke-static {v2}, Lnq0/i;->S(Lnq0/i;)Lnq0/j;

    move-result-object v3

    instance-of v4, v0, Lqe1/c$b;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v0, Lqe1/c$b;

    goto :goto_0

    :cond_0
    move-object v0, v5

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lqe1/c$b;->a()Lh51/f;

    move-result-object v5

    :cond_1
    move-object v14, v5

    const/16 v17, 0x1bff

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v3 .. v18}, Lnq0/j;->b(Lnq0/j;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZZLcom/whoop/domain/model/teams/MemberStory;Lh51/f;Lqv1/g;Lc41/w1;ILjava/lang/Object;)Lnq0/j;

    move-result-object v0

    invoke-static {v2, v0}, Lnq0/i;->b0(Lnq0/i;Lnq0/j;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqe1/c;

    invoke-virtual {p0, p1, p2}, Lnq0/i$c$a;->b(Lqe1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
